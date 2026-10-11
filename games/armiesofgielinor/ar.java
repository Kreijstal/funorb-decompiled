/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar extends ms {
    static int field_w;
    static String field_v;
    int[] field_A;
    private int[][] field_u;
    static RgbSprite field_D;
    static String field_y;
    private String[] field_z;
    static int field_C;
    private int[] field_B;
    static String field_x;

    final static void a(int param0, um param1) {
        try {
          ku.a((byte) -93, true, param1);
          if (param0 != 2) {
            ar.a(87, 100, -49);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ar.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_A != null) {
          for (var2 = 0; this.field_A.length > var2; var2++) {
            this.field_A[var2] = oe.c(this.field_A[var2], 32768);
          }
        }
        if (!param0) {
          PacketBuffer var4 = (PacketBuffer) null;
          this.a((byte) -5, 7, (PacketBuffer) null);
        }
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param2 != -115) {
          ar.e((byte) -15);
        }
        if (param1) {
          var4++;
        }
        return cp.field_b[var4];
    }

    final static CampaignMission a(int param0, int param1, int param2) {
        cf var4 = br.a(param0, (byte) -14);
        cf var3 = var4;
        if (var3 == null) {
          return null;
        }
        if (param1 < param2) {
          return null;
        }
        if (param1 >= var3.field_n.length) {
          return null;
        }
        return var4.field_n[param1];
    }

    final static void a(RgbSprite[][] param0, int[] param1, byte param2, byte[] param3, int param4, kl param5, kl param6, byte[] param7, String[] param8, int[] param9, boolean param10, int param11, String[][] param12, ru[] param13, kl param14, String[][] param15, RgbSprite[][] param16) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          var18 = (String[]) null;
          tv.a(param13, param7, param0, param1, param14, param16, 1, param5, param4, false, param15, param12, param11, param8, param3, (String[]) null, param10, param6, param9);
          var17_int = -18 / ((param2 + 15) / 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_4_0 = var17;
          stackIn_4_1 = new StringBuilder().append("ar.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param6 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param7 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param8 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param9 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param13 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param14 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param15 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param16 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final void a(PacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 91) {
            return;
          }
          while (true) {
            var3_int = param0.readUnsignedByte(0);
            if (var3_int == 0) {
              return;
            }
            this.a((byte) -96, var3_int, param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ar.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final String d(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_z == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_z[0]);
        for (var3 = 1; this.field_z.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_z[var3]);
        }
        if (param0 != 97) {
          field_D = (RgbSprite) null;
        }
        return var2.toString();
    }

    public static void e(byte param0) {
        if (param0 != -74) {
          field_C = 84;
        }
        field_v = null;
        field_x = null;
        field_y = null;
        field_D = null;
    }

    ar() {
    }

    private final void a(byte param0, int param1, PacketBuffer param2) {
        int[] array$0 = null;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        me var8 = null;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = -110 % ((13 - param0) / 56);
          if (param1 != 1) {
            if (param1 == 2) {
              var5 = param2.readUnsignedByte(0);
              this.field_A = new int[var5];
              for (var6 = 0; var5 > var6; var6++) {
                this.field_A[var6] = param2.readUnsignedShort((byte) -104);
              }
            } else if (param1 == 3) {
              var5 = param2.readUnsignedByte(0);
              this.field_B = new int[var5];
              this.field_u = new int[var5][];
              for (var6 = 0; var5 > var6; var6++) {
                var7 = param2.readUnsignedShort((byte) -104);
                var8 = UnitInfoPopup.b(0, var7);
                if (var8 != null) {
                  this.field_B[var6] = var7;
                  array$0 = new int[var8.field_f];
                  this.field_u[var6] = array$0;
                  for (var9 = 0; var9 < var8.field_f; var9++) {
                    this.field_u[var6][var9] = param2.readUnsignedShort((byte) -104);
                  }
                }
              }
            } else {
              if (param1 == 4) {
                return;
              }
            }
          } else {
            this.field_z = dj.a(61, '<', param2.g(1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ar.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_y = "Coat of Arms";
        field_v = "On";
        field_x = "This panel shows the equipment you have purchased. To look through all equipment, click on the 'Store' tab. Selecting equipment for hotseat games and tutorials costs nothing, but equipment must be purchased to use in online multiplayer games.";
    }
}
