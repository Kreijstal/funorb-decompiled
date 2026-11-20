/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AsteroidField implements DiffableState, ofa, CompactGameState {
    private Asteroid[] asteroids;
    static double field_c;
    static String field_b;
    private int revision;

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        AsteroidField var4 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -26 % ((param0 - 22) / 59);
          var4 = (AsteroidField) (param1);
          stackIn_1_0 = SetCountermeasureLauncherAimspeed.a(var4.asteroids, false, 1, this.asteroids, -69);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("aib.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        AsteroidField var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (AsteroidField) (param1);
          if (~this.revision == ~var3.revision) {
            return;
          }
          var3.revision = this.revision;
          if (param0 < 54) {
            this.markChanged(116);
          }
          var3.asteroids = (Asteroid[]) (SpriteDimensions.copyStateArrayByMode(var3.asteroids, this.asteroids, 1, tob.field_o, false));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("aib.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void clearAsteroids(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var2_int = 0;
          while (var2_int < this.asteroids.length) {
            this.asteroids[var2_int] = null;
            var2_int++;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          var3 = 13 / ((-10 - param0) / 43);
          this.markChanged(-119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aib.M(" + param0 + ')');
        }
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        RuntimeException runtimeException = null;
        IsaacPacketBuffer var3 = null;
        Asteroid[] var4 = null;
        int var5 = 0;
        Asteroid[] var6 = null;
        int var7 = 0;
        Asteroid var8 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        IsaacPacketBuffer stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean stackIn_15_2 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          var3 = param0;
          var4 = this.asteroids;
          if (null == var4) {
            stackIn_5_0 = 0;
          } else {
            stackIn_5_0 = var4.length;
          }
          var5 = stackIn_5_0;
          var3.writeBits(-632, var5, 10);
          if (var5 != 0) {
            var6 = var4;
            var7 = 0;
            while (var7 < var6.length) {
              var8 = var6[var7];
              if (var9 != 0) {
                return;
              }
              stackIn_14_0 = var3;
              stackIn_14_1 = 68;
              stackIn_15_2 = (null != var8);
              if (vq.writeBoolean(stackIn_14_0, stackIn_14_1, stackIn_15_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var3, var8);
              }
              var7++;
            }
          }
          if (param1 >= -109) {
            this.asteroids = (Asteroid[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_26_0 = runtimeException;
          stackIn_26_1 = new StringBuilder().append("aib.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        RuntimeException runtimeException = null;
        AsteroidField var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (AsteroidField) (other);
          CarouselSlot.reportStateArrayDifferences(var3.asteroids, 1, this.asteroids, false, 5547);
          var4 = 0;
          if (SetCountermeasureLauncherAimspeed.a(var3.asteroids, false, 1, this.asteroids, 127)) {
            System.out.println("Asteroid[] asteroids has changed. ");
            var4 = 1;
          }
          if (obfuscationGuard > -19) {
            AsteroidField.getParagraphHeight((byte) 79, (String) null, 92, 121, -57);
          }
          if (var4 != 0) {
            System.out.println("This instance of AsteroidContainer has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("aib.F(");
          if (other == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void loadLocalizedTextAndKeyBindings(byte param0, ResourceArchive param1) {
        RuntimeException stackIn_1173_0 = null;
        StringBuilder stackIn_1173_1 = null;
        String stackIn_1174_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        byte[] var2Lifetime103;
        byte[] var2Lifetime104;
        byte[] var2Lifetime105;
        byte[] var2Lifetime106;
        byte[] var2Lifetime107;
        byte[] var2Lifetime108;
        byte[] var2Lifetime109;
        byte[] var2Lifetime110;
        byte[] var2Lifetime111;
        byte[] var2Lifetime112;
        byte[] var2Lifetime113;
        byte[] var2Lifetime114;
        byte[] var2Lifetime115;
        byte[] var2Lifetime116;
        byte[] var2Lifetime117;
        byte[] var2Lifetime118;
        byte[] var2Lifetime119;
        byte[] var2Lifetime120;
        byte[] var2Lifetime121;
        byte[] var2Lifetime122;
        byte[] var2Lifetime123;
        byte[] var2Lifetime124;
        byte[] var2Lifetime125;
        byte[] var2Lifetime126;
        byte[] var2Lifetime127;
        byte[] var2Lifetime128;
        byte[] var2Lifetime129;
        byte[] var2Lifetime130;
        byte[] var2Lifetime131;
        byte[] var2Lifetime132;
        byte[] var2Lifetime133;
        byte[] var2Lifetime134;
        byte[] var2Lifetime135;
        byte[] var2Lifetime136;
        byte[] var2Lifetime137;
        byte[] var2Lifetime138;
        byte[] var2Lifetime139;
        byte[] var2Lifetime140;
        byte[] var2Lifetime141;
        byte[] var2Lifetime142;
        byte[] var2Lifetime143;
        byte[] var2Lifetime144;
        byte[] var2Lifetime145;
        byte[] var2Lifetime146;
        byte[] var2Lifetime147;
        byte[] var2Lifetime148;
        byte[] var2Lifetime149;
        byte[] var2Lifetime150;
        byte[] var2Lifetime151;
        byte[] var2Lifetime152;
        byte[] var2Lifetime153;
        byte[] var2Lifetime154;
        byte[] var2Lifetime155;
        byte[] var2Lifetime156;
        byte[] var2Lifetime157;
        byte[] var2Lifetime158;
        byte[] var2Lifetime159;
        byte[] var2Lifetime160;
        byte[] var2Lifetime161;
        byte[] var2Lifetime162;
        byte[] var2Lifetime163;
        byte[] var2Lifetime164;
        byte[] var2Lifetime165;
        byte[] var2Lifetime166;
        byte[] var2Lifetime167;
        byte[] var2Lifetime168;
        byte[] var2Lifetime169;
        byte[] var2Lifetime170;
        byte[] var2Lifetime171;
        byte[] var2Lifetime172;
        byte[] var2Lifetime173;
        byte[] var2Lifetime174;
        byte[] var2Lifetime175;
        byte[] var2Lifetime176;
        byte[] var2Lifetime177;
        byte[] var2Lifetime178;
        byte[] var2Lifetime179;
        byte[] var2Lifetime180;
        byte[] var2Lifetime181;
        byte[] var2Lifetime182;
        byte[] var2Lifetime183;
        byte[] var2Lifetime184;
        byte[] var2Lifetime185;
        byte[] var2Lifetime186;
        byte[] var2Lifetime187;
        byte[] var2Lifetime188;
        byte[] var2Lifetime189;
        byte[] var2Lifetime190;
        byte[] var2Lifetime191;
        byte[] var2Lifetime192;
        byte[] var2Lifetime193;
        byte[] var2Lifetime194;
        byte[] var2Lifetime195;
        byte[] var2Lifetime196;
        byte[] var2Lifetime197;
        byte[] var2Lifetime198;
        byte[] var2Lifetime199;
        byte[] var2Lifetime200;
        byte[] var2Lifetime201;
        byte[] var2Lifetime202;
        byte[] var2Lifetime203;
        byte[] var2Lifetime204;
        byte[] var2Lifetime205;
        byte[] var2Lifetime206;
        byte[] var2Lifetime207;
        byte[] var2Lifetime208;
        byte[] var2Lifetime209;
        byte[] var2Lifetime210;
        byte[] var2Lifetime211;
        byte[] var2Lifetime212;
        byte[] var2Lifetime213;
        byte[] var2Lifetime214;
        byte[] var2Lifetime215;
        byte[] var2Lifetime216;
        byte[] var2Lifetime217;
        byte[] var2Lifetime218;
        byte[] var2Lifetime219;
        byte[] var2Lifetime220;
        byte[] var2Lifetime221;
        byte[] var2Lifetime222;
        byte[] var2Lifetime223;
        byte[] var2Lifetime224;
        byte[] var2Lifetime225;
        byte[] var2Lifetime226;
        byte[] var2Lifetime227;
        byte[] var2Lifetime228;
        byte[] var2Lifetime229;
        byte[] var2Lifetime230;
        byte[] var2Lifetime231;
        byte[] var2Lifetime232;
        byte[] var2Lifetime233;
        byte[] var2Lifetime234;
        byte[] var2Lifetime235;
        byte[] var2Lifetime236;
        byte[] var2Lifetime237;
        byte[] var2Lifetime238;
        byte[] var2Lifetime239;
        byte[] var2Lifetime240;
        byte[] var2Lifetime241;
        byte[] var2Lifetime242;
        byte[] var2Lifetime243;
        byte[] var2Lifetime244;
        byte[] var2Lifetime245;
        byte[] var2Lifetime246;
        byte[] var2Lifetime247;
        byte[] var2Lifetime248;
        byte[] var2Lifetime249;
        byte[] var2Lifetime250;
        byte[] var2Lifetime251;
        byte[] var2Lifetime252;
        byte[] var2Lifetime253;
        byte[] var2Lifetime254;
        byte[] var2Lifetime255;
        byte[] var2Lifetime256;
        byte[] var2Lifetime257;
        byte[] var2Lifetime258;
        byte[] var2Lifetime259;
        byte[] var2Lifetime260;
        byte[] var2Lifetime261;
        byte[] var2Lifetime262;
        byte[] var2Lifetime263;
        byte[] var2Lifetime264;
        byte[] var2Lifetime265;
        byte[] var2Lifetime266;
        byte[] var2Lifetime267;
        byte[] var2Lifetime268;
        byte[] var2Lifetime269;
        byte[] var2Lifetime270;
        byte[] var2Lifetime271;
        byte[] var2Lifetime272;
        byte[] var2Lifetime273;
        byte[] var2Lifetime274;
        byte[] var2Lifetime275;
        byte[] var2Lifetime276;
        byte[] var2Lifetime277;
        byte[] var2Lifetime278;
        byte[] var2Lifetime279;
        byte[] var2Lifetime280;
        byte[] var2Lifetime281;
        byte[] var2Lifetime282;
        byte[] var2Lifetime283;
        byte[] var2Lifetime284;
        byte[] var2Lifetime285;
        byte[] var2Lifetime286;
        byte[] var2Lifetime287;
        byte[] var2Lifetime288;
        byte[] var2Lifetime289;
        byte[] var2Lifetime290;
        byte[] var2Lifetime291;
        byte[] var2Lifetime292;
        byte[] var2Lifetime293;
        byte[] var2Lifetime294;
        byte[] var2Lifetime295;
        byte[] var2Lifetime296;
        byte[] var2Lifetime297;
        byte[] var2Lifetime298;
        byte[] var2Lifetime299;
        byte[] var2Lifetime300;
        byte[] var2Lifetime301;
        byte[] var2Lifetime302;
        byte[] var2Lifetime303;
        byte[] var2Lifetime304;
        byte[] var2Lifetime305;
        byte[] var2Lifetime306;
        byte[] var2Lifetime307;
        byte[] var2Lifetime308;
        byte[] var2Lifetime309;
        byte[] var2Lifetime310;
        byte[] var2Lifetime311;
        byte[] var2Lifetime312;
        byte[] var2Lifetime313;
        byte[] var2Lifetime314;
        byte[] var2Lifetime315;
        byte[] var2Lifetime316;
        byte[] var2Lifetime317;
        byte[] var2Lifetime318;
        byte[] var2Lifetime319;
        byte[] var2Lifetime320;
        byte[] var2Lifetime321;
        byte[] var2Lifetime322;
        byte[] var2Lifetime323;
        byte[] var2Lifetime324;
        byte[] var2Lifetime325;
        byte[] var2Lifetime326;
        byte[] var2Lifetime327;
        byte[] var2Lifetime328;
        byte[] var2Lifetime329;
        byte[] var2Lifetime330;
        byte[] var2Lifetime331;
        byte[] var2Lifetime332;
        try {
          MidiEnvelope.localizationArchive = param1;
          var2 = HuffmanCodec.fetchLocalizedResource((byte) -59, "text_benefits,0");
          if (var2 != null) {
            GetShieldsDirectionalArcParticleSpeedDownshift.field_o[0] = Cp1252Strings.decode((byte) -125, var2);
          }
          var2Lifetime1 = HuffmanCodec.fetchLocalizedResource((byte) -104, "gameoptlabels,0");
          if (null != var2Lifetime1) {
            DebugSendable.field_d[0] = Cp1252Strings.decode((byte) -125, var2Lifetime1);
          }
          var2Lifetime2 = HuffmanCodec.fetchLocalizedResource((byte) -84, "gameoptnames,0,0");
          if (null != var2Lifetime2) {
            GetDebugLineLife.field_o[0][0] = Cp1252Strings.decode((byte) -125, var2Lifetime2);
          }
          var2Lifetime3 = HuffmanCodec.fetchLocalizedResource((byte) -45, "gameoptnames,0,1");
          if (var2Lifetime3 != null) {
            GetDebugLineLife.field_o[0][1] = Cp1252Strings.decode((byte) -125, var2Lifetime3);
          }
          var2Lifetime4 = HuffmanCodec.fetchLocalizedResource((byte) -76, "gameoptnames,0,2");
          if (var2Lifetime4 != null) {
            GetDebugLineLife.field_o[0][2] = Cp1252Strings.decode((byte) -125, var2Lifetime4);
          }
          var2Lifetime5 = HuffmanCodec.fetchLocalizedResource((byte) -98, "gameopttooltips,0,0");
          if (null != var2Lifetime5) {
            GetBombletSprayRandomness.field_q[0][0] = Cp1252Strings.decode((byte) -125, var2Lifetime5);
          }
          var2Lifetime6 = HuffmanCodec.fetchLocalizedResource((byte) -8, "gameopttooltips,0,1");
          if (var2Lifetime6 != null) {
            GetBombletSprayRandomness.field_q[0][1] = Cp1252Strings.decode((byte) -125, var2Lifetime6);
          }
          var2Lifetime7 = HuffmanCodec.fetchLocalizedResource((byte) -48, "gameopttooltips,0,2");
          if (null != var2Lifetime7) {
            GetBombletSprayRandomness.field_q[0][2] = Cp1252Strings.decode((byte) -125, var2Lifetime7);
          }
          var2Lifetime8 = HuffmanCodec.fetchLocalizedResource((byte) -99, "practice");
          if (var2Lifetime8 != null) {
            SetPhasedEnergyBeamPulsetime.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime8);
          }
          var2Lifetime9 = HuffmanCodec.fetchLocalizedResource((byte) -31, "multiplayer_lobby");
          if (null != var2Lifetime9) {
            GetAiFiringRangeUpshift.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime9);
          }
          var2Lifetime10 = HuffmanCodec.fetchLocalizedResource((byte) -5, "chat_bar");
          if (null != var2Lifetime10) {
            SetWeaponProjectileSpeedMultiply.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime10);
          }
          var2Lifetime11 = HuffmanCodec.fetchLocalizedResource((byte) -15, "no_votes");
          if (null != var2Lifetime11) {
            PartitioningManager.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime11);
          }
          var2Lifetime12 = HuffmanCodec.fetchLocalizedResource((byte) -102, "voters_colon");
          if (null != var2Lifetime12) {
            ShipBodyFactory.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime12);
          }
          var2Lifetime13 = HuffmanCodec.fetchLocalizedResource((byte) -13, "out_of_sync");
          if (var2Lifetime13 != null) {
            SetHealthBarHeight.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime13);
          }
          var2Lifetime14 = HuffmanCodec.fetchLocalizedResource((byte) -46, "sending_state_dump_to_server");
          if (var2Lifetime14 != null) {
            SetWeaponParticleSpeedDownshift.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime14);
          }
          var2Lifetime15 = HuffmanCodec.fetchLocalizedResource((byte) -76, "press_control_r_to_reconnect");
          if (var2Lifetime15 != null) {
            GetPhasedEnergyBeamPulseFadetime.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime15);
          }
          var2Lifetime16 = HuffmanCodec.fetchLocalizedResource((byte) -38, "external_ship_design_loaded");
          if (var2Lifetime16 != null) {
            NetworkArchiveRequest.field_s = Cp1252Strings.decode((byte) -125, var2Lifetime16);
          }
          var2Lifetime17 = HuffmanCodec.fetchLocalizedResource((byte) -66, "need_to_be_in_menu_or_sandbox");
          if (var2Lifetime17 != null) {
            SetVariableLabelAction.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime17);
          }
          var2Lifetime18 = HuffmanCodec.fetchLocalizedResource((byte) -49, "beta_uppercase");
          if (null != var2Lifetime18) {
            Cp1252Strings.decode((byte) -125, var2Lifetime18);
          }
          var2Lifetime19 = HuffmanCodec.fetchLocalizedResource((byte) -100, "save_confirmation");
          if (var2Lifetime19 != null) {
            veb.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime19);
          }
          var2Lifetime20 = HuffmanCodec.fetchLocalizedResource((byte) -4, "scores");
          if (null != var2Lifetime20) {
            SetThrusterParticleLife.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime20);
          }
          var2Lifetime21 = HuffmanCodec.fetchLocalizedResource((byte) -126, "chat");
          if (var2Lifetime21 != null) {
            SetTeamSelectionSpeedup.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime21);
          }
          var2Lifetime22 = HuffmanCodec.fetchLocalizedResource((byte) -69, "team");
          if (null != var2Lifetime22) {
            GetDebrisCarryOverPercentage.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime22);
          }
          var2Lifetime23 = HuffmanCodec.fetchLocalizedResource((byte) -5, "move");
          if (null != var2Lifetime23) {
            ProxyAuthenticationException.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime23);
          }
          var2Lifetime24 = HuffmanCodec.fetchLocalizedResource((byte) -76, "zoom");
          if (var2Lifetime24 != null) {
            DirectByteStorage.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime24);
          }
          var2Lifetime25 = HuffmanCodec.fetchLocalizedResource((byte) -90, "you_are_spectating");
          if (null != var2Lifetime25) {
            SpawnLocation.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime25);
          }
          var2Lifetime26 = HuffmanCodec.fetchLocalizedResource((byte) -39, "downloading_at_x");
          if (var2Lifetime26 != null) {
            GetGrapplingHookRopeBreakLength.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime26);
          }
          var2Lifetime27 = HuffmanCodec.fetchLocalizedResource((byte) -120, "disconnected_for_x_minutes_idle");
          if (null != var2Lifetime27) {
            mmb.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime27);
          }
          var2Lifetime28 = HuffmanCodec.fetchLocalizedResource((byte) -74, "unknown");
          if (null != var2Lifetime28) {
            SetMomentOfInertiaPredivideDownshift.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime28);
          }
          var2Lifetime29 = HuffmanCodec.fetchLocalizedResource((byte) -62, "saved_blueprint");
          if (null != var2Lifetime29) {
            SetShipTeamActionFactory.field_d = Cp1252Strings.decode((byte) -125, var2Lifetime29);
          }
          var2Lifetime30 = HuffmanCodec.fetchLocalizedResource((byte) -10, "saved_ship");
          if (null != var2Lifetime30) {
            GetMissionTimeLimit.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime30);
          }
          var2Lifetime31 = HuffmanCodec.fetchLocalizedResource((byte) -57, "stored_ship");
          if (null != var2Lifetime31) {
            LaserWeaponDefinition.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime31);
          }
          var2Lifetime32 = HuffmanCodec.fetchLocalizedResource((byte) -10, "become_a_member_to_permenantly_save");
          if (null != var2Lifetime32) {
            SetCountermeasureLauncherProjectiles.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime32);
          }
          var2Lifetime33 = HuffmanCodec.fetchLocalizedResource((byte) -55, "ship_too_complex");
          if (null != var2Lifetime33) {
            SetArmageddonTimerStart.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime33);
          }
          var2Lifetime34 = HuffmanCodec.fetchLocalizedResource((byte) -112, "ship_complexity");
          if (null != var2Lifetime34) {
            GetMassDriverEnergyUsed.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime34);
          }
          var2Lifetime35 = HuffmanCodec.fetchLocalizedResource((byte) -81, "max_ship_size_reached");
          if (var2Lifetime35 != null) {
            MissionControl.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime35);
          }
          var2Lifetime36 = HuffmanCodec.fetchLocalizedResource((byte) -104, "enemy_ship_spawned");
          if (null != var2Lifetime36) {
            GetMachineGunPulsetime.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime36);
          }
          var2Lifetime37 = HuffmanCodec.fetchLocalizedResource((byte) -3, "teams_have_been_balanced");
          if (null != var2Lifetime37) {
            ResourceArchive.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime37);
          }
          var2Lifetime38 = HuffmanCodec.fetchLocalizedResource((byte) -87, "option_state_free");
          if (null != var2Lifetime38) {
            DualLinkNode.field_h = Cp1252Strings.decode((byte) -125, var2Lifetime38);
          }
          var2Lifetime39 = HuffmanCodec.fetchLocalizedResource((byte) -126, "option_state_new");
          if (var2Lifetime39 != null) {
            MapClearanceRectangle.field_f = Cp1252Strings.decode((byte) -125, var2Lifetime39);
          }
          var2Lifetime40 = HuffmanCodec.fetchLocalizedResource((byte) -69, "option_state_coming_soon");
          if (null != var2Lifetime40) {
            GetDebrisCollisionDamage.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime40);
          }
          var2Lifetime41 = HuffmanCodec.fetchLocalizedResource((byte) -36, "option_state_limited_time_only");
          if (null != var2Lifetime41) {
            igb.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime41);
          }
          var2Lifetime42 = HuffmanCodec.fetchLocalizedResource((byte) -59, "option_state_invisible");
          if (var2Lifetime42 != null) {
            ppb.field_d = Cp1252Strings.decode((byte) -125, var2Lifetime42);
          }
          var2Lifetime43 = HuffmanCodec.fetchLocalizedResource((byte) -8, "option_state_for_members");
          if (null != var2Lifetime43) {
            ti.field_i = Cp1252Strings.decode((byte) -125, var2Lifetime43);
          }
          var2Lifetime44 = HuffmanCodec.fetchLocalizedResource((byte) -81, "option_state_members_only");
          if (null != var2Lifetime44) {
            QuickChatDynamicCommand.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime44);
          }
          var2Lifetime45 = HuffmanCodec.fetchLocalizedResource((byte) -86, "crown_tooltips,4");
          if (null != var2Lifetime45) {
            MonochromeRowCache.field_j[4] = Cp1252Strings.decode((byte) -125, var2Lifetime45);
          }
          var2Lifetime46 = HuffmanCodec.fetchLocalizedResource((byte) -45, "scoreboard_column_type_names,0");
          if (null != var2Lifetime46) {
            SetVariableActionFactory.field_e[0] = Cp1252Strings.decode((byte) -125, var2Lifetime46);
          }
          var2Lifetime47 = HuffmanCodec.fetchLocalizedResource((byte) -36, "scoreboard_column_type_names,1");
          if (var2Lifetime47 != null) {
            SetVariableActionFactory.field_e[1] = Cp1252Strings.decode((byte) -125, var2Lifetime47);
          }
          var2Lifetime48 = HuffmanCodec.fetchLocalizedResource((byte) -6, "scoreboard_column_type_names,2");
          if (var2Lifetime48 != null) {
            SetVariableActionFactory.field_e[2] = Cp1252Strings.decode((byte) -125, var2Lifetime48);
          }
          var2Lifetime49 = HuffmanCodec.fetchLocalizedResource((byte) -103, "scoreboard_column_type_names,3");
          if (var2Lifetime49 != null) {
            SetVariableActionFactory.field_e[3] = Cp1252Strings.decode((byte) -125, var2Lifetime49);
          }
          var2Lifetime50 = HuffmanCodec.fetchLocalizedResource((byte) -35, "scoreboard_column_type_names,4");
          if (null != var2Lifetime50) {
            SetVariableActionFactory.field_e[4] = Cp1252Strings.decode((byte) -125, var2Lifetime50);
          }
          var2Lifetime51 = HuffmanCodec.fetchLocalizedResource((byte) -40, "scoreboard_column_type_names,5");
          if (null != var2Lifetime51) {
            SetVariableActionFactory.field_e[5] = Cp1252Strings.decode((byte) -125, var2Lifetime51);
          }
          var2Lifetime52 = HuffmanCodec.fetchLocalizedResource((byte) -114, "controls");
          if (var2Lifetime52 != null) {
            HardpointMatch.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime52);
          }
          var2Lifetime53 = HuffmanCodec.fetchLocalizedResource((byte) -37, "instructions_pages,0");
          if (var2Lifetime53 != null) {
            mb.field_k[0] = Cp1252Strings.decode((byte) -125, var2Lifetime53);
          }
          var2Lifetime54 = HuffmanCodec.fetchLocalizedResource((byte) -117, "instructions_pages,1");
          if (var2Lifetime54 != null) {
            mb.field_k[1] = Cp1252Strings.decode((byte) -125, var2Lifetime54);
          }
          var2Lifetime55 = HuffmanCodec.fetchLocalizedResource((byte) -44, "instructions_pages,2");
          if (var2Lifetime55 != null) {
            mb.field_k[2] = Cp1252Strings.decode((byte) -125, var2Lifetime55);
          }
          var2Lifetime56 = HuffmanCodec.fetchLocalizedResource((byte) -63, "instructions_pages,3");
          if (null != var2Lifetime56) {
            mb.field_k[3] = Cp1252Strings.decode((byte) -125, var2Lifetime56);
          }
          var2Lifetime57 = HuffmanCodec.fetchLocalizedResource((byte) -105, "instructions_pages,4");
          if (null != var2Lifetime57) {
            mb.field_k[4] = Cp1252Strings.decode((byte) -125, var2Lifetime57);
          }
          var2Lifetime58 = HuffmanCodec.fetchLocalizedResource((byte) -106, "keycode_move_forward");
          if (var2Lifetime58 != null) {
            SetFixedaim.field_q = var2Lifetime58[0] & 255;
          }
          var2Lifetime59 = HuffmanCodec.fetchLocalizedResource((byte) -59, "keycode_move_backward");
          if (null != var2Lifetime59) {
            SetCountermeasureLauncherAimspeed.field_q = 255 & var2Lifetime59[0];
          }
          var2Lifetime60 = HuffmanCodec.fetchLocalizedResource((byte) -4, "keycode_move_rotate_left");
          if (var2Lifetime60 != null) {
            SetSalvoaim.field_p = var2Lifetime60[0] & 255;
          }
          var2Lifetime61 = HuffmanCodec.fetchLocalizedResource((byte) -123, "keycode_move_rotate_right");
          if (null != var2Lifetime61) {
            UnsupportedGpuMaterialEffect.field_f = var2Lifetime61[0] & 255;
          }
          var2Lifetime62 = HuffmanCodec.fetchLocalizedResource((byte) -47, "keycode_move_strafe_left");
          if (var2Lifetime62 != null) {
            HerringboneTextureOperation.field_m = 255 & var2Lifetime62[0];
          }
          var2Lifetime63 = HuffmanCodec.fetchLocalizedResource((byte) -84, "keycode_move_strafe_right");
          if (var2Lifetime63 != null) {
            SetUseRectOutline.field_o = 255 & var2Lifetime63[0];
          }
          var2Lifetime64 = HuffmanCodec.fetchLocalizedResource((byte) -25, "keycode_grapples_fire");
          if (var2Lifetime64 != null) {
            SetMassDriverAimarc.field_o = 255 & var2Lifetime64[0];
          }
          var2Lifetime65 = HuffmanCodec.fetchLocalizedResource((byte) -55, "keycode_missiles_fire");
          if (var2Lifetime65 != null) {
            GetResourceNodeCaptureTime.field_o = var2Lifetime65[0] & 255;
          }
          var2Lifetime66 = HuffmanCodec.fetchLocalizedResource((byte) -122, "keycode_shields_toggle");
          if (null != var2Lifetime66) {
            GetSpinningBladeAimarc.field_r = var2Lifetime66[0] & 255;
          }
          var2Lifetime67 = HuffmanCodec.fetchLocalizedResource((byte) -107, "keycode_repair_mode");
          if (var2Lifetime67 != null) {
            SetSelfDestructActivateCooldown.field_o = var2Lifetime67[0] & 255;
          }
          var2Lifetime68 = HuffmanCodec.fetchLocalizedResource((byte) -57, "keycode_boosters_fire");
          if (var2Lifetime68 != null) {
            GetUseDetailLines.field_p = 255 & var2Lifetime68[0];
          }
          var2Lifetime69 = HuffmanCodec.fetchLocalizedResource((byte) -78, "keycode_fighters_launch");
          if (null != var2Lifetime69) {
            SetPedrosRepairMode.field_p = var2Lifetime69[0] & 255;
          }
          var2Lifetime70 = HuffmanCodec.fetchLocalizedResource((byte) -44, "keycode_countermeasures_launch");
          if (null != var2Lifetime70) {
            cbb.field_h = 255 & var2Lifetime70[0];
          }
          var2Lifetime71 = HuffmanCodec.fetchLocalizedResource((byte) -94, "keycode_self_destruct_prepare_toggle");
          if (var2Lifetime71 != null) {
            GetPointDefenceLaserRandomness.field_p = var2Lifetime71[0] & 255;
          }
          var2Lifetime72 = HuffmanCodec.fetchLocalizedResource((byte) -101, "keycode_self_destruct_activate");
          if (var2Lifetime72 != null) {
            GameKeyHandler.field_a = var2Lifetime72[0] & 255;
          }
          var2Lifetime73 = HuffmanCodec.fetchLocalizedResource((byte) -100, "keycode_spawn_enemy");
          if (var2Lifetime73 != null) {
            GetMomentOfInertiaPredivideDownshift.field_r = var2Lifetime73[0] & 255;
          }
          var2Lifetime74 = HuffmanCodec.fetchLocalizedResource((byte) -19, "keycode_save_blueprint");
          if (null != var2Lifetime74) {
            SetDetachmentMode.field_p = var2Lifetime74[0] & 255;
          }
          var2Lifetime75 = HuffmanCodec.fetchLocalizedResource((byte) -81, "keycode_load_blueprint");
          if (null != var2Lifetime75) {
            WaveformTextureOperation.field_j = var2Lifetime75[0] & 255;
          }
          var2Lifetime76 = HuffmanCodec.fetchLocalizedResource((byte) -45, "keycode_chat_all_primary");
          if (var2Lifetime76 != null) {
            GetHealthBarWidth.field_q = var2Lifetime76[0] & 255;
          }
          var2Lifetime77 = HuffmanCodec.fetchLocalizedResource((byte) -84, "keycode_chat_team_primary");
          if (null != var2Lifetime77) {
            GetGrappleDebris.field_p = var2Lifetime77[0] & 255;
          }
          var2Lifetime78 = HuffmanCodec.fetchLocalizedResource((byte) -114, "keycode_scoreboard_primary");
          if (var2Lifetime78 != null) {
            DebugRequestFactory.field_a = var2Lifetime78[0] & 255;
          }
          var2Lifetime79 = HuffmanCodec.fetchLocalizedResource((byte) -16, "keycode_chat_all_secondary");
          if (var2Lifetime79 != null) {
            vu.field_Db = 255 & var2Lifetime79[0];
          }
          var2Lifetime80 = HuffmanCodec.fetchLocalizedResource((byte) -49, "keycode_chat_team_secondary");
          if (var2Lifetime80 != null) {
            GetBombletSprayProjectiles.field_p = var2Lifetime80[0] & 255;
          }
          var2Lifetime81 = HuffmanCodec.fetchLocalizedResource((byte) -27, "keycode_scoreboard_secondary");
          if (null != var2Lifetime81) {
            GrappleLauncherBehaviour.field_b = var2Lifetime81[0] & 255;
          }
          var2Lifetime82 = HuffmanCodec.fetchLocalizedResource((byte) -75, "keycode_zoom_in");
          if (var2Lifetime82 != null) {
            GetUseCircleOutline.field_p = var2Lifetime82[0] & 255;
          }
          var2Lifetime83 = HuffmanCodec.fetchLocalizedResource((byte) -27, "keycode_zoom_in_2");
          if (var2Lifetime83 != null) {
            GetPointDefenceLaserRandomness.field_r = 255 & var2Lifetime83[0];
          }
          var2Lifetime84 = HuffmanCodec.fetchLocalizedResource((byte) -93, "keycode_zoom_out");
          if (null != var2Lifetime84) {
            GetTorpedoProjectileLife.field_o = var2Lifetime84[0] & 255;
          }
          var2Lifetime85 = HuffmanCodec.fetchLocalizedResource((byte) -50, "keycode_zoom_out_2");
          if (var2Lifetime85 != null) {
            PlayerAction.field_n = var2Lifetime85[0] & 255;
          }
          var2Lifetime86 = HuffmanCodec.fetchLocalizedResource((byte) -40, "cursor_keys_shortname");
          if (var2Lifetime86 != null) {
            ct.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime86);
          }
          var2Lifetime87 = HuffmanCodec.fetchLocalizedResource((byte) -106, "mouse_wheel_shortname");
          if (var2Lifetime87 != null) {
            uw.field_d = Cp1252Strings.decode((byte) -125, var2Lifetime87);
          }
          var2Lifetime88 = HuffmanCodec.fetchLocalizedResource((byte) -105, "options");
          if (var2Lifetime88 != null) {
            SetCountermeasureLauncherFireForce.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime88);
          }
          var2Lifetime89 = HuffmanCodec.fetchLocalizedResource((byte) -109, "editor");
          if (var2Lifetime89 != null) {
            veb.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime89);
          }
          var2Lifetime90 = HuffmanCodec.fetchLocalizedResource((byte) -33, "reloading");
          if (var2Lifetime90 != null) {
            Cp1252Strings.decode((byte) -125, var2Lifetime90);
          }
          var2Lifetime91 = HuffmanCodec.fetchLocalizedResource((byte) -75, "missile_lock");
          if (var2Lifetime91 != null) {
            SpawnChoiceFactory.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime91);
          }
          var2Lifetime92 = HuffmanCodec.fetchLocalizedResource((byte) -100, "armageddon_in");
          if (var2Lifetime92 != null) {
            bt.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime92);
          }
          var2Lifetime93 = HuffmanCodec.fetchLocalizedResource((byte) -124, "next_mission_colon");
          if (var2Lifetime93 != null) {
            SoftLruCache.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime93);
          }
          var2Lifetime94 = HuffmanCodec.fetchLocalizedResource((byte) -44, "round_x");
          if (null != var2Lifetime94) {
            bw.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime94);
          }
          var2Lifetime95 = HuffmanCodec.fetchLocalizedResource((byte) -65, "waiting_for_players");
          if (null != var2Lifetime95) {
            kmb.field_d = Cp1252Strings.decode((byte) -125, var2Lifetime95);
          }
          var2Lifetime96 = HuffmanCodec.fetchLocalizedResource((byte) -116, "respawning_timer");
          if (var2Lifetime96 != null) {
            Cp1252Strings.decode((byte) -125, var2Lifetime96);
          }
          var2Lifetime97 = HuffmanCodec.fetchLocalizedResource((byte) -70, "spawning_as");
          if (var2Lifetime97 != null) {
            Cp1252Strings.decode((byte) -125, var2Lifetime97);
          }
          var2Lifetime98 = HuffmanCodec.fetchLocalizedResource((byte) -54, "respawn_selection_hint");
          if (var2Lifetime98 != null) {
            Cp1252Strings.decode((byte) -125, var2Lifetime98);
          }
          var2Lifetime99 = HuffmanCodec.fetchLocalizedResource((byte) -93, "team_cannot_respawn");
          if (var2Lifetime99 != null) {
            Widget.field_H = Cp1252Strings.decode((byte) -125, var2Lifetime99);
          }
          var2Lifetime100 = HuffmanCodec.fetchLocalizedResource((byte) -46, "all_teams_cannot_respawn");
          if (var2Lifetime100 != null) {
            GetLaserReload.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime100);
          }
          var2Lifetime101 = HuffmanCodec.fetchLocalizedResource((byte) -56, "repair_mode_in_x");
          if (var2Lifetime101 != null) {
            SetMessageFadetime.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime101);
          }
          var2Lifetime102 = HuffmanCodec.fetchLocalizedResource((byte) -66, "repairing");
          if (null != var2Lifetime102) {
            qd.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime102);
          }
          var2Lifetime103 = HuffmanCodec.fetchLocalizedResource((byte) -71, "mouse_over_to_repair");
          if (null != var2Lifetime103) {
            SetPlayerRepairTime.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime103);
          }
          var2Lifetime104 = HuffmanCodec.fetchLocalizedResource((byte) -2, "combat_mode_in_x");
          if (null != var2Lifetime104) {
            SetRepairModePower.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime104);
          }
          var2Lifetime105 = HuffmanCodec.fetchLocalizedResource((byte) -9, "missile_locked_on");
          if (null != var2Lifetime105) {
            Cp1252Strings.decode((byte) -125, var2Lifetime105);
          }
          var2Lifetime106 = HuffmanCodec.fetchLocalizedResource((byte) -125, "TYPE_WEAPON");
          if (var2Lifetime106 != null) {
            UiTextField.field_F = Cp1252Strings.decode((byte) -125, var2Lifetime106);
          }
          var2Lifetime107 = HuffmanCodec.fetchLocalizedResource((byte) -110, "TYPE_DEFENCE");
          if (null != var2Lifetime107) {
            GetBombletSprayProjectileLife.field_r = Cp1252Strings.decode((byte) -125, var2Lifetime107);
          }
          var2Lifetime108 = HuffmanCodec.fetchLocalizedResource((byte) -126, "TYPE_HULL");
          if (null != var2Lifetime108) {
            Cp1252Strings.decode((byte) -125, var2Lifetime108);
          }
          var2Lifetime109 = HuffmanCodec.fetchLocalizedResource((byte) -28, "TYPE_ARMOUR");
          if (null != var2Lifetime109) {
            DebugMessage.field_d = Cp1252Strings.decode((byte) -125, var2Lifetime109);
          }
          var2Lifetime110 = HuffmanCodec.fetchLocalizedResource((byte) -43, "TYPE_SPECIAL_WEAPON");
          if (null != var2Lifetime110) {
            SetTorpedoProjectileDamage.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime110);
          }
          var2Lifetime111 = HuffmanCodec.fetchLocalizedResource((byte) -115, "TYPE_THRUSTER");
          if (var2Lifetime111 != null) {
            Cp1252Strings.decode((byte) -125, var2Lifetime111);
          }
          var2Lifetime112 = HuffmanCodec.fetchLocalizedResource((byte) -97, "TYPE_OTHER");
          if (var2Lifetime112 != null) {
            Cp1252Strings.decode((byte) -125, var2Lifetime112);
          }
          var2Lifetime113 = HuffmanCodec.fetchLocalizedResource((byte) -90, "COMPONENT_USE_THRUSTER_STANDARD_TEXT");
          if (null != var2Lifetime113) {
            GetSpinningBladeAimspeed.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime113);
          }
          var2Lifetime114 = HuffmanCodec.fetchLocalizedResource((byte) -27, "COMPONENT_USE_WEAPON_MASSDRIVER_TEXT");
          if (var2Lifetime114 != null) {
            CarouselSystemEvent.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime114);
          }
          var2Lifetime115 = HuffmanCodec.fetchLocalizedResource((byte) -71, "COMPONENT_USE_WEAPON_PLASMABALL_TEXT");
          if (null != var2Lifetime115) {
            jw.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime115);
          }
          var2Lifetime116 = HuffmanCodec.fetchLocalizedResource((byte) -77, "COMPONENT_USE_WEAPON_FIGHTERBAY_TEXT");
          if (var2Lifetime116 != null) {
            VertexAttribute.field_n = Cp1252Strings.decode((byte) -125, var2Lifetime116);
          }
          var2Lifetime117 = HuffmanCodec.fetchLocalizedResource((byte) -77, "COMPONENT_USE_WEAPON_SPINNING_BLADE_TEXT");
          if (var2Lifetime117 != null) {
            SetPhysicsCollisionPhantomForceMultiplier.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime117);
          }
          var2Lifetime118 = HuffmanCodec.fetchLocalizedResource((byte) -83, "COMPONENT_USE_WEAPON_BOMBLET_SPRAY_TEXT");
          if (null != var2Lifetime118) {
            GetSniperCannonProjectileLife.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime118);
          }
          var2Lifetime119 = HuffmanCodec.fetchLocalizedResource((byte) -63, "COMPONENT_USE_WEAPON_LASER_BEAM_TEXT");
          if (null != var2Lifetime119) {
            Hardpoint.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime119);
          }
          var2Lifetime120 = HuffmanCodec.fetchLocalizedResource((byte) -47, "COMPONENT_USE_WEAPON_SNIPER_CANNON_TEXT");
          if (var2Lifetime120 != null) {
            RemoveEventActionFactory.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime120);
          }
          var2Lifetime121 = HuffmanCodec.fetchLocalizedResource((byte) -125, "COMPONENT_USE_WEAPON_GRAPPLING_HOOK_TEXT");
          if (null != var2Lifetime121) {
            SetBombletSprayAimspeed.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime121);
          }
          var2Lifetime122 = HuffmanCodec.fetchLocalizedResource((byte) -98, "COMPONENT_USE_WEAPON_MISSILE_LAUNCHER_TEXT");
          if (var2Lifetime122 != null) {
            DebrisFactory.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime122);
          }
          var2Lifetime123 = HuffmanCodec.fetchLocalizedResource((byte) -44, "COMPONENT_USE_HULL_TEXT");
          if (var2Lifetime123 != null) {
            OpenGlEnvironmentMappedWaterEffect.field_h = Cp1252Strings.decode((byte) -125, var2Lifetime123);
          }
          var2Lifetime124 = HuffmanCodec.fetchLocalizedResource((byte) -33, "COMPONENT_USE_ARMOUR_TEXT");
          if (var2Lifetime124 != null) {
            SetSpecialOrderBoxHeight.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime124);
          }
          var2Lifetime125 = HuffmanCodec.fetchLocalizedResource((byte) -47, "COMPONENT_USE_POWER_PLANT_TEXT");
          if (var2Lifetime125 != null) {
            HighscoreValueRequest.field_h = Cp1252Strings.decode((byte) -125, var2Lifetime125);
          }
          var2Lifetime126 = HuffmanCodec.fetchLocalizedResource((byte) -5, "COMPONENT_USE_ENERGY_SHIELD_DIRECTIONAL_TEXT");
          if (var2Lifetime126 != null) {
            OpenGlPostProcessor.field_d = Cp1252Strings.decode((byte) -125, var2Lifetime126);
          }
          var2Lifetime127 = HuffmanCodec.fetchLocalizedResource((byte) -38, "COMPONENT_USE_POINT_DEFENCE_LASER_TEXT");
          if (var2Lifetime127 != null) {
            GetMissionVariablesHudY.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime127);
          }
          var2Lifetime128 = HuffmanCodec.fetchLocalizedResource((byte) -52, "COMPONENT_USE_COUNTERMEASURE_TEXT");
          if (null != var2Lifetime128) {
            UiComboBox.field_I = Cp1252Strings.decode((byte) -125, var2Lifetime128);
          }
          var2Lifetime129 = HuffmanCodec.fetchLocalizedResource((byte) -120, "COMPONENT_USE_THRUSTER_BOOSTER_TEXT");
          if (null != var2Lifetime129) {
            jjb.field_f = Cp1252Strings.decode((byte) -125, var2Lifetime129);
          }
          var2Lifetime130 = HuffmanCodec.fetchLocalizedResource((byte) -7, "COMPONENT_USE_SPECIAL_COMPONENT_TEXT");
          if (var2Lifetime130 != null) {
            SetGrapplingHookSpringConstant.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime130);
          }
          var2Lifetime131 = HuffmanCodec.fetchLocalizedResource((byte) -47, "COMPONENT_CHASSIS_FIGHTER_TEXT");
          if (null != var2Lifetime131) {
            TextureRasterShape.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime131);
          }
          var2Lifetime132 = HuffmanCodec.fetchLocalizedResource((byte) -100, "COMPONENT_CHASSIS_TURRETBASE_TEXT");
          if (var2Lifetime132 != null) {
            iob.field_e = Cp1252Strings.decode((byte) -125, var2Lifetime132);
          }
          var2Lifetime133 = HuffmanCodec.fetchLocalizedResource((byte) -100, "COMPONENT_CHASSIS_EDITINGDRONE_TEXT");
          if (var2Lifetime133 != null) {
            SetFighterRepairAmount.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime133);
          }
          var2Lifetime134 = HuffmanCodec.fetchLocalizedResource((byte) -123, "COMPONENT_CHASSIS_POLYGONAL_FRIGATE_TEXT");
          if (var2Lifetime134 != null) {
            fdb.field_S = Cp1252Strings.decode((byte) -125, var2Lifetime134);
          }
          var2Lifetime135 = HuffmanCodec.fetchLocalizedResource((byte) -9, "COMPONENT_CHASSIS_CONVOY_TEXT");
          if (var2Lifetime135 != null) {
            ArchiveDiskWorker.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime135);
          }
          var2Lifetime136 = HuffmanCodec.fetchLocalizedResource((byte) -4, "COMPONENT_CHASSIS_DRAGON_TEXT");
          if (null != var2Lifetime136) {
            GetAngularForceDownshift.field_r = Cp1252Strings.decode((byte) -125, var2Lifetime136);
          }
          var2Lifetime137 = HuffmanCodec.fetchLocalizedResource((byte) -40, "COMPONENT_CHASSIS_MOSQUITO_TEXT");
          if (null != var2Lifetime137) {
            kmb.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime137);
          }
          var2Lifetime138 = HuffmanCodec.fetchLocalizedResource((byte) -58, "COMPONENT_CHASSIS_CARRIER_TEXT");
          if (var2Lifetime138 != null) {
            SetAutozoomAmountMultiply.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime138);
          }
          var2Lifetime139 = HuffmanCodec.fetchLocalizedResource((byte) -21, "COMPONENT_CHASSIS_HYDRA_TEXT");
          if (null != var2Lifetime139) {
            GetBoostersCooldown.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime139);
          }
          var2Lifetime140 = HuffmanCodec.fetchLocalizedResource((byte) -53, "COMPONENT_CHASSIS_STINGRAY_TEXT");
          if (null != var2Lifetime140) {
            gm.field_I = Cp1252Strings.decode((byte) -125, var2Lifetime140);
          }
          var2Lifetime141 = HuffmanCodec.fetchLocalizedResource((byte) -58, "COMPONENT_CHASSIS_BUTTERFLY_TEXT");
          if (var2Lifetime141 != null) {
            wgb.field_h = Cp1252Strings.decode((byte) -125, var2Lifetime141);
          }
          var2Lifetime142 = HuffmanCodec.fetchLocalizedResource((byte) -64, "COMPONENT_CHASSIS_WASP_TEXT");
          if (var2Lifetime142 != null) {
            FullscreenCanvas.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime142);
          }
          var2Lifetime143 = HuffmanCodec.fetchLocalizedResource((byte) -55, "COMPONENT_THRUSTER_SMALL_TEXT");
          if (null != var2Lifetime143) {
            ne.field_m = Cp1252Strings.decode((byte) -125, var2Lifetime143);
          }
          var2Lifetime144 = HuffmanCodec.fetchLocalizedResource((byte) -116, "COMPONENT_THRUSTER_STANDARD_TEXT");
          if (null != var2Lifetime144) {
            HerringboneTextureOperation.field_i = Cp1252Strings.decode((byte) -125, var2Lifetime144);
          }
          var2Lifetime145 = HuffmanCodec.fetchLocalizedResource((byte) -46, "COMPONENT_WEAPON_MACHINEGUN_TEXT");
          if (null != var2Lifetime145) {
            SetDebrisSurvives.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime145);
          }
          var2Lifetime146 = HuffmanCodec.fetchLocalizedResource((byte) -90, "COMPONENT_WEAPON_MASSDRIVER_TEXT");
          if (null != var2Lifetime146) {
            GetLaserEnergyUsed.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime146);
          }
          var2Lifetime147 = HuffmanCodec.fetchLocalizedResource((byte) -7, "COMPONENT_WEAPON_PLASMABALL_TEXT");
          if (null != var2Lifetime147) {
            NineSliceSprite.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime147);
          }
          var2Lifetime148 = HuffmanCodec.fetchLocalizedResource((byte) -102, "COMPONENT_WEAPON_UBERCANNON_TEXT");
          if (var2Lifetime148 != null) {
            SetGrapplingHookMaxLength.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime148);
          }
          var2Lifetime149 = HuffmanCodec.fetchLocalizedResource((byte) -52, "COMPONENT_WEAPON_FIGHTERBAY_TEXT");
          if (var2Lifetime149 != null) {
            SetPlayerRepairAmount.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime149);
          }
          var2Lifetime150 = HuffmanCodec.fetchLocalizedResource((byte) -88, "COMPONENT_WEAPON_SPINNING_BLADE_TEXT");
          if (var2Lifetime150 != null) {
            SetAutoAfkTimeout.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime150);
          }
          var2Lifetime151 = HuffmanCodec.fetchLocalizedResource((byte) -105, "COMPONENT_WEAPON_BOMBLET_SPRAY_TEXT");
          if (var2Lifetime151 != null) {
            kl.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime151);
          }
          var2Lifetime152 = HuffmanCodec.fetchLocalizedResource((byte) -49, "COMPONENT_WEAPON_LASER_BEAM_TEXT");
          if (null != var2Lifetime152) {
            BoxBlurTextureOperation.field_i = Cp1252Strings.decode((byte) -125, var2Lifetime152);
          }
          var2Lifetime153 = HuffmanCodec.fetchLocalizedResource((byte) -18, "COMPONENT_WEAPON_SNIPER_CANNON_TEXT");
          if (null != var2Lifetime153) {
            SetShieldsDirectionalArcParticleLife.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime153);
          }
          var2Lifetime154 = HuffmanCodec.fetchLocalizedResource((byte) -46, "COMPONENT_WEAPON_GRAPPLING_HOOK_TEXT");
          if (var2Lifetime154 != null) {
            HuffmanCodec.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime154);
          }
          var2Lifetime155 = HuffmanCodec.fetchLocalizedResource((byte) -80, "COMPONENT_WEAPON_MISSILE_LAUNCHER_TEXT");
          if (null != var2Lifetime155) {
            Lo.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime155);
          }
          var2Lifetime156 = HuffmanCodec.fetchLocalizedResource((byte) -88, "COMPONENT_ARM_LONG_TEXT");
          if (var2Lifetime156 != null) {
            SetUseExtraBackground.field_r = Cp1252Strings.decode((byte) -125, var2Lifetime156);
          }
          var2Lifetime157 = HuffmanCodec.fetchLocalizedResource((byte) -94, "COMPONENT_ARM_SHORT_TEXT");
          if (null != var2Lifetime157) {
            OpenGlGpuTexture2D.field_k = Cp1252Strings.decode((byte) -125, var2Lifetime157);
          }
          var2Lifetime158 = HuffmanCodec.fetchLocalizedResource((byte) -8, "COMPONENT_ASTEROID_0_TEXT");
          if (null != var2Lifetime158) {
            GetPedrosRepairMode.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime158);
          }
          var2Lifetime159 = HuffmanCodec.fetchLocalizedResource((byte) -63, "COMPONENT_GRAPPLING_HOOK_TEXT");
          if (null != var2Lifetime159) {
            SetPhysicsCollisionForceMultiplier.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime159);
          }
          var2Lifetime160 = HuffmanCodec.fetchLocalizedResource((byte) -83, "COMPONENT_ARMOUR_BLOCK_TEXT");
          if (null != var2Lifetime160) {
            vla.field_C = Cp1252Strings.decode((byte) -125, var2Lifetime160);
          }
          var2Lifetime161 = HuffmanCodec.fetchLocalizedResource((byte) -10, "COMPONENT_HULL_TRIANGLE_TEXT");
          if (var2Lifetime161 != null) {
            wsb.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime161);
          }
          var2Lifetime162 = HuffmanCodec.fetchLocalizedResource((byte) -97, "COMPONENT_HULL_SPIKE_TEXT");
          if (null != var2Lifetime162) {
            GetWorldWidthUpshift.field_r = Cp1252Strings.decode((byte) -125, var2Lifetime162);
          }
          var2Lifetime163 = HuffmanCodec.fetchLocalizedResource((byte) -82, "COMPONENT_HULL_PLATE2_TEXT");
          if (var2Lifetime163 != null) {
            SetTeamSelectionSpeedup.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime163);
          }
          var2Lifetime164 = HuffmanCodec.fetchLocalizedResource((byte) -127, "COMPONENT_HULL_DIAMOND_TEXT");
          if (null != var2Lifetime164) {
            SetBombletSprayProjectileDamage.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime164);
          }
          var2Lifetime165 = HuffmanCodec.fetchLocalizedResource((byte) -110, "COMPONENT_HULL_LATTICE_TEXT");
          if (var2Lifetime165 != null) {
            PlayerGameData.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime165);
          }
          var2Lifetime166 = HuffmanCodec.fetchLocalizedResource((byte) -37, "COMPONENT_ARMOUR_BIG_TEXT");
          if (null != var2Lifetime166) {
            SetLaserProjectiles.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime166);
          }
          var2Lifetime167 = HuffmanCodec.fetchLocalizedResource((byte) -75, "COMPONENT_ARMOUR_SMALL_TEXT");
          if (null != var2Lifetime167) {
            GetRepairModeActiveTime.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime167);
          }
          var2Lifetime168 = HuffmanCodec.fetchLocalizedResource((byte) -86, "COMPONENT_HULL_RIGHT_WING_TEXT");
          if (null != var2Lifetime168) {
            SetArmageddonWarning.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime168);
          }
          var2Lifetime169 = HuffmanCodec.fetchLocalizedResource((byte) -85, "COMPONENT_HULL_LEFT_WING_TEXT");
          if (var2Lifetime169 != null) {
            GetMutatorVotes.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime169);
          }
          var2Lifetime170 = HuffmanCodec.fetchLocalizedResource((byte) -27, "COMPONENT_POWER_PLANT_TEXT");
          if (var2Lifetime170 != null) {
            GetGrapplingHookCooldown.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime170);
          }
          var2Lifetime171 = HuffmanCodec.fetchLocalizedResource((byte) -105, "COMPONENT_ENERGY_SHIELD_DIRECTIONAL_TEXT");
          if (var2Lifetime171 != null) {
            GetDetachmentMode.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime171);
          }
          var2Lifetime172 = HuffmanCodec.fetchLocalizedResource((byte) -87, "COMPONENT_POINT_DEFENCE_LASER_TEXT");
          if (null != var2Lifetime172) {
            SoftwareDepthBuffer.field_e = Cp1252Strings.decode((byte) -125, var2Lifetime172);
          }
          var2Lifetime173 = HuffmanCodec.fetchLocalizedResource((byte) -2, "COMPONENT_COUNTERMEASURE_TEXT");
          if (var2Lifetime173 != null) {
            GetPhasedEnergyBeamReload.field_r = Cp1252Strings.decode((byte) -125, var2Lifetime173);
          }
          var2Lifetime174 = HuffmanCodec.fetchLocalizedResource((byte) -102, "COMPONENT_THRUSTER_BOOSTER_TEXT");
          if (null != var2Lifetime174) {
            SetMpSandboxEnemySpawnLimit.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime174);
          }
          var2Lifetime175 = HuffmanCodec.fetchLocalizedResource((byte) -71, "COMPONENT_SPECIAL_COMPONENT_TEXT");
          if (var2Lifetime175 != null) {
            OpenGlGlyphMask.field_d = Cp1252Strings.decode((byte) -125, var2Lifetime175);
          }
          var2Lifetime176 = HuffmanCodec.fetchLocalizedResource((byte) -97, "COMPONENT_ARMOUR_PLATE_TEXT");
          if (var2Lifetime176 != null) {
            lm.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime176);
          }
          var2Lifetime177 = HuffmanCodec.fetchLocalizedResource((byte) -16, "COMPONENT_HULL_BEAM_TEXT");
          if (null != var2Lifetime177) {
            kab.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime177);
          }
          var2Lifetime178 = HuffmanCodec.fetchLocalizedResource((byte) -120, "COMPONENT_HULL_HEXAGON_TEXT");
          if (null != var2Lifetime178) {
            WeaponBehaviourFactory.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime178);
          }
          var2Lifetime179 = HuffmanCodec.fetchLocalizedResource((byte) -95, "hull_piece");
          if (null != var2Lifetime179) {
            pa.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime179);
          }
          var2Lifetime180 = HuffmanCodec.fetchLocalizedResource((byte) -102, "armour_piece");
          if (var2Lifetime180 != null) {
            GetMpSandboxEnemySpawnLimit.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime180);
          }
          var2Lifetime181 = HuffmanCodec.fetchLocalizedResource((byte) -112, "ORDER_GRAPPLES_FIRE_SHORT");
          if (var2Lifetime181 != null) {
            SetDebrisFoundInPairs.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime181);
          }
          var2Lifetime182 = HuffmanCodec.fetchLocalizedResource((byte) -59, "ORDER_GRAPPLES_FIRE");
          if (null != var2Lifetime182) {
            qh.field_L = Cp1252Strings.decode((byte) -125, var2Lifetime182);
          }
          var2Lifetime183 = HuffmanCodec.fetchLocalizedResource((byte) -20, "ORDER_GRAPPLES_RECALL");
          if (var2Lifetime183 != null) {
            dfa.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime183);
          }
          var2Lifetime184 = HuffmanCodec.fetchLocalizedResource((byte) -3, "ORDER_MISSILES_FIRE_SHORT");
          if (var2Lifetime184 != null) {
            Cp1252Strings.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime184);
          }
          var2Lifetime185 = HuffmanCodec.fetchLocalizedResource((byte) -9, "ORDER_MISSILES_FIRE");
          if (null != var2Lifetime185) {
            SetBombletSprayAimspeed.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime185);
          }
          var2Lifetime186 = HuffmanCodec.fetchLocalizedResource((byte) -12, "ORDER_SHIELDS_TOGGLE_SHORT");
          if (var2Lifetime186 != null) {
            gl.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime186);
          }
          var2Lifetime187 = HuffmanCodec.fetchLocalizedResource((byte) -78, "ORDER_SHIELDS_TOGGLE");
          if (var2Lifetime187 != null) {
            ComponentBehaviourFactory.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime187);
          }
          var2Lifetime188 = HuffmanCodec.fetchLocalizedResource((byte) -126, "ORDER_REPAIR_MODE_SHORT");
          if (var2Lifetime188 != null) {
            hla.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime188);
          }
          var2Lifetime189 = HuffmanCodec.fetchLocalizedResource((byte) -85, "ORDER_REPAIR_MODE");
          if (null != var2Lifetime189) {
            Widget.field_kb = Cp1252Strings.decode((byte) -125, var2Lifetime189);
          }
          var2Lifetime190 = HuffmanCodec.fetchLocalizedResource((byte) -55, "ORDER_BOOSTERS_FIRE_SHORT");
          if (null != var2Lifetime190) {
            NormalMapTextureOperation.field_j = Cp1252Strings.decode((byte) -125, var2Lifetime190);
          }
          var2Lifetime191 = HuffmanCodec.fetchLocalizedResource((byte) -67, "ORDER_BOOSTERS_FIRE");
          if (var2Lifetime191 != null) {
            jb.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime191);
          }
          var2Lifetime192 = HuffmanCodec.fetchLocalizedResource((byte) -45, "ORDER_FIGHTERS_LAUNCH_SHORT");
          if (var2Lifetime192 != null) {
            SetBloomCoefficientPercentage.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime192);
          }
          var2Lifetime193 = HuffmanCodec.fetchLocalizedResource((byte) -94, "ORDER_FIGHTERS_LAUNCH");
          if (null != var2Lifetime193) {
            ssa.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime193);
          }
          var2Lifetime194 = HuffmanCodec.fetchLocalizedResource((byte) -72, "ORDER_COUNTERMEASURES_LAUNCH_SHORT");
          if (null != var2Lifetime194) {
            NanosecondClock.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime194);
          }
          var2Lifetime195 = HuffmanCodec.fetchLocalizedResource((byte) -97, "ORDER_COUNTERMEASURES_LAUNCH");
          if (null != var2Lifetime195) {
            SpecialOrderSubmessageFactory.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime195);
          }
          var2Lifetime196 = HuffmanCodec.fetchLocalizedResource((byte) -60, "ORDER_SELF_DESTRUCT_PREPARE_TOGGLE");
          if (null != var2Lifetime196) {
            kl.field_e = Cp1252Strings.decode((byte) -125, var2Lifetime196);
          }
          var2Lifetime197 = HuffmanCodec.fetchLocalizedResource((byte) -124, "ORDER_SELF_DESTRUCT_ACTIVATE");
          if (var2Lifetime197 != null) {
            SetShieldsDirectionalArcParticleSpeedDownshift.field_s = Cp1252Strings.decode((byte) -125, var2Lifetime197);
          }
          var2Lifetime198 = HuffmanCodec.fetchLocalizedResource((byte) -57, "ORDER_SPAWN_ENEMY");
          if (var2Lifetime198 != null) {
            jw.field_d = Cp1252Strings.decode((byte) -125, var2Lifetime198);
          }
          var2Lifetime199 = HuffmanCodec.fetchLocalizedResource((byte) -87, "ORDER_SAVE_BLUEPRINT");
          if (var2Lifetime199 != null) {
            ShipBlueprint.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime199);
          }
          var2Lifetime200 = HuffmanCodec.fetchLocalizedResource((byte) -28, "ORDER_LOAD_BLUEPRINT");
          if (var2Lifetime200 != null) {
            GetSalvoDamageMultiplier.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime200);
          }
          var2Lifetime201 = HuffmanCodec.fetchLocalizedResource((byte) -100, "ORDER_SELF_DESTRUCT_UNPREPARE_TOGGLE");
          if (var2Lifetime201 != null) {
            SecondaryNodeDequeIterator.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime201);
          }
          var2Lifetime202 = HuffmanCodec.fetchLocalizedResource((byte) -63, "mission_options");
          if (var2Lifetime202 != null) {
            SetReloadBarWidth.field_t = Cp1252Strings.decode((byte) -125, var2Lifetime202);
          }
          var2Lifetime203 = HuffmanCodec.fetchLocalizedResource((byte) -80, "extra_options");
          if (null != var2Lifetime203) {
            WeaponBehaviour.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime203);
          }
          var2Lifetime204 = HuffmanCodec.fetchLocalizedResource((byte) -120, "choose_team");
          if (var2Lifetime204 != null) {
            GetPhasedEnergyBeamRandomness.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime204);
          }
          var2Lifetime205 = HuffmanCodec.fetchLocalizedResource((byte) -79, "mission_voting_titles,0");
          if (null != var2Lifetime205) {
            tga.field_M[0] = Cp1252Strings.decode((byte) -125, var2Lifetime205);
          }
          var2Lifetime206 = HuffmanCodec.fetchLocalizedResource((byte) -109, "mission_voting_titles,1");
          if (var2Lifetime206 != null) {
            tga.field_M[1] = Cp1252Strings.decode((byte) -125, var2Lifetime206);
          }
          var2Lifetime207 = HuffmanCodec.fetchLocalizedResource((byte) -23, "mission_voting_titles,2");
          if (var2Lifetime207 != null) {
            tga.field_M[2] = Cp1252Strings.decode((byte) -125, var2Lifetime207);
          }
          var2Lifetime208 = HuffmanCodec.fetchLocalizedResource((byte) -112, "mission_objective_ordering");
          if (var2Lifetime208 != null) {
            SetTeamSelectionSpeedup.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime208);
          }
          var2Lifetime209 = HuffmanCodec.fetchLocalizedResource((byte) -68, "mission_objective_base");
          if (var2Lifetime209 != null) {
            cib.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime209);
          }
          var2Lifetime210 = HuffmanCodec.fetchLocalizedResource((byte) -55, "mission_objective_turret");
          if (var2Lifetime210 != null) {
            SetDebrisCarryOverPercentage.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime210);
          }
          var2Lifetime211 = HuffmanCodec.fetchLocalizedResource((byte) -48, "mission_objective_vip");
          if (var2Lifetime211 != null) {
            GetLaserBeamProjectileDamage.field_t = Cp1252Strings.decode((byte) -125, var2Lifetime211);
          }
          var2Lifetime212 = HuffmanCodec.fetchLocalizedResource((byte) -121, "mission_objective_target");
          if (var2Lifetime212 != null) {
            GetReadyRoomMissionTime.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime212);
          }
          var2Lifetime213 = HuffmanCodec.fetchLocalizedResource((byte) -81, "VOTE_DESTROY_BASE");
          if (var2Lifetime213 != null) {
            ArchiveTextureProvider.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime213);
          }
          var2Lifetime214 = HuffmanCodec.fetchLocalizedResource((byte) -59, "VOTE_DESTROY_BASE_DESC");
          if (var2Lifetime214 != null) {
            SetMissilesHitSourceTeam.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime214);
          }
          var2Lifetime215 = HuffmanCodec.fetchLocalizedResource((byte) -88, "VOTE_DESTROY_BASE_DESC_A");
          if (null != var2Lifetime215) {
            SetMachineGunAimarc.field_r = Cp1252Strings.decode((byte) -125, var2Lifetime215);
          }
          var2Lifetime216 = HuffmanCodec.fetchLocalizedResource((byte) -8, "VOTE_DESTROY_BASE_DESC_B");
          if (null != var2Lifetime216) {
            fcb.field_g = Cp1252Strings.decode((byte) -125, var2Lifetime216);
          }
          var2Lifetime217 = HuffmanCodec.fetchLocalizedResource((byte) -81, "VOTE_DESTROY_BASE_BALANCED");
          if (null != var2Lifetime217) {
            GetTorpedoAcceleration.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime217);
          }
          var2Lifetime218 = HuffmanCodec.fetchLocalizedResource((byte) -31, "VOTE_DESTROY_BASE_BALANCED_DESC");
          if (var2Lifetime218 != null) {
            oib.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime218);
          }
          var2Lifetime219 = HuffmanCodec.fetchLocalizedResource((byte) -38, "VOTE_CONVOY");
          if (var2Lifetime219 != null) {
            SetThrusterAutobalancing.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime219);
          }
          var2Lifetime220 = HuffmanCodec.fetchLocalizedResource((byte) -17, "VOTE_CONVOY_DESC");
          if (null != var2Lifetime220) {
            fia.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime220);
          }
          var2Lifetime221 = HuffmanCodec.fetchLocalizedResource((byte) -98, "VOTE_CONVOY_DESC_A");
          if (null != var2Lifetime221) {
            fdb.field_T = Cp1252Strings.decode((byte) -125, var2Lifetime221);
          }
          var2Lifetime222 = HuffmanCodec.fetchLocalizedResource((byte) -110, "VOTE_CONVOY_DESC_B");
          if (var2Lifetime222 != null) {
            csa.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime222);
          }
          var2Lifetime223 = HuffmanCodec.fetchLocalizedResource((byte) -106, "VOTE_CONVOY_BALANCED");
          if (null != var2Lifetime223) {
            GetReloadBarHeight.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime223);
          }
          var2Lifetime224 = HuffmanCodec.fetchLocalizedResource((byte) -38, "VOTE_CONVOY_BALANCED_DESC");
          if (var2Lifetime224 != null) {
            ola.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime224);
          }
          var2Lifetime225 = HuffmanCodec.fetchLocalizedResource((byte) -26, "VOTE_ASSASSINATE_VIP");
          if (null != var2Lifetime225) {
            enb.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime225);
          }
          var2Lifetime226 = HuffmanCodec.fetchLocalizedResource((byte) -111, "VOTE_ASSASSINATE_VIP_DESC");
          if (var2Lifetime226 != null) {
            ArmBehaviour.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime226);
          }
          var2Lifetime227 = HuffmanCodec.fetchLocalizedResource((byte) -116, "VOTE_ASSASSINATE_VIP_DESC_A");
          if (null != var2Lifetime227) {
            BricksTextureOperation.field_t = Cp1252Strings.decode((byte) -125, var2Lifetime227);
          }
          var2Lifetime228 = HuffmanCodec.fetchLocalizedResource((byte) -13, "VOTE_ASSASSINATE_VIP_DESC_B");
          if (var2Lifetime228 != null) {
            pbb.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime228);
          }
          var2Lifetime229 = HuffmanCodec.fetchLocalizedResource((byte) -34, "VOTE_ASSASSINATE_VIP_BALANCED");
          if (var2Lifetime229 != null) {
            GetSniperCannonAimspeed.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime229);
          }
          var2Lifetime230 = HuffmanCodec.fetchLocalizedResource((byte) -64, "VOTE_ASSASSINATE_VIP_BALANCED_DESC");
          if (var2Lifetime230 != null) {
            GrappleLauncherBehaviour.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime230);
          }
          var2Lifetime231 = HuffmanCodec.fetchLocalizedResource((byte) -34, "VOTE_BLITZ");
          if (var2Lifetime231 != null) {
            iwa.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime231);
          }
          var2Lifetime232 = HuffmanCodec.fetchLocalizedResource((byte) -40, "VOTE_BLITZ_DESC");
          if (null != var2Lifetime232) {
            LoadBlackboxRecording.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime232);
          }
          var2Lifetime233 = HuffmanCodec.fetchLocalizedResource((byte) -51, "VOTE_BLITZ_DESC_A");
          if (null != var2Lifetime233) {
            GetThrusterParticleSpeedDownshift.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime233);
          }
          var2Lifetime234 = HuffmanCodec.fetchLocalizedResource((byte) -48, "VOTE_BLITZ_DESC_B");
          if (null != var2Lifetime234) {
            CellularNoiseTextureOperation.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime234);
          }
          var2Lifetime235 = HuffmanCodec.fetchLocalizedResource((byte) -67, "VOTE_HOARD_TECHNOLOGY_BALANCED");
          if (null != var2Lifetime235) {
            SetCarouselConstant.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime235);
          }
          var2Lifetime236 = HuffmanCodec.fetchLocalizedResource((byte) -45, "VOTE_HOARD_TECHNOLOGY_BALANCED_DESC");
          if (null != var2Lifetime236) {
            MissionBuilderFactory.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime236);
          }
          var2Lifetime237 = HuffmanCodec.fetchLocalizedResource((byte) -54, "VOTE_SCAVENGERS");
          if (var2Lifetime237 != null) {
            GetFightersPerPlayerMaximum.field_s = Cp1252Strings.decode((byte) -125, var2Lifetime237);
          }
          var2Lifetime238 = HuffmanCodec.fetchLocalizedResource((byte) -65, "VOTE_SCAVENGERS_DESC");
          if (null != var2Lifetime238) {
            LoadSettings.field_r = Cp1252Strings.decode((byte) -125, var2Lifetime238);
          }
          var2Lifetime239 = HuffmanCodec.fetchLocalizedResource((byte) -32, "VOTE_RESNET");
          if (var2Lifetime239 != null) {
            GetMessageMaxage.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime239);
          }
          var2Lifetime240 = HuffmanCodec.fetchLocalizedResource((byte) -21, "VOTE_RESNET_DESC");
          if (null != var2Lifetime240) {
            GetReloadBarWidth.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime240);
          }
          var2Lifetime241 = HuffmanCodec.fetchLocalizedResource((byte) -121, "VOTE_HOLD_THE_COMPONENT");
          if (var2Lifetime241 != null) {
            ata.field_G = Cp1252Strings.decode((byte) -125, var2Lifetime241);
          }
          var2Lifetime242 = HuffmanCodec.fetchLocalizedResource((byte) -110, "VOTE_HOLD_THE_COMPONENT_DESC");
          if (var2Lifetime242 != null) {
            MassDriverWeaponDefinition.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime242);
          }
          var2Lifetime243 = HuffmanCodec.fetchLocalizedResource((byte) -14, "VOTE_SHOWDOWN");
          if (null != var2Lifetime243) {
            PartitionZone.field_g = Cp1252Strings.decode((byte) -125, var2Lifetime243);
          }
          var2Lifetime244 = HuffmanCodec.fetchLocalizedResource((byte) -120, "VOTE_SHOWDOWN_DESC");
          if (null != var2Lifetime244) {
            qeb.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime244);
          }
          var2Lifetime245 = HuffmanCodec.fetchLocalizedResource((byte) -47, "VOTE_ARENA");
          if (var2Lifetime245 != null) {
            SetReloadBarHeight.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime245);
          }
          var2Lifetime246 = HuffmanCodec.fetchLocalizedResource((byte) -88, "VOTE_ARENA_DESC");
          if (null != var2Lifetime246) {
            GetPhasedEnergyBeamAimarc.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime246);
          }
          var2Lifetime247 = HuffmanCodec.fetchLocalizedResource((byte) -120, "VOTE_SANDBOX");
          if (var2Lifetime247 != null) {
            MovingObject.field_g = Cp1252Strings.decode((byte) -125, var2Lifetime247);
          }
          var2Lifetime248 = HuffmanCodec.fetchLocalizedResource((byte) -103, "VOTE_SANDBOX_DESC");
          if (null != var2Lifetime248) {
            GetMomentOfInertiaPredivideDownshift.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime248);
          }
          var2Lifetime249 = HuffmanCodec.fetchLocalizedResource((byte) -102, "VOTE_LARGER_MAP_WIDTH");
          if (var2Lifetime249 != null) {
            GetSpecialOrderBarX.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime249);
          }
          var2Lifetime250 = HuffmanCodec.fetchLocalizedResource((byte) -9, "VOTE_SMALLER_MAP_WIDTH");
          if (null != var2Lifetime250) {
            HighscoreTableRequest.field_d = Cp1252Strings.decode((byte) -125, var2Lifetime250);
          }
          var2Lifetime251 = HuffmanCodec.fetchLocalizedResource((byte) -50, "VOTE_LARGER_MAP_HEIGHT");
          if (var2Lifetime251 != null) {
            SetPointDefenceLaserEnergyUsed.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime251);
          }
          var2Lifetime252 = HuffmanCodec.fetchLocalizedResource((byte) -60, "VOTE_SMALLER_MAP_HEIGHT");
          if (var2Lifetime252 != null) {
            SetBombletSprayProjectiles.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime252);
          }
          var2Lifetime253 = HuffmanCodec.fetchLocalizedResource((byte) -74, "VOTE_MORE_ASTEROIDS");
          if (null != var2Lifetime253) {
            SetMinimapHeight.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime253);
          }
          var2Lifetime254 = HuffmanCodec.fetchLocalizedResource((byte) -31, "VOTE_MORE_NEBULAE");
          if (var2Lifetime254 != null) {
            SetUseBackgroundInFullscreen.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime254);
          }
          var2Lifetime255 = HuffmanCodec.fetchLocalizedResource((byte) -20, "VOTE_MORE_POWER_PLANTS");
          if (null != var2Lifetime255) {
            ThrusterBehaviourFactory.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime255);
          }
          var2Lifetime256 = HuffmanCodec.fetchLocalizedResource((byte) -66, "VOTE_MORE_SHIELDS");
          if (var2Lifetime256 != null) {
            oe.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime256);
          }
          var2Lifetime257 = HuffmanCodec.fetchLocalizedResource((byte) -31, "VOTE_MORE_MISSILE_DEFENCE");
          if (null != var2Lifetime257) {
            kla.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime257);
          }
          var2Lifetime258 = HuffmanCodec.fetchLocalizedResource((byte) -31, "VOTE_MORE_ARMOUR");
          if (null != var2Lifetime258) {
            cs.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime258);
          }
          var2Lifetime259 = HuffmanCodec.fetchLocalizedResource((byte) -126, "VOTE_MORE_HULL_PIECES");
          if (var2Lifetime259 != null) {
            GetComponentBreakingExplosionForceMultiplier.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime259);
          }
          var2Lifetime260 = HuffmanCodec.fetchLocalizedResource((byte) -17, "VOTE_MORE_SAWBLADES");
          if (var2Lifetime260 != null) {
            ThrusterBehaviourFactory.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime260);
          }
          var2Lifetime261 = HuffmanCodec.fetchLocalizedResource((byte) -118, "VOTE_MORE_SPECIAL_WEAPONS");
          if (var2Lifetime261 != null) {
            tob.field_l = Cp1252Strings.decode((byte) -125, var2Lifetime261);
          }
          var2Lifetime262 = HuffmanCodec.fetchLocalizedResource((byte) -21, "VOTE_MORE_THRUSTERS");
          if (null != var2Lifetime262) {
            GetBombletSprayEnergyUsed.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime262);
          }
          var2Lifetime263 = HuffmanCodec.fetchLocalizedResource((byte) -9, "VOTE_MORE_WEAPONS");
          if (null != var2Lifetime263) {
            CarouselPlayerEvent.field_l = Cp1252Strings.decode((byte) -125, var2Lifetime263);
          }
          var2Lifetime264 = HuffmanCodec.fetchLocalizedResource((byte) -98, "VOTE_MORE_NEUTRALS");
          if (null != var2Lifetime264) {
            OpenGlTexture3D.field_m = Cp1252Strings.decode((byte) -125, var2Lifetime264);
          }
          var2Lifetime265 = HuffmanCodec.fetchLocalizedResource((byte) -72, "VOTE_LESS_NEUTRALS");
          if (null != var2Lifetime265) {
            GetMachineGunPulsetime.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime265);
          }
          var2Lifetime266 = HuffmanCodec.fetchLocalizedResource((byte) -65, "tutorial_mission_name_caps");
          if (var2Lifetime266 != null) {
            GetWeaponParticleSpeedDownshift.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime266);
          }
          var2Lifetime267 = HuffmanCodec.fetchLocalizedResource((byte) -21, "tutorial_mission_desc");
          if (var2Lifetime267 != null) {
            SetPointDefenceLaserProjectileInterceptDamage.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime267);
          }
          var2Lifetime268 = HuffmanCodec.fetchLocalizedResource((byte) -96, "tutorial_mission_ending_caps");
          if (var2Lifetime268 != null) {
            SetMassDriverProjectileDamage.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime268);
          }
          var2Lifetime269 = HuffmanCodec.fetchLocalizedResource((byte) -124, "spawn_x");
          if (null != var2Lifetime269) {
            SetMachineGunFireForce.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime269);
          }
          var2Lifetime270 = HuffmanCodec.fetchLocalizedResource((byte) -13, "spawn_caps");
          if (var2Lifetime270 != null) {
            BombletSprayWeaponDefinition.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime270);
          }
          var2Lifetime271 = HuffmanCodec.fetchLocalizedResource((byte) -13, "win_round_message");
          if (null != var2Lifetime271) {
            kia.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime271);
          }
          var2Lifetime272 = HuffmanCodec.fetchLocalizedResource((byte) -79, "win_match_message");
          if (null != var2Lifetime272) {
            lh.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime272);
          }
          var2Lifetime273 = HuffmanCodec.fetchLocalizedResource((byte) -100, "win_match_with_less_time_message");
          if (null != var2Lifetime273) {
            gl.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime273);
          }
          var2Lifetime274 = HuffmanCodec.fetchLocalizedResource((byte) -107, "win_match_with_more_wins_message");
          if (var2Lifetime274 != null) {
            SetWaitForPlayers.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime274);
          }
          var2Lifetime275 = HuffmanCodec.fetchLocalizedResource((byte) -44, "win");
          if (null != var2Lifetime275) {
            SetMachineGunProjectileDamage.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime275);
          }
          var2Lifetime276 = HuffmanCodec.fetchLocalizedResource((byte) -39, "win_plural");
          if (var2Lifetime276 != null) {
            uj.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime276);
          }
          var2Lifetime277 = HuffmanCodec.fetchLocalizedResource((byte) -71, "draw_round_message");
          if (var2Lifetime277 != null) {
            SetGrapplingHookMaxExtension8Force.field_r = Cp1252Strings.decode((byte) -125, var2Lifetime277);
          }
          var2Lifetime278 = HuffmanCodec.fetchLocalizedResource((byte) -42, "draw_match_message");
          if (var2Lifetime278 != null) {
            SetCountermeasureLauncherFireForce.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime278);
          }
          var2Lifetime279 = HuffmanCodec.fetchLocalizedResource((byte) -30, "team_names,0");
          if (var2Lifetime279 != null) {
            glb.field_c[0] = Cp1252Strings.decode((byte) -125, var2Lifetime279);
          }
          var2Lifetime280 = HuffmanCodec.fetchLocalizedResource((byte) -9, "team_names,1");
          if (null != var2Lifetime280) {
            glb.field_c[1] = Cp1252Strings.decode((byte) -125, var2Lifetime280);
          }
          var2Lifetime281 = HuffmanCodec.fetchLocalizedResource((byte) -39, "team_names,2");
          if (null != var2Lifetime281) {
            glb.field_c[2] = Cp1252Strings.decode((byte) -125, var2Lifetime281);
          }
          var2Lifetime282 = HuffmanCodec.fetchLocalizedResource((byte) -40, "game_restart_timer");
          if (var2Lifetime282 != null) {
            GetMaxShipSize.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime282);
          }
          var2Lifetime283 = HuffmanCodec.fetchLocalizedResource((byte) -109, "tutorial_movement");
          if (var2Lifetime283 != null) {
            ge.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime283);
          }
          var2Lifetime284 = HuffmanCodec.fetchLocalizedResource((byte) -105, "tutorial_shooting");
          if (var2Lifetime284 != null) {
            CarouselSlotStateDump.field_e = Cp1252Strings.decode((byte) -125, var2Lifetime284);
          }
          var2Lifetime285 = HuffmanCodec.fetchLocalizedResource((byte) -43, "tutorial_zooming");
          if (null != var2Lifetime285) {
            ei.field_f = Cp1252Strings.decode((byte) -125, var2Lifetime285);
          }
          var2Lifetime286 = HuffmanCodec.fetchLocalizedResource((byte) -95, "tutorial_fogofwar_label");
          if (null != var2Lifetime286) {
            uia.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime286);
          }
          var2Lifetime287 = HuffmanCodec.fetchLocalizedResource((byte) -60, "tutorial_grabbing");
          if (var2Lifetime287 != null) {
            GetMissionVotes.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime287);
          }
          if (param0 > -23) {
            return;
          }
          var2Lifetime288 = HuffmanCodec.fetchLocalizedResource((byte) -89, "tutorial_repair_mode_on");
          if (null != var2Lifetime288) {
            SetMissionVotes.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime288);
          }
          var2Lifetime289 = HuffmanCodec.fetchLocalizedResource((byte) -30, "tutorial_repair_mode_off");
          if (var2Lifetime289 != null) {
            GetMissionTerrainVotingChancestep.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime289);
          }
          var2Lifetime290 = HuffmanCodec.fetchLocalizedResource((byte) -64, "tutorial_launch_fighters");
          if (var2Lifetime290 != null) {
            Cp1252Strings.decode((byte) -125, var2Lifetime290);
          }
          var2Lifetime291 = HuffmanCodec.fetchLocalizedResource((byte) -30, "tutorial_grappling_hook_select");
          if (null != var2Lifetime291) {
            OpenGlArbProgram.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime291);
          }
          var2Lifetime292 = HuffmanCodec.fetchLocalizedResource((byte) -16, "tutorial_grappling_hook_fire");
          if (null != var2Lifetime292) {
            SpriteTextureOperation.field_i = Cp1252Strings.decode((byte) -125, var2Lifetime292);
          }
          var2Lifetime293 = HuffmanCodec.fetchLocalizedResource((byte) -6, "tutorial_radial_menu");
          if (var2Lifetime293 != null) {
            TextureCombineSource.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime293);
          }
          var2Lifetime294 = HuffmanCodec.fetchLocalizedResource((byte) -26, "tutorial_save_blueprint");
          if (var2Lifetime294 != null) {
            SetCountermeasureLauncherAimarc.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime294);
          }
          var2Lifetime295 = HuffmanCodec.fetchLocalizedResource((byte) -111, "tutorial_weapon_energy");
          if (var2Lifetime295 != null) {
            TorpedoWeaponDefinition.field_d = Cp1252Strings.decode((byte) -125, var2Lifetime295);
          }
          var2Lifetime296 = HuffmanCodec.fetchLocalizedResource((byte) -99, "message_a_destroyed_b");
          if (var2Lifetime296 != null) {
            DebugRequestFactory.field_c = Cp1252Strings.decode((byte) -125, var2Lifetime296);
          }
          var2Lifetime297 = HuffmanCodec.fetchLocalizedResource((byte) -58, "message_a_connected");
          if (var2Lifetime297 != null) {
            SetReverbDamp.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime297);
          }
          var2Lifetime298 = HuffmanCodec.fetchLocalizedResource((byte) -47, "message_a_left");
          if (null != var2Lifetime298) {
            SetGrapplingHookCooldown.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime298);
          }
          var2Lifetime299 = HuffmanCodec.fetchLocalizedResource((byte) -106, "message_a_exploded");
          if (var2Lifetime299 != null) {
            SetMachineGunReload.field_q = Cp1252Strings.decode((byte) -125, var2Lifetime299);
          }
          var2Lifetime300 = HuffmanCodec.fetchLocalizedResource((byte) -14, "custom_variable_labels,0");
          if (var2Lifetime300 != null) {
            ParticleFactory.field_c[0] = Cp1252Strings.decode((byte) -125, var2Lifetime300);
          }
          var2Lifetime301 = HuffmanCodec.fetchLocalizedResource((byte) -92, "custom_variable_labels,1");
          if (var2Lifetime301 != null) {
            ParticleFactory.field_c[1] = Cp1252Strings.decode((byte) -125, var2Lifetime301);
          }
          var2Lifetime302 = HuffmanCodec.fetchLocalizedResource((byte) -106, "custom_variable_labels,2");
          if (null != var2Lifetime302) {
            ParticleFactory.field_c[2] = Cp1252Strings.decode((byte) -125, var2Lifetime302);
          }
          var2Lifetime303 = HuffmanCodec.fetchLocalizedResource((byte) -49, "custom_variable_labels,3");
          if (null != var2Lifetime303) {
            ParticleFactory.field_c[3] = Cp1252Strings.decode((byte) -125, var2Lifetime303);
          }
          var2Lifetime304 = HuffmanCodec.fetchLocalizedResource((byte) -112, "custom_variable_labels,4");
          if (null != var2Lifetime304) {
            ParticleFactory.field_c[4] = Cp1252Strings.decode((byte) -125, var2Lifetime304);
          }
          var2Lifetime305 = HuffmanCodec.fetchLocalizedResource((byte) -13, "custom_variable_labels,5");
          if (null != var2Lifetime305) {
            ParticleFactory.field_c[5] = Cp1252Strings.decode((byte) -125, var2Lifetime305);
          }
          var2Lifetime306 = HuffmanCodec.fetchLocalizedResource((byte) -13, "custom_variable_labels,6");
          if (null != var2Lifetime306) {
            ParticleFactory.field_c[6] = Cp1252Strings.decode((byte) -125, var2Lifetime306);
          }
          var2Lifetime307 = HuffmanCodec.fetchLocalizedResource((byte) -33, "custom_variable_labels,7");
          if (null != var2Lifetime307) {
            ParticleFactory.field_c[7] = Cp1252Strings.decode((byte) -125, var2Lifetime307);
          }
          var2Lifetime308 = HuffmanCodec.fetchLocalizedResource((byte) -83, "custom_variable_labels,8");
          if (var2Lifetime308 != null) {
            ParticleFactory.field_c[8] = Cp1252Strings.decode((byte) -125, var2Lifetime308);
          }
          var2Lifetime309 = HuffmanCodec.fetchLocalizedResource((byte) -65, "custom_variable_labels,9");
          if (var2Lifetime309 != null) {
            ParticleFactory.field_c[9] = Cp1252Strings.decode((byte) -125, var2Lifetime309);
          }
          var2Lifetime310 = HuffmanCodec.fetchLocalizedResource((byte) -74, "custom_variable_labels,10");
          if (null != var2Lifetime310) {
            ParticleFactory.field_c[10] = Cp1252Strings.decode((byte) -125, var2Lifetime310);
          }
          var2Lifetime311 = HuffmanCodec.fetchLocalizedResource((byte) -6, "custom_variable_labels,11");
          if (null != var2Lifetime311) {
            ParticleFactory.field_c[11] = Cp1252Strings.decode((byte) -125, var2Lifetime311);
          }
          var2Lifetime312 = HuffmanCodec.fetchLocalizedResource((byte) -21, "short_millisecond");
          if (null != var2Lifetime312) {
            GetFps.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime312);
          }
          var2Lifetime313 = HuffmanCodec.fetchLocalizedResource((byte) -63, "short_second");
          if (null != var2Lifetime313) {
            UiFocusableComponent.field_v = Cp1252Strings.decode((byte) -125, var2Lifetime313);
          }
          var2Lifetime314 = HuffmanCodec.fetchLocalizedResource((byte) -5, "short_minute");
          if (null != var2Lifetime314) {
            iw.field_D = Cp1252Strings.decode((byte) -125, var2Lifetime314);
          }
          var2Lifetime315 = HuffmanCodec.fetchLocalizedResource((byte) -95, "custom_variable_postlabels,0");
          if (null != var2Lifetime315) {
            SetUseBackgroundInFullscreen.field_o[0] = Cp1252Strings.decode((byte) -125, var2Lifetime315);
          }
          var2Lifetime316 = HuffmanCodec.fetchLocalizedResource((byte) -34, "custom_variable_postlabels,1");
          if (var2Lifetime316 != null) {
            SetUseBackgroundInFullscreen.field_o[1] = Cp1252Strings.decode((byte) -125, var2Lifetime316);
          }
          var2Lifetime317 = HuffmanCodec.fetchLocalizedResource((byte) -122, "custom_variable_postlabels,2");
          if (null != var2Lifetime317) {
            SetUseBackgroundInFullscreen.field_o[2] = Cp1252Strings.decode((byte) -125, var2Lifetime317);
          }
          var2Lifetime318 = HuffmanCodec.fetchLocalizedResource((byte) -96, "custom_variable_postlabels,3");
          if (var2Lifetime318 != null) {
            SetUseBackgroundInFullscreen.field_o[3] = Cp1252Strings.decode((byte) -125, var2Lifetime318);
          }
          var2Lifetime319 = HuffmanCodec.fetchLocalizedResource((byte) -44, "custom_variable_postlabels,4");
          if (var2Lifetime319 != null) {
            SetUseBackgroundInFullscreen.field_o[4] = Cp1252Strings.decode((byte) -125, var2Lifetime319);
          }
          var2Lifetime320 = HuffmanCodec.fetchLocalizedResource((byte) -103, "custom_variable_postlabels,5");
          if (null != var2Lifetime320) {
            SetUseBackgroundInFullscreen.field_o[5] = Cp1252Strings.decode((byte) -125, var2Lifetime320);
          }
          var2Lifetime321 = HuffmanCodec.fetchLocalizedResource((byte) -87, "custom_variable_postlabels,6");
          if (null != var2Lifetime321) {
            SetUseBackgroundInFullscreen.field_o[6] = Cp1252Strings.decode((byte) -125, var2Lifetime321);
          }
          var2Lifetime322 = HuffmanCodec.fetchLocalizedResource((byte) -85, "custom_variable_postlabels,7");
          if (var2Lifetime322 != null) {
            SetUseBackgroundInFullscreen.field_o[7] = Cp1252Strings.decode((byte) -125, var2Lifetime322);
          }
          var2Lifetime323 = HuffmanCodec.fetchLocalizedResource((byte) -19, "custom_variable_postlabels,8");
          if (var2Lifetime323 != null) {
            SetUseBackgroundInFullscreen.field_o[8] = Cp1252Strings.decode((byte) -125, var2Lifetime323);
          }
          var2Lifetime324 = HuffmanCodec.fetchLocalizedResource((byte) -33, "custom_variable_postlabels,9");
          if (null != var2Lifetime324) {
            SetUseBackgroundInFullscreen.field_o[9] = Cp1252Strings.decode((byte) -125, var2Lifetime324);
          }
          var2Lifetime325 = HuffmanCodec.fetchLocalizedResource((byte) -124, "custom_variable_postlabels,10");
          if (null != var2Lifetime325) {
            SetUseBackgroundInFullscreen.field_o[10] = Cp1252Strings.decode((byte) -125, var2Lifetime325);
          }
          var2Lifetime326 = HuffmanCodec.fetchLocalizedResource((byte) -8, "custom_variable_postlabels,11");
          if (null != var2Lifetime326) {
            SetUseBackgroundInFullscreen.field_o[11] = Cp1252Strings.decode((byte) -125, var2Lifetime326);
          }
          var2Lifetime327 = HuffmanCodec.fetchLocalizedResource((byte) -45, "gamename");
          if (var2Lifetime327 != null) {
            PlayerVoteFactory.field_a = Cp1252Strings.decode((byte) -125, var2Lifetime327);
          }
          var2Lifetime328 = HuffmanCodec.fetchLocalizedResource((byte) -120, "error");
          if (var2Lifetime328 != null) {
            ro.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime328);
          }
          var2Lifetime329 = HuffmanCodec.fetchLocalizedResource((byte) -105, "toggle_tips_on");
          if (var2Lifetime329 != null) {
            GetSalvoaim.field_p = Cp1252Strings.decode((byte) -125, var2Lifetime329);
          }
          var2Lifetime330 = HuffmanCodec.fetchLocalizedResource((byte) -52, "toggle_tips_off");
          if (var2Lifetime330 != null) {
            SetBombletSprayProjectileOndamageParticles.field_o = Cp1252Strings.decode((byte) -125, var2Lifetime330);
          }
          var2Lifetime331 = HuffmanCodec.fetchLocalizedResource((byte) -22, "copy_to_clipboard");
          if (var2Lifetime331 != null) {
            SpawnChoiceFactory.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime331);
          }
          var2Lifetime332 = HuffmanCodec.fetchLocalizedResource((byte) -100, "copied_to_clipboard");
          if (var2Lifetime332 != null) {
            ParticleFactory.field_b = Cp1252Strings.decode((byte) -125, var2Lifetime332);
          }
          MidiEnvelope.localizationArchive = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_1173_0 = var2_ref;
          stackIn_1173_1 = new StringBuilder().append("aib.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_1174_2 = "null";
          } else {
            stackIn_1174_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_1173_0), ((StringBuilder) (Object) stackIn_1173_1).append(stackIn_1174_2).append(')').toString());
        }
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1) {
            this.writeCompactState((IsaacPacketBuffer) null, (byte) 39);
          }
          stackIn_7_1 = !(param1);
          this.selectForRevisionUpdates(stackIn_7_1);
          this.asteroids = (Asteroid[]) (SetAutoDetail.a(10, tob.field_o, param0, 1, -70, this.asteroids));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("aib.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int getParagraphHeight(byte param0, String param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -37) {
            AsteroidField.getParagraphHeight((byte) 0, (String) null, -53, 66, 33);
          }
          if (!OpenGlTexture1D.field_i) {
            stackIn_7_0 = ita.a(param3, param0 + 8025).getParagraphHeight(param1, param4, param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = SetTorpedoEnergyUsed.a(param3, 300).a(param1, param2, param4, (byte) 112, (ToolkitSprite[]) null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("aib.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 <= 13) {
            AsteroidField.clearSharedReferences((byte) -107);
          }
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "aib.I(" + param0 + ')');
        }
    }

    final Asteroid[] getAsteroids(int param0) {
        RuntimeException var2 = null;
        Asteroid[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.markChanged(20);
          }
          stackIn_4_0 = this.asteroids;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2), "aib.N(" + param0 + ')');
        }
    }

    final boolean addAsteroid(World param0, int param1, Asteroid param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 16520) {
            this.copyTo((byte) -73, (SerializableGameState) null);
          }
          var4_int = param0.addBodyToArray(param1 + 13131, param2, this.asteroids, 2) ? 1 : 0;
          if (var4_int != 0) {
            this.markChanged(param1 ^ -16566);
          }
          stackIn_7_0 = var4_int;
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("aib.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void selectForRevisionUpdates(boolean param0) {
        try {
          IntegerNode.setAsteroidFieldForRevisionUpdates(this, (byte) 96);
          if (!param0) {
            AsteroidField.loadLocalizedTextAndKeyBindings((byte) 105, (ResourceArchive) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aib.O(" + param0 + ')');
        }
    }

    final void markChanged(int param0) {
        int fieldTemp$0 = 0;
        try {
          fieldTemp$0 = LoadBlackboxRecording.field_q;
          LoadBlackboxRecording.field_q = LoadBlackboxRecording.field_q + 1;
          this.revision = fieldTemp$0;
          if (param0 >= -37) {
            this.addAsteroid((World) null, 6, (Asteroid) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aib.J(" + param0 + ')');
        }
    }

    public final void readCompactState(IsaacPacketBuffer param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 32) {
            field_b = (String) null;
          }
          this.asteroids = (Asteroid[]) (GetAutoAfkTimeout.a(param1 ^ 35, 1, this.asteroids, tob.field_o, 10, param0));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("aib.L(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void writeCompactState(IsaacPacketBuffer param0, byte param1) {
        IsaacPacketBuffer var3 = null;
        Asteroid[] var4 = null;
        int var5 = 0;
        Asteroid[] var6 = null;
        int var7 = 0;
        Asteroid var8 = null;
        int var9 = 0;
        int stackIn_8_0 = 0;
        IsaacPacketBuffer stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        boolean stackIn_18_2 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var9 = VoidHunters.field_G;
        try {
          if (param1 >= -91) {
            this.readState((IsaacPacketBuffer) null, true);
          }
          var3 = param0;
          var4 = this.asteroids;
          if (var4 == null) {
            stackIn_8_0 = 0;
          } else {
            stackIn_8_0 = var4.length;
          }
          var5 = stackIn_8_0;
          var3.writeBits(-632, var5, 10);
          if (var5 != 0) {
            var6 = var4;
            var7 = 0;
            while (var6.length > var7) {
              var8 = var6[var7];
              if (var9 != 0) {
                return;
              }
              stackIn_17_0 = var3;
              stackIn_17_1 = -111;
              stackIn_18_2 = (var8 != null);
              if (vq.writeBoolean(stackIn_17_0, stackIn_17_1, stackIn_18_2)) {
                ((CompactGameState) ((Object) var8)).writeCompactState(var3, (byte) -127);
              }
              var7++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_27_0 = var3_ref;
          stackIn_27_1 = new StringBuilder().append("aib.E(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    AsteroidField() {
        this.revision = 0;
        this.markChanged(-41);
    }

    AsteroidField(int param0) {
        this.revision = 0;
        this.markChanged(-41);
        try {
          this.asteroids = new Asteroid[param0];
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aib.<init>(" + param0 + ')');
        }
    }

    static {
        field_c = 0.0;
        field_b = "Reject <%0> from this game";
    }
}
