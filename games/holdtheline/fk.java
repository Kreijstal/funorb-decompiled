/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    static int[] field_c;
    static String field_d;
    static int[][] field_b;
    static String field_a;

    final static String a(int param0, char param1) {
        if (param0 != 25) {
          return (String) null;
        }
        return String.valueOf(param1);
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 < 98) {
          field_c = (int[]) null;
        }
        field_b = (int[][]) null;
    }

    final static BoundaryCurve a(int param0, float param1, BoundaryCurve param2, float param3) {
        RuntimeException var4 = null;
        TrackBoundary var5 = null;
        ArcTrackBoundary var6 = null;
        ArcTrackBoundary stackIn_4_0 = null;
        TrackBoundary stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            field_a = (String) null;
          }
          if (param2 instanceof TrackBoundary) {
            var5 = (TrackBoundary) (param2);
            stackIn_6_0 = new TrackBoundary(var5.pointAt(false, param3), var5.pointAt(false, param1), param2.field_k, param2.field_p, param2.field_q);
            return (BoundaryCurve) ((Object) stackIn_6_0);
          }
          var6 = (ArcTrackBoundary) (param2);
          stackIn_4_0 = new ArcTrackBoundary(var6.center, var6.radius, var6.startAngle + (-var6.startAngle + var6.endAngle) * param3, var6.startAngle + (var6.endAngle - var6.startAngle) * param1, param2.field_k, param2.field_p, param2.field_q);
          return (BoundaryCurve) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int[] param0, String[] param1, int param2, int param3, int param4, int param5, int param6) {
        int var16 = 0;
        int stackIn_4_0 = 0;
        Sprite stackIn_9_0 = null;
        Sprite stackIn_12_0 = null;
        PaletteBitmapFont stackIn_37_0;
        String stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        int stackIn_38_4;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        Sprite var10_ref_hj = null;
        int var10 = 0;
        int var11 = 0;
        Sprite var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        var19 = HoldTheLine.field_D;
        try {
          var8 = param1.length;
          QuickChatPhraseDefinition.field_t.a(param6, param4);
          nj.field_i.a(381 + param6, param4);
          stackIn_4_0 = (var8 != 1) ? 2 : 1;
          var9 = stackIn_4_0;
          if (param5 != -1) {
            if (var9 > param5) {
              stackIn_9_0 = DisplayNameForm.field_O;
            } else {
              stackIn_9_0 = ContentTransitionDialog.field_ab;
            }
            var10_ref_hj = stackIn_9_0;
            var11 = var10_ref_hj.field_s;
            if (param5 + 1 < var9) {
              stackIn_12_0 = DisplayNameForm.field_O;
            } else {
              stackIn_12_0 = ContentTransitionDialog.field_ab;
            }
            var12 = stackIn_12_0;
            var13 = var12.field_s;
            var14 = param6;
            for (var7_int = 0; param5 >= var7_int; var7_int++) {
              var14 = var14 + param0[var7_int];
            }
            var15 = var14 + param0[1 + param5];
            for (var16 = 0; QuickChatPhraseDefinition.field_t.field_y > var16; var16++) {
              for (var17 = var10_ref_hj.field_s; var17 > 0; var17--) {
                if (var10_ref_hj.field_z[-1 + (var11 * var16 + var17)] == 0) {
                  continue;
                }
                break;
              }
              var17 = var17 + var14;
              for (var18 = 0; var12.field_s > var18; var18++) {
                if (var12.field_z[var16 * var13 + var18] == 0) {
                  continue;
                }
                break;
              }
              var18 = var18 + var15;
              SoftwareRasterizer.c(var17, param4 + var16, var18 - var17, 16744576, 128);
            }
          }
          var10 = param6;
          for (var7_intLifetime1 = 0; var7_intLifetime1 < param0.length; var7_intLifetime1++) {
            var10 = var10 + param0[var7_intLifetime1];
            if (var9 <= var7_intLifetime1) {
              ContentTransitionDialog.field_ab.d(var10, param4, 153);
            } else {
              DisplayNameForm.field_O.d(var10, param4, 153);
            }
          }
          var10Lifetime1 = param6 + 11 + param0[0];
          for (var7_intLifetime2 = 0; var8 > var7_intLifetime2; var7_intLifetime2++) {
            stackIn_37_0 = nm.field_c;
            stackIn_37_1 = param1[var7_intLifetime2];
            stackIn_37_2 = param0[1 + var7_intLifetime2] / 2 + var10Lifetime1;
            stackIn_37_3 = (nm.field_c.field_G + 30) / 2 + (param4 - 2);
            if (var7_intLifetime2 != param3) {
              stackIn_38_4 = 1;
            } else {
              stackIn_38_4 = 2;
            }
            ((PaletteBitmapFont) (Object) stackIn_37_0).b(stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_38_4, -1);
            var10Lifetime1 = var10Lifetime1 + param0[1 + var7_intLifetime2];
          }
          var11Lifetime1 = -75 / ((param2 + 10) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_43_0 = var7;
          stackIn_43_1 = new StringBuilder().append("fk.C(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_d = "Connection lost. <%0>";
        field_c = fc.a(-39, 5, 4);
        field_b = new int[14][];
        field_a = "<img=3>";
        field_b[5] = new int[]{25};
        field_b[6] = new int[]{3};
        field_b[8] = new int[]{0};
        field_b[13] = new int[]{22, 23};
        field_b[7] = new int[]{5};
        field_b[9] = new int[]{4};
        field_b[10] = new int[]{8};
        field_b[2] = new int[]{24};
        field_b[12] = new int[]{};
        field_b[1] = new int[]{2, 18, 19, 16, 7};
        field_b[0] = new int[]{12, 15, 18, 19, 17, 13, 14, 1};
        field_b[3] = new int[]{24};
        field_b[11] = new int[]{};
        field_b[4] = new int[]{25, 26};
    }
}
