/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends hg {
    static String field_m;
    private int field_r;
    static String[][] field_o;
    static kc field_t;
    static int[] field_u;
    private long[] field_h;
    static int field_k;
    private long field_f;
    private long field_i;
    private long field_s;
    static int[] field_g;
    static kc field_j;
    static String field_q;
    private int field_l;
    static int[] field_n;
    static String field_p;

    final static void a(int param0, ec param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 60) {
                break L1;
              } else {
                boolean discarded$2 = lj.b(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lj.Q(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final long a(byte param0) {
        int discarded$0 = 10;
        ((lj) this).field_f = ((lj) this).field_f + this.c();
        if (!(~((lj) this).field_i >= ~((lj) this).field_f)) {
            return (-((lj) this).field_f + ((lj) this).field_i) / 1000000L;
        }
        int var2 = -7 / ((-43 - param0) / 58);
        return 0L;
    }

    final void a(int param0) {
        if (param0 != -12619) {
            field_u = null;
        }
        ((lj) this).field_s = 0L;
        if (!(((lj) this).field_i <= ((lj) this).field_f)) {
            ((lj) this).field_f = ((lj) this).field_f + (-((lj) this).field_f + ((lj) this).field_i);
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            lj.c(-97);
        }
        return hk.field_s;
    }

    final int a(long param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 < -15) {
          if (((lj) this).field_f < ((lj) this).field_i) {
            ((lj) this).field_s = ((lj) this).field_s + (-((lj) this).field_f + ((lj) this).field_i);
            ((lj) this).field_f = ((lj) this).field_f + (((lj) this).field_i + -((lj) this).field_f);
            ((lj) this).field_i = ((lj) this).field_i + param0;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((lj) this).field_i = ((lj) this).field_i + param0;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (~((lj) this).field_i > ~((lj) this).field_f) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (~((lj) this).field_f < ~((lj) this).field_i) {
                  ((lj) this).field_i = ((lj) this).field_f;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          }
        } else {
          return 40;
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        qb var4 = null;
        qb var5 = null;
        int var6 = 0;
        qb var8 = null;
        qb var9 = null;
        qb var10 = null;
        qb var11 = null;
        qb var12 = null;
        qb var13 = null;
        qb var14 = null;
        qb var15 = null;
        qb var16 = null;
        qb var17 = null;
        L0: {
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = param1;
          vn.field_b = ea.field_E[var2];
          wm.field_H[var2] = null;
          wm.field_H[var2] = new qb(640, 480);
          wm.field_H[var2].a();
          if (5 == param1) {
            break L0;
          } else {
            if (param1 == 3) {
              break L0;
            } else {
              if (param1 == 2) {
                break L0;
              } else {
                if (4 == param1) {
                  break L0;
                } else {
                  if (param1 == 1) {
                    break L0;
                  } else {
                    L1: {
                      if (param1 != 7) {
                        break L1;
                      } else {
                        if (null != jb.field_z) {
                          break L0;
                        } else {
                          if (null != r.field_b) {
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    int discarded$5 = 0;
                    ql.a(640, 480);
                    break L0;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (param1 == 0) {
            var8 = new qb(640, 480);
            var9 = var8;
            var9.a();
            ArcanistsMulti.a(param1, (byte) -26);
            wm.field_H[var2].a();
            var9.b(0, 0, 128);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param1 != 0) {
            break L3;
          } else {
            L4: {
              var3 = sc.field_U[param1] * wl.field_L[param1].length + tg.field_f[param1];
              var4 = new qb(640, 480);
              var4.a();
              o.field_F.c(-64 + lm.field_e[param1], var3 + -80);
              j.field_a.c(eo.field_b[param1] - 110, -70 + var3);
              pe.field_Ib.c(lm.field_e[param1] + -39, tg.field_f[param1] - 66);
              rg.field_a.c(-150 + eo.field_b[param1], -80 + tg.field_f[param1]);
              var5 = fj.a(ec.field_c, -22612, ue.field_d, "");
              if (ec.field_c.equals((Object) (Object) "underdark")) {
                var5.a(0, -8 + (-var5.field_y + 480), 16777215);
                break L4;
              } else {
                if (!ec.field_c.equals((Object) (Object) "clockwork")) {
                  var5.a(0, -var5.field_y + 480, 16777215);
                  break L4;
                } else {
                  var5.a(0, 434 - var5.field_y, 16777215);
                  break L4;
                }
              }
            }
            de.d(4, 4, 0, 0, 640, 480);
            wm.field_H[var2].a();
            var4.b(0, 0, 255);
            o.field_F.c(lm.field_e[param1] + -64, var3 + -80);
            j.field_a.c(eo.field_b[param1] - 110, -70 + var3);
            pe.field_Ib.c(lm.field_e[param1] - 39, -66 + tg.field_f[param1]);
            rg.field_a.c(-150 + eo.field_b[param1], tg.field_f[param1] + -80);
            if (!ec.field_c.equals((Object) (Object) "underdark")) {
              if (ec.field_c.equals((Object) (Object) "clockwork")) {
                var5.c(0, 480 - var5.field_y - 46);
                break L3;
              } else {
                var5.c(0, -var5.field_y + 480);
                break L3;
              }
            } else {
              var5.c(0, -8 + -var5.field_y + 480);
              break L3;
            }
          }
        }
        L5: {
          if (param1 != 3) {
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (5 == param1) {
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (param1 == 6) {
            var10 = new qb(640, 480);
            var10.a();
            gl.a(371, 32, -27327, 576, kf.field_b, 63);
            wm.field_H[var2].a();
            var10.b(0, 0, 128);
            int discarded$6 = 0;
            bj.a(var10.field_A);
            var10.a();
            gd.field_mb.c(-(gd.field_mb.field_n / 2) + 320, -5);
            de.d(4, 4, 0, 0, 640, 480);
            wm.field_H[var2].a();
            var10.b(0, 0, 255);
            gd.field_mb.c(-(gd.field_mb.field_n / 2) + 320, -5);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (7 != param1) {
            break L8;
          } else {
            var11 = new qb(640, 480);
            var11.a();
            gl.a(385, 32, -27327, 576, kf.field_b, 63);
            wm.field_H[var2].a();
            var11.b(0, 0, 128);
            int discarded$7 = 0;
            bj.a(var11.field_A);
            var11.a();
            gd.field_mb.c(320 + -(gd.field_mb.field_n / 2), -5);
            de.d(4, 4, 0, 0, 640, 480);
            wm.field_H[var2].a();
            var11.b(0, 0, 255);
            gd.field_mb.c(320 - gd.field_mb.field_n / 2, -5);
            break L8;
          }
        }
        L9: {
          if (param1 != 9) {
            break L9;
          } else {
            var12 = new qb(640, 480);
            var12.a();
            gl.a(330, 32, -27327, 576, kf.field_b, 63);
            wm.field_H[var2].a();
            var12.b(0, 0, 128);
            var13 = new qb(640, 480);
            var13.a();
            gd.field_mb.c(320 - gd.field_mb.field_n / 2, 35);
            de.d(4, 4, 0, 0, 640, 480);
            wm.field_H[var2].a();
            var13.b(0, 0, 255);
            gd.field_mb.c(-(gd.field_mb.field_n / 2) + 320, 35);
            break L9;
          }
        }
        L10: {
          if (param1 != 8) {
            break L10;
          } else {
            var14 = new qb(640, 480);
            var14.a();
            fe.field_o.a(0, 0, 16777215);
            de.d(4, 4, 0, 0, 640, 480);
            wm.field_H[var2].a();
            var14.b(0, 0, 255);
            fe.field_o.c(0, 0);
            var15 = new qb(640, 480);
            var15.a();
            o.field_F.c(343, -2);
            j.field_a.c(108, 6);
            de.d(4, 4, 0, 0, 640, 480);
            wm.field_H[var2].a();
            var15.b(0, 0, 255);
            o.field_F.c(343, -2);
            j.field_a.c(108, 6);
            break L10;
          }
        }
        L11: {
          if (param1 == 11) {
            var16 = new qb(640, 480);
            var16.a();
            gd.field_mb.c(320 - gd.field_mb.field_n / 2 + -72, 10);
            gd.field_mb.c(72 + (-(gd.field_mb.field_n / 2) + 320), 10);
            de.d(4, 4, 0, 0, 640, 480);
            wm.field_H[var2].a();
            var16.b(0, 0, 255);
            gd.field_mb.c(248 + -(gd.field_mb.field_n / 2), 10);
            gd.field_mb.c(72 + -(gd.field_mb.field_n / 2) + 320, 10);
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (param1 == 12) {
            var17 = new qb(640, 480);
            var17.a();
            gd.field_mb.c(248 - gd.field_mb.field_n / 2, 0);
            gd.field_mb.c(72 + (320 - gd.field_mb.field_n / 2), 0);
            de.d(4, 4, 0, 0, 640, 480);
            wm.field_H[var2].a();
            var17.b(0, 0, 255);
            gd.field_mb.c(320 - (gd.field_mb.field_n / 2 - -72), 0);
            gd.field_mb.c(72 + (320 - gd.field_mb.field_n / 2), 0);
            break L12;
          } else {
            break L12;
          }
        }
        int discarded$8 = 491697968;
        rk.g();
    }

    public static void c(int param0) {
        field_j = null;
        field_m = null;
        field_n = null;
        field_g = null;
        field_u = null;
        field_o = null;
        field_t = null;
        field_p = null;
        field_q = null;
        if (param0 != -80) {
            Object var2 = null;
            lj.a(-21, (ec) null, -125, -127);
        }
    }

    private final long c() {
        int var9 = 0;
        int var10 = ArcanistsMulti.field_G ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -((lj) this).field_s + var2;
        ((lj) this).field_s = var2;
        if (-5000000000L < var4) {
            if (!(var4 >= 5000000000L)) {
                ((lj) this).field_h[((lj) this).field_r] = var4;
                ((lj) this).field_r = (((lj) this).field_r + 1) % 10;
                if (!(((lj) this).field_l >= 1)) {
                    ((lj) this).field_l = ((lj) this).field_l + 1;
                }
            }
        }
        long var6 = 0L;
        int var8 = 0;
        for (var9 = 1; ((lj) this).field_l >= var9; var9++) {
            var6 = var6 + ((lj) this).field_h[(-var9 + ((lj) this).field_r - -10) % 10];
        }
        return var6 / (long)((lj) this).field_l;
    }

    lj() {
        ((lj) this).field_r = 0;
        ((lj) this).field_h = new long[10];
        ((lj) this).field_i = 0L;
        ((lj) this).field_f = 0L;
        ((lj) this).field_s = 0L;
        ((lj) this).field_l = 1;
        ((lj) this).field_f = System.nanoTime();
        ((lj) this).field_i = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Similar rating";
        field_u = new int[]{62};
        field_q = "ZOMBIE MONKEY KILLER - ";
        field_g = new int[]{12, 13, 14};
        field_n = new int[]{36, 37, 38};
        field_p = "Lobby";
    }
}
