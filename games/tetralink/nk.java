/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk {
    private boolean field_o;
    int[] field_c;
    static boolean field_s;
    static int field_k;
    private long field_i;
    private eb field_j;
    private static pg field_q;
    private static int field_n;
    private int field_h;
    private int field_m;
    private eb[] field_f;
    private eb[] field_d;
    private int field_u;
    private int field_e;
    private int field_t;
    private int field_a;
    private boolean field_g;
    private long field_l;
    private int field_p;
    private int field_r;
    private long field_b;

    final synchronized void c() {
        try {
            ((nk) this).field_g = true;
            try {
                ((nk) this).h();
            } catch (Exception exception) {
                ((nk) this).d();
                ((nk) this).field_b = k.a(0) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void f() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((nk) this).field_o) {
              var1 = k.a(0);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((nk) this).field_i + 6000L) {
                      break L1;
                    } else {
                      ((nk) this).field_i = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((nk) this).field_i + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((nk) this).field_i = ((nk) this).field_i + (long)(256000 / field_k);
                      var1 = k.a(0);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((nk) this).field_i = var1;
                  break L3;
                }
              }
              if (((nk) this).field_c != null) {
                try {
                  L4: {
                    L5: {
                      if (((nk) this).field_b == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((nk) this).field_b) {
                          ((nk) this).b(((nk) this).field_r);
                          ((nk) this).field_b = 0L;
                          ((nk) this).field_g = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((nk) this).a();
                      if (((nk) this).field_a - var3_int <= ((nk) this).field_t) {
                        break L6;
                      } else {
                        ((nk) this).field_t = ((nk) this).field_a - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((nk) this).field_p + ((nk) this).field_m;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((nk) this).field_r) {
                        break L8;
                      } else {
                        L9: {
                          ((nk) this).field_r = ((nk) this).field_r + 1024;
                          if (((nk) this).field_r <= 16384) {
                            break L9;
                          } else {
                            ((nk) this).field_r = 16384;
                            break L9;
                          }
                        }
                        ((nk) this).d();
                        ((nk) this).b(((nk) this).field_r);
                        var3_int = 0;
                        ((nk) this).field_g = true;
                        if (var4 + 256 <= ((nk) this).field_r) {
                          break L8;
                        } else {
                          var4 = ((nk) this).field_r - 256;
                          ((nk) this).field_m = var4 - ((nk) this).field_p;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((nk) this).field_l) {
                            break L11;
                          } else {
                            L12: {
                              if (((nk) this).field_g) {
                                ((nk) this).field_g = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((nk) this).field_t != 0) {
                                    break L13;
                                  } else {
                                    if (((nk) this).field_u != 0) {
                                      break L13;
                                    } else {
                                      ((nk) this).d();
                                      ((nk) this).field_b = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((nk) this).field_m = Math.min(((nk) this).field_u, ((nk) this).field_t);
                                ((nk) this).field_u = ((nk) this).field_t;
                                break L12;
                              }
                            }
                            ((nk) this).field_t = 0;
                            ((nk) this).field_l = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((nk) this).field_a = var3_int;
                        break L4;
                      } else {
                        this.a(((nk) this).field_c, 256);
                        ((nk) this).g();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((nk) this).d();
                    ((nk) this).field_b = var1 + 2000L;
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

    int a() throws Exception {
        return ((nk) this).field_r;
    }

    private final static void b(eb param0) {
        param0.field_q = false;
        if (param0.field_p != null) {
            param0.field_p.field_n = 0;
        }
        eb var1 = param0.b();
        while (var1 != null) {
            nk.b(var1);
            var1 = param0.c();
        }
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
                  field_q.field_g = true;
                  L2: while (true) {
                    if (!field_q.field_k) {
                      field_q = null;
                      break L0;
                    } else {
                      tb.a(false, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_q.field_l[var2] != this) {
                    break L3;
                  } else {
                    field_q.field_l[var2] = null;
                    break L3;
                  }
                }
                if (field_q.field_l[var2] != null) {
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
        ((nk) this).d();
        ((nk) this).field_c = null;
        ((nk) this).field_o = true;
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
                field_k = param0;
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
              field_s = stackIn_7_0 != 0;
              field_n = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    private final void a(eb param0, int param1) {
        int var3 = param1 >> 5;
        eb var4 = ((nk) this).field_f[var3];
        if (var4 == null) {
            ((nk) this).field_d[var3] = param0;
        } else {
            var4.field_n = param0;
        }
        ((nk) this).field_f[var3] = param0;
        param0.field_o = param1;
    }

    final synchronized void a(eb param0) {
        ((nk) this).field_j = param0;
    }

    final static nk a(ie param0, java.awt.Component param1, int param2, int param3) {
        try {
            vk var4 = null;
            Throwable var4_ref = null;
            vk var5 = null;
            vk stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            vk stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            vk stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            vk stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            vk stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            vk stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            vk stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            vk stackOut_20_0 = null;
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
                          var5 = new vk();
                          var4 = var5;
                          stackOut_8_0 = (vk) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_s) {
                            stackOut_10_0 = (vk) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (vk) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((nk) (Object) stackIn_11_0).field_c = new int[stackIn_11_1 * stackIn_11_2];
                          ((nk) (Object) var4).field_p = param3;
                          ((nk) (Object) var4).a(param1);
                          ((nk) (Object) var4).field_r = (param3 & -1024) + 1024;
                          if (((nk) (Object) var4).field_r <= 16384) {
                            break L4;
                          } else {
                            ((nk) (Object) var4).field_r = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((nk) (Object) var4).b(((nk) (Object) var4).field_r);
                          if (field_n <= 0) {
                            break L5;
                          } else {
                            if (field_q != null) {
                              break L5;
                            } else {
                              field_q = new pg();
                              field_q.field_j = param0;
                              vl discarded$2 = param0.a((Runnable) (Object) field_q, 105, field_n);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_q == null) {
                            break L6;
                          } else {
                            if (field_q.field_l[param2] == null) {
                              field_q.field_l[param2] = (nk) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (vk) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new nk();
                    }
                    return (nk) (Object) stackIn_21_0;
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

    void g() throws Exception {
    }

    void h() throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        eb var7 = null;
        int var8_int = 0;
        eb[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        eb var11 = null;
        ff var12 = null;
        int var13 = 0;
        eb var14 = null;
        eb var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_s) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          rd.a(param0, 0, var3);
          ((nk) this).field_e = ((nk) this).field_e - param1;
          if (((nk) this).field_j == null) {
            break L1;
          } else {
            if (((nk) this).field_e > 0) {
              break L1;
            } else {
              ((nk) this).field_e = ((nk) this).field_e + (field_k >> 4);
              nk.b(((nk) this).field_j);
              this.a(((nk) this).field_j, ((nk) this).field_j.d());
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
                            var11 = ((nk) this).field_d[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_p;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_n <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_n;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_q = true;
                                  var13 = var11.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_n = var12.field_n + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((nk) this).field_h) {
                                  L10: {
                                    var14 = var11.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_o;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.d() >> 8);
                                          var14 = var11.c();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_n;
                                    var11.field_n = null;
                                    if (var10 != null) {
                                      ((eb) var10).field_n = var15;
                                      break L12;
                                    } else {
                                      ((nk) this).field_d[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((nk) this).field_f[var7_int] = (eb) var10;
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
                    var7 = ((nk) this).field_d[var6];
                    var8 = ((nk) this).field_d;
                    var9 = var6;
                    ((nk) this).field_f[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_n;
                        var7.field_n = null;
                        var7 = (eb) var10;
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
          if (((nk) this).field_e >= 0) {
            break L16;
          } else {
            ((nk) this).field_e = 0;
            break L16;
          }
        }
        L17: {
          if (((nk) this).field_j == null) {
            break L17;
          } else {
            ((nk) this).field_j.b(param0, 0, param1);
            break L17;
          }
        }
        ((nk) this).field_i = k.a(0);
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void d() {
    }

    private final void a(int param0) {
        ((nk) this).field_e = ((nk) this).field_e - param0;
        if (((nk) this).field_e < 0) {
            ((nk) this).field_e = 0;
        }
        if (((nk) this).field_j != null) {
            ((nk) this).field_j.a(param0);
            return;
        }
    }

    void b(int param0) throws Exception {
    }

    public static void e() {
        field_q = null;
    }

    nk() {
        ((nk) this).field_o = false;
        ((nk) this).field_h = 32;
        ((nk) this).field_i = k.a(0);
        ((nk) this).field_d = new eb[8];
        ((nk) this).field_f = new eb[8];
        ((nk) this).field_u = 0;
        ((nk) this).field_e = 0;
        ((nk) this).field_a = 0;
        ((nk) this).field_g = true;
        ((nk) this).field_b = 0L;
        ((nk) this).field_t = 0;
        ((nk) this).field_l = 0L;
    }
}
