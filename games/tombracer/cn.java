/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cn {
    static String field_c;
    static jpa field_h;
    boolean field_g;
    private dla field_i;
    static String field_e;
    static int field_k;
    static int field_b;
    private Object[][] field_l;
    static String field_f;
    int field_j;
    private dr field_d;
    private Object[] field_a;

    final boolean b(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((cn) this).b(param1 ^ -44)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == 2) {
                  break L1;
                } else {
                  byte[] discarded$2 = ((cn) this).a(((boolean[]) ((Object[]) ((cn) this).field_a[4])[5])[6], 76, -83);
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((cn) this).field_i.field_b.a(vta.a(var6, -12754), 1);
              if (!this.b(-1, var4_int)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var7 = (CharSequence) (Object) param2;
                var5 = ((cn) this).field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
                stackOut_9_0 = ((cn) this).a(var4_int, (byte) -126, var5);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("cn.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    public static void d(int param0) {
        field_h = null;
        field_f = null;
        field_e = null;
        field_c = null;
    }

    final synchronized int a(int param0, byte param1) {
        if (!this.b(-1, param0)) {
            return 0;
        }
        if (!(null == ((cn) this).field_a[param0])) {
            return 100;
        }
        if (param1 <= 108) {
            return -36;
        }
        return ((cn) this).field_d.b(27079, param0);
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!((cn) this).b(-90)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((cn) this).field_a.length <= var4) {
              if (param0) {
                if (var2 == 0) {
                  return 100;
                } else {
                  var4 = var3 * 100 / var2;
                  return var4;
                }
              } else {
                return -39;
              }
            } else {
              if (0 < ((cn) this).field_i.field_c[var4]) {
                var2 += 100;
                var3 = var3 + ((cn) this).a(var4, (byte) 118);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (((cn) this).b(-123)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 > 80) {
                  break L1;
                } else {
                  var4 = null;
                  int discarded$2 = ((cn) this).a((String) null, true);
                  break L1;
                }
              }
              var5 = (CharSequence) (Object) param0;
              var3_int = ((cn) this).field_i.field_b.a(vta.a(var5, -12754), 1);
              if (var3_int < 0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return true;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("cn.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final static void e(int param0) {
        sla.b(29585);
        if (param0 != 19470) {
            cn.e(46);
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 > -30) {
            boolean discarded$0 = ((cn) this).a(((int[]) ((cn) this).field_a[0])[3], (byte) -61, 31);
        }
        if (null == ((cn) this).field_i) {
            ((cn) this).field_i = ((cn) this).field_d.a(true);
            if (!(((cn) this).field_i != null)) {
                return false;
            }
            ((cn) this).field_l = new Object[((cn) this).field_i.field_l][];
            ((cn) this).field_a = new Object[((cn) this).field_i.field_l];
        }
        return true;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!((cn) this).b(param0 + -86)) {
          return false;
        } else {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (((cn) this).field_i.field_k.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((cn) this).field_i.field_k[var3];
              if (((cn) this).field_a[var4] == null) {
                this.c(param0 + 22214, var4);
                if (null == ((cn) this).field_a[var4]) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int var4 = 26 % ((-23 - param0) / 48);
        return param1 / (param2 / (1 << param3));
    }

    final int a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (this.b(-1, param2)) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  ((boolean[]) ((cn) this).field_a[2])[0] = ((boolean[]) ((cn) this).field_a[11])[0];
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var4_int = ((cn) this).field_i.field_e[param2].a(vta.a(var5, -12754), 1);
              if (this.a(param2, var4_int, (byte) -75)) {
                stackOut_8_0 = var4_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("cn.I(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean e(int param0, int param1) {
        if (!this.b(-1, param0)) {
            return false;
        }
        if (!(null == ((cn) this).field_a[param0])) {
            return true;
        }
        if (param1 != -2) {
            int discarded$0 = ((cn) this).a(((boolean[]) ((cn) this).field_a[20])[1]);
        }
        this.c(22214, param0);
        if (((cn) this).field_a[param0] != null) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(((cn) this).b(-71))) {
            return false;
        }
        if (!(((cn) this).field_i.field_p.length != 1)) {
            return ((cn) this).a(0, (byte) -127, param1);
        }
        if (!this.b(-1, param1)) {
            return false;
        }
        if (param0 != -15121) {
            return ((boolean[]) ((cn) this).field_a[6])[1];
        }
        if (!(((cn) this).field_i.field_p[param1] != 1)) {
            return ((cn) this).a(param1, (byte) -80, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 != 22214) {
            return;
        }
        if (((cn) this).field_g) {
            ((cn) this).field_a[param1] = (Object) (Object) ((cn) this).field_d.a(param1, (byte) -39);
        } else {
            ((cn) this).field_a[param1] = bw.a(270, ((cn) this).field_d.a(param1, (byte) -39), false);
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var10_int = 0;
        byte[] var10_array = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        uia var27 = null;
        byte[] var28 = null;
        uia var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        uia var33 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        byte[] var55 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_80_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_79_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.b(-1, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null == ((cn) this).field_a[param0]) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                L1: {
                  var5_int = ((cn) this).field_i.field_c[param0];
                  var49 = ((cn) this).field_i.field_n[param0];
                  var42 = var49;
                  var35 = var42;
                  var25 = var35;
                  var6 = var25;
                  if (null == ((cn) this).field_l[param0]) {
                    ((cn) this).field_l[param0] = new Object[((cn) this).field_i.field_p[param0]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var9 = -97 / ((-45 - param3) / 57);
                var7 = ((cn) this).field_l[param0];
                var8 = 1;
                var10_int = 0;
                L2: while (true) {
                  L3: {
                    if (var10_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var11 = var10_int;
                          break L4;
                        } else {
                          var11 = var49[var10_int];
                          break L4;
                        }
                      }
                      if (null != var7[var11]) {
                        var10_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L5: {
                      L6: {
                        if (param1 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param1[0] != -1) {
                              break L7;
                            } else {
                              if (-1 != param1[1]) {
                                break L7;
                              } else {
                                if (param1[2] != 0) {
                                  break L7;
                                } else {
                                  if (param1[3] != 0) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var50 = ir.a(((cn) this).field_a[param0], 13588, true);
                          var43 = var50;
                          var36 = var43;
                          var26 = var36;
                          var10_array = var26;
                          var27 = new uia(var50);
                          var27.a(var27.field_g.length, -84984444, param1, 5);
                          break L5;
                        }
                      }
                      var10_array = ir.a(((cn) this).field_a[param0], 13588, false);
                      break L5;
                    }
                    try {
                      L8: {
                        var51 = sua.a(var10_array, -101);
                        var44 = var51;
                        var37 = var44;
                        var28 = var37;
                        var24 = var28;
                        var52 = var24;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var12_ref_RuntimeException = decompiledCaughtException;
                        stackOut_33_0 = (RuntimeException) var12_ref_RuntimeException;
                        stackOut_33_1 = new StringBuilder();
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (param1 == null) {
                          stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                          stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                          stackOut_35_2 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          stackIn_36_2 = stackOut_35_2;
                          break L9;
                        } else {
                          stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                          stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                          stackOut_34_2 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_36_2 = stackOut_34_2;
                          break L9;
                        }
                      }
                      throw tba.a((Throwable) (Object) stackIn_36_0, (stackIn_36_2 != 0) + " " + param0 + " " + param1.length + " " + sq.a(param1.length, var10_array, (byte) -103) + " " + sq.a(-2 + param1.length, var10_array, (byte) -99) + " " + ((cn) this).field_i.field_j[param0] + " " + ((cn) this).field_i.field_d);
                    }
                    L10: {
                      if (((cn) this).field_g) {
                        ((cn) this).field_a[param0] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var5_int <= 1) {
                        L12: {
                          if (var6 != null) {
                            var12 = var49[0];
                            break L12;
                          } else {
                            var12 = 0;
                            break L12;
                          }
                        }
                        if (((cn) this).field_j != 0) {
                          var7[var12] = (Object) (Object) var52;
                          break L11;
                        } else {
                          var7[var12] = bw.a(270, var51, false);
                          break L11;
                        }
                      } else {
                        if (((cn) this).field_j == 2) {
                          var12 = var51.length;
                          var12--;
                          var13 = var24[var12] & 255;
                          var12 = var12 - 4 * (var5_int * var13);
                          var33 = new uia(var52);
                          var15 = 0;
                          var33.field_h = var12;
                          var16 = 0;
                          var17 = 0;
                          L13: while (true) {
                            if (var17 >= var13) {
                              if (var15 == 0) {
                                stackOut_79_0 = 1;
                                stackIn_80_0 = stackOut_79_0;
                                return stackIn_80_0 != 0;
                              } else {
                                var55 = new byte[var15];
                                var33.field_h = var12;
                                var15 = 0;
                                var18 = 0;
                                var19 = 0;
                                L14: while (true) {
                                  if (var13 <= var19) {
                                    var7[var16] = (Object) (Object) var55;
                                    return true;
                                  } else {
                                    var20 = 0;
                                    var21 = 0;
                                    L15: while (true) {
                                      if (var5_int <= var21) {
                                        var19++;
                                        continue L14;
                                      } else {
                                        L16: {
                                          var20 = var20 + var33.e(-14);
                                          if (var6 != null) {
                                            var22 = var49[var21];
                                            break L16;
                                          } else {
                                            var22 = var21;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (var22 == param2) {
                                            lua.a(var52, var18, var55, var15, var20);
                                            var15 = var15 + var20;
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        var18 = var18 + var20;
                                        var21++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var18 = 0;
                              var19 = 0;
                              L18: while (true) {
                                if (var5_int <= var19) {
                                  var17++;
                                  continue L13;
                                } else {
                                  L19: {
                                    var18 = var18 + var33.e(118);
                                    if (var6 == null) {
                                      var20 = var19;
                                      break L19;
                                    } else {
                                      var20 = var49[var19];
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (var20 != param2) {
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  var19++;
                                  continue L18;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = var51.length;
                          var12--;
                          var13 = var24[var12] & 255;
                          var12 = var12 - var13 * var5_int * 4;
                          var30 = new uia(var52);
                          var53 = new int[var5_int];
                          var46 = var53;
                          var39 = var46;
                          var31 = var39;
                          var15_ref_int__ = var31;
                          var30.field_h = var12;
                          var16 = 0;
                          L21: while (true) {
                            if (var16 >= var13) {
                              var54 = new byte[var5_int][];
                              var47 = var54;
                              var40 = var47;
                              var32 = var40;
                              var16_ref_byte____ = var32;
                              var17 = 0;
                              L22: while (true) {
                                if (var5_int <= var17) {
                                  var30.field_h = var12;
                                  var17 = 0;
                                  var18 = 0;
                                  L23: while (true) {
                                    if (var13 <= var18) {
                                      var18 = 0;
                                      L24: while (true) {
                                        if (var5_int <= var18) {
                                          break L11;
                                        } else {
                                          L25: {
                                            if (var6 != null) {
                                              var19 = var49[var18];
                                              break L25;
                                            } else {
                                              var19 = var18;
                                              break L25;
                                            }
                                          }
                                          L26: {
                                            if (((cn) this).field_j != 0) {
                                              var7[var19] = (Object) (Object) var54[var18];
                                              break L26;
                                            } else {
                                              var7[var19] = bw.a(270, var54[var18], false);
                                              break L26;
                                            }
                                          }
                                          var18++;
                                          continue L24;
                                        }
                                      }
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L27: while (true) {
                                        if (var20 >= var5_int) {
                                          var18++;
                                          continue L23;
                                        } else {
                                          var19 = var19 + var30.e(-98);
                                          lua.a(var52, var17, var54[var20], var53[var20], var19);
                                          var17 = var17 + var19;
                                          var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                          var20++;
                                          continue L27;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var16_ref_byte____[var17] = new byte[var53[var17]];
                                  var53[var17] = 0;
                                  var17++;
                                  continue L22;
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L28: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L21;
                                } else {
                                  var17 = var17 + var30.e(101);
                                  var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                                  var18++;
                                  continue L28;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_100_0 = 1;
                    stackIn_101_0 = stackOut_100_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var5;
            stackOut_102_1 = new StringBuilder().append("cn.D(").append(param0).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param1 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L29;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L29;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_101_0 != 0;
    }

    final int c(int param0) {
        if (param0 != 4) {
            ((cn) this).field_a[4] = ((Object[]) ((cn) this).field_a[0])[5];
        }
        if (!(((cn) this).b(-44))) {
            return -1;
        }
        return ((cn) this).field_i.field_p.length;
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        if (((cn) this).b(-74)) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (param1 < 0) {
                break L0;
              } else {
                if (param0 >= ((cn) this).field_i.field_p.length) {
                  break L0;
                } else {
                  if (param1 >= ((cn) this).field_i.field_p[param0]) {
                    break L0;
                  } else {
                    var4 = 9 % ((23 - param2) / 61);
                    return true;
                  }
                }
              }
            }
          }
          if (nl.field_b) {
            throw new IllegalArgumentException(param0 + " " + param1);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final synchronized int[] d(int param0, int param1) {
        int[] var7 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (!this.b(-1, param1)) {
            return null;
        }
        int var3 = 121 % ((param0 - -15) / 58);
        int[] var4 = ((cn) this).field_i.field_n[param1];
        if (!(var4 != null)) {
            var7 = new int[((cn) this).field_i.field_c[param1]];
            var4 = var7;
            for (var5 = 0; var5 < var7.length; var5++) {
                var7[var5] = var5;
            }
        }
        return var4;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!((cn) this).b(-89)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((cn) this).field_i.field_b.a(vta.a(var6, -12754), 1);
              if (var4_int >= param2) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((cn) this).field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
                if (0 > var5) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return true;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("cn.O(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final synchronized byte[] f(int param0, int param1) {
        if (!((cn) this).b(-63)) {
            return null;
        }
        if (((cn) this).field_i.field_p.length == 1) {
            return ((cn) this).a(false, 0, param0);
        }
        if (!this.b(-1, param0)) {
            return null;
        }
        if (((cn) this).field_i.field_p[param0] == 1) {
            return ((cn) this).a(false, param0, 0);
        }
        int var3 = -8 / ((50 - param1) / 42);
        throw new RuntimeException();
    }

    final static int a(byte param0) {
        if (param0 < 53) {
            return 20;
        }
        return 1900 + new Date().getYear();
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (((cn) this).b(-93)) {
              param0 = param0.toLowerCase();
              if (param1 == -7768) {
                var4 = (CharSequence) (Object) param0;
                var3_int = ((cn) this).field_i.field_b.a(vta.a(var4, -12754), param1 ^ -7767);
                if (!this.b(param1 ^ 7767, var3_int)) {
                  stackOut_8_0 = -1;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackOut_4_0 = 61;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("cn.P(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!((cn) this).b(-108)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 < -121) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((cn) this).field_i.field_b.a(vta.a(var4, -12754), 1);
                stackOut_7_0 = ((cn) this).e(var3_int, -2);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("cn.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((cn) this).b(-31)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((cn) this).field_i.field_b.a(vta.a(var6, -12754), 1);
              if (this.b(-1, var4_int)) {
                L1: {
                  if (param1 > 112) {
                    break L1;
                  } else {
                    boolean discarded$2 = ((cn) this).a(((int[]) ((cn) this).field_a[12])[21]);
                    break L1;
                  }
                }
                var7 = (CharSequence) (Object) param2;
                var5 = ((cn) this).field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
                stackOut_8_0 = ((cn) this).a(false, var4_int, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("cn.DA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!(this.a(param0, param2, (byte) -97))) {
            return false;
        }
        if (null != ((cn) this).field_l[param0]) {
            if (((cn) this).field_l[param0][param2] != null) {
                return true;
            }
        }
        if (((cn) this).field_a[param0] != null) {
            return true;
        }
        this.c(22214, param0);
        if (((cn) this).field_a[param0] != null) {
            return true;
        }
        if (param1 >= -70) {
            int discarded$0 = ((cn) this).a(false, (String) ((cn) this).field_a[14], ((int[]) ((Object[]) ((cn) this).field_a[14])[3])[2]);
            return false;
        }
        return false;
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_12_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (this.a(param3, param0, (byte) 92)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == ((cn) this).field_l[param3]) {
                    break L2;
                  } else {
                    if (((cn) this).field_l[param3][param0] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (!this.a(param3, param2, param0, -122)) {
                  this.c(22214, param3);
                  if (this.a(param3, param2, param0, 43)) {
                    break L1;
                  } else {
                    stackOut_11_0 = null;
                    stackIn_12_0 = stackOut_11_0;
                    return (byte[]) (Object) stackIn_12_0;
                  }
                } else {
                  break L1;
                }
              }
              if (((cn) this).field_l[param3] == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (((cn) this).field_l[param3][param0] != null) {
                    var7 = ir.a(((cn) this).field_l[param3][param0], 13588, false);
                    var5 = (Object) (Object) var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (((cn) this).field_j == 1) {
                      ((cn) this).field_l[param3][param0] = null;
                      if (1 == ((cn) this).field_i.field_p[param3]) {
                        ((cn) this).field_l[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (((cn) this).field_j != 2) {
                        break L4;
                      } else {
                        ((cn) this).field_l[param3] = null;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_28_0 = var5;
                stackIn_29_0 = stackOut_28_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_30_0 = var5;
            stackOut_30_1 = new StringBuilder().append("cn.FA(").append(param0).append(',').append(true).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_29_0;
    }

    final int a(byte param0, int param1) {
        if (!(this.b(-1, param1))) {
            return 0;
        }
        int var3 = -70 % ((param0 - 3) / 53);
        return ((cn) this).field_i.field_p[param1];
    }

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((cn) this).b(-124)) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  ((cn) this).field_j = -49;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((cn) this).field_i.field_b.a(vta.a(var4, -12754), 1);
              stackOut_5_0 = ((cn) this).a(var3_int, (byte) 119);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("cn.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!((cn) this).b(-80)) {
          return false;
        } else {
          L0: {
            if (~param1 > param0) {
              break L0;
            } else {
              if (param1 >= ((cn) this).field_i.field_p.length) {
                break L0;
              } else {
                if (((cn) this).field_i.field_p[param1] != 0) {
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
          if (nl.field_b) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        }
    }

    final byte[] a(boolean param0, int param1, int param2) {
        if (param0) {
            boolean discarded$0 = this.b(((int[]) ((cn) this).field_a[11])[23], 94);
        }
        return this.a(param2, true, (int[]) null, param1);
    }

    cn(dr param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((cn) this).field_i = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (2 >= param2) {
                  L2: {
                    ((cn) this).field_j = param2;
                    ((cn) this).field_d = param0;
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((cn) this).field_g = stackIn_7_1 != 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("cn.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = -1;
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = "End Game";
        field_f = "Low";
    }
}
