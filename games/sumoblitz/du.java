/*
 * Decompiled by CFR-JS 0.4.0.
 */
class du {
    private static pp field_i;
    int[] field_p;
    static boolean field_o;
    private int field_g;
    private static int field_m;
    private boolean field_f;
    static int field_k;
    private hj field_l;
    private long field_u;
    private hj[] field_t;
    private int field_r;
    private boolean field_e;
    private int field_h;
    private hj[] field_b;
    private int field_n;
    private int field_c;
    private int field_q;
    private int field_a;
    private long field_d;
    private long field_j;
    private int field_s;

    final synchronized void d() {
        try {
            ((du) this).field_e = true;
            try {
                ((du) this).f();
            } catch (Exception exception) {
                ((du) this).g();
                ((du) this).field_j = wq.a(-20) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static du a(wi param0, java.awt.Component param1, int param2, int param3) {
        try {
            et var4 = null;
            Throwable var4_ref = null;
            et var5 = null;
            et stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            et stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            et stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            et stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            et stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            et stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            et stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            et stackOut_20_0 = null;
            if (field_k != 0) {
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
                        var5 = new et();
                        var4 = var5;
                        stackOut_8_0 = (et) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_o) {
                          stackOut_10_0 = (et) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (et) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((du) (Object) stackIn_11_0).field_p = new int[stackIn_11_1 * stackIn_11_2];
                        ((du) (Object) var4).field_a = param3;
                        ((du) (Object) var4).a(param1);
                        ((du) (Object) var4).field_s = (param3 & -1024) + 1024;
                        if (((du) (Object) var4).field_s <= 16384) {
                          break L3;
                        } else {
                          ((du) (Object) var4).field_s = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((du) (Object) var4).a(((du) (Object) var4).field_s);
                        if (field_m <= 0) {
                          break L4;
                        } else {
                          if (field_i != null) {
                            break L4;
                          } else {
                            field_i = new pp();
                            field_i.field_g = param0;
                            jr discarded$2 = param0.a(true, (Runnable) (Object) field_i, field_m);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_i == null) {
                          break L5;
                        } else {
                          if (field_i.field_c[param2] == null) {
                            field_i.field_c[param2] = (du) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (et) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (du) (Object) stackIn_21_0;
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

    private final static void b(hj param0) {
        param0.field_n = false;
        if (param0.field_l != null) {
            param0.field_l.field_k = 0;
        }
        hj var1 = param0.a();
        while (var1 != null) {
            du.b(var1);
            var1 = param0.c();
        }
    }

    void c() throws Exception {
    }

    int a() throws Exception {
        return ((du) this).field_s;
    }

    final synchronized void a(hj param0) {
        ((du) this).field_l = param0;
    }

    final synchronized void e() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_i == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_i.field_a = true;
                  L2: while (true) {
                    if (!field_i.field_b) {
                      field_i = null;
                      break L0;
                    } else {
                      tg.a(50L, (byte) 112);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_i.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_i.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_i.field_c[var2] != null) {
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
        ((du) this).g();
        ((du) this).field_p = null;
        ((du) this).field_f = true;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        hj var7 = null;
        hj var7_ref = null;
        int var8_int = 0;
        hj[] var8 = null;
        int var9 = 0;
        hj var10 = null;
        hj var11 = null;
        hj var11_ref = null;
        rr var12 = null;
        int var13 = 0;
        hj var14 = null;
        hj var15 = null;
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
          la.a(param0, 0, var3);
          ((du) this).field_c = ((du) this).field_c - param1;
          if (((du) this).field_l == null) {
            break L1;
          } else {
            if (((du) this).field_c > 0) {
              break L1;
            } else {
              ((du) this).field_c = ((du) this).field_c + (field_k >> 4);
              du.b(((du) this).field_l);
              this.a(((du) this).field_l, ((du) this).field_l.b());
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
                            var11 = ((du) this).field_t[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_l;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_k <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11_ref = var11.field_m;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11_ref.field_n = true;
                                  var13 = var11_ref.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_k = var12.field_k + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((du) this).field_g) {
                                  L10: {
                                    var14 = var11_ref.a();
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
                                    var15 = var11_ref.field_m;
                                    var11_ref.field_m = null;
                                    if (var10 != null) {
                                      var10.field_m = var15;
                                      break L12;
                                    } else {
                                      ((du) this).field_t[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((du) this).field_b[var7_int] = var10;
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
                    var7 = ((du) this).field_t[var6];
                    var8 = ((du) this).field_t;
                    var9 = var6;
                    ((du) this).field_b[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_m;
                        var7.field_m = null;
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
          if (((du) this).field_c >= 0) {
            break L16;
          } else {
            ((du) this).field_c = 0;
            break L16;
          }
        }
        L17: {
          if (((du) this).field_l == null) {
            break L17;
          } else {
            ((du) this).field_l.b(param0, 0, param1);
            break L17;
          }
        }
        ((du) this).field_u = wq.a(-54);
    }

    private final void b(int param0) {
        ((du) this).field_c = ((du) this).field_c - param0;
        if (((du) this).field_c < 0) {
            ((du) this).field_c = 0;
        }
        if (((du) this).field_l != null) {
            ((du) this).field_l.a(param0);
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
                field_k = param0;
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
              field_m = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void f() throws Exception {
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
                        if (!((du) this).field_f) {
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
                        var1 = wq.a(-124);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((du) this).field_u + 6000L) {
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
                            ((du) this).field_u = var1 - 6000L;
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
                            if (var1 <= ((du) this).field_u + 5000L) {
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
                            ((du) this).field_u = ((du) this).field_u + (long)(256000 / field_k);
                            var1 = wq.a(-119);
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
                        ((du) this).field_u = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((du) this).field_p != null) {
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
                            if (((du) this).field_j == 0L) {
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
                            if (var1 >= ((du) this).field_j) {
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
                            ((du) this).a(((du) this).field_s);
                            ((du) this).field_j = 0L;
                            ((du) this).field_e = true;
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
                            var3_int = ((du) this).a();
                            if (((du) this).field_q - var3_int <= ((du) this).field_n) {
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
                            ((du) this).field_n = ((du) this).field_q - var3_int;
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
                            var4 = ((du) this).field_a + ((du) this).field_r;
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
                            if (var4 + 256 <= ((du) this).field_s) {
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
                            ((du) this).field_s = ((du) this).field_s + 1024;
                            if (((du) this).field_s <= 16384) {
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
                            ((du) this).field_s = 16384;
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
                            ((du) this).g();
                            ((du) this).a(((du) this).field_s);
                            var3_int = 0;
                            ((du) this).field_e = true;
                            if (var4 + 256 <= ((du) this).field_s) {
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
                            var4 = ((du) this).field_s - 256;
                            ((du) this).field_r = var4 - ((du) this).field_a;
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
                            this.a(((du) this).field_p, 256);
                            ((du) this).c();
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
                            if (var1 <= ((du) this).field_d) {
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
                            if (((du) this).field_e) {
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
                            if (((du) this).field_n != 0) {
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
                            if (((du) this).field_h != 0) {
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
                            ((du) this).g();
                            ((du) this).field_j = var1 + 2000L;
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
                            ((du) this).field_r = Math.min(((du) this).field_h, ((du) this).field_n);
                            ((du) this).field_h = ((du) this).field_n;
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
                            ((du) this).field_e = false;
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
                            ((du) this).field_n = 0;
                            ((du) this).field_d = var1 + 2000L;
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
                            ((du) this).field_q = var3_int;
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
                        ((du) this).g();
                        ((du) this).field_j = var1 + 2000L;
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

    private final void a(hj param0, int param1) {
        int var3 = param1 >> 5;
        hj var4 = ((du) this).field_b[var3];
        if (var4 == null) {
            ((du) this).field_t[var3] = param0;
        } else {
            var4.field_m = param0;
        }
        ((du) this).field_b[var3] = param0;
        param0.field_k = param1;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void a(int param0) throws Exception {
    }

    public static void h() {
        field_i = null;
    }

    void g() {
    }

    du() {
        ((du) this).field_f = false;
        ((du) this).field_g = 32;
        ((du) this).field_u = wq.a(-12);
        ((du) this).field_e = true;
        ((du) this).field_t = new hj[8];
        ((du) this).field_h = 0;
        ((du) this).field_b = new hj[8];
        ((du) this).field_c = 0;
        ((du) this).field_n = 0;
        ((du) this).field_d = 0L;
        ((du) this).field_q = 0;
        ((du) this).field_j = 0L;
    }
}
