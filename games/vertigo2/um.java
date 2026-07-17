/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class um extends iq implements dq {
    static String field_H;
    static qg field_E;
    static ee field_F;
    static String field_C;
    iq[] field_G;
    static String field_D;

    void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        iq var6 = null;
        int var7 = 0;
        ur stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        ur stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        ur stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        ur stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        ur stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        ur stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (!param0) {
          L0: {
            if (param1 != 0) {
              break L0;
            } else {
              if (((um) this).field_B != null) {
                L1: {
                  stackOut_5_0 = ((um) this).field_B;
                  stackOut_5_1 = 1;
                  stackOut_5_2 = param2;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  if (param0) {
                    stackOut_7_0 = (ur) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = stackIn_7_2;
                    stackOut_7_3 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    break L1;
                  } else {
                    stackOut_6_0 = (ur) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = stackIn_6_2;
                    stackOut_6_3 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    break L1;
                  }
                }
                ((ur) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2, stackIn_8_3 != 0, (iq) this, param3);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (null == ((um) this).field_G) {
              break L2;
            } else {
              var5 = -1 + ((um) this).field_G.length;
              L3: while (true) {
                if (var5 < 0) {
                  break L2;
                } else {
                  var6 = ((um) this).field_G[var5];
                  if (var6 != null) {
                    var6.a(false, param1, param2 + ((um) this).field_o, ((um) this).field_t + param3);
                    var5--;
                    continue L3;
                  } else {
                    var5--;
                    continue L3;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, iq param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        iq var5 = null;
        iq var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (((um) this).field_G == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var4_int = ((um) this).field_G.length - 1;
              L1: while (true) {
                if (0 > var4_int) {
                  if (param0 >= 90) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    boolean discarded$2 = ((um) this).f(-89);
                    return false;
                  }
                } else {
                  L2: {
                    var5 = ((um) this).field_G[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (!var5.f(67)) {
                        break L2;
                      } else {
                        var4_int = var4_int - 1;
                        L3: while (true) {
                          if (0 > var4_int) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((um) this).field_G[var4_int];
                              if (var6 != null) {
                                if (!var6.a((byte) 116, param1)) {
                                  break L4;
                                } else {
                                  stackOut_14_0 = 1;
                                  stackIn_15_0 = stackOut_14_0;
                                  return stackIn_15_0 != 0;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var4_int = var4_int - 1;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int--;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("um.I(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 1 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var9 = 0;
        iq var10 = null;
        int var11 = 0;
        Object var12 = null;
        iq[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (null != ((um) this).field_G) {
              L1: {
                var13 = ((um) this).field_G;
                var9 = 0;
                if (param5 <= -107) {
                  break L1;
                } else {
                  var12 = null;
                  boolean discarded$2 = ((um) this).a(-62, 27, -12, -87, -46, (byte) -68, (iq) null);
                  break L1;
                }
              }
              L2: while (true) {
                if (var13.length <= var9) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  L3: {
                    var10 = var13[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.a(param0, param1 - -((um) this).field_o, ((um) this).field_t + param2, param3, param4, (byte) -128, param6)) {
                        break L3;
                      } else {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("um.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final int c(byte param0) {
        int var2 = 0;
        iq[] var3 = null;
        int var4 = 0;
        iq var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          var2 = 0;
          var3 = ((um) this).field_G;
          if (param0 <= -97) {
            break L0;
          } else {
            field_H = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.c((byte) -121);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, iq param6) {
        iq[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        iq var10_ref_iq = null;
        int var10 = 0;
        int var11 = 0;
        iq[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (null == ((um) this).field_G) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var12 = ((um) this).field_G;
              var8 = var12;
              var9 = 0;
              L1: while (true) {
                if (var9 >= var12.length) {
                  var10 = 29 / ((param5 - -87) / 35);
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    var10_ref_iq = var12[var9];
                    if (var10_ref_iq == null) {
                      break L2;
                    } else {
                      if (!var10_ref_iq.f(111)) {
                        break L2;
                      } else {
                        if (!var10_ref_iq.a(param0, param1, param2, param3, param4, (byte) 120, param6)) {
                          break L2;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8_ref;
            stackOut_15_1 = new StringBuilder().append("um.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final String a(boolean param0) {
        iq[] var2 = null;
        int var3 = 0;
        iq var4 = null;
        String var5 = null;
        int var6 = 0;
        iq[] var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (((um) this).field_G != null) {
          var7 = ((um) this).field_G;
          var2 = var7;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var7.length) {
              if (param0) {
                field_F = null;
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var7[var3];
              if (var4 != null) {
                var5 = var4.a(false);
                if (var5 != null) {
                  return var5;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void h(int param0) {
        gg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ri.field_r.b();
              mh.field_d.b();
              eh.field_c = eh.field_c - 1;
              if (eh.field_c == 0) {
                eh.field_c = 200;
                var1 = (gg) (Object) fm.field_b.a((byte) 100);
                L2: while (true) {
                  if (var1 == null) {
                    if (ro.field_b != null) {
                      var1 = (gg) (Object) ro.field_b.a((byte) 100);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_q.b(86)) {
                              var1.c(2);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (gg) (Object) ro.field_b.b(96);
                          continue L3;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      if (!var1.field_q.b(91)) {
                        var1.c(2);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var1 = (gg) (Object) fm.field_b.b(104);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (qc.field_v == null) {
                break L6;
              } else {
                if (!qc.field_v.g(-26083)) {
                  fo.field_e = null;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1_ref, "um.Q(" + 0 + 41);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((um) this).b(!param0 ? true : false);
    }

    public static void a(int param0) {
        field_D = null;
        field_C = null;
        field_F = null;
        field_E = null;
        field_H = null;
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param2 == -79) {
              L1: {
                if (((um) this).a(param3, -1, param1, param0)) {
                  ((um) this).a(param0, param3, true, param1);
                  this.a(param0, true, param3, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = (StringBuilder) param3;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("um.FA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    private final void a(Hashtable param0, boolean param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        iq var7 = null;
        int var8 = 0;
        int var9 = 0;
        iq[] var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (((um) this).field_G != null) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_H = null;
                  break L1;
                }
              }
              var10 = ((um) this).field_G;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var10.length) {
                  break L0;
                } else {
                  var7 = var10[var6];
                  StringBuilder discarded$29 = param2.append(10);
                  var8 = 0;
                  L3: while (true) {
                    if (var8 > param3) {
                      L4: {
                        if (var7 == null) {
                          StringBuilder discarded$30 = param2.append("null");
                          break L4;
                        } else {
                          StringBuilder discarded$31 = var7.a(param0, param3 - -1, (byte) -79, param2);
                          break L4;
                        }
                      }
                      var6++;
                      continue L2;
                    } else {
                      StringBuilder discarded$32 = param2.append(32);
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("um.K(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 41);
        }
    }

    private final iq a(byte param0) {
        iq[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        iq var5 = null;
        int var6 = 0;
        iq[] var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (((um) this).field_G != null) {
          var7 = ((um) this).field_G;
          var2 = var7;
          var3 = -9;
          var4 = 0;
          L0: while (true) {
            if (var4 < var7.length) {
              var5 = var7[var4];
              if (var5 != null) {
                if (var5.f(28)) {
                  return var5;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final boolean f(int param0) {
        if (param0 <= 3) {
            boolean discarded$0 = ((um) this).f(-7);
        }
        return null != this.a((byte) -78) ? true : false;
    }

    final void d(byte param0) {
        iq[] var2 = null;
        int var3 = 0;
        iq var4 = null;
        int var5 = 0;
        Object var6 = null;
        iq[] var7 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        var7 = ((um) this).field_G;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var7.length <= var3) {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$1 = ((um) this).a(101, -56, -30, -66, -25, (byte) -87, (iq) null);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.d((byte) 2);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final boolean a(iq param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = this.a(1, param0, (byte) -127);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("um.P(");
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
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 121 + 41);
        }
        return stackIn_1_0;
    }

    void a(byte param0, int param1, int param2, iq param3) {
        iq[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        iq var7 = null;
        int var8 = 0;
        iq[] var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            super.a((byte) 49, param1, param2, param3);
            if (param0 > 6) {
              if (null == ((um) this).field_G) {
                return;
              } else {
                var9 = ((um) this).field_G;
                var5 = var9;
                var6 = 0;
                L1: while (true) {
                  if (var9.length <= var6) {
                    break L0;
                  } else {
                    L2: {
                      var7 = var9[var6];
                      if (var7 != null) {
                        var7.a((byte) 46, ((um) this).field_o + param1, ((um) this).field_t + param2, param3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("um.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static void a(boolean param0, long param1) {
        if (param1 <= 0L) {
            return;
        }
        if (!param0) {
            field_C = null;
        }
        if (param1 % 10L != 0L) {
            an.a(param1, false);
        } else {
            an.a(-1L + param1, false);
            an.a(1L, false);
        }
    }

    private final boolean b(byte param0, iq param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 1) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(110, param1, 1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("um.O(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final boolean a(byte param0, iq param1) {
        iq[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        iq var5 = null;
        int var6 = 0;
        iq[] var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 116) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            var7 = ((um) this).field_G;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    if (!var5.a((byte) 116, param1)) {
                      break L3;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("um.DA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    um(int param0, int param1, int param2, int param3, ur param4) {
        super(param0, param1, param2, param3, param4, (uf) null);
    }

    private final boolean a(int param0, iq param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        iq var5 = null;
        iq var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (null != ((um) this).field_G) {
              var4_int = 0;
              L1: while (true) {
                if (((um) this).field_G.length <= var4_int) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ((um) this).field_G[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (!var5.f(65)) {
                        break L2;
                      } else {
                        var4_int = var4_int + param0;
                        L3: while (true) {
                          if (var4_int >= ((um) this).field_G.length) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((um) this).field_G[var4_int];
                              if (var6 != null) {
                                if (!var6.a((byte) 116, param1)) {
                                  break L4;
                                } else {
                                  stackOut_13_0 = 1;
                                  stackIn_14_0 = stackOut_13_0;
                                  return stackIn_14_0 != 0;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var4_int = var4_int + param0;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("um.L(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + -127 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        iq[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        iq var7 = null;
        int var8 = 0;
        iq[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_18_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (((um) this).field_G != null) {
              L1: {
                if (param1 == 13) {
                  break L1;
                } else {
                  field_C = null;
                  break L1;
                }
              }
              var9 = ((um) this).field_G;
              var5 = var9;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var9.length) {
                  var5_int = param2;
                  if (var5_int == 80) {
                    L3: {
                      if (!cr.field_eb[81]) {
                        stackOut_18_0 = this.a(param3, (byte) 121);
                        stackIn_19_0 = stackOut_18_0;
                        break L3;
                      } else {
                        stackOut_17_0 = this.b((byte) 104, param3);
                        stackIn_19_0 = stackOut_17_0;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  L4: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L4;
                    } else {
                      if (!var7.f(param1 ^ 87)) {
                        break L4;
                      } else {
                        if (!var7.a(param0, 13, param2, param3)) {
                          break L4;
                        } else {
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5_ref;
            stackOut_20_1 = new StringBuilder().append("um.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0;
    }

    abstract void b(boolean param0);

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        iq[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        iq var9 = null;
        int var10 = 0;
        iq[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (((um) this).field_G == null) {
              return;
            } else {
              var11 = ((um) this).field_G;
              var7 = var11;
              var8 = 0;
              L1: while (true) {
                if (var8 >= var11.length) {
                  L2: {
                    if (param1 == 46) {
                      break L2;
                    } else {
                      ((um) this).a(true, -8, 46, -97);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 != null) {
                      var9.a(param0, (byte) 46, param2 - -((um) this).field_o, ((um) this).field_t + param3, param4, param5);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var7_ref;
            stackOut_13_1 = new StringBuilder().append("um.HA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Match by...";
        field_C = "Year";
        field_D = "Show game chat from my friends";
    }
}
