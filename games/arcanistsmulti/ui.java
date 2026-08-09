/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends rl {
    static String field_u;
    private rn field_t;
    static String field_q;
    private rn field_r;
    static boolean field_v;
    static boolean field_s;
    static String field_w;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
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
            L1: {
              var6 = this.field_t.field_g.toLowerCase();
              var4 = param0.toLowerCase();
              if (param1 <= -114) {
                break L1;
              } else {
                field_u = (String) null;
                break L1;
              }
            }
            if (0 != var4.length()) {
              var5 = var4;
              if (bd.a((byte) -68, var5)) {
                stackIn_8_0 = ji.field_i;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!ko.a(-128, var5)) {
                  if (!e.b(-12055, var5)) {
                    if (!this.a(52, param0)) {
                      if (var6.length() <= 0) {
                        stackIn_32_0 = hk.field_r;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        if (hm.a(var5, var6, -1)) {
                          stackIn_22_0 = rg.field_f;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (sm.a(22230, var5, var6)) {
                            stackIn_26_0 = cj.field_e;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (w.a(var6, var5, 0)) {
                              stackIn_30_0 = rg.field_f;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              return ji.field_i;
                            }
                          }
                        }
                      }
                    } else {
                      stackIn_17_0 = wj.field_c;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = ko.field_g;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_11_0 = cm.field_h;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("ui.A(");

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
          throw aa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_26_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
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

    final static void a(int param0, boolean param1) {
        mn.a(param1, param0 + -95);
        le.c(param0 ^ 1, param1);
        if (param0 != 0) {
            ui.a(115, false);
        }
    }

    public static void d(int param0) {
        field_u = null;
        field_w = null;
        if (param0 < 15) {
            field_w = (String) null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    ui(rn param0, rn param1, rn param2) {
        super(param0);
        try {
            this.field_t = param1;
            this.field_r = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final eh a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        eh stackIn_2_0 = null;
        eh stackIn_5_0 = null;
        eh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -18 / ((-50 - param1) / 36);
            var4 = this.field_t.field_g.toLowerCase();
            var5 = param0.toLowerCase();
            if (-1 != (var5.length() ^ -1)) {
              if (dd.a(99, var5, var4)) {
                if (this.a(49, param0)) {
                  stackIn_9_0 = ra.field_k;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return nn.field_s;
                }
              } else {
                stackIn_5_0 = ra.field_k;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = ra.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ui.E(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = -117 % ((5 - param0) / 36);
              var3 = this.field_r.field_g.toLowerCase();
              var5 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L1;
              } else {
                if (-1 > (var5.length() ^ -1)) {
                  var6 = var3.lastIndexOf("@");
                  if ((var6 ^ -1) > -1) {
                    break L1;
                  } else {
                    if (var6 >= -1 + var3.length()) {
                      break L1;
                    } else {
                      var7 = var3.substring(0, var6);
                      var8 = var3.substring(var6 - -1);
                      if (-1 < (var5.indexOf(var7) ^ -1)) {
                        L2: {
                          if (-1 >= (var5.indexOf(var8) ^ -1)) {
                            stackIn_11_0 = 1;
                            break L2;
                          } else {
                            stackIn_11_0 = 0;
                            break L2;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        stackIn_7_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_13_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("ui.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              if (param2 == -38) {
                break L1;
              } else {
                field_w = (String) null;
                break L1;
              }
            }
            var5 = param1.length();
            var6 = param0.length();
            if (var5 == 0) {
              throw new IllegalArgumentException("Key cannot have zero length");
            } else {
              L2: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (0 != var8) {
                  var9_int = 0;
                  L3: while (true) {
                    var9_int = param3.indexOf(param1, var9_int);
                    if (-1 >= (var9_int ^ -1)) {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L4: while (true) {
                var11 = param3.indexOf(param1, var10);
                if (0 > var11) {
                  discarded$0 = var9.append(param3.substring(var10));
                  stackIn_16_0 = var9.toString();
                  break L0;
                } else {
                  discarded$1 = var9.append(param3.substring(var10, var11));
                  var10 = var5 + var11;
                  discarded$2 = var9.append(param0);
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ui.F(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
        return stackIn_16_0;
    }

    static {
        field_q = "Rating";
        field_s = true;
        field_u = "Only two targets left! Destroy the target at the base of the cliff to the left first.";
        field_w = "<%0> has withdrawn the request to join.";
    }
}
