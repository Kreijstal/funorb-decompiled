/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ph extends tf {
    static int[] field_x;
    private boolean field_z;
    private int field_y;
    private int field_p;
    private int field_A;
    private static boolean field_v;
    private boolean field_r;
    static int field_u;
    private int field_o;
    String field_n;
    private int field_s;
    private int field_q;
    private long field_w;
    private boolean field_t;

    private final void c(int param0, boolean param1) {
        vk.field_w[16] = true;
        vk.field_w[7] = true;
        vk.field_w[3] = true;
        vk.field_w[param0] = true;
        vk.field_w[8] = param1;
        vk.field_w[0] = true;
        vk.field_w[17] = true;
    }

    private final void i(int param0) {
        String var2 = fb.c(-128);
        lh.a(uj.b((byte) -120), var2, false);
        int var3 = -120 / ((54 - param0) / 43);
    }

    private final void k(int param0) {
        if (param0 != 3) {
            ((ph) this).field_r = true;
        }
        vk.field_w[2] = true;
    }

    final void a(boolean param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        ((ph) this).setBackground(java.awt.Color.black);
        if (param1 <= 41) {
            Object var10 = null;
            ((ph) this).a(114, (String) null, (byte) 126);
        }
        wj.field_m = ((ph) this).field_A;
        wg.a(wj.field_m, (byte) -108);
        ec.a(((ph) this).field_n, 5000, ((ph) this).field_t, ((ph) this).field_s, param0, param7, ((ph) this).field_q, 5000, ((ph) this).field_p, ((ph) this).field_w, wj.field_m, wc.field_c, ((ph) this).field_y, 49);
        nc.a(wj.field_m, ((ph) this).field_y, param7, ((ph) this).field_n, (byte) 93, ((ph) this).field_q, ((ph) this).field_s, wc.field_c, ((ph) this).field_p);
        k.a(0);
        mj.field_i = de.a((byte) -112);
        l.a(tf.field_f, 59);
        pj.field_p = param3;
        cb.field_e = param5;
        ve.field_Q = param6;
        oc.field_V = param4;
        nl.field_b = param2;
        this.f((byte) 56);
        tl.b(103);
    }

    private final void l(int param0) {
        int var2 = cd.field_t.b((byte) 90);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        if (param0 >= -108) {
            this.i(-72);
        }
        int var4 = tf.field_c + -1;
        byte[] var5 = new byte[var4];
        cd.field_t.a(-29, 0, var5, var4);
        ke.a(bk.a(var5, -12465), var3 != 0, (byte) -94, uj.b((byte) -120));
    }

    final void a(int param0, String param1, byte param2) {
        int var4 = 68 % ((-44 - param2) / 62);
        this.a(480, 73, 640, param1, param0);
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Boolean var11 = null;
            mg var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = OrbDefence.field_D ? 1 : 0;
                        var4 = tl.a(of.field_K, wj.field_m, param2, (byte) -67);
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        throw new IllegalStateException();
                    }
                    case 3: {
                        if (-2 != (var4 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5_int = ik.a(lm.c(32018), fb.b((byte) -128), param1 ^ -1);
                        if ((var5_int ^ -1) == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        i.a(-35, kk.field_Y, vd.field_e, var5_int);
                        vd.field_e = null;
                        kk.field_Y = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var11 = k.b((byte) 126);
                        if (var11 != null) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        sd.a(var11.booleanValue(), 63);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if ((var4 ^ -1) != -3) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var5_int = kg.a(am.b(-28), uh.b(param1 ^ -5), ((ph) this).field_o, na.a((byte) -105), qh.a(-42), 200, jf.j(989270945));
                        if (-1 == var5_int) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        fa.a(-111, var5_int, vd.field_e, kk.field_Y);
                        kk.field_Y = null;
                        vd.field_e = null;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (param1 == -1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ((ph) this).field_w = 13L;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (-4 != var4) {
                            statePc = 25;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (o.field_j == -1) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (-1 == o.field_j) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        o.field_j = -1;
                        hh.c(param1 ^ -24061);
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (param0) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var5_int = vc.a(((ph) this).field_z, ((ph) this).field_o, param1 ^ 77, am.b(param1 ^ 60), false, uh.b(4));
                        if ((var5_int ^ -1) != 0) {
                            statePc = 21;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (var5_int != 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        el.field_F = p.field_c;
                        id.a(false);
                        d.field_k = false;
                        hi.field_k = 10;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 23: {
                        se.a(kk.field_Y, (byte) -115, var5_int);
                        kk.field_Y = null;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        fa.field_a = false;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (var4 == -5) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (jc.field_b) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        hi.field_k = 10;
                        d.field_k = true;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 29: {
                        ad.a(0, uj.b((byte) -120));
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (-6 != var4) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        ja.a(param1 ^ 104, uj.b((byte) -120));
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (6 != var4) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        if (!pa.field_b) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        hi.field_k = 10;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if ((var4 ^ -1) != -8) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        tf.a(uj.b((byte) -120), -6407);
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if ((var4 ^ -1) != -9) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        ad.a(param1 ^ -1, uj.b((byte) -120));
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if ((var4 ^ -1) != -10) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        ka.a(uj.b((byte) -120), 1);
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        if (var4 == 10) {
                            statePc = 43;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        uk.field_b.i(17, 89);
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (var4 != 11) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        bm.a(param1 + 12980, uj.b((byte) -120));
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (var4 != 12) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        jj.a(da.a(-103), (byte) 53, uj.b((byte) -120));
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (-14 == (var4 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        try {
                            if (null == ml.field_e) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ml.field_e = new uj(wc.field_c, new java.net.URL(((ph) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (!ml.field_e.b(param1 + -3)) {
                                statePc = 60;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var12 = ml.field_e.a(5);
                            if (var12 == null) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var7 = tj.a(var12.field_i, 0, 0, var12.field_j);
                            li.a(param1 + 0, var7);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var9 = null;
                            li.a(-1, (String) null);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ml.field_e = null;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        var5 = (Exception) (Object) caughtException;
                        pe.a((byte) -13, (Throwable) (Object) var5, "S1");
                        li.a(param1 + 0, (String) null);
                        ml.field_e = null;
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        if (var4 != 15) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        hi.field_k = 10;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        if (var4 == 16) {
                            statePc = 64;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        return 1;
                    }
                    case 65: {
                        if (var4 == 17) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        return 0;
                    }
                    case 67: {
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

    private final void n(int param0) {
        vk.field_w[4] = true;
        if (param0 != 18495) {
            ((ph) this).field_z = false;
        }
    }

    private final void m(int param0) {
        if (param0 > -61) {
            ((ph) this).field_y = 25;
        }
        vk.field_w[1] = true;
    }

    final static void b(boolean param0) {
        int var1 = 0;
        if (ck.field_f >= 224) {
            ce.a(256, (byte) -118);
        } else {
            var1 = ck.field_f % 32;
            ce.a(-var1 + ck.field_f + 32, (byte) -127);
        }
        if (!param0) {
            field_x = null;
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        og var3 = null;
        int var4 = 0;
        int stackIn_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        L0: {
          var4 = OrbDefence.field_D ? 1 : 0;
          var2 = ab.field_l;
          if ((var2 ^ -1) <= -65) {
            break L0;
          } else {
            if (vk.field_w[var2]) {
              L1: {
                if (param0 <= -108) {
                  break L1;
                } else {
                  int discarded$1 = this.a(false, 60, true);
                  break L1;
                }
              }
              if (var2 == -1) {
                return;
              } else {
                L2: {
                  if (1 != var2) {
                    if (2 == var2) {
                      uk.a((byte) 68);
                      break L2;
                    } else {
                      if (-4 == var2) {
                        lb.c(122);
                        break L2;
                      } else {
                        if (var2 != 4) {
                          if ((var2 ^ -1) != -6) {
                            if ((var2 ^ -1) == -7) {
                              ad.a(90);
                              break L2;
                            } else {
                              if (var2 != -8) {
                                if (-9 != var2) {
                                  if (16 != var2) {
                                    L3: {
                                      if (11 == var2) {
                                        break L3;
                                      } else {
                                        if (12 == var2) {
                                          break L3;
                                        } else {
                                          if (-14 == (var2 ^ -1)) {
                                            vc.b(-48);
                                            break L2;
                                          } else {
                                            if ((var2 ^ -1) == -18) {
                                              this.l(-119);
                                              break L2;
                                            } else {
                                              if (var2 != 18) {
                                                pe.a((byte) -13, (Throwable) null, "MGS1: " + sj.b(true));
                                                th.a(104);
                                                break L2;
                                              } else {
                                                ek.c(117);
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if (-13 != (var2 ^ -1)) {
                                        stackOut_33_0 = 0;
                                        stackIn_34_0 = stackOut_33_0;
                                        break L4;
                                      } else {
                                        stackOut_32_0 = 1;
                                        stackIn_34_0 = stackOut_32_0;
                                        break L4;
                                      }
                                    }
                                    var3 = oe.a(stackIn_34_0 != 0, (byte) -53);
                                    fm.a(var3, (byte) 126);
                                    break L2;
                                  } else {
                                    gb.b(-122);
                                    break L2;
                                  }
                                } else {
                                  fb.a((mg) (Object) cd.field_t, tf.field_c, -31, wc.field_c);
                                  break L2;
                                }
                              } else {
                                this.i(-22);
                                break L2;
                              }
                            }
                          } else {
                            pc.f(false);
                            break L2;
                          }
                        } else {
                          hb.b(554553416);
                          break L2;
                        }
                      }
                    }
                  } else {
                    tc.a(-51);
                    break L2;
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        pe.a((byte) -13, (Throwable) null, "MGS2: " + sj.b(true));
        th.a(102);
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        Object var11 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        try {
          if (!((ph) this).c(1)) {
            return;
          } else {
            L0: {
              L1: {
                ((ph) this).field_n = ((ph) this).getCodeBase().getHost();
                var6_ref = ((ph) this).field_n.toLowerCase();
                stackOut_3_0 = this;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
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
              ((ph) this).field_z = stackIn_8_1 != 0;
              ((ph) this).field_q = Integer.parseInt(((ph) this).getParameter("gameport1"));
              ((ph) this).field_p = Integer.parseInt(((ph) this).getParameter("gameport2"));
              var7 = ((ph) this).getParameter("servernum");
              if (var7 == null) {
                break L2;
              } else {
                ((ph) this).field_y = Integer.parseInt(var7);
                break L2;
              }
            }
            L3: {
              ((ph) this).field_s = Integer.parseInt(((ph) this).getParameter("gamecrc"));
              ((ph) this).field_w = Long.parseLong(((ph) this).getParameter("instanceid"));
              ((ph) this).field_t = ((ph) this).getParameter("member").equals((Object) (Object) "yes");
              var9 = 66 % ((param1 - -49) / 55);
              var8 = ((ph) this).getParameter("lang");
              if (var8 != null) {
                ((ph) this).field_A = Integer.parseInt(var8);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((((ph) this).field_A ^ -1) > -6) {
                break L4;
              } else {
                ((ph) this).field_A = 0;
                break L4;
              }
            }
            L5: {
              var10 = ((ph) this).getParameter("affid");
              if (var10 == null) {
                break L5;
              } else {
                ((ph) this).field_o = Integer.parseInt(var10);
                break L5;
              }
            }
            field_v = Boolean.valueOf(((ph) this).getParameter("simplemode")).booleanValue();
            ((ph) this).a(-10291, ((ph) this).field_s, param4, param2, param0, param3, 32);
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var11 = null;
        pe.a((byte) -13, (Throwable) (Object) var6, (String) null);
        ((ph) this).a(110, "crash");
    }

    final int j(int param0) {
        int var2 = 0;
        if (param0 != 7) {
          return -15;
        } else {
          L0: {
            L1: {
              var2 = this.h(-10125);
              if (-1 == var2) {
                break L1;
              } else {
                if (-2 != var2) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!vk.field_w[1]) {
                break L2;
              } else {
                ij.a((byte) -34, 2);
                break L2;
              }
            }
            L3: {
              if (!vk.field_w[2]) {
                break L3;
              } else {
                qj.a(3, 7287);
                break L3;
              }
            }
            L4: {
              if (vk.field_w[3]) {
                am.a(4, 113);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!vk.field_w[4]) {
                break L5;
              } else {
                ql.a(5, (byte) 21);
                break L5;
              }
            }
            L6: {
              if (!vk.field_w[5]) {
                break L6;
              } else {
                ik.a((byte) -74, 6);
                break L6;
              }
            }
            L7: {
              if (vk.field_w[6]) {
                nh.a(param0 + 15961, 7);
                break L7;
              } else {
                break L7;
              }
            }
            if (!vk.field_w[8]) {
              break L0;
            } else {
              vk.a(0);
              break L0;
            }
          }
          return var2;
        }
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        String stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        String stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        String stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        String stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        String stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        String stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        int stackIn_107_3 = 0;
        int stackIn_138_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        String stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        String stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        String stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        String stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        String stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_106_2 = 0;
        int stackOut_106_3 = 0;
        String stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          if (null != ne.field_b) {
            L1: {
              if (mg.field_k != null) {
                break L1;
              } else {
                var6 = ob.l(4);
                var4_ref = var6.getSize();
                ne.field_b.a(14592, var4_ref.height, var4_ref.width);
                break L1;
              }
            }
            ne.field_b.d((byte) 112);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          ab.a(-128);
          mg.d((byte) -107);
          if (eg.c((byte) -126)) {
            break L2;
          } else {
            if (11 == hi.field_k) {
              break L2;
            } else {
              cf.a((byte) 109);
              break L2;
            }
          }
        }
        L3: {
          if (null != mj.field_i) {
            of.field_K = mj.field_i.a(1);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!p.a(23236)) {
            break L4;
          } else {
            L5: {
              var3 = 1200 * ok.a((byte) 84);
              if (((ph) this).field_r) {
                break L5;
              } else {
                if (var3 >= f.c((byte) 8)) {
                  break L4;
                } else {
                  if (var3 >= pb.a(-16733)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ph) this).field_r = false;
            th.a(111);
            md.b((byte) 42);
            se.a(oe.field_m, (byte) -79, 2);
            ke.a(-92);
            fa.field_a = true;
            lm.field_c = 15000L + ji.b(-103);
            break L4;
          }
        }
        L6: {
          L7: {
            if (-1 == o.field_j) {
              break L7;
            } else {
              if (o.field_j != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (-1 != o.field_j) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L8;
            } else {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_23_0;
            o.field_j = bh.a((byte) 117);
            if (var3 == 0) {
              break L9;
            } else {
              if (o.field_j != -1) {
                break L9;
              } else {
                if (-12 != hi.field_k) {
                  break L9;
                } else {
                  if (!sg.c(true)) {
                    id.a(false);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
          }
          if (-1 == o.field_j) {
            break L6;
          } else {
            if (o.field_j != 0) {
              lm.field_c = ji.b(123) - -15000L;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (-1 == o.field_j) {
            break L10;
          } else {
            if (o.field_j != 0) {
              if (10 <= vh.field_n) {
                if ((hi.field_k ^ -1) > -11) {
                  break L10;
                } else {
                  L11: {
                    md.b((byte) -86);
                    if (o.field_j != 3) {
                      if (o.field_j == -5) {
                        se.a(cg.field_h, (byte) 109, 256);
                        break L11;
                      } else {
                        if (o.field_j == 2) {
                          se.a(ql.field_a, (byte) -118, 256);
                          break L11;
                        } else {
                          if (-6 != o.field_j) {
                            se.a(pl.field_h, (byte) 63, 256);
                            break L11;
                          } else {
                            se.a(nf.field_k, (byte) -82, 5);
                            break L11;
                          }
                        }
                      }
                    } else {
                      se.a(o.field_i, (byte) -127, 256);
                      break L11;
                    }
                  }
                  fa.field_a = true;
                  break L10;
                }
              } else {
                if (-4 != o.field_j) {
                  if (-5 != o.field_j) {
                    if ((o.field_j ^ -1) != -3) {
                      if (5 != o.field_j) {
                        ((ph) this).a(119, "js5connect");
                        break L10;
                      } else {
                        ((ph) this).a(99, "outofdate");
                        break L10;
                      }
                    } else {
                      ((ph) this).a(124, "js5connect_full");
                      break L10;
                    }
                  } else {
                    ((ph) this).a(125, "js5io");
                    break L10;
                  }
                } else {
                  ((ph) this).a(101, "js5crc");
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (-1 == o.field_j) {
                break L14;
              } else {
                if (o.field_j != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (sg.c(true)) {
              break L13;
            } else {
              break L12;
            }
          }
          if (ji.b(-125) >= lm.field_c) {
            fa.field_a = false;
            if ((o.field_j ^ -1) == 0) {
              break L12;
            } else {
              if (0 == o.field_j) {
                break L12;
              } else {
                o.field_j = -1;
                hh.c(24060);
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (0 != o.field_j) {
            break L15;
          } else {
            if (!sg.c(true)) {
              mf.field_d = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (vh.field_n == 0) {
            if (!lg.a((byte) -2)) {
              break L16;
            } else {
              vh.field_n = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (vh.field_n == 1) {
            L18: {
              if (-1 != (wj.field_m ^ -1)) {
                lf.field_a = qk.a(cb.field_e, -32585);
                break L18;
              } else {
                break L18;
              }
            }
            og.field_g = hm.a(48, true, false, oc.field_V, 1);
            am.field_b = hm.a(48, true, false, ve.field_Q, 1);
            wb.field_b = hm.a(48, true, false, nl.field_b, 1);
            j.field_b = og.field_g;
            vh.field_n = 2;
            tf.field_d = am.field_b;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (vh.field_n == 2) {
            L20: {
              if (null != lf.field_a) {
                if (!lf.field_a.b(-1)) {
                  break L20;
                } else {
                  if (!lf.field_a.c((byte) -84, "")) {
                    lf.field_a = null;
                    break L20;
                  } else {
                    if (lf.field_a.b((byte) -61, "")) {
                      lm.a((byte) 116, lf.field_a);
                      lf.field_a = null;
                      vd.a(42);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              } else {
                break L20;
              }
            }
            if (null == lf.field_a) {
              vh.field_n = 3;
              break L19;
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (vh.field_n != 3) {
            break L21;
          } else {
            if (!dk.a(1, og.field_g, wb.field_b, am.field_b)) {
              break L21;
            } else {
              if (tk.a(wb.field_b, 26810)) {
                L22: {
                  L23: {
                    ak.b(22176);
                    ek.a(-96);
                    tl.field_e = cj.field_c;
                    pa.field_b = false;
                    gj.a(am.field_b, (byte) 33, wb.field_b, jc.field_b, og.field_g);
                    if (gj.field_k) {
                      break L23;
                    } else {
                      if (null != lg.field_b) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    stackOut_101_0 = lg.field_b;
                    stackOut_101_1 = 33;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    stackIn_102_0 = stackOut_101_0;
                    stackIn_102_1 = stackOut_101_1;
                    if (gj.field_k) {
                      stackOut_103_0 = (String) (Object) stackIn_103_0;
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      stackIn_104_2 = stackOut_103_2;
                      break L24;
                    } else {
                      stackOut_102_0 = (String) (Object) stackIn_102_0;
                      stackOut_102_1 = stackIn_102_1;
                      stackOut_102_2 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      stackIn_104_2 = stackOut_102_2;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_104_0 = (String) (Object) stackIn_104_0;
                    stackOut_104_1 = stackIn_104_1;
                    stackOut_104_2 = stackIn_104_2;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_106_1 = stackOut_104_1;
                    stackIn_106_2 = stackOut_104_2;
                    stackIn_105_0 = stackOut_104_0;
                    stackIn_105_1 = stackOut_104_1;
                    stackIn_105_2 = stackOut_104_2;
                    if (gj.field_k) {
                      stackOut_106_0 = (String) (Object) stackIn_106_0;
                      stackOut_106_1 = stackIn_106_1;
                      stackOut_106_2 = stackIn_106_2;
                      stackOut_106_3 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      stackIn_107_2 = stackOut_106_2;
                      stackIn_107_3 = stackOut_106_3;
                      break L25;
                    } else {
                      stackOut_105_0 = (String) (Object) stackIn_105_0;
                      stackOut_105_1 = stackIn_105_1;
                      stackOut_105_2 = stackIn_105_2;
                      stackOut_105_3 = 1;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      stackIn_107_2 = stackOut_105_2;
                      stackIn_107_3 = stackOut_105_3;
                      break L25;
                    }
                  }
                  hm.a(stackIn_107_0, (byte) stackIn_107_1, stackIn_107_2 != 0, stackIn_107_3 != 0);
                  break L22;
                }
                L26: {
                  if (field_v) {
                    kj.j(4);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null == de.field_a) {
                    de.field_a = fb.c(false);
                    cf.field_d = te.j(2);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                hf.a(de.field_a, wb.field_b, cf.field_d, 1000);
                og.field_g = null;
                wb.field_b = null;
                am.field_b = null;
                pj.a(127, (java.applet.Applet) this);
                vd.a(99);
                vh.field_n = 10;
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L28: {
          if (vh.field_n != -11) {
            break L28;
          } else {
            L29: {
              if (-1 == wj.field_m) {
                break L29;
              } else {
                eg.field_x = qk.a(pj.field_p, -32585);
                break L29;
              }
            }
            vh.field_n = 11;
            break L28;
          }
        }
        L30: {
          if (vh.field_n != 11) {
            break L30;
          } else {
            L31: {
              if (null == eg.field_x) {
                break L31;
              } else {
                L32: {
                  if (!eg.field_x.b(-1)) {
                    break L32;
                  } else {
                    if (!eg.field_x.c(7715)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                j.a(0.0f, ql.a(eg.field_x, mi.field_e, de.field_b, (byte) 32), (byte) 105);
                break L30;
              }
            }
            gi.field_b = true;
            vh.field_n = 12;
            break L30;
          }
        }
        L33: {
          if (-13 != (vh.field_n ^ -1)) {
            break L33;
          } else {
            if (gi.field_b) {
              break L33;
            } else {
              vh.field_n = 13;
              break L33;
            }
          }
        }
        L34: {
          var3 = 81 % ((55 - param0) / 43);
          if ((vh.field_n ^ -1) == -14) {
            L35: {
              var4 = 1;
              if (sd.field_b != null) {
                L36: {
                  if (!sd.field_b.a(false)) {
                    stackOut_137_0 = 0;
                    stackIn_138_0 = stackOut_137_0;
                    break L36;
                  } else {
                    stackOut_136_0 = 1;
                    stackIn_138_0 = stackOut_136_0;
                    break L36;
                  }
                }
                var4 = stackIn_138_0;
                j.a(sd.field_b.field_h, sd.field_b.field_d, (byte) 106);
                break L35;
              } else {
                break L35;
              }
            }
            if (var4 != 0) {
              vh.field_n = 20;
              if (param1) {
                break L34;
              } else {
                if (!vc.field_a) {
                  break L34;
                } else {
                  hl.a(tf.field_f, 118);
                  ((ph) this).e(99);
                  l.a(tf.field_f, -123);
                  break L34;
                }
              }
            } else {
              if (!vc.field_a) {
                break L34;
              } else {
                hl.a(tf.field_f, 118);
                ((ph) this).e(99);
                l.a(tf.field_f, -123);
                break L34;
              }
            }
          } else {
            if (param1) {
              break L34;
            } else {
              if (!vc.field_a) {
                break L34;
              } else {
                hl.a(tf.field_f, 118);
                ((ph) this).e(99);
                l.a(tf.field_f, -123);
                break L34;
              }
            }
          }
        }
        L37: {
          if (vk.field_w[8]) {
            od.a(192);
            break L37;
          } else {
            break L37;
          }
        }
    }

    private final void f(int param0) {
        if (param0 != -2) {
            int discarded$0 = this.h(122);
        }
        vk.field_w[5] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.c(18, param3);
        if (param1) {
            this.m(-109);
        }
        if (param2) {
            this.k(3);
        }
        if (!(!param4)) {
            this.n(18495);
        }
        if (!(!param0)) {
            this.f(-2);
        }
    }

    private final void f(byte param0) {
        tg.field_b[13] = -1;
        tg.field_b[10] = -1;
        tg.field_b[8] = -2;
        tg.field_b[6] = -2;
        tg.field_b[1] = 16;
        tg.field_b[7] = -1;
        tg.field_b[5] = -1;
        tg.field_b[11] = -1;
        tg.field_b[17] = -1;
        if (param0 <= 26) {
            this.l(-120);
        }
        tg.field_b[2] = -2;
        tg.field_b[12] = -1;
        tg.field_b[3] = -1;
        tg.field_b[18] = 1;
        tg.field_b[9] = -1;
        tg.field_b[16] = -1;
        tg.field_b[4] = -1;
    }

    final int a(boolean param0, boolean param1) {
        if (param1) {
            return -18;
        }
        return this.a(true, -1, param0);
    }

    final void c(boolean param0) {
        int var3 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        L0: {
          var3 = OrbDefence.field_D ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            ((ph) this).field_y = 12;
            break L0;
          }
        }
        L1: {
          if (fe.c((byte) -123)) {
            L2: {
              stackOut_9_0 = this;
              stackOut_9_1 = 0;
              stackOut_9_2 = -1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              if (mg.field_k == null) {
                stackOut_11_0 = this;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                break L2;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = stackIn_10_2;
                stackOut_10_3 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                break L2;
              }
            }
            int discarded$62 = this.a(stackIn_12_1 != 0, stackIn_12_2, stackIn_12_3 != 0);
            break L1;
          } else {
            if (10 > vh.field_n) {
              break L1;
            } else {
              if (rf.l(-108)) {
                if (hi.field_k != 0) {
                  vi.a(false, of.field_K);
                  break L1;
                } else {
                  int discarded$63 = this.a(false, -1, false);
                  break L1;
                }
              } else {
                id.b(false);
                break L1;
              }
            }
          }
        }
    }

    private final int h(int param0) {
        int var2 = 0;
        if (((ph) this).field_h) {
          return -1;
        } else {
          if (sg.c(true)) {
            if (!fa.field_a) {
              var2 = vc.a(((ph) this).field_z, ((ph) this).field_o, -114, am.b(-70), true, uh.b(4));
              if ((var2 ^ -1) != 0) {
                if (var2 != -1) {
                  if (1 == var2) {
                    L0: {
                      if (hi.field_k != 11) {
                        break L0;
                      } else {
                        if (-1 == o.field_j) {
                          id.a(false);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    return var2;
                  } else {
                    L1: {
                      if (!pc.field_Y) {
                        ((ph) this).a(111, "reconnect");
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      md.b((byte) -111);
                      se.a(kk.field_Y, (byte) -81, var2);
                      fa.field_a = true;
                      if (param0 == -10125) {
                        break L2;
                      } else {
                        this.n(-13);
                        break L2;
                      }
                    }
                    lm.field_c = ji.b(param0 ^ 10203) + 15000L;
                    return var2;
                  }
                } else {
                  L3: {
                    if (hi.field_k != 11) {
                      break L3;
                    } else {
                      if (-1 == o.field_j) {
                        id.a(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return var2;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    public static void g(int param0) {
        int var1 = -4 % ((param0 - 1) / 49);
        field_x = null;
    }

    protected ph() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[8192];
    }
}
