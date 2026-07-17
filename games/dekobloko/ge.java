/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static int field_e;
    static s field_f;
    static String field_d;
    static boolean field_j;
    static ck field_h;
    static ij field_g;
    static int field_b;
    static volatile int field_a;
    static volatile boolean field_i;
    static boolean field_c;

    final static int a(lk param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var2_int = 0;
                var3 = 10000 / param0.field_O;
                if (param1 > 14) {
                  break L1;
                } else {
                  var7 = null;
                  int discarded$2 = ge.a((lk) null, 96);
                  break L1;
                }
              }
              var4 = param0.field_z;
              L2: while (true) {
                if (~param0.field_a >= ~var4) {
                  L3: {
                    var2_int = var2_int + var3 * param0.field_O;
                    var4 = 0;
                    if (var2_int < 5000) {
                      break L3;
                    } else {
                      var4 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (var2_int < 20000) {
                      break L4;
                    } else {
                      var4 = 2;
                      break L4;
                    }
                  }
                  stackOut_18_0 = var4;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  var5 = 0;
                  L5: while (true) {
                    if (param0.field_O <= var5) {
                      var3 = var3 * 3 / 4;
                      var4++;
                      continue L2;
                    } else {
                      L6: {
                        if (param0.field_P[var4 * param0.field_O - -var5] == 0) {
                          break L6;
                        } else {
                          var2_int = var2_int + var3;
                          break L6;
                        }
                      }
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("ge.E(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
        return stackIn_19_0;
    }

    final static jg b() {
        String var1 = aa.a(-54);
        if (var1 != null) {
            if (var1.indexOf('@') >= 0) {
                var1 = "";
            }
        }
        return new jg(aa.a(-65), uk.c((byte) -17));
    }

    public static void a(boolean param0) {
        field_d = null;
        field_f = null;
        field_h = null;
        field_g = null;
    }

    final static ni a(byte param0, int param1, int param2, pi[] param3, byte[] param4) {
        RuntimeException var6 = null;
        int[] var6_array = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        byte[][] var12 = null;
        int var14 = 0;
        int var15 = 0;
        int var17_int = 0;
        ni var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        byte[][] var34 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        byte[][] var48 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        byte[][] var55 = null;
        int[] var56 = null;
        ni stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        ni stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var28 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (256 == param3.length) {
              var53 = new int[256];
              var46 = var53;
              var39 = var46;
              var32 = var39;
              var6_array = var32;
              var54 = new int[256];
              var47 = var54;
              var40 = var47;
              var33 = var40;
              var7 = var33;
              var51 = new int[256];
              var44 = var51;
              var37 = var44;
              var30 = var37;
              var8 = var30;
              var52 = new int[256];
              var45 = var52;
              var38 = var45;
              var31 = var38;
              var9 = var31;
              var11 = -2 / ((48 - param0) / 43);
              var10 = new int[]{0, param1, 1};
              var55 = new byte[256][];
              var48 = var55;
              var41 = var48;
              var34 = var41;
              var12 = var34;
              var56 = hk.field_l;
              var14 = hk.field_j;
              var15 = hk.field_i;
              var50 = new int[4];
              hk.b(var50);
              var17_int = 0;
              L1: while (true) {
                if (var17_int >= 256) {
                  var17 = new ni(param4, var53, var54, var51, var52, var10, var55);
                  var17.field_C = var17.field_C - param2;
                  var17.field_K = var17.field_K - param2;
                  var17.field_R = var17.field_R - param2;
                  hk.a(var56, var14, var15);
                  hk.a(var50);
                  stackOut_26_0 = (ni) var17;
                  stackIn_27_0 = stackOut_26_0;
                  break L0;
                } else {
                  var6_array[var17_int] = param3[var17_int].field_d + -param2;
                  var7[var17_int] = param3[var17_int].field_c + -param2;
                  var8[var17_int] = (param2 << 1) + param3[var17_int].field_b;
                  var9[var17_int] = param3[var17_int].field_i + (param2 << 1);
                  var12[var17_int] = new byte[var51[var17_int] * var52[var17_int]];
                  var18 = new byte[var51[var17_int] * var52[var17_int]];
                  var19 = param3[var17_int].field_k;
                  var20 = param3[var17_int].field_b;
                  var21 = param3[var17_int].field_i;
                  var22 = var51[var17_int];
                  var23 = var22 + -var20;
                  hk.a(new int[var52[var17_int] * var51[var17_int]], var51[var17_int], var52[var17_int]);
                  var24 = 0;
                  var25 = 0;
                  L2: while (true) {
                    if (var25 >= var21) {
                      var24 = 0;
                      var25 = 0;
                      L3: while (true) {
                        if (var18.length <= var25) {
                          var25 = (1 + var51[var17_int]) * param2;
                          var26 = 0;
                          L4: while (true) {
                            if (var26 >= var21) {
                              var17_int++;
                              continue L1;
                            } else {
                              var27 = 0;
                              L5: while (true) {
                                if (var20 <= var27) {
                                  var25 = var25 + var23;
                                  var26++;
                                  continue L4;
                                } else {
                                  L6: {
                                    int incrementValue$3 = var24;
                                    var24++;
                                    if (var19[incrementValue$3] != 0) {
                                      int incrementValue$4 = var25;
                                      var25++;
                                      var18[incrementValue$4] = (byte) 1;
                                      break L6;
                                    } else {
                                      var25++;
                                      break L6;
                                    }
                                  }
                                  var27++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var18[var25] = (byte)hk.field_l[var25];
                          var25++;
                          continue L3;
                        }
                      }
                    } else {
                      var26 = 0;
                      L7: while (true) {
                        if (var20 <= var26) {
                          var25++;
                          continue L2;
                        } else {
                          L8: {
                            int incrementValue$5 = var24;
                            var24++;
                            if (0 == var19[incrementValue$5]) {
                              break L8;
                            } else {
                              hk.a(var26, var25, (param2 << 1) + 1, (param2 << 1) + 1, 2);
                              break L8;
                            }
                          }
                          var26++;
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
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("ge.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + 1 + 41);
        }
        return stackIn_27_0;
    }

    final static void a(int param0, int param1, byte param2, ud param3) {
        RuntimeException var4 = null;
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
            ai.a(80, 0, param3, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("ge.D(").append(param0).append(44).append(param1).append(44).append(127).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    final static void a() {
        pn.field_bb = new String[qb.field_u];
        pn.field_bb[18] = gg.field_E;
        pn.field_bb[17] = ue.field_d;
        pn.field_bb[5] = cc.field_b;
        pn.field_bb[4] = im.field_d;
        pn.field_bb[9] = gb.field_Tb;
        pn.field_bb[15] = ml.field_d;
        pn.field_bb[21] = cb.field_d;
        pn.field_bb[11] = km.field_y;
        pn.field_bb[7] = gh.field_d;
        pn.field_bb[20] = hd.field_v;
        pn.field_bb[19] = wk.field_k;
        pn.field_bb[6] = jd.field_Zb;
        pn.field_bb[13] = vh.field_c;
        pn.field_bb[16] = uj.field_e;
    }

    final static void a(byte param0, jk param1) {
        try {
            me.field_z = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ge.G(" + -93 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
        field_d = "Invalid name";
        field_g = new ij("usename");
        field_a = 0;
        field_i = true;
    }
}
