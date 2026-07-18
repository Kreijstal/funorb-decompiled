/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static ok[] field_c;
    static int[] field_a;
    static int field_e;
    static rh field_d;
    static String field_b;

    final static boolean a(boolean param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        if (!param0) {
          if (uj.field_a[param3] <= uj.field_a[param1]) {
            if (uj.field_a[param3] >= uj.field_a[param1]) {
              if (jl.field_b[param1] >= jl.field_b[param3]) {
                if (jl.field_b[param3] >= jl.field_b[param1]) {
                  var4 = vh.field_i[param1] + kk.field_b[param1] - -hg.field_q[param1];
                  var5 = vh.field_i[param3] + kk.field_b[param3] + hg.field_q[param3];
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var5 < var4) {
                      return false;
                    } else {
                      L0: {
                        if (param1 >= param3) {
                          stackOut_37_0 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          break L0;
                        } else {
                          stackOut_36_0 = 1;
                          stackIn_38_0 = stackOut_36_0;
                          break L0;
                        }
                      }
                      return stackIn_38_0 != 0;
                    }
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
        } else {
          if (jl.field_b[param1] < jl.field_b[param3]) {
            return true;
          } else {
            if (jl.field_b[param3] >= jl.field_b[param1]) {
              if (uj.field_a[param3] <= uj.field_a[param1]) {
                if (uj.field_a[param1] <= uj.field_a[param3]) {
                  var4 = vh.field_i[param1] + kk.field_b[param1] - -hg.field_q[param1];
                  var5 = vh.field_i[param3] + kk.field_b[param3] + hg.field_q[param3];
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var5 < var4) {
                      return false;
                    } else {
                      if (param1 >= param3) {
                        return false;
                      } else {
                        return true;
                      }
                    }
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
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, ni param4) {
        try {
            param4.a(-11, 12);
            param4.b((byte) -103, 17);
            int var5_int = 104 % ((-72 - param2) / 52);
            param4.b((byte) 119, param1);
            param4.b((byte) -122, param0);
            param4.a(-11, param3);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ob.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        int var1 = 45 % ((20 - param0) / 53);
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_c = new ok[34];
        field_b = "Loading extra data";
    }
}
