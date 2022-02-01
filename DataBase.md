## 📝 데이터베이스 연동 기록

----
1. docker desktop을 다운받는다.    
   
2. (At Terminal) 백엔드 프로젝트가 있는 경로에서 아래 명령어들을 순차적으로 실행시켜 
   docker를 구동한다.   
: 괄호는 M1칩 기준, M1칩이 아니라면 --platform 옵션은 필요 없음

⓵
```dockerfile
docker pull mysql (--platform linux/amd64) 
```

⓶

```dockerfile
docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=비밀번호 (--platform linux/amd64) --name side-project mysql
```   
- 비밀번호의 경우 개인톡으로 질문!

--- 
### 이 파트는 초기 세팅에서 따라할 필요 X 
다만 추후 데이터 넣을 때 사용할 수 있으니 참고만 하기

3. 실행시킨 다음 docker 내부로 진입한다!
```dockerfile
docker exec -it side-project /bin/bash
```

> Enter Password
4. 위 멘트가 나오면 2-⓶에서 사용한 비밀번호를 입력해준다. 
5. 그 후 DB CRUD 쿼리를 자유롭게 날린다!

---

### 다시 따라하기
: IntelliJ 기준으로 진행

3. 인텔리제이를 키고, 우측의 Database 탭을 누른다. 


4. Database 탭의 상단 좌측 (+)를 누른다.     


5. DataSource > Maria DB를 누른다.     


6. Host에 side-project.cbh3ou7opo5s.ap-northeast-2.rds.amazonaws.com 를 입력한다.    


7. User에 admin, password는 개인톡으로 물어본 내용을 입력한다.     


8. test connection으로 한 번 연결되었는지 테스트 후, apply를 누르면 끝!     

---
