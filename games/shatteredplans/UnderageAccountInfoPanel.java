/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnderageAccountInfoPanel extends WidgetContainer implements HyperlinkListener, ButtonListener {
    private FocusableWidget field_H;
    private TextHotspotWidget field_G;
    static String[] field_J;
    private AccountCreationDialog field_I;
    static ih field_E;
    static int[][] field_D;
    static int field_K;
    static String field_F;

    public static void a(byte param0) {
        try {
          field_F = null;
          field_E = null;
          int var1_int = 124 % ((-2 - param0) / 45);
          field_D = (int[][]) null;
          field_J = null;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "pe.E(" + param0 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 34) {
            UnderageAccountInfoPanel.a((byte) 11, 4);
          }
          stackIn_4_0 = param1 * 200 + 100;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var2), "pe.D(" + param0 + ',' + param1 + ')');
        }
    }

    UnderageAccountInfoPanel(AccountCreationDialog param0) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        RuntimeException runtimeException = null;
        String var2 = null;
        int var3 = 0;
        WidgetTheme var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_I = param0;
          this.field_H = new FocusableWidget(gq.field_b, (WidgetListener) null);
          this.field_H.field_p = (WidgetPainter) ((Object) new SpriteStripButtonPainter());
          var2 = QuickChatCategoryRegistry.a(DiskCacheWorker.field_e, 4371, new String[]{this.l(98), this.a(56)});
          var3 = 20;
          var4 = new WidgetTheme(StatefulWidgetTheme.field_u, 0, 0, 0, 0, 16777215, -1, 3, 0, StatefulWidgetTheme.field_u.field_J, -1, 2147483647, true);
          this.field_G = new TextHotspotWidget(var2, var4);
          this.field_G.field_v = "";
          this.field_G.a(0, true, bk.field_c);
          this.field_G.a(1, true, bk.field_c);
          this.field_G.field_u = (WidgetListener) (this);
          this.field_G.field_x = -40 + this.field_x;
          this.field_G.a(26, var3, (byte) 57, this.field_x - 40);
          var3 = var3 + (this.field_G.field_n + 15);
          this.addChild((byte) -46, this.field_G);
          var5 = 4;
          var6 = 200;
          this.field_H.setBounds(var3, 40, (byte) 115, -var6 + 300 >> 1, var6);
          this.field_H.field_u = (WidgetListener) (this);
          this.addChild((byte) -126, this.field_H);
          this.setBounds(0, var3 + 55 + var5, (byte) 121, 0, 300);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pe.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void onLinkClicked(int param0, int param1, int param2, TextHotspotWidget param3) {
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (0 != param1) {
            if (param1 == 1) {
              SoundPlayback.a(param2 ^ 104, "privacy.ws");
              if ((var6 != 0) &&
                (param1 == 2)) {
                SoundPlayback.a(param2 ^ 127, "conduct.ws");
                SoundPlayback.a(57, "terms.ws");
              }
            } else {
              if (param1 == 2) {
                SoundPlayback.a(param2 ^ 127, "conduct.ws");
                if (var6 != 0) {
                  SoundPlayback.a(57, "terms.ws");
                }
              }
            }
          } else {
            SoundPlayback.a(57, "terms.ws");
          }
          if (param2 != 2) {
            UnderageAccountInfoPanel.a(false, (int[]) null, false, 25, (int[]) null, true, (sr) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("pe.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final String l(int param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 71) {
            stackIn_4_0 = "<u=2164A2><col=2164A2>";
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var2), "pe.I(" + param0 + ')');
        }
    }

    private final String a(int param0) {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 93 % ((param0 + 30) / 43);
          stackIn_1_0 = "</col></u>";
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var2), "pe.A(" + param0 + ')');
        }
    }

    final static String a(PacketBuffer param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param0.readUnsignedSmart(-1282738780);
            if (var3_int > param2) {
              var3_int = param2;
            }
            var4 = new byte[var3_int];
            param0.position = param0.position + DiskArchiveRequest.field_v.decode(var4, param0.payload, var3_int, 7, param0.position, param1);
            var5 = StellarBombEvent.a(var4, var3_int, 0, param1 ^ -127);
            stackIn_3_0 = var5;
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_5_0 = "Cabbage";
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("pe.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_5_0 = this.isBeforeFocusedChild(param3, true);
            return stackIn_5_0;
          }
          if (param0 == 99) {
            stackIn_10_0 = this.isAfterFocusedChild(param3, -97);
            return stackIn_10_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("pe.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void k(int param0) {
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        BattleEvent var1 = null;
        Star[] var1_array = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Star var3 = null;
        int var4 = 0;
        int var5 = 0;
        BattleEvent var1Lifetime1;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 <= 95) {
            field_K = 59;
          }
          NodeHashTableIterator.a(0, "endturn");
          if (2 == oq.field_a.field_P.field_g.field_e.length) {
            if (ho.field_d == oq.field_a.field_P.field_g.field_e[1].field_y) {
              if (SocketArchiveNetworkClient.a("combatSuccess", -116)) {
                DefendTask.a(1, n.a("combatSuccess", -21502));
                if (var5 != 0) {
                  var1 = TertiaryLinkNode.a((byte) -69, oq.field_a.field_P.field_g.field_e[1]);
                  if (null != var1 &&
                    SocketArchiveNetworkClient.a("combatFailed", -116)) {
                    DefendTask.a(1, n.a("combatFailed", -21502));
                  }
                }
              }
            } else {
              var1 = TertiaryLinkNode.a((byte) -69, oq.field_a.field_P.field_g.field_e[1]);
              if (null != var1 &&
                SocketArchiveNetworkClient.a("combatFailed", -116)) {
                DefendTask.a(1, n.a("combatFailed", -21502));
              }
            }
            var1Lifetime1 = TertiaryLinkNode.a((byte) -69, oq.field_a.field_P.field_g.field_e[1]);
            if (null != var1Lifetime1) {
              uq.field_m.a(nf.a(var1Lifetime1, 23248), 27275, "combatreport1");
            }
            uq.field_m.a(Integer.toString(oq.field_a.field_P.field_g.field_e[1].field_x), 27275, "garrison1");
          }
          if (oq.field_a.field_P.field_z &&
            oq.field_a.field_P.field_k != ho.field_d.field_x) {
            DefendTask.a(1, n.a("lose", -21502));
          }
          var1_array = oq.field_a.field_P.field_g.field_e;
          var2 = 0;
          while (var1_array.length > var2) {
            var3 = var1_array[var2];
            if (var5 != 0) {
              return;
            }
            if (null == var3.field_y) {
              stackIn_40_0 = 8421504;
            } else {
              stackIn_40_0 = var3.field_y.field_s;
            }
            var4 = stackIn_40_0;
            uq.field_m.a(QuickChatCategoryRegistry.a("<col=<%0>>" + var3.name + "</col>", 4371, new String[]{Integer.toString(var4, 16)}), 27275, "star" + var3.field_p);
            var2++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1_ref), "pe.J(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int[] param1, boolean param2, int param3, int[] param4, boolean param5, sr param6) {
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        var30 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param1[3] >> 2;
          var22 = param1[4] >> 2;
          var23 = param1[5] >> 2;
          var24 = param1[6] >> 2;
          var25 = param1[7] >> 2;
          var26 = param1[8] >> 2;
          var27 = param1[9] >> 2;
          var28 = param1[10] >> 2;
          var13 = param4[4] * var25 + (param4[3] * var24 + param4[5] * var26) >> 14;
          var29 = param1[11] >> 2;
          var12 = param4[5] * var23 + (var22 * param4[4] + param4[3] * var21) >> 14;
          var16 = var26 * param4[8] + var24 * param4[6] + var25 * param4[7] >> 14;
          var18 = var22 * param4[10] + (var21 * param4[9] + param4[11] * var23) >> 14;
          var20 = param4[10] * var28 + (var27 * param4[9] + var29 * param4[11]) >> 14;
          var14 = param4[5] * var29 + (param4[4] * var28 + var27 * param4[3]) >> 14;
          var15 = var22 * param4[7] + (var21 * param4[6] + var23 * param4[8]) >> 14;
          var17 = param4[8] * var29 + var28 * param4[7] + var27 * param4[6] >> 14;
          var19 = param4[11] * var26 + (param4[10] * var25 + param4[9] * var24) >> 14;
          var21Lifetime1 = -param1[0] + param4[0];
          var22Lifetime1 = param4[1] - param1[1];
          var23Lifetime1 = -param1[2] + param4[2];
          var9 = var21Lifetime1 * param1[3] + param1[4] * var22Lifetime1 + var23Lifetime1 * param1[5] >> 16 - we.field_e;
          if (param3 < 11) {
            return;
          }
          var10 = param1[8] * var23Lifetime1 + (param1[7] * var22Lifetime1 + param1[6] * var21Lifetime1) >> 16 - we.field_e;
          var11 = var23Lifetime1 * param1[11] + (var22Lifetime1 * param1[10] + param1[9] * var21Lifetime1) >> 16;
          var21Lifetime2 = wn.field_i;
          var22Lifetime2 = wn.field_a;
          var23Lifetime2 = 0;
          scanLoop1: while (true) {
            if (param6.field_x > var23Lifetime2) {
              var24Lifetime1 = param6.field_w[var23Lifetime2];
              var25Lifetime1 = param6.field_z[var23Lifetime2];
              var26Lifetime1 = param6.field_f[var23Lifetime2];
              var27Lifetime1 = (var12 * var24Lifetime1 + (var25Lifetime1 * var15 + var26Lifetime1 * var18) >> 16 - we.field_e) + var9;
              var28Lifetime1 = var10 + (var25Lifetime1 * var16 + (var24Lifetime1 * var13 + var26Lifetime1 * var19) >> -we.field_e + 16);
              var29Lifetime1 = var11 + (var25Lifetime1 * var17 + var24Lifetime1 * var14 + var26Lifetime1 * var20 >> 16);
              stackIn_65_0 = ~var29Lifetime1;
              stackIn_65_1 = -51;
              if (var30 == 0) {
                if (stackIn_65_0 > stackIn_65_1) {
                  no.field_c[var23Lifetime2] = -2147483648;
                } else {
                  ul.field_Cb[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  IntNode.field_i[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                  if (var29Lifetime1 > var8) {
                    var8 = var29Lifetime1;
                  }
                  no.field_c[var23Lifetime2] = var29Lifetime1;
                }
                if (param2) {
                  ProxyAuthenticationRequiredException.field_a[var23Lifetime2] = var27Lifetime1 >> we.field_e;
                  dg.field_yb[var23Lifetime2] = var28Lifetime1 >> we.field_e;
                  tg.field_d[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param6.field_K &&
                null != param6.field_D &&
                param6.field_H != null &&
                param6.field_a != null &&
                null != param6.field_c &&
                param6.field_l != null &&
                null != param6.field_A &&
                null != param6.field_m &&
                param6.field_Q != null) {
                var23Lifetime2 = 0;
                while (!(var23Lifetime2 >= param6.field_u)) {
                  var24Lifetime1 = param6.field_K[var23Lifetime2];
                  var25Lifetime1 = param6.field_D[var23Lifetime2];
                  var26Lifetime1 = param6.field_H[var23Lifetime2];
                  InvalidMapConnectionException.field_e[var23Lifetime2] = var9 + (var26Lifetime1 * var18 + var12 * var24Lifetime1 + var15 * var25Lifetime1 >> 16);
                  MouseWheelInput.field_f[var23Lifetime2] = (var24Lifetime1 * var13 - (-(var16 * var25Lifetime1) - var19 * var26Lifetime1) >> 16) + var10;
                  GameState.field_s[var23Lifetime2] = (var26Lifetime1 * var20 + var24Lifetime1 * var14 + var25Lifetime1 * var17 >> 16) + var11;
                  var24Lifetime1 = param6.field_a[var23Lifetime2];
                  var25Lifetime1 = param6.field_c[var23Lifetime2];
                  var26Lifetime1 = param6.field_l[var23Lifetime2];
                  TurnEventLog.field_g[var23Lifetime2] = (var12 * var24Lifetime1 + (var15 * var25Lifetime1 + var18 * var26Lifetime1) >> 16) + var9;
                  MusicCrossfadeStream.field_t[var23Lifetime2] = (var13 * var24Lifetime1 + var25Lifetime1 * var16 + var26Lifetime1 * var19 >> 16) + var10;
                  nb.field_b[var23Lifetime2] = (var17 * var25Lifetime1 + (var24Lifetime1 * var14 + var20 * var26Lifetime1) >> 16) + var11;
                  var24Lifetime1 = param6.field_A[var23Lifetime2];
                  var25Lifetime1 = param6.field_m[var23Lifetime2];
                  var26Lifetime1 = param6.field_Q[var23Lifetime2];
                  aq.field_o[var23Lifetime2] = var9 + (var18 * var26Lifetime1 + (var15 * var25Lifetime1 + var24Lifetime1 * var12) >> 16);
                  ByteArrayNode.field_h[var23Lifetime2] = var10 + (var24Lifetime1 * var13 + var16 * var25Lifetime1 + var19 * var26Lifetime1 >> 16);
                  TextLayout.field_c[var23Lifetime2] = var11 + (var17 * var25Lifetime1 + (var24Lifetime1 * var14 + var26Lifetime1 * var20) >> 16);
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param0) {
                var9 = param4[3];
                var10 = param4[4];
                var11 = param4[5];
                var12 = param4[6];
                var13 = param4[7];
                var14 = param4[8];
                var15 = param4[9];
                var16 = param4[10];
                var17 = param4[11];
                var18 = 0;
                while (!(param6.field_e <= var18)) {
                  stackIn_65_0 = HuffmanCodec.field_c.length;
                  stackIn_65_1 = var18;
                  if (var30 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_65_0 <= stackIn_65_1) {
                    break;
                  }
                  var19 = param6.field_I[var18];
                  var20 = param6.field_y[var18];
                  var21Lifetime2 = param6.field_v[var18];
                  HuffmanCodec.field_c[var18] = var21Lifetime2 * var15 + (var20 * var12 + var9 * var19) >> 16;
                  RandomAccessCacheFile.field_f[var18] = var21Lifetime2 * var16 + (var19 * var10 + var13 * var20) >> 16;
                  PaddedContentDialog.field_ob[var18] = var11 * var19 - (-(var14 * var20) - var21Lifetime2 * var17) >> 16;
                  var18++;
                }
              }
              stackIn_65_0 = -27;
              stackIn_65_1 = param5 ? 1 : 0;
            }
            break;
          }
          BufferedCacheFile.$cfr$intArgs$a$c7cf2d00b385(stackIn_65_0, stackIn_65_1 != 0, param6, var7_int, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("pe.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    final static AnimatedPanel m(int param0) {
        RuntimeException var1 = null;
        AnimatedPanel stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 20) {
            field_K = -33;
          }
          stackIn_4_0 = ro.field_a.field_xb;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1), "pe.H(" + param0 + ')');
        }
    }

    public final void onButtonClicked(FocusableWidget param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 6) {
            return;
          }
          if (param0 == this.field_H) {
            IterableNodeHashTable.b(param1 - 55);
            this.field_I.closeStatusDialog((byte) -104);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("pe.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_J = new String[]{"Overview", "Glossary I", "Glossary II", "Tactical Display", "System HUD", "Controls I", "Controls II", "Animations", "Projects", "Game Types", "Classic Rules"};
        field_E = new ih();
        field_K = 15;
        field_F = "No more fleets available here.";
    }
}
