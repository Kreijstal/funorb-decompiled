/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends ua implements sh, ql {
    private t field_z;
    static String field_E;
    cm field_H;
    static pj field_C;
    private qc field_G;
    static cc field_A;
    private t field_D;

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param3 == 7) {
              L1: {
                if (((eb) this).field_z == param4) {
                  je.a(53);
                  break L1;
                } else {
                  if (param4 == ((eb) this).field_D) {
                    int discarded$5 = 1;
                    this.b();
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("eb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    private final boolean l(int param0) {
        if (!this.a(0, (ag) (Object) ((eb) this).field_G)) {
            return false;
        }
        if (param0 > -34) {
            return false;
        }
        return true;
    }

    private final boolean a(int param0, ag param1) {
        kf var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = param1.a(7);
            if (var3 == null) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("eb.J(").append(0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(we param0, int param1, int param2, byte param3) {
        try {
            super.a(param0, param1, param2, (byte) -15);
            if (param3 > -13) {
                Object var6 = null;
                ((eb) this).a((we) null, -102, 77, (byte) -19);
            }
            ((eb) this).field_D.field_w = this.l(-110);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "eb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(String param0, int param1) {
        qc var3 = null;
        String var4 = null;
        try {
            var3 = ((eb) this).field_G;
            if (param1 > -50) {
                eb.m(-107);
            }
            var4 = param0;
            ((rj) (Object) var3).a(false, -5905, var4);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "eb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ge.a(param0, param4, param3 + 1, 10000536);
              ge.a(param0, param4 - -param2, param3 + 1, 12105912);
              var5_int = 1;
              if (param4 - -var5_int < ge.field_f) {
                var5_int = -param4 + ge.field_f;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = param2;
              if (var6 + param4 > ge.field_k) {
                var6 = ge.field_k + -param4;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = 152 - -(48 * var7 / param2);
                var9 = var8 | (var8 << 16 | var8 << 8);
                ge.field_i[ge.field_h * (param4 - -var7) - -param0] = var9;
                ge.field_i[(param4 - -var7) * ge.field_h - (-param0 + -param3)] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var5, "eb.C(" + param0 + ',' + 0 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d() {
        RuntimeException var1 = null;
        ki var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = (ki) (Object) ok.field_a.a((byte) -117);
            L1: while (true) {
              if (var1_ref == null) {
                break L0;
              } else {
                L2: {
                  if (var1_ref.field_F <= 1) {
                    break L2;
                  } else {
                    var1_ref.field_t = hd.field_u;
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= var1_ref.field_m) {
                        break L2;
                      } else {
                        L4: {
                          var3 = var1_ref.field_o[var2].field_l;
                          if (var1_ref.field_l != var3) {
                            if (var1_ref.field_p == var3) {
                              stackOut_10_0 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              break L4;
                            } else {
                              stackOut_9_0 = 0;
                              stackIn_12_0 = stackOut_9_0;
                              break L4;
                            }
                          } else {
                            stackOut_7_0 = 1;
                            stackIn_12_0 = stackOut_7_0;
                            break L4;
                          }
                        }
                        L5: {
                          var4 = stackIn_12_0;
                          if (var4 != 0) {
                            var5 = var2 - -1;
                            L6: while (true) {
                              if (var1_ref.field_m <= var5) {
                                break L5;
                              } else {
                                L7: {
                                  var6 = var1_ref.field_o[var5].field_l;
                                  if (var6 != var1_ref.field_l) {
                                    if (var6 == var1_ref.field_p) {
                                      stackOut_20_0 = 1;
                                      stackIn_22_0 = stackOut_20_0;
                                      break L7;
                                    } else {
                                      stackOut_19_0 = 0;
                                      stackIn_22_0 = stackOut_19_0;
                                      break L7;
                                    }
                                  } else {
                                    stackOut_17_0 = 1;
                                    stackIn_22_0 = stackOut_17_0;
                                    break L7;
                                  }
                                }
                                L8: {
                                  var7 = stackIn_22_0;
                                  if (var4 != 0) {
                                    if (var7 != 0) {
                                      stackOut_26_0 = 1;
                                      stackIn_28_0 = stackOut_26_0;
                                      break L8;
                                    } else {
                                      stackOut_25_0 = 0;
                                      stackIn_28_0 = stackOut_25_0;
                                      break L8;
                                    }
                                  } else {
                                    stackOut_23_0 = 0;
                                    stackIn_28_0 = stackOut_23_0;
                                    break L8;
                                  }
                                }
                                L9: {
                                  var8 = stackIn_28_0;
                                  if (var8 == 0) {
                                    break L9;
                                  } else {
                                    var1_ref.field_o[var2].field_t = hd.field_u;
                                    var1_ref.field_o[var5].field_t = hd.field_u;
                                    break L9;
                                  }
                                }
                                var5++;
                                continue L6;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var2++;
                        continue L3;
                      }
                    }
                  }
                }
                var1_ref = (ki) (Object) ok.field_a.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "eb.S(" + -93 + ')');
        }
    }

    public eb() {
        super(0, 0, 496, 0, (ml) null);
        ((eb) this).field_G = new qc("", (of) null, 12);
        a var1 = new a(pf.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, t.field_z.field_C, -1, 2147483647, true);
        we var2 = new we(vh.field_K, (ml) (Object) var1, (of) null);
        ((eb) this).field_D = new t(wi.field_a, (of) null);
        ((eb) this).field_z = new t(af.field_b, (of) null);
        ((eb) this).field_G.field_m = oa.field_E;
        ((eb) this).field_G.a((kf) (Object) new hh((rj) (Object) ((eb) this).field_G), true);
        ((eb) this).field_D.field_w = false;
        ((eb) this).field_D.field_h = (ml) (Object) new hd();
        ((eb) this).field_z.field_h = (ml) (Object) new lc();
        ((eb) this).field_G.field_h = (ml) (Object) new mg(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 13361, 20, 270, var3);
        var3 += 50;
        ((eb) this).b((byte) -26, var2);
        int discarded$0 = 170;
        int discarded$1 = 35;
        var3 = var3 + (this.a(wj.field_l, (we) (Object) ((eb) this).field_G, var3, ke.field_e) + 5);
        ((eb) this).field_D.a(40, 13361, 496 - var5 >> 1, var5, var3);
        ((eb) this).field_z.a(40, 13361, var4 + 3, 60, 15 + var3);
        ((eb) this).field_z.field_o = (of) this;
        ((eb) this).field_D.field_o = (of) this;
        ((eb) this).b((byte) -102, (we) (Object) ((eb) this).field_D);
        ((eb) this).b((byte) -27, (we) (Object) ((eb) this).field_z);
        ((eb) this).field_H = new cm((sh) this);
        ((eb) this).field_H.a(150, 13361, 60 + (((eb) this).field_G.field_l + ((eb) this).field_G.field_r), -60 + (-((eb) this).field_G.field_l + ((eb) this).field_l) - ((eb) this).field_G.field_r, 20);
        ((eb) this).b((byte) -56, (we) (Object) ((eb) this).field_H);
        ((eb) this).a(var4 + (55 + var3), 13361, 0, 496, 0);
    }

    final static void m(int param0) {
        RuntimeException var1 = null;
        ki var1_ref = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        ki var4 = null;
        int var5_int = 0;
        il var5 = null;
        dl var6 = null;
        dl var7 = null;
        int var8 = 0;
        int var9 = 0;
        ki var10 = null;
        Object var11 = null;
        int var11_int = 0;
        ki var11_ref = null;
        int var12 = 0;
        ki var13 = null;
        int var13_int = 0;
        ki var14 = null;
        ki var15 = null;
        int var16 = 0;
        Object var17 = null;
        ki var17_ref = null;
        ki var18 = null;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_66_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = null;
                    var11 = null;
                    var16 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_ref = (ki) (Object) hd.field_u.a((byte) -117);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1_ref == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var1_ref.field_t == ok.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ri.field_b == var1_ref.field_t) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var1_ref.c(-19822);
                        var1_ref.a(7847);
                        ri.field_b.a(-8212, (ug) (Object) var1_ref);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_ref.c((byte) -94);
                        var1_ref.field_D = 0.0f;
                        var1_ref.field_v = 0.0f;
                        var1_ref.c(-19822);
                        var1_ref.a(7847);
                        ok.field_a.a(-8212, (ug) (Object) var1_ref);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_ref.field_t = null;
                        var1_ref = (ki) (Object) hd.field_u.d((byte) 63);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_int = 0;
                        var2 = 0;
                        if (param0 > 55) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var3 = 0;
                        var4 = (ki) (Object) ok.field_a.a((byte) -117);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4 == null) {
                            statePc = 146;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var4.field_t != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4.c(-19822);
                        var4.a(7847);
                        var4.g(120);
                        if (var4.field_t == hd.field_u) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (ri.field_b != var4.field_t) {
                            statePc = 144;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ri.field_b.a(-8212, (ug) (Object) var4);
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var1_int = 1;
                        if (var4.field_A) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3++;
                        var4.field_A = true;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var4.field_w != 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var2 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (5 == var4.field_w) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_int = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var4.field_m <= var5_int) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var4.field_o[var5_int].field_w != 4) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4.field_o[var5_int].field_t = hd.field_u;
                        lc.field_f = true;
                        if (!var4.field_o[var5_int].field_A) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4.field_o[var5_int].field_A = true;
                        var3++;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5_int++;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var4.field_w == 4) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5_int = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (~var5_int <= ~var4.field_m) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (1 == var4.field_o[var5_int].field_w) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (6 == var4.field_o[var5_int].field_w) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var4.field_o[var5_int].field_t = hd.field_u;
                        lc.field_f = true;
                        if (!var4.field_o[var5_int].field_A) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4.field_o[var5_int].field_A = true;
                        var3++;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var5_int++;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var5_int = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (~var5_int <= ~var4.field_m) {
                            statePc = 129;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var6 = new dl();
                        var7 = new dl();
                        var6.a(-106, (bf) (Object) var4.field_o[var5_int]);
                        var8 = 1;
                        var9 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var17_ref = (ki) (Object) var6.a((byte) -120);
                        if (var17_ref != null) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var17_ref.field_q > var4.field_q) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var17_ref.field_w == 4) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var11_int = stackIn_51_0;
                        if (var17_ref.field_w != 0) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (hd.field_u != var17_ref.field_t) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var17_ref.field_w == 5) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (4 != var17_ref.field_w) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var4.field_w == 5) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = 1;
                        stackIn_60_0 = stackOut_58_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackOut_59_0 = 0;
                        stackIn_60_0 = stackOut_59_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var12 = stackIn_60_0;
                        if (var11_int != 0) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var12 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var8 = 0;
                        if (var9 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var12 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = 1;
                        stackIn_67_0 = stackOut_65_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = 0;
                        stackIn_67_0 = stackOut_66_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var9 = stackIn_67_0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (1 == var17_ref.field_w) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var17_ref.field_w == 6) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var7.a(-122, (bf) (Object) var17_ref);
                        var13_int = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var13_int >= var17_ref.field_m) {
                            statePc = 45;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var18 = var17_ref.field_o[var13_int];
                        if (hd.field_u != var18.field_t) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var15 = (ki) (Object) var7.a(true);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var15 == null) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var18 != var15) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var15 = (ki) (Object) var7.c((byte) -75);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var15 = (ki) (Object) var6.a(true);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var15 == null) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var18 == var15) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var15 = (ki) (Object) var6.c((byte) -75);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var6.a(-122, (bf) (Object) var18);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var13_int++;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var8 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var9 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var7.c(32);
                        var6.a(-124, (bf) (Object) var4.field_o[var5_int]);
                        var10 = var4.field_o[var5_int];
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var11_ref = (ki) (Object) var6.a((byte) -120);
                        if (var11_ref != null) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var7.a(-119, (bf) (Object) var11_ref);
                        if (var10.field_q > var11_ref.field_q) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var10 = var11_ref;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var12 = 0;
                        if (var12 >= var11_ref.field_m) {
                            statePc = 89;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var13 = var11_ref.field_o[var12];
                        if (var13 == null) {
                            statePc = 113;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var10 = (ki) (Object) var7.a((byte) -120);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var10 == null) {
                            statePc = 102;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var10.field_A) {
                            statePc = 101;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var3++;
                        var10.field_A = true;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var10.field_t = hd.field_u;
                        var10 = (ki) (Object) var7.a((byte) -120);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var9 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var7.c(32);
                        var6.a(-124, (bf) (Object) var4.field_o[var5_int]);
                        var10 = var4.field_o[var5_int];
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var11_ref = (ki) (Object) var6.a((byte) -120);
                        if (var11_ref != null) {
                            statePc = 106;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var7.a(-119, (bf) (Object) var11_ref);
                        if (var10.field_q > var11_ref.field_q) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var10 = var11_ref;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var12 = 0;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (var12 >= var11_ref.field_m) {
                            statePc = 104;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var13 = var11_ref.field_o[var12];
                        if (var13 == null) {
                            statePc = 113;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        gl.a((Object[]) (Object) var11_ref.field_o, var12 - -1, (Object[]) (Object) var11_ref.field_o, var12, -var12 + var11_ref.field_m);
                        var12--;
                        var11_ref.field_m = var11_ref.field_m - 1;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (hd.field_u != var13.field_t) {
                            statePc = 116;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var14 = (ki) (Object) var7.a(true);
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var14 == null) {
                            statePc = 121;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (var14 != var13) {
                            statePc = 120;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var14 = (ki) (Object) var7.c((byte) -75);
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var14 = (ki) (Object) var6.a(true);
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (var14 == null) {
                            statePc = 125;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var13 == var14) {
                            statePc = 126;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var14 = (ki) (Object) var6.c((byte) -75);
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var6.a(-107, (bf) (Object) var13);
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var12++;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var10.field_x = true;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var5_int++;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var5_int = 0;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (~var4.field_m >= ~var5_int) {
                            statePc = 132;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var4.field_o[var5_int].a(true, var4);
                        var5_int++;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var5 = (il) (Object) rf.field_a.a((byte) -117);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (var5 == null) {
                            statePc = 139;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var5.field_j == var4) {
                            statePc = 137;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (var4 != var5.field_i) {
                            statePc = 138;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        var5.c(-19822);
                        aj.field_b.a(-8212, (ug) (Object) var5);
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var5 = (il) (Object) rf.field_a.d((byte) 63);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var4.field_E = true;
                        var4.field_m = 0;
                        hd.field_u.a(-8212, (ug) (Object) var4);
                        var4.field_v = -1.0f + (float)(2.0 * Math.random());
                        if (0.009999999776482582f <= Math.abs(var4.field_v)) {
                            statePc = 141;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var4.field_v = -1.0f;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var4.field_D = 10.0f;
                        if (var4.field_w == 0) {
                            statePc = 143;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        ua.i(83);
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var4.field_n = 1;
                        gb.field_o = gb.field_o - 1;
                        int discarded$1 = -19;
                        ob.b();
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var4.field_t = null;
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var4 = (ki) (Object) ok.field_a.d((byte) 63);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (var1_int == 0) {
                            statePc = 167;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        ke.field_c = var3;
                        if (var2 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        dc.field_e = dc.field_e + 1;
                        ek.field_b = 0;
                        if (var3 <= 10) {
                            statePc = 150;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        e.a(248, (byte) 40, 7);
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (15 >= var3) {
                            statePc = 152;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        e.a(247, (byte) 40, 8);
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        if (var3 <= 20) {
                            statePc = 157;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        e.a(246, (byte) 40, 9);
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        dc.field_e = 0;
                        ek.field_b = ek.field_b + 1;
                        if (var3 >= 30) {
                            statePc = 156;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        e.a(253, (byte) 40, 2);
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (4 > dc.field_e) {
                            statePc = 159;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        e.a(252, (byte) 40, 3);
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (dc.field_e < 5) {
                            statePc = 161;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        e.a(251, (byte) 40, 4);
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if (dc.field_e >= 6) {
                            statePc = 163;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        e.a(250, (byte) 40, 5);
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (ek.field_b >= 50) {
                            statePc = 166;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        e.a(249, (byte) 40, 6);
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (!ub.field_a) {
                            statePc = 171;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        dc.field_e = 0;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 170: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw la.a((Throwable) (Object) var1, "eb.G(" + param0 + ')');
                }
                case 171: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b() {
        if (!this.l(-60)) {
            return;
        }
        sg.a(((eb) this).field_G.field_s, (byte) -120);
    }

    public static void k() {
        field_A = null;
        field_C = null;
        field_E = null;
    }

    private final int a(String param0, we param1, int param2, String param3) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            int discarded$2 = 70;
            stackOut_0_0 = this.a(param1, param0, 35, 170, 120, param3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("eb.K(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(70).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 35 + ',' + 170 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(we param0, String param1, int param2, int param3, int param4, String param5) {
        RuntimeException var8 = null;
        vg var9 = null;
        mh var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var10 = new mh(20, 70, 290, 25, param0, false, 120, 3, t.field_z, 16777215, param5);
            ((eb) this).b((byte) -111, (we) (Object) var10);
            var9 = new vg(((ag) (Object) param0).a(32), param1, 126, var10.field_p + 70, 195, 35);
            var9.field_o = (of) this;
            ((eb) this).b((byte) -95, (we) (Object) var9);
            stackOut_0_0 = var9.field_p + var10.field_p;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("eb.U(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(35).append(',').append(170).append(',').append(120).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 70 + ')');
        }
        return stackIn_1_0;
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 110)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 == 98) {
                stackOut_6_0 = ((eb) this).a((byte) 85, param0);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param2 == 99) {
                  stackOut_10_0 = ((eb) this).b(param0, false);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  var5_int = -120 % ((37 - param3) / 50);
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("eb.V(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    public final void a(int param0) {
        ((hh) (Object) ((eb) this).field_G.a(-125)).f((byte) -88);
        if (param0 != 200) {
            eb.m(63);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "This password contains repeated characters, and would be easy to guess";
        field_C = new pj();
    }
}
