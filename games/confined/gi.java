/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ah {
    private oi field_cb;
    static fi field_bb;
    static String field_fb;
    static String field_hb;
    private double field_gb;
    static byte[] field_db;
    static bi field_eb;

    final static vk a(m param0, byte param1, mi param2, String param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param2.a(-51, param4);
        var6 = param2.a(var5, param3, param1 ^ 126);
        if (param1 != -65) {
          return null;
        } else {
          return te.a((byte) -89, var6, param2, var5, param0);
        }
    }

    gi(hn param0, dj param1) {
        super(param0, param1, 0.5, 0.02, 64.0, pm.field_x);
        ((gi) this).field_cb = new oi((pm) this);
        kj.a(lf.field_i, 96, (pm) (Object) param1);
        ((gi) this).field_gb = 64.0;
    }

    final void a(mn param0, byte param1) {
        double[] var13 = new double[12];
        double[] var12 = var13;
        double[] var11 = var12;
        double[] var3 = var11;
        ((gi) this).field_ab.a((byte) 47, var13);
        double var4 = var13[9];
        double var6 = var13[10];
        ((gi) this).field_cb.field_t = -(((gi) this).field_C * var4) + ((gi) this).field_E;
        double var8 = var13[11];
        int var10 = -127 / ((-2 - param1) / 62);
        ((gi) this).field_cb.field_o = -(var6 * ((gi) this).field_C) + ((gi) this).field_t;
        ((gi) this).field_cb.field_v = -var8;
        ((gi) this).field_cb.field_p = -(((gi) this).field_C * var8) + ((gi) this).field_D;
        ((gi) this).field_cb.field_w = true;
        ((gi) this).field_cb.field_m = -var4;
        ((gi) this).field_cb.field_x = -var6;
        ((gi) this).field_cb.field_u = 50.0;
        param0.a((rk) (Object) ((gi) this).field_cb, (byte) 123);
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        double[] var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double[] var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        double[] var18 = null;
        double[] var19 = null;
        double[] var20 = null;
        double[] var21 = null;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param2 <= -5) {
          if (((gi) this).field_N) {
            return;
          } else {
            L0: {
              var21 = new double[12];
              var19 = var21;
              var17 = var19;
              var16 = var17;
              var15 = var16;
              var7 = var15;
              ((gi) this).field_ab.a((byte) 43, var21);
              var8 = var21[9];
              var10 = var21[10];
              var12 = var21[11];
              if (param3.field_N * var12 + (param3.field_H * var10 + param3.field_P * var8) <= 0.0) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L0;
              }
            }
            var14 = stackIn_20_0;
            if (var14 == 0) {
              pa.a(-(((gi) this).field_C * var8) + ((gi) this).field_E, 0.5 * ((gi) this).field_C, (byte) -11, 256, -(((gi) this).field_C * var12) + ((gi) this).field_D, -(((gi) this).field_C * var10) + ((gi) this).field_t, wb.field_a, param1, param3);
              if (var14 != 0) {
                return;
              } else {
                ((gi) this).a(u.field_T, ((gi) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                return;
              }
            } else {
              ((gi) this).a(u.field_T, ((gi) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
              pa.a(-(((gi) this).field_C * var8) + ((gi) this).field_E, 0.5 * ((gi) this).field_C, (byte) -11, 256, -(((gi) this).field_C * var12) + ((gi) this).field_D, -(((gi) this).field_C * var10) + ((gi) this).field_t, wb.field_a, param1, param3);
              return;
            }
          }
        } else {
          field_fb = null;
          if (((gi) this).field_N) {
            return;
          } else {
            L1: {
              var20 = new double[12];
              var18 = var20;
              var17 = var18;
              var16 = var17;
              var15 = var16;
              var7 = var15;
              ((gi) this).field_ab.a((byte) 43, var20);
              var8 = var20[9];
              var10 = var20[10];
              var12 = var20[11];
              if (param3.field_N * var12 + (param3.field_H * var10 + param3.field_P * var8) <= 0.0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            var14 = stackIn_7_0;
            if (var14 == 0) {
              pa.a(-(((gi) this).field_C * var8) + ((gi) this).field_E, 0.5 * ((gi) this).field_C, (byte) -11, 256, -(((gi) this).field_C * var12) + ((gi) this).field_D, -(((gi) this).field_C * var10) + ((gi) this).field_t, wb.field_a, param1, param3);
              if (var14 == 0) {
                ((gi) this).a(u.field_T, ((gi) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                return;
              } else {
                return;
              }
            } else {
              ((gi) this).a(u.field_T, ((gi) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
              pa.a(-(((gi) this).field_C * var8) + ((gi) this).field_E, 0.5 * ((gi) this).field_C, (byte) -11, 256, -(((gi) this).field_C * var12) + ((gi) this).field_D, -(((gi) this).field_C * var10) + ((gi) this).field_t, wb.field_a, param1, param3);
              return;
            }
          }
        }
    }

    public static void m(int param0) {
        field_db = null;
        field_fb = null;
        field_bb = null;
        field_hb = null;
        field_eb = null;
        if (param0 != -11008) {
            Object var2 = null;
            vk discarded$0 = gi.a((m) null, (byte) 3, (mi) null, (String) null, (String) null);
        }
    }

    final void g(int param0) {
        int var3 = 0;
        gk var5 = null;
        gk var6 = null;
        ((gi) this).field_A.field_P = false;
        ((gi) this).field_z = true;
        if (param0 == 26402) {
          L0: {
            ((gi) this).field_A.field_L = 100;
            ((gi) this).field_A.field_r = ((gi) this).field_t;
            ((gi) this).field_A.field_s = ((gi) this).field_E;
            ((gi) this).field_A.field_H = 0.6;
            ((gi) this).field_A.field_E = ((gi) this).field_D;
            ((gi) this).field_A.field_A = 0.5;
            var6 = new gk(((gi) this).field_A, (pm) null, vf.field_n, 0, false);
            var6.field_w = 4.0;
            var6.field_m = 255;
            ((gi) this).field_A.field_n = var6;
            var3 = ((gi) this).field_A.field_J.field_o;
            if (-1 <= (((gi) this).field_A.field_x.field_t ^ -1)) {
              break L0;
            } else {
              if (((gi) this).field_A.field_x.field_r[((gi) this).field_A.field_x.field_t] <= ((gi) this).field_D) {
                break L0;
              } else {
                L1: {
                  var3--;
                  if ((var3 ^ -1) > -5) {
                    break L1;
                  } else {
                    if ((var3 ^ -1) < -21) {
                      break L1;
                    } else {
                      if (0 == (var3 & 3)) {
                        di.a(-30867, 240, 15);
                        return;
                      } else {
                        if (var3 != 23) {
                          return;
                        } else {
                          di.a(-30867, 240, 15);
                          return;
                        }
                      }
                    }
                  }
                }
                if (var3 != 23) {
                  return;
                } else {
                  di.a(-30867, 240, 15);
                  return;
                }
              }
            }
          }
          L2: {
            if ((var3 ^ -1) > -5) {
              break L2;
            } else {
              if ((var3 ^ -1) < -21) {
                break L2;
              } else {
                if (0 == (var3 & 3)) {
                  di.a(-30867, 240, 15);
                  return;
                } else {
                  if (var3 != 23) {
                    return;
                  } else {
                    di.a(-30867, 240, 15);
                    return;
                  }
                }
              }
            }
          }
          if (var3 != 23) {
            return;
          } else {
            di.a(-30867, 240, 15);
            return;
          }
        } else {
          field_fb = null;
          ((gi) this).field_A.field_L = 100;
          ((gi) this).field_A.field_r = ((gi) this).field_t;
          ((gi) this).field_A.field_s = ((gi) this).field_E;
          ((gi) this).field_A.field_H = 0.6;
          ((gi) this).field_A.field_E = ((gi) this).field_D;
          ((gi) this).field_A.field_A = 0.5;
          var5 = new gk(((gi) this).field_A, (pm) null, vf.field_n, 0, false);
          var5.field_w = 4.0;
          var5.field_m = 255;
          ((gi) this).field_A.field_n = var5;
          var3 = ((gi) this).field_A.field_J.field_o;
          if (-1 > (((gi) this).field_A.field_x.field_t ^ -1)) {
            if (((gi) this).field_A.field_x.field_r[((gi) this).field_A.field_x.field_t] > ((gi) this).field_D) {
              L3: {
                var3--;
                if ((var3 ^ -1) > -5) {
                  break L3;
                } else {
                  if ((var3 ^ -1) < -21) {
                    break L3;
                  } else {
                    if (0 == (var3 & 3)) {
                      di.a(-30867, 240, 15);
                      return;
                    } else {
                      if (var3 != 23) {
                        return;
                      } else {
                        di.a(-30867, 240, 15);
                        return;
                      }
                    }
                  }
                }
              }
              if (var3 != 23) {
                return;
              } else {
                di.a(-30867, 240, 15);
                return;
              }
            } else {
              L4: {
                if ((var3 ^ -1) > -5) {
                  break L4;
                } else {
                  if ((var3 ^ -1) < -21) {
                    break L4;
                  } else {
                    if (0 != (var3 & 3)) {
                      L5: {
                        if (var3 != 23) {
                          break L5;
                        } else {
                          di.a(-30867, 240, 15);
                          break L5;
                        }
                      }
                      return;
                    } else {
                      di.a(-30867, 240, 15);
                      return;
                    }
                  }
                }
              }
              if (var3 == 23) {
                di.a(-30867, 240, 15);
                return;
              } else {
                return;
              }
            }
          } else {
            L6: {
              if ((var3 ^ -1) > -5) {
                break L6;
              } else {
                if ((var3 ^ -1) < -21) {
                  break L6;
                } else {
                  if (0 != (var3 & 3)) {
                    break L6;
                  } else {
                    di.a(-30867, 240, 15);
                    return;
                  }
                }
              }
            }
            if (var3 == 23) {
              di.a(-30867, 240, 15);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void b(boolean param0, ee param1) {
        if (param1 == ((gi) this).field_Y) {
          if (!param1.field_z) {
            if ((((gi) this).field_S ^ -1) >= -1) {
              ((gi) this).field_gb = param1.a(14170, true, ((gi) this).field_gb);
              if (!param0) {
                if (0.00001 > ((gi) this).field_gb) {
                  ((gi) this).a(param1, 0.0, -123);
                  ((gi) this).d(10797);
                  return;
                } else {
                  return;
                }
              } else {
                field_hb = null;
                if (0.00001 > ((gi) this).field_gb) {
                  ((gi) this).a(param1, 0.0, -123);
                  ((gi) this).d(10797);
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((gi) this).field_S = ((gi) this).field_S + 1;
              return;
            }
          } else {
            ((gi) this).field_S = ((gi) this).field_S + 1;
            return;
          }
        } else {
          ((gi) this).field_gb = param1.a(14170, true, ((gi) this).field_gb);
          if (!param0) {
            if (0.00001 > ((gi) this).field_gb) {
              ((gi) this).a(param1, 0.0, -123);
              ((gi) this).d(10797);
              return;
            } else {
              return;
            }
          } else {
            field_hb = null;
            if (0.00001 > ((gi) this).field_gb) {
              ((gi) this).a(param1, 0.0, -123);
              ((gi) this).d(10797);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static mi a(int param0, boolean param1, boolean param2, int param3, boolean param4) {
        if (!param2) {
            return null;
        }
        return we.a(param0, false, (byte) -125, param4, param3, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = new fi();
        field_hb = "You already have 4 nuclear missiles";
        field_fb = "Continue";
        field_db = new byte[520];
    }
}
