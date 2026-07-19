/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nd implements Iterator {
    private bf field_h;
    static le field_b;
    private ni field_c;
    private bf field_f;
    static boolean field_a;
    static String[] field_g;
    static int[] field_d;
    static int field_e;

    public final void remove() {
        if (!(this.field_h != null)) {
            throw new IllegalStateException();
        }
        this.field_h.a(7847);
        this.field_h = null;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 127) {
            field_b = (le) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    public final Object next() {
        bf var1 = this.field_f;
        if (var1 == this.field_c.field_b) {
            var1 = null;
            this.field_f = null;
        } else {
            this.field_f = var1.field_g;
        }
        this.field_h = var1;
        return var1;
    }

    public final boolean hasNext() {
        return this.field_c.field_b != this.field_f;
    }

    final static String a(byte param0) {
        if (!ac.field_b) {
          if (cj.field_e <= ka.field_a) {
            if (id.field_a + cj.field_e <= ka.field_a) {
              if (param0 <= -125) {
                return null;
              } else {
                return (String) null;
              }
            } else {
              return pf.field_b;
            }
          } else {
            if (param0 <= -125) {
              return null;
            } else {
              return (String) null;
            }
          }
        } else {
          if (param0 <= -125) {
            return null;
          } else {
            return (String) null;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == -23487) {
                break L1;
              } else {
                field_b = (le) null;
                break L1;
              }
            }
            L2: while (true) {
              param1--;
              if (-1 < (param1 ^ -1)) {
                break L0;
              } else {
                var17 = param3;
                var10_array = var17;
                var11 = param0;
                var12 = param9;
                var13 = param8;
                var14 = param6;
                var15 = var17[var11] >> -443497791 & 8355711;
                var10_array[var11] = ch.a(var14 >> -1821127087, 255) - -ch.a(var13 >> 854824393, 65280) - -ch.a(16711680, var12 >> 1641302977) + var15;
                param9 = param9 + param4;
                param0++;
                param6 = param6 + param2;
                param8 = param8 + param7;
                if (var16 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var10);
            stackOut_9_1 = new StringBuilder().append("nd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    nd(ni param0) {
        this.field_h = null;
        try {
            this.field_c = param0;
            this.field_h = null;
            this.field_f = this.field_c.field_b.field_g;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new le(36, 36);
        field_d = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
