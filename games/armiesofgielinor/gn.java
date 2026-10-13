/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private int field_c;
    private StringBuilder field_a;
    private boolean field_b;

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

    final void a(int param0, int param1) {
        if (!this.field_b) {
          this.b(param0 ^ 125);
        }
        this.field_c = this.field_c + param1;
        if (param0 != 0) {
          this.b(123);
        }
    }

    final void a(byte param0, String param1) {
        try {
          this.a(param1, 0);
          this.b(124);
          if (param0 != 19) {
            this.field_c = 9;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) {
        if (param0 < 119) {
          this.field_a = (StringBuilder) null;
        }
        StringBuilder discarded$0 = this.field_a.append("\n");
        this.field_b = true;
    }

    private final void a(String param0, int param1) {
        StringBuilder discarded$12 = null;
        wj var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_b) {
            this.a(0);
          }
          discarded$12 = this.field_a.append(param0);
          if (param1 != 0) {
            var4 = (wj) null;
            gn.a(-82, (wj) null, 123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gn.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(String[] param0, byte param1) {
        try {
          if (param1 >= -45) {
            String var4 = (String) null;
            this.a((byte) 62, (String) null);
          }
          this.a((byte) 19, SpellCastEvent.a(593277313, (CharSequence[]) ((Object) param0)));
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void openQuickChatHelp(int obfuscationGuard) {
        Spell.quickChatHelpDialog = new QuickChatHelpDialog(ArchiveIndex.field_b, UnitModelPreview.field_m, uc.field_b, eq.field_h, ArrayWidgetContainer.field_H, DualLinkedNode.field_k);
        if (obfuscationGuard != 5) {
          gn.openQuickChatHelp(-31);
        }
    }

    gn() {
        this.field_a = new StringBuilder(1024);
        this.field_b = true;
    }

    final String c(int param0) {
        if (param0 != 1024) {
          return (String) null;
        }
        return this.field_a.toString();
    }

    private final void a(int param0) {
        int var2 = 0;
        StringBuilder discarded$0 = null;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (var2 = param0; var2 < this.field_c; var2++) {
          discarded$0 = this.field_a.append(" ");
        }
        this.field_b = false;
    }

    static {
    }
}
