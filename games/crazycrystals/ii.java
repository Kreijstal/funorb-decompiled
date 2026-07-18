/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ii implements Iterator {
    private int field_d;
    private ug field_c;
    private jb field_b;
    static String field_e;
    private jb field_a;

    public final void remove() {
        if (!(null != ((ii) this).field_a)) {
            throw new IllegalStateException();
        }
        ((ii) this).field_a.a(false);
        ((ii) this).field_a = null;
    }

    private final void a() {
        ((ii) this).field_a = null;
        ((ii) this).field_b = ((ii) this).field_c.field_c[0].field_b;
        ((ii) this).field_d = 1;
    }

    public static void a(int param0) {
        if (param0 > -53) {
            return;
        }
        field_e = null;
    }

    final static void a(int[] param0, fq param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 48 * param1.field_m / param1.field_p;
              var4 = param1.field_o * var3_int + 48 * param1.field_A + 24;
              if (vh.field_a) {
                var4 = tm.field_d[0].length * 24;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = 24 + param1.field_t * 48 - -(var3_int * param1.field_s);
              if (var4 >= param0[0]) {
                break L2;
              } else {
                param0[0] = var4;
                break L2;
              }
            }
            if (param2 >= 116) {
              L3: {
                if (var5 >= param0[2]) {
                  break L3;
                } else {
                  param0[2] = var5;
                  break L3;
                }
              }
              L4: {
                if (param0[1] >= var4) {
                  break L4;
                } else {
                  param0[1] = var4;
                  break L4;
                }
              }
              if (param0[3] < var5) {
                param0[3] = var5;
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("ii.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
    }

    ii(ug param0) {
        ((ii) this).field_a = null;
        try {
            ((ii) this).field_c = param0;
            int discarded$0 = -112;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ii.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        if (((ii) this).field_b == ((ii) this).field_c.field_c[((ii) this).field_d + -1]) {
          L0: while (true) {
            if (((ii) this).field_d < ((ii) this).field_c.field_e) {
              int fieldTemp$1 = ((ii) this).field_d;
              ((ii) this).field_d = ((ii) this).field_d + 1;
              if (((ii) this).field_c.field_c[fieldTemp$1].field_b != ((ii) this).field_c.field_c[((ii) this).field_d + -1]) {
                ((ii) this).field_b = ((ii) this).field_c.field_c[((ii) this).field_d - 1].field_b;
                return true;
              } else {
                ((ii) this).field_b = ((ii) this).field_c.field_c[-1 + ((ii) this).field_d];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final Object next() {
        jb var1 = null;
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        if (((ii) this).field_b == ((ii) this).field_c.field_c[-1 + ((ii) this).field_d]) {
          L0: while (true) {
            if (((ii) this).field_d < ((ii) this).field_c.field_e) {
              int fieldTemp$2 = ((ii) this).field_d;
              ((ii) this).field_d = ((ii) this).field_d + 1;
              var1 = ((ii) this).field_c.field_c[fieldTemp$2].field_b;
              if (var1 == ((ii) this).field_c.field_c[-1 + ((ii) this).field_d]) {
                continue L0;
              } else {
                ((ii) this).field_b = var1.field_b;
                ((ii) this).field_a = var1;
                return (Object) (Object) var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((ii) this).field_b;
          ((ii) this).field_a = var1;
          ((ii) this).field_b = var1.field_b;
          return (Object) (Object) var1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Rock";
    }
}
