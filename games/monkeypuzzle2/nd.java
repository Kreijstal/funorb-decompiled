/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

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
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((nd) this).field_h == null) {
              throw new IllegalStateException();
            } else {
              ((nd) this).field_h.a(7847);
              ((nd) this).field_h = null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "nd.remove()");
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_d = null;
              field_b = null;
              if (param0 == 127) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "nd.C(" + param0 + ')');
        }
    }

    public final Object next() {
        Object var1 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var1 = (Object) (Object) ((nd) this).field_f;
              if (var1 != (Object) (Object) ((nd) this).field_c.field_b) {
                ((nd) this).field_f = ((bf) var1).field_g;
                break L1;
              } else {
                var1 = null;
                ((nd) this).field_f = null;
                break L1;
              }
            }
            ((nd) this).field_h = (bf) var1;
            stackOut_3_0 = var1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw la.a((Throwable) var1, "nd.next()");
        }
        return stackIn_4_0;
    }

    public final boolean hasNext() {
        return ((nd) this).field_c.field_b != ((nd) this).field_f;
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_10_0 = null;
        try {
          L0: {
            L1: {
              if (ac.field_b) {
                break L1;
              } else {
                if (~cj.field_e < ~ka.field_a) {
                  break L1;
                } else {
                  if (~(id.field_a + cj.field_e) >= ~ka.field_a) {
                    break L1;
                  } else {
                    stackOut_7_0 = pf.field_b;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
            }
            if (param0 <= -125) {
              stackOut_12_0 = null;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_10_0 = null;
              stackIn_11_0 = stackOut_10_0;
              return (String) (Object) stackIn_11_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "nd.A(" + param0 + ')');
        }
        return (String) (Object) stackIn_13_0;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == -23487) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  param1--;
                  if (param1 < 0) {
                    break L4;
                  } else {
                    var10_array = param3;
                    var11 = param0;
                    var12 = param9;
                    var13 = param8;
                    var14 = param6;
                    var15 = var10_array[var11] >> -443497791 & 8355711;
                    var10_array[var11] = ch.a(var14 >> -1821127087, 255) - -ch.a(var13 >> 854824393, 65280) - -ch.a(16711680, var12 >> 1641302977) + var15;
                    param9 = param9 + param4;
                    param0++;
                    param6 = param6 + param2;
                    param8 = param8 + param7;
                    if (var16 != 0) {
                      break L3;
                    } else {
                      if (var16 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("nd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    nd(ni param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((nd) this).field_h = null;
        try {
          L0: {
            ((nd) this).field_c = param0;
            ((nd) this).field_h = null;
            ((nd) this).field_f = ((nd) this).field_c.field_b.field_g;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nd.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new le(36, 36);
        field_d = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
