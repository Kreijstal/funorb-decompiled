/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lo {
    int[] field_q;
    private tj field_m;
    private static bf field_c;
    static boolean field_t;
    private static int field_f;
    private boolean field_p;
    private int field_s;
    private long field_h;
    static int field_l;
    private int field_d;
    private int field_u;
    private int field_b;
    private tj[] field_e;
    private int field_r;
    private tj[] field_n;
    private long field_i;
    private boolean field_j;
    private long field_o;
    private int field_a;
    private int field_g;
    private int field_k;

    void b(int param0) throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        tj var7 = null;
        int var8_int = 0;
        tj[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        tj var11 = null;
        eh var12 = null;
        int var13 = 0;
        tj var14 = null;
        tj var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_t) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          bc.a(param0, 0, var3);
          this.field_b = this.field_b - param1;
          if (this.field_m == null) {
            break L1;
          } else {
            if (this.field_b > 0) {
              break L1;
            } else {
              this.field_b = this.field_b + (field_l >> 4);
              lo.b(this.field_m);
              this.a(this.field_m, this.field_m.d());
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
                            var11 = this.field_n[var7_int];
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
                                    if (var12.field_i <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11 = var11.field_k;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_l = true;
                                  var13 = var11.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_i = var12.field_i + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < this.field_s) {
                                  L10: {
                                    var14 = var11.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_j;
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
                                    var15 = var11.field_k;
                                    var11.field_k = null;
                                    if (var10 != null) {
                                      ((tj) (var10)).field_k = var15;
                                      break L12;
                                    } else {
                                      this.field_n[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      this.field_e[var7_int] = (tj) (var10);
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
                    var7 = this.field_n[var6];
                    var8 = this.field_n;
                    var9 = var6;
                    this.field_e[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_k;
                        var7.field_k = null;
                        var7 = (tj) (var10);
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
          if (this.field_b >= 0) {
            break L16;
          } else {
            this.field_b = 0;
            break L16;
          }
        }
        L17: {
          if (this.field_m == null) {
            break L17;
          } else {
            this.field_m.b(param0, 0, param1);
            break L17;
          }
        }
        this.field_h = bb.b(-1);
    }

    final synchronized void a() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_c == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_c.field_f = true;
                  L2: while (true) {
                    if (!field_c.field_e) {
                      field_c = null;
                      break L0;
                    } else {
                      qe.a(50L, (byte) 45);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if (field_c.field_d[var2] != this) {
                    break L3;
                  } else {
                    field_c.field_d[var2] = null;
                    break L3;
                  }
                }
                if (field_c.field_d[var2] != null) {
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
        this.field_q = null;
        this.field_p = true;
    }

    void c() {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    private final static void b(tj param0) {
        param0.field_l = false;
        if (param0.field_i != null) {
            param0.field_i.field_i = 0;
        }
        tj var1 = param0.a();
        while (var1 != null) {
            lo.b(var1);
            var1 = param0.b();
        }
    }

    void b() throws Exception {
    }

    private final void a(int param0) {
        this.field_b = this.field_b - param0;
        if (this.field_b < 0) {
            this.field_b = 0;
        }
        if (this.field_m != null) {
            this.field_m.a(param0);
            return;
        }
    }

    public static void f() {
        field_c = null;
    }

    final static lo a(ib param0, java.awt.Component param1, int param2, int param3) {
        try {
            af discarded$2 = null;
            fa var4 = null;
            Throwable var4_ref = null;
            fa var5 = null;
            fa stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            fa stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            fa stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            fa stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            fa stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            fa stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            fa stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            fa stackOut_20_0 = null;
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
                          var5 = new fa();
                          var4 = var5;
                          stackOut_8_0 = (fa) (var4);
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_t) {
                            stackOut_10_0 = (fa) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (fa) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((lo) ((Object) stackIn_11_0)).field_q = new int[stackIn_11_1 * stackIn_11_2];
                          ((lo) ((Object) var4)).field_r = param3;
                          ((lo) ((Object) var4)).a(param1);
                          ((lo) ((Object) var4)).field_k = (param3 & -1024) + 1024;
                          if (((lo) ((Object) var4)).field_k <= 16384) {
                            break L4;
                          } else {
                            ((lo) ((Object) var4)).field_k = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((lo) ((Object) var4)).b(((lo) ((Object) var4)).field_k);
                          if (field_f <= 0) {
                            break L5;
                          } else {
                            if (field_c != null) {
                              break L5;
                            } else {
                              field_c = new bf();
                              field_c.field_c = param0;
                              discarded$2 = param0.a((byte) -28, field_f, (Runnable) ((Object) field_c));
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_c == null) {
                            break L6;
                          } else {
                            if (field_c.field_d[param2] == null) {
                              field_c.field_d[param2] = (lo) ((Object) var5);
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (fa) (var4);
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new lo();
                    }
                    return (lo) ((Object) stackIn_21_0);
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

    final synchronized void a(tj param0) {
        this.field_m = param0;
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
              field_t = stackIn_7_0 != 0;
              field_f = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final synchronized void d() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (!this.field_p) {
              var1 = bb.b(-1);
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
                      this.field_h = this.field_h + (long)(256000 / field_l);
                      var1 = bb.b(-1);
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
              if (this.field_q != null) {
                try {
                  L4: {
                    L5: {
                      if (this.field_o == 0L) {
                        break L5;
                      } else {
                        if (var1 >= this.field_o) {
                          this.b(this.field_k);
                          this.field_o = 0L;
                          this.field_j = true;
                          break L5;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      var3_int = this.e();
                      if (this.field_u - var3_int <= this.field_g) {
                        break L6;
                      } else {
                        this.field_g = this.field_u - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = this.field_r + this.field_a;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= this.field_k) {
                        break L8;
                      } else {
                        L9: {
                          this.field_k = this.field_k + 1024;
                          if (this.field_k <= 16384) {
                            break L9;
                          } else {
                            this.field_k = 16384;
                            break L9;
                          }
                        }
                        this.c();
                        this.b(this.field_k);
                        var3_int = 0;
                        this.field_j = true;
                        if (var4 + 256 <= this.field_k) {
                          break L8;
                        } else {
                          var4 = this.field_k - 256;
                          this.field_a = var4 - this.field_r;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= this.field_i) {
                            break L11;
                          } else {
                            L12: {
                              if (this.field_j) {
                                this.field_j = false;
                                break L12;
                              } else {
                                L13: {
                                  if (this.field_g != 0) {
                                    break L13;
                                  } else {
                                    if (this.field_d != 0) {
                                      break L13;
                                    } else {
                                      this.c();
                                      this.field_o = var1 + 2000L;
                                      decompiledRegionSelector0 = 1;
                                      break L4;
                                    }
                                  }
                                }
                                this.field_a = Math.min(this.field_d, this.field_g);
                                this.field_d = this.field_g;
                                break L12;
                              }
                            }
                            this.field_g = 0;
                            this.field_i = var1 + 2000L;
                            break L11;
                          }
                        }
                        this.field_u = var3_int;
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
                    this.c();
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

    int e() throws Exception {
        return this.field_k;
    }

    private final void a(tj param0, int param1) {
        int var3 = param1 >> 5;
        tj var4 = this.field_e[var3];
        if (var4 == null) {
            this.field_n[var3] = param0;
        } else {
            var4.field_k = param0;
        }
        this.field_e[var3] = param0;
        param0.field_j = param1;
    }

    lo() {
        this.field_p = false;
        this.field_s = 32;
        this.field_h = bb.b(-1);
        this.field_e = new tj[8];
        this.field_d = 0;
        this.field_u = 0;
        this.field_i = 0L;
        this.field_n = new tj[8];
        this.field_g = 0;
        this.field_b = 0;
        this.field_j = true;
        this.field_o = 0L;
    }
}
