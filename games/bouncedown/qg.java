/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends ai {
    int field_i;
    static mf field_g;
    int field_h;

    public static void b(byte param0) {
        field_g = null;
        if (param0 != 57) {
          field_g = (mf) null;
        }
    }

    final static int a(int param0, int param1) {
        int var3 = Bounce.field_N;
        ih.field_X = 0;
        if (param0 != -23888) {
          field_g = (mf) null;
        }
        md.field_q = null;
        mf.field_a = null;
        int var2 = a.field_a;
        a.field_a = fk.field_d;
        tb.field_p.field_l = tb.field_p.field_l + 1;
        if (param1 == 51) {
          tb.field_p.field_d = 2;
        } else {
          if (param1 == 50) {
            tb.field_p.field_d = 5;
          } else {
            tb.field_p.field_d = 1;
          }
        }
        fk.field_d = var2;
        if (tb.field_p.field_l >= 2 &&
          51 == param1) {
          return 2;
        }
        if (tb.field_p.field_l >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (!(tb.field_p.field_l < 4)) {
          return 1;
        }
        return -1;
    }

    final static byte[] a(boolean param0, byte[] param1, int param2, ii param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Bounce.field_N;
        try {
          if (!param0) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          var4_int = param3.f(7, param2);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new byte[var4_int];
          }
          var5 = param3.f(7, 3);
          var6 = (byte)param3.f(7, 8);
          if (var5 > 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)(param3.f(7, var5) + var6);
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)var6;
            }
          }
          stackIn_19_0 = (byte[]) (param1);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("qg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private qg() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new mf();
    }
}
