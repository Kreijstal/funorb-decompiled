/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ihb extends ksa {
    int field_d;
    int field_e;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static int a(int[] param0, int param1, int[] param2) {
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var12Lifetime3;
        int var12Lifetime1Lifetime1;
        int var12Lifetime2Lifetime1;
        var17 = VoidHunters.field_G;
        try {
          var3_int = param0[0];
          var4 = var3_int;
          var5 = param2[0];
          var6 = var5;
          var7 = param0[1];
          var8 = var7;
          var9 = param2[1];
          var10 = var9;
          var11 = 2;
          while (param0.length > var11) {
            var12 = param0[var11++];
            if (var12 >= var3_int) {
              if (var4 < var12) {
                var4 = var12;
              }
            } else {
              var3_int = var12;
            }
            var12Lifetime3 = param0[var11++];
            if (var12Lifetime3 < var7) {
              var7 = var12Lifetime3;
              continue;
            }
            if (var12Lifetime3 <= var8) {
              continue;
            }
            var8 = var12Lifetime3;
          }
          if (param1 != -5115) {
            stackIn_16_0 = 61;
            return stackIn_16_0;
          }
          var11Lifetime1 = 2;
          while (param2.length > var11Lifetime1) {
            var12Lifetime1 = param2[var11Lifetime1];
            stackIn_22_0 = var5;
            stackIn_22_1 = var12Lifetime1;
            if (stackIn_22_0 <= stackIn_22_1) {
              if (var12Lifetime1 > var6) {
                var6 = var12Lifetime1;
              }
            } else {
              var5 = var12Lifetime1;
            }
            var11Lifetime1++;
            var12Lifetime1Lifetime1 = param2[var11Lifetime1];
            var11Lifetime1++;
            if (var9 > var12Lifetime1Lifetime1) {
              var9 = var12Lifetime1Lifetime1;
              continue;
            }
            if (var10 >= var12Lifetime1Lifetime1) {
              continue;
            }
            var10 = var12Lifetime1Lifetime1;
          }
          if (var3_int <= var6 && (var4 >= var5 &&
            var7 <= var10 &&
            var9 <= var8)) {
            var11Lifetime2 = Math.max(0, -14 + vma.a(125, Math.max(Math.max(var4, var6) - Math.min(var3_int, var5), Math.max(var8, var10) - Math.min(var7, var9))));
            var12Lifetime2 = 2147483647;
            var14 = -var6 + var3_int;
            var15 = var4 - var5;
            if (Math.abs(var14) < Math.abs(var15)) {
              var13 = var14;
            } else {
              var13 = var15;
            }
            var15Lifetime1 = var7 - var10;
            var16 = var8 - var9;
            var14Lifetime1 = (Math.abs(var15Lifetime1) >= Math.abs(var16)) ? var16 : var15Lifetime1;
            var12Lifetime2Lifetime1 = (Math.abs(var13) >= Math.abs(var14Lifetime1)) ? var14Lifetime1 : var13;
            var13Lifetime1 = Math.min(var3_int, var5);
            var14Lifetime2 = Math.min(var7, var9);
            var15Lifetime2 = fva.a(var12Lifetime2Lifetime1, var13Lifetime1, param2, var14Lifetime2, param0, var11Lifetime2, -1);
            if (var15Lifetime2 == 2147483647) {
              stackIn_49_0 = -1;
              return stackIn_49_0;
            }
            var16Lifetime1 = fva.a(var15Lifetime2, var13Lifetime1, param0, var14Lifetime2, param2, var11Lifetime2, -1);
            if (Math.abs(var16Lifetime1) < Math.min(Math.abs(var15Lifetime2), Math.abs(var12Lifetime2Lifetime1))) {
            }
            if (var16Lifetime1 != 2147483647) {
              stackIn_54_0 = Math.abs(var16Lifetime1);
            } else {
              stackIn_54_0 = -1;
            }
            return stackIn_54_0;
          }
          stackIn_36_0 = -1;
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_57_0 = var3;
          stackIn_57_1 = new StringBuilder().append("ihb.B(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(')').toString());
        }
    }

    ihb(int param0, int param1) {
        this.field_e = param1;
        this.field_d = param0;
    }

    final static byte[] a(byte param0, int param1) {
        pab var2;
        byte[] var3_ref_byte__;
        int var3;
        Random var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        byte[] var10;
        byte[] var11;
        int var5Lifetime1;
        var9 = VoidHunters.field_G;
        var2 = (pab) (cs.field_c.a((long)param1, 72));
        if (var2 == null) {
          var11 = new byte[512];
          var10 = var11;
          var3_ref_byte__ = var10;
          var4 = new Random((long)param1);
          for (var5 = 0; var5 < 255; var5++) {
            var3_ref_byte__[var5] = (byte)var5;
          }
          for (var5Lifetime1 = 0; 255 > var5Lifetime1; var5Lifetime1++) {
            var6 = -var5Lifetime1 + 255;
            var7 = hob.a(var4, var6, 124);
            var8 = var11[var7];
            var3_ref_byte__[var7] = var11[var6];
            var3_ref_byte__[511 - var5Lifetime1] = (byte) var8;
            var3_ref_byte__[var6] = (byte) var8;
          }
          var2 = new pab(var11);
          cs.field_c.a((long)param1, (byte) -48, var2);
        }
        var3 = -56 / ((-24 - param0) / 45);
        return var2.field_l;
    }

    static {
    }
}
