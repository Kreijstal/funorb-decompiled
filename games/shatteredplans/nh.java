/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends me {
    static bc field_l;
    private int field_k;
    private int[] field_n;
    static volatile long field_m;
    private int[] field_o;
    static int field_p;

    final static void a(java.applet.Applet param0, int param1, int param2, byte param3, String[] param4, int param5) {
        int var7 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        hn.field_d = param0.getParameter("overxgames");
        if (!(hn.field_d != null)) {
            hn.field_d = "0";
        }
        ja.field_j = param0.getParameter("overxachievements");
        if (!(null != ja.field_j)) {
            ja.field_j = "0";
        }
        String var6 = param0.getParameter("currency");
        if (var6 != null) {
            if (go.a(0, (CharSequence) (Object) var6)) {
                int discarded$0 = ma.a((CharSequence) (Object) var6, param3 + 5);
            }
        }
        ge.field_l = new bi[param4.length];
        if (param3 != -3) {
            nh.b((byte) -94);
        }
        for (var7 = 0; var7 < param4.length; var7++) {
            ge.field_l[var7] = new bi(317, 34);
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 >= -72) {
            return false;
        }
        return (param1 ^ -1) <= -1 ? true : false;
    }

    final fs[] b(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var5_int = 0;
        fs[] var5 = null;
        int var6 = 0;
        double var6_double = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            var10 = null;
            nh.a(-33, (nq) null, 126, 13, -76, 49, (String) null, true, -106, 108, -72, 85);
            break L0;
          }
        }
        if (null == ((nh) this).field_g) {
          var2 = 0;
          var3 = 1.7976931348623157e+308;
          var5_int = 0;
          L1: while (true) {
            if (var5_int >= ((nh) this).field_i.length) {
              if (-1 != (var2 ^ -1)) {
                var5 = new fs[var2];
                var6 = 0;
                L2: while (true) {
                  if (((nh) this).field_i.length <= var6) {
                    return var5;
                  } else {
                    if (((nh) this).field_n[var6] != 0) {
                      var7 = (double)(((nh) this).field_k + -((nh) this).field_o[var6]) / (double)((nh) this).field_n[var6];
                      if (var7 == var3) {
                        var2--;
                        var5[var2] = ((nh) this).field_i[var6];
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new fs[]{};
              }
            } else {
              if (((nh) this).field_n[var5_int] != 0) {
                if (((nh) this).field_o[var5_int] != 0) {
                  var6_double = (double)(((nh) this).field_k - ((nh) this).field_o[var5_int]) / (double)((nh) this).field_n[var5_int];
                  if (var3 == var6_double) {
                    var2++;
                    var5_int++;
                    continue L1;
                  } else {
                    if (var3 > var6_double) {
                      var3 = var6_double;
                      var2 = 1;
                      var5_int++;
                      continue L1;
                    } else {
                      var5_int++;
                      continue L1;
                    }
                  }
                } else {
                  var5_int++;
                  continue L1;
                }
              } else {
                var5_int++;
                continue L1;
              }
            }
          }
        } else {
          return ((nh) this).field_g;
        }
    }

    final void a(ob param0, byte param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        ((nh) this).field_k = param0.a(16711680);
        if (param1 != -109) {
            return;
        }
        for (var3 = 0; var3 < ((nh) this).field_o.length; var3++) {
            ((nh) this).field_o[var3] = param0.a(16711680);
        }
    }

    final static void a(int param0, nq param1, int param2, int param3, int param4, int param5, String param6, boolean param7, int param8, int param9, int param10, int param11) {
        bi var13 = null;
        cl.a(param5, param8, -22466, param0, param9, param4, param2, param3, param11);
        param1.c(param6, param5 + (param0 >> 1597255393), param3 + (param1.field_J + param9 >> 1738068769), 16777215, param10);
        if (!(!param7)) {
            var13 = new bi(param0, param9);
            bs.a(var13, 98);
            param1.c(param6, (param0 >> 539676449) + 1, param9 - -param1.field_J >> -60374847, 16777215, -1);
            param1.c(param6, (param0 >> -167663711) + -1, param1.field_J + param9 >> 1232774369, 16777215, -1);
            param1.c(param6, param0 >> -1453536479, (param9 - -param1.field_J >> 1177627617) + 1, 16777215, -1);
            param1.c(param6, param0 >> -576672863, -1 - -(param1.field_J + param9 >> -958235935), 16777215, -1);
            cg.i(0);
            var13.c(param5, param3, 64);
        }
    }

    nh(fs[] param0) {
        super(param0);
        int var2 = 0;
        ((nh) this).field_k = 0;
        ((nh) this).field_o = new int[((nh) this).field_i.length];
        ((nh) this).field_n = new int[((nh) this).field_i.length];
        for (var2 = 0; var2 < ((nh) this).field_i.length; var2++) {
            ((nh) this).field_n[var2] = 3;
        }
    }

    public static void b(byte param0) {
        field_l = null;
        if (param0 != 59) {
            field_m = -92L;
        }
    }

    final int b(boolean param0) {
        if (param0) {
            boolean discarded$0 = nh.a((byte) 114, 82);
        }
        return cc.field_n * ((nh) this).field_o.length + rs.field_Cb.field_J;
    }

    final boolean a(dc param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ln var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        sd var10 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!super.a(param0, (byte) 116)) {
          L0: {
            if (-1 == (((nh) this).field_k ^ -1)) {
              var3 = param0.field_g.field_e.length / ((nh) this).field_i.length;
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (hp.field_k.length <= var4) {
                    break L2;
                  } else {
                    if (md.field_J[var4] != var3) {
                      var4++;
                      continue L1;
                    } else {
                      ((nh) this).field_k = hp.field_k[var4];
                      break L2;
                    }
                  }
                }
                if (((nh) this).field_k != 0) {
                  break L0;
                } else {
                  throw new RuntimeException("No points settings for galaxy size of " + var3 + " stars per player.");
                }
              }
            } else {
              break L0;
            }
          }
          var3 = 0;
          L3: while (true) {
            if (var3 >= ((nh) this).field_i.length) {
              L4: {
                if (param1 >= 23) {
                  break L4;
                } else {
                  var8 = null;
                  boolean discarded$1 = ((nh) this).a((dc) null, (byte) -96);
                  break L4;
                }
              }
              var3 = 0;
              var4 = 0;
              var5 = 0;
              L5: while (true) {
                if (var5 >= ((nh) this).field_o.length) {
                  if (var3 == 0) {
                    return false;
                  } else {
                    ((nh) this).field_g = new fs[var3];
                    var9 = 0;
                    var5 = var9;
                    L6: while (true) {
                      if (((nh) this).field_i.length <= var9) {
                        return true;
                      } else {
                        if (((nh) this).field_o[var9] == var4) {
                          var3--;
                          ((nh) this).field_g[var3] = ((nh) this).field_i[var9];
                          var9++;
                          continue L6;
                        } else {
                          var9++;
                          continue L6;
                        }
                      }
                    }
                  }
                } else {
                  if ((1 << var5 & param0.field_w) == 0) {
                    if (((nh) this).field_k <= ((nh) this).field_o[var5]) {
                      if (((nh) this).field_o[var5] > var4) {
                        var3 = 1;
                        var4 = ((nh) this).field_o[var5];
                        var5++;
                        continue L5;
                      } else {
                        if (var4 == ((nh) this).field_o[var5]) {
                          var3++;
                          var5++;
                          continue L5;
                        } else {
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      var5++;
                      continue L5;
                    }
                  } else {
                    ((nh) this).field_o[var5] = -1;
                    var5++;
                    continue L5;
                  }
                }
              }
            } else {
              ((nh) this).field_n[var3] = 0;
              var10 = (sd) (Object) ((nh) this).field_i[var3].field_i.d(0);
              L7: while (true) {
                if (var10 == null) {
                  ((nh) this).field_o[var3] = ((nh) this).field_o[var3] + ((nh) this).field_n[var3];
                  var3++;
                  continue L3;
                } else {
                  var5_ref = var10.j(18229);
                  L8: while (true) {
                    if (var5_ref == null) {
                      var10 = (sd) (Object) ((nh) this).field_i[var3].field_i.a((byte) -71);
                      continue L7;
                    } else {
                      L9: {
                        L10: {
                          var6 = var5_ref.field_L;
                          if (var6 == 0) {
                            break L10;
                          } else {
                            if (1 != var6) {
                              if (2 != var6) {
                                if (-4 == (var6 ^ -1)) {
                                  ((nh) this).field_n[var3] = ((nh) this).field_n[var3] + 3;
                                  break L9;
                                } else {
                                  var5_ref = var10.h(-23410);
                                  continue L8;
                                }
                              } else {
                                ((nh) this).field_n[var3] = ((nh) this).field_n[var3] + 2;
                                break L9;
                              }
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((nh) this).field_n[var3] = ((nh) this).field_n[var3] + 1;
                        break L9;
                      }
                      var5_ref = var10.h(-23410);
                      continue L8;
                    }
                  }
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        vh.field_b = param2;
        fe.field_A = param3;
        we.field_c = param0;
        if (param4 != 2) {
            return;
        }
        sp.field_r = param1;
    }

    final void a(byte param0, dc param1, kq param2) {
        int[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7_int = 0;
        fs[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int[] var9 = null;
        int var10_int = 0;
        fs[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        qk[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        L0: {
          var15 = ShatteredPlansClient.field_F ? 1 : 0;
          if (0 != ((nh) this).field_k) {
            break L0;
          } else {
            var4_int = param1.field_g.field_e.length / ((nh) this).field_i.length;
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= hp.field_k.length) {
                  break L2;
                } else {
                  if (md.field_J[var5] != var4_int) {
                    var5++;
                    continue L1;
                  } else {
                    ((nh) this).field_k = hp.field_k[var5];
                    break L2;
                  }
                }
              }
              if (((nh) this).field_k != 0) {
                break L0;
              } else {
                throw new RuntimeException("No points settings for galaxy size of " + var4_int + " stars per player.");
              }
            }
          }
        }
        var34 = new int[((nh) this).field_i.length];
        var29 = var34;
        var24 = var29;
        var18 = var24;
        var16 = var18;
        var36 = var16;
        var31 = var36;
        var26 = var31;
        var20 = var26;
        var4 = var20;
        var5 = 0;
        L3: while (true) {
          if (var5 >= var34.length) {
            L4: {
              var5 = 0;
              if (param0 < -9) {
                break L4;
              } else {
                nh.a(56, -93, 96, 4, 73);
                break L4;
              }
            }
            var35 = ((nh) this).field_o;
            var30 = var35;
            var25 = var30;
            var19 = var25;
            var17 = var19;
            var6 = var17;
            var7_int = 0;
            L5: while (true) {
              if (var35.length <= var7_int) {
                L6: {
                  if (-1 > (var5 ^ -1)) {
                    lh.a((byte) -93, var4, (int[]) ((nh) this).field_o.clone());
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var23 = new qk[]{new qk(0, 0, 182, rs.field_Cb.field_J, re.a(ShatteredPlansClient.field_J, 4371, new String[1]))};
                var7 = new fs[((nh) this).field_i.length];
                var38 = new int[((nh) this).field_i.length];
                var33 = var38;
                var28 = var33;
                var22 = var28;
                var8 = var22;
                var37 = new int[((nh) this).field_i.length];
                var32 = var37;
                var27 = var32;
                var21 = var27;
                var9 = var21;
                var10_int = 0;
                L7: while (true) {
                  if (((nh) this).field_i.length <= var10_int) {
                    L8: {
                      L9: {
                        var10 = ((nh) this).b(0);
                        if (null != ((nh) this).field_g) {
                          break L9;
                        } else {
                          if (0 != var10.length) {
                            var12 = var10[0].field_x;
                            var13 = (double)(-((nh) this).field_o[var12] + ((nh) this).field_k) / (double)((nh) this).field_n[var12];
                            var11 = (int)Math.ceil(var13);
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var11 = 0;
                      break L8;
                    }
                    param2.a(((nh) this).field_k, var7, var37, var38, var10, var23, (byte) -47, var11);
                    return;
                  } else {
                    var7[var10_int] = ((nh) this).field_i[var36[var10_int]];
                    var8[var10_int] = ((nh) this).field_o[var36[var10_int]];
                    var9[var10_int] = ((nh) this).field_n[var36[var10_int]];
                    var10_int++;
                    continue L7;
                  }
                }
              } else {
                var8_int = var35[var7_int];
                var5 = var5 + var8_int;
                var7_int++;
                continue L5;
              }
            }
          } else {
            var34[var5] = var5;
            var5++;
            continue L3;
          }
        }
    }

    final void a(int param0, ob param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        param1.e(11135, ((nh) this).field_k);
        for (var3 = 0; var3 < ((nh) this).field_o.length; var3++) {
            param1.e(11135, ((nh) this).field_o[var3]);
        }
        var3 = 23 / ((-72 - param0) / 45);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0L;
        field_p = 0;
    }
}
