/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends ms {
    byte[] field_k;
    static int field_l;
    int field_m;

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var3 = (java.awt.Canvas) null;
            db.a(true, (java.awt.Canvas) null);
          }
          lq.a(0, (java.awt.Component) ((Object) param1));
          gs.a((java.awt.Component) ((Object) param1), true);
          if (null == as.field_w) {
            return;
          }
          as.field_w.a(true, (java.awt.Component) ((Object) param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("db.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    db(byte[] param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
