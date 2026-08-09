/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends hi {
    static int[] field_u;
    static nd field_x;
    private ig field_w;
    static int field_s;
    static int field_p;
    static String field_v;
    static bd field_t;
    static boolean field_o;
    static bd field_y;
    static boolean[] field_r;
    static int field_q;

    final static void a(int param0, int param1) {
        int var2 = -40 % ((param1 - 55) / 37);
        ch.field_a = 1000000000L / (long)param0;
    }

    li(ig param0, ig param1) {
        super(param0);
        try {
            this.field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final bm a(String param0, byte param1) {
        bg var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        bm stackIn_6_0 = null;
        bm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_w instanceof sk) {
                var3 = ((sk) ((Object) this.field_w)).a((byte) 111);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.b(-71) != nd.field_d) {
                    stackIn_6_0 = bi.field_d;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = 32 % ((param1 - 3) / 42);
              if (param0.equals(this.field_w.field_n)) {
                stackIn_10_0 = nd.field_d;
                break L2;
              } else {
                stackIn_10_0 = bi.field_d;
                break L2;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("li.L(");

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
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static nc a(byte[] param0, int param1) {
        nc var2 = null;
        RuntimeException var2_ref = null;
        nc stackIn_2_0 = null;
        nc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 5116) {
              if (param0 != null) {
                var2 = new nc(param0, th.field_Jb, nh.field_O, sf.field_X, hd.field_r, bf.field_d, ja.field_e);
                uj.d(-126);
                stackIn_7_0 = (nc) (var2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("li.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void d(byte param0) {
        field_u = null;
        field_r = null;
        field_y = null;
        if (param0 > -34) {
            li.d((byte) 88);
        }
        field_t = null;
        field_v = null;
        field_x = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              si.g(param4, param2, param7, param0, param6);
              si.g(param7, param0, param5, param3, param6);
              si.g(param5, param3, param4, param2, param6);
              if (param0 < param2) {
                var8_int = param4;
                param4 = param7;
                param7 = var8_int;
                var8_int = param2;
                param2 = param0;
                param0 = var8_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 < param2) {
                var8_int = param4;
                param4 = param5;
                param5 = var8_int;
                var8_int = param2;
                param2 = param3;
                param3 = var8_int;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 <= param3) {
                break L3;
              } else {
                var8_int = param7;
                param7 = param5;
                param5 = var8_int;
                var8_int = param0;
                param0 = param3;
                param3 = var8_int;
                break L3;
              }
            }
            L4: {
              if (param5 <= param7) {
                var10 = param2;
                L5: while (true) {
                  if (var10 >= param0) {
                    var10 = param0;
                    L6: while (true) {
                      if (var10 >= param3) {
                        break L4;
                      } else {
                        var8_int = param4 - -((param5 + -param4) * (var10 + -param2) / (-param2 + param3));
                        var9 = (-param0 + var10) * (-param7 + param5) / (param3 + -param0) + param7;
                        si.a(var8_int, var10, 1 + (-var8_int + var9), param6);
                        var10++;
                        continue L6;
                      }
                    }
                  } else {
                    var8_int = param4 - -((param5 - param4) * (-param2 + var10) / (-param2 + param3));
                    var9 = param4 + (-param4 + param7) * (var10 + -param2) / (param0 + -param2);
                    si.a(var8_int, var10, 1 + -var8_int + var9, param6);
                    var10++;
                    continue L5;
                  }
                }
              } else {
                var10 = param2;
                L7: while (true) {
                  if (param0 <= var10) {
                    var10 = param0;
                    L8: while (true) {
                      if (param3 <= var10) {
                        break L4;
                      } else {
                        var9 = param4 + (-param4 + param5) * (-param2 + var10) / (-param2 + param3);
                        var8_int = param7 + (var10 + -param0) * (-param7 + param5) / (param3 + -param0);
                        si.a(var8_int, var10, -var8_int + (var9 - -1), param6);
                        var10++;
                        continue L8;
                      }
                    }
                  } else {
                    var9 = param4 + (var10 - param2) * (-param4 + param5) / (-param2 + param3);
                    var8_int = (-param4 + param7) * (-param2 + var10) / (-param2 + param0) + param4;
                    si.a(var8_int, var10, var9 - (var8_int + -1), param6);
                    var10++;
                    continue L7;
                  }
                }
              }
            }
            L9: {
              if (param1 == -1) {
                break L9;
              } else {
                field_v = (String) null;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var8), "li.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final String a(byte param0, String param1) {
        bg var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
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
              if (!(this.field_w instanceof sk)) {
                break L1;
              } else {
                var3 = ((sk) ((Object) this.field_w)).a((byte) 122);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.b(-112) != nd.field_d) {
                      break L2;
                    } else {
                      if (param1.equals(this.field_w.field_n)) {
                        break L2;
                      } else {
                        stackIn_5_0 = qm.field_Q;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_7_0 = var3.a(-60);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            var3_int = 83 / ((-24 - param0) / 35);
            if (!param1.equals(this.field_w.field_n)) {
              stackIn_11_0 = qm.field_Q;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("li.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    static {
        field_s = -1;
        field_u = new int[]{0, 0, 64, 192, 128};
        field_x = new nd(4, 1, 1, 1);
        field_v = "Orb coins: ";
        field_p = 0;
        field_r = new boolean[2];
    }
}
