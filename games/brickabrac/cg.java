/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends dj {
    private int field_o;
    static boolean field_l;
    static RgbSprite field_q;
    static ff field_s;
    static PcmSound[] field_p;
    private long field_m;
    private long field_r;
    private int field_j;
    static long field_i;
    private long field_k;
    private long[] field_n;

    final int a(int param0, long param1) {
        int var4;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 15) {
          return -72;
        }
        if (this.field_m > this.field_r) {
          this.field_k = this.field_k + (this.field_m - this.field_r);
          this.field_r = this.field_r + (-this.field_r + this.field_m);
          this.field_m = this.field_m + param1;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.field_m = this.field_m + param1;
        } while (var4 < 10 &&
          this.field_r > this.field_m);
        if (this.field_m < this.field_r) {
          this.field_m = this.field_r;
        }
        return var4;
    }

    final static void b(int param0) {
        IsaacGenerator.field_i = Rasterizer2D.height;
        kp.field_a = Rasterizer2D.width;
        Brick.e(-67);
        ap.field_b.a(fe.field_gb.field_Ib, 0, 80, 0, fe.field_gb.field_cb - 40 - 2);
        dn.field_N.a(np.field_a, 0, 0, RectangleBody.field_q.field_Ib, (byte) 64);
        if (param0 <= 16) {
          field_l = true;
        }
        int var1 = np.field_a + 2;
        Ball.field_A.a(-(!vd.field_e ? 0 : var1) + RectangleBody.field_q.field_cb, !vd.field_e ? 0 : var1, 0, RectangleBody.field_q.field_Ib, (byte) 64);
        s.b(124);
        HighscorePackSelector.field_k.a(40, fe.field_gb.field_cb - 40, 0, fe.field_gb.field_Ib, (byte) 64);
        sc.field_b.a(30, 0, 0, rm.field_a.field_Ib, (byte) 64);
        ll.field_e.a(-72 + rm.field_a.field_cb, 30, 0, rm.field_a.field_Ib, (byte) 64);
        nk.field_g.a(30, 5, 5, 68, (byte) 64);
        nk.field_a.a(30, 5, 75, 78, (byte) 64);
        kk.field_b.a(30, 5, 155, 48, (byte) 64);
        la.field_b.a(30, 5, 205, 48, (byte) 64);
        int var2 = vd.field_e ? 250 : 200;
        wh.field_h.a(30, 5, 5 + var2, -var2 + 363, (byte) 64);
        dp.field_x.a(30, 5, 370, rm.field_a.field_Ib - 10 - 365, (byte) 64);
        rl.field_e.a(2, (byte) -128, -5 + (ll.field_e.field_Ib - 5), 5, 37, ec.field_J, -5 + (-5 + ll.field_e.field_cb - 32));
        int var3 = (rm.field_a.field_Ib + 2) / 2;
        gj.field_b.a(40, -40 + rm.field_a.field_cb, 0, var3 - 2, (byte) 64);
        if (!vd.field_e) {
          var3 = 0;
        }
        td.field_v.a(40, rm.field_a.field_cb - 40, var3, -var3 + rm.field_a.field_Ib, (byte) 64);
    }

    final static int a(int param0, byte[] param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -86) {
            field_i = -76L;
          }
          stackIn_3_0 = ba.a(param1, 9, 0, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (this.field_m > this.field_r) {
          this.field_r = this.field_r + (-this.field_r + this.field_m);
        }
        if (param0 != 1) {
          NodeDeque var3 = (NodeDeque) null;
          cg.attachBrickMotionPaths((NodeDeque[]) null, (byte) 16, (NodeDeque) null, true);
        }
        this.field_k = 0L;
    }

    final long d(byte param0) {
        int var2 = 116 / ((param0 + 1) / 38);
        this.field_r = this.field_r + this.e((byte) -64);
        if (this.field_r < this.field_m) {
          return (-this.field_r + this.field_m) / 1000000L;
        }
        return 0L;
    }

    private final long e(byte param0) {
        int var8 = 0;
        int var9 = BrickABrac.field_J ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -this.field_k + var2;
        this.field_k = var2;
        if (var4 > -5000000000L &&
          var4 < 5000000000L) {
          this.field_n[this.field_o] = var4;
          if (this.field_j < 1) {
            this.field_j = this.field_j + 1;
          }
          this.field_o = (1 + this.field_o) % 10;
        }
        if (param0 >= -19) {
          field_q = (RgbSprite) null;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_j; var8++) {
          var6 = var6 + this.field_n[(10 + this.field_o - var8) % 10];
        }
        return var6 / (long)this.field_j;
    }

    final static void attachBrickMotionPaths(NodeDeque[] brickGroups, byte obfuscationGuard, NodeDeque motionPaths, boolean includeVelocity) {
        int incrementValue$1 = 0;
        int var4_int = 0;
        BrickMotionPath[] var5 = null;
        int var6 = 0;
        BrickMotionPath var7 = null;
        Brick var8 = null;
        int var9 = 0;
        NodeDeque var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = motionPaths.size(obfuscationGuard ^ 88);
          var5 = new BrickMotionPath[var4_int];
          var6 = 0;
          var7 = (BrickMotionPath) (motionPaths.first(-79));
          while (var7 != null) {
            incrementValue$1 = var6;
            var6++;
            var5[incrementValue$1] = var7;
            var7 = (BrickMotionPath) (motionPaths.next((byte) 116));
          }
          var6Lifetime1 = 0;
          if (obfuscationGuard != 35) {
            return;
          }
          while (var6Lifetime1 < brickGroups.length) {
            var10 = brickGroups[var6Lifetime1];
            var8 = (Brick) (var10.first(obfuscationGuard - 159));
            while (var8 != null) {
              if ((var8.flags & 4) != 0) {
                var8.setMotionPath(var5[var8.motionPathIndex], includeVelocity, 4);
              }
              var8 = (Brick) (var10.next((byte) 116));
            }
            var6Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("cg.M(");
          if (brickGroups == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(',');
          if (motionPaths == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(includeVelocity).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 > -89) {
          field_q = (RgbSprite) null;
        }
        field_s = null;
        field_q = null;
        field_p = null;
    }

    cg() {
        this.field_o = 0;
        this.field_r = 0L;
        this.field_m = 0L;
        this.field_k = 0L;
        this.field_n = new long[10];
        this.field_j = 1;
        this.field_r = System.nanoTime();
        this.field_m = System.nanoTime();
    }

    static {
        field_s = null;
        field_p = new PcmSound[4];
    }
}
