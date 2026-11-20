/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    int[] groupIds;
    IntIndexTable groupNameLookup;
    IntIndexTable[] fileNameLookups;
    int groupCapacity;
    int crc;
    int[] groupFileCounts;
    int[] groupFileCapacities;
    int[][] fileIds;
    private int groupCount;
    private int[] groupNameHashes;
    int[] groupCrcs;
    byte[][] groupDigests;
    int[] groupVersions;
    private int[][] fileNameHashes;
    int version;
    private byte[] digest;

    private final void decode(byte param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_142_0 = 0;
        int[] stackIn_147_0 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        String stackIn_169_2 = null;
        RuntimeException decompiledCaughtException = null;
        PacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var11_ref_byte__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] stackIn_147_0Lifetime1;
        int stackIn_69_0Lifetime1;
        int stackIn_69_1Lifetime1;
        int stackIn_113_0Lifetime1;
        int stackIn_113_1Lifetime1;
        int stackIn_137_0Lifetime1;
        int stackIn_137_1Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          var3 = new PacketBuffer(GetWeaponParticleSpeedDownshift.decompressContainer(0, param1));
          var4 = var3.readUnsignedByte((byte) -87);
          if (var4 >= 5 &&
            7 >= var4) {
            if (var4 >= 6) {
              this.version = var3.readInt(106);
            }
            if (var4 < 6 ||
              var16 != 0) {
              this.version = 0;
            }
            var5 = var3.readUnsignedByte((byte) -117);
            stackIn_18_0 = (0 == (1 & var5)) ? 0 : 1;
            var6 = stackIn_18_0;
            stackIn_22_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_22_0;
            if (var4 < 7) {
              this.groupCount = var3.readUnsignedShort(1869);
            }
            if (var4 >= 7 ||
              var16 != 0) {
              this.groupCount = var3.readLargeSmart(-24099);
            }
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted5 = true;
            boolean decompiledFrameCompleted3 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted6 = true;
            boolean decompiledFrameCompleted7 = true;
            var8 = 0;
            var9 = -1;
            this.groupIds = new int[this.groupCount];
            if (var4 >= 7) {
              var10 = 0;
              while (this.groupCount > var10) {
                dupTemp$0 = var8 + var3.readLargeSmart(-24099);
                var8 = dupTemp$0;
                this.groupIds[var10] = dupTemp$0;
                stackIn_69_0 = var9;
                stackIn_69_1 = this.groupIds[var10];
                if (var16 != 0) {
                  decompiledFrameCompleted7 = false;
                  break;
                }
                if (stackIn_69_0 < stackIn_69_1) {
                  var9 = this.groupIds[var10];
                }
                var10++;
              }
              if (decompiledFrameCompleted7) {
                decompiledFrameRemainder0 = (var16 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted7)) {
              var10 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var10 >= this.groupCount))) {
                dupTemp$1 = var8 + var3.readUnsignedShort(1869);
                var8 = dupTemp$1;
                this.groupIds[var10] = dupTemp$1;
                stackIn_69_0 = this.groupIds[var10];
                stackIn_69_1 = var9;
                if (var16 != 0) {
                  break;
                }
                if (stackIn_69_0 > stackIn_69_1) {
                  var9 = this.groupIds[var10];
                }
                var10++;
              }
              if (decompiledNaturalLoopExit0) {
                decompiledFrameCompleted6 = false;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted6)) {
              while (stackIn_69_0 < stackIn_69_1) {
                this.groupCrcs[this.groupIds[var10]] = var3.readInt(122);
                var10++;
                if (var16 != 0) {
                  decompiledFrameCompleted5 = false;
                  break;
                }
                stackIn_69_0 = var10;
                stackIn_69_1 = this.groupCount;
              }
              decompiledFrameRemainder1 = !(decompiledFrameCompleted5);
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted5)) {
              this.groupCapacity = 1 + var9;
              this.groupVersions = new int[this.groupCapacity];
              if (var7 != 0) {
                this.groupDigests = new byte[this.groupCapacity][];
              }
              boolean decompiledFrameCompleted4 = true;
              this.groupFileCapacities = new int[this.groupCapacity];
              this.groupFileCounts = new int[this.groupCapacity];
              this.groupCrcs = new int[this.groupCapacity];
              this.fileIds = new int[this.groupCapacity][];
              if (var6 != 0) {
                this.groupNameHashes = new int[this.groupCapacity];
                var10 = 0;
                while (true) {
                  if (var10 < this.groupCapacity) {
                    this.groupNameHashes[var10] = -1;
                    var10++;
                    if (var16 == 0) {
                      continue;
                    }
                  } else {
                    var10 = 0;
                  }
                  break;
                }
                while (var10 < this.groupCount) {
                  this.groupNameHashes[this.groupIds[var10]] = var3.readInt(25);
                  var10++;
                  if (var16 != 0) {
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted4) {
                  this.groupNameLookup = new IntIndexTable(this.groupNameHashes);
                }
              }
              var10 = 0;
              while (true) {
                stackIn_69_0Lifetime1 = var10;
                stackIn_69_1Lifetime1 = this.groupCount;
                if (stackIn_69_0Lifetime1 >= stackIn_69_1Lifetime1) {
                  break;
                }
                this.groupCrcs[this.groupIds[var10]] = var3.readInt(122);
                var10++;
                if (var16 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted5) &&
              (decompiledFrameCompleted3) &&
              (var7 != 0)) {
              var10 = 0;
              while (this.groupCount > var10) {
                var11_ref_byte__ = new byte[64];
                var3.readBytes(0, var11_ref_byte__, (byte) -59, 64);
                this.groupDigests[this.groupIds[var10]] = var11_ref_byte__;
                var10++;
                if (var16 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted2) {
              var10 = 0;
            }
            do {
              if (this.groupCount <= var10) {
                if (param0 < 0) {
                  ArchiveIndex.a(false, 91, -58);
                }
                break;
              }
              this.groupVersions[this.groupIds[var10]] = var3.readInt(56);
              var10++;
            } while (var16 == 0);
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (var4 >= 7) {
              var10 = 0;
              do {
                if (this.groupCount <= var10) {
                  var10 = 0;
                  break;
                }
                this.groupFileCounts[this.groupIds[var10]] = var3.readLargeSmart(-24099);
                var10++;
              } while (var16 == 0);
              while (var10 < this.groupCount) {
                var11 = this.groupIds[var10];
                var12 = this.groupFileCounts[var11];
                var8 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.fileIds[var11] = array$2;
                stackIn_142_0 = 0;
                if (var16 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                var14 = stackIn_142_0;
                while (var14 < var12) {
                  dupTemp$3 = var8 + var3.readLargeSmart(-24099);
                  var8 = dupTemp$3;
                  dupTemp$4 = this.fileIds[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  stackIn_113_0 = ~var15;
                  stackIn_113_1 = ~var13;
                  if (stackIn_113_0 < stackIn_113_1) {
                    var13 = var15;
                  }
                  var14++;
                }
                this.groupFileCapacities[var11] = var13 + 1;
                stackIn_113_0Lifetime1 = var13 + 1;
                stackIn_113_1Lifetime1 = var12;
                if (stackIn_113_0Lifetime1 == stackIn_113_1Lifetime1) {
                  this.fileIds[var11] = null;
                }
                var10++;
              }
            }
            if (decompiledFrameCompleted1) {
              if (var4 < 7 ||
                var16 != 0) {
                var10 = 0;
                do {
                  if (var10 >= this.groupCount) {
                    var10 = 0;
                    break;
                  }
                  this.groupFileCounts[this.groupIds[var10]] = var3.readUnsignedShort(1869);
                  var10++;
                } while (var16 == 0);
                while (this.groupCount > var10) {
                  var11 = this.groupIds[var10];
                  var8 = 0;
                  var12 = this.groupFileCounts[var11];
                  var13 = -1;
                  array$5 = new int[var12];
                  this.fileIds[var11] = array$5;
                  stackIn_142_0 = 0;
                  if (var16 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var14 = stackIn_142_0;
                  while (var14 < var12) {
                    dupTemp$6 = var8 + var3.readUnsignedShort(1869);
                    var8 = dupTemp$6;
                    dupTemp$7 = this.fileIds[var11];
                    dupTemp$7[var14] = dupTemp$6;
                    var15 = dupTemp$6;
                    stackIn_137_0 = ~var13;
                    stackIn_137_1 = ~var15;
                    if (stackIn_137_0 > stackIn_137_1) {
                      var13 = var15;
                    }
                    var14++;
                  }
                  this.groupFileCapacities[var11] = 1 + var13;
                  stackIn_137_0Lifetime1 = var12;
                  stackIn_137_1Lifetime1 = 1 + var13;
                  if (stackIn_137_0Lifetime1 == stackIn_137_1Lifetime1) {
                    this.fileIds[var11] = null;
                  }
                  var10++;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_142_0 = var6;
              }
            }
            if (stackIn_142_0 != 0) {
              this.fileNameLookups = new IntIndexTable[var9 + 1];
              this.fileNameHashes = new int[1 + var9][];
              var10 = 0;
              while (true) {
                if (var10 >= this.groupCount) {
                  return;
                }
                var11 = this.groupIds[var10];
                stackIn_147_0 = this.groupFileCounts;
                var12 = stackIn_147_0[var11];
                array$8 = new int[this.groupFileCapacities[var11]];
                this.fileNameHashes[var11] = array$8;
                if (var16 != 0) {
                  return;
                }
                var13 = 0;
                while (this.groupFileCapacities[var11] > var13) {
                  this.fileNameHashes[var11][var13] = -1;
                  var13++;
                }
                var13 = 0;
                while (var12 > var13) {
                  stackIn_147_0Lifetime1 = this.fileIds[var11];
                  if (stackIn_147_0Lifetime1 == null) {
                    var14 = var13;
                  } else {
                    var14 = this.fileIds[var11][var13];
                  }
                  this.fileNameHashes[var11][var14] = var3.readInt(38);
                  var13++;
                }
                this.fileNameLookups[var11] = new IntIndexTable(this.fileNameHashes[var11]);
                var10++;
                continue;
              }
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_168_0 = var3_ref;
          stackIn_168_1 = new StringBuilder().append("qp.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_169_2 = "null";
          } else {
            stackIn_169_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_168_0), ((StringBuilder) (Object) stackIn_168_1).append(stackIn_169_2).append(')').toString());
        }
    }

    final static vu a(boolean param0, int param1, int param2) {
        ScrollPaneWidget stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        boolean stackIn_5_4 = false;
        vu stackIn_9_0 = null;
        Widget stackIn_34_0 = null;
        String stackIn_35_1 = null;
        Widget stackIn_38_0 = null;
        String stackIn_39_1 = null;
        int stackIn_43_0 = 0;
        Object stackIn_89_0 = null;
        Object stackIn_101_0 = null;
        RuntimeException decompiledCaughtException = null;
        vu stackOut_8_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Object var5 = null;
        Object var6 = null;
        vu var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        hqb var17 = null;
        String var18 = null;
        int var19 = 0;
        hqb var17Lifetime1;
        String var18Lifetime1;
        var19 = VoidHunters.field_G;
        try {
          stackIn_4_0 = BitmapTextLayout.field_n.scrollPane;
          stackIn_4_1 = 38;
          stackIn_4_2 = param1;
          stackIn_4_3 = param2 * (3 * (nna.field_w + 2));
          stackIn_5_4 = (qg.field_a == BitmapTextLayout.field_n.scrollPane);
          boolean decompiledFrameRemainder0 = true;
          var3_int = ((ScrollPaneWidget) (Object) stackIn_4_0).layoutAndUpdateScrolling((byte) stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_5_4, param0, nna.field_w + 2) ? 1 : 0;
          var4 = BitmapTextLayout.field_n.content.children;
          var5 = null;
          if (iwa.field_b == 2) {
            PlayerJoinFactory.field_c.enabled = true;
            OpenGlCubeTexture.field_h.text = SetReverbGain.a(SetVelocitySustain.field_o, new String[]{kbb.field_q}, param1 + 89);
            BitmapTextLayout.field_n.scrollPane.viewport.text = null;
            var6 = null;
            var7 = (vu) (var4.first(0));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (null == var7))) {
              var8 = 0;
              stackOut_8_0 = var7;
              stackIn_89_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (var19 == 0) {
                if (stackIn_9_0.children == null) {
                  var7.field_wb = new Widget(0L, SetReverbDamp.field_q);
                  var7.addChild(param1 - 563, var7.field_wb);
                  var7.field_Eb = new Widget(0L, SetShieldsDirectionalArc.field_o);
                  var7.addChild(-561, var7.field_Eb);
                  var7.field_Bb = new Widget(0L, SetReverbDamp.field_q);
                  var7.addChild(-561, var7.field_Bb);
                  var7.field_Eb.field_F = 2;
                  var8 = 1;
                  var7.inheritInteractionStateInDescendants(113);
                }
                var7.width = BitmapTextLayout.field_n.content.width;
                var9 = 0;
                if (null != var7.field_Ab) {
                  if (kbb.field_q != var7.field_Ab) {
                    var10 = 13421568;
                    var11 = 16777062;
                  } else {
                    var10 = 52224;
                    var11 = 6750054;
                  }
                } else {
                  var10 = 13369344;
                  var11 = 16737894;
                }
                var12 = 0;
                if (var7.field_vb != null &&
                  !var7.field_vb.equals("")) {
                  var7.field_Bb.field_tb = SetMissileLauncherRandomness.field_o;
                  var7.field_Bb.field_qb = var11;
                  var12 = 1;
                  var7.field_Bb.setBounds(0, 127, SetMissileLauncherRandomness.field_o.paddedWidth + 3, var9, nna.field_w);
                }
                var7.field_Eb.field_Y = var10;
                var7.field_wb.field_Y = var10;
                var7.field_Eb.field_U = var11;
                var7.field_wb.field_U = var11;
                var7.field_Eb.field_qb = var11;
                var7.field_wb.field_qb = var11;
                var7.field_Eb.field_ib = var11;
                var7.field_wb.field_ib = var11;
                var13 = 0;
                var14 = -80 + (var7.width - 2);
                if (var12 != 0) {
                  var13 = 3 + SetMissileLauncherRandomness.field_o.paddedWidth;
                  var14 = var14 - var13;
                }
                stackIn_34_0 = var7.field_wb;
                if (var14 > 0) {
                  stackIn_35_1 = BitmapFont.ellipsize(var7.field_wb.font, var7.field_Fb, var14);
                } else {
                  stackIn_35_1 = var7.field_Fb;
                }
                stackIn_34_0.text = stackIn_35_1;
                var7.field_wb.setBounds(var13, param1 + 121, var14, var9, nna.field_w);
                stackIn_38_0 = var7.field_Eb;
                if (null != var7.field_Ab) {
                  stackIn_39_1 = var7.field_Ab;
                } else {
                  stackIn_39_1 = SetCountermeasuresPulseRadius.field_o;
                }
                stackIn_38_0.text = stackIn_39_1;
                var7.field_Eb.setBounds(var7.width - 80, -79, 80, var9, nna.field_w);
                stackIn_43_0 = (var7.field_wb.text.equals(var7.field_Fb)) ? 0 : 1;
                var15 = stackIn_43_0;
                var9 = var9 + nna.field_w;
                if (var3_int == 0) {
                  var7.field_E = -var7.height + var9;
                }
                if (var8 != 0) {
                  BitmapTextLayout.field_n.content.positionBelow((Widget) (var6), 2, var7, 40);
                }
                var6 = var7;
                if (null == var7.field_Bb ||
                  !var7.field_Bb.field_O) {
                  if (var7.field_o != 0) {
                    var16 = var7.field_Fb;
                    pea.$cfr$intArgs$a$91f64d33677c(0L, var7, -1, (int[]) null, var16, BitmapTextLayout.field_n.scrollPane, (String) null, 87, -1);
                    if (null != var7.field_Ab &&
                      !qs.a(0, GetLagStandardDeviationOut.field_o.field_a) &&
                      !GetBloomThresholdPercentage.field_p) {
                      if (!hb.field_c) {
                        var17 = GetLagStandardDeviationOut.field_o;
                        var18 = SetReverbGain.a(SetSniperCannonProjectileLife.field_o, new String[]{var16}, param1 + 122);
                        var17.field_i.addItem(var18, (byte) -53, 8);
                      }
                      var17Lifetime1 = GetLagStandardDeviationOut.field_o;
                      var18Lifetime1 = SetReverbGain.a(SetMissileLauncherFireForce.field_p, new String[]{var16}, 115);
                      var17Lifetime1.field_i.addItem(var18Lifetime1, (byte) -53, 18);
                    }
                    var5 = var7;
                  } else if (var7.field_wb.field_O &&
                    var15 != 0) {
                    NebulaFieldFactory.field_a = var7.field_Fb;
                  }
                } else {
                  NebulaFieldFactory.field_a = var7.field_vb;
                }
                var7 = (vu) (var4.next((byte) 99));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              if (BitmapTextLayout.field_n.firstButton.field_o != 0) {
                ola.field_p = new qka(BitmapTextLayout.field_n.firstButton.screenX, BitmapTextLayout.field_n.firstButton.screenY, BitmapTextLayout.field_n.firstButton.width, BitmapTextLayout.field_n.firstButton.height, hk.field_i, GetDebrisMax.field_o, qc.field_q, qc.field_q);
                MissionGenerationDataFactory.field_b = 0;
              }
              stackIn_89_0 = BitmapTextLayout.field_n.secondButton;
            }
            if (((Widget) (stackIn_89_0)).field_o != 0) {
              ola.field_p = new qka(BitmapTextLayout.field_n.secondButton.screenX, BitmapTextLayout.field_n.secondButton.screenY, BitmapTextLayout.field_n.secondButton.width, BitmapTextLayout.field_n.secondButton.height, MissionEvent.field_e, GetDebrisMax.field_o, qc.field_q, qc.field_q);
              MissionGenerationDataFactory.field_b = 1;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            OpenGlCubeTexture.field_h.text = SetUseModels.field_p;
            PlayerJoinFactory.field_c.enabled = false;
            if (iwa.field_b == 1) {
              BitmapTextLayout.field_n.scrollPane.viewport.text = SetMachineGunPulsetime.field_o;
              if (var19 != 0) {
                BitmapTextLayout.field_n.scrollPane.viewport.text = SetFighterRepairTime.field_o;
              }
            } else {
              BitmapTextLayout.field_n.scrollPane.viewport.text = SetFighterRepairTime.field_o;
            }
            igb.a(BitmapTextLayout.field_n.content, (byte) -100);
          }
          stackIn_101_0 = var5;
          return (vu) (stackIn_101_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "qp.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void openExternalUrl(boolean param0, int param1, java.applet.Applet param2, String param3) {
        try {
          RuntimeException runtimeException = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          try {
            if (eab.field_s.startsWith("win") &&
              GetSniperCannonReload.a(param3, 69)) {
              return;
            }
            try {
              if (false) throw (java.net.MalformedURLException) null;
              param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
              if (param1 != 0) {
                return;
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              gna.a((Throwable) null, "MGR1: " + param3, 0);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("qp.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param3 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ArchiveIndex(byte[] param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        var5 = VoidHunters.field_G;
        try {
          this.crc = psb.a(param0, param0.length, 0);
          if (param1 != this.crc) {
            throw new RuntimeException();
          }
          if (null != param2) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.digest = SetMissileLauncherProjectiles.computeArchiveDigest((byte) 25, param0.length, param0, 0);
            var4_int = 0;
            while (var4_int < 64) {
              if (var5 != 0) {
                return;
              }
              if (~param2[var4_int] != ~this.digest[var4_int]) {
                throw new RuntimeException();
              }
              var4_int++;
            }
          }
          this.decode((byte) 27, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_25_0 = runtimeException;
          stackIn_25_1 = new StringBuilder().append("qp.<init>(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    static {
    }
}
