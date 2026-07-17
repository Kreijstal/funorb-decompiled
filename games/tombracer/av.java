/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class av {
    private hj field_f;
    static String field_b;
    private int[][] field_a;
    private int field_c;
    private int field_d;
    static boolean field_e;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((av) this).field_f.field_f) {
            return;
          } else {
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((av) this).field_f.field_a) {
                var2++;
                continue L0;
              } else {
                if (this.c(-124, ((av) this).field_f.b((byte) -5, var3, var2))) {
                  ((av) this).field_f.a(var3, 0, 0, var2);
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              lra.field_e.field_r = param4;
              if (2 == bta.field_q) {
                qpa.field_b.field_r = gj.field_a;
                break L1;
              } else {
                qpa.field_b.field_r = sd.field_J;
                break L1;
              }
            }
            var9_int = 495;
            var10 = 5;
            dh.field_e.a(var9_int + -10, param7, -23776, var10, 5);
            pq.field_g.a(dh.field_e.field_G - mka.field_b.field_G, param7, -23776, 0, 0);
            var10 = var10 + (param7 + param5);
            mka.field_b.a(mka.field_b.field_G, param7, -23776, 0, pq.field_g.field_G);
            lra.field_d.a(lra.field_d.b((byte) 69), param6, -23776, var10, 5);
            var11 = qpa.field_b.b((byte) 69);
            qpa.field_b.a(var11, param6, -23776, var10, var9_int + -5 + -var11);
            var12 = 5 + (param6 + var10);
            lra.field_e.a(var9_int, 20, -23776, 0, 0);
            ep.field_r.a(var9_int, var12, -23776, 20, 0);
            ep.field_r.field_w = hca.c(ep.field_r.field_t, 2105376, 3, 11579568, -112, 8421504);
            var12 = var12 + 20;
            wi.field_s.a(var9_int, var12, -23776, -(var12 / 2) + param0, -(var9_int / 2) + param8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var9;
            stackOut_7_1 = new StringBuilder().append("av.C(").append(param0).append(44).append(20).append(44).append(param2).append(44).append(-5327).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static void a(int param0, fia param1, int param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        try {
            wea.field_a = param4;
            int var9_int = 25;
            pu.field_b = param0;
            wk.field_n = param5;
            pca.field_a = param3;
            oi.field_a = param1;
            joa.field_a = param7;
            ko.field_d = param8;
            du.field_d = param6;
            wg.field_l = (qda) (Object) new gv();
            ep.field_k = new ss(param1);
            uja.field_a = new fma(wg.field_l, ep.field_k);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "av.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 103 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int var7 = 0;
        if (!((av) this).field_f.a(param1, param2, (byte) -128)) {
            return;
        }
        int var5 = ((av) this).field_f.b((byte) -5, param2, param1);
        int var6 = 0;
        if (var5 == 0) {
            var6 = 1;
        } else {
            if (!(var5 > 0)) {
                var7 = this.a((byte) -121, var5);
                if (!(var7 <= param3)) {
                    var6 = 1;
                }
            }
        }
        if (var6 == 0) {
            return;
        }
        int discarded$0 = 8421504;
        ((av) this).field_f.a(param2, this.b(param3), 0, param1);
        param3++;
        this.a(param0, -1 + param1, param2, param3);
        this.a(true, 1 + param1, param2, param3);
        this.a(true, param1, param2 - 1, param3);
        this.a(param0, param1, param2 - -1, param3);
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (((av) this).field_f.b((byte) -5, ((av) this).field_c, ((av) this).field_d) <= -100) {
          var2 = this.a((byte) -111, ((av) this).field_f.b((byte) -5, ((av) this).field_c, ((av) this).field_d));
          var3 = var2;
          ((av) this).field_a = new int[var2][2];
          var4 = ((av) this).field_d;
          var5 = ((av) this).field_c;
          var6 = 0;
          L0: while (true) {
            if (((av) this).field_a.length <= var6) {
              return;
            } else {
              var7 = -1 + (((av) this).field_a.length - var6);
              ((av) this).field_a[var7][0] = var4;
              ((av) this).field_a[var7][1] = var5;
              if (this.a(92, var5, -1 + var4) == var3 - 1) {
                var3--;
                var4--;
                var6++;
                continue L0;
              } else {
                if (-1 + var3 == this.a(90, var5, var4 - -1)) {
                  var3--;
                  var4++;
                  var6++;
                  continue L0;
                } else {
                  if (var3 - 1 == this.a(-41, -1 + var5, var4)) {
                    var5--;
                    var3--;
                    var6++;
                    continue L0;
                  } else {
                    if (this.a(96, var5 - -1, var4) != -1 + var3) {
                      return;
                    } else {
                      var3--;
                      var5++;
                      var6++;
                      continue L0;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final int[][] b(byte param0) {
        if (param0 < 120) {
            ((av) this).field_c = 94;
        }
        return ((av) this).field_a;
    }

    private final int b(int param0) {
        return -param0 + -100;
    }

    private final int a(byte param0, int param1) {
        if (param0 >= -25) {
            return -100;
        }
        return -param1 - 100;
    }

    final int[][] a(byte param0) {
        int var3_int = 0;
        int[][] var3 = null;
        int var4 = 0;
        qja var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        vna var8 = null;
        int[][] var9 = null;
        int[][] var10 = null;
        int[][] var11 = null;
        int[][] var12 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var8 = new vna();
        var3_int = 0;
        L0: while (true) {
          if (((av) this).field_f.field_f <= var3_int) {
            var12 = new int[var8.a((byte) -16)][2];
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var3 = var9;
            if (param0 <= -40) {
              var7 = 0;
              var4 = var7;
              var5 = (qja) (Object) var8.f(-80);
              L1: while (true) {
                if (var5 == null) {
                  return var3;
                } else {
                  var12[var7][0] = var5.field_h;
                  var12[var7][1] = var5.field_g;
                  var7++;
                  var5 = (qja) (Object) var8.e(125);
                  continue L1;
                }
              }
            } else {
              return null;
            }
          } else {
            var4 = 0;
            L2: while (true) {
              if (((av) this).field_f.field_a <= var4) {
                var3_int++;
                continue L0;
              } else {
                var5_int = 0;
                if (this.b(var4, var3_int, -51)) {
                  L3: {
                    if (this.b(var4, -1 + var3_int, 67)) {
                      var5_int++;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!this.b(var4, 1 + var3_int, 100)) {
                      break L4;
                    } else {
                      var5_int++;
                      break L4;
                    }
                  }
                  L5: {
                    if (this.b(-1 + var4, var3_int, 124)) {
                      var5_int++;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (!this.b(1 + var4, var3_int, 126)) {
                      break L6;
                    } else {
                      var5_int++;
                      break L6;
                    }
                  }
                  if (var5_int == 1) {
                    var8.b((byte) -80, (vg) (Object) new qja(var3_int, var4));
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void b() {
        field_b = null;
    }

    private final boolean c(int param0, int param1) {
        if (param0 > -104) {
            return true;
        }
        return param1 <= -100 ? true : false;
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 52 % ((26 - param0) / 61);
        if (!((av) this).field_f.a(param2, param1, (byte) -128)) {
            return 0;
        }
        int var5 = ((av) this).field_f.b((byte) -5, param1, param2);
        if (!this.c(-118, var5)) {
            return 0;
        }
        return this.a((byte) -36, var5);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((av) this).field_c = param1;
        ((av) this).field_d = param4;
        int var6 = 1;
        this.a(true, param2, param0, var6);
        if (param3 <= 79) {
            return;
        }
        int discarded$0 = 66;
        this.a();
        this.a(true);
    }

    final static ht a(int param0, int param1) {
        if (param1 != 0) {
            ht discarded$0 = av.a(96, 11);
        }
        return null != jb.field_K ? (ht) (Object) jb.field_K.a(-122, (long)param0) : null;
    }

    private final boolean b(int param0, int param1, int param2) {
        if (!((av) this).field_f.a(param1, param0, (byte) -128)) {
            return true;
        }
        int var4 = 6 / ((5 - param2) / 55);
        return ((av) this).field_f.b((byte) -5, param0, param1) == 0 ? true : false;
    }

    av(hj param0) {
        try {
            ((av) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "av.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Enter name of player to delete from list";
    }
}
