/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class f {
    static int[] field_c;
    static BitSet field_e;
    static int field_b;
    private cva[] field_d;
    private csa[] field_f;
    private int field_a;

    final void a(csa param0, boolean param1) {
        int var3 = 0;
        cva var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (!(null != ((f) this).field_d)) {
            return;
        }
        ((f) this).field_f = new csa[((f) this).field_d.length];
        if (param1) {
            return;
        }
        for (var3 = 0; (var3 ^ -1) > (((f) this).field_d.length ^ -1); var3++) {
            var4 = ((f) this).field_d[var3];
            ((f) this).field_f[var3] = param0.a(var4.field_d, var4.field_a, 20);
        }
        ((f) this).field_d = null;
        this.a(0);
    }

    private final void a(int param0) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        for (var3_int = param0; ((f) this).field_f.length > var3_int; var3_int++) {
            if (null != ((f) this).field_f[var3_int]) {
                // ifeq L45
            } else {
                ((f) this).field_f[var3_int] = null;
                var2++;
            }
        }
        csa[] var3 = new csa[-var2 + ((f) this).field_f.length];
        var2 = 0;
        for (var4 = 0; (((f) this).field_f.length ^ -1) < (var4 ^ -1); var4++) {
            if (!(((f) this).field_f[var4] == null)) {
                var3[var2] = ((f) this).field_f[var4];
                var2++;
            }
        }
        ((f) this).field_f = var3;
    }

    final lj[] a(byte param0) {
        int var3_int = 0;
        csa var4_ref_csa = null;
        csa var5 = null;
        int var4 = 0;
        csa var5_ref = null;
        lj var6 = null;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        for (var3_int = 0; ((f) this).field_f.length > var3_int; var3_int++) {
            var4_ref_csa = ((f) this).field_f[var3_int];
            var5 = var4_ref_csa;
            var5 = var4_ref_csa;
            if (var4_ref_csa != null) {
                var5 = (csa) (Object) var4_ref_csa.u(-91);
                if (!(var5 == null)) {
                    var2++;
                }
            }
        }
        if (param0 != -103) {
            return null;
        }
        lj[] var3 = new lj[var2];
        var2 = 0;
        for (var4 = 0; ((f) this).field_f.length > var4; var4++) {
            var5_ref = ((f) this).field_f[var4];
            if (var5_ref != null) {
                var6 = var5_ref.u(param0 + -24);
                if (var6 != null) {
                    var3[var2] = var6;
                    var2++;
                }
            }
        }
        return var3;
    }

    final static String a(int param0, boolean param1, int param2, long param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          var6 = 44;
          var7 = 46;
          if (0 == param2) {
            var6 = 46;
            var7 = 44;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 == 2) {
            var7 = 160;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var8 = 0;
          if (-1L >= (param3 ^ -1L)) {
            break L2;
          } else {
            var8 = 1;
            param3 = -param3;
            break L2;
          }
        }
        L3: {
          var9 = new StringBuilder(26);
          if (param4 > 0) {
            var10 = 0;
            L4: while (true) {
              if (param4 <= var10) {
                StringBuilder discarded$6 = var9.append(var6);
                break L3;
              } else {
                var11 = (int)param3;
                param3 = param3 / 10L;
                StringBuilder discarded$7 = var9.append((char)(-((int)param3 * 10) + var11 + 48));
                var10++;
                continue L4;
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          if (param0 == 2843) {
            break L5;
          } else {
            int discarded$8 = f.a(true);
            break L5;
          }
        }
        var10 = 0;
        L6: while (true) {
          var11 = (int)param3;
          param3 = param3 / 10L;
          StringBuilder discarded$9 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
          if ((param3 ^ -1L) != -1L) {
            L7: {
              if (!param1) {
                break L7;
              } else {
                var10++;
                if (0 == var10 % 3) {
                  StringBuilder discarded$10 = var9.append(var7);
                  break L7;
                } else {
                  continue L6;
                }
              }
            }
            continue L6;
          } else {
            L8: {
              if (var8 != 0) {
                StringBuilder discarded$11 = var9.append(45);
                break L8;
              } else {
                break L8;
              }
            }
            return var9.reverse().toString();
          }
        }
    }

    final static void b(int param0) {
        vo.field_b = false;
        if (!(kga.field_n == null)) {
            kga.field_n.a(true);
        }
        int var1 = -18 % ((-10 - param0) / 43);
        if (!((bta.field_q ^ -1) == -1)) {
            ufa.a(true);
        }
        wv.field_j = 0;
    }

    final static void b(byte param0) {
        double var1 = 0.0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = TombRacer.field_G ? 1 : 0;
        if (null != bt.field_h) {
          return;
        } else {
          bt.field_h = new int[65536];
          var1 = Math.random() * 0.03 - 0.015 + 0.7;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (-513 >= (var4 ^ -1)) {
              L1: {
                if (param0 == 58) {
                  break L1;
                } else {
                  f.b((byte) 1);
                  break L1;
                }
              }
              return;
            } else {
              var5 = 360.0f * ((float)(var4 >> 508759011) / 64.0f + 0.0078125f);
              var6 = 0.0625f + (float)(7 & var4) / 8.0f;
              var7 = 0;
              L2: while (true) {
                if (var7 >= 128) {
                  var4++;
                  continue L0;
                } else {
                  L3: {
                    var8 = (float)var7 / 128.0f;
                    var9 = 0.0f;
                    var10 = 0.0f;
                    var11 = 0.0f;
                    var12 = var5 / 60.0f;
                    var13 = (int)var12;
                    var14 = var13 % 6;
                    var15 = var12 - (float)var13;
                    var16 = (-var6 + 1.0f) * var8;
                    var17 = var8 * (1.0f - var15 * var6);
                    var18 = var8 * (-(var6 * (1.0f - var15)) + 1.0f);
                    if (0 != var14) {
                      if (-2 == (var14 ^ -1)) {
                        var9 = var17;
                        var10 = var8;
                        var11 = var16;
                        break L3;
                      } else {
                        if (var14 == 2) {
                          var9 = var16;
                          var11 = var18;
                          var10 = var8;
                          break L3;
                        } else {
                          if ((var14 ^ -1) == -4) {
                            var10 = var17;
                            var11 = var8;
                            var9 = var16;
                            break L3;
                          } else {
                            if ((var14 ^ -1) == -5) {
                              var11 = var8;
                              var9 = var18;
                              var10 = var16;
                              break L3;
                            } else {
                              if ((var14 ^ -1) != -6) {
                                break L3;
                              } else {
                                var11 = var17;
                                var9 = var8;
                                var10 = var16;
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var9 = var8;
                      var11 = var16;
                      var10 = var18;
                      break L3;
                    }
                  }
                  var9 = (float)Math.pow((double)var9, var1);
                  var10 = (float)Math.pow((double)var10, var1);
                  var11 = (float)Math.pow((double)var11, var1);
                  var19 = (int)(256.0f * var9);
                  var20 = (int)(256.0f * var10);
                  var21 = (int)(var11 * 256.0f);
                  var22 = var21 + ((var19 << 1215244016) + -16777216) - -(var20 << -2110225432);
                  var3++;
                  bt.field_h[var3] = var22;
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 24641) {
            field_b = -112;
        }
    }

    final static int a(boolean param0) {
        L0: {
          if (!param0) {
            break L0;
          } else {
            f.b((byte) -68);
            break L0;
          }
        }
        L1: {
          if (!lca.a(param0)) {
            break L1;
          } else {
            if (null != wu.field_a.a((byte) 127)) {
              return wu.field_a.a((byte) -73).field_i;
            } else {
              break L1;
            }
          }
        }
        return -1;
    }

    f(int param0, int param1) {
        ((f) this).field_a = param0;
        ((f) this).field_f = new csa[]{};
    }

    f(int param0, int param1, int param2, kh param3) {
        int var6 = 0;
        ((f) this).field_a = param0;
        int var5 = param3.b((byte) 44, iia.d(param0, 22972));
        ((f) this).field_f = new csa[var5];
        ((f) this).field_d = new cva[var5];
        for (var6 = 0; (var6 ^ -1) > (var5 ^ -1); var6++) {
            ((f) this).field_d[var6] = new cva(param3.b((byte) 44, 1) == 1 ? true : false, param3.b((byte) 44, 8));
        }
    }

    final void a(kh param0, int param1, csa param2) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param1 <= 105) {
            field_c = null;
        }
        this.a(0);
        param0.a((byte) 44, ((f) this).field_f.length, iia.d(((f) this).field_a, 22972));
        for (var4 = 0; ((f) this).field_f.length > var4; var4++) {
            if (param2 != ((f) this).field_f[var4].o((byte) -48)) {
                param0.a((byte) 73, 0, 1);
                param0.a((byte) 111, ((f) this).field_f[var4].n(31974).a((byte) 62), 8);
            } else {
                param0.a((byte) -127, 1, 1);
                param0.a((byte) -126, ((f) this).field_f[var4].i((byte) 84).a((byte) 115), 8);
            }
        }
    }

    static {
    }
}
