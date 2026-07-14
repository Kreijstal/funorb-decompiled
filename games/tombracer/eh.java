/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh implements fo {
    int field_f;
    static byte[][] field_i;
    ce field_e;
    int field_h;
    int field_a;
    bua field_g;
    int field_c;
    int field_d;
    int field_b;

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return false;
        }
        return ((eh) this).field_e.d((byte) 48);
    }

    final void a(int param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        ((eh) this).field_g = new bua(1, ((eh) this).field_f);
        if (-5 == ((eh) this).field_e.n((byte) 87)) {
          if (-34 <= ((eh) this).field_b) {
            if (66 <= ((eh) this).field_b) {
              ((eh) this).field_g.a(3, false, (byte) -98, 12);
              return;
            } else {
              ((eh) this).field_g.a(3, false, (byte) 24, 11);
              return;
            }
          } else {
            ((eh) this).field_g.a(3, false, (byte) -96, 10);
            return;
          }
        } else {
          if (((eh) this).field_e.n((byte) 87) != 0) {
            return;
          } else {
            if ((((eh) this).field_b ^ -1) <= -34) {
              if (-67 < (((eh) this).field_b ^ -1)) {
                ((eh) this).field_g.a(3, false, (byte) 34, 4);
                if (param0 <= 27) {
                  var4 = null;
                  ((eh) this).a(-82, (iq) null);
                  return;
                } else {
                  return;
                }
              } else {
                ((eh) this).field_g.a(3, false, (byte) 48, 5);
                if (param0 <= 27) {
                  var4 = null;
                  ((eh) this).a(-82, (iq) null);
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((eh) this).field_g.a(3, false, (byte) 94, 3);
              if (param0 <= 27) {
                var4 = null;
                ((eh) this).a(-82, (iq) null);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -71 % ((-17 - param0) / 49);
        field_i = null;
    }

    public final void a(int param0, iq param1) {
        gqa.a(((eh) this).field_a, -83584144, ((eh) this).c((byte) 123), ((eh) this).b((byte) 122), ((eh) this).field_g.b((byte) 74), ((eh) this).e((byte) -88));
        if (param0 < 103) {
            ((eh) this).f(-75);
        }
    }

    public final int c(byte param0) {
        if (param0 < 91) {
          boolean discarded$2 = ((eh) this).d((byte) 85);
          return ((eh) this).field_e.c((byte) 112) + ((eh) this).field_c + ((eh) this).field_e.i(1024);
        } else {
          return ((eh) this).field_e.c((byte) 112) + ((eh) this).field_c + ((eh) this).field_e.i(1024);
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            Object var3 = null;
            ((eh) this).a(-33, (iq) null);
        }
    }

    public final int b(byte param0) {
        int var2 = 116 % ((-23 - param0) / 53);
        return ((eh) this).field_e.b((byte) -89) + ((eh) this).field_d + ((eh) this).field_e.k(-13019);
    }

    public final int e(byte param0) {
        if (param0 < -86) {
          if ((((eh) this).field_e.n((byte) 87) ^ -1) == -2) {
            return ((eh) this).field_e.e((byte) -121);
          } else {
            return ((eh) this).field_e.e((byte) -88) - 655360;
          }
        } else {
          return 121;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new byte[1000][];
    }
}
