/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vn extends vo {
    static String field_g;
    static lt field_f;
    static String field_e;

    final pt a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        pt stackIn_3_0 = null;
        pt stackIn_10_0 = null;
        pt stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            if (!vl.a(param1 ^ 8202, var5)) {
              stackIn_3_0 = bt.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 8192) {
                  break L1;
                } else {
                  var4 = (String) null;
                  vn.a(63, (File) null, (String) null);
                  break L1;
                }
              }
              L2: {
                var6 = (CharSequence) ((Object) param0);
                var3_int = td.a(var6, (byte) 38);
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if (-131 <= (var3_int ^ -1)) {
                    stackIn_12_0 = fd.field_a;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_10_0 = bt.field_a;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("vn.DA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    vn(bm param0) {
        super(param0);
    }

    public static void c(byte param0) {
        field_g = null;
        field_e = null;
        field_f = null;
        if (param0 != 101) {
            String var2 = (String) null;
            vn.a(55, (File) null, (String) null);
        }
    }

    final static void a(int param0, File param1, String param2) {
        if (param0 != 0) {
            return;
        }
        try {
            vg.field_j.put(param2, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "vn.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 72) {
                break L1;
              } else {
                var4 = (String) null;
                vn.a(53, (File) null, (String) null);
                break L1;
              }
            }
            if (this.a(param0, 8192) == bt.field_a) {
              stackIn_5_0 = dg.field_L;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vn.EA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    static {
        field_e = "Your email address is used to identify this account";
        field_g = "Change display name";
    }
}
