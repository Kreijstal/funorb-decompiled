/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hd extends iv {
    int field_x;
    int field_A;
    boolean field_lb;
    ut field_N;
    private int field_w;
    int field_L;
    boolean field_nb;
    ut field_t;
    int field_T;
    int field_hb;
    ut[] field_R;
    int field_y;
    int field_O;
    hu field_X;
    int field_H;
    ut[] field_u;
    int field_mb;
    private int field_pb;
    ut field_r;
    String field_E;
    int field_s;
    int field_D;
    int field_kb;
    int field_P;
    String field_V;
    int field_M;
    boolean field_I;
    static String field_Z;
    int field_sb;
    int field_bb;
    ut field_vb;
    static String field_C;
    static String field_ib;
    private boolean field_db;
    int field_G;
    boolean field_Y;
    boolean field_wb;
    int field_F;
    int field_fb;
    int field_q;
    ut[] field_tb;
    int field_eb;
    ut[] field_S;
    int field_xb;
    ut[] field_rb;
    boolean field_Q;
    boolean field_gb;
    int field_p;
    tf field_jb;
    int field_qb;
    int field_B;
    int field_U;
    ut field_W;
    private boolean field_z;
    int field_ub;
    int field_v;
    int field_cb;
    int field_ab;
    boolean field_ob;
    int field_J;
    static double field_K;

    final static void a(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        int var9 = Kickabout.field_G;
        iw.a(-123, lg.field_a);
        ut var10 = j.a(-5275);
        int var5 = var10.field_o;
        int var6 = var10.field_v;
        int var7 = 0;
        while ((var7 ^ -1) > (on.field_g ^ -1)) {
            var8 = 0;
            while ((on.field_f ^ -1) < (var8 ^ -1)) {
                var10.d(var7, var8);
                var8 = var8 + var6;
            }
            var7 = var7 + var5;
        }
        td.a(param0, 15, param2, param1, param3, false);
        if (-1 == (ih.field_c ^ -1)) {
            og.a(75, gw.field_d, 15, 15);
        }
        if (!(1 != ih.field_c)) {
            og.a(116, tv.field_b, 15, 15);
        }
        if (!(2 != ih.field_c)) {
            wd.a(15, 15, 124);
        }
        ta.e(param0 ^ 122);
    }

    hd(long param0, hd param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var9 = 0;
        hd var10_ref_hd = null;
        int var11 = Kickabout.field_G;
        int var5 = -((hd) this).field_J;
        int var6 = var5 - ((hd) this).field_v;
        int var7 = ((hd) this).field_mb;
        if (param0 <= 16) {
            return;
        }
        int var8 = var7 - -((hd) this).field_L;
        if (!(param3)) {
            var9 = 0;
            var10_ref_hd = (hd) (Object) ((hd) this).field_jb.g(24009);
            while (var10_ref_hd != null) {
                var10_ref_hd.field_v = var9 - var10_ref_hd.field_J;
                var9 = var9 + (param1 + var10_ref_hd.field_L + var10_ref_hd.field_mb);
                var10_ref_hd = (hd) (Object) ((hd) this).field_jb.c(33);
            }
            var8 = var9 + -param1;
        }
        var9 = var8 - param2;
        if (!(var6 <= var9)) {
            var6 = var9;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var10 = -param2 + var7;
        if (var10 < var5) {
            var5 = var10;
        }
        if (0 > var5) {
            var5 = 0;
        }
        ((hd) this).field_L = -var7 + var8;
        ((hd) this).field_v = var5 - var6;
        ((hd) this).field_J = -var5;
        ((hd) this).field_mb = var7;
    }

    final int a(int param0, int param1) {
        int var4_int = 0;
        hd var4 = null;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        int var3 = param1;
        if (((hd) this).field_E != null) {
            if (!(null == ((hd) this).field_X)) {
                var4_int = ((hd) this).field_X.a(((hd) this).field_E, param0);
                if (!(var3 >= var4_int)) {
                    var3 = var4_int;
                }
            }
        }
        if (!(null == ((hd) this).field_N)) {
            var4_int = ((hd) this).field_N.field_o;
            if ((var4_int ^ -1) < (var3 ^ -1)) {
                var3 = var4_int;
            }
        }
        if (!(null == ((hd) this).field_jb)) {
            var4 = (hd) (Object) ((hd) this).field_jb.g(24009);
            while (var4 != null) {
                var5 = var4.field_s - -var4.field_q;
                if (var3 < var5) {
                    var3 = var5;
                }
                var4 = (hd) (Object) ((hd) this).field_jb.c(param1 + 33);
            }
        }
        return var3;
    }

    final void a(int param0, boolean param1) {
        this.a(true, -105, false, 0, false, 0, param1, on.field_g, false, false, on.field_f);
        if (param0 <= 45) {
            ((hd) this).field_y = 117;
        }
    }

    final void a(hd param0, byte param1) {
        int var3 = 0;
        Object stackIn_84_0 = null;
        Object stackIn_85_0 = null;
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        Object stackOut_83_0 = null;
        Object stackOut_84_0 = null;
        Object stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        Object stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        L0: {
          var3 = -37 / ((param1 - -26) / 51);
          if (param0 != null) {
            L1: {
              if (0 != param0.field_y) {
                ((hd) this).field_y = param0.field_y;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != param0.field_S) {
                ((hd) this).field_S = param0.field_S;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0.field_z) {
                ((hd) this).field_z = param0.field_z;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param0.field_nb) {
                break L4;
              } else {
                ((hd) this).field_nb = param0.field_nb;
                break L4;
              }
            }
            L5: {
              if (null == param0.field_tb) {
                break L5;
              } else {
                ((hd) this).field_tb = param0.field_tb;
                break L5;
              }
            }
            L6: {
              if (null != param0.field_V) {
                ((hd) this).field_V = param0.field_V;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (null != param0.field_W) {
                ((hd) this).field_W = param0.field_W;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (null != param0.field_r) {
                ((hd) this).field_r = param0.field_r;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param0.field_vb == null) {
                break L9;
              } else {
                ((hd) this).field_vb = param0.field_vb;
                break L9;
              }
            }
            L10: {
              if (0 <= param0.field_ab) {
                ((hd) this).field_ab = param0.field_ab;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param0.field_rb == null) {
                break L11;
              } else {
                ((hd) this).field_rb = param0.field_rb;
                break L11;
              }
            }
            L12: {
              if (param0.field_H >= 0) {
                ((hd) this).field_H = param0.field_H;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (param0.field_N != null) {
                ((hd) this).field_N = param0.field_N;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (null != param0.field_u) {
                ((hd) this).field_u = param0.field_u;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (!param0.field_lb) {
                ((hd) this).field_lb = param0.field_lb;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (0 == param0.field_xb) {
                break L16;
              } else {
                ((hd) this).field_xb = param0.field_xb;
                break L16;
              }
            }
            L17: {
              if (param0.field_E != null) {
                ((hd) this).field_E = param0.field_E;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (-1 == (param0.field_kb ^ -1)) {
                break L18;
              } else {
                ((hd) this).field_kb = param0.field_kb;
                break L18;
              }
            }
            L19: {
              if (param0.field_I) {
                ((hd) this).field_I = param0.field_I;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (param0.field_t == null) {
                break L20;
              } else {
                ((hd) this).field_t = param0.field_t;
                break L20;
              }
            }
            L21: {
              if ((param0.field_U ^ -1) != -257) {
                ((hd) this).field_U = param0.field_U;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (param0.field_hb < 0) {
                break L22;
              } else {
                ((hd) this).field_hb = param0.field_hb;
                break L22;
              }
            }
            L23: {
              if (param0.field_ob) {
                ((hd) this).field_ob = param0.field_ob;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if ((param0.field_ub ^ -1) > -1) {
                break L24;
              } else {
                ((hd) this).field_ub = param0.field_ub;
                break L24;
              }
            }
            L25: {
              if (param0.field_R == null) {
                break L25;
              } else {
                ((hd) this).field_R = param0.field_R;
                break L25;
              }
            }
            L26: {
              if (null == param0.field_X) {
                break L26;
              } else {
                ((hd) this).field_X = param0.field_X;
                break L26;
              }
            }
            L27: {
              if ((param0.field_D ^ -1) != -1) {
                ((hd) this).field_D = param0.field_D;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (param0.field_p != 0) {
                ((hd) this).field_p = param0.field_p;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (0 == param0.field_B) {
                break L29;
              } else {
                ((hd) this).field_B = param0.field_B;
                break L29;
              }
            }
            L30: {
              if (-2147483648 != param0.field_O) {
                ((hd) this).field_O = param0.field_O;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (2147483647 != (param0.field_eb ^ -1)) {
                ((hd) this).field_eb = param0.field_eb;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              L33: {
                stackOut_83_0 = this;
                stackIn_86_0 = stackOut_83_0;
                stackIn_84_0 = stackOut_83_0;
                if (!((hd) this).field_nb) {
                  break L33;
                } else {
                  stackOut_84_0 = this;
                  stackIn_86_0 = stackOut_84_0;
                  stackIn_85_0 = stackOut_84_0;
                  if (!param0.field_wb) {
                    break L33;
                  } else {
                    stackOut_85_0 = this;
                    stackOut_85_1 = 1;
                    stackIn_87_0 = stackOut_85_0;
                    stackIn_87_1 = stackOut_85_1;
                    break L32;
                  }
                }
              }
              stackOut_86_0 = this;
              stackOut_86_1 = 0;
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              break L32;
            }
            L34: {
              ((hd) this).field_wb = stackIn_87_1 != 0;
              if ((param0.field_w ^ -1) == 2147483647) {
                break L34;
              } else {
                ((hd) this).field_w = param0.field_w;
                break L34;
              }
            }
            L35: {
              ((hd) this).field_db = param0.field_db;
              if (-2147483648 != param0.field_x) {
                ((hd) this).field_x = param0.field_x;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (param0.field_Y) {
                ((hd) this).field_Y = param0.field_Y;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (-2147483648 == param0.field_cb) {
                break L37;
              } else {
                ((hd) this).field_cb = param0.field_cb;
                break L37;
              }
            }
            L38: {
              if (0 != param0.field_A) {
                ((hd) this).field_A = param0.field_A;
                break L38;
              } else {
                break L38;
              }
            }
            if (param0.field_pb != -2147483648) {
              ((hd) this).field_pb = param0.field_pb;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
    }

    final void b(int param0, boolean param1) {
        ic.field_f = !param1 ? true : false;
        bd.field_D = !param1 ? true : false;
        this.a(0, param0 ^ -1, true, on.field_f, param0, on.field_g);
    }

    final static boolean a(boolean param0, int param1, int param2) {
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        Object var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        Object var21 = null;
        CharSequence var22 = null;
        L0: {
          var21 = null;
          var11 = Kickabout.field_G;
          var3 = 1;
          if (!param0) {
            break L0;
          } else {
            hd.g(-41);
            break L0;
          }
        }
        L1: {
          if (dg.field_a) {
            break L1;
          } else {
            if (mu.field_Y == null) {
              var3 = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if ((ov.field_b ^ -1) != -1) {
            break L2;
          } else {
            if (ow.field_b != null) {
              var3 = 0;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (2 != ov.field_b) {
            break L3;
          } else {
            if (jc.b(-3197)) {
              break L3;
            } else {
              var3 = 0;
              break L3;
            }
          }
        }
        if (84 == cc.field_e) {
          L4: {
            if (var3 == 0) {
              if (ov.field_b != 0) {
                td.a(-108);
                break L4;
              } else {
                return true;
              }
            } else {
              L5: {
                if (-1 > (cq.field_m.length() ^ -1)) {
                  var4_ref_String = cq.field_m.toString();
                  if (tb.a(var4_ref_String, -125)) {
                    var13 = null;
                    var12 = null;
                    wi.a((String) null, (String) null, 0, 2, ng.field_i, -125);
                    var15 = null;
                    var14 = null;
                    wi.a((String) null, (String) null, 0, 2, mg.field_e, -126);
                    break L5;
                  } else {
                    L6: {
                      var5 = ov.field_b;
                      if (var5 != 0) {
                        break L6;
                      } else {
                        if (uv.field_i != null) {
                          var5 = 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (r.a(0, var5) == 2) {
                        gd.a(-117, 1, var5, param2);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    gp.a(-1, 82, ov.field_b, param1, at.field_Kb, var4_ref_String);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              td.a(99);
              break L4;
            }
          }
          return true;
        } else {
          if ((cc.field_e ^ -1) == -86) {
            L8: {
              if (var3 == 0) {
                break L8;
              } else {
                if (-1 > (cq.field_m.length() ^ -1)) {
                  StringBuilder discarded$3 = dj.a(-1 + cq.field_m.length(), ' ', -11407, cq.field_m);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            return true;
          } else {
            var4 = il.field_c;
            if (rr.a(-108, (char) var4)) {
              L9: {
                if (var3 == 0) {
                  break L9;
                } else {
                  if (-81 < (cq.field_m.length() ^ -1)) {
                    L10: {
                      StringBuilder discarded$4 = cq.field_m.append(var4);
                      var5 = 485;
                      var17 = ow.field_e;
                      var7 = var17;
                      var7 = var17;
                      var16 = ga.a(false, var17);
                      var7 = var16;
                      var7 = var16;
                      var19 = var16;
                      var7 = var19;
                      var7 = var19;
                      if (2 != ov.field_b) {
                        L11: {
                          var7 = "";
                          if (ov.field_b == 0) {
                            L12: {
                              if (uv.field_i != null) {
                                break L12;
                              } else {
                                if (!uk.field_d) {
                                  break L12;
                                } else {
                                  var7 = "[" + qt.field_z + "] ";
                                  break L12;
                                }
                              }
                            }
                            if (uv.field_i != null) {
                              L13: {
                                if (!ol.field_R) {
                                  break L13;
                                } else {
                                  if (null != ct.field_x) {
                                    var7 = "[" + ct.field_x + "] ";
                                    break L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var7 = "[" + vo.a((byte) -18, bv.field_m, new String[1]) + "] ";
                              break L11;
                            } else {
                              break L11;
                            }
                          } else {
                            break L11;
                          }
                        }
                        var20 = var7 + var19 + ": ";
                        var5 = var5 - nl.field_i.a(var20);
                        break L10;
                      } else {
                        var22 = (CharSequence) (Object) at.field_Kb;
                        var18 = vo.a((byte) -18, b.field_F, new String[1]);
                        var7 = var18;
                        var7 = var18;
                        var8 = vo.a((byte) -18, field_ib, new String[1]);
                        var7 = var8;
                        var7 = var8;
                        var9 = nl.field_i.a(var18);
                        var10 = nl.field_i.a(var8);
                        if (var10 >= var9) {
                          var5 = var5 - var10;
                          break L10;
                        } else {
                          var5 = var5 - var9;
                          break L10;
                        }
                      }
                    }
                    if (nl.field_i.a(cq.field_m.toString()) <= var5) {
                      break L9;
                    } else {
                      StringBuilder discarded$5 = dj.a(cq.field_m.length() - 1, ' ', -11407, cq.field_m);
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
              }
              return true;
            } else {
              return false;
            }
          }
        }
    }

    public static void g(int param0) {
        field_Z = null;
        if (param0 != -14457) {
            hd.g(118);
        }
        field_C = null;
        field_ib = null;
    }

    final int g(byte param0) {
        int var2 = -9 % ((56 - param0) / 35);
        return ((hd) this).a(2147483647, 0);
    }

    hd(long param0, hd param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int var14 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var13 = null;
          var14 = Kickabout.field_G;
          if (-1 <= (((hd) this).field_fb ^ -1)) {
            var7 = ((hd) this).field_fb >> 901956354;
            break L0;
          } else {
            var7 = -(-((hd) this).field_fb >> -420696190);
            break L0;
          }
        }
        L1: {
          ((hd) this).field_s = ((hd) this).field_s + var7;
          ((hd) this).field_fb = ((hd) this).field_fb - var7;
          if ((((hd) this).field_v ^ -1) >= param1) {
            var7 = ((hd) this).field_v >> 1491830242;
            break L1;
          } else {
            var7 = -(-((hd) this).field_v >> 1900793890);
            break L1;
          }
        }
        L2: {
          ((hd) this).field_v = ((hd) this).field_v - var7;
          ((hd) this).field_J = ((hd) this).field_J + var7;
          if (-1 <= (((hd) this).field_G ^ -1)) {
            var7 = ((hd) this).field_G >> 1646120034;
            break L2;
          } else {
            var7 = -(-((hd) this).field_G >> 628866498);
            break L2;
          }
        }
        L3: {
          ((hd) this).field_q = ((hd) this).field_q + var7;
          ((hd) this).field_G = ((hd) this).field_G - var7;
          if ((((hd) this).field_L ^ -1) < -1) {
            var7 = -(-((hd) this).field_L >> 574688482);
            break L3;
          } else {
            var7 = ((hd) this).field_L >> -2040866942;
            break L3;
          }
        }
        L4: {
          L5: {
            ((hd) this).field_T = param4 - -((hd) this).field_J;
            ((hd) this).field_L = ((hd) this).field_L - var7;
            ((hd) this).field_mb = ((hd) this).field_mb + var7;
            ((hd) this).field_F = ((hd) this).field_s + param0;
            param2 = param2 & ((hd) this).field_lb;
            var8 = on.field_b;
            var9 = on.field_e;
            var10 = on.field_c;
            var11 = on.field_h;
            on.h(((hd) this).field_F, ((hd) this).field_T, ((hd) this).field_F + ((hd) this).field_q, ((hd) this).field_mb + ((hd) this).field_T);
            var12 = 0;
            if (ic.field_f) {
              break L5;
            } else {
              if (!param2) {
                break L5;
              } else {
                if ((wj.field_A ^ -1) == -1) {
                  break L5;
                } else {
                  if (on.field_b > sm.field_q) {
                    break L5;
                  } else {
                    if (on.field_c <= sm.field_q) {
                      break L5;
                    } else {
                      if (vc.field_y < on.field_e) {
                        break L5;
                      } else {
                        if (on.field_h <= vc.field_y) {
                          break L5;
                        } else {
                          var12 = 1;
                          ((hd) this).field_bb = -((hd) this).field_F + sm.field_q;
                          ((hd) this).field_qb = wj.field_A;
                          ((hd) this).field_sb = wj.field_A;
                          ((hd) this).field_M = vc.field_y + -((hd) this).field_T;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L6: {
            if ((wj.field_A ^ -1) != -1) {
              ((hd) this).field_qb = 0;
              break L6;
            } else {
              break L6;
            }
          }
          ((hd) this).field_sb = 0;
          break L4;
        }
        L7: {
          L8: {
            stackOut_24_0 = this;
            stackIn_30_0 = stackOut_24_0;
            stackIn_25_0 = stackOut_24_0;
            if (bd.field_D) {
              break L8;
            } else {
              stackOut_25_0 = this;
              stackIn_30_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if ((on.field_b ^ -1) < (el.field_A ^ -1)) {
                break L8;
              } else {
                stackOut_26_0 = this;
                stackIn_30_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if ((el.field_A ^ -1) <= (on.field_c ^ -1)) {
                  break L8;
                } else {
                  stackOut_27_0 = this;
                  stackIn_30_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (on.field_e > n.field_m) {
                    break L8;
                  } else {
                    stackOut_28_0 = this;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if ((n.field_m ^ -1) <= (on.field_h ^ -1)) {
                      break L8;
                    } else {
                      stackOut_29_0 = this;
                      stackOut_29_1 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      break L7;
                    }
                  }
                }
              }
            }
          }
          stackOut_30_0 = this;
          stackOut_30_1 = 0;
          stackIn_31_0 = stackOut_30_0;
          stackIn_31_1 = stackOut_30_1;
          break L7;
        }
        L9: {
          ((hd) this).field_Q = stackIn_31_1 != 0;
          if ((nl.field_p ^ -1) == -1) {
            ((hd) this).field_qb = 0;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          L11: {
            stackOut_34_0 = this;
            stackIn_38_0 = stackOut_34_0;
            stackIn_35_0 = stackOut_34_0;
            if (!((hd) this).field_Q) {
              break L11;
            } else {
              stackOut_35_0 = this;
              stackIn_38_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (((hd) this).field_qb != nl.field_p) {
                break L11;
              } else {
                stackOut_36_0 = this;
                stackIn_38_0 = stackOut_36_0;
                stackIn_37_0 = stackOut_36_0;
                if (!param2) {
                  break L11;
                } else {
                  stackOut_37_0 = this;
                  stackOut_37_1 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  break L10;
                }
              }
            }
          }
          stackOut_38_0 = this;
          stackOut_38_1 = 0;
          stackIn_39_0 = stackOut_38_0;
          stackIn_39_1 = stackOut_38_1;
          break L10;
        }
        L12: {
          ((hd) this).field_gb = stackIn_39_1 != 0;
          if (null == ((hd) this).field_jb) {
            break L12;
          } else {
            var13 = (Object) (Object) (hd) (Object) ((hd) this).field_jb.d(param1 ^ 9032);
            L13: while (true) {
              if (var13 == null) {
                break L12;
              } else {
                ((hd) var13).a(((hd) var13).field_F, param1 ^ 0, param2, ((hd) var13).field_mb, ((hd) var13).field_T, ((hd) var13).field_q);
                var13 = (Object) (Object) (hd) (Object) ((hd) var13).field_jb.e(33);
                continue L13;
              }
            }
          }
        }
        L14: {
          if (!((hd) var13).field_Q) {
            break L14;
          } else {
            bd.field_D = true;
            break L14;
          }
        }
        L15: {
          if (var12 == 0) {
            break L15;
          } else {
            ic.field_f = true;
            break L15;
          }
        }
        L16: {
          on.e(var8, var9, var10, var11);
          if (((hd) var13).field_qb == 0) {
            break L16;
          } else {
            if (!((hd) var13).field_Y) {
              break L16;
            } else {
              L17: {
                ((hd) this).field_J = -param4 + -((hd) var13).field_M + n.field_m;
                ((hd) this).field_s = -param0 + (-((hd) var13).field_bb + el.field_A);
                if (((hd) var13).field_s < 0) {
                  ((hd) this).field_s = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if ((((hd) var13).field_s ^ -1) < (-((hd) var13).field_q + param5 ^ -1)) {
                  ((hd) this).field_s = -((hd) var13).field_q + param5;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (0 <= ((hd) var13).field_J) {
                  break L19;
                } else {
                  ((hd) this).field_J = 0;
                  break L19;
                }
              }
              L20: {
                ((hd) this).field_v = 0;
                ((hd) this).field_fb = 0;
                ((hd) this).field_F = param0 - -((hd) var13).field_s;
                if (param3 - ((hd) var13).field_mb >= ((hd) var13).field_J) {
                  break L20;
                } else {
                  ((hd) this).field_J = -((hd) var13).field_mb + param3;
                  break L20;
                }
              }
              ((hd) this).field_T = param4 - -((hd) var13).field_J;
              break L16;
            }
          }
        }
    }

    final void a(boolean param0, int param1, hd param2, hd param3) {
        if (param3 != null) {
            param2.field_v = param3.field_L + param3.field_v;
            param2.field_J = param3.field_mb + param3.field_J - -param1;
        } else {
            param2.field_J = 0;
            param2.field_v = 0;
        }
        if (!param0) {
            ((hd) this).a(false, -45, -58, 26, 35);
        }
    }

    final void a(byte param0, hd param1) {
        if (((hd) this).field_jb == null) {
            ((hd) this).field_jb = new tf();
        }
        if (param0 > -103) {
            return;
        }
        ((hd) this).field_jb.a((gn) (Object) param1, 3);
    }

    final void b(boolean param0) {
        hd var4 = null;
        int var3 = Kickabout.field_G;
        if (param0) {
            return;
        }
        if (((hd) this).field_jb != null) {
            var4 = (hd) (Object) ((hd) this).field_jb.d(-9033);
            while (var4 != null) {
                var4.field_z = true;
                var4.b(param0);
                var4 = (hd) (Object) var4.field_jb.e(33);
            }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        ((hd) this).field_fb = 0;
        ((hd) this).field_v = 0;
        if (!param0) {
            Object var7 = null;
            ((hd) this).a(-115, (hd) null);
        }
        ((hd) this).field_L = 0;
        ((hd) this).field_s = param2;
        ((hd) this).field_J = param3;
        ((hd) this).field_mb = param4;
        ((hd) this).field_G = 0;
        ((hd) this).field_q = param1;
    }

    private final void a(boolean param0, int param1, boolean param2, int param3, boolean param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ut[] var16 = null;
        ut var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        hd var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var23 = null;
        var25 = Kickabout.field_G;
        ((hd) this).field_F = param5 - -((hd) this).field_s;
        ((hd) this).field_T = ((hd) this).field_J + param3;
        var12 = on.field_b;
        var13 = on.field_e;
        var14 = on.field_c;
        if (param1 < -7) {
          L0: {
            var15 = on.field_h;
            on.h(((hd) this).field_F, ((hd) this).field_T, ((hd) this).field_F - -((hd) this).field_q, ((hd) this).field_mb + ((hd) this).field_T);
            if (((hd) this).field_z) {
              break L0;
            } else {
              L1: {
                param4 = ((hd) this).field_gb;
                if (((hd) this).field_qb == 0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              param8 = stackIn_6_0 != 0;
              param9 = ((hd) this).field_I;
              break L0;
            }
          }
          L2: {
            param0 = param0 & ((hd) this).field_lb;
            var16 = ((hd) this).field_R;
            var17 = ((hd) this).field_N;
            var18 = ((hd) this).field_y;
            var19 = 0;
            if (param0) {
              break L2;
            } else {
              L3: {
                if ((((hd) this).field_hb ^ -1) > -1) {
                  break L3;
                } else {
                  var18 = ((hd) this).field_hb;
                  break L3;
                }
              }
              L4: {
                if (null == ((hd) this).field_t) {
                  break L4;
                } else {
                  var17 = ((hd) this).field_t;
                  break L4;
                }
              }
              if (((hd) this).field_tb != null) {
                var16 = ((hd) this).field_tb;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L5: {
            var20 = 0;
            if (!param4) {
              break L5;
            } else {
              L6: {
                if (((hd) this).field_pb == -2147483648) {
                  break L6;
                } else {
                  var19 = ((hd) this).field_pb;
                  break L6;
                }
              }
              L7: {
                if (null == ((hd) this).field_vb) {
                  break L7;
                } else {
                  var17 = ((hd) this).field_vb;
                  break L7;
                }
              }
              L8: {
                if (null == ((hd) this).field_S) {
                  break L8;
                } else {
                  var16 = ((hd) this).field_S;
                  break L8;
                }
              }
              L9: {
                if (-1 < (((hd) this).field_ub ^ -1)) {
                  break L9;
                } else {
                  var18 = ((hd) this).field_ub;
                  break L9;
                }
              }
              if (((hd) this).field_w != -2147483648) {
                var20 = ((hd) this).field_w;
                break L5;
              } else {
                break L5;
              }
            }
          }
          L10: {
            if (param8) {
              L11: {
                if (2147483647 == (((hd) this).field_eb ^ -1)) {
                  break L11;
                } else {
                  var19 = ((hd) this).field_eb;
                  break L11;
                }
              }
              L12: {
                if (0 <= ((hd) this).field_ab) {
                  var18 = ((hd) this).field_ab;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if ((((hd) this).field_O ^ -1) != 2147483647) {
                  var20 = ((hd) this).field_O;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (null != ((hd) this).field_rb) {
                  var16 = ((hd) this).field_rb;
                  break L14;
                } else {
                  break L14;
                }
              }
              if (((hd) this).field_r != null) {
                var17 = ((hd) this).field_r;
                break L10;
              } else {
                break L10;
              }
            } else {
              break L10;
            }
          }
          L15: {
            if (!param9) {
              break L15;
            } else {
              L16: {
                if (((hd) this).field_W != null) {
                  var17 = ((hd) this).field_W;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (-2147483648 == ((hd) this).field_cb) {
                  break L17;
                } else {
                  var20 = ((hd) this).field_cb;
                  break L17;
                }
              }
              L18: {
                if ((((hd) this).field_H ^ -1) <= -1) {
                  var18 = ((hd) this).field_H;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (((hd) this).field_x == -2147483648) {
                  break L19;
                } else {
                  var19 = ((hd) this).field_x;
                  break L19;
                }
              }
              if (((hd) this).field_u != null) {
                var16 = ((hd) this).field_u;
                break L15;
              } else {
                break L15;
              }
            }
          }
          L20: {
            var21 = var19 + ((hd) this).field_D;
            var22 = ((hd) this).field_B + var20;
            if (!((hd) this).field_ob) {
              ea.a(((hd) this).field_T, ((hd) this).field_mb, ((hd) this).field_F, (byte) -102, var16, ((hd) this).field_q);
              break L20;
            } else {
              ea.a(param3, param10, param5, (byte) -117, var16, param7);
              break L20;
            }
          }
          L21: {
            if (var17 == null) {
              break L21;
            } else {
              L22: {
                var23_int = ((hd) this).field_F + var21;
                if (((hd) this).field_A == 1) {
                  var23_int = var23_int + (-var17.field_o + ((hd) this).field_q) / 2;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                var24 = ((hd) this).field_T + var22;
                if ((((hd) this).field_p ^ -1) != -2) {
                  break L23;
                } else {
                  var24 = var24 + (((hd) this).field_mb + -var17.field_v) / 2;
                  break L23;
                }
              }
              L24: {
                if (2 != ((hd) this).field_A) {
                  break L24;
                } else {
                  var23_int = var23_int + (-var17.field_o + ((hd) this).field_q);
                  break L24;
                }
              }
              L25: {
                if (2 == ((hd) this).field_p) {
                  var24 = var24 + (-var17.field_v + ((hd) this).field_mb);
                  break L25;
                } else {
                  break L25;
                }
              }
              if (-257 >= (((hd) this).field_P ^ -1)) {
                var17.c(var23_int, var24);
                break L21;
              } else {
                var17.b(var23_int, var24, ((hd) this).field_P);
                break L21;
              }
            }
          }
          L26: {
            if (null == ((hd) this).field_E) {
              break L26;
            } else {
              if (((hd) this).field_X != null) {
                L27: {
                  var26 = ((hd) this).field_E;
                  var27 = var26;
                  var27 = var26;
                  if (!param6) {
                    break L27;
                  } else {
                    if (null == ((hd) this).field_V) {
                      break L27;
                    } else {
                      var27 = var26 + ((hd) this).field_V;
                      break L27;
                    }
                  }
                }
                L28: {
                  if ((((hd) this).field_X.a(var27) ^ -1) < (((hd) this).field_q - 2 * ((hd) this).field_kb ^ -1)) {
                    break L28;
                  } else {
                    if (-1 >= (var27.indexOf("<br>") ^ -1)) {
                      break L28;
                    } else {
                      L29: {
                        if (-2 != (((hd) this).field_p ^ -1)) {
                          if (2 == ((hd) this).field_p) {
                            var22 = var22 + (-((hd) this).field_X.field_G + (-((hd) this).field_X.field_p + ((hd) this).field_mb));
                            break L29;
                          } else {
                            break L29;
                          }
                        } else {
                          var22 = var22 + (-((hd) this).field_X.field_p + (((hd) this).field_mb + -((hd) this).field_X.field_G)) / 2;
                          break L29;
                        }
                      }
                      if ((((hd) this).field_A ^ -1) == -1) {
                        ((hd) this).field_X.b(var27, var21 + (((hd) this).field_F + ((hd) this).field_kb), ((hd) this).field_X.field_G + ((hd) this).field_T + var22, var18, -1, ((hd) this).field_U);
                        break L26;
                      } else {
                        if (((hd) this).field_A != 1) {
                          if (2 != ((hd) this).field_A) {
                            int discarded$2 = ((hd) this).field_X.a(var27, var21 + (((hd) this).field_kb + ((hd) this).field_F), ((hd) this).field_T - -var22, ((hd) this).field_q + -(((hd) this).field_kb * 2), ((hd) this).field_mb, var18, -1, ((hd) this).field_U, ((hd) this).field_A, ((hd) this).field_p, ((hd) this).field_xb);
                            break L26;
                          } else {
                            ((hd) this).field_X.a(var27, -(2 * ((hd) this).field_kb) - -((hd) this).field_q + ((hd) this).field_F - (-((hd) this).field_kb - var21), ((hd) this).field_X.field_G + ((hd) this).field_T - -var22, var18, -1, ((hd) this).field_U);
                            break L26;
                          }
                        } else {
                          ((hd) this).field_X.c(var27, ((hd) this).field_kb + ((hd) this).field_F - -var21 + (-(2 * ((hd) this).field_kb) + ((hd) this).field_q) / 2, ((hd) this).field_X.field_G + ((hd) this).field_T - -var22, var18, -1, ((hd) this).field_U);
                          break L26;
                        }
                      }
                    }
                  }
                }
                int discarded$3 = ((hd) this).field_X.a(var27, ((hd) this).field_F - (-((hd) this).field_kb + -var21), ((hd) this).field_T + var22, ((hd) this).field_q + -(2 * ((hd) this).field_kb), ((hd) this).field_mb, var18, -1, ((hd) this).field_U, ((hd) this).field_A, ((hd) this).field_p, ((hd) this).field_xb);
                break L26;
              } else {
                break L26;
              }
            }
          }
          L30: {
            if (null != ((hd) this).field_jb) {
              var23_ref = (hd) (Object) ((hd) this).field_jb.g(24009);
              L31: while (true) {
                if (var23_ref == null) {
                  break L30;
                } else {
                  var23_ref.a(param0, -114, var23_ref.field_wb, var20 + var23_ref.field_T, param4, var19 + var23_ref.field_F, param6, var23_ref.field_q, param8, param9, var23_ref.field_mb);
                  var23_ref = (hd) (Object) var23_ref.field_jb.c(33);
                  continue L31;
                }
              }
            } else {
              break L30;
            }
          }
          on.e(var12, var13, var14, var15);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, hd param1) {
        nw var3_ref_nw = null;
        Object var4 = null;
        int var5 = Kickabout.field_G;
        if (((hd) this).field_jb != null) {
            var3_ref_nw = new nw(((hd) this).field_jb);
            var4 = (Object) (Object) (hd) (Object) var3_ref_nw.a((byte) 54);
            while (var4 != null) {
                ((hd) var4).a(103, param1);
                var4 = (Object) (Object) (hd) (Object) var3_ref_nw.a(0);
            }
        }
        ((hd) this).field_wb = (Object) (Object) param1 == this ? true : false;
        if (!(!((hd) var4).field_db)) {
            ((hd) this).field_I = ((hd) var4).field_wb;
        }
        int var3 = -75 % ((39 - param0) / 48);
    }

    public hd() {
        ((hd) this).field_H = -1;
        ((hd) this).field_O = -2147483648;
        ((hd) this).field_pb = -2147483648;
        ((hd) this).field_P = 256;
        ((hd) this).field_w = -2147483648;
        ((hd) this).field_x = -2147483648;
        ((hd) this).field_hb = -1;
        ((hd) this).field_nb = false;
        ((hd) this).field_wb = false;
        ((hd) this).field_lb = true;
        ((hd) this).field_db = false;
        ((hd) this).field_eb = -2147483648;
        ((hd) this).field_ub = -1;
        ((hd) this).field_U = 256;
        ((hd) this).field_ab = -1;
        ((hd) this).field_cb = -2147483648;
    }

    hd(long param0, hd param1, int param2, int param3, int param4, int param5, String param6) {
        ((hd) this).field_H = -1;
        ((hd) this).field_O = -2147483648;
        ((hd) this).field_pb = -2147483648;
        ((hd) this).field_P = 256;
        ((hd) this).field_w = -2147483648;
        ((hd) this).field_x = -2147483648;
        ((hd) this).field_hb = -1;
        ((hd) this).field_nb = false;
        ((hd) this).field_wb = false;
        ((hd) this).field_lb = true;
        ((hd) this).field_db = false;
        ((hd) this).field_eb = -2147483648;
        ((hd) this).field_ub = -1;
        ((hd) this).field_U = 256;
        ((hd) this).field_ab = -1;
        ((hd) this).field_cb = -2147483648;
        ((hd) this).field_s = param2;
        ((hd) this).field_mb = param5;
        ((hd) this).field_a = param0;
        ((hd) this).field_J = param3;
        ((hd) this).field_q = param4;
        ((hd) this).a(param1, (byte) -86);
        if (param6 != null) {
            ((hd) this).field_E = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = "Type your password again to make sure it's correct";
        field_C = "Average rating";
        field_ib = "From <%0>: ";
    }
}
