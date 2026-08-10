/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends ka {
    static int field_q;
    static String field_r;
    static qr field_p;

    public static void i(int param0) {
        field_r = null;
        field_p = null;
        if (param0 != 388178881) {
            field_r = (String) null;
        }
    }

    final static int c(int param0, int param1) {
        int var2;
        L0: {
          var2 = 0;
          if ((param1 ^ -1) > -1) {
            param1 = param1 >>> 16;
            var2 += 16;
            break L0;
          } else {
            if (65536 > param1) {
              break L0;
            } else {
              L1: {
                param1 = param1 >>> 16;
                var2 += 16;
                if (-257 < (param1 ^ -1)) {
                  break L1;
                } else {
                  var2 += 8;
                  param1 = param1 >>> 8;
                  break L1;
                }
              }
              L2: {
                if (16 > param1) {
                  break L2;
                } else {
                  var2 += 4;
                  param1 = param1 >>> 4;
                  break L2;
                }
              }
              L3: {
                if ((param1 ^ -1) <= -5) {
                  var2 += 2;
                  param1 = param1 >>> 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (-2 >= (param1 ^ -1)) {
                  param1 = param1 >>> 1;
                  var2++;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (param0 >= 1) {
                return param1 + var2;
              } else {
                rj.i(28);
                return param1 + var2;
              }
            }
          }
        }
        L5: {
          if (-257 < (param1 ^ -1)) {
            break L5;
          } else {
            var2 += 8;
            param1 = param1 >>> 8;
            break L5;
          }
        }
        L6: {
          if (16 > param1) {
            break L6;
          } else {
            var2 += 4;
            param1 = param1 >>> 4;
            break L6;
          }
        }
        L7: {
          if ((param1 ^ -1) <= -5) {
            var2 += 2;
            param1 = param1 >>> 2;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (-2 >= (param1 ^ -1)) {
            param1 = param1 >>> 1;
            var2++;
            break L8;
          } else {
            break L8;
          }
        }
        if (param0 < 1) {
          rj.i(28);
          return param1 + var2;
        } else {
          return param1 + var2;
        }
    }

    final static void a(int param0, bc param1, bc param2) {
        try {
            if (param0 > -25) {
                rj.c(122, 49);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "rj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    rj(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 5);
    }

    final int a(int param0, byte param1) {
        if (param1 >= -25) {
            return -96;
        }
        return param0 >> 388178881;
    }

    final int b(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != param0.field_y) {
              L1: {
                var3_int = param0.field_x;
                if (param1 >= 41) {
                  break L1;
                } else {
                  this.a(-5, (byte) 83);
                  break L1;
                }
              }
              L2: {
                if (param0.field_u) {
                  var3_int = var3_int * 2;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var3_int = var3_int + this.a(-5, param0);
                if (var3_int < 1) {
                  var3_int = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              stackIn_12_0 = var3_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = super.b(param0, 100);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("rj.D(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_12_0;
        }
    }

    final int[] b(int param0) {
        int var2 = 24 / ((param0 - -48) / 61);
        return new int[]{16, 18};
    }

    final int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = this.a(-5, param0);
              if (param1 == 2) {
                break L1;
              } else {
                this.a(50, (byte) 72);
                break L1;
              }
            }
            L2: {
              if (-1 == (var3_int ^ -1)) {
                stackIn_5_0 = 1;
                break L2;
              } else {
                stackIn_5_0 = var3_int;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("rj.F(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    static {
    }
}
