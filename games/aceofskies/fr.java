/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fr {
    String field_f;
    static char field_e;
    String[] field_c;
    boolean field_b;
    boolean field_d;
    int field_a;

    final static void a(float param0, float param1, int param2, float param3, float param4, int param5, byte[] param6, int param7, int param8, float param9, int param10, int param11, ai param12) {
        int var13 = 0;
        for (var13 = param2; param5 > var13; var13++) {
            qh.a(param2 + 2, param12, param10, param0, param9, param4, param1, param11, param5, param6, param3, var13, param8, param7);
            param11 = param11 + param7 * param8;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 == 0) {
          if (param0) {
            L0: {
              gq.field_e = gq.field_e + 1;
              us.a(param1 + 2069944240);
              if (param2) {
                ef.field_m = ef.field_m + 1;
                er.a((byte) -128);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (param2) {
                ef.field_m = ef.field_m + 1;
                er.a((byte) -128);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          field_e = 'L';
          if (!param0) {
            L2: {
              if (param2) {
                ef.field_m = ef.field_m + 1;
                er.a((byte) -128);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              gq.field_e = gq.field_e + 1;
              us.a(param1 + 2069944240);
              if (param2) {
                ef.field_m = ef.field_m + 1;
                er.a((byte) -128);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            if (null != ft.field_l) {
                // if_icmplt L34
                // if_acmpne L26
            } else {
                q.field_p.field_g = 0;
                return;
            }
            if (param0 >= -12) {
                fr.a(36, 96);
            }
            if (q.field_p.field_g == 0) {
                if (!(10000L + co.field_e >= kh.a(-64))) {
                    q.field_p.g(44, param1);
                }
            }
            if (0 < q.field_p.field_g) {
                try {
                    ft.field_l.a(q.field_p.field_g, 0, 76, q.field_p.field_f);
                    co.field_e = kh.a(-84);
                } catch (IOException iOException) {
                    te.b(true);
                }
                q.field_p.field_g = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    fr(boolean param0) {
        ((fr) this).field_b = param0 ? true : false;
    }

    static {
    }
}
