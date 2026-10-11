/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static String field_f;
    static lf field_g;
    static int field_c;
    static String field_b;
    static String field_a;
    static long field_d;
    static w field_e;

    final static void a(java.awt.Canvas param0, boolean param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          if (ca.field_vb >= 10) {
            if (!dl.a(480)) {
              hk.b();
              qc.a(240, 320, param2 ^ -21986);
              mf.a(1, 0, 0, param0);
            } else {
              if (hc.field_d != 0) {
                cn.a(true, param0);
              } else {
                uc.a(false, param1, 78);
                mf.a(1, 0, 0, param0);
              }
            }
          } else {
            var3_int = 0;
            if (cd.field_g) {
              var3_int = 1;
              cd.field_g = false;
            }
            bf.a(cn.b(true), var3_int != 0, 6, cf.a(-11777), fb.field_g);
          }
          if (param2 == -6351) {
            return;
          }
          jf.a(-78);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("jf.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        int var1 = -128 % ((param0 + 47) / 61);
        field_b = null;
        field_g = null;
        field_a = null;
    }

    static {
        field_f = "Your game";
        field_a = "Invite more players, or alternatively try changing the following settings:  ";
        field_b = "<%0> might change the options - wait and see.";
        field_c = 0;
        field_g = new lf();
    }
}
