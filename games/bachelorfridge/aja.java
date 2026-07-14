/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aja extends pv {
    private double field_j;
    static sna field_p;
    static sna field_l;
    static int field_o;
    static String field_m;
    private int field_n;
    private int field_k;

    private final int d(int param0) {
        if (param0 < 121) {
          ((aja) this).field_k = -18;
          return 100 * Math.abs(((aja) this).field_k) / 56;
        } else {
          return 100 * Math.abs(((aja) this).field_k) / 56;
        }
    }

    final static boolean e(int param0) {
        if (param0 == 11) {
          if (gja.b(param0 + -16114)) {
            if ((vr.field_b & 8) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void b(int param0) {
        field_l = null;
        int var1 = -36 % ((param0 - 28) / 40);
        field_p = null;
        field_m = null;
    }

    private final void c(int param0) {
        if (param0 != 64) {
            ((aja) this).field_n = 44;
        }
    }

    private final int c(byte param0) {
        if (param0 >= -14) {
          ((aja) this).field_k = 90;
          return ((aja) this).field_n + (int)((double)((aja) this).field_g * ((aja) this).field_j);
        } else {
          return ((aja) this).field_n + (int)((double)((aja) this).field_g * ((aja) this).field_j);
        }
    }

    final boolean b(boolean param0) {
        ((aja) this).field_g = ((aja) this).field_g + 1;
        if (((aja) this).field_g + 1 <= this.d(124)) {
          if (param0) {
            if (((aja) this).field_g == 1) {
              if (-1 >= (((aja) this).field_k ^ -1)) {
                ((aja) this).field_f.field_u = ((aja) this).field_f.field_u + 1;
                ((aja) this).field_f.field_v.a((byte) 49, ((aja) this).field_f.field_g.field_o.field_b, 15);
                ((aja) this).field_f.field_n = this.c((byte) -92);
                return false;
              } else {
                ((aja) this).field_f.field_u = ((aja) this).field_f.field_u - 1;
                ((aja) this).field_f.field_v.a((byte) 49, ((aja) this).field_f.field_g.field_o.field_b, 15);
                ((aja) this).field_f.field_n = this.c((byte) -92);
                return false;
              }
            } else {
              ((aja) this).field_f.field_n = this.c((byte) -92);
              return false;
            }
          } else {
            int discarded$1 = this.d(-44);
            if (((aja) this).field_g == 1) {
              if (-1 >= (((aja) this).field_k ^ -1)) {
                ((aja) this).field_f.field_u = ((aja) this).field_f.field_u + 1;
                ((aja) this).field_f.field_v.a((byte) 49, ((aja) this).field_f.field_g.field_o.field_b, 15);
                ((aja) this).field_f.field_n = this.c((byte) -92);
                return false;
              } else {
                ((aja) this).field_f.field_u = ((aja) this).field_f.field_u - 1;
                ((aja) this).field_f.field_v.a((byte) 49, ((aja) this).field_f.field_g.field_o.field_b, 15);
                ((aja) this).field_f.field_n = this.c((byte) -92);
                return false;
              }
            } else {
              ((aja) this).field_f.field_n = this.c((byte) -92);
              return false;
            }
          }
        } else {
          this.c(64);
          return true;
        }
    }

    aja(jfa param0, int param1) {
        ((aja) this).field_k = param1;
        ((aja) this).field_f = param0;
        ((aja) this).field_n = ((aja) this).field_f.field_n;
        ((aja) this).field_j = (double)((aja) this).field_k / (double)this.d(124);
        if ((((aja) this).field_k ^ -1) <= -1) {
            ((aja) this).field_f.field_s = true;
        } else {
            ((aja) this).field_f.field_s = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 64;
        field_m = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
