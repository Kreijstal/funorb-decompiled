/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo extends tl {
    static String field_h;
    static hk field_k;
    static tj field_f;
    static java.awt.Font field_g;
    static volatile int field_i;
    static String field_e;
    private java.nio.ByteBuffer field_j;
    static String field_l;

    final static boolean a(boolean param0, pi param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (!param0) {
                break L1;
              } else {
                eo.c(-28);
                break L1;
              }
            }
            L2: {
              if (1 != param1.c(1, (byte) 127)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("eo.F(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (param3 != param0) {
            break L0;
          } else {
            if (md.field_r != param2) {
              oi.field_d = true;
              md.field_r = param2;
              eh.a(true, param1);
              break L0;
            } else {
              if (param3 == 1) {
                if (md.field_v != param2) {
                  md.field_v = param2;
                  oi.field_d = true;
                  eh.a(true, param1);
                  if (2 == param3) {
                    if (param2 == to.field_a) {
                      return;
                    } else {
                      oi.field_d = true;
                      to.field_a = param2;
                      eh.a(true, param1);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (2 == param3) {
                    if (param2 == to.field_a) {
                      return;
                    } else {
                      oi.field_d = true;
                      to.field_a = param2;
                      eh.a(true, param1);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (2 == param3) {
                  if (param2 == to.field_a) {
                    return;
                  } else {
                    oi.field_d = true;
                    to.field_a = param2;
                    eh.a(true, param1);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
        L1: {
          if (param3 != 1) {
            break L1;
          } else {
            if (md.field_v == param2) {
              break L1;
            } else {
              md.field_v = param2;
              oi.field_d = true;
              eh.a(true, param1);
              if (2 == param3) {
                if (param2 == to.field_a) {
                  return;
                } else {
                  oi.field_d = true;
                  to.field_a = param2;
                  eh.a(true, param1);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        if (2 == param3) {
          if (param2 == to.field_a) {
            return;
          } else {
            oi.field_d = true;
            to.field_a = param2;
            eh.a(true, param1);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, byte[] param1) {
        try {
            ((eo) this).field_j = java.nio.ByteBuffer.allocateDirect(param1.length);
            if (param0 < 63) {
                field_g = null;
            }
            java.nio.Buffer discarded$0 = ((eo) this).field_j.position(0);
            java.nio.ByteBuffer discarded$1 = ((eo) this).field_j.put(param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "eo.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final byte[] b(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((eo) this).field_j.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$9 = ((eo) this).field_j.position(0);
        if (param0 != 16616) {
          return null;
        } else {
          java.nio.ByteBuffer discarded$10 = ((eo) this).field_j.get(var3);
          return var3;
        }
    }

    final static boolean a(int[] param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if ((param0[param1 >> 5] & 1 << (param1 & 31)) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("eo.C(");
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + -75 + 41);
        }
        return stackIn_5_0 != 0;
    }

    public static void c(int param0) {
        field_l = null;
        if (param0 != 7301) {
            return;
        }
        field_g = null;
        field_f = null;
        field_k = null;
        field_h = null;
        field_e = null;
    }

    eo() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_l = "Show lobby chat from my friends";
        field_i = -1;
    }
}
