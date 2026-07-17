/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends kl {
    private pp field_m;
    private String field_p;
    private pp field_r;
    boolean field_s;
    private int field_q;
    static int field_t;
    int field_o;
    int field_n;

    hn(String param0, int param1, int param2, int param3) {
        super(300, 174);
        try {
            ((hn) this).field_o = param3;
            ((hn) this).field_p = param0;
            ((hn) this).field_n = param1;
            ((hn) this).field_q = param2;
            ((hn) this).field_m = tn.a((-jm.field_i.field_y + ((hn) this).field_a >> 1) + ((hn) this).field_k, -(2 * jm.field_i.field_v) + (((hn) this).field_i + ((hn) this).field_j) + -24, (se) (Object) ne.field_c, jm.field_i, -39, "Accept");
            ((hn) this).field_r = tn.a((((hn) this).field_a - jm.field_i.field_y >> 1) + ((hn) this).field_k, -16 + (((hn) this).field_i + (((hn) this).field_j + -jm.field_i.field_v)), (se) (Object) ne.field_c, jm.field_i, -70, "Cancel");
            ((hn) this).field_f.a((ne) (Object) ((hn) this).field_m, false);
            ((hn) this).field_f.a((ne) (Object) ((hn) this).field_r, false);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void d(byte param0) {
        cn var1 = null;
        cn var2 = null;
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        try {
            var1 = new cn(540, 140);
            lm.a(var1, (byte) 70);
            re.b();
            gf.a();
            nl.field_d = 0;
            id.a(439027688);
            var2 = var1.d();
            for (var3 = 0; var3 < 15; var3++) {
                var2.e(-2, -2, 16777215);
                gf.d(4, 4, 0, 0, 540, 140);
            }
            ie.field_l.e();
            var1.a(0, 0);
            ti.c(true);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hn.C(" + -117 + 41);
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var7 = 0;
        int var4 = ((hn) this).field_j + 50;
        int var5 = ((hn) this).field_k + 32;
        param1 = param1 - var5;
        param2 = param2 - var4;
        int var6 = -47 / ((param0 - -11) / 58);
        if (param2 >= -10) {
            if (param2 < 14) {
                if (param1 >= -10) {
                    if (!(param1 >= 10 + (-64 + ((hn) this).field_a))) {
                        var7 = ((((hn) this).field_a >> 1) - (32 - (-2 + ((hn) this).field_n) * param1)) / (-64 + ((hn) this).field_a) + 1;
                        if (var7 < 1) {
                            var7 = 1;
                        }
                        if (!(-1 + ((hn) this).field_n >= var7)) {
                            var7 = ((hn) this).field_n + -1;
                        }
                        return var7;
                    }
                }
            }
        }
        return -1;
    }

    final void a(boolean param0) {
        int var2 = 0;
        super.a(param0);
        if (null != hh.field_s) {
            ((hn) this).field_s = (Object) (Object) hh.field_s == (Object) (Object) ((hn) this).field_m ? true : false;
            ((hn) this).field_d = true;
        }
        if (!(no.field_d != 1)) {
            var2 = this.a((byte) 113, lc.field_c, hm.field_k);
            if (var2 != -1) {
                ((hn) this).field_o = var2;
            }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        super.b(117);
        var2 = (((hn) this).field_a >> 1) + ((hn) this).field_k;
        var3 = 10 + ((hn) this).field_j;
        ne.field_c.c(((hn) this).field_p, var2, var3 - -ne.field_c.field_H, 16777215, -1);
        var3 = var3 + (10 + ne.field_c.field_H);
        var4 = 50 + ((hn) this).field_j;
        qe.b(((hn) this).field_k - -32, var4, -64 + ((hn) this).field_a, 4, 0, 128, 128);
        var5 = 119 / ((param0 - 41) / 63);
        var6 = 0;
        L0: while (true) {
          if (((hn) this).field_n + -1 <= var6) {
            var6 = ((hn) this).field_k + (32 + (((hn) this).field_q - 1) * (((hn) this).field_a - 64) / (((hn) this).field_n + -2));
            var7 = 0;
            L1: while (true) {
              if (var7 >= 8) {
                var6 = ((hn) this).field_k + (32 + (-64 + ((hn) this).field_a) * (((hn) this).field_o + -1) / (((hn) this).field_n + -2));
                var7 = 0;
                L2: while (true) {
                  if (8 <= var7) {
                    L3: {
                      var7 = this.a((byte) 55, hj.field_S, eh.field_h);
                      if (var7 == -1 + ((hn) this).field_o) {
                        break L3;
                      } else {
                        if (var7 != -1) {
                          var6 = 32 + (((hn) this).field_k - -((((hn) this).field_a + -64) * (var7 - 1) / (-2 + ((hn) this).field_n)));
                          var8 = 0;
                          L4: while (true) {
                            if (var8 >= 8) {
                              break L3;
                            } else {
                              gf.b(-var8 + var6, var4 + (-6 - -var8), 2, 16776960);
                              gf.b(var8 + var6, var4 - 6 - -var8, 2, 16776960);
                              gf.b(var6 - var8, 9 + var4 + -var8, 2, 16776960);
                              gf.b(var8 + var6, -var8 + (var4 - -9), 2, 16776960);
                              var8++;
                              continue L4;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    qe.field_i[0].h(-50 + var2, var4 - -20);
                    ne.field_c.b(Integer.toString(((hn) this).field_o), -30 + var2, var4 + 36, 16711680, -1);
                    qe.field_i[1].h(var2, var4 - -20);
                    ne.field_c.b(Integer.toString(((hn) this).field_n + -((hn) this).field_o), 20 + var2, 36 + var4, 65280, -1);
                    ue.field_i[1].h(((hn) this).field_k + 20, 24 + ((hn) this).field_j);
                    ue.field_i[0].h(-36 + (((hn) this).field_a + ((hn) this).field_k), ((hn) this).field_j - -24);
                    return;
                  } else {
                    gf.b(var6 + -var7, var7 + (-6 + var4), 2, 16744576);
                    gf.b(var6 + var7, var7 + (var4 + -6), 2, 16711680);
                    gf.b(var6 + -var7, -var7 + (9 + var4), 2, 16744576);
                    gf.b(var7 + var6, -var7 + var4 - -9, 2, 16711680);
                    var7++;
                    continue L2;
                  }
                }
              } else {
                gf.b(-var7 + var6, var7 + var4 - 6, 2, 8421504);
                gf.b(var7 + var6, var7 + -6 + var4, 2, 8421504);
                gf.b(-var7 + var6, var4 + 9 - var7, 2, 8421504);
                gf.b(var7 + var6, 9 + var4 - var7, 2, 8421504);
                var7++;
                continue L1;
              }
            }
          } else {
            var7 = var6 * (((hn) this).field_a - 64) / (((hn) this).field_n + -2) + (32 + ((hn) this).field_k);
            var8 = 0;
            L5: while (true) {
              if (var8 >= 4) {
                var6++;
                continue L0;
              } else {
                gf.c(-var8 + var7, var4 - (2 - var8), 8 - var8 * 2, 16711680);
                gf.c(var7 - (-1 - var8), var8 + -2 + var4, -(2 * var8) + 8, 16744576);
                var8++;
                continue L5;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 640;
    }
}
