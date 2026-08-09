/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static long field_f;
    static un field_g;
    static int field_h;
    static String field_b;
    static kc field_c;
    static int[] field_e;
    static String field_d;
    static int[] field_a;
    static String field_i;

    final static String a(byte param0, int param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_32_0 = null;
        String stackIn_35_0 = null;
        String stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (1 != param1) {
              if ((param1 ^ -1) != -3) {
                if (-4 != (param1 ^ -1)) {
                  if (param1 != 4) {
                    if (param1 == 5) {
                      stackIn_15_0 = sk.a(new String[]{param2}, sn.field_f, 120);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param1 != 6) {
                        if (-8 == (param1 ^ -1)) {
                          stackIn_22_0 = sk.a(new String[]{param2}, hm.field_c, 119);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (-9 == (param1 ^ -1)) {
                            stackIn_26_0 = sk.a(new String[]{param2}, field_i, 121);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            L1: {
                              if (param0 >= 95) {
                                break L1;
                              } else {
                                af.b(-15);
                                break L1;
                              }
                            }
                            if (param1 == 11) {
                              stackIn_32_0 = sk.a(new String[]{param2}, pm.field_d, 123);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if (param1 != 12) {
                                if (param1 == 13) {
                                  stackIn_39_0 = sk.a(new String[]{param2}, hb.field_e, 120);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  return null;
                                }
                              } else {
                                stackIn_35_0 = sk.a(new String[]{param2}, im.field_a, 126);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        stackIn_18_0 = sk.a(new String[]{param2}, eo.field_d, 124);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_11_0 = sk.a(new String[]{param2}, jg.field_d, 125);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = sk.a(new String[]{param2}, hd.field_z, 124);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = sk.a(new String[]{param2}, mi.field_Mb, 127);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = sk.a(new String[]{param2}, kd.field_k, 121);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var3);

            stackIn_42_1 = new StringBuilder().append("af.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L2;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_18_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_22_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_26_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_32_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_35_0;
                          } else {
                            return stackIn_39_0;
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
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static v a(int param0, byte param1, int param2, int param3) {
        v var4;
        int var5;
        int var6;
        var6 = TetraLink.field_J;
        var4 = (v) ((Object) tc.field_p.c(false));
        var5 = 90 / ((-53 - param1) / 40);
        L0: while (true) {
          if (var4 != null) {
            if (param0 != var4.field_n) {
              var4 = (v) ((Object) tc.field_p.a((byte) -70));
              continue L0;
            } else {
              return var4;
            }
          } else {
            var4 = new v();
            var4.field_n = param0;
            var4.field_q = param3;
            tc.field_p.a(var4, false);
            fd.a(-68, param2, var4);
            return var4;
          }
        }
    }

    final static void b(int param0) {
        oh var1 = null;
        oh var2 = null;
        int var3 = 0;
        int var4 = TetraLink.field_J;
        try {
            var1 = new oh(540, 140);
            sk.a((byte) 110, var1);
            vn.b();
            ra.a();
            en.field_K = 0;
            ni.a((byte) 71);
            var2 = var1.d();
            for (var3 = 0; -16 < (var3 ^ -1); var3++) {
                var2.c(-2, -2, 16777215);
                ra.a(4, 4, 0, 0, 540, 140);
            }
            oi.field_e.c();
            var1.d(0, 0);
            if (param0 != 18428) {
                field_d = (String) null;
            }
            dh.a(-581);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "af.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_i = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_e = null;
        if (param0 > -70) {
            af.a(6);
        }
    }

    static {
        field_d = "Reject";
        field_i = "<%0> has declined the invitation.";
        field_b = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_a = new int[]{1, 1, 1, 1, 2, 1, 1, 2};
        field_e = new int[128];
    }
}
