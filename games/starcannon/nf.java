/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nf {
    static int[] field_i;
    static int field_l;
    private byte[] field_h;
    private int field_g;
    private long[] field_d;
    private long[] field_m;
    private byte[] field_f;
    private int field_j;
    static int field_e;
    private long[] field_n;
    static volatile boolean field_k;
    private long[] field_c;
    private long[] field_a;
    static int[] field_b;

    public static void b(int param0) {
        if (param0 >= -92) {
          return;
        }
        field_i = null;
        field_b = null;
    }

    final static void a(int param0, byte param1) {
        try {
          IOException iOException = null;
          kh var3 = null;
          Throwable decompiledCaughtException = null;
          if (param1 != 95) {
            var3 = (kh) null;
            nf.a(true, (String) null, (String) null, 96, (String) null, 67, (kh) null);
          }
          if (null != m.field_b && (0 > param0 ||
            pb.field_a == r.field_c)) {
            if (d.field_b.field_g == 0 &&
              ca.field_Y + 10000L < dd.b(57)) {
              d.field_b.d((byte) 88, param0);
            }
            if (d.field_b.field_g > 0) {
              try {
                m.field_b.a(0, d.field_b.field_f, (byte) 87, d.field_b.field_g);
                ca.field_Y = dd.b(84);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                ec.a((byte) 27);
              }
              d.field_b.field_g = 0;
            }
            return;
          }
          d.field_b.field_g = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        try {
          this.field_f[this.field_g] = (byte)cl.a((int) this.field_f[this.field_g], 128 >>> w.a(7, this.field_j));
          if (param1 != 494486752) {
            field_i = (int[]) null;
          }
          this.field_g = this.field_g + 1;
          if (this.field_g > 32) {
            while (64 > this.field_g) {
              fieldTemp$0 = this.field_g;
              this.field_g = this.field_g + 1;
              this.field_f[fieldTemp$0] = (byte) 0;
            }
            this.a(true);
            this.field_g = 0;
          }
          while (this.field_g < 32) {
            fieldTemp$1 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_f[fieldTemp$1] = (byte) 0;
          }
          ug.a(this.field_h, 0, this.field_f, 32, 32);
          this.a(true);
          var4_int = 0;
          var5 = param0;
          while (var4_int < 8) {
            var6 = this.field_a[var4_int];
            param2[var5] = (byte)(int)(var6 >>> 56);
            param2[1 + var5] = (byte)(int)(var6 >>> 48);
            param2[var5 + 2] = (byte)(int)(var6 >>> 40);
            param2[3 + var5] = (byte)(int)(var6 >>> 32);
            param2[var5 + 4] = (byte)(int)(var6 >>> 24);
            param2[5 + var5] = (byte)(int)(var6 >>> 16);
            param2[6 + var5] = (byte)(int)(var6 >>> 8);
            param2[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("nf.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 != 5) {
          return;
        }
        while (32 > var2) {
          this.field_h[var2] = (byte) 0;
          var2++;
        }
        this.field_g = 0;
        this.field_j = 0;
        this.field_f[0] = (byte) 0;
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          this.field_a[var2Lifetime1] = 0L;
        }
    }

    private final void a(boolean param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var2 = 0;
        var3 = 0;
        while (8 > var2) {
          this.field_c[var2] = ba.a(r.a((long)this.field_f[7 + var3], 255L), ba.a(r.a(65280L, (long)this.field_f[6 + var3] << 8), ba.a(r.a(16711680L, (long)this.field_f[var3 + 5] << 16), ba.a(r.a(255L, (long)this.field_f[var3 + 4]) << 24, ba.a(r.a((long)this.field_f[3 + var3] << 32, 1095216660480L), ba.a(ba.a(r.a((long)this.field_f[var3 + 1], 255L) << 48, (long)this.field_f[var3] << 56), r.a((long)this.field_f[var3 + 2], 255L) << 40))))));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_a[var2Lifetime1];
          arrayValue$1 = this.field_c[var2Lifetime1];
          this.field_n[var2Lifetime1] = dupTemp$0;
          this.field_m[var2Lifetime1] = ba.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_d[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_d[var3Lifetime1] = ba.a(this.field_d[var3Lifetime1], lj.field_e[var4][w.a(255, (int)(this.field_n[w.a(7, -var4 + var3Lifetime1)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_n[var3Lifetime1Lifetime1] = this.field_d[var3Lifetime1Lifetime1];
          }
          this.field_n[0] = ba.a(this.field_n[0], lj.field_b[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_d[var3Lifetime1Lifetime2] = this.field_n[var3Lifetime1Lifetime2];
            var6 = 0;
            var4Lifetime1 = var6;
            var5Lifetime1 = 56;
            while (8 > var6) {
              this.field_d[var3Lifetime1Lifetime2] = ba.a(this.field_d[var3Lifetime1Lifetime2], lj.field_e[var6][w.a((int)(this.field_m[w.a(var3Lifetime1Lifetime2 - var6, 7)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var6++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_m[var3Lifetime1Lifetime3] = this.field_d[var3Lifetime1Lifetime3];
          }
        }
        if (!param0) {
          nf.b(-86);
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_a[var2Lifetime3] = ba.a(this.field_a[var2Lifetime3], ba.a(this.field_m[var2Lifetime3], this.field_c[var2Lifetime3]));
        }
    }

    final static boolean a(boolean param0, String param1, String param2, int param3, String param4, int param5, kh param6) {
        RuntimeException var7 = null;
        ok var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (uh.field_k != cl.field_k) {
            return false;
          }
          if (param5 != 0) {
            nf.b(124);
          }
          var8 = new ok(ti.field_b, param6);
          ti.field_b.a((byte) 72, (uj) (var8));
          if (dd.a((byte) 77)) {
            var8.p(10341);
            return true;
          }
          uh.field_k = jl.field_a;
          qb.field_a = param3;
          jl.field_c = param2;
          wj.field_c = param4;
          gj.field_a = null;
          lh.field_D = param1;
          sk.field_b = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_14_0 = var7;
          stackIn_14_1 = new StringBuilder().append("nf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(long param0, int param1, byte[] param2) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        byte[] var13 = null;
        int var8Lifetime1;
        try {
          var5_int = 0;
          var6 = 7 & -((int)param0 & 7) + 8;
          var7 = this.field_j & 7;
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + (((int)var9 & 255) + (this.field_h[var11] & 255));
            this.field_h[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param0 > 8L) {
            var8 = param2[var5_int] << var6 & 255 | (param2[1 + var5_int] & 255) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_f[this.field_g] = (byte)cl.a((int) this.field_f[this.field_g], var8 >>> var7);
              this.field_g = this.field_g + 1;
              this.field_j = this.field_j + (8 - var7);
              if (this.field_j == 512) {
                this.a(true);
                this.field_g = 0;
                this.field_j = 0;
              }
              this.field_f[this.field_g] = (byte)w.a(255, var8 << -var7 + 8);
              var5_int++;
              this.field_j = this.field_j + var7;
              param0 = param0 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L < param0) {
            var8Lifetime1 = param2[var5_int] << var6 & 255;
            this.field_f[this.field_g] = (byte)cl.a((int) this.field_f[this.field_g], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if ((long)var7 + param0 >= 8L) {
            this.field_g = this.field_g + 1;
            this.field_j = this.field_j + (-var7 + 8);
            param0 = param0 - (long)(8 - var7);
            if (this.field_j == 512) {
              this.a(true);
              this.field_j = 0;
              this.field_g = 0;
            }
            this.field_f[this.field_g] = (byte)w.a(255, var8Lifetime1 << -var7 + 8);
            this.field_j = this.field_j + (int)param0;
          } else {
            this.field_j = (int)((long)this.field_j + param0);
          }
          if (param1 != 614) {
            var13 = (byte[]) null;
            this.a(-42L, -88, (byte[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("nf.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    nf() {
        this.field_f = new byte[64];
        this.field_j = 0;
        this.field_h = new byte[32];
        this.field_n = new long[8];
        this.field_d = new long[8];
        this.field_g = 0;
        this.field_a = new long[8];
        this.field_c = new long[8];
        this.field_m = new long[8];
    }

    static {
        field_k = true;
    }
}
