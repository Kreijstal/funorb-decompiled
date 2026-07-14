/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    private int[] field_d;
    static String field_a;
    static long[] field_b;
    static int field_c;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = param0 << param2;
        if (0 != (ti.field_a & var3)) {
          return;
        } else {
          qf.field_l = qf.field_l | var3;
          ti.field_a = ti.field_a | var3;
          uc.field_b.a((wl) (Object) new ra(param2), false);
          if (tc.field_j) {
            if ((dd.field_m ^ -1) > -3) {
              return;
            } else {
              ie.field_l.a((wl) (Object) new pg(param2, param1, hi.field_c + qh.field_g, -(64 * sg.field_f) + wg.field_b, field_c + me.field_f, ic.field_a + 6 * qh.field_l), false);
              return;
            }
          } else {
            ie.field_l.a((wl) (Object) new pg(param2, param1, hi.field_c + qh.field_g, -(64 * sg.field_f) + wg.field_b, field_c + me.field_f, ic.field_a + 6 * qh.field_l), false);
            return;
          }
        }
    }

    final static sf a(String param0, boolean param1) {
        if (param1) {
            field_b = null;
            return new sf(param0);
        }
        return new sf(param0);
    }

    final static void a(int param0) {
        if (param0 >= -32) {
            return;
        }
        if (null != jc.field_H) {
            jc.field_H.b((byte) 76);
            jc.field_H = null;
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          if (oa.field_c != null) {
            if (!oa.field_c.b(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ql.a(-48, 28, 36);
          if (oa.field_c != null) {
            if (!oa.field_c.b(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        int var1 = 8 % ((param0 - 73) / 33);
        field_a = null;
        field_b = null;
    }

    final int a(boolean param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = wizardrun.field_H;
        if (param3 != 0) {
          var7 = 0;
          if (!param0) {
            param3 = param3 + param1;
            var8 = param4;
            L0: while (true) {
              L1: {
                var9 = param5[var8];
                if (var9 >= 0) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((ql) this).field_d[var7];
                  break L1;
                }
              }
              L2: {
                var10 = ((ql) this).field_d[var7];
                if (0 > ((ql) this).field_d[var7]) {
                  param1++;
                  param2[param1] = (byte)(var10 ^ -1);
                  if (param3 > param1) {
                    var7 = 0;
                    break L2;
                  } else {
                    return var8 - -1 + -param4;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (0 != (var9 & 64)) {
                  var7 = ((ql) this).field_d[var7];
                  break L3;
                } else {
                  var7++;
                  break L3;
                }
              }
              L4: {
                var10 = ((ql) this).field_d[var7];
                if (-1 >= (((ql) this).field_d[var7] ^ -1)) {
                  break L4;
                } else {
                  param1++;
                  param2[param1] = (byte)(var10 ^ -1);
                  if (param1 < param3) {
                    var7 = 0;
                    break L4;
                  } else {
                    return var8 - -1 + -param4;
                  }
                }
              }
              L5: {
                if ((32 & var9) == 0) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((ql) this).field_d[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((ql) this).field_d[var7];
                if (0 <= ((ql) this).field_d[var7]) {
                  break L6;
                } else {
                  param1++;
                  param2[param1] = (byte)(var10 ^ -1);
                  if (param3 > param1) {
                    var7 = 0;
                    break L6;
                  } else {
                    return var8 - -1 + -param4;
                  }
                }
              }
              L7: {
                if ((var9 & 16) != -1) {
                  var7 = ((ql) this).field_d[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((ql) this).field_d[var7];
                if (-1 > ((ql) this).field_d[var7]) {
                  param1++;
                  param2[param1] = (byte)(var10 ^ -1);
                  if (param1 < param3) {
                    var7 = 0;
                    break L8;
                  } else {
                    return var8 - -1 + -param4;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if ((var9 & 8) != -1) {
                  var7 = ((ql) this).field_d[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((ql) this).field_d[var7];
                if (-1 <= ((ql) this).field_d[var7]) {
                  break L10;
                } else {
                  param1++;
                  param2[param1] = (byte)(var10 ^ -1);
                  if (param3 > param1) {
                    var7 = 0;
                    break L10;
                  } else {
                    return var8 - -1 + -param4;
                  }
                }
              }
              L11: {
                if (0 == (4 & var9)) {
                  var7++;
                  break L11;
                } else {
                  var7 = ((ql) this).field_d[var7];
                  break L11;
                }
              }
              L12: {
                var10 = ((ql) this).field_d[var7];
                if (((ql) this).field_d[var7] >= 0) {
                  break L12;
                } else {
                  param1++;
                  param2[param1] = (byte)(var10 ^ -1);
                  if (param1 < param3) {
                    var7 = 0;
                    break L12;
                  } else {
                    return var8 - -1 + -param4;
                  }
                }
              }
              L13: {
                if ((2 & var9) == 0) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((ql) this).field_d[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((ql) this).field_d[var7];
                if (0 > ((ql) this).field_d[var7]) {
                  param1++;
                  param2[param1] = (byte)(var10 ^ -1);
                  if (param3 > param1) {
                    var7 = 0;
                    break L14;
                  } else {
                    return var8 - -1 + -param4;
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if (-1 == (var9 & 1 ^ -1)) {
                  var7++;
                  break L15;
                } else {
                  var7 = ((ql) this).field_d[var7];
                  break L15;
                }
              }
              var10 = ((ql) this).field_d[var7];
              if (((ql) this).field_d[var7] < 0) {
                param1++;
                param2[param1] = (byte)(var10 ^ -1);
                if (param3 > param1) {
                  var7 = 0;
                  var8++;
                  var8++;
                  continue L0;
                } else {
                  return var8 - -1 + -param4;
                }
              } else {
                var8++;
                var8++;
                continue L0;
              }
            }
          } else {
            return 107;
          }
        } else {
          return 0;
        }
    }

    private ql() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new long[32];
        field_a = "it with spells to knock";
    }
}
