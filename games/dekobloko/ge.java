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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        lk var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                  var7 = (lk) null;
                  ge.a((lk) null, 96);
                  break L1;
                }
              }
              var4 = param0.field_z;
              L2: while (true) {
                if (param0.field_a <= var4) {
                  L3: {
                    var2_int = var2_int + var3 * param0.field_O;
                    var4 = 0;
                    if (-5001 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      var4 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (-20001 < (var2_int ^ -1)) {
                      break L4;
                    } else {
                      var4 = 2;
                      break L4;
                    }
                  }
                  stackIn_19_0 = var4;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = 0;
                  L5: while (true) {
                    if (param0.field_O <= var5) {
                      var3 = var3 * 3 / 4;
                      var4++;
                      continue L2;
                    } else {
                      if (-1 != (param0.field_P[var4 * param0.field_O - -var5] ^ -1)) {
                        var2_int = var2_int + var3;
                        var5++;
                        continue L5;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("ge.E(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    final static jg b(byte param0) {
        String var1 = aa.a(param0 + 35);
        if (var1 != null && -1 >= (var1.indexOf('@') ^ -1)) {
            var1 = "";
        }
        if (param0 != -89) {
            field_b = 0;
        }
        return new jg(aa.a(-65), uk.c((byte) -17));
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            return;
        }
        field_f = null;
        field_h = null;
        field_g = null;
    }

    final static ni a(byte param0, int param1, int param2, pi[] param3, byte[] param4, int param5) {
        byte[] array$0 = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        ni stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
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
        int[] var45 = null;
        int[] var46 = null;
        var28 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (256 == param3.length) {
              var39 = new int[256];
              var32 = var39;
              var6 = var32;
              var40 = new int[256];
              var33 = var40;
              var7 = var33;
              var37 = new int[256];
              var30 = var37;
              var8 = var30;
              var38 = new int[256];
              var31 = var38;
              var9 = var31;
              var11 = -2 / ((48 - param0) / 43);
              var10 = new int[]{0, param1, param5};
              var41 = new byte[256][];
              var34 = var41;
              var12 = var34;
              var46 = hk.field_l;
              var14 = hk.field_j;
              var15 = hk.field_i;
              var45 = new int[4];
              hk.b(var45);
              var17_int = 0;
              L1: while (true) {
                if (-257 >= (var17_int ^ -1)) {
                  var17 = new ni(param4, var39, var40, var37, var38, var10, var41);
                  var17.field_C = var17.field_C - param2;
                  var17.field_K = var17.field_K - param2;
                  var17.field_R = var17.field_R - param2;
                  hk.a(var46, var14, var15);
                  hk.a(var45);
                  stackIn_27_0 = (ni) (var17);
                  break L0;
                } else {
                  var6[var17_int] = param3[var17_int].field_d + -param2;
                  var7[var17_int] = param3[var17_int].field_c + -param2;
                  var8[var17_int] = (param2 << 435946913) + param3[var17_int].field_b;
                  var9[var17_int] = param3[var17_int].field_i + (param2 << -894393727);
                  array$0 = new byte[var37[var17_int] * var38[var17_int]];
                  var12[var17_int] = array$0;
                  var18 = array$0;
                  var19 = param3[var17_int].field_k;
                  var20 = param3[var17_int].field_b;
                  var21 = param3[var17_int].field_i;
                  var22 = var37[var17_int];
                  var23 = var22 + -var20;
                  hk.a(new int[var38[var17_int] * var37[var17_int]], var37[var17_int], var38[var17_int]);
                  var24 = 0;
                  var25 = 0;
                  L2: while (true) {
                    if (var25 >= var21) {
                      var24 = 0;
                      var25 = 0;
                      L3: while (true) {
                        if (var18.length <= var25) {
                          var25 = (1 + var37[var17_int]) * param2;
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
                                    incrementValue$1 = var24;
                                    var24++;
                                    if (var19[incrementValue$1] != 0) {
                                      incrementValue$2 = var25;
                                      var25++;
                                      var18[incrementValue$2] = (byte) 1;
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
                            incrementValue$3 = var24;
                            var24++;
                            if (0 == var19[incrementValue$3]) {
                              break L8;
                            } else {
                              hk.a(var26, var25, (param2 << 1731923329) + 1, (param2 << -1375208415) + 1, 2);
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
            var6_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var6_ref);

            stackIn_30_1 = new StringBuilder().append("ge.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param5 + ')');
        }
        return stackIn_27_0;
    }

    final static void a(int param0, int param1, byte param2, ud param3) {
        try {
            ai.a(80, 0, param3, param0, param1);
            if (param2 != 127) {
                ge.a((byte) 73);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ge.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
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
        if (param0 != 123) {
            field_e = 114;
        }
        pn.field_bb[16] = uj.field_e;
    }

    final static void a(byte param0, jk param1) {
        try {
            if (param0 > -65) {
                byte[] var3 = (byte[]) null;
                ge.a((byte) -116, -89, -66, (pi[]) null, (byte[]) null, 119);
            }
            me.field_z = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ge.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = false;
        field_d = "Invalid name";
        field_g = new ij("usename");
        field_a = 0;
        field_i = true;
    }
}
