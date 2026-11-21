/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport108 extends GameDomainSupport006 {
    static String stringState0436;
    static String stringState0437;
    static int integerState0595;
    static RawSound rawSoundState0018;
    static SceneWidgetPart009[][] sceneWidgetPart009ArrayArrayState0001;
    static int integerState0596;
    static volatile int integerState0597;
    static float[] floatArrayState0002;

    final static SceneWidget computeSceneWidget1414(int integerArgument1) {
        if (integerArgument1 != 5) {
          return (SceneWidget) null;
        }
        return RenderingSupport015.sceneWidgetPart008State0006.sceneWidgetState0090;
    }

    final static void performAction1413(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        CipherPacketBuffer cipherPacketBufferLocal2 = SocketFactory.cipherPacketBufferState0002;
        int integerLocal3;
        cipherPacketBufferLocal2.performAction1811(integerArgument1, -4);
        cipherPacketBufferLocal2.position = cipherPacketBufferLocal2.position + 1;
        int integerLocal4 = cipherPacketBufferLocal2.position;
        cipherPacketBufferLocal2.performAction2023(true, 5);
        cipherPacketBufferLocal2.performAction2023(true, MixedSupport016.sceneWidgetPart013State0001.integerState0840);
        if (integerArgument2 == 1850462342) {
          integerLocal1 = (MixedSupport016.sceneWidgetPart013State0001.integerState0845 << 6) + MixedSupport016.sceneWidgetPart013State0001.integerState0842;
          cipherPacketBufferLocal2.performAction2023(true, integerLocal1);
          cipherPacketBufferLocal2.performAction2024(false, MixedSupport016.sceneWidgetPart013State0001.byteArrayState0032.length, MixedSupport016.sceneWidgetPart013State0001.byteArrayState0032, 0);
          cipherPacketBufferLocal2.performAction2029(cipherPacketBufferLocal2.position - integerLocal4, true);
          return;
        }
        MixedSupport108.performAction1415(-25);
        integerLocal3 = (MixedSupport016.sceneWidgetPart013State0001.integerState0845 << 6) + MixedSupport016.sceneWidgetPart013State0001.integerState0842;
        cipherPacketBufferLocal2.performAction2023(true, integerLocal3);
        cipherPacketBufferLocal2.performAction2024(false, MixedSupport016.sceneWidgetPart013State0001.byteArrayState0032.length, MixedSupport016.sceneWidgetPart013State0001.byteArrayState0032, 0);
        cipherPacketBufferLocal2.performAction2029(cipherPacketBufferLocal2.position - integerLocal4, true);
    }

    public static void performAction1415(int integerArgument1) {
        if (integerArgument1 == -30349) {
          stringState0437 = null;
          rawSoundState0018 = null;
          floatArrayState0002 = null;
          stringState0436 = null;
          sceneWidgetPart009ArrayArrayState0001 = (SceneWidgetPart009[][]) null;
          return;
        }
        MixedSupport108.performAction1413(99, -109);
        stringState0437 = null;
        rawSoundState0018 = null;
        floatArrayState0002 = null;
        stringState0436 = null;
        sceneWidgetPart009ArrayArrayState0001 = (SceneWidgetPart009[][]) null;
    }

    MixedSupport108(long longArgument1, String stringArgument2) {
        super(longArgument1, stringArgument2);
    }

    final MixedSupport048 computeMixedSupport0480587(int integerArgument1) {
        if (integerArgument1 != 18) {
          return (MixedSupport048) null;
        }
        return MixedSupport047.mixedSupport048State0001;
    }

    static {
        stringState0437 = "Stage:";
        stringState0436 = "Waiting for backgrounds";
        floatArrayState0002 = new float[8];
        integerState0597 = 0;
    }
}
