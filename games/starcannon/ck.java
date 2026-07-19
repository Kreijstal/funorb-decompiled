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
        this.field_c = true;
        try {
            while (!this.field_a) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = this.field_e[var1_int];
                    if (var2 != null) {
                        var2.d();
                    }
                }
                uc.a(-94, 10L);
                ea.a((Object) null, 105, this.field_d);
            }
        } catch (Exception exception) {
            String var5 = (String) null;
            hc.a((Throwable) ((Object) exception), (String) null, (byte) 99);
        } finally {
            this.field_c = false;
        }
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            rb var2 = null;
            int stackIn_16_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_38_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_35_0 = 0;
            if ((jh.field_b.field_p ^ -1) <= -5) {
              if (-1 == jh.field_b.field_d) {
                return 3;
              } else {
                if ((jh.field_b.field_d ^ -1) != 1) {
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
                    if (param0 >= 124) {
                      break L2;
                    } else {
                      field_h = (int[][]) null;
                      break L2;
                    }
                  }
                  L3: {
                    if (bg.field_a != 1) {
                      break L3;
                    } else {
                      if (2 == bj.field_d.field_b) {
                        stackOut_15_0 = ej.a(2, -1);
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (-2 == (bj.field_d.field_b ^ -1)) {
                          bg.field_a = bg.field_a + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (bg.field_a == 2) {
                      ok.field_sb = new sb((java.net.Socket) (bj.field_d.field_f), ij.field_f);
                      var2 = new rb(13);
                      oe.a(wj.field_b, 32, var2, kc.field_M, ld.field_fb);
                      var2.a(15, -122);
                      var2.c((byte) -113, ac.field_e);
                      ok.field_sb.a(0, var2.field_f, (byte) 87, 13);
                      bg.field_a = bg.field_a + 1;
                      wf.field_f = dd.b(69) + 30000L;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((bg.field_a ^ -1) != -4) {
                      break L5;
                    } else {
                      if (0 >= ok.field_sb.c(122)) {
                        if ((wf.field_f ^ -1L) > (dd.b(63) ^ -1L)) {
                          stackOut_32_0 = ej.a(2, -2);
                          stackIn_33_0 = stackOut_32_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L5;
                        }
                      } else {
                        var1_int = ok.field_sb.a(488852616);
                        if (-1 != (var1_int ^ -1)) {
                          stackOut_27_0 = ej.a(2, var1_int);
                          stackIn_28_0 = stackOut_27_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          bg.field_a = bg.field_a + 1;
                          break L5;
                        }
                      }
                    }
                  }
                  if (-5 != (bg.field_a ^ -1)) {
                    stackOut_37_0 = -1;
                    stackIn_38_0 = stackOut_37_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    jh.field_b.a(ok.field_sb, 65, bh.field_g);
                    bg.field_a = 0;
                    bj.field_d = null;
                    ok.field_sb = null;
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return ej.a(2, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_28_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_33_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_36_0;
                    } else {
                      return stackIn_38_0;
                    }
                  }
                }
              }
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
        int discarded$0 = 0;
        if (param0) {
            discarded$0 = ck.b((byte) 79);
        }
        field_g = null;
        field_h = (int[][]) null;
        field_b = null;
    }

    ck() {
        this.field_e = new df[2];
        this.field_a = false;
        this.field_c = false;
    }

    static {
        field_g = new rb(256);
        field_b = "Next";
        field_f = 0;
    }
}
