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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param3 == 7) {
              L1: {
                L2: {
                  if (((eb) this).field_z == param4) {
                    break L2;
                  } else {
                    if (param4 == ((eb) this).field_D) {
                      this.b(true);
                      if (!MonkeyPuzzle2.field_F) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                je.a(53);
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("eb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    private final boolean l(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(0, (ag) (Object) ((eb) this).field_G)) {
              if (param0 <= -34) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "eb.Q(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final boolean a(int param0, ag param1) {
        kf var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var3 = param1.a(param0 + 7);
            if (null == var3) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 == 0) {
                L1: {
                  var4 = var3.b(false);
                  if (wj.field_i != var4) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L1;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_12_0 = stackOut_9_0;
                    break L1;
                  }
                }
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("eb.J(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void a(we param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -15);
              if (param3 <= -13) {
                break L1;
              } else {
                ((eb) this).a((we) null, -102, 77, (byte) -19);
                break L1;
              }
            }
            ((eb) this).field_D.field_w = this.l(-110);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("eb.E(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        qc var3 = null;
        String var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((eb) this).field_G;
              if (param1 <= -50) {
                break L1;
              } else {
                eb.m(-107);
                break L1;
              }
            }
            var4 = param0;
            ((rj) (Object) var3).a(false, -5905, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("eb.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
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
              if (param1 == 0) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            L2: {
              var5_int = 1;
              if (~(param4 - -var5_int) > ~ge.field_f) {
                var5_int = -param4 + ge.field_f;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = param2;
              if (~(var6 + param4) < ~ge.field_k) {
                var6 = ge.field_k + -param4;
                break L3;
              } else {
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              L5: {
                L6: {
                  if (var7 >= var6) {
                    break L6;
                  } else {
                    var8 = 152 - -(48 * var7 / param2);
                    var9 = var8 | (var8 << -14392048 | var8 << -1179334136);
                    ge.field_i[ge.field_h * (param4 - -var7) - -param0] = var9;
                    ge.field_i[(param4 - -var7) * ge.field_h - (-param0 + -param3)] = var9;
                    var7++;
                    if (var10 != 0) {
                      break L5;
                    } else {
                      if (var10 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var5, "eb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d(byte param0) {
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
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = (ki) (Object) ok.field_a.a((byte) -117);
              if (param0 == -93) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var1_ref) {
                    break L4;
                  } else {
                    if (var9 != 0) {
                      break L3;
                    } else {
                      stackOut_6_0 = var1_ref.field_F;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      L5: while (true) {
                        L6: {
                          if (stackIn_8_0 <= stackIn_8_1) {
                            break L6;
                          } else {
                            var1_ref.field_t = hd.field_u;
                            var2 = 0;
                            L7: while (true) {
                              stackOut_10_0 = ~var2;
                              stackOut_10_1 = ~var1_ref.field_m;
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              L8: while (true) {
                                if (stackIn_11_0 <= stackIn_11_1) {
                                  break L6;
                                } else {
                                  var3 = var1_ref.field_o[var2].field_l;
                                  stackOut_12_0 = var1_ref.field_l;
                                  stackOut_12_1 = var3;
                                  stackIn_8_0 = stackOut_12_0;
                                  stackIn_8_1 = stackOut_12_1;
                                  stackIn_13_0 = stackOut_12_0;
                                  stackIn_13_1 = stackOut_12_1;
                                  if (var9 != 0) {
                                    continue L5;
                                  } else {
                                    L9: {
                                      L10: {
                                        if (stackIn_13_0 == stackIn_13_1) {
                                          break L10;
                                        } else {
                                          if (var1_ref.field_p != var3) {
                                            stackOut_19_0 = 0;
                                            stackIn_20_0 = stackOut_19_0;
                                            break L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      stackOut_17_0 = 1;
                                      stackIn_20_0 = stackOut_17_0;
                                      break L9;
                                    }
                                    L11: {
                                      var4 = stackIn_20_0;
                                      if (var4 != 0) {
                                        var5 = var2 - -1;
                                        L12: while (true) {
                                          if (var1_ref.field_m <= var5) {
                                            break L11;
                                          } else {
                                            var6 = var1_ref.field_o[var5].field_l;
                                            stackOut_25_0 = ~var6;
                                            stackOut_25_1 = ~var1_ref.field_l;
                                            stackIn_11_0 = stackOut_25_0;
                                            stackIn_11_1 = stackOut_25_1;
                                            stackIn_26_0 = stackOut_25_0;
                                            stackIn_26_1 = stackOut_25_1;
                                            if (var9 != 0) {
                                              continue L8;
                                            } else {
                                              L13: {
                                                L14: {
                                                  if (stackIn_26_0 == stackIn_26_1) {
                                                    break L14;
                                                  } else {
                                                    if (~var6 != ~var1_ref.field_p) {
                                                      stackOut_32_0 = 0;
                                                      stackIn_33_0 = stackOut_32_0;
                                                      break L13;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                stackOut_30_0 = 1;
                                                stackIn_33_0 = stackOut_30_0;
                                                break L13;
                                              }
                                              L15: {
                                                L16: {
                                                  var7 = stackIn_33_0;
                                                  if (var4 == 0) {
                                                    break L16;
                                                  } else {
                                                    if (var4 == 0) {
                                                      break L16;
                                                    } else {
                                                      if (var7 == 0) {
                                                        break L16;
                                                      } else {
                                                        stackOut_40_0 = 1;
                                                        stackIn_43_0 = stackOut_40_0;
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_42_0 = 0;
                                                stackIn_43_0 = stackOut_42_0;
                                                break L15;
                                              }
                                              L17: {
                                                var8 = stackIn_43_0;
                                                if (var8 == 0) {
                                                  break L17;
                                                } else {
                                                  var1_ref.field_o[var2].field_t = hd.field_u;
                                                  var1_ref.field_o[var5].field_t = hd.field_u;
                                                  break L17;
                                                }
                                              }
                                              var5++;
                                              if (var9 == 0) {
                                                continue L12;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                    var2++;
                                    if (var9 == 0) {
                                      continue L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var1_ref = (ki) (Object) ok.field_a.d((byte) 63);
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "eb.S(" + param0 + ')');
        }
    }

    public eb() {
        super(0, 0, 496, 0, (ml) null);
        RuntimeException var1 = null;
        a var1_ref = null;
        we var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((eb) this).field_G = new qc("", (of) null, 12);
            var1_ref = new a(pf.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, t.field_z.field_C, -1, 2147483647, true);
            var2 = new we(vh.field_K, (ml) (Object) var1_ref, (of) null);
            ((eb) this).field_D = new t(wi.field_a, (of) null);
            ((eb) this).field_z = new t(af.field_b, (of) null);
            ((eb) this).field_G.field_m = oa.field_E;
            ((eb) this).field_G.a((kf) (Object) new hh((rj) (Object) ((eb) this).field_G), true);
            ((eb) this).field_D.field_w = false;
            ((eb) this).field_D.field_h = (ml) (Object) new hd();
            ((eb) this).field_z.field_h = (ml) (Object) new lc();
            ((eb) this).field_G.field_h = (ml) (Object) new mg(10000536);
            var3 = 20;
            var4 = 4;
            var5 = 200;
            var2.a(50, 13361, 20, 270, var3);
            var3 += 50;
            ((eb) this).b((byte) -26, var2);
            var3 = var3 + (this.a(wj.field_l, (we) (Object) ((eb) this).field_G, var3, ke.field_e, 35, 170) + 5);
            ((eb) this).field_D.a(40, 13361, 496 - var5 >> 909351489, var5, var3);
            ((eb) this).field_z.a(40, 13361, var4 + 3, 60, 15 + var3);
            ((eb) this).field_z.field_o = (of) this;
            ((eb) this).field_D.field_o = (of) this;
            ((eb) this).b((byte) -102, (we) (Object) ((eb) this).field_D);
            ((eb) this).b((byte) -27, (we) (Object) ((eb) this).field_z);
            ((eb) this).field_H = new cm((sh) this);
            ((eb) this).field_H.a(150, 13361, 60 + (((eb) this).field_G.field_l + ((eb) this).field_G.field_r), -60 + (-((eb) this).field_G.field_l + ((eb) this).field_l) - ((eb) this).field_G.field_r, 20);
            ((eb) this).b((byte) -56, (we) (Object) ((eb) this).field_H);
            ((eb) this).a(var4 + (55 + var3), 13361, 0, 496, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "eb.<init>()");
        }
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
        int var11_int = 0;
        ki var11 = null;
        int var12 = 0;
        int var13_int = 0;
        ki var13 = null;
        ki var14 = null;
        ki var15 = null;
        int var16 = 0;
        Object stackIn_17_0 = null;
        ki stackIn_17_1 = null;
        pj stackIn_25_0 = null;
        pj stackIn_25_1 = null;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_118_0 = 0;
        pj stackIn_128_0 = null;
        pj stackIn_128_1 = null;
        ki stackIn_135_0 = null;
        ki stackIn_135_1 = null;
        ki stackIn_136_0 = null;
        ki stackIn_136_1 = null;
        ki stackIn_146_0 = null;
        ki stackIn_146_1 = null;
        boolean stackIn_157_0 = false;
        int stackIn_164_0 = 0;
        Object stackIn_180_0 = null;
        ki stackIn_180_1 = null;
        ki stackIn_183_0 = null;
        ki stackIn_183_1 = null;
        ki stackIn_191_0 = null;
        ki stackIn_191_1 = null;
        ki stackIn_199_0 = null;
        ki stackIn_199_1 = null;
        int stackIn_207_0 = 0;
        ki stackIn_216_0 = null;
        ki stackIn_226_0 = null;
        Object stackOut_16_0 = null;
        ki stackOut_16_1 = null;
        pj stackOut_24_0 = null;
        pj stackOut_24_1 = null;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_117_0 = 0;
        pj stackOut_127_0 = null;
        pj stackOut_127_1 = null;
        ki stackOut_134_0 = null;
        ki stackOut_134_1 = null;
        ki stackOut_135_0 = null;
        ki stackOut_135_1 = null;
        ki stackOut_145_0 = null;
        ki stackOut_145_1 = null;
        boolean stackOut_156_0 = false;
        int stackOut_163_0 = 0;
        Object stackOut_179_0 = null;
        ki stackOut_179_1 = null;
        ki stackOut_182_0 = null;
        ki stackOut_182_1 = null;
        ki stackOut_190_0 = null;
        ki stackOut_190_1 = null;
        ki stackOut_198_0 = null;
        ki stackOut_198_1 = null;
        int stackOut_206_0 = 0;
        ki stackOut_215_0 = null;
        ki stackOut_225_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
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
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1_ref == null) {
                            statePc = 13;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var1_ref.field_t == ok.field_a) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ri.field_b == var1_ref.field_t) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_ref.c(-19822);
                        var1_ref.a(7847);
                        ri.field_b.a(-8212, (ug) (Object) var1_ref);
                        if (var16 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var1_ref.c((byte) -94);
                        var1_ref.field_D = 0.0f;
                        var1_ref.field_v = 0.0f;
                        var1_ref.c(-19822);
                        var1_ref.a(7847);
                        ok.field_a.a(-8212, (ug) (Object) var1_ref);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var1_ref.field_t = null;
                        var1_ref = (ki) (Object) hd.field_u.d((byte) 63);
                        if (var16 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var1_int = 0;
                        var2 = 0;
                        if (param0 > 55) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        var3 = 0;
                        var4 = (ki) (Object) ok.field_a.a((byte) -117);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = null;
                        stackOut_16_1 = (ki) var4;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 == (Object) (Object) stackIn_17_1) {
                            statePc = 237;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var16 != 0) {
                            statePc = 273;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var4.field_t != null) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4.c(-19822);
                        var4.a(7847);
                        var4.g(120);
                        stackOut_24_0 = var4.field_t;
                        stackOut_24_1 = hd.field_u;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == stackIn_25_1) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (ri.field_b != var4.field_t) {
                            statePc = 235;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ri.field_b.a(-8212, (ug) (Object) var4);
                        if (var16 == 0) {
                            statePc = 235;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var1_int = 1;
                        if (var4.field_A) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var3++;
                        var4.field_A = true;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var4.field_w != 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var2 = 1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (5 == var4.field_w) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var5_int = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var4.field_m <= var5_int) {
                            statePc = 51;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = var4.field_o[var5_int].field_w;
                        stackOut_40_1 = 4;
                        stackIn_52_0 = stackOut_40_0;
                        stackIn_52_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (var16 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 != stackIn_41_1) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var4.field_o[var5_int].field_t = hd.field_u;
                        lc.field_f = true;
                        if (!var4.field_o[var5_int].field_A) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var4.field_o[var5_int].field_A = true;
                        var3++;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var5_int++;
                        if (var16 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = var4.field_w;
                        stackOut_51_1 = 4;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == stackIn_52_1) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var5_int = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (~var5_int <= ~var4.field_m) {
                            statePc = 70;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = 1;
                        stackOut_56_1 = var4.field_o[var5_int].field_w;
                        stackIn_72_0 = stackOut_56_0;
                        stackIn_72_1 = stackOut_56_1;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        if (var16 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 == stackIn_57_1) {
                            statePc = 65;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (6 == var4.field_o[var5_int].field_w) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var4.field_o[var5_int].field_t = hd.field_u;
                        lc.field_f = true;
                        if (!var4.field_o[var5_int].field_A) {
                            statePc = 68;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var4.field_o[var5_int].field_A = true;
                        var3++;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var5_int++;
                        if (var16 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var5_int = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = ~var5_int;
                        stackOut_71_1 = ~var4.field_m;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (stackIn_72_0 <= stackIn_72_1) {
                            statePc = 206;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var6 = new dl();
                        var7 = new dl();
                        var6.a(-106, (bf) (Object) var4.field_o[var5_int]);
                        var8 = 1;
                        stackOut_73_0 = 1;
                        stackIn_207_0 = stackOut_73_0;
                        stackIn_74_0 = stackOut_73_0;
                        if (var16 != 0) {
                            statePc = 207;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var9 = stackIn_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var10 = (ki) (Object) var6.a((byte) -120);
                        if (var10 != null) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var16 != 0) {
                            statePc = 88;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var16 == 0) {
                            statePc = 151;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var10.field_q > var4.field_q) {
                            statePc = 88;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var10.field_w == 4) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = 1;
                        stackIn_89_0 = stackOut_86_0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackOut_88_0 = 0;
                        stackIn_89_0 = stackOut_88_0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var11_int = stackIn_89_0;
                        if (var10.field_w != 0) {
                            statePc = 93;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (hd.field_u != var10.field_t) {
                            statePc = 102;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var10.field_w == 5) {
                            statePc = 102;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (4 != var10.field_w) {
                            statePc = 104;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var4.field_w == 5) {
                            statePc = 104;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = 1;
                        stackIn_105_0 = stackOut_102_0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackOut_104_0 = 0;
                        stackIn_105_0 = stackOut_104_0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var12 = stackIn_105_0;
                        if (var11_int != 0) {
                            statePc = 111;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var12 != 0) {
                            statePc = 111;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var8 = 0;
                        if (var9 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var12 != 0) {
                            statePc = 117;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = 1;
                        stackIn_118_0 = stackOut_115_0;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = 0;
                        stackIn_118_0 = stackOut_117_0;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var9 = stackIn_118_0;
                        if (var16 == 0) {
                            statePc = 151;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (1 == var10.field_w) {
                            statePc = 125;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (var10.field_w == 6) {
                            statePc = 125;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var7.a(-122, (bf) (Object) var10);
                        var13_int = 0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var13_int >= var10.field_m) {
                            statePc = 150;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var14 = var10.field_o[var13_int];
                        stackOut_127_0 = hd.field_u;
                        stackOut_127_1 = var14.field_t;
                        stackIn_25_0 = stackOut_127_0;
                        stackIn_25_1 = stackOut_127_1;
                        stackIn_128_0 = stackOut_127_0;
                        stackIn_128_1 = stackOut_127_1;
                        if (var16 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (stackIn_128_0 != stackIn_128_1) {
                            statePc = 132;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (var16 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var15 = (ki) (Object) var7.a(true);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (var15 == null) {
                            statePc = 143;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackOut_134_0 = (ki) var14;
                        stackOut_134_1 = (ki) var15;
                        stackIn_135_0 = stackOut_134_0;
                        stackIn_135_1 = stackOut_134_1;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        stackOut_135_0 = (ki) (Object) stackIn_135_0;
                        stackOut_135_1 = (ki) (Object) stackIn_135_1;
                        stackIn_146_0 = stackOut_135_0;
                        stackIn_146_1 = stackOut_135_1;
                        stackIn_136_0 = stackOut_135_0;
                        stackIn_136_1 = stackOut_135_1;
                        if (var16 != 0) {
                            statePc = 146;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (stackIn_136_0 != stackIn_136_1) {
                            statePc = 142;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (var16 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var15 = (ki) (Object) var7.c((byte) -75);
                        if (var16 == 0) {
                            statePc = 133;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var15 = (ki) (Object) var6.a(true);
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (null == var15) {
                            statePc = 148;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        stackOut_145_0 = (ki) var14;
                        stackOut_145_1 = (ki) var15;
                        stackIn_135_0 = stackOut_145_0;
                        stackIn_135_1 = stackOut_145_1;
                        stackIn_146_0 = stackOut_145_0;
                        stackIn_146_1 = stackOut_145_1;
                        if (var16 != 0) {
                            statePc = 135;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (stackIn_146_0 == stackIn_146_1) {
                            statePc = 149;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var15 = (ki) (Object) var6.c((byte) -75);
                        if (var16 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var6.a(-122, (bf) (Object) var14);
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        var13_int++;
                        if (var16 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (var16 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (var8 != 0) {
                            statePc = 154;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        var10 = (ki) (Object) var7.a((byte) -120);
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (null == var10) {
                            statePc = 163;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        stackOut_156_0 = var10.field_A;
                        stackIn_164_0 = stackOut_156_0 ? 1 : 0;
                        stackIn_157_0 = stackOut_156_0;
                        if (var16 != 0) {
                            statePc = 164;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (stackIn_157_0) {
                            statePc = 162;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        var3++;
                        var10.field_A = true;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        var10.field_t = hd.field_u;
                        var10 = (ki) (Object) var7.a((byte) -120);
                        if (var16 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackOut_163_0 = var9;
                        stackIn_164_0 = stackOut_163_0;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (stackIn_164_0 == 0) {
                            statePc = 205;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var7.c(32);
                        var6.a(-124, (bf) (Object) var4.field_o[var5_int]);
                        var10 = var4.field_o[var5_int];
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var11 = (ki) (Object) var6.a((byte) -120);
                        if (var11 != null) {
                            statePc = 171;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (var16 != 0) {
                            statePc = 173;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        if (var16 == 0) {
                            statePc = 204;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        var7.a(-119, (bf) (Object) var11);
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        if (var10.field_q > var11.field_q) {
                            statePc = 176;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        var10 = var11;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        var12 = 0;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (var12 >= var11.field_m) {
                            statePc = 203;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        var13 = var11.field_o[var12];
                        stackOut_179_0 = null;
                        stackOut_179_1 = (ki) var13;
                        stackIn_17_0 = stackOut_179_0;
                        stackIn_17_1 = stackOut_179_1;
                        stackIn_180_0 = stackOut_179_0;
                        stackIn_180_1 = stackOut_179_1;
                        if (var16 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (stackIn_180_0 == (Object) (Object) stackIn_180_1) {
                            statePc = 182;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        gl.a((Object[]) (Object) var11.field_o, var12 - -1, (Object[]) (Object) var11.field_o, var12, -var12 + var11.field_m);
                        var12--;
                        stackOut_182_0 = (ki) var11;
                        stackOut_182_1 = (ki) var11;
                        stackIn_183_0 = stackOut_182_0;
                        stackIn_183_1 = stackOut_182_1;
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        stackIn_183_0.field_m = stackIn_183_1.field_m - 1;
                        if (var16 == 0) {
                            statePc = 202;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (hd.field_u != var13.field_t) {
                            statePc = 188;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (var16 == 0) {
                            statePc = 202;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        var14 = (ki) (Object) var7.a(true);
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if (var14 == null) {
                            statePc = 196;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        stackOut_190_0 = (ki) var14;
                        stackOut_190_1 = (ki) var13;
                        stackIn_183_0 = stackOut_190_0;
                        stackIn_183_1 = stackOut_190_1;
                        stackIn_191_0 = stackOut_190_0;
                        stackIn_191_1 = stackOut_190_1;
                        if (var16 != 0) {
                            statePc = 183;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (stackIn_191_0 != stackIn_191_1) {
                            statePc = 195;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if (var16 == 0) {
                            statePc = 202;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        var14 = (ki) (Object) var7.c((byte) -75);
                        if (var16 == 0) {
                            statePc = 189;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        var14 = (ki) (Object) var6.a(true);
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        if (var14 == null) {
                            statePc = 201;
                        } else {
                            statePc = 198;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        stackOut_198_0 = (ki) var13;
                        stackOut_198_1 = (ki) var14;
                        stackIn_183_0 = stackOut_198_0;
                        stackIn_183_1 = stackOut_198_1;
                        stackIn_199_0 = stackOut_198_0;
                        stackIn_199_1 = stackOut_198_1;
                        if (var16 != 0) {
                            statePc = 183;
                        } else {
                            statePc = 199;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        if (stackIn_199_0 == stackIn_199_1) {
                            statePc = 202;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        var14 = (ki) (Object) var6.c((byte) -75);
                        if (var16 == 0) {
                            statePc = 197;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        var6.a(-107, (bf) (Object) var13);
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        var12++;
                        if (var16 == 0) {
                            statePc = 178;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        if (var16 == 0) {
                            statePc = 166;
                        } else {
                            statePc = 204;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        var10.field_x = true;
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        var5_int++;
                        if (var16 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 206;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        stackOut_206_0 = 0;
                        stackIn_207_0 = stackOut_206_0;
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        var5_int = stackIn_207_0;
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        if (~var4.field_m >= ~var5_int) {
                            statePc = 213;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        var4.field_o[var5_int].a(true, var4);
                        var5_int++;
                        if (var16 != 0) {
                            statePc = 235;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        if (var16 == 0) {
                            statePc = 208;
                        } else {
                            statePc = 211;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        var5 = (il) (Object) rf.field_a.a((byte) -117);
                        statePc = 214;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        if (null == var5) {
                            statePc = 225;
                        } else {
                            statePc = 215;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        stackOut_215_0 = var5.field_j;
                        stackIn_226_0 = stackOut_215_0;
                        stackIn_216_0 = stackOut_215_0;
                        if (var16 != 0) {
                            statePc = 226;
                        } else {
                            statePc = 216;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        if (stackIn_216_0 == var4) {
                            statePc = 222;
                        } else {
                            statePc = 217;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        if (var4 != var5.field_i) {
                            statePc = 224;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        var5.c(-19822);
                        aj.field_b.a(-8212, (ug) (Object) var5);
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        var5 = (il) (Object) rf.field_a.d((byte) 63);
                        if (var16 == 0) {
                            statePc = 214;
                        } else {
                            statePc = 225;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        var4.field_E = true;
                        var4.field_m = 0;
                        hd.field_u.a(-8212, (ug) (Object) var4);
                        stackOut_225_0 = (ki) var4;
                        stackIn_226_0 = stackOut_225_0;
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        stackIn_226_0.field_v = -1.0f + (float)(2.0 * Math.random());
                        if (0.009999999776482582f <= Math.abs(var4.field_v)) {
                            statePc = 229;
                        } else {
                            statePc = 227;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        var4.field_v = -1.0f;
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        var4.field_D = 10.0f;
                        if (var4.field_w == 0) {
                            statePc = 233;
                        } else {
                            statePc = 230;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        ua.i(83);
                        if (var16 == 0) {
                            statePc = 235;
                        } else {
                            statePc = 231;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        var4.field_n = 1;
                        gb.field_o = gb.field_o - 1;
                        ob.b((byte) -19);
                        statePc = 235;
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        var4.field_t = null;
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        var4 = (ki) (Object) ok.field_a.d((byte) 63);
                        if (var16 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 237;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        if (var1_int == 0) {
                            statePc = 273;
                        } else {
                            statePc = 238;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        ke.field_c = var3;
                        if (var2 == 0) {
                            statePc = 253;
                        } else {
                            statePc = 239;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        statePc = 241;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        dc.field_e = dc.field_e + 1;
                        ek.field_b = 0;
                        if (var3 <= 10) {
                            statePc = 246;
                        } else {
                            statePc = 242;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        statePc = 244;
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        e.a(248, (byte) 40, 7);
                        statePc = 246;
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        if (15 >= var3) {
                            statePc = 249;
                        } else {
                            statePc = 247;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        e.a(247, (byte) 40, 8);
                        statePc = 249;
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        if (var3 <= 20) {
                            statePc = 259;
                        } else {
                            statePc = 250;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        e.a(246, (byte) 40, 9);
                        if (var16 == 0) {
                            statePc = 259;
                        } else {
                            statePc = 251;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        statePc = 253;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        dc.field_e = 0;
                        ek.field_b = ek.field_b + 1;
                        if (var3 >= 30) {
                            statePc = 258;
                        } else {
                            statePc = 254;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        statePc = 256;
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        statePc = 259;
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        e.a(253, (byte) 40, 2);
                        statePc = 259;
                        continue stateLoop;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        if (4 > dc.field_e) {
                            statePc = 262;
                        } else {
                            statePc = 260;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        e.a(252, (byte) 40, 3);
                        statePc = 262;
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        if (dc.field_e < 5) {
                            statePc = 265;
                        } else {
                            statePc = 263;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        e.a(251, (byte) 40, 4);
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        if (dc.field_e >= 6) {
                            statePc = 268;
                        } else {
                            statePc = 266;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        e.a(250, (byte) 40, 5);
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        if (ek.field_b >= 50) {
                            statePc = 272;
                        } else {
                            statePc = 270;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        e.a(249, (byte) 40, 6);
                        if (var16 == 0) {
                            statePc = 278;
                        } else {
                            statePc = 273;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        if (!ub.field_a) {
                            statePc = 278;
                        } else {
                            statePc = 274;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        dc.field_e = 0;
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 277: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw la.a((Throwable) (Object) var1, "eb.G(" + param0 + ')');
                }
                case 278: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(boolean param0) {
        if (!this.l(-60)) {
            return;
        }
        try {
            sg.a(((eb) this).field_G.field_s, (byte) -120);
            if (!param0) {
                field_A = null;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "eb.M(" + param0 + ')');
        }
    }

    public static void k(int param0) {
        try {
            field_A = null;
            field_C = null;
            field_E = null;
            if (param0 > -42) {
                field_C = null;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "eb.BA(" + param0 + ')');
        }
    }

    private final int a(String param0, we param1, int param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == 35) {
                break L1;
              } else {
                ((eb) this).field_D = null;
                break L1;
              }
            }
            stackOut_3_0 = this.a(param1, param0, 35, param5, 120, param3, param2);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("eb.K(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    private final int a(we param0, String param1, int param2, int param3, int param4, String param5, int param6) {
        mh var8 = null;
        RuntimeException var8_ref = null;
        vg var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var8 = new mh(20, param6, param4 + param3, 25, param0, false, 120, 3, t.field_z, 16777215, param5);
            ((eb) this).b((byte) -111, (we) (Object) var8);
            var9 = new vg(((ag) (Object) param0).a(param4 ^ 88), param1, 126, var8.field_p + param6, 25 + param3, param2);
            var9.field_o = (of) this;
            ((eb) this).b((byte) -95, (we) (Object) var9);
            stackOut_0_0 = var9.field_p + var8.field_p;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8_ref;
            stackOut_2_1 = new StringBuilder().append("eb.U(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 110)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param2 == 98) {
                stackOut_8_0 = ((eb) this).a((byte) 85, param0);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param2 == 99) {
                  stackOut_13_0 = ((eb) this).b(param0, false);
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  var5_int = -120 % ((37 - param3) / 50);
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("eb.V(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L1;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0 != 0;
    }

    public final void a(int param0) {
        try {
            ((hh) (Object) ((eb) this).field_G.a(-125)).f((byte) -88);
            if (param0 != 200) {
                eb.m(63);
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "eb.B(" + param0 + ')');
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
