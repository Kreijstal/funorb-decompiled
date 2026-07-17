/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uk extends IOException {
    static hj field_a;
    static String field_f;
    static e field_g;
    static uf field_b;
    static String field_d;
    static String[] field_c;
    static boolean field_e;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var4 = 0;
        hj var6 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            tc.a(243, 197, 369, 143, 16777215);
            tc.f(244, 198, 367, 141, 0);
            if (qk.field_y != null) {
              L1: {
                var6 = qk.field_y[va.field_e];
                if (var6 != null) {
                  var6.a(245, 199);
                  break L1;
                } else {
                  if (an.field_e != null) {
                    int discarded$2 = an.field_e.a(ug.field_f, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              L2: {
                if (null != an.field_e) {
                  int discarded$3 = an.field_e.a(ug.field_f, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "uk.A(" + 3979 + 41);
        }
    }

    final static void b(int param0) {
        ci.field_o = false;
        if (param0 >= -41) {
            field_g = null;
        }
        aa.field_k = false;
        go.a(0, -1);
        ak.field_b = gg.field_M;
        bb.field_a = gg.field_M;
    }

    uk(String param0) {
        super(param0);
    }

    public static void a(byte param0) {
        int var1 = 97;
        field_c = null;
        field_f = null;
        field_b = null;
        field_a = null;
        field_d = null;
        field_g = null;
    }

    final static kg a(String param0, boolean param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        kg stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        kg stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4_int = -104 % ((42 - param2) / 54);
            stackOut_0_0 = new kg(param0, true, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("uk.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + 1 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Minor thrust";
        field_d = "Fullscreen";
        field_g = new e(0, 2, 2, 1);
    }
}
