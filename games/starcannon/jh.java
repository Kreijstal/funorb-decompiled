/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jh {
    static boolean field_d;
    static String field_f;
    static hh field_h;
    static hl field_a;
    static int[][] field_c;
    private uh field_i;
    static eh field_b;
    private uh field_g;
    static String field_e;

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        if (param0 < 9) {
          jh.a(107, false);
          field_a = null;
          field_c = (int[][]) null;
          field_h = null;
          return;
        } else {
          field_a = null;
          field_c = (int[][]) null;
          field_h = null;
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        pf.field_c = le.field_b[param0];
        lb.field_L = fa.field_A[param0];
        if (!param1) {
            return;
        }
        b.field_e = qa.field_d[param0];
    }

    final void a(int param0, uh param1) {
        int discarded$0 = 0;
        try {
            if (param0 != 22197) {
                discarded$0 = this.b((byte) 89);
            }
            if (!(null == param1.field_f)) {
                param1.a(-6242);
            }
            param1.field_m = this.field_i;
            param1.field_f = this.field_i.field_f;
            param1.field_f.field_m = param1;
            param1.field_m.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "jh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, boolean param1) {
        try {
            long dupTemp$2 = 0L;
            IOException var2 = null;
            ia var4 = null;
            ia var5 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_9_0 = 0;
            L0: {
              if (null != ah.field_e) {
                break L0;
              } else {
                ah.field_e = og.field_a.a(sj.field_I, -115, kl.field_a);
                break L0;
              }
            }
            if (0 == ah.field_e.field_b) {
              return false;
            } else {
              L1: {
                if (param0 == -68) {
                  break L1;
                } else {
                  field_e = (String) null;
                  break L1;
                }
              }
              dupTemp$2 = dd.b(71);
              ca.field_Y = dupTemp$2;
              ik.field_p = dupTemp$2;
              if (ah.field_e.field_b != 1) {
                r.field_c = rb.field_h;
                ah.field_e = null;
                return true;
              } else {
                try {
                  L2: {
                    L3: {
                      m.field_b = new sb((java.net.Socket) (ah.field_e.field_f), og.field_a);
                      d.field_b.field_g = 0;
                      var4 = se.field_p;
                      var5 = var4;
                      if (!param1) {
                        stackOut_10_0 = -1;
                        stackIn_11_0 = stackOut_10_0;
                        break L3;
                      } else {
                        stackOut_9_0 = -2;
                        stackIn_11_0 = stackOut_9_0;
                        break L3;
                      }
                    }
                    wc.field_i = stackIn_11_0;
                    hh.field_a = stackIn_11_0;
                    bh.field_d = stackIn_11_0;
                    var5.field_g = 0;
                    r.field_c = ua.field_b;
                    oe.a(r.field_d, 32, d.field_b, bf.field_s, jg.field_A);
                    nf.a(-1, (byte) 95);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  r.field_c = rb.field_h;
                  ah.field_e = null;
                  return true;
                }
                ah.field_e = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        uh var3 = null;
        var2 = 0;
        var3 = this.field_i.field_m;
        L0: while (true) {
          if (this.field_i == var3) {
            if (param0 < 109) {
              return -57;
            } else {
              return var2;
            }
          } else {
            var3 = var3.field_m;
            var2++;
            continue L0;
          }
        }
    }

    final uh a(byte param0) {
        uh var2 = null;
        if (param0 >= 119) {
          var2 = this.field_i.field_m;
          if (this.field_i == var2) {
            this.field_g = null;
            return null;
          } else {
            this.field_g = var2.field_m;
            return var2;
          }
        } else {
          field_c = (int[][]) null;
          var2 = this.field_i.field_m;
          if (this.field_i == var2) {
            this.field_g = null;
            return null;
          } else {
            this.field_g = var2.field_m;
            return var2;
          }
        }
    }

    final uh a(int param0) {
        int discarded$2 = 0;
        uh var2 = null;
        if (param0 < -10) {
          var2 = this.field_g;
          if (this.field_i == var2) {
            this.field_g = null;
            return null;
          } else {
            this.field_g = var2.field_m;
            return var2;
          }
        } else {
          discarded$2 = this.b((byte) -41);
          var2 = this.field_g;
          if (this.field_i == var2) {
            this.field_g = null;
            return null;
          } else {
            this.field_g = var2.field_m;
            return var2;
          }
        }
    }

    final uh c(int param0) {
        uh discarded$7 = null;
        uh var2 = null;
        var2 = this.field_i.field_m;
        if (param0 == 8) {
          if (var2 == this.field_i) {
            return null;
          } else {
            var2.a(-6242);
            return var2;
          }
        } else {
          discarded$7 = this.c(-118);
          if (var2 == this.field_i) {
            return null;
          } else {
            var2.a(-6242);
            return var2;
          }
        }
    }

    public jh() {
        this.field_i = new uh();
        this.field_i.field_f = this.field_i;
        this.field_i.field_m = this.field_i;
    }

    static {
        field_f = "(Including <%0>)";
        field_c = new int[8][];
        field_h = null;
        field_e = "You are not currently logged in to the<nbsp>game.";
    }
}
