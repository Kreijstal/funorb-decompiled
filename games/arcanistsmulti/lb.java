/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lb {
    private sg field_s;
    private boolean field_t;
    private static int field_f;
    private static rj field_o;
    int[] field_a;
    private int field_g;
    static int field_r;
    static boolean field_i;
    private long field_b;
    private long field_k;
    private int field_p;
    private int field_q;
    private int field_j;
    private sg[] field_h;
    private long field_c;
    private int field_e;
    private int field_l;
    private int field_d;
    private sg[] field_u;
    private boolean field_m;
    private int field_n;

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
              field_i = stackIn_7_0 != 0;
              field_f = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void d() throws Exception {
    }

    private final static void b(sg param0) {
        param0.field_i = false;
        if (param0.field_j != null) {
            param0.field_j.field_g = 0;
        }
        sg var1 = param0.a();
        while (var1 != null) {
            lb.b(var1);
            var1 = param0.b();
        }
    }

    final static lb a(dl param0, java.awt.Component param1, int param2, int param3) {
        try {
            og discarded$2 = null;
            ek var4 = null;
            Throwable var4_ref = null;
            ek var5 = null;
            ek stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ek stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ek stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ek stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ek stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ek stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ek stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ek stackOut_20_0 = null;
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
                          var5 = new ek();
                          var4 = var5;
                          stackOut_8_0 = (ek) (var4);
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_i) {
                            stackOut_10_0 = (ek) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (ek) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((lb) ((Object) stackIn_11_0)).field_a = new int[stackIn_11_1 * stackIn_11_2];
                          ((lb) ((Object) var4)).field_e = param3;
                          ((lb) ((Object) var4)).a(param1);
                          ((lb) ((Object) var4)).field_q = (param3 & -1024) + 1024;
                          if (((lb) ((Object) var4)).field_q <= 16384) {
                            break L4;
                          } else {
                            ((lb) ((Object) var4)).field_q = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((lb) ((Object) var4)).b(((lb) ((Object) var4)).field_q);
                          if (field_f <= 0) {
                            break L5;
                          } else {
                            if (field_o != null) {
                              break L5;
                            } else {
                              field_o = new rj();
                              field_o.field_f = param0;
                              discarded$2 = param0.a(127, field_f, (Runnable) ((Object) field_o));
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_o == null) {
                            break L6;
                          } else {
                            if (field_o.field_b[param2] == null) {
                              field_o.field_b[param2] = (lb) ((Object) var5);
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (ek) (var4);
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new lb();
                    }
                    return (lb) ((Object) stackIn_21_0);
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

    void a() throws Exception {
    }

    private final void a(sg param0, int param1) {
        int var3 = param1 >> 5;
        sg var4 = this.field_h[var3];
        if (var4 == null) {
            this.field_u[var3] = param0;
        } else {
            var4.field_g = param0;
        }
        this.field_h[var3] = param0;
        param0.field_h = param1;
    }

    private final void a(int param0) {
        this.field_l = this.field_l - param0;
        if (this.field_l < 0) {
            this.field_l = 0;
        }
        if (this.field_s != null) {
            this.field_s.a(param0);
            return;
        }
    }

    final synchronized void g() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (!this.field_t) {
              var1 = qj.b(-26572);
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
                      this.field_b = this.field_b + (long)(256000 / field_r);
                      var1 = qj.b(-26572);
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
              if (this.field_a != null) {
                try {
                  L4: {
                    L5: {
                      if (this.field_k == 0L) {
                        break L5;
                      } else {
                        if (var1 >= this.field_k) {
                          this.b(this.field_q);
                          this.field_k = 0L;
                          this.field_m = true;
                          break L5;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      var3_int = this.b();
                      if (this.field_d - var3_int <= this.field_p) {
                        break L6;
                      } else {
                        this.field_p = this.field_d - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = this.field_e + this.field_j;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= this.field_q) {
                        break L8;
                      } else {
                        L9: {
                          this.field_q = this.field_q + 1024;
                          if (this.field_q <= 16384) {
                            break L9;
                          } else {
                            this.field_q = 16384;
                            break L9;
                          }
                        }
                        this.h();
                        this.b(this.field_q);
                        var3_int = 0;
                        this.field_m = true;
                        if (var4 + 256 <= this.field_q) {
                          break L8;
                        } else {
                          var4 = this.field_q - 256;
                          this.field_j = var4 - this.field_e;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= this.field_c) {
                            break L11;
                          } else {
                            L12: {
                              if (this.field_m) {
                                this.field_m = false;
                                break L12;
                              } else {
                                L13: {
                                  if (this.field_p != 0) {
                                    break L13;
                                  } else {
                                    if (this.field_n != 0) {
                                      break L13;
                                    } else {
                                      this.h();
                                      this.field_k = var1 + 2000L;
                                      decompiledRegionSelector0 = 1;
                                      break L4;
                                    }
                                  }
                                }
                                this.field_j = Math.min(this.field_n, this.field_p);
                                this.field_n = this.field_p;
                                break L12;
                              }
                            }
                            this.field_p = 0;
                            this.field_c = var1 + 2000L;
                            break L11;
                          }
                        }
                        this.field_d = var3_int;
                        decompiledRegionSelector0 = 2;
                        break L4;
                      } else {
                        this.a(this.field_a, 256);
                        this.d();
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

    int b() throws Exception {
        return this.field_q;
    }

    final synchronized void e() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_o == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_o.field_g = true;
                  L2: while (true) {
                    if (!field_o.field_a) {
                      field_o = null;
                      break L0;
                    } else {
                      ao.a(50L, 1);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if (field_o.field_b[var2] != this) {
                    break L3;
                  } else {
                    field_o.field_b[var2] = null;
                    break L3;
                  }
                }
                if (field_o.field_b[var2] != null) {
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
        this.field_a = null;
        this.field_t = true;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    public static void c() {
        field_o = null;
    }

    void b(int param0) throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        sg var7 = null;
        int var8_int = 0;
        sg[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        sg var11 = null;
        tb var12 = null;
        int var13 = 0;
        sg var14 = null;
        sg var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_i) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          sf.a(param0, 0, var3);
          this.field_l = this.field_l - param1;
          if (this.field_s == null) {
            break L1;
          } else {
            if (this.field_l > 0) {
              break L1;
            } else {
              this.field_l = this.field_l + (field_r >> 4);
              lb.b(this.field_s);
              this.a(this.field_s, this.field_s.d());
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
                            var11 = this.field_u[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_j;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_g <= var8_int) {
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
                                  var11.field_i = true;
                                  var13 = var11.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_g = var12.field_g + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < this.field_g) {
                                  L10: {
                                    var14 = var11.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_h;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.d() >> 8);
                                          var14 = var11.b();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_g;
                                    var11.field_g = null;
                                    if (var10 != null) {
                                      ((sg) (var10)).field_g = var15;
                                      break L12;
                                    } else {
                                      this.field_u[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      this.field_h[var7_int] = (sg) (var10);
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
                    var7 = this.field_u[var6];
                    var8 = this.field_u;
                    var9 = var6;
                    this.field_h[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_g;
                        var7.field_g = null;
                        var7 = (sg) (var10);
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
          if (this.field_l >= 0) {
            break L16;
          } else {
            this.field_l = 0;
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
        this.field_b = qj.b(-26572);
    }

    final synchronized void a(sg param0) {
        this.field_s = param0;
    }

    void h() {
    }

    final synchronized void f() {
        try {
            this.field_m = true;
            try {
                this.a();
            } catch (Exception exception) {
                this.h();
                this.field_k = qj.b(-26572) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    lb() {
        this.field_t = false;
        this.field_g = 32;
        this.field_b = qj.b(-26572);
        this.field_p = 0;
        this.field_k = 0L;
        this.field_h = new sg[8];
        this.field_u = new sg[8];
        this.field_d = 0;
        this.field_l = 0;
        this.field_n = 0;
        this.field_c = 0L;
        this.field_m = true;
    }
}
