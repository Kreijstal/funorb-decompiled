/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qd {
    private java.util.zip.Inflater field_b;
    static qj field_d;
    static String[] field_e;
    static int[] field_a;
    static String field_c;

    final void a(oa param0, int param1, byte[] param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (-32 != (param0.field_g[param0.field_h] ^ -1)) {
                break L0;
              } else {
                if ((param0.field_g[1 + param0.field_h] ^ -1) == 116) {
                  L1: {
                    if (param1 < -106) {
                      break L1;
                    } else {
                      qd.b(51);
                      break L1;
                    }
                  }
                  L2: {
                    if (null != ((qd) this).field_b) {
                      break L2;
                    } else {
                      ((qd) this).field_b = new java.util.zip.Inflater(true);
                      break L2;
                    }
                  }
                  try {
                    ((qd) this).field_b.setInput(param0.field_g, param0.field_h + 10, param0.field_g.length + -10 + (-param0.field_h + -8));
                    int discarded$2 = ((qd) this).field_b.inflate(param2);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((qd) this).field_b.reset();
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

    public qd() {
        this(-1, 1000000, 1000000);
    }

    private qd(int param0, int param1, int param2) {
    }

    final static void a(int param0) {
        fd.field_h[4] = new int[1];
        int var1 = -67 / ((param0 - -11) / 43);
        ej.field_l[4] = new vg(4);
        tg.a(2, 43, new int[4], (byte) 98, 400, 30, 396);
        ej.field_l[2] = new vg(2);
    }

    final static byte[] a(int param0, String param1) {
        if (param0 != 10) {
            field_c = null;
            return uj.field_h.a(param1, (byte) 102, "");
        }
        return uj.field_h.a(param1, (byte) 102, "");
    }

    public static void c(int param0) {
        field_d = null;
        field_c = null;
        if (param0 <= 7) {
          field_a = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static void b(int param0) {
        Object var2 = null;
        if (null != ub.field_c) {
          gd.a((java.awt.Canvas) (Object) ub.field_c, (byte) 106);
          ub.field_c.a(-100, lk.field_b);
          if (param0 != 5) {
            L0: {
              var2 = null;
              boolean discarded$2 = qd.a((ci) null, (byte) 107);
              ub.field_c = null;
              if (vg.field_b != null) {
                vg.field_b.c((byte) -126);
                break L0;
              } else {
                break L0;
              }
            }
            gd.field_k.requestFocus();
            return;
          } else {
            L1: {
              ub.field_c = null;
              if (vg.field_b != null) {
                vg.field_b.c((byte) -126);
                break L1;
              } else {
                break L1;
              }
            }
            gd.field_k.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(ci param0, byte param1) {
        int var2 = -52 % ((-18 - param1) / 34);
        return param0.c(32031);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new qj();
        field_e = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = "Please try again in a few minutes.";
    }
}
