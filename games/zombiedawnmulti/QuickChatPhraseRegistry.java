/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseRegistry {
    private WeightedLruCache field_a;
    private ResourceArchive field_b;
    private ResourceArchive field_c;

    final static void addQuickChatSubmenu(byte param0, QuickChatMenu param1) {
        try {
          PlayerProfile.field_l.addChild((byte) 50, param1);
          if (param0 < 42) {
            QuickChatMenu var3 = (QuickChatMenu) null;
            QuickChatPhraseRegistry.addQuickChatSubmenu((byte) 16, (QuickChatMenu) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "an.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final QuickChatPhraseDefinition getDefinition(int param0, int param1) {
        byte[] var4 = null;
        if (param1 != -11452) {
          return (QuickChatPhraseDefinition) null;
        }
        QuickChatPhraseDefinition var3 = (QuickChatPhraseDefinition) (this.field_a.get((byte) 127, (long)param0));
        if (var3 != null) {
          return var3;
        }
        if (param0 < 32768) {
          var4 = this.field_c.getFile(1, true, param0);
        } else {
          var4 = this.field_b.getFile(1, true, param0 & 32767);
        }
        QuickChatPhraseDefinition var5 = new QuickChatPhraseDefinition();
        if (var4 != null) {
          var5.decode(new PacketBuffer(var4), (byte) 118);
          if (param0 >= 32768) {
            var5.applyGlobalIds((byte) 100);
            this.field_a.put(var5, (long)param0, 1);
            return var5;
          }
          this.field_a.put(var5, (long)param0, 1);
          return var5;
        }
        if (param0 < 32768) {
          this.field_a.put(var5, (long)param0, 1);
          return var5;
        }
        var5.applyGlobalIds((byte) 100);
        this.field_a.put(var5, (long)param0, 1);
        return var5;
    }

    final static void drawRootUiAndOverlay(int param0, boolean param1) {
        BirthDateEntryPanel var2 = null;
        ImageProducerRasterBuffer.field_k.drawRoot(param1, -1);
        if (param0 == 1) {
          var2 = PendingIntArrayReply.field_f;
          if (var2 != null) {
            var2.renderWidgetPassesAndTooltip(param0 ^ -112, ImageProducerRasterBuffer.field_k.field_qb, ImageProducerRasterBuffer.field_k.field_w);
          }
          return;
        }
    }

    final static ConditionalTextValue createLoginCredentials(int param0) {
        if (param0 != 1) {
          return (ConditionalTextValue) null;
        }
        return new ConditionalTextValue(ArchiveLoadStep.getPendingEmail(91), MusicPatch.isEmailAvailabilityPending(128));
    }

    QuickChatPhraseRegistry(int param0, ResourceArchive param1, ResourceArchive param2, QuickChatContext param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_a = new WeightedLruCache(64);
        try {
          this.field_c = param1;
          this.field_b = param2;
          if (this.field_c != null) {
            this.field_c.getFileCount(1, -2);
          }
          if (this.field_b == null) {
            return;
          }
          this.field_b.getFileCount(1, -2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("an.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
