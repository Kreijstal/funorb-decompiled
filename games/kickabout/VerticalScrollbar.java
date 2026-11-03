/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VerticalScrollbar extends UiLayoutNode {
    private UiLayoutNode field_Hb;
    private UiLayoutNode field_Cb;
    private UiLayoutNode field_yb;
    static int field_Ab;
    private UiLayoutNode field_Gb;
    private UiLayoutNode field_Fb;
    static String field_Eb;
    static int field_Ib;
    private int field_Db;
    static int[][] field_zb;
    private UiLayoutNode field_Bb;

    VerticalScrollbar(long param0, UiLayoutNode param1, UiLayoutNode param2, UiLayoutNode param3, UiLayoutNode param4) {
        super(param0, (UiLayoutNode) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        UiLayoutNode var9 = null;
        UiLayoutNode var10 = null;
        try {
          this.field_Bb = new UiLayoutNode(0L, param1);
          this.field_Gb = new UiLayoutNode(0L, param2);
          this.addChild((byte) -107, this.field_Bb);
          this.addChild((byte) -106, this.field_Gb);
          this.field_Cb = new UiLayoutNode(0L, (UiLayoutNode) null);
          this.addChild((byte) -127, this.field_Cb);
          this.field_Fb = new UiLayoutNode(0L, param3);
          this.field_yb = new UiLayoutNode(0L, param3);
          var9 = this.field_Fb;
          var10 = var9;
          this.field_yb.field_ob = true;
          var10.field_ob = true;
          this.field_Cb.addChild((byte) -127, this.field_Fb);
          this.field_Cb.addChild((byte) -112, this.field_yb);
          this.field_Hb = new UiLayoutNode(0L, param4);
          this.field_Hb.field_Y = true;
          this.field_Cb.addChild((byte) -127, this.field_Hb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("na.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        if (param0 <= 103) {
          return 2;
        }
        var5 = 0;
        var6 = this.field_Cb.field_mb - this.field_Hb.field_mb;
        if (var6 > 0) {
          var7 = this.field_Hb.field_J;
          var8 = param2 - param3;
          var5 = (var7 * var8 + var6 / 2) / var6;
        }
        if (param1) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (var5 > param2 - param3) {
            var5 = param2 - param3;
          }
        } else {
          if (var5 > param2 - param3) {
            var5 = -param3 + param2;
          }
          if (var5 < 0) {
            var5 = 0;
          }
        }
        return var5;
    }

    final boolean b(int param0) {
        if (param0 != 23028) {
          this.m(124);
        }
        if (0 != this.field_Fb.field_sb) {
          this.field_Db = 20;
          return true;
        }
        if (0 == this.field_Fb.field_qb) {
          return false;
        }
        if (0 < this.field_Db) {
          this.field_Db = this.field_Db - 1;
        }
        if (0 == this.field_Db &&
          !(ArchiveManager.field_m >= this.field_Hb.field_T + this.field_Hb.field_v)) {
          this.field_Db = 3;
          return true;
        }
        return false;
    }

    final boolean m(int param0) {
        if (this.field_yb.field_sb != 0) {
          this.field_Db = 20;
          return true;
        }
        if (~this.field_yb.field_qb != param0) {
          if (this.field_Db > 0) {
            this.field_Db = this.field_Db - 1;
          }
          if (this.field_Db == 0) {
            if (this.field_Hb.field_T + this.field_Hb.field_v + this.field_Hb.field_mb + this.field_Hb.field_L > ArchiveManager.field_m) {
              return false;
            }
            this.field_Db = 3;
            return true;
          }
        }
        return false;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_q = param3;
        this.field_J = param6;
        this.field_s = param0;
        if (!param1) {
          return;
        }
        this.field_mb = param2;
        this.a(param4, param5, (byte) 64, param7);
    }

    final static void h(int param0) {
        WhirlpoolHasher.field_m = new UiLayoutNode(0L, (UiLayoutNode) null);
        if (ui.field_t) {
          WhirlpoolHasher.field_m.addChild((byte) -127, ConsoleValue.field_a);
        }
        WhirlpoolHasher.field_m.addChild((byte) -114, TickClock.field_d);
        tn.field_d = new rf(ButtonMenuScreen.field_z, WhirlpoolHasher.field_m);
        ss.field_c = new UiLayoutNode((long)param0, (UiLayoutNode) null);
        ss.field_c.addChild((byte) -127, (UiLayoutNode) (tn.field_d.field_b));
        ss.field_c.addChild((byte) -116, MouseWheelInput.field_a);
        CipherPacketBuffer.c(false);
    }

    final boolean j(int param0) {
        if (this.field_Bb.field_sb != 0) {
          this.field_Db = 20;
          return true;
        }
        if (0 != this.field_Bb.field_qb) {
          if (this.field_Db > 0) {
            this.field_Db = this.field_Db - 1;
          }
          if (this.field_Db == 0) {
            this.field_Db = 3;
            return true;
          }
        }
        if (param0 != -819561055) {
          field_Eb = (String) null;
          return false;
        }
        return false;
    }

    public static void a(int param0) {
        field_zb = (int[][]) null;
        int var1 = 42 / ((52 - param0) / 62);
        field_Eb = null;
    }

    final boolean h(byte param0) {
        if (this.field_Gb.field_sb != 0) {
          this.field_Db = 20;
          return true;
        }
        if (0 != this.field_Gb.field_qb) {
          if (this.field_Db > 0) {
            this.field_Db = this.field_Db - 1;
          }
          if (0 == this.field_Db) {
            this.field_Db = 3;
            return true;
          }
        }
        if (param0 != -40) {
          this.field_Gb = (UiLayoutNode) null;
          return false;
        }
        return false;
    }

    VerticalScrollbar(long param0, VerticalScrollbar param1) {
        this(param0, param1.field_Bb, param1.field_Gb, param1.field_Fb, param1.field_Hb);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        UiLayoutNode stackIn_16_0 = null;
        UiLayoutNode stackIn_16_1 = null;
        UiLayoutNode stackIn_16_2 = null;
        boolean stackIn_17_3 = false;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        UiLayoutNode var14;
        UiLayoutNode var15;
        UiLayoutNode var16;
        UiLayoutNode var17;
        UiLayoutNode var18;
        UiLayoutNode var19;
        if (2 * this.field_q > this.field_mb) {
          var6 = this.field_mb / 2;
          var5 = this.field_mb / 2;
        } else {
          var6 = this.field_mb - this.field_q;
          var5 = this.field_q;
        }
        var7 = var6 - var5;
        var8 = var7;
        if (param0 > 0) {
          var8 = param1 * var8 / param0;
          if (this.field_q > var8) {
            var8 = this.field_q;
          }
          if (var8 > var7) {
            var8 = var7;
          }
        }
        var9 = -param1 + param0;
        var10 = -var8 + var7;
        var11 = 0;
        if (var9 > 0) {
          var11 = (param3 * var10 + var9 / 2) / var9;
        }
        var12 = var8 / 2 + var11;
        var14 = this.field_Bb;
        var14.field_mb = var5;
        var14.field_s = 0;
        var14.field_q = this.field_q;
        var14.field_J = 0;
        var15 = this.field_Gb;
        var15.field_J = var6;
        var15.field_mb = -var6 + this.field_mb;
        var15.field_s = 0;
        var15.field_q = this.field_q;
        var16 = this.field_Cb;
        var16.field_q = this.field_q;
        var16.field_mb = var7;
        var16.field_J = var5;
        var16.field_s = 0;
        var17 = this.field_Fb;
        var17.field_mb = var12;
        var17.field_q = this.field_q;
        var17.field_J = 0;
        var17.field_s = 0;
        var18 = this.field_yb;
        var18.field_J = var12;
        var18.field_mb = -var12 + var7;
        var18.field_s = 0;
        if (param2 <= 33) {
          return;
        }
        var18.field_q = this.field_q;
        var19 = this.field_Hb;
        var19.field_s = 0;
        var19.field_J = var11;
        var19.field_mb = var8;
        stackIn_16_0 = this.field_Bb;
        stackIn_16_1 = this.field_Gb;
        stackIn_16_2 = this.field_Cb;
        stackIn_17_3 = (param1 >= param0) ? false : true;
        stackIn_16_2.field_lb = stackIn_17_3;
        stackIn_16_1.field_lb = stackIn_17_3;
        stackIn_16_0.field_lb = stackIn_17_3;
        var19.field_q = this.field_q;
        return;
    }

    final static void k(int param0) {
        int var3 = 0;
        boolean stackIn_11_0 = false;
        dg stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        dg var9 = null;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          var1_int = -GameSoundEffect.field_k + so.field_e;
          GameSoundEffect.field_k = RasterStateSnapshot.field_k - (var1_int >> 1);
          so.field_e = GameSoundEffect.field_k + var1_int;
          SumIntegersCommand.field_I = -(NameSuggestionsPanel.field_G >> 1) + GameResourceLoader.field_e;
          var2 = SumIntegersCommand.field_I;
          for (var3 = param0; j.field_a.length > var3; var3++) {
            var4 = WidgetContainer.field_x[var3];
            if (0 > var4) {
              var5 = du.field_a;
            } else {
              if (re.field_c.selectedIndex == var4) {
                var5 = ParticipantStatus.field_w;
              } else {
                var5 = ValidationHelpWidget.field_U;
              }
            }
            var6 = j.field_a[var3];
            stackIn_11_0 = !(var4 < 0);
            var7 = LoginText.a(stackIn_11_0, var6, -23044);
            var8 = RasterStateSnapshot.field_k - (var7 >> 1);
            if (var4 >= 0) {
              if (re.field_c.selectedIndex != var4) {
                stackIn_15_0 = TeamManagementScreen.field_B;
              } else {
                stackIn_15_0 = oh.field_d;
              }
              var9 = stackIn_15_0;
              var2 = var2 + of.field_a;
              if (var9 != null) {
                var9.a(var8 - TextFieldNode.field_zb, ScrollContainer.field_zb + (IsSixCommand.field_H << 1), var2, (TextFieldNode.field_zb << 1) + var7, 3);
              }
              var2 = var2 + IsSixCommand.field_H;
            }
            if (var4 < 0) {
              UrlRequest.field_i.a(var6, var8, var2 + ClientException.field_f, var5, -1);
              var2 = var2 + AccountMessagePanel.field_H;
            } else {
              UrlRequest.field_a.a(var6, var8, var2 + ag.field_g, var5, -1);
              var2 = var2 + (IsSixCommand.field_H + of.field_a + ScrollContainer.field_zb);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "na.B(" + param0 + ')');
        }
    }

    final boolean l(int param0) {
        if (param0 >= -30) {
          this.field_yb = (UiLayoutNode) null;
        }
        return 0 != this.field_Hb.field_qb ? true : false;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Kickabout.field_G;
        try {
          if (param6 >= param5) {
            return;
          }
          if (param6 + param4 >= param2) {
            return;
          }
          if (5 + param6 < param2 &&
            param3 != param0) {
            var7_int = (1 & (param3 & param0)) + (param0 >> 1) + (param3 >> 1);
            var8 = param6;
            var9 = param0;
            var10 = param3;
            for (var11 = param6; var11 < param2; var11++) {
              var12 = ByteStorage.field_d[var11];
              if (param1) {
                stackIn_24_0 = bl.field_m[var12];
              } else {
                stackIn_24_0 = DialogOverlay.field_a[var12];
              }
              var13 = stackIn_24_0;
              if (var13 <= var7_int) {
                if (var13 > var10) {
                  var10 = var13;
                }
              } else {
                ByteStorage.field_d[var11] = ByteStorage.field_d[var8];
                incrementValue$0 = var8;
                var8++;
                ByteStorage.field_d[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              }
            }
            VerticalScrollbar.a(param0, param1, var8, var9, 1, param5, param6);
            VerticalScrollbar.a(var10, param1, param2, param3, 1, param5, var8);
            return;
          }
          for (var7_intLifetime1 = -1 + param2; var7_intLifetime1 > param6; var7_intLifetime1--) {
            for (var8Lifetime1 = param6; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = ByteStorage.field_d[var8Lifetime1];
              var10Lifetime1 = ByteStorage.field_d[1 + var8Lifetime1];
              if (IntrusiveNode.a((byte) 8, param1, var9Lifetime1, var10Lifetime1)) {
                ByteStorage.field_d[var8Lifetime1] = var10Lifetime1;
                ByteStorage.field_d[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var7), "na.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void i(int param0) {
        LobbyPlayerRow stackIn_91_0 = null;
        boolean stackIn_92_1 = false;
        int stackIn_140_0 = 0;
        LobbyPlayerRow stackIn_147_0 = null;
        boolean stackIn_148_1 = false;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3 = 0L;
        int var3_int = 0;
        LobbyPlayerRow var3_ref_he = null;
        int var4 = 0;
        GameSetupPanel var4_ref_qb = null;
        int var5 = 0;
        String var6 = null;
        GameSetupPanel var6_ref = null;
        LobbyPlayerRow var7 = null;
        LobbyPlayerRow var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LobbyPlayerRow var12 = null;
        GameSetupPanel var13 = null;
        LobbyPlayerRow var15 = null;
        Object var16 = null;
        Object var17 = null;
        GameSetupPanel var17_ref = null;
        LobbyPlayerRow var18 = null;
        LobbyPlayerRow var19 = null;
        String var20 = null;
        String var21 = null;
        LobbyPlayerRow var22 = null;
        Object var23 = null;
        GameSetupPanel var23_ref = null;
        GameSetupPanel var24 = null;
        Object var25 = null;
        LobbyPlayerRow var26 = null;
        String var27 = null;
        String var28 = null;
        LobbyPlayerRow var29 = null;
        GameSetupPanel var30 = null;
        GameSetupPanel var31 = null;
        LobbyPlayerRow var3_ref_heLifetime1;
        long var3Lifetime1;
        long var3Lifetime2;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3_intLifetime4;
        int var3_intLifetime5;
        int var3_intLifetime6;
        long var3Lifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var16 = null;
        var23 = null;
        var17 = null;
        var25 = null;
        var11 = Kickabout.field_G;
        try {
          var1 = un.field_e;
          var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -118);
          if (param0 != 14) {
            field_zb = (int[][]) null;
          }
          if (var2 != 0 &&
            var2 != 1 &&
            2 != var2 &&
            var2 != 3 &&
            4 != var2) {
            if (var2 == 5) {
              var3 = ((PacketBuffer) ((Object) var1)).readLong((byte) -124);
              var27 = ((PacketBuffer) ((Object) var1)).readString(62);
              var6 = ((PacketBuffer) ((Object) var1)).readString(param0 + 64);
              var28 = ((PacketBuffer) ((Object) var1)).readString(-101);
              var29 = PasswordValidator.a(var3, false);
              var8 = var29;
              stackIn_140_0 = (var6.equals("")) ? 0 : 1;
              var9 = stackIn_140_0;
              if (var29 != null) {
                if (var9 != 0) {
                  var29.a((byte) -2, var28, var27);
                }
              } else {
                var8 = new LobbyPlayerRow(var27, var28, var3);
                SquadPickerDialog.field_N.a(var8, (byte) -4, var3);
              }
              var8.field_Ib = nj.monotonicMillis(-93) - (long)((PacketBuffer) ((Object) var1)).readInt(4);
              var8.field_Qb = ((PacketBuffer) ((Object) var1)).a((byte) 81);
              var10 = ((PacketBuffer) ((Object) var1)).l(127);
              var8.field_Db = var10 >> 1;
              stackIn_147_0 = var8;
              stackIn_148_1 = ((1 & var10) != 0);
              stackIn_147_0.field_Cb = stackIn_148_1;
              var8.field_Sb = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -105);
              var8.field_Pb = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -110);
              PacketBuffer.a((byte) 84, var8);
              return;
            }
            if (var2 == 6) {
              var3Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong((byte) -124);
              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -121);
              var26 = PasswordValidator.a(var3Lifetime1, false);
              if (var26 != null) {
                if (var26.field_Fb) {
                  fh.field_b = fh.field_b - 1;
                  var26.field_Fb = false;
                }
                if (var5 != 0) {
                  var26.field_Jb = mg.field_c;
                  var26.field_Mb = var5;
                } else {
                  var26.c((byte) -109);
                }
                var26.unlinkSecondary(param0 ^ -71);
              }
              return;
            }
            if (7 == var2) {
              var15 = (LobbyPlayerRow) (rp.field_B.g(24009));
              while (var15 != null) {
                var15.c((byte) -109);
                var15.unlinkSecondary(-5);
                var15 = (LobbyPlayerRow) (rp.field_B.c(33));
              }
              fh.field_b = 0;
              return;
            }
            if (var2 == 8) {
              var3_int = ((PacketBuffer) ((Object) var1)).a((byte) 81);
              var4_ref_qb = (GameSetupPanel) (SortCriterion.field_f.a(-3611, (long)var3_int));
              if (var4_ref_qb == null) {
                var4_ref_qb = new GameSetupPanel(ss.field_j);
                SortCriterion.field_f.a(var4_ref_qb, (byte) -4, (long)var3_int);
              }
              GameModesHelpScreen.a(true, 116, var1, var4_ref_qb);
              ve.a(var4_ref_qb, (byte) -119);
              return;
            }
            if (var2 == 9) {
              var3_intLifetime4 = ((PacketBuffer) ((Object) var1)).a((byte) 81);
              var4 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -108);
              var31 = (GameSetupPanel) (SortCriterion.field_f.a(-3611, (long)var3_intLifetime4));
              if (var31 != null) {
                if (var4 != 0) {
                  var31.field_Ab = var4;
                  var31.field_Db = mg.field_c;
                } else {
                  var31.c((byte) -109);
                }
                var31.unlinkSecondary(-95);
              }
              return;
            }
            if (10 == var2) {
              var30 = (GameSetupPanel) (SquadSlotWidget.field_yb.g(24009));
              while (var30 != null) {
                var30.c((byte) -109);
                var30.unlinkSecondary(-98);
                var30 = (GameSetupPanel) (SquadSlotWidget.field_yb.c(33));
              }
              return;
            }
            if (11 != var2 &&
              var2 != 12) {
              if (var2 == 13) {
                var3_intLifetime5 = ((PacketBuffer) ((Object) var1)).a((byte) 81);
                var4Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -110);
                var23_ref = (GameSetupPanel) (SortCriterion.field_f.a(-3611, (long)var3_intLifetime5));
                if (var23_ref == null) {
                  return;
                }
                var23_ref.field_Tb = false;
                var13 = var23_ref;
                var6_ref = var13;
                if (var4Lifetime1 != 0) {
                  var23_ref.field_Ab = var4Lifetime1;
                  var23_ref.field_Db = mg.field_c;
                }
                var13.field_hc = false;
                ve.a(var23_ref, (byte) -119);
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3Lifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -124);
                    var20 = ((PacketBuffer) ((Object) var1)).readString(-128);
                    var21 = ((PacketBuffer) ((Object) var1)).readString(-114);
                    var7 = nk.a(31253, var3Lifetime2);
                    if (var7 == null) {
                      var7 = new LobbyPlayerRow(var20, var21, var3Lifetime2);
                      TrinketSlot.field_Eb.a(var7, (byte) -4, var3Lifetime2);
                      PlayerContextMenu.field_i.field_gc = PlayerContextMenu.field_i.field_gc + 1;
                    }
                    var7.field_Qb = ((PacketBuffer) ((Object) var1)).a((byte) 81);
                    var8_int = ((PacketBuffer) ((Object) var1)).l(param0 ^ 120);
                    stackIn_91_0 = var7;
                    stackIn_92_1 = ((1 & var8_int) != 0);
                    stackIn_91_0.field_Cb = stackIn_92_1;
                    var7.field_Db = var8_int >> 1;
                    var7.field_Sb = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -113);
                    var7.field_Pb = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -119);
                    ProxyAuthenticationRequiredException.field_d.a(var7, 3);
                    return;
                  }
                  if (var2 == 19) {
                    var3Lifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -124);
                    var5Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -126);
                    var22 = nk.a(31253, var3Lifetime2);
                    if (var22 == null) {
                      return;
                    }
                    if (var5Lifetime1 != 0) {
                      var22.field_Mb = var5Lifetime1;
                      var22.field_Jb = mg.field_c;
                    } else {
                      var22.c((byte) -109);
                    }
                    var22.unlinkSecondary(-111);
                    PlayerContextMenu.field_i.field_gc = PlayerContextMenu.field_i.field_gc - 1;
                    return;
                  }
                  if (var2 == 20) {
                    GameModesHelpScreen.a(false, param0 ^ 116, var1, PlayerContextMenu.field_i);
                    return;
                  }
                  if (21 == var2) {
                    var3_intLifetime5 = ((PacketBuffer) ((Object) var1)).a((byte) 81);
                    if (var3_intLifetime5 == 0) {
                      TextFieldNode.field_Ib = 0L;
                      return;
                    }
                    TextFieldNode.field_Ib = (long)var3_intLifetime5 + nj.monotonicMillis(36);
                    return;
                  }
                  if (var2 == 22) {
                    mi.field_d = ((PacketBuffer) ((Object) var1)).a((byte) 81);
                    MusicPatchNode.field_o = ((PacketBuffer) ((Object) var1)).l(121);
                    return;
                  }
                  if (23 == var2) {
                    AnimationPlayer.field_c = ((PacketBuffer) ((Object) var1)).readLong((byte) -124);
                    return;
                  }
                  UnreadMessagesScreen.a("L1: " + tr.b(0), (Throwable) null, param0 ^ 15);
                  FormationView.b((byte) -116);
                  return;
                }
                var3Lifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -124);
                var5Lifetime1Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -123);
                var12 = PasswordValidator.a(var3Lifetime2, false);
                var19 = var12;
                if (var12 != null) {
                  if (var5Lifetime1Lifetime1 != 0) {
                    var12.field_Mb = var5Lifetime1Lifetime1;
                    var12.field_Jb = mg.field_c;
                  }
                  if (var2 != 15) {
                    if (var19.field_Fb) {
                      var19.field_Fb = false;
                      fh.field_b = fh.field_b - 1;
                    }
                  } else {
                    var12.field_Gb = false;
                  }
                  PacketBuffer.a((byte) 56, var19);
                }
                return;
              }
              var3Lifetime2Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong((byte) -124);
              var18 = PasswordValidator.a(var3Lifetime2Lifetime1, false);
              if (var18 != null) {
                if (14 != var2) {
                  if (!var18.field_Fb) {
                    var18.field_Fb = true;
                    fh.field_b = fh.field_b + 1;
                  }
                } else {
                  var18.field_Gb = true;
                }
                PacketBuffer.a((byte) 72, var18);
              }
              return;
            }
            var3_intLifetime6 = ((PacketBuffer) ((Object) var1)).a((byte) 81);
            var17_ref = (GameSetupPanel) (SortCriterion.field_f.a(-3611, (long)var3_intLifetime6));
            var24 = var17_ref;
            if (var24 == null) {
              return;
            }
            if (var2 == 11) {
              var24.field_hc = true;
            } else {
              var24.field_Tb = true;
            }
            ve.a(var24, (byte) -119);
            return;
          }
          var3_ref_he = (LobbyPlayerRow) (ProxyAuthenticationRequiredException.field_d.g(24009));
          while (var3_ref_he != null) {
            var3_ref_he.c((byte) -109);
            var3_ref_he.unlinkSecondary(9);
            var3_ref_he = (LobbyPlayerRow) (ProxyAuthenticationRequiredException.field_d.c(33));
          }
          var3_ref_heLifetime1 = (LobbyPlayerRow) (SquadPickerDialog.field_N.b((byte) 72));
          while (var3_ref_heLifetime1 != null) {
            if (var3_ref_heLifetime1.field_Gb ||
              var3_ref_heLifetime1.field_Fb) {
              if (var3_ref_heLifetime1.field_Fb) {
                fh.field_b = fh.field_b - 1;
                var3_ref_heLifetime1.field_Fb = false;
              }
              var3_ref_heLifetime1.field_Gb = false;
              PacketBuffer.a((byte) 81, var3_ref_heLifetime1);
            }
            var3_ref_heLifetime1 = (LobbyPlayerRow) (SquadPickerDialog.field_N.a(param0 - 14));
          }
          if (var2 == 1 &&
            null != PlayerContextMenu.field_i) {
            h.field_f = PlayerContextMenu.field_i.field_ec;
          }
          if (var2 != 4) {
            PlayerContextMenu.field_i = null;
          } else {
            var3_intLifetime1 = ((PacketBuffer) ((Object) var1)).a((byte) 81);
            PlayerContextMenu.field_i = new GameSetupPanel(ss.field_j);
            PlayerContextMenu.field_i.a((long)var3_intLifetime1, (byte) -113);
            GameModesHelpScreen.a(false, 114, var1, PlayerContextMenu.field_i);
            TextFieldNode.field_Ib = 0L;
          }
          if (var2 != 2 &&
            var2 != 3) {
            ArchiveSource.field_b = null;
          } else {
            if (null == ArchiveSource.field_b) {
              ArchiveSource.field_b = new GameSetupPanel(ss.field_j);
            }
          }
          if (var2 != 3) {
            InstrumentNoteMask.field_k = false;
            return;
          }
          InstrumentNoteMask.field_k = true;
          for (var3_intLifetime2 = 0; er.field_h.length > var3_intLifetime2; var3_intLifetime2++) {
            er.field_h[var3_intLifetime2] = ((PacketBuffer) ((Object) var1)).readByte((byte) -82);
          }
          ConsoleExpression.field_l = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -110);
          MidiPcmStream.field_C = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -105);
          for (var3_intLifetime3 = 0; rf.field_d.length > var3_intLifetime3; var3_intLifetime3++) {
            rf.field_d[var3_intLifetime3] = ((PacketBuffer) ((Object) var1)).readByte((byte) -81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1_ref), "na.E(" + param0 + ')');
        }
    }

    static {
        field_Eb = "Player is not involved in an auction.";
        field_Ab = 480;
        field_zb = new int[][]{new int[]{0, 31, 34, 34, 91, 93, 93, 99, 99, 99, 100}, new int[]{0, 19, 19, 19, 90, 90, 90, 95, 95, 99, 100}, new int[]{0, 10, 10, 10, 70, 73, 76, 79, 98, 99, 100}, new int[]{0, 7, 8, 29, 66, 69, 74, 76, 99, 99, 100}};
    }
}
