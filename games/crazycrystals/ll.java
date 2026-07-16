/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ll {
    static String field_a;

    final static boolean a(ce param0, int param1, ce param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = CrazyCrystals.field_B;
          if (param1 == 0) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = ll.a((ce) null, -78, (ce) null);
            break L0;
          }
        }
        L1: {
          var3 = -param2.field_db + param0.field_db;
          if (nh.field_z != param0.field_cb) {
            if (null == param0.field_cb) {
              var3 += 200;
              break L1;
            } else {
              break L1;
            }
          } else {
            var3 -= 200;
            break L1;
          }
        }
        if (nh.field_z != param2.field_cb) {
          if (null == param2.field_cb) {
            L2: {
              var3 -= 200;
              if ((var3 ^ -1) >= -1) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            return stackIn_20_0 != 0;
          } else {
            L3: {
              if ((var3 ^ -1) >= -1) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L3;
              }
            }
            return stackIn_16_0 != 0;
          }
        } else {
          L4: {
            var3 += 200;
            if ((var3 ^ -1) >= -1) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          return stackIn_11_0 != 0;
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        f[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kb var10 = null;
        kb var11 = null;
        kb var12 = null;
        f[][] var13 = null;
        kb var14 = null;
        f[][] var15 = null;
        Object var16 = null;
        kb var16_ref = null;
        f[][] var17 = null;
        f[][] var18 = null;
        var16 = null;
        var9 = CrazyCrystals.field_B;
        df.field_c = wd.field_j;
        no.field_k = ob.field_l;
        if (param0 < -80) {
          bh.field_c = fn.field_j;
          vk.field_I = mb.field_g;
          if (param2) {
            li.field_a = null;
            var14 = (kb) rc.field_a.elementAt(uo.field_o);
            var10 = var14;
            qg.field_q = 0;
            va.field_d = 0;
            jm.field_b = 0;
            var15 = var14.field_b;
            var4 = var15;
            oe.field_a = new fq[3];
            ol.field_B = 0;
            rl.field_h = 0;
            qh.field_o = new Vector();
            tm.field_e = 0;
            km.field_d = 0;
            var5 = 0;
            L0: while (true) {
              if (-4 >= (var5 ^ -1)) {
                var5 = -3 + var15[0].length;
                var6 = -3 + var15.length;
                var7 = (var6 - 2) / 2 + 4;
                w.field_f = var7;
                var8 = 4 + (var5 + -2) / 2;
                ia.field_i = var8;
                pm.field_d = 0;
                to.field_c = 0;
                gl.field_e = 0;
                gm.field_c = new int[2];
                tm.field_d = md.a(var8, false, var7, -93, var15);
                no.a(var8, -8383, var7, tm.field_d);
                if (null != rn.field_q) {
                  if (rn.field_q.equals((Object) (Object) hf.field_b[var14.field_d])) {
                    en.field_O = 0;
                    kd.field_l = nj.a(45, var8, var7);
                    if (!param1) {
                      cn.field_d = null;
                      td.field_c = null;
                      bq.field_i = ce.b((byte) -126);
                      if (bq.field_i == null) {
                        bq.field_i = kd.field_l;
                        md.field_k[2] = 0;
                        md.field_k[1] = 0;
                        qp.field_f = false;
                        mo.field_f = 0;
                        va.field_c = 0;
                        md.field_k[0] = 32;
                        return;
                      } else {
                        md.field_k[2] = 0;
                        md.field_k[1] = 0;
                        qp.field_f = false;
                        mo.field_f = 0;
                        va.field_c = 0;
                        md.field_k[0] = 32;
                        return;
                      }
                    } else {
                      cn.field_d = kd.field_l;
                      bq.field_i = kd.field_l;
                      td.field_c = ce.b((byte) -125);
                      if (null != td.field_c) {
                        ca.field_j = -60;
                        mi.i(22075);
                        md.field_k[2] = 0;
                        md.field_k[1] = 0;
                        qp.field_f = false;
                        mo.field_f = 0;
                        va.field_c = 0;
                        md.field_k[0] = 32;
                        return;
                      } else {
                        td.field_c = bq.field_i;
                        ca.field_j = -60;
                        mi.i(22075);
                        md.field_k[2] = 0;
                        md.field_k[1] = 0;
                        qp.field_f = false;
                        mo.field_f = 0;
                        va.field_c = 0;
                        md.field_k[0] = 32;
                        return;
                      }
                    }
                  } else {
                    L1: {
                      um.a(kk.field_j[var14.field_d], hf.field_b[var14.field_d], (byte) 80);
                      en.field_O = 0;
                      kd.field_l = nj.a(45, var8, var7);
                      if (!param1) {
                        cn.field_d = null;
                        td.field_c = null;
                        bq.field_i = ce.b((byte) -126);
                        if (bq.field_i != null) {
                          break L1;
                        } else {
                          bq.field_i = kd.field_l;
                          break L1;
                        }
                      } else {
                        cn.field_d = kd.field_l;
                        bq.field_i = kd.field_l;
                        td.field_c = ce.b((byte) -125);
                        if (null != td.field_c) {
                          ca.field_j = -60;
                          mi.i(22075);
                          break L1;
                        } else {
                          td.field_c = bq.field_i;
                          ca.field_j = -60;
                          mi.i(22075);
                          break L1;
                        }
                      }
                    }
                    md.field_k[2] = 0;
                    md.field_k[1] = 0;
                    qp.field_f = false;
                    mo.field_f = 0;
                    va.field_c = 0;
                    md.field_k[0] = 32;
                    return;
                  }
                } else {
                  L2: {
                    um.a(kk.field_j[var14.field_d], hf.field_b[var14.field_d], (byte) 80);
                    en.field_O = 0;
                    kd.field_l = nj.a(45, var8, var7);
                    if (!param1) {
                      cn.field_d = null;
                      td.field_c = null;
                      bq.field_i = ce.b((byte) -126);
                      if (bq.field_i != null) {
                        break L2;
                      } else {
                        bq.field_i = kd.field_l;
                        break L2;
                      }
                    } else {
                      cn.field_d = kd.field_l;
                      bq.field_i = kd.field_l;
                      td.field_c = ce.b((byte) -125);
                      if (null != td.field_c) {
                        ca.field_j = -60;
                        mi.i(22075);
                        break L2;
                      } else {
                        td.field_c = bq.field_i;
                        ca.field_j = -60;
                        mi.i(22075);
                        break L2;
                      }
                    }
                  }
                  md.field_k[2] = 0;
                  md.field_k[1] = 0;
                  qp.field_f = false;
                  mo.field_f = 0;
                  va.field_c = 0;
                  md.field_k[0] = 32;
                  return;
                }
              } else {
                q.field_a[var5].a((byte) 118);
                var5++;
                continue L0;
              }
            }
          } else {
            if (null == li.field_a) {
              var11 = (kb) rc.field_a.elementAt(uo.field_o);
              qg.field_q = 0;
              va.field_d = 0;
              jm.field_b = 0;
              var18 = var11.field_b;
              oe.field_a = new fq[3];
              ol.field_B = 0;
              rl.field_h = 0;
              qh.field_o = new Vector();
              tm.field_e = 0;
              km.field_d = 0;
              var5 = 0;
              L3: while (true) {
                if (-4 >= (var5 ^ -1)) {
                  L4: {
                    L5: {
                      var5 = -3 + var18[0].length;
                      var6 = -3 + var18.length;
                      var7 = (var6 - 2) / 2 + 4;
                      w.field_f = var7;
                      var8 = 4 + (var5 + -2) / 2;
                      ia.field_i = var8;
                      pm.field_d = 0;
                      to.field_c = 0;
                      gl.field_e = 0;
                      gm.field_c = new int[2];
                      tm.field_d = md.a(var8, false, var7, -93, var18);
                      no.a(var8, -8383, var7, tm.field_d);
                      if (null == rn.field_q) {
                        break L5;
                      } else {
                        if (!rn.field_q.equals((Object) (Object) hf.field_b[var11.field_d])) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    um.a(kk.field_j[var11.field_d], hf.field_b[var11.field_d], (byte) 80);
                    break L4;
                  }
                  en.field_O = 0;
                  kd.field_l = nj.a(45, var8, var7);
                  if (!param1) {
                    cn.field_d = null;
                    td.field_c = null;
                    bq.field_i = ce.b((byte) -126);
                    if (bq.field_i != null) {
                      md.field_k[2] = 0;
                      md.field_k[1] = 0;
                      qp.field_f = false;
                      mo.field_f = 0;
                      va.field_c = 0;
                      md.field_k[0] = 32;
                      return;
                    } else {
                      bq.field_i = kd.field_l;
                      md.field_k[2] = 0;
                      md.field_k[1] = 0;
                      qp.field_f = false;
                      mo.field_f = 0;
                      va.field_c = 0;
                      md.field_k[0] = 32;
                      return;
                    }
                  } else {
                    cn.field_d = kd.field_l;
                    bq.field_i = kd.field_l;
                    td.field_c = ce.b((byte) -125);
                    if (null != td.field_c) {
                      ca.field_j = -60;
                      mi.i(22075);
                      md.field_k[2] = 0;
                      md.field_k[1] = 0;
                      qp.field_f = false;
                      mo.field_f = 0;
                      va.field_c = 0;
                      md.field_k[0] = 32;
                      return;
                    } else {
                      td.field_c = bq.field_i;
                      ca.field_j = -60;
                      mi.i(22075);
                      md.field_k[2] = 0;
                      md.field_k[1] = 0;
                      qp.field_f = false;
                      mo.field_f = 0;
                      va.field_c = 0;
                      md.field_k[0] = 32;
                      return;
                    }
                  }
                } else {
                  q.field_a[var5].a((byte) 118);
                  var5++;
                  continue L3;
                }
              }
            } else {
              if (li.field_a.field_l != null) {
                var12 = (kb) rc.field_a.elementAt(uo.field_o);
                qg.field_q = 0;
                va.field_d = 0;
                jm.field_b = 0;
                var13 = var12.field_b;
                oe.field_a = new fq[3];
                ol.field_B = 0;
                rl.field_h = 0;
                qh.field_o = new Vector();
                tm.field_e = 0;
                km.field_d = 0;
                var5 = 0;
                L6: while (true) {
                  if (-4 >= (var5 ^ -1)) {
                    L7: {
                      var5 = -3 + var13[0].length;
                      var6 = -3 + var13.length;
                      var7 = (var6 - 2) / 2 + 4;
                      w.field_f = var7;
                      var8 = 4 + (var5 + -2) / 2;
                      ia.field_i = var8;
                      pm.field_d = 0;
                      to.field_c = 0;
                      gl.field_e = 0;
                      gm.field_c = new int[2];
                      tm.field_d = md.a(var8, false, var7, -93, var13);
                      no.a(var8, -8383, var7, tm.field_d);
                      if (null == rn.field_q) {
                        um.a(kk.field_j[var12.field_d], hf.field_b[var12.field_d], (byte) 80);
                        break L7;
                      } else {
                        if (!rn.field_q.equals((Object) (Object) hf.field_b[var12.field_d])) {
                          um.a(kk.field_j[var12.field_d], hf.field_b[var12.field_d], (byte) 80);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      en.field_O = 0;
                      kd.field_l = nj.a(45, var8, var7);
                      if (!param1) {
                        cn.field_d = null;
                        td.field_c = null;
                        bq.field_i = ce.b((byte) -126);
                        if (bq.field_i != null) {
                          break L8;
                        } else {
                          bq.field_i = kd.field_l;
                          break L8;
                        }
                      } else {
                        cn.field_d = kd.field_l;
                        bq.field_i = kd.field_l;
                        td.field_c = ce.b((byte) -125);
                        if (null != td.field_c) {
                          ca.field_j = -60;
                          mi.i(22075);
                          break L8;
                        } else {
                          td.field_c = bq.field_i;
                          ca.field_j = -60;
                          mi.i(22075);
                          break L8;
                        }
                      }
                    }
                    md.field_k[2] = 0;
                    md.field_k[1] = 0;
                    qp.field_f = false;
                    mo.field_f = 0;
                    va.field_c = 0;
                    md.field_k[0] = 32;
                    return;
                  } else {
                    q.field_a[var5].a((byte) 118);
                    var5++;
                    continue L6;
                  }
                }
              } else {
                li.field_a = null;
                var16_ref = (kb) rc.field_a.elementAt(uo.field_o);
                var10 = var16_ref;
                qg.field_q = 0;
                va.field_d = 0;
                jm.field_b = 0;
                var17 = var16_ref.field_b;
                var4 = var17;
                oe.field_a = new fq[3];
                ol.field_B = 0;
                rl.field_h = 0;
                qh.field_o = new Vector();
                tm.field_e = 0;
                km.field_d = 0;
                var5 = 0;
                L9: while (true) {
                  if (-4 >= (var5 ^ -1)) {
                    L10: {
                      L11: {
                        var5 = -3 + var17[0].length;
                        var6 = -3 + var17.length;
                        var7 = (var6 - 2) / 2 + 4;
                        w.field_f = var7;
                        var8 = 4 + (var5 + -2) / 2;
                        ia.field_i = var8;
                        pm.field_d = 0;
                        to.field_c = 0;
                        gl.field_e = 0;
                        gm.field_c = new int[2];
                        tm.field_d = md.a(var8, false, var7, -93, var17);
                        no.a(var8, -8383, var7, tm.field_d);
                        if (null == rn.field_q) {
                          break L11;
                        } else {
                          if (!rn.field_q.equals((Object) (Object) hf.field_b[var16_ref.field_d])) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      um.a(kk.field_j[var16_ref.field_d], hf.field_b[var16_ref.field_d], (byte) 80);
                      break L10;
                    }
                    en.field_O = 0;
                    kd.field_l = nj.a(45, var8, var7);
                    if (!param1) {
                      cn.field_d = null;
                      td.field_c = null;
                      bq.field_i = ce.b((byte) -126);
                      if (bq.field_i != null) {
                        md.field_k[2] = 0;
                        md.field_k[1] = 0;
                        qp.field_f = false;
                        mo.field_f = 0;
                        va.field_c = 0;
                        md.field_k[0] = 32;
                        return;
                      } else {
                        bq.field_i = kd.field_l;
                        md.field_k[2] = 0;
                        md.field_k[1] = 0;
                        qp.field_f = false;
                        mo.field_f = 0;
                        va.field_c = 0;
                        md.field_k[0] = 32;
                        return;
                      }
                    } else {
                      cn.field_d = kd.field_l;
                      bq.field_i = kd.field_l;
                      td.field_c = ce.b((byte) -125);
                      if (null != td.field_c) {
                        ca.field_j = -60;
                        mi.i(22075);
                        md.field_k[2] = 0;
                        md.field_k[1] = 0;
                        qp.field_f = false;
                        mo.field_f = 0;
                        va.field_c = 0;
                        md.field_k[0] = 32;
                        return;
                      } else {
                        td.field_c = bq.field_i;
                        ca.field_j = -60;
                        mi.i(22075);
                        md.field_k[2] = 0;
                        md.field_k[1] = 0;
                        qp.field_f = false;
                        mo.field_f = 0;
                        va.field_c = 0;
                        md.field_k[0] = 32;
                        return;
                      }
                    }
                  } else {
                    q.field_a[var5].a((byte) 118);
                    var5++;
                    continue L9;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 > -84) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Press F12 for access to all levels";
    }
}
