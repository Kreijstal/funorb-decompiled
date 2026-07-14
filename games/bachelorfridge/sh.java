/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sh extends vd implements mca {
    private gl field_F;
    static String field_D;
    static String[] field_E;
    static String field_H;
    static boolean field_I;
    static aj[] field_C;
    static ee[] field_G;

    abstract int d(byte param0);

    void a(gl param0, byte param1) {
        if (param1 <= 111) {
            return;
        }
        ((sh) this).field_F = param0;
        ((sh) this).field_F.field_e = (sh) this;
    }

    final static void l(int param0) {
        int var1 = 0;
        pf var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        pf var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
        int[] var12 = null;
        cfa var13 = null;
        kka var14 = null;
        kka var15 = null;
        var9 = BachelorFridge.field_y;
        var1 = -96 / ((19 - param0) / 53);
        var2 = ig.field_m;
        var3 = var2.b(16711935);
        if (var3 != 0) {
          if ((var3 ^ -1) != -2) {
            if (var3 == 2) {
              var15 = (kka) (Object) gs.field_l.b((byte) 90);
              if (var15 == null) {
                vc.a((byte) -100);
                return;
              } else {
                var15.field_m = vv.a((byte) 113);
                var15.field_j = true;
                var15.a(false);
                return;
              }
            } else {
              cv.a(1, "A1: " + nia.d((byte) -108), (Throwable) null);
              vc.a((byte) -115);
              return;
            }
          } else {
            var13 = (cfa) (Object) eaa.field_d.b((byte) 90);
            if (var13 == null) {
              vc.a((byte) -99);
              return;
            } else {
              var13.a(false);
              return;
            }
          }
        } else {
          var12 = vv.a((byte) 123);
          var4 = var12;
          var11 = var12;
          var5 = var11;
          var6 = var2;
          var7 = ((lu) (Object) var6).b(16711935);
          var8 = 0;
          L0: while (true) {
            if (var7 <= var8) {
              var14 = (kka) (Object) gs.field_l.b((byte) 90);
              if (var14 == null) {
                vc.a((byte) -70);
                return;
              } else {
                var14.field_m = var4;
                var14.field_j = true;
                var14.a(false);
                return;
              }
            } else {
              var11[var8] = ((lu) (Object) var6).f(-61);
              var8++;
              continue L0;
            }
          }
        }
    }

    abstract boolean k(int param0);

    sh(int param0, int param1, int param2, int param3, qda param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract int f(byte param0);

    public final qu a(int param0) {
        if (param0 != 16728128) {
            return null;
        }
        return (qu) (Object) ((sh) this).field_F;
    }

    public static void e(byte param0) {
        field_G = null;
        field_E = null;
        field_H = null;
        field_C = null;
        if (param0 != -92) {
            return;
        }
        field_D = null;
    }

    abstract int j(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_H = "Show all private chat";
        field_I = true;
        field_D = "Passwords can only contain letters and numbers";
    }
}
