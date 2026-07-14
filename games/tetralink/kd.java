/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String field_e;
    static ha field_g;
    private long field_f;
    private gb[] field_j;
    private int field_a;
    private gb field_b;
    private int field_d;
    static int field_h;
    private gb field_c;
    static String field_m;
    static hl field_i;
    static String field_k;
    static int field_l;

    final gb c(int param0) {
        gb var2 = null;
        gb var3 = null;
        int var4 = 0;
        var4 = TetraLink.field_J;
        if (null != ((kd) this).field_b) {
          var2 = ((kd) this).field_j[(int)(((kd) this).field_f & (long)(-1 + ((kd) this).field_a))];
          L0: while (true) {
            if (var2 == ((kd) this).field_b) {
              ((kd) this).field_b = null;
              if (param0 >= 121) {
                return null;
              } else {
                return null;
              }
            } else {
              if ((((kd) this).field_b.field_n ^ -1L) == (((kd) this).field_f ^ -1L)) {
                var3 = ((kd) this).field_b;
                ((kd) this).field_b = ((kd) this).field_b.field_o;
                return var3;
              } else {
                ((kd) this).field_b = ((kd) this).field_b.field_o;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(long param0, gb param1, int param2) {
        gb var5 = null;
        gb var6 = null;
        gb var7 = null;
        gb var8 = null;
        gb var9 = null;
        if (param1.field_s == null) {
          if (param2 < 94) {
            kd.a(-121, 28, (byte) -36);
            var8 = ((kd) this).field_j[(int)(param0 & (long)(((kd) this).field_a + -1))];
            var5 = var8;
            param1.field_o = var5;
            param1.field_s = var8.field_s;
            param1.field_s.field_o = param1;
            param1.field_o.field_s = param1;
            param1.field_n = param0;
            return;
          } else {
            var9 = ((kd) this).field_j[(int)(param0 & (long)(((kd) this).field_a + -1))];
            var5 = var9;
            param1.field_o = var5;
            param1.field_s = var9.field_s;
            param1.field_s.field_o = param1;
            param1.field_o.field_s = param1;
            param1.field_n = param0;
            return;
          }
        } else {
          param1.e(0);
          if (param2 >= 94) {
            var6 = ((kd) this).field_j[(int)(param0 & (long)(((kd) this).field_a + -1))];
            var5 = var6;
            param1.field_o = var5;
            param1.field_s = var6.field_s;
            param1.field_s.field_o = param1;
            param1.field_o.field_s = param1;
            param1.field_n = param0;
            return;
          } else {
            kd.a(-121, 28, (byte) -36);
            var7 = ((kd) this).field_j[(int)(param0 & (long)(((kd) this).field_a + -1))];
            var5 = var7;
            param1.field_o = var5;
            param1.field_s = var7.field_s;
            param1.field_s.field_o = param1;
            param1.field_o.field_s = param1;
            param1.field_n = param0;
            return;
          }
        }
    }

    final static void a(int param0, int param1, byte param2) {
        md.field_G = param0;
        ta.field_a = param0;
        ik.field_a = param1;
        ta.field_b = param1;
        if (param2 != -121) {
            return;
        }
        vn.a(param0, param1);
    }

    public static void a(int param0) {
        field_e = null;
        field_i = null;
        int var1 = -52 / ((-5 - param0) / 51);
        field_g = null;
        field_k = null;
        field_m = null;
    }

    final gb a(long param0, int param1) {
        gb var4 = null;
        gb var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        ((kd) this).field_f = param0;
        var4 = ((kd) this).field_j[(int)((long)(((kd) this).field_a - param1) & param0)];
        ((kd) this).field_b = var4.field_o;
        L0: while (true) {
          if (((kd) this).field_b != var4) {
            if (((kd) this).field_b.field_n == param0) {
              var5 = ((kd) this).field_b;
              ((kd) this).field_b = ((kd) this).field_b.field_o;
              return var5;
            } else {
              ((kd) this).field_b = ((kd) this).field_b.field_o;
              continue L0;
            }
          } else {
            ((kd) this).field_b = null;
            return null;
          }
        }
    }

    final gb b(int param0) {
        ((kd) this).field_d = 0;
        int var2 = 31 / ((param0 - 38) / 43);
        return ((kd) this).d(-1);
    }

    final gb d(int param0) {
        int var3 = 0;
        gb var4 = null;
        gb var5 = null;
        gb var8 = null;
        var3 = TetraLink.field_J;
        if (param0 > (((kd) this).field_d ^ -1)) {
          if (((kd) this).field_c == ((kd) this).field_j[-1 + ((kd) this).field_d]) {
            L0: while (true) {
              if (((kd) this).field_a > ((kd) this).field_d) {
                ((kd) this).field_d = ((kd) this).field_d + 1;
                var5 = ((kd) this).field_j[((kd) this).field_d].field_o;
                if (((kd) this).field_j[((kd) this).field_d - 1] != var5) {
                  ((kd) this).field_c = var5.field_o;
                  return var5;
                } else {
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            var8 = ((kd) this).field_c;
            ((kd) this).field_c = var8.field_o;
            return var8;
          }
        } else {
          L1: while (true) {
            if (((kd) this).field_a > ((kd) this).field_d) {
              ((kd) this).field_d = ((kd) this).field_d + 1;
              var4 = ((kd) this).field_j[((kd) this).field_d].field_o;
              if (((kd) this).field_j[((kd) this).field_d - 1] != var4) {
                ((kd) this).field_c = var4.field_o;
                return var4;
              } else {
                continue L1;
              }
            } else {
              return null;
            }
          }
        }
    }

    kd(int param0) {
        int var2 = 0;
        gb var3 = null;
        ((kd) this).field_d = 0;
        ((kd) this).field_j = new gb[param0];
        ((kd) this).field_a = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            var3 = new gb();
            ((kd) this).field_j[var2] = new gb();
            var3.field_o = var3;
            var3.field_s = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_g = new ha();
        field_m = "Spectate";
        field_k = "<%0> has entered a game.";
    }
}
