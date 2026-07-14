/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends og implements vd {
    private String[] field_B;
    private pc[] field_D;
    private fd field_E;
    static wb field_A;
    static String field_z;
    static int[] field_H;
    static int field_F;
    static String field_C;

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        var6 = 26 / ((83 - param0) / 36);
        var7 = 0;
        L0: while (true) {
          if (var7 >= ((nh) this).field_B.length) {
            L1: {
              if (param4 != ((nh) this).field_D[((nh) this).field_B.length]) {
                break L1;
              } else {
                ((nh) this).field_E.a(20);
                break L1;
              }
            }
            return;
          } else {
            if (((nh) this).field_D[var7] == param4) {
              ((nh) this).field_E.a(((nh) this).field_B[var7], -23752);
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (-99 == (param0 ^ -1)) {
            return ((nh) this).a((byte) -73, param2);
        }
        if (param0 != 99) {
            return false;
        }
        return ((nh) this).a(param2, -25911);
    }

    final static jg a(int param0, md param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        jg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        var2 = param1.d((byte) -79, 8);
        if (-1 > (var2 ^ -1)) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            var3 = fn.a(1, param1) ? 1 : 0;
            var4 = fn.a(param0 ^ -31742, param1) ? 1 : 0;
            var5 = new jg();
            var5.field_n = (short)param1.d((byte) -87, 16);
            var5.field_L = mh.a((byte) -2, param1, 16, var5.field_L);
            if (param0 == -31741) {
              break L0;
            } else {
              field_z = null;
              break L0;
            }
          }
          L1: {
            var5.field_G = mh.a((byte) -2, param1, 16, var5.field_G);
            var5.field_b = mh.a((byte) -2, param1, 16, var5.field_b);
            var5.field_I = (short)param1.d((byte) -56, 16);
            var5.field_K = mh.a((byte) -2, param1, 16, var5.field_K);
            var5.field_g = mh.a((byte) -2, param1, 16, var5.field_g);
            var5.field_c = mh.a((byte) -2, param1, 16, var5.field_c);
            if (var3 == 0) {
              break L1;
            } else {
              var5.field_D = (short)param1.d((byte) -73, 16);
              var5.field_a = mh.a((byte) -2, param1, 16, var5.field_a);
              var5.field_N = mh.a((byte) -2, param1, 16, var5.field_N);
              var5.field_u = mh.a((byte) -2, param1, 16, var5.field_u);
              var5.field_A = mh.a((byte) -2, param1, 16, var5.field_A);
              var5.field_v = mh.a((byte) -2, param1, 16, var5.field_v);
              var5.field_R = mh.a((byte) -2, param1, 16, var5.field_R);
              break L1;
            }
          }
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              int discarded$1 = param1.d((byte) -94, 16);
              var5.field_l = mh.a((byte) -2, param1, 16, var5.field_l);
              var5.field_r = mh.a((byte) -2, param1, 16, var5.field_r);
              var5.field_J = mh.a((byte) -2, param1, 16, var5.field_J);
              var5.field_k = mh.a((byte) -2, param1, 16, var5.field_k);
              var5.field_w = mh.a((byte) -2, param1, 16, var5.field_w);
              break L2;
            }
          }
          L3: {
            if (!fn.a(1, param1)) {
              break L3;
            } else {
              var5.field_B = mh.a((byte) -2, param1, 16, var5.field_B);
              break L3;
            }
          }
          L4: {
            if (fn.a(param0 ^ -31742, param1)) {
              var5.field_o = cj.a(16, 2048, param1, var5.field_o);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var5.field_o.length <= var7) {
                  if (0 != var6) {
                    var5.field_s = (byte)(var6 + 1);
                    break L4;
                  } else {
                    var5.field_o = null;
                    break L4;
                  }
                } else {
                  if (var6 < (255 & var5.field_o[var7])) {
                    var6 = var5.field_o[var7] & 255;
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            } else {
              break L4;
            }
          }
          return var5;
        }
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        if (!(!param1.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        int var2 = 59 % ((36 - param0) / 42);
        if (!(!param1.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (param1.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (param1.equals((Object) (Object) "J")) {
            return Long.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "Z"))) {
            return Boolean.TYPE;
        }
        if (param1.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "D"))) {
            return Double.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    final static void a(int param0, byte param1, ca param2) {
        if (param1 > -13) {
            return;
        }
        md var5 = tp.field_f;
        var5.d(8, param0);
        var5.field_f = var5.field_f + 1;
        int var4 = var5.field_f;
        var5.a(true, 1);
        var5.a(true, param2.field_i);
        var5.a(true, param2.field_k);
        var5.a(param2.field_n, -16384);
        var5.a(param2.field_h, -16384);
        var5.a(param2.field_f, -16384);
        var5.a(param2.field_l, -16384);
        int discarded$0 = var5.b(var4, (byte) -79);
        var5.c((byte) 61, -var4 + var5.field_f);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -30, param2, param3);
        if (param1 > -12) {
            ((nh) this).field_E = null;
        }
        if (!(param3 == 0)) {
            return;
        }
        vc var5 = ai.field_h;
        if (null != ((nh) this).field_B) {
            int discarded$0 = var5.a(wb.field_b, ((nh) this).field_r + param2, ((nh) this).field_j + param0, ((nh) this).field_g, 20, 16777215, -1, 0, 0, var5.field_u + var5.field_o);
        }
    }

    public static void a(int param0) {
        if (param0 != -7397) {
            return;
        }
        field_H = null;
        field_A = null;
        field_z = null;
        field_C = null;
    }

    nh(fd param0) {
        super(0, 0, 0, 0, (wo) null);
        ((nh) this).field_E = param0;
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        ((nh) this).field_v.a(param1 ^ 22800);
        if (param0 != null) {
            // ifeq L29
        } else {
            ((nh) this).field_B = null;
            return;
        }
        int var3 = param0.length;
        ((nh) this).field_B = new String[var3];
        for (var4_int = 0; var4_int < var3; var4_int++) {
            ((nh) this).field_B[var4_int] = gd.a((byte) 127, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
        }
        ok var4 = new ok(ai.field_h, 0, 1);
        ((nh) this).field_D = new pc[var3 - -1];
        for (var5 = param1; var3 > var5; var5++) {
            ((nh) this).field_D[var5] = new pc(((nh) this).field_B[var5], (bi) this);
            ((nh) this).field_D[var5].field_i = (wo) (Object) var4;
            ((nh) this).field_D[var5].field_t = fg.field_l;
            ((nh) this).field_D[var5].a(15, 0, 16 * var5 + 20, 80, (byte) -52);
            ((nh) this).b((qm) (Object) ((nh) this).field_D[var5], param1 + 60);
        }
        ((nh) this).field_D[var3] = new pc(qo.field_p, (bi) this);
        ((nh) this).field_D[var3].field_i = (wo) (Object) var4;
        ((nh) this).field_D[var3].a(15, 0, 20 - -((1 + var3) * 16), 100, (byte) -52);
        ((nh) this).b((qm) (Object) ((nh) this).field_D[var3], param1 + -118);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new wb();
        field_C = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
