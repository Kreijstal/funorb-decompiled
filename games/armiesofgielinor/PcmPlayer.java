/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PcmPlayer {
    private static rh field_l;
    private int field_i;
    static boolean stereo;
    private boolean field_u;
    static int outputSampleRate;
    private long field_t;
    int[] field_k;
    private static int field_h;
    private PcmStream field_r;
    private int field_p;
    private int field_f;
    private long field_b;
    private int field_m;
    private PcmStream[] field_e;
    private long field_g;
    private PcmStream[] field_a;
    private int field_c;
    private int field_n;
    private int field_o;
    private boolean field_s;
    private int field_j;

    int h() throws Exception {
        return this.field_o;
    }

    void b() throws Exception {
    }

    private final void a(int param0) {
        this.field_n = this.field_n - param0;
        if (this.field_n < 0) {
          this.field_n = 0;
        }
        if (this.field_r != null) {
          this.field_r.skip(param0);
          return;
        }
    }

    private final void a(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_e[var3];
        if (var4 == null) {
          this.field_a[var3] = param0;
        } else {
          var4.schedulerNext = param0;
        }
        this.field_e[var3] = param0;
        param0.schedulerPriority = param1;
    }

    void e() {
    }

    private final static void deactivateStreamTree(PcmStream stream) {
        stream.active = false;
        if (stream.sound != null) {
          stream.sound.scheduledWork = 0;
        }
        PcmStream child = stream.firstSubStream();
        while (child != null) {
          PcmPlayer.deactivateStreamTree(child);
          child = stream.nextSubStream();
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void b(PcmStream param0) {
        this.field_r = param0;
    }

    final synchronized void f() {
        int var2 = 0;
        int var1;
        if (field_l != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_l.field_d[var2] == this) {
              field_l.field_d[var2] = null;
            }
            if (field_l.field_d[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_l.field_f = true;
            while (field_l.field_a) {
              nu.a(50L, 0);
            }
            field_l = null;
          }
        }
        this.e();
        this.field_k = null;
        this.field_u = true;
    }

    private final void a(int[] param0, int param1) {
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
        SoundData var12;
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
        if (stereo) {
          var3 = var3 << 1;
        }
        vm.a(param0, 0, var3);
        this.field_n = this.field_n - param1;
        if (this.field_r != null &&
          this.field_n <= 0) {
          this.field_n = this.field_n + (outputSampleRate >> 4);
          PcmPlayer.deactivateStreamTree(this.field_r);
          this.a(this.field_r, this.field_r.getPriority());
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
                  var11 = this.field_a[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.sound;
                    if (var12 != null &&
                      var12.scheduledWork > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.schedulerNext;
                      continue;
                    }
                    var11.active = true;
                    var13 = var11.getSchedulingCost();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.scheduledWork = var12.scheduledWork + var13;
                    }
                    if (var4 >= this.field_i) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.schedulerPriority;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.getPriority() >> 8);
                        var14Lifetime2 = var11.nextSubStream();
                      }
                    }
                    var15 = var11.schedulerNext;
                    var11.schedulerNext = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).schedulerNext = var15;
                    } else {
                      this.field_a[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_e[var7_int] = (PcmStream) (var10);
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
            var7 = this.field_a[var6Lifetime1];
            var8 = this.field_a;
            var9Lifetime1 = var6Lifetime1;
            this.field_e[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).schedulerNext;
              ((PcmStream) (var7)).schedulerNext = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_n < 0) {
          this.field_n = 0;
        }
        if (this.field_r != null) {
          this.field_r.render(param0, 0, param1);
        }
        this.field_t = vi.monotonicMillis(-121);
    }

    public static void g() {
        field_l = null;
    }

    final synchronized void c() {
        try {
          this.field_s = true;
          try {
            this.a();
          } catch (Exception exception) {
            this.e();
            this.field_g = vi.monotonicMillis(127) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a() throws Exception {
    }

    void b(int param0) throws Exception {
    }

    final static PcmPlayer a(PlatformTaskService param0, java.awt.Component param1, int param2, int param3) {
        try {
          mr var4 = null;
          Throwable var4_ref = null;
          mr var5 = null;
          mr stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          mr stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (outputSampleRate == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new mr();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!stereo) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((PcmPlayer) ((Object) stackIn_10_0)).field_k = new int[stackIn_10_1 * stackIn_11_2];
              ((PcmPlayer) ((Object) var4)).field_m = param3;
              ((PcmPlayer) ((Object) var4)).a(param1);
              ((PcmPlayer) ((Object) var4)).field_o = (param3 & -1024) + 1024;
              if (((PcmPlayer) ((Object) var4)).field_o > 16384) {
                ((PcmPlayer) ((Object) var4)).field_o = 16384;
              }
              ((PcmPlayer) ((Object) var4)).b(((PcmPlayer) ((Object) var4)).field_o);
              if (field_h > 0 &&
                field_l == null) {
                field_l = new rh();
                field_l.field_b = param0;
                param0.startThreadAsync(field_h, 0, (Runnable) ((Object) field_l));
              }
              if (field_l != null) {
                if (field_l.field_d[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_l.field_d[param2] = (PcmPlayer) ((Object) var5);
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

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        outputSampleRate = param0;
        stereo = param1 ? true : false;
        field_h = param2;
    }

    final synchronized void d() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_u) {
            return;
          }
          var1 = vi.monotonicMillis(101);
          try {
            if (var1 > this.field_t + 6000L) {
              this.field_t = var1 - 6000L;
            }
            while (var1 > this.field_t + 5000L) {
              this.a(256);
              this.field_t = this.field_t + (long)(256000 / outputSampleRate);
              var1 = vi.monotonicMillis(-116);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_t = var1;
          }
          if (this.field_k == null) {
            return;
          }
          try {
            if (this.field_g != 0L) {
              if (var1 < this.field_g) {
                return;
              }
              this.b(this.field_o);
              this.field_g = 0L;
              this.field_s = true;
            }
            var3_int = this.h();
            if (this.field_f - var3_int > this.field_c) {
              this.field_c = this.field_f - var3_int;
            }
            var4 = this.field_m + this.field_p;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_o) {
              this.field_o = this.field_o + 1024;
              if (this.field_o > 16384) {
                this.field_o = 16384;
              }
              this.e();
              this.b(this.field_o);
              var3_int = 0;
              this.field_s = true;
              if (var4 + 256 > this.field_o) {
                var4 = this.field_o - 256;
                this.field_p = var4 - this.field_m;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_k, 256);
              this.b();
              var3_int += 256;
            }
            if (var1 > this.field_b) {
              if (this.field_s) {
                this.field_s = false;
              } else {
                if (this.field_c == 0 &&
                  this.field_j == 0) {
                  this.e();
                  this.field_g = var1 + 2000L;
                  return;
                }
                this.field_p = Math.min(this.field_j, this.field_c);
                this.field_j = this.field_c;
              }
              this.field_c = 0;
              this.field_b = var1 + 2000L;
            }
            this.field_f = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.e();
            this.field_g = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    PcmPlayer() {
        this.field_u = false;
        this.field_i = 32;
        this.field_t = vi.monotonicMillis(-89);
        this.field_e = new PcmStream[8];
        this.field_g = 0L;
        this.field_n = 0;
        this.field_f = 0;
        this.field_a = new PcmStream[8];
        this.field_c = 0;
        this.field_b = 0L;
        this.field_j = 0;
        this.field_s = true;
    }
}
