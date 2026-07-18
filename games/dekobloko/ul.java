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

    final static void a() {
        RuntimeException var1 = null;
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
        uf var15 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            var15 = de.field_V;
            var2 = var15.d((byte) -110);
            var3 = (cl) (Object) oe.field_I.c((byte) -54);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_q) {
                    var3 = (cl) (Object) oe.field_I.d(true);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                si.a(122);
                return;
              } else {
                L3: {
                  var4 = var15.d((byte) -125);
                  if (var4 == 0) {
                    break L3;
                  } else {
                    var5 = var3.field_z;
                    t.field_cb[0] = oa.field_f;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        ba.a(2147483647, var4, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            int discarded$5 = 6;
                            pd.a(var5);
                            String[][] dupTemp$6 = new String[2][var5];
                            var3.field_x = dupTemp$6;
                            var6 = dupTemp$6;
                            int[][] dupTemp$7 = new int[2][var5 * 4];
                            var3.field_u = dupTemp$7;
                            var7 = dupTemp$7;
                            var8 = og.field_eb;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var8 <= var13) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = ch.field_a[var13 + var5];
                                      var6[1][var14] = t.field_cb[var11];
                                      var7[1][var14 * 4] = ad.field_i[var11];
                                      var7[1][1 + 4 * var14] = oa.field_e[var11];
                                      var7[1][4 * var14 + 2] = ln.field_a[var11];
                                      var7[1][4 * var14 + 3] = mk.field_b[var11];
                                      int discarded$8 = 1;
                                      if (k.a(t.field_cb[var11])) {
                                        if (ln.field_a[var11] + oa.field_e[var11] + mk.field_b[var11] != 0) {
                                          break L8;
                                        } else {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var13++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = ch.field_a[var9];
                                  var6[0][var10] = t.field_cb[var11];
                                  var7[0][var10 * 4] = ad.field_i[var11];
                                  var7[0][1 + var10 * 4] = oa.field_e[var11];
                                  var7[0][2 + 4 * var10] = ln.field_a[var11];
                                  var7[0][3 + var10 * 4] = mk.field_b[var11];
                                  int discarded$9 = 1;
                                  if (!k.a(t.field_cb[var11])) {
                                    break L9;
                                  } else {
                                    if (oa.field_e[var11] + (ln.field_a[var11] - -mk.field_b[var11]) != 0) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              pn.a(63, (wl) (Object) var15);
                              if (var6_int == 0) {
                                var3.field_p = oc.field_c;
                                var3.field_o = dj.field_Y;
                                var3.field_w = tj.field_Pb;
                                var3.field_t = vm.field_s;
                                ri.a(var6_int, dj.field_Y, -1, vm.field_s, tj.field_Pb, oc.field_c);
                                break L10;
                              } else {
                                ri.a(var6_int, dj.field_Y, -1, vm.field_s, tj.field_Pb, oc.field_c);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        t.field_cb[var6_int] = var15.c((byte) -38);
                        var6_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var3.field_A = true;
                var3.b((byte) 104);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "ul.A(" + 112 + ')');
        }
    }

    public static void b() {
        field_h = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_i = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 < 2) {
            if (5 > param0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    final static void a(int param0) {
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
