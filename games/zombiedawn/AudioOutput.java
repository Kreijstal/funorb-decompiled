/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private PcmStream field_f;
    static boolean field_l;
    private int field_b;
    private boolean field_k;
    static int field_p;
    private long field_d;
    int[] field_r;
    private static int field_q;
    private static AudioPumpThread field_j;
    private int field_s;
    private int field_g;
    private int field_n;
    private int field_m;
    private int field_i;
    private int field_a;
    private long field_o;
    private PcmStream[] field_t;
    private long field_c;
    private int field_u;
    private PcmStream[] field_h;
    private boolean field_e;

    private final static void deactivateTree(PcmStream param0) {
        param0.active = false;
        if (param0.field_h != null) {
          param0.field_h.field_h = 0;
        }
        PcmStream var1 = param0.firstSubstream();
        while (var1 != null) {
          AudioOutput.deactivateTree(var1);
          var1 = param0.nextSubstream();
        }
    }

    public static void releaseStatics() {
        field_j = null;
    }

    void closeDevice() {
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_k) {
            return;
          }
          var1 = MonotonicClock.monotonicTimeMillis(-22826);
          try {
            if (var1 > this.field_d + 6000L) {
              this.field_d = var1 - 6000L;
            }
            while (var1 > this.field_d + 5000L) {
              this.skipFrames(256);
              this.field_d = this.field_d + (long)(256000 / field_p);
              var1 = MonotonicClock.monotonicTimeMillis(-22826);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_d = var1;
          }
          if (this.field_r == null) {
            return;
          }
          try {
            if (this.field_o != 0L) {
              if (var1 < this.field_o) {
                return;
              }
              this.openDevice(this.field_g);
              this.field_o = 0L;
              this.field_e = true;
            }
            var3_int = this.getQueuedFrames();
            if (this.field_m - var3_int > this.field_n) {
              this.field_n = this.field_m - var3_int;
            }
            var4 = this.field_u + this.field_a;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_g) {
              this.field_g = this.field_g + 1024;
              if (this.field_g > 16384) {
                this.field_g = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_g);
              var3_int = 0;
              this.field_e = true;
              if (var4 + 256 > this.field_g) {
                var4 = this.field_g - 256;
                this.field_a = var4 - this.field_u;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.field_r, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_c) {
              if (this.field_e) {
                this.field_e = false;
              } else {
                if (this.field_n == 0 &&
                  this.field_s == 0) {
                  this.closeDevice();
                  this.field_o = var1 + 2000L;
                  return;
                }
                this.field_a = Math.min(this.field_s, this.field_n);
                this.field_s = this.field_n;
              }
              this.field_n = 0;
              this.field_c = var1 + 2000L;
            }
            this.field_m = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.field_o = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void flushDeviceSafely() {
        try {
          this.field_e = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.field_o = MonotonicClock.monotonicTimeMillis(-22826) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void setStream(PcmStream param0) {
        this.field_f = param0;
    }

    private final void enqueueByPriority(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_h[var3];
        if (var4 == null) {
          this.field_t[var3] = param0;
        } else {
          var4.field_i = param0;
        }
        this.field_h[var3] = param0;
        param0.field_j = param1;
    }

    final static AudioOutput create(PlatformTaskDispatcher param0, java.awt.Component param1, int param2, int param3) {
        try {
          JavaSoundAudioOutput var4 = null;
          Throwable var4_ref = null;
          JavaSoundAudioOutput var5 = null;
          JavaSoundAudioOutput stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          JavaSoundAudioOutput stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_p == 0) {
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
              if (!field_l) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((AudioOutput) ((Object) stackIn_10_0)).field_r = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).field_u = param3;
              ((AudioOutput) ((Object) var4)).initDevice(param1);
              ((AudioOutput) ((Object) var4)).field_g = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).field_g > 16384) {
                ((AudioOutput) ((Object) var4)).field_g = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).field_g);
              if (field_q > 0 &&
                field_j == null) {
                field_j = new AudioPumpThread();
                field_j.field_b = param0;
                param0.startThread(field_q, (Runnable) ((Object) field_j), true);
              }
              if (field_j != null) {
                if (field_j.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_j.field_c[param2] = (AudioOutput) ((Object) var5);
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
        if (field_l) {
          var3 = var3 << 1;
        }
        ArraySupport.clearInts(param0, 0, var3);
        this.field_i = this.field_i - param1;
        if (this.field_f != null &&
          this.field_i <= 0) {
          this.field_i = this.field_i + (field_p >> 4);
          AudioOutput.deactivateTree(this.field_f);
          this.enqueueByPriority(this.field_f, this.field_f.priority());
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
                  var11 = this.field_t[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_h;
                    if (var12 != null &&
                      var12.field_h > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_i;
                      continue;
                    }
                    var11.active = true;
                    var13 = var11.activity();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_h = var12.field_h + var13;
                    }
                    if (var4 >= this.field_b) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubstream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_j;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.priority() >> 8);
                        var14Lifetime2 = var11.nextSubstream();
                      }
                    }
                    var15 = var11.field_i;
                    var11.field_i = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_i = var15;
                    } else {
                      this.field_t[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_h[var7_int] = (PcmStream) (var10);
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
            var7 = this.field_t[var6Lifetime1];
            var8 = this.field_t;
            var9Lifetime1 = var6Lifetime1;
            this.field_h[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_i;
              ((PcmStream) (var7)).field_i = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_i < 0) {
          this.field_i = 0;
        }
        if (this.field_f != null) {
          this.field_f.fill(param0, 0, param1);
        }
        this.field_d = MonotonicClock.monotonicTimeMillis(-22826);
    }

    private final void skipFrames(int param0) {
        this.field_i = this.field_i - param0;
        if (this.field_i < 0) {
          this.field_i = 0;
        }
        if (this.field_f != null) {
          this.field_f.skip(param0);
          return;
        }
    }

    void writeMixBlock() throws Exception {
    }

    final synchronized void shutdown() {
        int var2 = 0;
        int var1;
        if (field_j != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_j.field_c[var2] == this) {
              field_j.field_c[var2] = null;
            }
            if (field_j.field_c[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_j.field_d = true;
            while (field_j.field_a) {
              AlternateLongAndNameCredentials.sleepMillis(50L, (byte) 47);
            }
            field_j = null;
          }
        }
        this.closeDevice();
        this.field_r = null;
        this.field_k = true;
    }

    int getQueuedFrames() throws Exception {
        return this.field_g;
    }

    void openDevice(int param0) throws Exception {
    }

    void initDevice(java.awt.Component param0) throws Exception {
    }

    final static void configure(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_p = param0;
        field_l = param1 ? true : false;
        field_q = param2;
    }

    void flushDevice() throws Exception {
    }

    AudioOutput() {
        this.field_b = 32;
        this.field_k = false;
        this.field_d = MonotonicClock.monotonicTimeMillis(-22826);
        this.field_s = 0;
        this.field_m = 0;
        this.field_o = 0L;
        this.field_e = true;
        this.field_n = 0;
        this.field_h = new PcmStream[8];
        this.field_t = new PcmStream[8];
        this.field_i = 0;
        this.field_c = 0L;
    }
}
