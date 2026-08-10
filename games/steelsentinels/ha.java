/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha extends dl implements qn {
    static String field_R;
    static wk[] field_Q;
    static String field_S;
    private vn field_U;
    static int field_V;
    static wj field_T;
    static String field_P;

    abstract int h(byte param0);

    public final tl a(boolean param0) {
        if (param0) {
            this.h((byte) 56);
        }
        return (tl) ((Object) this.field_U);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var5_int = param1 + param0;
              var6 = param2 + param4;
              if (param0 > pb.field_i) {
                stackIn_4_0 = param0;
                break L1;
              } else {
                stackIn_4_0 = pb.field_i;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param4 > pb.field_l) {
                stackIn_7_0 = param4;
                break L2;
              } else {
                stackIn_7_0 = pb.field_l;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= pb.field_b) {
                stackIn_10_0 = pb.field_b;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 >= pb.field_d) {
                stackIn_13_0 = pb.field_d;
                break L4;
              } else {
                stackIn_13_0 = var6;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (pb.field_i > param0) {
                break L5;
              } else {
                if (pb.field_b > param0) {
                  var11 = var8 * pb.field_c - -param0;
                  var12 = 1 + (var10 + -var8) >> -909883775;
                  L6: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L5;
                    } else {
                      pb.field_g[var11] = 16777215;
                      var11 = var11 + pb.field_c * 2;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (param4 < pb.field_l) {
                break L7;
              } else {
                if (pb.field_d <= var6) {
                  break L7;
                } else {
                  var11 = var7 + param4 * pb.field_c;
                  var12 = -var7 + var9 + 1 >> 1141241665;
                  L8: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L7;
                    } else {
                      pb.field_g[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                }
              }
            }
            if (param3 == 0) {
              L9: {
                if (pb.field_i > var5_int) {
                  break L9;
                } else {
                  if (pb.field_b > var5_int) {
                    var11 = ((1 & -param0 + var5_int) + var8) * pb.field_c + var5_int;
                    var12 = -var8 + var10 + 1 >> -1245447519;
                    L10: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L9;
                      } else {
                        pb.field_g[var11] = 16777215;
                        var11 = var11 + pb.field_c * 2;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                if (pb.field_l > param4) {
                  break L11;
                } else {
                  if (pb.field_d <= var6) {
                    break L11;
                  } else {
                    var11 = var6 * pb.field_c + (var7 + (1 & var6 + -param4));
                    var12 = -var7 + 1 - -var9 >> -1789499263;
                    L12: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L11;
                      } else {
                        pb.field_g[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "ha.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract int k(int param0);

    ha(int param0, int param1, int param2, int param3, qk param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static String a(java.applet.Applet param0, String param1, int param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            Object stackIn_15_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            StringBuilder stackIn_21_1 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var7 = SteelSentinels.field_G;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (hn.a(param0, (byte) -96, "getcookies"));
                    var4 = ka.a(';', false, var3);
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var6 = var4[var5].indexOf('=');
                          if ((var6 ^ -1) > -1) {
                            break L3;
                          } else {
                            if (!var4[var5].substring(0, var6).trim().equals(param1)) {
                              break L3;
                            } else {
                              stackIn_8_0 = var4[var5].substring(var6 - -1).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (param2 != -15645) {
                    field_P = (String) null;
                    stackIn_15_0 = null;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_18_0 = (RuntimeException) (var3_ref2);

                stackIn_18_1 = new StringBuilder().append("ha.DA(");

                if (param0 == null) {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L5;
                } else {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

                if (param1 == null) {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L6;
                } else {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L6;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_15_0);
            } else {
              return stackIn_8_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int j(int param0);

    abstract boolean i(int param0);

    void a(byte param0, vn param1) {
        try {
            this.field_U = param1;
            this.field_U.field_n = (ha) (this);
            if (param0 >= -17) {
                this.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ha.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(boolean param0) {
        field_R = null;
        field_T = null;
        if (!param0) {
            String var2 = (String) null;
            ha.a((java.applet.Applet) null, (String) null, 37);
        }
        field_S = null;
        field_P = null;
        field_Q = null;
    }

    final static void a(int param0, int param1, byte param2, mi param3, int param4, wk param5, int param6, int param7, int param8, int param9, int param10) {
        try {
            pa.field_b = param6;
            ij.field_W = param10;
            be.field_e = param4;
            vl.field_t = param8;
            sg.field_e = param7;
            int var11_int = 51 / ((param2 - 42) / 49);
            ej.field_y = param1;
            ci.field_g = param9;
            hl.field_r = param5;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ha.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    final static int a(byte param0) {
        int var1 = 117 / ((2 - param0) / 58);
        return ob.field_q;
    }

    static {
        field_R = "The <%0> module cannot be engineered at this time.";
        field_V = -1;
        field_S = "CONFIGURATION";
        field_P = "Find opponents";
    }
}
