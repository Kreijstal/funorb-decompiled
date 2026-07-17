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
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          if (param0 != 0) {
            if (param0 != 1) {
              var4_int = param0;
              var5 = 0;
              var6_int = 0;
              L0: while (true) {
                if (var6_int >= var4_int) {
                  var6 = new StringBuilder(var5);
                  var7 = 0;
                  L1: while (true) {
                    if (var4_int <= var7) {
                      return var6.toString();
                    } else {
                      L2: {
                        var8 = param3[var7];
                        if (var8 != null) {
                          StringBuilder discarded$5 = var6.append(var8);
                          break L2;
                        } else {
                          StringBuilder discarded$6 = var6.append("null");
                          break L2;
                        }
                      }
                      var7++;
                      continue L1;
                    }
                  }
                } else {
                  L3: {
                    var7_ref_CharSequence = param3[var6_int];
                    if (var7_ref_CharSequence != null) {
                      var5 = var5 + var7_ref_CharSequence.length();
                      break L3;
                    } else {
                      var5 += 4;
                      break L3;
                    }
                  }
                  var6_int++;
                  continue L0;
                }
              }
            } else {
              var10 = param3[0];
              var4 = var10;
              if (var4 == null) {
                stackOut_7_0 = "null";
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                return ((Object) (Object) var10).toString();
              }
            }
          } else {
            stackOut_2_0 = "";
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4_ref;
            stackOut_23_1 = new StringBuilder().append("ni.C(").append(param0).append(44).append(0).append(44).append(127).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static void a() {
        dj.field_l = new vo();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
