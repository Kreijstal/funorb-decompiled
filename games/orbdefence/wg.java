/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends hi {
    static boolean field_o;
    static int field_q;
    static String field_n;
    static int field_p;

    wg(vi param0) {
        super(param0);
    }

    final static void a(int param0, byte param1) {
        nc.field_Z = tb.field_b[param0];
        if (param1 <= -100) {
          de.field_b = jk.field_r[param0];
          mi.field_e = cc.field_h[param0];
          return;
        }
        field_p = 109;
        de.field_b = jk.field_r[param0];
        mi.field_e = cc.field_h[param0];
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -11300) {
            field_o = true;
          }
          if (this.a(param1, (byte) -99) != vh.field_h) {
            stackIn_6_0 = wb.field_c;
            return stackIn_6_0;
          }
          stackIn_4_0 = vg.field_j;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final qd a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        qd stackIn_5_0 = null;
        qd stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != uk.a(false, param0)) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (var3_int == 0) {
            stackIn_5_0 = vh.field_h;
            return stackIn_5_0;
          }
          if (param1 != -99) {
            field_p = 62;
          }
          stackIn_9_0 = nc.field_bb;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wg.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ba a(int param0, int param1) {
        ba[] var2;
        int var3;
        int var4;
        ba[] var5;
        int var3Lifetime1;
        var4 = OrbDefence.field_D ? 1 : 0;
        var5 = jl.a((byte) 60);
        var2 = var5;
        for (var3 = 0; var5.length > var3; var3++) {
          if (var5[var3].field_d == param0) {
            return var5[var3];
          }
        }
        var3Lifetime1 = -127 / ((-71 - param1) / 52);
        return null;
    }

    public static void j(int param0) {
        if (param0 != -24392) {
          field_q = -50;
          field_n = null;
          return;
        }
        field_n = null;
    }

    static {
        field_q = 5;
        field_n = "Blocks Norbs";
        field_p = 0;
    }
}
