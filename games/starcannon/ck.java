/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ck implements Runnable {
    volatile df[] field_e;
    ka field_d;
    static int[][] field_h;
    volatile boolean field_a;
    volatile boolean field_c;
    static rb field_g;
    static String field_b;
    static int field_f;

    public final void run() {
        int var1_int = 0;
        df var2 = null;
        int var4 = StarCannon.field_A;
        ((ck) this).field_c = true;
        try {
            while (!((ck) this).field_a) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((ck) this).field_e[var1_int];
                    if (var2 != null) {
                        var2.d();
                    }
                }
                uc.a(-94, 10L);
                ea.a((Object) null, 105, ((ck) this).field_d);
            }
        } catch (Exception exception) {
            Object var5 = null;
            hc.a((Throwable) (Object) exception, (String) null, (byte) 99);
        } finally {
            ((ck) this).field_c = false;
        }
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            rb var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_33_0 = 0;
            if (jh.field_b.field_p >= 4) {
              if (-1 == jh.field_b.field_d) {
                return 3;
              } else {
                if (jh.field_b.field_d != -2) {
                  return 1;
                } else {
                  return 4;
                }
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (0 != bg.field_a) {
                      break L1;
                    } else {
                      bj.field_d = ij.field_f.a(va.field_s, 90, md.field_b);
                      bg.field_a = bg.field_a + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (bg.field_a != 1) {
                      break L2;
                    } else {
                      if (2 == bj.field_d.field_b) {
                        stackOut_13_0 = ej.a(2, -1);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (bj.field_d.field_b == 1) {
                          bg.field_a = bg.field_a + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (bg.field_a == 2) {
                      ok.field_sb = new sb((java.net.Socket) bj.field_d.field_f, ij.field_f);
                      var2 = new rb(13);
                      oe.a(wj.field_b, 32, var2, kc.field_M, ld.field_fb);
                      var2.a(15, -122);
                      var2.c((byte) -113, ac.field_e);
                      ok.field_sb.a(0, var2.field_f, (byte) 87, 13);
                      bg.field_a = bg.field_a + 1;
                      wf.field_f = dd.b(69) + 30000L;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (bg.field_a != 3) {
                      break L4;
                    } else {
                      if (0 >= ok.field_sb.c(122)) {
                        if (~wf.field_f > ~dd.b(63)) {
                          stackOut_30_0 = ej.a(2, -2);
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        } else {
                          break L4;
                        }
                      } else {
                        var1_int = ok.field_sb.a(488852616);
                        if (var1_int != 0) {
                          stackOut_25_0 = ej.a(2, var1_int);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        } else {
                          bg.field_a = bg.field_a + 1;
                          break L4;
                        }
                      }
                    }
                  }
                  if (bg.field_a != 4) {
                    stackOut_35_0 = -1;
                    stackIn_36_0 = stackOut_35_0;
                    break L0;
                  } else {
                    jh.field_b.a((Object) (Object) ok.field_sb, 65, bh.field_g);
                    bg.field_a = 0;
                    bj.field_d = null;
                    ok.field_sb = null;
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    return stackIn_34_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return ej.a(2, -3);
              }
              return stackIn_36_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(byte param0) {
        int var1 = -97 / ((param0 - 32) / 58);
        return ie.field_D;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_h = null;
        field_b = null;
    }

    ck() {
        ((ck) this).field_e = new df[2];
        ((ck) this).field_a = false;
        ((ck) this).field_c = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new rb(256);
        field_b = "Next";
        field_f = 0;
    }
}
