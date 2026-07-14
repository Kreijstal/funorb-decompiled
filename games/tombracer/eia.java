/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eia extends nv implements ut {
    private int field_v;
    private int field_n;
    private int field_w;
    static long[] field_r;
    private int field_s;
    private kpa field_u;
    private jma field_q;
    private kpa field_t;
    static String field_o;
    private int field_p;

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        ((eia) this).field_q.a(((eia) this).h((byte) 116), (byte) 111, param1);
        param1.a((byte) 42, ((eia) this).field_w, 8);
        param1.a((byte) -128, ((eia) this).field_v, 8);
        param1.a((byte) 70, ((eia) this).field_n, 4);
        ((eia) this).field_u.a(param1, (byte) -128);
        if (param0) {
            return;
        }
        ((eia) this).field_t.a(param1, (byte) -124);
    }

    public final int b(int param0) {
        int var2 = -12 % ((param0 - -46) / 45);
        return ((eia) this).field_w;
    }

    public static void l(int param0) {
        field_o = null;
        if (param0 <= 1) {
            field_r = null;
        }
        field_r = null;
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            Object var4 = null;
            ((eia) this).a(false, (fsa) null);
        }
        param0 = fs.a((byte) 87, param0, ((eia) this).field_s);
        param0 = fs.a((byte) 82, param0, ((eia) this).field_p);
        return ((eia) this).field_q.a(89, param0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 != -2029) {
            return;
        }
        ((eia) this).field_v = param0;
        ((eia) this).field_n = param1;
        ((eia) this).field_w = param2;
    }

    final void g(int param0) {
        super.g(param0 ^ 0);
        ((eia) this).field_q.a((byte) 48, ((eia) this).h((byte) 110));
        if (param0 != -2) {
            Object var3 = null;
            ((eia) this).a(false, (kh) null);
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        if (param2 >= -119) {
            boolean discarded$0 = this.a(true, -31);
        }
        ((eia) this).field_u.a(param1, -17075, param0);
    }

    private final boolean a(boolean param0, int param1) {
        if (!param0) {
            ((eia) this).k(85);
        }
        if (!((eia) this).field_u.a(0, param1)) {
            return false;
        }
        return true;
    }

    final int a(boolean param0) {
        if (param0) {
            return -122;
        }
        return 18;
    }

    private final boolean a(byte param0, int param1) {
        if (param0 >= -109) {
            ((eia) this).field_q = null;
        }
        if (!((eia) this).field_t.a(0, param1)) {
            return false;
        }
        return true;
    }

    eia(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        L0: {
          ((eia) this).field_s = 0;
          ((eia) this).field_q = new jma(15, param0, param1);
          ((eia) this).field_w = param1.b((byte) 44, 8);
          ((eia) this).field_v = param1.b((byte) 44, 8);
          ((eia) this).field_n = param1.b((byte) 44, 4);
          if ((param0.field_E ^ -1) <= -10) {
            ((eia) this).field_u = new kpa(6, param0.field_E, param1);
            ((eia) this).field_t = new kpa(6, param0.field_E, param1);
            break L0;
          } else {
            var4 = param1.b((byte) 44, 3);
            var16 = new int[var4];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var5 = var10;
            var6 = 0;
            L1: while (true) {
              if (var4 <= var6) {
                var6 = param1.b((byte) 44, 3);
                var17 = new int[var6];
                var15 = var17;
                var13 = var15;
                var11 = var13;
                var7 = var11;
                var8 = 0;
                L2: while (true) {
                  if (var8 >= var6) {
                    ((eia) this).field_u = new kpa(6);
                    ((eia) this).field_u.a(var16, 0);
                    ((eia) this).field_t = new kpa(6);
                    ((eia) this).field_t.a(var17, 0);
                    break L0;
                  } else {
                    var7[var8] = param1.b((byte) 44, 4);
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var5[var6] = param1.b((byte) 44, 4);
                var6++;
                continue L1;
              }
            }
          }
        }
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7 = -56 % ((62 - param4) / 52);
        return this.a((byte) 14, param2);
    }

    final int a(int param0, ep param1, up param2) {
        if (param0 != 25940) {
            ((eia) this).field_w = 2;
        }
        return this.a((byte) 14, param2);
    }

    private final int a(byte param0, up param1) {
        if (param0 != 14) {
            return -1;
        }
        int var3 = param1.field_j;
        if (this.a(true, var3)) {
            ((eia) this).field_p = 3;
            ((eia) this).field_s = ((eia) this).field_s + param1.field_b;
            return param1.field_b;
        }
        if (this.a((byte) -127, var3)) {
            ((eia) this).field_p = -3;
            ((eia) this).field_s = ((eia) this).field_s - param1.field_b;
            return param1.field_b;
        }
        return 0;
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            ((eia) this).field_u = null;
        }
        return 1131537;
    }

    public final int j(byte param0) {
        if (param0 != -108) {
            Object var3 = null;
            int discarded$0 = ((eia) this).a(-122, (ep) null, (up) null);
        }
        return ((eia) this).field_s;
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            return null;
        }
        return ((eia) this).field_q;
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            return -2;
        }
        return 12320699;
    }

    final void a(boolean param0, int param1, int param2) {
        ((eia) this).field_t.a(param1, -17075, param0);
        if (param2 > -32) {
            Object var5 = null;
            int discarded$0 = this.a((byte) -27, (up) null);
        }
    }

    final void a(boolean param0, fsa param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1);
        var3 = 0;
        L0: while (true) {
          if (-7 >= (var3 ^ -1)) {
            L1: {
              if (4 > ((eia) this).b(true).field_E) {
                param1.h(3, 0);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (((eia) this).field_u.a(0, var3)) {
                break L2;
              } else {
                if (((eia) this).field_t.a(0, var3)) {
                  break L2;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            param1.a(26492, true, var3);
            var3++;
            continue L0;
          }
        }
    }

    final void k(int param0) {
        if (!(!((eia) this).field_q.f((byte) -56))) {
            ((eia) this).c(false);
        }
        ((eia) this).field_s = ((eia) this).field_s - ((eia) this).field_n;
        if (-1 < (((eia) this).field_s ^ -1)) {
            ((eia) this).field_s = 0;
        } else {
            if (!(((eia) this).field_v >= ((eia) this).field_s)) {
                ((eia) this).field_s = ((eia) this).field_v;
            }
        }
        int var2 = ((eia) this).field_s >= ((eia) this).field_w ? 1 : 0;
        ((eia) this).field_q.a((byte) -14, var2 != 0);
        if (!(0 >= ((eia) this).field_p)) {
            ((eia) this).field_p = ((eia) this).field_p - 1;
        }
        if (-1 < (((eia) this).field_p ^ -1)) {
            ((eia) this).field_p = ((eia) this).field_p + 1;
        }
        if (param0 != 5418) {
            ((eia) this).field_v = 52;
        }
    }

    eia(la param0, boolean param1) {
        super(param0, param1);
        ((eia) this).field_s = 0;
        ((eia) this).field_q = new jma(15);
        ((eia) this).field_v = 100;
        ((eia) this).field_w = 50;
        ((eia) this).field_u = new kpa(6);
        ((eia) this).field_t = new kpa(6);
        ((eia) this).field_n = 1;
    }

    final int a(int param0, up param1, pc param2) {
        if (param0 >= -85) {
            return 59;
        }
        return this.a((byte) 14, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new long[32];
        field_o = "Unable to add name - system busy";
    }
}
