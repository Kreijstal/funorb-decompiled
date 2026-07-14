/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends rk {
    private int field_n;
    private int field_o;
    static String field_p;
    static int field_m;

    final static void b(int param0) {
        int var2 = 0;
        cc var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hb var13 = null;
        int var14 = 0;
        hb var15 = null;
        int[][] var19 = null;
        var12 = Confined.field_J ? 1 : 0;
        var13 = e.field_c;
        var15 = var13;
        var2 = var15.c(32);
        var3 = (cc) (Object) uc.field_bb.a(77);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var2 == var3.field_o) {
                break L1;
              } else {
                var3 = (cc) (Object) uc.field_bb.d(param0 ^ 2123);
                continue L0;
              }
            }
          }
          if (var3 == null) {
            dc.d(122);
            return;
          } else {
            L2: {
              var4 = var15.c(32);
              if (param0 != var4) {
                var5 = var3.field_n;
                em.field_f[0] = qc.field_m;
                var6_int = 1;
                L3: while (true) {
                  if (var6_int >= var4) {
                    fg.a(var5, var4, (byte) -63);
                    var6_int = 0;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        wa.a(var5, (byte) 117);
                        var6 = new String[2][var5];
                        var19 = new int[2][4 * var5];
                        var8 = mc.field_c;
                        var9 = 0;
                        var10 = 0;
                        L5: while (true) {
                          if (var9 >= var8) {
                            var9 = 0;
                            var14 = 0;
                            var10 = var14;
                            L6: while (true) {
                              if (var9 >= var8) {
                                break L2;
                              } else {
                                var11 = sj.field_rb[var5 - -var9];
                                var6[1][var14] = em.field_f[var11];
                                var19[1][4 * var14] = an.field_n[var11];
                                var19[1][var14 * 4 + 1] = am.field_I[var11];
                                var19[1][2 + 4 * var14] = em.field_b[var11];
                                var19[1][4 * var14 - -3] = oc.field_m[var11];
                                if (im.a(em.field_f[var11], param0 ^ 44)) {
                                  if (em.field_b[var11] + am.field_I[var11] + oc.field_m[var11] == 0) {
                                    var6[1][var14] = null;
                                    var14--;
                                    var14++;
                                    var9++;
                                    continue L6;
                                  } else {
                                    var14++;
                                    var9++;
                                    continue L6;
                                  }
                                } else {
                                  var14++;
                                  var9++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            var11 = sj.field_rb[var9];
                            var6[0][var10] = em.field_f[var11];
                            var19[0][4 * var10] = an.field_n[var11];
                            var19[0][4 * var10 - -1] = am.field_I[var11];
                            var19[0][4 * var10 - -2] = em.field_b[var11];
                            var19[0][4 * var10 + 3] = oc.field_m[var11];
                            if (im.a(em.field_f[var11], -110)) {
                              if (em.field_b[var11] + am.field_I[var11] - -oc.field_m[var11] == 0) {
                                var6[0][var10] = null;
                                var10--;
                                var9++;
                                var10++;
                                continue L5;
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            } else {
                              var9++;
                              var10++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        bd.a((kg) (Object) var15, (byte) -45);
                        if (0 == var6_int) {
                          cl.a(eh.field_R, qg.field_h, var6_int, dj.field_gb, (byte) -127, ll.field_d);
                          var6_int++;
                          continue L4;
                        } else {
                          cl.a(eh.field_R, qg.field_h, var6_int, dj.field_gb, (byte) 74, ll.field_d);
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    em.field_f[var6_int] = var13.d(true);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            var3.a(true);
            return;
          }
        }
    }

    final static mi a(int param0, int param1) {
        if (param1 != -14245) {
            field_p = null;
        }
        return we.a(param0, false, (byte) -106, true, 1, false);
    }

    final static boolean a(byte param0) {
        if (param0 <= 79) {
            cc.b(true);
        }
        return null == dn.field_d ? on.field_e : true;
    }

    final static int a(boolean param0, byte param1, int param2, int param3) {
        if (param1 >= -109) {
            field_p = null;
        }
        return oc.b(1);
    }

    public static void b(boolean param0) {
        if (!param0) {
            mi discarded$0 = cc.a(-115, 67);
        }
        field_p = null;
    }

    final static int a(boolean param0, CharSequence param1) {
        if (!param0) {
            field_p = null;
        }
        return b.a(true, 10, (byte) 16, param1);
    }

    private cc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Swap up/down: ";
    }
}
