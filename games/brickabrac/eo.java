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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0;
        int stackOut_6_0;
        int stackOut_3_0;
        int stackOut_2_0;
        if (param0) {
          L0: {
            eo.c(-28);
            if (1 != param1.c(1, (byte) 127)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (1 != param1.c(1, (byte) 127)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
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
        ((eo) this).field_j = java.nio.ByteBuffer.allocateDirect(param1.length);
        if (param0 < 63) {
          field_g = null;
          java.nio.Buffer discarded$8 = ((eo) this).field_j.position(0);
          java.nio.ByteBuffer discarded$9 = ((eo) this).field_j.put(param1);
          return;
        } else {
          java.nio.Buffer discarded$10 = ((eo) this).field_j.position(0);
          java.nio.ByteBuffer discarded$11 = ((eo) this).field_j.put(param1);
          return;
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
        int stackIn_4_0 = 0;
        int stackOut_3_0;
        int stackOut_2_0;
        if (param2 != -75) {
          return false;
        } else {
          L0: {
            if (-1 == (param0[param1 >> -2053133531] & 1 << (param1 & 31) ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
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
