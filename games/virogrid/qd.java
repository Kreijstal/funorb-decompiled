/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    int field_j;
    int field_h;
    byte[] field_k;
    int field_a;
    byte[] field_e;
    int field_b;
    int field_n;
    int field_d;
    static ai[] field_m;
    int field_l;
    static km field_f;
    static String field_g;
    static ml field_i;
    static int field_c;

    final static String a(String param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var9_ref_StringBuilder = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Virogrid.field_F ? 1 : 0;
        var4 = param0.length();
        var5 = param3.length();
        var6 = param2.length();
        if (0 == var5) {
          throw new IllegalArgumentException("Key cannot have zero length");
        } else {
          var7 = var4;
          var8 = var6 + -var5;
          if (-1 != (var8 ^ -1)) {
            var9 = 0;
            L0: while (true) {
              var9 = param0.indexOf(param3, var9);
              if ((var9 ^ -1) <= -1) {
                var7 = var7 + var8;
                var9 = var9 + var5;
                continue L0;
              } else {
                L1: {
                  if (param1 < -37) {
                    var9_ref_StringBuilder = new StringBuilder(var7);
                    var10 = 0;
                    break L1;
                  } else {
                    field_i = null;
                    var9_ref_StringBuilder = new StringBuilder(var7);
                    var10 = 0;
                    break L1;
                  }
                }
                L2: while (true) {
                  var11 = param0.indexOf(param3, var10);
                  if (var11 < 0) {
                    StringBuilder discarded$9 = var9_ref_StringBuilder.append(param0.substring(var10));
                    return var9_ref_StringBuilder.toString();
                  } else {
                    StringBuilder discarded$10 = var9_ref_StringBuilder.append(param0.substring(var10, var11));
                    var10 = var5 + var11;
                    StringBuilder discarded$11 = var9_ref_StringBuilder.append(param2);
                    continue L2;
                  }
                }
              }
            }
          } else {
            if (param1 < -37) {
              var9_ref_StringBuilder = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param0.indexOf(param3, var10);
                if (var11 < 0) {
                  StringBuilder discarded$12 = var9_ref_StringBuilder.append(param0.substring(var10));
                  return var9_ref_StringBuilder.toString();
                } else {
                  StringBuilder discarded$13 = var9_ref_StringBuilder.append(param0.substring(var10, var11));
                  var10 = var5 + var11;
                  StringBuilder discarded$14 = var9_ref_StringBuilder.append(param2);
                  continue L3;
                }
              }
            } else {
              field_i = null;
              var9_ref_StringBuilder = new StringBuilder(var7);
              var10 = 0;
              L4: while (true) {
                var11 = param0.indexOf(param3, var10);
                if (var11 < 0) {
                  StringBuilder discarded$15 = var9_ref_StringBuilder.append(param0.substring(var10));
                  return var9_ref_StringBuilder.toString();
                } else {
                  StringBuilder discarded$16 = var9_ref_StringBuilder.append(param0.substring(var10, var11));
                  var10 = var5 + var11;
                  StringBuilder discarded$17 = var9_ref_StringBuilder.append(param2);
                  continue L4;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        jl.field_E = param0;
        en.field_Kb = param2;
        ti.field_b = param3;
        if (param1 <= 6) {
            field_c = 49;
        }
    }

    final static void a(int param0) {
        mc.field_a = -1;
        ei.field_a = false;
        wa.field_F = 0;
        int var1 = 103 / ((param0 - 14) / 55);
        od.field_l = null;
        ge.field_b = -1;
    }

    final static eh a(boolean param0, int param1, boolean param2, int param3, byte param4) {
        if (param4 < 40) {
          he discarded$2 = qd.a((byte) -115, -62);
          return va.a(param1, false, param3, -116, param2, param0);
        } else {
          return va.a(param1, false, param3, -116, param2, param0);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_i = null;
        field_f = null;
        field_m = null;
        if (!param0) {
            field_f = null;
        }
    }

    final static int a(int param0, cj param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param0 == 16903) {
          var2 = tm.field_n;
          if (-3 != param1.field_n) {
            if ((param1.field_n ^ -1) != -5) {
              if (hh.field_d != param1.field_p) {
                var2 = dm.field_w[param1.field_n];
                return var2;
              } else {
                var2 = mk.field_eb[param1.field_n];
                return var2;
              }
            } else {
              var2 = dm.field_w[param1.field_n];
              return var2;
            }
          } else {
            if (!param1.field_j) {
              if (-1 == param1.field_m) {
                if (param1.field_a != 0) {
                  var2 = dm.field_w[param1.field_n];
                  return var2;
                } else {
                  var2 = mk.field_eb[param1.field_n];
                  return var2;
                }
              } else {
                var2 = dm.field_w[param1.field_n];
                return var2;
              }
            } else {
              var2 = tm.field_n;
              return var2;
            }
          }
        } else {
          field_i = null;
          var2 = tm.field_n;
          if (-3 != param1.field_n) {
            if ((param1.field_n ^ -1) != -5) {
              if (hh.field_d != param1.field_p) {
                var2 = dm.field_w[param1.field_n];
                return var2;
              } else {
                var2 = mk.field_eb[param1.field_n];
                return var2;
              }
            } else {
              var2 = dm.field_w[param1.field_n];
              return var2;
            }
          } else {
            if (!param1.field_j) {
              if (-1 == param1.field_m) {
                if (param1.field_a != 0) {
                  var2 = dm.field_w[param1.field_n];
                  return var2;
                } else {
                  var2 = mk.field_eb[param1.field_n];
                  return var2;
                }
              } else {
                var2 = dm.field_w[param1.field_n];
                return var2;
              }
            } else {
              var2 = tm.field_n;
              return var2;
            }
          }
        }
    }

    final static he a(byte param0, int param1) {
        int var2 = -66 % ((param0 - 65) / 53);
        return (he) (Object) (ma.field_c == null ? null : ma.field_c.a((long)param1, (byte) 93));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_m = new ai[255];
        for (var0 = 0; field_m.length > var0; var0++) {
            field_m[var0] = new ai();
        }
        field_g = "You have withdrawn your request to join.";
        field_c = 0;
    }
}
