/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UsernameLoginCredentials extends LoginCredentials {
    static String field_g;
    private long packedUsername;
    static ResourceArchive field_h;
    static String field_j;
    static int field_k;
    static String field_l;
    private String password;

    LoginCredentialKind getCredentialKind(boolean param0) {
        if (!param0) {
          return (LoginCredentialKind) null;
        }
        return UrlPacketDownloader.field_c;
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_j = null;
        if (param0 != 24957) {
          return;
        }
        field_l = null;
        field_h = null;
    }

    final static void a(int param0, int param1, byte param2, NineSliceFrame param3) {
        try {
          NameAvailabilityFactory.field_c = param0;
          if (param2 != -13) {
            field_k = 125;
          }
          DecodedSpritePalette.field_c = param1;
          FriendOrderingHelpers.field_c = param3;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "bb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        if (!StringPaddingHelpers.isMenuScreenActive(param0 ^ 25325)) {
          return;
        }
        TriangleMesh.a(false, 4, 15991);
        if (param0 != -100) {
          UsernameLoginCredentials.b((byte) 126);
        }
    }

    final static String getDisplayNameCharacterError(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = wizardrun.field_H;
        try {
          var3 = DisplayNameSyntaxHelpers.getDisplayNameStructureError(param0, (byte) -118, param2);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          var4 = param1;
          while (true) {
            if (param0.length() <= var4) {
              return null;
            }
            if (RasterBuffer.isBasicNameCharacter(param0.charAt(var4), true)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_10_0 = AccountCreationForm.field_Q;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("bb.L(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void popRasterState(int param0) {
        RasterSnapshot var1 = (RasterSnapshot) (RasterSnapshotStack.field_b.removeLast(8192));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRasterizer.setTarget(var1.field_q, var1.field_v, var1.field_o);
        SoftwareRasterizer.setClip(var1.field_r, var1.field_u, var1.field_s, var1.field_p);
        var1.field_q = null;
        StatefulWidgetPainter.field_q.addLast(var1, false);
        if (param0 == 4) {
          return;
        }
        UsernameLoginCredentials.b((byte) -18);
    }

    final void writeCredentials(int param0, PacketBuffer param1) {
        try {
          param1.writeLong(param0 + 1290648724, this.packedUsername);
          param1.writeBase38Name(this.password, -66);
          if (param0 != 4) {
            PacketBuffer var4 = (PacketBuffer) null;
            this.writeCredentials(-43, (PacketBuffer) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "bb.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    UsernameLoginCredentials(long param0, String param1) {
        try {
          this.packedUsername = param0;
          this.password = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "bb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "STARPOWER";
        field_l = "Name";
    }
}
