/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends ana {
    static ee field_C;
    static int[][] field_A;
    static kv field_B;
    static hja[] field_w;
    private me field_y;
    private boolean field_x;
    static String field_z;
    private boolean field_v;

    od(gj param0, me param1, boolean param2) {
        super(param0, (bca) (Object) param1);
        ((od) this).field_v = false;
        ((od) this).field_x = param2 ? true : false;
        ((od) this).field_y = param1;
    }

    final static boolean e(byte param0) {
        if (param0 < -124) {
          if (qt.field_l != null) {
            if (!qt.field_l.b(-8455)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          od.a(-16L, 12, -52);
          if (qt.field_l != null) {
            if (!qt.field_l.b(-8455)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(long param0, String param1, boolean param2) {
        CharSequence var5 = null;
        gk.field_d = 2;
        bd.field_k = param1;
        var5 = (CharSequence) (Object) param1;
        df.field_s = fq.a(0, var5);
        if (param2) {
          boolean discarded$2 = od.e((byte) 9);
          eaa.field_a = param0;
          lna.field_q = true;
          return;
        } else {
          eaa.field_a = param0;
          lna.field_q = true;
          return;
        }
    }

    public static void b(boolean param0) {
        field_A = null;
        if (param0) {
            return;
        }
        field_w = null;
        field_C = null;
        field_B = null;
        field_z = null;
    }

    final static void a(long param0, int param1, int param2) {
        pf var4 = null;
        int var5 = 0;
        var4 = sja.field_fb;
        if (param2 != 2) {
          return;
        } else {
          var4.c(param1, (byte) 100);
          var4.field_g = var4.field_g + 1;
          var5 = var4.field_g;
          var4.d(7, 0);
          var4.b(param2 ^ 1686281210, param0);
          var4.b((byte) 89, -var5 + var4.field_g);
          return;
        }
    }

    private final void f(byte param0) {
        if (param0 > -16) {
            field_A = null;
        }
    }

    final static byte[] a(String param0, byte param1) {
        Object var3 = null;
        if (param1 <= 69) {
          var3 = null;
          od.a(-51L, (String) null, true);
          return ko.field_g.a((byte) 123, param0, "");
        } else {
          return ko.field_g.a((byte) 123, param0, "");
        }
    }

    final boolean c(byte param0) {
        int var2_int = 0;
        tka var2 = null;
        if (!((od) this).field_x) {
          if (!((od) this).field_m.a((byte) -106)) {
            ((od) this).field_l = ((od) this).field_l - 1;
            if (0 <= ((od) this).field_l - 1) {
              if (((od) this).field_v) {
                return false;
              } else {
                ((od) this).field_y.field_l.a(-27449, ((od) this).field_q).b(-1, 2);
                var2 = new tka(((od) this).field_q, ((od) this).field_y.field_r, ((od) this).field_y.field_u);
                ((kj) (Object) var2).a(0);
                ((od) this).field_v = true;
                return false;
              }
            } else {
              var2_int = 39 / ((param0 - 71) / 47);
              this.f((byte) -66);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2]};
        field_z = "Name";
        field_w = new hja[40];
    }
}
