/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bhb extends ksa implements tv {
    byte[] field_d;
    static String field_e;
    static int field_f;
    static int field_g;
    static int field_i;
    private tja field_h;

    final tja d(int param0) {
        faa var2 = null;
        tja var3 = null;
        if (null == ((bhb) this).field_h) {
          var2 = new faa(((bhb) this).field_d.length + -4);
          var2.a(4, ((bhb) this).field_d, -1, -4 + ((bhb) this).field_d.length);
          var2.field_e = param0;
          var3 = (tja) (Object) gva.field_a.a((byte) -128);
          var2.p(-23497);
          if (var3 instanceof utb) {
            ((utb) (Object) var3).a(var2, 32);
            var2.f((byte) -116);
            ((bhb) this).field_h = var3;
            return var3;
          } else {
            var3.a(var2, false);
            var2.f((byte) -116);
            ((bhb) this).field_h = var3;
            return var3;
          }
        } else {
          return ((bhb) this).field_h;
        }
    }

    public final void b(faa param0, int param1) {
        Object var4 = null;
        if (param1 > -109) {
          var4 = null;
          ((bhb) this).b((faa) null, -44);
          param0.r(32712);
          param0.d(((bhb) this).field_d.length, 332614536);
          param0.a(0, ((bhb) this).field_d, -1, ((bhb) this).field_d.length);
          param0.q(-81);
          return;
        } else {
          param0.r(32712);
          param0.d(((bhb) this).field_d.length, 332614536);
          param0.a(0, ((bhb) this).field_d, -1, ((bhb) this).field_d.length);
          param0.q(-81);
          return;
        }
    }

    bhb(int param0, faa param1) {
        this(param0, param1.field_h, param1.field_e);
    }

    public static void a(int param0) {
        if (param0 != 32) {
            return;
        }
        field_e = null;
    }

    final int c(int param0) {
        int var2 = 23 / ((param0 - 26) / 60);
        return ((((bhb) this).field_d[2] & 255) << -1163684216) + (((((bhb) this).field_d[1] & 255) << 845274224) + (((bhb) this).field_d[0] << -930000744 & -16777216)) + (((bhb) this).field_d[3] & 255);
    }

    final void a(tv param0, boolean param1) {
        if (!param1) {
            field_g = -106;
        }
    }

    public final void b(byte param0, tv param1) {
        bhb var3 = null;
        var3 = (bhb) (Object) param1;
        if (null == var3.field_d) {
          var3.field_d = null;
          if (param0 <= 54) {
            ((bhb) this).field_h = null;
            return;
          } else {
            return;
          }
        } else {
          if (null == var3.field_d) {
            var3.field_d = new byte[var3.field_d.length];
            cua.a(var3.field_d, 0, var3.field_d, 0, var3.field_d.length);
            if (param0 > 54) {
              return;
            } else {
              ((bhb) this).field_h = null;
              return;
            }
          } else {
            if (var3.field_d.length != var3.field_d.length) {
              var3.field_d = new byte[var3.field_d.length];
              cua.a(var3.field_d, 0, var3.field_d, 0, var3.field_d.length);
              if (param0 <= 54) {
                ((bhb) this).field_h = null;
                return;
              } else {
                return;
              }
            } else {
              cua.a(var3.field_d, 0, var3.field_d, 0, var3.field_d.length);
              if (param0 > 54) {
                return;
              } else {
                ((bhb) this).field_h = null;
                return;
              }
            }
          }
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 10 / ((param0 - 22) / 59);
        return false;
    }

    bhb() {
    }

    public final void a(faa param0, boolean param1) {
        int var3 = 0;
        param0.f((byte) -100);
        if (param1) {
          field_e = null;
          var3 = param0.h(49);
          ((bhb) this).field_d = new byte[var3];
          param0.a(0, ((bhb) this).field_d, (byte) -59, var3);
          param0.p(-23497);
          return;
        } else {
          var3 = param0.h(49);
          ((bhb) this).field_d = new byte[var3];
          param0.a(0, ((bhb) this).field_d, (byte) -59, var3);
          param0.p(-23497);
          return;
        }
    }

    private bhb(int param0, byte[] param1, int param2) {
        ((bhb) this).field_d = new byte[param2 - -4];
        ((bhb) this).field_d[2] = (byte)(param0 >> 937933224);
        ((bhb) this).field_d[3] = (byte)param0;
        ((bhb) this).field_d[1] = (byte)(param0 >> 301000240);
        ((bhb) this).field_d[0] = (byte)(param0 >> -1073884648);
        cua.a(param1, 0, ((bhb) this).field_d, 4, param2);
        ((bhb) this).field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Hold the left mouse button to shoot";
        field_i = 131072;
        field_g = 32;
    }
}
