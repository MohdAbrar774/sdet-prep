# **Git & GitHub Command Sheet** {#git-github-command-sheet}

## **1. Setup & Configuration** {#setup-configuration}

- git config \--global user.name \"Your Name\" → Set your Git username

- git config \--global user.email \"you@example.com\" → Set your Git
  > email

- git config \--list → Show all Git configurations

## **2. Starting a Repository** {#starting-a-repository}

- git init → Initialize a new Git repository

- git clone \<repo-url\> → Clone a remote repository

## **3. Basic Snapshotting** {#basic-snapshotting}

- git status → Check status of changes

- git add \<file\> → Stage a file

- git add . → Stage all changes

- git commit -m \"Commit message\" → Commit staged changes

- git log → View commit history

- git log \--oneline \--graph \--decorate \--all → Visualize history

- git diff → See unstaged changes

- git diff \--staged → See staged changes

## **4. Branching & Merging** {#branching-merging}

- git branch → List branches

- git branch \<branch-name\> → Create new branch

- git checkout \<branch-name\> → Switch to a branch

- git switch \<branch-name\> → Alternative to checkout (newer)

- git merge \<branch-name\> → Merge a branch into current branch

- git branch -d \<branch-name\> → Delete a branch

## **5. Working with Remote Repos** {#working-with-remote-repos}

- git remote -v → Show remotes

- git remote add origin \<url\> → Add a new remote

- git push origin \<branch\> → Push branch to remote

- git pull origin \<branch\> → Pull updates from remote

- git fetch → Download changes without merging

## **6. Undoing & Resetting** {#undoing-resetting}

- git restore \<file\> → Discard local changes (unstaged)

- git reset HEAD \<file\> → Unstage a file

- git reset \--hard → Reset all changes to last commit

- git revert \<commit-id\> → Create a new commit that reverts changes

## **7. Stashing** {#stashing}

- git stash → Save changes temporarily

- git stash apply → Reapply stashed changes

- git stash list → List stashes

- git stash drop → Remove a stash

## **8. Collaboration** {#collaboration}

- **Forking (GitHub UI)** → Copy someone's repo

- git clone \<fork-url\> → Clone your fork

- git checkout -b \<branch\> → Create a new feature branch

- git push origin \<branch\> → Push changes to your fork

- Open Pull Request (PR) on GitHub

## **9. Advanced Git Commands** {#advanced-git-commands}

### **Rebasing & History** {#rebasing-history}

- git rebase \<branch\> → Reapply commits on top of another branch

- git rebase -i HEAD\~n → Interactive rebase (edit/squash commits)

- git reflog → Show history of HEAD movements

### **Cherry-Picking**

- git cherry-pick \<commit-id\> → Apply a specific commit from another
  > branch

### **Tags**

- git tag → List tags

- git tag \<tag-name\> → Create a new tag

- git push origin \<tag-name\> → Push a tag to remote

### **Submodules**

- git submodule add \<repo-url\> → Add a submodule

- git submodule update \--init \--recursive → Initialize/update
  > submodules

### **Cleaning**

- git clean -n → Preview files to be removed

- git clean -f → Remove untracked files

## 

## 

## **📌 Best YouTube Channels to Learn Git** {#best-youtube-channels-to-learn-git}

*  
*

<table>
<colgroup>
<col style="width: 50%" />
<col style="width: 50%" />
</colgroup>
<thead>
<tr class="header">
<th><ol type="1">
<li><blockquote>
<p>Chai aur Code</p>
</blockquote></li>
</ol></th>
<th><a
href="https://youtu.be/q8EevlEpQ2A?si=utk6GigH7xFrS10X"><u>Link</u></a></th>
</tr>
<tr class="odd">
<th><ol start="2" type="1">
<li><blockquote>
<p>Kunal Kushwaha</p>
</blockquote></li>
</ol></th>
<th><a
href="https://youtu.be/apGV9Kg7ics?si=eG_e8exfzsUqJoEv"><u>Link</u></a></th>
</tr>
<tr class="header">
<th><ol start="3" type="1">
<li><blockquote>
<p>Apna College</p>
</blockquote></li>
</ol></th>
<th><a
href="https://youtu.be/Ez8F0nW6S-w?si=Ex4rIxbTtlFVweCQ"><u>Link</u></a></th>
</tr>
<tr class="odd">
<th><ol start="4" type="1">
<li><blockquote>
<p>Shreyians Coding</p>
</blockquote></li>
</ol></th>
<th><a
href="https://www.youtube.com/watch?v=r8QQOAicu8Y"><u>Link</u></a></th>
</tr>
<tr class="header">
<th><ol start="5" type="1">
<li><blockquote>
<p>Telusko</p>
</blockquote></li>
</ol></th>
<th><a
href="https://youtu.be/vwj89i2FmG0?si=mVR7RkriYw_7Jz3U"><u>Link</u></a></th>
</tr>
</thead>
<tbody>
</tbody>
</table>
