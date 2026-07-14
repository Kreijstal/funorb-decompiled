/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class w extends tn {
    static me field_W;
    private int field_O;
    private ea field_Q;
    static String field_T;
    static String field_X;
    static String[] field_P;
    private String field_U;
    private jm field_V;
    static int[] field_R;
    static int field_S;

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        int var6 = 0;
        BufferedReader var7 = null;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        db var15 = null;
        StringWriter var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        L0: {
          var14 = MinerDisturbance.field_ab;
          if (!(param0 instanceof db)) {
            var2 = "";
            var12 = var2;
            break L0;
          } else {
            var15 = (db) (Object) param0;
            var2 = var15.field_a + " | ";
            param0 = var15.field_c;
            break L0;
          }
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var16);
        param0.printStackTrace(var4);
        var6 = -10 % ((16 - param1) / 41);
        var4.close();
        var5 = var16.toString();
        var2 = var5;
        var12 = var5;
        var7 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var8 = var7.readLine();
        var2 = var8;
        var12 = var8;
        L1: while (true) {
          var9 = var7.readLine();
          var2 = var9;
          var12 = var9;
          var2 = var12;
          if (var9 != null) {
            L2: {
              var10 = var9.indexOf('(');
              var11 = var9.indexOf(')', var10 - -1);
              if (var10 != -1) {
                var12 = var9.substring(0, var10);
                var2 = var12;
                var2 = var12;
                break L2;
              } else {
                var12 = var9;
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
              var19 = var18.substring(var18.lastIndexOf('\t') - -1);
              var2 = var19;
              var2 = var19;
              var20 = var2 + var19;
              var2 = var20;
              var2 = var20;
              if (-1 == var10) {
                break L3;
              } else {
                if (0 != (var11 ^ -1)) {
                  var13 = var9.indexOf(".java:", var10);
                  if (-1 < (var13 ^ -1)) {
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
          } else {
            var2 = var12;
            var12 = var2;
            var2 = var12;
            var2 = var2 + "| " + var8;
            return var2;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ag var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ea var16 = null;
        String var17 = null;
        Object var18 = null;
        cf var18_ref = null;
        ea var19 = null;
        ea var20 = null;
        ea var21 = null;
        String var22 = null;
        Object var23 = null;
        cf var23_ref = null;
        ea var24 = null;
        ea var25 = null;
        ea var26 = null;
        String var27 = null;
        Object var28 = null;
        cf var28_ref = null;
        ea var29 = null;
        ea var30 = null;
        ea var31 = null;
        String var32 = null;
        Object var33 = null;
        cf var33_ref = null;
        ea var34 = null;
        ea var35 = null;
        ea var36 = null;
        var18 = null;
        var23 = null;
        var28 = null;
        var33 = null;
        var13 = MinerDisturbance.field_ab;
        var6 = ((w) this).field_V.b(24595);
        if (nn.field_f != var6) {
          if (var6 != bm.field_o) {
            var27 = ((w) this).field_V.a(param0 + 7316);
            if (var27 == null) {
              L0: {
                var32 = ((w) this).field_U;
                if (var32.equals((Object) (Object) ((w) this).field_s)) {
                  break L0;
                } else {
                  ((w) this).field_s = var32;
                  ((w) this).a((byte) -108);
                  break L0;
                }
              }
              L1: {
                super.a(param0, param1, param2, param3);
                var6 = ((w) this).field_V.b(24595);
                var33_ref = (cf) (Object) ((w) this).field_A;
                var9 = ((w) this).field_u + param1;
                var10 = var33_ref.b(100, (fe) this, param2) + (var33_ref.c(param0 ^ 4, (fe) this).b(117) >> -2023520415);
                if (var6 == nn.field_f) {
                  break L1;
                } else {
                  if (var6 == bm.field_o) {
                    break L1;
                  } else {
                    if (fg.field_d != var6) {
                      if (sc.field_a != var6) {
                        return;
                      } else {
                        var35 = ed.field_g[1];
                        var35.g(var9, var10 + -(var35.field_C >> -1275696383), 256);
                        return;
                      }
                    } else {
                      var34 = ed.field_g[2];
                      var34.g(var9, var10 + -(var34.field_C >> 1480013185), 256);
                      return;
                    }
                  }
                }
              }
              var36 = ed.field_g[0];
              var16 = var36;
              var11 = var36.field_x << 1272395393;
              var12 = var36.field_A << -1150482015;
              if (null != ((w) this).field_Q) {
                if (((w) this).field_Q.field_y < var11) {
                  ((w) this).field_Q = new ea(var11, var12);
                  vb.a(((w) this).field_Q, 126);
                  var36.b(112, 144, var36.field_x << 1836675524, var36.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                  tk.b(true);
                  ((w) this).field_Q.g(var9 + -(var36.field_x >> -65904031), var10 + -var36.field_A, 256);
                  return;
                } else {
                  if (((w) this).field_Q.field_C >= var12) {
                    vb.a(((w) this).field_Q, 127);
                    eh.d();
                    var36.b(112, 144, var36.field_x << 1836675524, var36.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                    tk.b(true);
                    ((w) this).field_Q.g(var9 + -(var36.field_x >> -65904031), var10 + -var36.field_A, 256);
                    return;
                  } else {
                    ((w) this).field_Q = new ea(var11, var12);
                    vb.a(((w) this).field_Q, 126);
                    var36.b(112, 144, var36.field_x << 1836675524, var36.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                    tk.b(true);
                    ((w) this).field_Q.g(var9 + -(var36.field_x >> -65904031), var10 + -var36.field_A, 256);
                    return;
                  }
                }
              } else {
                ((w) this).field_Q = new ea(var11, var12);
                vb.a(((w) this).field_Q, 126);
                var36.b(112, 144, var36.field_x << 1836675524, var36.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                tk.b(true);
                ((w) this).field_Q.g(var9 + -(var36.field_x >> -65904031), var10 + -var36.field_A, 256);
                return;
              }
            } else {
              L2: {
                if (var27.equals((Object) (Object) ((w) this).field_s)) {
                  break L2;
                } else {
                  ((w) this).field_s = var27;
                  ((w) this).a((byte) -108);
                  break L2;
                }
              }
              L3: {
                super.a(param0, param1, param2, param3);
                var6 = ((w) this).field_V.b(24595);
                var28_ref = (cf) (Object) ((w) this).field_A;
                var9 = ((w) this).field_u + param1;
                var10 = var28_ref.b(100, (fe) this, param2) + (var28_ref.c(param0 ^ 4, (fe) this).b(117) >> -2023520415);
                if (var6 == nn.field_f) {
                  break L3;
                } else {
                  if (var6 == bm.field_o) {
                    break L3;
                  } else {
                    if (fg.field_d != var6) {
                      if (sc.field_a == var6) {
                        var30 = ed.field_g[1];
                        var30.g(var9, var10 + -(var30.field_C >> -1275696383), 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var29 = ed.field_g[2];
                      var29.g(var9, var10 + -(var29.field_C >> 1480013185), 256);
                      return;
                    }
                  }
                }
              }
              var31 = ed.field_g[0];
              var11 = var31.field_x << 1272395393;
              var12 = var31.field_A << -1150482015;
              if (null != ((w) this).field_Q) {
                if (((w) this).field_Q.field_y >= var11) {
                  if (((w) this).field_Q.field_C >= var12) {
                    vb.a(((w) this).field_Q, 127);
                    eh.d();
                    var31.b(112, 144, var31.field_x << 1836675524, var31.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                    tk.b(true);
                    ((w) this).field_Q.g(var9 + -(var31.field_x >> -65904031), var10 + -var31.field_A, 256);
                    return;
                  } else {
                    ((w) this).field_Q = new ea(var11, var12);
                    vb.a(((w) this).field_Q, 126);
                    var31.b(112, 144, var31.field_x << 1836675524, var31.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                    tk.b(true);
                    ((w) this).field_Q.g(var9 + -(var31.field_x >> -65904031), var10 + -var31.field_A, 256);
                    return;
                  }
                } else {
                  ((w) this).field_Q = new ea(var11, var12);
                  vb.a(((w) this).field_Q, 126);
                  var31.b(112, 144, var31.field_x << 1836675524, var31.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                  tk.b(true);
                  ((w) this).field_Q.g(var9 + -(var31.field_x >> -65904031), var10 + -var31.field_A, 256);
                  return;
                }
              } else {
                ((w) this).field_Q = new ea(var11, var12);
                vb.a(((w) this).field_Q, 126);
                var31.b(112, 144, var31.field_x << 1836675524, var31.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                tk.b(true);
                ((w) this).field_Q.g(var9 + -(var31.field_x >> -65904031), var10 + -var31.field_A, 256);
                return;
              }
            }
          } else {
            L4: {
              var22 = in.field_c;
              if (var22.equals((Object) (Object) ((w) this).field_s)) {
                break L4;
              } else {
                ((w) this).field_s = var22;
                ((w) this).a((byte) -108);
                break L4;
              }
            }
            L5: {
              super.a(param0, param1, param2, param3);
              var6 = ((w) this).field_V.b(24595);
              var23_ref = (cf) (Object) ((w) this).field_A;
              var9 = ((w) this).field_u + param1;
              var10 = var23_ref.b(100, (fe) this, param2) + (var23_ref.c(param0 ^ 4, (fe) this).b(117) >> -2023520415);
              if (var6 == nn.field_f) {
                break L5;
              } else {
                if (var6 == bm.field_o) {
                  break L5;
                } else {
                  if (fg.field_d != var6) {
                    if (sc.field_a != var6) {
                      return;
                    } else {
                      var25 = ed.field_g[1];
                      var25.g(var9, var10 + -(var25.field_C >> -1275696383), 256);
                      return;
                    }
                  } else {
                    var24 = ed.field_g[2];
                    var24.g(var9, var10 + -(var24.field_C >> 1480013185), 256);
                    return;
                  }
                }
              }
            }
            var26 = ed.field_g[0];
            var11 = var26.field_x << 1272395393;
            var12 = var26.field_A << -1150482015;
            if (null != ((w) this).field_Q) {
              if (((w) this).field_Q.field_y >= var11) {
                if (((w) this).field_Q.field_C < var12) {
                  ((w) this).field_Q = new ea(var11, var12);
                  vb.a(((w) this).field_Q, 126);
                  var26.b(112, 144, var26.field_x << 1836675524, var26.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                  tk.b(true);
                  ((w) this).field_Q.g(var9 + -(var26.field_x >> -65904031), var10 + -var26.field_A, 256);
                  return;
                } else {
                  vb.a(((w) this).field_Q, 127);
                  eh.d();
                  var26.b(112, 144, var26.field_x << 1836675524, var26.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                  tk.b(true);
                  ((w) this).field_Q.g(var9 + -(var26.field_x >> -65904031), var10 + -var26.field_A, 256);
                  return;
                }
              } else {
                ((w) this).field_Q = new ea(var11, var12);
                vb.a(((w) this).field_Q, 126);
                var26.b(112, 144, var26.field_x << 1836675524, var26.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                tk.b(true);
                ((w) this).field_Q.g(var9 + -(var26.field_x >> -65904031), var10 + -var26.field_A, 256);
                return;
              }
            } else {
              ((w) this).field_Q = new ea(var11, var12);
              vb.a(((w) this).field_Q, 126);
              var26.b(112, 144, var26.field_x << 1836675524, var26.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
              tk.b(true);
              ((w) this).field_Q.g(var9 + -(var26.field_x >> -65904031), var10 + -var26.field_A, 256);
              return;
            }
          }
        } else {
          L6: {
            var17 = in.field_c;
            if (var17.equals((Object) (Object) ((w) this).field_s)) {
              break L6;
            } else {
              ((w) this).field_s = var17;
              ((w) this).a((byte) -108);
              break L6;
            }
          }
          L7: {
            super.a(param0, param1, param2, param3);
            var6 = ((w) this).field_V.b(24595);
            var18_ref = (cf) (Object) ((w) this).field_A;
            var9 = ((w) this).field_u + param1;
            var10 = var18_ref.b(100, (fe) this, param2) + (var18_ref.c(param0 ^ 4, (fe) this).b(117) >> -2023520415);
            if (var6 == nn.field_f) {
              break L7;
            } else {
              if (var6 == bm.field_o) {
                break L7;
              } else {
                if (fg.field_d != var6) {
                  if (sc.field_a != var6) {
                    return;
                  } else {
                    var20 = ed.field_g[1];
                    var20.g(var9, var10 + -(var20.field_C >> -1275696383), 256);
                    return;
                  }
                } else {
                  var19 = ed.field_g[2];
                  var19.g(var9, var10 + -(var19.field_C >> 1480013185), 256);
                  return;
                }
              }
            }
          }
          var21 = ed.field_g[0];
          var11 = var21.field_x << 1272395393;
          var12 = var21.field_A << -1150482015;
          if (null != ((w) this).field_Q) {
            if (((w) this).field_Q.field_y >= var11) {
              if (((w) this).field_Q.field_C < var12) {
                ((w) this).field_Q = new ea(var11, var12);
                vb.a(((w) this).field_Q, 126);
                var21.b(112, 144, var21.field_x << 1836675524, var21.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                tk.b(true);
                ((w) this).field_Q.g(var9 + -(var21.field_x >> -65904031), var10 + -var21.field_A, 256);
                return;
              } else {
                vb.a(((w) this).field_Q, 127);
                eh.d();
                var21.b(112, 144, var21.field_x << 1836675524, var21.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
                tk.b(true);
                ((w) this).field_Q.g(var9 + -(var21.field_x >> -65904031), var10 + -var21.field_A, 256);
                return;
              }
            } else {
              ((w) this).field_Q = new ea(var11, var12);
              vb.a(((w) this).field_Q, 126);
              var21.b(112, 144, var21.field_x << 1836675524, var21.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
              tk.b(true);
              ((w) this).field_Q.g(var9 + -(var21.field_x >> -65904031), var10 + -var21.field_A, 256);
              return;
            }
          } else {
            ((w) this).field_Q = new ea(var11, var12);
            vb.a(((w) this).field_Q, 126);
            var21.b(112, 144, var21.field_x << 1836675524, var21.field_A << 928229764, -((w) this).field_O << 1011006122, 4096);
            tk.b(true);
            ((w) this).field_Q.g(var9 + -(var21.field_x >> -65904031), var10 + -var21.field_A, 256);
            return;
          }
        }
    }

    w(jm param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ad) (Object) oa.a(0));
        ((w) this).field_U = param1;
        ((w) this).field_V = param0;
        ((w) this).a(param5, -101, param2, param4, param3);
    }

    final String h(int param0) {
        if (param0 == -27867) {
            return null;
        }
        field_W = null;
        return null;
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        ((w) this).field_O = ((w) this).field_O + 1;
        if (param2 <= 49) {
          field_P = null;
          super.a(param0, param1, (byte) 98, param3);
          return;
        } else {
          super.a(param0, param1, (byte) 98, param3);
          return;
        }
    }

    final boolean a(fe param0, int param1) {
        if (param1 < 119) {
            ((w) this).field_O = -33;
            return false;
        }
        return false;
    }

    public static void m(int param0) {
        field_P = null;
        if (param0 != 256) {
            return;
        }
        field_T = null;
        field_X = null;
        field_R = null;
        field_W = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_X = "Waiting for music";
    }
}
