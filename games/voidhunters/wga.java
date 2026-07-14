/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wga implements dja {
    static lwa field_a;

    final static void a(boolean param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = VoidHunters.field_G;
        if (!param0) {
          field_a = null;
          L0: while (true) {
            param3--;
            if (-1 >= (param3 ^ -1)) {
              var11 = param4;
              var9 = var11;
              var5 = var9;
              var6 = param1;
              var7 = param2;
              var9[var6] = dla.a(8355711, var11[var6] >> -233471167) + var7;
              param1++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param3--;
            if (-1 >= (param3 ^ -1)) {
              var10 = param4;
              var9 = var10;
              var5 = var9;
              var6 = param1;
              var7 = param2;
              var9[var6] = dla.a(8355711, var10[var6] >> -233471167) + var7;
              param1++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = null;
            return (tv[]) (Object) new wna[param1];
        }
        return (tv[]) (Object) new wna[param1];
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 == -1) {
            return;
        }
        field_a = null;
    }

    public final tv a(byte param0) {
        int var2 = 127 % ((-64 - param0) / 50);
        return (tv) (Object) new wna();
    }

    static {
    }
}
