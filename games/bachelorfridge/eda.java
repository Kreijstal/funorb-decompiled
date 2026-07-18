/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eda extends kj {
    private lna field_h;
    private int field_f;
    static boolean field_j;
    static kia field_i;
    static sna field_k;
    private ee field_g;

    final boolean b(int param0) {
        if (param0 >= 21) {
          int fieldTemp$4 = ((eda) this).field_f + 12;
          ((eda) this).field_f = ((eda) this).field_f + 12;
          if (fieldTemp$4 >= bd.field_i.field_p) {
            return true;
          } else {
            return false;
          }
        } else {
          eda.c(-107);
          int fieldTemp$5 = ((eda) this).field_f + 12;
          ((eda) this).field_f = ((eda) this).field_f + 12;
          if (fieldTemp$5 >= bd.field_i.field_p) {
            return true;
          } else {
            return false;
          }
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_i = null;
        if (param0 != 60) {
            eda.a(18, -71, 96, true, -18);
        }
    }

    eda(gj param0, int param1, int param2, lna param3, ee param4) {
        super(param0, param1, param2);
        try {
            ((eda) this).field_g = param4;
            ((eda) this).field_h = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "eda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        kv discarded$0 = ((eda) this).field_h.e(66);
        kv var4 = lq.a(((eda) this).field_g, 8533, bd.field_i, (bd.field_i.field_p >> 1) - (((eda) this).field_f + 60), param1);
        var4.c(param2 + 16, -64 + (param0 - (40 - (((eda) this).field_f >> 1))), var4.field_q >> 1, var4.field_p >> 1);
        ((eda) this).field_g.a(param2, param0);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((eda) this).field_f = 11;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (!param3) {
          if (param1 + -param2 >= eo.field_l) {
            if (param1 + param2 <= pw.field_x) {
              if (an.field_q <= -param2 + param0) {
                if (param0 + param2 <= ha.field_n) {
                  ana.a(true, param4, param1, param2, param0);
                  return;
                } else {
                  wu.a(param4, param0, param2, param1, (byte) -23);
                  return;
                }
              } else {
                wu.a(param4, param0, param2, param1, (byte) -23);
                return;
              }
            } else {
              wu.a(param4, param0, param2, param1, (byte) -23);
              return;
            }
          } else {
            wu.a(param4, param0, param2, param1, (byte) -23);
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
