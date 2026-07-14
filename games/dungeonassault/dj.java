/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dj {
    static volatile int field_d;
    private ne field_b;
    static int field_a;
    private md field_e;
    static String field_c;

    final ne c(int param0) {
        ne var2 = null;
        Object var3 = null;
        if (param0 == 17756) {
          var2 = ((dj) this).field_b;
          if (var2 == ((dj) this).field_e.field_c) {
            ((dj) this).field_b = null;
            return null;
          } else {
            ((dj) this).field_b = var2.field_e;
            return var2;
          }
        } else {
          var3 = null;
          ne discarded$2 = ((dj) this).a((ne) null, true);
          var2 = ((dj) this).field_b;
          if (var2 == ((dj) this).field_e.field_c) {
            ((dj) this).field_b = null;
            return null;
          } else {
            ((dj) this).field_b = var2.field_e;
            return var2;
          }
        }
    }

    final static void a(int param0, int param1, long param2, int param3, String param4, int param5, int param6, int param7, int param8, boolean param9, int param10, boolean param11, byte param12, qg param13) {
        try {
            IOException var15 = null;
            Object var16 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            L0: {
              ra.field_c = new wj(param10);
              ac.field_B = new wj(param1);
              if (!param9) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            L1: {
              ld.field_g = stackIn_3_0 != 0;
              mh.field_g = param8;
              kn.field_b = param0;
              if (!param11) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              fa.field_j = stackIn_6_0 != 0;
              an.field_E = param3;
              dn.field_Q = param2;
              if (param12 == -27) {
                break L2;
              } else {
                var16 = null;
                dj.a((ec) null, (byte) 79);
                break L2;
              }
            }
            l.field_b = param7;
            ii.field_D = param4;
            la.field_c = param5;
            sc.field_q = param13;
            rd.field_D = param6;
            if (null == sc.field_q.field_h) {
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            } else {
              try {
                bk.field_b = new hd(sc.field_q.field_h, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (param0 == 6623) {
          var2 = 0;
          L0: while (true) {
            if (param1.length() > var2) {
              var3 = param1.charAt(var2);
              if (uc.a(param0 + -854863799, (char) var3)) {
                var2++;
                var2++;
                var2++;
                continue L0;
              } else {
                if (!qm.a(57, (char) var3)) {
                  return true;
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final ne a(ne param0, boolean param1) {
        ne var3 = null;
        if (param1) {
            field_a = 16;
            if (param0 != null) {
                var3 = param0;
            } else {
                var3 = ((dj) this).field_e.field_c.field_a;
            }
            if (!(var3 != ((dj) this).field_e.field_c)) {
                ((dj) this).field_b = null;
                return null;
            }
            ((dj) this).field_b = var3.field_a;
            return var3;
        }
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((dj) this).field_e.field_c.field_a;
        }
        if (!(var3 != ((dj) this).field_e.field_c)) {
            ((dj) this).field_b = null;
            return null;
        }
        ((dj) this).field_b = var3.field_a;
        return var3;
    }

    final ne b(int param0) {
        ne var2 = null;
        var2 = ((dj) this).field_e.field_c.field_a;
        if (var2 != ((dj) this).field_e.field_c) {
          ((dj) this).field_b = var2.field_a;
          if (param0 != -1225818257) {
            ne discarded$2 = ((dj) this).a(-5);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((dj) this).field_b = null;
          return null;
        }
    }

    final ne a(boolean param0, ne param1) {
        ne var3 = null;
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((dj) this).field_e.field_c.field_e;
        }
        if (!param0) {
            return null;
        }
        if (!(var3 != ((dj) this).field_e.field_c)) {
            ((dj) this).field_b = null;
            return null;
        }
        ((dj) this).field_b = var3.field_e;
        return var3;
    }

    final ne d(int param0) {
        ne var2 = null;
        var2 = ((dj) this).field_b;
        if (((dj) this).field_e.field_c != var2) {
          ((dj) this).field_b = var2.field_a;
          if (param0 != 1834857157) {
            field_a = 46;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((dj) this).field_b = null;
          return null;
        }
    }

    final ne a(int param0) {
        ne var2 = null;
        var2 = ((dj) this).field_e.field_c.field_e;
        if (var2 == ((dj) this).field_e.field_c) {
          ((dj) this).field_b = null;
          return null;
        } else {
          if (param0 != -479592473) {
            field_c = null;
            ((dj) this).field_b = var2.field_e;
            return var2;
          } else {
            ((dj) this).field_b = var2.field_e;
            return var2;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 22) {
            Object var2 = null;
            dj.a(77, 24, 1L, 66, (String) null, -4, 49, 6, -5, true, 116, false, (byte) 34, (qg) null);
        }
    }

    final static String a(byte[] param0, boolean param1) {
        if (param1) {
            return null;
        }
        return mk.a((byte) -24, param0, param0.length, 0);
    }

    dj(md param0) {
        ((dj) this).field_e = param0;
    }

    final static void a(ec param0, byte param1) {
        int var2 = 0;
        dh.field_g = param0.k(0) << 1834857157;
        if (param1 < 122) {
          dj.a((byte) -97);
          var2 = param0.c(true);
          dh.field_g = dh.field_g + (var2 >> -243321085);
          cm.field_P = var2 << 1851436146 & 1835008;
          cm.field_P = cm.field_P + (param0.k(0) << 12313346);
          var2 = param0.c(true);
          fm.field_g = 2064384 & var2 << -1225818257;
          cm.field_P = cm.field_P + (var2 >> 2020859302);
          fm.field_g = fm.field_g + (param0.c(true) << -479592473);
          var2 = param0.c(true);
          fm.field_g = fm.field_g + (var2 >> -1683918239);
          ln.field_e = 65536 & var2 << -2032974512;
          ln.field_e = ln.field_e + param0.k(0);
          return;
        } else {
          var2 = param0.c(true);
          dh.field_g = dh.field_g + (var2 >> -243321085);
          cm.field_P = var2 << 1851436146 & 1835008;
          cm.field_P = cm.field_P + (param0.k(0) << 12313346);
          var2 = param0.c(true);
          fm.field_g = 2064384 & var2 << -1225818257;
          cm.field_P = cm.field_P + (var2 >> 2020859302);
          fm.field_g = fm.field_g + (param0.c(true) << -479592473);
          var2 = param0.c(true);
          fm.field_g = fm.field_g + (var2 >> -1683918239);
          ln.field_e = 65536 & var2 << -2032974512;
          ln.field_e = ln.field_e + param0.k(0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_d = -1;
        field_c = "Defence";
    }
}
