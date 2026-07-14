/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ug {
    int[] field_u;
    private int field_h;
    private tj field_m;
    private static int field_q;
    private static ua field_j;
    static boolean field_b;
    private long field_l;
    private boolean field_s;
    private int field_c;
    private int field_d;
    static int field_g;
    private long field_p;
    private tj[] field_k;
    private long field_e;
    private int field_i;
    private int field_t;
    private int field_f;
    private int field_n;
    private int field_r;
    private boolean field_o;
    private tj[] field_a;

    void c() {
    }

    final synchronized void f() {
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
                        if (!((ug) this).field_s) {
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
                        var1 = hn.a((byte) 80);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((ug) this).field_l + 6000L) {
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
                            ((ug) this).field_l = var1 - 6000L;
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
                            if (var1 <= ((ug) this).field_l + 5000L) {
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
                            ((ug) this).field_l = ((ug) this).field_l + (long)(256000 / field_g);
                            var1 = hn.a((byte) 80);
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
                        ((ug) this).field_l = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((ug) this).field_u != null) {
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
                            if (((ug) this).field_p == 0L) {
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
                            if (var1 >= ((ug) this).field_p) {
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
                            ((ug) this).a(((ug) this).field_t);
                            ((ug) this).field_p = 0L;
                            ((ug) this).field_o = true;
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
                            var3_int = ((ug) this).d();
                            if (((ug) this).field_f - var3_int <= ((ug) this).field_c) {
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
                            ((ug) this).field_c = ((ug) this).field_f - var3_int;
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
                            var4 = ((ug) this).field_r + ((ug) this).field_i;
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
                            if (var4 + 256 <= ((ug) this).field_t) {
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
                            ((ug) this).field_t = ((ug) this).field_t + 1024;
                            if (((ug) this).field_t <= 16384) {
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
                            ((ug) this).field_t = 16384;
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
                            ((ug) this).c();
                            ((ug) this).a(((ug) this).field_t);
                            var3_int = 0;
                            ((ug) this).field_o = true;
                            if (var4 + 256 <= ((ug) this).field_t) {
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
                            var4 = ((ug) this).field_t - 256;
                            ((ug) this).field_i = var4 - ((ug) this).field_r;
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
                            this.a(((ug) this).field_u, 256);
                            ((ug) this).a();
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
                            if (var1 <= ((ug) this).field_e) {
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
                            if (((ug) this).field_o) {
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
                            if (((ug) this).field_c != 0) {
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
                            if (((ug) this).field_n != 0) {
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
                            ((ug) this).c();
                            ((ug) this).field_p = var1 + 2000L;
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
                            ((ug) this).field_i = Math.min(((ug) this).field_n, ((ug) this).field_c);
                            ((ug) this).field_n = ((ug) this).field_c;
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
                            ((ug) this).field_o = false;
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
                            ((ug) this).field_c = 0;
                            ((ug) this).field_e = var1 + 2000L;
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
                            ((ug) this).field_f = var3_int;
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
                        ((ug) this).c();
                        ((ug) this).field_p = var1 + 2000L;
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

    final static ug a(fd param0, java.awt.Component param1, int param2, int param3) {
        try {
            af var4 = null;
            Throwable var4_ref = null;
            af var5 = null;
            af stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            af stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            af stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            af stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            af stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            af stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            af stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            af stackOut_20_0 = null;
            if (field_g != 0) {
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
                        var5 = new af();
                        var4 = var5;
                        stackOut_8_0 = (af) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_b) {
                          stackOut_10_0 = (af) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (af) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((ug) (Object) stackIn_11_0).field_u = new int[stackIn_11_1 * stackIn_11_2];
                        ((ug) (Object) var4).field_r = param3;
                        ((ug) (Object) var4).a(param1);
                        ((ug) (Object) var4).field_t = (param3 & -1024) + 1024;
                        if (((ug) (Object) var4).field_t <= 16384) {
                          break L3;
                        } else {
                          ((ug) (Object) var4).field_t = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((ug) (Object) var4).a(((ug) (Object) var4).field_t);
                        if (field_q <= 0) {
                          break L4;
                        } else {
                          if (field_j != null) {
                            break L4;
                          } else {
                            field_j = new ua();
                            field_j.field_b = param0;
                            kk discarded$2 = param0.a(field_q, (Runnable) (Object) field_j, 84);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_j == null) {
                          break L5;
                        } else {
                          if (field_j.field_g[param2] == null) {
                            field_j.field_g[param2] = (ug) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (af) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (ug) (Object) stackIn_21_0;
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

    private final void a(tj param0, int param1) {
        int var3 = param1 >> 5;
        tj var4 = ((ug) this).field_a[var3];
        if (var4 == null) {
            ((ug) this).field_k[var3] = param0;
        } else {
            var4.field_k = param0;
        }
        ((ug) this).field_a[var3] = param0;
        param0.field_i = param1;
    }

    void a() throws Exception {
    }

    final synchronized void h() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_j == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_j.field_d = true;
                  L2: while (true) {
                    if (!field_j.field_e) {
                      field_j = null;
                      break L0;
                    } else {
                      vj.a(50L, (byte) -49);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_j.field_g[var2] != this) {
                    break L3;
                  } else {
                    field_j.field_g[var2] = null;
                    break L3;
                  }
                }
                if (field_j.field_g[var2] != null) {
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
        ((ug) this).c();
        ((ug) this).field_u = null;
        ((ug) this).field_s = true;
    }

    final synchronized void a(tj param0) {
        ((ug) this).field_m = param0;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        tj var7 = null;
        tj var7_ref = null;
        int var8_int = 0;
        tj[] var8 = null;
        int var9 = 0;
        tj var10 = null;
        tj var11 = null;
        tj var11_ref = null;
        ef var12 = null;
        int var13 = 0;
        tj var14 = null;
        tj var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_b) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          kf.a(param0, 0, var3);
          ((ug) this).field_d = ((ug) this).field_d - param1;
          if (((ug) this).field_m == null) {
            break L1;
          } else {
            if (((ug) this).field_d > 0) {
              break L1;
            } else {
              ((ug) this).field_d = ((ug) this).field_d + (field_g >> 4);
              ug.b(((ug) this).field_m);
              this.a(((ug) this).field_m, ((ug) this).field_m.a());
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
                            var11 = ((ug) this).field_k[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_j;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_h <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11_ref = var11.field_k;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11_ref.field_h = true;
                                  var13 = var11_ref.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_h = var12.field_h + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((ug) this).field_h) {
                                  L10: {
                                    var14 = var11_ref.d();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_i;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.a() >> 8);
                                          var14 = var11_ref.b();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11_ref.field_k;
                                    var11_ref.field_k = null;
                                    if (var10 != null) {
                                      var10.field_k = var15;
                                      break L12;
                                    } else {
                                      ((ug) this).field_k[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((ug) this).field_a[var7_int] = var10;
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
                    var7 = ((ug) this).field_k[var6];
                    var8 = ((ug) this).field_k;
                    var9 = var6;
                    ((ug) this).field_a[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_k;
                        var7.field_k = null;
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
          if (((ug) this).field_d >= 0) {
            break L16;
          } else {
            ((ug) this).field_d = 0;
            break L16;
          }
        }
        L17: {
          if (((ug) this).field_m == null) {
            break L17;
          } else {
            ((ug) this).field_m.b(param0, 0, param1);
            break L17;
          }
        }
        ((ug) this).field_l = hn.a((byte) 80);
    }

    public static void g() {
        field_j = null;
    }

    void a(int param0) throws Exception {
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
                field_g = param0;
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
              field_b = stackIn_7_0 != 0;
              field_q = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    int d() throws Exception {
        return ((ug) this).field_t;
    }

    private final void b(int param0) {
        ((ug) this).field_d = ((ug) this).field_d - param0;
        if (((ug) this).field_d < 0) {
            ((ug) this).field_d = 0;
        }
        if (((ug) this).field_m != null) {
            ((ug) this).field_m.c(param0);
            return;
        }
    }

    void b() throws Exception {
    }

    private final static void b(tj param0) {
        param0.field_h = false;
        if (param0.field_j != null) {
            param0.field_j.field_h = 0;
        }
        tj var1 = param0.d();
        while (var1 != null) {
            ug.b(var1);
            var1 = param0.b();
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void e() {
        try {
            ((ug) this).field_o = true;
            try {
                ((ug) this).b();
            } catch (Exception exception) {
                ((ug) this).c();
                ((ug) this).field_p = hn.a((byte) 80) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ug() {
        ((ug) this).field_h = 32;
        ((ug) this).field_s = false;
        ((ug) this).field_l = hn.a((byte) 80);
        ((ug) this).field_d = 0;
        ((ug) this).field_f = 0;
        ((ug) this).field_k = new tj[8];
        ((ug) this).field_o = true;
        ((ug) this).field_c = 0;
        ((ug) this).field_a = new tj[8];
        ((ug) this).field_n = 0;
        ((ug) this).field_p = 0L;
        ((ug) this).field_e = 0L;
    }
}
