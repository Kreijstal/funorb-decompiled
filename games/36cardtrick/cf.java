/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf implements b {
    static int field_c;
    static byte field_d;
    static String field_a;
    private int[][] field_e;
    static byte[][] field_b;

    public final int[] a(int param0, byte param1, float param2) {
        int var4 = 68 / ((10 - param1) / 37);
        if (param0 < 0) {
            return null;
        }
        if (((cf) this).field_e.length <= param0) {
            return null;
        }
        if (null == ((cf) this).field_e[param0]) {
            return null;
        }
        return ((cf) this).field_e[param0];
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 3) {
            cf.a((byte) -30);
        }
    }

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              var2 = 28 % ((-15 - param0) / 56);
              if (param1 < 65) {
                break L2;
              } else {
                if (90 >= param1) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < 97) {
                break L3;
              } else {
                if (param1 > 122) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    public final boolean d(int param0, int param1) {
        int var3 = -121 / ((61 - param0) / 34);
        return false;
    }

    final static void a(Main param0, byte param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              cj.field_l[5] = 373 - kb.field_b[5];
              fh.field_G[5] = new int[4];
              param0.field_E[5] = new re(param0, 5);
              if (param1 >= 34) {
                break L1;
              } else {
                var3 = null;
                cf.a((Main) null, (byte) 68);
                break L1;
              }
            }
            L2: {
              cj.field_l[4] = 428;
              fh.field_G[4] = new int[1];
              param0.field_E[4] = new re(param0, 4);
              if (d.field_c <= 0) {
                break L2;
              } else {
                if (!hl.a(jk.field_a, -1)) {
                  break L2;
                } else {
                  fh.field_G[1] = new int[6];
                  param0.field_E[1] = new re(param0, 1);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("cf.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(int param0, int param1) {
        if (param1 != 3) {
            return false;
        }
        return true;
    }

    public final int b(int param0, int param1) {
        if (param0 > -58) {
            return 91;
        }
        return 63;
    }

    public final int c(int param0, int param1) {
        if (param1 > -92) {
            boolean discarded$0 = cf.a((byte) 1, '￩');
            return 0;
        }
        return 0;
    }

    cf(kc[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int[] var15 = null;
        int[] var16 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            ((cf) this).field_e = new int[param0.length / 2][65536];
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= ((cf) this).field_e.length) {
                break L0;
              } else {
                var15 = param0[2 * var2_int].field_r;
                var16 = param0[1 + 2 * var2_int].field_r;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 64) {
                    var8 = 0;
                    var5 = var8;
                    L3: while (true) {
                      if (var8 >= 16384) {
                        var2_int++;
                        continue L1;
                      } else {
                        ((cf) this).field_e[var2_int][var8] = bc.a(((cf) this).field_e[var2_int][var8], 16316671);
                        var6 = ((cf) this).field_e[var2_int][var8];
                        ((cf) this).field_e[var2_int][16384 + var8] = bc.a(var6 + -(var6 >>> 3), 16316671);
                        ((cf) this).field_e[var2_int][16384 + (var8 + 16384)] = bc.a(-(var6 >>> 2) + var6, 16316671);
                        ((cf) this).field_e[var2_int][32768 + (var8 + 16384)] = bc.a(16316671, -(var6 >>> 3) + (-(var6 >>> 2) + var6));
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    og.a(var15, var5 << 6, ((cf) this).field_e[var2_int], var5 << 7, 64);
                    og.a(var16, var5 << 6, ((cf) this).field_e[var2_int], (var5 << 7) + 8192, 64);
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("cf.<init>(");
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email (Login):";
        field_b = new byte[250][];
    }
}
