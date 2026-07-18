/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static String field_h;
    static String field_e;
    private int field_a;
    static int[] field_d;
    private int field_f;
    private int[] field_j;
    static String field_g;
    static int[] field_i;
    static String field_b;
    private boolean field_c;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                if (1 == param1) {
                  stackOut_9_0 = param2 * var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_11_0 = var3_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                L2: {
                  if ((param1 & 1) == 0) {
                    break L2;
                  } else {
                    var3_int = var3_int * param2;
                    break L2;
                  }
                }
                param2 = param2 * param2;
                param1 = param1 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "wd.I(" + 115 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final void a(byte param0, int param1) {
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (param1 > ((wd) this).field_a) {
              break L0;
            } else {
              if (param0 == -84) {
                L1: {
                  if (((wd) this).field_a == param1) {
                    break L1;
                  } else {
                    qb.a(((wd) this).field_j, 1 + param1, ((wd) this).field_j, param1, -param1 + ((wd) this).field_a);
                    break L1;
                  }
                }
                ((wd) this).field_a = ((wd) this).field_a - 1;
                return;
              } else {
                return;
              }
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    private final void a(int param0, byte param1, int param2) {
        if (((wd) this).field_a < param0) {
            ((wd) this).field_a = param0;
        }
        if (!(param0 < ((wd) this).field_j.length)) {
            this.a(-114, param0);
        }
        ((wd) this).field_j[param0] = param2;
        int var4 = 53;
    }

    final int c(int param0, int param1) {
        if (param1 >= -50) {
            field_d = null;
        }
        if (((wd) this).field_a < param0) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return ((wd) this).field_j[param0];
    }

    final static int b(int param0, int param1) {
        return ja.field_h[param0 & 2047];
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var11 = -param3;
            L1: while (true) {
              if (var11 >= 0) {
                break L0;
              } else {
                var12 = param7 + param5;
                L2: while (true) {
                  if (var12 <= param5) {
                    param5 = param5 + param8;
                    param6 = param6 + param4;
                    var11++;
                    continue L1;
                  } else {
                    if (param0[param5] == 16711935) {
                      int incrementValue$2 = param6;
                      param6++;
                      var10_int = param9[incrementValue$2] & 255;
                      int incrementValue$3 = param5;
                      param5++;
                      param0[incrementValue$3] = bq.a(cm.a(var10_int * cm.a(param2, 16711935) >> 8, 16711935), cm.a(16711802, var10_int * cm.a(param2, 65280)) >> 8);
                      continue L2;
                    } else {
                      param6++;
                      param5++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("wd.G(");
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(-123).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param9 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static void a(ak param0, boolean param1) {
        ak var4 = null;
        ak var5 = null;
        int var3 = Pixelate.field_H ? 1 : 0;
        try {
            var4 = (ak) (Object) param0.field_L.c(1504642273);
            ak var2 = var4;
            while (var4 != null) {
                var4.field_Z = 0;
                var4.field_wb = 0;
                var4.field_nb = 0;
                var4.field_S = 0;
                var5 = (ak) (Object) param0.field_L.f(1504642273);
                var5 = var5;
            }
            param0.field_wb = 0;
            param0.field_nb = 0;
            param0.field_S = 0;
            param0.field_Z = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wd.K(" + (param0 != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            wd.a(23);
        }
        field_e = null;
        field_h = null;
        field_b = null;
        field_g = null;
        field_i = null;
        field_d = null;
    }

    final void a(boolean param0, int param1) {
        this.a(1 + ((wd) this).field_a, (byte) 41, param1);
        if (!param0) {
            ((wd) this).a((byte) -113, 40);
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        var3 = ((wd) this).field_j.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (!((wd) this).field_c) {
              var3 = var3 + ((wd) this).field_f;
              continue L0;
            } else {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((wd) this).field_f;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        int[] var5 = new int[this.a(param1, (byte) 120)];
        int[] var3 = var5;
        int var4 = 0;
        qb.a(((wd) this).field_j, 0, var5, 0, ((wd) this).field_j.length);
        ((wd) this).field_j = var5;
    }

    final int b(int param0) {
        if (param0 != 1) {
            ((wd) this).a(false, -127);
        }
        return 1 + ((wd) this).field_a;
    }

    private wd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "You cannot add yourself!";
        field_d = new int[256];
        field_i = new int[8192];
        field_g = "Spectate";
        field_e = "Off";
        field_b = "Please wait...";
    }
}
