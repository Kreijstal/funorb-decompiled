/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static ei field_f;
    static java.awt.Font field_d;
    static pj[] field_c;
    private int[] field_a;
    static String field_e;
    static String field_b;

    final static int a(String param0, String param1, byte param2, boolean param3, boolean param4, int param5) {
        try {
            int stackIn_9_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_71_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_114_0 = 0;
            int stackIn_131_0 = 0;
            int stackIn_133_0 = 0;
            int stackIn_148_0 = 0;
            int stackIn_150_0 = 0;
            RuntimeException stackIn_154_0 = null;
            StringBuilder stackIn_154_1 = null;
            RuntimeException stackIn_155_0 = null;
            StringBuilder stackIn_155_1 = null;
            String stackIn_155_2 = null;
            StringBuilder stackIn_158_1 = null;
            StringBuilder stackIn_159_1 = null;
            String stackIn_159_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            var9 = Torquing.field_u;
            try {
              L0: {
                L1: {
                  if (param2 == 27) {
                    break L1;
                  } else {
                    field_b = (String) null;
                    break L1;
                  }
                }
                L2: {
                  if (null != vk.field_E) {
                    break L2;
                  } else {
                    var6_int = mo.a(269, param3) ? 1 : 0;
                    if (var6_int == 0) {
                      stackIn_9_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (ef.field_a == tb.field_o) {
                    L4: {
                      if (param3) {
                        eh.field_i = tp.a((byte) -51, false, param0, (String) null, qd.field_e);
                        break L4;
                      } else {
                        eh.field_i = ab.a(param1, param0, 130, false);
                        break L4;
                      }
                    }
                    wa.field_d.field_n = 0;
                    wa.field_d.b(90, 14);
                    wa.field_d.b(90, eh.field_i.a(false).field_a);
                    jd.a((byte) -122, -1);
                    ef.field_a = en.field_v;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (en.field_v == ef.field_a) {
                    if (!no.a(1, 0)) {
                      break L5;
                    } else {
                      L6: {
                        var6_int = kj.field_d.i((byte) -101);
                        if (0 == var6_int) {
                          ef.field_a = aa.field_U;
                          break L6;
                        } else {
                          oo.field_a = -1;
                          ef.field_a = ld.field_e;
                          fa.field_e = var6_int;
                          break L6;
                        }
                      }
                      kj.field_d.field_n = 0;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (aa.field_U != ef.field_a) {
                    break L7;
                  } else {
                    if (!no.a(8, 0)) {
                      break L7;
                    } else {
                      ij.field_l = kj.field_d.b(48);
                      kj.field_d.field_n = 0;
                      id.a(eh.field_i, param5, param3, 19, param4);
                      ef.field_a = qi.field_a;
                      break L7;
                    }
                  }
                }
                L8: {
                  if (ef.field_a == qi.field_a) {
                    if (no.a(1, 0)) {
                      L9: {
                        var6_int = kj.field_d.i((byte) -101);
                        fa.field_e = var6_int;
                        kj.field_d.field_n = 0;
                        wh.field_u = null;
                        if (var6_int == 0) {
                          break L9;
                        } else {
                          if (1 == var6_int) {
                            break L9;
                          } else {
                            if (8 != var6_int) {
                              ef.field_a = ld.field_e;
                              oo.field_a = -1;
                              break L8;
                            } else {
                              ih.b(true);
                              lh.field_J = false;
                              stackIn_51_0 = var6_int;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                      }
                      ef.field_a = p.field_t;
                      oo.field_a = -1;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L10: {
                  if (p.field_t != ef.field_a) {
                    break L10;
                  } else {
                    if (ah.a(2)) {
                      L11: {
                        qd.field_e = kj.field_d.b(param2 + 44);
                        ri.field_E = kj.field_d.i((byte) -101);
                        kj.field_d.i((byte) -101);
                        wp.field_w = kj.field_d.i(7088);
                        var6 = kj.field_d.a(param2 + -8);
                        var7 = kj.field_d.i((byte) -101);
                        if (0 == (1 & var7)) {
                          break L11;
                        } else {
                          pc.b(false);
                          break L11;
                        }
                      }
                      L12: {
                        if (!param3) {
                          L13: {
                            if (0 == (4 & var7)) {
                              stackIn_71_0 = 0;
                              break L13;
                            } else {
                              stackIn_71_0 = 1;
                              break L13;
                            }
                          }
                          L14: {
                            fj.field_l = stackIn_71_0 != 0;
                            if ((var7 & 8) == 0) {
                              stackIn_75_0 = 0;
                              break L14;
                            } else {
                              stackIn_75_0 = 1;
                              break L14;
                            }
                          }
                          qi.field_c = stackIn_75_0 != 0;
                          if (!qi.field_c) {
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                      L15: {
                        if (!ql.field_t) {
                          break L15;
                        } else {
                          kj.field_d.i((byte) -101);
                          kj.field_d.i((byte) -101);
                          kj.field_d.c((byte) -85);
                          mf.field_w = kj.field_d.i(param2 ^ 7083);
                          uf.field_n = new byte[mf.field_w];
                          var8 = 0;
                          L16: while (true) {
                            if ((mf.field_w ^ -1) >= (var8 ^ -1)) {
                              break L15;
                            } else {
                              uf.field_n[var8] = kj.field_d.f((byte) 111);
                              var8++;
                              continue L16;
                            }
                          }
                        }
                      }
                      L17: {
                        re.field_e = kj.field_d.h((byte) 126);
                        tj.field_j = hf.a((CharSequence) ((Object) re.field_e), param2 + 82);
                        pa.field_c = kj.field_d.i((byte) -101);
                        ef.field_a = w.field_cb;
                        if (eh.field_i.a(false) == im.field_J) {
                          mf.field_u.a(ip.a(param2 + -18), false);
                          break L17;
                        } else {
                          if (eh.field_i.a(false) == hg.field_f) {
                            h.field_l.a(ip.a(param2 ^ 18), false);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        lh.field_J = false;
                        if (null == var6) {
                          break L18;
                        } else {
                          om.a((byte) -75, var6, ip.a(9));
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (-1 > (wp.field_w ^ -1)) {
                            break L20;
                          } else {
                            if (!fj.field_l) {
                              try {
                                L21: {
                                  hp.a(ip.a(9), (byte) -85, "unzap");
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
                            } else {
                              break L20;
                            }
                          }
                        }
                        try {
                          L23: {
                            hp.a(ip.a(param2 + -18), new Object[]{kp.a((byte) -87, qd.field_e)}, 28989, "zap");
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
                        if (-1 > (wp.field_w ^ -1)) {
                          ao.field_b = true;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      wa.field_d.a((byte) -111, od.field_s);
                      var8 = 0;
                      L26: while (true) {
                        if (var8 >= 4) {
                          kj.field_d.a((byte) -114, od.field_s);
                          stackIn_114_0 = fa.field_e;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          od.field_s[var8] = od.field_s[var8] + 50;
                          var8++;
                          continue L26;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                L27: {
                  if (ld.field_e != ef.field_a) {
                    break L27;
                  } else {
                    if (!ah.a(2)) {
                      break L27;
                    } else {
                      L28: {
                        ih.b(true);
                        if (7 != fa.field_e) {
                          break L28;
                        } else {
                          if (!lh.field_J) {
                            lh.field_J = true;
                            stackIn_133_0 = -1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L29: {
                        if ((fa.field_e ^ -1) != -8) {
                          break L29;
                        } else {
                          fa.field_e = 3;
                          break L29;
                        }
                      }
                      pl.field_u = kj.field_d.h((byte) 125);
                      lh.field_J = false;
                      stackIn_131_0 = fa.field_e;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                L30: {
                  if (null == vk.field_E) {
                    if (lh.field_J) {
                      L31: {
                        if (lc.h((byte) -76) <= 30000L) {
                          pl.field_u = hq.field_e;
                          break L31;
                        } else {
                          pl.field_u = eb.field_h;
                          break L31;
                        }
                      }
                      lh.field_J = false;
                      stackIn_148_0 = 3;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      var6_int = ea.field_t;
                      ea.field_t = sf.field_a;
                      lh.field_J = true;
                      sf.field_a = var6_int;
                      break L30;
                    }
                  } else {
                    break L30;
                  }
                }
                stackIn_150_0 = -1;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_154_0 = (RuntimeException) (var6_ref);

                stackIn_154_1 = new StringBuilder().append("vb.B(");

                if (param0 == null) {
                  stackIn_155_0 = (RuntimeException) ((Object) stackIn_154_0);
                  stackIn_155_1 = (StringBuilder) ((Object) stackIn_154_1);
                  stackIn_155_2 = "null";
                  break L32;
                } else {
                  stackIn_155_0 = (RuntimeException) ((Object) stackIn_154_0);
                  stackIn_155_1 = (StringBuilder) ((Object) stackIn_154_1);
                  stackIn_155_2 = "{...}";
                  break L32;
                }
              }
              L33: {


                stackIn_158_1 = ((StringBuilder) (Object) stackIn_155_1).append(stackIn_155_2).append(',');

                if (param1 == null) {
                  stackIn_155_0 = (RuntimeException) ((Object) stackIn_155_0);
                  stackIn_159_1 = (StringBuilder) ((Object) stackIn_158_1);
                  stackIn_159_2 = "null";
                  break L33;
                } else {
                  stackIn_155_0 = (RuntimeException) ((Object) stackIn_155_0);
                  stackIn_159_1 = (StringBuilder) ((Object) stackIn_158_1);
                  stackIn_159_2 = "{...}";
                  break L33;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_155_0), stackIn_159_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_51_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_114_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_131_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_133_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_148_0;
                      } else {
                        return stackIn_150_0;
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

    final static bp a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        bp stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              L2: {
                if ((var3 ^ -1) <= (var2_int ^ -1)) {
                  stackIn_14_0 = param0;
                  stackIn_14_1 = 4;
                  break L2;
                } else {
                  var4 = param1.charAt(var3);
                  stackIn_14_0 = 48;

                  stackIn_14_1 = var4;

                  L3: {
                    if (stackIn_14_0 > stackIn_14_1) {
                      break L3;
                    } else {
                      if (-58 <= (var4 ^ -1)) {
                        var3++;
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_11_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              L4: {
                if (stackIn_14_0 == stackIn_14_1) {
                  break L4;
                } else {
                  field_d = (java.awt.Font) null;
                  break L4;
                }
              }
              stackIn_18_0 = va.field_H;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("vb.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bp) ((Object) stackIn_11_0);
        } else {
          return stackIn_18_0;
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            stackIn_1_0 = param0 ^ param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var4), "vb.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(of param0, byte param1, boolean param2, int[] param3, int[] param4, boolean param5, boolean param6) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        var30 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param3[3] >> 517023714;
              var22 = param3[4] >> 111208226;
              var23 = param3[5] >> 772715554;
              var24 = param3[6] >> -922600190;
              var25 = param3[7] >> 1997382626;
              var26 = param3[8] >> 2007497762;
              var27 = param3[9] >> 1683189730;
              var28 = param3[10] >> 2119630434;
              var29 = param3[11] >> 1190166498;
              var13 = var24 * param4[3] - (-(param4[4] * var25) - param4[5] * var26) >> 1870256750;
              var12 = var23 * param4[5] + var22 * param4[4] + var21 * param4[3] >> 736439694;
              var19 = var26 * param4[11] + param4[10] * var25 + param4[9] * var24 >> -843360722;
              var18 = var22 * param4[10] + var21 * param4[9] + param4[11] * var23 >> 801816878;
              var20 = var27 * param4[9] + (param4[10] * var28 + param4[11] * var29) >> -1199575442;
              var16 = var26 * param4[8] + var25 * param4[7] + param4[6] * var24 >> -332738642;
              var17 = param4[8] * var29 + (var28 * param4[7] + var27 * param4[6]) >> -1952218962;
              var14 = param4[4] * var28 + (var27 * param4[3] - -(param4[5] * var29)) >> 1936421230;
              var15 = var22 * param4[7] + var21 * param4[6] - -(var23 * param4[8]) >> 301812238;
              var21 = -param3[0] + param4[0];
              var22 = param4[1] + -param3[1];
              var23 = -param3[2] + param4[2];
              var9 = var23 * param3[5] + (var21 * param3[3] - -(param3[4] * var22)) >> -oe.field_b + 16;
              var10 = param3[8] * var23 + (param3[7] * var22 + param3[6] * var21) >> -oe.field_b + 16;
              var11 = param3[9] * var21 - (-(var22 * param3[10]) + -(var23 * param3[11])) >> 1702762960;
              if (param1 == -77) {
                break L1;
              } else {
                vb.a(96);
                break L1;
              }
            }
            var21 = be.field_g;
            var22 = be.field_b;
            var23 = 0;
            L2: while (true) {
              L3: {
                if ((param0.field_f ^ -1) >= (var23 ^ -1)) {
                  L4: {
                    if (null == param0.field_N) {
                      break L4;
                    } else {
                      if (null == param0.field_v) {
                        break L4;
                      } else {
                        if (param0.field_w == null) {
                          break L4;
                        } else {
                          if (param0.field_L == null) {
                            break L4;
                          } else {
                            if (param0.field_k == null) {
                              break L4;
                            } else {
                              if (null == param0.field_h) {
                                break L4;
                              } else {
                                if (param0.field_K == null) {
                                  break L4;
                                } else {
                                  if (null == param0.field_D) {
                                    break L4;
                                  } else {
                                    if (param0.field_n == null) {
                                      break L4;
                                    } else {
                                      var23 = 0;
                                      L5: while (true) {
                                        if (var23 >= param0.field_R) {
                                          break L4;
                                        } else {
                                          var24 = param0.field_N[var23];
                                          var25 = param0.field_v[var23];
                                          var26 = param0.field_w[var23];
                                          in.field_b[var23] = (var18 * var26 + var12 * var24 + var25 * var15 >> -1842954800) + var9;
                                          io.field_s[var23] = var10 - -(var19 * var26 + (var25 * var16 + var13 * var24) >> 2061036144);
                                          vk.field_z[var23] = var11 + (var24 * var14 - -(var25 * var17) + var26 * var20 >> -604297040);
                                          var24 = param0.field_L[var23];
                                          var25 = param0.field_k[var23];
                                          var26 = param0.field_h[var23];
                                          pc.field_d[var23] = (var26 * var18 + (var24 * var12 - -(var15 * var25)) >> 1707507280) + var9;
                                          no.field_j[var23] = (var16 * var25 + (var24 * var13 + var19 * var26) >> 1511937968) + var10;
                                          up.field_b[var23] = var11 - -(var20 * var26 + var25 * var17 + var14 * var24 >> -1364043856);
                                          var24 = param0.field_K[var23];
                                          var25 = param0.field_D[var23];
                                          var26 = param0.field_n[var23];
                                          ok.field_D[var23] = var9 + (var18 * var26 + (var12 * var24 + var15 * var25) >> 266460432);
                                          hm.field_s[var23] = var10 - -(var16 * var25 + (var24 * var13 - -(var19 * var26)) >> -226659344);
                                          uf.field_r[var23] = (var26 * var20 + var25 * var17 + var14 * var24 >> 730965488) + var11;
                                          var23++;
                                          continue L5;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param5) {
                    var9 = param4[3];
                    var10 = param4[4];
                    var11 = param4[5];
                    var12 = param4[6];
                    var13 = param4[7];
                    var14 = param4[8];
                    var15 = param4[9];
                    var16 = param4[10];
                    var17 = param4[11];
                    var18 = 0;
                    L6: while (true) {
                      stackIn_60_0 = var18 ^ -1;
                      stackIn_60_1 = param0.field_C ^ -1;
                      if (stackIn_60_0 <= stackIn_60_1) {
                        break L3;
                      } else {
                        if ((m.field_c.length ^ -1) >= (var18 ^ -1)) {
                          break L3;
                        } else {
                          var19 = param0.field_q[var18];
                          var20 = param0.field_P[var18];
                          var21 = param0.field_a[var18];
                          m.field_c[var18] = var20 * var12 + (var9 * var19 - -(var15 * var21)) >> 999459088;
                          pm.field_s[var18] = var13 * var20 + var19 * var10 + var21 * var16 >> -1169515184;
                          tm.field_e[var18] = var21 * var17 + var11 * var19 - -(var14 * var20) >> -1820118576;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                } else {
                  var24 = param0.field_B[var23];
                  var25 = param0.field_j[var23];
                  var26 = param0.field_d[var23];
                  var27 = var9 + (var15 * var25 + var12 * var24 + var26 * var18 >> 16 - oe.field_b);
                  var28 = var10 + (var25 * var16 + (var24 * var13 - -(var19 * var26)) >> 16 - oe.field_b);
                  var29 = (var26 * var20 + var25 * var17 + var14 * var24 >> 1108730512) + var11;
                  stackIn_60_0 = var29;

                  stackIn_60_1 = 50;

                  L8: {
                    if (stackIn_60_0 < stackIn_60_1) {
                      hl.field_b[var23] = -2147483648;
                      break L8;
                    } else {
                      L9: {
                        kh.field_m[var23] = var27 / var29 + var21;
                        u.field_w[var23] = var28 / var29 + var22;
                        if (var7_int > var29) {
                          var7_int = var29;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      hl.field_b[var23] = var29;
                      if (var29 <= var8) {
                        break L8;
                      } else {
                        var8 = var29;
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (param6) {
                      dj.field_c[var23] = var27 >> oe.field_b;
                      gi.field_a[var23] = var28 >> oe.field_b;
                      ud.field_k[var23] = var29;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var23++;
                  continue L2;
                }
              }
              vf.a(param0, var7_int, var8, param2, (byte) 120);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var7);

            stackIn_70_1 = new StringBuilder().append("vb.D(");

            if (param0 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L11;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L12;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');

            if (param4 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L13;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L13;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_71_0), stackIn_79_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final int a(int param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 == -485) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            var3_int = (this.field_a.length >> 590681601) + -1;
            var4 = param0 & var3_int;
            L2: while (true) {
              var5 = this.field_a[var4 + (var4 + 1)];
              if ((var5 ^ -1) != 0) {
                if (param0 == this.field_a[var4 + var4]) {
                  stackIn_12_0 = var5;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = 1 + var4 & var3_int;
                  continue L2;
                }
              } else {
                stackIn_7_0 = -1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3), "vb.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static void a(boolean param0, String param1, boolean param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              km.a(30);
              dc.field_a.h(63);
              un.field_k = new pe(eo.field_a, (String) null, ff.field_a, param0, param2);
              if (param3 == 4805) {
                break L1;
              } else {
                vb.a((of) null, (byte) 25, false, (int[]) null, (int[]) null, false, true);
                break L1;
              }
            }
            hb.field_x = new qc(dc.field_a, un.field_k);
            dc.field_a.a(hb.field_x, (byte) 113);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("vb.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_f = null;
              if (param0 > 3) {
                break L1;
              } else {
                vb.a(56, (String) null);
                break L1;
              }
            }
            field_e = null;
            field_d = null;
            field_b = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "vb.G(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 32) {
                break L1;
              } else {
                vb.a((String) null, (String) null, (byte) -26, false, true, 109);
                break L1;
              }
            }
            stackIn_4_0 = sh.b(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var4), "vb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    vb(int[] param0) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > param0.length - -(param0.length >> 1985557825)) {
                this.field_a = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if ((var3 ^ -1) <= (var2_int + var2_int ^ -1)) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = var2_int - 1 & param0[var3];
                        L4: while (true) {
                          if ((this.field_a[1 + (var4 + var4)] ^ -1) == 0) {
                            this.field_a[var4 + var4] = param0[var3];
                            this.field_a[var4 + (var4 + 1)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & var4 + 1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_a[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("vb.<init>(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_c = new pj[32];
        field_f = new ei();
        field_e = "SOUND:";
        field_b = "Click";
    }
}
