/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tk {
    private int field_j;
    private long field_p;
    private boolean field_m;
    int[] field_e;
    private static int field_d;
    static int field_f;
    static boolean field_r;
    private rf field_n;
    private static pn field_s;
    private long field_q;
    private int field_o;
    private int field_t;
    private boolean field_c;
    private int field_h;
    private int field_k;
    private rf[] field_u;
    private int field_a;
    private int field_g;
    private long field_l;
    private int field_i;
    private rf[] field_b;

    int g() throws Exception {
        return ((tk) this).field_h;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        rf var7 = null;
        int var8_int = 0;
        rf[] var8 = null;
        int var9 = 0;
        rf var10 = null;
        rf var11 = null;
        gs var12 = null;
        int var13 = 0;
        rf var14 = null;
        rf var15 = null;
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
          au.a(param0, 0, var3);
          ((tk) this).field_o = ((tk) this).field_o - param1;
          if (((tk) this).field_n == null) {
            break L1;
          } else {
            if (((tk) this).field_o > 0) {
              break L1;
            } else {
              ((tk) this).field_o = ((tk) this).field_o + (field_f >> 4);
              tk.b(((tk) this).field_n);
              this.a(((tk) this).field_n, ((tk) this).field_n.c());
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
                            var11 = ((tk) this).field_b[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = ((rf) var11).field_f;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (((gs) var12).field_e <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = var11;
                                      var11 = ((rf) var11).field_e;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_g = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    ((gs) var12).field_e = ((gs) var12).field_e + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((tk) this).field_j) {
                                  L10: {
                                    var14 = var11.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = ((rf) var11).field_h;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11.a();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = ((rf) var11).field_e;
                                    var11.field_e = null;
                                    if (var10 != null) {
                                      var10.field_e = var15;
                                      break L12;
                                    } else {
                                      ((tk) this).field_b[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((tk) this).field_u[var7_int] = var10;
                                      break L13;
                                    }
                                  }
                                  var11 = var15;
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
                    var7 = ((tk) this).field_b[var6];
                    var8 = ((tk) this).field_b;
                    var9 = var6;
                    ((tk) this).field_u[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = ((rf) var7).field_e;
                        var7.field_e = null;
                        var7 = var10;
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
          if (((tk) this).field_o >= 0) {
            break L16;
          } else {
            ((tk) this).field_o = 0;
            break L16;
          }
        }
        L17: {
          if (((tk) this).field_n == null) {
            break L17;
          } else {
            ((tk) this).field_n.b(param0, 0, param1);
            break L17;
          }
        }
        ((tk) this).field_p = kh.a(-99);
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
                        if (!((tk) this).field_m) {
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
                        var1 = kh.a(-128);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            if (var1 <= ((tk) this).field_p + 6000L) {
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
                            ((tk) this).field_p = var1 - 6000L;
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
                            if (var1 <= ((tk) this).field_p + 5000L) {
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
                            ((tk) this).field_p = ((tk) this).field_p + (long)(256000 / field_f);
                            var1 = kh.a(-69);
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
                        ((tk) this).field_p = var1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((tk) this).field_e != null) {
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
                            if (((tk) this).field_q == 0L) {
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
                            if (var1 >= ((tk) this).field_q) {
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
                            ((tk) this).a(((tk) this).field_h);
                            ((tk) this).field_q = 0L;
                            ((tk) this).field_c = true;
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
                            var3_int = ((tk) this).g();
                            if (((tk) this).field_a - var3_int <= ((tk) this).field_t) {
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
                            ((tk) this).field_t = ((tk) this).field_a - var3_int;
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
                            var4 = ((tk) this).field_i + ((tk) this).field_k;
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
                            if (var4 + 256 <= ((tk) this).field_h) {
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
                            ((tk) this).field_h = ((tk) this).field_h + 1024;
                            if (((tk) this).field_h <= 16384) {
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
                            ((tk) this).field_h = 16384;
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
                            ((tk) this).f();
                            ((tk) this).a(((tk) this).field_h);
                            var3_int = 0;
                            ((tk) this).field_c = true;
                            if (var4 + 256 <= ((tk) this).field_h) {
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
                            var4 = ((tk) this).field_h - 256;
                            ((tk) this).field_k = var4 - ((tk) this).field_i;
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
                            this.a(((tk) this).field_e, 256);
                            ((tk) this).c();
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
                            if (var1 <= ((tk) this).field_l) {
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
                            if (((tk) this).field_c) {
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
                            if (((tk) this).field_t != 0) {
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
                            if (((tk) this).field_g != 0) {
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
                            ((tk) this).f();
                            ((tk) this).field_q = var1 + 2000L;
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
                            ((tk) this).field_k = Math.min(((tk) this).field_g, ((tk) this).field_t);
                            ((tk) this).field_g = ((tk) this).field_t;
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
                            ((tk) this).field_c = false;
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
                            ((tk) this).field_t = 0;
                            ((tk) this).field_l = var1 + 2000L;
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
                            ((tk) this).field_a = var3_int;
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
                        ((tk) this).f();
                        ((tk) this).field_q = var1 + 2000L;
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

    void c() throws Exception {
    }

    private final void b(int param0) {
        ((tk) this).field_o = ((tk) this).field_o - param0;
        if (((tk) this).field_o < 0) {
            ((tk) this).field_o = 0;
        }
        if (((tk) this).field_n != null) {
            ((tk) this).field_n.a(param0);
            return;
        }
    }

    void a(int param0) throws Exception {
    }

    private final static void b(rf param0) {
        param0.field_g = false;
        if (((rf) param0).field_f != null) {
            ((rf) param0).field_f.field_e = 0;
        }
        rf var1 = param0.b();
        while (var1 != null) {
            tk.b(var1);
            var1 = param0.a();
        }
    }

    private final void a(rf param0, int param1) {
        int var3 = param1 >> 5;
        rf var4 = ((tk) this).field_u[var3];
        if (var4 == null) {
            ((tk) this).field_b[var3] = param0;
        } else {
            var4.field_e = param0;
        }
        ((tk) this).field_u[var3] = param0;
        param0.field_h = param1;
    }

    final synchronized void d() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_s == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_s.field_a = true;
                  L2: while (true) {
                    if (!field_s.field_e) {
                      field_s = null;
                      break L0;
                    } else {
                      wf.a(50L, false);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_s.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_s.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_s.field_c[var2] != null) {
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
        ((tk) this).f();
        ((tk) this).field_e = null;
        ((tk) this).field_m = true;
    }

    public static void a() {
        field_s = null;
    }

    void b() throws Exception {
    }

    final synchronized void e() {
        try {
            ((tk) this).field_c = true;
            try {
                ((tk) this).b();
            } catch (Exception exception) {
                ((tk) this).f();
                ((tk) this).field_q = kh.a(-86) + 2000L;
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
                field_f = param0;
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
              field_d = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final synchronized void a(rf param0) {
        ((tk) this).field_n = param0;
    }

    final static tk a(rk param0, java.awt.Component param1, int param2, int param3) {
        try {
            ug var4 = null;
            Throwable var4_ref = null;
            ug var5 = null;
            ug stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ug stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ug stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ug stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ug stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ug stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ug stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ug stackOut_20_0 = null;
            if (field_f != 0) {
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
                        var5 = new ug();
                        var4 = var5;
                        stackOut_8_0 = (ug) var4;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (!field_r) {
                          stackOut_10_0 = (ug) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L2;
                        } else {
                          stackOut_9_0 = (ug) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 2;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L2;
                        }
                      }
                      L3: {
                        ((tk) (Object) stackIn_11_0).field_e = new int[stackIn_11_1 * stackIn_11_2];
                        ((tk) var4).field_i = param3;
                        ((tk) (Object) var4).a(param1);
                        ((tk) var4).field_h = (param3 & -1024) + 1024;
                        if (((tk) var4).field_h <= 16384) {
                          break L3;
                        } else {
                          ((tk) var4).field_h = 16384;
                          break L3;
                        }
                      }
                      L4: {
                        ((tk) (Object) var4).a(((tk) var4).field_h);
                        if (field_d <= 0) {
                          break L4;
                        } else {
                          if (field_s != null) {
                            break L4;
                          } else {
                            field_s = new pn();
                            field_s.field_f = param0;
                            en discarded$2 = param0.a(field_d, 1048576, (Runnable) (Object) field_s);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (field_s == null) {
                          break L5;
                        } else {
                          if (field_s.field_c[param2] == null) {
                            field_s.field_c[param2] = (tk) (Object) var5;
                            break L5;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      stackOut_20_0 = (ug) var4;
                      stackIn_21_0 = stackOut_20_0;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return (tk) (Object) stackIn_21_0;
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

    void f() {
    }

    tk() {
        ((tk) this).field_j = 32;
        ((tk) this).field_m = false;
        ((tk) this).field_p = kh.a(-86);
        ((tk) this).field_t = 0;
        ((tk) this).field_c = true;
        ((tk) this).field_u = new rf[8];
        ((tk) this).field_g = 0;
        ((tk) this).field_q = 0L;
        ((tk) this).field_o = 0;
        ((tk) this).field_l = 0L;
        ((tk) this).field_a = 0;
        ((tk) this).field_b = new rf[8];
    }
}
