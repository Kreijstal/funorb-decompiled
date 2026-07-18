/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends tj implements he {
    private ro field_L;
    private ka field_J;
    static gu field_K;
    private String field_G;
    private int field_E;
    private int[] field_F;
    private fw[] field_H;
    static String field_I;

    final fw a(String param0, qo param1, byte param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fw stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        fw stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new fw(param0, param1);
            var4.field_k = (kh) (Object) new nu();
            var5 = ((ad) this).field_w - 2;
            var6 = -98 / ((24 - param2) / 44);
            ((ad) this).a(0, ((ad) this).field_l, 0, 8192, ((ad) this).field_w + 34);
            var4.a(7, ((ad) this).field_l - 14, var5, 8192, 30);
            ((ad) this).a((byte) 10, (kb) (Object) var4);
            stackOut_0_0 = (fw) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("ad.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    private final void b(int param0, int param1) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ad) this).field_E >= param0) {
            return;
        }
        int var4 = -1;
        fw[] var8 = new fw[param0];
        fw[] var3 = var8;
        int[] var5 = new int[param0];
        for (var6 = 0; var6 < ((ad) this).field_E; var6++) {
            var8[var6] = ((ad) this).field_H[var6];
            var5[var6] = ((ad) this).field_F[var6];
        }
        ((ad) this).field_H = var3;
        ((ad) this).field_E = param0;
        ((ad) this).field_F = var5;
    }

    public static void a(byte param0) {
        field_K = null;
        if (param0 != 63) {
            field_I = null;
        }
        field_I = null;
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (((ad) this).field_E <= var6_int) {
                  break L2;
                } else {
                  if (((ad) this).field_H[var6_int] == param4) {
                    var7 = ((ad) this).field_F[var6_int];
                    if (var7 == -1) {
                      ((ad) this).field_L.b(true);
                      break L2;
                    } else {
                      gl.a(123, ((ad) this).field_F[var6_int]);
                      break L2;
                    }
                  } else {
                    var6_int++;
                    continue L1;
                  }
                }
              }
              L3: {
                if (param1 == 11) {
                  break L3;
                } else {
                  ((ad) this).field_F = null;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("ad.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    ad(ro param0, ka param1, String param2) {
        super(0, 0, 288, 0, (kh) null);
        int var4_int = 0;
        ((ad) this).field_E = 0;
        try {
            ((ad) this).field_G = param2;
            ((ad) this).field_L = param0;
            ((ad) this).field_J = param1;
            var4_int = ((ad) this).field_G != null ? ((ad) this).field_J.a(((ad) this).field_G, 260, ((ad) this).field_J.field_H) : 0;
            ((ad) this).a(0, 288, 0, 8192, 22 - -var4_int);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -123, param3);
        int discarded$32 = ((ad) this).field_J.a(((ad) this).field_G, 14 + param0 - -((ad) this).field_B, ((ad) this).field_p + param1 - -10, -28 + ((ad) this).field_l, ((ad) this).field_w, 16777215, -1, 0, 0, ((ad) this).field_J.field_H);
        if (param2 > -82) {
            ad.a((byte) 73);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        of var1_ref = null;
        au var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1_ref = (of) (Object) be.field_u.e((byte) 97);
            L1: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (au) (Object) qc.field_g.e((byte) 89);
                L2: while (true) {
                  if (var1_ref2 == null) {
                    var2 = 0;
                    var1_ref = (of) (Object) wl.field_F.e((byte) 115);
                    L3: while (true) {
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        L4: {
                          if (0 < var1_ref.field_Rb) {
                            var1_ref.field_Rb = var1_ref.field_Rb - 1;
                            if (var1_ref.field_Rb == 0) {
                              var1_ref.field_Kb = 0;
                              if (!var1_ref.k(0)) {
                                break L4;
                              } else {
                                var1_ref.d(-123);
                                break L4;
                              }
                            } else {
                              var1_ref = (of) (Object) wl.field_F.a((byte) 123);
                              continue L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                        var1_ref = (of) (Object) wl.field_F.a((byte) 123);
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      if (0 < var1_ref2.field_Lb) {
                        var1_ref2.field_Lb = var1_ref2.field_Lb - 1;
                        if (var1_ref2.field_Lb == 0) {
                          var1_ref2.field_mc = 0;
                          if (var1_ref2.k(-7)) {
                            var1_ref2.d(106);
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var1_ref2 = (au) (Object) qc.field_g.a((byte) 123);
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if (0 < var1_ref.field_Rb) {
                    var1_ref.field_Rb = var1_ref.field_Rb - 1;
                    if (var1_ref.field_Rb != 0) {
                      break L6;
                    } else {
                      var1_ref.field_Kb = 0;
                      if (!var1_ref.k(0)) {
                        break L6;
                      } else {
                        var1_ref.d(-126);
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                var1_ref = (of) (Object) be.field_u.a((byte) 123);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "ad.E(" + -117 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = ((ad) this).field_E;
            this.b(var4_int + param2, -104);
            ((ad) this).field_H[var4_int] = ((ad) this).a(param0, (qo) this, (byte) 104);
            ((ad) this).field_F[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ad.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new gu();
    }
}
