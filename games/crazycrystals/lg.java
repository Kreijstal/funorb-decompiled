/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    private db field_a;
    private db field_c;
    static String field_e;
    private b field_d;
    static int field_b;

    final static void a(int param0) {
        pe var1 = (pe) (ok.field_a.d(-125));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        kh.a(var1.field_k, var1.field_g, var1.field_m);
        kh.d(var1.field_f, var1.field_l, var1.field_o, var1.field_j);
        var1.field_k = null;
        if (param0 == 1) {
          wb.field_e.b(0, var1);
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 31039) {
          field_e = (String) null;
        }
    }

    private lg() throws Throwable {
        throw new Error();
    }

    final mp a(int param0, int param1) {
        byte[] var4 = null;
        mp var3 = (mp) (this.field_d.a(101, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (param1 < 32768) {
          var4 = this.field_c.b(param1, 0, 1);
        } else {
          var4 = this.field_a.b(32767 & param1, 0, 1);
        }
        mp var5 = new mp();
        if (var4 != null) {
          var5.a(new ng(var4), (byte) 48);
          if (param0 > 21) {
            if (param1 < 32768) {
              this.field_d.a(var5, 1, (long)param1);
              return var5;
            }
            var5.a((byte) -90);
            this.field_d.a(var5, 1, (long)param1);
            return var5;
          }
          this.field_d = (b) null;
          if (param1 >= 32768) {
            var5.a((byte) -90);
            this.field_d.a(var5, 1, (long)param1);
            return var5;
          }
          this.field_d.a(var5, 1, (long)param1);
          return var5;
        }
        if (param0 <= 21) {
          this.field_d = (b) null;
          if (param1 < 32768) {
            this.field_d.a(var5, 1, (long)param1);
            return var5;
          }
          var5.a((byte) -90);
          this.field_d.a(var5, 1, (long)param1);
          return var5;
        }
        if (param1 < 32768) {
          this.field_d.a(var5, 1, (long)param1);
          return var5;
        }
        var5.a((byte) -90);
        this.field_d.a(var5, 1, (long)param1);
        return var5;
    }

    static {
        field_e = "Level <%0> of <%1>";
    }
}
