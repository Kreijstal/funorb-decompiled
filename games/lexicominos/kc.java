/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kc {
    private long[] field_f;
    private int field_b;
    static int[] field_l;
    private long[] field_a;
    private byte[] field_g;
    private byte[] field_k;
    static int field_c;
    private int field_i;
    private long[] field_j;
    static byte[] field_d;
    static ke[] field_m;
    private long[] field_h;
    private long[] field_e;

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != jc.field_b && (0 > param0 ||
            gg.field_b == uf.field_m)) {
            if (ed.field_q.field_h == 0 &&
              rf.c(0) > p.field_c + 10000L) {
              ed.field_q.h(param0, ~param1);
            }
            if (~ed.field_q.field_h < param1) {
              try {
                jc.field_b.a(ed.field_q.field_j, ed.field_q.field_h, 120, 0);
                p.field_c = rf.c(0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                ck.$cfr$intArgs$b$e683eeaaf5b5(-37);
              }
              ed.field_q.field_h = 0;
            }
            return;
          }
          ed.field_q.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_m = null;
        field_d = null;
        field_l = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        int var11 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_104_0 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_117_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var22 = Lexicominos.field_L ? 1 : 0;
        try {
          var10_int = -(param1 >> 2);
          param1 = -(param1 & 3);
          if (param6 != 8) {
            field_c = 87;
          }
          for (var11 = -param0; var11 < 0; var11++) {
            for (var12 = var10_int; var12 < 0; var12++) {
              param4 = param8[param3++];
              if (0 == param4) {
                param7++;
              } else {
                var13 = 255 & param4 >> 16;
                var14 = param4 >> 8 & 255;
                var15 = 255 & param4;
                var16 = param2[param7];
                var17 = (16768750 & var16) >> 16;
                var18 = 15 & var16 >> 8;
                var19 = var16 & 255;
                if (var14 < var13) {
                  stackIn_15_0 = (var15 < var13) ? var13 : var15;
                } else {
                  stackIn_15_0 = (var14 > var15) ? var14 : var15;
                }
                var20 = stackIn_15_0;
                if (var18 >= var17) {
                  stackIn_22_0 = (var19 >= var18) ? var19 : var18;
                } else {
                  stackIn_22_0 = (var17 > var19) ? var17 : var19;
                }
                var21 = stackIn_22_0;
                if (var20 > var21) {
                  param4 = var21 * var14 / var20 << 8 | var21 * var13 / var20 << 16 | var21 * var15 / var20;
                }
                param2[param7++] = param4;
              }
              param4 = param8[param3++];
              if (0 == param4) {
                param7++;
              } else {
                var13Lifetime2 = (param4 & 16771522) >> 16;
                var14Lifetime2 = (param4 & 65535) >> 8;
                var15Lifetime2 = param4 & 255;
                var16Lifetime2 = param2[param7];
                var17Lifetime2 = (16751732 & var16Lifetime2) >> 16;
                var18Lifetime2 = (3998 & var16Lifetime2) >> 8;
                var19Lifetime2 = 255 & var16Lifetime2;
                if (var13Lifetime2 <= var14Lifetime2) {
                  stackIn_35_0 = (var14Lifetime2 <= var15Lifetime2) ? var15Lifetime2 : var14Lifetime2;
                } else {
                  stackIn_35_0 = (var13Lifetime2 > var15Lifetime2) ? var13Lifetime2 : var15Lifetime2;
                }
                var20Lifetime2 = stackIn_35_0;
                if (var18Lifetime2 < var17Lifetime2) {
                  stackIn_42_0 = (var17Lifetime2 > var19Lifetime2) ? var17Lifetime2 : var19Lifetime2;
                } else {
                  stackIn_42_0 = (var19Lifetime2 < var18Lifetime2) ? var18Lifetime2 : var19Lifetime2;
                }
                var21Lifetime2 = stackIn_42_0;
                if (var20Lifetime2 > var21Lifetime2) {
                  param4 = var13Lifetime2 * var21Lifetime2 / var20Lifetime2 << 16 | var21Lifetime2 * var14Lifetime2 / var20Lifetime2 << 8 | var15Lifetime2 * var21Lifetime2 / var20Lifetime2;
                }
                param2[param7++] = param4;
              }
              param4 = param8[param3++];
              if (param4 != 0) {
                var13Lifetime3 = (16730233 & param4) >> 16;
                var14Lifetime3 = (param4 & 65406) >> 8;
                var15Lifetime3 = param4 & 255;
                var16Lifetime3 = param2[param7];
                var17Lifetime3 = (var16Lifetime3 & 16775412) >> 16;
                var18Lifetime3 = (var16Lifetime3 & 4043) >> 8;
                var19Lifetime3 = var16Lifetime3 & 255;
                if (var13Lifetime3 > var14Lifetime3) {
                  stackIn_55_0 = (var15Lifetime3 >= var13Lifetime3) ? var15Lifetime3 : var13Lifetime3;
                } else {
                  stackIn_55_0 = (var14Lifetime3 <= var15Lifetime3) ? var15Lifetime3 : var14Lifetime3;
                }
                var20Lifetime3 = stackIn_55_0;
                if (var18Lifetime3 < var17Lifetime3) {
                  stackIn_62_0 = (var17Lifetime3 <= var19Lifetime3) ? var19Lifetime3 : var17Lifetime3;
                } else {
                  stackIn_62_0 = (var18Lifetime3 <= var19Lifetime3) ? var19Lifetime3 : var18Lifetime3;
                }
                var21Lifetime3 = stackIn_62_0;
                if (var20Lifetime3 > var21Lifetime3) {
                  param4 = var15Lifetime3 * var21Lifetime3 / var20Lifetime3 | (var13Lifetime3 * var21Lifetime3 / var20Lifetime3 << 16 | var14Lifetime3 * var21Lifetime3 / var20Lifetime3 << 8);
                }
                param2[param7++] = param4;
              } else {
                param7++;
              }
              param4 = param8[param3++];
              if (param4 == 0) {
                param7++;
              } else {
                var13Lifetime4 = 255 & param4 >> 16;
                var14Lifetime4 = (65473 & param4) >> 8;
                var15Lifetime4 = 255 & param4;
                var16Lifetime4 = param2[param7];
                var17Lifetime4 = 255 & var16Lifetime4 >> 16;
                var18Lifetime4 = 15 & var16Lifetime4 >> 8;
                var19Lifetime4 = 255 & var16Lifetime4;
                if (var14Lifetime4 >= var13Lifetime4) {
                  stackIn_73_0 = (var14Lifetime4 > var15Lifetime4) ? var14Lifetime4 : var15Lifetime4;
                } else {
                  stackIn_73_0 = (var13Lifetime4 > var15Lifetime4) ? var13Lifetime4 : var15Lifetime4;
                }
                var20Lifetime4 = stackIn_73_0;
                if (var18Lifetime4 < var17Lifetime4) {
                  stackIn_80_0 = (var19Lifetime4 >= var17Lifetime4) ? var19Lifetime4 : var17Lifetime4;
                } else {
                  stackIn_80_0 = (var19Lifetime4 >= var18Lifetime4) ? var19Lifetime4 : var18Lifetime4;
                }
                var21Lifetime4 = stackIn_80_0;
                if (var21Lifetime4 < var20Lifetime4) {
                  param4 = var15Lifetime4 * var21Lifetime4 / var20Lifetime4 | (var21Lifetime4 * var14Lifetime4 / var20Lifetime4 << 8 | var21Lifetime4 * var13Lifetime4 / var20Lifetime4 << 16);
                }
                param2[param7++] = param4;
              }
            }
            for (var12Lifetime1 = param1; var12Lifetime1 < 0; var12Lifetime1++) {
              param4 = param8[param3++];
              if (0 != param4) {
                var13Lifetime1 = 255 & param4 >> 16;
                var14Lifetime1 = (65290 & param4) >> 8;
                var15Lifetime1 = 255 & param4;
                var16Lifetime1 = param2[param7];
                var17Lifetime1 = (16754807 & var16Lifetime1) >> 16;
                var18Lifetime1 = var16Lifetime1 >> 8 & 15;
                var19Lifetime1 = var16Lifetime1 & 255;
                if (var13Lifetime1 > var14Lifetime1) {
                  stackIn_97_0 = (var13Lifetime1 > var15Lifetime1) ? var13Lifetime1 : var15Lifetime1;
                } else {
                  stackIn_97_0 = (var15Lifetime1 < var14Lifetime1) ? var14Lifetime1 : var15Lifetime1;
                }
                var20Lifetime1 = stackIn_97_0;
                if (var18Lifetime1 >= var17Lifetime1) {
                  stackIn_104_0 = (var18Lifetime1 > var19Lifetime1) ? var18Lifetime1 : var19Lifetime1;
                } else {
                  stackIn_104_0 = (var19Lifetime1 >= var17Lifetime1) ? var19Lifetime1 : var17Lifetime1;
                }
                var21Lifetime1 = stackIn_104_0;
                if (var21Lifetime1 < var20Lifetime1) {
                  param4 = var15Lifetime1 * var21Lifetime1 / var20Lifetime1 | (var13Lifetime1 * var21Lifetime1 / var20Lifetime1 << 16 | var21Lifetime1 * var14Lifetime1 / var20Lifetime1 << 8);
                }
                param2[param7++] = param4;
              } else {
                param7++;
              }
            }
            param3 = param3 + param5;
            param7 = param7 + param9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_113_0 = var10;
          stackIn_113_1 = new StringBuilder().append("kc.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          stackIn_116_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_117_2 = "null";
          } else {
            stackIn_117_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_116_1).append(stackIn_117_2).append(',').append(param9).append(')').toString());
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
        byte[] var7;
        int var8;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = Lexicominos.field_L ? 1 : 0;
        var2 = 0;
        if (param0 > -111) {
          var7 = (byte[]) null;
          this.a(-93L, (byte[]) null, 126);
        }
        var3 = 0;
        while (8 > var2) {
          this.field_h[var2] = qg.a(qg.a(tf.a(255L, (long)this.field_k[var3 + 6]) << 8, qg.a(qg.a(qg.a(qg.a(tf.a((long)this.field_k[2 + var3] << 40, 280375465082880L), qg.a((long)this.field_k[var3] << 56, tf.a(71776119061217280L, (long)this.field_k[var3 + 1] << 48))), tf.a(1095216660480L, (long)this.field_k[var3 + 3] << 32)), tf.a((long)this.field_k[var3 + 4], 255L) << 24), tf.a((long)this.field_k[var3 + 5] << 16, 16711680L))), tf.a((long)this.field_k[7 + var3], 255L));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_e[var2Lifetime1];
          arrayValue$1 = this.field_h[var2Lifetime1];
          this.field_j[var2Lifetime1] = dupTemp$0;
          this.field_f[var2Lifetime1] = qg.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_a[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_a[var3Lifetime1] = qg.a(this.field_a[var3Lifetime1], fb.field_j[var4][vg.a((int)(this.field_j[vg.a(var3Lifetime1 - var4, 7)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_j[var3Lifetime1Lifetime1] = this.field_a[var3Lifetime1Lifetime1];
          }
          this.field_j[0] = qg.a(this.field_j[0], fb.field_o[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_a[var3Lifetime1Lifetime2] = this.field_j[var3Lifetime1Lifetime2];
            var8 = 0;
            var4Lifetime1 = var8;
            var5Lifetime1 = 56;
            while (var8 < 8) {
              this.field_a[var3Lifetime1Lifetime2] = qg.a(this.field_a[var3Lifetime1Lifetime2], fb.field_j[var8][vg.a(255, (int)(this.field_f[vg.a(var3Lifetime1Lifetime2 - var8, 7)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var8++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_f[var3Lifetime1Lifetime3] = this.field_a[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; 8 > var2Lifetime3; var2Lifetime3++) {
          this.field_e[var2Lifetime3] = qg.a(this.field_e[var2Lifetime3], qg.a(this.field_h[var2Lifetime3], this.field_f[var2Lifetime3]));
        }
    }

    final void a(int param0, boolean param1, byte[] param2) {
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
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], 128 >>> vg.a(7, this.field_b));
          this.field_i = this.field_i + 1;
          if (this.field_i > 32) {
            while (this.field_i < 64) {
              fieldTemp$0 = this.field_i;
              this.field_i = this.field_i + 1;
              this.field_k[fieldTemp$0] = (byte) 0;
            }
            this.b((byte) -127);
            this.field_i = 0;
          }
          while (this.field_i < 32) {
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_k[fieldTemp$1] = (byte) 0;
          }
          o.a(this.field_g, 0, this.field_k, 32, 32);
          this.b((byte) -122);
          var4_int = 0;
          if (param1) {
            return;
          }
          var5 = param0;
          while (var4_int < 8) {
            var6 = this.field_e[var4_int];
            param2[var5] = (byte)(int)(var6 >>> 56);
            param2[1 + var5] = (byte)(int)(var6 >>> 48);
            param2[var5 + 2] = (byte)(int)(var6 >>> 40);
            param2[3 + var5] = (byte)(int)(var6 >>> 32);
            param2[4 + var5] = (byte)(int)(var6 >>> 24);
            param2[5 + var5] = (byte)(int)(var6 >>> 16);
            param2[var5 + 6] = (byte)(int)(var6 >>> 8);
            param2[7 + var5] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("kc.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void a(long param0, byte[] param1, int param2) {
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
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 7 & 8 - ((int)param0 & 7);
          var7 = 7 & this.field_b;
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & this.field_g[var11]) + (255 & (int)var9));
            this.field_g[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          if (param2 != -24893) {
            this.field_a = (long[]) null;
          }
          while (8L < param0) {
            var8 = 255 & param1[var5_int] << var6 | (param1[1 + var5_int] & 255) >>> 8 - var6;
            if (0 <= var8 &&
              var8 < 256) {
              this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], var8 >>> var7);
              this.field_i = this.field_i + 1;
              this.field_b = this.field_b + (8 - var7);
              if (this.field_b == 512) {
                this.b((byte) -120);
                this.field_i = 0;
                this.field_b = 0;
              }
              this.field_k[this.field_i] = (byte)vg.a(var8 << -var7 + 8, 255);
              param0 = param0 - 8L;
              var5_int++;
              this.field_b = this.field_b + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param0 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = param1[var5_int] << var6 & 255;
            this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], var8Lifetime1 >>> var7);
          }
          if ((long)var7 + param0 >= 8L) {
            param0 = param0 - (long)(-var7 + 8);
            this.field_i = this.field_i + 1;
            this.field_b = this.field_b + (-var7 + 8);
            if (this.field_b == 512) {
              this.b((byte) -119);
              this.field_i = 0;
              this.field_b = 0;
            }
            this.field_k[this.field_i] = (byte)vg.a(var8Lifetime1 << 8 - var7, 255);
            this.field_b = this.field_b + (int)param0;
          } else {
            this.field_b = (int)((long)this.field_b + param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("kc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        int var2Lifetime1;
        if (param0 < 109) {
          field_d = (byte[]) null;
        }
        for (var2 = 0; var2 < 32; var2++) {
          this.field_g[var2] = (byte) 0;
        }
        this.field_i = 0;
        this.field_b = 0;
        this.field_k[0] = (byte) 0;
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          this.field_e[var2Lifetime1] = 0L;
        }
    }

    kc() {
        this.field_a = new long[8];
        this.field_b = 0;
        this.field_k = new byte[64];
        this.field_f = new long[8];
        this.field_j = new long[8];
        this.field_i = 0;
        this.field_g = new byte[32];
        this.field_e = new long[8];
        this.field_h = new long[8];
    }

    static {
        field_l = new int[8192];
        field_m = new ke[10];
    }
}
