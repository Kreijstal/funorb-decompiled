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
            int var15_int = -85 / ((param5 - -30) / 62);
            Object var16 = null;
            rc.a(0, param2, 0, 31944, sd.field_a, param12, 480, param7, sb.field_m, param1, ig.field_b, param14, param6, param0, param9, param13, (hl[]) null, param3, param11, param10, param4);
            se.a(param8, 480);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qc.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + (param11 != null ? "{...}" : "null") + 44 + param12 + 44 + param13 + 44 + (param14 != null ? "{...}" : "null") + 41);
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
          throw sd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((qc) this).field_b = true;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qc.focusLost(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(ka param0, byte param1) {
        try {
            int var3_int = -27 / ((param1 - 68) / 49);
            eg.a(((qc) this).field_f, (byte) -47, param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qc.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            int var2_int = 16;
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) hj.field_c);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) hj.field_c);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qc.D(" + (param0 != null ? "{...}" : "null") + 44 + 69 + 41);
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
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_4_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_73_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_92_0 = 0;
            int stackIn_95_0 = 0;
            RuntimeException stackIn_97_0 = null;
            StringBuilder stackIn_97_1 = null;
            RuntimeException stackIn_98_0 = null;
            StringBuilder stackIn_98_1 = null;
            RuntimeException stackIn_99_0 = null;
            StringBuilder stackIn_99_1 = null;
            String stackIn_99_2 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            RuntimeException stackIn_101_0 = null;
            StringBuilder stackIn_101_1 = null;
            RuntimeException stackIn_102_0 = null;
            StringBuilder stackIn_102_1 = null;
            String stackIn_102_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_72_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_94_0 = 0;
            RuntimeException stackOut_96_0 = null;
            StringBuilder stackOut_96_1 = null;
            RuntimeException stackOut_98_0 = null;
            StringBuilder stackOut_98_1 = null;
            String stackOut_98_2 = null;
            RuntimeException stackOut_97_0 = null;
            StringBuilder stackOut_97_1 = null;
            String stackOut_97_2 = null;
            RuntimeException stackOut_99_0 = null;
            StringBuilder stackOut_99_1 = null;
            RuntimeException stackOut_101_0 = null;
            StringBuilder stackOut_101_1 = null;
            String stackOut_101_2 = null;
            RuntimeException stackOut_100_0 = null;
            StringBuilder stackOut_100_1 = null;
            String stackOut_100_2 = null;
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
                        var10 = null;
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
                  if (param4 == -1) {
                    break L4;
                  } else {
                    var9 = null;
                    qc.a((hl[]) null, -12, 123, (hl[]) null, 4, 6, -76, 11, true, -78, -110, (qe) null, 9, 62, (qe) null);
                    break L4;
                  }
                }
                L5: {
                  if (wc.field_d == r.field_c) {
                    if (!ag.a(127, 1)) {
                      break L5;
                    } else {
                      var6_int = se.field_p.j(7909);
                      se.field_p.field_g = 0;
                      if (var6_int == 0) {
                        r.field_c = od.field_f;
                        break L5;
                      } else {
                        vh.field_t = var6_int;
                        r.field_c = mg.field_i;
                        il.field_g = -1;
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (r.field_c != od.field_f) {
                    break L6;
                  } else {
                    if (ag.a(127, 8)) {
                      mi.field_o = se.field_p.c((byte) 5);
                      se.field_p.field_g = 0;
                      se.a(param3, jh.field_h, 0, param2, param1);
                      r.field_c = uc.field_a;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (uc.field_a == r.field_c) {
                    if (!ag.a(123, 1)) {
                      break L7;
                    } else {
                      L8: {
                        var6_int = se.field_p.j(7909);
                        lj.field_c = null;
                        vh.field_t = var6_int;
                        se.field_p.field_g = 0;
                        if (var6_int == 0) {
                          break L8;
                        } else {
                          if (1 == var6_int) {
                            break L8;
                          } else {
                            if (8 == var6_int) {
                              ec.a((byte) 27);
                              eb.field_f = false;
                              stackOut_29_0 = var6_int;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            } else {
                              r.field_c = mg.field_i;
                              il.field_g = -1;
                              break L7;
                            }
                          }
                        }
                      }
                      r.field_c = dd.field_b;
                      il.field_g = -1;
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (r.field_c == dd.field_b) {
                    if (!fk.a(false)) {
                      break L9;
                    } else {
                      L10: {
                        cb.field_a = se.field_p.c((byte) 5);
                        ad.field_y = se.field_p.j(7909);
                        int discarded$6 = se.field_p.j(7909);
                        u.field_d = se.field_p.i(param4 ^ 1174051991);
                        var6_ref = se.field_p.b((byte) 108);
                        var7 = se.field_p.j(7909);
                        if ((1 & var7) != 0) {
                          gd.a(24);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (!param3) {
                          L12: {
                            if ((8 & var7) == 0) {
                              stackOut_42_0 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              break L12;
                            } else {
                              stackOut_41_0 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              break L12;
                            }
                          }
                          L13: {
                            gd.field_g = stackIn_43_0 != 0;
                            if ((4 & var7) == 0) {
                              stackOut_45_0 = 0;
                              stackIn_46_0 = stackOut_45_0;
                              break L13;
                            } else {
                              stackOut_44_0 = 1;
                              stackIn_46_0 = stackOut_44_0;
                              break L13;
                            }
                          }
                          jh.field_d = stackIn_46_0 != 0;
                          if (!gd.field_g) {
                            break L11;
                          } else {
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                      L14: {
                        if (!qa.field_e) {
                          break L14;
                        } else {
                          int discarded$7 = se.field_p.j(param4 ^ -7910);
                          int discarded$8 = se.field_p.j(param4 ^ -7910);
                          int discarded$9 = se.field_p.f((byte) -105);
                          na.field_f = se.field_p.i(-1174051992);
                          qb.field_m = new byte[na.field_f];
                          var8 = 0;
                          L15: while (true) {
                            if (var8 >= na.field_f) {
                              break L14;
                            } else {
                              qb.field_m[var8] = se.field_p.a(false);
                              var8++;
                              continue L15;
                            }
                          }
                        }
                      }
                      L16: {
                        we.field_i = se.field_p.a(-110);
                        var11 = (CharSequence) (Object) we.field_i;
                        ba.field_e = ni.a(param4 ^ -117, var11);
                        jj.field_F = se.field_p.j(7909);
                        r.field_c = pb.field_a;
                        if (jh.field_h.b((byte) 1) != j.field_d) {
                          if (jh.field_h.b((byte) 1) != na.field_b) {
                            break L16;
                          } else {
                            bh.field_b.a(ll.b(119), true);
                            break L16;
                          }
                        } else {
                          p.field_a.a(ll.b(100), true);
                          break L16;
                        }
                      }
                      L17: {
                        eb.field_f = false;
                        if (var6_ref == null) {
                          break L17;
                        } else {
                          lj.a(var6_ref, 118, ll.b(param4 + 81));
                          break L17;
                        }
                      }
                      L18: {
                        L19: {
                          if (u.field_d > 0) {
                            break L19;
                          } else {
                            if (!jh.field_d) {
                              try {
                                L20: {
                                  Object discarded$10 = mb.a(ll.b(param4 + 89), "unzap", true);
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
                            Object discarded$11 = mb.a(new Object[1], ll.b(114), "zap", -27504);
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
                        if (u.field_d > 0) {
                          ah.field_i = true;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      d.field_b.a(jl.field_b, (byte) 122);
                      var8 = 0;
                      L25: while (true) {
                        if (var8 >= 4) {
                          se.field_p.a(jl.field_b, (byte) -82);
                          stackOut_72_0 = vh.field_t;
                          stackIn_73_0 = stackOut_72_0;
                          return stackIn_73_0;
                        } else {
                          jl.field_b[var8] = jl.field_b[var8] + 50;
                          var8++;
                          continue L25;
                        }
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                L26: {
                  if (mg.field_i != r.field_c) {
                    break L26;
                  } else {
                    if (!fk.a(false)) {
                      break L26;
                    } else {
                      L27: {
                        ec.a((byte) 27);
                        if (vh.field_t != 7) {
                          break L27;
                        } else {
                          if (!eb.field_f) {
                            eb.field_f = true;
                            stackOut_83_0 = -1;
                            stackIn_84_0 = stackOut_83_0;
                            return stackIn_84_0;
                          } else {
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if (vh.field_t != 7) {
                          break L28;
                        } else {
                          vh.field_t = 3;
                          break L28;
                        }
                      }
                      uj.field_r = se.field_p.a(-94);
                      eb.field_f = false;
                      stackOut_81_0 = vh.field_t;
                      stackIn_82_0 = stackOut_81_0;
                      return stackIn_82_0;
                    }
                  }
                }
                L29: {
                  if (m.field_b == null) {
                    if (!eb.field_f) {
                      var6_int = sj.field_I;
                      sj.field_I = pe.field_c;
                      pe.field_c = var6_int;
                      eb.field_f = true;
                      break L29;
                    } else {
                      L30: {
                        if (kg.b((byte) -71) > 30000L) {
                          uj.field_r = ti.field_g;
                          break L30;
                        } else {
                          uj.field_r = va.field_o;
                          break L30;
                        }
                      }
                      eb.field_f = false;
                      stackOut_91_0 = 3;
                      stackIn_92_0 = stackOut_91_0;
                      return stackIn_92_0;
                    }
                  } else {
                    break L29;
                  }
                }
                stackOut_94_0 = -1;
                stackIn_95_0 = stackOut_94_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L31: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_96_0 = (RuntimeException) var6;
                stackOut_96_1 = new StringBuilder().append("qc.G(");
                stackIn_98_0 = stackOut_96_0;
                stackIn_98_1 = stackOut_96_1;
                stackIn_97_0 = stackOut_96_0;
                stackIn_97_1 = stackOut_96_1;
                if (param0 == null) {
                  stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
                  stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
                  stackOut_98_2 = "null";
                  stackIn_99_0 = stackOut_98_0;
                  stackIn_99_1 = stackOut_98_1;
                  stackIn_99_2 = stackOut_98_2;
                  break L31;
                } else {
                  stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
                  stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
                  stackOut_97_2 = "{...}";
                  stackIn_99_0 = stackOut_97_0;
                  stackIn_99_1 = stackOut_97_1;
                  stackIn_99_2 = stackOut_97_2;
                  break L31;
                }
              }
              L32: {
                stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
                stackOut_99_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_99_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
                stackIn_101_0 = stackOut_99_0;
                stackIn_101_1 = stackOut_99_1;
                stackIn_100_0 = stackOut_99_0;
                stackIn_100_1 = stackOut_99_1;
                if (param5 == null) {
                  stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
                  stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
                  stackOut_101_2 = "null";
                  stackIn_102_0 = stackOut_101_0;
                  stackIn_102_1 = stackOut_101_1;
                  stackIn_102_2 = stackOut_101_2;
                  break L32;
                } else {
                  stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
                  stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
                  stackOut_100_2 = "{...}";
                  stackIn_102_0 = stackOut_100_0;
                  stackIn_102_1 = stackOut_100_1;
                  stackIn_102_2 = stackOut_100_2;
                  break L32;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_102_0, stackIn_102_2 + 41);
            }
            return stackIn_95_0;
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
