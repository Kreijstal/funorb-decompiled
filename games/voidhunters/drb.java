/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class drb extends le {
    static int field_j;
    static String field_k;
    private int field_i;

    public static void e(byte param0) {
        field_k = null;
        if (param0 > -80) {
            field_k = null;
        }
    }

    final static kob a(boolean param0, int param1) {
        kob var2 = null;
        var2 = new kob();
        if (!param0) {
          return null;
        } else {
          cnb.field_q.b(-10258, (ksa) (Object) var2);
          wva.b(param1, 22681);
          return var2;
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param1) {
          var4 = ((drb) this).field_f.a((byte) 117, param0);
          var3 = var4;
          if (((drb) this).field_f.field_e) {
            cua.a(var4, 0, hob.field_d, ((drb) this).field_i);
            return var4;
          } else {
            return var4;
          }
        } else {
          return null;
        }
    }

    private drb(int param0) {
        super(0, true);
        ((drb) this).field_i = 4096;
        ((drb) this).field_i = param0;
    }

    public drb() {
        this(4096);
    }

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        if (param1 > -60) {
          L0: {
            drb.e((byte) 48);
            var4 = param0;
            if (0 == var4) {
              ((drb) this).field_i = (param2.e((byte) -115) << 1442942252) / 255;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var4 = param0;
            if (0 == var4) {
              ((drb) this).field_i = (param2.e((byte) -115) << 1442942252) / 255;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_k = "Loading graphics";
    }
}
