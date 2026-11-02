/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qgb extends IntrusiveNode {
    kla field_d;
    GraphicsToolkit field_e;

    qgb(GraphicsToolkit param0, kla param1) {
        try {
          this.field_e = param0;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qgb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
