/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fe {
    static int field_d;
    static rh field_a;
    static int field_k;
    private static ck field_h;
    static rf field_e;
    static na field_j;
    static int field_f;
    private java.util.zip.Inflater field_i;
    static boolean field_b;
    static int field_g;
    static float field_c;

    public static void c(int param0) {
        field_h = null;
        int var1 = 122 % ((param0 - -22) / 63);
        field_j = null;
        field_e = null;
        field_a = null;
    }

    final void a(int param0, qc param1, byte[] param2) {
        try {
            if (param1.field_j[param1.field_f] == 31) {
                // if_icmpne L45
            } else {
                throw new RuntimeException("");
            }
            if (((fe) this).field_i == null) {
                ((fe) this).field_i = new java.util.zip.Inflater(true);
            }
            try {
                ((fe) this).field_i.setInput(param1.field_j, param1.field_f - -10, param1.field_j.length - 8 - (param1.field_f + 10));
                if (param0 != -1) {
                    ck[] discarded$0 = fe.a(76);
                }
                int discarded$1 = ((fe) this).field_i.inflate(param2);
            } catch (Exception exception) {
                ((fe) this).field_i.reset();
                throw new RuntimeException("");
            }
            ((fe) this).field_i.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(int param0) {
        if (param0 <= 103) {
            return 4;
        }
        return qe.field_a;
    }

    final static ck[] a(int param0) {
        if (param0 != -1) {
          field_c = -1.1302366256713867f;
          return new ck[]{pj.field_g, w.field_d, ab.field_c, wg.field_d, lj.field_e, s.field_E, cd.field_i, wh.field_t, qj.field_a, fk.field_B, am.field_d, bd.field_c, va.field_f, field_h};
        } else {
          return new ck[]{pj.field_g, w.field_d, ab.field_c, wg.field_d, lj.field_e, s.field_E, cd.field_i, wh.field_t, qj.field_a, fk.field_B, am.field_d, bd.field_c, va.field_f, field_h};
        }
    }

    public fe() {
        this(-1, 1000000, 1000000);
    }

    final static nd a(String param0, boolean param1) {
        int var2 = 0;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        nd var7 = null;
        int var8 = 0;
        var8 = Geoblox.field_C;
        if (!param1) {
          var2 = param0.length();
          if (-1 != (var2 ^ -1)) {
            if (255 < var2) {
              return hk.field_x;
            } else {
              var3 = uj.a('.', true, param0);
              if ((var3.length ^ -1) <= -3) {
                var4 = var3;
                var5 = 0;
                L0: while (true) {
                  if (var4.length > var5) {
                    var6 = var4[var5];
                    var7 = jk.a(255, var6);
                    if (var7 != null) {
                      return var7;
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    return mj.a(var3[-1 + var3.length], (byte) -97);
                  }
                }
              } else {
                return pj.field_f;
              }
            }
          } else {
            return pj.field_f;
          }
        } else {
          return null;
        }
    }

    private fe(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_f = 7;
        field_h = new ck(15, 0, 1, 0);
    }
}
