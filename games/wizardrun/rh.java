/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends mf {
    static int[] field_m;
    private og field_l;
    private og field_k;

    final ok a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ok stackIn_3_0 = null;
        ok stackIn_7_0 = null;
        ok stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_l.field_k.toLowerCase();
            var4 = param1.toLowerCase();
            if (param0 == (var4.length() ^ -1)) {
              stackIn_3_0 = hg.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!od.a(var4, var3, 67)) {
                stackIn_7_0 = hg.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.a((byte) 38, param1)) {
                  stackIn_11_0 = hg.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return gf.field_V;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("rh.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    rh(og param0, og param1, og param2) {
        super(param0);
        try {
            this.field_l = param1;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_k.field_k.toLowerCase();
              if (param0 == 38) {
                break L1;
              } else {
                rh.f(115);
                break L1;
              }
            }
            L2: {
              var4 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L2;
              } else {
                if (-1 > (var4.length() ^ -1)) {
                  var5 = var3.lastIndexOf("@");
                  if ((var5 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (var5 >= var3.length() + -1) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 - -1);
                      if (-1 >= (var4.indexOf(var6) ^ -1)) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if (0 <= var4.indexOf(var7)) {
                            stackIn_14_0 = 1;
                            break L3;
                          } else {
                            stackIn_14_0 = 0;
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_16_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("rh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    public static void f(int param0) {
        int var1 = 98 % ((param0 - -57) / 39);
        field_m = null;
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
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
            var7 = this.field_l.field_k.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              L1: {
                if (param1 == -1) {
                  break L1;
                } else {
                  var6 = (String) null;
                  this.a(126, (String) null);
                  break L1;
                }
              }
              var5 = var4;
              if (!ub.a(var5, param1 ^ -125)) {
                if (ri.a((byte) -56, var5)) {
                  stackIn_11_0 = dc.field_o;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (p.a(false, var5)) {
                    stackIn_15_0 = pj.field_L;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (!this.a((byte) 38, param0)) {
                      if (0 >= var7.length()) {
                        stackIn_33_0 = ug.field_F;
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        if (pd.a(var7, (byte) -117, var5)) {
                          stackIn_23_0 = fi.field_v;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (!pa.a(0, var7, var5)) {
                            if (!id.a(var5, var7, 0)) {
                              stackIn_31_0 = bh.field_d;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              stackIn_29_0 = fi.field_v;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          } else {
                            stackIn_26_0 = gi.field_d;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_18_0 = wh.field_c;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_7_0 = bh.field_d;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("rh.A(");

            if (param0 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_23_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_26_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_29_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
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

    static {
    }
}
