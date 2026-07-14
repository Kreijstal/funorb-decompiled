/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    dh field_s;
    qi field_m;
    static String[] field_k;
    int field_n;
    dh field_p;
    static String field_h;
    int field_q;
    int field_g;
    static String field_a;
    int field_c;
    private int field_j;
    dh field_f;
    int field_b;
    dh field_d;
    int field_e;
    dh field_r;
    int field_i;
    static int field_o;
    private boolean field_l;

    final static k a(String param0, String param1, gn param2, byte param3, gn param4) {
        if (param3 != 35) {
            Object var7 = null;
            k discarded$0 = ga.a((String) null, (String) null, (gn) null, (byte) -97, (gn) null);
        }
        int var5 = param4.c(param0, 3);
        int var6 = param4.a(var5, param1, false);
        return um.a(var6, param4, param2, var5, 0);
    }

    private final void a(byte param0, int param1, String param2, int param3) {
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
          var15 = HoldTheLine.field_D;
          var5 = ((ga) this).field_i - -((ga) this).field_b;
          var6 = ((ga) this).field_e + ((ga) this).field_n;
          var7 = ((ga) this).field_g;
          if (-1 != var7) {
            break L0;
          } else {
            var7 = ((ga) this).field_m.field_G + ((ga) this).field_m.field_I;
            break L0;
          }
        }
        var8 = tc.field_j >> -1888507806;
        if (param0 == -90) {
          var9 = ((ga) this).field_m.a(param2);
          var10 = ((ga) this).field_m.field_I + ((ga) this).field_m.field_G;
          var11 = 1;
          if (var8 < var9) {
            L1: {
              if (em.field_k == null) {
                em.field_k = new String[16];
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var9 <= var8) {
                var12 = var8;
                break L2;
              } else {
                var13 = var9 / var8;
                var12 = var8 - -((var9 % var8 + var13 - 1) / var13 * 2);
                break L2;
              }
            }
            var11 = ((ga) this).field_m.a(param2, new int[1], em.field_k);
            var9 = 0;
            var10 = var10 + (-1 + var11) * var7;
            var13 = 0;
            L3: while (true) {
              if (var11 > var13) {
                var14 = ((ga) this).field_m.a(em.field_k[var13]);
                if (var14 > var9) {
                  var9 = var14;
                  var13++;
                  continue L3;
                } else {
                  var13++;
                  continue L3;
                }
              } else {
                L4: {
                  var12 = param1;
                  if (tc.field_j < var5 + var9 + var12) {
                    var12 = -var5 + (-var9 + tc.field_j);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var13 = 32 + (-((ga) this).field_m.field_s + param3);
                  if (tc.field_c >= var6 + (var10 + var13)) {
                    break L5;
                  } else {
                    var13 = -var6 + -var10 + param3;
                    break L5;
                  }
                }
                tc.a(var12, var13, var5 + var9, var6 + var10, ((ga) this).field_c);
                tc.f(var12 - -1, var13 + 1, var9 + var5 - 2, -2 + (var10 + var6), ((ga) this).field_q);
                int discarded$5 = ((ga) this).field_m.a(param2, var12 - -((ga) this).field_i, ((ga) this).field_n + var13, var9, var10, ((ga) this).field_j, -1, 0, 0, var7);
                return;
              }
            }
          } else {
            if (0 == (param2.indexOf("<br>") ^ -1)) {
              L6: {
                var12 = param1;
                if (tc.field_j < var5 + var9 + var12) {
                  var12 = -var5 + (-var9 + tc.field_j);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                var13 = 32 + (-((ga) this).field_m.field_s + param3);
                if (tc.field_c >= var6 + (var10 + var13)) {
                  break L7;
                } else {
                  var13 = -var6 + -var10 + param3;
                  break L7;
                }
              }
              tc.a(var12, var13, var5 + var9, var6 + var10, ((ga) this).field_c);
              tc.f(var12 - -1, var13 + 1, var9 + var5 - 2, -2 + (var10 + var6), ((ga) this).field_q);
              int discarded$6 = ((ga) this).field_m.a(param2, var12 - -((ga) this).field_i, ((ga) this).field_n + var13, var9, var10, ((ga) this).field_j, -1, 0, 0, var7);
              return;
            } else {
              L8: {
                if (em.field_k == null) {
                  em.field_k = new String[16];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var9 <= var8) {
                  var12 = var8;
                  break L9;
                } else {
                  var13 = var9 / var8;
                  var12 = var8 - -((var9 % var8 + var13 - 1) / var13 * 2);
                  break L9;
                }
              }
              var11 = ((ga) this).field_m.a(param2, new int[1], em.field_k);
              var9 = 0;
              var10 = var10 + (-1 + var11) * var7;
              var13 = 0;
              L10: while (true) {
                if (var11 <= var13) {
                  L11: {
                    var12 = param1;
                    if (tc.field_j < var5 + var9 + var12) {
                      var12 = -var5 + (-var9 + tc.field_j);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    var13 = 32 + (-((ga) this).field_m.field_s + param3);
                    if (tc.field_c >= var6 + (var10 + var13)) {
                      break L12;
                    } else {
                      var13 = -var6 + -var10 + param3;
                      break L12;
                    }
                  }
                  tc.a(var12, var13, var5 + var9, var6 + var10, ((ga) this).field_c);
                  tc.f(var12 - -1, var13 + 1, var9 + var5 - 2, -2 + (var10 + var6), ((ga) this).field_q);
                  int discarded$7 = ((ga) this).field_m.a(param2, var12 - -((ga) this).field_i, ((ga) this).field_n + var13, var9, var10, ((ga) this).field_j, -1, 0, 0, var7);
                  return;
                } else {
                  var14 = ((ga) this).field_m.a(em.field_k[var13]);
                  if (var14 > var9) {
                    var9 = var14;
                    var13++;
                    continue L10;
                  } else {
                    var13++;
                    continue L10;
                  }
                }
              }
            }
          }
        } else {
          L13: {
            ((ga) this).a(-99, -111, (byte) -11, -66, 61, 51);
            var9 = ((ga) this).field_m.a(param2);
            var10 = ((ga) this).field_m.field_I + ((ga) this).field_m.field_G;
            var11 = 1;
            if (var8 < var9) {
              break L13;
            } else {
              if (0 != (param2.indexOf("<br>") ^ -1)) {
                break L13;
              } else {
                L14: {
                  var12 = param1;
                  if (tc.field_j < var5 + var9 + var12) {
                    var12 = -var5 + (-var9 + tc.field_j);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  var13 = 32 + (-((ga) this).field_m.field_s + param3);
                  if (tc.field_c >= var6 + (var10 + var13)) {
                    break L15;
                  } else {
                    var13 = -var6 + -var10 + param3;
                    break L15;
                  }
                }
                tc.a(var12, var13, var5 + var9, var6 + var10, ((ga) this).field_c);
                tc.f(var12 - -1, var13 + 1, var9 + var5 - 2, -2 + (var10 + var6), ((ga) this).field_q);
                int discarded$8 = ((ga) this).field_m.a(param2, var12 - -((ga) this).field_i, ((ga) this).field_n + var13, var9, var10, ((ga) this).field_j, -1, 0, 0, var7);
                return;
              }
            }
          }
          L16: {
            if (em.field_k == null) {
              em.field_k = new String[16];
              break L16;
            } else {
              break L16;
            }
          }
          L17: {
            if (var9 <= var8) {
              var12 = var8;
              break L17;
            } else {
              var13 = var9 / var8;
              var12 = var8 - -((var9 % var8 + var13 - 1) / var13 * 2);
              break L17;
            }
          }
          var11 = ((ga) this).field_m.a(param2, new int[1], em.field_k);
          var9 = 0;
          var10 = var10 + (-1 + var11) * var7;
          var13 = 0;
          L18: while (true) {
            if (var11 > var13) {
              var14 = ((ga) this).field_m.a(em.field_k[var13]);
              if (var14 > var9) {
                var9 = var14;
                var13++;
                continue L18;
              } else {
                var13++;
                continue L18;
              }
            } else {
              L19: {
                var12 = param1;
                if (tc.field_j < var5 + var9 + var12) {
                  var12 = -var5 + (-var9 + tc.field_j);
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                var13 = 32 + (-((ga) this).field_m.field_s + param3);
                if (tc.field_c >= var6 + (var10 + var13)) {
                  break L20;
                } else {
                  var13 = -var6 + -var10 + param3;
                  break L20;
                }
              }
              tc.a(var12, var13, var5 + var9, var6 + var10, ((ga) this).field_c);
              tc.f(var12 - -1, var13 + 1, var9 + var5 - 2, -2 + (var10 + var6), ((ga) this).field_q);
              int discarded$9 = ((ga) this).field_m.a(param2, var12 - -((ga) this).field_i, ((ga) this).field_n + var13, var9, var10, ((ga) this).field_j, -1, 0, 0, var7);
              return;
            }
          }
        }
    }

    final void a(int param0, String param1, int param2, int param3) {
        Object var6 = null;
        if (((ga) this).field_l) {
          this.a((byte) -90, param2, param1, param3);
          if (param0 == 7829367) {
            return;
          } else {
            var6 = null;
            k discarded$4 = ga.a((String) null, (String) null, (gn) null, (byte) 115, (gn) null);
            return;
          }
        } else {
          this.a(-88, param2, param3, param1);
          if (param0 == 7829367) {
            return;
          } else {
            var6 = null;
            k discarded$5 = ga.a((String) null, (String) null, (gn) null, (byte) 115, (gn) null);
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        tc.d(param5, param1, param4, param3, param0);
        if (param2 != -53) {
            ((ga) this).field_c = -35;
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_a = null;
        if (param0 != 1) {
            return;
        }
        field_h = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 != 13421772) {
          ((ga) this).a(-126, 95, 114, -63, -82, 84, 53);
          tc.c(param4, param2, param6, param3, param5, param0);
          return;
        } else {
          tc.c(param4, param2, param6, param3, param5, param0);
          return;
        }
    }

    public ga() {
        ((ga) this).field_l = true;
    }

    final void a(qi param0, byte param1) {
        ig var4 = null;
        hj[] var5 = null;
        ig var6 = null;
        int var7_int = 0;
        ig var7 = null;
        ig var8 = null;
        hj[] var9 = null;
        hj[] var10 = null;
        ig var11 = null;
        ig var14 = null;
        int var15 = 0;
        Object var16 = null;
        uc var17 = null;
        dk var18 = null;
        uc var19 = null;
        ig var21 = null;
        hj var22 = null;
        ig var23 = null;
        ig var24 = null;
        hj var25 = null;
        ig var26 = null;
        var15 = HoldTheLine.field_D;
        var18 = new dk(param0, 2, 2, 2236962, 1, 1, 1, param0.field_G - (-param0.field_I + -2));
        ((ga) this).field_r = (dh) (Object) var18;
        var18.field_c = 16777215;
        var4 = new ig();
        var18.a((byte) -123, (dk) (Object) var4);
        ((ga) this).field_m = param0;
        ((ga) this).field_j = 15658734;
        ((ga) this).field_g = -1;
        var4.field_a = 15658734;
        ((ga) this).field_i = 3;
        ((ga) this).field_c = 15658734;
        ((ga) this).field_e = 3;
        ((ga) this).field_q = 5592405;
        ((ga) this).field_b = 3;
        ((ga) this).field_n = 3;
        var4.field_b = 11711154;
        nj discarded$22 = var4.a(0, 62).b(15658734, -26228).a(29536, sf.a(7829367, 10066329, 8947848, 14));
        nj discarded$23 = var4.a(1, param1 ^ 76).a(29536, sf.a(13421772, 10066329, 11184810, param1 + -25));
        nj discarded$24 = var4.a(3, 122).a(29536, sf.a(10066329, 7829367, 8947848, 14)).a(1, -116).a(1, true);
        var5 = new hj[9];
        var17 = new uc(32, 32);
        var19 = var17;
        var7_int = 0;
        L0: while (true) {
          if (var19.field_z.length <= var7_int) {
            var5[4] = (hj) (Object) var19;
            nj discarded$25 = var4.a(4, -79).a(true, param1 ^ -2147483609).a(29536, var5);
            nj discarded$26 = var4.a(5, -97).a(29536, kk.a(0, 0, 65793, -104, 0)).a(true, -2147483648).b(-1, -26228);
            ((ga) this).field_p = (dh) (Object) var4;
            var6 = new ig(var4, true);
            var6.field_i = 0;
            var7 = new ig(var4, true);
            var7.field_i = 0;
            var7.a((byte) -2, bb.a(8947848, (byte) -127));
            nj discarded$27 = var7.a(1, param1 + 75).a(param1 + 29497, bb.a(11184810, (byte) 87)).b(2236962, -26228);
            ((ga) this).field_f = (dh) (Object) new ek(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
            vh discarded$28 = new vh(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            ug discarded$29 = new ug(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new ig();
            var18.a((byte) -124, (dk) (Object) var8);
            nj discarded$30 = var8.a(0, 61).a(29536, sf.a(10066329, 7829367, 15658734, 14)).b(1118481, -26228).b(-1, false);
            nj discarded$31 = var8.a(4, -90).a(true, param1 ^ -2147483609).a(29536, var5);
            ((ga) this).field_s = (dh) (Object) var8;
            var9 = new hj[9];
            var9[4] = new hj(2, 1);
            var10 = new hj[9];
            var10[4] = new hj(1, 2);
            var9[4].field_z = new int[]{6710886, 7829367};
            var10[4].field_z = new int[]{6710886, 7829367};
            var11 = new ig();
            if (param1 != 39) {
              var16 = null;
              k discarded$32 = ga.a((String) null, (String) null, (gn) null, (byte) -94, (gn) null);
              var21 = new ig();
              var11.a(var9, 6821, 0);
              var21.a(var10, 6821, 0);
              var22 = new hj(7, 4);
              var22.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
              var14 = new ig(var4, true);
              var14.a(var22.e(), param1 + -39);
              var22.b();
              var14 = new ig(var4, true);
              var14.a(var22.e(), 0);
              var22.b();
              var14 = new ig(var4, true);
              var14.a(var22.e(), 0);
              var22.b();
              var23 = new ig(var4, true);
              var23.a(var22, 0);
              return;
            } else {
              var24 = new ig();
              var11.a(var9, 6821, 0);
              var24.a(var10, 6821, 0);
              var25 = new hj(7, 4);
              var25.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
              var14 = new ig(var4, true);
              var14.a(var25.e(), param1 + -39);
              var25.b();
              var14 = new ig(var4, true);
              var14.a(var25.e(), 0);
              var25.b();
              var14 = new ig(var4, true);
              var14.a(var25.e(), 0);
              var25.b();
              var26 = new ig(var4, true);
              var26.a(var25, 0);
              return;
            }
          } else {
            var17.field_z[var7_int] = 1077952576;
            var7_int++;
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = ((ga) this).field_m.a(param3);
          var6 = ((ga) this).field_m.field_I + ((ga) this).field_m.field_s;
          var7 = param1;
          if (6 + var7 - -var5 > tc.field_j) {
            var7 = -6 + -var5 + tc.field_j;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -72) {
          L1: {
            ((ga) this).field_m = null;
            var8 = 32 + (param2 - ((ga) this).field_m.field_s);
            if (tc.field_c >= var6 + var8 + 6) {
              break L1;
            } else {
              var8 = -6 + (-var6 + tc.field_c);
              break L1;
            }
          }
          tc.a(var7, var8, var5 - -6, 6 + var6, ((ga) this).field_j);
          tc.f(1 + var7, var8 - -1, 4 + var5, 4 + var6, ((ga) this).field_q);
          ((ga) this).field_m.a(param3, 3 + var7, 3 + var8 + ((ga) this).field_m.field_s, ((ga) this).field_j, -1);
          return;
        } else {
          L2: {
            var8 = 32 + (param2 - ((ga) this).field_m.field_s);
            if (tc.field_c >= var6 + var8 + 6) {
              break L2;
            } else {
              var8 = -6 + (-var6 + tc.field_c);
              break L2;
            }
          }
          tc.a(var7, var8, var5 - -6, 6 + var6, ((ga) this).field_j);
          tc.f(1 + var7, var8 - -1, 4 + var5, 4 + var6, ((ga) this).field_q);
          ((ga) this).field_m.a(param3, 3 + var7, 3 + var8 + ((ga) this).field_m.field_s, ((ga) this).field_j, -1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new String[]{"Click to view best times for the <col=1>Classic Championship</col>", "Click to view best times for the <col=1>Desert Championship</col>", "Click to view best times for the <col=1>Alpine Championship</col>", "Click to view best times for the <col=1>Night Championship</col>"};
        field_a = "Snowmobile";
        field_h = "Afterburner";
        field_o = 256;
    }
}
