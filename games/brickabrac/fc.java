/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fc {
    int field_a;
    static ql field_e;
    static String field_c;
    int field_h;
    int field_b;
    int field_g;
    int field_d;
    int field_f;

    final static void a(int param0, jp param1) {
        try {
            jf.d(-99);
            lb.a(param1.field_G, param1.field_x, param1.field_z);
            if (param0 > -46) {
                tp[] var3 = (tp[]) null;
                fc.a(79, (byte[]) null, 74, (tp[]) null, -94, -115);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "fc.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 31797) {
            field_c = (String) null;
        }
    }

    final static String a(int param0) {
        if (param0 <= 6) {
            return (String) null;
        }
        if (!(ik.field_g != jm.field_f)) {
            return am.field_cc;
        }
        if (!(ma.field_I.b(96))) {
            return ma.field_I.a(0);
        }
        if (ka.field_l == jm.field_f) {
            return ma.field_I.a(0);
        }
        return gf.field_d;
    }

    final static bi a(int param0, byte[] param1, int param2, tp[] param3, int param4, int param5) {
        byte[] array$0 = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        bi stackIn_28_0 = null;
        bi stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        byte[][] var11 = null;
        int var13 = 0;
        int var14 = 0;
        int var16_int = 0;
        bi var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var44 = null;
        int[] var45 = null;
        var27 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param3.length == 256) {
              var38 = new int[256];
              var31 = var38;
              var6 = var31;
              var39 = new int[256];
              var32 = var39;
              var7 = var32;
              var36 = new int[256];
              var29 = var36;
              var8 = var29;
              var37 = new int[256];
              var30 = var37;
              var9 = var30;
              var10 = new int[]{0, param2, param4};
              var40 = new byte[256][];
              var33 = var40;
              var11 = var33;
              var45 = lb.field_l;
              var13 = lb.field_c;
              var14 = lb.field_d;
              var44 = new int[4];
              lb.a(var44);
              var16_int = 0;
              L1: while (true) {
                if (var16_int >= 256) {
                  var16 = new bi(param1, var38, var39, var36, var37, var10, var40);
                  var16.field_B = var16.field_B - param0;
                  var16.field_P = var16.field_P - param0;
                  var16.field_F = var16.field_F - param0;
                  if (param5 == 1) {
                    var16.field_L = var16.field_L - param0;
                    lb.a(var45, var13, var14);
                    lb.b(var44);
                    stackIn_30_0 = (bi) (var16);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_28_0 = (bi) null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  var6[var16_int] = -param0 + param3[var16_int].field_b;
                  var7[var16_int] = -param0 + param3[var16_int].field_g;
                  var8[var16_int] = param3[var16_int].field_d - -(param0 << -823040031);
                  var9[var16_int] = (param0 << 1461966817) + param3[var16_int].field_a;
                  array$0 = new byte[var36[var16_int] * var37[var16_int]];
                  var11[var16_int] = array$0;
                  var17 = array$0;
                  var18 = param3[var16_int].field_i;
                  var19 = param3[var16_int].field_d;
                  var20 = param3[var16_int].field_a;
                  var21 = var36[var16_int];
                  var22 = -var19 + var21;
                  lb.a(new int[var36[var16_int] * var37[var16_int]], var36[var16_int], var37[var16_int]);
                  var23 = 0;
                  var24 = 0;
                  L2: while (true) {
                    if (var20 <= var24) {
                      var24 = 0;
                      L3: while (true) {
                        if (var24 >= var17.length) {
                          var23 = 0;
                          var24 = (1 + var36[var16_int]) * param0;
                          var25 = 0;
                          L4: while (true) {
                            if (var20 <= var25) {
                              var16_int++;
                              continue L1;
                            } else {
                              var26 = 0;
                              L5: while (true) {
                                if (var19 <= var26) {
                                  var24 = var24 + var22;
                                  var25++;
                                  continue L4;
                                } else {
                                  L6: {
                                    incrementValue$1 = var23;
                                    var23++;
                                    if (-1 == (var18[incrementValue$1] ^ -1)) {
                                      var24++;
                                      break L6;
                                    } else {
                                      incrementValue$2 = var24;
                                      var24++;
                                      var17[incrementValue$2] = (byte) 1;
                                      break L6;
                                    }
                                  }
                                  var26++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var17[var24] = (byte)lb.field_l[var24];
                          var24++;
                          continue L3;
                        }
                      }
                    } else {
                      var25 = 0;
                      L7: while (true) {
                        if (var19 <= var25) {
                          var24++;
                          continue L2;
                        } else {
                          L8: {
                            incrementValue$3 = var23;
                            var23++;
                            if (0 == var18[incrementValue$3]) {
                              break L8;
                            } else {
                              lb.f(var25 - -param0, param0 + var24, param0, 2);
                              break L8;
                            }
                          }
                          var25++;
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
            stackIn_33_0 = (RuntimeException) (var6_ref);

            stackIn_33_1 = new StringBuilder().append("fc.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_34_0), stackIn_37_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_28_0;
        } else {
          return stackIn_30_0;
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        field_c = "Username: ";
    }
}
