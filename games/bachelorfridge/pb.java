/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pb {
    private boolean field_t;
    static boolean field_q;
    private tda field_n;
    private static int field_k;
    private long field_m;
    private int field_b;
    static int field_j;
    int[] field_i;
    private boolean field_c;
    private int field_e;
    private int field_s;
    private tda[] field_f;
    private static kc field_u;
    private long field_p;
    private int field_o;
    private int field_a;
    private long field_l;
    private int field_h;
    private int field_d;
    private int field_r;
    private tda[] field_g;

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
                field_j = param0;
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
              field_q = stackIn_7_0 != 0;
              field_k = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final synchronized void b() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_u == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_u.field_e = true;
                  L2: while (true) {
                    if (!field_u.field_d) {
                      field_u = null;
                      break L0;
                    } else {
                      gda.a(false, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if (field_u.field_b[var2] != this) {
                    break L3;
                  } else {
                    field_u.field_b[var2] = null;
                    break L3;
                  }
                }
                if (field_u.field_b[var2] != null) {
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
        this.h();
        this.field_i = null;
        this.field_t = true;
    }

    private final static void b(tda param0) {
        param0.field_f = false;
        if (param0.field_h != null) {
            param0.field_h.field_f = 0;
        }
        tda var1 = param0.b();
        while (var1 != null) {
            pb.b(var1);
            var1 = param0.a();
        }
    }

    void e() throws Exception {
    }

    void a(int param0) throws Exception {
    }

    void g() throws Exception {
    }

    void h() {
    }

    private final void a(tda param0, int param1) {
        int var3 = param1 >> 5;
        tda var4 = this.field_f[var3];
        if (var4 == null) {
            this.field_g[var3] = param0;
        } else {
            var4.field_g = param0;
        }
        this.field_f[var3] = param0;
        param0.field_i = param1;
    }

    final static pb a(ht param0, java.awt.Component param1, int param2, int param3) {
        try {
            eh discarded$2 = null;
            na var4 = null;
            Throwable var4_ref = null;
            na var5 = null;
            na stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            na stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            na stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            na stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            na stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            na stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            na stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            na stackOut_20_0 = null;
            if (field_j != 0) {
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
                          var5 = new na();
                          var4 = var5;
                          stackOut_8_0 = (na) (var4);
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_q) {
                            stackOut_10_0 = (na) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (na) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((pb) ((Object) stackIn_11_0)).field_i = new int[stackIn_11_1 * stackIn_11_2];
                          ((pb) ((Object) var4)).field_o = param3;
                          ((pb) ((Object) var4)).a(param1);
                          ((pb) ((Object) var4)).field_a = (param3 & -1024) + 1024;
                          if (((pb) ((Object) var4)).field_a <= 16384) {
                            break L4;
                          } else {
                            ((pb) ((Object) var4)).field_a = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((pb) ((Object) var4)).a(((pb) ((Object) var4)).field_a);
                          if (field_k <= 0) {
                            break L5;
                          } else {
                            if (field_u != null) {
                              break L5;
                            } else {
                              field_u = new kc();
                              field_u.field_c = param0;
                              discarded$2 = param0.a((Runnable) ((Object) field_u), 2, field_k);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_u == null) {
                            break L6;
                          } else {
                            if (field_u.field_b[param2] == null) {
                              field_u.field_b[param2] = (pb) ((Object) var5);
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (na) (var4);
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new pb();
                    }
                    return (pb) ((Object) stackIn_21_0);
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
        field_u = null;
    }

    private final void b(int param0) {
        this.field_s = this.field_s - param0;
        if (this.field_s < 0) {
            this.field_s = 0;
        }
        if (this.field_n != null) {
            this.field_n.a(param0);
            return;
        }
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        tda var7 = null;
        int var8_int = 0;
        tda[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        tda var11 = null;
        lj var12 = null;
        int var13 = 0;
        tda var14 = null;
        tda var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_q) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          bl.a(param0, 0, var3);
          this.field_s = this.field_s - param1;
          if (this.field_n == null) {
            break L1;
          } else {
            if (this.field_s > 0) {
              break L1;
            } else {
              this.field_s = this.field_s + (field_j >> 4);
              pb.b(this.field_n);
              this.a(this.field_n, this.field_n.c());
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
                                  var12 = var11.field_h;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_f <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11 = var11.field_g;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_f = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_f = var12.field_f + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < this.field_b) {
                                  L10: {
                                    var14 = var11.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_i;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11.a();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_g;
                                    var11.field_g = null;
                                    if (var10 != null) {
                                      ((tda) (var10)).field_g = var15;
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
                                      this.field_f[var7_int] = (tda) (var10);
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
                    this.field_f[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_g;
                        var7.field_g = null;
                        var7 = (tda) (var10);
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
          if (this.field_s >= 0) {
            break L16;
          } else {
            this.field_s = 0;
            break L16;
          }
        }
        L17: {
          if (this.field_n == null) {
            break L17;
          } else {
            this.field_n.a(param0, 0, param1);
            break L17;
          }
        }
        this.field_m = f.b((byte) 73);
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void c() {
        try {
            this.field_c = true;
            try {
                this.e();
            } catch (Exception exception) {
                this.h();
                this.field_p = f.b((byte) 73) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    int a() throws Exception {
        return this.field_a;
    }

    final synchronized void f() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (!this.field_t) {
              var1 = f.b((byte) 73);
              try {
                L0: {
                  L1: {
                    if (var1 <= this.field_m + 6000L) {
                      break L1;
                    } else {
                      this.field_m = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= this.field_m + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      this.field_m = this.field_m + (long)(256000 / field_j);
                      var1 = f.b((byte) 73);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  this.field_m = var1;
                  break L3;
                }
              }
              if (this.field_i != null) {
                try {
                  L4: {
                    L5: {
                      if (this.field_p == 0L) {
                        break L5;
                      } else {
                        if (var1 >= this.field_p) {
                          this.a(this.field_a);
                          this.field_p = 0L;
                          this.field_c = true;
                          break L5;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      var3_int = this.a();
                      if (this.field_h - var3_int <= this.field_e) {
                        break L6;
                      } else {
                        this.field_e = this.field_h - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = this.field_o + this.field_r;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= this.field_a) {
                        break L8;
                      } else {
                        L9: {
                          this.field_a = this.field_a + 1024;
                          if (this.field_a <= 16384) {
                            break L9;
                          } else {
                            this.field_a = 16384;
                            break L9;
                          }
                        }
                        this.h();
                        this.a(this.field_a);
                        var3_int = 0;
                        this.field_c = true;
                        if (var4 + 256 <= this.field_a) {
                          break L8;
                        } else {
                          var4 = this.field_a - 256;
                          this.field_r = var4 - this.field_o;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= this.field_l) {
                            break L11;
                          } else {
                            L12: {
                              if (this.field_c) {
                                this.field_c = false;
                                break L12;
                              } else {
                                L13: {
                                  if (this.field_e != 0) {
                                    break L13;
                                  } else {
                                    if (this.field_d != 0) {
                                      break L13;
                                    } else {
                                      this.h();
                                      this.field_p = var1 + 2000L;
                                      decompiledRegionSelector0 = 1;
                                      break L4;
                                    }
                                  }
                                }
                                this.field_r = Math.min(this.field_d, this.field_e);
                                this.field_d = this.field_e;
                                break L12;
                              }
                            }
                            this.field_e = 0;
                            this.field_l = var1 + 2000L;
                            break L11;
                          }
                        }
                        this.field_h = var3_int;
                        decompiledRegionSelector0 = 2;
                        break L4;
                      } else {
                        this.a(this.field_i, 256);
                        this.g();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    this.h();
                    this.field_p = var1 + 2000L;
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

    final synchronized void a(tda param0) {
        this.field_n = param0;
    }

    pb() {
        this.field_t = false;
        this.field_b = 32;
        this.field_m = f.b((byte) 73);
        this.field_p = 0L;
        this.field_e = 0;
        this.field_s = 0;
        this.field_f = new tda[8];
        this.field_d = 0;
        this.field_c = true;
        this.field_l = 0L;
        this.field_h = 0;
        this.field_g = new tda[8];
    }
}
