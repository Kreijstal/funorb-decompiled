/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static int field_c;
    static int field_a;
    static se field_b;

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_b = null;
    }

    final static e a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        e var5 = null;
        e stackIn_4_0 = null;
        e stackIn_7_0 = null;
        e stackIn_12_0 = null;
        e stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            0 != param1.length()) {
            var2_int = param1.indexOf('@');
            if (var2_int == -1) {
              stackIn_7_0 = oc.field_M;
              return stackIn_7_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(1 + var2_int);
            if (param0) {
              uk.a((byte) -20);
            }
            var5 = gk.a(var3, (byte) -127);
            if (var5 == null) {
              stackIn_14_0 = sg.a(-1326, var4);
              return stackIn_14_0;
            }
            stackIn_12_0 = var5;
            return stackIn_12_0;
          }
          stackIn_4_0 = oh.field_e;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("uk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        gj var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        vg var6_ref_vg = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        se var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 68) {
            return;
          }
          var27 = cd.field_t;
          var2 = var27.b((byte) 90);
          if (var2 == 0) {
            var3 = var27.j(98203176);
            var4 = (gj) (cb.field_b.b((byte) -126));
            while (var4 != null) {
              if (var4.field_o != var3) {
                var4 = (gj) (cb.field_b.d(param0 + 785));
                continue;
              }
              break;
            }
            if (var4 == null) {
              th.a(120);
              return;
            }
            var5 = var27.b((byte) 90);
            if (var5 != 0) {
              var6 = var4.field_m;
              ce.field_e[0].field_a = null;
              ce.field_e[0].field_c = false;
              var7 = var4.field_n;
              ce.field_e[0].field_d = gb.field_h;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                ce.field_e[var8_int].field_d = var27.g(2);
                ce.field_e[var8_int].field_c = false;
                if (var27.b((byte) 90) == 1) {
                  ce.field_e[var8_int].field_a = var27.g(2);
                } else {
                  ce.field_e[var8_int].field_a = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_i = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_p = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var7 * var6];
              var4.field_l = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.b((byte) 90);
              if (var18 > 0) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var27.b((byte) 90);
                  var21 = ce.field_e[var20].field_d;
                  var22 = var27.c((byte) -89);
                  var24 = var27.field_i;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = ce.field_e[var20].field_a;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.l(0);
                    }
                  }
                  if (var21 != null &&
                    fc.a((byte) -127, var21)) {
                    var8[1][var13] = gb.field_h;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var27.field_i = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.l(0);
                    }
                  }
                  if (var6 > var14 &&
                    !ce.field_e[var20].field_c) {
                    ce.field_e[var20].field_c = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = ce.field_e[var20].field_a;
                    var10[2][var14] = var22;
                    var14++;
                    var27.field_i = var24;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.l(0);
                    }
                  }
                }
              }
            }
            var4.field_h = true;
            var4.b(param0 ^ 125);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.j(98203176);
            var4_long = var27.c((byte) -89);
            var6_ref_vg = (vg) (kk.field_X.b((byte) 124));
            while (var6_ref_vg != null) {
              if (~var3Lifetime1 != ~var6_ref_vg.field_t) {
                var6_ref_vg = (vg) (kk.field_X.d(853));
                continue;
              }
              break;
            }
            if (var6_ref_vg != null) {
              var6_ref_vg.field_h = var4_long;
              var6_ref_vg.b(param0 - 11);
              return;
            }
            stackIn_12_0 = param0;
            stackIn_12_1 = 58;
            th.a(stackIn_12_0 + stackIn_12_1);
            return;
          }
          pe.a((byte) -13, (Throwable) null, "HS1: " + sj.b(true));
          th.a(param0 + 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "uk.C(" + param0 + ')');
        }
    }

    static {
        field_c = -1;
    }
}
