/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pa {
    private long[] field_k;
    static boolean field_e;
    private byte[] field_m;
    private long[] field_f;
    private int field_g;
    static gk field_c;
    static gk field_i;
    private long[] field_o;
    private int field_j;
    private long[] field_h;
    static ae field_d;
    static java.awt.Font field_a;
    private byte[] field_l;
    static String field_b;
    private long[] field_n;

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
        var8 = Bounce.field_N;
        try {
          this.field_l[this.field_j] = (byte)ge.a((int) this.field_l[this.field_j], 128 >>> da.b(7, this.field_g));
          this.field_j = this.field_j + 1;
          if (this.field_j > 32) {
            while (this.field_j < 64) {
              fieldTemp$0 = this.field_j;
              this.field_j = this.field_j + 1;
              this.field_l[fieldTemp$0] = (byte) 0;
            }
            this.c(param1 - 54286);
            this.field_j = 0;
          }
          while (32 > this.field_j) {
            fieldTemp$1 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_l[fieldTemp$1] = (byte) 0;
          }
          cb.a(this.field_m, 0, this.field_l, 32, 32);
          this.c(-26394);
          if (param1 != 27892) {
            return;
          }
          var4_int = 0;
          var5 = param2;
          while (8 > var4_int) {
            var6 = this.field_n[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[var5 + 2] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[var5 + 5] = (byte)(int)(var6 >>> 16);
            param0[6 + var5] = (byte)(int)(var6 >>> 8);
            param0[7 + var5] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("pa.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Bounce.field_N;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        int var3 = 0;
        if (param1 != 7) {
          pa.b(-20);
        }
        long var4 = param0;
        while (0L != var4) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = li.field_c[(int)(-(37L * param0) + var7)];
          if (var9 == 95) {
            var10 = -1 + var6.length();
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 37) {
          field_b = (String) null;
        }
        field_i = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Bounce.field_N;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_m[var2] = (byte) 0;
        }
        this.field_l[0] = (byte) 0;
        this.field_j = 0;
        this.field_g = 0;
        var2Lifetime1 = 0;
        if (param0 != -28530) {
          byte[] var4 = (byte[]) null;
          this.a((byte[]) null, 51, 73);
        }
        while (var2Lifetime1 < 8) {
          this.field_n[var2Lifetime1] = 0L;
          var2Lifetime1++;
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Bounce.field_N;
        try {
          if (!fi.b(param0 + 21921)) {
            if (sj.field_f != null &&
              sj.field_f.field_f) {
              eh.a(true);
              kf.field_b.b(new nh(kf.field_b, jb.field_c), false);
            }
            return;
          }
          if (param0 != -65) {
            pa.b(110);
          }
          kf.field_b.a(aj.field_f, true, true, kl.field_t);
          kf.field_b.d((byte) 120);
          while (q.g((byte) -15)) {
            kf.field_b.a((byte) -90, lh.field_f, gk.field_d);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "pa.D(" + param0 + ')');
        }
    }

    private final void c(int param0) {
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
        var6 = Bounce.field_N;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_f[var2] = hf.a(tk.a((long)this.field_l[7 + var3], 255L), hf.a(hf.a(tk.a(255L, (long)this.field_l[var3 + 5]) << 16, hf.a(hf.a(tk.a(1095216660480L, (long)this.field_l[var3 + 3] << 32), hf.a(hf.a((long)this.field_l[var3] << 56, tk.a((long)this.field_l[1 + var3], 255L) << 48), tk.a(255L, (long)this.field_l[var3 + 2]) << 40)), tk.a(4278190080L, (long)this.field_l[4 + var3] << 24))), tk.a((long)this.field_l[6 + var3], 255L) << 8));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_n[var2Lifetime1];
          arrayValue$1 = this.field_f[var2Lifetime1];
          this.field_o[var2Lifetime1] = dupTemp$0;
          this.field_k[var2Lifetime1] = hf.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_h[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_h[var3Lifetime1] = hf.a(this.field_h[var3Lifetime1], eh.field_a[var4][da.b((int)(this.field_o[da.b(-var4 + var3Lifetime1, 7)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_o[var3Lifetime1Lifetime1] = this.field_h[var3Lifetime1Lifetime1];
          }
          this.field_o[0] = hf.a(this.field_o[0], eh.field_d[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_h[var3Lifetime1Lifetime2] = this.field_o[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_h[var3Lifetime1Lifetime2] = hf.a(this.field_h[var3Lifetime1Lifetime2], eh.field_a[var7][da.b((int)(this.field_k[da.b(-var7 + var3Lifetime1Lifetime2, 7)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.field_k[var3Lifetime1Lifetime3] = this.field_h[var3Lifetime1Lifetime3];
          }
        }
        var2Lifetime3 = 0;
        if (param0 != -26394) {
          this.field_f = (long[]) null;
        }
        while (var2Lifetime3 < 8) {
          this.field_n[var2Lifetime3] = hf.a(this.field_n[var2Lifetime3], hf.a(this.field_f[var2Lifetime3], this.field_k[var2Lifetime3]));
          var2Lifetime3++;
        }
    }

    final static void a(String param0, int param1, boolean param2, long param3, int param4, boolean param5, int param6, int param7, int param8, int param9, int param10, si param11, int param12, int param13) {
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
            if (param6 != 25342) {
              pa.a((byte) 46);
            }
            jc.field_g = new ii(param7);
            hh.field_p = new ii(param12);
            tc.field_t = param2;
            td.field_b = param1;
            mb.field_s = param3;
            pj.field_c = param11;
            nb.field_f = param4;
            of.field_c = param13;
            fi.field_b = param9;
            wa.field_b = param8;
            cf.field_a = param10;
            ba.field_B = param5;
            gk.field_h = param0;
            if (pj.field_c.field_v != null) {
              try {
                gf.field_g = new jf(pj.field_c.field_v, 64, 0);
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
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("pa.H(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            if (param11 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(long param0, byte[] param1, byte param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
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
        var13 = Bounce.field_N;
        try {
          var5_int = 0;
          var6 = 8 - ((int)param0 & 7) & 7;
          if (param2 < 33) {
            return;
          }
          var7 = this.field_g & 7;
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & (int)var9) + (255 & this.field_m[var11]));
            this.field_m[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param0 > 8L) {
            var8 = 255 & param1[var5_int] << var6 | (255 & param1[1 + var5_int]) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_l[this.field_j] = (byte)ge.a((int) this.field_l[this.field_j], var8 >>> var7);
              this.field_g = this.field_g + (8 - var7);
              this.field_j = this.field_j + 1;
              if (512 == this.field_g) {
                this.c(-26394);
                this.field_j = 0;
                this.field_g = 0;
              }
              this.field_l[this.field_j] = (byte)da.b(var8 << -var7 + 8, 255);
              var5_int++;
              param0 = param0 - 8L;
              this.field_g = this.field_g + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L >= param0) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = 255 & param1[var5_int] << var6;
            this.field_l[this.field_j] = (byte)ge.a((int) this.field_l[this.field_j], var8Lifetime1 >>> var7);
          }
          if (8L > (long)var7 + param0) {
            this.field_g = (int)((long)this.field_g + param0);
          } else {
            this.field_g = this.field_g + (-var7 + 8);
            this.field_j = this.field_j + 1;
            param0 = param0 - (long)(-var7 + 8);
            if (this.field_g == 512) {
              this.c(-26394);
              this.field_g = 0;
              this.field_j = 0;
            }
            this.field_l[this.field_j] = (byte)da.b(var8Lifetime1 << 8 - var7, 255);
            this.field_g = this.field_g + (int)param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("pa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
        }
    }

    pa() {
        this.field_m = new byte[32];
        this.field_k = new long[8];
        this.field_j = 0;
        this.field_g = 0;
        this.field_f = new long[8];
        this.field_h = new long[8];
        this.field_o = new long[8];
        this.field_l = new byte[64];
        this.field_n = new long[8];
    }

    static {
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
