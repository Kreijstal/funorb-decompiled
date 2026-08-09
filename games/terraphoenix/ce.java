/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ce implements Iterable {
    static String field_d;
    static boolean field_e;
    private uf field_b;
    int field_c;
    uf[] field_a;

    public final Iterator iterator() {
        return (Iterator) ((Object) new c((ce) (this)));
    }

    final static ci[] a(String param0, byte param1, String param2, fa param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        fa var6 = null;
        ci[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -70) {
                break L1;
              } else {
                var6 = (fa) null;
                ce.a((String) null, (byte) 73, (String) null, (fa) null);
                break L1;
              }
            }
            var4_int = param3.c(-1, param2);
            var5 = param3.a(-103, var4_int, param0);
            stackIn_3_0 = mj.a(param3, var4_int, var5, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ce.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static long b(int param0) {
        if (param0 != 1) {
            field_d = (String) null;
            return ll.a(1000) - dm.field_c;
        }
        return ll.a(1000) - dm.field_c;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            ce.b(-112);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(uf param0, byte param1, long param2) {
        uf var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_a == null) {
                break L1;
              } else {
                param0.b((byte) 12);
                break L1;
              }
            }
            var5 = this.field_a[(int)(param2 & (long)(this.field_c - 1))];
            param0.field_a = var5.field_a;
            param0.field_d = var5;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
            param0.field_g = param2;
            if (param1 <= -49) {
              break L0;
            } else {
              ce.a(-9);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("ce.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final uf a(long param0, byte param1) {
        uf var4;
        uf var5;
        int var6;
        var6 = Terraphoenix.field_V;
        var4 = this.field_a[(int)((long)(-1 + this.field_c) & param0)];
        this.field_b = var4.field_d;
        L0: while (true) {
          if (var4 == this.field_b) {
            this.field_b = null;
            if (param1 == -21) {
              return null;
            } else {
              return (uf) null;
            }
          } else {
            if (param0 != this.field_b.field_g) {
              this.field_b = this.field_b.field_d;
              continue L0;
            } else {
              var5 = this.field_b;
              this.field_b = this.field_b.field_d;
              return var5;
            }
          }
        }
    }

    private ce() throws Throwable {
        throw new Error();
    }

    static {
        field_e = false;
        field_d = "ACT IV: ";
    }
}
