/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FacePlayerLocomotor extends Locomotor {
    private int field_o;
    static HiscoreTable field_p;
    static String field_q;

    final void attachToTrap(int param0, Trap param1) {
        try {
          if (param0 < 35) {
            this.field_o = 28;
          }
          super.attachToTrap(89, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pt.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int hashState(int param0, int param1) {
        if (param0 == 0) {
          param1 = CurveOperator.mixHash((byte) 61, param1, this.field_o);
          return param1;
        }
        field_p = (HiscoreTable) null;
        param1 = CurveOperator.mixHash((byte) 61, param1, this.field_o);
        return param1;
    }

    final void applyConstraint(int param0) {
        if (param0 == 1) {
          return;
        }
        FacePlayerLocomotor.getOrRequestRatingTable(-81, 90, 108, 113);
    }

    final int getTypeId(int param0) {
        if (param0 != 1) {
          return -52;
        }
        return 7;
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = -78 % ((56 - param0) / 63);
        if (((458752 & param1) != 0 ? true : false) | TimingPattern.hasAnyMask34((byte) -53, param2, param1)) {
          return true;
        }
        if (!ValidatedTextInputWidget.a(param1, (byte) 90, param2)) {
          return false;
        }
        return true;
    }

    final void tick(byte param0) {
        int var2;
        Player var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = TombRacer.field_G ? 1 : 0;
        var2 = 93 / ((-69 - param0) / 42);
        var3 = this.trap.getPlayer(-122);
        if (var3.isHiddenFromTrackers(-25561)) {
          return;
        }
        var4 = var3.getX(3) - this.trap.getX(3);
        var5 = var3.getY(9648) - this.trap.getY(9648);
        var6 = qva.headingFromVector((byte) -118, var5, var4);
        var7 = -this.trap.getFacingAngle(-25787) + var6;
        if (0 < this.field_o) {
          while (var7 < -4096) {
            var7 += 8192;
          }
          while (var7 > 4096) {
            var7 -= 8192;
          }
          if (var7 > this.field_o) {
            var7 = this.field_o;
          } else {
            if (var7 < -this.field_o) {
              var7 = -this.field_o;
            }
          }
        }
        this.trap.rotateBy(false, var7);
    }

    final static byte[] copyOf(byte[] param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 4096) {
            field_p = (HiscoreTable) null;
          }
          var4 = new byte[param1];
          var3 = var4;
          ArrayUtils.copy(param0, 0, var4, 0, param1);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("pt.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        if (param1 < 123) {
          Trap var4 = (Trap) null;
          this.attachToTrap(101, (Trap) null);
          this.field_o = param0;
          return;
        }
        this.field_o = param0;
    }

    final static void applyLanguage(int param0, byte param1) {
        if (param1 == 65) {
          ObjectList.field_b = GameAssetLoader.connectingTranslations[param0];
          hra.field_c = TrackMountComponent.waitingForTextTranslations[param0];
          CrossedSineBandsOperator.field_s = LoginMethod.loadingTextTranslations[param0];
          return;
        }
        FacePlayerLocomotor.a(-7, 14, 68);
        ObjectList.field_b = GameAssetLoader.connectingTranslations[param0];
        hra.field_c = TrackMountComponent.waitingForTextTranslations[param0];
        CrossedSineBandsOperator.field_s = LoginMethod.loadingTextTranslations[param0];
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        if (param0 != 0) {
          field_p = (HiscoreTable) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    FacePlayerLocomotor(Room param0, boolean param1) {
        super(param0, param1);
        try {
          this.field_o = 16;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    FacePlayerLocomotor(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_o = CoinItemComponent.fromOffsetBinary(true, 12, param1.readBits((byte) 44, 12));
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void encode(BitPacketBuffer param0, byte param1) {
        try {
          super.encode(param0, (byte) -124);
          param0.writeBits((byte) 37, dqa.toOffsetBinary(true, this.field_o, 12), 12);
          if (param1 > -78) {
            FacePlayerLocomotor.getOrRequestRatingTable(-12, 90, -68, 66);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pt.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static RatingTable getOrRequestRatingTable(int param0, int param1, int param2, int param3) {
        Object var4;
        RatingTable var4_ref;
        int var5;
        RatingTable var6;
        RatingTable var7;
        RatingTable var4_refLifetime1;
        RatingTable var4_refLifetime2;
        var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 == 22578) {
          var4_ref = (RatingTable) (LoadingStepList.field_d.first(-80));
          while (var4_ref != null) {
            if (param3 == var4_ref.field_n) {
              return var4_ref;
            }
            var4_ref = (RatingTable) (LoadingStepList.field_d.next(param0 - 22454));
          }
          var6 = new RatingTable();
          var6.field_n = param3;
          var6.field_k = param2;
          LoadingStepList.field_d.addLast((byte) -49, var6);
          GameClock.sendRatingTableRequest(var6, param1, 2147);
          return var6;
        }
        field_p = (HiscoreTable) null;
        var4_refLifetime1 = (RatingTable) (LoadingStepList.field_d.first(-80));
        while (var4_refLifetime1 != null) {
          if (param3 == var4_refLifetime1.field_n) {
            return var4_refLifetime1;
          }
          var4_refLifetime1 = (RatingTable) (LoadingStepList.field_d.next(param0 - 22454));
        }
        var7 = new RatingTable();
        var4_refLifetime2 = var7;
        var7.field_n = param3;
        var7.field_k = param2;
        LoadingStepList.field_d.addLast((byte) -49, var7);
        GameClock.sendRatingTableRequest(var7, param1, 2147);
        return var7;
    }

    static {
        field_q = "Hans";
        field_p = null;
    }
}
