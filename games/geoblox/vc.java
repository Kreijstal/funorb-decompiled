/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends dk {
    private int field_l;
    private int field_o;
    private String field_n;
    private int field_m;
    private m field_p;
    private int field_k;
    static String field_g;
    static dm field_j;
    private int field_e;
    private boolean field_d;
    static int field_h;
    static int field_i;
    static vk field_f;

    final static void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Geoblox.field_C;
        if (param0 != 2971) {
            return;
        }
        int var1 = ch.field_d[0];
        for (var2 = 1; var2 < ch.field_d.length; var2++) {
            var3 = ch.field_d[var2];
            sf.a(pj.field_i, var2 << -48027036, pj.field_i, var1, var3);
            var1 = var1 + var3;
        }
    }

    final void a(int param0, int param1, byte param2, m param3, String param4) {
        if (param4 == null) {
            ((vc) this).field_a = null;
            return;
        }
        if (((vc) this).field_p == param3) {
            if (((vc) this).field_d) {
                if (((vc) this).field_k == 2) {
                    if (null != ((vc) this).field_n) {
                        if (((vc) this).field_n.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        ((vc) this).field_p = param3;
        ((vc) this).field_n = param4;
        ((vc) this).field_d = true;
        ((vc) this).field_k = 2;
        lk var9 = this.a(-1, param1, param3, param4);
        lk var10 = var9;
        var10.field_c[0] = param0 - param3.a(param4);
        var10.field_c[param4.length()] = param0;
        qb.a(0, var10, param4, 60, param3);
        if (param2 >= -12) {
            Object var7 = null;
            ((vc) this).a(98, 34, (String) null, 56, (m) null, 65, 122, -79);
        }
    }

    final void a(String param0, int param1, int param2, byte param3, m param4) {
        if (param0 == null) {
            ((vc) this).field_a = null;
            return;
        }
        if (param3 != 58) {
            vc.d(-90);
        }
        if (((vc) this).field_p == param4) {
            if (((vc) this).field_d) {
                if (((vc) this).field_k == 1) {
                    if (null != ((vc) this).field_n) {
                        if (((vc) this).field_n.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((vc) this).field_k = 1;
        ((vc) this).field_d = true;
        ((vc) this).field_p = param4;
        lk var8 = this.a(-1, param1, param4, param0);
        int var7 = param4.a(param0);
        var8.field_c[0] = param2 - (var7 >> -1193764287);
        var8.field_c[param0.length()] = (var7 >> 1641559585) + param2;
        qb.a(0, var8, param0, 60, param4);
    }

    final void a(int param0, int param1, String param2, int param3, m param4) {
        if (param2 == null) {
            ((vc) this).field_a = null;
            return;
        }
        if (param3 > -89) {
            field_j = null;
        }
        if (((vc) this).field_p == param4) {
            if (((vc) this).field_d) {
                if (0 == ((vc) this).field_k) {
                    if (((vc) this).field_n != null) {
                        if (!(!((vc) this).field_n.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        ((vc) this).field_n = param2;
        ((vc) this).field_k = 0;
        ((vc) this).field_d = true;
        ((vc) this).field_p = param4;
        lk var7 = this.a(-1, param0, param4, param2);
        lk var8 = var7;
        var7.field_c[0] = param1;
        var8.field_c[param2.length()] = param4.a(param2) + param1;
        qb.a(0, var8, param2, 60, param4);
    }

    final void a(int param0, int param1, String param2, int param3, m param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        lk var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        lk stackIn_31_0 = null;
        lk stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        lk stackIn_32_0 = null;
        lk stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        lk stackIn_33_0 = null;
        lk stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_37_0 = 0;
        lk stackOut_30_0 = null;
        lk stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        lk stackOut_32_0 = null;
        lk stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        lk stackOut_31_0 = null;
        lk stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          var15 = Geoblox.field_C;
          if (param3 == 0) {
            param3 = param4.field_p;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 != null) {
          L1: {
            if (param4 != ((vc) this).field_p) {
              break L1;
            } else {
              if (((vc) this).field_d) {
                break L1;
              } else {
                if (((vc) this).field_k != param6) {
                  break L1;
                } else {
                  if (((vc) this).field_m != param0) {
                    break L1;
                  } else {
                    if (((vc) this).field_e != param3) {
                      break L1;
                    } else {
                      if (param7 != ((vc) this).field_o) {
                        break L1;
                      } else {
                        if (param5 != ((vc) this).field_l) {
                          break L1;
                        } else {
                          if (null == ((vc) this).field_n) {
                            break L1;
                          } else {
                            if (!((vc) this).field_n.equals((Object) (Object) param2)) {
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
            ((vc) this).field_o = param7;
            ((vc) this).field_k = param6;
            ((vc) this).field_m = param0;
            ((vc) this).field_e = param3;
            ((vc) this).field_l = param5;
            ((vc) this).field_n = param2;
            ((vc) this).field_d = false;
            ((vc) this).field_p = param4;
            var16 = new String[param1 + param4.b(param2, param5)];
            var17 = var16;
            var10 = Math.max(1, param4.a(param2, new int[1], var17));
            if (((vc) this).field_m != 3) {
              break L2;
            } else {
              if (-2 != var10) {
                break L2;
              } else {
                ((vc) this).field_m = 1;
                break L2;
              }
            }
          }
          L3: {
            ((vc) this).field_a = new lk[var10];
            if (-1 != ((vc) this).field_m) {
              if (-2 != (((vc) this).field_m ^ -1)) {
                if (((vc) this).field_m == 2) {
                  var11 = -param4.field_q + ((vc) this).field_o - var10 * ((vc) this).field_e;
                  break L3;
                } else {
                  L4: {
                    var12 = (-(((vc) this).field_e * var10) + ((vc) this).field_o) / (var10 - -1);
                    if ((var12 ^ -1) > -1) {
                      var12 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((vc) this).field_e = ((vc) this).field_e + var12;
                  var11 = param4.field_o - -var12;
                  break L3;
                }
              } else {
                var11 = param4.field_o + (((vc) this).field_o - ((vc) this).field_e * var10 >> 802420961);
                break L3;
              }
            } else {
              var11 = param4.field_o;
              break L3;
            }
          }
          var12 = 0;
          L5: while (true) {
            if (var12 >= var10) {
              return;
            } else {
              L6: {
                var13 = var16[var12];
                stackOut_30_0 = null;
                stackOut_30_1 = null;
                stackOut_30_2 = -param4.field_o + var11;
                stackOut_30_3 = var11 + param4.field_q;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_32_2 = stackOut_30_2;
                stackIn_32_3 = stackOut_30_3;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                stackIn_31_2 = stackOut_30_2;
                stackIn_31_3 = stackOut_30_3;
                if (var13 == null) {
                  stackOut_32_0 = null;
                  stackOut_32_1 = null;
                  stackOut_32_2 = stackIn_32_2;
                  stackOut_32_3 = stackIn_32_3;
                  stackOut_32_4 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  stackIn_33_4 = stackOut_32_4;
                  break L6;
                } else {
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = stackIn_31_2;
                  stackOut_31_3 = stackIn_31_3;
                  stackOut_31_4 = var13.length();
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_33_4 = stackOut_31_4;
                  break L6;
                }
              }
              L7: {
                new lk(stackIn_33_2, stackIn_33_3, stackIn_33_4);
                var14 = stackIn_33_0;
                var14.field_c[0] = 0;
                if (var13 == null) {
                  break L7;
                } else {
                  L8: {
                    var14.field_c[var13.length()] = param4.a(var13);
                    if (param6 != 3) {
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      break L8;
                    } else {
                      stackOut_35_0 = ((vc) this).a(-116, param4.a(var13), param5, var13);
                      stackIn_37_0 = stackOut_35_0;
                      break L8;
                    }
                  }
                  qb.a(stackIn_37_0, var14, var13, 60, param4);
                  break L7;
                }
              }
              ((vc) this).field_a[var12] = var14;
              var11 = var11 + param3;
              var12++;
              continue L5;
            }
          }
        } else {
          ((vc) this).field_a = null;
          return;
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        if (param0 != -1) {
            field_h = 119;
        }
        nj var3 = (nj) (Object) pb.field_t.g(0);
        nj var1 = var3;
        if (var1 != null) {
            var2 = eh.field_c;
            ma.a(var2, 10, tl.field_h, (byte) -92, jf.field_c, ll.field_h);
            sl.field_f[var3.field_h].f(25, var2 + (-32 + (tl.field_h + -15)) / 2);
            int discarded$0 = dd.field_G.a(pg.field_a[var3.field_h], 67, 15 + var2, jf.field_c + -42 + -30, tl.field_h + -30, 0, -1, 1, 1, 30);
        }
    }

    private final lk a(int param0, int param1, m param2, String param3) {
        lk var7 = new lk(param1 + -param2.field_o, param1 - -param2.field_q, param3.length());
        lk var5 = var7;
        if (param0 != -1) {
            Object var6 = null;
            ((vc) this).a(-65, -103, (String) null, -76, (m) null, -99, 20, -32);
        }
        ((vc) this).field_a = new lk[]{var7};
        return var5;
    }

    public static void b(byte param0) {
        field_g = null;
        field_j = null;
        field_f = null;
        int var1 = 78 % ((-20 - param0) / 33);
    }

    public vc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
    }
}
