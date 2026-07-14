/*
 * Decompiled by CFR-JS 0.4.0.
 */
class la {
    private static oa field_u;
    int[] field_r;
    static int field_c;
    private static int field_l;
    private di field_n;
    static boolean field_g;
    private boolean field_j;
    private long field_t;
    private int field_b;
    private long field_o;
    private di[] field_e;
    private int field_q;
    private int field_i;
    private int field_h;
    private int field_d;
    private int field_a;
    private boolean field_f;
    private di[] field_s;
    private int field_k;
    private long field_p;
    private int field_m;

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
                        if (!((la) this).field_j) {
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
                        var1 = ji.b(124);
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
                            this.b(256);
                            ((la) this).field_t = ((la) this).field_t + (long)(256000 / field_c);
                            var1 = ji.b(-117);
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
                        if (((la) this).field_r != null) {
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
                            if (((la) this).field_p == 0L) {
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
                            if (var1 >= ((la) this).field_p) {
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
                            ((la) this).a(((la) this).field_a);
                            ((la) this).field_p = 0L;
                            ((la) this).field_f = true;
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
                            var3_int = ((la) this).f();
                            if (((la) this).field_i - var3_int <= ((la) this).field_q) {
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
                            ((la) this).field_q = ((la) this).field_i - var3_int;
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
                            var4 = ((la) this).field_d + ((la) this).field_k;
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
                            if (var4 + 256 <= ((la) this).field_a) {
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
                            ((la) this).field_a = ((la) this).field_a + 1024;
                            if (((la) this).field_a <= 16384) {
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
                            ((la) this).field_a = 16384;
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
                            ((la) this).b();
                            ((la) this).a(((la) this).field_a);
                            var3_int = 0;
                            ((la) this).field_f = true;
                            if (var4 + 256 <= ((la) this).field_a) {
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
                            var4 = ((la) this).field_a - 256;
                            ((la) this).field_k = var4 - ((la) this).field_d;
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
                            this.a(((la) this).field_r, 256);
                            ((la) this).d();
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
                            if (var1 <= ((la) this).field_o) {
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
                            if (((la) this).field_f) {
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
                            if (((la) this).field_q != 0) {
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
                            if (((la) this).field_h != 0) {
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
                            ((la) this).b();
                            ((la) this).field_p = var1 + 2000L;
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
                            ((la) this).field_k = Math.min(((la) this).field_h, ((la) this).field_q);
                            ((la) this).field_h = ((la) this).field_q;
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
                            ((la) this).field_f = false;
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
                            ((la) this).field_q = 0;
                            ((la) this).field_o = var1 + 2000L;
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
                            ((la) this).field_i = var3_int;
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
                        ((la) this).b();
                        ((la) this).field_p = var1 + 2000L;
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

    final synchronized void a(di param0) {
        ((la) this).field_n = param0;
    }

    final synchronized void c() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_u == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_u.field_h = true;
                  L2: while (true) {
                    if (!field_u.field_b) {
                      field_u = null;
                      break L0;
                    } else {
                      hb.a(50L, 121);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_u.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_u.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_u.field_c[var2] != null) {
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
        ((la) this).b();
        ((la) this).field_r = null;
        ((la) this).field_j = true;
    }

    void b() {
    }

    int f() throws Exception {
        return ((la) this).field_a;
    }

    void a(int param0) throws Exception {
    }

    void d() throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
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
                field_c = param0;
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
              field_g = stackIn_7_0 != 0;
              field_l = param2;
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
        di var7 = null;
        di var7_ref = null;
        int var8_int = 0;
        di[] var8 = null;
        int var9 = 0;
        di var10 = null;
        di var11 = null;
        di var11_ref = null;
        ng var12 = null;
        int var13 = 0;
        di var14 = null;
        di var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_g) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          mk.a(param0, 0, var3);
          ((la) this).field_m = ((la) this).field_m - param1;
          if (((la) this).field_n == null) {
            break L1;
          } else {
            if (((la) this).field_m > 0) {
              break L1;
            } else {
              ((la) this).field_m = ((la) this).field_m + (field_c >> 4);
              la.b(((la) this).field_n);
              this.a(((la) this).field_n, ((la) this).field_n.b());
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
                            var11 = ((la) this).field_e[var7_int];
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
                                      var10 = var11;
                                      var11_ref = var11.field_f;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11_ref.field_g = true;
                                  var13 = var11_ref.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_f = var12.field_f + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((la) this).field_b) {
                                  L10: {
                                    var14 = var11_ref.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_i;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.b() >> 8);
                                          var14 = var11_ref.d();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11_ref.field_f;
                                    var11_ref.field_f = null;
                                    if (var10 != null) {
                                      var10.field_f = var15;
                                      break L12;
                                    } else {
                                      ((la) this).field_e[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((la) this).field_s[var7_int] = var10;
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
                    var7 = ((la) this).field_e[var6];
                    var8 = ((la) this).field_e;
                    var9 = var6;
                    ((la) this).field_s[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_f;
                        var7.field_f = null;
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
          if (((la) this).field_n == null) {
            break L17;
          } else {
            ((la) this).field_n.b(param0, 0, param1);
            break L17;
          }
        }
        ((la) this).field_t = ji.b(109);
    }

    public static void e() {
        field_u = null;
    }

    private final static void b(di param0) {
        param0.field_g = false;
        if (param0.field_h != null) {
            param0.field_h.field_f = 0;
        }
        di var1 = param0.a();
        while (var1 != null) {
            la.b(var1);
            var1 = param0.d();
        }
    }

    private final void b(int param0) {
        ((la) this).field_m = ((la) this).field_m - param0;
        if (((la) this).field_m < 0) {
            ((la) this).field_m = 0;
        }
        if (((la) this).field_n != null) {
            ((la) this).field_n.c(param0);
            return;
        }
    }

    private final void a(di param0, int param1) {
        int var3 = param1 >> 5;
        di var4 = ((la) this).field_s[var3];
        if (var4 == null) {
            ((la) this).field_e[var3] = param0;
        } else {
            var4.field_f = param0;
        }
        ((la) this).field_s[var3] = param0;
        param0.field_i = param1;
    }

    final static la a(be param0, java.awt.Component param1, int param2, int param3) {
        try {
            ni var4 = null;
            Throwable var4_ref = null;
            ni var5 = null;
            ni stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ni stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ni stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ni stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ni stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ni stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ni stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ni stackOut_20_0 = null;
            if (field_c != 0) {
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
                        var5 = new ni();
                        var4 = var5;
                        stackOut_8_0 = (ni) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_g) {
                          stackOut_10_0 = (ni) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (ni) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((la) (Object) stackIn_11_0).field_r = new int[stackIn_11_1 * stackIn_11_2];
                        ((la) (Object) var4).field_d = param3;
                        ((la) (Object) var4).a(param1);
                        ((la) (Object) var4).field_a = (param3 & -1024) + 1024;
                        if (((la) (Object) var4).field_a <= 16384) {
                          break L3;
                        } else {
                          ((la) (Object) var4).field_a = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((la) (Object) var4).a(((la) (Object) var4).field_a);
                        if (field_l <= 0) {
                          break L4;
                        } else {
                          if (field_u != null) {
                            break L4;
                          } else {
                            field_u = new oa();
                            field_u.field_g = param0;
                            eb discarded$2 = param0.a(314572800, field_l, (Runnable) (Object) field_u);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_u == null) {
                          break L5;
                        } else {
                          if (field_u.field_c[param2] == null) {
                            field_u.field_c[param2] = (la) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (ni) var4;
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

    la() {
        ((la) this).field_j = false;
        ((la) this).field_b = 32;
        ((la) this).field_t = ji.b(124);
        ((la) this).field_o = 0L;
        ((la) this).field_h = 0;
        ((la) this).field_f = true;
        ((la) this).field_e = new di[8];
        ((la) this).field_i = 0;
        ((la) this).field_m = 0;
        ((la) this).field_p = 0L;
        ((la) this).field_s = new di[8];
        ((la) this).field_q = 0;
    }
}
