/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends ek {
    static int field_M;
    static int field_N;
    static String[] field_K;
    static String field_L;

    dl(String param0, kg param1, boolean param2) {
        this(param0, param1);
        ((dl) this).field_H = param2 ? true : false;
    }

    private dl(String param0, kg param1) {
        this(param0, bf.field_x.field_b, param1);
        ((dl) this).field_p = bf.field_x.field_a;
    }

    final static void a(byte param0, boolean param1, ck param2, int param3, int param4) {
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        if (param2 != tc.field_Tb) {
          if (param2 != null) {
            L0: {
              param2.e(0, param3, param4);
              if (param1) {
                fj.a(0, param4, -26, param3);
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 < 40) {
              field_L = null;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              hk.a(0, 0, 640, 480, 0);
              if (param1) {
                fj.a(0, param4, -26, param3);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 >= 40) {
              return;
            } else {
              field_L = null;
              return;
            }
          }
        } else {
          L2: {
            lj.a(param4, param3, 0, true);
            if (param1) {
              fj.a(0, param4, -26, param3);
              break L2;
            } else {
              break L2;
            }
          }
          if (param0 >= 40) {
            return;
          } else {
            field_L = null;
            return;
          }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_K = null;
        field_L = null;
    }

    final static void b(int param0, int param1) {
        cl var2 = null;
        int var3 = 0;
        Object var4 = null;
        cl var5 = null;
        var3 = client.field_A ? 1 : 0;
        var5 = (cl) (Object) oe.field_I.c((byte) 113);
        var2 = (cl) (Object) oe.field_I.c((byte) 113);
        L0: while (true) {
          if (var5 == null) {
            if (param0 != 640) {
              var4 = null;
              dl.a((byte) 62, true, (ck) null, -96, 15);
              return;
            } else {
              return;
            }
          } else {
            fh.a((byte) 104, var5, param1);
            var2 = (cl) (Object) oe.field_I.d(true);
            continue L0;
          }
        }
    }

    private dl(String param0, gl param1, kg param2) {
        super(param0, param1, param2);
        ((dl) this).field_p = bf.field_x.field_a;
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((dl) this).field_H = !((dl) this).field_H ? true : false;
        super.b(param0, param1, param2, param3);
    }

    final static boolean a(int param0) {
        if (param0 != 480) {
            return true;
        }
        return 250 < gd.field_e ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = 20;
        field_L = "Stage <%0>";
        field_N = -1;
    }
}
