/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ula extends nv {
    static String field_t;
    private int field_s;
    private int field_r;
    private up field_p;
    private kpa field_x;
    private int field_o;
    static boolean field_w;
    static su field_v;
    private int field_n;
    private kpa field_q;
    private int field_u;

    final int a(int param0, up param1, pc param2) {
        if (param0 > -85) {
            Object var5 = null;
            int discarded$0 = ((ula) this).a(102, (up) null, (pc) null);
        }
        return this.a(param1, (byte) -115);
    }

    private final boolean a(int param0, int param1, int param2) {
        if (!(param2 >= ((ula) this).field_u)) {
            return false;
        }
        if (param0 < 16) {
            return true;
        }
        if (((ula) this).field_x.a(0, param1)) {
            return true;
        }
        return false;
    }

    final int a(int param0, ep param1, up param2) {
        if (param0 != 25940) {
            int discarded$0 = ((ula) this).a(false);
        }
        return this.a(param2, (byte) -115);
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return 57;
        }
        param0 = fs.a((byte) 122, param0, ((ula) this).field_s);
        return param0;
    }

    final int a(boolean param0) {
        if (param0) {
            Object var3 = null;
            int discarded$0 = ((ula) this).a(-90, (up) null, (pc) null);
        }
        return 31;
    }

    ula(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((ula) this).field_x = new kpa(6, param0.field_E, param1);
        ((ula) this).field_q = new kpa(6, param0.field_E, param1);
        ((ula) this).field_u = param1.b((byte) 44, 8);
        ((ula) this).field_o = param1.b((byte) 44, 8);
        ((ula) this).field_r = param1.b((byte) 44, 8);
        ((ula) this).field_p = ad.a((byte) 87, param1);
        ((ula) this).field_n = param1.b((byte) 44, 8) << -838232080;
    }

    final void a(boolean param0, fsa param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          super.a(param0, param1);
          param1.b((byte) -112, 4);
          if (param0) {
            break L0;
          } else {
            ((ula) this).field_x = null;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= 6) {
            return;
          } else {
            L2: {
              if (((ula) this).field_x.a(0, var3)) {
                break L2;
              } else {
                if (((ula) this).field_q.a(0, var3)) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            param1.a(26492, true, var3);
            var3++;
            continue L1;
          }
        }
    }

    public static void g(byte param0) {
        field_v = null;
        field_t = null;
        if (param0 != 42) {
            field_t = null;
        }
    }

    private final void j(byte param0) {
        up var2 = new up((gma) (Object) ((ula) this).e(6), ((ula) this).field_p);
        if (param0 != -67) {
            ((ula) this).field_q = null;
        }
        int discarded$0 = ((ula) this).b(true).a(124, ((ula) this).field_g.e(param0 ^ -9715), var2, ((ula) this).field_g.a((byte) 55) + ((ula) this).field_n * 2, ((ula) this).field_g.c(-107) + 2 * ((ula) this).field_n, ((ula) this).field_g.d(3));
        ((ula) this).c(false);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        ((ula) this).field_x.a(param1, (byte) -118);
        ((ula) this).field_q.a(param1, (byte) -117);
        param1.a((byte) -11, ((ula) this).field_u, 8);
        param1.a((byte) 42, ((ula) this).field_o, 8);
        param1.a((byte) 125, ((ula) this).field_r, 8);
        ((ula) this).field_p.a(param1, (byte) 125);
        param1.a((byte) 127, ((ula) this).field_n >> -787574160, 8);
    }

    private final boolean a(boolean param0, int param1, int param2) {
        if (!(param1 >= ((ula) this).field_o)) {
            return false;
        }
        if (!(((ula) this).field_q.a(0, param2))) {
            return false;
        }
        if (!param0) {
            ((ula) this).field_p = null;
            return true;
        }
        return true;
    }

    private final int a(up param0, byte param1) {
        if (param1 != -115) {
            ((ula) this).field_x = null;
        }
        int var3 = param0.field_j;
        int var4 = param0.field_b;
        if (!this.b(8)) {
            if (this.a(113, var3, var4)) {
                if ((((ula) this).field_r ^ -1) >= -1) {
                    this.j((byte) -67);
                } else {
                    ((ula) this).field_s = ((ula) this).field_r;
                }
            }
        }
        if (this.b(8)) {
            if (!this.a(true, var4, var3)) {
                return 0;
            }
            ((ula) this).field_s = 0;
        }
        return 0;
    }

    final static boolean k(byte param0) {
        int var1 = -55 / ((-52 - param0) / 59);
        return uja.field_a.a(false);
    }

    final void k(int param0) {
        if (param0 != 5418) {
            Object var3 = null;
            int discarded$0 = this.a((up) null, (byte) -1);
        }
        if (-1 > ((ula) this).field_s) {
            ((ula) this).field_s = ((ula) this).field_s - 1;
            if (-1 == ((ula) this).field_s) {
                this.j((byte) -67);
            }
        }
    }

    private final boolean b(int param0) {
        if (param0 != 8) {
            Object var3 = null;
            int discarded$0 = this.a((up) null, (byte) -80);
        }
        return 0 != ((ula) this).field_s ? true : false;
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7 = -62 / ((62 - param4) / 52);
        return this.a(param2, (byte) -115);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "One Player Puzzle";
        field_v = new su(1, 2, 2, 0);
    }
}
