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
        byte[] array$0 = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        pia stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
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
        byte[] var22 = null;
        int var23 = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        byte[] var29 = null;
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
        var28 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 107) {
                break L1;
              } else {
                var29 = (byte[]) null;
                hl.a(120, (byte) -3, (ee[]) null, 68, (byte[]) null);
                break L1;
              }
            }
            if (param2.length == 256) {
              var37 = new int[256];
              var32 = var37;
              var5 = var32;
              var38 = new int[256];
              var33 = var38;
              var6 = var33;
              var35 = new int[256];
              var30 = var35;
              var7 = var30;
              var36 = new int[256];
              var31 = var36;
              var8 = var31;
              var9 = new int[]{0, param0, param3};
              var39 = new byte[256][];
              var34 = var39;
              var10 = var34;
              var11_int = 0;
              L2: while (true) {
                if ((var11_int ^ -1) <= -257) {
                  var11 = new pia(param4, var37, var38, var35, var36, var9, var39);
                  var11.field_B = var11.field_B - 1;
                  var11.field_v = var11.field_v - 1;
                  var11.field_u = var11.field_u - 1;
                  stackIn_26_0 = (pia) (var11);
                  break L0;
                } else {
                  var5[var11_int] = -1 + param2[var11_int].field_f;
                  var6[var11_int] = -1 + param2[var11_int].field_c;
                  var7[var11_int] = param2[var11_int].field_d + 2;
                  var8[var11_int] = param2[var11_int].field_e - -2;
                  array$0 = new byte[var35[var11_int] * var36[var11_int]];
                  var10[var11_int] = array$0;
                  var12 = array$0;
                  var13 = param2[var11_int].field_g;
                  var14 = param2[var11_int].field_d;
                  var15 = param2[var11_int].field_e;
                  var16 = var35[var11_int];
                  var17 = var16 - var14;
                  var18 = 0;
                  var19 = var35[var11_int] + 1;
                  var20 = 0;
                  L3: while (true) {
                    if (var20 >= var15) {
                      var18 = 0;
                      var19 = var35[var11_int] - -1;
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
                                incrementValue$1 = var18;
                                var18++;
                                if (-1 == (var13[incrementValue$1] ^ -1)) {
                                  var19++;
                                  break L6;
                                } else {
                                  incrementValue$2 = var19;
                                  var19++;
                                  var12[incrementValue$2] = (byte) 1;
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
                          incrementValue$3 = var18;
                          var18++;
                          if ((var13[incrementValue$3] ^ -1) != -1) {
                            var22 = var12;
                            var23 = -var16 + var19;
                            var24 = var12;
                            var25 = -1 + var19;
                            var26 = var12;
                            var27 = var19 + 1;
                            var12[var19 - -var16] = (byte) 2;
                            var26[var27] = (byte) 2;
                            var24[var25] = (byte) 2;
                            var22[var23] = (byte) 2;
                            var19++;
                            var21++;
                            continue L7;
                          } else {
                            var19++;
                            var21++;
                            continue L7;
                          }
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
          L8: {
            var5_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5_ref);

            stackIn_29_1 = new StringBuilder().append("hl.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ')');
        }
        return stackIn_26_0;
    }

    final static boolean a(byte param0, int param1) {
        int var2;
        int stackIn_6_0 = 0;
        L0: {
          L1: {
            var2 = 84 / ((param0 - 27) / 55);
            if ((param1 ^ -1) == -2) {
              break L1;
            } else {
              if (param1 == 2) {
                break L1;
              } else {
                if ((param1 ^ -1) != -4) {
                  stackIn_6_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          stackIn_6_0 = 1;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    hl(wj param0) {
        super(param0.field_s, param0.field_v, param0.field_p, param0.field_q, (qda) null, (pl) null);
        try {
            param0.a(0, this.field_q, (byte) 59, this.field_p, 0);
            this.field_F = 256;
            this.field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param2 != 0) {
            return;
        }
        if (!(this.field_A != null)) {
            return;
        }
        if (this.field_F == 0) {
            return;
        }
        if (!((this.field_F ^ -1) != -257)) {
            this.field_A.a((byte) 93, this.field_v + param1, param2, param3 - -this.field_s);
            return;
        }
        kv var7 = new kv(this.field_A.field_p, this.field_A.field_q);
        int var6 = 59 % ((param0 - -20) / 54);
        bu.a(0, var7);
        this.field_A.a((byte) -85, 0, param2, 0);
        db.b(111);
        var7.a(param3 - -this.field_s, param1 + this.field_v, this.field_F);
    }

    public hl() {
        super(0, 0, 0, 0, (qda) null, (pl) null);
        this.field_F = 256;
    }

    final static void a(int param0, boolean param1) {
        i.field_a.a(param1, 7802);
        if (param0 != 0) {
            return;
        }
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
        if (param0 != 2) {
            hl.a((byte) 76, 20);
        }
        field_D = null;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(vv.field_e);
            param1.removeFocusListener(vv.field_e);
            gfa.field_c = -1;
            if (param0 > -46) {
                field_D = (kv[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = true;
        field_E = "Waiting for savegame";
    }
}
