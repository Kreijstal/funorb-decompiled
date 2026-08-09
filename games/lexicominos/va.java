/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends tj {
    private rl field_n;
    static db field_m;
    private rl field_o;
    static String field_l;

    va(rl param0, rl param1, rl param2) {
        super(param0);
        try {
            this.field_n = param2;
            this.field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "va.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(char param0, boolean param1) {
        if (!param1) {
            return 107;
        }
        return param0 <= 0 ? -1 : param0;
    }

    public static void d(byte param0) {
        field_m = null;
        field_l = null;
        if (param0 >= -80) {
            field_l = (String) null;
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = this.field_o.field_u.toLowerCase();
              if (param0 == -126) {
                break L1;
              } else {
                var6 = (String) null;
                this.a((byte) -44, (String) null);
                break L1;
              }
            }
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (ph.a((byte) 107, var5)) {
                stackIn_8_0 = pe.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (sh.d(var5, (byte) 50)) {
                  stackIn_12_0 = rg.field_d;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (hd.a(var5, 17)) {
                    stackIn_16_0 = td.field_b;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!this.a(param1, true)) {
                      if (var7.length() > 0) {
                        if (!bi.a((byte) -124, var7, var5)) {
                          if (pd.a(var7, var5, 95)) {
                            stackIn_29_0 = vf.field_s;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (!ni.a((byte) 120, var5, var7)) {
                              stackIn_34_0 = pe.field_a;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackIn_32_0 = uf.field_l;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_25_0 = uf.field_l;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_22_0 = qb.field_a;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_19_0 = rb.field_e;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
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
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("va.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L2;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_32_0;
                        } else {
                          return stackIn_34_0;
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

    private final boolean a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = this.field_n.field_u.toLowerCase();
              if (param1) {
                break L1;
              } else {
                var8 = (String) null;
                this.a((byte) 48, (String) null);
                break L1;
              }
            }
            L2: {
              var4 = param0.toLowerCase();
              if (var9.length() <= 0) {
                break L2;
              } else {
                if ((var4.length() ^ -1) < -1) {
                  var5 = var9.lastIndexOf("@");
                  if (var5 < 0) {
                    break L2;
                  } else {
                    if (-1 + var9.length() > var5) {
                      var6 = var9.substring(0, var5);
                      var7 = var9.substring(1 + var5);
                      if (-1 >= (var4.indexOf(var6) ^ -1)) {
                        stackIn_11_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if (var4.indexOf(var7) >= 0) {
                            stackIn_15_0 = 1;
                            break L3;
                          } else {
                            stackIn_15_0 = 0;
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_17_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("va.A(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final sc a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        sc stackIn_3_0 = null;
        sc stackIn_7_0 = null;
        sc stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_o.field_u.toLowerCase();
            var4 = param1.toLowerCase();
            if (param0 == var4.length()) {
              stackIn_3_0 = ni.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!ui.a(var3, var4, (byte) -118)) {
                stackIn_7_0 = ni.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.a(param1, true)) {
                  stackIn_11_0 = ni.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return rh.field_p;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("va.H(").append(param0).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    static {
        field_l = "OK";
    }
}
