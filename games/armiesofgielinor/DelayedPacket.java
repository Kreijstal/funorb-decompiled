/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPacket extends IntrusiveNode {
    static String field_r;
    static String field_n;
    static IndexedSprite[] field_k;
    static int field_p;
    byte[] payload;
    int opcode;
    static boolean field_q;
    long releaseAtMillis;
    static String[] field_s;

    final static void e(int param0) {
        if (BattleTutorial.field_h) {
          e.a((byte) -93);
          if (param0 == -3) {
            return;
          }
          field_q = false;
          return;
        }
        if (param0 != -3) {
          field_q = false;
          return;
        }
    }

    final static String a(int param0, byte param1) {
        int var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        GameplayController var10 = rd.field_j;
        GameplayController var11 = var10;
        if (var11 == null) {
          return "No game in progress.";
        }
        if (param0 < 0) {
          return "Please choose a player, 0-based.";
        }
        if (var11.battlefield.playerCount < param0) {
          return "Please choose a player, 0-based.";
        }
        var11.battlefield.eliminatePlayer(10001, param0, false);
        kw.campaignPacketWord0 = 2297;
        cg.campaignPacketWord2 = 72584621;
        wr.campaignPacketWord3 = 224;
        ii.campaignPacketWord1 = 4452;
        int var3 = var10.battlefield.playerTurnCounts[var10.controlledPlayerId];
        int var4 = var10.battlefield.damageTakenByPlayer[var10.controlledPlayerId];
        hc.field_b = hc.field_b + 1;
        hc.field_b = hc.field_b + (ko.pointerY ^ AiPlanningStrategy.pointerX);
        if (param1 <= 31) {
          DelayedPacket.a(-2, (byte) 45);
        }
        hc.field_b = Math.abs(hc.field_b);
        int var5 = var3 + 0;
        int var6 = var4 - 0;
        int var7 = hc.field_b % 4;
        int var8 = var7;
        if (0 == var8) {
          kw.campaignPacketWord0 = kw.campaignPacketWord0 - var6;
          ii.campaignPacketWord1 = ii.campaignPacketWord1 - var5;
          return "Done.";
        }
        if (var8 != 1) {
          if (var8 == 2) {
            kw.campaignPacketWord0 = kw.campaignPacketWord0 + (var5 - var6);
            return "Done.";
          }
          if (var8 != 3) {
            throw new IllegalStateException("");
          }
          ii.campaignPacketWord1 = ii.campaignPacketWord1 - (-var6 + var5);
          return "Done.";
        }
        ii.campaignPacketWord1 = ii.campaignPacketWord1 + var6;
        kw.campaignPacketWord0 = kw.campaignPacketWord0 + var5;
        return "Done.";
    }

    final static void a(int param0, int param1, int param2) {
        if (DropdownOptionList.field_R == null) {
          DropdownOptionList.field_R = new int[param2 * 2];
          if (no.field_U == null ||
            !(param2 <= no.field_U.length)) {
            no.field_U = new int[param2 * 2];
          }
          if (AnimationFrameSet.field_w == null ||
            !(param2 <= AnimationFrameSet.field_w.length)) {
            AnimationFrameSet.field_w = new int[param2 * 2];
          }
          if (TutorialController.field_c == null ||
            !(param2 <= TutorialController.field_c.length)) {
            TutorialController.field_c = new int[param2 * 2];
          }
          if (null == VineGrowthAction.field_s ||
            !(param2 <= VineGrowthAction.field_s.length)) {
            VineGrowthAction.field_s = new int[param2 * 2];
          }
          if (EffectPresentation.field_h == null) {
            EffectPresentation.field_h = new int[2 * param2];
            if (vt.field_m == null ||
              !(param2 + param1 <= vt.field_m.length)) {
              vt.field_m = new int[(param2 + param1) * 2];
            }
            if (AiUnitPlanner.field_q == null ||
              !(AiUnitPlanner.field_q.length >= param2)) {
              AiUnitPlanner.field_q = new boolean[2 * param2];
            }
          } else {
            if (EffectPresentation.field_h.length < param2) {
              EffectPresentation.field_h = new int[2 * param2];
              if (vt.field_m == null ||
                !(param2 + param1 <= vt.field_m.length)) {
                vt.field_m = new int[(param2 + param1) * 2];
              }
              if (AiUnitPlanner.field_q == null ||
                !(AiUnitPlanner.field_q.length >= param2)) {
                AiUnitPlanner.field_q = new boolean[2 * param2];
              }
            } else {
              if (vt.field_m == null) {
                vt.field_m = new int[(param2 + param1) * 2];
                if (AiUnitPlanner.field_q == null ||
                  !(AiUnitPlanner.field_q.length >= param2)) {
                  AiUnitPlanner.field_q = new boolean[2 * param2];
                }
              } else {
                if (param2 + param1 > vt.field_m.length) {
                  vt.field_m = new int[(param2 + param1) * 2];
                  if (AiUnitPlanner.field_q == null ||
                    !(AiUnitPlanner.field_q.length >= param2)) {
                    AiUnitPlanner.field_q = new boolean[2 * param2];
                  }
                } else {
                  if (AiUnitPlanner.field_q == null) {
                    AiUnitPlanner.field_q = new boolean[2 * param2];
                  } else {
                    if (AiUnitPlanner.field_q.length < param2) {
                      AiUnitPlanner.field_q = new boolean[2 * param2];
                    }
                  }
                }
              }
            }
          }
        } else {
          if (DropdownOptionList.field_R.length >= param2) {
            if (no.field_U == null ||
              !(param2 <= no.field_U.length)) {
              no.field_U = new int[param2 * 2];
            }
            if (AnimationFrameSet.field_w == null ||
              !(param2 <= AnimationFrameSet.field_w.length)) {
              AnimationFrameSet.field_w = new int[param2 * 2];
            }
            if (TutorialController.field_c == null ||
              !(param2 <= TutorialController.field_c.length)) {
              TutorialController.field_c = new int[param2 * 2];
            }
            if (null == VineGrowthAction.field_s ||
              !(param2 <= VineGrowthAction.field_s.length)) {
              VineGrowthAction.field_s = new int[param2 * 2];
            }
            if (EffectPresentation.field_h == null) {
              EffectPresentation.field_h = new int[2 * param2];
              if (vt.field_m == null ||
                !(param2 + param1 <= vt.field_m.length)) {
                vt.field_m = new int[(param2 + param1) * 2];
              }
              if (AiUnitPlanner.field_q == null ||
                !(AiUnitPlanner.field_q.length >= param2)) {
                AiUnitPlanner.field_q = new boolean[2 * param2];
              }
            } else {
              if (EffectPresentation.field_h.length < param2) {
                EffectPresentation.field_h = new int[2 * param2];
                if (vt.field_m == null ||
                  !(param2 + param1 <= vt.field_m.length)) {
                  vt.field_m = new int[(param2 + param1) * 2];
                }
                if (AiUnitPlanner.field_q == null ||
                  !(AiUnitPlanner.field_q.length >= param2)) {
                  AiUnitPlanner.field_q = new boolean[2 * param2];
                }
              } else {
                if (vt.field_m == null) {
                  vt.field_m = new int[(param2 + param1) * 2];
                  if (AiUnitPlanner.field_q == null ||
                    !(AiUnitPlanner.field_q.length >= param2)) {
                    AiUnitPlanner.field_q = new boolean[2 * param2];
                  }
                } else {
                  if (param2 + param1 > vt.field_m.length) {
                    vt.field_m = new int[(param2 + param1) * 2];
                    if (AiUnitPlanner.field_q == null ||
                      !(AiUnitPlanner.field_q.length >= param2)) {
                      AiUnitPlanner.field_q = new boolean[2 * param2];
                    }
                  } else {
                    if (AiUnitPlanner.field_q == null) {
                      AiUnitPlanner.field_q = new boolean[2 * param2];
                    } else {
                      if (AiUnitPlanner.field_q.length < param2) {
                        AiUnitPlanner.field_q = new boolean[2 * param2];
                      }
                    }
                  }
                }
              }
            }
          } else {
            DropdownOptionList.field_R = new int[param2 * 2];
            if (no.field_U == null ||
              !(param2 <= no.field_U.length)) {
              no.field_U = new int[param2 * 2];
            }
            if (AnimationFrameSet.field_w == null ||
              !(param2 <= AnimationFrameSet.field_w.length)) {
              AnimationFrameSet.field_w = new int[param2 * 2];
            }
            if (TutorialController.field_c == null ||
              !(param2 <= TutorialController.field_c.length)) {
              TutorialController.field_c = new int[param2 * 2];
            }
            if (null == VineGrowthAction.field_s ||
              !(param2 <= VineGrowthAction.field_s.length)) {
              VineGrowthAction.field_s = new int[param2 * 2];
            }
            if (EffectPresentation.field_h == null) {
              EffectPresentation.field_h = new int[2 * param2];
              if (vt.field_m == null ||
                !(param2 + param1 <= vt.field_m.length)) {
                vt.field_m = new int[(param2 + param1) * 2];
              }
              if (AiUnitPlanner.field_q == null) {
                AiUnitPlanner.field_q = new boolean[2 * param2];
              } else {
                if (AiUnitPlanner.field_q.length < param2) {
                  AiUnitPlanner.field_q = new boolean[2 * param2];
                }
              }
            } else {
              if (EffectPresentation.field_h.length < param2) {
                EffectPresentation.field_h = new int[2 * param2];
                if (vt.field_m == null ||
                  !(param2 + param1 <= vt.field_m.length)) {
                  vt.field_m = new int[(param2 + param1) * 2];
                }
                if (AiUnitPlanner.field_q == null ||
                  !(AiUnitPlanner.field_q.length >= param2)) {
                  AiUnitPlanner.field_q = new boolean[2 * param2];
                }
              } else {
                if (vt.field_m == null) {
                  vt.field_m = new int[(param2 + param1) * 2];
                } else {
                  if (param2 + param1 > vt.field_m.length) {
                    vt.field_m = new int[(param2 + param1) * 2];
                  }
                }
                if (AiUnitPlanner.field_q == null) {
                  AiUnitPlanner.field_q = new boolean[2 * param2];
                } else {
                  if (AiUnitPlanner.field_q.length < param2) {
                    AiUnitPlanner.field_q = new boolean[2 * param2];
                  }
                }
              }
            }
          }
        }
        kt.field_p = 0;
        if (param0 != 2) {
          return;
        }
        pd.field_e = 2147483647;
        sq.field_k = 2147483647;
        df.field_T = -2147483648;
        se.field_e = -2147483648;
    }

    public static void a(int param0) {
        field_n = null;
        field_s = null;
        field_k = null;
        field_r = null;
        int var1 = 97 % ((32 - param0) / 56);
    }

    DelayedPacket(long releaseAtMillis, int opcode, byte[] payload) {
        try {
          this.opcode = opcode;
          this.releaseAtMillis = releaseAtMillis;
          this.payload = payload;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "qu.<init>(" + releaseAtMillis + ',' + opcode + ',' + (payload != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Armour will help protect your units from damage, but each unit can only wear one type of armour at a time. Equipping a unit with new armour will cause whatever armour that unit is currently wearing to be discarded.";
        field_r = "Most victimised";
        field_s = new String[]{"By rating", "By win percentage"};
        field_p = 200;
    }
}
