/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij implements t {
    private int field_f;
    private int field_n;
    private oh field_i;
    private int field_a;
    private int field_k;
    private int field_b;
    private int field_c;
    private int field_h;
    static ba field_j;
    private int field_l;
    private int field_e;
    private int field_m;
    private int field_g;
    static wg field_d;

    final static void a(byte param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        var14 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param6 >= param2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (1 + param6 < param4) {
                L1: {
                  if (param6 + 5 >= param4) {
                    break L1;
                  } else {
                    if (param1 == param3) {
                      break L1;
                    } else {
                      var7_int = (param1 >> -2077643295) + (param3 >> -371611871) + (param1 & param3 & 1);
                      if (param0 > 98) {
                        var8 = param6;
                        var9 = param3;
                        var10 = param1;
                        var11 = param6;
                        L2: while (true) {
                          if (param4 <= var11) {
                            ij.a((byte) 125, var9, param2, param3, var8, param5, param6);
                            ij.a((byte) 116, param1, param2, var10, param4, param5, var8);
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            L3: {
                              var12 = lf.field_Y[var11];
                              if (param5) {
                                stackOut_25_0 = g.field_u[var12];
                                stackIn_26_0 = stackOut_25_0;
                                break L3;
                              } else {
                                stackOut_24_0 = va.field_e[var12];
                                stackIn_26_0 = stackOut_24_0;
                                break L3;
                              }
                            }
                            L4: {
                              var13 = stackIn_26_0;
                              if (var13 <= var7_int) {
                                if (var10 < var13) {
                                  var10 = var13;
                                  break L4;
                                } else {
                                  var11++;
                                  continue L2;
                                }
                              } else {
                                lf.field_Y[var11] = lf.field_Y[var8];
                                incrementValue$1 = var8;
                                var8++;
                                lf.field_Y[incrementValue$1] = var12;
                                if (var13 < var9) {
                                  var9 = var13;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
                var7_int = param4 - 1;
                L5: while (true) {
                  if (param6 >= var7_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param6;
                    L6: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = lf.field_Y[var8];
                          var10 = lf.field_Y[1 + var8];
                          if (rk.a(var9, (byte) 86, var10, param5)) {
                            lf.field_Y[var8] = var10;
                            lf.field_Y[1 + var8] = var9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var7), "ij.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 13809) {
            break L0;
          } else {
            field_j = (ba) null;
            break L0;
          }
        }
        L1: {
          if (hd.field_p == null) {
            break L1;
          } else {
            var1 = hd.field_p;
            synchronized (var1) {
              L2: {
                hd.field_p = null;
                break L2;
              }
            }
            break L1;
          }
        }
    }

    final static void a(dh param0, int param1, int param2) {
        boolean discarded$0 = false;
        try {
            pa.field_c.a((byte) -115, param0);
            if (param2 > -120) {
                discarded$0 = ij.b(63);
            }
            me.a(param0, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ij.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 != 1) {
            field_j = (ba) null;
            return true;
        }
        return true;
    }

    public static void c(int param0) {
        field_j = null;
        field_d = null;
        if (param0 != -18515) {
            field_d = (wg) null;
        }
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ed var11 = null;
        al stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        al stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof ed) {
                stackOut_2_0 = (al) (param1);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (al) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var11 = (ed) ((Object) stackIn_3_0);
              if (var11 == null) {
                break L2;
              } else {
                param3 = param3 & var11.field_B;
                break L2;
              }
            }
            if (param0 == -24969) {
              L3: {
                var7 = 5592405;
                ll.c(param1.field_p + param4, param2 + param1.field_m, param1.field_x, param1.field_u, this.field_a);
                if (param3) {
                  var7 = 16777215;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var8 = param1.field_p + param4 - -this.field_c;
                var9 = this.field_e + (param2 + param1.field_m);
                ll.a(var8, var9, this.field_l, this.field_m, 5592405);
                ll.c(var8, var9, this.field_l, this.field_m, var7);
                if (var11.field_G) {
                  ll.e(var8, var9, var8 - -this.field_l, var9 - -this.field_m, 1);
                  ll.e(var8 + this.field_l, var9, var8, var9 + this.field_m, 1);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (this.field_i == null) {
                  break L5;
                } else {
                  var10 = this.field_b + (this.field_l + this.field_c);
                  discarded$1 = this.field_i.a(param1.field_s, var10 + (param1.field_p + param4), this.field_f + (param2 + param1.field_m), param1.field_x + (-this.field_b + -var10), param1.field_u - (this.field_b << -1220046175), this.field_n, this.field_k, this.field_h, this.field_g, 0);
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6);
            stackOut_16_1 = new StringBuilder().append("ij.L(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (param0 > -83) {
            field_j = (ba) null;
        }
        if (224 > kc.field_b) {
            var1 = kc.field_b % 32;
            qd.a(false, 32 + kc.field_b + -var1);
        } else {
            qd.a(false, 256);
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        String[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        String[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        String[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String stackIn_33_2 = null;
        String[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_39_2 = null;
        int stackIn_88_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        String[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_38_2 = null;
        String[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_37_2 = null;
        String[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        String[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        String stackOut_32_2 = null;
        String[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        String stackOut_31_2 = null;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              di.field_h = param1;
              mh.field_i = true;
              if (di.field_h == 0) {
                var3_int = h.a((byte) -8, r.field_k, sc.field_f, s.field_a, ok.field_C);
                var4 = var3_int + 3;
                sa.field_I = new String[var4];
                mj.field_b = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    ac.field_c = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        sa.field_I[var4 - 3] = "";
                        sa.field_I[-2 + var4] = ma.field_a;
                        mj.field_b[-2 + var4] = 0;
                        ac.field_c[0] = 4;
                        sa.field_I[-1 + var4] = me.field_k;
                        mj.field_b[-1 + var4] = 1;
                        ac.field_c[1] = 5;
                        break L1;
                      } else {
                        sa.field_I[var5] = ok.field_C[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    mj.field_b[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (di.field_h == 1) {
                  var3_int = h.a((byte) -8, r.field_k, sc.field_f, s.field_a, ok.field_C);
                  var4 = var3_int + 2;
                  sa.field_I = new String[var4];
                  mj.field_b = new int[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var4) {
                      ac.field_c = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var3_int <= var5) {
                          sa.field_I[-2 + var4] = "";
                          sa.field_I[var4 + -1] = me.field_k;
                          mj.field_b[-1 + var4] = 0;
                          ac.field_c[0] = 5;
                          break L1;
                        } else {
                          sa.field_I[var5] = ok.field_C[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      mj.field_b[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if (di.field_h != 2) {
                    if (-4 == (di.field_h ^ -1)) {
                      L6: {
                        if (!rg.field_c.field_l) {
                          var3_int = h.a((byte) -8, r.field_k, sc.field_f, bf.field_c, ok.field_C);
                          break L6;
                        } else {
                          var3_int = h.a((byte) -8, r.field_k, sc.field_f, lj.field_b, ok.field_C);
                          break L6;
                        }
                      }
                      var4 = var3_int + 2;
                      mj.field_b = new int[var4];
                      sa.field_I = new String[var4];
                      var5 = 0;
                      L7: while (true) {
                        if (var5 >= var4) {
                          ac.field_c = new int[1];
                          var5 = 0;
                          L8: while (true) {
                            if (var3_int <= var5) {
                              sa.field_I[-2 + var4] = "";
                              sa.field_I[-1 + var4] = me.field_k;
                              mj.field_b[var4 + -1] = 0;
                              ac.field_c[0] = 5;
                              break L1;
                            } else {
                              sa.field_I[var5] = ok.field_C[var5];
                              var5++;
                              continue L8;
                            }
                          }
                        } else {
                          mj.field_b[var5] = -1;
                          var5++;
                          continue L7;
                        }
                      }
                    } else {
                      if (-5 == (di.field_h ^ -1)) {
                        var3_int = h.a((byte) -8, r.field_k, sc.field_f, fj.field_O, ok.field_C);
                        var4 = 2 - -var3_int;
                        sa.field_I = new String[var4];
                        mj.field_b = new int[var4];
                        var5 = 0;
                        L9: while (true) {
                          if (var5 >= var4) {
                            ac.field_c = new int[1];
                            var5 = 0;
                            L10: while (true) {
                              if (var5 >= var3_int) {
                                sa.field_I[-2 + var4] = "";
                                sa.field_I[-1 + var4] = me.field_k;
                                mj.field_b[-1 + var4] = 0;
                                ac.field_c[0] = 5;
                                break L1;
                              } else {
                                sa.field_I[var5] = ok.field_C[var5];
                                var5++;
                                continue L10;
                              }
                            }
                          } else {
                            mj.field_b[var5] = -1;
                            var5++;
                            continue L9;
                          }
                        }
                      } else {
                        if ((di.field_h ^ -1) == -6) {
                          var3_int = h.a((byte) -8, r.field_k, sc.field_f, cg.field_e, ok.field_C);
                          var4 = var3_int + 3;
                          sa.field_I = new String[var4];
                          mj.field_b = new int[var4];
                          var5 = 0;
                          L11: while (true) {
                            if (var5 >= var4) {
                              ac.field_c = new int[2];
                              var5 = 0;
                              L12: while (true) {
                                if (var3_int <= var5) {
                                  sa.field_I[-3 + var4] = "";
                                  sa.field_I[-2 + var4] = vk.field_i;
                                  mj.field_b[-2 + var4] = 0;
                                  ac.field_c[0] = 3;
                                  sa.field_I[-1 + var4] = me.field_k;
                                  mj.field_b[var4 + -1] = 1;
                                  ac.field_c[1] = 5;
                                  break L1;
                                } else {
                                  sa.field_I[var5] = ok.field_C[var5];
                                  var5++;
                                  continue L12;
                                }
                              }
                            } else {
                              mj.field_b[var5] = -1;
                              var5++;
                              continue L11;
                            }
                          }
                        } else {
                          throw new IllegalArgumentException();
                        }
                      }
                    }
                  } else {
                    var3_int = h.a((byte) -8, r.field_k, sc.field_f, dh.a((byte) -64, new String[]{"<br><%0><br>"}, mc.field_J), ok.field_C);
                    var4 = -1;
                    var5 = 0;
                    L13: while (true) {
                      L14: {
                        if (var3_int <= var5) {
                          break L14;
                        } else {
                          if (!"<%0>".equals(ok.field_C[var5])) {
                            var5++;
                            continue L13;
                          } else {
                            var4 = var5;
                            break L14;
                          }
                        }
                      }
                      if ((var4 ^ -1) != 0) {
                        el.field_O = new String[var4];
                        pd.a(ok.field_C, 0, el.field_O, 0, var4);
                        bk.field_J = new String[-1 + var3_int - var4];
                        pd.a(ok.field_C, var4 + 1, bk.field_J, 0, var3_int - var4 - 1);
                        var3_int = h.a((byte) -8, r.field_k, sc.field_f, dh.a((byte) -61, new String[]{"<br><%0><br>"}, le.field_a), ok.field_C);
                        var4 = -1;
                        var5 = 0;
                        L15: while (true) {
                          L16: {
                            if (var3_int <= var5) {
                              break L16;
                            } else {
                              if (!"<%0>".equals(ok.field_C[var5])) {
                                var5++;
                                continue L15;
                              } else {
                                var4 = var5;
                                break L16;
                              }
                            }
                          }
                          if (var4 == -1) {
                            throw new IllegalStateException();
                          } else {
                            L17: {
                              jf.field_i = new String[var4];
                              pd.a(ok.field_C, 0, jf.field_i, 0, var4);
                              ue.field_c = new String[-var4 + var3_int + -1];
                              pd.a(ok.field_C, 1 + var4, ue.field_c, 0, -1 + (var3_int - var4));
                              if (jf.field_i.length > el.field_O.length) {
                                stackOut_21_0 = jf.field_i.length;
                                stackIn_22_0 = stackOut_21_0;
                                break L17;
                              } else {
                                stackOut_20_0 = el.field_O.length;
                                stackIn_22_0 = stackOut_20_0;
                                break L17;
                              }
                            }
                            L18: {
                              var5 = stackIn_22_0;
                              if (ue.field_c.length <= bk.field_J.length) {
                                stackOut_24_0 = bk.field_J.length;
                                stackIn_25_0 = stackOut_24_0;
                                break L18;
                              } else {
                                stackOut_23_0 = ue.field_c.length;
                                stackIn_25_0 = stackOut_23_0;
                                break L18;
                              }
                            }
                            var6 = stackIn_25_0;
                            var7 = var6 + var5 + 7;
                            mj.field_b = new int[var7];
                            sa.field_I = new String[var7];
                            var8 = 0;
                            L19: while (true) {
                              if (var8 >= var7) {
                                sa.field_I[1] = lf.field_U;
                                ac.field_c = new int[2];
                                sa.field_I[0] = lg.field_c;
                                mj.field_b[1] = 0;
                                ac.field_c[1] = 2;
                                mj.field_b[3] = 1;
                                sa.field_I[2] = ji.field_d;
                                sa.field_I[4] = uh.field_d;
                                sa.field_I[3] = uk.field_e;
                                sa.field_I[5] = "";
                                ac.field_c[0] = 5;
                                var8 = 0;
                                L20: while (true) {
                                  if (var8 >= var5) {
                                    sa.field_I[var5 + 6] = null;
                                    mj.field_b[var5 + 6] = -2;
                                    var8 = 0;
                                    L21: while (true) {
                                      if (var6 <= var8) {
                                        fe.field_N = qg.a(false);
                                        break L1;
                                      } else {
                                        L22: {
                                          stackOut_36_0 = sa.field_I;
                                          stackOut_36_1 = var8 + (var5 + 7);
                                          stackIn_38_0 = stackOut_36_0;
                                          stackIn_38_1 = stackOut_36_1;
                                          stackIn_37_0 = stackOut_36_0;
                                          stackIn_37_1 = stackOut_36_1;
                                          if (ue.field_c.length <= var8) {
                                            stackOut_38_0 = (String[]) ((Object) stackIn_38_0);
                                            stackOut_38_1 = stackIn_38_1;
                                            stackOut_38_2 = "";
                                            stackIn_39_0 = stackOut_38_0;
                                            stackIn_39_1 = stackOut_38_1;
                                            stackIn_39_2 = stackOut_38_2;
                                            break L22;
                                          } else {
                                            stackOut_37_0 = (String[]) ((Object) stackIn_37_0);
                                            stackOut_37_1 = stackIn_37_1;
                                            stackOut_37_2 = ue.field_c[var8];
                                            stackIn_39_0 = stackOut_37_0;
                                            stackIn_39_1 = stackOut_37_1;
                                            stackIn_39_2 = stackOut_37_2;
                                            break L22;
                                          }
                                        }
                                        stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                                        var8++;
                                        continue L21;
                                      }
                                    }
                                  } else {
                                    L23: {
                                      stackOut_30_0 = sa.field_I;
                                      stackOut_30_1 = var8 + 6;
                                      stackIn_32_0 = stackOut_30_0;
                                      stackIn_32_1 = stackOut_30_1;
                                      stackIn_31_0 = stackOut_30_0;
                                      stackIn_31_1 = stackOut_30_1;
                                      if (jf.field_i.length + (var8 - var5) >= 0) {
                                        stackOut_32_0 = (String[]) ((Object) stackIn_32_0);
                                        stackOut_32_1 = stackIn_32_1;
                                        stackOut_32_2 = jf.field_i[var8 + jf.field_i.length + -var5];
                                        stackIn_33_0 = stackOut_32_0;
                                        stackIn_33_1 = stackOut_32_1;
                                        stackIn_33_2 = stackOut_32_2;
                                        break L23;
                                      } else {
                                        stackOut_31_0 = (String[]) ((Object) stackIn_31_0);
                                        stackOut_31_1 = stackIn_31_1;
                                        stackOut_31_2 = "";
                                        stackIn_33_0 = stackOut_31_0;
                                        stackIn_33_1 = stackOut_31_1;
                                        stackIn_33_2 = stackOut_31_2;
                                        break L23;
                                      }
                                    }
                                    stackIn_33_0[stackIn_33_1] = stackIn_33_2;
                                    var8++;
                                    continue L20;
                                  }
                                }
                              } else {
                                mj.field_b[var8] = -1;
                                var8++;
                                continue L19;
                              }
                            }
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                }
              }
            }
            vi.field_f.field_i = ac.field_c.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= sa.field_I.length) {
                L25: {
                  if (2 == di.field_h) {
                    var10 = el.field_O;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var10.length) {
                        var11 = bk.field_J;
                        var5 = 0;
                        L27: while (true) {
                          if (var11.length <= var5) {
                            break L25;
                          } else {
                            L28: {
                              var13 = var11[var5];
                              var7 = ib.a(false, 10, var13);
                              if (var3_int < var7) {
                                var3_int = var7;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            var5++;
                            continue L27;
                          }
                        }
                      } else {
                        L29: {
                          var12 = var10[var5];
                          var7 = ib.a(false, 10, var12);
                          if (var7 > var3_int) {
                            var3_int = var7;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                cd.field_b = var3_int + (sf.field_F - (var3_int >> 1313614081));
                bk.field_D = -(var3_int >> -649946719) + sf.field_F;
                oi.field_b = vi.field_f.field_i * (na.field_e + of.field_f << -643352447);
                var4 = 0;
                L30: while (true) {
                  if (var4 >= sa.field_I.length) {
                    L31: {
                      if (param0 >= 48) {
                        break L31;
                      } else {
                        field_j = (ba) null;
                        break L31;
                      }
                    }
                    me.field_q = gf.field_q + -(oi.field_b >> -163047871);
                    ud.field_a = new int[sa.field_I.length][];
                    var4 = 0;
                    var5 = me.field_q;
                    L32: while (true) {
                      if (sa.field_I.length <= var4) {
                        L33: {
                          if (di.field_h == 2) {
                            vi.field_f.a(-1, -1, param2, 113);
                            break L33;
                          } else {
                            vi.field_f.a(0, mg.b(fg.field_a, 0, kf.field_b), param2, 106);
                            break L33;
                          }
                        }
                        break L0;
                      } else {
                        L34: {
                          var6 = mj.field_b[var4];
                          if ((var6 ^ -1) > -1) {
                            var5 = var5 + dh.field_l;
                            break L34;
                          } else {
                            var7 = ib.a(true, 10, sa.field_I[var4]);
                            var8 = -(var7 >> 1881496193) + sf.field_F;
                            var5 = var5 + na.field_e;
                            ud.field_a[var4] = new int[4];
                            ud.field_a[var4][0] = -mb.field_c + var8;
                            ud.field_a[var4][1] = var5;
                            ud.field_a[var4][2] = (mb.field_c << 2045021537) + var7;
                            ud.field_a[var4][3] = pc.field_m - -(of.field_f << -1347668575);
                            var5 = var5 + (na.field_e + ((of.field_f << -515640159) + pc.field_m));
                            break L34;
                          }
                        }
                        var4++;
                        continue L32;
                      }
                    }
                  } else {
                    L35: {
                      stackOut_108_0 = oi.field_b;
                      stackIn_110_0 = stackOut_108_0;
                      stackIn_109_0 = stackOut_108_0;
                      if (mj.field_b[var4] < 0) {
                        stackOut_110_0 = stackIn_110_0;
                        stackOut_110_1 = dh.field_l;
                        stackIn_111_0 = stackOut_110_0;
                        stackIn_111_1 = stackOut_110_1;
                        break L35;
                      } else {
                        stackOut_109_0 = stackIn_109_0;
                        stackOut_109_1 = pc.field_m;
                        stackIn_111_0 = stackOut_109_0;
                        stackIn_111_1 = stackOut_109_1;
                        break L35;
                      }
                    }
                    oi.field_b = stackIn_111_0 + stackIn_111_1;
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L36: {
                  if (-1 < (mj.field_b[var4] ^ -1)) {
                    stackOut_87_0 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    break L36;
                  } else {
                    stackOut_86_0 = 1;
                    stackIn_88_0 = stackOut_86_0;
                    break L36;
                  }
                }
                L37: {
                  var5 = ib.a(stackIn_88_0 != 0, 10, sa.field_I[var4]);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                var4++;
                continue L24;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var3), "ij.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ij(oh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_h = 1;
        this.field_g = 1;
        try {
            this.field_a = param9;
            this.field_n = param3;
            this.field_e = param6;
            this.field_i = param0;
            this.field_b = param1;
            this.field_l = param8;
            this.field_m = param7;
            this.field_k = param4;
            this.field_f = param2;
            this.field_c = param5;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_j = new ba();
    }
}
