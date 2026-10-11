/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends hd {
    int field_Cb;
    hd field_Ab;
    String field_Gb;
    String field_yb;
    hd field_Bb;
    String field_zb;
    String field_Eb;
    static int field_Db;
    hd field_Fb;

    final static void a(int param0, int param1, tj param2) {
        int[] stackIn_3_0;
        int stackIn_3_1;
        int[] stackIn_3_2;
        int stackIn_3_3;
        int stackIn_4_4 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var5Lifetime3;
        var8 = Kickabout.field_G;
        try {
          kk.field_B[1] = 525;
          kk.field_B[0] = 370;
          stackIn_3_0 = or.field_a;
          stackIn_3_1 = 0;
          stackIn_3_2 = or.field_a;
          stackIn_3_3 = 1;
          if (param0 != 1) {
            stackIn_4_4 = 1344;
          } else {
            stackIn_4_4 = 0;
          }
          stackIn_3_2[stackIn_3_3] = stackIn_4_4;
          stackIn_3_0[stackIn_3_1] = stackIn_4_4;
          var3_int = param2.a(true);
          var4 = param2.c(param1 ^ 879306160);
          if (var3_int > 448) {
            var5 = kk.field_B[0];
            kk.field_B[0] = kk.field_B[1];
            kk.field_B[1] = var5;
            var5Lifetime3 = or.field_a[0];
            or.field_a[0] = or.field_a[1];
            or.field_a[1] = var5Lifetime3;
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 2; var5Lifetime1++) {
            var6 = -var3_int + kk.field_B[var5Lifetime1];
            var7 = -var4 + or.field_a[var5Lifetime1];
            mu.field_Q[var5Lifetime1] = de.a(var6 * var6 + var7 * var7, (byte) -128);
          }
          var5Lifetime2 = mu.field_Q[0] - 30;
          var9 = 0;
          var6Lifetime1 = var9;
          while (var9 < 2) {
            if (0 != mu.field_Q[var9]) {
              kk.field_B[var9] = var5Lifetime2 * (-var3_int + kk.field_B[var9]) / mu.field_Q[var9] + var3_int;
              or.field_a[var9] = var5Lifetime2 * (or.field_a[var9] - var4) / mu.field_Q[var9] + var4;
            }
            var9++;
          }
          pu.field_zb[0] = kk.field_B[param1] + kk.field_B[1] >> 1;
          stackIn_17_0 = pu.field_zb;
          stackIn_17_1 = 1;
          if (param0 != 1) {
            stackIn_18_2 = 1324;
          } else {
            stackIn_18_2 = 20;
          }
          stackIn_17_0[stackIn_17_1] = stackIn_18_2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("gg.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    gg() {
        super(0L, (hd) null);
    }

    final static void h(byte param0) {
        hd.field_K = wm.field_C;
        hw.field_f = la.field_d;
        jr.field_Gb = cq.field_f;
        up.field_f = 0.0;
        o.field_e = 0.0;
        int var1 = -104 % ((param0 + 10) / 60);
        hw.field_i = (int)hw.field_f >> 3;
        tf.field_a = 0.0;
    }

    final static void a(int param0) {
        ba.a(112, true);
        if (param0 != -32053) {
          field_Db = 59;
        }
    }

    final static void a(String[] args, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = Kickabout.field_G;
        try {
          if (param1 != 88) {
            return;
          }
          li.field_c = new String[args.length];
          for (var2_int = 0; var2_int < args.length; var2_int++) {
            li.field_c[var2_int] = args[var2_int];
          }
          if (li.field_c.length != 0) {
            if (li.field_c.length == 1) {
              stackIn_10_0 = cl.field_g;
            } else {
              stackIn_10_0 = ka.field_d;
            }
            gu.field_Jb = stackIn_10_0;
            var4 = 0;
            var2_intLifetime1 = var4;
            while (var4 < li.field_c.length) {
              gu.field_Jb = gu.field_Jb + li.field_c[var4];
              if (li.field_c.length - 1 > var4) {
                gu.field_Jb = gu.field_Jb + "   ";
              }
              var4++;
            }
            return;
          }
          gu.field_Jb = om.field_zb;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("gg.B(");
          if (args == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
