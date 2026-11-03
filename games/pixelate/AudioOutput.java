/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private PcmStream rootStream;
    private int field_u;
    static boolean field_o;
    private static AudioService field_b;
    static int field_h;
    private boolean closed;
    private long field_f;
    private static int field_s;
    int[] mixBuffer;
    private PcmStream[] field_r;
    private int field_e;
    private PcmStream[] field_n;
    private int field_l;
    private int field_k;
    private boolean field_g;
    private int field_t;
    private long reopenAtMillis;
    private long field_c;
    private int field_q;
    private int field_p;
    private int field_m;

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
        if (field_o) {
          var3 = var3 << 1;
        }
        ArraySupport.a(param0, 0, var3);
        this.field_m = this.field_m - param1;
        if (this.rootStream != null &&
          this.field_m <= 0) {
          this.field_m = this.field_m + (field_h >> 4);
          AudioOutput.deactivateTree(this.rootStream);
          this.enqueueByPriority(this.rootStream, this.rootStream.priority());
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
                  var11 = this.field_n[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_k;
                    if (var12 != null &&
                      var12.field_k > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_l;
                      continue;
                    }
                    var11.field_n = true;
                    var13 = var11.activity();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_k = var12.field_k + var13;
                    }
                    if (var4 >= this.field_u) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_m;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.priority() >> 8);
                        var14Lifetime2 = var11.nextSubStream();
                      }
                    }
                    var15 = var11.field_l;
                    var11.field_l = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_l = var15;
                    } else {
                      this.field_n[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_r[var7_int] = (PcmStream) (var10);
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
            var7 = this.field_n[var6Lifetime1];
            var8 = this.field_n;
            var9Lifetime1 = var6Lifetime1;
            this.field_r[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_l;
              ((PcmStream) (var7)).field_l = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_m < 0) {
          this.field_m = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.mixInto(param0, 0, param1);
        }
        this.field_f = hm.a(64);
    }

    void writeMixBlock() throws Exception {
    }

    void openDevice(int param0) throws Exception {
    }

    private final void enqueueByPriority(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_r[var3];
        if (var4 == null) {
          this.field_n[var3] = param0;
        } else {
          var4.field_l = param0;
        }
        this.field_r[var3] = param0;
        param0.field_m = param1;
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
          if (field_h == 0) {
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
              if (!field_o) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((AudioOutput) ((Object) stackIn_10_0)).mixBuffer = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).field_t = param3;
              ((AudioOutput) ((Object) var4)).initDevice(param1);
              ((AudioOutput) ((Object) var4)).field_l = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).field_l > 16384) {
                ((AudioOutput) ((Object) var4)).field_l = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).field_l);
              if (field_s > 0 &&
                field_b == null) {
                field_b = new AudioService();
                field_b.field_g = param0;
                param0.a(field_s, (Runnable) ((Object) field_b), (byte) -123);
              }
              if (field_b != null) {
                if (field_b.field_h[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_b.field_h[param2] = (AudioOutput) ((Object) var5);
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

    int getQueuedFrames() throws Exception {
        return this.field_l;
    }

    void initDevice(java.awt.Component param0) throws Exception {
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.closed) {
            return;
          }
          var1 = hm.a(64);
          try {
            if (var1 > this.field_f + 6000L) {
              this.field_f = var1 - 6000L;
            }
            while (var1 > this.field_f + 5000L) {
              this.skipFrames(256);
              this.field_f = this.field_f + (long)(256000 / field_h);
              var1 = hm.a(64);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_f = var1;
          }
          if (this.mixBuffer == null) {
            return;
          }
          try {
            if (this.reopenAtMillis != 0L) {
              if (var1 < this.reopenAtMillis) {
                return;
              }
              this.openDevice(this.field_l);
              this.reopenAtMillis = 0L;
              this.field_g = true;
            }
            var3_int = this.getQueuedFrames();
            if (this.field_q - var3_int > this.field_p) {
              this.field_p = this.field_q - var3_int;
            }
            var4 = this.field_t + this.field_e;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_l) {
              this.field_l = this.field_l + 1024;
              if (this.field_l > 16384) {
                this.field_l = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_l);
              var3_int = 0;
              this.field_g = true;
              if (var4 + 256 > this.field_l) {
                var4 = this.field_l - 256;
                this.field_e = var4 - this.field_t;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.mixBuffer, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_c) {
              if (this.field_g) {
                this.field_g = false;
              } else {
                if (this.field_p == 0 &&
                  this.field_k == 0) {
                  this.closeDevice();
                  this.reopenAtMillis = var1 + 2000L;
                  return;
                }
                this.field_e = Math.min(this.field_k, this.field_p);
                this.field_k = this.field_p;
              }
              this.field_p = 0;
              this.field_c = var1 + 2000L;
            }
            this.field_q = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.reopenAtMillis = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics() {
        field_b = null;
    }

    void closeDevice() {
    }

    final synchronized void setStream(PcmStream param0) {
        this.rootStream = param0;
    }

    final static void configure(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_h = param0;
        field_o = param1 ? true : false;
        field_s = param2;
    }

    final synchronized void shutdown() {
        int var2 = 0;
        int var1;
        if (field_b != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_b.field_h[var2] == this) {
              field_b.field_h[var2] = null;
            }
            if (field_b.field_h[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_b.field_a = true;
            while (field_b.field_f) {
              SecondaryNodeHashTable.a(50L, (byte) 23);
            }
            field_b = null;
          }
        }
        this.closeDevice();
        this.mixBuffer = null;
        this.closed = true;
    }

    private final void skipFrames(int param0) {
        this.field_m = this.field_m - param0;
        if (this.field_m < 0) {
          this.field_m = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.skip(param0);
          return;
        }
    }

    private final static void deactivateTree(PcmStream param0) {
        param0.field_n = false;
        if (param0.field_k != null) {
          param0.field_k.field_k = 0;
        }
        PcmStream var1 = param0.firstSubStream();
        while (var1 != null) {
          AudioOutput.deactivateTree(var1);
          var1 = param0.nextSubStream();
        }
    }

    AudioOutput() {
        this.field_u = 32;
        this.closed = false;
        this.field_f = hm.a(64);
        this.field_n = new PcmStream[8];
        this.field_k = 0;
        this.field_g = true;
        this.field_r = new PcmStream[8];
        this.field_c = 0L;
        this.field_p = 0;
        this.field_m = 0;
        this.reopenAtMillis = 0L;
        this.field_q = 0;
    }
}
