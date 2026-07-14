/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mm {
    private sj field_a;
    private int field_u;
    static boolean field_o;
    private static ao field_b;
    static int field_h;
    private boolean field_j;
    private long field_f;
    private static int field_s;
    int[] field_d;
    private sj[] field_r;
    private int field_e;
    private sj[] field_n;
    private int field_l;
    private int field_k;
    private boolean field_g;
    private int field_t;
    private long field_i;
    private long field_c;
    private int field_q;
    private int field_p;
    private int field_m;

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        sj var7 = null;
        sj var7_ref = null;
        int var8_int = 0;
        sj[] var8 = null;
        int var9 = 0;
        sj var10 = null;
        sj var11 = null;
        sj var11_ref = null;
        tb var12 = null;
        int var13 = 0;
        sj var14 = null;
        sj var15 = null;
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
          qb.a(param0, 0, var3);
          ((mm) this).field_m = ((mm) this).field_m - param1;
          if (((mm) this).field_a == null) {
            break L1;
          } else {
            if (((mm) this).field_m > 0) {
              break L1;
            } else {
              ((mm) this).field_m = ((mm) this).field_m + (field_h >> 4);
              mm.a(((mm) this).field_a);
              this.a(((mm) this).field_a, ((mm) this).field_a.c());
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
                            var11 = ((mm) this).field_n[var7_int];
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
                                    if (var12.field_k <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11_ref = var11.field_l;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11_ref.field_n = true;
                                  var13 = var11_ref.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_k = var12.field_k + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((mm) this).field_u) {
                                  L10: {
                                    var14 = var11_ref.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_m;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11_ref.d();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11_ref.field_l;
                                    var11_ref.field_l = null;
                                    if (var10 != null) {
                                      var10.field_l = var15;
                                      break L12;
                                    } else {
                                      ((mm) this).field_n[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((mm) this).field_r[var7_int] = var10;
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
                    var7 = ((mm) this).field_n[var6];
                    var8 = ((mm) this).field_n;
                    var9 = var6;
                    ((mm) this).field_r[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_l;
                        var7.field_l = null;
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
          if (((mm) this).field_m >= 0) {
            break L16;
          } else {
            ((mm) this).field_m = 0;
            break L16;
          }
        }
        L17: {
          if (((mm) this).field_a == null) {
            break L17;
          } else {
            ((mm) this).field_a.b(param0, 0, param1);
            break L17;
          }
        }
        ((mm) this).field_f = hm.a(64);
    }

    void e() throws Exception {
    }

    void a(int param0) throws Exception {
    }

    private final void a(sj param0, int param1) {
        int var3 = param1 >> 5;
        sj var4 = ((mm) this).field_r[var3];
        if (var4 == null) {
            ((mm) this).field_n[var3] = param0;
        } else {
            var4.field_l = param0;
        }
        ((mm) this).field_r[var3] = param0;
        param0.field_m = param1;
    }

    final static mm a(cb param0, java.awt.Component param1, int param2, int param3) {
        try {
            je var4 = null;
            Throwable var4_ref = null;
            je var5 = null;
            je stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            je stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            je stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            je stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            je stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            je stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            je stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            je stackOut_20_0 = null;
            if (field_h != 0) {
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
                        var5 = new je();
                        var4 = var5;
                        stackOut_8_0 = (je) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_o) {
                          stackOut_10_0 = (je) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (je) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((mm) (Object) stackIn_11_0).field_d = new int[stackIn_11_1 * stackIn_11_2];
                        ((mm) (Object) var4).field_t = param3;
                        ((mm) (Object) var4).a(param1);
                        ((mm) (Object) var4).field_l = (param3 & -1024) + 1024;
                        if (((mm) (Object) var4).field_l <= 16384) {
                          break L3;
                        } else {
                          ((mm) (Object) var4).field_l = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((mm) (Object) var4).a(((mm) (Object) var4).field_l);
                        if (field_s <= 0) {
                          break L4;
                        } else {
                          if (field_b != null) {
                            break L4;
                          } else {
                            field_b = new ao();
                            field_b.field_g = param0;
                            ei discarded$2 = param0.a(field_s, (Runnable) (Object) field_b, (byte) -123);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_b == null) {
                          break L5;
                        } else {
                          if (field_b.field_h[param2] == null) {
                            field_b.field_h[param2] = (mm) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (je) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (mm) (Object) stackIn_21_0;
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

    int a() throws Exception {
        return ((mm) this).field_l;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void b() {
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
                        if (!((mm) this).field_j) {
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
                        var1 = hm.a(64);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((mm) this).field_f + 6000L) {
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
                            ((mm) this).field_f = var1 - 6000L;
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
                            if (var1 <= ((mm) this).field_f + 5000L) {
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
                            ((mm) this).field_f = ((mm) this).field_f + (long)(256000 / field_h);
                            var1 = hm.a(64);
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
                        ((mm) this).field_f = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((mm) this).field_d != null) {
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
                            if (((mm) this).field_i == 0L) {
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
                            if (var1 >= ((mm) this).field_i) {
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
                            ((mm) this).a(((mm) this).field_l);
                            ((mm) this).field_i = 0L;
                            ((mm) this).field_g = true;
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
                            var3_int = ((mm) this).a();
                            if (((mm) this).field_q - var3_int <= ((mm) this).field_p) {
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
                            ((mm) this).field_p = ((mm) this).field_q - var3_int;
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
                            var4 = ((mm) this).field_t + ((mm) this).field_e;
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
                            if (var4 + 256 <= ((mm) this).field_l) {
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
                            ((mm) this).field_l = ((mm) this).field_l + 1024;
                            if (((mm) this).field_l <= 16384) {
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
                            ((mm) this).field_l = 16384;
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
                            ((mm) this).c();
                            ((mm) this).a(((mm) this).field_l);
                            var3_int = 0;
                            ((mm) this).field_g = true;
                            if (var4 + 256 <= ((mm) this).field_l) {
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
                            var4 = ((mm) this).field_l - 256;
                            ((mm) this).field_e = var4 - ((mm) this).field_t;
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
                            this.a(((mm) this).field_d, 256);
                            ((mm) this).e();
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
                            if (var1 <= ((mm) this).field_c) {
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
                            if (((mm) this).field_g) {
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
                            if (((mm) this).field_p != 0) {
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
                            if (((mm) this).field_k != 0) {
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
                            ((mm) this).c();
                            ((mm) this).field_i = var1 + 2000L;
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
                            ((mm) this).field_e = Math.min(((mm) this).field_k, ((mm) this).field_p);
                            ((mm) this).field_k = ((mm) this).field_p;
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
                            ((mm) this).field_g = false;
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
                            ((mm) this).field_p = 0;
                            ((mm) this).field_c = var1 + 2000L;
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
                            ((mm) this).field_q = var3_int;
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
                        ((mm) this).c();
                        ((mm) this).field_i = var1 + 2000L;
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

    public static void d() {
        field_b = null;
    }

    void c() {
    }

    final synchronized void b(sj param0) {
        ((mm) this).field_a = param0;
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
                field_h = param0;
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
              field_s = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final synchronized void f() {
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
                  field_b.field_a = true;
                  L2: while (true) {
                    if (!field_b.field_f) {
                      field_b = null;
                      break L0;
                    } else {
                      vg.a(50L, (byte) 23);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_b.field_h[var2] != this) {
                    break L3;
                  } else {
                    field_b.field_h[var2] = null;
                    break L3;
                  }
                }
                if (field_b.field_h[var2] != null) {
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
        ((mm) this).c();
        ((mm) this).field_d = null;
        ((mm) this).field_j = true;
    }

    private final void b(int param0) {
        ((mm) this).field_m = ((mm) this).field_m - param0;
        if (((mm) this).field_m < 0) {
            ((mm) this).field_m = 0;
        }
        if (((mm) this).field_a != null) {
            ((mm) this).field_a.a(param0);
            return;
        }
    }

    private final static void a(sj param0) {
        param0.field_n = false;
        if (param0.field_k != null) {
            param0.field_k.field_k = 0;
        }
        sj var1 = param0.b();
        while (var1 != null) {
            mm.a(var1);
            var1 = param0.d();
        }
    }

    mm() {
        ((mm) this).field_u = 32;
        ((mm) this).field_j = false;
        ((mm) this).field_f = hm.a(64);
        ((mm) this).field_n = new sj[8];
        ((mm) this).field_k = 0;
        ((mm) this).field_g = true;
        ((mm) this).field_r = new sj[8];
        ((mm) this).field_c = 0L;
        ((mm) this).field_p = 0;
        ((mm) this).field_m = 0;
        ((mm) this).field_i = 0L;
        ((mm) this).field_q = 0;
    }
}
