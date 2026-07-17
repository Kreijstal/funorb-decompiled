/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vk extends ve {
    static aj field_B;
    static int field_u;
    wk field_A;
    byte field_y;
    static ll[] field_w;
    int field_x;
    static String field_v;
    static String field_z;

    final static void c(boolean param0) {
        sb.field_a = false;
    }

    final int e(byte param0) {
        if (!(((vk) this).field_A != null)) {
            return 0;
        }
        if (param0 >= -71) {
            field_u = -34;
        }
        return ((vk) this).field_A.field_g * 100 / (-((vk) this).field_y + ((vk) this).field_A.field_j.length);
    }

    final byte[] c(int param0) {
        L0: {
          if (param0 < -11) {
            break L0;
          } else {
            field_z = null;
            break L0;
          }
        }
        L1: {
          if (((vk) this).field_p) {
            break L1;
          } else {
            if (((vk) this).field_A.field_g >= -((vk) this).field_y + ((vk) this).field_A.field_j.length) {
              return ((vk) this).field_A.field_j;
            } else {
              break L1;
            }
          }
        }
        throw new RuntimeException();
    }

    public static void f(byte param0) {
        field_v = null;
        field_z = null;
        field_B = null;
        field_w = null;
    }

    vk() {
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3 = ba.a(param0, param1, true);
          if (var3 == null) {
            var4 = 0;
            var5 = 0;
            L0: while (true) {
              if (var5 < param1.length()) {
                if (pm.a(param1.charAt(var5), 45)) {
                  var5++;
                  continue L0;
                } else {
                  stackOut_8_0 = mb.field_N;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = (String) var3;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("vk.G(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -123 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0;
        field_B = new aj(1, 2, 2, 0);
        field_v = "Message game";
        field_z = "Remove friend";
    }
}
