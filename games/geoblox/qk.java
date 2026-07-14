/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qk {
    static boolean field_q;
    private static kh field_r;
    private long field_n;
    private boolean field_h;
    private int field_l;
    int[] field_c;
    private static int field_d;
    private ia field_k;
    static int field_j;
    private ia[] field_a;
    private int field_g;
    private int field_f;
    private long field_e;
    private int field_t;
    private boolean field_o;
    private long field_m;
    private int field_u;
    private ia[] field_b;
    private int field_p;
    private int field_s;
    private int field_i;

    void e() throws Exception {
    }

    final static qk a(d param0, java.awt.Component param1, int param2, int param3) {
        try {
            ce var4 = null;
            Throwable var4_ref = null;
            ce var5 = null;
            ce stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ce stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ce stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ce stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ce stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ce stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ce stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ce stackOut_20_0 = null;
            if (field_j != 0) {
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
                        var5 = new ce();
                        var4 = var5;
                        stackOut_8_0 = (ce) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_q) {
                          stackOut_10_0 = (ce) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (ce) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((qk) (Object) stackIn_11_0).field_c = new int[stackIn_11_1 * stackIn_11_2];
                        ((qk) (Object) var4).field_i = param3;
                        ((qk) (Object) var4).a(param1);
                        ((qk) (Object) var4).field_g = (param3 & -1024) + 1024;
                        if (((qk) (Object) var4).field_g <= 16384) {
                          break L3;
                        } else {
                          ((qk) (Object) var4).field_g = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((qk) (Object) var4).a(((qk) (Object) var4).field_g);
                        if (field_d <= 0) {
                          break L4;
                        } else {
                          if (field_r != null) {
                            break L4;
                          } else {
                            field_r = new kh();
                            field_r.field_b = param0;
                            cb discarded$2 = param0.a((Runnable) (Object) field_r, 0, field_d);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_r == null) {
                          break L5;
                        } else {
                          if (field_r.field_g[param2] == null) {
                            field_r.field_g[param2] = (qk) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (ce) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (qk) (Object) stackIn_21_0;
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

    final synchronized void a() {
        try {
            ((qk) this).field_o = true;
            try {
                ((qk) this).d();
            } catch (Exception exception) {
                ((qk) this).f();
                ((qk) this).field_m = oa.a(-12520) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(int param0) throws Exception {
    }

    final synchronized void c() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_r == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_r.field_f = true;
                  L2: while (true) {
                    if (!field_r.field_c) {
                      field_r = null;
                      break L0;
                    } else {
                      bc.a(0, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_r.field_g[var2] != this) {
                    break L3;
                  } else {
                    field_r.field_g[var2] = null;
                    break L3;
                  }
                }
                if (field_r.field_g[var2] != null) {
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
        ((qk) this).f();
        ((qk) this).field_c = null;
        ((qk) this).field_h = true;
    }

    final synchronized void b(ia param0) {
        ((qk) this).field_k = param0;
    }

    void d() throws Exception {
    }

    private final static void a(ia param0) {
        param0.field_f = false;
        if (param0.field_g != null) {
            param0.field_g.field_f = 0;
        }
        ia var1 = param0.b();
        while (var1 != null) {
            qk.a(var1);
            var1 = param0.c();
        }
    }

    public static void h() {
        field_r = null;
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
                field_j = param0;
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
              field_q = stackIn_7_0 != 0;
              field_d = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
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
                        if (!((qk) this).field_h) {
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
                        var1 = oa.a(-12520);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((qk) this).field_n + 6000L) {
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
                            ((qk) this).field_n = var1 - 6000L;
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
                            if (var1 <= ((qk) this).field_n + 5000L) {
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
                            ((qk) this).field_n = ((qk) this).field_n + (long)(256000 / field_j);
                            var1 = oa.a(-12520);
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
                        ((qk) this).field_n = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((qk) this).field_c != null) {
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
                            if (((qk) this).field_m == 0L) {
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
                            if (var1 >= ((qk) this).field_m) {
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
                            ((qk) this).a(((qk) this).field_g);
                            ((qk) this).field_m = 0L;
                            ((qk) this).field_o = true;
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
                            var3_int = ((qk) this).g();
                            if (((qk) this).field_t - var3_int <= ((qk) this).field_s) {
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
                            ((qk) this).field_s = ((qk) this).field_t - var3_int;
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
                            var4 = ((qk) this).field_i + ((qk) this).field_p;
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
                            if (var4 + 256 <= ((qk) this).field_g) {
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
                            ((qk) this).field_g = ((qk) this).field_g + 1024;
                            if (((qk) this).field_g <= 16384) {
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
                            ((qk) this).field_g = 16384;
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
                            ((qk) this).f();
                            ((qk) this).a(((qk) this).field_g);
                            var3_int = 0;
                            ((qk) this).field_o = true;
                            if (var4 + 256 <= ((qk) this).field_g) {
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
                            var4 = ((qk) this).field_g - 256;
                            ((qk) this).field_p = var4 - ((qk) this).field_i;
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
                            this.a(((qk) this).field_c, 256);
                            ((qk) this).e();
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
                            if (var1 <= ((qk) this).field_e) {
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
                            if (((qk) this).field_o) {
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
                            if (((qk) this).field_s != 0) {
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
                            if (((qk) this).field_f != 0) {
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
                            ((qk) this).f();
                            ((qk) this).field_m = var1 + 2000L;
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
                            ((qk) this).field_p = Math.min(((qk) this).field_f, ((qk) this).field_s);
                            ((qk) this).field_f = ((qk) this).field_s;
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
                            ((qk) this).field_o = false;
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
                            ((qk) this).field_s = 0;
                            ((qk) this).field_e = var1 + 2000L;
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
                            ((qk) this).field_t = var3_int;
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
                        ((qk) this).f();
                        ((qk) this).field_m = var1 + 2000L;
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

    private final void a(ia param0, int param1) {
        int var3 = param1 >> 5;
        ia var4 = ((qk) this).field_b[var3];
        if (var4 == null) {
            ((qk) this).field_a[var3] = param0;
        } else {
            var4.field_h = param0;
        }
        ((qk) this).field_b[var3] = param0;
        param0.field_i = param1;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        ia var7 = null;
        ia var7_ref = null;
        int var8_int = 0;
        ia[] var8 = null;
        int var9 = 0;
        ia var10 = null;
        ia var11 = null;
        ia var11_ref = null;
        e var12 = null;
        int var13 = 0;
        ia var14 = null;
        ia var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_q) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          sf.a(param0, 0, var3);
          ((qk) this).field_u = ((qk) this).field_u - param1;
          if (((qk) this).field_k == null) {
            break L1;
          } else {
            if (((qk) this).field_u > 0) {
              break L1;
            } else {
              ((qk) this).field_u = ((qk) this).field_u + (field_j >> 4);
              qk.a(((qk) this).field_k);
              this.a(((qk) this).field_k, ((qk) this).field_k.a());
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
                            var11 = ((qk) this).field_a[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_g;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_f <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11_ref = var11.field_h;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11_ref.field_f = true;
                                  var13 = var11_ref.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_f = var12.field_f + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((qk) this).field_l) {
                                  L10: {
                                    var14 = var11_ref.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_i;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.a() >> 8);
                                          var14 = var11_ref.c();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11_ref.field_h;
                                    var11_ref.field_h = null;
                                    if (var10 != null) {
                                      var10.field_h = var15;
                                      break L12;
                                    } else {
                                      ((qk) this).field_a[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((qk) this).field_b[var7_int] = var10;
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
                    var7 = ((qk) this).field_a[var6];
                    var8 = ((qk) this).field_a;
                    var9 = var6;
                    ((qk) this).field_b[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_h;
                        var7.field_h = null;
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
          if (((qk) this).field_u >= 0) {
            break L16;
          } else {
            ((qk) this).field_u = 0;
            break L16;
          }
        }
        L17: {
          if (((qk) this).field_k == null) {
            break L17;
          } else {
            ((qk) this).field_k.a(param0, 0, param1);
            break L17;
          }
        }
        ((qk) this).field_n = oa.a(-12520);
    }

    private final void b(int param0) {
        ((qk) this).field_u = ((qk) this).field_u - param0;
        if (((qk) this).field_u < 0) {
            ((qk) this).field_u = 0;
        }
        if (((qk) this).field_k != null) {
            ((qk) this).field_k.b(param0);
            return;
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    int g() throws Exception {
        return ((qk) this).field_g;
    }

    void f() {
    }

    qk() {
        ((qk) this).field_h = false;
        ((qk) this).field_l = 32;
        ((qk) this).field_n = oa.a(-12520);
        ((qk) this).field_o = true;
        ((qk) this).field_a = new ia[8];
        ((qk) this).field_t = 0;
        ((qk) this).field_e = 0L;
        ((qk) this).field_f = 0;
        ((qk) this).field_m = 0L;
        ((qk) this).field_s = 0;
        ((qk) this).field_u = 0;
        ((qk) this).field_b = new ia[8];
    }
}
