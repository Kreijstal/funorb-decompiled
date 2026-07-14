/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends wf {
    static int field_m;
    static sh field_u;
    static sh field_p;
    static long field_k;
    private int field_q;
    static int field_r;
    static cc[] field_o;
    private pe field_n;
    static int field_t;
    static db[] field_l;
    static int field_s;

    final int i(byte param0) {
        if (param0 != -76) {
          field_u = null;
          ((th) this).field_h = ((th) this).field_h + 1;
          return ((th) this).field_j[((th) this).field_h] - ((th) this).field_n.c(0) & 255;
        } else {
          ((th) this).field_h = ((th) this).field_h + 1;
          return ((th) this).field_j[((th) this).field_h] - ((th) this).field_n.c(0) & 255;
        }
    }

    final void f(int param0) {
        ((th) this).field_h = (((th) this).field_q - -7) / param0;
    }

    final static void a(byte param0, String[] param1) {
        if (param0 >= 56) {
          if (null == bg.field_b) {
            if (null != hd.field_a) {
              hd.field_a.field_F.a(param1, false);
              return;
            } else {
              return;
            }
          } else {
            bg.field_b.field_C.a(param1, false);
            if (null == hd.field_a) {
              return;
            } else {
              hd.field_a.field_F.a(param1, false);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void h(int param0, int param1) {
        ((th) this).field_h = ((th) this).field_h + 1;
        ((th) this).field_j[((th) this).field_h] = (byte)(param0 + ((th) this).field_n.c(param1));
    }

    final void e(int param0) {
        if (param0 != 10) {
            return;
        }
        ((th) this).field_q = 8 * ((th) this).field_h;
    }

    final int g(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var3 = ((th) this).field_q >> 558169987;
        if (param1 == 26527) {
          var4 = -(7 & ((th) this).field_q) + 8;
          var5 = 0;
          ((th) this).field_q = ((th) this).field_q + param0;
          L0: while (true) {
            if (param0 <= var4) {
              L1: {
                if (param0 != var4) {
                  var5 = var5 + (((th) this).field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                  break L1;
                } else {
                  var5 = var5 + (((th) this).field_j[var3] & bd.field_j[var4]);
                  break L1;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((bd.field_j[var4] & ((th) this).field_j[var3]) << -var4 + param0);
              param0 = param0 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          field_r = 53;
          var4 = -(7 & ((th) this).field_q) + 8;
          var5 = 0;
          ((th) this).field_q = ((th) this).field_q + param0;
          L2: while (true) {
            if (param0 <= var4) {
              L3: {
                if (param0 != var4) {
                  var5 = var5 + (((th) this).field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                  break L3;
                } else {
                  var5 = var5 + (((th) this).field_j[var3] & bd.field_j[var4]);
                  break L3;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((bd.field_j[var4] & ((th) this).field_j[var3]) << -var4 + param0);
              param0 = param0 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    th(byte[] param0) {
        super(param0);
    }

    final static int a(CharSequence param0, int param1, int param2) {
        if (param1 != 8) {
            return 116;
        }
        return ti.a(param2, param0, 18, true);
    }

    public static void j(byte param0) {
        field_l = null;
        field_u = null;
        field_o = null;
        field_p = null;
        int var1 = -42 % ((-6 - param0) / 50);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int var6 = 0;
        int var7 = Lexicominos.field_L ? 1 : 0;
        int var5 = -69 % ((-4 - param2) / 32);
        for (var6 = 0; param0 > var6; var6++) {
            ((th) this).field_h = ((th) this).field_h + 1;
            param3[var6 - -param1] = (byte)(((th) this).field_j[((th) this).field_h] + -((th) this).field_n.c(0));
        }
    }

    final void a(int[] param0, int param1) {
        int var3 = 18 / ((param1 - -36) / 50);
        ((th) this).field_n = new pe(param0);
    }

    th(int param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new cc[10];
    }
}
