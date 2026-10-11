/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class qf extends eo {
    private int field_i;
    private long field_e;
    private long[] field_f;
    private int field_k;
    private long field_g;
    private long field_c;
    static java.util.zip.CRC32 field_m;
    static String field_h;
    static int field_l;
    static String field_o;
    static String field_n;
    static ed field_d;
    static int field_j;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, lk param5, int param6, boolean param7, byte param8, int param9, long param10, String param11, int param12, int param13) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            om.field_g = new c(param1);
            om.field_c = new c(param0);
            if (param8 != 84) {
              qf.b(-106);
            }
            ca.field_c = param5;
            jc.field_b = param7;
            cn.field_h = param11;
            sj.field_i = param13;
            jm.field_L = param6;
            ej.field_d = param3;
            ck.field_q = param10;
            ej.field_b = param9;
            qa.field_D = param4;
            ac.field_b = param12;
            rd.field_a = param2;
            if (ca.field_c.field_j == null) {
              return;
            }
            try {
              bd.field_h = new rg(ca.field_c.field_j, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("qf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            if (param11 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_n = null;
        field_m = null;
        field_o = null;
        if (param0 > 89) {
          field_h = null;
          return;
        }
        field_h = (String) null;
        field_h = null;
    }

    final void a(int param0) {
        if (param0 == 237) {
          this.field_e = 0L;
          if (this.field_c < this.field_g) {
            this.field_c = this.field_c + (-this.field_c + this.field_g);
          }
          return;
        }
    }

    private final long c(int param0) {
        long var2;
        long var4;
        long var6;
        int var8;
        int var9;
        long var6Lifetime1;
        long var6Lifetime2;
        long var6Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        var9 = EscapeVector.field_A;
        var2 = System.nanoTime();
        var4 = -this.field_e + var2;
        this.field_e = var2;
        if (-5000000000L >= var4) {
          var6 = 0L;
          for (var8 = param0; this.field_k >= var8; var8++) {
            var6 = var6 + this.field_f[(this.field_i - var8 + 10) % 10];
          }
          return var6 / (long)this.field_k;
        }
        if (5000000000L <= var4) {
          var6Lifetime1 = 0L;
          for (var8Lifetime1 = param0; this.field_k >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_f[(this.field_i - var8Lifetime1 + 10) % 10];
          }
          return var6Lifetime1 / (long)this.field_k;
        }
        this.field_f[this.field_i] = var4;
        if (this.field_k >= 1) {
          this.field_i = (1 + this.field_i) % 10;
          var6Lifetime2 = 0L;
          for (var8Lifetime2 = param0; this.field_k >= var8Lifetime2; var8Lifetime2++) {
            var6Lifetime2 = var6Lifetime2 + this.field_f[(this.field_i - var8Lifetime2 + 10) % 10];
          }
          return var6Lifetime2 / (long)this.field_k;
        }
        this.field_k = this.field_k + 1;
        this.field_i = (1 + this.field_i) % 10;
        var6Lifetime3 = 0L;
        for (var8Lifetime3 = param0; this.field_k >= var8Lifetime3; var8Lifetime3++) {
          var6Lifetime3 = var6Lifetime3 + this.field_f[(this.field_i - var8Lifetime3 + 10) % 10];
        }
        return var6Lifetime3 / (long)this.field_k;
    }

    final long c(byte param0) {
        if (param0 <= 70) {
          return -6L;
        }
        this.field_c = this.field_c + this.c(1);
        if (this.field_g > this.field_c) {
          return (-this.field_c + this.field_g) / 1000000L;
        }
        return 0L;
    }

    final int a(byte param0, long param1) {
        int var4;
        int var5;
        int var6;
        var6 = EscapeVector.field_A;
        var4 = 21 % ((param0 + 29) / 51);
        if (this.field_c < this.field_g) {
          this.field_e = this.field_e + (-this.field_c + this.field_g);
          this.field_c = this.field_c + (this.field_g - this.field_c);
          this.field_g = this.field_g + param1;
          return 1;
        }
        var5 = 0;
        do {
          this.field_g = this.field_g + param1;
          var5++;
        } while (var5 < 10 &&
          this.field_g < this.field_c);
        if (this.field_c > this.field_g) {
          this.field_g = this.field_c;
        }
        return var5;
    }

    qf() {
        this.field_i = 0;
        this.field_k = 1;
        this.field_g = 0L;
        this.field_e = 0L;
        this.field_f = new long[10];
        this.field_c = 0L;
        this.field_c = System.nanoTime();
        this.field_g = System.nanoTime();
    }

    static {
        field_m = new java.util.zip.CRC32();
        field_h = "Loading fonts";
        field_o = "Mode";
        field_n = "Unpacking sound effects";
        field_l = 250;
        field_j = 0;
    }
}
