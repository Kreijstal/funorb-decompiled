/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pg {
    static int field_f;
    static bq[] field_a;
    static int field_e;
    static PlayerProfile playerProfile;
    static RgbSprite field_c;
    static String[] field_b;

    final static boolean a(int param0, int param1) {
        if (param1 != -10) {
          return false;
        }
        return (param0 & -param0) == param0 ? true : false;
    }

    final static AnimationSequence selectUnitAnimation(int animationIndex, int obfuscationGuard, boolean allowDefaultFallback, int unitType) {
        int variantOrdinal = 0;
        int variant = 0;
        int var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (animationIndex < 0 ||
          animationIndex >= 9) {
          animationIndex = 0;
        }
        int[] variants = BestScoreStrategy.unitAnimationVariants[unitType][animationIndex];
        int[] variantsAlias = variants;
        int[] variantChoices = variantsAlias;
        int[] slotVariants = variantChoices;
        int selectedVariant = variantChoices[AttackEvent.a(false, variants.length, gg.animationRandom)];
        if (selectedVariant >= 0) {
          return ck.animationSequencesByGroup[sf.unitAnimationGroups[unitType]][selectedVariant];
        }
        if (obfuscationGuard != 176) {
          return (AnimationSequence) null;
        }
        int[] fallbackChoices = slotVariants;
        for (variantOrdinal = 0; variantOrdinal < fallbackChoices.length; variantOrdinal++) {
          variant = fallbackChoices[variantOrdinal];
          if (0 <= variant) {
            return ck.animationSequencesByGroup[sf.unitAnimationGroups[unitType]][variant];
          }
        }
        if (!allowDefaultFallback) {
          return null;
        }
        return ck.animationSequencesByGroup[sf.unitAnimationGroups[unitType]][BestScoreStrategy.unitAnimationVariants[unitType][0][0]];
    }

    final static void a(boolean param0) {
        ck.b(-111);
        if (IndexedSpriteBase.field_b != null) {
          dt.a(IndexedSpriteBase.field_b, 23678);
        }
        BufferedSocket.a((byte) 41);
        pf.a(-15291);
        tj.j(-118);
        if (fh.b((byte) -88)) {
          vl.outgoingPacket.writeCipheredOpcode(32161, 1);
          hb.$cfr$intArgs$a$e9dea5688aa5(124, 0);
        }
        dj.a((byte) -126);
        if (param0) {
          playerProfile = (PlayerProfile) null;
        }
    }

    final static void a(int param0, mo param1) {
        Object stackIn_2_0;
        je stackIn_2_1;
        Object stackIn_2_2;
        String stackIn_2_3;
        int stackIn_3_4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        tg var5 = null;
        String var6 = null;
        tg var7 = null;
        String var8 = null;
        tg var9 = null;
        String var10 = null;
        tg var11 = null;
        String var12 = null;
        tg var13 = null;
        try {
          stackIn_2_0 = null;
          stackIn_2_1 = param1.field_u;
          stackIn_2_2 = null;
          stackIn_2_3 = param1.field_q;
          if (param1.field_b == 1) {
            stackIn_3_4 = param1.field_v;
          } else {
            stackIn_3_4 = 0;
          }
          ng.a((dn) (stackIn_2_0), stackIn_2_1, (int[]) (stackIn_2_2), stackIn_2_3, stackIn_3_4, 1, param1.field_b, param1.field_m, param1.field_n);
          if (param1.field_b == 0 &&
            !bn.a(false) &&
            null == vu.field_M &&
            no.field_K == null) {
            if (!vi.field_d) {
              var5 = tn.field_Z;
              var6 = wh.field_b;
              var5.field_i.a(14, var6, (byte) -128);
            }
            var7 = tn.field_Z;
            var8 = FixedQuaternion.field_g;
            var7.field_i.a(20, var8, (byte) -115);
          }
          if (1 == param1.field_b &&
            !bn.a(false) &&
            vu.field_M != null &&
            param1.field_v == vu.field_M.d((byte) -88)) {
            if (!vi.field_d) {
              var9 = tn.field_Z;
              var10 = CampaignMenu.field_q;
              var9.field_i.a(14, var10, (byte) -108);
            }
            var11 = tn.field_Z;
            var12 = CampaignMenuEntry.field_E;
            var11.field_i.a(20, var12, (byte) -117);
          }
          tn.field_Z.a((byte) 68);
          tn.field_Z.a(param0 + 23899, false);
          tn.field_Z.a(param1.field_d, 7, param1.field_b);
          tn.field_Z.b((byte) 92);
          tn.field_Z.a(param1, 0);
          var13 = tn.field_Z;
          var3 = BattleTutorial.pointerPressX;
          var4 = TeleportAction.pointerPressY;
          var13.field_i.a(0, var4, param0, (byte) -118, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("pg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 20) {
          return;
        }
        field_b = null;
        field_c = null;
        playerProfile = null;
        field_a = null;
    }

    static {
        field_e = 0;
        field_f = field_e;
        field_b = new String[]{"melee", "ranged", "magic", "fire", "aerial"};
    }
}
