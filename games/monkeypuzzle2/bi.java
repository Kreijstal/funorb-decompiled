/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi extends fc {
    String field_u;
    private boolean field_t;
    static char[] field_s;
    private int field_r;
    private int field_o;
    private boolean field_q;
    private int field_v;
    private long field_w;
    private boolean field_y;
    static int[] field_B;
    static long field_z;
    private int field_x;
    private int field_p;
    private int field_n;

    private final void g(int param0) {
        ok.field_c[8] = -2;
        ok.field_c[5] = -1;
        ok.field_c[2] = -2;
        ok.field_c[4] = -1;
        if (param0 >= -48) {
            int discarded$0 = ((bi) this).a(true, 104);
        }
        ok.field_c[12] = -1;
        ok.field_c[7] = -1;
        ok.field_c[13] = -1;
        ok.field_c[1] = 16;
        ok.field_c[11] = -1;
        ok.field_c[10] = -1;
        ok.field_c[9] = -1;
        ok.field_c[16] = -1;
        ok.field_c[6] = -2;
        ok.field_c[17] = -1;
        ok.field_c[3] = -1;
        ok.field_c[18] = 1;
    }

    public static void d(byte param0) {
        field_B = null;
        int var1 = 73 / ((param0 - 41) / 55);
        field_s = null;
    }

    final static am a(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 != 5000) {
            return null;
        }
        int var2 = param0.length();
        for (var3 = 0; var2 > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (57 < var4) {
                return null;
            }
        }
        return lh.field_c;
    }

    final int f(int param0) {
        int var2 = this.j(param0 ^ 8214);
        if (var2 != 0) {
            // if_icmpeq L22
        } else {
            if (!(!eg.field_k[1])) {
                wi.a(2, param0 ^ 1198);
            }
            if (eg.field_k[2]) {
                db.a(3, 126);
            }
            if (!(!eg.field_k[3])) {
                d.a(4, param0 + 2);
            }
            if (eg.field_k[4]) {
                qi.a(false, 5);
            }
            if (!(!eg.field_k[5])) {
                wd.a(6, true);
            }
            if (!(!eg.field_k[6])) {
                sl.a(7, (byte) 63);
            }
            if (eg.field_k[8]) {
                df.f((byte) -98);
            }
        }
        if (param0 != 3) {
            ((bi) this).field_w = -33L;
        }
        return var2;
    }

    final int a(boolean param0, int param1) {
        if (param1 != 4) {
            this.a(34, true);
        }
        return this.a(true, true, param0);
    }

    private final void d(boolean param0) {
        eg.field_k[4] = true;
        if (param0) {
            field_s = null;
        }
    }

    private final void e(byte param0) {
        eg.field_k[2] = true;
        if (param0 > -79) {
            ((bi) this).field_u = null;
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != null) {
          L0: {
            var3 = param0.length();
            if (-2 < var3) {
              break L0;
            } else {
              if (-13 < var3) {
                break L0;
              } else {
                L1: {
                  var4 = pl.a((byte) 100, param0);
                  if (param1 == 20558) {
                    break L1;
                  } else {
                    field_B = null;
                    break L1;
                  }
                }
                if (var4 == null) {
                  return false;
                } else {
                  if (-2 >= (var4.length() ^ -1)) {
                    L2: {
                      if (ok.a(-121, var4.charAt(0))) {
                        break L2;
                      } else {
                        if (ok.a(-77, var4.charAt(var4.length() + -1))) {
                          break L2;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L3: while (true) {
                            if (var6 >= param0.length()) {
                              if (-1 <= (var5 ^ -1)) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L4: {
                                var7 = param0.charAt(var6);
                                if (ok.a(-113, (char) var7)) {
                                  var5++;
                                  break L4;
                                } else {
                                  var5 = 0;
                                  break L4;
                                }
                              }
                              if (var5 >= 2) {
                                if (!param2) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              } else {
                                var6++;
                                continue L3;
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    private final void a(int param0, boolean param1) {
        eg.field_k[18] = true;
        eg.field_k[7] = true;
        eg.field_k[8] = param1;
        eg.field_k[16] = true;
        if (param0 != -2) {
            return;
        }
        eg.field_k[3] = true;
        eg.field_k[17] = true;
        eg.field_k[0] = true;
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        if (param1 != 4472) {
            return;
        }
        this.a(-2, false);
        if (!(!param0)) {
            this.e(19887);
        }
        if (param2) {
            this.e((byte) -121);
        }
        if (param3) {
            this.d(false);
        }
        if (param4) {
            this.h(9);
        }
    }

    private final void f(byte param0) {
        int var3 = 83 / ((param0 - 76) / 33);
        String var2 = lh.a((byte) -110);
        mk.a(var2, (byte) -5, ii.a(false));
    }

    final void i(int param0) {
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 250) {
            return;
        }
        if (vg.c(false)) {
            int discarded$1 = this.a(false, true, null != ba.field_f ? true : false);
        } else {
            if (mc.field_a < 10) {
            } else {
                if (!ub.b(true)) {
                    ak.a((byte) 99);
                } else {
                    if (k.field_g == 0) {
                        int discarded$3 = this.a(false, true, false);
                    } else {
                        b.a(-21342, ab.field_d);
                    }
                }
            }
        }
    }

    private final void a(int param0, int param1, String param2, boolean param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        try {
          if (((bi) this).b((byte) -66)) {
            L0: {
              L1: {
                ((bi) this).field_u = ((bi) this).getCodeBase().getHost();
                var6_ref = ((bi) this).field_u.toLowerCase();
                stackOut_2_0 = this;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L0;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L0;
            }
            L2: {
              ((bi) this).field_y = stackIn_7_1 != 0;
              if (param3) {
                break L2;
              } else {
                ((bi) this).i(-89);
                break L2;
              }
            }
            L3: {
              ((bi) this).field_r = Integer.parseInt(((bi) this).getParameter("gameport1"));
              ((bi) this).field_x = Integer.parseInt(((bi) this).getParameter("gameport2"));
              var7 = ((bi) this).getParameter("servernum");
              if (var7 != null) {
                ((bi) this).field_v = Integer.parseInt(var7);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ((bi) this).field_p = Integer.parseInt(((bi) this).getParameter("gamecrc"));
              ((bi) this).field_w = Long.parseLong(((bi) this).getParameter("instanceid"));
              ((bi) this).field_t = ((bi) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((bi) this).getParameter("lang");
              if (var8 == null) {
                break L4;
              } else {
                ((bi) this).field_o = Integer.parseInt(var8);
                break L4;
              }
            }
            L5: {
              if (-6 < (((bi) this).field_o ^ -1)) {
                break L5;
              } else {
                ((bi) this).field_o = 0;
                break L5;
              }
            }
            L6: {
              var9 = ((bi) this).getParameter("affid");
              if (var9 == null) {
                break L6;
              } else {
                ((bi) this).field_n = Integer.parseInt(var9);
                break L6;
              }
            }
            la.field_o = Boolean.valueOf(((bi) this).getParameter("simplemode")).booleanValue();
            ((bi) this).a(param0, param4, ((bi) this).field_p, param1, 32, param2, (byte) -48);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        kk.a((String) null, (byte) 110, (Throwable) (Object) var6);
        ((bi) this).a((byte) 87, "crash");
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_27_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        L0: {
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (ci.field_a != null) {
            L1: {
              if (ba.field_f == null) {
                var6 = hd.b(true);
                var4 = var6.getSize();
                ci.field_a.a(-124, var4.width, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            ci.field_a.b(param0 ^ -73);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          kc.a((byte) 93);
          db.a(param0 + -99);
          if (wj.d(-106)) {
            break L2;
          } else {
            if (-12 != (k.field_g ^ -1)) {
              cd.b(110);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (eb.field_A != null) {
            ab.field_d = eb.field_A.a(true);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 99) {
            break L4;
          } else {
            ((bi) this).field_v = -121;
            break L4;
          }
        }
        L5: {
          if (!cb.a(false)) {
            break L5;
          } else {
            L6: {
              var3 = 1200 * gg.c(0);
              if (((bi) this).field_q) {
                break L6;
              } else {
                if (var3 >= qa.b(125)) {
                  break L5;
                } else {
                  if (var3 < rh.a(1)) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((bi) this).field_q = false;
            gk.a(-1);
            cf.a((byte) 108);
            pc.a((byte) -46, 2, dc.field_b);
            dd.a(0);
            qj.field_J = true;
            ha.field_ab = 15000L + pf.a(0);
            break L5;
          }
        }
        L7: {
          L8: {
            if ((bl.field_m ^ -1) == 0) {
              break L8;
            } else {
              if (bl.field_m != 0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (bl.field_m != -1) {
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L9;
            } else {
              stackOut_25_0 = 1;
              stackIn_27_0 = stackOut_25_0;
              break L9;
            }
          }
          L10: {
            var3 = stackIn_27_0;
            bl.field_m = kh.a((byte) -93);
            if (var3 == 0) {
              break L10;
            } else {
              if (bl.field_m != 0) {
                break L10;
              } else {
                if (11 != k.field_g) {
                  break L10;
                } else {
                  if (!ld.b(true)) {
                    db.a(false);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
          if ((bl.field_m ^ -1) == 0) {
            break L7;
          } else {
            if (bl.field_m != -1) {
              ha.field_ab = pf.a(param0 + -99) - -15000L;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L11: {
          if (0 == bl.field_m) {
            break L11;
          } else {
            if (0 != bl.field_m) {
              if (-11 < (mc.field_a ^ -1)) {
                if (bl.field_m != 3) {
                  if (-5 != bl.field_m) {
                    if (-3 != bl.field_m) {
                      if ((bl.field_m ^ -1) != -6) {
                        ((bi) this).a((byte) 105, "js5connect");
                        break L11;
                      } else {
                        ((bi) this).a((byte) 58, "outofdate");
                        break L11;
                      }
                    } else {
                      ((bi) this).a((byte) 82, "js5connect_full");
                      break L11;
                    }
                  } else {
                    ((bi) this).a((byte) 123, "js5io");
                    break L11;
                  }
                } else {
                  ((bi) this).a((byte) 62, "js5crc");
                  break L11;
                }
              } else {
                if (10 > k.field_g) {
                  break L11;
                } else {
                  L12: {
                    cf.a((byte) 92);
                    if (bl.field_m == -4) {
                      pc.a((byte) -46, 256, qi.field_A);
                      break L12;
                    } else {
                      if (bl.field_m != 4) {
                        if (-3 != bl.field_m) {
                          if (5 != bl.field_m) {
                            pc.a((byte) -46, 256, me.field_h);
                            break L12;
                          } else {
                            pc.a((byte) -46, 5, sc.field_b);
                            break L12;
                          }
                        } else {
                          pc.a((byte) -46, 256, vi.field_a);
                          break L12;
                        }
                      } else {
                        pc.a((byte) -46, 256, ia.field_c);
                        break L12;
                      }
                    }
                  }
                  qj.field_J = true;
                  break L11;
                }
              }
            } else {
              break L11;
            }
          }
        }
        L13: {
          L14: {
            L15: {
              if (bl.field_m == -1) {
                break L15;
              } else {
                if (0 != bl.field_m) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (!ld.b(true)) {
              break L13;
            } else {
              break L14;
            }
          }
          if (pf.a(param0 + -99) >= ha.field_ab) {
            qj.field_J = false;
            if (-1 == bl.field_m) {
              break L13;
            } else {
              if (bl.field_m != -1) {
                bl.field_m = -1;
                ff.a(64);
                break L13;
              } else {
                break L13;
              }
            }
          } else {
            break L13;
          }
        }
        L16: {
          if (-1 != bl.field_m) {
            break L16;
          } else {
            if (!ld.b(true)) {
              lh.field_e = false;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if (-1 != (mc.field_a ^ -1)) {
            break L17;
          } else {
            if (gh.a(false)) {
              mc.field_a = 1;
              break L17;
            } else {
              break L17;
            }
          }
        }
        L18: {
          if (mc.field_a == 1) {
            L19: {
              if (fe.field_h != 0) {
                ec.field_a = ol.a(-107, pl.field_g);
                break L19;
              } else {
                break L19;
              }
            }
            fj.field_B = b.a(false, 1, true, ph.field_c, (byte) 125);
            hf.field_a = b.a(false, 1, true, nd.field_e, (byte) -118);
            ii.field_m = b.a(false, 1, true, uk.field_q, (byte) -51);
            mc.field_a = 2;
            wj.field_j = fj.field_B;
            ri.field_a = hf.field_a;
            break L18;
          } else {
            break L18;
          }
        }
        L20: {
          if (-3 == (mc.field_a ^ -1)) {
            L21: {
              if (ec.field_a != null) {
                if (ec.field_a.a(73)) {
                  if (!ec.field_a.b("", (byte) -111)) {
                    ec.field_a = null;
                    break L21;
                  } else {
                    if (!ec.field_a.a(0, "")) {
                      break L21;
                    } else {
                      ll.a(2, ec.field_a);
                      ec.field_a = null;
                      oe.a((byte) 119);
                      break L21;
                    }
                  }
                } else {
                  break L21;
                }
              } else {
                break L21;
              }
            }
            if (ec.field_a == null) {
              mc.field_a = 3;
              break L20;
            } else {
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if ((mc.field_a ^ -1) == -4) {
            if (!di.a(fj.field_B, hf.field_a, ii.field_m, (byte) 104)) {
              break L22;
            } else {
              if (al.a(ii.field_m, (byte) 39)) {
                L23: {
                  L24: {
                    pb.a(false);
                    dj.b(param0 ^ -25469);
                    cf.field_c = false;
                    be.field_d = j.field_h;
                    lc.a(fj.field_B, mb.field_c, hf.field_a, param0 + 3249773, ii.field_m);
                    if (sd.field_d) {
                      break L24;
                    } else {
                      if (kg.field_d == null) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (sd.field_d) {
                      stackOut_109_0 = 0;
                      stackIn_110_0 = stackOut_109_0;
                      break L25;
                    } else {
                      stackOut_108_0 = 1;
                      stackIn_110_0 = stackOut_108_0;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_110_0 = stackIn_110_0;
                    stackOut_110_1 = 98;
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_112_1 = stackOut_110_1;
                    stackIn_111_0 = stackOut_110_0;
                    stackIn_111_1 = stackOut_110_1;
                    if (sd.field_d) {
                      stackOut_112_0 = stackIn_112_0;
                      stackOut_112_1 = stackIn_112_1;
                      stackOut_112_2 = 0;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      stackIn_113_2 = stackOut_112_2;
                      break L26;
                    } else {
                      stackOut_111_0 = stackIn_111_0;
                      stackOut_111_1 = stackIn_111_1;
                      stackOut_111_2 = 1;
                      stackIn_113_0 = stackOut_111_0;
                      stackIn_113_1 = stackOut_111_1;
                      stackIn_113_2 = stackOut_111_2;
                      break L26;
                    }
                  }
                  bd.a(stackIn_113_0 != 0, (byte) stackIn_113_1, stackIn_113_2 != 0, kg.field_d);
                  break L23;
                }
                L27: {
                  if (la.field_o) {
                    il.a(true);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (null == dk.field_e) {
                    dk.field_e = vd.a(false);
                    fa.field_p = ne.a(param0 ^ -100);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                fc.a(dk.field_e, (byte) 111, ii.field_m, fa.field_p);
                ii.field_m = null;
                fj.field_B = null;
                hf.field_a = null;
                uc.a((java.applet.Applet) this, 0);
                oe.a((byte) 112);
                mc.field_a = 10;
                break L22;
              } else {
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L29: {
          if (mc.field_a != 10) {
            break L29;
          } else {
            L30: {
              if (-1 != (fe.field_h ^ -1)) {
                ch.field_j = ol.a(-102, r.field_e);
                break L30;
              } else {
                break L30;
              }
            }
            mc.field_a = 11;
            break L29;
          }
        }
        L31: {
          if (mc.field_a == 11) {
            L32: {
              if (ch.field_j == null) {
                break L32;
              } else {
                L33: {
                  if (!ch.field_j.a(-124)) {
                    break L33;
                  } else {
                    if (ch.field_j.b(0)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                ad.a(ec.a(ch.field_j, ug.field_b, tk.field_a, 0), param0 ^ -24150, 0.0f);
                break L31;
              }
            }
            mc.field_a = 12;
            pl.field_d = true;
            break L31;
          } else {
            break L31;
          }
        }
        L34: {
          if (-13 == (mc.field_a ^ -1)) {
            if (pl.field_d) {
              break L34;
            } else {
              mc.field_a = 13;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if (13 != mc.field_a) {
            if (param1) {
              break L35;
            } else {
              if (!aj.field_c) {
                break L35;
              } else {
                vh.a(ie.field_e, (byte) -115);
                ((bi) this).a(false);
                af.a(20, ie.field_e);
                break L35;
              }
            }
          } else {
            if (param1) {
              break L35;
            } else {
              if (!aj.field_c) {
                break L35;
              } else {
                vh.a(ie.field_e, (byte) -115);
                ((bi) this).a(false);
                af.a(20, ie.field_e);
                break L35;
              }
            }
          }
        }
        L36: {
          if (eg.field_k[8]) {
            ei.b(param0 + -91);
            break L36;
          } else {
            break L36;
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        this.a(param0, 480, param2, true, 640);
        if (param1 < 124) {
            ((bi) this).field_o = 99;
        }
    }

    private final void h(int param0) {
        if (param0 != 9) {
            return;
        }
        eg.field_k[5] = true;
    }

    final static boolean a(byte param0, gk param1) {
        int var2 = 18 / ((46 - param0) / 57);
        int var3 = param1.a((byte) 114);
        int var4 = var3 != 1 ? 0 : 1;
        return var4 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((bi) this).setBackground(java.awt.Color.black);
        if (param4 != -25172) {
            ((bi) this).field_x = -97;
        }
        fe.field_h = ((bi) this).field_o;
        jg.a(3860, fe.field_h);
        kj.a(fe.field_h, ((bi) this).field_x, ((bi) this).field_t, 5000, param0, ((bi) this).field_p, ((bi) this).field_u, ((bi) this).field_w, param5, 5000, ((bi) this).field_v, (byte) -111, ((bi) this).field_r, rc.field_k);
        ii.a(rc.field_k, ((bi) this).field_u, ((bi) this).field_x, fe.field_h, ((bi) this).field_r, param0, ((bi) this).field_p, ((bi) this).field_v, -2045);
        sj.a(92);
        eb.field_A = cf.a(param4 + 25427);
        af.a(20, ie.field_e);
        pl.field_g = param3;
        r.field_e = param1;
        nd.field_e = param7;
        uk.field_q = param6;
        ph.field_c = param2;
        this.g(param4 ^ 25184);
        re.b(75);
    }

    final void k(int param0) {
        int var2 = 0;
        hl var3 = null;
        int var4 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = wk.field_a;
          if (-65 >= (var2 ^ -1)) {
            break L0;
          } else {
            if (!eg.field_k[var2]) {
              break L0;
            } else {
              L1: {
                if (param0 == -28710) {
                  break L1;
                } else {
                  this.g(-13);
                  break L1;
                }
              }
              if (0 == var2) {
                return;
              } else {
                L2: {
                  if (var2 != 1) {
                    if (-3 == var2) {
                      p.b(-79);
                      break L2;
                    } else {
                      if (var2 == 3) {
                        hh.c(true);
                        break L2;
                      } else {
                        if (4 == var2) {
                          gd.a((byte) 8);
                          break L2;
                        } else {
                          if (-6 == var2) {
                            sc.a(false);
                            break L2;
                          } else {
                            if (-7 != (var2 ^ -1)) {
                              if ((var2 ^ -1) == -8) {
                                this.f((byte) 115);
                                break L2;
                              } else {
                                if (8 != var2) {
                                  if ((var2 ^ -1) != -17) {
                                    L3: {
                                      if ((var2 ^ -1) == -12) {
                                        break L3;
                                      } else {
                                        if ((var2 ^ -1) == -13) {
                                          break L3;
                                        } else {
                                          if (var2 == 13) {
                                            rh.l(78);
                                            break L2;
                                          } else {
                                            if (var2 == 17) {
                                              this.l(15);
                                              break L2;
                                            } else {
                                              if (var2 != 18) {
                                                kk.a("MGS1: " + bh.a((byte) -49), (byte) 120, (Throwable) null);
                                                gk.a(-1);
                                                break L2;
                                              } else {
                                                uc.a(62);
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if ((var2 ^ -1) != -13) {
                                        stackOut_31_0 = 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        break L4;
                                      } else {
                                        stackOut_30_0 = 1;
                                        stackIn_32_0 = stackOut_30_0;
                                        break L4;
                                      }
                                    }
                                    var3 = si.a(stackIn_32_0 != 0, 0);
                                    cd.a(var3, (byte) 20);
                                    break L2;
                                  } else {
                                    lg.a((byte) 122);
                                    break L2;
                                  }
                                } else {
                                  hk.a((gk) (Object) MonkeyPuzzle2.field_D, rc.field_k, -1, rc.field_f);
                                  break L2;
                                }
                              }
                            } else {
                              m.a((byte) -106);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    t.i(-118);
                    break L2;
                  }
                }
                return;
              }
            }
          }
        }
        kk.a("MGS2: " + bh.a((byte) -38), (byte) 66, (Throwable) null);
        gk.a(param0 + 28709);
    }

    private final int j(int param0) {
        int var2 = 0;
        if (((bi) this).field_l) {
          return -1;
        } else {
          if (!ld.b(true)) {
            return -1;
          } else {
            if (qj.field_J) {
              return -1;
            } else {
              L0: {
                if (param0 == 8213) {
                  break L0;
                } else {
                  ((bi) this).field_p = -31;
                  break L0;
                }
              }
              var2 = ad.a(((bi) this).field_n, 650, ((bi) this).field_y, true, mk.e(0), lb.d((byte) -56));
              if (0 != (var2 ^ -1)) {
                L1: {
                  if (0 == var2) {
                    break L1;
                  } else {
                    if (var2 != 1) {
                      L2: {
                        if (!nd.field_a) {
                          ((bi) this).a((byte) 77, "reconnect");
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      cf.a((byte) 3);
                      pc.a((byte) -46, var2, sl.field_n);
                      qj.field_J = true;
                      ha.field_ab = pf.a(0) - -15000L;
                      return var2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (k.field_g != 11) {
                    break L3;
                  } else {
                    if (bl.field_m == 0) {
                      db.a(false);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            }
          }
        }
    }

    private final void l(int param0) {
        if (param0 <= 10) {
            return;
        }
        int var2 = MonkeyPuzzle2.field_D.a((byte) 114);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        int var4 = rc.field_f + -1;
        byte[] var5 = new byte[var4];
        MonkeyPuzzle2.field_D.a((byte) 118, 0, var4, var5);
        pl.a(var3 != 0, 12430, ii.a(false), be.a(var5, (byte) -49));
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            gk var12 = null;
            int stackIn_34_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_39_1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_33_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_38_1 = 0;
            int stackOut_37_0 = 0;
            int stackOut_37_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
                        var4 = sg.a(fe.field_h, param2, -128, ab.field_d);
                        if (param1) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        bi.d((byte) -64);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        throw new IllegalStateException();
                    }
                    case 5: {
                        if (-2 == (var4 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var5_int = hb.a(-7468, qj.l(111), wc.a((byte) 112));
                        if ((var5_int ^ -1) == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        p.a(sl.field_n, (byte) 121, var5_int, cm.field_E);
                        sl.field_n = null;
                        cm.field_E = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var11 = na.a(55);
                        if (var11 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ti.a(0, var11.booleanValue());
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if ((var4 ^ -1) == -3) {
                            statePc = 14;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var5_int = nj.a(ci.a((byte) 78), gh.a(12035), mk.e(0), lb.d((byte) -56), true, ((bi) this).field_n, pl.a((byte) -69));
                        if (var5_int == -1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        fj.a(cm.field_E, sl.field_n, -27967, var5_int);
                        cm.field_E = null;
                        sl.field_n = null;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (-4 != (var4 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if ((bl.field_m ^ -1) == 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (bl.field_m != 0) {
                            statePc = 20;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        bl.field_m = -1;
                        ff.a(95);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (!param0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        qj.field_J = false;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 23: {
                        var5_int = ad.a(((bi) this).field_n, 650, ((bi) this).field_y, false, mk.e(0), lb.d((byte) -56));
                        if ((var5_int ^ -1) != 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (var5_int != 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        cc.field_b = ia.field_f;
                        db.a(false);
                        ha.field_db = false;
                        k.field_g = 10;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 27: {
                        pc.a((byte) -46, var5_int, sl.field_n);
                        sl.field_n = null;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        if (4 != var4) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (mb.field_c) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        ha.field_db = true;
                        k.field_g = 10;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 31: {
                        if (param1) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        stackOut_32_0 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 33: {
                        stackOut_33_0 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        ad.a(ii.a(stackIn_34_0 != 0), true);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (var4 != 5) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        stackOut_36_0 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_37_0 = stackOut_36_0;
                        if (param1) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 38: {
                        stackOut_38_0 = stackIn_38_0;
                        stackOut_38_1 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        hd.a(stackIn_39_0 != 0, ii.a(stackIn_39_1 != 0));
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (var4 == 6) {
                            statePc = 42;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        if (cf.field_c) {
                            statePc = 44;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        k.field_g = 10;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (7 == var4) {
                            statePc = 47;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        aa.a(-126, ii.a(false));
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (var4 != 8) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        ad.a(ii.a(false), true);
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        if (-10 == var4) {
                            statePc = 52;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        m.a((byte) -79, ii.a(false));
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (-11 != var4) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        gf.field_c.b(true, 17);
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        if ((var4 ^ -1) != -12) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        l.a(ii.a(false), -120);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        if (12 != var4) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        k.a(ii.a(false), (byte) 91, pj.b(true));
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        if (13 == var4) {
                            statePc = 61;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        try {
                            if (null == ec.field_e) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ec.field_e = new qa(rc.field_k, new java.net.URL(((bi) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (ec.field_e.c(90)) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var12 = ec.field_e.a(18);
                            if (var12 != null) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var9 = null;
                            ki.a(44, (String) null);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var7 = sc.a(var12.field_g, var12.field_h, 78, 0);
                            ki.a(-125, var7);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            ec.field_e = null;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        var5 = (Exception) (Object) caughtException;
                        kk.a("S1", (byte) 67, (Throwable) (Object) var5);
                        var10 = null;
                        ki.a(67, (String) null);
                        ec.field_e = null;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        if (var4 != 15) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        k.field_g = 10;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        if (var4 == 16) {
                            statePc = 76;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        return 1;
                    }
                    case 77: {
                        if (-18 == (var4 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        return 0;
                    }
                    case 79: {
                        return 2;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(int param0) {
        if (param0 != 19887) {
            this.f((byte) 17);
        }
        eg.field_k[1] = true;
    }

    protected bi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
