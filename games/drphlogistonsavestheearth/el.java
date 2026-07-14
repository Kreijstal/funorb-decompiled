/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends jf {
    static he[] field_vb;
    static he field_ub;
    static id field_sb;
    static long field_rb;
    static int field_tb;

    final void a(int param0, vg param1) {
        if (param0 != 33) {
          field_tb = -12;
          super.a(param0 ^ 0, param1);
          return;
        } else {
          super.a(param0 ^ 0, param1);
          return;
        }
    }

    el(k param0, vg param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        kc var4 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = (kc) (Object) rd.field_C.h(-11151);
        if (!param0) {
          L0: while (true) {
            if (var4 != null) {
              rh.a(125, var4, param1);
              var4 = (kc) (Object) rd.field_C.e(0);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static hj a(String param0, int param1, byte param2) {
        ka var3 = null;
        var3 = new ka();
        ((hj) (Object) var3).field_b = param0;
        if (param2 <= 20) {
          el.a(true, 81);
          ((hj) (Object) var3).field_d = param1;
          return (hj) (Object) var3;
        } else {
          ((hj) (Object) var3).field_d = param1;
          return (hj) (Object) var3;
        }
    }

    public static void n(int param0) {
        field_sb = null;
        field_vb = null;
        if (param0 != 20) {
            return;
        }
        field_ub = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_tb = 0;
    }
}
