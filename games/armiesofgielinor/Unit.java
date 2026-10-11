/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Unit extends IntrusiveNode implements TaggedFieldReader {
    int tag;
    hr field_x;
    int field_ab;
    boolean field_eb;
    boolean field_Z;
    boolean field_U;
    int strength;
    static String field_n;
    int packedLowFlags;
    int unitType;
    private int field_k;
    int tileX;
    Battlefield battlefield;
    boolean poisoned;
    boolean packedFlag32;
    int field_fb;
    int field_m;
    int maximumStrength;
    boolean packedFlag512;
    static boolean field_L;
    int field_A;
    boolean field_u;
    int movementFlags;
    static String field_y;
    int field_o;
    int field_cb;
    int objectiveId;
    cl field_p;
    int[] field_R;
    static String field_T;
    int field_z;
    boolean packedFlag64;
    boolean field_X;
    boolean field_S;
    private int field_db;
    int field_r;
    int tankId;
    int tileY;
    String displayName;
    int field_P;
    int ownerPlayer;
    int field_M;
    boolean packedFlag8;
    boolean packedFlag4;
    boolean field_G;
    boolean field_v;
    boolean packedFlag256;

    final boolean hasMovementFlag1(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.packedFlag256 = true;
        }
        return (1 & this.movementFlags) != 0 ? true : false;
    }

    final int a(boolean param0) {
        if (param0) {
          Unit var3 = (Unit) null;
          this.a((Unit) null, (byte) 94);
        }
        return this.field_db;
    }

    final boolean p(byte param0) {
        if (param0 >= -94) {
          this.field_m = -85;
        }
        return (2 & bw.unitDefinitions[this.unitType][10]) > 0 ? true : false;
    }

    final int packStatusFlags(byte obfuscationGuard) {
        int var2 = 0;
        if (this.packedFlag256) {
          var2 = var2 | 256;
        }
        if (this.poisoned) {
          var2 = var2 | 16;
        }
        if (this.packedFlag8) {
          var2 = var2 | 8;
        }
        if (this.packedFlag64) {
          var2 = var2 | 64;
        }
        if (this.packedFlag32) {
          var2 = var2 | 32;
        }
        if (this.packedFlag4) {
          var2 = var2 | 4;
        }
        if (this.packedFlag512) {
          var2 = var2 | 512;
        }
        if (obfuscationGuard < 96) {
          this.field_ab = -60;
        }
        var2 = var2 | 3 & this.packedLowFlags;
        return var2;
    }

    final boolean e(byte param0) {
        if (param0 < 73) {
          this.tileY = -27;
        }
        return this.unitType == 39 ? true : false;
    }

    final void c(int param0, int param1) {
        if (param1 != 8) {
          this.n((byte) 80);
        }
        if (this.field_x == null) {
          this.field_x = new hr(this.field_R, param0, this.field_fb);
        } else {
          this.field_x.a((byte) 59, param0);
        }
    }

    final boolean k(byte param0) {
        if (param0 < 75) {
          this.field_p = (cl) null;
        }
        return this.unitType == 27 ? true : false;
    }

    final void n(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_1 = 0;
        Object var3;
        int var4;
        Unit var5;
        Unit var6;
        Unit var7;
        Unit var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        if (0 < this.field_A) {
          this.battlefield.pendingEvents.a((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this, 5)));
        }
        if (this.a(param0 ^ -23050)) {
          var3 = this;
          var4 = 0;
          var5 = this.battlefield.getUnitAt(((Unit) (var3)).tileY, true, -1 + ((Unit) (var3)).tileX);
          stackIn_6_0 = var4;
          if (var5 != null &&
            0 != (8 & bw.unitDefinitions[var5.unitType][10])) {
            stackIn_7_1 = 1;
          } else {
            stackIn_7_1 = 0;
          }
          var4Lifetime1 = stackIn_6_0 | stackIn_7_1;
          var6 = this.battlefield.getUnitAt(((Unit) (var3)).tileY, true, 1 + ((Unit) (var3)).tileX);
          stackIn_10_0 = var4Lifetime1;
          if (var6 != null &&
            (8 & bw.unitDefinitions[var6.unitType][10]) != 0) {
            stackIn_11_1 = 1;
          } else {
            stackIn_11_1 = 0;
          }
          var4Lifetime2 = stackIn_10_0 | stackIn_11_1;
          var7 = this.battlefield.getUnitAt(1 + ((Unit) (var3)).tileY, true, ((Unit) (var3)).tileX);
          stackIn_14_0 = var4Lifetime2;
          if (var7 != null &&
            (bw.unitDefinitions[var7.unitType][10] & 8) != 0) {
            stackIn_15_1 = 1;
          } else {
            stackIn_15_1 = 0;
          }
          var4Lifetime3 = stackIn_14_0 | stackIn_15_1;
          var8 = this.battlefield.getUnitAt(-1 + ((Unit) (var3)).tileY, true, ((Unit) (var3)).tileX);
          stackIn_18_0 = var4Lifetime3;
          if (var8 != null &&
            0 != (bw.unitDefinitions[var8.unitType][10] & 8)) {
            stackIn_19_1 = 1;
          } else {
            stackIn_19_1 = 0;
          }
          var4Lifetime4 = stackIn_18_0 | stackIn_19_1;
          if (var4Lifetime4 == 0) {
            this.battlefield.pendingEvents.a((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this, 3)));
          }
        }
        if (this.poisoned) {
          this.battlefield.pendingEvents.a((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this, 2)));
        }
        if (param0 != -42) {
          Unit.m(45);
        }
    }

    final int l(byte param0) {
        if (param0 != -79) {
          this.c((byte) -122);
        }
        int var2 = bw.unitDefinitions[this.unitType][6];
        if (this.packedFlag8 &&
          this.unitType == 34) {
          var2 = 2;
        }
        return var2;
    }

    final int j(int param0) {
        if (0 > this.field_r) {
          return -1;
        }
        if (param0 != 20640) {
          this.packedFlag64 = true;
        }
        return this.field_r >> 5;
    }

    final boolean i(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -21428) {
          return false;
        }
        stackIn_7_0 = !((512 & bw.unitDefinitions[this.unitType][10]) <= 0) || (this.field_ab == 1);
        return stackIn_7_0;
    }

    final int d(int param0, int param1) {
        if (0 > this.field_r) {
          return 0;
        }
        int var3 = 62 / ((-23 - param1) / 63);
        return np.field_Vb[this.field_r & 31][param0];
    }

    final int g(byte param0) {
        if (param0 != 122) {
          return 34;
        }
        return this.strength + this.field_A;
    }

    final boolean n(int param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 106 % ((80 - param0) / 34);
        stackIn_5_0 = !((bw.unitDefinitions[this.unitType][10] & 2048) <= 0) || (this.field_ab == 2);
        return stackIn_5_0;
    }

    final Unit replaceWithOwner(int newOwnerPlayer, int obfuscationGuard) {
        this.removeFromBattlefield(-97);
        if (obfuscationGuard != -1) {
          this.displayName = (String) null;
        }
        if (this.field_S) {
          return null;
        }
        if (this.strength + this.field_A == 0) {
          return null;
        }
        Unit var3 = new Unit(this.tileX, this.tileY, this.unitType, newOwnerPlayer, this.maximumStrength, this.strength, this.packStatusFlags((byte) 105), this.field_ab, this.field_A, this.battlefield, this.field_P, this.field_o, this.field_r, false, this.field_cb);
        this.battlefield.registerUnit(8288, var3);
        return var3;
    }

    final boolean p(int param0) {
        int var2;
        boolean stackIn_8_0 = false;
        var2 = -69 % ((3 - param0) / 46);
        stackIn_8_0 = (this.unitType == 58) || (this.unitType == 63) || (this.unitType == 59) || (this.unitType == 53) || (this.unitType == 43);
        return stackIn_8_0;
    }

    final int l(int param0) {
        int var2 = 0;
        if (!this.packedFlag4) {
          var2 = var2 | 1;
        }
        if (0 < this.packedLowFlags) {
          var2 = var2 | 2;
        }
        if (this.poisoned) {
          var2 = var2 | 4;
        }
        if (this.field_Z) {
          var2 = var2 | 8;
        }
        if (this.field_v) {
          var2 = var2 | 16;
        }
        if (this.field_eb) {
          var2 = var2 | 32;
        }
        if (this.packedFlag32) {
          var2 = var2 | 64;
        }
        if (this.packedFlag256) {
          var2 = var2 | 128;
        }
        if (this.packedFlag64) {
          var2 = var2 | 256;
        }
        if (param0 != -27014) {
          return 27;
        }
        if (-1 < this.field_r) {
          var2 = var2 | 512;
        }
        if (0 < this.field_o) {
          var2 = var2 | 1024;
        }
        if (this.field_ab != 0) {
          var2 = var2 | 2048;
        }
        if (this.field_cb > 0) {
          var2 = var2 | 4096;
        }
        return var2;
    }

    final boolean a(Unit param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.k((byte) 107)) {
            return false;
          }
          if (param0.packedFlag8 &&
            param0.unitType != 0) {
            return false;
          }
          if (param1 < 113) {
            this.field_z = -18;
          }
          stackIn_12_0 = !(this.field_A + this.strength < param0.strength + param0.field_A);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("jd.T(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void applyStrengthDamage(int damage, boolean updateAfterDamage) {
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_P != 7 &&
          this.field_P != 8) {
          this.strength = this.strength - damage;
        } else {
          if (this.field_o > 1) {
            this.field_o = this.field_o - 1;
          } else {
            this.field_P = 0;
          }
        }
        if (!updateAfterDamage) {
          return;
        }
        this.queueDeathOrRevival(22331);
    }

    final boolean j(byte param0) {
        int var2;
        boolean stackIn_11_0 = false;
        var2 = 31 % ((-9 - param0) / 61);
        if (this.unitType == 34 &&
          this.packedFlag8) {
          return true;
        }
        stackIn_11_0 = (bw.unitDefinitions[this.unitType][0] == 4) || (bw.unitDefinitions[this.unitType][0] == 3) || (bw.unitDefinitions[this.unitType][0] == 2) || !((2048 & bw.unitDefinitions[this.unitType][10]) <= 0) || (this.field_ab == 2);
        return stackIn_11_0;
    }

    final int D(int param0) {
        if (param0 > -63) {
          this.tileX = 66;
        }
        return this.field_k;
    }

    final static boolean i(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        boolean stackIn_6_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = va.field_w;
        synchronized (var1) {
          if (rd.field_d == be.field_E) {
            return false;
          }
          rs.field_q = gt.field_d[be.field_E];
          ui.field_i = ua.field_u[be.field_E];
          var2 = 86 % ((param0 - 0) / 48);
          be.field_E = 127 & be.field_E + 1;
          stackIn_6_0 = true;
        }
        return stackIn_6_0;
    }

    final void refreshForTurnChange(byte obfuscationGuard) {
        if (!this.poisoned &&
          !this.a(23072) &&
          this.maximumStrength > this.strength &&
          !this.packedFlag4 &&
          0 < this.packedLowFlags) {
          this.battlefield.pendingEvents.a((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this, 1)));
        }
        if (0 < this.field_cb) {
          this.field_cb = this.field_cb - 1;
        }
        if (obfuscationGuard != -36) {
          this.field_x = (hr) null;
        }
        if (this.field_cb != 0) {
        } else {
          if (!this.h(obfuscationGuard - 13458)) {
            this.packedFlag4 = false;
          } else {
            this.packedFlag4 = true;
          }
          this.packedLowFlags = 1;
          this.packedFlag512 = false;
          if (74 == this.unitType) {
            this.packedLowFlags = 2;
          }
        }
    }

    final boolean f(byte param0) {
        if (param0 >= -99) {
          return true;
        }
        return 0 < (8 & bw.unitDefinitions[this.unitType][10]) ? true : false;
    }

    final String q(byte param0) {
        if (param0 <= 37) {
          this.b(true);
        }
        String var2 = new String(this.displayName);
        if (this.hasMovementFlag1(false)) {
          var2 = var2 + " " + og.field_r;
        }
        if (this.u(8)) {
          var2 = var2 + " " + fa.field_f;
        }
        return var2;
    }

    final boolean t(int param0) {
        if (param0 != 26440) {
          return true;
        }
        return this != this.battlefield.tiles[this.battlefield.mapWidth * this.tileY + this.tileX].occupant ? true : false;
    }

    final void z(int param0) {
        if (null != this.field_x) {
          if (this.unitType == 34) {
            this.field_x.a((byte) 115, 75);
          }
          if (this.unitType == 7) {
            this.field_x.a((byte) 77, 76);
          }
          this.field_x.a(-23162, 0);
        }
        if (param0 != 10) {
          this.field_R = (int[]) null;
        }
    }

    final boolean o(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 98) {
          this.o(-50);
        }
        stackIn_7_0 = (this.unitType == 73) || (this.field_ab == 4);
        return stackIn_7_0;
    }

    final void e(int param0, int param1) {
        if (param1 > -1 &&
          param1 < 2048) {
          this.field_fb = param1;
        }
        if (this.field_x != null) {
          this.field_x.a(false, param1);
        }
        int var3 = 114 / ((-56 - param0) / 54);
    }

    public static void q(int param0) {
        field_T = null;
        field_n = null;
        if (param0 != -9480) {
          field_n = (String) null;
        }
        field_y = null;
    }

    final void removeFromBattlefield(int obfuscationGuard) {
        this.battlefield.tiles[this.battlefield.mapWidth * this.tileY + this.tileX].occupant = null;
        this.unlink(-100);
        this.battlefield.a(this.tileY, this.tileX, 0, 3);
        if (obfuscationGuard > -82) {
          field_y = (String) null;
        }
    }

    final boolean a(int param0) {
        boolean stackIn_4_0 = false;
        boolean stackIn_5_1 = false;
        boolean stackIn_9_0 = false;
        if (param0 != 23072) {
          this.field_o = -127;
        }
        stackIn_4_0 = this.packedFlag64;
        stackIn_5_1 = ((256 & bw.unitDefinitions[this.unitType][10]) <= 0) ? false : true;
        stackIn_9_0 = (stackIn_4_0 | stackIn_5_1) && (!this.hasMovementFlag1(false));
        return stackIn_9_0;
    }

    public final void decodeTaggedField(int encodedLength, CipherPacketBuffer packet, String fieldName, byte obfuscationGuard) {
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 37) {
            this.packedFlag32 = false;
          }
          if (fieldName.equals("c")) {
            if (encodedLength <= 0) {
              return;
            }
            this.unitType = (int)tn.a(false, encodedLength, packet);
          } else {
            if (fieldName.equals("o")) {
              if (encodedLength <= 0) {
                return;
              }
              this.ownerPlayer = (int)tn.a(false, encodedLength, packet);
              return;
            }
            if (fieldName.equals("str")) {
              if (encodedLength > 0) {
                this.strength = (int)tn.a(false, encodedLength, packet);
                return;
              }
            } else {
              if (fieldName.equals("max")) {
                if (encodedLength <= 0) {
                  return;
                }
                this.maximumStrength = (int)tn.a(false, encodedLength, packet);
                return;
              }
              if (fieldName.equals("x")) {
                if (0 >= encodedLength) {
                  return;
                }
                this.tileX = (int)tn.a(false, encodedLength, packet);
                return;
              }
              if (!fieldName.equals("y")) {
                if (fieldName.equals("mf")) {
                  if (encodedLength > 0) {
                    this.movementFlags = (int)tn.a(false, encodedLength, packet);
                    return;
                  }
                } else {
                  if (fieldName.equals("nm")) {
                    if (0 >= encodedLength) {
                      return;
                    }
                    this.displayName = up.a(packet, encodedLength, (byte) -122);
                    return;
                  }
                  if (fieldName.equals("tag")) {
                    if (encodedLength <= 0) {
                      return;
                    }
                    this.tag = (int)tn.a(false, encodedLength, packet);
                    return;
                  }
                  if (fieldName.equals("obj")) {
                    if (encodedLength <= 0) {
                      return;
                    }
                    this.objectiveId = (int)tn.a(false, encodedLength, packet);
                    return;
                  }
                  if (fieldName.equals("tnk")) {
                    if (encodedLength <= 0) {
                      return;
                    }
                    this.tankId = (int)tn.a(false, encodedLength, packet);
                    return;
                  }
                }
              } else {
                if (encodedLength > 0) {
                  this.tileY = (int)tn.a(false, encodedLength, packet);
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_47_0 = var5;
          stackIn_47_1 = new StringBuilder().append("jd.B(").append(encodedLength).append(',');
          if (packet == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (fieldName == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void queueDeathOrRevival(int obfuscationGuard) {
        int var2 = 0;
        if (obfuscationGuard != 22331) {
          this.objectiveId = 111;
        }
        if (this.field_S) {
          return;
        }
        if (this.g((byte) 122) < 1) {
          this.field_S = true;
          var2 = -1;
          if (this.field_ab == 5) {
            var2 = this.battlefield.a(this.tileY, this.ownerPlayer, this.tileX, (byte) -53);
          }
          if (var2 > -1) {
            this.battlefield.tiles[var2].field_l = true;
            this.battlefield.pendingEvents.a(750, new RevivalEvent(this, var2 % this.battlefield.mapWidth, var2 / this.battlefield.mapWidth));
          } else {
            this.battlefield.pendingEvents.a(750, new DeathEvent(this));
          }
        }
    }

    final boolean h(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -13494) {
          return false;
        }
        stackIn_6_0 = (34 == this.unitType) && (this.packedFlag8);
        return stackIn_6_0;
    }

    final void a(boolean param0, byte param1) {
        MapTile var3;
        int var4;
        int var5;
        MapTile var6;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.strength = 0;
        this.field_S = true;
        this.field_A = 0;
        var6 = this.battlefield.tiles[this.tileX + this.battlefield.mapWidth * this.tileY];
        var3 = var6;
        var3.field_m = var6.e(10);
        if (0 == this.unitType &&
          !this.packedFlag8) {
        }
        var4 = this.unitType;
        switch (var4) {
          case 53:
            this.battlefield.a(this.tileY, this.tileX, 0, 1);
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          case 59:
            this.battlefield.a(this.tileY, this.tileX, 0, 1);
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          default:
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          case 63:
            this.battlefield.a(this.tileY, this.tileX, 0, 1);
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          case 43:
          case 58:
            this.battlefield.a(this.tileY, this.tileX, 0, 1);
            if (!this.v(10) &&
              param0) {
              var6.a(106);
            }
            break;
        }
        if (this == var6.occupant) {
          var3.occupant = null;
        }
        this.unlink(39);
        if (param1 != 105) {
          this.field_X = false;
        }
        this.battlefield.a(this.tileY, this.tileX, 0, 3);
        if (this.hasMovementFlag1(false)) {
          this.battlefield.a((byte) 89, this.ownerPlayer);
        }
        if (this.battlefield.field_b) {
          this.battlefield.field_h[this.ownerPlayer] = this.battlefield.field_h[this.ownerPlayer] + 1;
        }
        this.battlefield.b(this.ownerPlayer, true);
    }

    final boolean s(int param0) {
        if (param0 < 123) {
          this.k((byte) -126);
        }
        return (32 & bw.unitDefinitions[this.unitType][10]) > 0 ? true : false;
    }

    final boolean o(int param0) {
        boolean stackIn_9_0 = false;
        if (this.field_db == this.tileX &&
          this.field_k == this.tileY) {
          this.A(-1);
        }
        if (param0 != -28467) {
          this.packedFlag8 = false;
        }
        stackIn_9_0 = (this.field_db != -1) && (this.field_k != -1);
        return stackIn_9_0;
    }

    final int g(int param0) {
        if (param0 != 0) {
          this.o(82);
        }
        return bw.unitDefinitions[this.unitType][0];
    }

    final int c(byte param0) {
        if (param0 != 81) {
          this.g((byte) -105);
        }
        if (0 > this.field_r) {
          return 0;
        }
        return 31 & this.field_r;
    }

    final boolean y(int param0) {
        if (param0 > -92) {
          this.field_A = -12;
        }
        return (64 & bw.unitDefinitions[this.unitType][10]) > 0 ? true : false;
    }

    final Unit b(boolean param0) {
        if (param0) {
          return (Unit) null;
        }
        return new Unit(this.tileX, this.tileY, this.unitType, this.ownerPlayer, this.maximumStrength, this.strength, this.packStatusFlags((byte) 110), this.field_ab, this.field_A, this.battlefield, this.field_P, this.field_o, this.field_r, true, this.field_cb);
    }

    final int f(int param0) {
        if (this.unitType == 34 &&
          !this.packedFlag8) {
          return 0;
        }
        if (this.unitType == 39) {
          return 2;
        }
        if (param0 != 16) {
          this.tankId = -22;
        }
        if (this.unitType == 17) {
          return 1;
        }
        if (this.unitType == 72) {
          return 3;
        }
        if (7 == this.unitType &&
          !this.packedFlag8) {
          return 4;
        }
        return -1;
    }

    final void a(Unit param0, int param1) {
        if (this.tileX == param0.tileX &&
          this.tileY == param0.tileY) {
          return;
        }
        try {
          this.e(param1 ^ 2079, 256 + (param1 - (int)(2048.0 * Math.atan2((double)(-(this.tileY - param0.tileY)), (double)(this.tileX - param0.tileX)) / 3.141592653589793 / 2.0)) & 2047);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "jd.HB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean u(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 8) {
          Unit.i((byte) 14);
        }
        stackIn_6_0 = (0 != (this.movementFlags & 8)) && (this.strength >= this.maximumStrength);
        return stackIn_6_0;
    }

    final boolean x(int param0) {
        if (param0 >= -80) {
          Unit var3 = (Unit) null;
          this.a((Unit) null, -117);
        }
        return 4 == this.g(0) ? true : false;
    }

    final boolean r(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 <= 41) {
          return false;
        }
        stackIn_7_0 = (0 != (bw.unitDefinitions[this.unitType][10] & 4096)) || (this.field_ab == 3);
        return stackIn_7_0;
    }

    final void k(int param0) {
        if (this.e((byte) 102)) {
          this.battlefield.pendingEvents.a((byte) -119, (IntrusiveNode) (new UpkeepEvent(this.tileX, this.tileY)));
        }
        if (this.p((byte) -128)) {
          this.battlefield.pendingEvents.a((byte) -119, (IntrusiveNode) (new StateChangeEvent(2, this.tileX, this.tileY, this.ownerPlayer)));
        }
        if (this.d((byte) 105)) {
          this.battlefield.pendingEvents.a((byte) -119, (IntrusiveNode) (new StateChangeEvent(3, this.tileX, this.tileY, this.ownerPlayer)));
        }
        if (this.f((byte) -116)) {
          this.battlefield.pendingEvents.a((byte) -119, (IntrusiveNode) (new StateChangeEvent(1, this.tileX, this.tileY, this.ownerPlayer)));
        }
        if (param0 != -1) {
          return;
        }
        if (this.s(124)) {
          this.battlefield.pendingEvents.a((byte) -119, (IntrusiveNode) (new StateChangeEvent(4, this.tileX, this.tileY, this.ownerPlayer)));
        }
        if (this.t(26440)) {
          this.battlefield.pendingEvents.a((byte) -119, (IntrusiveNode) (new TelefragEvent(this)));
        }
    }

    final int B(int param0) {
        int var2;
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = bw.unitDefinitions[this.unitType][7];
        if (this.packedFlag8 &&
          this.unitType == 34) {
          var2 = 7;
          if (this.j(20640) == 3) {
            var2 = var2 + this.d(1, -93);
          }
        }
        if ((this.unitType == 81 ||
          this.unitType == 4 ||
          this.unitType == 74) &&
          3 == this.j(20640)) {
          var2 = var2 + this.d(1, 83);
        } else if (3 == this.g(param0 - 3257) &&
          this.j(20640) == 2) {
          var2 = var2 + this.d(1, param0 - 3158);
        } else {
          if (this.g(0) == 2 &&
            this.j(20640) == 1) {
            var2 = var2 + this.d(1, 88);
          }
        }
        if (param0 == 3257) {
          return var2;
        }
        return 117;
    }

    private final boolean v(int param0) {
        if (param0 != 10) {
          this.field_u = true;
        }
        return (bw.unitDefinitions[this.unitType][10] & 1) > 0 ? true : false;
    }

    final boolean r(int param0) {
        if (param0 != -40) {
          return true;
        }
        return this.unitType != 39 ? true : false;
    }

    final void A(int param0) {
        this.field_db = param0;
        this.field_k = -1;
    }

    final boolean d(byte param0) {
        if (param0 != 105) {
          return true;
        }
        return (bw.unitDefinitions[this.unitType][10] & 16) > 0 ? true : false;
    }

    final static void m(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var8 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var1Lifetime1;
        int[] var1Lifetime2;
        int[] var1Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!io.a(rq.field_n, (byte) 108)) {
            return;
          }
          if (!OwnerChangeEvent.field_B) {
            return;
          }
          var17 = rq.field_n;
          var13 = var17;
          var6 = var13;
          var1 = var6;
          var24 = ei.field_e;
          for (var3 = 0; var3 < 8; var3++) {
            var6[var3] = rn.a(var17[var3], ~var24[var3]);
          }
          for (var1_int = 0; var1_int < so.field_a.length; var1_int++) {
            if (rb.a(var1_int, rq.field_n, 1)) {
              ai.field_P.a((byte) -119, (IntrusiveNode) (new jg(var1_int)));
            }
          }
          var18 = ei.field_e;
          var14 = var18;
          var8 = var14;
          var1Lifetime1 = var8;
          var25 = rq.field_n;
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            var8[var3Lifetime1] = oe.c(var18[var3Lifetime1], var25[var3Lifetime1]);
          }
          var19 = i.field_Nb;
          var15 = var19;
          var10 = var15;
          var1Lifetime2 = var10;
          var26 = rq.field_n;
          var3Lifetime2 = 0;
          var4 = 124 % ((-63 - param0) / 63);
          while (var3Lifetime2 < 8) {
            var10[var3Lifetime2] = oe.c(var19[var3Lifetime2], var26[var3Lifetime2]);
            var3Lifetime2++;
          }
          var20 = rq.field_n;
          var16 = var20;
          var12 = var16;
          var1Lifetime3 = var12;
          for (var2 = 0; var2 < 8; var2++) {
            var20[var2] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "jd.VA(" + param0 + ')');
        }
    }

    final void refreshTileEffects(byte obfuscationGuard) {
        int var2 = 8 / ((19 - obfuscationGuard) / 34);
        this.battlefield.a(this, -97);
    }

    Unit(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, Battlefield param9, int param10, int param11, int param12, boolean param13, int param14) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        boolean stackIn_22_1 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.tag = 0;
        this.tankId = -1;
        this.field_k = -1;
        this.field_db = -1;
        this.objectiveId = 0;
        this.field_S = false;
        this.field_G = false;
        try {
          this.tileX = param0;
          this.field_A = param8;
          stackIn_4_1 = ((param6 & 64) != 0);
          this.packedFlag64 = stackIn_4_1;
          this.packedLowFlags = 3 & param6;
          stackIn_7_1 = ((256 & param6) != 0);
          this.packedFlag256 = stackIn_7_1;
          this.field_r = param12;
          stackIn_10_1 = ((param6 & 4) != 0);
          this.packedFlag4 = stackIn_10_1;
          this.battlefield = param9;
          this.field_m = 0;
          this.maximumStrength = param4;
          this.field_M = 0;
          this.field_cb = param14;
          this.unitType = param2;
          this.field_ab = param7;
          stackIn_13_1 = (0 != (param6 & 8));
          this.packedFlag8 = stackIn_13_1;
          stackIn_16_1 = ((512 & param6) != 0);
          this.packedFlag512 = stackIn_16_1;
          this.ownerPlayer = param3;
          stackIn_19_1 = (0 != (param6 & 32));
          this.packedFlag32 = stackIn_19_1;
          this.strength = param5;
          stackIn_22_1 = ((16 & param6) != 0);
          this.poisoned = stackIn_22_1;
          this.field_o = param11;
          this.field_P = param10;
          this.tileY = param1;
          if (!param13) {
            param9.tiles[param0 + param9.mapWidth * param1].occupant = this;
            this.refreshTileEffects((byte) -122);
          }
          this.field_z = -1;
          this.field_R = new int[3];
          this.field_fb = 1792;
          if (0 == this.unitType &&
            this.packedFlag8) {
            this.displayName = ov.field_a;
            return;
          }
          if (this.unitType < dn.field_Pb.length) {
            this.displayName = dn.field_Pb[this.unitType];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_32_0 = var16;
          stackIn_32_1 = new StringBuilder().append("jd.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    Unit() {
        this.tag = 0;
        this.tankId = -1;
        this.field_k = -1;
        this.field_db = -1;
        this.objectiveId = 0;
        this.field_S = false;
        this.field_G = false;
    }

    Unit(int param0, int param1, int param2) {
        this.tag = 0;
        this.tankId = -1;
        this.field_k = -1;
        this.field_db = -1;
        this.objectiveId = 0;
        this.field_S = false;
        this.field_G = false;
        this.tileY = param1;
        this.tileX = param0;
        this.unitType = param2;
    }

    static {
        field_n = "Resizable";
        field_y = "Level:<nbsp><col=ff0000><%0></col>  Speed:<nbsp><col=ff0000><%1></col>  Strength:<nbsp><col=ff0000><%2></col>  Range:<nbsp><col=ff0000><%4></col>  Cost:<nbsp><col=ff0000><%5></col>";
        field_T = "This unit is already poisoned.";
    }
}
