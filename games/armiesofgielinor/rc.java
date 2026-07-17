/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rc {
    private static rh field_l;
    private int field_i;
    static boolean field_q;
    private boolean field_u;
    static int field_d;
    private long field_t;
    int[] field_k;
    private static int field_h;
    private hn field_r;
    private int field_p;
    private int field_f;
    private long field_b;
    private int field_m;
    private hn[] field_e;
    private long field_g;
    private hn[] field_a;
    private int field_c;
    private int field_n;
    private int field_o;
    private boolean field_s;
    private int field_j;

    int h() throws Exception {
        return ((rc) this).field_o;
    }

    void b() throws Exception {
    }

    private final void a(int param0) {
        ((rc) this).field_n = ((rc) this).field_n - param0;
        if (((rc) this).field_n < 0) {
            ((rc) this).field_n = 0;
        }
        if (((rc) this).field_r != null) {
            ((rc) this).field_r.a(param0);
            return;
        }
    }

    private final void a(hn param0, int param1) {
        int var3 = param1 >> 5;
        hn var4 = ((rc) this).field_e[var3];
        if (var4 == null) {
            ((rc) this).field_a[var3] = param0;
        } else {
            var4.field_k = param0;
        }
        ((rc) this).field_e[var3] = param0;
        param0.field_n = param1;
    }

    void e() {
    }

    private final static void a(hn param0) {
        param0.field_l = false;
        if (param0.field_m != null) {
            param0.field_m.field_k = 0;
        }
        hn var1 = param0.a();
        while (var1 != null) {
            rc.a(var1);
            var1 = param0.b();
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void b(hn param0) {
        ((rc) this).field_r = param0;
    }

    final synchronized void f() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_l == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_l.field_f = true;
                  L2: while (true) {
                    if (!field_l.field_a) {
                      field_l = null;
                      break L0;
                    } else {
                      nu.a(50L, 0);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_l.field_d[var2] != this) {
                    break L3;
                  } else {
                    field_l.field_d[var2] = null;
                    break L3;
                  }
                }
                if (field_l.field_d[var2] != null) {
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
        ((rc) this).e();
        ((rc) this).field_k = null;
        ((rc) this).field_u = true;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        hn var7 = null;
        int var8_int = 0;
        hn[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        hn var11 = null;
        ow var12 = null;
        int var13 = 0;
        hn var14 = null;
        hn var15 = null;
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
          vm.a(param0, 0, var3);
          ((rc) this).field_n = ((rc) this).field_n - param1;
          if (((rc) this).field_r == null) {
            break L1;
          } else {
            if (((rc) this).field_n > 0) {
              break L1;
            } else {
              ((rc) this).field_n = ((rc) this).field_n + (field_d >> 4);
              rc.a(((rc) this).field_r);
              this.a(((rc) this).field_r, ((rc) this).field_r.d());
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
                            var11 = ((rc) this).field_a[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_m;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_k <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_k;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_l = true;
                                  var13 = var11.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_k = var12.field_k + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((rc) this).field_i) {
                                  L10: {
                                    var14 = var11.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_n;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.d() >> 8);
                                          var14 = var11.b();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_k;
                                    var11.field_k = null;
                                    if (var10 != null) {
                                      ((hn) var10).field_k = var15;
                                      break L12;
                                    } else {
                                      ((rc) this).field_a[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((rc) this).field_e[var7_int] = (hn) var10;
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
                    var7 = ((rc) this).field_a[var6];
                    var8 = ((rc) this).field_a;
                    var9 = var6;
                    ((rc) this).field_e[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_k;
                        var7.field_k = null;
                        var7 = (hn) var10;
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
          if (((rc) this).field_n >= 0) {
            break L16;
          } else {
            ((rc) this).field_n = 0;
            break L16;
          }
        }
        L17: {
          if (((rc) this).field_r == null) {
            break L17;
          } else {
            ((rc) this).field_r.b(param0, 0, param1);
            break L17;
          }
        }
        ((rc) this).field_t = vi.b(-121);
    }

    public static void g() {
        field_l = null;
    }

    final synchronized void c() {
        try {
            ((rc) this).field_s = true;
            try {
                ((rc) this).a();
            } catch (Exception exception) {
                ((rc) this).e();
                ((rc) this).field_g = vi.b(127) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a() throws Exception {
    }

    void b(int param0) throws Exception {
    }

    final static rc a(hd param0, java.awt.Component param1, int param2, int param3) {
        try {
            mr var4 = null;
            Throwable var4_ref = null;
            mr var5 = null;
            mr stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            mr stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            mr stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            mr stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            mr stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            mr stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            mr stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            mr stackOut_20_0 = null;
            if (field_d != 0) {
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
                          var5 = new mr();
                          var4 = var5;
                          stackOut_8_0 = (mr) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_q) {
                            stackOut_10_0 = (mr) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (mr) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((rc) (Object) stackIn_11_0).field_k = new int[stackIn_11_1 * stackIn_11_2];
                          ((rc) (Object) var4).field_m = param3;
                          ((rc) (Object) var4).a(param1);
                          ((rc) (Object) var4).field_o = (param3 & -1024) + 1024;
                          if (((rc) (Object) var4).field_o <= 16384) {
                            break L4;
                          } else {
                            ((rc) (Object) var4).field_o = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((rc) (Object) var4).b(((rc) (Object) var4).field_o);
                          if (field_h <= 0) {
                            break L5;
                          } else {
                            if (field_l != null) {
                              break L5;
                            } else {
                              field_l = new rh();
                              field_l.field_b = param0;
                              wo discarded$2 = param0.a(field_h, 0, (Runnable) (Object) field_l);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_l == null) {
                            break L6;
                          } else {
                            if (field_l.field_d[param2] == null) {
                              field_l.field_d[param2] = (rc) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (mr) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new rc();
                    }
                    return (rc) (Object) stackIn_21_0;
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
        field_d = 22050;
        field_q = true;
        field_h = 10;
    }

    final synchronized void d() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((rc) this).field_u) {
              var1 = vi.b(101);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((rc) this).field_t + 6000L) {
                      break L1;
                    } else {
                      ((rc) this).field_t = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((rc) this).field_t + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((rc) this).field_t = ((rc) this).field_t + (long)(256000 / field_d);
                      var1 = vi.b(-116);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((rc) this).field_t = var1;
                  break L3;
                }
              }
              if (((rc) this).field_k != null) {
                try {
                  L4: {
                    L5: {
                      if (((rc) this).field_g == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((rc) this).field_g) {
                          ((rc) this).b(((rc) this).field_o);
                          ((rc) this).field_g = 0L;
                          ((rc) this).field_s = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((rc) this).h();
                      if (((rc) this).field_f - var3_int <= ((rc) this).field_c) {
                        break L6;
                      } else {
                        ((rc) this).field_c = ((rc) this).field_f - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((rc) this).field_m + ((rc) this).field_p;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((rc) this).field_o) {
                        break L8;
                      } else {
                        L9: {
                          ((rc) this).field_o = ((rc) this).field_o + 1024;
                          if (((rc) this).field_o <= 16384) {
                            break L9;
                          } else {
                            ((rc) this).field_o = 16384;
                            break L9;
                          }
                        }
                        ((rc) this).e();
                        ((rc) this).b(((rc) this).field_o);
                        var3_int = 0;
                        ((rc) this).field_s = true;
                        if (var4 + 256 <= ((rc) this).field_o) {
                          break L8;
                        } else {
                          var4 = ((rc) this).field_o - 256;
                          ((rc) this).field_p = var4 - ((rc) this).field_m;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((rc) this).field_b) {
                            break L11;
                          } else {
                            L12: {
                              if (((rc) this).field_s) {
                                ((rc) this).field_s = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((rc) this).field_c != 0) {
                                    break L13;
                                  } else {
                                    if (((rc) this).field_j != 0) {
                                      break L13;
                                    } else {
                                      ((rc) this).e();
                                      ((rc) this).field_g = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((rc) this).field_p = Math.min(((rc) this).field_j, ((rc) this).field_c);
                                ((rc) this).field_j = ((rc) this).field_c;
                                break L12;
                              }
                            }
                            ((rc) this).field_c = 0;
                            ((rc) this).field_b = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((rc) this).field_f = var3_int;
                        break L4;
                      } else {
                        this.a(((rc) this).field_k, 256);
                        ((rc) this).b();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((rc) this).e();
                    ((rc) this).field_g = var1 + 2000L;
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

    rc() {
        ((rc) this).field_u = false;
        ((rc) this).field_i = 32;
        ((rc) this).field_t = vi.b(-89);
        ((rc) this).field_e = new hn[8];
        ((rc) this).field_g = 0L;
        ((rc) this).field_n = 0;
        ((rc) this).field_f = 0;
        ((rc) this).field_a = new hn[8];
        ((rc) this).field_c = 0;
        ((rc) this).field_b = 0L;
        ((rc) this).field_j = 0;
        ((rc) this).field_s = true;
    }
}
