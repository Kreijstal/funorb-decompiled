/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends ro {
    static int field_z;
    static String field_B;

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_z = 16;
                break L1;
              }
            }
            field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "lc.F(" + param0 + ')');
        }
    }

    public lc() {
    }

    final static bp a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        bp stackIn_5_0 = null;
        bp stackIn_10_0 = null;
        bp stackIn_24_0 = null;
        bp stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        bp stackOut_4_0 = null;
        bp stackOut_9_0 = null;
        bp stackOut_26_0 = null;
        bp stackOut_23_0 = null;
        Object stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            var2_int = param1.length();
            if (0 == var2_int) {
              stackOut_4_0 = oj.field_l;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (var2_int > 63) {
                stackOut_9_0 = wn.field_s;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                L1: {
                  if (!param0) {
                    break L1;
                  } else {
                    lc.a(-40, -69, -28, 124, -109, 120, -40);
                    break L1;
                  }
                }
                var3 = 0;
                L2: while (true) {
                  L3: {
                    if (var3 >= var2_int) {
                      break L3;
                    } else {
                      L4: {
                        var4 = param1.charAt(var3);
                        if (var4 != 45) {
                          if (kl.field_t.indexOf(var4) != -1) {
                            break L4;
                          } else {
                            stackOut_26_0 = va.field_H;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          }
                        } else {
                          L5: {
                            if (var3 == 0) {
                              break L5;
                            } else {
                              if (var2_int - 1 != var3) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          stackOut_23_0 = va.field_H;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_29_0 = null;
                  stackIn_30_0 = stackOut_29_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("lc.C(").append(param0).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return (bp) (Object) stackIn_30_0;
    }

    final static long h(byte param0) {
        RuntimeException var1 = null;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_3_0 = 0L;
        long stackOut_1_0 = 0L;
        try {
          L0: {
            if (param0 == -76) {
              stackOut_3_0 = km.b(-1) - rb.field_C;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -86L;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "lc.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (-param5 + param1 < kn.field_e) {
                  break L2;
                } else {
                  if (qg.field_z < param1 - -param5) {
                    break L2;
                  } else {
                    if (j.field_q > param3 - param5) {
                      break L2;
                    } else {
                      if (param3 + param5 > qk.field_p) {
                        break L2;
                      } else {
                        mh.a(param0, param1, param5, param6, param3, 15783, param4);
                        if (Torquing.field_u == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              ue.a(-15788, param1, param3, param6, param5, param0, param4);
              break L1;
            }
            var7_int = 124 / ((param2 - -16) / 61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var7, "lc.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_16_0 = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                var3 = ((lc) this).field_r.a(15142, param1);
                if (!((lc) this).field_r.field_b) {
                  break L2;
                } else {
                  if (((lc) this).c(-31292)) {
                    var4 = var3[0];
                    var5 = var3[1];
                    var6 = var3[2];
                    var7 = ((lc) this).field_u * (param1 % ((lc) this).field_u);
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= ci.field_c) {
                        break L2;
                      } else {
                        var9 = ((lc) this).field_s[var8 % ((lc) this).field_x + var7];
                        var6[var8] = ie.a(4080, var9 << 1059507172);
                        var5[var8] = ie.a(var9 >> -188440796, 4080);
                        var4[var8] = ie.a(4080, var9 >> 774516140);
                        var8++;
                        if (var10 != 0) {
                          break L1;
                        } else {
                          if (var10 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (param0 == -29116) {
                break L1;
              } else {
                field_z = 43;
                break L1;
              }
            }
            stackOut_16_0 = (int[][]) var3;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var3_ref, "lc.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        t var1_ref = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            ph.c(243, 197, 369, 143, 16777215);
            ph.d(244, 198, 367, 141, 0);
            if (null == nc.field_d) {
              L1: {
                if (null != kl.field_o) {
                  int discarded$3 = kl.field_o.a(vo.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                L3: {
                  var1_ref = nc.field_d[da.field_a];
                  if (null == var1_ref) {
                    break L3;
                  } else {
                    var1_ref.d(245, 199);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (kl.field_o != null) {
                  int discarded$4 = kl.field_o.a(vo.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (param0 >= 68) {
                  break L4;
                } else {
                  lc.g(6);
                  break L4;
                }
              }
              L5: {
                if (~op.field_j < ~mf.field_t) {
                  var1_ref = nc.field_d[gf.field_h];
                  if (null != var1_ref) {
                    L6: {
                      var2_int = (60 + var1_ref.field_w) * mf.field_t / op.field_j;
                      var3 = var2_int - 30;
                      if (!pp.field_c) {
                        break L6;
                      } else {
                        ql.a(-256 * var3 / 30, 245, var1_ref, 199, (-var3 + var1_ref.field_w) * 256 / 30, (byte) -122);
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ql.a(256 * (var1_ref.field_w + -var3) / 30, 245, var1_ref, 199, -256 * var3 / 30, (byte) -81);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L7: {
                if (null == kl.field_o) {
                  break L7;
                } else {
                  var2 = null;
                  var3 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (var3 >= nc.field_d.length) {
                          break L10;
                        } else {
                          var1_ref = nc.field_d[var3];
                          if (var4 != 0) {
                            break L9;
                          } else {
                            L11: {
                              if (var1_ref == null) {
                                break L11;
                              } else {
                                L12: {
                                  if (var1_ref.field_w != 365) {
                                    break L12;
                                  } else {
                                    if (var1_ref.field_u == 139) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  if (null != var2) {
                                    break L13;
                                  } else {
                                    var2 = (Object) (Object) Integer.toString(var3);
                                    if (var4 == 0) {
                                      break L11;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                var2 = (Object) (Object) ((String) var2 + ", " + var3);
                                break L11;
                              }
                            }
                            var3++;
                            if (var4 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (null != var2) {
                        break L9;
                      } else {
                        break L7;
                      }
                    }
                    int discarded$5 = kl.field_o.a("Screenshot(s) " + (String) var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L7;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "lc.J(" + param0 + ')');
        }
    }

    final static void b(int param0, int param1) {
        df var2 = null;
        try {
            var2 = wa.field_d;
            var2.f(87, param1);
            var2.b(90, 1);
            var2.b(90, param0);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "lc.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        uf[] var1_array = null;
        int[] var2 = null;
        short[] var3 = null;
        t var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        kh var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        sg var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        rm var13_ref_rm = null;
        int var14 = 0;
        int var15_int = 0;
        t var15 = null;
        int var16 = 0;
        t var16_ref_t = null;
        int var17 = 0;
        kh var17_ref_kh = null;
        sg var18 = null;
        int var18_int = 0;
        int[] var19 = null;
        int var19_int = 0;
        int[] var20 = null;
        t var20_ref = null;
        int[] var21_ref_int__ = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        long var24 = 0L;
        int var26 = 0;
        int var27 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        var27 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var1_array = new uf[]{new uf((uc) (Object) qh.field_c, 0, 517, 298, (sm) null, 0, 0)};
              var2 = new int[]{0, 1, 2, 4, 6, 5, 9, 18, 7, 8};
              var3 = new short[]{(short) 0, (short) 2, (short) 4, (short) 3, (short) 1, (short) 5};
              var4 = new t(8, 1);
              var5 = ph.field_e;
              var6 = ph.field_j;
              var7 = ph.field_d;
              var1_array = rh.a((byte) -101, var1_array, var4, vd.field_a);
              ln.a(1, 0, var1_array, (byte) -58);
              if (param0 == -1339942685) {
                break L1;
              } else {
                field_B = null;
                break L1;
              }
            }
            var1_array = rh.a((byte) 114, var1_array, kl.field_p, "");
            var1_array[0].a((byte) -15, 2);
            var1_array = rh.a((byte) 116, var1_array, var4, hl.field_c);
            var1_array[0].a((byte) 101, 1);
            var1_array = rh.a((byte) 125, var1_array, var4, q.field_i);
            ln.a(1, 0, var1_array, (byte) -58);
            var1_array[-1 + var1_array.length].c(0);
            var1_array[var1_array.length + -1].d(102);
            var1_array = rh.a((byte) -122, var1_array, var4, eq.field_c);
            ln.a(0, dd.field_c.field_x, var1_array, (byte) -58);
            hh.field_e = new t[m.field_n.length];
            be.field_g = 30;
            var8 = var2;
            var9 = 0;
            L2: while (true) {
              stackOut_5_0 = ~var8.length;
              stackOut_5_1 = ~var9;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_6_0 >= stackIn_6_1) {
                      break L5;
                    } else {
                      var10 = var8[var9];
                      if (var27 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (m.field_n[var10] != null) {
                            var11_int = be.field_l[200];
                            var12 = be.field_o[200];
                            var13_ref_rm = vc.field_c[var10].field_l;
                            var14 = 99999;
                            var15_int = -99999;
                            var16 = 0;
                            L7: while (true) {
                              L8: {
                                if (~var16 <= ~var13_ref_rm.field_f) {
                                  break L8;
                                } else {
                                  var17 = var13_ref_rm.field_B[var16];
                                  var18_int = var13_ref_rm.field_E[var16];
                                  var19_int = var12 * var17 - var18_int * var11_int >> -1164166256;
                                  var18_int = var11_int * var17 - -(var18_int * var12) >> -740545232;
                                  var17 = (var19_int << -875284055) / (1024 + var18_int);
                                  stackOut_15_0 = var17;
                                  stackOut_15_1 = var14;
                                  stackIn_6_0 = stackOut_15_0;
                                  stackIn_6_1 = stackOut_15_1;
                                  stackIn_16_0 = stackOut_15_0;
                                  stackIn_16_1 = stackOut_15_1;
                                  if (var27 != 0) {
                                    continue L3;
                                  } else {
                                    L9: {
                                      if (stackIn_16_0 >= stackIn_16_1) {
                                        break L9;
                                      } else {
                                        var14 = var17;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (~var17 >= ~var15_int) {
                                        break L10;
                                      } else {
                                        var15_int = var17;
                                        break L10;
                                      }
                                    }
                                    var16++;
                                    if (var27 == 0) {
                                      continue L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              L11: {
                                L12: {
                                  var16_ref_t = new t(60, -var14 + (1 + var15_int));
                                  hh.field_e[var10] = var16_ref_t;
                                  var16_ref_t.e();
                                  be.a();
                                  var17_ref_kh = vc.field_c[var10];
                                  var18 = new sg(1);
                                  var18.a(0, var17_ref_kh);
                                  var19 = new int[]{0, 0, 0, 65535, 0, 0, 0, var12, var11_int, 0, -var11_int, var12};
                                  if (var10 == 1) {
                                    var20 = new int[]{0, 0, 0, 0, 0, 65536, 0, 65536, 0, 65536, 0, 0};
                                    var21_ref_int__ = new int[12];
                                    var22 = 0;
                                    L13: while (true) {
                                      stackOut_25_0 = 3;
                                      stackIn_26_0 = stackOut_25_0;
                                      L14: while (true) {
                                        L15: {
                                          if (stackIn_26_0 <= var22) {
                                            break L15;
                                          } else {
                                            stackOut_27_0 = 0;
                                            stackIn_42_0 = stackOut_27_0;
                                            stackIn_28_0 = stackOut_27_0;
                                            if (var27 != 0) {
                                              break L11;
                                            } else {
                                              var23 = stackIn_28_0;
                                              L16: while (true) {
                                                L17: {
                                                  if (3 <= var23) {
                                                    break L17;
                                                  } else {
                                                    var24 = 0L;
                                                    stackOut_30_0 = 0;
                                                    stackIn_26_0 = stackOut_30_0;
                                                    stackIn_31_0 = stackOut_30_0;
                                                    if (var27 != 0) {
                                                      continue L14;
                                                    } else {
                                                      var26 = stackIn_31_0;
                                                      L18: while (true) {
                                                        L19: {
                                                          L20: {
                                                            if (3 <= var26) {
                                                              break L20;
                                                            } else {
                                                              var24 = var24 + (long)var19[3 + (var23 + var26 * 3)] * (long)var20[var22 * 3 + var26 - -3];
                                                              var26++;
                                                              if (var27 != 0) {
                                                                break L19;
                                                              } else {
                                                                if (var27 == 0) {
                                                                  continue L18;
                                                                } else {
                                                                  break L20;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var21_ref_int__[3 + (var22 * 3 + var23)] = (int)(var24 >>> 1388403856);
                                                          var23++;
                                                          break L19;
                                                        }
                                                        if (var27 == 0) {
                                                          continue L16;
                                                        } else {
                                                          break L17;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var22++;
                                                if (var27 == 0) {
                                                  continue L13;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var19 = var21_ref_int__;
                                        break L12;
                                      }
                                    }
                                  } else {
                                    break L12;
                                  }
                                }
                                var18.a(var17_ref_kh, var19);
                                sg.a(var17_ref_kh, 80, 1365, -1, -12, 12);
                                be.field_b = -var14;
                                var18.a(new int[12]);
                                stackOut_41_0 = var10;
                                stackIn_42_0 = stackOut_41_0;
                                break L11;
                              }
                              L21: {
                                if (stackIn_42_0 == 0) {
                                  var20_ref = new t(60, var15_int - (var14 - -31));
                                  var21 = (-31 + (var15_int + -var14)) / 2;
                                  t.a(var16_ref_t, var20_ref, 0, 0, 0, 0, 60, var21);
                                  var22 = -var21 + var20_ref.field_t;
                                  t.a(var16_ref_t, var20_ref, 0, var16_ref_t.field_t - var22, 0, var21, 60, var22);
                                  var16_ref_t = new t(var20_ref.field_s, var20_ref.field_t / 2);
                                  var16_ref_t.e();
                                  var20_ref.c(var20_ref.field_s << 1980166307, var20_ref.field_t << -1339942685, var16_ref_t.field_s << 471761315, var16_ref_t.field_t << -1328843485, 0, 2048);
                                  hh.field_e[var10] = var16_ref_t;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              var1_array = rh.a((byte) 111, var1_array, var16_ref_t, m.field_n[var10]);
                              ln.a(0, dd.field_c.field_x, var1_array, (byte) -58);
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var9++;
                        if (var27 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var1_array[-1 + var1_array.length].d(param0 ^ -1339942758);
                  var1_array = rh.a((byte) -110, var1_array, var4, vp.field_G);
                  ln.a(0, dd.field_c.field_x, var1_array, (byte) -58);
                  break L4;
                }
                var8_ref = new kh(new rm(8, 2, 2));
                var8_ref.field_q = new mp(2);
                int discarded$4 = var8_ref.field_l.a(-60, -60, 0);
                int discarded$5 = var8_ref.field_l.a(60, -60, 0);
                int discarded$6 = var8_ref.field_l.a(-60, 60, 0);
                int discarded$7 = var8_ref.field_l.a(60, 60, 0);
                oj.a(3, (short) 0, 0, false, true, 1, 0, (short) -1, 2, var8_ref);
                oj.a(1, (short) 0, 3, false, true, 2, 3, (short) -1, 1, var8_ref);
                var9 = be.field_l[1664];
                var10 = be.field_o[1664];
                be.field_g = 40;
                var11 = new sg(1);
                var11.a(0, var8_ref);
                var11.a(var8_ref, new int[12]);
                var12 = 99999;
                var13 = -99999;
                var14 = 0;
                L22: while (true) {
                  L23: {
                    L24: {
                      L25: {
                        L26: {
                          if (~var8_ref.field_l.field_f >= ~var14) {
                            break L26;
                          } else {
                            var15_int = var8_ref.field_l.field_B[var14];
                            var16 = var8_ref.field_l.field_E[var14];
                            var17 = var10 * var15_int + -(var16 * var9) >> -1836488944;
                            var16 = var16 * var10 + var9 * var15_int >> -848667088;
                            var15_int = (var17 << -1478939895) / (var16 + 1024);
                            stackOut_50_0 = ~var12;
                            stackOut_50_1 = ~var15_int;
                            stackIn_60_0 = stackOut_50_0;
                            stackIn_60_1 = stackOut_50_1;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            if (var27 != 0) {
                              L27: while (true) {
                                if (stackIn_60_0 <= stackIn_60_1) {
                                  break L24;
                                } else {
                                  var15 = new t(80, var13 + 1 - var12);
                                  var15.e();
                                  be.a();
                                  var8_ref.field_l.field_A[0] = var3[var14];
                                  var8_ref.field_l.field_m[1] = (short)be.field_c.b((int) var3[var14]);
                                  var8_ref.field_q.field_v = null;
                                  var8_ref.field_k = null;
                                  var11.a(0, 80, 1365, 0, -1, 0);
                                  be.field_b = -var12;
                                  var11.a(new int[12]);
                                  var1_array = rh.a((byte) 120, var1_array, var15, ga.field_d[var3[var14]]);
                                  ln.a(0, dd.field_c.field_x, var1_array, (byte) -58);
                                  var14++;
                                  if (var27 != 0) {
                                    break L23;
                                  } else {
                                    if (var27 == 0) {
                                      stackOut_59_0 = ga.field_d.length;
                                      stackOut_59_1 = var14;
                                      stackIn_60_0 = stackOut_59_0;
                                      stackIn_60_1 = stackOut_59_1;
                                      continue L27;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                            } else {
                              L28: {
                                if (stackIn_51_0 >= stackIn_51_1) {
                                  break L28;
                                } else {
                                  var12 = var15_int;
                                  break L28;
                                }
                              }
                              L29: {
                                if (var15_int <= var13) {
                                  break L29;
                                } else {
                                  var13 = var15_int;
                                  break L29;
                                }
                              }
                              var14++;
                              if (var27 == 0) {
                                continue L22;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        var14 = 0;
                        L30: while (true) {
                          stackOut_59_0 = ga.field_d.length;
                          stackOut_59_1 = var14;
                          stackIn_60_0 = stackOut_59_0;
                          stackIn_60_1 = stackOut_59_1;
                          if (stackIn_60_0 <= stackIn_60_1) {
                            break L24;
                          } else {
                            var15 = new t(80, var13 + 1 - var12);
                            var15.e();
                            be.a();
                            var8_ref.field_l.field_A[0] = var3[var14];
                            var8_ref.field_l.field_m[1] = (short)be.field_c.b((int) var3[var14]);
                            var8_ref.field_q.field_v = null;
                            var8_ref.field_k = null;
                            var11.a(0, 80, 1365, 0, -1, 0);
                            be.field_b = -var12;
                            var11.a(new int[12]);
                            var1_array = rh.a((byte) 120, var1_array, var15, ga.field_d[var3[var14]]);
                            ln.a(0, dd.field_c.field_x, var1_array, (byte) -58);
                            var14++;
                            if (var27 != 0) {
                              break L23;
                            } else {
                              if (var27 == 0) {
                                continue L30;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      break L24;
                    }
                    var1_array[var1_array.length + -1].c(0);
                    hg.field_b = var1_array;
                    ph.a(var5, var6, var7);
                    be.a();
                    break L23;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "lc.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 0;
        field_B = "achievements to collect";
    }
}
