/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn extends gn implements uc {
    static i field_M;
    private qh field_L;
    static hl field_P;
    static boolean field_K;
    static rb field_Q;
    static oh[] field_O;
    static String field_N;

    void a(int param0, qh param1) {
        ((hn) this).field_L = param1;
        ((hn) this).field_L.field_m = (hn) this;
        if (param0 != 45) {
            field_N = null;
        }
    }

    abstract int g(byte param0);

    abstract int a(boolean param0);

    abstract boolean h(int param0);

    final static int a(byte param0, int param1, int param2) {
        int var4 = TetraLink.field_J;
        if (param0 != -74) {
            field_K = true;
        }
        int var3 = 0;
        while ((param1 ^ -1) < -1) {
            var3 = var3 << -2062465151 | 1 & param2;
            param1--;
            param2 = param2 >>> 1;
        }
        return var3;
    }

    public static void e(byte param0) {
        field_P = null;
        field_O = null;
        field_M = null;
        int var1 = 18 % ((param0 - -29) / 58);
        field_Q = null;
        field_N = null;
    }

    final static int a(boolean param0, String param1, bh param2) {
        if (param0) {
            Object var5 = null;
            int discarded$0 = hn.a(false, (String) null, -28, true, -123, (String) null);
        }
        int var3 = param2.field_t;
        CharSequence var6 = (CharSequence) (Object) param1;
        byte[] var4 = q.a(65, var6);
        param2.b(var4.length, (byte) -93);
        param2.field_t = param2.field_t + ck.field_Z.a(0, param2.field_t, var4, var4.length, param2.field_u, 28677);
        return -var3 + param2.field_t;
    }

    public final vm a(int param0) {
        if (param0 > -100) {
            boolean discarded$0 = ((hn) this).h(-117);
        }
        return (vm) (Object) ((hn) this).field_L;
    }

    hn(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, int param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref_String = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_37_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_49_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_36_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            L0: {
              var9 = TetraLink.field_J;
              if (null != wa.field_e) {
                break L0;
              } else {
                if (om.a(param3, (byte) -70)) {
                  break L0;
                } else {
                  return -1;
                }
              }
            }
            L1: {
              if (qi.field_p != bc.field_z) {
                break L1;
              } else {
                L2: {
                  if (param3) {
                    var10 = null;
                    c.field_a = ug.a(ua.field_g, (String) null, false, param1, -6336);
                    break L2;
                  } else {
                    c.field_a = sk.a((byte) -79, param5, false, param1);
                    break L2;
                  }
                }
                nd.field_Lb.field_t = 0;
                nd.field_Lb.a(14, false);
                nd.field_Lb.a(c.field_a.a((byte) -95).field_d, false);
                ak.a((byte) -116, -1);
                qi.field_p = qi.field_u;
                break L1;
              }
            }
            L3: {
              if (qi.field_p != qi.field_u) {
                break L3;
              } else {
                if (!en.b(109, 1)) {
                  break L3;
                } else {
                  var6 = kb.field_q.d((byte) -99);
                  kb.field_q.field_t = 0;
                  if (var6 == 0) {
                    qi.field_p = eh.field_v;
                    break L3;
                  } else {
                    rl.field_d = -1;
                    qi.field_p = mk.field_a;
                    ua.field_c = var6;
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (qi.field_p == eh.field_v) {
                if (en.b(110, 8)) {
                  ca.field_g = kb.field_q.c(255);
                  kb.field_q.field_t = 0;
                  ng.a((byte) -34, param4, param3, c.field_a, param0);
                  qi.field_p = vb.field_l;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (qi.field_p == vb.field_l) {
                if (!en.b(param2 ^ -2513, 1)) {
                  break L5;
                } else {
                  L6: {
                    var6 = kb.field_q.d((byte) -99);
                    ua.field_c = var6;
                    kb.field_q.field_t = 0;
                    cl.field_b = null;
                    if (var6 == 0) {
                      break L6;
                    } else {
                      if (var6 == 1) {
                        break L6;
                      } else {
                        if ((var6 ^ -1) == -9) {
                          mk.a(false);
                          vb.field_j = false;
                          return var6;
                        } else {
                          rl.field_d = -1;
                          qi.field_p = mk.field_a;
                          break L5;
                        }
                      }
                    }
                  }
                  rl.field_d = -1;
                  qi.field_p = sa.field_f;
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L7: {
              if (sa.field_f != qi.field_p) {
                break L7;
              } else {
                if (ua.b(46)) {
                  L8: {
                    ua.field_g = kb.field_q.c(255);
                    fd.field_J = param1;
                    dd.field_c = kb.field_q.d((byte) -99);
                    mb.field_z = kb.field_q.d((byte) -99);
                    mb.field_C = kb.field_q.e(param2 + 2599);
                    var6_ref_String = kb.field_q.i(-53);
                    var7 = kb.field_q.d((byte) -99);
                    if ((var7 & 1) != -1) {
                      qj.b((byte) 115);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param3) {
                      break L9;
                    } else {
                      L10: {
                        if (-1 == (var7 & 4)) {
                          stackOut_36_0 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          break L10;
                        } else {
                          stackOut_35_0 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          break L10;
                        }
                      }
                      L11: {
                        dh.field_o = stackIn_37_0 != 0;
                        if (0 == (var7 & 8)) {
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
                        cd.field_a = stackIn_40_0 != 0;
                        if ((2 & var7) == 0) {
                          stackOut_42_0 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          break L12;
                        } else {
                          stackOut_41_0 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          break L12;
                        }
                      }
                      fn.field_K = stackIn_43_0 != 0;
                      if (cd.field_a) {
                        fn.field_K = true;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L13: {
                    if ((16 & var7) == 0) {
                      stackOut_48_0 = 0;
                      stackIn_49_0 = stackOut_48_0;
                      break L13;
                    } else {
                      stackOut_47_0 = 1;
                      stackIn_49_0 = stackOut_47_0;
                      break L13;
                    }
                  }
                  L14: {
                    ef.field_n = stackIn_49_0 != 0;
                    if (mc.field_k) {
                      int discarded$5 = kb.field_q.d((byte) -99);
                      int discarded$6 = kb.field_q.d((byte) -99);
                      int discarded$7 = kb.field_q.f(-117);
                      bf.field_n = kb.field_q.e(127);
                      ua.field_a = new byte[bf.field_n];
                      var8 = 0;
                      L15: while (true) {
                        if (bf.field_n <= var8) {
                          break L14;
                        } else {
                          ua.field_a[var8] = kb.field_q.g(oj.a(param2, 1772090971));
                          var8++;
                          continue L15;
                        }
                      }
                    } else {
                      break L14;
                    }
                  }
                  L16: {
                    ph.field_w = kb.field_q.g((byte) 81);
                    var11 = (CharSequence) (Object) ph.field_w;
                    ik.field_f = cc.a(var11, (byte) 119);
                    pg.field_a = kb.field_q.d((byte) -99);
                    qi.field_p = li.field_a;
                    if (c.field_a.a((byte) -106) == t.field_h) {
                      lh.field_s.a((byte) -86, lk.q(13));
                      break L16;
                    } else {
                      if (c.field_a.a((byte) -85) != qf.field_h) {
                        break L16;
                      } else {
                        lc.field_j.a((byte) -90, lk.q(13));
                        break L16;
                      }
                    }
                  }
                  L17: {
                    vb.field_j = false;
                    if (var6_ref_String != null) {
                      qi.a(var6_ref_String, -7011, lk.q(13));
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      if (0 < mb.field_C) {
                        break L19;
                      } else {
                        if (dh.field_o) {
                          break L19;
                        } else {
                          try {
                            L20: {
                              Object discarded$8 = ii.a((byte) 81, "unzap", lk.q(13));
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
                        }
                      }
                    }
                    try {
                      L22: {
                        Object discarded$9 = ii.a(new Object[1], 6760, "zap", lk.q(param2 + 2485));
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
                    if (mb.field_C <= 0) {
                      break L24;
                    } else {
                      pg.field_m = true;
                      break L24;
                    }
                  }
                  nd.field_Lb.a(ai.field_e, (byte) 33);
                  var8 = 0;
                  L25: while (true) {
                    if (var8 >= 4) {
                      kb.field_q.a(ai.field_e, (byte) 33);
                      return ua.field_c;
                    } else {
                      ai.field_e[var8] = ai.field_e[var8] + 50;
                      var8++;
                      continue L25;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L26: {
              if (qi.field_p != mk.field_a) {
                break L26;
              } else {
                if (ua.b(param2 + 2515)) {
                  L27: {
                    mk.a(false);
                    if (-8 != (ua.field_c ^ -1)) {
                      break L27;
                    } else {
                      if (!vb.field_j) {
                        vb.field_j = true;
                        return -1;
                      } else {
                        break L27;
                      }
                    }
                  }
                  L28: {
                    if (7 != ua.field_c) {
                      break L28;
                    } else {
                      ua.field_c = 3;
                      break L28;
                    }
                  }
                  tg.field_d = kb.field_q.g((byte) 81);
                  vb.field_j = false;
                  return ua.field_c;
                } else {
                  break L26;
                }
              }
            }
            if (param2 == -2472) {
              L29: {
                if (null != wa.field_e) {
                  break L29;
                } else {
                  if (vb.field_j) {
                    L30: {
                      if ((ib.a((byte) 127) ^ -1L) >= -30001L) {
                        tg.field_d = ja.field_d;
                        break L30;
                      } else {
                        tg.field_d = wc.field_G;
                        break L30;
                      }
                    }
                    vb.field_j = false;
                    return 3;
                  } else {
                    var6 = ko.field_t;
                    ko.field_t = oi.field_m;
                    vb.field_j = true;
                    oi.field_m = var6;
                    break L29;
                  }
                }
              }
              return -1;
            } else {
              return 123;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int f(byte param0);

    final static void a(boolean param0, String param1, int param2, boolean param3) {
        if (param2 < 21) {
            Object var5 = null;
            int discarded$0 = hn.a(false, (String) null, 8, true, 77, (String) null);
        }
        dd.b(-123);
        mf.field_s.i(0);
        ao.field_c = new tl(mk.field_d, (String) null, qa.field_v, param0, param3);
        mm.field_u = new sd(mf.field_s, (na) (Object) ao.field_c);
        mf.field_s.a((na) (Object) mm.field_u, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = null;
        field_N = "Type your age in years";
    }
}
