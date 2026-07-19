/*
 * Decompiled by CFR-JS 0.4.0.
 */
class b {
    int[] field_s;
    static boolean field_j;
    private int field_u;
    private static int field_l;
    private long field_i;
    private boolean field_c;
    private static fd field_t;
    static int field_r;
    private lk field_q;
    private int field_m;
    private int field_p;
    private lk[] field_g;
    private lk[] field_e;
    private int field_d;
    private boolean field_n;
    private long field_o;
    private int field_a;
    private int field_h;
    private int field_f;
    private int field_b;
    private long field_k;

    final synchronized void b(lk param0) {
        this.field_q = param0;
    }

    final synchronized void e() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (!this.field_c) {
              var1 = rf.c(0);
              try {
                L0: {
                  L1: {
                    if (var1 <= this.field_i + 6000L) {
                      break L1;
                    } else {
                      this.field_i = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= this.field_i + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      this.field_i = this.field_i + (long)(256000 / field_r);
                      var1 = rf.c(0);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  this.field_i = var1;
                  break L3;
                }
              }
              if (this.field_s != null) {
                try {
                  L4: {
                    L5: {
                      if (this.field_k == 0L) {
                        break L5;
                      } else {
                        if (var1 >= this.field_k) {
                          this.a(this.field_f);
                          this.field_k = 0L;
                          this.field_n = true;
                          break L5;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      var3_int = this.c();
                      if (this.field_p - var3_int <= this.field_d) {
                        break L6;
                      } else {
                        this.field_d = this.field_p - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = this.field_m + this.field_b;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= this.field_f) {
                        break L8;
                      } else {
                        L9: {
                          this.field_f = this.field_f + 1024;
                          if (this.field_f <= 16384) {
                            break L9;
                          } else {
                            this.field_f = 16384;
                            break L9;
                          }
                        }
                        this.d();
                        this.a(this.field_f);
                        var3_int = 0;
                        this.field_n = true;
                        if (var4 + 256 <= this.field_f) {
                          break L8;
                        } else {
                          var4 = this.field_f - 256;
                          this.field_b = var4 - this.field_m;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= this.field_o) {
                            break L11;
                          } else {
                            L12: {
                              if (this.field_n) {
                                this.field_n = false;
                                break L12;
                              } else {
                                L13: {
                                  if (this.field_d != 0) {
                                    break L13;
                                  } else {
                                    if (this.field_a != 0) {
                                      break L13;
                                    } else {
                                      this.d();
                                      this.field_k = var1 + 2000L;
                                      decompiledRegionSelector0 = 1;
                                      break L4;
                                    }
                                  }
                                }
                                this.field_b = Math.min(this.field_a, this.field_d);
                                this.field_a = this.field_d;
                                break L12;
                              }
                            }
                            this.field_d = 0;
                            this.field_o = var1 + 2000L;
                            break L11;
                          }
                        }
                        this.field_p = var3_int;
                        decompiledRegionSelector0 = 2;
                        break L4;
                      } else {
                        this.a(this.field_s, 256);
                        this.f();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    this.d();
                    this.field_k = var1 + 2000L;
                    decompiledRegionSelector0 = 2;
                    break L14;
                  }
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

    void d() {
    }

    void f() throws Exception {
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < 8000) {
            break L0;
          } else {
            if (param0 <= 48000) {
              L1: {
                field_r = param0;
                if (!param1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              field_j = stackIn_7_0 != 0;
              field_l = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void a(int param0) throws Exception {
    }

    int c() throws Exception {
        return this.field_f;
    }

    final static b a(ab param0, java.awt.Component param1, int param2, int param3) {
        try {
            ei discarded$2 = null;
            sl var4 = null;
            Throwable var4_ref = null;
            sl var5 = null;
            sl stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            sl stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            sl stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            sl stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            sl stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            sl stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            sl stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            sl stackOut_20_0 = null;
            if (field_r != 0) {
              L0: {
                if (param2 < 0) {
                  break L0;
                } else {
                  if (param2 < 2) {
                    L1: {
                      if (param3 >= 256) {
                        break L1;
                      } else {
                        param3 = 256;
                        break L1;
                      }
                    }
                    try {
                      L2: {
                        L3: {
                          var5 = new sl();
                          var4 = var5;
                          stackOut_8_0 = (sl) (var4);
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_j) {
                            stackOut_10_0 = (sl) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (sl) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((b) ((Object) stackIn_11_0)).field_s = new int[stackIn_11_1 * stackIn_11_2];
                          ((b) ((Object) var4)).field_m = param3;
                          ((b) ((Object) var4)).a(param1);
                          ((b) ((Object) var4)).field_f = (param3 & -1024) + 1024;
                          if (((b) ((Object) var4)).field_f <= 16384) {
                            break L4;
                          } else {
                            ((b) ((Object) var4)).field_f = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((b) ((Object) var4)).a(((b) ((Object) var4)).field_f);
                          if (field_l <= 0) {
                            break L5;
                          } else {
                            if (field_t != null) {
                              break L5;
                            } else {
                              field_t = new fd();
                              field_t.field_b = param0;
                              discarded$2 = param0.a((Runnable) ((Object) field_t), false, field_l);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_t == null) {
                            break L6;
                          } else {
                            if (field_t.field_f[param2] == null) {
                              field_t.field_f[param2] = (b) ((Object) var5);
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (sl) (var4);
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new b();
                    }
                    return (b) ((Object) stackIn_21_0);
                  } else {
                    break L0;
                  }
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

    private final void b(int param0) {
        this.field_h = this.field_h - param0;
        if (this.field_h < 0) {
            this.field_h = 0;
        }
        if (this.field_q != null) {
            this.field_q.a(param0);
            return;
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        lk var7 = null;
        int var8_int = 0;
        lk[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        lk var11 = null;
        kh var12 = null;
        int var13 = 0;
        lk var14 = null;
        lk var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_j) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          o.a(param0, 0, var3);
          this.field_h = this.field_h - param1;
          if (this.field_q == null) {
            break L1;
          } else {
            if (this.field_h > 0) {
              break L1;
            } else {
              this.field_h = this.field_h + (field_r >> 4);
              b.a(this.field_q);
              this.a(this.field_q, this.field_q.c());
              var4 = 0;
              var5 = 255;
              var6 = 7;
              L2: while (true) {
                L3: {
                  if (var5 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (var6 >= 0) {
                        var7_int = var6;
                        var8_int = 0;
                        break L4;
                      } else {
                        var7_int = var6 & 3;
                        var8_int = -(var6 >> 2);
                        break L4;
                      }
                    }
                    var9 = var5 >>> var7_int & 286331153;
                    L5: while (true) {
                      if (var9 != 0) {
                        L6: {
                          if ((var9 & 1) != 0) {
                            var5 = var5 & (1 << var7_int ^ -1);
                            var10 = null;
                            var11 = this.field_g[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_k;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_h <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11 = var11.field_i;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_j = true;
                                  var13 = var11.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_h = var12.field_h + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < this.field_u) {
                                  L10: {
                                    var14 = var11.d();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_h;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11.b();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_i;
                                    var11.field_i = null;
                                    if (var10 != null) {
                                      ((lk) (var10)).field_i = var15;
                                      break L12;
                                    } else {
                                      this.field_g[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      this.field_e[var7_int] = (lk) (var10);
                                      break L13;
                                    }
                                  }
                                  var11 = var15;
                                  continue L7;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        var7_int += 4;
                        var8_int++;
                        var9 = var9 >>> 4;
                        continue L5;
                      } else {
                        var6--;
                        continue L2;
                      }
                    }
                  }
                }
                var6 = 0;
                L14: while (true) {
                  if (var6 >= 8) {
                    break L1;
                  } else {
                    var7 = this.field_g[var6];
                    var8 = this.field_g;
                    var9 = var6;
                    this.field_e[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_i;
                        var7.field_i = null;
                        var7 = (lk) (var10);
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L16: {
          if (this.field_h >= 0) {
            break L16;
          } else {
            this.field_h = 0;
            break L16;
          }
        }
        L17: {
          if (this.field_q == null) {
            break L17;
          } else {
            this.field_q.b(param0, 0, param1);
            break L17;
          }
        }
        this.field_i = rf.c(0);
    }

    private final void a(lk param0, int param1) {
        int var3 = param1 >> 5;
        lk var4 = this.field_e[var3];
        if (var4 == null) {
            this.field_g[var3] = param0;
        } else {
            var4.field_i = param0;
        }
        this.field_e[var3] = param0;
        param0.field_h = param1;
    }

    private final static void a(lk param0) {
        param0.field_j = false;
        if (param0.field_k != null) {
            param0.field_k.field_h = 0;
        }
        lk var1 = param0.d();
        while (var1 != null) {
            b.a(var1);
            var1 = param0.b();
        }
    }

    public static void b() {
        field_t = null;
    }

    final synchronized void a() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_t == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_t.field_d = true;
                  L2: while (true) {
                    if (!field_t.field_c) {
                      field_t = null;
                      break L0;
                    } else {
                      ge.a(0, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if (field_t.field_f[var2] != this) {
                    break L3;
                  } else {
                    field_t.field_f[var2] = null;
                    break L3;
                  }
                }
                if (field_t.field_f[var2] != null) {
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
        this.d();
        this.field_s = null;
        this.field_c = true;
    }

    b() {
        this.field_u = 32;
        this.field_c = false;
        this.field_i = rf.c(0);
        this.field_p = 0;
        this.field_d = 0;
        this.field_o = 0L;
        this.field_h = 0;
        this.field_e = new lk[8];
        this.field_g = new lk[8];
        this.field_n = true;
        this.field_k = 0L;
        this.field_a = 0;
    }
}
