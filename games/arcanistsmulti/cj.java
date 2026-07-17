/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int[] field_a;
    static int field_b;
    static ll[] field_f;
    static String field_c;
    static String field_e;
    static int field_d;
    static int[] field_g;

    final static void b(int param0) {
        int var1 = 65;
        qj.field_i = tc.field_C + " <b>" + ln.field_R + "</b> " + li.field_G + " <b>" + ki.field_t + "</b> " + we.field_d + "<br>" + "<br>" + p.field_f;
    }

    final static void a(int param0, int param1, int param2, int param3, vg param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        gl var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        vg var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        gl stackIn_37_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        gl stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var40 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param4;
                if (var45.field_H == null) {
                  break L2;
                } else {
                  if (1 >= var45.field_F) {
                    break L2;
                  } else {
                    var62 = var45.field_H;
                    to.a(var62, false, jb.field_s, 0, 0);
                    break L1;
                  }
                }
              }
              ol.a((byte) 91);
              break L1;
            }
            var66 = new int[param4.field_A];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param4.field_A];
            var65 = dc.field_k;
            var64 = nf.field_Lb;
            var63 = mf.field_b;
            var13 = 0;
            L3: while (true) {
              if (param4.field_A <= var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (ol.field_i <= var44) {
                    L5: {
                      if (param3 == 20133) {
                        break L5;
                      } else {
                        field_b = -66;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var14 = w.field_Lb[var44];
                      var15 = param4.field_U[var14];
                      var16 = param4.field_T[var14];
                      var17 = param4.field_O[var14];
                      if (param4.field_w[var14] < dc.field_k.length) {
                        stackOut_23_0 = param4.field_w[var14];
                        stackIn_24_0 = stackOut_23_0;
                        break L6;
                      } else {
                        stackOut_22_0 = -1;
                        stackIn_24_0 = stackOut_22_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_24_0;
                      if (dc.field_k.length > param4.field_q[var14]) {
                        stackOut_26_0 = param4.field_q[var14];
                        stackIn_27_0 = stackOut_26_0;
                        break L7;
                      } else {
                        stackOut_25_0 = -1;
                        stackIn_27_0 = stackOut_25_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_27_0;
                      if (param4.field_u[var14] >= dc.field_k.length) {
                        stackOut_29_0 = -1;
                        stackIn_30_0 = stackOut_29_0;
                        break L8;
                      } else {
                        stackOut_28_0 = param4.field_u[var14];
                        stackIn_30_0 = stackOut_28_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_30_0;
                        if (ph.field_e == null) {
                          break L10;
                        } else {
                          if (param4.field_z == null) {
                            break L10;
                          } else {
                            if (var14 >= param4.field_z.length) {
                              break L10;
                            } else {
                              if (param4.field_z[var14] == -1) {
                                break L10;
                              } else {
                                if (ph.field_e.length <= param4.field_z[var14]) {
                                  break L10;
                                } else {
                                  stackOut_35_0 = ph.field_e[param4.field_z[var14]];
                                  stackIn_37_0 = stackOut_35_0;
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_36_0 = null;
                      stackIn_37_0 = (gl) (Object) stackOut_36_0;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_37_0;
                        var22 = ud.field_p[var15];
                        var23 = v.field_g[var15];
                        var24 = ud.field_p[var16];
                        var25 = v.field_g[var16];
                        var26 = ud.field_p[var17];
                        var27 = v.field_g[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var19 != var20) {
                            break L12;
                          } else {
                            L13: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref == null) {
                                stackOut_41_0 = 8355711;
                                stackIn_42_0 = stackOut_41_0;
                                break L13;
                              } else {
                                stackOut_40_0 = var21_ref.field_e;
                                stackIn_42_0 = stackOut_40_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_42_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = (16711781 & var32 * var28) >>> 8 | (-16711761 & var28 * var31) >>> 8;
                            var33 = var33 + var29 * 65793;
                            c.a(var25, 83, (var33 & 16711422) >> 1, var23, var22, var27, var24, var26);
                            break L11;
                          }
                        }
                      }
                      L14: {
                        var28 = var66[var18];
                        var29 = var66[var19];
                        var30 = var66[var20];
                        var31 = var67[var18];
                        var32 = var67[var19];
                        var33 = var67[var20];
                        if (var21_ref == null) {
                          stackOut_45_0 = 8355711;
                          stackIn_46_0 = stackOut_45_0;
                          break L14;
                        } else {
                          stackOut_44_0 = var21_ref.field_e;
                          stackIn_46_0 = stackOut_44_0;
                          break L14;
                        }
                      }
                      var34 = stackIn_46_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = var28 * var36 >>> 8 & -100598016 | var35 * var28 >>> 8 & -755040001;
                      var38 = var29 * var35 >>> 8 & -721485569 | var29 * var36 >>> 8 & 1778450176;
                      var38 = var38 + var32 * 65793;
                      var39 = -989921025 & var35 * var30 >>> 8 | (var36 * var30 & 16711858) >>> 8;
                      var37 = var37 + 65793 * var31;
                      var39 = var39 + var33 * 65793;
                      tn.a(255 & var37 >> 8, var24, 255 & var38 >> 8, var23, -109, var37 >> 16, var27, var38 >> 16, 255 & var37, var22, var39 >> 16, var25, var26, (var39 & 65321) >> 8, 255 & var39, 255 & var38);
                      break L11;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L15: {
                  var14 = var63[var13] * param5 + var64[var13] * param0 + var65[var13] * param6 >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (0 <= var14) {
                    if (var14 < 128) {
                      stackOut_14_0 = var14 + 128;
                      stackIn_15_0 = stackOut_14_0;
                      break L16;
                    } else {
                      stackOut_13_0 = 256;
                      stackIn_15_0 = stackOut_13_0;
                      break L16;
                    }
                  } else {
                    stackOut_11_0 = 128;
                    stackIn_15_0 = stackOut_11_0;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_15_0;
                  var15 = param2 * var65[var13] - (-(param1 * var64[var13]) - var63[var13] * param7) >> 8;
                  stackOut_15_0 = vf.field_n;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var15 < 0) {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = -var15;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L17;
                  } else {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = var15;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L17;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = var14 * (256 - var15) >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var8;
            stackOut_51_1 = new StringBuilder().append("cj.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param4 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L18;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_f = null;
        }
        field_f = null;
        field_c = null;
        field_g = null;
        field_a = null;
        field_e = null;
    }

    final static void a(int param0) {
        if (oj.field_i) {
            de.b(de.field_i, de.field_c, de.field_h + -de.field_i, de.field_k + -de.field_c);
            co.field_f.a(false, true);
        }
    }

    final static int a(boolean param0, byte param1, int param2, hc param3, int param4, hc param5, String param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        int stackIn_6_0 = 0;
        wk stackIn_17_0 = null;
        wk stackIn_18_0 = null;
        wk stackIn_19_0 = null;
        String stackIn_19_1 = null;
        wk stackIn_20_0 = null;
        wk stackIn_21_0 = null;
        wk stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_36_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        wk stackOut_16_0 = null;
        wk stackOut_18_0 = null;
        String stackOut_18_1 = null;
        wk stackOut_17_0 = null;
        String stackOut_17_1 = null;
        wk stackOut_19_0 = null;
        wk stackOut_21_0 = null;
        String stackOut_21_1 = null;
        wk stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_35_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var16 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var15 = param5.b(85);
              var11_ref_String = var15;
              var11_ref_String = var15;
              var8 = param3.b(-68);
              var11_ref_String = var8;
              var11_ref_String = var8;
              if (ch.field_c == null) {
                if (!ie.a(-89, false)) {
                  stackOut_5_0 = -1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -91) {
                break L2;
              } else {
                var14 = null;
                cj.a(-75, -92, 61, -80, (vg) null, 40, 3, -5);
                break L2;
              }
            }
            L3: {
              if (ob.field_eb != pc.field_g) {
                break L3;
              } else {
                L4: {
                  kj.field_e = null;
                  he.field_e.field_g = 0;
                  if (param6 == null) {
                    L5: {
                      jf.field_a.field_g = 0;
                      jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
                      jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
                      stackOut_16_0 = jf.field_a;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (param5.a(true)) {
                        stackOut_18_0 = (wk) (Object) stackIn_18_0;
                        stackOut_18_1 = (String) var15;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        break L5;
                      } else {
                        stackOut_17_0 = (wk) (Object) stackIn_17_0;
                        stackOut_17_1 = "";
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        break L5;
                      }
                    }
                    L6: {
                      ((wk) (Object) stackIn_19_0).a(stackIn_19_1, (byte) -115);
                      stackOut_19_0 = jf.field_a;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (param3.a(true)) {
                        stackOut_21_0 = (wk) (Object) stackIn_21_0;
                        stackOut_21_1 = (String) var8;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        break L6;
                      } else {
                        stackOut_20_0 = (wk) (Object) stackIn_20_0;
                        stackOut_20_1 = "";
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        break L6;
                      }
                    }
                    ((wk) (Object) stackIn_22_0).a(stackIn_22_1, (byte) -92);
                    he.field_e.f(16, (byte) -75);
                    he.field_e.field_g = he.field_e.field_g + 1;
                    var9 = he.field_e.field_g;
                    vd.a(false, (wk) (Object) he.field_e, nl.field_Jb, jf.field_a, q.field_K);
                    he.field_e.b(he.field_e.field_g + -var9, (byte) 43);
                    break L4;
                  } else {
                    L7: {
                      var9 = 0;
                      jf.field_a.field_g = 0;
                      if (!param0) {
                        break L7;
                      } else {
                        var9 = var9 | 1;
                        break L7;
                      }
                    }
                    L8: {
                      jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
                      jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
                      jf.field_a.a(var15, (byte) -100);
                      jf.field_a.a(var8, (byte) -96);
                      var17 = (CharSequence) (Object) param6;
                      jf.field_a.a(vl.a((byte) 106, var17), (byte) -92);
                      jf.field_a.c(param4, (byte) -73);
                      jf.field_a.f(param2, (byte) -118);
                      jf.field_a.f(var9, (byte) -62);
                      he.field_e.f(18, (byte) -114);
                      he.field_e.field_g = he.field_e.field_g + 2;
                      var10 = he.field_e.field_g;
                      var11_ref_String = gb.a(cd.e(121), param1 ^ 32);
                      if (var11_ref_String != null) {
                        break L8;
                      } else {
                        var11_ref_String = "";
                        break L8;
                      }
                    }
                    he.field_e.a(var11_ref_String, 23333);
                    vd.a(false, (wk) (Object) he.field_e, nl.field_Jb, jf.field_a, q.field_K);
                    he.field_e.a(he.field_e.field_g - var10, -19571);
                    break L4;
                  }
                }
                we.a(-1, (byte) 113);
                ob.field_eb = sb.field_f;
                break L3;
              }
            }
            L9: {
              if (ob.field_eb == sb.field_f) {
                if (pe.a((byte) -86, 1)) {
                  L10: {
                    var9 = df.field_z.e((byte) 56);
                    df.field_z.field_g = 0;
                    if (var9 < 100) {
                      break L10;
                    } else {
                      if (var9 > 105) {
                        break L10;
                      } else {
                        ob.field_eb = ej.field_R;
                        ul.field_M = new String[-100 + var9];
                        break L9;
                      }
                    }
                  }
                  if (var9 == 248) {
                    df.a(1, cd.e(param1 ^ -40));
                    me.field_E = fo.field_c;
                    ka.b(false);
                    bb.field_h = false;
                    stackOut_35_0 = var9;
                    stackIn_36_0 = stackOut_35_0;
                    return stackIn_36_0;
                  } else {
                    if (99 != var9) {
                      ob.field_eb = di.field_i;
                      fj.field_h = -1;
                      on.field_g = var9;
                      break L9;
                    } else {
                      boolean discarded$1 = pe.a((byte) -86, oi.b(88));
                      kj.field_e = new Boolean(jo.a((wk) (Object) df.field_z, param1 + 89));
                      df.field_z.field_g = 0;
                      break L9;
                    }
                  }
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L11: {
              if (ob.field_eb != ej.field_R) {
                break L11;
              } else {
                var9 = 2;
                if (!pe.a((byte) -86, var9)) {
                  break L11;
                } else {
                  var10 = df.field_z.n(-98);
                  df.field_z.field_g = 0;
                  if (pe.a((byte) -86, var10)) {
                    var11 = ul.field_M.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var11 <= var12) {
                        ka.b(false);
                        bb.field_h = false;
                        stackOut_44_0 = var11 + 100;
                        stackIn_45_0 = stackOut_44_0;
                        return stackIn_45_0;
                      } else {
                        ul.field_M[var12] = df.field_z.e(-32461);
                        var12++;
                        continue L12;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
              }
            }
            L13: {
              if (ob.field_eb != di.field_i) {
                break L13;
              } else {
                if (!pn.b(-12564)) {
                  break L13;
                } else {
                  L14: {
                    if (on.field_g != 255) {
                      me.field_E = df.field_z.l(param1 + 90);
                      break L14;
                    } else {
                      var9_ref_String = df.field_z.g(-112);
                      if (var9_ref_String != null) {
                        jf.a(var9_ref_String, cd.e(110), 0);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ka.b(false);
                  bb.field_h = false;
                  stackOut_53_0 = on.field_g;
                  stackIn_54_0 = stackOut_53_0;
                  return stackIn_54_0;
                }
              }
            }
            L15: {
              if (null != ch.field_c) {
                break L15;
              } else {
                if (!bb.field_h) {
                  var9 = ng.field_G;
                  ng.field_G = dh.field_Lb;
                  dh.field_Lb = var9;
                  bb.field_h = true;
                  break L15;
                } else {
                  L16: {
                    if (rk.a(-78) <= 30000L) {
                      me.field_E = wl.field_R;
                      break L16;
                    } else {
                      me.field_E = tg.field_a;
                      break L16;
                    }
                  }
                  bb.field_h = false;
                  stackOut_60_0 = 249;
                  stackIn_61_0 = stackOut_60_0;
                  return stackIn_61_0;
                }
              }
            }
            stackOut_63_0 = -1;
            stackIn_64_0 = stackOut_63_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("cj.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param3 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L17;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L17;
            }
          }
          L18: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44).append(param4).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param5 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L18;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L18;
            }
          }
          L19: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param6 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L19;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L19;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 41);
        }
        return stackIn_64_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Show lobby chat from my friends";
        field_a = new int[]{24, 25, 26};
        field_e = "This password is part of your Player Name, and would be easy to guess";
    }
}
