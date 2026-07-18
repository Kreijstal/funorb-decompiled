/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends f {
    static String field_e;
    private java.nio.ByteBuffer field_d;
    static java.awt.Canvas field_h;
    static String field_c;
    static int field_i;
    static boolean field_f;
    static rk field_g;

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_g = null;
            field_e = null;
            field_h = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "ja.H(" + -115 + ')');
        }
    }

    final static void a(um param0) {
        ci var2 = null;
        RuntimeException var2_ref = null;
        ci var3 = null;
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
            wk.field_g = wk.a(param0, 1, "display_name_changed", "basic");
            ea.field_bb = new ok(0L, cn.field_b, tn.field_l, ef.field_m);
            fg.field_d = new ok(0L, cn.field_b, d.field_Lb, vc.field_b);
            hb.field_a = new ci(0L, (ci) null);
            oj.field_c = new ci(0L, qn.field_P);
            oj.field_c.field_fb = 1;
            le.field_e = new ci(0L, bo.field_e, ei.field_s);
            kf.field_t = new ci(0L, l.field_j, hm.field_b);
            dk.field_h = new ci(0L, sj.field_k);
            hb.field_a.a((byte) 123, oj.field_c);
            hb.field_a.a((byte) 124, le.field_e);
            hb.field_a.a((byte) 123, kf.field_t);
            hb.field_a.a((byte) 125, (ci) (Object) ea.field_bb);
            hb.field_a.a((byte) 127, dk.field_h);
            ea.field_bb.field_Kb.field_Jb.a(qn.field_P, -2147483648);
            var2 = ea.field_bb.field_Kb.field_Jb;
            ea.field_bb.field_Kb.field_Jb.field_cb = 1;
            var2.field_fb = 1;
            fg.field_d.field_Kb.field_Jb.a(qn.field_P, -2147483648);
            var3 = fg.field_d.field_Kb.field_Jb;
            fg.field_d.field_Kb.field_Jb.field_cb = 1;
            var3.field_fb = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("ja.E(");
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
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + 1 + ')');
        }
    }

    final byte[] b(int param0) {
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var2 = new byte[((ja) this).field_d.capacity()];
              java.nio.Buffer discarded$5 = ((ja) this).field_d.position(0);
              if (param0 == 438) {
                break L1;
              } else {
                ((ja) this).field_d = null;
                break L1;
              }
            }
            java.nio.ByteBuffer discarded$6 = ((ja) this).field_d.get(var2);
            stackOut_3_0 = (byte[]) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2_ref, "ja.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    ja() {
    }

    final void a(byte[] param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 == 199) {
                break L1;
              } else {
                ja.a((em) null, -70, (byte) -122, -75, true);
                break L1;
              }
            }
            ((ja) this).field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
            java.nio.Buffer discarded$4 = ((ja) this).field_d.position(0);
            java.nio.ByteBuffer discarded$5 = ((ja) this).field_d.put(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ja.A(");
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
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(em param0, int param1, byte param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
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
        boolean stackIn_14_0 = false;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0 = false;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        byte stackOut_54_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var19 = Chess.field_G;
        try {
          L0: {
            L1: {
              var5_int = ql.a(-116, 3 * (-param3 + param1));
              var6 = 3 * param3;
              int discarded$2 = 0;
              ki.a();
              var7 = var5_int + -10;
              if (param0.field_j <= 0) {
                break L1;
              } else {
                if (null != param0.field_y) {
                  int discarded$3 = 95;
                  dh.a();
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              um.field_a = 0;
              if (param2 < -67) {
                break L2;
              } else {
                field_f = false;
                break L2;
              }
            }
            var8 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (~param0.field_e >= ~var8) {
                    break L5;
                  } else {
                    var9 = param0.field_g[var8];
                    var10 = param0.field_A[var8];
                    var11 = param0.field_J[var8];
                    stackOut_13_0 = param4;
                    stackIn_55_0 = stackOut_13_0 ? 1 : 0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var19 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (!stackIn_14_0) {
                            break L7;
                          } else {
                            var12 = qm.field_c[var9];
                            var13 = tc.field_w[var9];
                            var14 = qm.field_c[var10] - var12;
                            var15 = -var12 + qm.field_c[var11];
                            var16 = tc.field_w[var10] - var13;
                            var17 = -var13 + tc.field_w[var11];
                            if (-(var16 * var15) + var14 * var17 < 0) {
                              break L7;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var12 = jd.field_i[var9];
                        if (-2147483648 == var12) {
                          break L6;
                        } else {
                          L8: {
                            var13 = jd.field_i[var10];
                            if (var13 != -2147483648) {
                              break L8;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            var14 = jd.field_i[var11];
                            if (var14 != -2147483648) {
                              break L9;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            var15 = -var6 + (var12 - -var13 - -var14);
                            if (0 <= var7) {
                              stackOut_33_0 = var15 >> var7;
                              stackIn_34_0 = stackOut_33_0;
                              break L10;
                            } else {
                              stackOut_31_0 = var15 << -var7;
                              stackIn_34_0 = stackOut_31_0;
                              break L10;
                            }
                          }
                          var16 = -stackIn_34_0 + ge.field_eb.length + -1;
                          var17 = ge.field_eb[var16];
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (var17 >> 4 == 0) {
                                  break L13;
                                } else {
                                  var16--;
                                  stackOut_36_0 = 0;
                                  stackOut_36_1 = var16;
                                  stackIn_45_0 = stackOut_36_0;
                                  stackIn_45_1 = stackOut_36_1;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackIn_37_1 = stackOut_36_1;
                                  if (var19 != 0) {
                                    break L12;
                                  } else {
                                    L14: {
                                      if (stackIn_37_0 <= stackIn_37_1) {
                                        break L14;
                                      } else {
                                        System.err.println("Out of range!");
                                        if (var19 == 0) {
                                          break L6;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    var17 = ge.field_eb[var16];
                                    if (var19 == 0) {
                                      continue L11;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              stackOut_44_0 = var17;
                              stackOut_44_1 = var16 << 4;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              break L12;
                            }
                            L15: {
                              var18 = stackIn_45_0 + stackIn_45_1;
                              ve.field_Hb[var18] = var8;
                              ge.field_eb[var16] = var17 + 1;
                              if (param0.field_j <= 0) {
                                break L15;
                              } else {
                                if (null != param0.field_y) {
                                  lc.field_n[param0.field_y[var8]] = lc.field_n[param0.field_y[var8]] + 1;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            um.field_a = um.field_a + 1;
                            break L6;
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_54_0 = param0.field_j;
                stackIn_55_0 = stackOut_54_0;
                break L4;
              }
              L16: {
                L17: {
                  if (stackIn_55_0 <= 0) {
                    break L17;
                  } else {
                    if (param0.field_y != null) {
                      var8 = 0;
                      var9 = 0;
                      L18: while (true) {
                        if (~lc.field_n.length >= ~var9) {
                          break L17;
                        } else {
                          var10 = lc.field_n[var9];
                          lc.field_n[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L16;
                          } else {
                            if (var19 == 0) {
                              continue L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                break L16;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var5;
            stackOut_68_1 = new StringBuilder().append("ja.I(");
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L19;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L19;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static jd a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        jd[] var3 = null;
        int var4 = 0;
        jd var5 = null;
        int var6 = 0;
        jd stackIn_3_0 = null;
        jd stackIn_10_0 = null;
        jd stackIn_14_0 = null;
        jd stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd stackOut_9_0 = null;
        jd stackOut_13_0 = null;
        jd stackOut_16_0 = null;
        jd stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            var2 = kb.a(-2147483648, param1, "jagex-last-login-method");
            if (var2 != null) {
              L1: {
                if (param0 >= 126) {
                  break L1;
                } else {
                  jd discarded$4 = ja.a((byte) 47, (java.applet.Applet) null);
                  break L1;
                }
              }
              int discarded$5 = 2;
              var3 = hb.a();
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var4 <= ~var3.length) {
                      break L4;
                    } else {
                      var5 = var3[var4];
                      stackOut_9_0 = (jd) var5;
                      stackIn_17_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        if (!((jd) (Object) stackIn_10_0).a((byte) 111, var2)) {
                          var4++;
                          if (var6 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_13_0 = (jd) var5;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = dn.field_f;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = dn.field_f;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2_ref;
            stackOut_18_1 = new StringBuilder().append("ja.G(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_17_0;
    }

    final static void a(long param0, String param1, byte param2, nb param3, int param4, ci param5, int[] param6, int param7, String param8) {
        RuntimeException runtimeException = null;
        int var10_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            ud.field_d = param3;
            pi.field_d = new dh(param5, param0, param8, param1, param7, param4, param6);
            var10_int = -39 % ((param2 - -30) / 50);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ja.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param7).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param8 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "You must be a member to play with the current options.";
        field_c = "Lobby";
    }
}
