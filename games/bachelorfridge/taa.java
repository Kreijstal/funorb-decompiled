/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class taa extends at {
    static sba field_u;
    private int field_v;
    private gj field_n;
    boolean field_p;
    int field_k;
    private int field_t;
    private int field_o;
    static kv[] field_m;
    static int field_l;
    private int field_r;
    private int field_s;
    private gw field_q;
    int field_j;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        fo.field_a.a(param3, 31407, 640, 5, 0);
        if (param2 >= 87) {
          if (null != da.field_d) {
            da.field_d.a((byte) -120, param3, param3, param1 + -uga.field_x, param1, param4);
            return;
          } else {
            return;
          }
        } else {
          field_m = null;
          if (null == da.field_d) {
            return;
          } else {
            da.field_d.a((byte) -120, param3, param3, param1 + -uga.field_x, param1, param4);
            return;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, gj param3) {
        RuntimeException var5 = null;
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
          ((taa) this).field_k = param0;
          ((taa) this).field_n = param3;
          ((taa) this).field_j = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("taa.F(").append(param0).append(',').append(-107).append(',').append(param2).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    taa(gj param0, ad param1) {
        this(param0, param1.field_s.field_x, param1.field_s.field_J);
    }

    private final void b(boolean param0) {
        int var2 = 0;
        dha var3 = null;
        dha var4 = null;
        dha var5 = null;
        dha var6 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          ((taa) this).field_o = ((taa) this).field_n.field_s.field_B;
          ((taa) this).field_t = ((taa) this).field_n.field_s.field_b;
          ((taa) this).field_v = ((taa) this).field_j - ((taa) this).field_o;
          ((taa) this).field_r = ((taa) this).field_k - ((taa) this).field_t;
          if (kla.a(2, ((taa) this).field_n.field_h.field_w, -2147483648) != 1) {
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        var3 = new dha(((taa) this).field_t, ((taa) this).field_o);
        var4 = new dha((int)((double)var2 * ((double)((taa) this).field_v * 0.2) + (double)((taa) this).field_t), (int)((double)((taa) this).field_o - (double)var2 * (0.2 * (double)((taa) this).field_r)));
        var5 = new dha((int)((double)((taa) this).field_k + (double)var2 * ((double)((taa) this).field_v * 0.2)), (int)((double)((taa) this).field_j - (double)((taa) this).field_r * 0.2 * (double)var2));
        var6 = new dha(((taa) this).field_k, ((taa) this).field_j);
        ((taa) this).field_q = new gw(var3, var4, var5, var6, 0);
    }

    private final void d(int param0) {
    }

    final boolean c(byte param0) {
        dha var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (null == ((taa) this).field_q) {
            this.b(true);
            break L0;
          } else {
            break L0;
          }
        }
        var2 = ((taa) this).field_q.a((double)((taa) this).field_s / 50.0, 91);
        var3 = var2.field_c;
        var4 = var2.field_a;
        var5 = 20 % ((71 - param0) / 47);
        ((taa) this).field_n.field_s.a(var3, var4, ((taa) this).field_p, (byte) -71);
        int fieldTemp$2 = ((taa) this).field_s + 1;
        ((taa) this).field_s = ((taa) this).field_s + 1;
        if ((double)fieldTemp$2 > 50.0) {
          this.d(1998707041);
          return true;
        } else {
          return false;
        }
    }

    public static void d(byte param0) {
        field_m = null;
        field_u = null;
        if (param0 != -41) {
            taa.d((byte) -11);
        }
    }

    taa(gj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        ((taa) this).field_p = true;
        try {
            var4_int = -(128 * (param1 - param2) >> 1) + 256;
            var5 = -(64 * (param2 + param1) >> 1) + 208;
            this.a(var4_int, (byte) -107, var5, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "taa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
