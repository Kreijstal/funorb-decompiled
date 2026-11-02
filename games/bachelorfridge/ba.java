/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends mv {
    private qf field_q;
    static String field_r;
    private BattleScreen field_p;
    private hba field_o;

    final static BattleUpdate a(PacketBuffer param0, byte param1) {
        SnowEvent stackIn_79_0 = null;
        SuperSpeedEvent stackIn_81_0 = null;
        SleepEvent stackIn_83_0 = null;
        ShieldEvent stackIn_85_0 = null;
        HailEvent stackIn_87_0 = null;
        RaiseEvent stackIn_89_0 = null;
        DiveBomberEvent stackIn_91_0 = null;
        MartyrEvent stackIn_93_0 = null;
        IncomingEvent stackIn_95_0 = null;
        SpiltMilkEvent stackIn_97_0 = null;
        DreamsEvent stackIn_99_0 = null;
        SlowAllEvent stackIn_101_0 = null;
        InsanoSauceEvent stackIn_103_0 = null;
        SuperSpeedAllEvent stackIn_105_0 = null;
        ShuffleEvent stackIn_107_0 = null;
        FloodEvent stackIn_109_0 = null;
        LevitateEvent stackIn_111_0 = null;
        FullHealEvent stackIn_113_0 = null;
        InvincibleEvent stackIn_115_0 = null;
        ClamsEvent stackIn_117_0 = null;
        DisableEvent stackIn_119_0 = null;
        FishRainEvent stackIn_121_0 = null;
        MassPoisonEvent stackIn_123_0 = null;
        ZombiesEvent stackIn_125_0 = null;
        FlyEvent stackIn_127_0 = null;
        TBomberEvent stackIn_129_0 = null;
        StickyEvent stackIn_131_0 = null;
        FlirtEvent stackIn_133_0 = null;
        HomingMissileEvent stackIn_135_0 = null;
        BananarangEvent stackIn_137_0 = null;
        StampedeEvent stackIn_139_0 = null;
        ScavengerEvent stackIn_142_0 = null;
        AttackUpAllEvent stackIn_144_0 = null;
        SauceOfFlameEvent stackIn_146_0 = null;
        SplitEvent stackIn_148_0 = null;
        CranberryEvent stackIn_150_0 = null;
        BuffVendorEvent stackIn_152_0 = null;
        HazmatEvent stackIn_154_0 = null;
        BagpipeEvent stackIn_156_0 = null;
        ResetEvent stackIn_158_0 = null;
        PetAttackEvent stackIn_160_0 = null;
        TeleportEvent stackIn_162_0 = null;
        AirstrikeEvent stackIn_164_0 = null;
        PizzaPartyEvent stackIn_166_0 = null;
        OhNoEvent stackIn_168_0 = null;
        RefreshingEvent stackIn_170_0 = null;
        RageEvent stackIn_172_0 = null;
        GasCloudEvent stackIn_174_0 = null;
        OneEvent stackIn_176_0 = null;
        ew stackIn_178_0 = null;
        RuntimeException stackIn_182_0 = null;
        StringBuilder stackIn_182_1 = null;
        String stackIn_183_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        try {
          var2_int = param0.readUnsignedShort((byte) 81);
          param0.position = param0.position - 2;
          if (param1 < 118) {
            field_r = (String) null;
          }
          var3 = var2_int;
          if (var3 == 88) {
            stackIn_79_0 = new SnowEvent(param0);
            return (BattleUpdate) ((Object) stackIn_79_0);
          }
          if (89 == var3) {
            stackIn_81_0 = new SuperSpeedEvent(param0);
            return (BattleUpdate) ((Object) stackIn_81_0);
          }
          if (var3 == 90) {
            stackIn_83_0 = new SleepEvent(param0);
            return (BattleUpdate) ((Object) stackIn_83_0);
          }
          if (91 == var3) {
            stackIn_85_0 = new ShieldEvent(param0);
            return (BattleUpdate) ((Object) stackIn_85_0);
          }
          if (var3 == 92) {
            stackIn_87_0 = new HailEvent(param0);
            return (BattleUpdate) ((Object) stackIn_87_0);
          }
          if (93 == var3) {
            stackIn_89_0 = new RaiseEvent(param0);
            return (BattleUpdate) ((Object) stackIn_89_0);
          }
          if (94 == var3) {
            stackIn_91_0 = new DiveBomberEvent(param0);
            return (BattleUpdate) ((Object) stackIn_91_0);
          }
          if (var3 == 95) {
            stackIn_93_0 = new MartyrEvent(param0);
            return (BattleUpdate) ((Object) stackIn_93_0);
          }
          if (96 == var3) {
            stackIn_95_0 = new IncomingEvent(param0);
            return (BattleUpdate) ((Object) stackIn_95_0);
          }
          if (var3 == 97) {
            stackIn_97_0 = new SpiltMilkEvent(param0);
            return (BattleUpdate) ((Object) stackIn_97_0);
          }
          if (var3 == 98) {
            stackIn_99_0 = new DreamsEvent(param0);
            return (BattleUpdate) ((Object) stackIn_99_0);
          }
          if (var3 == 99) {
            stackIn_101_0 = new SlowAllEvent(param0);
            return (BattleUpdate) ((Object) stackIn_101_0);
          }
          if (100 == var3) {
            stackIn_103_0 = new InsanoSauceEvent(param0);
            return (BattleUpdate) ((Object) stackIn_103_0);
          }
          if (var3 == 101) {
            stackIn_105_0 = new SuperSpeedAllEvent(param0);
            return (BattleUpdate) ((Object) stackIn_105_0);
          }
          if (var3 == 102) {
            stackIn_107_0 = new ShuffleEvent(param0);
            return (BattleUpdate) ((Object) stackIn_107_0);
          }
          if (103 == var3) {
            stackIn_109_0 = new FloodEvent(param0);
            return (BattleUpdate) ((Object) stackIn_109_0);
          }
          if (var3 == 104) {
            stackIn_111_0 = new LevitateEvent(param0);
            return (BattleUpdate) ((Object) stackIn_111_0);
          }
          if (var3 == 105) {
            stackIn_113_0 = new FullHealEvent(param0);
            return (BattleUpdate) ((Object) stackIn_113_0);
          }
          if (var3 == 106) {
            stackIn_115_0 = new InvincibleEvent(param0);
            return (BattleUpdate) ((Object) stackIn_115_0);
          }
          if (107 == var3) {
            stackIn_117_0 = new ClamsEvent(param0);
            return (BattleUpdate) ((Object) stackIn_117_0);
          }
          if (var3 == 108) {
            stackIn_119_0 = new DisableEvent(param0);
            return (BattleUpdate) ((Object) stackIn_119_0);
          }
          if (var3 == 109) {
            stackIn_121_0 = new FishRainEvent(param0);
            return (BattleUpdate) ((Object) stackIn_121_0);
          }
          if (var3 == 110) {
            stackIn_123_0 = new MassPoisonEvent(param0);
            return (BattleUpdate) ((Object) stackIn_123_0);
          }
          if (var3 == 111) {
            stackIn_125_0 = new ZombiesEvent(param0);
            return (BattleUpdate) ((Object) stackIn_125_0);
          }
          if (var3 == 112) {
            stackIn_127_0 = new FlyEvent(param0);
            return (BattleUpdate) ((Object) stackIn_127_0);
          }
          if (var3 == 113) {
            stackIn_129_0 = new TBomberEvent(param0);
            return (BattleUpdate) ((Object) stackIn_129_0);
          }
          if (var3 == 114) {
            stackIn_131_0 = new StickyEvent(param0);
            return (BattleUpdate) ((Object) stackIn_131_0);
          }
          if (var3 == 115) {
            stackIn_133_0 = new FlirtEvent(param0);
            return (BattleUpdate) ((Object) stackIn_133_0);
          }
          if (var3 == 116) {
            stackIn_135_0 = new HomingMissileEvent(param0);
            return (BattleUpdate) ((Object) stackIn_135_0);
          }
          if (117 == var3) {
            stackIn_137_0 = new BananarangEvent(param0);
            return (BattleUpdate) ((Object) stackIn_137_0);
          }
          if (var3 == 118) {
            stackIn_139_0 = new StampedeEvent(param0);
            return (BattleUpdate) ((Object) stackIn_139_0);
          }
          if (var3 == 119) {
            throw new IllegalStateException("");
          }
          if (var3 == 120) {
            stackIn_142_0 = new ScavengerEvent(param0);
            return (BattleUpdate) ((Object) stackIn_142_0);
          }
          if (121 == var3) {
            stackIn_144_0 = new AttackUpAllEvent(param0);
            return (BattleUpdate) ((Object) stackIn_144_0);
          }
          if (122 == var3) {
            stackIn_146_0 = new SauceOfFlameEvent(param0);
            return (BattleUpdate) ((Object) stackIn_146_0);
          }
          if (var3 == 123) {
            stackIn_148_0 = new SplitEvent(param0);
            return (BattleUpdate) ((Object) stackIn_148_0);
          }
          if (var3 == 124) {
            stackIn_150_0 = new CranberryEvent(param0);
            return (BattleUpdate) ((Object) stackIn_150_0);
          }
          if (125 == var3) {
            stackIn_152_0 = new BuffVendorEvent(param0);
            return (BattleUpdate) ((Object) stackIn_152_0);
          }
          if (var3 == 126) {
            stackIn_154_0 = new HazmatEvent(param0);
            return (BattleUpdate) ((Object) stackIn_154_0);
          }
          if (127 == var3) {
            stackIn_156_0 = new BagpipeEvent(param0);
            return (BattleUpdate) ((Object) stackIn_156_0);
          }
          if (var3 == 128) {
            stackIn_158_0 = new ResetEvent(param0);
            return (BattleUpdate) ((Object) stackIn_158_0);
          }
          if (129 == var3) {
            stackIn_160_0 = new PetAttackEvent(param0);
            return (BattleUpdate) ((Object) stackIn_160_0);
          }
          if (130 == var3) {
            stackIn_162_0 = new TeleportEvent(param0);
            return (BattleUpdate) ((Object) stackIn_162_0);
          }
          if (131 == var3) {
            stackIn_164_0 = new AirstrikeEvent(param0);
            return (BattleUpdate) ((Object) stackIn_164_0);
          }
          if (132 == var3) {
            stackIn_166_0 = new PizzaPartyEvent(param0);
            return (BattleUpdate) ((Object) stackIn_166_0);
          }
          if (var3 == 133) {
            stackIn_168_0 = new OhNoEvent(param0);
            return (BattleUpdate) ((Object) stackIn_168_0);
          }
          if (var3 == 134) {
            stackIn_170_0 = new RefreshingEvent(param0);
            return (BattleUpdate) ((Object) stackIn_170_0);
          }
          if (var3 == 135) {
            stackIn_172_0 = new RageEvent(param0);
            return (BattleUpdate) ((Object) stackIn_172_0);
          }
          if (var3 == 136) {
            stackIn_174_0 = new GasCloudEvent(param0);
            return (BattleUpdate) ((Object) stackIn_174_0);
          }
          if (var3 == 137) {
            stackIn_176_0 = new OneEvent(param0);
            return (BattleUpdate) ((Object) stackIn_176_0);
          }
          if (var3 != 1023) {
            throw new IllegalArgumentException("Special not found");
          }
          stackIn_178_0 = new ew(param0);
          return (BattleUpdate) ((Object) stackIn_178_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_182_0 = var2;
          stackIn_182_1 = new StringBuilder().append("ba.C(");
          if (param0 == null) {
            stackIn_183_2 = "null";
          } else {
            stackIn_183_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_182_0), ((StringBuilder) (Object) stackIn_182_1).append(stackIn_183_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, byte param14, int param15) {
        int var16;
        int var17;
        var17 = BachelorFridge.field_y;
        if (param7 <= param1) {
          if (param11 > param1) {
            IncomingSpecial.a(param4, param15, param10, param7, param11, param2, param0, SoftwareRasterizer.field_e, (byte) -68, param1, param6, param3, param9, param12, param13, param5, param8);
          } else {
            if (param11 <= param7) {
              IncomingSpecial.a(param3, param8, param5, param11, param1, param4, param13, SoftwareRasterizer.field_e, (byte) -68, param7, param15, param2, param10, param0, param12, param9, param6);
            } else {
              IncomingSpecial.a(param2, param8, param9, param7, param1, param4, param13, SoftwareRasterizer.field_e, (byte) -68, param11, param6, param3, param10, param12, param0, param5, param15);
            }
          }
        } else {
          if (param7 < param11) {
            IncomingSpecial.a(param3, param15, param5, param1, param11, param2, param0, SoftwareRasterizer.field_e, (byte) -68, param7, param8, param4, param9, param13, param12, param10, param6);
          } else {
            if (param1 < param11) {
              IncomingSpecial.a(param2, param6, param9, param1, param7, param3, param12, SoftwareRasterizer.field_e, (byte) -68, param11, param8, param4, param5, param13, param0, param10, param15);
            } else {
              IncomingSpecial.a(param4, param6, param10, param11, param7, param3, param12, SoftwareRasterizer.field_e, (byte) -68, param1, param15, param2, param5, param0, param13, param9, param8);
            }
          }
        }
        var16 = -13 / ((-38 - param14) / 38);
    }

    public static void releaseStatics(byte param0) {
        field_r = null;
        if (param0 != -45) {
          field_r = (String) null;
        }
    }

    ba(BattleScreen param0, hba param1) {
        super(param0, param1);
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        CreatureActor var5 = null;
        try {
          this.field_o = param1;
          this.field_p = param0;
          var5 = this.field_o.creature.a(-27449, this.field_p);
          if (var5.field_s.isDown(-102)) {
            return;
          }
          var5.field_s.d(this.field_o.moveId, (byte) -87);
          this.field_j = 25;
          if (this.field_o.field_r) {
            var5.a(16777152, 54, m.field_c);
          } else {
            if (this.field_o.field_n) {
              var5.a(16761024, 89, dc.field_o);
            } else {
              if (!this.field_o.field_t) {
                al.a(-115, this.field_o.moveId);
                this.f(-109);
                this.field_j = 50;
                this.field_q = new qf(this.field_p, this.field_o.creature, this.field_o.moveId, this.field_o.field_q, this.field_o.field_w, false);
                this.addChild(27799, this.field_q);
              } else {
                var5.a(16761024, 41, MoveCreatureEffect.field_j);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ba.<init>(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void d(int param0) {
        if (param0 <= 16) {
          this.isFinished((byte) -100);
        }
    }

    final boolean isFinished(byte param0) {
        int var3;
        BasicMoveDefinition var4;
        BattleCreature var5;
        int var6;
        CreatureActor var7;
        var6 = BachelorFridge.field_y;
        var3 = -16 / ((71 - param0) / 47);
        var7 = this.field_o.creature.a(-27449, this.field_p);
        var4 = (BasicMoveDefinition) (al.a(-108, this.field_o.moveId));
        if (this.field_j == 25 &&
          !this.field_o.field_r &&
          !this.field_o.field_n &&
          !this.field_o.field_t) {
          var7.b(-1, var4.field_o);
        }
        var5 = this.field_o.creature.a(124, this.field_p.field_h);
        this.field_p.field_s.a((byte) -57, var5.tileY, var5.tileX);
        int fieldTemp$0 = this.field_j - 1;
        this.field_j = this.field_j - 1;
        if (fieldTemp$0 < 0) {
          this.d(114);
          return true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (1 == this.field_j) {
          if (null != this.field_q &&
            !this.field_q.d((byte) -128)) {
            this.field_j = 2;
          } else {
            this.d((byte) -124);
            mk.a(var4.field_n, -88);
            if (41 != this.field_o.moveId &&
              42 != this.field_o.moveId &&
              this.field_o.moveId != 43) {
              if ((this.field_o.moveId == 74 ||
                this.field_o.moveId == 75 ||
                this.field_o.moveId == 76)) {
                this.field_p.field_fb.a(new gja(this.field_p, var7, this.field_o.field_q), true);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_p.field_fb.a(new ha(this.field_p, var7), true);
            }
          }
        }
        if (this.field_j < 1) {
          this.e(-32);
        }
        return false;
    }

    static {
        field_r = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
