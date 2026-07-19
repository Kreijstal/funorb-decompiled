/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static vn field_f;
    static volatile int field_c;
    private int field_a;
    private nb[] field_i;
    static int field_g;
    private nb field_d;
    private long field_e;
    static ug field_b;
    static char[] field_h;

    final nb a(int param0, long param1) {
        nb var4 = null;
        nb var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        this.field_e = param1;
        if (param0 == 93) {
          var4 = this.field_i[(int)((long)(this.field_a + -1) & param1)];
          this.field_d = var4.field_i;
          L0: while (true) {
            if (var4 == this.field_d) {
              this.field_d = null;
              return null;
            } else {
              if (this.field_d.field_n != param1) {
                this.field_d = this.field_d.field_i;
                continue L0;
              } else {
                var5 = this.field_d;
                this.field_d = this.field_d.field_i;
                return var5;
              }
            }
          }
        } else {
          pf.a((byte) -112);
          var4 = this.field_i[(int)((long)(this.field_a + -1) & param1)];
          this.field_d = var4.field_i;
          L1: while (true) {
            if (var4 == this.field_d) {
              this.field_d = null;
              return null;
            } else {
              if (this.field_d.field_n != param1) {
                this.field_d = this.field_d.field_i;
                continue L1;
              } else {
                var5 = this.field_d;
                this.field_d = this.field_d.field_i;
                return var5;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        if (param0 != 88) {
            field_g = 58;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final nb b(byte param0) {
        nb var3 = null;
        int var4 = ZombieDawn.field_J;
        if (null == this.field_d) {
            return null;
        }
        nb var2 = this.field_i[(int)((long)(-1 + this.field_a) & this.field_e)];
        while (this.field_d != var2) {
            if (this.field_d.field_n == this.field_e) {
                var3 = this.field_d;
                this.field_d = this.field_d.field_i;
                return var3;
            }
            this.field_d = this.field_d.field_i;
        }
        if (param0 >= -96) {
            this.field_a = 125;
            this.field_d = null;
            return null;
        }
        this.field_d = null;
        return null;
    }

    final void a(int param0, long param1, nb param2) {
        nb var5 = null;
        try {
            if (!(null == param2.field_h)) {
                param2.c((byte) -53);
            }
            var5 = this.field_i[(int)((long)(this.field_a - param0) & param1)];
            param2.field_h = var5.field_h;
            param2.field_i = var5;
            param2.field_h.field_i = param2;
            param2.field_n = param1;
            param2.field_i.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "pf.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    pf(int param0) {
        int var2 = 0;
        nb dupTemp$0 = null;
        nb var3 = null;
        this.field_i = new nb[param0];
        this.field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new nb();
            var3 = dupTemp$0;
            this.field_i[var2] = dupTemp$0;
            var3.field_i = var3;
            var3.field_h = var3;
        }
    }

    static {
        field_c = 0;
        field_h = new char[]{(char)91, (char)93, (char)35};
    }
}
