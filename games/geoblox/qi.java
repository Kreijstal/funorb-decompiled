/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qi extends hf {
    int[] field_g;
    static gk field_h;
    boolean field_f;
    static int[] field_i;
    int field_j;

    public static void c(int param0) {
        field_h = null;
        if (param0 != 59) {
            return;
        }
        field_i = null;
    }

    final static boolean b(int param0) {
        int var1 = -46 % ((param0 - -28) / 60);
        return gb.field_b.b((byte) 126);
    }

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        if (param0 <= 76) {
          field_h = (gk) null;
        }
        L1: {
          if ((ra.field_d ^ -1) < -1) {
            if ((65536 & ra.field_d) != 0) {
              stackIn_6_0 = 1;
              break L1;
            }
          }
          stackIn_6_0 = 0;
        }
        return stackIn_6_0 != 0;
    }

    qi() {
        this.field_f = false;
    }

    final static String a(String param0, java.applet.Applet param1, int param2) {
        try {
            int var6 = 0;
            int var3_int = 0;
            String var4 = null;
            String[] var5 = null;
            int var7 = 0;
            int var8 = 0;
            String stackIn_7_0 = null;
            Object stackIn_12_0 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var3 = null;
            Throwable var4_ref = null;
            var8 = Geoblox.field_C;
            try {
              var3_int = -105 / ((param2 - -33) / 57);
              try {
                L1: {
                  var4 = (String) (wk.a((byte) -6, param1, "getcookies"));
                  var5 = uj.a(';', true, var4);
                  for (var6 = 0; var6 < var5.length; var6++) {
                    var7 = var5[var6].indexOf('=');
                    if ((var7 ^ -1) <= -1) {
                      if (var5[var6].substring(0, var7).trim().equals(param0)) {
                        stackIn_7_0 = var5[var6].substring(1 + var7).trim();
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                decompiledRegionSelector0 = 0;
              }
              if (decompiledRegionSelector0 == 0) {
                stackIn_12_0 = null;
                decompiledRegionSelector1 = 0;
              } else {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_15_0 = (RuntimeException) (var3);

              stackIn_15_1 = new StringBuilder().append("qi.B(");

              if (param0 == null) {
                stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                stackIn_16_2 = "null";
              } else {
                stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                stackIn_16_2 = "{...}";
              }


              stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

              if (param1 == null) {
                stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                stackIn_19_2 = "null";
              } else {
                stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                stackIn_19_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_12_0);
            } else {
              return stackIn_7_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(int param0, int param1) {
        if (param1 != 1) {
            return 99;
        }
        return sc.a((byte) -75, gk.field_d, param0);
    }

    static {
        field_h = new gk();
    }
}
