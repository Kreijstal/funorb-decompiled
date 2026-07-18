/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends pg {
    static String field_h;
    int[] field_g;
    static String field_j;
    static String field_i;

    final static void a(int param0, eg param1, eg param2, eg param3) {
        RuntimeException var4 = null;
        ll[] var5 = null;
        ll[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ll[] var10 = null;
        qb var11 = null;
        int var11_int = 0;
        qb var12 = null;
        int var13 = 0;
        ll[] var14 = null;
        qb var15 = null;
        int[][] var16 = null;
        qb var17 = null;
        qb var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            fk.field_g = qe.a(param3, "frame_top", "commonui", 87);
            vi.field_E = qe.a(param3, "frame_bottom", "commonui", 118);
            ci.field_e = fj.a("commonui", -22612, param3, "jagex_logo_grey");
            af.field_Jb = qe.a(param3, "button", "commonui", 86);
            qk.field_lb = nl.a((byte) 31, param3, "validation", "commonui");
            vc.field_e = (dj) (Object) rm.a("arezzo12", param1, "commonui", -119, param3);
            ia.field_c = (dj) (Object) rm.a("arezzo14", param1, "commonui", -120, param3);
            go.field_k = (dj) (Object) rm.a("arezzo14bold", param1, "commonui", -123, param3);
            var17 = new qb(param2.a("", "button.gif", -1), (java.awt.Component) (Object) on.field_c);
            ll discarded$2 = af.a("dropdown", "commonui", 19412, param3);
            var5 = pk.a("commonui", 0, "screen_options", param3);
            fg.field_k = new ll[4];
            oa.field_d = new ll[4];
            qj.field_j = new ll[4];
            var6 = new ll[][]{oa.field_d, fg.field_k, qj.field_j};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var21.length) {
                var8 = var5[0].field_m[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    var9 = var17.field_y;
                    int discarded$3 = 65280;
                    ec.a();
                    var17.a();
                    de.e(0, 0, de.field_e, de.field_j);
                    var15 = new qb(var9, var9);
                    var18 = var15;
                    var18.a();
                    var17.h(0, 0);
                    var11 = new qb(var9, var9);
                    var11.a();
                    var17.h(-var17.field_q + var9, 0);
                    var12 = new qb(-(var9 * 2) + var17.field_q, var9);
                    var12.a();
                    var17.h(-var9, 0);
                    oo.c(-15405);
                    af.field_Jb = new qb[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var14.length <= var11_int) {
                        var9++;
                        continue L2;
                      } else {
                        var14[var11_int] = ef.a(var21[var11_int], (byte) -59, var5[var9]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("aa.A(").append(95).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final static p a(Throwable param0, String param1) {
        p var2 = null;
        if (!(param0 instanceof p)) {
            var2 = new p(param0, param1);
        } else {
            var2 = (p) (Object) param0;
            var2.field_i = var2.field_i + ' ' + param1;
        }
        return var2;
    }

    public static void b() {
        field_j = null;
        field_i = null;
        field_h = null;
    }

    final static uj[] a(dl param0, byte param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        uj[] var4 = null;
        int var5 = 0;
        uj var6 = null;
        int var7 = 0;
        og var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        uj[] stackIn_4_0 = null;
        uj[] stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        uj[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj[] stackOut_3_0 = null;
        uj[] stackOut_17_0 = null;
        Object stackOut_12_0 = null;
        uj[] stackOut_9_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!param0.a((byte) 46)) {
              stackOut_3_0 = new uj[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var8 = param0.b(-27886);
              L1: while (true) {
                if (var8.field_e != 0) {
                  if (var8.field_e != 2) {
                    var12 = (int[]) var8.field_g;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    if (param1 >= 59) {
                      var4 = new uj[var12.length >> 2];
                      var5 = 0;
                      L2: while (true) {
                        if (~var4.length >= ~var5) {
                          stackOut_17_0 = (uj[]) var4;
                          stackIn_18_0 = stackOut_17_0;
                          break L0;
                        } else {
                          var6 = new uj();
                          var4[var5] = var6;
                          var6.field_g = var3[var5 << 2];
                          var6.field_e = var3[1 + (var5 << 2)];
                          var6.field_a = var3[(var5 << 2) - -2];
                          var6.field_d = var3[(var5 << 2) + 3];
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      stackOut_12_0 = null;
                      stackIn_13_0 = stackOut_12_0;
                      return (uj[]) (Object) stackIn_13_0;
                    }
                  } else {
                    stackOut_9_0 = new uj[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                } else {
                  int discarded$1 = 1;
                  ao.a(10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("aa.D(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    private aa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Account created successfully!";
        field_j = "You have no wands available.";
        field_i = "Staff impersonation";
    }
}
