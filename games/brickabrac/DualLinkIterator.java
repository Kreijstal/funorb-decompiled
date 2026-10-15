/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DualLinkIterator implements Iterator {
    private DualLinkNode nextNode;
    static int collisionNormalY256;
    static GzipInflater archiveGzipInflater;
    private DualLinkDeque owner;
    static String field_i;
    private DualLinkNode lastReturned;
    static ValidationStatus validationValid;
    static RgbSprite[][] jungleSegsSprites;
    static int fullscreenDialogBodyBaseline;

    public static void a(byte param0) {
        field_i = null;
        validationValid = null;
        archiveGzipInflater = null;
        if (param0 < 55) {
          return;
        }
        jungleSegsSprites = (RgbSprite[][]) null;
    }

    final static void closeTextChoiceDialog(byte obfuscationGuard) {
        va.textChoiceDialogOpen = false;
        if (obfuscationGuard < 97) {
          DualLinkIterator.a((byte) -19);
        }
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary(3);
        this.lastReturned = null;
    }

    public final Object next() {
        Object node = this.nextNode;
        if (this.owner.sentinel == node) {
          node = null;
          this.nextNode = null;
        } else {
          this.nextNode = ((DualLinkNode) (node)).secondaryNext;
        }
        this.lastReturned = (DualLinkNode) (node);
        return node;
    }

    public final boolean hasNext() {
        return this.owner.sentinel != this.nextNode;
    }

    final static RgbSprite[] loadRgbSprites(int fileId, int obfuscationGuard, int groupId, ResourceArchive archive) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        RgbSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -23176) {
            DualLinkIterator.a((byte) -84);
          }
          if (BytePayloadSubmission.decodeSpritesFromArchive(-107, fileId, archive, groupId)) {
            stackIn_6_0 = GamePresentationHelpers.buildRgbSprites(117);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (RgbSprite[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ae.B(").append(fileId).append(',').append(obfuscationGuard).append(',').append(groupId).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    DualLinkIterator(DualLinkDeque owner) {
        this.lastReturned = null;
        try {
          this.owner = owner;
          this.nextNode = this.owner.sentinel.secondaryNext;
          this.lastReturned = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ae.<init>(" + (owner != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Name";
        archiveGzipInflater = new GzipInflater();
        validationValid = new ValidationStatus();
    }
}
