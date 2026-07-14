/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class en extends tj implements eg {
    private sb field_H;
    static tu field_E;
    static int field_F;
    static String field_G;

    abstract int a(byte param0);

    public static void n(int param0) {
        if (param0 != 0) {
            return;
        }
        field_G = null;
        field_E = null;
    }

    void a(byte param0, sb param1) {
        Object var4 = null;
        if (param0 >= -21) {
          var4 = null;
          int[] discarded$2 = en.a((vh) null, (byte) -110);
          ((en) this).field_H = param1;
          ((en) this).field_H.field_j = (en) this;
          return;
        } else {
          ((en) this).field_H = param1;
          ((en) this).field_H.field_j = (en) this;
          return;
        }
    }

    abstract int l(int param0);

    final static int[] a(vh param0, byte param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -24) {
          var5 = new int[param0.k(param1 ^ -24)];
          var2 = var5;
          var3 = 0;
          L0: while (true) {
            if (var5.length <= var3) {
              return var2;
            } else {
              var5[var3] = param0.k(0);
              var3++;
              continue L0;
            }
          }
        } else {
          en.n(-95);
          var5 = new int[param0.k(param1 ^ -24)];
          var2 = var5;
          var3 = 0;
          L1: while (true) {
            if (var5.length <= var3) {
              return var2;
            } else {
              var5[var3] = param0.k(0);
              var3++;
              continue L1;
            }
          }
        }
    }

    en(int param0, int param1, int param2, int param3, kh param4) {
        super(param0, param1, param2, param3, param4);
    }

    public final n a(int param0) {
        if (param0 != -918933630) {
            Object var3 = null;
            int[] discarded$0 = en.a((vh) null, (byte) 126);
            return (n) (Object) ((en) this).field_H;
        }
        return (n) (Object) ((en) this).field_H;
    }

    abstract int m(int param0);

    abstract boolean k(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Loading extra data";
    }
}
