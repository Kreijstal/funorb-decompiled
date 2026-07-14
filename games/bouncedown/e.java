/*
 * Decompiled by CFR-JS 0.4.0.
 */
class e {
    private static int field_l;
    private boolean field_i;
    static boolean field_s;
    private wf field_t;
    private int field_e;
    private long field_p;
    int[] field_m;
    private static dd field_k;
    static int field_r;
    private int field_b;
    private int field_g;
    private int field_a;
    private boolean field_q;
    private long field_h;
    private wf[] field_c;
    private int field_d;
    private int field_u;
    private int field_f;
    private wf[] field_o;
    private int field_n;
    private long field_j;

    final synchronized void d() {
        try {
            ((e) this).field_q = true;
            try {
                ((e) this).c();
            } catch (Exception exception) {
                ((e) this).g();
                ((e) this).field_h = fa.a(121) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h() {
        field_k = null;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        wf var7 = null;
        wf var7_ref = null;
        int var8_int = 0;
        wf[] var8 = null;
        int var9 = 0;
        wf var10 = null;
        wf var11 = null;
        wf var11_ref = null;
        ic var12 = null;
        int var13 = 0;
        wf var14 = null;
        wf var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_s) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          cb.a(param0, 0, var3);
          ((e) this).field_b = ((e) this).field_b - param1;
          if (((e) this).field_t == null) {
            break L1;
          } else {
            if (((e) this).field_b > 0) {
              break L1;
            } else {
              ((e) this).field_b = ((e) this).field_b + (field_r >> 4);
              e.b(((e) this).field_t);
              this.a(((e) this).field_t, ((e) this).field_t.a());
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
                            var11 = ((e) this).field_c[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_j;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_g <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11_ref = var11.field_h;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11_ref.field_i = true;
                                  var13 = var11_ref.b();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_g = var12.field_g + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((e) this).field_e) {
                                  L10: {
                                    var14 = var11_ref.d();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_g;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.a() >> 8);
                                          var14 = var11_ref.c();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11_ref.field_h;
                                    var11_ref.field_h = null;
                                    if (var10 != null) {
                                      var10.field_h = var15;
                                      break L12;
                                    } else {
                                      ((e) this).field_c[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((e) this).field_o[var7_int] = var10;
                                      break L13;
                                    }
                                  }
                                  var11_ref = var15;
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
                    var7 = ((e) this).field_c[var6];
                    var8 = ((e) this).field_c;
                    var9 = var6;
                    ((e) this).field_o[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_h;
                        var7.field_h = null;
                        var7_ref = var10;
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
          if (((e) this).field_b >= 0) {
            break L16;
          } else {
            ((e) this).field_b = 0;
            break L16;
          }
        }
        L17: {
          if (((e) this).field_t == null) {
            break L17;
          } else {
            ((e) this).field_t.a(param0, 0, param1);
            break L17;
          }
        }
        ((e) this).field_p = fa.a(-49);
    }

    int b() throws Exception {
        return ((e) this).field_d;
    }

    void b(int param0) throws Exception {
    }

    void c() throws Exception {
    }

    final synchronized void a() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_k == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_k.field_c = true;
                  L2: while (true) {
                    if (!field_k.field_b) {
                      field_k = null;
                      break L0;
                    } else {
                      wh.a(50L, 19406);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_k.field_a[var2] != this) {
                    break L3;
                  } else {
                    field_k.field_a[var2] = null;
                    break L3;
                  }
                }
                if (field_k.field_a[var2] != null) {
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
        ((e) this).g();
        ((e) this).field_m = null;
        ((e) this).field_i = true;
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
                field_r = param0;
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
              field_s = stackIn_7_0 != 0;
              field_l = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    private final static void b(wf param0) {
        param0.field_i = false;
        if (param0.field_j != null) {
            param0.field_j.field_g = 0;
        }
        wf var1 = param0.d();
        while (var1 != null) {
            e.b(var1);
            var1 = param0.c();
        }
    }

    final synchronized void e() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((e) this).field_i) {
              var1 = fa.a(-114);
              try {
                L0: {
                  if (var1 <= ((e) this).field_p + 6000L) {
                    break L0;
                  } else {
                    ((e) this).field_p = var1 - 6000L;
                    break L0;
                  }
                }
                L1: while (true) {
                  if (var1 <= ((e) this).field_p + 5000L) {
                    break L1;
                  } else {
                    this.a(256);
                    ((e) this).field_p = ((e) this).field_p + (long)(256000 / field_r);
                    var1 = fa.a(-87);
                    continue L1;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                ((e) this).field_p = var1;
              }
              if (((e) this).field_m != null) {
                try {
                  L2: {
                    if (((e) this).field_h == 0L) {
                      break L2;
                    } else {
                      if (var1 >= ((e) this).field_h) {
                        ((e) this).b(((e) this).field_d);
                        ((e) this).field_h = 0L;
                        ((e) this).field_q = true;
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                  L3: {
                    var3_int = ((e) this).b();
                    if (((e) this).field_a - var3_int <= ((e) this).field_u) {
                      break L3;
                    } else {
                      ((e) this).field_u = ((e) this).field_a - var3_int;
                      break L3;
                    }
                  }
                  L4: {
                    var4 = ((e) this).field_g + ((e) this).field_n;
                    if (var4 + 256 <= 16384) {
                      break L4;
                    } else {
                      var4 = 16128;
                      break L4;
                    }
                  }
                  L5: {
                    if (var4 + 256 <= ((e) this).field_d) {
                      break L5;
                    } else {
                      L6: {
                        ((e) this).field_d = ((e) this).field_d + 1024;
                        if (((e) this).field_d <= 16384) {
                          break L6;
                        } else {
                          ((e) this).field_d = 16384;
                          break L6;
                        }
                      }
                      ((e) this).g();
                      ((e) this).b(((e) this).field_d);
                      var3_int = 0;
                      ((e) this).field_q = true;
                      if (var4 + 256 <= ((e) this).field_d) {
                        break L5;
                      } else {
                        var4 = ((e) this).field_d - 256;
                        ((e) this).field_n = var4 - ((e) this).field_g;
                        break L5;
                      }
                    }
                  }
                  L7: while (true) {
                    if (var3_int >= var4) {
                      L8: {
                        if (var1 <= ((e) this).field_j) {
                          break L8;
                        } else {
                          L9: {
                            if (((e) this).field_q) {
                              ((e) this).field_q = false;
                              break L9;
                            } else {
                              L10: {
                                if (((e) this).field_u != 0) {
                                  break L10;
                                } else {
                                  if (((e) this).field_f != 0) {
                                    break L10;
                                  } else {
                                    ((e) this).g();
                                    ((e) this).field_h = var1 + 2000L;
                                    return;
                                  }
                                }
                              }
                              ((e) this).field_n = Math.min(((e) this).field_f, ((e) this).field_u);
                              ((e) this).field_f = ((e) this).field_u;
                              break L9;
                            }
                          }
                          ((e) this).field_u = 0;
                          ((e) this).field_j = var1 + 2000L;
                          break L8;
                        }
                      }
                      ((e) this).field_a = var3_int;
                    } else {
                      this.a(((e) this).field_m, 256);
                      ((e) this).f();
                      var3_int += 256;
                      continue L7;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((e) this).g();
                  ((e) this).field_h = var1 + 2000L;
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

    final static e a(si param0, java.awt.Component param1, int param2, int param3) {
        try {
            ia var4 = null;
            Throwable var4_ref = null;
            ia var5 = null;
            ia stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ia stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ia stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ia stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ia stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ia stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ia stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ia stackOut_20_0 = null;
            if (field_r != 0) {
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
                        var5 = new ia();
                        var4 = var5;
                        stackOut_8_0 = (ia) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_s) {
                          stackOut_10_0 = (ia) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (ia) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((e) (Object) stackIn_11_0).field_m = new int[stackIn_11_1 * stackIn_11_2];
                        ((e) (Object) var4).field_g = param3;
                        ((e) (Object) var4).a(param1);
                        ((e) (Object) var4).field_d = (param3 & -1024) + 1024;
                        if (((e) (Object) var4).field_d <= 16384) {
                          break L3;
                        } else {
                          ((e) (Object) var4).field_d = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((e) (Object) var4).b(((e) (Object) var4).field_d);
                        if (field_l <= 0) {
                          break L4;
                        } else {
                          if (field_k != null) {
                            break L4;
                          } else {
                            field_k = new dd();
                            field_k.field_d = param0;
                            mk discarded$2 = param0.a(field_l, (byte) 126, (Runnable) (Object) field_k);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_k == null) {
                          break L5;
                        } else {
                          if (field_k.field_a[param2] == null) {
                            field_k.field_a[param2] = (e) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (ia) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new e();
                    }
                    return (e) (Object) stackIn_21_0;
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

    private final void a(int param0) {
        ((e) this).field_b = ((e) this).field_b - param0;
        if (((e) this).field_b < 0) {
            ((e) this).field_b = 0;
        }
        if (((e) this).field_t != null) {
            ((e) this).field_t.a(param0);
            return;
        }
    }

    void g() {
    }

    void f() throws Exception {
    }

    private final void a(wf param0, int param1) {
        int var3 = param1 >> 5;
        wf var4 = ((e) this).field_o[var3];
        if (var4 == null) {
            ((e) this).field_c[var3] = param0;
        } else {
            var4.field_h = param0;
        }
        ((e) this).field_o[var3] = param0;
        param0.field_g = param1;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void a(wf param0) {
        ((e) this).field_t = param0;
    }

    e() {
        ((e) this).field_i = false;
        ((e) this).field_e = 32;
        ((e) this).field_p = fa.a(-78);
        ((e) this).field_q = true;
        ((e) this).field_b = 0;
        ((e) this).field_c = new wf[8];
        ((e) this).field_a = 0;
        ((e) this).field_f = 0;
        ((e) this).field_o = new wf[8];
        ((e) this).field_j = 0L;
        ((e) this).field_h = 0L;
        ((e) this).field_u = 0;
    }
}
