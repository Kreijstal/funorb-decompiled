/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends fb {
    private int field_G;
    private int field_F;
    static String field_D;
    private int field_E;
    int field_H;

    final void g(int param0) {
        if (param0 > 95) {
          if (((lm) this).field_H <= 0) {
            return;
          } else {
            ((lm) this).field_H = ((lm) this).field_H - 3;
            int fieldTemp$4 = ((lm) this).field_F + 1;
            ((lm) this).field_F = ((lm) this).field_F + 1;
            if (fieldTemp$4 > ((lm) this).field_G) {
              ((lm) this).field_F = 0;
              int fieldTemp$5 = ((lm) this).field_E + 1;
              ((lm) this).field_E = ((lm) this).field_E + 1;
              if (fieldTemp$5 >= ob.field_c.length) {
                ((lm) this).field_E = 0;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void i(int param0) {
        field_D = null;
    }

    final static boolean f(byte param0) {
        if (param0 > 124) {
          if (rn.field_b != null) {
            if (!rn.field_b.c(119)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = lm.f((byte) 23);
          if (rn.field_b != null) {
            if (!rn.field_b.c(119)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0, wk param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
            var3_int = param1.a(((lm) this).field_y >> 16, (byte) -96);
            if (param0 >= -76) {
                boolean discarded$0 = lm.f((byte) -99);
            }
            var4 = param1.a(((lm) this).field_x >> 16, 0) + -((lm) this).field_H;
            ob.field_c[((lm) this).field_E].b(var3_int, var4);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "lm.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    lm(int param0, int param1, int param2) {
        super(param0, param1, 0);
        ((lm) this).field_G = 20;
        ((lm) this).field_H = param2 + 150;
        ((lm) this).field_G = so.c(3) - -3;
        ((lm) this).field_F = so.c(((lm) this).field_G);
        ((lm) this).field_E = so.c(5);
        int discarded$0 = so.a(pi.field_k);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Type your age in years";
    }
}
