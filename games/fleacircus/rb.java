/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends gj implements da {
    private bb field_I;
    private bb field_J;
    static int field_H;
    static dd field_G;
    private bb field_F;

    final static void a(int param0, int param1, byte param2) {
        af.field_b = param0;
        vc.field_f = param1;
        if (param2 < 61) {
            rb.a(-16, 15, (byte) 71);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var7 = 0;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          if (param3 == 248) {
            break L0;
          } else {
            rb.a(-65, -100, (byte) -84);
            break L0;
          }
        }
        L1: {
          if (param4 != ((rb) this).field_F) {
            if (param4 == ((rb) this).field_J) {
              oh.d(false);
              break L1;
            } else {
              if (((rb) this).field_I != param4) {
                break L1;
              } else {
                ak.a(65);
                break L1;
              }
            }
          } else {
            na.a((byte) -81);
            break L1;
          }
        }
    }

    final static int a(boolean param0, String param1, boolean param2, String param3, int param4, int param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_39_0 = 0;
            int stackIn_42_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_38_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            L0: {
              var9 = fleas.field_A ? 1 : 0;
              if (null != sg.field_h) {
                break L0;
              } else {
                if (id.a(false, param2)) {
                  break L0;
                } else {
                  return -1;
                }
              }
            }
            L1: {
              if (rh.field_k == d.field_O) {
                L2: {
                  if (!param2) {
                    cf.field_c = lk.a(param1, false, (byte) -35, param3);
                    break L2;
                  } else {
                    var10 = null;
                    cf.field_c = r.a(false, aj.field_w, (byte) 84, (String) null, param1);
                    break L2;
                  }
                }
                ud.field_b.field_i = 0;
                ud.field_b.a(-11, 14);
                ud.field_b.a(-11, cf.field_c.a(true).field_c);
                dk.b((byte) 41, -1);
                rh.field_k = je.field_P;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (rh.field_k != je.field_P) {
                if (ef.field_h != rh.field_k) {
                  break L3;
                } else {
                  if (!gi.a(8, true)) {
                    break L3;
                  } else {
                    ug.field_a = ae.field_a.f(-71);
                    ae.field_a.field_i = 0;
                    wd.a(param2, -120, cf.field_c, param4, param0);
                    rh.field_k = dl.field_w;
                    break L3;
                  }
                }
              } else {
                if (ef.field_h != rh.field_k) {
                  break L3;
                } else {
                  if (!gi.a(8, true)) {
                    break L3;
                  } else {
                    ug.field_a = ae.field_a.f(-71);
                    ae.field_a.field_i = 0;
                    wd.a(param2, -120, cf.field_c, param4, param0);
                    rh.field_k = dl.field_w;
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (dl.field_w == rh.field_k) {
                if (gi.a(1, true)) {
                  L5: {
                    var6 = ae.field_a.e(false);
                    be.field_a = var6;
                    ae.field_a.field_i = 0;
                    wc.field_p = null;
                    if (-1 == (var6 ^ -1)) {
                      break L5;
                    } else {
                      if (var6 != 1) {
                        if (var6 == 8) {
                          k.c(-28354);
                          aa.field_q = false;
                          return var6;
                        } else {
                          rh.field_k = pi.field_g;
                          pd.field_l = -1;
                          break L4;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  pd.field_l = -1;
                  rh.field_k = ll.field_r;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L6: {
              if (ll.field_r == rh.field_k) {
                if (!gf.b(-128)) {
                  break L6;
                } else {
                  L7: {
                    aj.field_w = ae.field_a.f(-109);
                    qe.field_k = ae.field_a.e(false);
                    int discarded$6 = ae.field_a.e(false);
                    wc.field_q = ae.field_a.d((byte) -116);
                    var11 = ae.field_a.a((byte) -115);
                    var7 = ae.field_a.e(false);
                    if ((var7 & 1) != 0) {
                      f.d((byte) -37);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (!param2) {
                      L9: {
                        if ((var7 & 4) == -1) {
                          stackOut_38_0 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          break L9;
                        } else {
                          stackOut_37_0 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          break L9;
                        }
                      }
                      L10: {
                        ed.field_a = stackIn_39_0 != 0;
                        if (-1 == (var7 & 8)) {
                          stackOut_41_0 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          break L10;
                        } else {
                          stackOut_40_0 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          break L10;
                        }
                      }
                      ee.field_i = stackIn_42_0 != 0;
                      if (!ee.field_i) {
                        break L8;
                      } else {
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L11: {
                    if (!bk.field_e) {
                      break L11;
                    } else {
                      int discarded$7 = ae.field_a.e(false);
                      int discarded$8 = ae.field_a.e(false);
                      int discarded$9 = ae.field_a.c((byte) 123);
                      ge.field_g = ae.field_a.d((byte) -117);
                      gi.field_c = new byte[ge.field_g];
                      var8 = 0;
                      L12: while (true) {
                        if (ge.field_g <= var8) {
                          break L11;
                        } else {
                          gi.field_c[var8] = ae.field_a.i(-127);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  }
                  L13: {
                    b.field_e = ae.field_a.h(0);
                    var12 = (CharSequence) (Object) b.field_e;
                    ma.field_a = uk.a(92, var12);
                    nb.field_h = ae.field_a.e(false);
                    rh.field_k = fh.field_b;
                    if (cf.field_c.a(true) == wa.field_g) {
                      ml.field_F.a(true, rl.a((byte) -111));
                      break L13;
                    } else {
                      if (cf.field_c.a(true) == mk.field_i) {
                        wd.field_b.a(true, rl.a((byte) -116));
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    aa.field_q = false;
                    if (var11 != null) {
                      ea.a(376, rl.a((byte) -120), var11);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      if (0 < wc.field_q) {
                        break L16;
                      } else {
                        if (ed.field_a) {
                          break L16;
                        } else {
                          try {
                            L17: {
                              Object discarded$10 = eb.a("unzap", rl.a((byte) -65), -250);
                              break L17;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L18: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L18;
                            }
                          }
                          break L15;
                        }
                      }
                    }
                    try {
                      L19: {
                        Object discarded$11 = eb.a("zap", new Object[1], -11745, rl.a((byte) -126));
                        break L19;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L20: {
                        var8_ref_Throwable = decompiledCaughtException;
                        break L20;
                      }
                    }
                    break L15;
                  }
                  L21: {
                    if (0 >= wc.field_q) {
                      break L21;
                    } else {
                      va.field_m = true;
                      break L21;
                    }
                  }
                  ud.field_b.a(ue.field_a, (byte) 12);
                  var8 = 0;
                  L22: while (true) {
                    if (4 <= var8) {
                      ae.field_a.a(ue.field_a, (byte) 12);
                      return be.field_a;
                    } else {
                      ue.field_a[var8] = ue.field_a[var8] + 50;
                      var8++;
                      continue L22;
                    }
                  }
                }
              } else {
                break L6;
              }
            }
            if (param5 < -19) {
              L23: {
                if (pi.field_g == rh.field_k) {
                  if (!gf.b(115)) {
                    break L23;
                  } else {
                    k.c(-28354);
                    if (7 == be.field_a) {
                      if (!aa.field_q) {
                        aa.field_q = true;
                        return -1;
                      } else {
                        L24: {
                          if (be.field_a == 7) {
                            be.field_a = 3;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        fh.field_a = ae.field_a.h(0);
                        aa.field_q = false;
                        return be.field_a;
                      }
                    } else {
                      L25: {
                        if (be.field_a == 7) {
                          be.field_a = 3;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      fh.field_a = ae.field_a.h(0);
                      aa.field_q = false;
                      return be.field_a;
                    }
                  }
                } else {
                  break L23;
                }
              }
              if (sg.field_h == null) {
                if (aa.field_q) {
                  L26: {
                    if (-30001L <= (h.b(102) ^ -1L)) {
                      fh.field_a = jc.field_d;
                      break L26;
                    } else {
                      fh.field_a = ok.field_B;
                      break L26;
                    }
                  }
                  aa.field_q = false;
                  return 3;
                } else {
                  var6 = be.field_b;
                  be.field_b = ab.field_d;
                  ab.field_d = var6;
                  aa.field_q = true;
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return 13;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 > -95) {
            Object var2 = null;
            rb.a(127, -14, 40, (dd) null, 38, 110, (byte) -127, -57, -56);
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = ((rb) this).field_y + param1;
        int var6 = ((rb) this).field_z + param0;
        int discarded$0 = ug.field_e.a(rd.field_b, var5 + 20, var6 - -20, ((rb) this).field_u - 40, ((rb) this).field_j - 50, 16777215, -1, 1, 0, ug.field_e.field_H);
        super.b(param0, param1, param2, param3);
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if ((param1 ^ -1) != -99) {
            if (param1 == 99) {
              return ((rb) this).a(32, param2);
            } else {
              return false;
            }
          } else {
            return ((rb) this).b(param2, -28533);
          }
        }
    }

    public rb() {
        super(0, 0, 476, 225, (ch) null);
        ((rb) this).field_J = new bb(qk.field_h, (kd) null);
        ((rb) this).field_F = new bb(qj.field_J, (kd) null);
        ((rb) this).field_I = new bb(tc.field_g, (kd) null);
        ri var1 = new ri();
        ((rb) this).field_J.field_p = (ch) (Object) var1;
        ((rb) this).field_F.field_p = (ch) (Object) var1;
        ((rb) this).field_I.field_p = (ch) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -1935077055;
        ((rb) this).field_F.a(-var3 + ((rb) this).field_u >> -2073875711, var4, -var2 + ((rb) this).field_j + -48, 30, 80);
        ((rb) this).field_I.a(var2 + (var4 + (-var3 + ((rb) this).field_u >> -348715167)), var4, -var2 + (-48 + ((rb) this).field_j), 30, 80);
        ((rb) this).field_J.a(((rb) this).field_u - var3 >> -1481717663, var3, ((rb) this).field_j - (78 + var2 * 2), 30, 80);
        ((rb) this).field_F.field_s = (kd) this;
        ((rb) this).field_J.field_s = (kd) this;
        ((rb) this).field_J.field_m = se.field_f;
        ((rb) this).field_I.field_s = (kd) this;
        ((rb) this).field_I.field_m = ga.field_n;
        ((rb) this).a((qa) (Object) ((rb) this).field_F, (byte) -39);
        ((rb) this).a((qa) (Object) ((rb) this).field_J, (byte) -59);
        ((rb) this).a((qa) (Object) ((rb) this).field_I, (byte) -53);
    }

    final static void a(int param0, int param1, int param2, dd param3, int param4, int param5, byte param6, int param7, int param8) {
        bh.field_l = param2;
        li.field_i = param8;
        ei.field_V = param1;
        if (param6 <= 119) {
          return;
        } else {
          aj.field_q = param7;
          t.field_d = param0;
          kh.field_d = param5;
          wa.field_m = param4;
          pb.field_g = param3;
          return;
        }
    }

    static {
    }
}
