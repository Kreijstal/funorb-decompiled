/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pi {
    int[] field_l;
    private int field_n;
    private long field_k;
    private boolean field_g;
    private static int field_o;
    static int field_c;
    private lf field_t;
    private int field_a;
    private int field_b;
    private int field_m;
    private lf[] field_i;
    private boolean field_h;
    static boolean field_r;
    private int field_q;
    private int field_s;
    private int field_e;
    private lf[] field_f;
    private long field_d;
    private static sa field_u;
    private int field_p;
    private long field_j;

    final synchronized void e() {
        try {
            ((pi) this).field_h = true;
            try {
                ((pi) this).g();
            } catch (Exception exception) {
                ((pi) this).h();
                ((pi) this).field_d = km.b(-1) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void h() {
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        lf var7 = null;
        lf var7_ref = null;
        int var8_int = 0;
        lf[] var8 = null;
        int var9 = 0;
        lf var10 = null;
        lf var11 = null;
        lf var11_ref = null;
        fb var12 = null;
        int var13 = 0;
        lf var14 = null;
        lf var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_r) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          dk.a(param0, 0, var3);
          ((pi) this).field_p = ((pi) this).field_p - param1;
          if (((pi) this).field_t == null) {
            break L1;
          } else {
            if (((pi) this).field_p > 0) {
              break L1;
            } else {
              ((pi) this).field_p = ((pi) this).field_p + (field_c >> 4);
              pi.b(((pi) this).field_t);
              this.a(((pi) this).field_t, ((pi) this).field_t.d());
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
                            var11 = ((pi) this).field_i[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_m;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_j <= var8_int) {
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
                                  var11_ref.field_k = true;
                                  var13 = var11_ref.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_j = var12.field_j + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((pi) this).field_n) {
                                  L10: {
                                    var14 = var11_ref.c();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_j;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.d() >> 8);
                                          var14 = var11_ref.b();
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
                                      ((pi) this).field_i[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((pi) this).field_f[var7_int] = var10;
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
                    var7 = ((pi) this).field_i[var6];
                    var8 = ((pi) this).field_i;
                    var9 = var6;
                    ((pi) this).field_f[var6] = null;
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
          if (((pi) this).field_p >= 0) {
            break L16;
          } else {
            ((pi) this).field_p = 0;
            break L16;
          }
        }
        L17: {
          if (((pi) this).field_t == null) {
            break L17;
          } else {
            ((pi) this).field_t.b(param0, 0, param1);
            break L17;
          }
        }
        ((pi) this).field_k = km.b(-1);
    }

    int a() throws Exception {
        return ((pi) this).field_e;
    }

    void a(int param0) throws Exception {
    }

    final static pi a(vh param0, java.awt.Component param1, int param2, int param3) {
        try {
            vj var4 = null;
            Throwable var4_ref = null;
            vj var5 = null;
            vj stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            vj stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            vj stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            vj stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            vj stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            vj stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            vj stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            vj stackOut_20_0 = null;
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
                        var5 = new vj();
                        var4 = var5;
                        stackOut_8_0 = (vj) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_r) {
                          stackOut_10_0 = (vj) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (vj) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((pi) (Object) stackIn_11_0).field_l = new int[stackIn_11_1 * stackIn_11_2];
                        ((pi) (Object) var4).field_b = param3;
                        ((pi) (Object) var4).a(param1);
                        ((pi) (Object) var4).field_e = (param3 & -1024) + 1024;
                        if (((pi) (Object) var4).field_e <= 16384) {
                          break L3;
                        } else {
                          ((pi) (Object) var4).field_e = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((pi) (Object) var4).a(((pi) (Object) var4).field_e);
                        if (field_o <= 0) {
                          break L4;
                        } else {
                          if (field_u != null) {
                            break L4;
                          } else {
                            field_u = new sa();
                            field_u.field_b = param0;
                            rc discarded$2 = param0.a((byte) -66, field_o, (Runnable) (Object) field_u);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_u == null) {
                          break L5;
                        } else {
                          if (field_u.field_c[param2] == null) {
                            field_u.field_c[param2] = (pi) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (vj) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (pi) (Object) stackIn_21_0;
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

    void c() throws Exception {
    }

    void g() throws Exception {
    }

    private final void a(lf param0, int param1) {
        int var3 = param1 >> 5;
        lf var4 = ((pi) this).field_f[var3];
        if (var4 == null) {
            ((pi) this).field_i[var3] = param0;
        } else {
            var4.field_l = param0;
        }
        ((pi) this).field_f[var3] = param0;
        param0.field_j = param1;
    }

    final synchronized void a(lf param0) {
        ((pi) this).field_t = param0;
    }

    public static void d() {
        field_u = null;
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
              field_r = stackIn_7_0 != 0;
              field_o = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    private final static void b(lf param0) {
        param0.field_k = false;
        if (param0.field_m != null) {
            param0.field_m.field_j = 0;
        }
        lf var1 = param0.c();
        while (var1 != null) {
            pi.b(var1);
            var1 = param0.b();
        }
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
                        if (!((pi) this).field_g) {
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
                        var1 = km.b(-1);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((pi) this).field_k + 6000L) {
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
                            ((pi) this).field_k = var1 - 6000L;
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
                            if (var1 <= ((pi) this).field_k + 5000L) {
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
                            ((pi) this).field_k = ((pi) this).field_k + (long)(256000 / field_c);
                            var1 = km.b(-1);
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
                        ((pi) this).field_k = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((pi) this).field_l != null) {
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
                            if (((pi) this).field_d == 0L) {
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
                            if (var1 >= ((pi) this).field_d) {
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
                            ((pi) this).a(((pi) this).field_e);
                            ((pi) this).field_d = 0L;
                            ((pi) this).field_h = true;
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
                            var3_int = ((pi) this).a();
                            if (((pi) this).field_a - var3_int <= ((pi) this).field_m) {
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
                            ((pi) this).field_m = ((pi) this).field_a - var3_int;
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
                            var4 = ((pi) this).field_b + ((pi) this).field_s;
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
                            if (var4 + 256 <= ((pi) this).field_e) {
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
                            ((pi) this).field_e = ((pi) this).field_e + 1024;
                            if (((pi) this).field_e <= 16384) {
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
                            ((pi) this).field_e = 16384;
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
                            ((pi) this).h();
                            ((pi) this).a(((pi) this).field_e);
                            var3_int = 0;
                            ((pi) this).field_h = true;
                            if (var4 + 256 <= ((pi) this).field_e) {
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
                            var4 = ((pi) this).field_e - 256;
                            ((pi) this).field_s = var4 - ((pi) this).field_b;
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
                            this.a(((pi) this).field_l, 256);
                            ((pi) this).c();
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
                            if (var1 <= ((pi) this).field_j) {
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
                            if (((pi) this).field_h) {
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
                            if (((pi) this).field_m != 0) {
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
                            if (((pi) this).field_q != 0) {
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
                            ((pi) this).h();
                            ((pi) this).field_d = var1 + 2000L;
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
                            ((pi) this).field_s = Math.min(((pi) this).field_q, ((pi) this).field_m);
                            ((pi) this).field_q = ((pi) this).field_m;
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
                            ((pi) this).field_h = false;
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
                            ((pi) this).field_m = 0;
                            ((pi) this).field_j = var1 + 2000L;
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
                            ((pi) this).field_a = var3_int;
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
                        ((pi) this).h();
                        ((pi) this).field_d = var1 + 2000L;
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

    private final void b(int param0) {
        ((pi) this).field_p = ((pi) this).field_p - param0;
        if (((pi) this).field_p < 0) {
            ((pi) this).field_p = 0;
        }
        if (((pi) this).field_t != null) {
            ((pi) this).field_t.a(param0);
            return;
        }
    }

    final synchronized void f() {
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
                  field_u.field_f = true;
                  L2: while (true) {
                    if (!field_u.field_e) {
                      field_u = null;
                      break L0;
                    } else {
                      ub.a(1976, 50L);
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
        ((pi) this).h();
        ((pi) this).field_l = null;
        ((pi) this).field_g = true;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    pi() {
        ((pi) this).field_n = 32;
        ((pi) this).field_g = false;
        ((pi) this).field_k = km.b(-1);
        ((pi) this).field_i = new lf[8];
        ((pi) this).field_a = 0;
        ((pi) this).field_q = 0;
        ((pi) this).field_h = true;
        ((pi) this).field_m = 0;
        ((pi) this).field_f = new lf[8];
        ((pi) this).field_p = 0;
        ((pi) this).field_d = 0L;
        ((pi) this).field_j = 0L;
    }
}
