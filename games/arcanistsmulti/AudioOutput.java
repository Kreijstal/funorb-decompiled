/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private PcmStream field_s;
    private boolean field_t;
    private static int field_f;
    private static AudioService field_o;
    int[] field_a;
    private int field_g;
    static int field_r;
    static boolean field_i;
    private long field_b;
    private long field_k;
    private int field_p;
    private int field_q;
    private int field_j;
    private PcmStream[] field_h;
    private long field_c;
    private int field_e;
    private int field_l;
    private int field_d;
    private PcmStream[] field_u;
    private boolean field_m;
    private int field_n;

    final static void configure(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_r = param0;
        field_i = param1 ? true : false;
        field_f = param2;
    }

    void writeMixBlock() throws Exception {
    }

    private final static void deactivateTree(PcmStream param0) {
        param0.field_i = false;
        if (param0.field_j != null) {
          param0.field_j.field_g = 0;
        }
        PcmStream var1 = param0.firstSubStream();
        while (var1 != null) {
          AudioOutput.deactivateTree(var1);
          var1 = param0.nextSubStream();
        }
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
              if (!field_i) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((AudioOutput) ((Object) stackIn_10_0)).field_a = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).field_e = param3;
              ((AudioOutput) ((Object) var4)).initDevice(param1);
              ((AudioOutput) ((Object) var4)).field_q = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).field_q > 16384) {
                ((AudioOutput) ((Object) var4)).field_q = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).field_q);
              if (field_f > 0 &&
                field_o == null) {
                field_o = new AudioService();
                field_o.field_f = param0;
                param0.queueThreadStart(127, field_f, (Runnable) ((Object) field_o));
              }
              if (field_o != null) {
                if (field_o.field_b[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_o.field_b[param2] = (AudioOutput) ((Object) var5);
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

    void flushDevice() throws Exception {
    }

    private final void enqueueByPriority(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_h[var3];
        if (var4 == null) {
          this.field_u[var3] = param0;
        } else {
          var4.field_g = param0;
        }
        this.field_h[var3] = param0;
        param0.field_h = param1;
    }

    private final void skipFrames(int param0) {
        this.field_l = this.field_l - param0;
        if (this.field_l < 0) {
          this.field_l = 0;
        }
        if (this.field_s != null) {
          this.field_s.skip(param0);
          return;
        }
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_t) {
            return;
          }
          var1 = qj.monotonicTimeMillis(-26572);
          try {
            if (var1 > this.field_b + 6000L) {
              this.field_b = var1 - 6000L;
            }
            while (var1 > this.field_b + 5000L) {
              this.skipFrames(256);
              this.field_b = this.field_b + (long)(256000 / field_r);
              var1 = qj.monotonicTimeMillis(-26572);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_b = var1;
          }
          if (this.field_a == null) {
            return;
          }
          try {
            if (this.field_k != 0L) {
              if (var1 < this.field_k) {
                return;
              }
              this.openDevice(this.field_q);
              this.field_k = 0L;
              this.field_m = true;
            }
            var3_int = this.getQueuedFrames();
            if (this.field_d - var3_int > this.field_p) {
              this.field_p = this.field_d - var3_int;
            }
            var4 = this.field_e + this.field_j;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_q) {
              this.field_q = this.field_q + 1024;
              if (this.field_q > 16384) {
                this.field_q = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_q);
              var3_int = 0;
              this.field_m = true;
              if (var4 + 256 > this.field_q) {
                var4 = this.field_q - 256;
                this.field_j = var4 - this.field_e;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.field_a, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_c) {
              if (this.field_m) {
                this.field_m = false;
              } else {
                if (this.field_p == 0 &&
                  this.field_n == 0) {
                  this.closeDevice();
                  this.field_k = var1 + 2000L;
                  return;
                }
                this.field_j = Math.min(this.field_n, this.field_p);
                this.field_n = this.field_p;
              }
              this.field_p = 0;
              this.field_c = var1 + 2000L;
            }
            this.field_d = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.field_k = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int getQueuedFrames() throws Exception {
        return this.field_q;
    }

    final synchronized void shutdown() {
        int var2 = 0;
        int var1;
        if (field_o != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_o.field_b[var2] == this) {
              field_o.field_b[var2] = null;
            }
            if (field_o.field_b[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_o.field_g = true;
            while (field_o.field_a) {
              ao.sleepMillis(50L, 1);
            }
            field_o = null;
          }
        }
        this.closeDevice();
        this.field_a = null;
        this.field_t = true;
    }

    void initDevice(java.awt.Component param0) throws Exception {
    }

    public static void releaseStatics() {
        field_o = null;
    }

    void openDevice(int param0) throws Exception {
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
        AbstractPcmSample var12;
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
        if (field_i) {
          var3 = var3 << 1;
        }
        ArraySupport.clearInts(param0, 0, var3);
        this.field_l = this.field_l - param1;
        if (this.field_s != null &&
          this.field_l <= 0) {
          this.field_l = this.field_l + (field_r >> 4);
          AudioOutput.deactivateTree(this.field_s);
          this.enqueueByPriority(this.field_s, this.field_s.priority());
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
                  var11 = this.field_u[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_j;
                    if (var12 != null &&
                      var12.field_g > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_g;
                      continue;
                    }
                    var11.field_i = true;
                    var13 = var11.activity();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_g = var12.field_g + var13;
                    }
                    if (var4 >= this.field_g) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_h;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.priority() >> 8);
                        var14Lifetime2 = var11.nextSubStream();
                      }
                    }
                    var15 = var11.field_g;
                    var11.field_g = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_g = var15;
                    } else {
                      this.field_u[var7_int] = var15;
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
            var7 = this.field_u[var6Lifetime1];
            var8 = this.field_u;
            var9Lifetime1 = var6Lifetime1;
            this.field_h[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_g;
              ((PcmStream) (var7)).field_g = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_l < 0) {
          this.field_l = 0;
        }
        if (this.field_s != null) {
          this.field_s.mixInto(param0, 0, param1);
        }
        this.field_b = qj.monotonicTimeMillis(-26572);
    }

    final synchronized void setStream(PcmStream param0) {
        this.field_s = param0;
    }

    void closeDevice() {
    }

    final synchronized void flushDeviceSafely() {
        try {
          this.field_m = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.field_k = qj.monotonicTimeMillis(-26572) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    AudioOutput() {
        this.field_t = false;
        this.field_g = 32;
        this.field_b = qj.monotonicTimeMillis(-26572);
        this.field_p = 0;
        this.field_k = 0L;
        this.field_h = new PcmStream[8];
        this.field_u = new PcmStream[8];
        this.field_d = 0;
        this.field_l = 0;
        this.field_n = 0;
        this.field_c = 0L;
        this.field_m = true;
    }
}
