/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends pi {
    byte[] field_s;
    long field_o;
    static ae field_r;
    int field_q;
    static long field_n;
    static String field_p;
    static String[][] field_t;

    final static void a(int param0) {
        pj.field_c = new th();
        if (null == aa.field_j) {
            return;
        }
        aa.field_j = new th();
        if (param0 != 0) {
            field_p = null;
        }
        ck.a(-30833);
    }

    final static void a(byte param0) {
        int var2 = 0;
        mj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ld var15 = null;
        int[][] var19 = null;
        var12 = MinerDisturbance.field_ab;
        var15 = kj.field_a;
        var2 = var15.d((byte) -54);
        if (param0 == -105) {
          var3 = (mj) (Object) nh.field_a.b(100);
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var3.field_r != var2) {
                  var3 = (mj) (Object) nh.field_a.b((byte) 56);
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            if (var3 != null) {
              L2: {
                var4 = var15.d((byte) -54);
                if (0 != var4) {
                  var5 = var3.field_q;
                  fl.field_b[0] = ti.field_J;
                  var6_int = 1;
                  L3: while (true) {
                    if (var6_int >= var4) {
                      pn.a(var4, 11760, var5);
                      var6_int = 0;
                      L4: while (true) {
                        if (var6_int >= var4) {
                          si.a(var5, -14391);
                          var6 = new String[2][var5];
                          var19 = new int[2][4 * var5];
                          var8 = fb.field_c;
                          var9 = 0;
                          var10 = 0;
                          L5: while (true) {
                            if (var9 >= var8) {
                              var13 = 0;
                              var9 = var13;
                              var14 = 0;
                              var10 = var14;
                              L6: while (true) {
                                if (var13 >= var8) {
                                  break L2;
                                } else {
                                  var11 = an.field_a[var13 + var5];
                                  var6[1][var14] = fl.field_b[var11];
                                  var19[1][4 * var14] = pi.field_h[var11];
                                  var19[1][4 * var14 + 1] = jk.field_db[var11];
                                  var19[1][var14 * 4 + 2] = qa.field_c[var11];
                                  var19[1][3 + var14 * 4] = li.field_a[var11];
                                  if (ci.a(-27933, fl.field_b[var11])) {
                                    if (li.field_a[var11] + qa.field_c[var11] + jk.field_db[var11] == 0) {
                                      var6[1][var14] = null;
                                      var14--;
                                      var13++;
                                      var14++;
                                      continue L6;
                                    } else {
                                      var13++;
                                      var14++;
                                      continue L6;
                                    }
                                  } else {
                                    var13++;
                                    var14++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              var11 = an.field_a[var9];
                              var6[0][var10] = fl.field_b[var11];
                              var19[0][var10 * 4] = pi.field_h[var11];
                              var19[0][4 * var10 + 1] = jk.field_db[var11];
                              var19[0][2 + 4 * var10] = qa.field_c[var11];
                              var19[0][var10 * 4 - -3] = li.field_a[var11];
                              if (ci.a(-27933, fl.field_b[var11])) {
                                if (li.field_a[var11] + (jk.field_db[var11] + qa.field_c[var11]) == 0) {
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
                          fg.a((byte) -86, (sb) (Object) var15);
                          if (var6_int != 0) {
                            qm.a(fl.field_c, tk.field_h, var6_int, true, ah.field_b, vb.field_b);
                            var6_int++;
                            continue L4;
                          } else {
                            qm.a(fl.field_c, tk.field_h, var6_int, true, ah.field_b, vb.field_b);
                            var6_int++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      fl.field_b[var6_int] = var15.a(false);
                      var6_int++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var3.b(34);
              return;
            } else {
              si.a(-68);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static ea a(String param0, int param1, String param2, bj param3) {
        if (param1 != -29553) {
            Object var6 = null;
            ea discarded$0 = jn.a((String) null, -42, (String) null, (bj) null);
        }
        int var4 = param3.a(-118, param2);
        int var5 = param3.a(param0, var4, param1 ^ 29451);
        return el.a(var5, var4, param3, 2);
    }

    public static void e(int param0) {
        field_p = null;
        int var1 = 23 % ((28 - param0) / 56);
        field_r = null;
        field_t = null;
    }

    jn(long param0, int param1, byte[] param2) {
        ((jn) this).field_s = param2;
        ((jn) this).field_o = param0;
        ((jn) this).field_q = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Look sharp in this greaseproof suit. This fetching non-stick two piece will let you swim through oil as if it were water.";
        field_r = new ae();
        field_t = new String[][]{null, new String[1]};
    }
}
