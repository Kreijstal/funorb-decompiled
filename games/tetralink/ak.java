/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak {
    static hl field_a;
    static String field_b;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        int var1 = 30 / ((param0 - -27) / 49);
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = 0;
        byte[] var3 = null;
        var2 = param1.length;
        if (param0 != -14074) {
          return null;
        } else {
          var3 = new byte[var2];
          rd.a(param1, 0, var3, 0, var2);
          return var3;
        }
    }

    final static void a(byte param0, int param1) {
        try {
            if (null != wa.field_e) {
                // if_icmplt L34
                // if_acmpne L26
            } else {
                nd.field_Lb.field_t = 0;
                return;
            }
            if (param0 > -37) {
                boolean discarded$0 = ak.a(69);
            }
            if (0 == nd.field_Lb.field_t) {
                if (!((rj.field_n + 10000L ^ -1L) <= (k.a(0) ^ -1L))) {
                    nd.field_Lb.f(param1, (byte) -92);
                }
            }
            if (!(nd.field_Lb.field_t <= 0)) {
                try {
                    wa.field_e.a(true, nd.field_Lb.field_t, nd.field_Lb.field_u, 0);
                    rj.field_n = k.a(0);
                } catch (IOException iOException) {
                    mk.a(false);
                }
                nd.field_Lb.field_t = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1, float param2) {
        if (param0 != 0) {
            field_b = null;
            bn.field_a = param1;
            md.field_v = param2;
            return;
        }
        bn.field_a = param1;
        md.field_v = param2;
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 3058) {
          if (null == hd.field_s) {
            if (!vb.e(param0 + -34020)) {
              if (null == mm.field_y) {
                if (d.c((byte) 66)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_b = null;
          if (null == hd.field_s) {
            if (!vb.e(param0 + -34020)) {
              if (null == mm.field_y) {
                if (d.c((byte) 66)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
    }
}
