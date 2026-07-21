# Git HandsOn-3

## Objective

Learn Git branching and merging operations.

## Tasks Performed

- Created a new branch `GitNewBranch`.
- Listed all local branches.
- Switched to the new branch.
- Created a file named `branch.txt`.
- Added and committed the file.
- Switched back to the master branch.
- Compared the master branch with `GitNewBranch`.
- Merged `GitNewBranch` into the master branch.
- Viewed the commit history using `git log --oneline --graph --decorate`.
- Deleted the merged branch.
- Verified the repository status.

## Git Commands Used

```bash
git branch GitNewBranch
git branch -a
git checkout GitNewBranch
git status
git add branch.txt
git commit -m "Added branch file"
git checkout master
git diff master GitNewBranch
git merge GitNewBranch
git log --oneline --graph --decorate
git branch -d GitNewBranch
git status
```

## Files Included

- branch.txt

## Result

Successfully created, merged, and deleted a Git branch. The repository status was clean after merging.
