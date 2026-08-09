/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends af {
    static String field_r;
    private int field_q;
    private int field_s;
    private o[] field_t;
    private int field_p;

    public static void d(int param0) {
        if (param0 != -1) {
            gh.a(9, 116);
            field_r = null;
            return;
        }
        field_r = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 == 16777215) {
          if (param6 <= param2) {
            if (param2 < param3 + param6) {
              if (param0 <= param5) {
                if (param0 + param1 <= param5) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param4.field_v) {
                if (param4.b(true)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param4 instanceof pj) {
                param2 = param2 & ((pj) ((Object) param4)).field_B;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2) {
                if (var6_int != 0) {
                  stackIn_14_0 = this.field_q;
                  break L3;
                } else {
                  stackIn_14_0 = this.field_s;
                  break L3;
                }
              } else {
                stackIn_14_0 = this.field_p;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_14_0;
              if (!param2) {
                stackIn_17_0 = 7105644;
                break L4;
              } else {
                stackIn_17_0 = 16777215;
                break L4;
              }
            }
            var8 = stackIn_17_0;
            if (param0 >= 113) {
              fg.a(param1 + (param4.field_j + (-this.field_t[0].field_r + param4.field_x >> -809370879)), param4.field_m + param3, param4.field_t, var7, this.field_t, (byte) 104);
              this.field_l.a(param4.field_i, param3 - -param4.field_m, param4.field_j + param1 + -2, param4.field_t, param4.field_x, var8, -1, 1, 1, this.field_l.field_F);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("gh.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        m var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (m) ((Object) gg.field_b.a((byte) 51));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        l.a(param0, param1 ^ -9489, var4);
                        var4 = (m) ((Object) gg.field_b.b(-121));
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 == 9543) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        gh.a('i', (byte) 57);
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var2), "gh.CA(" + param0 + ',' + param1 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -31433) {
              L1: {
                var2 = ub.a(-88, ti.a(param1, (byte) 44));
                if (var2 == null) {
                  var2 = "";
                  break L1;
                } else {
                  break L1;
                }
              }
              stackIn_7_0 = (String) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("gh.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 == -124) {
          if (param0 >= 48) {
            if (57 < param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          gh.a('￾', (byte) -29);
          if (param0 >= 48) {
            if (57 < param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private gh(int param0, int param1, int param2) {
        this.field_t = vk.field_i;
        this.field_l = uc.field_g;
        this.field_q = param1;
        this.field_p = param2;
        this.field_s = param0;
    }

    public gh() {
        this(2188450, 2591221, 9543);
    }

    static {
        field_r = "Change display name";
    }
}
