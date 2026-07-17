/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kh {
    private qd field_u;
    private boolean field_k;
    static int field_p;
    private static int field_i;
    private int field_l;
    private long field_h;
    int[] field_b;
    static boolean field_g;
    private static bb field_n;
    private int field_r;
    private int field_e;
    private qd[] field_f;
    private boolean field_a;
    private int field_c;
    private qd[] field_s;
    private int field_t;
    private long field_j;
    private int field_q;
    private long field_o;
    private int field_m;
    private int field_d;

    private final static void a(qd param0) {
        param0.field_j = false;
        if (param0.field_k != null) {
            param0.field_k.field_i = 0;
        }
        qd var1 = param0.c();
        while (var1 != null) {
            kh.a(var1);
            var1 = param0.b();
        }
    }

    void d() {
    }

    public static void a() {
        field_n = null;
    }

    final synchronized void g() {
        try {
            ((kh) this).field_a = true;
            try {
                ((kh) this).c();
            } catch (Exception exception) {
                ((kh) this).d();
                ((kh) this).field_o = ol.a(256) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    int e() throws Exception {
        return ((kh) this).field_t;
    }

    void c() throws Exception {
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
                field_p = param0;
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
              field_i = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final static kh a(uj param0, java.awt.Component param1, int param2, int param3) {
        try {
            sk var4 = null;
            Throwable var4_ref = null;
            sk var5 = null;
            sk stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            sk stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            sk stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            sk stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            sk stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            sk stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            sk stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            sk stackOut_20_0 = null;
            if (field_p != 0) {
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
                          var5 = new sk();
                          var4 = var5;
                          stackOut_8_0 = (sk) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_g) {
                            stackOut_10_0 = (sk) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (sk) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((kh) (Object) stackIn_11_0).field_b = new int[stackIn_11_1 * stackIn_11_2];
                          ((kh) (Object) var4).field_r = param3;
                          ((kh) (Object) var4).a(param1);
                          ((kh) (Object) var4).field_t = (param3 & -1024) + 1024;
                          if (((kh) (Object) var4).field_t <= 16384) {
                            break L4;
                          } else {
                            ((kh) (Object) var4).field_t = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((kh) (Object) var4).b(((kh) (Object) var4).field_t);
                          if (field_i <= 0) {
                            break L5;
                          } else {
                            if (field_n != null) {
                              break L5;
                            } else {
                              field_n = new bb();
                              field_n.field_b = param0;
                              mi discarded$2 = param0.a((Runnable) (Object) field_n, true, field_i);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_n == null) {
                            break L6;
                          } else {
                            if (field_n.field_a[param2] == null) {
                              field_n.field_a[param2] = (kh) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (sk) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new kh();
                    }
                    return (kh) (Object) stackIn_21_0;
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
        qd var7 = null;
        int var8_int = 0;
        qd[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        qd var11 = null;
        se var12 = null;
        int var13 = 0;
        qd var14 = null;
        qd var15 = null;
        int var15_int = 0;
        L0: {
          var3 = 256;
          if (!field_g) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          he.a(param0, 0, var3);
          ((kh) this).field_e = ((kh) this).field_e - 256;
          if (((kh) this).field_u == null) {
            break L1;
          } else {
            if (((kh) this).field_e > 0) {
              break L1;
            } else {
              ((kh) this).field_e = ((kh) this).field_e + (field_p >> 4);
              kh.a(((kh) this).field_u);
              this.a(((kh) this).field_u, ((kh) this).field_u.d());
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
                            var11 = ((kh) this).field_f[var7_int];
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
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_i;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_j = true;
                                  var13 = var11.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_i = var12.field_i + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((kh) this).field_l) {
                                  L10: {
                                    var14 = var11.c();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_l;
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
                                    var15 = var11.field_i;
                                    var11.field_i = null;
                                    if (var10 != null) {
                                      ((qd) var10).field_i = var15;
                                      break L12;
                                    } else {
                                      ((kh) this).field_f[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((kh) this).field_s[var7_int] = (qd) var10;
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
                    var7 = ((kh) this).field_f[var6];
                    var8 = ((kh) this).field_f;
                    var9 = var6;
                    ((kh) this).field_s[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_i;
                        var7.field_i = null;
                        var7 = (qd) var10;
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
          if (((kh) this).field_e >= 0) {
            break L16;
          } else {
            ((kh) this).field_e = 0;
            break L16;
          }
        }
        L17: {
          if (((kh) this).field_u == null) {
            break L17;
          } else {
            ((kh) this).field_u.b(param0, 0, 256);
            break L17;
          }
        }
        ((kh) this).field_h = ol.a(256);
    }

    void f() throws Exception {
    }

    final synchronized void b(qd param0) {
        ((kh) this).field_u = param0;
    }

    final synchronized void b() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_n == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_n.field_e = true;
                  L2: while (true) {
                    if (!field_n.field_f) {
                      field_n = null;
                      break L0;
                    } else {
                      c.a(-105, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_n.field_a[var2] != this) {
                    break L3;
                  } else {
                    field_n.field_a[var2] = null;
                    break L3;
                  }
                }
                if (field_n.field_a[var2] != null) {
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
        ((kh) this).d();
        ((kh) this).field_b = null;
        ((kh) this).field_k = true;
    }

    private final void a(qd param0, int param1) {
        int var3 = param1 >> 5;
        qd var4 = ((kh) this).field_s[var3];
        if (var4 == null) {
            ((kh) this).field_f[var3] = param0;
        } else {
            var4.field_i = param0;
        }
        ((kh) this).field_s[var3] = param0;
        param0.field_l = param1;
    }

    void b(int param0) throws Exception {
    }

    private final void a(int param0) {
        ((kh) this).field_e = ((kh) this).field_e - 256;
        if (((kh) this).field_e < 0) {
            ((kh) this).field_e = 0;
        }
        if (((kh) this).field_u != null) {
            ((kh) this).field_u.a(256);
            return;
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void h() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((kh) this).field_k) {
              var1 = ol.a(256);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((kh) this).field_h + 6000L) {
                      break L1;
                    } else {
                      ((kh) this).field_h = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((kh) this).field_h + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((kh) this).field_h = ((kh) this).field_h + (long)(256000 / field_p);
                      var1 = ol.a(256);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((kh) this).field_h = var1;
                  break L3;
                }
              }
              if (((kh) this).field_b != null) {
                try {
                  L4: {
                    L5: {
                      if (((kh) this).field_o == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((kh) this).field_o) {
                          ((kh) this).b(((kh) this).field_t);
                          ((kh) this).field_o = 0L;
                          ((kh) this).field_a = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((kh) this).e();
                      if (((kh) this).field_m - var3_int <= ((kh) this).field_d) {
                        break L6;
                      } else {
                        ((kh) this).field_d = ((kh) this).field_m - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((kh) this).field_r + ((kh) this).field_c;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((kh) this).field_t) {
                        break L8;
                      } else {
                        L9: {
                          ((kh) this).field_t = ((kh) this).field_t + 1024;
                          if (((kh) this).field_t <= 16384) {
                            break L9;
                          } else {
                            ((kh) this).field_t = 16384;
                            break L9;
                          }
                        }
                        ((kh) this).d();
                        ((kh) this).b(((kh) this).field_t);
                        var3_int = 0;
                        ((kh) this).field_a = true;
                        if (var4 + 256 <= ((kh) this).field_t) {
                          break L8;
                        } else {
                          var4 = ((kh) this).field_t - 256;
                          ((kh) this).field_c = var4 - ((kh) this).field_r;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((kh) this).field_j) {
                            break L11;
                          } else {
                            L12: {
                              if (((kh) this).field_a) {
                                ((kh) this).field_a = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((kh) this).field_d != 0) {
                                    break L13;
                                  } else {
                                    if (((kh) this).field_q != 0) {
                                      break L13;
                                    } else {
                                      ((kh) this).d();
                                      ((kh) this).field_o = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((kh) this).field_c = Math.min(((kh) this).field_q, ((kh) this).field_d);
                                ((kh) this).field_q = ((kh) this).field_d;
                                break L12;
                              }
                            }
                            ((kh) this).field_d = 0;
                            ((kh) this).field_j = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((kh) this).field_m = var3_int;
                        break L4;
                      } else {
                        this.a(((kh) this).field_b, 256);
                        ((kh) this).f();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((kh) this).d();
                    ((kh) this).field_o = var1 + 2000L;
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

    kh() {
        ((kh) this).field_k = false;
        ((kh) this).field_l = 32;
        ((kh) this).field_h = ol.a(256);
        ((kh) this).field_a = true;
        ((kh) this).field_e = 0;
        ((kh) this).field_q = 0;
        ((kh) this).field_j = 0L;
        ((kh) this).field_o = 0L;
        ((kh) this).field_f = new qd[8];
        ((kh) this).field_s = new qd[8];
        ((kh) this).field_m = 0;
        ((kh) this).field_d = 0;
    }
}
