/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fa extends nb {
    fa field_q;
    fa field_r;
    static int field_p;

    final void d(int param0) {
        if (null == this.field_r) {
          return;
        }
        this.field_r.field_q = this.field_q;
        this.field_q.field_r = this.field_r;
        if (param0 == 0) {
          this.field_q = null;
          this.field_r = null;
          return;
        }
        this.field_r = (fa) null;
        this.field_q = null;
        this.field_r = null;
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          rf.a((java.awt.Component) ((Object) param1), -116);
          mj.a(3490, (java.awt.Component) ((Object) param1));
          if (null != jl.field_u) {
            jl.field_u.a((java.awt.Component) ((Object) param1), (byte) -36);
          }
          if (param0 == -46) {
            return;
          }
          field_p = -68;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("fa.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_3_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = ZombieDawn.field_J;
        try {
          var12 = new char[param1];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          var6 = 0;
          if (param3 >= -58) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          while (param1 > var6) {
            var7 = param0[param2 + var6] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = fj.field_h[-128 + var7];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var10[incrementValue$1] = (char)var7;
            }
            var6++;
          }
          stackIn_16_0 = new String(var12, 0, var5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("fa.DC(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected fa() {
    }

    final static int e(int param0) {
        int var1 = -98 / ((-62 - param0) / 56);
        return 4 + pb.a(so.field_a, 16, 1);
    }

    static {
    }
}
