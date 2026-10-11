/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rf {
    static int field_c;
    static boolean field_b;
    static int field_a;
    static CipherPacketBuffer field_d;

    final static void a(RgbSprite[] param0, int param1, int param2, int param3, int param4, int param5, RgbSprite[] param6, int param7, int param8, BitmapFont param9, int param10, int param11, int param12, int param13, RgbSprite[] param14) {
        int var15_int = 0;
        int var16 = 0;
        if (param13 >= -81) {
          return;
        }
        try {
          var15_int = param9.field_U + param9.field_F;
          var16 = param9.field_U;
          pc.a(var16, param0, param1, param9, param5, param3, param12, param7, param2, param6, param8, var15_int, param10, param11, var16, param4, param9, var15_int, param14, 480, 53);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "rf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_d = null;
        if (param0 < 105) {
          field_b = false;
        }
    }

    final static int a(int param0) {
        if (param0 != -58) {
          return 24;
        }
        return 1;
    }

    final static ef a(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        ef stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          var2_int = param1.length();
          if (param0 != 16) {
            field_c = 67;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          stackIn_12_0 = ec.field_b;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("rf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 < 77) {
          rf.a(-62);
        }
        stackIn_8_0 = (this == uf.field_g) || (Projectile.field_N == this) || (this == jd.field_sb);
        return stackIn_8_0;
    }

    final static cm a(boolean param0, int param1, byte param2, boolean param3, boolean param4, int param5) {
        try {
          int var6 = 0;
          Object var7 = null;
          Object var8 = null;
          fi var9 = null;
          cm stackIn_13_0 = null;
          Throwable decompiledCaughtException = null;
          var6 = 73 % ((-55 - param2) / 59);
          try {
            var7 = null;
            var8 = null;
            if (km.field_k.field_f != null) {
              si.field_o = new rj(km.field_k.field_f, 5200, 0);
              km.field_k.field_f = null;
              var7 = new rc(255, si.field_o, new rj(km.field_k.field_g, 12000, 0), 2097152);
            }
            if (si.field_o != null) {
              if (rh.field_o == null) {
                rh.field_o = new rj[km.field_k.field_a.length];
              }
              if (rh.field_o[param5] == null) {
                rh.field_o[param5] = new rj(km.field_k.field_a[param5], 12000, 0);
                km.field_k.field_a[param5] = null;
              }
              var8 = new rc(param5, si.field_o, rh.field_o[param5], 2097152);
            }
            var9 = gb.field_c.a((rc) (var7), (byte) 115, param3, (rc) (var8), param5);
            if (param4) {
              var9.d((byte) 74);
            }
            stackIn_13_0 = new cm(var9, param0, param1);
            return stackIn_13_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var7)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, na param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = SteelSentinels.obfuscationControl;
        try {
          var2_int = v.field_e;
          if (param0 >= -75) {
            stackIn_3_0 = -50;
            return stackIn_3_0;
          }
          if (2 != param1.field_k) {
            if (param1.field_k == 4) {
              var2_intLifetime1 = pf.field_j[param1.field_k];
            } else {
              if (GameplayController.field_G == param1.field_j) {
                var2_intLifetime1 = ag.field_r[param1.field_k];
              } else {
                var2_intLifetime1 = pf.field_j[param1.field_k];
              }
            }
          } else {
            if (param1.field_g) {
              var2_intLifetime1 = v.field_e;
            } else {
              if (param1.field_w == 0 &&
                0 == param1.field_n) {
                var2_intLifetime1 = ag.field_r[param1.field_k];
              } else {
                var2_intLifetime1 = pf.field_j[param1.field_k];
              }
            }
          }
          stackIn_17_0 = var2_intLifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("rf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = true;
        field_a = 1024;
    }
}
