/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends ro {
    static String[] field_q;
    static String field_x;
    static String field_s;
    private String field_r;
    private int field_t;
    static boolean[] field_m;
    private cc field_p;
    static long field_w;
    private int field_j;
    private int field_k;
    static int field_l;
    private int field_n;
    private int field_v;
    static lg field_u;
    private boolean field_o;

    final void a(int param0, cc param1, String param2, int param3, int param4) {
        int var7 = 0;
        lq var9 = null;
        lq var10 = null;
        lq var11 = null;
        if (param3 == -12558) {
          if (param2 == null) {
            ((sl) this).field_c = null;
            return;
          } else {
            if (((sl) this).field_p == param1) {
              if (((sl) this).field_o) {
                if (((sl) this).field_n == 1) {
                  if (null != ((sl) this).field_r) {
                    if (((sl) this).field_r.equals((Object) (Object) param2)) {
                      return;
                    } else {
                      ((sl) this).field_n = 1;
                      ((sl) this).field_p = param1;
                      ((sl) this).field_o = true;
                      var11 = this.a(param2, (byte) 45, param1, param0);
                      var7 = param1.c(param2);
                      var11.field_c[0] = param4 - (var7 >> 1649810497);
                      var11.field_c[param2.length()] = param4 - -(var7 >> -1854206975);
                      tn.a(var11, param2, param1, (byte) 28, 0);
                      return;
                    }
                  } else {
                    ((sl) this).field_n = 1;
                    ((sl) this).field_p = param1;
                    ((sl) this).field_o = true;
                    var11 = this.a(param2, (byte) 45, param1, param0);
                    var7 = param1.c(param2);
                    var11.field_c[0] = param4 - (var7 >> 1649810497);
                    var11.field_c[param2.length()] = param4 - -(var7 >> -1854206975);
                    tn.a(var11, param2, param1, (byte) 28, 0);
                    return;
                  }
                } else {
                  ((sl) this).field_n = 1;
                  ((sl) this).field_p = param1;
                  ((sl) this).field_o = true;
                  var11 = this.a(param2, (byte) 45, param1, param0);
                  var7 = param1.c(param2);
                  var11.field_c[0] = param4 - (var7 >> 1649810497);
                  var11.field_c[param2.length()] = param4 - -(var7 >> -1854206975);
                  tn.a(var11, param2, param1, (byte) 28, 0);
                  return;
                }
              } else {
                ((sl) this).field_n = 1;
                ((sl) this).field_p = param1;
                ((sl) this).field_o = true;
                var10 = this.a(param2, (byte) 45, param1, param0);
                var7 = param1.c(param2);
                var10.field_c[0] = param4 - (var7 >> 1649810497);
                var10.field_c[param2.length()] = param4 - -(var7 >> -1854206975);
                tn.a(var10, param2, param1, (byte) 28, 0);
                return;
              }
            } else {
              ((sl) this).field_n = 1;
              ((sl) this).field_p = param1;
              ((sl) this).field_o = true;
              var9 = this.a(param2, (byte) 45, param1, param0);
              var7 = param1.c(param2);
              var9.field_c[0] = param4 - (var7 >> 1649810497);
              var9.field_c[param2.length()] = param4 - -(var7 >> -1854206975);
              tn.a(var9, param2, param1, (byte) 28, 0);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean b(int param0) {
        int var1 = -92 / ((param0 - 49) / 40);
        return dc.field_L != null ? true : uj.field_g;
    }

    final void b(int param0, cc param1, String param2, int param3, int param4) {
        lq var9 = null;
        lq var10 = null;
        lq var11 = null;
        lq var12 = null;
        lq var13 = null;
        lq var14 = null;
        lq var15 = null;
        lq var16 = null;
        lq var17 = null;
        lq var18 = null;
        lq var19 = null;
        lq var20 = null;
        if (param2 != null) {
          if (param1 == ((sl) this).field_p) {
            if (((sl) this).field_o) {
              L0: {
                if (0 != ((sl) this).field_n) {
                  break L0;
                } else {
                  if (null == ((sl) this).field_r) {
                    break L0;
                  } else {
                    if (!((sl) this).field_r.equals((Object) (Object) param2)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((sl) this).field_o = true;
              ((sl) this).field_r = param2;
              ((sl) this).field_n = 0;
              ((sl) this).field_p = param1;
              if (param0 >= -84) {
                ((sl) this).field_j = -69;
                var17 = this.a(param2, (byte) 45, param1, param3);
                var18 = var17;
                var17.field_c[0] = param4;
                var18.field_c[param2.length()] = param1.c(param2) + param4;
                tn.a(var18, param2, param1, (byte) 17, 0);
                return;
              } else {
                var19 = this.a(param2, (byte) 45, param1, param3);
                var20 = var19;
                var19.field_c[0] = param4;
                var20.field_c[param2.length()] = param1.c(param2) + param4;
                tn.a(var20, param2, param1, (byte) 17, 0);
                return;
              }
            } else {
              ((sl) this).field_o = true;
              ((sl) this).field_r = param2;
              ((sl) this).field_n = 0;
              ((sl) this).field_p = param1;
              if (param0 >= -84) {
                ((sl) this).field_j = -69;
                var13 = this.a(param2, (byte) 45, param1, param3);
                var14 = var13;
                var13.field_c[0] = param4;
                var14.field_c[param2.length()] = param1.c(param2) + param4;
                tn.a(var14, param2, param1, (byte) 17, 0);
                return;
              } else {
                var15 = this.a(param2, (byte) 45, param1, param3);
                var16 = var15;
                var15.field_c[0] = param4;
                var16.field_c[param2.length()] = param1.c(param2) + param4;
                tn.a(var16, param2, param1, (byte) 17, 0);
                return;
              }
            }
          } else {
            ((sl) this).field_o = true;
            ((sl) this).field_r = param2;
            ((sl) this).field_n = 0;
            ((sl) this).field_p = param1;
            if (param0 >= -84) {
              ((sl) this).field_j = -69;
              var9 = this.a(param2, (byte) 45, param1, param3);
              var10 = var9;
              var9.field_c[0] = param4;
              var10.field_c[param2.length()] = param1.c(param2) + param4;
              tn.a(var10, param2, param1, (byte) 17, 0);
              return;
            } else {
              var11 = this.a(param2, (byte) 45, param1, param3);
              var12 = var11;
              var11.field_c[0] = param4;
              var12.field_c[param2.length()] = param1.c(param2) + param4;
              tn.a(var12, param2, param1, (byte) 17, 0);
              return;
            }
          }
        } else {
          ((sl) this).field_c = null;
          return;
        }
    }

    public static void d(byte param0) {
        field_q = null;
        field_u = null;
        field_x = null;
        field_m = null;
        field_s = null;
        if (param0 <= 25) {
            field_s = null;
        }
    }

    final void a(int param0, String param1, int param2, cc param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        String var18 = null;
        lq var19 = null;
        String var26 = null;
        lq var27 = null;
        String var32 = null;
        lq var33 = null;
        String var34 = null;
        lq var35 = null;
        String var36 = null;
        lq var37 = null;
        lq stackIn_29_0 = null;
        lq stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        lq stackIn_30_0 = null;
        lq stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        lq stackIn_31_0 = null;
        lq stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        lq stackIn_33_0 = null;
        String stackIn_33_1 = null;
        cc stackIn_33_2 = null;
        int stackIn_33_3 = 0;
        lq stackIn_34_0 = null;
        String stackIn_34_1 = null;
        cc stackIn_34_2 = null;
        int stackIn_34_3 = 0;
        lq stackIn_35_0 = null;
        String stackIn_35_1 = null;
        cc stackIn_35_2 = null;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        lq stackIn_44_0 = null;
        lq stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        lq stackIn_45_0 = null;
        lq stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        lq stackIn_46_0 = null;
        lq stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        lq stackIn_48_0 = null;
        String stackIn_48_1 = null;
        cc stackIn_48_2 = null;
        int stackIn_48_3 = 0;
        lq stackIn_49_0 = null;
        String stackIn_49_1 = null;
        cc stackIn_49_2 = null;
        int stackIn_49_3 = 0;
        lq stackIn_50_0 = null;
        String stackIn_50_1 = null;
        cc stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        lq stackIn_58_0 = null;
        lq stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        lq stackIn_59_0 = null;
        lq stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        lq stackIn_60_0 = null;
        lq stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_60_4 = 0;
        lq stackIn_62_0 = null;
        String stackIn_62_1 = null;
        cc stackIn_62_2 = null;
        int stackIn_62_3 = 0;
        lq stackIn_63_0 = null;
        String stackIn_63_1 = null;
        cc stackIn_63_2 = null;
        int stackIn_63_3 = 0;
        lq stackIn_64_0 = null;
        String stackIn_64_1 = null;
        cc stackIn_64_2 = null;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        lq stackIn_70_0 = null;
        lq stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        lq stackIn_71_0 = null;
        lq stackIn_71_1 = null;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        lq stackIn_72_0 = null;
        lq stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        int stackIn_72_4 = 0;
        lq stackIn_74_0 = null;
        String stackIn_74_1 = null;
        cc stackIn_74_2 = null;
        int stackIn_74_3 = 0;
        lq stackIn_75_0 = null;
        String stackIn_75_1 = null;
        cc stackIn_75_2 = null;
        int stackIn_75_3 = 0;
        lq stackIn_76_0 = null;
        String stackIn_76_1 = null;
        cc stackIn_76_2 = null;
        int stackIn_76_3 = 0;
        int stackIn_76_4 = 0;
        lq stackIn_85_0 = null;
        lq stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        lq stackIn_86_0 = null;
        lq stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        lq stackIn_87_0 = null;
        lq stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        int stackIn_87_4 = 0;
        lq stackIn_89_0 = null;
        String stackIn_89_1 = null;
        cc stackIn_89_2 = null;
        int stackIn_89_3 = 0;
        lq stackIn_90_0 = null;
        String stackIn_90_1 = null;
        cc stackIn_90_2 = null;
        int stackIn_90_3 = 0;
        lq stackIn_91_0 = null;
        String stackIn_91_1 = null;
        cc stackIn_91_2 = null;
        int stackIn_91_3 = 0;
        int stackIn_91_4 = 0;
        lq stackOut_28_0 = null;
        lq stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        lq stackOut_30_0 = null;
        lq stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        lq stackOut_29_0 = null;
        lq stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        lq stackOut_32_0 = null;
        String stackOut_32_1 = null;
        cc stackOut_32_2 = null;
        int stackOut_32_3 = 0;
        lq stackOut_34_0 = null;
        String stackOut_34_1 = null;
        cc stackOut_34_2 = null;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        lq stackOut_33_0 = null;
        String stackOut_33_1 = null;
        cc stackOut_33_2 = null;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        lq stackOut_84_0 = null;
        lq stackOut_84_1 = null;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        lq stackOut_86_0 = null;
        lq stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int stackOut_86_4 = 0;
        lq stackOut_85_0 = null;
        lq stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        int stackOut_85_4 = 0;
        lq stackOut_88_0 = null;
        String stackOut_88_1 = null;
        cc stackOut_88_2 = null;
        int stackOut_88_3 = 0;
        lq stackOut_90_0 = null;
        String stackOut_90_1 = null;
        cc stackOut_90_2 = null;
        int stackOut_90_3 = 0;
        int stackOut_90_4 = 0;
        lq stackOut_89_0 = null;
        String stackOut_89_1 = null;
        cc stackOut_89_2 = null;
        int stackOut_89_3 = 0;
        int stackOut_89_4 = 0;
        lq stackOut_69_0 = null;
        lq stackOut_69_1 = null;
        int stackOut_69_2 = 0;
        int stackOut_69_3 = 0;
        lq stackOut_71_0 = null;
        lq stackOut_71_1 = null;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        int stackOut_71_4 = 0;
        lq stackOut_70_0 = null;
        lq stackOut_70_1 = null;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        int stackOut_70_4 = 0;
        lq stackOut_73_0 = null;
        String stackOut_73_1 = null;
        cc stackOut_73_2 = null;
        int stackOut_73_3 = 0;
        lq stackOut_75_0 = null;
        String stackOut_75_1 = null;
        cc stackOut_75_2 = null;
        int stackOut_75_3 = 0;
        int stackOut_75_4 = 0;
        lq stackOut_74_0 = null;
        String stackOut_74_1 = null;
        cc stackOut_74_2 = null;
        int stackOut_74_3 = 0;
        int stackOut_74_4 = 0;
        lq stackOut_57_0 = null;
        lq stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        lq stackOut_59_0 = null;
        lq stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        lq stackOut_58_0 = null;
        lq stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        lq stackOut_61_0 = null;
        String stackOut_61_1 = null;
        cc stackOut_61_2 = null;
        int stackOut_61_3 = 0;
        lq stackOut_63_0 = null;
        String stackOut_63_1 = null;
        cc stackOut_63_2 = null;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        lq stackOut_62_0 = null;
        String stackOut_62_1 = null;
        cc stackOut_62_2 = null;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        lq stackOut_43_0 = null;
        lq stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        lq stackOut_45_0 = null;
        lq stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        lq stackOut_44_0 = null;
        lq stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_44_4 = 0;
        lq stackOut_47_0 = null;
        String stackOut_47_1 = null;
        cc stackOut_47_2 = null;
        int stackOut_47_3 = 0;
        lq stackOut_49_0 = null;
        String stackOut_49_1 = null;
        cc stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        lq stackOut_48_0 = null;
        String stackOut_48_1 = null;
        cc stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        L0: {
          var15 = Vertigo2.field_L ? 1 : 0;
          if (0 != param7) {
            break L0;
          } else {
            param7 = param3.field_D;
            break L0;
          }
        }
        if (param1 != null) {
          L1: {
            if (((sl) this).field_p != param3) {
              break L1;
            } else {
              if (((sl) this).field_o) {
                break L1;
              } else {
                if (((sl) this).field_n != param4) {
                  break L1;
                } else {
                  if (((sl) this).field_j != param0) {
                    break L1;
                  } else {
                    if (((sl) this).field_t != param7) {
                      break L1;
                    } else {
                      if (param5 != ((sl) this).field_k) {
                        break L1;
                      } else {
                        if (param6 != ((sl) this).field_v) {
                          break L1;
                        } else {
                          if (null == ((sl) this).field_r) {
                            break L1;
                          } else {
                            if (!((sl) this).field_r.equals((Object) (Object) param1)) {
                              break L1;
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
          L2: {
            ((sl) this).field_v = param6;
            ((sl) this).field_p = param3;
            ((sl) this).field_o = false;
            ((sl) this).field_r = param1;
            ((sl) this).field_k = param5;
            ((sl) this).field_n = param4;
            ((sl) this).field_j = param0;
            ((sl) this).field_t = param7;
            var16 = new String[param2 + param3.b(param1, param6)];
            var17 = var16;
            var10 = Math.max(1, param3.a(param1, new int[1], var17));
            if (3 != ((sl) this).field_j) {
              break L2;
            } else {
              if (1 != var10) {
                break L2;
              } else {
                L3: {
                  ((sl) this).field_j = 1;
                  if (0 != ((sl) this).field_j) {
                    if (-2 != (((sl) this).field_j ^ -1)) {
                      if (2 == ((sl) this).field_j) {
                        var11 = -(var10 * ((sl) this).field_t) + (-param3.field_M + ((sl) this).field_k);
                        break L3;
                      } else {
                        L4: {
                          var12 = (((sl) this).field_k - ((sl) this).field_t * var10) / (var10 + 1);
                          if ((var12 ^ -1) > -1) {
                            var12 = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var11 = var12 + param3.field_z;
                        ((sl) this).field_t = ((sl) this).field_t + var12;
                        break L3;
                      }
                    } else {
                      var11 = (((sl) this).field_k + -(var10 * ((sl) this).field_t) >> -1621733695) + param3.field_z;
                      break L3;
                    }
                  } else {
                    var11 = param3.field_z;
                    break L3;
                  }
                }
                ((sl) this).field_c = new lq[var10];
                var12 = 0;
                L5: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L6: {
                      var18 = var16[var12];
                      stackOut_28_0 = null;
                      stackOut_28_1 = null;
                      stackOut_28_2 = var11 + -param3.field_z;
                      stackOut_28_3 = param3.field_M + var11;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackIn_30_2 = stackOut_28_2;
                      stackIn_30_3 = stackOut_28_3;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      stackIn_29_2 = stackOut_28_2;
                      stackIn_29_3 = stackOut_28_3;
                      if (var18 == null) {
                        stackOut_30_0 = null;
                        stackOut_30_1 = null;
                        stackOut_30_2 = stackIn_30_2;
                        stackOut_30_3 = stackIn_30_3;
                        stackOut_30_4 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
                        stackIn_31_3 = stackOut_30_3;
                        stackIn_31_4 = stackOut_30_4;
                        break L6;
                      } else {
                        stackOut_29_0 = null;
                        stackOut_29_1 = null;
                        stackOut_29_2 = stackIn_29_2;
                        stackOut_29_3 = stackIn_29_3;
                        stackOut_29_4 = var18.length();
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        stackIn_31_3 = stackOut_29_3;
                        stackIn_31_4 = stackOut_29_4;
                        break L6;
                      }
                    }
                    L7: {
                      new lq(stackIn_31_2, stackIn_31_3, stackIn_31_4);
                      var19 = stackIn_31_0;
                      var19.field_c[0] = 0;
                      if (var18 == null) {
                        break L7;
                      } else {
                        L8: {
                          var19.field_c[var18.length()] = param3.c(var18);
                          stackOut_32_0 = (lq) var19;
                          stackOut_32_1 = (String) var18;
                          stackOut_32_2 = (cc) param3;
                          stackOut_32_3 = 83;
                          stackIn_34_0 = stackOut_32_0;
                          stackIn_34_1 = stackOut_32_1;
                          stackIn_34_2 = stackOut_32_2;
                          stackIn_34_3 = stackOut_32_3;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          stackIn_33_2 = stackOut_32_2;
                          stackIn_33_3 = stackOut_32_3;
                          if (-4 == (param4 ^ -1)) {
                            stackOut_34_0 = (lq) (Object) stackIn_34_0;
                            stackOut_34_1 = (String) (Object) stackIn_34_1;
                            stackOut_34_2 = (cc) (Object) stackIn_34_2;
                            stackOut_34_3 = stackIn_34_3;
                            stackOut_34_4 = ((sl) this).a(var18, false, param3.c(var18), param6);
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            stackIn_35_2 = stackOut_34_2;
                            stackIn_35_3 = stackOut_34_3;
                            stackIn_35_4 = stackOut_34_4;
                            break L8;
                          } else {
                            stackOut_33_0 = (lq) (Object) stackIn_33_0;
                            stackOut_33_1 = (String) (Object) stackIn_33_1;
                            stackOut_33_2 = (cc) (Object) stackIn_33_2;
                            stackOut_33_3 = stackIn_33_3;
                            stackOut_33_4 = 0;
                            stackIn_35_0 = stackOut_33_0;
                            stackIn_35_1 = stackOut_33_1;
                            stackIn_35_2 = stackOut_33_2;
                            stackIn_35_3 = stackOut_33_3;
                            stackIn_35_4 = stackOut_33_4;
                            break L8;
                          }
                        }
                        tn.a(stackIn_35_0, stackIn_35_1, stackIn_35_2, (byte) stackIn_35_3, stackIn_35_4);
                        break L7;
                      }
                    }
                    var11 = var11 + param7;
                    ((sl) this).field_c[var12] = var19;
                    var12++;
                    continue L5;
                  }
                }
              }
            }
          }
          if (0 != ((sl) this).field_j) {
            if (-2 != (((sl) this).field_j ^ -1)) {
              if (2 != ((sl) this).field_j) {
                L9: {
                  var12 = (((sl) this).field_k - ((sl) this).field_t * var10) / (var10 + 1);
                  if ((var12 ^ -1) > -1) {
                    var12 = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var11 = var12 + param3.field_z;
                ((sl) this).field_t = ((sl) this).field_t + var12;
                ((sl) this).field_c = new lq[var10];
                var12 = 0;
                L10: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L11: {
                      var34 = var16[var12];
                      stackOut_84_0 = null;
                      stackOut_84_1 = null;
                      stackOut_84_2 = var11 + -param3.field_z;
                      stackOut_84_3 = param3.field_M + var11;
                      stackIn_86_0 = stackOut_84_0;
                      stackIn_86_1 = stackOut_84_1;
                      stackIn_86_2 = stackOut_84_2;
                      stackIn_86_3 = stackOut_84_3;
                      stackIn_85_0 = stackOut_84_0;
                      stackIn_85_1 = stackOut_84_1;
                      stackIn_85_2 = stackOut_84_2;
                      stackIn_85_3 = stackOut_84_3;
                      if (var34 == null) {
                        stackOut_86_0 = null;
                        stackOut_86_1 = null;
                        stackOut_86_2 = stackIn_86_2;
                        stackOut_86_3 = stackIn_86_3;
                        stackOut_86_4 = 0;
                        stackIn_87_0 = stackOut_86_0;
                        stackIn_87_1 = stackOut_86_1;
                        stackIn_87_2 = stackOut_86_2;
                        stackIn_87_3 = stackOut_86_3;
                        stackIn_87_4 = stackOut_86_4;
                        break L11;
                      } else {
                        stackOut_85_0 = null;
                        stackOut_85_1 = null;
                        stackOut_85_2 = stackIn_85_2;
                        stackOut_85_3 = stackIn_85_3;
                        stackOut_85_4 = var34.length();
                        stackIn_87_0 = stackOut_85_0;
                        stackIn_87_1 = stackOut_85_1;
                        stackIn_87_2 = stackOut_85_2;
                        stackIn_87_3 = stackOut_85_3;
                        stackIn_87_4 = stackOut_85_4;
                        break L11;
                      }
                    }
                    L12: {
                      new lq(stackIn_87_2, stackIn_87_3, stackIn_87_4);
                      var35 = stackIn_87_0;
                      var35.field_c[0] = 0;
                      if (var34 == null) {
                        break L12;
                      } else {
                        L13: {
                          var35.field_c[var34.length()] = param3.c(var34);
                          stackOut_88_0 = (lq) var35;
                          stackOut_88_1 = (String) var34;
                          stackOut_88_2 = (cc) param3;
                          stackOut_88_3 = 83;
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_90_1 = stackOut_88_1;
                          stackIn_90_2 = stackOut_88_2;
                          stackIn_90_3 = stackOut_88_3;
                          stackIn_89_0 = stackOut_88_0;
                          stackIn_89_1 = stackOut_88_1;
                          stackIn_89_2 = stackOut_88_2;
                          stackIn_89_3 = stackOut_88_3;
                          if (-4 == (param4 ^ -1)) {
                            stackOut_90_0 = (lq) (Object) stackIn_90_0;
                            stackOut_90_1 = (String) (Object) stackIn_90_1;
                            stackOut_90_2 = (cc) (Object) stackIn_90_2;
                            stackOut_90_3 = stackIn_90_3;
                            stackOut_90_4 = ((sl) this).a(var34, false, param3.c(var34), param6);
                            stackIn_91_0 = stackOut_90_0;
                            stackIn_91_1 = stackOut_90_1;
                            stackIn_91_2 = stackOut_90_2;
                            stackIn_91_3 = stackOut_90_3;
                            stackIn_91_4 = stackOut_90_4;
                            break L13;
                          } else {
                            stackOut_89_0 = (lq) (Object) stackIn_89_0;
                            stackOut_89_1 = (String) (Object) stackIn_89_1;
                            stackOut_89_2 = (cc) (Object) stackIn_89_2;
                            stackOut_89_3 = stackIn_89_3;
                            stackOut_89_4 = 0;
                            stackIn_91_0 = stackOut_89_0;
                            stackIn_91_1 = stackOut_89_1;
                            stackIn_91_2 = stackOut_89_2;
                            stackIn_91_3 = stackOut_89_3;
                            stackIn_91_4 = stackOut_89_4;
                            break L13;
                          }
                        }
                        tn.a(stackIn_91_0, stackIn_91_1, stackIn_91_2, (byte) stackIn_91_3, stackIn_91_4);
                        break L12;
                      }
                    }
                    var11 = var11 + param7;
                    ((sl) this).field_c[var12] = var35;
                    var12++;
                    continue L10;
                  }
                }
              } else {
                var11 = -(var10 * ((sl) this).field_t) + (-param3.field_M + ((sl) this).field_k);
                ((sl) this).field_c = new lq[var10];
                var12 = 0;
                L14: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L15: {
                      var36 = var16[var12];
                      stackOut_69_0 = null;
                      stackOut_69_1 = null;
                      stackOut_69_2 = var11 + -param3.field_z;
                      stackOut_69_3 = param3.field_M + var11;
                      stackIn_71_0 = stackOut_69_0;
                      stackIn_71_1 = stackOut_69_1;
                      stackIn_71_2 = stackOut_69_2;
                      stackIn_71_3 = stackOut_69_3;
                      stackIn_70_0 = stackOut_69_0;
                      stackIn_70_1 = stackOut_69_1;
                      stackIn_70_2 = stackOut_69_2;
                      stackIn_70_3 = stackOut_69_3;
                      if (var36 == null) {
                        stackOut_71_0 = null;
                        stackOut_71_1 = null;
                        stackOut_71_2 = stackIn_71_2;
                        stackOut_71_3 = stackIn_71_3;
                        stackOut_71_4 = 0;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        stackIn_72_2 = stackOut_71_2;
                        stackIn_72_3 = stackOut_71_3;
                        stackIn_72_4 = stackOut_71_4;
                        break L15;
                      } else {
                        stackOut_70_0 = null;
                        stackOut_70_1 = null;
                        stackOut_70_2 = stackIn_70_2;
                        stackOut_70_3 = stackIn_70_3;
                        stackOut_70_4 = var36.length();
                        stackIn_72_0 = stackOut_70_0;
                        stackIn_72_1 = stackOut_70_1;
                        stackIn_72_2 = stackOut_70_2;
                        stackIn_72_3 = stackOut_70_3;
                        stackIn_72_4 = stackOut_70_4;
                        break L15;
                      }
                    }
                    L16: {
                      new lq(stackIn_72_2, stackIn_72_3, stackIn_72_4);
                      var37 = stackIn_72_0;
                      var37.field_c[0] = 0;
                      if (var36 == null) {
                        break L16;
                      } else {
                        L17: {
                          var37.field_c[var36.length()] = param3.c(var36);
                          stackOut_73_0 = (lq) var37;
                          stackOut_73_1 = (String) var36;
                          stackOut_73_2 = (cc) param3;
                          stackOut_73_3 = 83;
                          stackIn_75_0 = stackOut_73_0;
                          stackIn_75_1 = stackOut_73_1;
                          stackIn_75_2 = stackOut_73_2;
                          stackIn_75_3 = stackOut_73_3;
                          stackIn_74_0 = stackOut_73_0;
                          stackIn_74_1 = stackOut_73_1;
                          stackIn_74_2 = stackOut_73_2;
                          stackIn_74_3 = stackOut_73_3;
                          if (-4 == (param4 ^ -1)) {
                            stackOut_75_0 = (lq) (Object) stackIn_75_0;
                            stackOut_75_1 = (String) (Object) stackIn_75_1;
                            stackOut_75_2 = (cc) (Object) stackIn_75_2;
                            stackOut_75_3 = stackIn_75_3;
                            stackOut_75_4 = ((sl) this).a(var36, false, param3.c(var36), param6);
                            stackIn_76_0 = stackOut_75_0;
                            stackIn_76_1 = stackOut_75_1;
                            stackIn_76_2 = stackOut_75_2;
                            stackIn_76_3 = stackOut_75_3;
                            stackIn_76_4 = stackOut_75_4;
                            break L17;
                          } else {
                            stackOut_74_0 = (lq) (Object) stackIn_74_0;
                            stackOut_74_1 = (String) (Object) stackIn_74_1;
                            stackOut_74_2 = (cc) (Object) stackIn_74_2;
                            stackOut_74_3 = stackIn_74_3;
                            stackOut_74_4 = 0;
                            stackIn_76_0 = stackOut_74_0;
                            stackIn_76_1 = stackOut_74_1;
                            stackIn_76_2 = stackOut_74_2;
                            stackIn_76_3 = stackOut_74_3;
                            stackIn_76_4 = stackOut_74_4;
                            break L17;
                          }
                        }
                        tn.a(stackIn_76_0, stackIn_76_1, stackIn_76_2, (byte) stackIn_76_3, stackIn_76_4);
                        break L16;
                      }
                    }
                    var11 = var11 + param7;
                    ((sl) this).field_c[var12] = var37;
                    var12++;
                    continue L14;
                  }
                }
              }
            } else {
              var11 = (((sl) this).field_k + -(var10 * ((sl) this).field_t) >> -1621733695) + param3.field_z;
              ((sl) this).field_c = new lq[var10];
              var12 = 0;
              L18: while (true) {
                if (var10 > var12) {
                  L19: {
                    var32 = var16[var12];
                    stackOut_57_0 = null;
                    stackOut_57_1 = null;
                    stackOut_57_2 = var11 + -param3.field_z;
                    stackOut_57_3 = param3.field_M + var11;
                    stackIn_59_0 = stackOut_57_0;
                    stackIn_59_1 = stackOut_57_1;
                    stackIn_59_2 = stackOut_57_2;
                    stackIn_59_3 = stackOut_57_3;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    stackIn_58_2 = stackOut_57_2;
                    stackIn_58_3 = stackOut_57_3;
                    if (var32 == null) {
                      stackOut_59_0 = null;
                      stackOut_59_1 = null;
                      stackOut_59_2 = stackIn_59_2;
                      stackOut_59_3 = stackIn_59_3;
                      stackOut_59_4 = 0;
                      stackIn_60_0 = stackOut_59_0;
                      stackIn_60_1 = stackOut_59_1;
                      stackIn_60_2 = stackOut_59_2;
                      stackIn_60_3 = stackOut_59_3;
                      stackIn_60_4 = stackOut_59_4;
                      break L19;
                    } else {
                      stackOut_58_0 = null;
                      stackOut_58_1 = null;
                      stackOut_58_2 = stackIn_58_2;
                      stackOut_58_3 = stackIn_58_3;
                      stackOut_58_4 = var32.length();
                      stackIn_60_0 = stackOut_58_0;
                      stackIn_60_1 = stackOut_58_1;
                      stackIn_60_2 = stackOut_58_2;
                      stackIn_60_3 = stackOut_58_3;
                      stackIn_60_4 = stackOut_58_4;
                      break L19;
                    }
                  }
                  L20: {
                    new lq(stackIn_60_2, stackIn_60_3, stackIn_60_4);
                    var33 = stackIn_60_0;
                    var33.field_c[0] = 0;
                    if (var32 == null) {
                      break L20;
                    } else {
                      L21: {
                        var33.field_c[var32.length()] = param3.c(var32);
                        stackOut_61_0 = (lq) var33;
                        stackOut_61_1 = (String) var32;
                        stackOut_61_2 = (cc) param3;
                        stackOut_61_3 = 83;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        stackIn_63_2 = stackOut_61_2;
                        stackIn_63_3 = stackOut_61_3;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        stackIn_62_2 = stackOut_61_2;
                        stackIn_62_3 = stackOut_61_3;
                        if (-4 == (param4 ^ -1)) {
                          stackOut_63_0 = (lq) (Object) stackIn_63_0;
                          stackOut_63_1 = (String) (Object) stackIn_63_1;
                          stackOut_63_2 = (cc) (Object) stackIn_63_2;
                          stackOut_63_3 = stackIn_63_3;
                          stackOut_63_4 = ((sl) this).a(var32, false, param3.c(var32), param6);
                          stackIn_64_0 = stackOut_63_0;
                          stackIn_64_1 = stackOut_63_1;
                          stackIn_64_2 = stackOut_63_2;
                          stackIn_64_3 = stackOut_63_3;
                          stackIn_64_4 = stackOut_63_4;
                          break L21;
                        } else {
                          stackOut_62_0 = (lq) (Object) stackIn_62_0;
                          stackOut_62_1 = (String) (Object) stackIn_62_1;
                          stackOut_62_2 = (cc) (Object) stackIn_62_2;
                          stackOut_62_3 = stackIn_62_3;
                          stackOut_62_4 = 0;
                          stackIn_64_0 = stackOut_62_0;
                          stackIn_64_1 = stackOut_62_1;
                          stackIn_64_2 = stackOut_62_2;
                          stackIn_64_3 = stackOut_62_3;
                          stackIn_64_4 = stackOut_62_4;
                          break L21;
                        }
                      }
                      tn.a(stackIn_64_0, stackIn_64_1, stackIn_64_2, (byte) stackIn_64_3, stackIn_64_4);
                      break L20;
                    }
                  }
                  var11 = var11 + param7;
                  ((sl) this).field_c[var12] = var33;
                  var12++;
                  continue L18;
                } else {
                  return;
                }
              }
            }
          } else {
            var11 = param3.field_z;
            ((sl) this).field_c = new lq[var10];
            var12 = 0;
            L22: while (true) {
              if (var10 > var12) {
                L23: {
                  var26 = var16[var12];
                  stackOut_43_0 = null;
                  stackOut_43_1 = null;
                  stackOut_43_2 = var11 + -param3.field_z;
                  stackOut_43_3 = param3.field_M + var11;
                  stackIn_45_0 = stackOut_43_0;
                  stackIn_45_1 = stackOut_43_1;
                  stackIn_45_2 = stackOut_43_2;
                  stackIn_45_3 = stackOut_43_3;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  stackIn_44_3 = stackOut_43_3;
                  if (var26 == null) {
                    stackOut_45_0 = null;
                    stackOut_45_1 = null;
                    stackOut_45_2 = stackIn_45_2;
                    stackOut_45_3 = stackIn_45_3;
                    stackOut_45_4 = 0;
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    stackIn_46_2 = stackOut_45_2;
                    stackIn_46_3 = stackOut_45_3;
                    stackIn_46_4 = stackOut_45_4;
                    break L23;
                  } else {
                    stackOut_44_0 = null;
                    stackOut_44_1 = null;
                    stackOut_44_2 = stackIn_44_2;
                    stackOut_44_3 = stackIn_44_3;
                    stackOut_44_4 = var26.length();
                    stackIn_46_0 = stackOut_44_0;
                    stackIn_46_1 = stackOut_44_1;
                    stackIn_46_2 = stackOut_44_2;
                    stackIn_46_3 = stackOut_44_3;
                    stackIn_46_4 = stackOut_44_4;
                    break L23;
                  }
                }
                L24: {
                  new lq(stackIn_46_2, stackIn_46_3, stackIn_46_4);
                  var27 = stackIn_46_0;
                  var27.field_c[0] = 0;
                  if (var26 == null) {
                    break L24;
                  } else {
                    L25: {
                      var27.field_c[var26.length()] = param3.c(var26);
                      stackOut_47_0 = (lq) var27;
                      stackOut_47_1 = (String) var26;
                      stackOut_47_2 = (cc) param3;
                      stackOut_47_3 = 83;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackIn_49_2 = stackOut_47_2;
                      stackIn_49_3 = stackOut_47_3;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      stackIn_48_2 = stackOut_47_2;
                      stackIn_48_3 = stackOut_47_3;
                      if (-4 == (param4 ^ -1)) {
                        stackOut_49_0 = (lq) (Object) stackIn_49_0;
                        stackOut_49_1 = (String) (Object) stackIn_49_1;
                        stackOut_49_2 = (cc) (Object) stackIn_49_2;
                        stackOut_49_3 = stackIn_49_3;
                        stackOut_49_4 = ((sl) this).a(var26, false, param3.c(var26), param6);
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        stackIn_50_3 = stackOut_49_3;
                        stackIn_50_4 = stackOut_49_4;
                        break L25;
                      } else {
                        stackOut_48_0 = (lq) (Object) stackIn_48_0;
                        stackOut_48_1 = (String) (Object) stackIn_48_1;
                        stackOut_48_2 = (cc) (Object) stackIn_48_2;
                        stackOut_48_3 = stackIn_48_3;
                        stackOut_48_4 = 0;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        stackIn_50_2 = stackOut_48_2;
                        stackIn_50_3 = stackOut_48_3;
                        stackIn_50_4 = stackOut_48_4;
                        break L25;
                      }
                    }
                    tn.a(stackIn_50_0, stackIn_50_1, stackIn_50_2, (byte) stackIn_50_3, stackIn_50_4);
                    break L24;
                  }
                }
                var11 = var11 + param7;
                ((sl) this).field_c[var12] = var27;
                var12++;
                continue L22;
              } else {
                return;
              }
            }
          }
        } else {
          ((sl) this).field_c = null;
          return;
        }
    }

    final void a(int param0, byte param1, cc param2, int param3, String param4) {
        lq var8 = null;
        lq var10 = null;
        lq var11 = null;
        lq var12 = null;
        lq var13 = null;
        lq var14 = null;
        if (param1 > 83) {
          if (param4 == null) {
            ((sl) this).field_c = null;
            return;
          } else {
            if (((sl) this).field_p == param2) {
              if (((sl) this).field_o) {
                if (((sl) this).field_n == 2) {
                  if (((sl) this).field_r != null) {
                    if (!((sl) this).field_r.equals((Object) (Object) param4)) {
                      ((sl) this).field_o = true;
                      ((sl) this).field_r = param4;
                      ((sl) this).field_n = 2;
                      ((sl) this).field_p = param2;
                      var8 = this.a(param4, (byte) 45, param2, param3);
                      var13 = var8;
                      var13.field_c[0] = -param2.c(param4) + param0;
                      var13.field_c[param4.length()] = param0;
                      tn.a(var13, param4, param2, (byte) 119, 0);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((sl) this).field_o = true;
                    ((sl) this).field_r = param4;
                    ((sl) this).field_n = 2;
                    ((sl) this).field_p = param2;
                    var8 = this.a(param4, (byte) 45, param2, param3);
                    var14 = var8;
                    var14.field_c[0] = -param2.c(param4) + param0;
                    var14.field_c[param4.length()] = param0;
                    tn.a(var14, param4, param2, (byte) 119, 0);
                    return;
                  }
                } else {
                  ((sl) this).field_o = true;
                  ((sl) this).field_r = param4;
                  ((sl) this).field_n = 2;
                  ((sl) this).field_p = param2;
                  var8 = this.a(param4, (byte) 45, param2, param3);
                  var14 = var8;
                  var14.field_c[0] = -param2.c(param4) + param0;
                  var14.field_c[param4.length()] = param0;
                  tn.a(var14, param4, param2, (byte) 119, 0);
                  return;
                }
              } else {
                ((sl) this).field_o = true;
                ((sl) this).field_r = param4;
                ((sl) this).field_n = 2;
                ((sl) this).field_p = param2;
                var8 = this.a(param4, (byte) 45, param2, param3);
                var14 = var8;
                var14.field_c[0] = -param2.c(param4) + param0;
                var14.field_c[param4.length()] = param0;
                tn.a(var14, param4, param2, (byte) 119, 0);
                return;
              }
            } else {
              ((sl) this).field_o = true;
              ((sl) this).field_r = param4;
              ((sl) this).field_n = 2;
              ((sl) this).field_p = param2;
              var8 = this.a(param4, (byte) 45, param2, param3);
              var14 = var8;
              var14.field_c[0] = -param2.c(param4) + param0;
              var14.field_c[param4.length()] = param0;
              tn.a(var14, param4, param2, (byte) 119, 0);
              return;
            }
          }
        } else {
          field_l = 50;
          if (param4 == null) {
            ((sl) this).field_c = null;
            return;
          } else {
            if (((sl) this).field_p == param2) {
              if (((sl) this).field_o) {
                if (((sl) this).field_n == 2) {
                  if (((sl) this).field_r != null) {
                    if (((sl) this).field_r.equals((Object) (Object) param4)) {
                      return;
                    } else {
                      ((sl) this).field_o = true;
                      ((sl) this).field_r = param4;
                      ((sl) this).field_n = 2;
                      ((sl) this).field_p = param2;
                      var8 = this.a(param4, (byte) 45, param2, param3);
                      var12 = var8;
                      var12.field_c[0] = -param2.c(param4) + param0;
                      var12.field_c[param4.length()] = param0;
                      tn.a(var12, param4, param2, (byte) 119, 0);
                      return;
                    }
                  } else {
                    ((sl) this).field_o = true;
                    ((sl) this).field_r = param4;
                    ((sl) this).field_n = 2;
                    ((sl) this).field_p = param2;
                    var8 = this.a(param4, (byte) 45, param2, param3);
                    var12 = var8;
                    var12.field_c[0] = -param2.c(param4) + param0;
                    var12.field_c[param4.length()] = param0;
                    tn.a(var12, param4, param2, (byte) 119, 0);
                    return;
                  }
                } else {
                  ((sl) this).field_o = true;
                  ((sl) this).field_r = param4;
                  ((sl) this).field_n = 2;
                  ((sl) this).field_p = param2;
                  var8 = this.a(param4, (byte) 45, param2, param3);
                  var12 = var8;
                  var12.field_c[0] = -param2.c(param4) + param0;
                  var12.field_c[param4.length()] = param0;
                  tn.a(var12, param4, param2, (byte) 119, 0);
                  return;
                }
              } else {
                ((sl) this).field_o = true;
                ((sl) this).field_r = param4;
                ((sl) this).field_n = 2;
                ((sl) this).field_p = param2;
                var8 = this.a(param4, (byte) 45, param2, param3);
                var11 = var8;
                var11.field_c[0] = -param2.c(param4) + param0;
                var11.field_c[param4.length()] = param0;
                tn.a(var11, param4, param2, (byte) 119, 0);
                return;
              }
            } else {
              ((sl) this).field_o = true;
              ((sl) this).field_r = param4;
              ((sl) this).field_n = 2;
              ((sl) this).field_p = param2;
              var8 = this.a(param4, (byte) 45, param2, param3);
              var10 = var8;
              var10.field_c[0] = -param2.c(param4) + param0;
              var10.field_c[param4.length()] = param0;
              tn.a(var10, param4, param2, (byte) 119, 0);
              return;
            }
          }
        }
    }

    public sl() {
    }

    private final lq a(String param0, byte param1, cc param2, int param3) {
        lq var5 = null;
        lq var6 = null;
        var6 = new lq(param3 - param2.field_z, param2.field_M + param3, param0.length());
        var5 = var6;
        if (param1 != 45) {
          return null;
        } else {
          ((sl) this).field_c = new lq[]{var6};
          return var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Return to Main Menu";
        field_s = "Add name";
        field_w = 20000000L;
    }
}
