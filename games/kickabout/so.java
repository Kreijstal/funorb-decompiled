/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static int field_e;
    static ut[] field_d;
    static int[][] field_f;
    static int field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        int var5;
        var5 = Kickabout.field_G;
        if (param2) {
          if (param1) {
            if (2 != param0) {
              if (-4 == (param0 ^ -1)) {
                if (!param3) {
                  gu.b(2, (byte) 60, vc.field_E[5]);
                  return;
                } else {
                  ui.a(2, 7, vc.field_E[4], 2147483647);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (!param3) {
                gu.b(2, (byte) 60, vc.field_E[5]);
                if (-4 == (param0 ^ -1)) {
                  if (param3) {
                    ui.a(2, 7, vc.field_E[4], 2147483647);
                    return;
                  } else {
                    gu.b(2, (byte) 60, vc.field_E[5]);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ui.a(2, 5, vc.field_E[4], 2147483647);
                if (-4 == (param0 ^ -1)) {
                  ui.a(2, 7, vc.field_E[4], 2147483647);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          so.a(44, true, true, false);
          if (param1) {
            if (2 == param0) {
              if (!param3) {
                gu.b(2, (byte) 60, vc.field_E[5]);
                if (-4 == (param0 ^ -1)) {
                  if (param3) {
                    ui.a(2, 7, vc.field_E[4], 2147483647);
                    return;
                  } else {
                    gu.b(2, (byte) 60, vc.field_E[5]);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ui.a(2, 5, vc.field_E[4], 2147483647);
                if (-4 == (param0 ^ -1)) {
                  if (param3) {
                    ui.a(2, 7, vc.field_E[4], 2147483647);
                    return;
                  } else {
                    gu.b(2, (byte) 60, vc.field_E[5]);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (-4 == (param0 ^ -1)) {
                if (param3) {
                  ui.a(2, 7, vc.field_E[4], 2147483647);
                  return;
                } else {
                  gu.b(2, (byte) 60, vc.field_E[5]);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(sj param0, boolean param1, sj param2, sj param3) {
        RuntimeException var4 = null;
        sj var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0.d(-38)) {
                break L1;
              } else {
                if (!param0.a(false, "commonui")) {
                  break L1;
                } else {
                  if (!param2.d(-57)) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (param2.a(false, "commonui")) {
                      L2: {
                        if (!param3.d(-124)) {
                          break L2;
                        } else {
                          if (!param3.a(false, "button.gif")) {
                            break L2;
                          } else {
                            L3: {
                              if (param1) {
                                break L3;
                              } else {
                                var5 = (sj) null;
                                so.a((sj) null, true, (sj) null, (sj) null);
                                break L3;
                              }
                            }
                            stackIn_18_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("so.B(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    public static void a(byte param0) {
        sj var2;
        if (param0 != -113) {
          var2 = (sj) null;
          so.a((sj) null, false, (sj) null, (sj) null);
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = (int[][]) null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = (int[][]) null;
          return;
        }
    }

    final static java.applet.Applet a(int param0) {
        if (!(null == qs.field_M)) {
            return qs.field_M;
        }
        int var1 = -80 / ((-28 - param0) / 43);
        return (java.applet.Applet) ((Object) ap.field_p);
    }

    static {
        field_b = -1;
        field_c = "Create your own free Jagex account";
        field_a = "Spend";
    }
}
