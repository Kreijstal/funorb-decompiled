/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk {
    private long field_h;
    private static int field_m;
    static boolean field_r;
    int[] field_t;
    private boolean field_p;
    private lj field_i;
    private int field_l;
    private static nf field_g;
    static int field_u;
    private boolean field_o;
    private long field_j;
    private int field_n;
    private int field_k;
    private int field_s;
    private lj[] field_e;
    private long field_f;
    private lj[] field_c;
    private int field_q;
    private int field_a;
    private int field_d;
    private int field_b;

    private final static void a(lj param0) {
        param0.field_j = false;
        if (param0.field_i != null) {
            param0.field_i.field_h = 0;
        }
        lj var1 = param0.c();
        while (var1 != null) {
            nk.a(var1);
            var1 = param0.a();
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
                field_u = param0;
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
              field_m = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    private final void a(lj param0, int param1) {
        int var3 = param1 >> 5;
        lj var4 = this.field_c[var3];
        if (var4 == null) {
            this.field_e[var3] = param0;
        } else {
            var4.field_h = param0;
        }
        this.field_c[var3] = param0;
        param0.field_k = param1;
    }

    final synchronized void b(lj param0) {
        this.field_i = param0;
    }

    void d() {
    }

    private final void a(int param0) {
        this.field_a = this.field_a - param0;
        if (this.field_a < 0) {
            this.field_a = 0;
        }
        if (this.field_i != null) {
            this.field_i.a(param0);
            return;
        }
    }

    final static nk a(he param0, java.awt.Component param1, int param2, int param3) {
        try {
            mf discarded$2 = null;
            ul var4 = null;
            Throwable var4_ref = null;
            ul var5 = null;
            ul stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ul stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ul stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ul stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ul stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ul stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ul stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ul stackOut_20_0 = null;
            if (field_u != 0) {
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
                          var5 = new ul();
                          var4 = var5;
                          stackOut_8_0 = (ul) (var4);
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_r) {
                            stackOut_10_0 = (ul) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (ul) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((nk) ((Object) stackIn_11_0)).field_t = new int[stackIn_11_1 * stackIn_11_2];
                          ((nk) ((Object) var4)).field_s = param3;
                          ((nk) ((Object) var4)).a(param1);
                          ((nk) ((Object) var4)).field_b = (param3 & -1024) + 1024;
                          if (((nk) ((Object) var4)).field_b <= 16384) {
                            break L4;
                          } else {
                            ((nk) ((Object) var4)).field_b = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((nk) ((Object) var4)).b(((nk) ((Object) var4)).field_b);
                          if (field_m <= 0) {
                            break L5;
                          } else {
                            if (field_g != null) {
                              break L5;
                            } else {
                              field_g = new nf();
                              field_g.field_e = param0;
                              discarded$2 = param0.a((Runnable) ((Object) field_g), (byte) -21, field_m);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_g == null) {
                            break L6;
                          } else {
                            if (field_g.field_d[param2] == null) {
                              field_g.field_d[param2] = (nk) ((Object) var5);
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (ul) (var4);
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new nk();
                    }
                    return (nk) ((Object) stackIn_21_0);
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

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        lj var7 = null;
        int var8_int = 0;
        lj[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        lj var11 = null;
        id var12 = null;
        int var13 = 0;
        lj var14 = null;
        lj var15 = null;
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
          ka.a(param0, 0, var3);
          this.field_a = this.field_a - param1;
          if (this.field_i == null) {
            break L1;
          } else {
            if (this.field_a > 0) {
              break L1;
            } else {
              this.field_a = this.field_a + (field_u >> 4);
              nk.a(this.field_i);
              this.a(this.field_i, this.field_i.b());
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
                            var11 = this.field_e[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_i;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_h <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11 = var11.field_h;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_j = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_h = var12.field_h + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < this.field_l) {
                                  L10: {
                                    var14 = var11.c();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_k;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.b() >> 8);
                                          var14 = var11.a();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_h;
                                    var11.field_h = null;
                                    if (var10 != null) {
                                      ((lj) (var10)).field_h = var15;
                                      break L12;
                                    } else {
                                      this.field_e[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      this.field_c[var7_int] = (lj) (var10);
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
                    var7 = this.field_e[var6];
                    var8 = this.field_e;
                    var9 = var6;
                    this.field_c[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_h;
                        var7.field_h = null;
                        var7 = (lj) (var10);
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
          if (this.field_a >= 0) {
            break L16;
          } else {
            this.field_a = 0;
            break L16;
          }
        }
        L17: {
          if (this.field_i == null) {
            break L17;
          } else {
            this.field_i.a(param0, 0, param1);
            break L17;
          }
        }
        this.field_h = ll.a(1000);
    }

    void b() throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    int a() throws Exception {
        return this.field_b;
    }

    final synchronized void c() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (!this.field_p) {
              var1 = ll.a(1000);
              try {
                L0: {
                  L1: {
                    if (var1 <= this.field_h + 6000L) {
                      break L1;
                    } else {
                      this.field_h = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= this.field_h + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      this.field_h = this.field_h + (long)(256000 / field_u);
                      var1 = ll.a(1000);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  this.field_h = var1;
                  break L3;
                }
              }
              if (this.field_t != null) {
                try {
                  L4: {
                    L5: {
                      if (this.field_f == 0L) {
                        break L5;
                      } else {
                        if (var1 >= this.field_f) {
                          this.b(this.field_b);
                          this.field_f = 0L;
                          this.field_o = true;
                          break L5;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      var3_int = this.a();
                      if (this.field_n - var3_int <= this.field_k) {
                        break L6;
                      } else {
                        this.field_k = this.field_n - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = this.field_s + this.field_q;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= this.field_b) {
                        break L8;
                      } else {
                        L9: {
                          this.field_b = this.field_b + 1024;
                          if (this.field_b <= 16384) {
                            break L9;
                          } else {
                            this.field_b = 16384;
                            break L9;
                          }
                        }
                        this.d();
                        this.b(this.field_b);
                        var3_int = 0;
                        this.field_o = true;
                        if (var4 + 256 <= this.field_b) {
                          break L8;
                        } else {
                          var4 = this.field_b - 256;
                          this.field_q = var4 - this.field_s;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= this.field_j) {
                            break L11;
                          } else {
                            L12: {
                              if (this.field_o) {
                                this.field_o = false;
                                break L12;
                              } else {
                                L13: {
                                  if (this.field_k != 0) {
                                    break L13;
                                  } else {
                                    if (this.field_d != 0) {
                                      break L13;
                                    } else {
                                      this.d();
                                      this.field_f = var1 + 2000L;
                                      decompiledRegionSelector0 = 1;
                                      break L4;
                                    }
                                  }
                                }
                                this.field_q = Math.min(this.field_d, this.field_k);
                                this.field_d = this.field_k;
                                break L12;
                              }
                            }
                            this.field_k = 0;
                            this.field_j = var1 + 2000L;
                            break L11;
                          }
                        }
                        this.field_n = var3_int;
                        decompiledRegionSelector0 = 2;
                        break L4;
                      } else {
                        this.a(this.field_t, 256);
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

    void b(int param0) throws Exception {
    }

    public static void e() {
        field_g = null;
    }

    final synchronized void f() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_g == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_g.field_b = true;
                  L2: while (true) {
                    if (!field_g.field_i) {
                      field_g = null;
                      break L0;
                    } else {
                      gi.a((byte) -66, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if (field_g.field_d[var2] != this) {
                    break L3;
                  } else {
                    field_g.field_d[var2] = null;
                    break L3;
                  }
                }
                if (field_g.field_d[var2] != null) {
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
        this.field_t = null;
        this.field_p = true;
    }

    nk() {
        this.field_p = false;
        this.field_l = 32;
        this.field_h = ll.a(1000);
        this.field_n = 0;
        this.field_e = new lj[8];
        this.field_k = 0;
        this.field_f = 0L;
        this.field_j = 0L;
        this.field_c = new lj[8];
        this.field_a = 0;
        this.field_o = true;
        this.field_d = 0;
    }
}
