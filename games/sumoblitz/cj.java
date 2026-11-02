/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int[] field_e;
    private int[] field_d;
    static String[] leaderboardSortLabels;
    private int[] field_g;
    private int field_a;
    private long field_f;
    private int field_b;

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_e = null;
        leaderboardSortLabels = null;
    }

    final void a(bk param0, int param1) {
        GraphicsToolkit var4 = null;
        GraphicsToolkit var3 = null;
        try {
          var4 = param0.field_g;
          var3 = var4;
          var4.KA(this.field_g[0], this.field_g[1], this.field_g[2], this.field_g[param1]);
          var4.DA(this.field_d[0], this.field_d[1], this.field_d[2], this.field_d[3]);
          var3.f(this.field_b, this.field_a);
          param0.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "cj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, bk param1) {
        GraphicsToolkit var3 = null;
        try {
          var3 = param1.field_g;
          var3.K(this.field_g);
          if (param0 >= -106) {
            this.field_a = -2;
          }
          this.field_d = var3.Y();
          this.field_b = var3.i();
          this.field_a = var3.XA();
          this.field_f = param1.field_f;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "cj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    cj() {
        this.field_g = new int[4];
    }

    static {
        field_e = new int[]{0, 0, 1, 2, 0, 3, 0, 4, 0, 5, 6, 7, 0, 8, 9, 10, 0, 11, 0, 12, 0, 13, 14, 15, 0};
        leaderboardSortLabels = new String[]{"By rating", "By win percentage"};
    }
}
