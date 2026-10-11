/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wb extends l {
    static String field_l;
    long field_j;
    static String field_n;
    wb field_h;
    static String field_g;
    static String field_i;
    static km field_m;
    wb field_k;

    final void c(int param0) {
        if (this.field_k == null) {
          return;
        }
        if (param0 >= 10) {
          this.field_k.field_h = this.field_h;
          this.field_h.field_k = this.field_k;
          this.field_k = null;
          this.field_h = null;
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 == 1) {
          return this.field_k != null ? true : false;
        }
        field_n = (String) null;
        if (this.field_k == null) {
          return false;
        }
        return true;
    }

    final void a(int param0, long param1) {
        if (this.field_k != null) {
          throw new RuntimeException();
        }
        if (param0 != 0) {
          return;
        }
        this.field_j = param1;
    }

    final static void a(int param0, int param1) {
        hg var2 = gk.field_g;
        var2.g(param0, 8);
        var2.a(1, param1 + 62);
        var2.a(param1, 80);
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (param0) {
          df.b(0, 0, df.field_e, df.field_f, 0, 192);
          ci.b(param0, -126);
          var3 = -121 / ((79 - param1) / 35);
          return;
        }
        df.c();
        ci.b(param0, -126);
        var3Lifetime1 = -121 / ((79 - param1) / 35);
    }

    public static void c(boolean param0) {
        field_n = null;
        field_g = null;
        field_m = null;
        if (param0) {
          field_i = null;
          field_l = null;
          return;
        }
        field_i = (String) null;
        field_i = null;
        field_l = null;
    }

    final long a(byte param0) {
        if (param0 <= 12) {
          this.field_j = 6L;
          return this.field_j;
        }
        return this.field_j;
    }

    protected wb() {
    }

    static {
        field_n = "Show chat";
        field_l = "New Game";
        field_i = "Orb coins: ";
        field_g = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
