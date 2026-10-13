/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends km {
    private static int[] field_x;
    static long field_E;
    private NodeDeque field_z;
    private NodeDeque[] field_F;
    static int field_v;
    static int field_w;
    static String field_t;
    private IntNode field_r;
    private ga field_s;
    private int field_B;
    private int field_H;
    private int field_G;
    private uj field_y;
    private LevelPack field_A;
    private String field_C;
    private int field_D;
    private int field_u;
    private int field_I;

    final void a(int param0, int param1, char param2) {
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -120) {
          this.field_H = -61;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_h.field_j >= 0) {
          if (this.field_h.field_j == 3) {
            if (param1 != 97 &&
              param1 != 96) {
              if (param1 == 98) {
                this.field_h.a(false, 1);
                this.field_y.b((byte) -100);
              } else {
                if ((99 == param1)) {
                  this.field_h.a(false, 1);
                  this.field_y.a((byte) -95);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (5 == this.field_m.length) {
                this.field_h.a(false, 4);
              }
            }
          } else {
            if (4 != this.field_h.field_j) {
              if (1 == this.field_h.field_j &&
                this.field_y.a(-28088, param1, (int) param2)) {
                this.field_h.a(false, 3);
              }
            } else {
              if (param1 != 97 &&
                param1 != 96) {
                if (98 == param1) {
                  this.field_h.a(false, 1);
                  this.field_y.b((byte) -63);
                } else {
                  if ((param1 == 99)) {
                    this.field_h.a(false, 1);
                    this.field_y.a((byte) -114);
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_h.a(false, 3);
              }
            }
          }
        } else {
          this.field_h.a(false, 3);
        }

    }

    final void drawScreen(byte obfuscationGuard) {
        int stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_17_4;
        int stackIn_18_5;
        int var2;
        int var3;
        RgbSprite var4;
        int var5;
        int var6;
        super.drawScreen((byte) -101);
        al.a(13, 19);
        im.a(550, 5, 33, 5, 140, (byte) -106, 45);
        im.a(160, 5, 243, 5, 178, (byte) -88, 45);
        im.a(385, 5, 243, 5, 178, (byte) -124, 210);
        nn.field_g.b(qn.field_u[this.field_A.packId], 320, 1 + (178 - nn.field_g.field_L), 0, -1);
        da.field_E[this.field_A.packId].e(565, 140, -2048, 4096);
        if (this.field_y.field_q >= 0 &&
          this.field_y.field_q < this.field_A.levelCount) {
          var2 = nn.field_g.field_B + 2;
          var3 = this.field_y.field_q;
          if (var3 != this.field_H) {
            this.c(-6845, var3);
            this.field_H = var3;
          }
          if (qg.field_t ||
            !(this.field_H >= 3 + hh.field_b[this.field_A.packId])) {
            this.a(178, 243 - 2 * var2, 210, 385, (byte) 85);
          }
          if (qg.field_t ||
            !(hh.field_b[this.field_A.packId] < this.field_H)) {
            nn.field_g.b(this.field_A.metadata[this.field_H].title, 402, 421 - var2, 0, -1);
          }
          if (!qg.field_t &&
            !(this.field_H <= hh.field_b[this.field_A.packId])) {
            if (this.field_H < 3 + hh.field_b[this.field_A.packId]) {
              stackIn_17_0 = 210;
              stackIn_17_1 = 178;
              stackIn_17_2 = 385;
              stackIn_17_3 = 233;
              stackIn_17_4 = 0;
              if (1 != -hh.field_b[0] + var3) {
                stackIn_18_5 = 190;
              } else {
                stackIn_18_5 = 128;
              }
              Rasterizer2D.fillRectangleAlpha(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_18_5);
            }
            var4 = vq.field_F;
            var5 = 210 + (385 - var4.canvasWidth) / 2;
            var6 = (243 - var4.canvasHeight) / 2 + 178;
            var4.b(var5, var6, 196);
          }
        } else {
          nn.field_g.b(this.field_C, 402, 299 + nn.field_g.field_P, 0, -1);
          this.field_H = -1;
        }
        this.field_y.c((byte) 28);
        this.a(0);
        if (obfuscationGuard >= -14) {
          this.field_D = -125;
        }
    }

    static int d(int param0, int param1) {
        return param0 | param1;
    }

    ud(int param0, int param1) {
        this(param0, ui.field_a, param1);
    }

    final void a(boolean param0, int param1, int param2) {
        super.a(param0, 1, 104);
        this.field_y.b(0);
        if (!param0) {
          this.field_y.a((byte) -90);
        }
        this.field_H = -1;
        if (param2 < 96) {
          this.d(37);
        }
    }

    final String e(byte param0) {
        if (param0 <= 53) {
          return (String) null;
        }
        return ag.field_D[pg.c(61) ? 7 : 39];
    }

    private final void c(int param0, int param1) {
        int var3;
        Brick var4;
        int var5;
        int var3Lifetime1;
        var5 = BrickABrac.field_J ? 1 : 0;
        for (var3 = 0; this.field_F.length > var3; var3++) {
          if (this.field_F[var3] != null) {
            this.field_F[var3].clear((byte) -80);
          } else {
            this.field_F[var3] = new NodeDeque();
          }
        }
        this.field_z.clear((byte) -78);
        td.decodeLevelBytes(this.field_F, this.field_A.levelData[param1], this.field_r, this.field_z, this.field_s, 10792131);
        cg.a(this.field_F, (byte) 35, this.field_z, false);
        this.field_I = 122880;
        this.field_u = 163840;
        this.field_D = 0;
        if (param0 != -6845) {
          this.a(false);
        }
        this.field_B = 0;
        for (var3Lifetime1 = 0; this.field_F.length > var3Lifetime1; var3Lifetime1++) {
          var4 = (Brick) (this.field_F[var3Lifetime1].first(param0 + 6735));
          while (var4 != null) {
            if ((1 & var4.flags) == 0) {
              if (this.field_D < var4.x256 + var4.width256) {
                this.field_D = var4.x256 + var4.width256;
              }
              if (this.field_I > var4.y256) {
                this.field_I = var4.y256;
              }
              if (var4.y256 + var4.height256 > this.field_B) {
                this.field_B = var4.height256 + var4.y256;
              }
              if (var4.x256 < this.field_u) {
                this.field_u = var4.x256;
              }
            }
            var4 = (Brick) (this.field_F[var3Lifetime1].next((byte) 116));
          }
        }
    }

    final static boolean a(long param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        mp var5 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -82 / ((-47 - param2) / 37);
          var5 = pf.a(false, param1);
          if (var5 != null &&
            var5.field_Ub != null) {
            return true;
          }
          stackIn_9_0 = (o.field_e != null) && (null != ac.a(param0, 2));
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ud.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean handleKey(char character, int keyCode, int obfuscationGuard) {
        if (keyCode <= 98) {
          this.a(true);
        }
        if (obfuscationGuard != 48) {
          return super.handleKey(character, 100, obfuscationGuard);
        }
        if (cf.a((byte) 62)) {
          qg.field_t = true;
          return true;
        }
        return true;
    }

    final static tp c(boolean param0) {
        if (param0) {
          return (tp) null;
        }
        tp var1 = new tp(cf.field_d, ek.field_db, ag.field_K[0], dl.field_d[0], jh.field_b[0], gg.field_t[0], cn.field_a[0], qp.field_c);
        MotionWaypoint.d((byte) 96);
        return var1;
    }

    final int b(int param0, int param1) {
        if (param1 != 1) {
          return -75;
        }
        return this.field_p + 32;
    }

    final static String d(boolean param0) {
        if (jm.field_f == ik.field_g) {
          return td.field_w;
        }
        if (ka.field_l == jm.field_f) {
          return om.field_pc;
        }
        if (!param0) {
          e var2 = (e) null;
          ud.a(67, (e) null, (byte) 80);
        }
        if (!ma.field_I.b(96)) {
          return om.field_pc;
        }
        return GameScreen.field_d;
    }

    private ud(int param0, int[] param1, int param2) {
        super(param0, 180, 460, 402, 35, param1);
        int var4_int = 0;
        int var5 = 0;
        this.field_F = new NodeDeque[3];
        this.field_z = new NodeDeque();
        this.field_r = new IntNode();
        this.field_s = new ga();
        this.field_G = 0;
        try {
          this.field_C = oj.field_s.toLowerCase();
          this.field_A = na.field_L[param2];
          for (var4_int = 0; this.field_A.levelCount > var4_int; var4_int++) {
            var5 = nn.field_g.c(this.field_A.metadata[var4_int].numberLabel);
            if (var5 > this.field_G) {
              this.field_G = var5;
            }
          }
          this.b(true);
          this.field_y = new uj(20, 0, 1, (km) (this), this.field_m[1], this.field_A);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ud.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int var5;
        int var6;
        int var7;
        q var8;
        var7 = BrickABrac.field_J ? 1 : 0;
        var8 = this.field_m[param0];
        if (param2 != 123) {
          this.handleKey('ﾉ', -55, 73);
        }
        var5 = var8.field_f;
        var6 = var5;
        if (var6 == 31) {
          if (this.field_h.a((byte) 113) &&
            0 <= this.field_y.field_q) {
            if (!qg.field_t &&
              hh.field_b[this.field_A.packId] < this.field_y.field_q) {
              return false;
            }
            if (this.field_y.field_q < this.field_A.levelCount) {
              cq.a(16727, param1, this.field_y.field_q, new LevelSequence(this.field_A));
            }
          }
        } else {
          if (var6 == 29) {
            if (param1 &&
              this.field_h.c((byte) 108)) {
              this.field_y.a(-this.field_y.field_h, true);
            }
          } else {
            if (var6 != 30) {
              return super.a(param0, param1, (byte) 123);
            }
            if (param1 &&
              this.field_h.c((byte) -13)) {
              this.field_y.a(this.field_y.field_h, true);
            }
          }
        }
        return false;
    }

    final static void a(int param0, e param1, byte param2) {
        BitPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = k.field_h;
          var6.writeCipheredOpcode(-13413, param0);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(116, 1);
          var6.writeByte(-116, param1.field_o);
          var6.writeByte(-103, param1.field_i);
          var6.writeInt(param1.field_k, (byte) -79);
          var6.writeInt(param1.field_n, (byte) -79);
          var6.writeInt(param1.field_m, (byte) -79);
          var6.writeInt(param1.field_p, (byte) -79);
          int var5 = -68 / ((param2 + 15) / 63);
          var6.appendCrc32(3, var4);
          var6.backfillByteLength((byte) 117, var6.position - var4);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ud.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(byte param0) {
        field_t = null;
        field_x = null;
        int var1 = 2 % ((-51 - param0) / 58);
    }

    final void d(int param0) {
        if (param0 > -60) {
          field_t = (String) null;
        }
        this.a(bm.field_f, 0);
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var8 = 0;
        Brick var9 = null;
        int var10 = BrickABrac.field_J ? 1 : 0;
        if (param4 != 85) {
          this.field_s = (ga) null;
        }
        int var6 = this.field_D - this.field_u >> 9;
        param2 = param2 + (-var6 + param3) / 2;
        int var7 = -this.field_I + this.field_B >> 9;
        param0 = param0 + (param1 - var7) / 2;
        for (var8 = 0; var8 < this.field_F.length; var8++) {
          var9 = (Brick) (this.field_F[var8].first(-109));
          while (var9 != null) {
            if ((1 & var9.flags) == 0) {
              pa.field_m[var9.typeId].a((var9.x256 - this.field_u >> 9) + param2, (var9.y256 - this.field_I >> 9) + param0, 17, 8);
            }
            var9 = (Brick) (this.field_F[var8].next((byte) 116));
          }
        }
    }

    final void b(boolean param0) {
        int dupTemp$0 = 0;
        int var7 = 0;
        String stackIn_9_0 = null;
        q var3;
        q var4;
        int var5;
        int var6;
        q var7_ref_q;
        String var8;
        int var9;
        q var10;
        q var11;
        String var12;
        q var13;
        int var6Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        if (null == this.field_A) {
          return;
        }
        if (!param0) {
          field_w = 119;
        }
        var10 = this.field_m[0];
        var11 = var10;
        var11.field_c = (-this.field_G + 140) / 2 + 55;
        var11.field_d = 22;
        var11.field_a = 188;
        var10.field_j = this.field_G;
        var3 = this.field_m[2];
        var3.field_j = var11.field_j;
        var3.field_a = 389;
        var3.field_c = var11.field_c;
        var3.field_d = var10.field_d;
        var4 = this.field_m[1];
        var4.field_a = 217;
        var4.field_d = 165;
        var4.field_j = 140;
        var4.field_c = 55;
        var5 = 0;
        for (var6 = 3; var6 < this.field_m.length; var6++) {
          var7_ref_q = this.field_m[var6];
          if (var7_ref_q.field_f != 8) {
            stackIn_9_0 = ag.field_D[var7_ref_q.field_f];
          } else {
            stackIn_9_0 = this.e((byte) 74);
          }
          var12 = stackIn_9_0;
          var8 = var12;
          dupTemp$0 = 30 + nn.field_g.c(var12);
          var7_ref_q.field_j = dupTemp$0;
          var5 = var5 + dupTemp$0;
          if (var6 > 3) {
            var5 += 10;
          }
        }
        var6Lifetime1 = (640 - var5) / 2;
        for (var7 = 3; var7 < this.field_m.length; var7++) {
          var13 = this.field_m[var7];
          var13.field_c = var6Lifetime1;
          var13.field_a = this.b(var7, 1);
          var13.field_d = this.b((byte) 126, var7);
          var6Lifetime1 = var6Lifetime1 + (var13.field_j + 10);
        }
        return;
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        super.advanceScreen(updateFlag, inputEnabled, -113);
        this.field_y.b(false);
        if (obfuscationGuard >= -52) {
          field_v = -8;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          this.field_s = (ga) null;
        }
        return !pg.c(73) ? 16 : 0;
    }

    static {
        int var0 = 0;
        field_x = new int[256];
        field_t = "Player";
        for (var0 = 0; var0 < 256; var0++) {
          field_x[var0] = var0;
        }
    }
}
