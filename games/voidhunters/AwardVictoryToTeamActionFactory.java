/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwardVictoryToTeamActionFactory implements GameStateFactory {
    static int field_b;
    static String field_a;

    final static void initializeTextTables(byte param0) {
        int var1_int = 0;
        int var2 = VoidHunters.field_G;
        if (FloatNoiseSliceGenerator.field_a) {
          return;
        }
        ComponentCollision.traceLoadingStatus("Initing text...", (byte) -82);
        FloatNoiseSliceGenerator.field_a = true;
        if (null != HighscoreValueRequest.menuActionLabels) {
          return;
        }
        try {
          PasswordValidator.field_m = new String[10];
          PasswordValidator.field_m[9] = SetCountermeasureLauncherFireForce.field_q;
          PasswordValidator.field_m[0] = PlayerVoteFactory.field_a;
          PasswordValidator.field_m[4] = SetMessageFadetime.field_p;
          PasswordValidator.field_m[6] = AppletCookieReader.field_b;
          PasswordValidator.field_m[2] = SetMessageFadetime.field_p;
          PasswordValidator.field_m[5] = SetMissilesExplosionPower.field_o;
          PasswordValidator.field_m[1] = SetSalvoaim.field_q;
          for (var1_int = 0; var1_int < PasswordValidator.field_m.length; var1_int++) {
            if (PasswordValidator.field_m[var1_int] != null) {
              PasswordValidator.field_m[var1_int] = PasswordValidator.field_m[var1_int].toUpperCase();
            }
          }
          HighscoreValueRequest.menuActionLabels = new String[25];
          HighscoreValueRequest.menuActionLabels[9] = PhasedEnergyBeamWeaponDefinition.field_b;
          HighscoreValueRequest.menuActionLabels[18] = DateOfBirthTextFields.field_D;
          HighscoreValueRequest.menuActionLabels[22] = GetSalvoaim.field_p;
          HighscoreValueRequest.menuActionLabels[20] = BlueprintEditorText.editorText;
          HighscoreValueRequest.menuActionLabels[6] = null;
          HighscoreValueRequest.menuActionLabels[21] = SetCountermeasureLauncherFireForce.field_q;
          HighscoreValueRequest.menuActionLabels[3] = SetMissilesExplosionPower.field_o;
          HighscoreValueRequest.menuActionLabels[24] = MissionEvent.field_f + ":";
          HighscoreValueRequest.menuActionLabels[11] = ReturnToLobbyText.returnToLobbyText;
          HighscoreValueRequest.menuActionLabels[14] = SaveShipDesignOrderDefinition.field_d;
          HighscoreValueRequest.menuActionLabels[2] = DialogMessagePanel.field_D;
          HighscoreValueRequest.menuActionLabels[15] = GetFightersPerPlayerMaximum.field_q;
          HighscoreValueRequest.menuActionLabels[13] = ArchiveLoadRequest.field_d;
          HighscoreValueRequest.menuActionLabels[19] = Widget.field_V + ":";
          HighscoreValueRequest.menuActionLabels[5] = ByteStorageAccess.field_b;
          HighscoreValueRequest.menuActionLabels[7] = GameInterfaceText.returnToMainMenuText;
          HighscoreValueRequest.menuActionLabels[4] = DebugRequest.field_j;
          HighscoreValueRequest.menuActionLabels[12] = SetBombletSprayRandomness.field_o;
          HighscoreValueRequest.menuActionLabels[1] = GetAiFiringRangeUpshift.field_p;
          HighscoreValueRequest.menuActionLabels[17] = SetUseLines.field_o;
          HighscoreValueRequest.menuActionLabels[16] = GetSniperCannonProjectileOndamageParticles.field_p;
          HighscoreValueRequest.menuActionLabels[0] = SetPhasedEnergyBeamPulsetime.field_p;
          HighscoreValueRequest.menuActionLabels[23] = SpawnChoiceFactory.field_b;
          for (var1_int = 0; HighscoreValueRequest.menuActionLabels.length > var1_int; var1_int++) {
            if (null != HighscoreValueRequest.menuActionLabels[var1_int]) {
              HighscoreValueRequest.menuActionLabels[var1_int] = SetFogOfWarSensorRange.a(-1, HighscoreValueRequest.menuActionLabels[var1_int]);
            }
          }
          SetSpinningBladeSpinupSpeed.field_o = new String[56];
          SetSpinningBladeSpinupSpeed.field_o[53] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[14] = SetDebrisSurvives.field_o;
          SetSpinningBladeSpinupSpeed.field_o[13] = HerringboneTextureOperation.field_i;
          SetSpinningBladeSpinupSpeed.field_o[7] = SetAutozoomAmountMultiply.field_o;
          SetSpinningBladeSpinupSpeed.field_o[51] = GetRepairModeActiveTime.field_q;
          SetSpinningBladeSpinupSpeed.field_o[39] = GetMutatorVotes.field_o;
          SetSpinningBladeSpinupSpeed.field_o[5] = GetAngularForceDownshift.field_r;
          SetSpinningBladeSpinupSpeed.field_o[28] = SetPhysicsCollisionForceMultiplier.field_o;
          SetSpinningBladeSpinupSpeed.field_o[22] = SetAutoAfkTimeout.field_o;
          SetSpinningBladeSpinupSpeed.field_o[16] = NineSliceSprite.field_a;
          SetSpinningBladeSpinupSpeed.field_o[12] = OpenGlModel.field_m;
          SetSpinningBladeSpinupSpeed.field_o[30] = ArchiveRequestQueue.field_c;
          SetSpinningBladeSpinupSpeed.field_o[0] = TextureRasterShape.field_c;
          SetSpinningBladeSpinupSpeed.field_o[26] = HuffmanCodec.field_c;
          SetSpinningBladeSpinupSpeed.field_o[19] = SetUseExtraBackground.field_r;
          SetSpinningBladeSpinupSpeed.field_o[10] = AgeValidator.field_h;
          SetSpinningBladeSpinupSpeed.field_o[29] = LoginForm.field_C;
          SetSpinningBladeSpinupSpeed.field_o[38] = SetArmageddonWarning.field_p;
          SetSpinningBladeSpinupSpeed.field_o[54] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[9] = ValidationStatusWidget.field_I;
          SetSpinningBladeSpinupSpeed.field_o[2] = SetFighterRepairAmount.field_q;
          SetSpinningBladeSpinupSpeed.field_o[42] = GetDetachmentMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[34] = PlayerGameData.field_a;
          SetSpinningBladeSpinupSpeed.field_o[15] = GetLaserEnergyUsed.field_q;
          SetSpinningBladeSpinupSpeed.field_o[36] = GetRepairModeActiveTime.field_q;
          SetSpinningBladeSpinupSpeed.field_o[45] = GetGrapplingHookCooldown.field_o;
          SetSpinningBladeSpinupSpeed.field_o[40] = StateSpriteTextRenderer.field_p;
          SetSpinningBladeSpinupSpeed.field_o[31] = GetWorldWidthUpshift.field_r;
          SetSpinningBladeSpinupSpeed.field_o[48] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[23] = ShieldInfoPool.field_a;
          SetSpinningBladeSpinupSpeed.field_o[21] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[1] = SoftwareProjectionSettings.field_e;
          SetSpinningBladeSpinupSpeed.field_o[25] = SetShieldsDirectionalArcParticleLife.field_p;
          SetSpinningBladeSpinupSpeed.field_o[3] = FadingMidiPcmStream.field_S;
          SetSpinningBladeSpinupSpeed.field_o[6] = CarouselConstantRequests.field_b;
          SetSpinningBladeSpinupSpeed.field_o[50] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[41] = WeaponBehaviourFactory.field_a;
          SetSpinningBladeSpinupSpeed.field_o[27] = HelloCommand.field_p;
          SetSpinningBladeSpinupSpeed.field_o[47] = OpenGlGlyphMask.field_d;
          SetSpinningBladeSpinupSpeed.field_o[35] = SetLaserProjectiles.field_p;
          SetSpinningBladeSpinupSpeed.field_o[37] = LogoAnimationStatus.field_a;
          SetSpinningBladeSpinupSpeed.field_o[33] = SetBombletSprayProjectileDamage.field_p;
          SetSpinningBladeSpinupSpeed.field_o[4] = ArchiveDiskWorker.field_a;
          SetSpinningBladeSpinupSpeed.field_o[18] = SetPlayerRepairAmount.field_o;
          SetSpinningBladeSpinupSpeed.field_o[44] = GetPhasedEnergyBeamReload.field_r;
          SetSpinningBladeSpinupSpeed.field_o[24] = BoxBlurTextureOperation.field_i;
          SetSpinningBladeSpinupSpeed.field_o[43] = SoftwareDepthBuffer.field_e;
          SetSpinningBladeSpinupSpeed.field_o[17] = SetGrapplingHookMaxLength.field_o;
          SetSpinningBladeSpinupSpeed.field_o[20] = OpenGlGpuTexture2D.field_k;
          ShipSpawnedCondition.field_e = new String[56];
          SetSpinningBladeSpinupSpeed.field_o[8] = GetBoostersCooldown.field_q;
          SetSpinningBladeSpinupSpeed.field_o[46] = SetMpSandboxEnemySpawnLimit.field_o;
          SetSpinningBladeSpinupSpeed.field_o[49] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[32] = SetTeamSelectionSpeedup.field_q;
          SetSpinningBladeSpinupSpeed.field_o[52] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[11] = FullscreenCanvas.field_c;
          SetSpinningBladeSpinupSpeed.field_o[55] = GetPedrosRepairMode.field_o;
          ShipSpawnedCondition.field_e[30] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[39] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[20] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[24] = Hardpoint.field_b;
          ShipSpawnedCondition.field_e[44] = UiComboBox.field_I;
          ShipSpawnedCondition.field_e[22] = SetPhysicsCollisionPhantomForceMultiplier.field_o;
          ShipSpawnedCondition.field_e[46] = LegacyOpenGlWaterTextures.field_f;
          ShipSpawnedCondition.field_e[16] = CombatHelpText.slowTargetHint;
          ShipSpawnedCondition.field_e[19] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[38] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[23] = GetSniperCannonProjectileLife.field_o;
          ShipSpawnedCondition.field_e[26] = SetBombletSprayAimspeed.field_o;
          ShipSpawnedCondition.field_e[18] = VertexAttribute.field_n;
          if (param0 > -91) {
            field_b = 108;
          }
          ShipSpawnedCondition.field_e[15] = CarouselSystemEvent.field_a;
          ShipSpawnedCondition.field_e[13] = GetSpinningBladeAimspeed.field_o;
          ShipSpawnedCondition.field_e[41] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[51] = SetSpecialOrderBoxHeight.field_q;
          GetBlueprintSaveTime.specialOrderShortLabels = new String[13];
          ShipSpawnedCondition.field_e[29] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[31] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[37] = SetSpecialOrderBoxHeight.field_q;
          ShipSpawnedCondition.field_e[32] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[33] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[27] = DebrisFactory.field_b;
          ShipSpawnedCondition.field_e[47] = SetGrapplingHookSpringConstant.field_o;
          ShipSpawnedCondition.field_e[25] = RemoveEventActionFactory.field_c;
          ShipSpawnedCondition.field_e[42] = OpenGlPostProcessor.field_d;
          ShipSpawnedCondition.field_e[34] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[40] = OpenGlEnvironmentMappedWaterEffect.field_h;
          ShipSpawnedCondition.field_e[35] = SetSpecialOrderBoxHeight.field_q;
          ShipSpawnedCondition.field_e[43] = GetMissionVariablesHudY.field_p;
          ShipSpawnedCondition.field_e[45] = HighscoreValueRequest.field_h;
          ShipSpawnedCondition.field_e[36] = SetSpecialOrderBoxHeight.field_q;
          GetBlueprintSaveTime.specialOrderShortLabels[6] = SetBloomCoefficientPercentage.field_p;
          GetBlueprintSaveTime.specialOrderShortLabels[0] = SetDebrisFoundInPairs.field_o;
          GetBlueprintSaveTime.specialOrderShortLabels[4] = TypedStateArrayCopier.field_b;
          GetBlueprintSaveTime.specialOrderShortLabels[3] = CommonArchiveId.field_c;
          GetBlueprintSaveTime.specialOrderShortLabels[5] = NormalMapTextureOperation.field_j;
          GetBlueprintSaveTime.specialOrderShortLabels[2] = Cp1252Strings.field_a;
          GetBlueprintSaveTime.specialOrderShortLabels[7] = NanosecondClock.field_b;
          GetGrapplingHookSpringConstant.specialOrderLabels = new String[SetSpinningBladeSpinupSpeed.field_o.length + 72];
          GetGrapplingHookSpringConstant.specialOrderLabels[12] = GetSalvoDamageMultiplier.field_o;
          GetGrapplingHookSpringConstant.specialOrderLabels[2] = SetBombletSprayAimspeed.field_p;
          GetGrapplingHookSpringConstant.specialOrderLabels[18] = SetSniperCannonRandomness.field_p;
          GetGrapplingHookSpringConstant.specialOrderLabels[13] = CarouselConstantRequests.field_e;
          GetGrapplingHookSpringConstant.specialOrderLabels[23] = PlayerVoteFactory.field_b;
          GetGrapplingHookSpringConstant.specialOrderLabels[33] = SetClientSideDragging.field_o;
          GetGrapplingHookSpringConstant.specialOrderLabels[38] = MatchingFieldValidator.field_f;
          GetGrapplingHookSpringConstant.specialOrderLabels[45] = CommonGameState.field_b;
          GetGrapplingHookSpringConstant.specialOrderLabels[52] = LoginMethodCatalog.field_e;
          GetGrapplingHookSpringConstant.specialOrderLabels[27] = ArchiveTextureProvider.field_g;
          GetGrapplingHookSpringConstant.specialOrderLabels[43] = GetUseCircleFill.field_p;
          GetGrapplingHookSpringConstant.specialOrderLabels[8] = ShieldInfoPool.field_e;
          GetGrapplingHookSpringConstant.specialOrderLabels[54] = SetMissilesDamageSourceTeam.field_p;
          GetGrapplingHookSpringConstant.specialOrderLabels[35] = World.field_d;
          GetGrapplingHookSpringConstant.specialOrderLabels[3] = ComponentBehaviourFactory.field_b;
          GetGrapplingHookSpringConstant.specialOrderLabels[9] = SetShieldsDirectionalArcParticleSpeedDownshift.field_s;
          GetGrapplingHookSpringConstant.specialOrderLabels[17] = GetShieldsToggleCooldown.field_o;
          GetGrapplingHookSpringConstant.specialOrderLabels[58] = ArmSelfDestructOrderDefinition.field_f;
          GetGrapplingHookSpringConstant.specialOrderLabels[31] = SetMassDriverReload.field_q;
          GetGrapplingHookSpringConstant.specialOrderLabels[30] = SystemNanoClock.field_d;
          GetGrapplingHookSpringConstant.specialOrderLabels[28] = LegacyOpenGlEnvironmentMappedWaterEffect.field_k;
          GetGrapplingHookSpringConstant.specialOrderLabels[56] = PanelHeightQuery.field_a;
          GetGrapplingHookSpringConstant.specialOrderLabels[55] = UiTextStyle.field_l;
          GetGrapplingHookSpringConstant.specialOrderLabels[37] = GetMissileLauncherEnergyUsed.field_o;
          GetGrapplingHookSpringConstant.specialOrderLabels[10] = CombatHelpText.spawnEnemyAtMouseText;
          GetGrapplingHookSpringConstant.specialOrderLabels[21] = TextHotspotRegion.field_e;
          GetGrapplingHookSpringConstant.specialOrderLabels[40] = SetThrusterBindingBalanceThreshold.field_r;
          GetGrapplingHookSpringConstant.specialOrderLabels[16] = ModalPanel.field_y;
          GetGrapplingHookSpringConstant.specialOrderLabels[5] = BoosterOrderText.fireBoostersText;
          GetGrapplingHookSpringConstant.specialOrderLabels[24] = MissionState.field_c;
          GetGrapplingHookSpringConstant.specialOrderLabels[1] = AccountRequestPhase.field_c;
          GetGrapplingHookSpringConstant.specialOrderLabels[19] = HotspotTextWidget.field_G;
          GetGrapplingHookSpringConstant.specialOrderLabels[57] = ImageProducerRasterBuffer.field_i;
          GetGrapplingHookSpringConstant.specialOrderLabels[26] = SetShipPersistence.field_p;
          GetGrapplingHookSpringConstant.specialOrderLabels[49] = WhirlpoolDigest.field_c;
          GetGrapplingHookSpringConstant.specialOrderLabels[53] = TextFieldValidator.field_d;
          GetGrapplingHookSpringConstant.specialOrderLabels[32] = GetMissionDebrisVotingChancestep.field_o;
          GetGrapplingHookSpringConstant.specialOrderLabels[42] = SetShipTeamActionFactory.field_a;
          GetGrapplingHookSpringConstant.specialOrderLabels[51] = SniperCannonWeaponDefinition.field_c;
          GetGrapplingHookSpringConstant.specialOrderLabels[25] = SetMinimapHeight.field_q;
          GetGrapplingHookSpringConstant.specialOrderLabels[7] = SpecialOrderSubmessageFactory.field_a;
          GetGrapplingHookSpringConstant.specialOrderLabels[20] = ChatMessages.spawnSpawnpointText;
          GetGrapplingHookSpringConstant.specialOrderLabels[14] = OpenGlSprite.field_k;
          GetGrapplingHookSpringConstant.specialOrderLabels[48] = SetShieldsDirectionalIdleEnergyUsage.field_o;
          GetGrapplingHookSpringConstant.specialOrderLabels[36] = SetUseExtraBackground.field_s;
          GetGrapplingHookSpringConstant.specialOrderLabels[50] = GetThrusterBindingBalanceThreshold.field_o;
          GetGrapplingHookSpringConstant.specialOrderLabels[34] = ByteStorageAccess.field_a;
          GetGrapplingHookSpringConstant.specialOrderLabels[44] = ChatMessage.field_p;
          GetGrapplingHookSpringConstant.specialOrderLabels[41] = EnvironmentReflectionGpuMaterialEffect.field_e;
          GetGrapplingHookSpringConstant.specialOrderLabels[0] = FullscreenMembershipDialog.field_L;
          GetGrapplingHookSpringConstant.specialOrderLabels[46] = SetLaserEnergyUsed.field_o;
          GetGrapplingHookSpringConstant.specialOrderLabels[22] = UrlJaggrabRequest.field_g;
          GetGrapplingHookSpringConstant.specialOrderLabels[39] = FlipTextureOperation.field_m;
          GetGrapplingHookSpringConstant.specialOrderLabels[4] = Widget.field_kb;
          GetGrapplingHookSpringConstant.specialOrderLabels[47] = ScrollBarWidget.field_Db;
          GetGrapplingHookSpringConstant.specialOrderLabels[15] = MidiNote.field_z;
          GetGrapplingHookSpringConstant.specialOrderLabels[29] = HighscoreValueRequest.field_e;
          GetGrapplingHookSpringConstant.specialOrderLabels[6] = DeveloperAccess.field_b;
          GetGrapplingHookSpringConstant.specialOrderLabels[11] = ShipBlueprint.field_b;
          for (var1_int = 0; var1_int < SetSpinningBladeSpinupSpeed.field_o.length; var1_int++) {
            GetGrapplingHookSpringConstant.specialOrderLabels[var1_int + 72] = SetReverbGain.a(SetMachineGunFireForce.field_o, new String[]{SetSpinningBladeSpinupSpeed.field_o[var1_int]}, 126);
          }
          ShipTeamCondition.field_f = new String[31];
          ShipTeamCondition.field_f[2] = AssassinationObjectiveText.assassinationText;
          ThrusterBehaviour.field_a = new String[31];
          ShipTeamCondition.field_f[24] = GetComponentBreakingExplosionForceMultiplier.field_o;
          ShipTeamCondition.field_f[30] = GetMachineGunPulsetime.field_o;
          ShipTeamCondition.field_f[29] = OpenGlTexture3D.field_m;
          ShipTeamCondition.field_f[20] = ThrusterBehaviourFactory.field_a;
          ShipTeamCondition.field_f[26] = OpenGlPbuffer.field_l;
          ShipTeamCondition.field_f[8] = GetFightersPerPlayerMaximum.field_s;
          ShipTeamCondition.field_f[4] = GetTorpedoAcceleration.field_o;
          ShipTeamCondition.field_f[7] = SetCarouselConstant.field_o;
          ShipTeamCondition.field_f[6] = GetSniperCannonAimspeed.field_o;
          ShipTeamCondition.field_f[3] = PendingRequestResender.field_a;
          ShipTeamCondition.field_f[22] = ToolkitRasterStateStack.field_b;
          ShipTeamCondition.field_f[0] = ArchiveTextureProvider.field_a;
          ShipTeamCondition.field_f[15] = HighscoreTableRequest.field_d;
          ShipTeamCondition.field_f[27] = GetBombletSprayEnergyUsed.field_o;
          ShipTeamCondition.field_f[5] = GetReloadBarHeight.field_o;
          ShipTeamCondition.field_f[14] = GetSpecialOrderBarX.field_o;
          ShipTeamCondition.field_f[13] = MovingObject.field_g;
          ShipTeamCondition.field_f[1] = SetThrusterAutobalancing.field_o;
          ShipTeamCondition.field_f[25] = ThrusterBehaviourFactory.field_b;
          ShipTeamCondition.field_f[10] = UiAngleDial.field_G;
          ShipTeamCondition.field_f[23] = SoftwareFaceAttachmentState.field_b;
          ShipTeamCondition.field_f[16] = SetPointDefenceLaserEnergyUsed.field_p;
          ShipTeamCondition.field_f[9] = GetMessageMaxage.field_o;
          ShipTeamCondition.field_f[12] = PartitionZone.field_g;
          ShipTeamCondition.field_f[21] = ContentTransitionPhase.field_a;
          ShipTeamCondition.field_f[11] = SetReloadBarHeight.field_o;
          ShipTeamCondition.field_f[18] = SetMinimapHeight.field_o;
          ShipTeamCondition.field_f[28] = CarouselPlayerEvent.field_l;
          ShipTeamCondition.field_f[17] = SetBombletSprayProjectiles.field_o;
          ShipTeamCondition.field_f[19] = SetUseBackgroundInFullscreen.field_p;
          ThrusterBehaviour.field_a[0] = SetMissilesHitSourceTeam.field_q;
          ThrusterBehaviour.field_a[9] = GetReloadBarWidth.field_p;
          ThrusterBehaviour.field_a[7] = MissionBuilderFactory.field_a;
          ThrusterBehaviour.field_a[8] = LoadSettings.field_r;
          ThrusterBehaviour.field_a[1] = ComponentGeometryEditor.field_a;
          ThrusterBehaviour.field_a[5] = GpuFractalNoiseVolume.field_q;
          ThrusterBehaviour.field_a[3] = LoadBlackboxRecording.field_p;
          ThrusterBehaviour.field_a[2] = ArmBehaviour.field_c;
          ThrusterBehaviour.field_a[13] = GetMomentOfInertiaPredivideDownshift.field_o;
          ThrusterBehaviour.field_a[10] = MassDriverWeaponDefinition.field_c;
          ThrusterBehaviour.field_a[6] = GrappleLauncherBehaviour.field_c;
          AppletReload.field_a = new String[5];
          ThrusterBehaviour.field_a[4] = LoginCredentials.field_b;
          ThrusterBehaviour.field_a[12] = NativeModelIntTriple.field_c;
          ThrusterBehaviour.field_a[11] = GetPhasedEnergyBeamAimarc.field_o;
          AppletReload.field_a[1] = SetReverbDamp.field_p;
          AppletReload.field_a[0] = DebugRequestFactory.field_c;
          AppletReload.field_a[3] = SetMachineGunReload.field_q;
          AppletReload.field_a[2] = SetGrapplingHookCooldown.field_p;
          SetPhasedEnergyBeamProjectiles.field_o = new String[9];
          SetPhasedEnergyBeamProjectiles.field_o[1] = MapClearanceRectangle.field_f;
          SetPhasedEnergyBeamProjectiles.field_o[2] = GetDebrisCollisionDamage.field_o;
          SetPhasedEnergyBeamProjectiles.field_o[8] = GammaCorrection.field_b + " " + LegacyOpenGlEnvironmentMappedWaterEffect.field_i;
          SetPhasedEnergyBeamProjectiles.field_o[4] = ByteStorageRanges.field_d;
          SetPhasedEnergyBeamProjectiles.field_o[5] = QuickChatDynamicCommand.field_b;
          SetPhasedEnergyBeamProjectiles.field_o[0] = DualLinkNode.field_h;
          SetPhasedEnergyBeamProjectiles.field_o[3] = GammaCorrection.field_b;
          SetPhasedEnergyBeamProjectiles.field_o[6] = MapClearanceRectangle.field_f + " " + LegacyOpenGlEnvironmentMappedWaterEffect.field_i;
          SetPhasedEnergyBeamProjectiles.field_o[7] = GetDebrisCollisionDamage.field_o + " " + LegacyOpenGlEnvironmentMappedWaterEffect.field_i;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "nra.F(" + param0 + ')');
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -11 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new AwardVictoryToTeamAction());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new AwardVictoryToTeamAction[param1]);
    }

    static long orBits(long param0, long param1) {
        return param0 | param1;
    }

    final static int[] addIntArrayValue(boolean param0, int[] param1, int param2, int param3, boolean param4) {
        int var5_int = 0;
        int[] stackIn_3_0 = null;
        int[] stackIn_8_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        var8 = VoidHunters.field_G;
        try {
          if (param3 != 28849) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          if (param1 != null &&
            0 != param1.length) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            if (!param4) {
              var10 = new int[1 + param1.length];
              var14 = var10;
              var12 = var14;
              var5 = var12;
              decompiledFrameRemainder0 = !(param0);
              if (decompiledFrameRemainder0) {
                for (var6 = 0; param1.length > var6; var6++) {
                  var10[var6] = param1[var6];
                }
              }
            } else {
              for (var5_int = 0; var5_int < param1.length; var5_int++) {
                if (param2 == param1[var5_int]) {
                  stackIn_19_0 = (int[]) (param1);
                  return stackIn_19_0;
                }
              }
              var10 = new int[1 + param1.length];
              var14 = var10;
              var12 = var14;
              var5 = var12;
              decompiledFrameRemainder0 = !(param0);
              if (decompiledFrameRemainder0) {
                for (var6 = 0; param1.length > var6; var6++) {
                  var10[var6] = param1[var6];
                }
              }
            }
            if (decompiledFrameRemainder0) {
              var5[param1.length] = param2;
              decompiledFrameRemainder1 = false;
            }
            if (decompiledFrameRemainder1) {
              var6Lifetime1 = 0;
              for (var7 = 0; var7 < param1.length; var7++) {
                if (param1[var7] < param2) {
                  var6Lifetime1++;
                  continue;
                }
                break;
              }
              for (var7Lifetime1 = 0; var7Lifetime1 < var6Lifetime1; var7Lifetime1++) {
                var5[var7Lifetime1] = param1[var7Lifetime1];
              }
              var14[var6Lifetime1] = param2;
              for (var7Lifetime2 = var6Lifetime1; param1.length > var7Lifetime2; var7Lifetime2++) {
                var5[var7Lifetime2 + 1] = param1[var7Lifetime2];
              }
            }
            stackIn_39_0 = var5;
            return stackIn_39_0;
          }
          var13 = new int[1];
          var11 = var13;
          var9 = var11;
          var5Lifetime1 = var9;
          var13[0] = param2;
          stackIn_8_0 = var5Lifetime1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_42_0 = var5_ref;
          stackIn_42_1 = new StringBuilder().append("nra.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 2) {
          field_a = (String) null;
        }
        field_a = null;
    }

    static {
        field_b = 1024;
        field_a = "You need to play <%0> more rated games to unlock this option.";
    }
}
