/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class in extends kg {
    private int field_r;
    String field_p;
    private int field_q;
    static og field_C;
    private int field_z;
    private boolean field_u;
    private int field_F;
    static boolean field_E;
    private int field_x;
    private boolean field_s;
    private long field_A;
    static pp field_y;
    private boolean field_v;
    private int field_w;
    static cn field_D;
    static int[] field_B;
    static String field_t;

    private final void a(String param0, int param1, boolean param2, int param3) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        String var11 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          try {
            L0: {
              if (!((in) this).b(-126)) {
                return;
              } else {
                ((in) this).field_p = ((in) this).getCodeBase().getHost();
                var11 = ((in) this).field_p.toLowerCase();
                L1: {
                  L2: {
                    stackOut_5_0 = this;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var11.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_6_0 = this;
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (!var11.endsWith(".jagex.com")) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L1;
                      } else {
                        stackOut_7_0 = this;
                        stackIn_8_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_8_0 = this;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L1;
                }
                L3: {
                  ((in) this).field_u = stackIn_10_1 != 0;
                  ((in) this).field_z = Integer.parseInt(((in) this).getParameter("gameport1"));
                  ((in) this).field_F = Integer.parseInt(((in) this).getParameter("gameport2"));
                  var7 = ((in) this).getParameter("servernum");
                  if (var7 != null) {
                    ((in) this).field_r = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((in) this).field_w = Integer.parseInt(((in) this).getParameter("gamecrc"));
                  ((in) this).field_A = Long.parseLong(((in) this).getParameter("instanceid"));
                  ((in) this).field_s = ((in) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((in) this).getParameter("lang");
                  if (var8 != null) {
                    ((in) this).field_x = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((in) this).field_x < 5) {
                    break L5;
                  } else {
                    ((in) this).field_x = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((in) this).getParameter("affid");
                  if (var9 != null) {
                    ((in) this).field_q = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                f.field_d = Boolean.valueOf(((in) this).getParameter("simplemode")).booleanValue();
                ((in) this).a(32, (byte) 107, param0, 480, 640, param3, ((in) this).field_w);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              sm.a((Throwable) (Object) var6, 1, (String) null);
              ((in) this).a((byte) -112, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var6_ref;
            stackOut_25_1 = new StringBuilder().append("in.Q(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + 640 + 44 + 1 + 44 + param3 + 44 + 480 + 41);
        }
    }

    final void g(byte param0) {
        int var3 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        var3 = DungeonAssault.field_K;
        if (param0 != 2) {
          return;
        } else {
          L0: {
            if (!vk.a(22084)) {
              if (dk.field_c < 10) {
                break L0;
              } else {
                if (!l.a(true)) {
                  int discarded$3 = -128;
                  dh.b();
                  break L0;
                } else {
                  if (kh.field_n != 0) {
                    td.a(pj.field_r, param0 + 119);
                    break L0;
                  } else {
                    int discarded$4 = this.a(false, false, false);
                    break L0;
                  }
                }
              }
            } else {
              L1: {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (null == cm.field_R) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L1;
                }
              }
              int discarded$5 = this.a(stackIn_5_1 != 0, stackIn_5_2 != 0, false);
              break L0;
            }
          }
          return;
        }
    }

    public static void e(int param0) {
        field_C = null;
        field_t = null;
        field_D = null;
        field_y = null;
        field_B = null;
        if (param0 != -1) {
            in.e(-36);
        }
    }

    final static int a(int param0, int param1) {
        param0 = (1431655765 & param0 >>> 1) + (param0 & 1431655765);
        param0 = (param0 >>> 2 & -1288490189) + (param0 & 858993459);
        param0 = param0 - -(param0 >>> 4) & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final int b(byte param0, boolean param1) {
        if (param0 != 82) {
            int discarded$0 = this.g(12);
        }
        return this.a(false, param1, true);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((in) this).setBackground(java.awt.Color.black);
        hc.field_d = ((in) this).field_x;
        ae.a(hc.field_d, -5);
        dj.a(param1, 5000, ((in) this).field_A, ((in) this).field_z, ((in) this).field_p, ((in) this).field_w, hc.field_d, ((in) this).field_F, ((in) this).field_r, ((in) this).field_s, param6, param0, (byte) -27, i.field_A);
        an.a(((in) this).field_r, ((in) this).field_F, -69, ((in) this).field_z, ((in) this).field_p, hc.field_d, ((in) this).field_w, param1, i.field_A);
        uf.a(param6 ^ 5031);
        int discarded$0 = 109;
        bn.field_j = pm.a();
        uk.a(c.field_h, (byte) -126);
        mh.field_a = param5;
        s.field_a = param7;
        bh.field_P = param2;
        pm.field_m = param3;
        sp.field_h = param4;
        int discarded$1 = 68;
        this.e();
        int discarded$2 = -110;
        ch.a();
    }

    final int f(byte param0) {
        int var2 = 0;
        L0: {
          var2 = this.g(11);
          if (param0 >= 86) {
            break L0;
          } else {
            int discarded$8 = this.g(-68);
            break L0;
          }
        }
        L1: {
          L2: {
            if (var2 == 0) {
              break L2;
            } else {
              if (var2 != 1) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (pj.field_w[1]) {
              f.a(2, (byte) -50);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (pj.field_w[2]) {
              fl.a((byte) -93, 3);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!pj.field_w[3]) {
              break L5;
            } else {
              ep.a((byte) 127, 4);
              break L5;
            }
          }
          L6: {
            if (pj.field_w[4]) {
              int discarded$9 = 5;
              int discarded$10 = 1;
              ko.a();
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (pj.field_w[5]) {
              ol.a(8, 6);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (pj.field_w[6]) {
              tc.a(7, (byte) -112);
              break L8;
            } else {
              break L8;
            }
          }
          if (!pj.field_w[8]) {
            break L1;
          } else {
            int discarded$11 = -59;
            hj.g();
            break L1;
          }
        }
        return var2;
    }

    private final void e() {
        uo.field_c[2] = -2;
        uo.field_c[13] = -1;
        uo.field_c[5] = -1;
        uo.field_c[7] = -1;
        uo.field_c[11] = -1;
        uo.field_c[10] = -1;
        uo.field_c[12] = -1;
        uo.field_c[16] = -1;
        uo.field_c[1] = 16;
        uo.field_c[9] = -1;
        uo.field_c[18] = 1;
        uo.field_c[17] = -1;
        uo.field_c[8] = -2;
        uo.field_c[6] = -2;
        uo.field_c[3] = -1;
        uo.field_c[4] = -1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var5_int = param2 + param0;
              var6 = param3 + param1;
              if (gf.field_j >= param0) {
                stackOut_3_0 = gf.field_j;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param3 > gf.field_f) {
                stackOut_6_0 = param3;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = gf.field_f;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (gf.field_h > var5_int) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = gf.field_h;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 >= gf.field_e) {
                stackOut_12_0 = gf.field_e;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = var6;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (gf.field_j > param0) {
                break L5;
              } else {
                if (gf.field_h > param0) {
                  var11 = var8 * gf.field_i + param0;
                  var12 = var10 + (1 - var8) >> 1;
                  L6: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L5;
                    } else {
                      gf.field_b[var11] = 16777215;
                      var11 = var11 + 2 * gf.field_i;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            if (param4 == 1) {
              L7: {
                if (gf.field_f > param3) {
                  break L7;
                } else {
                  if (gf.field_e <= var6) {
                    break L7;
                  } else {
                    var11 = param3 * gf.field_i + var7;
                    var12 = -var7 + 1 + var9 >> 1;
                    L8: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L7;
                      } else {
                        gf.field_b[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  }
                }
              }
              L9: {
                if (gf.field_j > var5_int) {
                  break L9;
                } else {
                  if (var5_int >= gf.field_h) {
                    break L9;
                  } else {
                    var11 = (var8 + (1 & var5_int + -param0)) * gf.field_i - -var5_int;
                    var12 = var10 + 1 - var8 >> 1;
                    L10: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L9;
                      } else {
                        gf.field_b[var11] = 16777215;
                        var11 = var11 + 2 * gf.field_i;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (gf.field_f > param3) {
                  break L11;
                } else {
                  if (gf.field_e <= var6) {
                    break L11;
                  } else {
                    var11 = var7 + var6 * gf.field_i - -(-param3 + var6 & 1);
                    var12 = -var7 + (var9 + 1) >> 1;
                    L12: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L11;
                      } else {
                        gf.field_b[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var5, "in.FA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void d(boolean param0) {
        int var2 = 0;
        la var3 = null;
        int var4 = 0;
        int stackIn_16_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          var2 = hc.field_c;
          if (var2 >= 64) {
            break L0;
          } else {
            if (pj.field_w[var2]) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  ((in) this).field_s = false;
                  break L1;
                }
              }
              if (0 == var2) {
                return;
              } else {
                L2: {
                  if (var2 != 1) {
                    if (var2 == 2) {
                      int discarded$9 = 30592;
                      ui.a();
                      break L2;
                    } else {
                      if (var2 != 3) {
                        if (var2 != 4) {
                          if (var2 != 5) {
                            if (6 == var2) {
                              int discarded$10 = 19664;
                              bf.b();
                              break L2;
                            } else {
                              if (var2 != 7) {
                                if (var2 != 8) {
                                  if (var2 != 16) {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (var2 != 12) {
                                          if (var2 == 13) {
                                            lf.d((byte) 123);
                                            break L2;
                                          } else {
                                            if (17 != var2) {
                                              if (18 != var2) {
                                                sm.a((Throwable) null, 1, "MGS1: " + sj.l(192));
                                                tl.a(124);
                                                break L2;
                                              } else {
                                                int discarded$11 = 16777215;
                                                rc.c();
                                                break L2;
                                              }
                                            } else {
                                              int discarded$12 = -28859;
                                              this.d();
                                              break L2;
                                            }
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L4: {
                                      if (var2 != 12) {
                                        stackOut_31_0 = 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        break L4;
                                      } else {
                                        stackOut_30_0 = 1;
                                        stackIn_32_0 = stackOut_30_0;
                                        break L4;
                                      }
                                    }
                                    int discarded$13 = 118;
                                    var3 = d.a(stackIn_32_0 != 0);
                                    jm.a(var3, (byte) 116);
                                    break L2;
                                  } else {
                                    ih.a((byte) 59);
                                    break L2;
                                  }
                                } else {
                                  hb.a(-5, (ec) (Object) ra.field_c, i.field_A, nj.field_b);
                                  break L2;
                                }
                              } else {
                                int discarded$14 = 8;
                                this.f();
                                break L2;
                              }
                            }
                          } else {
                            int discarded$15 = -5705;
                            rm.q();
                            break L2;
                          }
                        } else {
                          L5: {
                            if (param0) {
                              stackOut_15_0 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              break L5;
                            } else {
                              stackOut_14_0 = 1;
                              stackIn_16_0 = stackOut_14_0;
                              break L5;
                            }
                          }
                          hd.a(stackIn_16_0 != 0);
                          break L2;
                        }
                      } else {
                        int discarded$16 = 126;
                        pk.d();
                        break L2;
                      }
                    }
                  } else {
                    int discarded$17 = 72;
                    lg.a();
                    break L2;
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        sm.a((Throwable) null, 1, "MGS2: " + sj.l(192));
        tl.a(-48);
    }

    private final void d() {
        int var2 = ra.field_c.c(true);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = nj.field_b - 1;
        byte[] var5 = new byte[var4];
        ra.field_c.a(0, (byte) 95, var4, var5);
        int discarded$0 = 0;
        oe.a((byte) 121, var3 != 0, m.c(true), dj.a(var5));
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            ec var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = DungeonAssault.field_K;
            var4 = o.a(16711680, hc.field_d, param1, pj.field_r);
            if (var4 != 0) {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    int discarded$10 = -120;
                    var5_int = qh.a(false, ln.a(), om.a(true));
                    if (-1 != var5_int) {
                      int discarded$11 = -15;
                      ri.a(tp.field_v, mf.field_c, var5_int);
                      mf.field_c = null;
                      tp.field_v = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  int discarded$12 = 92;
                  var11 = fb.a();
                  if (var11 != null) {
                    ig.a(-99, var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 != 2) {
                  break L2;
                } else {
                  int discarded$13 = -87;
                  int discarded$14 = -73;
                  int discarded$15 = -29455;
                  var5_int = qm.a(((in) this).field_q, rn.a(), tp.c(), em.e(7142), vl.c(), 57, co.e((byte) 57));
                  if (-1 == var5_int) {
                    break L2;
                  } else {
                    gj.a(var5_int, 29120, mf.field_c, tp.field_v);
                    tp.field_v = null;
                    mf.field_c = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (3 == var4) {
                  L4: {
                    if (gm.field_c == -1) {
                      break L4;
                    } else {
                      if (gm.field_c == 0) {
                        break L4;
                      } else {
                        gm.field_c = -1;
                        en.a((byte) -54);
                        break L4;
                      }
                    }
                  }
                  if (param2) {
                    hh.field_c = false;
                    break L3;
                  } else {
                    int discarded$16 = -29455;
                    var5_int = bh.a(((in) this).field_u, em.e(7142), 106, ((in) this).field_q, false, vl.c());
                    if (var5_int != -1) {
                      if (var5_int == 0) {
                        ne.field_g = hg.field_s;
                        int discarded$17 = -97;
                        bl.b();
                        kh.field_n = 10;
                        tl.field_l = false;
                        break L3;
                      } else {
                        nf.a(var5_int, true, tp.field_v);
                        tp.field_v = null;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (4 == var4) {
                  if (!ld.field_g) {
                    tl.field_l = true;
                    kh.field_n = 10;
                    break L5;
                  } else {
                    pd.a(5189, m.c(true));
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 != 5) {
                  break L6;
                } else {
                  eg.a((byte) -37, m.c(true));
                  break L6;
                }
              }
              L7: {
                if (6 != var4) {
                  break L7;
                } else {
                  if (oj.field_b) {
                    kh.field_n = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (var4 == 7) {
                  pa.a(123, m.c(true));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (8 == var4) {
                  pd.a(5189, m.c(true));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (9 != var4) {
                  break L10;
                } else {
                  int discarded$18 = 0;
                  jl.a(m.c(true));
                  break L10;
                }
              }
              L11: {
                if (10 == var4) {
                  ac.field_B.d((byte) -90, 17);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 == 11) {
                  fk.a(84, m.c(true));
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var4 != 12) {
                  break L13;
                } else {
                  int discarded$19 = -21;
                  oe.a(ao.a(), m.c(true), (byte) 94);
                  break L13;
                }
              }
              L14: {
                if (13 != var4) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (null != hl.field_i) {
                          break L16;
                        } else {
                          hl.field_i = new tl(i.field_A, new java.net.URL(((in) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (!hl.field_i.d(34)) {
                          break L17;
                        } else {
                          L18: {
                            var12 = hl.field_i.c(3);
                            if (var12 == null) {
                              var9 = null;
                              rg.a(15, (String) null);
                              break L18;
                            } else {
                              var7 = mk.a((byte) -24, var12.field_m, var12.field_o, 0);
                              rg.a(15, var7);
                              break L18;
                            }
                          }
                          hl.field_i = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      sm.a((Throwable) (Object) var5, 1, "S1");
                      var10 = null;
                      rg.a(15, (String) null);
                      hl.field_i = null;
                      break L19;
                    }
                  }
                  break L14;
                }
              }
              L20: {
                if (var4 == 15) {
                  kh.field_n = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (17 != var4) {
                  return 0;
                } else {
                  return 2;
                }
              }
            } else {
              throw new IllegalStateException();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f() {
        int discarded$0 = -96;
        String var2 = eg.a();
        sm.a(m.c(true), 31500, var2);
    }

    final void a(int param0, String param1, int param2) {
        if (param2 != 0) {
            return;
        }
        try {
            int discarded$0 = 480;
            this.a(param1, 640, true, param0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "in.W(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    protected in() {
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_26_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        String stackIn_104_2 = null;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        String stackIn_105_2 = null;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        String stackIn_106_2 = null;
        int stackIn_106_3 = 0;
        int stackIn_135_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        String stackOut_103_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        String stackOut_105_2 = null;
        int stackOut_105_3 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        String stackOut_104_2 = null;
        int stackOut_104_3 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        L0: {
          var5 = DungeonAssault.field_K;
          if (null != il.field_c) {
            L1: {
              if (cm.field_R == null) {
                var6 = ua.a(0);
                var4 = var6.getSize();
                il.field_c.a(var4.height, true, var4.width);
                break L1;
              } else {
                break L1;
              }
            }
            il.field_c.e(6731);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          int discarded$19 = 94;
          bp.b();
          ke.b(param1 + 74);
          if (param1 == -74) {
            break L2;
          } else {
            ((in) this).field_q = -128;
            break L2;
          }
        }
        L3: {
          if (ao.a((byte) -116)) {
            break L3;
          } else {
            if (kh.field_n != 11) {
              int discarded$20 = -30208;
              cp.f();
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (bn.field_j == null) {
            break L4;
          } else {
            pj.field_r = bn.field_j.a(6);
            break L4;
          }
        }
        L5: {
          if (!dh.a((byte) -120)) {
            break L5;
          } else {
            L6: {
              int discarded$21 = 1;
              var3 = 1200 * eg.c();
              if (((in) this).field_v) {
                break L6;
              } else {
                int discarded$22 = 31;
                if (ib.b() <= var3) {
                  break L5;
                } else {
                  if (~var3 <= ~mn.a((byte) 106)) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            ((in) this).field_v = false;
            tl.a(122);
            l.a(param1 + 73);
            nf.a(2, true, sj.field_V);
            int discarded$23 = -105;
            ql.a();
            hh.field_c = true;
            ab.field_a = 15000L + kd.c(-2456);
            break L5;
          }
        }
        L7: {
          L8: {
            if (gm.field_c == -1) {
              break L8;
            } else {
              if (gm.field_c == 0) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          L9: {
            if (gm.field_c != -1) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L9;
            } else {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L9;
            }
          }
          L10: {
            var3 = stackIn_26_0;
            gm.field_c = fp.a((byte) 70);
            if (var3 == 0) {
              break L10;
            } else {
              if (0 != gm.field_c) {
                break L10;
              } else {
                if (11 != kh.field_n) {
                  break L10;
                } else {
                  if (!dm.c(param1 + -7)) {
                    int discarded$24 = -97;
                    bl.b();
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
          if (gm.field_c == -1) {
            break L7;
          } else {
            if (gm.field_c == 0) {
              break L7;
            } else {
              ab.field_a = 15000L + kd.c(param1 ^ 2526);
              break L7;
            }
          }
        }
        L11: {
          if (-1 == gm.field_c) {
            break L11;
          } else {
            if (gm.field_c == 0) {
              break L11;
            } else {
              if (10 <= dk.field_c) {
                if (kh.field_n >= 10) {
                  L12: {
                    l.a(param1 + 73);
                    if (3 != gm.field_c) {
                      if (gm.field_c == 4) {
                        nf.a(256, true, sf.field_e);
                        break L12;
                      } else {
                        if (gm.field_c == 2) {
                          nf.a(256, true, ul.field_b);
                          break L12;
                        } else {
                          if (gm.field_c != 5) {
                            nf.a(256, true, b.field_b);
                            break L12;
                          } else {
                            nf.a(5, true, ed.field_W);
                            break L12;
                          }
                        }
                      }
                    } else {
                      nf.a(256, true, ck.field_D);
                      break L12;
                    }
                  }
                  hh.field_c = true;
                  break L11;
                } else {
                  break L11;
                }
              } else {
                if (3 == gm.field_c) {
                  ((in) this).a((byte) -112, "js5crc");
                  break L11;
                } else {
                  if (gm.field_c == 4) {
                    ((in) this).a((byte) -112, "js5io");
                    break L11;
                  } else {
                    if (2 != gm.field_c) {
                      if (gm.field_c != 5) {
                        ((in) this).a((byte) -112, "js5connect");
                        break L11;
                      } else {
                        ((in) this).a((byte) -112, "outofdate");
                        break L11;
                      }
                    } else {
                      ((in) this).a((byte) -112, "js5connect_full");
                      break L11;
                    }
                  }
                }
              }
            }
          }
        }
        L13: {
          L14: {
            L15: {
              if (gm.field_c == -1) {
                break L15;
              } else {
                if (0 != gm.field_c) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (!dm.c(param1 + -43)) {
              break L13;
            } else {
              break L14;
            }
          }
          if (~kd.c(param1 + -2382) <= ~ab.field_a) {
            hh.field_c = false;
            if (gm.field_c == -1) {
              break L13;
            } else {
              if (0 == gm.field_c) {
                break L13;
              } else {
                gm.field_c = -1;
                en.a((byte) -124);
                break L13;
              }
            }
          } else {
            break L13;
          }
        }
        L16: {
          if (gm.field_c != 0) {
            break L16;
          } else {
            if (!dm.c(-125)) {
              u.field_O = false;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if (0 != dk.field_c) {
            break L17;
          } else {
            if (ln.a(255)) {
              dk.field_c = 1;
              break L17;
            } else {
              break L17;
            }
          }
        }
        L18: {
          if (dk.field_c != 1) {
            break L18;
          } else {
            L19: {
              if (hc.field_d == 0) {
                break L19;
              } else {
                ia.field_U = mk.a(mh.field_a, (byte) 34);
                break L19;
              }
            }
            int discarded$25 = 1;
            int discarded$26 = -31;
            fi.field_u = qd.a(false, true, s.field_a);
            int discarded$27 = 1;
            int discarded$28 = -31;
            kg.field_b = qd.a(false, true, pm.field_m);
            int discarded$29 = 1;
            int discarded$30 = -31;
            ib.field_b = qd.a(false, true, sp.field_h);
            dk.field_c = 2;
            gh.field_c = kg.field_b;
            uc.field_I = fi.field_u;
            break L18;
          }
        }
        L20: {
          if (dk.field_c == 2) {
            L21: {
              if (null != ia.field_U) {
                if (!ia.field_U.a(param1 + -14280)) {
                  break L21;
                } else {
                  if (ia.field_U.c("", param1 ^ -74)) {
                    if (!ia.field_U.a(false, "")) {
                      break L21;
                    } else {
                      ng.a(param1 ^ 27014, ia.field_U);
                      ia.field_U = null;
                      nf.d(0);
                      break L21;
                    }
                  } else {
                    ia.field_U = null;
                    break L21;
                  }
                }
              } else {
                break L21;
              }
            }
            if (ia.field_U != null) {
              break L20;
            } else {
              dk.field_c = 3;
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if (dk.field_c == 3) {
            if (!ql.a(kg.field_b, ib.field_b, (byte) 61, fi.field_u)) {
              break L22;
            } else {
              if (fl.a(-43, ib.field_b)) {
                L23: {
                  L24: {
                    jm.a(false);
                    int discarded$31 = 112;
                    am.b();
                    lj.field_e = bg.field_t;
                    oj.field_b = false;
                    h.a(param1 ^ -8099, fi.field_u, ib.field_b, ld.field_g, kg.field_b);
                    if (np.field_D) {
                      break L24;
                    } else {
                      if (null == mi.field_d) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    stackOut_100_0 = 8192;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_101_0 = stackOut_100_0;
                    if (np.field_D) {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = 0;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      break L25;
                    } else {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_103_0 = stackIn_103_0;
                    stackOut_103_1 = stackIn_103_1;
                    stackOut_103_2 = mi.field_d;
                    stackIn_105_0 = stackOut_103_0;
                    stackIn_105_1 = stackOut_103_1;
                    stackIn_105_2 = stackOut_103_2;
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    stackIn_104_2 = stackOut_103_2;
                    if (np.field_D) {
                      stackOut_105_0 = stackIn_105_0;
                      stackOut_105_1 = stackIn_105_1;
                      stackOut_105_2 = (String) (Object) stackIn_105_2;
                      stackOut_105_3 = 0;
                      stackIn_106_0 = stackOut_105_0;
                      stackIn_106_1 = stackOut_105_1;
                      stackIn_106_2 = stackOut_105_2;
                      stackIn_106_3 = stackOut_105_3;
                      break L26;
                    } else {
                      stackOut_104_0 = stackIn_104_0;
                      stackOut_104_1 = stackIn_104_1;
                      stackOut_104_2 = (String) (Object) stackIn_104_2;
                      stackOut_104_3 = 1;
                      stackIn_106_0 = stackOut_104_0;
                      stackIn_106_1 = stackOut_104_1;
                      stackIn_106_2 = stackOut_104_2;
                      stackIn_106_3 = stackOut_104_3;
                      break L26;
                    }
                  }
                  hd.a(stackIn_106_0, stackIn_106_1 != 0, stackIn_106_2, stackIn_106_3 != 0);
                  break L23;
                }
                L27: {
                  if (!f.field_d) {
                    break L27;
                  } else {
                    kd.a(4);
                    break L27;
                  }
                }
                L28: {
                  if (je.field_c != null) {
                    break L28;
                  } else {
                    int discarded$32 = 127;
                    je.field_c = fb.b();
                    int discarded$33 = -97;
                    tb.field_g = ab.a();
                    break L28;
                  }
                }
                nh.a((byte) -96, ib.field_b, je.field_c, tb.field_g);
                ib.field_b = null;
                fi.field_u = null;
                kg.field_b = null;
                int discarded$34 = 89;
                qj.a((java.applet.Applet) this);
                nf.d(0);
                dk.field_c = 10;
                break L22;
              } else {
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L29: {
          if (dk.field_c != 10) {
            break L29;
          } else {
            L30: {
              if (hc.field_d != 0) {
                ec.field_k = mk.a(bh.field_P, (byte) 34);
                break L30;
              } else {
                break L30;
              }
            }
            dk.field_c = 11;
            break L29;
          }
        }
        L31: {
          if (dk.field_c != 11) {
            break L31;
          } else {
            L32: {
              if (null == ec.field_k) {
                break L32;
              } else {
                L33: {
                  if (!ec.field_k.a(-14354)) {
                    break L33;
                  } else {
                    if (!ec.field_k.a((byte) 59)) {
                      break L33;
                    } else {
                      break L32;
                    }
                  }
                }
                int discarded$35 = -125;
                tp.a(10, 0.0f, lk.a(ki.field_c, ec.field_k, ec.field_r));
                break L31;
              }
            }
            ld.field_i = true;
            dk.field_c = 12;
            break L31;
          }
        }
        L34: {
          if (dk.field_c != 12) {
            break L34;
          } else {
            if (!ld.field_i) {
              dk.field_c = 13;
              break L34;
            } else {
              break L34;
            }
          }
        }
        L35: {
          if (dk.field_c == 13) {
            L36: {
              var3 = 1;
              if (be.field_s != null) {
                L37: {
                  if (!be.field_s.a(false)) {
                    stackOut_134_0 = 0;
                    stackIn_135_0 = stackOut_134_0;
                    break L37;
                  } else {
                    stackOut_133_0 = 1;
                    stackIn_135_0 = stackOut_133_0;
                    break L37;
                  }
                }
                var3 = stackIn_135_0;
                tp.a(10, be.field_s.field_j, be.field_s.field_b);
                break L36;
              } else {
                break L36;
              }
            }
            if (var3 == 0) {
              break L35;
            } else {
              dk.field_c = 20;
              break L35;
            }
          } else {
            break L35;
          }
        }
        L38: {
          if (param0) {
            break L38;
          } else {
            if (!ve.field_a) {
              break L38;
            } else {
              int discarded$36 = -32;
              pd.a(c.field_h);
              ((in) this).d((byte) 121);
              uk.a(c.field_h, (byte) -124);
              break L38;
            }
          }
        }
        L39: {
          if (!pj.field_w[8]) {
            break L39;
          } else {
            int discarded$37 = 12841;
            ta.b();
            break L39;
          }
        }
    }

    private final int g(int param0) {
        int var2 = 0;
        if (param0 == 11) {
          if (!((in) this).field_i) {
            if (!dm.c(-118)) {
              return -1;
            } else {
              if (!hh.field_c) {
                int discarded$4 = -29455;
                var2 = bh.a(((in) this).field_u, em.e(7142), 116, ((in) this).field_q, true, vl.c());
                if (var2 == -1) {
                  return -1;
                } else {
                  L0: {
                    if (0 == var2) {
                      break L0;
                    } else {
                      if (var2 == 1) {
                        break L0;
                      } else {
                        L1: {
                          if (rm.field_P) {
                            break L1;
                          } else {
                            ((in) this).a((byte) -112, "reconnect");
                            break L1;
                          }
                        }
                        l.a(-1);
                        nf.a(var2, true, tp.field_v);
                        hh.field_c = true;
                        ab.field_a = 15000L + kd.c(-2456);
                        return var2;
                      }
                    }
                  }
                  L2: {
                    if (kh.field_n != 11) {
                      break L2;
                    } else {
                      if (gm.field_c == 0) {
                        int discarded$5 = -97;
                        bl.b();
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return var2;
                }
              } else {
                return -1;
              }
            }
          } else {
            return -1;
          }
        } else {
          return 24;
        }
    }

    final void b(boolean param0, byte param1) {
        pj.field_w[16] = true;
        if (param1 >= -33) {
            ((in) this).field_F = 36;
        }
        pj.field_w[7] = true;
        pj.field_w[18] = true;
        pj.field_w[3] = true;
        pj.field_w[8] = param0;
        pj.field_w[17] = true;
        pj.field_w[0] = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new og();
        field_B = new int[]{2, 13, 14, 8, 28, 7, 11};
        field_t = "Nimble even by the standards of his dexterous race, the saurus slink can dodge traps and attacks with equal ease.";
    }
}
