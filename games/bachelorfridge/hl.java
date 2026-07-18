/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends hfa {
    static fea field_H;
    static kv[] field_D;
    static pia field_C;
    static String[] field_G;
    static String field_E;
    static boolean field_I;
    int field_F;

    final static pia a(int param0, byte param1, ee[] param2, int param3, byte[] param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        byte[][] var10 = null;
        int var11_int = 0;
        pia var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var28 = 0;
        Object var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        byte[][] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        byte[][] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        byte[][] var49 = null;
        pia stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        pia stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var28 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 107) {
                break L1;
              } else {
                var29 = null;
                pia discarded$4 = hl.a(120, (byte) -3, (ee[]) null, 68, (byte[]) null);
                break L1;
              }
            }
            if (param2.length == 256) {
              var47 = new int[256];
              var42 = var47;
              var37 = var42;
              var32 = var37;
              var5_array = var32;
              var48 = new int[256];
              var43 = var48;
              var38 = var43;
              var33 = var38;
              var6 = var33;
              var45 = new int[256];
              var40 = var45;
              var35 = var40;
              var30 = var35;
              var7 = var30;
              var46 = new int[256];
              var41 = var46;
              var36 = var41;
              var31 = var36;
              var8 = var31;
              var9 = new int[]{0, param0, param3};
              var49 = new byte[256][];
              var44 = var49;
              var39 = var44;
              var34 = var39;
              var10 = var34;
              var11_int = 0;
              L2: while (true) {
                if (var11_int >= 256) {
                  var11 = new pia(param4, var47, var48, var45, var46, var9, var49);
                  var11.field_B = var11.field_B - 1;
                  var11.field_v = var11.field_v - 1;
                  var11.field_u = var11.field_u - 1;
                  stackOut_25_0 = (pia) var11;
                  stackIn_26_0 = stackOut_25_0;
                  break L0;
                } else {
                  var5_array[var11_int] = -1 + param2[var11_int].field_f;
                  var6[var11_int] = -1 + param2[var11_int].field_c;
                  var7[var11_int] = param2[var11_int].field_d + 2;
                  var8[var11_int] = param2[var11_int].field_e - -2;
                  var10[var11_int] = new byte[var45[var11_int] * var46[var11_int]];
                  var12 = new byte[var45[var11_int] * var46[var11_int]];
                  var13 = param2[var11_int].field_g;
                  var14 = param2[var11_int].field_d;
                  var15 = param2[var11_int].field_e;
                  var16 = var45[var11_int];
                  var17 = var16 - var14;
                  var18 = 0;
                  var19 = var45[var11_int] + 1;
                  var20 = 0;
                  L3: while (true) {
                    if (var20 >= var15) {
                      var18 = 0;
                      var19 = var45[var11_int] - -1;
                      var20 = 0;
                      L4: while (true) {
                        if (var20 >= var15) {
                          var11_int++;
                          continue L2;
                        } else {
                          var21 = 0;
                          L5: while (true) {
                            if (var14 <= var21) {
                              var19 = var19 + var17;
                              var20++;
                              continue L4;
                            } else {
                              L6: {
                                int incrementValue$5 = var18;
                                var18++;
                                if (var13[incrementValue$5] == 0) {
                                  var19++;
                                  break L6;
                                } else {
                                  int incrementValue$6 = var19;
                                  var19++;
                                  var12[incrementValue$6] = (byte) 1;
                                  break L6;
                                }
                              }
                              var21++;
                              continue L5;
                            }
                          }
                        }
                      }
                    } else {
                      var21 = 0;
                      L7: while (true) {
                        if (var14 <= var21) {
                          var19 = var19 + var17;
                          var20++;
                          continue L3;
                        } else {
                          L8: {
                            int incrementValue$7 = var18;
                            var18++;
                            if (var13[incrementValue$7] == 0) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var19++;
                          var21++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("hl.BA(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param3).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
        return stackIn_26_0;
    }

    final static boolean a(byte param0, int param1) {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var2 = 84 / ((param0 - 27) / 55);
            if (param1 == 1) {
              break L1;
            } else {
              if (param1 == 2) {
                break L1;
              } else {
                if (param1 != 3) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    hl(wj param0) {
        super(param0.field_s, param0.field_v, param0.field_p, param0.field_q, (qda) null, (pl) null);
        try {
            param0.a(0, ((hl) this).field_q, (byte) 59, ((hl) this).field_p, 0);
            ((hl) this).field_F = 256;
            ((hl) this).field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param2 != 0) {
            return;
        }
        if (!(((hl) this).field_A != null)) {
            return;
        }
        if (((hl) this).field_F == 0) {
            return;
        }
        if (!(((hl) this).field_F != 256)) {
            ((hl) this).field_A.a((byte) 93, ((hl) this).field_v + param1, param2, param3 - -((hl) this).field_s);
            return;
        }
        kv var7 = new kv(((hl) this).field_A.field_p, ((hl) this).field_A.field_q);
        int var6 = 59 % ((param0 - -20) / 54);
        bu.a(0, var7);
        ((hl) this).field_A.a((byte) -85, 0, param2, 0);
        db.b(111);
        var7.a(param3 - -((hl) this).field_s, param1 + ((hl) this).field_v, ((hl) this).field_F);
    }

    public hl() {
        super(0, 0, 0, 0, (qda) null, (pl) null);
        ((hl) this).field_F = 256;
    }

    final static void a(int param0, boolean param1) {
        i.field_a.a(param1, 7802);
        d var2 = ao.field_d;
        if (var2 != null) {
            var2.a(i.field_a.field_D, i.field_a.field_M, 20077);
        }
    }

    public static void h(int param0) {
        field_H = null;
        field_E = null;
        field_C = null;
        field_G = null;
        field_D = null;
    }

    final static void a(byte param0, java.awt.Component param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param1.removeKeyListener((java.awt.event.KeyListener) (Object) vv.field_e);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) vv.field_e);
            gfa.field_c = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("hl.C(").append(-67).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = true;
        field_E = "Waiting for savegame";
    }
}
