/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ct extends vb {
    private int field_F;
    static gu field_t;
    private int field_E;
    private int field_y;
    private int field_s;
    private boolean field_q;
    private boolean field_r;
    private int field_D;
    private int field_u;
    String field_w;
    private long field_z;
    static ej field_H;
    static String field_C;
    static int[] field_v;
    static float field_I;
    static int field_x;
    private boolean field_A;
    static int field_B;

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            rb var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = AceOfSkies.field_G ? 1 : 0;
            var4 = b.a(nh.field_e, (byte) 72, param1, fb.field_e);
            if (var4 != 0) {
              L0: {
                if (var4 == 1) {
                  L1: {
                    int discarded$7 = -46;
                    int discarded$8 = 123;
                    var5_int = bb.a(gt.a(), (byte) 127, ju.e());
                    if (-1 != var5_int) {
                      gt.a(123, rp.field_m, var5_int, sd.field_j);
                      rp.field_m = null;
                      sd.field_j = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var11 = ct.h(122);
                  if (var11 != null) {
                    qf.a((byte) 77, var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (var4 != 2) {
                  break L2;
                } else {
                  int discarded$9 = -3;
                  int discarded$10 = -25752;
                  int discarded$11 = 0;
                  var5_int = mj.a(la.a(4), 3, ((ct) this).field_E, ve.a(true), ce.g(), sa.b(), of.a());
                  if (-1 == var5_int) {
                    break L2;
                  } else {
                    pp.a(sd.field_j, var5_int, rp.field_m, 26326);
                    sd.field_j = null;
                    rp.field_m = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (var4 == 3) {
                  L4: {
                    if (-1 == sk.field_a) {
                      break L4;
                    } else {
                      if (0 == sk.field_a) {
                        break L4;
                      } else {
                        sk.field_a = -1;
                        wj.e(104);
                        break L4;
                      }
                    }
                  }
                  if (param2) {
                    vs.field_f = false;
                    break L3;
                  } else {
                    int discarded$12 = -25752;
                    var5_int = pi.a(((ct) this).field_E, la.a(4), 0, ((ct) this).field_r, sa.b(), false);
                    if (var5_int == -1) {
                      break L3;
                    } else {
                      if (0 != var5_int) {
                        li.a(126, var5_int, rp.field_m);
                        rp.field_m = null;
                        break L3;
                      } else {
                        dl.field_o = as.field_b;
                        um.d(1);
                        ob.field_d = 10;
                        ks.field_b = false;
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (4 == var4) {
                  if (!te.field_h) {
                    ob.field_d = 10;
                    ks.field_b = true;
                    break L5;
                  } else {
                    la.a(true, bm.m(117));
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 == 5) {
                  rr.a((byte) -96, bm.m(119));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (6 == var4) {
                  if (!nq.field_a) {
                    break L7;
                  } else {
                    ob.field_d = 10;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (var4 == 7) {
                  int discarded$13 = -104;
                  po.a(bm.m(125));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var4 == 8) {
                  la.a(true, bm.m(122));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 == 9) {
                  lb.a(61, bm.m(127));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  q.field_p.g(100, 17);
                  break L11;
                }
              }
              L12: {
                if (var4 == 11) {
                  jn.a((byte) 124, bm.m(107));
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var4 == 12) {
                  vi.a((byte) 103, kb.a(-1903710079), bm.m(107));
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
                        if (null == hb.field_a) {
                          hb.field_a = new cc(pt.field_b, new java.net.URL(((ct) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (!hb.field_a.a((byte) 118)) {
                          break L17;
                        } else {
                          L18: {
                            var12 = hb.field_a.a(true);
                            if (var12 != null) {
                              var7 = hf.a(65, var12.field_g, 0, var12.field_f);
                              hp.a((byte) -121, var7);
                              break L18;
                            } else {
                              var9 = null;
                              hp.a((byte) -117, (String) null);
                              break L18;
                            }
                          }
                          hb.field_a = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      v.a("S1", (byte) -52, (Throwable) (Object) var5);
                      var10 = null;
                      hp.a((byte) -112, (String) null);
                      hb.field_a = null;
                      break L19;
                    }
                  }
                  break L14;
                }
              }
              L20: {
                if (15 != var4) {
                  break L20;
                } else {
                  ob.field_d = 10;
                  break L20;
                }
              }
              if (var4 != 16) {
                if (var4 == 17) {
                  return 2;
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            } else {
              throw new IllegalStateException();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, String param1, int param2) {
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
              int discarded$2 = 480;
              this.a(640, true, param1, param2);
              if (param0 == -60) {
                break L1;
              } else {
                ((ct) this).field_z = -63L;
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
            stackOut_3_1 = new StringBuilder().append("ct.JA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 41);
        }
    }

    private final void e(byte param0) {
        int discarded$0 = 111;
        String var2 = pl.b();
        rr.a(var2, (byte) -108, bm.m(108));
        int var3 = 64 % ((56 - param0) / 61);
    }

    final void i(int param0) {
        int var3 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 4) {
          return;
        } else {
          L0: {
            if (!jr.a((byte) 32)) {
              if (bl.field_c >= 10) {
                int discarded$3 = -5;
                if (uk.a()) {
                  if (ob.field_d == 0) {
                    int discarded$4 = this.a(8, false, false);
                    break L0;
                  } else {
                    ic.a(nh.field_e, false);
                    break L0;
                  }
                } else {
                  rp.b(param0 + -3);
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              L1: {
                stackOut_2_0 = this;
                stackOut_2_1 = 8;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (null == jf.field_a) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L1;
                }
              }
              int discarded$5 = this.a(stackIn_5_1, stackIn_5_2 != 0, false);
              break L0;
            }
          }
          return;
        }
    }

    private final void a(int param0, boolean param1, String param2, int param3) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          try {
            L0: {
              if (((ct) this).b(true)) {
                L1: {
                  L2: {
                    ((ct) this).field_w = ((ct) this).getCodeBase().getHost();
                    var6_ref2 = ((ct) this).field_w.toLowerCase();
                    stackOut_2_0 = this;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L1;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
                L3: {
                  ((ct) this).field_r = stackIn_7_1 != 0;
                  ((ct) this).field_y = Integer.parseInt(((ct) this).getParameter("gameport1"));
                  ((ct) this).field_F = Integer.parseInt(((ct) this).getParameter("gameport2"));
                  var7 = ((ct) this).getParameter("servernum");
                  if (var7 == null) {
                    break L3;
                  } else {
                    ((ct) this).field_s = Integer.parseInt(var7);
                    break L3;
                  }
                }
                L4: {
                  ((ct) this).field_u = Integer.parseInt(((ct) this).getParameter("gamecrc"));
                  ((ct) this).field_z = Long.parseLong(((ct) this).getParameter("instanceid"));
                  ((ct) this).field_A = ((ct) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((ct) this).getParameter("lang");
                  if (var8 == null) {
                    break L4;
                  } else {
                    ((ct) this).field_D = Integer.parseInt(var8);
                    break L4;
                  }
                }
                L5: {
                  if (((ct) this).field_D >= 5) {
                    ((ct) this).field_D = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var9 = ((ct) this).getParameter("affid");
                  if (var9 != null) {
                    ((ct) this).field_E = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                qr.field_b = Boolean.valueOf(((ct) this).getParameter("simplemode")).booleanValue();
                ((ct) this).a(640, 0, param3, param2, ((ct) this).field_u, 480, 32);
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              v.a((String) null, (byte) -52, (Throwable) (Object) var6);
              ((ct) this).a(-107, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6_ref;
            stackOut_21_1 = new StringBuilder().append("ct.K(").append(640).append(44).append(1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param3 + 44 + 480 + 41);
        }
    }

    private final void n() {
        ho.field_d[12] = -1;
        ho.field_d[13] = -1;
        ho.field_d[5] = -1;
        ho.field_d[18] = 1;
        ho.field_d[8] = -2;
        ho.field_d[4] = -1;
        ho.field_d[11] = -1;
        ho.field_d[16] = -1;
        ho.field_d[17] = -1;
        ho.field_d[3] = -1;
        ho.field_d[10] = -1;
        ho.field_d[7] = -1;
        ho.field_d[6] = -2;
        ho.field_d[2] = -2;
        ho.field_d[1] = 16;
        ho.field_d[9] = -1;
    }

    final int a(boolean param0, int param1) {
        if (param1 > -21) {
            this.a(20, true);
        }
        return this.a(8, param0, true);
    }

    final int p(int param0) {
        int var2 = 0;
        int discarded$7 = -76;
        var2 = this.j();
        if (param0 != 16637) {
          return -117;
        } else {
          L0: {
            L1: {
              if (var2 == 0) {
                break L1;
              } else {
                if (1 != var2) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!fh.field_e[1]) {
                break L2;
              } else {
                int discarded$8 = 2;
                int discarded$9 = -117;
                io.a();
                break L2;
              }
            }
            L3: {
              if (!fh.field_e[2]) {
                break L3;
              } else {
                int discarded$10 = 0;
                int discarded$11 = 3;
                pl.c();
                break L3;
              }
            }
            L4: {
              if (!fh.field_e[3]) {
                break L4;
              } else {
                so.a(4, (byte) -39);
                break L4;
              }
            }
            L5: {
              if (fh.field_e[4]) {
                eq.a((byte) 123, 5);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (fh.field_e[5]) {
                tt.a(6, 2048);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (!fh.field_e[6]) {
                break L7;
              } else {
                int discarded$12 = 7;
                int discarded$13 = 84;
                mj.a();
                break L7;
              }
            }
            if (!fh.field_e[8]) {
              break L0;
            } else {
              qs.a(-72);
              break L0;
            }
          }
          return var2;
        }
    }

    private final void m(int param0) {
        int var2 = 98 % ((-68 - param0) / 54);
        fh.field_e[1] = true;
    }

    private final void g() {
        int var2 = 0;
        fh.field_e[4] = true;
    }

    private final void k() {
        int var2 = nm.field_c.g(-53);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + ag.field_s;
        byte[] var5 = new byte[var4];
        nm.field_c.a(var5, var4, 0, false);
        wc.a(ea.a(0, var5), bm.m(125), 14301, var3 != 0);
    }

    private final int j() {
        int var2 = 0;
        if (((ct) this).field_e) {
          return -1;
        } else {
          if (!dg.j(27711)) {
            return -1;
          } else {
            if (vs.field_f) {
              return -1;
            } else {
              int discarded$2 = -25752;
              var2 = pi.a(((ct) this).field_E, la.a(4), 0, ((ct) this).field_r, sa.b(), true);
              if (var2 != -1) {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (var2 == 1) {
                      break L0;
                    } else {
                      L1: {
                        if (!v.field_a) {
                          ((ct) this).a(-103, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      rc.c((byte) 124);
                      li.a(-2, var2, rp.field_m);
                      vs.field_f = true;
                      wg.field_b = kh.a(-76) - -15000L;
                      return var2;
                    }
                  }
                }
                L2: {
                  if (ob.field_d != 11) {
                    break L2;
                  } else {
                    if (sk.field_a == 0) {
                      um.d(1);
                      break L2;
                    } else {
                      break L2;
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

    private final void a(int param0, boolean param1) {
        fh.field_e[8] = param1;
        fh.field_e[17] = true;
        fh.field_e[0] = true;
        fh.field_e[3] = true;
        fh.field_e[18] = true;
        if (param0 != -16342) {
          return;
        } else {
          fh.field_e[16] = true;
          fh.field_e[7] = true;
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ct) this).setBackground(java.awt.Color.black);
        if (param6 != 12) {
            int discarded$0 = ((ct) this).a(false, -10);
        }
        fb.field_e = ((ct) this).field_D;
        qm.a(fb.field_e, (byte) -44);
        ka.a(-31808, ((ct) this).field_z, ((ct) this).field_w, 5000, ((ct) this).field_F, false, ((ct) this).field_A, 5000, fb.field_e, ((ct) this).field_s, ((ct) this).field_y, ((ct) this).field_u, pt.field_b, param2);
        hh.a(((ct) this).field_F, ((ct) this).field_w, ((ct) this).field_y, param2, (byte) -36, pt.field_b, fb.field_e, ((ct) this).field_u, ((ct) this).field_s);
        du.k(-128);
        jd.field_c = qj.g(param6 + 8180);
        cd.a(ci.field_f, 42);
        hf.field_r = param0;
        ks.field_a = param7;
        ju.field_m = param5;
        mb.field_q = param3;
        uk.field_e = param4;
        int discarded$1 = -1;
        this.n();
        int discarded$2 = 34;
        qj.h();
    }

    private final static Boolean h(int param0) {
        Boolean var1 = qj.field_r;
        if (param0 < 109) {
            Boolean discarded$0 = ct.h(-116);
        }
        qj.field_r = null;
        return var1;
    }

    final void b(boolean param0, byte param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        String stackIn_101_1 = null;
        int stackIn_102_0 = 0;
        String stackIn_102_1 = null;
        int stackIn_103_0 = 0;
        String stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_134_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_100_0 = 0;
        String stackOut_100_1 = null;
        int stackOut_102_0 = 0;
        String stackOut_102_1 = null;
        int stackOut_102_2 = 0;
        int stackOut_101_0 = 0;
        String stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        L0: {
          var5 = AceOfSkies.field_G ? 1 : 0;
          if (aj.field_s != null) {
            L1: {
              if (jf.field_a != null) {
                break L1;
              } else {
                int discarded$13 = 127;
                var6 = nk.b();
                var4 = var6.getSize();
                aj.field_s.a(0, var4.width, var4.height);
                break L1;
              }
            }
            aj.field_s.b(59);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          int discarded$14 = 0;
          kc.a();
          fb.a(92);
          if (im.a(true)) {
            break L2;
          } else {
            if (ob.field_d == 11) {
              break L2;
            } else {
              int discarded$15 = 125;
              mb.c();
              break L2;
            }
          }
        }
        L3: {
          if (null != jd.field_c) {
            nh.field_e = jd.field_c.b(12);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (tg.a(-128)) {
            L5: {
              var3 = bl.a(101) * 1200;
              if (((ct) this).field_q) {
                break L5;
              } else {
                if (~var3 <= ~fb.b(0)) {
                  break L4;
                } else {
                  int discarded$16 = -37;
                  if (~ro.c() >= ~var3) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ct) this).field_q = false;
            int discarded$17 = 1;
            te.b();
            rc.c((byte) -110);
            li.a(11, 2, oi.field_b);
            np.b(34066);
            vs.field_f = true;
            wg.field_b = 15000L + kh.a(-105);
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (sk.field_a == -1) {
              break L7;
            } else {
              if (sk.field_a != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (sk.field_a != -1) {
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
            int discarded$18 = 0;
            sk.field_a = lb.a();
            if (var3 == 0) {
              break L9;
            } else {
              if (0 != sk.field_a) {
                break L9;
              } else {
                if (ob.field_d != 11) {
                  break L9;
                } else {
                  if (dg.j(27711)) {
                    break L9;
                  } else {
                    um.d(1);
                    break L9;
                  }
                }
              }
            }
          }
          if (sk.field_a == -1) {
            break L6;
          } else {
            if (sk.field_a == 0) {
              break L6;
            } else {
              wg.field_b = 15000L + kh.a(-100);
              break L6;
            }
          }
        }
        L10: {
          if (sk.field_a == -1) {
            break L10;
          } else {
            if (sk.field_a == 0) {
              break L10;
            } else {
              if (bl.field_c >= 10) {
                if (ob.field_d >= 10) {
                  L11: {
                    rc.c((byte) 122);
                    if (sk.field_a != 3) {
                      if (sk.field_a != 4) {
                        if (sk.field_a == 2) {
                          li.a(116, 256, eu.field_k);
                          break L11;
                        } else {
                          if (sk.field_a == 5) {
                            li.a(-102, 5, ut.field_b);
                            break L11;
                          } else {
                            li.a(-71, 256, rt.field_g);
                            break L11;
                          }
                        }
                      } else {
                        li.a(6, 256, vi.field_n);
                        break L11;
                      }
                    } else {
                      li.a(122, 256, fh.field_f);
                      break L11;
                    }
                  }
                  vs.field_f = true;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                if (sk.field_a != 3) {
                  if (sk.field_a == 4) {
                    ((ct) this).a(-109, "js5io");
                    break L10;
                  } else {
                    if (sk.field_a != 2) {
                      if (sk.field_a != 5) {
                        ((ct) this).a(-109, "js5connect");
                        break L10;
                      } else {
                        ((ct) this).a(-109, "outofdate");
                        break L10;
                      }
                    } else {
                      ((ct) this).a(-109, "js5connect_full");
                      break L10;
                    }
                  }
                } else {
                  ((ct) this).a(-116, "js5crc");
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (sk.field_a == -1) {
                break L14;
              } else {
                if (0 != sk.field_a) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (dg.j(27711)) {
              break L13;
            } else {
              break L12;
            }
          }
          if (wg.field_b <= kh.a(-119)) {
            vs.field_f = false;
            if (sk.field_a == -1) {
              break L12;
            } else {
              if (0 == sk.field_a) {
                break L12;
              } else {
                sk.field_a = -1;
                wj.e(100);
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (0 != sk.field_a) {
            break L15;
          } else {
            if (!dg.j(27711)) {
              w.field_a = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        if (param1 >= 76) {
          L16: {
            if (0 != bl.field_c) {
              break L16;
            } else {
              if (!sg.a(127)) {
                break L16;
              } else {
                bl.field_c = 1;
                break L16;
              }
            }
          }
          L17: {
            if (bl.field_c == 1) {
              L18: {
                if (fb.field_e == 0) {
                  break L18;
                } else {
                  ij.field_h = ot.a(-86, ju.field_m);
                  break L18;
                }
              }
              oi.field_a = sd.a(false, 1, true, false, uk.field_e);
              uj.field_b = sd.a(false, 1, true, false, ks.field_a);
              cf.field_f = sd.a(false, 1, true, false, mb.field_q);
              fg.field_t = uj.field_b;
              bl.field_c = 2;
              hg.field_x = oi.field_a;
              break L17;
            } else {
              break L17;
            }
          }
          L19: {
            if (bl.field_c != 2) {
              break L19;
            } else {
              L20: {
                if (ij.field_h != null) {
                  if (!ij.field_h.b((byte) 104)) {
                    break L20;
                  } else {
                    if (!ij.field_h.a("", 116)) {
                      ij.field_h = null;
                      break L20;
                    } else {
                      if (!ij.field_h.c("", -14012)) {
                        break L20;
                      } else {
                        ub.a((byte) -125, ij.field_h);
                        ij.field_h = null;
                        te.a(62);
                        break L20;
                      }
                    }
                  }
                } else {
                  break L20;
                }
              }
              if (null != ij.field_h) {
                break L19;
              } else {
                bl.field_c = 3;
                break L19;
              }
            }
          }
          L21: {
            if (3 != bl.field_c) {
              break L21;
            } else {
              int discarded$19 = 0;
              if (!bu.a(uj.field_b, cf.field_f, oi.field_a)) {
                break L21;
              } else {
                if (gh.a((byte) 15, cf.field_f)) {
                  L22: {
                    L23: {
                      ps.a(true);
                      om.c(5665);
                      nq.field_a = false;
                      dq.field_b = mp.field_e;
                      cg.a(false, uj.field_b, oi.field_a, te.field_h, cf.field_f);
                      if (qp.field_i) {
                        break L23;
                      } else {
                        if (fg.field_k == null) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (qp.field_i) {
                        stackOut_99_0 = 0;
                        stackIn_100_0 = stackOut_99_0;
                        break L24;
                      } else {
                        stackOut_98_0 = 1;
                        stackIn_100_0 = stackOut_98_0;
                        break L24;
                      }
                    }
                    L25: {
                      stackOut_100_0 = stackIn_100_0;
                      stackOut_100_1 = fg.field_k;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      if (qp.field_i) {
                        stackOut_102_0 = stackIn_102_0;
                        stackOut_102_1 = (String) (Object) stackIn_102_1;
                        stackOut_102_2 = 0;
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        stackIn_103_2 = stackOut_102_2;
                        break L25;
                      } else {
                        stackOut_101_0 = stackIn_101_0;
                        stackOut_101_1 = (String) (Object) stackIn_101_1;
                        stackOut_101_2 = 1;
                        stackIn_103_0 = stackOut_101_0;
                        stackIn_103_1 = stackOut_101_1;
                        stackIn_103_2 = stackOut_101_2;
                        break L25;
                      }
                    }
                    int discarded$20 = -61;
                    hr.a(stackIn_103_0 != 0, stackIn_103_1, stackIn_103_2 != 0);
                    break L22;
                  }
                  L26: {
                    if (qr.field_b) {
                      of.a(109);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (rt.field_h != null) {
                      break L27;
                    } else {
                      int discarded$21 = -101;
                      rt.field_h = pj.c();
                      int discarded$22 = 15;
                      co.field_c = ci.b();
                      break L27;
                    }
                  }
                  du.a(co.field_c, 37, rt.field_h, cf.field_f);
                  oi.field_a = null;
                  uj.field_b = null;
                  cf.field_f = null;
                  int discarded$23 = 17337;
                  wb.a((java.applet.Applet) this);
                  te.a(67);
                  bl.field_c = 10;
                  break L21;
                } else {
                  break L21;
                }
              }
            }
          }
          L28: {
            if (bl.field_c != 10) {
              break L28;
            } else {
              L29: {
                if (fb.field_e != 0) {
                  fn.field_a = ot.a(-92, hf.field_r);
                  break L29;
                } else {
                  break L29;
                }
              }
              bl.field_c = 11;
              break L28;
            }
          }
          L30: {
            if (bl.field_c == 11) {
              L31: {
                if (null == fn.field_a) {
                  break L31;
                } else {
                  L32: {
                    if (!fn.field_a.b((byte) -88)) {
                      break L32;
                    } else {
                      if (fn.field_a.b(0)) {
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  int discarded$24 = 50;
                  fh.a(-82, 0.0f, kc.a(dt.field_b, gm.field_w, fn.field_a));
                  break L30;
                }
              }
              bl.field_c = 12;
              jn.field_t = true;
              break L30;
            } else {
              break L30;
            }
          }
          L33: {
            if (bl.field_c == 12) {
              if (!jn.field_t) {
                bl.field_c = 13;
                break L33;
              } else {
                break L33;
              }
            } else {
              break L33;
            }
          }
          L34: {
            if (bl.field_c != 13) {
              break L34;
            } else {
              L35: {
                var3 = 1;
                if (null != hg.field_y) {
                  L36: {
                    if (!hg.field_y.a(-18738)) {
                      stackOut_133_0 = 0;
                      stackIn_134_0 = stackOut_133_0;
                      break L36;
                    } else {
                      stackOut_132_0 = 1;
                      stackIn_134_0 = stackOut_132_0;
                      break L36;
                    }
                  }
                  var3 = stackIn_134_0;
                  fh.a(-59, hg.field_y.field_d, hg.field_y.field_j);
                  break L35;
                } else {
                  break L35;
                }
              }
              if (var3 != 0) {
                bl.field_c = 20;
                break L34;
              } else {
                break L34;
              }
            }
          }
          L37: {
            if (param0) {
              break L37;
            } else {
              if (or.field_c) {
                pg.a(ci.field_f, -69);
                ((ct) this).b(-14829);
                cd.a(ci.field_f, 37);
                break L37;
              } else {
                break L37;
              }
            }
          }
          L38: {
            if (fh.field_e[8]) {
              int discarded$25 = -114;
              ei.a();
              break L38;
            } else {
              break L38;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param4, false, param2, param3, param6, param5, param0 + 25, param1);
        if (param0 != -13) {
            this.e((byte) -88);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    private final void d() {
        fh.field_e[2] = true;
    }

    final void a(byte param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(param0 + -16404, false);
        if (!(!param3)) {
            this.m(param0 + -41);
        }
        if (!(!param2)) {
            int discarded$0 = 56;
            this.d();
        }
        if (param4) {
            int discarded$1 = 67;
            this.g();
        }
        if (!(!param1)) {
            int discarded$2 = -11;
            this.l();
        }
        if (param0 != 62) {
            ((ct) this).field_z = -91L;
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        s var4 = null;
        int var5 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var5 = AceOfSkies.field_G ? 1 : 0;
          var2 = qs.field_b;
          var3 = -90 / ((param0 - -27) / 61);
          if (var2 >= 64) {
            break L0;
          } else {
            if (!fh.field_e[var2]) {
              break L0;
            } else {
              if (var2 == 0) {
                return;
              } else {
                L1: {
                  if (var2 == 1) {
                    int discarded$10 = 113;
                    br.f();
                    break L1;
                  } else {
                    if (2 == var2) {
                      int discarded$11 = 116;
                      ce.a();
                      break L1;
                    } else {
                      if (var2 != 3) {
                        if (var2 != 4) {
                          if (var2 != 5) {
                            if (var2 != 6) {
                              if (7 != var2) {
                                if (var2 == 8) {
                                  ae.a(ag.field_s, (rb) (Object) nm.field_c, false, pt.field_b);
                                  break L1;
                                } else {
                                  if (var2 == 16) {
                                    vb.a(true);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var2 == 11) {
                                        break L2;
                                      } else {
                                        if (12 != var2) {
                                          if (13 == var2) {
                                            se.a(-86);
                                            break L1;
                                          } else {
                                            if (17 != var2) {
                                              if (var2 == 18) {
                                                int discarded$12 = 0;
                                                to.g();
                                                break L1;
                                              } else {
                                                v.a("MGS1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                                                int discarded$13 = 1;
                                                te.b();
                                                break L1;
                                              }
                                            } else {
                                              int discarded$14 = -105;
                                              this.k();
                                              break L1;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    L3: {
                                      if (12 != var2) {
                                        stackOut_24_0 = 0;
                                        stackIn_25_0 = stackOut_24_0;
                                        break L3;
                                      } else {
                                        stackOut_23_0 = 1;
                                        stackIn_25_0 = stackOut_23_0;
                                        break L3;
                                      }
                                    }
                                    int discarded$15 = 1;
                                    var4 = um.a(stackIn_25_0 != 0);
                                    pj.a(0, var4);
                                    break L1;
                                  }
                                }
                              } else {
                                this.e((byte) -94);
                                break L1;
                              }
                            } else {
                              int discarded$16 = 4;
                              gu.a();
                              break L1;
                            }
                          } else {
                            int discarded$17 = 126;
                            rq.a();
                            break L1;
                          }
                        } else {
                          int discarded$18 = -26;
                          qo.a();
                          break L1;
                        }
                      } else {
                        dh.a(120);
                        break L1;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
        v.a("MGS2: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
        int discarded$19 = 1;
        te.b();
    }

    public static void o(int param0) {
        field_H = null;
        if (param0 != -12516) {
            field_t = null;
        }
        field_v = null;
        field_C = null;
        field_t = null;
    }

    private final void l() {
        fh.field_e[5] = true;
    }

    protected ct() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new gu("");
        field_H = new ej(13, 0, 1, 0);
        field_B = 250;
        field_C = "Music: ";
    }
}
