/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static byte[][] field_c;
    private fd field_d;
    static boolean field_i;
    static volatile boolean field_f;
    static int[][] field_h;
    private int field_e;
    private ak field_k;
    private int field_j;
    static long field_a;
    static ka field_b;
    static ka field_g;

    public static void a(int param0) {
        field_b = null;
        if (param0 < -90) {
          field_g = null;
          field_h = (int[][]) null;
          field_c = (byte[][]) null;
          return;
        }
        field_h = (int[][]) null;
        field_g = null;
        field_h = (int[][]) null;
        field_c = (byte[][]) null;
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        lb var6 = null;
        re var6_ref = null;
        int var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_e < param2) {
            throw new IllegalStateException();
          }
          this.a(50, param3);
          this.field_j = this.field_j - param2;
          while (this.field_j < 0) {
            var6 = (lb) (this.field_k.a(0));
            this.a(var6, -27615);
          }
          var6_ref = new re(param1, param2);
          this.field_d.a((byte) 31, var6_ref, param3);
          this.field_k.a(var6_ref, 2);
          ((lb) ((Object) var6_ref)).field_l = (long)param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "je.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = param1; var2_int > var4; var4++) {
            var3[var2_int + (-1 - var4)] = param0.charAt(var4);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("je.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, long param1) {
        lb var4 = null;
        lb var4Lifetime1;
        if (param0 == 50) {
          var4 = (lb) (this.field_d.a(104, param1));
          this.a(var4, -27615);
          return;
        }
        this.a((Object) null, (byte) -11, -42L);
        var4Lifetime1 = (lb) (this.field_d.a(104, param1));
        this.a(var4Lifetime1, -27615);
    }

    final static void a(byte param0, nc param1) {
        try {
          mj.field_a.b(param1);
          if (param0 != 15) {
            field_h = (int[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "je.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = TorChallenge.field_F ? 1 : 0;
        nh.field_jb = 0;
        n.field_cb = null;
        bl.field_V = null;
        var2 = wb.field_d;
        wb.field_d = pg.field_m;
        if (param0 == 51) {
          gb.field_d.field_b = 2;
          gb.field_d.field_h = gb.field_d.field_h + 1;
          pg.field_m = var2;
          if (!param1) {
            return 25;
          }
          if (gb.field_d.field_h >= 2 &&
            param0 == 51) {
            return 2;
          }
          if (gb.field_d.field_h >= 2 &&
            50 == param0) {
            return 5;
          }
        } else {
          if (param0 != 50) {
            gb.field_d.field_b = 1;
            gb.field_d.field_h = gb.field_d.field_h + 1;
            pg.field_m = var2;
            if (!param1) {
              return 25;
            }
            if (gb.field_d.field_h >= 2 &&
              param0 == 51) {
              return 2;
            }
            if (gb.field_d.field_h >= 2 &&
              50 == param0) {
              return 5;
            }
            if (4 <= gb.field_d.field_h) {
              return 1;
            }
            return -1;
          }
          gb.field_d.field_b = 5;
          gb.field_d.field_h = gb.field_d.field_h + 1;
          pg.field_m = var2;
          if (!param1) {
            return 25;
          }
          if (gb.field_d.field_h >= 2) {
            if (param0 == 51) {
              return 2;
            }
            if (gb.field_d.field_h >= 2 &&
              50 == param0) {
              return 5;
            }
            if (4 <= gb.field_d.field_h) {
              return 1;
            }
            return -1;
          }
          if (gb.field_d.field_h < 2) {
            if (4 <= gb.field_d.field_h) {
              return 1;
            }
            return -1;
          }
          if (50 == param0) {
            return 5;
          }
        }
        if (4 > gb.field_d.field_h) {
          return -1;
        }
        return 1;
    }

    private je() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0, String param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (kj.field_G == -1 &&
            sd.field_b == -1) {
            kj.field_G = kc.field_u;
            sd.field_b = ph.field_d;
          }
          bk.field_p = bk.field_p + 1;
          if (param0 != -109) {
            field_a = 50L;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 == null) {
            decompiledFrameRemainder0 = (ie.field_g == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(ie.field_g));
          }
          if (decompiledFrameRemainder0) {
            if (!sj.field_R) {
              if (bk.field_p >= cf.field_a) {
                stackIn_19_0 = (ef.field_e + cf.field_a > bk.field_p) ? 1 : 0;
              } else {
                stackIn_19_0 = 0;
              }
            } else {
              stackIn_19_0 = 0;
            }
            var2_int = stackIn_19_0;
            if (param1 == null) {
              bk.field_p = 0;
            } else {
              if (sj.field_R) {
                bk.field_p = cf.field_a;
              } else {
                if (var2_int != 0) {
                  bk.field_p = cf.field_a;
                } else {
                  bk.field_p = 0;
                }
              }
            }
            if (param1 != null) {
              sj.field_R = false;
            } else {
              if (var2_int != 0) {
                sj.field_R = true;
              }
            }
            ul.field_n = sd.field_b;
            bi.field_h = kj.field_G;
          }
          if (!sj.field_R &&
            cf.field_a > bk.field_p &&
            ek.field_P) {
            bi.field_h = kj.field_G;
            ul.field_n = sd.field_b;
            bk.field_p = 0;
          }
          ie.field_g = param1;
          kj.field_G = -1;
          sd.field_b = -1;
          if (sj.field_R) {
            if (bk.field_p != gi.field_e) {
              return;
            }
            bk.field_p = 0;
            sj.field_R = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("je.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    private final void a(lb param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            param0.a(true);
            param0.a(12695);
            this.field_j = this.field_j + param0.field_r;
          }
          if (param1 == -27615) {
            return;
          }
          this.field_j = 30;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("je.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(Object param0, byte param1, long param2) {
        try {
          int var5_int = -44 % ((param1 - 24) / 43);
          this.a(0, param0, 1, param2);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "je.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final Object a(long param0, int param1) {
        Object var8 = null;
        re var6 = null;
        lb var7 = (lb) (this.field_d.a(103, param0));
        re var6Lifetime1;
        if (var7 == null) {
          return null;
        }
        if (param1 != 0) {
          this.a(28, -88L);
          var8 = var7.c((byte) 70);
          if (var8 != null) {
            if (!var7.e(1024)) {
              this.field_k.a(var7, 2);
              var7.field_l = 0L;
            } else {
              var6 = new re(var8, var7.field_r);
              this.field_d.a((byte) 112, var6, var7.field_d);
              this.field_k.a(var6, 2);
              ((lb) ((Object) var6)).field_l = 0L;
              var7.a(true);
              var7.a(12695);
            }
            return var8;
          }
          var7.a(true);
          var7.a(param1 ^ 12695);
          this.field_j = this.field_j + var7.field_r;
          return null;
        }
        Object var9 = var7.c((byte) 70);
        if (var9 != null) {
          if (!var7.e(1024)) {
            this.field_k.a(var7, 2);
            var7.field_l = 0L;
          } else {
            var6Lifetime1 = new re(var9, var7.field_r);
            this.field_d.a((byte) 112, var6Lifetime1, var7.field_d);
            this.field_k.a(var6Lifetime1, 2);
            ((lb) ((Object) var6Lifetime1)).field_l = 0L;
            var7.a(true);
            var7.a(12695);
          }
          return var9;
        }
        var7.a(true);
        var7.a(param1 ^ 12695);
        this.field_j = this.field_j + var7.field_r;
        return null;
    }

    static {
        field_i = false;
        field_f = true;
        field_h = new int[][]{new int[]{110, 77}, new int[]{191, 61}, new int[]{194, 69}};
    }
}
