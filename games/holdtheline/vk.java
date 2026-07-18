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
        if (((vk) this).field_g != null) {
          if (((vk) this).field_g.field_s == param2) {
            if (param1 == ((vk) this).field_f) {
              if (((vk) this).field_l != ((vk) this).field_w) {
                int discarded$4 = -12392;
                ((vk) this).field_g = vg.a(param2, param1, (vk) this);
                ((vk) this).field_w = ((vk) this).field_l;
                ((vk) this).field_f = param1;
                return ((vk) this).field_g;
              } else {
                return ((vk) this).field_g;
              }
            } else {
              int discarded$5 = -12392;
              ((vk) this).field_g = vg.a(param2, param1, (vk) this);
              ((vk) this).field_w = ((vk) this).field_l;
              ((vk) this).field_f = param1;
              return ((vk) this).field_g;
            }
          } else {
            int discarded$6 = -12392;
            ((vk) this).field_g = vg.a(param2, param1, (vk) this);
            ((vk) this).field_w = ((vk) this).field_l;
            ((vk) this).field_f = param1;
            return ((vk) this).field_g;
          }
        } else {
          int discarded$7 = -12392;
          ((vk) this).field_g = vg.a(param2, param1, (vk) this);
          ((vk) this).field_w = ((vk) this).field_l;
          ((vk) this).field_f = param1;
          return ((vk) this).field_g;
        }
    }

    final static void a(boolean param0) {
        if (!(ka.field_b == null)) {
            ka.field_b.f((byte) -84);
        }
        if (!(null == be.field_l)) {
            be.field_l.i((byte) 33);
        }
        pj.a((byte) -96);
    }

    final boolean b(int param0) {
        if (param0 == 3) {
          if (-1 != ((vk) this).field_l) {
            int discarded$10 = -65;
            if (mm.a((vk) this)) {
              ((vk) this).field_l = -1;
              return true;
            } else {
              ((vk) this).field_l = kg.a((byte) 47, (vk) this);
              return false;
            }
          } else {
            return true;
          }
        } else {
          ((vk) this).field_n = 41;
          if (-1 != ((vk) this).field_l) {
            int discarded$11 = -65;
            if (mm.a((vk) this)) {
              ((vk) this).field_l = -1;
              return true;
            } else {
              ((vk) this).field_l = kg.a((byte) 47, (vk) this);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    public static void a() {
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
            ((vk) this).field_s = param0;
            ((vk) this).field_g = null;
            ((vk) this).field_r = false;
            ((vk) this).field_h = null;
            ((vk) this).field_l = 0;
            ((vk) this).field_e = new ei();
            ((vk) this).field_t = new ei();
            ((vk) this).field_c = new ei();
            ((vk) this).field_k = new ah();
            ((vk) this).field_m = new ah();
            ((vk) this).field_x = new ah();
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "vk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    vk(String param0) {
        try {
            ((vk) this).field_r = true;
            ((vk) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "vk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[]{8437888, 15187496, 16777215, 8421504};
        field_i = "Try again";
        field_d = new int[]{3, 3, 2};
    }
}
