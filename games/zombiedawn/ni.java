/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ni {
    static fh field_c;
    static Calendar field_d;
    static boolean field_a;
    static vn[] field_b;

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_23_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ZombieDawn.field_J;
        try {
          if (param0 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param0 == 1) {
            var10 = param3[param1];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param0 + param1;
          var5 = 0;
          for (var6_int = param1; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param3[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param1; var4_int > var7; var7++) {
            var8 = param3[var7];
            if (var8 != null) {
              discarded$3 = var6.append(var8);
            } else {
              discarded$4 = var6.append("null");
            }
          }
          if (param2 > 25) {
            stackIn_25_0 = var6.toString();
            return stackIn_25_0;
          }
          stackIn_23_0 = (String) null;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("ni.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          field_b = (vn[]) null;
        }
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0) {
        dj.field_l = new vo();
        if (param0 != -78) {
          CharSequence[] var2 = (CharSequence[]) null;
          ni.a(40, 57, -80, (CharSequence[]) null);
        }
    }

    static {
        field_d = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
