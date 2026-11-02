/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScorePopup {
    private double velocityY;
    private int value;
    static int field_d;
    private double velocityX;
    private double x;
    static boolean field_i;
    static int field_b;
    private int field_c;
    private double y;

    final static wb a(byte param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        wb var7 = null;
        int var8 = 0;
        String var9 = null;
        wb stackIn_4_0 = null;
        wb stackIn_8_0 = null;
        wb stackIn_11_0 = null;
        wb stackIn_19_0 = null;
        wb stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = stellarshard.field_B;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = uj.field_d;
            return stackIn_4_0;
          }
          if (255 < var2_int) {
            stackIn_8_0 = DualLinkDeque.field_a;
            return stackIn_8_0;
          }
          var3 = qj.a('.', param1, 10287);
          if (var3.length < 2) {
            stackIn_11_0 = uj.field_d;
            return stackIn_11_0;
          }
          var4 = var3;
          if (param0 != -96) {
            var9 = (String) null;
            ScorePopup.a((Sprite) null, (byte) 119, (String) null);
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = ag.a(-1, var6);
            if (var7 != null) {
              stackIn_19_0 = var7;
              return stackIn_19_0;
            }
          }
          stackIn_22_0 = KeyHandler.a(var3[-1 + var3.length], param0 ^ -30);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("sd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        if (param0 != 107) {
          return;
        }
        this.x = this.x + this.velocityX;
        this.y = this.y + this.velocityY;
    }

    final ScorePopup update(int param0) {
        this.a((byte) 107);
        this.velocityY = this.velocityY - 0.1;
        if (this.x < 64.0) {
          this.velocityX = this.velocityX + 0.1;
        }
        if (param0 != 0) {
          return (ScorePopup) null;
        }
        if (64.0 < this.x) {
          this.velocityX = this.velocityX - 0.1;
        }
        this.velocityX = this.velocityX * 0.99999;
        hk.field_p = hk.field_p - 1;
        lg.field_f = lg.field_f + 1;
        if (!DualLinkDequeIterator.field_i) {
          return null;
        }
        if (this.x < -384.0) {
          if (this.value > 0) {
            cl.field_a = cl.field_a - this.value;
            te.field_c = te.field_c + this.value;
          }
          return null;
        }
        if (this.x > 384.0) {
          if (0 >= this.value) {
            return null;
          }
          qb.field_k = qb.field_k + this.value;
          te.field_c = te.field_c + this.value;
          return null;
        }
        if (this.y < -304.0) {
          if (this.value > 0) {
            te.field_c = te.field_c + this.value;
            cl.field_a = cl.field_a - this.value;
          }
          return null;
        }
        if (!(304.0 < this.y)) {
          return this;
        }
        if (this.value <= 0) {
          return null;
        }
        te.field_c = te.field_c + this.value;
        qb.field_k = qb.field_k + this.value;
        return null;
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        String var4;
        var2 = (int)(this.x + 320.0);
        var3 = (int)(this.y + 240.0);
        if (this.value <= 0) {
          var4 = ei.field_A;
          if (this.value == -1) {
            var4 = gf.field_a;
          }
          if (-2 == this.value) {
            var4 = PacketBuffer.field_l;
          }
          if (this.value == -3) {
            var4 = he.field_l;
          }
          if (this.value == -4) {
            var4 = td.field_e;
          }
          if (this.value == -5) {
            var4 = SocketConnector.field_f;
          }
          if (this.value == -6) {
            var4 = qh.field_h;
          }
          if (this.value == -7) {
            var4 = we.field_e;
          }
          if (this.value == -8) {
            var4 = pe.field_a;
          }
          if (this.value == -9) {
            var4 = te.field_b;
          }
          if (this.value == -10) {
            var4 = ha.field_x;
          }
          if (this.value == -11) {
            var4 = fc.field_c;
          }
          if (this.value == -12) {
            var4 = ClientException.field_e;
          }
          if (-13 == this.value) {
            var4 = nb.field_O;
          }
          if (this.value == -14) {
            var4 = ja.field_k;
          }
          if (this.value == -15) {
            var4 = rd.field_b;
          }
          if (-16 == this.value) {
            var4 = Integer.toString(ml.field_h);
          }
          qj.field_a.c(var4, var2 - 1, var3, 0, -1);
          qj.field_a.c(var4, 1 + var2, var3, 0, -1);
          qj.field_a.c(var4, var2, var3 - 1, 0, -1);
          qj.field_a.c(var4, var2, 1 + var3, 0, -1);
          qj.field_a.c(var4, var2, var3, this.field_c, -1);
        } else {
          qj.field_a.c("" + this.value, -1 + var2, var3, 0, -1);
          qj.field_a.c("" + this.value, var2 + 1, var3, 0, -1);
          qj.field_a.c("" + this.value, var2, var3 - 1, 0, -1);
          qj.field_a.c("" + this.value, var2, var3 + 1, 0, -1);
          qj.field_a.c("" + this.value, var2, var3, this.field_c, -1);
        }
        if (!param0) {
          this.y = -0.5996134405584707;
        }
    }

    final static void a(Sprite param0, byte param1, String param2) {
        try {
          ve.field_a = param0;
          MouseHandler.field_f = param2;
          if (param1 != 60) {
            String var4 = (String) null;
            ScorePopup.a((byte) 87, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "sd.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ScorePopup(int param0, GameEntity param1, int param2) {
        try {
          this.y = param1.y;
          this.x = param1.x;
          this.velocityX = param1.velocityX;
          this.velocityY = param1.velocityY;
          this.field_c = param2;
          this.value = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "sd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
