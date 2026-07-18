/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends vc {
    private int field_L;
    private String field_I;
    private uh field_H;
    private tg field_K;

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        String var5_ref = null;
        vf var6 = null;
        tg var7 = null;
        sf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                var6 = ((s) this).field_H.a((byte) 122);
                if (ui.field_o == var6) {
                  break L2;
                } else {
                  if (mi.field_c == var6) {
                    break L2;
                  } else {
                    var5_ref = ((s) this).field_H.c((byte) 66);
                    if (null != var5_ref) {
                      break L1;
                    } else {
                      var5_ref = ((s) this).field_I;
                      if (var13 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var5_ref = he.field_l;
              break L1;
            }
            L3: {
              if (!var5_ref.equals((Object) (Object) ((s) this).field_h)) {
                ((s) this).field_h = var5_ref;
                ((s) this).a(0);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              super.a(param0, param1, 111, param3);
              var6 = ((s) this).field_H.a((byte) 124);
              var8 = (sf) (Object) ((s) this).field_j;
              var9 = param3 + ((s) this).field_r;
              if (param2 > 33) {
                break L4;
              } else {
                ((s) this).a(-109, -117, 123, 87);
                break L4;
              }
            }
            L5: {
              L6: {
                var10 = var8.a(param1, (lk) this, (byte) 51) - -(var8.b((lk) this, 0).b((byte) 14) >> 1865801473);
                if (var6 == ui.field_o) {
                  break L6;
                } else {
                  if (var6 == mi.field_c) {
                    break L6;
                  } else {
                    L7: {
                      if (a.field_e != var6) {
                        break L7;
                      } else {
                        var7 = la.field_E[2];
                        var7.a(var9, var10 + -(var7.field_q >> 1323349825), 256);
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (mc.field_a == var6) {
                      var7 = la.field_E[1];
                      var7.a(var9, -(var7.field_q >> -275481663) + var10, 256);
                      if (var13 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L8: {
                L9: {
                  L10: {
                    var7 = la.field_E[0];
                    var11 = var7.field_t << 854565633;
                    var12 = var7.field_o << 1579897377;
                    if (null == ((s) this).field_K) {
                      break L10;
                    } else {
                      if (((s) this).field_K.field_s < var11) {
                        break L10;
                      } else {
                        if (((s) this).field_K.field_q >= var12) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  ((s) this).field_K = new tg(var11, var12);
                  kh.a(((s) this).field_K, 1);
                  if (var13 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
                kh.a(((s) this).field_K, 1);
                na.a();
                break L8;
              }
              var7.b(112, 144, var7.field_t << 443871140, var7.field_o << -404160860, -((s) this).field_L << -422959350, 4096);
              ve.a(-125);
              ((s) this).field_K.a(var9 + -(var7.field_t >> 1875061825), -var7.field_o + var10, 256);
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var5, "s.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(boolean param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        j var4_ref_j = null;
        int var4 = 0;
        int var5_int = 0;
        j var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_30_0 = false;
        boolean stackIn_32_0 = false;
        int stackIn_37_0 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_23_0 = 0;
        boolean stackOut_29_0 = false;
        boolean stackOut_30_0 = false;
        int stackOut_36_0 = 0;
        boolean stackOut_39_0 = false;
        int stackOut_44_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var7 = Bounce.field_N;
        try {
          if (pj.field_a != b.field_b) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          } else {
            L0: {
              var2_long = fa.a(-94);
              if (0 == vi.field_c) {
                break L0;
              } else {
                if (bh.field_c < 0) {
                  var4_ref_j = (j) (Object) ih.field_w.a((byte) -99);
                  if (var4_ref_j == null) {
                    break L0;
                  } else {
                    if (~var4_ref_j.field_h <= ~var2_long) {
                      break L0;
                    } else {
                      var4_ref_j.c(2);
                      pe.field_d = var4_ref_j.field_i.length;
                      jc.field_g.field_h = 0;
                      var5_int = 0;
                      L1: while (true) {
                        L2: {
                          L3: {
                            if (pe.field_d <= var5_int) {
                              break L3;
                            } else {
                              jc.field_g.field_i[var5_int] = var4_ref_j.field_i[var5_int];
                              var5_int++;
                              if (var7 != 0) {
                                break L2;
                              } else {
                                if (var7 == 0) {
                                  continue L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          ak.field_z = i.field_f;
                          i.field_f = ck.field_b;
                          ck.field_b = wa.field_d;
                          wa.field_d = var4_ref_j.field_g;
                          break L2;
                        }
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0 != 0;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            if (param0) {
              L4: while (true) {
                L5: {
                  L6: {
                    if (bh.field_c >= 0) {
                      break L6;
                    } else {
                      jc.field_g.field_h = 0;
                      stackOut_29_0 = qb.a(1, 3);
                      stackIn_40_0 = stackOut_29_0;
                      stackIn_30_0 = stackOut_29_0;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        stackOut_30_0 = stackIn_30_0;
                        stackIn_32_0 = stackOut_30_0;
                        if (!stackIn_32_0) {
                          stackOut_36_0 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          return stackIn_37_0 != 0;
                        } else {
                          bh.field_c = jc.field_g.h((byte) 43);
                          jc.field_g.field_h = 0;
                          pe.field_d = param1[bh.field_c];
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_39_0 = va.b(1);
                  stackIn_40_0 = stackOut_39_0;
                  break L5;
                }
                if (stackIn_40_0) {
                  if (vi.field_c != 0) {
                    L7: {
                      var4 = vi.field_c;
                      if (oj.field_c == 0.0) {
                        break L7;
                      } else {
                        var4 = (int)((double)var4 + la.field_C.nextGaussian() * oj.field_c);
                        if (var4 >= 0) {
                          break L7;
                        } else {
                          var4 = 0;
                          break L7;
                        }
                      }
                    }
                    var5 = new j((long)var4 + var2_long, bh.field_c, new byte[pe.field_d]);
                    var6 = 0;
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (var6 >= pe.field_d) {
                            break L10;
                          } else {
                            var5.field_i[var6] = jc.field_g.field_i[var6];
                            var6++;
                            if (var7 != 0) {
                              break L9;
                            } else {
                              if (var7 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        ih.field_w.a(1, (ai) (Object) var5);
                        bh.field_c = -1;
                        break L9;
                      }
                      continue L4;
                    }
                  } else {
                    ak.field_z = i.field_f;
                    i.field_f = ck.field_b;
                    ck.field_b = wa.field_d;
                    wa.field_d = bh.field_c;
                    bh.field_c = -1;
                    stackOut_44_0 = 1;
                    stackIn_45_0 = stackOut_44_0;
                    return stackIn_45_0 != 0;
                  }
                } else {
                  stackOut_41_0 = 0;
                  stackIn_42_0 = stackOut_41_0;
                  return stackIn_42_0 != 0;
                }
              }
            } else {
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              return stackIn_27_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var2;
            stackOut_57_1 = new StringBuilder().append("s.B(").append(param0).append(',');
            stackIn_60_0 = stackOut_57_0;
            stackIn_60_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param1 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L11;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_61_0 = stackOut_58_0;
              stackIn_61_1 = stackOut_58_1;
              stackIn_61_2 = stackOut_58_2;
              break L11;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ')');
        }
    }

    final boolean a(lk param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                boolean discarded$2 = s.a(true, (int[]) null);
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("s.PA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    s(uh param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (fc) (Object) vd.a(93));
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((s) this).field_H = param0;
            ((s) this).field_I = param1;
            ((s) this).b(param5, 80, param4, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("s.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String d(int param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((s) this).field_H = null;
                break L1;
              }
            }
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "s.S(" + param0 + ')');
        }
        return (String) (Object) stackIn_4_0;
    }

    final static we a(gk param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        we stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        we stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 28576) {
                break L1;
              } else {
                we discarded$2 = s.a((gk) null, (String) null, 64, (String) null);
                break L1;
              }
            }
            var4_int = param0.a(param3, false);
            var5 = param0.a(var4_int, param1, 102);
            stackOut_3_0 = jd.a(var4_int, param0, 8, var5);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("s.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, int param2, lk param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((s) this).field_L = ((s) this).field_L + 1;
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("s.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 13 % ((param1 - 68) / 58);
            stackOut_0_0 = qe.field_e.equals((Object) (Object) ce.a((CharSequence) (Object) param0, 0));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("s.C(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
    }
}
