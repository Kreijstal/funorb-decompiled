/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i {
    private int[][] field_b;
    static String field_c;
    static String field_g;
    private int field_a;
    static String field_f;
    static String field_d;
    private int field_e;

    final int a(boolean param0, int param1) {
        if (this.field_b != null) {
          param1 = (int)((long)this.field_e * (long)param1 / (long)this.field_a);
        }
        if (!param0) {
          return 51;
        }
        return param1;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, long param5, int param6, String param7, int param8, int param9, boolean param10, int param11, int param12, vh param13) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            nk.field_N = new mg(param8);
            n.field_b = new mg(param9);
            bl.field_a = param0;
            df.field_a = param2;
            bl.field_d = param5;
            sb.field_e = param13;
            cb.field_g = param3;
            vk.field_l = param1;
            vl.field_d = param11;
            vk.field_G = param4;
            if (param12 != 64) {
              field_d = (String) null;
            }
            pf.field_g = param10;
            tj.field_J = param6;
            aa.field_nb = param7;
            if (null != sb.field_e.field_c) {
              try {
                ub.field_t = new si(sb.field_e.field_c, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var15_ref;
            stackIn_13_1 = new StringBuilder().append("i.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            if (param7 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            if (param13 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != 43) {
          vh var2 = (vh) null;
          i.a(-34, -29, -66, true, -96, -49L, 126, (String) null, -127, 99, false, 19, 4, (vh) null);
        }
        field_d = null;
        field_c = null;
        field_g = null;
    }

    final byte[] a(byte param0, byte[] param1) {
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int var7Lifetime1;
        int var8Lifetime1;
        int var10Lifetime1;
        var11 = wizardrun.field_H;
        try {
          if (param0 != 47) {
            this.a((byte) 13, -83);
          }
          if (null != this.field_b) {
            var3_int = (int)((long)param1.length * (long)this.field_e / (long)this.field_a) + 14;
            var16 = new int[var3_int];
            var14 = var16;
            var4 = var14;
            var5 = 0;
            var6 = 0;
            for (var7 = 0; param1.length > var7; var7++) {
              var8 = param1[var7];
              var18 = this.field_b[var6];
              for (var10 = 0; var10 < 14; var10++) {
                var4[var10 + var5] = var4[var10 + var5] + var8 * var18[var10];
              }
              var6 = var6 + this.field_e;
              var10Lifetime1 = var6 / this.field_a;
              var5 = var5 + var10Lifetime1;
              var6 = var6 - var10Lifetime1 * this.field_a;
            }
            param1 = new byte[var3_int];
            var12 = 0;
            var7Lifetime1 = var12;
            while (var12 < var3_int) {
              var8Lifetime1 = 32768 + var16[var12] >> 16;
              if (var8Lifetime1 < -128) {
                param1[var12] = (byte)-128;
              } else {
                if (var8Lifetime1 > 127) {
                  param1[var12] = (byte)127;
                } else {
                  param1[var12] = (byte)var8Lifetime1;
                }
              }
              var12++;
            }
          }
          stackIn_19_0 = (byte[]) (param1);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("i.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    i(int param0, int param1) {
        int var4 = 0;
        int var3;
        int[] var5;
        double var6;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        if (param0 == param1) {
          return;
        }
        var3 = se.a(param1, param0, 0);
        param1 = param1 / var3;
        param0 = param0 / var3;
        this.field_e = param1;
        this.field_b = new int[param0][14];
        this.field_a = param0;
        for (var4 = 0; var4 < param0; var4++) {
          var5 = this.field_b[var4];
          var6 = (double)var4 / (double)param0 + 6.0;
          var8 = (int)Math.floor(var6 - 7.0 + 1.0);
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = (int)Math.ceil(7.0 + var6);
          if (var9 > 14) {
            var9 = 14;
          }
          var10 = (double)param1 / (double)param0;
          while (var8 < var9) {
            var12 = (-var6 + (double)var8) * 3.141592653589793;
            var14 = var10;
            if (var12 < -0.0001 ||
              0.0001 < var12) {
              var14 = var14 * (Math.sin(var12) / var12);
            }
            var14 = var14 * (0.54 + 0.46 * Math.cos(((double)var8 - var6) * 0.2243994752564138));
            var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
            var8++;
          }
        }
        return;
    }

    final int a(byte param0, int param1) {
        if (this.field_b != null) {
          param1 = (int)((long)this.field_e * (long)param1 / (long)this.field_a) + 6;
        }
        if (param0 != 127) {
          i.a((byte) -110);
        }
        return param1;
    }

    static {
        field_c = "Press SPACE or <%0> to attack.";
        field_f = "Invalid password.";
        field_g = "to over <%0> great games";
        field_d = "Free game completed";
    }
}
