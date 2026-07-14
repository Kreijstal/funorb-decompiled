/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    private ra field_e;
    static String field_c;
    private int field_d;
    private gi field_f;
    static String[] field_a;
    static int field_g;
    private int field_b;

    private final void a(long param0, int param1) {
        fj var4 = null;
        var4 = (fj) (Object) ((jj) this).field_f.a(param0, (byte) -72);
        this.a(param1 + -117, var4);
        if (param1 != 0) {
          field_c = null;
          return;
        } else {
          return;
        }
    }

    private final void a(long param0, int param1, boolean param2, Object param3) {
        fj var6 = null;
        gj var6_ref = null;
        int var7 = 0;
        var7 = Geoblox.field_C;
        if (param1 > ((jj) this).field_b) {
          throw new IllegalStateException();
        } else {
          this.a(param0, 0);
          ((jj) this).field_d = ((jj) this).field_d - param1;
          L0: while (true) {
            if (0 <= ((jj) this).field_d) {
              var6_ref = new gj(param3, param1);
              ((jj) this).field_f.a(param0, -99, (hf) (Object) var6_ref);
              if (param2) {
                jj.b(-85);
                ((jj) this).field_e.a(-1, (rc) (Object) var6_ref);
                ((fj) (Object) var6_ref).field_i = 0L;
                return;
              } else {
                ((jj) this).field_e.a(-1, (rc) (Object) var6_ref);
                ((fj) (Object) var6_ref).field_i = 0L;
                return;
              }
            } else {
              var6 = (fj) (Object) ((jj) this).field_e.a((byte) -41);
              this.a(114, var6);
              continue L0;
            }
          }
        }
    }

    final Object a(byte param0, long param1) {
        Object var5 = null;
        gj var6 = null;
        fj var7 = null;
        var7 = (fj) (Object) ((jj) this).field_f.a(param1, (byte) 61);
        if (var7 != null) {
          var5 = var7.e((byte) 120);
          if (param0 >= 56) {
            if (var5 == null) {
              var7.a(false);
              var7.a((byte) 92);
              ((jj) this).field_d = ((jj) this).field_d + var7.field_n;
              return null;
            } else {
              if (var7.g(13)) {
                var6 = new gj(var5, var7.field_n);
                ((jj) this).field_f.a(var7.field_a, -81, (hf) (Object) var6);
                ((jj) this).field_e.a(-1, (rc) (Object) var6);
                ((fj) (Object) var6).field_i = 0L;
                var7.a(false);
                var7.a((byte) 93);
                return var5;
              } else {
                ((jj) this).field_e.a(-1, (rc) (Object) var7);
                var7.field_i = 0L;
                return var5;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, long param1, Object param2) {
        int var5 = 4 / ((param0 - 56) / 59);
        this.a(param1, 1, false, param2);
    }

    final static void b(int param0) {
        if (param0 > -96) {
            field_c = null;
            jk.field_d = 0;
            return;
        }
        jk.field_d = 0;
    }

    private final void a(int param0, fj param1) {
        int var3 = 0;
        var3 = -56 % ((61 - param0) / 42);
        if (param1 != null) {
          param1.a(false);
          param1.a((byte) 75);
          ((jj) this).field_d = ((jj) this).field_d + param1.field_n;
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -3 / ((81 - param0) / 41);
        field_c = null;
    }

    private jj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Login: ";
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_g = 13;
    }
}
