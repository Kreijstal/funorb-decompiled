/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    int field_b;
    static bk field_d;
    private static cc field_a;
    static String field_c;

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = Main.field_T;
        var3 = jl.a(false, param0, param2);
        if (var3 == null) {
          L0: {
            if (param1 == -30773) {
              break L0;
            } else {
              var6 = null;
              String discarded$2 = ha.a((CharSequence) null, 19, false);
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (var4 < param0.length()) {
              if (fd.a(true, param0.charAt(var4))) {
                var4++;
                continue L1;
              } else {
                return nf.field_a;
              }
            } else {
              return null;
            }
          }
        } else {
          return var3;
        }
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, int param4, String param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_40_0 = 0;
            int stackIn_43_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            L0: {
              var9 = Main.field_T;
              if (null == cb.field_j) {
                if (!md.a(113, param3)) {
                  return -1;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            L1: {
              if (vf.field_a != ra.field_b) {
                break L1;
              } else {
                L2: {
                  if (param3) {
                    var10 = null;
                    sh.field_k = nk.a(-108, false, cd.field_a, (String) null, param1);
                    break L2;
                  } else {
                    sh.field_k = tb.a(param1, param5, (byte) -18, false);
                    break L2;
                  }
                }
                na.field_r.field_i = 0;
                na.field_r.b(-9469, 14);
                na.field_r.b(-9469, sh.field_k.a((byte) -24).field_b);
                fe.a((byte) -118, -1);
                ra.field_b = vd.field_q;
                break L1;
              }
            }
            L3: {
              if (ra.field_b != vd.field_q) {
                break L3;
              } else {
                if (!r.a(1, (byte) 122)) {
                  break L3;
                } else {
                  L4: {
                    var6 = rd.field_j.f(94);
                    if (var6 == 0) {
                      ra.field_b = ab.field_w;
                      break L4;
                    } else {
                      ra.field_b = field_a;
                      al.field_a = -1;
                      pd.field_l = var6;
                      break L4;
                    }
                  }
                  rd.field_j.field_i = 0;
                  break L3;
                }
              }
            }
            L5: {
              if (ab.field_w != ra.field_b) {
                break L5;
              } else {
                if (r.a(8, (byte) 127)) {
                  hb.field_b = rd.field_j.d(true);
                  rd.field_j.field_i = 0;
                  jc.a(param4, (byte) -111, param3, sh.field_k, param0);
                  ra.field_b = rk.field_eb;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (rk.field_eb != ra.field_b) {
                break L6;
              } else {
                if (r.a(1, (byte) 121)) {
                  L7: {
                    var6 = rd.field_j.f(34);
                    pd.field_l = var6;
                    ia.field_b = null;
                    rd.field_j.field_i = 0;
                    if (0 == var6) {
                      break L7;
                    } else {
                      if (1 == var6) {
                        break L7;
                      } else {
                        if (var6 != 8) {
                          al.field_a = -1;
                          ra.field_b = field_a;
                          break L6;
                        } else {
                          mc.a((byte) -126);
                          lk.field_w = false;
                          return var6;
                        }
                      }
                    }
                  }
                  al.field_a = -1;
                  ra.field_b = vg.field_a;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (ra.field_b == vg.field_a) {
                if (gl.a(false)) {
                  L9: {
                    cd.field_a = rd.field_j.d(true);
                    ec.field_f = rd.field_j.f(-109);
                    int discarded$6 = rd.field_j.f(-103);
                    d.field_c = rd.field_j.d((byte) 72);
                    var11 = rd.field_j.f((byte) 29);
                    var7 = rd.field_j.f(113);
                    if (0 == (var7 & 1)) {
                      break L9;
                    } else {
                      bd.d((byte) -86);
                      break L9;
                    }
                  }
                  L10: {
                    if (!param3) {
                      L11: {
                        if ((var7 & 4) == 0) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L11;
                        } else {
                          stackOut_38_0 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          break L11;
                        }
                      }
                      L12: {
                        bi.field_c = stackIn_40_0 != 0;
                        if ((8 & var7 ^ -1) == -1) {
                          stackOut_42_0 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          break L12;
                        } else {
                          stackOut_41_0 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          break L12;
                        }
                      }
                      da.field_b = stackIn_43_0 != 0;
                      if (da.field_b) {
                        break L10;
                      } else {
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                  L13: {
                    if (!bj.field_m) {
                      break L13;
                    } else {
                      int discarded$7 = rd.field_j.f(124);
                      int discarded$8 = rd.field_j.f(101);
                      int discarded$9 = rd.field_j.e((byte) 125);
                      pb.field_j = rd.field_j.d((byte) 72);
                      fb.field_d = new byte[pb.field_j];
                      var8 = 0;
                      L14: while (true) {
                        if ((var8 ^ -1) <= (pb.field_j ^ -1)) {
                          break L13;
                        } else {
                          fb.field_d[var8] = rd.field_j.a(true);
                          var8++;
                          continue L14;
                        }
                      }
                    }
                  }
                  L15: {
                    ri.field_c = rd.field_j.c(false);
                    var12 = (CharSequence) (Object) ri.field_c;
                    aa.field_fb = ff.a((byte) 116, var12);
                    qb.field_b = rd.field_j.f(-117);
                    ra.field_b = ad.field_q;
                    if (sh.field_k.a((byte) -24) != tf.field_o) {
                      if (sh.field_k.a((byte) -24) == hc.field_h) {
                        oj.field_e.a(mk.g(-120), 0);
                        break L15;
                      } else {
                        break L15;
                      }
                    } else {
                      ke.field_c.a(mk.g(-125), 0);
                      break L15;
                    }
                  }
                  L16: {
                    lk.field_w = false;
                    if (var11 == null) {
                      break L16;
                    } else {
                      lk.a(mk.g(-128), 0, var11);
                      break L16;
                    }
                  }
                  L17: {
                    L18: {
                      if ((d.field_c ^ -1) < -1) {
                        break L18;
                      } else {
                        if (bi.field_c) {
                          break L18;
                        } else {
                          try {
                            L19: {
                              Object discarded$10 = vh.a("unzap", -12151, mk.g(-125));
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
                        }
                      }
                    }
                    try {
                      L21: {
                        Object discarded$11 = vh.a(new Object[1], "zap", (byte) 111, mk.g(-125));
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
                    if (-1 <= (d.field_c ^ -1)) {
                      break L23;
                    } else {
                      dg.field_F = true;
                      break L23;
                    }
                  }
                  na.field_r.b(kb.field_e, 8);
                  var8 = 0;
                  L24: while (true) {
                    if (-5 >= (var8 ^ -1)) {
                      rd.field_j.b(kb.field_e, 8);
                      return pd.field_l;
                    } else {
                      kb.field_e[var8] = kb.field_e[var8] + 50;
                      var8++;
                      continue L24;
                    }
                  }
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L25: {
              if (field_a != ra.field_b) {
                break L25;
              } else {
                if (!gl.a(false)) {
                  break L25;
                } else {
                  L26: {
                    mc.a((byte) -125);
                    if (7 != pd.field_l) {
                      break L26;
                    } else {
                      if (lk.field_w) {
                        break L26;
                      } else {
                        lk.field_w = true;
                        return -1;
                      }
                    }
                  }
                  L27: {
                    if ((pd.field_l ^ -1) == -8) {
                      pd.field_l = 3;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  e.field_a = rd.field_j.c(false);
                  lk.field_w = false;
                  return pd.field_l;
                }
              }
            }
            L28: {
              if (param2 >= 7) {
                break L28;
              } else {
                ha.a(-3);
                break L28;
              }
            }
            L29: {
              if (cb.field_j == null) {
                if (lk.field_w) {
                  L30: {
                    if (we.a((byte) 79) > 30000L) {
                      e.field_a = jf.field_k;
                      break L30;
                    } else {
                      e.field_a = e.field_f;
                      break L30;
                    }
                  }
                  lk.field_w = false;
                  return 3;
                } else {
                  var6 = ag.field_e;
                  ag.field_e = hj.field_l;
                  lk.field_w = true;
                  hj.field_l = var6;
                  break L29;
                }
              } else {
                break L29;
              }
            }
            return -1;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 >= -98) {
            field_c = null;
        }
        field_a = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new bk();
        field_a = new cc();
        field_c = "Please check if address is correct";
    }
}
