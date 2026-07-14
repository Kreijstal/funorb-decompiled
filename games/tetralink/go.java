/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class go {
    static hl field_d;
    static int[] field_b;
    private java.util.zip.Inflater field_f;
    static boolean field_c;
    static String field_e;
    static tb field_a;
    static de field_g;

    public static void b(byte param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_g = null;
        if (param0 != 57) {
            field_g = null;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        L0: {
          if ((jj.field_a ^ -1) > -225) {
            var1 = jj.field_a % 32;
            ve.a(32 + jj.field_a + -var1, param0 + -27);
            break L0;
          } else {
            ve.a(256, 51);
            break L0;
          }
        }
        if (param0 != 127) {
          field_g = null;
          return;
        } else {
          return;
        }
    }

    final static ng a(boolean param0, int param1, ah param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = param2.a(0, param1);
        var3 = var4;
        if (param0) {
          if (var4 == null) {
            return null;
          } else {
            return new ng(var4);
          }
        } else {
          return null;
        }
    }

    final static void c(byte param0) {
        Object var2 = null;
        L0: {
          hi.field_a = false;
          if (null != gl.field_o) {
            gl.field_o.i(20424);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0 != sf.field_d) {
            hi.b(-77);
            break L1;
          } else {
            break L1;
          }
        }
        d.field_e = 0;
        if (param0 != 42) {
          var2 = null;
          ng discarded$2 = go.a(false, 4, (ah) null);
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dc.field_e.field_jb = param1;
        hm.field_b = true;
        var2 = pk.field_O.field_h;
        var3 = pk.field_O.field_j;
        if (param0 != -105) {
          field_e = null;
          var4 = dc.field_e.field_Ib.b(param1, 272, dc.field_e.field_Q);
          var5 = -(var4 / 2) + 7 + var3 / 2 + -110;
          t.field_q.a((byte) -117, 320, var5, -(2 * var5) + -120 + var3, (-320 + var2) / 2);
          t.field_q.field_Eb = ah.a(2105376, 3, 8421504, param0 ^ -121, 11579568, t.field_q.field_R);
          dc.field_e.a((byte) -92, -48 + t.field_q.field_Hb, 16, -24 + t.field_q.field_R + -20, 24);
          wb.field_a.a((byte) -124, 80, -20 + (t.field_q.field_R - 24), 24, 120);
          return;
        } else {
          var4 = dc.field_e.field_Ib.b(param1, 272, dc.field_e.field_Q);
          var5 = -(var4 / 2) + 7 + var3 / 2 + -110;
          t.field_q.a((byte) -117, 320, var5, -(2 * var5) + -120 + var3, (-320 + var2) / 2);
          t.field_q.field_Eb = ah.a(2105376, 3, 8421504, param0 ^ -121, 11579568, t.field_q.field_R);
          dc.field_e.a((byte) -92, -48 + t.field_q.field_Hb, 16, -24 + t.field_q.field_R + -20, 24);
          wb.field_a.a((byte) -124, 80, -20 + (t.field_q.field_R - 24), 24, 120);
          return;
        }
    }

    final void a(byte param0, byte[] param1, bh param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param2.field_u[param2.field_t] != 31) {
                break L0;
              } else {
                if (param2.field_u[1 + param2.field_t] == -117) {
                  L1: {
                    if (null == ((go) this).field_f) {
                      ((go) this).field_f = new java.util.zip.Inflater(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      if (param0 >= 70) {
                        break L2;
                      } else {
                        field_g = null;
                        break L2;
                      }
                    }
                    ((go) this).field_f.setInput(param2.field_u, param2.field_t - -10, -10 + -param2.field_t + (-8 + param2.field_u.length));
                    int discarded$2 = ((go) this).field_f.inflate(param1);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((go) this).field_f.reset();
                  throw new RuntimeException("");
                } else {
                  break L0;
                }
              }
            }
            throw new RuntimeException("");
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private go(int param0, int param1, int param2) {
    }

    public go() {
        this(-1, 1000000, 1000000);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Invite";
    }
}
