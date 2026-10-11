/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends em {
    int field_H;
    static ea field_E;
    static String field_I;
    uh field_D;
    byte[] field_F;
    static volatile int field_G;

    final byte[] c(byte param0) {
        if (this.field_C) {
          throw new RuntimeException();
        }
        if (param0 != -115) {
          return (byte[]) null;
        }
        return this.field_F;
    }

    final static boolean a(pe param0, pe param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        pe var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          var3_int = param0.field_tb - param1.field_tb;
          if (param2 > -66) {
            var5 = (pe) null;
            vl.a((pe) null, (pe) null, 95);
          }
          if (param0.field_nb == bd.field_j) {
            var3_int -= 200;
          } else {
            if (param0.field_nb == null) {
              var3_int += 200;
            }
          }
          if (bd.field_j != param1.field_nb) {
            if (null == param1.field_nb) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("vl.F(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void h(int param0) {
        gd.field_B = false;
        wc.field_b = false;
        oj.a(param0, 3);
        ic.field_l = mc.field_t;
        bd.field_h = mc.field_t;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
          return;
        }
        nm.field_e = param4;
        vd.field_z = param0;
        he.field_a = param1;
        nk.field_u = param3;
    }

    vl() {
    }

    final int f(int param0) {
        if (param0 != 100) {
          field_G = -118;
          if (this.field_C) {
            return 0;
          }
          return 100;
        }
        if (this.field_C) {
          return 0;
        }
        return 100;
    }

    public static void i(int param0) {
        field_I = null;
        field_E = null;
        int var1 = -60 / ((52 - param0) / 61);
    }

    static {
        field_I = "Use this alternative as your account name";
        field_G = 0;
    }
}
