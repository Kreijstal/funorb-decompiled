/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static String field_c;
    static ci field_d;
    static lh field_a;
    static int field_e;
    static pg field_b;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static void a(ld param0, int param1) {
        long stackIn_2_0;
        String stackIn_2_1;
        int stackIn_2_2;
        Object stackIn_2_3;
        int stackIn_2_4;
        ci stackIn_2_5;
        Object stackIn_2_6;
        long stackIn_3_0 = 0L;
        String stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        Object stackIn_3_3 = null;
        int stackIn_3_4 = 0;
        ci stackIn_3_5 = null;
        Object stackIn_3_6 = null;
        int stackIn_3_7 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        dh var5 = null;
        String var6 = null;
        dh var7 = null;
        String var8 = null;
        dh var9 = null;
        String var10 = null;
        dh var11 = null;
        String var12 = null;
        dh var13 = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = param0.field_m;

              stackIn_2_1 = param0.field_o;

              stackIn_2_2 = 74;

              stackIn_2_3 = null;

              stackIn_2_4 = param0.field_k;

              stackIn_2_5 = param0.field_f;

              stackIn_2_6 = null;

              if (1 == param0.field_k) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = (String) ((Object) stackIn_2_1);
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = stackIn_2_4;
                stackIn_3_5 = (ci) ((Object) stackIn_2_5);
                stackIn_3_6 = stackIn_2_6;
                stackIn_3_7 = param0.field_c;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = (String) ((Object) stackIn_2_1);
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = stackIn_2_4;
                stackIn_3_5 = (ci) ((Object) stackIn_2_5);
                stackIn_3_6 = stackIn_2_6;
                stackIn_3_7 = 0;
                break L1;
              }
            }
            L2: {
              ja.a(stackIn_3_0, stackIn_3_1, (byte) stackIn_3_2, (nb) ((Object) stackIn_3_3), stackIn_3_4, stackIn_3_5, (int[]) ((Object) stackIn_3_6), stackIn_3_7, param0.field_i);
              if (0 != param0.field_k) {
                break L2;
              } else {
                if (sb.j((byte) 78)) {
                  break L2;
                } else {
                  if (null != pd.field_Rb) {
                    break L2;
                  } else {
                    if (null != ib.field_d) {
                      break L2;
                    } else {
                      L3: {
                        if (!kh.field_o) {
                          var5 = pi.field_d;
                          var6 = sn.field_e;
                          var5.field_b.a((byte) -12, var6, 14);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7 = pi.field_d;
                      var8 = hn.field_n;
                      var7.field_b.a((byte) -12, var8, 20);
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if ((param0.field_k ^ -1) != -2) {
                break L4;
              } else {
                if (sb.j((byte) 78)) {
                  break L4;
                } else {
                  if (pd.field_Rb == null) {
                    break L4;
                  } else {
                    if (param0.field_c == pd.field_Rb.g((byte) -105)) {
                      L5: {
                        if (kh.field_o) {
                          break L5;
                        } else {
                          var9 = pi.field_d;
                          var10 = be.field_e;
                          var9.field_b.a((byte) -12, var10, 14);
                          break L5;
                        }
                      }
                      var11 = pi.field_d;
                      var12 = uj.field_m;
                      var11.field_b.a((byte) -12, var12, 20);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            L6: {
              pi.field_d.b((byte) -121);
              pi.field_d.a(0, false);
              pi.field_d.a(17, param0.field_l, param0.field_k);
              pi.field_d.d(-35);
              pi.field_d.a(54, param0);
              var13 = pi.field_d;
              if (param1 <= -71) {
                break L6;
              } else {
                ce.a(false);
                break L6;
              }
            }
            var3 = re.field_m;
            var4 = ag.field_f;
            var13.field_b.a(true, var3, 0, var4, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ce.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
    }

    static {
        field_e = 0;
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = null;
    }
}
