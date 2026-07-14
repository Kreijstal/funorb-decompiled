/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends dm {
    private boolean field_s;
    static ba field_q;
    static hj[] field_o;
    private int field_j;
    static int field_k;
    private int field_r;
    static int field_p;
    private int field_n;
    static mi field_u;
    private String field_t;
    private int field_l;
    private kc field_h;
    static String field_m;
    private int field_i;

    final static qg b(boolean param0) {
        qg var1 = null;
        if (!param0) {
          bd.c(-19);
          var1 = new qg(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], fl.field_a[0], vc.field_g);
          md.a((byte) -128);
          return var1;
        } else {
          var1 = new qg(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], fl.field_a[0], vc.field_g);
          md.a((byte) -128);
          return var1;
        }
    }

    final void a(int param0, kc param1, int param2, String param3, int param4) {
        ed var8 = null;
        ed var10 = null;
        ed var11 = null;
        ed var12 = null;
        if (param3 == null) {
          ((bd) this).field_c = null;
          return;
        } else {
          if (param1 == ((bd) this).field_h) {
            if (((bd) this).field_s) {
              L0: {
                if (2 != ((bd) this).field_l) {
                  break L0;
                } else {
                  if (((bd) this).field_t == null) {
                    break L0;
                  } else {
                    if (!((bd) this).field_t.equals((Object) (Object) param3)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((bd) this).field_h = param1;
              ((bd) this).field_l = 2;
              if (param2 <= 74) {
                return;
              } else {
                ((bd) this).field_t = param3;
                ((bd) this).field_s = true;
                var8 = this.a((byte) 121, param4, param3, param1);
                var12 = var8;
                var12.field_g[0] = -param1.a(param3) + param0;
                var12.field_g[param3.length()] = param0;
                ll.a(var12, 0, param3, param1, 404465128);
                return;
              }
            } else {
              ((bd) this).field_h = param1;
              ((bd) this).field_l = 2;
              if (param2 <= 74) {
                return;
              } else {
                ((bd) this).field_t = param3;
                ((bd) this).field_s = true;
                var8 = this.a((byte) 121, param4, param3, param1);
                var11 = var8;
                var11.field_g[0] = -param1.a(param3) + param0;
                var11.field_g[param3.length()] = param0;
                ll.a(var11, 0, param3, param1, 404465128);
                return;
              }
            }
          } else {
            ((bd) this).field_h = param1;
            ((bd) this).field_l = 2;
            if (param2 <= 74) {
              return;
            } else {
              ((bd) this).field_t = param3;
              ((bd) this).field_s = true;
              var8 = this.a((byte) 121, param4, param3, param1);
              var10 = var8;
              var10.field_g[0] = -param1.a(param3) + param0;
              var10.field_g[param3.length()] = param0;
              ll.a(var10, 0, param3, param1, 404465128);
              return;
            }
          }
        }
    }

    final void a(int param0, String param1, int param2, int param3, kc param4) {
        int var7 = 0;
        ed var10 = null;
        ed var11 = null;
        ed var12 = null;
        ed var13 = null;
        ed var14 = null;
        ed var15 = null;
        ed var16 = null;
        ed var17 = null;
        if (param1 != null) {
          if (param4 == ((bd) this).field_h) {
            if (((bd) this).field_s) {
              if (((bd) this).field_l == 0) {
                if (((bd) this).field_t != null) {
                  if (!((bd) this).field_t.equals((Object) (Object) param1)) {
                    ((bd) this).field_l = 0;
                    ((bd) this).field_t = param1;
                    ((bd) this).field_h = param4;
                    ((bd) this).field_s = true;
                    var14 = this.a((byte) 110, param3, param1, param4);
                    var15 = var14;
                    var7 = -66 / ((8 - param2) / 61);
                    var14.field_g[0] = param0;
                    var15.field_g[param1.length()] = param4.a(param1) + param0;
                    ll.a(var15, 0, param1, param4, 404465128);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((bd) this).field_l = 0;
                  ((bd) this).field_t = param1;
                  ((bd) this).field_h = param4;
                  ((bd) this).field_s = true;
                  var16 = this.a((byte) 110, param3, param1, param4);
                  var17 = var16;
                  var7 = -66 / ((8 - param2) / 61);
                  var16.field_g[0] = param0;
                  var17.field_g[param1.length()] = param4.a(param1) + param0;
                  ll.a(var17, 0, param1, param4, 404465128);
                  return;
                }
              } else {
                ((bd) this).field_l = 0;
                ((bd) this).field_t = param1;
                ((bd) this).field_h = param4;
                ((bd) this).field_s = true;
                var16 = this.a((byte) 110, param3, param1, param4);
                var17 = var16;
                var7 = -66 / ((8 - param2) / 61);
                var16.field_g[0] = param0;
                var17.field_g[param1.length()] = param4.a(param1) + param0;
                ll.a(var17, 0, param1, param4, 404465128);
                return;
              }
            } else {
              ((bd) this).field_l = 0;
              ((bd) this).field_t = param1;
              ((bd) this).field_h = param4;
              ((bd) this).field_s = true;
              var12 = this.a((byte) 110, param3, param1, param4);
              var13 = var12;
              var7 = -66 / ((8 - param2) / 61);
              var12.field_g[0] = param0;
              var13.field_g[param1.length()] = param4.a(param1) + param0;
              ll.a(var13, 0, param1, param4, 404465128);
              return;
            }
          } else {
            ((bd) this).field_l = 0;
            ((bd) this).field_t = param1;
            ((bd) this).field_h = param4;
            ((bd) this).field_s = true;
            var10 = this.a((byte) 110, param3, param1, param4);
            var11 = var10;
            var7 = -66 / ((8 - param2) / 61);
            var10.field_g[0] = param0;
            var11.field_g[param1.length()] = param4.a(param1) + param0;
            ll.a(var11, 0, param1, param4, 404465128);
            return;
          }
        } else {
          ((bd) this).field_c = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, String param3, kc param4) {
        int var7 = 0;
        ed var9 = null;
        ed var10 = null;
        ed var11 = null;
        ed var12 = null;
        ed var13 = null;
        if (param3 != null) {
          if (param2 > 31) {
            if (param4 == ((bd) this).field_h) {
              if (((bd) this).field_s) {
                if (-2 == (((bd) this).field_l ^ -1)) {
                  if (null != ((bd) this).field_t) {
                    if (!((bd) this).field_t.equals((Object) (Object) param3)) {
                      ((bd) this).field_l = 1;
                      ((bd) this).field_s = true;
                      ((bd) this).field_h = param4;
                      var12 = this.a((byte) 115, param1, param3, param4);
                      var7 = param4.a(param3);
                      var12.field_g[0] = param0 - (var7 >> -1905183167);
                      var12.field_g[param3.length()] = (var7 >> 2059093601) + param0;
                      ll.a(var12, 0, param3, param4, 404465128);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((bd) this).field_l = 1;
                    ((bd) this).field_s = true;
                    ((bd) this).field_h = param4;
                    var13 = this.a((byte) 115, param1, param3, param4);
                    var7 = param4.a(param3);
                    var13.field_g[0] = param0 - (var7 >> -1905183167);
                    var13.field_g[param3.length()] = (var7 >> 2059093601) + param0;
                    ll.a(var13, 0, param3, param4, 404465128);
                    return;
                  }
                } else {
                  ((bd) this).field_l = 1;
                  ((bd) this).field_s = true;
                  ((bd) this).field_h = param4;
                  var13 = this.a((byte) 115, param1, param3, param4);
                  var7 = param4.a(param3);
                  var13.field_g[0] = param0 - (var7 >> -1905183167);
                  var13.field_g[param3.length()] = (var7 >> 2059093601) + param0;
                  ll.a(var13, 0, param3, param4, 404465128);
                  return;
                }
              } else {
                ((bd) this).field_l = 1;
                ((bd) this).field_s = true;
                ((bd) this).field_h = param4;
                var13 = this.a((byte) 115, param1, param3, param4);
                var7 = param4.a(param3);
                var13.field_g[0] = param0 - (var7 >> -1905183167);
                var13.field_g[param3.length()] = (var7 >> 2059093601) + param0;
                ll.a(var13, 0, param3, param4, 404465128);
                return;
              }
            } else {
              ((bd) this).field_l = 1;
              ((bd) this).field_s = true;
              ((bd) this).field_h = param4;
              var13 = this.a((byte) 115, param1, param3, param4);
              var7 = param4.a(param3);
              var13.field_g[0] = param0 - (var7 >> -1905183167);
              var13.field_g[param3.length()] = (var7 >> 2059093601) + param0;
              ll.a(var13, 0, param3, param4, 404465128);
              return;
            }
          } else {
            ((bd) this).field_t = null;
            if (param4 == ((bd) this).field_h) {
              if (((bd) this).field_s) {
                if (-2 == (((bd) this).field_l ^ -1)) {
                  if (null != ((bd) this).field_t) {
                    if (((bd) this).field_t.equals((Object) (Object) param3)) {
                      return;
                    } else {
                      ((bd) this).field_l = 1;
                      ((bd) this).field_s = true;
                      ((bd) this).field_h = param4;
                      var11 = this.a((byte) 115, param1, param3, param4);
                      var7 = param4.a(param3);
                      var11.field_g[0] = param0 - (var7 >> -1905183167);
                      var11.field_g[param3.length()] = (var7 >> 2059093601) + param0;
                      ll.a(var11, 0, param3, param4, 404465128);
                      return;
                    }
                  } else {
                    ((bd) this).field_l = 1;
                    ((bd) this).field_s = true;
                    ((bd) this).field_h = param4;
                    var11 = this.a((byte) 115, param1, param3, param4);
                    var7 = param4.a(param3);
                    var11.field_g[0] = param0 - (var7 >> -1905183167);
                    var11.field_g[param3.length()] = (var7 >> 2059093601) + param0;
                    ll.a(var11, 0, param3, param4, 404465128);
                    return;
                  }
                } else {
                  ((bd) this).field_l = 1;
                  ((bd) this).field_s = true;
                  ((bd) this).field_h = param4;
                  var11 = this.a((byte) 115, param1, param3, param4);
                  var7 = param4.a(param3);
                  var11.field_g[0] = param0 - (var7 >> -1905183167);
                  var11.field_g[param3.length()] = (var7 >> 2059093601) + param0;
                  ll.a(var11, 0, param3, param4, 404465128);
                  return;
                }
              } else {
                ((bd) this).field_l = 1;
                ((bd) this).field_s = true;
                ((bd) this).field_h = param4;
                var10 = this.a((byte) 115, param1, param3, param4);
                var7 = param4.a(param3);
                var10.field_g[0] = param0 - (var7 >> -1905183167);
                var10.field_g[param3.length()] = (var7 >> 2059093601) + param0;
                ll.a(var10, 0, param3, param4, 404465128);
                return;
              }
            } else {
              ((bd) this).field_l = 1;
              ((bd) this).field_s = true;
              ((bd) this).field_h = param4;
              var9 = this.a((byte) 115, param1, param3, param4);
              var7 = param4.a(param3);
              var9.field_g[0] = param0 - (var7 >> -1905183167);
              var9.field_g[param3.length()] = (var7 >> 2059093601) + param0;
              ll.a(var9, 0, param3, param4, 404465128);
              return;
            }
          }
        } else {
          ((bd) this).field_c = null;
          return;
        }
    }

    final void a(int param0, String param1, int param2, kc param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var15 = 0;
        String[] var16 = null;
        String[] var18 = null;
        String[] var19 = null;
        String var20 = null;
        ed var21 = null;
        String[] var22 = null;
        String[] var23 = null;
        String var24 = null;
        ed var25 = null;
        String var32 = null;
        ed var33 = null;
        String var38 = null;
        ed var39 = null;
        String var40 = null;
        ed var41 = null;
        String var42 = null;
        ed var43 = null;
        ed stackIn_32_0 = null;
        ed stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        ed stackIn_33_0 = null;
        ed stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        ed stackIn_34_0 = null;
        ed stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        ed stackIn_36_0 = null;
        ed stackIn_37_0 = null;
        ed stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        ed stackIn_56_0 = null;
        ed stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        ed stackIn_57_0 = null;
        ed stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        ed stackIn_58_0 = null;
        ed stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        int stackIn_58_4 = 0;
        ed stackIn_60_0 = null;
        ed stackIn_61_0 = null;
        ed stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        ed stackIn_72_0 = null;
        ed stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        ed stackIn_73_0 = null;
        ed stackIn_73_1 = null;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        ed stackIn_74_0 = null;
        ed stackIn_74_1 = null;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        int stackIn_74_4 = 0;
        ed stackIn_76_0 = null;
        ed stackIn_77_0 = null;
        ed stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        ed stackIn_86_0 = null;
        ed stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        ed stackIn_87_0 = null;
        ed stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        ed stackIn_88_0 = null;
        ed stackIn_88_1 = null;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        int stackIn_88_4 = 0;
        ed stackIn_90_0 = null;
        ed stackIn_91_0 = null;
        ed stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        ed stackIn_98_0 = null;
        ed stackIn_98_1 = null;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        ed stackIn_99_0 = null;
        ed stackIn_99_1 = null;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        ed stackIn_100_0 = null;
        ed stackIn_100_1 = null;
        int stackIn_100_2 = 0;
        int stackIn_100_3 = 0;
        int stackIn_100_4 = 0;
        ed stackIn_102_0 = null;
        ed stackIn_103_0 = null;
        ed stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        ed stackIn_112_0 = null;
        ed stackIn_112_1 = null;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        ed stackIn_113_0 = null;
        ed stackIn_113_1 = null;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        ed stackIn_114_0 = null;
        ed stackIn_114_1 = null;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        int stackIn_114_4 = 0;
        ed stackIn_116_0 = null;
        ed stackIn_117_0 = null;
        ed stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        ed stackOut_31_0 = null;
        ed stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        ed stackOut_33_0 = null;
        ed stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        ed stackOut_32_0 = null;
        ed stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        ed stackOut_35_0 = null;
        ed stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        ed stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        ed stackOut_55_0 = null;
        ed stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        ed stackOut_57_0 = null;
        ed stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        ed stackOut_56_0 = null;
        ed stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        int stackOut_56_4 = 0;
        ed stackOut_59_0 = null;
        ed stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        ed stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        ed stackOut_111_0 = null;
        ed stackOut_111_1 = null;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        ed stackOut_113_0 = null;
        ed stackOut_113_1 = null;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        ed stackOut_112_0 = null;
        ed stackOut_112_1 = null;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        int stackOut_112_4 = 0;
        ed stackOut_115_0 = null;
        ed stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        ed stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        ed stackOut_97_0 = null;
        ed stackOut_97_1 = null;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        ed stackOut_99_0 = null;
        ed stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        int stackOut_99_3 = 0;
        int stackOut_99_4 = 0;
        ed stackOut_98_0 = null;
        ed stackOut_98_1 = null;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        int stackOut_98_4 = 0;
        ed stackOut_101_0 = null;
        ed stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        ed stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        ed stackOut_85_0 = null;
        ed stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        ed stackOut_87_0 = null;
        ed stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        int stackOut_87_4 = 0;
        ed stackOut_86_0 = null;
        ed stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int stackOut_86_4 = 0;
        ed stackOut_89_0 = null;
        ed stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        ed stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        ed stackOut_71_0 = null;
        ed stackOut_71_1 = null;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        ed stackOut_73_0 = null;
        ed stackOut_73_1 = null;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        int stackOut_73_4 = 0;
        ed stackOut_72_0 = null;
        ed stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        int stackOut_72_4 = 0;
        ed stackOut_75_0 = null;
        ed stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        ed stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        L0: {
          var15 = OrbDefence.field_D ? 1 : 0;
          if (param6 == param0) {
            param6 = param3.field_z;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == null) {
          ((bd) this).field_c = null;
          return;
        } else {
          L1: {
            if (param3 != ((bd) this).field_h) {
              break L1;
            } else {
              if (((bd) this).field_s) {
                break L1;
              } else {
                if (param2 != ((bd) this).field_l) {
                  break L1;
                } else {
                  if (((bd) this).field_r != param7) {
                    break L1;
                  } else {
                    if (((bd) this).field_j != param6) {
                      break L1;
                    } else {
                      if (param5 != ((bd) this).field_i) {
                        break L1;
                      } else {
                        if (param4 != ((bd) this).field_n) {
                          break L1;
                        } else {
                          if (null == ((bd) this).field_t) {
                            break L1;
                          } else {
                            if (!((bd) this).field_t.equals((Object) (Object) param1)) {
                              L2: {
                                ((bd) this).field_t = param1;
                                ((bd) this).field_j = param6;
                                ((bd) this).field_n = param4;
                                ((bd) this).field_i = param5;
                                ((bd) this).field_s = false;
                                ((bd) this).field_h = param3;
                                ((bd) this).field_r = param7;
                                ((bd) this).field_l = param2;
                                var19 = new String[1 + param3.b(param1, param4)];
                                var16 = var19;
                                var18 = var19;
                                var10 = Math.max(1, param3.a(param1, new int[1], var18));
                                if ((((bd) this).field_r ^ -1) != -4) {
                                  break L2;
                                } else {
                                  if (var10 == 1) {
                                    ((bd) this).field_r = 1;
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              L3: {
                                ((bd) this).field_c = new ed[var10];
                                if (0 != ((bd) this).field_r) {
                                  if (((bd) this).field_r != 1) {
                                    if (2 == ((bd) this).field_r) {
                                      var11 = ((bd) this).field_i - param3.field_B + -(var10 * ((bd) this).field_j);
                                      break L3;
                                    } else {
                                      L4: {
                                        var12 = (-(var10 * ((bd) this).field_j) + ((bd) this).field_i) / (var10 + 1);
                                        if (var12 >= 0) {
                                          break L4;
                                        } else {
                                          var12 = 0;
                                          break L4;
                                        }
                                      }
                                      ((bd) this).field_j = ((bd) this).field_j + var12;
                                      var11 = param3.field_H - -var12;
                                      break L3;
                                    }
                                  } else {
                                    var11 = (-(((bd) this).field_j * var10) + ((bd) this).field_i >> 674541921) + param3.field_H;
                                    break L3;
                                  }
                                } else {
                                  var11 = param3.field_H;
                                  break L3;
                                }
                              }
                              var12 = 0;
                              L5: while (true) {
                                if (var10 <= var12) {
                                  return;
                                } else {
                                  L6: {
                                    var20 = var19[var12];
                                    stackOut_31_0 = null;
                                    stackOut_31_1 = null;
                                    stackOut_31_2 = -param3.field_H + var11;
                                    stackOut_31_3 = param3.field_B + var11;
                                    stackIn_33_0 = stackOut_31_0;
                                    stackIn_33_1 = stackOut_31_1;
                                    stackIn_33_2 = stackOut_31_2;
                                    stackIn_33_3 = stackOut_31_3;
                                    stackIn_32_0 = stackOut_31_0;
                                    stackIn_32_1 = stackOut_31_1;
                                    stackIn_32_2 = stackOut_31_2;
                                    stackIn_32_3 = stackOut_31_3;
                                    if (var20 == null) {
                                      stackOut_33_0 = null;
                                      stackOut_33_1 = null;
                                      stackOut_33_2 = stackIn_33_2;
                                      stackOut_33_3 = stackIn_33_3;
                                      stackOut_33_4 = 0;
                                      stackIn_34_0 = stackOut_33_0;
                                      stackIn_34_1 = stackOut_33_1;
                                      stackIn_34_2 = stackOut_33_2;
                                      stackIn_34_3 = stackOut_33_3;
                                      stackIn_34_4 = stackOut_33_4;
                                      break L6;
                                    } else {
                                      stackOut_32_0 = null;
                                      stackOut_32_1 = null;
                                      stackOut_32_2 = stackIn_32_2;
                                      stackOut_32_3 = stackIn_32_3;
                                      stackOut_32_4 = var20.length();
                                      stackIn_34_0 = stackOut_32_0;
                                      stackIn_34_1 = stackOut_32_1;
                                      stackIn_34_2 = stackOut_32_2;
                                      stackIn_34_3 = stackOut_32_3;
                                      stackIn_34_4 = stackOut_32_4;
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    new ed(stackIn_34_2, stackIn_34_3, stackIn_34_4);
                                    var21 = stackIn_34_0;
                                    var21.field_g[0] = 0;
                                    if (var20 == null) {
                                      break L7;
                                    } else {
                                      L8: {
                                        var21.field_g[var20.length()] = param3.a(var20);
                                        stackOut_35_0 = (ed) var21;
                                        stackIn_37_0 = stackOut_35_0;
                                        stackIn_36_0 = stackOut_35_0;
                                        if (-4 != (param2 ^ -1)) {
                                          stackOut_37_0 = (ed) (Object) stackIn_37_0;
                                          stackOut_37_1 = 0;
                                          stackIn_38_0 = stackOut_37_0;
                                          stackIn_38_1 = stackOut_37_1;
                                          break L8;
                                        } else {
                                          stackOut_36_0 = (ed) (Object) stackIn_36_0;
                                          stackOut_36_1 = ((bd) this).a(var20, param4, param3.a(var20), (byte) 74);
                                          stackIn_38_0 = stackOut_36_0;
                                          stackIn_38_1 = stackOut_36_1;
                                          break L8;
                                        }
                                      }
                                      ll.a(stackIn_38_0, stackIn_38_1, var20, param3, 404465128);
                                      break L7;
                                    }
                                  }
                                  ((bd) this).field_c[var12] = var21;
                                  var11 = var11 + param6;
                                  var12++;
                                  continue L5;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L9: {
            ((bd) this).field_t = param1;
            ((bd) this).field_j = param6;
            ((bd) this).field_n = param4;
            ((bd) this).field_i = param5;
            ((bd) this).field_s = false;
            ((bd) this).field_h = param3;
            ((bd) this).field_r = param7;
            ((bd) this).field_l = param2;
            var23 = new String[1 + param3.b(param1, param4)];
            var16 = var23;
            var22 = var23;
            var10 = Math.max(1, param3.a(param1, new int[1], var22));
            if ((((bd) this).field_r ^ -1) != -4) {
              break L9;
            } else {
              if (var10 == 1) {
                ((bd) this).field_r = 1;
                break L9;
              } else {
                L10: {
                  ((bd) this).field_c = new ed[var10];
                  if (0 != ((bd) this).field_r) {
                    if (((bd) this).field_r != 1) {
                      if (2 == ((bd) this).field_r) {
                        var11 = ((bd) this).field_i - param3.field_B + -(var10 * ((bd) this).field_j);
                        break L10;
                      } else {
                        L11: {
                          var12 = (-(var10 * ((bd) this).field_j) + ((bd) this).field_i) / (var10 + 1);
                          if (var12 >= 0) {
                            break L11;
                          } else {
                            var12 = 0;
                            break L11;
                          }
                        }
                        ((bd) this).field_j = ((bd) this).field_j + var12;
                        var11 = param3.field_H - -var12;
                        break L10;
                      }
                    } else {
                      var11 = (-(((bd) this).field_j * var10) + ((bd) this).field_i >> 674541921) + param3.field_H;
                      break L10;
                    }
                  } else {
                    var11 = param3.field_H;
                    break L10;
                  }
                }
                var12 = 0;
                L12: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L13: {
                      var24 = var23[var12];
                      stackOut_55_0 = null;
                      stackOut_55_1 = null;
                      stackOut_55_2 = -param3.field_H + var11;
                      stackOut_55_3 = param3.field_B + var11;
                      stackIn_57_0 = stackOut_55_0;
                      stackIn_57_1 = stackOut_55_1;
                      stackIn_57_2 = stackOut_55_2;
                      stackIn_57_3 = stackOut_55_3;
                      stackIn_56_0 = stackOut_55_0;
                      stackIn_56_1 = stackOut_55_1;
                      stackIn_56_2 = stackOut_55_2;
                      stackIn_56_3 = stackOut_55_3;
                      if (var24 == null) {
                        stackOut_57_0 = null;
                        stackOut_57_1 = null;
                        stackOut_57_2 = stackIn_57_2;
                        stackOut_57_3 = stackIn_57_3;
                        stackOut_57_4 = 0;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        stackIn_58_2 = stackOut_57_2;
                        stackIn_58_3 = stackOut_57_3;
                        stackIn_58_4 = stackOut_57_4;
                        break L13;
                      } else {
                        stackOut_56_0 = null;
                        stackOut_56_1 = null;
                        stackOut_56_2 = stackIn_56_2;
                        stackOut_56_3 = stackIn_56_3;
                        stackOut_56_4 = var24.length();
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        stackIn_58_2 = stackOut_56_2;
                        stackIn_58_3 = stackOut_56_3;
                        stackIn_58_4 = stackOut_56_4;
                        break L13;
                      }
                    }
                    L14: {
                      new ed(stackIn_58_2, stackIn_58_3, stackIn_58_4);
                      var25 = stackIn_58_0;
                      var25.field_g[0] = 0;
                      if (var24 == null) {
                        break L14;
                      } else {
                        L15: {
                          var25.field_g[var24.length()] = param3.a(var24);
                          stackOut_59_0 = (ed) var25;
                          stackIn_61_0 = stackOut_59_0;
                          stackIn_60_0 = stackOut_59_0;
                          if (-4 != (param2 ^ -1)) {
                            stackOut_61_0 = (ed) (Object) stackIn_61_0;
                            stackOut_61_1 = 0;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            break L15;
                          } else {
                            stackOut_60_0 = (ed) (Object) stackIn_60_0;
                            stackOut_60_1 = ((bd) this).a(var24, param4, param3.a(var24), (byte) 74);
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_62_1 = stackOut_60_1;
                            break L15;
                          }
                        }
                        ll.a(stackIn_62_0, stackIn_62_1, var24, param3, 404465128);
                        break L14;
                      }
                    }
                    ((bd) this).field_c[var12] = var25;
                    var11 = var11 + param6;
                    var12++;
                    continue L12;
                  }
                }
              }
            }
          }
          ((bd) this).field_c = new ed[var10];
          if (0 != ((bd) this).field_r) {
            if (((bd) this).field_r != 1) {
              if (2 != ((bd) this).field_r) {
                L16: {
                  var12 = (-(var10 * ((bd) this).field_j) + ((bd) this).field_i) / (var10 + 1);
                  if (var12 >= 0) {
                    break L16;
                  } else {
                    var12 = 0;
                    break L16;
                  }
                }
                ((bd) this).field_j = ((bd) this).field_j + var12;
                var11 = param3.field_H - -var12;
                var12 = 0;
                L17: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L18: {
                      var40 = var23[var12];
                      stackOut_111_0 = null;
                      stackOut_111_1 = null;
                      stackOut_111_2 = -param3.field_H + var11;
                      stackOut_111_3 = param3.field_B + var11;
                      stackIn_113_0 = stackOut_111_0;
                      stackIn_113_1 = stackOut_111_1;
                      stackIn_113_2 = stackOut_111_2;
                      stackIn_113_3 = stackOut_111_3;
                      stackIn_112_0 = stackOut_111_0;
                      stackIn_112_1 = stackOut_111_1;
                      stackIn_112_2 = stackOut_111_2;
                      stackIn_112_3 = stackOut_111_3;
                      if (var40 == null) {
                        stackOut_113_0 = null;
                        stackOut_113_1 = null;
                        stackOut_113_2 = stackIn_113_2;
                        stackOut_113_3 = stackIn_113_3;
                        stackOut_113_4 = 0;
                        stackIn_114_0 = stackOut_113_0;
                        stackIn_114_1 = stackOut_113_1;
                        stackIn_114_2 = stackOut_113_2;
                        stackIn_114_3 = stackOut_113_3;
                        stackIn_114_4 = stackOut_113_4;
                        break L18;
                      } else {
                        stackOut_112_0 = null;
                        stackOut_112_1 = null;
                        stackOut_112_2 = stackIn_112_2;
                        stackOut_112_3 = stackIn_112_3;
                        stackOut_112_4 = var40.length();
                        stackIn_114_0 = stackOut_112_0;
                        stackIn_114_1 = stackOut_112_1;
                        stackIn_114_2 = stackOut_112_2;
                        stackIn_114_3 = stackOut_112_3;
                        stackIn_114_4 = stackOut_112_4;
                        break L18;
                      }
                    }
                    L19: {
                      new ed(stackIn_114_2, stackIn_114_3, stackIn_114_4);
                      var41 = stackIn_114_0;
                      var41.field_g[0] = 0;
                      if (var40 == null) {
                        break L19;
                      } else {
                        L20: {
                          var41.field_g[var40.length()] = param3.a(var40);
                          stackOut_115_0 = (ed) var41;
                          stackIn_117_0 = stackOut_115_0;
                          stackIn_116_0 = stackOut_115_0;
                          if (-4 != (param2 ^ -1)) {
                            stackOut_117_0 = (ed) (Object) stackIn_117_0;
                            stackOut_117_1 = 0;
                            stackIn_118_0 = stackOut_117_0;
                            stackIn_118_1 = stackOut_117_1;
                            break L20;
                          } else {
                            stackOut_116_0 = (ed) (Object) stackIn_116_0;
                            stackOut_116_1 = ((bd) this).a(var40, param4, param3.a(var40), (byte) 74);
                            stackIn_118_0 = stackOut_116_0;
                            stackIn_118_1 = stackOut_116_1;
                            break L20;
                          }
                        }
                        ll.a(stackIn_118_0, stackIn_118_1, var40, param3, 404465128);
                        break L19;
                      }
                    }
                    ((bd) this).field_c[var12] = var41;
                    var11 = var11 + param6;
                    var12++;
                    continue L17;
                  }
                }
              } else {
                var11 = ((bd) this).field_i - param3.field_B + -(var10 * ((bd) this).field_j);
                var12 = 0;
                L21: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L22: {
                      var42 = var23[var12];
                      stackOut_97_0 = null;
                      stackOut_97_1 = null;
                      stackOut_97_2 = -param3.field_H + var11;
                      stackOut_97_3 = param3.field_B + var11;
                      stackIn_99_0 = stackOut_97_0;
                      stackIn_99_1 = stackOut_97_1;
                      stackIn_99_2 = stackOut_97_2;
                      stackIn_99_3 = stackOut_97_3;
                      stackIn_98_0 = stackOut_97_0;
                      stackIn_98_1 = stackOut_97_1;
                      stackIn_98_2 = stackOut_97_2;
                      stackIn_98_3 = stackOut_97_3;
                      if (var42 == null) {
                        stackOut_99_0 = null;
                        stackOut_99_1 = null;
                        stackOut_99_2 = stackIn_99_2;
                        stackOut_99_3 = stackIn_99_3;
                        stackOut_99_4 = 0;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        stackIn_100_2 = stackOut_99_2;
                        stackIn_100_3 = stackOut_99_3;
                        stackIn_100_4 = stackOut_99_4;
                        break L22;
                      } else {
                        stackOut_98_0 = null;
                        stackOut_98_1 = null;
                        stackOut_98_2 = stackIn_98_2;
                        stackOut_98_3 = stackIn_98_3;
                        stackOut_98_4 = var42.length();
                        stackIn_100_0 = stackOut_98_0;
                        stackIn_100_1 = stackOut_98_1;
                        stackIn_100_2 = stackOut_98_2;
                        stackIn_100_3 = stackOut_98_3;
                        stackIn_100_4 = stackOut_98_4;
                        break L22;
                      }
                    }
                    L23: {
                      new ed(stackIn_100_2, stackIn_100_3, stackIn_100_4);
                      var43 = stackIn_100_0;
                      var43.field_g[0] = 0;
                      if (var42 == null) {
                        break L23;
                      } else {
                        L24: {
                          var43.field_g[var42.length()] = param3.a(var42);
                          stackOut_101_0 = (ed) var43;
                          stackIn_103_0 = stackOut_101_0;
                          stackIn_102_0 = stackOut_101_0;
                          if (-4 != (param2 ^ -1)) {
                            stackOut_103_0 = (ed) (Object) stackIn_103_0;
                            stackOut_103_1 = 0;
                            stackIn_104_0 = stackOut_103_0;
                            stackIn_104_1 = stackOut_103_1;
                            break L24;
                          } else {
                            stackOut_102_0 = (ed) (Object) stackIn_102_0;
                            stackOut_102_1 = ((bd) this).a(var42, param4, param3.a(var42), (byte) 74);
                            stackIn_104_0 = stackOut_102_0;
                            stackIn_104_1 = stackOut_102_1;
                            break L24;
                          }
                        }
                        ll.a(stackIn_104_0, stackIn_104_1, var42, param3, 404465128);
                        break L23;
                      }
                    }
                    ((bd) this).field_c[var12] = var43;
                    var11 = var11 + param6;
                    var12++;
                    continue L21;
                  }
                }
              }
            } else {
              var11 = (-(((bd) this).field_j * var10) + ((bd) this).field_i >> 674541921) + param3.field_H;
              var12 = 0;
              L25: while (true) {
                if (var10 > var12) {
                  L26: {
                    var38 = var23[var12];
                    stackOut_85_0 = null;
                    stackOut_85_1 = null;
                    stackOut_85_2 = -param3.field_H + var11;
                    stackOut_85_3 = param3.field_B + var11;
                    stackIn_87_0 = stackOut_85_0;
                    stackIn_87_1 = stackOut_85_1;
                    stackIn_87_2 = stackOut_85_2;
                    stackIn_87_3 = stackOut_85_3;
                    stackIn_86_0 = stackOut_85_0;
                    stackIn_86_1 = stackOut_85_1;
                    stackIn_86_2 = stackOut_85_2;
                    stackIn_86_3 = stackOut_85_3;
                    if (var38 == null) {
                      stackOut_87_0 = null;
                      stackOut_87_1 = null;
                      stackOut_87_2 = stackIn_87_2;
                      stackOut_87_3 = stackIn_87_3;
                      stackOut_87_4 = 0;
                      stackIn_88_0 = stackOut_87_0;
                      stackIn_88_1 = stackOut_87_1;
                      stackIn_88_2 = stackOut_87_2;
                      stackIn_88_3 = stackOut_87_3;
                      stackIn_88_4 = stackOut_87_4;
                      break L26;
                    } else {
                      stackOut_86_0 = null;
                      stackOut_86_1 = null;
                      stackOut_86_2 = stackIn_86_2;
                      stackOut_86_3 = stackIn_86_3;
                      stackOut_86_4 = var38.length();
                      stackIn_88_0 = stackOut_86_0;
                      stackIn_88_1 = stackOut_86_1;
                      stackIn_88_2 = stackOut_86_2;
                      stackIn_88_3 = stackOut_86_3;
                      stackIn_88_4 = stackOut_86_4;
                      break L26;
                    }
                  }
                  L27: {
                    new ed(stackIn_88_2, stackIn_88_3, stackIn_88_4);
                    var39 = stackIn_88_0;
                    var39.field_g[0] = 0;
                    if (var38 == null) {
                      break L27;
                    } else {
                      L28: {
                        var39.field_g[var38.length()] = param3.a(var38);
                        stackOut_89_0 = (ed) var39;
                        stackIn_91_0 = stackOut_89_0;
                        stackIn_90_0 = stackOut_89_0;
                        if (-4 != (param2 ^ -1)) {
                          stackOut_91_0 = (ed) (Object) stackIn_91_0;
                          stackOut_91_1 = 0;
                          stackIn_92_0 = stackOut_91_0;
                          stackIn_92_1 = stackOut_91_1;
                          break L28;
                        } else {
                          stackOut_90_0 = (ed) (Object) stackIn_90_0;
                          stackOut_90_1 = ((bd) this).a(var38, param4, param3.a(var38), (byte) 74);
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_92_1 = stackOut_90_1;
                          break L28;
                        }
                      }
                      ll.a(stackIn_92_0, stackIn_92_1, var38, param3, 404465128);
                      break L27;
                    }
                  }
                  ((bd) this).field_c[var12] = var39;
                  var11 = var11 + param6;
                  var12++;
                  continue L25;
                } else {
                  return;
                }
              }
            }
          } else {
            var11 = param3.field_H;
            var12 = 0;
            L29: while (true) {
              if (var10 > var12) {
                L30: {
                  var32 = var23[var12];
                  stackOut_71_0 = null;
                  stackOut_71_1 = null;
                  stackOut_71_2 = -param3.field_H + var11;
                  stackOut_71_3 = param3.field_B + var11;
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  stackIn_73_2 = stackOut_71_2;
                  stackIn_73_3 = stackOut_71_3;
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  stackIn_72_3 = stackOut_71_3;
                  if (var32 == null) {
                    stackOut_73_0 = null;
                    stackOut_73_1 = null;
                    stackOut_73_2 = stackIn_73_2;
                    stackOut_73_3 = stackIn_73_3;
                    stackOut_73_4 = 0;
                    stackIn_74_0 = stackOut_73_0;
                    stackIn_74_1 = stackOut_73_1;
                    stackIn_74_2 = stackOut_73_2;
                    stackIn_74_3 = stackOut_73_3;
                    stackIn_74_4 = stackOut_73_4;
                    break L30;
                  } else {
                    stackOut_72_0 = null;
                    stackOut_72_1 = null;
                    stackOut_72_2 = stackIn_72_2;
                    stackOut_72_3 = stackIn_72_3;
                    stackOut_72_4 = var32.length();
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_74_1 = stackOut_72_1;
                    stackIn_74_2 = stackOut_72_2;
                    stackIn_74_3 = stackOut_72_3;
                    stackIn_74_4 = stackOut_72_4;
                    break L30;
                  }
                }
                L31: {
                  new ed(stackIn_74_2, stackIn_74_3, stackIn_74_4);
                  var33 = stackIn_74_0;
                  var33.field_g[0] = 0;
                  if (var32 == null) {
                    break L31;
                  } else {
                    L32: {
                      var33.field_g[var32.length()] = param3.a(var32);
                      stackOut_75_0 = (ed) var33;
                      stackIn_77_0 = stackOut_75_0;
                      stackIn_76_0 = stackOut_75_0;
                      if (-4 != (param2 ^ -1)) {
                        stackOut_77_0 = (ed) (Object) stackIn_77_0;
                        stackOut_77_1 = 0;
                        stackIn_78_0 = stackOut_77_0;
                        stackIn_78_1 = stackOut_77_1;
                        break L32;
                      } else {
                        stackOut_76_0 = (ed) (Object) stackIn_76_0;
                        stackOut_76_1 = ((bd) this).a(var32, param4, param3.a(var32), (byte) 74);
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_78_1 = stackOut_76_1;
                        break L32;
                      }
                    }
                    ll.a(stackIn_78_0, stackIn_78_1, var32, param3, 404465128);
                    break L31;
                  }
                }
                ((bd) this).field_c[var12] = var33;
                var11 = var11 + param6;
                var12++;
                continue L29;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_m = null;
        if (param0 != 0) {
            bd.c(15);
            field_u = null;
            field_o = null;
            return;
        }
        field_u = null;
        field_o = null;
    }

    private final ed a(byte param0, int param1, String param2, kc param3) {
        ed var5 = null;
        ed var6 = null;
        if (param0 < 109) {
          return null;
        } else {
          var6 = new ed(-param3.field_H + param1, param3.field_B + param1, param2.length());
          var5 = var6;
          ((bd) this).field_c = new ed[]{var6};
          return var5;
        }
    }

    public bd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new ba(15, 0, 1, 0);
        field_m = "Account created successfully!";
    }
}
