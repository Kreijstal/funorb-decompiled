/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hh extends ai {
    int field_g;
    static byte[][] field_r;
    int field_j;
    static int[] field_h;
    int[] field_i;
    static boolean field_k;
    int[] field_l;
    static byte[] field_q;
    static ii field_p;
    mk[] field_n;
    int[] field_o;
    byte[][][] field_m;
    mk[] field_s;

    final static void a(int param0, String param1) {
        if (param0 != 0) {
            hh.a(true);
            mc.field_d = param1;
            return;
        }
        mc.field_d = param1;
    }

    final static void b(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = Bounce.field_N;
              if (null != tb.field_p) {
                tb.field_p.a(param0 + -134);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (hb.field_F == null) {
                break L1;
              } else {
                hb.field_F.d(-1);
                break L1;
              }
            }
            L2: {
              if (jg.field_C == null) {
                break L2;
              } else {
                try {
                  jg.field_C.b(-747969087);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  iOException = (IOException) (Object) decompiledCaughtException;
                }
                break L2;
              }
            }
            if (pd.field_a != null) {
              var1 = 0;
              L3: while (true) {
                if (pd.field_a.length > var1) {
                  if (null != pd.field_a[var1]) {
                    try {
                      pd.field_a[var1].b(-747969087);
                      var1++;
                      var1++;
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var2 = (IOException) (Object) decompiledCaughtException;
                      var1++;
                    }
                    continue L3;
                  } else {
                    var1++;
                    var1++;
                    continue L3;
                  }
                } else {
                  if (param0 != 48) {
                    hh.a(false);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0 != 48) {
                hh.a(false);
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(ve param0, ve param1, byte param2) {
        Object var4 = null;
        if (param2 < 37) {
          field_k = true;
          var4 = null;
          return vb.a(false, (String) null, -89, 0, param1, 0, param0);
        } else {
          var4 = null;
          return vb.a(false, (String) null, -89, 0, param1, 0, param0);
        }
    }

    public static void a(boolean param0) {
        field_r = null;
        if (param0) {
          field_k = false;
          field_p = null;
          field_q = null;
          field_h = null;
          return;
        } else {
          field_p = null;
          field_q = null;
          field_h = null;
          return;
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        pb.field_j = param0;
        ed.field_d = param2;
        k.field_D = param3;
        qd.field_b = param1;
        if (param4 != 0) {
            field_h = null;
        }
    }

    final static void c(byte param0) {
        if (param0 != -60) {
            field_q = null;
            oh.a(94, 17);
            return;
        }
        oh.a(94, 17);
    }

    hh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new byte[50][];
        field_h = new int[4];
        field_k = false;
    }
}
