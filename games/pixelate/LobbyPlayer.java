/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyPlayer extends SceneWidget {
    boolean field_Vb;
    long field_Nb;
    String field_Fb;
    static int field_Ob;
    String field_Ub;
    SceneWidget field_Sb;
    int field_Ib;
    int field_Yb;
    SceneWidget field_Mb;
    SceneWidget field_Gb;
    long field_Pb;
    boolean field_Xb;
    static boolean field_Wb;
    static boolean field_Lb;
    SceneWidget field_Hb;
    int field_Eb;
    int field_Rb;
    int field_Qb;
    SceneWidget field_Zb;
    static String field_Kb;
    int field_Tb;
    boolean field_Jb;

    final static void a(int param0, ue param1, int param2) {
        CipherPacketBuffer var3 = null;
        try {
          var3 = aa.field_f;
          var3.g(param0, 15514);
          if (param2 != 65536) {
            ue var4 = (ue) null;
            LobbyPlayer.a(-62, (ue) null, 81);
          }
          var3.writeByte(160, 5);
          var3.writeByte(160, 0);
          var3.writeShort(1276387944, param1.field_o);
          var3.writeByte(160, param1.field_m);
          var3.writeByte(160, param1.field_s);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "uj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    LobbyPlayer(String param0, String param1, long param2) {
        super(0L, (SceneWidget) null);
        CharSequence var6 = null;
        try {
          this.field_Nb = param2;
          this.field_Fb = param1;
          this.field_Ub = param0;
          var6 = (CharSequence) ((Object) this.field_Ub);
          dh.a(var6, (byte) 77);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "uj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static aa a(boolean param0, byte param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        CipherPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        if (param1 <= 84) {
          return (aa) null;
        }
        var8 = MusicCrossfadeStream.field_o;
        var2 = var8;
        var3 = var8.readUnsignedByte(255);
        HowToPlayScreen.field_o = var3 & 127;
        stackIn_5_0 = (0 != (128 & var3));
        TextWidgetPainter.field_n = stackIn_5_0;
        BoundedRandomAccessFile.field_d = var8.readUnsignedByte(255);
        cd.field_g = var8.readLong(false);
        if (HowToPlayScreen.field_o == 2) {
          qf.field_b = var8.readUnsignedShort((byte) 2);
          ModalStack.field_I = var8.readUnsignedMedium((byte) 13);
        } else {
          qf.field_b = 0;
          ModalStack.field_I = 0;
        }
        stackIn_11_0 = (var8.readUnsignedByte(255) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        Puzzle.field_a = var8.readString(5);
        if (var4 == 0) {
          OptionsScreen.field_t = Puzzle.field_a;
        } else {
          OptionsScreen.field_t = var8.readString(5);
        }
        if (HowToPlayScreen.field_o == 1) {
          OptionsScreen.field_s = var8.readUnsignedShort((byte) -4);
          cl.field_h = var8.readString(5);
        } else {
          if (HowToPlayScreen.field_o == 4) {
            OptionsScreen.field_s = var8.readUnsignedShort((byte) -4);
            cl.field_h = var8.readString(5);
          } else {
            OptionsScreen.field_s = 0;
            cl.field_h = null;
          }
        }
        if (!param0) {
          PictureStrip.field_j = BoundedRandomAccessFile.a(80, -57, var8);
          HuffmanCodec.field_g = null;
          return new aa(param0);
        }
        var5 = var8.readUnsignedShort((byte) 127);
        try {
          var9 = jd.field_k.a(-21209, var5);
          PictureStrip.field_j = var9.getPreview((byte) -54);
          if (OptionsScreen.field_t.equals(ModalStack.field_J)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.field_u;
          }
          HuffmanCodec.field_g = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          CheckboxPainter.reportClientError(1, "CC1", (Throwable) ((Object) var6));
          HuffmanCodec.field_g = null;
          PictureStrip.field_j = null;
          return new aa(param0);
        }
        return new aa(param0);
    }

    final static void a(int param0, String param1) {
        try {
          if (param0 != -1710418464) {
            Vector3 var3 = (Vector3) null;
            LobbyPlayer.a((Vector3) null, 99, -60);
          }
          kh.a(false, param1);
          LoadingProgressDialog.a(false, TriangleMesh.field_e, -26027);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "uj.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean sortsBefore(LobbyPlayer param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 89 % ((param1 - 8) / 62);
          stackIn_3_0 = (param0.field_Jb) ? 0 : 1;
          if (this.field_Jb) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_8_0 = this.field_Jb;
            return stackIn_8_0;
          }
          if (this.field_Vb != param0.field_Vb) {
            stackIn_12_0 = this.field_Vb;
            return stackIn_12_0;
          }
          stackIn_16_0 = !(this.field_Pb >= param0.field_Pb);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("uj.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void j(int param0) {
        MainMenuScreen.field_s = false;
        dk.field_c = false;
        QuickChatMenu.a(-1, -2671);
        MatchingTextValidator.field_n = wm.field_a;
        MarkerSlider.field_X = wm.field_a;
        if (param0 != -705633312) {
          LobbyPlayer.j(-5);
        }
    }

    final boolean b(byte param0) {
        int var2 = 92 % ((-23 - param0) / 35);
        return !this.f(0) ? true : false;
    }

    final static Matrix3 a(Vector3 param0, int param1, int param2) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ConditionalTextValue var20 = null;
        Matrix3 stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_long = (long)param0.field_h;
          var5 = (long)param0.field_g;
          var7 = (long)param0.field_i;
          var9 = mi.d(-4096, param1);
          var10 = th.a(param1, 8191);
          var11 = (int)((long)var9 * var3_long >> 16);
          var12 = (int)(var5 * (long)var9 >> 16);
          var13 = (int)((long)var9 * var7 >> 16);
          var14 = (int)(var3_long * (var3_long * (long)(65536 - var10)) >> 32);
          if (param2 != 0) {
            var20 = (ConditionalTextValue) null;
            LobbyPlayer.a((byte) -55, (ConditionalTextValue) null, (ConditionalTextValue) null);
          }
          var15 = (int)((long)(65536 - var10) * var5 * var3_long >> 32);
          var16 = (int)((long)(65536 - var10) * (var3_long * var7) >> 32);
          var17 = (int)((long)(65536 - var10) * var5 * var5 >> 32);
          var18 = (int)((long)(-var10 + 65536) * var5 * var7 >> 32);
          var19 = (int)(var7 * (var7 * (long)(-var10 + 65536)) >> 32);
          stackIn_3_0 = new Matrix3(var14 + var10, var15 + var13, var16 - var12, var15 - var13, var10 + var17, var11 + var18, var12 + var16, var18 - var11, var19 + var10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uj.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
          LobbyPlayer.j(49);
          field_Kb = null;
          return;
        }
        field_Kb = null;
    }

    final static int a(byte param0, ConditionalTextValue param1, ConditionalTextValue param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -116) {
            field_Wb = false;
          }
          var4 = (String) null;
          stackIn_3_0 = cn.a((String) null, 0, -127, false, param1, 0, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void updateNames(String param0, String param1, boolean param2) {
        CharSequence var5 = null;
        this.field_Ub = param1;
        if (param2) {
          return;
        }
        try {
          this.field_Fb = param0;
          var5 = (CharSequence) ((Object) this.field_Ub);
          dh.a(var5, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "uj.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_Kb = "This option cannot be combined with the current settings for:  ";
    }
}
