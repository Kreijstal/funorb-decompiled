/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ama extends lba {
    private byte[] field_t;

    final byte[] a(int param0, int param1, int param2, int param3) {
        this.field_t = new byte[2 * (param0 * param1 * param3)];
        if (param2 == 0) {
          this.a(param3, param0, param1, (byte) -90);
          return this.field_t;
        }
        this.a(true, (byte) 84, 122);
        this.a(param3, param0, param1, (byte) -90);
        return this.field_t;
    }

    final static int a(il param0, String param1, int param2, int param3, String[] param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int var6Lifetime1;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          if (param3 != 1) {
            var14 = (String[]) null;
            ama.a((il) null, (String) null, -117, -80, (String[]) null);
          }
          var5_int = param0.b(param1);
          if (var5_int <= param2 &&
            param1.indexOf("<br>") == -1) {
            param4[0] = param1;
            stackIn_6_0 = 1;
            return stackIn_6_0;
          }
          var6 = (var5_int + (param2 - 1)) / param2;
          param2 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          for (var9 = 0; var8 > var9; var9++) {
            var10 = param1.charAt(var9);
            if (var10 == 32 ||
              45 == var10) {
              var11 = param1.substring(var7, 1 + var9).trim();
              var12 = param0.b(var11);
              if (param2 <= var12) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param4[incrementValue$1] = var11;
                var7 = 1 + var9;
              }
            }
            if (var10 == 62 &&
              param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param4[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param4[incrementValue$0] = param1.substring(var7, var8).trim();
          }
          stackIn_26_0 = var6Lifetime1;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("ama.K(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int incrementValue$0 = 0;
        if (!param0) {
          var4 = param2 * 2;
          var5 = param1 & 255;
          incrementValue$0 = var4;
          var4++;
          this.field_t[incrementValue$0] = (byte)(var5 * 3 >> 5);
          this.field_t[var4] = (byte)(3 * var5 >> 5);
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        try {
          int var2_int = 0;
          IOException var2 = null;
          Throwable decompiledCaughtException = null;
          if (vc.field_q.field_h >= param0) {
            return true;
          }
          if (oba.field_e == null) {
            return false;
          }
          try {
            var2_int = oba.field_e.c(~param1);
            if (var2_int <= 0) {
              if (~var2_int > param1) {
                dea.a(60);
                return false;
              }
              if (rf.b((byte) -121) <= 30000L) {
                return false;
              }
              dea.a(60);
              return false;
            }
            if (var2_int > -vc.field_q.field_h + param0) {
              var2_int = -vc.field_q.field_h + param0;
            }
            oba.field_e.a(param1 + 1, vc.field_q.field_h, vc.field_q.field_g, var2_int);
            ue.field_s = bva.b((byte) -107);
            vc.field_q.field_h = vc.field_q.field_h + var2_int;
            if (param0 > vc.field_q.field_h) {
              return false;
            }
            vc.field_q.field_h = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            dea.a(60);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ama() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    static {
    }
}
