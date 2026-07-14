/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static String field_f;
    private int field_c;
    static String field_g;
    private ea field_m;
    private int field_j;
    static mh field_a;
    static oh[] field_n;
    private rk field_o;
    static ob field_l;
    static int field_i;
    static String field_h;
    static String field_d;
    static int[] field_e;
    static hl field_b;
    static boolean field_k;

    private final void a(mb param0, int param1) {
        int var3 = 0;
        var3 = -100 % ((-59 - param1) / 60);
        if (param0 != null) {
          param0.b(false);
          param0.e(0);
          ((ec) this).field_c = ((ec) this).field_c + param0.field_t;
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, long param1) {
        mb var4 = (mb) (Object) ((ec) this).field_m.a(param1, 111);
        if (param0 < 22) {
            return;
        }
        this.a(var4, 44);
    }

    final static hl a(int param0, jb param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        hl var13 = null;
        var13 = new hl(0L, (hl) null);
        var13.field_Eb = wm.a((byte) 28, param9, param11);
        var13.field_kb = wm.a((byte) 28, param0, param10);
        var13.field_pb = wm.a((byte) 28, param8, param7);
        var13.field_Gb = wm.a((byte) 28, param3, param2);
        var13.field_H = wm.a((byte) 28, param6, param5);
        var13.field_N = param12;
        var13.field_Ib = param1;
        if (param4 != -120) {
          return null;
        } else {
          return var13;
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 < 113) {
            field_l = null;
            oa.field_y.a(param0, 8);
            return;
        }
        oa.field_y.a(param0, 8);
    }

    final void a(Object param0, long param1, byte param2) {
        if (param2 != 50) {
          ec.a(true, 108);
          this.a(param2 ^ 50, param0, param1, 1);
          return;
        } else {
          this.a(param2 ^ 50, param0, param1, 1);
          return;
        }
    }

    final Object a(byte param0, long param1) {
        Object var5 = null;
        wc var6 = null;
        mb var7 = null;
        var7 = (mb) (Object) ((ec) this).field_m.a(param1, 116);
        if (var7 != null) {
          var5 = var7.g(22850);
          if (var5 != null) {
            if (param0 >= 116) {
              if (var7.f(105)) {
                var6 = new wc(var5, var7.field_t);
                ((ec) this).field_m.a(var7.field_c, (mc) (Object) var6, false);
                ((ec) this).field_o.a((byte) -85, (gb) (Object) var6);
                ((mb) (Object) var6).field_n = 0L;
                var7.b(false);
                var7.e(0);
                return var5;
              } else {
                ((ec) this).field_o.a((byte) -50, (gb) (Object) var7);
                var7.field_n = 0L;
                return var5;
              }
            } else {
              ec.a(false, -84);
              if (var7.f(105)) {
                var6 = new wc(var5, var7.field_t);
                ((ec) this).field_m.a(var7.field_c, (mc) (Object) var6, false);
                ((ec) this).field_o.a((byte) -85, (gb) (Object) var6);
                ((mb) (Object) var6).field_n = 0L;
                var7.b(false);
                var7.e(0);
                return var5;
              } else {
                ((ec) this).field_o.a((byte) -50, (gb) (Object) var7);
                var7.field_n = 0L;
                return var5;
              }
            }
          } else {
            var7.b(false);
            var7.e(0);
            ((ec) this).field_c = ((ec) this).field_c + var7.field_t;
            return null;
          }
        } else {
          return null;
        }
    }

    ec(int param0) {
        this(param0, param0);
    }

    public static void a(byte param0) {
        field_f = null;
        field_n = null;
        field_d = null;
        field_g = null;
        field_a = null;
        field_b = null;
        field_h = null;
        int var1 = 54 % ((38 - param0) / 62);
        field_l = null;
        field_e = null;
    }

    private final void a(int param0, Object param1, long param2, int param3) {
        wc var6 = null;
        mb var6_ref = null;
        int var7 = 0;
        var7 = TetraLink.field_J;
        if (param3 > ((ec) this).field_j) {
          throw new IllegalStateException();
        } else {
          this.a(57, param2);
          ((ec) this).field_c = ((ec) this).field_c - param3;
          L0: while (true) {
            if (((ec) this).field_c >= 0) {
              var6 = new wc(param1, param3);
              ((ec) this).field_m.a(param2, (mc) (Object) var6, false);
              ((ec) this).field_o.a((byte) -14, (gb) (Object) var6);
              ((mb) (Object) var6).field_n = (long)param0;
              return;
            } else {
              var6_ref = (mb) (Object) ((ec) this).field_o.b(-91);
              this.a(var6_ref, param0 ^ -122);
              continue L0;
            }
          }
        }
    }

    private ec(int param0, int param1) {
        int var3 = 0;
        ((ec) this).field_o = new rk();
        ((ec) this).field_c = param0;
        ((ec) this).field_j = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((ec) this).field_m = new ea(var3);
            }
          } else {
            ((ec) this).field_m = new ea(var3);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Graphics: ";
        field_g = "Ignore";
        field_a = new mh();
        field_i = 0;
        field_k = false;
        field_e = new int[12];
        field_d = "Logging in...";
    }
}
