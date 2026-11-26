/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    int[] field_u;
    private int field_h;
    private PcmStream field_m;
    private static int field_q;
    private static PcmOutputWorker field_j;
    static boolean field_b;
    private long field_l;
    private boolean field_s;
    private int field_c;
    private int field_d;
    static int field_g;
    private long field_p;
    private PcmStream[] field_k;
    private long field_e;
    private int field_i;
    private int field_t;
    private int field_f;
    private int field_n;
    private int field_r;
    private boolean field_o;
    private PcmStream[] field_a;

    void closeDevice() {
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_s) {
            return;
          }
          var1 = hn.correctedCurrentTimeMillis((byte) 80);
          try {
            if (var1 > this.field_l + 6000L) {
              this.field_l = var1 - 6000L;
            }
            while (var1 > this.field_l + 5000L) {
              this.skipFrames(256);
              this.field_l = this.field_l + (long)(256000 / field_g);
              var1 = hn.correctedCurrentTimeMillis((byte) 80);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_l = var1;
          }
          if (this.field_u == null) {
            return;
          }
          try {
            if (this.field_p != 0L) {
              if (var1 < this.field_p) {
                return;
              }
              this.openDevice(this.field_t);
              this.field_p = 0L;
              this.field_o = true;
            }
            var3_int = this.getQueuedFrames();
            if (this.field_f - var3_int > this.field_c) {
              this.field_c = this.field_f - var3_int;
            }
            var4 = this.field_r + this.field_i;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_t) {
              this.field_t = this.field_t + 1024;
              if (this.field_t > 16384) {
                this.field_t = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_t);
              var3_int = 0;
              this.field_o = true;
              if (var4 + 256 > this.field_t) {
                var4 = this.field_t - 256;
                this.field_i = var4 - this.field_r;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.field_u, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_e) {
              if (this.field_o) {
                this.field_o = false;
              } else {
                if (this.field_c == 0 &&
                  this.field_n == 0) {
                  this.closeDevice();
                  this.field_p = var1 + 2000L;
                  return;
                }
                this.field_i = Math.min(this.field_n, this.field_c);
                this.field_n = this.field_c;
              }
              this.field_c = 0;
              this.field_e = var1 + 2000L;
            }
            this.field_f = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.field_p = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static AudioOutput createOutput(PlatformTaskDispatcher param0, java.awt.Component param1, int param2, int param3) {
        try {
          JavaSoundAudioOutput var4 = null;
          Throwable var4_ref = null;
          JavaSoundAudioOutput var5 = null;
          JavaSoundAudioOutput stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          JavaSoundAudioOutput stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_g == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new JavaSoundAudioOutput();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_b) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((AudioOutput) ((Object) stackIn_10_0)).field_u = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).field_r = param3;
              ((AudioOutput) ((Object) var4)).initializeDevice(param1);
              ((AudioOutput) ((Object) var4)).field_t = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).field_t > 16384) {
                ((AudioOutput) ((Object) var4)).field_t = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).field_t);
              if (field_q > 0 &&
                field_j == null) {
                field_j = new PcmOutputWorker();
                field_j.field_b = param0;
                param0.requestThreadStart(field_q, (Runnable) ((Object) field_j), 84);
              }
              if (field_j != null) {
                if (field_j.field_g[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_j.field_g[param2] = (AudioOutput) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (AudioOutput) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new AudioOutput();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void enqueueByPriority(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_a[var3];
        if (var4 == null) {
          this.field_k[var3] = param0;
        } else {
          var4.field_k = param0;
        }
        this.field_a[var3] = param0;
        param0.field_i = param1;
    }

    void writeMixBlock() throws Exception {
    }

    final synchronized void dispose() {
        int var2 = 0;
        int var1;
        if (field_j != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_j.field_g[var2] == this) {
              field_j.field_g[var2] = null;
            }
            if (field_j.field_g[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_j.field_d = true;
            while (field_j.field_e) {
              vj.sleepMillis(50L, (byte) -49);
            }
            field_j = null;
          }
        }
        this.closeDevice();
        this.field_u = null;
        this.field_s = true;
    }

    final synchronized void setRootStream(PcmStream param0) {
        this.field_m = param0;
    }

    private final void mixBlock(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        PcmStream[] var8;
        int var9;
        Object var10;
        PcmStream var11;
        AbstractAudioSample var12;
        int var13;
        PcmStream var14;
        int var15_int;
        PcmStream var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        PcmStream var14Lifetime1;
        PcmStream var14Lifetime2;
        var3 = param1;
        if (field_b) {
          var3 = var3 << 1;
        }
        kf.clearInts(param0, 0, var3);
        this.field_d = this.field_d - param1;
        if (this.field_m != null &&
          this.field_d <= 0) {
          this.field_d = this.field_d + (field_g >> 4);
          AudioOutput.resetStreamScheduling(this.field_m);
          this.enqueueByPriority(this.field_m, this.field_m.getSchedulingPriority());
          var4 = 0;
          var5 = 255;
          var6 = 7;
          scanLoop1: while (true) {
            if (var5 != 0) {
              if (var6 >= 0) {
                var7_int = var6;
                var8_int = 0;
              } else {
                var7_int = var6 & 3;
                var8_int = -(var6 >> 2);
              }
              var9 = var5 >>> var7_int & 286331153;
              while (var9 != 0) {
                if ((var9 & 1) != 0) {
                  var5 = var5 & ~(1 << var7_int);
                  var10 = null;
                  var11 = this.field_k[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_j;
                    if (var12 != null &&
                      var12.field_h > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_k;
                      continue;
                    }
                    var11.field_h = true;
                    var13 = var11.getSchedulingCost();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_h = var12.field_h + var13;
                    }
                    if (var4 >= this.field_h) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstChildStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_i;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.getSchedulingPriority() >> 8);
                        var14Lifetime2 = var11.nextChildStream();
                      }
                    }
                    var15 = var11.field_k;
                    var11.field_k = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_k = var15;
                    } else {
                      this.field_k[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_a[var7_int] = (PcmStream) (var10);
                    }
                    var11 = var15;
                  }
                }
                var7_int += 4;
                var8_int++;
                var9 = var9 >>> 4;
              }
              var6--;
              continue;
            }
            break;
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < 8; var6Lifetime1++) {
            var7 = this.field_k[var6Lifetime1];
            var8 = this.field_k;
            var9Lifetime1 = var6Lifetime1;
            this.field_a[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_k;
              ((PcmStream) (var7)).field_k = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_d < 0) {
          this.field_d = 0;
        }
        if (this.field_m != null) {
          this.field_m.mixInto(param0, 0, param1);
        }
        this.field_l = hn.correctedCurrentTimeMillis((byte) 80);
    }

    public static void clearStaticReferences() {
        field_j = null;
    }

    void openDevice(int param0) throws Exception {
    }

    final static void configureAudio(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_g = param0;
        field_b = param1 ? true : false;
        field_q = param2;
    }

    int getQueuedFrames() throws Exception {
        return this.field_t;
    }

    private final void skipFrames(int param0) {
        this.field_d = this.field_d - param0;
        if (this.field_d < 0) {
          this.field_d = 0;
        }
        if (this.field_m != null) {
          this.field_m.skipFrames(param0);
          return;
        }
    }

    void flushDevice() throws Exception {
    }

    private final static void resetStreamScheduling(PcmStream param0) {
        param0.field_h = false;
        if (param0.field_j != null) {
          param0.field_j.field_h = 0;
        }
        PcmStream var1 = param0.firstChildStream();
        while (var1 != null) {
          AudioOutput.resetStreamScheduling(var1);
          var1 = param0.nextChildStream();
        }
    }

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    final synchronized void flushAndMarkDrainCheck() {
        try {
          this.field_o = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.field_p = hn.correctedCurrentTimeMillis((byte) 80) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    AudioOutput() {
        this.field_h = 32;
        this.field_s = false;
        this.field_l = hn.correctedCurrentTimeMillis((byte) 80);
        this.field_d = 0;
        this.field_f = 0;
        this.field_k = new PcmStream[8];
        this.field_o = true;
        this.field_c = 0;
        this.field_a = new PcmStream[8];
        this.field_n = 0;
        this.field_p = 0L;
        this.field_e = 0L;
    }
}
