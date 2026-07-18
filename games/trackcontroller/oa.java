/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oa {
    private boolean field_d;
    static int field_h;
    static boolean field_k;
    private static int field_o;
    int[] field_s;
    private wh field_i;
    private static hj field_q;
    private int field_n;
    private long field_u;
    private long field_c;
    private int field_p;
    private int field_a;
    private boolean field_g;
    private wh[] field_l;
    private wh[] field_j;
    private int field_e;
    private int field_b;
    private int field_m;
    private int field_f;
    private int field_t;
    private long field_r;

    final synchronized void b() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((oa) this).field_d) {
              var1 = qg.a(false);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((oa) this).field_u + 6000L) {
                      break L1;
                    } else {
                      ((oa) this).field_u = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((oa) this).field_u + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((oa) this).field_u = ((oa) this).field_u + (long)(256000 / field_h);
                      var1 = qg.a(false);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((oa) this).field_u = var1;
                  break L3;
                }
              }
              if (((oa) this).field_s != null) {
                try {
                  L4: {
                    L5: {
                      if (((oa) this).field_c == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((oa) this).field_c) {
                          ((oa) this).b(((oa) this).field_b);
                          ((oa) this).field_c = 0L;
                          ((oa) this).field_g = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((oa) this).h();
                      if (((oa) this).field_p - var3_int <= ((oa) this).field_t) {
                        break L6;
                      } else {
                        ((oa) this).field_t = ((oa) this).field_p - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((oa) this).field_f + ((oa) this).field_e;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((oa) this).field_b) {
                        break L8;
                      } else {
                        L9: {
                          ((oa) this).field_b = ((oa) this).field_b + 1024;
                          if (((oa) this).field_b <= 16384) {
                            break L9;
                          } else {
                            ((oa) this).field_b = 16384;
                            break L9;
                          }
                        }
                        ((oa) this).g();
                        ((oa) this).b(((oa) this).field_b);
                        var3_int = 0;
                        ((oa) this).field_g = true;
                        if (var4 + 256 <= ((oa) this).field_b) {
                          break L8;
                        } else {
                          var4 = ((oa) this).field_b - 256;
                          ((oa) this).field_e = var4 - ((oa) this).field_f;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((oa) this).field_r) {
                            break L11;
                          } else {
                            L12: {
                              if (((oa) this).field_g) {
                                ((oa) this).field_g = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((oa) this).field_t != 0) {
                                    break L13;
                                  } else {
                                    if (((oa) this).field_a != 0) {
                                      break L13;
                                    } else {
                                      ((oa) this).g();
                                      ((oa) this).field_c = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((oa) this).field_e = Math.min(((oa) this).field_a, ((oa) this).field_t);
                                ((oa) this).field_a = ((oa) this).field_t;
                                break L12;
                              }
                            }
                            ((oa) this).field_t = 0;
                            ((oa) this).field_r = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((oa) this).field_p = var3_int;
                        break L4;
                      } else {
                        this.a(((oa) this).field_s, 256);
                        ((oa) this).a();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((oa) this).g();
                    ((oa) this).field_c = var1 + 2000L;
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

    private final static void b(wh param0) {
        param0.field_k = false;
        if (param0.field_i != null) {
            param0.field_i.field_i = 0;
        }
        wh var1 = param0.b();
        while (var1 != null) {
            oa.b(var1);
            var1 = param0.a();
        }
    }

    void d() throws Exception {
    }

    public static void e() {
        field_q = null;
    }

    private final void a(int param0) {
        ((oa) this).field_m = ((oa) this).field_m - param0;
        if (((oa) this).field_m < 0) {
            ((oa) this).field_m = 0;
        }
        if (((oa) this).field_i != null) {
            ((oa) this).field_i.d(param0);
            return;
        }
    }

    private final void a(wh param0, int param1) {
        int var3 = param1 >> 5;
        wh var4 = ((oa) this).field_l[var3];
        if (var4 == null) {
            ((oa) this).field_j[var3] = param0;
        } else {
            var4.field_l = param0;
        }
        ((oa) this).field_l[var3] = param0;
        param0.field_j = param1;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void g() {
    }

    final synchronized void a(wh param0) {
        ((oa) this).field_i = param0;
    }

    int h() throws Exception {
        return ((oa) this).field_b;
    }

    void a() throws Exception {
    }

    final synchronized void f() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_q == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_q.field_b = true;
                  L2: while (true) {
                    if (!field_q.field_e) {
                      field_q = null;
                      break L0;
                    } else {
                      wl.a(50L, false);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_q.field_a[var2] != this) {
                    break L3;
                  } else {
                    field_q.field_a[var2] = null;
                    break L3;
                  }
                }
                if (field_q.field_a[var2] != null) {
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
        ((oa) this).g();
        ((oa) this).field_s = null;
        ((oa) this).field_d = true;
    }

    final synchronized void c() {
        try {
            ((oa) this).field_g = true;
            try {
                ((oa) this).d();
            } catch (Exception exception) {
                ((oa) this).g();
                ((oa) this).field_c = qg.a(false) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void b(int param0) throws Exception {
    }

    final static oa a(uf param0, java.awt.Component param1, int param2, int param3) {
        try {
            pk var4 = null;
            Throwable var4_ref = null;
            pk var5 = null;
            pk stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            pk stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            pk stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            pk stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            pk stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            pk stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            pk stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            pk stackOut_20_0 = null;
            if (field_h != 0) {
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
                          var5 = new pk();
                          var4 = var5;
                          stackOut_8_0 = (pk) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_k) {
                            stackOut_10_0 = (pk) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (pk) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((oa) (Object) stackIn_11_0).field_s = new int[stackIn_11_1 * stackIn_11_2];
                          ((oa) (Object) var4).field_f = param3;
                          ((oa) (Object) var4).a(param1);
                          ((oa) (Object) var4).field_b = (param3 & -1024) + 1024;
                          if (((oa) (Object) var4).field_b <= 16384) {
                            break L4;
                          } else {
                            ((oa) (Object) var4).field_b = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((oa) (Object) var4).b(((oa) (Object) var4).field_b);
                          if (field_o <= 0) {
                            break L5;
                          } else {
                            if (field_q != null) {
                              break L5;
                            } else {
                              field_q = new hj();
                              field_q.field_d = param0;
                              ce discarded$2 = param0.a(field_o, (Runnable) (Object) field_q, 43);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_q == null) {
                            break L6;
                          } else {
                            if (field_q.field_a[param2] == null) {
                              field_q.field_a[param2] = (oa) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (pk) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new oa();
                    }
                    return (oa) (Object) stackIn_21_0;
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

    final static void a(int param0, boolean param1, int param2) {
        field_h = 22050;
        field_k = true;
        field_o = 10;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        wh var7 = null;
        int var8_int = 0;
        wh[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        wh var11 = null;
        lk var12 = null;
        int var13 = 0;
        wh var14 = null;
        wh var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_k) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          pd.a(param0, 0, var3);
          ((oa) this).field_m = ((oa) this).field_m - param1;
          if (((oa) this).field_i == null) {
            break L1;
          } else {
            if (((oa) this).field_m > 0) {
              break L1;
            } else {
              ((oa) this).field_m = ((oa) this).field_m + (field_h >> 4);
              oa.b(((oa) this).field_i);
              this.a(((oa) this).field_i, ((oa) this).field_i.d());
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
                            var11 = ((oa) this).field_j[var7_int];
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
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_l;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_k = true;
                                  var13 = var11.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_i = var12.field_i + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((oa) this).field_n) {
                                  L10: {
                                    var14 = var11.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_j;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.d() >> 8);
                                          var14 = var11.a();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_l;
                                    var11.field_l = null;
                                    if (var10 != null) {
                                      ((wh) var10).field_l = var15;
                                      break L12;
                                    } else {
                                      ((oa) this).field_j[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((oa) this).field_l[var7_int] = (wh) var10;
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
                    var7 = ((oa) this).field_j[var6];
                    var8 = ((oa) this).field_j;
                    var9 = var6;
                    ((oa) this).field_l[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_l;
                        var7.field_l = null;
                        var7 = (wh) var10;
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
          if (((oa) this).field_m >= 0) {
            break L16;
          } else {
            ((oa) this).field_m = 0;
            break L16;
          }
        }
        L17: {
          if (((oa) this).field_i == null) {
            break L17;
          } else {
            ((oa) this).field_i.a(param0, 0, param1);
            break L17;
          }
        }
        ((oa) this).field_u = qg.a(false);
    }

    oa() {
        ((oa) this).field_d = false;
        ((oa) this).field_n = 32;
        ((oa) this).field_u = qg.a(false);
        ((oa) this).field_p = 0;
        ((oa) this).field_c = 0L;
        ((oa) this).field_m = 0;
        ((oa) this).field_l = new wh[8];
        ((oa) this).field_j = new wh[8];
        ((oa) this).field_g = true;
        ((oa) this).field_t = 0;
        ((oa) this).field_r = 0L;
        ((oa) this).field_a = 0;
    }
}
