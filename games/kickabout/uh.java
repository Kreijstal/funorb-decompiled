/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uh {
    private int field_j;
    private boolean field_s;
    private long field_t;
    static boolean field_o;
    int[] field_k;
    static int field_i;
    private static cp field_d;
    private lq field_c;
    private static int field_h;
    private int field_m;
    private int field_u;
    private int field_r;
    private int field_l;
    private lq[] field_f;
    private long field_q;
    private long field_g;
    private int field_n;
    private boolean field_a;
    private int field_p;
    private lq[] field_b;
    private int field_e;

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        lq var7 = null;
        int var8_int = 0;
        lq[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        lq var11 = null;
        dm var12 = null;
        int var13 = 0;
        lq var14 = null;
        lq var15 = null;
        int var15_int = 0;
        L0: {
          var3 = 256;
          if (!field_o) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          dv.a(param0, 0, var3);
          ((uh) this).field_u = ((uh) this).field_u - 256;
          if (((uh) this).field_c == null) {
            break L1;
          } else {
            if (((uh) this).field_u > 0) {
              break L1;
            } else {
              ((uh) this).field_u = ((uh) this).field_u + (field_i >> 4);
              uh.b(((uh) this).field_c);
              this.a(((uh) this).field_c, ((uh) this).field_c.a());
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
                            var11 = ((uh) this).field_b[var7_int];
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
                                    if (var12.field_e <= var8_int) {
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
                                  var11.field_e = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_e = var12.field_e + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((uh) this).field_j) {
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
                                          this.a(var14, var15_int * var14.a() >> 8);
                                          var14 = var11.b();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_f;
                                    var11.field_f = null;
                                    if (var10 != null) {
                                      ((lq) var10).field_f = var15;
                                      break L12;
                                    } else {
                                      ((uh) this).field_b[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((uh) this).field_f[var7_int] = (lq) var10;
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
                    var7 = ((uh) this).field_b[var6];
                    var8 = ((uh) this).field_b;
                    var9 = var6;
                    ((uh) this).field_f[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_f;
                        var7.field_f = null;
                        var7 = (lq) var10;
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
          if (((uh) this).field_u >= 0) {
            break L16;
          } else {
            ((uh) this).field_u = 0;
            break L16;
          }
        }
        L17: {
          if (((uh) this).field_c == null) {
            break L17;
          } else {
            ((uh) this).field_c.a(param0, 0, 256);
            break L17;
          }
        }
        ((uh) this).field_t = nj.a(-96);
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
                field_i = param0;
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
              field_h = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final synchronized void a(lq param0) {
        ((uh) this).field_c = param0;
    }

    private final static void b(lq param0) {
        param0.field_e = false;
        if (param0.field_h != null) {
            param0.field_h.field_e = 0;
        }
        lq var1 = param0.c();
        while (var1 != null) {
            uh.b(var1);
            var1 = param0.b();
        }
    }

    final static uh a(bu param0, java.awt.Component param1, int param2, int param3) {
        try {
            a var4 = null;
            Throwable var4_ref = null;
            a var5 = null;
            a stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            a stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            a stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            a stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            a stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            a stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            a stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            a stackOut_20_0 = null;
            if (field_i != 0) {
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
                          var5 = new a();
                          var4 = var5;
                          stackOut_8_0 = (a) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_o) {
                            stackOut_10_0 = (a) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (a) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((uh) (Object) stackIn_11_0).field_k = new int[stackIn_11_1 * stackIn_11_2];
                          ((uh) (Object) var4).field_p = param3;
                          ((uh) (Object) var4).a(param1);
                          ((uh) (Object) var4).field_r = (param3 & -1024) + 1024;
                          if (((uh) (Object) var4).field_r <= 16384) {
                            break L4;
                          } else {
                            ((uh) (Object) var4).field_r = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((uh) (Object) var4).b(((uh) (Object) var4).field_r);
                          if (field_h <= 0) {
                            break L5;
                          } else {
                            if (field_d != null) {
                              break L5;
                            } else {
                              field_d = new cp();
                              field_d.field_f = param0;
                              wu discarded$2 = param0.a(field_h, (byte) 125, (Runnable) (Object) field_d);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_d == null) {
                            break L6;
                          } else {
                            if (field_d.field_b[param2] == null) {
                              field_d.field_b[param2] = (uh) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (a) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new uh();
                    }
                    return (uh) (Object) stackIn_21_0;
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

    private final void a(lq param0, int param1) {
        int var3 = param1 >> 5;
        lq var4 = ((uh) this).field_f[var3];
        if (var4 == null) {
            ((uh) this).field_b[var3] = param0;
        } else {
            var4.field_f = param0;
        }
        ((uh) this).field_f[var3] = param0;
        param0.field_g = param1;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void d() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((uh) this).field_s) {
              var1 = nj.a(-92);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((uh) this).field_t + 6000L) {
                      break L1;
                    } else {
                      ((uh) this).field_t = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((uh) this).field_t + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((uh) this).field_t = ((uh) this).field_t + (long)(256000 / field_i);
                      var1 = nj.a(109);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((uh) this).field_t = var1;
                  break L3;
                }
              }
              if (((uh) this).field_k != null) {
                try {
                  L4: {
                    L5: {
                      if (((uh) this).field_g == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((uh) this).field_g) {
                          ((uh) this).b(((uh) this).field_r);
                          ((uh) this).field_g = 0L;
                          ((uh) this).field_a = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((uh) this).b();
                      if (((uh) this).field_e - var3_int <= ((uh) this).field_l) {
                        break L6;
                      } else {
                        ((uh) this).field_l = ((uh) this).field_e - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((uh) this).field_p + ((uh) this).field_m;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((uh) this).field_r) {
                        break L8;
                      } else {
                        L9: {
                          ((uh) this).field_r = ((uh) this).field_r + 1024;
                          if (((uh) this).field_r <= 16384) {
                            break L9;
                          } else {
                            ((uh) this).field_r = 16384;
                            break L9;
                          }
                        }
                        ((uh) this).f();
                        ((uh) this).b(((uh) this).field_r);
                        var3_int = 0;
                        ((uh) this).field_a = true;
                        if (var4 + 256 <= ((uh) this).field_r) {
                          break L8;
                        } else {
                          var4 = ((uh) this).field_r - 256;
                          ((uh) this).field_m = var4 - ((uh) this).field_p;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((uh) this).field_q) {
                            break L11;
                          } else {
                            L12: {
                              if (((uh) this).field_a) {
                                ((uh) this).field_a = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((uh) this).field_l != 0) {
                                    break L13;
                                  } else {
                                    if (((uh) this).field_n != 0) {
                                      break L13;
                                    } else {
                                      ((uh) this).f();
                                      ((uh) this).field_g = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((uh) this).field_m = Math.min(((uh) this).field_n, ((uh) this).field_l);
                                ((uh) this).field_n = ((uh) this).field_l;
                                break L12;
                              }
                            }
                            ((uh) this).field_l = 0;
                            ((uh) this).field_q = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((uh) this).field_e = var3_int;
                        break L4;
                      } else {
                        this.a(((uh) this).field_k, 256);
                        ((uh) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((uh) this).f();
                    ((uh) this).field_g = var1 + 2000L;
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

    private final void a(int param0) {
        ((uh) this).field_u = ((uh) this).field_u - 256;
        if (((uh) this).field_u < 0) {
            ((uh) this).field_u = 0;
        }
        if (((uh) this).field_c != null) {
            ((uh) this).field_c.a(256);
            return;
        }
    }

    int b() throws Exception {
        return ((uh) this).field_r;
    }

    void e() throws Exception {
    }

    public static void a() {
        field_d = null;
    }

    void b(int param0) throws Exception {
    }

    void f() {
    }

    final synchronized void c() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_d == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_d.field_e = true;
                  L2: while (true) {
                    if (!field_d.field_c) {
                      field_d = null;
                      break L0;
                    } else {
                      aj.a(50L, 1);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_d.field_b[var2] != this) {
                    break L3;
                  } else {
                    field_d.field_b[var2] = null;
                    break L3;
                  }
                }
                if (field_d.field_b[var2] != null) {
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
        ((uh) this).f();
        ((uh) this).field_k = null;
        ((uh) this).field_s = true;
    }

    uh() {
        ((uh) this).field_s = false;
        ((uh) this).field_j = 32;
        ((uh) this).field_t = nj.a(24);
        ((uh) this).field_u = 0;
        ((uh) this).field_f = new lq[8];
        ((uh) this).field_g = 0L;
        ((uh) this).field_l = 0;
        ((uh) this).field_n = 0;
        ((uh) this).field_a = true;
        ((uh) this).field_q = 0L;
        ((uh) this).field_b = new lq[8];
        ((uh) this).field_e = 0;
    }
}
