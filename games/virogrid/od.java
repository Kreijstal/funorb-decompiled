/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class od extends uk {
    private int field_r;
    static String[] field_n;
    String field_v;
    private int field_w;
    static String field_t;
    static int[] field_m;
    static String field_l;
    private int field_o;
    private boolean field_q;
    private int field_p;
    private long field_s;
    private int field_z;
    private boolean field_x;
    private boolean field_u;
    static km field_y;
    private int field_k;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        int var10 = -93 / ((2 - param7) / 60);
        var11.dispose();
        ((od) this).setBackground(java.awt.Color.black);
        ih.field_c = ((od) this).field_o;
        dg.a((byte) -53, ih.field_c);
        wg.a(ih.field_c, 5000, ((od) this).field_p, ((od) this).field_s, ei.field_c, ((od) this).field_x, 64, param6, 5000, ((od) this).field_r, param0, ((od) this).field_v, ((od) this).field_w, ((od) this).field_z);
        ch.a(((od) this).field_p, ei.field_c, ((od) this).field_z, param0, ((od) this).field_v, ih.field_c, 86, ((od) this).field_r, ((od) this).field_w);
        lb.a(42);
        sb.field_d = s.a((byte) -110);
        nn.a(fi.field_v, (byte) -128);
        ae.field_a = param1;
        ck.field_c = param2;
        ka.field_j = param5;
        ej.field_P = param3;
        te.field_h = param4;
        this.c((byte) 116);
        kn.g(20128);
    }

    private final void o(int param0) {
        di.field_r[13] = true;
        di.field_r[12] = true;
        di.field_r[11] = true;
    }

    private final void i(int param0) {
        String var2 = ti.a(-47);
        qk.a(var2, mb.g((byte) 24), -1);
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            int var5 = 0;
            Exception var6 = null;
            jc var7 = null;
            String var8 = null;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            Boolean var12 = null;
            Throwable decompiledCaughtException = null;
            var9 = Virogrid.field_F ? 1 : 0;
            var4 = cc.a(ih.field_c, og.field_b, false, param1);
            if (0 == var4) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (var4 == 1) {
                  L1: {
                    var5 = ii.a(hh.a(-30890), je.h(true), 27984);
                    if (-1 == var5) {
                      break L1;
                    } else {
                      al.a(ld.field_g, var5, jf.field_b, 100);
                      jf.field_b = null;
                      ld.field_g = null;
                      break L1;
                    }
                  }
                  var12 = fi.e(true);
                  if (var12 == null) {
                    break L0;
                  } else {
                    mj.a(0, var12.booleanValue());
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (var4 == 2) {
                  var5 = ld.a((byte) 2, ag.a(true), jl.a(-127), ne.a((byte) -52), eh.d(86), f.a(8), ((od) this).field_k);
                  if (-1 == var5) {
                    break L2;
                  } else {
                    fn.a(var5, 105, jf.field_b, ld.field_g);
                    jf.field_b = null;
                    ld.field_g = null;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 != 3) {
                  break L3;
                } else {
                  L4: {
                    if (nh.field_o == -1) {
                      break L4;
                    } else {
                      if (0 != nh.field_o) {
                        nh.field_o = -1;
                        rl.e(true);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param2) {
                    var5 = pa.a(f.a(8), false, ((od) this).field_k, (byte) -57, ((od) this).field_u, ne.a((byte) -52));
                    if (var5 == -1) {
                      break L3;
                    } else {
                      if (var5 != 0) {
                        a.a(ld.field_g, var5, false);
                        ld.field_g = null;
                        break L3;
                      } else {
                        ae.field_d = md.field_a;
                        sg.a(-2);
                        j.field_l = 10;
                        oi.field_d = false;
                        break L3;
                      }
                    }
                  } else {
                    ri.field_f = false;
                    break L3;
                  }
                }
              }
              L5: {
                if (4 == var4) {
                  if (!wg.field_c) {
                    j.field_l = 10;
                    oi.field_d = true;
                    break L5;
                  } else {
                    sd.a(5, mb.g((byte) -86));
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (5 == var4) {
                  ha.a((byte) 39, mb.g((byte) -117));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (!pg.field_h) {
                    break L7;
                  } else {
                    j.field_l = 10;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (var4 == 7) {
                  sf.a(true, mb.g((byte) 79));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                var5 = -46 / ((param0 - -49) / 63);
                if (var4 == 8) {
                  sd.a(5, mb.g((byte) 48));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 == 9) {
                  oa.a(mb.g((byte) -107), 0);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 == 10) {
                  gk.field_g.g(17, 8);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 != 11) {
                  break L12;
                } else {
                  dc.a(-11670, mb.g((byte) -103));
                  break L12;
                }
              }
              L13: {
                if (12 == var4) {
                  pi.a(pg.a(-1), -17713, mb.g((byte) 8));
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (var4 != 13) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (nb.field_p != null) {
                          break L16;
                        } else {
                          nb.field_p = new og(ei.field_c, new java.net.URL(((od) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (nb.field_p.a(5038)) {
                          L18: {
                            var7 = nb.field_p.d(18240);
                            if (var7 == null) {
                              var10 = null;
                              kd.a((byte) 92, (String) null);
                              break L18;
                            } else {
                              var8 = nf.a(var7.field_l, (byte) -122, 0, var7.field_g);
                              kd.a((byte) 78, var8);
                              break L18;
                            }
                          }
                          nb.field_p = null;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      en.a("S1", (Throwable) (Object) var6, 1);
                      var11 = null;
                      kd.a((byte) -114, (String) null);
                      nb.field_p = null;
                      break L19;
                    }
                  }
                  break L14;
                }
              }
              L20: {
                if (var4 == 15) {
                  j.field_l = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (var4 != 17) {
                  return 0;
                } else {
                  return 2;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, int param1, String param2, int param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          try {
            if (!((od) this).a((byte) 99)) {
              return;
            } else {
              L0: {
                L1: {
                  ((od) this).field_v = ((od) this).getCodeBase().getHost();
                  var6_ref2 = ((od) this).field_v.toLowerCase();
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!var6_ref2.endsWith(".jagex.com")) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L0;
                    } else {
                      stackOut_5_0 = this;
                      stackIn_6_0 = stackOut_5_0;
                      break L1;
                    }
                  }
                }
                stackOut_6_0 = this;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L0;
              }
              L2: {
                ((od) this).field_u = stackIn_8_1 != 0;
                ((od) this).field_w = Integer.parseInt(((od) this).getParameter("gameport1"));
                ((od) this).field_z = Integer.parseInt(((od) this).getParameter("gameport2"));
                var7 = ((od) this).getParameter("servernum");
                if (var7 != null) {
                  ((od) this).field_r = Integer.parseInt(var7);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                ((od) this).field_p = Integer.parseInt(((od) this).getParameter("gamecrc"));
                ((od) this).field_s = Long.parseLong(((od) this).getParameter("instanceid"));
                ((od) this).field_x = ((od) this).getParameter("member").equals((Object) (Object) "yes");
                var8 = ((od) this).getParameter("lang");
                if (var8 != null) {
                  ((od) this).field_o = Integer.parseInt(var8);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (((od) this).field_o < 5) {
                  break L4;
                } else {
                  ((od) this).field_o = 0;
                  break L4;
                }
              }
              L5: {
                var9 = ((od) this).getParameter("affid");
                if (var9 == null) {
                  break L5;
                } else {
                  ((od) this).field_k = Integer.parseInt(var9);
                  break L5;
                }
              }
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            var10 = null;
            en.a((String) null, (Throwable) (Object) var6, 1);
            ((od) this).a(-25296, "crash");
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6_ref;
            stackOut_22_1 = new StringBuilder().append("od.CA(").append(480).append(',').append(0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param3 + ',' + 640 + ')');
        }
    }

    private final int j(int param0) {
        int var2 = 0;
        if (!((od) this).field_i) {
          if (!eg.b((byte) -107)) {
            return -1;
          } else {
            if (ri.field_f) {
              return -1;
            } else {
              var2 = pa.a(f.a(8), true, ((od) this).field_k, (byte) -57, ((od) this).field_u, ne.a((byte) -52));
              if (-1 == var2) {
                return -1;
              } else {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (var2 == 1) {
                      break L0;
                    } else {
                      L1: {
                        if (!oc.field_l) {
                          ((od) this).a(-25296, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      ve.c((byte) -105);
                      a.a(ld.field_g, var2, false);
                      ri.field_f = true;
                      hc.field_a = hc.a(-9986) + 15000L;
                      return var2;
                    }
                  }
                }
                L2: {
                  if (11 != j.field_l) {
                    break L2;
                  } else {
                    if (nh.field_o != 0) {
                      break L2;
                    } else {
                      sg.a(-2);
                      break L2;
                    }
                  }
                }
                return var2;
              }
            }
          }
        } else {
          return -1;
        }
    }

    private final void c(byte param0) {
        jc.field_i[7] = -1;
        jc.field_i[4] = -1;
        jc.field_i[16] = -1;
        jc.field_i[8] = -2;
        jc.field_i[2] = -2;
        jc.field_i[12] = -1;
        jc.field_i[9] = -1;
        jc.field_i[5] = -1;
        jc.field_i[13] = -1;
        jc.field_i[18] = 1;
        jc.field_i[6] = -2;
        jc.field_i[3] = -1;
        jc.field_i[17] = -1;
        jc.field_i[10] = -1;
        jc.field_i[11] = -1;
        jc.field_i[1] = 16;
    }

    private final void l(int param0) {
        di.field_r[2] = true;
    }

    final void a(String param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(480, 0, param0, param1, 640);
              if (param2 >= 99) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("od.NA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int g(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = this.j(80);
            if (var2 == param0) {
              break L1;
            } else {
              if (1 == var2) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (di.field_r[1]) {
              mi.a(2, 12);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!di.field_r[2]) {
              break L3;
            } else {
              o.a(3, (byte) 109);
              break L3;
            }
          }
          L4: {
            if (!di.field_r[3]) {
              break L4;
            } else {
              pj.a(4, param0 + -11513);
              break L4;
            }
          }
          L5: {
            if (!di.field_r[4]) {
              break L5;
            } else {
              dj.a(2, 5);
              break L5;
            }
          }
          L6: {
            if (di.field_r[5]) {
              ne.a((byte) 19, 6);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (di.field_r[6]) {
              kl.a((byte) -52, 7);
              break L7;
            } else {
              break L7;
            }
          }
          if (!di.field_r[8]) {
            break L0;
          } else {
            ti.c(param0 ^ -128);
            break L0;
          }
        }
        return var2;
    }

    private final void k(int param0) {
        di.field_r[5] = true;
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        String stackIn_106_0 = null;
        String stackIn_107_0 = null;
        String stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        String stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        String stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        String stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int stackIn_140_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        String stackOut_105_0 = null;
        String stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        String stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        String stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        String stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        String stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        int stackOut_139_0 = 0;
        int stackOut_138_0 = 0;
        L0: {
          var5 = Virogrid.field_F ? 1 : 0;
          if (kk.field_q != null) {
            L1: {
              if (null != ih.field_b) {
                break L1;
              } else {
                var6 = bf.a(0);
                var4 = var6.getSize();
                kk.field_q.a(var4.width, var4.height, (byte) -107);
                break L1;
              }
            }
            kk.field_q.b(-7927);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          th.b((byte) 112);
          vc.h((byte) -47);
          if (j.a(-1)) {
            break L2;
          } else {
            if (j.field_l != 11) {
              vj.a((byte) -119);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != sb.field_d) {
            og.field_b = sb.field_d.a(-23273);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!wl.b((byte) -70)) {
            break L4;
          } else {
            L5: {
              var3 = 1200 * wh.a((byte) 5);
              if (((od) this).field_q) {
                break L5;
              } else {
                if (lj.c(-28791807) <= var3) {
                  break L4;
                } else {
                  if (km.e(-87) <= var3) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((od) this).field_q = false;
            tn.a(false);
            ve.c((byte) -50);
            a.a(je.field_H, 2, false);
            sa.a(-76);
            ri.field_f = true;
            hc.field_a = 15000L + hc.a(-9986);
            break L4;
          }
        }
        L6: {
          L7: {
            if (-1 == nh.field_o) {
              break L7;
            } else {
              if (nh.field_o != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (nh.field_o != -1) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_24_0;
            nh.field_o = m.b(true);
            if (var3 == 0) {
              break L9;
            } else {
              if (nh.field_o == 0) {
                if (j.field_l != 11) {
                  break L9;
                } else {
                  if (!eg.b((byte) -81)) {
                    sg.a(-2);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (nh.field_o == -1) {
            break L6;
          } else {
            if (0 != nh.field_o) {
              hc.field_a = 15000L + hc.a(-9986);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (param1 >= 32) {
            break L10;
          } else {
            ((od) this).field_w = 59;
            break L10;
          }
        }
        L11: {
          if (nh.field_o == -1) {
            break L11;
          } else {
            if (nh.field_o != 0) {
              if (10 > dj.field_n) {
                if (nh.field_o != 3) {
                  if (nh.field_o != 4) {
                    if (nh.field_o == 2) {
                      ((od) this).a(-25296, "js5connect_full");
                      break L11;
                    } else {
                      if (nh.field_o == 5) {
                        ((od) this).a(-25296, "outofdate");
                        break L11;
                      } else {
                        ((od) this).a(-25296, "js5connect");
                        break L11;
                      }
                    }
                  } else {
                    ((od) this).a(-25296, "js5io");
                    break L11;
                  }
                } else {
                  ((od) this).a(-25296, "js5crc");
                  break L11;
                }
              } else {
                if (j.field_l >= 10) {
                  L12: {
                    ve.c((byte) 90);
                    if (nh.field_o != 3) {
                      if (4 == nh.field_o) {
                        a.a(i.field_v, 256, false);
                        break L12;
                      } else {
                        if (2 == nh.field_o) {
                          a.a(gb.field_L, 256, false);
                          break L12;
                        } else {
                          if (nh.field_o != 5) {
                            a.a(li.field_b, 256, false);
                            break L12;
                          } else {
                            a.a(bm.field_g, 5, false);
                            break L12;
                          }
                        }
                      }
                    } else {
                      a.a(sj.field_k, 256, false);
                      break L12;
                    }
                  }
                  ri.field_f = true;
                  break L11;
                } else {
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
              if (-1 == nh.field_o) {
                break L15;
              } else {
                if (nh.field_o != 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (eg.b((byte) -79)) {
              break L14;
            } else {
              break L13;
            }
          }
          if (~hc.field_a >= ~hc.a(-9986)) {
            ri.field_f = false;
            if (nh.field_o == -1) {
              break L13;
            } else {
              if (0 != nh.field_o) {
                nh.field_o = -1;
                rl.e(true);
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
          if (0 != nh.field_o) {
            break L16;
          } else {
            if (!eg.b((byte) -82)) {
              j.field_g = false;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if (dj.field_n == 0) {
            if (ga.h(-20940)) {
              dj.field_n = 1;
              break L17;
            } else {
              break L17;
            }
          } else {
            break L17;
          }
        }
        L18: {
          if (dj.field_n != 1) {
            break L18;
          } else {
            L19: {
              if (0 == ih.field_c) {
                break L19;
              } else {
                sj.field_l = p.a(76, ej.field_P);
                break L19;
              }
            }
            td.field_a = qd.a(false, 1, true, ka.field_j, (byte) 70);
            jf.field_j = qd.a(false, 1, true, te.field_h, (byte) 81);
            qn.field_I = qd.a(false, 1, true, ae.field_a, (byte) 82);
            s.field_a = jf.field_j;
            dj.field_n = 2;
            ge.field_c = td.field_a;
            break L18;
          }
        }
        L20: {
          if (dj.field_n == 2) {
            L21: {
              if (sj.field_l != null) {
                if (sj.field_l.c(0)) {
                  if (!sj.field_l.a("", true)) {
                    sj.field_l = null;
                    break L21;
                  } else {
                    if (!sj.field_l.a((byte) -102, "")) {
                      break L21;
                    } else {
                      lb.a(-1, sj.field_l);
                      sj.field_l = null;
                      sb.a(-122);
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
            if (null != sj.field_l) {
              break L20;
            } else {
              dj.field_n = 3;
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if (dj.field_n != 3) {
            break L22;
          } else {
            if (!ln.a((byte) 127, jf.field_j, td.field_a, qn.field_I)) {
              break L22;
            } else {
              if (i.a((byte) 110, qn.field_I)) {
                L23: {
                  L24: {
                    ci.c((byte) 45);
                    ba.b(14);
                    ne.field_g = ul.field_e;
                    pg.field_h = false;
                    jf.a(wg.field_c, jf.field_j, td.field_a, qn.field_I, -1);
                    if (af.field_b) {
                      break L24;
                    } else {
                      if (ad.field_j != null) {
                        break L24;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L25: {
                    stackOut_105_0 = ad.field_j;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_106_0 = stackOut_105_0;
                    if (af.field_b) {
                      stackOut_107_0 = (String) (Object) stackIn_107_0;
                      stackOut_107_1 = 0;
                      stackIn_108_0 = stackOut_107_0;
                      stackIn_108_1 = stackOut_107_1;
                      break L25;
                    } else {
                      stackOut_106_0 = (String) (Object) stackIn_106_0;
                      stackOut_106_1 = 1;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_108_0 = (String) (Object) stackIn_108_0;
                    stackOut_108_1 = stackIn_108_1;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_110_1 = stackOut_108_1;
                    stackIn_109_0 = stackOut_108_0;
                    stackIn_109_1 = stackOut_108_1;
                    if (af.field_b) {
                      stackOut_110_0 = (String) (Object) stackIn_110_0;
                      stackOut_110_1 = stackIn_110_1;
                      stackOut_110_2 = 0;
                      stackIn_111_0 = stackOut_110_0;
                      stackIn_111_1 = stackOut_110_1;
                      stackIn_111_2 = stackOut_110_2;
                      break L26;
                    } else {
                      stackOut_109_0 = (String) (Object) stackIn_109_0;
                      stackOut_109_1 = stackIn_109_1;
                      stackOut_109_2 = 1;
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_111_1 = stackOut_109_1;
                      stackIn_111_2 = stackOut_109_2;
                      break L26;
                    }
                  }
                  mi.a(stackIn_111_0, stackIn_111_1 != 0, stackIn_111_2 != 0, true);
                  break L23;
                }
                L27: {
                  if (!li.field_i) {
                    break L27;
                  } else {
                    jk.a(-26700);
                    break L27;
                  }
                }
                L28: {
                  if (em.field_a != null) {
                    break L28;
                  } else {
                    em.field_a = hm.a(-94);
                    td.field_f = wd.a((byte) 88);
                    break L28;
                  }
                }
                ig.a(false, em.field_a, qn.field_I, td.field_f);
                td.field_a = null;
                jf.field_j = null;
                qn.field_I = null;
                nl.a((java.applet.Applet) this, 17574);
                sb.a(-78);
                dj.field_n = 10;
                break L22;
              } else {
                break L22;
              }
            }
          }
        }
        L29: {
          if (10 == dj.field_n) {
            L30: {
              if (ih.field_c != 0) {
                uh.field_e = p.a(34, ck.field_c);
                break L30;
              } else {
                break L30;
              }
            }
            dj.field_n = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if (dj.field_n == 11) {
            L32: {
              if (null == uh.field_e) {
                break L32;
              } else {
                L33: {
                  if (!uh.field_e.c(0)) {
                    break L33;
                  } else {
                    if (uh.field_e.b(25867)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                al.a(db.a(uh.field_e, jd.field_b, (byte) -90, aa.field_d), 13, 0.0f);
                break L31;
              }
            }
            i.field_w = true;
            dj.field_n = 12;
            break L31;
          } else {
            break L31;
          }
        }
        L34: {
          if (dj.field_n != 12) {
            break L34;
          } else {
            if (i.field_w) {
              break L34;
            } else {
              dj.field_n = 13;
              break L34;
            }
          }
        }
        L35: {
          if (13 == dj.field_n) {
            L36: {
              var3 = 1;
              if (lb.field_c == null) {
                break L36;
              } else {
                L37: {
                  if (!lb.field_c.a(true)) {
                    stackOut_139_0 = 0;
                    stackIn_140_0 = stackOut_139_0;
                    break L37;
                  } else {
                    stackOut_138_0 = 1;
                    stackIn_140_0 = stackOut_138_0;
                    break L37;
                  }
                }
                var3 = stackIn_140_0;
                al.a(lb.field_c.field_j, 13, lb.field_c.field_a);
                break L36;
              }
            }
            if (var3 != 0) {
              dj.field_n = 20;
              break L35;
            } else {
              break L35;
            }
          } else {
            break L35;
          }
        }
        L38: {
          if (param0) {
            break L38;
          } else {
            if (km.field_Db) {
              af.a((byte) -116, fi.field_v);
              ((od) this).e(21616);
              nn.a(fi.field_v, (byte) -124);
              break L38;
            } else {
              break L38;
            }
          }
        }
        L39: {
          if (di.field_r[8]) {
            rc.c(-1);
            break L39;
          } else {
            break L39;
          }
        }
    }

    private final void d(byte param0) {
        di.field_r[6] = true;
    }

    final static void a(pd param0, Object param1, byte param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_w) {
              L1: {
                var3_int = 0;
                if (param2 <= -95) {
                  break L1;
                } else {
                  field_t = null;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  if (var3_int >= 50) {
                    break L3;
                  } else {
                    if (null == param0.field_w.peekEvent()) {
                      break L3;
                    } else {
                      mm.a(-118, 1L);
                      var3_int++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    L5: {
                      if (param1 != null) {
                        param0.field_w.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("od.HA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          L8: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ')');
        }
    }

    private final void p(int param0) {
        di.field_r[1] = true;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        la.field_k = param0;
        if (param2) {
            Object var5 = null;
            od.a((pd) null, (Object) null, (byte) -5);
        }
        sf.field_I = param3;
        na.field_Hb = param1;
    }

    private final void b(byte param0) {
        di.field_r[4] = true;
    }

    final void m(int param0) {
        int var3 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          var3 = Virogrid.field_F ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            od.a(36, 8, true, 93);
            break L0;
          }
        }
        L1: {
          if (me.b(param0 ^ 102)) {
            L2: {
              stackOut_9_0 = this;
              stackOut_9_1 = 30;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              if (null == ih.field_b) {
                stackOut_11_0 = this;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                break L2;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                break L2;
              }
            }
            int discarded$92 = this.a(stackIn_12_1, stackIn_12_2 != 0, false);
            break L1;
          } else {
            if (dj.field_n < 10) {
              break L1;
            } else {
              if (nm.c(2)) {
                if (j.field_l != 0) {
                  jb.a(og.field_b, 45);
                  break L1;
                } else {
                  int discarded$93 = this.a(-118, false, false);
                  break L1;
                }
              } else {
                ee.a(true);
                break L1;
              }
            }
          }
        }
    }

    private final void h(int param0) {
        int var2 = sh.field_qb.g(11132);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = ba.field_a - 1;
        byte[] var5 = new byte[var4];
        sh.field_qb.a(-121, 0, var5, var4);
        eh.a(i.a(-2022, var5), mb.g((byte) -95), (byte) -25, var3 != 0);
    }

    final int c(boolean param0, int param1) {
        int var3 = -78 / ((param1 - -20) / 63);
        return this.a(-114, param0, true);
    }

    final void n(int param0) {
        int var2 = 0;
        cj var3 = null;
        int var4 = 0;
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          var2 = ci.field_q;
          if (var2 >= 64) {
            break L0;
          } else {
            if (di.field_r[var2]) {
              if (param0 < -100) {
                if (var2 != 0) {
                  L1: {
                    if (var2 != 1) {
                      if (var2 != 2) {
                        if (var2 == 3) {
                          ob.a((byte) 97);
                          break L1;
                        } else {
                          if (var2 != 4) {
                            if (var2 == 5) {
                              fb.a(26360);
                              break L1;
                            } else {
                              if (var2 == 6) {
                                pe.a(-1);
                                break L1;
                              } else {
                                if (var2 != 7) {
                                  if (8 != var2) {
                                    if (16 == var2) {
                                      mb.i((byte) 115);
                                      break L1;
                                    } else {
                                      L2: {
                                        if (var2 == 11) {
                                          break L2;
                                        } else {
                                          if (var2 != 12) {
                                            if (13 == var2) {
                                              ri.a((byte) 126);
                                              break L1;
                                            } else {
                                              if (var2 != 17) {
                                                if (18 == var2) {
                                                  he.i(-532);
                                                  break L1;
                                                } else {
                                                  en.a("MGS1: " + rg.a(true), (Throwable) null, 1);
                                                  tn.a(false);
                                                  break L1;
                                                }
                                              } else {
                                                this.h(-6731);
                                                break L1;
                                              }
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                      L3: {
                                        if (var2 != 12) {
                                          stackOut_27_0 = 0;
                                          stackIn_28_0 = stackOut_27_0;
                                          break L3;
                                        } else {
                                          stackOut_26_0 = 1;
                                          stackIn_28_0 = stackOut_26_0;
                                          break L3;
                                        }
                                      }
                                      var3 = el.a(stackIn_28_0 != 0, 0);
                                      cf.a(var3, (byte) 78);
                                      break L1;
                                    }
                                  } else {
                                    ln.a(84, ba.field_a, ei.field_c, (jc) (Object) sh.field_qb);
                                    break L1;
                                  }
                                } else {
                                  this.i(-50);
                                  break L1;
                                }
                              }
                            }
                          } else {
                            sb.a((byte) -61);
                            break L1;
                          }
                        }
                      } else {
                        km.d((byte) 76);
                        break L1;
                      }
                    } else {
                      el.e(-2);
                      break L1;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        en.a("MGS2: " + rg.a(true), (Throwable) null, 1);
        tn.a(false);
    }

    public static void d(boolean param0) {
        field_t = null;
        field_m = null;
        field_l = null;
        field_n = null;
        field_y = null;
    }

    final static String b(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_4_0 = new String(var3);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3[-1 + var2_int - var4] = param1.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("od.KA(").append(0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    private final void b(boolean param0, int param1) {
        di.field_r[3] = true;
        di.field_r[0] = true;
        di.field_r[8] = true;
        di.field_r[18] = true;
        di.field_r[7] = true;
        di.field_r[17] = true;
        di.field_r[16] = true;
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.b(true, 53);
        if (param2 >= -115) {
            ((od) this).field_p = 9;
        }
        if (param0) {
            this.p(102);
        }
        if (!(!param6)) {
            this.l(25745);
        }
        if (!(!param5)) {
            this.b((byte) 12);
        }
        if (param4) {
            this.k(116);
        }
        if (param1) {
            this.d((byte) 113);
        }
        if (!(!param3)) {
            this.o(12);
        }
    }

    protected od() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_t = "This entry doesn't match";
        field_m = new int[4];
        field_l = null;
    }
}
