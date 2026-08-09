/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static vj field_a;

    final static void a(int param0, int param1) {
        wi.b(-1);
        if (param1 != 1) {
            vj var3 = (vj) null;
            ui.a((ec) null, (byte) 78, 8, (vj) null);
        }
    }

    public static void a(int param0) {
        if (param0 != -19662) {
            return;
        }
        field_a = null;
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param2 == -3) {
                  break L1;
                } else {
                  ui.a(116, 53);
                  break L1;
                }
              }
              L2: {
                var3_int = param1.length();
                if (1 > var3_int) {
                  break L2;
                } else {
                  if (var3_int <= 12) {
                    L3: {
                      var4 = rh.a(param2 + -111, param1);
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (1 <= var4.length()) {
                          L4: {
                            if (je.a(var4.charAt(0), param2 + 116)) {
                              break L4;
                            } else {
                              if (!je.a(var4.charAt(-1 + var4.length()), param2 + 103)) {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (param1.length() <= var6) {
                                    if ((var5 ^ -1) < -1) {
                                      stackIn_35_0 = vd.field_a;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param1.charAt(var6);
                                      if (!je.a((char) var7, param2 ^ -126)) {
                                        var5 = 0;
                                        break L6;
                                      } else {
                                        var5++;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (-3 < (var5 ^ -1)) {
                                        break L7;
                                      } else {
                                        if (!param0) {
                                          stackIn_30_0 = pi.field_R;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          stackIn_20_0 = vd.field_a;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackIn_15_0 = p.field_b;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_10_0 = p.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = p.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("ui.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0;
                } else {
                  return stackIn_35_0;
                }
              }
            }
          }
        }
    }

    final static void a(ec param0, byte param1, int param2, vj param3) {
        try {
            wk.field_i = pk.d((byte) 9) * param2 / 1000;
            c.a(false, param3);
            int var4_int = 17 / ((28 - param1) / 32);
            vg.a(param3, false);
            ea.a(0, param3);
            cf.a(false);
            s.b((byte) 104);
            vb.field_n = -wk.field_i + 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ui.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
