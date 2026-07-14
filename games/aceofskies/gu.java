/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu {
    private String field_b;
    static vd[] field_a;
    static ll[] field_c;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            gu.a(false);
        }
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    gu(String param0) {
        ((gu) this).field_b = param0;
    }

    final static void a(int param0) {
        int var2 = 0;
        ht var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        gk var13 = null;
        int var14 = 0;
        int var15 = 0;
        dl var16 = null;
        int[][] var20 = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        var16 = nm.field_c;
        var2 = var16.g(param0 + -90);
        var3 = (ht) an.field_b.d(268435455);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var2 != ((ht) var3).field_l) {
                var3 = (ht) an.field_b.b((byte) 103);
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param0 == 4) {
              break L2;
            } else {
              var13 = (gk) null;
              ml discarded$1 = gu.a(-24, (gk) null, -121);
              break L2;
            }
          }
          if (var3 != null) {
            L3: {
              var4 = var16.g(param0 + 117);
              if (-1 != (var4 ^ -1)) {
                var5 = ((ht) var3).field_f;
                mb.field_t[0] = fj.field_a;
                var6_int = 1;
                L4: while (true) {
                  if (var6_int >= var4) {
                    ud.a(var4, var5, 2);
                    var6_int = 0;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        eu.a(var5, true);
                        var6 = new String[2][var5];
                        var20 = new int[2][var5 * 4];
                        var8 = os.field_w;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var9 >= var8) {
                            var14 = 0;
                            var9 = var14;
                            var15 = 0;
                            var10 = var15;
                            L7: while (true) {
                              if (var8 <= var14) {
                                break L3;
                              } else {
                                var11 = uf.field_d[var14 + var5];
                                var6[1][var15] = mb.field_t[var11];
                                var20[1][var15 * 4] = js.field_c[var11];
                                var20[1][var15 * 4 + 1] = hg.field_C[var11];
                                var20[1][2 + var15 * 4] = qd.field_p[var11];
                                var20[1][3 + var15 * 4] = dd.field_c[var11];
                                if (fd.a(mb.field_t[var11], (byte) -6)) {
                                  if (hg.field_C[var11] - -qd.field_p[var11] + dd.field_c[var11] == 0) {
                                    var6[1][var15] = null;
                                    var15--;
                                    var14++;
                                    var15++;
                                    continue L7;
                                  } else {
                                    var14++;
                                    var15++;
                                    continue L7;
                                  }
                                } else {
                                  var14++;
                                  var15++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = uf.field_d[var9];
                            var6[0][var10] = mb.field_t[var11];
                            var20[0][var10 * 4] = js.field_c[var11];
                            var20[0][1 + var10 * 4] = hg.field_C[var11];
                            var20[0][var10 * 4 + 2] = qd.field_p[var11];
                            var20[0][3 + 4 * var10] = dd.field_c[var11];
                            if (fd.a(mb.field_t[var11], (byte) -6)) {
                              if (-1 == (qd.field_p[var11] + (hg.field_C[var11] + dd.field_c[var11]) ^ -1)) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L6;
                              } else {
                                var10++;
                                var9++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        ju.a(965924047, (rb) (Object) var16);
                        if (-1 != (var6_int ^ -1)) {
                          o.a(fs.field_c, var6_int, 54, tj.field_o, ld.field_a, gl.field_b);
                          var6_int++;
                          continue L5;
                        } else {
                          o.a(fs.field_c, var6_int, 56, tj.field_o, ld.field_a, gl.field_b);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    mb.field_t[var6_int] = var16.h(-17883);
                    var6_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            var3.c(param0 + -128);
            return;
          } else {
            te.b(true);
            return;
          }
        }
    }

    final boolean a(int param0, String param1) {
        if (param0 != 4) {
            field_c = (ll[]) null;
        }
        return ((gu) this).field_b.equals((Object) (Object) param1);
    }

    final static ml a(int param0, gk param1, int param2) {
        byte[] var4 = param1.d(param0, -2);
        byte[] var3 = var4;
        if (var4 == null) {
            return null;
        }
        if (param2 != 16652) {
            field_a = (vd[]) null;
        }
        return new ml(var4);
    }

    final void a(java.applet.Applet param0, byte param1) {
        jt.a("jagex-last-login-method", ((gu) this).field_b, 31536000L, param0, 0);
        int var3 = 79 / ((param1 - 77) / 44);
    }

    static {
    }
}
