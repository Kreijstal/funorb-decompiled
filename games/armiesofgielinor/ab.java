/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ab {
    static int field_a;
    static int[] field_c;
    static java.util.zip.CRC32 field_b;
    static me field_d;
    static String field_e;

    public static void a(byte param0) {
        if (param0 != 32) {
          field_d = (me) null;
        }
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var2_int = param1; var2_int < param0.length(); var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!ni.a((byte) -105, (char) var3) &&
              !mu.a(28799, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ab.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var7 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        RgbSprite var10 = null;
        RgbSprite var11 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param1 = param1 | param1 << 8;
          var4_int = param1 >> 1 ^ param1;
          for (var7 = 0; 4 > var7; var7++) {
            var6 = -64 + (bm.field_y[var7][1] + param0 + (param1 & 3));
            var5 = -44 + ((var4_int & 7) + bm.field_y[var7][0] + param2);
            if (0 == var7) {
              var10 = tn.field_eb[16 + param1 % 9];
              fe.a(var10, var5, -bm.field_y[var7][1] + var6);
            } else {
              var11 = tn.field_eb[25 + param1 % 9];
              fe.a(var11, var5, var6);
            }
            param1 = param1 >> 1;
            var4_int = var4_int >> 1;
          }
          if (param3) {
            ab.a((byte) 89);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "ab.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = -1;
        field_c = new int[16384];
        field_b = new java.util.zip.CRC32();
        field_e = "This option cannot be combined with the current '<%0>' setting.";
        field_d = new me(8, 0, 4, 1);
    }
}
