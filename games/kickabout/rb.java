/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rb extends hd {
    static int field_yb;
    static int field_Bb;
    private StringBuilder field_Db;
    private hd field_Lb;
    private hd field_Cb;
    static String field_Hb;
    private hd field_Nb;
    private hd[] field_Jb;
    static int field_Kb;
    private om field_zb;
    static String field_Ib;
    long field_Eb;
    private hd field_Ab;
    private hd field_Fb;
    static int field_Mb;
    private int field_Ob;
    private hd field_Gb;

    final static tv a(int param0, int param1, byte param2, int param3) {
        tv var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        tv var8_ref_tv = null;
        int var9 = 0;
        tv var9_ref_tv = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        var13 = Kickabout.field_G;
        pw.field_G.field_Ab.field_jb.b(22997);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = vb.field_j - 1;
        L0: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (vb.field_j <= var8) {
                L2: {
                  var8 = var6 + -var7 + pw.field_G.field_Ab.field_L + pw.field_G.field_Ab.field_mb;
                  pw.field_G.field_Ab.field_mb = pw.field_G.field_Ab.field_mb - var8;
                  pw.field_G.field_Ab.field_J = pw.field_G.field_Ab.field_J + var8;
                  if (!wj.field_z) {
                    break L2;
                  } else {
                    pw.field_G.field_Ab.field_mb = var7;
                    break L2;
                  }
                }
                if (param2 == 26) {
                  L3: {
                    pw.field_G.field_Ab.field_L = var7 - pw.field_G.field_Ab.field_mb;
                    if (wj.field_z) {
                      dg.field_a = true;
                      pw.field_G.field_Ab.field_J = -pw.field_G.field_Ab.field_mb + pw.field_G.field_zb.field_mb;
                      wj.field_z = false;
                      pw.field_G.field_Ab.field_v = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!vg.field_Wb) {
                      break L4;
                    } else {
                      if (mu.field_Y == null) {
                        break L4;
                      } else {
                        dg.field_a = true;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var9 = -pw.field_G.field_Ab.field_mb + (-pw.field_G.field_Ab.field_L + pw.field_G.field_zb.field_mb);
                    if (!dg.field_a) {
                      break L5;
                    } else {
                      pw.field_G.field_Ab.field_v = var9 - pw.field_G.field_Ab.field_J;
                      break L5;
                    }
                  }
                  L6: {
                    pw.field_G.a(param1, param0 * param1 * 2, true, param2 ^ 26);
                    if (pw.field_G.field_Ab.field_J - -pw.field_G.field_Ab.field_v != var9) {
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L6;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L6;
                    }
                  }
                  dg.field_a = stackIn_41_0 != 0;
                  return var4;
                } else {
                  return null;
                }
              } else {
                var9_ref_tv = fu.field_b[var8];
                if (null != var9_ref_tv.field_s) {
                  pw.field_G.field_Ab.a((byte) -105, var9_ref_tv.field_s);
                  var9_ref_tv.field_s.a(true, var9_ref_tv.field_s.g((byte) -44), param3, var7, param1);
                  var7 = var7 + param1;
                  if (-1 != (var9_ref_tv.field_s.field_sb ^ -1)) {
                    var4 = var9_ref_tv;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L7: {
              var8_ref_tv = fu.field_b[var7];
              var9 = 0;
              if (iw.field_l) {
                break L7;
              } else {
                if (var5 < at.field_Hb) {
                  var10_int = r.a(0, var8_ref_tv.field_c);
                  if (var10_int > var8_ref_tv.b(80)) {
                    break L7;
                  } else {
                    L8: {
                      if (var8_ref_tv.field_m) {
                        break L8;
                      } else {
                        if (!hi.a(param2 ^ 26, var8_ref_tv.field_q)) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var9 = 1;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
            }
            if (var9 != 0) {
              L9: {
                if (var8_ref_tv.field_s == null) {
                  break L9;
                } else {
                  if (wj.field_z) {
                    break L9;
                  } else {
                    var5++;
                    var7--;
                    continue L0;
                  }
                }
              }
              L10: {
                if (var8_ref_tv.field_s != null) {
                  break L10;
                } else {
                  break L10;
                }
              }
              var10 = ob.a((byte) -92, var8_ref_tv);
              var11 = var10 + hu.c(var8_ref_tv.field_g);
              var12 = qa.a(var8_ref_tv, 31100);
              var8_ref_tv.field_s = new hd(0L, vv.field_o, var11);
              var6 = var6 + param1;
              var8_ref_tv.field_s.field_X = nl.field_i;
              var8_ref_tv.field_s.field_ub = -(8355711 & var12 >> -810913951) + var12 - -(8355711 & vv.field_o.field_ub >> -1039946463);
              var8_ref_tv.field_s.field_ab = var12 - (((16711423 & var12) >> 1187469889) + -((vv.field_o.field_ab & 16711422) >> 966118849));
              var8_ref_tv.field_s.field_y = var12;
              var5++;
              var7--;
              continue L0;
            } else {
              var8_ref_tv.field_s = null;
              var7--;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0, String param1) {
        ek.field_M = param1;
        qd.b(38, 12);
        if (param0 != -51) {
            field_Ib = null;
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 26) {
            break L0;
          } else {
            ((rb) this).field_Lb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((rb) this).field_zb) {
              break L2;
            } else {
              if (!((rb) this).field_zb.field_I) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public static void c(boolean param0) {
        field_Ib = null;
        field_Hb = null;
        if (!param0) {
            field_Mb = -83;
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        om stackIn_5_0 = null;
        om stackIn_6_0 = null;
        om stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        hd stackIn_13_0 = null;
        hd stackIn_14_0 = null;
        hd stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        om stackOut_4_0 = null;
        om stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        om stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        hd stackOut_12_0 = null;
        hd stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        hd stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var4 = Kickabout.field_G;
          ((rb) this).b(param1, param0);
          if (null == ((rb) this).field_Fb) {
            break L0;
          } else {
            L1: {
              ((rb) this).field_Fb.field_E = ((rb) this).field_Db.toString();
              ((rb) this).field_Fb.field_s = (((rb) this).field_q - ((rb) this).field_Fb.field_X.a(((rb) this).field_Fb.field_E)) / 2;
              if (null != ((rb) this).field_zb) {
                if (0 == ((rb) this).field_zb.field_sb) {
                  break L1;
                } else {
                  L2: {
                    stackOut_4_0 = ((rb) this).field_zb;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((rb) this).field_zb.field_I) {
                      stackOut_6_0 = (om) (Object) stackIn_6_0;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (om) (Object) stackIn_5_0;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  stackIn_7_0.field_I = stackIn_7_1 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            ((rb) this).field_Fb.field_q = -((rb) this).field_Fb.field_s + ((rb) this).field_q;
            var3 = 0;
            L3: while (true) {
              if (var3 >= ob.field_B) {
                break L0;
              } else {
                if (((rb) this).field_Jb[var3] != null) {
                  L4: {
                    stackOut_12_0 = ((rb) this).field_Jb[var3];
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (((rb) this).field_Db.length() <= 0) {
                      stackOut_14_0 = (hd) (Object) stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = (hd) (Object) stackIn_13_0;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_lb = stackIn_15_1 != 0;
                  if (((rb) this).field_Jb[var3].field_lb) {
                    if (0 != ((rb) this).field_Jb[var3].field_sb) {
                      return var3;
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
          }
        }
        if (-1 == (((rb) this).field_Ab.field_sb ^ -1)) {
          L5: {
            if (!param0) {
              break L5;
            } else {
              if (0 == wj.field_A) {
                break L5;
              } else {
                if (((rb) this).field_sb != 0) {
                  break L5;
                } else {
                  return -1;
                }
              }
            }
          }
          return ((rb) this).field_Ob;
        } else {
          return -1;
        }
    }

    final String a(int param0) {
        if (param0 != -15596) {
            ((rb) this).field_Ob = -119;
        }
        return ((rb) this).field_Db.toString();
    }

    private final int a(int param0, String param1, int param2, hd param3, hd param4, byte param5) {
        hd var7 = new hd(0L, param3, 0, param0, param2, 24, param1);
        param0 += 32;
        param4.a((byte) -106, var7);
        if (param5 < 4) {
            boolean discarded$0 = ((rb) this).b(-117);
        }
        return param0;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != -46) {
            return true;
        }
        return (param1 ^ -1) == -7 ? true : false;
    }

    rb(int param0, int param1, int param2, int param3, int param4, hd param5, hd param6, hd param7, hd param8, om param9, hd param10, String param11, long param12) {
        super(0L, param5);
        int var15 = 0;
        hd[] var15_ref_hd__ = null;
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
        hd[] var28 = null;
        Object stackIn_4_0 = null;
        om stackIn_4_1 = null;
        om stackIn_4_2 = null;
        long stackIn_4_3 = 0L;
        om stackIn_4_4 = null;
        Object stackIn_5_0 = null;
        om stackIn_5_1 = null;
        om stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        om stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        om stackIn_6_1 = null;
        om stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        om stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        om stackIn_7_1 = null;
        om stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        om stackIn_7_4 = null;
        String stackIn_7_5 = null;
        hd stackIn_13_0 = null;
        hd stackIn_14_0 = null;
        hd stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_3_0 = null;
        om stackOut_3_1 = null;
        om stackOut_3_2 = null;
        long stackOut_3_3 = 0L;
        om stackOut_3_4 = null;
        Object stackOut_4_0 = null;
        om stackOut_4_1 = null;
        om stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        om stackOut_4_4 = null;
        Object stackOut_6_0 = null;
        om stackOut_6_1 = null;
        om stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        om stackOut_6_4 = null;
        String stackOut_6_5 = null;
        Object stackOut_5_0 = null;
        om stackOut_5_1 = null;
        om stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        om stackOut_5_4 = null;
        String stackOut_5_5 = null;
        hd stackOut_12_0 = null;
        hd stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        hd stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          ((rb) this).field_Ob = -2;
          ((rb) this).field_Eb = param12;
          ((rb) this).field_Gb = new hd(0L, param6, fi.field_c.toUpperCase());
          ((rb) this).field_Gb.field_A = 1;
          ((rb) this).a((byte) -110, ((rb) this).field_Gb);
          ((rb) this).field_Ab = new hd(0L, param7);
          ((rb) this).field_Gb.a((byte) -116, ((rb) this).field_Ab);
          ((rb) this).field_Nb = new hd(0L, (hd) null);
          ((rb) this).a((byte) -111, ((rb) this).field_Nb);
          if (param11 == null) {
            ((rb) this).field_Cb = new hd(0L, param8, sl.field_Bb);
            ((rb) this).field_Cb.field_y = 11184810;
            ((rb) this).field_Cb.field_A = 1;
            ((rb) this).field_Nb.a((byte) -110, ((rb) this).field_Cb);
            var15 = 226;
            var16 = 10;
            var17 = ((rb) this).field_Cb.field_X.b(((rb) this).field_Cb.field_E, var15);
            ((rb) this).field_Cb.a(true, var15, 13, var16, var17 * sh.field_c);
            var16 = var16 + var17 * sh.field_c;
            ((rb) this).field_Nb.a(true, 13 - -var15 - -13, 0, 24, var16 + 10);
            ((rb) this).field_Nb.field_R = fs.a(((rb) this).field_Nb.field_mb, 3, 2105376, 11579568, 8421504, (byte) 96);
            var18 = var15 + 13 - -13;
            var19 = var16 + 34;
            var20 = ou.b(var18, param0, param2, 127);
            var21 = nj.a(param1, param3, var19, 29079);
            ((rb) this).a(true, var18, var20, var21, var19);
            break L0;
          } else {
            L1: {
              L2: {
                ((rb) this).field_Cb = new hd(0L, param8, cf.field_Ib);
                ((rb) this).field_Cb.field_A = 1;
                ((rb) this).field_Cb.field_y = 11184810;
                ((rb) this).field_Nb.a((byte) -110, ((rb) this).field_Cb);
                ((rb) this).field_Lb = new hd(0L, param8, nc.field_d);
                ((rb) this).field_Lb.field_y = 11184810;
                ((rb) this).field_Lb.field_A = 1;
                ((rb) this).field_Nb.a((byte) -116, ((rb) this).field_Lb);
                ((rb) this).field_Fb = new hd(0L, param8);
                ((rb) this).field_Fb.field_y = 16764006;
                ((rb) this).field_Nb.a((byte) -105, ((rb) this).field_Fb);
                ((rb) this).field_Fb.field_V = "|";
                if (bl.field_c >= 5) {
                  break L2;
                } else {
                  if (tk.field_Ib > -3) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_3_0 = this;
                  stackOut_3_1 = null;
                  stackOut_3_2 = null;
                  stackOut_3_3 = 0L;
                  stackOut_3_4 = (om) param9;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_5_3 = stackOut_3_3;
                  stackIn_5_4 = stackOut_3_4;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  if (-8 <= bl.field_c) {
                    break L4;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = stackIn_4_3;
                    stackOut_4_4 = (om) (Object) stackIn_4_4;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    stackIn_6_3 = stackOut_4_3;
                    stackIn_6_4 = stackOut_4_4;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    stackIn_5_4 = stackOut_4_4;
                    if (2 > tk.field_Ib) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (om) (Object) stackIn_6_4;
                      stackOut_6_5 = vv.field_s;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      stackIn_7_5 = stackOut_6_5;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_5_0 = this;
                stackOut_5_1 = null;
                stackOut_5_2 = null;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = (om) (Object) stackIn_5_4;
                stackOut_5_5 = mc.field_h;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                break L3;
              }
              new om(stackIn_7_3, stackIn_7_4, stackIn_7_5);
              ((rb) this).field_zb = stackIn_7_1;
              ((rb) this).field_Nb.a((byte) -118, (hd) (Object) ((rb) this).field_zb);
              break L1;
            }
            var28 = new hd[3];
            var15_ref_hd__ = var28;
            var28[0] = new hd(0L, (hd) null);
            ((rb) this).field_Nb.a((byte) -105, var28[0]);
            var28[1] = new hd(0L, (hd) null);
            ((rb) this).field_Nb.a((byte) -111, var28[1]);
            var28[2] = new hd(0L, (hd) null);
            ((rb) this).field_Nb.a((byte) -127, var28[2]);
            ((rb) this).field_Jb = new hd[ob.field_B];
            var16 = 0;
            L5: while (true) {
              if (ob.field_B <= var16) {
                L6: {
                  ((rb) this).field_Db = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((rb) this).field_Db.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_X.a(ce.field_F);
                  if (var16 >= var17) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_X.a(cj.field_H);
                  if (var17 <= var16) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_X.a(tk.field_Hb);
                  if (var17 <= var16) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (var17 >= ob.field_B) {
                    L11: {
                      if ((var16 ^ -1) >= -141) {
                        break L11;
                      } else {
                        var16 = 140;
                        break L11;
                      }
                    }
                    L12: {
                      var17 = 0;
                      var18 = 0;
                      var18 = 0;
                      var18 = this.a(var18, ce.field_F, var16, param6, var28[0], (byte) 9);
                      var18 = this.a(-6305, ((rb) this).field_Jb[6], var16, var18, var28[0]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[9], var16, var18, var28[0]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[5], var16, var18, var28[0]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[7], var16, var18, var28[0]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[15], var16, var18, var28[0]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[4], var16, var18, var28[0]);
                      if (var17 >= var18) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(var18, cj.field_H, var16, param6, var28[1], (byte) 119);
                      var18 = this.a(-6305, ((rb) this).field_Jb[16], var16, var18, var28[1]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[17], var16, var18, var28[1]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[18], var16, var18, var28[1]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[19], var16, var18, var28[1]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[20], var16, var18, var28[1]);
                      if (var17 >= var18) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(var18, tk.field_Hb, var16, param6, var28[2], (byte) 127);
                      var18 = this.a(-6305, ((rb) this).field_Jb[13], var16, var18, var28[2]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[21], var16, var18, var28[2]);
                      var18 = this.a(-6305, ((rb) this).field_Jb[11], var16, var18, var28[2]);
                      if (var18 <= var17) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 26 + var16 * 3;
                      var20 = ((rb) this).field_Gb.g((byte) 108);
                      if (var19 >= var20) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (null == ((rb) this).field_zb) {
                        break L16;
                      } else {
                        var20 = ((rb) this).field_zb.b(0, 4);
                        if (var20 <= var19) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((rb) this).field_Gb.a(true, var19 + 13 + 13, 0, 0, 24);
                      ((rb) this).field_Ab.a(true, 15, -20 + ((rb) this).field_Gb.field_q, 5, 15);
                      var21 = 10;
                      ((rb) this).field_Cb.a(true, var19, 13, var21, 2 * sh.field_c);
                      var21 = var21 + sh.field_c * 2;
                      ((rb) this).field_Lb.a(true, var19, 13, var21, 2 * sh.field_c);
                      var21 = var21 + (10 + 2 * sh.field_c);
                      ((rb) this).field_Fb.a(true, 0, 0, var21, sh.field_c);
                      var21 = var21 + (10 + sh.field_c);
                      if (null == ((rb) this).field_zb) {
                        break L17;
                      } else {
                        var20 = ((rb) this).field_zb.b(0, 4);
                        ((rb) this).field_zb.a(4, var21, sh.field_c, var20, 13 - -((var19 + -var20) / 2), -10481);
                        var21 = var21 + (10 + sh.field_c);
                        break L17;
                      }
                    }
                    var28[0].a(true, var16, 13, var21, var17);
                    var28[1].a(true, var16, var16 + 13 - -13, var21, var17);
                    var28[2].a(true, var16, 26 + (13 - -(var16 * 2)), var21, var17);
                    var22 = var21;
                    ((rb) this).field_Nb.a(true, 13 + (13 + var19), 0, 24, 10 + var22 + var17);
                    ((rb) this).field_Nb.field_R = fs.a(((rb) this).field_Nb.field_mb, 3, 2105376, 11579568, 8421504, (byte) 127);
                    var23 = var19 + 13 + 13;
                    var24 = 10 + (var17 + 24) + var22;
                    var25 = ou.b(var23, param0, param2, 127);
                    var26 = nj.a(param1, param3, var24, 29079);
                    ((rb) this).a(true, var23, var25, var26, var24);
                    break L0;
                  } else {
                    if (((rb) this).field_Jb[var17] != null) {
                      var18 = ((rb) this).field_Jb[var17].g((byte) -40);
                      if (var18 > var16) {
                        var16 = var18;
                        var17++;
                        continue L10;
                      } else {
                        var17++;
                        continue L10;
                      }
                    } else {
                      var17++;
                      continue L10;
                    }
                  }
                }
              } else {
                if (null != bh.field_i[var16]) {
                  L18: {
                    ((rb) this).field_Jb[var16] = new hd(0L, param10, bh.field_i[var16]);
                    ((rb) this).field_Jb[var16].field_A = 0;
                    stackOut_12_0 = ((rb) this).field_Jb[var16];
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (param11 == null) {
                      stackOut_14_0 = (hd) (Object) stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L18;
                    } else {
                      stackOut_13_0 = (hd) (Object) stackIn_13_0;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L18;
                    }
                  }
                  stackIn_15_0.field_lb = stackIn_15_1 != 0;
                  ((rb) this).field_Nb.a((byte) -124, ((rb) this).field_Jb[var16]);
                  var16++;
                  continue L5;
                } else {
                  var16++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    private final int a(int param0, hd param1, int param2, int param3, hd param4) {
        param3 += 8;
        if (param0 != -6305) {
            ((rb) this).field_Db = null;
        }
        int var6 = param1.field_X.c(param1.field_E, -(2 * param1.field_kb) + param2, param1.field_xb);
        param1.a(true, param2, 0, param3, var6);
        param3 = param3 + (0 + var6);
        param4.a((byte) -120, param1);
        return param3;
    }

    final boolean h(byte param0) {
        if (1 != (((rb) this).field_Ob ^ -1)) {
            return false;
        }
        if (!((cc.field_e ^ -1) != -14)) {
            ((rb) this).field_Ob = -1;
        }
        if (param0 != 37) {
            ((rb) this).field_Cb = null;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = 20;
        field_Hb = "Spectate";
        field_Kb = 33;
        field_Ib = "null";
        field_Mb = 4;
    }
}
