/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uh {
    private int field_j;
    private boolean field_s;
    private long field_t;
    static boolean field_o;
    int[] field_k;
    static int field_i;
    private static cp field_d;
    private lq field_c;
    private static int field_h;
    private int field_m;
    private int field_u;
    private int field_r;
    private int field_l;
    private lq[] field_f;
    private long field_q;
    private long field_g;
    private int field_n;
    private boolean field_a;
    private int field_p;
    private lq[] field_b;
    private int field_e;

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        lq var7 = null;
        lq var7_ref = null;
        int var8_int = 0;
        lq[] var8 = null;
        int var9 = 0;
        lq var10 = null;
        lq var11 = null;
        lq var11_ref = null;
        dm var12 = null;
        int var13 = 0;
        lq var14 = null;
        lq var15 = null;
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
          dv.a(param0, 0, var3);
          ((uh) this).field_u = ((uh) this).field_u - param1;
          if (((uh) this).field_c == null) {
            break L1;
          } else {
            if (((uh) this).field_u > 0) {
              break L1;
            } else {
              ((uh) this).field_u = ((uh) this).field_u + (field_i >> 4);
              uh.b(((uh) this).field_c);
              this.a(((uh) this).field_c, ((uh) this).field_c.a());
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
                            var11 = ((uh) this).field_b[var7_int];
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
                                    if (var12.field_e <= var8_int) {
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
                                  var11_ref.field_e = true;
                                  var13 = var11_ref.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_e = var12.field_e + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((uh) this).field_j) {
                                  L10: {
                                    var14 = var11_ref.c();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_g;
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
                                    var15 = var11_ref.field_f;
                                    var11_ref.field_f = null;
                                    if (var10 != null) {
                                      var10.field_f = var15;
                                      break L12;
                                    } else {
                                      ((uh) this).field_b[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((uh) this).field_f[var7_int] = var10;
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
                    var7 = ((uh) this).field_b[var6];
                    var8 = ((uh) this).field_b;
                    var9 = var6;
                    ((uh) this).field_f[var6] = null;
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
          if (((uh) this).field_u >= 0) {
            break L16;
          } else {
            ((uh) this).field_u = 0;
            break L16;
          }
        }
        L17: {
          if (((uh) this).field_c == null) {
            break L17;
          } else {
            ((uh) this).field_c.a(param0, 0, param1);
            break L17;
          }
        }
        ((uh) this).field_t = nj.a(-96);
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
              field_o = stackIn_7_0 != 0;
              field_h = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final synchronized void a(lq param0) {
        ((uh) this).field_c = param0;
    }

    private final static void b(lq param0) {
        param0.field_e = false;
        if (param0.field_h != null) {
            param0.field_h.field_e = 0;
        }
        lq var1 = param0.c();
        while (var1 != null) {
            uh.b(var1);
            var1 = param0.b();
        }
    }

    final static uh a(bu param0, java.awt.Component param1, int param2, int param3) {
        try {
            a var4 = null;
            Throwable var4_ref = null;
            a var5 = null;
            a stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            a stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            a stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            a stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            a stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            a stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            a stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            a stackOut_20_0 = null;
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
                        var5 = new a();
                        var4 = var5;
                        stackOut_8_0 = (a) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_o) {
                          stackOut_10_0 = (a) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (a) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((uh) (Object) stackIn_11_0).field_k = new int[stackIn_11_1 * stackIn_11_2];
                        ((uh) (Object) var4).field_p = param3;
                        ((uh) (Object) var4).a(param1);
                        ((uh) (Object) var4).field_r = (param3 & -1024) + 1024;
                        if (((uh) (Object) var4).field_r <= 16384) {
                          break L3;
                        } else {
                          ((uh) (Object) var4).field_r = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((uh) (Object) var4).b(((uh) (Object) var4).field_r);
                        if (field_h <= 0) {
                          break L4;
                        } else {
                          if (field_d != null) {
                            break L4;
                          } else {
                            field_d = new cp();
                            field_d.field_f = param0;
                            wu discarded$2 = param0.a(field_h, (byte) 125, (Runnable) (Object) field_d);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_d == null) {
                          break L5;
                        } else {
                          if (field_d.field_b[param2] == null) {
                            field_d.field_b[param2] = (uh) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (a) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (uh) (Object) stackIn_21_0;
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

    private final void a(lq param0, int param1) {
        int var3 = param1 >> 5;
        lq var4 = ((uh) this).field_f[var3];
        if (var4 == null) {
            ((uh) this).field_b[var3] = param0;
        } else {
            var4.field_f = param0;
        }
        ((uh) this).field_f[var3] = param0;
        param0.field_g = param1;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void d() {
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
                        if (!((uh) this).field_s) {
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
                        var1 = nj.a(-92);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((uh) this).field_t + 6000L) {
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
                            ((uh) this).field_t = var1 - 6000L;
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
                            if (var1 <= ((uh) this).field_t + 5000L) {
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
                            ((uh) this).field_t = ((uh) this).field_t + (long)(256000 / field_i);
                            var1 = nj.a(109);
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
                        ((uh) this).field_t = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((uh) this).field_k != null) {
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
                            if (((uh) this).field_g == 0L) {
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
                            if (var1 >= ((uh) this).field_g) {
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
                            ((uh) this).b(((uh) this).field_r);
                            ((uh) this).field_g = 0L;
                            ((uh) this).field_a = true;
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
                            var3_int = ((uh) this).b();
                            if (((uh) this).field_e - var3_int <= ((uh) this).field_l) {
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
                            ((uh) this).field_l = ((uh) this).field_e - var3_int;
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
                            var4 = ((uh) this).field_p + ((uh) this).field_m;
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
                            if (var4 + 256 <= ((uh) this).field_r) {
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
                            ((uh) this).field_r = ((uh) this).field_r + 1024;
                            if (((uh) this).field_r <= 16384) {
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
                            ((uh) this).field_r = 16384;
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
                            ((uh) this).f();
                            ((uh) this).b(((uh) this).field_r);
                            var3_int = 0;
                            ((uh) this).field_a = true;
                            if (var4 + 256 <= ((uh) this).field_r) {
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
                            var4 = ((uh) this).field_r - 256;
                            ((uh) this).field_m = var4 - ((uh) this).field_p;
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
                            this.a(((uh) this).field_k, 256);
                            ((uh) this).e();
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
                            if (var1 <= ((uh) this).field_q) {
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
                            if (((uh) this).field_a) {
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
                            if (((uh) this).field_l != 0) {
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
                            if (((uh) this).field_n != 0) {
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
                            ((uh) this).f();
                            ((uh) this).field_g = var1 + 2000L;
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
                            ((uh) this).field_m = Math.min(((uh) this).field_n, ((uh) this).field_l);
                            ((uh) this).field_n = ((uh) this).field_l;
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
                            ((uh) this).field_a = false;
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
                            ((uh) this).field_l = 0;
                            ((uh) this).field_q = var1 + 2000L;
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
                            ((uh) this).field_e = var3_int;
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
                        ((uh) this).f();
                        ((uh) this).field_g = var1 + 2000L;
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

    private final void a(int param0) {
        ((uh) this).field_u = ((uh) this).field_u - param0;
        if (((uh) this).field_u < 0) {
            ((uh) this).field_u = 0;
        }
        if (((uh) this).field_c != null) {
            ((uh) this).field_c.a(param0);
            return;
        }
    }

    int b() throws Exception {
        return ((uh) this).field_r;
    }

    void e() throws Exception {
    }

    public static void a() {
        field_d = null;
    }

    void b(int param0) throws Exception {
    }

    void f() {
    }

    final synchronized void c() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_d == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_d.field_e = true;
                  L2: while (true) {
                    if (!field_d.field_c) {
                      field_d = null;
                      break L0;
                    } else {
                      aj.a(50L, 1);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_d.field_b[var2] != this) {
                    break L3;
                  } else {
                    field_d.field_b[var2] = null;
                    break L3;
                  }
                }
                if (field_d.field_b[var2] != null) {
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
        ((uh) this).f();
        ((uh) this).field_k = null;
        ((uh) this).field_s = true;
    }

    uh() {
        ((uh) this).field_s = false;
        ((uh) this).field_j = 32;
        ((uh) this).field_t = nj.a(24);
        ((uh) this).field_u = 0;
        ((uh) this).field_f = new lq[8];
        ((uh) this).field_g = 0L;
        ((uh) this).field_l = 0;
        ((uh) this).field_n = 0;
        ((uh) this).field_a = true;
        ((uh) this).field_q = 0L;
        ((uh) this).field_b = new lq[8];
        ((uh) this).field_e = 0;
    }
}
