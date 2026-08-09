/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends ia {
    static String field_q;
    private jf field_n;
    static gk[] field_r;
    static String field_o;
    private jf field_p;

    final vd a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        vd stackIn_4_0 = null;
        vd stackIn_7_0 = null;
        vd stackIn_10_0 = null;
        vd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_p.field_y.toLowerCase();
              var4 = param0.toLowerCase();
              if (param1 == -1) {
                break L1;
              } else {
                var5 = (String) null;
                vm.b((String) null, 32);
                break L1;
              }
            }
            if (var4.length() != 0) {
              if (lk.a(var4, (byte) 62, var3)) {
                if (!this.b(1, param0)) {
                  stackIn_12_0 = vf.field_b;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = fa.field_d;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = fa.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = fa.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("vm.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_10_0 = 0;
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
              if (param0 == 1) {
                break L1;
              } else {
                vm.d((byte) 43);
                break L1;
              }
            }
            L2: {
              var3 = this.field_n.field_y.toLowerCase();
              var4 = param1.toLowerCase();
              if (-1 <= (var3.length() ^ -1)) {
                break L2;
              } else {
                if (0 < var4.length()) {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (var5 >= var3.length() + -1) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if (-1 >= (var4.indexOf(var6) ^ -1)) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (-1 < (var4.indexOf(var7) ^ -1)) {
                          break L2;
                        } else {
                          stackIn_13_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  return false;
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

            stackIn_18_1 = new StringBuilder().append("vm.G(").append(param0).append(',');

            if (param1 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = this.field_p.field_y.toLowerCase();
            var4 = param1.toLowerCase();
            if (0 != var4.length()) {
              var5 = var4;
              if (mn.a(-30157, var5)) {
                stackIn_6_0 = el.field_Zb;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (vm.b(var5, 109)) {
                  stackIn_10_0 = ua.field_u;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (eb.b(var5, 29974)) {
                    stackIn_14_0 = pc.field_s;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (param0 == 100) {
                      if (!this.b(1, param1)) {
                        if (var6.length() <= 0) {
                          stackIn_35_0 = tm.field_b;
                          decompiledRegionSelector0 = 9;
                          break L0;
                        } else {
                          if (!nj.a(var5, 300, var6)) {
                            if (fj.a(var6, -7036, var5)) {
                              stackIn_28_0 = kj.field_C;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              if (!wl.a(var5, true, var6)) {
                                stackIn_33_0 = el.field_Zb;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              } else {
                                stackIn_31_0 = pd.field_R;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              }
                            }
                          } else {
                            stackIn_24_0 = pd.field_R;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_20_0 = ej.field_z;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = (String) null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("vm.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L1;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_24_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_28_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_31_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_33_0;
                        } else {
                          return stackIn_35_0;
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

    vm(jf param0, jf param1, jf param2) {
        super(param0);
        try {
            this.field_p = param1;
            this.field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "vm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        int var1 = 56 % ((param0 - 10) / 37);
        field_o = null;
        field_q = null;
        field_r = null;
    }

    final static void a(int param0, int param1, rh param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        kj var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = mm.field_g;
              var6.a(param0, (byte) -117);
              var6.field_p = var6.field_p + 1;
              var4 = var6.field_p;
              var6.a((byte) 108, 1);
              if (param2.field_r != null) {
                var6.a((byte) 125, param2.field_r.length);
                var6.a(param2.field_r.length, (byte) -122, 0, param2.field_r);
                break L1;
              } else {
                var6.a((byte) 113, 0);
                break L1;
              }
            }
            var6.f(-101, var4);
            var6.field_p = var6.field_p - 4;
            param2.field_x = var6.i(0);
            var6.b((byte) 101, var6.field_p + -var4);
            if (param1 < -38) {
              break L0;
            } else {
              var5 = (String) null;
              vm.b((String) null, 57);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vm.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static boolean b(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param0.length() <= var2_int) {
                var3 = 49 / ((param1 - -23) / 51);
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  if (kf.a((char) var3, (byte) -59)) {
                    break L2;
                  } else {
                    if (!oa.a(-4278, (char) var3)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("vm.E(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    static {
        field_q = "A highscore of <%0> has been achieved!";
        field_o = "<%1> was too close to a missile intercepted by <%0>";
    }
}
