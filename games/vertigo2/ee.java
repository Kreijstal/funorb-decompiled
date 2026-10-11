/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static String field_a;
    static int field_c;
    static cr field_b;
    static String field_d;

    final static void a(int param0, int param1, int param2) {
        if (param1 > -25) {
          return;
        }
        e.a(on.field_b[param2][param0], false);
    }

    final static void a(int param0, r param1) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var2_intLifetime4;
        int var2_intLifetime5;
        int var2_intLifetime6;
        int var2_intLifetime7;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 9; var2_int++) {
            kn.field_h[0][var2_int] = new ed(param1.a("", "level0" + (var2_int + 1) + ".map", 0));
          }
          for (var2_intLifetime1 = 9; 50 > var2_intLifetime1; var2_intLifetime1++) {
            kn.field_h[0][var2_intLifetime1] = new ed(param1.a("", "level" + (var2_intLifetime1 + 1) + ".map", 0));
          }
          for (var2_intLifetime2 = 0; var2_intLifetime2 < 9; var2_intLifetime2++) {
            kn.field_h[1][var2_intLifetime2] = new ed(param1.a("", "level0" + (1 + var2_intLifetime2) + ".2pl", param0 - 11579));
          }
          for (var2_intLifetime3 = 9; var2_intLifetime3 < 30; var2_intLifetime3++) {
            kn.field_h[1][var2_intLifetime3] = new ed(param1.a("", "level" + (1 + var2_intLifetime3) + ".2pl", tk.a(param0, 11579)));
          }
          for (var2_intLifetime4 = 0; var2_intLifetime4 < 9; var2_intLifetime4++) {
            kn.field_h[2][var2_intLifetime4] = new ed(param1.a("", "level0" + (var2_intLifetime4 + 1) + ".cmp", 0));
          }
          if (param0 != 11579) {
            return;
          }
          for (var2_intLifetime5 = 9; 40 > var2_intLifetime5; var2_intLifetime5++) {
            kn.field_h[2][var2_intLifetime5] = new ed(param1.a("", "level" + (1 + var2_intLifetime5) + ".cmp", tk.a(param0, 11579)));
          }
          for (var2_intLifetime6 = 0; var2_intLifetime6 < 9; var2_intLifetime6++) {
            kn.field_h[3][var2_intLifetime6] = kn.field_h[0][var2_intLifetime6];
          }
          for (var2_intLifetime7 = 9; var2_intLifetime7 < 50; var2_intLifetime7++) {
            kn.field_h[3][var2_intLifetime7] = kn.field_h[0][var2_intLifetime7];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("ee.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 0) {
          ee.a(111);
        }
        field_a = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          var1_int = 0;
          if (param0 != -11747) {
            field_b = (cr) null;
          }
          while (var1_int < rr.field_B.length) {
            if (rr.field_z[var1_int]) {
              eg.a(88, rr.field_B[var1_int]);
              rr.field_z[var1_int] = false;
            }
            var1_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "ee.G(" + param0 + ')');
        }
    }

    final static short[] a(mi param0, int param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param0.c((byte) -120, param2);
          if (var4_int == 0) {
            return null;
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new short[var4_int];
          }
          var5 = param0.c((byte) -118, 4);
          var6 = (short)param0.c((byte) -94, 16);
          if (param1 >= -24) {
            stackIn_10_0 = (short[]) null;
            return stackIn_10_0;
          }
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)(var6 + param0.c((byte) -96, var5));
            }
          }
          stackIn_19_0 = (short[]) (param3);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ee.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (param0 > 65535) {
            param0 = param0 >> 16;
            var2 += 16;
          }
          if (255 < param0) {
            var2 += 8;
            param0 = param0 >> 8;
          }
          if (param0 > 15) {
            param0 = param0 >> 4;
            var2 += 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (-256 > param0) {
          var2Lifetime1 += 8;
          param0 = param0 >> 8;
        }
        if (-16 > param0) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (param1 < 38) {
          field_d = (String) null;
        }
        if (-4 > param0) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (param0 < -2) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 8) {
          r var3 = (r) null;
          ee.a(77, (r) null);
        }
        if (tf.a((byte) 112)) {
          param1 = false;
        }
        kf.a(-7393, param1);
        if (bg.field_c) {
          bi.d(el.field_e.field_b.field_wb, el.field_e.field_b.field_N, el.field_e.field_b.field_Fb, el.field_e.field_b.field_db);
          el.field_e.field_b.b(param1, param0 ^ 8);
        }
        ma.a(param1, 78);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeMouseListener(as.field_b);
          param0.removeMouseMotionListener(as.field_b);
          if (param1 < 31) {
            field_d = (String) null;
          }
          param0.removeFocusListener(as.field_b);
          cl.field_f = 0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ee.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = "Waiting for textures";
        field_a = "<%0> has dropped out.";
    }
}
