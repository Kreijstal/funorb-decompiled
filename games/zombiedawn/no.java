/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends fb {
    static int[] field_G;
    private int field_F;
    private int field_D;
    static String field_E;

    no(int param0, int param1) {
        super(param0, param1, 0);
        ((no) this).field_F = 0;
    }

    final static void f(byte param0) {
        sl.field_d = null;
        bo.field_o = null;
        j.field_a = null;
        vj.field_m = null;
        bn.field_c = null;
        if (param0 >= -15) {
            return;
        }
        uf.field_n = null;
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        var3 = param1.a(((no) this).a(true), (byte) -91);
        var4 = param1.a(((no) this).f(237239984), 0) + -183;
        if (0 == ((no) this).field_F) {
          return;
        } else {
          var5 = fb.a(1311979239, (int)(3L * tp.field_p << 1634640069)) >> 1144700303;
          var6 = 7;
          var7 = -var6 + var3;
          var8 = -1 + (var3 - -var6);
          g.a(var4, (byte) 99, 3 + var8, var4 - -((no) this).field_F, -2 + var7);
          var9 = 0;
          bi.e(var7, var4, -var5 + var7, -2 + (var4 - -((no) this).field_F), var9);
          bi.e(var7 - -1, var4, 1 + (-var5 + var7), ((no) this).field_F + var4, var9);
          bi.e(var7 + 2, var4, 2 + (var7 + -var5), -2 + var4 + ((no) this).field_F, var9);
          bi.e(var8, var4, var8 - var5, -2 + (var4 - -((no) this).field_F), var9);
          bi.e(var8 - 1, var4, -var5 + var8 + -1, ((no) this).field_F + var4, var9);
          bi.e(var8 - 2, var4, var8 + (-var5 + -2), -2 + ((no) this).field_F + var4, var9);
          var10 = -3 + ((no) this).field_F + var4;
          L0: while (true) {
            if (var4 > var10) {
              pa.a(-21189);
              if (param0 > -76) {
                no.f((byte) -110);
                return;
              } else {
                return;
              }
            } else {
              bi.b(var7 - -2, var10, -3 + 2 * var6, var9);
              var10 -= 7;
              continue L0;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_G = null;
        if (!param0) {
            no.b(false);
            field_E = null;
            return;
        }
        field_E = null;
    }

    final void g(int param0) {
        if (param0 >= 95) {
          if (hp.field_A.a(true) > 18 + ((no) this).a(true)) {
            if (159 > ((no) this).field_F) {
              int fieldTemp$4 = ((no) this).field_D - 1;
              ((no) this).field_D = ((no) this).field_D - 1;
              if (-1 > (fieldTemp$4 ^ -1)) {
                return;
              } else {
                ((no) this).field_F = ((no) this).field_F + 1;
                ((no) this).field_D = 1;
                return;
              }
            } else {
              return;
            }
          } else {
            int fieldTemp$5 = ((no) this).field_D - 1;
            ((no) this).field_D = ((no) this).field_D - 1;
            if (fieldTemp$5 > 0) {
              return;
            } else {
              hp.field_A.field_x = hp.field_A.field_x - 65536;
              ((no) this).field_F = ((no) this).field_F - 1;
              ((no) this).field_D = 1;
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new int[]{230, 150, 180, 100};
        field_E = "Checking";
    }
}
