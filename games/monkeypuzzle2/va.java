/*
 * Decompiled by CFR-JS 0.4.0.
 */
class va {
    int[] field_h;
    static boolean field_n;
    private boolean field_u;
    private static ff field_g;
    static int field_i;
    private static int field_a;
    private int field_t;
    private long field_d;
    private fh field_b;
    private int field_m;
    private int field_r;
    private fh[] field_p;
    private int field_c;
    private int field_j;
    private int field_k;
    private long field_e;
    private int field_q;
    private long field_o;
    private int field_l;
    private boolean field_s;
    private fh[] field_f;

    void f() {
    }

    void e() throws Exception {
    }

    final synchronized void b(fh param0) {
        ((va) this).field_b = param0;
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
                field_i = param0;
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
              field_n = stackIn_7_0 != 0;
              field_a = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    int a() throws Exception {
        return ((va) this).field_k;
    }

    private final void b(int param0) {
        ((va) this).field_j = ((va) this).field_j - param0;
        if (((va) this).field_j < 0) {
            ((va) this).field_j = 0;
        }
        if (((va) this).field_b != null) {
            ((va) this).field_b.a(param0);
            return;
        }
    }

    final synchronized void b() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_g == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_g.field_f = true;
                  L2: while (true) {
                    if (!field_g.field_d) {
                      field_g = null;
                      break L0;
                    } else {
                      em.a(50L, false);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_g.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_g.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_g.field_c[var2] != null) {
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
        ((va) this).f();
        ((va) this).field_h = null;
        ((va) this).field_u = true;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void a(int param0) throws Exception {
    }

    final static va a(md param0, java.awt.Component param1, int param2, int param3) {
        try {
            ij var4 = null;
            Throwable var4_ref = null;
            ij var5 = null;
            ij stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ij stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ij stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ij stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ij stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ij stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ij stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ij stackOut_20_0 = null;
            if (field_i != 0) {
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
                        var5 = new ij();
                        var4 = var5;
                        stackOut_8_0 = (ij) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_n) {
                          stackOut_10_0 = (ij) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (ij) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((va) (Object) stackIn_11_0).field_h = new int[stackIn_11_1 * stackIn_11_2];
                        ((va) (Object) var4).field_l = param3;
                        ((va) (Object) var4).a(param1);
                        ((va) (Object) var4).field_k = (param3 & -1024) + 1024;
                        if (((va) (Object) var4).field_k <= 16384) {
                          break L3;
                        } else {
                          ((va) (Object) var4).field_k = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((va) (Object) var4).a(((va) (Object) var4).field_k);
                        if (field_a <= 0) {
                          break L4;
                        } else {
                          if (field_g != null) {
                            break L4;
                          } else {
                            field_g = new ff();
                            field_g.field_b = param0;
                            ic discarded$2 = param0.a((Runnable) (Object) field_g, field_a, 0);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_g == null) {
                          break L5;
                        } else {
                          if (field_g.field_c[param2] == null) {
                            field_g.field_c[param2] = (va) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (ij) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (va) (Object) stackIn_21_0;
                    }
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

    private final void a(fh param0, int param1) {
        int var3 = param1 >> 5;
        fh var4 = ((va) this).field_p[var3];
        if (var4 == null) {
            ((va) this).field_f[var3] = param0;
        } else {
            var4.field_g = param0;
        }
        ((va) this).field_p[var3] = param0;
        param0.field_f = param1;
    }

    public static void d() {
        field_g = null;
    }

    private final static void a(fh param0) {
        param0.field_h = false;
        if (param0.field_e != null) {
            param0.field_e.field_e = 0;
        }
        fh var1 = param0.a();
        while (var1 != null) {
            va.a(var1);
            var1 = param0.b();
        }
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        fh var7 = null;
        fh var7_ref = null;
        int var8_int = 0;
        fh[] var8 = null;
        int var9 = 0;
        fh var10 = null;
        fh var11 = null;
        fh var11_ref = null;
        jl var12 = null;
        int var13 = 0;
        fh var14 = null;
        fh var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_n) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          gl.a(param0, 0, var3);
          ((va) this).field_j = ((va) this).field_j - param1;
          if (((va) this).field_b == null) {
            break L1;
          } else {
            if (((va) this).field_j > 0) {
              break L1;
            } else {
              ((va) this).field_j = ((va) this).field_j + (field_i >> 4);
              va.a(((va) this).field_b);
              this.a(((va) this).field_b, ((va) this).field_b.c());
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
                            var11 = ((va) this).field_f[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_e;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_e <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11_ref = var11.field_g;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11_ref.field_h = true;
                                  var13 = var11_ref.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_e = var12.field_e + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((va) this).field_t) {
                                  L10: {
                                    var14 = var11_ref.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_f;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11_ref.b();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11_ref.field_g;
                                    var11_ref.field_g = null;
                                    if (var10 != null) {
                                      var10.field_g = var15;
                                      break L12;
                                    } else {
                                      ((va) this).field_f[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((va) this).field_p[var7_int] = var10;
                                      break L13;
                                    }
                                  }
                                  var11_ref = var15;
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
                    var7 = ((va) this).field_f[var6];
                    var8 = ((va) this).field_f;
                    var9 = var6;
                    ((va) this).field_p[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_g;
                        var7.field_g = null;
                        var7_ref = var10;
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
          if (((va) this).field_j >= 0) {
            break L16;
          } else {
            ((va) this).field_j = 0;
            break L16;
          }
        }
        L17: {
          if (((va) this).field_b == null) {
            break L17;
          } else {
            ((va) this).field_b.b(param0, 0, param1);
            break L17;
          }
        }
        ((va) this).field_d = pf.a(0);
    }

    final synchronized void c() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (!((va) this).field_u) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        var1 = pf.a(0);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((va) this).field_d + 6000L) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((va) this).field_d = var1 - 6000L;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var1 <= ((va) this).field_d + 5000L) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.b(256);
                            ((va) this).field_d = ((va) this).field_d + (long)(256000 / field_i);
                            var1 = pf.a(0);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var3 = (Exception) (Object) caughtException;
                        ((va) this).field_d = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((va) this).field_h != null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            if (((va) this).field_o == 0L) {
                                statePc = 15;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var1 >= ((va) this).field_o) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return;
                    }
                    case 14: {
                        try {
                            ((va) this).a(((va) this).field_k);
                            ((va) this).field_o = 0L;
                            ((va) this).field_s = true;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var3_int = ((va) this).a();
                            if (((va) this).field_c - var3_int <= ((va) this).field_m) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((va) this).field_m = ((va) this).field_c - var3_int;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var4 = ((va) this).field_l + ((va) this).field_q;
                            if (var4 + 256 <= 16384) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var4 = 16128;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var4 + 256 <= ((va) this).field_k) {
                                statePc = 24;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((va) this).field_k = ((va) this).field_k + 1024;
                            if (((va) this).field_k <= 16384) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((va) this).field_k = 16384;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((va) this).f();
                            ((va) this).a(((va) this).field_k);
                            var3_int = 0;
                            ((va) this).field_s = true;
                            if (var4 + 256 <= ((va) this).field_k) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var4 = ((va) this).field_k - 256;
                            ((va) this).field_q = var4 - ((va) this).field_l;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var3_int >= var4) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            this.a(((va) this).field_h, 256);
                            ((va) this).e();
                            // wide iinc 3 256
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var1 <= ((va) this).field_e) {
                                statePc = 35;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (((va) this).field_s) {
                                statePc = 33;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (((va) this).field_m != 0) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (((va) this).field_r != 0) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((va) this).f();
                            ((va) this).field_o = var1 + 2000L;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        return;
                    }
                    case 32: {
                        try {
                            ((va) this).field_q = Math.min(((va) this).field_r, ((va) this).field_m);
                            ((va) this).field_r = ((va) this).field_m;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            ((va) this).field_s = false;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            ((va) this).field_m = 0;
                            ((va) this).field_e = var1 + 2000L;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            ((va) this).field_c = var3_int;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        var3 = (Exception) (Object) caughtException;
                        ((va) this).f();
                        ((va) this).field_o = var1 + 2000L;
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    va() {
        ((va) this).field_u = false;
        ((va) this).field_t = 32;
        ((va) this).field_d = pf.a(0);
        ((va) this).field_p = new fh[8];
        ((va) this).field_m = 0;
        ((va) this).field_r = 0;
        ((va) this).field_j = 0;
        ((va) this).field_c = 0;
        ((va) this).field_o = 0L;
        ((va) this).field_f = new fh[8];
        ((va) this).field_s = true;
        ((va) this).field_e = 0L;
    }
}
