/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qm implements Iterable {
    private hg field_e;
    static gi[] field_d;
    static int field_c;
    int field_g;
    static String[] field_f;
    hg[] field_b;
    static String field_a;

    final hg a(int param0, long param1) {
        hg var5 = null;
        int var6 = EscapeVector.field_A;
        if (param0 != -2678) {
            this.field_g = -103;
        }
        hg var4 = this.field_b[(int)((long)(-1 + this.field_g) & param1)];
        this.field_e = var4.field_b;
        while (var4 != this.field_e) {
            if (!((param1 ^ -1L) != (this.field_e.field_e ^ -1L))) {
                var5 = this.field_e;
                this.field_e = this.field_e.field_b;
                return var5;
            }
            this.field_e = this.field_e.field_b;
        }
        this.field_e = null;
        return null;
    }

    final static int a(dk[] param0, byte param1) {
        int var2_int = 0;
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        dk[] var7 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = 2147483647;
            var3 = param0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                L2: {
                  if (param1 > 9) {
                    break L2;
                  } else {
                    var7 = (dk[]) null;
                    qm.a((dk[]) null, (byte) 66);
                    break L2;
                  }
                }
                if ((var2_int ^ -1) != -2147483648) {
                  stackIn_13_0 = var2_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var5 = var3[var4];
                if (var5.field_f < var2_int) {
                  var2_int = var5.field_f;
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("qm.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new hb((qm) (this)));
    }

    final void a(long param0, byte param1, hg param2) {
        hg var5 = null;
        if (param2.field_d != null) {
            param2.c((byte) -51);
        }
        if (param1 != -106) {
            return;
        }
        try {
            var5 = this.field_b[(int)(param0 & (long)(-1 + this.field_g))];
            param2.field_d = var5.field_d;
            param2.field_b = var5;
            param2.field_d.field_b = param2;
            param2.field_b.field_d = param2;
            param2.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qm.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_f = null;
        if (param0 < 86) {
            field_d = (gi[]) null;
        }
    }

    private qm() throws Throwable {
        throw new Error();
    }

    static {
        field_c = 64;
        field_a = "Age:";
    }
}
