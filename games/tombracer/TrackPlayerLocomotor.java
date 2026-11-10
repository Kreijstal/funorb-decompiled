/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackPlayerLocomotor extends Locomotor {
    private boolean field_t;
    private int field_p;
    private boolean field_r;
    private IntPoint field_o;
    static SecondaryNodeHashTable field_s;
    private int field_q;

    final void tick(byte param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        Player var11;
        var10 = TombRacer.field_G ? 1 : 0;
        var11 = this.trap.getPlayer(-123);
        if (var11.u(-25561)) {
          return;
        }
        this.field_o.x = var11.getX(3);
        this.field_o.y = var11.getY(9648);
        var4 = 78 % ((-69 - param0) / 42);
        this.trap.a(this.field_o, 59);
        var3 = this.field_o.x - this.trap.getLocalX(25745);
        var5 = this.field_o.y - this.trap.getLocalY(false);
        var6 = 0;
        var7 = 0;
        var8 = S2CNextRoundPacket.abs(var3, -120);
        var9 = S2CNextRoundPacket.abs(var5, 4);
        if (!this.field_t) {
          if (this.field_r &&
            var9 > this.field_p) {
            if (var5 < 0) {
              var7 = -this.field_q;
              if (var7 < var5) {
                var7 = var5;
              }
            } else {
              var7 = this.field_q;
              if (var7 > var5) {
                var7 = var5;
              }
            }
          }
        } else {
          if (var8 > this.field_p) {
            if (var3 >= 0) {
              var6 = this.field_q;
              if (var6 > var3) {
                var6 = var3;
              }
            } else {
              var6 = -this.field_q;
              if (var6 < var3) {
                var6 = var3;
              }
            }
          } else {
            if (this.field_r &&
              var9 > this.field_p) {
              if (var5 < 0) {
                var7 = -this.field_q;
                if (var7 < var5) {
                  var7 = var5;
                }
              } else {
                var7 = this.field_q;
                if (var7 > var5) {
                  var7 = var5;
                }
              }
            }
          }
        }
        this.trap.move((byte) -42, var6, var7);
        return;
    }

    TrackPlayerLocomotor(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        this.field_t = true;
        this.field_r = false;
        this.field_q = 131072;
        this.field_o = new IntPoint();
        try {
          this.field_t = 1 != param1.readBits((byte) 44, 1) ? false : true;
          this.field_r = 1 == param1.readBits((byte) 44, 1) ? true : false;
          this.field_q = this.a(param1.readBits((byte) 44, 8), false);
          this.field_p = param1.readBits((byte) 44, 10) << 16;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    TrackPlayerLocomotor(Room param0, boolean param1) {
        super(param0, param1);
        this.field_t = true;
        this.field_r = false;
        this.field_q = 131072;
        this.field_o = new IntPoint();
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = AgeValidator.field_j;
          var3 = GridWidgetContainer.field_B;
          var4 = Corpse.field_i.field_H.a(param1, 500);
          var5 = 6 + Corpse.field_i.field_H.getWrappedWidth(param1, 500);
          var6 = di.field_a * var4 + 2;
          var7 = bt.a((byte) -8, var5, 12, var2_int);
          var8 = hsa.a(20, var6, var3, (byte) -107);
          SoftwareRasterizer.drawRectangle(var7, var8, var5, var6, 0);
          SoftwareRasterizer.fillRectangle(var7 + 1, 1 + var8, var5 - 2, -2 + var6, 16777088);
          if (param0 > -63) {
            field_s = (SecondaryNodeHashTable) null;
          }
          Corpse.field_i.field_H.a(param1, var7 + 3, -Corpse.field_i.field_H.field_w + (hsa.field_a + 1) + var8, 500, 1000, 0, -1, 0, 0, di.field_a);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hia.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 == 11050) {
          this.field_t = param1 ? true : false;
          return;
        }
        this.field_o = (IntPoint) null;
        this.field_t = param1 ? true : false;
    }

    final void a(boolean param0, int param1) {
        if (param0) {
          BitPacketBuffer var4 = (BitPacketBuffer) null;
          this.encode((BitPacketBuffer) null, (byte) -118);
          this.field_q = param1;
          return;
        }
        this.field_q = param1;
    }

    final int hashState(int param0, int param1) {
        if (param0 != 0) {
          return -126;
        }
        return param1;
    }

    final void applyConstraint(int param0) {
        if (param0 != 1) {
          this.c(-53, false);
        }
    }

    final void encode(BitPacketBuffer param0, byte param1) {
        try {
          super.encode(param0, (byte) -108);
          param0.writeBits((byte) -127, !this.field_t ? 0 : 1, 1);
          param0.writeBits((byte) -126, !this.field_r ? 0 : 1, 1);
          if (param1 > -78) {
            this.b(-8, false);
          }
          param0.writeBits((byte) -125, this.b(0, this.field_q), 8);
          param0.writeBits((byte) -128, this.field_p >> 16, 10);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hia.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int getTypeId(int param0) {
        if (param0 != 1) {
          return -110;
        }
        return 14;
    }

    public static void releaseStatics(int param0) {
        field_s = null;
        if (param0 != 14) {
          field_s = (SecondaryNodeHashTable) null;
        }
    }

    final void c(int param0, boolean param1) {
        if (param0 == 0) {
          this.field_r = param1 ? true : false;
          return;
        }
        this.field_r = false;
        this.field_r = param1 ? true : false;
    }

    static {
    }
}
