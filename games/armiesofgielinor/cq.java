/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends IntrusiveNode {
    int field_k;
    static byte[][] field_z;
    bg field_n;
    int field_B;
    static int[] field_u;
    int field_D;
    String field_r;
    int field_A;
    RgbSprite field_m;
    int field_t;
    boolean field_l;
    int field_x;
    static int field_F;
    int field_v;
    CampaignMission field_p;
    static String field_C;
    String field_w;
    String field_q;
    int field_o;
    static String field_E;
    int field_y;
    RgbSprite field_s;

    public static void a(int param0) {
        field_z = (byte[][]) null;
        if (param0 != -101) {
          cq.a(-99, -40, -126, (byte) 12, -104);
        }
        field_E = null;
        field_u = null;
        field_C = null;
    }

    final static Class a(Object param0, byte param1) {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (Integer.class.isInstance(param0)) {
            stackIn_2_0 = Integer.TYPE;
            return stackIn_2_0;
          }
          if (param1 != -75) {
            stackIn_5_0 = (Class) null;
            return stackIn_5_0;
          }
          if (Byte.class.isInstance(param0)) {
            stackIn_8_0 = Byte.TYPE;
            return stackIn_8_0;
          }
          if (Short.class.isInstance(param0)) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (Long.class.isInstance(param0)) {
            stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (Boolean.class.isInstance(param0)) {
            stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (Float.class.isInstance(param0)) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (Double.class.isInstance(param0)) {
            stackIn_25_0 = Double.TYPE;
            return stackIn_25_0;
          }
          if (!Character.class.isInstance(param0)) {
            return null;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("cq.F(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        int var5 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          oh.field_L = lm.field_d;
          if (param1 != -14) {
            cq.a(7);
          }
          if (255 == param3) {
            stackIn_11_0 = !(nm.field_z >= 13);
            p.field_a = dc.a(stackIn_11_0, false);
          } else {
            if (param3 >= 100 &&
              param3 <= 105) {
              p.field_a = ei.a(2, param2);
              return;
            }
            p.field_a = DisplacedUnitMarker.a(-1, param3, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("cq.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 0;
        var3 = ib.field_j;
        if (var3 >= 5) {
          if (var3 < 105) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = 8192 - var3 * var3 * 8192 / 3300;
            }
          }
        } else {
          var2 = 8192 * (var3 * var3) / 1100;
        }
        var4 = 1;
        var5 = 0;
        if (1 == param1) {
          var5 = 1;
        }
        if (param1 == 3) {
          var4 = -1;
        }
        if (param1 == 4) {
          var5 = 1;
          var4 = 1;
        }
        if (param0 != -116) {
          cq.a((byte) 74, 85);
        }
        if (param1 == 5) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 6) {
          var4 = 1;
          var5 = -1;
        }
        if (param1 == 7 ||
          param1 == 8) {
          var5 = -1;
          var4 = -1;
        }
        if (11 == param1) {
          var4 = -1;
        }
        if (param1 == 12) {
          var5 = -1;
          var4 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (param1 == 14) {
          var4 = -1;
          var5 = 1;
        }
        if (15 == param1) {
          var4 = 1;
          var5 = 1;
        }
        pd.field_a = ek.a(-125, var4 * var2, var2 * var5);
    }

    final static RgbSprite[] a(int param0, int param1, int param2, byte param3, int param4) {
        RgbSprite[] var6 = new RgbSprite[9];
        RgbSprite[] var5 = var6;
        RgbSprite dupTemp$0 = hl.a(false, param2, param1);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        RgbSprite dupTemp$1 = hl.a(false, param4, param1);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 <= 33) {
          cq.a(111);
        }
        if (param0 != 0) {
          var6[4] = hl.a(false, param0, 64);
        }
        return var5;
    }

    final boolean a(int param0, int param1, int param2) {
        boolean stackIn_8_0 = false;
        if (param2 < 114) {
          this.a(106, -67, 2);
        }
        stackIn_8_0 = (db.a(true, this.field_y) <= param0) && (db.a(true, this.field_B + this.field_y) >= param0) && (param1 >= MatchConditionEntry.a(this.field_x, (byte) 94)) && (MatchConditionEntry.a(this.field_o + this.field_x, (byte) 94) >= param1);
        return stackIn_8_0;
    }

    cq(CampaignMission param0) {
        int var4 = 0;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        MapTile[] var3 = null;
        MapTile[] var4_ref_ne__ = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        MapLayout var12 = null;
        MapTile var13 = null;
        CampaignParticipant var14 = null;
        int[] var18 = null;
        int var5Lifetime1;
        try {
          this.field_p = param0;
          this.field_w = param0.name;
          this.field_v = 1073741823;
          this.field_l = false;
          this.field_k = param0.missionId;
          this.field_n = new bg(16);
          var12 = param0.getMapLayout(-114);
          var3 = var12.createTiles(115, (Battlefield) null);
          var4_ref_ne__ = var3;
          for (var5 = 0; var5 < var4_ref_ne__.length; var5++) {
            var13 = var4_ref_ne__[var5];
            if (null != var13.occupant &&
              var13.occupant.ownerPlayer != param0.playerSlot) {
              var7 = var13.occupant.getUnitCategory(0);
              if (this.field_n.a(-57, (long)var7) == null) {
                this.field_n.a(new IntrusiveNode(), (long)var7, 108);
              }
            }
          }
          for (var4 = 0; var4 < param0.participantIds.length; var4++) {
            var5Lifetime1 = param0.participantIds[var4];
            if (var5Lifetime1 != -1) {
              var14 = param0.campaign.participants[var5Lifetime1];
              if (null != var14.availableUnitTypes) {
                var18 = var14.availableUnitTypes;
                for (var8 = 0; var18.length > var8; var8++) {
                  var9 = var18[var8];
                  var10 = bw.unitDefinitions[var9][0];
                  if (this.field_n.a(-96, (long)var10) == null) {
                    this.field_n.a(new IntrusiveNode(), (long)var10, 126);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("cq.<init>(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    cq(int param0, String param1) {
        try {
          this.field_w = param1;
          this.field_v = 1073741823;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "cq.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = 22;
        field_C = "Create unrated game";
        field_E = "Quick Chat game";
    }
}
