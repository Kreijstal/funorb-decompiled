/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    static wk field_a;
    static String field_c;
    private v field_b;

    private final boolean a(byte param0, int param1) {
        ((eo) this).field_b.a(1, param1);
        int var3 = ((eo) this).field_b.field_e[0];
        int var4 = ((eo) this).field_b.field_e[1];
        if (param0 > -77) {
            Object var7 = null;
            this.a(-96, -101, (jd) null);
        }
        int var5 = so.field_b.field_a;
        int var6 = so.field_b.field_g;
        if (var3 > var5) {
            return false;
        }
        if ((var3 ^ -1) > 179) {
            return false;
        }
        if (!(var6 >= var4)) {
            return false;
        }
        if (var4 < -10) {
            return false;
        }
        return true;
    }

    final static int b(int param0) {
        if (param0 != 1) {
            return 66;
        }
        return kl.field_a.field_p[1];
    }

    final boolean a(int param0, int param1, int param2, int param3, jd param4) {
        int var6 = 0;
        if (param4 == null) {
            return true;
        }
        if (param1 != -35) {
            ((eo) this).field_b = null;
        }
        if (-1 < param3) {
            param4.field_fb = param3;
        }
        if (null == param4.field_x) {
            var6 = param4.field_N;
            if (-35 == (var6 ^ -1)) {
                if (!(!param4.field_W)) {
                    var6 = 75;
                }
            }
            param4.field_x = new hr(param4.field_R, var6, param4.field_fb);
        }
        if (param4.field_x != null) {
            if (!(param4.field_z != -1)) {
                param4.field_z = 0;
            }
            return param4.field_x.a(param2, param4.field_U, param0, param3, param4.field_z, false);
        }
        return true;
    }

    final void a(int param0, byte param1, int param2, ne[] param3) {
        int var5 = 0;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = param2 * param0;
        var7 = 0;
        L0: while (true) {
          if (var5 <= var7) {
            L1: {
              if (param1 > 91) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            return;
          } else {
            var6 = param3[var7].field_c;
            if (var6 != null) {
              if (!var6.field_u) {
                this.a(79, var7, var6);
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, byte param2, ru param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 <= -55) {
          var5 = 0;
          param4 = param4 + param3.field_d;
          param0 = param0 + param3.field_i;
          var6 = 0;
          L0: while (true) {
            if (param3.field_h <= var6) {
              return;
            } else {
              var7 = 0;
              L1: while (true) {
                if (param3.field_e <= var7) {
                  var6++;
                  continue L0;
                } else {
                  var8 = param3.field_k[var5];
                  var5++;
                  if (-1 > var8) {
                    var9 = -3;
                    L2: while (true) {
                      if (4 > var9) {
                        var10 = -3;
                        L3: while (true) {
                          if (var10 >= 4) {
                            var9++;
                            continue L2;
                          } else {
                            L4: {
                              if (0 >= var7 - -var9) {
                                break L4;
                              } else {
                                if (var9 + var7 >= param3.field_e) {
                                  break L4;
                                } else {
                                  if (-1 >= var6 - -var10) {
                                    break L4;
                                  } else {
                                    if (param3.field_h <= var10 + var6) {
                                      break L4;
                                    } else {
                                      if (param3.field_k[(var10 + var6) * param3.field_e + (var7 + var9)] == 0) {
                                        break L4;
                                      } else {
                                        var10++;
                                        continue L3;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            qn.g(var7 + (param0 - -var9), var10 + param4 - -var6, param1, var9 * var9 - -(var10 * var10));
                            var10++;
                            continue L3;
                          }
                        }
                      } else {
                        var7++;
                        continue L1;
                      }
                    }
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            field_c = null;
        }
    }

    private final void a(int param0, int param1, jd param2) {
        if (!(param2 != null)) {
            return;
        }
        param2.field_U = this.a((byte) -81, param1);
        if (param0 <= 42) {
            Object var5 = null;
            boolean discarded$0 = eo.a(false, (kd) null, (String) null, (String) null, -91, (byte) -105, (String) null);
        }
        if (param2.field_U) {
            boolean discarded$2 = ((eo) this).a(param1, -35, -1, -1, param2);
        } else {
            if (!(param2.field_u)) {
                param2.field_x = null;
            }
        }
    }

    final static boolean a(boolean param0, kd param1, String param2, String param3, int param4, byte param5, String param6) {
        if (nb.field_i != oh.field_L) {
            return false;
        }
        oe var9 = new oe(rl.field_C, param1);
        rl.field_C.a((kb) (Object) var9, 0);
        if (ig.a(-8327)) {
            var9.k((byte) -119);
        } else {
            cd.field_e = param3;
            p.field_a = null;
            ue.field_a = param6;
            nm.field_z = param4;
            oh.field_L = du.field_d;
            ub.field_e = param0 ? true : false;
            qk.field_b = param2;
        }
        int var8 = 114 / ((21 - param5) / 52);
        return true;
    }

    eo(v param0) {
        j discarded$0 = new j(240, param0);
        ((eo) this).field_b = param0;
    }

    static {
    }
}
