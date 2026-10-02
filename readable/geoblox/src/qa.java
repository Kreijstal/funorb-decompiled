/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static int field_b;
    private int[] field_c;
    static IntrusiveDeque field_e;
    static IntrusiveDeque field_f;
    static int field_a;
    static ch field_d;

    final static String a(qc param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param0.c(param1 + 1);
            if (var3_int > param2) {
              var3_int = param2;
            }
            var4 = new byte[var3_int];
            param0.field_f = param0.field_f + vj.field_b.a(var4, param0.field_f, param0.field_j, param1, -127, var3_int);
            var5 = bc.decodeTextSlice(param1 ^ -103, var4, 0, var3_int);
            stackIn_4_0 = (String) (var5);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_6_0 = "Cabbage";
            return stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var3_ref);

          stackIn_9_1 = new StringBuilder().append("qa.A(");

          if (param0 == null) {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
        return stackIn_4_0;
    }

    final static qd a(byte[] param0, boolean param1) {
        qd var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        qd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var3 = (byte[]) null;
            qa.a((byte[]) null, false);
          }
          if (param0 != null) {
            var2 = new qd(param0, GameplaySession.field_m, md.field_e, DualLinkNode.field_j, hl.field_K, cm.field_j, mj.field_a);
            kj.c(true);
            stackIn_6_0 = (qd) (var2);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var2_ref);

          stackIn_9_1 = new StringBuilder().append("qa.D(");

          if (param0 == null) {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
        return stackIn_6_0;
    }

    private final int a(byte[] param0, int param1, byte[] param2, int param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Geoblox.field_C;
        try {
          L0: {
            if (0 == param5) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
            } else {
              var8 = 121 / ((-63 - param4) / 59);
              var7_int = 0;
              param5 = param5 + param3;
              var9 = param1;
              L1: while (true) {
                var10 = param2[var9];
                if (var10 < 0) {
                  var7_int = this.field_c[var7_int];
                } else {
                  var7_int++;
                }
                L3: {
                  dupTemp$0 = this.field_c[var7_int];
                  var11 = dupTemp$0;
                  if (dupTemp$0 < 0) {
                    incrementValue$1 = param3;
                    param3++;
                    param0[incrementValue$1] = (byte)(~var11);
                    if (param3 >= param5) {
                      break L3;
                    } else {
                      var7_int = 0;
                    }
                  }
                  if (0 == (64 & var10)) {
                    var7_int++;
                  } else {
                    var7_int = this.field_c[var7_int];
                  }
                  dupTemp$2 = this.field_c[var7_int];
                  var11 = dupTemp$2;
                  if (dupTemp$2 < 0) {
                    incrementValue$3 = param3;
                    param3++;
                    param0[incrementValue$3] = (byte)(~var11);
                    if (param3 >= param5) {
                      break L3;
                    } else {
                      var7_int = 0;
                    }
                  }
                  if ((var10 & 32) != 0) {
                    var7_int = this.field_c[var7_int];
                  } else {
                    var7_int++;
                  }
                  dupTemp$4 = this.field_c[var7_int];
                  var11 = dupTemp$4;
                  if (dupTemp$4 < 0) {
                    incrementValue$5 = param3;
                    param3++;
                    param0[incrementValue$5] = (byte)(~var11);
                    if (param5 > param3) {
                      var7_int = 0;
                    } else {
                      break L3;
                    }
                  }
                  if ((var10 & 16) == 0) {
                    var7_int++;
                  } else {
                    var7_int = this.field_c[var7_int];
                  }
                  dupTemp$6 = this.field_c[var7_int];
                  var11 = dupTemp$6;
                  if (dupTemp$6 < 0) {
                    incrementValue$7 = param3;
                    param3++;
                    param0[incrementValue$7] = (byte)(~var11);
                    if (param5 > param3) {
                      var7_int = 0;
                    } else {
                      break L3;
                    }
                  }
                  if ((8 & var10) == 0) {
                    var7_int++;
                  } else {
                    var7_int = this.field_c[var7_int];
                  }
                  dupTemp$8 = this.field_c[var7_int];
                  var11 = dupTemp$8;
                  if (dupTemp$8 < 0) {
                    incrementValue$9 = param3;
                    param3++;
                    param0[incrementValue$9] = (byte)(~var11);
                    if (param5 > param3) {
                      var7_int = 0;
                    } else {
                      break L3;
                    }
                  }
                  if ((var10 & 4) != 0) {
                    var7_int = this.field_c[var7_int];
                  } else {
                    var7_int++;
                  }
                  dupTemp$10 = this.field_c[var7_int];
                  var11 = dupTemp$10;
                  if (dupTemp$10 < 0) {
                    incrementValue$11 = param3;
                    param3++;
                    param0[incrementValue$11] = (byte)(~var11);
                    if (param5 > param3) {
                      var7_int = 0;
                    } else {
                      return var9 + 1 - param1;
                    }
                  }
                  if ((var10 & 2) != 0) {
                    var7_int = this.field_c[var7_int];
                  } else {
                    var7_int++;
                  }
                  dupTemp$12 = this.field_c[var7_int];
                  var11 = dupTemp$12;
                  if (dupTemp$12 < 0) {
                    incrementValue$13 = param3;
                    param3++;
                    param0[incrementValue$13] = (byte)(~var11);
                    if (param3 >= param5) {
                      break L3;
                    } else {
                      var7_int = 0;
                    }
                  }
                  if (0 == (1 & var10)) {
                    var7_int++;
                  } else {
                    var7_int = this.field_c[var7_int];
                  }
                  dupTemp$14 = this.field_c[var7_int];
                  var11 = dupTemp$14;
                  if (dupTemp$14 < 0) {
                    incrementValue$15 = param3;
                    param3++;
                    param0[incrementValue$15] = (byte)(~var11);
                    if (param3 < param5) {
                      var7_int = 0;
                      var9++;
                      continue L1;
                    }
                  } else {
                    var9++;
                    continue L1;
                  }
                }
                stackIn_66_0 = var9 + 1 - param1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = (RuntimeException) (var7);

          stackIn_69_1 = new StringBuilder().append("qa.E(");

          if (param0 == null) {
            stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
            stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
            stackIn_70_2 = "null";
          } else {
            stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
            stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
            stackIn_70_2 = "{...}";
          }


          stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
            stackIn_73_2 = "null";
          } else {
            stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
            stackIn_73_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_66_0;
        }
    }

    public static void a(byte param0) {
        if (param0 > -1) {
            qa.advanceMenuAvatarAnimation((byte) -72);
            field_e = null;
            field_f = null;
            return;
        }
        field_e = null;
        field_f = null;
    }

    final static void advanceMenuAvatarAnimation(byte methodGuard) {
        int frameStepTicksBeforeDecrement = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int fieldTemp$24 = 0;
        int fieldTemp$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        float avatarTintFadeFactor;
        int avatarFrameOffsetInSegment;
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.field_C;
        if (methodGuard >= 72) {
          frameStepTicksBeforeDecrement = af.avatarFrameStepTicks;
          af.avatarFrameStepTicks = af.avatarFrameStepTicks - 1;
          if (0 > frameStepTicksBeforeDecrement) {
            if (uf.avatarFeedbackFrameIndex == 0 + MenuScreen.avatarFeedbackFrameBase) {
              uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 3;
              af.avatarFrameStepTicks = 20;
              pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
              gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
              if (gi.avatarBlinkClockTicks % 600 < 30) {
                uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
              }
              avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
              fieldTemp$1 = wa.avatarShockEffectTicks;
              wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
              if (fieldTemp$1 <= 0) {
                fieldTemp$2 = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (fieldTemp$2 > 0) {
                  rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                  return;
                } else {
                  return;
                }
              } else {
                ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                fieldTemp$3 = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (fieldTemp$3 <= 0) {
                  return;
                } else {
                  rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                  return;
                }
              }
            } else {
              avatarFrameOffsetInSegment = uf.avatarFeedbackFrameIndex - MenuScreen.avatarFeedbackFrameBase;
              if (jk.avatarSteeringDirectionId == 1) {
                if (avatarFrameOffsetInSegment > 1) {
                  uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex - 1;
                  af.avatarFrameStepTicks = 20;
                  pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                  gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                  if (gi.avatarBlinkClockTicks % 600 < 30) {
                    uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                  }
                  avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                  fieldTemp$4 = wa.avatarShockEffectTicks;
                  wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                  if (fieldTemp$4 <= 0) {
                    fieldTemp$5 = jf.avatarTintFadeTicks;
                    jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                    if (fieldTemp$5 > 0) {
                      rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                    fieldTemp$6 = jf.avatarTintFadeTicks;
                    jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                    if (fieldTemp$6 > 0) {
                      rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                    }
                    return;
                  }
                } else {
                  if (jk.avatarSteeringDirectionId == 2) {
                    if (avatarFrameOffsetInSegment < 5) {
                      uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex + 1;
                      af.avatarFrameStepTicks = 20;
                      pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                      gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                      if (gi.avatarBlinkClockTicks % 600 < 30) {
                        uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                      }
                      avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                      fieldTemp$7 = wa.avatarShockEffectTicks;
                      wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                      if (fieldTemp$7 > 0) {
                        ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                      }
                      fieldTemp$8 = jf.avatarTintFadeTicks;
                      jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                      if (fieldTemp$8 > 0) {
                        rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                      }
                      return;
                    }
                  }
                  if (jk.avatarSteeringDirectionId == 0) {
                    if (avatarFrameOffsetInSegment < 3) {
                      uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex + 1;
                      af.avatarFrameStepTicks = 20;
                      pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                      gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                      if (gi.avatarBlinkClockTicks % 600 < 30) {
                        uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                      }
                      avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                      fieldTemp$9 = wa.avatarShockEffectTicks;
                      wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                      if (fieldTemp$9 > 0) {
                        ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                      }
                      fieldTemp$10 = jf.avatarTintFadeTicks;
                      jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                      if (fieldTemp$10 > 0) {
                        rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                      }
                      return;
                    }
                  }
                  if (jk.avatarSteeringDirectionId == 0) {
                    if (avatarFrameOffsetInSegment <= 3) {
                      af.avatarFrameStepTicks = 20;
                      pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                      gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                      if (gi.avatarBlinkClockTicks % 600 < 30) {
                        uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                      }
                      avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                      fieldTemp$11 = wa.avatarShockEffectTicks;
                      wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                      if (fieldTemp$11 > 0) {
                        ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                      }
                      fieldTemp$12 = jf.avatarTintFadeTicks;
                      jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                      if (fieldTemp$12 > 0) {
                        rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                      }
                      return;
                    } else {
                      uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex - 1;
                      af.avatarFrameStepTicks = 20;
                      pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                      gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                      if (gi.avatarBlinkClockTicks % 600 < 30) {
                        uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                      }
                      avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                      fieldTemp$13 = wa.avatarShockEffectTicks;
                      wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                      if (fieldTemp$13 > 0) {
                        ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                      }
                      fieldTemp$14 = jf.avatarTintFadeTicks;
                      jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                      if (fieldTemp$14 > 0) {
                        rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                      }
                      return;
                    }
                  } else {
                    af.avatarFrameStepTicks = 20;
                    pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                    gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                    if (gi.avatarBlinkClockTicks % 600 < 30) {
                      uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                    }
                    avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                    fieldTemp$15 = wa.avatarShockEffectTicks;
                    wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                    if (fieldTemp$15 > 0) {
                      ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                    }
                    fieldTemp$16 = jf.avatarTintFadeTicks;
                    jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                    if (fieldTemp$16 > 0) {
                      rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                    }
                    return;
                  }
                }
              } else {
                if (jk.avatarSteeringDirectionId == 2) {
                  if (avatarFrameOffsetInSegment < 5) {
                    uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex + 1;
                    af.avatarFrameStepTicks = 20;
                    pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                    gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                    if (gi.avatarBlinkClockTicks % 600 < 30) {
                      uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                    }
                    avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                    fieldTemp$17 = wa.avatarShockEffectTicks;
                    wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                    if (fieldTemp$17 > 0) {
                      ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                    }
                    fieldTemp$18 = jf.avatarTintFadeTicks;
                    jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                    if (fieldTemp$18 > 0) {
                      rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                    }
                    return;
                  }
                }
                if (jk.avatarSteeringDirectionId == 0) {
                  if (avatarFrameOffsetInSegment < 3) {
                    uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex + 1;
                    af.avatarFrameStepTicks = 20;
                    pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                    gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                    if (gi.avatarBlinkClockTicks % 600 < 30) {
                      uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                    }
                    avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                    fieldTemp$19 = wa.avatarShockEffectTicks;
                    wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                    if (fieldTemp$19 > 0) {
                      ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                    }
                    fieldTemp$20 = jf.avatarTintFadeTicks;
                    jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                    if (fieldTemp$20 > 0) {
                      rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                    }
                    return;
                  }
                }
                if (jk.avatarSteeringDirectionId == 0) {
                  if (avatarFrameOffsetInSegment <= 3) {
                    af.avatarFrameStepTicks = 20;
                    pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                    gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                    if (gi.avatarBlinkClockTicks % 600 < 30) {
                      uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                    }
                    avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                    fieldTemp$21 = wa.avatarShockEffectTicks;
                    wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                    if (fieldTemp$21 > 0) {
                      ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                    }
                    fieldTemp$22 = jf.avatarTintFadeTicks;
                    jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                    if (fieldTemp$22 > 0) {
                      rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                    }
                    return;
                  } else {
                    uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex - 1;
                    af.avatarFrameStepTicks = 20;
                    pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                    gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                    if (gi.avatarBlinkClockTicks % 600 < 30) {
                      uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                    }
                    avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                    fieldTemp$23 = wa.avatarShockEffectTicks;
                    wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                    if (fieldTemp$23 > 0) {
                      ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                    }
                    fieldTemp$24 = jf.avatarTintFadeTicks;
                    jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                    if (fieldTemp$24 > 0) {
                      rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                    }
                    return;
                  }
                } else {
                  af.avatarFrameStepTicks = 20;
                  pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
                  gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
                  if (gi.avatarBlinkClockTicks % 600 < 30) {
                    uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
                  }
                  avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                  fieldTemp$25 = wa.avatarShockEffectTicks;
                  wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                  if (fieldTemp$25 > 0) {
                    ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                  }
                  fieldTemp$26 = jf.avatarTintFadeTicks;
                  jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                  if (fieldTemp$26 > 0) {
                    rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                  }
                  return;
                }
              }
            }
          } else {
            pa.avatarFeedbackHoldTicks = pa.avatarFeedbackHoldTicks - 1;
            gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
            if (gi.avatarBlinkClockTicks % 600 < 30) {
              uf.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
            }
            avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
            fieldTemp$27 = wa.avatarShockEffectTicks;
            wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
            if (fieldTemp$27 <= 0) {
              fieldTemp$28 = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (fieldTemp$28 <= 0) {
                return;
              } else {
                rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                return;
              }
            } else {
              ha.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
              fieldTemp$29 = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (fieldTemp$29 > 0) {
                rj.avatarTintColor = ((int)(fe.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * md.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * uk.avatarTintBlueDelta));
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private qa() throws Throwable {
        throw new Error();
    }

    static {
        field_b = 0;
        field_e = new IntrusiveDeque();
        field_a = 0;
        field_f = new IntrusiveDeque();
        field_d = null;
    }
}
