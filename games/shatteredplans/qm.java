/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends DualLinkNode {
    Star field_r;
    Star field_q;
    int field_o;
    Player field_p;

    qm(int param0, Player param1, Star param2) {
        try {
          this.field_o = param0;
          this.field_r = null;
          this.field_q = param2;
          this.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    qm(int param0, Player param1, Star param2, Star param3) {
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
