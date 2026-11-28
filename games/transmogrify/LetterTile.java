/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class LetterTile extends IntrusiveNode {
    static String[] field_w;
    int baseValue;
    int field_l;
    TileRack previousRack;
    int carryoverFlag;
    int y;
    static wb field_u;
    boolean doublesWordScore;
    TileRack rack;
    int slot;
    int destinationY;
    int x;
    int previousSlot;
    static String field_r;
    WordLanguage field_n;
    int destinationX;
    static long field_m;
    char letter;

    public static void b(byte param0) {
        field_r = null;
        if (param0 != -15) {
          LetterTile.e(91);
          field_w = null;
          field_u = null;
          return;
        }
        field_w = null;
        field_u = null;
    }

    final void draw(int param0, int param1, int param2, int param3) {
        String var14 = null;
        String var12 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        AccountRegistrationPanel.field_K.drawGrayModulated(param3 + this.x, param1 + this.y, LoginPanel.field_H[this.carryoverFlag]);
        if (!this.doublesWordScore) {
          var14 = Integer.toString(this.baseValue + (this.carryoverFlag << 1));
          var6 = this.field_n.field_c.charWidth(this.letter);
          var7 = hk.field_a.stringWidth(var14);
          var8 = -var7 + 31;
          var9 = var8 - var6;
          var10 = 29 - var6 >> 1;
          if (var10 < var9) {
            var9 = var10;
            var8 = var8 + (var9 + var6) >> 1;
          }
          if (var9 < 1) {
            var9 = 1;
          }
          this.field_n.field_c.drawCharacter(this.letter, var9 + (this.x + param3), param1 + this.field_n.field_c.field_D + this.y + 8, param2);
          hk.field_a.drawString(var14, param3 + this.x + var8, param1 + 28 + this.y, 1, -1);
          return;
        }
        param0 = param0 >> 3;
        if ((param0 & 31) == 31) {
          AccountRegistrationPanel.field_K.drawGrayModulated(this.x + param3, this.y + param1, 10539762);
        } else {
          MouseWheelInput.field_a[param0 % MouseWheelInput.field_a.length].draw(this.x + param3, param1 + this.y);
          var12 = Integer.toString(this.baseValue + (this.carryoverFlag << 1));
          var6Lifetime1 = this.field_n.field_c.charWidth(this.letter);
          var7Lifetime1 = hk.field_a.stringWidth(var12);
          var8Lifetime1 = -var7Lifetime1 + 31;
          var9Lifetime1 = var8Lifetime1 - var6Lifetime1;
          var10Lifetime1 = 29 - var6Lifetime1 >> 1;
          if (var10Lifetime1 < var9Lifetime1) {
            var9Lifetime1 = var10Lifetime1;
            var8Lifetime1 = var8Lifetime1 + (var9Lifetime1 + var6Lifetime1) >> 1;
          }
          if (var9Lifetime1 < 1) {
            var9Lifetime1 = 1;
          }
          this.field_n.field_c.drawCharacter(this.letter, var9Lifetime1 + (this.x + param3), param1 + this.field_n.field_c.field_D + this.y + 8, param2);
          hk.field_a.drawString(var12, param3 + this.x + var8Lifetime1, param1 + 28 + this.y, 1, -1);
          return;
        }
        MouseWheelInput.field_a[param0 % MouseWheelInput.field_a.length].draw(this.x + param3, param1 + this.y);
        String var13 = Integer.toString(this.baseValue + (this.carryoverFlag << 1));
        var6Lifetime2 = this.field_n.field_c.charWidth(this.letter);
        var7Lifetime2 = hk.field_a.stringWidth(var13);
        var8Lifetime2 = -var7Lifetime2 + 31;
        var9Lifetime2 = var8Lifetime2 - var6Lifetime2;
        var10Lifetime2 = 29 - var6Lifetime2 >> 1;
        if (var10Lifetime2 < var9Lifetime2) {
          var9Lifetime2 = var10Lifetime2;
          var8Lifetime2 = var8Lifetime2 + (var9Lifetime2 + var6Lifetime2) >> 1;
        }
        if (var9Lifetime2 < 1) {
          var9Lifetime2 = 1;
        }
        this.field_n.field_c.drawCharacter(this.letter, var9Lifetime2 + (this.x + param3), param1 + this.field_n.field_c.field_D + this.y + 8, param2);
        hk.field_a.drawString(var13, param3 + this.x + var8Lifetime2, param1 + 28 + this.y, 1, -1);
    }

    final void moveToRack(int param0, int param1, TileRack param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.rack.tiles[this.slot] == this) {
            this.rack.tiles[this.slot] = null;
          }
          if (od.submissionRack != this.rack) {
            this.previousRack = this.rack;
            this.previousSlot = this.slot;
          }
          this.slot = param0;
          this.rack = param2;
          this.rack.tiles[this.slot] = this;
          this.destinationY = param2.originY;
          this.destinationX = 32 * param0 + param2.originX;
          if (param1 == 28) {
            return;
          }
          this.draw(-53, -35, -125, 103);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("sj.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void d(int param0) {
        ab.field_c.addLast((IntrusiveNode) (this), -127);
        if (param0 != 1) {
          this.field_n = (WordLanguage) null;
        }
    }

    final void stepTowardDestination(byte param0) {
        double var3 = 0.0;
        int var2 = 0;
        double var3Lifetime1;
        double var3Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        double var3Lifetime3;
        int var2Lifetime3;
        if (param0 != 75) {
          this.rack = (TileRack) null;
          if (this.x != this.destinationX) {
            var2 = (-this.x + this.destinationX) * (-this.x + this.destinationX) + (this.destinationY - this.y) * (this.destinationY - this.y);
            if (var2 > 144) {
              var3 = 12.0 / Math.sqrt((double)var2);
              this.x = this.x + (int)((double)(-this.x + this.destinationX) * var3);
              this.y = this.y + (int)((double)(-this.y + this.destinationY) * var3);
            } else {
              this.x = this.destinationX;
              this.y = this.destinationY;
            }
            if (this.x != this.destinationX) {
              return;
            }
            if (this.y == this.destinationY) {
              ByteArrayPoolSupport.a((byte) 108, FullscreenFocusCanvas.field_d[3 + AccountNameAvailabilityValidator.a(3, o.field_o, false)]);
              return;
            }
            return;
          }
          if (this.destinationY == this.y) {
            return;
          }
          var2Lifetime3 = (-this.x + this.destinationX) * (-this.x + this.destinationX) + (this.destinationY - this.y) * (this.destinationY - this.y);
          if (var2Lifetime3 > 144) {
            var3Lifetime3 = 12.0 / Math.sqrt((double)var2Lifetime3);
            this.x = this.x + (int)((double)(-this.x + this.destinationX) * var3Lifetime3);
            this.y = this.y + (int)((double)(-this.y + this.destinationY) * var3Lifetime3);
            if (this.x != this.destinationX) {
              return;
            }
            if (this.y == this.destinationY) {
              ByteArrayPoolSupport.a((byte) 108, FullscreenFocusCanvas.field_d[3 + AccountNameAvailabilityValidator.a(3, o.field_o, false)]);
              return;
            }
            return;
          }
          this.x = this.destinationX;
          this.y = this.destinationY;
          if (this.x != this.destinationX) {
            return;
          }
          if (this.y == this.destinationY) {
            ByteArrayPoolSupport.a((byte) 108, FullscreenFocusCanvas.field_d[3 + AccountNameAvailabilityValidator.a(3, o.field_o, false)]);
            return;
          }
          return;
        }
        if (this.x != this.destinationX) {
          var2Lifetime1 = (-this.x + this.destinationX) * (-this.x + this.destinationX) + (this.destinationY - this.y) * (this.destinationY - this.y);
          if (var2Lifetime1 > 144) {
            var3Lifetime1 = 12.0 / Math.sqrt((double)var2Lifetime1);
            this.x = this.x + (int)((double)(-this.x + this.destinationX) * var3Lifetime1);
            this.y = this.y + (int)((double)(-this.y + this.destinationY) * var3Lifetime1);
            if (this.x != this.destinationX) {
              return;
            }
            if (this.y == this.destinationY) {
              ByteArrayPoolSupport.a((byte) 108, FullscreenFocusCanvas.field_d[3 + AccountNameAvailabilityValidator.a(3, o.field_o, false)]);
              return;
            }
            return;
          }
          this.x = this.destinationX;
          this.y = this.destinationY;
          if (this.x != this.destinationX) {
            return;
          }
          if (this.y != this.destinationY) {
            return;
          }
          ByteArrayPoolSupport.a((byte) 108, FullscreenFocusCanvas.field_d[3 + AccountNameAvailabilityValidator.a(3, o.field_o, false)]);
          return;
        }
        if (this.destinationY == this.y) {
          return;
        }
        var2Lifetime2 = (-this.x + this.destinationX) * (-this.x + this.destinationX) + (this.destinationY - this.y) * (this.destinationY - this.y);
        if (var2Lifetime2 > 144) {
          var3Lifetime2 = 12.0 / Math.sqrt((double)var2Lifetime2);
          this.x = this.x + (int)((double)(-this.x + this.destinationX) * var3Lifetime2);
          this.y = this.y + (int)((double)(-this.y + this.destinationY) * var3Lifetime2);
          if (this.x != this.destinationX) {
            return;
          }
          if (this.y == this.destinationY) {
            ByteArrayPoolSupport.a((byte) 108, FullscreenFocusCanvas.field_d[3 + AccountNameAvailabilityValidator.a(3, o.field_o, false)]);
            return;
          }
          return;
        }
        this.x = this.destinationX;
        this.y = this.destinationY;
        if (this.x != this.destinationX) {
          return;
        }
        if (this.y == this.destinationY) {
          ByteArrayPoolSupport.a((byte) 108, FullscreenFocusCanvas.field_d[3 + AccountNameAvailabilityValidator.a(3, o.field_o, false)]);
          return;
        }
    }

    final static void a(int param0, int param1, jl param2) {
        BitPacketBuffer var5 = null;
        int var4 = 0;
        if (param0 != -7812) {
          return;
        }
        try {
          var5 = LoginPanel.field_D;
          var5.writeCipheredByte(false, param1);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(6389, 1);
          var5.writeByte(6389, param2.field_m);
          var5.writeSignedSmart(-21770, param2.field_i);
          var5.writeInt(param0 + 7711, param2.field_h);
          var5.writeInt(-108, param2.field_g);
          var5.writeInt(-123, param2.field_n);
          var5.writeInt(-113, param2.field_k);
          var5.appendCrc32(var4, -1323322296);
          var5.backpatchByteLength((byte) -42, var5.position - var4);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "sj.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(int param0) {
        if (param0 != 31) {
          return true;
        }
        return BufferedRandomAccessFile.field_j.loadMasterIndex(false);
    }

    LetterTile() {
    }

    static {
        field_w = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_r = null;
    }
}
