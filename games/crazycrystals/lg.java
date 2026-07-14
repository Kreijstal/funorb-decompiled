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
        pe var1 = null;
        var1 = (pe) (Object) ok.field_a.d(-125);
        if (var1 != null) {
          kh.a(var1.field_k, var1.field_g, var1.field_m);
          kh.d(var1.field_f, var1.field_l, var1.field_o, var1.field_j);
          var1.field_k = null;
          if (param0 != 1) {
            return;
          } else {
            wb.field_e.b(0, (jb) (Object) var1);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 31039) {
            field_e = null;
        }
    }

    private lg() throws Throwable {
        throw new Error();
    }

    final mp a(int param0, int param1) {
        mp var3 = null;
        byte[] var4 = null;
        mp var5 = null;
        var3 = (mp) ((lg) this).field_d.a(101, (long)param1);
        if (var3 == null) {
          L0: {
            if (param1 >= 32768) {
              var4 = ((lg) this).field_a.b(32767 & param1, 0, 1);
              break L0;
            } else {
              var4 = ((lg) this).field_c.b(param1, 0, 1);
              break L0;
            }
          }
          var5 = new mp();
          if (var4 == null) {
            if (param0 > 21) {
              if (param1 >= 32768) {
                var5.a((byte) -90);
                ((lg) this).field_d.a((Object) (Object) var5, 1, (long)param1);
                return var5;
              } else {
                ((lg) this).field_d.a((Object) (Object) var5, 1, (long)param1);
                return var5;
              }
            } else {
              ((lg) this).field_d = null;
              if (param1 >= 32768) {
                var5.a((byte) -90);
                ((lg) this).field_d.a((Object) (Object) var5, 1, (long)param1);
                return var5;
              } else {
                ((lg) this).field_d.a((Object) (Object) var5, 1, (long)param1);
                return var5;
              }
            }
          } else {
            var5.a(new ng(var4), (byte) 48);
            if (param0 <= 21) {
              ((lg) this).field_d = null;
              if (param1 < 32768) {
                ((lg) this).field_d.a((Object) (Object) var5, 1, (long)param1);
                return var5;
              } else {
                var5.a((byte) -90);
                ((lg) this).field_d.a((Object) (Object) var5, 1, (long)param1);
                return var5;
              }
            } else {
              if (param1 >= 32768) {
                var5.a((byte) -90);
                ((lg) this).field_d.a((Object) (Object) var5, 1, (long)param1);
                return var5;
              } else {
                ((lg) this).field_d.a((Object) (Object) var5, 1, (long)param1);
                return var5;
              }
            }
          }
        } else {
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Level <%0> of <%1>";
    }
}
