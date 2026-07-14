/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    private String field_c;
    private boolean field_b;
    static int field_a;
    static boolean field_d;

    gb(String param0, boolean param1) {
        ((gb) this).field_c = param0;
        if (null == ((gb) this).field_c) {
            ((gb) this).field_c = "";
        }
        ((gb) this).field_b = param1 ? true : false;
        if (((gb) this).field_c.length() == 0) {
            ((gb) this).field_b = false;
        }
    }

    final static aj a(int param0, int param1) {
        aj[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        aj[] var5 = null;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          var5 = ah.a((byte) -55);
          var2 = var5;
          if (param1 == 2121865922) {
            break L0;
          } else {
            aj discarded$2 = gb.a(71, -115);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_a == param0) {
              return var5[var3];
            } else {
              var3++;
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static we[] a(byte param0, ab param1) {
        int var5 = 0;
        we var6 = null;
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (param0 >= -66) {
            Object var8 = null;
            we[] discarded$0 = gb.a((byte) 108, (ab) null);
        }
        if (!(param1.b(0))) {
            return new we[]{};
        }
        ei var9 = param1.a((byte) 127);
        while (var9.field_b == 0) {
            ge.a(0, 10L);
        }
        if (!(2 != var9.field_b)) {
            return new we[]{};
        }
        int[] var13 = (int[]) var9.field_g;
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var3 = var10;
        we[] var4 = new we[var13.length >> -1296970974];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new we();
            var4[var5] = var6;
            var6.field_a = var3[var5 << 2121865922];
            var6.field_e = var3[1 + (var5 << 794115490)];
            var6.field_f = var3[(var5 << -1933966654) + 2];
            var6.field_k = var3[(var5 << 1213143170) + 3];
        }
        return var4;
    }

    gb(String param0) {
        this(param0, false);
    }

    final boolean a(int param0) {
        if (param0 != 15738) {
            field_a = -125;
        }
        return ((gb) this).field_b;
    }

    final String b(int param0) {
        if (param0 != 25545) {
            return null;
        }
        return ((gb) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}
