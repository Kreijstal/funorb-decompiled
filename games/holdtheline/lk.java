/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lk implements Iterable {
    static byte[][] field_e;
    static nn field_h;
    static go[] field_c;
    static int field_f;
    static qb field_d;
    ln field_i;
    static float field_b;
    static boolean[] field_g;
    static uf field_a;

    public final Iterator iterator() {
        return (Iterator) (Object) new vl((lk) this);
    }

    final ln b(byte param0) {
        ln var2 = null;
        if (param0 == 121) {
          var2 = ((lk) this).field_i.field_n;
          if (((lk) this).field_i == var2) {
            return null;
          } else {
            var2.a((byte) -42);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_h = null;
        field_d = null;
    }

    final void a(ln param0, int param1) {
        if (!(param0.field_l == null)) {
            param0.a((byte) -42);
        }
        param0.field_n = ((lk) this).field_i;
        param0.field_l = ((lk) this).field_i.field_l;
        param0.field_l.field_n = param0;
        if (param1 != -29460) {
            return;
        }
        try {
            param0.field_n.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "lk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(float param0, int param1, int param2) {
        int var3 = param2 >> 16 & 255;
        int var4 = (param2 & 65280) >> 8;
        var3 = (int)((float)var3 * param0);
        int var5 = param2 & 255;
        var4 = (int)((float)var4 * param0);
        if (!(var3 >= 0)) {
            var3 = 0;
        }
        var5 = (int)((float)var5 * param0);
        if (!(0 <= var4)) {
            var4 = 0;
        }
        if (!(var3 <= 255)) {
            var3 = 255;
        }
        if (255 < var4) {
            var4 = 255;
        }
        if (!(var5 >= 0)) {
            var5 = 0;
        }
        if (var5 > 255) {
            var5 = 255;
        }
        return var5 | (var4 << 8 | var3 << 16);
    }

    private lk() throws Throwable {
        throw new Error();
    }

    final static float a(float[] param0, int param1, int param2, int param3, float param4) {
        RuntimeException var5 = null;
        float stackIn_2_0 = 0.0f;
        float stackIn_4_0 = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_3_0 = 0.0f;
        float stackOut_1_0 = 0.0f;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 != 0) {
              stackOut_3_0 = (1.0f - param4) * lk.a(param0, param1, -1 + param2, -1, param4) + param4 * lk.a(param0, 1 + param1, param2 + -1, -1, param4);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = param0[param1];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("lk.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + -1 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_g = new boolean[112];
    }
}
