/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int[][] field_d;
    static String field_a;
    static int field_c;
    static boolean field_b;

    public static void b() {
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        ll.field_q = param1;
        if (null != q.field_f) {
            q.field_f.a(param1, 1000000);
        }
        if (!(ja.field_g == null)) {
            ja.field_g.a(param1, -1);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(nk param0, int param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = param0.i(-110);
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                var3_int++;
                stackOut_22_0 = var3_int;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L2: {
                  if (param2[var5] == 0) {
                    var3_int++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param2[var5] != 1) {
                    break L3;
                  } else {
                    var3_int += 2;
                    break L3;
                  }
                }
                L4: {
                  if (2 != param2[var5]) {
                    break L4;
                  } else {
                    var3_int += 3;
                    break L4;
                  }
                }
                L5: {
                  if (param2[var5] != 3) {
                    break L5;
                  } else {
                    var3_int += 4;
                    break L5;
                  }
                }
                L6: {
                  if (param2[var5] == 4) {
                    var3_int += 5;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (20 != param2[var5]) {
                    break L7;
                  } else {
                    var3_int += 10;
                    break L7;
                  }
                }
                L8: {
                  if (param2[var5] != 34) {
                    break L8;
                  } else {
                    var3_int += 25;
                    break L8;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("ef.D(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(12258).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_23_0;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        try {
            var1_int = 1;
            for (var2 = 0; var2 < 30; var2++) {
                if ((var1_int & jb.field_P) == 0) {
                } else {
                    mm.field_g.a(71, (byte) -117);
                    mm.field_g.a((byte) 122, var2);
                    if (var2 >= 10) {
                        mm.field_g.d(jh.field_a[var2 + -10], 31);
                    } else {
                        mm.field_g.d(0, 105);
                    }
                    for (var3 = 0; var3 < 4; var3++) {
                        mm.field_g.b(true, 0);
                    }
                }
                var1_int = var1_int << 1;
            }
            var3 = -70 / ((param0 - 40) / 32);
            jb.field_P = 0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ef.A(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gh var7 = null;
        int var7_int = 0;
        int var8 = 0;
        gh var8_ref_gh = null;
        int var9_int = 0;
        qh var9 = null;
        int var10 = 0;
        qh var10_ref_qh = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        gh var14 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        gh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        gh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        gh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        gh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        gh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        gh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              sf.field_t = pb.field_j;
              re.field_Z = pb.field_c;
              stackOut_1_0 = 61;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param1) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = bd.field_c;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = fj.field_f;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              vb.a((byte) stackIn_4_0, stackIn_4_1);
              fg.field_Tb.a(-2 + (ql.field_ec.field_Lb + -40), 0, ql.field_ec.field_zb, 2, 0);
              uj.field_e.a(0, 0, db.field_b, 0, m.field_i.field_zb);
              stackOut_4_0 = gl.field_u;
              stackOut_4_1 = 0;
              stackOut_4_2 = db.field_b + 2;
              stackOut_4_3 = 18;
              stackOut_4_4 = 0;
              stackOut_4_5 = m.field_i.field_zb;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_6_3 = stackOut_4_3;
              stackIn_6_4 = stackOut_4_4;
              stackIn_6_5 = stackOut_4_5;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              stackIn_5_5 = stackOut_4_5;
              if (!rm.field_p) {
                stackOut_6_0 = (gh) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = stackIn_6_5;
                stackOut_6_6 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                stackIn_7_6 = stackOut_6_6;
                break L2;
              } else {
                stackOut_5_0 = (gh) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = stackIn_5_4;
                stackOut_5_5 = stackIn_5_5;
                stackOut_5_6 = 40 + (ua.field_G + 2) - -2;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                stackIn_7_6 = stackOut_5_6;
                break L2;
              }
            }
            L3: {
              ((gh) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5 - stackIn_7_6);
              ei.field_p.a(0, db.field_b + 2, 18, -2 + (m.field_i.field_zb - (ua.field_G + 40)), 42 + ua.field_G);
              gl.field_t.a(m.field_i.field_zb, -2048, ua.field_G, -2 + (-db.field_b + m.field_i.field_Lb) + -20, 2, 0, db.field_b + 22);
              mn.field_E.a(0, -40 + ql.field_ec.field_Lb, 40, 0, ql.field_ec.field_zb);
              nm.field_q.a(0, 0, 30, 0, gl.field_y.field_zb);
              qa.field_L.a(0, 30, -30 + gl.field_y.field_Lb + -42, 0, gl.field_y.field_zb);
              var2_int = 3 + be.field_a;
              if (jg.field_l.length >= 2) {
                break L3;
              } else {
                var2_int--;
                break L3;
              }
            }
            L4: {
              if (param1) {
                var2_int--;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3 = -2 + ((var2_int + 1) / 2 + -8 + (-5 + (qa.field_L.field_Lb - 5))) / (var2_int - -1);
              if (var3 <= 30) {
                break L5;
              } else {
                var3 = 30;
                break L5;
              }
            }
            L6: {
              var4 = -(var2_int * (2 + var3)) + (qa.field_L.field_Lb - 10);
              if (var4 <= 40) {
                break L6;
              } else {
                var4 = 40;
                break L6;
              }
            }
            bj.field_d.a(0, 5, var4, 5, -10 + qa.field_L.field_zb);
            var5 = 2 + (5 + var4);
            var6 = 0;
            L7: while (true) {
              if (~var6 <= ~(4 + be.field_a)) {
                fb.field_r.a(0, 10, -134 + (pb.field_j - 10), pb.field_c - 360 >> 1, 360);
                tf.field_a.a(0, 0, 24, 0, fb.field_r.field_zb);
                nd.field_a.a(0, 24, fb.field_r.field_Lb - 24, 0, fb.field_r.field_zb);
                nd.field_a.field_I = se.a(3, 1, 11579568, nd.field_a.field_Lb, 8421504, 13574);
                fl.field_c.a(0, 5, -26 + (-10 + nd.field_a.field_Lb), 5, -10 + nd.field_a.field_zb);
                ta.field_i.a(0, -29 + nd.field_a.field_Lb, 24, (-80 + nd.field_a.field_zb) / 2, 80);
                int discarded$1 = 1;
                ql.b();
                break L0;
              } else {
                L8: {
                  L9: {
                    if (var6 != 1) {
                      break L9;
                    } else {
                      if (2 > jg.field_l.length) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var6 != 3) {
                      break L10;
                    } else {
                      if (tc.field_z > 1) {
                        break L10;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    if (param1) {
                      break L11;
                    } else {
                      if (var6 == 3) {
                        var7 = sl.field_k[var6];
                        sl.field_k[var6].field_Lb = 0;
                        var7.field_zb = 0;
                        var8 = 0;
                        L12: while (true) {
                          if (~var8 <= ~un.field_h[var6].length) {
                            break L8;
                          } else {
                            L13: {
                              if (null == un.field_h[var6][var8]) {
                                break L13;
                              } else {
                                var9 = un.field_h[var6][var8];
                                un.field_h[var6][var8].field_Lb = 0;
                                var9.field_zb = 0;
                                break L13;
                              }
                            }
                            var8++;
                            continue L12;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L14: {
                    if (!param1) {
                      break L14;
                    } else {
                      if (0 == var6) {
                        var14 = sl.field_k[var6];
                        var7 = var14;
                        sl.field_k[var6].field_Lb = 0;
                        var14.field_zb = 0;
                        var8 = 0;
                        L15: while (true) {
                          if (un.field_h[var6].length <= var8) {
                            break L8;
                          } else {
                            L16: {
                              if (un.field_h[var6][var8] != null) {
                                var9 = un.field_h[var6][var8];
                                un.field_h[var6][var8].field_Lb = 0;
                                var9.field_zb = 0;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var8++;
                            continue L15;
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  L17: {
                    L18: {
                      if (!param1) {
                        break L18;
                      } else {
                        if (var6 < 4) {
                          break L18;
                        } else {
                          if (ch.field_G == null) {
                            break L18;
                          } else {
                            if (!ch.field_G[var6 + -4]) {
                              break L18;
                            } else {
                              stackOut_34_0 = 1;
                              stackIn_36_0 = stackOut_34_0;
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    break L17;
                  }
                  L19: {
                    var7_int = stackIn_36_0;
                    if (var7_int == 0) {
                      L20: {
                        sl.field_k[var6].a(0, var5, var3, 5, 103);
                        var8 = 110;
                        if (param1) {
                          un.field_h[var6][0].a(var3, 38, 2, var8, va.field_e, var5, (byte) 122);
                          var8 += 40;
                          break L20;
                        } else {
                          if (null == un.field_h[var6][0]) {
                            break L20;
                          } else {
                            var9 = un.field_h[var6][0];
                            un.field_h[var6][0].field_Lb = 0;
                            var9.field_zb = 0;
                            break L20;
                          }
                        }
                      }
                      var9_int = 2 + gl.field_y.field_zb - (5 + var8);
                      var10 = un.field_h[var6].length - 1;
                      var11 = 0;
                      L21: while (true) {
                        if (var11 >= var10) {
                          var5 = var5 + (var3 - -2);
                          break L19;
                        } else {
                          var12 = var9_int * var11 / var10;
                          un.field_h[var6][var11 + 1].a(var3, -var12 + (1 + var11) * var9_int / var10 + -2, 2, var8 - -var12, va.field_e, var5, (byte) 121);
                          var11++;
                          continue L21;
                        }
                      }
                    } else {
                      var8_ref_gh = sl.field_k[var6];
                      sl.field_k[var6].field_Lb = 0;
                      var8_ref_gh.field_zb = 0;
                      var9_int = 0;
                      L22: while (true) {
                        if (un.field_h[var6].length <= var9_int) {
                          break L19;
                        } else {
                          L23: {
                            if (un.field_h[var6][var9_int] != null) {
                              var10_ref_qh = un.field_h[var6][var9_int];
                              un.field_h[var6][var9_int].field_Lb = 0;
                              var10_ref_qh.field_zb = 0;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          var9_int++;
                          continue L22;
                        }
                      }
                    }
                  }
                  break L8;
                }
                var6++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ef.E(" + 1 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        if (!mg.field_ac) {
            throw new IllegalStateException();
        }
        ck.field_a = true;
        if (param0 != 12) {
            field_b = true;
        }
        nj.a(false, 40);
        uj.field_d = 0;
    }

    final static boolean b(int param0, int param1) {
        if (param1 < 0) {
            return (param1 + 1) % 4 == 0 ? true : false;
        }
        if (param1 < 1582) {
            return param1 % 4 == 0 ? true : false;
        }
        if (!(param1 % 4 == 0)) {
            return false;
        }
        if (param1 % 100 != 0) {
            return true;
        }
        if (param1 % 400 == 0) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[][]{new int[3], new int[4], new int[4], new int[3], new int[4], new int[3], new int[3], new int[5], new int[5], new int[3], new int[3], new int[3], new int[4], new int[2], new int[5], new int[5], new int[5], new int[5], new int[4], new int[4], new int[4], new int[2], new int[5], new int[1], new int[5], new int[5], new int[5], new int[3], new int[5], new int[5], new int[5], new int[3], new int[6], new int[5], new int[5], new int[2], new int[6], new int[3], new int[5], new int[9], new int[7], new int[1]};
        field_c = 0;
        field_b = false;
        field_a = "You have withdrawn your request to join.";
    }
}
