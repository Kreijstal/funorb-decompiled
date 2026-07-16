/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re implements uj {
    static int[] field_c;
    static ji[] field_a;
    static int field_b;
    static int field_d;

    final static void a(int param0, byte[] param1, int[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = MinerDisturbance.field_ab;
        for (var5 = param0; mg.field_e.length > var5; var5++) {
            param4 = mg.field_e[var5];
            var6 = var5 << 694475396;
            while (true) {
                int incrementValue$0 = param4;
                param4--;
                if (incrementValue$0 == 0) {
                    break;
                }
                int incrementValue$1 = var6;
                var6++;
                param3 = ta.field_d[incrementValue$1];
                param2[param1[param3]] = param2[param1[param3]] + 1;
                ta.field_d[param2[param1[param3]]] = param3;
            }
        }
    }

    public final void a(boolean param0) {
        tb.field_a = 1;
        gd.field_x = 0;
        if (param0) {
            Object var3 = null;
            int discarded$0 = re.a(-10, false, true, (String) null, false, (String) null);
        }
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        for (var4 = param1; var4 < var2; var4++) {
            var3[-1 + var2 - var4] = param0.charAt(var4);
        }
        return new String(var3);
    }

    final static int a(int param0, boolean param1, boolean param2, String param3, boolean param4, String param5) {
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
              var9 = MinerDisturbance.field_ab;
              if (null == ci.field_i) {
                if (!ed.a(param4, (byte) -126)) {
                  return -1;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            L1: {
              if (qd.field_Q == cm.field_p) {
                L2: {
                  if (param4) {
                    var10 = null;
                    tb.field_d = qg.a(ne.field_Q, param5, 0, (String) null, false);
                    break L2;
                  } else {
                    tb.field_d = sl.a((byte) 86, param3, param5, false);
                    break L2;
                  }
                }
                sn.field_c.field_o = 0;
                sn.field_c.c(14, 25564);
                sn.field_c.c(tb.field_d.b(0).field_a, 25564);
                bk.a((byte) -104, -1);
                qd.field_Q = ra.field_c;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (qd.field_Q != ra.field_c) {
                break L3;
              } else {
                if (ta.a(0, 1)) {
                  var6 = kj.field_a.d((byte) -54);
                  kj.field_a.field_o = 0;
                  if (-1 == (var6 ^ -1)) {
                    qd.field_Q = ka.field_d;
                    break L3;
                  } else {
                    oj.field_K = var6;
                    qd.field_Q = bh.field_bb;
                    rj.field_d = -1;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (qd.field_Q != ka.field_d) {
                break L4;
              } else {
                if (!ta.a(0, 8)) {
                  break L4;
                } else {
                  gd.field_s = kj.field_a.h(81);
                  kj.field_a.field_o = 0;
                  cm.a((byte) 6, param4, param0, tb.field_d, param2);
                  qd.field_Q = nn.field_m;
                  break L4;
                }
              }
            }
            L5: {
              if (qd.field_Q != nn.field_m) {
                break L5;
              } else {
                if (!ta.a(0, 1)) {
                  break L5;
                } else {
                  L6: {
                    var6 = kj.field_a.d((byte) -54);
                    ag.field_d = null;
                    oj.field_K = var6;
                    kj.field_a.field_o = 0;
                    if (0 == var6) {
                      break L6;
                    } else {
                      if (-2 == (var6 ^ -1)) {
                        break L6;
                      } else {
                        if ((var6 ^ -1) == -9) {
                          si.a(-67);
                          ek.field_c = false;
                          return var6;
                        } else {
                          qd.field_Q = bh.field_bb;
                          rj.field_d = -1;
                          break L5;
                        }
                      }
                    }
                  }
                  rj.field_d = -1;
                  qd.field_Q = wi.field_s;
                  break L5;
                }
              }
            }
            L7: {
              if (qd.field_Q != wi.field_s) {
                break L7;
              } else {
                if (kj.b(-9319)) {
                  L8: {
                    ne.field_Q = kj.field_a.h(71);
                    wj.field_j = kj.field_a.d((byte) -54);
                    int discarded$6 = kj.field_a.d((byte) -54);
                    pj.field_a = kj.field_a.e(-96);
                    var11 = kj.field_a.j(103);
                    var7 = kj.field_a.d((byte) -54);
                    if ((1 & var7) != 0) {
                      nj.a((byte) 89);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (!param4) {
                      L10: {
                        if ((8 & var7) == 0) {
                          stackOut_38_0 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          break L10;
                        } else {
                          stackOut_37_0 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          break L10;
                        }
                      }
                      L11: {
                        bd.field_b = stackIn_39_0 != 0;
                        if ((4 & var7) == 0) {
                          stackOut_41_0 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          break L11;
                        } else {
                          stackOut_40_0 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          break L11;
                        }
                      }
                      fa.field_b = stackIn_42_0 != 0;
                      if (bd.field_b) {
                        break L9;
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L12: {
                    if (!ei.field_L) {
                      break L12;
                    } else {
                      int discarded$7 = kj.field_a.d((byte) -54);
                      int discarded$8 = kj.field_a.d((byte) -54);
                      int discarded$9 = kj.field_a.b((byte) 33);
                      g.field_k = kj.field_a.e(-47);
                      ja.field_v = new byte[g.field_k];
                      var8 = 0;
                      L13: while (true) {
                        if (g.field_k <= var8) {
                          break L12;
                        } else {
                          ja.field_v[var8] = kj.field_a.m(4);
                          var8++;
                          continue L13;
                        }
                      }
                    }
                  }
                  L14: {
                    ti.field_J = kj.field_a.a(false);
                    var12 = (CharSequence) (Object) ti.field_J;
                    in.field_b = cl.a(-95, var12);
                    a.field_d = kj.field_a.d((byte) -54);
                    qd.field_Q = pb.field_c;
                    if (tb.field_d.b(0) == hk.field_i) {
                      ak.field_b.a(bm.c(-122), 447616545);
                      break L14;
                    } else {
                      if (tb.field_d.b(0) != kl.field_a) {
                        break L14;
                      } else {
                        hj.field_e.a(bm.c(-116), 447616545);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    ek.field_c = false;
                    if (var11 == null) {
                      break L15;
                    } else {
                      nc.a(bm.c(-93), var11, (byte) 78);
                      break L15;
                    }
                  }
                  L16: {
                    L17: {
                      if (0 < pj.field_a) {
                        break L17;
                      } else {
                        if (!fa.field_b) {
                          try {
                            L18: {
                              Object discarded$10 = lk.a((byte) 18, "unzap", bm.c(-96));
                              break L18;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L19: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L19;
                            }
                          }
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    try {
                      L20: {
                        Object discarded$11 = lk.a("zap", bm.c(-111), 16715, new Object[1]);
                        break L20;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L21: {
                        var8_ref_Throwable = decompiledCaughtException;
                        break L21;
                      }
                    }
                    break L16;
                  }
                  L22: {
                    if (-1 > (pj.field_a ^ -1)) {
                      v.field_e = true;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  sn.field_c.b(v.field_b, -97);
                  var8 = 0;
                  L23: while (true) {
                    if (4 <= var8) {
                      kj.field_a.b(v.field_b, 107);
                      return oj.field_K;
                    } else {
                      v.field_b[var8] = v.field_b[var8] + 50;
                      var8++;
                      continue L23;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            if (!param1) {
              L24: {
                if (bh.field_bb != qd.field_Q) {
                  break L24;
                } else {
                  if (!kj.b(-9319)) {
                    break L24;
                  } else {
                    L25: {
                      si.a(-110);
                      if (7 != oj.field_K) {
                        break L25;
                      } else {
                        if (ek.field_c) {
                          break L25;
                        } else {
                          ek.field_c = true;
                          return -1;
                        }
                      }
                    }
                    L26: {
                      if (7 == oj.field_K) {
                        oj.field_K = 3;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    nf.field_g = kj.field_a.a(false);
                    ek.field_c = false;
                    return oj.field_K;
                  }
                }
              }
              L27: {
                if (null == ci.field_i) {
                  if (!ek.field_c) {
                    var6 = jc.field_E;
                    jc.field_E = ic.field_h;
                    ek.field_c = true;
                    ic.field_h = var6;
                    break L27;
                  } else {
                    L28: {
                      if ((qa.a(-125) ^ -1L) < -30001L) {
                        nf.field_g = oi.field_K;
                        break L28;
                      } else {
                        nf.field_g = l.field_a;
                        break L28;
                      }
                    }
                    ek.field_c = false;
                    return 3;
                  }
                } else {
                  break L27;
                }
              }
              return -1;
            } else {
              return -33;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -10887) {
            field_a = null;
        }
        field_c = null;
    }

    public final String a(byte param0) {
        int var2 = -121 % ((-33 - param0) / 62);
        return "Make Ore Iron";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new int[10];
        var0 = 0;
        L0: while (true) {
          if (field_c.length <= var0) {
            field_d = 0;
            return;
          } else {
            L1: {
              if (var0 != 0) {
                field_c[var0] = 51 * (var0 + 1) << -1044268176;
                break L1;
              } else {
                field_c[var0] = 20 * var0 - -20 << 700938480;
                break L1;
              }
            }
            if (2 < var0) {
              field_c[var0] = hi.a(field_c[var0], (-2 + var0) * 22 << -482023032);
              var0++;
              continue L0;
            } else {
              var0++;
              continue L0;
            }
          }
        }
    }
}
