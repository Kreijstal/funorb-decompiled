/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pc extends ci {
    private ci field_Eb;
    long field_Lb;
    private ci field_Fb;
    private ci field_Hb;
    private ci field_Ib;
    private int field_Gb;
    private ci[] field_Jb;
    private ci field_Nb;
    private ci field_Ob;
    static String field_Qb;
    private he field_Kb;
    private StringBuilder field_Pb;
    static String field_Mb;

    private final int a(ci param0, int param1, int param2, byte param3, ci param4) {
        param1 += 8;
        if (param3 != -42) {
            String discarded$0 = ((pc) this).a(false);
        }
        int var6 = param4.field_xb.b(param4.field_db, -(param4.field_z * 2) + param2, param4.field_K);
        param4.a(0, param2, -2147483648, var6, param1);
        param0.a((byte) 127, param4);
        param1 = param1 + (0 + var6);
        return param1;
    }

    pc(int param0, int param1, int param2, int param3, int param4, ci param5, ci param6, ci param7, ci param8, he param9, ci param10, String param11, long param12) {
        super(0L, param5);
        int var15 = 0;
        ci[] var15_ref_ci__ = null;
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
        ci[] var28 = null;
        Object stackIn_4_0 = null;
        he stackIn_4_1 = null;
        he stackIn_4_2 = null;
        long stackIn_4_3 = 0L;
        he stackIn_4_4 = null;
        Object stackIn_5_0 = null;
        he stackIn_5_1 = null;
        he stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        he stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        he stackIn_6_1 = null;
        he stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        he stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        he stackIn_7_1 = null;
        he stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        he stackIn_7_4 = null;
        String stackIn_7_5 = null;
        Object stackIn_11_0 = null;
        String stackIn_11_1 = null;
        ci stackIn_13_0 = null;
        ci stackIn_14_0 = null;
        ci stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_18_0 = null;
        String stackIn_18_1 = null;
        Object stackOut_3_0 = null;
        he stackOut_3_1 = null;
        he stackOut_3_2 = null;
        long stackOut_3_3 = 0L;
        he stackOut_3_4 = null;
        Object stackOut_4_0 = null;
        he stackOut_4_1 = null;
        he stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        he stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        he stackOut_5_1 = null;
        he stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        he stackOut_5_4 = null;
        String stackOut_5_5 = null;
        Object stackOut_6_0 = null;
        he stackOut_6_1 = null;
        he stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        he stackOut_6_4 = null;
        String stackOut_6_5 = null;
        Object stackOut_10_0 = null;
        String stackOut_10_1 = null;
        ci stackOut_12_0 = null;
        ci stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ci stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_17_0 = null;
        String stackOut_17_1 = null;
        L0: {
          L1: {
            var27 = Chess.field_G;
            ((pc) this).field_Gb = -2;
            ((pc) this).field_Lb = param12;
            ((pc) this).field_Nb = new ci(0L, param6, se.field_W.toUpperCase());
            ((pc) this).field_Nb.field_fb = 1;
            ((pc) this).a((byte) 125, ((pc) this).field_Nb);
            ((pc) this).field_Fb = new ci(0L, param7);
            ((pc) this).field_Nb.a((byte) 126, ((pc) this).field_Fb);
            ((pc) this).field_Eb = new ci(0L, (ci) null);
            ((pc) this).a((byte) 125, ((pc) this).field_Eb);
            if (param11 == null) {
              break L1;
            } else {
              L2: {
                L3: {
                  ((pc) this).field_Hb = new ci(0L, param8, af.field_a);
                  ((pc) this).field_Hb.field_ib = 11184810;
                  ((pc) this).field_Hb.field_fb = 1;
                  ((pc) this).field_Eb.a((byte) 127, ((pc) this).field_Hb);
                  ((pc) this).field_Ob = new ci(0L, param8, td.field_m);
                  ((pc) this).field_Ob.field_fb = 1;
                  ((pc) this).field_Ob.field_ib = 11184810;
                  ((pc) this).field_Eb.a((byte) 124, ((pc) this).field_Ob);
                  ((pc) this).field_Ib = new ci(0L, param8);
                  ((pc) this).field_Ib.field_ib = 16764006;
                  ((pc) this).field_Eb.a((byte) 125, ((pc) this).field_Ib);
                  ((pc) this).field_Ib.field_S = "|";
                  if (5 <= sb.field_rb) {
                    break L3;
                  } else {
                    if (sk.field_t < 2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    stackOut_3_0 = this;
                    stackOut_3_1 = null;
                    stackOut_3_2 = null;
                    stackOut_3_3 = 0L;
                    stackOut_3_4 = (he) param9;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_6_1 = stackOut_3_1;
                    stackIn_6_2 = stackOut_3_2;
                    stackIn_6_3 = stackOut_3_3;
                    stackIn_6_4 = stackOut_3_4;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    stackIn_4_2 = stackOut_3_2;
                    stackIn_4_3 = stackOut_3_3;
                    stackIn_4_4 = stackOut_3_4;
                    if (sb.field_rb >= 7) {
                      break L5;
                    } else {
                      stackOut_4_0 = this;
                      stackOut_4_1 = null;
                      stackOut_4_2 = null;
                      stackOut_4_3 = stackIn_4_3;
                      stackOut_4_4 = (he) (Object) stackIn_4_4;
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
                      if ((sk.field_t ^ -1) <= -3) {
                        break L5;
                      } else {
                        stackOut_5_0 = this;
                        stackOut_5_1 = null;
                        stackOut_5_2 = null;
                        stackOut_5_3 = stackIn_5_3;
                        stackOut_5_4 = (he) (Object) stackIn_5_4;
                        stackOut_5_5 = jd.field_a;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        stackIn_7_3 = stackOut_5_3;
                        stackIn_7_4 = stackOut_5_4;
                        stackIn_7_5 = stackOut_5_5;
                        break L4;
                      }
                    }
                  }
                  stackOut_6_0 = this;
                  stackOut_6_1 = null;
                  stackOut_6_2 = null;
                  stackOut_6_3 = stackIn_6_3;
                  stackOut_6_4 = (he) (Object) stackIn_6_4;
                  stackOut_6_5 = h.field_m;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  stackIn_7_3 = stackOut_6_3;
                  stackIn_7_4 = stackOut_6_4;
                  stackIn_7_5 = stackOut_6_5;
                  break L4;
                }
                ((pc) this).field_Kb = new he(stackIn_7_3, stackIn_7_4, stackIn_7_5);
                ((pc) this).field_Eb.a((byte) 127, (ci) (Object) ((pc) this).field_Kb);
                break L2;
              }
              var28 = new ci[3];
              var15_ref_ci__ = var28;
              var28[0] = new ci(0L, (ci) null);
              ((pc) this).field_Eb.a((byte) 126, var28[0]);
              var28[1] = new ci(0L, (ci) null);
              ((pc) this).field_Eb.a((byte) 126, var28[1]);
              var28[2] = new ci(0L, (ci) null);
              ((pc) this).field_Eb.a((byte) 124, var28[2]);
              ((pc) this).field_Jb = new ci[re.field_j];
              var16 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (var16 >= re.field_j) {
                      break L8;
                    } else {
                      stackOut_10_0 = null;
                      stackOut_10_1 = mi.field_t[var16];
                      stackIn_18_0 = stackOut_10_0;
                      stackIn_18_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (var27 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (stackIn_11_0 == (Object) (Object) stackIn_11_1) {
                            break L9;
                          } else {
                            L10: {
                              ((pc) this).field_Jb[var16] = new ci(0L, param10, mi.field_t[var16]);
                              ((pc) this).field_Jb[var16].field_fb = 0;
                              stackOut_12_0 = ((pc) this).field_Jb[var16];
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_13_0 = stackOut_12_0;
                              if (param11 == null) {
                                stackOut_14_0 = (ci) (Object) stackIn_14_0;
                                stackOut_14_1 = 0;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                break L10;
                              } else {
                                stackOut_13_0 = (ci) (Object) stackIn_13_0;
                                stackOut_13_1 = 1;
                                stackIn_15_0 = stackOut_13_0;
                                stackIn_15_1 = stackOut_13_1;
                                break L10;
                              }
                            }
                            stackIn_15_0.field_tb = stackIn_15_1 != 0;
                            ((pc) this).field_Eb.a((byte) 125, ((pc) this).field_Jb[var16]);
                            break L9;
                          }
                        }
                        var16++;
                        if (var27 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  ((pc) this).field_Pb = new StringBuilder(12);
                  stackOut_17_0 = null;
                  stackOut_17_1 = (String) param11;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L7;
                }
                L11: {
                  if (stackIn_18_0 == (Object) (Object) stackIn_18_1) {
                    break L11;
                  } else {
                    StringBuilder discarded$1 = ((pc) this).field_Pb.append(param11);
                    break L11;
                  }
                }
                L12: {
                  var16 = 0;
                  var17 = param6.field_xb.b(cl.field_h);
                  if (var16 >= var17) {
                    break L12;
                  } else {
                    var16 = var17;
                    break L12;
                  }
                }
                L13: {
                  var17 = param6.field_xb.b(nb.field_Gb);
                  if (var16 >= var17) {
                    break L13;
                  } else {
                    var16 = var17;
                    break L13;
                  }
                }
                L14: {
                  var17 = param6.field_xb.b(qh.field_d);
                  if (var16 >= var17) {
                    break L14;
                  } else {
                    var16 = var17;
                    break L14;
                  }
                }
                var17 = 0;
                L15: while (true) {
                  L16: {
                    L17: {
                      if (var17 >= re.field_j) {
                        break L17;
                      } else {
                        if (var27 != 0) {
                          break L16;
                        } else {
                          L18: {
                            if (((pc) this).field_Jb[var17] == null) {
                              break L18;
                            } else {
                              var18 = ((pc) this).field_Jb[var17].e((byte) -88);
                              if (var18 <= var16) {
                                break L18;
                              } else {
                                var16 = var18;
                                break L18;
                              }
                            }
                          }
                          var17++;
                          if (var27 == 0) {
                            continue L15;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    L19: {
                      if (var16 <= 140) {
                        break L19;
                      } else {
                        var16 = 140;
                        break L19;
                      }
                    }
                    var17 = 0;
                    break L16;
                  }
                  L20: {
                    var18 = 0;
                    var18 = 0;
                    var18 = this.a(cl.field_h, (byte) 108, param6, var18, var16, var28[0]);
                    var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[6]);
                    var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[9]);
                    var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[5]);
                    var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[7]);
                    var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[15]);
                    var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[4]);
                    if (var17 >= var18) {
                      break L20;
                    } else {
                      var17 = var18;
                      break L20;
                    }
                  }
                  L21: {
                    var18 = 0;
                    var18 = this.a(nb.field_Gb, (byte) 108, param6, var18, var16, var28[1]);
                    var18 = this.a(var28[1], var18, var16, (byte) -42, ((pc) this).field_Jb[16]);
                    var18 = this.a(var28[1], var18, var16, (byte) -42, ((pc) this).field_Jb[17]);
                    var18 = this.a(var28[1], var18, var16, (byte) -42, ((pc) this).field_Jb[18]);
                    var18 = this.a(var28[1], var18, var16, (byte) -42, ((pc) this).field_Jb[19]);
                    var18 = this.a(var28[1], var18, var16, (byte) -42, ((pc) this).field_Jb[20]);
                    if (var18 <= var17) {
                      break L21;
                    } else {
                      var17 = var18;
                      break L21;
                    }
                  }
                  L22: {
                    var18 = 0;
                    var18 = this.a(qh.field_d, (byte) 108, param6, var18, var16, var28[2]);
                    var18 = this.a(var28[2], var18, var16, (byte) -42, ((pc) this).field_Jb[13]);
                    var18 = this.a(var28[2], var18, var16, (byte) -42, ((pc) this).field_Jb[21]);
                    var18 = this.a(var28[2], var18, var16, (byte) -42, ((pc) this).field_Jb[11]);
                    if (var17 >= var18) {
                      break L22;
                    } else {
                      var17 = var18;
                      break L22;
                    }
                  }
                  L23: {
                    var19 = 26 + 3 * var16;
                    var20 = ((pc) this).field_Nb.e((byte) 122);
                    if (var20 <= var19) {
                      break L23;
                    } else {
                      var19 = var20;
                      break L23;
                    }
                  }
                  L24: {
                    if (null == ((pc) this).field_Kb) {
                      break L24;
                    } else {
                      var20 = ((pc) this).field_Kb.a((byte) 119, 4);
                      if (var20 <= var19) {
                        break L24;
                      } else {
                        var19 = var20;
                        break L24;
                      }
                    }
                  }
                  L25: {
                    ((pc) this).field_Nb.a(0, 13 + (var19 - -13), -2147483648, 24, 0);
                    ((pc) this).field_Fb.a(-20 + ((pc) this).field_Nb.field_M, 15, -2147483648, 15, 5);
                    var21 = 10;
                    ((pc) this).field_Hb.a(13, var19, -2147483648, fe.field_g * 2, var21);
                    var21 = var21 + 2 * fe.field_g;
                    ((pc) this).field_Ob.a(13, var19, -2147483648, fe.field_g * 2, var21);
                    var21 = var21 + (fe.field_g * 2 - -10);
                    ((pc) this).field_Ib.a(0, 0, -2147483648, fe.field_g, var21);
                    var21 = var21 + (10 + fe.field_g);
                    if (((pc) this).field_Kb == null) {
                      break L25;
                    } else {
                      var20 = ((pc) this).field_Kb.a((byte) 123, 4);
                      ((pc) this).field_Kb.a(fe.field_g, 13 - -((-var20 + var19) / 2), (byte) 127, 4, var20, var21);
                      var21 = var21 + (fe.field_g + 10);
                      break L25;
                    }
                  }
                  var28[0].a(13, var16, -2147483648, var17, var21);
                  var28[1].a(26 + var16, var16, -2147483648, var17, var21);
                  var28[2].a(26 + 2 * var16 + 13, var16, -2147483648, var17, var21);
                  var22 = var21;
                  ((pc) this).field_Eb.a(0, 13 + var19 + 13, -2147483648, var22 - (-var17 - 10), 24);
                  ((pc) this).field_Eb.field_Ab = wh.a(-116, ((pc) this).field_Eb.field_pb, 3, 11579568, 8421504, 2105376);
                  var23 = var19 + 13 - -13;
                  var24 = 24 + var22 + (var17 + 10);
                  var25 = ao.a(var23, true, param0, param2);
                  var26 = sg.a(param1, var24, param3, 0);
                  ((pc) this).a(var25, var23, -2147483648, var24, var26);
                  if (var27 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          ((pc) this).field_Hb = new ci(0L, param8, rf.field_c);
          ((pc) this).field_Hb.field_ib = 11184810;
          ((pc) this).field_Hb.field_fb = 1;
          ((pc) this).field_Eb.a((byte) 125, ((pc) this).field_Hb);
          var15 = 226;
          var16 = 10;
          var17 = ((pc) this).field_Hb.field_xb.b(((pc) this).field_Hb.field_db, var15);
          ((pc) this).field_Hb.a(13, var15, -2147483648, fe.field_g * var17, var16);
          var16 = var16 + fe.field_g * var17;
          ((pc) this).field_Eb.a(0, 13 + var15 + 13, -2147483648, var16 + 10, 24);
          ((pc) this).field_Eb.field_Ab = wh.a(93, ((pc) this).field_Eb.field_pb, 3, 11579568, 8421504, 2105376);
          var18 = 26 + var15;
          var19 = var16 + 34;
          var20 = ao.a(var18, true, param0, param2);
          var21 = sg.a(param1, var19, param3, 0);
          ((pc) this).a(var20, var18, -2147483648, var19, var21);
          break L0;
        }
    }

    final String a(boolean param0) {
        if (!param0) {
            ((pc) this).field_Pb = null;
        }
        return ((pc) this).field_Pb.toString();
    }

    private final int a(String param0, byte param1, ci param2, int param3, int param4, ci param5) {
        ci var7 = new ci(0L, param2, 0, param3, param4, 24, param0);
        if (param1 != 108) {
            field_Qb = null;
        }
        param5.a((byte) 126, var7);
        param3 += 32;
        return param3;
    }

    final int b(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        he stackIn_5_0 = null;
        he stackIn_6_0 = null;
        he stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ci stackIn_15_0 = null;
        ci stackIn_16_0 = null;
        ci stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        he stackOut_4_0 = null;
        he stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        he stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ci stackOut_14_0 = null;
        ci stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ci stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var4 = Chess.field_G;
          ((pc) this).a(param0, (byte) 88);
          if (((pc) this).field_Ib != null) {
            L1: {
              ((pc) this).field_Ib.field_db = ((pc) this).field_Pb.toString();
              ((pc) this).field_Ib.field_mb = (((pc) this).field_M + -((pc) this).field_Ib.field_xb.b(((pc) this).field_Ib.field_db)) / 2;
              ((pc) this).field_Ib.field_M = -((pc) this).field_Ib.field_mb + ((pc) this).field_M;
              if (((pc) this).field_Kb == null) {
                break L1;
              } else {
                if (-1 == (((pc) this).field_Kb.field_L ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    stackOut_4_0 = ((pc) this).field_Kb;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((pc) this).field_Kb.field_gb) {
                      stackOut_6_0 = (he) (Object) stackIn_6_0;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (he) (Object) stackIn_5_0;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  stackIn_7_0.field_gb = stackIn_7_1 != 0;
                  break L1;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (var3 >= re.field_j) {
                break L0;
              } else {
                if (var4 == 0) {
                  L4: {
                    if (null != ((pc) this).field_Jb[var3]) {
                      L5: {
                        stackOut_14_0 = ((pc) this).field_Jb[var3];
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (((pc) this).field_Pb.length() <= 0) {
                          stackOut_16_0 = (ci) (Object) stackIn_16_0;
                          stackOut_16_1 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          break L5;
                        } else {
                          stackOut_15_0 = (ci) (Object) stackIn_15_0;
                          stackOut_15_1 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          break L5;
                        }
                      }
                      stackIn_17_0.field_tb = stackIn_17_1 != 0;
                      if (!((pc) this).field_Jb[var3].field_tb) {
                        break L4;
                      } else {
                        if (-1 == (((pc) this).field_Jb[var3].field_L ^ -1)) {
                          break L4;
                        } else {
                          return var3;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  var3++;
                  continue L3;
                } else {
                  return -1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (((pc) this).field_Fb.field_L != 0) {
          return -1;
        } else {
          if (param0) {
            if (0 != th.field_d) {
              if (-1 == (((pc) this).field_L ^ -1)) {
                return -1;
              } else {
                L6: {
                  if (param1 == -95) {
                    break L6;
                  } else {
                    ((pc) this).field_Ib = null;
                    break L6;
                  }
                }
                return ((pc) this).field_Gb;
              }
            } else {
              L7: {
                if (param1 == -95) {
                  break L7;
                } else {
                  ((pc) this).field_Ib = null;
                  break L7;
                }
              }
              return ((pc) this).field_Gb;
            }
          } else {
            L8: {
              if (param1 == -95) {
                break L8;
              } else {
                ((pc) this).field_Ib = null;
                break L8;
              }
            }
            return ((pc) this).field_Gb;
          }
        }
    }

    final boolean f(byte param0) {
        if ((((pc) this).field_Gb ^ -1) != 1) {
            return false;
        }
        if (param0 != 95) {
            ((pc) this).field_Nb = null;
        }
        if (-14 != (vg.field_a ^ -1)) {
            return true;
        }
        ((pc) this).field_Gb = -1;
        return true;
    }

    final boolean b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            pc.a(false, 126, false, false, 82);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((pc) this).field_Kb) {
              break L2;
            } else {
              if (!((pc) this).field_Kb.field_gb) {
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

    final static void a(boolean param0, int param1, boolean param2, boolean param3, int param4) {
        ci var5_ref_ci = null;
        int var5 = 0;
        ci var6 = null;
        ci var7 = null;
        ci var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        jc var17 = null;
        Object var18 = null;
        r var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        String var22 = null;
        int[] var24 = null;
        int[] var25 = null;
        String var26 = null;
        String var27 = null;
        int[] var28 = null;
        ci stackIn_16_0 = null;
        ci stackIn_17_0 = null;
        ci stackIn_18_0 = null;
        ci stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_103_0 = false;
        int stackIn_120_0 = 0;
        boolean stackIn_131_0 = false;
        boolean stackIn_149_0 = false;
        int stackIn_164_0 = 0;
        ci stackIn_180_0 = null;
        ci stackIn_181_0 = null;
        ci stackIn_182_0 = null;
        ci stackIn_183_0 = null;
        ci stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        ci stackIn_185_0 = null;
        ci stackIn_186_0 = null;
        ci stackIn_187_0 = null;
        ci stackIn_188_0 = null;
        ci stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        ci stackIn_190_0 = null;
        ci stackIn_191_0 = null;
        ci stackIn_192_0 = null;
        ci stackIn_193_0 = null;
        ci stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        ci stackOut_15_0 = null;
        ci stackOut_16_0 = null;
        ci stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ci stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_58_0 = 0;
        boolean stackOut_148_0 = false;
        boolean stackOut_102_0 = false;
        int stackOut_119_0 = 0;
        boolean stackOut_130_0 = false;
        int stackOut_163_0 = 0;
        ci stackOut_179_0 = null;
        ci stackOut_180_0 = null;
        ci stackOut_181_0 = null;
        ci stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        ci stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        ci stackOut_184_0 = null;
        ci stackOut_185_0 = null;
        ci stackOut_186_0 = null;
        ci stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        ci stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        ci stackOut_189_0 = null;
        ci stackOut_190_0 = null;
        ci stackOut_191_0 = null;
        ci stackOut_192_0 = null;
        int stackOut_192_1 = 0;
        ci stackOut_193_0 = null;
        int stackOut_193_1 = 0;
        L0: {
          var18 = null;
          var19 = Chess.field_G;
          f.a(ed.field_c, true);
          if (null == pd.field_Rb) {
            break L0;
          } else {
            L1: {
              L2: {
                sc.field_d.field_tb = true;
                uj.field_j.field_pb = 0;
                var5_ref_ci = uj.field_j;
                var5_ref_ci.field_M = 0;
                aa.field_g.field_pb = 0;
                var6 = aa.field_g;
                var6.field_M = 0;
                tn.field_j.field_pb = 0;
                var7 = tn.field_j;
                var7.field_M = 0;
                if (!ci.f(-12)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      sc.field_f.field_db = ge.field_cb.toUpperCase();
                      var9 = (2 + ri.field_k.field_M) / 2;
                      uj.field_j.a(0, var9 - 2, -2147483648, 40, -40 + ri.field_k.field_pb);
                      if (pd.field_Rb.field_Xb >= pd.field_Rb.field_hc) {
                        break L4;
                      } else {
                        uj.field_j.field_db = uh.field_v.toUpperCase();
                        uj.field_j.field_tb = true;
                        if (var19 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    uj.field_j.field_db = oj.field_b.toUpperCase();
                    uj.field_j.field_tb = false;
                    break L3;
                  }
                  L5: {
                    uj.field_j.field_Ab = nj.field_x.field_Ab;
                    if (cb.field_f > 0) {
                      L6: {
                        L7: {
                          if (1 != cb.field_f) {
                            break L7;
                          } else {
                            var10_ref_String = ob.field_A;
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var10_ref_String = oc.a(tg.field_b, new String[1], (byte) -119);
                        break L6;
                      }
                      uj.field_j.field_db = uj.field_j.field_db + "<br>" + var10_ref_String;
                      if ((16 & g.field_c) != 0) {
                        break L5;
                      } else {
                        if (!jh.field_a) {
                          uj.field_j.field_Ab = nj.field_x.field_Q;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  L8: {
                    L9: {
                      aa.field_g.a(var9, ri.field_k.field_M + -var9, -2147483648, 40, ri.field_k.field_pb + -40);
                      aa.field_g.field_db = fl.field_k.toUpperCase();
                      var8 = aa.field_g;
                      stackOut_15_0 = aa.field_g;
                      stackIn_18_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (!param2) {
                        break L9;
                      } else {
                        stackOut_16_0 = (ci) (Object) stackIn_16_0;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (0L != eg.field_e) {
                          break L9;
                        } else {
                          stackOut_17_0 = (ci) (Object) stackIn_17_0;
                          stackOut_17_1 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_19_1 = stackOut_17_1;
                          break L8;
                        }
                      }
                    }
                    stackOut_18_0 = (ci) (Object) stackIn_18_0;
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L8;
                  }
                  L10: {
                    stackIn_19_0.field_tb = stackIn_19_1 != 0;
                    var10 = 2;
                    if (null != hd.field_n) {
                      L11: {
                        if (null != d.field_Jb) {
                          break L11;
                        } else {
                          bi.field_d = new boolean[qa.field_e];
                          d.field_Jb = new byte[qa.field_e];
                          break L11;
                        }
                      }
                      var11_int = 0;
                      L12: while (true) {
                        L13: {
                          if (var11_int >= qa.field_e) {
                            var10 = 0;
                            break L13;
                          } else {
                            bi.field_d[var11_int] = false;
                            var11_int++;
                            if (var19 != 0) {
                              break L13;
                            } else {
                              continue L12;
                            }
                          }
                        }
                        L14: while (true) {
                          L15: {
                            L16: {
                              if (2 <= var10) {
                                break L16;
                              } else {
                                var11_int = 0;
                                stackOut_30_0 = 0;
                                stackIn_59_0 = stackOut_30_0;
                                stackIn_31_0 = stackOut_30_0;
                                if (var19 != 0) {
                                  break L15;
                                } else {
                                  var12 = stackIn_31_0;
                                  L17: while (true) {
                                    stackOut_32_0 = var12;
                                    stackOut_32_1 = hd.field_n.length;
                                    stackIn_33_0 = stackOut_32_0;
                                    stackIn_33_1 = stackOut_32_1;
                                    L18: while (true) {
                                      if (stackIn_33_0 >= stackIn_33_1) {
                                        if (var11_int != 0) {
                                          break L16;
                                        } else {
                                          var10++;
                                          continue L14;
                                        }
                                      } else {
                                        L19: {
                                          L20: {
                                            var28 = hd.field_n[var12];
                                            var25 = var28;
                                            var24 = var25;
                                            var21 = var24;
                                            var20 = var21;
                                            var13_array = var20;
                                            var14_int = 0;
                                            if (var28.length <= var14_int) {
                                              break L20;
                                            } else {
                                              L21: {
                                                L22: {
                                                  var15 = var28[var14_int];
                                                  var16 = var20[1 + var14_int];
                                                  if (var15 != -1) {
                                                    break L22;
                                                  } else {
                                                    L23: {
                                                      if (0 == var10) {
                                                        stackOut_38_0 = pd.field_Rb.field_hc;
                                                        stackIn_39_0 = stackOut_38_0;
                                                        break L23;
                                                      } else {
                                                        stackOut_37_0 = pd.field_Rb.field_Xb;
                                                        stackIn_39_0 = stackOut_37_0;
                                                        break L23;
                                                      }
                                                    }
                                                    L24: {
                                                      var17_int = stackIn_39_0;
                                                      if (var16 == var17_int) {
                                                        break L24;
                                                      } else {
                                                        if (var19 == 0) {
                                                          break L19;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    if (var19 == 0) {
                                                      break L21;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                if (var16 == (255 & pd.field_Rb.field_sc[var15])) {
                                                  break L21;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                              var14_int += 2;
                                              break L20;
                                            }
                                          }
                                          L25: {
                                            var11_int = 1;
                                            var14_int = -1;
                                            var15 = 0;
                                            if (var28.length <= var15) {
                                              break L25;
                                            } else {
                                              var16 = var28[var15];
                                              stackOut_48_0 = var14_int;
                                              stackOut_48_1 = var16;
                                              stackIn_33_0 = stackOut_48_0;
                                              stackIn_33_1 = stackOut_48_1;
                                              stackIn_49_0 = stackOut_48_0;
                                              stackIn_49_1 = stackOut_48_1;
                                              if (var19 != 0) {
                                                continue L18;
                                              } else {
                                                L26: {
                                                  if (stackIn_49_0 < stackIn_49_1) {
                                                    var14_int = var16;
                                                    break L26;
                                                  } else {
                                                    break L26;
                                                  }
                                                }
                                                var15 += 2;
                                                break L25;
                                              }
                                            }
                                          }
                                          bi.field_d[var14_int] = true;
                                          break L19;
                                        }
                                        var12++;
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_58_0 = -3;
                            stackIn_59_0 = stackOut_58_0;
                            break L15;
                          }
                          if (stackIn_59_0 < (sk.field_t ^ -1)) {
                            break L10;
                          } else {
                            if (ok.field_Jb[12]) {
                              var10 = 2;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  L27: {
                    L28: {
                      L29: {
                        L30: {
                          if ((var10 ^ -1) > -3) {
                            aa.field_g.field_tb = false;
                            if (aa.field_g.field_Db) {
                              var11 = null;
                              var12 = 0;
                              var13_int = 0;
                              L31: while (true) {
                                if (var13_int >= qa.field_e) {
                                  break L29;
                                } else {
                                  stackOut_148_0 = bi.field_d[var13_int];
                                  stackIn_164_0 = stackOut_148_0 ? 1 : 0;
                                  stackIn_149_0 = stackOut_148_0;
                                  if (var19 != 0) {
                                    break L28;
                                  } else {
                                    L32: {
                                      if (!stackIn_149_0) {
                                        break L32;
                                      } else {
                                        L33: {
                                          var26 = "<col=A00000>" + td.field_n[var13_int] + "</col>";
                                          if (var11 != null) {
                                            break L33;
                                          } else {
                                            var11 = (Object) (Object) var26;
                                            if (var19 == 0) {
                                              break L32;
                                            } else {
                                              break L33;
                                            }
                                          }
                                        }
                                        var12 = 1;
                                        var11 = (Object) (Object) (var11 + ", " + var26);
                                        break L32;
                                      }
                                    }
                                    var13_int++;
                                    if (var19 == 0) {
                                      continue L31;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L27;
                            }
                          } else {
                            L34: {
                              if (null != t.field_L) {
                                break L34;
                              } else {
                                if (uj.field_k != null) {
                                  break L34;
                                } else {
                                  if (il.field_b != null) {
                                    break L34;
                                  } else {
                                    if (nk.field_r == null) {
                                      break L27;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                              }
                            }
                            var11_int = 0;
                            var12 = 0;
                            var13_int = 0;
                            var14_int = 0;
                            var15 = 0;
                            var16 = 0;
                            L35: while (true) {
                              L36: {
                                L37: {
                                  if (var16 >= qa.field_e) {
                                    break L37;
                                  } else {
                                    var17_int = pd.field_Rb.field_sc[var16] & 255;
                                    if (var19 != 0) {
                                      break L36;
                                    } else {
                                      L38: {
                                        if (null == t.field_L) {
                                          break L38;
                                        } else {
                                          if (t.field_L[var16] == null) {
                                            break L38;
                                          } else {
                                            if (t.field_L[var16][var17_int]) {
                                              var11_int = 1;
                                              break L38;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                      L39: {
                                        if (null == uj.field_k) {
                                          break L39;
                                        } else {
                                          if (null != uj.field_k[var16]) {
                                            L40: {
                                              var18_int = uj.field_k[var16][var17_int];
                                              if (var18_int > var13_int) {
                                                var13_int = var18_int;
                                                break L40;
                                              } else {
                                                break L40;
                                              }
                                            }
                                            if (var18_int == 0) {
                                              break L39;
                                            } else {
                                              if (lf.field_U) {
                                                break L39;
                                              } else {
                                                var11_int = 1;
                                                break L39;
                                              }
                                            }
                                          } else {
                                            break L39;
                                          }
                                        }
                                      }
                                      L41: {
                                        if (il.field_b == null) {
                                          break L41;
                                        } else {
                                          if (il.field_b[var16] != null) {
                                            L42: {
                                              var18_int = il.field_b[var16][var17_int];
                                              if (var18_int > var14_int) {
                                                var14_int = var18_int;
                                                break L42;
                                              } else {
                                                break L42;
                                              }
                                            }
                                            if (var18_int == 0) {
                                              break L41;
                                            } else {
                                              if (lf.field_U) {
                                                break L41;
                                              } else {
                                                var11_int = 1;
                                                break L41;
                                              }
                                            }
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                      L43: {
                                        if (null == nk.field_r) {
                                          break L43;
                                        } else {
                                          if (nk.field_r[var16] != null) {
                                            var15 = var15 | nk.field_r[var16][var17_int];
                                            break L43;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                      var16++;
                                      if (var19 == 0) {
                                        continue L35;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                }
                                var16 = 0;
                                break L36;
                              }
                              L44: {
                                L45: {
                                  var17 = se.field_S.field_Kb.field_I;
                                  var18_ref = (r) (Object) var17.g(-18110);
                                  if (var18_ref == null) {
                                    break L45;
                                  } else {
                                    stackOut_102_0 = var18_ref.l(1);
                                    stackIn_120_0 = stackOut_102_0 ? 1 : 0;
                                    stackIn_103_0 = stackOut_102_0;
                                    if (var19 != 0) {
                                      break L44;
                                    } else {
                                      L46: {
                                        if (stackIn_103_0) {
                                          break L46;
                                        } else {
                                          L47: {
                                            if (var11_int == 0) {
                                              break L47;
                                            } else {
                                              if (!var18_ref.field_Hb) {
                                                var16 = 1;
                                                if (var19 == 0) {
                                                  break L45;
                                                } else {
                                                  break L47;
                                                }
                                              } else {
                                                break L47;
                                              }
                                            }
                                          }
                                          L48: {
                                            if (var13_int <= var18_ref.field_Pb) {
                                              break L48;
                                            } else {
                                              var16 = 1;
                                              break L48;
                                            }
                                          }
                                          L49: {
                                            if (var18_ref.field_Jb < var14_int) {
                                              var16 = 1;
                                              break L49;
                                            } else {
                                              break L49;
                                            }
                                          }
                                          L50: {
                                            if ((var15 & (var18_ref.field_Wb ^ -1) ^ -1) < -1) {
                                              var16 = 1;
                                              break L50;
                                            } else {
                                              break L50;
                                            }
                                          }
                                          if (var12 == 0) {
                                            break L46;
                                          } else {
                                            var16 = 1;
                                            break L46;
                                          }
                                        }
                                      }
                                      var18_ref = (r) (Object) var17.a((byte) -107);
                                      break L45;
                                    }
                                  }
                                }
                                stackOut_119_0 = -3;
                                stackIn_120_0 = stackOut_119_0;
                                break L44;
                              }
                              L51: {
                                if (stackIn_120_0 < (sk.field_t ^ -1)) {
                                  break L51;
                                } else {
                                  if (ok.field_Jb[12]) {
                                    var16 = 0;
                                    break L51;
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                              L52: {
                                if (var16 != 0) {
                                  break L52;
                                } else {
                                  if (var19 == 0) {
                                    break L27;
                                  } else {
                                    aa.field_g.field_tb = false;
                                    if (aa.field_g.field_Db) {
                                      var11 = null;
                                      var12 = 0;
                                      var13_int = 0;
                                      L53: while (true) {
                                        if (var13_int >= qa.field_e) {
                                          break L29;
                                        } else {
                                          stackOut_130_0 = bi.field_d[var13_int];
                                          stackIn_164_0 = stackOut_130_0 ? 1 : 0;
                                          stackIn_131_0 = stackOut_130_0;
                                          if (var19 != 0) {
                                            break L28;
                                          } else {
                                            L54: {
                                              if (!stackIn_131_0) {
                                                break L54;
                                              } else {
                                                L55: {
                                                  var22 = "<col=A00000>" + td.field_n[var13_int] + "</col>";
                                                  if (var11 != null) {
                                                    break L55;
                                                  } else {
                                                    var11 = (Object) (Object) var22;
                                                    if (var19 == 0) {
                                                      break L54;
                                                    } else {
                                                      break L55;
                                                    }
                                                  }
                                                }
                                                var12 = 1;
                                                var11 = (Object) (Object) (var11 + ", " + var22);
                                                break L54;
                                              }
                                            }
                                            var13_int++;
                                            if (var19 == 0) {
                                              continue L53;
                                            } else {
                                              break L52;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                              }
                              L56: {
                                aa.field_g.field_tb = false;
                                if (aa.field_g.field_Db) {
                                  L57: {
                                    if (-1 != (qa.field_f.field_a.field_Hb ^ -1)) {
                                      break L57;
                                    } else {
                                      field_Mb = gh.field_e;
                                      if (var19 == 0) {
                                        break L56;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                  field_Mb = oc.a(wm.field_j, new String[1], (byte) -119);
                                  break L56;
                                } else {
                                  break L56;
                                }
                              }
                              if (var19 == 0) {
                                break L27;
                              } else {
                                break L30;
                              }
                            }
                          }
                        }
                        aa.field_g.field_tb = false;
                        if (aa.field_g.field_Db) {
                          var11 = null;
                          var12 = 0;
                          var13_int = 0;
                          L58: while (true) {
                            if (var13_int >= qa.field_e) {
                              break L29;
                            } else {
                              L59: {
                                if (!bi.field_d[var13_int]) {
                                  break L59;
                                } else {
                                  L60: {
                                    var27 = "<col=A00000>" + td.field_n[var13_int] + "</col>";
                                    if (var11 != null) {
                                      break L60;
                                    } else {
                                      var11 = (Object) (Object) var27;
                                      if (var19 == 0) {
                                        break L59;
                                      } else {
                                        break L60;
                                      }
                                    }
                                  }
                                  var12 = 1;
                                  var11 = (Object) (Object) (var11 + ", " + var27);
                                  break L59;
                                }
                              }
                              var13_int++;
                              if (var19 == 0) {
                                continue L58;
                              } else {
                                break L29;
                              }
                            }
                          }
                        } else {
                          break L27;
                        }
                      }
                      stackOut_163_0 = -1;
                      stackIn_164_0 = stackOut_163_0;
                      break L28;
                    }
                    L61: {
                      if (stackIn_164_0 == (var10 ^ -1)) {
                        L62: {
                          var13 = ke.field_c;
                          if (var12 == 0) {
                            break L62;
                          } else {
                            var14 = ic.field_d + var11;
                            break L62;
                          }
                        }
                        var14 = oc.a(qb.field_d, new String[1], (byte) -88);
                        break L61;
                      } else {
                        L63: {
                          var13 = jb.field_c;
                          if (var12 != 0) {
                            break L63;
                          } else {
                            var14 = oc.a(ld.field_j, new String[1], (byte) -66);
                            break L63;
                          }
                        }
                        var14 = field_Qb + var11;
                        break L61;
                      }
                    }
                    field_Mb = "<col=A00000>" + var13 + "<br>" + var14;
                    break L27;
                  }
                  if (var19 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var9_ref_String = pd.field_Rb.field_Gb;
              sc.field_f.field_db = oc.a(fb.field_D, new String[1], (byte) -88).toUpperCase();
              tn.field_j.a(0, ri.field_k.field_M, -2147483648, 40, ri.field_k.field_pb + -40);
              tn.field_j.field_db = oc.a(kb.field_R, new String[1], (byte) -93);
              var8 = tn.field_j;
              break L1;
            }
            L64: {
              if ((eg.field_e ^ -1L) == -1L) {
                break L64;
              } else {
                L65: {
                  var9 = (int)(eg.field_e - ud.a(2));
                  var9 = (999 + var9) / 1000;
                  if ((var9 ^ -1) <= -2) {
                    break L65;
                  } else {
                    var9 = 1;
                    break L65;
                  }
                }
                var8.field_db = oc.a(pa.field_n, new String[1], (byte) -119);
                break L64;
              }
            }
            ec.field_j.field_db = oc.a(dk.field_a, new String[2], (byte) -44);
            break L0;
          }
        }
        L66: {
          L67: {
            stackOut_179_0 = fm.field_T;
            stackIn_183_0 = stackOut_179_0;
            stackIn_180_0 = stackOut_179_0;
            if (!param0) {
              break L67;
            } else {
              stackOut_180_0 = (ci) (Object) stackIn_180_0;
              stackIn_183_0 = stackOut_180_0;
              stackIn_181_0 = stackOut_180_0;
              if (param3) {
                break L67;
              } else {
                stackOut_181_0 = (ci) (Object) stackIn_181_0;
                stackIn_183_0 = stackOut_181_0;
                stackIn_182_0 = stackOut_181_0;
                if (jh.field_a) {
                  break L67;
                } else {
                  stackOut_182_0 = (ci) (Object) stackIn_182_0;
                  stackOut_182_1 = 1;
                  stackIn_184_0 = stackOut_182_0;
                  stackIn_184_1 = stackOut_182_1;
                  break L66;
                }
              }
            }
          }
          stackOut_183_0 = (ci) (Object) stackIn_183_0;
          stackOut_183_1 = 0;
          stackIn_184_0 = stackOut_183_0;
          stackIn_184_1 = stackOut_183_1;
          break L66;
        }
        L68: {
          L69: {
            ((ci) (Object) stackIn_184_0).a(stackIn_184_1 != 0, (byte) 88);
            stackOut_184_0 = ri.field_k;
            stackIn_188_0 = stackOut_184_0;
            stackIn_185_0 = stackOut_184_0;
            if (!param0) {
              break L69;
            } else {
              stackOut_185_0 = (ci) (Object) stackIn_185_0;
              stackIn_188_0 = stackOut_185_0;
              stackIn_186_0 = stackOut_185_0;
              if (param3) {
                break L69;
              } else {
                stackOut_186_0 = (ci) (Object) stackIn_186_0;
                stackIn_188_0 = stackOut_186_0;
                stackIn_187_0 = stackOut_186_0;
                if (jh.field_a) {
                  break L69;
                } else {
                  stackOut_187_0 = (ci) (Object) stackIn_187_0;
                  stackOut_187_1 = 1;
                  stackIn_189_0 = stackOut_187_0;
                  stackIn_189_1 = stackOut_187_1;
                  break L68;
                }
              }
            }
          }
          stackOut_188_0 = (ci) (Object) stackIn_188_0;
          stackOut_188_1 = 0;
          stackIn_189_0 = stackOut_188_0;
          stackIn_189_1 = stackOut_188_1;
          break L68;
        }
        L70: {
          L71: {
            ((ci) (Object) stackIn_189_0).a(stackIn_189_1 != 0, (byte) 88);
            stackOut_189_0 = ah.field_i;
            stackIn_193_0 = stackOut_189_0;
            stackIn_190_0 = stackOut_189_0;
            if (!param0) {
              break L71;
            } else {
              stackOut_190_0 = (ci) (Object) stackIn_190_0;
              stackIn_193_0 = stackOut_190_0;
              stackIn_191_0 = stackOut_190_0;
              if (param3) {
                break L71;
              } else {
                stackOut_191_0 = (ci) (Object) stackIn_191_0;
                stackIn_193_0 = stackOut_191_0;
                stackIn_192_0 = stackOut_191_0;
                if (!jh.field_a) {
                  break L71;
                } else {
                  stackOut_192_0 = (ci) (Object) stackIn_192_0;
                  stackOut_192_1 = 1;
                  stackIn_194_0 = stackOut_192_0;
                  stackIn_194_1 = stackOut_192_1;
                  break L70;
                }
              }
            }
          }
          stackOut_193_0 = (ci) (Object) stackIn_193_0;
          stackOut_193_1 = 0;
          stackIn_194_0 = stackOut_193_0;
          stackIn_194_1 = stackOut_193_1;
          break L70;
        }
        L72: {
          ((ci) (Object) stackIn_194_0).a(stackIn_194_1 != 0, (byte) 88);
          qa.field_f.field_a.f((byte) 109);
          var5 = -71 % ((-3 - param1) / 54);
          if (null != pd.field_Rb) {
            L73: {
              if (sc.field_d.field_L == 0) {
                break L73;
              } else {
                db.a(param4, pd.field_Rb.g((byte) -80), 28113);
                break L73;
              }
            }
            L74: {
              if (aa.field_g.field_L == 0) {
                break L74;
              } else {
                ob.field_w = true;
                break L74;
              }
            }
            L75: {
              if (uj.field_j.field_L == 0) {
                break L75;
              } else {
                jh.field_a = true;
                break L75;
              }
            }
            L76: {
              if (hn.field_d.field_L != 0) {
                jh.field_a = false;
                break L76;
              } else {
                break L76;
              }
            }
            t.a(pd.field_Rb, false, param4, true);
            break L72;
          } else {
            break L72;
          }
        }
    }

    public static void k(int param0) {
        field_Qb = null;
        if (param0 != 0) {
            return;
        }
        field_Mb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
