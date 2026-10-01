/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    static boolean field_q;
    private static kh field_r;
    private long field_n;
    private boolean field_h;
    private int field_l;
    int[] field_c;
    private static int field_d;
    private ia field_k;
    static int field_j;
    private ia[] field_a;
    private int field_g;
    private int field_f;
    private long field_e;
    private int field_t;
    private boolean field_o;
    private long field_m;
    private int field_u;
    private ia[] field_b;
    private int field_p;
    private int field_s;
    private int field_i;

    void e() throws Exception {
    }

    final static AudioOutput a(d param0, java.awt.Component param1, int param2, int param3) {
        try {
            ce var4 = null;
            Throwable var4_ref = null;
            ce var5 = null;
            ce stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ce stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ce stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            if (field_j != 0) {
              if (param2 >= 0) {
                if (param2 < 2) {
                  if (param3 < 256) {
                    param3 = 256;
                  }
                  try {
                    var5 = new ce();
                    var4 = var5;
                    stackIn_10_0 = (ce) (var4);

                    stackIn_10_1 = 256;

                    if (!field_q) {
                      stackIn_11_0 = (ce) ((Object) stackIn_10_0);
                      stackIn_11_1 = stackIn_10_1;
                      stackIn_11_2 = 1;
                    } else {
                      stackIn_11_0 = (ce) ((Object) stackIn_10_0);
                      stackIn_11_1 = stackIn_10_1;
                      stackIn_11_2 = 2;
                    }
                    ((AudioOutput) ((Object) stackIn_11_0)).field_c = new int[stackIn_11_1 * stackIn_11_2];
                    ((AudioOutput) ((Object) var4)).field_i = param3;
                    ((AudioOutput) ((Object) var4)).a(param1);
                    ((AudioOutput) ((Object) var4)).field_g = (param3 & -1024) + 1024;
                    if (((AudioOutput) ((Object) var4)).field_g > 16384) {
                      ((AudioOutput) ((Object) var4)).field_g = 16384;
                    }
                    ((AudioOutput) ((Object) var4)).a(((AudioOutput) ((Object) var4)).field_g);
                    if (field_d > 0) {
                      if (field_r == null) {
                        field_r = new kh();
                        field_r.field_b = param0;
                        param0.a((Runnable) ((Object) field_r), 0, field_d);
                      }
                    }
                    if (field_r != null) {
                      if (field_r.field_g[param2] == null) {
                        field_r.field_g[param2] = (AudioOutput) ((Object) var5);
                      } else {
                        throw new IllegalArgumentException();
                      }
                    }
                    stackIn_21_0 = (ce) (var4);
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var4_ref = decompiledCaughtException;
                    return new AudioOutput();
                  }
                  return (AudioOutput) ((Object) stackIn_21_0);
                }
              }
              throw new IllegalArgumentException();
            } else {
              throw new IllegalStateException();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void a() {
        try {
            this.field_o = true;
            try {
                this.d();
            } catch (Exception exception) {
                this.f();
                this.field_m = oa.a(-12520) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(int param0) throws Exception {
    }

    final synchronized void c() {
        int var1;
        int var2;
        L0: {
          if (field_r != null) {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_r.field_f = true;
                  L2: while (field_r.field_c) {
                    bc.a(0, 50L);
                  }
                  field_r = null;
                  break L0;
                }
              } else {
                if (field_r.field_g[var2] == this) {
                  field_r.field_g[var2] = null;
                }
                if (field_r.field_g[var2] != null) {
                  var1 = 0;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
        this.f();
        this.field_c = null;
        this.field_h = true;
    }

    final synchronized void b(ia param0) {
        this.field_k = param0;
    }

    void d() throws Exception {
    }

    private final static void a(ia param0) {
        param0.field_f = false;
        if (param0.field_g != null) {
            param0.field_g.field_f = 0;
        }
        ia var1 = param0.b();
        while (var1 != null) {
            AudioOutput.a(var1);
            var1 = param0.c();
        }
    }

    public static void h() {
        field_r = null;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 || param0 > 48000) {
            throw new IllegalArgumentException();
        }
        field_j = param0;
        field_q = param1 ? true : false;
        field_d = param2;
    }

    final synchronized void b() {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            if (!this.field_h) {
              var1 = oa.a(-12520);
              try {
                L0: {
                  if (var1 > this.field_n + 6000L) {
                    this.field_n = var1 - 6000L;
                  }
                  L2: while (var1 > this.field_n + 5000L) {
                    this.b(256);
                    this.field_n = this.field_n + (long)(256000 / field_j);
                    var1 = oa.a(-12520);
                  }
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                this.field_n = var1;
              }
              if (this.field_c != null) {
                try {
                  L4: {
                    if (this.field_m != 0L) {
                      if (var1 >= this.field_m) {
                        this.a(this.field_g);
                        this.field_m = 0L;
                        this.field_o = true;
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L4;
                      }
                    }
                    var3_int = this.g();
                    if (this.field_t - var3_int > this.field_s) {
                      this.field_s = this.field_t - var3_int;
                    }
                    var4 = this.field_i + this.field_p;
                    if (var4 + 256 > 16384) {
                      var4 = 16128;
                    }
                    if (var4 + 256 > this.field_g) {
                      this.field_g = this.field_g + 1024;
                      if (this.field_g > 16384) {
                        this.field_g = 16384;
                      }
                      this.f();
                      this.a(this.field_g);
                      var3_int = 0;
                      this.field_o = true;
                      if (var4 + 256 > this.field_g) {
                        var4 = this.field_g - 256;
                        this.field_p = var4 - this.field_i;
                      }
                    }
                    L10: while (var3_int < var4) {
                      this.a(this.field_c, 256);
                      this.e();
                      var3_int += 256;
                    }
                    if (var1 > this.field_e) {
                      if (this.field_o) {
                        this.field_o = false;
                      } else {
                        if (this.field_s == 0) {
                          if (this.field_f == 0) {
                            this.f();
                            this.field_m = var1 + 2000L;
                            decompiledRegionSelector0 = 1;
                            break L4;
                          }
                        }
                        this.field_p = Math.min(this.field_f, this.field_s);
                        this.field_f = this.field_s;
                      }
                      this.field_s = 0;
                      this.field_e = var1 + 2000L;
                    }
                    this.field_t = var3_int;
                    decompiledRegionSelector0 = 2;
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  this.f();
                  this.field_m = var1 + 2000L;
                  decompiledRegionSelector0 = 2;
                }
                if (decompiledRegionSelector0 == 0) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(ia param0, int param1) {
        int var3 = param1 >> 5;
        ia var4 = this.field_b[var3];
        if (var4 == null) {
            this.field_a[var3] = param0;
        } else {
            var4.field_h = param0;
        }
        this.field_b[var3] = param0;
        param0.field_i = param1;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        ia[] var8;
        int var9;
        Object var10;
        ia var11;
        e var12;
        int var13;
        ia var14;
        int var15_int;
        ia var15;
        var3 = param1;
        if (field_q) {
          var3 = var3 << 1;
        }
        L1: {
          sf.a(param0, 0, var3);
          this.field_u = this.field_u - param1;
          if (this.field_k != null) {
            if (this.field_u <= 0) {
              this.field_u = this.field_u + (field_j >> 4);
              AudioOutput.a(this.field_k);
              this.a(this.field_k, this.field_k.a());
              var4 = 0;
              var5 = 255;
              var6 = 7;
              L2: while (true) {
                L3: {
                  if (var5 != 0) {
                    if (var6 >= 0) {
                      var7_int = var6;
                      var8_int = 0;
                    } else {
                      var7_int = var6 & 3;
                      var8_int = -(var6 >> 2);
                    }
                    var9 = var5 >>> var7_int & 286331153;
                    L5: while (var9 != 0) {
                      L6: {
                        if ((var9 & 1) != 0) {
                          var5 = var5 & (1 << var7_int ^ -1);
                          var10 = null;
                          var11 = this.field_a[var7_int];
                          var14 = var11;
                          var14 = var11;
                          L7: while (true) {
                            if (var11 == null) {
                              break L6;
                            } else {
                              var12 = var11.field_g;
                              if (var12 != null) {
                                if (var12.field_f > var8_int) {
                                  var5 = var5 | 1 << var7_int;
                                  var10 = var11;
                                  var11 = var11.field_h;
                                  continue L7;
                                }
                              }
                              var11.field_f = true;
                              var13 = var11.d();
                              var4 = var4 + var13;
                              if (var12 != null) {
                                var12.field_f = var12.field_f + var13;
                              }
                              if (var4 < this.field_l) {
                                L10: {
                                  var14 = var11.b();
                                  if (var14 != null) {
                                    var15_int = var11.field_i;
                                    L11: while (var14 != null) {
                                      this.a(var14, var15_int * var14.a() >> 8);
                                      var14 = var11.c();
                                    }
                                    break L10;
                                  }
                                }
                                var15 = var11.field_h;
                                var11.field_h = null;
                                if (var10 != null) {
                                  ((ia) (var10)).field_h = var15;
                                } else {
                                  this.field_a[var7_int] = var15;
                                }
                                if (var15 == null) {
                                  this.field_b[var7_int] = (ia) (var10);
                                }
                                var11 = var15;
                                continue L7;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      var7_int += 4;
                      var8_int++;
                      var9 = var9 >>> 4;
                    }
                    var6--;
                    continue L2;
                  }
                }
                for (var6 = 0; var6 < 8; var6++) {
                  var7 = this.field_a[var6];
                  var8 = this.field_a;
                  var9 = var6;
                  this.field_b[var6] = null;
                  var8[var9] = null;
                  L15: while (var7 != null) {
                    var10 = ((ia) (var7)).field_h;
                    ((ia) (var7)).field_h = null;
                    var7 = var10;
                  }
                }
                break L1;
              }
            }
          }
        }
        if (this.field_u < 0) {
          this.field_u = 0;
        }
        if (this.field_k != null) {
          this.field_k.a(param0, 0, param1);
        }
        this.field_n = oa.a(-12520);
    }

    private final void b(int param0) {
        this.field_u = this.field_u - param0;
        if (this.field_u < 0) {
            this.field_u = 0;
        }
        if (this.field_k != null) {
            this.field_k.b(param0);
            return;
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    int g() throws Exception {
        return this.field_g;
    }

    void f() {
    }

    AudioOutput() {
        this.field_h = false;
        this.field_l = 32;
        this.field_n = oa.a(-12520);
        this.field_o = true;
        this.field_a = new ia[8];
        this.field_t = 0;
        this.field_e = 0L;
        this.field_f = 0;
        this.field_m = 0L;
        this.field_s = 0;
        this.field_u = 0;
        this.field_b = new ia[8];
    }
}
