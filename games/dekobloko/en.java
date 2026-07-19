/*
 * Decompiled by CFR-JS 0.4.0.
 */
class en {
    private long field_a;
    private int field_n;
    int[] field_k;
    static int field_o;
    private ol field_b;
    static boolean field_u;
    private boolean field_f;
    private static rc field_r;
    private boolean field_i;
    private ol[] field_p;
    private ol[] field_h;
    private int field_l;
    private int field_j;
    private int field_q;
    private long field_g;
    private static int field_s;
    private int field_t;
    private long field_m;
    private int field_c;
    private int field_e;
    private int field_d;

    void b() throws Exception {
    }

    final synchronized void g() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (!this.field_f) {
              var1 = ik.a(4);
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
                      this.b(256);
                      this.field_a = this.field_a + (long)(256000 / field_o);
                      var1 = ik.a(4);
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
              if (this.field_k != null) {
                try {
                  L4: {
                    L5: {
                      if (this.field_m == 0L) {
                        break L5;
                      } else {
                        if (var1 >= this.field_m) {
                          this.a(this.field_c);
                          this.field_m = 0L;
                          this.field_i = true;
                          break L5;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      var3_int = this.c();
                      if (this.field_e - var3_int <= this.field_q) {
                        break L6;
                      } else {
                        this.field_q = this.field_e - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = this.field_t + this.field_d;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= this.field_c) {
                        break L8;
                      } else {
                        L9: {
                          this.field_c = this.field_c + 1024;
                          if (this.field_c <= 16384) {
                            break L9;
                          } else {
                            this.field_c = 16384;
                            break L9;
                          }
                        }
                        this.d();
                        this.a(this.field_c);
                        var3_int = 0;
                        this.field_i = true;
                        if (var4 + 256 <= this.field_c) {
                          break L8;
                        } else {
                          var4 = this.field_c - 256;
                          this.field_d = var4 - this.field_t;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= this.field_g) {
                            break L11;
                          } else {
                            L12: {
                              if (this.field_i) {
                                this.field_i = false;
                                break L12;
                              } else {
                                L13: {
                                  if (this.field_q != 0) {
                                    break L13;
                                  } else {
                                    if (this.field_j != 0) {
                                      break L13;
                                    } else {
                                      this.d();
                                      this.field_m = var1 + 2000L;
                                      decompiledRegionSelector0 = 1;
                                      break L4;
                                    }
                                  }
                                }
                                this.field_d = Math.min(this.field_j, this.field_q);
                                this.field_j = this.field_q;
                                break L12;
                              }
                            }
                            this.field_q = 0;
                            this.field_g = var1 + 2000L;
                            break L11;
                          }
                        }
                        this.field_e = var3_int;
                        decompiledRegionSelector0 = 2;
                        break L4;
                      } else {
                        this.a(this.field_k, 256);
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
                    this.field_m = var1 + 2000L;
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

    void h() throws Exception {
    }

    void a(int param0) throws Exception {
    }

    final static en a(fd param0, java.awt.Component param1, int param2, int param3) {
        try {
            mh discarded$2 = null;
            jn var4 = null;
            Throwable var4_ref = null;
            jn var5 = null;
            jn stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            jn stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            jn stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            jn stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            jn stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            jn stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            jn stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            jn stackOut_20_0 = null;
            if (field_o != 0) {
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
                          var5 = new jn();
                          var4 = var5;
                          stackOut_8_0 = (jn) (var4);
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_u) {
                            stackOut_10_0 = (jn) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (jn) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((en) ((Object) stackIn_11_0)).field_k = new int[stackIn_11_1 * stackIn_11_2];
                          ((en) ((Object) var4)).field_t = param3;
                          ((en) ((Object) var4)).a(param1);
                          ((en) ((Object) var4)).field_c = (param3 & -1024) + 1024;
                          if (((en) ((Object) var4)).field_c <= 16384) {
                            break L4;
                          } else {
                            ((en) ((Object) var4)).field_c = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((en) ((Object) var4)).a(((en) ((Object) var4)).field_c);
                          if (field_s <= 0) {
                            break L5;
                          } else {
                            if (field_r != null) {
                              break L5;
                            } else {
                              field_r = new rc();
                              field_r.field_f = param0;
                              discarded$2 = param0.a((byte) 122, field_s, (Runnable) ((Object) field_r));
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_r == null) {
                            break L6;
                          } else {
                            if (field_r.field_l[param2] == null) {
                              field_r.field_l[param2] = (en) ((Object) var5);
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (jn) (var4);
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new en();
                    }
                    return (en) ((Object) stackIn_21_0);
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

    public static void f() {
        field_r = null;
    }

    final synchronized void b(ol param0) {
        this.field_b = param0;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void a() {
        try {
            this.field_i = true;
            try {
                this.h();
            } catch (Exception exception) {
                this.d();
                this.field_m = ik.a(4) + 2000L;
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
                field_o = param0;
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
              field_u = stackIn_7_0 != 0;
              field_s = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    private final void a(ol param0, int param1) {
        int var3 = param1 >> 5;
        ol var4 = this.field_h[var3];
        if (var4 == null) {
            this.field_p[var3] = param0;
        } else {
            var4.field_o = param0;
        }
        this.field_h[var3] = param0;
        param0.field_n = param1;
    }

    void d() {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        ol var7 = null;
        int var8_int = 0;
        ol[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        ol var11 = null;
        ti var12 = null;
        int var13 = 0;
        ol var14 = null;
        ol var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_u) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          an.a(param0, 0, var3);
          this.field_l = this.field_l - param1;
          if (this.field_b == null) {
            break L1;
          } else {
            if (this.field_l > 0) {
              break L1;
            } else {
              this.field_l = this.field_l + (field_o >> 4);
              en.a(this.field_b);
              this.a(this.field_b, this.field_b.b());
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
                                  var12 = var11.field_q;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_n <= var8_int) {
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
                                    var12.field_n = var12.field_n + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < this.field_n) {
                                  L10: {
                                    var14 = var11.d();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_n;
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
                                    var15 = var11.field_o;
                                    var11.field_o = null;
                                    if (var10 != null) {
                                      ((ol) (var10)).field_o = var15;
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
                                      this.field_h[var7_int] = (ol) (var10);
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
                    this.field_h[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_o;
                        var7.field_o = null;
                        var7 = (ol) (var10);
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
          if (this.field_b == null) {
            break L17;
          } else {
            this.field_b.b(param0, 0, param1);
            break L17;
          }
        }
        this.field_a = ik.a(4);
    }

    private final void b(int param0) {
        this.field_l = this.field_l - param0;
        if (this.field_l < 0) {
            this.field_l = 0;
        }
        if (this.field_b != null) {
            this.field_b.a(param0);
            return;
        }
    }

    private final static void a(ol param0) {
        param0.field_p = false;
        if (param0.field_q != null) {
            param0.field_q.field_n = 0;
        }
        ol var1 = param0.d();
        while (var1 != null) {
            en.a(var1);
            var1 = param0.c();
        }
    }

    int c() throws Exception {
        return this.field_c;
    }

    final synchronized void e() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_r == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_r.field_j = true;
                  L2: while (true) {
                    if (!field_r.field_b) {
                      field_r = null;
                      break L0;
                    } else {
                      ua.a(50L, -128);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if (field_r.field_l[var2] != this) {
                    break L3;
                  } else {
                    field_r.field_l[var2] = null;
                    break L3;
                  }
                }
                if (field_r.field_l[var2] != null) {
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
        this.field_k = null;
        this.field_f = true;
    }

    en() {
        this.field_n = 32;
        this.field_f = false;
        this.field_a = ik.a(4);
        this.field_i = true;
        this.field_h = new ol[8];
        this.field_j = 0;
        this.field_l = 0;
        this.field_p = new ol[8];
        this.field_m = 0L;
        this.field_e = 0;
        this.field_q = 0;
        this.field_g = 0L;
    }
}
