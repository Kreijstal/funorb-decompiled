/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends fc {
    int field_q;
    int field_n;
    int field_i;
    int field_p;
    int field_l;
    int[] field_o;
    int field_k;
    long field_j;
    static int field_m;
    int field_r;

    final static boolean a(boolean param0, ve param1, ve param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = -param1.field_R + param2.field_R;
            if (param0) {
              L1: {
                if (la.field_q != param2.field_ib) {
                  if (param2.field_ib != null) {
                    break L1;
                  } else {
                    var3_int += 200;
                    break L1;
                  }
                } else {
                  var3_int -= 200;
                  break L1;
                }
              }
              L2: {
                if (la.field_q != param1.field_ib) {
                  if (param1.field_ib == null) {
                    var3_int -= 200;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var3_int += 200;
                  break L2;
                }
              }
              L3: {
                if (0 >= var3_int) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("aj.C(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final static String a(byte param0) {
        return ne.field_a.g(0);
    }

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              vl.field_H = vl.field_H + 1;
              if (param0 < -117) {
                break L1;
              } else {
                field_m = -86;
                break L1;
              }
            }
            L2: {
              if (-1 != j.field_c) {
                break L2;
              } else {
                if (nk.field_l == -1) {
                  nk.field_l = fg.field_a;
                  j.field_c = kf.field_b;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (param1 != null) {
                  if (param1.equals((Object) (Object) nl.field_f)) {
                    break L3;
                  } else {
                    break L4;
                  }
                } else {
                  if (nl.field_f != null) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (!cd.field_j) {
                  if (vl.field_H >= ib.field_d) {
                    if (kj.field_r + ib.field_d > vl.field_H) {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_19_0 = stackOut_16_0;
                      break L5;
                    }
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_19_0 = stackOut_14_0;
                    break L5;
                  }
                } else {
                  stackOut_12_0 = 0;
                  stackIn_19_0 = stackOut_12_0;
                  break L5;
                }
              }
              L6: {
                var2_int = stackIn_19_0;
                if (param1 == null) {
                  vl.field_H = 0;
                  break L6;
                } else {
                  if (cd.field_j) {
                    vl.field_H = ib.field_d;
                    break L6;
                  } else {
                    if (var2_int == 0) {
                      vl.field_H = 0;
                      break L6;
                    } else {
                      vl.field_H = ib.field_d;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                field_m = nk.field_l;
                if (param1 != null) {
                  cd.field_j = false;
                  break L7;
                } else {
                  if (var2_int == 0) {
                    break L7;
                  } else {
                    cd.field_j = true;
                    break L7;
                  }
                }
              }
              r.field_j = j.field_c;
              break L3;
            }
            L8: {
              nl.field_f = param1;
              if (cd.field_j) {
                break L8;
              } else {
                if (ib.field_d <= vl.field_H) {
                  break L8;
                } else {
                  if (!mg.field_a) {
                    break L8;
                  } else {
                    r.field_j = j.field_c;
                    vl.field_H = 0;
                    field_m = nk.field_l;
                    break L8;
                  }
                }
              }
            }
            L9: {
              nk.field_l = -1;
              j.field_c = -1;
              if (!cd.field_j) {
                break L9;
              } else {
                if (vl.field_H != ib.field_f) {
                  break L9;
                } else {
                  vl.field_H = 0;
                  cd.field_j = false;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var2;
            stackOut_40_1 = new StringBuilder().append("aj.A(").append(param0).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 41);
        }
    }

    aj(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            int fieldTemp$0 = la.field_o;
            la.field_o = la.field_o + 1;
            ((aj) this).field_q = fieldTemp$0 & 65535;
            ((aj) this).field_i = param5;
            ((aj) this).field_k = param3;
            ((aj) this).field_l = param4;
            ((aj) this).field_p = param0;
            ((aj) this).field_r = param2;
            ((aj) this).field_n = param1;
            ((aj) this).field_o = param6;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "aj.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
    }
}
