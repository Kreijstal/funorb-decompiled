/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static boolean field_c;
    static boolean field_d;
    static String field_b;
    static boolean field_a;

    final static boolean a(bf param0, boolean param1, String param2, int param3, String param4, boolean param5, String param6) {
        RuntimeException var7 = null;
        qc var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (dn.field_q != vn.field_g) {
            return false;
          }
          var8 = new qc(bo.field_F, param0);
          bo.field_F.b(var8, 48);
          if (!ei.d(1000)) {
            gf.field_a = param3;
            hf.field_a = param5;
            nf.field_y = null;
            mf.field_b = param4;
            dn.field_q = dg.field_o;
            tf.field_h = param6;
            kl.field_o = param2;
          } else {
            var8.s(248);
          }
          if (!param1) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("e.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 32153) {
          field_a = false;
        }
    }

    final static lm a(int param0) {
        if (param0 != -16055) {
          e.b(108);
          if (dn.field_q == vn.field_g) {
            throw new IllegalStateException();
          }
          if (ia.field_y == dn.field_q) {
            dn.field_q = vn.field_g;
            return nf.field_y;
          }
          return null;
        }
        if (dn.field_q == vn.field_g) {
          throw new IllegalStateException();
        }
        if (ia.field_y == dn.field_q) {
          dn.field_q = vn.field_g;
          return nf.field_y;
        }
        return null;
    }

    static {
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_d = true;
    }
}
