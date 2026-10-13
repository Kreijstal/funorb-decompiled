/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PcmPlayer {
    int[] samples;
    private int field_j;
    static int sampleRate;
    private long field_m;
    private AudioStream rootStream;
    private static int field_l;
    private static aq field_c;
    private boolean field_d;
    static boolean stereo;
    private int field_i;
    private long field_r;
    private AudioStream[] priorityHeads;
    private int field_f;
    private int field_h;
    private int field_o;
    private AudioStream[] priorityTails;
    private int field_a;
    private long field_b;
    private int field_t;
    private boolean field_k;
    private int field_s;

    void h() throws Exception {
    }

    final synchronized void c() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_d) {
            return;
          }
          var1 = MonotonicTime.nowMillis(false);
          try {
            if (var1 > this.field_m + 6000L) {
              this.field_m = var1 - 6000L;
            }
            while (var1 > this.field_m + 5000L) {
              this.a(256);
              this.field_m = this.field_m + (long)(256000 / sampleRate);
              var1 = MonotonicTime.nowMillis(false);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_m = var1;
          }
          if (this.samples == null) {
            return;
          }
          try {
            if (this.field_r != 0L) {
              if (var1 < this.field_r) {
                return;
              }
              this.b(this.field_a);
              this.field_r = 0L;
              this.field_k = true;
            }
            var3_int = this.a();
            if (this.field_h - var3_int > this.field_t) {
              this.field_t = this.field_h - var3_int;
            }
            var4 = this.field_s + this.field_o;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_a) {
              this.field_a = this.field_a + 1024;
              if (this.field_a > 16384) {
                this.field_a = 16384;
              }
              this.d();
              this.b(this.field_a);
              var3_int = 0;
              this.field_k = true;
              if (var4 + 256 > this.field_a) {
                var4 = this.field_a - 256;
                this.field_o = var4 - this.field_s;
              }
            }
            while (var3_int < var4) {
              this.a(this.samples, 256);
              this.e();
              var3_int += 256;
            }
            if (var1 > this.field_b) {
              if (this.field_k) {
                this.field_k = false;
              } else {
                if (this.field_t == 0 &&
                  this.field_f == 0) {
                  this.d();
                  this.field_r = var1 + 2000L;
                  return;
                }
                this.field_o = Math.min(this.field_f, this.field_t);
                this.field_f = this.field_t;
              }
              this.field_t = 0;
              this.field_b = var1 + 2000L;
            }
            this.field_h = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.d();
            this.field_r = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        AudioStream[] var8;
        int var9;
        Object var10;
        AudioStream var11;
        AudioData var12;
        int var13;
        AudioStream var14;
        int var15_int;
        AudioStream var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        AudioStream var14Lifetime1;
        AudioStream var14Lifetime2;
        var3 = param1;
        if (stereo) {
          var3 = var3 << 1;
        }
        pm.a(param0, 0, var3);
        this.field_i = this.field_i - param1;
        if (this.rootStream != null &&
          this.field_i <= 0) {
          this.field_i = this.field_i + (sampleRate >> 4);
          PcmPlayer.resetSchedulingTree(this.rootStream);
          this.enqueueStream(this.rootStream, this.rootStream.getPriority());
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
                  var11 = this.priorityHeads[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.data;
                    if (var12 != null &&
                      var12.schedulerUsage > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.schedulerNext;
                      continue;
                    }
                    var11.enabled = true;
                    var13 = var11.getSchedulingCost();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.schedulerUsage = var12.schedulerUsage + var13;
                    }
                    if (var4 >= this.field_j) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.schedulerPriority;
                      while (var14Lifetime2 != null) {
                        this.enqueueStream(var14Lifetime2, var15_int * var14Lifetime2.getPriority() >> 8);
                        var14Lifetime2 = var11.nextSubStream();
                      }
                    }
                    var15 = var11.schedulerNext;
                    var11.schedulerNext = null;
                    if (var10 != null) {
                      ((AudioStream) (var10)).schedulerNext = var15;
                    } else {
                      this.priorityHeads[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.priorityTails[var7_int] = (AudioStream) (var10);
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
            var7 = this.priorityHeads[var6Lifetime1];
            var8 = this.priorityHeads;
            var9Lifetime1 = var6Lifetime1;
            this.priorityTails[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((AudioStream) (var7)).schedulerNext;
              ((AudioStream) (var7)).schedulerNext = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_i < 0) {
          this.field_i = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.fill(param0, 0, param1);
        }
        this.field_m = MonotonicTime.nowMillis(false);
    }

    public static void g() {
        field_c = null;
    }

    private final void enqueueStream(AudioStream stream, int priority) {
        int var3 = priority >> 5;
        AudioStream var4 = this.priorityTails[var3];
        if (var4 == null) {
          this.priorityHeads[var3] = stream;
        } else {
          var4.schedulerNext = stream;
        }
        this.priorityTails[var3] = stream;
        stream.schedulerPriority = priority;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        sampleRate = param0;
        stereo = param1 ? true : false;
        field_l = param2;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void e() throws Exception {
    }

    final static PcmPlayer a(PlatformServices param0, java.awt.Component param1, int param2, int param3) {
        try {
          pd var4 = null;
          Throwable var4_ref = null;
          pd var5 = null;
          pd stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          pd stackIn_21_0 = null;
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
              var5 = new pd();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!stereo) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((PcmPlayer) ((Object) stackIn_10_0)).samples = new int[stackIn_10_1 * stackIn_11_2];
              ((PcmPlayer) ((Object) var4)).field_s = param3;
              ((PcmPlayer) ((Object) var4)).a(param1);
              ((PcmPlayer) ((Object) var4)).field_a = (param3 & -1024) + 1024;
              if (((PcmPlayer) ((Object) var4)).field_a > 16384) {
                ((PcmPlayer) ((Object) var4)).field_a = 16384;
              }
              ((PcmPlayer) ((Object) var4)).b(((PcmPlayer) ((Object) var4)).field_a);
              if (field_l > 0 &&
                field_c == null) {
                field_c = new aq();
                field_c.field_c = param0;
                param0.startThread(field_l, (Runnable) ((Object) field_c), (byte) -94);
              }
              if (field_c != null) {
                if (field_c.field_d[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_c.field_d[param2] = (PcmPlayer) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (PcmPlayer) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new PcmPlayer();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void resetSchedulingTree(AudioStream stream) {
        stream.enabled = false;
        if (stream.data != null) {
          stream.data.schedulerUsage = 0;
        }
        AudioStream child = stream.firstSubStream();
        while (child != null) {
          PcmPlayer.resetSchedulingTree(child);
          child = stream.nextSubStream();
        }
    }

    void d() {
    }

    final synchronized void setRootStream(AudioStream stream) {
        this.rootStream = stream;
    }

    void b(int param0) throws Exception {
    }

    final synchronized void f() {
        int var2 = 0;
        int var1;
        if (field_c != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_c.field_d[var2] == this) {
              field_c.field_d[var2] = null;
            }
            if (field_c.field_d[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_c.field_a = true;
            while (field_c.field_b) {
              wj.sleepMillis(-125, 50L);
            }
            field_c = null;
          }
        }
        this.d();
        this.samples = null;
        this.field_d = true;
    }

    private final void a(int param0) {
        this.field_i = this.field_i - param0;
        if (this.field_i < 0) {
          this.field_i = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.skip(param0);
          return;
        }
    }

    int a() throws Exception {
        return this.field_a;
    }

    final synchronized void b() {
        try {
          this.field_k = true;
          try {
            this.h();
          } catch (Exception exception) {
            this.d();
            this.field_r = MonotonicTime.nowMillis(false) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    PcmPlayer() {
        this.field_j = 32;
        this.field_d = false;
        this.field_m = MonotonicTime.nowMillis(false);
        this.field_r = 0L;
        this.priorityHeads = new AudioStream[8];
        this.field_b = 0L;
        this.priorityTails = new AudioStream[8];
        this.field_i = 0;
        this.field_f = 0;
        this.field_k = true;
        this.field_h = 0;
        this.field_t = 0;
    }
}
