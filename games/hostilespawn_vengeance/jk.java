/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jk {
    static Random field_b;
    static String field_a;
    static gb field_c;

    final static String a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          if (param0 != 104) {
            var7 = (CharSequence) null;
            jk.a((byte) 61, (CharSequence) null);
          }
          var9 = new char[var2_int];
          var8 = var9;
          var3 = var8;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(97 + (-65 + var5));
            } else if ((97 > var5 ||
              122 < var5) &&
              (48 > var5 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var9);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("jk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != -23322) {
          jk.b(-58);
          return sf.field_U;
        }
        return sf.field_U;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 > -43) {
          jk.b(66);
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        field_b = new Random();
        field_a = "Reach the bridge's main navigation console and set the station to crash into the planet.";
    }
}
