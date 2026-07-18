/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vb {
    ii field_c;
    static int[][] field_a;
    static String field_e;
    static int field_n;
    ii field_l;
    static int field_r;
    static String field_m;
    ii field_k;
    static boolean field_q;
    ii field_i;
    int field_g;
    long field_j;
    uf field_d;
    volatile int field_b;
    uf field_o;
    byte field_f;
    volatile int field_h;
    db field_p;

    abstract void a(boolean param0, Object param1, byte param2);

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return 20 <= ((vb) this).c((byte) 99) ? true : false;
    }

    abstract void c(int param0);

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (param2) {
          L0: {
            var4 += 4;
            if (param1) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          return null;
        } else {
          L1: {
            if (param1) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          return null;
        }
    }

    final int c(byte param0) {
        if (param0 != 99) {
          vb.d(50);
          return ((vb) this).field_k.a(true) - -((vb) this).field_i.a(true);
        } else {
          return ((vb) this).field_k.a(true) - -((vb) this).field_i.a(true);
        }
    }

    final int a(byte param0) {
        if (param0 <= 74) {
          vb.d(93);
          return ((vb) this).field_c.a(true) + ((vb) this).field_l.a(true);
        } else {
          return ((vb) this).field_c.a(true) + ((vb) this).field_l.a(true);
        }
    }

    final db a(boolean param0, int param1, int param2, byte param3, int param4) {
        long var6 = 0L;
        db var8 = null;
        db stackIn_2_0 = null;
        db stackIn_3_0 = null;
        db stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        db stackIn_14_0 = null;
        db stackIn_15_0 = null;
        db stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        db stackOut_13_0 = null;
        db stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        db stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        db stackOut_1_0 = null;
        db stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        db stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param4 > 30) {
          L0: {
            var6 = ((long)param1 << 32) - -(long)param2;
            var8 = new db();
            stackOut_13_0 = (db) var8;
            stackIn_15_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (!param0) {
              stackOut_15_0 = (db) (Object) stackIn_15_0;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L0;
            } else {
              stackOut_14_0 = (db) (Object) stackIn_14_0;
              stackOut_14_1 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              break L0;
            }
          }
          stackIn_16_0.field_s = stackIn_16_1 != 0;
          var8.field_F = param3;
          var8.field_l = var6;
          if (param0) {
            if (-21 <= ((vb) this).a((byte) 114)) {
              throw new RuntimeException();
            } else {
              ((vb) this).field_c.a((w) (Object) var8, 3329);
              return var8;
            }
          } else {
            if (-21 < ((vb) this).c((byte) 99)) {
              ((vb) this).field_k.a((w) (Object) var8, 3329);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          L1: {
            field_r = -38;
            var6 = ((long)param1 << 32) - -(long)param2;
            var8 = new db();
            stackOut_1_0 = (db) var8;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (db) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (db) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_s = stackIn_4_1 != 0;
          var8.field_F = param3;
          var8.field_l = var6;
          if (param0) {
            if (-21 <= ((vb) this).a((byte) 114)) {
              throw new RuntimeException();
            } else {
              ((vb) this).field_c.a((w) (Object) var8, 3329);
              return var8;
            }
          } else {
            if (-21 < ((vb) this).c((byte) 99)) {
              ((vb) this).field_k.a((w) (Object) var8, 3329);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    public static void d(int param0) {
        field_m = null;
        field_e = null;
        field_a = null;
        if (param0 != 0) {
            field_n = -48;
        }
    }

    abstract void a(int param0);

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 100) {
          L0: {
            boolean discarded$10 = ((vb) this).b(41);
            if (-21 < ((vb) this).a((byte) 116)) {
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
            if (-21 > ((vb) this).a((byte) 116)) {
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

    final static String a(int param0, byte param1, int param2) {
        String var3 = null;
        String[] var4 = null;
        if (null == aa.field_h[param0][param2]) {
            var4 = new String[]{wj.field_d, Integer.toString(param2)};
            var3 = qa.a(122, (CharSequence[]) (Object) var4);
        } else {
            var3 = aa.field_h[param0][param2];
        }
        return var3;
    }

    abstract boolean b(int param0);

    vb() {
        ((vb) this).field_c = new ii();
        ((vb) this).field_l = new ii();
        ((vb) this).field_k = new ii();
        ((vb) this).field_i = new ii();
        ((vb) this).field_d = new uf(6);
        ((vb) this).field_f = (byte) 0;
        ((vb) this).field_h = 0;
        ((vb) this).field_b = 0;
        ((vb) this).field_o = new uf(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[25][2];
        field_n = 0;
        field_e = "Unpacking graphics";
        field_q = false;
    }
}
