/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends de {
    static boolean field_o;

    final void c(byte param0) {
        if (param0 >= -13) {
            mi.e(-14);
        }
    }

    final void a(int param0) {
        ((mi) this).b((byte) -71);
        int var2 = -1 != (go.field_k ^ -1) ? 1 : 0;
        int var3 = null != wh.field_p ? 1 : 0;
        String var7 = bc.field_p;
        if (param0 != 11) {
            mi.b(false);
        }
        String var8 = var7 + " " + ub.a(sd.a(bf.a(param0 + -99, false, var3 != 0, var2 != 0), param0 ^ 50, new String[1]), param0 + -11, "<br><br>", '#');
        tc var5 = qj.field_e;
        int var6 = 1 + var5.field_z + var5.field_w;
        int discarded$0 = var5.a(var8, 50, 150, 540, 10 * var6, 16777215, 0, 1, 0, var6);
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        ph var3 = null;
        L0: {
          var2 = Pixelate.field_H ? 1 : 0;
          if (0 == ki.field_f) {
            L1: {
              if (0 != (ii.field_q ^ -1)) {
                ii.field_q = -1;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (ph) (Object) pl.field_Y.d(-28918);
            if (var3 == null) {
              break L0;
            } else {
              ii.field_q = var3.field_k;
              ki.field_f = 300;
              nn.field_a = qj.field_e.c(tn.field_n[ii.field_q]) + 56;
              gk.field_bb = 50 - -nn.field_a;
              break L0;
            }
          } else {
            ki.field_f = ki.field_f - 1;
            if (ki.field_f < 16) {
              var1 = 16 - ki.field_f;
              gk.field_bb = var1 * (var1 * (50 - -nn.field_a)) >> 1693966632;
              break L0;
            } else {
              if (284 < ki.field_f) {
                var1 = ki.field_f - 284;
                gk.field_bb = var1 * (nn.field_a + 50) * var1 >> 1770064488;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 < -121) {
            break L2;
          } else {
            hh[] discarded$1 = mi.a(71, 124, 48, -115);
            break L2;
          }
        }
    }

    final static hh[] a(int param0, int param1, int param2, int param3) {
        hh[] var4 = null;
        int var5 = 0;
        boolean[] var6 = null;
        hh[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hh[] var11 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        var11 = al.field_c[param2][param0];
        var4 = var11;
        if (var4 != null) {
          var5 = var11.length;
          var6 = new boolean[var5];
          var7 = new hh[param1];
          var8 = 0;
          L0: while (true) {
            if (var7.length <= var8) {
              L1: {
                if (param3 == 20) {
                  break L1;
                } else {
                  mi.b(true);
                  break L1;
                }
              }
              return var7;
            } else {
              var9 = ok.a(tg.field_f, param3 ^ -118, var5);
              L2: while (true) {
                if (!var6[var9]) {
                  var6[var9] = true;
                  var7[var8] = var11[var9];
                  var8++;
                  continue L0;
                } else {
                  var9++;
                  if (var5 <= var9) {
                    var9 = 0;
                    continue L2;
                  } else {
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static int d(int param0, int param1) {
        if (param0 != -4096) {
            int discarded$0 = mi.a(126, 19, (byte) -117);
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
            return param1 >= 6144 ? -k.field_i[-param1 + 8192] : -k.field_i[param1 + -4096];
        }
        return -2049 < (param1 ^ -1) ? k.field_i[param1] : k.field_i[-param1 + 4096];
    }

    mi(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static int a(boolean param0, byte param1, String param2, int param3, boolean param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref_String = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_37_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_36_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            L0: {
              var9 = Pixelate.field_H ? 1 : 0;
              if (null != sh.field_e) {
                break L0;
              } else {
                if (wb.a(0, param4)) {
                  break L0;
                } else {
                  return -1;
                }
              }
            }
            L1: {
              if (ij.field_o == uk.field_s) {
                L2: {
                  if (param4) {
                    var10 = null;
                    li.field_g = ck.a(param2, (String) null, false, vn.field_b, 83);
                    break L2;
                  } else {
                    li.field_g = k.a(param2, false, -61, param5);
                    break L2;
                  }
                }
                aa.field_f.field_m = 0;
                aa.field_f.e(160, 14);
                aa.field_f.e(160, li.field_g.b(-27096).field_a);
                vg.b(-1, 10000);
                uk.field_s = cn.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (uk.field_s == cn.field_a) {
                if (!rd.a(1, false)) {
                  break L3;
                } else {
                  var6 = vi.field_o.f(255);
                  vi.field_o.field_m = 0;
                  if (var6 != 0) {
                    mn.field_e = var6;
                    uk.field_s = sl.field_b;
                    jj.field_b = -1;
                    break L3;
                  } else {
                    uk.field_s = ke.field_b;
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (uk.field_s == ke.field_b) {
                if (rd.a(8, false)) {
                  gj.field_P = vi.field_o.a(false);
                  vi.field_o.field_m = 0;
                  io.a(param4, -67, li.field_g, param3, param0);
                  uk.field_s = kk.field_b;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (kk.field_b != uk.field_s) {
                break L5;
              } else {
                if (rd.a(1, false)) {
                  L6: {
                    var6 = vi.field_o.f(255);
                    sc.field_a = null;
                    vi.field_o.field_m = 0;
                    mn.field_e = var6;
                    if (0 == var6) {
                      break L6;
                    } else {
                      if (1 == var6) {
                        break L6;
                      } else {
                        if ((var6 ^ -1) == -9) {
                          na.a(true);
                          qj.field_b = false;
                          return var6;
                        } else {
                          uk.field_s = sl.field_b;
                          jj.field_b = -1;
                          break L5;
                        }
                      }
                    }
                  }
                  jj.field_b = -1;
                  uk.field_s = e.field_d;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (e.field_d == uk.field_s) {
                if (!in.e(-18481)) {
                  break L7;
                } else {
                  L8: {
                    vn.field_b = vi.field_o.a(false);
                    hq.field_t = param2;
                    wo.field_h = vi.field_o.f(255);
                    rj.field_I = vi.field_o.f(255);
                    uo.field_j = vi.field_o.a((byte) -116);
                    var6_ref_String = vi.field_o.e((byte) 79);
                    var7 = vi.field_o.f(255);
                    if (-1 == (var7 & 1 ^ -1)) {
                      break L8;
                    } else {
                      tm.d((byte) -51);
                      break L8;
                    }
                  }
                  L9: {
                    if (-1 == (16 & var7 ^ -1)) {
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      break L9;
                    } else {
                      stackOut_35_0 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      break L9;
                    }
                  }
                  L10: {
                    mg.field_l = stackIn_37_0 != 0;
                    if (param4) {
                      break L10;
                    } else {
                      L11: {
                        if (0 == (var7 & 2)) {
                          stackOut_40_0 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          break L11;
                        } else {
                          stackOut_39_0 = 1;
                          stackIn_41_0 = stackOut_39_0;
                          break L11;
                        }
                      }
                      L12: {
                        lh.field_g = stackIn_41_0 != 0;
                        if (-1 == (8 & var7 ^ -1)) {
                          stackOut_43_0 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          break L12;
                        } else {
                          stackOut_42_0 = 1;
                          stackIn_44_0 = stackOut_42_0;
                          break L12;
                        }
                      }
                      L13: {
                        ln.field_q = stackIn_44_0 != 0;
                        if (-1 == (4 & var7 ^ -1)) {
                          stackOut_46_0 = 0;
                          stackIn_47_0 = stackOut_46_0;
                          break L13;
                        } else {
                          stackOut_45_0 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          break L13;
                        }
                      }
                      wg.field_a = stackIn_47_0 != 0;
                      if (!ln.field_q) {
                        break L10;
                      } else {
                        lh.field_g = true;
                        break L10;
                      }
                    }
                  }
                  L14: {
                    if (vm.field_d) {
                      int discarded$5 = vi.field_o.f(255);
                      int discarded$6 = vi.field_o.f(255);
                      int discarded$7 = vi.field_o.k(0);
                      mo.field_k = vi.field_o.a((byte) -115);
                      dc.field_b = new byte[mo.field_k];
                      var8 = 0;
                      L15: while (true) {
                        if ((mo.field_k ^ -1) >= (var8 ^ -1)) {
                          break L14;
                        } else {
                          dc.field_b[var8] = vi.field_o.a(0);
                          var8++;
                          continue L15;
                        }
                      }
                    } else {
                      break L14;
                    }
                  }
                  L16: {
                    kn.field_J = vi.field_o.h(5);
                    var11 = (CharSequence) (Object) kn.field_J;
                    eq.field_Hb = dh.a(var11, (byte) 54);
                    ra.field_g = vi.field_o.f(255);
                    uk.field_s = Pixelate.field_G;
                    if (li.field_g.b(-27096) == l.field_r) {
                      ig.field_e.a(ao.a(13867), -80419032);
                      break L16;
                    } else {
                      if (li.field_g.b(-27096) != te.field_Nb) {
                        break L16;
                      } else {
                        vm.field_a.a(ao.a(13867), -80419032);
                        break L16;
                      }
                    }
                  }
                  L17: {
                    qj.field_b = false;
                    if (var6_ref_String != null) {
                      rd.a(var6_ref_String, 126, ao.a(13867));
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      if ((uo.field_j ^ -1) < -1) {
                        break L19;
                      } else {
                        if (!wg.field_a) {
                          try {
                            L20: {
                              Object discarded$8 = cq.a("unzap", (byte) -56, ao.a(13867));
                              break L20;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L21: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L21;
                            }
                          }
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    try {
                      L22: {
                        Object discarded$9 = cq.a(ao.a(13867), (byte) -37, new Object[1], "zap");
                        break L22;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L23: {
                        var8_ref_Throwable = decompiledCaughtException;
                        break L23;
                      }
                    }
                    break L18;
                  }
                  L24: {
                    if (-1 <= (uo.field_j ^ -1)) {
                      break L24;
                    } else {
                      uj.field_Lb = true;
                      break L24;
                    }
                  }
                  aa.field_f.a(0, ud.field_L);
                  var8 = 0;
                  L25: while (true) {
                    if (var8 >= 4) {
                      vi.field_o.a(0, ud.field_L);
                      return mn.field_e;
                    } else {
                      ud.field_L[var8] = ud.field_L[var8] + 50;
                      var8++;
                      continue L25;
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            L26: {
              if (sl.field_b != uk.field_s) {
                break L26;
              } else {
                if (in.e(-18481)) {
                  L27: {
                    na.a(true);
                    if ((mn.field_e ^ -1) != -8) {
                      break L27;
                    } else {
                      if (!qj.field_b) {
                        qj.field_b = true;
                        return -1;
                      } else {
                        break L27;
                      }
                    }
                  }
                  L28: {
                    if (-8 == (mn.field_e ^ -1)) {
                      mn.field_e = 3;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  gi.field_b = vi.field_o.h(5);
                  qj.field_b = false;
                  return mn.field_e;
                } else {
                  break L26;
                }
              }
            }
            L29: {
              var6 = 51 % ((-18 - param1) / 46);
              if (null == sh.field_e) {
                if (!qj.field_b) {
                  var7 = gd.field_g;
                  gd.field_g = cd.field_b;
                  cd.field_b = var7;
                  qj.field_b = true;
                  break L29;
                } else {
                  L30: {
                    if (-30001L <= (no.d(8) ^ -1L)) {
                      gi.field_b = ho.field_b;
                      break L30;
                    } else {
                      gi.field_b = vc.field_N;
                      break L30;
                    }
                  }
                  qj.field_b = false;
                  return 3;
                }
              } else {
                break L29;
              }
            }
            return -1;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, float param1, int param2, String param3) {
        if (cn.field_b == null) {
            cn.field_b = new ko(wa.field_c, wp.field_a);
            wa.field_c.b(-6183, (ng) (Object) cn.field_b);
        }
        if (param2 != -1) {
            field_o = false;
        }
        cn.field_b.a(param3, param1, 7595, param0);
        t.d();
        rj.a(94, true);
    }

    final static int a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Pixelate.field_H ? 1 : 0;
        int var3 = 0;
        int var4 = de.field_h;
        if (param2 > -72) {
            field_o = true;
        }
        while (var3 < vm.field_e.length) {
            var5 = fo.field_a[var3];
            if (var5 < 0) {
                var4 = var4 + hq.field_r;
            } else {
                var6 = sb.a(3, vm.field_e[var3], true);
                var4 = var4 + ko.field_fb;
                var7 = -(var6 >> -1407803871) + qe.field_u;
                if (mn.a(param0, var4, 9, gk.field_fb + (bd.field_c << 1296509121), var7 + -hc.field_J, param1, (hc.field_J << 840803105) + var6)) {
                    return var5;
                }
                var4 = var4 + (gk.field_fb + ko.field_fb + (bd.field_c << -1496593663));
            }
            var3++;
        }
        return -1;
    }

    final static void b(boolean param0) {
        ho.field_g.a(0, 18, 0, 256, -(!f.field_n ? 0 : 40 + hk.field_b - -4) + oc.field_O.field_K);
        if (param0) {
            field_o = false;
        }
        l.field_s.a(0, 18, -40 + (-hk.field_b + (oc.field_O.field_K + -2)), 256, 42 - -hk.field_b);
        jm.field_b.a(0, 2, (byte) 102, oc.field_O.field_K, 20, oc.field_O.field_nb - 20, hk.field_b);
    }

    static {
    }
}
