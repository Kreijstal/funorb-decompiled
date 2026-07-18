/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qk {
    static boolean field_q;
    private static kh field_r;
    private long field_n;
    private boolean field_h;
    private int field_l;
    int[] field_c;
    private static int field_d;
    private ia field_k;
    static int field_j;
    private ia[] field_a;
    private int field_g;
    private int field_f;
    private long field_e;
    private int field_t;
    private boolean field_o;
    private long field_m;
    private int field_u;
    private ia[] field_b;
    private int field_p;
    private int field_s;
    private int field_i;

    void e() throws Exception {
    }

    final static qk a(d param0, java.awt.Component param1, int param2, int param3) {
        try {
            ce var4 = null;
            Throwable var4_ref = null;
            ce var5 = null;
            ce stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ce stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ce stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ce stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ce stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ce stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ce stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ce stackOut_20_0 = null;
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
                          var5 = new ce();
                          var4 = var5;
                          stackOut_8_0 = (ce) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_q) {
                            stackOut_10_0 = (ce) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (ce) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((qk) (Object) stackIn_11_0).field_c = new int[stackIn_11_1 * stackIn_11_2];
                          ((qk) (Object) var4).field_i = param3;
                          ((qk) (Object) var4).a(param1);
                          ((qk) (Object) var4).field_g = (param3 & -1024) + 1024;
                          if (((qk) (Object) var4).field_g <= 16384) {
                            break L4;
                          } else {
                            ((qk) (Object) var4).field_g = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((qk) (Object) var4).a(((qk) (Object) var4).field_g);
                          if (field_d <= 0) {
                            break L5;
                          } else {
                            if (field_r != null) {
                              break L5;
                            } else {
                              field_r = new kh();
                              field_r.field_b = param0;
                              cb discarded$2 = param0.a((Runnable) (Object) field_r, 0, field_d);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_r == null) {
                            break L6;
                          } else {
                            if (field_r.field_g[param2] == null) {
                              field_r.field_g[param2] = (qk) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (ce) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new qk();
                    }
                    return (qk) (Object) stackIn_21_0;
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

    final synchronized void a() {
        try {
            ((qk) this).field_o = true;
            try {
                ((qk) this).d();
            } catch (Exception exception) {
                ((qk) this).f();
                ((qk) this).field_m = oa.a(-12520) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(int param0) throws Exception {
    }

    final synchronized void c() {
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
                  field_r.field_f = true;
                  L2: while (true) {
                    if (!field_r.field_c) {
                      field_r = null;
                      break L0;
                    } else {
                      bc.a(0, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_r.field_g[var2] != this) {
                    break L3;
                  } else {
                    field_r.field_g[var2] = null;
                    break L3;
                  }
                }
                if (field_r.field_g[var2] != null) {
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
        ((qk) this).f();
        ((qk) this).field_c = null;
        ((qk) this).field_h = true;
    }

    final synchronized void b(ia param0) {
        ((qk) this).field_k = param0;
    }

    void d() throws Exception {
    }

    private final static void a(ia param0) {
        param0.field_f = false;
        if (param0.field_g != null) {
            param0.field_g.field_f = 0;
        }
        ia var1 = param0.b();
        while (var1 != null) {
            qk.a(var1);
            var1 = param0.c();
        }
    }

    public static void h() {
        field_r = null;
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
              field_d = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final synchronized void b() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((qk) this).field_h) {
              var1 = oa.a(-12520);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((qk) this).field_n + 6000L) {
                      break L1;
                    } else {
                      ((qk) this).field_n = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((qk) this).field_n + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((qk) this).field_n = ((qk) this).field_n + (long)(256000 / field_j);
                      var1 = oa.a(-12520);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((qk) this).field_n = var1;
                  break L3;
                }
              }
              if (((qk) this).field_c != null) {
                try {
                  L4: {
                    L5: {
                      if (((qk) this).field_m == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((qk) this).field_m) {
                          ((qk) this).a(((qk) this).field_g);
                          ((qk) this).field_m = 0L;
                          ((qk) this).field_o = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((qk) this).g();
                      if (((qk) this).field_t - var3_int <= ((qk) this).field_s) {
                        break L6;
                      } else {
                        ((qk) this).field_s = ((qk) this).field_t - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((qk) this).field_i + ((qk) this).field_p;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((qk) this).field_g) {
                        break L8;
                      } else {
                        L9: {
                          ((qk) this).field_g = ((qk) this).field_g + 1024;
                          if (((qk) this).field_g <= 16384) {
                            break L9;
                          } else {
                            ((qk) this).field_g = 16384;
                            break L9;
                          }
                        }
                        ((qk) this).f();
                        ((qk) this).a(((qk) this).field_g);
                        var3_int = 0;
                        ((qk) this).field_o = true;
                        if (var4 + 256 <= ((qk) this).field_g) {
                          break L8;
                        } else {
                          var4 = ((qk) this).field_g - 256;
                          ((qk) this).field_p = var4 - ((qk) this).field_i;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((qk) this).field_e) {
                            break L11;
                          } else {
                            L12: {
                              if (((qk) this).field_o) {
                                ((qk) this).field_o = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((qk) this).field_s != 0) {
                                    break L13;
                                  } else {
                                    if (((qk) this).field_f != 0) {
                                      break L13;
                                    } else {
                                      ((qk) this).f();
                                      ((qk) this).field_m = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((qk) this).field_p = Math.min(((qk) this).field_f, ((qk) this).field_s);
                                ((qk) this).field_f = ((qk) this).field_s;
                                break L12;
                              }
                            }
                            ((qk) this).field_s = 0;
                            ((qk) this).field_e = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((qk) this).field_t = var3_int;
                        break L4;
                      } else {
                        this.a(((qk) this).field_c, 256);
                        ((qk) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((qk) this).f();
                    ((qk) this).field_m = var1 + 2000L;
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

    private final void a(ia param0, int param1) {
        int var3 = param1 >> 5;
        ia var4 = ((qk) this).field_b[var3];
        if (var4 == null) {
            ((qk) this).field_a[var3] = param0;
        } else {
            var4.field_h = param0;
        }
        ((qk) this).field_b[var3] = param0;
        param0.field_i = param1;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        ia var7 = null;
        int var8_int = 0;
        ia[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        ia var11 = null;
        e var12 = null;
        int var13 = 0;
        ia var14 = null;
        ia var15 = null;
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
          sf.a(param0, 0, var3);
          ((qk) this).field_u = ((qk) this).field_u - param1;
          if (((qk) this).field_k == null) {
            break L1;
          } else {
            if (((qk) this).field_u > 0) {
              break L1;
            } else {
              ((qk) this).field_u = ((qk) this).field_u + (field_j >> 4);
              qk.a(((qk) this).field_k);
              this.a(((qk) this).field_k, ((qk) this).field_k.a());
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
                            var11 = ((qk) this).field_a[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_g;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_f <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_h;
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
                                if (var4 < ((qk) this).field_l) {
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
                                          this.a(var14, var15_int * var14.a() >> 8);
                                          var14 = var11.c();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_h;
                                    var11.field_h = null;
                                    if (var10 != null) {
                                      ((ia) var10).field_h = var15;
                                      break L12;
                                    } else {
                                      ((qk) this).field_a[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((qk) this).field_b[var7_int] = (ia) var10;
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
                    var7 = ((qk) this).field_a[var6];
                    var8 = ((qk) this).field_a;
                    var9 = var6;
                    ((qk) this).field_b[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_h;
                        var7.field_h = null;
                        var7 = (ia) var10;
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
          if (((qk) this).field_u >= 0) {
            break L16;
          } else {
            ((qk) this).field_u = 0;
            break L16;
          }
        }
        L17: {
          if (((qk) this).field_k == null) {
            break L17;
          } else {
            ((qk) this).field_k.a(param0, 0, param1);
            break L17;
          }
        }
        ((qk) this).field_n = oa.a(-12520);
    }

    private final void b(int param0) {
        ((qk) this).field_u = ((qk) this).field_u - param0;
        if (((qk) this).field_u < 0) {
            ((qk) this).field_u = 0;
        }
        if (((qk) this).field_k != null) {
            ((qk) this).field_k.b(param0);
            return;
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    int g() throws Exception {
        return ((qk) this).field_g;
    }

    void f() {
    }

    qk() {
        ((qk) this).field_h = false;
        ((qk) this).field_l = 32;
        ((qk) this).field_n = oa.a(-12520);
        ((qk) this).field_o = true;
        ((qk) this).field_a = new ia[8];
        ((qk) this).field_t = 0;
        ((qk) this).field_e = 0L;
        ((qk) this).field_f = 0;
        ((qk) this).field_m = 0L;
        ((qk) this).field_s = 0;
        ((qk) this).field_u = 0;
        ((qk) this).field_b = new ia[8];
    }
}
