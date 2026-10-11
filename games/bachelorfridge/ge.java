/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ge extends hfa {
    private po field_G;
    static int field_I;
    private boolean field_M;
    private int field_J;
    static ee field_K;
    private String field_C;
    static long field_F;
    static boolean field_D;
    static boolean field_L;
    private int field_E;
    private int field_H;

    ge(int param0, int param1, int param2, int param3, wj param4, boolean param5, int param6, int param7, po param8, int param9, String param10) {
        super(param0, param1, param2, param3, (qda) null, (pl) null);
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
          this.field_J = param9;
          this.field_E = param7;
          this.field_H = param6;
          this.field_G = param8;
          this.field_A = param4;
          stackIn_4_1 = (param5);
          this.field_M = stackIn_4_1;
          this.field_C = param10;
          var12_int = -this.field_E + this.field_H;
          var13 = this.field_G.a(param10, var12_int, this.field_G.field_u) + this.field_E * 2;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.a(param0, var13, (byte) 59, param2, param1);
          }
          if (this.field_M) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_E * 2 + this.field_H;
          }
          var14 = stackIn_10_0;
          this.field_A.a(var14, param3 - this.field_E * 2, (byte) 59, -this.field_H + param2 - this.field_E * 3, (-param3 + var13 >> 1) + this.field_E);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("ge.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          pf var4 = null;
          pf var5 = null;
          int stackIn_13_0 = 0;
          Throwable decompiledCaughtException = null;
          if (null == aw.field_x) {
            aw.field_x = cc.field_e.a((byte) 121, oca.field_p, kn.field_h);
          }
          if (0 == aw.field_x.field_f) {
            return false;
          }
          dupTemp$1 = f.b((byte) 73);
          vla.field_v = dupTemp$1;
          pk.field_c = dupTemp$1;
          if (param0 != -29510) {
            field_K = (ee) null;
          }
          if (aw.field_x.field_f != 1) {
            eia.field_a = mk.field_o;
          } else {
            try {
              dma.field_b = new pj((java.net.Socket) (aw.field_x.field_e), cc.field_e);
              var4 = ig.field_m;
              var5 = var4;
              sja.field_fb.field_g = 0;
              stackIn_13_0 = (!param1) ? -1 : -2;
              f.field_b = stackIn_13_0;
              ef.field_l = stackIn_13_0;
              bd.field_j = stackIn_13_0;
              eia.field_a = rga.field_c;
              var5.field_g = 0;
              cca.a(sja.field_fb, fl.field_q, (byte) -106, mfa.field_a, kha.field_k);
              hna.a(-1, 117);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              eia.field_a = mk.field_o;
              aw.field_x = null;
              return true;
            }
          }
          aw.field_x = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        field_K = null;
        if (param0 >= -30) {
          ge.e((byte) 35);
        }
    }

    final String c(byte param0) {
        int var2 = this.field_A.field_t ? 1 : 0;
        this.field_A.field_t = this.field_t;
        String var3 = this.field_A.c(param0);
        this.field_A.field_t = var2 != 0 ? true : false;
        return var3;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var8 = 0;
        int var5 = param3 + this.field_s;
        int var6 = param1 + this.field_v;
        int var7 = 44 % ((-20 - param0) / 54);
        super.a((byte) 123, param1, param2, param3);
        if (0 == param2) {
          var8 = this.field_M ? -this.field_H + this.field_p - this.field_E * 2 : 0;
          this.field_G.a(this.field_C, var5 - (-var8 - this.field_E), var6 + this.field_E, -this.field_E + this.field_H, -(this.field_E * 2) + this.field_q, this.field_J, -1, !this.field_M ? 2 : 0, 1, this.field_G.field_u);
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, po param3, int param4, int param5, int param6, kv[] param7, int param8, byte param9, int param10, kv[] param11) {
        try {
          vr.a(param8, param3, param6, param6, param10, param7, param0, param3, param4, param5, param2, param11, param1, param8, 480);
          int var12_int = 3 / ((param9 + 6) / 43);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ge.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ',' + param10 + ',' + (param11 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
