/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tg {
    private boolean field_k;
    int field_p;
    int field_g;
    int field_o;
    eb field_t;
    eb field_s;
    int field_d;
    static String field_b;
    int field_q;
    static dj field_j;
    eb field_r;
    eb field_i;
    jl field_m;
    private int field_c;
    int field_e;
    eb field_a;
    static Random field_f;
    static String field_l;
    static String field_h;
    int field_n;

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            return;
        }
        field_j = null;
        field_l = null;
        field_b = null;
        field_h = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        Object var8 = null;
        if (param5) {
          var8 = null;
          this.a((String) null, 6, 30, -19);
          t.b(param3, param0, param2, param1, param4);
          return;
        } else {
          t.b(param3, param0, param2, param1, param4);
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(String param0, int param1, boolean param2, int param3) {
        Object var6 = null;
        if (!param2) {
          if (!((tg) this).field_k) {
            this.a(param0, param1, param3, 109);
            return;
          } else {
            this.a(param0, param3, param1, (byte) 127);
            return;
          }
        } else {
          var6 = null;
          this.a((String) null, -42, -69, (byte) -38);
          if (!((tg) this).field_k) {
            this.a(param0, param1, param3, 109);
            return;
          } else {
            this.a(param0, param3, param1, (byte) 127);
            return;
          }
        }
    }

    final static boolean a(String param0, long param1, int param2, int param3, int[] param4) {
        te var6 = null;
        CharSequence var7 = null;
        if (!cf.a(param1, param4, param0, param2, 500)) {
          return false;
        } else {
          L0: {
            if (param3 == (param2 ^ -1)) {
              param2 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          ce.field_d = param2;
          jo.field_k = param0;
          var7 = (CharSequence) (Object) param0;
          fp.field_d = dh.a(var7, (byte) 26);
          fp.field_e = param1;
          var6 = ad.a(49, vl.field_L, param4, ue.field_t, ve.field_Ib);
          mh.a(var6, (byte) 127);
          return true;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        t.a(param2, param6, param4, param3, param1, param0);
        int var8 = -61 / ((-21 - param5) / 44);
    }

    private final void a(String param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var5 = ((tg) this).field_m.c(param0);
        var6 = ((tg) this).field_m.field_z + ((tg) this).field_m.field_D;
        var7 = param2;
        if (param3 < 27) {
          L0: {
            ((tg) this).field_e = 119;
            if (var5 + var7 + 6 > t.field_j) {
              var7 = -var5 + (t.field_j + -6);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var8 = -((tg) this).field_m.field_D + (param1 + 32);
            if (6 + (var6 + var8) <= t.field_d) {
              break L1;
            } else {
              var8 = -6 + (-var6 + t.field_d);
              break L1;
            }
          }
          t.a(var7, var8, 6 + var5, 6 + var6, ((tg) this).field_c);
          t.d(1 + var7, 1 + var8, var5 - -4, 4 + var6, ((tg) this).field_e);
          ((tg) this).field_m.a(param0, 3 + var7, ((tg) this).field_m.field_D + (var8 + 3), ((tg) this).field_c, -1);
          return;
        } else {
          L2: {
            if (var5 + var7 + 6 > t.field_j) {
              var7 = -var5 + (t.field_j + -6);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var8 = -((tg) this).field_m.field_D + (param1 + 32);
            if (6 + (var6 + var8) <= t.field_d) {
              break L3;
            } else {
              var8 = -6 + (-var6 + t.field_d);
              break L3;
            }
          }
          t.a(var7, var8, 6 + var5, 6 + var6, ((tg) this).field_c);
          t.d(1 + var7, 1 + var8, var5 - -4, 4 + var6, ((tg) this).field_e);
          ((tg) this).field_m.a(param0, 3 + var7, ((tg) this).field_m.field_D + (var8 + 3), ((tg) this).field_c, -1);
          return;
        }
    }

    private final void a(String param0, int param1, int param2, byte param3) {
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
          var15 = Pixelate.field_H ? 1 : 0;
          var5 = ((tg) this).field_p + ((tg) this).field_n;
          var6 = ((tg) this).field_g + ((tg) this).field_o;
          var7 = ((tg) this).field_q;
          if ((var7 ^ -1) == 0) {
            var7 = ((tg) this).field_m.field_w - -((tg) this).field_m.field_z;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = t.field_j >> 521009762;
        var9 = ((tg) this).field_m.c(param0);
        var10 = ((tg) this).field_m.field_w + ((tg) this).field_m.field_z;
        var11 = 1;
        if (var8 < var9) {
          L1: {
            if (var9 > var8) {
              var13 = var9 / var8;
              var12 = var8 + (-1 + var13 + var9 % var8) / var13 * 2;
              break L1;
            } else {
              var12 = var8;
              break L1;
            }
          }
          if (rf.field_j != null) {
            L2: {
              var11 = ((tg) this).field_m.a(param0, new int[1], rf.field_j);
              var9 = 0;
              var10 = var10 + var7 * (var11 - 1);
              var13 = 0;
              if (var11 <= var13) {
                break L2;
              } else {
                L3: {
                  var14 = ((tg) this).field_m.c(rf.field_j[var13]);
                  if (var9 >= var14) {
                    var13++;
                    break L3;
                  } else {
                    var9 = var14;
                    break L3;
                  }
                }
                var13++;
                var13++;
                var13++;
                break L2;
              }
            }
            L4: {
              var12 = param1;
              if (var5 + (var9 + var12) > t.field_j) {
                var12 = -var5 + t.field_j - var9;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var13 = 32 + param2 + -((tg) this).field_m.field_D;
              if (var6 + var10 + var13 > t.field_d) {
                var13 = param2 - var10 - var6;
                break L5;
              } else {
                break L5;
              }
            }
            if (param3 <= 123) {
              return;
            } else {
              t.a(var12, var13, var9 + var5, var10 - -var6, ((tg) this).field_d);
              t.d(var12 + 1, 1 + var13, var9 - (-var5 + 2), -2 + (var10 - -var6), ((tg) this).field_e);
              int discarded$4 = ((tg) this).field_m.a(param0, var12 - -((tg) this).field_n, var13 + ((tg) this).field_o, var9, var10, ((tg) this).field_c, -1, 0, 0, var7);
              return;
            }
          } else {
            rf.field_j = new String[16];
            var11 = ((tg) this).field_m.a(param0, new int[1], rf.field_j);
            var9 = 0;
            var10 = var10 + var7 * (var11 - 1);
            var13 = 0;
            L6: while (true) {
              if (var11 <= var13) {
                L7: {
                  var12 = param1;
                  if (var5 + (var9 + var12) > t.field_j) {
                    var12 = -var5 + t.field_j - var9;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var13 = 32 + param2 + -((tg) this).field_m.field_D;
                  if (var6 + var10 + var13 > t.field_d) {
                    var13 = param2 - var10 - var6;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (param3 <= 123) {
                  return;
                } else {
                  t.a(var12, var13, var9 + var5, var10 - -var6, ((tg) this).field_d);
                  t.d(var12 + 1, 1 + var13, var9 - (-var5 + 2), -2 + (var10 - -var6), ((tg) this).field_e);
                  int discarded$5 = ((tg) this).field_m.a(param0, var12 - -((tg) this).field_n, var13 + ((tg) this).field_o, var9, var10, ((tg) this).field_c, -1, 0, 0, var7);
                  return;
                }
              } else {
                var14 = ((tg) this).field_m.c(rf.field_j[var13]);
                if (var9 < var14) {
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
          if (param0.indexOf("<br>") != -1) {
            L9: {
              if (var9 > var8) {
                var13 = var9 / var8;
                var12 = var8 + (-1 + var13 + var9 % var8) / var13 * 2;
                break L9;
              } else {
                var12 = var8;
                break L9;
              }
            }
            L10: {
              if (rf.field_j != null) {
                var11 = ((tg) this).field_m.a(param0, new int[1], rf.field_j);
                var9 = 0;
                var10 = var10 + var7 * (var11 - 1);
                var13 = 0;
                break L10;
              } else {
                rf.field_j = new String[16];
                var11 = ((tg) this).field_m.a(param0, new int[1], rf.field_j);
                var9 = 0;
                var10 = var10 + var7 * (var11 - 1);
                var13 = 0;
                break L10;
              }
            }
            L11: {
              if (var11 <= var13) {
                break L11;
              } else {
                L12: {
                  var14 = ((tg) this).field_m.c(rf.field_j[var13]);
                  if (var9 >= var14) {
                    var13++;
                    break L12;
                  } else {
                    var9 = var14;
                    break L12;
                  }
                }
                var13++;
                var13++;
                var13++;
                break L11;
              }
            }
            L13: {
              var12 = param1;
              if (var5 + (var9 + var12) > t.field_j) {
                var12 = -var5 + t.field_j - var9;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var13 = 32 + param2 + -((tg) this).field_m.field_D;
              if (var6 + var10 + var13 > t.field_d) {
                var13 = param2 - var10 - var6;
                break L14;
              } else {
                break L14;
              }
            }
            if (param3 <= 123) {
              return;
            } else {
              t.a(var12, var13, var9 + var5, var10 - -var6, ((tg) this).field_d);
              t.d(var12 + 1, 1 + var13, var9 - (-var5 + 2), -2 + (var10 - -var6), ((tg) this).field_e);
              int discarded$6 = ((tg) this).field_m.a(param0, var12 - -((tg) this).field_n, var13 + ((tg) this).field_o, var9, var10, ((tg) this).field_c, -1, 0, 0, var7);
              return;
            }
          } else {
            L15: {
              var12 = param1;
              if (var5 + (var9 + var12) > t.field_j) {
                var12 = -var5 + t.field_j - var9;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var13 = 32 + param2 + -((tg) this).field_m.field_D;
              if (var6 + var10 + var13 > t.field_d) {
                var13 = param2 - var10 - var6;
                break L16;
              } else {
                break L16;
              }
            }
            if (param3 <= 123) {
              return;
            } else {
              t.a(var12, var13, var9 + var5, var10 - -var6, ((tg) this).field_d);
              t.d(var12 + 1, 1 + var13, var9 - (-var5 + 2), -2 + (var10 - -var6), ((tg) this).field_e);
              int discarded$7 = ((tg) this).field_m.a(param0, var12 - -((tg) this).field_n, var13 + ((tg) this).field_o, var9, var10, ((tg) this).field_c, -1, 0, 0, var7);
              return;
            }
          }
        }
    }

    final void a(int param0, jl param1) {
        int var7_int = 0;
        int var15 = Pixelate.field_H ? 1 : 0;
        uc var17 = new uc(param1, 2, 2, 2236962, 1, 1, 1, param1.field_z + (param1.field_w + 2));
        var17.field_g = 16777215;
        ((tg) this).field_a = (eb) (Object) var17;
        w var4 = new w();
        var17.a((uc) (Object) var4, (byte) 126);
        ((tg) this).field_e = 5592405;
        ((tg) this).field_p = 3;
        ((tg) this).field_o = 3;
        var4.field_e = 15658734;
        var4.field_o = 11711154;
        ((tg) this).field_d = 15658734;
        ((tg) this).field_c = 15658734;
        ((tg) this).field_q = -1;
        ((tg) this).field_n = 3;
        ((tg) this).field_m = param1;
        ((tg) this).field_g = 3;
        lf discarded$0 = var4.a(0, 7177).a(15658734, 15115).a(qa.a(8947848, 7829367, 10066329, 3), (byte) -65);
        lf discarded$1 = var4.a(1, 7177).a(qa.a(11184810, 13421772, 10066329, param0 ^ 7), (byte) -65);
        lf discarded$2 = var4.a(3, 7177).a(qa.a(8947848, 10066329, 7829367, 3), (byte) -65).a((byte) 124, 1).a(1, false);
        tf[] var5 = new tf[9];
        sa var16 = new sa(32, 32);
        sa var18 = var16;
        for (var7_int = 0; var18.field_G.length > var7_int; var7_int++) {
            var16.field_G[var7_int] = 1077952576;
        }
        var5[4] = (tf) (Object) var18;
        lf discarded$3 = var4.a(4, 7177).a(true, true).a(var5, (byte) -65);
        lf discarded$4 = var4.a(5, 7177).a(og.a(0, true, 65793, 0, 0), (byte) -65).a(true, true).a(-1, 15115);
        ((tg) this).field_r = (eb) (Object) var4;
        w var6 = new w(var4, true);
        var6.field_l = 0;
        w var7 = new w(var4, true);
        var7.field_l = 0;
        var7.a(0, pg.a(8947848, (byte) -128));
        lf discarded$5 = var7.a(1, 7177).a(pg.a(11184810, (byte) -93), (byte) -65).a(2236962, 15115);
        ((tg) this).field_t = (eb) (Object) new jo(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        f discarded$6 = new f(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        hg discarded$7 = new hg(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        w var8 = new w();
        var17.a((uc) (Object) var8, (byte) 126);
        lf discarded$8 = var8.a(0, 7177).a(qa.a(15658734, 10066329, 7829367, 3), (byte) -65).a(1118481, 15115).a(-1, (byte) -68);
        lf discarded$9 = var8.a(4, 7177).a(true, true).a(var5, (byte) -65);
        ((tg) this).field_i = (eb) (Object) var8;
        tf[] var9 = new tf[9];
        tf[] var10 = new tf[9];
        var9[4] = new tf(2, 1);
        var10[4] = new tf(1, 2);
        var9[4].field_G = new int[]{6710886, 7829367};
        var10[param0].field_G = new int[]{6710886, 7829367};
        w var11 = new w();
        w var12 = new w();
        var11.a(122, 0, var9);
        var12.a(92, 0, var10);
        tf var13 = new tf(7, 4);
        var13.field_G = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        w var14 = new w(var4, true);
        var14.a(param0 + 107, var13.a());
        var13.b();
        var14 = new w(var4, true);
        var14.a(79, var13.a());
        var13.b();
        var14 = new w(var4, true);
        var14.a(-8, var13.a());
        var13.b();
        w var19 = new w(var4, true);
        var19.a(param0 ^ -20, var13);
    }

    final static byte[] a(boolean param0, boolean param1, Object param2) {
        byte[] var3 = null;
        gf var4 = null;
        if (param0) {
            field_h = null;
            if (param2 == null) {
                return null;
            }
            if (!(!(param2 instanceof byte[]))) {
                var3 = (byte[]) param2;
                if (!param1) {
                    return var3;
                }
                return re.a(true, var3);
            }
            if (!(!(param2 instanceof gf))) {
                var4 = (gf) param2;
                return var4.b(32);
            }
            throw new IllegalArgumentException();
        }
        if (param2 == null) {
            return null;
        }
        if (!(!(param2 instanceof byte[]))) {
            var3 = (byte[]) param2;
            if (!param1) {
                return var3;
            }
            return re.a(true, var3);
        }
        if (!(!(param2 instanceof gf))) {
            var4 = (gf) param2;
            return var4.b(32);
        }
        throw new IllegalArgumentException();
    }

    public tg() {
        ((tg) this).field_k = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Total Time: ";
        field_j = new dj();
        field_l = "<%0> must play <%1> more rated games before playing with the current options.";
        field_h = null;
    }
}
