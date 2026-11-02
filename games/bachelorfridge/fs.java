/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static int[] field_e;
    private boolean field_c;
    private BattleState field_d;
    static int field_f;
    private BattleScreen field_b;
    boolean field_a;

    final void a(int param0, int param1) {
        int var5 = 0;
        BattleCreature[] var4;
        int var6;
        BattleCreature[] var7;
        BattleCreature[] var8;
        var6 = BachelorFridge.field_y;
        if (!this.field_a) {
          var7 = this.field_b.field_h.rosters[0].field_b;
          var8 = var7;
          var4 = new BattleCreature[var7.length];
          for (var5 = 0; var8.length > var5; var5++) {
            if (var8[var5] != null) {
              var4[var5] = new BattleCreature(var8[var5], this.field_d, 0, var5);
            }
          }
          this.field_d.a(param0 ^ 1, var4, 0);
          this.field_d.i((byte) -99);
          this.field_d.i(param0 ^ 0);
          RaiseEvent.field_t.position = 0;
          this.field_d.b(RaiseEvent.field_t, (byte) 123);
          RaiseEvent.field_t.position = 0;
          dj.field_c.field_h.a(-2, RaiseEvent.field_t);
          this.c(15467);
        } else {
          sja.field_fb.writeCipheredByte(68, (byte) 108);
          sja.field_fb.writeByte(param1, 0);
        }
        if (param0 != 0) {
          fs.releaseStatics((byte) 97);
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -59) {
          return;
        }
        field_e = null;
    }

    final void b(int param0) {
        if (!this.field_a) {
          return;
        }
        sja.field_fb.writeCipheredByte(param0, (byte) 125);
    }

    private final void c(int param0) {
        int stackIn_9_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (0 == this.field_d.field_A) {
          this.field_d.field_A = 1;
        } else {
          this.field_d.b(0);
        }
        var2 = this.field_d.field_A;
        var3 = this.field_d.field_N ? 1 : 0;
        var4 = this.field_d.field_M;
        var5 = this.field_d.field_Q;
        var6 = DiveBomberEvent.field_q[this.field_d.field_G];
        if (this.field_b.field_h.field_A == 0) {
          stackIn_9_0 = (var2 != 0) ? 1 : 0;
        } else {
          stackIn_9_0 = 0;
        }
        var7 = stackIn_9_0;
        this.field_b.field_h.a(var2, -16292, var3 != 0);
        this.field_b.field_h.field_Q = var5;
        this.field_b.field_h.field_M = var4;
        if (2 == this.field_b.field_h.field_o) {
          this.field_b.c(640, var4, var5);
        }
        if (var7 != 0) {
          this.field_b.l(-112);
        }
        this.field_b.field_M = 0;
        this.field_b.field_m = true;
        this.field_b.field_k = var6;
        if (param0 != 15467) {
          this.d(-52);
        }
        this.field_b.field_Y = new CreatureOrder[7];
        this.field_b.field_u = var6;
        this.field_b.field_p = var6 - 500;
        if (!this.field_b.field_h.field_N) {
          this.field_b.f((byte) 50);
        }
        this.field_b.d((byte) 96);
        if (af.field_a &&
          this.field_b.field_h.field_e == 0) {
          this.field_b.field_h.a(true, 0);
          this.field_b.e(param0 - 15528);
        }
        this.field_b.m(10);
    }

    final void d(int param0) {
        if (!this.field_a) {
          return;
        }
        this.field_b.field_h.field_v = this.field_b.field_h.field_v | 1 << this.field_b.field_n;
        sja.field_fb.writeCipheredByte(60, (byte) 102);
        int var2 = -10 / ((param0 + 61) / 49);
    }

    final void b(byte param0) {
        if (param0 != 27) {
          this.b((byte) 78);
        }
        if (!this.field_a) {
          return;
        }
        sja.field_fb.writeCipheredByte(61, (byte) 127);
    }

    final void d(byte param0) {
        int var2;
        BitPacketBuffer var3;
        int var4;
        if (param0 != -16) {
          field_e = (int[]) null;
        }
        if (this.field_a) {
          if (this.field_c) {
            return;
          }
          sja.field_fb.writeCipheredByte(96, (byte) 102);
          this.field_c = true;
          var2 = this.field_b.field_h.c((byte) -81);
          if (this.field_b.field_h.field_A > 3 &&
            this.field_b.field_g != var2) {
            var3 = sja.field_fb;
            var3.writeCipheredByte(97, (byte) 97);
            var3.position = var3.position + 2;
            var4 = var3.position;
            var3.writeInt(var2, -1615464796);
            var3.writeInt(this.field_b.field_g, -1615464796);
            this.field_b.field_h.b((PacketBuffer) (var3), (byte) 127);
            var3.writeLengthShort((byte) -88, var3.position - var4);
            hna.a(0, param0 ^ -100);
            vc.a((byte) -99);
          }
        } else {
          if (0 == this.field_b.field_M) {
            this.field_b.c(false);
          }
        }
    }

    final void a(boolean param0, CreatureOrder[] param1, int param2) {
        int fieldTemp$1 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5Lifetime1;
        var6 = BachelorFridge.field_y;
        try {
          if (this.field_a) {
            sja.field_fb.writeCipheredByte(58, (byte) 107);
            fieldTemp$1 = sja.field_fb.position + 1;
            sja.field_fb.position = sja.field_fb.position + 1;
            var4_int = fieldTemp$1;
            sja.field_fb.writeByte(param2, 0);
            for (var5 = 0; 7 > var5; var5++) {
              sd.a((byte) 124, sja.field_fb, param1[var5]);
            }
            var5Lifetime1 = -var4_int + sja.field_fb.position;
            sja.field_fb.writeLengthByte((byte) 83, var5Lifetime1);
          } else {
            this.field_d.a(param1, 0, (byte) -31);
            this.c(15467);
            RaiseEvent.field_t.position = 0;
            this.field_d.a(RaiseEvent.field_t, -1);
            this.field_d.h((byte) -111);
            var4_int = RaiseEvent.field_t.position;
            RaiseEvent.field_t.position = 0;
            this.field_b.field_h.a(var4_int, true, RaiseEvent.field_t);
            this.field_b.b((byte) 31);
            this.field_b.field_cb = false;
          }
          if (param0) {
            this.a((byte) -74);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("fs.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    fs(BattleScreen param0, boolean param1) {
        BattleState var3 = null;
        try {
          this.field_b = param0;
          this.field_a = param1 ? true : false;
          if (!this.field_a) {
            var3 = this.field_b.field_h;
            this.field_d = new BattleState(var3.field_G, var3.field_E, var3.field_k, var3.field_o, var3.field_m, var3.field_y);
            RaiseEvent.field_t.position = 0;
            this.field_b.field_h.b(RaiseEvent.field_t, (byte) 126);
            RaiseEvent.field_t.position = 0;
            this.field_d.a(-2, RaiseEvent.field_t);
          }
          this.field_c = true;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "fs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static wda[][] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        wda[][] var1;
        int var4;
        int var5;
        wda[][] var6;
        var5 = BachelorFridge.field_y;
        var6 = new wda[6][10];
        var1 = var6;
        if (param0 != 1) {
          fs.a(11);
        }
        for (var2 = 0; 6 > var2; var2++) {
          for (var3 = 0; var3 < 10; var3++) {
            var4 = 0;
            if (jf.field_n[var3][var2] != 1) {
              if (2 == jf.field_n[var3][var2]) {
                var4 = (byte)(var4 | 2);
                var4 = (byte)(var4 | 8);
                var4 = (byte)(var4 | 4);
                var6[var2][var3] = new wda((byte) var4, 2);
              } else {
                if (jf.field_n[var3][var2] != 3) {
                  var4 = 4;
                  var6[var2][var3] = new wda((byte) var4, 0);
                } else {
                  var4 = (byte)(var4 | 2);
                  var4 = (byte)(var4 | 8);
                  var4 = (byte)(var4 | 1);
                  var4 = (byte)(var4 | 4);
                  var6[var2][var3] = new wda((byte) var4, 3);
                }
              }
            } else {
              var4 = (byte)(var4 | 2);
              var4 = (byte)(var4 | 8);
              var4 = (byte)(var4 | 1);
              var4 = (byte)(var4 | 4);
              var6[var2][var3] = new wda((byte) var4, 1);
            }
          }
        }
        return var1;
    }

    final void a(byte param0) {
        this.field_c = false;
        int var2 = -64 / ((39 - param0) / 35);
    }

    static {
        field_f = 360;
    }
}
