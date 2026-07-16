/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gd {
    int[] field_e;
    private boolean field_p;
    private static ga field_o;
    private long field_l;
    private je field_h;
    static int field_m;
    private static int field_n;
    private int field_i;
    static boolean field_q;
    private int field_g;
    private long field_a;
    private int field_d;
    private boolean field_c;
    private int field_u;
    private int field_b;
    private long field_j;
    private int field_r;
    private je[] field_k;
    private int field_s;
    private int field_f;
    private je[] field_t;

    void d() {
    }

    final synchronized void f() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((gd) this).field_p) {
              var1 = id.a(45);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((gd) this).field_l + 6000L) {
                      break L1;
                    } else {
                      ((gd) this).field_l = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((gd) this).field_l + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((gd) this).field_l = ((gd) this).field_l + (long)(256000 / field_m);
                      var1 = id.a(97);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((gd) this).field_l = var1;
                  break L3;
                }
              }
              if (((gd) this).field_e != null) {
                try {
                  L4: {
                    L5: {
                      if (((gd) this).field_j == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((gd) this).field_j) {
                          ((gd) this).a(((gd) this).field_s);
                          ((gd) this).field_j = 0L;
                          ((gd) this).field_c = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((gd) this).b();
                      if (((gd) this).field_b - var3_int <= ((gd) this).field_r) {
                        break L6;
                      } else {
                        ((gd) this).field_r = ((gd) this).field_b - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((gd) this).field_d + ((gd) this).field_f;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((gd) this).field_s) {
                        break L8;
                      } else {
                        L9: {
                          ((gd) this).field_s = ((gd) this).field_s + 1024;
                          if (((gd) this).field_s <= 16384) {
                            break L9;
                          } else {
                            ((gd) this).field_s = 16384;
                            break L9;
                          }
                        }
                        ((gd) this).d();
                        ((gd) this).a(((gd) this).field_s);
                        var3_int = 0;
                        ((gd) this).field_c = true;
                        if (var4 + 256 <= ((gd) this).field_s) {
                          break L8;
                        } else {
                          var4 = ((gd) this).field_s - 256;
                          ((gd) this).field_f = var4 - ((gd) this).field_d;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((gd) this).field_a) {
                            break L11;
                          } else {
                            L12: {
                              if (((gd) this).field_c) {
                                ((gd) this).field_c = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((gd) this).field_r != 0) {
                                    break L13;
                                  } else {
                                    if (((gd) this).field_g != 0) {
                                      break L13;
                                    } else {
                                      ((gd) this).d();
                                      ((gd) this).field_j = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((gd) this).field_f = Math.min(((gd) this).field_g, ((gd) this).field_r);
                                ((gd) this).field_g = ((gd) this).field_r;
                                break L12;
                              }
                            }
                            ((gd) this).field_r = 0;
                            ((gd) this).field_a = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((gd) this).field_b = var3_int;
                        break L4;
                      } else {
                        this.a(((gd) this).field_e, 256);
                        ((gd) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((gd) this).d();
                    ((gd) this).field_j = var1 + 2000L;
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
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < 8000) {
            break L0;
          } else {
            if (param0 <= 48000) {
              L1: {
                field_m = param0;
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
              field_n = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    int b() throws Exception {
        return ((gd) this).field_s;
    }

    void e() throws Exception {
    }

    private final static void a(je param0) {
        param0.field_h = false;
        if (param0.field_i != null) {
            param0.field_i.field_g = 0;
        }
        je var1 = param0.b();
        while (var1 != null) {
            gd.a(var1);
            var1 = param0.a();
        }
    }

    final synchronized void c() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_o == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_o.field_d = true;
                  L2: while (true) {
                    if (!field_o.field_c) {
                      field_o = null;
                      break L0;
                    } else {
                      wk.a((byte) -118, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_o.field_e[var2] != this) {
                    break L3;
                  } else {
                    field_o.field_e[var2] = null;
                    break L3;
                  }
                }
                if (field_o.field_e[var2] != null) {
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
        ((gd) this).d();
        ((gd) this).field_e = null;
        ((gd) this).field_p = true;
    }

    private final void a(je param0, int param1) {
        int var3 = param1 >> 5;
        je var4 = ((gd) this).field_t[var3];
        if (var4 == null) {
            ((gd) this).field_k[var3] = param0;
        } else {
            var4.field_g = param0;
        }
        ((gd) this).field_t[var3] = param0;
        param0.field_j = param1;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        je var7 = null;
        int var8_int = 0;
        je[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        je var11 = null;
        ea var12 = null;
        int var13 = 0;
        je var14 = null;
        je var15 = null;
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
          og.a(param0, 0, var3);
          ((gd) this).field_u = ((gd) this).field_u - param1;
          if (((gd) this).field_h == null) {
            break L1;
          } else {
            if (((gd) this).field_u > 0) {
              break L1;
            } else {
              ((gd) this).field_u = ((gd) this).field_u + (field_m >> 4);
              gd.a(((gd) this).field_h);
              this.a(((gd) this).field_h, ((gd) this).field_h.d());
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
                            var11 = ((gd) this).field_k[var7_int];
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
                                    if (var12.field_g <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_g;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_h = true;
                                  var13 = var11.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_g = var12.field_g + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((gd) this).field_i) {
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
                                    var15 = var11.field_g;
                                    var11.field_g = null;
                                    if (var10 != null) {
                                      ((je) var10).field_g = var15;
                                      break L12;
                                    } else {
                                      ((gd) this).field_k[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((gd) this).field_t[var7_int] = (je) var10;
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
                    var7 = ((gd) this).field_k[var6];
                    var8 = ((gd) this).field_k;
                    var9 = var6;
                    ((gd) this).field_t[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_g;
                        var7.field_g = null;
                        var7 = (je) var10;
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
          if (((gd) this).field_u >= 0) {
            break L16;
          } else {
            ((gd) this).field_u = 0;
            break L16;
          }
        }
        L17: {
          if (((gd) this).field_h == null) {
            break L17;
          } else {
            ((gd) this).field_h.a(param0, 0, param1);
            break L17;
          }
        }
        ((gd) this).field_l = id.a(113);
    }

    final static gd a(le param0, java.awt.Component param1, int param2, int param3) {
        try {
            kd var4 = null;
            Throwable var4_ref = null;
            kd var5 = null;
            kd stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            kd stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            kd stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            kd stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            kd stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            kd stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            kd stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            kd stackOut_20_0 = null;
            if (field_m != 0) {
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
                          var5 = new kd();
                          var4 = var5;
                          stackOut_8_0 = (kd) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_q) {
                            stackOut_10_0 = (kd) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (kd) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((gd) (Object) stackIn_11_0).field_e = new int[stackIn_11_1 * stackIn_11_2];
                          ((gd) (Object) var4).field_d = param3;
                          ((gd) (Object) var4).a(param1);
                          ((gd) (Object) var4).field_s = (param3 & -1024) + 1024;
                          if (((gd) (Object) var4).field_s <= 16384) {
                            break L4;
                          } else {
                            ((gd) (Object) var4).field_s = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((gd) (Object) var4).a(((gd) (Object) var4).field_s);
                          if (field_n <= 0) {
                            break L5;
                          } else {
                            if (field_o != null) {
                              break L5;
                            } else {
                              field_o = new ga();
                              field_o.field_a = param0;
                              vi discarded$2 = param0.a(0, field_n, (Runnable) (Object) field_o);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_o == null) {
                            break L6;
                          } else {
                            if (field_o.field_e[param2] == null) {
                              field_o.field_e[param2] = (gd) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (kd) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new gd();
                    }
                    return (gd) (Object) stackIn_21_0;
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

    public static void a() {
        field_o = null;
    }

    private final void b(int param0) {
        ((gd) this).field_u = ((gd) this).field_u - param0;
        if (((gd) this).field_u < 0) {
            ((gd) this).field_u = 0;
        }
        if (((gd) this).field_h != null) {
            ((gd) this).field_h.a(param0);
            return;
        }
    }

    void a(int param0) throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void b(je param0) {
        ((gd) this).field_h = param0;
    }

    gd() {
        ((gd) this).field_p = false;
        ((gd) this).field_i = 32;
        ((gd) this).field_l = id.a(35);
        ((gd) this).field_g = 0;
        ((gd) this).field_u = 0;
        ((gd) this).field_k = new je[8];
        ((gd) this).field_b = 0;
        ((gd) this).field_r = 0;
        ((gd) this).field_c = true;
        ((gd) this).field_a = 0L;
        ((gd) this).field_j = 0L;
        ((gd) this).field_t = new je[8];
    }
}
