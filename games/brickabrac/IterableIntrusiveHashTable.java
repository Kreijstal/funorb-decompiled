/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableIntrusiveHashTable implements Iterable {
    static boolean receivedChatSystem;
    private IntrusiveNode lookupCursor;
    static Random packetRandom;
    static String field_g;
    IntrusiveNode[] buckets;
    int bucketCount;
    static ResourceArchive backgroundMusicPatchArchive;
    static UiComponent field_b;

    public static void a(int param0) {
        backgroundMusicPatchArchive = null;
        field_g = null;
        field_b = null;
        if (param0 != 24968) {
          MusicTrack var2 = (MusicTrack) null;
          IterableIntrusiveHashTable.a(-14, true, (MusicTrack) null, -51, -100, true);
          packetRandom = null;
          return;
        }
        packetRandom = null;
    }

    final IntrusiveNode get(long key, int obfuscationGuard) {
        IntrusiveNode match = null;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        IntrusiveNode bucket = this.buckets[(int)((long)(this.bucketCount - 1) & key)];
        IntrusiveNode guardedMatch;
        this.lookupCursor = bucket.next;
        if (obfuscationGuard > 85) {
          while (bucket != this.lookupCursor) {
            if (key == this.lookupCursor.key) {
              match = this.lookupCursor;
              this.lookupCursor = this.lookupCursor.next;
              return match;
            }
            this.lookupCursor = this.lookupCursor.next;
          }
          this.lookupCursor = null;
          return null;
        }
        this.bucketCount = -72;
        while (bucket != this.lookupCursor) {
          if (key == this.lookupCursor.key) {
            guardedMatch = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.next;
            return guardedMatch;
          }
          this.lookupCursor = this.lookupCursor.next;
        }
        this.lookupCursor = null;
        return null;
    }

    final void put(byte obfuscationGuard, long key, IntrusiveNode node) {
        IntrusiveNode var5 = null;
        try {
          if (null != node.previous) {
            node.unlink((byte) 111);
          }
          var5 = this.buckets[(int)(key & (long)(-1 + this.bucketCount))];
          node.previous = var5.previous;
          node.next = var5;
          node.previous.next = node;
          node.next.previous = node;
          int var6 = -64 % ((obfuscationGuard + 60) / 52);
          node.key = key;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ji.D(" + obfuscationGuard + ',' + key + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new IntrusiveHashIterator(this));
    }

    final static void a(int param0, boolean param1, MusicTrack param2, int param3, int param4, boolean param5) {
        Object var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        Object var6_ref = null;
        RuntimeException var6_ref2 = null;
        try {
          var6_ref = DirectByteStorage.field_f;
          synchronized (var6_ref) {
            if (param0 != 25459) {
              field_g = (String) null;
            }
            if (IsaacGenerator.field_a == param2) {
              return;
            }
            IsaacGenerator.field_a = param2;
            if (IsaacGenerator.field_a != null) {
              ConditionalTextValue.musicSynthesizer.a(param4, IsaacGenerator.field_a, param3, param1, param0 - 25460, param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var6_ref2;
          stackIn_15_1 = new StringBuilder().append("ji.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    IterableIntrusiveHashTable(int bucketCount) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.buckets = new IntrusiveNode[bucketCount];
        this.bucketCount = bucketCount;
        for (var2 = 0; var2 < bucketCount; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    final static LegacyEmailValidationError validateEmailDomain(String domain, int firstLabelIndex) {
        int domainLength = 0;
        RuntimeException failure = null;
        String[] labels = null;
        String[] labelsToValidate = null;
        int labelIndex = 0;
        String label = null;
        LegacyEmailValidationError labelError = null;
        int gameFlag = 0;
        LegacyEmailValidationError missingDomainError = null;
        LegacyEmailValidationError lengthError = null;
        LegacyEmailValidationError missingLabelsError = null;
        LegacyEmailValidationError returnedLabelError = null;
        LegacyEmailValidationError suffixError = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String domainSummary = null;
        RuntimeException caughtFailure = null;
        gameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          domainLength = domain.length();
          if (domainLength == 0) {
            missingDomainError = RasterEffectHelpers.missingEmailPart;
            return missingDomainError;
          }
          if (255 < domainLength) {
            lengthError = BitPacketBuffer.emailPartTooLong;
            return lengthError;
          }
          labels = FarmBackground.splitPreservingEmptyParts((byte) -11, domain, '.');
          if (2 > labels.length) {
            missingLabelsError = RasterEffectHelpers.missingEmailPart;
            return missingLabelsError;
          }
          labelsToValidate = labels;
          labelIndex = firstLabelIndex;
          while (true) {
            if (labelsToValidate.length <= labelIndex) {
              suffixError = ResourceArchive.rejectNumericEmailSuffix((byte) -95, labels[labels.length - 1]);
              return suffixError;
            }
            label = labelsToValidate[labelIndex];
            labelError = QuickChatHelpDialog.validateEmailDomainLabel(firstLabelIndex ^ 95, label);
            if (labelError == null) {
              labelIndex++;
              continue;
            }
            break;
          }
          returnedLabelError = labelError;
          return returnedLabelError;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ji.A(");
          if (domain == null) {
            domainSummary = "null";
          } else {
            domainSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(domainSummary).append(',').append(firstLabelIndex).append(')').toString());
        }
    }

    static {
        field_g = "Friends";
        packetRandom = new Random();
    }
}
