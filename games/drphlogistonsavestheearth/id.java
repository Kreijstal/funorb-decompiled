/*
 * Decompiled by CFR-JS 0.4.0.
 */
class id {
    private ic field_l;
    private int field_c;
    private boolean field_e;
    static int field_d;
    int[] field_a;
    private static fb field_g;
    private static int field_o;
    private long field_p;
    static boolean field_f;
    private boolean field_m;
    private int field_s;
    private int field_n;
    private int field_q;
    private ic[] field_i;
    private int field_k;
    private ic[] field_b;
    private int field_h;
    private int field_r;
    private long field_t;
    private int field_u;
    private long field_j;

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void h() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_g == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_g.field_h = true;
                  L2: while (true) {
                    if (!field_g.field_f) {
                      field_g = null;
                      break L0;
                    } else {
                      kk.a(50L, true);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_g.field_i[var2] != this) {
                    break L3;
                  } else {
                    field_g.field_i[var2] = null;
                    break L3;
                  }
                }
                if (field_g.field_i[var2] != null) {
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
        ((id) this).f();
        ((id) this).field_a = null;
        ((id) this).field_e = true;
    }

    void f() {
    }

    void b() throws Exception {
    }

    void a(int param0) throws Exception {
    }

    public static void e() {
        field_g = null;
    }

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
                        if (!((id) this).field_e) {
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
                        var1 = la.a(false);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((id) this).field_p + 6000L) {
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
                            ((id) this).field_p = var1 - 6000L;
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
                            if (var1 <= ((id) this).field_p + 5000L) {
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
                            ((id) this).field_p = ((id) this).field_p + (long)(256000 / field_d);
                            var1 = la.a(false);
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
                        ((id) this).field_p = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((id) this).field_a != null) {
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
                            if (((id) this).field_j == 0L) {
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
                            if (var1 >= ((id) this).field_j) {
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
                            ((id) this).a(((id) this).field_h);
                            ((id) this).field_j = 0L;
                            ((id) this).field_m = true;
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
                            var3_int = ((id) this).c();
                            if (((id) this).field_n - var3_int <= ((id) this).field_u) {
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
                            ((id) this).field_u = ((id) this).field_n - var3_int;
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
                            var4 = ((id) this).field_s + ((id) this).field_r;
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
                            if (var4 + 256 <= ((id) this).field_h) {
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
                            ((id) this).field_h = ((id) this).field_h + 1024;
                            if (((id) this).field_h <= 16384) {
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
                            ((id) this).field_h = 16384;
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
                            ((id) this).f();
                            ((id) this).a(((id) this).field_h);
                            var3_int = 0;
                            ((id) this).field_m = true;
                            if (var4 + 256 <= ((id) this).field_h) {
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
                            var4 = ((id) this).field_h - 256;
                            ((id) this).field_r = var4 - ((id) this).field_s;
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
                            this.a(((id) this).field_a, 256);
                            ((id) this).b();
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
                            if (var1 <= ((id) this).field_t) {
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
                            if (((id) this).field_m) {
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
                            if (((id) this).field_u != 0) {
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
                            if (((id) this).field_q != 0) {
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
                            ((id) this).f();
                            ((id) this).field_j = var1 + 2000L;
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
                            ((id) this).field_r = Math.min(((id) this).field_q, ((id) this).field_u);
                            ((id) this).field_q = ((id) this).field_u;
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
                            ((id) this).field_m = false;
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
                            ((id) this).field_u = 0;
                            ((id) this).field_t = var1 + 2000L;
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
                            ((id) this).field_n = var3_int;
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
                        ((id) this).f();
                        ((id) this).field_j = var1 + 2000L;
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

    private final static void b(ic param0) {
        param0.field_h = false;
        if (param0.field_i != null) {
            param0.field_i.field_h = 0;
        }
        ic var1 = param0.a();
        while (var1 != null) {
            id.b(var1);
            var1 = param0.c();
        }
    }

    private final void a(ic param0, int param1) {
        int var3 = param1 >> 5;
        ic var4 = ((id) this).field_i[var3];
        if (var4 == null) {
            ((id) this).field_b[var3] = param0;
        } else {
            var4.field_j = param0;
        }
        ((id) this).field_i[var3] = param0;
        param0.field_k = param1;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        ic var7 = null;
        ic var7_ref = null;
        int var8_int = 0;
        ic[] var8 = null;
        int var9 = 0;
        ic var10 = null;
        ic var11 = null;
        ic var11_ref = null;
        me var12 = null;
        int var13 = 0;
        ic var14 = null;
        ic var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_f) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          kg.a(param0, 0, var3);
          ((id) this).field_k = ((id) this).field_k - param1;
          if (((id) this).field_l == null) {
            break L1;
          } else {
            if (((id) this).field_k > 0) {
              break L1;
            } else {
              ((id) this).field_k = ((id) this).field_k + (field_d >> 4);
              id.b(((id) this).field_l);
              this.a(((id) this).field_l, ((id) this).field_l.b());
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
                            var11 = ((id) this).field_b[var7_int];
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
                                    if (var12.field_h <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11_ref = var11.field_j;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11_ref.field_h = true;
                                  var13 = var11_ref.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_h = var12.field_h + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((id) this).field_c) {
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
                                    var15 = var11_ref.field_j;
                                    var11_ref.field_j = null;
                                    if (var10 != null) {
                                      var10.field_j = var15;
                                      break L12;
                                    } else {
                                      ((id) this).field_b[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((id) this).field_i[var7_int] = var10;
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
                    var7 = ((id) this).field_b[var6];
                    var8 = ((id) this).field_b;
                    var9 = var6;
                    ((id) this).field_i[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = var7.field_j;
                        var7.field_j = null;
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
          if (((id) this).field_k >= 0) {
            break L16;
          } else {
            ((id) this).field_k = 0;
            break L16;
          }
        }
        L17: {
          if (((id) this).field_l == null) {
            break L17;
          } else {
            ((id) this).field_l.b(param0, 0, param1);
            break L17;
          }
        }
        ((id) this).field_p = la.a(false);
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
              field_f = stackIn_7_0 != 0;
              field_o = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final synchronized void g() {
        try {
            ((id) this).field_m = true;
            try {
                ((id) this).d();
            } catch (Exception exception) {
                ((id) this).f();
                ((id) this).field_j = la.a(false) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        ((id) this).field_k = ((id) this).field_k - param0;
        if (((id) this).field_k < 0) {
            ((id) this).field_k = 0;
        }
        if (((id) this).field_l != null) {
            ((id) this).field_l.d(param0);
            return;
        }
    }

    int c() throws Exception {
        return ((id) this).field_h;
    }

    final synchronized void a(ic param0) {
        ((id) this).field_l = param0;
    }

    final static id a(bl param0, java.awt.Component param1, int param2, int param3) {
        try {
            ed var4 = null;
            Throwable var4_ref = null;
            ed var5 = null;
            ed stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ed stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ed stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ed stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ed stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ed stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ed stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ed stackOut_20_0 = null;
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
                        var5 = new ed();
                        var4 = var5;
                        stackOut_8_0 = (ed) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_f) {
                          stackOut_10_0 = (ed) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (ed) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((id) (Object) stackIn_11_0).field_a = new int[stackIn_11_1 * stackIn_11_2];
                        ((id) (Object) var4).field_s = param3;
                        ((id) (Object) var4).a(param1);
                        ((id) (Object) var4).field_h = (param3 & -1024) + 1024;
                        if (((id) (Object) var4).field_h <= 16384) {
                          break L3;
                        } else {
                          ((id) (Object) var4).field_h = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((id) (Object) var4).a(((id) (Object) var4).field_h);
                        if (field_o <= 0) {
                          break L4;
                        } else {
                          if (field_g != null) {
                            break L4;
                          } else {
                            field_g = new fb();
                            field_g.field_d = param0;
                            il discarded$2 = param0.a((Runnable) (Object) field_g, field_o, (byte) -8);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_g == null) {
                          break L5;
                        } else {
                          if (field_g.field_i[param2] == null) {
                            field_g.field_i[param2] = (id) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (ed) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (id) (Object) stackIn_21_0;
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

    void d() throws Exception {
    }

    id() {
        ((id) this).field_e = false;
        ((id) this).field_c = 32;
        ((id) this).field_p = la.a(false);
        ((id) this).field_q = 0;
        ((id) this).field_k = 0;
        ((id) this).field_n = 0;
        ((id) this).field_b = new ic[8];
        ((id) this).field_i = new ic[8];
        ((id) this).field_m = true;
        ((id) this).field_j = 0L;
        ((id) this).field_u = 0;
        ((id) this).field_t = 0L;
    }
}
