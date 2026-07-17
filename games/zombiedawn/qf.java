/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qf {
    private sp field_f;
    static boolean field_l;
    private int field_b;
    private boolean field_k;
    static int field_p;
    private long field_d;
    int[] field_r;
    private static int field_q;
    private static cp field_j;
    private int field_s;
    private int field_g;
    private int field_n;
    private int field_m;
    private int field_i;
    private int field_a;
    private long field_o;
    private sp[] field_t;
    private long field_c;
    private int field_u;
    private sp[] field_h;
    private boolean field_e;

    private final static void a(sp param0) {
        param0.field_k = false;
        if (param0.field_h != null) {
            param0.field_h.field_h = 0;
        }
        sp var1 = param0.c();
        while (var1 != null) {
            qf.a(var1);
            var1 = param0.d();
        }
    }

    public static void c() {
        field_j = null;
    }

    void h() {
    }

    final synchronized void g() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((qf) this).field_k) {
              var1 = pd.a(-22826);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((qf) this).field_d + 6000L) {
                      break L1;
                    } else {
                      ((qf) this).field_d = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((qf) this).field_d + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((qf) this).field_d = ((qf) this).field_d + (long)(256000 / field_p);
                      var1 = pd.a(-22826);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((qf) this).field_d = var1;
                  break L3;
                }
              }
              if (((qf) this).field_r != null) {
                try {
                  L4: {
                    L5: {
                      if (((qf) this).field_o == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((qf) this).field_o) {
                          ((qf) this).a(((qf) this).field_g);
                          ((qf) this).field_o = 0L;
                          ((qf) this).field_e = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((qf) this).f();
                      if (((qf) this).field_m - var3_int <= ((qf) this).field_n) {
                        break L6;
                      } else {
                        ((qf) this).field_n = ((qf) this).field_m - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((qf) this).field_u + ((qf) this).field_a;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((qf) this).field_g) {
                        break L8;
                      } else {
                        L9: {
                          ((qf) this).field_g = ((qf) this).field_g + 1024;
                          if (((qf) this).field_g <= 16384) {
                            break L9;
                          } else {
                            ((qf) this).field_g = 16384;
                            break L9;
                          }
                        }
                        ((qf) this).h();
                        ((qf) this).a(((qf) this).field_g);
                        var3_int = 0;
                        ((qf) this).field_e = true;
                        if (var4 + 256 <= ((qf) this).field_g) {
                          break L8;
                        } else {
                          var4 = ((qf) this).field_g - 256;
                          ((qf) this).field_a = var4 - ((qf) this).field_u;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((qf) this).field_c) {
                            break L11;
                          } else {
                            L12: {
                              if (((qf) this).field_e) {
                                ((qf) this).field_e = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((qf) this).field_n != 0) {
                                    break L13;
                                  } else {
                                    if (((qf) this).field_s != 0) {
                                      break L13;
                                    } else {
                                      ((qf) this).h();
                                      ((qf) this).field_o = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((qf) this).field_a = Math.min(((qf) this).field_s, ((qf) this).field_n);
                                ((qf) this).field_s = ((qf) this).field_n;
                                break L12;
                              }
                            }
                            ((qf) this).field_n = 0;
                            ((qf) this).field_c = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((qf) this).field_m = var3_int;
                        break L4;
                      } else {
                        this.a(((qf) this).field_r, 256);
                        ((qf) this).b();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((qf) this).h();
                    ((qf) this).field_o = var1 + 2000L;
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

    final synchronized void d() {
        try {
            ((qf) this).field_e = true;
            try {
                ((qf) this).e();
            } catch (Exception exception) {
                ((qf) this).h();
                ((qf) this).field_o = pd.a(-22826) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void b(sp param0) {
        ((qf) this).field_f = param0;
    }

    private final void a(sp param0, int param1) {
        int var3 = param1 >> 5;
        sp var4 = ((qf) this).field_h[var3];
        if (var4 == null) {
            ((qf) this).field_t[var3] = param0;
        } else {
            var4.field_i = param0;
        }
        ((qf) this).field_h[var3] = param0;
        param0.field_j = param1;
    }

    final static qf a(ec param0, java.awt.Component param1, int param2, int param3) {
        try {
            od var4 = null;
            Throwable var4_ref = null;
            od var5 = null;
            od stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            od stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            od stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            od stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            od stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            od stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            od stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            od stackOut_20_0 = null;
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
                          var5 = new od();
                          var4 = var5;
                          stackOut_8_0 = (od) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_l) {
                            stackOut_10_0 = (od) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (od) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((qf) (Object) stackIn_11_0).field_r = new int[stackIn_11_1 * stackIn_11_2];
                          ((qf) (Object) var4).field_u = param3;
                          ((qf) (Object) var4).a(param1);
                          ((qf) (Object) var4).field_g = (param3 & -1024) + 1024;
                          if (((qf) (Object) var4).field_g <= 16384) {
                            break L4;
                          } else {
                            ((qf) (Object) var4).field_g = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((qf) (Object) var4).a(((qf) (Object) var4).field_g);
                          if (field_q <= 0) {
                            break L5;
                          } else {
                            if (field_j != null) {
                              break L5;
                            } else {
                              field_j = new cp();
                              field_j.field_b = param0;
                              op discarded$2 = param0.a(field_q, (Runnable) (Object) field_j, true);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_j == null) {
                            break L6;
                          } else {
                            if (field_j.field_c[param2] == null) {
                              field_j.field_c[param2] = (qf) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (od) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new qf();
                    }
                    return (qf) (Object) stackIn_21_0;
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

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        sp var7 = null;
        int var8_int = 0;
        sp[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        sp var11 = null;
        ik var12 = null;
        int var13 = 0;
        sp var14 = null;
        sp var15 = null;
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
          gp.a(param0, 0, var3);
          ((qf) this).field_i = ((qf) this).field_i - 256;
          if (((qf) this).field_f == null) {
            break L1;
          } else {
            if (((qf) this).field_i > 0) {
              break L1;
            } else {
              ((qf) this).field_i = ((qf) this).field_i + (field_p >> 4);
              qf.a(((qf) this).field_f);
              this.a(((qf) this).field_f, ((qf) this).field_f.b());
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
                            var11 = ((qf) this).field_t[var7_int];
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
                                    if (var12.field_h <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_i;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_k = true;
                                  var13 = var11.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_h = var12.field_h + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((qf) this).field_b) {
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
                                          this.a(var14, var15_int * var14.b() >> 8);
                                          var14 = var11.d();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_i;
                                    var11.field_i = null;
                                    if (var10 != null) {
                                      ((sp) var10).field_i = var15;
                                      break L12;
                                    } else {
                                      ((qf) this).field_t[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((qf) this).field_h[var7_int] = (sp) var10;
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
                    var7 = ((qf) this).field_t[var6];
                    var8 = ((qf) this).field_t;
                    var9 = var6;
                    ((qf) this).field_h[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_i;
                        var7.field_i = null;
                        var7 = (sp) var10;
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
          if (((qf) this).field_i >= 0) {
            break L16;
          } else {
            ((qf) this).field_i = 0;
            break L16;
          }
        }
        L17: {
          if (((qf) this).field_f == null) {
            break L17;
          } else {
            ((qf) this).field_f.a(param0, 0, 256);
            break L17;
          }
        }
        ((qf) this).field_d = pd.a(-22826);
    }

    private final void b(int param0) {
        ((qf) this).field_i = ((qf) this).field_i - 256;
        if (((qf) this).field_i < 0) {
            ((qf) this).field_i = 0;
        }
        if (((qf) this).field_f != null) {
            ((qf) this).field_f.a(256);
            return;
        }
    }

    void b() throws Exception {
    }

    final synchronized void a() {
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
                  field_j.field_d = true;
                  L2: while (true) {
                    if (!field_j.field_a) {
                      field_j = null;
                      break L0;
                    } else {
                      ld.a(50L, (byte) 47);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_j.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_j.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_j.field_c[var2] != null) {
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
        ((qf) this).h();
        ((qf) this).field_r = null;
        ((qf) this).field_k = true;
    }

    int f() throws Exception {
        return ((qf) this).field_g;
    }

    void a(int param0) throws Exception {
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
              field_l = stackIn_7_0 != 0;
              field_q = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void e() throws Exception {
    }

    qf() {
        ((qf) this).field_b = 32;
        ((qf) this).field_k = false;
        ((qf) this).field_d = pd.a(-22826);
        ((qf) this).field_s = 0;
        ((qf) this).field_m = 0;
        ((qf) this).field_o = 0L;
        ((qf) this).field_e = true;
        ((qf) this).field_n = 0;
        ((qf) this).field_h = new sp[8];
        ((qf) this).field_t = new sp[8];
        ((qf) this).field_i = 0;
        ((qf) this).field_c = 0L;
    }
}
