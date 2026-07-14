/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends vd implements gj {
    static bi[] field_w;
    static qr field_v;
    static String field_A;
    static String field_u;
    int field_y;
    private int field_x;
    static String field_z;

    final void e(int param0) {
        super.e(param0 + param0);
        ((lp) this).field_x = 0;
        ((lp) this).field_y = 0;
    }

    public final void a(int param0, int param1) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((lp) this).field_x == param1) {
            return;
        }
        int var3 = -((lp) this).field_i + ((lp) this).field_y;
        int var4 = var3 * param1 / 65536;
        int var5 = var3 * ((lp) this).field_x / 65536;
        vd var6 = (vd) (Object) ((lp) this).field_l.d(0);
        while (var6 != null) {
            var6.d(-var4 + var5, 0, 0);
            var6 = (vd) (Object) ((lp) this).field_l.a((byte) -71);
        }
        if (param0 != 13280) {
            field_A = null;
        } else {
            ((lp) this).field_x = param1;
            return;
        }
        ((lp) this).field_x = param1;
    }

    public static void f(int param0) {
        field_v = null;
        field_A = null;
        field_w = null;
        field_u = null;
        field_z = null;
        if (param0 != 1546006977) {
            field_v = null;
        }
    }

    lp(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        ((lp) this).field_y = 0;
        ((lp) this).field_x = 0;
    }

    final void a(vd param0, int param1) {
        super.a(param0, param1);
        if (param0 instanceof lp) {
            ((lp) this).field_y = ((lp) this).field_y + param0.field_i;
        }
    }

    final static void a(int param0, sq param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        lm[] var8 = null;
        int var9 = 0;
        int var11 = 0;
        Object var12 = null;
        Object var13 = null;
        lm[] var15 = null;
        lm var17 = null;
        lm[] var20 = null;
        lm var21 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (is.field_b) {
          return;
        } else {
          hm.field_q = param1;
          if (param1 == null) {
            tp.field_b = pc.field_q;
            jb.field_d = kp.field_j + jc.field_r >> 1546006977;
            fe.field_B = kp.field_j + jc.field_r >> 1546006977;
            oi.field_a = be.field_h;
            var13 = null;
            qj.a((sq) null, -1);
            return;
          } else {
            sj.a(-31560);
            var2 = param1.field_t;
            var3 = param1.field_b;
            var4 = param1.field_j;
            var5 = param1.field_q;
            if (param0 == 1546006977) {
              if (0 == (param1.field_q ^ -1)) {
                var6 = uq.field_m.a(5607, param1.field_c);
                var7 = wk.a(-9615, var6, (nq) (Object) rs.field_Cb, new int[1]);
                var5 = 34 + (rs.field_Cb.field_q - -(var7 * 13));
                eh.field_L = new bi[var7];
                if (param1.field_f != null) {
                  var20 = param1.field_f;
                  var9 = 0;
                  L0: while (true) {
                    if (var20.length > var9) {
                      var21 = var20[var9];
                      var6 = uq.field_m.a(5607, var21.field_b);
                      var7 = wk.a(-9615, var6, (nq) (Object) rs.field_Cb, new int[1]);
                      var5 = var5 + (13 * var7 - -rs.field_Cb.field_q);
                      var9++;
                      continue L0;
                    } else {
                      L1: {
                        if ((1 & param1.field_n) == 0) {
                          var2 = var2 + 3;
                          break L1;
                        } else {
                          var2 = 637 + -var2;
                          break L1;
                        }
                      }
                      L2: {
                        if ((param1.field_n & 2) != 0) {
                          var3 = 477 - var3;
                          break L2;
                        } else {
                          var3 = 55 - -var3;
                          break L2;
                        }
                      }
                      L3: {
                        if ((2 & param1.field_n) == 0) {
                          break L3;
                        } else {
                          var3 = var3 - var5;
                          break L3;
                        }
                      }
                      L4: {
                        if (-1 == (param1.field_n & 1 ^ -1)) {
                          break L4;
                        } else {
                          var2 = var2 - var4;
                          break L4;
                        }
                      }
                      L5: {
                        jb.field_d = var4 + var2;
                        tp.field_b = var3 + var5;
                        oi.field_a = var3;
                        fe.field_B = var2;
                        qj.a(param1, param0 ^ -1546006978);
                        if (0 != (param1.field_c.indexOf("<%tabresizehint>") ^ -1)) {
                          uq.field_m.a("", 27275, "tabresizehint");
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (ol.field_g == null) {
                        pc.field_q = tp.field_b;
                        be.field_h = oi.field_a;
                        kp.field_j = jb.field_d + fe.field_B >> -2127607903;
                        jc.field_r = jb.field_d + fe.field_B >> -2127607903;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  L6: {
                    if ((1 & param1.field_n) == 0) {
                      var2 = var2 + 3;
                      break L6;
                    } else {
                      var2 = 637 + -var2;
                      break L6;
                    }
                  }
                  L7: {
                    if ((param1.field_n & 2) != 0) {
                      var3 = 477 - var3;
                      break L7;
                    } else {
                      var3 = 55 - -var3;
                      break L7;
                    }
                  }
                  L8: {
                    if ((2 & param1.field_n) == 0) {
                      break L8;
                    } else {
                      var3 = var3 - var5;
                      break L8;
                    }
                  }
                  L9: {
                    if (-1 == (param1.field_n & 1 ^ -1)) {
                      break L9;
                    } else {
                      var2 = var2 - var4;
                      break L9;
                    }
                  }
                  L10: {
                    jb.field_d = var4 + var2;
                    tp.field_b = var3 + var5;
                    oi.field_a = var3;
                    fe.field_B = var2;
                    qj.a(param1, param0 ^ -1546006978);
                    if (0 != (param1.field_c.indexOf("<%tabresizehint>") ^ -1)) {
                      uq.field_m.a("", 27275, "tabresizehint");
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (ol.field_g == null) {
                    pc.field_q = tp.field_b;
                    be.field_h = oi.field_a;
                    kp.field_j = jb.field_d + fe.field_B >> -2127607903;
                    jc.field_r = jb.field_d + fe.field_B >> -2127607903;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L11: {
                  if ((1 & param1.field_n) == 0) {
                    var2 = var2 + 3;
                    break L11;
                  } else {
                    var2 = 637 + -var2;
                    break L11;
                  }
                }
                L12: {
                  if ((param1.field_n & 2) != 0) {
                    var3 = 477 - var3;
                    break L12;
                  } else {
                    var3 = 55 - -var3;
                    break L12;
                  }
                }
                L13: {
                  if ((2 & param1.field_n) == 0) {
                    break L13;
                  } else {
                    var3 = var3 - var5;
                    break L13;
                  }
                }
                L14: {
                  if (-1 == (param1.field_n & 1 ^ -1)) {
                    break L14;
                  } else {
                    var2 = var2 - var4;
                    break L14;
                  }
                }
                L15: {
                  jb.field_d = var4 + var2;
                  tp.field_b = var3 + var5;
                  oi.field_a = var3;
                  fe.field_B = var2;
                  qj.a(param1, param0 ^ -1546006978);
                  if (0 != (param1.field_c.indexOf("<%tabresizehint>") ^ -1)) {
                    uq.field_m.a("", 27275, "tabresizehint");
                    break L15;
                  } else {
                    break L15;
                  }
                }
                if (ol.field_g == null) {
                  pc.field_q = tp.field_b;
                  be.field_h = oi.field_a;
                  kp.field_j = jb.field_d + fe.field_B >> -2127607903;
                  jc.field_r = jb.field_d + fe.field_B >> -2127607903;
                  return;
                } else {
                  return;
                }
              }
            } else {
              var12 = null;
              lp.a((mg) null, (byte) -74, (ob) null);
              if (0 == (param1.field_q ^ -1)) {
                var6 = uq.field_m.a(5607, param1.field_c);
                var7 = wk.a(-9615, var6, (nq) (Object) rs.field_Cb, new int[1]);
                var5 = 34 + (rs.field_Cb.field_q - -(var7 * 13));
                eh.field_L = new bi[var7];
                if (param1.field_f != null) {
                  var15 = param1.field_f;
                  var8 = var15;
                  var9 = 0;
                  L16: while (true) {
                    if (var15.length > var9) {
                      var17 = var15[var9];
                      var6 = uq.field_m.a(5607, var17.field_b);
                      var7 = wk.a(-9615, var6, (nq) (Object) rs.field_Cb, new int[1]);
                      var5 = var5 + (13 * var7 - -rs.field_Cb.field_q);
                      var9++;
                      continue L16;
                    } else {
                      L17: {
                        if ((1 & param1.field_n) == 0) {
                          var2 = var2 + 3;
                          break L17;
                        } else {
                          var2 = 637 + -var2;
                          break L17;
                        }
                      }
                      L18: {
                        if ((param1.field_n & 2) != 0) {
                          var3 = 477 - var3;
                          break L18;
                        } else {
                          var3 = 55 - -var3;
                          break L18;
                        }
                      }
                      L19: {
                        if ((2 & param1.field_n) == 0) {
                          break L19;
                        } else {
                          var3 = var3 - var5;
                          break L19;
                        }
                      }
                      L20: {
                        if (-1 == (param1.field_n & 1 ^ -1)) {
                          break L20;
                        } else {
                          var2 = var2 - var4;
                          break L20;
                        }
                      }
                      L21: {
                        jb.field_d = var4 + var2;
                        tp.field_b = var3 + var5;
                        oi.field_a = var3;
                        fe.field_B = var2;
                        qj.a(param1, param0 ^ -1546006978);
                        if (0 != (param1.field_c.indexOf("<%tabresizehint>") ^ -1)) {
                          uq.field_m.a("", 27275, "tabresizehint");
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (ol.field_g != null) {
                          break L22;
                        } else {
                          pc.field_q = tp.field_b;
                          be.field_h = oi.field_a;
                          kp.field_j = jb.field_d + fe.field_B >> -2127607903;
                          jc.field_r = jb.field_d + fe.field_B >> -2127607903;
                          break L22;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L23: {
                    if ((1 & param1.field_n) == 0) {
                      var2 = var2 + 3;
                      break L23;
                    } else {
                      var2 = 637 + -var2;
                      break L23;
                    }
                  }
                  L24: {
                    if ((param1.field_n & 2) != 0) {
                      var3 = 477 - var3;
                      break L24;
                    } else {
                      var3 = 55 - -var3;
                      break L24;
                    }
                  }
                  L25: {
                    if ((2 & param1.field_n) == 0) {
                      break L25;
                    } else {
                      var3 = var3 - var5;
                      break L25;
                    }
                  }
                  L26: {
                    if (-1 == (param1.field_n & 1 ^ -1)) {
                      break L26;
                    } else {
                      var2 = var2 - var4;
                      break L26;
                    }
                  }
                  L27: {
                    jb.field_d = var4 + var2;
                    tp.field_b = var3 + var5;
                    oi.field_a = var3;
                    fe.field_B = var2;
                    qj.a(param1, param0 ^ -1546006978);
                    if (0 != (param1.field_c.indexOf("<%tabresizehint>") ^ -1)) {
                      uq.field_m.a("", 27275, "tabresizehint");
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (ol.field_g == null) {
                    pc.field_q = tp.field_b;
                    be.field_h = oi.field_a;
                    kp.field_j = jb.field_d + fe.field_B >> -2127607903;
                    jc.field_r = jb.field_d + fe.field_B >> -2127607903;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L28: {
                  if ((1 & param1.field_n) == 0) {
                    var2 = var2 + 3;
                    break L28;
                  } else {
                    var2 = 637 + -var2;
                    break L28;
                  }
                }
                L29: {
                  if ((param1.field_n & 2) != 0) {
                    var3 = 477 - var3;
                    break L29;
                  } else {
                    var3 = 55 - -var3;
                    break L29;
                  }
                }
                L30: {
                  if ((2 & param1.field_n) == 0) {
                    break L30;
                  } else {
                    var3 = var3 - var5;
                    break L30;
                  }
                }
                L31: {
                  if (-1 == (param1.field_n & 1 ^ -1)) {
                    break L31;
                  } else {
                    var2 = var2 - var4;
                    break L31;
                  }
                }
                L32: {
                  jb.field_d = var4 + var2;
                  tp.field_b = var3 + var5;
                  oi.field_a = var3;
                  fe.field_B = var2;
                  qj.a(param1, param0 ^ -1546006978);
                  if (0 != (param1.field_c.indexOf("<%tabresizehint>") ^ -1)) {
                    uq.field_m.a("", 27275, "tabresizehint");
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (ol.field_g != null) {
                    break L33;
                  } else {
                    pc.field_q = tp.field_b;
                    be.field_h = oi.field_a;
                    kp.field_j = jb.field_d + fe.field_B >> -2127607903;
                    jc.field_r = jb.field_d + fe.field_B >> -2127607903;
                    break L33;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final static void a(mg param0, byte param1, ob param2) {
        di.a(param0.field_y, false, param2);
        di.a(param0.field_B, false, param2);
        param2.d(param0.field_z, 255);
        if (param1 > -67) {
            field_A = null;
        }
    }

    final vd b(byte param0, int param1, int param2) {
        vd var4 = null;
        if (param0 > 51) {
          if (((lp) this).field_s) {
            if (((lp) this).c(param1, param2, 0)) {
              var4 = as.a(((lp) this).field_l, param1, (byte) 117, param2);
              if (var4 != null) {
                return var4;
              } else {
                return super.b((byte) 127, param1, param2);
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_u = null;
          if (((lp) this).field_s) {
            if (((lp) this).c(param1, param2, 0)) {
              var4 = as.a(((lp) this).field_l, param1, (byte) 117, param2);
              if (var4 != null) {
                return var4;
              } else {
                return super.b((byte) 127, param1, param2);
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 64 / ((param0 - 67) / 47);
        if (!(((lp) this).field_s)) {
            return;
        }
        int[] var3 = new int[4];
        gf.a(var3);
        gf.i(((lp) this).field_k, ((lp) this).field_t, ((lp) this).field_m + ((lp) this).field_k, ((lp) this).field_t + ((lp) this).field_i);
        vd var4 = (vd) (Object) ((lp) this).field_l.f(3725);
        while (var4 != null) {
            var4.a(116);
            var4 = (vd) (Object) ((lp) this).field_l.b(-124);
        }
        gf.b(var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_u = "Start Game";
        field_A = "You have been defeated";
    }
}
