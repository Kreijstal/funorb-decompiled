/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends br {
    static String field_k;
    static boolean field_i;
    int[] field_h;
    static String field_j;
    static String field_f;
    int field_g;

    final static int b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        vh.field_Gb = null;
        vo.field_o = null;
        la.field_d = 0;
        var2 = qe.field_f;
        qe.field_f = ll.field_b;
        ll.field_b = var2;
        if (param0 != 51) {
          if (param0 != 50) {
            i.field_a.field_p = 1;
            i.field_a.field_n = i.field_a.field_n + 1;
            if (i.field_a.field_n < 2) {
              L0: {
                if (i.field_a.field_n < 2) {
                  break L0;
                } else {
                  if (param0 != 50) {
                    break L0;
                  } else {
                    return 5;
                  }
                }
              }
              if (4 > i.field_a.field_n) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param0 == 51) {
                return 2;
              } else {
                L1: {
                  if (i.field_a.field_n < 2) {
                    break L1;
                  } else {
                    if (param0 != 50) {
                      break L1;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > i.field_a.field_n) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            i.field_a.field_p = 5;
            i.field_a.field_n = i.field_a.field_n + 1;
            if (i.field_a.field_n < 2) {
              L2: {
                if (i.field_a.field_n < 2) {
                  break L2;
                } else {
                  if (param0 != 50) {
                    break L2;
                  } else {
                    return 5;
                  }
                }
              }
              if (4 > i.field_a.field_n) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param0 == 51) {
                return 2;
              } else {
                L3: {
                  if (i.field_a.field_n < 2) {
                    break L3;
                  } else {
                    if (param0 != 50) {
                      break L3;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > i.field_a.field_n) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          }
        } else {
          i.field_a.field_p = 2;
          i.field_a.field_n = i.field_a.field_n + 1;
          if (i.field_a.field_n >= 2) {
            if (param0 == 51) {
              return 2;
            } else {
              if (i.field_a.field_n >= 2) {
                if (param0 != 50) {
                  if (4 > i.field_a.field_n) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return 5;
                }
              } else {
                if (4 > i.field_a.field_n) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (i.field_a.field_n >= 2) {
              if (param0 == 50) {
                return 5;
              } else {
                if (4 > i.field_a.field_n) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              if (4 > i.field_a.field_n) {
                return -1;
              } else {
                return 1;
              }
            }
          }
        }
    }

    final static ja[] a(int param0, int param1, int param2, int param3, int param4) {
        return qa.a(0, 0, 1, 3, (byte) 127, 65793, 0, 1, 1);
    }

    final static ul a(int param0, int param1) {
        int discarded$0 = 0;
        return wm.a(param1, 1, true, false, 19);
    }

    public static void a(int param0) {
        field_k = null;
        field_f = null;
        field_j = null;
    }

    final static int a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!ba.c(-1)) {
                aq.field_B.a(iq.a(bo.field_d, -1, bd.field_g), 76, iq.a(ka.field_t, -1, vb.field_f));
                L2: {
                  if (!aq.field_B.c(-85)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (aq.field_B.field_d >= 0) {
                        L5: {
                          var3 = v.field_b[aq.field_B.field_d];
                          if (2 == var3) {
                            break L5;
                          } else {
                            if (5 == var3) {
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        ek.i(81);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (2 == ho.field_q) {
                      break L3;
                    } else {
                      ek.i(126);
                      break L3;
                    }
                  }
                }
                L6: {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (ho.field_q == 2) {
                      var4 = bl.a((byte) 118) - so.field_s;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (var6 <= 0) {
                        eb.a(false, true, 5);
                        var3 = 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                stackOut_29_0 = var3;
                stackIn_30_0 = stackOut_29_0;
                break L0;
              } else {
                L7: {
                  aq.field_B.d(99);
                  if (!aq.field_B.c(-85)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (sj.field_p == 13) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "u.C(" + -58 + 41);
        }
        return stackIn_30_0;
    }

    final static ll a(int param0, go param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ll var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        ll stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll stackOut_6_0 = null;
        Object stackOut_1_0 = null;
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
            var8 = m.a(param5, param1, param4, 0, param2, 88);
            var6 = var8;
            if (param0 == 10386) {
              if (var8 != null) {
                var7 = new ll();
                var7.field_i = var8;
                java.awt.Component discarded$2 = var7.field_i.add((java.awt.Component) (Object) var7);
                var7.setBounds(0, 0, param5, param2);
                var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
                var7.requestFocus();
                stackOut_6_0 = (ll) var7;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ll) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6_ref;
            stackOut_8_1 = new StringBuilder().append("u.A(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + 0 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_7_0;
    }

    private u() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "(1 player wants to join)";
        field_j = "Rematch?";
        field_f = "Invalid name";
    }
}
