/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private static int field_k;
    private int field_i;
    private PcmStream field_c;
    private long field_q;
    int[] field_l;
    private boolean field_h;
    static boolean field_b;
    private long field_u;
    static int field_g;
    private int field_n;
    private PcmStream[] field_m;
    private int field_d;
    private int field_o;
    private int field_a;
    private int field_r;
    private int field_j;
    private boolean field_f;
    private long field_s;
    private static AudioService field_e;
    private PcmStream[] field_t;
    private int field_p;

    void openDevice(int param0) throws Exception {
    }

    private final static void deactivateTree(PcmStream param0) {
        param0.field_p = false;
        if (param0.field_r != null) {
          param0.field_r.field_o = 0;
        }
        PcmStream var1 = param0.firstSubstream();
        while (var1 != null) {
          AudioOutput.deactivateTree(var1);
          var1 = param0.nextSubstream();
        }
    }

    void writeMixBlock() throws Exception {
    }

    final static void configure(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_g = param0;
        field_b = param1 ? true : false;
        field_k = param2;
    }

    final synchronized void dispose() {
        int var2 = 0;
        int var1;
        if (field_e != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_e.field_e[var2] == this) {
              field_e.field_e[var2] = null;
            }
            if (field_e.field_e[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_e.field_c = true;
            while (field_e.field_f) {
              MouseWheelInput.a((byte) 127, 50L);
            }
            field_e = null;
          }
        }
        this.closeDevice();
        this.field_l = null;
        this.field_h = true;
    }

    final synchronized void flush() {
        try {
          this.field_f = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.field_u = ClockAndCookieHelpers.monotonicMillis(-58) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    private final void enqueueByPriority(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_m[var3];
        if (var4 == null) {
          this.field_t[var3] = param0;
        } else {
          var4.field_o = param0;
        }
        this.field_m[var3] = param0;
        param0.field_q = param1;
    }

    void flushDevice() throws Exception {
    }

    final synchronized void setStream(PcmStream param0) {
        this.field_c = param0;
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_h) {
            return;
          }
          var1 = ClockAndCookieHelpers.monotonicMillis(87);
          try {
            if (var1 > this.field_q + 6000L) {
              this.field_q = var1 - 6000L;
            }
            while (var1 > this.field_q + 5000L) {
              this.skipSamples(256);
              this.field_q = this.field_q + (long)(256000 / field_g);
              var1 = ClockAndCookieHelpers.monotonicMillis(-99);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_q = var1;
          }
          if (this.field_l == null) {
            return;
          }
          try {
            if (this.field_u != 0L) {
              if (var1 < this.field_u) {
                return;
              }
              this.openDevice(this.field_o);
              this.field_u = 0L;
              this.field_f = true;
            }
            var3_int = this.bufferedSamples();
            if (this.field_a - var3_int > this.field_d) {
              this.field_d = this.field_a - var3_int;
            }
            var4 = this.field_j + this.field_r;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_o) {
              this.field_o = this.field_o + 1024;
              if (this.field_o > 16384) {
                this.field_o = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_o);
              var3_int = 0;
              this.field_f = true;
              if (var4 + 256 > this.field_o) {
                var4 = this.field_o - 256;
                this.field_r = var4 - this.field_j;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.field_l, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_s) {
              if (this.field_f) {
                this.field_f = false;
              } else {
                if (this.field_d == 0 &&
                  this.field_p == 0) {
                  this.closeDevice();
                  this.field_u = var1 + 2000L;
                  return;
                }
                this.field_r = Math.min(this.field_p, this.field_d);
                this.field_p = this.field_d;
              }
              this.field_d = 0;
              this.field_s = var1 + 2000L;
            }
            this.field_a = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.field_u = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static AudioOutput createOutput(SystemTaskService param0, java.awt.Component param1, int param2, int param3) {
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
              ((AudioOutput) ((Object) stackIn_10_0)).field_l = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).field_j = param3;
              ((AudioOutput) ((Object) var4)).initializeDevice(param1);
              ((AudioOutput) ((Object) var4)).field_o = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).field_o > 16384) {
                ((AudioOutput) ((Object) var4)).field_o = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).field_o);
              if (field_k > 0 &&
                field_e == null) {
                field_e = new AudioService();
                field_e.field_j = param0;
                param0.requestThread(2, field_k, (Runnable) ((Object) field_e));
              }
              if (field_e != null) {
                if (field_e.field_e[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_e.field_e[param2] = (AudioOutput) ((Object) var5);
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

    void closeDevice() {
    }

    int bufferedSamples() throws Exception {
        return this.field_o;
    }

    private final void skipSamples(int param0) {
        this.field_n = this.field_n - param0;
        if (this.field_n < 0) {
          this.field_n = 0;
        }
        if (this.field_c != null) {
          this.field_c.skipFrames(param0);
          return;
        }
    }

    public static void releaseStatics() {
        field_e = null;
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
        if (field_b) {
          var3 = var3 << 1;
        }
        ArraySupport.clear(param0, 0, var3);
        this.field_n = this.field_n - param1;
        if (this.field_c != null &&
          this.field_n <= 0) {
          this.field_n = this.field_n + (field_g >> 4);
          AudioOutput.deactivateTree(this.field_c);
          this.enqueueByPriority(this.field_c, this.field_c.priority());
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
                    var12 = var11.field_r;
                    if (var12 != null &&
                      var12.field_o > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_o;
                      continue;
                    }
                    var11.field_p = true;
                    var13 = var11.activity();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_o = var12.field_o + var13;
                    }
                    if (var4 >= this.field_i) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubstream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_q;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.priority() >> 8);
                        var14Lifetime2 = var11.nextSubstream();
                      }
                    }
                    var15 = var11.field_o;
                    var11.field_o = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_o = var15;
                    } else {
                      this.field_t[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_m[var7_int] = (PcmStream) (var10);
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
            this.field_m[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_o;
              ((PcmStream) (var7)).field_o = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_n < 0) {
          this.field_n = 0;
        }
        if (this.field_c != null) {
          this.field_c.mixInto(param0, 0, param1);
        }
        this.field_q = ClockAndCookieHelpers.monotonicMillis(115);
    }

    AudioOutput() {
        this.field_i = 32;
        this.field_h = false;
        this.field_q = ClockAndCookieHelpers.monotonicMillis(-110);
        this.field_n = 0;
        this.field_u = 0L;
        this.field_d = 0;
        this.field_f = true;
        this.field_s = 0L;
        this.field_a = 0;
        this.field_t = new PcmStream[8];
        this.field_m = new PcmStream[8];
        this.field_p = 0;
    }
}
