/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends ip {
    static String field_m;
    static String field_q;
    private rm field_n;
    static String field_o;
    static int field_r;
    private rm field_p;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 >= 44) {
              je.a((byte) -96, param1, param2, bf.field_d, param4, param3);
              var5_int = param4 + gf.field_i * param2;
              var6 = -param3 + gf.field_i;
              var7 = -param1;
              L1: while (true) {
                if (-1 >= (var7 ^ -1)) {
                  qe.b(param4, param2, param3, param1, 2105376, 192, 80);
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= 4) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      qe.a(param4 + var7, param2 + var7, param3 - var7 * 2, param1 + -(2 * var7), 16777215, -(var7 * 16) + 64, 80 - var7 * 20);
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var8 = -param3;
                  L3: while (true) {
                    if (var8 >= 0) {
                      var5_int = var5_int + var6;
                      var7++;
                      continue L1;
                    } else {
                      gf.field_b[var5_int] = mp.a(gf.field_b[var5_int], -2147483648);
                      var5_int++;
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var5), "vo.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 44) {
                break L1;
              } else {
                this.field_n = (rm) null;
                break L1;
              }
            }
            var6 = this.field_n.field_w.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (!sm.a(1, var5)) {
                if (!dj.a(6623, var5)) {
                  if (j.a(var5, (byte) -124)) {
                    stackIn_14_0 = di.field_k;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (this.a(param1, (byte) -106)) {
                      stackIn_18_0 = tp.field_x;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (var6.length() > 0) {
                        if (gk.a(var6, var5, 16777215)) {
                          stackIn_25_0 = qd.field_b;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!gl.a(var6, 0, var5)) {
                            if (!uo.a((byte) -69, var6, var5)) {
                              stackIn_33_0 = fm.field_j;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackIn_31_0 = qd.field_b;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            stackIn_28_0 = mf.field_a;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_21_0 = dl.field_a;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = ad.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = fm.field_j;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("vo.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L2;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_31_0;
                        } else {
                          return stackIn_33_0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    vo(rm param0, rm param1, rm param2) {
        super(param0);
        try {
            this.field_p = param2;
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "vo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final od a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        od stackIn_3_0 = null;
        od stackIn_7_0 = null;
        od stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 113 % ((param1 - 5) / 44);
            var4 = this.field_n.field_w.toLowerCase();
            var5 = param0.toLowerCase();
            if (-1 == (var5.length() ^ -1)) {
              stackIn_3_0 = pd.field_J;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!wm.a(var4, var5, (byte) -83)) {
                stackIn_7_0 = pd.field_J;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.a(param0, (byte) -117)) {
                  stackIn_11_0 = pd.field_J;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return c.field_d;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("vo.C(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_m = null;
        field_o = null;
        if (param0 != 1) {
            vo.e(-81);
        }
    }

    private final boolean a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -95) {
                break L1;
              } else {
                field_r = -102;
                break L1;
              }
            }
            L2: {
              var3 = this.field_p.field_w.toLowerCase();
              var4 = param0.toLowerCase();
              if (-1 <= (var3.length() ^ -1)) {
                break L2;
              } else {
                if ((var4.length() ^ -1) >= -1) {
                  break L2;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if (-1 < (var5 ^ -1)) {
                    break L2;
                  } else {
                    if (var5 >= var3.length() + -1) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if (var4.indexOf(var6) >= 0) {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (0 <= var4.indexOf(var7)) {
                          stackIn_13_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_15_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("vo.E(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    static {
        field_q = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_m = "<col=178B8B>Use skill - <%0></col>";
        field_o = "<col=8B1717>Disarm</col>";
    }
}
