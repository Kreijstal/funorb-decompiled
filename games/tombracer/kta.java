/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kta {
    private long field_n;
    private static ch field_p;
    static boolean field_h;
    private int field_l;
    private boolean field_g;
    int[] field_j;
    private static int field_q;
    static int field_d;
    private cg field_i;
    private int field_k;
    private int field_f;
    private int field_s;
    private long field_m;
    private int field_a;
    private int field_b;
    private int field_r;
    private cg[] field_u;
    private int field_t;
    private boolean field_o;
    private cg[] field_c;
    private long field_e;

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        cg var7 = null;
        cg var7_ref = null;
        int var8_int = 0;
        cg[] var8 = null;
        int var9 = 0;
        cg var10 = null;
        cg var11 = null;
        cg var11_ref = null;
        ud var12 = null;
        int var13 = 0;
        cg var14 = null;
        cg var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_h) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          lua.a(param0, 0, var3);
          ((kta) this).field_r = ((kta) this).field_r - param1;
          if (((kta) this).field_i == null) {
            break L1;
          } else {
            if (((kta) this).field_r > 0) {
              break L1;
            } else {
              ((kta) this).field_r = ((kta) this).field_r + (field_d >> 4);
              kta.a(((kta) this).field_i);
              this.a(((kta) this).field_i, ((kta) this).field_i.d());
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
                            var11 = ((kta) this).field_c[var7_int];
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
                                    if (var12.field_f <= var8_int) {
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
                                  var11_ref.field_f = true;
                                  var13 = var11_ref.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_f = var12.field_f + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((kta) this).field_l) {
                                  L10: {
                                    var14 = var11_ref.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_h;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.d() >> 8);
                                          var14 = var11_ref.c();
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
                                      ((kta) this).field_c[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((kta) this).field_u[var7_int] = var10;
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
                    var7 = ((kta) this).field_c[var6];
                    var8 = ((kta) this).field_c;
                    var9 = var6;
                    ((kta) this).field_u[var6] = null;
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
          if (((kta) this).field_r >= 0) {
            break L16;
          } else {
            ((kta) this).field_r = 0;
            break L16;
          }
        }
        L17: {
          if (((kta) this).field_i == null) {
            break L17;
          } else {
            ((kta) this).field_i.b(param0, 0, param1);
            break L17;
          }
        }
        ((kta) this).field_n = bva.b((byte) -107);
    }

    int e() throws Exception {
        return ((kta) this).field_s;
    }

    final static kta a(fia param0, java.awt.Component param1, int param2, int param3) {
        try {
            bu var4 = null;
            Throwable var4_ref = null;
            bu var5 = null;
            bu stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            bu stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            bu stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            bu stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            bu stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            bu stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            bu stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            bu stackOut_20_0 = null;
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
                        var5 = new bu();
                        var4 = var5;
                        stackOut_8_0 = (bu) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_h) {
                          stackOut_10_0 = (bu) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (bu) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((kta) (Object) stackIn_11_0).field_j = new int[stackIn_11_1 * stackIn_11_2];
                        ((kta) (Object) var4).field_t = param3;
                        ((kta) (Object) var4).a(param1);
                        ((kta) (Object) var4).field_s = (param3 & -1024) + 1024;
                        if (((kta) (Object) var4).field_s <= 16384) {
                          break L3;
                        } else {
                          ((kta) (Object) var4).field_s = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((kta) (Object) var4).a(((kta) (Object) var4).field_s);
                        if (field_q <= 0) {
                          break L4;
                        } else {
                          if (field_p != null) {
                            break L4;
                          } else {
                            field_p = new ch();
                            field_p.field_d = param0;
                            naa discarded$2 = param0.a((Runnable) (Object) field_p, 425, field_q);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_p == null) {
                          break L5;
                        } else {
                          if (field_p.field_c[param2] == null) {
                            field_p.field_c[param2] = (kta) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (bu) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (kta) (Object) stackIn_21_0;
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
                        if (!((kta) this).field_g) {
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
                        var1 = bva.b((byte) -107);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((kta) this).field_n + 6000L) {
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
                            ((kta) this).field_n = var1 - 6000L;
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
                            if (var1 <= ((kta) this).field_n + 5000L) {
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
                            ((kta) this).field_n = ((kta) this).field_n + (long)(256000 / field_d);
                            var1 = bva.b((byte) -107);
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
                        ((kta) this).field_n = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((kta) this).field_j != null) {
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
                            if (((kta) this).field_e == 0L) {
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
                            if (var1 >= ((kta) this).field_e) {
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
                            ((kta) this).a(((kta) this).field_s);
                            ((kta) this).field_e = 0L;
                            ((kta) this).field_o = true;
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
                            var3_int = ((kta) this).e();
                            if (((kta) this).field_f - var3_int <= ((kta) this).field_a) {
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
                            ((kta) this).field_a = ((kta) this).field_f - var3_int;
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
                            var4 = ((kta) this).field_t + ((kta) this).field_k;
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
                            if (var4 + 256 <= ((kta) this).field_s) {
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
                            ((kta) this).field_s = ((kta) this).field_s + 1024;
                            if (((kta) this).field_s <= 16384) {
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
                            ((kta) this).field_s = 16384;
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
                            ((kta) this).d();
                            ((kta) this).a(((kta) this).field_s);
                            var3_int = 0;
                            ((kta) this).field_o = true;
                            if (var4 + 256 <= ((kta) this).field_s) {
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
                            var4 = ((kta) this).field_s - 256;
                            ((kta) this).field_k = var4 - ((kta) this).field_t;
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
                            this.a(((kta) this).field_j, 256);
                            ((kta) this).f();
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
                            if (var1 <= ((kta) this).field_m) {
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
                            if (((kta) this).field_o) {
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
                            if (((kta) this).field_a != 0) {
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
                            if (((kta) this).field_b != 0) {
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
                            ((kta) this).d();
                            ((kta) this).field_e = var1 + 2000L;
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
                            ((kta) this).field_k = Math.min(((kta) this).field_b, ((kta) this).field_a);
                            ((kta) this).field_b = ((kta) this).field_a;
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
                            ((kta) this).field_o = false;
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
                            ((kta) this).field_a = 0;
                            ((kta) this).field_m = var1 + 2000L;
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
                            ((kta) this).field_f = var3_int;
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
                        ((kta) this).d();
                        ((kta) this).field_e = var1 + 2000L;
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

    private final void a(cg param0, int param1) {
        int var3 = param1 >> 5;
        cg var4 = ((kta) this).field_u[var3];
        if (var4 == null) {
            ((kta) this).field_c[var3] = param0;
        } else {
            var4.field_g = param0;
        }
        ((kta) this).field_u[var3] = param0;
        param0.field_h = param1;
    }

    private final static void a(cg param0) {
        param0.field_f = false;
        if (param0.field_i != null) {
            param0.field_i.field_f = 0;
        }
        cg var1 = param0.b();
        while (var1 != null) {
            kta.a(var1);
            var1 = param0.c();
        }
    }

    final synchronized void b(cg param0) {
        ((kta) this).field_i = param0;
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
                  field_p.field_a = true;
                  L2: while (true) {
                    if (!field_p.field_b) {
                      field_p = null;
                      break L0;
                    } else {
                      vja.a(0, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_p.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_p.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_p.field_c[var2] != null) {
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
        ((kta) this).d();
        ((kta) this).field_j = null;
        ((kta) this).field_g = true;
    }

    void a(int param0) throws Exception {
    }

    private final void b(int param0) {
        ((kta) this).field_r = ((kta) this).field_r - param0;
        if (((kta) this).field_r < 0) {
            ((kta) this).field_r = 0;
        }
        if (((kta) this).field_i != null) {
            ((kta) this).field_i.a(param0);
            return;
        }
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
                field_d = param0;
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
              field_h = stackIn_7_0 != 0;
              field_q = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    public static void b() {
        field_p = null;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void d() {
    }

    void f() throws Exception {
    }

    kta() {
        ((kta) this).field_l = 32;
        ((kta) this).field_g = false;
        ((kta) this).field_n = bva.b((byte) -107);
        ((kta) this).field_f = 0;
        ((kta) this).field_m = 0L;
        ((kta) this).field_u = new cg[8];
        ((kta) this).field_b = 0;
        ((kta) this).field_a = 0;
        ((kta) this).field_c = new cg[8];
        ((kta) this).field_e = 0L;
        ((kta) this).field_o = true;
        ((kta) this).field_r = 0;
    }
}
