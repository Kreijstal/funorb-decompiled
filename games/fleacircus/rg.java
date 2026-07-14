/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends ef {
    static String field_r;
    static int field_p;
    static String field_q;
    static int field_n;
    static fa field_o;

    final uj a(boolean param0) {
        if (!param0) {
            rg.b(false);
        }
        return ui.field_nb;
    }

    rg(long param0, String param1) {
        super(param0, param1);
    }

    final static gm b(byte param0, String param1) {
        String var2 = null;
        gm var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = fleas.field_A ? 1 : 0;
        if (null != di.field_b) {
          if (param1 != null) {
            if (0 != param1.length()) {
              var7 = (CharSequence) (Object) param1;
              var2 = uk.a(-100, var7);
              if (var2 != null) {
                var3 = (gm) (Object) di.field_b.a((long)var2.hashCode(), 16571);
                var4 = 98 % ((-92 - param0) / 33);
                L0: while (true) {
                  if (var3 != null) {
                    var8 = (CharSequence) (Object) var3.field_jb;
                    var5 = uk.a(99, var8);
                    if (var5.equals((Object) (Object) var2)) {
                      return var3;
                    } else {
                      var3 = (gm) (Object) di.field_b.a(-111);
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = fleas.field_A ? 1 : 0;
        if (param0 != 4) {
            field_n = 55;
        }
        for (var1 = 0; -41 < (var1 ^ -1); var1++) {
            qg.field_a[var1] = rk.field_s;
            dh.field_b[var1] = ck.field_o;
            ge.field_a[var1] = -4;
            cl.field_d[var1] = 0;
            jd.field_o[var1] = 0;
            nb.field_b = 0;
            qg.field_c = 149;
            va.field_t[var1] = 0;
            lh.field_e[qg.field_a[var1] / 4][dh.field_b[var1] / 4] = 1;
        }
    }

    final static void a(int param0, dd param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        dd var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = fleas.field_A ? 1 : 0;
          if (gb.field_l > param0) {
            param2 = param2 - (gb.field_l - param0);
            param0 = gb.field_l;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 + param0 > gb.field_h) {
            param2 = gb.field_h - param0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (gb.field_b <= param7) {
            break L2;
          } else {
            param3 = param3 - (-param7 + gb.field_b);
            param7 = gb.field_b;
            break L2;
          }
        }
        L3: {
          if (param7 - -param3 > gb.field_i) {
            param3 = gb.field_i + -param7;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (-1 <= (param2 ^ -1)) {
            break L4;
          } else {
            if ((param3 ^ -1) < -1) {
              var21 = param1.c();
              var32 = gb.field_a;
              var10 = gb.field_d;
              var11 = gb.field_k;
              var30 = new int[4];
              gb.a(var30);
              param1.f();
              gb.g(var30[0], var30[1], var30[2], var30[3]);
              var13 = param7 * param1.field_w + param0;
              var14 = param1.field_w - param2;
              var31 = var21.field_B;
              var28 = var31;
              var25 = var28;
              var22 = var25;
              var15 = var22;
              var16 = param7;
              L5: while (true) {
                if (param3 - -param7 <= var16) {
                  L6: {
                    var21.d(-param1.field_q, -param1.field_v);
                    gb.a(var32, var10, var11);
                    gb.b(var30);
                    if (param5 <= -3) {
                      break L6;
                    } else {
                      field_n = 126;
                      break L6;
                    }
                  }
                  return;
                } else {
                  var17 = param0;
                  L7: while (true) {
                    if (var17 >= param2 + param0) {
                      var13 = var13 + var14;
                      var16++;
                      continue L5;
                    } else {
                      var18 = var31[var13];
                      if (0 != var18) {
                        L8: {
                          L9: {
                            if (var17 <= 0) {
                              break L9;
                            } else {
                              if (-1 == (var15[-1 + var13] ^ -1)) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var16 <= 0) {
                              break L10;
                            } else {
                              if (var15[-param1.field_w + var13] == -1) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (-1 + param1.field_w <= var17) {
                              break L11;
                            } else {
                              if (-1 == var15[1 + var13]) {
                                break L8;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (var16 < param1.field_t + -1) {
                            if (0 == var15[var13 + param1.field_w]) {
                              break L8;
                            } else {
                              var13++;
                              var17++;
                              continue L7;
                            }
                          } else {
                            var13++;
                            var17++;
                            continue L7;
                          }
                        }
                        gb.f(var17, var16, param6, param4);
                        var13++;
                        var17++;
                        continue L7;
                      } else {
                        var13++;
                        var17++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
            Object var2 = null;
            gm discarded$0 = rg.b((byte) 68, (String) null);
        }
        field_q = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "You have <%0> unread messages!";
        field_q = "Loading fonts";
        field_p = 0;
    }
}
