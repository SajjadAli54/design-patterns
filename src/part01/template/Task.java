package part01.template;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        this(new AuditTrail());

    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
