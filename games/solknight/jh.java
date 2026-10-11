/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    private ec[] field_d;
    private long field_e;
    private int field_a;
    static mg field_g;
    private ec field_c;
    static o field_b;
    static int field_f;

    final static void a(int param0) {
        int var1_int = 0;
        int var2_int = 0;
        boolean[] var2 = null;
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        try {
          wb.field_a = ad.field_b.b(te.field_I[12]);
          var1_int = ad.field_b.b(te.field_I[13]);
          if (!(var1_int <= wb.field_a)) {
            wb.field_a = var1_int;
          }
          fj.a(32, new int[]{0, 3, 12, 13, 4, 2, 14, 11}, 460, (byte) -127, 150, 0, 180);
          fj.a(32, new int[]{1, 12, 13, 3, 7}, 288, (byte) 95, 155, 1, 50);
          fj.a(37, new int[]{15, 5}, 440, (byte) 23, 0, 2, 200);
          fj.a(37, new int[]{15, 5}, 512, (byte) -128, 406, 3, 260);
          fj.a(37, new int[]{6}, 468, (byte) 1, 430, 4, 30);
          fj.a(37, new int[]{17}, 440, (byte) -128, 370, 5, 200);
          fj.a(37, new int[]{18}, 440, (byte) -127, 200, 6, 200);
          fj.a(37, new int[]{2, 5}, 498, (byte) -127, 400, 7, 260);
          fj.a(28, new int[]{15, 16}, 446, (byte) 98, 200, 8, 194);
          fj.a(28, new int[]{19, 5}, 288, (byte) -128, 400, 9, 50);
          for (var2_int = 0; gg.field_f.length > var2_int; var2_int++) {
            gg.field_f[var2_int] = false;
          }
          if (param0 != -1) {
            field_b = (o) null;
          }
          gg.field_f[1] = true;
          var2 = gg.field_f;
          var2[0] = true;
          var3 = ad.field_b.field_s + (ad.field_b.field_m + 4);
          ah.field_i[8] = ad.field_b.field_s + dd.field_b - (-ad.field_b.field_F - var3);
          si.field_F[8] = 37 + var3 * 2;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "jh.H(" + param0 + ')');
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        gb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new gb(param0);
          if (param1 != 6) {
            field_b = (o) null;
          }
          var3 = var9.j(param1 + 249);
          var4 = var9.e(true);
          if (var4 >= 0 && (0 == jb.field_f ||
            !(var4 > jb.field_f))) {
            if (var3 == 0) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.a(var4, 0, -123, var12);
              stackIn_9_0 = var5_ref_byte__;
              return stackIn_9_0;
            }
            var5 = var9.e(true);
            if (var5 >= 0 && (jb.field_f == 0 ||
              !(jb.field_f < var5))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (var3 != 1) {
                var7 = g.field_k;
                synchronized (var7) {
                  g.field_k.a((byte) 97, var9, var13);
                }
              } else {
                gi.a(var13, var5, param0, var4, 9);
              }
              stackIn_23_0 = var6;
              return stackIn_23_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("jh.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final ec a(byte param0) {
        ec var3 = null;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != -9) {
          return (ec) null;
        }
        if (this.field_c == null) {
          return null;
        }
        ec var2 = this.field_d[(int)(this.field_e & (long)(-1 + this.field_a))];
        while (this.field_c != var2) {
          if (this.field_c.field_l == this.field_e) {
            var3 = this.field_c;
            this.field_c = this.field_c.field_i;
            return var3;
          }
          this.field_c = this.field_c.field_i;
        }
        this.field_c = null;
        return null;
    }

    final static void a(int param0, int param1) {
        try {
          try {
            fd.a(-4476, ia.g(-115), "resizing", new Object[]{new Integer(param0)});
          } catch (Throwable throwable) {
          }
          if (param1 <= 44) {
            field_g = (mg) null;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ec a(long param0, boolean param1) {
        ec var4;
        ec var5;
        int var6;
        ec var4Lifetime1;
        ec var5Lifetime1;
        var6 = SolKnight.field_L ? 1 : 0;
        this.field_e = param0;
        if (param1) {
          var4 = this.field_d[(int)(param0 & (long)(-1 + this.field_a))];
          this.field_c = var4.field_i;
          while (true) {
            if (var4 == this.field_c) {
              this.field_c = null;
              return null;
            }
            if (this.field_c.field_l != param0) {
              this.field_c = this.field_c.field_i;
              continue;
            }
            break;
          }
          var5 = this.field_c;
          this.field_c = this.field_c.field_i;
          return var5;
        }
        jh.a(-76, -128);
        var4Lifetime1 = this.field_d[(int)(param0 & (long)(-1 + this.field_a))];
        this.field_c = var4Lifetime1.field_i;
        while (true) {
          if (var4Lifetime1 == this.field_c) {
            this.field_c = null;
            return null;
          }
          if (this.field_c.field_l != param0) {
            this.field_c = this.field_c.field_i;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_c;
        this.field_c = this.field_c.field_i;
        return var5Lifetime1;
    }

    final void a(long param0, byte param1, ec param2) {
        ec var5 = null;
        ec var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param2.field_k != null) {
            param2.a(97);
          }
          var5 = this.field_d[(int)(param0 & (long)(-1 + this.field_a))];
          param2.field_k = var5.field_k;
          param2.field_i = var5;
          param2.field_k.field_i = param2;
          param2.field_l = param0;
          param2.field_i.field_k = param2;
          if (param1 != -109) {
            var6 = (ec) null;
            this.a(-128L, (byte) -79, (ec) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("jh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = ee.field_j;
        synchronized (var1) {
          wb.field_c = u.field_d;
          if (param0 != 406) {
            field_g = (mg) null;
          }
          cf.field_e = cf.field_e + 1;
          gb.field_j = le.field_f;
          ad.field_m = c.field_J;
          ne.field_d = pe.field_n;
          pe.field_n = false;
          hg.field_F = SolKnight.field_G;
          db.field_o = ug.field_a;
          s.field_gb = wd.field_d;
          SolKnight.field_G = 0;
        }
    }

    public static void c(int param0) {
        field_b = null;
        field_g = null;
        int var1 = -126 / ((-14 - param0) / 43);
    }

    jh(int param0) {
        int var2 = 0;
        ec dupTemp$0 = null;
        ec var3 = null;
        this.field_d = new ec[param0];
        this.field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new ec();
          var3 = dupTemp$0;
          this.field_d[var2] = dupTemp$0;
          var3.field_i = var3;
          var3.field_k = var3;
        }
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        var3 = ad.field_h;
        if (param0 != 126) {
          return;
        }
        if (var3 < 5) {
          var2 = var3 * var3 * 8192 / 1100;
          var4 = 1;
          var5 = 0;
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 4) {
            var4 = 1;
            var5 = 1;
          }
          if (param1 == 5) {
            var5 = 1;
            var4 = -1;
          }
          if (param1 == 6) {
            var5 = -1;
            var4 = 1;
          }
          if (param1 == 7 ||
            param1 == 8) {
            var5 = -1;
            var4 = -1;
          }
          if (11 == param1) {
            var4 = -1;
          }
          if (12 == param1) {
            var4 = -1;
            var5 = -1;
          }
          if (param1 == 13) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 14) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 == 15) {
            var4 = 1;
            var5 = 1;
          }
          qf.field_e = pk.a(var2 * var4, false, var5 * var2);
          return;
        }
        if (var3 < 105) {
          var2 = (-40960 + var3 * 16384) / 220;
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (param1 == 1) {
            var5Lifetime1 = 1;
          }
          if (param1 == 3) {
            var4Lifetime1 = -1;
          }
          if (param1 == 4) {
            var4Lifetime1 = 1;
            var5Lifetime1 = 1;
          }
          if (param1 == 5) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (param1 == 6) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (param1 == 7 ||
            param1 == 8) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          }
        } else {
          if (var3 < 120) {
            var3 = 120 - var3;
            var2 = -(8192 * (var3 * var3) / 3300) + 8192;
          }
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (param1 == 1) {
            var5Lifetime1 = 1;
          }
          if (param1 == 3) {
            var4Lifetime1 = -1;
          }
          if (param1 == 4) {
            var4Lifetime1 = 1;
            var5Lifetime1 = 1;
          }
          if (param1 == 5) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (param1 == 6) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (param1 == 7) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          } else {
            if (param1 == 8) {
              var5Lifetime1 = -1;
              var4Lifetime1 = -1;
            }
          }
        }
        if (11 == param1) {
          var4Lifetime1 = -1;
        }
        if (12 == param1) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        }
        if (param1 == 13) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param1 == 14) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param1 == 15) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        qf.field_e = pk.a(var2 * var4Lifetime1, false, var5Lifetime1 * var2);
    }

    static {
    }
}
