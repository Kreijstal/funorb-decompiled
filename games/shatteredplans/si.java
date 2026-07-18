/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends df {
    static String field_w;
    static boolean field_v;
    boolean field_y;
    char[] field_s;
    static String field_q;
    static int field_u;
    char[] field_p;
    static String[] field_o;
    int[] field_x;
    String field_t;
    int[] field_r;

    final static void f(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!eh.field_P) {
              throw new IllegalStateException();
            } else {
              L1: {
                or.field_a = true;
                wk.a(false, true);
                gm.field_i = 0;
                if (param0 == -91) {
                  break L1;
                } else {
                  eb discarded$2 = si.a(-82, (qb) null, -122, (byte) -43, -19, -109);
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "si.F(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, e param2, e param3, int param4, String param5, boolean param6) {
        RuntimeException var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        ob stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        ob stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        ob stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        ob stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        String stackIn_29_2 = null;
        ob stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        ob stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        ob stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String stackIn_33_2 = null;
        int stackIn_47_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        ob stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        ob stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        String stackOut_28_2 = null;
        ob stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        ob stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        String stackOut_26_2 = null;
        ob stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        ob stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        String stackOut_32_2 = null;
        ob stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        String stackOut_30_2 = null;
        int stackOut_46_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var7_ref = param3.a((byte) -126);
            var8 = param2.a((byte) 77);
            if (param4 >= 116) {
              L1: {
                if (wg.field_f == null) {
                  var9 = ts.a(false, -2) ? 1 : 0;
                  if (var9 != 0) {
                    break L1;
                  } else {
                    stackOut_8_0 = -1;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (cs.field_j == j.field_r) {
                  L3: {
                    L4: {
                      js.field_f.field_j = 0;
                      sa.field_d = null;
                      if (param5 == null) {
                        break L4;
                      } else {
                        L5: {
                          var9 = 0;
                          eo.field_cb.field_j = 0;
                          if (param6) {
                            var9 = var9 | 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          eo.field_cb.e(11135, na.field_u.nextInt());
                          eo.field_cb.e(11135, na.field_u.nextInt());
                          eo.field_cb.a((byte) 95, var7_ref);
                          eo.field_cb.a((byte) 95, var8);
                          eo.field_cb.a((byte) 95, cn.a((CharSequence) (Object) param5, (byte) 53));
                          eo.field_cb.d(param0, 255);
                          eo.field_cb.c(param1, (byte) -108);
                          eo.field_cb.c(var9, (byte) -60);
                          js.field_f.c(18, (byte) -76);
                          js.field_f.field_j = js.field_f.field_j + 2;
                          var10 = js.field_f.field_j;
                          var11_ref_String = ck.a((byte) -128, kq.f((byte) 124));
                          if (var11_ref_String == null) {
                            var11_ref_String = "";
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        js.field_f.a(var11_ref_String, (byte) 0);
                        co.a(25050, (ob) (Object) js.field_f, hr.field_a, eo.field_cb, jl.field_V);
                        js.field_f.f(-549342136, -var10 + js.field_f.field_j);
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L7: {
                      eo.field_cb.field_j = 0;
                      eo.field_cb.e(11135, na.field_u.nextInt());
                      eo.field_cb.e(11135, na.field_u.nextInt());
                      stackOut_23_0 = eo.field_cb;
                      stackOut_23_1 = 95;
                      stackIn_28_0 = stackOut_23_0;
                      stackIn_28_1 = stackOut_23_1;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      if (!param3.a(2)) {
                        stackOut_28_0 = (ob) (Object) stackIn_28_0;
                        stackOut_28_1 = stackIn_28_1;
                        stackOut_28_2 = "";
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        break L7;
                      } else {
                        stackOut_24_0 = (ob) (Object) stackIn_24_0;
                        stackOut_24_1 = stackIn_24_1;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackOut_26_0 = (ob) (Object) stackIn_26_0;
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = (String) var7_ref;
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_29_2 = stackOut_26_2;
                        break L7;
                      }
                    }
                    L8: {
                      ((ob) (Object) stackIn_29_0).a((byte) stackIn_29_1, stackIn_29_2);
                      stackOut_29_0 = eo.field_cb;
                      stackOut_29_1 = 95;
                      stackIn_32_0 = stackOut_29_0;
                      stackIn_32_1 = stackOut_29_1;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      if (!param2.a(2)) {
                        stackOut_32_0 = (ob) (Object) stackIn_32_0;
                        stackOut_32_1 = stackIn_32_1;
                        stackOut_32_2 = "";
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        stackIn_33_2 = stackOut_32_2;
                        break L8;
                      } else {
                        stackOut_30_0 = (ob) (Object) stackIn_30_0;
                        stackOut_30_1 = stackIn_30_1;
                        stackOut_30_2 = (String) var8;
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_33_1 = stackOut_30_1;
                        stackIn_33_2 = stackOut_30_2;
                        break L8;
                      }
                    }
                    ((ob) (Object) stackIn_33_0).a((byte) stackIn_33_1, stackIn_33_2);
                    js.field_f.c(16, (byte) -69);
                    js.field_f.field_j = js.field_f.field_j + 1;
                    var9 = js.field_f.field_j;
                    co.a(25050, (ob) (Object) js.field_f, hr.field_a, eo.field_cb, jl.field_V);
                    js.field_f.b(js.field_f.field_j + -var9, (byte) 119);
                    break L3;
                  }
                  d.a(-1, (byte) 82);
                  cs.field_j = qe.field_k;
                  break L2;
                } else {
                  break L2;
                }
              }
              L9: {
                if (cs.field_j != qe.field_k) {
                  break L9;
                } else {
                  if (!es.a(110, 1)) {
                    break L9;
                  } else {
                    L10: {
                      L11: {
                        var9 = sa.field_a.j(-83);
                        sa.field_a.field_j = 0;
                        if (100 > var9) {
                          break L11;
                        } else {
                          if (105 >= var9) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (var9 != 248) {
                        L12: {
                          if (99 != var9) {
                            break L12;
                          } else {
                            boolean discarded$1 = es.a(119, nc.a(-85));
                            sa.field_d = new Boolean(ro.a((byte) -24, (ob) (Object) sa.field_a));
                            sa.field_a.field_j = 0;
                            if (var13 == 0) {
                              break L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                        cs.field_j = nr.field_m;
                        ej.field_e = var9;
                        rr.field_t = -1;
                        if (var13 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      } else {
                        ce.a(kq.f((byte) 125), true);
                        nl.field_c = dh.field_b;
                        q.g(-125);
                        ke.field_j = false;
                        stackOut_46_0 = var9;
                        stackIn_47_0 = stackOut_46_0;
                        return stackIn_47_0;
                      }
                    }
                    cs.field_j = k.field_h;
                    ae.field_e = new String[-100 + var9];
                    break L9;
                  }
                }
              }
              L13: {
                if (k.field_h != cs.field_j) {
                  break L13;
                } else {
                  var9 = 2;
                  if (es.a(-87, var9)) {
                    var10 = sa.field_a.f(-20976);
                    sa.field_a.field_j = 0;
                    if (!es.a(126, var10)) {
                      break L13;
                    } else {
                      var11 = ae.field_e.length;
                      var12 = 0;
                      L14: while (true) {
                        L15: {
                          L16: {
                            if (var11 <= var12) {
                              break L16;
                            } else {
                              ae.field_e[var12] = sa.field_a.e((byte) -126);
                              var12++;
                              if (var13 != 0) {
                                break L15;
                              } else {
                                if (var13 == 0) {
                                  continue L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          q.g(-113);
                          ke.field_j = false;
                          break L15;
                        }
                        stackOut_69_0 = 100 + var11;
                        stackIn_70_0 = stackOut_69_0;
                        return stackIn_70_0;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              L17: {
                if (nr.field_m != cs.field_j) {
                  break L17;
                } else {
                  if (uc.d((byte) -28)) {
                    L18: {
                      L19: {
                        if (ej.field_e == 255) {
                          break L19;
                        } else {
                          nl.field_c = sa.field_a.e(-1);
                          if (var13 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var9_ref_String = sa.field_a.i(1910283844);
                      if (null == var9_ref_String) {
                        break L18;
                      } else {
                        jf.a(-25602, var9_ref_String, kq.f((byte) 125));
                        break L18;
                      }
                    }
                    q.g(-99);
                    ke.field_j = false;
                    stackOut_84_0 = ej.field_e;
                    stackIn_85_0 = stackOut_84_0;
                    return stackIn_85_0;
                  } else {
                    break L17;
                  }
                }
              }
              L20: {
                if (null != wg.field_f) {
                  break L20;
                } else {
                  if (!ke.field_j) {
                    var9 = of.field_f;
                    of.field_f = bb.field_c;
                    bb.field_c = var9;
                    ke.field_j = true;
                    break L20;
                  } else {
                    L21: {
                      L22: {
                        if (wh.a(18) > 30000L) {
                          break L22;
                        } else {
                          nl.field_c = wb.field_d;
                          if (var13 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      nl.field_c = gq.field_f;
                      break L21;
                    }
                    ke.field_j = false;
                    stackOut_98_0 = 249;
                    stackIn_99_0 = stackOut_98_0;
                    return stackIn_99_0;
                  }
                }
              }
              stackOut_101_0 = -1;
              stackIn_102_0 = stackOut_101_0;
              break L0;
            } else {
              stackOut_2_0 = 63;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackOut_103_0 = (RuntimeException) var7;
            stackOut_103_1 = new StringBuilder().append("si.A(").append(param0).append(',').append(param1).append(',');
            stackIn_106_0 = stackOut_103_0;
            stackIn_106_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param2 == null) {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "null";
              stackIn_107_0 = stackOut_106_0;
              stackIn_107_1 = stackOut_106_1;
              stackIn_107_2 = stackOut_106_2;
              break L23;
            } else {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "{...}";
              stackIn_107_0 = stackOut_104_0;
              stackIn_107_1 = stackOut_104_1;
              stackIn_107_2 = stackOut_104_2;
              break L23;
            }
          }
          L24: {
            stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
            stackOut_107_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_107_2).append(',');
            stackIn_110_0 = stackOut_107_0;
            stackIn_110_1 = stackOut_107_1;
            stackIn_108_0 = stackOut_107_0;
            stackIn_108_1 = stackOut_107_1;
            if (param3 == null) {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L24;
            } else {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "{...}";
              stackIn_111_0 = stackOut_108_0;
              stackIn_111_1 = stackOut_108_1;
              stackIn_111_2 = stackOut_108_2;
              break L24;
            }
          }
          L25: {
            stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
            stackOut_111_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_111_2).append(',').append(param4).append(',');
            stackIn_114_0 = stackOut_111_0;
            stackIn_114_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param5 == null) {
              stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L25;
            } else {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "{...}";
              stackIn_115_0 = stackOut_112_0;
              stackIn_115_1 = stackOut_112_1;
              stackIn_115_2 = stackOut_112_2;
              break L25;
            }
          }
          throw r.a((Throwable) (Object) stackIn_115_0, stackIn_115_2 + ',' + param6 + ')');
        }
        return stackIn_102_0;
    }

    public static void e(byte param0) {
        field_w = null;
        field_o = null;
        if (param0 != -117) {
            return;
        }
        try {
            field_q = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "si.D(" + param0 + ')');
        }
    }

    final void e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((si) this).field_x != null) {
                  var2_int = 0;
                  L3: while (true) {
                    if (~var2_int <= ~((si) this).field_x.length) {
                      break L2;
                    } else {
                      ((si) this).field_x[var2_int] = ee.a(((si) this).field_x[var2_int], 32768);
                      var2_int++;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        if (var4 == 0) {
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
              var2_int = 123 % ((-18 - param0) / 55);
              break L1;
            }
            L4: {
              L5: {
                if (((si) this).field_r != null) {
                  var3 = 0;
                  L6: while (true) {
                    if (((si) this).field_r.length <= var3) {
                      break L5;
                    } else {
                      ((si) this).field_r[var3] = ee.a(((si) this).field_r[var3], 32768);
                      var3++;
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          continue L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "si.B(" + param0 + ')');
        }
    }

    private final void a(ob param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_11_0 = null;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_28_0 = null;
        char[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        char[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        char[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        char[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        Object stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_27_0 = null;
        char[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        char[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        char stackOut_33_2 = 0;
        char[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        char[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        Object stackOut_39_0 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (1 == param2) {
                      break L4;
                    } else {
                      L5: {
                        if (param2 == 2) {
                          break L5;
                        } else {
                          L6: {
                            if (3 != param2) {
                              break L6;
                            } else {
                              var4_int = param0.j(-81);
                              ((si) this).field_s = new char[var4_int];
                              ((si) this).field_x = new int[var4_int];
                              var5 = 0;
                              L7: while (true) {
                                L8: {
                                  if (~var5 <= ~var4_int) {
                                    break L8;
                                  } else {
                                    ((si) this).field_x[var5] = param0.f(-20976);
                                    var6 = param0.g(-2852);
                                    stackOut_10_0 = this;
                                    stackIn_41_0 = stackOut_10_0;
                                    stackIn_11_0 = stackOut_10_0;
                                    if (var7 != 0) {
                                      break L2;
                                    } else {
                                      L9: {
                                        stackOut_11_0 = ((si) this).field_s;
                                        stackOut_11_1 = var5;
                                        stackIn_16_0 = stackOut_11_0;
                                        stackIn_16_1 = stackOut_11_1;
                                        stackIn_12_0 = stackOut_11_0;
                                        stackIn_12_1 = stackOut_11_1;
                                        if (var6 != 0) {
                                          stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                                          stackOut_16_1 = stackIn_16_1;
                                          stackOut_16_2 = oa.a(-12541, (byte) var6);
                                          stackIn_17_0 = stackOut_16_0;
                                          stackIn_17_1 = stackOut_16_1;
                                          stackIn_17_2 = stackOut_16_2;
                                          break L9;
                                        } else {
                                          stackOut_12_0 = (char[]) (Object) stackIn_12_0;
                                          stackOut_12_1 = stackIn_12_1;
                                          stackIn_14_0 = stackOut_12_0;
                                          stackIn_14_1 = stackOut_12_1;
                                          stackOut_14_0 = (char[]) (Object) stackIn_14_0;
                                          stackOut_14_1 = stackIn_14_1;
                                          stackOut_14_2 = 0;
                                          stackIn_17_0 = stackOut_14_0;
                                          stackIn_17_1 = stackOut_14_1;
                                          stackIn_17_2 = stackOut_14_2;
                                          break L9;
                                        }
                                      }
                                      stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                                      var5++;
                                      if (var7 == 0) {
                                        continue L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          if (param2 == 4) {
                            ((si) this).field_y = true;
                            if (var7 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4_int = param0.j(-100);
                      ((si) this).field_p = new char[var4_int];
                      ((si) this).field_r = new int[var4_int];
                      var5 = 0;
                      L10: while (true) {
                        L11: {
                          if (var5 >= var4_int) {
                            break L11;
                          } else {
                            ((si) this).field_r[var5] = param0.f(-20976);
                            var6 = param0.g(-2852);
                            stackOut_27_0 = this;
                            stackIn_41_0 = stackOut_27_0;
                            stackIn_28_0 = stackOut_27_0;
                            if (var7 != 0) {
                              break L2;
                            } else {
                              L12: {
                                stackOut_28_0 = ((si) this).field_p;
                                stackOut_28_1 = var5;
                                stackIn_33_0 = stackOut_28_0;
                                stackIn_33_1 = stackOut_28_1;
                                stackIn_29_0 = stackOut_28_0;
                                stackIn_29_1 = stackOut_28_1;
                                if (var6 != 0) {
                                  stackOut_33_0 = (char[]) (Object) stackIn_33_0;
                                  stackOut_33_1 = stackIn_33_1;
                                  stackOut_33_2 = oa.a(-12541, (byte) var6);
                                  stackIn_34_0 = stackOut_33_0;
                                  stackIn_34_1 = stackOut_33_1;
                                  stackIn_34_2 = stackOut_33_2;
                                  break L12;
                                } else {
                                  stackOut_29_0 = (char[]) (Object) stackIn_29_0;
                                  stackOut_29_1 = stackIn_29_1;
                                  stackIn_31_0 = stackOut_29_0;
                                  stackIn_31_1 = stackOut_29_1;
                                  stackOut_31_0 = (char[]) (Object) stackIn_31_0;
                                  stackOut_31_1 = stackIn_31_1;
                                  stackOut_31_2 = 0;
                                  stackIn_34_0 = stackOut_31_0;
                                  stackIn_34_1 = stackOut_31_1;
                                  stackIn_34_2 = stackOut_31_2;
                                  break L12;
                                }
                              }
                              stackIn_34_0[stackIn_34_1] = (char) stackIn_34_2;
                              var5++;
                              if (var7 == 0) {
                                continue L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        if (var7 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  ((si) this).field_t = param0.e(-1);
                  break L3;
                }
                if (param1 < -58) {
                  break L1;
                } else {
                  stackOut_39_0 = this;
                  stackIn_41_0 = stackOut_39_0;
                  break L2;
                }
              }
              ((si) this).field_t = null;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("si.C(");
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L13;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L13;
            }
          }
          throw r.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static eb a(int param0, qb param1, int param2, byte param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        eb var7 = null;
        int var8 = 0;
        Object stackIn_4_0 = null;
        eb stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        eb stackOut_5_0 = null;
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
            var6 = tl.a(true, param1, param4, param2, param5, param0);
            if (var6 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (eb) (Object) stackIn_4_0;
            } else {
              var7 = new eb();
              var8 = -69 % ((44 - param3) / 49);
              var7.field_d = var6;
              java.awt.Component discarded$2 = var7.field_d.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, param0, param5);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_5_0 = (eb) var7;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6_ref;
            stackOut_7_1 = new StringBuilder().append("si.G(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    final void a(ob param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    var3_int = param0.j(param1 ^ 109);
                    if (var3_int != 0) {
                      break L4;
                    } else {
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  this.a(param0, (byte) -67, var3_int);
                  break L3;
                }
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
              L5: {
                if (param1 == -1) {
                  break L5;
                } else {
                  ((si) this).field_y = false;
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("si.E(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    si() {
        ((si) this).field_y = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Total fleets produced in this territory this turn.";
        field_q = "Open";
    }
}
