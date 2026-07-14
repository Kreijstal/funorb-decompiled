/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt {
    private boolean field_h;
    private int[] field_j;
    private int field_e;
    hca field_g;
    eha field_i;
    private boolean field_a;
    la[] field_b;
    private int field_l;
    private boolean field_k;
    int field_c;
    static String field_n;
    private boolean field_f;
    private int field_m;
    private int field_d;

    private final la a(byte param0, la param1) {
        if (param0 <= 68) {
            return null;
        }
        int var3 = param1.c(115);
        if (var3 >= ((dt) this).field_b.length + -1) {
            return null;
        }
        return ((dt) this).field_b[1 + var3];
    }

    private final boolean c(int param0, int param1) {
        if (param1 != -1) {
            ((dt) this).field_b = null;
            return -1 != ((dt) this).field_j[param0] ? true : false;
        }
        return -1 != ((dt) this).field_j[param0] ? true : false;
    }

    final void d(int param0, int param1) {
        int var3 = -110 % ((param0 - 73) / 33);
    }

    final void a(la param0, int param1) {
        eha var3 = null;
        if (param1 != -9774) {
            int discarded$0 = ((dt) this).a(false);
            ((dt) this).field_f = false;
            ((dt) this).field_h = true;
            var3 = ((dt) this).m(9262);
            if (!(var3 == null)) {
                var3.a(35, param0);
            }
            return;
        }
        ((dt) this).field_f = false;
        ((dt) this).field_h = true;
        var3 = ((dt) this).m(9262);
        if (!(var3 == null)) {
            var3.a(35, param0);
        }
    }

    final boolean f(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 == 10915) {
          L0: {
            if (this.c(param0, -1)) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L0;
            } else {
              if (!((dt) this).field_b[((dt) this).field_g.r(param1 ^ -10957)].b(param0, (byte) -44)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_12_0 != 0;
        } else {
          int discarded$2 = ((dt) this).b(false);
          if (!this.c(param0, -1)) {
            L1: {
              if (!((dt) this).field_b[((dt) this).field_g.r(param1 ^ -10957)].b(param0, (byte) -44)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          } else {
            return true;
          }
        }
    }

    final int a(boolean param0) {
        if (!(!((dt) this).field_a)) {
            return 0;
        }
        if (!param0) {
            return -119;
        }
        return ((dt) this).field_g.f((byte) -88).field_a;
    }

    final int l(int param0) {
        if (param0 > -2) {
            return 8;
        }
        return ((dt) this).field_m;
    }

    final boolean g(int param0) {
        if (param0 < 67) {
            boolean discarded$0 = ((dt) this).j(84);
            return ((dt) this).field_f;
        }
        return ((dt) this).field_f;
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            field_n = null;
            return ((dt) this).field_a;
        }
        return ((dt) this).field_a;
    }

    final boolean i(int param0) {
        if (param0 != -14886) {
            ((dt) this).field_k = true;
            return ((dt) this).field_h;
        }
        return ((dt) this).field_h;
    }

    final void a(int param0, boolean param1) {
        ((dt) this).field_a = param1 ? true : false;
        if (param0 <= 35) {
            ((dt) this).field_l = 58;
        }
    }

    final void a(hca param0, int param1, int param2, int param3) {
        eha var5 = ((dt) this).m(9262);
        if (var5 != null) {
            var5.a(15, param0, param1, param0.f((byte) -96), ((dt) this).field_c, param3);
            if (param2 == 1) {
                return;
            }
            ((dt) this).d(18, 84);
            return;
        }
        if (param2 != 1) {
            ((dt) this).d(18, 84);
            return;
        }
    }

    public static void n(int param0) {
        if (param0 != 0) {
            dt.n(-118);
            field_n = null;
            return;
        }
        field_n = null;
    }

    final boolean e(int param0) {
        if (param0 != -31170) {
            return false;
        }
        return ((dt) this).field_k;
    }

    final boolean j(int param0) {
        if (param0 != 0) {
            ((dt) this).field_m = 36;
            return ((dt) this).field_a;
        }
        return ((dt) this).field_a;
    }

    final int b(boolean param0) {
        if (param0) {
            field_n = null;
            return ((dt) this).field_l;
        }
        return ((dt) this).field_l;
    }

    final boolean d(int param0) {
        if (param0 != 28091) {
            return true;
        }
        return (((dt) this).field_d ^ -1) < -1 ? true : false;
    }

    final void a(int param0, int param1) {
        if (param0 != -1) {
            Object var4 = null;
            la discarded$1 = this.a((byte) -105, (la) null);
            if (((dt) this).field_a) {
                return;
            }
            ((dt) this).field_f = ((dt) this).field_g.d((byte) -95, 3);
            ((dt) this).field_h = false;
            ((dt) this).field_g.f((byte) -64).d(param1, 0);
            if (!(!((dt) this).field_a)) {
                return;
            }
            ((dt) this).field_c = ((dt) this).field_c + 1;
            return;
        }
        if (((dt) this).field_a) {
            return;
        }
        ((dt) this).field_f = ((dt) this).field_g.d((byte) -95, 3);
        ((dt) this).field_h = false;
        ((dt) this).field_g.f((byte) -64).d(param1, 0);
        if (!(!((dt) this).field_a)) {
            return;
        }
        ((dt) this).field_c = ((dt) this).field_c + 1;
    }

    final void a(int param0, int param1, int param2) {
        ((dt) this).field_j[param0] = param1;
        if (param2 >= -28) {
            ((dt) this).field_g = null;
        }
    }

    final void c(int param0) {
        la var2 = null;
        la var3 = null;
        Object var5 = null;
        eha var6 = null;
        eha var7 = null;
        var2 = ((dt) this).a((byte) 123);
        if (param0 == -1) {
          L0: {
            var2.g(58);
            var3 = this.a((byte) 104, var2);
            if (!((dt) this).field_g.l(false)) {
              break L0;
            } else {
              if (var3 != null) {
                break L0;
              } else {
                var3 = ((dt) this).a(param0 + -114);
                break L0;
              }
            }
          }
          var7 = ((dt) this).m(param0 + 9263);
          if (var7 == null) {
            if (var3 == null) {
              ((dt) this).a(89, true);
              return;
            } else {
              var3.i((byte) -98);
              return;
            }
          } else {
            var7.a(((dt) this).field_g, var2, false);
            if (var3 == null) {
              ((dt) this).a(89, true);
              return;
            } else {
              var3.i((byte) -98);
              return;
            }
          }
        } else {
          L1: {
            var5 = null;
            ((dt) this).a((la) null, -52);
            var2.g(58);
            var3 = this.a((byte) 104, var2);
            if (!((dt) this).field_g.l(false)) {
              break L1;
            } else {
              if (var3 != null) {
                break L1;
              } else {
                var3 = ((dt) this).a(param0 + -114);
                break L1;
              }
            }
          }
          var6 = ((dt) this).m(param0 + 9263);
          if (var6 != null) {
            var6.a(((dt) this).field_g, var2, false);
            if (var3 == null) {
              ((dt) this).a(89, true);
              return;
            } else {
              var3.i((byte) -98);
              return;
            }
          } else {
            L2: {
              if (var3 == null) {
                ((dt) this).a(89, true);
                break L2;
              } else {
                var3.i((byte) -98);
                break L2;
              }
            }
            return;
          }
        }
    }

    final void a(iq param0, int param1) {
        la[] var3 = null;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = ((dt) this).field_b;
        var3 = var7;
        if (param1 == -1) {
          var4 = 0;
          L0: while (true) {
            if (var7.length <= var4) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.a(param0, param1 ^ -6);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          L1: {
            int discarded$5 = this.e(41, -81);
            var4 = 0;
            if (var7.length <= var4) {
              break L1;
            } else {
              L2: {
                var5 = var7[var4];
                if (var5 != null) {
                  var5.a(param0, param1 ^ -6);
                  break L2;
                } else {
                  var4++;
                  break L2;
                }
              }
              var4++;
              var4++;
              var4++;
              break L1;
            }
          }
          return;
        }
    }

    final void a(hca param0, int param1) {
        eha var3 = ((dt) this).m(9262);
        if (param1 != -1) {
            return;
        }
        if (!(var3 == null)) {
            var3.a(15, param0, 0, param0.f((byte) -118), ((dt) this).field_c, 2);
        }
    }

    final void b(byte param0) {
        System.out.println("DUMPING STATE on tick " + ((dt) this).field_c);
        System.out.println("Player: " + ((dt) this).field_g.toString());
        if (param0 != 114) {
            ((dt) this).field_k = false;
            ((dt) this).field_g.f((byte) 65).d(true);
            return;
        }
        ((dt) this).field_g.f((byte) 65).d(true);
    }

    final boolean k(int param0) {
        if (param0 != -19271) {
            return false;
        }
        if (((dt) this).field_a) {
            return false;
        }
        if (((dt) this).field_k) {
            return false;
        }
        return true;
    }

    private final int e(int param0, int param1) {
        if (param1 != 0) {
            boolean discarded$0 = ((dt) this).b(-8);
            return ((dt) this).field_j[param0];
        }
        return ((dt) this).field_j[param0];
    }

    final la a(int param0) {
        if (param0 >= -22) {
            boolean discarded$0 = ((dt) this).b(-15);
            return ((dt) this).field_b[0];
        }
        return ((dt) this).field_b[0];
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -86) {
            Object var6 = null;
            ((dt) this).a((iq) null, 103);
            ((dt) this).field_b[param3].b(false, param1, param0);
            return;
        }
        ((dt) this).field_b[param3].b(false, param1, param0);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -11) {
            ((dt) this).a(96, 125);
            ((dt) this).field_b[param2].c(-22490, param1);
            return;
        }
        ((dt) this).field_b[param2].c(-22490, param1);
    }

    final int b(boolean param0, int param1) {
        if (param0) {
            ((dt) this).a((byte) 29, -34, 71);
            return iia.d(this.e(param1, 0), ((dt) this).field_b[((dt) this).field_g.r(-101)].a(-121, param1), 2);
        }
        return iia.d(this.e(param1, 0), ((dt) this).field_b[((dt) this).field_g.r(-101)].a(-121, param1), 2);
    }

    final boolean h(int param0) {
        if (param0 < 118) {
            ((dt) this).field_h = true;
            return !((dt) this).field_a ? true : false;
        }
        return !((dt) this).field_a ? true : false;
    }

    final la a(byte param0) {
        int var2 = -127 / ((param0 - 64) / 59);
        return ((dt) this).field_b[((dt) this).field_g.r(-108)];
    }

    final int f(int param0) {
        int var2 = -97 % ((34 - param0) / 56);
        return ((dt) this).field_b.length;
    }

    final void a(int param0, int param1, la param2) {
        param2.a(param1, false);
        if (param0 != -28088) {
            boolean discarded$0 = ((dt) this).d(41);
            ((dt) this).field_b[param1] = param2;
            return;
        }
        ((dt) this).field_b[param1] = param2;
    }

    final eha m(int param0) {
        if (param0 != 9262) {
            boolean discarded$0 = ((dt) this).d(36);
            return ((dt) this).field_i;
        }
        return ((dt) this).field_i;
    }

    final void b(int param0, int param1) {
        ((dt) this).field_j[param0] = param1;
    }

    final la a(boolean param0, int param1) {
        if (!param0) {
            return null;
        }
        return ((dt) this).field_b[param1];
    }

    dt(eha param0, hca param1, int param2, int param3) {
        int var5 = 0;
        ((dt) this).field_j = new int[9];
        ((dt) this).field_e = param2;
        ((dt) this).field_g = param1;
        ((dt) this).field_d = param3;
        ((dt) this).field_i = param0;
        ((dt) this).field_m = ((dt) this).field_d + ((dt) this).field_e;
        ((dt) this).field_b = new la[((dt) this).field_m];
        for (var5 = 0; var5 < ((dt) this).field_j.length; var5++) {
            ((dt) this).field_j[var5] = -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Please wait...";
    }
}
