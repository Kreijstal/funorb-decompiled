/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends java.awt.Canvas implements java.awt.event.FocusListener {
    static hl[] field_e;
    static d[] field_c;
    static String field_a;
    java.awt.Frame field_f;
    volatile boolean field_b;
    static int field_g;
    static int field_d;

    final static void a(hl[] param0, int param1, int param2, hl[] param3, int param4, int param5, int param6, int param7, boolean param8, int param9, int param10, qe param11, int param12, int param13, qe param14) {
        try {
            int var15_int = 85;
            Object var16 = null;
            rc.a(0, param2, 0, 31944, sd.field_a, param12, 480, param7, sb.field_m, param1, ig.field_b, param14, param6, param0, param9, param13, (hl[]) null, param3, param11, param10, param4);
            se.a(param8, 480);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qc.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + -109 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(fb param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fb var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            if (param0.field_h != null) {
              L1: {
                L2: {
                  if (param0.field_i != 0) {
                    break L2;
                  } else {
                    if (param0.field_b != 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (wi.field_b <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = lf.field_bb[var2_int];
                      if (var3.field_q != 2) {
                        break L4;
                      } else {
                        if (var3.field_i != param0.field_i) {
                          break L4;
                        } else {
                          if (param0.field_b == var3.field_b) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1 < -36) {
                  break L5;
                } else {
                  var5 = null;
                  qc.a((fb) null, (byte) -81);
                  break L5;
                }
              }
              L6: {
                if (null == param0.field_a) {
                  break L6;
                } else {
                  break L6;
                }
              }
              mg.a((byte) 92, param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("qc.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((qc) this).field_b = true;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qc.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ka param0, byte param1) {
        try {
            int var3_int = -27 / ((param1 - 68) / 49);
            eg.a(((qc) this).field_f, (byte) -47, param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            int var2_int = 16;
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) hj.field_c);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) hj.field_c);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qc.D(" + (param0 != null ? "{...}" : "null") + ',' + 69 + ')');
        }
    }

    qc() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(boolean param0) {
        if (!(null == fa.field_G)) {
            fa.field_G.n(-110);
        }
        n.field_l = new hg();
        t.field_h.c(20317, (uj) (Object) n.field_l);
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static int a(String param0, boolean param1, int param2, boolean param3, int param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            Object var9 = null;
            CharSequence var10 = null;
            int stackIn_4_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_71_0 = 0;
            int stackIn_80_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_90_0 = 0;
            int stackIn_93_0 = 0;
            RuntimeException stackIn_95_0 = null;
            StringBuilder stackIn_95_1 = null;
            RuntimeException stackIn_96_0 = null;
            StringBuilder stackIn_96_1 = null;
            RuntimeException stackIn_97_0 = null;
            StringBuilder stackIn_97_1 = null;
            String stackIn_97_2 = null;
            RuntimeException stackIn_98_0 = null;
            StringBuilder stackIn_98_1 = null;
            RuntimeException stackIn_99_0 = null;
            StringBuilder stackIn_99_1 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            String stackIn_100_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_70_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_89_0 = 0;
            int stackOut_92_0 = 0;
            RuntimeException stackOut_94_0 = null;
            StringBuilder stackOut_94_1 = null;
            RuntimeException stackOut_96_0 = null;
            StringBuilder stackOut_96_1 = null;
            String stackOut_96_2 = null;
            RuntimeException stackOut_95_0 = null;
            StringBuilder stackOut_95_1 = null;
            String stackOut_95_2 = null;
            RuntimeException stackOut_97_0 = null;
            StringBuilder stackOut_97_1 = null;
            RuntimeException stackOut_99_0 = null;
            StringBuilder stackOut_99_1 = null;
            String stackOut_99_2 = null;
            RuntimeException stackOut_98_0 = null;
            StringBuilder stackOut_98_1 = null;
            String stackOut_98_2 = null;
            try {
              L0: {
                L1: {
                  if (m.field_b != null) {
                    break L1;
                  } else {
                    if (!jh.a((byte) -68, param3)) {
                      stackOut_3_0 = -1;
                      stackIn_4_0 = stackOut_3_0;
                      return stackIn_4_0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (r.field_c != ua.field_b) {
                    break L2;
                  } else {
                    L3: {
                      if (!param3) {
                        jh.field_h = ll.a(false, (byte) -49, param5, param0);
                        break L3;
                      } else {
                        var9 = null;
                        jh.field_h = ik.a(param0, -66, cb.field_a, (String) null, false);
                        break L3;
                      }
                    }
                    d.field_b.field_g = 0;
                    d.field_b.a(14, -51);
                    d.field_b.a(jh.field_h.b((byte) 1).field_j, -92);
                    nf.a(-1, (byte) 95);
                    r.field_c = wc.field_d;
                    break L2;
                  }
                }
                L4: {
                  if (wc.field_d == r.field_c) {
                    if (!ag.a(127, 1)) {
                      break L4;
                    } else {
                      var6_int = se.field_p.j(7909);
                      se.field_p.field_g = 0;
                      if (var6_int == 0) {
                        r.field_c = od.field_f;
                        break L4;
                      } else {
                        vh.field_t = var6_int;
                        r.field_c = mg.field_i;
                        il.field_g = -1;
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (r.field_c != od.field_f) {
                    break L5;
                  } else {
                    if (ag.a(127, 8)) {
                      mi.field_o = se.field_p.c((byte) 5);
                      se.field_p.field_g = 0;
                      se.a(param3, jh.field_h, 0, param2, param1);
                      r.field_c = uc.field_a;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (uc.field_a == r.field_c) {
                    if (!ag.a(123, 1)) {
                      break L6;
                    } else {
                      L7: {
                        var6_int = se.field_p.j(7909);
                        lj.field_c = null;
                        vh.field_t = var6_int;
                        se.field_p.field_g = 0;
                        if (var6_int == 0) {
                          break L7;
                        } else {
                          if (1 == var6_int) {
                            break L7;
                          } else {
                            if (8 == var6_int) {
                              ec.a((byte) 27);
                              eb.field_f = false;
                              stackOut_27_0 = var6_int;
                              stackIn_28_0 = stackOut_27_0;
                              return stackIn_28_0;
                            } else {
                              r.field_c = mg.field_i;
                              il.field_g = -1;
                              break L6;
                            }
                          }
                        }
                      }
                      r.field_c = dd.field_b;
                      il.field_g = -1;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L8: {
                  if (r.field_c == dd.field_b) {
                    if (!fk.a(false)) {
                      break L8;
                    } else {
                      L9: {
                        cb.field_a = se.field_p.c((byte) 5);
                        ad.field_y = se.field_p.j(7909);
                        int discarded$6 = se.field_p.j(7909);
                        u.field_d = se.field_p.i(-1174051992);
                        var6_ref = se.field_p.b((byte) 108);
                        var7 = se.field_p.j(7909);
                        if ((1 & var7) != 0) {
                          gd.a(24);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (!param3) {
                          L11: {
                            if ((8 & var7) == 0) {
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
                            gd.field_g = stackIn_41_0 != 0;
                            if ((4 & var7) == 0) {
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L12;
                            } else {
                              stackOut_42_0 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              break L12;
                            }
                          }
                          jh.field_d = stackIn_44_0 != 0;
                          if (!gd.field_g) {
                            break L10;
                          } else {
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      L13: {
                        if (!qa.field_e) {
                          break L13;
                        } else {
                          int discarded$7 = se.field_p.j(7909);
                          int discarded$8 = se.field_p.j(7909);
                          int discarded$9 = se.field_p.f((byte) -105);
                          na.field_f = se.field_p.i(-1174051992);
                          qb.field_m = new byte[na.field_f];
                          var8 = 0;
                          L14: while (true) {
                            if (var8 >= na.field_f) {
                              break L13;
                            } else {
                              qb.field_m[var8] = se.field_p.a(false);
                              var8++;
                              continue L14;
                            }
                          }
                        }
                      }
                      L15: {
                        we.field_i = se.field_p.a(-110);
                        var10 = (CharSequence) (Object) we.field_i;
                        ba.field_e = ni.a(116, var10);
                        jj.field_F = se.field_p.j(7909);
                        r.field_c = pb.field_a;
                        if (jh.field_h.b((byte) 1) != j.field_d) {
                          if (jh.field_h.b((byte) 1) != na.field_b) {
                            break L15;
                          } else {
                            bh.field_b.a(ll.b(119), true);
                            break L15;
                          }
                        } else {
                          p.field_a.a(ll.b(100), true);
                          break L15;
                        }
                      }
                      L16: {
                        eb.field_f = false;
                        if (var6_ref == null) {
                          break L16;
                        } else {
                          lj.a(var6_ref, 118, ll.b(80));
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          if (u.field_d > 0) {
                            break L18;
                          } else {
                            if (!jh.field_d) {
                              try {
                                L19: {
                                  Object discarded$10 = mb.a(ll.b(88), "unzap", true);
                                  break L19;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L20: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L20;
                                }
                              }
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        try {
                          L21: {
                            Object discarded$11 = mb.a(new Object[1], ll.b(114), "zap", -27504);
                            break L21;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L22: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L22;
                          }
                        }
                        break L17;
                      }
                      L23: {
                        if (u.field_d > 0) {
                          ah.field_i = true;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      d.field_b.a(jl.field_b, (byte) 122);
                      var8 = 0;
                      L24: while (true) {
                        if (var8 >= 4) {
                          se.field_p.a(jl.field_b, (byte) -82);
                          stackOut_70_0 = vh.field_t;
                          stackIn_71_0 = stackOut_70_0;
                          return stackIn_71_0;
                        } else {
                          jl.field_b[var8] = jl.field_b[var8] + 50;
                          var8++;
                          continue L24;
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                L25: {
                  if (mg.field_i != r.field_c) {
                    break L25;
                  } else {
                    if (!fk.a(false)) {
                      break L25;
                    } else {
                      L26: {
                        ec.a((byte) 27);
                        if (vh.field_t != 7) {
                          break L26;
                        } else {
                          if (!eb.field_f) {
                            eb.field_f = true;
                            stackOut_81_0 = -1;
                            stackIn_82_0 = stackOut_81_0;
                            return stackIn_82_0;
                          } else {
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (vh.field_t != 7) {
                          break L27;
                        } else {
                          vh.field_t = 3;
                          break L27;
                        }
                      }
                      uj.field_r = se.field_p.a(-94);
                      eb.field_f = false;
                      stackOut_79_0 = vh.field_t;
                      stackIn_80_0 = stackOut_79_0;
                      return stackIn_80_0;
                    }
                  }
                }
                L28: {
                  if (m.field_b == null) {
                    if (!eb.field_f) {
                      var6_int = sj.field_I;
                      sj.field_I = pe.field_c;
                      pe.field_c = var6_int;
                      eb.field_f = true;
                      break L28;
                    } else {
                      L29: {
                        if (kg.b((byte) -71) > 30000L) {
                          uj.field_r = ti.field_g;
                          break L29;
                        } else {
                          uj.field_r = va.field_o;
                          break L29;
                        }
                      }
                      eb.field_f = false;
                      stackOut_89_0 = 3;
                      stackIn_90_0 = stackOut_89_0;
                      return stackIn_90_0;
                    }
                  } else {
                    break L28;
                  }
                }
                stackOut_92_0 = -1;
                stackIn_93_0 = stackOut_92_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L30: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_94_0 = (RuntimeException) var6;
                stackOut_94_1 = new StringBuilder().append("qc.G(");
                stackIn_96_0 = stackOut_94_0;
                stackIn_96_1 = stackOut_94_1;
                stackIn_95_0 = stackOut_94_0;
                stackIn_95_1 = stackOut_94_1;
                if (param0 == null) {
                  stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
                  stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
                  stackOut_96_2 = "null";
                  stackIn_97_0 = stackOut_96_0;
                  stackIn_97_1 = stackOut_96_1;
                  stackIn_97_2 = stackOut_96_2;
                  break L30;
                } else {
                  stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
                  stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
                  stackOut_95_2 = "{...}";
                  stackIn_97_0 = stackOut_95_0;
                  stackIn_97_1 = stackOut_95_1;
                  stackIn_97_2 = stackOut_95_2;
                  break L30;
                }
              }
              L31: {
                stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
                stackOut_97_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(-1).append(',');
                stackIn_99_0 = stackOut_97_0;
                stackIn_99_1 = stackOut_97_1;
                stackIn_98_0 = stackOut_97_0;
                stackIn_98_1 = stackOut_97_1;
                if (param5 == null) {
                  stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
                  stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
                  stackOut_99_2 = "null";
                  stackIn_100_0 = stackOut_99_0;
                  stackIn_100_1 = stackOut_99_1;
                  stackIn_100_2 = stackOut_99_2;
                  break L31;
                } else {
                  stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
                  stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
                  stackOut_98_2 = "{...}";
                  stackIn_100_0 = stackOut_98_0;
                  stackIn_100_1 = stackOut_98_1;
                  stackIn_100_2 = stackOut_98_2;
                  break L31;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_100_0, stackIn_100_2 + ')');
            }
            return stackIn_93_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Proxima liberated<br><br>Level 3<br>Destroy the Paragulan homeworld fleet";
        field_c = new d[4000];
    }
}
