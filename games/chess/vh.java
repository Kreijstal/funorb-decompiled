/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh {
    static String field_f;
    static String[] field_b;
    static int field_g;
    static boolean field_e;
    static String field_h;
    static String field_d;
    static String field_a;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        if (-14 == (vg.field_a ^ -1)) {
          kf.a(-87);
          return true;
        } else {
          if (102 == vg.field_a) {
            tl.field_Fb.n(-70);
            return true;
          } else {
            if (param0 >= 1) {
              if (null != tl.field_Fb) {
                if (!tl.field_Fb.b((byte) -63, param2, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              boolean discarded$7 = vh.a(-29, -66, -74);
              if (null != tl.field_Fb) {
                if (!tl.field_Fb.b((byte) -63, param2, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_d = null;
        field_h = null;
        field_f = null;
        field_b = null;
        if (param0 != 102) {
          var2 = null;
          byte[] discarded$2 = vh.a((byte) 46, (String) null);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(int param0, byte param1) {
        try {
            IOException iOException = null;
            int var2 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var2 = 94 / ((16 - param1) / 37);
              if (lj.field_a == null) {
                break L0;
              } else {
                L1: {
                  if ((param0 ^ -1) > -1) {
                    break L1;
                  } else {
                    if (tb.field_f == ik.field_e) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (qn.field_U.field_l != 0) {
                    break L2;
                  } else {
                    if ((10000L + ta.field_t ^ -1L) > (ud.a(2) ^ -1L)) {
                      qn.field_U.f(param0, -105);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 > (qn.field_U.field_l ^ -1)) {
                    try {
                      lj.field_a.a(0, qn.field_U.field_l, (byte) -92, qn.field_U.field_o);
                      ta.field_t = ud.a(2);
                    } catch (java.io.IOException decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    iOException = (IOException) (Object) decompiledCaughtException;
                    si.d(65280);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                qn.field_U.field_l = 0;
              }
            }
            qn.field_U.field_l = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte param0, String param1) {
        if (param0 <= 41) {
            field_d = null;
            return jj.field_e.a("", 30045, param1);
        }
        return jj.field_e.a("", 30045, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "2D MODE";
        field_h = "Set up new game";
        field_a = "You have been removed from <%0>'s game.";
        field_d = "Options";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
