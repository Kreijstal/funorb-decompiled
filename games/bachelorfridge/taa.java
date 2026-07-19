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
        fo.field_a.a(param3, 31407, param6, param0, param5);
        if (param2 >= 87) {
          if (null != da.field_d) {
            da.field_d.a((byte) -120, param3, param3, param1 + -uga.field_x, param1, param4);
            return;
          } else {
            return;
          }
        } else {
          field_m = (kv[]) null;
          if (null == da.field_d) {
            return;
          } else {
            da.field_d.a((byte) -120, param3, param3, param1 + -uga.field_x, param1, param4);
            return;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, gj param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_k = param0;
              this.field_n = param3;
              this.field_j = param2;
              if (param1 <= -82) {
                break L1;
              } else {
                this.field_k = 48;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("taa.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    taa(gj param0, ad param1) {
        this(param0, param1.field_s.field_x, param1.field_s.field_J);
    }

    private final void b(boolean param0) {
        int var2 = 0;
        gj var7 = null;
        dha var8 = null;
        dha var9 = null;
        dha var10 = null;
        dha var11 = null;
        dha var12 = null;
        dha var13 = null;
        dha var14 = null;
        dha var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        this.field_o = this.field_n.field_s.field_B;
        this.field_t = this.field_n.field_s.field_b;
        this.field_v = this.field_j - this.field_o;
        this.field_r = this.field_k - this.field_t;
        if (!param0) {
          L0: {
            var7 = (gj) null;
            this.a(34, (byte) 123, -56, (gj) null);
            if ((kla.a(2, this.field_n.field_h.field_w, -2147483648) ^ -1) != -2) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          var2 = stackIn_8_0;
          var8 = new dha(this.field_t, this.field_o);
          var9 = new dha((int)((double)var2 * ((double)this.field_v * 0.2) + (double)this.field_t), (int)((double)this.field_o - (double)var2 * (0.2 * (double)this.field_r)));
          var10 = new dha((int)((double)this.field_k + (double)var2 * ((double)this.field_v * 0.2)), (int)((double)this.field_j - (double)this.field_r * 0.2 * (double)var2));
          var11 = new dha(this.field_k, this.field_j);
          this.field_q = new gw(var8, var9, var10, var11, 0);
          return;
        } else {
          L1: {
            if ((kla.a(2, this.field_n.field_h.field_w, -2147483648) ^ -1) != -2) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var2 = stackIn_4_0;
          var12 = new dha(this.field_t, this.field_o);
          var13 = new dha((int)((double)var2 * ((double)this.field_v * 0.2) + (double)this.field_t), (int)((double)this.field_o - (double)var2 * (0.2 * (double)this.field_r)));
          var14 = new dha((int)((double)this.field_k + (double)var2 * ((double)this.field_v * 0.2)), (int)((double)this.field_j - (double)this.field_r * 0.2 * (double)var2));
          var15 = new dha(this.field_k, this.field_j);
          this.field_q = new gw(var12, var13, var14, var15, 0);
          return;
        }
    }

    private final void d(int param0) {
        if (param0 != 1998707041) {
            taa.d((byte) -37);
        }
    }

    final boolean c(byte param0) {
        dha var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (null == this.field_q) {
            this.b(true);
            break L0;
          } else {
            break L0;
          }
        }
        var2 = this.field_q.a((double)this.field_s / 50.0, 91);
        var3 = var2.field_c;
        var4 = var2.field_a;
        var5 = 20 % ((71 - param0) / 47);
        this.field_n.field_s.a(var3, var4, this.field_p, (byte) -71);
        int fieldTemp$2 = this.field_s + 1;
        this.field_s = this.field_s + 1;
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
        this.field_p = true;
        try {
            var4_int = -(128 * (param1 - param2) >> 9564321) + 256;
            var5 = -(64 * (param2 + param1) >> 1998707041) + 208;
            this.a(var4_int, (byte) -107, var5, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "taa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
