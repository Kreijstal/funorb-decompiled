/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends fb {
    static String field_G;
    static int field_J;
    private fn field_K;
    private int field_E;
    static String field_I;
    private String field_D;
    private fn field_H;
    static op field_F;

    final static eo a(String[] args, int param1) {
        eo var2 = null;
        var2 = new eo(false);
        var2.field_g = args;
        if (param1 > -76) {
          field_F = null;
          return var2;
        } else {
          return var2;
        }
    }

    public static void i(int param0) {
        field_I = null;
        int var1 = -63 % ((-43 - param0) / 34);
        field_G = null;
        field_F = null;
    }

    ao(int param0, int param1, int param2, boolean param3) {
        super(param0, param1, 0);
        ((ao) this).field_K = null;
        ((ao) this).field_H = null;
        ((ao) this).field_D = Integer.toString(param2);
        ((ao) this).field_E = 255;
        if (!param3) {
            ((ao) this).field_K = kh.a(55, false);
        }
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = param1.a(((ao) this).a(true), (byte) -94);
        var4 = param1.a(((ao) this).f(237239984), 0);
        if (param0 < -76) {
          sg.field_jb.b(((ao) this).field_D, var3, var4, 3, -1, ((ao) this).field_E);
          if (((ao) this).field_K != null) {
            if (!((ao) this).field_K.l()) {
              var5 = pj.a(var4, 47, var3);
              ((ao) this).field_K.h(var5);
              if (((ao) this).field_H == null) {
                return;
              } else {
                ((ao) this).field_H.h(var5);
                return;
              }
            } else {
              ((ao) this).field_H = null;
              ((ao) this).field_K = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void g(int param0) {
        if (-1 > (((ao) this).field_E ^ -1)) {
          ((ao) this).field_x = ((ao) this).field_x - 131072;
          ((ao) this).field_E = ((ao) this).field_E - 7;
          if (-1 < (((ao) this).field_E ^ -1)) {
            ((ao) this).field_E = 0;
            if (param0 < 95) {
              ((ao) this).field_H = null;
              return;
            } else {
              return;
            }
          } else {
            if (param0 >= 95) {
              return;
            } else {
              ((ao) this).field_H = null;
              return;
            }
          }
        } else {
          ((ao) this).b(-27598);
          if (param0 >= 95) {
            return;
          } else {
            ((ao) this).field_H = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Names can only contain letters, numbers, spaces and underscores";
        field_I = "Waiting for sound effects";
        field_J = -1;
    }
}
