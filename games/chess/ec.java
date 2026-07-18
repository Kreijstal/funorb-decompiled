/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends dm {
    private String field_h;
    private String field_k;
    static ug field_i;
    static ci field_j;
    static int[] field_l;
    static java.awt.Frame field_e;
    static eb field_d;
    static String field_f;
    static String field_g;

    final static String e(byte param0) {
        String var1 = "";
        if (!(null == um.field_b)) {
            var1 = um.field_b.i((byte) 52);
        }
        if (var1.length() == 0) {
            var1 = am.b((byte) -84);
        }
        if (!(var1.length() != 0)) {
            var1 = ql.field_e;
        }
        return var1;
    }

    final static int c(byte param0) {
        un var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var1 = uh.i(23156);
        if (var1 != null) {
          if (!var1.field_b) {
            var2 = 0;
            return var2;
          } else {
            var2 = -(480 + -uh.field_m.field_wb) / 2;
            return var2;
          }
        } else {
          stackOut_1_0 = 0;
          stackIn_3_0 = stackOut_1_0;
          var2 = stackIn_3_0;
          return var2;
        }
    }

    public static void d(byte param0) {
        field_i = null;
        field_e = null;
        field_f = null;
        field_l = null;
        field_j = null;
        field_g = null;
        field_d = null;
    }

    final static boolean a(byte param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        if (param3) {
          if (hg.field_d[param1] < hg.field_d[param2]) {
            return true;
          } else {
            if (hg.field_d[param1] > hg.field_d[param2]) {
              return false;
            } else {
              if (gh.field_a[param1] >= gh.field_a[param2]) {
                if (gh.field_a[param1] <= gh.field_a[param2]) {
                  var5 = 28;
                  var4 = in.field_j[param1] + (hn.field_e[param1] + oc.field_n[param1]);
                  var6 = in.field_j[param2] + hn.field_e[param2] - -oc.field_n[param2];
                  if (var6 <= var4) {
                    if (var6 < var4) {
                      return false;
                    } else {
                      L0: {
                        if (param2 <= param1) {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L0;
                        } else {
                          stackOut_34_0 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          break L0;
                        }
                      }
                      return stackIn_36_0 != 0;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          if (gh.field_a[param2] <= gh.field_a[param1]) {
            if (gh.field_a[param1] <= gh.field_a[param2]) {
              if (hg.field_d[param2] <= hg.field_d[param1]) {
                if (hg.field_d[param1] <= hg.field_d[param2]) {
                  var5 = 28;
                  var4 = in.field_j[param1] + (hn.field_e[param1] + oc.field_n[param1]);
                  var6 = in.field_j[param2] + hn.field_e[param2] - -oc.field_n[param2];
                  if (var6 <= var4) {
                    if (var6 < var4) {
                      return false;
                    } else {
                      if (param2 <= param1) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final void a(p param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a(true, ((ec) this).field_k);
              param0.a(((ec) this).field_h, false);
              if (param1 == 123) {
                break L1;
              } else {
                ((ec) this).field_k = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ec.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    ec(String param0, String param1) {
        try {
            ((ec) this).field_h = param1;
            ((ec) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ec.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ug b(byte param0) {
        if (param0 <= 27) {
            Object var3 = null;
            ((ec) this).a((p) null, (byte) -84);
            return field_i;
        }
        return field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ug(3);
        field_g = "Rook";
    }
}
