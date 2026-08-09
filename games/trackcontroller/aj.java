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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_16_0 = 0;
                  break L3;
                } else {
                  stackIn_16_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("aj.C(").append(param0).append(',');

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
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_16_0 != 0;
        }
    }

    final static String a(byte param0) {
        if (param0 != 107) {
            field_m = 13;
            return ne.field_a.g(0);
        }
        return ne.field_a.g(0);
    }

    final static void a(byte param0, String param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
                  if (param1.equals(nl.field_f)) {
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
                      stackIn_19_0 = 1;
                      break L5;
                    } else {
                      stackIn_19_0 = 0;
                      break L5;
                    }
                  } else {
                    stackIn_19_0 = 0;
                    break L5;
                  }
                } else {
                  stackIn_19_0 = 0;
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
            stackIn_42_0 = (RuntimeException) (var2);

            stackIn_42_1 = new StringBuilder().append("aj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L10;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L10;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
    }

    aj(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            fieldTemp$0 = la.field_o;
            la.field_o = la.field_o + 1;
            this.field_q = fieldTemp$0 & 65535;
            this.field_i = param5;
            this.field_k = param3;
            this.field_l = param4;
            this.field_p = param0;
            this.field_r = param2;
            this.field_n = param1;
            this.field_o = param6;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "aj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = -1;
    }
}
