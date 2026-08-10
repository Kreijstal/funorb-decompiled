/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ji extends f implements ki {
    static ns field_G;
    static ub field_I;
    static String field_F;
    private ja field_H;
    static bi[] field_E;
    static int[][] field_D;

    abstract int d(boolean param0);

    public static void g(byte param0) {
        field_E = null;
        field_G = null;
        field_F = null;
        field_I = null;
        int var1 = 50 / ((param0 - 71) / 37);
        field_D = (int[][]) null;
    }

    ji(int param0, int param1, int param2, int param3, iq param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract int f(byte param0);

    public final gk a(byte param0) {
        if (param0 < 58) {
            field_I = (ub) null;
        }
        return (gk) ((Object) this.field_H);
    }

    void a(ja param0, int param1) {
        try {
            this.field_H = param0;
            this.field_H.field_m = (ji) (this);
            if (param1 > -47) {
                String[] var4 = (String[]) null;
                ji.a((String[]) null, 46);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ji.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract boolean k(int param0);

    abstract int l(int param0);

    final static int a(int param0) {
        if (param0 > -115) {
            return -24;
        }
        return kl.field_t;
    }

    final static String a(CharSequence param0, boolean param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!tc.a(param0.charAt(var2_int), 2)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!tc.a(param0.charAt(-1 + var3), 2)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (-2 >= (var4 ^ -1)) {
                    if ((var4 ^ -1) >= -13) {
                      L5: {
                        var5 = new StringBuilder(var4);
                        var6 = var2_int;
                        if (param1) {
                          break L5;
                        } else {
                          ji.a(22);
                          break L5;
                        }
                      }
                      L6: while (true) {
                        if (var6 >= var3) {
                          if (var5.length() != 0) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L7: {
                            var7 = param0.charAt(var6);
                            if (ne.a(0, (char) var7)) {
                              var8 = os.a((char) var7, -31024);
                              if (var8 != 0) {
                                discarded$0 = var5.append((char) var8);
                                break L7;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      stackIn_16_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("ji.K(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          return (String) ((Object) stackIn_16_0);
        }
    }

    final static void a(String[] args, int param1) {
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var8 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = -1;
            var3 = 0;
            if (param1 == 62) {
              L1: while (true) {
                if (var3 >= args.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var4 = args[var3];
                    if (0 != (var2_int ^ -1)) {
                      args[var3] = re.a("<col=<%0>>", nc.a(param1, 4397), new String[]{Integer.toString(var2_int, 16)}) + var4;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var5 = ua.a(var4, "<col=", 0);
                    var6 = ua.a(var4, "</col>", param1 + -62);
                    if (var5 <= var6) {
                      if (var6 != -1) {
                        var2_int = -1;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      var7 = var4.indexOf('>', var5);
                      if (var7 != -1) {
                        var8 = var4.substring(5 + var5, var7);
                        var2_int = wm.a((CharSequence) ((Object) var8), 16, (byte) 11);
                        break L3;
                      } else {
                        var3++;
                        continue L1;
                      }
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("ji.F(");

            if (args == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static kj a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        kj stackIn_8_0 = null;
        Object stackIn_10_0 = null;
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
              if (param0 == -7416) {
                break L1;
              } else {
                ji.a(7);
                break L1;
              }
            }
            if (ue.field_a != fj.field_s) {
              L2: {
                if (rh.field_g != fj.field_s) {
                  break L2;
                } else {
                  if (!param1.equals(gp.field_b)) {
                    break L2;
                  } else {
                    fj.field_s = oj.field_Fb;
                    stackIn_8_0 = ij.field_a;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              gp.field_b = param1;
              ij.field_a = null;
              fj.field_s = ue.field_a;
              stackIn_10_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("ji.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kj) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (kj) ((Object) stackIn_10_0);
          }
        }
    }

    static {
        field_F = "Please try changing the following settings:  ";
    }
}
