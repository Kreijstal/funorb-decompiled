/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    int field_o;
    ah field_x;
    byte field_v;
    ah field_m;
    boolean field_r;
    private int field_f;
    int field_p;
    ah field_k;
    wd[] field_u;
    int field_n;
    String field_b;
    private int field_w;
    static int[] field_q;
    int field_l;
    om[] field_j;
    private hj field_g;
    static boolean field_a;
    ei field_e;
    static String field_i;
    ei field_c;
    static int[] field_d;
    byte[] field_s;
    ei field_t;
    String field_h;

    final hj a(int param0, int param1, int param2) {
        L0: {
          if (param0 == 9392) {
            break L0;
          } else {
            vk.a(true, true, -63);
            break L0;
          }
        }
        if (this.field_g != null) {
          if (this.field_g.field_s == param2) {
            if (param1 == this.field_f) {
              if (this.field_l != this.field_w) {
                this.field_g = vg.a(param2, param1, (vk) (this), -12392);
                this.field_w = this.field_l;
                this.field_f = param1;
                return this.field_g;
              } else {
                return this.field_g;
              }
            } else {
              this.field_g = vg.a(param2, param1, (vk) (this), -12392);
              this.field_w = this.field_l;
              this.field_f = param1;
              return this.field_g;
            }
          } else {
            this.field_g = vg.a(param2, param1, (vk) (this), -12392);
            this.field_w = this.field_l;
            this.field_f = param1;
            return this.field_g;
          }
        } else {
          this.field_g = vg.a(param2, param1, (vk) (this), -12392);
          this.field_w = this.field_l;
          this.field_f = param1;
          return this.field_g;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          L0: {
            field_d = (int[]) null;
            if (ka.field_b != null) {
              ka.field_b.f((byte) -84);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != be.field_l) {
              be.field_l.i((byte) 33);
              break L1;
            } else {
              break L1;
            }
          }
          pj.a((byte) -96);
          return;
        } else {
          L2: {
            if (ka.field_b != null) {
              ka.field_b.f((byte) -84);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != be.field_l) {
              be.field_l.i((byte) 33);
              break L3;
            } else {
              break L3;
            }
          }
          pj.a((byte) -96);
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 == 3) {
          if (-1 != this.field_l) {
            if (mm.a((vk) (this), -65)) {
              this.field_l = -1;
              return true;
            } else {
              this.field_l = kg.a((byte) 47, (vk) (this));
              return false;
            }
          } else {
            return true;
          }
        } else {
          this.field_n = 41;
          if (-1 != this.field_l) {
            if (mm.a((vk) (this), -65)) {
              this.field_l = -1;
              return true;
            } else {
              this.field_l = kg.a((byte) 47, (vk) (this));
              return false;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 3) {
            return;
        }
        field_i = null;
        field_d = null;
        field_q = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = 0;
        var3 = 77 / ((-38 - param2) / 56);
        if (!param1) {
          tc.c();
          gb.a(0, param1);
          return;
        } else {
          tc.c(0, 0, tc.field_j, tc.field_c, 0, 192);
          gb.a(0, param1);
          return;
        }
    }

    vk(byte[] param0) {
        try {
            this.field_s = param0;
            this.field_g = null;
            this.field_r = false;
            this.field_h = null;
            this.field_l = 0;
            this.field_e = new ei();
            this.field_t = new ei();
            this.field_c = new ei();
            this.field_k = new ah();
            this.field_m = new ah();
            this.field_x = new ah();
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    vk(String param0) {
        try {
            this.field_r = true;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new int[]{8437888, 15187496, 16777215, 8421504};
        field_i = "Try again";
        field_d = new int[]{3, 3, 2};
    }
}
