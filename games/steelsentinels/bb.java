/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb extends dl {
    static boolean field_T;
    static int[] field_X;
    static String[] field_R;
    static SceneWidget field_W;
    static String field_P;
    private ka field_V;
    boolean field_Q;
    private int field_U;
    static int[] field_S;

    public static void h(byte param0) {
        field_S = null;
        field_W = null;
        field_P = null;
        field_X = null;
        field_R = null;
        if (param0 < 126) {
          field_S = (int[]) null;
        }
    }

    bb(ka param0, int param1, int param2) {
        super(-param1 + IntrusiveNode.field_l >> 1, DualNode.field_u - param2 >> 1, param1, param2, (qk) null);
        try {
          this.field_U = 0;
          this.field_Q = false;
          this.field_V = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final lh h(int param0) {
        lh var2 = super.h(param0 ^ 0);
        if (param0 != -1) {
          this.a(96, (byte) -104, -78, -99);
          if (var2 != null) {
            return var2;
          }
          return (lh) (this);
        }
        if (var2 != null) {
          return var2;
        }
        return (lh) (this);
    }

    boolean j(int param0) {
        if (param0 > -50) {
          this.h(-124);
          this.field_U = this.a(false);
          if (this.field_U != 0) {
            return false;
          }
          if (!this.field_Q) {
            return true;
          }
          return false;
        }
        this.field_U = this.a(false);
        if (this.field_U != 0) {
          return false;
        }
        if (!this.field_Q) {
          return true;
        }
        return false;
    }

    final static void a(byte param0) {
        if (!mg.field_ac) {
          throw new IllegalStateException();
        }
        IntrusiveNode.field_a = true;
        if (param0 > 66) {
          nj.a(true, 40);
          uj.field_d = 0;
          return;
        }
        field_W = (SceneWidget) null;
        nj.a(true, 40);
        uj.field_d = 0;
    }

    final void a(byte param0, int param1, int param2) {
        this.a(-param1 + IntrusiveNode.field_l >> 1, (byte) -103, -param2 + DualNode.field_u >> 1, param1, param2);
        int var4 = 103 / ((param0 - 0) / 45);
    }

    final static void a(int param0, byte param1) {
        pc var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        pc var2Lifetime1;
        var3 = SteelSentinels.obfuscationControl;
        try {
          lb.field_ac = param0;
          if (param1 != 64) {
            bb.a((byte) 37);
          }
          var2 = (pc) (mm.field_b.first(13058));
          while (var2 != null) {
            if (var2.field_u.b((byte) -12)) {
              var2.field_v.e(128 + lb.field_ac * var2.field_t >> 8);
            } else {
              var2.unlink(param1 - 60);
            }
            var2 = (pc) (mm.field_b.next((byte) -84));
          }
          if (null != rl.field_c) {
            var2Lifetime1 = (pc) (rl.field_c.first(13058));
            while (var2Lifetime1 != null) {
              stackIn_14_0 = var2Lifetime1.field_u.b((byte) -12);
              if (stackIn_14_0) {
                var2Lifetime1.field_v.e(128 + lb.field_ac * var2Lifetime1.field_t >> 8);
              } else {
                var2Lifetime1.unlink(4);
              }
              var2Lifetime1 = (pc) (rl.field_c.next((byte) -75));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "bb.SB(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(boolean param0) {
        if (!param0) {
          return !this.field_Q ? 0 : this.field_V.i(-1850) == this ? 256 : 0;
        }
        return -118;
    }

    boolean i(int param0) {
        int var2 = this.a(false);
        int var3 = var2 - this.field_U;
        if (param0 != -8350) {
          return false;
        }
        if (var3 > 0) {
          this.field_U = this.field_U + (-1 + (8 + var3)) / 8;
        }
        if (var3 < 0) {
          this.field_U = this.field_U + (-16 + var3 + 1) / 16;
          if (this.field_U != 0) {
            return false;
          }
          if (0 == var2) {
            return !this.field_Q ? true : false;
          }
          return false;
        }
        if (this.field_U != 0) {
          return false;
        }
        if (0 == var2) {
          return !this.field_Q ? true : false;
        }
        return false;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 > -99) {
          bb.a(35, (byte) 1);
        }
        if (this.field_U == 0) {
          return;
        }
        if (this.field_U >= 256) {
          if (param3 != 0) {
            return;
          }
          this.a(param2 + this.field_o, param0 + this.field_z, true);
          super.a(param0, (byte) -121, param2, param3);
          return;
        }
        if (lc.field_b == null) {
          lc.field_b = new RgbSprite(this.field_x, this.field_E);
          q.a(lc.field_b, (byte) -103);
          SoftwareRaster.b();
          this.a(0, 0, true);
          super.a(-param0 - this.field_z, (byte) -108, -this.field_o - param2, param3);
          tk.$cfr$intArgs$f$20d51497949f(111);
          lc.field_b.b(param2 + this.field_o, param0 + this.field_z, this.field_U);
          return;
        }
        if (this.field_x > lc.field_b.field_A) {
          lc.field_b = new RgbSprite(this.field_x, this.field_E);
          q.a(lc.field_b, (byte) -103);
          SoftwareRaster.b();
          this.a(0, 0, true);
          super.a(-param0 - this.field_z, (byte) -108, -this.field_o - param2, param3);
          tk.$cfr$intArgs$f$20d51497949f(111);
          lc.field_b.b(param2 + this.field_o, param0 + this.field_z, this.field_U);
          return;
        }
        if (lc.field_b.field_F < this.field_E) {
          lc.field_b = new RgbSprite(this.field_x, this.field_E);
          q.a(lc.field_b, (byte) -103);
          SoftwareRaster.b();
          this.a(0, 0, true);
          super.a(-param0 - this.field_z, (byte) -108, -this.field_o - param2, param3);
          tk.$cfr$intArgs$f$20d51497949f(111);
          lc.field_b.b(param2 + this.field_o, param0 + this.field_z, this.field_U);
          return;
        }
        q.a(lc.field_b, (byte) -103);
        SoftwareRaster.b();
        this.a(0, 0, true);
        super.a(-param0 - this.field_z, (byte) -108, -this.field_o - param2, param3);
        tk.$cfr$intArgs$f$20d51497949f(111);
        lc.field_b.b(param2 + this.field_o, param0 + this.field_z, this.field_U);
    }

    abstract void a(int param0, int param1, boolean param2);

    static {
        field_R = new String[]{"Game-time mode", "Technology level", "Game map"};
        field_P = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_S = new int[]{108, -1, 30, 28, -1, -1, -1, -1, -1, -1, -1};
    }
}
