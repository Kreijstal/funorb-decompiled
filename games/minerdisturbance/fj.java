/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fj {
    private um field_k;
    private static j field_b;
    static int field_r;
    static boolean field_u;
    int[] field_s;
    private static int field_d;
    private boolean field_p;
    private long field_g;
    private int field_q;
    private int field_l;
    private um[] field_j;
    private int field_e;
    private int field_a;
    private long field_o;
    private boolean field_t;
    private int field_m;
    private int field_h;
    private int field_c;
    private long field_n;
    private int field_i;
    private um[] field_f;

    void g() {
    }

    public static void d() {
        field_b = null;
    }

    void h() throws Exception {
    }

    final synchronized void f() {
        try {
            ((fj) this).field_t = true;
            try {
                ((fj) this).c();
            } catch (Exception exception) {
                ((fj) this).g();
                ((fj) this).field_o = sf.a((byte) 100) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    int b() throws Exception {
        return ((fj) this).field_l;
    }

    final synchronized void e() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((fj) this).field_p) {
              var1 = sf.a((byte) -55);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((fj) this).field_g + 6000L) {
                      break L1;
                    } else {
                      ((fj) this).field_g = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((fj) this).field_g + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((fj) this).field_g = ((fj) this).field_g + (long)(256000 / field_r);
                      var1 = sf.a((byte) 99);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((fj) this).field_g = var1;
                  break L3;
                }
              }
              if (((fj) this).field_s != null) {
                try {
                  L4: {
                    L5: {
                      if (((fj) this).field_o == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((fj) this).field_o) {
                          ((fj) this).b(((fj) this).field_l);
                          ((fj) this).field_o = 0L;
                          ((fj) this).field_t = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((fj) this).b();
                      if (((fj) this).field_h - var3_int <= ((fj) this).field_e) {
                        break L6;
                      } else {
                        ((fj) this).field_e = ((fj) this).field_h - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((fj) this).field_m + ((fj) this).field_i;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((fj) this).field_l) {
                        break L8;
                      } else {
                        L9: {
                          ((fj) this).field_l = ((fj) this).field_l + 1024;
                          if (((fj) this).field_l <= 16384) {
                            break L9;
                          } else {
                            ((fj) this).field_l = 16384;
                            break L9;
                          }
                        }
                        ((fj) this).g();
                        ((fj) this).b(((fj) this).field_l);
                        var3_int = 0;
                        ((fj) this).field_t = true;
                        if (var4 + 256 <= ((fj) this).field_l) {
                          break L8;
                        } else {
                          var4 = ((fj) this).field_l - 256;
                          ((fj) this).field_i = var4 - ((fj) this).field_m;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((fj) this).field_n) {
                            break L11;
                          } else {
                            L12: {
                              if (((fj) this).field_t) {
                                ((fj) this).field_t = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((fj) this).field_e != 0) {
                                    break L13;
                                  } else {
                                    if (((fj) this).field_a != 0) {
                                      break L13;
                                    } else {
                                      ((fj) this).g();
                                      ((fj) this).field_o = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((fj) this).field_i = Math.min(((fj) this).field_a, ((fj) this).field_e);
                                ((fj) this).field_a = ((fj) this).field_e;
                                break L12;
                              }
                            }
                            ((fj) this).field_e = 0;
                            ((fj) this).field_n = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((fj) this).field_h = var3_int;
                        break L4;
                      } else {
                        this.a(((fj) this).field_s, 256);
                        ((fj) this).h();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((fj) this).g();
                    ((fj) this).field_o = var1 + 2000L;
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

    private final static void a(um param0) {
        param0.field_n = false;
        if (param0.field_q != null) {
            param0.field_q.field_n = 0;
        }
        um var1 = param0.b();
        while (var1 != null) {
            fj.a(var1);
            var1 = param0.c();
        }
    }

    final synchronized void a() {
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
                  field_b.field_b = true;
                  L2: while (true) {
                    if (!field_b.field_i) {
                      field_b = null;
                      break L0;
                    } else {
                      gf.a(50L, -10309);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_b.field_g[var2] != this) {
                    break L3;
                  } else {
                    field_b.field_g[var2] = null;
                    break L3;
                  }
                }
                if (field_b.field_g[var2] != null) {
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
        ((fj) this).g();
        ((fj) this).field_s = null;
        ((fj) this).field_p = true;
    }

    final static fj a(vf param0, java.awt.Component param1, int param2, int param3) {
        try {
            sm var4 = null;
            Throwable var4_ref = null;
            sm var5 = null;
            sm stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            sm stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            sm stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            sm stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            sm stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            sm stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            sm stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            sm stackOut_20_0 = null;
            if (field_r != 0) {
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
                          var5 = new sm();
                          var4 = var5;
                          stackOut_8_0 = (sm) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_u) {
                            stackOut_10_0 = (sm) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (sm) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((fj) (Object) stackIn_11_0).field_s = new int[stackIn_11_1 * stackIn_11_2];
                          ((fj) (Object) var4).field_m = param3;
                          ((fj) (Object) var4).a(param1);
                          ((fj) (Object) var4).field_l = (param3 & -1024) + 1024;
                          if (((fj) (Object) var4).field_l <= 16384) {
                            break L4;
                          } else {
                            ((fj) (Object) var4).field_l = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((fj) (Object) var4).b(((fj) (Object) var4).field_l);
                          if (field_d <= 0) {
                            break L5;
                          } else {
                            if (field_b != null) {
                              break L5;
                            } else {
                              field_b = new j();
                              field_b.field_c = param0;
                              ia discarded$2 = param0.a((Runnable) (Object) field_b, (byte) 18, field_d);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_b == null) {
                            break L6;
                          } else {
                            if (field_b.field_g[param2] == null) {
                              field_b.field_g[param2] = (fj) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (sm) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new fj();
                    }
                    return (fj) (Object) stackIn_21_0;
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
        um var7 = null;
        int var8_int = 0;
        um[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        um var11 = null;
        gg var12 = null;
        int var13 = 0;
        um var14 = null;
        um var15 = null;
        int var15_int = 0;
        L0: {
          var3 = 256;
          if (!field_u) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          ai.a(param0, 0, var3);
          ((fj) this).field_c = ((fj) this).field_c - 256;
          if (((fj) this).field_k == null) {
            break L1;
          } else {
            if (((fj) this).field_c > 0) {
              break L1;
            } else {
              ((fj) this).field_c = ((fj) this).field_c + (field_r >> 4);
              fj.a(((fj) this).field_k);
              this.a(((fj) this).field_k, ((fj) this).field_k.a());
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
                            var11 = ((fj) this).field_f[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_q;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_n <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_o;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_n = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_n = var12.field_n + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((fj) this).field_q) {
                                  L10: {
                                    var14 = var11.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_p;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.a() >> 8);
                                          var14 = var11.c();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_o;
                                    var11.field_o = null;
                                    if (var10 != null) {
                                      ((um) var10).field_o = var15;
                                      break L12;
                                    } else {
                                      ((fj) this).field_f[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((fj) this).field_j[var7_int] = (um) var10;
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
                    var7 = ((fj) this).field_f[var6];
                    var8 = ((fj) this).field_f;
                    var9 = var6;
                    ((fj) this).field_j[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_o;
                        var7.field_o = null;
                        var7 = (um) var10;
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
          if (((fj) this).field_c >= 0) {
            break L16;
          } else {
            ((fj) this).field_c = 0;
            break L16;
          }
        }
        L17: {
          if (((fj) this).field_k == null) {
            break L17;
          } else {
            ((fj) this).field_k.a(param0, 0, 256);
            break L17;
          }
        }
        ((fj) this).field_g = sf.a((byte) 107);
    }

    void b(int param0) throws Exception {
    }

    private final void a(int param0) {
        ((fj) this).field_c = ((fj) this).field_c - 256;
        if (((fj) this).field_c < 0) {
            ((fj) this).field_c = 0;
        }
        if (((fj) this).field_k != null) {
            ((fj) this).field_k.a(256);
            return;
        }
    }

    final synchronized void b(um param0) {
        ((fj) this).field_k = param0;
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
                field_r = param0;
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
              field_u = stackIn_7_0 != 0;
              field_d = 10;
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

    private final void a(um param0, int param1) {
        int var3 = param1 >> 5;
        um var4 = ((fj) this).field_j[var3];
        if (var4 == null) {
            ((fj) this).field_f[var3] = param0;
        } else {
            var4.field_o = param0;
        }
        ((fj) this).field_j[var3] = param0;
        param0.field_p = param1;
    }

    void c() throws Exception {
    }

    fj() {
        ((fj) this).field_p = false;
        ((fj) this).field_q = 32;
        ((fj) this).field_g = sf.a((byte) 114);
        ((fj) this).field_j = new um[8];
        ((fj) this).field_o = 0L;
        ((fj) this).field_e = 0;
        ((fj) this).field_t = true;
        ((fj) this).field_h = 0;
        ((fj) this).field_n = 0L;
        ((fj) this).field_a = 0;
        ((fj) this).field_c = 0;
        ((fj) this).field_f = new um[8];
    }
}
