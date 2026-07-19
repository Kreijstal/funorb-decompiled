/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static rf field_c;
    static String field_b;
    static String[] field_d;
    static ed[] field_a;

    final static boolean a(int param0, int param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        try {
          L0: {
            var5 = jb.field_z;
            var2 = var5;
            var3 = param1;
            L1: while (true) {
              if (var5.length <= var3) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = var5[var3];
                if (param0 != var4) {
                  var3++;
                  continue L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "ug.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        boolean discarded$0 = false;
        int var12 = EscapeVector.field_A;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (16744599 & param2) >> -920790704;
        int var5 = (param2 & 65434) >> -1126578840;
        int var6 = 255 & param2;
        int var7 = (param1 & 16746391) >> 1746055568;
        int var8 = param1 >> 1449025896 & 255;
        int var9 = 255 & param1;
        for (var10 = 0; (var10 ^ -1) > -257; var10++) {
            var11 = 256 - var10;
            var13[var10] = (var6 * var10 >> 2051183240) - (-(var9 * var11 >> -192068856) - ((var4 * var10 >> 603810248) + (var7 * var11 >> 105333576) << 830889200) - ((var5 * var10 >> -216536152) - -(var11 * var8 >> 585960904) << 1715938088));
        }
        if (param0 != 1746055568) {
            discarded$0 = ug.a(-56, -75);
        }
        return var3;
    }

    static {
        field_b = " - rotate ship left";
        field_d = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_c = new rf();
        field_a = new ed[5];
    }
}
