/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends df {
    ln field_r;
    ln field_q;
    int field_o;
    fs field_p;

    qm(int param0, fs param1, ln param2) {
        try {
            this.field_o = param0;
            this.field_r = null;
            this.field_q = param2;
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    qm(int param0, fs param1, ln param2, ln param3) {
        try {
            this.field_p = param1;
            this.field_r = param3;
            this.field_o = param0;
            this.field_q = param2;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
