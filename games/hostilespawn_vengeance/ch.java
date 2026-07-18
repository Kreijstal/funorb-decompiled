/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ch {
    static vl field_p;
    static int field_e;
    private double field_l;
    private double field_i;
    private int field_o;
    kh field_n;
    private long field_c;
    mn[] field_g;
    static String field_b;
    static String field_d;
    static long field_a;
    static int field_q;
    private int field_j;
    static jd field_h;
    static String field_f;
    private int field_m;
    static String field_k;

    void b(int param0) {
        long var2 = 0L;
        double var4 = 0.0;
        if (param0 == -24) {
          var2 = hn.a((byte) 80);
          var4 = ((ch) this).field_i * (double)(-((ch) this).field_c + var2);
          ((ch) this).field_c = var2;
          if (0.0 != var4) {
            ((ch) this).field_l = ((ch) this).field_l + var4;
            if (var4 > 0.0) {
              if ((double)((ch) this).field_m > ((ch) this).field_l) {
                return;
              } else {
                ((ch) this).field_l = (double)((ch) this).field_m;
                ((ch) this).field_i = 0.0;
                return;
              }
            } else {
              if ((double)((ch) this).field_m < ((ch) this).field_l) {
                return;
              } else {
                ((ch) this).field_l = (double)((ch) this).field_m;
                ((ch) this).field_i = 0.0;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_d = null;
        field_h = null;
        field_b = null;
        field_p = null;
        field_k = null;
    }

    final void a(int param0, int param1) {
        if (0.0 == ((ch) this).field_l) {
          if (((ch) this).field_m != 0) {
            if (param1 != 8000) {
              ((ch) this).a(97);
              ((ch) this).field_m = 0;
              ((ch) this).field_n.a(this.a(0, (byte) 55), param0, -1702);
              ((ch) this).field_i = -((ch) this).field_l / (double)param0;
              return;
            } else {
              ((ch) this).field_m = 0;
              ((ch) this).field_n.a(this.a(0, (byte) 55), param0, -1702);
              ((ch) this).field_i = -((ch) this).field_l / (double)param0;
              return;
            }
          } else {
            return;
          }
        } else {
          if (param1 != 8000) {
            ((ch) this).a(97);
            ((ch) this).field_m = 0;
            ((ch) this).field_n.a(this.a(0, (byte) 55), param0, -1702);
            ((ch) this).field_i = -((ch) this).field_l / (double)param0;
            return;
          } else {
            ((ch) this).field_m = 0;
            ((ch) this).field_n.a(this.a(0, (byte) 55), param0, -1702);
            ((ch) this).field_i = -((ch) this).field_l / (double)param0;
            return;
          }
        }
    }

    void a(int param0) {
        if (param0 != 256) {
            return;
        }
        ((ch) this).field_l = 0.0;
        ((ch) this).field_m = 0;
        ((ch) this).field_i = 0.0;
    }

    final static void a() {
        re.field_k = false;
        qh.field_q = -1;
        eb.field_d = null;
        l.field_d = -1;
        fb.field_l = 0;
    }

    private final mn a(int param0, byte param1) {
        return ((ch) this).field_g[param0];
    }

    ch(kh param0, mn[] param1) {
        ((ch) this).field_o = 8000;
        ((ch) this).field_c = 0L;
        ((ch) this).field_j = 100;
        try {
            ((ch) this).field_n = param0;
            ((ch) this).field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ch.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0, byte param1) {
        double var3 = 0.0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 != ((ch) this).field_m) {
          if (param1 < 86) {
            L0: {
              ((ch) this).a(65, 114);
              ((ch) this).field_m = param0;
              var3 = (double)((ch) this).field_m - ((ch) this).field_l;
              if (var3 >= 0.0) {
                stackOut_9_0 = ((ch) this).field_j;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = ((ch) this).field_o;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            var5 = stackIn_10_0;
            ((ch) this).field_n.a(this.a(((ch) this).field_m, (byte) 55), var5, -1702);
            ((ch) this).field_i = var3 / (double)var5;
            return true;
          } else {
            L1: {
              ((ch) this).field_m = param0;
              var3 = (double)((ch) this).field_m - ((ch) this).field_l;
              if (var3 >= 0.0) {
                stackOut_5_0 = ((ch) this).field_j;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = ((ch) this).field_o;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            var5 = stackIn_6_0;
            ((ch) this).field_n.a(this.a(((ch) this).field_m, (byte) 55), var5, -1702);
            ((ch) this).field_i = var3 / (double)var5;
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 500;
        field_p = new vl();
        field_d = "Discard";
        field_b = "This door is locked. There must be another way through.";
        field_q = 0;
        field_a = 20000000L;
        field_k = "I wonder what this is for.";
        field_f = "This shuttle has been eviscerated by the alien goo. There's no way I can use it now.";
    }
}
