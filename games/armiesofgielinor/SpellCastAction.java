/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpellCastAction extends PreparedAction {
    static String field_y;
    static String field_v;
    static char[] keyEventCharacters;
    private int selectionMode;
    private Spell spell;
    static boolean field_t;
    static boolean field_s;

    final static void b(int param0, int param1) {
        if (param0 != 8) {
          return;
        }
        ps.a(param1, true);
    }

    final void applyToBattlefield(int obfuscationGuard, Battlefield battlefield) {
        battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SpellCastEvent(this.spell, this.selectionMode, this.actingPlayer)));
        if (obfuscationGuard != 64) {
          return;
        }
        try {
          this.spell.finishEffect(battlefield, obfuscationGuard - 1700635504);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ua.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        bw var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        String var8 = null;
        byte[] var9 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3 > 0) {
            var9 = new byte[param1];
            var4 = var9;
            for (var5_int = 0; var5_int < param1; var5_int++) {
              var9[var5_int] = param2[var5_int + param3];
            }
          } else {
            var4 = param2;
          }
          var5 = new bw();
          var5.b(200);
          var5.a((byte) -57, (long)(8 * param1), var4);
          if (param0 != -18423) {
            var8 = (String) null;
            SpellCastAction.a(44, (byte) 45, (String) null);
          }
          var6 = new byte[64];
          var5.a(var6, 0, true);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(int param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 51) {
            var6 = (String) null;
            SpellCastAction.a((java.applet.Applet) null, 31, (String) null, false);
          }
          var3 = ContentTransitionDialog.field_W[param0];
          var4 = db.a(true, '_');
          var5 = var3 + var4 + param2;
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ua.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2, boolean param3) {
        try {
          int var4_int = 0;
          if (PlatformTaskService.lowercaseOsName.startsWith("win") &&
            br.a(param2, true)) {
            return;
          }
          var4_int = -80 / ((param1 - 12) / 48);
          try {
            param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
          } catch (java.net.MalformedURLException malformedURLException) {
            af.a((Throwable) null, 107, "MGR1: " + param2);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    SpellCastAction(Spell spell, int selectionMode, int actingPlayer) {
        try {
          this.selectionMode = selectionMode;
          this.spell = spell;
          this.actingPlayer = actingPlayer;
          if (this.selectionMode > -1) {
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ua.<init>(" + (spell != null ? "{...}" : "null") + ',' + selectionMode + ',' + actingPlayer + ')');
        }
    }

    public static void e(int param0) {
        field_v = null;
        keyEventCharacters = null;
        field_y = null;
        if (param0 != -4541) {
          SpellCastAction.b(-26, 75);
        }
    }

    static {
        field_y = "Respect";
        keyEventCharacters = new char[128];
        field_v = "Mute this player for 48 hours";
    }
}
