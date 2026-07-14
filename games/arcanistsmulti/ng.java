/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends df implements pj, vb {
    static aj field_I;
    static int field_G;
    static String field_H;
    private ej field_J;
    private ag field_F;
    static byte[] field_D;
    static int field_K;
    private ie field_E;

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == ob.field_hb) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) ob.field_hb;
                    // monitorenter ob.field_hb
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        ob.field_hb = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) var2;
                }
                case 6: {
                    if (param0 == -23) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_D = null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final String g(int param0) {
        if (param0 != -7) {
            Object var3 = null;
            boolean discarded$0 = ((ng) this).a((qm) null, (byte) 70, 'ﾘ', 107);
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final String g(byte param0) {
        if (param0 != 94) {
            field_H = null;
        }
        return "</col></u>";
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        kc var5 = null;
        kc var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        kc var15 = null;
        String var16 = null;
        kc var17 = null;
        int stackIn_9_0 = 0;
        String stackIn_24_0 = null;
        kc stackIn_32_0 = null;
        kc stackIn_33_0 = null;
        kc stackIn_34_0 = null;
        String stackIn_34_1 = null;
        kc stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        String[] stackIn_35_2 = null;
        kc stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        String[] stackIn_36_2 = null;
        kc stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String[] stackIn_37_2 = null;
        String stackIn_37_3 = null;
        kc stackIn_60_0 = null;
        kc stackIn_61_0 = null;
        kc stackIn_62_0 = null;
        kc stackIn_63_0 = null;
        kc stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        kc stackIn_65_0 = null;
        kc stackIn_66_0 = null;
        kc stackIn_67_0 = null;
        kc stackIn_68_0 = null;
        kc stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        kc stackIn_70_0 = null;
        kc stackIn_71_0 = null;
        kc stackIn_72_0 = null;
        kc stackIn_73_0 = null;
        kc stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        kc stackOut_31_0 = null;
        kc stackOut_33_0 = null;
        String stackOut_33_1 = null;
        kc stackOut_32_0 = null;
        String stackOut_32_1 = null;
        kc stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        String[] stackOut_34_2 = null;
        kc stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String[] stackOut_36_2 = null;
        String stackOut_36_3 = null;
        kc stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        String[] stackOut_35_2 = null;
        String stackOut_35_3 = null;
        String stackOut_23_0 = null;
        String stackOut_22_0 = null;
        kc stackOut_59_0 = null;
        kc stackOut_60_0 = null;
        kc stackOut_61_0 = null;
        kc stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        kc stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        kc stackOut_64_0 = null;
        kc stackOut_65_0 = null;
        kc stackOut_66_0 = null;
        kc stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        kc stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        kc stackOut_69_0 = null;
        kc stackOut_70_0 = null;
        kc stackOut_71_0 = null;
        kc stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        kc stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        L0: {
          var12 = ArcanistsMulti.field_G ? 1 : 0;
          ej.a(16, sm.field_a);
          if (null == om.field_x) {
            break L0;
          } else {
            L1: {
              L2: {
                go.field_d.field_I = 0;
                var15 = go.field_d;
                var17 = var15;
                var17.field_x = 0;
                dk.field_k.field_I = 0;
                var5 = dk.field_k;
                var5.field_x = 0;
                var6 = jf.field_d;
                jf.field_d.field_I = 0;
                var6.field_x = 0;
                nl.field_Db.field_rb = ri.field_c.toUpperCase();
                var7 = (oh.field_h.field_x + 2) / 2;
                jf.field_d.a(-2 + var7, 0, -40 + oh.field_h.field_I, 40, (byte) -120);
                dk.field_k.a(-var7 + oh.field_h.field_x, var7, oh.field_h.field_I + -40, 40, (byte) -120);
                if (ao.field_h.length != 1) {
                  break L2;
                } else {
                  if (-3 != (ao.field_h[0] ^ -1)) {
                    break L2;
                  } else {
                    var8 = 0;
                    break L1;
                  }
                }
              }
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              L3: while (true) {
                L4: {
                  if (ao.field_h.length <= var10) {
                    break L4;
                  } else {
                    L5: {
                      if ((gh.field_E[var10 / 8] & 1 << (var10 & 7)) == 0) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        break L5;
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        break L5;
                      }
                    }
                    L6: {
                      var11_int = stackIn_9_0;
                      if (var11_int == 0) {
                        break L6;
                      } else {
                        var9_int++;
                        break L6;
                      }
                    }
                    if (var11_int != 0) {
                      if (2 != ao.field_h[var10]) {
                        var8 = 1;
                        break L4;
                      } else {
                        var10++;
                        continue L3;
                      }
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
                if (var9_int == 0) {
                  var8 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            dk.field_k.field_ub = true;
            if (!dn.field_Db) {
              L7: {
                stackOut_31_0 = dk.field_k;
                stackIn_33_0 = stackOut_31_0;
                stackIn_32_0 = stackOut_31_0;
                if (var8 == 0) {
                  stackOut_33_0 = (kc) (Object) stackIn_33_0;
                  stackOut_33_1 = ah.field_d;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  break L7;
                } else {
                  stackOut_32_0 = (kc) (Object) stackIn_32_0;
                  stackOut_32_1 = fi.field_b;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  break L7;
                }
              }
              L8: {
                ((kc) (Object) stackIn_34_0).field_rb = ((String) (Object) stackIn_34_1).toUpperCase();
                stackOut_34_0 = vc.field_c;
                stackOut_34_1 = -96;
                stackOut_34_2 = new String[]{dk.field_k.field_rb};
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_36_2 = stackOut_34_2;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                stackIn_35_2 = stackOut_34_2;
                if (var8 == 0) {
                  stackOut_36_0 = (kc) (Object) stackIn_36_0;
                  stackOut_36_1 = stackIn_36_1;
                  stackOut_36_2 = (String[]) (Object) stackIn_36_2;
                  stackOut_36_3 = bi.field_W;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  stackIn_37_3 = stackOut_36_3;
                  break L8;
                } else {
                  stackOut_35_0 = (kc) (Object) stackIn_35_0;
                  stackOut_35_1 = stackIn_35_1;
                  stackOut_35_2 = (String[]) (Object) stackIn_35_2;
                  stackOut_35_3 = km.field_g;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  stackIn_37_3 = stackOut_35_3;
                  break L8;
                }
              }
              L9: {
                ((kc) (Object) stackIn_37_0).field_rb = tj.a(stackIn_37_1, (String[]) (Object) stackIn_37_2, (String) (Object) stackIn_37_3);
                jf.field_d.field_rb = me.field_R;
                mo.field_o.field_ub = true;
                bg.field_a = true;
                if (um.field_a == null) {
                  break L9;
                } else {
                  L10: {
                    if (qa.field_l != null) {
                      break L10;
                    } else {
                      qa.field_l = new byte[vf.field_l];
                      tk.field_q = new boolean[vf.field_l];
                      break L10;
                    }
                  }
                  bg.field_a = false;
                  nb.field_d = false;
                  var13 = 0;
                  var9_int = var13;
                  L11: while (true) {
                    if (vf.field_l <= var13) {
                      jm.a(-1, (byte) -25, true, om.field_x, -1, vf.field_l, -1, 0);
                      if ((qf.field_d ^ -1) > -3) {
                        break L9;
                      } else {
                        if (!ri.field_b[12]) {
                          break L9;
                        } else {
                          bg.field_a = true;
                          break L9;
                        }
                      }
                    } else {
                      tk.field_q[var13] = false;
                      var13++;
                      continue L11;
                    }
                  }
                }
              }
              if (bg.field_a) {
                break L0;
              } else {
                dk.field_k.field_ub = false;
                if (dk.field_k.field_A) {
                  L12: {
                    var9 = null;
                    if (!nb.field_d) {
                      break L12;
                    } else {
                      var9 = "<col=A00000>" + w.field_Bb + "</col>";
                      var11 = var9;
                      var9 = var11;
                      var11 = var9;
                      var9 = var11;
                      break L12;
                    }
                  }
                  var10 = 0;
                  L13: while (true) {
                    if (var10 >= vf.field_l) {
                      kh.field_c = "<col=A00000>" + nm.field_f + "<br>" + cd.field_s + var9;
                      break L0;
                    } else {
                      if (tk.field_q[var10]) {
                        var11 = "<col=A00000>" + ob.field_bb[var10] + "</col>";
                        var9 = var11;
                        var9 = var11;
                        if (var9 != null) {
                          var9 = var9 + ", " + var11;
                          var10++;
                          continue L13;
                        } else {
                          var9 = var11;
                          var10++;
                          continue L13;
                        }
                      } else {
                        var10++;
                        continue L13;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            } else {
              L14: {
                mo.field_o.field_ub = false;
                vc.field_c.field_rb = j.field_e;
                if (var8 == 0) {
                  stackOut_23_0 = ql.field_e;
                  stackIn_24_0 = stackOut_23_0;
                  break L14;
                } else {
                  stackOut_22_0 = bb.field_f;
                  stackIn_24_0 = stackOut_22_0;
                  break L14;
                }
              }
              L15: {
                var16 = (String) (Object) stackIn_24_0;
                var9 = var16;
                var9 = var16;
                var9 = var16;
                var10 = jf.field_d.field_Z.b(var16) + 3 * jf.field_d.field_Z.a('.');
                jf.field_d.field_X = 0;
                if (16 != (sb.field_e & 48)) {
                  break L15;
                } else {
                  var9 = var16 + ".";
                  break L15;
                }
              }
              L16: {
                jf.field_d.field_t = (jf.field_d.field_x - var10) / 2;
                if (-33 != (sb.field_e & 48 ^ -1)) {
                  break L16;
                } else {
                  var9 = var9 + "..";
                  break L16;
                }
              }
              L17: {
                if ((sb.field_e & 48 ^ -1) != -49) {
                  break L17;
                } else {
                  var9 = var9 + "...";
                  break L17;
                }
              }
              jf.field_d.field_rb = var9;
              dk.field_k.field_rb = sa.field_Eb.toUpperCase();
              break L0;
            }
          }
        }
        L18: {
          L19: {
            stackOut_59_0 = hl.field_m;
            stackIn_63_0 = stackOut_59_0;
            stackIn_60_0 = stackOut_59_0;
            if (!param2) {
              break L19;
            } else {
              stackOut_60_0 = (kc) (Object) stackIn_60_0;
              stackIn_63_0 = stackOut_60_0;
              stackIn_61_0 = stackOut_60_0;
              if (param0) {
                break L19;
              } else {
                stackOut_61_0 = (kc) (Object) stackIn_61_0;
                stackIn_63_0 = stackOut_61_0;
                stackIn_62_0 = stackOut_61_0;
                if (so.field_j) {
                  break L19;
                } else {
                  stackOut_62_0 = (kc) (Object) stackIn_62_0;
                  stackOut_62_1 = 1;
                  stackIn_64_0 = stackOut_62_0;
                  stackIn_64_1 = stackOut_62_1;
                  break L18;
                }
              }
            }
          }
          stackOut_63_0 = (kc) (Object) stackIn_63_0;
          stackOut_63_1 = 0;
          stackIn_64_0 = stackOut_63_0;
          stackIn_64_1 = stackOut_63_1;
          break L18;
        }
        L20: {
          L21: {
            ((kc) (Object) stackIn_64_0).b(stackIn_64_1 != 0, (byte) 33);
            stackOut_64_0 = oh.field_h;
            stackIn_68_0 = stackOut_64_0;
            stackIn_65_0 = stackOut_64_0;
            if (!param2) {
              break L21;
            } else {
              stackOut_65_0 = (kc) (Object) stackIn_65_0;
              stackIn_68_0 = stackOut_65_0;
              stackIn_66_0 = stackOut_65_0;
              if (param0) {
                break L21;
              } else {
                stackOut_66_0 = (kc) (Object) stackIn_66_0;
                stackIn_68_0 = stackOut_66_0;
                stackIn_67_0 = stackOut_66_0;
                if (so.field_j) {
                  break L21;
                } else {
                  stackOut_67_0 = (kc) (Object) stackIn_67_0;
                  stackOut_67_1 = 1;
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_69_1 = stackOut_67_1;
                  break L20;
                }
              }
            }
          }
          stackOut_68_0 = (kc) (Object) stackIn_68_0;
          stackOut_68_1 = 0;
          stackIn_69_0 = stackOut_68_0;
          stackIn_69_1 = stackOut_68_1;
          break L20;
        }
        L22: {
          L23: {
            ((kc) (Object) stackIn_69_0).b(stackIn_69_1 != 0, (byte) 90);
            stackOut_69_0 = nl.field_Fb;
            stackIn_73_0 = stackOut_69_0;
            stackIn_70_0 = stackOut_69_0;
            if (!param2) {
              break L23;
            } else {
              stackOut_70_0 = (kc) (Object) stackIn_70_0;
              stackIn_73_0 = stackOut_70_0;
              stackIn_71_0 = stackOut_70_0;
              if (param0) {
                break L23;
              } else {
                stackOut_71_0 = (kc) (Object) stackIn_71_0;
                stackIn_73_0 = stackOut_71_0;
                stackIn_72_0 = stackOut_71_0;
                if (!so.field_j) {
                  break L23;
                } else {
                  stackOut_72_0 = (kc) (Object) stackIn_72_0;
                  stackOut_72_1 = 1;
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  break L22;
                }
              }
            }
          }
          stackOut_73_0 = (kc) (Object) stackIn_73_0;
          stackOut_73_1 = 0;
          stackIn_74_0 = stackOut_73_0;
          stackIn_74_1 = stackOut_73_1;
          break L22;
        }
        L24: {
          ((kc) (Object) stackIn_74_0).b(stackIn_74_1 != 0, (byte) 64);
          tn.field_Ob.field_c.h((byte) 101);
          if (null == om.field_x) {
            break L24;
          } else {
            L25: {
              if (-1 == mo.field_o.field_U) {
                break L25;
              } else {
                bc.a(param1, -14431);
                break L25;
              }
            }
            L26: {
              if (-1 == dk.field_k.field_U) {
                break L26;
              } else {
                if (!dn.field_Db) {
                  fm.a(param1, true);
                  break L26;
                } else {
                  uc.a(param1, (byte) -96);
                  break L26;
                }
              }
            }
            lm.a(true, param1, om.field_x, 0);
            break L24;
          }
        }
        L27: {
          if (param3 > 105) {
            break L27;
          } else {
            ng.a(false, -75L);
            break L27;
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        if (!param0) {
            String discarded$0 = this.g(-67);
        }
        if (!(((ng) this).field_F != param4)) {
            mo.g(-1);
            ((ng) this).field_E.h(77);
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        if (param1 > -120) {
            ng.a((byte) -91);
        }
        if (!(!this.a(param0, (byte) -122, param2, param3))) {
            return true;
        }
        if (98 == param3) {
            return ((ng) this).a(param0, 9555);
        }
        if (99 != param3) {
            return false;
        }
        return ((ng) this).b(2, param0);
    }

    public final void a(int param0, ej param1, int param2, int param3) {
        int var6 = 0;
        L0: {
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          if (0 == param3) {
            uh.a(126, "terms.ws");
            break L0;
          } else {
            if (param3 != 1) {
              if ((param3 ^ -1) == -3) {
                uh.a(127, "conduct.ws");
                break L0;
              } else {
                break L0;
              }
            } else {
              uh.a(126, "privacy.ws");
              break L0;
            }
          }
        }
        L1: {
          if (param2 == -1607) {
            break L1;
          } else {
            ((ng) this).field_J = null;
            break L1;
          }
        }
    }

    public static void a(int param0) {
        int var1 = 96 % ((param0 - -43) / 49);
        field_I = null;
        field_H = null;
        field_D = null;
    }

    final static void a(boolean param0, long param1) {
        InterruptedException var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        Thread.sleep(param1);
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_I = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var3 = (InterruptedException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ng(ie param0) {
        super(0, 0, 288, 0, (pf) null);
        ((ng) this).field_E = param0;
        ((ng) this).field_F = new ag(qn.field_lb, (wc) null);
        ((ng) this).field_F.field_r = (pf) (Object) new mm();
        String var7 = tj.a(125, new String[2], ud.field_r);
        int var3 = 20;
        jm var4 = new jm(ia.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, ia.field_c.field_C, -1, 2147483647, true);
        ((ng) this).field_J = new ej(var7, (pf) (Object) var4);
        ((ng) this).field_J.field_q = "";
        ((ng) this).field_J.a(0, 0, mm.field_s);
        ((ng) this).field_J.a(1, 0, mm.field_s);
        ((ng) this).field_J.field_o = (wc) this;
        ((ng) this).field_J.field_v = -40 + ((ng) this).field_v;
        ((ng) this).field_J.a(26, (byte) -4, ((ng) this).field_v - 40, var3);
        var3 = var3 + (((ng) this).field_J.field_k - -15);
        ((ng) this).c(-111, (qm) (Object) ((ng) this).field_J);
        int var5 = 4;
        int var6 = 200;
        ((ng) this).field_F.a(40, var3, var6, 300 - var6 >> 1210249057, -69);
        ((ng) this).field_F.field_o = (wc) this;
        ((ng) this).c(-109, (qm) (Object) ((ng) this).field_F);
        ((ng) this).a(var5 + (var3 + 55), 0, 300, 0, -67);
    }

    final static int b(byte param0, int param1) {
        if (!(0 != param1)) {
            return 12176339;
        }
        if (-2 == (param1 ^ -1)) {
            return 11731378;
        }
        int var2 = 18 / ((param0 - 8) / 44);
        if (!((param1 ^ -1) != -4)) {
            return 12246236;
        }
        if (4 == param1) {
            return 14869724;
        }
        if (!((param1 ^ -1) != -6)) {
            return 6716006;
        }
        if (param1 == -7) {
            return 17408;
        }
        if (-8 == param1) {
            return 9938607;
        }
        if (8 == param1) {
            return 13404415;
        }
        return 4227104;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Accept unrated rematch";
        field_I = new aj(14, 0, 4, 1);
        field_K = 0;
    }
}
