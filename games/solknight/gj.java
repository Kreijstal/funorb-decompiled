/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gj {
    private boolean field_j;
    private static int field_d;
    private int field_q;
    private static sb field_p;
    private long field_e;
    static boolean field_u;
    private ej field_f;
    int[] field_a;
    static int field_s;
    private int field_t;
    private long field_k;
    private ej[] field_b;
    private long field_m;
    private boolean field_n;
    private int field_o;
    private ej[] field_r;
    private int field_l;
    private int field_g;
    private int field_h;
    private int field_i;
    private int field_c;

    public static void e() {
        field_p = null;
    }

    final static gj a(dl param0, java.awt.Component param1, int param2, int param3) {
        try {
            ca var4 = null;
            Throwable var4_ref = null;
            ca var5 = null;
            ca stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ca stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ca stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ca stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ca stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ca stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ca stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ca stackOut_20_0 = null;
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
                          var5 = new ca();
                          var4 = var5;
                          stackOut_8_0 = (ca) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_u) {
                            stackOut_10_0 = (ca) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (ca) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((gj) (Object) stackIn_11_0).field_a = new int[stackIn_11_1 * stackIn_11_2];
                          ((gj) (Object) var4).field_h = param3;
                          ((gj) (Object) var4).a(param1);
                          ((gj) (Object) var4).field_t = (param3 & -1024) + 1024;
                          if (((gj) (Object) var4).field_t <= 16384) {
                            break L4;
                          } else {
                            ((gj) (Object) var4).field_t = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((gj) (Object) var4).b(((gj) (Object) var4).field_t);
                          if (field_d <= 0) {
                            break L5;
                          } else {
                            if (field_p != null) {
                              break L5;
                            } else {
                              field_p = new sb();
                              field_p.field_b = param0;
                              nj discarded$2 = param0.a(field_d, -30, (Runnable) (Object) field_p);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_p == null) {
                            break L6;
                          } else {
                            if (field_p.field_a[param2] == null) {
                              field_p.field_a[param2] = (gj) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (ca) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new gj();
                    }
                    return (gj) (Object) stackIn_21_0;
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

    void f() throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        ej var7 = null;
        int var8_int = 0;
        ej[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        ej var11 = null;
        nl var12 = null;
        int var13 = 0;
        ej var14 = null;
        ej var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_u) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          fk.a(param0, 0, var3);
          ((gj) this).field_c = ((gj) this).field_c - param1;
          if (((gj) this).field_f == null) {
            break L1;
          } else {
            if (((gj) this).field_c > 0) {
              break L1;
            } else {
              ((gj) this).field_c = ((gj) this).field_c + (field_s >> 4);
              gj.b(((gj) this).field_f);
              this.a(((gj) this).field_f, ((gj) this).field_f.c());
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
                            var11 = ((gj) this).field_r[var7_int];
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
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_h = var12.field_h + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((gj) this).field_q) {
                                  L10: {
                                    var14 = var11.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_j;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11.b();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_i;
                                    var11.field_i = null;
                                    if (var10 != null) {
                                      ((ej) var10).field_i = var15;
                                      break L12;
                                    } else {
                                      ((gj) this).field_r[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((gj) this).field_b[var7_int] = (ej) var10;
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
                    var7 = ((gj) this).field_r[var6];
                    var8 = ((gj) this).field_r;
                    var9 = var6;
                    ((gj) this).field_b[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_i;
                        var7.field_i = null;
                        var7 = (ej) var10;
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
          if (((gj) this).field_c >= 0) {
            break L16;
          } else {
            ((gj) this).field_c = 0;
            break L16;
          }
        }
        L17: {
          if (((gj) this).field_f == null) {
            break L17;
          } else {
            ((gj) this).field_f.a(param0, 0, param1);
            break L17;
          }
        }
        ((gj) this).field_e = je.a(1);
    }

    final synchronized void a() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_p == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_p.field_e = true;
                  L2: while (true) {
                    if (!field_p.field_f) {
                      field_p = null;
                      break L0;
                    } else {
                      i.a((byte) 109, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_p.field_a[var2] != this) {
                    break L3;
                  } else {
                    field_p.field_a[var2] = null;
                    break L3;
                  }
                }
                if (field_p.field_a[var2] != null) {
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
        ((gj) this).c();
        ((gj) this).field_a = null;
        ((gj) this).field_j = true;
    }

    private final void a(int param0) {
        ((gj) this).field_c = ((gj) this).field_c - param0;
        if (((gj) this).field_c < 0) {
            ((gj) this).field_c = 0;
        }
        if (((gj) this).field_f != null) {
            ((gj) this).field_f.a(param0);
            return;
        }
    }

    void c() {
    }

    private final static void b(ej param0) {
        param0.field_k = false;
        if (param0.field_h != null) {
            param0.field_h.field_h = 0;
        }
        ej var1 = param0.a();
        while (var1 != null) {
            gj.b(var1);
            var1 = param0.b();
        }
    }

    void g() throws Exception {
    }

    int d() throws Exception {
        return ((gj) this).field_t;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void b(int param0) throws Exception {
    }

    final static void a(int param0, boolean param1) {
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

    final synchronized void h() {
        try {
            ((gj) this).field_n = true;
            try {
                ((gj) this).g();
            } catch (Exception exception) {
                ((gj) this).c();
                ((gj) this).field_k = je.a(1) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void a(ej param0) {
        ((gj) this).field_f = param0;
    }

    private final void a(ej param0, int param1) {
        int var3 = param1 >> 5;
        ej var4 = ((gj) this).field_b[var3];
        if (var4 == null) {
            ((gj) this).field_r[var3] = param0;
        } else {
            var4.field_i = param0;
        }
        ((gj) this).field_b[var3] = param0;
        param0.field_j = param1;
    }

    final synchronized void b() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((gj) this).field_j) {
              var1 = je.a(1);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((gj) this).field_e + 6000L) {
                      break L1;
                    } else {
                      ((gj) this).field_e = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((gj) this).field_e + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((gj) this).field_e = ((gj) this).field_e + (long)(256000 / field_s);
                      var1 = je.a(1);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((gj) this).field_e = var1;
                  break L3;
                }
              }
              if (((gj) this).field_a != null) {
                try {
                  L4: {
                    L5: {
                      if (((gj) this).field_k == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((gj) this).field_k) {
                          ((gj) this).b(((gj) this).field_t);
                          ((gj) this).field_k = 0L;
                          ((gj) this).field_n = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((gj) this).d();
                      if (((gj) this).field_o - var3_int <= ((gj) this).field_i) {
                        break L6;
                      } else {
                        ((gj) this).field_i = ((gj) this).field_o - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((gj) this).field_h + ((gj) this).field_l;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((gj) this).field_t) {
                        break L8;
                      } else {
                        L9: {
                          ((gj) this).field_t = ((gj) this).field_t + 1024;
                          if (((gj) this).field_t <= 16384) {
                            break L9;
                          } else {
                            ((gj) this).field_t = 16384;
                            break L9;
                          }
                        }
                        ((gj) this).c();
                        ((gj) this).b(((gj) this).field_t);
                        var3_int = 0;
                        ((gj) this).field_n = true;
                        if (var4 + 256 <= ((gj) this).field_t) {
                          break L8;
                        } else {
                          var4 = ((gj) this).field_t - 256;
                          ((gj) this).field_l = var4 - ((gj) this).field_h;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((gj) this).field_m) {
                            break L11;
                          } else {
                            L12: {
                              if (((gj) this).field_n) {
                                ((gj) this).field_n = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((gj) this).field_i != 0) {
                                    break L13;
                                  } else {
                                    if (((gj) this).field_g != 0) {
                                      break L13;
                                    } else {
                                      ((gj) this).c();
                                      ((gj) this).field_k = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((gj) this).field_l = Math.min(((gj) this).field_g, ((gj) this).field_i);
                                ((gj) this).field_g = ((gj) this).field_i;
                                break L12;
                              }
                            }
                            ((gj) this).field_i = 0;
                            ((gj) this).field_m = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((gj) this).field_o = var3_int;
                        break L4;
                      } else {
                        this.a(((gj) this).field_a, 256);
                        ((gj) this).f();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((gj) this).c();
                    ((gj) this).field_k = var1 + 2000L;
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

    gj() {
        ((gj) this).field_j = false;
        ((gj) this).field_q = 32;
        ((gj) this).field_e = je.a(1);
        ((gj) this).field_n = true;
        ((gj) this).field_m = 0L;
        ((gj) this).field_o = 0;
        ((gj) this).field_r = new ej[8];
        ((gj) this).field_k = 0L;
        ((gj) this).field_g = 0;
        ((gj) this).field_i = 0;
        ((gj) this).field_b = new ej[8];
        ((gj) this).field_c = 0;
    }
}
