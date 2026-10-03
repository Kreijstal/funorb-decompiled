/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkNode field_b;
    private SecondaryNodeDeque field_a;
    private DualLinkNode field_d;
    static String instructionsText;
    static boolean field_e;

    final static void a(String param0, byte param1, String param2) {
        try {
            if (param1 != 66) {
                instructionsText = (String) null;
            }
            AccountCreationDialog.a(param2, (byte) 87, false, param0);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ef.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        return this.field_a.field_c != this.field_d;
    }

    public final void remove() {
        if (null == this.field_b) {
            throw new IllegalStateException();
        }
        this.field_b.unlinkSecondaryNode((byte) 92);
        this.field_b = null;
    }

    final static void advanceActiveEntityAnimations(byte param0) {
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        GameplayEntity var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.clientControlFlowFlag;
        try {
          var1_float = UiWidget.gameplaySession.boardAngleRadians;
          ab.moveEntitiesAndCollectContacts(param0 - 22, var1_float);
          ResourceArchive.updateAttachedEntities((byte) 123);
          if (param0 != -15) {
            SecondaryNodeDequeIterator.a((byte) -11);
          }
          var2 = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.firstForIteration(0));
          while (var2 != null) {
            var2.advanceEntityAnimation(true);
            if (var2.animationFrameIndex >= 3) {
              var2.entityQueue = SecondaryNodeDeque.availableEntities;
              var2.animationFrameIndex = 0;
            }
            var2 = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.nextForIteration(1));
          }
          if (UiWidget.gameplaySession.tutorialPromptActive) {
            return;
          }
          lc.updateSpawnQueue(255);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "ef.A(" + param0 + ')');
        }
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_b = null;
        try {
            this.field_a = param0;
            this.field_d = this.field_a.field_c.nextSecondaryNode;
            this.field_b = null;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ef.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        instructionsText = null;
        if (param0 != 101) {
            field_e = false;
        }
    }

    final static Sprite a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Geoblox.clientControlFlowFlag;
        Sprite var6 = new Sprite(param2, param2);
        Sprite var3 = var6;
        for (var4 = param0; var3.pixels.length > var4; var4++) {
            var6.pixels[var4] = param1;
        }
        return var3;
    }

    public final Object next() {
        Object var1 = this.field_d;
        if (var1 != this.field_a.field_c) {
            this.field_d = ((DualLinkNode) (var1)).nextSecondaryNode;
        } else {
            var1 = null;
            this.field_d = null;
        }
        this.field_b = (DualLinkNode) (var1);
        return var1;
    }

    static {
        instructionsText = "Instructions";
        field_e = false;
    }
}
