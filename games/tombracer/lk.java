/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends vg implements qn, fo, noa {
    private int field_o;
    private int field_p;
    private bca field_m;
    static boolean[] field_h;
    private boolean field_g;
    private int field_n;
    private boolean field_f;
    private int field_j;
    private la field_i;
    private int field_k;
    static jea field_l;

    private final boolean a(int param0) {
        if (param0 < 65) {
            return false;
        }
        return false;
    }

    final boolean a(int param0, boolean param1) {
        if (param1) {
            int discarded$0 = ((lk) this).c((byte) -27);
        }
        return ((lk) this).field_m.a(param0, 14530);
    }

    final void a(la param0, byte param1) {
        ((lk) this).field_n = param0.a(((lk) this).field_n, (byte) 71);
        ((lk) this).field_g = !((lk) this).field_g ? true : false;
        if (param1 != 104) {
            Object var4 = null;
            ((lk) this).a(-36, (iq) null);
        }
    }

    private final boolean f(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if (!((lk) this).field_i.o((byte) -82)) {
                break L1;
              } else {
                if (((lk) this).a(((lk) this).field_i.i(6029), false)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void a(int param0, int param1) {
        ((lk) this).field_n = param1;
        if (param0 != -6492) {
            int discarded$0 = ((lk) this).b((byte) 30);
        }
    }

    public final void a(int param0, iq param1) {
        if (!(this.f((byte) -1))) {
            dea.field_a.a(param1, 15, (lk) this);
        }
        if (param0 <= 103) {
            ((lk) this).field_g = false;
        }
    }

    public final int b(byte param0) {
        int var2 = -17 % ((-23 - param0) / 53);
        return ((lk) this).field_n;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            ((lk) this).field_i = null;
        }
    }

    final void a(byte param0, kh param1) {
        if (param0 >= -125) {
            ((lk) this).field_n = -37;
        }
        param1.a((byte) 20, ((lk) this).field_j, 8);
        param1.a((byte) -127, ((lk) this).field_n >> -1002716944, 12);
        param1.a((byte) -43, ((lk) this).field_p >> 1417874896, 12);
        param1.a((byte) -125, ((lk) this).field_k >> -1665169328, 10);
        param1.a((byte) -128, ((lk) this).field_o >> 1087350000, 10);
        param1.a((byte) -127, ((lk) this).field_g ? 1 : 0, 1);
        param1.a((byte) 86, !((lk) this).field_f ? 0 : 1, 1);
        ((lk) this).field_m.a((byte) -86, param1);
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return false;
        }
        return this.a(72);
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            return -46;
        }
        return ((lk) this).field_p;
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            ((lk) this).field_k = -73;
            return 0;
        }
        return 0;
    }

    final int a(byte param0) {
        int var2 = -101 % ((56 - param0) / 62);
        return ((lk) this).field_n;
    }

    final int b(int param0) {
        if (param0 < 36) {
            return -117;
        }
        return ((lk) this).field_k;
    }

    final void b(int param0, int param1) {
        ((lk) this).field_p = param1;
        if (param0 != 0) {
            boolean discarded$0 = ((lk) this).d((byte) 90);
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_h = null;
        if (param0) {
            field_h = null;
        }
    }

    final int b(boolean param0) {
        if (param0) {
            field_h = null;
        }
        return ((lk) this).field_o;
    }

    final int g(byte param0) {
        if (param0 >= -58) {
            return -85;
        }
        return ((lk) this).field_p;
    }

    lk(la param0, kh param1) {
        ((lk) this).field_i = param0;
        ((lk) this).field_j = param1.b((byte) 44, 8);
        ((lk) this).field_n = param1.b((byte) 44, 12) << 1864567952;
        ((lk) this).field_p = param1.b((byte) 44, 12) << 326200144;
        ((lk) this).field_k = param1.b((byte) 44, 10) << -1338787696;
        ((lk) this).field_o = param1.b((byte) 44, 10) << 109104240;
        ((lk) this).field_g = -2 == (param1.b((byte) 44, 1) ^ -1) ? true : false;
        ((lk) this).field_f = param1.b((byte) 44, 1) == 1 ? true : false;
        ((lk) this).field_m = new bca(param0.field_E, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = new boolean[42];
        for (var0 = 0; var0 < field_h.length; var0++) {
            field_h[var0] = true;
        }
        field_h[0] = false;
        field_h[36] = false;
        field_h[37] = false;
        field_h[38] = false;
        field_h[33] = false;
        field_h[34] = false;
        field_h[39] = false;
        field_h[40] = false;
        field_h[41] = false;
        field_h[35] = false;
    }
}
