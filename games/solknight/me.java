/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static ff field_f;
    private qd field_j;
    private da field_a;
    private da field_c;
    static da field_e;
    static boolean field_g;
    private qd field_i;
    static String field_h;
    static int field_d;
    static int field_b;

    private final sh a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sh var8 = null;
        ra var9 = null;
        sh var10 = null;
        sh stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        sh stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        sh stackOut_12_0 = null;
        sh stackOut_1_0 = null;
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
            var5_int = param3 ^ (param2 >>> 12 | 65533 & param2 << 4);
            var5_int = var5_int | param2 << 16;
            var6 = (long)var5_int;
            var8 = (sh) (Object) ((me) this).field_i.a(true, var6);
            if (var8 == null) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0[0] > 0) {
                    break L1;
                  } else {
                    stackOut_5_0 = null;
                    stackIn_6_0 = stackOut_5_0;
                    return (sh) (Object) stackIn_6_0;
                  }
                }
              }
              var9 = ra.a(((me) this).field_a, param2, param3);
              if (var9 != null) {
                L2: {
                  var10 = var9.b();
                  var8 = var10;
                  ((me) this).field_i.a((byte) 76, (gg) (Object) var8, var6);
                  if (param0 == null) {
                    break L2;
                  } else {
                    param0[0] = param0[0] - var10.field_i.length;
                    break L2;
                  }
                }
                stackOut_12_0 = (sh) var8;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (sh) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("me.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 1264444880 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    public static void a(byte param0) {
        field_h = null;
        field_e = null;
        field_f = null;
    }

    final sh a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        sh stackIn_2_0 = null;
        sh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        sh stackOut_5_0 = null;
        sh stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          if (~((me) this).field_c.a((byte) 89) != param1) {
            if (((me) this).field_c.b(126, param2) == 1) {
              stackOut_5_0 = this.a(param2, 0, param0, (byte) -107);
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              throw new RuntimeException();
            }
          } else {
            stackOut_1_0 = this.a(0, param2, param0, (byte) -77);
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("me.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L0;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L0;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final sh a(int param0, int param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sh var8 = null;
        sl var9 = null;
        sh stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_17_0 = null;
        sh stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        sh stackOut_18_0 = null;
        Object stackOut_16_0 = null;
        sh stackOut_1_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var5_int = param1 ^ (65524 & param0 << 4 | param0 >>> 12);
            var5_int = var5_int | param0 << 16;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (sh) (Object) ((me) this).field_i.a(true, var6);
            if (var8 == null) {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (param2[0] > 0) {
                    break L1;
                  } else {
                    stackOut_5_0 = null;
                    stackIn_6_0 = stackOut_5_0;
                    return (sh) (Object) stackIn_6_0;
                  }
                }
              }
              L2: {
                var9 = (sl) (Object) ((me) this).field_j.a(true, var6);
                if (var9 != null) {
                  break L2;
                } else {
                  var9 = sl.a(((me) this).field_c, param0, param1);
                  if (var9 != null) {
                    ((me) this).field_j.a((byte) 113, (gg) (Object) var9, var6);
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param2);
              if (var8 != null) {
                var9.c(10);
                if (param3 <= -52) {
                  ((me) this).field_i.a((byte) 40, (gg) (Object) var8, var6);
                  stackOut_18_0 = (sh) var8;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  return (sh) (Object) stackIn_17_0;
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (sh) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("me.F(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ')');
        }
        return stackIn_19_0;
    }

    final static void a(boolean param0) {
        if (!(lk.field_e < 10000)) {
            vk.a(255, (byte) 89, 0);
        }
        if (lk.field_e >= 20000) {
            vk.a(254, (byte) 89, 1);
            if (!(lk.field_e < 30000)) {
                vk.a(253, (byte) 89, 2);
            }
            if (lk.field_e < 40000) {
                if (!(50000 > lk.field_e)) {
                    vk.a(251, (byte) 89, 4);
                }
                return;
            }
            vk.a(252, (byte) 89, 3);
            if (!(50000 > lk.field_e)) {
                vk.a(251, (byte) 89, 4);
            }
            return;
        }
        if (!(lk.field_e < 30000)) {
            vk.a(253, (byte) 89, 2);
        }
        if (lk.field_e >= 40000) {
            vk.a(252, (byte) 89, 3);
            if (!(50000 > lk.field_e)) {
                vk.a(251, (byte) 89, 4);
            }
            return;
        }
        if (!(50000 > lk.field_e)) {
            vk.a(251, (byte) 89, 4);
        }
    }

    final sh a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        sh stackIn_5_0 = null;
        sh stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        sh stackOut_4_0 = null;
        sh stackOut_7_0 = null;
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
            if (param0 == 0) {
              break L0;
            } else {
              field_b = 6;
              break L0;
            }
          }
          if (1 == ((me) this).field_a.a((byte) 105)) {
            stackOut_4_0 = this.a(param2, 1264444880, 0, param1);
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          } else {
            if (((me) this).field_a.b(12, param1) != 1) {
              throw new RuntimeException();
            } else {
              stackOut_7_0 = this.a(param2, 1264444880, param1, 0);
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("me.D(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    me(da param0, da param1) {
        ((me) this).field_j = new qd(256);
        ((me) this).field_i = new qd(256);
        try {
            ((me) this).field_c = param1;
            ((me) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ff(9, 0, 4, 1);
    }
}
