/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai {
    static String field_d;
    static hi field_a;
    static da field_b;
    static String field_c;

    final static void a(int param0, mg param1, int param2, int param3, int param4, int param5, int param6, int param7, o param8) {
        try {
            jj.field_db = 132;
            gf.field_T = 31;
            ja.field_a = param8;
            aj.field_p = 5500;
            cl.field_o = 10;
            ii.field_h = 132;
            ke.field_N = 0;
            ji.field_a = 10;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ai.C(" + 10 + 44 + (param1 != null ? "{...}" : "null") + 44 + 31 + 44 + 132 + 44 + 132 + 44 + 16776960 + 44 + -122 + 44 + 10 + 44 + (param8 != null ? "{...}" : "null") + 44 + 0 + 44 + 5500 + 41);
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            IOException var2 = null;
            jd var4 = null;
            jd var5 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_9_0 = 0;
            L0: {
              if (param1 == -37) {
                break L0;
              } else {
                boolean discarded$4 = ai.a(false, (byte) 48);
                break L0;
              }
            }
            L1: {
              if (null != bk.field_a) {
                break L1;
              } else {
                bk.field_a = qa.field_n.a(lc.field_l, ia.field_kb, param1 ^ 28119);
                break L1;
              }
            }
            if (0 == bk.field_a.field_c) {
              return false;
            } else {
              long dupTemp$5 = je.a(1);
              gf.field_Y = dupTemp$5;
              md.field_y = dupTemp$5;
              if (bk.field_a.field_c != 1) {
                ef.field_e = wc.field_f;
                bk.field_a = null;
                return true;
              } else {
                try {
                  L2: {
                    L3: {
                      lf.field_d = new ad((java.net.Socket) bk.field_a.field_e, qa.field_n);
                      id.field_c.field_m = 0;
                      var4 = te.field_N;
                      var5 = var4;
                      if (param0) {
                        stackOut_10_0 = -2;
                        stackIn_11_0 = stackOut_10_0;
                        break L3;
                      } else {
                        stackOut_9_0 = -1;
                        stackIn_11_0 = stackOut_9_0;
                        break L3;
                      }
                    }
                    nf.field_U = stackIn_11_0;
                    kl.field_b = stackIn_11_0;
                    jg.field_e = stackIn_11_0;
                    var5.field_m = 0;
                    ef.field_e = qc.field_i;
                    si.a(jj.field_s, (byte) 22, jh.field_f, ci.field_jb, (gb) (Object) id.field_c);
                    qf.a(param1 + 37, -1);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ef.field_e = wc.field_f;
                  bk.field_a = null;
                  return true;
                }
                bk.field_a = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param3) {
          L0: {
            if (param1) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != 71) {
            String discarded$4 = ai.a((byte) -23, true, false, true);
            return ad.field_c[var4];
          } else {
            return ad.field_c[var4];
          }
        } else {
          L1: {
            var4 += 4;
            if (param1) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 == 71) {
            return ad.field_c[var4];
          } else {
            String discarded$5 = ai.a((byte) -23, true, false, true);
            return ad.field_c[var4];
          }
        }
    }

    final static void a(o[] param0, byte param1, int param2, int param3) {
        try {
            int var4_int = 0;
            he.field_c = new hi(param0);
            fh.field_b = param2;
            pg.field_b = param3;
            la.a(33);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ai.B(" + (param0 != null ? "{...}" : "null") + 44 + -83 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "FREE GAME COMPLETE";
        field_c = "Sol Knight";
    }
}
