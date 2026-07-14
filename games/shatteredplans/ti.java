/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ti {
    static java.util.zip.CRC32 field_k;
    private oh field_f;
    private int field_b;
    private oh[] field_a;
    private oh field_l;
    static fg field_d;
    static fg field_i;
    private int field_c;
    static bi field_h;
    static boolean field_e;
    static String field_j;
    static bc field_g;

    public static void b(int param0) {
        field_h = null;
        field_d = null;
        field_i = null;
        field_k = null;
        field_j = null;
        field_g = null;
        if (param0 != 0) {
            field_k = null;
        }
    }

    final void a(oh param0, int param1, long param2) {
        if (!(param0.field_e == null)) {
            param0.b((byte) -125);
        }
        oh var5 = ((ti) this).field_a[(int)((long)(-1 + ((ti) this).field_b) & param2)];
        param0.field_e = var5.field_e;
        param0.field_f = var5;
        param0.field_e.field_f = param0;
        param0.field_b = param2;
        int var6 = 113 / ((-54 - param1) / 63);
        param0.field_f.field_e = param0;
    }

    final oh a(long param0, int param1) {
        oh var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        oh var4 = ((ti) this).field_a[(int)(param0 & (long)(-1 + ((ti) this).field_b))];
        ((ti) this).field_l = var4.field_f;
        while (((ti) this).field_l != var4) {
            if (!(((ti) this).field_l.field_b != param0)) {
                var5 = ((ti) this).field_l;
                ((ti) this).field_l = ((ti) this).field_l.field_f;
                return var5;
            }
            ((ti) this).field_l = ((ti) this).field_l.field_f;
        }
        if (param1 != -25064) {
            oh discarded$0 = ((ti) this).a(61L, 9);
        }
        ((ti) this).field_l = null;
        return null;
    }

    final static bi[] a(int param0) {
        bi[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = new bi[en.field_c];
        if (param0 < -103) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= en.field_c) {
              pd.a(0);
              return var1;
            } else {
              var3 = mc.field_s[var2] * cm.field_g[var2];
              var21 = hd.field_q[var2];
              if (ua.field_h[var2]) {
                var23 = kc.field_l[var2];
                var24 = new int[var3];
                var20 = var24;
                var16 = var20;
                var13 = var16;
                var6 = var13;
                var7 = 0;
                L1: while (true) {
                  if (var3 <= var7) {
                    var1[var2] = (bi) (Object) new om(tk.field_y, eg.field_t, cf.field_H[var2], sj.field_a[var2], mc.field_s[var2], cm.field_g[var2], var24);
                    var2++;
                    continue L0;
                  } else {
                    var6[var7] = ee.a(eo.field_fb[we.a((int) var21[var7], 255)], we.a(255, (int) var23[var7]) << 2107839288);
                    var7++;
                    continue L1;
                  }
                }
              } else {
                var9 = new int[var3];
                var22 = var9;
                var6_int = 0;
                L2: while (true) {
                  if (var3 <= var6_int) {
                    var1[var2] = new bi(tk.field_y, eg.field_t, cf.field_H[var2], sj.field_a[var2], mc.field_s[var2], cm.field_g[var2], var22);
                    var2++;
                    continue L0;
                  } else {
                    var9[var6_int] = eo.field_fb[we.a((int) var21[var6_int], 255)];
                    var6_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, qb param6, String param7, int param8) {
        ae.field_h = param3;
        dh.field_a = param6;
        rd.field_d = param7;
        si.field_u = param0;
        hn.field_i = param1;
        if (param5 != 1491341222) {
            field_j = null;
        }
        sr.field_q = param4;
        sg.field_Cb = param2;
        cf.field_D = param8;
        vp.field_o = (ar) (Object) new qc();
        vn.field_w = new rn(param6);
        lg.field_c = new tj(vp.field_o, vn.field_w);
    }

    final static int a(byte param0, ln[] param1) {
        int var2 = 0;
        pf var3 = null;
        pf var4 = null;
        int var5 = 0;
        int var6 = 0;
        ln var7 = null;
        ln[] var8 = null;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        ln var12 = null;
        ln var13 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param1.length) {
            L1: {
              var2 = param1.length;
              var3 = new pf();
              if (param0 == 83) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var4 = new pf();
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (var2 <= var6) {
                return var5;
              } else {
                var12 = param1[var6];
                if (0 == (var12.field_x ^ -1)) {
                  var4.a((byte) -113, (oh) (Object) var12);
                  L3: while (true) {
                    if (var4.g(-121)) {
                      var7 = (ln) (Object) var3.d(0);
                      L4: while (true) {
                        if (var7 == null) {
                          var3.a(0);
                          var5++;
                          var6++;
                          continue L2;
                        } else {
                          var7.field_x = var5;
                          var7 = (ln) (Object) var3.a((byte) -71);
                          continue L4;
                        }
                      }
                    } else {
                      var13 = (ln) (Object) var4.h(80);
                      var3.a((byte) -113, (oh) (Object) var13);
                      var13.field_x = var5;
                      if (var13.field_D == null) {
                        continue L3;
                      } else {
                        var8 = var13.field_D;
                        var9 = 0;
                        L5: while (true) {
                          if (var9 >= var8.length) {
                            continue L3;
                          } else {
                            var10 = var8[var9];
                            if ((var10.field_x ^ -1) == 0) {
                              var4.a((byte) -113, (oh) (Object) var10);
                              var9++;
                              continue L5;
                            } else {
                              var9++;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          } else {
            param1[var2].field_x = -1;
            var2++;
            continue L0;
          }
        }
    }

    final oh a(boolean param0) {
        oh var2 = null;
        int var3 = 0;
        oh var4 = null;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (-1 <= (((ti) this).field_c ^ -1)) {
            break L0;
          } else {
            if (((ti) this).field_f == ((ti) this).field_a[((ti) this).field_c - 1]) {
              break L0;
            } else {
              var2 = ((ti) this).field_f;
              ((ti) this).field_f = var2.field_f;
              return var2;
            }
          }
        }
        L1: while (true) {
          if (((ti) this).field_b <= ((ti) this).field_c) {
            if (param0) {
              bi[] discarded$2 = ti.a(10);
              return null;
            } else {
              return null;
            }
          } else {
            ((ti) this).field_c = ((ti) this).field_c + 1;
            var4 = ((ti) this).field_a[((ti) this).field_c].field_f;
            var2 = var4;
            if (var4 == ((ti) this).field_a[((ti) this).field_c - 1]) {
              continue L1;
            } else {
              ((ti) this).field_f = var2.field_f;
              return var2;
            }
          }
        }
    }

    final oh c(int param0) {
        int var2 = 61 % ((param0 - -63) / 54);
        ((ti) this).field_c = 0;
        return ((ti) this).a(false);
    }

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        var2.h(param0, 255);
        var2.field_j = var2.field_j + 1;
        int var3 = var2.field_j;
        var2.c(5, (byte) -92);
        var2.c(np.field_a.field_Eb, (byte) -120);
        int var4 = (np.field_a.field_Fb << 1491341222) + np.field_a.field_nc;
        var2.c(var4, (byte) -72);
        var2.a(param1, np.field_a.field_dc.length, np.field_a.field_dc, param1 ^ 22186);
        var2.b(var2.field_j - var3, (byte) 124);
    }

    final static boolean a(String param0, boolean param1) {
        if (!param1) {
            field_k = null;
        }
        return null != di.a(param0, 119) ? true : false;
    }

    ti(int param0) {
        int var2 = 0;
        oh var3 = null;
        ((ti) this).field_c = 0;
        ((ti) this).field_b = param0;
        ((ti) this).field_a = new oh[param0];
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new oh();
            ((ti) this).field_a[var2] = new oh();
            var3.field_f = var3;
            var3.field_e = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new java.util.zip.CRC32();
        field_d = new fg();
        field_j = "Add <%0> to friend list";
        field_i = new fg();
    }
}
