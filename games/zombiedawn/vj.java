/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class vj extends al {
    static String field_s;
    static int[] field_t;
    static byte[][] field_m;
    static String[] field_p;
    static int field_q;
    static long field_n;
    private vn field_r;
    static int field_o;
    private vn field_u;

    final void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (param0 == -31645) {
            break L0;
          } else {
            field_s = null;
            break L0;
          }
        }
        L1: {
          if (kg.field_i == 98) {
            if ((((vj) this).field_b.field_d ^ -1) > -3) {
              if (0 >= ((vj) this).field_b.field_d) {
                break L1;
              } else {
                ((vj) this).field_b.b(((vj) this).field_b.field_d - 1, param0 ^ 31727);
                break L1;
              }
            } else {
              ((vj) this).field_b.b(1, 64);
              break L1;
            }
          } else {
            if (99 != kg.field_i) {
              if ((kg.field_i ^ -1) != -97) {
                if (97 != kg.field_i) {
                  super.a(-31645);
                  break L1;
                } else {
                  if (-3 < (((vj) this).field_b.field_d ^ -1)) {
                    break L1;
                  } else {
                    if (-1 + ((vj) this).field_b.field_h > ((vj) this).field_b.field_d) {
                      super.a(-31645);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                if (((vj) this).field_b.field_d >= 3) {
                  super.a(-31645);
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              if (-3 < (((vj) this).field_b.field_d ^ -1)) {
                ((vj) this).field_b.b(((vj) this).field_b.field_d - -1, param0 + 31551);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        aj var15 = null;
        StringWriter var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        L0: {
          var14 = ZombieDawn.field_J;
          if (param0 instanceof aj) {
            var15 = (aj) (Object) param0;
            var2 = var15.field_b + " | ";
            var12 = var2;
            var2 = var12;
            var12 = var2;
            param0 = var15.field_c;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var16);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var16.toString();
        var12 = var5;
        var2 = var12;
        var12 = var5;
        var7 = 25 % ((13 - param1) / 47);
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var8 = var6.readLine();
        var12 = var8;
        var2 = var12;
        var12 = var8;
        L1: while (true) {
          var9 = var6.readLine();
          var12 = var9;
          var2 = var12;
          var12 = var9;
          if (var9 == null) {
            var2 = var2 + "| " + var8;
            return var2;
          } else {
            L2: {
              var10 = var9.indexOf('(');
              var11 = var9.indexOf(')', 1 + var10);
              if (0 == (var10 ^ -1)) {
                var12 = var9;
                var2 = var12;
                var2 = var12;
                break L2;
              } else {
                var12 = var9.substring(0, var10);
                break L2;
              }
            }
            L3: {
              var17 = var12.trim();
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf(' ') - -1);
              var2 = var18;
              var2 = var18;
              var19 = var18.substring(1 + var18.lastIndexOf('\t'));
              var2 = var19;
              var2 = var19;
              var20 = var2 + var19;
              var2 = var20;
              var2 = var20;
              if (var10 == -1) {
                break L3;
              } else {
                if (-1 != var11) {
                  var13 = var9.indexOf(".java:", var10);
                  if ((var13 ^ -1) > -1) {
                    break L3;
                  } else {
                    var2 = var20 + var9.substring(5 + var13, var11);
                    break L3;
                  }
                } else {
                  var2 = var2 + 32;
                  continue L1;
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          }
        }
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
            return -21;
        }
        if (po.w(13296)) {
            if (-1 != param1) {
                return ((vj) this).c(param1, 6) - -100;
            }
            return 350 + ((vj) this).c(param1, 6);
        }
        if (-3 > param1) {
            return jb.field_a[1].field_w + (vh.field_b - -30);
        }
        return 180 + ((vj) this).c(param1, 6);
    }

    final static void d(int param0) {
        ng.field_a = new fk();
        bm.field_d.b(20, (ga) (Object) ng.field_a);
        int var1 = 54 / ((-28 - param0) / 39);
    }

    final int b(int param0, boolean param1) {
        if (!param1) {
            Object var4 = null;
            v discarded$0 = vj.a((dj) null, (String) null, (String) null, -46);
        }
        if (!po.w(13296)) {
            if (param0 < 2) {
                return jb.field_a[1].field_t;
            }
        }
        return super.b(param0, true);
    }

    public static void e(byte param0) {
        field_m = null;
        if (param0 != 112) {
            field_t = null;
        }
        field_s = null;
        field_p = null;
        field_t = null;
    }

    vj(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void a(byte param0) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        tj var5 = null;
        jc var6 = null;
        String[] var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var14 = 0;
        int[] var18 = null;
        int stackIn_32_0 = 0;
        String stackIn_49_0 = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        String stackOut_48_0 = null;
        String stackOut_47_0 = null;
        L0: {
          var14 = ZombieDawn.field_J;
          super.a((byte) -51);
          li.a(false);
          if (((vj) this).field_r == null) {
            ((vj) this).field_r = new vn(100, 100);
            ki.a((byte) -92, ((vj) this).field_r);
            bi.d();
            jb.field_a[1].b(25, 25);
            var3 = 0;
            L1: while (true) {
              if (var3 >= 5) {
                bi.h(2, 2, 0, 0, 100, 100);
                pa.a(-21189);
                ((vj) this).field_u = new vn(100, 100);
                ki.a((byte) -94, ((vj) this).field_u);
                bi.d();
                jb.field_a[1].b(25, 25);
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 2) {
                    pa.a(-21189);
                    break L0;
                  } else {
                    so.a(16777215);
                    var3++;
                    continue L2;
                  }
                }
              } else {
                so.a(4424743);
                var3++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (po.w(13296)) {
            var2 = r.field_I;
            break L3;
          } else {
            var3 = nh.field_G + -45;
            var4 = vh.field_b - -30;
            var5_int = 0;
            L4: while (true) {
              if (2 <= var5_int) {
                L5: {
                  if (null == bd.field_m) {
                    bd.field_m = fg.a(3, 10, 1, qm.field_b + 42, 1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var5 = sg.field_jb;
                var6 = bd.field_m;
                if (!var6.field_j) {
                  var2 = jh.field_l;
                  break L3;
                } else {
                  L6: {
                    if (null == var6.field_m) {
                      break L6;
                    } else {
                      if (var6.field_k != null) {
                        var2 = r.field_I;
                        var7 = var6.field_m[ad.field_e];
                        var18 = var6.field_k[ad.field_e];
                        var9 = ph.a(wi.field_b, (byte) -93, ad.field_e, var6);
                        var3 = var5.field_I + (89 + id.field_M);
                        var5.a(q.field_G[qm.field_b], bd.field_d, var3, 10, 0);
                        var3 = var3 + (var5.field_I - -10);
                        var5.b(og.field_z, 220 + (vh.field_b + -30), var3, 2, 0);
                        var5.c(lo.field_r, -10 + (220 + vh.field_b), var3, 2, 0);
                        var5.b(ZombieDawn.field_D, 20 + (440 + vh.field_b), var3, 2, 0);
                        var3 += 25;
                        var10 = 0;
                        L7: while (true) {
                          if (10 <= var10) {
                            if (vl.field_b == null) {
                              break L3;
                            } else {
                              if (var9 != -1) {
                                break L3;
                              } else {
                                if (qm.field_b != vl.field_b.field_bb) {
                                  break L3;
                                } else {
                                  var10 = 16776960;
                                  bj.field_q.c(ce.field_r, 220 + vh.field_b, var3, var10, 0);
                                  bj.field_q.b(Integer.toString(vl.field_b.field_G), vh.field_b + 440, var3, var10, 0);
                                  break L3;
                                }
                              }
                            }
                          } else {
                            L8: {
                              if (var9 == var10) {
                                stackOut_31_0 = 16776960;
                                stackIn_32_0 = stackOut_31_0;
                                break L8;
                              } else {
                                stackOut_30_0 = 16777215;
                                stackIn_32_0 = stackOut_30_0;
                                break L8;
                              }
                            }
                            var11 = stackIn_32_0;
                            if (null != var7[var10]) {
                              L9: {
                                var12 = var18[var10];
                                var13 = var7[var10];
                                if (var9 == var10) {
                                  var11 = 16776960;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              bj.field_q.b(var10 + 1 + ". ", -40 + (220 + vh.field_b), var3, var11, 0);
                              bj.field_q.c(var13, vh.field_b - -220, var3, var11, 0);
                              var2 = "";
                              bj.field_q.b(qi.a(true, 0, jp.field_a, (long)var12, (byte) 113), vh.field_b + 440, var3, var11, 0);
                              var3 += 20;
                              var10++;
                              continue L7;
                            } else {
                              var3 += 20;
                              var10++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2 = oj.field_g;
                  break L3;
                }
              } else {
                if (qm.field_b == var5_int) {
                  L10: {
                    if (var5_int != ((vj) this).field_b.field_d) {
                      break L10;
                    } else {
                      ((vj) this).field_u.b(var4 - 25, var3 - 25);
                      break L10;
                    }
                  }
                  ((vj) this).field_r.b(var4 - 25, var3 - 25, 240);
                  jb.field_a[var5_int - -1].b(var4, var3);
                  var3 += 90;
                  var5_int++;
                  continue L4;
                } else {
                  if (((vj) this).field_b.field_d == var5_int) {
                    ((vj) this).field_u.b(-25 + var4, -25 + var3);
                    jb.field_a[1 + var5_int].d(var4, var3, 240);
                    var3 += 90;
                    var5_int++;
                    continue L4;
                  } else {
                    jb.field_a[1 + var5_int].d(var4, var3, 192);
                    var3 += 90;
                    var5_int++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        L11: {
          var3 = 6 + id.field_M - -89 - -sg.field_jb.field_I - -100;
          sg.field_jb.a(var2, vh.field_b + 330, var3, 0, 0);
          if (param0 <= -35) {
            break L11;
          } else {
            ((vj) this).field_u = null;
            break L11;
          }
        }
        L12: {
          if (po.w(13296)) {
            stackOut_48_0 = rn.field_a;
            stackIn_49_0 = stackOut_48_0;
            break L12;
          } else {
            stackOut_47_0 = k.field_r;
            stackIn_49_0 = stackOut_47_0;
            break L12;
          }
        }
        var2 = stackIn_49_0;
        bj.field_q.a(var2, bd.field_d, id.field_M + 412, 14540253, 3355443);
    }

    final int a(int param0, int param1) {
        if (po.w(13296)) {
            return id.field_M + ((vj) this).field_k;
        }
        if (2 > param0) {
            return 90 * param0 + (-90 + nh.field_G - -45);
        }
        if (param1 != -1) {
            vj.d(63);
        }
        return id.field_M + ((vj) this).field_k;
    }

    final static void c(int param0) {
        int var2 = ZombieDawn.field_J;
        le var1 = kn.field_L.b((byte) 26);
        while (var1 instanceof tm) {
            hn discarded$0 = aa.a(119, ((tm) (Object) var1).field_j);
            var1 = var1.field_b;
        }
        var1 = se.field_m.b((byte) 26);
        while (var1 instanceof tm) {
            hn discarded$1 = aa.a(10, ((tm) (Object) var1).field_j);
            var1 = var1.field_b;
        }
        var1 = rm.field_e.b((byte) 26);
        if (param0 < 8) {
            vj.d(4);
        }
        while (var1 instanceof tm) {
            hn discarded$2 = aa.a(48, ((tm) (Object) var1).field_j);
            var1 = var1.field_b;
        }
    }

    final void d(byte param0) {
        if (qm.field_b != ((vj) this).field_b.field_d) {
            qm.field_b = ((vj) this).field_b.field_d;
            bd.field_m = null;
        }
        int var2 = -113 % ((param0 - -78) / 35);
    }

    final int c(int param0, int param1) {
        int var3 = 0;
        if (param1 != 6) {
            field_q = -82;
        }
        if (!po.w(13296)) {
            if (!((param0 ^ -1) <= -3)) {
                return 30 + vh.field_b;
            }
            param0 -= 2;
            var3 = vh.field_b - (-((vj) this).field_g - param0 * 176);
            return param0 != 3 ? var3 : -32 + var3;
        }
        return (-1 == (param0 ^ -1) ? 50 : 470) + vh.field_b;
    }

    final static v a(dj param0, String param1, String param2, int param3) {
        int var4 = param0.a(param2, (byte) 8);
        int var5 = param0.a(var4, param1, true);
        if (param3 != 4424743) {
            field_t = null;
        }
        return wg.a(var5, param0, -28490, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[4];
        field_p = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_s = "Retry (<%0> Left)";
    }
}
