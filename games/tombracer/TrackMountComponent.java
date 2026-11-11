/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackMountComponent extends PrefabComponent {
    static String field_H;
    static SoftReferenceCache field_J;
    private int field_F;
    static String field_G;
    static String field_I;
    static String[] waitingForTextTranslations;

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          field_I = (String) null;
          return false;
        }
        return false;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        TrackPlayerLocomotor var5 = null;
        int var6 = 0;
        ModelCodec var7 = null;
        TrapBaseModel var8 = null;
        Trap var9 = null;
        int stackIn_3_0 = 0;
        TrackPlayerLocomotor stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        Trap stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new Trap(param2, param0);
          var9.setSize((byte) -11, this.height, this.width);
          var9.setObstructionLevel(3, 0);
          var9.setCollisionLevel(1, (byte) -12, true);
          var9.setWeight((byte) -3, 6);
          var9.setFloating((byte) 17, false);
          var9.setPushMode(119, 2);
          var9.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param2, param0)));
          var5 = new TrackPlayerLocomotor(param2, param0);
          stackIn_3_0 = (34 != this.getTypeId(12)) ? 0 : 1;
          var6 = stackIn_3_0;
          var5.b(11050, var6 != 0);
          stackIn_5_0 = var5;
          stackIn_5_1 = param1 - 3;
          stackIn_6_2 = (var6 == 0);
          ((TrackPlayerLocomotor) (Object) stackIn_5_0).c(stackIn_5_1, stackIn_6_2);
          var5.setSpeed(false, this.field_F);
          var9.addLocomotor(var5, param1 ^ param1);
          var7 = rm.field_a;
          var8 = (TrapBaseModel) (var7.createModel(16, param1 + 119));
          var8.setVariant(param1 ^ 8021, 0);
          var9.addModel(var5, (byte) 124, var8);
          stackIn_7_0 = var9;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("wha.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) 28, SpawnerBehaviour.fixed16ToBits((byte) 8, 4, this.field_F), 8);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "wha.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    TrackMountComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        this.field_F = 131072;
        try {
          this.field_F = NodeHashTable.bitsToFixed16(param2.readBits((byte) 44, 8), 104, 4);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "wha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    TrackMountComponent(Room param0, int param1) {
        super(param0, param1);
        this.field_F = 131072;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          field_J = (SoftReferenceCache) null;
          return true;
        }
        return true;
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          this.hasSize(-48);
          return false;
        }
        return false;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          return -65;
        }
        return 7;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(param0 + 250, 2097152, 2097152);
        this.setMounts((byte) 112, new ComponentMount[]{new ComponentMount(0, 0, 2097152, 0, 40)});
    }

    public static void releaseStatics(byte param0) {
        field_J = null;
        field_H = null;
        field_I = null;
        waitingForTextTranslations = null;
        field_G = null;
        int var1 = -80 / ((param0 + 32) / 57);
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          field_H = (String) null;
          return true;
        }
        return true;
    }

    static {
        field_H = "<%0> cannot join; the game has started.";
        field_J = new SoftReferenceCache(64);
        field_I = "<%0> has not yet unlocked this option for use.";
        field_G = "To <%0>: ";
        waitingForTextTranslations = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
