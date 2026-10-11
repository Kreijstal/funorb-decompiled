/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MapTile implements TaggedFieldReader {
    int terrainType;
    private Battlefield battlefield;
    static dn field_f;
    Unit occupant;
    boolean field_b;
    int godId;
    boolean field_l;
    int ownerPlayer;
    int godFavourLevel;
    TileMetadata metadata;
    int[] teamEffectFlags;
    int captureStrength;
    static boolean[] field_e;
    static int field_i;

    public static void g(int param0) {
        field_f = null;
        if (param0 >= -19) {
          return;
        }
        field_e = null;
    }

    final static void a(hd param0, Object param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        aa var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == param0.field_j) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param0.field_j.peekEvent()) {
              nu.a(1L, 0);
              continue;
            }
            break;
          }
          try {
            if (null != param1) {
              param0.field_j.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          if (!param2) {
            var5 = (aa) null;
            MapTile.a(-21, (aa) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ne.T(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean hasModifierFlag4(byte obfuscationGuard) {
        boolean stackIn_6_0 = false;
        if (obfuscationGuard >= -114) {
          return false;
        }
        stackIn_6_0 = (this.metadata != null) && (0 != (4 & this.metadata.modifierFlags));
        return stackIn_6_0;
    }

    final boolean hasModifierFlag2(int obfuscationGuard) {
        boolean stackIn_6_0 = false;
        if (obfuscationGuard != -1) {
          this.field_l = false;
        }
        stackIn_6_0 = (this.metadata != null) && ((this.metadata.modifierFlags & 2) != 0);
        return stackIn_6_0;
    }

    public final void decodeTaggedField(int encodedLength, CipherPacketBuffer packet, String fieldName, byte obfuscationGuard) {
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (fieldName.equals("unit")) {
            if (encodedLength > 0) {
              this.occupant = a.a(encodedLength, 32, packet);
            }
          } else {
            if (fieldName.equals("own")) {
              if (encodedLength > 0) {
                this.ownerPlayer = (int)tn.a(false, encodedLength, packet);
              }
            } else {
              if (!fieldName.equals("type")) {
                if (fieldName.equals("mod") &&
                  encodedLength > 0) {
                  this.metadata = ui.a(packet, encodedLength, 80);
                }
              } else {
                if (encodedLength > 0) {
                  this.terrainType = (int)tn.a(false, encodedLength, packet);
                }
              }
            }
          }
          if (obfuscationGuard != 37) {
            this.occupant = (Unit) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ne.B(").append(encodedLength).append(',');
          if (packet == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (fieldName == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void setTag(boolean obfuscationGuard, int tag) {
        if (null == this.metadata) {
          this.metadata = new TileMetadata();
        }
        if (!obfuscationGuard) {
          return;
        }
        this.metadata.tag = tag;
    }

    final boolean hasModifierFlag1(int obfuscationGuard) {
        boolean stackIn_6_0 = false;
        if (obfuscationGuard != 12) {
          this.l(-61);
        }
        stackIn_6_0 = (this.metadata != null) && ((1 & this.metadata.modifierFlags) != 0);
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int stackIn_10_0 = 0;
        Battlefield stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        Battlefield stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        Battlefield stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        Battlefield stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_103_2 = 0;
        Battlefield stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_116_2 = 0;
        Battlefield stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        int stackIn_126_2 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var5Lifetime1;
        int var7Lifetime1;
        int var5Lifetime1Lifetime1;
        int var5Lifetime1Lifetime2;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.battlefield.campaignMission != null &&
          param2 != this.ownerPlayer) {
          return;
        }
        if (this.occupant != null) {
          stackIn_10_0 = (!this.battlefield.arePlayersAllied(this.occupant.ownerPlayer, -16985, param2)) ? 1 : 0;
        } else {
          stackIn_10_0 = 0;
        }
        var6 = stackIn_10_0;
        if (param3 > ~this.ownerPlayer) {
          var7 = this.terrainType;
          if (7 != var7) {
            if (var7 != 8) {
              if (var7 == 14 ||
                var7 == 9) {
                stackIn_29_0 = this.battlefield;
                stackIn_29_1 = param2;
                if (var6 != 0) {
                  stackIn_30_2 = 37;
                } else {
                  stackIn_30_2 = 75;
                }
                var5 = ((Battlefield) (Object) stackIn_29_0).d(stackIn_29_1, stackIn_30_2, 6);
                dupTemp$0 = this.battlefield.getPlayerTeamIndex(this.ownerPlayer, -1);
                this.battlefield.field_S[dupTemp$0] = this.battlefield.field_S[dupTemp$0] + 75;
              }
            } else {
              stackIn_25_0 = this.battlefield;
              stackIn_25_1 = param2;
              if (var6 != 0) {
                stackIn_26_2 = 12;
              } else {
                stackIn_26_2 = 25;
              }
              var5 = ((Battlefield) (Object) stackIn_25_0).d(stackIn_25_1, stackIn_26_2, 6);
              dupTemp$1 = this.battlefield.getPlayerTeamIndex(this.ownerPlayer, -1);
              this.battlefield.field_S[dupTemp$1] = this.battlefield.field_S[dupTemp$1] + 25;
            }
          } else {
            stackIn_21_0 = this.battlefield;
            stackIn_21_1 = param2;
            if (var6 != 0) {
              stackIn_22_2 = 25;
            } else {
              stackIn_22_2 = 50;
            }
            var5 = ((Battlefield) (Object) stackIn_21_0).d(stackIn_21_1, stackIn_22_2, 6);
            dupTemp$2 = this.battlefield.getPlayerTeamIndex(this.ownerPlayer, -1);
            this.battlefield.field_S[dupTemp$2] = this.battlefield.field_S[dupTemp$2] + 50;
          }
        }
        if (!this.battlefield.arePlayersAllied(this.ownerPlayer, -16985, param2)) {
          return;
        }
        if (!this.battlefield.field_F) {
          stackIn_39_0 = (param2 == this.battlefield.localPlayer) ? 1 : 0;
        } else {
          stackIn_39_0 = 1;
        }
        var7Lifetime1 = stackIn_39_0;
        if (this.occupant != null) {
          stackIn_45_0 = (this.battlefield.arePlayersAllied(this.occupant.ownerPlayer, -16985, this.ownerPlayer)) ? 1 : 0;
        } else {
          stackIn_45_0 = 0;
        }
        var8 = stackIn_45_0;
        if (this.occupant != null) {
          if (var8 != 0) {
            if (this.occupant.ownerPlayer != param2) {
              stackIn_55_0 = (null != this.battlefield.campaignMission) ? 0 : 1;
            } else {
              stackIn_55_0 = 0;
            }
          } else {
            stackIn_55_0 = 0;
          }
        } else {
          stackIn_55_0 = 0;
        }
        var9 = stackIn_55_0;
        if (this.occupant != null) {
          if (var8 != 0) {
            stackIn_62_0 = (this.occupant.maximumStrength <= this.occupant.strength) ? 0 : 1;
          } else {
            stackIn_62_0 = 0;
          }
        } else {
          stackIn_62_0 = 0;
        }
        var10 = stackIn_62_0;
        if (this.occupant != null) {
          if (var8 == 0) {
            if (this.ownerPlayer != -1) {
              stackIn_71_0 = (this.occupant.canCaptureStructures(-21428)) ? 0 : 1;
            } else {
              stackIn_71_0 = 0;
            }
          } else {
            stackIn_71_0 = 0;
          }
        } else {
          stackIn_71_0 = 0;
        }
        var11 = stackIn_71_0;
        if (this.occupant != null) {
          if (var8 != 0) {
            if (this.occupant.maximumStrength > this.occupant.strength) {
              stackIn_80_0 = (this.occupant.a(23072)) ? 0 : 1;
            } else {
              stackIn_80_0 = 0;
            }
          } else {
            stackIn_80_0 = 0;
          }
        } else {
          stackIn_80_0 = 0;
        }
        var12 = stackIn_80_0;
        var13 = this.terrainType;
        if (var13 != 11) {
          if (var13 == 7) {
            if (var10 != 0) {
              this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this.occupant, 1)));
              if (-1 + this.occupant.maximumStrength > this.occupant.strength) {
                this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this.occupant, 1)));
              }
              this.battlefield.e(14, param1, this.ownerPlayer, param0);
            }
            if (var11 != 0) {
              this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new DamageEvent(this.occupant, 3, false)));
            }
            if (var9 != 0) {
              this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new OwnerChangeEvent(this.occupant, param2, true)));
            }
            stackIn_102_0 = this.battlefield;
            stackIn_102_1 = param2;
            if (var6 == 0) {
              stackIn_103_2 = 50;
            } else {
              stackIn_103_2 = 25;
            }
            var5Lifetime1 = ((Battlefield) (Object) stackIn_102_0).d(stackIn_102_1, stackIn_103_2, 6);
            if (var7Lifetime1 != 0) {
              this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new ManaEvent(0, var5Lifetime1, param2)));
              return;
            }
            this.battlefield.playerMana[param2] = this.battlefield.playerMana[param2] + var5Lifetime1;
            if (1000000000 < this.battlefield.playerMana[param2]) {
              this.battlefield.playerMana[param2] = 1000000000;
            }
            dupTemp$3 = this.battlefield.getPlayerTeamIndex(param2, -1);
            this.battlefield.teamManaCollected[dupTemp$3] = this.battlefield.teamManaCollected[dupTemp$3] + var5Lifetime1;
            if (this.battlefield.teamManaCollected[this.battlefield.getPlayerTeamIndex(param2, -1)] <= 1000000000) {
              return;
            }
            this.battlefield.teamManaCollected[this.battlefield.getPlayerTeamIndex(param2, -1)] = 1000000000;
            return;
          }
          if (var13 == 8) {
            if (var12 != 0) {
              this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this.occupant, 1)));
              this.battlefield.e(14, param1, this.ownerPlayer, param0);
            }
            stackIn_115_0 = this.battlefield;
            stackIn_115_1 = param2;
            if (var6 == 0) {
              stackIn_116_2 = 25;
            } else {
              stackIn_116_2 = 12;
            }
            var5Lifetime1Lifetime1 = ((Battlefield) (Object) stackIn_115_0).d(stackIn_115_1, stackIn_116_2, param3 ^ 6);
            if (var7Lifetime1 != 0) {
              this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new ManaEvent(2, var5Lifetime1Lifetime1, param2)));
              return;
            }
            this.battlefield.playerMana[param2] = this.battlefield.playerMana[param2] + var5Lifetime1Lifetime1;
            dupTemp$4 = this.battlefield.getPlayerTeamIndex(param2, -1);
            this.battlefield.teamManaCollected[dupTemp$4] = this.battlefield.teamManaCollected[dupTemp$4] + var5Lifetime1Lifetime1;
            if (this.battlefield.teamManaCollected[this.battlefield.getPlayerTeamIndex(param2, -1)] <= 1000000000) {
              return;
            }
            this.battlefield.teamManaCollected[this.battlefield.getPlayerTeamIndex(param2, param3 - 1)] = 1000000000;
            return;
          }
          if (var13 != 14 &&
            var13 != 9) {
            return;
          }
          if (var12 != 0) {
            this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TurnEffectEvent(this.occupant, 1)));
            this.battlefield.e(param3 + 14, param1, this.ownerPlayer, param0);
          }
          stackIn_125_0 = this.battlefield;
          stackIn_125_1 = param2;
          if (var6 == 0) {
            stackIn_126_2 = 75;
          } else {
            stackIn_126_2 = 37;
          }
          var5Lifetime1Lifetime2 = ((Battlefield) (Object) stackIn_125_0).d(stackIn_125_1, stackIn_126_2, 6);
          if (var7Lifetime1 != 0) {
            this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new ManaEvent(1, var5Lifetime1Lifetime2, param2)));
            return;
          }
          this.battlefield.playerMana[param2] = this.battlefield.playerMana[param2] + var5Lifetime1Lifetime2;
          dupTemp$5 = this.battlefield.getPlayerTeamIndex(param2, -1);
          this.battlefield.teamManaCollected[dupTemp$5] = this.battlefield.teamManaCollected[dupTemp$5] + var5Lifetime1Lifetime2;
          if (this.battlefield.teamManaCollected[this.battlefield.getPlayerTeamIndex(param2, -1)] <= 1000000000) {
            return;
          }
          this.battlefield.teamManaCollected[this.battlefield.getPlayerTeamIndex(param2, -1)] = 1000000000;
        } else {
          if (var11 != 0) {
            this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new DamageEvent(this.occupant, 3, false)));
          }
          if (var9 != 0) {
            this.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new OwnerChangeEvent(this.occupant, param2, true)));
            return;
          }
        }
        return;
    }

    final int getExplicitOwner(byte obfuscationGuard) {
        if (!this.hasExplicitOwner((byte) -79)) {
          return -1;
        }
        if (obfuscationGuard > -19) {
          this.captureStrength = -105;
        }
        if (this.metadata.ownerPlayer == 255) {
          return -1;
        }
        return this.metadata.ownerPlayer;
    }

    final boolean isPortal(int obfuscationGuard) {
        boolean stackIn_7_0 = false;
        if (obfuscationGuard > -12) {
          this.godId = 34;
        }
        stackIn_7_0 = (this.terrainType == 11) || (7 == this.terrainType);
        return stackIn_7_0;
    }

    final String getDisplayName(byte obfuscationGuard) {
        String var2;
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = "";
        if (this.metadata != null &&
          this.metadata.displayName != null) {
          var2 = this.metadata.displayName;
        } else {
          if (jj.field_a.length > this.terrainType) {
            if (null != this.battlefield &&
              this.battlefield.mapTheme == 4) {
              var2 = dj.field_d[this.terrainType];
            } else {
              var2 = jj.field_a[this.terrainType];
            }
          }
        }
        if (this.hasModifierFlag4((byte) -120)) {
          var2 = var2 + " " + ce.field_P;
        }
        if (obfuscationGuard < 30) {
          this.ownerPlayer = -35;
        }
        return var2;
    }

    final boolean isStructure(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.ownerPlayer = -78;
        }
        return ck.isStructureTerrain(this.terrainType, -12);
    }

    private MapTile(int param0) {
        this();
        this.terrainType = param0;
        this.captureStrength = this.getDefaultCaptureStrength(10);
    }

    final void j(int param0) {
        int var2 = -2 % ((param0 - 5) / 44);
        if (this.terrainType == 11) {
          this.godId = this.metadata.godId;
        }
    }

    final void a(int param0) {
        if (null == this.metadata) {
          this.metadata = new TileMetadata();
        }
        if (param0 < 62) {
          return;
        }
        this.metadata.modifierFlags = this.metadata.modifierFlags | 8;
    }

    final int getDefaultCaptureStrength(int obfuscationGuard) {
        if (obfuscationGuard != 10) {
          return 18;
        }
        if (this.terrainType != 9 &&
          14 != this.terrainType) {
          return 10;
        }
        return 15;
    }

    final void a(byte param0, Battlefield param1) {
        String var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.battlefield = param1;
          if (param0 != -68) {
            var4 = (String) null;
            this.decodeTaggedField(-103, (CipherPacketBuffer) null, (String) null, (byte) 0);
          }
          if (param1 == null) {
            return;
          }
          this.teamEffectFlags = new int[this.battlefield.teamCount];
          if (this.occupant != null) {
            this.occupant.battlefield = this.battlefield;
            this.battlefield.registerUnit(8288, this.occupant);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ne.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean hasCorpse(int obfuscationGuard) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = 89 / ((20 - obfuscationGuard) / 41);
        stackIn_4_0 = (null != this.metadata) && (0 != (8 & this.metadata.modifierFlags));
        return stackIn_4_0;
    }

    final boolean l(int param0) {
        if (param0 != -1) {
          this.occupant = (Unit) null;
        }
        return this.captureStrength != this.getDefaultCaptureStrength(10) ? true : false;
    }

    final int getEffectsForPlayer(byte obfuscationGuard, int playerId, int teamIndex) {
        int effectFlags;
        int effectTeamIndex;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        effectFlags = 0;
        if (this.teamEffectFlags == null) {
          return 0;
        }
        effectTeamIndex = 0;
        if (obfuscationGuard != 97) {
          this.field_b = false;
        }
        while (this.teamEffectFlags.length > effectTeamIndex) {
          if (playerId < 0) {
            effectFlags = effectFlags | this.teamEffectFlags[effectTeamIndex];
          } else {
            if (teamIndex == effectTeamIndex) {
              effectFlags = effectFlags | 16 & this.teamEffectFlags[effectTeamIndex];
            } else {
              effectFlags = effectFlags | 15 & this.teamEffectFlags[effectTeamIndex];
            }
          }
          effectTeamIndex++;
        }
        return effectFlags;
    }

    final boolean hasExplicitOwner(byte obfuscationGuard) {
        boolean stackIn_6_0 = false;
        if (obfuscationGuard != -79) {
          this.godFavourLevel = -3;
        }
        stackIn_6_0 = (this.metadata != null) && (0 != (16 & this.metadata.modifierFlags));
        return stackIn_6_0;
    }

    final void setExplicitOwner(boolean obfuscationGuard, int ownerPlayer) {
        if (this.metadata == null) {
          this.metadata = new TileMetadata();
        }
        if (!obfuscationGuard) {
          field_f = (dn) null;
        }
        this.metadata.ownerPlayer = ownerPlayer;
        this.metadata.modifierFlags = this.metadata.modifierFlags | 16;
    }

    final void d(byte param0) {
        if (param0 < 42) {
          this.a(13, -128, -104, -117);
        }
        this.metadata.modifierFlags = this.metadata.modifierFlags & -2;
    }

    final void clearCorpse(int obfuscationGuard) {
        if (this.metadata == null) {
          return;
        }
        this.metadata.modifierFlags = this.metadata.modifierFlags & -9;
        if (obfuscationGuard != 14) {
          this.godId = 118;
        }
    }

    final static te a(int param0, aa param1) {
        te var2 = null;
        RuntimeException var2_ref = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new te(param1, param1);
          bl.field_h.addLast((byte) -119, (IntrusiveNode) (var2));
          if (param0 > -35) {
            stackIn_2_0 = (te) null;
            return stackIn_2_0;
          }
          ig.field_n.a(param1);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("ne.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 928) {
          return false;
        }
        stackIn_7_0 = (3 == this.terrainType) || (this.terrainType == 2);
        return stackIn_7_0;
    }

    final int getTag(byte obfuscationGuard) {
        if (obfuscationGuard != -107) {
          this.godFavourLevel = -71;
        }
        if (this.metadata != null) {
          return this.metadata.tag;
        }
        return 0;
    }

    final boolean isAlliedToPlayer(int playerId, byte obfuscationGuard) {
        if (obfuscationGuard != 91) {
          this.field_l = true;
        }
        return this.battlefield.arePlayersAllied(this.ownerPlayer, obfuscationGuard - 17076, playerId);
    }

    final void a(int param0, int param1) {
        int var3 = -116 % ((-35 - param0) / 61);
        this.captureStrength = this.getDefaultCaptureStrength(10);
        if (this.terrainType != 11) {
          this.ownerPlayer = param1;
        } else {
          if (null != this.battlefield.campaignMission) {
            this.field_b = true;
          }
          this.ownerPlayer = -1;
          this.terrainType = 0;
        }
    }

    MapTile(int param0, Battlefield param1) {
        this(param0);
        try {
          this.a((byte) -68, param1);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ne.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 != 19725) {
          this.d((byte) -22);
        }
        return !this.isStructure(false) ? true : false;
    }

    MapTile() {
        this.field_l = false;
        this.field_b = false;
        this.ownerPlayer = -1;
        this.captureStrength = 10;
        this.occupant = null;
        this.godId = -1;
        this.ownerPlayer = -1;
        this.battlefield = null;
        this.godFavourLevel = 0;
        this.teamEffectFlags = null;
    }

    static {
        field_i = -1;
    }
}
