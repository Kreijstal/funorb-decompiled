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
          if (~var7 <= ~var4) {
            var5 = 194;
            var6 = 169;
            var4 = 22;
            var7 = 0;
            var8 = param1 - -35;
            L1: while (true) {
              if (~var4 >= ~var7) {
                jb.field_L.a(((ac) this).field_x + param0 - 90, param1 + 10);
                if (param2) {
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
                      var9 = var9 | (var9 << 16 | var9 << 8);
                      pb.g(param0, var8, 6, var9);
                      pb.g(-6 + param0 - -((ac) this).field_x, var8, 6, var9);
                      var8++;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  field_gb = null;
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
                      var9 = var9 | (var9 << 16 | var9 << 8);
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
                var9 = var9 | (var9 << 16 | var9 << 8);
                pb.g(param0, var8, 6, var9);
                pb.g(((ac) this).field_x + (param0 - 6), var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (var8 < pb.field_l) {
              var7++;
              var8++;
              continue L0;
            } else {
              if (~var8 > ~pb.field_d) {
                L4: {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var10 = 0;
                  var11 = ((ac) this).field_x;
                  if (var7 <= 20) {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        L6: {
                          var12 = (-var7 + 20) * (20 - var7) + (20 + -var10) * (20 - var10);
                          if (462 < var12) {
                            break L6;
                          } else {
                            if (var12 >= 420) {
                              var13 = (462 + -var12) * var9 / 42;
                              var13 = var13 | (var13 << 16 | var13 << 8);
                              pb.field_g[param0 + (var8 * pb.field_c + var10)] = var13;
                              break L6;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var10++;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (20 < var7) {
                    break L7;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L8: while (true) {
                      L9: {
                        if (var13 > 20) {
                          break L9;
                        } else {
                          var14 = var13 * var13 + (20 + -var7) * (-var7 + 20);
                          if (462 >= var14) {
                            if (420 > var14) {
                              var12 = var11 + 1;
                              var13++;
                              var11++;
                              continue L8;
                            } else {
                              var15 = var9 * (462 + -var14) / 42;
                              var15 = var15 | (var15 << 8 | var15 << 16);
                              pb.field_g[var8 * pb.field_c - -param0 + var11] = var15;
                              var13++;
                              var11++;
                              continue L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      var11 = var12;
                      break L7;
                    }
                  }
                }
                var9 = var9 | (var9 << 16 | var9 << 8);
                pb.g(var10 + param0, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param3 <= 0) {
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

    public static void k() {
        field_Z = null;
        field_ab = null;
        field_gb = null;
        field_bb = null;
    }

    boolean i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 >= ((ac) this).field_db) {
          if (param0 != -8350) {
            boolean discarded$4 = ((ac) this).i(-53);
            return super.i(-8350);
          } else {
            return super.i(-8350);
          }
        } else {
          var2 = ((ac) this).field_cb;
          var3 = ((ac) this).field_Y;
          int fieldTemp$5 = ((ac) this).field_eb + 1;
          ((ac) this).field_eb = ((ac) this).field_eb + 1;
          if (fieldTemp$5 >= ((ac) this).field_db) {
            ((ac) this).field_db = 0;
            ((ac) this).j((byte) 59);
            ((ac) this).a((byte) -70, var2, var3);
            if (param0 == -8350) {
              return super.i(-8350);
            } else {
              boolean discarded$6 = ((ac) this).i(-53);
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
              boolean discarded$7 = ((ac) this).i(-53);
              return super.i(-8350);
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              cc.field_bc.field_S = param3;
              if (2 == ib.field_b) {
                qa.field_N.field_S = qh.field_Ub;
                break L1;
              } else {
                qa.field_N.field_S = ql.field_Yb;
                break L1;
              }
            }
            var9_int = 495;
            var10 = 5;
            te.field_f.a(0, var10, param0, 5, -10 + var9_int);
            vd.field_d.a(0, 0, param0, 0, te.field_f.field_zb + -wh.field_e.field_zb);
            wh.field_e.a(0, 0, param0, vd.field_d.field_zb, wh.field_e.field_zb);
            var10 = var10 + (param0 - -param6);
            var12 = 0;
            vc.field_f.a(0, var10, param2, 5, vc.field_f.g(-2147483648));
            var11 = qa.field_N.g(-2147483648);
            qa.field_N.a(0, var10, param2, var9_int + (-5 + -var11), var11);
            cc.field_bc.a(0, 0, 20, 0, var9_int);
            var13 = 5 + var10 - -param2;
            in.field_d.a(0, 20, var13, 0, var9_int);
            var13 = var13 + 20;
            in.field_d.field_I = se.a(3, 2105376, 11579568, in.field_d.field_Lb, 8421504, 13574);
            hh.field_a.a(0, param7 + -(var13 / 2), var13, param1 + -(var9_int / 2), var9_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var9;
            stackOut_5_1 = new StringBuilder().append("ac.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 20 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + -126 + ')');
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
