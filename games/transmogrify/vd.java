/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    ui field_d;
    private int field_k;
    ui field_q;
    int field_c;
    int field_l;
    int field_e;
    int field_g;
    ui field_o;
    ui field_f;
    kg field_m;
    ui field_b;
    static volatile int field_a;
    int field_i;
    int field_j;
    int field_n;
    private boolean field_p;
    static kg field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, e param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        oe var21 = null;
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
        e var45 = null;
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
        oe stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_22_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        oe stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          var40 = Transmogrify.field_A ? 1 : 0;
          if (param4 <= -58) {
            break L0;
          } else {
            field_a = 15;
            break L0;
          }
        }
        L1: {
          L2: {
            var45 = param6;
            if (var45.field_y == null) {
              break L2;
            } else {
              if (-2 <= (var45.field_w ^ -1)) {
                break L2;
              } else {
                var62 = var45.field_y;
                vj.a(ca.field_c, var62, (byte) -69, 0, 0);
                break L1;
              }
            }
          }
          qa.c(1702);
          break L1;
        }
        var66 = new int[param6.field_l];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param6.field_l];
        var64 = mk.field_w;
        var65 = nh.field_j;
        var63 = d.field_b;
        var13 = 0;
        L3: while (true) {
          if (var13 >= param6.field_l) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= ug.field_h) {
                return;
              } else {
                L5: {
                  var14 = i.field_b[var44];
                  var15 = param6.field_o[var14];
                  var16 = param6.field_s[var14];
                  var17 = param6.field_G[var14];
                  if (mk.field_w.length <= param6.field_b[var14]) {
                    stackOut_23_0 = -1;
                    stackIn_24_0 = stackOut_23_0;
                    break L5;
                  } else {
                    stackOut_22_0 = param6.field_b[var14];
                    stackIn_24_0 = stackOut_22_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_24_0;
                  if (mk.field_w.length > param6.field_n[var14]) {
                    stackOut_26_0 = param6.field_n[var14];
                    stackIn_27_0 = stackOut_26_0;
                    break L6;
                  } else {
                    stackOut_25_0 = -1;
                    stackIn_27_0 = stackOut_25_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_27_0;
                  if (param6.field_J[var14] < mk.field_w.length) {
                    stackOut_29_0 = param6.field_J[var14];
                    stackIn_30_0 = stackOut_29_0;
                    break L7;
                  } else {
                    stackOut_28_0 = -1;
                    stackIn_30_0 = stackOut_28_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_30_0;
                    if (rg.field_L == null) {
                      break L9;
                    } else {
                      if (param6.field_f == null) {
                        break L9;
                      } else {
                        if (var14 >= param6.field_f.length) {
                          break L9;
                        } else {
                          if (-1 == param6.field_f[var14]) {
                            break L9;
                          } else {
                            if (rg.field_L.length > param6.field_f[var14]) {
                              stackOut_37_0 = rg.field_L[param6.field_f[var14]];
                              stackIn_38_0 = stackOut_37_0;
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_36_0 = null;
                  stackIn_38_0 = (oe) (Object) stackOut_36_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_38_0;
                  var22 = sg.field_a[var15];
                  var23 = d.field_a[var15];
                  var24 = sg.field_a[var16];
                  var25 = d.field_a[var16];
                  var26 = sg.field_a[var17];
                  var27 = d.field_a[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var20 != var19) {
                      break L10;
                    } else {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 == null) {
                          stackOut_42_0 = 8355711;
                          stackIn_43_0 = stackOut_42_0;
                          break L11;
                        } else {
                          stackOut_41_0 = var21.field_b;
                          stackIn_43_0 = stackOut_41_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_43_0;
                      var31 = 16711935 & var30;
                      var32 = var30 & 65280;
                      var33 = (16711908 & var32 * var28) >>> 1848215592 | (-16711885 & var28 * var31) >>> 791840680;
                      var33 = var33 + var29 * 65793;
                      ri.a(var22, (var33 & 16711422) >> 381694881, var26, var27, (byte) -127, var23, var25, var24);
                      var44++;
                      continue L4;
                    }
                  }
                }
                L12: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21 != null) {
                    stackOut_46_0 = var21.field_b;
                    stackIn_47_0 = stackOut_46_0;
                    break L12;
                  } else {
                    stackOut_45_0 = 8355711;
                    stackIn_47_0 = stackOut_45_0;
                    break L12;
                  }
                }
                var34 = stackIn_47_0;
                var35 = 16711935 & var34;
                var36 = 65280 & var34;
                var37 = (var35 * var28 & -16711934) >>> -1656681048 | (16711865 & var36 * var28) >>> -1976531352;
                var38 = (var29 * var36 & 16711799) >>> 990719784 | (var29 * var35 & -16711820) >>> 1225087880;
                var38 = var38 + var32 * 65793;
                var39 = (16711897 & var30 * var36) >>> -272417144 | (-16711842 & var30 * var35) >>> -628493656;
                var37 = var37 + 65793 * var31;
                var39 = var39 + var33 * 65793;
                kl.a(var38 >> 1696874928, var23, (var39 & 65521) >> 348443848, var27, var24, var25, var39 & 255, var37 >> -1049315600, (65468 & var37) >> 980725064, (byte) 44, var26, var38 & 255, 255 & var38 >> 863241832, var22, var39 >> -250309264, 255 & var37);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = var63[var13] * param7 + (param2 * var64[var13] + param3 * var65[var13]) >> -1240691992;
              if (-1 >= (var14 ^ -1)) {
                break L13;
              } else {
                var14 = -var14;
                break L13;
              }
            }
            L14: {
              if (0 <= var14) {
                if (var14 < 128) {
                  stackOut_14_0 = 128 + var14;
                  stackIn_15_0 = stackOut_14_0;
                  break L14;
                } else {
                  stackOut_13_0 = 256;
                  stackIn_15_0 = stackOut_13_0;
                  break L14;
                }
              } else {
                stackOut_11_0 = 128;
                stackIn_15_0 = stackOut_11_0;
                break L14;
              }
            }
            L15: {
              var14 = stackIn_15_0;
              var15 = param1 * var63[var13] + (var65[var13] * param5 + var64[var13] * param0) >> 599717448;
              stackOut_15_0 = ug.field_c;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (-1 < (var15 ^ -1)) {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = -var15;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L15;
              } else {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = var15;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L15;
              }
            }
            var15 = stackIn_18_0[stackIn_18_1];
            var14 = var14 * (-var15 + 256) >>> -2081409400;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    final static int a(String[] args, int param1, String param2, kg param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = Transmogrify.field_A ? 1 : 0;
          var5 = param3.a(param2);
          if (param1 < var5) {
            break L0;
          } else {
            if (-1 == param2.indexOf("<br>")) {
              args[0] = (String) (Object) args;
              return 1;
            } else {
              break L0;
            }
          }
        }
        var6 = (-1 + (var5 + param1)) / param1;
        param1 = var5 / var6;
        var6 = 0;
        var8 = 22 % ((5 - param4) / 58);
        var7 = 0;
        var9 = param2.length();
        var10 = 0;
        L1: while (true) {
          if (var10 >= var9) {
            L2: {
              if (var7 < var9) {
                var6++;
                args[var6] = param2.substring(var7, var9).trim();
                break L2;
              } else {
                break L2;
              }
            }
            return var6;
          } else {
            L3: {
              L4: {
                var11 = param2.charAt(var10);
                if (var11 == 32) {
                  break L4;
                } else {
                  if (var11 != 45) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var12 = param2.substring(var7, 1 + var10).trim();
              var13 = param3.a(var12);
              if (param1 > var13) {
                break L3;
              } else {
                var6++;
                args[var6] = var12;
                var7 = var10 - -1;
                break L3;
              }
            }
            if (62 == var11) {
              if (param2.regionMatches(-3 + var10, "<br>", 0, 4)) {
                var6++;
                args[var6] = param2.substring(var7, -3 + var10).trim();
                var7 = 1 + var10;
                var10++;
                continue L1;
              } else {
                var10++;
                continue L1;
              }
            } else {
              var10++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        o var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        am var6_ref_am = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        hj var28 = null;
        L0: {
          var26 = Transmogrify.field_A ? 1 : 0;
          var28 = nf.field_l;
          var2 = var28.d((byte) 114);
          if (-1 == (var2 ^ -1)) {
            var3 = var28.a((byte) -97);
            var4 = (o) (Object) mh.field_a.a((byte) -95);
            L1: while (true) {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  if (var3 != var4.field_j) {
                    var4 = (o) (Object) mh.field_a.a(true);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var4 != null) {
                L3: {
                  var5 = var28.d((byte) 53);
                  if (0 == var5) {
                    break L3;
                  } else {
                    var6 = var4.field_h;
                    od.field_l[0].field_a = null;
                    od.field_l[0].field_e = w.field_a;
                    od.field_l[0].field_c = false;
                    var7 = var4.field_n;
                    var8_int = 1;
                    L4: while (true) {
                      if (var5 <= var8_int) {
                        var4.field_m = new String[3][var6];
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var4.field_g = new long[3][var6];
                        var10 = new long[3][var6];
                        var4.field_l = new int[3][var6 * var7];
                        var11 = new int[3][var6 * var7];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.d((byte) 41);
                        if (-1 <= (var18 ^ -1)) {
                          break L3;
                        } else {
                          var19 = 0;
                          L5: while (true) {
                            if (var19 >= var18) {
                              break L3;
                            } else {
                              L6: {
                                var20 = var28.d((byte) 102);
                                var21 = od.field_l[var20].field_e;
                                var22 = var28.e((byte) 115);
                                var24 = var28.field_h;
                                if (var6 > var19) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = od.field_l[var20].field_a;
                                  var10[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L7: while (true) {
                                    if (var7 <= var25) {
                                      break L6;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var28.c((byte) -126);
                                      var25++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              L8: {
                                if (var21 == null) {
                                  break L8;
                                } else {
                                  if (!qg.a(var21, (byte) 78)) {
                                    break L8;
                                  } else {
                                    var8[1][var13] = w.field_a;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var13++;
                                    var28.field_h = var24;
                                    var25 = 0;
                                    L9: while (true) {
                                      if (var25 >= var7) {
                                        break L8;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var28.c((byte) -115);
                                        var25++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var6 > var14) {
                                if (!od.field_l[var20].field_c) {
                                  od.field_l[var20].field_c = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = od.field_l[var20].field_a;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var28.field_h = var24;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var25 < var7) {
                                      var17++;
                                      var11[2][var17] = var28.c((byte) -110);
                                      var25++;
                                      continue L10;
                                    } else {
                                      var19++;
                                      continue L5;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L5;
                                }
                              } else {
                                var19++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        od.field_l[var8_int].field_e = var28.g(12248);
                        od.field_l[var8_int].field_c = false;
                        if (var28.d((byte) 72) == 1) {
                          od.field_l[var8_int].field_a = var28.g(12248);
                          var8_int++;
                          continue L4;
                        } else {
                          od.field_l[var8_int].field_a = null;
                          var8_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                var4.field_k = true;
                var4.c(5);
                break L0;
              } else {
                pc.a(param0 ^ 17);
                return;
              }
            }
          } else {
            if ((var2 ^ -1) == -2) {
              var3 = var28.a((byte) -96);
              var4_long = var28.e((byte) 110);
              var6_ref_am = (am) (Object) ec.field_b.a((byte) -95);
              L11: while (true) {
                L12: {
                  if (var6_ref_am == null) {
                    break L12;
                  } else {
                    if (var3 == var6_ref_am.field_p) {
                      break L12;
                    } else {
                      var6_ref_am = (am) (Object) ec.field_b.a(true);
                      continue L11;
                    }
                  }
                }
                if (var6_ref_am != null) {
                  var6_ref_am.field_o = var4_long;
                  var6_ref_am.c(param0 + -11);
                  break L0;
                } else {
                  pc.a(1);
                  return;
                }
              }
            } else {
              d.a((Throwable) null, 94, "HS1: " + ik.q(48));
              pc.a(1);
              break L0;
            }
          }
        }
        L13: {
          if (param0 == 16) {
            break L13;
          } else {
            var27 = null;
            int discarded$1 = vd.a((String[]) null, 74, (String) null, (kg) null, (byte) 117);
            break L13;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -111) {
            field_h = null;
        }
        field_h = null;
    }

    final void a(int param0, kg param1) {
        int var7_int = 0;
        int var15 = Transmogrify.field_A ? 1 : 0;
        h var17 = new h(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_t + param1.field_y));
        ((vd) this).field_q = (ui) (Object) var17;
        var17.field_f = 16777215;
        ki var4 = new ki();
        var17.a((byte) -106, (h) (Object) var4);
        ((vd) this).field_g = 15658734;
        var4.field_n = 15658734;
        ((vd) this).field_l = 3;
        ((vd) this).field_j = -1;
        ((vd) this).field_c = 3;
        ((vd) this).field_e = 3;
        ((vd) this).field_n = 5592405;
        ((vd) this).field_k = 15658734;
        var4.field_g = 11711154;
        ((vd) this).field_m = param1;
        ((vd) this).field_i = 3;
        ab discarded$0 = var4.a((byte) -21, 0).a(-108, 15658734).a(we.a(8947848, 124, 7829367, 10066329), (byte) 32);
        ab discarded$1 = var4.a((byte) -21, 1).a(we.a(11184810, 117, 13421772, 10066329), (byte) 32);
        ab discarded$2 = var4.a((byte) -21, 3).a(we.a(8947848, 112, 10066329, 7829367), (byte) 32).a(1, (byte) 112).a(1, false);
        ti[] var5 = new ti[9];
        if (param0 >= -12) {
            return;
        }
        jf var16 = new jf(32, 32);
        jf var18 = var16;
        for (var7_int = 0; var18.field_w.length > var7_int; var7_int++) {
            var16.field_w[var7_int] = 1077952576;
        }
        var5[4] = (ti) (Object) var18;
        ab discarded$3 = var4.a((byte) -21, 4).a(true, 256).a(var5, (byte) 32);
        ab discarded$4 = var4.a((byte) -21, 5).a(bh.a(65793, -118, 0, 0, 0), (byte) 32).a(true, 256).a(-116, -1);
        ((vd) this).field_d = (ui) (Object) var4;
        ki var6 = new ki(var4, true);
        var6.field_b = 0;
        ki var7 = new ki(var4, true);
        var7.field_b = 0;
        var7.a(qa.a(68, 8947848), -114);
        ab discarded$5 = var7.a((byte) -21, 1).a(qa.a(64, 11184810), (byte) 32).a(-81, 2236962);
        ((vd) this).field_b = (ui) (Object) new wi(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        pa discarded$6 = new pa(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        ij discarded$7 = new ij(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        ki var8 = new ki();
        var17.a((byte) -106, (h) (Object) var8);
        ab discarded$8 = var8.a((byte) -21, 0).a(we.a(15658734, 116, 10066329, 7829367), (byte) 32).a(-62, 1118481).b(-1, (byte) -102);
        ab discarded$9 = var8.a((byte) -21, 4).a(true, 256).a(var5, (byte) 32);
        ((vd) this).field_f = (ui) (Object) var8;
        ti[] var9 = new ti[9];
        ti[] var10 = new ti[9];
        var9[4] = new ti(2, 1);
        var10[4] = new ti(1, 2);
        var9[4].field_w = new int[]{6710886, 7829367};
        var10[4].field_w = new int[]{6710886, 7829367};
        ki var11 = new ki();
        ki var12 = new ki();
        var11.a(0, -19106, var9);
        var12.a(0, -19106, var10);
        ti var13 = new ti(7, 4);
        var13.field_w = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        ki var14 = new ki(var4, true);
        var14.a(var13.a(), 1);
        var13.f();
        var14 = new ki(var4, true);
        var14.a(var13.a(), 1);
        var13.f();
        var14 = new ki(var4, true);
        var14.a(var13.a(), 1);
        var13.f();
        ki var19 = new ki(var4, true);
        var19.a(var13, 1);
    }

    final void a(int param0, int param1, String param2, int param3) {
        if (((vd) this).field_p) {
            this.a(param0, (byte) 125, param3, param2);
        } else {
            this.a((byte) 89, param3, param2, param0);
        }
        if (param1 < 6) {
            ((vd) this).field_f = null;
        }
    }

    private final void a(int param0, byte param1, int param2, String param3) {
        int var5 = 0;
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
        L0: {
          var15 = Transmogrify.field_A ? 1 : 0;
          var5 = ((vd) this).field_c - -((vd) this).field_i;
          var6 = ((vd) this).field_e + ((vd) this).field_l;
          var7 = ((vd) this).field_j;
          if (var7 == -1) {
            var7 = ((vd) this).field_m.field_t + ((vd) this).field_m.field_y;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 > 119) {
            break L1;
          } else {
            vd.a(-109);
            break L1;
          }
        }
        L2: {
          L3: {
            var8 = sb.field_c >> -2015692798;
            var9 = ((vd) this).field_m.a(param3);
            var10 = ((vd) this).field_m.field_t + ((vd) this).field_m.field_y;
            var11 = 1;
            if (var9 > var8) {
              break L3;
            } else {
              if ((param3.indexOf("<br>") ^ -1) != 0) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          L4: {
            if (oi.field_l == null) {
              oi.field_l = new String[16];
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (var8 >= var9) {
              var12 = var8;
              break L5;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((var9 % var8 - -var13 - 1) / var13) + var8;
              break L5;
            }
          }
          var11 = ((vd) this).field_m.a(param3, new int[1], oi.field_l);
          var10 = var10 + (-1 + var11) * var7;
          var9 = 0;
          var13 = 0;
          L6: while (true) {
            if (var11 <= var13) {
              break L2;
            } else {
              var14 = ((vd) this).field_m.a(oi.field_l[var13]);
              if (var9 < var14) {
                var9 = var14;
                var13++;
                continue L6;
              } else {
                var13++;
                continue L6;
              }
            }
          }
        }
        L7: {
          var12 = param2;
          if (var5 + var12 - -var9 > sb.field_c) {
            var12 = sb.field_c + -var9 - var5;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var13 = 32 + (-((vd) this).field_m.field_D + param0);
          if (var13 - -var10 + var6 <= sb.field_g) {
            break L8;
          } else {
            var13 = param0 + -var10 - var6;
            break L8;
          }
        }
        sb.d(var12, var13, var9 - -var5, var6 + var10, ((vd) this).field_g);
        sb.a(1 + var12, var13 + 1, var9 - (-var5 + 2), var10 - -var6 + -2, ((vd) this).field_n);
        int discarded$1 = ((vd) this).field_m.a(param3, var12 - -((vd) this).field_c, ((vd) this).field_l + var13, var9, var10, ((vd) this).field_k, -1, 0, 0, var7);
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        int var5 = ((vd) this).field_m.a(param2);
        int var6 = ((vd) this).field_m.field_D + ((vd) this).field_m.field_t;
        int var7 = param1;
        if (var5 + (var7 + 6) > sb.field_c) {
            var7 = sb.field_c - var5 + -6;
        }
        int var8 = 32 + -((vd) this).field_m.field_D + param3;
        if (var8 - (-var6 + -6) > sb.field_g) {
            var8 = -6 + -var6 + sb.field_g;
        }
        sb.d(var7, var8, var5 - -6, var6 - -6, ((vd) this).field_k);
        sb.a(1 + var7, var8 + 1, 4 + var5, 4 + var6, ((vd) this).field_n);
        if (param0 != 89) {
            vd.a((byte) -12);
        }
        ((vd) this).field_m.b(param2, var7 - -3, ((vd) this).field_m.field_D + 3 + var8, ((vd) this).field_k, -1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        if (param5 != 119) {
            ((vd) this).field_l = -85;
        }
        sb.e(param0, param3, param4, param2, param1);
    }

    public vd() {
        ((vd) this).field_p = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 != 4) {
            ((vd) this).field_g = 23;
        }
        sb.c(param3, param1, param2, param5, param4, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
