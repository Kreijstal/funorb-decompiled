/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static af field_d;
    static String field_b;
    static String field_g;
    static int[] field_f;
    static int field_h;
    static int field_e;
    static String field_a;
    static int field_c;

    final static fj a(byte param0, boolean param1) {
        bc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        bc var8 = null;
        j var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        L0: {
          var7 = TetraLink.field_J;
          var8 = kb.field_q;
          var2 = var8;
          var3 = var8.d((byte) -99);
          if (-1 == (var3 & 128 ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        bo.field_s = stackIn_3_0 != 0;
        ng.field_u = var3 & 127;
        og.field_i = var8.d((byte) -99);
        if (param0 == 85) {
          L1: {
            el.field_tc = var8.c(255);
            if (ng.field_u == 2) {
              hg.field_a = var8.e(127);
              n.field_O = var8.d(-1);
              break L1;
            } else {
              hg.field_a = 0;
              n.field_O = 0;
              break L1;
            }
          }
          L2: {
            if (1 != var8.d((byte) -99)) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var4 = stackIn_11_0;
            g.field_O = var8.g((byte) 81);
            if (var4 != 0) {
              TetraLink.field_M = var8.g((byte) 81);
              break L3;
            } else {
              TetraLink.field_M = g.field_O;
              break L3;
            }
          }
          L4: {
            L5: {
              if (-2 == (ng.field_u ^ -1)) {
                break L5;
              } else {
                if (4 != ng.field_u) {
                  vi.field_c = 0;
                  ab.field_U = null;
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            vi.field_c = var8.e(127);
            ab.field_U = var8.g((byte) 81);
            break L4;
          }
          L6: {
            if (!param1) {
              ml.field_fb = rh.a(119, var8, 80);
              ha.field_i = null;
              break L6;
            } else {
              var5 = var8.e(127);
              try {
                L7: {
                  L8: {
                    var9 = eh.field_p.a(var5, -128);
                    ml.field_fb = var9.h(-15);
                    if (TetraLink.field_M.equals(ph.field_w)) {
                      stackOut_23_0 = null;
                      stackIn_24_0 = (int[]) ((Object) stackOut_23_0);
                      break L8;
                    } else {
                      stackOut_22_0 = var9.field_v;
                      stackIn_24_0 = stackOut_22_0;
                      break L8;
                    }
                  }
                  ha.field_i = stackIn_24_0;
                  break L7;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  fk.a(param0 ^ -122, (Throwable) ((Object) var6), "CC1");
                  ml.field_fb = null;
                  ha.field_i = null;
                  break L9;
                }
              }
              break L6;
            }
          }
          return new fj(param1);
        } else {
          return (fj) null;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != 6945) {
            return;
        }
        field_a = null;
        field_b = null;
        field_f = null;
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_32_0 = null;
        String stackOut_27_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            var3_int = 26 / ((-70 - param1) / 51);
            if (param0 == null) {
              stackOut_3_0 = ua.field_e;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4 = param0.length();
                if (1 > var4) {
                  break L1;
                } else {
                  if ((var4 ^ -1) >= -13) {
                    L2: {
                      var5 = cc.a(param0, (byte) 108);
                      if (var5 == null) {
                        break L2;
                      } else {
                        if (var5.length() >= 1) {
                          L3: {
                            if (tk.a((byte) 81, var5.charAt(0))) {
                              break L3;
                            } else {
                              if (tk.a((byte) 81, var5.charAt(var5.length() + -1))) {
                                break L3;
                              } else {
                                var6 = 0;
                                var7 = 0;
                                L4: while (true) {
                                  if (var7 >= param0.length()) {
                                    if (0 < var6) {
                                      stackOut_32_0 = ed.field_U;
                                      stackIn_33_0 = stackOut_32_0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var8 = param0.charAt(var7);
                                      if (tk.a((byte) 81, (char) var8)) {
                                        var6++;
                                        break L5;
                                      } else {
                                        var6 = 0;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6 < 2) {
                                        break L6;
                                      } else {
                                        if (param2) {
                                          break L6;
                                        } else {
                                          stackOut_27_0 = hg.field_i;
                                          stackIn_28_0 = stackOut_27_0;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                    var7++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_18_0 = ed.field_U;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = ua.field_e;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_8_0 = ua.field_e;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var3);
            stackOut_34_1 = new StringBuilder().append("wg.C(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L7;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0;
                } else {
                  return stackIn_33_0;
                }
              }
            }
          }
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
            wg.a(123);
        }
        return mc.field_f + ((me.field_b << -931675422) + (ik.field_e << 1875813956));
    }

    static {
        field_d = new af();
        field_b = null;
        field_f = new int[]{2, 14, 15, 6, 5, 16, 17, 18, 12};
        field_h = 4;
        field_e = 0;
        field_g = "Enter name of friend to delete from list";
        field_a = "Updates will sent to the email address you've given";
    }
}
