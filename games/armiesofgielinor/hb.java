/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hb {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -1) {
            field_b = null;
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, boolean param8, int param9, boolean param10, boolean param11, boolean param12, int param13) {
        ad.field_I = null;
        oh.e((byte) -128);
        param11 = wq.a(param11, 11, 14, 15, 13, 0, (byte) -83);
        qh.a(param11, param4, 65524, param3, 65528, 11, true, -1, param12, param10);
        la.a(param3, param4, -1);
        dl.a(0, param4, 0, param11);
    }

    final static void a(byte param0, int param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == am.field_z) {
                break L0;
              } else {
                L1: {
                  if (param1 >= 0) {
                    if (kl.field_k != ov.field_g) {
                      break L0;
                    } else {
                      if (0 != vl.field_n.field_q) {
                        break L1;
                      } else {
                        if (~(10000L + mb.field_G) <= ~vi.b(-60)) {
                          break L1;
                        } else {
                          vl.field_n.h(32161, param1);
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (0 != vl.field_n.field_q) {
                      break L1;
                    } else {
                      if (~(10000L + mb.field_G) <= ~vi.b(-60)) {
                        break L1;
                      } else {
                        vl.field_n.h(32161, param1);
                        break L1;
                      }
                    }
                  }
                }
                if (param0 >= 8) {
                  L2: {
                    if (vl.field_n.field_q <= 0) {
                      break L2;
                    } else {
                      {
                        L3: {
                          am.field_z.a(vl.field_n.field_o, (byte) 20, 0, vl.field_n.field_q);
                          mb.field_G = vi.b(51);
                          break L3;
                        }
                      }
                      vl.field_n.field_q = 0;
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
            vl.field_n.field_q = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Create your own free Jagex account";
        field_a = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
