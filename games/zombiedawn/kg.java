/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends pm {
    private tb field_h;
    static int[] field_g;
    private tb field_j;
    static int field_f;
    static volatile boolean field_l;
    static int field_i;
    static int field_k;

    public static void d(int param0) {
        if (param0 != -2314) {
            field_l = true;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = this.field_h.field_o.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (tk.a((byte) 84, var5)) {
                stackIn_6_0 = ci.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1 < -94) {
                    break L1;
                  } else {
                    this.field_h = (tb) null;
                    break L1;
                  }
                }
                if (!cj.a((byte) 15, var5)) {
                  if (!tb.a(-10723, var5)) {
                    if (this.b(param0, 1)) {
                      stackIn_18_0 = dl.field_e;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((var6.length() ^ -1) < -1) {
                        if (!lf.a(var6, var5, -7235)) {
                          if (!ic.a(var5, var6, 0)) {
                            if (!t.a(var5, (byte) 96, var6)) {
                              stackIn_32_0 = ci.field_a;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackIn_30_0 = kb.field_h;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            stackIn_27_0 = uo.field_a;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_24_0 = kb.field_h;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_21_0 = dp.field_g;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_14_0 = eo.field_i;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_11_0 = dj.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("kg.B(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L2;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
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
                      return stackIn_24_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_30_0;
                        } else {
                          return stackIn_32_0;
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

    private final boolean b(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int stackIn_11_0 = 0;
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
              if (param1 == 1) {
                break L1;
              } else {
                var8 = (String) null;
                this.a((String) null, (byte) 125);
                break L1;
              }
            }
            L2: {
              var9 = this.field_j.field_o.toLowerCase();
              var4 = param0.toLowerCase();
              if (var9.length() <= 0) {
                break L2;
              } else {
                if (-1 > (var4.length() ^ -1)) {
                  var5 = var9.lastIndexOf("@");
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (var5 < var9.length() - 1) {
                      var6 = var9.substring(0, var5);
                      var7 = var9.substring(var5 + 1);
                      if (-1 >= (var4.indexOf(var6) ^ -1)) {
                        stackIn_11_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (-1 < (var4.indexOf(var7) ^ -1)) {
                          break L2;
                        } else {
                          stackIn_14_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
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
            stackIn_16_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("kg.M(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    kg(tb param0, tb param1, tb param2) {
        super(param0);
        try {
            this.field_h = param1;
            this.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final rh a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        rh stackIn_2_0 = null;
        rh stackIn_5_0 = null;
        rh stackIn_8_0 = null;
        rh stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_h.field_o.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              if (param1 == 2) {
                if (on.a((byte) -23, var4, var3)) {
                  if (this.b(param0, 1)) {
                    stackIn_12_0 = uc.field_b;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return mc.field_g;
                  }
                } else {
                  stackIn_8_0 = uc.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (rh) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = uc.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("kg.I(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    static {
        field_g = ae.a(14821);
        field_l = false;
    }
}
