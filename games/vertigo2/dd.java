/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dd {
    static boolean field_h;
    static int field_u;
    private boolean field_g;
    private long field_k;
    private int field_o;
    int[] field_i;
    private static jr field_j;
    private static int field_e;
    private sn field_r;
    private boolean field_f;
    private int field_d;
    private sn[] field_a;
    private int field_t;
    private long field_p;
    private int field_b;
    private sn[] field_q;
    private int field_m;
    private int field_l;
    private long field_n;
    private int field_s;
    private int field_c;

    private final void a(int param0) {
        ((dd) this).field_c = ((dd) this).field_c - 256;
        if (((dd) this).field_c < 0) {
            ((dd) this).field_c = 0;
        }
        if (((dd) this).field_r != null) {
            ((dd) this).field_r.a(256);
            return;
        }
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        sn var7 = null;
        int var8_int = 0;
        sn[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        sn var11 = null;
        dr var12 = null;
        int var13 = 0;
        sn var14 = null;
        sn var15 = null;
        int var15_int = 0;
        L0: {
          var3 = 256;
          if (!field_h) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          qq.a(param0, 0, var3);
          ((dd) this).field_c = ((dd) this).field_c - 256;
          if (((dd) this).field_r == null) {
            break L1;
          } else {
            if (((dd) this).field_c > 0) {
              break L1;
            } else {
              ((dd) this).field_c = ((dd) this).field_c + (field_u >> 4);
              dd.b(((dd) this).field_r);
              this.a(((dd) this).field_r, ((dd) this).field_r.b());
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
                            var11 = ((dd) this).field_q[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_n;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_n <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_q;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_p = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_n = var12.field_n + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((dd) this).field_o) {
                                  L10: {
                                    var14 = var11.c();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_o;
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
                                    var15 = var11.field_q;
                                    var11.field_q = null;
                                    if (var10 != null) {
                                      ((sn) var10).field_q = var15;
                                      break L12;
                                    } else {
                                      ((dd) this).field_q[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((dd) this).field_a[var7_int] = (sn) var10;
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
                    var7 = ((dd) this).field_q[var6];
                    var8 = ((dd) this).field_q;
                    var9 = var6;
                    ((dd) this).field_a[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_q;
                        var7.field_q = null;
                        var7 = (sn) var10;
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
          if (((dd) this).field_c >= 0) {
            break L16;
          } else {
            ((dd) this).field_c = 0;
            break L16;
          }
        }
        L17: {
          if (((dd) this).field_r == null) {
            break L17;
          } else {
            ((dd) this).field_r.b(param0, 0, 256);
            break L17;
          }
        }
        ((dd) this).field_k = gk.a(113);
    }

    void e() throws Exception {
    }

    final synchronized void a(sn param0) {
        ((dd) this).field_r = param0;
    }

    final synchronized void b() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((dd) this).field_g) {
              var1 = gk.a(77);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((dd) this).field_k + 6000L) {
                      break L1;
                    } else {
                      ((dd) this).field_k = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((dd) this).field_k + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((dd) this).field_k = ((dd) this).field_k + (long)(256000 / field_u);
                      var1 = gk.a(99);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((dd) this).field_k = var1;
                  break L3;
                }
              }
              if (((dd) this).field_i != null) {
                try {
                  L4: {
                    L5: {
                      if (((dd) this).field_n == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((dd) this).field_n) {
                          ((dd) this).b(((dd) this).field_m);
                          ((dd) this).field_n = 0L;
                          ((dd) this).field_f = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((dd) this).g();
                      if (((dd) this).field_t - var3_int <= ((dd) this).field_b) {
                        break L6;
                      } else {
                        ((dd) this).field_b = ((dd) this).field_t - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((dd) this).field_d + ((dd) this).field_l;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((dd) this).field_m) {
                        break L8;
                      } else {
                        L9: {
                          ((dd) this).field_m = ((dd) this).field_m + 1024;
                          if (((dd) this).field_m <= 16384) {
                            break L9;
                          } else {
                            ((dd) this).field_m = 16384;
                            break L9;
                          }
                        }
                        ((dd) this).h();
                        ((dd) this).b(((dd) this).field_m);
                        var3_int = 0;
                        ((dd) this).field_f = true;
                        if (var4 + 256 <= ((dd) this).field_m) {
                          break L8;
                        } else {
                          var4 = ((dd) this).field_m - 256;
                          ((dd) this).field_l = var4 - ((dd) this).field_d;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((dd) this).field_p) {
                            break L11;
                          } else {
                            L12: {
                              if (((dd) this).field_f) {
                                ((dd) this).field_f = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((dd) this).field_b != 0) {
                                    break L13;
                                  } else {
                                    if (((dd) this).field_s != 0) {
                                      break L13;
                                    } else {
                                      ((dd) this).h();
                                      ((dd) this).field_n = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((dd) this).field_l = Math.min(((dd) this).field_s, ((dd) this).field_b);
                                ((dd) this).field_s = ((dd) this).field_b;
                                break L12;
                              }
                            }
                            ((dd) this).field_b = 0;
                            ((dd) this).field_p = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((dd) this).field_t = var3_int;
                        break L4;
                      } else {
                        this.a(((dd) this).field_i, 256);
                        ((dd) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((dd) this).h();
                    ((dd) this).field_n = var1 + 2000L;
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

    void h() {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    int g() throws Exception {
        return ((dd) this).field_m;
    }

    void b(int param0) throws Exception {
    }

    private final void a(sn param0, int param1) {
        int var3 = param1 >> 5;
        sn var4 = ((dd) this).field_a[var3];
        if (var4 == null) {
            ((dd) this).field_q[var3] = param0;
        } else {
            var4.field_q = param0;
        }
        ((dd) this).field_a[var3] = param0;
        param0.field_o = param1;
    }

    void f() throws Exception {
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
              field_h = stackIn_7_0 != 0;
              field_e = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final static dd a(jj param0, java.awt.Component param1, int param2, int param3) {
        try {
            vr var4 = null;
            Throwable var4_ref = null;
            vr var5 = null;
            vr stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            vr stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            vr stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            vr stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            vr stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            vr stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            vr stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            vr stackOut_20_0 = null;
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
                          var5 = new vr();
                          var4 = var5;
                          stackOut_8_0 = (vr) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_h) {
                            stackOut_10_0 = (vr) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (vr) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((dd) (Object) stackIn_11_0).field_i = new int[stackIn_11_1 * stackIn_11_2];
                          ((dd) (Object) var4).field_d = param3;
                          ((dd) (Object) var4).a(param1);
                          ((dd) (Object) var4).field_m = (param3 & -1024) + 1024;
                          if (((dd) (Object) var4).field_m <= 16384) {
                            break L4;
                          } else {
                            ((dd) (Object) var4).field_m = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((dd) (Object) var4).b(((dd) (Object) var4).field_m);
                          if (field_e <= 0) {
                            break L5;
                          } else {
                            if (field_j != null) {
                              break L5;
                            } else {
                              field_j = new jr();
                              field_j.field_c = param0;
                              wk discarded$2 = param0.a(field_e, (Runnable) (Object) field_j, 0);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_j == null) {
                            break L6;
                          } else {
                            if (field_j.field_d[param2] == null) {
                              field_j.field_d[param2] = (dd) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (vr) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new dd();
                    }
                    return (dd) (Object) stackIn_21_0;
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

    final synchronized void c() {
        try {
            ((dd) this).field_f = true;
            try {
                ((dd) this).f();
            } catch (Exception exception) {
                ((dd) this).h();
                ((dd) this).field_n = gk.a(102) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void b(sn param0) {
        param0.field_p = false;
        if (param0.field_n != null) {
            param0.field_n.field_n = 0;
        }
        sn var1 = param0.c();
        while (var1 != null) {
            dd.b(var1);
            var1 = param0.a();
        }
    }

    public static void a() {
        field_j = null;
    }

    final synchronized void d() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_j == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_j.field_a = true;
                  L2: while (true) {
                    if (!field_j.field_b) {
                      field_j = null;
                      break L0;
                    } else {
                      um.a(true, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_j.field_d[var2] != this) {
                    break L3;
                  } else {
                    field_j.field_d[var2] = null;
                    break L3;
                  }
                }
                if (field_j.field_d[var2] != null) {
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
        ((dd) this).h();
        ((dd) this).field_i = null;
        ((dd) this).field_g = true;
    }

    dd() {
        ((dd) this).field_g = false;
        ((dd) this).field_o = 32;
        ((dd) this).field_k = gk.a(47);
        ((dd) this).field_b = 0;
        ((dd) this).field_a = new sn[8];
        ((dd) this).field_q = new sn[8];
        ((dd) this).field_f = true;
        ((dd) this).field_s = 0;
        ((dd) this).field_p = 0L;
        ((dd) this).field_n = 0L;
        ((dd) this).field_t = 0;
        ((dd) this).field_c = 0;
    }
}
