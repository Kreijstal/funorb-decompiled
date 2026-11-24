/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private static int field_l;
    private boolean field_i;
    static boolean field_s;
    private PcmStream field_t;
    private int field_e;
    private long field_p;
    int[] field_m;
    private static dd field_k;
    static int field_r;
    private int field_b;
    private int field_g;
    private int field_a;
    private boolean field_q;
    private long field_h;
    private PcmStream[] field_c;
    private int field_d;
    private int field_u;
    private int field_f;
    private PcmStream[] field_o;
    private int field_n;
    private long field_j;

    final synchronized void flushAndMarkDrainCheck() {
        try {
          this.field_q = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.field_h = fa.correctedCurrentTimeMillis(121) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearStaticReferences() {
        field_k = null;
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
        ic var12;
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
        cb.clearInts(param0, 0, var3);
        this.field_b = this.field_b - param1;
        if (this.field_t != null &&
          this.field_b <= 0) {
          this.field_b = this.field_b + (field_r >> 4);
          AudioOutput.resetStreamScheduling(this.field_t);
          this.enqueueByPriority(this.field_t, this.field_t.getSchedulingPriority());
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
                  var11 = this.field_c[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_j;
                    if (var12 != null &&
                      var12.field_g > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_h;
                      continue;
                    }
                    var11.field_i = true;
                    var13 = var11.getSchedulingCost();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_g = var12.field_g + var13;
                    }
                    if (var4 >= this.field_e) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstChildStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_g;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.getSchedulingPriority() >> 8);
                        var14Lifetime2 = var11.nextChildStream();
                      }
                    }
                    var15 = var11.field_h;
                    var11.field_h = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_h = var15;
                    } else {
                      this.field_c[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_o[var7_int] = (PcmStream) (var10);
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
            var7 = this.field_c[var6Lifetime1];
            var8 = this.field_c;
            var9Lifetime1 = var6Lifetime1;
            this.field_o[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_h;
              ((PcmStream) (var7)).field_h = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_b < 0) {
          this.field_b = 0;
        }
        if (this.field_t != null) {
          this.field_t.mixInto(param0, 0, param1);
        }
        this.field_p = fa.correctedCurrentTimeMillis(-49);
    }

    int getQueuedFrames() throws Exception {
        return this.field_d;
    }

    void openDevice(int param0) throws Exception {
    }

    void flushDevice() throws Exception {
    }

    final synchronized void dispose() {
        int var2 = 0;
        int var1;
        if (field_k != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_k.field_a[var2] == this) {
              field_k.field_a[var2] = null;
            }
            if (field_k.field_a[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_k.field_c = true;
            while (field_k.field_b) {
              SecondaryNodeDeque.sleepMillis(50L, 19406);
            }
            field_k = null;
          }
        }
        this.closeDevice();
        this.field_m = null;
        this.field_i = true;
    }

    final static void configureAudio(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_r = param0;
        field_s = param1 ? true : false;
        field_l = param2;
    }

    private final static void resetStreamScheduling(PcmStream param0) {
        param0.field_i = false;
        if (param0.field_j != null) {
          param0.field_j.field_g = 0;
        }
        PcmStream var1 = param0.firstChildStream();
        while (var1 != null) {
          AudioOutput.resetStreamScheduling(var1);
          var1 = param0.nextChildStream();
        }
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_i) {
            return;
          }
          var1 = fa.correctedCurrentTimeMillis(-114);
          try {
            if (var1 > this.field_p + 6000L) {
              this.field_p = var1 - 6000L;
            }
            while (var1 > this.field_p + 5000L) {
              this.skipFrames(256);
              this.field_p = this.field_p + (long)(256000 / field_r);
              var1 = fa.correctedCurrentTimeMillis(-87);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_p = var1;
          }
          if (this.field_m == null) {
            return;
          }
          try {
            if (this.field_h != 0L) {
              if (var1 < this.field_h) {
                return;
              }
              this.openDevice(this.field_d);
              this.field_h = 0L;
              this.field_q = true;
            }
            var3_int = this.getQueuedFrames();
            if (this.field_a - var3_int > this.field_u) {
              this.field_u = this.field_a - var3_int;
            }
            var4 = this.field_g + this.field_n;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_d) {
              this.field_d = this.field_d + 1024;
              if (this.field_d > 16384) {
                this.field_d = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_d);
              var3_int = 0;
              this.field_q = true;
              if (var4 + 256 > this.field_d) {
                var4 = this.field_d - 256;
                this.field_n = var4 - this.field_g;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.field_m, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_j) {
              if (this.field_q) {
                this.field_q = false;
              } else {
                if (this.field_u == 0 &&
                  this.field_f == 0) {
                  this.closeDevice();
                  this.field_h = var1 + 2000L;
                  return;
                }
                this.field_n = Math.min(this.field_f, this.field_u);
                this.field_f = this.field_u;
              }
              this.field_u = 0;
              this.field_j = var1 + 2000L;
            }
            this.field_a = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.field_h = var1 + 2000L;
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
          if (field_r == 0) {
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
              if (!field_s) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((AudioOutput) ((Object) stackIn_10_0)).field_m = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).field_g = param3;
              ((AudioOutput) ((Object) var4)).initializeDevice(param1);
              ((AudioOutput) ((Object) var4)).field_d = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).field_d > 16384) {
                ((AudioOutput) ((Object) var4)).field_d = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).field_d);
              if (field_l > 0 &&
                field_k == null) {
                field_k = new dd();
                field_k.field_d = param0;
                param0.requestThreadStart(field_l, (byte) 126, (Runnable) ((Object) field_k));
              }
              if (field_k != null) {
                if (field_k.field_a[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_k.field_a[param2] = (AudioOutput) ((Object) var5);
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

    private final void skipFrames(int param0) {
        this.field_b = this.field_b - param0;
        if (this.field_b < 0) {
          this.field_b = 0;
        }
        if (this.field_t != null) {
          this.field_t.skipFrames(param0);
          return;
        }
    }

    void closeDevice() {
    }

    void writeMixBlock() throws Exception {
    }

    private final void enqueueByPriority(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_o[var3];
        if (var4 == null) {
          this.field_c[var3] = param0;
        } else {
          var4.field_h = param0;
        }
        this.field_o[var3] = param0;
        param0.field_g = param1;
    }

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    final synchronized void setRootStream(PcmStream param0) {
        this.field_t = param0;
    }

    AudioOutput() {
        this.field_i = false;
        this.field_e = 32;
        this.field_p = fa.correctedCurrentTimeMillis(-78);
        this.field_q = true;
        this.field_b = 0;
        this.field_c = new PcmStream[8];
        this.field_a = 0;
        this.field_f = 0;
        this.field_o = new PcmStream[8];
        this.field_j = 0L;
        this.field_h = 0L;
        this.field_u = 0;
    }
}
