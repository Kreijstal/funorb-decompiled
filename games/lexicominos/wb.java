/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb {
    static String field_c;
    ci field_l;
    static int field_i;
    static java.math.BigInteger field_m;
    static java.awt.Image field_g;
    ci field_k;
    ci field_d;
    ci field_f;
    wf field_b;
    int field_e;
    long field_n;
    volatile int field_p;
    byte field_a;
    wf field_h;
    volatile int field_j;
    dc field_o;

    final int c(byte param0) {
        if (param0 != 67) {
          ((wb) this).field_p = -101;
          return ((wb) this).field_l.b(97) + ((wb) this).field_k.b(109);
        } else {
          return ((wb) this).field_l.b(97) + ((wb) this).field_k.b(109);
        }
    }

    abstract boolean a(byte param0);

    abstract void b(int param0);

    public static void d(int param0) {
        field_m = null;
        field_c = null;
        field_g = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Lexicominos.field_L ? 1 : 0;
        jj.field_d = null;
        gb.field_d = false;
        if (!ca.field_k) {
          var1 = be.field_l;
          if (var1 > 0) {
            if (var1 == 1) {
              jj.field_d = oj.field_d;
              jj.field_d = ef.a(new CharSequence[3], 0);
              jj.field_a.g(true);
              vg.a(113);
              return;
            } else {
              jj.field_d = da.a(new String[1], mc.field_m, false);
              jj.field_d = ef.a(new CharSequence[3], 0);
              jj.field_a.g(true);
              vg.a(113);
              return;
            }
          } else {
            jj.field_a.g(true);
            vg.a(113);
            return;
          }
        } else {
          jj.field_a.i(15);
          return;
        }
    }

    abstract void c(int param0);

    final static db[] a(int param0, int param1, int param2, int param3, int param4) {
        db[] var6 = new db[9];
        db[] var5 = var6;
        db dupTemp$0 = gf.a((byte) -76, param2, param0);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        db dupTemp$1 = gf.a((byte) -76, param2, param3);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(param1 == 0)) {
            var6[4] = gf.a((byte) -76, 64, param1);
        }
        return var5;
    }

    final int a(boolean param0) {
        if (!param0) {
          dc discarded$2 = ((wb) this).a(-12, 71, 119, (byte) 102, true);
          return ((wb) this).field_d.b(97) + ((wb) this).field_f.b(111);
        } else {
          return ((wb) this).field_d.b(97) + ((wb) this).field_f.b(111);
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            boolean discarded$10 = ((wb) this).e(-75);
            if (20 > ((wb) this).c((byte) 67)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (20 > ((wb) this).c((byte) 67)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final dc a(int param0, int param1, int param2, byte param3, boolean param4) {
        if (param0 != 5) {
            return null;
        }
        long var6 = (long)param2 + ((long)param1 << 32);
        dc var8 = new dc();
        var8.field_j = var6;
        var8.field_p = param4 ? true : false;
        var8.field_A = param3;
        if (!param4) {
            if (!(((wb) this).a(true) < 20)) {
                throw new RuntimeException();
            }
            ((wb) this).field_d.a(83, (ca) (Object) var8);
        } else {
            if (!(((wb) this).c((byte) 67) < 20)) {
                throw new RuntimeException();
            }
            ((wb) this).field_l.a(param0 + -74, (ca) (Object) var8);
        }
        return var8;
    }

    abstract void a(boolean param0, int param1, Object param2);

    final boolean a(int param0) {
        if (param0 != 9172) {
            return true;
        }
        return ((wb) this).a(true) >= 20 ? true : false;
    }

    wb() {
        ((wb) this).field_l = new ci();
        ((wb) this).field_k = new ci();
        ((wb) this).field_d = new ci();
        ((wb) this).field_f = new ci();
        ((wb) this).field_b = new wf(6);
        ((wb) this).field_p = 0;
        ((wb) this).field_a = (byte) 0;
        ((wb) this).field_j = 0;
        ((wb) this).field_h = new wf(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_c = "Updates will sent to the email address you've given";
        field_m = new java.math.BigInteger("65537");
    }
}
