/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr extends tm {
    static int[][] field_o;
    static String[] field_l;
    static int field_n;
    static dd[] field_m;

    final void a(di param0, byte param1) {
        eg dupTemp$1 = null;
        if (null != this.field_a) {
          return;
        }
        this.field_a = new eg[16];
        this.field_a[0] = eg.a(param0, "", "balls/TIKI/tiki_ball_white");
        eg dupTemp$0 = eg.a(param0, "", "balls/TIKI/tiki_ball_1");
        this.field_a[7] = dupTemp$0;
        this.field_a[6] = dupTemp$0;
        this.field_a[5] = dupTemp$0;
        this.field_a[4] = dupTemp$0;
        this.field_a[3] = dupTemp$0;
        this.field_a[2] = dupTemp$0;
        this.field_a[1] = dupTemp$0;
        if (param1 != 117) {
          return;
        }
        try {
          this.field_a[8] = eg.a(param0, "", "balls/TIKI/tiki_ball_black");
          dupTemp$1 = eg.a(param0, "", "balls/TIKI/tiki_ball_2");
          this.field_a[15] = dupTemp$1;
          this.field_a[14] = dupTemp$1;
          this.field_a[13] = dupTemp$1;
          this.field_a[12] = dupTemp$1;
          this.field_a[11] = dupTemp$1;
          this.field_a[10] = dupTemp$1;
          this.field_a[9] = dupTemp$1;
          this.field_a[0].a(8, 8, 8, 8);
          this.field_a[1].a(8, 8, 8, 8);
          this.field_a[8].a(8, 8, 8, 8);
          this.field_a[9].a(8, 8, 8, 8);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "jr.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int b(byte param0, int param1) {
        if (param0 >= -110) {
          jr.j(-76);
        }
        if (param1 != 0) {
          if (param1 == 1) {
            return 6697779;
          }
          return 16777215;
        }
        return 7824981;
    }

    final boolean c(int param0) {
        if (param0 != 2) {
          field_n = -44;
          return false;
        }
        return false;
    }

    final int a(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = Pool.field_O;
        if (!param1) {
          this.c(13);
        }
        var3 = param0;
        if (var3 == 0) {
          return 13421772;
        }
        if (1 != var3 &&
          var3 != 2 &&
          var3 != 3 &&
          4 != var3 &&
          var3 != 5 &&
          6 != var3 &&
          var3 != 7) {
          if (8 == var3) {
            return 3355443;
          }
          if (var3 != 9 &&
            10 != var3 &&
            var3 != 11 &&
            12 != var3 &&
            var3 != 13) {
            if (14 == var3) {
              return this.b((byte) -118, 1);
            }
            if (var3 != 15) {
              return 16711935;
            }
          }
          return this.b((byte) -118, 1);
        }
        return this.b((byte) -113, 0);
    }

    final static byte[] a(int param0, byte param1, byte[] param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        ld var5 = null;
        byte[] var6 = null;
        var7 = Pool.field_O;
        try {
          if (0 < param3) {
            var8 = new byte[param0];
            var4 = var8;
            for (var5_int = 0; var5_int < param0; var5_int++) {
              var8[var5_int] = param2[var5_int + param3];
            }
          } else {
            var4 = param2;
          }
          var5 = new ld();
          var5.a(false);
          var5.a(var4, 0, (long)(8 * param0));
          var6 = new byte[64];
          if (param1 >= -42) {
            jr.i(-82);
          }
          var5.a(var6, (byte) 105, 0);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("jr.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
          this.c(-109);
        }
        return 0 == param1 ? sn.field_j : dq.field_g;
    }

    final void a(int param0, di param1) {
        try {
          this.field_e = aj.a(param0 ^ param0, "", param1, "top_bar_balls_jungle");
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "jr.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(int param0) {
        field_m = null;
        field_l = null;
        field_o = (int[][]) null;
        if (param0 != 10860) {
          field_o = (int[][]) null;
        }
    }

    final static void j(int param0) {
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        im var1 = null;
        kh var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        im var1Lifetime1;
        var2 = Pool.field_O;
        try {
          var1 = (im) (ma.field_i.c((byte) -48));
          while (var1 != null) {
            if (var1.field_gc > 0) {
              var1.field_gc = var1.field_gc - 1;
              if (var1.field_gc == 0) {
                var1.field_hc = 0;
                if (var1.c(true)) {
                  var1.a((byte) -117);
                }
              }
            }
            var1 = (im) (ma.field_i.f((byte) -5));
          }
          var1_ref = (kh) (ep.field_A.c((byte) 123));
          while (var1_ref != null) {
            if (var1_ref.field_Mb > 0) {
              var1_ref.field_Mb = var1_ref.field_Mb - 1;
              if (var1_ref.field_Mb == 0) {
                var1_ref.field_Fc = 0;
                if (var1_ref.f(-14144)) {
                  var1_ref.a((byte) -117);
                }
              }
            }
            var1_ref = (kh) (ep.field_A.f((byte) -5));
          }
          if (param0 != -8) {
            return;
          }
          var1Lifetime1 = (im) (ck.field_W.c((byte) 65));
          while (var1Lifetime1 != null) {
            stackIn_24_0 = ~var1Lifetime1.field_gc;
            if (stackIn_24_0 < -1) {
              var1Lifetime1.field_gc = var1Lifetime1.field_gc - 1;
              if (0 != var1Lifetime1.field_gc) {
                var1Lifetime1 = (im) (ck.field_W.f((byte) -5));
                continue;
              }
              var1Lifetime1.field_hc = 0;
              if (var1Lifetime1.c(true)) {
                var1Lifetime1.a((byte) -117);
              }
            }
            var1Lifetime1 = (im) (ck.field_W.f((byte) -5));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref2), "jr.F(" + param0 + ')');
        }
    }

    final static dd[] a(int param0, byte param1, int param2) {
        if (param1 != 20) {
          return (dd[]) null;
        }
        return cq.a(1, 4578, param0, param2);
    }

    jr() {
    }

    static {
        field_l = new String[]{"Horrendous!", "Horrific!", "How disappointing..."};
        field_n = 0;
    }
}
