/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends wk implements rc {
    static int[] field_S;
    static int[] field_N;
    static boolean field_P;
    static char[] field_O;
    static we[] field_R;
    private wd field_Q;

    nh(pf param0, lg param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        lk var6 = null;
        String var7 = null;
        lk var8 = null;
        String var9 = null;
        lk var10 = null;
        lk var11 = null;
        var3 = null;
        if (nb.field_c != param1) {
          if (param1 != jb.field_c) {
            L0: {
              if (param1 != jk.field_a) {
                break L0;
              } else {
                var3 = pe.field_g;
                ((nh) this).field_m = ((nh) this).field_m + 30;
                break L0;
              }
            }
            var11 = new lk(var3, (sk) null);
            var11.field_k = ((nh) this).field_k;
            var11.field_r = 0;
            var11.field_m = 80;
            var11.field_i = 50;
            var11.field_j = (fc) (Object) new jd(qj.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((nh) this).b(var11, true);
            ((nh) this).field_Q = this.a(-20017, (sk) this, uk.field_b);
          } else {
            var7 = of.field_a;
            var3 = var7;
            var3 = var7;
            ((nh) this).field_m = ((nh) this).field_m + 10;
            if (ng.a(113)) {
              var9 = k.field_E;
              var3 = var9;
              var3 = var9;
              ((nh) this).field_m = ((nh) this).field_m + 20;
              var10 = new lk(var9, (sk) null);
              var10.field_k = ((nh) this).field_k;
              var10.field_r = 0;
              var10.field_m = 80;
              var10.field_i = 50;
              var10.field_j = (fc) (Object) new jd(qj.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((nh) this).b(var10, true);
              ((nh) this).field_Q = this.a(-20017, (sk) this, uk.field_b);
            } else {
              var8 = new lk(var7, (sk) null);
              var8.field_k = ((nh) this).field_k;
              var8.field_r = 0;
              var8.field_m = 80;
              var8.field_i = 50;
              var8.field_j = (fc) (Object) new jd(qj.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((nh) this).b(var8, true);
              ((nh) this).field_Q = this.a(-20017, (sk) this, uk.field_b);
            }
          }
        } else {
          var5 = ra.field_f;
          var6 = new lk(var5, (sk) null);
          var6.field_k = ((nh) this).field_k;
          var6.field_r = 0;
          var6.field_m = 80;
          var6.field_i = 50;
          var6.field_j = (fc) (Object) new jd(qj.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((nh) this).b(var6, true);
          ((nh) this).field_Q = this.a(-20017, (sk) this, uk.field_b);
        }
    }

    public static void j(byte param0) {
        field_S = null;
        field_N = null;
        field_O = null;
        field_R = null;
        if (param0 != -102) {
            nh.j((byte) 26);
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        if (param0 >= 6) {
          if (param4 == ((nh) this).field_Q) {
            this.m(0);
            return;
          } else {
            return;
          }
        } else {
          ((nh) this).field_Q = null;
          if (param4 != ((nh) this).field_Q) {
            return;
          } else {
            this.m(0);
            return;
          }
        }
    }

    private final void m(int param0) {
        if (!((nh) this).field_D) {
            return;
        }
        ((nh) this).field_D = false;
        if (param0 != 0) {
            field_O = null;
        }
    }

    final static Object a(boolean param0, int param1, byte[] param2) {
        de var3 = null;
        if (param1 == -11560) {
          if (param2 != null) {
            if (-137 <= (param2.length ^ -1)) {
              if (!param0) {
                return (Object) (Object) param2;
              } else {
                return (Object) (Object) rd.a((byte) -91, param2);
              }
            } else {
              var3 = new de();
              ((ah) (Object) var3).a((byte) 68, param2);
              return (Object) (Object) var3;
            }
          } else {
            return null;
          }
        } else {
          field_S = null;
          if (param2 != null) {
            if (-137 <= (param2.length ^ -1)) {
              if (!param0) {
                return (Object) (Object) param2;
              } else {
                return (Object) (Object) rd.a((byte) -91, param2);
              }
            } else {
              var3 = new de();
              ((ah) (Object) var3).a((byte) 68, param2);
              return (Object) (Object) var3;
            }
          } else {
            return null;
          }
        }
    }

    private final wd a(int param0, sk param1, String param2) {
        wd var4 = null;
        int var5 = 0;
        if (param0 != -20017) {
          field_N = null;
          var4 = new wd(param2, param1);
          var4.field_j = (fc) (Object) new jh();
          var5 = -6 + ((nh) this).field_m;
          ((nh) this).field_m = ((nh) this).field_m + 38;
          var4.b(30, 80, ((nh) this).field_k - 30, 15, var5);
          ((nh) this).b((lk) (Object) var4, true);
          ((nh) this).g(11213);
          return var4;
        } else {
          var4 = new wd(param2, param1);
          var4.field_j = (fc) (Object) new jh();
          var5 = -6 + ((nh) this).field_m;
          ((nh) this).field_m = ((nh) this).field_m + 38;
          var4.b(30, 80, ((nh) this).field_k - 30, 15, var5);
          ((nh) this).b((lk) (Object) var4, true);
          ((nh) this).g(11213);
          return var4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new char[]{(char)91, (char)93, (char)35};
        field_N = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_P = false;
    }
}
