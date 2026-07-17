/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lo {
    int[] field_q;
    private tj field_m;
    private static bf field_c;
    static boolean field_t;
    private static int field_f;
    private boolean field_p;
    private int field_s;
    private long field_h;
    static int field_l;
    private int field_d;
    private int field_u;
    private int field_b;
    private tj[] field_e;
    private int field_r;
    private tj[] field_n;
    private long field_i;
    private boolean field_j;
    private long field_o;
    private int field_a;
    private int field_g;
    private int field_k;

    void b(int param0) throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        tj var7 = null;
        int var8_int = 0;
        tj[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        tj var11 = null;
        eh var12 = null;
        int var13 = 0;
        tj var14 = null;
        tj var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_t) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          bc.a(param0, 0, var3);
          ((lo) this).field_b = ((lo) this).field_b - param1;
          if (((lo) this).field_m == null) {
            break L1;
          } else {
            if (((lo) this).field_b > 0) {
              break L1;
            } else {
              ((lo) this).field_b = ((lo) this).field_b + (field_l >> 4);
              lo.b(((lo) this).field_m);
              this.a(((lo) this).field_m, ((lo) this).field_m.d());
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
                            var11 = ((lo) this).field_n[var7_int];
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
                                    if (var12.field_i <= var8_int) {
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
                                    var12.field_i = var12.field_i + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((lo) this).field_s) {
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
                                      ((tj) var10).field_k = var15;
                                      break L12;
                                    } else {
                                      ((lo) this).field_n[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((lo) this).field_e[var7_int] = (tj) var10;
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
                    var7 = ((lo) this).field_n[var6];
                    var8 = ((lo) this).field_n;
                    var9 = var6;
                    ((lo) this).field_e[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_k;
                        var7.field_k = null;
                        var7 = (tj) var10;
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
          if (((lo) this).field_b >= 0) {
            break L16;
          } else {
            ((lo) this).field_b = 0;
            break L16;
          }
        }
        L17: {
          if (((lo) this).field_m == null) {
            break L17;
          } else {
            ((lo) this).field_m.b(param0, 0, param1);
            break L17;
          }
        }
        ((lo) this).field_h = bb.b(-1);
    }

    final synchronized void a() {
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
                  field_c.field_f = true;
                  L2: while (true) {
                    if (!field_c.field_e) {
                      field_c = null;
                      break L0;
                    } else {
                      int discarded$1 = 45;
                      qe.a(50L);
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
        ((lo) this).c();
        ((lo) this).field_q = null;
        ((lo) this).field_p = true;
    }

    void c() {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    private final static void b(tj param0) {
        param0.field_l = false;
        if (param0.field_i != null) {
            param0.field_i.field_i = 0;
        }
        tj var1 = param0.a();
        while (var1 != null) {
            lo.b(var1);
            var1 = param0.b();
        }
    }

    void b() throws Exception {
    }

    private final void a(int param0) {
        ((lo) this).field_b = ((lo) this).field_b - param0;
        if (((lo) this).field_b < 0) {
            ((lo) this).field_b = 0;
        }
        if (((lo) this).field_m != null) {
            ((lo) this).field_m.a(param0);
            return;
        }
    }

    public static void f() {
        field_c = null;
    }

    final static lo a(ib param0, java.awt.Component param1, int param2, int param3) {
        try {
            fa var4 = null;
            Throwable var4_ref = null;
            fa var5 = null;
            fa stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            fa stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            fa stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            fa stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            fa stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            fa stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            fa stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            fa stackOut_20_0 = null;
            if (field_l != 0) {
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
                          var5 = new fa();
                          var4 = var5;
                          stackOut_8_0 = (fa) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_t) {
                            stackOut_10_0 = (fa) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (fa) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((lo) (Object) stackIn_11_0).field_q = new int[stackIn_11_1 * stackIn_11_2];
                          ((lo) (Object) var4).field_r = param3;
                          ((lo) (Object) var4).a(param1);
                          ((lo) (Object) var4).field_k = (param3 & -1024) + 1024;
                          if (((lo) (Object) var4).field_k <= 16384) {
                            break L4;
                          } else {
                            ((lo) (Object) var4).field_k = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((lo) (Object) var4).b(((lo) (Object) var4).field_k);
                          if (field_f <= 0) {
                            break L5;
                          } else {
                            if (field_c != null) {
                              break L5;
                            } else {
                              field_c = new bf();
                              field_c.field_c = param0;
                              af discarded$2 = param0.a((byte) -28, field_f, (Runnable) (Object) field_c);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_c == null) {
                            break L6;
                          } else {
                            if (field_c.field_d[param2] == null) {
                              field_c.field_d[param2] = (lo) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (fa) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new lo();
                    }
                    return (lo) (Object) stackIn_21_0;
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

    final synchronized void a(tj param0) {
        ((lo) this).field_m = param0;
    }

    final static void a(int param0, boolean param1, int param2) {
        field_l = 22050;
        field_t = true;
        field_f = 10;
    }

    final synchronized void d() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((lo) this).field_p) {
              var1 = bb.b(-1);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((lo) this).field_h + 6000L) {
                      break L1;
                    } else {
                      ((lo) this).field_h = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((lo) this).field_h + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((lo) this).field_h = ((lo) this).field_h + (long)(256000 / field_l);
                      var1 = bb.b(-1);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((lo) this).field_h = var1;
                  break L3;
                }
              }
              if (((lo) this).field_q != null) {
                try {
                  L4: {
                    L5: {
                      if (((lo) this).field_o == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((lo) this).field_o) {
                          ((lo) this).b(((lo) this).field_k);
                          ((lo) this).field_o = 0L;
                          ((lo) this).field_j = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((lo) this).e();
                      if (((lo) this).field_u - var3_int <= ((lo) this).field_g) {
                        break L6;
                      } else {
                        ((lo) this).field_g = ((lo) this).field_u - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((lo) this).field_r + ((lo) this).field_a;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((lo) this).field_k) {
                        break L8;
                      } else {
                        L9: {
                          ((lo) this).field_k = ((lo) this).field_k + 1024;
                          if (((lo) this).field_k <= 16384) {
                            break L9;
                          } else {
                            ((lo) this).field_k = 16384;
                            break L9;
                          }
                        }
                        ((lo) this).c();
                        ((lo) this).b(((lo) this).field_k);
                        var3_int = 0;
                        ((lo) this).field_j = true;
                        if (var4 + 256 <= ((lo) this).field_k) {
                          break L8;
                        } else {
                          var4 = ((lo) this).field_k - 256;
                          ((lo) this).field_a = var4 - ((lo) this).field_r;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((lo) this).field_i) {
                            break L11;
                          } else {
                            L12: {
                              if (((lo) this).field_j) {
                                ((lo) this).field_j = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((lo) this).field_g != 0) {
                                    break L13;
                                  } else {
                                    if (((lo) this).field_d != 0) {
                                      break L13;
                                    } else {
                                      ((lo) this).c();
                                      ((lo) this).field_o = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((lo) this).field_a = Math.min(((lo) this).field_d, ((lo) this).field_g);
                                ((lo) this).field_d = ((lo) this).field_g;
                                break L12;
                              }
                            }
                            ((lo) this).field_g = 0;
                            ((lo) this).field_i = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((lo) this).field_u = var3_int;
                        break L4;
                      } else {
                        this.a(((lo) this).field_q, 256);
                        ((lo) this).b();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((lo) this).c();
                    ((lo) this).field_o = var1 + 2000L;
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

    int e() throws Exception {
        return ((lo) this).field_k;
    }

    private final void a(tj param0, int param1) {
        int var3 = param1 >> 5;
        tj var4 = ((lo) this).field_e[var3];
        if (var4 == null) {
            ((lo) this).field_n[var3] = param0;
        } else {
            var4.field_k = param0;
        }
        ((lo) this).field_e[var3] = param0;
        param0.field_j = param1;
    }

    lo() {
        ((lo) this).field_p = false;
        ((lo) this).field_s = 32;
        ((lo) this).field_h = bb.b(-1);
        ((lo) this).field_e = new tj[8];
        ((lo) this).field_d = 0;
        ((lo) this).field_u = 0;
        ((lo) this).field_i = 0L;
        ((lo) this).field_n = new tj[8];
        ((lo) this).field_g = 0;
        ((lo) this).field_b = 0;
        ((lo) this).field_j = true;
        ((lo) this).field_o = 0L;
    }
}
