/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sc {
    int field_a;
    int[] field_d;
    int field_c;
    static int field_f;
    java.awt.Image field_e;
    static fe field_b;

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    abstract void a(int param0, java.awt.Component param1, int param2, byte param3);

    final static dm a(byte param0) {
        int var4_int = 0;
        int var1 = rc.field_j[0] * hl.field_K[0];
        byte[] var2 = mj.field_a[0];
        int[] var3 = new int[var1];
        if (param0 != -60) {
            Random var5 = (Random) null;
            sc.a((byte) 50, (Random) null, 37);
        }
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = cm.field_j[cd.a(255, (int) var2[var4_int])];
        }
        dm var4 = new dm(pg.field_b, dd.field_C, gh.field_m[0], md.field_e[0], rc.field_j[0], hl.field_K[0], var3);
        kj.c(true);
        return var4;
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != 58) {
            Random var2 = (Random) null;
            sc.a((byte) 47, (Random) null, -73);
        }
    }

    final static int a(byte param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -75) {
              if (-1 > (param2 ^ -1)) {
                if (!uj.a(true, param2)) {
                  var3_int = -(int)(4294967296L % (long)param2) + -2147483648;
                  L1: while (true) {
                    var4 = param1.nextInt();
                    if (var3_int > var4) {
                      stackIn_12_0 = jc.a(var4, param2, param0 ^ 121);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      continue L1;
                    }
                  }
                } else {
                  stackIn_7_0 = (int)((4294967295L & (long)param1.nextInt()) * (long)param2 >> -1102483296);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              stackIn_2_0 = 102;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("sc.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final void a(int param0) {
        vb.a(this.field_d, this.field_a, this.field_c);
        if (param0 != 255) {
            Random var3 = (Random) null;
            sc.a((byte) -94, (Random) null, 54);
        }
    }

    static {
        field_b = new fe();
    }
}
