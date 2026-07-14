/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends qe {
    static String field_n;
    static String field_p;
    private wa field_o;
    private wa field_q;

    final static int h(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        if (param0 == 3938) {
          boolean discarded$4 = tm.field_l.a(dc.field_O, co.field_i, (byte) -127, true);
          tm.field_l.i(-89);
          L0: while (true) {
            if (!nd.b((byte) -123)) {
              if ((el.field_r ^ -1) == 0) {
                if (!fe.field_Fb) {
                  if (ao.field_Kb != cb.field_c) {
                    if (w.field_I.b(-97)) {
                      if (ao.field_Kb == pa.field_l) {
                        return 2;
                      } else {
                        return -1;
                      }
                    } else {
                      return 1;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              } else {
                var1 = el.field_r;
                kf.a(-1, -1);
                return var1;
              }
            } else {
              boolean discarded$5 = tm.field_l.a(um.field_Gb, nm.field_d, -98);
              continue L0;
            }
          }
        } else {
          field_n = null;
          boolean discarded$6 = tm.field_l.a(dc.field_O, co.field_i, (byte) -127, true);
          tm.field_l.i(-89);
          L1: while (true) {
            if (!nd.b((byte) -123)) {
              if ((el.field_r ^ -1) == 0) {
                if (!fe.field_Fb) {
                  if (ao.field_Kb != cb.field_c) {
                    if (w.field_I.b(-97)) {
                      if (ao.field_Kb == pa.field_l) {
                        return 2;
                      } else {
                        return -1;
                      }
                    } else {
                      return 1;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              } else {
                var1 = el.field_r;
                kf.a(-1, -1);
                return var1;
              }
            } else {
              boolean discarded$7 = tm.field_l.a(um.field_Gb, nm.field_d, -98);
              continue L1;
            }
          }
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var8 = null;
        String var23 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        if (param0 == -22274) {
          var30 = ((sn) this).field_o.field_n.toLowerCase();
          var31 = param1.toLowerCase();
          if ((var30.length() ^ -1) < -1) {
            if (0 < var31.length()) {
              var5 = var30.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var30.length() + -1) {
                  var32 = var30.substring(0, var5);
                  var33 = var30.substring(1 + var5);
                  if (var31.indexOf(var32) <= -1) {
                    return true;
                  } else {
                    if (-1 <= var31.indexOf(var33)) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_n = null;
          var8 = ((sn) this).field_o.field_n.toLowerCase();
          var3 = var8;
          var23 = param1.toLowerCase();
          var4 = var23;
          if ((var8.length() ^ -1) < -1) {
            if (0 < var23.length()) {
              var5 = var8.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var8.length() + -1) {
                  var28 = var8.substring(0, var5);
                  var29 = var8.substring(1 + var5);
                  if (var23.indexOf(var28) <= -1) {
                    return true;
                  } else {
                    if (-1 <= var23.indexOf(var29)) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static mg a(eh param0, String param1, String param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        if (param3) {
          sn.c((byte) -70);
          var4 = param0.a(-1, param2);
          var5 = param0.a(-125, var4, param1);
          return w.a(param0, -80, var5, var4);
        } else {
          var4 = param0.a(-1, param2);
          var5 = param0.a(-125, var4, param1);
          return w.a(param0, -80, var5, var4);
        }
    }

    sn(wa param0, wa param1, wa param2) {
        super(param0);
        ((sn) this).field_o = param2;
        ((sn) this).field_q = param1;
    }

    final String a(int param0, String param1) {
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        String var7 = null;
        var7 = ((sn) this).field_q.field_n.toLowerCase();
        var4 = param1.toLowerCase();
        if (var4.length() != 0) {
          var5 = var4;
          if (!we.a((byte) 80, var5)) {
            if (jd.a(-685, var5)) {
              return ve.field_z;
            } else {
              if (!al.a(var5, param0 + 26484)) {
                if (this.b(-22274, param1)) {
                  return ib.field_a;
                } else {
                  if (param0 == -26358) {
                    if (-1 > (var7.length() ^ -1)) {
                      if (mj.a(var5, var7, (byte) 126)) {
                        return ec.field_A;
                      } else {
                        if (!me.a(var5, var7, true)) {
                          if (w.a(var5, var7, false)) {
                            return ec.field_A;
                          } else {
                            return nh.field_l;
                          }
                        } else {
                          return kn.field_G;
                        }
                      }
                    } else {
                      return ne.field_f;
                    }
                  } else {
                    var6 = null;
                    mg discarded$1 = sn.a((eh) null, (String) null, (String) null, false);
                    if (-1 > (var7.length() ^ -1)) {
                      if (mj.a(var5, var7, (byte) 126)) {
                        return ec.field_A;
                      } else {
                        if (!me.a(var5, var7, true)) {
                          if (w.a(var5, var7, false)) {
                            return ec.field_A;
                          } else {
                            return nh.field_l;
                          }
                        } else {
                          return kn.field_G;
                        }
                      }
                    } else {
                      return ne.field_f;
                    }
                  }
                }
              } else {
                return vd.field_V;
              }
            }
          } else {
            return nh.field_l;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Virogrid.field_F ? 1 : 0;
        while (true) {
            param3--;
            if (-1 < (param3 ^ -1)) {
                break;
            }
            var17 = param7;
            var10_ref_int__ = var17;
            var11 = param6;
            var12 = param9;
            var13 = param4;
            var14 = param1;
            var15 = (16711422 & var17[var11]) >> 1397994625;
            var10_ref_int__[var11] = var15 - -(rb.a(33455969, var14) >> 1332884177) - (-rb.a(16711680, var12 >> 1506145089) + -(rb.a(33423751, var13) >> -98375127));
            param4 = param4 + param0;
            param9 = param9 + param8;
            param1 = param1 + param2;
            param6++;
        }
        int var10 = -53 % ((param5 - -14) / 62);
    }

    public static void c(byte param0) {
        int var1 = -63 / ((-50 - param0) / 36);
        field_p = null;
        field_n = null;
    }

    final wl a(String param0, boolean param1) {
        String var3 = null;
        String var4 = null;
        var3 = ((sn) this).field_q.field_n.toLowerCase();
        var4 = param0.toLowerCase();
        if (0 != var4.length()) {
          if (param1) {
            if (!ql.a(-95, var3, var4)) {
              return ee.field_c;
            } else {
              if (this.b(-22274, param0)) {
                return ee.field_c;
              } else {
                return bm.field_i;
              }
            }
          } else {
            return null;
          }
        } else {
          return ee.field_c;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "The account name you use to access RuneScape and other Jagex.com games";
        field_p = "Pause Menu";
    }
}
