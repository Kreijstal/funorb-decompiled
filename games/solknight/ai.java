/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai {
    static String field_d;
    static hi field_a;
    static da field_b;
    static String field_c;

    final static void a(int param0, mg param1, int param2, int param3, int param4, int param5, int param6, int param7, o param8, int param9, int param10) {
        try {
            jj.field_db = param4;
            gf.field_T = param2;
            ja.field_a = param8;
            aj.field_p = param10;
            cl.field_o = param7;
            ii.field_h = param3;
            if (param6 >= -115) {
                field_d = (String) null;
            }
            ke.field_N = param9;
            ji.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ai.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ')');
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            boolean discarded$4 = false;
            long dupTemp$5 = 0L;
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
                discarded$4 = ai.a(false, (byte) 48);
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
              dupTemp$5 = je.a(1);
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
                      lf.field_d = new ad((java.net.Socket) (bk.field_a.field_e), qa.field_n);
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
                    si.a(jj.field_s, (byte) 22, jh.field_f, ci.field_jb, id.field_c);
                    qf.a(param1 + 37, -1);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ef.field_e = wc.field_f;
                  if (SolKnight.field_L) {
                    ef.field_e = wc.field_f;
                    bk.field_a = null;
                    return true;
                  } else {
                    bk.field_a = null;
                    return true;
                  }
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
        String discarded$2 = null;
        String discarded$3 = null;
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
            L1: {
              discarded$2 = ai.a((byte) -23, true, false, true);
              if (param2) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return ad.field_c[var4];
          } else {
            L2: {
              if (param2) {
                var4++;
                break L2;
              } else {
                break L2;
              }
            }
            return ad.field_c[var4];
          }
        } else {
          L3: {
            var4 += 4;
            if (param1) {
              var4 += 2;
              break L3;
            } else {
              break L3;
            }
          }
          if (param0 == 71) {
            L4: {
              if (param2) {
                var4++;
                break L4;
              } else {
                break L4;
              }
            }
            return ad.field_c[var4];
          } else {
            L5: {
              discarded$3 = ai.a((byte) -23, true, false, true);
              if (param2) {
                var4++;
                break L5;
              } else {
                break L5;
              }
            }
            return ad.field_c[var4];
          }
        }
    }

    final static void a(o[] param0, byte param1, int param2, int param3) {
        try {
            int var4_int = 86 % ((param1 - -27) / 54);
            he.field_c = new hi(param0);
            fh.field_b = param2;
            pg.field_b = param3;
            la.a(33);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ai.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -43) {
          field_c = (String) null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    static {
        field_d = "FREE GAME COMPLETE";
        field_c = "Sol Knight";
    }
}
