/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends id {
    static int field_F;
    boolean field_K;
    static cj field_O;
    static ef field_G;
    boolean field_H;
    static th field_M;
    private boolean field_J;
    private int field_P;
    static java.applet.Applet field_L;
    static String field_N;
    static String field_I;

    fd(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int[] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        int[] var10;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_J = false;
          stackIn_2_0 = this;

          if (-1 == (this.field_C & 1073741824 ^ -1)) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        L1: {
          ((fd) (this)).field_H = stackIn_3_1 != 0;
          stackIn_5_0 = this;

          if ((this.field_C & 536870912) == 0) {
            stackIn_6_0 = this;
            stackIn_6_1 = 0;
            break L1;
          } else {
            stackIn_6_0 = this;
            stackIn_6_1 = 1;
            break L1;
          }
        }
        ((fd) (this)).field_K = stackIn_6_1 != 0;
        this.field_P = this.field_C;
        this.field_P = this.field_P & -1610612737;
        this.field_P = this.field_P - 1;
        var10 = rb.field_c;
        var9 = var10;
        var8 = var9;
        var4 = var8;
        var5 = 0;
        L2: while (true) {
          L3: {
            if (var5 >= var10.length) {
              break L3;
            } else {
              var6 = var10[var5];
              if (var7 != 0) {
                break L3;
              } else {
                L4: {
                  if (this.field_P != var6) {
                    break L4;
                  } else {
                    this.field_J = true;
                    break L4;
                  }
                }
                var5++;
                if (var7 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
          }
          return;
        }
    }

    public static void g(byte param0) {
        field_G = null;
        field_M = null;
        field_L = null;
        if (param0 != 97) {
            return;
        }
        field_I = null;
        field_N = null;
        field_O = null;
    }

    final void a(int param0, nm param1) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -10136) {
                break L1;
              } else {
                field_M = (th) null;
                break L1;
              }
            }
            var3_int = param1.c(this.g(param0 ^ 10195), -20126);
            var4 = -24 + param1.d(this.h(param0 ^ -10230), 127);
            if (!io.a(var3_int, var4, (byte) -110, param1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!this.field_J) {
                  break L2;
                } else {
                  if (io.a(var3_int, -24 + var4, (byte) -114, param1)) {
                    break L2;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L3: {
                var5 = this.g(-128) / 24;
                var6 = this.h(-51) / 24;
                if (he.field_a) {
                  break L3;
                } else {
                  if ((var5 ^ -1) > -1) {
                    break L3;
                  } else {
                    if (var5 >= fb.field_e.field_u.field_k[0].length) {
                      break L3;
                    } else {
                      if (var6 < 0) {
                        break L3;
                      } else {
                        if (var6 >= fb.field_e.field_u.field_k.length) {
                          break L3;
                        } else {
                          if (fb.field_e.field_u.field_k[var6][var5]) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L4: {
                L5: {
                  if (!this.field_H) {
                    break L5;
                  } else {
                    if (!this.field_K) {
                      break L5;
                    } else {
                      od.field_Ab[this.field_P].d(var3_int, var4);
                      if (var7 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (this.field_H) {
                    break L6;
                  } else {
                    L7: {
                      if (!this.field_K) {
                        break L7;
                      } else {
                        od.field_Ab[this.field_P].a(var3_int, var4);
                        if (var7 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    od.field_Ab[this.field_P].g(var3_int, var4);
                    if (var7 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
                od.field_Ab[this.field_P].b(var3_int, var4);
                break L4;
              }
              L8: {
                if (!this.field_J) {
                  break L8;
                } else {
                  L9: {
                    if (!this.field_H) {
                      break L9;
                    } else {
                      od.field_Ab[-8 + this.field_P].b(var3_int, var4 + -24);
                      if (var7 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (!this.field_K) {
                      break L10;
                    } else {
                      od.field_Ab[-8 + this.field_P].a(var3_int, -24 + var4);
                      if (var7 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  od.field_Ab[-8 + this.field_P].g(var3_int, -24 + var4);
                  break L8;
                }
              }
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("fd.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L11;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void f(byte param0) {
        if (param0 > -79) {
            this.f((byte) 89);
        }
    }

    final static void h(byte param0) {
        oq.field_w = null;
        qp.field_t = (byte[][]) null;
        qj.field_o = null;
        vj.field_p = null;
        k.field_i = null;
        if (param0 <= 124) {
            field_G = (ef) null;
        }
        tp.field_t = null;
    }

    final static int a(int param0, boolean param1, boolean param2, String param3, String param4, int param5) {
        try {
            int stackIn_6_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_56_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_101_0 = 0;
            int stackIn_113_0 = 0;
            int stackIn_115_0 = 0;
            int stackIn_125_0 = 0;
            int stackIn_127_0 = 0;
            RuntimeException stackIn_129_0 = null;
            StringBuilder stackIn_129_1 = null;
            RuntimeException stackIn_130_0 = null;
            StringBuilder stackIn_130_1 = null;
            RuntimeException stackIn_131_0 = null;
            StringBuilder stackIn_131_1 = null;
            String stackIn_131_2 = null;
            RuntimeException stackIn_132_0 = null;
            StringBuilder stackIn_132_1 = null;
            RuntimeException stackIn_133_0 = null;
            StringBuilder stackIn_133_1 = null;
            RuntimeException stackIn_134_0 = null;
            StringBuilder stackIn_134_1 = null;
            String stackIn_134_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var6_int = 0;
            RuntimeException var6 = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (ki.field_h == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (!ee.a(param1, false)) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackIn_6_0 = -1;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            if (ud.field_cb != vo.field_l) {
                                statePc = 13;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (!param1) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var10 = (String) null;
                            ki.field_a = eg.a(64, ii.field_d, (String) null, false, param3);
                            if (var9 == 0) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ki.field_a = cn.a((byte) 125, param4, param3, false);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ma.field_a.field_j = 0;
                            ma.field_a.a(-94, 14);
                            ma.field_a.a(126, ki.field_a.b(param0 + -7).field_d);
                            cb.a(-1, false);
                            vo.field_l = de.field_h;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (param0 == 14) {
                                statePc = 16;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackIn_15_0 = -97;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            if (de.field_h == vo.field_l) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (fa.b(10, 1)) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var6_int = s.field_e.g(param0 ^ 31371);
                            s.field_e.field_j = 0;
                            if (-1 == (var6_int ^ -1)) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            hd.field_q = -1;
                            vo.field_l = gn.field_K;
                            op.field_i = var6_int;
                            if (var9 == 0) {
                                statePc = 24;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            vo.field_l = ul.field_n;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (ul.field_n != vo.field_l) {
                                statePc = 27;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (!fa.b(10, 8)) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            nm.field_c = s.field_e.a((byte) -30);
                            s.field_e.field_j = 0;
                            pi.a((byte) -59, param2, param1, ki.field_a, param5);
                            vo.field_l = lc.field_l;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (vo.field_l == lc.field_l) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (!fa.b(10, 1)) {
                                statePc = 37;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var6_int = s.field_e.g(31365);
                            s.field_e.field_j = 0;
                            oe.field_f = null;
                            op.field_i = var6_int;
                            if (var6_int == 0) {
                                statePc = 36;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var6_int == 1) {
                                statePc = 36;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (-9 != (var6_int ^ -1)) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            ak.a((byte) -111);
                            sk.field_j = false;
                            stackIn_34_0 = var6_int;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        try {
                            hd.field_q = -1;
                            vo.field_l = gn.field_K;
                            if (var9 == 0) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            hd.field_q = -1;
                            vo.field_l = qb.field_e;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (vo.field_l == qb.field_e) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (!dd.a(0)) {
                                statePc = 102;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ii.field_d = s.field_e.a((byte) -30);
                            ci.field_f = param3;
                            kj.field_q = s.field_e.g(31365);
                            am.field_b = s.field_e.g(31365);
                            vl.field_h = s.field_e.d((byte) 69);
                            var11 = s.field_e.g((byte) -89);
                            var7 = s.field_e.g(31365);
                            if ((var7 & 1) != 0) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            fj.a((byte) 85);
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (!param1) {
                                statePc = 53;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if ((var7 & 16) == 0) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackIn_47_0 = 1;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackIn_47_0 = 0;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            tm.field_b = stackIn_47_0 != 0;
                            if (!gj.field_e) {
                                statePc = 73;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            s.field_e.g(31365);
                            s.field_e.g(param0 + 31351);
                            s.field_e.i(-1478490344);
                            vn.field_f = s.field_e.d((byte) 69);
                            kq.field_b = new byte[vn.field_f];
                            var8 = 0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var8 >= vn.field_f) {
                                statePc = 73;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            kq.field_b[var8] = s.field_e.d(vg.a(param0, -249699574));
                            var8++;
                            if (var9 != 0) {
                                statePc = 74;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var9 == 0) {
                                statePc = 49;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (0 == (4 & var7)) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            stackIn_56_0 = 1;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            stackIn_56_0 = 0;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            fj.field_M = stackIn_56_0 != 0;
                            if ((2 & var7) == 0) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            stackIn_59_0 = 1;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            stackIn_59_0 = 0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            sh.field_L = stackIn_59_0 != 0;
                            if ((var7 & 8) == 0) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackIn_62_0 = 1;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackIn_62_0 = 0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            nh.field_m = stackIn_62_0 != 0;
                            if (!nh.field_m) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            sh.field_L = true;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if ((var7 & 16) == 0) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackIn_67_0 = 1;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            stackIn_67_0 = 0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            tm.field_b = stackIn_67_0 != 0;
                            if (!gj.field_e) {
                                statePc = 73;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            s.field_e.g(31365);
                            s.field_e.g(param0 + 31351);
                            s.field_e.i(-1478490344);
                            vn.field_f = s.field_e.d((byte) 69);
                            kq.field_b = new byte[vn.field_f];
                            var8 = 0;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var8 >= vn.field_f) {
                                statePc = 73;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            kq.field_b[var8] = s.field_e.d(vg.a(param0, -249699574));
                            var8++;
                            if (var9 != 0) {
                                statePc = 74;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var9 == 0) {
                                statePc = 69;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            ta.field_lb = s.field_e.f((byte) -48);
                            var12 = (CharSequence) ((Object) ta.field_lb);
                            kf.field_k = tg.a(var12, false);
                            qq.field_a = s.field_e.g(31365);
                            vo.field_l = pi.field_a;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (ki.field_a.b(7) != uq.field_b) {
                                statePc = 77;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            wp.field_b.a(-108, jl.b(0));
                            if (var9 == 0) {
                                statePc = 80;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (ki.field_a.b(7) == pl.field_G) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            l.field_c.a(-100, jl.b(0));
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            sk.field_j = false;
                            if (var11 == null) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            jh.a(jl.b(0), param0 ^ -15, var11);
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (-1 > (vl.field_h ^ -1)) {
                                statePc = 88;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if (fj.field_M) {
                                statePc = 88;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            fo.b(jl.b(0), 13093, "unzap");
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var8_ref_Throwable = caughtException;
                            if (var9 == 0) {
                                statePc = 91;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            fo.a(jl.b(0), "zap", (byte) 23, new Object[]{mc.a(ii.field_d, (byte) 26)});
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var8_ref_Throwable = caughtException;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if ((vl.field_h ^ -1) < -1) {
                                statePc = 93;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            cm.field_e = true;
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            ma.field_a.a((byte) -77, mj.field_Fb);
                            var8 = 0;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (4 <= var8) {
                                statePc = 99;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            mj.field_Fb[var8] = mj.field_Fb[var8] + 50;
                            var8++;
                            if (var9 != 0) {
                                statePc = 100;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (var9 == 0) {
                                statePc = 95;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            s.field_e.a((byte) -116, mj.field_Fb);
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            stackIn_101_0 = op.field_i;
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        return stackIn_101_0;
                    }
                    case 102: {
                        try {
                            if (vo.field_l == gn.field_K) {
                                statePc = 104;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            if (dd.a(0)) {
                                statePc = 106;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            ak.a((byte) -124);
                            if (op.field_i != 7) {
                                statePc = 109;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            if (!sk.field_j) {
                                statePc = 114;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            if ((op.field_i ^ -1) == -8) {
                                statePc = 111;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            op.field_i = 3;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            ol.field_q = s.field_e.f((byte) -31);
                            sk.field_j = false;
                            stackIn_113_0 = op.field_i;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        return stackIn_113_0;
                    }
                    case 114: {
                        try {
                            sk.field_j = true;
                            stackIn_115_0 = -1;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        return stackIn_115_0;
                    }
                    case 116: {
                        try {
                            if (ki.field_h == null) {
                                statePc = 118;
                            } else {
                                statePc = 117;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            statePc = 126;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            if (sk.field_j) {
                                statePc = 120;
                            } else {
                                statePc = 119;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            var6_int = jo.field_b;
                            jo.field_b = ff.field_s;
                            sk.field_j = true;
                            ff.field_s = var6_int;
                            if (var9 == 0) {
                                statePc = 126;
                            } else {
                                statePc = 120;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            if (-30001L > (he.b((byte) -22) ^ -1L)) {
                                statePc = 123;
                            } else {
                                statePc = 121;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            ol.field_q = ga.field_w;
                            if (var9 == 0) {
                                statePc = 124;
                            } else {
                                statePc = 122;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            statePc = 123;
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        try {
                            ol.field_q = aj.field_l;
                            statePc = 124;
                            continue stateLoop;
                        } catch (Throwable stateCaught_123) {
                            caughtException = stateCaught_123;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            sk.field_j = false;
                            stackIn_125_0 = 3;
                            statePc = 125;
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 125: {
                        return stackIn_125_0;
                    }
                    case 126: {
                        try {
                            stackIn_127_0 = -1;
                            statePc = 127;
                            continue stateLoop;
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = 128;
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        return stackIn_127_0;
                    }
                    case 128: {
                        var6 = (RuntimeException) ((Object) caughtException);
                        stackIn_130_0 = (RuntimeException) (var6);
                        stackIn_129_0 = stackIn_130_0;
                        stackIn_130_1 = new StringBuilder().append("fd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                        stackIn_129_1 = stackIn_130_1;
                        if (param3 == null) {
                            statePc = 130;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    }
                    case 129: {
                        stackIn_131_0 = (RuntimeException) ((Object) stackIn_129_0);
                        stackIn_131_1 = (StringBuilder) ((Object) stackIn_129_1);
                        stackIn_131_2 = "{...}";
                        statePc = 131;
                        continue stateLoop;
                    }
                    case 130: {
                        stackIn_131_0 = (RuntimeException) ((Object) stackIn_130_0);
                        stackIn_131_1 = (StringBuilder) ((Object) stackIn_130_1);
                        stackIn_131_2 = "null";
                        statePc = 131;
                        continue stateLoop;
                    }
                    case 131: {
                        stackIn_133_0 = (RuntimeException) ((Object) stackIn_131_0);
                        stackIn_132_0 = stackIn_133_0;
                        stackIn_133_1 = ((StringBuilder) (Object) stackIn_131_1).append(stackIn_131_2).append(',');
                        stackIn_132_1 = stackIn_133_1;
                        if (param4 == null) {
                            statePc = 133;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    }
                    case 132: {
                        stackIn_134_0 = (RuntimeException) ((Object) stackIn_132_0);
                        stackIn_134_1 = (StringBuilder) ((Object) stackIn_132_1);
                        stackIn_134_2 = "{...}";
                        statePc = 134;
                        continue stateLoop;
                    }
                    case 133: {
                        stackIn_134_0 = (RuntimeException) ((Object) stackIn_133_0);
                        stackIn_134_1 = (StringBuilder) ((Object) stackIn_133_1);
                        stackIn_134_2 = "null";
                        statePc = 134;
                        continue stateLoop;
                    }
                    case 134: {
                        throw fa.a((Throwable) ((Object) stackIn_134_0), stackIn_134_2 + ',' + param5 + ')');
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

    static {
        field_F = -1;
        field_M = new th();
        field_I = "You have declined the invitation.";
        field_N = "Elapsed time";
    }
}
