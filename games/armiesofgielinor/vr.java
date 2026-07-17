/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr {
    static int[] field_a;

    final static void a(kl param0, int param1) {
        RuntimeException var2 = null;
        String var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            gv.field_a = new wk[es.field_c.length][][];
            var9 = "basic";
            var2_ref = var9;
            var3 = 0;
            L1: {
              if (es.field_c.length <= var3) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (es.field_c[var3] == null) {
                      break L3;
                    } else {
                      gv.field_a[var3] = new wk[es.field_c[var3].length][];
                      var4 = 0;
                      if (es.field_c[var3].length <= var4) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            L6: {
                              var5 = es.field_c[var3][var4];
                              if (var5 == null) {
                                var4++;
                                break L6;
                              } else {
                                gv.field_a[var3][var4] = new wk[var5.length];
                                var6 = 0;
                                L7: while (true) {
                                  if (var5.length <= var6) {
                                    if (var3 != 14) {
                                      break L6;
                                    } else {
                                      if (var4 == 0) {
                                        hw.a((byte) 29, var3, var4);
                                        break L4;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  } else {
                                    L8: {
                                      var7 = var5[var6];
                                      if (var7 == null) {
                                        var6++;
                                        var6++;
                                        break L8;
                                      } else {
                                        gv.field_a[var3][var4][var6] = ic.a(var7, (byte) 51, var9, param0);
                                        var6++;
                                        break L8;
                                      }
                                    }
                                    var6++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                            var4++;
                            break L5;
                          }
                          var4++;
                          break L4;
                        }
                        var4++;
                        var4++;
                        break L3;
                      }
                    }
                  }
                  var3++;
                  break L2;
                }
                var3++;
                break L1;
              }
            }
            bj.field_p = new wk[4];
            var10 = 0;
            var3 = var10;
            L9: while (true) {
              if (bj.field_p.length <= var10) {
                td.field_f.a(0, 0);
                so.field_b.a(5605);
                break L0;
              } else {
                bj.field_p[var10] = new wk(100, 110);
                bj.field_p[var10].b();
                qn.b();
                td.field_f.a(var10, 0);
                ds.a(10, 50, va.field_G[0], 27066, false, var10, true, va.field_G[3]);
                ds.a(10, 50, va.field_G[0], 27066, false, var10, false, va.field_G[3]);
                vu.a(true, false, 10, 50, var10, 1, 1);
                vu.a(false, false, 10, 50, var10, 1, 1);
                var10++;
                continue L9;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("vr.A(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + 18 + 41);
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_11_0 = false;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 11987) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              var5 = (CharSequence) (Object) param1;
              var3 = k.a(var5, false);
              var6 = (CharSequence) (Object) param2;
              var4 = k.a(var6, false);
              if (var3 != null) {
                break L2;
              } else {
                if (var4 != null) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            if (var3 == null) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
            } else {
              if (var4 != null) {
                stackOut_11_0 = var3.equals((Object) (Object) var4);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("vr.B(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{0, 4, 9, 13, 22, 18, 8, 17};
    }
}
