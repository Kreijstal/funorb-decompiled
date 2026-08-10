/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends bh {
    static String field_t;
    int field_r;
    static ui[][] field_u;
    static int[] field_o;
    boolean field_s;
    int[] field_q;
    static String field_n;
    static String field_p;

    public static void a(int param0) {
        field_u = (ui[][]) null;
        field_p = null;
        field_t = null;
        field_o = null;
        field_n = null;
        if (param0 != 13820388) {
            field_u = (ui[][]) null;
        }
    }

    final static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        tj var1 = null;
        ve var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        String var5 = null;
        var2 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1 = (tj) ((Object) i.field_b.c((byte) -53));
            L1: while (true) {
              if (var1 == null) {
                var1_ref = (ve) ((Object) h.field_b.c((byte) 26));
                L2: while (true) {
                  if (var1_ref == null) {
                    var1 = (tj) ((Object) oc.field_b.c((byte) 50));
                    L3: while (true) {
                      if (var1 == null) {
                        if (param0 == 123) {
                          break L0;
                        } else {
                          var5 = (String) null;
                          sb.a(-113L, (String) null, false, (String) null, 29);
                          return;
                        }
                      } else {
                        L4: {
                          if (0 < var1.field_Qb) {
                            var1.field_Qb = var1.field_Qb - 1;
                            if (var1.field_Qb != 0) {
                              break L4;
                            } else {
                              var1.field_hc = 0;
                              if (!var1.g((byte) 59)) {
                                break L4;
                              } else {
                                var1.b((byte) 101);
                                break L4;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var1 = (tj) ((Object) oc.field_b.d(true));
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      if (var1_ref.field_Rb > 0) {
                        var1_ref.field_Rb = var1_ref.field_Rb - 1;
                        if (-1 == (var1_ref.field_Rb ^ -1)) {
                          var1_ref.field_oc = 0;
                          if (!var1_ref.i((byte) 115)) {
                            break L5;
                          } else {
                            var1_ref.b((byte) 113);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var1_ref = (ve) ((Object) h.field_b.d(true));
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if ((var1.field_Qb ^ -1) >= -1) {
                    break L6;
                  } else {
                    var1.field_Qb = var1.field_Qb - 1;
                    if (-1 != (var1.field_Qb ^ -1)) {
                      break L6;
                    } else {
                      var1.field_hc = 0;
                      if (var1.g((byte) 111)) {
                        var1.b((byte) 112);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var1 = (tj) ((Object) i.field_b.d(true));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1_ref2), "sb.B(" + param0 + ')');
        }
    }

    final static fm a(long param0, String param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        qa stackIn_5_0 = null;
        ob stackIn_7_0 = null;
        wk stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((long)param4 != param0) {
                break L1;
              } else {
                if (param3 != null) {
                  stackIn_7_0 = new ob(param3, param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param2) {
              stackIn_9_0 = new wk(param0, param1);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_5_0 = new qa(param0, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("sb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fm) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (fm) ((Object) stackIn_7_0);
          } else {
            return (fm) ((Object) stackIn_9_0);
          }
        }
    }

    sb() {
    }

    static {
        field_t = "Secret achievement";
        field_o = new int[]{10076391, 4944180, 14961707, 16178128, 13820388};
        field_u = new ui[8][4];
        field_n = "Players: <%0>/<%1>";
        field_p = "Show players in <%0>'s game";
    }
}
