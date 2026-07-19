/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tb {
    private static int field_k;
    private int field_i;
    private we field_c;
    private long field_q;
    int[] field_l;
    private boolean field_h;
    static boolean field_b;
    private long field_u;
    static int field_g;
    private int field_n;
    private we[] field_m;
    private int field_d;
    private int field_o;
    private int field_a;
    private int field_r;
    private int field_j;
    private boolean field_f;
    private long field_s;
    private static an field_e;
    private we[] field_t;
    private int field_p;

    void b(int param0) throws Exception {
    }

    private final static void b(we param0) {
        param0.field_p = false;
        if (param0.field_r != null) {
            param0.field_r.field_o = 0;
        }
        we var1 = param0.d();
        while (var1 != null) {
            tb.b(var1);
            var1 = param0.b();
        }
    }

    void e() throws Exception {
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
                field_g = param0;
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
              field_b = stackIn_7_0 != 0;
              field_k = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
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
                  field_e.field_c = true;
                  L2: while (true) {
                    if (!field_e.field_f) {
                      field_e = null;
                      break L0;
                    } else {
                      a.a((byte) 127, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if (field_e.field_e[var2] != this) {
                    break L3;
                  } else {
                    field_e.field_e[var2] = null;
                    break L3;
                  }
                }
                if (field_e.field_e[var2] != null) {
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
        this.field_l = null;
        this.field_h = true;
    }

    final synchronized void a() {
        try {
            this.field_f = true;
            try {
                this.d();
            } catch (Exception exception) {
                this.h();
                this.field_u = mm.a(-58) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    private final void a(we param0, int param1) {
        int var3 = param1 >> 5;
        we var4 = this.field_m[var3];
        if (var4 == null) {
            this.field_t[var3] = param0;
        } else {
            var4.field_o = param0;
        }
        this.field_m[var3] = param0;
        param0.field_q = param1;
    }

    void d() throws Exception {
    }

    final synchronized void a(we param0) {
        this.field_c = param0;
    }

    final synchronized void b() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (!this.field_h) {
              var1 = mm.a(87);
              try {
                L0: {
                  L1: {
                    if (var1 <= this.field_q + 6000L) {
                      break L1;
                    } else {
                      this.field_q = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= this.field_q + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      this.field_q = this.field_q + (long)(256000 / field_g);
                      var1 = mm.a(-99);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  this.field_q = var1;
                  break L3;
                }
              }
              if (this.field_l != null) {
                try {
                  L4: {
                    L5: {
                      if (this.field_u == 0L) {
                        break L5;
                      } else {
                        if (var1 >= this.field_u) {
                          this.b(this.field_o);
                          this.field_u = 0L;
                          this.field_f = true;
                          break L5;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      var3_int = this.g();
                      if (this.field_a - var3_int <= this.field_d) {
                        break L6;
                      } else {
                        this.field_d = this.field_a - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = this.field_j + this.field_r;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= this.field_o) {
                        break L8;
                      } else {
                        L9: {
                          this.field_o = this.field_o + 1024;
                          if (this.field_o <= 16384) {
                            break L9;
                          } else {
                            this.field_o = 16384;
                            break L9;
                          }
                        }
                        this.h();
                        this.b(this.field_o);
                        var3_int = 0;
                        this.field_f = true;
                        if (var4 + 256 <= this.field_o) {
                          break L8;
                        } else {
                          var4 = this.field_o - 256;
                          this.field_r = var4 - this.field_j;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= this.field_s) {
                            break L11;
                          } else {
                            L12: {
                              if (this.field_f) {
                                this.field_f = false;
                                break L12;
                              } else {
                                L13: {
                                  if (this.field_d != 0) {
                                    break L13;
                                  } else {
                                    if (this.field_p != 0) {
                                      break L13;
                                    } else {
                                      this.h();
                                      this.field_u = var1 + 2000L;
                                      decompiledRegionSelector0 = 1;
                                      break L4;
                                    }
                                  }
                                }
                                this.field_r = Math.min(this.field_p, this.field_d);
                                this.field_p = this.field_d;
                                break L12;
                              }
                            }
                            this.field_d = 0;
                            this.field_s = var1 + 2000L;
                            break L11;
                          }
                        }
                        this.field_a = var3_int;
                        decompiledRegionSelector0 = 2;
                        break L4;
                      } else {
                        this.a(this.field_l, 256);
                        this.e();
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
                    this.field_u = var1 + 2000L;
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

    final static tb a(pn param0, java.awt.Component param1, int param2, int param3) {
        try {
            wj discarded$2 = null;
            sc var4 = null;
            Throwable var4_ref = null;
            sc var5 = null;
            sc stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            sc stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            sc stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            sc stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            sc stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            sc stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            sc stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            sc stackOut_20_0 = null;
            if (field_g != 0) {
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
                          var5 = new sc();
                          var4 = var5;
                          stackOut_8_0 = (sc) (var4);
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_b) {
                            stackOut_10_0 = (sc) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (sc) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((tb) ((Object) stackIn_11_0)).field_l = new int[stackIn_11_1 * stackIn_11_2];
                          ((tb) ((Object) var4)).field_j = param3;
                          ((tb) ((Object) var4)).a(param1);
                          ((tb) ((Object) var4)).field_o = (param3 & -1024) + 1024;
                          if (((tb) ((Object) var4)).field_o <= 16384) {
                            break L4;
                          } else {
                            ((tb) ((Object) var4)).field_o = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((tb) ((Object) var4)).b(((tb) ((Object) var4)).field_o);
                          if (field_k <= 0) {
                            break L5;
                          } else {
                            if (field_e != null) {
                              break L5;
                            } else {
                              field_e = new an();
                              field_e.field_j = param0;
                              discarded$2 = param0.a(2, field_k, (Runnable) ((Object) field_e));
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_e == null) {
                            break L6;
                          } else {
                            if (field_e.field_e[param2] == null) {
                              field_e.field_e[param2] = (tb) ((Object) var5);
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (sc) (var4);
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new tb();
                    }
                    return (tb) ((Object) stackIn_21_0);
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

    void h() {
    }

    int g() throws Exception {
        return this.field_o;
    }

    private final void a(int param0) {
        this.field_n = this.field_n - param0;
        if (this.field_n < 0) {
            this.field_n = 0;
        }
        if (this.field_c != null) {
            this.field_c.d(param0);
            return;
        }
    }

    public static void f() {
        field_e = null;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        we var7 = null;
        int var8_int = 0;
        we[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        we var11 = null;
        md var12 = null;
        int var13 = 0;
        we var14 = null;
        we var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_b) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          ii.a(param0, 0, var3);
          this.field_n = this.field_n - param1;
          if (this.field_c == null) {
            break L1;
          } else {
            if (this.field_n > 0) {
              break L1;
            } else {
              this.field_n = this.field_n + (field_g >> 4);
              tb.b(this.field_c);
              this.a(this.field_c, this.field_c.c());
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
                            var11 = this.field_t[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_r;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_o <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11 = var11.field_o;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_p = true;
                                  var13 = var11.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_o = var12.field_o + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < this.field_i) {
                                  L10: {
                                    var14 = var11.d();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_q;
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
                                    var15 = var11.field_o;
                                    var11.field_o = null;
                                    if (var10 != null) {
                                      ((we) (var10)).field_o = var15;
                                      break L12;
                                    } else {
                                      this.field_t[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      this.field_m[var7_int] = (we) (var10);
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
                    var7 = this.field_t[var6];
                    var8 = this.field_t;
                    var9 = var6;
                    this.field_m[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_o;
                        var7.field_o = null;
                        var7 = (we) (var10);
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
          if (this.field_n >= 0) {
            break L16;
          } else {
            this.field_n = 0;
            break L16;
          }
        }
        L17: {
          if (this.field_c == null) {
            break L17;
          } else {
            this.field_c.a(param0, 0, param1);
            break L17;
          }
        }
        this.field_q = mm.a(115);
    }

    tb() {
        this.field_i = 32;
        this.field_h = false;
        this.field_q = mm.a(-110);
        this.field_n = 0;
        this.field_u = 0L;
        this.field_d = 0;
        this.field_f = true;
        this.field_s = 0L;
        this.field_a = 0;
        this.field_t = new we[8];
        this.field_m = new we[8];
        this.field_p = 0;
    }
}
