/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tj {
    int[] field_n;
    private int field_j;
    static int field_q;
    private long field_m;
    private qd field_e;
    private static int field_l;
    private static aq field_c;
    private boolean field_d;
    static boolean field_g;
    private int field_i;
    private long field_r;
    private qd[] field_p;
    private int field_f;
    private int field_h;
    private int field_o;
    private qd[] field_u;
    private int field_a;
    private long field_b;
    private int field_t;
    private boolean field_k;
    private int field_s;

    void h() throws Exception {
    }

    final synchronized void c() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((tj) this).field_d) {
              var1 = ue.a(false);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((tj) this).field_m + 6000L) {
                      break L1;
                    } else {
                      ((tj) this).field_m = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((tj) this).field_m + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((tj) this).field_m = ((tj) this).field_m + (long)(256000 / field_q);
                      var1 = ue.a(false);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((tj) this).field_m = var1;
                  break L3;
                }
              }
              if (((tj) this).field_n != null) {
                try {
                  L4: {
                    L5: {
                      if (((tj) this).field_r == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((tj) this).field_r) {
                          ((tj) this).b(((tj) this).field_a);
                          ((tj) this).field_r = 0L;
                          ((tj) this).field_k = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((tj) this).a();
                      if (((tj) this).field_h - var3_int <= ((tj) this).field_t) {
                        break L6;
                      } else {
                        ((tj) this).field_t = ((tj) this).field_h - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((tj) this).field_s + ((tj) this).field_o;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((tj) this).field_a) {
                        break L8;
                      } else {
                        L9: {
                          ((tj) this).field_a = ((tj) this).field_a + 1024;
                          if (((tj) this).field_a <= 16384) {
                            break L9;
                          } else {
                            ((tj) this).field_a = 16384;
                            break L9;
                          }
                        }
                        ((tj) this).d();
                        ((tj) this).b(((tj) this).field_a);
                        var3_int = 0;
                        ((tj) this).field_k = true;
                        if (var4 + 256 <= ((tj) this).field_a) {
                          break L8;
                        } else {
                          var4 = ((tj) this).field_a - 256;
                          ((tj) this).field_o = var4 - ((tj) this).field_s;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((tj) this).field_b) {
                            break L11;
                          } else {
                            L12: {
                              if (((tj) this).field_k) {
                                ((tj) this).field_k = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((tj) this).field_t != 0) {
                                    break L13;
                                  } else {
                                    if (((tj) this).field_f != 0) {
                                      break L13;
                                    } else {
                                      ((tj) this).d();
                                      ((tj) this).field_r = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((tj) this).field_o = Math.min(((tj) this).field_f, ((tj) this).field_t);
                                ((tj) this).field_f = ((tj) this).field_t;
                                break L12;
                              }
                            }
                            ((tj) this).field_t = 0;
                            ((tj) this).field_b = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((tj) this).field_h = var3_int;
                        break L4;
                      } else {
                        this.a(((tj) this).field_n, 256);
                        ((tj) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((tj) this).d();
                    ((tj) this).field_r = var1 + 2000L;
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
        qd var7 = null;
        int var8_int = 0;
        qd[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        qd var11 = null;
        el var12 = null;
        int var13 = 0;
        qd var14 = null;
        qd var15 = null;
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
          pm.a(param0, 0, var3);
          ((tj) this).field_i = ((tj) this).field_i - 256;
          if (((tj) this).field_e == null) {
            break L1;
          } else {
            if (((tj) this).field_i > 0) {
              break L1;
            } else {
              ((tj) this).field_i = ((tj) this).field_i + (field_q >> 4);
              tj.a(((tj) this).field_e);
              this.a(((tj) this).field_e, ((tj) this).field_e.c());
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
                            var11 = ((tj) this).field_p[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_k;
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
                                  var11.field_j = true;
                                  var13 = var11.b();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_i = var12.field_i + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((tj) this).field_j) {
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
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11.d();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_l;
                                    var11.field_l = null;
                                    if (var10 != null) {
                                      ((qd) var10).field_l = var15;
                                      break L12;
                                    } else {
                                      ((tj) this).field_p[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((tj) this).field_u[var7_int] = (qd) var10;
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
                    var7 = ((tj) this).field_p[var6];
                    var8 = ((tj) this).field_p;
                    var9 = var6;
                    ((tj) this).field_u[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_l;
                        var7.field_l = null;
                        var7 = (qd) var10;
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
          if (((tj) this).field_i >= 0) {
            break L16;
          } else {
            ((tj) this).field_i = 0;
            break L16;
          }
        }
        L17: {
          if (((tj) this).field_e == null) {
            break L17;
          } else {
            ((tj) this).field_e.b(param0, 0, 256);
            break L17;
          }
        }
        ((tj) this).field_m = ue.a(false);
    }

    public static void g() {
        field_c = null;
    }

    private final void a(qd param0, int param1) {
        int var3 = param1 >> 5;
        qd var4 = ((tj) this).field_u[var3];
        if (var4 == null) {
            ((tj) this).field_p[var3] = param0;
        } else {
            var4.field_l = param0;
        }
        ((tj) this).field_u[var3] = param0;
        param0.field_i = param1;
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

    void a(java.awt.Component param0) throws Exception {
    }

    void e() throws Exception {
    }

    final static tj a(tg param0, java.awt.Component param1, int param2, int param3) {
        try {
            pd var4 = null;
            Throwable var4_ref = null;
            pd var5 = null;
            pd stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            pd stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            pd stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            pd stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            pd stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            pd stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            pd stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            pd stackOut_20_0 = null;
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
                          var5 = new pd();
                          var4 = var5;
                          stackOut_8_0 = (pd) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_g) {
                            stackOut_10_0 = (pd) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (pd) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((tj) (Object) stackIn_11_0).field_n = new int[stackIn_11_1 * stackIn_11_2];
                          ((tj) (Object) var4).field_s = param3;
                          ((tj) (Object) var4).a(param1);
                          ((tj) (Object) var4).field_a = (param3 & -1024) + 1024;
                          if (((tj) (Object) var4).field_a <= 16384) {
                            break L4;
                          } else {
                            ((tj) (Object) var4).field_a = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((tj) (Object) var4).b(((tj) (Object) var4).field_a);
                          if (field_l <= 0) {
                            break L5;
                          } else {
                            if (field_c != null) {
                              break L5;
                            } else {
                              field_c = new aq();
                              field_c.field_c = param0;
                              ql discarded$2 = param0.a(field_l, (Runnable) (Object) field_c, (byte) -94);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_c == null) {
                            break L6;
                          } else {
                            if (field_c.field_d[param2] == null) {
                              field_c.field_d[param2] = (tj) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (pd) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new tj();
                    }
                    return (tj) (Object) stackIn_21_0;
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

    private final static void a(qd param0) {
        param0.field_j = false;
        if (param0.field_k != null) {
            param0.field_k.field_i = 0;
        }
        qd var1 = param0.a();
        while (var1 != null) {
            tj.a(var1);
            var1 = param0.d();
        }
    }

    void d() {
    }

    final synchronized void b(qd param0) {
        ((tj) this).field_e = param0;
    }

    void b(int param0) throws Exception {
    }

    final synchronized void f() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_c == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_c.field_a = true;
                  L2: while (true) {
                    if (!field_c.field_b) {
                      field_c = null;
                      break L0;
                    } else {
                      wj.a(-125, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_c.field_d[var2] != this) {
                    break L3;
                  } else {
                    field_c.field_d[var2] = null;
                    break L3;
                  }
                }
                if (field_c.field_d[var2] != null) {
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
        ((tj) this).d();
        ((tj) this).field_n = null;
        ((tj) this).field_d = true;
    }

    private final void a(int param0) {
        ((tj) this).field_i = ((tj) this).field_i - 256;
        if (((tj) this).field_i < 0) {
            ((tj) this).field_i = 0;
        }
        if (((tj) this).field_e != null) {
            ((tj) this).field_e.a(256);
            return;
        }
    }

    int a() throws Exception {
        return ((tj) this).field_a;
    }

    final synchronized void b() {
        try {
            ((tj) this).field_k = true;
            try {
                ((tj) this).h();
            } catch (Exception exception) {
                ((tj) this).d();
                ((tj) this).field_r = ue.a(false) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    tj() {
        ((tj) this).field_j = 32;
        ((tj) this).field_d = false;
        ((tj) this).field_m = ue.a(false);
        ((tj) this).field_r = 0L;
        ((tj) this).field_p = new qd[8];
        ((tj) this).field_b = 0L;
        ((tj) this).field_u = new qd[8];
        ((tj) this).field_i = 0;
        ((tj) this).field_f = 0;
        ((tj) this).field_k = true;
        ((tj) this).field_h = 0;
        ((tj) this).field_t = 0;
    }
}
