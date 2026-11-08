/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UsernameCredentials extends LoginCredentials {
    static int field_g;
    static String field_i;
    static String field_f;
    private String field_e;
    private long field_h;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              var3 = 13 % ((param0 + 29) / 56);
              param1.getAppletContext().showDocument(nm.appendSessionParameters(param1, var2, -31843), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var2_ref2;
            stackIn_6_1 = new StringBuilder().append("im.Q(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static LobbyGameEntry a(int param0, byte param1) {
        if (param1 < -28) {
          return null == nk.field_q ? null : (LobbyGameEntry) (nk.field_q.get((long)param0, (byte) -102));
        }
        field_i = (String) null;
        return null == nk.field_q ? null : (LobbyGameEntry) (nk.field_q.get((long)param0, (byte) -102));
    }

    final static void d(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5 = SpriteState.field_s;
          var1 = var5;
          if (param0 != -24000) {
            field_i = (String) null;
          }
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1_ref), "im.P(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        CipherPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var1_int = -117 / ((param0 - 89) / 35);
          var2 = he.field_e;
          while (DateOfBirthValidator.d(0)) {
            var2.writeOpcode((byte) -66, 8);
            fieldTemp$0 = var2.position + 1;
            var2.position = var2.position + 1;
            var3 = fieldTemp$0;
            ho.a(-5534, var2);
            he.field_e.writeByteLengthAtMark(var2.position - var3, (byte) 43);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1), "im.O(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
          ff.a(false, param2, (byte) -97, param0);
          if (param1 != 0) {
            UsernameCredentials.releaseStatics((byte) -12);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "im.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    CredentialKind getCredentialKind(int param0) {
        if (param0 != 0) {
          field_i = (String) null;
          return MusicPatchPcmStream.field_m;
        }
        return MusicPatchPcmStream.field_m;
    }

    final static wa a(int param0, String param1) {
        String var2 = null;
        wa var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_12_0 = null;
        wa stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (null == ie.field_Qb) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (0 == param1.length()) {
            stackIn_7_0 = null;
            return (wa) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = Js5ArchiveManager.a(var6, -13);
          if (param0 != 0) {
            UsernameCredentials.releaseStatics((byte) 70);
          }
          if (var2 == null) {
            stackIn_12_0 = null;
            return (wa) (stackIn_12_0);
          }
          var3 = (wa) (ie.field_Qb.get((long)var2.hashCode(), (byte) -72));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_Cb);
            var4 = Js5ArchiveManager.a(var7, -13);
            if (!var4.equals(var2)) {
              var3 = (wa) (ie.field_Qb.getNextWithSameKey(-107));
              continue;
            }
            break;
          }
          stackIn_18_0 = var3;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("im.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void writeTo(PacketBuffer param0, int param1) {
        try {
          param0.writeLong(this.field_h, (byte) 109);
          int var3_int = 116 / ((-35 - param1) / 36);
          param0.writeBase38Name((byte) 7, this.field_e);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "im.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, MidiPcmStream param1, PlatformTaskDispatcher param2, java.awt.Component param3, int param4, boolean param5) {
        try {
          if (param4 != -22836) {
            field_f = (String) null;
          }
          sm.initializeAudio(param4 ^ 22876, param5, param0, param1, param3, 1024, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "im.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static CoverageBitmapFont a(ResourceArchive param0, int param1, ResourceArchive param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        CoverageBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!fc.a(50, param0, param4, param1)) {
            stackIn_2_0 = null;
            return (CoverageBitmapFont) (stackIn_2_0);
          }
          if (param3 < 44) {
            field_i = (String) null;
          }
          stackIn_6_0 = SpellProjectile.createCoverageFont(param2.getFile(param1, 26219, param4), 45);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("im.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    UsernameCredentials(long param0, String param1) {
        try {
          this.field_e = param1;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "im.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        if (param0 == -14) {
          field_i = null;
          return;
        }
        String var2 = (String) null;
        UsernameCredentials.a((String) null, -94, (String) null);
        field_i = null;
    }

    static {
        field_g = 65;
        field_i = "Turn time remaining: <%0><br><br>It is currently your turn and time is ticking down.<br><br>If you don't move soon you will miss your go!";
        field_f = "OK";
    }
}
