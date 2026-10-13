/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends IntrusiveNode {
    static mf field_s;
    int field_i;
    AchievementBrowserScreen field_t;
    private RgbSprite field_k;
    int field_u;
    int field_w;
    int field_p;
    static String field_l;
    int field_x;
    static mf field_m;
    int field_r;
    static String field_o;
    private boolean field_v;
    static int field_j;
    static mm field_q;
    int field_n;

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        try {
          var9_int = param0 + (param3 + param7);
          if (var9_int != 0) {
            param7 = (var9_int + 200 * param7) / (2 * var9_int);
            param0 = (var9_int + 200 * param0) / (var9_int * 2);
            param3 = (param3 * 200 + var9_int) / (var9_int * 2);
          }
          if (-1 != param8) {
            ob.field_D.a(1 + param8 + ". ", qo.field_N + 54, param1, param5, -1);
          }
          ob.field_D.c(param2, 54 + qo.field_N, param1, param5, -1);
          ob.field_D.a(Integer.toString(param4), mf.field_d[0], param1, param5, -1);
          ob.field_D.a(var9_int < 50 ? Integer.toString(var9_int) : "50+", mf.field_d[1], param1, param5, -1);
          ob.field_D.a(param3 + "%", mf.field_d[2], param1, param5, param6);
          ob.field_D.a(param0 + "%", mf.field_d[3], param1, param5, -1);
          ob.field_D.a(param7 + "%", mf.field_d[4], param1, param5, -1);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "i.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_o = null;
        field_m = null;
        if (param0 == 0) {
          field_l = null;
          field_q = null;
          return;
        }
        String var2 = (String) null;
        i.a(110, 111, (String) null);
        field_l = null;
        field_q = null;
    }

    final static byte[] a(boolean param0, byte[] param1) {
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
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          if (!param0) {
            field_l = (String) null;
          }
          var9 = new PacketBuffer(param1);
          var3 = var9.readUnsignedByte(255);
          var4 = var9.readInt(255);
          if (0 <= var4 && (bq.field_d == 0 ||
            !(var4 > bq.field_d))) {
            if (var3 == 0) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.readBytes(0, var12, 126, var4);
              stackIn_9_0 = var5_ref_byte__;
              return stackIn_9_0;
            }
            var5 = var9.readInt(255);
            if (var5 >= 0 && (bq.field_d == 0 ||
              !(var5 > bq.field_d))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (var3 == 1) {
                tc.a(var13, var5, param1, var4, 9);
              } else {
                var7 = DualLinkIterator.field_d;
                synchronized (var7) {
                  DualLinkIterator.field_d.a(var13, -20555, var9);
                }
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
          stackIn_26_1 = new StringBuilder().append("i.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void a(int param0, pe param1, int param2) {
        BitPacketBuffer var3 = null;
        try {
          var3 = k.field_h;
          var3.writeCipheredOpcode(-13413, param0);
          int var4 = 29 / ((-57 - param2) / 59);
          var3.writeByte(114, 2);
          var3.writeByte(-126, 0);
          var3.writeByte(73, param1.field_w);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "i.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (0 != this.field_p) {
          var2 = 0;
          if (this.field_p <= 0) {
            var2Lifetime1 = this.field_p >> 2;
          } else {
            var2Lifetime1 = -(-this.field_p >> 2);
          }
          this.field_p = this.field_p - var2Lifetime1;
          this.field_i = this.field_i + var2Lifetime1;
        } else {
          rk.field_Qb = rk.field_Qb & this.field_x;
          if (bg.containsRectanglePoint(this.field_i, this.field_w, this.field_u, (byte) 47, po.pointerY, pq.pointerX, this.field_n)) {
            nf.field_Y = this.field_r;
            if (1 == ki.pressedButton &&
              bg.containsRectanglePoint(this.field_i, this.field_w, this.field_u, (byte) 33, qo.pressY, tb.pressX, this.field_n)) {
              if (nf.field_P != this.field_r) {
                nf.field_P = this.field_r;
              } else {
                nf.field_P = -1;
              }
              if (nf.field_P != -1) {
                wp.a(8, ta.field_e[0]);
              }
            }
          } else {
            if (1 == ki.pressedButton &&
              bg.containsRectanglePoint(this.field_i, this.field_w, this.field_u, (byte) 33, qo.pressY, tb.pressX, this.field_n)) {
              if (nf.field_P != this.field_r) {
                nf.field_P = this.field_r;
              } else {
                nf.field_P = -1;
              }
              if (nf.field_P != -1) {
                wp.a(8, ta.field_e[0]);
              }
            }
          }
        }
        if (param0 <= -125) {
          return;
        }
        this.field_n = -78;
    }

    final static void c(byte param0) {
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (pe.gameplayScreen.c(116)) {
          return;
        }
        if ((1 << pe.gameplayScreen.field_k & pe.gameplayScreen.match.field_n) == 0) {
          if (pe.gameplayScreen.match.field_n != 0) {
            ag.buttonLabels[10] = er.field_a;
            if (param0 != 32) {
              field_o = (String) null;
              return;
            }
            return;
          }
          ag.buttonLabels[10] = t.field_b;
          if (param0 != 32) {
            field_o = (String) null;
            return;
          }
          return;
        }
        ag.buttonLabels[10] = fh.field_a;
        if (param0 == 32) {
          return;
        }
        field_o = (String) null;
    }

    final static oh a(int param0, int param1, String param2) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        pe var4 = null;
        oh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new oh(false);
          var3.field_d = param0;
          var3.field_g = param2;
          if (param1 > -27) {
            var4 = (pe) null;
            i.a(-57, (pe) null, 111);
          }
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("i.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void c(int param0) {
        if (param0 == 1) {
          aa.field_a.addLast((IntrusiveNode) (this), (byte) 3);
          this.field_v = false;
          this.field_k = null;
          this.field_t = null;
          return;
        }
        pe var3 = (pe) null;
        i.a(-1, (pe) null, 57);
        aa.field_a.addLast((IntrusiveNode) (this), (byte) 3);
        this.field_v = false;
        this.field_k = null;
        this.field_t = null;
    }

    final void a(byte param0) {
        int var3;
        RgbSprite var6;
        RgbSprite var7;
        RgbSprite var10;
        tp var11;
        tp var12;
        tp var13;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (eo.isBitSet(this.field_t.achievementMask, this.field_r, (byte) -75)) {
          if (this.field_r == nf.field_P) {
            pa.field_h[this.field_r].f(this.field_i, this.field_n, 384);
            if (this.field_k == null ||
              this.field_v) {
              var12 = si.field_c[this.field_r];
              this.field_k = new RgbSprite(var12.field_f / 4, var12.field_h / 4);
              fc.a(-119, this.field_k);
              var12.c(0, 0);
              sc.b(-89);
              this.field_v = false;
            }
          } else {
            if (this.field_r == nf.field_Y) {
              e.field_l[this.field_r].f(this.field_i, this.field_n, 256);
              if (this.field_k == null ||
                this.field_v) {
                var11 = si.field_c[this.field_r];
                this.field_k = new RgbSprite(var11.field_f / 4, var11.field_h / 4);
                fc.a(-119, this.field_k);
                var11.c(0, 0);
                sc.b(-89);
                this.field_v = false;
              }
            } else {
              if (this.field_k == null ||
                this.field_v) {
                var13 = si.field_c[this.field_r];
                this.field_k = new RgbSprite(var13.field_f / 4, var13.field_h / 4);
                fc.a(-119, this.field_k);
                var13.c(0, 0);
                sc.b(-89);
                this.field_v = false;
              }
            }
          }
        } else {
          if (nf.field_P != this.field_r) {
            if (nf.field_Y != this.field_r) {
              if (this.field_k == null) {
                var6 = LevelCompleteScreen.field_F;
                this.field_k = new RgbSprite(var6.canvasWidth / 4, var6.canvasHeight / 4);
                fc.a(-76, this.field_k);
                var6.e(0, 0);
                sc.b(-110);
                this.field_v = true;
              } else {
                if (!this.field_v) {
                  var7 = LevelCompleteScreen.field_F;
                  this.field_k = new RgbSprite(var7.canvasWidth / 4, var7.canvasHeight / 4);
                  fc.a(-76, this.field_k);
                  var7.e(0, 0);
                  sc.b(-110);
                  this.field_v = true;
                }
              }
              if (param0 < 87) {
                return;
              }
              this.field_k.drawTransparent(this.field_i, this.field_n);
              return;
            }
            bf.field_L.f(this.field_i, this.field_n, 256);
          } else {
            qh.field_c.f(this.field_i, this.field_n, 384);
          }
          if (this.field_k == null) {
            var10 = LevelCompleteScreen.field_F;
            this.field_k = new RgbSprite(var10.canvasWidth / 4, var10.canvasHeight / 4);
            fc.a(-76, this.field_k);
            var10.e(0, 0);
            sc.b(-110);
            this.field_v = true;
          } else {
            if (!this.field_v) {
              var10 = LevelCompleteScreen.field_F;
              this.field_k = new RgbSprite(var10.canvasWidth / 4, var10.canvasHeight / 4);
              fc.a(-76, this.field_k);
              var10.e(0, 0);
              sc.b(-110);
              this.field_v = true;
            }
          }
        }
        if (param0 < 87) {
          return;
        }
        this.field_k.drawTransparent(this.field_i, this.field_n);
    }

    i() {
    }

    static {
        field_l = "Suggested names: ";
        field_o = "You have withdrawn your request to join.";
    }
}
