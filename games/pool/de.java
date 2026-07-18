/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class de {
    static vh field_b;
    static lr field_d;
    static String field_f;
    static String field_c;
    static String field_e;
    static boolean field_g;
    static int field_a;

    final static float a(int param0, int param1, int param2) {
        if (param0 != -1) {
            return -0.7121016979217529f;
        }
        return (float)param2 / (float)(1 << param1);
    }

    public static void b(int param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 != -1) {
            de.b(73);
        }
    }

    final static void c(int param0) {
        if (fk.field_ab == 10) {
          ga.b(false);
          fk.field_ab = 11;
          if (param0 == 11) {
            uh.field_o = true;
            return;
          } else {
            float discarded$6 = de.a(48, 16, -49);
            uh.field_o = true;
            return;
          }
        } else {
          if (!uc.a(-114)) {
            ga.b(false);
            fk.field_ab = 11;
            if (param0 != 11) {
              float discarded$7 = de.a(48, 16, -49);
              uh.field_o = true;
              return;
            } else {
              uh.field_o = true;
              return;
            }
          } else {
            if (param0 == 11) {
              uh.field_o = true;
              return;
            } else {
              float discarded$8 = de.a(48, 16, -49);
              uh.field_o = true;
              return;
            }
          }
        }
    }

    final static void a(int param0) {
        if (aq.field_a == null) {
          aq.field_a = new ci[11];
          aq.field_a[0] = new ci(0.0f, 1.0f, 0);
          aq.field_a[1] = new ci(0.0f, 1.0f, 1);
          aq.field_a[2] = new ci(0.0f, 1.0f, 2);
          aq.field_a[3] = new ci(0.0f, 1.0f, 3);
          if (param0 >= -73) {
            field_a = -42;
            aq.field_a[4] = new ci(0.0f, 0.5f, 4);
            aq.field_a[5] = new ci(0.0f, 0.0625f, 5);
            aq.field_a[6] = new ci(0.0f, 4.0f, 6);
            aq.field_a[7] = new ci(0.0f, 2.0f, 7);
            aq.field_a[8] = new ci(0.5f, 1.0f, 8);
            aq.field_a[9] = new ci(0.0f, 15.0f, 9);
            aq.field_a[10] = new ci(0.0f, 0.25f, 10);
            return;
          } else {
            aq.field_a[4] = new ci(0.0f, 0.5f, 4);
            aq.field_a[5] = new ci(0.0f, 0.0625f, 5);
            aq.field_a[6] = new ci(0.0f, 4.0f, 6);
            aq.field_a[7] = new ci(0.0f, 2.0f, 7);
            aq.field_a[8] = new ci(0.5f, 1.0f, 8);
            aq.field_a[9] = new ci(0.0f, 15.0f, 9);
            aq.field_a[10] = new ci(0.0f, 0.25f, 10);
            return;
          }
        } else {
          if (vj.field_c[59]) {
            aq.field_a = new ci[11];
            aq.field_a[0] = new ci(0.0f, 1.0f, 0);
            aq.field_a[1] = new ci(0.0f, 1.0f, 1);
            aq.field_a[2] = new ci(0.0f, 1.0f, 2);
            aq.field_a[3] = new ci(0.0f, 1.0f, 3);
            if (param0 < -73) {
              aq.field_a[4] = new ci(0.0f, 0.5f, 4);
              aq.field_a[5] = new ci(0.0f, 0.0625f, 5);
              aq.field_a[6] = new ci(0.0f, 4.0f, 6);
              aq.field_a[7] = new ci(0.0f, 2.0f, 7);
              aq.field_a[8] = new ci(0.5f, 1.0f, 8);
              aq.field_a[9] = new ci(0.0f, 15.0f, 9);
              aq.field_a[10] = new ci(0.0f, 0.25f, 10);
              return;
            } else {
              field_a = -42;
              aq.field_a[4] = new ci(0.0f, 0.5f, 4);
              aq.field_a[5] = new ci(0.0f, 0.0625f, 5);
              aq.field_a[6] = new ci(0.0f, 4.0f, 6);
              aq.field_a[7] = new ci(0.0f, 2.0f, 7);
              aq.field_a[8] = new ci(0.5f, 1.0f, 8);
              aq.field_a[9] = new ci(0.0f, 15.0f, 9);
              aq.field_a[10] = new ci(0.0f, 0.25f, 10);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (jd.field_c == null) {
                break L0;
              } else {
                L1: {
                  if (param0 >= 0) {
                    if (tl.field_J != ta.field_a) {
                      break L0;
                    } else {
                      if (ej.field_j.field_v != 0) {
                        break L1;
                      } else {
                        if (rl.a((byte) -108) <= nf.field_Q - -10000L) {
                          break L1;
                        } else {
                          ej.field_j.b(false, param0);
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (ej.field_j.field_v != 0) {
                      break L1;
                    } else {
                      if (rl.a((byte) -108) <= nf.field_Q - -10000L) {
                        break L1;
                      } else {
                        ej.field_j.b(false, param0);
                        break L1;
                      }
                    }
                  }
                }
                L2: {
                  if (ej.field_j.field_v > 0) {
                    {
                      L3: {
                        jd.field_c.a(ej.field_j.field_t, (byte) 70, ej.field_j.field_v, 0);
                        nf.field_Q = rl.a((byte) -111);
                        break L3;
                      }
                    }
                    ej.field_j.field_v = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            }
            ej.field_j.field_v = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, ge param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.g(-112);
              if (var2_int == 1) {
                stackOut_2_0 = 1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            var4 = -127;
            stackOut_3_0 = var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("de.D(").append(104).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param0 + param2 <= qh.field_l) {
          return param2;
        } else {
          if (param1 + param2 + -param0 >= 0) {
            return param2 + (param1 + -param0);
          } else {
            field_f = null;
            return qh.field_l - param0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Waiting for extra data";
        field_c = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_f = "Discard";
        field_g = false;
    }
}
