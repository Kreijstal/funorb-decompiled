/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hi extends wb implements jb {
    static String field_l;
    static int field_k;
    static String field_h;
    private vi field_j;
    static hj[] field_g;
    static String field_f;
    static String field_e;
    static int[] field_i;
    static int field_m;

    final static void a(fj param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        Object var6 = null;
        Throwable var7 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param1 == 2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_h = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = (Object) (Object) cd.field_w;
                    // monitorenter cd.field_w
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (ll.field_a == param0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        // monitorexit var6
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        ll.field_a = param0;
                        if (ll.field_a != null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ml.field_c.a(param2, ll.field_a, param5, param4, param3, -107);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var6
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var7;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0) {
          return;
        } else {
          var5 = vf.field_a;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          L0: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            }
          }
        }
    }

    final static qj a(int param0, String[] param1) {
        qj var2 = null;
        var2 = new qj(false);
        var2.field_c = param1;
        if (param0 != 2) {
          field_h = null;
          return var2;
        } else {
          return var2;
        }
    }

    public final boolean c(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 25296) {
          if (null != ((hi) this).field_j.field_l) {
            if (((hi) this).field_j.field_l.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_e = null;
          if (null == ((hi) this).field_j.field_l) {
            return true;
          } else {
            L0: {
              if (((hi) this).field_j.field_l.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final String e(int param0) {
        int var2 = -80 / ((param0 - 25) / 58);
        return ((hi) this).a(-11300, ((hi) this).field_j.field_l);
    }

    final static String a(int param0, int param1, mg param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        int var6 = 0;
        String stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        try {
          L0: {
            var3_int = param2.e(125);
            if (param0 >= var3_int) {
              break L0;
            } else {
              var3_int = param0;
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param2.field_i = param2.field_i + cc.field_k.a(param2.field_i, var4, -1, 0, param2.field_j, var3_int);
          var5 = tj.a(var3_int, 0, 0, var4);
          var6 = 44 / ((-38 - param1) / 47);
          stackOut_2_0 = (String) var5;
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return null;
    }

    hi(vi param0) {
        ((hi) this).field_j = param0;
    }

    public final void a(vi param0, boolean param1) {
        if (param1) {
            field_f = null;
        }
    }

    final static int i(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!nf.e(32722)) {
            L1: {
              ab.field_j.a(jc.a(ig.field_fb, (byte) 81, bg.field_c), param0 ^ -1, jc.a(ua.field_a, (byte) 37, vl.field_d));
              if (!ab.field_j.a((byte) -1)) {
                break L1;
              } else {
                var1 = 1;
                break L1;
              }
            }
            var3 = param0;
            if (var1 != 0) {
              if (0 <= ab.field_j.field_h) {
                var3 = gg.field_O[ab.field_j.field_h];
                if (2 == var3) {
                  L2: {
                    me.c(true);
                    if (-1 != var3) {
                      break L2;
                    } else {
                      if (kg.field_m == 2) {
                        var4 = ji.b(107) - am.field_a;
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (0 < var6) {
                          break L2;
                        } else {
                          var3 = 2;
                          gb.a(true, 5, true);
                          break L2;
                        }
                      } else {
                        return var3;
                      }
                    }
                  }
                  return var3;
                } else {
                  if (var3 != -6) {
                    L3: {
                      if (-1 != (var3 ^ -1)) {
                        break L3;
                      } else {
                        if (kg.field_m == 2) {
                          var4 = ji.b(107) - am.field_a;
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (0 < var6) {
                            break L3;
                          } else {
                            var3 = 2;
                            gb.a(true, 5, true);
                            break L3;
                          }
                        } else {
                          return var3;
                        }
                      }
                    }
                    return var3;
                  } else {
                    L4: {
                      me.c(true);
                      if (-1 != (var3 ^ -1)) {
                        break L4;
                      } else {
                        if (kg.field_m == 2) {
                          var4 = ji.b(107) - am.field_a;
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (0 < var6) {
                            break L4;
                          } else {
                            var3 = 2;
                            gb.a(true, 5, true);
                            break L4;
                          }
                        } else {
                          return var3;
                        }
                      }
                    }
                    return var3;
                  }
                }
              } else {
                L5: {
                  if (var2 == 0) {
                    break L5;
                  } else {
                    if (kg.field_m != 2) {
                      me.c(true);
                      break L5;
                    } else {
                      if (-1 == (var3 ^ -1)) {
                        if (kg.field_m == 2) {
                          L6: {
                            var4 = ji.b(107) - am.field_a;
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (0 < var6) {
                              break L6;
                            } else {
                              var3 = 2;
                              gb.a(true, 5, true);
                              break L6;
                            }
                          }
                          return var3;
                        } else {
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    }
                  }
                }
                L7: {
                  if (-1 != (var3 ^ -1)) {
                    break L7;
                  } else {
                    if (kg.field_m == 2) {
                      var4 = ji.b(107) - am.field_a;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 < var6) {
                        break L7;
                      } else {
                        var3 = 2;
                        gb.a(true, 5, true);
                        break L7;
                      }
                    } else {
                      return var3;
                    }
                  }
                }
                return var3;
              }
            } else {
              L8: {
                if (var2 == 0) {
                  break L8;
                } else {
                  if (kg.field_m != 2) {
                    me.c(true);
                    break L8;
                  } else {
                    if (-1 == (var3 ^ -1)) {
                      if (kg.field_m == 2) {
                        L9: {
                          var4 = ji.b(107) - am.field_a;
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (0 < var6) {
                            break L9;
                          } else {
                            var3 = 2;
                            gb.a(true, 5, true);
                            break L9;
                          }
                        }
                        return var3;
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  }
                }
              }
              if (-1 == (var3 ^ -1)) {
                if (kg.field_m == 2) {
                  L10: {
                    var4 = ji.b(107) - am.field_a;
                    var6 = (int)((-var4 + 10999L) / 1000L);
                    if (0 < var6) {
                      break L10;
                    } else {
                      var3 = 2;
                      gb.a(true, 5, true);
                      break L10;
                    }
                  }
                  return var3;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            L11: {
              ab.field_j.e((byte) -74);
              if (ab.field_j.a((byte) -1)) {
                var1 = 1;
                break L11;
              } else {
                break L11;
              }
            }
            if (13 == ob.field_K) {
              var2 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    public static void g(int param0) {
        field_e = null;
        field_h = null;
        field_f = null;
        field_l = null;
        field_g = null;
        field_i = null;
        if (param0 >= -65) {
            boolean discarded$0 = hi.h(113);
        }
    }

    abstract String a(int param0, String param1);

    final static boolean h(int param0) {
        Object var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 2) {
          L0: {
            var2 = null;
            qj discarded$6 = hi.a(-29, (String[]) null);
            if (bd.field_u.a(false)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (bd.field_u.a(false)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void a(vi param0, int param1) {
        ((hi) this).b(-20959);
        if (param1 <= 27) {
            Object var4 = null;
            String discarded$0 = ((hi) this).a(87, (String) null);
        }
    }

    abstract qd a(String param0, byte param1);

    final qd a(byte param0) {
        if (param0 < 68) {
          field_f = null;
          return ((hi) this).a(((hi) this).field_j.field_l, (byte) -99);
        } else {
          return ((hi) this).a(((hi) this).field_j.field_l, (byte) -99);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "INSTRUCTIONS";
        field_h = "Password: ";
        field_f = "Connection lost - attempting to reconnect";
        field_e = "Loading fonts";
        field_m = -150;
        field_i = new int[8192];
    }
}
