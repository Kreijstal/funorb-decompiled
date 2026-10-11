/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends pj {
    static boolean field_A;
    static int[] field_y;
    de field_w;
    static String field_z;
    byte field_C;
    static vn[] field_x;
    int field_v;
    static af field_B;

    final byte[] d(int param0) {
        if (this.field_q) {
          throw new RuntimeException();
        }
        if (this.field_w.field_j < this.field_w.field_h.length - this.field_C) {
          throw new RuntimeException();
        }
        if (param0 != 0) {
          return (byte[]) null;
        }
        return this.field_w.field_h;
    }

    final static void a(String param0, int param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        try {
          pl.field_m = pl.field_m + 1;
          if (param1 != 0) {
            return;
          }
          if (ja.field_d == -1 &&
            -1 == ck.field_n) {
            ja.field_d = ha.field_b;
            ck.field_n = ei.field_K;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(da.field_m));
          } else {
            decompiledFrameRemainder0 = (da.field_m == null);
          }
          if (decompiledFrameRemainder0) {
            if (!qo.field_x) {
              if (td.field_d <= pl.field_m) {
                stackIn_19_0 = (td.field_d + vf.field_k > pl.field_m) ? 1 : 0;
              } else {
                stackIn_19_0 = 0;
              }
            } else {
              stackIn_19_0 = 0;
            }
            var2_int = stackIn_19_0;
            if (param0 == null) {
              pl.field_m = 0;
            } else {
              if (qo.field_x) {
                pl.field_m = td.field_d;
              } else {
                if (var2_int != 0) {
                  pl.field_m = td.field_d;
                } else {
                  pl.field_m = 0;
                }
              }
            }
            if (param0 == null) {
              if (var2_int != 0) {
                qo.field_x = true;
              }
            } else {
              qo.field_x = false;
            }
            mm.field_i = ck.field_n;
            lc.field_i = ja.field_d;
          }
          da.field_m = param0;
          if (!qo.field_x &&
            td.field_d > pl.field_m &&
            ll.field_a) {
            pl.field_m = 0;
            mm.field_i = ck.field_n;
            lc.field_i = ja.field_d;
          }
          ja.field_d = -1;
          if (qo.field_x &&
            pl.field_m == se.field_o) {
            pl.field_m = 0;
            qo.field_x = false;
          }
          ck.field_n = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("og.J(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_z = null;
        if (param0) {
          return;
        }
        field_y = null;
        field_x = null;
        field_B = null;
    }

    final static void b(int param0, int param1) {
        ba.field_s = param1;
        if (param0 >= -110) {
          og.b(53, -25);
        }
    }

    final int e(int param0) {
        if (this.field_w == null) {
          return 0;
        }
        if (param0 != -31478) {
          return 29;
        }
        return 100 * this.field_w.field_j / (-this.field_C + this.field_w.field_h.length);
    }

    final static void g(int param0) {
        int var2 = 0;
        u[] var1 = null;
        u var3 = null;
        int var4 = 0;
        u[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawn.field_J;
        try {
          var5 = ij.field_L;
          var1 = var5;
          for (var2 = param0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            var3.d(param0 ^ 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "og.H(" + param0 + ')');
        }
    }

    og() {
    }

    static {
        field_y = new int[8192];
        field_z = "Rank";
        field_B = new af();
    }
}
