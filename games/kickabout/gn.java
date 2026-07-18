/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gn {
    long field_a;
    static String field_c;
    gn field_b;
    gn field_d;

    final static boolean a(byte param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        if (param1) {
          if (bl.field_m[param2] >= bl.field_m[param3]) {
            if (bl.field_m[param2] > bl.field_m[param3]) {
              return false;
            } else {
              if (w.field_a[param3] > w.field_a[param2]) {
                return true;
              } else {
                if (w.field_a[param2] <= w.field_a[param3]) {
                  var4 = qp.field_G[param2] + (fo.field_j[param2] - -ln.field_B[param2]);
                  var5 = ln.field_B[param3] + qp.field_G[param3] + fo.field_j[param3];
                  if (var5 > var4) {
                    return true;
                  } else {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L0: {
                        if (param2 >= param3) {
                          stackOut_36_0 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          break L0;
                        } else {
                          stackOut_35_0 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          break L0;
                        }
                      }
                      return stackIn_37_0 != 0;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          if (w.field_a[param2] >= w.field_a[param3]) {
            if (w.field_a[param2] <= w.field_a[param3]) {
              if (bl.field_m[param2] < bl.field_m[param3]) {
                return true;
              } else {
                if (bl.field_m[param3] >= bl.field_m[param2]) {
                  var4 = qp.field_G[param2] + (fo.field_j[param2] - -ln.field_B[param2]);
                  var5 = ln.field_B[param3] + qp.field_G[param3] + fo.field_j[param3];
                  if (var5 > var4) {
                    return true;
                  } else {
                    if (var4 <= var5) {
                      if (param2 >= param3) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final static int d(byte param0) {
        return bh.field_j;
    }

    public static void d(int param0) {
        field_c = null;
    }

    final boolean e(byte param0) {
        if (null == ((gn) this).field_b) {
            return false;
        }
        if (param0 != -113) {
            return true;
        }
        return true;
    }

    final static void c(int param0) {
        ow.field_e = un.field_e.a(-117);
        CharSequence var2 = (CharSequence) (Object) ow.field_e;
        kd.field_w = mo.a(0, var2);
        if (param0 != -49) {
            field_c = null;
        }
    }

    final static void a(int param0, int param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        String var4 = Integer.toBinaryString(param0);
        try {
            for (var5 = 0; param2 - var4.length() > var5; var5++) {
                StringBuilder discarded$0 = param3.append('0');
            }
            StringBuilder discarded$1 = param3.append(var4);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gn.QB(" + param0 + ',' + -28745 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(byte param0) {
        if (((gn) this).field_b != null) {
          if (param0 != -109) {
            gn.c(80);
            ((gn) this).field_b.field_d = ((gn) this).field_d;
            ((gn) this).field_d.field_b = ((gn) this).field_b;
            ((gn) this).field_b = null;
            ((gn) this).field_d = null;
            return;
          } else {
            ((gn) this).field_b.field_d = ((gn) this).field_d;
            ((gn) this).field_d.field_b = ((gn) this).field_b;
            ((gn) this).field_b = null;
            ((gn) this).field_d = null;
            return;
          }
        } else {
          return;
        }
    }

    final static int b(byte param0) {
        if (param0 >= -52) {
            return -83;
        }
        return mn.field_a;
    }

    final static boolean a(int param0, char param1) {
        if (param1 < 48) {
            return false;
        }
        if (param1 > 57) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Click 'Team Results' to view who won, drew or lost.";
    }
}
