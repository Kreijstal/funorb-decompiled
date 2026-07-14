/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static um field_f;
    static int field_e;
    static String field_l;
    static byte[] field_k;
    static String field_g;
    static int field_b;
    static int field_m;
    static String field_i;
    static int[] field_n;
    static i field_c;
    static ck[][] field_d;
    static int field_h;
    static String field_a;
    static ck[][] field_j;

    final static String a(boolean param0, byte param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        if (param2 != null) {
          L0: {
            var3 = param2.length();
            if (-2 < var3) {
              break L0;
            } else {
              if (-13 < var3) {
                break L0;
              } else {
                L1: {
                  var4 = kf.a(param2, (byte) 2);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (1 > var4.length()) {
                      break L1;
                    } else {
                      L2: {
                        if (ug.a(var4.charAt(0), 32)) {
                          break L2;
                        } else {
                          if (ug.a(var4.charAt(-1 + var4.length()), 32)) {
                            break L2;
                          } else {
                            if (param1 > 12) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param2.length() <= var6) {
                                  if (var5 > 0) {
                                    return qf.field_j;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param2.charAt(var6);
                                    if (!ug.a((char) var7, 32)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  if (2 <= var5) {
                                    if (!param0) {
                                      return un.field_b;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                      return qf.field_j;
                    }
                  }
                }
                return di.field_G;
              }
            }
          }
          return di.field_G;
        } else {
          return di.field_G;
        }
    }

    final static void a(long param0, String param1, int param2, int param3, int param4) {
        fa.field_r = param1;
        qa.field_y = param3;
        cd.field_a = param4;
        if (param2 > -21) {
            field_i = null;
        }
        li.field_e = param0;
        ch.field_c = true;
    }

    final static boolean a(int param0, int param1, int[] param2) {
        if (param0 > -6) {
            field_b = -32;
        }
        return 0 != (param2[param1 >> 1301827237] & 1 << (param1 & 31)) ? true : false;
    }

    final static void a(boolean param0, byte param1, String param2, boolean param3) {
        wj.q(-61);
        ah.field_c.c(true);
        dm.field_c = new he(hb.field_Ob, (String) null, vb.field_Z, param0, param3);
        if (param1 > -13) {
            Object var5 = null;
            rb.a(false, (byte) -65, (String) null, false);
        }
        de.field_W = new ph(ah.field_c, (ce) (Object) dm.field_c);
        ah.field_c.a((byte) -109, (ce) (Object) de.field_W);
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_j = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != 573767765) {
            field_l = null;
        }
        field_f = null;
        field_n = null;
        field_g = null;
        field_i = null;
    }

    final static String a(int param0, int param1, String param2) {
        CharSequence var6 = (CharSequence) (Object) param2;
        if (!dc.a(var6, (byte) -70)) {
            return ge.field_d;
        }
        if ((jj.field_b ^ -1) != -3) {
            return ah.field_e;
        }
        if (k.a(param2, true)) {
            return si.field_i;
        }
        if (qe.a(param2, param1 ^ 3)) {
            return cm.a((byte) 111, f.field_p, new String[1]);
        }
        if (100 <= md.field_Z) {
            if (0 >= eh.field_a) {
                return bh.field_f;
            }
        }
        if (200 <= md.field_Z) {
            return bh.field_f;
        }
        if (ik.a(param2, (byte) -118)) {
            return cm.a((byte) 82, pe.field_a, new String[1]);
        }
        uf var5 = we.field_b;
        var5.f(param0, -4);
        var5.field_n = var5.field_n + 1;
        int var4 = var5.field_n;
        var5.a(true, 0);
        var5.a(param1, param2);
        var5.b(-var4 + var5.field_n, true);
        return null;
    }

    final static void a(hl param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            L1: {
              if (param1 == -3) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (ic.field_c <= var2) {
                ql.field_d[param0.b((byte) 94)] = ql.field_d[param0.b((byte) 94)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (ic.field_c <= var3) {
                    ic.field_c = var2;
                    ic.field_c = ic.field_c + 1;
                    pd.field_g[ic.field_c] = param0;
                    return;
                  } else {
                    L4: {
                      if (param0.field_m != pd.field_g[var3].field_m) {
                        break L4;
                      } else {
                        var4 = pd.field_g[var3].b((byte) 94);
                        if (ql.field_d[var4] <= kf.field_M) {
                          break L4;
                        } else {
                          ql.field_d[var4] = ql.field_d[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      }
                    }
                    var2++;
                    pd.field_g[var2] = pd.field_g[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (pd.field_g[var2].field_m == param0.field_m) {
                  ql.field_d[pd.field_g[var2].b((byte) 94)] = ql.field_d[pd.field_g[var2].b((byte) 94)] + 1;
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            ql.field_d[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new um();
        field_i = "Open in popup window";
        field_n = new int[]{287440998, 288563797, 288572484, 287467144, 289703987, 288594261, 288602999, 288612215, 573767765, 574894916, 572679765, 574920994, 573819955, 572718933};
        field_h = 0;
        field_g = "This password contains your Player Name, and would be easy to guess";
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = 0;
        field_j = new ck[8][];
        field_d = new ck[8][];
        field_c = new i();
    }
}
