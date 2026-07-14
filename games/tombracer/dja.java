/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dja extends nv implements ut {
    static jea field_p;
    private jma field_n;
    static int field_r;
    private boolean field_q;
    private int field_o;
    private int field_t;
    static String[] field_s;

    public static void l(int param0) {
        field_s = null;
        if (param0 != 1) {
            field_r = 91;
        }
        field_p = null;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            int discarded$0 = ((dja) this).c(56);
        }
        param0 = fs.a((byte) 122, param0, ((dja) this).field_t);
        return ((dja) this).field_n.a(105, param0);
    }

    final void k(int param0) {
        int var2 = 0;
        npa var3 = null;
        ffa[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (!((dja) this).field_n.f((byte) -56)) {
            break L0;
          } else {
            ((dja) this).c(false);
            break L0;
          }
        }
        var2 = 0;
        var3 = ((dja) this).b(true).field_u;
        var4 = var3.a((byte) -26, (ffa) (Object) ((dja) this).field_g);
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4.length) {
            ((dja) this).field_t = var2;
            var5 = 0;
            if (param0 == 5418) {
              L2: {
                if (0 >= var2) {
                  break L2;
                } else {
                  if (((dja) this).field_o > var2) {
                    break L2;
                  } else {
                    var5 = 1;
                    break L2;
                  }
                }
              }
              ((dja) this).field_n.a((byte) -14, var5 != 0);
              return;
            } else {
              return;
            }
          } else {
            if (this.a(var4[var5], (byte) -103)) {
              var2 = var2 + var4[var5].b(75);
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            ((dja) this).k(121);
        }
        return 3364198;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -127, ((dja) this).field_o, 8);
        param1.a((byte) -128, !((dja) this).field_q ? 0 : 1, 1);
        ((dja) this).field_n.a(((dja) this).h((byte) 117), (byte) 117, param1);
    }

    dja(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((dja) this).field_o = param1.b((byte) 44, 8);
        if (param0.field_E <= 10) {
            ((dja) this).field_o = ((dja) this).field_o / 5;
        }
        if (9 <= param0.field_E) {
            ((dja) this).field_q = 1 != param1.b((byte) 44, 1) ? false : true;
        }
        ((dja) this).field_n = new jma(15, param0, param1);
    }

    public final int b(int param0) {
        int var2 = 33 % ((param0 - -46) / 45);
        return ((dja) this).field_o;
    }

    dja(la param0, boolean param1) {
        super(param0, param1);
        ((dja) this).field_o = 50;
        ((dja) this).field_n = new jma(15);
    }

    final int a(boolean param0) {
        if (param0) {
            field_s = null;
        }
        return 17;
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            return -69;
        }
        return 8969727;
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            ((dja) this).field_q = true;
        }
        return ((dja) this).field_n;
    }

    final void a(int param0, boolean param1) {
        ((dja) this).field_o = param0;
        if (!param1) {
            dja.l(56);
        }
    }

    private final boolean a(ffa param0, byte param1) {
        if (!param0.a(124)) {
            return false;
        }
        if (param1 > -73) {
            ((dja) this).k(15);
        }
        if (!((Object) (Object) ((dja) this).field_g != (Object) (Object) param0)) {
            return false;
        }
        if (((dja) this).field_q) {
            // ifne L231
            return false;
        }
        if (!io.a(((dja) this).field_g.c(-73), param0.e(9648), (byte) -89, ((dja) this).field_g.a((byte) 55), param0.d(3), ((dja) this).field_g.e(9648), param0.a((byte) 55), param0.c(-43), ((dja) this).field_g.d(3))) {
            return false;
        }
        return true;
    }

    final void g(int param0) {
        super.g(param0);
        ((dja) this).field_n.a((byte) 48, ((dja) this).h((byte) 125));
    }

    public final int j(byte param0) {
        if (param0 != -108) {
            ((dja) this).field_q = true;
        }
        return ((dja) this).field_t;
    }

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              var2 = -39 % ((param0 - -76) / 36);
              if (param1 < 65) {
                break L2;
              } else {
                if (param1 <= 90) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < 97) {
                break L3;
              } else {
                if (param1 > 122) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    final static boolean a(int param0, int param1, byte param2, int param3) {
        if (hka.field_b != null) {
            if (hka.field_b.a(13)) {
                wp.a(param2 ^ 105);
                return true;
            }
        }
        if (null != fj.field_c) {
            if (!(!fj.field_c.b(true))) {
                fj.field_c = null;
                wp.a(-1);
                return true;
            }
        }
        if (param2 != -106) {
            field_s = null;
        }
        if (!(!bc.a(true))) {
            return true;
        }
        if (mda.b(param3, (byte) -44, param1, param0)) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 7;
    }
}
