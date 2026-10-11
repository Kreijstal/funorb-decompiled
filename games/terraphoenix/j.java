/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j extends jc {
    private boolean field_M;
    static Random field_H;
    private int field_O;
    private pk field_A;
    private int field_S;
    private String field_L;
    static String field_K;
    static String field_I;
    static String field_P;
    private int field_Q;
    static int field_R;

    final String f(int param0) {
        int var2 = this.field_F.field_s ? 1 : 0;
        this.field_F.field_s = this.field_s;
        String var3 = this.field_F.f(85);
        this.field_F.field_s = var2 != 0 ? true : false;
        if (param0 > 70) {
          return var3;
        }
        this.field_M = true;
        return var3;
    }

    final static int a(int param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = gj.a(param1, 0, 255, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 115;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("j.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_K = null;
        field_H = null;
        field_P = null;
        if (param0 != -5981) {
          field_R = 125;
          field_I = null;
          return;
        }
        field_I = null;
    }

    j(int param0, int param1, int param2, int param3, gl param4, boolean param5, int param6, int param7, pk param8, int param9, String param10) {
        super(param0, param1, param2, param3, (cj) null, (sc) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_A = param8;
          stackIn_4_1 = (param5);
          this.field_M = stackIn_4_1;
          this.field_L = param10;
          this.field_S = param9;
          this.field_F = param4;
          this.field_Q = param6;
          this.field_O = param7;
          var12_int = -this.field_O + this.field_Q;
          var13 = this.field_A.a(param10, var12_int, this.field_A.field_s) + this.field_O * 2;
          if (var13 > param3) {
            this.a(param1, (byte) 49, param2, param0, var13);
          } else {
            var13 = param3;
          }
          if (!this.field_M) {
            stackIn_10_0 = 2 * this.field_O + this.field_Q;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_F.a(this.field_O + (-param3 + var13 >> 1), (byte) 61, param2 - this.field_Q - this.field_O * 3, var14, -(this.field_O * 2) + param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("j.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var5 = this.field_w + param0;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param1 >= -106) {
          this.field_Q = 38;
          var6 = param3 + this.field_u;
          super.a(param0, -113, param2, param3);
          if (param2 == 0) {
            var7 = this.field_M ? -(this.field_O * 2) + this.field_p - this.field_Q : 0;
            this.field_A.a(this.field_L, this.field_O + var7 + var5, var6 + this.field_O, -this.field_O + this.field_Q, this.field_n - this.field_O * 2, this.field_S, -1, this.field_M ? 0 : 2, 1, this.field_A.field_s);
            return;
          }
          return;
        }
        var6Lifetime1 = param3 + this.field_u;
        super.a(param0, -113, param2, param3);
        if (param2 == 0) {
          var7Lifetime1 = this.field_M ? -(this.field_O * 2) + this.field_p - this.field_Q : 0;
          this.field_A.a(this.field_L, this.field_O + var7Lifetime1 + var5, var6Lifetime1 + this.field_O, -this.field_O + this.field_Q, this.field_n - this.field_O * 2, this.field_S, -1, this.field_M ? 0 : 2, 1, this.field_A.field_s);
          return;
        }
    }

    static {
        field_K = "Land your troops";
        field_H = new Random();
        field_I = "Equip your soldiers";
        field_P = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
