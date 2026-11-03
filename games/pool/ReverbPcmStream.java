/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReverbPcmStream extends PcmStream {
    private int[] field_u;
    private float crossChannelGain;
    private PcmStream inputStream;
    private float dampingStep;
    private float dampingTimeMicros;
    private float field_v;
    private float sameChannelGain;
    private float wetGain;
    private ReverbCombFilter[] field_t;
    private float field_z;
    private float stereoWidth;
    private ReverbCombFilter[] field_x;
    private go[] field_E;
    private float field_p;
    private go[] field_F;

    final synchronized void a(float param0) {
        this.field_v = param0;
    }

    final int getSchedulingCost() {
        return 8;
    }

    final synchronized void setStereoWidth(float width) {
        this.stereoWidth = width;
        this.sameChannelGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f + this.stereoWidth) * 0.5));
        this.crossChannelGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f - this.stereoWidth) * 0.5));
    }

    final synchronized void skip(int length) {
        if (this.inputStream != null) {
          this.inputStream.skip(length);
        }
    }

    final synchronized void f(float param0) {
        this.field_z = param0;
    }

    final PcmStream firstChildStream() {
        return this.inputStream;
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$10 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        ReverbCombFilter var23;
        go var24;
        ReverbCombFilter var25;
        go var26;
        ReverbCombFilter var27;
        go var28;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var6Lifetime2Lifetime1;
        this.e();
        param2 = param2 + param1;
        while (param1 < param2) {
          var4 = param2 - param1;
          if (var4 > 256) {
            var4 = 256;
          }
          if (this.inputStream != null) {
            this.inputStream.mixInto(this.field_u, 0, var4);
          }
          var5 = 0;
          for (var6 = 0; var6 < 8; var6++) {
            var5 = ReverbPcmStream.a(var5, this.field_x[var6].delayBuffer, this.field_x[var6].delayIndex, var4);
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < 4; var6Lifetime1++) {
            var5 = ReverbPcmStream.a(var5, this.field_E[var6Lifetime1].field_a, this.field_E[var6Lifetime1].field_b, var4);
          }
          if (AudioOutput.stereo) {
            for (var6Lifetime2 = 0; var6Lifetime2 < 8; var6Lifetime2++) {
              var5 = ReverbPcmStream.a(var5, this.field_t[var6Lifetime2].delayBuffer, this.field_t[var6Lifetime2].delayIndex, var4);
            }
            for (var6Lifetime2Lifetime1 = 0; var6Lifetime2Lifetime1 < 4; var6Lifetime2Lifetime1++) {
              var5 = ReverbPcmStream.a(var5, this.field_F[var6Lifetime2Lifetime1].field_a, this.field_F[var6Lifetime2Lifetime1].field_b, var4);
            }
            var4 = var4 << 1;
            param1 = param1 << 1;
          }
          for (var6Lifetime3 = 0; var6Lifetime3 < var4; var6Lifetime3++) {
            var7 = this.field_u[var6Lifetime3];
            if (var7 > 0) {
              var7 = -var7;
            }
            if (var7 < var5) {
              var5 = var7;
            }
          }
          var6Lifetime4 = 0;
          while (var5 <= -4096) {
            var6Lifetime4++;
            var5 = var5 >> 1;
          }
          var7Lifetime1 = (int)(this.field_z * 4096.0f);
          var8 = (int)(this.dampingStep * 4096.0f);
          var9 = (int)(this.field_p * 4096.0f);
          var10 = (int)(this.field_v * 65536.0f);
          if (!AudioOutput.stereo) {
            var11 = (int)(this.wetGain * 4096.0f);
            for (var12 = 0; var12 < var4; var12++) {
              var13 = this.field_u[var12] >> var6Lifetime4;
              var14 = var13 * var10 >> 16;
              var15 = 0;
              for (var16 = 0; var16 < 8; var16++) {
                var27 = this.field_x[var16];
                var18 = var27.delayBuffer[var27.delayIndex] >> var6Lifetime4;
                var19 = var27.filteredSample >> var6Lifetime4;
                var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                var27.filteredSample = var19 << var6Lifetime4;
                var27.delayBuffer[var27.delayIndex] = var14 + (var19 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                fieldTemp$3 = var27.delayIndex + 1;
                var27.delayIndex = var27.delayIndex + 1;
                if (fieldTemp$3 >= var27.delayBuffer.length) {
                  var27.delayIndex = 0;
                }
                var15 = var15 + var18;
              }
              for (var16 = 0; var16 < 4; var16++) {
                var28 = this.field_E[var16];
                var18 = var28.field_a[var28.field_b] >> var6Lifetime4;
                var15 = var18 - var15;
                var28.field_a[var28.field_b] = var14 + (var18 * 2048 + 2048 >> 12) << var6Lifetime4;
                fieldTemp$2 = var28.field_b + 1;
                var28.field_b = var28.field_b + 1;
                if (fieldTemp$2 >= var28.field_a.length) {
                  var28.field_b = 0;
                }
              }
              if (var6Lifetime4 <= 12) {
                incrementValue$0 = param1;
                param1++;
                param0[incrementValue$0] = param0[incrementValue$0] + (var15 * var11 + var13 * var9 >> 12 - var6Lifetime4);
              } else {
                incrementValue$1 = param1;
                param1++;
                param0[incrementValue$1] = param0[incrementValue$1] + (var15 * var11 + var13 * var9 << var6Lifetime4 - 12);
              }
            }
          } else {
            var11 = (int)(this.sameChannelGain * 4096.0f);
            var12 = (int)(this.crossChannelGain * 4096.0f);
            var13 = 0;
            {
              while (!(var13 >= var4)) {
                incrementValue$4 = var13;
                var13++;
                var14 = this.field_u[incrementValue$4] >> var6Lifetime4;
                incrementValue$5 = var13;
                var13++;
                var15 = this.field_u[incrementValue$5] >> var6Lifetime4;
                var16 = (var14 + var15) * var10 >> 17;
                var17 = 0;
                for (var18 = 0; var18 < 8; var18++) {
                  var23 = this.field_x[var18];
                  var20 = var23.delayBuffer[var23.delayIndex] >> var6Lifetime4;
                  var21 = var23.filteredSample >> var6Lifetime4;
                  var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                  var23.filteredSample = var21 << var6Lifetime4;
                  var23.delayBuffer[var23.delayIndex] = var16 + (var21 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$13 = var23.delayIndex + 1;
                  var23.delayIndex = var23.delayIndex + 1;
                  if (fieldTemp$13 >= var23.delayBuffer.length) {
                    var23.delayIndex = 0;
                  }
                  var17 = var17 + var20;
                }
                for (var18 = 0; var18 < 4; var18++) {
                  var24 = this.field_E[var18];
                  var20Lifetime1 = var24.field_a[var24.field_b] >> var6Lifetime4;
                  var17 = var20Lifetime1 - var17;
                  var24.field_a[var24.field_b] = var16 + (var20Lifetime1 * 2048 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$12 = var24.field_b + 1;
                  var24.field_b = var24.field_b + 1;
                  if (fieldTemp$12 >= var24.field_a.length) {
                    var24.field_b = 0;
                  }
                }
                var18 = 0;
                for (var19 = 0; var19 < 8; var19++) {
                  var25 = this.field_t[var19];
                  var21Lifetime1 = var25.delayBuffer[var25.delayIndex] >> var6Lifetime4;
                  var22 = var25.filteredSample >> var6Lifetime4;
                  var22 = var22 + ((var21Lifetime1 - var22) * var8 + 2048 >> 12);
                  var25.filteredSample = var22 << var6Lifetime4;
                  var25.delayBuffer[var25.delayIndex] = var16 + (var22 * var7Lifetime1 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$11 = var25.delayIndex + 1;
                  var25.delayIndex = var25.delayIndex + 1;
                  if (fieldTemp$11 >= var25.delayBuffer.length) {
                    var25.delayIndex = 0;
                  }
                  var18 = var18 + var21Lifetime1;
                }
                for (var19 = 0; var19 < 4; var19++) {
                  var26 = this.field_F[var19];
                  var21Lifetime2 = var26.field_a[var26.field_b] >> var6Lifetime4;
                  var18 = var21Lifetime2 - var18;
                  var26.field_a[var26.field_b] = var16 + (var21Lifetime2 * 2048 + 2048 >> 12) << var6Lifetime4;
                  fieldTemp$10 = var26.field_b + 1;
                  var26.field_b = var26.field_b + 1;
                  if (fieldTemp$10 >= var26.field_a.length) {
                    var26.field_b = 0;
                  }
                }
                if (var6Lifetime4 <= 12) {
                  incrementValue$6 = param1;
                  param1++;
                  param0[incrementValue$6] = param0[incrementValue$6] + (var17 * var11 + var18 * var12 + var14 * var9 >> 12 - var6Lifetime4);
                  incrementValue$7 = param1;
                  param1++;
                  param0[incrementValue$7] = param0[incrementValue$7] + (var18 * var11 + var17 * var12 + var15 * var9 >> 12 - var6Lifetime4);
                  continue;
                }
                incrementValue$8 = param1;
                param1++;
                param0[incrementValue$8] = param0[incrementValue$8] + (var17 * var11 + var18 * var12 + var14 * var9 << var6Lifetime4 - 12);
                incrementValue$9 = param1;
                param1++;
                param0[incrementValue$9] = param0[incrementValue$9] + (var18 * var11 + var17 * var12 + var15 * var9 << var6Lifetime4 - 12);
              }
              {
                param1 = param1 >> 1;
              }
            }
          }
          if (this.inputStream == null) {
            continue;
          }
          ArrayOperations.clearInts(this.field_u, 0, var4);
        }
    }

    private final void e() {
        int var1;
        if (!AudioOutput.stereo) {
          if (this.field_t != null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.field_x[var1].clear();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.field_E[var1].a();
            }
            this.field_t = null;
            this.field_F = null;
            this.field_u = new int[256];
          }
        } else {
          if (this.field_t == null) {
            for (var1 = 0; var1 < 8; var1++) {
              this.field_x[var1].clear();
            }
            for (var1 = 0; var1 < 4; var1++) {
              this.field_E[var1].a();
            }
            this.field_t = new ReverbCombFilter[8];
            this.field_t[0] = new ReverbCombFilter(1139 * AudioOutput.sampleRate / 44100);
            this.field_t[1] = new ReverbCombFilter(1211 * AudioOutput.sampleRate / 44100);
            this.field_t[2] = new ReverbCombFilter(1300 * AudioOutput.sampleRate / 44100);
            this.field_t[3] = new ReverbCombFilter(1379 * AudioOutput.sampleRate / 44100);
            this.field_t[4] = new ReverbCombFilter(1445 * AudioOutput.sampleRate / 44100);
            this.field_t[5] = new ReverbCombFilter(1514 * AudioOutput.sampleRate / 44100);
            this.field_t[6] = new ReverbCombFilter(1580 * AudioOutput.sampleRate / 44100);
            this.field_t[7] = new ReverbCombFilter(1640 * AudioOutput.sampleRate / 44100);
            this.field_F = new go[4];
            this.field_F[0] = new go(579 * AudioOutput.sampleRate / 44100);
            this.field_F[1] = new go(464 * AudioOutput.sampleRate / 44100);
            this.field_F[2] = new go(364 * AudioOutput.sampleRate / 44100);
            this.field_F[3] = new go(248 * AudioOutput.sampleRate / 44100);
            this.field_u = new int[512];
          }
        }
    }

    final synchronized void setWetGain(float gain) {
        this.wetGain = gain;
        this.sameChannelGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f + this.stereoWidth) * 0.5));
        this.crossChannelGain = (float)((double)this.wetGain * Math.sqrt((double)(1.0f - this.stereoWidth) * 0.5));
    }

    final PcmStream nextChildStream() {
        return null;
    }

    final synchronized void setDampingTimeMicros(float halfLifeMicros) {
        this.dampingTimeMicros = halfLifeMicros;
        this.dampingStep = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(this.dampingTimeMicros * (float)AudioOutput.sampleRate));
    }

    private final static int a(int param0, int[] param1, int param2, int param3) {
        int var4 = 0;
        int var5;
        if (param3 > param1.length) {
          param3 = param1.length;
        }
        for (var4 = 0; var4 < param3; var4++) {
          var5 = param1[param2];
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

    final synchronized void d(float param0) {
        this.field_p = param0;
    }

    ReverbPcmStream(PcmStream param0) {
        this.field_x = new ReverbCombFilter[8];
        this.field_x[0] = new ReverbCombFilter(1116 * AudioOutput.sampleRate / 44100);
        this.field_x[1] = new ReverbCombFilter(1188 * AudioOutput.sampleRate / 44100);
        this.field_x[2] = new ReverbCombFilter(1277 * AudioOutput.sampleRate / 44100);
        this.field_x[3] = new ReverbCombFilter(1356 * AudioOutput.sampleRate / 44100);
        this.field_x[4] = new ReverbCombFilter(1422 * AudioOutput.sampleRate / 44100);
        this.field_x[5] = new ReverbCombFilter(1491 * AudioOutput.sampleRate / 44100);
        this.field_x[6] = new ReverbCombFilter(1557 * AudioOutput.sampleRate / 44100);
        this.field_x[7] = new ReverbCombFilter(1617 * AudioOutput.sampleRate / 44100);
        this.field_E = new go[4];
        this.field_E[0] = new go(556 * AudioOutput.sampleRate / 44100);
        this.field_E[1] = new go(441 * AudioOutput.sampleRate / 44100);
        this.field_E[2] = new go(341 * AudioOutput.sampleRate / 44100);
        this.field_E[3] = new go(225 * AudioOutput.sampleRate / 44100);
        if (!AudioOutput.stereo) {
          this.field_u = new int[256];
        }
        this.e();
        this.a(0.04500000178813934f);
        this.setWetGain(1.0f);
        this.f(0.8399999737739563f);
        this.d(1.0f);
        this.setDampingTimeMicros(7000.0f);
        this.setStereoWidth(1.0f);
        this.inputStream = param0;
    }
}
