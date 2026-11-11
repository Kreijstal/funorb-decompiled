/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CourseLayoutFactory implements BitDecodableFactory {
    static kia field_d;
    static oc[] field_e;
    static String field_a;
    static String[] boulderDeathMessages;
    static byte[] field_b;

    final static boolean b(int param0) {
        if (param0 <= 27) {
          field_b = (byte[]) null;
          return al.field_j;
        }
        return al.field_j;
    }

    final static int c(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (NanoTickClock.pollKeyEvent(true)) {
            FacePointLocomotor.field_r.handleVerticalNavigation(102);
            if (FacePointLocomotor.field_r.isActivated(false)) {
              var1_int = 1;
            }
            if (MenuEntry.field_h != 13) {
              continue;
            }
            var2 = 1;
          }
          if (param0 < 53) {
            stackIn_10_0 = 95;
            return stackIn_10_0;
          }
          FacePointLocomotor.field_r.updatePointer(wg.a(1541709953, PasswordValidator.field_m, RidgedNoise3D.field_p), 73, wg.a(1541709953, AgeValidator.field_j, GridWidgetContainer.field_B));
          if (FacePointLocomotor.field_r.isActivated(false)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            FacePointLocomotor.field_r.selectedIndex >= 0) {
            var3 = SpriteTileOperator.field_w[FacePointLocomotor.field_r.selectedIndex];
            if (var3 == 2) {
              AppletGameShell.resetConnectionStatics(-18);
            } else if (var3 == 5) {
              AppletGameShell.resetConnectionStatics(-18);
            }
          } else {
            if (var2 != 0 &&
              2 != mq.field_a) {
              AppletGameShell.resetConnectionStatics(-18);
            }
          }
          if (var3 == 0 &&
            2 == mq.field_a) {
            var4 = bva.currentTimeMillis((byte) -107) - PlatformComponent.field_H;
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              var3 = 2;
              qna.a(1, true, 5);
            }
          }
          stackIn_31_0 = var3;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "vk.D(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        boulderDeathMessages = null;
        field_d = null;
        field_e = null;
        if (param0 != 0) {
          field_d = (kia) null;
        }
    }

    public final BitDecodable[] createArray(int param0, int param1) {
        if (param1 != -26955) {
          field_a = (String) null;
          return (BitDecodable[]) ((Object) new CourseLayout[param0]);
        }
        return (BitDecodable[]) ((Object) new CourseLayout[param0]);
    }

    public final BitDecodable create(byte param0) {
        if (param0 > -17) {
          this.create((byte) 88);
          return (BitDecodable) ((Object) new CourseLayout());
        }
        return (BitDecodable) ((Object) new CourseLayout());
    }

    static {
        field_a = "These aren't just common or garden Lindemann totems. Hold <img=8><img=9> to shove them around like heavy rock flamethrowers.";
        boulderDeathMessages = new String[]{"<%0> forgot to dodge the boulder", "<%0> rolled with it", "<%0> was bowled over", "<%0> was smeared", "<%0> developed a serious crush", "<%0>'s interests include hard rock", "<%0> made a poor speedbump"};
        field_d = new kia();
    }
}
