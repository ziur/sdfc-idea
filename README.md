# Hyde

The website is based on Jekyll (http://jekyllrb.com/docs/quickstart/), if you want to run the website it is required ruby, and I would like to suggest a linux environment.
* Install rvm (https://rvm.io/)
  gpg --keyserver hkp://keys.gnupg.net --recv-keys 409B6B1796C275462A1703113804BB82D39DC0E3
  \curl -sSL https://get.rvm.io | bash -s stable
  source ~/.rvm/scripts/rvm
* Install ruby
  rvm install ruby
  rvm use ruby
* Install Jekyll gem
  gem install Jekyll
* Start Jekyll server
  Go to website repository folder
  Execute: jekyll serve -w
  Open the url: http://localhost:4000 on a browser
* Start changing the .md files, and refresh the browser in order to see changes
