/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends qt {
    static String[] field_A;
    static int[] field_B;

    ud() {
    }

    final void a(byte param0, boolean param1) {
        int stackIn_9_0 = 0;
        int var3;
        int var4;
        int var5;
        super.a((byte) -104, param1);
        var3 = 7 % ((param0 - 38) / 60);
        if (ra.field_G != null) {
          return;
        }
        if (!um.field_b) {
          var4 = nv.field_E[ew.field_a];
          var5 = qt.field_r[ew.field_a];
          mj.a(256.0, 60, (double)var4, (double)var5);
          gg.h((byte) 93);
          jm.a(ig.field_d, false, -2);
          return;
        }
        if (ih.field_c != gk.field_g) {
          nm.a(hh.field_f, -76, wb.field_j, gk.field_g);
        } else {
          if (hh.field_f != rm.field_C) {
            nm.a(hh.field_f, -76, wb.field_j, gk.field_g);
          } else {
            stackIn_9_0 = (vi.field_n) ? 0 : 1;
            if (stackIn_9_0 == (wb.field_j ? 1 : 0)) {
              nm.a(hh.field_f, -76, wb.field_j, gk.field_g);
            }
          }
        }
        if (wh.field_q) {
          return;
        }
        mj.a(140.0, 60, 448.0, 672.0);
        if (ja.field_O) {
          nt.j(13459);
        }
        gg.h((byte) -125);
        System.gc();
        dd.a((byte) 98);
        jm.a(-1, false, -2);
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10) {
            var4 = (String) null;
            ud.a(-31, (String) null, true);
          }
          if (!param2) {
            stackIn_6_0 = cv.field_f.a(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = sf.field_F.a(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ud.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean c(int param0, int param1) {
        boolean stackIn_27_0 = false;
        boolean stackIn_44_0 = false;
        boolean stackIn_64_0 = false;
        boolean stackIn_148_0 = false;
        boolean stackIn_159_0 = false;
        boolean stackIn_172_0 = false;
        boolean stackIn_183_0 = false;
        if (param1 != 17030) {
          return false;
        }
        if (ne.field_G[82]) {
          return false;
        }
        if (ne.field_G[86]) {
          return false;
        }
        if (16 <= param0) {
          if (param0 <= 27) {
            return true;
          }
          if (32 > param0) {
            stackIn_44_0 = ((!(param0 < 48) &&
              !(param0 > 58)) ||
              (!(param0 < 64) &&
              !(param0 > 73)) ||
              (param0 == 80 ||
              param0 == 83 ||
              param0 == 84 ||
              param0 == 85 ||
              59 == param0 ||
              param0 == 74 ||
              28 == param0));
            return stackIn_44_0;
          }
          boolean decompiledFrameRemainder1 = true;
          if (param0 > 43 && ((param0 < 48 ||
            param0 > 58) &&
            (param0 < 64 ||
            param0 > 73)) && (param0 != 80 &&
            param0 != 83 &&
            param0 != 84 &&
            param0 != 85 &&
            59 != param0 &&
            param0 != 74 &&
            28 != param0)) {
            stackIn_27_0 = false;
            decompiledFrameRemainder1 = false;
          }
          else {
            stackIn_27_0 = true;
          }
          return stackIn_27_0;
        }
        if (32 <= param0) {
          if (param0 <= 43) {
            return true;
          }
          if (param0 >= 48) {
            if (param0 <= 58) {
              return true;
            }
            stackIn_64_0 = ((!(param0 < 64) &&
              !(param0 > 73)) ||
              (param0 == 80 ||
              param0 == 83 ||
              param0 == 84 ||
              param0 == 85 ||
              59 == param0 ||
              param0 == 74 ||
              28 == param0));
            return stackIn_64_0;
          }
          if (param0 < 64) {
            if (param0 == 80) {
              return true;
            }
            if (param0 == 83) {
              return true;
            }
            if (param0 == 84) {
              return true;
            }
            if (param0 == 85) {
              return true;
            }
            if (59 == param0) {
              return true;
            }
            if (param0 == 74) {
              return true;
            }
            if (28 == param0) {
              return true;
            }
            return false;
          }
          if (param0 <= 73) {
            return true;
          }
          if (param0 == 80) {
            return true;
          }
          if (param0 == 83) {
            return true;
          }
          if (param0 == 84) {
            return true;
          }
          if (param0 == 85) {
            return true;
          }
          if (59 == param0) {
            return true;
          }
          if (param0 == 74) {
            return true;
          }
          if (28 != param0) {
            return false;
          }
          return true;
        }
        if (param0 < 48) {
          boolean decompiledFrameRemainder0 = true;
          if (param0 < 64) {
            if (param0 != 80 &&
              param0 != 83 &&
              param0 != 84 &&
              param0 != 85 &&
              59 != param0 &&
              param0 != 74) {
              if (28 == param0) {
                return true;
              }
              stackIn_183_0 = false;
              decompiledFrameRemainder0 = false;
            }
          } else {
            if (param0 > 73) {
              if (param0 != 80 &&
                param0 != 83 &&
                param0 != 84 &&
                param0 != 85 &&
                59 != param0 &&
                param0 != 74) {
                if (28 == param0) {
                  return true;
                }
                stackIn_172_0 = false;
              } else {
                stackIn_172_0 = true;
              }
              return stackIn_172_0;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_183_0 = true;
          }
          return stackIn_183_0;
        }
        if (param0 <= 58) {
          return true;
        }
        if (param0 < 64) {
          if (param0 != 80 &&
            param0 != 83 &&
            param0 != 84 &&
            param0 != 85 &&
            59 != param0 &&
            param0 != 74) {
            if (28 == param0) {
              return true;
            }
            stackIn_159_0 = false;
          } else {
            stackIn_159_0 = true;
          }
          return stackIn_159_0;
        }
        if (param0 <= 73) {
          return true;
        }
        if (param0 != 80 &&
          param0 != 83 &&
          param0 != 84 &&
          param0 != 85 &&
          59 != param0 &&
          param0 != 74) {
          if (28 == param0) {
            return true;
          }
          stackIn_148_0 = false;
        } else {
          stackIn_148_0 = true;
        }
        return stackIn_148_0;
    }

    public static void e(int param0) {
        field_A = null;
        field_B = null;
        if (param0 != 14513) {
          field_B = (int[]) null;
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, boolean param4, boolean param5, int param6, boolean param7, int param8, boolean param9) {
        int var11;
        var11 = Kickabout.field_G;
        if (param4) {
          df.field_H = ub.field_B;
          gt.a(param4, 1);
          if (ns.field_a > 0) {
            we.a(param7, param4, (byte) -119, param6);
          }
          nv.field_F.field_A = 1;
          nv.field_F.field_kb = ip.field_c.field_kb;
          if (fj.field_a > 0) {
            ri.a(102, param4, param7, param6);
          }
          if (ee.field_b > 0) {
            lu.a(param7, param6, -2, param9, param4);
          }
          if (td.field_b &&
            uv.field_i.field_gc >= uv.field_i.field_bc) {
            mc.field_d.field_lb = false;
            bf.field_u.field_zb.field_E = no.field_I;
            hl.a(true, bf.field_u.field_Ab);
          } else {
            bf.field_u.field_zb.field_E = null;
            mc.field_d.field_lb = true;
            e.a(bf.field_u, param3, param2, param6, 92);
          }
        } else {
          if (ea.field_a != on.field_g) {
            if (ea.field_f.field_e == on.field_f &&
              ea.field_f.field_a == on.field_g) {
              if (null == uv.field_i) {
                if (ow.field_b == null) {
                  ml.c(false);
                  if (param4) {
                    df.field_H = ub.field_B;
                  } else {
                    df.field_H = (ea.field_a - 640) / 2;
                  }
                  gt.a(param4, 1);
                  if (ns.field_a > 0) {
                    we.a(param7, param4, (byte) -119, param6);
                  }
                  nv.field_F.field_A = 1;
                  nv.field_F.field_kb = ip.field_c.field_kb;
                  if (fj.field_a > 0) {
                    ri.a(102, param4, param7, param6);
                  }
                  if (ee.field_b > 0) {
                    lu.a(param7, param6, -2, param9, param4);
                  }
                  if (td.field_b &&
                    uv.field_i.field_gc >= uv.field_i.field_bc) {
                    mc.field_d.field_lb = false;
                    bf.field_u.field_zb.field_E = no.field_I;
                    hl.a(true, bf.field_u.field_Ab);
                  } else {
                    bf.field_u.field_zb.field_E = null;
                    mc.field_d.field_lb = true;
                    e.a(bf.field_u, param3, param2, param6, 92);
                  }
                  w.a(param2, param0, param6, param8, param5, param3, param1);
                  e.a(bs.field_c, param3, param2, param6, 38);
                  de.field_c = de.field_c + 1;
                  return;
                }
                bq.a(103, true);
              } else {
                bq.a(98, false);
              }
            }
            if (!param4) {
              df.field_H = (ea.field_a - 640) / 2;
              gt.a(param4, 1);
              if (ns.field_a > 0) {
                we.a(param7, param4, (byte) -119, param6);
              }
              nv.field_F.field_A = 1;
              nv.field_F.field_kb = ip.field_c.field_kb;
              if (fj.field_a > 0) {
                ri.a(102, param4, param7, param6);
              }
              if (ee.field_b > 0) {
                lu.a(param7, param6, -2, param9, param4);
              }
              if (td.field_b &&
                uv.field_i.field_gc >= uv.field_i.field_bc) {
                mc.field_d.field_lb = false;
                bf.field_u.field_zb.field_E = no.field_I;
                hl.a(true, bf.field_u.field_Ab);
              } else {
                bf.field_u.field_zb.field_E = null;
                mc.field_d.field_lb = true;
                e.a(bf.field_u, param3, param2, param6, 92);
              }
            } else {
              df.field_H = ub.field_B;
              gt.a(param4, 1);
              if (ns.field_a > 0) {
                we.a(param7, param4, (byte) -119, param6);
              }
              nv.field_F.field_A = 1;
              nv.field_F.field_kb = ip.field_c.field_kb;
              if (fj.field_a > 0) {
                ri.a(102, param4, param7, param6);
              }
              if (ee.field_b > 0) {
                lu.a(param7, param6, -2, param9, param4);
              }
              if (td.field_b &&
                uv.field_i.field_gc >= uv.field_i.field_bc) {
                mc.field_d.field_lb = false;
                bf.field_u.field_zb.field_E = no.field_I;
                hl.a(true, bf.field_u.field_Ab);
              } else {
                bf.field_u.field_zb.field_E = null;
                mc.field_d.field_lb = true;
                e.a(bf.field_u, param3, param2, param6, 92);
              }
            }
          } else {
            if (on.field_f != bh.field_s &&
              ea.field_f.field_e == on.field_f &&
              ea.field_f.field_a == on.field_g) {
              if (null == uv.field_i) {
                if (ow.field_b == null) {
                  ml.c(false);
                  if (param4) {
                    df.field_H = ub.field_B;
                  } else {
                    df.field_H = (ea.field_a - 640) / 2;
                  }
                  gt.a(param4, 1);
                  if (ns.field_a > 0) {
                    we.a(param7, param4, (byte) -119, param6);
                  }
                  nv.field_F.field_A = 1;
                  nv.field_F.field_kb = ip.field_c.field_kb;
                  if (fj.field_a > 0) {
                    ri.a(102, param4, param7, param6);
                  }
                  if (ee.field_b > 0) {
                    lu.a(param7, param6, -2, param9, param4);
                  }
                  if (td.field_b &&
                    uv.field_i.field_gc >= uv.field_i.field_bc) {
                    mc.field_d.field_lb = false;
                    bf.field_u.field_zb.field_E = no.field_I;
                    hl.a(true, bf.field_u.field_Ab);
                  } else {
                    bf.field_u.field_zb.field_E = null;
                    mc.field_d.field_lb = true;
                    e.a(bf.field_u, param3, param2, param6, 92);
                  }
                  w.a(param2, param0, param6, param8, param5, param3, param1);
                  e.a(bs.field_c, param3, param2, param6, 38);
                  de.field_c = de.field_c + 1;
                  return;
                }
                bq.a(103, true);
              } else {
                bq.a(98, false);
              }
            }
            if (!param4) {
              df.field_H = (ea.field_a - 640) / 2;
              gt.a(param4, 1);
              if (ns.field_a > 0) {
                we.a(param7, param4, (byte) -119, param6);
              }
              nv.field_F.field_A = 1;
              nv.field_F.field_kb = ip.field_c.field_kb;
              if (fj.field_a > 0) {
                ri.a(102, param4, param7, param6);
              }
              if (ee.field_b > 0) {
                lu.a(param7, param6, -2, param9, param4);
              }
              if (td.field_b &&
                uv.field_i.field_gc >= uv.field_i.field_bc) {
                mc.field_d.field_lb = false;
                bf.field_u.field_zb.field_E = no.field_I;
                hl.a(true, bf.field_u.field_Ab);
              } else {
                bf.field_u.field_zb.field_E = null;
                mc.field_d.field_lb = true;
                e.a(bf.field_u, param3, param2, param6, 92);
              }
            } else {
              df.field_H = ub.field_B;
              gt.a(param4, 1);
              if (ns.field_a > 0) {
                we.a(param7, param4, (byte) -119, param6);
              }
              nv.field_F.field_A = 1;
              nv.field_F.field_kb = ip.field_c.field_kb;
              if (fj.field_a > 0) {
                ri.a(102, param4, param7, param6);
                if (ee.field_b > 0) {
                  lu.a(param7, param6, -2, param9, param4);
                }
                if (td.field_b &&
                  uv.field_i.field_gc >= uv.field_i.field_bc) {
                  mc.field_d.field_lb = false;
                  bf.field_u.field_zb.field_E = no.field_I;
                  hl.a(true, bf.field_u.field_Ab);
                } else {
                  bf.field_u.field_zb.field_E = null;
                  mc.field_d.field_lb = true;
                  e.a(bf.field_u, param3, param2, param6, 92);
                }
              } else {
                if (ee.field_b > 0) {
                  lu.a(param7, param6, -2, param9, param4);
                }
                if (!td.field_b) {
                  bf.field_u.field_zb.field_E = null;
                  mc.field_d.field_lb = true;
                  e.a(bf.field_u, param3, param2, param6, 92);
                } else {
                  if (uv.field_i.field_gc >= uv.field_i.field_bc) {
                    mc.field_d.field_lb = false;
                    bf.field_u.field_zb.field_E = no.field_I;
                    hl.a(true, bf.field_u.field_Ab);
                  } else {
                    bf.field_u.field_zb.field_E = null;
                    mc.field_d.field_lb = true;
                    e.a(bf.field_u, param3, param2, param6, 92);
                  }
                }
              }
            }
          }
        }
        w.a(param2, param0, param6, param8, param5, param3, param1);
        e.a(bs.field_c, param3, param2, param6, 38);
        de.field_c = de.field_c + 1;
    }

    final void a(int param0, boolean param1) {
        super.a(param0, param1);
        if (null == um.field_e) {
          return;
        }
        if (-2 == ig.field_d) {
          return;
        }
        um.field_e.c((byte) 80);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_44_0 = 0;
        int var4;
        if (param2 != 17860) {
          return false;
        }
        if (fb.field_J == null) {
          if (!vg.field_Wb) {
            if (kd.field_s) {
              return ov.a(param3, param2 ^ -17866, param0);
            }
            if (9 == cc.field_e) {
              return ov.a(param3, param2 ^ -17866, param0);
            }
            if (cc.field_e == 10) {
              return ov.a(param3, param2 ^ -17866, param0);
            }
            if (11 == cc.field_e) {
              return ov.a(param3, param2 ^ -17866, param0);
            }
            if (cc.field_e != 80) {
              return false;
            }
            if (!ph.a(true)) {
              return false;
            }
            vg.field_Wb = true;
            return true;
          }
          if (!ph.a(true)) {
            return false;
          }
          stackIn_44_0 = (!hd.a(false, param1, param0)) ? 0 : 1;
          var4 = stackIn_44_0;
          if (80 == cc.field_e ||
            84 == cc.field_e) {
            vg.field_Wb = false;
            var4 = 1;
          }
        } else {
          if (cc.field_e == 13) {
            fb.field_J = null;
            return true;
          }
          if (!vg.field_Wb) {
            if (kd.field_s) {
              return ov.a(param3, param2 ^ -17866, param0);
            }
            if (9 == cc.field_e) {
              return ov.a(param3, param2 ^ -17866, param0);
            }
            if (cc.field_e == 10) {
              return ov.a(param3, param2 ^ -17866, param0);
            }
            if (11 == cc.field_e) {
              return ov.a(param3, param2 ^ -17866, param0);
            }
            if (cc.field_e != 80) {
              return false;
            }
            if (!ph.a(true)) {
              return false;
            }
            vg.field_Wb = true;
            return true;
          }
          if (!ph.a(true)) {
            return false;
          }
          stackIn_11_0 = (!hd.a(false, param1, param0)) ? 0 : 1;
          var4 = stackIn_11_0;
          if (80 == cc.field_e) {
            vg.field_Wb = false;
            var4 = 1;
          } else {
            if (84 == cc.field_e) {
              vg.field_Wb = false;
              var4 = 1;
            }
          }
        }
        if (13 == cc.field_e) {
          td.a(89);
          var4 = 1;
          vg.field_Wb = false;
        }
        return var4 != 0;
    }

    static {
        field_B = new int[8192];
        field_A = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
