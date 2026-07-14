/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static int[] field_f;
    t field_k;
    int field_t;
    int field_u;
    t field_j;
    t field_h;
    t field_e;
    private int field_n;
    int field_q;
    static h field_l;
    int field_p;
    t field_g;
    static bl field_o;
    int field_a;
    private boolean field_r;
    static int field_b;
    static String field_i;
    oh field_c;
    int field_m;
    static int[] field_s;
    int field_d;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 != 10066329) {
            return;
        }
        ll.c(param6, param0, param2, param5, param4, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 <= 73) {
            return;
        }
        ll.e(param5, param4, param1, param2, param3);
    }

    private final void a(String param0, boolean param1, int param2, int param3) {
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
          var15 = TrackController.field_F ? 1 : 0;
          var5 = ((rd) this).field_d + ((rd) this).field_p;
          var6 = ((rd) this).field_m - -((rd) this).field_q;
          var7 = ((rd) this).field_u;
          if (var7 != -1) {
            break L0;
          } else {
            var7 = ((rd) this).field_c.field_G - -((rd) this).field_c.field_u;
            break L0;
          }
        }
        L1: {
          var8 = ll.field_d >> 826267682;
          var9 = ((rd) this).field_c.a(param0);
          if (param1) {
            break L1;
          } else {
            ((rd) this).field_g = null;
            break L1;
          }
        }
        L2: {
          L3: {
            var10 = ((rd) this).field_c.field_u + ((rd) this).field_c.field_G;
            var11 = 1;
            if (var9 > var8) {
              break L3;
            } else {
              if (param0.indexOf("<br>") == -1) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (null == nf.field_g) {
              nf.field_g = new String[16];
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (var9 > var8) {
              var13 = var9 / var8;
              var12 = var8 - -((var9 % var8 + (var13 - 1)) / var13 * 2);
              break L5;
            } else {
              var12 = var8;
              break L5;
            }
          }
          var11 = ((rd) this).field_c.a(param0, new int[1], nf.field_g);
          var10 = var10 + (var11 + -1) * var7;
          var9 = 0;
          var13 = 0;
          L6: while (true) {
            if (var11 <= var13) {
              break L2;
            } else {
              var14 = ((rd) this).field_c.a(nf.field_g[var13]);
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
        L7: {
          var12 = param3;
          if (var9 + var12 - -var5 <= ll.field_d) {
            break L7;
          } else {
            var12 = ll.field_d + (-var9 - var5);
            break L7;
          }
        }
        L8: {
          var13 = 32 + (-((rd) this).field_c.field_H + param2);
          if (var6 + var13 + var10 > ll.field_k) {
            var13 = -var6 + -var10 + param2;
            break L8;
          } else {
            break L8;
          }
        }
        ll.f(var12, var13, var5 + var9, var10 - -var6, ((rd) this).field_a);
        ll.c(1 + var12, var13 - -1, var5 + (var9 - 2), var10 + (var6 - 2), ((rd) this).field_t);
        int discarded$1 = ((rd) this).field_c.a(param0, var12 - -((rd) this).field_p, ((rd) this).field_m + var13, var9, var10, ((rd) this).field_n, -1, 0, 0, var7);
    }

    final void a(byte param0, int param1, int param2, String param3) {
        if (((rd) this).field_r) {
            this.a(param3, true, param2, param1);
        } else {
            this.a(false, param1, param2, param3);
        }
        if (param0 != -86) {
            ((rd) this).field_n = -89;
        }
    }

    final static void a(int param0) {
        if (param0 != 1) {
            field_f = null;
        }
        vk var1 = (vk) (Object) ea.field_t.b(2);
        if (var1 == null) {
            lj.a((byte) 114);
            return;
        }
        la var2 = ne.field_a;
        int discarded$0 = var2.e((byte) 113);
        int discarded$1 = var2.e((byte) 113);
        int discarded$2 = var2.e((byte) 113);
        int discarded$3 = var2.e((byte) 113);
        var1.a(-33);
    }

    final static int a(int param0, boolean param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TrackController.field_F ? 1 : 0;
          if (-3 < (param3 ^ -1)) {
            break L0;
          } else {
            if (36 < param3) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                if (param0 == 8058) {
                  break L1;
                } else {
                  field_o = null;
                  break L1;
                }
              }
              var7 = param2.length();
              var8 = 0;
              L2: while (true) {
                if (var7 <= var8) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L3;
                    } else {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param1) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L2;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (97 > var9) {
                        break L7;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param3 <= var9) {
                    throw new NumberFormatException();
                  } else {
                    L8: {
                      if (var4 == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = param3 * var6 - -var9;
                    if (var6 == var10 / param3) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L2;
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    private final void a(boolean param0, int param1, int param2, String param3) {
        int var5 = ((rd) this).field_c.a(param3);
        int var6 = ((rd) this).field_c.field_H + ((rd) this).field_c.field_u;
        int var7 = param1;
        if (ll.field_d < 6 + (var7 - -var5)) {
            var7 = -6 + (-var5 + ll.field_d);
        }
        int var8 = param2 - (((rd) this).field_c.field_H + -32);
        if (6 + var6 + var8 > ll.field_k) {
            var8 = -var6 + ll.field_k - 6;
        }
        ll.f(var7, var8, var5 - -6, 6 + var6, ((rd) this).field_n);
        ll.c(var7 + 1, 1 + var8, var5 + 4, var6 - -4, ((rd) this).field_t);
        if (param0) {
            field_l = null;
        }
        ((rd) this).field_c.c(param3, var7 + 3, 3 + var8 + ((rd) this).field_c.field_H, ((rd) this).field_n, -1);
    }

    final void a(int param0, oh param1) {
        int var7_int = 0;
        int var15 = TrackController.field_F ? 1 : 0;
        ic var17 = new ic(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_G - -param1.field_u));
        var17.field_i = 16777215;
        ((rd) this).field_k = (t) (Object) var17;
        gi var4 = new gi();
        var17.a(-19397, (ic) (Object) var4);
        var4.field_j = 11711154;
        ((rd) this).field_d = 3;
        ((rd) this).field_a = 15658734;
        ((rd) this).field_m = 3;
        ((rd) this).field_n = 15658734;
        ((rd) this).field_q = 3;
        ((rd) this).field_c = param1;
        ((rd) this).field_p = 3;
        var4.field_c = 15658734;
        ((rd) this).field_t = 5592405;
        ((rd) this).field_u = -1;
        qi discarded$0 = var4.a((byte) 118, 0).a(15658734, false).a(param0 ^ 13421731, qe.a(8947848, 7829367, 10066329, param0 + -13421771));
        qi discarded$1 = var4.a((byte) 118, 1).a(param0 + -13421653, qe.a(11184810, 13421772, 10066329, param0 ^ 13421773));
        qi discarded$2 = var4.a((byte) 118, 3).a(125, qe.a(8947848, 10066329, 7829367, 1)).a(255, 1).a((byte) 85, 1);
        qj[] var5 = new qj[9];
        d var16 = new d(32, 32);
        d var18 = var16;
        for (var7_int = 0; var7_int < var18.field_z.length; var7_int++) {
            var16.field_z[var7_int] = 1077952576;
        }
        var5[4] = (qj) (Object) var18;
        qi discarded$3 = var4.a((byte) 118, 4).a(true, 19749).a(param0 ^ 13421758, var5);
        qi discarded$4 = var4.a((byte) 118, 5).a(113, qi.a(65793, 0, (byte) 116, 0, 0)).a(true, 19749).a(-1, false);
        ((rd) this).field_h = (t) (Object) var4;
        gi var6 = new gi(var4, true);
        var6.field_f = 0;
        gi var7 = new gi(var4, true);
        var7.field_f = 0;
        var7.a(-75, re.a((byte) 125, 8947848));
        qi discarded$5 = var7.a((byte) 118, 1).a(124, re.a((byte) 121, 11184810)).a(2236962, false);
        ((rd) this).field_j = (t) (Object) new ij(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        gh discarded$6 = new gh(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        jd discarded$7 = new jd(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        gi var8 = new gi();
        var17.a(param0 + -13441169, (ic) (Object) var8);
        qi discarded$8 = var8.a((byte) 118, 0).a(112, qe.a(15658734, 10066329, 7829367, 1)).a(1118481, false).b(-1, 113);
        qi discarded$9 = var8.a((byte) 118, 4).a(true, 19749).a(110, var5);
        ((rd) this).field_e = (t) (Object) var8;
        qj[] var9 = new qj[9];
        qj[] var10 = new qj[9];
        var9[4] = new qj(2, 1);
        var10[4] = new qj(1, 2);
        var9[4].field_z = new int[]{6710886, 7829367};
        var10[4].field_z = new int[]{6710886, 7829367};
        gi var11 = new gi();
        gi var12 = new gi();
        var11.a(0, var9, (byte) -33);
        var12.a(0, var10, (byte) -33);
        qj var13 = new qj(7, 4);
        var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, param0, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        gi var14 = new gi(var4, true);
        var14.a(var13.b(), -112);
        var13.d();
        var14 = new gi(var4, true);
        var14.a(var13.b(), param0 ^ -13421731);
        var13.d();
        var14 = new gi(var4, true);
        var14.a(var13.b(), -116);
        var13.d();
        gi var19 = new gi(var4, true);
        var19.a(var13, -119);
    }

    public static void b(int param0) {
        field_f = null;
        field_s = null;
        if (param0 != 3) {
            rd.a(-15);
        }
        field_o = null;
        field_l = null;
        field_i = null;
    }

    final static void a(jf param0, int param1, int param2) {
        la var3 = ra.field_C;
        var3.c(param2, 7);
        var3.a(param0.field_m, (byte) -89);
        if (param1 != 4) {
            return;
        }
        var3.a(param0.field_k, (byte) -114);
    }

    public rd() {
        ((rd) this).field_r = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{1, 2, 3, 5, 2, 3, 5, 10, 1, 2, 3, 5, 3};
        field_o = new bl("email");
        field_s = new int[8192];
        field_i = "Discard";
    }
}
