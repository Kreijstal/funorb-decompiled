/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SquadGridWidget extends UiLayoutNode {
    static String field_Ab;
    int field_Fb;
    private int field_zb;
    private ClubState field_Hb;
    static int field_Gb;
    private ManagerAction field_Bb;
    static volatile boolean field_Ib;
    static Sprite field_Cb;
    static String field_Db;
    static String field_yb;
    SquadSlotWidget[] field_Eb;

    final static void a(Sprite[] param0, boolean param1) {
        int var2_int = 0;
        int var3 = Kickabout.field_G;
        try {
          gk.field_a = param0;
          SaveChangesDialog.field_F = new Sprite[2];
          for (var2_int = 0; 2 > var2_int; var2_int++) {
            SaveChangesDialog.field_F[var2_int] = gk.field_a[var2_int].copy();
            nh.a(SaveChangesDialog.field_F[var2_int], 0.0, 0.0, 1.0);
          }
          if (!param1) {
            field_Ib = true;
          }
          vb.field_l = gk.field_a[2];
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "mf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        SquadSlotWidget stackIn_77_0 = null;
        boolean stackIn_78_1 = false;
        int stackIn_84_0 = 0;
        SquadSlotWidget stackIn_87_0 = null;
        boolean stackIn_88_1 = false;
        SquadSlotWidget stackIn_91_0 = null;
        boolean stackIn_92_1 = false;
        int var2;
        int var3;
        SquadSlotWidget var3_ref_kq;
        SquadSlotWidget var4;
        int var4_int;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var2Lifetime1;
        int var3Lifetime1;
        int var5Lifetime1;
        var10 = Kickabout.field_G;
        if (this.field_zb > 0) {
          this.field_zb = this.field_zb - 1;
        }
        if (param0 != 48) {
          this.a(-10);
        }
        for (var2 = 0; var2 < 9; var2++) {
          var3_ref_kq = this.field_Eb[var2];
          var4_int = this.field_Hb.field_q[var2];
          var3_ref_kq.a(this.field_Hb.field_R, this.field_Hb.field_w, (byte) 127, this.field_Hb.field_k, this.field_Hb.squad[var4_int]);
          var3_ref_kq.a((byte) 25, this.field_Hb, var4_int);
          if (!var3_ref_kq.field_Eb.isEmpty(-2) &&
            var3_ref_kq.field_qb != 0) {
            var3_ref_kq.field_s = -var3_ref_kq.field_bb + (-this.field_F + wt.field_x);
            var3_ref_kq.field_J = -var3_ref_kq.field_M - this.field_T + us.field_j;
            var5 = 10 + (this.field_q - var3_ref_kq.field_q);
            var6 = 10 - var3_ref_kq.field_mb + this.field_mb;
            if (var5 < var3_ref_kq.field_s) {
              var3_ref_kq.field_s = var5;
            }
            if (var3_ref_kq.field_s < -10) {
              var3_ref_kq.field_s = -10;
            }
            if (-10 > var3_ref_kq.field_J) {
              var3_ref_kq.field_J = -10;
            }
            if (var6 < var3_ref_kq.field_J) {
              var3_ref_kq.field_J = var6;
            }
            var3_ref_kq.field_F = this.field_F + var3_ref_kq.field_s;
            var3_ref_kq.field_T = var3_ref_kq.field_J + this.field_T;
            var7 = (var3_ref_kq.field_bb + var3_ref_kq.field_s) / 52;
            var8 = (var3_ref_kq.field_M + var3_ref_kq.field_J) / 75;
            if (var7 >= 0 &&
              var8 >= 0 &&
              var7 < 3 &&
              var8 < 3) {
              var9 = var7 + var8 * 3;
              if (var3_ref_kq != this.field_Eb[var9]) {
                if (!(AuctionLogEntry.field_h instanceof TeamManagementScreen)) {
                  this.field_Bb = this.field_Hb.createOrderSwapAction(var9, -123, var2);
                  this.field_Hb.applyAction(this.field_Bb, AuctionLogEntry.e(15137), 0);
                } else {
                  di.a(var2, true, var9);
                }
                this.field_Eb[var2] = this.field_Eb[var9];
                this.field_Eb[var9] = var3_ref_kq;
                if (this.field_zb == 0) {
                  ShopPlayerSlot.c(54, -108);
                  this.field_zb = 5;
                }
              }
            }
          } else {
            var5 = this.a((byte) -53, var2);
            var6 = this.b(var2, -96);
            if (var3_ref_kq.field_s != var5) {
              var7 = -var3_ref_kq.field_s + (3 * var3_ref_kq.field_s + var5 >> 2);
              if (var7 == 0) {
                stackIn_48_0 = (var3_ref_kq.field_s >= var5) ? -1 : 1;
                var7 = stackIn_48_0;
              }
              var3_ref_kq.field_s = var3_ref_kq.field_s + var7;
            }
            if (var6 != var3_ref_kq.field_J) {
              var7 = -var3_ref_kq.field_J + (3 * var3_ref_kq.field_J + var6 >> 2);
              if (var7 == 0) {
                stackIn_57_0 = (var3_ref_kq.field_J >= var6) ? -1 : 1;
                var7 = stackIn_57_0;
              }
              var3_ref_kq.field_J = var3_ref_kq.field_J + var7;
            }
          }
        }
        var2Lifetime1 = -1;
        for (var3 = 0; 9 > var3; var3++) {
          if (this.field_Eb[var3].field_sb != 0 &&
            !this.field_Eb[var3].field_Eb.isEmpty(-2)) {
            kj.a((byte) -123);
          }
          if (this.field_Eb[var3].field_qb != 0) {
            var2Lifetime1 = var3;
          }
        }
        if (-1 == var2Lifetime1) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 9; var3Lifetime1++) {
            var4 = this.field_Eb[var3Lifetime1];
            stackIn_84_0 = (!var4.field_Eb.isEmpty(param0 ^ -50)) ? 0 : 1;
            var5Lifetime1 = stackIn_84_0;
            stackIn_87_0 = var4;
            stackIn_88_1 = (var5Lifetime1 == 0) && (var4.field_Q);
            stackIn_87_0.field_zb = stackIn_88_1;
            stackIn_91_0 = var4;
            stackIn_92_1 = (var5Lifetime1 == 0) && (this.field_Fb == var3Lifetime1);
            stackIn_91_0.field_Kb = stackIn_92_1;
          }
        } else if (!this.field_Eb[var2Lifetime1].field_Eb.isEmpty(-2)) {
          this.field_Fb = var2Lifetime1;
          for (var3Lifetime1 = 0; 9 > var3Lifetime1; var3Lifetime1++) {
            this.field_Eb[var3Lifetime1].field_Kb = false;
            stackIn_77_0 = this.field_Eb[var3Lifetime1];
            stackIn_78_1 = (var2Lifetime1 == var3Lifetime1);
            stackIn_77_0.field_zb = stackIn_78_1;
          }
        } else {
          this.field_Fb = -1;
        }
    }

    final static void a(byte param0, CipherPacketBuffer param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ListingRow[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        ListingRow var14 = null;
        ListingRow var15 = null;
        int var8Lifetime1;
        var12 = Kickabout.field_G;
        try {
          var3_int = un.field_e.readUnsignedMedium(-107);
          var4 = un.field_e.readUnsignedByte((byte) -121);
          var5 = un.field_e.readUnsignedByte((byte) -118);
          stackIn_4_0 = (AnimationSkeleton.field_k == var5) ? 0 : 1;
          var6 = stackIn_4_0;
          var7 = new ListingRow[var4];
          for (var8 = 0; var4 > var8; var8++) {
            var7[var8] = BroadcastServerCommand.a(un.field_e, param0 + 18758);
          }
          LineupView.field_y.addAll(param0 ^ -107, var7, nj.monotonicMillis(param0 + 186));
          if (!param2 &&
            var6 != 0) {
            ChatLine.field_f = false;
            return;
          }
          AnimationSkeleton.field_k = var5;
          TrinketSlot.field_Db[AnimationSkeleton.field_k] = var3_int;
          AuctionTableWidget.field_Hb.field_Db.a(true, 317, AuctionTableWidget.field_Hb.field_Db.field_s, AuctionTableWidget.field_Hb.field_Db.field_J, var3_int * 18 + 6);
          if (var6 != 0) {
            stackIn_14_0 = 0;
          } else {
            stackIn_14_0 = AuctionTableWidget.field_Hb.field_Db.field_J;
          }
          var8Lifetime1 = stackIn_14_0;
          if (param0 != -105) {
            return;
          }
          AuctionTableWidget.field_Hb.a(15, 20, 2, (byte) -114, 230, 344, 170);
          AuctionTableWidget.field_Hb.field_Db.field_J = var8Lifetime1;
          if (param2) {
            var9 = -1;
            var10 = 0;
            while (true) {
              if (var10 < var7.length) {
                var14 = var7[var10];
                if (var14.field_a &&
                  !SumIntegersCommand.a((byte) 121, var14.field_f)) {
                  var9 = var14.rowId;
                } else {
                  var10++;
                  continue;
                }
              }
              if (-1 == var9) {
                FadingSoundPlayer.field_w = 150;
                var13 = 0;
                var10 = var13;
                while (var7.length > var13) {
                  var15 = var7[var13];
                  if (SumIntegersCommand.a((byte) 45, var15.field_f)) {
                    var9 = var15.rowId;
                    break;
                  }
                  var13++;
                }
              }
              if (var9 == -1) {
                break;
              }
              if (var9 <= 4) {
                AuctionTableWidget.field_Hb.field_Db.field_J = 0;
              } else {
                if (var3_int - 5 < var9) {
                  AuctionTableWidget.field_Hb.field_Db.field_J = -(18 * (var3_int - 10));
                } else {
                  AuctionTableWidget.field_Hb.field_Db.field_J = -(18 * (var9 - 4));
                }
              }
              field_Gb = ReceivedAuctionItem.a(18, -(AuctionTableWidget.field_Hb.field_Db.field_J + 5), (byte) -72);
              break;
            }
          }
          SectorCacheStore.a(94);
          ChatLine.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("mf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(byte param0, int param1) {
        if (param0 != -53) {
          return 81;
        }
        return 52 * (param1 % 3);
    }

    final void c(boolean param0) {
        int var2;
        if (!PlayArea.a(100) &&
          null != this.field_Bb) {
          or.field_d.b(81, (byte) 84);
          or.field_d.field_n = or.field_d.field_n + 2;
          var2 = or.field_d.field_n;
          or.field_d.writeByte(106, 1);
          this.field_Bb.writeToPacket(1, or.field_d);
          or.field_d.backpatchShortLength(-var2 + or.field_d.field_n, 62);
          if (!param0) {
            field_Gb = 97;
          }
          return;
        }
    }

    final SquadSlotWidget j(byte param0) {
        if (param0 != 21) {
          return (SquadSlotWidget) null;
        }
        return this.field_Fb == -1 ? null : this.field_Eb[this.field_Fb];
    }

    private final int b(int param0, int param1) {
        int var3 = -49 / ((-53 - param1) / 38);
        return 75 * (param0 / 3);
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var8 = 0;
        CharSequence var9 = null;
        int var10 = 0;
        CharSequence var11 = null;
        var10 = Kickabout.field_G;
        try {
          if (0 == param0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param0 == 1) {
            var11 = param1[param3];
            var4 = var11;
            if (var4 != null) {
              return var11.toString();
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param0 + param3;
          var5 = 0;
          for (var6_int = param3; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          var8 = 108 / ((param2 - 28) / 43);
          for (var7 = param3; var7 < var4_int; var7++) {
            var9 = param1[var7];
            if (var9 != null) {
              discarded$0 = var6.append(var9);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_23_0 = var6.toString();
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("mf.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_Db = null;
        field_Ab = null;
        field_Cb = null;
        int var1 = -70 / ((-51 - param0) / 44);
        field_yb = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          AuctionListing.a(640, -22914, 0, 480, 390);
          var1_int = -SplashScreen.field_j + 480;
          if (param0 > -99) {
            return;
          }
          for (var2 = 0; var2 < bk.field_c.length; var2++) {
            if (null != bk.field_c[var2]) {
              bk.field_c[var2].draw(-65, var1_int);
              var1_int -= 18;
              continue;
            }
            break;
          }
          TeamManagementScreen.e(127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "mf.K(" + param0 + ')');
        }
    }

    SquadGridWidget(ClubState param0) {
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_Fb = -1;
        try {
          this.field_Eb = new SquadSlotWidget[9];
          this.field_zb = 0;
          this.field_q = 156;
          this.field_Hb = param0;
          this.field_mb = 225;
          for (var2_int = 0; var2_int < 9; var2_int++) {
            this.field_Eb[var2_int] = new SquadSlotWidget();
            this.field_Eb[var2_int].a(true, 52, this.a((byte) -53, var2_int), this.b(var2_int, -96), 75);
            this.addChild((byte) -117, (UiLayoutNode) (this.field_Eb[var2_int]));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("mf.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static byte a(char param0, byte param1) {
        int var2;
        int var3;
        {
          var3 = Kickabout.field_G;
          if ((0 >= param0 ||
            param0 >= 128) && (param0 < 160 ||
            param0 > 255)) {
            if (param0 == 8364) {
              var2 = -128;
            } else if (param0 == 8218) {
              var2 = -126;
            } else if (param0 == 402) {
              var2 = -125;
            } else if (param0 == 8222) {
              var2 = -124;
            } else if (8230 == param0) {
              var2 = -123;
            } else if (8224 == param0) {
              var2 = -122;
            } else if (param0 == 8225) {
              var2 = -121;
            } else if (param0 == 710) {
              var2 = -120;
            } else if (8240 == param0) {
              var2 = -119;
            } else if (param0 == 352) {
              var2 = -118;
            } else if (param0 == 8249) {
              var2 = -117;
            } else if (param0 == 338) {
              var2 = -116;
            } else if (param0 == 381) {
              var2 = -114;
            } else if (param0 == 8216) {
              var2 = -111;
            } else if (param0 == 8217) {
              var2 = -110;
            } else if (param0 == 8220) {
              var2 = -109;
            } else if (param0 == 8221) {
              var2 = -108;
            } else if (param0 == 8226) {
              var2 = -107;
            } else if (param0 == 8211) {
              var2 = -106;
            } else if (8212 == param0) {
              var2 = -105;
            } else if (param0 == 732) {
              var2 = -104;
            } else if (param0 == 8482) {
              var2 = -103;
            } else if (param0 == 353) {
              var2 = -102;
            } else if (param0 == 8250) {
              var2 = -101;
            } else if (339 == param0) {
              var2 = -100;
            } else if (param0 == 382) {
              var2 = -98;
            } else if (param0 == 376) {
              var2 = -97;
            } else {
              var2 = 63;
            }
          } else {
            var2 = (byte)param0;
          }
        }
        if (param1 == -104) {
          return (byte) var2;
        }
        return (byte) 17;
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        wd var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Kickabout.field_G;
        try {
          if (param1 >= -70) {
            field_yb = (String) null;
          }
          var4 = (wd) (ak.field_i.g(24009));
          while (var4 != null) {
            TextFieldNode.a(true, var4, param0);
            var4 = (wd) (ak.field_i.c(33));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "mf.L(" + param0 + ',' + param1 + ')');
        }
    }

    final void k(byte param0) {
        int var4_int = 0;
        int var6 = 0;
        int var2;
        int var3;
        int var7;
        Object var4;
        int var5;
        var7 = Kickabout.field_G;
        var2 = -1;
        var3 = -1;
        for (var4_int = 0; 9 > var4_int; var4_int++) {
          if (!this.field_Eb[var4_int].field_Kb) {
            if (this.field_Eb[var4_int].field_zb) {
              var2 = var4_int;
            }
          } else {
            var3 = var4_int;
          }
        }
        ListingRowCache.a(var3, this.field_T, this.field_F, (byte) -96, var2);
        var5 = -84 % ((param0 + 35) / 60);
        var4 = null;
        AuctionListing.a(this.field_F + this.field_q, -22914, this.field_F, this.field_mb + this.field_T, this.field_T);
        for (var6 = 0; var6 < 9; var6++) {
          if (0 != this.field_Eb[var6].field_qb) {
            var4 = this.field_Eb[var6];
          } else {
            this.field_Eb[var6].h((byte) -125);
          }
        }
        if (var4 != null) {
          ((SquadSlotWidget) (var4)).h((byte) -118);
        }
        TeamManagementScreen.e(121);
    }

    final static wn a(boolean param0, int param1) {
        wn var2 = new wn(true);
        var2.field_c = param0 ? true : false;
        if (param1 <= 29) {
          return (wn) null;
        }
        return var2;
    }

    final static void h(byte param0) {
        if (null != MatchingTextValidator.field_o) {
          return;
        }
        AuctionsHelpScreen.field_F = new String[8];
        AuctionsHelpScreen.field_F[7] = kr.field_c;
        fs.field_a = new String[]{s.field_F, MouseInputHandler.field_a};
        GameModeDefinition.field_e = new String[]{RenderedFootballer.field_Q};
        AuctionsHelpScreen.field_F[1] = uq.field_f;
        AuctionsHelpScreen.field_F[4] = kr.field_d;
        AuctionsHelpScreen.field_F[6] = SquadPickerDialog.field_M;
        AuctionsHelpScreen.field_F[0] = PlayerShopScreen.field_H;
        MatchingTextValidator.field_o = new String[57];
        LoginForm.field_M = new String[]{mc.field_g, MouseInputHandler.field_a};
        ArchiveSource.field_d = new String[]{NumericDateInputWidget.field_C, iv.field_n, MouseInputHandler.field_a};
        ReflectionCheck.field_q = new String[]{s.field_F, BroadcastServerCommand.field_F};
        AuctionsHelpScreen.field_F[3] = rl.field_t;
        FullscreenFocusCanvas.field_i = new String[]{s.field_F, mc.field_g};
        AuctionItem.field_u = new String[]{s.field_F};
        AuctionsHelpScreen.field_F[2] = m.field_i;
        AuctionsHelpScreen.field_F[5] = fc.field_e;
        AccountChoicePanel.field_I = new String[]{RenderedBall.field_H, in.field_a, MouseInputHandler.field_a};
        MatchingTextValidator.field_o[10] = nj.field_b;
        MatchingTextValidator.field_o[12] = ns.field_b;
        MatchingTextValidator.field_o[3] = HoverTooltip.field_zb;
        MatchingTextValidator.field_o[4] = pe.field_b;
        MatchingTextValidator.field_o[2] = TeamManagementScreen.field_E;
        MatchingTextValidator.field_o[25] = ScrollContainer.field_Bb;
        MatchingTextValidator.field_o[28] = pr.field_b;
        MatchingTextValidator.field_o[55] = DemoIntegersCommand.field_B;
        MatchingTextValidator.field_o[8] = IconLabel.field_Eb;
        MatchingTextValidator.field_o[27] = DebouncedValidationProvider.field_c;
        MatchingTextValidator.field_o[9] = NumericDateInputWidget.field_N;
        MatchingTextValidator.field_o[0] = bo.field_zb;
        MatchingTextValidator.field_o[6] = ConsoleEvaluationException.field_a;
        MatchingTextValidator.field_o[5] = MenuButton.field_i;
        MatchingTextValidator.field_o[1] = h.field_c;
        MatchingTextValidator.field_o[7] = TrinketTile.field_Fb;
        MatchingTextValidator.field_o[15] = ManagerAction.field_e;
        MatchingTextValidator.field_o[24] = GameAppletShell.field_f;
        MatchingTextValidator.field_o[18] = DualLinkDeque.field_b;
        MatchingTextValidator.field_o[23] = GameSoundEffect.field_h;
        MatchingTextValidator.field_o[40] = ms.field_a;
        MatchingTextValidator.field_o[14] = FadingSoundPlayer.field_h;
        MatchingTextValidator.field_o[43] = TrinketTile.field_Fb;
        MatchingTextValidator.field_o[45] = us.field_g;
        MatchingTextValidator.field_o[39] = wq.field_f;
        MatchingTextValidator.field_o[41] = ConsoleExpression.field_i;
        MatchingTextValidator.field_o[19] = MenuButton.field_c;
        MatchingTextValidator.field_o[38] = HoverTooltip.field_Ab;
        MatchingTextValidator.field_o[47] = ni.field_e;
        MatchingTextValidator.field_o[36] = di.field_a;
        MatchingTextValidator.field_o[11] = nj.field_c;
        MatchingTextValidator.field_o[22] = TrinketIcon.field_Db;
        MatchingTextValidator.field_o[33] = hh.field_a;
        MatchingTextValidator.field_o[26] = kj.field_c;
        MatchingTextValidator.field_o[16] = ea.field_b;
        MatchingTextValidator.field_o[29] = MatchingTextValidator.field_o[4];
        MatchingTextValidator.field_o[35] = TextLine.field_m;
        MatchingTextValidator.field_o[42] = TrinketTile.field_Fb;
        MatchingTextValidator.field_o[21] = ei.field_f;
        MatchingTextValidator.field_o[44] = DualLinkDeque.field_b;
        MatchingTextValidator.field_o[13] = cu.field_f[0];
        MatchingTextValidator.field_o[20] = GameOverView.field_n;
        MatchingTextValidator.field_o[17] = DebugConsole.field_A;
        MatchingTextValidator.field_o[34] = PasswordValidator.field_m;
        MatchingTextValidator.field_o[48] = oc.field_b.toUpperCase();
        MatchingTextValidator.field_o[30] = "";
        MatchingTextValidator.field_o[50] = lw.field_h;
        MatchingTextValidator.field_o[46] = ii.field_h;
        MatchingTextValidator.field_o[52] = ia.field_h;
        MatchingTextValidator.field_o[32] = "";
        MatchingTextValidator.field_o[56] = ia.field_h;
        MatchingTextValidator.field_o[54] = ArchiveSource.field_a;
        MatchingTextValidator.field_o[53] = ul.field_b;
        MatchingTextValidator.field_o[51] = vp.field_d;
        MatchingTextValidator.field_o[49] = TutorialChoiceDialog.field_K;
        MatchingTextValidator.field_o[37] = "";
        oc.field_b = oc.field_b.toLowerCase();
        MusicPatchNode.field_i = MusicPatchNode.field_i.toLowerCase();
        fa.field_g = new String[57];
        if (param0 != -19) {
          return;
        }
        fa.field_g[28] = GameModeDefinition.field_b;
        fa.field_g[26] = StrongCacheEntry.field_C;
        fa.field_g[46] = TextLayout.field_b;
        ValidationState.field_d = new String[24];
        fa.field_g[48] = ep.field_a;
        fa.field_g[45] = nd.field_a;
        ValidationState.field_d[18] = ef.field_s;
        ValidationState.field_d[1] = DemoIntegersCommand.field_C;
        ValidationState.field_d[4] = cp.field_a;
        ValidationState.field_d[7] = rr.field_a;
        kp.field_g = new String[4];
        ValidationState.field_d[22] = ni.field_n;
        ValidationState.field_d[0] = ValidationState.field_a;
        ValidationState.field_d[5] = ServerMessageScreen.field_B;
        ValidationState.field_d[10] = SumIntegersCommand.field_C;
        ValidationState.field_d[17] = ParticipantStatus.field_r;
        ValidationState.field_d[20] = ParticipantStatus.field_m;
        ValidationState.field_d[21] = ByteStorage.field_a;
        ValidationState.field_d[15] = dr.field_f;
        ValidationState.field_d[16] = Checkbox.field_F;
        ValidationState.field_d[23] = aj.field_d;
        ValidationState.field_d[6] = MessageDialog.field_w;
        ValidationState.field_d[9] = cg.field_L;
        ValidationState.field_d[12] = CheatCodeListener.field_g;
        ValidationState.field_d[19] = ScrollPane.field_yb;
        ValidationState.field_d[3] = PlayerModelPreview.field_l;
        ValidationState.field_d[14] = mc.field_c;
        ValidationState.field_d[2] = mt.field_c;
        ValidationState.field_d[8] = MusicPatch.field_o;
        ValidationState.field_d[13] = ld.field_d;
        ValidationState.field_d[11] = bw.field_c;
        kp.field_g[0] = lt.field_b;
        kp.field_g[2] = WeightedCacheEntry.field_n;
        kp.field_g[3] = AccountMessagePanel.field_C;
        kp.field_g[1] = Checkbox.field_G;
        GameSetupPanel.field_Qb = new String[4];
        DiskCacheWorker.field_g = new String[4];
        GameSetupPanel.field_Qb[0] = TrinketTile.field_Bb;
        GameSetupPanel.field_Qb[3] = op.field_u;
        GameSetupPanel.field_Qb[1] = FormationAgent.field_g;
        GameSetupPanel.field_Qb[2] = MatchAgent.field_a;
        DiskCacheWorker.field_g[1] = LeaguesHelpScreen.field_F;
        DiskCacheWorker.field_g[3] = AccountNameAvailabilityValidator.field_n;
        DiskCacheWorker.field_g[0] = SocketConnector.field_d;
        DiskCacheWorker.field_g[2] = CascadingMenu.field_Db;
    }

    final static PlayerInputEvent a(int param0, int param1, byte param2) {
        if (param2 != 0) {
          SquadGridWidget.i((byte) 81);
        }
        return new PlayerInputEvent(3, param1, param0, (byte) 0, (byte) 0);
    }

    static {
        field_Ab = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_Gb = 0;
        field_Ib = false;
        field_yb = "The account name you use to access RuneScape and other Jagex.com games";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$fbddc791f0bf(int param0, CipherPacketBuffer param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ListingRow[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        ListingRow var14 = null;
        ListingRow var15 = null;
        int var8Lifetime1;
        var12 = Kickabout.field_G;
        try {
          var3_int = un.field_e.readUnsignedMedium(-107);
          var4 = un.field_e.readUnsignedByte((byte) -121);
          var5 = un.field_e.readUnsignedByte((byte) -118);
          stackIn_4_0 = (AnimationSkeleton.field_k == var5) ? 0 : 1;
          var6 = stackIn_4_0;
          var7 = new ListingRow[var4];
          for (var8 = 0; var4 > var8; var8++) {
            var7[var8] = BroadcastServerCommand.a(un.field_e, param0 + 18758);
          }
          LineupView.field_y.addAll(param0 ^ -107, var7, nj.monotonicMillis(param0 + 186));
          if (!param2 &&
            var6 != 0) {
            ChatLine.field_f = false;
            return;
          }
          AnimationSkeleton.field_k = var5;
          TrinketSlot.field_Db[AnimationSkeleton.field_k] = var3_int;
          AuctionTableWidget.field_Hb.field_Db.a(true, 317, AuctionTableWidget.field_Hb.field_Db.field_s, AuctionTableWidget.field_Hb.field_Db.field_J, var3_int * 18 + 6);
          if (var6 != 0) {
            stackIn_14_0 = 0;
          } else {
            stackIn_14_0 = AuctionTableWidget.field_Hb.field_Db.field_J;
          }
          var8Lifetime1 = stackIn_14_0;
          if (param0 != -105) {
            return;
          }
          AuctionTableWidget.field_Hb.a(15, 20, 2, (byte) -114, 230, 344, 170);
          AuctionTableWidget.field_Hb.field_Db.field_J = var8Lifetime1;
          if (param2) {
            var9 = -1;
            var10 = 0;
            while (true) {
              if (var10 < var7.length) {
                var14 = var7[var10];
                if (var14.field_a &&
                  !SumIntegersCommand.a((byte) 121, var14.field_f)) {
                  var9 = var14.rowId;
                } else {
                  var10++;
                  continue;
                }
              }
              if (-1 == var9) {
                FadingSoundPlayer.field_w = 150;
                var13 = 0;
                var10 = var13;
                while (var7.length > var13) {
                  var15 = var7[var13];
                  if (SumIntegersCommand.a((byte) 45, var15.field_f)) {
                    var9 = var15.rowId;
                    break;
                  }
                  var13++;
                }
              }
              if (var9 == -1) {
                break;
              }
              if (var9 <= 4) {
                AuctionTableWidget.field_Hb.field_Db.field_J = 0;
              } else {
                if (var3_int - 5 < var9) {
                  AuctionTableWidget.field_Hb.field_Db.field_J = -(18 * (var3_int - 10));
                } else {
                  AuctionTableWidget.field_Hb.field_Db.field_J = -(18 * (var9 - 4));
                }
              }
              field_Gb = ReceivedAuctionItem.a(18, -(AuctionTableWidget.field_Hb.field_Db.field_J + 5), (byte) -72);
              break;
            }
          }
          SectorCacheStore.a(94);
          ChatLine.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("mf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(')').toString());
        }
    }
}
