/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kh {
    private qd field_u;
    private boolean field_k;
    static int field_p;
    private static int field_i;
    private int field_l;
    private long field_h;
    int[] field_b;
    static boolean field_g;
    private static bb field_n;
    private int field_r;
    private int field_e;
    private qd[] field_f;
    private boolean field_a;
    private int field_c;
    private qd[] field_s;
    private int field_t;
    private long field_j;
    private int field_q;
    private long field_o;
    private int field_m;
    private int field_d;

    private final static void a(qd param0) {
        param0.field_j = false;
        if (param0.field_k != null) {
            param0.field_k.field_i = 0;
        }
        qd var1 = param0.c();
        while (var1 != null) {
            kh.a(var1);
            var1 = param0.b();
        }
    }

    void d() {
    }

    public static void a() {
        field_n = null;
    }

    final synchronized void g() {
        try {
            ((kh) this).field_a = true;
            try {
                ((kh) this).c();
            } catch (Exception exception) {
                ((kh) this).d();
                ((kh) this).field_o = ol.a(256) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    int e() throws Exception {
        return ((kh) this).field_t;
    }

    void c() throws Exception {
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
                field_p = param0;
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
              field_i = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final static kh a(uj param0, java.awt.Component param1, int param2, int param3) {
        try {
            sk var4 = null;
            Throwable var4_ref = null;
            sk var5 = null;
            sk stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            sk stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            sk stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            sk stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            sk stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            sk stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            sk stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            sk stackOut_20_0 = null;
            if (field_p != 0) {
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
                        var5 = new sk();
                        var4 = var5;
                        stackOut_8_0 = (sk) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_g) {
                          stackOut_10_0 = (sk) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (sk) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((kh) (Object) stackIn_11_0).field_b = new int[stackIn_11_1 * stackIn_11_2];
                        ((kh) (Object) var4).field_r = param3;
                        ((kh) (Object) var4).a(param1);
                        ((kh) (Object) var4).field_t = (param3 & -1024) + 1024;
                        if (((kh) (Object) var4).field_t <= 16384) {
                          break L3;
                        } else {
                          ((kh) (Object) var4).field_t = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((kh) (Object) var4).b(((kh) (Object) var4).field_t);
                        if (field_i <= 0) {
                          break L4;
                        } else {
                          if (field_n != null) {
                            break L4;
                          } else {
                            field_n = new bb();
                            field_n.field_b = param0;
                            mi discarded$2 = param0.a((Runnable) (Object) field_n, true, field_i);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_n == null) {
                          break L5;
                        } else {
                          if (field_n.field_a[param2] == null) {
                            field_n.field_a[param2] = (kh) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (sk) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (kh) (Object) stackIn_21_0;
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

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        qd var7 = null;
        qd var7_ref = null;
        int var8_int = 0;
        qd[] var8 = null;
        int var9 = 0;
        qd var10 = null;
        qd var11 = null;
        qd var11_ref = null;
        se var12 = null;
        int var13 = 0;
        qd var14 = null;
        qd var15 = null;
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
          he.a(param0, 0, var3);
          ((kh) this).field_e = ((kh) this).field_e - param1;
          if (((kh) this).field_u == null) {
            break L1;
          } else {
            if (((kh) this).field_e > 0) {
              break L1;
            } else {
              ((kh) this).field_e = ((kh) this).field_e + (field_p >> 4);
              kh.a(((kh) this).field_u);
              this.a(((kh) this).field_u, ((kh) this).field_u.d());
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
                            var11 = ((kh) this).field_f[var7_int];
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
                                    if (var12.field_i <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11_ref = var11.field_i;
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
                                if (var4 < ((kh) this).field_l) {
                                  L10: {
                                    var14 = var11_ref.c();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_l;
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
                                    var15 = var11_ref.field_i;
                                    var11_ref.field_i = null;
                                    if (var10 != null) {
                                      var10.field_i = var15;
                                      break L12;
                                    } else {
                                      ((kh) this).field_f[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((kh) this).field_s[var7_int] = var10;
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
                    var7 = ((kh) this).field_f[var6];
                    var8 = ((kh) this).field_f;
                    var9 = var6;
                    ((kh) this).field_s[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_i;
                        var7.field_i = null;
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
          if (((kh) this).field_e >= 0) {
            break L16;
          } else {
            ((kh) this).field_e = 0;
            break L16;
          }
        }
        L17: {
          if (((kh) this).field_u == null) {
            break L17;
          } else {
            ((kh) this).field_u.b(param0, 0, param1);
            break L17;
          }
        }
        ((kh) this).field_h = ol.a(256);
    }

    void f() throws Exception {
    }

    final synchronized void b(qd param0) {
        ((kh) this).field_u = param0;
    }

    final synchronized void b() {
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
                  field_n.field_e = true;
                  L2: while (true) {
                    if (!field_n.field_f) {
                      field_n = null;
                      break L0;
                    } else {
                      c.a(-105, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_n.field_a[var2] != this) {
                    break L3;
                  } else {
                    field_n.field_a[var2] = null;
                    break L3;
                  }
                }
                if (field_n.field_a[var2] != null) {
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
        ((kh) this).d();
        ((kh) this).field_b = null;
        ((kh) this).field_k = true;
    }

    private final void a(qd param0, int param1) {
        int var3 = param1 >> 5;
        qd var4 = ((kh) this).field_s[var3];
        if (var4 == null) {
            ((kh) this).field_f[var3] = param0;
        } else {
            var4.field_i = param0;
        }
        ((kh) this).field_s[var3] = param0;
        param0.field_l = param1;
    }

    void b(int param0) throws Exception {
    }

    private final void a(int param0) {
        ((kh) this).field_e = ((kh) this).field_e - param0;
        if (((kh) this).field_e < 0) {
            ((kh) this).field_e = 0;
        }
        if (((kh) this).field_u != null) {
            ((kh) this).field_u.a(param0);
            return;
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void h() {
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
                        if (!((kh) this).field_k) {
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
                        var1 = ol.a(256);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((kh) this).field_h + 6000L) {
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
                            ((kh) this).field_h = var1 - 6000L;
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
                            if (var1 <= ((kh) this).field_h + 5000L) {
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
                            ((kh) this).field_h = ((kh) this).field_h + (long)(256000 / field_p);
                            var1 = ol.a(256);
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
                        ((kh) this).field_h = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((kh) this).field_b != null) {
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
                            if (((kh) this).field_o == 0L) {
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
                            if (var1 >= ((kh) this).field_o) {
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
                            ((kh) this).b(((kh) this).field_t);
                            ((kh) this).field_o = 0L;
                            ((kh) this).field_a = true;
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
                            var3_int = ((kh) this).e();
                            if (((kh) this).field_m - var3_int <= ((kh) this).field_d) {
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
                            ((kh) this).field_d = ((kh) this).field_m - var3_int;
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
                            var4 = ((kh) this).field_r + ((kh) this).field_c;
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
                            if (var4 + 256 <= ((kh) this).field_t) {
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
                            ((kh) this).field_t = ((kh) this).field_t + 1024;
                            if (((kh) this).field_t <= 16384) {
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
                            ((kh) this).field_t = 16384;
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
                            ((kh) this).d();
                            ((kh) this).b(((kh) this).field_t);
                            var3_int = 0;
                            ((kh) this).field_a = true;
                            if (var4 + 256 <= ((kh) this).field_t) {
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
                            var4 = ((kh) this).field_t - 256;
                            ((kh) this).field_c = var4 - ((kh) this).field_r;
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
                            this.a(((kh) this).field_b, 256);
                            ((kh) this).f();
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
                            if (var1 <= ((kh) this).field_j) {
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
                            if (((kh) this).field_a) {
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
                            if (((kh) this).field_d != 0) {
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
                            if (((kh) this).field_q != 0) {
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
                            ((kh) this).d();
                            ((kh) this).field_o = var1 + 2000L;
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
                            ((kh) this).field_c = Math.min(((kh) this).field_q, ((kh) this).field_d);
                            ((kh) this).field_q = ((kh) this).field_d;
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
                            ((kh) this).field_a = false;
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
                            ((kh) this).field_d = 0;
                            ((kh) this).field_j = var1 + 2000L;
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
                            ((kh) this).field_m = var3_int;
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
                        ((kh) this).d();
                        ((kh) this).field_o = var1 + 2000L;
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

    kh() {
        ((kh) this).field_k = false;
        ((kh) this).field_l = 32;
        ((kh) this).field_h = ol.a(256);
        ((kh) this).field_a = true;
        ((kh) this).field_e = 0;
        ((kh) this).field_q = 0;
        ((kh) this).field_j = 0L;
        ((kh) this).field_o = 0L;
        ((kh) this).field_f = new qd[8];
        ((kh) this).field_s = new qd[8];
        ((kh) this).field_m = 0;
        ((kh) this).field_d = 0;
    }
}
