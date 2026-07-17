/*
 * Decompiled by CFR-JS 0.4.0.
 */
class df {
    private static ck field_q;
    private int field_b;
    static int field_n;
    private c field_i;
    private long field_h;
    private static int field_d;
    static boolean field_l;
    private boolean field_s;
    int[] field_o;
    private int field_c;
    private long field_k;
    private int field_g;
    private boolean field_t;
    private int field_j;
    private c[] field_p;
    private c[] field_a;
    private int field_m;
    private int field_r;
    private int field_e;
    private int field_f;
    private long field_u;

    void a(java.awt.Component param0) throws Exception {
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
                field_n = param0;
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
              field_l = stackIn_7_0 != 0;
              field_d = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void a(int param0) throws Exception {
    }

    final synchronized void a(c param0) {
        ((df) this).field_i = param0;
    }

    int c() throws Exception {
        return ((df) this).field_m;
    }

    private final void b(int param0) {
        ((df) this).field_e = ((df) this).field_e - 256;
        if (((df) this).field_e < 0) {
            ((df) this).field_e = 0;
        }
        if (((df) this).field_i != null) {
            ((df) this).field_i.a(256);
            return;
        }
    }

    private final void a(c param0, int param1) {
        int var3 = param1 >> 5;
        c var4 = ((df) this).field_a[var3];
        if (var4 == null) {
            ((df) this).field_p[var3] = param0;
        } else {
            var4.field_h = param0;
        }
        ((df) this).field_a[var3] = param0;
        param0.field_g = param1;
    }

    final synchronized void b() {
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
                  field_q.field_a = true;
                  L2: while (true) {
                    if (!field_q.field_c) {
                      field_q = null;
                      break L0;
                    } else {
                      uc.a(-91, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_q.field_e[var2] != this) {
                    break L3;
                  } else {
                    field_q.field_e[var2] = null;
                    break L3;
                  }
                }
                if (field_q.field_e[var2] != null) {
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
        ((df) this).f();
        ((df) this).field_o = null;
        ((df) this).field_s = true;
    }

    void e() throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        c var7 = null;
        int var8_int = 0;
        c[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        c var11 = null;
        gk var12 = null;
        int var13 = 0;
        c var14 = null;
        c var15 = null;
        int var15_int = 0;
        L0: {
          var3 = 256;
          if (!field_l) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          ug.a(param0, 0, var3);
          ((df) this).field_e = ((df) this).field_e - 256;
          if (((df) this).field_i == null) {
            break L1;
          } else {
            if (((df) this).field_e > 0) {
              break L1;
            } else {
              ((df) this).field_e = ((df) this).field_e + (field_n >> 4);
              df.b(((df) this).field_i);
              this.a(((df) this).field_i, ((df) this).field_i.d());
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
                            var11 = ((df) this).field_p[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_f;
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
                                  var11.field_i = true;
                                  var13 = var11.b();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_f = var12.field_f + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((df) this).field_b) {
                                  L10: {
                                    var14 = var11.c();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_g;
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
                                    var15 = var11.field_h;
                                    var11.field_h = null;
                                    if (var10 != null) {
                                      ((c) var10).field_h = var15;
                                      break L12;
                                    } else {
                                      ((df) this).field_p[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((df) this).field_a[var7_int] = (c) var10;
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
                    var7 = ((df) this).field_p[var6];
                    var8 = ((df) this).field_p;
                    var9 = var6;
                    ((df) this).field_a[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_h;
                        var7.field_h = null;
                        var7 = (c) var10;
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
          if (((df) this).field_e >= 0) {
            break L16;
          } else {
            ((df) this).field_e = 0;
            break L16;
          }
        }
        L17: {
          if (((df) this).field_i == null) {
            break L17;
          } else {
            ((df) this).field_i.a(param0, 0, 256);
            break L17;
          }
        }
        ((df) this).field_h = dd.b(101);
    }

    public static void a() {
        field_q = null;
    }

    final synchronized void d() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((df) this).field_s) {
              var1 = dd.b(127);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((df) this).field_h + 6000L) {
                      break L1;
                    } else {
                      ((df) this).field_h = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((df) this).field_h + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((df) this).field_h = ((df) this).field_h + (long)(256000 / field_n);
                      var1 = dd.b(122);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((df) this).field_h = var1;
                  break L3;
                }
              }
              if (((df) this).field_o != null) {
                try {
                  L4: {
                    L5: {
                      if (((df) this).field_u == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((df) this).field_u) {
                          ((df) this).a(((df) this).field_m);
                          ((df) this).field_u = 0L;
                          ((df) this).field_t = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((df) this).c();
                      if (((df) this).field_c - var3_int <= ((df) this).field_f) {
                        break L6;
                      } else {
                        ((df) this).field_f = ((df) this).field_c - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((df) this).field_r + ((df) this).field_g;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((df) this).field_m) {
                        break L8;
                      } else {
                        L9: {
                          ((df) this).field_m = ((df) this).field_m + 1024;
                          if (((df) this).field_m <= 16384) {
                            break L9;
                          } else {
                            ((df) this).field_m = 16384;
                            break L9;
                          }
                        }
                        ((df) this).f();
                        ((df) this).a(((df) this).field_m);
                        var3_int = 0;
                        ((df) this).field_t = true;
                        if (var4 + 256 <= ((df) this).field_m) {
                          break L8;
                        } else {
                          var4 = ((df) this).field_m - 256;
                          ((df) this).field_g = var4 - ((df) this).field_r;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((df) this).field_k) {
                            break L11;
                          } else {
                            L12: {
                              if (((df) this).field_t) {
                                ((df) this).field_t = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((df) this).field_f != 0) {
                                    break L13;
                                  } else {
                                    if (((df) this).field_j != 0) {
                                      break L13;
                                    } else {
                                      ((df) this).f();
                                      ((df) this).field_u = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((df) this).field_g = Math.min(((df) this).field_j, ((df) this).field_f);
                                ((df) this).field_j = ((df) this).field_f;
                                break L12;
                              }
                            }
                            ((df) this).field_f = 0;
                            ((df) this).field_k = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((df) this).field_c = var3_int;
                        break L4;
                      } else {
                        this.a(((df) this).field_o, 256);
                        ((df) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((df) this).f();
                    ((df) this).field_u = var1 + 2000L;
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

    final static df a(ka param0, java.awt.Component param1, int param2, int param3) {
        try {
            al var4 = null;
            Throwable var4_ref = null;
            al var5 = null;
            al stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            al stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            al stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            al stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            al stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            al stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            al stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            al stackOut_20_0 = null;
            if (field_n != 0) {
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
                          var5 = new al();
                          var4 = var5;
                          stackOut_8_0 = (al) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_l) {
                            stackOut_10_0 = (al) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (al) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((df) (Object) stackIn_11_0).field_o = new int[stackIn_11_1 * stackIn_11_2];
                          ((df) (Object) var4).field_r = param3;
                          ((df) (Object) var4).a(param1);
                          ((df) (Object) var4).field_m = (param3 & -1024) + 1024;
                          if (((df) (Object) var4).field_m <= 16384) {
                            break L4;
                          } else {
                            ((df) (Object) var4).field_m = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((df) (Object) var4).a(((df) (Object) var4).field_m);
                          if (field_d <= 0) {
                            break L5;
                          } else {
                            if (field_q != null) {
                              break L5;
                            } else {
                              field_q = new ck();
                              field_q.field_d = param0;
                              bk discarded$2 = param0.a(field_d, 39, (Runnable) (Object) field_q);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_q == null) {
                            break L6;
                          } else {
                            if (field_q.field_e[param2] == null) {
                              field_q.field_e[param2] = (df) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (al) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new df();
                    }
                    return (df) (Object) stackIn_21_0;
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

    void f() {
    }

    private final static void b(c param0) {
        param0.field_i = false;
        if (param0.field_f != null) {
            param0.field_f.field_f = 0;
        }
        c var1 = param0.c();
        while (var1 != null) {
            df.b(var1);
            var1 = param0.a();
        }
    }

    df() {
        ((df) this).field_b = 32;
        ((df) this).field_s = false;
        ((df) this).field_h = dd.b(97);
        ((df) this).field_c = 0;
        ((df) this).field_k = 0L;
        ((df) this).field_j = 0;
        ((df) this).field_a = new c[8];
        ((df) this).field_u = 0L;
        ((df) this).field_e = 0;
        ((df) this).field_f = 0;
        ((df) this).field_t = true;
        ((df) this).field_p = new c[8];
    }
}
