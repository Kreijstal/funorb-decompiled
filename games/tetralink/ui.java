/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ui {
    static int field_g;
    static hl field_e;
    static Boolean field_b;
    static je field_d;
    static ok field_f;
    static long[] field_c;
    static String[] field_a;

    final static boolean a(byte param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = TetraLink.field_J;
        var1 = k.a(0);
        var3 = var1 - pm.field_g;
        if ((var3 ^ -1L) >= -30001L) {
          L0: {
            var5 = 3000;
            if (7 <= ib.field_b) {
              var5 = 12000;
              break L0;
            } else {
              if (ib.field_b < 5) {
                if ((ib.field_b ^ -1) <= -4) {
                  var5 = 6000;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var5 = 9000;
                break L0;
              }
            }
          }
          if (((long)var5 ^ -1L) <= (var3 ^ -1L)) {
            if (param0 < -24) {
              return false;
            } else {
              return true;
            }
          } else {
            pm.field_g = var1;
            ib.field_b = ib.field_b + 1;
            return true;
          }
        } else {
          ib.field_b = 0;
          pm.field_g = var1;
          return true;
        }
    }

    final static void a(ob param0, int param1, int param2, ob param3, int param4, int param5, int param6, ob param7, int param8, int param9) {
        ob var10 = null;
        int var10_int = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        tc.field_w = param3.field_M;
        om.field_Yb = param0.field_j;
        nn.field_S = param3.field_V;
        wk.field_b = param3.field_p;
        fj.field_p = param0.field_M;
        hd.field_D = param0.field_A;
        gk.field_c = param0.field_Y;
        nh.field_Mb = param0.field_k;
        cm.field_q = param0.field_gb;
        ve.field_a = param0.field_kb;
        ch.field_s = param3.field_Y;
        ic.field_c = param3.field_t;
        ga.field_b = param0.field_hb;
        gb.field_r = param3.field_I;
        am.field_b = param0.field_t;
        kj.field_d = param0.field_p;
        db.field_f = param3.field_A;
        bg.field_f = param3.field_k;
        gd.field_Zb = param0.field_V;
        li.field_m = param0.field_I;
        ja.field_l = param3.field_kb;
        mc.field_m = param3.field_hb;
        rk.field_b = param3.field_j;
        bd.field_a = param3.field_gb;
        bn.a(param4, param2, param7.field_kb, param8, param9, param7.field_V, (kc) null, param7.field_ob, param7.field_M, param5, param7.field_E, param7.field_gb, param7.field_t, 118, param1, param7.field_Y, param7.field_I, param7.field_j, param7.field_hb, param7.field_k, param7.field_p, param7.field_ib, (byte[]) null, param7.field_A);
        param3.field_V = nn.field_S;
        param3.field_ib = k.field_e;
        param3.field_j = rk.field_b;
        param3.field_A = db.field_f;
        param3.field_I = gb.field_r;
        param3.field_k = bg.field_f;
        param3.field_kb = ja.field_l;
        param3.field_nb = ea.field_e;
        param3.field_t = ic.field_c;
        param3.field_gb = bd.field_a;
        param3.field_ob = fh.field_g;
        param3.field_M = tc.field_w;
        param3.field_Y = ch.field_s;
        param3.field_p = wk.field_b;
        param3.field_E = hb.field_d;
        param3.field_hb = mc.field_m;
        param0.field_A = hd.field_D;
        param0.field_kb = ve.field_a;
        param0.field_Y = gk.field_c;
        param0.field_ib = mf.field_u;
        if (param6 == 100) {
          L0: {
            param0.field_I = li.field_m;
            param0.field_k = nh.field_Mb;
            param0.field_gb = cm.field_q;
            param0.field_ob = le.field_Xb;
            param0.field_t = am.field_b;
            param0.field_E = bm.field_p;
            param0.field_M = fj.field_p;
            param0.field_p = kj.field_d;
            param0.field_j = om.field_Yb;
            param0.field_hb = ga.field_b;
            param0.field_nb = d.field_b;
            param0.field_V = gd.field_Zb;
            if (null == param7.field_U) {
              param0.field_U = null;
              var10 = param3;
              var10.field_U = null;
              param0.field_K = param7.field_K;
              param3.field_K = param7.field_K;
              break L0;
            } else {
              L1: {
                L2: {
                  if (param3.field_U == null) {
                    break L2;
                  } else {
                    if (param3.field_ob > param3.field_U.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param3.field_U = new byte[100 + param3.field_ob];
                break L1;
              }
              L3: {
                L4: {
                  if (null == param0.field_U) {
                    break L4;
                  } else {
                    if (param0.field_ob > param0.field_U.length) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                param0.field_U = new byte[param0.field_ob - -100];
                break L3;
              }
              var10_int = 0;
              L5: while (true) {
                if (param3.field_ob <= var10_int) {
                  var10_int = 0;
                  L6: while (true) {
                    if (param0.field_ob <= var10_int) {
                      break L0;
                    } else {
                      param0.field_U[var10_int] = param7.field_U[gm.field_b[var10_int]];
                      var10_int++;
                      continue L6;
                    }
                  }
                } else {
                  param3.field_U[var10_int] = param7.field_U[rl.field_c[var10_int]];
                  var10_int++;
                  continue L5;
                }
              }
            }
          }
          L7: {
            if (param7.field_eb == null) {
              var10 = param3;
              param0.field_eb = null;
              var10.field_eb = null;
              break L7;
            } else {
              L8: {
                L9: {
                  if (param3.field_eb == null) {
                    break L9;
                  } else {
                    if (param3.field_ob > param3.field_eb.length) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                param3.field_eb = new byte[100 + param3.field_ob];
                break L8;
              }
              L10: {
                L11: {
                  if (null == param0.field_eb) {
                    break L11;
                  } else {
                    if (param0.field_ob > param0.field_eb.length) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                param0.field_eb = new byte[100 + param0.field_ob];
                break L10;
              }
              var10_int = 0;
              L12: while (true) {
                if (var10_int >= param3.field_ob) {
                  var10_int = 0;
                  L13: while (true) {
                    if (param0.field_ob <= var10_int) {
                      break L7;
                    } else {
                      param0.field_eb[var10_int] = param7.field_eb[gm.field_b[var10_int]];
                      var10_int++;
                      continue L13;
                    }
                  }
                } else {
                  param3.field_eb[var10_int] = param7.field_eb[rl.field_c[var10_int]];
                  var10_int++;
                  continue L12;
                }
              }
            }
          }
          L14: {
            if (null == param7.field_u) {
              param0.field_u = null;
              var10 = param3;
              var10.field_u = null;
              break L14;
            } else {
              L15: {
                L16: {
                  if (param3.field_u == null) {
                    break L16;
                  } else {
                    if (param3.field_ob > param3.field_u.length) {
                      break L16;
                    } else {
                      break L15;
                    }
                  }
                }
                param3.field_u = new byte[100 + param3.field_ob];
                break L15;
              }
              L17: {
                L18: {
                  if (param0.field_u == null) {
                    break L18;
                  } else {
                    if (param0.field_u.length >= param0.field_ob) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                param0.field_u = new byte[100 + param0.field_ob];
                break L17;
              }
              var10_int = 0;
              L19: while (true) {
                if (var10_int >= param3.field_ob) {
                  var10_int = 0;
                  L20: while (true) {
                    if (param0.field_ob <= var10_int) {
                      break L14;
                    } else {
                      param0.field_u[var10_int] = param7.field_u[gm.field_b[var10_int]];
                      var10_int++;
                      continue L20;
                    }
                  }
                } else {
                  param3.field_u[var10_int] = param7.field_u[rl.field_c[var10_int]];
                  var10_int++;
                  continue L19;
                }
              }
            }
          }
          L21: {
            if (param7.field_r != null) {
              L22: {
                L23: {
                  if (null == param3.field_r) {
                    break L23;
                  } else {
                    if (param3.field_r.length < param3.field_ob) {
                      break L23;
                    } else {
                      break L22;
                    }
                  }
                }
                param3.field_r = new short[100 + param3.field_ob];
                break L22;
              }
              L24: {
                L25: {
                  if (param0.field_r == null) {
                    break L25;
                  } else {
                    if (param0.field_r.length < param0.field_ob) {
                      break L25;
                    } else {
                      break L24;
                    }
                  }
                }
                param0.field_r = new short[100 + param0.field_ob];
                break L24;
              }
              var10_int = 0;
              L26: while (true) {
                if (param3.field_ob <= var10_int) {
                  var10_int = 0;
                  L27: while (true) {
                    if (param0.field_ob <= var10_int) {
                      break L21;
                    } else {
                      param0.field_r[var10_int] = param7.field_r[gm.field_b[var10_int]];
                      var10_int++;
                      continue L27;
                    }
                  }
                } else {
                  param3.field_r[var10_int] = param7.field_r[rl.field_c[var10_int]];
                  var10_int++;
                  continue L26;
                }
              }
            } else {
              param0.field_r = null;
              var10 = param3;
              var10.field_r = null;
              break L21;
            }
          }
          L28: {
            if (null == param7.field_J) {
              var10 = param3;
              param0.field_J = null;
              var10.field_J = null;
              break L28;
            } else {
              L29: {
                L30: {
                  if (null == param3.field_J) {
                    break L30;
                  } else {
                    if (param3.field_J.length < param3.field_ob) {
                      break L30;
                    } else {
                      break L29;
                    }
                  }
                }
                param3.field_J = new short[param3.field_ob - -100];
                break L29;
              }
              L31: {
                L32: {
                  if (null == param0.field_J) {
                    break L32;
                  } else {
                    if (param0.field_J.length >= param0.field_ob) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                param0.field_J = new short[param0.field_ob - -100];
                break L31;
              }
              var10_int = 0;
              L33: while (true) {
                if (var10_int >= param3.field_ob) {
                  var10_int = 0;
                  L34: while (true) {
                    if (param0.field_ob <= var10_int) {
                      break L28;
                    } else {
                      param0.field_J[var10_int] = param7.field_J[gm.field_b[var10_int]];
                      var10_int++;
                      continue L34;
                    }
                  }
                } else {
                  param3.field_J[var10_int] = param7.field_J[rl.field_c[var10_int]];
                  var10_int++;
                  continue L33;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 12000) {
            return;
        }
        field_e = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        if (param1 != 1692) {
            return 27;
        }
        return l.a(rb.field_Mb, (byte) 118, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ok();
        field_c = new long[32];
        field_a = new String[]{"Link Newcomer", "Link Challenger", "Victory on the Grid", "Attunement to the Grid", "Mastery of the Grid", "Link Duality", "PentaLink", "Ghosts in the Machine"};
    }
}
