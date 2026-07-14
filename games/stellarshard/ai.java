/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ai implements Iterable {
    static nj[] field_d;
    static String field_g;
    private gg field_f;
    int field_b;
    static String[] field_a;
    gg[] field_e;
    static int field_c;

    final static void a(byte param0) {
        bk.a(12, kc.field_c, true, sb.field_a);
        ak.field_a = true;
        if (param0 <= 62) {
            Object var2 = null;
            String discarded$0 = ai.a((String) null, (String) null, (String) null, -14);
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = stellarshard.field_B;
        var4 = param0.length();
        if (param3 <= -41) {
          var5 = param1.length();
          var6 = param2.length();
          if (0 != var5) {
            var7 = var4;
            var8 = var6 + -var5;
            if (var8 != -1) {
              var9_int = 0;
              L0: while (true) {
                var9_int = param0.indexOf(param1, var9_int);
                if (-1 <= var9_int) {
                  var7 = var7 + var8;
                  var9_int = var9_int + var5;
                  continue L0;
                } else {
                  var9 = new StringBuilder(var7);
                  var10 = 0;
                  L1: while (true) {
                    var11 = param0.indexOf(param1, var10);
                    if (0 <= var11) {
                      StringBuilder discarded$6 = var9.append(param0.substring(var10, var11));
                      StringBuilder discarded$7 = var9.append(param2);
                      var10 = var11 + var5;
                      continue L1;
                    } else {
                      StringBuilder discarded$8 = var9.append(param0.substring(var10));
                      return var9.toString();
                    }
                  }
                }
              }
            } else {
              var9 = new StringBuilder(var7);
              var10 = 0;
              L2: while (true) {
                var11 = param0.indexOf(param1, var10);
                if (0 <= var11) {
                  StringBuilder discarded$9 = var9.append(param0.substring(var10, var11));
                  StringBuilder discarded$10 = var9.append(param2);
                  var10 = var11 + var5;
                  continue L2;
                } else {
                  StringBuilder discarded$11 = var9.append(param0.substring(var10));
                  return var9.toString();
                }
              }
            }
          } else {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, int param1, String param2, boolean param3) {
        jf.d(param1 ^ 0);
        na.field_d.e((byte) 16);
        af.field_r = new la(va.field_a, (String) null, gk.field_a, param3, param0);
        sf.field_f = new pg(na.field_d, (rj) (Object) af.field_r);
        na.field_d.a((byte) -128, (rj) (Object) sf.field_f);
        if (param1 != -1) {
            ai.a(100);
        }
    }

    final gg a(long param0, int param1) {
        gg var4 = null;
        gg var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        var4 = ((ai) this).field_e[(int)((long)(param1 + ((ai) this).field_b) & param0)];
        ((ai) this).field_f = var4.field_g;
        L0: while (true) {
          if (((ai) this).field_f != var4) {
            if ((((ai) this).field_f.field_j ^ -1L) == (param0 ^ -1L)) {
              var5 = ((ai) this).field_f;
              ((ai) this).field_f = ((ai) this).field_f.field_g;
              return var5;
            } else {
              ((ai) this).field_f = ((ai) this).field_f.field_g;
              continue L0;
            }
          } else {
            ((ai) this).field_f = null;
            return null;
          }
        }
    }

    final void a(byte param0, gg param1, long param2) {
        gg var5 = null;
        L0: {
          if (null != param1.field_c) {
            param1.c(20);
            break L0;
          } else {
            break L0;
          }
        }
        var5 = ((ai) this).field_e[(int)((long)(((ai) this).field_b + -1) & param2)];
        param1.field_g = var5;
        if (param0 <= 1) {
          ai.a((byte) 37);
          param1.field_c = var5.field_c;
          param1.field_c.field_g = param1;
          param1.field_g.field_c = param1;
          param1.field_j = param2;
          return;
        } else {
          param1.field_c = var5.field_c;
          param1.field_c.field_g = param1;
          param1.field_g.field_c = param1;
          param1.field_j = param2;
          return;
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ga((ai) this);
    }

    private ai() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_a = null;
        if (param0 != -1) {
            field_c = -21;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 100;
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
