/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static boolean field_a;
    static int[] field_h;
    static int field_b;
    static String field_i;
    static String field_j;
    static String field_f;
    static String field_e;
    static int field_d;
    static vb field_c;
    int field_g;

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        oq var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_16_0 = null;
        String stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        String stackOut_12_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param1);
            if (gj.a(param2 ^ -25906, var6)) {
              if (or.a((byte) 3, param1)) {
                stackOut_5_0 = fn.field_Qb;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (th.field_a != 2) {
                  stackOut_9_0 = rl.field_j;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!ia.a(param1, 24552)) {
                    if (-101 >= (gi.field_t ^ -1)) {
                      stackOut_16_0 = ci.field_a;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (lq.a(param1, -1)) {
                        stackOut_20_0 = nr.a(new String[]{param1}, -1, gf.field_f);
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var5 = ej.field_j;
                        var5.b(false, param0);
                        var5.field_v = var5.field_v + 1;
                        var4 = var5.field_v;
                        var5.a(param2, false);
                        var5.a(param2 + -9948, param1);
                        var5.b(var5.field_v + -var4, true);
                        stackOut_22_0 = null;
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_12_0 = nr.a(new String[]{param1}, -1, mg.field_b);
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_1_0 = p.field_g;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L1;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    return (String) ((Object) stackIn_23_0);
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        boolean discarded$0 = false;
        field_e = null;
        field_i = null;
        field_j = null;
        field_c = null;
        field_h = null;
        field_f = null;
        if (param0 < 47) {
            String var2 = (String) null;
            discarded$0 = jd.a((byte) 35, (String) null, (String) null);
        }
    }

    final static String a(int param0) {
        if (!nn.field_d) {
          if (wp.field_c <= jo.field_J) {
            if (wp.field_c + ji.field_d <= jo.field_J) {
              if (param0 == 9383) {
                return null;
              } else {
                field_h = (int[]) null;
                return null;
              }
            } else {
              return pj.field_I;
            }
          } else {
            if (param0 == 9383) {
              return null;
            } else {
              field_h = (int[]) null;
              return null;
            }
          }
        } else {
          if (param0 == 9383) {
            return null;
          } else {
            field_h = (int[]) null;
            return null;
          }
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (qa.a(1, param2)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!bm.a(param2, -106)) {
                if (!gh.a(param2, 28350)) {
                  L1: {
                    if (param0 < -24) {
                      break L1;
                    } else {
                      var4 = (String) null;
                      discarded$2 = jd.a((byte) 61, (String) null, (String) null);
                      break L1;
                    }
                  }
                  if (0 != param1.length()) {
                    if (!hq.a(param2, param1, 17924)) {
                      if (!co.a(param1, (byte) -111, param2)) {
                        if (!wg.a(23138, param1, param2)) {
                          stackOut_24_0 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("jd.F(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L2;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L2;
            }
          }
          L3: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L3;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0 != 0;
                    } else {
                      return stackIn_25_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static eg[] a(int param0, eg param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        eg[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              d.a(param1, -23109);
              var2 = new int[]{3, 1, 1};
              if (param0 > 65) {
                break L1;
              } else {
                field_b = 76;
                break L1;
              }
            }
            ie.a(-2656, var2, param1);
            stackOut_2_0 = cm.a(param1, var2, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("jd.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 == 1164778608) {
          if (param0 >= param2) {
            return bo.b(-65536, (param2 << -2089708176) / param0);
          } else {
            return 2048 + -bo.b(-65536, (param0 << 1164778608) / param2);
          }
        } else {
          field_h = (int[]) null;
          if (param0 >= param2) {
            return bo.b(-65536, (param2 << -2089708176) / param0);
          } else {
            return 2048 + -bo.b(-65536, (param0 << 1164778608) / param2);
          }
        }
    }

    static {
        field_h = new int[]{1000, 1100};
        field_i = "<%0> must play 1 more rated game before playing with the current options.";
        field_j = "Shortcut Reference";
        field_f = "Cue can't go there!";
        field_b = -1;
        field_e = "Scamming";
    }
}
