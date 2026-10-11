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
        return (Iterator) ((Object) new vl(this));
    }

    final ln b(byte param0) {
        if (param0 != 121) {
          return (ln) null;
        }
        ln var2 = this.field_i.field_n;
        if (this.field_i != var2) {
          var2.a((byte) -42);
          return var2;
        }
        return null;
    }

    public static void a(byte param0) {
        field_g = null;
        field_a = null;
        field_e = (byte[][]) null;
        field_c = null;
        field_h = null;
        field_d = null;
        if (param0 <= 75) {
          field_f = 94;
        }
    }

    final void a(ln param0, int param1) {
        if (param0.field_l != null) {
          param0.a((byte) -42);
        }
        param0.field_n = this.field_i;
        param0.field_l = this.field_i.field_l;
        param0.field_l.field_n = param0;
        if (param1 != -29460) {
          return;
        }
        try {
          param0.field_n.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "lk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(float param0, int param1, int param2) {
        int var3 = param2 >> 16 & 255;
        int var4 = (param2 & 65280) >> 8;
        var3 = (int)((float)var3 * param0);
        int var5 = param2 & 255;
        var4 = (int)((float)var4 * param0);
        if (var3 < 0) {
          var3 = 0;
        }
        var5 = (int)((float)var5 * param0);
        if (0 > var4) {
          var4 = 0;
        }
        if (var3 > 255) {
          var3 = 255;
        }
        if (255 < var4) {
          var4 = 255;
        }
        if (~var5 > param1) {
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
        float stackIn_4_0 = 0.0f;
        float stackIn_6_0 = 0.0f;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -1) {
            field_d = (qb) null;
          }
          if (param2 != 0) {
            stackIn_6_0 = (1.0f - param4) * lk.a(param0, param1, -1 + param2, -1, param4) + param4 * lk.a(param0, 1 + param1, param2 - 1, -1, param4);
            return stackIn_6_0;
          }
          stackIn_4_0 = param0[param1];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("lk.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_f = 0;
        field_g = new boolean[112];
    }
}
