# istio-bookinfo


## What Is Argo CD?
Argo CD is a declarative, GitOps continuous delivery tool for Kubernetes.

## Why Argo CD?
Application definitions, configurations, and environments should be declarative and version controlled. Application deployment and lifecycle management should be automated, auditable, and easy to understand.

# Installation
## Login to any cluster node and executed the below commands
```
git clone https:///xxxx
cd xxxx/overlays/xxx
kubectl create ns argocd
kubectl -n argocd apply -k .
kubectl -n argocd apply -k .
```
