/*
 * Decompiled by CFR-JS 0.4.0.
 */
class la {
    static boolean field_h;
    private sh field_o;
    int[] field_i;
    private int field_c;
    private boolean field_u;
    private long field_t;
    private static ec field_n;
    private static int field_k;
    static int field_a;
    private boolean field_b;
    private int field_q;
    private int field_g;
    private int field_j;
    private int field_m;
    private long field_r;
    private int field_s;
    private int field_f;
    private sh[] field_d;
    private long field_p;
    private int field_l;
    private sh[] field_e;

    final synchronized void a() {
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
                        if (!((la) this).field_u) {
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
                        var1 = lj.a((byte) -51);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((la) this).field_t + 6000L) {
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
                            ((la) this).field_t = var1 - 6000L;
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
                            if (var1 <= ((la) this).field_t + 5000L) {
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
                            this.a(256);
                            ((la) this).field_t = ((la) this).field_t + (long)(256000 / field_a);
                            var1 = lj.a((byte) -98);
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
                        ((la) this).field_t = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((la) this).field_i != null) {
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
                            if (((la) this).field_r == 0L) {
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
                            if (var1 >= ((la) this).field_r) {
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
                            ((la) this).b(((la) this).field_l);
                            ((la) this).field_r = 0L;
                            ((la) this).field_b = true;
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
                            var3_int = ((la) this).h();
                            if (((la) this).field_g - var3_int <= ((la) this).field_s) {
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
                            ((la) this).field_s = ((la) this).field_g - var3_int;
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
                            var4 = ((la) this).field_f + ((la) this).field_q;
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
                            if (var4 + 256 <= ((la) this).field_l) {
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
                            ((la) this).field_l = ((la) this).field_l + 1024;
                            if (((la) this).field_l <= 16384) {
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
                            ((la) this).field_l = 16384;
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
                            ((la) this).c();
                            ((la) this).b(((la) this).field_l);
                            var3_int = 0;
                            ((la) this).field_b = true;
                            if (var4 + 256 <= ((la) this).field_l) {
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
                            var4 = ((la) this).field_l - 256;
                            ((la) this).field_q = var4 - ((la) this).field_f;
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
                            this.a(((la) this).field_i, 256);
                            ((la) this).f();
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
                            if (var1 <= ((la) this).field_p) {
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
                            if (((la) this).field_b) {
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
                            if (((la) this).field_s != 0) {
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
                            if (((la) this).field_j != 0) {
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
                            ((la) this).c();
                            ((la) this).field_r = var1 + 2000L;
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
                            ((la) this).field_q = Math.min(((la) this).field_j, ((la) this).field_s);
                            ((la) this).field_j = ((la) this).field_s;
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
                            ((la) this).field_b = false;
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
                            ((la) this).field_s = 0;
                            ((la) this).field_p = var1 + 2000L;
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
                            ((la) this).field_g = var3_int;
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
                        ((la) this).c();
                        ((la) this).field_r = var1 + 2000L;
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

    void b(int param0) throws Exception {
    }

    void c() {
    }

    final static la a(ce param0, java.awt.Component param1, int param2, int param3) {
        try {
            kg var4 = null;
            Throwable var4_ref = null;
            kg var5 = null;
            kg stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            kg stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            kg stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            kg stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            kg stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            kg stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            kg stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            kg stackOut_20_0 = null;
            if (field_a != 0) {
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
                        var5 = new kg();
                        var4 = var5;
                        stackOut_8_0 = (kg) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_h) {
                          stackOut_10_0 = (kg) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (kg) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((la) (Object) stackIn_11_0).field_i = new int[stackIn_11_1 * stackIn_11_2];
                        ((la) (Object) var4).field_f = param3;
                        ((la) (Object) var4).a(param1);
                        ((la) (Object) var4).field_l = (param3 & -1024) + 1024;
                        if (((la) (Object) var4).field_l <= 16384) {
                          break L3;
                        } else {
                          ((la) (Object) var4).field_l = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((la) (Object) var4).b(((la) (Object) var4).field_l);
                        if (field_k <= 0) {
                          break L4;
                        } else {
                          if (field_n != null) {
                            break L4;
                          } else {
                            field_n = new ec();
                            field_n.field_f = param0;
                            od discarded$2 = param0.a(4532, (Runnable) (Object) field_n, field_k);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_n == null) {
                          break L5;
                        } else {
                          if (field_n.field_c[param2] == null) {
                            field_n.field_c[param2] = (la) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (kg) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (la) (Object) stackIn_21_0;
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

    private final void a(sh param0, int param1) {
        int var3 = param1 >> 5;
        sh var4 = ((la) this).field_e[var3];
        if (var4 == null) {
            ((la) this).field_d[var3] = param0;
        } else {
            var4.field_l = param0;
        }
        ((la) this).field_e[var3] = param0;
        param0.field_k = param1;
    }

    int h() throws Exception {
        return ((la) this).field_l;
    }

    public static void b() {
        field_n = null;
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
                field_a = param0;
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
              field_k = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        sh var7 = null;
        sh var7_ref = null;
        int var8_int = 0;
        sh[] var8 = null;
        int var9 = 0;
        sh var10 = null;
        sh var11 = null;
        sh var11_ref = null;
        jf var12 = null;
        int var13 = 0;
        sh var14 = null;
        sh var15 = null;
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
          dm.a(param0, 0, var3);
          ((la) this).field_m = ((la) this).field_m - param1;
          if (((la) this).field_o == null) {
            break L1;
          } else {
            if (((la) this).field_m > 0) {
              break L1;
            } else {
              ((la) this).field_m = ((la) this).field_m + (field_a >> 4);
              la.a(((la) this).field_o);
              this.a(((la) this).field_o, ((la) this).field_o.b());
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
                            var11 = ((la) this).field_d[var7_int];
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
                                      var10 = var11;
                                      var11_ref = var11.field_l;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11_ref.field_j = true;
                                  var13 = var11_ref.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_i = var12.field_i + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((la) this).field_c) {
                                  L10: {
                                    var14 = var11_ref.d();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_k;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.b() >> 8);
                                          var14 = var11_ref.c();
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
                                      ((la) this).field_d[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((la) this).field_e[var7_int] = var10;
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
                    var7 = ((la) this).field_d[var6];
                    var8 = ((la) this).field_d;
                    var9 = var6;
                    ((la) this).field_e[var6] = null;
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
          if (((la) this).field_m >= 0) {
            break L16;
          } else {
            ((la) this).field_m = 0;
            break L16;
          }
        }
        L17: {
          if (((la) this).field_o == null) {
            break L17;
          } else {
            ((la) this).field_o.b(param0, 0, param1);
            break L17;
          }
        }
        ((la) this).field_t = lj.a((byte) -103);
    }

    final synchronized void d() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_n == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_n.field_g = true;
                  L2: while (true) {
                    if (!field_n.field_h) {
                      field_n = null;
                      break L0;
                    } else {
                      vh.a(50L, 73);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_n.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_n.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_n.field_c[var2] != null) {
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
        ((la) this).c();
        ((la) this).field_i = null;
        ((la) this).field_u = true;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    private final static void a(sh param0) {
        param0.field_j = false;
        if (param0.field_i != null) {
            param0.field_i.field_i = 0;
        }
        sh var1 = param0.d();
        while (var1 != null) {
            la.a(var1);
            var1 = param0.c();
        }
    }

    final synchronized void b(sh param0) {
        ((la) this).field_o = param0;
    }

    void e() throws Exception {
    }

    void f() throws Exception {
    }

    private final void a(int param0) {
        ((la) this).field_m = ((la) this).field_m - param0;
        if (((la) this).field_m < 0) {
            ((la) this).field_m = 0;
        }
        if (((la) this).field_o != null) {
            ((la) this).field_o.a(param0);
            return;
        }
    }

    final synchronized void g() {
        try {
            ((la) this).field_b = true;
            try {
                ((la) this).e();
            } catch (Exception exception) {
                ((la) this).c();
                ((la) this).field_r = lj.a((byte) -23) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    la() {
        ((la) this).field_c = 32;
        ((la) this).field_u = false;
        ((la) this).field_t = lj.a((byte) -104);
        ((la) this).field_j = 0;
        ((la) this).field_m = 0;
        ((la) this).field_g = 0;
        ((la) this).field_r = 0L;
        ((la) this).field_d = new sh[8];
        ((la) this).field_b = true;
        ((la) this).field_s = 0;
        ((la) this).field_e = new sh[8];
        ((la) this).field_p = 0L;
    }
}
