/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rc {
    private static rh field_l;
    private int field_i;
    static boolean field_q;
    private boolean field_u;
    static int field_d;
    private long field_t;
    int[] field_k;
    private static int field_h;
    private hn field_r;
    private int field_p;
    private int field_f;
    private long field_b;
    private int field_m;
    private hn[] field_e;
    private long field_g;
    private hn[] field_a;
    private int field_c;
    private int field_n;
    private int field_o;
    private boolean field_s;
    private int field_j;

    int h() throws Exception {
        return ((rc) this).field_o;
    }

    void b() throws Exception {
    }

    private final void a(int param0) {
        ((rc) this).field_n = ((rc) this).field_n - param0;
        if (((rc) this).field_n < 0) {
            ((rc) this).field_n = 0;
        }
        if (((rc) this).field_r != null) {
            ((rc) this).field_r.a(param0);
            return;
        }
    }

    private final void a(hn param0, int param1) {
        int var3 = param1 >> 5;
        hn var4 = ((rc) this).field_e[var3];
        if (var4 == null) {
            ((rc) this).field_a[var3] = param0;
        } else {
            var4.field_k = param0;
        }
        ((rc) this).field_e[var3] = param0;
        param0.field_n = param1;
    }

    void e() {
    }

    private final static void a(hn param0) {
        param0.field_l = false;
        if (param0.field_m != null) {
            param0.field_m.field_k = 0;
        }
        hn var1 = param0.a();
        while (var1 != null) {
            rc.a(var1);
            var1 = param0.b();
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void b(hn param0) {
        ((rc) this).field_r = param0;
    }

    final synchronized void f() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_l == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_l.field_f = true;
                  L2: while (true) {
                    if (!field_l.field_a) {
                      field_l = null;
                      break L0;
                    } else {
                      nu.a(50L, 0);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_l.field_d[var2] != this) {
                    break L3;
                  } else {
                    field_l.field_d[var2] = null;
                    break L3;
                  }
                }
                if (field_l.field_d[var2] != null) {
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
        ((rc) this).e();
        ((rc) this).field_k = null;
        ((rc) this).field_u = true;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        hn var7 = null;
        hn var7_ref = null;
        int var8_int = 0;
        hn[] var8 = null;
        int var9 = 0;
        hn var10 = null;
        hn var11 = null;
        hn var11_ref = null;
        ow var12 = null;
        int var13 = 0;
        hn var14 = null;
        hn var15 = null;
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
          vm.a(param0, 0, var3);
          ((rc) this).field_n = ((rc) this).field_n - param1;
          if (((rc) this).field_r == null) {
            break L1;
          } else {
            if (((rc) this).field_n > 0) {
              break L1;
            } else {
              ((rc) this).field_n = ((rc) this).field_n + (field_d >> 4);
              rc.a(((rc) this).field_r);
              this.a(((rc) this).field_r, ((rc) this).field_r.d());
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
                            var11 = ((rc) this).field_a[var7_int];
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
                                    if (var12.field_k <= var8_int) {
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
                                  var11_ref.field_l = true;
                                  var13 = var11_ref.c();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_k = var12.field_k + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((rc) this).field_i) {
                                  L10: {
                                    var14 = var11_ref.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11_ref.field_n;
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
                                    var15 = var11_ref.field_k;
                                    var11_ref.field_k = null;
                                    if (var10 != null) {
                                      var10.field_k = var15;
                                      break L12;
                                    } else {
                                      ((rc) this).field_a[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((rc) this).field_e[var7_int] = var10;
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
                    var7 = ((rc) this).field_a[var6];
                    var8 = ((rc) this).field_a;
                    var9 = var6;
                    ((rc) this).field_e[var6] = null;
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
          if (((rc) this).field_n >= 0) {
            break L16;
          } else {
            ((rc) this).field_n = 0;
            break L16;
          }
        }
        L17: {
          if (((rc) this).field_r == null) {
            break L17;
          } else {
            ((rc) this).field_r.b(param0, 0, param1);
            break L17;
          }
        }
        ((rc) this).field_t = vi.b(-121);
    }

    public static void g() {
        field_l = null;
    }

    final synchronized void c() {
        try {
            ((rc) this).field_s = true;
            try {
                ((rc) this).a();
            } catch (Exception exception) {
                ((rc) this).e();
                ((rc) this).field_g = vi.b(127) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a() throws Exception {
    }

    void b(int param0) throws Exception {
    }

    final static rc a(hd param0, java.awt.Component param1, int param2, int param3) {
        try {
            mr var4 = null;
            Throwable var4_ref = null;
            mr var5 = null;
            mr stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            mr stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            mr stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            mr stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            mr stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            mr stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            mr stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            mr stackOut_20_0 = null;
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
                        var5 = new mr();
                        var4 = var5;
                        stackOut_8_0 = (mr) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_q) {
                          stackOut_10_0 = (mr) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (mr) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((rc) (Object) stackIn_11_0).field_k = new int[stackIn_11_1 * stackIn_11_2];
                        ((rc) (Object) var4).field_m = param3;
                        ((rc) (Object) var4).a(param1);
                        ((rc) (Object) var4).field_o = (param3 & -1024) + 1024;
                        if (((rc) (Object) var4).field_o <= 16384) {
                          break L3;
                        } else {
                          ((rc) (Object) var4).field_o = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((rc) (Object) var4).b(((rc) (Object) var4).field_o);
                        if (field_h <= 0) {
                          break L4;
                        } else {
                          if (field_l != null) {
                            break L4;
                          } else {
                            field_l = new rh();
                            field_l.field_b = param0;
                            wo discarded$2 = param0.a(field_h, 0, (Runnable) (Object) field_l);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_l == null) {
                          break L5;
                        } else {
                          if (field_l.field_d[param2] == null) {
                            field_l.field_d[param2] = (rc) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (mr) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (rc) (Object) stackIn_21_0;
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
              field_q = stackIn_7_0 != 0;
              field_h = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
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
                        if (!((rc) this).field_u) {
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
                        var1 = vi.b(101);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((rc) this).field_t + 6000L) {
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
                            ((rc) this).field_t = var1 - 6000L;
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
                            if (var1 <= ((rc) this).field_t + 5000L) {
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
                            ((rc) this).field_t = ((rc) this).field_t + (long)(256000 / field_d);
                            var1 = vi.b(-116);
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
                        ((rc) this).field_t = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((rc) this).field_k != null) {
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
                            if (((rc) this).field_g == 0L) {
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
                            if (var1 >= ((rc) this).field_g) {
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
                            ((rc) this).b(((rc) this).field_o);
                            ((rc) this).field_g = 0L;
                            ((rc) this).field_s = true;
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
                            var3_int = ((rc) this).h();
                            if (((rc) this).field_f - var3_int <= ((rc) this).field_c) {
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
                            ((rc) this).field_c = ((rc) this).field_f - var3_int;
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
                            var4 = ((rc) this).field_m + ((rc) this).field_p;
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
                            if (var4 + 256 <= ((rc) this).field_o) {
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
                            ((rc) this).field_o = ((rc) this).field_o + 1024;
                            if (((rc) this).field_o <= 16384) {
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
                            ((rc) this).field_o = 16384;
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
                            ((rc) this).e();
                            ((rc) this).b(((rc) this).field_o);
                            var3_int = 0;
                            ((rc) this).field_s = true;
                            if (var4 + 256 <= ((rc) this).field_o) {
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
                            var4 = ((rc) this).field_o - 256;
                            ((rc) this).field_p = var4 - ((rc) this).field_m;
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
                            this.a(((rc) this).field_k, 256);
                            ((rc) this).b();
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
                            if (var1 <= ((rc) this).field_b) {
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
                            if (((rc) this).field_s) {
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
                            if (((rc) this).field_c != 0) {
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
                            if (((rc) this).field_j != 0) {
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
                            ((rc) this).e();
                            ((rc) this).field_g = var1 + 2000L;
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
                            ((rc) this).field_p = Math.min(((rc) this).field_j, ((rc) this).field_c);
                            ((rc) this).field_j = ((rc) this).field_c;
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
                            ((rc) this).field_s = false;
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
                            ((rc) this).field_c = 0;
                            ((rc) this).field_b = var1 + 2000L;
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
                            ((rc) this).field_f = var3_int;
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
                        ((rc) this).e();
                        ((rc) this).field_g = var1 + 2000L;
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

    rc() {
        ((rc) this).field_u = false;
        ((rc) this).field_i = 32;
        ((rc) this).field_t = vi.b(-89);
        ((rc) this).field_e = new hn[8];
        ((rc) this).field_g = 0L;
        ((rc) this).field_n = 0;
        ((rc) this).field_f = 0;
        ((rc) this).field_a = new hn[8];
        ((rc) this).field_c = 0;
        ((rc) this).field_b = 0L;
        ((rc) this).field_j = 0;
        ((rc) this).field_s = true;
    }
}
