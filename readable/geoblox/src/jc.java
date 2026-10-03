/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static Sprite field_a;
    static String toCustomerSupportText;
    static String field_b;

    final static void requestAvatarFeedback(int feedbackRequestId, boolean clearSpriteGuard) {
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.field_C;
        if ((7 == feedbackRequestId) &&
            (MenuScreen.avatarFeedbackFrameBase != 36)) {
          MenuScreen.avatarFeedbackFrameBase = 36;
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
          nd.avatarFeedbackModeId = 6;
          td.playPcmSample(-348, fl.field_c[23]);
        }
        if (LimitedRandomAccessFile.avatarFeedbackHoldTicks > 0) {
          if (feedbackRequestId == 3) {
            wa.avatarShockEffectTicks = 50;
            td.playPcmSample(-348, fl.field_c[27]);
          }
        } else {
          if (!clearSpriteGuard) {
            if (feedbackRequestId != 0) {
              if (1 == feedbackRequestId) {
                nd.avatarFeedbackModeId = 1;
                MenuScreen.avatarFeedbackFrameBase = 6;
              } else {
                if (feedbackRequestId != 2) {
                  if (3 == feedbackRequestId) {
                    MenuScreen.avatarFeedbackFrameBase = 18;
                    wa.avatarShockEffectTicks = 50;
                    LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                    nd.avatarFeedbackModeId = 3;
                    td.playPcmSample(-348, fl.field_c[27]);
                  } else {
                    if (feedbackRequestId == 4) {
                      LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                      MenuScreen.avatarFeedbackFrameBase = 24;
                      nd.avatarFeedbackModeId = 4;
                    } else {
                      if (feedbackRequestId == 5) {
                        LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                        nd.avatarFeedbackModeId = 5;
                        MenuScreen.avatarFeedbackFrameBase = 30;
                        td.playPcmSample(-348, fl.field_c[24]);
                      }
                    }
                  }
                } else {
                  if ((12 != MenuScreen.avatarFeedbackFrameBase) &&
                      (MenuScreen.avatarFeedbackFrameBase != 24) &&
                      (30 != MenuScreen.avatarFeedbackFrameBase) &&
                      (36 != MenuScreen.avatarFeedbackFrameBase)) {
                    td.playPcmSample(-348, fl.field_c[26]);
                  }
                  nd.avatarFeedbackModeId = 2;
                  MenuScreen.avatarFeedbackFrameBase = 12;
                }
              }
            } else {
              if ((MenuScreen.avatarFeedbackFrameBase != 0) &&
                  (24 != MenuScreen.avatarFeedbackFrameBase) &&
                  (MenuScreen.avatarFeedbackFrameBase != 30) &&
                  (MenuScreen.avatarFeedbackFrameBase != 36)) {
                td.playPcmSample(-348, fl.field_c[25]);
              }
              MenuScreen.avatarFeedbackFrameBase = 0;
              nd.avatarFeedbackModeId = 0;
            }
          } else {
            field_a = (Sprite) null;
            if (feedbackRequestId == 0) {
              if ((MenuScreen.avatarFeedbackFrameBase != 0) &&
                  (24 != MenuScreen.avatarFeedbackFrameBase) &&
                  (MenuScreen.avatarFeedbackFrameBase != 30) &&
                  (MenuScreen.avatarFeedbackFrameBase != 36)) {
                td.playPcmSample(-348, fl.field_c[25]);
              }
              MenuScreen.avatarFeedbackFrameBase = 0;
              nd.avatarFeedbackModeId = 0;
            } else {
              if (1 == feedbackRequestId) {
                nd.avatarFeedbackModeId = 1;
                MenuScreen.avatarFeedbackFrameBase = 6;
              } else {
                if (feedbackRequestId != 2) {
                  if (3 == feedbackRequestId) {
                    MenuScreen.avatarFeedbackFrameBase = 18;
                    wa.avatarShockEffectTicks = 50;
                    LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                    nd.avatarFeedbackModeId = 3;
                    td.playPcmSample(-348, fl.field_c[27]);
                  } else {
                    if (feedbackRequestId == 4) {
                      LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                      MenuScreen.avatarFeedbackFrameBase = 24;
                      nd.avatarFeedbackModeId = 4;
                    } else {
                      if (feedbackRequestId == 5) {
                        LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                        nd.avatarFeedbackModeId = 5;
                        MenuScreen.avatarFeedbackFrameBase = 30;
                        td.playPcmSample(-348, fl.field_c[24]);
                      }
                    }
                  }
                } else {
                  if ((12 != MenuScreen.avatarFeedbackFrameBase) &&
                      (MenuScreen.avatarFeedbackFrameBase != 24) &&
                      (30 != MenuScreen.avatarFeedbackFrameBase) &&
                      (36 != MenuScreen.avatarFeedbackFrameBase)) {
                    td.playPcmSample(-348, fl.field_c[26]);
                  }
                  nd.avatarFeedbackModeId = 2;
                  MenuScreen.avatarFeedbackFrameBase = 12;
                }
              }
            }
          }
          DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
        }
    }

    final static MeshMaterial[] readMeshMaterials(PacketBuffer input, boolean readEnabled) {
        int materialIndex = 0;
        int formatVersion = 0;
        RuntimeException contextFailure = null;
        int materialCount = 0;
        MeshMaterial[] materials = null;
        MeshMaterial newMaterial = null;
        int referencedMaterialIndex = 0;
        int controlFlagSnapshot = 0;
        MeshMaterial[] disabledResult = null;
        Object unsupportedVersionResult = null;
        MeshMaterial[] decodedMaterialsResult = null;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String inputContextDescription = null;
        RuntimeException caughtFailure = null;
        controlFlagSnapshot = Geoblox.field_C;
        try {
          formatVersion = input.readBits((byte) -17, 8);
          if (!readEnabled) {
            disabledResult = (MeshMaterial[]) null;
            return disabledResult;
          }
          if (0 < formatVersion) {
            unsupportedVersionResult = null;
            return (MeshMaterial[]) ((Object) unsupportedVersionResult);
          }
          materialCount = input.readBits((byte) -17, 12);
          materials = new MeshMaterial[materialCount];
          for (materialIndex = 0; materialCount > materialIndex; materialIndex++) {
            if (!ac.a((byte) 71, input)) {
              referencedMaterialIndex = input.readBits((byte) -17, td.a(materialIndex - 1, (byte) 66));
              materials[materialIndex] = materials[referencedMaterialIndex];
            } else {
              newMaterial = new MeshMaterial();
              input.readBits((byte) -17, 24);
              input.readBits((byte) -17, 24);
              newMaterial.baseRgb = input.readBits((byte) -17, 24);
              input.readBits((byte) -17, 9);
              input.readBits((byte) -17, 12);
              input.readBits((byte) -17, 12);
              input.readBits((byte) -17, 12);
              materials[materialIndex] = newMaterial;
            }
          }
          decodedMaterialsResult = (MeshMaterial[]) (materials);
          return decodedMaterialsResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          failureContextCause = (RuntimeException) (contextFailure);
          failureContextBuilder = new StringBuilder().append("jc.D(");
          if (input == null) {
            inputContextDescription = "null";
          } else {
            inputContextDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(inputContextDescription).append(',').append(readEnabled).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 > -13) {
            field_a = (Sprite) null;
            toCustomerSupportText = null;
            return;
        }
        toCustomerSupportText = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param2 <= -33) {
            var3 = param0 >> 31 & param1 - 1;
            return var3 + ((param0 >>> 31) + param0) % param1;
        }
        return 80;
    }

    static {
        toCustomerSupportText = "To Customer Support";
    }
}
