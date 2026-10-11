/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qea {
    private int field_a;
    private int field_d;
    private int field_f;
    static int[] field_b;
    private int[] field_g;
    private int[] field_e;
    private int field_c;

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(sda.a(param0, -1, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            if (param1 > -59) {
              qea.a(22);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("qea.E(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != -3) {
          qea.a(46);
        }
        field_b = null;
    }

    private final void c(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_c + 1;
        this.field_c = this.field_c + 1;
        this.field_a = this.field_a + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_e[var2];
          if ((2 & var2) == 0) {
            if ((1 & var2) != 0) {
              this.field_f = this.field_f ^ this.field_f >>> 6;
            } else {
              this.field_f = this.field_f ^ this.field_f << 13;
            }
          } else {
            if ((1 & var2) != 0) {
              this.field_f = this.field_f ^ this.field_f >>> 16;
            } else {
              this.field_f = this.field_f ^ this.field_f << 2;
            }
          }
          this.field_f = this.field_f + this.field_e[128 + var2 & 255];
          dupTemp$1 = this.field_a + (this.field_f + this.field_e[sea.c(255, var3 >> 2)]);
          var4 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          dupTemp$2 = this.field_e[sea.c(var4, 261352) >> 8 >> 2] + var3;
          this.field_a = dupTemp$2;
          this.field_g[var2] = dupTemp$2;
        }
        if (param0 != 2) {
          this.a(false);
        }
    }

    final int b(int param0) {
        if (param0 < 89) {
          this.a(89, 120);
        }
        if (this.field_d == 0) {
          this.c(2);
          this.field_d = 256;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_g[fieldTemp$0];
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        if (param1 >= param0) {
          throw new IllegalArgumentException();
        }
        int var3 = -(int)(4294967296L % (long)param0) + 2147483647;
        while (true) {
          var4 = this.b(107);
          if (var3 >= var4) {
            break;
          }
        }
        return oea.a(var4, param0, -66);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var5 = -1640531527;
        int var3 = -1640531527;
        int var6 = -1640531527;
        int var4 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var7 = -1640531527;
        int var10 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        if (!param0) {
          this.field_a = -40;
        }
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var3 = var3 + this.field_g[var2Lifetime1];
          var9 = var9 + this.field_g[var2Lifetime1 + 6];
          var8 = var8 + this.field_g[5 + var2Lifetime1];
          var5 = var5 + this.field_g[2 + var2Lifetime1];
          var7 = var7 + this.field_g[var2Lifetime1 + 4];
          var6 = var6 + this.field_g[var2Lifetime1 + 3];
          var4 = var4 + this.field_g[1 + var2Lifetime1];
          var10 = var10 + this.field_g[var2Lifetime1 + 7];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_e[var2Lifetime1] = var3;
          this.field_e[var2Lifetime1 + 1] = var4;
          this.field_e[2 + var2Lifetime1] = var5;
          this.field_e[var2Lifetime1 + 3] = var6;
          this.field_e[var2Lifetime1 + 4] = var7;
          this.field_e[5 + var2Lifetime1] = var8;
          this.field_e[6 + var2Lifetime1] = var9;
          this.field_e[7 + var2Lifetime1] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var10 = var10 + this.field_e[var2Lifetime2 + 7];
          var4 = var4 + this.field_e[var2Lifetime2 + 1];
          var8 = var8 + this.field_e[var2Lifetime2 + 5];
          var5 = var5 + this.field_e[2 + var2Lifetime2];
          var7 = var7 + this.field_e[var2Lifetime2 + 4];
          var9 = var9 + this.field_e[var2Lifetime2 + 6];
          var3 = var3 + this.field_e[var2Lifetime2];
          var6 = var6 + this.field_e[var2Lifetime2 + 3];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_e[var2Lifetime2] = var3;
          this.field_e[var2Lifetime2 + 1] = var4;
          this.field_e[2 + var2Lifetime2] = var5;
          this.field_e[3 + var2Lifetime2] = var6;
          this.field_e[var2Lifetime2 + 4] = var7;
          this.field_e[var2Lifetime2 + 5] = var8;
          this.field_e[var2Lifetime2 + 6] = var9;
          this.field_e[var2Lifetime2 + 7] = var10;
        }
        this.c(2);
        this.field_d = 256;
    }

    final static void a(int param0, int param1, fia param2, int param3, String param4, int param5, int param6, int param7, int param8, boolean param9, boolean param10, int param11, int param12, long param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            vc.field_q = new kh(param6);
            ql.field_k = new kh(param7);
            q.field_r = param9;
            be.field_c = param0;
            csa.field_g = param11;
            nn.field_b = param3;
            du.field_h = param13;
            vh.field_g = param12;
            lr.field_c = param1;
            kqa.field_a = param2;
            rsa.field_x = param4;
            if (param8 != -1367135824) {
              return;
            }
            uq.field_a = param5;
            ft.field_a = param10;
            if (kqa.field_a.field_x != null) {
              try {
                fua.field_b = new ph(kqa.field_a.field_x, 64, 0);
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
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("qea.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    qea(int[] param0) {
        int var2_int = 0;
        try {
          this.field_g = new int[256];
          this.field_e = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_g[var2_int] = param0[var2_int];
          }
          this.a(true);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
