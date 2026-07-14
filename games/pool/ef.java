/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static String field_e;
    int field_d;
    int field_a;
    int field_b;
    static vh field_c;

    final static String a(String param0, String param1, byte param2, String param3) {
        String var4 = null;
        StringBuilder var5 = null;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        StringBuilder var13 = null;
        String stackIn_37_0 = null;
        String stackOut_36_0 = null;
        String stackOut_35_0 = null;
        var4 = param1.toLowerCase();
        var5 = null;
        var6 = 0;
        L0: while (true) {
          if (var6 >= lb.field_P.length) {
            L1: {
              if (param2 == 4) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              if (var5 == null) {
                stackOut_36_0 = (String) param1;
                stackIn_37_0 = stackOut_36_0;
                break L2;
              } else {
                stackOut_35_0 = var5.toString();
                stackIn_37_0 = stackOut_35_0;
                break L2;
              }
            }
            return stackIn_37_0;
          } else {
            var7 = lb.field_P[var6];
            var8 = 0;
            L3: while (true) {
              if (var8 >= var7.length) {
                var6++;
                continue L0;
              } else {
                var9 = var7[var8];
                if (var9 != null) {
                  var10 = var9.length();
                  if (var10 != 0) {
                    var13 = new StringBuilder(param1.length());
                    var11 = 0;
                    L4: while (true) {
                      var12 = var4.indexOf(var9, var11);
                      if (var12 != -1) {
                        L5: {
                          if (var12 <= 0) {
                            break L5;
                          } else {
                            L6: {
                              if (vq.a(var4.charAt(var12 + -1), param2 ^ 22991)) {
                                break L6;
                              } else {
                                if (var4.charAt(var12 - 1) == 35) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L7: {
                              if (-36 != (var4.charAt(var12 - 1) ^ -1)) {
                                StringBuilder discarded$9 = var5.append(param1.substring(var11, 1 + var12));
                                break L7;
                              } else {
                                StringBuilder discarded$10 = var5.append(param1.substring(var11, -1 + var12));
                                StringBuilder discarded$11 = var5.append(param1.charAt(var12));
                                break L7;
                              }
                            }
                            var11 = 1 + var12;
                            continue L4;
                          }
                        }
                        L8: {
                          if (var4.length() <= var12 + var10) {
                            break L8;
                          } else {
                            if (vq.a(var4.charAt(var12 - -var10), 22987)) {
                              StringBuilder discarded$12 = var5.append(param1.substring(var11, var12 - -1));
                              var11 = 1 + var12;
                              continue L4;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          StringBuilder discarded$13 = var5.append(param1.substring(var11, var12));
                          if (param3 != null) {
                            StringBuilder discarded$14 = var13.append(param3);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        StringBuilder discarded$15 = var5.append(param1.substring(var12, var12 + var10));
                        var11 = var10 + var12;
                        if (param0 == null) {
                          continue L4;
                        } else {
                          StringBuilder discarded$16 = var13.append(param0);
                          continue L4;
                        }
                      } else {
                        L10: {
                          if (var11 != 0) {
                            StringBuilder discarded$17 = var5.append(param1.substring(var11, param1.length()));
                            break L10;
                          } else {
                            var5 = new StringBuilder(param1);
                            break L10;
                          }
                        }
                        param1 = var5.toString();
                        var4 = param1.toLowerCase();
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var8++;
                    continue L3;
                  }
                } else {
                  var8++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static void a(int param0) {
        cm.field_L = new String[cd.field_a];
        cm.field_L[11] = wc.field_d;
        cm.field_L[18] = vq.field_bc;
        cm.field_L[15] = jd.field_e;
        cm.field_L[9] = ab.field_e;
        cm.field_L[20] = p.field_b;
        cm.field_L[4] = kf.field_l;
        if (param0 >= -12) {
            Object var2 = null;
            ef.a(20, (dd) null, (String) null);
        }
        cm.field_L[6] = eq.field_P;
        cm.field_L[21] = il.field_d;
        cm.field_L[7] = ri.field_O;
        cm.field_L[13] = nm.field_g;
        cm.field_L[16] = ql.field_c;
        cm.field_L[19] = sd.field_N;
        cm.field_L[5] = o.field_z;
        cm.field_L[17] = hk.field_u;
    }

    final static void a(int param0, dd param1, String param2) {
        nr.field_N = param2;
        if (param0 != -2107) {
            ef.a(3, 47, -112);
        }
        wa.field_gb = param1;
    }

    final static void a(int param0, int param1, int param2) {
        oq var3 = ej.field_j;
        var3.b(false, param2);
        var3.a(param1, false);
        var3.a(10, false);
        var3.a((byte) -81, param0);
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 1) {
            field_e = null;
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Remove <%0> from friend list";
    }
}
