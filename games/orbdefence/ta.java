/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ta extends pj implements c {
    static int field_z;
    im field_x;
    static String field_y;

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, pj param6) {
        int var10 = OrbDefence.field_D ? 1 : 0;
        km var8 = new km(((ta) this).field_x);
        pj var9 = (pj) (Object) var8.d(27935);
        while (var9 != null) {
            // ifeq L90
            if (var9.d(-81)) {
                if (var9.a(false, param1, param2, param3, param4, param5, param6)) {
                    return true;
                }
            }
            var9 = (pj) (Object) var8.b(true);
        }
        if (param0) {
            ((ta) this).field_x = null;
            return false;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(0);
    }

    final static void a(int param0, kc param1, kc param2, int param3) {
        vi.field_I = param3;
        jd.field_a = param1;
        ck.field_g = param2;
        jk.b(ul.field_l / 2, ul.field_f / 2, param0 ^ 249);
        if (param0 != 0) {
            return;
        }
        nc.a(param0 + 125, param2.field_E, param1.field_E + param1.field_B, param1.field_E, param2.field_E - -param2.field_B);
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        int var7 = 0;
        int var8 = OrbDefence.field_D ? 1 : 0;
        km var10 = new km(((ta) this).field_x);
        if (param1 != 954) {
            Object var9 = null;
            boolean discarded$0 = ((ta) this).b((pj) null, true);
        }
        pj var6 = (pj) (Object) var10.d(param1 ^ 28325);
        while (var6 != null) {
            StringBuilder discarded$1 = param0.append(10);
            for (var7 = 0; param3 >= var7; var7++) {
                StringBuilder discarded$2 = param0.append(32);
            }
            StringBuilder discarded$3 = var6.a((byte) -34, param2, 1 + param3, param0);
            var6 = (pj) (Object) var10.b(true);
        }
    }

    public static void c(byte param0) {
        field_y = null;
        int var1 = -50 / ((param0 - 17) / 61);
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = OrbDefence.field_D ? 1 : 0;
        km var8 = new km(((ta) this).field_x);
        if (param0 >= -115) {
            String discarded$0 = ((ta) this).g(5);
        }
        pj var9 = (pj) (Object) var8.d(27935);
        while (var9 != null) {
            // ifeq L110
            if (!(!var9.a((byte) -124, param1, param2, param3 - -((ta) this).field_s, param4, param5, ((ta) this).field_n + param6))) {
                return true;
            }
            var9 = (pj) (Object) var8.b(true);
        }
        return false;
    }

    final int f(int param0) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var2 = 0;
        km var3 = new km(((ta) this).field_x);
        pj var4 = (pj) (Object) var3.d(27935);
        while (var4 != null) {
            var5 = var4.f(-20598);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (pj) (Object) var3.b(true);
        }
        if (param0 != -20598) {
            ((ta) this).field_x = null;
        }
        return var2;
    }

    final String g(int param0) {
        String var4 = null;
        int var5 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(((ta) this).field_x);
        pj var3 = (pj) (Object) var2.d(27935);
        while (var3 != null) {
            var4 = var3.g(-8235);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (pj) (Object) var2.b(true);
        }
        if (param0 == -8235) {
            return null;
        }
        field_z = 53;
        return null;
    }

    final boolean d(int param0) {
        if (param0 != -81) {
            field_z = 68;
        }
        return ((ta) this).b((byte) -109) != null ? true : false;
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((ta) this).a(9882, param3, param2, param1)) {
            ((ta) this).a(param2, (byte) -119, param1, param3);
            this.a(param3, 954, param1, param2);
        }
        if (param0 >= -23) {
            return null;
        }
        return param3;
    }

    final static void j(int param0) {
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        hj var1 = new hj(540, 140);
        de.a(-128, var1);
        wi.c();
        ul.d();
        ji.field_b = 0;
        bj.j(92);
        hj var2 = var1.f();
        for (var3 = param0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            ul.e(4, 4, 0, 0, 540, 140);
        }
        jc.field_k.d();
        var1.d(0, 0);
        oc.g((byte) -105);
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = OrbDefence.field_D ? 1 : 0;
        if (param2 != 1048575) {
            Object var8 = null;
            boolean discarded$0 = ((ta) this).a(68, (pj) null);
        }
        if (0 == param1) {
            if (!(((ta) this).field_j == null)) {
                ((ta) this).field_j.a(param0, param3, (pj) this, -4394, true);
            }
        }
        km var5 = new km(((ta) this).field_x);
        pj var6 = (pj) (Object) var5.c(-7651);
        while (var6 != null) {
            var6.a(param0 - -((ta) this).field_n, param1, param2 ^ 0, param3 + ((ta) this).field_s);
            var6 = (pj) (Object) var5.a((byte) -116);
        }
    }

    pj b(byte param0) {
        km var2 = null;
        pj var3 = null;
        int var4 = 0;
        L0: {
          var4 = OrbDefence.field_D ? 1 : 0;
          var2 = new km(((ta) this).field_x);
          if (param0 == -109) {
            break L0;
          } else {
            field_z = -74;
            break L0;
          }
        }
        var3 = (pj) (Object) var2.d(param0 + 28044);
        L1: while (true) {
          if (var3 != null) {
            if (var3.d(-81)) {
              return var3;
            } else {
              var3 = (pj) (Object) var2.b(true);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(pj param0, boolean param1) {
        km var5 = null;
        pj var6 = null;
        int var7 = OrbDefence.field_D ? 1 : 0;
        if (((ta) this).field_x.c(-3088)) {
            return false;
        }
        km var3 = new km(((ta) this).field_x);
        if (param1) {
            field_y = null;
        }
        pj var4 = (pj) (Object) var3.c(-7651);
        while (var4 != null) {
            if (var4.d(-81)) {
                var5 = new km(((ta) this).field_x);
                ca discarded$0 = var5.b((ca) (Object) var4, (byte) -120);
                var6 = (pj) (Object) var5.a((byte) -81);
                while (var6 != null) {
                    if (!(!var6.a(-81, param0))) {
                        return true;
                    }
                    var6 = (pj) (Object) var5.a((byte) -114);
                }
            }
            var4 = (pj) (Object) var3.a((byte) -113);
        }
        return false;
    }

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        int var9 = OrbDefence.field_D ? 1 : 0;
        km var7 = new km(((ta) this).field_x);
        if (param2 >= -91) {
            return;
        }
        pj var8 = (pj) (Object) var7.d(27935);
        while (var8 != null) {
            // ifeq L91
            var8.a(((ta) this).field_n + param0, param1, (byte) -98, param3, param4 + ((ta) this).field_s, param5);
            var8 = (pj) (Object) var7.b(true);
        }
    }

    final static void a(int param0, wd param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        fa var21 = null;
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
        wd var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        fa stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        short stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        fa stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          L1: {
            var40 = OrbDefence.field_D ? 1 : 0;
            var45 = param1;
            if (var45.field_t == null) {
              break L1;
            } else {
              if (-2 > (var45.field_m ^ -1)) {
                var62 = var45.field_t;
                li.a(0, 0, ji.field_a, -86, var62);
                break L0;
              } else {
                break L1;
              }
            }
          }
          fg.b((byte) 88);
          break L0;
        }
        var66 = new int[param1.field_w];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param1.field_w];
        var64 = ee.field_g;
        if (param7 == 23) {
          var63 = cf.field_e;
          var65 = ue.field_H;
          var13 = 0;
          L2: while (true) {
            if (var13 >= param1.field_w) {
              var44 = 0;
              var13 = var44;
              L3: while (true) {
                if (var44 >= fg.field_u) {
                  return;
                } else {
                  L4: {
                    var14 = dm.field_g[var44];
                    var15 = param1.field_M[var14];
                    var16 = param1.field_e[var14];
                    var17 = param1.field_l[var14];
                    if (ee.field_g.length <= param1.field_q[var14]) {
                      stackOut_25_0 = -1;
                      stackIn_26_0 = stackOut_25_0;
                      break L4;
                    } else {
                      stackOut_24_0 = param1.field_q[var14];
                      stackIn_26_0 = stackOut_24_0;
                      break L4;
                    }
                  }
                  L5: {
                    var18 = stackIn_26_0;
                    if (param1.field_y[var14] >= ee.field_g.length) {
                      stackOut_28_0 = -1;
                      stackIn_29_0 = stackOut_28_0;
                      break L5;
                    } else {
                      stackOut_27_0 = param1.field_y[var14];
                      stackIn_29_0 = stackOut_27_0;
                      break L5;
                    }
                  }
                  L6: {
                    var19 = stackIn_29_0;
                    if (param1.field_i[var14] < ee.field_g.length) {
                      stackOut_31_0 = param1.field_i[var14];
                      stackIn_32_0 = stackOut_31_0;
                      break L6;
                    } else {
                      stackOut_30_0 = -1;
                      stackIn_32_0 = stackOut_30_0;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var20 = stackIn_32_0;
                      if (null == cg.field_c) {
                        break L8;
                      } else {
                        if (param1.field_N == null) {
                          break L8;
                        } else {
                          if (var14 >= param1.field_N.length) {
                            break L8;
                          } else {
                            if (0 == (param1.field_N[var14] ^ -1)) {
                              break L8;
                            } else {
                              if (param1.field_N[var14] >= cg.field_c.length) {
                                break L8;
                              } else {
                                stackOut_37_0 = cg.field_c[param1.field_N[var14]];
                                stackIn_39_0 = stackOut_37_0;
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_38_0 = null;
                    stackIn_39_0 = (fa) (Object) stackOut_38_0;
                    break L7;
                  }
                  L9: {
                    var21 = stackIn_39_0;
                    var22 = a.field_t[var15];
                    var23 = ph.field_x[var15];
                    var24 = a.field_t[var16];
                    var25 = ph.field_x[var16];
                    var26 = a.field_t[var17];
                    var27 = ph.field_x[var17];
                    if (var18 != var19) {
                      break L9;
                    } else {
                      if (var19 == var20) {
                        L10: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21 != null) {
                            stackOut_48_0 = var21.field_d;
                            stackIn_49_0 = stackOut_48_0;
                            break L10;
                          } else {
                            stackOut_47_0 = 8355711;
                            stackIn_49_0 = stackOut_47_0;
                            break L10;
                          }
                        }
                        var30 = stackIn_49_0;
                        var31 = 16711935 & var30;
                        var32 = var30 & 65280;
                        var33 = (var28 * var32 & 16711902) >>> 1346703240 | var31 * var28 >>> 1930425640 & 1878982911;
                        var33 = var33 + 65793 * var29;
                        gi.a((var33 & 16711422) >> 408601217, var27, var26, var23, param7 ^ -35, var24, var25, var22);
                        var44++;
                        continue L3;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    var28 = var66[var18];
                    var29 = var66[var19];
                    var30 = var66[var20];
                    var31 = var67[var18];
                    var32 = var67[var19];
                    var33 = var67[var20];
                    if (var21 != null) {
                      stackOut_44_0 = var21.field_d;
                      stackIn_45_0 = stackOut_44_0;
                      break L11;
                    } else {
                      stackOut_43_0 = 8355711;
                      stackIn_45_0 = stackOut_43_0;
                      break L11;
                    }
                  }
                  var34 = stackIn_45_0;
                  var35 = 16711935 & var34;
                  var36 = var34 & 65280;
                  var37 = (-16711738 & var35 * var28) >>> 545947272 | (var36 * var28 & 16711772) >>> 543389288;
                  var38 = (-16711687 & var35 * var29) >>> -1576868024 | (var29 * var36 & 16711710) >>> -434190360;
                  var39 = (var30 * var36 & 16711926) >>> -839523352 | (var30 * var35 & -16711931) >>> 2036162024;
                  var38 = var38 + var32 * 65793;
                  var37 = var37 + 65793 * var31;
                  var39 = var39 + var33 * 65793;
                  dd.a(var37 >> -1355113880 & 255, var37 >> 958646480, var38 >> -253415440, 255 & var37, (65431 & var38) >> -293186072, var27, var23, var26, var38 & 255, var24, false, 255 & var39, var39 >> 1565801776, (var39 & 65535) >> -1112320664, var25, var22);
                  var44++;
                  continue L3;
                }
              }
            } else {
              L12: {
                var14 = param0 * var63[var13] + param6 * var64[var13] - -(var65[var13] * param3) >> -1336036856;
                if ((var14 ^ -1) > -1) {
                  var14 = -var14;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if ((var14 ^ -1) > -1) {
                  stackOut_16_0 = 128;
                  stackIn_17_0 = stackOut_16_0;
                  break L13;
                } else {
                  if (var14 >= 128) {
                    stackOut_15_0 = 256;
                    stackIn_17_0 = stackOut_15_0;
                    break L13;
                  } else {
                    stackOut_14_0 = var14 + 128;
                    stackIn_17_0 = stackOut_14_0;
                    break L13;
                  }
                }
              }
              L14: {
                var14 = stackIn_17_0;
                var15 = param4 * var65[var13] + (var64[var13] * param2 - -(param5 * var63[var13])) >> -1046300664;
                stackOut_17_0 = dk.field_c;
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (-1 >= (var15 ^ -1)) {
                  stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                  stackOut_19_1 = var15;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L14;
                } else {
                  stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                  stackOut_18_1 = -var15;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  break L14;
                }
              }
              var15 = stackIn_20_0[stackIn_20_1];
              var14 = (-var15 + 256) * var14 >>> 746786504;
              var66[var13] = var14;
              var67[var13] = var15;
              var13++;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final void a(pj param0, byte param1) {
        if (param1 != 74) {
            Object var4 = null;
            boolean discarded$0 = ((ta) this).a((pj) null, true);
        }
        ((ta) this).field_x.a(-100, (ca) (Object) param0);
    }

    private final void i(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 0) {
            return;
        }
        km var2 = new km(((ta) this).field_x);
        pj var3 = (pj) (Object) var2.d(param0 + 27935);
        while (var3 != null) {
            var3.c(param0 ^ -26385);
            var3 = (pj) (Object) var2.b(true);
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        int var7 = OrbDefence.field_D ? 1 : 0;
        super.a(param0, param1, param2, param3);
        km var5 = new km(((ta) this).field_x);
        pj var6 = (pj) (Object) var5.d(27935);
        while (var6 != null) {
            // ifeq L90
            var6.a((byte) -77, param1, param2 - -((ta) this).field_s, ((ta) this).field_n + param3);
            var6 = (pj) (Object) var5.b(true);
        }
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        int var7 = OrbDefence.field_D ? 1 : 0;
        km var10 = new km(((ta) this).field_x);
        pj var9 = (pj) (Object) var10.d(27935);
        while (var9 != null) {
            // ifeq L86
            if (var9.d(-81)) {
                if (!(!var9.a(param0, param1, param2, 0))) {
                    return true;
                }
            }
            var9 = (pj) (Object) var10.b(true);
        }
        int var6 = param1;
        if (!(-81 != (var6 ^ -1))) {
            return ek.field_a[81] ? ((ta) this).a(param2, false) : ((ta) this).b(param2, false);
        }
        if (param3 != 0) {
            Object var8 = null;
            ta.a(5, (kc) null, (kc) null, -95);
        }
        return false;
    }

    final boolean a(int param0, pj param1) {
        int var5 = OrbDefence.field_D ? 1 : 0;
        km var3 = new km(((ta) this).field_x);
        if (param0 != -81) {
            Object var6 = null;
            ((ta) this).a(-83, 78, (byte) -38, (pj) null, 11, -89);
        }
        pj var4 = (pj) (Object) var3.d(27935);
        while (var4 != null) {
            if (var4.a(param0 + 0, param1)) {
                return true;
            }
            var4 = (pj) (Object) var3.b(true);
        }
        return false;
    }

    ta(int param0, int param1, int param2, int param3, td param4) {
        super(param0, param1, param2, param3, param4, (ag) null);
        ((ta) this).field_x = new im();
    }

    final void h(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 0) {
            return;
        }
        km var2 = new km(((ta) this).field_x);
        pj var3 = (pj) (Object) var2.d(27935);
        while (var3 != null) {
            var3.h(param0 ^ 0);
            var3 = (pj) (Object) var2.b(true);
        }
    }

    final boolean b(pj param0, boolean param1) {
        km var5 = null;
        pj var6 = null;
        int var7 = OrbDefence.field_D ? 1 : 0;
        if (param1) {
            this.i(24);
        }
        if (((ta) this).field_x.c(-3088)) {
            return false;
        }
        km var3 = new km(((ta) this).field_x);
        pj var4 = (pj) (Object) var3.d(27935);
        while (var4 != null) {
            if (var4.d(-81)) {
                var5 = new km(((ta) this).field_x);
                ca discarded$0 = var5.a((ca) (Object) var4, (byte) -1);
                var6 = (pj) (Object) var5.b(true);
                while (var6 != null) {
                    if (!(!var6.a(-81, param0))) {
                        return true;
                    }
                    var6 = (pj) (Object) var5.b(true);
                }
            }
            var4 = (pj) (Object) var3.b(true);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
