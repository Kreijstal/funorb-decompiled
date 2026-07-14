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
            if (param1 == 0) {
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
                    if ((ej.field_j.field_v ^ -1) < -1) {
                      try {
                        jd.field_c.a(ej.field_j.field_t, (byte) 70, ej.field_j.field_v, 0);
                        nf.field_Q = rl.a((byte) -111);
                      } catch (java.io.IOException decompiledCaughtParameter) {
                        decompiledCaughtException = decompiledCaughtParameter;
                      }
                      var2 = (IOException) (Object) decompiledCaughtException;
                      dn.c(-74);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ej.field_j.field_v = 0;
                }
              }
              ej.field_j.field_v = 0;
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, ge param1) {
        int var2 = param1.g(-112);
        int var3 = (var2 ^ -1) != -2 ? 0 : 1;
        int var4 = 127 / ((13 - param0) / 63);
        return var3 != 0;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param0 + param2 <= qh.field_l) {
          return param2;
        } else {
          if (-1 < (param1 + param2 + -param0 ^ -1)) {
            if (param3 != 0) {
              field_f = null;
              return qh.field_l - param0;
            } else {
              return qh.field_l - param0;
            }
          } else {
            return param2 + (param1 + -param0);
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
