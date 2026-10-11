/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sha extends pu {
    static vr field_l;
    static int field_m;

    final static void a(vr param0, boolean param1) {
        kv var2 = new kv(param0.a((byte) 123, "", "final_frame.jpg"), (java.awt.Component) ((Object) dca.field_y));
        int var3 = var2.field_q;
        int var4 = var2.field_p;
        if (param1) {
          return;
        }
        try {
          uc.d(76);
          nd.field_g = new kv(var3, 3 * var4 / 4);
          nd.field_g.b();
          var2.c(0, 0);
          lt.field_a = new kv(var3, var4 - nd.field_g.field_p);
          lt.field_a.b();
          var2.c(0, -nd.field_g.field_p);
          lt.field_a.field_u = nd.field_g.field_p;
          db.b(99);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "sha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!lna.field_q) {
            return false;
          }
          if (param0 != -24) {
            field_l = (vr) null;
          }
          if (gk.field_d == 2 &&
            df.field_s != null) {
            var3 = (CharSequence) ((Object) param1);
            if (df.field_s.equals(fq.a(param0 + 24, var3))) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("sha.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 3) {
          return;
        }
        field_l = null;
    }

    static {
    }
}
