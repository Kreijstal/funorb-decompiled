/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vka {
    private static mia field_e;
    private int field_g;
    private long field_k;
    private boolean field_a;
    private static int field_u;
    int[] field_b;
    private f field_m;
    private int field_o;
    private int field_l;
    private f[] field_j;
    private f[] field_i;
    private long field_f;
    private int field_h;
    private long field_t;
    static int field_s;
    private int field_n;
    private boolean field_q;
    private int field_c;
    private int field_d;
    static boolean field_r;
    private int field_p;

    public static void d() {
        field_e = null;
    }

    final static vka a(eab param0, java.awt.Component param1, int param2, int param3) {
        try {
            cob var4 = null;
            Throwable var4_ref = null;
            cob var5 = null;
            cob stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            cob stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            cob stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            cob stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            cob stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            cob stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            cob stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            cob stackOut_20_0 = null;
            if (field_s != 0) {
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
                          var5 = new cob();
                          var4 = var5;
                          stackOut_8_0 = (cob) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_r) {
                            stackOut_10_0 = (cob) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (cob) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((vka) (Object) stackIn_11_0).field_b = new int[stackIn_11_1 * stackIn_11_2];
                          ((vka) (Object) var4).field_p = param3;
                          ((vka) (Object) var4).a(param1);
                          ((vka) (Object) var4).field_o = (param3 & -1024) + 1024;
                          if (((vka) (Object) var4).field_o <= 16384) {
                            break L4;
                          } else {
                            ((vka) (Object) var4).field_o = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((vka) (Object) var4).a(((vka) (Object) var4).field_o);
                          if (field_u <= 0) {
                            break L5;
                          } else {
                            if (field_e != null) {
                              break L5;
                            } else {
                              field_e = new mia();
                              field_e.field_d = param0;
                              mob discarded$2 = param0.a(0, field_u, (Runnable) (Object) field_e);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_e == null) {
                            break L6;
                          } else {
                            if (field_e.field_b[param2] == null) {
                              field_e.field_b[param2] = (vka) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (cob) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new vka();
                    }
                    return (vka) (Object) stackIn_21_0;
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

    final synchronized void h() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((vka) this).field_a) {
              var1 = wt.a(false);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((vka) this).field_k + 6000L) {
                      break L1;
                    } else {
                      ((vka) this).field_k = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((vka) this).field_k + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((vka) this).field_k = ((vka) this).field_k + (long)(256000 / field_s);
                      var1 = wt.a(false);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((vka) this).field_k = var1;
                  break L3;
                }
              }
              if (((vka) this).field_b != null) {
                try {
                  L4: {
                    L5: {
                      if (((vka) this).field_f == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((vka) this).field_f) {
                          ((vka) this).a(((vka) this).field_o);
                          ((vka) this).field_f = 0L;
                          ((vka) this).field_q = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((vka) this).g();
                      if (((vka) this).field_d - var3_int <= ((vka) this).field_h) {
                        break L6;
                      } else {
                        ((vka) this).field_h = ((vka) this).field_d - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((vka) this).field_p + ((vka) this).field_c;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((vka) this).field_o) {
                        break L8;
                      } else {
                        L9: {
                          ((vka) this).field_o = ((vka) this).field_o + 1024;
                          if (((vka) this).field_o <= 16384) {
                            break L9;
                          } else {
                            ((vka) this).field_o = 16384;
                            break L9;
                          }
                        }
                        ((vka) this).c();
                        ((vka) this).a(((vka) this).field_o);
                        var3_int = 0;
                        ((vka) this).field_q = true;
                        if (var4 + 256 <= ((vka) this).field_o) {
                          break L8;
                        } else {
                          var4 = ((vka) this).field_o - 256;
                          ((vka) this).field_c = var4 - ((vka) this).field_p;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((vka) this).field_t) {
                            break L11;
                          } else {
                            L12: {
                              if (((vka) this).field_q) {
                                ((vka) this).field_q = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((vka) this).field_h != 0) {
                                    break L13;
                                  } else {
                                    if (((vka) this).field_n != 0) {
                                      break L13;
                                    } else {
                                      ((vka) this).c();
                                      ((vka) this).field_f = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((vka) this).field_c = Math.min(((vka) this).field_n, ((vka) this).field_h);
                                ((vka) this).field_n = ((vka) this).field_h;
                                break L12;
                              }
                            }
                            ((vka) this).field_h = 0;
                            ((vka) this).field_t = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((vka) this).field_d = var3_int;
                        break L4;
                      } else {
                        this.a(((vka) this).field_b, 256);
                        ((vka) this).a();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((vka) this).c();
                    ((vka) this).field_f = var1 + 2000L;
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

    private final void a(f param0, int param1) {
        int var3 = param1 >> 5;
        f var4 = ((vka) this).field_i[var3];
        if (var4 == null) {
            ((vka) this).field_j[var3] = param0;
        } else {
            var4.field_d = param0;
        }
        ((vka) this).field_i[var3] = param0;
        param0.field_f = param1;
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
                field_s = param0;
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
              field_r = stackIn_7_0 != 0;
              field_u = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final synchronized void a(f param0) {
        ((vka) this).field_m = param0;
    }

    void a(int param0) throws Exception {
    }

    final synchronized void f() {
        try {
            ((vka) this).field_q = true;
            try {
                ((vka) this).b();
            } catch (Exception exception) {
                ((vka) this).c();
                ((vka) this).field_f = wt.a(false) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void c() {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        f var7 = null;
        int var8_int = 0;
        f[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        f var11 = null;
        dl var12 = null;
        int var13 = 0;
        f var14 = null;
        f var15 = null;
        int var15_int = 0;
        L0: {
          var3 = 256;
          if (!field_r) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          cua.a(param0, 0, var3);
          ((vka) this).field_l = ((vka) this).field_l - 256;
          if (((vka) this).field_m == null) {
            break L1;
          } else {
            if (((vka) this).field_l > 0) {
              break L1;
            } else {
              ((vka) this).field_l = ((vka) this).field_l + (field_s >> 4);
              vka.b(((vka) this).field_m);
              this.a(((vka) this).field_m, ((vka) this).field_m.b());
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
                            var11 = ((vka) this).field_j[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_g;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_d <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_d;
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
                                    var12.field_d = var12.field_d + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((vka) this).field_g) {
                                  L10: {
                                    var14 = var11.c();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_f;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.b() >> 8);
                                          var14 = var11.a();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_d;
                                    var11.field_d = null;
                                    if (var10 != null) {
                                      ((f) var10).field_d = var15;
                                      break L12;
                                    } else {
                                      ((vka) this).field_j[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((vka) this).field_i[var7_int] = (f) var10;
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
                    var7 = ((vka) this).field_j[var6];
                    var8 = ((vka) this).field_j;
                    var9 = var6;
                    ((vka) this).field_i[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_d;
                        var7.field_d = null;
                        var7 = (f) var10;
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
          if (((vka) this).field_l >= 0) {
            break L16;
          } else {
            ((vka) this).field_l = 0;
            break L16;
          }
        }
        L17: {
          if (((vka) this).field_m == null) {
            break L17;
          } else {
            ((vka) this).field_m.a(param0, 0, 256);
            break L17;
          }
        }
        ((vka) this).field_k = wt.a(false);
    }

    void a() throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void e() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_e == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_e.field_e = true;
                  L2: while (true) {
                    if (!field_e.field_c) {
                      field_e = null;
                      break L0;
                    } else {
                      gdb.b(-109, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_e.field_b[var2] != this) {
                    break L3;
                  } else {
                    field_e.field_b[var2] = null;
                    break L3;
                  }
                }
                if (field_e.field_b[var2] != null) {
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
        ((vka) this).c();
        ((vka) this).field_b = null;
        ((vka) this).field_a = true;
    }

    void b() throws Exception {
    }

    private final void b(int param0) {
        ((vka) this).field_l = ((vka) this).field_l - 256;
        if (((vka) this).field_l < 0) {
            ((vka) this).field_l = 0;
        }
        if (((vka) this).field_m != null) {
            ((vka) this).field_m.a(256);
            return;
        }
    }

    private final static void b(f param0) {
        param0.field_e = false;
        if (param0.field_g != null) {
            param0.field_g.field_d = 0;
        }
        f var1 = param0.c();
        while (var1 != null) {
            vka.b(var1);
            var1 = param0.a();
        }
    }

    int g() throws Exception {
        return ((vka) this).field_o;
    }

    vka() {
        ((vka) this).field_a = false;
        ((vka) this).field_g = 32;
        ((vka) this).field_k = wt.a(false);
        ((vka) this).field_l = 0;
        ((vka) this).field_f = 0L;
        ((vka) this).field_h = 0;
        ((vka) this).field_i = new f[8];
        ((vka) this).field_n = 0;
        ((vka) this).field_t = 0L;
        ((vka) this).field_d = 0;
        ((vka) this).field_q = true;
        ((vka) this).field_j = new f[8];
    }
}
