/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends ff {
    static java.security.SecureRandom field_N;
    static String field_Q;
    private o field_R;
    static ok field_S;
    private int field_U;
    private String field_L;
    static o field_M;
    static String field_K;
    static String[] field_O;
    private dk field_T;
    static int field_P;

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param3)) {
            var4 += 4;
        }
        if (param1 != -3567) {
            field_O = null;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (!(!param2)) {
            var4++;
        }
        return sk.field_y[var4];
    }

    final static kl a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param1 != -1784753947) {
            field_M = null;
        }
        return sc.a(param0, 12000, param3, false, param2, param4);
    }

    public static void a(byte param0) {
        if (param0 <= 59) {
            kl discarded$0 = l.a(-35, -95, true, 66, true);
        }
        field_M = null;
        field_S = null;
        field_K = null;
        field_Q = null;
        field_O = null;
        field_N = null;
    }

    l(dk param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (bf) (Object) ml.a((byte) -87));
        ((l) this).field_L = param1;
        ((l) this).field_T = param0;
        ((l) this).a(125, param3, param5, param4, param2);
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = wizardrun.field_H;
          if (ed.field_c > param3) {
            param4 = param4 - (-param3 + ed.field_c);
            param3 = ed.field_c;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3 + param4 > ed.field_l) {
            param4 = -param3 + ed.field_l;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (ed.field_i > param2) {
            param0 = param0 - (ed.field_i - param2);
            param2 = ed.field_i;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param1 == -105) {
            break L3;
          } else {
            l.a((byte) -126);
            break L3;
          }
        }
        L4: {
          if (ed.field_b < param2 - -param0) {
            param0 = -param2 + ed.field_b;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (0 >= param4) {
            break L5;
          } else {
            if ((param0 ^ -1) < -1) {
              var6 = param3 + ed.field_h * param2;
              var7 = -param4 + ed.field_h;
              param2 = -param0;
              L6: while (true) {
                if (0 <= param2) {
                  return;
                } else {
                  param3 = -param4;
                  L7: while (true) {
                    if ((param3 ^ -1) <= -1) {
                      var6 = var6 + var7;
                      param2++;
                      continue L6;
                    } else {
                      var8 = ed.field_k[var6];
                      if ((var8 & 65280) >> 900604296 > param5) {
                        if ((255 & var8 >> 1775721096) >= (16711680 & var8) >> -1465556400) {
                          L8: {
                            var9 = -60 + (510 & var8 >> 768965647);
                            if ((var9 ^ -1) < -256) {
                              var9 = 255;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10 = var8 & 65280;
                          var10 = (var10 >> -7869727) + -(var10 >> -1784753947) & 65280;
                          var11 = 31 & var8 >> 1779910755;
                          ed.field_k[var6] = sd.a(var11, sd.a(var10, var9 << 1761766096));
                          var6++;
                          param3++;
                          continue L7;
                        } else {
                          var6++;
                          param3++;
                          continue L7;
                        }
                      } else {
                        var6++;
                        param3++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
        }
    }

    final String c(boolean param0) {
        if (!param0) {
            return null;
        }
        l.a(23, (byte) -128, -52, 32, 59, 33);
        return null;
    }

    final void a(int param0, int param1, int param2, ub param3) {
        ((l) this).field_U = ((l) this).field_U + 1;
        if (param0 != 10000536) {
            field_S = null;
        }
        super.a(param0 + 0, param1, param2, param3);
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        ok var6 = null;
        qe var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        o var14 = null;
        o var15 = null;
        o var16 = null;
        L0: {
          L1: {
            var13 = wizardrun.field_H;
            var6 = ((l) this).field_T.a(true);
            if (var6 == nf.field_c) {
              break L1;
            } else {
              if (var6 == field_S) {
                break L1;
              } else {
                var5 = ((l) this).field_T.a(-2864);
                if (var5 == null) {
                  var5 = ((l) this).field_L;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = ke.field_v;
          break L0;
        }
        L2: {
          if (!var5.equals((Object) (Object) ((l) this).field_k)) {
            ((l) this).field_k = var5;
            ((l) this).e(param1 + 0);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            super.a(param0, param1, param2, param3);
            var6 = ((l) this).field_T.a(true);
            var8 = (qe) (Object) ((l) this).field_w;
            var9 = param0 - -((l) this).field_o;
            var10 = var8.a(true, param3, (ub) this) + (var8.a((ub) this, (byte) 96).b(126) >> 766388993);
            if (var6 == nf.field_c) {
              break L4;
            } else {
              if (field_S == var6) {
                break L4;
              } else {
                if (var6 != hg.field_c) {
                  if (gf.field_V != var6) {
                    break L3;
                  } else {
                    var15 = te.field_k[1];
                    var15.a(var9, -(var15.field_p >> 534468609) + var10, 256);
                    break L3;
                  }
                } else {
                  var14 = te.field_k[2];
                  var14.a(var9, var10 + -(var14.field_p >> -1855037279), 256);
                  break L3;
                }
              }
            }
          }
          L5: {
            L6: {
              var16 = te.field_k[0];
              var11 = var16.field_x << 2021657377;
              var12 = var16.field_s << 803106337;
              if (((l) this).field_R == null) {
                break L6;
              } else {
                if (((l) this).field_R.field_z < var11) {
                  break L6;
                } else {
                  if (var12 > ((l) this).field_R.field_p) {
                    break L6;
                  } else {
                    ud.a(((l) this).field_R, false);
                    ed.d();
                    break L5;
                  }
                }
              }
            }
            ((l) this).field_R = new o(var11, var12);
            ud.a(((l) this).field_R, false);
            break L5;
          }
          var16.b(112, 144, var16.field_x << 209133572, var16.field_s << 1435649668, -((l) this).field_U << 1987913514, 4096);
          bb.b(4);
          ((l) this).field_R.a(-(var16.field_x >> 1707092833) + var9, -var16.field_s + var10, 256);
          break L3;
        }
    }

    final boolean a(ub param0, int param1) {
        if (param1 != 8) {
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Tutorial";
        field_S = new ok();
        field_O = new String[]{"Four new worlds to battle though", "Meet fearsome enemies", "Travel to the icy mountains", "Save your master"};
        field_P = -1;
    }
}
