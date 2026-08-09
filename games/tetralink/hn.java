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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_L = param1;
              this.field_L.field_m = (hn) (this);
              if (param0 == 45) {
                break L1;
              } else {
                field_N = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hn.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract int g(byte param0);

    abstract int a(boolean param0);

    abstract boolean h(int param0);

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 == -74) {
                break L1;
              } else {
                field_K = true;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if ((param1 ^ -1) >= -1) {
                stackIn_7_0 = var3_int;
                break L0;
              } else {
                var3_int = var3_int << -2062465151 | 1 & param2;
                param1--;
                param2 = param2 >>> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "hn.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
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
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var5 = (String) null;
                hn.a(false, (String) null, -28, true, -123, (String) null);
                break L1;
              }
            }
            var3_int = param2.field_t;
            var6 = (CharSequence) ((Object) param1);
            var4 = q.a(65, var6);
            param2.b(var4.length, (byte) -93);
            param2.field_t = param2.field_t + ck.field_Z.a(0, param2.field_t, var4, var4.length, param2.field_u, 28677);
            stackIn_3_0 = -var3_int + param2.field_t;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hn.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public final vm a(int param0) {
        if (param0 > -100) {
            this.h(-117);
        }
        return (vm) ((Object) this.field_L);
    }

    hn(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, int param4, String param5) {
        try {
            int stackIn_4_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_89_0 = 0;
            int stackIn_91_0 = 0;
            int stackIn_94_0 = 0;
            int stackIn_102_0 = 0;
            int stackIn_104_0 = 0;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            String stackIn_108_2 = null;
            StringBuilder stackIn_110_1 = null;
            StringBuilder stackIn_111_1 = null;
            String stackIn_111_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
            var9 = TetraLink.field_J;
            try {
              L0: {
                L1: {
                  if (null != wa.field_e) {
                    break L1;
                  } else {
                    if (om.a(param3, (byte) -70)) {
                      break L1;
                    } else {
                      stackIn_4_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                L2: {
                  if (qi.field_p != bc.field_z) {
                    break L2;
                  } else {
                    L3: {
                      if (param3) {
                        var10 = (String) null;
                        c.field_a = ug.a(ua.field_g, (String) null, false, param1, -6336);
                        break L3;
                      } else {
                        c.field_a = sk.a((byte) -79, param5, false, param1);
                        break L3;
                      }
                    }
                    nd.field_Lb.field_t = 0;
                    nd.field_Lb.a(14, false);
                    nd.field_Lb.a(c.field_a.a((byte) -95).field_d, false);
                    ak.a((byte) -116, -1);
                    qi.field_p = qi.field_u;
                    break L2;
                  }
                }
                L4: {
                  if (qi.field_p != qi.field_u) {
                    break L4;
                  } else {
                    if (!en.b(109, 1)) {
                      break L4;
                    } else {
                      var6_int = kb.field_q.d((byte) -99);
                      kb.field_q.field_t = 0;
                      if (var6_int == 0) {
                        qi.field_p = eh.field_v;
                        break L4;
                      } else {
                        rl.field_d = -1;
                        qi.field_p = mk.field_a;
                        ua.field_c = var6_int;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (qi.field_p == eh.field_v) {
                    if (en.b(110, 8)) {
                      ca.field_g = kb.field_q.c(255);
                      kb.field_q.field_t = 0;
                      ng.a((byte) -34, param4, param3, c.field_a, param0);
                      qi.field_p = vb.field_l;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (qi.field_p == vb.field_l) {
                    if (!en.b(param2 ^ -2513, 1)) {
                      break L6;
                    } else {
                      L7: {
                        var6_int = kb.field_q.d((byte) -99);
                        ua.field_c = var6_int;
                        kb.field_q.field_t = 0;
                        cl.field_b = null;
                        if (var6_int == 0) {
                          break L7;
                        } else {
                          if (var6_int == 1) {
                            break L7;
                          } else {
                            if ((var6_int ^ -1) == -9) {
                              mk.a(false);
                              vb.field_j = false;
                              stackIn_28_0 = var6_int;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              rl.field_d = -1;
                              qi.field_p = mk.field_a;
                              break L6;
                            }
                          }
                        }
                      }
                      rl.field_d = -1;
                      qi.field_p = sa.field_f;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L8: {
                  if (sa.field_f != qi.field_p) {
                    break L8;
                  } else {
                    if (ua.b(46)) {
                      L9: {
                        ua.field_g = kb.field_q.c(255);
                        fd.field_J = param1;
                        dd.field_c = kb.field_q.d((byte) -99);
                        mb.field_z = kb.field_q.d((byte) -99);
                        mb.field_C = kb.field_q.e(param2 + 2599);
                        var6 = kb.field_q.i(-53);
                        var7 = kb.field_q.d((byte) -99);
                        if ((var7 & 1) != 0) {
                          qj.b((byte) 115);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (param3) {
                          break L10;
                        } else {
                          L11: {
                            if (-1 == (var7 & 4 ^ -1)) {
                              stackIn_40_0 = 0;
                              break L11;
                            } else {
                              stackIn_40_0 = 1;
                              break L11;
                            }
                          }
                          L12: {
                            dh.field_o = stackIn_40_0 != 0;
                            if (0 == (var7 & 8)) {
                              stackIn_43_0 = 0;
                              break L12;
                            } else {
                              stackIn_43_0 = 1;
                              break L12;
                            }
                          }
                          L13: {
                            cd.field_a = stackIn_43_0 != 0;
                            if ((2 & var7) == 0) {
                              stackIn_46_0 = 0;
                              break L13;
                            } else {
                              stackIn_46_0 = 1;
                              break L13;
                            }
                          }
                          fn.field_K = stackIn_46_0 != 0;
                          if (cd.field_a) {
                            fn.field_K = true;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L14: {
                        if ((16 & var7) == 0) {
                          stackIn_52_0 = 0;
                          break L14;
                        } else {
                          stackIn_52_0 = 1;
                          break L14;
                        }
                      }
                      L15: {
                        ef.field_n = stackIn_52_0 != 0;
                        if (mc.field_k) {
                          kb.field_q.d((byte) -99);
                          kb.field_q.d((byte) -99);
                          kb.field_q.f(-117);
                          bf.field_n = kb.field_q.e(127);
                          ua.field_a = new byte[bf.field_n];
                          var8 = 0;
                          L16: while (true) {
                            if (bf.field_n <= var8) {
                              break L15;
                            } else {
                              ua.field_a[var8] = kb.field_q.g(oj.a(param2, 1772090971));
                              var8++;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      L17: {
                        ph.field_w = kb.field_q.g((byte) 81);
                        var11 = (CharSequence) ((Object) ph.field_w);
                        ik.field_f = cc.a(var11, (byte) 119);
                        pg.field_a = kb.field_q.d((byte) -99);
                        qi.field_p = li.field_a;
                        if (c.field_a.a((byte) -106) == t.field_h) {
                          lh.field_s.a((byte) -86, lk.q(13));
                          break L17;
                        } else {
                          if (c.field_a.a((byte) -85) != qf.field_h) {
                            break L17;
                          } else {
                            lc.field_j.a((byte) -90, lk.q(13));
                            break L17;
                          }
                        }
                      }
                      L18: {
                        vb.field_j = false;
                        if (var6 != null) {
                          qi.a(var6, -7011, lk.q(13));
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (0 < mb.field_C) {
                            break L20;
                          } else {
                            if (dh.field_o) {
                              break L20;
                            } else {
                              try {
                                L21: {
                                  ii.a((byte) 81, "unzap", lk.q(13));
                                  break L21;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L22: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L22;
                                }
                              }
                              break L19;
                            }
                          }
                        }
                        try {
                          L23: {
                            ii.a(new Object[]{la.a(ua.field_g, true)}, 6760, "zap", lk.q(param2 + 2485));
                            break L23;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L24: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L24;
                          }
                        }
                        break L19;
                      }
                      L25: {
                        if (mb.field_C <= 0) {
                          break L25;
                        } else {
                          pg.field_m = true;
                          break L25;
                        }
                      }
                      nd.field_Lb.a(ai.field_e, (byte) 33);
                      var8 = 0;
                      L26: while (true) {
                        if (var8 >= 4) {
                          kb.field_q.a(ai.field_e, (byte) 33);
                          stackIn_79_0 = ua.field_c;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          ai.field_e[var8] = ai.field_e[var8] + 50;
                          var8++;
                          continue L26;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                L27: {
                  if (qi.field_p != mk.field_a) {
                    break L27;
                  } else {
                    if (ua.b(param2 + 2515)) {
                      L28: {
                        mk.a(false);
                        if (-8 != (ua.field_c ^ -1)) {
                          break L28;
                        } else {
                          if (!vb.field_j) {
                            vb.field_j = true;
                            stackIn_91_0 = -1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L29: {
                        if (7 != ua.field_c) {
                          break L29;
                        } else {
                          ua.field_c = 3;
                          break L29;
                        }
                      }
                      tg.field_d = kb.field_q.g((byte) 81);
                      vb.field_j = false;
                      stackIn_89_0 = ua.field_c;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L27;
                    }
                  }
                }
                if (param2 == -2472) {
                  L30: {
                    if (null != wa.field_e) {
                      break L30;
                    } else {
                      if (vb.field_j) {
                        L31: {
                          if ((ib.a((byte) 127) ^ -1L) >= -30001L) {
                            tg.field_d = ja.field_d;
                            break L31;
                          } else {
                            tg.field_d = wc.field_G;
                            break L31;
                          }
                        }
                        vb.field_j = false;
                        stackIn_102_0 = 3;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        var6_int = ko.field_t;
                        ko.field_t = oi.field_m;
                        vb.field_j = true;
                        oi.field_m = var6_int;
                        break L30;
                      }
                    }
                  }
                  stackIn_104_0 = -1;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  stackIn_94_0 = 123;
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_107_0 = (RuntimeException) (var6_ref);

                stackIn_107_1 = new StringBuilder().append("hn.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_108_0 = (RuntimeException) ((Object) stackIn_107_0);
                  stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
                  stackIn_108_2 = "null";
                  break L32;
                } else {
                  stackIn_108_0 = (RuntimeException) ((Object) stackIn_107_0);
                  stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
                  stackIn_108_2 = "{...}";
                  break L32;
                }
              }
              L33: {


                stackIn_110_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

                if (param5 == null) {
                  stackIn_108_0 = (RuntimeException) ((Object) stackIn_108_0);
                  stackIn_111_1 = (StringBuilder) ((Object) stackIn_110_1);
                  stackIn_111_2 = "null";
                  break L33;
                } else {
                  stackIn_108_0 = (RuntimeException) ((Object) stackIn_108_0);
                  stackIn_111_1 = (StringBuilder) ((Object) stackIn_110_1);
                  stackIn_111_2 = "{...}";
                  break L33;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_108_0), stackIn_111_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_4_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_79_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_89_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_91_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_94_0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          return stackIn_102_0;
                        } else {
                          return stackIn_104_0;
                        }
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int f(byte param0);

    final static void a(boolean param0, String param1, int param2, boolean param3) {
        try {
            if (param2 < 21) {
                String var5 = (String) null;
                hn.a(false, (String) null, 8, true, 77, (String) null);
            }
            dd.b(-123);
            mf.field_s.i(0);
            ao.field_c = new tl(mk.field_d, (String) null, qa.field_v, param0, param3);
            mm.field_u = new sd(mf.field_s, ao.field_c);
            mf.field_s.a(mm.field_u, false);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "hn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_M = null;
        field_N = "Type your age in years";
    }
}
