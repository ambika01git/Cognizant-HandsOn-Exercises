# Git HandsOn-1

## Objective

Learn the basic Git commands and repository setup.

## Tasks Performed

- Installed Git for Windows.
- Verified Git installation using `git --version`.
- Configured Git username and email.
- Verified Git configuration.
- Initialized a local Git repository.
- Created a text file named `welcome.txt`.
- Checked repository status.
- Added the file to the staging area.
- Committed the file to the local repository.

## Git Commands Used

```bash
git --version
git config --global user.name "Ambika Mishra"
git config --global user.email "ambikamishra2345@gmail.com"
git config --global --list
git init GitDemo
cd GitDemo
echo "Welcome to the version control" > welcome.txt
cat welcome.txt
git status
git add welcome.txt
git commit -m "Added welcome file"
git status
```

## Output

- Git installed successfully.
- Repository initialized.
- `welcome.txt` created successfully.
- File committed successfully.
- Working tree is clean.

## Files Included

- welcome.txt
