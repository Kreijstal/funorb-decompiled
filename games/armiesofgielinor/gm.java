/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm implements lv {
    static tu field_f;
    static String field_b;
    static String[] field_a;
    private Unit[] field_c;
    static String field_e;
    static int field_d;
    static int[][] field_h;
    static int field_i;
    static String field_g;

    final static d a(byte[] param0, int param1) {
        d var2 = null;
        RuntimeException var2_ref = null;
        d stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param1 < 71) {
            field_f = (tu) null;
          }
          var2 = new d(param0, j.field_e, iq.field_g, qm.field_K, c.field_e, qv.field_j, vj.field_j);
          rj.d((byte) 107);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("gm.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int f(int param0) {
        if (param0 != 3) {
          field_i = -52;
        }
        return (va.field_D << 2) + (ol.field_B << 4) + cd.field_c;
    }

    public final boolean b(int param0) {
        int var3 = 0;
        Unit var4 = null;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        Unit[] var6 = this.field_c;
        Unit[] var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (!var4.field_G) {
            return false;
          }
        }
        return true;
    }

    gm(int param0, Unit[] param1) {
        try {
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "gm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 3) {
            stackIn_3_0 = vf.field_e;
            return stackIn_3_0;
          }
          if (param1 == param0) {
            stackIn_6_0 = mo.field_l;
            return stackIn_6_0;
          }
          if (param0 == 7) {
            stackIn_10_0 = qm.field_H;
            return stackIn_10_0;
          }
          if (8 == param0) {
            stackIn_13_0 = cd.field_b;
            return stackIn_13_0;
          }
          if (9 == param0) {
            stackIn_16_0 = ke.field_d;
            return stackIn_16_0;
          }
          if (param0 == 10) {
            stackIn_19_0 = wh.field_h;
            return stackIn_19_0;
          }
          if (11 == param0) {
            stackIn_23_0 = qt.field_b;
            return stackIn_23_0;
          }
          if (param0 != 14) {
            return null;
          }
          stackIn_27_0 = fo.a(param1 ^ 4806, AreaSpell.field_i, new String[]{param2});
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("gm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_a = null;
        field_b = null;
        field_h = (int[][]) null;
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != 25931) {
          gm.f(-9);
        }
    }

    final static void d(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int var19 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        aj var4 = null;
        wj var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
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
        CipherPacketBuffer var27 = null;
        long[][] var31 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var27 = mg.field_e;
          if (param0 != 9) {
            field_e = (String) null;
          }
          var2 = var27.k(0);
          if (0 == var2) {
            var3 = var27.e((byte) -104);
            var4_ref = (wj) (lf.field_c.first((byte) 100));
            while (var4_ref != null) {
              if (var4_ref.field_r != var3) {
                var4_ref = (wj) (lf.field_c.next((byte) 123));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              dj.a((byte) -126);
              return;
            }
            var5 = var27.k(param0 - 9);
            if (0 != var5) {
              var6 = var4_ref.field_k;
              th.field_b[0].field_d = false;
              var7 = var4_ref.field_p;
              th.field_b[0].field_f = mv.field_d;
              th.field_b[0].field_c = null;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                th.field_b[var8_int].field_f = var27.g(param0 ^ 8);
                th.field_b[var8_int].field_d = false;
                if (var27.k(0) == 1) {
                  th.field_b[var8_int].field_c = var27.g(1);
                } else {
                  th.field_b[var8_int].field_c = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4_ref.field_s = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              var31 = new long[3][var6];
              dupTemp$1 = new int[3][var7 * var6];
              var4_ref.field_m = dupTemp$1;
              var11 = dupTemp$1;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.k(0);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var27.k(0);
                  var21 = th.field_b[var20].field_f;
                  var22 = var27.j((byte) -2);
                  var24 = var27.position;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = th.field_b[var20].field_c;
                    var31[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$2 = var15;
                      var15++;
                      var11[0][incrementValue$2] = var27.i(1);
                    }
                  }
                  if (var21 != null &&
                    gt.a(var21, (byte) 125)) {
                    var8[1][var13] = mv.field_d;
                    var9[1][var13] = null;
                    var31[1][var13] = var22;
                    var13++;
                    var27.position = var24;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$3 = var16;
                      var16++;
                      var11[1][incrementValue$3] = var27.i(GrowthEvent.b(param0, 8));
                    }
                  }
                  if (var6 > var14 &&
                    !th.field_b[var20].field_d) {
                    th.field_b[var20].field_d = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = th.field_b[var20].field_c;
                    var31[2][var14] = var22;
                    var14++;
                    var27.position = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$4 = var17;
                      var17++;
                      var11[2][incrementValue$4] = var27.i(param0 - 8);
                    }
                  }
                }
              }
            }
            var4_ref.field_o = true;
            var4_ref.unlink(86);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.e((byte) -104);
            var27.j((byte) -2);
            var4 = (aj) (GameEvent.field_r.first((byte) 99));
            while (var4 != null) {
              if (var4.field_s != var3Lifetime1) {
                var4 = (aj) (GameEvent.field_r.next((byte) 123));
                continue;
              }
              break;
            }
            if (var4 != null) {
              var4.unlink(param0 ^ -103);
              return;
            }
            dj.a((byte) -126);
            return;
          }
          af.a((Throwable) null, 76, "HS1: " + cm.b(false));
          dj.a((byte) -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "gm.D(" + param0 + ')');
        }
    }

    public final String a(int param0) {
        if (param0 > -122) {
          return (String) null;
        }
        return "Win: Leader Escort";
    }

    public final boolean c(int param0) {
        if (param0 >= -121) {
          gm.d(68);
        }
        return false;
    }

    static {
        field_a = new String[255];
        field_d = 1;
        field_b = "Loads more Achievements in Rated games.";
        field_e = "No";
        field_g = "Accept";
        field_h = new int[][]{new int[]{3, 2, -1, 6, 9, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 3, -1, 3, -1, 3, -1, 3, 3, 3, 3, 3, -1, 3, 3, -1}, new int[]{3, 3, -1, 3, 3, 3, -1, 3, 3, 3, 3, 3, -1, 3, 3, -1}};
    }
}
