/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndentedTextBuilder {
    private int indent;
    private StringBuilder builder;
    private boolean atLineStart;

    final static void a(int param0, wj param1, int param2) {
        CipherPacketBuffer var3 = null;
        try {
          var3 = EmailValidator.outgoingPacket;
          var3.writeCipheredOpcode(32161, param0);
          var3.writeByte(1, 5);
          var3.writeByte(param2 + 1, param2);
          var3.writeShort(true, param1.field_r);
          var3.writeByte(1, param1.field_k);
          var3.writeByte(1, param1.field_p);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void changeIndent(int obfuscationGuard, int indentDelta) {
        if (!this.atLineStart) {
          this.endLine(obfuscationGuard ^ 125);
        }
        this.indent = this.indent + indentDelta;
        if (obfuscationGuard != 0) {
          this.endLine(123);
        }
    }

    final void appendLine(byte obfuscationGuard, String text) {
        try {
          this.appendText(text, 0);
          this.endLine(124);
          if (obfuscationGuard != 19) {
            this.indent = 9;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gn.A(" + obfuscationGuard + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    private final void endLine(int obfuscationGuard) {
        if (obfuscationGuard < 119) {
          this.builder = (StringBuilder) null;
        }
        StringBuilder discarded$0 = this.builder.append("\n");
        this.atLineStart = true;
    }

    private final void appendText(String text, int obfuscationGuard) {
        StringBuilder discarded$12 = null;
        wj var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.atLineStart) {
            this.writeIndent(0);
          }
          discarded$12 = this.builder.append(text);
          if (obfuscationGuard != 0) {
            var4 = (wj) null;
            IndentedTextBuilder.a(-82, (wj) null, 123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gn.B(");
          if (text == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void appendJoinedLine(String[] parts, byte obfuscationGuard) {
        try {
          if (obfuscationGuard >= -45) {
            String var4 = (String) null;
            this.appendLine((byte) 62, (String) null);
          }
          this.appendLine((byte) 19, SpellCastEvent.a(593277313, (CharSequence[]) ((Object) parts)));
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gn.D(" + (parts != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void openQuickChatHelp(int obfuscationGuard) {
        Spell.quickChatHelpDialog = new QuickChatHelpDialog(ArchiveIndex.field_b, UnitModelPreview.field_m, SpellDefinitionTable.field_b, PasswordLoginCredentials.field_h, ArrayWidgetContainer.field_H, DualLinkedNode.field_k);
        if (obfuscationGuard != 5) {
          IndentedTextBuilder.openQuickChatHelp(-31);
        }
    }

    IndentedTextBuilder() {
        this.builder = new StringBuilder(1024);
        this.atLineStart = true;
    }

    final String toText(int obfuscationGuard) {
        if (obfuscationGuard != 1024) {
          return (String) null;
        }
        return this.builder.toString();
    }

    private final void writeIndent(int obfuscationGuard) {
        int var2 = 0;
        StringBuilder discarded$0 = null;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (var2 = obfuscationGuard; var2 < this.indent; var2++) {
          discarded$0 = this.builder.append(" ");
        }
        this.atLineStart = false;
    }

    static {
    }
}
