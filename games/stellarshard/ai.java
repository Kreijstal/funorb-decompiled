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
            String var2 = (String) null;
            ai.a((String) null, (String) null, (String) null, -14);
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_3_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
                      if (-1 >= (var9_int ^ -1)) {
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
                    discarded$0 = var9.append(param0.substring(var10, var11));
                    discarded$1 = var9.append(param2);
                    var10 = var11 + var5;
                    continue L3;
                  } else {
                    discarded$2 = var9.append(param0.substring(var10));
                    stackIn_17_0 = var9.toString();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                throw new IllegalArgumentException("Key cannot have zero length");
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("ai.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_17_0;
        }
    }

    final static void a(boolean param0, int param1, String param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jf.d(param1 ^ 0);
              na.field_d.e((byte) 16);
              af.field_r = new la(va.field_a, (String) null, gk.field_a, param3, param0);
              sf.field_f = new pg(na.field_d, af.field_r);
              na.field_d.a((byte) -128, (rj) (sf.field_f));
              if (param1 == -1) {
                break L1;
              } else {
                ai.a(100);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ai.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final gg a(long param0, int param1) {
        gg var4;
        gg var5;
        int var6;
        var6 = stellarshard.field_B;
        var4 = this.field_e[(int)((long)(param1 + this.field_b) & param0)];
        this.field_f = var4.field_g;
        L0: while (true) {
          if (this.field_f != var4) {
            if ((this.field_f.field_j ^ -1L) == (param0 ^ -1L)) {
              var5 = this.field_f;
              this.field_f = this.field_f.field_g;
              return var5;
            } else {
              this.field_f = this.field_f.field_g;
              continue L0;
            }
          } else {
            this.field_f = null;
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
            var5 = this.field_e[(int)((long)(this.field_b + -1) & param2)];
            param1.field_g = var5;
            if (param0 <= 1) {
                ai.a((byte) 37);
            }
            param1.field_c = var5.field_c;
            param1.field_c.field_g = param1;
            param1.field_g.field_c = param1;
            param1.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ai.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ga((ai) (this)));
    }

    private ai() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_a = null;
        if (param0 != -1) {
            field_c = -21;
        }
    }

    static {
        field_c = 100;
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
