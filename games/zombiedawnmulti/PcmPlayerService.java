/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PcmPlayerService {
    private static int field_b;
    static boolean field_j;
    private boolean field_r;
    private int field_e;
    private PcmStream field_s;
    static int sampleRate;
    private static tg field_q;
    private long field_i;
    int[] field_l;
    private int field_a;
    private int field_f;
    private int field_h;
    private long field_d;
    private int field_u;
    private long field_o;
    private int field_n;
    private int field_m;
    private PcmStream[] field_t;
    private PcmStream[] field_k;
    private boolean field_g;
    private int field_c;

    private final static void deactivateTree(PcmStream param0) {
        param0.field_f = false;
        if (param0.field_i != null) {
          param0.field_i.field_f = 0;
        }
        PcmStream var1 = param0.firstSubStream();
        while (var1 != null) {
          PcmPlayerService.deactivateTree(var1);
          var1 = param0.d();
        }
    }

    final synchronized void flush() {
        try {
          this.field_g = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.field_o = bl.a((byte) 103) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void closeDevice() {
    }

    private final void addTimedStream(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_k[var3];
        if (var4 == null) {
          this.field_t[var3] = param0;
        } else {
          var4.field_h = param0;
        }
        this.field_k[var3] = param0;
        param0.field_g = param1;
    }

    final static PcmPlayerService create(PlatformTaskDispatcher param0, java.awt.Component param1, int param2, int param3) {
        try {
          JavaSoundAudioOutput var4 = null;
          Throwable var4_ref = null;
          JavaSoundAudioOutput var5 = null;
          JavaSoundAudioOutput stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          JavaSoundAudioOutput stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (sampleRate == 0) {
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
              if (!field_j) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((PcmPlayerService) ((Object) stackIn_10_0)).field_l = new int[stackIn_10_1 * stackIn_11_2];
              ((PcmPlayerService) ((Object) var4)).field_m = param3;
              ((PcmPlayerService) ((Object) var4)).initDevice(param1);
              ((PcmPlayerService) ((Object) var4)).field_a = (param3 & -1024) + 1024;
              if (((PcmPlayerService) ((Object) var4)).field_a > 16384) {
                ((PcmPlayerService) ((Object) var4)).field_a = 16384;
              }
              ((PcmPlayerService) ((Object) var4)).a(((PcmPlayerService) ((Object) var4)).field_a);
              if (field_b > 0 &&
                field_q == null) {
                field_q = new tg();
                field_q.field_b = param0;
                param0.a(22, (Runnable) ((Object) field_q), field_b);
              }
              if (field_q != null) {
                if (field_q.field_f[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_q.field_f[param2] = (PcmPlayerService) ((Object) var5);
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

    private final void skip(int param0) {
        this.field_h = this.field_h - param0;
        if (this.field_h < 0) {
          this.field_h = 0;
        }
        if (this.field_s != null) {
          this.field_s.skip(param0);
          return;
        }
    }

    void a(int param0) throws Exception {
    }

    final synchronized void service() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_r) {
            return;
          }
          var1 = bl.a((byte) 79);
          try {
            if (var1 > this.field_i + 6000L) {
              this.field_i = var1 - 6000L;
            }
            while (var1 > this.field_i + 5000L) {
              this.skip(256);
              this.field_i = this.field_i + (long)(256000 / sampleRate);
              var1 = bl.a((byte) 66);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_i = var1;
          }
          if (this.field_l == null) {
            return;
          }
          try {
            if (this.field_o != 0L) {
              if (var1 < this.field_o) {
                return;
              }
              this.a(this.field_a);
              this.field_o = 0L;
              this.field_g = true;
            }
            var3_int = this.queuedFrames();
            if (this.field_f - var3_int > this.field_c) {
              this.field_c = this.field_f - var3_int;
            }
            var4 = this.field_m + this.field_n;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_a) {
              this.field_a = this.field_a + 1024;
              if (this.field_a > 16384) {
                this.field_a = 16384;
              }
              this.closeDevice();
              this.a(this.field_a);
              var3_int = 0;
              this.field_g = true;
              if (var4 + 256 > this.field_a) {
                var4 = this.field_a - 256;
                this.field_n = var4 - this.field_m;
              }
            }
            while (var3_int < var4) {
              this.mix(this.field_l, 256);
              this.writeFrames();
              var3_int += 256;
            }
            if (var1 > this.field_d) {
              if (this.field_g) {
                this.field_g = false;
              } else {
                if (this.field_c == 0 &&
                  this.field_u == 0) {
                  this.closeDevice();
                  this.field_o = var1 + 2000L;
                  return;
                }
                this.field_n = Math.min(this.field_u, this.field_c);
                this.field_u = this.field_c;
              }
              this.field_c = 0;
              this.field_d = var1 + 2000L;
            }
            this.field_f = var3_int;
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

    int queuedFrames() throws Exception {
        return this.field_a;
    }

    final synchronized void close() {
        int var2 = 0;
        int var1;
        if (field_q != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_q.field_f[var2] == this) {
              field_q.field_f[var2] = null;
            }
            if (field_q.field_f[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_q.field_h = true;
            while (field_q.field_c) {
              vd.a(false, 50L);
            }
            field_q = null;
          }
        }
        this.closeDevice();
        this.field_l = null;
        this.field_r = true;
    }

    final static void configure(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        sampleRate = param0;
        field_j = param1 ? true : false;
        field_b = param2;
    }

    void flushDevice() throws Exception {
    }

    public static void releaseStatics() {
        field_q = null;
    }

    private final void mix(int[] param0, int param1) {
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
        if (field_j) {
          var3 = var3 << 1;
        }
        ArrayOperations.clearInts(param0, 0, var3);
        this.field_h = this.field_h - param1;
        if (this.field_s != null &&
          this.field_h <= 0) {
          this.field_h = this.field_h + (sampleRate >> 4);
          PcmPlayerService.deactivateTree(this.field_s);
          this.addTimedStream(this.field_s, this.field_s.priority());
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
                    var12 = var11.field_i;
                    if (var12 != null &&
                      var12.field_f > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_h;
                      continue;
                    }
                    var11.field_f = true;
                    var13 = var11.getSchedulingCost();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_f = var12.field_f + var13;
                    }
                    if (var4 >= this.field_e) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_g;
                      while (var14Lifetime2 != null) {
                        this.addTimedStream(var14Lifetime2, var15_int * var14Lifetime2.priority() >> 8);
                        var14Lifetime2 = var11.d();
                      }
                    }
                    var15 = var11.field_h;
                    var11.field_h = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_h = var15;
                    } else {
                      this.field_t[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_k[var7_int] = (PcmStream) (var10);
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
            this.field_k[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_h;
              ((PcmStream) (var7)).field_h = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_h < 0) {
          this.field_h = 0;
        }
        if (this.field_s != null) {
          this.field_s.mixInto(param0, 0, param1);
        }
        this.field_i = bl.a((byte) 108);
    }

    void writeFrames() throws Exception {
    }

    final synchronized void setSourceStream(PcmStream param0) {
        this.field_s = param0;
    }

    void initDevice(java.awt.Component param0) throws Exception {
    }

    PcmPlayerService() {
        this.field_r = false;
        this.field_e = 32;
        this.field_i = bl.a((byte) 98);
        this.field_o = 0L;
        this.field_d = 0L;
        this.field_h = 0;
        this.field_u = 0;
        this.field_k = new PcmStream[8];
        this.field_f = 0;
        this.field_t = new PcmStream[8];
        this.field_g = true;
        this.field_c = 0;
    }
}
