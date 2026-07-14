/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static String field_n;
    private int field_a;
    fe field_u;
    static boolean field_o;
    static String field_q;
    private boolean field_b;
    fe field_m;
    fe field_w;
    int field_g;
    fe field_h;
    fe field_j;
    int field_c;
    int field_l;
    static String field_f;
    static int field_t;
    int field_p;
    ok field_i;
    static String field_r;
    static java.applet.Applet field_d;
    int field_s;
    int field_e;
    int field_v;
    static java.applet.Applet field_k;

    final static rm a(int param0, hb param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        var2 = param1.g(8, param0 ^ 30035);
        if (var2 <= 0) {
          L0: {
            var3 = sm.a(37, param1) ? 1 : 0;
            var4 = sm.a(-128, param1) ? 1 : 0;
            var5 = new rm();
            var5.field_b = (short)param1.g(16, 0);
            var5.field_x = bn.a(param0 ^ 30035, param1, var5.field_x, 16);
            var5.field_v = bn.a(0, param1, var5.field_v, 16);
            var5.field_F = bn.a(0, param1, var5.field_F, 16);
            var5.field_w = (short)param1.g(16, 0);
            var5.field_z = bn.a(0, param1, var5.field_z, 16);
            var5.field_m = bn.a(param0 + -30035, param1, var5.field_m, 16);
            var5.field_J = bn.a(0, param1, var5.field_J, 16);
            if (var3 != 0) {
              var5.field_g = (short)param1.g(16, 0);
              var5.field_E = bn.a(0, param1, var5.field_E, 16);
              var5.field_y = bn.a(param0 ^ 30035, param1, var5.field_y, 16);
              var5.field_r = bn.a(0, param1, var5.field_r, 16);
              var5.field_j = bn.a(0, param1, var5.field_j, 16);
              var5.field_l = bn.a(0, param1, var5.field_l, 16);
              var5.field_o = bn.a(0, param1, var5.field_o, 16);
              break L0;
            } else {
              break L0;
            }
          }
          if (var4 == 0) {
            L1: {
              if (sm.a(-127, param1)) {
                var5.field_a = bn.a(param0 + -30035, param1, var5.field_a, 16);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 30035) {
              if (sm.a(119, param1)) {
                var5.field_P = pc.a(var5.field_P, (byte) -126, param1, 16);
                var6 = 0;
                var7 = 0;
                L2: while (true) {
                  if (var5.field_P.length <= var7) {
                    if (var6 != 0) {
                      var5.field_A = (byte)(1 + var6);
                      return var5;
                    } else {
                      var5.field_P = null;
                      return var5;
                    }
                  } else {
                    if ((var5.field_P[var7] & 255) > var6) {
                      var6 = 255 & var5.field_P[var7];
                      var7++;
                      continue L2;
                    } else {
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                return var5;
              }
            } else {
              return null;
            }
          } else {
            L3: {
              int discarded$4 = param1.g(16, 0);
              var5.field_h = bn.a(0, param1, var5.field_h, 16);
              var5.field_u = bn.a(param0 ^ 30035, param1, var5.field_u, 16);
              var5.field_k = bn.a(0, param1, var5.field_k, 16);
              var5.field_G = bn.a(0, param1, var5.field_G, 16);
              var5.field_C = bn.a(0, param1, var5.field_C, 16);
              if (sm.a(-127, param1)) {
                var5.field_a = bn.a(param0 + -30035, param1, var5.field_a, 16);
                break L3;
              } else {
                break L3;
              }
            }
            if (param0 == 30035) {
              if (sm.a(119, param1)) {
                L4: {
                  var5.field_P = pc.a(var5.field_P, (byte) -126, param1, 16);
                  var6 = 0;
                  var7 = 0;
                  if (var5.field_P.length <= var7) {
                    break L4;
                  } else {
                    L5: {
                      if ((var5.field_P[var7] & 255) > var6) {
                        var6 = 255 & var5.field_P[var7];
                        break L5;
                      } else {
                        var7++;
                        break L5;
                      }
                    }
                    var7++;
                    var7++;
                    var7++;
                    break L4;
                  }
                }
                if (var6 != 0) {
                  var5.field_A = (byte)(1 + var6);
                  return var5;
                } else {
                  var5.field_P = null;
                  return var5;
                }
              } else {
                return var5;
              }
            } else {
              return null;
            }
          }
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    final void a(boolean param0, ok param1) {
        int var7_int = 0;
        int var15 = Confined.field_J ? 1 : 0;
        vf var17 = new vf(param1, 2, 2, 2236962, 1, 1, 1, param1.field_C + param1.field_D + 2);
        ((kc) this).field_m = (fe) (Object) var17;
        var17.field_i = 16777215;
        qh var4 = new qh();
        var17.a(param0, (vf) (Object) var4);
        ((kc) this).field_v = 3;
        ((kc) this).field_a = 15658734;
        ((kc) this).field_e = 3;
        var4.field_m = 15658734;
        ((kc) this).field_i = param1;
        ((kc) this).field_p = 5592405;
        ((kc) this).field_l = 3;
        var4.field_g = 11711154;
        ((kc) this).field_g = 15658734;
        ((kc) this).field_c = -1;
        ((kc) this).field_s = 3;
        pn discarded$12 = var4.b(0, -69).a(1918, 15658734).a(-1, en.a(!param0 ? true : false, 8947848, 7829367, 10066329));
        pn discarded$13 = var4.b(1, -57).a(-1, en.a(!param0 ? true : false, 11184810, 13421772, 10066329));
        pn discarded$14 = var4.b(3, -62).a(-1, en.a(true, 8947848, 10066329, 7829367)).b(1, -2147483648).d(1, -2);
        nf[] var5 = new nf[9];
        pd var16 = new pd(32, 32);
        pd var18 = var16;
        for (var7_int = 0; var18.field_z.length > var7_int; var7_int++) {
            var16.field_z[var7_int] = 1077952576;
        }
        var5[4] = (nf) (Object) var18;
        pn discarded$15 = var4.b(4, -90).a(true, 0).a(-1, var5);
        pn discarded$16 = var4.b(5, -97).a(-1, em.a(0, 0, 65793, (byte) 2, 0)).a(true, 0).a(1918, -1);
        ((kc) this).field_h = (fe) (Object) var4;
        qh var6 = new qh(var4, true);
        var6.field_p = 0;
        qh var7 = new qh(var4, true);
        var7.field_p = 0;
        var7.a((byte) -86, jf.a(8947848, (byte) 99));
        pn discarded$17 = var7.b(1, -93).a(-1, jf.a(11184810, (byte) 86)).a(1918, 2236962);
        ((kc) this).field_j = (fe) (Object) new b(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        li discarded$18 = new li(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        rc discarded$19 = new rc(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        qh var8 = new qh();
        var17.a(false, (vf) (Object) var8);
        pn discarded$20 = var8.b(0, -69).a(-1, en.a(!param0 ? true : false, 15658734, 10066329, 7829367)).a(1918, 1118481).c(-1, 97);
        pn discarded$21 = var8.b(4, -106).a(true, 0).a(-1, var5);
        ((kc) this).field_u = (fe) (Object) var8;
        nf[] var9 = new nf[9];
        nf[] var10 = new nf[9];
        var9[4] = new nf(2, 1);
        var10[4] = new nf(1, 2);
        var9[4].field_z = new int[]{6710886, 7829367};
        var10[4].field_z = new int[]{6710886, 7829367};
        qh var11 = new qh();
        qh var12 = new qh();
        var11.a((byte) -70, var9, 0);
        var12.a((byte) 69, var10, 0);
        nf var13 = new nf(7, 4);
        var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        qh var14 = new qh(var4, true);
        var14.a(-92, var13.c());
        var13.a();
        var14 = new qh(var4, true);
        var14.a(94, var13.c());
        var13.a();
        var14 = new qh(var4, true);
        var14.a(-75, var13.c());
        var13.a();
        qh var19 = new qh(var4, true);
        var19.a(-69, var13);
    }

    final static void a(int param0, int param1, ji param2, int param3) {
        ll.field_a = param3;
        kn.field_d = param2;
        g.field_n = param1;
        if (param0 != 13421772) {
            Object var5 = null;
            kc.a(-114, -12, (ji) null, 16);
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_k = null;
        field_n = null;
        if (param0 != 110) {
            return;
        }
        field_f = null;
        field_q = null;
        field_r = null;
    }

    final static vf a(byte param0) {
        int var1 = 0;
        if (qh.field_y == null) {
          qh.field_y = new vf(fa.field_Q, 20, 0, 0, 0, 11579568, -1, 0, 0, fa.field_Q.field_C, -1, 2147483647, true);
          var1 = 9 / ((11 - param0) / 59);
          return qh.field_y;
        } else {
          var1 = 9 / ((11 - param0) / 59);
          return qh.field_y;
        }
    }

    private final void b(int param0, String param1, int param2, int param3) {
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
          var15 = Confined.field_J ? 1 : 0;
          var5 = ((kc) this).field_s + ((kc) this).field_v;
          var6 = ((kc) this).field_l + ((kc) this).field_e;
          var7 = ((kc) this).field_c;
          if (0 != (var7 ^ -1)) {
            break L0;
          } else {
            var7 = ((kc) this).field_i.field_C + ((kc) this).field_i.field_D;
            break L0;
          }
        }
        var8 = fn.field_g >> 477029026;
        var9 = ((kc) this).field_i.c(param1);
        if (param3 == -9645) {
          var10 = ((kc) this).field_i.field_C + ((kc) this).field_i.field_D;
          var11 = 1;
          if (var9 <= var8) {
            if ((param1.indexOf("<br>") ^ -1) != 0) {
              if (lc.field_l == null) {
                L1: {
                  lc.field_l = new String[16];
                  if (var9 <= var8) {
                    var12 = var8;
                    break L1;
                  } else {
                    var13 = var9 / var8;
                    var12 = (-1 + var9 % var8 + var13) / var13 * 2 + var8;
                    break L1;
                  }
                }
                var11 = ((kc) this).field_i.a(param1, new int[1], lc.field_l);
                var10 = var10 + (-1 + var11) * var7;
                var9 = 0;
                var13 = 0;
                L2: while (true) {
                  if (var11 <= var13) {
                    L3: {
                      var12 = param2;
                      if (fn.field_g >= var5 + var12 - -var9) {
                        break L3;
                      } else {
                        var12 = fn.field_g + -var9 - var5;
                        break L3;
                      }
                    }
                    L4: {
                      var13 = -((kc) this).field_i.field_y + (param0 + 32);
                      if (fn.field_l < var6 + (var10 + var13)) {
                        var13 = param0 + -var10 + -var6;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    fn.b(var12, var13, var5 + var9, var10 + var6, ((kc) this).field_g);
                    fn.e(var12 - -1, 1 + var13, -2 + var5 + var9, -2 + var10 + var6, ((kc) this).field_p);
                    int discarded$5 = ((kc) this).field_i.a(param1, var12 - -((kc) this).field_v, var13 + ((kc) this).field_e, var9, var10, ((kc) this).field_a, -1, 0, 0, var7);
                    return;
                  } else {
                    var14 = ((kc) this).field_i.c(lc.field_l[var13]);
                    if (var14 > var9) {
                      var9 = var14;
                      var13++;
                      continue L2;
                    } else {
                      var13++;
                      continue L2;
                    }
                  }
                }
              } else {
                L5: {
                  if (var9 <= var8) {
                    var12 = var8;
                    break L5;
                  } else {
                    var13 = var9 / var8;
                    var12 = (-1 + var9 % var8 + var13) / var13 * 2 + var8;
                    break L5;
                  }
                }
                var11 = ((kc) this).field_i.a(param1, new int[1], lc.field_l);
                var10 = var10 + (-1 + var11) * var7;
                var9 = 0;
                var13 = 0;
                L6: while (true) {
                  if (var11 <= var13) {
                    L7: {
                      var12 = param2;
                      if (fn.field_g >= var5 + var12 - -var9) {
                        break L7;
                      } else {
                        var12 = fn.field_g + -var9 - var5;
                        break L7;
                      }
                    }
                    L8: {
                      var13 = -((kc) this).field_i.field_y + (param0 + 32);
                      if (fn.field_l < var6 + (var10 + var13)) {
                        var13 = param0 + -var10 + -var6;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    fn.b(var12, var13, var5 + var9, var10 + var6, ((kc) this).field_g);
                    fn.e(var12 - -1, 1 + var13, -2 + var5 + var9, -2 + var10 + var6, ((kc) this).field_p);
                    int discarded$6 = ((kc) this).field_i.a(param1, var12 - -((kc) this).field_v, var13 + ((kc) this).field_e, var9, var10, ((kc) this).field_a, -1, 0, 0, var7);
                    return;
                  } else {
                    var14 = ((kc) this).field_i.c(lc.field_l[var13]);
                    if (var14 > var9) {
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
            } else {
              L9: {
                var12 = param2;
                if (fn.field_g >= var5 + var12 - -var9) {
                  break L9;
                } else {
                  var12 = fn.field_g + -var9 - var5;
                  break L9;
                }
              }
              L10: {
                var13 = -((kc) this).field_i.field_y + (param0 + 32);
                if (fn.field_l < var6 + (var10 + var13)) {
                  var13 = param0 + -var10 + -var6;
                  break L10;
                } else {
                  break L10;
                }
              }
              fn.b(var12, var13, var5 + var9, var10 + var6, ((kc) this).field_g);
              fn.e(var12 - -1, 1 + var13, -2 + var5 + var9, -2 + var10 + var6, ((kc) this).field_p);
              int discarded$7 = ((kc) this).field_i.a(param1, var12 - -((kc) this).field_v, var13 + ((kc) this).field_e, var9, var10, ((kc) this).field_a, -1, 0, 0, var7);
              return;
            }
          } else {
            if (lc.field_l == null) {
              L11: {
                lc.field_l = new String[16];
                if (var9 <= var8) {
                  var12 = var8;
                  break L11;
                } else {
                  var13 = var9 / var8;
                  var12 = (-1 + var9 % var8 + var13) / var13 * 2 + var8;
                  break L11;
                }
              }
              L12: {
                var11 = ((kc) this).field_i.a(param1, new int[1], lc.field_l);
                var10 = var10 + (-1 + var11) * var7;
                var9 = 0;
                var13 = 0;
                if (var11 <= var13) {
                  break L12;
                } else {
                  L13: {
                    var14 = ((kc) this).field_i.c(lc.field_l[var13]);
                    if (var14 <= var9) {
                      var13++;
                      break L13;
                    } else {
                      var9 = var14;
                      break L13;
                    }
                  }
                  var13++;
                  var13++;
                  var13++;
                  break L12;
                }
              }
              L14: {
                var12 = param2;
                if (fn.field_g >= var5 + var12 - -var9) {
                  break L14;
                } else {
                  var12 = fn.field_g + -var9 - var5;
                  break L14;
                }
              }
              L15: {
                var13 = -((kc) this).field_i.field_y + (param0 + 32);
                if (fn.field_l < var6 + (var10 + var13)) {
                  var13 = param0 + -var10 + -var6;
                  break L15;
                } else {
                  break L15;
                }
              }
              fn.b(var12, var13, var5 + var9, var10 + var6, ((kc) this).field_g);
              fn.e(var12 - -1, 1 + var13, -2 + var5 + var9, -2 + var10 + var6, ((kc) this).field_p);
              int discarded$8 = ((kc) this).field_i.a(param1, var12 - -((kc) this).field_v, var13 + ((kc) this).field_e, var9, var10, ((kc) this).field_a, -1, 0, 0, var7);
              return;
            } else {
              L16: {
                if (var9 <= var8) {
                  var12 = var8;
                  break L16;
                } else {
                  var13 = var9 / var8;
                  var12 = (-1 + var9 % var8 + var13) / var13 * 2 + var8;
                  break L16;
                }
              }
              L17: {
                var11 = ((kc) this).field_i.a(param1, new int[1], lc.field_l);
                var10 = var10 + (-1 + var11) * var7;
                var9 = 0;
                var13 = 0;
                if (var11 <= var13) {
                  break L17;
                } else {
                  L18: {
                    var14 = ((kc) this).field_i.c(lc.field_l[var13]);
                    if (var14 <= var9) {
                      var13++;
                      break L18;
                    } else {
                      var9 = var14;
                      break L18;
                    }
                  }
                  var13++;
                  var13++;
                  var13++;
                  break L17;
                }
              }
              L19: {
                var12 = param2;
                if (fn.field_g >= var5 + var12 - -var9) {
                  break L19;
                } else {
                  var12 = fn.field_g + -var9 - var5;
                  break L19;
                }
              }
              L20: {
                var13 = -((kc) this).field_i.field_y + (param0 + 32);
                if (fn.field_l < var6 + (var10 + var13)) {
                  var13 = param0 + -var10 + -var6;
                  break L20;
                } else {
                  break L20;
                }
              }
              fn.b(var12, var13, var5 + var9, var10 + var6, ((kc) this).field_g);
              fn.e(var12 - -1, 1 + var13, -2 + var5 + var9, -2 + var10 + var6, ((kc) this).field_p);
              int discarded$9 = ((kc) this).field_i.a(param1, var12 - -((kc) this).field_v, var13 + ((kc) this).field_e, var9, var10, ((kc) this).field_a, -1, 0, 0, var7);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(String param0, byte param1, int param2, int param3) {
        if (param1 > 0) {
          if (((kc) this).field_b) {
            this.b(param3, param0, param2, -9645);
            return;
          } else {
            this.a(param3, param0, -6, param2);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        fn.b(param0, param1, param4, param5, param6, param2);
        if (param3 < 16) {
            ((kc) this).field_w = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        if (param4 >= -42) {
          ((kc) this).field_h = null;
          fn.f(param3, param1, param0, param2, param5);
          return;
        } else {
          fn.f(param3, param1, param0, param2, param5);
          return;
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
        int var5 = ((kc) this).field_i.c(param1);
        int var6 = ((kc) this).field_i.field_y - -((kc) this).field_i.field_D;
        int var7 = param3;
        if (!(fn.field_g >= 6 + var7 + var5)) {
            var7 = -var5 + (fn.field_g + -6);
        }
        int var8 = -((kc) this).field_i.field_y + (param0 + 32);
        if (6 + var8 + var6 > fn.field_l) {
            var8 = -6 + (-var6 + fn.field_l);
        }
        fn.b(var7, var8, var5 - param2, var6 - -6, ((kc) this).field_a);
        fn.e(var7 - -1, 1 + var8, 4 + var5, 4 + var6, ((kc) this).field_p);
        ((kc) this).field_i.c(param1, 3 + var7, var8 + (3 - -((kc) this).field_i.field_y), ((kc) this).field_a, -1);
    }

    public kc() {
        ((kc) this).field_b = true;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = (int)(uh.field_e[param2] * 48.0 + 0.5);
        var5 = -var4 + 48 >> -968478975;
        if ((1 << param2 & 50087) == 0) {
          m.field_i[param2].b(param3 + var5, param1 - -var5, var4, var4);
          pm.field_w[qn.field_r >> -48404639 & 15].d(param3, param1, 48, 48, 256);
          if (!param0) {
            return;
          } else {
            field_k = null;
            return;
          }
        } else {
          m.field_i[param2].d(param3 - -var5, param1 - -var5, var4, var4, 256);
          pm.field_w[qn.field_r >> -48404639 & 15].d(param3, param1, 48, 48, 256);
          if (!param0) {
            return;
          } else {
            field_k = null;
            return;
          }
        }
    }

    final static void a(String param0, pm param1, int param2, boolean param3) {
        ce var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        vg var8 = null;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        ce var25 = null;
        ce var26 = null;
        vg var27 = null;
        ce var28 = null;
        vg var29 = null;
        ce stackIn_3_0 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        ce stackIn_27_0 = null;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        ce stackOut_26_0 = null;
        ce stackOut_25_0 = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        ce stackOut_1_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var23 = Confined.field_J ? 1 : 0;
        fb.field_d[um.field_a] = param0;
        if (param3) {
          L0: {
            ih.field_a = ih.field_a | 1 << um.field_a;
            if (param3) {
              stackOut_26_0 = vg.field_I;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            } else {
              stackOut_25_0 = pn.field_a;
              stackIn_27_0 = stackOut_25_0;
              break L0;
            }
          }
          L1: {
            var28 = stackIn_27_0;
            var25 = var28;
            var4 = var28;
            if (!param3) {
              stackOut_29_0 = 16;
              stackIn_30_0 = stackOut_29_0;
              break L1;
            } else {
              stackOut_28_0 = 32;
              stackIn_30_0 = stackOut_28_0;
              break L1;
            }
          }
          L2: {
            var5 = stackIn_30_0;
            if (!param3) {
              stackOut_32_0 = 12;
              stackIn_33_0 = stackOut_32_0;
              break L2;
            } else {
              stackOut_31_0 = 24;
              stackIn_33_0 = stackOut_31_0;
              break L2;
            }
          }
          L3: {
            var6 = stackIn_33_0;
            var7 = var28.c(param0) >> -82727359;
            var29 = qn.field_v.field_m;
            var29.m(10959);
            var9 = -var29.field_T + param1.field_E;
            var11 = -var29.field_L + param1.field_t;
            var13 = param1.field_D - var29.field_O;
            if (param2 >= 115) {
              break L3;
            } else {
              var24 = null;
              kc.a((String) null, (pm) null, 53, false);
              break L3;
            }
          }
          var15 = var29.field_R * var9 + var29.field_ab * var11 + var29.field_M * var13;
          var17 = var9 * var29.field_V + var11 * var29.field_U + var13 * var29.field_F;
          var19 = var13 * var29.field_N + (var29.field_H * var11 + var29.field_P * var9);
          if (var19 >= 0.15) {
            L4: {
              var21 = (int)(var15 / var19 * 640.0) + 320;
              var22 = (int)(var17 / var19 * 640.0) + 188;
              if (var21 < var7 + 4) {
                var21 = 4 - -var7;
                break L4;
              } else {
                if (-var7 + 636 < var21) {
                  L5: {
                    var21 = 636 - var7;
                    if (var22 >= 4 + var5) {
                      if ((var22 ^ -1) >= -373) {
                        break L5;
                      } else {
                        var22 = 372;
                        break L5;
                      }
                    } else {
                      var22 = var5 + 4;
                      break L5;
                    }
                  }
                  var21 = var21 - var7;
                  sc.field_d[um.field_a] = var21;
                  var22 = var22 - (var5 + -var6);
                  uh.field_g[um.field_a] = var22 << -536064604;
                  gb.field_a[um.field_a] = 0;
                  um.field_a = (1 + um.field_a) % 10;
                  return;
                } else {
                  break L4;
                }
              }
            }
            if (var22 < 4 + var5) {
              var22 = var5 + 4;
              var21 = var21 - var7;
              sc.field_d[um.field_a] = var21;
              var22 = var22 - (var5 + -var6);
              uh.field_g[um.field_a] = var22 << -536064604;
              gb.field_a[um.field_a] = 0;
              um.field_a = (1 + um.field_a) % 10;
              return;
            } else {
              L6: {
                if ((var22 ^ -1) >= -373) {
                  break L6;
                } else {
                  var22 = 372;
                  break L6;
                }
              }
              var21 = var21 - var7;
              sc.field_d[um.field_a] = var21;
              var22 = var22 - (var5 + -var6);
              uh.field_g[um.field_a] = var22 << -536064604;
              gb.field_a[um.field_a] = 0;
              um.field_a = (1 + um.field_a) % 10;
              return;
            }
          } else {
            sc.field_d[um.field_a] = 320;
            uh.field_g[um.field_a] = 3008;
            gb.field_a[um.field_a] = 0;
            um.field_a = (1 + um.field_a) % 10;
            return;
          }
        } else {
          ih.field_a = ih.field_a & (1 << um.field_a ^ -1);
          stackOut_1_0 = pn.field_a;
          stackIn_3_0 = stackOut_1_0;
          L7: {
            var26 = stackIn_3_0;
            var25 = var26;
            var4 = var26;
            if (!param3) {
              stackOut_5_0 = 16;
              stackIn_6_0 = stackOut_5_0;
              break L7;
            } else {
              stackOut_4_0 = 32;
              stackIn_6_0 = stackOut_4_0;
              break L7;
            }
          }
          L8: {
            var5 = stackIn_6_0;
            if (!param3) {
              stackOut_8_0 = 12;
              stackIn_9_0 = stackOut_8_0;
              break L8;
            } else {
              stackOut_7_0 = 24;
              stackIn_9_0 = stackOut_7_0;
              break L8;
            }
          }
          L9: {
            var6 = stackIn_9_0;
            var7 = var26.c(param0) >> -82727359;
            var27 = qn.field_v.field_m;
            var8 = var27;
            var27.m(10959);
            var9 = -var27.field_T + param1.field_E;
            var11 = -var27.field_L + param1.field_t;
            var13 = param1.field_D - var27.field_O;
            if (param2 >= 115) {
              break L9;
            } else {
              var24 = null;
              kc.a((String) null, (pm) null, 53, false);
              break L9;
            }
          }
          L10: {
            var15 = var27.field_R * var9 + var27.field_ab * var11 + var27.field_M * var13;
            var17 = var9 * var27.field_V + var11 * var27.field_U + var13 * var27.field_F;
            var19 = var13 * var27.field_N + (var27.field_H * var11 + var27.field_P * var9);
            if (var19 >= 0.15) {
              L11: {
                var21 = (int)(var15 / var19 * 640.0) + 320;
                var22 = (int)(var17 / var19 * 640.0) + 188;
                if (var21 < var7 + 4) {
                  var21 = 4 - -var7;
                  break L11;
                } else {
                  if (-var7 + 636 < var21) {
                    var21 = 636 - var7;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              L12: {
                if (var22 >= 4 + var5) {
                  if ((var22 ^ -1) >= -373) {
                    break L12;
                  } else {
                    var22 = 372;
                    break L12;
                  }
                } else {
                  var22 = var5 + 4;
                  break L12;
                }
              }
              var21 = var21 - var7;
              sc.field_d[um.field_a] = var21;
              var22 = var22 - (var5 + -var6);
              uh.field_g[um.field_a] = var22 << -536064604;
              break L10;
            } else {
              sc.field_d[um.field_a] = 320;
              uh.field_g[um.field_a] = 3008;
              break L10;
            }
          }
          gb.field_a[um.field_a] = 0;
          um.field_a = (1 + um.field_a) % 10;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "END";
        field_r = "X";
        field_t = 50;
    }
}
