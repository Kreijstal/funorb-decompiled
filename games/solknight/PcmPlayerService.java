/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PcmPlayerService {
    private boolean field_j;
    private static int field_d;
    private int field_q;
    private static PcmOutputWorker field_p;
    private long field_e;
    static boolean field_u;
    private PcmStream field_f;
    int[] field_a;
    static int field_s;
    private int field_t;
    private long field_k;
    private PcmStream[] field_b;
    private long field_m;
    private boolean field_n;
    private int field_o;
    private PcmStream[] field_r;
    private int field_l;
    private int field_g;
    private int field_h;
    private int field_i;
    private int field_c;

    public static void clearStaticReferences() {
        field_p = null;
    }

    final static PcmPlayerService createOutput(PlatformTaskDispatcher param0, java.awt.Component param1, int param2, int param3) {
        try {
          JavaSoundAudioOutput var4 = null;
          Throwable var4_ref = null;
          JavaSoundAudioOutput var5 = null;
          JavaSoundAudioOutput stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          JavaSoundAudioOutput stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_s == 0) {
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
              if (!field_u) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((PcmPlayerService) ((Object) stackIn_10_0)).field_a = new int[stackIn_10_1 * stackIn_11_2];
              ((PcmPlayerService) ((Object) var4)).field_h = param3;
              ((PcmPlayerService) ((Object) var4)).initializeDevice(param1);
              ((PcmPlayerService) ((Object) var4)).field_t = (param3 & -1024) + 1024;
              if (((PcmPlayerService) ((Object) var4)).field_t > 16384) {
                ((PcmPlayerService) ((Object) var4)).field_t = 16384;
              }
              ((PcmPlayerService) ((Object) var4)).openDevice(((PcmPlayerService) ((Object) var4)).field_t);
              if (field_d > 0 &&
                field_p == null) {
                field_p = new PcmOutputWorker();
                field_p.field_b = param0;
                param0.requestThreadStart(field_d, -30, (Runnable) ((Object) field_p));
              }
              if (field_p != null) {
                if (field_p.field_a[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_p.field_a[param2] = (PcmPlayerService) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (PcmPlayerService) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new PcmPlayerService();
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
        if (field_u) {
          var3 = var3 << 1;
        }
        fk.clearInts(param0, 0, var3);
        this.field_c = this.field_c - param1;
        if (this.field_f != null &&
          this.field_c <= 0) {
          this.field_c = this.field_c + (field_s >> 4);
          PcmPlayerService.resetStreamScheduling(this.field_f);
          this.enqueueByPriority(this.field_f, this.field_f.getSchedulingPriority());
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
                  var11 = this.field_r[var7_int];
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
                    var11.field_k = true;
                    var13 = var11.getSchedulingCost();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_h = var12.field_h + var13;
                    }
                    if (var4 >= this.field_q) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstChildStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_j;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.getSchedulingPriority() >> 8);
                        var14Lifetime2 = var11.nextChildStream();
                      }
                    }
                    var15 = var11.field_i;
                    var11.field_i = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_i = var15;
                    } else {
                      this.field_r[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_b[var7_int] = (PcmStream) (var10);
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
            var7 = this.field_r[var6Lifetime1];
            var8 = this.field_r;
            var9Lifetime1 = var6Lifetime1;
            this.field_b[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_i;
              ((PcmStream) (var7)).field_i = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_c < 0) {
          this.field_c = 0;
        }
        if (this.field_f != null) {
          this.field_f.mixInto(param0, 0, param1);
        }
        this.field_e = je.correctedCurrentTimeMillis(1);
    }

    final synchronized void dispose() {
        int var2 = 0;
        int var1;
        if (field_p != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_p.field_a[var2] == this) {
              field_p.field_a[var2] = null;
            }
            if (field_p.field_a[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_p.field_e = true;
            while (field_p.field_f) {
              i.sleepMillis((byte) 109, 50L);
            }
            field_p = null;
          }
        }
        this.closeDevice();
        this.field_a = null;
        this.field_j = true;
    }

    private final void skipFrames(int param0) {
        this.field_c = this.field_c - param0;
        if (this.field_c < 0) {
          this.field_c = 0;
        }
        if (this.field_f != null) {
          this.field_f.skipFrames(param0);
          return;
        }
    }

    void closeDevice() {
    }

    private final static void resetStreamScheduling(PcmStream param0) {
        param0.field_k = false;
        if (param0.field_h != null) {
          param0.field_h.field_h = 0;
        }
        PcmStream var1 = param0.firstChildStream();
        while (var1 != null) {
          PcmPlayerService.resetStreamScheduling(var1);
          var1 = param0.nextChildStream();
        }
    }

    void flushDevice() throws Exception {
    }

    int getQueuedFrames() throws Exception {
        return this.field_t;
    }

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    void openDevice(int param0) throws Exception {
    }

    final static void configureAudio(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_s = param0;
        field_u = param1 ? true : false;
        field_d = param2;
    }

    final synchronized void flushAndMarkDrainCheck() {
        try {
          this.field_n = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.field_k = je.correctedCurrentTimeMillis(1) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void setRootStream(PcmStream param0) {
        this.field_f = param0;
    }

    private final void enqueueByPriority(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_b[var3];
        if (var4 == null) {
          this.field_r[var3] = param0;
        } else {
          var4.field_i = param0;
        }
        this.field_b[var3] = param0;
        param0.field_j = param1;
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_j) {
            return;
          }
          var1 = je.correctedCurrentTimeMillis(1);
          try {
            if (var1 > this.field_e + 6000L) {
              this.field_e = var1 - 6000L;
            }
            while (var1 > this.field_e + 5000L) {
              this.skipFrames(256);
              this.field_e = this.field_e + (long)(256000 / field_s);
              var1 = je.correctedCurrentTimeMillis(1);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_e = var1;
          }
          if (this.field_a == null) {
            return;
          }
          try {
            if (this.field_k != 0L) {
              if (var1 < this.field_k) {
                return;
              }
              this.openDevice(this.field_t);
              this.field_k = 0L;
              this.field_n = true;
            }
            var3_int = this.getQueuedFrames();
            if (this.field_o - var3_int > this.field_i) {
              this.field_i = this.field_o - var3_int;
            }
            var4 = this.field_h + this.field_l;
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
              this.field_n = true;
              if (var4 + 256 > this.field_t) {
                var4 = this.field_t - 256;
                this.field_l = var4 - this.field_h;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.field_a, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_m) {
              if (this.field_n) {
                this.field_n = false;
              } else {
                if (this.field_i == 0 &&
                  this.field_g == 0) {
                  this.closeDevice();
                  this.field_k = var1 + 2000L;
                  return;
                }
                this.field_l = Math.min(this.field_g, this.field_i);
                this.field_g = this.field_i;
              }
              this.field_i = 0;
              this.field_m = var1 + 2000L;
            }
            this.field_o = var3_int;
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

    PcmPlayerService() {
        this.field_j = false;
        this.field_q = 32;
        this.field_e = je.correctedCurrentTimeMillis(1);
        this.field_n = true;
        this.field_m = 0L;
        this.field_o = 0;
        this.field_r = new PcmStream[8];
        this.field_k = 0L;
        this.field_g = 0;
        this.field_i = 0;
        this.field_b = new PcmStream[8];
        this.field_c = 0;
    }
}
