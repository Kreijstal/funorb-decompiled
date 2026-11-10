/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ItemBehaviour extends Behaviour {
    private boolean field_n;
    private boolean field_o;
    private int field_q;
    private int field_r;
    static int[] field_p;

    void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -128, this.field_q / 50, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 >= -64) {
          this.a(false, (byte) -88);
          return this.field_o;
        }
        return this.field_o;
    }

    final int hashState(int param0, int param1) {
        param0 = upa.a(this.field_o, param0, (byte) -53);
        param0 = upa.a(this.field_n, param0, (byte) -111);
        if (param1 < -48) {
          param0 = CurveOperator.mixHash((byte) 37, param0, this.field_r);
          return param0;
        }
        Player var4 = (Player) null;
        this.tryCollect(-22, (Player) null);
        param0 = CurveOperator.mixHash((byte) 37, param0, this.field_r);
        return param0;
    }

    final void attachToTrap(boolean param0, Trap param1) {
        try {
          super.attachToTrap(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pd.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        ooa.field_e = fba.a(8, 0.4000000059604645f, 8, true, 4, 1, 2048, 35);
        int var1 = 56 % ((param0 - 57) / 45);
    }

    void a(boolean param0, byte param1) {
        this.field_n = param0 ? true : false;
        if (param1 != 2) {
          this.field_o = false;
        }
    }

    abstract boolean tryCollect(int param0, Player param1);

    final void tick(int param0) {
        Player var3;
        Player var4;
        Player var5;
        Player var6;
        Player var7;
        Player var8;
        Player var9;
        Player var10;
        Player var3Lifetime1;
        if (param0 != 5418) {
          this.field_r = -20;
          if (!this.field_o) {
            if (this.field_o) {
              return;
            }
            var4 = this.getPlayer((byte) 19);
            if (!this.field_n) {
              if (var4.isDying(81)) {
                return;
              }
              if (!this.trap.intersectsRect((byte) 110, var4.getY(9648), var4.getX(3), var4.getHeight((byte) 55), var4.getWidth(-125))) {
                return;
              }
              if (this.tryCollect(param0 - 5533, var4)) {
                if (0 < this.field_q) {
                  this.field_r = this.field_q;
                }
                this.field_o = true;
                return;
              }
            } else {
              if (var4.isDying(102)) {
                return;
              }
              if (this.trap.intersectsRect((byte) 110, var4.getY(9648), var4.getX(3), var4.getHeight((byte) 55), var4.getWidth(-63))) {
                return;
              }
              this.field_n = false;
            }
            return;
          }
          if (0 < this.field_r) {
            this.field_r = this.field_r - 1;
            if (this.field_r != 0) {
              if (this.field_o) {
                return;
              }
              var5 = this.getPlayer((byte) 19);
              if (!this.field_n) {
                if (var5.isDying(81)) {
                  return;
                }
                if (!this.trap.intersectsRect((byte) 110, var5.getY(9648), var5.getX(3), var5.getHeight((byte) 55), var5.getWidth(-125))) {
                  return;
                }
                if (this.tryCollect(param0 - 5533, var5)) {
                  if (0 < this.field_q) {
                    this.field_r = this.field_q;
                  }
                  this.field_o = true;
                  return;
                }
              } else {
                if (var5.isDying(102)) {
                  return;
                }
                if (this.trap.intersectsRect((byte) 110, var5.getY(9648), var5.getX(3), var5.getHeight((byte) 55), var5.getWidth(-63))) {
                  return;
                }
                this.field_n = false;
              }
              return;
            }
            this.field_o = false;
            this.g((byte) 3);
          }
          if (this.field_o) {
            return;
          }
          var6 = this.getPlayer((byte) 19);
          var3 = var6;
          if (this.field_n) {
            if (var6.isDying(102)) {
              return;
            }
            if (this.trap.intersectsRect((byte) 110, var6.getY(9648), var6.getX(3), var6.getHeight((byte) 55), var6.getWidth(-63))) {
              return;
            }
            this.field_n = false;
            return;
          }
          if (var6.isDying(81)) {
            return;
          }
          if (!this.trap.intersectsRect((byte) 110, var6.getY(9648), var6.getX(3), var6.getHeight((byte) 55), var6.getWidth(-125))) {
            return;
          }
          if (!this.tryCollect(param0 - 5533, var6)) {
            return;
          }
          if (0 < this.field_q) {
            this.field_r = this.field_q;
          }
          this.field_o = true;
          return;
        }
        if (!this.field_o) {
          if (this.field_o) {
            return;
          }
          var7 = this.getPlayer((byte) 19);
          if (this.field_n) {
            if (var7.isDying(102)) {
              return;
            }
            if (this.trap.intersectsRect((byte) 110, var7.getY(9648), var7.getX(3), var7.getHeight((byte) 55), var7.getWidth(-63))) {
              return;
            }
            this.field_n = false;
            return;
          }
          if (var7.isDying(81)) {
            return;
          }
          if (!this.trap.intersectsRect((byte) 110, var7.getY(9648), var7.getX(3), var7.getHeight((byte) 55), var7.getWidth(-125))) {
            return;
          }
          if (!this.tryCollect(param0 - 5533, var7)) {
            return;
          }
          if (0 < this.field_q) {
            this.field_r = this.field_q;
          }
          this.field_o = true;
          return;
        }
        if (0 >= this.field_r) {
          if (this.field_o) {
            return;
          }
          var8 = this.getPlayer((byte) 19);
          var3Lifetime1 = var8;
          if (this.field_n) {
            if (var8.isDying(102)) {
              return;
            }
            if (this.trap.intersectsRect((byte) 110, var8.getY(9648), var8.getX(3), var8.getHeight((byte) 55), var8.getWidth(-63))) {
              return;
            }
            this.field_n = false;
            return;
          }
          if (var8.isDying(81)) {
            return;
          }
          if (!this.trap.intersectsRect((byte) 110, var8.getY(9648), var8.getX(3), var8.getHeight((byte) 55), var8.getWidth(-125))) {
            return;
          }
          if (!this.tryCollect(param0 - 5533, var8)) {
            return;
          }
          if (0 < this.field_q) {
            this.field_r = this.field_q;
          }
          this.field_o = true;
          return;
        }
        this.field_r = this.field_r - 1;
        if (this.field_r != 0) {
          if (!this.field_o) {
            var10 = this.getPlayer((byte) 19);
            if (!this.field_n) {
              if (!var10.isDying(81) &&
                this.trap.intersectsRect((byte) 110, var10.getY(9648), var10.getX(3), var10.getHeight((byte) 55), var10.getWidth(-125))) {
                if (!this.tryCollect(param0 - 5533, var10)) {
                  return;
                }
                if (0 < this.field_q) {
                  this.field_r = this.field_q;
                }
                this.field_o = true;
                return;
              }
            } else {
              if (!var10.isDying(102) &&
                !this.trap.intersectsRect((byte) 110, var10.getY(9648), var10.getX(3), var10.getHeight((byte) 55), var10.getWidth(-63))) {
                this.field_n = false;
                return;
              }
            }
          }
          return;
        }
        this.field_o = false;
        this.g((byte) 3);
        if (!this.field_o) {
          var9 = this.getPlayer((byte) 19);
          if (!this.field_n) {
            if (!var9.isDying(81) &&
              this.trap.intersectsRect((byte) 110, var9.getY(9648), var9.getX(3), var9.getHeight((byte) 55), var9.getWidth(-125))) {
              if (!this.tryCollect(param0 - 5533, var9)) {
                return;
              }
              if (0 < this.field_q) {
                this.field_r = this.field_q;
              }
              this.field_o = true;
              return;
            }
          } else {
            if (!var9.isDying(102) &&
              !this.trap.intersectsRect((byte) 110, var9.getY(9648), var9.getX(3), var9.getHeight((byte) 55), var9.getWidth(-63))) {
              this.field_n = false;
              return;
            }
          }
        }
    }

    ItemBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        this.field_o = false;
        this.field_n = false;
        this.field_r = -1;
    }

    abstract void g(byte param0);

    public static void releaseStatics(int param0) {
        if (param0 <= 31) {
          field_p = (int[]) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    ItemBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        this.field_o = false;
        this.field_n = false;
        this.field_r = -1;
        try {
          this.field_q = 50 * param1.readBits((byte) 44, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        BitPacketBuffer var2 = null;
        BitPacketBuffer var2Lifetime1;
        if (param0 == 34) {
          var2 = ql.field_k;
          var2.writeCipheredOpcode(param1, param0 - 3022);
          var2.writeByte(1, 0);
          var2.writeByte(3, 0);
          return;
        }
        field_p = (int[]) null;
        var2Lifetime1 = ql.field_k;
        var2Lifetime1.writeCipheredOpcode(param1, param0 - 3022);
        var2Lifetime1.writeByte(1, 0);
        var2Lifetime1.writeByte(3, 0);
    }

    final static int a(int[] param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int[] var5 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 0;
          if (param1 != 2048) {
            var5 = (int[]) null;
            ItemBehaviour.a((int[]) null, 49);
          }
          for (var3 = 0; param0.length > var3; var3++) {
            var2_int = var2_int + tda.a(param1 - 1922, param0[var3]);
          }
          stackIn_7_0 = var2_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("pd.BA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
