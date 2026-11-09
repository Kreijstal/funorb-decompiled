/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveCatalog {
    private PacketBuffer masterIndex;
    static SpriteData field_f;
    private CachedArchiveProvider[] providers;
    static long field_a;
    private NetworkResourceRequest masterRequest;
    private Js5Client networkClient;
    private CacheIoWorker cacheWorker;
    private java.math.BigInteger rsaExponent;
    private java.math.BigInteger rsaModulus;
    static int field_c;

    final static void a(boolean param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (HardwareRidgedWaterNoise.field_x > 0) {
            if (SecondaryNodeDequeIterator.field_b != null) {
              CompactMeshGeometry.field_o = SecondaryNodeDequeIterator.field_b.g(109);
              jl.a(25, 2);
              if (var3 != 0) {
                CompactMeshGeometry.field_o = pb.a(640, 8089, 0, 480, lt.field_m, 0);
              }
            } else {
              CompactMeshGeometry.field_o = pb.a(640, 8089, 0, 480, lt.field_m, 0);
            }
            if (null == CompactMeshGeometry.field_o) {
              var2_int = 3;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              var2_int = 2;
              db.a(false, CompactMeshGeometry.field_o);
              if (var3 != 0) {
                if (!vs.b((byte) 9)) {
                  var2_int = 1;
                  var2_int = 0;
                } else {
                  var2_int = 0;
                }
              }
            }
          } else {
            if (!vs.b((byte) 9)) {
              var2_int = 1;
              if (var3 != 0) {
                var2_int = 0;
              }
            } else {
              var2_int = 0;
            }
          }
          if (SecondaryNodeDequeIterator.field_b == null &&
            BufferedSocket.field_f) {
            ScreenNameValidator.a(param0, var2_int, (byte) -28);
          }
          if (param1) {
            field_a = -94L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "rj.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -94) {
            ArchiveCatalog.a((byte) 97, (String) null);
          }
          SoftwareRenderContext.field_b = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("rj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final CachedArchiveProvider archiveProvider(boolean guard, int archiveId, SectorCacheStore indexCache, boolean discardCompleted, SectorCacheStore groupCache) {
        CachedArchiveProvider stackIn_12_0 = null;
        PacketBuffer stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        CachedArchiveProvider stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        CachedArchiveProvider var9 = null;
        try {
          if (this.masterIndex == null) {
            throw new RuntimeException();
          }
          if (0 <= archiveId &&
            archiveId < this.providers.length) {
            if (null != this.providers[archiveId]) {
              stackIn_12_0 = this.providers[archiveId];
              return stackIn_12_0;
            }
            this.masterIndex.position = 72 * archiveId + 6;
            if (guard) {
              ArchiveCatalog.a((ResourceArchive) null, 4);
            }
            var6_int = this.masterIndex.readInt(true);
            stackIn_19_0 = this.masterIndex;
            stackIn_20_1 = !(guard);
            var7 = ((PacketBuffer) (Object) stackIn_19_0).readInt(stackIn_20_1);
            var8 = new byte[64];
            this.masterIndex.readBytes(var8, 64, 0, (byte) -99);
            var9 = new CachedArchiveProvider(archiveId, groupCache, indexCache, this.networkClient, this.cacheWorker, var6_int, var8, var7, discardCompleted);
            this.providers[archiveId] = var9;
            stackIn_21_0 = var9;
            return stackIn_21_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_25_0 = var6;
          stackIn_25_1 = new StringBuilder().append("rj.F(").append(guard).append(',').append(archiveId).append(',');
          if (indexCache == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(discardCompleted).append(',');
          if (groupCache == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final boolean loadMasterIndex(byte guard) {
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException decompiledCaughtException = null;
        PacketBuffer var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        byte[] var6_array = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null != this.masterIndex) {
            return true;
          }
          if (null == this.masterRequest) {
            if (this.networkClient.urgentQueueFull(44)) {
              return false;
            }
            this.masterRequest = this.networkClient.requestGroup(255, true, 255, (byte) 47, (byte) 0);
          }
          if (this.masterRequest.pending) {
            return false;
          }
          var2 = new PacketBuffer(this.masterRequest.completedBytes(false));
          var2.position = 5;
          var3 = var2.readUnsignedByte(-31302);
          var2.position = var2.position + var3 * 72;
          var4 = new byte[var2.payload.length - var2.position];
          var2.readBytes(var4, var4.length, 0, (byte) -92);
          if (this.rsaExponent != null &&
            null != this.rsaModulus) {
            var6 = new java.math.BigInteger(var4);
            var7_ref_java_math_BigInteger = var6.modPow(this.rsaExponent, this.rsaModulus);
            var5 = var7_ref_java_math_BigInteger.toByteArray();
            if (var8 != 0) {
              var5 = var4;
            }
          } else {
            var5 = var4;
          }
          if (var5.length != 65) {
            throw new RuntimeException();
          }
          var6_array = gn.whirlpoolDigest(var2.payload, (byte) -120, 5, -5 + (var2.position - var4.length));
          var7 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 >= 64))) {
            stackIn_33_0 = ~var6_array[var7];
            stackIn_33_1 = ~var5[1 + var7];
            if (var8 == 0) {
              if (stackIn_33_0 != stackIn_33_1) {
                throw new RuntimeException();
              }
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.providers = new CachedArchiveProvider[var3];
            this.masterIndex = var2;
            stackIn_33_0 = 120;
            stackIn_33_1 = (64 - guard) / 57;
          }
          var7Lifetime1 = stackIn_33_0 % stackIn_33_1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "rj.A(" + guard + ')');
        }
    }

    final void serviceProviders(byte guard) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.providers == null) {
            return;
          }
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.providers.length <= var2_int))) {
            if (var4 == 0) {
              if (this.providers[var2_int] != null) {
                this.providers[var2_int].servicePriorityGroups(-102);
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var2_int = 0;
          }
          var3 = 39 % ((-36 - guard) / 62);
          while (this.providers.length > var2_int) {
            if (var4 != 0) {
              return;
            }
            if (null != this.providers[var2_int]) {
              this.providers[var2_int].service(-84);
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rj.G(" + guard + ')');
        }
    }

    public static void a(int param0) {
        try {
          field_f = null;
          if (param0 != 2) {
            ArchiveCatalog.a(true, true);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rj.H(" + param0 + ')');
        }
    }

    final static void a(ResourceArchive param0, int param1) {
        RuntimeException stackIn_870_0 = null;
        StringBuilder stackIn_870_1 = null;
        String stackIn_871_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
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
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          Drone.field_J = param0;
          var2 = ke.a((byte) 98, "gamename");
          if (var2 != null) {
            MusicVoice.a(param1 ^ -5, var2);
          }
          var2Lifetime1 = ke.a((byte) 99, "youwon");
          if (var2Lifetime1 != null) {
            MusicVoice.a(0, var2Lifetime1);
          }
          var2Lifetime2 = ke.a((byte) 112, "institle");
          if (null != var2Lifetime2) {
            br.instructionsText = MusicVoice.a(param1 ^ -5, var2Lifetime2);
          }
          var2Lifetime3 = ke.a((byte) 113, "scoretitle");
          if (var2Lifetime3 != null) {
            se.scoreText = MusicVoice.a(param1 ^ -5, var2Lifetime3);
          }
          var2Lifetime4 = ke.a((byte) 88, "nametitle");
          if (var2Lifetime4 != null) {
            pd.nameText = MusicVoice.a(param1 ^ -5, var2Lifetime4);
          }
          var2Lifetime5 = ke.a((byte) 121, "bsths");
          if (var2Lifetime5 != null) {
            jm.bestHiscoresText = MusicVoice.a(param1 ^ -5, var2Lifetime5);
          }
          var2Lifetime6 = ke.a((byte) 112, "myhs");
          if (var2Lifetime6 != null) {
            SpriteState.myHiscoresText = MusicVoice.a(param1 ^ -5, var2Lifetime6);
          }
          var2Lifetime7 = ke.a((byte) 122, "allhs");
          if (null != var2Lifetime7) {
            wq.allHiscoresText = MusicVoice.a(param1 + 5, var2Lifetime7);
          }
          var2Lifetime8 = ke.a((byte) 106, "thisishidden");
          if (null != var2Lifetime8) {
            jf.thisIsAHiddenText = MusicVoice.a(0, var2Lifetime8);
          }
          var2Lifetime9 = ke.a((byte) 99, "orbcoin");
          if (null != var2Lifetime9) {
            MusicVoice.a(0, var2Lifetime9);
          }
          var2Lifetime10 = ke.a((byte) 127, "unknownstuff");
          if (var2Lifetime10 != null) {
            MusicVoice.field_s = MusicVoice.a(param1 + 5, var2Lifetime10);
          }
          var2Lifetime11 = ke.a((byte) 120, "orbpoints");
          if (var2Lifetime11 != null) {
            NameSuggestionsPanel.orbPointsText = MusicVoice.a(0, var2Lifetime11);
          }
          var2Lifetime12 = ke.a((byte) 102, "achievethisgame");
          if (null != var2Lifetime12) {
            SoftLruCache.achievementsThisGameText = MusicVoice.a(param1 + 5, var2Lifetime12);
          }
          var2Lifetime13 = ke.a((byte) 107, "achieve");
          if (var2Lifetime13 != null) {
            Js5Client.achievementsText = MusicVoice.a(0, var2Lifetime13);
          }
          var2Lifetime14 = ke.a((byte) 112, "thousandseperator");
          if (var2Lifetime14 != null) {
            PrimitiveType.field_a = MusicVoice.a(0, var2Lifetime14);
          }
          var2Lifetime15 = ke.a((byte) 100, "multiplier");
          if (var2Lifetime15 != null) {
            MusicVoice.a(param1 + 5, var2Lifetime15);
          }
          var2Lifetime16 = ke.a((byte) 92, "startgame");
          if (null != var2Lifetime16) {
            k.startGameText = MusicVoice.a(0, var2Lifetime16);
          }
          var2Lifetime17 = ke.a((byte) 114, "startarcadegame");
          if (null != var2Lifetime17) {
            dn.arcadeGameText = MusicVoice.a(0, var2Lifetime17);
          }
          var2Lifetime18 = ke.a((byte) 103, "arcadescores");
          if (var2Lifetime18 != null) {
            TimedSceneEffect.challengeText = MusicVoice.a(0, var2Lifetime18);
          }
          var2Lifetime19 = ke.a((byte) 123, "regularscores");
          if (null != var2Lifetime19) {
            DropDownListWidget.regularText = MusicVoice.a(param1 + 5, var2Lifetime19);
          }
          var2Lifetime20 = ke.a((byte) 119, "editorTx");
          if (null != var2Lifetime20) {
            MusicPatch.editorText = MusicVoice.a(0, var2Lifetime20);
          }
          var2Lifetime21 = ke.a((byte) 119, "challengeModeTx");
          if (null != var2Lifetime21) {
            pt.challengeText = MusicVoice.a(0, var2Lifetime21);
          }
          var2Lifetime22 = ke.a((byte) 117, "optionsTx");
          if (null != var2Lifetime22) {
            MatchingTextValidator.optionsText = MusicVoice.a(0, var2Lifetime22);
          }
          var2Lifetime23 = ke.a((byte) 113, "difficultyTx");
          if (null != var2Lifetime23) {
            ea.difficultyText = MusicVoice.a(param1 ^ -5, var2Lifetime23);
          }
          var2Lifetime24 = ke.a((byte) 93, "difficultyLevelTx,0");
          if (var2Lifetime24 != null) {
            ge.difficultyNames[0] = MusicVoice.a(0, var2Lifetime24);
          }
          var2Lifetime25 = ke.a((byte) 98, "difficultyLevelTx,1");
          if (null != var2Lifetime25) {
            ge.difficultyNames[1] = MusicVoice.a(0, var2Lifetime25);
          }
          var2Lifetime26 = ke.a((byte) 103, "resetTx");
          if (var2Lifetime26 != null) {
            lh.resetStatsText = MusicVoice.a(0, var2Lifetime26);
          }
          var2Lifetime27 = ke.a((byte) 105, "dialogOptionsTx,0");
          if (var2Lifetime27 != null) {
            lb.yesNoLabels[0] = MusicVoice.a(0, var2Lifetime27);
          }
          var2Lifetime28 = ke.a((byte) 124, "dialogOptionsTx,1");
          if (null != var2Lifetime28) {
            lb.yesNoLabels[1] = MusicVoice.a(0, var2Lifetime28);
          }
          var2Lifetime29 = ke.a((byte) 105, "areYouSure");
          if (var2Lifetime29 != null) {
            vq.areYouSureYouText = MusicVoice.a(param1 ^ -5, var2Lifetime29);
          }
          var2Lifetime30 = ke.a((byte) 102, "continueTx");
          if (null != var2Lifetime30) {
            hc.continueToNextLevelText = MusicVoice.a(0, var2Lifetime30);
          }
          var2Lifetime31 = ke.a((byte) 93, "continueOptionsTx,0");
          if (var2Lifetime31 != null) {
            vd.field_a[0] = MusicVoice.a(0, var2Lifetime31);
          }
          var2Lifetime32 = ke.a((byte) 122, "continueOptionsTx,1");
          if (null != var2Lifetime32) {
            vd.field_a[1] = MusicVoice.a(0, var2Lifetime32);
          }
          var2Lifetime33 = ke.a((byte) 127, "continueOptTx");
          if (null != var2Lifetime33) {
            VertexAttribute.continueText = MusicVoice.a(0, var2Lifetime33);
          }
          var2Lifetime34 = ke.a((byte) 125, "restartLevel");
          if (var2Lifetime34 != null) {
            ss.restartLevelText = MusicVoice.a(param1 ^ -5, var2Lifetime34);
          }
          var2Lifetime35 = ke.a((byte) 98, "returnToLevelSelect");
          if (null != var2Lifetime35) {
            mm.levelSelectText = MusicVoice.a(0, var2Lifetime35);
          }
          var2Lifetime36 = ke.a((byte) 92, "restartChallenge");
          if (var2Lifetime36 != null) {
            MusicVoice.a(param1 + 5, var2Lifetime36);
          }
          var2Lifetime37 = ke.a((byte) 110, "returnToMainMenu");
          if (var2Lifetime37 != null) {
            InteractiveWidget.returnToMainMenuText = MusicVoice.a(0, var2Lifetime37);
          }
          var2Lifetime38 = ke.a((byte) 114, "respecTx");
          if (var2Lifetime38 != null) {
            hv.reassignText = MusicVoice.a(0, var2Lifetime38);
          }
          var2Lifetime39 = ke.a((byte) 110, "respecTitle");
          if (var2Lifetime39 != null) {
            bw.reassignPowerupsText = MusicVoice.a(0, var2Lifetime39);
          }
          var2Lifetime40 = ke.a((byte) 127, "respecInstructions");
          if (var2Lifetime40 != null) {
            wh.clickToAssignPointsText = MusicVoice.a(0, var2Lifetime40);
          }
          var2Lifetime41 = ke.a((byte) 110, "pointsRemaining");
          if (null != var2Lifetime41) {
            HotspotTextWidget.pointsRemainingText = MusicVoice.a(0, var2Lifetime41);
          }
          var2Lifetime42 = ke.a((byte) 104, "cancelTx");
          if (var2Lifetime42 != null) {
            MusicVoice.a(param1 ^ -5, var2Lifetime42);
          }
          var2Lifetime43 = ke.a((byte) 88, "saveTx");
          if (null != var2Lifetime43) {
            ScreenNameValidator.field_g = MusicVoice.a(0, var2Lifetime43);
          }
          var2Lifetime44 = ke.a((byte) 105, "congratulations");
          if (null != var2Lifetime44) {
            MusicVoice.a(0, var2Lifetime44);
          }
          var2Lifetime45 = ke.a((byte) 124, "hardModeNowAvailable");
          if (var2Lifetime45 != null) {
            MusicVoice.a(0, var2Lifetime45);
          }
          var2Lifetime46 = ke.a((byte) 101, "movementTip");
          if (null != var2Lifetime46) {
            MusicVoice.a(param1 ^ -5, var2Lifetime46);
          }
          var2Lifetime47 = ke.a((byte) 113, "blastTip");
          if (null != var2Lifetime47) {
            MusicVoice.a(param1 + 5, var2Lifetime47);
          }
          var2Lifetime48 = ke.a((byte) 116, "keycode_left");
          if (var2Lifetime48 != null) {
            SoftwareRenderContext.field_d = 255 & var2Lifetime48[0];
          }
          var2Lifetime49 = ke.a((byte) 88, "keycode_right");
          if (null != var2Lifetime49) {
            LegacyOpenGlGraphicsHeap.field_o = 255 & var2Lifetime49[0];
          }
          var2Lifetime50 = ke.a((byte) 88, "keycode_up");
          if (var2Lifetime50 != null) {
            nv.field_c = var2Lifetime50[0] & 255;
          }
          var2Lifetime51 = ke.a((byte) 106, "keycode_down");
          if (var2Lifetime51 != null) {
            Sumoblitz.field_I = var2Lifetime51[0] & 255;
          }
          var2Lifetime52 = ke.a((byte) 126, "achievement_names,0");
          if (var2Lifetime52 != null) {
            ArchiveProvider.achievementNames[0] = MusicVoice.a(0, var2Lifetime52);
          }
          var2Lifetime53 = ke.a((byte) 108, "achievement_names,1");
          if (null != var2Lifetime53) {
            ArchiveProvider.achievementNames[1] = MusicVoice.a(0, var2Lifetime53);
          }
          var2Lifetime54 = ke.a((byte) 112, "achievement_names,2");
          if (null != var2Lifetime54) {
            ArchiveProvider.achievementNames[2] = MusicVoice.a(param1 + 5, var2Lifetime54);
          }
          var2Lifetime55 = ke.a((byte) 88, "achievement_names,3");
          if (null != var2Lifetime55) {
            ArchiveProvider.achievementNames[3] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime55);
          }
          var2Lifetime56 = ke.a((byte) 103, "achievement_names,4");
          if (var2Lifetime56 != null) {
            ArchiveProvider.achievementNames[4] = MusicVoice.a(0, var2Lifetime56);
          }
          var2Lifetime57 = ke.a((byte) 92, "achievement_names,5");
          if (null != var2Lifetime57) {
            ArchiveProvider.achievementNames[5] = MusicVoice.a(0, var2Lifetime57);
          }
          var2Lifetime58 = ke.a((byte) 99, "achievement_names,6");
          if (null != var2Lifetime58) {
            ArchiveProvider.achievementNames[6] = MusicVoice.a(0, var2Lifetime58);
          }
          var2Lifetime59 = ke.a((byte) 95, "achievement_names,7");
          if (null != var2Lifetime59) {
            ArchiveProvider.achievementNames[7] = MusicVoice.a(param1 + 5, var2Lifetime59);
          }
          var2Lifetime60 = ke.a((byte) 113, "achievement_names,8");
          if (null != var2Lifetime60) {
            ArchiveProvider.achievementNames[8] = MusicVoice.a(0, var2Lifetime60);
          }
          var2Lifetime61 = ke.a((byte) 122, "achievement_names,9");
          if (var2Lifetime61 != null) {
            ArchiveProvider.achievementNames[9] = MusicVoice.a(0, var2Lifetime61);
          }
          var2Lifetime62 = ke.a((byte) 95, "achievement_names,10");
          if (null != var2Lifetime62) {
            ArchiveProvider.achievementNames[10] = MusicVoice.a(0, var2Lifetime62);
          }
          var2Lifetime63 = ke.a((byte) 93, "achievement_names,11");
          if (null != var2Lifetime63) {
            ArchiveProvider.achievementNames[11] = MusicVoice.a(0, var2Lifetime63);
          }
          var2Lifetime64 = ke.a((byte) 104, "achievement_names,12");
          if (var2Lifetime64 != null) {
            ArchiveProvider.achievementNames[12] = MusicVoice.a(param1 + 5, var2Lifetime64);
          }
          var2Lifetime65 = ke.a((byte) 104, "achievement_names,13");
          if (var2Lifetime65 != null) {
            ArchiveProvider.achievementNames[13] = MusicVoice.a(0, var2Lifetime65);
          }
          var2Lifetime66 = ke.a((byte) 116, "achievement_names,14");
          if (var2Lifetime66 != null) {
            ArchiveProvider.achievementNames[14] = MusicVoice.a(0, var2Lifetime66);
          }
          var2Lifetime67 = ke.a((byte) 97, "achievement_names,15");
          if (null != var2Lifetime67) {
            ArchiveProvider.achievementNames[15] = MusicVoice.a(0, var2Lifetime67);
          }
          var2Lifetime68 = ke.a((byte) 125, "achievement_names,16");
          if (null != var2Lifetime68) {
            ArchiveProvider.achievementNames[16] = MusicVoice.a(0, var2Lifetime68);
          }
          var2Lifetime69 = ke.a((byte) 109, "achievement_names,17");
          if (null != var2Lifetime69) {
            ArchiveProvider.achievementNames[17] = MusicVoice.a(0, var2Lifetime69);
          }
          var2Lifetime70 = ke.a((byte) 124, "achievement_names,18");
          if (null != var2Lifetime70) {
            ArchiveProvider.achievementNames[18] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime70);
          }
          var2Lifetime71 = ke.a((byte) 104, "achievement_names,19");
          if (var2Lifetime71 != null) {
            ArchiveProvider.achievementNames[19] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime71);
          }
          var2Lifetime72 = ke.a((byte) 114, "achievement_names,20");
          if (null != var2Lifetime72) {
            ArchiveProvider.achievementNames[20] = MusicVoice.a(0, var2Lifetime72);
          }
          var2Lifetime73 = ke.a((byte) 110, "achievement_names,21");
          if (var2Lifetime73 != null) {
            ArchiveProvider.achievementNames[21] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime73);
          }
          var2Lifetime74 = ke.a((byte) 127, "achievement_names,22");
          if (var2Lifetime74 != null) {
            ArchiveProvider.achievementNames[22] = MusicVoice.a(0, var2Lifetime74);
          }
          var2Lifetime75 = ke.a((byte) 122, "achievement_names,23");
          if (null != var2Lifetime75) {
            ArchiveProvider.achievementNames[23] = MusicVoice.a(0, var2Lifetime75);
          }
          var2Lifetime76 = ke.a((byte) 98, "achievement_names,24");
          if (var2Lifetime76 != null) {
            ArchiveProvider.achievementNames[24] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime76);
          }
          var2Lifetime77 = ke.a((byte) 95, "achievement_names,25");
          if (null != var2Lifetime77) {
            ArchiveProvider.achievementNames[25] = MusicVoice.a(0, var2Lifetime77);
          }
          var2Lifetime78 = ke.a((byte) 102, "achievement_names,26");
          if (var2Lifetime78 != null) {
            ArchiveProvider.achievementNames[26] = MusicVoice.a(0, var2Lifetime78);
          }
          var2Lifetime79 = ke.a((byte) 122, "achievement_names,27");
          if (var2Lifetime79 != null) {
            ArchiveProvider.achievementNames[27] = MusicVoice.a(0, var2Lifetime79);
          }
          var2Lifetime80 = ke.a((byte) 110, "achievement_criteria,0");
          if (var2Lifetime80 != null) {
            DraggableWidget.achievementDescriptions[0] = MusicVoice.a(0, var2Lifetime80);
          }
          var2Lifetime81 = ke.a((byte) 120, "achievement_criteria,1");
          if (var2Lifetime81 != null) {
            DraggableWidget.achievementDescriptions[1] = MusicVoice.a(0, var2Lifetime81);
          }
          var2Lifetime82 = ke.a((byte) 88, "achievement_criteria,2");
          if (null != var2Lifetime82) {
            DraggableWidget.achievementDescriptions[2] = MusicVoice.a(0, var2Lifetime82);
          }
          var2Lifetime83 = ke.a((byte) 92, "achievement_criteria,3");
          if (null != var2Lifetime83) {
            DraggableWidget.achievementDescriptions[3] = MusicVoice.a(param1 + 5, var2Lifetime83);
          }
          var2Lifetime84 = ke.a((byte) 92, "achievement_criteria,4");
          if (null != var2Lifetime84) {
            DraggableWidget.achievementDescriptions[4] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime84);
          }
          var2Lifetime85 = ke.a((byte) 99, "achievement_criteria,5");
          if (var2Lifetime85 != null) {
            DraggableWidget.achievementDescriptions[5] = MusicVoice.a(0, var2Lifetime85);
          }
          var2Lifetime86 = ke.a((byte) 120, "achievement_criteria,6");
          if (var2Lifetime86 != null) {
            DraggableWidget.achievementDescriptions[6] = MusicVoice.a(0, var2Lifetime86);
          }
          var2Lifetime87 = ke.a((byte) 109, "achievement_criteria,7");
          if (null != var2Lifetime87) {
            DraggableWidget.achievementDescriptions[7] = MusicVoice.a(0, var2Lifetime87);
          }
          var2Lifetime88 = ke.a((byte) 92, "achievement_criteria,8");
          if (var2Lifetime88 != null) {
            DraggableWidget.achievementDescriptions[8] = MusicVoice.a(0, var2Lifetime88);
          }
          var2Lifetime89 = ke.a((byte) 113, "achievement_criteria,9");
          if (null != var2Lifetime89) {
            DraggableWidget.achievementDescriptions[9] = MusicVoice.a(0, var2Lifetime89);
          }
          var2Lifetime90 = ke.a((byte) 90, "achievement_criteria,10");
          if (null != var2Lifetime90) {
            DraggableWidget.achievementDescriptions[10] = MusicVoice.a(0, var2Lifetime90);
          }
          var2Lifetime91 = ke.a((byte) 92, "achievement_criteria,11");
          if (var2Lifetime91 != null) {
            DraggableWidget.achievementDescriptions[11] = MusicVoice.a(0, var2Lifetime91);
          }
          var2Lifetime92 = ke.a((byte) 99, "achievement_criteria,12");
          if (var2Lifetime92 != null) {
            DraggableWidget.achievementDescriptions[12] = MusicVoice.a(0, var2Lifetime92);
          }
          var2Lifetime93 = ke.a((byte) 88, "achievement_criteria,13");
          if (null != var2Lifetime93) {
            DraggableWidget.achievementDescriptions[13] = MusicVoice.a(0, var2Lifetime93);
          }
          var2Lifetime94 = ke.a((byte) 101, "achievement_criteria,14");
          if (null != var2Lifetime94) {
            DraggableWidget.achievementDescriptions[14] = MusicVoice.a(param1 + 5, var2Lifetime94);
          }
          if (param1 != -5) {
            ArchiveCatalog.a((byte) 119, (String) null);
          }
          var2Lifetime95 = ke.a((byte) 113, "achievement_criteria,15");
          if (null != var2Lifetime95) {
            DraggableWidget.achievementDescriptions[15] = MusicVoice.a(0, var2Lifetime95);
          }
          var2Lifetime96 = ke.a((byte) 92, "achievement_criteria,16");
          if (null != var2Lifetime96) {
            DraggableWidget.achievementDescriptions[16] = MusicVoice.a(0, var2Lifetime96);
          }
          var2Lifetime97 = ke.a((byte) 94, "achievement_criteria,17");
          if (null != var2Lifetime97) {
            DraggableWidget.achievementDescriptions[17] = MusicVoice.a(0, var2Lifetime97);
          }
          var2Lifetime98 = ke.a((byte) 119, "achievement_criteria,18");
          if (null != var2Lifetime98) {
            DraggableWidget.achievementDescriptions[18] = MusicVoice.a(0, var2Lifetime98);
          }
          var2Lifetime99 = ke.a((byte) 100, "achievement_criteria,19");
          if (null != var2Lifetime99) {
            DraggableWidget.achievementDescriptions[19] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime99);
          }
          var2Lifetime100 = ke.a((byte) 101, "achievement_criteria,20");
          if (null != var2Lifetime100) {
            DraggableWidget.achievementDescriptions[20] = MusicVoice.a(0, var2Lifetime100);
          }
          var2Lifetime101 = ke.a((byte) 114, "achievement_criteria,21");
          if (var2Lifetime101 != null) {
            DraggableWidget.achievementDescriptions[21] = MusicVoice.a(param1 + 5, var2Lifetime101);
          }
          var2Lifetime102 = ke.a((byte) 105, "achievement_criteria,22");
          if (null != var2Lifetime102) {
            DraggableWidget.achievementDescriptions[22] = MusicVoice.a(0, var2Lifetime102);
          }
          var2Lifetime103 = ke.a((byte) 94, "achievement_criteria,23");
          if (null != var2Lifetime103) {
            DraggableWidget.achievementDescriptions[23] = MusicVoice.a(0, var2Lifetime103);
          }
          var2Lifetime104 = ke.a((byte) 93, "achievement_criteria,24");
          if (var2Lifetime104 != null) {
            DraggableWidget.achievementDescriptions[24] = MusicVoice.a(0, var2Lifetime104);
          }
          var2Lifetime105 = ke.a((byte) 105, "achievement_criteria,25");
          if (null != var2Lifetime105) {
            DraggableWidget.achievementDescriptions[25] = MusicVoice.a(0, var2Lifetime105);
          }
          var2Lifetime106 = ke.a((byte) 92, "achievement_criteria,26");
          if (null != var2Lifetime106) {
            DraggableWidget.achievementDescriptions[26] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime106);
          }
          var2Lifetime107 = ke.a((byte) 92, "achievement_criteria,27");
          if (null != var2Lifetime107) {
            DraggableWidget.achievementDescriptions[27] = MusicVoice.a(0, var2Lifetime107);
          }
          var2Lifetime108 = ke.a((byte) 121, "score_colon_space");
          if (var2Lifetime108 != null) {
            MusicVoice.a(param1 + 5, var2Lifetime108);
          }
          var2Lifetime109 = ke.a((byte) 109, "instructionsPageObjective,0");
          if (null != var2Lifetime109) {
            GameInstructions.objectiveHelpLines[0] = MusicVoice.a(0, var2Lifetime109);
          }
          var2Lifetime110 = ke.a((byte) 117, "instructionsPageObjective,1");
          if (null != var2Lifetime110) {
            GameInstructions.objectiveHelpLines[1] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime110);
          }
          var2Lifetime111 = ke.a((byte) 101, "instructionsPageObjective,2");
          if (null != var2Lifetime111) {
            GameInstructions.objectiveHelpLines[2] = MusicVoice.a(0, var2Lifetime111);
          }
          var2Lifetime112 = ke.a((byte) 109, "instructionsPageControls,0");
          if (var2Lifetime112 != null) {
            GameInstructions.controlsHelpLines[0] = MusicVoice.a(0, var2Lifetime112);
          }
          var2Lifetime113 = ke.a((byte) 108, "instructionsPageControls,1");
          if (var2Lifetime113 != null) {
            GameInstructions.controlsHelpLines[1] = MusicVoice.a(0, var2Lifetime113);
          }
          var2Lifetime114 = ke.a((byte) 102, "instructionsPageControls,2");
          if (null != var2Lifetime114) {
            GameInstructions.controlsHelpLines[2] = MusicVoice.a(0, var2Lifetime114);
          }
          var2Lifetime115 = ke.a((byte) 123, "instructionsPageControls,3");
          if (null != var2Lifetime115) {
            GameInstructions.controlsHelpLines[3] = MusicVoice.a(0, var2Lifetime115);
          }
          var2Lifetime116 = ke.a((byte) 115, "instructionsPageControls,4");
          if (var2Lifetime116 != null) {
            GameInstructions.controlsHelpLines[4] = MusicVoice.a(0, var2Lifetime116);
          }
          var2Lifetime117 = ke.a((byte) 111, "instructionsPageControls,5");
          if (var2Lifetime117 != null) {
            GameInstructions.controlsHelpLines[5] = MusicVoice.a(0, var2Lifetime117);
          }
          var2Lifetime118 = ke.a((byte) 109, "instructionsPageControls,6");
          if (null != var2Lifetime118) {
            GameInstructions.controlsHelpLines[6] = MusicVoice.a(param1 + 5, var2Lifetime118);
          }
          var2Lifetime119 = ke.a((byte) 117, "instructionsPageEnemies,0");
          if (null != var2Lifetime119) {
            GameInstructions.dronesHelpLines[0] = MusicVoice.a(0, var2Lifetime119);
          }
          var2Lifetime120 = ke.a((byte) 98, "instructionsPageEnemies,1");
          if (var2Lifetime120 != null) {
            GameInstructions.dronesHelpLines[1] = MusicVoice.a(0, var2Lifetime120);
          }
          var2Lifetime121 = ke.a((byte) 102, "instructionsPageEnemies,2");
          if (null != var2Lifetime121) {
            GameInstructions.dronesHelpLines[2] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime121);
          }
          var2Lifetime122 = ke.a((byte) 120, "instructionsPageEnemies,3");
          if (var2Lifetime122 != null) {
            GameInstructions.dronesHelpLines[3] = MusicVoice.a(0, var2Lifetime122);
          }
          var2Lifetime123 = ke.a((byte) 124, "instructionsPageEnemies,4");
          if (null != var2Lifetime123) {
            GameInstructions.dronesHelpLines[4] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime123);
          }
          var2Lifetime124 = ke.a((byte) 110, "instructionsPageEnemies,5");
          if (null != var2Lifetime124) {
            GameInstructions.dronesHelpLines[5] = MusicVoice.a(0, var2Lifetime124);
          }
          var2Lifetime125 = ke.a((byte) 119, "instructionsPageEnemies,6");
          if (var2Lifetime125 != null) {
            GameInstructions.dronesHelpLines[6] = MusicVoice.a(0, var2Lifetime125);
          }
          var2Lifetime126 = ke.a((byte) 105, "instructionsPageEnemies2,0");
          if (null != var2Lifetime126) {
            GameInstructions.dronesHelpLinesPartTwo[0] = MusicVoice.a(0, var2Lifetime126);
          }
          var2Lifetime127 = ke.a((byte) 108, "instructionsPageEnemies2,1");
          if (null != var2Lifetime127) {
            GameInstructions.dronesHelpLinesPartTwo[1] = MusicVoice.a(0, var2Lifetime127);
          }
          var2Lifetime128 = ke.a((byte) 124, "instructionsPageEnemies2,2");
          if (null != var2Lifetime128) {
            GameInstructions.dronesHelpLinesPartTwo[2] = MusicVoice.a(0, var2Lifetime128);
          }
          var2Lifetime129 = ke.a((byte) 116, "instructionsPageEnemies2,3");
          if (null != var2Lifetime129) {
            GameInstructions.dronesHelpLinesPartTwo[3] = MusicVoice.a(0, var2Lifetime129);
          }
          var2Lifetime130 = ke.a((byte) 123, "instructionsPageEnemies2,4");
          if (null != var2Lifetime130) {
            GameInstructions.dronesHelpLinesPartTwo[4] = MusicVoice.a(0, var2Lifetime130);
          }
          var2Lifetime131 = ke.a((byte) 113, "instructionsPagePowerups,0");
          if (var2Lifetime131 != null) {
            GameInstructions.upgradesHelpLines[0] = MusicVoice.a(0, var2Lifetime131);
          }
          var2Lifetime132 = ke.a((byte) 90, "instructionsPagePowerups,1");
          if (null != var2Lifetime132) {
            GameInstructions.upgradesHelpLines[1] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime132);
          }
          var2Lifetime133 = ke.a((byte) 99, "instructionsPagePowerups,2");
          if (var2Lifetime133 != null) {
            GameInstructions.upgradesHelpLines[2] = MusicVoice.a(0, var2Lifetime133);
          }
          var2Lifetime134 = ke.a((byte) 105, "instructionsPagePowerups,3");
          if (var2Lifetime134 != null) {
            GameInstructions.upgradesHelpLines[3] = MusicVoice.a(0, var2Lifetime134);
          }
          var2Lifetime135 = ke.a((byte) 100, "instructionsPagePowerups,4");
          if (var2Lifetime135 != null) {
            GameInstructions.upgradesHelpLines[4] = MusicVoice.a(0, var2Lifetime135);
          }
          var2Lifetime136 = ke.a((byte) 127, "instructionsPagePowerups,5");
          if (null != var2Lifetime136) {
            GameInstructions.upgradesHelpLines[5] = MusicVoice.a(0, var2Lifetime136);
          }
          var2Lifetime137 = ke.a((byte) 119, "tutorialon");
          if (var2Lifetime137 != null) {
            MusicVoice.a(0, var2Lifetime137);
          }
          var2Lifetime138 = ke.a((byte) 110, "tutorialoff");
          if (var2Lifetime138 != null) {
            MusicVoice.a(0, var2Lifetime138);
          }
          var2Lifetime139 = ke.a((byte) 119, "benefits,0");
          if (null != var2Lifetime139) {
            ResizingDialog.membershipPromoLines[0] = MusicVoice.a(0, var2Lifetime139);
          }
          var2Lifetime140 = ke.a((byte) 117, "benefits,1");
          if (null != var2Lifetime140) {
            ResizingDialog.membershipPromoLines[1] = MusicVoice.a(0, var2Lifetime140);
          }
          var2Lifetime141 = ke.a((byte) 117, "benefits,2");
          if (null != var2Lifetime141) {
            ResizingDialog.membershipPromoLines[2] = MusicVoice.a(param1 + 5, var2Lifetime141);
          }
          var2Lifetime142 = ke.a((byte) 122, "arcadeunlocked");
          if (var2Lifetime142 != null) {
            SpriteMask.arcadeModeUnlockedText = MusicVoice.a(0, var2Lifetime142);
          }
          var2Lifetime143 = ke.a((byte) 93, "levelSelect");
          if (var2Lifetime143 != null) {
            mm.field_g = MusicVoice.a(0, var2Lifetime143);
          }
          var2Lifetime144 = ke.a((byte) 116, "deathMessages,0");
          if (null != var2Lifetime144) {
            IntrusiveNode.exclamationPhrases[0] = MusicVoice.a(param1 + 5, var2Lifetime144);
          }
          var2Lifetime145 = ke.a((byte) 89, "deathMessages,1");
          if (var2Lifetime145 != null) {
            IntrusiveNode.exclamationPhrases[1] = MusicVoice.a(param1 + 5, var2Lifetime145);
          }
          var2Lifetime146 = ke.a((byte) 121, "deathMessages,2");
          if (null != var2Lifetime146) {
            IntrusiveNode.exclamationPhrases[2] = MusicVoice.a(param1 + 5, var2Lifetime146);
          }
          var2Lifetime147 = ke.a((byte) 101, "deathMessages,3");
          if (null != var2Lifetime147) {
            IntrusiveNode.exclamationPhrases[3] = MusicVoice.a(0, var2Lifetime147);
          }
          var2Lifetime148 = ke.a((byte) 106, "deathMessages,4");
          if (null != var2Lifetime148) {
            IntrusiveNode.exclamationPhrases[4] = MusicVoice.a(0, var2Lifetime148);
          }
          var2Lifetime149 = ke.a((byte) 90, "deathMessages,5");
          if (null != var2Lifetime149) {
            IntrusiveNode.exclamationPhrases[5] = MusicVoice.a(0, var2Lifetime149);
          }
          var2Lifetime150 = ke.a((byte) 109, "warningWave");
          if (null != var2Lifetime150) {
            TurbulenceNoise3D.warningText = MusicVoice.a(param1 ^ -5, var2Lifetime150);
          }
          var2Lifetime151 = ke.a((byte) 106, "powerupRunningOut");
          if (var2Lifetime151 != null) {
            MusicVoice.a(param1 ^ -5, var2Lifetime151);
          }
          var2Lifetime152 = ke.a((byte) 91, "powerupNearlyReady");
          if (null != var2Lifetime152) {
            pu.blastReadyText = MusicVoice.a(0, var2Lifetime152);
          }
          var2Lifetime153 = ke.a((byte) 104, "spaceToDetonate");
          if (null != var2Lifetime153) {
            MusicVoice.a(0, var2Lifetime153);
          }
          var2Lifetime154 = ke.a((byte) 101, "gameOver");
          if (null != var2Lifetime154) {
            tt.defeatText = MusicVoice.a(param1 + 5, var2Lifetime154);
          }
          var2Lifetime155 = ke.a((byte) 118, "gameWon");
          if (null != var2Lifetime155) {
            cm.levelCompleteText = MusicVoice.a(0, var2Lifetime155);
          }
          var2Lifetime156 = ke.a((byte) 118, "enemyTypes,0");
          if (null != var2Lifetime156) {
            om.droneNames[0] = MusicVoice.a(param1 + 5, var2Lifetime156);
          }
          var2Lifetime157 = ke.a((byte) 109, "enemyTypes,1");
          if (null != var2Lifetime157) {
            om.droneNames[1] = MusicVoice.a(0, var2Lifetime157);
          }
          var2Lifetime158 = ke.a((byte) 89, "enemyTypes,2");
          if (null != var2Lifetime158) {
            om.droneNames[2] = MusicVoice.a(0, var2Lifetime158);
          }
          var2Lifetime159 = ke.a((byte) 100, "enemyTypes,3");
          if (null != var2Lifetime159) {
            om.droneNames[3] = MusicVoice.a(0, var2Lifetime159);
          }
          var2Lifetime160 = ke.a((byte) 122, "enemyTypes,4");
          if (null != var2Lifetime160) {
            om.droneNames[4] = MusicVoice.a(0, var2Lifetime160);
          }
          var2Lifetime161 = ke.a((byte) 103, "enemyTypes,5");
          if (var2Lifetime161 != null) {
            om.droneNames[5] = MusicVoice.a(0, var2Lifetime161);
          }
          var2Lifetime162 = ke.a((byte) 100, "enemyModifiers,0");
          if (var2Lifetime162 != null) {
            l.enemyVariantNames[0] = MusicVoice.a(0, var2Lifetime162);
          }
          var2Lifetime163 = ke.a((byte) 122, "enemyModifiers,1");
          if (null != var2Lifetime163) {
            l.enemyVariantNames[1] = MusicVoice.a(0, var2Lifetime163);
          }
          var2Lifetime164 = ke.a((byte) 126, "enemyModifiers,2");
          if (var2Lifetime164 != null) {
            l.enemyVariantNames[2] = MusicVoice.a(0, var2Lifetime164);
          }
          var2Lifetime165 = ke.a((byte) 92, "enemyModifiers,3");
          if (null != var2Lifetime165) {
            l.enemyVariantNames[3] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime165);
          }
          var2Lifetime166 = ke.a((byte) 106, "enemyModifiers,4");
          if (null != var2Lifetime166) {
            l.enemyVariantNames[4] = MusicVoice.a(0, var2Lifetime166);
          }
          var2Lifetime167 = ke.a((byte) 101, "enemyModifiers,5");
          if (var2Lifetime167 != null) {
            l.enemyVariantNames[5] = MusicVoice.a(0, var2Lifetime167);
          }
          var2Lifetime168 = ke.a((byte) 103, "enemyModifiers,6");
          if (var2Lifetime168 != null) {
            l.enemyVariantNames[6] = MusicVoice.a(0, var2Lifetime168);
          }
          var2Lifetime169 = ke.a((byte) 120, "powerupNames,0");
          if (null != var2Lifetime169) {
            PerlinNoiseSliceGenerator.powerupEffectNames[0] = MusicVoice.a(0, var2Lifetime169);
          }
          var2Lifetime170 = ke.a((byte) 127, "powerupNames,1");
          if (var2Lifetime170 != null) {
            PerlinNoiseSliceGenerator.powerupEffectNames[1] = MusicVoice.a(0, var2Lifetime170);
          }
          var2Lifetime171 = ke.a((byte) 97, "powerupNames,2");
          if (null != var2Lifetime171) {
            PerlinNoiseSliceGenerator.powerupEffectNames[2] = MusicVoice.a(0, var2Lifetime171);
          }
          var2Lifetime172 = ke.a((byte) 122, "powerupNames,3");
          if (null != var2Lifetime172) {
            PerlinNoiseSliceGenerator.powerupEffectNames[3] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime172);
          }
          var2Lifetime173 = ke.a((byte) 96, "powerupNames,4");
          if (null != var2Lifetime173) {
            PerlinNoiseSliceGenerator.powerupEffectNames[4] = MusicVoice.a(0, var2Lifetime173);
          }
          var2Lifetime174 = ke.a((byte) 107, "powerupNames,5");
          if (var2Lifetime174 != null) {
            PerlinNoiseSliceGenerator.powerupEffectNames[5] = MusicVoice.a(0, var2Lifetime174);
          }
          var2Lifetime175 = ke.a((byte) 88, "powerupNames,6");
          if (null != var2Lifetime175) {
            PerlinNoiseSliceGenerator.powerupEffectNames[6] = MusicVoice.a(param1 + 5, var2Lifetime175);
          }
          var2Lifetime176 = ke.a((byte) 105, "powerupShortNames,0");
          if (null != var2Lifetime176) {
            UpgradeStatNames.names[0] = MusicVoice.a(0, var2Lifetime176);
          }
          var2Lifetime177 = ke.a((byte) 101, "powerupShortNames,1");
          if (null != var2Lifetime177) {
            UpgradeStatNames.names[1] = MusicVoice.a(0, var2Lifetime177);
          }
          var2Lifetime178 = ke.a((byte) 105, "powerupShortNames,2");
          if (null != var2Lifetime178) {
            UpgradeStatNames.names[2] = MusicVoice.a(0, var2Lifetime178);
          }
          var2Lifetime179 = ke.a((byte) 122, "powerupShortNames,3");
          if (var2Lifetime179 != null) {
            UpgradeStatNames.names[3] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime179);
          }
          var2Lifetime180 = ke.a((byte) 93, "powerupShortNames,4");
          if (var2Lifetime180 != null) {
            UpgradeStatNames.names[4] = MusicVoice.a(0, var2Lifetime180);
          }
          var2Lifetime181 = ke.a((byte) 90, "chooseYourPowerup");
          if (null != var2Lifetime181) {
            MusicVoice.a(0, var2Lifetime181);
          }
          var2Lifetime182 = ke.a((byte) 111, "powerupMaxed");
          if (var2Lifetime182 != null) {
            MusicVoice.a(0, var2Lifetime182);
          }
          var2Lifetime183 = ke.a((byte) 98, "terrainNames,0");
          if (null != var2Lifetime183) {
            AudioServiceThread.padTypeNames[0] = MusicVoice.a(0, var2Lifetime183);
          }
          var2Lifetime184 = ke.a((byte) 120, "terrainNames,1");
          if (var2Lifetime184 != null) {
            AudioServiceThread.padTypeNames[1] = MusicVoice.a(param1 + 5, var2Lifetime184);
          }
          var2Lifetime185 = ke.a((byte) 118, "terrainNames,2");
          if (var2Lifetime185 != null) {
            AudioServiceThread.padTypeNames[2] = MusicVoice.a(0, var2Lifetime185);
          }
          var2Lifetime186 = ke.a((byte) 112, "terrainNames,3");
          if (null != var2Lifetime186) {
            AudioServiceThread.padTypeNames[3] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime186);
          }
          var2Lifetime187 = ke.a((byte) 127, "terrainNames,4");
          if (var2Lifetime187 != null) {
            AudioServiceThread.padTypeNames[4] = MusicVoice.a(0, var2Lifetime187);
          }
          var2Lifetime188 = ke.a((byte) 97, "terrainNames,5");
          if (var2Lifetime188 != null) {
            AudioServiceThread.padTypeNames[5] = MusicVoice.a(0, var2Lifetime188);
          }
          var2Lifetime189 = ke.a((byte) 104, "terrainNames,6");
          if (null != var2Lifetime189) {
            AudioServiceThread.padTypeNames[6] = MusicVoice.a(0, var2Lifetime189);
          }
          var2Lifetime190 = ke.a((byte) 121, "terrainNames,7");
          if (null != var2Lifetime190) {
            AudioServiceThread.padTypeNames[7] = MusicVoice.a(0, var2Lifetime190);
          }
          var2Lifetime191 = ke.a((byte) 96, "enemyTypeColon");
          if (var2Lifetime191 != null) {
            MusicVoice.a(param1 + 5, var2Lifetime191);
          }
          var2Lifetime192 = ke.a((byte) 109, "enemyModiferColon");
          if (var2Lifetime192 != null) {
            MusicVoice.a(0, var2Lifetime192);
          }
          var2Lifetime193 = ke.a((byte) 99, "enemyPowerupColon");
          if (null != var2Lifetime193) {
            MusicVoice.a(0, var2Lifetime193);
          }
          var2Lifetime194 = ke.a((byte) 93, "terrainTypeColon");
          if (null != var2Lifetime194) {
            MusicVoice.a(param1 + 5, var2Lifetime194);
          }
          var2Lifetime195 = ke.a((byte) 110, "bossLevelColon");
          if (null != var2Lifetime195) {
            MusicVoice.a(0, var2Lifetime195);
          }
          var2Lifetime196 = ke.a((byte) 106, "enemyOrderColon");
          if (var2Lifetime196 != null) {
            MusicVoice.a(0, var2Lifetime196);
          }
          var2Lifetime197 = ke.a((byte) 94, "orderColon");
          if (null != var2Lifetime197) {
            MusicVoice.a(0, var2Lifetime197);
          }
          var2Lifetime198 = ke.a((byte) 90, "placingEnemies");
          if (var2Lifetime198 != null) {
            MusicVoice.a(0, var2Lifetime198);
          }
          var2Lifetime199 = ke.a((byte) 102, "placingTerrain");
          if (null != var2Lifetime199) {
            MusicVoice.a(0, var2Lifetime199);
          }
          var2Lifetime200 = ke.a((byte) 122, "editModes,0");
          if (var2Lifetime200 != null) {
            LegacyOpenGlAssemblyProgram.levelLoadStepLabels[0] = MusicVoice.a(param1 + 5, var2Lifetime200);
          }
          var2Lifetime201 = ke.a((byte) 95, "editModes,1");
          if (null != var2Lifetime201) {
            LegacyOpenGlAssemblyProgram.levelLoadStepLabels[1] = MusicVoice.a(0, var2Lifetime201);
          }
          var2Lifetime202 = ke.a((byte) 101, "hudScore");
          if (var2Lifetime202 != null) {
            ps.scoreText = MusicVoice.a(0, var2Lifetime202);
          }
          var2Lifetime203 = ke.a((byte) 118, "hudTime");
          if (var2Lifetime203 != null) {
            InstrumentNoteMask.timeText = MusicVoice.a(param1 ^ -5, var2Lifetime203);
          }
          var2Lifetime204 = ke.a((byte) 105, "hudLives");
          if (var2Lifetime204 != null) {
            InwardSparkParticle.livesText = MusicVoice.a(param1 ^ -5, var2Lifetime204);
          }
          var2Lifetime205 = ke.a((byte) 99, "hudMultiplier");
          if (var2Lifetime205 != null) {
            OpenGlVertexLayout.multiplierText = MusicVoice.a(0, var2Lifetime205);
          }
          var2Lifetime206 = ke.a((byte) 126, "hudLevel");
          if (var2Lifetime206 != null) {
            pl.levelText = MusicVoice.a(0, var2Lifetime206);
          }
          var2Lifetime207 = ke.a((byte) 123, "hudCharge");
          if (null != var2Lifetime207) {
            MusicVoice.a(0, var2Lifetime207);
          }
          var2Lifetime208 = ke.a((byte) 102, "notCompleted");
          if (null != var2Lifetime208) {
            bi.notCompletedText = MusicVoice.a(0, var2Lifetime208);
          }
          var2Lifetime209 = ke.a((byte) 122, "clickToContinue");
          if (null != var2Lifetime209) {
            ge.clickToContinueText = MusicVoice.a(0, var2Lifetime209);
          }
          var2Lifetime210 = ke.a((byte) 110, "tutorialSteps,0");
          if (null != var2Lifetime210) {
            LimitedRandomAccessFile.droneDescriptions[0] = MusicVoice.a(0, var2Lifetime210);
          }
          var2Lifetime211 = ke.a((byte) 117, "tutorialSteps,1");
          if (null != var2Lifetime211) {
            LimitedRandomAccessFile.droneDescriptions[1] = MusicVoice.a(0, var2Lifetime211);
          }
          var2Lifetime212 = ke.a((byte) 95, "tutorialSteps,2");
          if (var2Lifetime212 != null) {
            LimitedRandomAccessFile.droneDescriptions[2] = MusicVoice.a(0, var2Lifetime212);
          }
          var2Lifetime213 = ke.a((byte) 109, "tutorialSteps,3");
          if (var2Lifetime213 != null) {
            LimitedRandomAccessFile.droneDescriptions[3] = MusicVoice.a(0, var2Lifetime213);
          }
          var2Lifetime214 = ke.a((byte) 98, "tutorialSteps,4");
          if (var2Lifetime214 != null) {
            LimitedRandomAccessFile.droneDescriptions[4] = MusicVoice.a(0, var2Lifetime214);
          }
          var2Lifetime215 = ke.a((byte) 89, "tutorialSteps,5");
          if (null != var2Lifetime215) {
            LimitedRandomAccessFile.droneDescriptions[5] = MusicVoice.a(0, var2Lifetime215);
          }
          var2Lifetime216 = ke.a((byte) 119, "tutorialSteps,6");
          if (null != var2Lifetime216) {
            LimitedRandomAccessFile.droneDescriptions[6] = MusicVoice.a(0, var2Lifetime216);
          }
          var2Lifetime217 = ke.a((byte) 125, "tutorialSteps,7");
          if (null != var2Lifetime217) {
            LimitedRandomAccessFile.droneDescriptions[7] = MusicVoice.a(0, var2Lifetime217);
          }
          var2Lifetime218 = ke.a((byte) 93, "tutorialSteps,8");
          if (null != var2Lifetime218) {
            LimitedRandomAccessFile.droneDescriptions[8] = MusicVoice.a(0, var2Lifetime218);
          }
          var2Lifetime219 = ke.a((byte) 91, "tutorialSteps,9");
          if (null != var2Lifetime219) {
            LimitedRandomAccessFile.droneDescriptions[9] = MusicVoice.a(0, var2Lifetime219);
          }
          var2Lifetime220 = ke.a((byte) 114, "tutorialSteps,10");
          if (null != var2Lifetime220) {
            LimitedRandomAccessFile.droneDescriptions[10] = MusicVoice.a(0, var2Lifetime220);
          }
          var2Lifetime221 = ke.a((byte) 104, "tutorialSteps,11");
          if (var2Lifetime221 != null) {
            LimitedRandomAccessFile.droneDescriptions[11] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime221);
          }
          var2Lifetime222 = ke.a((byte) 112, "tutorialSteps,12");
          if (var2Lifetime222 != null) {
            LimitedRandomAccessFile.droneDescriptions[12] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime222);
          }
          var2Lifetime223 = ke.a((byte) 112, "tutorialSteps,13");
          if (null != var2Lifetime223) {
            LimitedRandomAccessFile.droneDescriptions[13] = MusicVoice.a(0, var2Lifetime223);
          }
          var2Lifetime224 = ke.a((byte) 93, "tutorialSteps,14");
          if (var2Lifetime224 != null) {
            LimitedRandomAccessFile.droneDescriptions[14] = MusicVoice.a(0, var2Lifetime224);
          }
          var2Lifetime225 = ke.a((byte) 114, "tutorialSteps,15");
          if (var2Lifetime225 != null) {
            LimitedRandomAccessFile.droneDescriptions[15] = MusicVoice.a(param1 + 5, var2Lifetime225);
          }
          var2Lifetime226 = ke.a((byte) 104, "tutorialSteps,16");
          if (var2Lifetime226 != null) {
            LimitedRandomAccessFile.droneDescriptions[16] = MusicVoice.a(param1 + 5, var2Lifetime226);
          }
          var2Lifetime227 = ke.a((byte) 105, "tutorialSteps,17");
          if (var2Lifetime227 != null) {
            LimitedRandomAccessFile.droneDescriptions[17] = MusicVoice.a(0, var2Lifetime227);
          }
          var2Lifetime228 = ke.a((byte) 115, "tutorialSteps,18");
          if (null != var2Lifetime228) {
            LimitedRandomAccessFile.droneDescriptions[18] = MusicVoice.a(0, var2Lifetime228);
          }
          var2Lifetime229 = ke.a((byte) 108, "tutorialSteps,19");
          if (var2Lifetime229 != null) {
            LimitedRandomAccessFile.droneDescriptions[19] = MusicVoice.a(0, var2Lifetime229);
          }
          var2Lifetime230 = ke.a((byte) 94, "tutorialSteps,20");
          if (null != var2Lifetime230) {
            LimitedRandomAccessFile.droneDescriptions[20] = MusicVoice.a(0, var2Lifetime230);
          }
          var2Lifetime231 = ke.a((byte) 109, "tutorialSteps,21");
          if (var2Lifetime231 != null) {
            LimitedRandomAccessFile.droneDescriptions[21] = MusicVoice.a(param1 + 5, var2Lifetime231);
          }
          var2Lifetime232 = ke.a((byte) 101, "tutorialSteps,22");
          if (null != var2Lifetime232) {
            LimitedRandomAccessFile.droneDescriptions[22] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime232);
          }
          var2Lifetime233 = ke.a((byte) 113, "tutorialSteps,23");
          if (var2Lifetime233 != null) {
            LimitedRandomAccessFile.droneDescriptions[23] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime233);
          }
          var2Lifetime234 = ke.a((byte) 102, "tutorialSteps,24");
          if (var2Lifetime234 != null) {
            LimitedRandomAccessFile.droneDescriptions[24] = MusicVoice.a(0, var2Lifetime234);
          }
          var2Lifetime235 = ke.a((byte) 96, "tutorialSteps,25");
          if (null != var2Lifetime235) {
            LimitedRandomAccessFile.droneDescriptions[25] = MusicVoice.a(0, var2Lifetime235);
          }
          var2Lifetime236 = ke.a((byte) 97, "tutorialSteps,26");
          if (var2Lifetime236 != null) {
            LimitedRandomAccessFile.droneDescriptions[26] = MusicVoice.a(0, var2Lifetime236);
          }
          var2Lifetime237 = ke.a((byte) 120, "tutorialSteps,27");
          if (var2Lifetime237 != null) {
            LimitedRandomAccessFile.droneDescriptions[27] = MusicVoice.a(0, var2Lifetime237);
          }
          var2Lifetime238 = ke.a((byte) 89, "tutorialSteps,28");
          if (var2Lifetime238 != null) {
            LimitedRandomAccessFile.droneDescriptions[28] = MusicVoice.a(0, var2Lifetime238);
          }
          var2Lifetime239 = ke.a((byte) 106, "tutorialSteps,29");
          if (var2Lifetime239 != null) {
            LimitedRandomAccessFile.droneDescriptions[29] = MusicVoice.a(0, var2Lifetime239);
          }
          var2Lifetime240 = ke.a((byte) 126, "tutorialSteps,30");
          if (var2Lifetime240 != null) {
            LimitedRandomAccessFile.droneDescriptions[30] = MusicVoice.a(0, var2Lifetime240);
          }
          var2Lifetime241 = ke.a((byte) 103, "tutorialSteps,31");
          if (var2Lifetime241 != null) {
            LimitedRandomAccessFile.droneDescriptions[31] = MusicVoice.a(0, var2Lifetime241);
          }
          var2Lifetime242 = ke.a((byte) 112, "tutorialSteps,32");
          if (null != var2Lifetime242) {
            LimitedRandomAccessFile.droneDescriptions[32] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime242);
          }
          var2Lifetime243 = ke.a((byte) 89, "tutorialSteps,33");
          if (var2Lifetime243 != null) {
            LimitedRandomAccessFile.droneDescriptions[33] = MusicVoice.a(0, var2Lifetime243);
          }
          var2Lifetime244 = ke.a((byte) 99, "tutorialSteps,34");
          if (var2Lifetime244 != null) {
            LimitedRandomAccessFile.droneDescriptions[34] = MusicVoice.a(0, var2Lifetime244);
          }
          var2Lifetime245 = ke.a((byte) 99, "tutorialSteps,35");
          if (var2Lifetime245 != null) {
            LimitedRandomAccessFile.droneDescriptions[35] = MusicVoice.a(param1 + 5, var2Lifetime245);
          }
          var2Lifetime246 = ke.a((byte) 112, "tutorialSteps,36");
          if (var2Lifetime246 != null) {
            LimitedRandomAccessFile.droneDescriptions[36] = MusicVoice.a(0, var2Lifetime246);
          }
          var2Lifetime247 = ke.a((byte) 120, "tutorialSteps,37");
          if (var2Lifetime247 != null) {
            LimitedRandomAccessFile.droneDescriptions[37] = MusicVoice.a(GzipDecompressor.bitwiseXor(param1, -5), var2Lifetime247);
          }
          Drone.field_J = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_870_0 = var2_ref;
          stackIn_870_1 = new StringBuilder().append("rj.D(");
          if (param0 == null) {
            stackIn_871_2 = "null";
          } else {
            stackIn_871_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_870_0), ((StringBuilder) (Object) stackIn_870_1).append(stackIn_871_2).append(',').append(param1).append(')').toString());
        }
        if (GameApplet.field_o) {
          Sumoblitz.field_L = (var3 == 0);
        }
    }

    final static void a(byte param0, int param1, String param2) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          var3_int = 59 / ((param0 + 40) / 55);
          StatusMessagePanel.field_A = false;
          ScrollPane.field_E = false;
          if (null != hc.field_c &&
            hc.field_c.open) {
            if (8 == param1) {
              param1 = 2;
              if (!pg.field_a) {
                param2 = ih.field_b;
                if (Sumoblitz.field_L) {
                  param2 = RasterBuffer.invalidPasswordText;
                }
              } else {
                param2 = RasterBuffer.invalidPasswordText;
              }
              no.field_a.a(-3499, FocusProxyWidget.field_F);
            }
            var4 = 1;
            if (param1 == 10) {
              var4 = 0;
              vf.a((byte) -49);
            }
            if (var4 != 0) {
              if (ScrollPane.field_E) {
                param2 = ic.a(hh.connectionLostText, new String[]{param2}, (byte) -128);
              }
              if (ih.field_c) {
                param2 = se.pleaseTryAgainInText;
              }
              hc.field_c.a(param2, param1, 21089);
            }
            if (param1 != 256 &&
              param1 != 10 &&
              !pg.field_a) {
              no.field_a.h(-79);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("rj.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    ArchiveCatalog(Js5Client param0, CacheIoWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private ArchiveCatalog(Js5Client param0, CacheIoWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.networkClient = param0;
          this.rsaModulus = param3;
          this.cacheWorker = param1;
          this.rsaExponent = param2;
          if (!this.networkClient.urgentQueueFull(-28)) {
            this.masterRequest = this.networkClient.requestGroup(255, true, 255, (byte) 57, (byte) 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("rj.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -6) {
            field_f = (SpriteData) null;
          }
          CacheReferenceNode.a(-99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "rj.I(" + param0 + ')');
        }
    }

    static {
        field_c = 640;
    }
}
