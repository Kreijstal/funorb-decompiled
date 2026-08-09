/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ah {
    int field_l;
    int field_a;
    static int field_e;
    static int field_g;
    int field_i;
    int field_d;
    static String field_f;
    int field_j;
    static kf field_h;
    static boolean field_c;
    static int field_k;
    int field_b;

    final static void a(byte param0, pd param1, java.awt.Frame param2) {
        int var3_int = 0;
        un var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = -120 / ((param0 - -4) / 35);
            L1: while (true) {
              var4 = param1.a(param2, false);
              L2: while (true) {
                if (var4.field_a != 0) {
                  if (-2 == (var4.field_a ^ -1)) {
                    param2.setVisible(false);
                    param2.dispose();
                    break L0;
                  } else {
                    mm.a(-18, 100L);
                    continue L1;
                  }
                } else {
                  mm.a(-28, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ah.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -115) {
            return;
        }
        field_f = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4 - -(df.field_e * param2);
              var6 = var5_int + param0;
              var7 = (16711422 & param3) >> 1326752929;
              if (param1 == 100) {
                break L1;
              } else {
                field_h = (kf) null;
                break L1;
              }
            }
            var8 = var5_int;
            L2: while (true) {
              if (var8 >= var6) {
                break L0;
              } else {
                L3: {
                  stackIn_7_0 = df.field_d;

                  stackIn_7_1 = var8;

                  if (0 == var8 % 2) {
                    stackIn_8_0 = (int[]) ((Object) stackIn_7_0);
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = var7;
                    break L3;
                  } else {
                    stackIn_8_0 = (int[]) ((Object) stackIn_7_0);
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = param3;
                    break L3;
                  }
                }
                stackIn_8_0[stackIn_8_1] = stackIn_8_2;
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var5), "ah.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static byte[] a(int param0, byte[] param1, hg param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param2.c((byte) -78, param0);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (param1.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param2.c((byte) -78, 3);
                var6 = (byte)param2.c((byte) -78, param3);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param1[var7] = (byte)(param2.c((byte) -78, var5) + var6);
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackIn_16_0 = (byte[]) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ah.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_16_0;
        }
    }

    static {
        field_e = -1;
        field_f = "Asking to join <%0>'s game...";
    }
}
