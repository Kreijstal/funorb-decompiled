/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static String field_b;
    static int field_d;
    static qm field_e;
    static long field_g;
    static ud field_i;
    static String field_a;
    static String field_h;
    static int field_f;
    static int[] field_c;

    final static void a(byte param0) {
        int var2 = 0;
        cl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        cl var15 = null;
        uf var16 = null;
        var12 = client.field_A ? 1 : 0;
        var16 = de.field_V;
        var2 = var16.d((byte) -110);
        cl dupTemp$4 = (cl) (Object) oe.field_I.c((byte) -54);
        var15 = dupTemp$4;
        var3 = dupTemp$4;
        L0: while (true) {
          L1: {
            if (var15 == null) {
              break L1;
            } else {
              if (var2 != var15.field_q) {
                var3 = (cl) (Object) oe.field_I.d(true);
                continue L0;
              } else {
                break L1;
              }
            }
          }
          if (var3 == null) {
            si.a(122);
            return;
          } else {
            L2: {
              var4 = var16.d((byte) -125);
              if (-1 == (var4 ^ -1)) {
                break L2;
              } else {
                var5 = var3.field_z;
                t.field_cb[0] = oa.field_f;
                var6_int = 1;
                L3: while (true) {
                  if (var4 <= var6_int) {
                    ba.a(2147483647, var4, var5);
                    var6_int = 0;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        pd.a(var5, (byte) 6);
                        String[][] dupTemp$5 = new String[2][var5];
                        var3.field_x = dupTemp$5;
                        var6 = dupTemp$5;
                        int[][] dupTemp$6 = new int[2][var5 * 4];
                        var3.field_u = dupTemp$6;
                        var7 = dupTemp$6;
                        var8 = og.field_eb;
                        var9 = 0;
                        var10 = 0;
                        L5: while (true) {
                          if (var8 <= var9) {
                            var13 = 0;
                            var9 = var13;
                            var14 = 0;
                            var10 = var14;
                            L6: while (true) {
                              if (var8 <= var13) {
                                break L2;
                              } else {
                                var11 = ch.field_a[var13 + var5];
                                var6[1][var14] = t.field_cb[var11];
                                var7[1][var14 * 4] = ad.field_i[var11];
                                var7[1][1 + 4 * var14] = oa.field_e[var11];
                                var7[1][4 * var14 + 2] = ln.field_a[var11];
                                var7[1][4 * var14 + 3] = mk.field_b[var11];
                                if (k.a(t.field_cb[var11], true)) {
                                  if (-1 == (ln.field_a[var11] + oa.field_e[var11] + mk.field_b[var11] ^ -1)) {
                                    var6[1][var14] = null;
                                    var14--;
                                    var14++;
                                    var13++;
                                    continue L6;
                                  } else {
                                    var14++;
                                    var13++;
                                    continue L6;
                                  }
                                } else {
                                  var14++;
                                  var13++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            var11 = ch.field_a[var9];
                            var6[0][var10] = t.field_cb[var11];
                            var7[0][var10 * 4] = ad.field_i[var11];
                            var7[0][1 + var10 * 4] = oa.field_e[var11];
                            var7[0][2 + 4 * var10] = ln.field_a[var11];
                            var7[0][3 + var10 * 4] = mk.field_b[var11];
                            if (k.a(t.field_cb[var11], true)) {
                              if (-1 == (oa.field_e[var11] + (ln.field_a[var11] - -mk.field_b[var11]) ^ -1)) {
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
                        pn.a(63, (wl) (Object) var16);
                        if (-1 == (var6_int ^ -1)) {
                          var3.field_p = oc.field_c;
                          var3.field_o = dj.field_Y;
                          var3.field_w = tj.field_Pb;
                          var3.field_t = vm.field_s;
                          ri.a(var6_int, dj.field_Y, -1, vm.field_s, tj.field_Pb, oc.field_c);
                          var6_int++;
                          continue L4;
                        } else {
                          ri.a(var6_int, dj.field_Y, -1, vm.field_s, tj.field_Pb, oc.field_c);
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    t.field_cb[var6_int] = var16.c((byte) -38);
                    var6_int++;
                    continue L3;
                  }
                }
              }
            }
            L7: {
              if (param0 > 107) {
                break L7;
              } else {
                int discarded$7 = ul.a(-19, 9, -103);
                break L7;
              }
            }
            var3.field_A = true;
            var3.b((byte) 104);
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_b = null;
        field_a = null;
        if (param0 != -75) {
            field_d = -77;
        }
        field_e = null;
        field_c = null;
        field_i = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != -28705) {
            ul.a(55, 34);
        }
        if (-3 < (param1 ^ -1)) {
            if (5 > param0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    final static void a(int param0, int param1) {
        if (param1 != 4) {
            field_e = null;
        }
        uf var2 = we.field_b;
        var2.f(param0, -4);
        var2.a(true, 1);
        var2.a(true, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Challenge Highscores";
        field_e = new qm(6, 0, 4, 2);
        field_g = 20000000L;
        field_a = "Respect";
        field_h = "Clan";
        field_c = new int[5];
        field_f = 3;
    }
}
