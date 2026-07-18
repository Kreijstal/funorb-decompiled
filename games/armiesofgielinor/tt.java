/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static int field_c;
    private at[] field_b;
    static String[] field_a;
    static wk[] field_d;

    final String[] a(int param0) {
        int var4_int = 0;
        bb var5_ref_bb = null;
        int var6 = 0;
        u var7_ref_u = null;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = param0;
        String[][] var3 = new String[((tt) this).field_b.length][];
        for (var4_int = 0; ((tt) this).field_b.length > var4_int; var4_int++) {
            var3[var4_int] = new String[((tt) this).field_b[var4_int].b(false)];
            var5_ref_bb = new bb(((tt) this).field_b[var4_int]);
            var6 = 0;
            var7_ref_u = (u) (Object) var5_ref_bb.c(50);
            while (var7_ref_u != null) {
                var2++;
                int incrementValue$0 = var6;
                var6++;
                var3[var4_int][incrementValue$0] = var7_ref_u.field_m.a(param0 + -124);
                var7_ref_u = (u) (Object) var5_ref_bb.b(param0 ^ 50);
            }
        }
        String[] var4 = new String[var2 + ((tt) this).field_b.length];
        int var5 = 0;
        for (var6 = 0; ((tt) this).field_b.length > var6; var6++) {
            int incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = "player [" + var6 + "]";
            for (var7 = 0; var3[var6].length > var7; var7++) {
                int incrementValue$2 = var5;
                var5++;
                var4[incrementValue$2] = var3[var6][var7];
            }
        }
        return var4;
    }

    final void a(byte param0) {
        int var3 = 0;
        at var4 = null;
        bb var5 = null;
        u var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        at[] var8 = ((tt) this).field_b;
        at[] var2 = var8;
        for (var3 = 0; var8.length > var3; var3++) {
            var4 = var8[var3];
            var5 = new bb(var4);
            var6 = (u) (Object) var5.c(50);
            while (var6 != null) {
                if (!(!(var6.field_m instanceof up))) {
                    var6.d(87);
                }
                var6 = (u) (Object) var5.b(50);
            }
        }
        if (param0 < 4) {
            field_c = -58;
        }
    }

    final static int a(int param0, int param1, int[] param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -10) {
                break L1;
              } else {
                if (param0 < -10) {
                  break L1;
                } else {
                  if (244 < param1) {
                    break L1;
                  } else {
                    if (244 >= param0) {
                      var4_int = 5;
                      L2: while (true) {
                        if (var4_int < 0) {
                          stackOut_23_0 = -1;
                          stackIn_24_0 = stackOut_23_0;
                          break L0;
                        } else {
                          L3: {
                            var5 = nd.field_d[var4_int];
                            if (bc.field_j[var5].length > param2[var5]) {
                              break L3;
                            } else {
                              param2[var5] = 0;
                              break L3;
                            }
                          }
                          L4: {
                            if (param2[var5] > -1) {
                              if (!bc.field_j[var5][param2[var5]].a(dp.field_Vb[var5][0], dp.field_Vb[var5][1], param1, param0)) {
                                break L4;
                              } else {
                                stackOut_18_0 = var5;
                                stackIn_19_0 = stackOut_18_0;
                                return stackIn_19_0;
                              }
                            } else {
                              if (lt.field_h[var5].b(dp.field_Vb[var5][0], dp.field_Vb[var5][1], param1, param0)) {
                                stackOut_15_0 = var5;
                                stackIn_16_0 = stackOut_15_0;
                                return stackIn_16_0;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var4_int--;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -2;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("tt.F(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + false + ')');
        }
        return stackIn_24_0;
    }

    final void b(int param0, int param1) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var3 = new bb(((tt) this).field_b[param1]);
        if (param0 != 244) {
            return;
        }
        u var4 = (u) (Object) var3.c(50);
        while (var4 != null) {
            if (!(!(var4.field_m instanceof up))) {
                var4.d(-115);
            }
            var4 = (u) (Object) var3.b(50);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
    }

    final boolean a(byte param0, int param1) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var3 = new bb(((tt) this).field_b[param1]);
        if (param0 > -49) {
            return false;
        }
        u var4 = (u) (Object) var3.c(50);
        while (var4 != null) {
            if (var4.field_m.c(-128)) {
                return true;
            }
            var4 = (u) (Object) var3.b(50);
        }
        return false;
    }

    final boolean a(int param0, int param1) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var3 = new bb(((tt) this).field_b[param0]);
        u var4 = (u) (Object) var3.c(50);
        if (param1 > -46) {
            boolean discarded$0 = ((tt) this).a(85, 104);
        }
        while (var4 != null) {
            if (!(!var4.field_m.b(0))) {
                return true;
            }
            var4 = (u) (Object) var3.b(50);
        }
        return false;
    }

    tt(int param0) {
        int var2 = 0;
        ((tt) this).field_b = new at[param0];
        for (var2 = 0; var2 < ((tt) this).field_b.length; var2++) {
            ((tt) this).field_b[var2] = new at();
        }
    }

    final void a(lv param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((tt) this).field_b[param2].a(750, (tc) (Object) new u(param0));
              if (param1 >= 81) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tt.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
