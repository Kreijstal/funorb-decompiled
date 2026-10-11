/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha extends hl implements hd {
    int field_q;
    static Random field_n;
    float field_m;
    static uf[] field_o;
    static int[][] field_j;
    ha field_s;
    boolean field_r;
    boolean field_l;
    static int field_p;
    static uf field_i;
    static va field_k;

    final static void a(boolean param0) {
        qj.field_N[61] = 27;
        qj.field_N[47] = 73;
        qj.field_N[222] = 58;
        qj.field_N[192] = 28;
        qj.field_N[520] = 59;
        qj.field_N[91] = 42;
        qj.field_N[59] = 57;
        qj.field_N[44] = 71;
        qj.field_N[93] = 43;
        qj.field_N[92] = 74;
        qj.field_N[45] = 26;
        qj.field_N[46] = 72;
        if (param0) {
          qm var2 = (qm) null;
          ha.a((qm) null, (qm) null, true);
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_j = (int[][]) null;
        field_i = null;
        if (param0 < 29) {
          field_i = (uf) null;
        }
        field_k = null;
        field_n = null;
    }

    final static StringBuilder a(char param0, byte param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          var4_int = param3.length();
          param3.setLength(param2);
          for (var5 = var4_int; var5 < param2; var5++) {
            param3.setCharAt(var5, param0);
          }
          if (param1 == -83) {
            stackIn_8_0 = (StringBuilder) (param3);
            return stackIn_8_0;
          }
          stackIn_6_0 = (StringBuilder) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ha.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static float a(qm param0, qm param1, boolean param2) {
        RuntimeException var3 = null;
        float stackIn_2_0 = 0.0f;
        float stackIn_4_0 = 0.0f;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            stackIn_4_0 = (float)Math.atan2((double)(param0.field_f - param1.field_f), (double)(-param0.field_h + param1.field_h));
            return stackIn_4_0;
          }
          stackIn_2_0 = -0.9188363552093506f;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ha.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    ha(boolean param0, float param1) {
        this.field_s = null;
        this.field_l = false;
        this.field_q = 0;
        this.field_r = param0 ? true : false;
        this.field_m = param1;
    }

    public final int a(byte param0, hd param1) {
        ha var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -101) {
            this.field_l = true;
          }
          var3 = (ha) (param1);
          if (this.field_m < var3.field_m) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (!(var3.field_m < this.field_m)) {
            return 0;
          }
          stackIn_9_0 = 1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ha.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_n = new Random();
    }
}
