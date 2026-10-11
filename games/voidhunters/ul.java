/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static llb[] field_b;
    static int field_a;

    final static phb[] a(int param0, int param1, int param2, int param3, boolean param4) {
        phb[] var6 = new phb[9];
        phb[] var5 = var6;
        phb dupTemp$0 = mra.a(param0, (byte) -119, param2);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        phb dupTemp$1 = mra.a(param3, (byte) -125, param2);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!param4) {
          field_b = (llb[]) null;
        }
        if (param1 != 0) {
          var6[4] = mra.a(param1, (byte) -116, 64);
        }
        return var5;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var18 = null;
        int var12Lifetime1;
        int var12Lifetime2;
        var14 = VoidHunters.field_G;
        try {
          var9 = param3 - param7;
          var8_int = param7 + param0;
          if (param6 != 7) {
            return;
          }
          for (var12 = param0; var12 < var8_int; var12++) {
            ww.a(param4, param5, rba.field_b[var12], (byte) 75, param1);
          }
          for (var12Lifetime1 = param3; var9 < var12Lifetime1; var12Lifetime1--) {
            ww.a(param4, param5, rba.field_b[var12Lifetime1], (byte) 75, param1);
          }
          var11 = -param7 + param5;
          var10 = param7 + param1;
          for (var12Lifetime2 = var8_int; var9 >= var12Lifetime2; var12Lifetime2++) {
            var18 = rba.field_b[var12Lifetime2];
            ww.a(param4, var10, var18, (byte) 75, param1);
            ww.a(param2, var11, var18, (byte) 75, var10);
            ww.a(param4, param5, var18, (byte) 75, var11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var8), "ul.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -23460) {
          field_b = (llb[]) null;
        }
    }

    static {
        field_a = 0;
    }
}
