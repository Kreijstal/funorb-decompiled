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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("hn.W(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
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
        int stackOut_6_0 = 0;
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
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
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
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var5 = (String) null;
                discarded$2 = hn.a(false, (String) null, -28, true, -123, (String) null);
                break L1;
              }
            }
            var3_int = param2.field_t;
            var6 = (CharSequence) ((Object) param1);
            var4 = q.a(65, var6);
            param2.b(var4.length, (byte) -93);
            param2.field_t = param2.field_t + ck.field_Z.a(0, param2.field_t, var4, var4.length, param2.field_u, 28677);
            stackOut_2_0 = -var3_int + param2.field_t;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("hn.H(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public final vm a(int param0) {
        boolean discarded$0 = false;
        if (param0 > -100) {
            discarded$0 = this.h(-117);
        }
        return (vm) ((Object) this.field_L);
    }

    hn(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, int param4, String param5) {
        try {
            int discarded$5 = 0;
            int discarded$6 = 0;
            int discarded$7 = 0;
            Object discarded$8 = null;
            Object discarded$9 = null;
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
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
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            String stackIn_108_2 = null;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            String stackIn_111_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_90_0 = 0;
            int stackOut_88_0 = 0;
            int stackOut_101_0 = 0;
            int stackOut_103_0 = 0;
            int stackOut_93_0 = 0;
            RuntimeException stackOut_105_0 = null;
            StringBuilder stackOut_105_1 = null;
            RuntimeException stackOut_107_0 = null;
            StringBuilder stackOut_107_1 = null;
            String stackOut_107_2 = null;
            RuntimeException stackOut_106_0 = null;
            StringBuilder stackOut_106_1 = null;
            String stackOut_106_2 = null;
            RuntimeException stackOut_108_0 = null;
            StringBuilder stackOut_108_1 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            String stackOut_110_2 = null;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            String stackOut_109_2 = null;
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
                      stackOut_3_0 = -1;
                      stackIn_4_0 = stackOut_3_0;
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
                              stackOut_27_0 = var6_int;
                              stackIn_28_0 = stackOut_27_0;
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
                        var6_ref = kb.field_q.i(-53);
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
                            dh.field_o = stackIn_40_0 != 0;
                            if (0 == (var7 & 8)) {
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
                            cd.field_a = stackIn_43_0 != 0;
                            if ((2 & var7) == 0) {
                              stackOut_45_0 = 0;
                              stackIn_46_0 = stackOut_45_0;
                              break L13;
                            } else {
                              stackOut_44_0 = 1;
                              stackIn_46_0 = stackOut_44_0;
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
                          stackOut_51_0 = 0;
                          stackIn_52_0 = stackOut_51_0;
                          break L14;
                        } else {
                          stackOut_50_0 = 1;
                          stackIn_52_0 = stackOut_50_0;
                          break L14;
                        }
                      }
                      L15: {
                        ef.field_n = stackIn_52_0 != 0;
                        if (mc.field_k) {
                          discarded$5 = kb.field_q.d((byte) -99);
                          discarded$6 = kb.field_q.d((byte) -99);
                          discarded$7 = kb.field_q.f(-117);
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
                        if (var6_ref != null) {
                          qi.a(var6_ref, -7011, lk.q(13));
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
                                  discarded$8 = ii.a((byte) 81, "unzap", lk.q(13));
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
                            discarded$9 = ii.a(new Object[]{la.a(ua.field_g, true)}, 6760, "zap", lk.q(param2 + 2485));
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
                          stackOut_78_0 = ua.field_c;
                          stackIn_79_0 = stackOut_78_0;
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
                            stackOut_90_0 = -1;
                            stackIn_91_0 = stackOut_90_0;
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
                      stackOut_88_0 = ua.field_c;
                      stackIn_89_0 = stackOut_88_0;
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
                        stackOut_101_0 = 3;
                        stackIn_102_0 = stackOut_101_0;
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
                  stackOut_103_0 = -1;
                  stackIn_104_0 = stackOut_103_0;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  stackOut_93_0 = 123;
                  stackIn_94_0 = stackOut_93_0;
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_105_0 = (RuntimeException) (var6);
                stackOut_105_1 = new StringBuilder().append("hn.D(").append(param0).append(',');
                stackIn_107_0 = stackOut_105_0;
                stackIn_107_1 = stackOut_105_1;
                stackIn_106_0 = stackOut_105_0;
                stackIn_106_1 = stackOut_105_1;
                if (param1 == null) {
                  stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
                  stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
                  stackOut_107_2 = "null";
                  stackIn_108_0 = stackOut_107_0;
                  stackIn_108_1 = stackOut_107_1;
                  stackIn_108_2 = stackOut_107_2;
                  break L32;
                } else {
                  stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
                  stackOut_106_1 = (StringBuilder) ((Object) stackIn_106_1);
                  stackOut_106_2 = "{...}";
                  stackIn_108_0 = stackOut_106_0;
                  stackIn_108_1 = stackOut_106_1;
                  stackIn_108_2 = stackOut_106_2;
                  break L32;
                }
              }
              L33: {
                stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
                stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                stackIn_110_0 = stackOut_108_0;
                stackIn_110_1 = stackOut_108_1;
                stackIn_109_0 = stackOut_108_0;
                stackIn_109_1 = stackOut_108_1;
                if (param5 == null) {
                  stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
                  stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
                  stackOut_110_2 = "null";
                  stackIn_111_0 = stackOut_110_0;
                  stackIn_111_1 = stackOut_110_1;
                  stackIn_111_2 = stackOut_110_2;
                  break L33;
                } else {
                  stackOut_109_0 = (RuntimeException) ((Object) stackIn_109_0);
                  stackOut_109_1 = (StringBuilder) ((Object) stackIn_109_1);
                  stackOut_109_2 = "{...}";
                  stackIn_111_0 = stackOut_109_0;
                  stackIn_111_1 = stackOut_109_1;
                  stackIn_111_2 = stackOut_109_2;
                  break L33;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_111_0), stackIn_111_2 + ')');
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
        int discarded$0 = 0;
        try {
            if (param2 < 21) {
                String var5 = (String) null;
                discarded$0 = hn.a(false, (String) null, 8, true, 77, (String) null);
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
