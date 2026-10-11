/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be extends ob {
    static String field_K;
    static String field_J;
    static int field_I;
    private static int field_H;
    static vh field_L;

    final static void a(ge param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = Pool.field_O;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (nl.field_c != null) {
              try {
                nl.field_c.a(0, 0L);
                nl.field_c.a(param1 + 114, var6);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param0.a(var2, (byte) 0, param1, 24);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param0.a(var2, (byte) 0, param1, 24);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("be.FB(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(byte param0) {
        field_J = null;
        if (param0 != -89) {
          field_H = -35;
        }
        field_L = null;
        field_K = null;
    }

    final static void f(int param0) {
        ep.field_z = false;
        ro.field_e = false;
        lf.a(param0, (byte) 111);
        pa.field_I = aa.field_c;
        wd.field_Lb = aa.field_c;
    }

    final boolean f(int param0, int param1) {
        if (param0 != -13676) {
          field_L = (vh) null;
        }
        return param1 == this.field_h.length - 1 ? true : false;
    }

    final int b(byte param0, int param1) {
        if (param0 != 6) {
          this.b((byte) 113, 90);
        }
        return this.field_s * param1 + (this.field_x + (param1 != -1 + this.field_h.length ? 0 : 20));
    }

    final static void a(int param0, int param1, int param2, int param3, so[] param4, int param5, eg param6) {
        int[] var8 = null;
        int[] var7 = null;
        int[] var9 = null;
        int[] var7Lifetime1;
        try {
          var8 = mj.a(-31121);
          var7 = var8;
          var8[param3] = param1;
          var8[0] = param5;
          var8[2] = param2;
          param4[0 + param0] = hc.a(param6, var8, (byte) 101);
          var9 = dq.a((byte) 10, f.a((byte) 94, var8));
          var7Lifetime1 = var9;
          param4[param0 + 1] = hc.a(param6, var9, (byte) 101);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "be.EB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    be(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(mc.field_k, param0, param1, param2, param3, param4, param5);
    }

    final void c(int param0) {
        if (param0 <= 36) {
          field_K = (String) null;
        }
        super.c(92);
    }

    static {
        field_K = "Cancel";
        field_H = 3;
        field_J = "More suggestions";
        field_I = 1 << field_H;
    }
}
