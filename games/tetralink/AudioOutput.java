/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private boolean field_o;
    int[] field_c;
    static boolean field_s;
    static int field_k;
    private long field_i;
    private PcmStream field_j;
    private static AudioPumpThread field_q;
    private static int field_n;
    private int field_h;
    private int field_m;
    private PcmStream[] field_f;
    private PcmStream[] field_d;
    private int field_u;
    private int field_e;
    private int field_t;
    private int field_a;
    private boolean field_g;
    private long field_l;
    private int field_p;
    private int field_r;
    private long field_b;

    final synchronized void flush() {
        try {
          this.field_g = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.field_b = ClockAndTextHelpers.monotonicMillis(0) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_o) {
            return;
          }
          var1 = ClockAndTextHelpers.monotonicMillis(0);
          try {
            if (var1 > this.field_i + 6000L) {
              this.field_i = var1 - 6000L;
            }
            while (var1 > this.field_i + 5000L) {
              this.skipFrames(256);
              this.field_i = this.field_i + (long)(256000 / field_k);
              var1 = ClockAndTextHelpers.monotonicMillis(0);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_i = var1;
          }
          if (this.field_c == null) {
            return;
          }
          try {
            if (this.field_b != 0L) {
              if (var1 < this.field_b) {
                return;
              }
              this.openDevice(this.field_r);
              this.field_b = 0L;
              this.field_g = true;
            }
            var3_int = this.bufferedSamples();
            if (this.field_a - var3_int > this.field_t) {
              this.field_t = this.field_a - var3_int;
            }
            var4 = this.field_p + this.field_m;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_r) {
              this.field_r = this.field_r + 1024;
              if (this.field_r > 16384) {
                this.field_r = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_r);
              var3_int = 0;
              this.field_g = true;
              if (var4 + 256 > this.field_r) {
                var4 = this.field_r - 256;
                this.field_m = var4 - this.field_p;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.field_c, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_l) {
              if (this.field_g) {
                this.field_g = false;
              } else {
                if (this.field_t == 0 &&
                  this.field_u == 0) {
                  this.closeDevice();
                  this.field_b = var1 + 2000L;
                  return;
                }
                this.field_m = Math.min(this.field_u, this.field_t);
                this.field_u = this.field_t;
              }
              this.field_t = 0;
              this.field_l = var1 + 2000L;
            }
            this.field_a = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.field_b = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int bufferedSamples() throws Exception {
        return this.field_r;
    }

    private final static void deactivateTree(PcmStream param0) {
        param0.field_q = false;
        if (param0.field_p != null) {
          param0.field_p.field_n = 0;
        }
        PcmStream var1 = param0.firstSubStream();
        while (var1 != null) {
          AudioOutput.deactivateTree(var1);
          var1 = param0.nextSubStream();
        }
    }

    final synchronized void shutdown() {
        int var2 = 0;
        int var1;
        if (field_q != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_q.field_l[var2] == this) {
              field_q.field_l[var2] = null;
            }
            if (field_q.field_l[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_q.field_g = true;
            while (field_q.field_k) {
              AnimationSequence.sleepMillis(false, 50L);
            }
            field_q = null;
          }
        }
        this.closeDevice();
        this.field_c = null;
        this.field_o = true;
    }

    final static void configure(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_k = param0;
        field_s = param1 ? true : false;
        field_n = param2;
    }

    private final void enqueueByPriority(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_f[var3];
        if (var4 == null) {
          this.field_d[var3] = param0;
        } else {
          var4.field_n = param0;
        }
        this.field_f[var3] = param0;
        param0.field_o = param1;
    }

    final synchronized void setStream(PcmStream param0) {
        this.field_j = param0;
    }

    final static AudioOutput createOutput(PlatformTaskDispatcher param0, java.awt.Component param1, int param2, int param3) {
        try {
          JavaSoundPcmPlayer var4 = null;
          Throwable var4_ref = null;
          JavaSoundPcmPlayer var5 = null;
          JavaSoundPcmPlayer stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          JavaSoundPcmPlayer stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_k == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new JavaSoundPcmPlayer();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_s) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((AudioOutput) ((Object) stackIn_10_0)).field_c = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).field_p = param3;
              ((AudioOutput) ((Object) var4)).initializeDevice(param1);
              ((AudioOutput) ((Object) var4)).field_r = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).field_r > 16384) {
                ((AudioOutput) ((Object) var4)).field_r = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).field_r);
              if (field_n > 0 &&
                field_q == null) {
                field_q = new AudioPumpThread();
                field_q.field_j = param0;
                param0.startThread((Runnable) ((Object) field_q), 105, field_n);
              }
              if (field_q != null) {
                if (field_q.field_l[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_q.field_l[param2] = (AudioOutput) ((Object) var5);
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

    void writeMixBlock() throws Exception {
    }

    void flushDevice() throws Exception {
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
        if (field_s) {
          var3 = var3 << 1;
        }
        ArraySupport.clear(param0, 0, var3);
        this.field_e = this.field_e - param1;
        if (this.field_j != null &&
          this.field_e <= 0) {
          this.field_e = this.field_e + (field_k >> 4);
          AudioOutput.deactivateTree(this.field_j);
          this.enqueueByPriority(this.field_j, this.field_j.priority());
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
                  var11 = this.field_d[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_p;
                    if (var12 != null &&
                      var12.field_n > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_n;
                      continue;
                    }
                    var11.field_q = true;
                    var13 = var11.activity();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_n = var12.field_n + var13;
                    }
                    if (var4 >= this.field_h) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_o;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.priority() >> 8);
                        var14Lifetime2 = var11.nextSubStream();
                      }
                    }
                    var15 = var11.field_n;
                    var11.field_n = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_n = var15;
                    } else {
                      this.field_d[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_f[var7_int] = (PcmStream) (var10);
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
            var7 = this.field_d[var6Lifetime1];
            var8 = this.field_d;
            var9Lifetime1 = var6Lifetime1;
            this.field_f[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_n;
              ((PcmStream) (var7)).field_n = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_e < 0) {
          this.field_e = 0;
        }
        if (this.field_j != null) {
          this.field_j.mixInto(param0, 0, param1);
        }
        this.field_i = ClockAndTextHelpers.monotonicMillis(0);
    }

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    void closeDevice() {
    }

    private final void skipFrames(int param0) {
        this.field_e = this.field_e - param0;
        if (this.field_e < 0) {
          this.field_e = 0;
        }
        if (this.field_j != null) {
          this.field_j.skipFrames(param0);
          return;
        }
    }

    void openDevice(int param0) throws Exception {
    }

    public static void releaseStatics() {
        field_q = null;
    }

    AudioOutput() {
        this.field_o = false;
        this.field_h = 32;
        this.field_i = ClockAndTextHelpers.monotonicMillis(0);
        this.field_d = new PcmStream[8];
        this.field_f = new PcmStream[8];
        this.field_u = 0;
        this.field_e = 0;
        this.field_a = 0;
        this.field_g = true;
        this.field_b = 0L;
        this.field_t = 0;
        this.field_l = 0L;
    }
}
