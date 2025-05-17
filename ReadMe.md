# Submodule
## Init submodule
After clone store-backend-project
```shell
git submodule init
git submodule update
```
## Update Submodule
**Summary of the Workflow:**

STEP 1 
```shell
cd models
git pull origin master
```
STEP 2
```shell
cd ..
```
STEP 3
```shell
git add models
git commit -m "Update submodule"
git push origin
```
