/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends DefaultTextWidgetRenderer {
    static int[] field_r;
    private kg field_t;
    private kg[] field_q;
    static String[] field_s;

    private final void a(boolean param0, int param1, qi param2) {
        int var4_int = 0;
        kg dupTemp$0 = null;
        kg stackIn_9_0 = null;
        kg stackIn_10_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        kg var5 = null;
        kg var6 = null;
        int var7 = 0;
        RgbSprite[] var8 = null;
        var7 = Bounce.field_N;
        try {
          super.a(param2, (byte) -122);
          if (param1 != -19463) {
            var8 = (RgbSprite[]) null;
            this.a(10, 115, (RgbSprite[]) null);
          }
          if (param0) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_q[var4_int];
              if (var5 == null) {
                param2.field_q[var4_int] = null;
              } else {
                var6 = param2.field_q[var4_int];
                stackIn_9_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new kg();
                  param2.field_q[var4_int] = dupTemp$0;
                  stackIn_10_1 = dupTemp$0;
                } else {
                  stackIn_10_1 = var6;
                }
                ((kg) (Object) stackIn_9_0).a(stackIn_10_1, (byte) 55);
              }
            }
            return;
          }
          cb.a(this.field_q, 0, param2.field_q, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("qi.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        field_s = null;
        if (param0 != 0) {
          qi.clearStaticReferences(66);
        }
        field_r = null;
    }

    public qi() {
        this.field_q = new kg[6];
        this.field_t = new kg();
        kg dupTemp$0 = new kg();
        this.field_q[0] = dupTemp$0;
        kg var1 = dupTemp$0;
        var1.a(-29776);
    }

    final void a(int param0, int param1, RgbSprite[] param2) {
        int var4_int = param1;
        if (this.field_q[var4_int] == null) {
          this.field_q[var4_int] = new kg();
        }
        if (param0 != -25026) {
          return;
        }
        try {
          this.field_q[param1].field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "qi.IA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paintWidget(int param0, UiWidget param1, byte param2, boolean param3, int param4) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        kg var7 = null;
        int var8 = 0;
        kg var9 = null;
        InteractiveWidget var10 = null;
        kg var11 = null;
        kg var12 = null;
        kg var13 = null;
        kg var14 = null;
        try {
          if (param1 instanceof InteractiveWidget) {
            stackIn_3_0 = (UiWidget) (param1);
          } else {
            stackIn_3_0 = null;
          }
          var10 = (InteractiveWidget) (stackIn_3_0);
          IntrusiveNode.a(param1.field_k + (param1.field_r + param4), param1.field_m + (param0 + param1.field_i), param0 + param1.field_i, param1.field_r + param4, -19852);
          if (var10 != null) {
            param3 = param3 & var10.field_y;
          }
          var7 = this.field_q[0];
          this.field_t.a(-29776);
          var7.a(this.field_t, param4, param0, this, false, param1);
          if (var10 != null) {
            if (var10.field_z) {
              var11 = this.field_q[1];
              if (var11 != null) {
                var11.a(this.field_t, param4, param0, this, false, param1);
              }
            }
            if (var10.field_g) {
              var12 = this.field_q[3];
              if (var10.field_u != 0 &&
                var12 != null) {
                var12.a(this.field_t, param4, param0, this, false, param1);
              } else {
                var9 = this.field_q[2];
                if (var9 != null) {
                  var9.a(this.field_t, param4, param0, this, false, param1);
                }
              }
            }
          }
          if (param1.isFocused(1)) {
            var13 = this.field_q[5];
            if (var13 != null) {
              var13.a(this.field_t, param4, param0, this, false, param1);
            }
          }
          if (!param3) {
            var14 = this.field_q[4];
            if (var14 != null) {
              var14.a(this.field_t, param4, param0, this, false, param1);
            }
          }
          this.field_t.a(param0, this, param1, param4, -103);
          ve.a(-128);
          var8 = 80 % ((param2 + 60) / 56);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("qi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    qi(qi param0, boolean param1) {
        this();
        try {
          param0.a(param1, -19463, this);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final kg b(int param0, int param1) {
        if (param0 != -1) {
          ResourceArchive var4 = (ResourceArchive) null;
          qi.a((ResourceArchive) null, (ResourceArchive) null, (byte) -12, (ResourceArchive) null);
        }
        kg dupTemp$0 = new kg();
        this.field_q[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        java.awt.Canvas var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param0.getGraphics();
            if (param3 != -25971) {
              var5 = (java.awt.Canvas) null;
              qi.a((java.awt.Canvas) null, 12, -85, -86);
            }
            ca.field_d.drawImage(param2, param1, var4, -104);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("qi.KA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(ResourceArchive param0, ResourceArchive param1, byte param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -52 / ((-79 - param2) / 39);
          if (!param3.ensureIndexLoaded(-108)) {
            return false;
          }
          if (!param3.tryLoadGroupByName("commonui", false)) {
            return false;
          }
          if (param1.ensureIndexLoaded(-90) &&
            param1.tryLoadGroupByName("commonui", false)) {
            if (param0.ensureIndexLoaded(44) &&
              param0.tryLoadGroupByName("button.gif", false)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("qi.JA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final void a(int param0, RgbSprite[] param1) {
        int var4 = 0;
        kg[] var3 = null;
        kg var5 = null;
        int var6 = 0;
        UiWidget var7 = null;
        kg[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Bounce.field_N;
        try {
          var8 = this.field_q;
          var3 = var8;
          if (param0 != 7) {
            var7 = (UiWidget) null;
            this.paintWidget(-84, (UiWidget) null, (byte) 115, true, 56);
          }
          for (var4 = 0; var8.length > var4; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_n = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("qi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 10) {
            var3 = (java.awt.Canvas) null;
            qi.a((java.awt.Canvas) null, -82, -45, 126);
          }
          stackIn_3_0 = BufferedSocket.a(8272, true, param0, 10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qi.LA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, RgbSprite param1) {
        int var4 = 0;
        kg[] var3 = null;
        kg var5 = null;
        int var6 = 0;
        kg[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Bounce.field_N;
        try {
          var7 = this.field_q;
          var3 = var7;
          if (!param0) {
            this.field_q = (kg[]) null;
          }
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_o = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("qi.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PacketBuffer var16 = null;
        PacketBuffer var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = Bounce.field_N;
        try {
          var16 = new PacketBuffer(param0);
          var17 = var16;
          var17.position = param0.length - 2;
          EmailFormatValidator.field_p = var17.readUnsignedShort(-1640531527);
          lg.field_c = new boolean[EmailFormatValidator.field_p];
          if (param1 != 11906) {
            field_r = (int[]) null;
          }
          ConfirmedEmailAvailabilityValidator.field_n = new int[EmailFormatValidator.field_p];
          ResourceArchive.field_g = new byte[EmailFormatValidator.field_p][];
          ae.field_c = new int[EmailFormatValidator.field_p];
          ph.field_c = new byte[EmailFormatValidator.field_p][];
          qh.field_i = new int[EmailFormatValidator.field_p];
          ih.field_V = new int[EmailFormatValidator.field_p];
          var17.position = param0.length + (-7 - 8 * EmailFormatValidator.field_p);
          DropTargetWidgetContainer.field_C = var17.readUnsignedShort(-1640531527);
          fk.field_e = var17.readUnsignedShort(param1 - 1640543433);
          var3 = 1 + (var17.readUnsignedByte((byte) -105) & 255);
          for (var4 = 0; EmailFormatValidator.field_p > var4; var4++) {
            ConfirmedEmailAvailabilityValidator.field_n[var4] = var16.readUnsignedShort(-1640531527);
          }
          for (var4Lifetime1 = 0; EmailFormatValidator.field_p > var4Lifetime1; var4Lifetime1++) {
            ae.field_c[var4Lifetime1] = var17.readUnsignedShort(-1640531527);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < EmailFormatValidator.field_p; var4Lifetime2++) {
            ih.field_V[var4Lifetime2] = var17.readUnsignedShort(-1640531527);
          }
          for (var4Lifetime3 = 0; EmailFormatValidator.field_p > var4Lifetime3; var4Lifetime3++) {
            qh.field_i[var4Lifetime3] = var17.readUnsignedShort(param1 - 1640543433);
          }
          var17.position = -(EmailFormatValidator.field_p * 8) + (param0.length - (7 + (-1 + var3) * 3));
          he.field_k = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            he.field_k[var4Lifetime4] = var17.readUnsignedMedium((byte) -83);
            if (0 == he.field_k[var4Lifetime4]) {
              he.field_k[var4Lifetime4] = 1;
            }
          }
          var17.position = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < EmailFormatValidator.field_p; var4Lifetime5++) {
            var5 = ih.field_V[var4Lifetime5];
            var6 = qh.field_i[var4Lifetime5];
            var7 = var5 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            ph.field_c[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            ResourceArchive.field_g[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.readUnsignedByte((byte) -118);
            if ((1 & var11) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.readByte(Slime.xorIntegers(param1, -12011));
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var17.readByte(99);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_33_0 = var10;
                  if (-1 == var13) {
                    stackIn_34_1 = 0;
                  } else {
                    stackIn_34_1 = 1;
                  }
                  var10 = stackIn_33_0 | stackIn_34_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var13 * var5 + var12] = var17.readByte(-53);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.readByte(-81);
                    var9[var12 + var13 * var5] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (-1 == var14) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            lg.field_c[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("qi.GA(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_s = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
