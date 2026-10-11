/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bf {
    private int field_e;
    private long[] field_l;
    private long[] field_k;
    private int field_b;
    private long[] field_h;
    static je field_j;
    private byte[] field_a;
    private long[] field_g;
    private long[] field_c;
    static bd[][] field_f;
    static int[] field_d;
    private byte[] field_i;

    final void a(byte[] param0, int param1, int param2) {
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
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          this.field_i[this.field_e] = (byte)ll.a((int) this.field_i[this.field_e], 128 >>> ua.a(7, this.field_b));
          this.field_e = this.field_e + 1;
          if (this.field_e > 32) {
            while (this.field_e < 64) {
              fieldTemp$0 = this.field_e;
              this.field_e = this.field_e + 1;
              this.field_i[fieldTemp$0] = (byte) 0;
            }
            this.b((byte) -1);
            this.field_e = 0;
          }
          while (this.field_e < 32) {
            fieldTemp$1 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_i[fieldTemp$1] = (byte) 0;
          }
          kf.a(this.field_a, 0, this.field_i, 32, 32);
          this.b((byte) -1);
          if (param2 != -6) {
            return;
          }
          var4_int = 0;
          var5 = param1;
          while (var4_int < 8) {
            var6 = this.field_c[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[var5 + 5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[7 + var5] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("bf.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; 32 > var2; var2++) {
          this.field_a[var2] = (byte) 0;
        }
        this.field_i[0] = (byte) 0;
        this.field_e = 0;
        this.field_b = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_c[var2Lifetime1] = 0L;
        }
        if (param0 != 30) {
          this.field_i = (byte[]) null;
        }
    }

    private final void b(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_l[var2] = ga.a(ga.a(dk.a(255L, (long)this.field_i[6 + var3]) << 8, ga.a(ga.a(dk.a(255L, (long)this.field_i[var3 + 4]) << 24, ga.a(dk.a(1095216660480L, (long)this.field_i[var3 + 3] << 32), ga.a(ga.a((long)this.field_i[var3] << 56, dk.a((long)this.field_i[var3 + 1], 255L) << 48), dk.a(255L, (long)this.field_i[2 + var3]) << 40))), dk.a(16711680L, (long)this.field_i[var3 + 5] << 16))), dk.a((long)this.field_i[var3 + 7], 255L));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_c[var2Lifetime1];
          arrayValue$1 = this.field_l[var2Lifetime1];
          this.field_g[var2Lifetime1] = dupTemp$0;
          this.field_h[var2Lifetime1] = ga.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_k[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_k[var3Lifetime1] = ga.a(this.field_k[var3Lifetime1], i.field_a[var4][ua.a((int)(this.field_g[ua.a(7, var3Lifetime1 - var4)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_g[var3Lifetime1Lifetime1] = this.field_k[var3Lifetime1Lifetime1];
          }
          this.field_g[0] = ga.a(this.field_g[0], i.field_c[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_k[var3Lifetime1Lifetime2] = this.field_g[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_k[var3Lifetime1Lifetime2] = ga.a(this.field_k[var3Lifetime1Lifetime2], i.field_a[var7][ua.a((int)(this.field_h[ua.a(7, -var7 + var3Lifetime1Lifetime2)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_h[var3Lifetime1Lifetime3] = this.field_k[var3Lifetime1Lifetime3];
          }
        }
        if (param0 != -1) {
          bf.a(48);
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_c[var2Lifetime3] = ga.a(this.field_c[var2Lifetime3], ga.a(this.field_h[var2Lifetime3], this.field_l[var2Lifetime3]));
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_f = (bd[][]) null;
        field_d = null;
        if (param0 != 2107940192) {
          field_f = (bd[][]) null;
        }
    }

    final static gb a(boolean param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          int var8 = 0;
          rb var9 = null;
          gb stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            var8 = 5 / ((param5 - 28) / 39);
            if (jj.field_k.field_l != null) {
              mk.field_K = new bn(jj.field_k.field_l, 5200, 0);
              jj.field_k.field_l = null;
              var6 = new um(255, mk.field_K, new bn(jj.field_k.field_f, 12000, 0), 2097152);
            }
            if (null != mk.field_K) {
              if (oe.field_a == null) {
                oe.field_a = new bn[jj.field_k.field_v.length];
              }
              if (null == oe.field_a[param2]) {
                oe.field_a[param2] = new bn(jj.field_k.field_v[param2], 12000, 0);
                jj.field_k.field_v[param2] = null;
              }
              var7 = new um(param2, mk.field_K, oe.field_a[param2], 2097152);
            }
            var9 = sj.field_a.a(param0, param2, (um) (var6), (um) (var7), 0);
            if (param4) {
              var9.a((byte) -50);
            }
            stackIn_12_0 = new gb(var9, param1, param3);
            return stackIn_12_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, byte[] param1, long param2) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
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
        int var13 = 0;
        int var8Lifetime1;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5_int = 0;
          if (param0 < 107) {
            return;
          }
          var6 = 7 & 8 - ((int)param2 & 7);
          var7 = this.field_b & 7;
          var9 = param2;
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + (((int)var9 & 255) + (this.field_a[var11] & 255));
            this.field_a[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param2 > 8L) {
            var8 = 255 & param1[var5_int] << var6 | (param1[var5_int + 1] & 255) >>> 8 - var6;
            if (var8 >= 0 &&
              256 > var8) {
              this.field_i[this.field_e] = (byte)ll.a((int) this.field_i[this.field_e], var8 >>> var7);
              this.field_e = this.field_e + 1;
              this.field_b = this.field_b + (8 - var7);
              if (this.field_b == 512) {
                this.b((byte) -1);
                this.field_e = 0;
                this.field_b = 0;
              }
              this.field_i[this.field_e] = (byte)ua.a(255, var8 << 8 - var7);
              var5_int++;
              param2 = param2 - 8L;
              this.field_b = this.field_b + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 > 0L) {
            stackIn_17_0 = 255;
            stackIn_17_1 = param1[var5_int] << var6;
            var8Lifetime1 = stackIn_17_0 & stackIn_17_1;
            this.field_i[this.field_e] = (byte)ll.a((int) this.field_i[this.field_e], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (param2 + (long)var7 < 8L) {
            this.field_b = (int)((long)this.field_b + param2);
          } else {
            this.field_b = this.field_b + (-var7 + 8);
            this.field_e = this.field_e + 1;
            param2 = param2 - (long)(-var7 + 8);
            if (512 == this.field_b) {
              this.b((byte) -1);
              this.field_e = 0;
              this.field_b = 0;
            }
            this.field_i[this.field_e] = (byte)ua.a(255, var8Lifetime1 << 8 - var7);
            this.field_b = this.field_b + (int)param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("bf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
        }
    }

    bf() {
        this.field_e = 0;
        this.field_b = 0;
        this.field_k = new long[8];
        this.field_h = new long[8];
        this.field_l = new long[8];
        this.field_a = new byte[32];
        this.field_g = new long[8];
        this.field_c = new long[8];
        this.field_i = new byte[64];
    }

    static {
        field_j = new je();
    }
}
