/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleTokenCursor {
    static int[] field_e;
    static String field_f;
    static int field_b;
    private ConsoleExpression[] field_g;
    int field_a;
    static String[] field_h;
    static BinaryBitmapFont field_d;
    static String field_c;

    final static void a(UiLayoutNode param0, int param1, int param2, int param3, UiLayoutNode param4, byte[] param5, UiLayoutNode param6, int param7, int param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          PasswordFieldPainter.field_x = param5;
          AnimationPlayer.field_c = -1L;
          PlayerStatSortCriterion.field_p = param8;
          UiKeyRoutingSupport.field_j = param5.length;
          InstrumentNoteMask.field_k = false;
          TextHotspotRegion.field_h = new byte[(7 + PlayerStatSortCriterion.field_p) / 8];
          PlayerContextMenu.field_i = null;
          ArchiveSource.field_b = null;
          var10_int = 0;
          for (var11 = 0; var11 < PasswordFieldPainter.field_x.length; var11++) {
            var10_int = var10_int + (PasswordFieldPainter.field_x[var11] & 255);
          }
          var10_int = (7 + var10_int) / 8;
          SocialTabsPanel.field_d = new byte[var10_int];
          if (null == param0.field_jb) {
            param0.field_jb = new IntrusiveDeque();
          }
          PasswordFieldPainter.field_B = param0.field_jb;
          PasswordFieldPainter.field_B.clear(22997);
          SquadPickerDialog.field_N = new DualLinkHashTable(param2);
          DelayedServerPacket.field_h = 0;
          ConsoleArgumentSupport.field_d = -1;
          MusicPatchNode.field_o = -1;
          SharedSpriteTables.field_b = 0;
          if (param6.field_jb == null) {
            param6.field_jb = new IntrusiveDeque();
          }
          SquadSlotWidget.field_yb = param6.field_jb;
          SquadSlotWidget.field_yb.clear(22997);
          SortCriterion.field_f = new DualLinkHashTable(param9);
          if (param4.field_jb == null) {
            param4.field_jb = new IntrusiveDeque();
          }
          ProxyAuthenticationRequiredException.field_d = param4.field_jb;
          ProxyAuthenticationRequiredException.field_d.clear(22997);
          TrinketSlot.field_Eb = new DualLinkHashTable(param3);
          PlayerInputFactory.field_c = param7;
          TextFieldNode.field_Ib = 0L;
          if (param1 <= 114) {
            ConsoleTokenCursor.a(123, 125, 58, -75, 34, -38, 61, 107, -70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_18_0 = var10;
          stackIn_18_1 = new StringBuilder().append("q.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param6 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final ConsoleExpression readToken(byte param0) {
        if (param0 <= 55) {
          return (ConsoleExpression) null;
        }
        int fieldTemp$0 = this.field_a;
        this.field_a = this.field_a + 1;
        return this.field_g[fieldTemp$0];
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_h = null;
        field_c = null;
        field_f = null;
        int var1 = 73 / ((-20 - param0) / 63);
        field_d = null;
    }

    final boolean isAtEnd(int param0) {
        if (param0 != 6) {
          field_e = (int[]) null;
        }
        return this.field_a >= this.field_g.length ? true : false;
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        Sprite[] var10;
        Sprite[] var11_ref_ut__;
        int var11;
        int var12;
        Sprite var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = Kickabout.field_G;
        var9 = param1 + (param3 + param0);
        var10 = new Sprite[]{new Sprite(var9, var9), new Sprite(param4, var9), new Sprite(var9, var9), new Sprite(var9, param4), new Sprite(64, 64), new Sprite(var9, param4), new Sprite(var9, var9), new Sprite(param4, var9), new Sprite(var9, var9)};
        var11_ref_ut__ = var10;
        for (var12 = 0; var12 < var11_ref_ut__.length; var12++) {
          var13 = var11_ref_ut__[var12];
          for (var14 = 0; var14 < var13.field_y.length; var14++) {
            var13.field_y[var14] = param6;
          }
        }
        for (var11 = 0; param0 > var11; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10[6].field_y[(-1 - var11 + var9) * var9 + var12Lifetime1] = param2;
            var10[8].field_y[var12Lifetime1 + var9 * (-var11 + (var9 - 1))] = param2;
            var10[2].field_y[var12Lifetime1 * var9 + (-1 + (var9 - var11))] = param2;
            var10[8].field_y[-var11 + var9 - (1 - var12Lifetime1 * var9)] = param2;
          }
        }
        for (var11Lifetime1 = 0; param0 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_y[var12Lifetime2 + var11Lifetime1 * var9] = param8;
            var10[0].field_y[var9 * var12Lifetime2 + var11Lifetime1] = param8;
            if (var9 - var11Lifetime1 > var12Lifetime2) {
              var10[2].field_y[var11Lifetime1 * var9 + var12Lifetime2] = param8;
              var10[6].field_y[var9 * var12Lifetime2 + var11Lifetime1] = param8;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param4; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param0; var12Lifetime3++) {
            var10[7].field_y[param4 * (-var12Lifetime3 + (var9 - 1)) + var11Lifetime2] = param2;
            var10[5].field_y[-var12Lifetime3 - (-var9 + 1 - var9 * var11Lifetime2)] = param2;
            var10[1].field_y[var12Lifetime3 * param4 + var11Lifetime2] = param8;
            var10[3].field_y[var11Lifetime2 * var9 + var12Lifetime3] = param8;
          }
        }
        if (param5 != -1481) {
          return (Sprite[]) null;
        }
        for (var11Lifetime3 = 0; param4 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param1; var12Lifetime4++) {
            var10[1].field_y[(var9 - var12Lifetime4 - 1) * param4 + var11Lifetime3] = param7;
            var10[3].field_y[var9 - 1 + (-var12Lifetime4 + var9 * var11Lifetime3)] = param7;
            var10[7].field_y[var12Lifetime4 * param4 + var11Lifetime3] = param7;
            var10[5].field_y[var9 * var11Lifetime3 + var12Lifetime4] = param7;
          }
        }
        return var10;
    }

    ConsoleTokenCursor(IntrusiveDeque param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        ConsoleExpression var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_a = 0;
        try {
          this.field_g = new ConsoleExpression[param0.size(false)];
          var2_int = 0;
          var3 = (ConsoleExpression) (param0.first(24009));
          while (var3 != null) {
            var3.unlink((byte) -109);
            incrementValue$2 = var2_int;
            var2_int++;
            this.field_g[incrementValue$2] = var3;
            var3 = (ConsoleExpression) (param0.next(33));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("q.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_e = new int[7];
        field_h = new String[]{"Amateur", "Pebble Playoffs", "Cobalt Conference", "Sandstone Series", "Quartz Qualifiers", "Crystal Circuit", "Diamond Division"};
        field_f = "Stats";
        field_e[5] = 11;
        field_e[2] = 8;
        field_e[4] = 10;
        field_e[6] = 19;
        field_e[1] = 7;
        field_e[0] = 6;
        field_e[3] = 9;
        field_c = "Username: ";
    }
}
