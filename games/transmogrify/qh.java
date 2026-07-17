/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qh {
    static boolean field_g;
    int[] field_i;
    private ag field_j;
    private static ef field_b;
    private int field_d;
    private long field_n;
    private static int field_a;
    private boolean field_m;
    static int field_p;
    private int field_s;
    private ag[] field_t;
    private int field_q;
    private long field_f;
    private int field_u;
    private boolean field_l;
    private ag[] field_h;
    private int field_r;
    private int field_c;
    private int field_e;
    private long field_k;
    private int field_o;

    final synchronized void c() {
        try {
            ((qh) this).field_l = true;
            try {
                ((qh) this).g();
            } catch (Exception exception) {
                ((qh) this).h();
                ((qh) this).field_k = lk.a(0) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void b(int param0) throws Exception {
    }

    private final void a(ag param0, int param1) {
        int var3 = param1 >> 5;
        ag var4 = ((qh) this).field_t[var3];
        if (var4 == null) {
            ((qh) this).field_h[var3] = param0;
        } else {
            var4.field_i = param0;
        }
        ((qh) this).field_t[var3] = param0;
        param0.field_j = param1;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final static qh a(fe param0, java.awt.Component param1, int param2, int param3) {
        try {
            ph var4 = null;
            Throwable var4_ref = null;
            ph var5 = null;
            ph stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ph stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ph stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ph stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ph stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ph stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ph stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ph stackOut_20_0 = null;
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
                          var5 = new ph();
                          var4 = var5;
                          stackOut_8_0 = (ph) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_g) {
                            stackOut_10_0 = (ph) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (ph) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((qh) (Object) stackIn_11_0).field_i = new int[stackIn_11_1 * stackIn_11_2];
                          ((qh) (Object) var4).field_c = param3;
                          ((qh) (Object) var4).a(param1);
                          ((qh) (Object) var4).field_r = (param3 & -1024) + 1024;
                          if (((qh) (Object) var4).field_r <= 16384) {
                            break L4;
                          } else {
                            ((qh) (Object) var4).field_r = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((qh) (Object) var4).b(((qh) (Object) var4).field_r);
                          if (field_a <= 0) {
                            break L5;
                          } else {
                            if (field_b != null) {
                              break L5;
                            } else {
                              field_b = new ef();
                              field_b.field_b = param0;
                              ib discarded$2 = param0.a((Runnable) (Object) field_b, field_a, 65535);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_b == null) {
                            break L6;
                          } else {
                            if (field_b.field_f[param2] == null) {
                              field_b.field_f[param2] = (qh) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (ph) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new qh();
                    }
                    return (qh) (Object) stackIn_21_0;
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

    private final void a(int param0) {
        ((qh) this).field_e = ((qh) this).field_e - param0;
        if (((qh) this).field_e < 0) {
            ((qh) this).field_e = 0;
        }
        if (((qh) this).field_j != null) {
            ((qh) this).field_j.d(param0);
            return;
        }
    }

    int b() throws Exception {
        return ((qh) this).field_r;
    }

    final synchronized void a() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((qh) this).field_m) {
              var1 = lk.a(0);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((qh) this).field_n + 6000L) {
                      break L1;
                    } else {
                      ((qh) this).field_n = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((qh) this).field_n + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((qh) this).field_n = ((qh) this).field_n + (long)(256000 / field_p);
                      var1 = lk.a(0);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((qh) this).field_n = var1;
                  break L3;
                }
              }
              if (((qh) this).field_i != null) {
                try {
                  L4: {
                    L5: {
                      if (((qh) this).field_k == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((qh) this).field_k) {
                          ((qh) this).b(((qh) this).field_r);
                          ((qh) this).field_k = 0L;
                          ((qh) this).field_l = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((qh) this).b();
                      if (((qh) this).field_o - var3_int <= ((qh) this).field_q) {
                        break L6;
                      } else {
                        ((qh) this).field_q = ((qh) this).field_o - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((qh) this).field_c + ((qh) this).field_s;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((qh) this).field_r) {
                        break L8;
                      } else {
                        L9: {
                          ((qh) this).field_r = ((qh) this).field_r + 1024;
                          if (((qh) this).field_r <= 16384) {
                            break L9;
                          } else {
                            ((qh) this).field_r = 16384;
                            break L9;
                          }
                        }
                        ((qh) this).h();
                        ((qh) this).b(((qh) this).field_r);
                        var3_int = 0;
                        ((qh) this).field_l = true;
                        if (var4 + 256 <= ((qh) this).field_r) {
                          break L8;
                        } else {
                          var4 = ((qh) this).field_r - 256;
                          ((qh) this).field_s = var4 - ((qh) this).field_c;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((qh) this).field_f) {
                            break L11;
                          } else {
                            L12: {
                              if (((qh) this).field_l) {
                                ((qh) this).field_l = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((qh) this).field_q != 0) {
                                    break L13;
                                  } else {
                                    if (((qh) this).field_u != 0) {
                                      break L13;
                                    } else {
                                      ((qh) this).h();
                                      ((qh) this).field_k = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((qh) this).field_s = Math.min(((qh) this).field_u, ((qh) this).field_q);
                                ((qh) this).field_u = ((qh) this).field_q;
                                break L12;
                              }
                            }
                            ((qh) this).field_q = 0;
                            ((qh) this).field_f = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((qh) this).field_o = var3_int;
                        break L4;
                      } else {
                        this.a(((qh) this).field_i, 256);
                        ((qh) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((qh) this).h();
                    ((qh) this).field_k = var1 + 2000L;
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

    final synchronized void b(ag param0) {
        ((qh) this).field_j = param0;
    }

    void g() throws Exception {
    }

    final static void a(int param0, boolean param1) {
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
              field_a = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void e() throws Exception {
    }

    private final static void a(ag param0) {
        param0.field_h = false;
        if (param0.field_g != null) {
            param0.field_g.field_g = 0;
        }
        ag var1 = param0.d();
        while (var1 != null) {
            qh.a(var1);
            var1 = param0.a();
        }
    }

    public static void f() {
        field_b = null;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        ag var7 = null;
        int var8_int = 0;
        ag[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        ag var11 = null;
        fh var12 = null;
        int var13 = 0;
        ag var14 = null;
        ag var15 = null;
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
          ji.a(param0, 0, var3);
          ((qh) this).field_e = ((qh) this).field_e - param1;
          if (((qh) this).field_j == null) {
            break L1;
          } else {
            if (((qh) this).field_e > 0) {
              break L1;
            } else {
              ((qh) this).field_e = ((qh) this).field_e + (field_p >> 4);
              qh.a(((qh) this).field_j);
              this.a(((qh) this).field_j, ((qh) this).field_j.c());
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
                            var11 = ((qh) this).field_h[var7_int];
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
                                    if (var12.field_g <= var8_int) {
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
                                  var11.field_h = true;
                                  var13 = var11.b();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_g = var12.field_g + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((qh) this).field_d) {
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
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11.a();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_i;
                                    var11.field_i = null;
                                    if (var10 != null) {
                                      ((ag) var10).field_i = var15;
                                      break L12;
                                    } else {
                                      ((qh) this).field_h[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((qh) this).field_t[var7_int] = (ag) var10;
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
                    var7 = ((qh) this).field_h[var6];
                    var8 = ((qh) this).field_h;
                    var9 = var6;
                    ((qh) this).field_t[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_i;
                        var7.field_i = null;
                        var7 = (ag) var10;
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
          if (((qh) this).field_e >= 0) {
            break L16;
          } else {
            ((qh) this).field_e = 0;
            break L16;
          }
        }
        L17: {
          if (((qh) this).field_j == null) {
            break L17;
          } else {
            ((qh) this).field_j.b(param0, 0, param1);
            break L17;
          }
        }
        ((qh) this).field_n = lk.a(0);
    }

    final synchronized void d() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_b == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_b.field_a = true;
                  L2: while (true) {
                    if (!field_b.field_d) {
                      field_b = null;
                      break L0;
                    } else {
                      pg.a(50L, -122);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_b.field_f[var2] != this) {
                    break L3;
                  } else {
                    field_b.field_f[var2] = null;
                    break L3;
                  }
                }
                if (field_b.field_f[var2] != null) {
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
        ((qh) this).h();
        ((qh) this).field_i = null;
        ((qh) this).field_m = true;
    }

    qh() {
        ((qh) this).field_d = 32;
        ((qh) this).field_m = false;
        ((qh) this).field_n = lk.a(0);
        ((qh) this).field_t = new ag[8];
        ((qh) this).field_u = 0;
        ((qh) this).field_h = new ag[8];
        ((qh) this).field_l = true;
        ((qh) this).field_q = 0;
        ((qh) this).field_e = 0;
        ((qh) this).field_f = 0L;
        ((qh) this).field_k = 0L;
        ((qh) this).field_o = 0;
    }
}
