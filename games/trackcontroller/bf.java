/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bf {
    private byte[] field_n;
    private long[] field_h;
    static qj field_o;
    private byte[] field_g;
    static String field_c;
    static String field_d;
    private long[] field_m;
    static String field_f;
    static int[] field_a;
    private int field_l;
    private long[] field_b;
    private int field_i;
    static ng[] field_e;
    private long[] field_k;
    private long[] field_j;

    final void a(byte[] param0, long param1, int param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
        var13 = TrackController.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -((int)param1 & 7) + 8 & 7;
          var7 = 7 & this.field_l;
          var9 = param1;
          if (param2 != 30654) {
            this.field_g = (byte[]) null;
          }
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((this.field_n[var11] & 255) + (255 & (int)var9));
            this.field_n[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param1 > 8L) {
            var8 = 255 & param0[var5_int] << var6 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
            if (var8 >= 0 &&
              256 > var8) {
              this.field_g[this.field_i] = (byte)ok.a((int) this.field_g[this.field_i], var8 >>> var7);
              this.field_i = this.field_i + 1;
              this.field_l = this.field_l + (8 - var7);
              if (this.field_l == 512) {
                this.b(-2);
                this.field_l = 0;
                this.field_i = 0;
              }
              this.field_g[this.field_i] = (byte)tc.a(255, var8 << 8 - var7);
              param1 = param1 - 8L;
              this.field_l = this.field_l + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param1 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = 255 & param0[var5_int] << var6;
            this.field_g[this.field_i] = (byte)ok.a((int) this.field_g[this.field_i], var8Lifetime1 >>> var7);
          }
          if ((long)var7 + param1 >= 8L) {
            this.field_i = this.field_i + 1;
            param1 = param1 - (long)(8 - var7);
            this.field_l = this.field_l + (-var7 + 8);
            if (this.field_l == 512) {
              this.b(-2);
              this.field_l = 0;
              this.field_i = 0;
            }
            this.field_g[this.field_i] = (byte)tc.a(255, var8Lifetime1 << -var7 + 8);
            this.field_l = this.field_l + (int)param1;
          } else {
            this.field_l = (int)((long)this.field_l + param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("bf.F(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_d = null;
        field_o = null;
        if (param0 >= -50) {
          field_d = (String) null;
        }
        field_e = null;
        field_c = null;
    }

    final static boolean a(boolean param0, byte param1) {
        long dupTemp$2 = 0L;
        if (null == ga.field_d) {
          ga.field_d = gf.field_o.a(79, ke.field_c, dc.field_o);
        }
        if (0 == ga.field_d.field_f) {
          return false;
        }
        dupTemp$2 = qg.a(false);
        qh.field_f = dupTemp$2;
        he.field_a = dupTemp$2;
        if (ga.field_d.field_f != 1) {
        }
        jc.field_a = oc.field_m;
        if (param1 < 31) {
          field_a = (int[]) null;
        }
        ga.field_d = null;
        return true;
    }

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          this.field_g[this.field_i] = (byte)ok.a((int) this.field_g[this.field_i], 128 >>> tc.a(this.field_l, 7));
          this.field_i = this.field_i + 1;
          if (param2 != -513) {
            return;
          }
          if (this.field_i > 32) {
            while (this.field_i < 64) {
              fieldTemp$0 = this.field_i;
              this.field_i = this.field_i + 1;
              this.field_g[fieldTemp$0] = (byte) 0;
            }
            this.b(-2);
            this.field_i = 0;
          }
          while (this.field_i < 32) {
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_g[fieldTemp$1] = (byte) 0;
          }
          pd.a(this.field_n, 0, this.field_g, 32, 32);
          this.b(-2);
          var4_int = 0;
          var5 = param1;
          while (8 > var4_int) {
            var6 = this.field_k[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[var5 + 2] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[var5 + 4] = (byte)(int)(var6 >>> 24);
            param0[var5 + 5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("bf.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_n[var2] = (byte) 0;
        }
        this.field_g[0] = (byte) 0;
        this.field_i = 0;
        this.field_l = 0;
        if (param0 != -11) {
          return;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_k[var2Lifetime1] = 0L;
        }
    }

    final static void a(byte param0, String param1) {
        try {
          kg.field_a = param1;
          if (param0 >= -23) {
            bf.a((byte) 1);
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "bf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) {
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
        var6 = TrackController.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (8 > var2) {
          this.field_h[var2] = ib.a(ib.a(ib.a(ib.a(al.a(255L, (long)this.field_g[var3 + 4]) << 24, ib.a(al.a((long)this.field_g[var3 + 3], 255L) << 32, ib.a(al.a(280375465082880L, (long)this.field_g[var3 + 2] << 40), ib.a(al.a((long)this.field_g[var3 + 1], 255L) << 48, (long)this.field_g[var3] << 56)))), al.a((long)this.field_g[var3 + 5] << 16, 16711680L)), al.a((long)this.field_g[var3 + 6], 255L) << 8), al.a((long)this.field_g[7 + var3], 255L));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          dupTemp$0 = this.field_k[var2Lifetime1];
          arrayValue$1 = this.field_h[var2Lifetime1];
          this.field_j[var2Lifetime1] = dupTemp$0;
          this.field_m[var2Lifetime1] = ib.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_b[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_b[var3Lifetime1] = ib.a(this.field_b[var3Lifetime1], lh.field_B[var4][tc.a(255, (int)(this.field_j[tc.a(7, var3Lifetime1 - var4)] >>> var5))]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_j[var3Lifetime1Lifetime1] = this.field_b[var3Lifetime1Lifetime1];
          }
          this.field_j[0] = ib.a(this.field_j[0], lh.field_D[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_b[var3Lifetime1Lifetime2] = this.field_j[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_b[var3Lifetime1Lifetime2] = ib.a(this.field_b[var3Lifetime1Lifetime2], lh.field_B[var7][tc.a((int)(this.field_m[tc.a(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_m[var3Lifetime1Lifetime3] = this.field_b[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_k[var2Lifetime3] = ib.a(this.field_k[var2Lifetime3], ib.a(this.field_h[var2Lifetime3], this.field_m[var2Lifetime3]));
        }
        if (param0 != -2) {
          this.field_i = 66;
        }
    }

    bf() {
        this.field_n = new byte[32];
        this.field_m = new long[8];
        this.field_h = new long[8];
        this.field_g = new byte[64];
        this.field_l = 0;
        this.field_b = new long[8];
        this.field_i = 0;
        this.field_k = new long[8];
        this.field_j = new long[8];
    }

    static {
        field_d = "Checking";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_a = new int[4];
    }
}
