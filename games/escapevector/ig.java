/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    private int field_a;
    static String field_c;
    private GameplaySession field_r;
    static tk field_g;
    private Sprite field_k;
    private dk[] field_q;
    private boolean field_o;
    private int field_e;
    static AudioOutput field_l;
    int field_h;
    private dk[] field_j;
    private int field_f;
    int field_s;
    private qe[] field_d;
    static String field_i;
    private int field_n;
    int field_p;
    private dk[] field_b;
    private int field_m;

    private final String a(int param0, int param1, String param2, boolean param3) {
        String stackIn_14_2 = null;
        try {
          if (param3) {
            this.j(-97);
          }
          int var5_int = ua.field_c.b(this.field_a, 0);
          if (var5_int == 0) {
            boolean stackIn_6_0 = !(param0 > param1);
            boolean var6 = stackIn_6_0;
            if (!var6) {
              param2 = jm.field_M;
            }
          }
          String stackIn_10_0 = (String) (param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ig.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, ik param2) {
        int var7 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var8 = om.field_c;
          CipherPacketBuffer var9 = var8;
          var9.writeCipheredOpcode(param1, true);
          var9.position = var9.position + 1;
          int var4 = var9.position;
          var9.f(1, -123);
          var9.h(-113, param2.field_i);
          var9.h(-107, param2.field_j);
          var9.h(110, param2.field_k);
          var9.a((byte) 124, param2.field_o);
          var9.a((byte) 123, param2.field_m);
          var9.a((byte) 127, param2.field_n);
          var9.a((byte) 127, param2.field_g);
          var9.f(param2.field_q.length, -123);
          int var5 = -65 / ((87 - param0) / 35);
          for (int var6 = 0; param2.field_q.length > var6; var6++) {
            var8.a((byte) 123, param2.field_q[var6]);
          }
          var9.c(var4, -39);
          var9.e(-56, -var4 + var9.position);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ig.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, ih param3) {
        String[] var9 = null;
        int[] var10 = null;
        int[] var5 = null;
        try {
          int var6 = 0;
          int var7 = 442;
          int var8 = 640;
          if (param0 != -12) {
            this.b((byte) 44);
          }
          if (aj.b(-117)) {
            var9 = new String[]{IntrusiveDeque.field_e, bb.field_O};
            var10 = new int[]{1, 2};
            var5 = new int[]{this.field_n, this.field_e};
          } else {
            var5 = new int[]{this.field_e};
            var9 = new String[]{bb.field_O};
            var10 = new int[]{1};
          }
          int var11 = var9.length;
          int[] var16 = TextLayoutLine.a(param2, param1, var11, (byte) -17);
          this.field_q = DynamicTerrainRenderer.a(var8, var5, var7, var6, param3, var9, var10, false, var16);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ig.S(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void g(int param0) {
        if (this.field_r == null) {
          return;
        }
        Minimap var2 = this.field_r.minimap;
        if (var2 != null) {
          var2.field_c = var2.field_c + 1;
        }
        if (param0 != -98) {
          dk var3 = (dk) null;
          this.a((PcmSample) null, 19, (dk) null, 55, 2);
        }
        if (this.field_m == this.field_r.levelIndex) {
          return;
        }
        this.field_o = true;
    }

    private final void a(int param0, int param1, ih param2, int param3) {
        String stackIn_6_2 = null;
        try {
          int[] var13 = new int[]{this.field_f, this.field_s};
          String[] var6 = new String[]{eo.field_b, be.field_a};
          int[] var7 = new int[]{2, 3};
          int var8 = 3;
          int var9 = 89;
          int var10 = 402;
          int var11 = var6.length;
          int[] var17 = TextLayoutLine.a(param3, param0, var11, (byte) -17);
          this.field_b = DynamicTerrainRenderer.a(var10, var13, var9, var8, param2, var6, var7, false, var17);
          if (param1 != -9079) {
            this.field_b = (dk[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var5;
          StringBuilder stackIn_5_1 = new StringBuilder().append("ig.FA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(PcmSample param0, int param1, dk param2, int param3, int param4) {
        try {
          int var6_int = param2.field_p / param1 + param2.field_l;
          int var7 = var6_int * 16384 / 640;
          ObjectSpriteSet.field_e.playSampleWithPan(param0, param4, param3, var7);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ig.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean a(boolean param0, int param1) {
        if (param1 > -50) {
          this.field_b = (dk[]) null;
        }
        this.c(6620);
        if (!di.field_d.b((byte) -18)) {
          return false;
        }
        int var3 = di.field_d.field_h;
        int var4 = je.a(false, this.field_a);
        if (var3 >= 0 &&
          var4 > var3) {
          int var5 = ua.field_c.b(this.field_a, 0);
          if (var5 == 0) {
            int var6 = ua.field_c.a(29386, this.field_a);
            if (!this.a(var6, var3, true)) {
              return false;
            }
          }
          pl.field_q = null;
          IntValueNode.field_i = null;
          SelfDestructEffects.field_q = -1;
          int var6Lifetime1 = var3;
          IntValueNode.startSelectedLevel(this.field_a, var6Lifetime1, 89);
          return true;
        }
        if (this.field_s == var3) {
          IntValueNode.field_i = null;
          pl.field_q = null;
          SelfDestructEffects.field_q = -1;
          IntValueNode.startSelectedLevel(this.field_a, -1, 101);
          return true;
        }
        if (var3 == this.field_n &&
          aj.b(-107)) {
          pa.a(true);
          mj.field_d = 0;
          gi.a((byte) -90);
          return true;
        }
        if (var3 == this.field_e) {
          SelfDestructEffects.field_q = -1;
          GameplaySession.c(param0, 2560);
          return true;
        }
        if (this.field_f != var3) {
          return false;
        }
        LevelObject.a(this.field_a, (byte) -128);
        mj.field_d = 0;
        LaserGateSpan.field_k = 0;
        GameplaySession.c((byte) 30);
        return true;
    }

    private final void a(dk[] param0, int param1) {
        String stackIn_14_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var3_int = -122 / ((param1 + 21) / 52);
          if (param0 == null) {
            return;
          }
          int var4 = di.field_d.field_h;
          dk[] var5 = param0;
          for (int var6 = 0; var5.length > var6; var6++) {
            dk var7 = var5[var6];
            int var8 = var7.field_c;
            boolean stackIn_9_0 = !(var8 != var4);
            boolean var9 = stackIn_9_0;
            var7.a(-16383, (var9));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ig.AA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(byte param0) {
        wc var2 = di.field_d;
        if (var2 == null) {
          return;
        }
        int var3 = var2.field_h;
        if (param0 != 86) {
          this.c((byte) 3);
        }
        int var4 = je.a(false, this.field_a);
        if (var3 < 0) {
          return;
        }
        if (var4 <= var3) {
          return;
        }
        this.field_m = var3;
    }

    private final Sprite a(byte param0, boolean param1) {
        if (param0 >= -16) {
          this.a((byte) 50);
        }
        int var3 = ua.field_c.b(this.field_a, 0);
        if (var3 == 0) {
          return null;
        }
        if (var3 != 1) {
          return null;
        }
        if (vd.field_f == null) {
          return null;
        }
        if (param1) {
          return vd.field_f[1];
        }
        return vd.field_f[0];
    }

    private final void a(int param0) {
        if (this.field_r == null) {
          return;
        }
        if (param0 != 1) {
          this.field_k = (Sprite) null;
        }
        if (this.field_o) {
          this.field_o = false;
          this.field_r.selectLevel(this.field_m, 110);
          this.a(true);
          SpriteOffset.a((byte) 82);
        }
    }

    private final void d(int param0) {
        this.a(param0 + 1);
        if (null == this.field_r) {
          return;
        }
        Minimap var17 = this.field_r.minimap;
        if (var17 == null) {
          return;
        }
        int var3 = 640;
        int var4 = 480;
        int var5 = 3;
        int var6 = 79;
        int var7 = 402;
        int var8 = 349;
        int var9 = this.field_r.tilesWide * var17.pixelsPerTile;
        int var10 = this.field_r.tilesHigh * var17.pixelsPerTile;
        int var11 = (-var9 + var3) / 2;
        int var12 = (-var10 + var4) / 2;
        int var13 = (var7 - var9) / 2;
        int var14 = (var8 - var10) / 2;
        int var15 = -var11 + (var5 + var13);
        int var16 = -var12 + var14 + var6;
        var17.b(var16, false, var15, param0);
    }

    private final void i(int param0) {
        boolean var2 = (this.field_a == 3);
        int var3 = je.a(false, this.field_a);
        this.field_p = var3;
        if (!var2) {
          int fieldTemp$0 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_s = fieldTemp$0;
        }
        if (!var2) {
          int fieldTemp$1 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_f = fieldTemp$1;
        }
        if (aj.b(-118)) {
          int fieldTemp$2 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n = fieldTemp$2;
        }
        if (param0 != -30234) {
          dk[] var4 = (dk[]) null;
          this.a((dk[]) null, 116);
        }
        int fieldTemp$3 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_e = fieldTemp$3;
    }

    private final void a(byte param0) {
        int var22 = EscapeVector.obfuscationControl;
        int var2 = 12;
        int var3 = 12;
        dk var23 = this.field_j[0];
        dk var19 = var23;
        var19 = var23;
        int var5 = -var2 + var23.field_f;
        int var6 = var23.field_f + var23.field_p + (var2 - 1);
        int var7 = -var3 + var23.field_l;
        dk var24 = this.field_j[-1 + this.field_j.length];
        int var8 = var3 + var24.field_i + var24.field_l;
        int var9 = 1;
        int var10 = 50;
        int var11 = mj.field_d;
        int var12 = var11 >= var10 ? 0 : -var11 + var10;
        int var13 = 3170352;
        int var14 = 6340704;
        int var15 = -32 / ((12 - param0) / 63);
        fc.a(var12, var5, var6, var8, true, 29788, false, var14, var13, var9, var7, true);
        int var16 = di.field_d.field_h;
        dk[] var17 = this.field_j;
        for (int var18 = 0; var17.length > var18; var18++) {
          var19 = var17[var18];
          int var20 = var19.field_c;
          if (var20 < 0) {
            var20 = this.field_s;
          }
          boolean var21 = (var16 == var20);
          var19.a(-16383, (var21));
        }
    }

    private final int a(byte param0, int param1, dk[] param2, int param3) {
        dk var7 = null;
        String stackIn_14_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          dk[] var9 = param2;
          dk[] var5 = var9;
          if (param0 != -43) {
            this.a(42, 56, -95);
          }
          int var6 = 0;
          while (true) {
            if (var9.length <= var6) {
              int stackIn_10_0 = -1;
              return stackIn_10_0;
            }
            var7 = var9[var6];
            if (!var7.a((byte) 65, param1, param3)) {
              var6++;
              continue;
            }
            break;
          }
          int stackIn_7_0 = var7.field_c;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ig.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
          return true;
        }
        int var4 = ua.field_c.b(this.field_a, 0);
        if (var4 == 0) {
          return param1 <= param0 ? true : false;
        }
        if (var4 != 1) {
          return false;
        }
        int var5 = ua.field_c.a(true, this.field_a, param1);
        return nl.a((byte) 121, var5);
    }

    private final void a(int param0, int param1, int param2, dk[] param3) {
        String stackIn_14_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          if (param3 == null) {
            return;
          }
          if (param1 != 9355) {
            return;
          }
          int var5_int = mj.field_d;
          dk[] var6 = param3;
          for (int var7 = 0; var7 < var6.length; var7++) {
            dk var8 = var6[var7];
            int var9 = var8.field_q;
            if (var5_int == var9) {
              this.a(pc.field_a, 2, var8, param2, param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ig.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void c(int param0) {
        Throwable decompiledCaughtException = null;
        int var11 = EscapeVector.obfuscationControl;
        if (param0 != 6620) {
          ig.releaseStatics(-11);
        }
        if (di.field_d.field_e) {
          Object var2 = ObjectSpriteSet.field_e;
          synchronized (var2) {
            int var3 = 1536 * qm.field_c / 64;
            int var4 = 100;
            int var5 = di.field_d.field_h;
            this.a(this.field_j, var3, var4, 3);
            this.a(this.field_q, var3, var4, 3);
            int var4Lifetime1 = 102;
            if (this.field_d != null) {
              qe[] var6 = this.field_d;
              for (int var7 = 0; var6.length > var7; var7++) {
                qe var8 = var6[var7];
                if (var8.field_d == var5) {
                  int var9 = var8.field_f.field_h * 16384 / 640;
                  ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, var4Lifetime1, var3, var9);
                }
              }
            }
            this.a(this.field_b, var3, var4Lifetime1, 3);
          }
        }
    }

    private final void b(int param0) {
        if (~this.field_a != param0) {
          this.field_r = null;
          return;
        }
        byte[][] var2 = ld.field_h[this.field_a];
        this.field_r = new GameplaySession(var2);
        this.field_r.gameMode = this.field_a;
        this.field_r.selectLevel(this.field_m, -59);
        this.a(true);
    }

    final int a(int param0, int param1, int param2) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.field_d != null) {
          qe[] var8 = this.field_d;
          qe[] var4_ref_qe__ = var8;
          for (int var5 = 0; var8.length > var5; var5++) {
            qe var6 = var8[var5];
            if (var6.a(param0, param2, param1 ^ 12088)) {
              return var6.field_d;
            }
          }
        }
        if (param1 != 12089) {
          this.field_h = 122;
        }
        int var4 = this.a((byte) -43, param2, this.field_j, param0);
        if (var4 >= 0) {
          return var4;
        }
        if (null != this.field_b) {
          var4 = this.a((byte) -43, param2, this.field_b, param0);
        }
        if (var4 >= 0) {
          return var4;
        }
        var4 = this.a((byte) -43, param2, this.field_q, param0);
        if (0 <= var4) {
          return var4;
        }
        return -1;
    }

    private final void b(boolean param0, int param1) {
        int var7 = EscapeVector.obfuscationControl;
        if (!param0) {
          return;
        }
        if (null == this.field_d) {
          return;
        }
        qe[] var8 = this.field_d;
        qe[] var3 = var8;
        for (int var4 = 0; var8.length > var4; var4++) {
          qe var5 = var8[var4];
          boolean var6 = (var5.field_d == param1);
          var5.a((var6), -1);
        }
    }

    private final void b(byte param0) {
        boolean var2 = (this.field_a == 3);
        ih var3 = fh.field_g;
        this.i(-30234);
        int var4 = ua.field_c.a(29386, this.field_a);
        if (!var2) {
          this.field_d = tm.c(10, var4, this.field_a);
        }
        int var5 = 10;
        this.a((byte) 51, var3, var5);
        int var6 = 3;
        if (!var2) {
          this.a(var6, -9079, var3, var5);
        }
        int var6Lifetime1 = 5;
        this.a((byte) -12, var6Lifetime1, var5, var3);
        IndexedSpriteState.a(this.field_j, 0);
        if (!var2) {
          IndexedSpriteState.a(this.field_b, 0);
        }
        IndexedSpriteState.a(this.field_q, 0);
        if (param0 <= 8) {
          ih var7 = (ih) null;
          this.a((byte) -115, (ih) null, 37);
        }
    }

    final void e(int param0) {
        SoftwareRasterizer.clearFramebuffer();
        SelfDestructEffects.b(param0 ^ 1);
        int var2 = mj.field_d < 50 ? -mj.field_d + 50 : 0;
        if (null != this.field_k) {
          this.field_k.d(3, 79);
        }
        this.d(0);
        fk.a(404, 3162160, param0 ^ 115, 0, 6324320, 76, param0, var2, 430);
        int var3 = je.a(false, this.field_a);
        int var4 = di.field_d.field_h;
        boolean var5 = true;
        if (var4 >= 0 &&
          var3 > var4) {
          int var6 = ua.field_c.a(param0 + 29383, this.field_a);
          var5 = (var4 <= var6);
        }
        this.a(this.field_b, 104);
        this.a(this.field_q, param0 - 85);
        this.a((byte) 120);
        this.b(true, var4);
        this.a(var3, (byte) -59, (var5));
        pb.a(param0 + 1);
    }

    private final void k(int param0) {
        this.field_k = null;
        if (param0 != -32044) {
          return;
        }
        if (this.field_a == 1) {
          this.field_k = km.field_k;
        }
        if (this.field_a == 0) {
          this.field_k = km.field_k;
        }
        if (this.field_a == 2) {
          this.field_k = aj.field_c;
        }
    }

    final void j(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        if (param0 != 2525) {
          this.k(-66);
        }
        this.f(0);
        wc var6 = di.field_d;
        int var3 = var6.field_h;
        int var4 = je.a(false, this.field_a);
        while (pn.p(-113)) {
          var6.a(100);
          if (PasswordValidator.field_n == 96 ||
            PasswordValidator.field_n == 98) {
            if (this.field_e == var3 &&
              this.field_n >= 0) {
              var6.a(false, this.field_n);
            } else if (var3 == this.field_e) {
              var6.a(false, var4 - 1);
            } else if (this.field_n == var3) {
              var6.a(false, -1 + var4);
            } else if (var3 > 0 &&
              var3 < var4) {
              var6.a(false, -1 + var3);
            } else if (0 == var3 &&
              this.field_s >= 0) {
              var6.a(false, this.field_s);
            } else if (0 == var3 &&
              this.field_f >= 0) {
              var6.a(false, this.field_f);
            } else if (var3 == 0) {
              var6.a(false, this.field_e);
            } else if (var3 == this.field_s &&
              this.field_f >= 0) {
              var6.a(false, this.field_f);
            } else if (this.field_s == var3) {
              var6.a(false, this.field_e);
            } else if (var3 != this.field_f) {
              var6.a(false, h.a(this.field_a, (byte) 121));
            } else {
              var6.a(false, this.field_e);
            }
          }
          if (PasswordValidator.field_n == 97 ||
            PasswordValidator.field_n == 99) {
            if (this.field_s == var3) {
              var6.a(false, 0);
            } else if (var3 >= 0 &&
              var3 < var4 - 1) {
              var6.a(false, var3 + 1);
            } else if (var4 - 1 == var3 &&
              this.field_n >= 0) {
              var6.a(false, this.field_n);
            } else if (var3 == var4 - 1) {
              var6.a(false, this.field_e);
            } else if (this.field_n == var3) {
              var6.a(false, this.field_e);
            } else if (var3 == this.field_e &&
              this.field_f >= 0) {
              var6.a(false, this.field_f);
            } else if (var3 == this.field_e &&
              this.field_s >= 0) {
              var6.a(false, this.field_s);
            } else if (this.field_e == var3) {
              var6.a(false, 0);
            } else if (var3 == this.field_f &&
              this.field_s >= 0) {
              var6.a(false, this.field_s);
            } else if (this.field_f != var3) {
              var6.a(false, h.a(this.field_a, (byte) 121));
            } else {
              var6.a(false, 0);
            }
          }
          if (PasswordValidator.field_n == 13) {
            SelfDestructEffects.field_q = -1;
            GameplaySession.c(false, param0 ^ 989);
            return;
          }
          if (this.a(false, -54)) {
            return;
          }
        }
        var6.a(this.a(ng.field_ob, 12089, sf.field_c), (byte) 126, this.a(UiContainer.field_y, 12089, dh.field_d));
        boolean discarded$0 = this.a(true, -89);
        this.c((byte) 86);
        this.g(param0 ^ -2493);
    }

    private final void a(int param0, byte param1, boolean param2) {
        if (param1 != -59) {
          this.f(27);
        }
        Object var4 = null;
        if (!param2) {
          String var6 = GameAppletShell.field_f;
          var4 = var6;
          if (aj.b(-97)) {
            var4 = var6 + "<br>" + jf.field_O + " " + fk.field_c;
          }
        }
        if (var4 != null) {
          int var5 = 8 + fh.field_g.b((String) (var4), 387, 20);
          SoftwareRasterizer.drawHorizontalLine(7, 426 + (-var5 - 1), 393, 3162160);
          SoftwareRasterizer.a(7, -var5 + 426, 393, var5, 0);
          fh.field_g.a((String) (var4), 10, 128, 387, 294, 6340704, -1, 1, 2, 20);
        }
    }

    private final void a(boolean param0) {
        if (!param0) {
          return;
        }
        if (this.field_r == null) {
          return;
        }
        Minimap var2 = this.field_r.minimap;
        if (var2 == null) {
          return;
        }
        var2.field_c = var2.field_c + 1;
        if (!var2.b((byte) -102)) {
          var2.e((byte) -101);
        }
        var2.field_d = false;
        var2.field_L = false;
    }

    private final void a(byte param0, ih param1, int param2) {
        String stackIn_18_2 = null;
        int var27 = EscapeVector.obfuscationControl;
        try {
          int var4_int = 4;
          int var5 = 88;
          int var6 = 18;
          int var7 = 9;
          int var8 = 415;
          if (param0 != 51) {
            return;
          }
          int var9 = 625;
          int var10 = -var8 + var9 + 1;
          int var11 = 30;
          int[] var12 = ValidationIndicator.field_E[this.field_a];
          int var13 = var12.length;
          int var14 = je.a(false, this.field_a);
          int var15 = ki.field_M[this.field_a];
          this.field_j = new dk[-var15 + var14];
          int var16 = ua.field_c.a(29386, this.field_a);
          int var17 = 0;
          int var18 = var15;
          while (var13 > var17) {
            int var19 = var12[var17];
            for (int var20 = 0; var19 > var20; var20++) {
              if (var18 < var14) {
                String var28 = TrackerMusicDefinition.a((byte) 127, this.field_a, var18);
                String var29 = this.a(var18, var16, var28, false);
                boolean var22 = (this.a(var16, var18, true));
                int var23 = var18;
                if (0 > var23) {
                  var23 = this.field_s;
                }
                int var24 = 1 + var18;
                Sprite var25 = this.a((byte) -71, (var22));
                dk var26 = new dk(var4_int, var23, var24, var29, var11, var25, param2, param1);
                var26.b((byte) -48, var8, var5);
                var26.a(var6, param0 ^ 51, var10);
                this.field_j[var18 - var15] = var26;
                var5 = var5 + var6;
                var18++;
                continue;
              }
              break;
            }
            if (var14 <= var18) {
              return;
            }
            var5 = var5 + var7;
            var17++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var4;
          StringBuilder stackIn_17_1 = new StringBuilder().append("ig.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void f(int param0) {
        int var11 = EscapeVector.obfuscationControl;
        int var2 = mj.field_d;
        if (var2 == 0) {
          sj.a(8192, (byte) 51);
        }
        IntValueNode.field_j = true;
        if (param0 != 0) {
          return;
        }
        int var3 = qm.field_c * 6144 / 64;
        int var4 = 100;
        this.a(var4, param0 + 9355, var3, this.field_b);
        this.a(var4, param0 ^ 9355, var3, this.field_q);
        if (this.field_d != null) {
          qe[] var5 = this.field_d;
          for (int var6 = 0; var5.length > var6; var6++) {
            qe var7 = var5[var6];
            if (var7.field_h == var2) {
              PcmSample var8 = b.field_b;
              int var9 = 16384 * var7.field_f.field_h / 640;
              PcmSampleStream var10 = PcmSampleStream.c(var8, var4, var3, var9);
              ValidatedTextWidget.field_K[var7.field_d] = var10;
            }
          }
        }
        SelfDestructEffects.field_s = true;
        if (1000 > mj.field_d) {
          mj.field_d = mj.field_d + 1;
        }
    }

    private final void a(dk[] param0, int param1, int param2, int param3) {
        String stackIn_19_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (param0 == null) {
            return;
          }
          int var5_int = di.field_d.field_h;
          Object var6 = null;
          if (param3 != 3) {
            this.a(true);
          }
          dk[] var7 = param0;
          for (int var8 = 0; var7.length > var8; var8++) {
            dk var9 = var7[var8];
            int var10 = var9.field_c;
            if (var5_int == var10) {
              var6 = var9;
            }
          }
          if (var6 == null) {
            return;
          }
          this.a(ArchiveRequest.field_w, 2, (dk) (var6), param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var5;
          StringBuilder stackIn_18_1 = new StringBuilder().append("ig.L(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ig(int param0, int param1) {
        this.field_e = -2;
        this.field_o = true;
        this.field_s = -2;
        this.field_n = -2;
        this.field_f = -2;
        this.field_m = 0;
        this.field_h = param1;
        this.field_a = param0;
        this.b((byte) 62);
        this.k(-32044);
        this.b(-4);
    }

    public static void releaseStatics(int guard) {
        field_l = null;
        field_g = null;
        field_i = null;
        if (guard > -33) {
          ig.releaseStatics(-58);
        }
        field_c = null;
    }

    static {
        field_c = "Skip";
        field_i = "Player names can be up to 12 letters, numbers and underscores";
        field_g = new tk();
    }
}
