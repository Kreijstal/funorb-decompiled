/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class og {
    int[] field_b;
    int field_a;
    static int field_c;
    java.awt.Image field_d;
    int field_e;

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    final static void a(int param0, ut[] param1) {
        RuntimeException var4 = null;
        ut var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        ut var6_ref_ut = null;
        int var7 = 0;
        ut var7_ref_ut = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ut var11 = null;
        int[] var12 = null;
        ut var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        ut var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        ut var19 = null;
        int[] var20 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (0 == rm.field_C) {
                var15 = new int[]{-100, 100, 0, 50, -50};
                var17 = new int[]{100, 100, 90, 40, 40};
                var6 = 0;
                L2: while (true) {
                  if (5 <= var6) {
                    var20 = new int[]{30, -20, 0};
                    var18 = new int[]{-50, -10, 40};
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= 3) {
                        break L1;
                      } else {
                        var19 = param1[p.a((byte) -24, 3)];
                        var8 = var18[var6] + (896 + -var19.field_o >> 1);
                        var9 = var20[var6] + (1344 + -var19.field_v >> 1);
                        var19.c(15 + var8, var9 + 15);
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    var16 = param1[p.a((byte) -24, 3)];
                    var8 = 448 + var15[var6] + -(var16.field_o >> 1);
                    var9 = var17[var6] + -(var16.field_v >> 1) + 10;
                    var16.c(var8 + 15, var9 + 15);
                    var16.c(var8 + 15, 1359 - var9 - var16.field_v);
                    var6++;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (rm.field_C == 1) {
                    break L4;
                  } else {
                    if (rm.field_C == 2) {
                      break L4;
                    } else {
                      if (3 == rm.field_C) {
                        var11 = param1[p.a((byte) -24, 3)];
                        var4_ref = var11;
                        var5 = el.a(29430, 10, 896 + -var11.field_o >> 1);
                        var6 = el.a(29430, 10, 50 + -(var11.field_v >> 1));
                        var11.c(var5 + 15, var6 + 15);
                        var4_ref.c(15 - -var5, -var11.field_v + -var6 + 1359);
                        var5 = el.a(29430, 10, -var11.field_o + 896 >> 1);
                        var6 = el.a(29430, 10, 1344 + -var11.field_v >> 1);
                        param1[p.a((byte) -24, 3)].c(var5 + 15, 15 + var6);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var12 = new int[]{-40, 40, 0};
                var14 = new int[]{0, 0, 50};
                var6 = 0;
                L5: while (true) {
                  if (var6 >= 3) {
                    var6_ref_ut = param1[p.a((byte) -24, 3)];
                    var7 = el.a(29430, 10, -var6_ref_ut.field_o + 896 >> 1);
                    var8 = el.a(29430, 10, 1344 + -var6_ref_ut.field_v >> 1);
                    var6_ref_ut.c(var7 + 15, var8 + 15);
                    break L1;
                  } else {
                    var13 = param1[var6];
                    var7_ref_ut = var13;
                    var8 = el.a(29430, 10, var12[var6] + (896 - var13.field_o >> 1));
                    var9 = el.a(29430, 10, 60 - ((var13.field_v >> 1) + -var14[var6]));
                    var13.c(var8 + 15, var9 + 15);
                    var7_ref_ut.c(var8 + 15, -var13.field_v + -var9 + 1359);
                    var6++;
                    continue L5;
                  }
                }
              }
            }
            L6: {
              if (param0 >= 71) {
                break L6;
              } else {
                field_c = 46;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("og.G(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 15 + ',' + 15 + ')');
        }
    }

    final void b(int param0) {
        on.a(((og) this).field_b, ((og) this).field_a, ((og) this).field_e);
        if (param0 != 32) {
            ((og) this).field_a = -72;
        }
    }

    final static void a(int param0) {
        vu.field_Ib = new tk("Cabinet", ne.j((byte) 15), be.field_q, it.field_m);
        vu.field_Ib.a(16, 100, 4, (byte) -114, 200, 300, 70);
    }

    abstract void a(int param0, int param1, int param2, java.awt.Component param3);

    final static String[] a(String param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        String[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] stackIn_4_0 = null;
        String[] stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_3_0 = null;
        String[] stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var13 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = new String[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              StringBuilder discarded$3 = dj.a(0, ' ', -11407, c.field_a);
              var3_int = 0;
              var4 = 0;
              var5 = -1;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              var9 = param0.length();
              var10 = 0;
              L1: while (true) {
                if (var10 >= var9) {
                  L2: {
                    if (var4 < c.field_a.length()) {
                      n.field_f[var8] = c.field_a.toString().substring(var4, c.field_a.length());
                      var8++;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var10 = -13 % ((param2 - 77) / 44);
                  var11 = new String[var8];
                  var12 = 0;
                  L3: while (true) {
                    if (var8 <= var12) {
                      stackOut_24_0 = (String[]) var11;
                      stackIn_25_0 = stackOut_24_0;
                      break L0;
                    } else {
                      var11[var12] = n.field_f[var12];
                      var12++;
                      continue L3;
                    }
                  }
                } else {
                  L4: {
                    var11_int = param0.charAt(var10);
                    if (var11_int == 0) {
                      break L4;
                    } else {
                      StringBuilder discarded$4 = c.field_a.append((char) var11_int);
                      var3_int++;
                      int discarded$5 = -104;
                      var11_int = (char)(255 & mf.a((char) var11_int));
                      break L4;
                    }
                  }
                  L5: {
                    if (var11_int == 32) {
                      var5 = c.field_a.length();
                      var7 = 1;
                      var6 = var3_int;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int <= param1) {
                      break L6;
                    } else {
                      if (var5 < 0) {
                        break L6;
                      } else {
                        n.field_f[var8] = c.field_a.toString().substring(var4, var5 + -var7);
                        var8++;
                        var4 = var5;
                        var3_int = var3_int - var6;
                        var5 = -1;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var11_int != 45) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var10++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("og.F(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0;
    }

    final static void a(boolean param0) {
        np.field_Jb.a((gn) (Object) new sq(), 3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 1;
    }
}
