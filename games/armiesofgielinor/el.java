/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class el {
    static rn field_e;
    static int[][] field_f;
    static int field_c;
    static String field_a;
    static sn[] field_b;
    static int field_d;

    final static void a(byte param0, byte[] param1, int[] param2, int param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == -105) {
              var5_int = 0;
              L1: while (true) {
                if (var5_int >= am.field_K.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param4 = am.field_K[var5_int];
                  var6 = var5_int << 873662084;
                  L2: while (true) {
                    incrementValue$5 = param4;
                    param4--;
                    if (-1 == (incrementValue$5 ^ -1)) {
                      var5_int++;
                      continue L1;
                    } else {
                      incrementValue$6 = var6;
                      var6++;
                      param3 = ab.field_c[incrementValue$6];
                      dupTemp$7 = param1[param3];
                      dupTemp$8 = param2[dupTemp$7];
                      param2[dupTemp$7] = dupTemp$8 + 1;
                      ab.field_c[dupTemp$8] = param3;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("el.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void a(java.awt.Component param0, boolean param1);

    abstract int a(int param0);

    final static byte[] a(boolean param0, byte[] param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        vh var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_c = 69;
                break L1;
              }
            }
            L2: {
              var9 = new vh(param1);
              var3 = var9.k(0);
              var4 = var9.i(1);
              if (0 > var4) {
                break L2;
              } else {
                L3: {
                  if (ag.field_P == 0) {
                    break L3;
                  } else {
                    if (var4 > ag.field_P) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (0 == var3) {
                  var13 = new byte[var4];
                  var11 = var13;
                  var5 = var11;
                  var9.a(0, var4, 0, var13);
                  stackIn_23_0 = (byte[]) (var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var5_int = var9.i(1);
                    if ((var5_int ^ -1) > -1) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 == (ag.field_P ^ -1)) {
                          break L5;
                        } else {
                          if (ag.field_P >= var5_int) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var12 = new byte[var5_int];
                        var10 = var12;
                        var6 = var10;
                        if (1 != var3) {
                          var7 = ph.field_c;
                          synchronized (var7) {
                            L7: {
                              ph.field_c.a((byte) -71, var9, var12);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          pb.a(var12, var5_int, param1, var4, 9);
                          break L6;
                        }
                      }
                      stackIn_21_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("el.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0;
        } else {
          return stackIn_23_0;
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = (int[][]) null;
        if (param0 != -8834) {
            field_a = (String) null;
        }
    }

    static {
        field_f = new int[][]{new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        field_a = "Rankings";
        field_e = new rn();
        field_b = new sn[9];
    }
}
