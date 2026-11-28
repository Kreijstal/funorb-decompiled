/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AdminCheatOverlay {
    private int field_b;
    boolean field_d;
    static int[] field_e;
    static IndexedSprite[] field_a;
    boolean field_c;
    static BattleUnit field_f;

    final static String a(int param0, PacketBuffer param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (param2 != -48) {
              field_f = (BattleUnit) null;
            }
            var3_int = param1.readUnsignedSmart(-115);
            if (var3_int > param0) {
              var3_int = param0;
            }
            var4 = new byte[var3_int];
            param1.position = param1.position + bd.field_m.a(-112, var3_int, 0, param1.position, var4, param1.payload);
            var5 = SecondaryNodeDeque.decodeCp1252String((byte) -114, var4, var3_int, 0);
            stackIn_6_0 = var5;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_8_0 = "Cabbage";
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ui.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 != -121) {
          field_a = (IndexedSprite[]) null;
        }
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final void a(int param0, int param1, int param2) {
        int var5;
        int var6;
        int var4;
        var6 = Terraphoenix.field_V;
        this.field_d = true;
        if (param1 != 0) {
          this.a(-126, -38, -21);
        }
        var5 = this.field_b;
        if (0 == var5) {
          param0 = 320;
          FrameTimer.field_f.drawCentred(MusicPatch.field_h[0], 320, 468, 13881286, 0);
          param2 = 76;
          param2 += 64;
          pf.field_a[0].draw(0, 0);
          param2 += 160;
          param0 -= 265;
          AccountRequestState.field_f.drawString("<col=fcfe7f>1.</col> " + MusicPatch.field_h[1], param0, param2, 16777215, 0);
          param2 += 16;
          AccountRequestState.field_f.drawString("<col=fcfe7f>2.</col> " + MusicPatch.field_h[2], param0, param2, 16777215, 0);
          param2 += 16;
          AccountRequestState.field_f.drawString("<col=fcfe7f>3.</col> " + MusicPatch.field_h[3], param0, param2, 16777215, 0);
          param0 += 330;
          param2 += 16;
          param2 -= 48;
          AccountRequestState.field_f.drawString("<col=fcfe7f>4.</col> " + MusicPatch.field_h[4], param0, param2, 16777215, 0);
          param2 += 16;
          AccountRequestState.field_f.drawString("<col=fcfe7f>5.</col> " + MusicPatch.field_h[5], param0, param2, 16777215, 0);
          param2 += 16;
          param2 += 46;
          sj.a(65280, 20, param2, 608, 14, 32, MusicPatch.field_h[6], 0);
        } else {
          if (var5 == 1) {
            FrameTimer.field_f.drawCentred(nd.field_o[0], 320, 468, 13881286, -1);
            param2 = 76;
            param0 = 320;
            param0 += 42;
            param2 += 32;
            pf.field_a[1].draw(0, 0);
            param2 += 9;
            for (var5 = 1; var5 <= 14; var5++) {
              if (var5 >= 10) {
                AccountRequestState.field_f.drawString("<col=fcfe7f>" + var5 + ".</col> " + nd.field_o[var5].toUpperCase(), param0, param2, 16777215, 0);
              } else {
                AccountRequestState.field_f.drawString("<col=fcfe7f>0" + var5 + ".</col> " + nd.field_o[var5].toUpperCase(), param0, param2, 16777215, 0);
              }
              param2 += 16;
            }
            param2 += 30;
            sj.a(65280, 20, param2, 592, 14, 48, nd.field_o[15], 0);
          } else {
            if (2 != var5) {
              if (var5 == 3) {
                param0 = 320;
                FrameTimer.field_f.drawCentred(ValidationStatusIcon.field_O[0], 320, 468, 13881286, -1);
                param2 = 76;
                param2 += 32;
                pf.field_a[3].draw(0, 0);
                param2 = param2 + pf.field_a[3].field_t;
                param0 = 32;
                param0 = 0;
                var4 = param2;
                for (var5 = 1; 16 >= var5; var5++) {
                  if (10 <= var5) {
                    AccountRequestState.field_f.drawString(var5 + ". ", 32 + param0, param2 - 9, 16580223, 0);
                  } else {
                    AccountRequestState.field_f.drawString("0" + var5 + ". ", param0 + 32, param2 - 9, 16580223, 0);
                  }
                  param2 = param2 + 11 * (1 + sj.a(16777215, 20, param2, 320 + param0 - 16, 12, param0 + 48, ValidationStatusIcon.field_O[var5], 0));
                  if (param2 > 429) {
                    param0 += 310;
                    param2 = var4;
                  }
                }
              } else {
                if (4 != var5) {
                  if (var5 == 5) {
                    FrameTimer.field_f.drawCentred(DialogMessagePane.field_M[0], 320, 468, 13881286, -1);
                    param2 = 76;
                    param0 = 320;
                    param0 = 64;
                    param2 += 64;
                    rh.field_b[5].draw(32, param2 - 16);
                    sj.a(16777215, 20, param2, 608, 14, param0, DialogMessagePane.field_M[1], 0);
                    param2 += 64;
                    rh.field_b[7].draw(32, -16 + param2);
                    sj.a(16777215, 20, param2, 608, 14, param0, DialogMessagePane.field_M[2], 0);
                    param2 += 64;
                    rh.field_b[8].draw(32, param2 - 16);
                    sj.a(16777215, param1 + 20, param2, 608, 14, param0, DialogMessagePane.field_M[3], 0);
                  } else {
                    if (var5 != 6) {
                      if (7 != var5) {
                        if (8 == var5) {
                          param2 = 100;
                          FrameTimer.field_f.drawCentred(vb.field_f[0], 320, 468, 13881286, -1);
                          param0 = 320;
                          param2 += 32;
                          param0 = 32;
                          AccountRequestState.field_f.drawString(vb.field_f[1], param0, param2, 16580223, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString(vb.field_f[2], 48 + param0, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString(vb.field_f[3], param0, param2, 16580223, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("S", 48 + param0, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[4], 64 + param0, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("M", 48 + param0, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[5], param0 + 64, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("I", param0 + 48, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[6], param0 + 64, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("O", param0 + 48, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[7], param0 + 64, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("R", param0 + 48, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[8], 64 + param0, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("W", 48 + param0, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[18], param0 + 64, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("L", param0 + 48, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[9], 64 + param0, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("N", 48 + param0, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[10], 64 + param0, param2, 16777215, 0);
                          param0 += 256;
                          param2 -= 192;
                          param2 += 24;
                          AccountRequestState.field_f.drawString("C", 48 + param0, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[11], param0 + 64, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("TAB", 40 + param0, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[12], param0 + 64, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("A", param0 + 48, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[13], 64 + param0, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("G", param0 + 48, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[14], 64 + param0, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("V", param0 + 48, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[15], 64 + param0, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString("[,]", param0 + 44, param2, 16580223, 0);
                          AccountRequestState.field_f.drawString(vb.field_f[16], param0 + 64, param2, 16777215, 0);
                          param2 += 24;
                          AccountRequestState.field_f.drawString(vb.field_f[17], 44 + param0, param2, 16777215, 0);
                          if (mm.field_e >= 2) {
                            param2 += 28;
                            AccountRequestState.field_f.drawCentred("ADMIN CHEATS", 320, param2, 16580223, 0);
                            param2 += 20;
                            AccountRequestState.field_f.drawCentred("<col=fcfe7f>K -</col> Kill all enemies on map.", 320, param2, 16777215, 0);
                            param2 += 16;
                            AccountRequestState.field_f.drawCentred("<col=fcfe7f>T -</col> Give current soldier full walking tus.", 320, param2, 16777215, 0);
                            param2 += 16;
                            AccountRequestState.field_f.drawCentred("<col=fcfe7f>Q -</col> Toggle QA helpermode.", 320, param2, 16777215, 0);
                          }
                        }
                      } else {
                        param2 = 80;
                        FrameTimer.field_f.drawCentred(o.field_a[0], 320, 468, 13881286, -1);
                        param0 = 320;
                        param0 = 32;
                        param2 += 32;
                        nb.field_d[0].draw(param0, param2 - 16);
                        param2 = param2 + 13 * (sj.a(16777215, param1 ^ 20, param2, 608, 14, param0 + 48, o.field_a[1], 0) + 1);
                        nb.field_d[1].draw(param0, param2 - 16);
                        param2 = param2 + (1 + sj.a(16777215, 20, param2, 608, 14, param0 + 48, o.field_a[2], 0)) * 13;
                        param2 = param2 + 13 * (sj.a(16777215, 20, param2, 608, 14, param0 + 48, o.field_a[3], 0) + 1);
                        param2 = param2 + (sj.a(16777215, 20, param2, 608, 14, param0 + 48, o.field_a[4], 0) + 1) * 13;
                        param2 = param2 + (sj.a(16777215, 20, param2, 608, 14, 48 + param0, o.field_a[5], 0) + 1) * 13;
                      }
                    } else {
                      param2 = 80;
                      param0 = 320;
                      FrameTimer.field_f.drawCentred(k.field_d[0], 320, 468, 13881286, -1);
                      param0 = 20;
                      pf.field_a[7].draw(0, param2);
                      param2 += 125;
                      AccountRequestState.field_f.drawString("1.", param0, param2 - 9, 16580223, 0);
                      param2 = param2 + (14 + 14 * sj.a(16777215, 20, param2, 620, 14, param0 + 16, k.field_d[1], 0));
                      AccountRequestState.field_f.drawString("2.", param0, -9 + param2, 16580223, 0);
                      param2 = param2 + (14 + 14 * sj.a(16777215, param1 + 20, param2, 620, 14, 16 + param0, k.field_d[2], 0));
                      AccountRequestState.field_f.drawString("3.", param0, -9 + param2, 16580223, 0);
                      param2 = param2 + (1 + sj.a(16777215, param1 + 20, param2, 620, 14, 16 + param0, k.field_d[3], 0)) * 14;
                      AccountRequestState.field_f.drawString("4.", param0, param2 - 9, 16580223, 0);
                      param2 = param2 + (sj.a(16777215, 20, param2, 620, 14, param0 + 16, k.field_d[4], 0) * 14 + 14);
                      AccountRequestState.field_f.drawString("5.", param0, -9 + param2, 16580223, 0);
                      param2 = param2 + 14 * (sj.a(16777215, param1 + 20, param2, 620, 14, 16 + param0, k.field_d[5], 0) + 1);
                    }
                  }
                } else {
                  param0 = 320;
                  param2 = 76;
                  FrameTimer.field_f.drawCentred(MessageKeys.field_a[0], 320, 468, 13881286, -1);
                  param0 = 96;
                  param2 += 48;
                  sj.a(16777215, 20, param2, 610, 14, param0, MessageKeys.field_a[1], 0);
                  rh.field_b[11].draw(32, param2 - 16);
                  param2 += 48;
                  rh.field_b[0].draw(32, param2 - 16);
                  sj.a(16777215, 20, param2, 608, 14, param0, MessageKeys.field_a[2], 0);
                  param2 += 48;
                  rh.field_b[1].draw(32, param2 - 16);
                  sj.a(16777215, 20, param2, 608, 14, param0, MessageKeys.field_a[3], 0);
                  param2 += 48;
                  rh.field_b[3].draw(32, -16 + param2);
                  sj.a(16777215, 20, param2, 608, 14, param0, MessageKeys.field_a[4], 0);
                  param2 += 48;
                  rh.field_b[6].draw(32, -16 + param2);
                  sj.a(16777215, 20, param2, 608, 14, param0, MessageKeys.field_a[5], 0);
                  param2 += 48;
                  rh.field_b[9].draw(32, -16 + param2);
                  rh.field_b[10].draw(32, 4 + param2);
                  param2 += 16;
                  sj.a(16777215, 20, param2, 608, 14, param0, MessageKeys.field_a[6], 0);
                }
              }
            } else {
              param0 = 320;
              param2 = 76;
              FrameTimer.field_f.drawCentred(mb.field_p[0], 320, 468, 13881286, -1);
              pf.field_a[2].draw(0, 0);
              param0 += 64;
              param2 += 32;
              param2 -= 32;
              param2 += 48;
              AccountRequestState.field_f.drawString("1.", param0, -9 + param2, 16580223, 0);
              sj.a(16777215, 20, param2, 616, 14, 16 + param0, mb.field_p[1], 0);
              param2 += 48;
              AccountRequestState.field_f.drawString("2.", param0, -9 + param2, 16580223, 0);
              sj.a(16777215, 20, param2, 616, 14, param0 + 16, mb.field_p[2], 0);
              param2 += 48;
              AccountRequestState.field_f.drawString("3.", param0, param2 - 9, 16580223, 0);
              sj.a(16777215, param1 + 20, param2, 616, 14, param0 + 16, mb.field_p[3], 0);
              param2 += 48;
              AccountRequestState.field_f.drawString("4.", param0, param2 - 9, 16580223, 0);
              sj.a(16777215, 20, param2, 616, 14, param0 + 16, mb.field_p[4], 0);
              param2 += 48;
              AccountRequestState.field_f.drawString("5.", param0, param2 - 9, 16580223, 0);
              sj.a(16777215, 20, param2, 616, 14, 16 + param0, mb.field_p[5], 0);
              param2 += 48;
              sj.a(65280, param1 + 20, param2, 592, 14, 48, mb.field_p[6], 0);
            }
          }
        }
    }

    AdminCheatOverlay(int param0) {
        this.field_b = param0;
        this.field_c = true;
        this.field_d = true;
        if (param0 == 5) {
          this.field_d = false;
          this.field_c = false;
        }
    }

    static {
        field_f = null;
    }
}
