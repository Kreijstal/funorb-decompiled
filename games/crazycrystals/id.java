/*
 * Decompiled by CFR-JS 0.4.0.
 */
class id {
    private od field_h;
    static int field_m;
    private boolean field_n;
    static boolean field_o;
    private static int field_u;
    private int field_s;
    private static rp field_q;
    private long field_k;
    int[] field_d;
    private int field_j;
    private int field_b;
    private int field_i;
    private int field_f;
    private long field_t;
    private long field_g;
    private od[] field_l;
    private boolean field_e;
    private int field_r;
    private int field_p;
    private int field_c;
    private od[] field_a;

    int h() throws Exception {
        return ((id) this).field_f;
    }

    void f() {
    }

    final synchronized void c() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((id) this).field_n) {
              var1 = lo.a((byte) -46);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((id) this).field_k + 6000L) {
                      break L1;
                    } else {
                      ((id) this).field_k = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((id) this).field_k + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((id) this).field_k = ((id) this).field_k + (long)(256000 / field_m);
                      var1 = lo.a((byte) 119);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((id) this).field_k = var1;
                  break L3;
                }
              }
              if (((id) this).field_d != null) {
                try {
                  L4: {
                    L5: {
                      if (((id) this).field_g == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((id) this).field_g) {
                          ((id) this).b(((id) this).field_f);
                          ((id) this).field_g = 0L;
                          ((id) this).field_e = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((id) this).h();
                      if (((id) this).field_j - var3_int <= ((id) this).field_r) {
                        break L6;
                      } else {
                        ((id) this).field_r = ((id) this).field_j - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((id) this).field_i + ((id) this).field_b;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((id) this).field_f) {
                        break L8;
                      } else {
                        L9: {
                          ((id) this).field_f = ((id) this).field_f + 1024;
                          if (((id) this).field_f <= 16384) {
                            break L9;
                          } else {
                            ((id) this).field_f = 16384;
                            break L9;
                          }
                        }
                        ((id) this).f();
                        ((id) this).b(((id) this).field_f);
                        var3_int = 0;
                        ((id) this).field_e = true;
                        if (var4 + 256 <= ((id) this).field_f) {
                          break L8;
                        } else {
                          var4 = ((id) this).field_f - 256;
                          ((id) this).field_b = var4 - ((id) this).field_i;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((id) this).field_t) {
                            break L11;
                          } else {
                            L12: {
                              if (((id) this).field_e) {
                                ((id) this).field_e = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((id) this).field_r != 0) {
                                    break L13;
                                  } else {
                                    if (((id) this).field_c != 0) {
                                      break L13;
                                    } else {
                                      ((id) this).f();
                                      ((id) this).field_g = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((id) this).field_b = Math.min(((id) this).field_c, ((id) this).field_r);
                                ((id) this).field_c = ((id) this).field_r;
                                break L12;
                              }
                            }
                            ((id) this).field_r = 0;
                            ((id) this).field_t = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((id) this).field_j = var3_int;
                        break L4;
                      } else {
                        this.a(((id) this).field_d, 256);
                        ((id) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((id) this).f();
                    ((id) this).field_g = var1 + 2000L;
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
                  field_q.field_d = true;
                  L2: while (true) {
                    if (!field_q.field_b) {
                      field_q = null;
                      break L0;
                    } else {
                      fh.a(true, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_q.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_q.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_q.field_c[var2] != null) {
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
        ((id) this).f();
        ((id) this).field_d = null;
        ((id) this).field_n = true;
    }

    private final static void a(od param0) {
        param0.field_f = false;
        if (param0.field_h != null) {
            param0.field_h.field_f = 0;
        }
        od var1 = param0.d();
        while (var1 != null) {
            id.a(var1);
            var1 = param0.a();
        }
    }

    final synchronized void a() {
        try {
            ((id) this).field_e = true;
            try {
                ((id) this).g();
            } catch (Exception exception) {
                ((id) this).f();
                ((id) this).field_g = lo.a((byte) -29) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void e() throws Exception {
    }

    public static void b() {
        field_q = null;
    }

    private final void a(od param0, int param1) {
        int var3 = param1 >> 5;
        od var4 = ((id) this).field_a[var3];
        if (var4 == null) {
            ((id) this).field_l[var3] = param0;
        } else {
            var4.field_i = param0;
        }
        ((id) this).field_a[var3] = param0;
        param0.field_g = param1;
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
              field_o = stackIn_7_0 != 0;
              field_u = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void b(int param0) throws Exception {
    }

    final synchronized void b(od param0) {
        ((id) this).field_h = param0;
    }

    private final void a(int param0) {
        ((id) this).field_p = ((id) this).field_p - param0;
        if (((id) this).field_p < 0) {
            ((id) this).field_p = 0;
        }
        if (((id) this).field_h != null) {
            ((id) this).field_h.a(param0);
            return;
        }
    }

    void g() throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        od var7 = null;
        int var8_int = 0;
        od[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        od var11 = null;
        cg var12 = null;
        int var13 = 0;
        od var14 = null;
        od var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_o) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          eg.a(param0, 0, var3);
          ((id) this).field_p = ((id) this).field_p - param1;
          if (((id) this).field_h == null) {
            break L1;
          } else {
            if (((id) this).field_p > 0) {
              break L1;
            } else {
              ((id) this).field_p = ((id) this).field_p + (field_m >> 4);
              id.a(((id) this).field_h);
              this.a(((id) this).field_h, ((id) this).field_h.b());
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
                            var11 = ((id) this).field_l[var7_int];
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
                                      var11 = var11.field_i;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_f = true;
                                  var13 = var11.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_f = var12.field_f + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((id) this).field_s) {
                                  L10: {
                                    var14 = var11.d();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_g;
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
                                    var15 = var11.field_i;
                                    var11.field_i = null;
                                    if (var10 != null) {
                                      ((od) var10).field_i = var15;
                                      break L12;
                                    } else {
                                      ((id) this).field_l[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((id) this).field_a[var7_int] = (od) var10;
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
                    var7 = ((id) this).field_l[var6];
                    var8 = ((id) this).field_l;
                    var9 = var6;
                    ((id) this).field_a[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_i;
                        var7.field_i = null;
                        var7 = (od) var10;
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
          if (((id) this).field_p >= 0) {
            break L16;
          } else {
            ((id) this).field_p = 0;
            break L16;
          }
        }
        L17: {
          if (((id) this).field_h == null) {
            break L17;
          } else {
            ((id) this).field_h.a(param0, 0, param1);
            break L17;
          }
        }
        ((id) this).field_k = lo.a((byte) -90);
    }

    final static id a(un param0, java.awt.Component param1, int param2, int param3) {
        try {
            eo var4 = null;
            Throwable var4_ref = null;
            eo var5 = null;
            eo stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            eo stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            eo stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            eo stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            eo stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            eo stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            eo stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            eo stackOut_20_0 = null;
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
                          var5 = new eo();
                          var4 = var5;
                          stackOut_8_0 = (eo) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_o) {
                            stackOut_10_0 = (eo) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (eo) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((id) (Object) stackIn_11_0).field_d = new int[stackIn_11_1 * stackIn_11_2];
                          ((id) (Object) var4).field_i = param3;
                          ((id) (Object) var4).a(param1);
                          ((id) (Object) var4).field_f = (param3 & -1024) + 1024;
                          if (((id) (Object) var4).field_f <= 16384) {
                            break L4;
                          } else {
                            ((id) (Object) var4).field_f = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((id) (Object) var4).b(((id) (Object) var4).field_f);
                          if (field_u <= 0) {
                            break L5;
                          } else {
                            if (field_q != null) {
                              break L5;
                            } else {
                              field_q = new rp();
                              field_q.field_e = param0;
                              gb discarded$2 = param0.a((Runnable) (Object) field_q, 2, field_u);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_q == null) {
                            break L6;
                          } else {
                            if (field_q.field_c[param2] == null) {
                              field_q.field_c[param2] = (id) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (eo) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new id();
                    }
                    return (id) (Object) stackIn_21_0;
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

    id() {
        ((id) this).field_n = false;
        ((id) this).field_s = 32;
        ((id) this).field_k = lo.a((byte) 79);
        ((id) this).field_j = 0;
        ((id) this).field_a = new od[8];
        ((id) this).field_t = 0L;
        ((id) this).field_e = true;
        ((id) this).field_p = 0;
        ((id) this).field_c = 0;
        ((id) this).field_g = 0L;
        ((id) this).field_l = new od[8];
        ((id) this).field_r = 0;
    }
}
