/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends me {
    static int field_m;
    static String field_q;
    private int field_r;
    private int[] field_n;
    static String field_k;
    private fs field_o;
    static int field_p;
    private fs field_l;

    final int b(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((ui) this).a((byte) -126, (dc) null, (kq) null);
        }
        return rs.field_Cb.field_J * 3 - -(((ui) this).field_n.length * cc.field_n);
    }

    final boolean a(dc param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        fs var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!super.a(param0, (byte) 100)) {
          L0: {
            ((ui) this).field_l = param0.field_g.field_e[36].field_y;
            if (((ui) this).field_l == null) {
              break L0;
            } else {
              ((ui) this).field_n[((ui) this).field_l.field_x] = ((ui) this).field_n[((ui) this).field_l.field_x] + 1;
              if (((ui) this).field_o != null) {
                if (((ui) this).field_o == ((ui) this).field_l) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                ((ui) this).field_o = ((ui) this).field_l;
                break L0;
              }
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((ui) this).field_i.length) {
              if (-20 >= (param0.field_O ^ -1)) {
                var3 = 0;
                var4 = 0;
                var5 = null;
                var6 = 0;
                L2: while (true) {
                  if (((ui) this).field_n.length <= var6) {
                    if (1 != var4) {
                      var6 = 0;
                      L3: while (true) {
                        if (((ui) this).field_i.length <= var6) {
                          L4: {
                            ((ui) this).field_g = new fs[var4];
                            var6 = 0;
                            if (param1 > 23) {
                              break L4;
                            } else {
                              int discarded$1 = ui.a(116, -102, -108, -15);
                              break L4;
                            }
                          }
                          var7 = 0;
                          L5: while (true) {
                            if (((ui) this).field_i.length <= var7) {
                              return true;
                            } else {
                              if (((ui) this).field_n[var7] == var3) {
                                ((ui) this).field_g[var6] = ((ui) this).field_i[var7];
                                var6++;
                                var7++;
                                continue L5;
                              } else {
                                var7++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          if (((ui) this).field_n[var6] == var3) {
                            if (((ui) this).field_i[var6] == ((ui) this).field_l) {
                              ((ui) this).field_g = new fs[]{((ui) this).field_l};
                              return true;
                            } else {
                              var6++;
                              continue L3;
                            }
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      ((ui) this).field_g = new fs[]{var5_ref};
                      return true;
                    }
                  } else {
                    L6: {
                      if (var3 != ((ui) this).field_n[var6]) {
                        break L6;
                      } else {
                        var4++;
                        break L6;
                      }
                    }
                    if (var3 < ((ui) this).field_n[var6]) {
                      var4 = 1;
                      var5_ref = ((ui) this).field_i[var6];
                      var3 = ((ui) this).field_n[var6];
                      var6++;
                      continue L2;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              if ((param0.field_w & 1 << var3) != 0) {
                ((ui) this).field_n[var3] = -1;
                var3++;
                continue L1;
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4 = 16711935 & param0;
        param0 = param0 & 65280;
        if (param2 >= -77) {
            field_m = 86;
        }
        int var5 = param1 & 16711935;
        param1 = param1 & 65280;
        return param3 * param1 + (256 + -param3) * param0 >>> 1475739080 & -1778319616 | -352386817 & (-param3 + 256) * var4 - -(param3 * var5) >>> -1764240760;
    }

    final static String c(boolean param0) {
        if (param0) {
            field_p = 84;
        }
        return cg.field_F;
    }

    final void a(int param0, ob param1) {
        int var3 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var3 = 0; var3 < ((ui) this).field_n.length; var3++) {
            param1.c(((ui) this).field_n[var3], (byte) -105);
        }
        int var4 = -70 % ((param0 - -72) / 45);
    }

    final fs[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        fs[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            ((ui) this).field_n = null;
            break L0;
          }
        }
        if (((ui) this).field_g == null) {
          var2 = 0;
          var3 = 1;
          var4_int = 0;
          L1: while (true) {
            if (((ui) this).field_i.length <= var4_int) {
              var4 = new fs[var2];
              var8 = 0;
              var5 = var8;
              L2: while (true) {
                if (var8 >= ((ui) this).field_i.length) {
                  return var4;
                } else {
                  L3: {
                    stackOut_17_0 = ((ui) this).field_n[var8];
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (((ui) this).field_i[var8] != ((ui) this).field_l) {
                      stackOut_19_0 = stackIn_19_0;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L3;
                    } else {
                      stackOut_18_0 = stackIn_18_0;
                      stackOut_18_1 = ((ui) this).field_r;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L3;
                    }
                  }
                  var6 = stackIn_20_0 + stackIn_20_1;
                  if (var3 == var6) {
                    var2--;
                    var4[var2] = ((ui) this).field_i[var8];
                    var8++;
                    continue L2;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            } else {
              L4: {
                if (((ui) this).field_l != ((ui) this).field_i[var4_int]) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L4;
                } else {
                  stackOut_7_0 = ((ui) this).field_r;
                  stackIn_9_0 = stackOut_7_0;
                  break L4;
                }
              }
              L5: {
                var5 = stackIn_9_0 + ((ui) this).field_n[var4_int];
                if (var5 == var3) {
                  var2++;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var3 < var5) {
                var2 = 1;
                var3 = var5;
                var4_int++;
                continue L1;
              } else {
                var4_int++;
                continue L1;
              }
            }
          }
        } else {
          return ((ui) this).field_g;
        }
    }

    final void a(ob param0, byte param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != -109) {
            return;
        }
        for (var3 = 0; var3 < ((ui) this).field_n.length; var3++) {
            ((ui) this).field_n[var3] = param0.g(-2852);
        }
    }

    final void a(byte param0, dc param1, kq param2) {
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        qk[] var7_array = null;
        int var8_int = 0;
        fs[] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int[] var10 = null;
        int var11_int = 0;
        fs[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        fs var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        qk[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        var16 = param1.field_g.field_e[36].field_y;
        var28 = new int[((ui) this).field_i.length];
        var24 = var28;
        var20 = var24;
        var14 = var20;
        var5 = var14;
        var6 = 0;
        L0: while (true) {
          if (var6 >= var28.length) {
            var6 = 0;
            var29 = ((ui) this).field_n;
            var25 = var29;
            var21 = var25;
            var15 = var21;
            var13 = var15;
            var7 = var13;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= var29.length) {
                if (param0 < -9) {
                  L2: {
                    if ((var6 ^ -1) < -1) {
                      lh.a((byte) 84, var5, (int[]) ((ui) this).field_n.clone());
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var19 = new qk[3];
                    var7_array = var19;
                    var7_array[0] = new qk(0, 0, 182, rs.field_Cb.field_J, re.a(hr.field_d, 4371, new String[1]));
                    if (var16 == null) {
                      var7_array[1] = new qk(0, 0, 182, rs.field_Cb.field_J, cj.field_t);
                      var7_array[2] = new qk(0, 0, 182, rs.field_Cb.field_J, (String) null);
                      break L3;
                    } else {
                      var7_array[1] = new qk(0, 0, 182, rs.field_Cb.field_J, ms.field_h);
                      var7_array[2] = new qk(0, 0, 182, rs.field_Cb.field_J, var16.field_t, var16.field_k);
                      break L3;
                    }
                  }
                  var8 = new fs[((ui) this).field_i.length];
                  var31 = new int[((ui) this).field_i.length];
                  var27 = var31;
                  var23 = var27;
                  var18 = var23;
                  var9 = var18;
                  var30 = new int[((ui) this).field_i.length];
                  var26 = var30;
                  var22 = var26;
                  var17 = var22;
                  var10 = var17;
                  var11_int = 0;
                  L4: while (true) {
                    if (var11_int >= ((ui) this).field_i.length) {
                      L5: {
                        var11 = ((ui) this).b(0);
                        if (((ui) this).field_g != null) {
                          ((ui) this).field_r = 0;
                          break L5;
                        } else {
                          ((ui) this).field_r = 20 + -param1.field_O;
                          break L5;
                        }
                      }
                      param2.a(20, var8, var30, var31, var11, var19, (byte) -47, ((ui) this).field_r);
                      return;
                    } else {
                      L6: {
                        var8[var11_int] = ((ui) this).field_i[var28[var11_int]];
                        var9[var11_int] = ((ui) this).field_n[var28[var11_int]];
                        stackOut_16_0 = (int[]) var10;
                        stackOut_16_1 = var11_int;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (var16 != ((ui) this).field_i[var28[var11_int]]) {
                          stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          stackIn_19_2 = stackOut_18_2;
                          break L6;
                        } else {
                          stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_19_1 = stackOut_17_1;
                          stackIn_19_2 = stackOut_17_2;
                          break L6;
                        }
                      }
                      stackIn_19_0[stackIn_19_1] = stackIn_19_2;
                      var11_int++;
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                var9_int = var29[var8_int];
                var6 = var6 + var9_int;
                var8_int++;
                continue L1;
              }
            }
          } else {
            var28[var6] = var6;
            var6++;
            continue L0;
          }
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_q = null;
        if (param0 != -26088) {
            field_k = null;
        }
    }

    final static int a(int param0, byte param1, boolean param2, String param3, boolean param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_41_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = ShatteredPlansClient.field_F ? 1 : 0;
                        if (wg.field_f != null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (!ts.a(param2, -2)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return -1;
                    }
                    case 4: {
                        if (j.field_r == cs.field_j) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (!param2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var10 = null;
                        mq.field_c = dd.a(false, param3, (String) null, 4684, pd.field_l);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        mq.field_c = aj.a(param5, false, false, param3);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        js.field_f.field_j = 0;
                        js.field_f.c(14, (byte) -80);
                        js.field_f.c(mq.field_c.a((byte) -73).field_d, (byte) -68);
                        d.a(-1, (byte) 82);
                        cs.field_j = ti.field_i;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (ti.field_i == cs.field_j) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (es.a(-90, 1)) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = sa.field_a.j(-92);
                        sa.field_a.field_j = 0;
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        cs.field_j = qq.field_m;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        ej.field_e = var6;
                        cs.field_j = fs.field_l;
                        rr.field_t = -1;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (qq.field_m != cs.field_j) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (es.a(-91, 8)) {
                            statePc = 20;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        w.field_I = sa.field_a.d(110);
                        sa.field_a.field_j = 0;
                        gi.a(param0, param2, param4, -84, mq.field_c);
                        cs.field_j = ti.field_d;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (ti.field_d != cs.field_j) {
                            statePc = 31;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (es.a(119, 1)) {
                            statePc = 24;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        var6 = sa.field_a.j(-63);
                        fr.field_H = null;
                        sa.field_a.field_j = 0;
                        ej.field_e = var6;
                        if (var6 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (var6 != 1) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        cs.field_j = sh.field_c;
                        rr.field_t = -1;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 28: {
                        if (var6 != 8) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        q.g(-118);
                        ke.field_j = false;
                        return var6;
                    }
                    case 30: {
                        rr.field_t = -1;
                        cs.field_j = fs.field_l;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (sh.field_c == cs.field_j) {
                            statePc = 33;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        if (uc.d((byte) -46)) {
                            statePc = 35;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        pd.field_l = sa.field_a.d(46);
                        di.field_q = param3;
                        bs.field_b = sa.field_a.j(-85);
                        jd.field_i = sa.field_a.j(-89);
                        es.field_m = sa.field_a.f(-20976);
                        var6_ref = sa.field_a.i(1910283844);
                        var7 = sa.field_a.j(-123);
                        if (-1 != (var7 & 1 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        ij.a(24);
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (0 == (16 & var7)) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        stackOut_39_0 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 40: {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        va.field_j = stackIn_41_0 != 0;
                        if (param2) {
                            statePc = 53;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        if ((4 & var7) == 0) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        stackOut_43_0 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 44: {
                        stackOut_44_0 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        si.field_v = stackIn_45_0 != 0;
                        if (-1 == (var7 & 8 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        stackOut_46_0 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 47: {
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        bg.field_g = stackIn_48_0 != 0;
                        if ((2 & var7) == 0) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        stackOut_49_0 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 50: {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        ae.field_b = stackIn_51_0 != 0;
                        if (!bg.field_g) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        ae.field_b = true;
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (!ka.field_a) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        int discarded$12 = sa.field_a.j(-66);
                        int discarded$13 = sa.field_a.j(-102);
                        int discarded$14 = sa.field_a.a(16711680);
                        ir.field_E = sa.field_a.f(-20976);
                        k.field_c = new byte[ir.field_E];
                        var8 = 0;
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        if (ir.field_E <= var8) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        k.field_c[var8] = sa.field_a.g(-2852);
                        var8++;
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 57: {
                        ln.field_o = sa.field_a.e(-1);
                        var11 = (CharSequence) (Object) ln.field_o;
                        ci.field_d = ji.a(var11, true);
                        tf.field_n = sa.field_a.j(-112);
                        cs.field_j = ih.field_f;
                        if (mq.field_c.a((byte) 115) != hg.field_u) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        og.field_b.a(kq.f((byte) 127), true);
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 59: {
                        if (mq.field_c.a((byte) 123) != oi.field_b) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        dm.field_f.a(kq.f((byte) 126), true);
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        ke.field_j = false;
                        if (var6_ref == null) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        jf.a(-25602, var6_ref, kq.f((byte) 125));
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        if ((es.field_m ^ -1) < -1) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        if (si.field_v) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        try {
                            Object discarded$15 = ll.a("unzap", kq.f((byte) 127), (byte) 121);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        var8_ref_Throwable = caughtException;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 69: {
                        try {
                            Object discarded$16 = ll.a(kq.f((byte) 125), "zap", new Object[1], -116);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        var8_ref_Throwable = caughtException;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        if (es.field_m >= -1) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        db.field_b = true;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        js.field_f.a(qn.field_b, (byte) -77);
                        var8 = 0;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        if (-5 <= var8) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        qn.field_b[var8] = qn.field_b[var8] + 50;
                        var8++;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 77: {
                        sa.field_a.a(qn.field_b, (byte) 107);
                        return ej.field_e;
                    }
                    case 78: {
                        if (cs.field_j != fs.field_l) {
                            statePc = 87;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        if (!uc.d((byte) -33)) {
                            statePc = 87;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        q.g(-114);
                        if (ej.field_e != 7) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        if (ke.field_j) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        ke.field_j = true;
                        return -1;
                    }
                    case 83: {
                        if (ej.field_e == 7) {
                            statePc = 85;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        ej.field_e = 3;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 86: {
                        nl.field_c = sa.field_a.e(-1);
                        ke.field_j = false;
                        return ej.field_e;
                    }
                    case 87: {
                        if (param1 <= -48) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        int discarded$17 = ui.a(-26, -48, -112, -53);
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        if (wg.field_f != null) {
                            statePc = 96;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        if (ke.field_j) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        var6 = of.field_f;
                        of.field_f = bb.field_c;
                        ke.field_j = true;
                        bb.field_c = var6;
                        statePc = 96;
                        continue stateLoop;
                    }
                    case 92: {
                        if (-30001L <= (wh.a(18) ^ -1L)) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        nl.field_c = gq.field_f;
                        statePc = 95;
                        continue stateLoop;
                    }
                    case 94: {
                        nl.field_c = wb.field_d;
                        statePc = 95;
                        continue stateLoop;
                    }
                    case 95: {
                        ke.field_j = false;
                        return 3;
                    }
                    case 96: {
                        return -1;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ui(fs[] param0) {
        super(param0);
        ((ui) this).field_n = new int[((ui) this).field_i.length];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Projected winner.";
        field_k = "(1 player wants to join)";
    }
}
