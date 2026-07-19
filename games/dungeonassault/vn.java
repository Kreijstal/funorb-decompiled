/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vn {
    int[] field_q;
    private boolean field_u;
    private static int field_l;
    static boolean field_g;
    private static bk field_e;
    private long field_b;
    private int field_d;
    static int field_t;
    private qb field_h;
    private long field_o;
    private int field_a;
    private qb[] field_n;
    private int field_j;
    private long field_m;
    private int field_i;
    private int field_r;
    private qb[] field_p;
    private int field_s;
    private int field_f;
    private int field_c;
    private boolean field_k;

    final synchronized void a() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (!this.field_u) {
              var1 = kd.c(-2456);
              try {
                L0: {
                  L1: {
                    if (var1 <= this.field_b + 6000L) {
                      break L1;
                    } else {
                      this.field_b = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= this.field_b + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      this.field_b = this.field_b + (long)(256000 / field_t);
                      var1 = kd.c(-2456);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  this.field_b = var1;
                  break L3;
                }
              }
              if (this.field_q != null) {
                try {
                  L4: {
                    L5: {
                      if (this.field_o == 0L) {
                        break L5;
                      } else {
                        if (var1 >= this.field_o) {
                          this.b(this.field_j);
                          this.field_o = 0L;
                          this.field_k = true;
                          break L5;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      var3_int = this.f();
                      if (this.field_c - var3_int <= this.field_a) {
                        break L6;
                      } else {
                        this.field_a = this.field_c - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = this.field_f + this.field_s;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= this.field_j) {
                        break L8;
                      } else {
                        L9: {
                          this.field_j = this.field_j + 1024;
                          if (this.field_j <= 16384) {
                            break L9;
                          } else {
                            this.field_j = 16384;
                            break L9;
                          }
                        }
                        this.d();
                        this.b(this.field_j);
                        var3_int = 0;
                        this.field_k = true;
                        if (var4 + 256 <= this.field_j) {
                          break L8;
                        } else {
                          var4 = this.field_j - 256;
                          this.field_s = var4 - this.field_f;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= this.field_m) {
                            break L11;
                          } else {
                            L12: {
                              if (this.field_k) {
                                this.field_k = false;
                                break L12;
                              } else {
                                L13: {
                                  if (this.field_a != 0) {
                                    break L13;
                                  } else {
                                    if (this.field_i != 0) {
                                      break L13;
                                    } else {
                                      this.d();
                                      this.field_o = var1 + 2000L;
                                      decompiledRegionSelector0 = 1;
                                      break L4;
                                    }
                                  }
                                }
                                this.field_s = Math.min(this.field_i, this.field_a);
                                this.field_i = this.field_a;
                                break L12;
                              }
                            }
                            this.field_a = 0;
                            this.field_m = var1 + 2000L;
                            break L11;
                          }
                        }
                        this.field_c = var3_int;
                        decompiledRegionSelector0 = 2;
                        break L4;
                      } else {
                        this.a(this.field_q, 256);
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
                    this.d();
                    this.field_o = var1 + 2000L;
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

    final synchronized void c() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_e == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_e.field_a = true;
                  L2: while (true) {
                    if (!field_e.field_d) {
                      field_e = null;
                      break L0;
                    } else {
                      pj.a(0, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if (field_e.field_g[var2] != this) {
                    break L3;
                  } else {
                    field_e.field_g[var2] = null;
                    break L3;
                  }
                }
                if (field_e.field_g[var2] != null) {
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
        this.field_q = null;
        this.field_u = true;
    }

    void d() {
    }

    final synchronized void a(qb param0) {
        this.field_h = param0;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        qb var7 = null;
        int var8_int = 0;
        qb[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        qb var11 = null;
        ap var12 = null;
        int var13 = 0;
        qb var14 = null;
        qb var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_g) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          cj.a(param0, 0, var3);
          this.field_r = this.field_r - param1;
          if (this.field_h == null) {
            break L1;
          } else {
            if (this.field_r > 0) {
              break L1;
            } else {
              this.field_r = this.field_r + (field_t >> 4);
              vn.b(this.field_h);
              this.a(this.field_h, this.field_h.b());
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
                            var11 = this.field_p[var7_int];
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
                                      var11 = var11.field_l;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_i = true;
                                  var13 = var11.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_i = var12.field_i + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < this.field_d) {
                                  L10: {
                                    var14 = var11.d();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_j;
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
                                    var15 = var11.field_l;
                                    var11.field_l = null;
                                    if (var10 != null) {
                                      ((qb) (var10)).field_l = var15;
                                      break L12;
                                    } else {
                                      this.field_p[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      this.field_n[var7_int] = (qb) (var10);
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
                    var7 = this.field_p[var6];
                    var8 = this.field_p;
                    var9 = var6;
                    this.field_n[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_l;
                        var7.field_l = null;
                        var7 = (qb) (var10);
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
          if (this.field_r >= 0) {
            break L16;
          } else {
            this.field_r = 0;
            break L16;
          }
        }
        L17: {
          if (this.field_h == null) {
            break L17;
          } else {
            this.field_h.b(param0, 0, param1);
            break L17;
          }
        }
        this.field_b = kd.c(-2456);
    }

    int f() throws Exception {
        return this.field_j;
    }

    private final static void b(qb param0) {
        param0.field_i = false;
        if (param0.field_k != null) {
            param0.field_k.field_i = 0;
        }
        qb var1 = param0.d();
        while (var1 != null) {
            vn.b(var1);
            var1 = param0.c();
        }
    }

    void b(int param0) throws Exception {
    }

    final static vn a(qg param0, java.awt.Component param1, int param2, int param3) {
        try {
            pn discarded$2 = null;
            wn var4 = null;
            Throwable var4_ref = null;
            wn var5 = null;
            wn stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            wn stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            wn stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            wn stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            wn stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            wn stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            wn stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            wn stackOut_20_0 = null;
            if (field_t != 0) {
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
                          var5 = new wn();
                          var4 = var5;
                          stackOut_8_0 = (wn) (var4);
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_g) {
                            stackOut_10_0 = (wn) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (wn) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((vn) ((Object) stackIn_11_0)).field_q = new int[stackIn_11_1 * stackIn_11_2];
                          ((vn) ((Object) var4)).field_f = param3;
                          ((vn) ((Object) var4)).a(param1);
                          ((vn) ((Object) var4)).field_j = (param3 & -1024) + 1024;
                          if (((vn) ((Object) var4)).field_j <= 16384) {
                            break L4;
                          } else {
                            ((vn) ((Object) var4)).field_j = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((vn) ((Object) var4)).b(((vn) ((Object) var4)).field_j);
                          if (field_l <= 0) {
                            break L5;
                          } else {
                            if (field_e != null) {
                              break L5;
                            } else {
                              field_e = new bk();
                              field_e.field_h = param0;
                              discarded$2 = param0.a(-21432, field_l, (Runnable) ((Object) field_e));
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_e == null) {
                            break L6;
                          } else {
                            if (field_e.field_g[param2] == null) {
                              field_e.field_g[param2] = (vn) ((Object) var5);
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (wn) (var4);
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new vn();
                    }
                    return (vn) ((Object) stackIn_21_0);
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
                field_t = param0;
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
              field_g = stackIn_7_0 != 0;
              field_l = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    private final void a(int param0) {
        this.field_r = this.field_r - param0;
        if (this.field_r < 0) {
            this.field_r = 0;
        }
        if (this.field_h != null) {
            this.field_h.a(param0);
            return;
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    public static void e() {
        field_e = null;
    }

    private final void a(qb param0, int param1) {
        int var3 = param1 >> 5;
        qb var4 = this.field_n[var3];
        if (var4 == null) {
            this.field_p[var3] = param0;
        } else {
            var4.field_l = param0;
        }
        this.field_n[var3] = param0;
        param0.field_j = param1;
    }

    void b() throws Exception {
    }

    vn() {
        this.field_d = 32;
        this.field_u = false;
        this.field_b = kd.c(-2456);
        this.field_n = new qb[8];
        this.field_p = new qb[8];
        this.field_o = 0L;
        this.field_m = 0L;
        this.field_a = 0;
        this.field_i = 0;
        this.field_r = 0;
        this.field_c = 0;
        this.field_k = true;
    }
}
