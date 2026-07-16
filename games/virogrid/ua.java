/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ua {
    static int field_p;
    private static lm field_b;
    private static int field_i;
    private int field_e;
    int[] field_a;
    static boolean field_q;
    private long field_r;
    private in field_d;
    private boolean field_c;
    private long field_k;
    private in[] field_t;
    private long field_s;
    private int field_g;
    private int field_f;
    private int field_h;
    private boolean field_n;
    private int field_m;
    private in[] field_u;
    private int field_j;
    private int field_l;
    private int field_o;

    final static ua a(pd param0, java.awt.Component param1, int param2, int param3) {
        try {
            tc var4 = null;
            Throwable var4_ref = null;
            tc var5 = null;
            tc stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            tc stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            tc stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            tc stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            tc stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            tc stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            tc stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            tc stackOut_20_0 = null;
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
                          var5 = new tc();
                          var4 = var5;
                          stackOut_8_0 = (tc) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_q) {
                            stackOut_10_0 = (tc) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (tc) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((ua) (Object) stackIn_11_0).field_a = new int[stackIn_11_1 * stackIn_11_2];
                          ((ua) (Object) var4).field_f = param3;
                          ((ua) (Object) var4).a(param1);
                          ((ua) (Object) var4).field_h = (param3 & -1024) + 1024;
                          if (((ua) (Object) var4).field_h <= 16384) {
                            break L4;
                          } else {
                            ((ua) (Object) var4).field_h = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((ua) (Object) var4).b(((ua) (Object) var4).field_h);
                          if (field_i <= 0) {
                            break L5;
                          } else {
                            if (field_b != null) {
                              break L5;
                            } else {
                              field_b = new lm();
                              field_b.field_b = param0;
                              un discarded$2 = param0.a(field_i, (Runnable) (Object) field_b, 255);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_b == null) {
                            break L6;
                          } else {
                            if (field_b.field_h[param2] == null) {
                              field_b.field_h[param2] = (ua) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (tc) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new ua();
                    }
                    return (ua) (Object) stackIn_21_0;
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

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void h() {
        try {
            ((ua) this).field_n = true;
            try {
                ((ua) this).f();
            } catch (Exception exception) {
                ((ua) this).g();
                ((ua) this).field_k = hc.a(-9986) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
                  field_b.field_d = true;
                  L2: while (true) {
                    if (!field_b.field_f) {
                      field_b = null;
                      break L0;
                    } else {
                      mm.a(-83, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_b.field_h[var2] != this) {
                    break L3;
                  } else {
                    field_b.field_h[var2] = null;
                    break L3;
                  }
                }
                if (field_b.field_h[var2] != null) {
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
        ((ua) this).g();
        ((ua) this).field_a = null;
        ((ua) this).field_c = true;
    }

    final synchronized void a(in param0) {
        ((ua) this).field_d = param0;
    }

    private final void a(in param0, int param1) {
        int var3 = param1 >> 5;
        in var4 = ((ua) this).field_t[var3];
        if (var4 == null) {
            ((ua) this).field_u[var3] = param0;
        } else {
            var4.field_h = param0;
        }
        ((ua) this).field_t[var3] = param0;
        param0.field_i = param1;
    }

    private final static void b(in param0) {
        param0.field_g = false;
        if (param0.field_j != null) {
            param0.field_j.field_g = 0;
        }
        in var1 = param0.c();
        while (var1 != null) {
            ua.b(var1);
            var1 = param0.b();
        }
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
              field_q = stackIn_7_0 != 0;
              field_i = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void f() throws Exception {
    }

    void a() throws Exception {
    }

    public static void b() {
        field_b = null;
    }

    private final void a(int param0) {
        ((ua) this).field_j = ((ua) this).field_j - param0;
        if (((ua) this).field_j < 0) {
            ((ua) this).field_j = 0;
        }
        if (((ua) this).field_d != null) {
            ((ua) this).field_d.a(param0);
            return;
        }
    }

    void g() {
    }

    void b(int param0) throws Exception {
    }

    int e() throws Exception {
        return ((ua) this).field_h;
    }

    final synchronized void c() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((ua) this).field_c) {
              var1 = hc.a(-9986);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((ua) this).field_r + 6000L) {
                      break L1;
                    } else {
                      ((ua) this).field_r = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((ua) this).field_r + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((ua) this).field_r = ((ua) this).field_r + (long)(256000 / field_p);
                      var1 = hc.a(-9986);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((ua) this).field_r = var1;
                  break L3;
                }
              }
              if (((ua) this).field_a != null) {
                try {
                  L4: {
                    L5: {
                      if (((ua) this).field_k == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((ua) this).field_k) {
                          ((ua) this).b(((ua) this).field_h);
                          ((ua) this).field_k = 0L;
                          ((ua) this).field_n = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((ua) this).e();
                      if (((ua) this).field_g - var3_int <= ((ua) this).field_m) {
                        break L6;
                      } else {
                        ((ua) this).field_m = ((ua) this).field_g - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((ua) this).field_f + ((ua) this).field_o;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((ua) this).field_h) {
                        break L8;
                      } else {
                        L9: {
                          ((ua) this).field_h = ((ua) this).field_h + 1024;
                          if (((ua) this).field_h <= 16384) {
                            break L9;
                          } else {
                            ((ua) this).field_h = 16384;
                            break L9;
                          }
                        }
                        ((ua) this).g();
                        ((ua) this).b(((ua) this).field_h);
                        var3_int = 0;
                        ((ua) this).field_n = true;
                        if (var4 + 256 <= ((ua) this).field_h) {
                          break L8;
                        } else {
                          var4 = ((ua) this).field_h - 256;
                          ((ua) this).field_o = var4 - ((ua) this).field_f;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((ua) this).field_s) {
                            break L11;
                          } else {
                            L12: {
                              if (((ua) this).field_n) {
                                ((ua) this).field_n = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((ua) this).field_m != 0) {
                                    break L13;
                                  } else {
                                    if (((ua) this).field_l != 0) {
                                      break L13;
                                    } else {
                                      ((ua) this).g();
                                      ((ua) this).field_k = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((ua) this).field_o = Math.min(((ua) this).field_l, ((ua) this).field_m);
                                ((ua) this).field_l = ((ua) this).field_m;
                                break L12;
                              }
                            }
                            ((ua) this).field_m = 0;
                            ((ua) this).field_s = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((ua) this).field_g = var3_int;
                        break L4;
                      } else {
                        this.a(((ua) this).field_a, 256);
                        ((ua) this).a();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((ua) this).g();
                    ((ua) this).field_k = var1 + 2000L;
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

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        in var7 = null;
        int var8_int = 0;
        in[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        in var11 = null;
        tj var12 = null;
        int var13 = 0;
        in var14 = null;
        in var15 = null;
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
          ek.a(param0, 0, var3);
          ((ua) this).field_j = ((ua) this).field_j - param1;
          if (((ua) this).field_d == null) {
            break L1;
          } else {
            if (((ua) this).field_j > 0) {
              break L1;
            } else {
              ((ua) this).field_j = ((ua) this).field_j + (field_p >> 4);
              ua.b(((ua) this).field_d);
              this.a(((ua) this).field_d, ((ua) this).field_d.a());
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
                            var11 = ((ua) this).field_u[var7_int];
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
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_h;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_g = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_g = var12.field_g + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((ua) this).field_e) {
                                  L10: {
                                    var14 = var11.c();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_i;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.a() >> 8);
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
                                      ((in) var10).field_h = var15;
                                      break L12;
                                    } else {
                                      ((ua) this).field_u[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((ua) this).field_t[var7_int] = (in) var10;
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
                    var7 = ((ua) this).field_u[var6];
                    var8 = ((ua) this).field_u;
                    var9 = var6;
                    ((ua) this).field_t[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_h;
                        var7.field_h = null;
                        var7 = (in) var10;
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
          if (((ua) this).field_j >= 0) {
            break L16;
          } else {
            ((ua) this).field_j = 0;
            break L16;
          }
        }
        L17: {
          if (((ua) this).field_d == null) {
            break L17;
          } else {
            ((ua) this).field_d.b(param0, 0, param1);
            break L17;
          }
        }
        ((ua) this).field_r = hc.a(-9986);
    }

    ua() {
        ((ua) this).field_e = 32;
        ((ua) this).field_c = false;
        ((ua) this).field_r = hc.a(-9986);
        ((ua) this).field_g = 0;
        ((ua) this).field_s = 0L;
        ((ua) this).field_u = new in[8];
        ((ua) this).field_n = true;
        ((ua) this).field_m = 0;
        ((ua) this).field_l = 0;
        ((ua) this).field_t = new in[8];
        ((ua) this).field_k = 0L;
        ((ua) this).field_j = 0;
    }
}
