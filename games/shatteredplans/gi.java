/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_a;
    static String field_b;

    final static boolean a(String param0, int param1, String param2) {
        if (!(!hb.a(param0, -31654))) {
            return false;
        }
        if (!(!pf.a(param0, (byte) 24))) {
            return false;
        }
        if (!(!cg.a(-92, param0))) {
            return false;
        }
        if (!(-1 != (param2.length() ^ -1))) {
            return true;
        }
        if (!(!va.a(param2, param1 + 12075, param0))) {
            return false;
        }
        if (param1 != -12076) {
            return true;
        }
        if (ms.a(param0, (byte) -53, param2)) {
            return false;
        }
        if (!na.a(param0, 127, param2)) {
            return true;
        }
        return false;
    }

    final static void a(boolean param0) {
        lm[] var1_ref_lm__ = null;
        int var1 = 0;
        int var2_int = 0;
        sq var2 = null;
        sq var2_ref = null;
        sq var3 = null;
        int var4 = 0;
        lm[] var5 = null;
        int var6 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          if (hm.field_q == ol.field_g) {
            if (null != ol.field_g) {
              te.field_c = te.field_c + 16;
              var5 = ol.field_g.field_f;
              var1_ref_lm__ = var5;
              if (var1_ref_lm__ == null) {
                break L0;
              } else {
                var2_int = 0;
                L1: while (true) {
                  if (var5.length <= var2_int) {
                    break L0;
                  } else {
                    if (0 == rg.field_f[var2_int]) {
                      if (sp.a(var5[var2_int].field_c, (byte) -125)) {
                        rg.field_f[var2_int] = 1;
                        boolean discarded$1 = vn.a(0);
                        var2_int++;
                        continue L1;
                      } else {
                        var2_int++;
                        continue L1;
                      }
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          } else {
            ej.field_m = ej.field_m + 1;
            if (-33 >= (ej.field_m + 1 ^ -1)) {
              js.a((byte) -10);
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (!param0) {
          L2: {
            if (sr.a(0, "unplaced")) {
              if (qc.a("unplaced", -126)) {
                ac.a(1, n.a("unplaced", -21502));
                break L2;
              } else {
                break L2;
              }
            } else {
              if (sr.a(0, "losegame")) {
                ac.a(1, n.a("lose", -21502));
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            aj.field_a.a(0);
            if (ol.field_g == hm.field_q) {
              ei.field_e = kp.field_j;
              e.field_f = jc.field_r;
              fk.field_k = be.field_h;
              kl.field_o = pc.field_q;
              break L3;
            } else {
              e.field_f = re.a(jc.field_r, 32, ej.field_m, fe.field_B, 0);
              fk.field_k = re.a(be.field_h, 32, ej.field_m, oi.field_a, 0);
              ei.field_e = re.a(kp.field_j, 32, ej.field_m, jb.field_d, 0);
              kl.field_o = re.a(pc.field_q, 32, ej.field_m, tp.field_b, 0);
              break L3;
            }
          }
          L4: {
            if (null == oi.field_i) {
              break L4;
            } else {
              var1 = 1;
              var6 = 0;
              var2_int = var6;
              L5: while (true) {
                if (var6 >= rg.field_f.length) {
                  if (var1 == 0) {
                    break L4;
                  } else {
                    L6: {
                      var2 = ol.field_g.field_l;
                      if (var2 != null) {
                        break L6;
                      } else {
                        if ((ge.field_i ^ -1) >= -1) {
                          break L6;
                        } else {
                          ge.field_i = ge.field_i - 1;
                          var2_ref = js.field_b[ge.field_i - 1];
                          break L6;
                        }
                      }
                    }
                    if (is.field_b) {
                      L7: {
                        is.field_b = false;
                        var3 = js.field_b[ge.field_i];
                        if (var3 == null) {
                          break L7;
                        } else {
                          if (var3 != ol.field_g) {
                            lp.a(1546006977, var3);
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      lp.a(1546006977, var2_ref);
                      break L4;
                    } else {
                      lp.a(1546006977, var2_ref);
                      break L4;
                    }
                  }
                } else {
                  L8: {
                    if (rg.field_f[var6] <= 0) {
                      break L8;
                    } else {
                      rg.field_f[var6] = rg.field_f[var6] + 1;
                      break L8;
                    }
                  }
                  if (rg.field_f[var6] < 48) {
                    var1 = 0;
                    var6++;
                    continue L5;
                  } else {
                    var6++;
                    continue L5;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, ms param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        qn.field_b[0] = na.field_u.nextInt();
        qn.field_b[1] = na.field_u.nextInt();
        eo.field_cb.field_j = 0;
        qn.field_b[3] = (int)w.field_I;
        qn.field_b[2] = (int)(w.field_I >> 743439264);
        eo.field_cb.e(11135, qn.field_b[0]);
        eo.field_cb.e(11135, qn.field_b[1]);
        eo.field_cb.e(11135, qn.field_b[2]);
        eo.field_cb.e(11135, qn.field_b[3]);
        jo.a(24, eo.field_cb);
        if (param3 <= -36) {
          L0: {
            eo.field_cb.d(param0, 255);
            param4.a(eo.field_cb, (byte) 118);
            js.field_f.field_j = 0;
            if (param1) {
              js.field_f.c(18, (byte) -106);
              break L0;
            } else {
              js.field_f.c(16, (byte) -89);
              break L0;
            }
          }
          L1: {
            js.field_f.field_j = js.field_f.field_j + 2;
            var5 = js.field_f.field_j;
            js.field_f.e(11135, e.field_b);
            js.field_f.b(-16426, be.field_l);
            var6 = 0;
            if (!db.field_b) {
              break L1;
            } else {
              var6 = var6 | 1;
              break L1;
            }
          }
          L2: {
            if (!ka.field_a) {
              break L2;
            } else {
              var6 = var6 | 4;
              break L2;
            }
          }
          L3: {
            if (param2) {
              var6 = var6 | 8;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (fr.field_H != null) {
              var6 = var6 | 16;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            js.field_f.c(var6, (byte) -93);
            var7 = ck.a((byte) 70, kq.f((byte) 125));
            if (var7 != null) {
              break L5;
            } else {
              var7 = "";
              break L5;
            }
          }
          L6: {
            js.field_f.a(var7, (byte) 0);
            if (fr.field_H == null) {
              break L6;
            } else {
              js.field_f.a((byte) 95, fr.field_H);
              break L6;
            }
          }
          co.a(25050, (ob) (Object) js.field_f, hr.field_a, eo.field_cb, jl.field_V);
          js.field_f.f(-549342136, js.field_f.field_j + -var5);
          d.a(-1, (byte) 82);
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 32) {
            Object var2 = null;
            boolean discarded$0 = gi.a((String) null, -107, (String) null);
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Select destination system in the same territory or connected by hyperspace link.";
    }
}
