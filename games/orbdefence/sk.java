/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends kj {
    static java.awt.Color field_H;
    private im field_B;
    static String field_G;
    static String field_C;
    static tl field_E;
    static int[] field_I;

    final void o(int param0) {
        int var5 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(((sk) this).field_B);
        int var4 = -70 / ((param0 - 85) / 32);
        sg var3 = (sg) (Object) var2.d(27935);
        while (var3 != null) {
            if (!(!var3.d(false))) {
                var3.b(57);
            }
            var3 = (sg) (Object) var2.b(true);
        }
        ((sk) this).field_y = (pj) (Object) ((sk) this).k(3469);
    }

    public static void m(int param0) {
        field_I = null;
        field_E = null;
        field_C = null;
        if (param0 > -18) {
            field_H = null;
        }
        field_H = null;
        field_G = null;
    }

    final pj c(boolean param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(((sk) this).field_B);
        sg var3 = (sg) (Object) var2.d(27935);
        while (var3 != null) {
            if (!(!var3.field_A)) {
                return var3.b((byte) -109);
            }
            var3 = (sg) (Object) var2.b(!param0 ? true : false);
        }
        if (!param0) {
            return null;
        }
        field_I = null;
        return null;
    }

    final void n(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 7920) {
            ((sk) this).field_B = null;
        }
        km var2 = new km(((sk) this).field_B);
        sg var3 = (sg) (Object) var2.d(27935);
        while (var3 != null) {
            var3.field_A = false;
            var3 = (sg) (Object) var2.b(true);
        }
        ((sk) this).field_y = null;
    }

    final sg k(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(((sk) this).field_B);
        sg var3 = (sg) (Object) var2.d(param0 + 24466);
        while (var3 != null) {
            if (!(!var3.field_A)) {
                return var3;
            }
            var3 = (sg) (Object) var2.b(true);
        }
        if (param0 == 3469) {
            return null;
        }
        Object var5 = null;
        int discarded$0 = sk.a((byte) -126, (CharSequence) null);
        return null;
    }

    public sk() {
        super(0, 0, ed.field_a, lh.field_d, (td) null, (ag) null);
        ((sk) this).field_B = new im();
    }

    final void l(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 > -5) {
            ((sk) this).o(-56);
        }
        km var2 = new km(((sk) this).field_B);
        sg var3 = (sg) (Object) var2.d(27935);
        while (var3 != null) {
            if (var3.l(194)) {
                var3.b(57);
            }
            var3 = (sg) (Object) var2.b(true);
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 == -46) {
            break L0;
          } else {
            field_H = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 == 160) {
              break L2;
            } else {
              if (param0 == 32) {
                break L2;
              } else {
                if (param0 == 95) {
                  break L2;
                } else {
                  if (param0 != 45) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = OrbDefence.field_D ? 1 : 0;
        if (null != ((sk) this).field_j) {
            ((sk) this).field_j.a(param0, param3, (pj) this, param2 + -1052969, true);
        }
        km var5 = new km(((sk) this).field_B);
        pj var6 = (pj) (Object) var5.c(param2 ^ -1040926);
        if (param2 != 1048575) {
            Object var8 = null;
            ((sk) this).b((byte) -95, (pj) null);
        }
        while (var6 != null) {
            var6.a(param0 + ((sk) this).field_n, param1, param2 ^ 0, param3 - -((sk) this).field_s);
            var6 = (pj) (Object) var5.a((byte) -84);
        }
    }

    final void b(byte param0, pj param1) {
        if (!(param1 instanceof sg)) {
            throw new IllegalArgumentException();
        }
        sg var3 = (sg) (Object) param1;
        ((sk) this).field_B.a((ca) (Object) var3, 9);
        var3.field_A = true;
        boolean discarded$6 = var3.a(-81, (pj) this);
        if (param0 != 74) {
            Object var4 = null;
            int discarded$7 = sk.a((byte) 48, (CharSequence) null);
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 76) {
            Object var6 = null;
            int discarded$0 = sk.a((byte) 9, (CharSequence) null);
        }
        int var2 = param1.length();
        int var3 = 0;
        for (var4 = 0; var4 < var2; var4++) {
            var3 = -var3 + (var3 << 180463845) + oc.a(-109, param1.charAt(var4));
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Continue";
        field_H = new java.awt.Color(10040319);
        field_E = new tl();
        field_I = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
