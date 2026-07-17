/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends h {
    private vl field_J;
    static mh field_K;
    static String field_G;
    static jp field_I;
    static String field_H;

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (param1 == 21543) {
            break L0;
          } else {
            var4 = null;
            cp.a(103, 104, 91, (byte) -14, (j) null, 105, 90);
            break L0;
          }
        }
        L1: {
          if (0 >= go.field_c) {
            if (og.h(-26090)) {
              var2 = 0;
              break L1;
            } else {
              var2 = 1;
              break L1;
            }
          } else {
            L2: {
              if (null == jj.field_a) {
                ua.field_d = ff.a(0, 0, 640, 480, true, lp.field_ub);
                break L2;
              } else {
                ua.field_d = jj.field_a.a(true);
                qm.a(97, 2);
                break L2;
              }
            }
            if (ua.field_d == null) {
              var2 = 3;
              break L1;
            } else {
              var2 = 2;
              ap.a((byte) 117, (java.awt.Canvas) (Object) ua.field_d);
              break L1;
            }
          }
        }
        L3: {
          if (null != jj.field_a) {
            break L3;
          } else {
            if (!gh.field_c) {
              break L3;
            } else {
              int discarded$1 = 104;
              bq.a(param0, var2);
              break L3;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (((cp) this).field_l != null) {
            ((cp) this).field_l.a(true, param3 + -20607, param1, (oc) this, param0);
        }
        kh var5 = new kh(((cp) this).field_J);
        oc var6 = (oc) (Object) var5.a(true);
        while (var6 != null) {
            var6.a(param0 - -((cp) this).field_w, param1 - -((cp) this).field_o, param2, (byte) -11);
            var6 = (oc) (Object) var5.d(-24706);
        }
        if (param3 != -11) {
            field_G = null;
        }
    }

    public static void j(byte param0) {
        field_I = null;
        field_G = null;
        if (param0 > -91) {
            Object var2 = null;
            cp.a(-80, 69, (ta) null, 50, (ta) null, -32);
        }
        field_H = null;
        field_K = null;
    }

    final void a(int param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 > -119) {
            return;
        }
        kh var2 = new kh(((cp) this).field_J);
        jc var3 = (jc) (Object) var2.a(240);
        while (var3 != null) {
            var3.field_N = false;
            var3 = (jc) (Object) var2.b(7);
        }
        ((cp) this).field_E = null;
    }

    final void a(int param0, oc param1) {
        jc var3 = null;
        try {
            if (!(param1 instanceof jc)) {
                throw new IllegalArgumentException();
            }
            var3 = (jc) (Object) param1;
            if (param0 > -63) {
                cp.j((byte) -73);
            }
            ((cp) this).field_J.a(true, (nm) (Object) var3);
            var3.field_N = true;
            boolean discarded$0 = var3.a(true, (oc) this);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "cp.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void i(byte param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        kh var2 = new kh(((cp) this).field_J);
        jc var3 = (jc) (Object) var2.a(240);
        if (param0 != -36) {
            return;
        }
        while (var3 != null) {
            if (!(!var3.a(-94))) {
                var3.b((byte) 111);
            }
            var3 = (jc) (Object) var2.b(param0 ^ -37);
        }
    }

    public cp() {
        super(0, 0, mn.field_y, r.field_w, (ub) null, (uh) null);
        ((cp) this).field_J = new vl();
    }

    final static lo a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        lo var5 = null;
        lo stackIn_4_0 = null;
        lo stackIn_7_0 = null;
        lo stackIn_12_0 = null;
        lo stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        lo stackOut_13_0 = null;
        lo stackOut_11_0 = null;
        lo stackOut_6_0 = null;
        lo stackOut_3_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() != 0) {
                  var2_int = param0.indexOf('@');
                  if (-1 != var2_int) {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int - -1);
                    var5 = h.a(var3, false);
                    if (var5 == null) {
                      int discarded$2 = 0;
                      stackOut_13_0 = ji.a(var4);
                      stackIn_14_0 = stackOut_13_0;
                      break L0;
                    } else {
                      stackOut_11_0 = (lo) var5;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    }
                  } else {
                    stackOut_6_0 = la.field_a;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = tl.field_b;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("cp.L(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + -24 + 41);
        }
        return stackIn_14_0;
    }

    final static void a(int param0, int param1, ta param2, int param3, ta param4, int param5) {
        try {
            kn.field_y = param1;
            cn.field_c = param5;
            if (param3 <= 25) {
                cp.h(24);
            }
            cd.field_c = param4;
            jb.field_H = param0;
            c.field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "cp.Q(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    final void i(int param0) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var3 = 18 / ((36 - param0) / 43);
        kh var2 = new kh(((cp) this).field_J);
        jc var4 = (jc) (Object) var2.a(240);
        while (var4 != null) {
            if (var4.h(0)) {
                var4.b((byte) 111);
            }
            var4 = (jc) (Object) var2.b(7);
        }
        ((cp) this).field_E = (oc) (Object) ((cp) this).g(-126);
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ta var9 = null;
        int var10 = 0;
        Object var11 = null;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        int stackIn_39_0 = 0;
        ta stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        ta stackOut_43_0 = null;
        ta stackOut_42_0 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = jq.field_r;
              var2 = 0;
              if (param0 == -16546) {
                break L1;
              } else {
                var11 = null;
                cp.a(-114, -15, 90, (byte) -109, (j) null, -85, -67);
                break L1;
              }
            }
            L2: {
              if (ih.field_p != 2) {
                break L2;
              } else {
                var3_long = -un.field_g + ue.a(false);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (0 > var2) {
                  var2 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (qh.field_i.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = BrickABrac.field_K[var3];
                  if (var4 < 0) {
                    var5 = cc.field_H;
                    break L4;
                  } else {
                    if (mh.field_H.field_j != var4) {
                      var5 = eb.field_n;
                      break L4;
                    } else {
                      var5 = vq.field_A;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = qh.field_i[var3];
                  if (2 != ih.field_p) {
                    break L5;
                  } else {
                    if (1 != var2) {
                      break L5;
                    } else {
                      L6: {
                        if (rg.field_k.length >= ik.field_b.length) {
                          stackOut_18_0 = rg.field_k.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L6;
                        } else {
                          stackOut_17_0 = ik.field_b.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (fk.field_h.length <= h.field_F.length) {
                          stackOut_21_0 = h.field_F.length;
                          stackIn_22_0 = stackOut_21_0;
                          break L7;
                        } else {
                          stackOut_20_0 = fk.field_h.length;
                          stackIn_22_0 = stackOut_20_0;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_22_0;
                        if (var3 < 6) {
                          break L8;
                        } else {
                          if (6 - -var7 <= var3) {
                            break L8;
                          } else {
                            L9: {
                              if (-var7 + -6 + var3 - -rg.field_k.length < 0) {
                                stackOut_26_0 = "";
                                stackIn_27_0 = stackOut_26_0;
                                break L9;
                              } else {
                                stackOut_25_0 = rg.field_k[-var7 + var3 + (-6 + rg.field_k.length)];
                                stackIn_27_0 = stackOut_25_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_27_0;
                            break L8;
                          }
                        }
                      }
                      if (7 + var7 > var3) {
                        break L5;
                      } else {
                        if (7 - (-var7 + -var8) <= var3) {
                          break L5;
                        } else {
                          L10: {
                            if (-var7 + (var3 - 7) < h.field_F.length) {
                              stackOut_32_0 = h.field_F[var3 + (-7 + -var7)];
                              stackIn_33_0 = stackOut_32_0;
                              break L10;
                            } else {
                              stackOut_31_0 = "";
                              stackIn_33_0 = stackOut_31_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (-2 != var4) {
                    break L11;
                  } else {
                    var6 = Integer.toString(var2);
                    break L11;
                  }
                }
                L12: {
                  if (0 > var4) {
                    stackOut_38_0 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    break L12;
                  } else {
                    stackOut_37_0 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    break L12;
                  }
                }
                L13: {
                  int discarded$1 = 0;
                  var7 = hm.a(stackIn_39_0 != 0, var6);
                  var8 = wi.field_k + -(var7 >> 1);
                  if (var4 >= 0) {
                    L14: {
                      var1_int = var1_int + kn.field_y;
                      if (mh.field_H.field_j != var4) {
                        stackOut_43_0 = cd.field_c;
                        stackIn_44_0 = stackOut_43_0;
                        break L14;
                      } else {
                        stackOut_42_0 = c.field_l;
                        stackIn_44_0 = stackOut_42_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_44_0;
                      if (var9 != null) {
                        var9.a((cn.field_c << 1) + var7, b.field_c + (jb.field_H << 1), -cn.field_c + var8, false, var1_int);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var1_int = var1_int + jb.field_H;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if (var4 >= 0) {
                    kp.field_b.c(var6, var8, var1_int - -so.field_b, var5, -1);
                    var1_int = var1_int + (jb.field_H + (kn.field_y - -b.field_c));
                    break L16;
                  } else {
                    ni.field_Wb.c(var6, var8, var1_int + ae.field_f, var5, -1);
                    var1_int = var1_int + pe.field_s;
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "cp.F(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, j param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        jp var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (-51 < param4.field_U) {
              return;
            } else {
              L1: {
                var7_int = param4.field_U - 50;
                var8 = var7_int * 96 / 100;
                if (-97 >= var8) {
                  break L1;
                } else {
                  var8 = 96;
                  break L1;
                }
              }
              L2: {
                stackOut_5_0 = param0;
                stackOut_5_1 = param5;
                stackOut_5_2 = param1 / param6;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                if (param6 != 1) {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  break L2;
                } else {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = 35;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  break L2;
                }
              }
              L3: {
                lb.d(stackIn_8_0, stackIn_8_1, stackIn_8_2, -stackIn_8_3 + param2 / param6, 0, var8);
                if (150 >= var7_int * 2) {
                  break L3;
                } else {
                  if (param4.field_zb <= 0) {
                    break L3;
                  } else {
                    if (param4.field_zb + -1 < a.field_s.length) {
                      L4: {
                        var8 = -75 + var7_int;
                        if (50 < var8) {
                          var8 = 50;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var8 = 256 * var8 / 50;
                      var9 = a.field_s[param4.field_zb + -1];
                      var9.b(param0 + (param1 + -(param6 * var9.field_x)) / (param6 * 2), param5 + (param2 + -(var9.field_z * param6)) / (param6 * 2), var8);
                      lo.a(param1, var8, 60, param0, param6, param5, param2, param4);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L5: {
                if (param3 >= 118) {
                  break L5;
                } else {
                  cp.a(true, 86);
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var7;
            stackOut_19_1 = new StringBuilder().append("cp.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static eg b(int param0, int param1) {
        int var6 = BrickABrac.field_J ? 1 : 0;
        eg var5 = (eg) (Object) qc.field_n.d(-91);
        while (var5 != null) {
            if (var5.field_l == param1) {
                return var5;
            }
            var5 = (eg) (Object) qc.field_n.a((byte) 116);
        }
        eg var7 = new eg();
        var5 = var7;
        var7.field_q = 10;
        var7.field_p = 2;
        var5.field_l = param1;
        qc.field_n.a((nm) (Object) var5, (byte) 3);
        int discarded$0 = 68;
        uo.a(var5, 3);
        return var5;
    }

    final oc h(byte param0) {
        kh var2 = null;
        jc var3 = null;
        int var4 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          var2 = new kh(((cp) this).field_J);
          if (param0 == 25) {
            break L0;
          } else {
            cp.j((byte) -34);
            break L0;
          }
        }
        var3 = (jc) (Object) var2.a(param0 + 215);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_N) {
              var3 = (jc) (Object) var2.b(7);
              continue L1;
            } else {
              return var3.g((byte) -3);
            }
          } else {
            return null;
          }
        }
    }

    final jc g(int param0) {
        kh var2 = null;
        jc var3 = null;
        int var4 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          if (param0 < -96) {
            break L0;
          } else {
            field_G = null;
            break L0;
          }
        }
        var2 = new kh(((cp) this).field_J);
        var3 = (jc) (Object) var2.a(240);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_N) {
              return var3;
            } else {
              var3 = (jc) (Object) var2.b(7);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<%0> would need a rating of <%1> to play with the current options.";
        field_G = "Confirm Password: ";
    }
}
