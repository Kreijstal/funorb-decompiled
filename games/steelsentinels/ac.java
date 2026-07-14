/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ac extends bb {
    private int field_eb;
    private int field_fb;
    static String field_gb;
    private int field_Y;
    static String field_Z;
    private int field_db;
    static String field_ab;
    private int field_hb;
    private int field_cb;
    static wk field_bb;

    void j(byte param0) {
        if (param0 < 6) {
            field_gb = null;
            return;
        }
    }

    ac(ka param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ac) this).field_eb = 0;
        ((ac) this).field_db = 0;
    }

    void i(byte param0) {
        if (!(((ac) this).field_db > 0)) {
            return;
        }
        ((ac) this).a((byte) -90, ((ac) this).field_cb, ((ac) this).field_Y);
        ((ac) this).field_db = 0;
        ((ac) this).j((byte) 12);
        int var2 = 73 % ((55 - param0) / 39);
    }

    final static gh k(int param0) {
        if (param0 != -4795) {
            return null;
        }
        return rn.field_y.field_Ub;
    }

    void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = SteelSentinels.field_G;
        pb.e(6 + param0, param1 - -35, -12 + ((ac) this).field_x, ((ac) this).field_E + -40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var7 >= var4) {
            var5 = 194;
            var6 = 169;
            var4 = 22;
            var7 = 0;
            var8 = param1 - -35;
            L1: while (true) {
              if (var4 <= var7) {
                jb.field_L.a(((ac) this).field_x + param0 - 90, param1 + 10);
                if (!param2) {
                  field_gb = null;
                  uc.a(jj.field_k, ((ac) this).field_x + -10, 35 + param1, (byte) -39, param0 - -5);
                  uc.a(jb.field_J, ((ac) this).field_x, ((ac) this).field_E + (param1 - 22), (byte) -39, param0);
                  var5 = 169;
                  var4 = -79 + ((ac) this).field_E;
                  var6 = 127;
                  var7 = 0;
                  var8 = param1 - -57;
                  L2: while (true) {
                    if (var4 <= var7) {
                      return;
                    } else {
                      var9 = var5 - -((-var5 + var6) * var7 / var4);
                      var9 = var9 | (var9 << 3643632 | var9 << -761581528);
                      pb.g(param0, var8, 6, var9);
                      pb.g(-6 + param0 - -((ac) this).field_x, var8, 6, var9);
                      var8++;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  uc.a(jj.field_k, ((ac) this).field_x + -10, 35 + param1, (byte) -39, param0 - -5);
                  uc.a(jb.field_J, ((ac) this).field_x, ((ac) this).field_E + (param1 - 22), (byte) -39, param0);
                  var5 = 169;
                  var4 = -79 + ((ac) this).field_E;
                  var6 = 127;
                  var7 = 0;
                  var8 = param1 - -57;
                  L3: while (true) {
                    if (var4 <= var7) {
                      return;
                    } else {
                      var9 = var5 - -((-var5 + var6) * var7 / var4);
                      var9 = var9 | (var9 << 3643632 | var9 << -761581528);
                      pb.g(param0, var8, 6, var9);
                      pb.g(-6 + param0 - -((ac) this).field_x, var8, 6, var9);
                      var8++;
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                var9 = var5 - -((-var5 + var6) * var7 / var4);
                var9 = var9 | (var9 << 1114537040 | var9 << 864495592);
                pb.g(param0, var8, 6, var9);
                pb.g(((ac) this).field_x + (param0 - 6), var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (var8 >= pb.field_l) {
              if (var8 < pb.field_d) {
                L4: {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var10 = 0;
                  var11 = ((ac) this).field_x;
                  if (var7 >= -21) {
                    L5: while (true) {
                      if (-21 < var10) {
                        break L4;
                      } else {
                        var12 = (-var7 + 20) * (20 - var7) + (20 + -var10) * (20 - var10);
                        if (462 >= var12) {
                          if (-421 >= (var12 ^ -1)) {
                            var13 = (462 + -var12) * var9 / 42;
                            var13 = var13 | (var13 << 160191856 | var13 << -1695924248);
                            pb.field_g[param0 + (var8 * pb.field_c + var10)] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (20 < var7) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = var13 * var13 + (20 + -var7) * (-var7 + 20);
                          if (462 >= var14) {
                            if (420 > var14) {
                              var12 = var11 + 1;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var15 = var9 * (462 + -var14) / 42;
                              var15 = var15 | (var15 << 1875173288 | var15 << -540212112);
                              pb.field_g[var8 * pb.field_c - -param0 + var11] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << -2093981456 | var9 << 279216968);
                pb.g(var10 + param0, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (-1 <= (param3 ^ -1)) {
          ((ac) this).a((byte) 99, param2, param1);
          return;
        } else {
          ((ac) this).field_Y = param1;
          ((ac) this).field_eb = 0;
          if (param0 != 103) {
            boolean discarded$2 = ((ac) this).j(63);
            ((ac) this).field_hb = ((ac) this).field_E;
            ((ac) this).field_fb = ((ac) this).field_x;
            ((ac) this).field_cb = param2;
            ((ac) this).field_db = param3;
            return;
          } else {
            ((ac) this).field_hb = ((ac) this).field_E;
            ((ac) this).field_fb = ((ac) this).field_x;
            ((ac) this).field_cb = param2;
            ((ac) this).field_db = param3;
            return;
          }
        }
    }

    boolean j(int param0) {
        ((ac) this).i((byte) 2);
        if (param0 > -50) {
            ((ac) this).field_cb = -21;
            return super.j(-55);
        }
        return super.j(-55);
    }

    public static void k(byte param0) {
        field_Z = null;
        field_ab = null;
        if (param0 != 38) {
          field_ab = null;
          field_gb = null;
          field_bb = null;
          return;
        } else {
          field_gb = null;
          field_bb = null;
          return;
        }
    }

    boolean i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 >= ((ac) this).field_db) {
          if (param0 != -8350) {
            boolean discarded$3 = ((ac) this).i(-53);
            return super.i(-8350);
          } else {
            return super.i(-8350);
          }
        } else {
          var2 = ((ac) this).field_cb;
          var3 = ((ac) this).field_Y;
          ((ac) this).field_eb = ((ac) this).field_eb + 1;
          if (((ac) this).field_eb + 1 >= ((ac) this).field_db) {
            ((ac) this).field_db = 0;
            ((ac) this).j((byte) 59);
            ((ac) this).a((byte) -70, var2, var3);
            if (param0 == -8350) {
              return super.i(-8350);
            } else {
              boolean discarded$4 = ((ac) this).i(-53);
              return super.i(-8350);
            }
          } else {
            var4 = ((ac) this).field_eb * (((ac) this).field_db * 2 - ((ac) this).field_eb);
            var5 = ((ac) this).field_db * ((ac) this).field_db;
            var3 = ((ac) this).field_hb - -((-((ac) this).field_hb + ((ac) this).field_Y) * var4 / var5);
            var2 = (-((ac) this).field_fb + ((ac) this).field_cb) * var4 / var5 + ((ac) this).field_fb;
            ((ac) this).a((byte) -70, var2, var3);
            if (param0 == -8350) {
              return super.i(-8350);
            } else {
              boolean discarded$5 = ((ac) this).i(-53);
              return super.i(-8350);
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cc.field_bc.field_S = param3;
        if (2 == ib.field_b) {
          qa.field_N.field_S = qh.field_Ub;
          var9 = 495;
          var10 = 5;
          te.field_f.a(0, var10, param0, 5, -10 + var9);
          vd.field_d.a(0, 0, param0, 0, te.field_f.field_zb + -wh.field_e.field_zb);
          wh.field_e.a(0, 0, param0, vd.field_d.field_zb, wh.field_e.field_zb);
          var10 = var10 + (param0 - -param6);
          var12 = 105 % ((-62 - param8) / 61);
          vc.field_f.a(0, var10, param2, 5, vc.field_f.g(-2147483648));
          var11 = qa.field_N.g(-2147483648);
          qa.field_N.a(0, var10, param2, var9 + (-5 + -var11), var11);
          cc.field_bc.a(0, 0, param4, 0, var9);
          var13 = 5 + var10 - -param2;
          in.field_d.a(0, param4, var13, 0, var9);
          var13 = var13 + param4;
          in.field_d.field_I = se.a(3, 2105376, 11579568, in.field_d.field_Lb, 8421504, 13574);
          hh.field_a.a(0, param7 + -(var13 / 2), var13, param1 + -(var9 / 2), var9);
          return;
        } else {
          qa.field_N.field_S = ql.field_Yb;
          var9 = 495;
          var10 = 5;
          te.field_f.a(0, var10, param0, 5, -10 + var9);
          vd.field_d.a(0, 0, param0, 0, te.field_f.field_zb + -wh.field_e.field_zb);
          wh.field_e.a(0, 0, param0, vd.field_d.field_zb, wh.field_e.field_zb);
          var10 = var10 + (param0 - -param6);
          var12 = 105 % ((-62 - param8) / 61);
          vc.field_f.a(0, var10, param2, 5, vc.field_f.g(-2147483648));
          var11 = qa.field_N.g(-2147483648);
          qa.field_N.a(0, var10, param2, var9 + (-5 + -var11), var11);
          cc.field_bc.a(0, 0, param4, 0, var9);
          var13 = 5 + var10 - -param2;
          in.field_d.a(0, param4, var13, 0, var9);
          var13 = var13 + param4;
          in.field_d.field_I = se.a(3, 2105376, 11579568, in.field_d.field_Lb, 8421504, 13574);
          hh.field_a.a(0, param7 + -(var13 / 2), var13, param1 + -(var9 / 2), var9);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "Target lock";
        field_Z = "<%1> was roadkill";
        field_ab = "Show all lobby chat";
    }
}
