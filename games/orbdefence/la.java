/*
 * Decompiled by CFR-JS 0.4.0.
 */
class la {
    private static oa field_u;
    int[] field_r;
    static int field_c;
    private static int field_l;
    private di field_n;
    static boolean field_g;
    private boolean field_j;
    private long field_t;
    private int field_b;
    private long field_o;
    private di[] field_e;
    private int field_q;
    private int field_i;
    private int field_h;
    private int field_d;
    private int field_a;
    private boolean field_f;
    private di[] field_s;
    private int field_k;
    private long field_p;
    private int field_m;

    final synchronized void a() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((la) this).field_j) {
              var1 = ji.b(124);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((la) this).field_t + 6000L) {
                      break L1;
                    } else {
                      ((la) this).field_t = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((la) this).field_t + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((la) this).field_t = ((la) this).field_t + (long)(256000 / field_c);
                      var1 = ji.b(-117);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((la) this).field_t = var1;
                  break L3;
                }
              }
              if (((la) this).field_r != null) {
                try {
                  L4: {
                    L5: {
                      if (((la) this).field_p == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((la) this).field_p) {
                          ((la) this).a(((la) this).field_a);
                          ((la) this).field_p = 0L;
                          ((la) this).field_f = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((la) this).f();
                      if (((la) this).field_i - var3_int <= ((la) this).field_q) {
                        break L6;
                      } else {
                        ((la) this).field_q = ((la) this).field_i - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((la) this).field_d + ((la) this).field_k;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((la) this).field_a) {
                        break L8;
                      } else {
                        L9: {
                          ((la) this).field_a = ((la) this).field_a + 1024;
                          if (((la) this).field_a <= 16384) {
                            break L9;
                          } else {
                            ((la) this).field_a = 16384;
                            break L9;
                          }
                        }
                        ((la) this).b();
                        ((la) this).a(((la) this).field_a);
                        var3_int = 0;
                        ((la) this).field_f = true;
                        if (var4 + 256 <= ((la) this).field_a) {
                          break L8;
                        } else {
                          var4 = ((la) this).field_a - 256;
                          ((la) this).field_k = var4 - ((la) this).field_d;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((la) this).field_o) {
                            break L11;
                          } else {
                            L12: {
                              if (((la) this).field_f) {
                                ((la) this).field_f = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((la) this).field_q != 0) {
                                    break L13;
                                  } else {
                                    if (((la) this).field_h != 0) {
                                      break L13;
                                    } else {
                                      ((la) this).b();
                                      ((la) this).field_p = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((la) this).field_k = Math.min(((la) this).field_h, ((la) this).field_q);
                                ((la) this).field_h = ((la) this).field_q;
                                break L12;
                              }
                            }
                            ((la) this).field_q = 0;
                            ((la) this).field_o = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((la) this).field_i = var3_int;
                        break L4;
                      } else {
                        this.a(((la) this).field_r, 256);
                        ((la) this).d();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((la) this).b();
                    ((la) this).field_p = var1 + 2000L;
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

    final synchronized void a(di param0) {
        ((la) this).field_n = param0;
    }

    final synchronized void c() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_u == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_u.field_h = true;
                  L2: while (true) {
                    if (!field_u.field_b) {
                      field_u = null;
                      break L0;
                    } else {
                      hb.a(50L, 121);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_u.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_u.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_u.field_c[var2] != null) {
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
        ((la) this).b();
        ((la) this).field_r = null;
        ((la) this).field_j = true;
    }

    void b() {
    }

    int f() throws Exception {
        return ((la) this).field_a;
    }

    void a(int param0) throws Exception {
    }

    void d() throws Exception {
    }

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
                field_c = param0;
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
              field_l = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        di var7 = null;
        int var8_int = 0;
        di[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        di var11 = null;
        ng var12 = null;
        int var13 = 0;
        di var14 = null;
        di var15 = null;
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
          mk.a(param0, 0, var3);
          ((la) this).field_m = ((la) this).field_m - 256;
          if (((la) this).field_n == null) {
            break L1;
          } else {
            if (((la) this).field_m > 0) {
              break L1;
            } else {
              ((la) this).field_m = ((la) this).field_m + (field_c >> 4);
              la.b(((la) this).field_n);
              this.a(((la) this).field_n, ((la) this).field_n.b());
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
                            var11 = ((la) this).field_e[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_h;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_f <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_f;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_g = true;
                                  var13 = var11.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_f = var12.field_f + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((la) this).field_b) {
                                  L10: {
                                    var14 = var11.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_i;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.b() >> 8);
                                          var14 = var11.d();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_f;
                                    var11.field_f = null;
                                    if (var10 != null) {
                                      ((di) var10).field_f = var15;
                                      break L12;
                                    } else {
                                      ((la) this).field_e[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((la) this).field_s[var7_int] = (di) var10;
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
                    var7 = ((la) this).field_e[var6];
                    var8 = ((la) this).field_e;
                    var9 = var6;
                    ((la) this).field_s[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_f;
                        var7.field_f = null;
                        var7 = (di) var10;
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
          if (((la) this).field_m >= 0) {
            break L16;
          } else {
            ((la) this).field_m = 0;
            break L16;
          }
        }
        L17: {
          if (((la) this).field_n == null) {
            break L17;
          } else {
            ((la) this).field_n.b(param0, 0, 256);
            break L17;
          }
        }
        ((la) this).field_t = ji.b(109);
    }

    public static void e() {
        field_u = null;
    }

    private final static void b(di param0) {
        param0.field_g = false;
        if (param0.field_h != null) {
            param0.field_h.field_f = 0;
        }
        di var1 = param0.a();
        while (var1 != null) {
            la.b(var1);
            var1 = param0.d();
        }
    }

    private final void b(int param0) {
        ((la) this).field_m = ((la) this).field_m - 256;
        if (((la) this).field_m < 0) {
            ((la) this).field_m = 0;
        }
        if (((la) this).field_n != null) {
            ((la) this).field_n.c(256);
            return;
        }
    }

    private final void a(di param0, int param1) {
        int var3 = param1 >> 5;
        di var4 = ((la) this).field_s[var3];
        if (var4 == null) {
            ((la) this).field_e[var3] = param0;
        } else {
            var4.field_f = param0;
        }
        ((la) this).field_s[var3] = param0;
        param0.field_i = param1;
    }

    final static la a(be param0, java.awt.Component param1, int param2, int param3) {
        try {
            ni var4 = null;
            Throwable var4_ref = null;
            ni var5 = null;
            ni stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ni stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ni stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ni stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ni stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ni stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ni stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ni stackOut_20_0 = null;
            if (field_c != 0) {
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
                          var5 = new ni();
                          var4 = var5;
                          stackOut_8_0 = (ni) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_g) {
                            stackOut_10_0 = (ni) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (ni) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((la) (Object) stackIn_11_0).field_r = new int[stackIn_11_1 * stackIn_11_2];
                          ((la) (Object) var4).field_d = param3;
                          ((la) (Object) var4).a(param1);
                          ((la) (Object) var4).field_a = (param3 & -1024) + 1024;
                          if (((la) (Object) var4).field_a <= 16384) {
                            break L4;
                          } else {
                            ((la) (Object) var4).field_a = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((la) (Object) var4).a(((la) (Object) var4).field_a);
                          if (field_l <= 0) {
                            break L5;
                          } else {
                            if (field_u != null) {
                              break L5;
                            } else {
                              field_u = new oa();
                              field_u.field_g = param0;
                              eb discarded$2 = param0.a(314572800, field_l, (Runnable) (Object) field_u);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_u == null) {
                            break L6;
                          } else {
                            if (field_u.field_c[param2] == null) {
                              field_u.field_c[param2] = (la) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (ni) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new la();
                    }
                    return (la) (Object) stackIn_21_0;
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

    la() {
        ((la) this).field_j = false;
        ((la) this).field_b = 32;
        ((la) this).field_t = ji.b(124);
        ((la) this).field_o = 0L;
        ((la) this).field_h = 0;
        ((la) this).field_f = true;
        ((la) this).field_e = new di[8];
        ((la) this).field_i = 0;
        ((la) this).field_m = 0;
        ((la) this).field_p = 0L;
        ((la) this).field_s = new di[8];
        ((la) this).field_q = 0;
    }
}
