/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class d extends ca {
    int field_i;
    static boolean field_g;
    static boolean field_k;
    static String field_h;
    static int field_j;
    int field_f;

    final static void b(byte param0) {
        if (param0 <= -31) {
          if (bm.field_d != null) {
            bm.field_d.l(-113);
          }
          if (na.field_c != null) {
            na.field_c.p(1);
          }
          pf.a(104);
          return;
        }
    }

    final static int d(byte param0) {
        try {
          int stackIn_17_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_34_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          mg var2 = null;
          if (param0 > -86) {
            return 21;
          }
          if (kg.field_h.field_b >= 4) {
            if (-1 == kg.field_h.field_n) {
              return 3;
            }
            if (-2 == kg.field_h.field_n) {
              return 4;
            }
            return 1;
          }
          try {
            if (mc.field_j == 0) {
              cf.field_a = lh.field_b.a(ta.field_z, 0, fm.field_c);
              mc.field_j = mc.field_j + 1;
            }
            if (mc.field_j == 1) {
              if (cf.field_a.field_a == 2) {
                stackIn_17_0 = kk.a(-30179, -1);
                return stackIn_17_0;
              }
              if (1 == cf.field_a.field_a) {
                mc.field_j = mc.field_j + 1;
              }
            }
            if (2 == mc.field_j) {
              dd.field_A = new cb((java.net.Socket) (cf.field_a.field_g), lh.field_b);
              var2 = new mg(13);
              nl.a(20994, hc.field_f, tk.field_m, var2, s.field_x);
              var2.a(15, -49);
              var2.b(m.field_b, -1);
              dd.field_A.a((byte) 30, var2.field_j, 0, 13);
              mc.field_j = mc.field_j + 1;
              n.field_b = 30000L + ji.b(-75);
            }
            if (mc.field_j == 3) {
              if (dd.field_A.b((byte) 101) > 0) {
                var1_int = dd.field_A.a(true);
                if (var1_int != 0) {
                  stackIn_30_0 = kk.a(-30179, var1_int);
                  return stackIn_30_0;
                }
                mc.field_j = mc.field_j + 1;
              } else {
                if (ji.b(103) > n.field_b) {
                  stackIn_26_0 = kk.a(-30179, -2);
                  return stackIn_26_0;
                }
              }
            }
            if (4 != mc.field_j) {
              stackIn_36_0 = -1;
              return stackIn_36_0;
            }
            kg.field_h.a(dd.field_A, 20, il.field_a);
            dd.field_A = null;
            cf.field_a = null;
            mc.field_j = 0;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return kk.a(-30179, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 >= -117) {
          return;
        }
        field_h = null;
    }

    final static void c(byte param0) {
        ck.field_j = new rf();
        kg.field_j.a(false, ck.field_j);
        if (param0 >= -65) {
          field_h = (String) null;
        }
    }

    private d() throws Throwable {
        throw new Error();
    }

    static {
        field_g = false;
        field_h = "Norb Strength<br><%0>";
        field_k = true;
    }
}
