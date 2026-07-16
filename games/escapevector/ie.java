/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ie {
    private static int field_g;
    int[] field_f;
    private long field_s;
    private static ge field_j;
    static boolean field_o;
    private int field_a;
    static int field_q;
    private boolean field_i;
    private wg field_u;
    private int field_r;
    private wg[] field_c;
    private int field_b;
    private long field_t;
    private int field_h;
    private int field_d;
    private long field_n;
    private int field_p;
    private boolean field_e;
    private wg[] field_l;
    private int field_k;
    private int field_m;

    void f() {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        wg var7 = null;
        int var8_int = 0;
        wg[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        wg var11 = null;
        nh var12 = null;
        int var13 = 0;
        wg var14 = null;
        wg var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_o) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          qg.a(param0, 0, var3);
          ((ie) this).field_b = ((ie) this).field_b - param1;
          if (((ie) this).field_u == null) {
            break L1;
          } else {
            if (((ie) this).field_b > 0) {
              break L1;
            } else {
              ((ie) this).field_b = ((ie) this).field_b + (field_q >> 4);
              ie.a(((ie) this).field_u);
              this.a(((ie) this).field_u, ((ie) this).field_u.d());
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
                            var11 = ((ie) this).field_c[var7_int];
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
                                      var11 = var11.field_h;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_i = true;
                                  var13 = var11.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_g = var12.field_g + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((ie) this).field_a) {
                                  L10: {
                                    var14 = var11.c();
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
                                    var15 = var11.field_h;
                                    var11.field_h = null;
                                    if (var10 != null) {
                                      ((wg) var10).field_h = var15;
                                      break L12;
                                    } else {
                                      ((ie) this).field_c[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((ie) this).field_l[var7_int] = (wg) var10;
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
                    var7 = ((ie) this).field_c[var6];
                    var8 = ((ie) this).field_c;
                    var9 = var6;
                    ((ie) this).field_l[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_h;
                        var7.field_h = null;
                        var7 = (wg) var10;
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
          if (((ie) this).field_b >= 0) {
            break L16;
          } else {
            ((ie) this).field_b = 0;
            break L16;
          }
        }
        L17: {
          if (((ie) this).field_u == null) {
            break L17;
          } else {
            ((ie) this).field_u.b(param0, 0, param1);
            break L17;
          }
        }
        ((ie) this).field_s = td.b(128);
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
                field_q = param0;
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
              field_o = stackIn_7_0 != 0;
              field_g = param2;
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
            Throwable decompiledCaughtException = null;
            if (!((ie) this).field_i) {
              var1 = td.b(128);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((ie) this).field_s + 6000L) {
                      break L1;
                    } else {
                      ((ie) this).field_s = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((ie) this).field_s + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((ie) this).field_s = ((ie) this).field_s + (long)(256000 / field_q);
                      var1 = td.b(128);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((ie) this).field_s = var1;
                  break L3;
                }
              }
              if (((ie) this).field_f != null) {
                try {
                  L4: {
                    L5: {
                      if (((ie) this).field_n == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((ie) this).field_n) {
                          ((ie) this).b(((ie) this).field_d);
                          ((ie) this).field_n = 0L;
                          ((ie) this).field_e = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((ie) this).a();
                      if (((ie) this).field_k - var3_int <= ((ie) this).field_r) {
                        break L6;
                      } else {
                        ((ie) this).field_r = ((ie) this).field_k - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((ie) this).field_p + ((ie) this).field_m;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((ie) this).field_d) {
                        break L8;
                      } else {
                        L9: {
                          ((ie) this).field_d = ((ie) this).field_d + 1024;
                          if (((ie) this).field_d <= 16384) {
                            break L9;
                          } else {
                            ((ie) this).field_d = 16384;
                            break L9;
                          }
                        }
                        ((ie) this).f();
                        ((ie) this).b(((ie) this).field_d);
                        var3_int = 0;
                        ((ie) this).field_e = true;
                        if (var4 + 256 <= ((ie) this).field_d) {
                          break L8;
                        } else {
                          var4 = ((ie) this).field_d - 256;
                          ((ie) this).field_m = var4 - ((ie) this).field_p;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((ie) this).field_t) {
                            break L11;
                          } else {
                            L12: {
                              if (((ie) this).field_e) {
                                ((ie) this).field_e = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((ie) this).field_r != 0) {
                                    break L13;
                                  } else {
                                    if (((ie) this).field_h != 0) {
                                      break L13;
                                    } else {
                                      ((ie) this).f();
                                      ((ie) this).field_n = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((ie) this).field_m = Math.min(((ie) this).field_h, ((ie) this).field_r);
                                ((ie) this).field_h = ((ie) this).field_r;
                                break L12;
                              }
                            }
                            ((ie) this).field_r = 0;
                            ((ie) this).field_t = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((ie) this).field_k = var3_int;
                        break L4;
                      } else {
                        this.a(((ie) this).field_f, 256);
                        ((ie) this).h();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((ie) this).f();
                    ((ie) this).field_n = var1 + 2000L;
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

    private final void a(wg param0, int param1) {
        int var3 = param1 >> 5;
        wg var4 = ((ie) this).field_l[var3];
        if (var4 == null) {
            ((ie) this).field_c[var3] = param0;
        } else {
            var4.field_h = param0;
        }
        ((ie) this).field_l[var3] = param0;
        param0.field_j = param1;
    }

    public static void e() {
        field_j = null;
    }

    void g() throws Exception {
    }

    private final static void a(wg param0) {
        param0.field_i = false;
        if (param0.field_g != null) {
            param0.field_g.field_g = 0;
        }
        wg var1 = param0.c();
        while (var1 != null) {
            ie.a(var1);
            var1 = param0.b();
        }
    }

    int a() throws Exception {
        return ((ie) this).field_d;
    }

    final synchronized void b(wg param0) {
        ((ie) this).field_u = param0;
    }

    void b(int param0) throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void h() throws Exception {
    }

    private final void a(int param0) {
        ((ie) this).field_b = ((ie) this).field_b - param0;
        if (((ie) this).field_b < 0) {
            ((ie) this).field_b = 0;
        }
        if (((ie) this).field_u != null) {
            ((ie) this).field_u.d(param0);
            return;
        }
    }

    final synchronized void b() {
        try {
            ((ie) this).field_e = true;
            try {
                ((ie) this).g();
            } catch (Exception exception) {
                ((ie) this).f();
                ((ie) this).field_n = td.b(128) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ie a(lk param0, java.awt.Component param1, int param2, int param3) {
        try {
            vm var4 = null;
            Throwable var4_ref = null;
            vm var5 = null;
            vm stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            vm stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            vm stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            vm stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            vm stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            vm stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            vm stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            vm stackOut_20_0 = null;
            if (field_q != 0) {
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
                          var5 = new vm();
                          var4 = var5;
                          stackOut_8_0 = (vm) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_o) {
                            stackOut_10_0 = (vm) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (vm) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((ie) (Object) stackIn_11_0).field_f = new int[stackIn_11_1 * stackIn_11_2];
                          ((ie) (Object) var4).field_p = param3;
                          ((ie) (Object) var4).a(param1);
                          ((ie) (Object) var4).field_d = (param3 & -1024) + 1024;
                          if (((ie) (Object) var4).field_d <= 16384) {
                            break L4;
                          } else {
                            ((ie) (Object) var4).field_d = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((ie) (Object) var4).b(((ie) (Object) var4).field_d);
                          if (field_g <= 0) {
                            break L5;
                          } else {
                            if (field_j != null) {
                              break L5;
                            } else {
                              field_j = new ge();
                              field_j.field_e = param0;
                              la discarded$2 = param0.a(true, field_g, (Runnable) (Object) field_j);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_j == null) {
                            break L6;
                          } else {
                            if (field_j.field_f[param2] == null) {
                              field_j.field_f[param2] = (ie) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (vm) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new ie();
                    }
                    return (ie) (Object) stackIn_21_0;
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
                  field_j.field_c = true;
                  L2: while (true) {
                    if (!field_j.field_g) {
                      field_j = null;
                      break L0;
                    } else {
                      en.a((byte) -46, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_j.field_f[var2] != this) {
                    break L3;
                  } else {
                    field_j.field_f[var2] = null;
                    break L3;
                  }
                }
                if (field_j.field_f[var2] != null) {
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
        ((ie) this).f();
        ((ie) this).field_f = null;
        ((ie) this).field_i = true;
    }

    ie() {
        ((ie) this).field_a = 32;
        ((ie) this).field_i = false;
        ((ie) this).field_s = td.b(128);
        ((ie) this).field_b = 0;
        ((ie) this).field_h = 0;
        ((ie) this).field_t = 0L;
        ((ie) this).field_c = new wg[8];
        ((ie) this).field_r = 0;
        ((ie) this).field_n = 0L;
        ((ie) this).field_l = new wg[8];
        ((ie) this).field_e = true;
        ((ie) this).field_k = 0;
    }
}
