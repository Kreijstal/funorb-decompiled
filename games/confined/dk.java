/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dk {
    static int field_k;
    private gf field_m;
    private static sb field_f;
    private boolean field_n;
    private static int field_g;
    static boolean field_j;
    private long field_h;
    private int field_r;
    int[] field_l;
    private boolean field_u;
    private long field_t;
    private int field_p;
    private int field_b;
    private int field_i;
    private int field_a;
    private gf[] field_e;
    private gf[] field_c;
    private long field_d;
    private int field_o;
    private int field_s;
    private int field_q;

    int b() throws Exception {
        return ((dk) this).field_i;
    }

    private final static void a(gf param0) {
        param0.field_o = false;
        if (param0.field_n != null) {
            param0.field_n.field_m = 0;
        }
        gf var1 = param0.a();
        while (var1 != null) {
            dk.a(var1);
            var1 = param0.d();
        }
    }

    final synchronized void d() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_f == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_f.field_d = true;
                  L2: while (true) {
                    if (!field_f.field_j) {
                      field_f = null;
                      break L0;
                    } else {
                      jd.a(1, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_f.field_k[var2] != this) {
                    break L3;
                  } else {
                    field_f.field_k[var2] = null;
                    break L3;
                  }
                }
                if (field_f.field_k[var2] != null) {
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
        ((dk) this).a();
        ((dk) this).field_l = null;
        ((dk) this).field_n = true;
    }

    private final void a(gf param0, int param1) {
        int var3 = param1 >> 5;
        gf var4 = ((dk) this).field_e[var3];
        if (var4 == null) {
            ((dk) this).field_c[var3] = param0;
        } else {
            var4.field_p = param0;
        }
        ((dk) this).field_e[var3] = param0;
        param0.field_m = param1;
    }

    final static dk a(df param0, java.awt.Component param1, int param2, int param3) {
        try {
            hg var4 = null;
            Throwable var4_ref = null;
            hg var5 = null;
            hg stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            hg stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            hg stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            hg stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            hg stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            hg stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            hg stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            hg stackOut_20_0 = null;
            if (field_k != 0) {
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
                          var5 = new hg();
                          var4 = var5;
                          stackOut_8_0 = (hg) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_j) {
                            stackOut_10_0 = (hg) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (hg) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((dk) (Object) stackIn_11_0).field_l = new int[stackIn_11_1 * stackIn_11_2];
                          ((dk) (Object) var4).field_s = param3;
                          ((dk) (Object) var4).a(param1);
                          ((dk) (Object) var4).field_i = (param3 & -1024) + 1024;
                          if (((dk) (Object) var4).field_i <= 16384) {
                            break L4;
                          } else {
                            ((dk) (Object) var4).field_i = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((dk) (Object) var4).b(((dk) (Object) var4).field_i);
                          if (field_g <= 0) {
                            break L5;
                          } else {
                            if (field_f != null) {
                              break L5;
                            } else {
                              field_f = new sb();
                              field_f.field_c = param0;
                              bc discarded$2 = param0.a((byte) 50, (Runnable) (Object) field_f, field_g);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_f == null) {
                            break L6;
                          } else {
                            if (field_f.field_k[param2] == null) {
                              field_f.field_k[param2] = (dk) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (hg) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new dk();
                    }
                    return (dk) (Object) stackIn_21_0;
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

    void a() {
    }

    private final void a(int param0) {
        ((dk) this).field_q = ((dk) this).field_q - param0;
        if (((dk) this).field_q < 0) {
            ((dk) this).field_q = 0;
        }
        if (((dk) this).field_m != null) {
            ((dk) this).field_m.b(param0);
            return;
        }
    }

    final synchronized void c() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((dk) this).field_n) {
              var1 = ri.a(-3);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((dk) this).field_h + 6000L) {
                      break L1;
                    } else {
                      ((dk) this).field_h = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((dk) this).field_h + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((dk) this).field_h = ((dk) this).field_h + (long)(256000 / field_k);
                      var1 = ri.a(-3);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((dk) this).field_h = var1;
                  break L3;
                }
              }
              if (((dk) this).field_l != null) {
                try {
                  L4: {
                    L5: {
                      if (((dk) this).field_t == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((dk) this).field_t) {
                          ((dk) this).b(((dk) this).field_i);
                          ((dk) this).field_t = 0L;
                          ((dk) this).field_u = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((dk) this).b();
                      if (((dk) this).field_o - var3_int <= ((dk) this).field_p) {
                        break L6;
                      } else {
                        ((dk) this).field_p = ((dk) this).field_o - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((dk) this).field_s + ((dk) this).field_a;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((dk) this).field_i) {
                        break L8;
                      } else {
                        L9: {
                          ((dk) this).field_i = ((dk) this).field_i + 1024;
                          if (((dk) this).field_i <= 16384) {
                            break L9;
                          } else {
                            ((dk) this).field_i = 16384;
                            break L9;
                          }
                        }
                        ((dk) this).a();
                        ((dk) this).b(((dk) this).field_i);
                        var3_int = 0;
                        ((dk) this).field_u = true;
                        if (var4 + 256 <= ((dk) this).field_i) {
                          break L8;
                        } else {
                          var4 = ((dk) this).field_i - 256;
                          ((dk) this).field_a = var4 - ((dk) this).field_s;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((dk) this).field_d) {
                            break L11;
                          } else {
                            L12: {
                              if (((dk) this).field_u) {
                                ((dk) this).field_u = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((dk) this).field_p != 0) {
                                    break L13;
                                  } else {
                                    if (((dk) this).field_b != 0) {
                                      break L13;
                                    } else {
                                      ((dk) this).a();
                                      ((dk) this).field_t = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((dk) this).field_a = Math.min(((dk) this).field_b, ((dk) this).field_p);
                                ((dk) this).field_b = ((dk) this).field_p;
                                break L12;
                              }
                            }
                            ((dk) this).field_p = 0;
                            ((dk) this).field_d = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((dk) this).field_o = var3_int;
                        break L4;
                      } else {
                        this.a(((dk) this).field_l, 256);
                        ((dk) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((dk) this).a();
                    ((dk) this).field_t = var1 + 2000L;
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

    final static void a(int param0, boolean param1, int param2) {
        field_k = 22050;
        field_j = true;
        field_g = 10;
    }

    public static void f() {
        field_f = null;
    }

    final synchronized void b(gf param0) {
        ((dk) this).field_m = param0;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        gf var7 = null;
        int var8_int = 0;
        gf[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        gf var11 = null;
        ob var12 = null;
        int var13 = 0;
        gf var14 = null;
        gf var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_j) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          lj.a(param0, 0, var3);
          ((dk) this).field_q = ((dk) this).field_q - param1;
          if (((dk) this).field_m == null) {
            break L1;
          } else {
            if (((dk) this).field_q > 0) {
              break L1;
            } else {
              ((dk) this).field_q = ((dk) this).field_q + (field_k >> 4);
              dk.a(((dk) this).field_m);
              this.a(((dk) this).field_m, ((dk) this).field_m.b());
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
                            var11 = ((dk) this).field_c[var7_int];
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
                                    if (var12.field_m <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_p;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_o = true;
                                  var13 = var11.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_m = var12.field_m + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((dk) this).field_r) {
                                  L10: {
                                    var14 = var11.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_m;
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
                                    var15 = var11.field_p;
                                    var11.field_p = null;
                                    if (var10 != null) {
                                      ((gf) var10).field_p = var15;
                                      break L12;
                                    } else {
                                      ((dk) this).field_c[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((dk) this).field_e[var7_int] = (gf) var10;
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
                    var7 = ((dk) this).field_c[var6];
                    var8 = ((dk) this).field_c;
                    var9 = var6;
                    ((dk) this).field_e[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_p;
                        var7.field_p = null;
                        var7 = (gf) var10;
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
          if (((dk) this).field_q >= 0) {
            break L16;
          } else {
            ((dk) this).field_q = 0;
            break L16;
          }
        }
        L17: {
          if (((dk) this).field_m == null) {
            break L17;
          } else {
            ((dk) this).field_m.a(param0, 0, param1);
            break L17;
          }
        }
        ((dk) this).field_h = ri.a(-3);
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void e() throws Exception {
    }

    void b(int param0) throws Exception {
    }

    dk() {
        ((dk) this).field_n = false;
        ((dk) this).field_r = 32;
        ((dk) this).field_h = ri.a(-3);
        ((dk) this).field_p = 0;
        ((dk) this).field_b = 0;
        ((dk) this).field_c = new gf[8];
        ((dk) this).field_d = 0L;
        ((dk) this).field_o = 0;
        ((dk) this).field_e = new gf[8];
        ((dk) this).field_u = true;
        ((dk) this).field_t = 0L;
        ((dk) this).field_q = 0;
    }
}
