/*
 * Decompiled by CFR-JS 0.4.0.
 */
class va {
    int[] field_h;
    static boolean field_n;
    private boolean field_u;
    private static ff field_g;
    static int field_i;
    private static int field_a;
    private int field_t;
    private long field_d;
    private fh field_b;
    private int field_m;
    private int field_r;
    private fh[] field_p;
    private int field_c;
    private int field_j;
    private int field_k;
    private long field_e;
    private int field_q;
    private long field_o;
    private int field_l;
    private boolean field_s;
    private fh[] field_f;

    void f() {
    }

    void e() throws Exception {
    }

    final synchronized void b(fh param0) {
        ((va) this).field_b = param0;
    }

    final static void a(int param0, boolean param1, int param2) {
        field_i = 22050;
        field_n = true;
        field_a = 10;
    }

    int a() throws Exception {
        return ((va) this).field_k;
    }

    private final void b(int param0) {
        ((va) this).field_j = ((va) this).field_j - param0;
        if (((va) this).field_j < 0) {
            ((va) this).field_j = 0;
        }
        if (((va) this).field_b != null) {
            ((va) this).field_b.a(param0);
            return;
        }
    }

    final synchronized void b() {
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
                  field_g.field_f = true;
                  L2: while (true) {
                    if (!field_g.field_d) {
                      field_g = null;
                      break L0;
                    } else {
                      int discarded$1 = 0;
                      em.a(50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_g.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_g.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_g.field_c[var2] != null) {
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
        ((va) this).f();
        ((va) this).field_h = null;
        ((va) this).field_u = true;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void a(int param0) throws Exception {
    }

    final static va a(md param0, java.awt.Component param1, int param2, int param3) {
        try {
            ij var4 = null;
            Throwable var4_ref = null;
            ij var5 = null;
            ij stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ij stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ij stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ij stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ij stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ij stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ij stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ij stackOut_20_0 = null;
            if (field_i != 0) {
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
                          var5 = new ij();
                          var4 = var5;
                          stackOut_8_0 = (ij) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_n) {
                            stackOut_10_0 = (ij) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (ij) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((va) (Object) stackIn_11_0).field_h = new int[stackIn_11_1 * stackIn_11_2];
                          ((va) (Object) var4).field_l = param3;
                          ((va) (Object) var4).a(param1);
                          ((va) (Object) var4).field_k = (param3 & -1024) + 1024;
                          if (((va) (Object) var4).field_k <= 16384) {
                            break L4;
                          } else {
                            ((va) (Object) var4).field_k = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((va) (Object) var4).a(((va) (Object) var4).field_k);
                          if (field_a <= 0) {
                            break L5;
                          } else {
                            if (field_g != null) {
                              break L5;
                            } else {
                              field_g = new ff();
                              field_g.field_b = param0;
                              ic discarded$2 = param0.a((Runnable) (Object) field_g, field_a, 0);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_g == null) {
                            break L6;
                          } else {
                            if (field_g.field_c[param2] == null) {
                              field_g.field_c[param2] = (va) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (ij) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new va();
                    }
                    return (va) (Object) stackIn_21_0;
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

    private final void a(fh param0, int param1) {
        int var3 = param1 >> 5;
        fh var4 = ((va) this).field_p[var3];
        if (var4 == null) {
            ((va) this).field_f[var3] = param0;
        } else {
            var4.field_g = param0;
        }
        ((va) this).field_p[var3] = param0;
        param0.field_f = param1;
    }

    public static void d() {
        field_g = null;
    }

    private final static void a(fh param0) {
        param0.field_h = false;
        if (param0.field_e != null) {
            param0.field_e.field_e = 0;
        }
        fh var1 = param0.a();
        while (var1 != null) {
            va.a(var1);
            var1 = param0.b();
        }
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        fh var7 = null;
        int var8_int = 0;
        fh[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        fh var11 = null;
        jl var12 = null;
        int var13 = 0;
        fh var14 = null;
        fh var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_n) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          gl.a(param0, 0, var3);
          ((va) this).field_j = ((va) this).field_j - param1;
          if (((va) this).field_b == null) {
            break L1;
          } else {
            if (((va) this).field_j > 0) {
              break L1;
            } else {
              ((va) this).field_j = ((va) this).field_j + (field_i >> 4);
              va.a(((va) this).field_b);
              this.a(((va) this).field_b, ((va) this).field_b.c());
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
                            var5 = var5 & ~(1 << var7_int);
                            var10 = null;
                            var11 = ((va) this).field_f[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_e;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_e <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_g;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_h = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_e = var12.field_e + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((va) this).field_t) {
                                  L10: {
                                    var14 = var11.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_f;
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
                                    var15 = var11.field_g;
                                    var11.field_g = null;
                                    if (var10 != null) {
                                      ((fh) var10).field_g = var15;
                                      break L12;
                                    } else {
                                      ((va) this).field_f[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((va) this).field_p[var7_int] = (fh) var10;
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
                    var7 = ((va) this).field_f[var6];
                    var8 = ((va) this).field_f;
                    var9 = var6;
                    ((va) this).field_p[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_g;
                        var7.field_g = null;
                        var7 = (fh) var10;
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
          if (((va) this).field_j >= 0) {
            break L16;
          } else {
            ((va) this).field_j = 0;
            break L16;
          }
        }
        L17: {
          if (((va) this).field_b == null) {
            break L17;
          } else {
            ((va) this).field_b.b(param0, 0, param1);
            break L17;
          }
        }
        ((va) this).field_d = pf.a(0);
    }

    final synchronized void c() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((va) this).field_u) {
              var1 = pf.a(0);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((va) this).field_d + 6000L) {
                      break L1;
                    } else {
                      ((va) this).field_d = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((va) this).field_d + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((va) this).field_d = ((va) this).field_d + (long)(256000 / field_i);
                      var1 = pf.a(0);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((va) this).field_d = var1;
                  break L3;
                }
              }
              if (((va) this).field_h != null) {
                try {
                  L4: {
                    L5: {
                      if (((va) this).field_o == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((va) this).field_o) {
                          ((va) this).a(((va) this).field_k);
                          ((va) this).field_o = 0L;
                          ((va) this).field_s = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((va) this).a();
                      if (((va) this).field_c - var3_int <= ((va) this).field_m) {
                        break L6;
                      } else {
                        ((va) this).field_m = ((va) this).field_c - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((va) this).field_l + ((va) this).field_q;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((va) this).field_k) {
                        break L8;
                      } else {
                        L9: {
                          ((va) this).field_k = ((va) this).field_k + 1024;
                          if (((va) this).field_k <= 16384) {
                            break L9;
                          } else {
                            ((va) this).field_k = 16384;
                            break L9;
                          }
                        }
                        ((va) this).f();
                        ((va) this).a(((va) this).field_k);
                        var3_int = 0;
                        ((va) this).field_s = true;
                        if (var4 + 256 <= ((va) this).field_k) {
                          break L8;
                        } else {
                          var4 = ((va) this).field_k - 256;
                          ((va) this).field_q = var4 - ((va) this).field_l;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((va) this).field_e) {
                            break L11;
                          } else {
                            L12: {
                              if (((va) this).field_s) {
                                ((va) this).field_s = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((va) this).field_m != 0) {
                                    break L13;
                                  } else {
                                    if (((va) this).field_r != 0) {
                                      break L13;
                                    } else {
                                      ((va) this).f();
                                      ((va) this).field_o = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((va) this).field_q = Math.min(((va) this).field_r, ((va) this).field_m);
                                ((va) this).field_r = ((va) this).field_m;
                                break L12;
                              }
                            }
                            ((va) this).field_m = 0;
                            ((va) this).field_e = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((va) this).field_c = var3_int;
                        break L4;
                      } else {
                        this.a(((va) this).field_h, 256);
                        ((va) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((va) this).f();
                    ((va) this).field_o = var1 + 2000L;
                    break L14;
                  }
                }
                return;
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

    va() {
        ((va) this).field_u = false;
        ((va) this).field_t = 32;
        ((va) this).field_d = pf.a(0);
        ((va) this).field_p = new fh[8];
        ((va) this).field_m = 0;
        ((va) this).field_r = 0;
        ((va) this).field_j = 0;
        ((va) this).field_c = 0;
        ((va) this).field_o = 0L;
        ((va) this).field_f = new fh[8];
        ((va) this).field_s = true;
        ((va) this).field_e = 0L;
    }
}
