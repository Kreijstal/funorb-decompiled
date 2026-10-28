/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReverbPcmStream extends PcmStream {
    private float field_q;
    private float field_k;
    private ReverbAllPassFilter[] field_v;
    private float field_n;
    private ReverbAllPassFilter[] field_l;
    private float field_m;
    private float field_w;
    private ReverbCombFilter[] field_y;
    private int[] field_t;
    private PcmStream field_r;
    private float field_o;
    private float field_u;
    private float field_x;
    private ReverbCombFilter[] field_s;
    private float field_p;

    final synchronized void mixInto(int[] samples, int offset, int length) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var18;
        int var19;
        this.e();
        length = length + offset;
        while (offset < length) {
          int var4 = length - offset;
          if (var4 > 256) {
            var4 = 256;
          }
          if (this.field_r != null) {
            this.field_r.mixInto(this.field_t, 0, var4);
          }
          int var5 = 0;
          for (int var6 = 0; var6 < 8; var6++) {
            var5 = ReverbPcmStream.a(var5, this.field_s[var6].delayBuffer, this.field_s[var6].delayIndex, var4);
          }
          for (int var6Lifetime1 = 0; var6Lifetime1 < 4; var6Lifetime1++) {
            var5 = ReverbPcmStream.a(var5, this.field_l[var6Lifetime1].delayBuffer, this.field_l[var6Lifetime1].delayIndex, var4);
          }
          if (AudioOutput.field_o) {
            for (int var6Lifetime2 = 0; var6Lifetime2 < 8; var6Lifetime2++) {
              var5 = ReverbPcmStream.a(var5, this.field_y[var6Lifetime2].delayBuffer, this.field_y[var6Lifetime2].delayIndex, var4);
            }
            for (int var6Lifetime2Lifetime1 = 0; var6Lifetime2Lifetime1 < 4; var6Lifetime2Lifetime1++) {
              var5 = ReverbPcmStream.a(var5, this.field_v[var6Lifetime2Lifetime1].delayBuffer, this.field_v[var6Lifetime2Lifetime1].delayIndex, var4);
            }
            var4 = var4 << 1;
            offset = offset << 1;
          }
          for (int var6Lifetime3 = 0; var6Lifetime3 < var4; var6Lifetime3++) {
            int var7 = this.field_t[var6Lifetime3];
            if (var7 > 0) {
              var7 = -var7;
            }
            if (var7 < var5) {
              var5 = var7;
            }
          }
          int var6Lifetime4 = 0;
          while (var5 <= -4096) {
            var6Lifetime4++;
            var5 = var5 >> 1;
          }
          int var7Lifetime1 = (int)(this.field_k * 4096.0f);
          int var8 = (int)(this.field_p * 4096.0f);
          int var9 = (int)(this.field_o * 4096.0f);
          int var10 = (int)(this.field_x * 65536.0f);
          if (!AudioOutput.field_o) {
            var11 = (int)(this.field_n * 4096.0f);
            for (var12 = 0; var12 < var4; var12++) {
              var13 = this.field_t[var12] >> var6Lifetime4;
              var14 = var13 * var10 >> 16;
              var15 = 0;
              for (var16 = 0; var16 < 8; var16++) {
                ReverbCombFilter var27 = this.field_s[var16];
                var18 = var27.delayBuffer[var27.delayIndex] >> var6Lifetime4;
                var19 = var27.filteredSample >> var6Lifetime4;
                var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                var27.filteredSample = var19 << var6Lifetime4;
                var27.delayBuffer[var27.delayIndex] = var14 + (var19 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                int fieldTemp$3 = var27.delayIndex + 1;
                var27.delayIndex = var27.delayIndex + 1;
                if (fieldTemp$3 >= var27.delayBuffer.length) {
                  var27.delayIndex = 0;
                }
                var15 = var15 + var18;
              }
              for (var16 = 0; var16 < 4; var16++) {
                ReverbAllPassFilter var28 = this.field_l[var16];
                var18 = var28.delayBuffer[var28.delayIndex] >> var6Lifetime4;
                var15 = var18 - var15;
                var28.delayBuffer[var28.delayIndex] = var14 + (var18 * 2048 + 2048 >> 12) << var6Lifetime4;
                int fieldTemp$2 = var28.delayIndex + 1;
                var28.delayIndex = var28.delayIndex + 1;
                if (fieldTemp$2 >= var28.delayBuffer.length) {
                  var28.delayIndex = 0;
                }
              }
              if (var6Lifetime4 <= 12) {
                int incrementValue$0 = offset;
                offset++;
                samples[incrementValue$0] = samples[incrementValue$0] + (var15 * var11 + var13 * var9 >> 12 - var6Lifetime4);
              } else {
                int incrementValue$1 = offset;
                offset++;
                samples[incrementValue$1] = samples[incrementValue$1] + (var15 * var11 + var13 * var9 << var6Lifetime4 - 12);
              }
            }
          } else {
            var11 = (int)(this.field_w * 4096.0f);
            var12 = (int)(this.field_q * 4096.0f);
            var13 = 0;
            {
              while (!(var13 >= var4)) {
                int incrementValue$4 = var13;
                var13++;
                var14 = this.field_t[incrementValue$4] >> var6Lifetime4;
                int incrementValue$5 = var13;
                var13++;
                var15 = this.field_t[incrementValue$5] >> var6Lifetime4;
                var16 = (var14 + var15) * var10 >> 17;
                int var17 = 0;
                for (var18 = 0; var18 < 8; var18++) {
                  ReverbCombFilter var23 = this.field_s[var18];
                  int var20 = var23.delayBuffer[var23.delayIndex] >> var6Lifetime4;
                  int var21 = var23.filteredSample >> var6Lifetime4;
                  var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                  var23.filteredSample = var21 << var6Lifetime4;
                  var23.delayBuffer[var23.delayIndex] = var16 + (var21 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$13 = var23.delayIndex + 1;
                  var23.delayIndex = var23.delayIndex + 1;
                  if (fieldTemp$13 >= var23.delayBuffer.length) {
                    var23.delayIndex = 0;
                  }
                  var17 = var17 + var20;
                }
                for (var18 = 0; var18 < 4; var18++) {
                  ReverbAllPassFilter var24 = this.field_l[var18];
                  int var20Lifetime1 = var24.delayBuffer[var24.delayIndex] >> var6Lifetime4;
                  var17 = var20Lifetime1 - var17;
                  var24.delayBuffer[var24.delayIndex] = var16 + (var20Lifetime1 * 2048 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$12 = var24.delayIndex + 1;
                  var24.delayIndex = var24.delayIndex + 1;
                  if (fieldTemp$12 >= var24.delayBuffer.length) {
                    var24.delayIndex = 0;
                  }
                }
                var18 = 0;
                for (var19 = 0; var19 < 8; var19++) {
                  ReverbCombFilter var25 = this.field_y[var19];
                  int var21Lifetime1 = var25.delayBuffer[var25.delayIndex] >> var6Lifetime4;
                  int var22 = var25.filteredSample >> var6Lifetime4;
                  var22 = var22 + ((var21Lifetime1 - var22) * var8 + 2048 >> 12);
                  var25.filteredSample = var22 << var6Lifetime4;
                  var25.delayBuffer[var25.delayIndex] = var16 + (var22 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$11 = var25.delayIndex + 1;
                  var25.delayIndex = var25.delayIndex + 1;
                  if (fieldTemp$11 >= var25.delayBuffer.length) {
                    var25.delayIndex = 0;
                  }
                  var18 = var18 + var21Lifetime1;
                }
                for (var19 = 0; var19 < 4; var19++) {
                  ReverbAllPassFilter var26 = this.field_v[var19];
                  int var21Lifetime2 = var26.delayBuffer[var26.delayIndex] >> var6Lifetime4;
                  var18 = var21Lifetime2 - var18;
                  var26.delayBuffer[var26.delayIndex] = var16 + (var21Lifetime2 * 2048 + 2048 >> 12) << var6Lifetime4;
                  int fieldTemp$10 = var26.delayIndex + 1;
                  var26.delayIndex = var26.delayIndex + 1;
                  if (fieldTemp$10 >= var26.delayBuffer.length) {
                    var26.delayIndex = 0;
                  }
                }
                if (var6Lifetime4 <= 12) {
                  int incrementValue$6 = offset;
                  offset++;
                  samples[incrementValue$6] = samples[incrementValue$6] + (var17 * var11 + var18 * var12 + var14 * var9 >> 12 - var6Lifetime4);
                  int incrementValue$7 = offset;
                  offset++;
                  samples[incrementValue$7] = samples[incrementValue$7] + (var18 * var11 + var17 * var12 + var15 * var9 >> 12 - var6Lifetime4);
                  continue;
                }
                int incrementValue$8 = offset;
                offset++;
                samples[incrementValue$8] = samples[incrementValue$8] + (var17 * var11 + var18 * var12 + var14 * var9 << var6Lifetime4 - 12);
                int incrementValue$9 = offset;
                offset++;
                samples[incrementValue$9] = samples[incrementValue$9] + (var18 * var11 + var17 * var12 + var15 * var9 << var6Lifetime4 - 12);
              }
              {
                offset = offset >> 1;
              }
            }
          }
          if (this.field_r == null) {
            continue;
          }
          qg.a(this.field_t, 0, var4);
        }
    }

    private final synchronized void a(float param0) {
        this.field_u = param0;
        this.field_w = (float)((double)this.field_n * Math.sqrt((double)(1.0f + this.field_u) * 0.5));
        this.field_q = (float)((double)this.field_n * Math.sqrt((double)(1.0f - this.field_u) * 0.5));
    }

    final PcmStream firstSubstream() {
        return this.field_r;
    }

    private final static int a(int param0, int[] param1, int param2, int param3) {
        if (param3 > param1.length) {
          param3 = param1.length;
        }
        for (int var4 = 0; var4 < param3; var4++) {
          int var5 = param1[param2];
          if (var5 > 0) {
            var5 = -var5;
          }
          if (var5 < param0) {
            param0 = var5;
          }
          param2++;
          if (param2 == param1.length) {
            param2 = 0;
          }
        }
        return param0;
    }

    private final synchronized void c(float param0) {
        this.field_o = param0;
    }

    final synchronized void skip(int length) {
        if (this.field_r != null) {
          this.field_r.skip(length);
        }
    }

    private final synchronized void f(float param0) {
        this.field_n = param0;
        this.field_w = (float)((double)this.field_n * Math.sqrt((double)(1.0f + this.field_u) * 0.5));
        this.field_q = (float)((double)this.field_n * Math.sqrt((double)(1.0f - this.field_u) * 0.5));
    }

    private final synchronized void e(float param0) {
        this.field_x = param0;
    }

    private final void e() {
        int var1;
        if (!AudioOutput.field_o) {
          if (this.field_y != null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.field_s[var1].clear();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.field_l[var1].clear();
            }
            this.field_y = null;
            this.field_v = null;
            this.field_t = new int[256];
          }
        } else if (this.field_y == null) {
          for (var1 = 0; var1 < 8; var1++) {
            this.field_s[var1].clear();
          }
          for (var1 = 0; var1 < 4; var1++) {
            this.field_l[var1].clear();
          }
          this.field_y = new ReverbCombFilter[8];
          this.field_y[0] = new ReverbCombFilter(1139 * AudioOutput.field_q / 44100);
          this.field_y[1] = new ReverbCombFilter(1211 * AudioOutput.field_q / 44100);
          this.field_y[2] = new ReverbCombFilter(1300 * AudioOutput.field_q / 44100);
          this.field_y[3] = new ReverbCombFilter(1379 * AudioOutput.field_q / 44100);
          this.field_y[4] = new ReverbCombFilter(1445 * AudioOutput.field_q / 44100);
          this.field_y[5] = new ReverbCombFilter(1514 * AudioOutput.field_q / 44100);
          this.field_y[6] = new ReverbCombFilter(1580 * AudioOutput.field_q / 44100);
          this.field_y[7] = new ReverbCombFilter(1640 * AudioOutput.field_q / 44100);
          this.field_v = new ReverbAllPassFilter[4];
          this.field_v[0] = new ReverbAllPassFilter(579 * AudioOutput.field_q / 44100);
          this.field_v[1] = new ReverbAllPassFilter(464 * AudioOutput.field_q / 44100);
          this.field_v[2] = new ReverbAllPassFilter(364 * AudioOutput.field_q / 44100);
          this.field_v[3] = new ReverbAllPassFilter(248 * AudioOutput.field_q / 44100);
          this.field_t = new int[512];
        }
    }

    final synchronized void b(float param0) {
        this.field_m = param0;
        this.field_p = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(this.field_m * (float)AudioOutput.field_q));
    }

    final PcmStream nextSubstream() {
        return null;
    }

    final synchronized void d(float param0) {
        this.field_k = param0;
    }

    final int activity() {
        return 8;
    }

    ReverbPcmStream(PcmStream param0) {
        this.field_s = new ReverbCombFilter[8];
        this.field_s[0] = new ReverbCombFilter(1116 * AudioOutput.field_q / 44100);
        this.field_s[1] = new ReverbCombFilter(1188 * AudioOutput.field_q / 44100);
        this.field_s[2] = new ReverbCombFilter(1277 * AudioOutput.field_q / 44100);
        this.field_s[3] = new ReverbCombFilter(1356 * AudioOutput.field_q / 44100);
        this.field_s[4] = new ReverbCombFilter(1422 * AudioOutput.field_q / 44100);
        this.field_s[5] = new ReverbCombFilter(1491 * AudioOutput.field_q / 44100);
        this.field_s[6] = new ReverbCombFilter(1557 * AudioOutput.field_q / 44100);
        this.field_s[7] = new ReverbCombFilter(1617 * AudioOutput.field_q / 44100);
        this.field_l = new ReverbAllPassFilter[4];
        this.field_l[0] = new ReverbAllPassFilter(556 * AudioOutput.field_q / 44100);
        this.field_l[1] = new ReverbAllPassFilter(441 * AudioOutput.field_q / 44100);
        this.field_l[2] = new ReverbAllPassFilter(341 * AudioOutput.field_q / 44100);
        this.field_l[3] = new ReverbAllPassFilter(225 * AudioOutput.field_q / 44100);
        if (!AudioOutput.field_o) {
          this.field_t = new int[256];
        }
        this.e();
        this.e(0.04500000178813934f);
        this.f(1.0f);
        this.d(0.8399999737739563f);
        this.c(1.0f);
        this.b(7000.0f);
        this.a(1.0f);
        this.field_r = param0;
    }
}
