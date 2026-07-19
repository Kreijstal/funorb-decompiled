/*
 * Decompiled by CFR-JS 0.4.0.
 */
class c {
    private int field_g;
    static int field_l;
    private k field_s;
    int[] field_p;
    private boolean field_e;
    private long field_a;
    private static bk field_q;
    private static int field_n;
    private int field_d;
    private int field_t;
    private k[] field_b;
    private long field_k;
    private int field_i;
    private int field_j;
    private long field_f;
    private int field_c;
    private boolean field_m;
    private int field_u;
    static boolean field_r;
    private k[] field_o;
    private int field_h;

    int a() throws Exception {
        return this.field_t;
    }

    final synchronized void f() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_q == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_q.field_g = true;
                  L2: while (true) {
                    if (!field_q.field_e) {
                      field_q = null;
                      break L0;
                    } else {
                      tg.a(50L, false);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if (field_q.field_f[var2] != this) {
                    break L3;
                  } else {
                    field_q.field_f[var2] = null;
                    break L3;
                  }
                }
                if (field_q.field_f[var2] != null) {
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
        this.c();
        this.field_p = null;
        this.field_e = true;
    }

    void b() throws Exception {
    }

    final static c a(vh param0, java.awt.Component param1, int param2, int param3) {
        try {
            jh discarded$2 = null;
            ch var4 = null;
            Throwable var4_ref = null;
            ch var5 = null;
            ch stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ch stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ch stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ch stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ch stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ch stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ch stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ch stackOut_20_0 = null;
            if (field_l != 0) {
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
                          var5 = new ch();
                          var4 = var5;
                          stackOut_8_0 = (ch) (var4);
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_r) {
                            stackOut_10_0 = (ch) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (ch) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((c) ((Object) stackIn_11_0)).field_p = new int[stackIn_11_1 * stackIn_11_2];
                          ((c) ((Object) var4)).field_c = param3;
                          ((c) ((Object) var4)).a(param1);
                          ((c) ((Object) var4)).field_t = (param3 & -1024) + 1024;
                          if (((c) ((Object) var4)).field_t <= 16384) {
                            break L4;
                          } else {
                            ((c) ((Object) var4)).field_t = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((c) ((Object) var4)).b(((c) ((Object) var4)).field_t);
                          if (field_n <= 0) {
                            break L5;
                          } else {
                            if (field_q != null) {
                              break L5;
                            } else {
                              field_q = new bk();
                              field_q.field_c = param0;
                              discarded$2 = param0.a((byte) -68, (Runnable) ((Object) field_q), field_n);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_q == null) {
                            break L6;
                          } else {
                            if (field_q.field_f[param2] == null) {
                              field_q.field_f[param2] = (c) ((Object) var5);
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (ch) (var4);
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new c();
                    }
                    return (c) ((Object) stackIn_21_0);
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

    public static void d() {
        field_q = null;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        k var7 = null;
        int var8_int = 0;
        k[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        k var11 = null;
        kf var12 = null;
        int var13 = 0;
        k var14 = null;
        k var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_r) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          g.a(param0, 0, var3);
          this.field_h = this.field_h - param1;
          if (this.field_s == null) {
            break L1;
          } else {
            if (this.field_h > 0) {
              break L1;
            } else {
              this.field_h = this.field_h + (field_l >> 4);
              c.b(this.field_s);
              this.a(this.field_s, this.field_s.b());
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
                            var11 = this.field_b[var7_int];
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
                                    if (var12.field_i <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11 = var11.field_j;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_i = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_i = var12.field_i + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < this.field_g) {
                                  L10: {
                                    var14 = var11.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_l;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.b() >> 8);
                                          var14 = var11.c();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_j;
                                    var11.field_j = null;
                                    if (var10 != null) {
                                      ((k) (var10)).field_j = var15;
                                      break L12;
                                    } else {
                                      this.field_b[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      this.field_o[var7_int] = (k) (var10);
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
                    var7 = this.field_b[var6];
                    var8 = this.field_b;
                    var9 = var6;
                    this.field_o[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_j;
                        var7.field_j = null;
                        var7 = (k) (var10);
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
          if (this.field_s == null) {
            break L17;
          } else {
            this.field_s.a(param0, 0, param1);
            break L17;
          }
        }
        this.field_a = d.a((byte) 102);
    }

    private final void a(int param0) {
        this.field_h = this.field_h - param0;
        if (this.field_h < 0) {
            this.field_h = 0;
        }
        if (this.field_s != null) {
            this.field_s.a(param0);
            return;
        }
    }

    final synchronized void a(k param0) {
        this.field_s = param0;
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
                field_l = param0;
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
              field_r = stackIn_7_0 != 0;
              field_n = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void c() {
    }

    final synchronized void e() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (!this.field_e) {
              var1 = d.a((byte) 64);
              try {
                L0: {
                  L1: {
                    if (var1 <= this.field_a + 6000L) {
                      break L1;
                    } else {
                      this.field_a = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= this.field_a + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      this.field_a = this.field_a + (long)(256000 / field_l);
                      var1 = d.a((byte) 87);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  this.field_a = var1;
                  break L3;
                }
              }
              if (this.field_p != null) {
                try {
                  L4: {
                    L5: {
                      if (this.field_f == 0L) {
                        break L5;
                      } else {
                        if (var1 >= this.field_f) {
                          this.b(this.field_t);
                          this.field_f = 0L;
                          this.field_m = true;
                          break L5;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      var3_int = this.a();
                      if (this.field_d - var3_int <= this.field_u) {
                        break L6;
                      } else {
                        this.field_u = this.field_d - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = this.field_c + this.field_i;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= this.field_t) {
                        break L8;
                      } else {
                        L9: {
                          this.field_t = this.field_t + 1024;
                          if (this.field_t <= 16384) {
                            break L9;
                          } else {
                            this.field_t = 16384;
                            break L9;
                          }
                        }
                        this.c();
                        this.b(this.field_t);
                        var3_int = 0;
                        this.field_m = true;
                        if (var4 + 256 <= this.field_t) {
                          break L8;
                        } else {
                          var4 = this.field_t - 256;
                          this.field_i = var4 - this.field_c;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= this.field_k) {
                            break L11;
                          } else {
                            L12: {
                              if (this.field_m) {
                                this.field_m = false;
                                break L12;
                              } else {
                                L13: {
                                  if (this.field_u != 0) {
                                    break L13;
                                  } else {
                                    if (this.field_j != 0) {
                                      break L13;
                                    } else {
                                      this.c();
                                      this.field_f = var1 + 2000L;
                                      decompiledRegionSelector0 = 1;
                                      break L4;
                                    }
                                  }
                                }
                                this.field_i = Math.min(this.field_j, this.field_u);
                                this.field_j = this.field_u;
                                break L12;
                              }
                            }
                            this.field_u = 0;
                            this.field_k = var1 + 2000L;
                            break L11;
                          }
                        }
                        this.field_d = var3_int;
                        decompiledRegionSelector0 = 2;
                        break L4;
                      } else {
                        this.a(this.field_p, 256);
                        this.b();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    this.c();
                    this.field_f = var1 + 2000L;
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

    private final void a(k param0, int param1) {
        int var3 = param1 >> 5;
        k var4 = this.field_o[var3];
        if (var4 == null) {
            this.field_b[var3] = param0;
        } else {
            var4.field_j = param0;
        }
        this.field_o[var3] = param0;
        param0.field_l = param1;
    }

    private final static void b(k param0) {
        param0.field_i = false;
        if (param0.field_k != null) {
            param0.field_k.field_i = 0;
        }
        k var1 = param0.a();
        while (var1 != null) {
            c.b(var1);
            var1 = param0.c();
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void b(int param0) throws Exception {
    }

    c() {
        this.field_g = 32;
        this.field_e = false;
        this.field_a = d.a((byte) 120);
        this.field_j = 0;
        this.field_d = 0;
        this.field_f = 0L;
        this.field_k = 0L;
        this.field_b = new k[8];
        this.field_u = 0;
        this.field_m = true;
        this.field_o = new k[8];
        this.field_h = 0;
    }
}
