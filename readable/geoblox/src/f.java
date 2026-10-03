/*
 * Decompiled by CFR-JS 0.4.0.
 */
class f extends qf implements pl {
    private boolean field_gb;
    private boolean field_rb;
    private boolean field_mb;
    static int field_ib;
    static gk field_hb;
    static int availableEntityCategoryCount;
    static java.awt.Canvas field_kb;
    static String fullscreenTimeoutText;
    private boolean field_ob;
    private BitmapFont field_jb;
    static String[] quickChatShortcutKeys;
    private hl field_pb;

    static long xorLong(long left, long right) {
        return left ^ right;
    }

    public void a(int param0, byte param1, int param2, int param3, hk param4) {
        CharSequence var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 != -20) {
            var7 = (CharSequence) null;
            f.b((byte) -98, (CharSequence) null);
          }
          if (!this.field_ob) {
            eb.a(k.c(111), (byte) 112, "tochangedisplayname.ws");
          } else {
            pc.a(3, false);
            this.h((byte) -104);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var6);
          stackIn_8_1 = new StringBuilder().append("f.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void b(String param0, String param1, int param2) {
        if (Geoblox.activeMessageDialog != null) {
            Geoblox.activeMessageDialog.h((byte) -104);
        }
        if (param2 != 7697781) {
            return;
        }
        try {
            ml.field_t = new pf(param0, param1, false, true, true);
            hk.field_C.b(ml.field_t, -81);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "f.HA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    f(ng param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new ni((f) null, param1, param2), 77, 10, 10);
        try {
            this.field_gb = param4 ? true : false;
            this.field_ob = false;
            this.field_rb = false;
            this.field_jb = param1;
            this.field_mb = param3 ? true : false;
            this.field_pb = new hl(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_pb.field_C = true;
            this.b((byte) -61, (el) (this.field_pb));
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void i(byte param0) {
        if (!(InstrumentPatch.field_n == null)) {
            return;
        }
        if (param0 >= -48) {
            availableEntityCategoryCount = -112;
            InstrumentPatch.field_n = od.a(480, 0, 0, -3, MenuScreen.platformTaskDispatcher, 640);
            if (null != InstrumentPatch.field_n) {
                sl.a(InstrumentPatch.field_n, 57);
                return;
            }
            return;
        }
        InstrumentPatch.field_n = od.a(480, 0, 0, -3, MenuScreen.platformTaskDispatcher, 640);
        if (null == InstrumentPatch.field_n) {
            return;
        }
        sl.a(InstrumentPatch.field_n, 57);
    }

    final void h(byte param0) {
        if (!(this.field_I)) {
            return;
        }
        this.field_I = false;
        if (param0 != -104) {
            this.field_ob = true;
            if (this.field_mb) {
                tj.b((byte) -65);
                return;
            }
            if (this.field_gb) {
                KeyboardInputListener.b(-1);
                return;
            }
            return;
        }
        if (this.field_mb) {
            tj.b((byte) -65);
            return;
        }
        if (!this.field_gb) {
            return;
        }
        KeyboardInputListener.b(-1);
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != param1) {
            stackIn_4_0 = super.a(param0, param1 + 0, param2, param3);
            return stackIn_4_0;
          }
          this.h((byte) -104);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var5);
          stackIn_7_1 = new StringBuilder().append("f.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void n(int param0) {
        field_hb = null;
        int var1 = 44 % ((param0 + 23) / 41);
        field_kb = null;
        fullscreenTimeoutText = null;
        quickChatShortcutKeys = null;
    }

    final static void advanceGameplayAvatarAnimation(int blinkPeriodTicks) {
        int heldCryBeginShockTicksSnapshot = 0;
        int heldCryBeginTintTicksSnapshot = 0;
        int heldCryStartShockTicksSnapshot = 0;
        int heldCryStartTintTicksSnapshot = 0;
        int heldCryMiddleShockTicksSnapshot = 0;
        int heldCryMiddleTintTicksSnapshot = 0;
        int heldCryHoldShockTicksSnapshot = 0;
        int heldCryHoldTintTicksSnapshot = 0;
        int heldTailShockTicksSnapshot = 0;
        int heldTailTintWithoutShockSnapshot = 0;
        int heldTailTintAfterShockSnapshot = 0;
        int steeredCryBeginShockTicksSnapshot = 0;
        int steeredCryBeginTintTicksSnapshot = 0;
        int steeredCryStartShockTicksSnapshot = 0;
        int steeredCryStartTintTicksSnapshot = 0;
        int steeredCryMiddleShockTicksSnapshot = 0;
        int steeredCryMiddleTintTicksSnapshot = 0;
        int steeredCryHoldShockTicksSnapshot = 0;
        int steeredCryHoldTintTicksSnapshot = 0;
        int steeredTailShockTicksSnapshot = 0;
        int steeredTailTintWithoutShockSnapshot = 0;
        int steeredTailTintAfterShockSnapshot = 0;
        int steppedActiveShockTicksSnapshot = 0;
        int steppedActiveTintWithoutShockSnapshot = 0;
        int steppedActiveTintAfterShockSnapshot = 0;
        int steppedCryBeginShockTicksSnapshot = 0;
        int steppedCryBeginTintWithoutShockSnapshot = 0;
        int steppedCryBeginTintAfterShockSnapshot = 0;
        int steppedCryStartShockTicksSnapshot = 0;
        int steppedCryStartTintWithoutShockSnapshot = 0;
        int steppedCryStartTintAfterShockSnapshot = 0;
        int steppedCryMiddleShockTicksSnapshot = 0;
        int steppedCryMiddleTintTicksSnapshot = 0;
        int steppedCryHoldShockTicksSnapshot = 0;
        int steppedCryHoldTintTicksSnapshot = 0;
        int steppedTailShockTicksSnapshot = 0;
        int steppedTailTintWithoutShockSnapshot = 0;
        int steppedTailTintAfterShockSnapshot = 0;
        float avatarTintFadeFactor;
        int avatarFrameOffsetInSegment;
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        int frameStepTicksBeforeDecrement = af.avatarFrameStepTicks;
        af.avatarFrameStepTicks = af.avatarFrameStepTicks - 1;
        if (0 <= frameStepTicksBeforeDecrement) {
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
          if (30 > gi.avatarBlinkClockTicks % blinkPeriodTicks) {
            DiskCacheWorker.avatarFeedbackFrameIndex = 0 + MenuScreen.avatarFeedbackFrameBase;
          }
          if ((el.gameplaySession.sessionEnding) &&
              (gi.avatarBlinkClockTicks % 18 == 0)) {
            if (gg.avatarCryPhase == 0) {
              if (!pf.endingEntityScanClear) {
                g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
                ul.currentAvatarCryFrame = vf.avatarCryBeginFrames[g.avatarCryFrameCursor];
                g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                heldCryBeginShockTicksSnapshot = wa.avatarShockEffectTicks;
                wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                if (heldCryBeginShockTicksSnapshot > 0) {
                  IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                }
                heldCryBeginTintTicksSnapshot = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (heldCryBeginTintTicksSnapshot > 0) {
                  rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                }
                return;
              }
              gg.avatarCryPhase = gg.avatarCryPhase + 1;
              g.avatarCryFrameCursor = 0;
              MeshMaterial.a(300, fl.field_c[22], false, j.field_gb);
              g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
              heldCryStartShockTicksSnapshot = wa.avatarShockEffectTicks;
              wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
              if (heldCryStartShockTicksSnapshot > 0) {
                IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
              }
              heldCryStartTintTicksSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (heldCryStartTintTicksSnapshot > 0) {
                rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              }
              return;
            }
            if (gg.avatarCryPhase == 1) {
              if (ok.avatarCryMiddleFrames.length > g.avatarCryFrameCursor) {
                ul.currentAvatarCryFrame = ok.avatarCryMiddleFrames[g.avatarCryFrameCursor];
                g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                heldCryMiddleShockTicksSnapshot = wa.avatarShockEffectTicks;
                wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                if (heldCryMiddleShockTicksSnapshot > 0) {
                  IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                }
                heldCryMiddleTintTicksSnapshot = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (heldCryMiddleTintTicksSnapshot > 0) {
                  rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                }
                return;
              }
              gg.avatarCryPhase = gg.avatarCryPhase + 1;
              LimitedRandomAccessFile.avatarFeedbackHoldTicks = 200;
              g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
              heldCryHoldShockTicksSnapshot = wa.avatarShockEffectTicks;
              wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
              if (heldCryHoldShockTicksSnapshot > 0) {
                IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
              }
              heldCryHoldTintTicksSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (heldCryHoldTintTicksSnapshot > 0) {
                rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              }
              return;
            }
            g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
            ul.currentAvatarCryFrame = ld.avatarCryEndFrames[g.avatarCryFrameCursor];
            g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
          }
          avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
          heldTailShockTicksSnapshot = wa.avatarShockEffectTicks;
          wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
          if (heldTailShockTicksSnapshot <= 0) {
            heldTailTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
            jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
            if (heldTailTintWithoutShockSnapshot <= 0) {
              return;
            }
            rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
            return;
          }
          IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
          heldTailTintAfterShockSnapshot = jf.avatarTintFadeTicks;
          jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
          if (heldTailTintAfterShockSnapshot > 0) {
            rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
          }
          return;
        }
        L0: {
          af.avatarFrameStepTicks = 20;
          if (DiskCacheWorker.avatarFeedbackFrameIndex == MenuScreen.avatarFeedbackFrameBase + 0) {
            DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 3;
          } else {
            avatarFrameOffsetInSegment = -MenuScreen.avatarFeedbackFrameBase + DiskCacheWorker.avatarFeedbackFrameIndex;
            if (1 != jk.avatarSteeringDirectionId) {
              if ((2 == jk.avatarSteeringDirectionId) &&
                  (5 > avatarFrameOffsetInSegment)) {
                DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
              } else {
                if (0 == jk.avatarSteeringDirectionId) {
                  if (avatarFrameOffsetInSegment < 3) {
                    DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
                  } else {
                    if ((0 == jk.avatarSteeringDirectionId) &&
                        (3 < avatarFrameOffsetInSegment)) {
                      DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                    }
                  }
                } else {
                  if ((0 == jk.avatarSteeringDirectionId) &&
                      (3 < avatarFrameOffsetInSegment)) {
                    DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                  }
                }
              }
              LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
              gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
              if (30 > gi.avatarBlinkClockTicks % blinkPeriodTicks) {
                DiskCacheWorker.avatarFeedbackFrameIndex = 0 + MenuScreen.avatarFeedbackFrameBase;
              }
              if ((el.gameplaySession.sessionEnding) &&
                  (gi.avatarBlinkClockTicks % 18 == 0)) {
                if (gg.avatarCryPhase == 0) {
                  if (!pf.endingEntityScanClear) {
                    g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
                    ul.currentAvatarCryFrame = vf.avatarCryBeginFrames[g.avatarCryFrameCursor];
                    g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                    avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                    steeredCryBeginShockTicksSnapshot = wa.avatarShockEffectTicks;
                    wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                    if (steeredCryBeginShockTicksSnapshot > 0) {
                      IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                    }
                    steeredCryBeginTintTicksSnapshot = jf.avatarTintFadeTicks;
                    jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                    if (steeredCryBeginTintTicksSnapshot > 0) {
                      rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                    }
                    return;
                  }
                  gg.avatarCryPhase = gg.avatarCryPhase + 1;
                  g.avatarCryFrameCursor = 0;
                  MeshMaterial.a(300, fl.field_c[22], false, j.field_gb);
                  g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                  avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                  steeredCryStartShockTicksSnapshot = wa.avatarShockEffectTicks;
                  wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                  if (steeredCryStartShockTicksSnapshot > 0) {
                    IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                  }
                  steeredCryStartTintTicksSnapshot = jf.avatarTintFadeTicks;
                  jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                  if (steeredCryStartTintTicksSnapshot > 0) {
                    rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                  }
                  return;
                }
                if (gg.avatarCryPhase == 1) {
                  if (ok.avatarCryMiddleFrames.length > g.avatarCryFrameCursor) {
                    ul.currentAvatarCryFrame = ok.avatarCryMiddleFrames[g.avatarCryFrameCursor];
                    g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                    avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                    steeredCryMiddleShockTicksSnapshot = wa.avatarShockEffectTicks;
                    wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                    if (steeredCryMiddleShockTicksSnapshot > 0) {
                      IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                    }
                    steeredCryMiddleTintTicksSnapshot = jf.avatarTintFadeTicks;
                    jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                    if (steeredCryMiddleTintTicksSnapshot > 0) {
                      rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                    }
                    return;
                  }
                  gg.avatarCryPhase = gg.avatarCryPhase + 1;
                  LimitedRandomAccessFile.avatarFeedbackHoldTicks = 200;
                  g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                  avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                  steeredCryHoldShockTicksSnapshot = wa.avatarShockEffectTicks;
                  wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                  if (steeredCryHoldShockTicksSnapshot > 0) {
                    IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                  }
                  steeredCryHoldTintTicksSnapshot = jf.avatarTintFadeTicks;
                  jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                  if (steeredCryHoldTintTicksSnapshot > 0) {
                    rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                  }
                  return;
                }
                g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
                ul.currentAvatarCryFrame = ld.avatarCryEndFrames[g.avatarCryFrameCursor];
                g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
              }
              avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
              steeredTailShockTicksSnapshot = wa.avatarShockEffectTicks;
              wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
              if (steeredTailShockTicksSnapshot <= 0) {
                steeredTailTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (steeredTailTintWithoutShockSnapshot <= 0) {
                  return;
                }
                rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                return;
              }
              IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
              steeredTailTintAfterShockSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (steeredTailTintAfterShockSnapshot > 0) {
                rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              }
              return;
            }
            if (avatarFrameOffsetInSegment <= 1) {
              if ((2 == jk.avatarSteeringDirectionId) &&
                  (5 > avatarFrameOffsetInSegment)) {
                DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
                break L0;
              }
              if (0 == jk.avatarSteeringDirectionId) {
                if (avatarFrameOffsetInSegment < 3) {
                  DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
                } else {
                  if ((0 == jk.avatarSteeringDirectionId) &&
                      (3 < avatarFrameOffsetInSegment)) {
                    DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                  }
                }
              } else {
                if ((0 == jk.avatarSteeringDirectionId) &&
                    (3 < avatarFrameOffsetInSegment)) {
                  DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                }
              }
            } else {
              DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
            }
          }
        }
        LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
        gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
        if (30 > gi.avatarBlinkClockTicks % blinkPeriodTicks) {
          DiskCacheWorker.avatarFeedbackFrameIndex = 0 + MenuScreen.avatarFeedbackFrameBase;
        }
        if (!el.gameplaySession.sessionEnding) {
          avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
          steppedActiveShockTicksSnapshot = wa.avatarShockEffectTicks;
          wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
          if (steppedActiveShockTicksSnapshot <= 0) {
            steppedActiveTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
            jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
            if (steppedActiveTintWithoutShockSnapshot <= 0) {
              return;
            }
            rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
            return;
          }
          IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
          steppedActiveTintAfterShockSnapshot = jf.avatarTintFadeTicks;
          jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
          if (steppedActiveTintAfterShockSnapshot <= 0) {
            return;
          }
          rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
          return;
        }
        if (gi.avatarBlinkClockTicks % 18 == 0) {
          if (gg.avatarCryPhase == 0) {
            if (!pf.endingEntityScanClear) {
              g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
              ul.currentAvatarCryFrame = vf.avatarCryBeginFrames[g.avatarCryFrameCursor];
              g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
              steppedCryBeginShockTicksSnapshot = wa.avatarShockEffectTicks;
              wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
              if (steppedCryBeginShockTicksSnapshot <= 0) {
                steppedCryBeginTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (steppedCryBeginTintWithoutShockSnapshot <= 0) {
                  return;
                }
                rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                return;
              }
              IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
              steppedCryBeginTintAfterShockSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (steppedCryBeginTintAfterShockSnapshot <= 0) {
                return;
              }
              rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              return;
            }
            gg.avatarCryPhase = gg.avatarCryPhase + 1;
            g.avatarCryFrameCursor = 0;
            MeshMaterial.a(300, fl.field_c[22], false, j.field_gb);
            g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
            avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
            steppedCryStartShockTicksSnapshot = wa.avatarShockEffectTicks;
            wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
            if (steppedCryStartShockTicksSnapshot <= 0) {
              steppedCryStartTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (steppedCryStartTintWithoutShockSnapshot <= 0) {
                return;
              }
              rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              return;
            }
            IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
            steppedCryStartTintAfterShockSnapshot = jf.avatarTintFadeTicks;
            jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
            if (steppedCryStartTintAfterShockSnapshot > 0) {
              rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
            }
            return;
          }
          if (gg.avatarCryPhase == 1) {
            if (ok.avatarCryMiddleFrames.length > g.avatarCryFrameCursor) {
              ul.currentAvatarCryFrame = ok.avatarCryMiddleFrames[g.avatarCryFrameCursor];
              g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
              steppedCryMiddleShockTicksSnapshot = wa.avatarShockEffectTicks;
              wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
              if (steppedCryMiddleShockTicksSnapshot > 0) {
                IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
              }
              steppedCryMiddleTintTicksSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (steppedCryMiddleTintTicksSnapshot > 0) {
                rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              }
              return;
            }
            gg.avatarCryPhase = gg.avatarCryPhase + 1;
            LimitedRandomAccessFile.avatarFeedbackHoldTicks = 200;
            g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
            avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
            steppedCryHoldShockTicksSnapshot = wa.avatarShockEffectTicks;
            wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
            if (steppedCryHoldShockTicksSnapshot > 0) {
              IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
            }
            steppedCryHoldTintTicksSnapshot = jf.avatarTintFadeTicks;
            jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
            if (steppedCryHoldTintTicksSnapshot <= 0) {
              return;
            }
            rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
            return;
          }
          g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
          ul.currentAvatarCryFrame = ld.avatarCryEndFrames[g.avatarCryFrameCursor];
          g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
        }
        avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
        steppedTailShockTicksSnapshot = wa.avatarShockEffectTicks;
        wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
        if (steppedTailShockTicksSnapshot <= 0) {
          steppedTailTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
          jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
          if (steppedTailTintWithoutShockSnapshot <= 0) {
            return;
          }
          rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
          return;
        }
        IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
        steppedTailTintAfterShockSnapshot = jf.avatarTintFadeTicks;
        jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
        if (steppedTailTintAfterShockSnapshot <= 0) {
          return;
        }
        rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
        return;
    }

    final static wa p(int param0) {
        if (null == DiskCacheWorker.field_f) {
            DiskCacheWorker.field_f = new wa();
            DiskCacheWorker.field_f.a(9, ng.field_F);
            DiskCacheWorker.field_f.field_h = 14;
            DiskCacheWorker.field_f.field_f = 2763306;
            DiskCacheWorker.field_f.field_d = 6;
            DiskCacheWorker.field_f.field_n = 7697781;
            DiskCacheWorker.field_f.field_e = 5;
            DiskCacheWorker.field_f.field_i = 0;
            DiskCacheWorker.field_f.field_p = 4;
            DiskCacheWorker.field_f.field_m = hh.field_d;
            if (param0 >= 71) {
                return DiskCacheWorker.field_f;
            }
            return (wa) null;
        }
        if (param0 >= 71) {
            return DiskCacheWorker.field_f;
        }
        return (wa) null;
    }

    final void a(int param0, int param1, String param2) {
        boolean stackIn_9_1 = false;
        ni stackIn_14_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ni var6 = null;
        var5 = Geoblox.clientControlFlowFlag;
        try {
          if (this.field_rb) {
            return;
          }
          if (param1 != 19810) {
            return;
          }
          if (256 != param0) {
            stackIn_9_1 = false;
          } else {
            stackIn_9_1 = true;
          }
          ((f) (this)).field_ob = stackIn_9_1;
          this.field_rb = true;
          this.field_pb.a(4210752, 8405024, (byte) -103);
          var6 = new ni((f) (this), this.field_jb, param2);
          if (param0 == 5) {
            var6.a(TriangleMesh.reloadGameText, 1, 11);
            var6.a(rj.quitToWebsiteText, 1, 17);
          } else {
            if (param0 != 256) {
              stackIn_14_0 = (ni) (var6);
              if (this.field_mb) {
                stackIn_15_1 = a.retryText;
              } else {
                stackIn_15_1 = ll.backText;
              }
              ((ni) (Object) stackIn_14_0).a(stackIn_15_1, 1, -1);
            } else {
              var6.a(-2, a.retryText, (bb) (this));
            }
          }
          if (param0 == 3) {
            var6.a(ee.toServerListText, param1 ^ 19811, 7);
          } else {
            if (param0 != 4) {
              if (param0 == 6) {
                var6.a(jc.toCustomerSupportText, 1, 9);
              } else {
                if (param0 != 9) {
                  this.b(var6, param1 ^ -19736);
                  return;
                }
                var6.a(-2, fi.changeDisplayNameText, (bb) (this));
              }
            } else {
              var6.a(hb.playFreeVersionText, 1, 8);
            }
          }
          this.b(var6, param1 ^ -19736);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = (RuntimeException) (var4);
          stackIn_30_1 = new StringBuilder().append("f.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static boolean b(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -111) {
            quickChatShortcutKeys = (String[]) null;
          }
          stackIn_3_0 = LimitedRandomAccessFile.a(param1, true, 10, 87);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var2);
          stackIn_6_1 = new StringBuilder().append("f.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void c(boolean param0) {
        ni var2 = null;
        this.field_pb.a(4210752, 2121792, (byte) -103);
        if (!param0) {
            var2 = new ni((f) (this), this.field_jb, oe.connectionRestoredText);
            var2.a(jk.returnToGameText, 1, 15);
            this.b(var2, -23);
            return;
        }
        field_kb = (java.awt.Canvas) null;
        var2 = new ni((f) (this), this.field_jb, oe.connectionRestoredText);
        var2.a(jk.returnToGameText, 1, 15);
        this.b(var2, -23);
    }

    static {
        field_hb = new gk();
        quickChatShortcutKeys = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        fullscreenTimeoutText = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
