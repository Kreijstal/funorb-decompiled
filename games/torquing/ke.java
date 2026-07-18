/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static int[] field_a;
    static int field_c;
    static long field_b;

    final static StringBuilder a(StringBuilder param0) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            var4_int = param0.length();
            param0.setLength(0);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= 0) {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                param0.setCharAt(var5, ' ');
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("ke.A(");
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
          throw rb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + ' ' + ',' + false + ',' + 0 + ')');
        }
        return (StringBuilder) (Object) stackIn_5_0;
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        var2 = 0;
        if (param1 < -86) {
          if (param0 >= 0) {
            if (param0 >= 65536) {
              L0: {
                var2 += 16;
                param0 = param0 >>> 16;
                if (param0 < 256) {
                  break L0;
                } else {
                  param0 = param0 >>> 8;
                  var2 += 8;
                  break L0;
                }
              }
              L1: {
                if (param0 >= 16) {
                  var2 += 4;
                  param0 = param0 >>> 4;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 >= 4) {
                  var2 += 2;
                  param0 = param0 >>> 2;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param0 >= 1) {
                  var2++;
                  param0 = param0 >>> 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              return var2 - -param0;
            } else {
              L4: {
                if (param0 < 256) {
                  break L4;
                } else {
                  param0 = param0 >>> 8;
                  var2 += 8;
                  break L4;
                }
              }
              L5: {
                if (param0 >= 16) {
                  var2 += 4;
                  param0 = param0 >>> 4;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (param0 >= 4) {
                  var2 += 2;
                  param0 = param0 >>> 2;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param0 >= 1) {
                  var2++;
                  param0 = param0 >>> 1;
                  break L7;
                } else {
                  break L7;
                }
              }
              return var2 - -param0;
            }
          } else {
            L8: {
              var2 += 16;
              param0 = param0 >>> 16;
              if (param0 < 256) {
                break L8;
              } else {
                param0 = param0 >>> 8;
                var2 += 8;
                break L8;
              }
            }
            L9: {
              if (param0 >= 16) {
                var2 += 4;
                param0 = param0 >>> 4;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param0 >= 4) {
                var2 += 2;
                param0 = param0 >>> 2;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param0 >= 1) {
                var2++;
                param0 = param0 >>> 1;
                break L11;
              } else {
                break L11;
              }
            }
            return var2 - -param0;
          }
        } else {
          field_a = null;
          if (param0 >= 0) {
            if (param0 >= 65536) {
              L12: {
                var2 += 16;
                param0 = param0 >>> 16;
                if (param0 < 256) {
                  break L12;
                } else {
                  param0 = param0 >>> 8;
                  var2 += 8;
                  break L12;
                }
              }
              L13: {
                if (param0 >= 16) {
                  var2 += 4;
                  param0 = param0 >>> 4;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (param0 >= 4) {
                  var2 += 2;
                  param0 = param0 >>> 2;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (param0 >= 1) {
                  var2++;
                  param0 = param0 >>> 1;
                  break L15;
                } else {
                  break L15;
                }
              }
              return var2 - -param0;
            } else {
              L16: {
                if (param0 < 256) {
                  break L16;
                } else {
                  param0 = param0 >>> 8;
                  var2 += 8;
                  break L16;
                }
              }
              L17: {
                if (param0 >= 16) {
                  var2 += 4;
                  param0 = param0 >>> 4;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (param0 >= 4) {
                  var2 += 2;
                  param0 = param0 >>> 2;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (param0 >= 1) {
                  var2++;
                  param0 = param0 >>> 1;
                  break L19;
                } else {
                  break L19;
                }
              }
              return var2 - -param0;
            }
          } else {
            L20: {
              var2 += 16;
              param0 = param0 >>> 16;
              if (param0 < 256) {
                break L20;
              } else {
                param0 = param0 >>> 8;
                var2 += 8;
                break L20;
              }
            }
            L21: {
              if (param0 >= 16) {
                var2 += 4;
                param0 = param0 >>> 4;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (param0 >= 4) {
                var2 += 2;
                param0 = param0 >>> 2;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (param0 >= 1) {
                var2++;
                param0 = param0 >>> 1;
                break L23;
              } else {
                break L23;
              }
            }
            return var2 - -param0;
          }
        }
    }

    public static void a() {
        field_a = null;
    }

    final static void a(int param0, fj param1) {
        qc.field_bb = param1.i(7088) << 5;
        int var2_int = param1.i((byte) -101);
        try {
            um.field_p = 1835008 & var2_int << 18;
            qc.field_bb = qc.field_bb + (var2_int >> 3);
            um.field_p = um.field_p + (param1.i(7088) << 2);
            var2_int = param1.i((byte) -101);
            um.field_p = um.field_p + (var2_int >> 6);
            bf.field_c = (var2_int & 63) << 15;
            bf.field_c = bf.field_c + (param1.i((byte) -101) << 7);
            var2_int = param1.i((byte) -101);
            bf.field_c = bf.field_c + (var2_int >> 1);
            eg.field_w = (1 & var2_int) << 16;
            eg.field_w = eg.field_w + param1.i(7088);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ke.C(" + 225225318 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
