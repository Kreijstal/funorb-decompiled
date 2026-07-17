/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ai implements Iterable {
    static nj[] field_d;
    static String field_g;
    private gg field_f;
    int field_b;
    static String[] field_a;
    gg[] field_e;
    static int field_c;

    final static void a(byte param0) {
        bk.a(12, kc.field_c, true, sb.field_a);
        ak.field_a = true;
        if (param0 <= 62) {
            Object var2 = null;
            String discarded$0 = ai.a((String) null, (String) null, (String) null, -14);
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_3_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var12 = stellarshard.field_B;
        try {
          L0: {
            var4_int = param0.length();
            if (param3 <= -41) {
              var5 = param1.length();
              var6 = param2.length();
              if (0 != var5) {
                L1: {
                  var7 = var4_int;
                  var8 = var6 + -var5;
                  if (var8 != 0) {
                    var9_int = 0;
                    L2: while (true) {
                      var9_int = param0.indexOf(param1, var9_int);
                      if (var9_int >= 0) {
                        var7 = var7 + var8;
                        var9_int = var9_int + var5;
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                var9 = new StringBuilder(var7);
                var10 = 0;
                L3: while (true) {
                  var11 = param0.indexOf(param1, var10);
                  if (0 <= var11) {
                    StringBuilder discarded$3 = var9.append(param0.substring(var10, var11));
                    StringBuilder discarded$4 = var9.append(param2);
                    var10 = var11 + var5;
                    continue L3;
                  } else {
                    StringBuilder discarded$5 = var9.append(param0.substring(var10));
                    stackOut_16_0 = var9.toString();
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  }
                }
              } else {
                throw new IllegalArgumentException("Key cannot have zero length");
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("ai.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          L6: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 41);
        }
        return stackIn_17_0;
    }

    final static void a(boolean param0, int param1, String param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          int discarded$2 = -1;
          jf.d();
          na.field_d.e((byte) 16);
          af.field_r = new la(va.field_a, (String) null, gk.field_a, param3, param0);
          sf.field_f = new pg(na.field_d, (rj) (Object) af.field_r);
          na.field_d.a((byte) -128, (rj) (Object) sf.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("ai.D(").append(param0).append(44).append(-1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param3 + 41);
        }
    }

    final gg a(long param0, int param1) {
        gg var4 = null;
        gg var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        var4 = ((ai) this).field_e[(int)((long)(param1 + ((ai) this).field_b) & param0)];
        ((ai) this).field_f = var4.field_g;
        L0: while (true) {
          if (((ai) this).field_f != var4) {
            if (~((ai) this).field_f.field_j == ~param0) {
              var5 = ((ai) this).field_f;
              ((ai) this).field_f = ((ai) this).field_f.field_g;
              return var5;
            } else {
              ((ai) this).field_f = ((ai) this).field_f.field_g;
              continue L0;
            }
          } else {
            ((ai) this).field_f = null;
            return null;
          }
        }
    }

    final void a(byte param0, gg param1, long param2) {
        gg var5 = null;
        try {
            if (!(null == param1.field_c)) {
                param1.c(20);
            }
            var5 = ((ai) this).field_e[(int)((long)(((ai) this).field_b + -1) & param2)];
            param1.field_g = var5;
            if (param0 <= 1) {
                ai.a((byte) 37);
            }
            param1.field_c = var5.field_c;
            param1.field_c.field_g = param1;
            param1.field_g.field_c = param1;
            param1.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ai.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ga((ai) this);
    }

    private ai() throws Throwable {
        throw new Error();
    }

    public static void a() {
        field_d = null;
        field_g = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 100;
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
