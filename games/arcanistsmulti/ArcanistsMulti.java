/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ArcanistsMulti extends ud {
    static String field_H;
    static String field_F;
    public static boolean field_G;

    final static boolean i(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -45) {
            field_H = (String) null;
          }
          stackIn_10_0 = (lc.a((byte) 112)) || !(ah.field_c > 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1), "ArcanistsMulti.PA(" + param0 + ')');
        }
    }

    final void shutdownClient(byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 115 / ((obfuscationGuard + 83) / 41);
          sb.shutdownAudioOutputs(8000);
          if (null != ProxySocketConnector.field_m) {
            u.b(6);
          }
          FrameClock.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ArcanistsMulti.G(" + obfuscationGuard + ')');
        }
    }

    private final void e(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != va.field_c) {
            TextTableInitializer.initializeTextTable(va.field_c, (byte) 22);
            va.field_c = null;
            Checkbox.a(2);
          }
          hb.field_Fb = BufferedRandomAccessFile.openArchive(6, (byte) 62);
          ue.field_d = BufferedRandomAccessFile.openArchive(1, (byte) 23);
          so.field_k = BufferedRandomAccessFile.openArchive(7, (byte) 11);
          vg.field_l = BufferedRandomAccessFile.openArchive(2, (byte) 55);
          DateInputWidget.field_E = BufferedRandomAccessFile.openArchive(3, (byte) 36);
          if (!param0) {
            this.m(-126);
          }
          ki.field_s = BufferedRandomAccessFile.openArchive(4, (byte) 123);
          PasswordFieldPainter.field_x = BufferedRandomAccessFile.openArchive(5, (byte) 121);
          ck.field_b = BufferedRandomAccessFile.openArchive(10, (byte) 6);
          wh.field_l = BufferedRandomAccessFile.openArchive(12, (byte) 49);
          GridContainer.field_K = BufferedRandomAccessFile.openArchive(13, (byte) 27);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ArcanistsMulti.LA(" + param0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (null != var2 &&
            SectorCacheStore.encodeBase37((CharSequence) ((Object) var2), false) != 0L) {
            if (param1 != -1) {
              field_F = (String) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("ArcanistsMulti.VA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void releaseClientStatics(byte obfuscationGuard) {
        boolean discarded$0 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_11_2 = false;
        boolean stackIn_59_0 = false;
        boolean stackIn_99_0 = false;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_177_0 = 0;
        int[] stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        int stackIn_183_2 = 0;
        int stackIn_183_3 = 0;
        int stackIn_192_2 = 0;
        boolean[] stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        boolean stackIn_197_2 = false;
        int stackIn_209_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_263_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Object var2 = null;
        int[] var3_ref_int__ = null;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        int[][] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        boolean[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        le var17 = null;
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
        int[] stackIn_183_0Lifetime1;
        int stackIn_183_1Lifetime1;
        int stackIn_183_2Lifetime1;
        int stackIn_183_3Lifetime1;
        int stackIn_209_0Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var4Lifetime2;
        var27 = field_G ? 1 : 0;
        try {
          SectorCacheStore.a(1497225488);
          MusicPatchPcmStream.field_o = ao.a(true);
          IntrusiveNodeHashTable.serviceAudio(200);
          if (null != ProxySocketConnector.field_m &&
            ProxySocketConnector.field_m.field_e) {
            u.b(6);
          }
          stackIn_10_1 = true;
          stackIn_11_2 = (null != ProxySocketConnector.field_m);
          this.a(stackIn_10_1, stackIn_11_2);
          EmailLoginCredentials.field_j = ce.field_m.field_m;
          EmailLoginCredentials.field_f = ce.field_m.field_e;
          ValidatedTextWidget.field_I = (EmailLoginCredentials.field_f - 640) / 2;
          uc.field_a = (-480 + EmailLoginCredentials.field_j) / 2;
          if (ja.field_y) {
            this.e(true);
            ja.field_y = false;
          }
          SpriteState.field_v = SpriteState.field_v + 1;
          if (IntrusiveDequeCursor.a(-15576)) {
            this.d(-107);
            if (IntrusiveDequeCursor.a(-15576)) {
              if (ue.a(123)) {
                discarded$0 = this.a(123, false);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (ue.field_e) {
            if (hn.a((byte) -52)) {
              if (!LoadingTracker.b(-1)) {
                if (um.a((byte) -5)) {
                  if (~ii.field_c == ~ii.field_a) {
                    var2_int = we.b(-3);
                    if (1 == var2_int) {
                      if (CheckboxPainter.field_g == 0) {
                        pi.field_c = true;
                      }
                      Bzip2State.a(ud.field_o, (byte) -98, 0);
                    }
                    this.a((byte) -89, true);
                    decompiledFrameRemainder0 = (var27 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    this.a((byte) -89, false);
                    decompiledFrameRemainder0 = (var27 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.a((byte) -89, false);
                  decompiledFrameRemainder0 = (var27 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_59_0 = (ProxySocketConnector.field_m != null);
                var2_intLifetime2 = ProxySocketConnector.a(stackIn_59_0, (byte) 22, (ud) (this));
                if (2364824 != var2_intLifetime2) {
                  if (1 == var2_intLifetime2 ||
                    2 == var2_intLifetime2) {
                    if (ProxySocketConnector.field_m != null) {
                      u.b(6);
                    }
                    if (2 == var2_intLifetime2) {
                      UsernameCredentials.a((byte) 75, IconButtonPainter.getApplet(123));
                      if (var27 != 0) {
                        ao.a(5623);
                      }
                    }
                  }
                } else {
                  ao.a(5623);
                }
                this.a((byte) -89, true);
                if (var27 != 0) {
                  EditableTextWidget.m(0);
                  if (var27 != 0) {
                    ia.a(-14296, SingleChildContainer.field_y);
                    if (this.a(-109, true)) {
                      ue.field_e = true;
                    }
                  }
                }
              }
            } else {
              EditableTextWidget.m(0);
              if (var27 != 0) {
                ia.a(-14296, SingleChildContainer.field_y);
                if (this.a(-109, true)) {
                  ue.field_e = true;
                }
              }
            }
          } else {
            ia.a(-14296, SingleChildContainer.field_y);
            if (this.a(-109, true)) {
              ue.field_e = true;
            }
          }
          if (!lc.a((byte) 112)) {
            do {
              var2 = (cm) (wh.field_h.removeFirst(true));
              if (null == var2) {
                if (var27 == 0) {
                  break;
                }
              } else {
                AlternateUsernameCredentials.a((cm) (var2), 118, 4);
              }
            } while (var27 == 0);
          }
          while (true) {
            stackIn_99_0 = am.a((byte) 26, NodeHashTable.field_n);
            if (stackIn_99_0) {
              stackIn_263_0 = ~on.field_g;
              stackIn_263_1 = -78;
              if (var27 == 0) {
                if (stackIn_263_0 == stackIn_263_1) {
                  NameValidator.field_s = true;
                  continue;
                }
                if (79 == on.field_g) {
                  bc.field_b = UiContainer.field_z.readUnsignedByte((byte) 100);
                  mf.field_a = UiContainer.field_z.readUnsignedByte((byte) 50);
                  continue;
                }
                if (on.field_g == 9) {
                  lf.switchToRequestedScreen((byte) 80);
                  TextLayout.field_b = false;
                  mn.field_r = 9;
                  TextWidgetPainter.field_b = UiContainer.field_z.readString(-1);
                  continue;
                }
                if (on.field_g == 14) {
                  lf.switchToRequestedScreen((byte) 80);
                  jn.a(150, SceneScrollPane.f((byte) -112), -13173, LoginMethod.a(1), NameSuggestionsPanel.field_E, PacketBuffer.f((byte) -125), 1024, wh.nextPowerOfTwo(1000, 678231216), wh.nextPowerOfTwo(6, 678231216), ArchiveIndex.field_a.length);
                  ra.a(ViewportController.b((byte) 115), 64, DiskCacheWorker.c((byte) -122));
                  mn.field_r = -2;
                  wa.field_Ob = true;
                  TextLayout.field_b = false;
                  continue;
                }
                if (15 == on.field_g) {
                  if (wa.field_Ob) {
                    lf.switchToRequestedScreen((byte) 80);
                    ho.a(0);
                    BirthDateEntryPanel.c(true);
                    hi.field_a = false;
                    wa.field_Ob = false;
                    StatefulTextPainter.field_w = false;
                    fi.field_h = true;
                    wa.field_Kb = true;
                    MusicCrossfadeStream.field_A = false;
                    mn.field_r = 0;
                    bc.a((byte) -50);
                  }
                  TextLayout.field_b = false;
                  IntrusiveDequeCursor.field_g = false;
                  continue;
                }
                if (on.field_g == 10 &&
                  wa.field_Ob) {
                  u.a((byte) -108);
                  continue;
                }
                if (73 == on.field_g) {
                  var2_intLifetime1 = UiContainer.field_z.readUnsignedByte((byte) -122);
                  var3_ref_int__ = new int[var2_intLifetime1];
                  var4 = 0;
                  scanLoop1: while (true) {
                    stackIn_137_0 = var2_intLifetime1;
                    stackIn_137_1 = var4;
                    if (stackIn_137_0 > stackIn_137_1) {
                      var3_ref_int__[var4] = UiContainer.field_z.readInt(-10674);
                      var3_ref_int__[var4] = NameValidator.bitAnd(var3_ref_int__[var4], ~ad.field_f[var4]);
                      stackIn_99_0 = ContextActionMenu.field_Jb;
                      if (stackIn_99_0) {
                        var5 = 0;
                        while (var5 < 32) {
                          var6 = 1 << var5;
                          stackIn_137_0 = -96;
                          stackIn_137_1 = ~(var5 + 32 * var4);
                          if (stackIn_137_0 < stackIn_137_1 &&
                            (var6 & var3_ref_int__[var4]) != 0) {
                            b.field_a.addLast(new qa(32 * var4 + var5), -1);
                          }
                          var5++;
                        }
                      }
                      ad.field_f[var4] = fj.bitOr(ad.field_f[var4], var3_ref_int__[var4]);
                      var4++;
                      continue scanLoop1;
                    }
                    break;
                  }
                  continue;
                }
                if (on.field_g == 74) {
                  if (!td.e(true)) {
                    NodeHashTableIterator.field_j = UiContainer.field_z.readUnsignedShort(-98);
                    cb.field_e = UiContainer.field_z.readLong(-943038560);
                    ad.field_d = UiContainer.field_z.readUnsignedByte((byte) -100);
                  } else {
                    var2_intLifetime1 = UiContainer.field_z.readUnsignedShort(-98);
                    var3_long = UiContainer.field_z.readLong(-943038560);
                    ad.field_d = UiContainer.field_z.readUnsignedByte((byte) 62);
                    if (var2_intLifetime1 > NodeHashTableIterator.field_j) {
                      NodeHashTableIterator.field_j = var2_intLifetime1;
                    }
                    cb.field_e = cb.field_e | var3_long;
                  }
                  GridContainer.field_P = md.sumFlaggedValues(false, cb.field_e);
                  nm.field_h = -1;
                  la.field_a = true;
                  continue;
                }
                if (on.field_g == 57 ||
                  on.field_g == 58) {
                  lf.switchToRequestedScreen((byte) 80);
                  var2_intLifetime1 = UiContainer.field_z.readUnsignedByte((byte) -124);
                  var3 = UiContainer.field_z.readUnsignedByte((byte) -101);
                  stackIn_173_0 = (0 == UiContainer.field_z.readUnsignedByte((byte) 106)) ? 0 : 1;
                  var4Lifetime2 = stackIn_173_0;
                  stackIn_177_0 = (UiContainer.field_z.readUnsignedByte((byte) 111) == 0) ? 0 : 1;
                  var5Lifetime1 = stackIn_177_0;
                  var6Lifetime1 = UiContainer.field_z.readUnsignedShort(-98);
                  var7 = new String[UiContainer.field_z.readUnsignedByte((byte) 115)];
                  var8 = -2;
                  var8Lifetime1 = UiContainer.field_z.readByte(6);
                  var9 = new int[var7.length][18];
                  var10 = new int[var7.length][16];
                  var11 = new int[var7.length];
                  var12 = new boolean[var7.length];
                  var13 = 0;
                  var14 = 0;
                  while (var7.length > var14) {
                    var7[var14] = UiContainer.field_z.readVersionedString(-32461);
                    stackIn_209_0 = 0;
                    var15 = stackIn_209_0;
                    scanLoop2: while (true) {
                      if (var15 >= 18) {
                        while (true) {
                          var15 = 0;
                          while (var15 < 16) {
                            var16 = UiContainer.field_z.readUnsignedByte((byte) 109) & 255;
                            stackIn_183_0 = var10[var14];
                            stackIn_183_1 = var15;
                            stackIn_183_2 = -256;
                            stackIn_183_3 = ~var16;
                            if (stackIn_183_2 == stackIn_183_3) {
                              stackIn_192_2 = -1;
                            } else {
                              stackIn_192_2 = var16;
                            }
                            stackIn_183_0[stackIn_183_1] = stackIn_192_2;
                            var15++;
                          }
                          break scanLoop2;
                        }
                      }
                      stackIn_183_0Lifetime1 = var9[var14];
                      stackIn_183_1Lifetime1 = var15;
                      stackIn_183_2Lifetime1 = UiContainer.field_z.readUnsignedByte((byte) -88);
                      stackIn_183_3Lifetime1 = 255;
                      while (true) {
                        stackIn_183_0Lifetime1[stackIn_183_1Lifetime1] = NameValidator.bitAnd(stackIn_183_2Lifetime1, stackIn_183_3Lifetime1);
                        var15++;
                        continue scanLoop2;
                      }

                    }
                    var11[var14] = UiContainer.field_z.readUnsignedByte((byte) 76);
                    stackIn_196_0 = var12;
                    stackIn_196_1 = var14;
                    stackIn_197_2 = (UiContainer.field_z.readUnsignedByte((byte) 123) == 1);
                    stackIn_196_0[stackIn_196_1] = stackIn_197_2;
                    if (var12[var14] &&
                      0 == var10[var14][0] &&
                      var10[var14][11] == 11) {
                      var9[var14][12] = 28;
                      var9[var14][13] = 0;
                      var9[var14][14] = 29;
                      var9[var14][15] = 33;
                      var9[var14][16] = 47;
                      var9[var14][17] = 50;
                      var9[var14][0] = 204;
                      var9[var14][1] = 170;
                      var9[var14][2] = 238;
                      var9[var14][3] = 255;
                      var9[var14][4] = 192;
                      var9[var14][5] = 255;
                      var9[var14][6] = 32;
                      var9[var14][7] = 32;
                      var9[var14][8] = 32;
                      var9[var14][9] = 128;
                      var9[var14][10] = 64;
                      var9[var14][11] = 128;
                      var13 = 1;
                    }
                    var14++;
                  }
                  var14Lifetime1 = UiContainer.field_z.readInt(-10674);
                  stackIn_209_0Lifetime1 = UiContainer.field_z.readUnsignedByte((byte) -118);
                  var15Lifetime1 = stackIn_209_0Lifetime1;
                  stackIn_213_0 = ((var15Lifetime1 & 128) == 0) ? 0 : 1;
                  var16Lifetime1 = stackIn_213_0;
                  r.field_b = null;
                  var15Lifetime1 = var15Lifetime1 & 127;
                  SpriteState.field_z = null;
                  System.gc();
                  var17 = new le(true, var2_intLifetime1, var3, var4Lifetime2 != 0, var7, var8Lifetime1, var9, var10, var11, var14Lifetime1, var15Lifetime1, var5Lifetime1 != 0, var6Lifetime1, var12);
                  mi.a(DelegatingCanvas.field_c[var17.field_V.a(-31497) + 1], 3);
                  var17.m(413355681);
                  if (var13 != 0) {
                    var18 = SceneTabbedPanel.field_Tb.field_A.length;
                    var19 = 0;
                    while (var19 < var18) {
                      var20 = SceneTabbedPanel.field_Tb.field_A[var19];
                      var21 = (var20 & 16711680) >> 16;
                      var22 = var20 >> 8 & 255;
                      var23 = 255 & var20;
                      var24 = (var21 + var22) / 2;
                      var25 = (var23 + var21) / 2;
                      var26 = (var22 + var23) / 2;
                      SceneTabbedPanel.field_Tb.field_A[var19] = (var25 << 8) + ((var24 << 16) + var26);
                      var19++;
                    }
                  }
                  if (on.field_g != 57) {
                    r.field_b = var17;
                    StatefulTextPainter.field_w = true;
                  } else {
                    SpriteState.field_z = var17;
                    hi.field_a = true;
                    jg.a(-3);
                    ArchiveIndex.a((byte) 121);
                    ValidationHelpWidget.i((byte) -53);
                  }
                  stackIn_233_0 = (var16Lifetime1 == 0) ? 5 : -1;
                  mn.field_r = stackIn_233_0;
                  MusicCrossfadeStream.field_A = true;
                  IntrusiveDequeCursor.field_g = false;
                  continue;
                }
                if (on.field_g == 59) {
                  if (hi.field_a ||
                    StatefulTextPainter.field_w) {
                    lf.switchToRequestedScreen((byte) 80);
                    if (hi.field_a &&
                      SpriteState.field_z != null) {
                      SpriteState.field_z.a(-112, false);
                    }
                    fi.field_h = true;
                    hi.field_a = false;
                    StatefulTextPainter.field_w = false;
                    MusicCrossfadeStream.field_A = false;
                    mn.field_r = -2;
                    ao.field_d = true;
                    UiTheme.field_t = 0;
                    bc.a((byte) -50);
                  }
                  IntrusiveDequeCursor.field_g = false;
                  continue;
                }
                var2 = null;
                if (!hi.field_a) {
                  if (StatefulTextPainter.field_w) {
                    var2 = r.field_b;
                  }
                } else {
                  var2 = SpriteState.field_z;
                }
                if (null != var2 &&
                  ((le) (var2)).e((byte) -78)) {
                  continue;
                }
                this.g(-24);
                continue;
              }
            } else {
              stackIn_263_0 = -27;
              stackIn_263_1 = (0 - obfuscationGuard) / 36;
            }
            var2_intLifetime1 = stackIn_263_0 % stackIn_263_1;
            we.a(0, (byte) 121);
            if (-2 == CheckboxPainter.field_g) {
              ao.field_d = true;
            }
            if (ao.field_d) {
              UiTheme.field_t = 0;
            }
            if (ProxySocketConnector.c((byte) -44)) {
              var3Lifetime1 = this.e(118);
              if (var3Lifetime1 == 0 ||
                var3Lifetime1 == 1) {
                ub.a((byte) 127, 4);
                jn.a((byte) -64, 6);
                of.b(7, 16);
                ta.field_b = false;
                if (nm.field_h != -1) {
                  ByteStorage.a(2, nm.field_h);
                }
                pi.a(true);
                if (var3Lifetime1 == 1) {
                  TextLayout.field_b = true;
                  IntrusiveDequeCursor.field_g = true;
                }
                if (var3Lifetime1 != 1 ||
                  var27 != 0) {
                  if (wa.field_Ob) {
                    MusicCrossfadeStream.field_A = false;
                    fi.field_h = true;
                    wa.field_Kb = true;
                    if (hi.field_a) {
                      TextWidgetPainter.field_b = we.field_e;
                      gj.a(false, true, 9, mn.field_r);
                      if (var27 != 0) {
                        gj.a(false, true, 0, mn.field_r);
                      }
                    } else {
                      gj.a(false, true, 0, mn.field_r);
                    }
                    lf.switchToRequestedScreen((byte) 80);
                    ArchiveProvider.field_f[CheckboxPainter.field_g].a(false, 0, (byte) -123);
                    StatefulTextPainter.field_w = false;
                    wa.field_Ob = false;
                    hi.field_a = false;
                    bc.a((byte) -50);
                  }
                  IntrusiveDequeCursor.field_g = false;
                  TextLayout.field_b = false;
                }}
              var4Lifetime1 = 0;
              if (var3Lifetime1 == 2) {
                var4Lifetime1 = 1;
              }
              if (wa.field_Ob ||
                TextLayout.field_b ||
                IntrusiveDequeCursor.field_g) {
                var4Lifetime1 = 1;
              }
              if (!ProxySocketConnector.c((byte) -44)) {
                var4Lifetime1 = 0;
              }
              if (var4Lifetime1 != 0 &&
                null != CachedArchiveProvider.field_t) {
                ah.a(ArchiveRequest.field_t, CachedArchiveProvider.field_t.field_o, 8, 8, ResizableViewResizeListener.field_h, CachedArchiveProvider.field_t, EmailLoginCredentials.field_f / 2, EmailLoginCredentials.field_j / 2, 2, CachedArchiveProvider.field_t.field_m + CachedArchiveProvider.field_t.field_o, -97);
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) (var2), "ArcanistsMulti.A(" + obfuscationGuard + ')');
        }
    }

    private final void a(int param0, int param1, PcmSample param2, int[] param3, boolean param4, PcmSample[] param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param4) {
            field_H = (String) null;
          }
          param5[param1] = param2;
          param3[param1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ArcanistsMulti.NA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean a(int param0, boolean param1) {
        int stackIn_188_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        IndexedSprite[] var4 = null;
        Sprite[][] var5 = null;
        Sprite[][] var6 = null;
        Sprite var7 = null;
        IndexedSprite[] var8 = null;
        int var9 = 0;
        Sprite var7Lifetime1;
        int var3_intLifetime1;
        var9 = field_G ? 1 : 0;
        try {
          if (ec.field_c == null) {
            mb.field_bb = (int)(Math.random() * 8.0);
            var3_int = mb.field_bb;
            if (var3_int == 0) {
              ec.field_c = "flame";
            }
            if (var3_int == 1) {
              ec.field_c = "frost";
            }
            if (var3_int == 2) {
              ec.field_c = "rock";
            }
            if (var3_int == 3) {
              ec.field_c = "overlight";
            }
            if (var3_int == 4) {
              ec.field_c = "storm";
            }
            if (var3_int == 5) {
              ec.field_c = "underdark";
            }
            if (var3_int == 6) {
              ec.field_c = "nature";
            }
            if (7 == var3_int) {
              ec.field_c = "water";
            }
            if (var3_int == 8) {
              ec.field_c = "clockwork";
            }
          }
          DropdownList.initializeCaptionTable((byte) -90);
          if (null != vg.field_l) {
            if (LoadingTracker.field_a.ensureIndex(-10923) &&
              LoadingTracker.field_a.isGroupAvailableByName("basic", -24417)) {
              if (LoadingTracker.field_a.ensureIndex(-10923) &&
                LoadingTracker.field_a.isGroupAvailableByName("roman20", -24417)) {
                if (ud.field_D.ensureIndex(-10923) &&
                  ud.field_D.isGroupAvailableByName("roman20", -24417)) {
                  if (LoadingTracker.field_a.ensureIndex(-10923) &&
                    LoadingTracker.field_a.isGroupAvailableByName("lobby", -24417)) {
                    if (ud.field_D.ensureIndex(-10923) &&
                      ud.field_D.isGroupAvailableByName("lobby", -24417)) {
                      if (vg.field_l.ensureIndex(-10923) &&
                        vg.field_l.areAllGroupsAvailable(106)) {
                        if (DateInputWidget.field_E.ensureIndex(-10923) &&
                          DateInputWidget.field_E.areAllGroupsAvailable(-15)) {
                          if (ki.field_s.ensureIndex(-10923) &&
                            ki.field_s.areAllGroupsAvailable(125)) {
                            if (PasswordFieldPainter.field_x.ensureIndex(-10923) &&
                              PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_titlescreen", "") &&
                              PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_grassland", "")) {
                              if (ue.field_d.ensureIndex(-10923) &&
                                ue.field_d.isGroupAvailableByName("", -24417)) {
                                if (!ue.field_d.isGroupAvailableByName(ec.field_c, -24417)) {
                                  rb.a(nm.formatArchiveProgress(17153, LoadingProgressDialog.field_nb, ue.field_d, ValidationHelpWidget.field_Z, ec.field_c), false, 40.0f);
                                  return false;
                                }
                                if (so.field_k.ensureIndex(-10923) &&
                                  so.field_k.areAllGroupsAvailable(109)) {
                                  if (hb.field_Fb.ensureIndex(-10923) &&
                                    hb.field_Fb.areAllGroupsAvailable(-33)) {
                                    if (GridContainer.field_K.ensureIndex(-10923) &&
                                      GridContainer.field_K.areAllGroupsAvailable(-121)) {
                                      wm.g(0);
                                      rb.a(DisplayNameForm.field_N, false, 60.0f);
                                      this.updateClient((byte) -89);
                                      if (!param1) {
                                        return false;
                                      }
                                      lo.field_w = new SoundCache(vg.field_l, DateInputWidget.field_E);
                                      vg.field_l = null;
                                      DateInputWidget.field_E = null;
                                      Checkbox.a(2);
                                      return false;
                                    }
                                    rb.a(qe.formatLoadingProgress(MenuButtonPainter.field_t, 74, GridContainer.field_K, NodeHashTable.field_c), false, 55.0f);
                                    return false;
                                  }
                                  rb.a(qe.formatLoadingProgress(MenuButtonPainter.field_t, 115, hb.field_Fb, NodeHashTable.field_c), false, 50.0f);
                                  return false;
                                }
                                rb.a(qe.formatLoadingProgress(LoadingProgressDialog.field_nb, 113, so.field_k, ValidationHelpWidget.field_Z), false, 45.0f);
                                return false;
                              }
                              rb.a(nm.formatArchiveProgress(17153, LoadingProgressDialog.field_nb, ue.field_d, ValidationHelpWidget.field_Z, ""), false, 35.0f);
                              return false;
                            }
                            rb.a(qe.formatLoadingProgress(ii.field_e, 96, PasswordFieldPainter.field_x, TextLayout.field_e), false, 32.0f);
                            return false;
                          }
                          rb.a(qe.formatLoadingProgress(ii.field_e, 76, ki.field_s, TextLayout.field_e), false, 29.0f);
                          return false;
                        }
                        rb.a(qe.formatLoadingProgress(StatefulTextPainter.field_v, 76, DateInputWidget.field_E, fn.field_a), false, 23.0f);
                        return false;
                      }
                      rb.a(qe.formatLoadingProgress(StatefulTextPainter.field_v, 122, vg.field_l, fn.field_a), false, 20.0f);
                      return false;
                    }
                    rb.a(nm.formatArchiveProgress(17153, ra.field_d, ud.field_D, wh.field_a, "lobby"), false, 17.0f);
                    return false;
                  }
                  rb.a(nm.formatArchiveProgress(17153, LoadingProgressDialog.field_nb, LoadingTracker.field_a, ValidationHelpWidget.field_Z, "lobby"), false, 14.0f);
                  return false;
                }
                rb.a(nm.formatArchiveProgress(17153, ra.field_d, ud.field_D, wh.field_a, "roman20"), false, 11.0f);
                return false;
              }
              rb.a(nm.formatArchiveProgress(17153, LoadingProgressDialog.field_nb, LoadingTracker.field_a, ValidationHelpWidget.field_Z, "roman20"), false, 8.0f);
              return false;
            }
            rb.a(nm.formatArchiveProgress(17153, LoadingProgressDialog.field_nb, LoadingTracker.field_a, ValidationHelpWidget.field_Z, "basic"), false, 5.0f);
            return false;
          }
          if (PasswordFieldPainter.field_x != null &&
            DelegatingCanvas.field_c == null) {
            rb.a(FadingModalPanel.field_J, false, 85.0f);
            this.updateClient((byte) -89);
            DelegatingCanvas.field_c = new MusicTrack[10];
            Checkbox.a(2);
            return false;
          }
          var3_intLifetime1 = -84 / ((14 - param0) / 56);
          if (null != so.field_k) {
            if (MembershipOfferScreen.field_o == null) {
              rb.a(hi.field_c, false, 90.0f);
              this.updateClient((byte) -89);
              MembershipOfferScreen.field_o = fj.loadSprite("", -22612, ue.field_d, "funorblogo");
              IntrusiveDeque.field_b = fj.loadSprite("", -22612, ue.field_d, "newlogo");
              g.field_a = fj.loadSprite("", -22612, ue.field_d, "newlogostars");
              sm.field_d = fj.loadSprite("", -22612, ue.field_d, "newlogostars2");
              FadingModalPanel.field_I = fj.loadSprite("", -22612, ue.field_d, "arrowbuttonsmall");
              SceneWidgetNode.field_q = fj.loadSprite("", -22612, ue.field_d, "arrowbutton");
              km.field_e = fj.loadSprite("", -22612, ue.field_d, "border_corner");
              PacketBuffer.field_l = fj.loadSprite("", -22612, ue.field_d, "border_bar_h");
              MusicPatchPcmStream.field_k = fj.loadSprite("", -22612, ue.field_d, "border_bar_v");
              mc.field_a = qe.loadSpriteSheet(ue.field_d, "charactericons", "", 55);
              rb.field_o = qe.loadSpriteSheet(ue.field_d, "bonushats", "", 63);
              Checkbox.a(2);
              return false;
            }
            if (LoginPanel.field_M == null) {
              rb.a(hi.field_c, false, 91.0f);
              this.updateClient((byte) -89);
              wm.field_H = qe.loadSpriteSheet(ue.field_d, "menu_overlays", "", 41);
              LoginPanel.field_M = new IndexedSprite[9];
              oo.field_t = fj.loadSprite("", -22612, ue.field_d, "logo_arcanists");
              wm.field_H[13].makeRasterTarget();
              IntrusiveDeque.field_b.field_x = -(IntrusiveDeque.field_b.field_n / 2) + 320;
              IntrusiveDeque.field_b.field_o = 16;
              rk.g(491697968);
              kf.field_b = qe.loadSpriteSheet(ue.field_d, "frame2", "", 83);
              ScreenDisplayMode.field_f = fj.loadSprite("", -22612, ue.field_d, "gamespell");
              fe.field_g = fj.loadSprite("", -22612, ue.field_d, "gamebars");
              pm.field_a = fj.loadSprite("", -22612, ue.field_d, "cldgame");
              TextTableInitializer.field_a = fj.loadSprite("", -22612, ue.field_d, "cldtr");
              MusicPatchNode.field_F = fj.loadSprite("", -22612, ue.field_d, "cldbl");
              ContextActionMenu.field_Ib = fj.loadSprite("", -22612, ue.field_d, "cldtl");
              BevelBoxPainter.field_a = fj.loadSprite("", -22612, ue.field_d, "cldbr");
              LoadingProgressDialog.field_mb = fj.loadSprite("", -22612, ue.field_d, "cldflat");
              fe.field_o = fj.loadSprite("", -22612, ue.field_d, "spell_book");
              Checkbox.a(2);
              return false;
            }
            if (null == DiskCacheRequest.field_E) {
              rb.a(hi.field_c, false, 92.0f);
              this.updateClient((byte) -89);
              DiskCacheRequest.field_E = new Sprite[15];
              var4_int = 0;
              do {
                if (var4_int >= 15) {
                  var4_int = 0;
                  break;
                }
                DiskCacheRequest.field_E[var4_int] = wm.field_H[var4_int].copy();
                var4_int++;
              } while (var9 == 0);
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (15 <= var4_int))) {
                NanoFrameClock.renderThemeBackground(true, var4_int);
                stackIn_188_0 = 0;
                if (var9 == 0) {
                  if (stackIn_188_0 < var4_int &&
                    var4_int < 13) {
                    wm.field_H[var4_int] = null;
                  }
                  var4_int++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                DiskCacheRequest.field_E[0] = null;
                IntrusiveDeque.field_b = null;
                ce.field_m.a(true);
                SceneTextInput.loadSceneSprites(ue.field_d, (byte) -66);
                CachedArchiveProvider.field_t = LoadingTracker.loadBinaryFont(so.field_k, -24755, "", "font", ue.field_d);
                mi.field_B = LoadingTracker.loadBinaryFont(so.field_k, -24755, "", "smallfont", ue.field_d);
                Checkbox.a(2);
                stackIn_188_0 = 0;
              }
              return stackIn_188_0 != 0;
            }
            if (mb.field_ab == null) {
              rb.a(hi.field_c, false, 93.0f);
              this.updateClient((byte) -89);
              mb.field_ab = IterableNodeHashTable.loadIndexedSpritesByName("", 0, "spellclasses", ue.field_d);
              TextLine.field_b = fj.loadSprite("basic", -22612, LoadingTracker.field_a, "unachieved");
              ii.field_d = fj.loadSprite("basic", -22612, LoadingTracker.field_a, "locked");
              NodeHashTable.field_d = fj.loadSprite("basic", -22612, LoadingTracker.field_a, "orbcoin");
              SceneWidget.field_kb = qe.loadSpriteSheet(ue.field_d, "heads", "", 95);
              IsaacRandom.field_j = qe.loadSpriteSheet(ue.field_d, "bodies", "", 67);
              DiskCacheRequest.field_u = qe.loadSpriteSheet(ue.field_d, "phands", "", 58);
              qe.field_i = qe.loadSpriteSheet(ue.field_d, "mhands", "", 57);
              hn.field_d = qe.loadSpriteSheet(ue.field_d, "beards", "", 106);
              CachedArchiveProvider.field_A = qe.loadSpriteSheet(ue.field_d, "hats", "", 124);
              bo.field_a = qe.loadSpriteSheet(ue.field_d, "mouths", "", 42);
              ModalPanelStack.field_I = qe.loadSpriteSheet(ue.field_d, "pfeet", "", 58);
              fn.field_b = qe.loadSpriteSheet(ue.field_d, "mfeet", "", 113);
              Checkbox.a(2);
              return false;
            }
            if (null == SceneTabbedPanel.field_Pb) {
              rb.a(hi.field_c, false, 94.0f);
              this.updateClient((byte) -89);
              SceneTabbedPanel.field_Pb = qe.loadSpriteSheet(ue.field_d, "conductororb", "", 60);
              fc.field_e = qe.loadSpriteSheet(ue.field_d, "phylactery", "", 92);
              DualLinkNode.field_j = qe.loadSpriteSheet(ue.field_d, "stonemonster", "", 64);
              fo.field_g = qe.loadSpriteSheet(ue.field_d, "frostsprite", "", 56);
              LoadingTracker.field_k = qe.loadSpriteSheet(ue.field_d, "fungus", "", 102);
              lf.field_c = qe.loadSpriteSheet(ue.field_d, "flamesprite", "", 69);
              eo.field_a = qe.loadSpriteSheet(ue.field_d, "watersprite", "", 58);
              KeyboardInputHandler.field_h = qe.loadSpriteSheet(ue.field_d, "gaurdianangel", "", 69);
              ae.field_a = qe.loadSpriteSheet(ue.field_d, "clockwork", "", 93);
              wg.field_J = qe.loadSpriteSheet(ue.field_d, "aura", "", 124);
              ArrayWidgetContainer.field_E = qe.loadSpriteSheet(ue.field_d, "clockworkaura", "", 75);
              jg.field_c = IterableNodeHashTable.loadIndexedSpritesByName("", 0, "runes", ue.field_d);
              WhirlpoolHasher.field_o = qe.loadSpriteSheet(ue.field_d, "spellbooks", "", 93);
              Checkbox.a(2);
              return false;
            }
            if (null == nm.field_i) {
              rb.a(hi.field_c, false, 95.0f);
              this.updateClient((byte) -89);
              bb.field_g = qe.loadSpriteSheet(ue.field_d, "spellicons", "", 75);
              nm.field_i = qe.loadSpriteSheet(ue.field_d, "frame", "", 51);
              nm.field_i[1].field_n = nm.field_i[1].field_q;
              nm.field_i[4] = null;
              nm.field_i[3].field_w = nm.field_i[3].field_y;
              nm.field_i[7].field_n = nm.field_i[7].field_q;
              nm.field_i[5].field_w = nm.field_i[5].field_y;
              ResizableViewResizeListener.field_h = qe.loadSpriteSheet(ue.field_d, "button_frame", "", 69);
              Checkbox.a(2);
              return false;
            }
            if (null == ArchiveRequest.field_t) {
              rb.a(hi.field_c, false, 96.0f);
              this.updateClient((byte) -89);
              ArchiveRequest.field_t = qe.loadSpriteSheet(ue.field_d, "button_frame_r", "", 94);
              qe.loadSpriteSheet(ue.field_d, "button_frame_d", "", 44);
              IntrusiveNodeHashTable.field_a = qe.loadSpriteSheet(ue.field_d, "achievements_large", "", 98);
              var4_int = 95;
              do {
                if (!(var4_int < IntrusiveNodeHashTable.field_a.length)) {
                  ih.field_e = new Sprite(32, 32);
                  ih.field_e.makeRasterTarget();
                  NodeHashTable.field_d.drawScaledAveraged(0, 0, 32, 32);
                  ce.field_m.a(true);
                  Checkbox.a(2);
                  break;
                }
                IntrusiveNodeHashTable.field_a[var4_int] = null;
                var4_int++;
              } while (var9 == 0);
              return false;
            }
            if (so.field_k != null) {
              rb.a(hi.field_c, false, 97.0f);
              this.updateClient((byte) -89);
              LoadingTracker.field_a.field_f = 0;
              ud.field_D.field_f = 0;
              SingleChildContainer.setDefaultFont((byte) 111, LoadingTracker.loadBinaryFont(ud.field_D, -24755, "lobby", "chatfont", LoadingTracker.field_a));
              LoadingTracker.field_a.field_f = 1;
              ud.field_D.field_f = 1;
              var4 = IterableNodeHashTable.loadIndexedSpritesByName("", 0, "minibonushats", ue.field_d);
              var5 = new Sprite[3][];
              var6 = new Sprite[3][];
              var5[0] = qe.loadSpriteSheet(ue.field_d, "turntime_icons", "", 76);
              var5[1] = qe.loadSpriteSheet(ue.field_d, "levelstyle_iconssmall", "", 56);
              var5[2] = qe.loadSpriteSheet(ue.field_d, "team_iconssmall", "", 76);
              var6[0] = null;
              var6[1] = qe.loadSpriteSheet(ue.field_d, "levelstyle_icons", "", 121);
              var6[2] = null;
              var7 = var5[1][3];
              var5[1][3] = var5[1][2];
              var5[1][2] = var5[1][1];
              var5[1][1] = var5[1][0];
              var5[1][0] = var7;
              var7Lifetime1 = var6[1][3];
              var6[1][3] = var6[1][2];
              var6[1][2] = var6[1][1];
              var6[1][1] = var6[1][0];
              var6[1][0] = var7Lifetime1;
              rb.a(NameSuggestionsPanel.field_E, GridContainer.field_K, var4, var5, true, DelegatingCanvas.field_d, WhirlpoolHasher.field_l, 6, ud.field_D, (int[]) null, var6, BirthDateEntryPanel.field_O, (byte) -67, ArchiveIndex.field_a, 3, aj.field_a, LoadingTracker.field_a);
              fn.a(200, (byte) -106);
              um.field_a = qf.field_c;
              LinkButtonPainter.field_c = false;
              SceneTextInput.field_Hb = co.field_a;
              qn.a(-24539, LoadingTracker.field_a, ud.field_D);
              ud.field_D = null;
              so.field_k = null;
              if (lc.a((byte) 112) ||
                !(0 < ah.field_c)) {
                var8 = IterableNodeHashTable.loadIndexedSpritesByName("", 0, "expansion_screens", ue.field_d);
                SceneWidgetNode.field_s = new MembershipOfferScreen((java.applet.Applet) (this), SectorCacheStore.field_i, var8, SceneTextInput.field_Kb);
              }
              Checkbox.a(2);
              return false;
            }
          }
          if (hb.field_Fb == null) {
            PacketBuffer.d((byte) -98);
            return true;
          }
          MidiPcmStream.a(-92, new u(hb.field_Fb.getNamedFile("huffman", "", -1)));
          hb.field_Fb = null;
          Checkbox.a(2);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var3), "ArcanistsMulti.TA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void j(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = field_G ? 1 : 0;
        try {
          u.field_k = false;
          if (param0 != 48) {
            ArcanistsMulti.h((byte) -33);
          }
          MusicPatch.field_o = null;
          if (!MusicPatchPcmStream.field_s) {
            var1_int = dd.field_j;
            if (var1_int > 0) {
              if (var1_int == 1) {
                MusicPatch.field_o = re.field_k;
              }
              if (var1_int != 1 ||
                var2 != 0) {
                MusicPatch.field_o = CachedArchiveProvider.formatTemplate(param0 ^ -80, new String[]{Integer.toString(var1_int)}, sk.field_g);
              }
              MusicPatch.field_o = GridContainer.joinText(new CharSequence[]{(CharSequence) ((Object) MusicPatch.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) IconTextSceneWidget.field_Hb)}, -93);
            }
            vf.field_k.dismiss(77);
            PatchEnvelopeSet.c(0);
            if (var2 == 0) {
              return;
            }
          }
          vf.field_k.openMenu(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1), "ArcanistsMulti.UA(" + param0 + ')');
        }
    }

    final static void a(int param0, int[] param1, SceneScrollPane param2, String param3, long param4, int param5, int param6, String param7, SceneWidget param8) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          dd.field_h = param2;
          eo.field_c = new ne(param8, param4, param3, param7, param6, param5, param1);
          if (param0 != -26335) {
            ArcanistsMulti.i((byte) 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ArcanistsMulti.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param8 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ArcanistsMulti.h((byte) -91);
          fn.releaseStatics((byte) -60);
          qa.releaseStatics((byte) 92);
          IntrusiveDeque.releaseStatics(true);
          cb.releaseStatics((byte) 44);
          ik.releaseStatics(0);
          c.releaseStatics(30);
          SceneWidgetNode.c(false);
          SceneWidget.releaseStatics(-21224);
          KeyboardInputHandler.releaseStatics(-733);
          bh.releaseStatics(-97);
          bc.releaseStatics(1);
          ci.releaseStatics(0);
          uf.releaseStatics((byte) -81);
          ud.releaseStatics(true);
          ClientException.releaseStatics((byte) -46);
          GameAppletShell.a(false);
          hn.releaseStatics(66);
          MouseInputHandler.releaseStatics(-10338);
          MouseWheelHandler.releaseStatics(1);
          SoftwareRasterizer.releaseStatics();
          ResourceArchive.releaseStatics(false);
          BitmapFont.releaseStatics();
          TextTableInitializer.a(35);
          PacketBuffer.releaseStatics(true);
          qj.releaseStatics(-13019);
          ra.releaseStatics(64);
          oj.releaseStatics(1);
          uc.releaseStatics((byte) -58);
          ck.releaseStatics((byte) 85);
          hm.releaseStatics(124);
          ub.releaseStatics(-70);
          um.releaseStatics(0);
          ad.releaseStatics(96);
          jg.releaseStatics(-25776);
          mf.releaseStatics(-1);
          md.releaseStatics((byte) 115);
          FrameClock.releaseStatics((byte) -105);
          CanvasRasterBuffer.releaseStatics(false);
          LoadingTracker.releaseStatics(-1);
          FullscreenFocusCanvas.releaseStatics(115);
          ViewportController.releaseStatics(-18033);
          SoundCache.releaseStatics((byte) 59);
          lc.c(true);
          le.f((byte) 95);
          pm.a(0);
          kf.releaseStatics((byte) -121);
          MembershipOfferScreen.releaseStatics(false);
          Js5Transport.releaseStatics(11959);
          DiskCacheWorker.releaseStatics(32336);
          Js5ArchiveManager.releaseStatics((byte) -90);
          BufferedRandomAccessFile.releaseStatics(-1);
          BufferedSocket.releaseStatics(11138);
          nf.releaseStatics(0);
          IntrusiveNode.releaseStatics((byte) -115);
          pn.releaseStatics((byte) 122);
          cc.releaseStatics((byte) 107);
          so.releaseStatics(param0);
          MidiPcmStream.releaseStatics((byte) 115);
          NodeHashTable.releaseStatics(13);
          MusicPatchNode.c(true);
          MidiFileReader.releaseMessageTable();
          MusicPatchPcmStream.b(!param0);
          AudioOutput.releaseStatics();
          MusicCrossfadeStream.releaseStatics(118);
          fo.releaseStatics(0);
          ec.releaseStatics(0);
          kj.a(true);
          lf.releaseStatics(-15);
          ArchiveIndex.releaseStatics(0);
          GzipDecoder.releaseStatics(-79);
          ArchiveProvider.releaseStatics((byte) -51);
          ml.h(false);
          qc.releaseStatics(54);
          DualLinkNode.releaseStatics(49);
          mi.g(2);
          IntrusiveDequeCursor.releaseStatics(false);
          hi.releaseStatics((byte) 60);
          IsaacRandom.releaseStatics((byte) -109);
          VorbisSample.releaseStatics();
          VorbisFloor.releaseStatics();
          SynthInstrument.releaseStatics();
          ah.releaseStatics(false);
          r.releaseStatics(8);
          oi.releaseStatics(103);
          FadingModalPanel.releaseStatics((byte) 62);
          ModalPanelStack.releaseStatics(1);
          ie.releaseStatics((byte) 25);
          LoadingProgressDialog.releaseStatics(103);
          no.releaseStatics((byte) -11);
          ed.releaseStatics(-29222);
          AccountRegistrationPanel.releaseStatics(10);
          td.releaseStatics((byte) 115);
          LoginPanel.a(-1);
          DisplayNameForm.releaseStatics((byte) 127);
          ConditionalTextValue.releaseStatics((byte) -60);
          UiTheme.releaseStatics(-60);
          fb.releaseStatics(!param0);
          pc.releaseStatics(false);
          dd.releaseStatics(-5451);
          ue.releaseStatics((byte) 62);
          g.releaseStatics(30586);
          tm.releaseStatics(-79);
          cf.releaseStatics((byte) 83);
          IconTextSceneWidget.releaseStatics(-10765);
          SceneScrollPane.releaseStatics(1);
          af.releaseStatics(93);
          SceneScrollbar.releaseStatics((byte) -120);
          ContextActionMenu.releaseStatics(0);
          hb.releaseStatics(0);
          ne.releaseStatics(-14);
          ChatInputWidget.releaseStatics((byte) 126);
          SocialListEntry.releaseStatics(param0);
          i.releaseStatics((byte) 6);
          LobbyGameEntry.releaseStatics((byte) 120);
          SpriteState.releaseStatics(122);
          we.releaseStatics(120);
          wj.a(0);
          IntrusiveNodeHashTable.releaseStatics(0);
          DualLinkDeque.releaseStatics(-92);
          mc.releaseStatics(73);
          ao.releaseStatics(0);
          sb.releaseStatics(-1);
          IndexedSpriteState.releaseStatics((byte) -109);
          bm.releaseStatics(false);
          fc.releaseStatics((byte) -71);
          nm.releaseStatics(-1);
          ph.releaseStatics((byte) -42);
          fi.releaseStatics((byte) 5);
          gj.releaseStatics(false);
          CredentialKind.releaseStatics(false);
          LoginCredentials.releaseStatics(0);
          CipherPacketBuffer.releaseStatics(21657);
          da.releaseStatics(-121);
          u.releaseStatics(1);
          vm.releaseStatics((byte) -75);
          IsaacCipher.releaseStatics(109);
          ic.releaseStatics(0);
          ge.releaseStatics(-117);
          BirthDateEntryPanel.releaseStatics((byte) 112);
          qn.releaseStatics(1);
          cj.releaseStatics(param0);
          sa.releaseStatics(26820);
          jn.releaseStatics((byte) -99);
          AudioService.releaseStatics((byte) -94);
          ReflectionCheckRequest.releaseStatics(-791);
          BoundedRandomAccessFile.releaseStatics(255);
          ff.a((byte) 46);
          CheckboxPainter.releaseStatics((byte) 36);
          StatefulTextPainter.releaseStatics((byte) -95);
          of.releaseStatics(-56);
          lh.releaseStatics(2);
          TextWidgetPainter.releaseStatics(63);
          UiComponent.releaseStatics((byte) -17);
          SingleChildContainer.releaseStatics(23123);
          TextLayout.releaseStatics(6481);
          OptionsDialog.releaseStatics(3);
          ScreenDisplayMode.releaseStatics(true);
          qo.releaseStatics(6);
          ResizableModalPanel.releaseStatics(false);
          DropdownList.releaseStatics(0);
          TextButton.releaseStatics(-125);
          GridContainer.releaseStatics(-1);
          UiContainer.releaseStatics(true);
          ArrayWidgetContainer.releaseStatics((byte) -90);
          ae.releaseStatics((byte) -125);
          qf.releaseStatics((byte) 92);
          SocketJs5Transport.releaseStatics(-1);
          Js5NetworkRequest.releaseStatics((byte) 20);
          SectorCacheStore.releaseStatics((byte) -60);
          DiskCacheRequest.releaseStatics((byte) 78);
          CachedArchiveProvider.b(107);
          jo.releaseStatics(0);
          ArchiveRequest.releaseStatics(2039583);
          b.releaseStatics(67);
          MeshRasterState.releaseStatics();
          gl.releaseStatics((byte) 15);
          vg.releaseStatics(40);
          bo.releaseStatics(120);
          he.releaseStatics(-31399);
          oa.releaseStatics((byte) 98);
          ResizableViewResizeListener.releaseStatics(0);
          FixedViewResizeListener.releaseStatics(0);
          lm.releaseStatics(-888);
          pi.releaseStatics((byte) -68);
          DelegatingCanvas.releaseStatics((byte) 87);
          eo.releaseStatics(-14449);
          IntKeyLookup.releaseStatics(8577);
          ByteStorage.a((byte) -79);
          Bzip2Decoder.releaseSharedState();
          Bzip2State.a(4);
          bb.releaseStatics((byte) -127);
          fl.releaseStatics(true);
          wh.releaseStatics((byte) -118);
          sk.releaseStatics(121);
          la.releaseStatics((byte) 49);
          hd.releaseStatics((byte) 107);
          SceneTabbedPanel.releaseStatics(12);
          kg.releaseStatics(0);
          gn.releaseStatics((byte) -122);
          oo.releaseStatics(31908);
          tk.releaseStatics(-1016755547);
          WeightedLruCache.a(0);
          SocketConnector.releaseStatics(false);
          hj.releaseStatics((byte) 111);
          NanoFrameClock.releaseStatics(-80);
          ImageProducerRasterBuffer.releaseStatics((byte) -109);
          vf.releaseStatics(27494);
          ia.releaseStatics(!param0);
          rb.releaseStatics(37);
          oe.releaseStatics(120);
          WhirlpoolHasher.releaseStatics(-6566);
          MusicPatch.releaseStatics(param0);
          PatchEnvelopeSet.releaseStatics((byte) 94);
          AudioFilter.releaseStatics();
          LabeledField.releaseStatics(2);
          ValidatedTextWidget.releaseStatics(0);
          EditableTextWidget.releaseStatics(1);
          ContentTransitionDialog.releaseStatics(0);
          om.releaseStatics((byte) -127);
          NameSuggestionsPanel.releaseStatics(1313);
          TextHotspotWidget.releaseStatics(20445);
          ValidationStatusIcon.releaseStatics((byte) -125);
          ValidationHelpWidget.releaseStatics(15428);
          Checkbox.releaseStatics(0);
          TextFieldValidator.releaseStatics((byte) -114);
          gg.releaseStatics(28);
          ng.releaseStatics(40);
          rk.releaseStatics(-116);
          wg.releaseStatics(param0);
          tn.releaseStatics((byte) -97);
          SceneTextInput.releaseStatics((byte) 77);
          fd.releaseStatics(-1);
          DateOfBirthValidator.releaseStatics((byte) -79);
          NumericDateInputWidget.releaseStatics(0);
          nj.releaseStatics((byte) -72);
          DateInputWidget.releaseStatics(42);
          ScrollContainer.releaseStatics(123);
          GrowableIntList.c(-125);
          re.releaseStatics(0);
          DraggableWidget.releaseStatics(-114);
          DropTargetWidget.f(-1764031359);
          bj.l((byte) -46);
          gf.releaseStatics((byte) -108);
          wm.releaseStatics(-5903);
          Scrollbar.releaseStatics((byte) 54);
          DirectByteStorage.releaseStatics(92);
          IterableNodeHashTable.releaseStatics(-14987);
          SecondaryNodeDeque.releaseStatics((byte) 33);
          CacheEntry.releaseStatics(63);
          aj.releaseStatics(20028);
          StrongCacheEntry.h((byte) -102);
          ProxySocketConnector.releaseStatics(-1);
          sm.a(false);
          NodeHashTableIterator.releaseStatics((byte) -120);
          SecondaryNodeDequeIterator.releaseStatics((byte) 88);
          fk.releaseStatics(-1333592895);
          nk.releaseStatics(30025);
          ce.releaseStatics(false);
          MenuButtonPainter.d(2188450);
          LinkButtonPainter.releaseStatics(-9922);
          BevelTextPainter.releaseStatics(true);
          PasswordFieldPainter.releaseStatics((byte) 25);
          ii.releaseStatics((byte) 106);
          dm.releaseStatics(true);
          IconButtonPainter.releaseStatics((byte) 99);
          rf.a(85);
          fj.releaseStatics(90);
          on.a(3);
          wa.releaseStatics((byte) -121);
          ta.releaseStatics(5);
          CameraFollowTarget.releaseStatics(-23971);
          hl.releaseStatics(-1513388336);
          fe.releaseStatics(32369);
          cm.releaseStatics(49);
          pb.releaseStatics((byte) 126);
          f.releaseStatics(-1);
          qg.releaseStatics(83);
          co.releaseStatics(-62);
          ho.releaseStatics(0);
          km.releaseStatics(400);
          am.releaseStatics(false);
          qe.releaseStatics(-100);
          MenuButtonPanel.releaseStatics((byte) 115);
          ClipState.a(-69);
          fm.releaseStatics(0);
          th.releaseStatics((byte) -113);
          LoginMethod.releaseStatics((byte) -107);
          UsernameCredentials.releaseStatics((byte) -14);
          AlternateUsernameCredentials.releaseStatics((byte) 13);
          EmailLoginCredentials.releaseStatics((byte) -104);
          ih.releaseStatics((byte) 48);
          WidgetStyleLayer.releaseStatics(202);
          TextLine.releaseStatics(0);
          va.releaseStatics(121);
          EmptyPainter.releaseStatics((byte) 49);
          BevelBoxPainter.releaseStatics((byte) -122);
          mh.releaseStatics((byte) 114);
          mb.releaseStatics(122);
          aa.releaseStatics(false);
          ko.releaseStatics(32);
          NameValidator.releaseStatics(-1);
          ui.releaseStatics(70);
          ki.releaseStatics((byte) 90);
          ja.releaseStatics(0);
          lo.releaseStatics(15672);
          mn.releaseStatics((byte) -119);
          db.releaseStatics(255);
          vl.releaseStatics((byte) -76);
          ValidationState.releaseStatics((byte) 121);
          DebouncedValidator.releaseStatics(true);
          ri.releaseStatics((byte) 76);
          this.field_q = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ArcanistsMulti.N(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean[] array$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        boolean stackIn_152_0 = false;
        boolean[] stackIn_179_0 = null;
        boolean[] stackIn_179_1 = null;
        int stackIn_179_2 = 0;
        boolean stackIn_180_3;
        int stackIn_195_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_235_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        le var5 = null;
        int var5_int = 0;
        int[][] var5_array = null;
        int var6_int = 0;
        int[][] var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        boolean[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_195_0Lifetime1;
        int var5_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        var13 = field_G ? 1 : 0;
        try {
          if (bj.g(false)) {
            param1 = true;
          }
          if (b.field_a.first(12623) != null) {
            fieldTemp$0 = DirectByteStorage.field_h + 1;
            DirectByteStorage.field_h = DirectByteStorage.field_h + 1;
            if (fieldTemp$0 == 335) {
              DirectByteStorage.field_h = 0;
              b.field_a.removeFirst(true);
            }
          }
          boolean decompiledFrameRemainder2 = true;
          if (~ii.field_c != ~ii.field_a) {
            if (ie.field_Vb != ii.field_a) {
              if (ii.field_a != ScrollContainer.field_I) {
                u.field_i = u.field_i - 1;
                decompiledFrameRemainder2 = (u.field_i == 0);
                if (decompiledFrameRemainder2) {
                  ii.field_a = ii.field_c;
                  decompiledFrameRemainder2 = (var13 != 0);
                }
              }
              if (decompiledFrameRemainder2) {
                if (!lc.a((byte) 112)) {
                  mn.field_r = cj.field_b;
                  Js5NetworkRequest.c(false);
                  if (ChatInputWidget.field_Cb) {
                    ChatInputWidget.field_Cb = false;
                    km.a(1, 10, 240, 16, mi.field_B, 320, (byte) 40, mi.field_B.field_o, false, ResizableViewResizeListener.field_h, mi.field_B.field_m + mi.field_B.field_o, ArchiveRequest.field_t);
                  }
                  if (pi.field_c) {
                    pi.field_c = false;
                    gj.a(false, true, -4, mn.field_r);
                  }
                  if (SceneTabbedPanel.isNonNegative(mn.field_r, 10)) {
                    lf.switchToRequestedScreen((byte) 80);
                  }
                }
                ii.field_a = ub.field_h;
                decompiledFrameRemainder2 = (var13 != 0);
              }
            }
            if (decompiledFrameRemainder2) {
              u.field_i = u.field_i + 1;
              decompiledFrameRemainder2 = (u.field_i == 16);
              if (decompiledFrameRemainder2) {
                if (!ChatInputWidget.field_Cb) {
                  IntrusiveDeque.a((byte) 4);
                  if (var13 != 0) {
                    am.a(3020);
                  }
                } else {
                  am.a(3020);
                }
                ii.field_a = ScrollContainer.field_I;
                decompiledFrameRemainder2 = (var13 != 0);
              }
            }
          }
          if (decompiledFrameRemainder2) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder1 = true;
            var3_int = 0;
            var4 = 0;
            if (!param1) {
              if (~CheckboxPainter.field_g != ~mn.field_r) {
                km.field_c = km.field_c + 1;
                decompiledFrameRemainder1 = (km.field_c == 32);
                if (decompiledFrameRemainder1) {
                  lf.switchToRequestedScreen((byte) 80);
                  decompiledFrameRemainder1 = (var13 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                var5 = SpriteState.field_z;
                if (null == var5) {
                  var5 = r.field_b;
                }
                if (-1 != CheckboxPainter.field_g) {
                  if (14 != CheckboxPainter.field_g &&
                    CheckboxPainter.field_g != 2 &&
                    CheckboxPainter.field_g != 4) {
                    if ((CheckboxPainter.field_g != -2) &&
                      (decompiledFrameRemainder1 = !(!SceneTabbedPanel.isNonNegative(CheckboxPainter.field_g, param0 ^ -83)))) {
                      ArchiveProvider.field_f[CheckboxPainter.field_g].b(91);
                      decompiledFrameRemainder1 = (var13 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      var3_int = 1;
                      decompiledFrameRemainder1 = (var13 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    if (!var5.field_ab) {
                      var5.a(true, false);
                    }
                    ArchiveProvider.field_f[CheckboxPainter.field_g].b(param0 ^ -2);
                    decompiledFrameRemainder1 = (var13 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (wa.field_Ob) {
                    var4 = 1;
                    var3_int = 1;
                    decompiledFrameRemainder1 = (var13 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (!var5.field_ab) {
                      var5.a(true, true);
                    }
                    while (BevelTextPainter.pollKeyEvent(false)) {
                      var5.k(1);
                      if (var13 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                  }
                }
              }
            }
            if ((decompiledFrameCompleted0) && (wa.field_Ob &&
              !TextLayout.field_b &&
              !IntrusiveDequeCursor.field_g)) {
              var5_int = var4;
              if (hi.field_a &&
                SocketJs5Transport.field_r) {
                var3_int = 0;
                var4 = 0;
              }
              ae.a(var3_int != 0, 13);
              if (StatefulTextPainter.field_w) {
                r.field_b.a(true, var4 != 0);
              }
              if (hi.field_a &&
                null != SpriteState.field_z) {
                StrongCacheEntry.a((byte) -66, 320, 180, var5_int != 0);
                SpriteState.field_z.a(true, var4 != 0);
              }
              while (true) {
                if (BevelTextPainter.pollKeyEvent(false)) {
                  stackIn_152_0 = ao.field_d;
                  if (var13 == 0) {
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_152_0) {
                      if ((hi.field_a) &&
                        (decompiledFrameRemainder0 = !(!DualLinkDeque.a(12, 27, 15, 13)))) {
                        SpriteState.field_z.field_O = true;
                        continue;
                      }
                      if (decompiledFrameRemainder0) {
                        ContextActionMenu.a(15, 12, (byte) 32, 13);
                      }
                    }
                    if (StatefulTextPainter.field_w) {
                      r.field_b.k(1);
                    }
                    if (!hi.field_a) {
                      continue;
                    }
                    SpriteState.field_z.k(param0 ^ -90);
                    continue;
                  }
                } else {
                  stackIn_152_0 = ao.field_d;
                }
                if (stackIn_152_0) {
                  break;
                }
                SocketJs5Transport.field_r = false;
                break;
              }
            }
            if (!wa.field_Ob) {
              lf.b(-4);
            }
            if (!ao.field_d) {
              if (!(FixedViewResizeListener.field_b <= 0)) {
                FixedViewResizeListener.field_b = FixedViewResizeListener.field_b - 1;
                if ((var13 != 0) &&
                  (FixedViewResizeListener.field_b < DiskCacheRequest.field_F)) {
                  FixedViewResizeListener.field_b = FixedViewResizeListener.field_b + 1;
                }
              }
            } else {
              if (FixedViewResizeListener.field_b < DiskCacheRequest.field_F) {
                FixedViewResizeListener.field_b = FixedViewResizeListener.field_b + 1;
              }
            }
            var5_intLifetime1 = DiskCacheRequest.field_F * DiskCacheRequest.field_F;
            var6_int = -(FixedViewResizeListener.field_b * FixedViewResizeListener.field_b) + var5_intLifetime1;
            var7_int = EmailLoginCredentials.field_j - 120 + 120 * var6_int / var5_intLifetime1;
            LoadingTracker.a(var7_int, -30218);
          }
          if (mn.field_r == -3) {
            var3 = ah.field_b;
            if (var3 == null) {
              var3 = BufferedSocket.field_p;
            }
            var4_ref_String__ = new String[]{var3, ImageProducerRasterBuffer.field_n, rf.field_l, TextTableInitializer.field_c};
            var5_array = new int[6][18];
            var6 = new int[6][16];
            var7 = new int[]{ad.field_d, 0, 0, 0, 0, 0};
            array$1 = new boolean[6];
            stackIn_179_0 = array$1;
            stackIn_179_1 = array$1;
            stackIn_179_2 = 0;
            stackIn_180_3 = !(qf.field_d < 2);
            stackIn_179_1[stackIn_179_2] = stackIn_180_3;
            stackIn_179_0[1] = false;
            stackIn_179_0[2] = false;
            stackIn_179_0[3] = false;
            stackIn_179_0[4] = false;
            stackIn_179_0[5] = false;
            var8 = stackIn_179_0;
            var9 = 0;
            scanLoop1: while (true) {
              if (var9 < 6) {
                var10 = 0;
                stackIn_212_0 = 0;
                if (var13 != 0) {
                  break scanLoop1;
                }
                var11 = stackIn_212_0;
                while (var11 < 4) {
                  stackIn_195_0 = 0;
                  var12 = stackIn_195_0;
                  while (var12 < 3) {
                    incrementValue$2 = var10;
                    var10++;
                    var5_array[var9][incrementValue$2] = kg.field_d[var11][var12];
                    var12++;
                  }
                  var11++;
                }
                stackIn_195_0Lifetime1 = 0;
                var11Lifetime1 = stackIn_195_0Lifetime1;
                while (var11Lifetime1 < 6) {
                  incrementValue$3 = var10;
                  var10++;
                  var5_array[var9][incrementValue$3] = so.field_c[var11Lifetime1];
                  var11Lifetime1++;
                }
                var11Lifetime2 = 0;
                while (var11Lifetime2 < 16) {
                  var6[var9][var11Lifetime2] = b.field_f[var11Lifetime2];
                  var11Lifetime2++;
                }
                var9++;
                continue;
              }
              SpriteState.field_z = new le(false, 0, 3, false, var4_ref_String__, 0, var5_array, var6, var7, 0, 0, false, 0, var8);
              gj.a(ta.field_d, true, 14, -1);
              stackIn_212_0 = 1;
              break;
            }
            MusicCrossfadeStream.field_A = stackIn_212_0 != 0;
          }
          if (param0 != -89) {
            ArcanistsMulti.h((byte) 78);
          }
          if (-4 == mn.field_r) {
            if (DelegatingCanvas.field_c[0] == f.field_g) {
              mi.a(DelegatingCanvas.field_c[0], param0 + 92);
            }
            he.field_e.writeOpcode((byte) -59, 64);
            var3_int = 0;
            scanLoop2: while (true) {
              if (var3_int < 4) {
                stackIn_235_0 = 0;
                if (var13 != 0) {
                  break scanLoop2;
                }
                var4 = stackIn_235_0;
                while (var4 < 3) {
                  he.field_e.writeByte(kg.field_d[var3_int][var4], (byte) -60);
                  var4++;
                }
                var3_int++;
                continue;
              }
              stackIn_235_0 = 0;
              break;
            }
            var3_int = stackIn_235_0;
            do {
              if (var3_int >= 6) {
                var3_int = 0;
                break;
              }
              he.field_e.writeByte(so.field_c[var3_int], (byte) -81);
              var3_int++;
            } while (var13 == 0);
            do {
              if (var3_int >= 16) {
                he.field_e.writeOpcode((byte) -127, 9);
                mn.field_r = CheckboxPainter.field_g;
                break;
              }
              he.field_e.writeByte(b.field_f[var3_int], (byte) -47);
              var3_int++;
            } while (var13 == 0);
            TextLayout.field_b = true;
          }
          if (mn.field_r == -5) {
            qc.a(false, DirectByteStorage.field_f.getSortKey((byte) 72), 11);
            IntrusiveDequeCursor.field_g = true;
            mn.field_r = CheckboxPainter.field_g;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var3_ref), "ArcanistsMulti.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final void initializeClient(byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        MidiPcmStream var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_G ? 1 : 0;
        try {
          this.a(true, 14, 19, 0, 5000, 9, 11, 8);
          ri.field_f = false;
          SecondaryNodeDeque.a((byte) -9);
          la.field_a = false;
          nm.field_h = -1;
          NodeHashTableIterator.field_j = 0;
          GridContainer.field_P = 0;
          kg.field_a = false;
          cb.field_e = 0L;
          ta.field_b = false;
          var2 = new MidiPcmStream();
          var2.b(128, 68, 9);
          UsernameCredentials.a(22050, var2, fi.field_d, (java.awt.Component) ((Object) on.field_c), -22836, true);
          pn.field_d = 16728128;
          wm.field_I = 16777215;
          LoginMethod.field_a = 0;
          this.a(false, true, false, true, true, (byte) -128, false);
          NodeHashTable.field_n[69] = 1;
          NodeHashTable.field_n[63] = 16;
          NodeHashTable.field_n[60] = 1;
          NodeHashTable.field_n[61] = 0;
          kg.field_d[0] = AlternateUsernameCredentials.field_n[0];
          NodeHashTable.field_n[62] = 2;
          NodeHashTable.field_n[57] = -2;
          NodeHashTable.field_n[70] = 1;
          NodeHashTable.field_n[79] = 2;
          NodeHashTable.field_n[66] = 4;
          NodeHashTable.field_n[77] = 0;
          NodeHashTable.field_n[64] = 0;
          NodeHashTable.field_n[65] = 1;
          NodeHashTable.field_n[68] = 1;
          NodeHashTable.field_n[71] = 1;
          NodeHashTable.field_n[73] = -1;
          NodeHashTable.field_n[78] = 4;
          NodeHashTable.field_n[67] = 2;
          NodeHashTable.field_n[74] = 11;
          NodeHashTable.field_n[58] = -2;
          he.field_a = new int[256];
          cj.field_g = new int[256];
          kg.field_d[3] = hi.field_b[0];
          kg.field_d[2] = IsaacCipher.field_d[0];
          var3 = -120 % ((-68 - obfuscationGuard) / 33);
          kg.field_d[1] = ud.field_z[0];
          var4 = 0;
          while (256 > var4) {
            he.field_a[var4] = (var4 << 16) + var4;
            cj.field_g[var4] = (var4 << 16) - (-(var4 / 2 << 8) - var4 / 4);
            var4++;
            if (var5 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ArcanistsMulti.E(" + obfuscationGuard + ')');
        }
    }

    public final void init() {
        try {
          this.a(EmailLoginCredentials.field_f, "arcanistsmulti", EmailLoginCredentials.field_j, (byte) -92, 15);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ArcanistsMulti.init()");
        }
    }

    final void updateClient(byte obfuscationGuard) {
        Object stackIn_5_0 = null;
        int stackIn_67_0 = 0;
        boolean stackIn_125_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        qa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Sprite var15 = null;
        SceneWidget var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var12Lifetime1;
        int var4Lifetime3;
        int var5Lifetime2;
        var20 = field_G ? 1 : 0;
        try {
          if (null == ProxySocketConnector.field_m) {
            stackIn_5_0 = on.field_c;
          } else {
            stackIn_5_0 = ProxySocketConnector.field_m;
          }
          var2 = stackIn_5_0;
          ce.field_m.a(true);
          if (obfuscationGuard != -89) {
            ArcanistsMulti.a(66, (int[]) null, (SceneScrollPane) null, (String) null, 78L, -15, 110, (String) null, (SceneWidget) null);
          }
          if (IntrusiveDequeCursor.a(-15576)) {
            TextLayout.a((byte) 14, (java.awt.Canvas) (var2), MusicPatchPcmStream.c(0));
            return;
          }
          if (!ue.field_e) {
            ResourceArchive.presentFrame((java.awt.Canvas) (var2), (byte) -29);
            return;
          }
          if (!hn.a((byte) 87)) {
            rb.a(MenuButtonPainter.field_t, false, 100.0f);
            ResourceArchive.presentFrame((java.awt.Canvas) (var2), (byte) -62);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          this.m(obfuscationGuard + 15522);
          if (mn.field_r != CheckboxPainter.field_g) {
            if (-2 != CheckboxPainter.field_g &&
              mn.field_r != -2) {
              if (16 > km.field_c) {
                KeyboardInputHandler.a(-2, false, CheckboxPainter.field_g, cb.field_b);
                tn.field_Fb = 256 * km.field_c / 16;
                SoftwareRasterizer.fillRectangleAlpha(0, 0, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j, 0, tn.field_Fb / 2);
                gn.a(256, (byte) 108, tn.field_Fb / 2, 0, pm.field_c);
                gn.a(256, (byte) 97, tn.field_Fb / 2, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j - pm.field_c);
                decompiledFrameRemainder0 = (var20 != 0);
              }
              if (decompiledFrameRemainder0) {
                KeyboardInputHandler.a(-2, false, mn.field_r, MusicCrossfadeStream.field_A);
                tn.field_Fb = (-(km.field_c * 256) + 8192) / 16;
                gn.a(256, (byte) 86, tn.field_Fb, 0, pm.field_c);
                gn.a(256, (byte) 78, tn.field_Fb, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j - pm.field_c);
                gn.a(256, (byte) 97, tn.field_Fb, EmailLoginCredentials.field_f / 2, EmailLoginCredentials.field_j / 2);
                decompiledFrameRemainder0 = (var20 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (16 <= km.field_c) {
                KeyboardInputHandler.a(-2, false, mn.field_r, MusicCrossfadeStream.field_A);
                tn.field_Fb = (8192 - 256 * km.field_c) / 16;
                SoftwareRasterizer.fillRectangleAlpha(0, 0, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j, 0, tn.field_Fb);
                if (var20 != 0) {
                  KeyboardInputHandler.a(-2, false, CheckboxPainter.field_g, cb.field_b);
                  tn.field_Fb = km.field_c * 256 / 16;
                  SoftwareRasterizer.fillRectangleAlpha(0, 0, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j, 0, tn.field_Fb);
                  KeyboardInputHandler.a(-2, true, CheckboxPainter.field_g, cb.field_b);
                }
              } else {
                KeyboardInputHandler.a(-2, false, CheckboxPainter.field_g, cb.field_b);
                tn.field_Fb = km.field_c * 256 / 16;
                SoftwareRasterizer.fillRectangleAlpha(0, 0, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j, 0, tn.field_Fb);
                if (var20 != 0) {
                  KeyboardInputHandler.a(-2, true, CheckboxPainter.field_g, cb.field_b);
                }
              }
            }
          } else {
            KeyboardInputHandler.a(-2, true, CheckboxPainter.field_g, cb.field_b);
          }
          if (-2 != CheckboxPainter.field_g &&
            -2 != mn.field_r) {
            NameSuggestionsPanel.drawFrameDecorations((byte) 99);
          }
          if (!cb.field_b ||
            !MusicCrossfadeStream.field_A) {
            var3_int = DiskCacheRequest.field_F * DiskCacheRequest.field_F;
            var4 = -(FixedViewResizeListener.field_b * FixedViewResizeListener.field_b) + var3_int;
            var5 = -120 + (EmailLoginCredentials.field_j + 120 * var4 / var3_int);
            LoadingTracker.a(var5, -30218);
            SceneWidgetNode.a(gj.a(29372), (byte) 119);
            if (CheckboxPainter.field_g == -2) {
              var3_intLifetime1 = (int)(Math.sin((double)SpriteState.field_v * 0.2) * 8.0);
              var4Lifetime3 = -(int)(Math.cos((double)SpriteState.field_v * 0.2) * 5.0);
              if (var4Lifetime3 > 0) {
                var4Lifetime3 = 0;
              }
              var5Lifetime2 = -var3_intLifetime1;
              var6 = (int)(Math.cos(0.2 * (double)SpriteState.field_v) * 5.0);
              if (var6 > 0) {
                var6 = 0;
              }
              var7 = (int)(Math.sin((double)SpriteState.field_v * 0.1) * 8.0) + 16;
              var8 = 0;
              var9 = -(int)(8.0 * Math.sin(-0.1 + (double)SpriteState.field_v * 0.1)) - 16;
              var10 = 0;
              var11 = (SpriteState.field_v >> 9) % 24;
              var12 = 32;
              var13 = 160;
              stackIn_67_0 = (so.field_c[5] + so.field_c[2] + (so.field_c[0] + so.field_c[1]) - (-so.field_c[3] - so.field_c[4]) != 0) ? 0 : 1;
              boolean decompiledFrameRemainder1 = true;
              var14 = stackIn_67_0;
              if (((SpriteState.field_v & 1024) > 0) &&
                (decompiledFrameRemainder1 = !((1023 & -SpriteState.field_v + 1024) < 512)) &&
                (decompiledFrameRemainder1 = (var14 != 0))) {
                var10 = 0;
                var6 = 0;
                var11 = (SpriteState.field_v >> 3) % 2;
                var3_intLifetime1 = 0;
                var5Lifetime2 = 0;
                var8 = 0;
                var9 = -16;
                var4Lifetime3 = 0;
                var7 = 16;
                decompiledFrameRemainder1 = (var20 != 0);
              }
              if ((decompiledFrameRemainder1) && ((1023 & SpriteState.field_v) >= 512 &&
                var14 != 0)) {
                var3_intLifetime1 = 0;
                var10 = 0;
                var9 = -16;
                var5Lifetime2 = 0;
                var11 = (SpriteState.field_v >> 3) % 2;
                var4Lifetime3 = 0;
                var7 = 16;
                var6 = 0;
                var8 = 0;
              }
              var15 = new Sprite(128, 256);
              var15.makeRasterTarget();
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var8 + var13, kg.field_d[3], kg.field_d[0], 116, kg.field_d[1], qe.field_i[so.field_c[3]], var12 + var7);
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13 + var4Lifetime3, kg.field_d[3], kg.field_d[0], -87, kg.field_d[1], fn.field_b[0], var3_intLifetime1 + var12);
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], 80, kg.field_d[1], IsaacRandom.field_j[so.field_c[0]], var12);
              var13 -= 8;
              var13 -= 16;
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], -87, kg.field_d[1], SceneWidget.field_kb[so.field_c[1]], var12);
              var13 += 16;
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], -90, kg.field_d[1], hn.field_d[so.field_c[5]], var12);
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], -117, kg.field_d[1], bo.field_a[var11], var12);
              var13 -= 16;
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], -127, kg.field_d[1], CachedArchiveProvider.field_A[so.field_c[4]], var12);
              var13 += 8;
              var13 += 16;
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var6 + var13, kg.field_d[3], kg.field_d[0], -113, kg.field_d[1], ModalPanelStack.field_I[0], var12 + var5Lifetime2);
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var10 + var13, kg.field_d[3], kg.field_d[0], 122, kg.field_d[1], DiskCacheRequest.field_u[so.field_c[2]], var9 + var12);
              ce.field_m.a(true);
              var16 = db.a(false);
              if (null != var16) {
                var17 = var16.field_V - 202;
                SoftwareRasterizer.setClip(4 + var16.field_V, var16.field_nb + 4, -4 + (var16.field_x + var16.field_V), var16.field_nb + (var16.field_I - 4));
                var18 = -480 + EmailLoginCredentials.field_j;
                if (qf.field_d < 2) {
                  var19 = var18 + 87;
                  if (0 >= (1024 & SpriteState.field_v)) {
                    var12Lifetime1 = 1023 & SpriteState.field_v;
                    if (512 > var12Lifetime1 ||
                      var14 == 0) {
                      var15.drawTransparent(var12Lifetime1 + var17, var19);
                    }
                    if (!(512 > var12Lifetime1) &&
                      var14 != 0 || var20 != 0) {
                      var12Lifetime1 = 512;
                      SoftwareRasterizer.fillRectangleAlpha(-4 + (-300 + var12Lifetime1) + var17, 78 + var13 + var18, 308, 64, 0, 192);
                      mi.field_B.drawParagraph(MusicCrossfadeStream.field_x, var17 + (-300 + var12Lifetime1), var13 + (80 + var18), 300, 64, 16777215, -1, 1, 1, mi.field_B.field_C);
                      var15.drawHorizontalFlip(var12Lifetime1 + var17, var19);
                      if (var20 != 0) {
                        var12Lifetime1 = -(1023 & SpriteState.field_v) + 1024;
                        if (var12Lifetime1 >= 512 &&
                          var14 != 0) {
                          var12Lifetime1 = 512;
                          SoftwareRasterizer.fillRectangleAlpha(var17 + var12Lifetime1 - 300 - 4, var18 + 78 + var13, 308, 64, 0, 192);
                          mi.field_B.drawParagraph(MusicCrossfadeStream.field_x, var17 + var12Lifetime1 - 300, var18 + (var13 + 80), 300, 64, 16777215, -1, 1, 1, mi.field_B.field_C);
                        }
                        var15.drawHorizontalFlip(var17 + var12Lifetime1, var19);
                      }
                    }} else {
                    var12Lifetime1 = -(1023 & SpriteState.field_v) + 1024;
                    if (var12Lifetime1 >= 512 &&
                      var14 != 0) {
                      var12Lifetime1 = 512;
                      SoftwareRasterizer.fillRectangleAlpha(var17 + var12Lifetime1 - 300 - 4, var18 + 78 + var13, 308, 64, 0, 192);
                      mi.field_B.drawParagraph(MusicCrossfadeStream.field_x, var17 + var12Lifetime1 - 300, var18 + (var13 + 80), 300, 64, 16777215, -1, 1, 1, mi.field_B.field_C);
                    }
                    var15.drawHorizontalFlip(var17 + var12Lifetime1, var19);
                  }
                  if (var20 != 0) {
                    var12Lifetime1 = 512;
                    SoftwareRasterizer.fillRectangleAlpha(var12Lifetime1 - (300 - var17), 78 + var13 + 20 + var18, 424, 64, 0, 128);
                    var19 = 16737792;
                    if ((SpriteState.field_v & 64) > 0) {
                      var19 = 16777215;
                    }
                    mi.field_B.drawParagraph("If you are playing with super mod powers, remember that the 'Mark of Fame' achievement is meant to be a CHALLENGE. Do not create games of over 3 players if you are not competent at the game. Never play with more than 4 players as you CANNOT win! Kill Seas and Nature players at ALL costs. Most of all, good luck!", -300 + var12Lifetime1 + var17, 91 + var13 + var18, 424, 64, var19, -1, 1, 1, -2 + mi.field_B.field_C);
                  }
                } else {
                  var12Lifetime1 = 512;
                  SoftwareRasterizer.fillRectangleAlpha(var12Lifetime1 - (300 - var17), 78 + var13 + 20 + var18, 424, 64, 0, 128);
                  var19 = 16737792;
                  if ((SpriteState.field_v & 64) > 0) {
                    var19 = 16777215;
                  }
                  mi.field_B.drawParagraph("If you are playing with super mod powers, remember that the 'Mark of Fame' achievement is meant to be a CHALLENGE. Do not create games of over 3 players if you are not competent at the game. Never play with more than 4 players as you CANNOT win! Kill Seas and Nature players at ALL costs. Most of all, good luck!", -300 + var12Lifetime1 + var17, 91 + var13 + var18, 424, 64, var19, -1, 1, 1, -2 + mi.field_B.field_C);
                }
              }
              SoftwareRasterizer.resetClip();
            }
            ClipState.a(gj.a(29372), 115);
            le.c(1, gj.a(29372));
          }
          var3 = (qa) (b.field_a.first(12623));
          if (var3 != null) {
            var5Lifetime1 = DirectByteStorage.field_h;
            if (80 <= var5Lifetime1) {
              if (230 <= var5Lifetime1) {
                var4Lifetime1 = -(var5Lifetime1 / 2) + 123;
                if (var20 != 0) {
                  var4Lifetime1 = 8;
                  var4Lifetime1 = -32 + var5Lifetime1 / 2;
                }
              } else {
                var4Lifetime1 = 8;
                if (var20 != 0) {
                  var4Lifetime1 = -32 + var5Lifetime1 / 2;
                }
              }
            } else {
              var4Lifetime1 = -32 + var5Lifetime1 / 2;
            }
            SoftwareRasterizer.drawRectangle(4, -4 + var4Lifetime1, CachedArchiveProvider.field_t.textWidth(rb.field_n[var3.field_n]) + 56, 40, 0);
            SoftwareRasterizer.drawRectangle(5, var4Lifetime1 - 3, 54 + CachedArchiveProvider.field_t.textWidth(rb.field_n[var3.field_n]), 38, 16741888);
            SoftwareRasterizer.drawRectangle(6, var4Lifetime1 - 2, CachedArchiveProvider.field_t.textWidth(rb.field_n[var3.field_n]) + 52, 36, 0);
            IntrusiveNodeHashTable.field_a[var3.field_n].drawScaled(8, var4Lifetime1, 32, 32);
            CachedArchiveProvider.field_t.drawText(rb.field_n[var3.field_n], 47, CachedArchiveProvider.field_t.field_C + var4Lifetime1, 0, 0);
            CachedArchiveProvider.field_t.drawText(rb.field_n[var3.field_n], 48, -1 + (var4Lifetime1 + CachedArchiveProvider.field_t.field_C), 0, 0);
            CachedArchiveProvider.field_t.drawText(rb.field_n[var3.field_n], 48, CachedArchiveProvider.field_t.field_C + var4Lifetime1, 16746496, -1);
          }
          boolean decompiledSharedTail0 = !(LoadingTracker.b(obfuscationGuard ^ 88));
          if (!decompiledSharedTail0) {
            if (null != ProxySocketConnector.field_m) {
              stackIn_125_0 = true;
            } else {
              stackIn_125_0 = ie.field_Pb;
            }
            LabeledField.a(stackIn_125_0, 4474111);
            decompiledSharedTail0 = (var20 != 0);
          }
          if ((decompiledSharedTail0) &&
            (um.a((byte) -5))) {
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_e, SoftwareRasterizer.field_j);
            EmptyPainter.setFrameSprites(kf.field_b, kf.field_b[0].field_y, -117, kf.field_b[0].field_q);
          }
          if (ii.field_c != ii.field_a) {
            var4Lifetime2 = u.field_i * 256 / 16;
            if (var4Lifetime2 > 0) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_e, SoftwareRasterizer.field_j, 0, var4Lifetime2);
            }
          }
          Scrollbar.i(91);
          OptionsDialog.paintCanvasNow((java.awt.Canvas) (var2), (byte) -126, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2_ref), "ArcanistsMulti.L(" + obfuscationGuard + ')');
        }
    }

    final static void a(ResourceArchive param0, byte param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        var7 = field_G ? 1 : 0;
        try {
          var2 = new CipherPacketBuffer(param0.getNamedFile("", "logo.fo3d", -1));
          var3 = var2.readUnsignedByte((byte) -121);
          var2.beginBitAccess(param1 + 166);
          ph.field_e = Scrollbar.a((byte) -101, var2);
          gn.field_g = new int[var3][];
          oo.field_u = new vg[var3];
          var4 = 0;
          do {
            if (var3 <= var4) {
              var2.endBitAccess(param1 + 80);
              break;
            }
            oo.field_u[var4] = EditableTextWidget.a(true, var2);
            var4++;
          } while (var7 == 0);
          var4 = 0;
          while (var3 > var4) {
            var5 = oo.field_u[var4];
            var5.a(6, 0, 1, 6, 6);
            var5.b((byte) 62);
            var6 = new int[]{var5.field_k + var5.field_i >> 1, var5.field_v + var5.field_R >> 1, var5.field_N + var5.field_P >> 1};
            gn.field_g[var4] = var6;
            var5.a(-var6[1], (byte) -124, -var6[2], -var6[0]);
            var4++;
            if (var7 != 0) {
              return;
            }
          }
          if (param1 != -80) {
            field_H = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ArcanistsMulti.WA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public ArcanistsMulti() {
    }

    final static void a(int param0, byte param1) {
        try {
          int var2_int = 84 % ((param1 - 57) / 54);
          gl.drawNineSliceFrame(28 + ValidationHelpWidget.field_U[param0] * NumericDateInputWidget.field_L[param0].length, -8 + lm.field_e[param0], -27327, 14 - (-eo.field_b[param0] + lm.field_e[param0]), kf.field_b, DualLinkDeque.field_f[param0] - 16);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ArcanistsMulti.OA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void h(byte param0) {
        try {
          field_H = null;
          field_F = null;
          if (param0 != -91) {
            ArcanistsMulti.j((byte) 24);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ArcanistsMulti.MA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_G ? 1 : 0;
        try {
          if (param0 != 15433) {
            field_F = (String) null;
          }
          if (0 == jo.field_c) {
            pi.field_e = DebouncedValidator.field_a;
            if (null == DelegatingCanvas.field_c[0] &&
              PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_titlescreen", "")) {
              DelegatingCanvas.field_c[0] = MusicTrack.a(PasswordFieldPainter.field_x, "", "arcanists_titlescreen");
              jo.field_c = 1;
              GrowableIntList.field_h.a(0, lo.field_w, ki.field_s, DelegatingCanvas.field_c[0], -123);
              mi.a(DelegatingCanvas.field_c[0], 3);
            }
            return;
          }
          if (SingleChildContainer.field_C < 52) {
            if (SingleChildContainer.field_C != 0 ||
              !ue.field_d.isNamedFileAvailable(true, "imp", "streamed")) {
              if (SingleChildContainer.field_C == 1 &&
                ue.field_d.isNamedFileAvailable(true, "arcaneexplosion", "streamed")) {
                BirthDateEntryPanel.field_N = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "arcaneexplosion", ue.field_d);
                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                if (var3 == 0) {
                  return;
                }
              }
              if (SingleChildContainer.field_C == 2 &&
                ue.field_d.isNamedFileAvailable(true, "flameexplosion", "streamed")) {
                DisplayNameForm.field_E = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "flameexplosion", ue.field_d);
                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                if (var3 == 0) {
                  return;
                }
              }
              if (SingleChildContainer.field_C != 3 ||
                !ue.field_d.isNamedFileAvailable(true, "smokeexplosion", "streamed")) {
                if (SingleChildContainer.field_C == 4 &&
                  ue.field_d.isNamedFileAvailable(true, "flamepuff", "streamed")) {
                  DebouncedValidator.field_b = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "flamepuff", ue.field_d);
                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                  if (var3 == 0) {
                    return;
                  }
                }
                if (SingleChildContainer.field_C == 5 &&
                  ue.field_d.isNamedFileAvailable(true, "smokepuff", "streamed")) {
                  FadingModalPanel.field_M = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "smokepuff", ue.field_d);
                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                  if (var3 == 0) {
                    return;
                  }
                }
                if (SingleChildContainer.field_C != 6 ||
                  !ue.field_d.isNamedFileAvailable(true, "stormpuff", "streamed")) {
                  if (SingleChildContainer.field_C == 7 &&
                    ue.field_d.isNamedFileAvailable(true, "stormexplosion", "streamed")) {
                    u.field_j = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "stormexplosion", ue.field_d);
                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  if (SingleChildContainer.field_C == 8 &&
                    ue.field_d.isNamedFileAvailable(true, "cyclopstest", "streamed")) {
                    SecondaryNodeDeque.field_c = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "cyclopstest", ue.field_d);
                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  if (SingleChildContainer.field_C != 9 ||
                    !ue.field_d.isNamedFileAvailable(true, "sylph", "streamed")) {
                    if (SingleChildContainer.field_C == 10 &&
                      ue.field_d.isNamedFileAvailable(true, "frostgiant", "streamed")) {
                      DiskCacheRequest.field_v = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "frostgiant", ue.field_d);
                      SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                      pi.field_e = vm.field_f;
                      if (var3 == 0) {
                        return;
                      }
                    }
                    if (SingleChildContainer.field_C != 11 ||
                      !ue.field_d.isNamedFileAvailable(true, "dwarf", "streamed")) {
                      if (12 != SingleChildContainer.field_C ||
                        !ue.field_d.isNamedFileAvailable(true, "clockworkrecallsoldier", "streamed")) {
                        if (SingleChildContainer.field_C != 13 ||
                          !ue.field_d.isNamedFileAvailable(true, "golem", "streamed")) {
                          if (SingleChildContainer.field_C != 14 ||
                            !ue.field_d.isNamedFileAvailable(true, "flamedragon", "streamed")) {
                            if (15 != SingleChildContainer.field_C ||
                              !ue.field_d.isNamedFileAvailable(true, "frostdragon", "streamed")) {
                              if (SingleChildContainer.field_C == 16 &&
                                ue.field_d.isNamedFileAvailable(true, "stormdragon", "streamed")) {
                                ArchiveIndex.field_m = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "stormdragon", ue.field_d);
                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              if (SingleChildContainer.field_C != 17 ||
                                !ue.field_d.isNamedFileAvailable(true, "zombiedragon", "streamed")) {
                                if (SingleChildContainer.field_C == 18 &&
                                  ue.field_d.isNamedFileAvailable(true, "clockworkdragon", "streamed")) {
                                  ub.field_e = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "clockworkdragon", ue.field_d);
                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                if (SingleChildContainer.field_C != 19 ||
                                  !ue.field_d.isNamedFileAvailable(true, "brinegoblin", "streamed")) {
                                  if (20 != SingleChildContainer.field_C ||
                                    !ue.field_d.isNamedFileAvailable(true, "ent", "streamed")) {
                                    if (SingleChildContainer.field_C != 21 ||
                                      !ue.field_d.isNamedFileAvailable(true, "elf", "streamed")) {
                                      if (SingleChildContainer.field_C != 22 ||
                                        !ue.field_d.isNamedFileAvailable(true, "monkey", "streamed")) {
                                        if (SingleChildContainer.field_C != 23 ||
                                          !ue.field_d.isNamedFileAvailable(true, "darkknight", "streamed")) {
                                          if (SingleChildContainer.field_C == 24 &&
                                            ue.field_d.isNamedFileAvailable(true, "wraith", "streamed")) {
                                            pm.field_d = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "wraith", ue.field_d);
                                            SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                            if (var3 == 0) {
                                              return;
                                            }
                                          }
                                          if (SingleChildContainer.field_C != 25 ||
                                            !ue.field_d.isNamedFileAvailable(true, "swarm", "streamed")) {
                                            if (26 != SingleChildContainer.field_C ||
                                              !ue.field_d.isNamedFileAvailable(true, "pixies", "streamed")) {
                                              if (27 == SingleChildContainer.field_C &&
                                                ue.field_d.isNamedFileAvailable(true, "paladin", "streamed")) {
                                                qj.field_d = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "paladin", ue.field_d);
                                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                if (var3 == 0) {
                                                  return;
                                                }
                                              }
                                              if (SingleChildContainer.field_C != 28 ||
                                                !ue.field_d.isNamedFileAvailable(true, "pegasus", "streamed")) {
                                                if (29 == SingleChildContainer.field_C &&
                                                  ue.field_d.isNamedFileAvailable(true, "phoenix", "streamed")) {
                                                  SoundCache.field_m = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "phoenix", ue.field_d);
                                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                  if (var3 == 0) {
                                                    return;
                                                  }
                                                }
                                                if (SingleChildContainer.field_C != 30 ||
                                                  !ue.field_d.isNamedFileAvailable(true, "watertroll", "streamed")) {
                                                  if (SingleChildContainer.field_C == 31 &&
                                                    ue.field_d.isNamedFileAvailable(true, "freshwatertroll", "streamed")) {
                                                    c.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "freshwatertroll", ue.field_d);
                                                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                    if (var3 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  if (SingleChildContainer.field_C == 32 &&
                                                    ue.field_d.isNamedFileAvailable(true, "hardwatertroll", "streamed")) {
                                                    vm.field_g = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "hardwatertroll", ue.field_d);
                                                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                    if (var3 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  if (SingleChildContainer.field_C != 33 ||
                                                    !ue.field_d.isNamedFileAvailable(true, "waterlord", "streamed")) {
                                                    if (SingleChildContainer.field_C != 34 ||
                                                      !ue.field_d.isNamedFileAvailable(true, "flameshield", "streamed")) {
                                                      if (SingleChildContainer.field_C != 35 ||
                                                        !ue.field_d.isNamedFileAvailable(true, "clockworkexplosion", "streamed")) {
                                                        if (SingleChildContainer.field_C == 36 &&
                                                          ue.field_d.isNamedFileAvailable(true, "clockworkpuff", "streamed")) {
                                                          wh.field_k = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "clockworkpuff", ue.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (SingleChildContainer.field_C == 37 &&
                                                          ue.field_d.isNamedFileAvailable(true, "windshield", "streamed")) {
                                                          IterableNodeHashTable.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "windshield", ue.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (SingleChildContainer.field_C == 38 &&
                                                          ue.field_d.isNamedFileAvailable(true, "stormshield", "streamed")) {
                                                          i.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "stormshield", ue.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (SingleChildContainer.field_C == 39 &&
                                                          ue.field_d.isNamedFileAvailable(true, "flamewall", "streamed")) {
                                                          cj.field_f = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "flamewall", ue.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (40 == SingleChildContainer.field_C &&
                                                          ue.field_d.isNamedFileAvailable(true, "stonepuff", "streamed")) {
                                                          nm.field_c = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "stonepuff", ue.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (41 != SingleChildContainer.field_C ||
                                                          !ue.field_d.isNamedFileAvailable(true, "frostpuff", "streamed")) {
                                                          if (SingleChildContainer.field_C != 42 ||
                                                            !ue.field_d.isNamedFileAvailable(true, "underexplosion", "streamed")) {
                                                            if (43 == SingleChildContainer.field_C &&
                                                              ue.field_d.isNamedFileAvailable(true, "skullexplosion", "streamed")) {
                                                              MusicPatchNode.field_E = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "skullexplosion", ue.field_d);
                                                              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                              if (var3 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            if (SingleChildContainer.field_C == 44 &&
                                                              ue.field_d.isNamedFileAvailable(true, "thornexplosion", "streamed")) {
                                                              CheckboxPainter.field_p = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "thornexplosion", ue.field_d);
                                                              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                              if (var3 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            if (SingleChildContainer.field_C != 45 ||
                                                              !ue.field_d.isNamedFileAvailable(true, "vineexplosion", "streamed")) {
                                                              if (SingleChildContainer.field_C == 46 &&
                                                                ue.field_d.isNamedFileAvailable(true, "vinepuff", "streamed")) {
                                                                vl.field_i = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "vinepuff", ue.field_d);
                                                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                                if (var3 == 0) {
                                                                  return;
                                                                }
                                                              }
                                                              if (47 != SingleChildContainer.field_C ||
                                                                !ue.field_d.isNamedFileAvailable(true, "waterexplosion", "streamed")) {
                                                                if (48 == SingleChildContainer.field_C &&
                                                                  ue.field_d.isNamedFileAvailable(true, "brineexplosion", "streamed")) {
                                                                  DiskCacheRequest.field_H = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "brineexplosion", ue.field_d);
                                                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                if (49 == SingleChildContainer.field_C &&
                                                                  ue.field_d.isNamedFileAvailable(true, "stoneexplosion", "streamed")) {
                                                                  ie.field_Tb = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "stoneexplosion", ue.field_d);
                                                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                if (SingleChildContainer.field_C != 50 ||
                                                                  !ue.field_d.isNamedFileAvailable(true, "frostexplosion", "streamed")) {
                                                                  if (SingleChildContainer.field_C != 51) {
                                                                    return;
                                                                  }
                                                                  if (!ue.field_d.isNamedFileAvailable(true, "watersplash", "streamed")) {
                                                                    return;
                                                                  }
                                                                  ResizableModalPanel.field_db = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "watersplash", ue.field_d);
                                                                  pi.field_e = FadingModalPanel.field_Q;
                                                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                lf.field_e = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "frostexplosion", ue.field_d);
                                                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                                if (var3 == 0) {
                                                                  return;
                                                                }
                                                              }
                                                              mb.field_cb = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "waterexplosion", ue.field_d);
                                                              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                              if (var3 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            rf.field_j = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "vineexplosion", ue.field_d);
                                                            SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                            if (var3 == 0) {
                                                              return;
                                                            }
                                                          }
                                                          jg.field_l = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "underexplosion", ue.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        ArrayWidgetContainer.field_G = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "frostpuff", ue.field_d);
                                                        SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                        if (var3 == 0) {
                                                          return;
                                                        }
                                                      }
                                                      MouseInputHandler.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "clockworkexplosion", ue.field_d);
                                                      SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                      if (var3 == 0) {
                                                        return;
                                                      }
                                                    }
                                                    BirthDateEntryPanel.field_S = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "flameshield", ue.field_d);
                                                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                    if (var3 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  nj.field_k = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "waterlord", ue.field_d);
                                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                  if (var3 == 0) {
                                                    return;
                                                  }
                                                }
                                                g.field_f = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "watertroll", ue.field_d);
                                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                if (var3 == 0) {
                                                  return;
                                                }
                                              }
                                              ra.field_c = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "pegasus", ue.field_d);
                                              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                              if (var3 == 0) {
                                                return;
                                              }
                                            }
                                            oe.field_d = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "pixies", ue.field_d);
                                            SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                            if (var3 == 0) {
                                              return;
                                            }
                                          }
                                          NumericDateInputWidget.field_U = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "swarm", ue.field_d);
                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                          if (var3 == 0) {
                                            return;
                                          }
                                        }
                                        ra.field_j = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "darkknight", ue.field_d);
                                        SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      LoginPanel.field_I = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "monkey", ue.field_d);
                                      SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                      if (var3 == 0) {
                                        return;
                                      }
                                    }
                                    ArchiveIndex.field_n = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "elf", ue.field_d);
                                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  Js5NetworkRequest.field_w = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "ent", ue.field_d);
                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                ml.field_v = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "brinegoblin", ue.field_d);
                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              ff.field_b = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "zombiedragon", ue.field_d);
                              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                              if (var3 == 0) {
                                return;
                              }
                            }
                            Checkbox.field_L = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "frostdragon", ue.field_d);
                            SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                            if (var3 == 0) {
                              return;
                            }
                          }
                          LoadingTracker.field_d = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "flamedragon", ue.field_d);
                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                          if (var3 == 0) {
                            return;
                          }
                        }
                        i.field_g = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "golem", ue.field_d);
                        SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                        if (var3 == 0) {
                          return;
                        }
                      }
                      fe.field_h = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "clockworkrecallsoldier", ue.field_d);
                      SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                      if (var3 == 0) {
                        return;
                      }
                    }
                    SceneTextInput.field_Jb = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "dwarf", ue.field_d);
                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  bj.field_ob = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "sylph", ue.field_d);
                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                  if (var3 == 0) {
                    return;
                  }
                }
                fd.field_j = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "stormpuff", ue.field_d);
                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                if (var3 == 0) {
                  return;
                }
              }
              DiskCacheWorker.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "smokeexplosion", ue.field_d);
              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
              if (var3 == 0) {
                return;
              }
            }
            fb.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "imp", ue.field_d);
            SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
            return;
          }
          if (SectorCacheStore.field_f >= 56) {
            if (jo.field_c >= 19) {
              return;
            }
            if (DelegatingCanvas.field_c[4] == null &&
              PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_grassland", "")) {
              DelegatingCanvas.field_c[4] = MusicTrack.a(PasswordFieldPainter.field_x, "", "arcanists_grassland");
              jo.field_c = 2;
              if (var3 == 0) {
                return;
              }
            }
            if (jo.field_c == 2) {
              GrowableIntList.field_h.a(0, lo.field_w, ki.field_s, DelegatingCanvas.field_c[4], -105);
              jo.field_c = 3;
              if (var3 == 0) {
                return;
              }
            }
            if (null == DelegatingCanvas.field_c[1] &&
              PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_giant_mountains", "")) {
              DelegatingCanvas.field_c[1] = MusicTrack.a(PasswordFieldPainter.field_x, "", "arcanists_giant_mountains");
              jo.field_c = 4;
              if (var3 == 0) {
                return;
              }
            }
            if (jo.field_c != 4) {
              if (null == DelegatingCanvas.field_c[2] &&
                PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_elven", "")) {
                DelegatingCanvas.field_c[2] = MusicTrack.a(PasswordFieldPainter.field_x, "", "arcanists_elven");
                jo.field_c = 6;
                if (var3 == 0) {
                  return;
                }
              }
              if (jo.field_c != 6) {
                if (DelegatingCanvas.field_c[3] != null ||
                  !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_goblin_caves", "")) {
                  if (jo.field_c != 8) {
                    if (null != DelegatingCanvas.field_c[5] ||
                      !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_swamp", "")) {
                      if (jo.field_c != 10) {
                        if (null != DelegatingCanvas.field_c[6] ||
                          !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_graveyard", "")) {
                          if (jo.field_c == 12) {
                            jo.field_c = 13;
                            GrowableIntList.field_h.a(0, lo.field_w, ki.field_s, DelegatingCanvas.field_c[6], param0 ^ -15414);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          if (DelegatingCanvas.field_c[7] != null ||
                            !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_skycastles", "")) {
                            if (jo.field_c != 14) {
                              if (null != DelegatingCanvas.field_c[8] ||
                                !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_beach_cove", "")) {
                                if (jo.field_c == 16) {
                                  jo.field_c = 17;
                                  GrowableIntList.field_h.a(0, lo.field_w, ki.field_s, DelegatingCanvas.field_c[8], 50);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                if (null != DelegatingCanvas.field_c[9] ||
                                  !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_arcane_crystal_cavern", "")) {
                                  if (jo.field_c != 18) {
                                    return;
                                  }
                                  jo.field_c = 19;
                                  GrowableIntList.field_h.a(0, lo.field_w, ki.field_s, DelegatingCanvas.field_c[9], param0 - 15554);
                                  GrowableIntList.field_h.c(125);
                                  ki.field_s = null;
                                  PasswordFieldPainter.field_x = null;
                                  lo.field_w = null;
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                DelegatingCanvas.field_c[9] = MusicTrack.a(PasswordFieldPainter.field_x, "", "arcanists_arcane_crystal_cavern");
                                jo.field_c = 18;
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              DelegatingCanvas.field_c[8] = MusicTrack.a(PasswordFieldPainter.field_x, "", "arcanists_beach_cove");
                              jo.field_c = 16;
                              if (var3 == 0) {
                                return;
                              }
                            }
                            jo.field_c = 15;
                            GrowableIntList.field_h.a(0, lo.field_w, ki.field_s, DelegatingCanvas.field_c[7], -116);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          DelegatingCanvas.field_c[7] = MusicTrack.a(PasswordFieldPainter.field_x, "", "arcanists_skycastles");
                          jo.field_c = 14;
                          if (var3 == 0) {
                            return;
                          }
                        }
                        DelegatingCanvas.field_c[6] = MusicTrack.a(PasswordFieldPainter.field_x, "", "arcanists_graveyard");
                        jo.field_c = 12;
                        if (var3 == 0) {
                          return;
                        }
                      }
                      jo.field_c = 11;
                      GrowableIntList.field_h.a(0, lo.field_w, ki.field_s, DelegatingCanvas.field_c[5], -109);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    DelegatingCanvas.field_c[5] = MusicTrack.a(PasswordFieldPainter.field_x, "", "arcanists_swamp");
                    jo.field_c = 10;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  jo.field_c = 9;
                  GrowableIntList.field_h.a(0, lo.field_w, ki.field_s, DelegatingCanvas.field_c[3], 52);
                  if (var3 == 0) {
                    return;
                  }
                }
                DelegatingCanvas.field_c[3] = MusicTrack.a(PasswordFieldPainter.field_x, "", "arcanists_goblin_caves");
                jo.field_c = 8;
                if (var3 == 0) {
                  return;
                }
              }
              jo.field_c = 7;
              GrowableIntList.field_h.a(0, lo.field_w, ki.field_s, DelegatingCanvas.field_c[2], -115);
              if (var3 == 0) {
                return;
              }
            }
            jo.field_c = 5;
            GrowableIntList.field_h.a(0, lo.field_w, ki.field_s, DelegatingCanvas.field_c[1], param0 - 15553);
            return;
          }
          if (!ck.field_b.ensureIndex(-10923)) {
            return;
          }
          if (!wh.field_l.ensureIndex(-10923)) {
            return;
          }
          if (null != ck.field_b) {
            if (SectorCacheStore.field_f < 18) {
              if (SectorCacheStore.field_f == 0 && (!ck.field_b.isGroupAvailableByName("spell_select", -24417) ||
                !wh.field_l.isGroupAvailableByName("spell_select", -24417))) {
                return;
              }
              pi.field_e = FadingModalPanel.field_Q;
              if (0 != SectorCacheStore.field_f) {
                if (1 != SectorCacheStore.field_f) {
                  if (SectorCacheStore.field_f != 2) {
                    if (SectorCacheStore.field_f != 3) {
                      if (SectorCacheStore.field_f == 4) {
                        SectorCacheStore.field_f = 5;
                        this.a(92, th.field_g[5], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spell_overlight").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                        if (var3 == 0) {
                          return;
                        }
                      }
                      if (SectorCacheStore.field_f != 5) {
                        if (SectorCacheStore.field_f == 6) {
                          SectorCacheStore.field_f = 7;
                          this.a(255, th.field_g[7], SoundEffect.loadNamed(wh.field_l, "spell_select", "arcanists_select_spell_sea").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (SectorCacheStore.field_f == 7) {
                          SectorCacheStore.field_f = 8;
                          this.a(255, th.field_g[6], SoundEffect.loadNamed(wh.field_l, "spell_select", "arcanists_select_spell_nature").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (SectorCacheStore.field_f != 8) {
                          if (9 != SectorCacheStore.field_f) {
                            if (SectorCacheStore.field_f != 10) {
                              if (11 == SectorCacheStore.field_f) {
                                SectorCacheStore.field_f = 12;
                                this.a(89, qo.field_a[2], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spellbook_storm").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              if (SectorCacheStore.field_f != 12) {
                                if (SectorCacheStore.field_f != 13) {
                                  if (SectorCacheStore.field_f == 14) {
                                    SectorCacheStore.field_f = 15;
                                    this.a(59, qo.field_a[4], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spellbook_underdark").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  if (SectorCacheStore.field_f != 15) {
                                    if (SectorCacheStore.field_f == 16) {
                                      SectorCacheStore.field_f = 17;
                                      this.a(255, qo.field_a[6], SoundEffect.loadNamed(wh.field_l, "spell_select", "arcanists_select_spellbook_nature").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                      if (var3 == 0) {
                                        return;
                                      }
                                    }
                                    if (SectorCacheStore.field_f != 17) {
                                      return;
                                    }
                                    SectorCacheStore.field_f = 18;
                                    this.a(255, qo.field_a[8], SoundEffect.loadNamed(wh.field_l, "spell_select", "arcanists_select_spellbook_cog").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  SectorCacheStore.field_f = 16;
                                  this.a(255, qo.field_a[7], SoundEffect.loadNamed(wh.field_l, "spell_select", "arcanists_select_spellbook_sea").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                SectorCacheStore.field_f = 14;
                                this.a(95, qo.field_a[5], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spellbook_overlight").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              SectorCacheStore.field_f = 13;
                              this.a(103, qo.field_a[1], SoundEffect.loadNamed(wh.field_l, "spell_select", "arcanists_select_spellbook_rock").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            SectorCacheStore.field_f = 11;
                            this.a(98, qo.field_a[3], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spellbook_frost").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          SectorCacheStore.field_f = 10;
                          this.a(87, qo.field_a[0], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spellbook_flame").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        SectorCacheStore.field_f = 9;
                        this.a(255, th.field_g[8], SoundEffect.loadNamed(wh.field_l, "spell_select", "arcanists_select_spell_cog").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                        if (var3 == 0) {
                          return;
                        }
                      }
                      SectorCacheStore.field_f = 6;
                      this.a(75, th.field_g[4], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spell_underdark").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    SectorCacheStore.field_f = 4;
                    this.a(105, th.field_g[1], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spell_rock").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                    if (var3 == 0) {
                      return;
                    }
                  }
                  SectorCacheStore.field_f = 3;
                  this.a(125, th.field_g[2], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spell_storm").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                SectorCacheStore.field_f = 2;
                this.a(182, th.field_g[3], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spell_frost").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                if (var3 == 0) {
                  return;
                }
              }
              SectorCacheStore.field_f = 1;
              this.a(54, th.field_g[0], VorbisSample.loadNamed(ck.field_b, "spell_select", "arcanists_select_spell_flame").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (SectorCacheStore.field_f < 44) {
              if (18 == SectorCacheStore.field_f && (!ck.field_b.isGroupAvailableByName("spell_impact", -24417) ||
                !wh.field_l.isGroupAvailableByName("spell_impact", param0 - 39850))) {
                return;
              }
              pi.field_e = DebouncedValidator.field_a;
              if (SectorCacheStore.field_f != 18) {
                if (SectorCacheStore.field_f == 19) {
                  SectorCacheStore.field_f = 20;
                  this.a(148, CacheEntry.field_n[0][1], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_flame_impact_2").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                if (SectorCacheStore.field_f == 20) {
                  SectorCacheStore.field_f = 21;
                  this.a(55, CacheEntry.field_n[0][2], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_flame_impact_3").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                if (SectorCacheStore.field_f != 21) {
                  if (SectorCacheStore.field_f != 22) {
                    if (SectorCacheStore.field_f == 23) {
                      SectorCacheStore.field_f = 24;
                      this.a(232, CacheEntry.field_n[3][2], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_frost_impact_3").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    if (SectorCacheStore.field_f != 24) {
                      if (SectorCacheStore.field_f != 25) {
                        if (SectorCacheStore.field_f == 26) {
                          SectorCacheStore.field_f = 27;
                          this.a(166, CacheEntry.field_n[2][2], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_3").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (SectorCacheStore.field_f == 27) {
                          SectorCacheStore.field_f = 28;
                          this.a(67, CacheEntry.field_n[1][0], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_1").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (SectorCacheStore.field_f == 28) {
                          SectorCacheStore.field_f = 29;
                          this.a(83, CacheEntry.field_n[1][1], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_2").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (29 == SectorCacheStore.field_f) {
                          SectorCacheStore.field_f = 30;
                          this.a(85, CacheEntry.field_n[1][2], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_3").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (30 != SectorCacheStore.field_f) {
                          if (SectorCacheStore.field_f != 31) {
                            if (SectorCacheStore.field_f == 32) {
                              SectorCacheStore.field_f = 33;
                              this.a(136, CacheEntry.field_n[5][2], VorbisSample.loadNamed(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_3").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            if (SectorCacheStore.field_f == 33) {
                              SectorCacheStore.field_f = 34;
                              this.a(59, CacheEntry.field_n[4][0], VorbisSample.loadNamed(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_1").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            if (SectorCacheStore.field_f != 34) {
                              if (SectorCacheStore.field_f != 35) {
                                if (SectorCacheStore.field_f == 36) {
                                  SectorCacheStore.field_f = 37;
                                  this.a(255, CacheEntry.field_n[7][2], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_clam_impact_individual").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                if (SectorCacheStore.field_f != 37) {
                                  if (SectorCacheStore.field_f != 38) {
                                    if (SectorCacheStore.field_f != 39) {
                                      if (40 == SectorCacheStore.field_f) {
                                        SectorCacheStore.field_f = 41;
                                        this.a(255, CacheEntry.field_n[6][1], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_impact_nature_vinebomb").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      if (SectorCacheStore.field_f == 41) {
                                        SectorCacheStore.field_f = 42;
                                        this.a(255, CacheEntry.field_n[6][0], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_nature_impact_flurry_of_arrows").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      if (SectorCacheStore.field_f != 42) {
                                        if (SectorCacheStore.field_f != 43) {
                                          return;
                                        }
                                        SectorCacheStore.field_f = 44;
                                        this.a(255, CacheEntry.field_n[8][0], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_cog_calling_bell_hit").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      SectorCacheStore.field_f = 43;
                                      this.a(255, CacheEntry.field_n[8][2], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_cog_calling_bell_does_nothing").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                      if (var3 == 0) {
                                        return;
                                      }
                                    }
                                    SectorCacheStore.field_f = 40;
                                    this.a(255, CacheEntry.field_n[6][2], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_nature_impact_thornball").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  SectorCacheStore.field_f = 39;
                                  this.a(255, CacheEntry.field_n[7][0], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_brine_bomb_explode").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                SectorCacheStore.field_f = 38;
                                this.a(255, CacheEntry.field_n[7][1], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_waterball_pop").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              SectorCacheStore.field_f = 36;
                              this.a(104, CacheEntry.field_n[4][2], VorbisSample.loadNamed(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_3").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            SectorCacheStore.field_f = 35;
                            this.a(136, CacheEntry.field_n[4][1], VorbisSample.loadNamed(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_2").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          SectorCacheStore.field_f = 32;
                          this.a(65, CacheEntry.field_n[5][1], VorbisSample.loadNamed(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_2").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        SectorCacheStore.field_f = 31;
                        this.a(80, CacheEntry.field_n[5][0], VorbisSample.loadNamed(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_1").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                        if (var3 == 0) {
                          return;
                        }
                      }
                      SectorCacheStore.field_f = 26;
                      this.a(90, CacheEntry.field_n[2][1], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_2").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    SectorCacheStore.field_f = 25;
                    this.a(107, CacheEntry.field_n[2][0], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_1").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                    if (var3 == 0) {
                      return;
                    }
                  }
                  SectorCacheStore.field_f = 23;
                  this.a(130, CacheEntry.field_n[3][1], VorbisSample.loadNamed(ck.field_b, "spell_impact", "arcanists_spellbook_frost_impact_2").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                SectorCacheStore.field_f = 22;
                this.a(76, CacheEntry.field_n[3][0], SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_spellbook_frost_impact_1").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                if (var3 == 0) {
                  return;
                }
              }
              SectorCacheStore.field_f = 19;
              this.a(61, CacheEntry.field_n[0][0], VorbisSample.loadNamed(ck.field_b, "spell_impact", "arcanists_spellbook_flame_impact_1").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (44 == SectorCacheStore.field_f &&
              ck.field_b.isGroupAvailableByName("spell_charge", -24417) &&
              wh.field_l.isGroupAvailableByName("spell_charge", param0 ^ -25386)) {
              SectorCacheStore.field_f = 45;
              pi.field_e = vm.field_f;
              this.a(98, wh.field_i[0], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_chargeup_flame").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(148, ah.field_f[0], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_discharge_flame").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(115, wh.field_i[3], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_chargeup_frost").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(172, ah.field_f[3], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_discharge_frost").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(111, wh.field_i[2], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_chargeup_storm").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(128, ah.field_f[2], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_discharge_storm").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(73, wh.field_i[1], SoundEffect.loadNamed(wh.field_l, "spell_charge", "arcanists_chargeup_rock").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(131, ah.field_f[1], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_discharge_rock").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(101, wh.field_i[5], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_chargeup_overlight").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(161, ah.field_f[5], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_discharge_overlight").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(118, wh.field_i[4], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_chargeup_underdark").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(118, ah.field_f[4], VorbisSample.loadNamed(ck.field_b, "spell_charge", "arcanists_discharge_underdark").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, wh.field_i[7], SoundEffect.loadNamed(wh.field_l, "spell_charge", "arcanists_chargeup_sea").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, ah.field_f[7], SoundEffect.loadNamed(wh.field_l, "spell_charge", "arcanists_discharge_sea").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, wh.field_i[8], SoundEffect.loadNamed(wh.field_l, "spell_charge", "arcanists_chargeup_cog").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, ah.field_f[8], SoundEffect.loadNamed(wh.field_l, "spell_charge", "arcanists_discharge_cog").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              cf.field_h[wh.field_i[6]] = cf.field_h[qo.field_a[6]];
              SceneWidgetNode.field_r[wh.field_i[6]] = SceneWidgetNode.field_r[qo.field_a[6]];
              cf.field_h[ah.field_f[6]] = cf.field_h[qo.field_a[6]];
              SceneWidgetNode.field_r[ah.field_f[6]] = SceneWidgetNode.field_r[qo.field_a[6]];
              return;
            }
            if (SectorCacheStore.field_f == 45 &&
              ck.field_b.isGroupAvailableByName("spell_cast_universal", -24417) &&
              wh.field_l.isGroupAvailableByName("spell_cast_universal", -24417)) {
              pi.field_e = SocketConnector.field_h;
              SectorCacheStore.field_f = 46;
              this.a(120, 64, VorbisSample.loadNamed(ck.field_b, "spell_cast_universal", "arcanists_cast_01_arcane_arrow").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(110, 72, VorbisSample.loadNamed(ck.field_b, "spell_cast_universal", "arcanists_cast_06_arcane_glyph").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(119, 66, SoundEffect.loadNamed(wh.field_l, "spell_cast_universal", "arcanists_cast_02_arcane_tower").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(141, 68, SoundEffect.loadNamed(wh.field_l, "spell_cast_universal", "arcanists_cast_03_arcane_gate").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(111, 74, SoundEffect.loadNamed(wh.field_l, "spell_cast_universal", "arcanists_cast_05_arcane_flash").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(111, 69, SoundEffect.loadNamed(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_bomb").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(111, 65, SoundEffect.loadNamed(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_portal").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(111, 71, VorbisSample.loadNamed(ck.field_b, "spell_cast_universal", "arcanists_imp_destruction").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(111, 67, SoundEffect.loadNamed(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_armour").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(111, 73, SoundEffect.loadNamed(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_sigil").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (46 == SectorCacheStore.field_f &&
              ck.field_b.isGroupAvailableByName("spell_cast_flame", -24417) &&
              wh.field_l.isGroupAvailableByName("spell_cast_flame", -24417)) {
              pi.field_e = PatchEnvelopeSet.field_b;
              SectorCacheStore.field_f = 47;
              this.a(73, 76, VorbisSample.loadNamed(ck.field_b, "spell_cast_flame", "arcanists_cast_07_fire_ball").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(118, 77, VorbisSample.loadNamed(ck.field_b, "spell_cast_flame", "arcanists_cast_08_fire_arrow").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(129, 78, VorbisSample.loadNamed(ck.field_b, "spell_cast_flame", "arcanists_cast_09_lava_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(113, 79, VorbisSample.loadNamed(ck.field_b, "spell_cast_flame", "arcanists_cast_10_magma_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(104, 80, SoundEffect.loadNamed(wh.field_l, "spell_cast_flame", "arcanists_cast_11_flame_shield").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(120, 81, SoundEffect.loadNamed(wh.field_l, "spell_cast_flame", "arcanists_cast_12_flame_wall").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(107, 82, SoundEffect.loadNamed(wh.field_l, "spell_cast_flame", "arcanists_cast_13_napalm").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(96, 83, VorbisSample.loadNamed(ck.field_b, "spell_cast_flame", "arcanists_cast_14_napalm_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(75, 84, VorbisSample.loadNamed(ck.field_b, "spell_cast_flame", "arcanists_cast_15_rain_of_fire").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(117, 85, VorbisSample.loadNamed(ck.field_b, "spell_cast_flame", "arcanists_cast_16_fire_of_arrows").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(122, 86, SoundEffect.loadNamed(wh.field_l, "spell_cast_flame", "arcanists_cast_17_volcano").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(117, 87, VorbisSample.loadNamed(ck.field_b, "spell_cast_flame", "arcanists_cast_18_flame_dragon").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (SectorCacheStore.field_f == 47 &&
              ck.field_b.isGroupAvailableByName("spell_cast_frost", -24417)) {
              pi.field_e = wh.field_j;
              SectorCacheStore.field_f = 48;
              this.a(63, 112, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_43_ice_ball").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(94, 113, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_44_ice_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(102, 114, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_45_shards").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(111, 115, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_46_frost_arrow").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(117, 116, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_47_snow_ball").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(95, 117, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_48_blizzard").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(128, 118, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_49_ice_shield").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(100, 119, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_50_ice_castle").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(89, 120, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_51_sylph").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(108, 121, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_52_frost_giant").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(177, 122, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_53_comet").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(184, 123, VorbisSample.loadNamed(ck.field_b, "spell_cast_frost", "arcanists_cast_54_frost_dragon").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (SectorCacheStore.field_f == 48 &&
              ck.field_b.isGroupAvailableByName("spell_cast_rock", -24417) &&
              wh.field_l.isGroupAvailableByName("spell_cast_rock", -24417)) {
              pi.field_e = fe.field_m;
              SectorCacheStore.field_f = 49;
              this.a(134, 88, SoundEffect.loadNamed(wh.field_l, "spell_cast_rock", "arcanists_cast_19_pebble_shot").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(58, 89, SoundEffect.loadNamed(wh.field_l, "spell_cast_rock", "arcanists_cast_20_scatter_rock").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(110, 90, SoundEffect.loadNamed(wh.field_l, "spell_cast_rock", "arcanists_cast_21_quake").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(196, 91, VorbisSample.loadNamed(ck.field_b, "spell_cast_rock", "arcanists_cast_22_disruption").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(151, 92, SoundEffect.loadNamed(wh.field_l, "spell_cast_rock", "arcanists_cast_23_mud_bomb").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(110, 93, VorbisSample.loadNamed(ck.field_b, "spell_cast_rock", "arcanists_cast_24_mega_boulder").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(85, 94, SoundEffect.loadNamed(wh.field_l, "spell_cast_rock", "arcanists_cast_25_rock_slab").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(116, 95, SoundEffect.loadNamed(wh.field_l, "spell_cast_rock", "arcanists_cast_26_fortress").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(120, 96, VorbisSample.loadNamed(ck.field_b, "spell_cast_rock", "arcanists_cast_27_dwarves").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(125, 97, VorbisSample.loadNamed(ck.field_b, "spell_cast_rock", "arcanists_cast_28_rock_golem").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(104, 98, SoundEffect.loadNamed(wh.field_l, "spell_cast_rock", "arcanists_cast_29_meteor").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(65, 99, SoundEffect.loadNamed(wh.field_l, "spell_cast_rock", "arcanists_cast_30_fissure").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (49 == SectorCacheStore.field_f &&
              ck.field_b.isGroupAvailableByName("spell_cast_storm", -24417) &&
              wh.field_l.isGroupAvailableByName("spell_cast_storm", -24417)) {
              pi.field_e = AlternateUsernameCredentials.field_j;
              SectorCacheStore.field_f = 50;
              this.a(107, 100, VorbisSample.loadNamed(ck.field_b, "spell_cast_storm", "arcanists_cast_31_thunder_shock").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(136, 101, VorbisSample.loadNamed(ck.field_b, "spell_cast_storm", "arcanists_cast_32_chain_lightning").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(256, 102, VorbisSample.loadNamed(ck.field_b, "spell_cast_storm", "arcanists_cast_33_wind_shield").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(129, 103, SoundEffect.loadNamed(wh.field_l, "spell_cast_storm", "arcanists_cast_34_hurricane").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(103, 104, VorbisSample.loadNamed(ck.field_b, "spell_cast_storm", "arcanists_cast_35_shock_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(161, 105, VorbisSample.loadNamed(ck.field_b, "spell_cast_storm", "arcanists_cast_36_storm_shield").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(127, 106, VorbisSample.loadNamed(ck.field_b, "spell_cast_storm", "arcanists_cast_37_cyclops").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(123, 107, VorbisSample.loadNamed(ck.field_b, "spell_cast_storm", "arcanists_cast_38_conductor_rod").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(92, 108, SoundEffect.loadNamed(wh.field_l, "spell_cast_storm", "arcanists_cast_39_thrust").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(108, 109, SoundEffect.loadNamed(wh.field_l, "spell_cast_storm", "arcanists_cast_40_flight").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(139, 110, SoundEffect.loadNamed(wh.field_l, "spell_cast_storm", "arcanists_cast_41_storm").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(184, 111, VorbisSample.loadNamed(ck.field_b, "spell_cast_storm", "arcanists_cast_42_storm_dragon").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (SectorCacheStore.field_f == 50 &&
              ck.field_b.isGroupAvailableByName("spell_cast_overlight", param0 - 39850) &&
              wh.field_l.isGroupAvailableByName("spell_cast_overlight", -24417)) {
              SectorCacheStore.field_f = 51;
              pi.field_e = fl.field_c;
              this.a(123, 145, VorbisSample.loadNamed(ck.field_b, "spell_cast_overlight", "arcanists_cast_67_castle_of_light").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(110, 137, VorbisSample.loadNamed(ck.field_b, "spell_cast_overlight", "arcanists_cast_68_sky_ray").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(139, 138, VorbisSample.loadNamed(ck.field_b, "spell_cast_overlight", "arcanists_cast_69_shining_bolt").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(107, 139, SoundEffect.loadNamed(wh.field_l, "spell_cast_overlight", "arcanists_cast_70_rising_star").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(109, 140, VorbisSample.loadNamed(ck.field_b, "spell_cast_overlight", "arcanists_cast_71_pegasus").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(131, 141, VorbisSample.loadNamed(ck.field_b, "spell_cast_overlight", "arcanists_cast_72_paladin").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(140, 142, VorbisSample.loadNamed(ck.field_b, "spell_cast_overlight", "arcanists_cast_73_forest_seed").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(113, 143, VorbisSample.loadNamed(ck.field_b, "spell_cast_overlight", "arcanists_cast_74_pixies").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(125, 144, SoundEffect.loadNamed(wh.field_l, "spell_cast_overlight", "arcanists_cast_75_sphere_of_healing").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(87, 136, VorbisSample.loadNamed(ck.field_b, "spell_cast_overlight", "arcanists_cast_76_protection_shield").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(123, 146, VorbisSample.loadNamed(ck.field_b, "spell_cast_overlight", "arcanists_cast_77_invulnerability_shield").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(128, 147, SoundEffect.loadNamed(wh.field_l, "spell_cast_overlight", "arcanists_cast_78_shining_power").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (SectorCacheStore.field_f == 51 &&
              ck.field_b.isGroupAvailableByName("spell_cast_underdark", -24417)) {
              pi.field_e = mn.field_v;
              SectorCacheStore.field_f = 52;
              this.a(156, 124, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_55_den_of_darkness").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(154, 125, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_56_rain_of_chaos").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(256, 126, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_57_drain_bolt").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(177, 127, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_58_death_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(145, 128, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_59_swarm").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(136, 129, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_60_dark_knight").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(142, 130, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_61_raise_dead").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(135, 131, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_62_wraith_minion").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(104, 132, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_63_aura_of_decay").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(122, 133, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_64_dark_defences").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(160, 134, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_65_swallowing_pit").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(159, 135, VorbisSample.loadNamed(ck.field_b, "spell_cast_underdark", "arcanists_cast_66_lichdom").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (52 == SectorCacheStore.field_f &&
              wh.field_l.isGroupAvailableByName("spell_cast_ocean", -24417)) {
              SectorCacheStore.field_f = 53;
              pi.field_e = lo.field_s;
              this.a(255, 160, SoundEffect.loadNamed(wh.field_l, "spell_cast_ocean", "arcanists_cast_waterball").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 161, SoundEffect.loadNamed(wh.field_l, "spell_cast_ocean", "arcanists_cast_maelstrom").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(256, 162, SoundEffect.loadNamed(wh.field_l, "spell_cast_ocean", "arcanists_summon_minions").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 164, SoundEffect.loadNamed(wh.field_l, "spell_cast_ocean", "arcanists_cast_deluge").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 165, SoundEffect.loadNamed(wh.field_l, "spell_cast_ocean", "arcanists_cast_english_summer").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 166, SoundEffect.loadNamed(wh.field_l, "spell_cast_ocean", "arcanists_cast_brine_bolt_individual").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 167, SoundEffect.loadNamed(wh.field_l, "spell_cast_ocean", "arcanists_cast_brine_bomb").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 169, SoundEffect.loadNamed(wh.field_l, "spell_cast_ocean", "arcanists_cast_rain_of_clams").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 170, SoundEffect.loadNamed(wh.field_l, "spell_cast_ocean", "arcanists_cast_tsunami").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (SectorCacheStore.field_f == 53 &&
              wh.field_l.isGroupAvailableByName("spell_cast_nature", -24417)) {
              pi.field_e = ArchiveProvider.field_g;
              SectorCacheStore.field_f = 54;
              this.a(255, 148, SoundEffect.loadNamed(wh.field_l, "spell_cast_nature", "arcanists_cast_79_thornball").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 149, SoundEffect.loadNamed(wh.field_l, "spell_cast_nature", "arcanists_cast_80_thornbomb").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 150, SoundEffect.loadNamed(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_whip").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 151, SoundEffect.loadNamed(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_vinebridge2").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 152, SoundEffect.loadNamed(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_vinebomb").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 153, SoundEffect.loadNamed(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_entangle").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 155, SoundEffect.loadNamed(wh.field_l, "spell_cast_nature", "arcanists_cast_86_sanctuary").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 157, SoundEffect.loadNamed(wh.field_l, "spell_cast_nature", "arcanists_cast_88_flurry_of_arrows").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 158, SoundEffect.loadNamed(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_natureswrath").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 159, SoundEffect.loadNamed(wh.field_l, "spell_cast_nature", "arcanists_impact_nature_vinebloom_build").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              return;
            }
            if (54 == SectorCacheStore.field_f &&
              ck.field_b.isGroupAvailableByName("spell_cast_cogs", -24417) &&
              wh.field_l.isGroupAvailableByName("spell_cast_cogs", -24417)) {
              SectorCacheStore.field_f = 55;
              pi.field_e = Scrollbar.field_I;
              this.a(255, 172, VorbisSample.loadNamed(ck.field_b, "spell_cast_cogs", "arcanists_cog_static_ball_shield_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 173, cf.field_h[172], SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 174, VorbisSample.loadNamed(ck.field_b, "spell_cast_cogs", "arcanists_cog_mech_arrow_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 175, SoundEffect.loadNamed(wh.field_l, "spell_cast_cogs", "arcanists_cog_fall_cast").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 176, SoundEffect.loadNamed(wh.field_l, "spell_cast_cogs", "arcanists_cog_recall_device_cast").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 177, VorbisSample.loadNamed(ck.field_b, "spell_cast_cogs", "arcanists_cog_calling_bell_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 178, VorbisSample.loadNamed(ck.field_b, "spell_cast_cogs", "arcanists_cog_clock_tower_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 179, VorbisSample.loadNamed(ck.field_b, "spell_cast_cogs", "arcanists_cog_cuckoo_clock_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 180, SoundEffect.loadNamed(wh.field_l, "spell_cast_cogs", "arcanists_cog_blast_from_past_cast").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 181, SoundEffect.loadNamed(wh.field_l, "spell_cast_cogs", "arcanists_cog_clockwork_bomb_loop_cast").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 182, VorbisSample.loadNamed(ck.field_b, "spell_cast_cogs", "arcanists_cog_steam_dragon_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              this.a(255, 183, VorbisSample.loadNamed(ck.field_b, "spell_cast_cogs", "arcanists_cog_redo_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
              cf.field_h[218] = cf.field_h[CacheEntry.field_n[8][0]];
              SceneWidgetNode.field_r[218] = SceneWidgetNode.field_r[CacheEntry.field_n[8][0]];
              return;
            }
            if (SectorCacheStore.field_f == 55) {
              pi.field_e = md.field_d;
              if (ck.field_b.areAllGroupsAvailable(117) &&
                wh.field_l.areAllGroupsAvailable(113)) {
                SectorCacheStore.field_f = 56;
                this.a(255, 154, VorbisSample.loadNamed(ck.field_b, "plant_minion", "arcanists_plant_minion_summon").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(255, 156, VorbisSample.loadNamed(ck.field_b, "elves", "arcanists_elf_summon").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(125, 70, VorbisSample.loadNamed(ck.field_b, "footmen", "arcanists_imp_for_the_arcanist").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(159, 171, VorbisSample.loadNamed(ck.field_b, "default", "arcanists_water_lord_summon").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(104, 168, VorbisSample.loadNamed(ck.field_b, "default", "arcanists_brine_goblin_summon").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(255, 163, SoundEffect.loadNamed(wh.field_l, "spell_impact", "arcanists_hydration_impact").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(255, 220, VorbisSample.loadNamed(ck.field_b, "trajectile", "natural_trajectile_loop").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(255, 226, VorbisSample.loadNamed(ck.field_b, "trajectile", "unnatural_trajectile_loop").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(64, 227, VorbisSample.loadNamed(ck.field_b, "trajectile", "bounce").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(198, 221, SoundEffect.loadNamed(wh.field_l, "other_buttons", "arcanists_menu_transition").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(256, 222, SoundEffect.loadNamed(wh.field_l, "other_buttons", "arcanists_units_click_on_map").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(256, 223, VorbisSample.loadNamed(ck.field_b, "other_buttons", "arcanists_units_drag_unit").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(256, 224, SoundEffect.loadNamed(wh.field_l, "other_buttons", "arcanists_units_select_next_unit").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(256, 225, VorbisSample.loadNamed(ck.field_b, "other_buttons", "arcanists_units_zoom_in").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(256, 48, SoundEffect.loadNamed(wh.field_l, "player", "arcanists_pl_01_footsteps").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(171, 49, SoundEffect.loadNamed(wh.field_l, "player", "arcanists_pl_02_jump_fowards").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(173, 50, SoundEffect.loadNamed(wh.field_l, "player", "arcanists_pl_03_jump_upwards").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(255, 51, SoundEffect.loadNamed(wh.field_l, "player", "arcanists_pl_04_landing").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(158, 52, VorbisSample.loadNamed(ck.field_b, "player", "arcanists_pl_05_damage").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(153, 53, VorbisSample.loadNamed(ck.field_b, "player", "arcanists_pl_06_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(155, 54, SoundEffect.loadNamed(wh.field_l, "player", "arcanists_pl_07_splash").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(190, dm.field_G[0], VorbisSample.loadNamed(ck.field_b, "cyclops", "arcanists_cyclops_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(191, dm.field_G[2], VorbisSample.loadNamed(ck.field_b, "cyclops", "arcanists_cyclops_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(178, dm.field_G[1], VorbisSample.loadNamed(ck.field_b, "cyclops", "arcanists_cyclops_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(165, hi.field_f[0], VorbisSample.loadNamed(ck.field_b, "dark_knight", "arcanists_dark_knight_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(203, hi.field_f[2], VorbisSample.loadNamed(ck.field_b, "dark_knight", "arcanists_dark_knight_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(152, hi.field_f[1], VorbisSample.loadNamed(ck.field_b, "dark_knight", "arcanists_dark_knight_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(149, 194, SoundEffect.loadNamed(wh.field_l, "dark_knight", "arcanists_dark_knight_charge_attack").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(151, fb.field_b[0], VorbisSample.loadNamed(ck.field_b, "dwarf", "arcanists_dwarf_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(142, fb.field_b[2], VorbisSample.loadNamed(ck.field_b, "dwarf", "arcanists_dwarf_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(153, fb.field_b[1], VorbisSample.loadNamed(ck.field_b, "dwarf", "arcanists_dwarf_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(173, 188, SoundEffect.loadNamed(wh.field_l, "dwarf", "arcanists_dwarf_mining").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(103, 189, VorbisSample.loadNamed(ck.field_b, "dwarf", "arcanists_dwarf_self_destruct").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(118, ed.field_Ib[0], VorbisSample.loadNamed(ck.field_b, "paladin", "arcanists_paladin_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(79, ed.field_Ib[2], VorbisSample.loadNamed(ck.field_b, "paladin", "arcanists_paladin_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(84, ed.field_Ib[1], VorbisSample.loadNamed(ck.field_b, "paladin", "arcanists_paladin_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(91, 202, SoundEffect.loadNamed(wh.field_l, "paladin", "arcanists_paladin_smash").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(147, PasswordFieldPainter.field_B[0], VorbisSample.loadNamed(ck.field_b, "rock_golem", "arcanists_rock_golem_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(128, PasswordFieldPainter.field_B[2], VorbisSample.loadNamed(ck.field_b, "rock_golem", "arcanists_rock_golem_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(148, PasswordFieldPainter.field_B[1], VorbisSample.loadNamed(ck.field_b, "rock_golem", "arcanists_rock_golem_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(125, SceneScrollbar.field_Fb[0], VorbisSample.loadNamed(ck.field_b, "slyph", "arcanists_slyph_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(159, SceneScrollbar.field_Fb[2], VorbisSample.loadNamed(ck.field_b, "slyph", "arcanists_slyph_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(181, SceneScrollbar.field_Fb[1], VorbisSample.loadNamed(ck.field_b, "slyph", "arcanists_slyph_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(161, 185, VorbisSample.loadNamed(ck.field_b, "slyph", "arcanists_slyph_arrow_attack").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(138, IndexedSpriteState.field_i[0], VorbisSample.loadNamed(ck.field_b, "wraith", "arcanists_wraith_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(178, IndexedSpriteState.field_i[2], VorbisSample.loadNamed(ck.field_b, "wraith", "arcanists_wraith_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(166, IndexedSpriteState.field_i[1], VorbisSample.loadNamed(ck.field_b, "wraith", "arcanists_wraith_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(255, 219, VorbisSample.loadNamed(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_attack").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(79, NanoFrameClock.field_g[0], VorbisSample.loadNamed(ck.field_b, "footmen", "arcanists_imp_yes_master").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                FullscreenFocusCanvas.field_g[NanoFrameClock.field_g[2]] = null;
                this.a(115, 184, VorbisSample.loadNamed(ck.field_b, "footmen", "arcanists_imp_im_gonna_go_boom").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(167, mb.field_U[0], VorbisSample.loadNamed(ck.field_b, "frost_giant", "arcanists_frost_giant_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(149, mb.field_U[2], VorbisSample.loadNamed(ck.field_b, "frost_giant", "arcanists_frost_giant_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(167, mb.field_U[1], VorbisSample.loadNamed(ck.field_b, "frost_giant", "arcanists_frost_giant_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(109, 187, SoundEffect.loadNamed(wh.field_l, "frost_giant", "arcanists_frost_giant_smash_attack").toPcmSample(), SceneWidgetNode.field_r, false, cf.field_h);
                cf.field_h[197] = cf.field_h[102];
                SceneWidgetNode.field_r[198] = SceneWidgetNode.field_r[105];
                SceneWidgetNode.field_r[197] = SceneWidgetNode.field_r[102];
                cf.field_h[198] = cf.field_h[105];
                SceneWidgetNode.field_r[103] = SceneWidgetNode.field_r[103];
                SceneWidgetNode.field_r[199] = SceneWidgetNode.field_r[136];
                cf.field_h[199] = cf.field_h[136];
                SceneWidgetNode.field_r[201] = SceneWidgetNode.field_r[187];
                cf.field_h[201] = cf.field_h[187];
                cf.field_h[103] = cf.field_h[103];
                this.a(176, NanoFrameClock.field_n[0], VorbisSample.loadNamed(ck.field_b, "storm_dragon", "arcanists_storm_dragon_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(182, NanoFrameClock.field_n[2], VorbisSample.loadNamed(ck.field_b, "storm_dragon", "arcanists_storm_dragon_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(202, NanoFrameClock.field_n[1], VorbisSample.loadNamed(ck.field_b, "storm_dragon", "arcanists_storm_dragon_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(154, 193, VorbisSample.loadNamed(ck.field_b, "storm_dragon", "arcanists_storm_dragon_breath").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(190, LoadingProgressDialog.field_pb[0], VorbisSample.loadNamed(ck.field_b, "frost_dragon", "arcanists_frost_dragon_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(256, LoadingProgressDialog.field_pb[2], VorbisSample.loadNamed(ck.field_b, "frost_dragon", "arcanists_frost_dragon_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(148, LoadingProgressDialog.field_pb[1], VorbisSample.loadNamed(ck.field_b, "frost_dragon", "arcanists_frost_dragon_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(167, 192, VorbisSample.loadNamed(ck.field_b, "frost_dragon", "arcanists_frost_dragon_breath").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(181, fi.field_c[0], VorbisSample.loadNamed(ck.field_b, "flame_dragon", "arcanists_flame_dragon_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(108, fi.field_c[2], VorbisSample.loadNamed(ck.field_b, "flame_dragon", "arcanists_flame_dragon_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(172, fi.field_c[1], VorbisSample.loadNamed(ck.field_b, "flame_dragon", "arcanists_flame_dragon_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(167, 191, VorbisSample.loadNamed(ck.field_b, "flame_dragon", "arcanists_flame_dragon_breath").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(158, cj.field_a[0], VorbisSample.loadNamed(ck.field_b, "pegasus", "arcanists_pegasus_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(229, cj.field_a[2], VorbisSample.loadNamed(ck.field_b, "pegasus", "arcanists_pegasus_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(183, cj.field_a[1], VorbisSample.loadNamed(ck.field_b, "pegasus", "arcanists_pegasus_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(256, vg.field_c[0], VorbisSample.loadNamed(ck.field_b, "swarm", "arcanists_swarm_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(256, vg.field_c[2], VorbisSample.loadNamed(ck.field_b, "swarm", "arcanists_swarm_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(256, vg.field_c[1], VorbisSample.loadNamed(ck.field_b, "swarm", "arcanists_swarm_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(256, ScreenDisplayMode.field_c[0], VorbisSample.loadNamed(ck.field_b, "cyclops", "arcanists_storm_spirit_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, gg.field_j[0], VorbisSample.loadNamed(ck.field_b, "pixie", "arcanists_pixie_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(83, gg.field_j[2], VorbisSample.loadNamed(ck.field_b, "pixie", "arcanists_pixie_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, gg.field_j[1], VorbisSample.loadNamed(ck.field_b, "pixie", "arcanists_pixie_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(235, 196, VorbisSample.loadNamed(ck.field_b, "pixie", "arcanists_pixie_fairyring").decodeAllToPcm(), SceneWidgetNode.field_r, false, cf.field_h);
                this.a(85, cf.field_a[0], VorbisSample.loadNamed(ck.field_b, "default", "arcanists_brine_goblin_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(83, cf.field_a[2], SoundEffect.loadNamed(wh.field_l, "default", "arcanists_brine_goblin_hit").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, cf.field_a[1], SoundEffect.loadNamed(wh.field_l, "default", "arcanists_brine_goblin_death").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, fk.field_h[0], VorbisSample.loadNamed(ck.field_b, "elves", "arcanists_elf_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(83, fk.field_h[2], VorbisSample.loadNamed(ck.field_b, "elves", "arcanists_elf_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, fk.field_h[1], VorbisSample.loadNamed(ck.field_b, "elves", "arcanists_elf_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, jn.field_a[0], VorbisSample.loadNamed(ck.field_b, "plant_minion", "arcanists_plant_minion_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(83, jn.field_a[2], VorbisSample.loadNamed(ck.field_b, "plant_minion", "arcanists_plant_minion_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, jn.field_a[1], VorbisSample.loadNamed(ck.field_b, "plant_minion", "arcanists_plant_minion_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, IconButtonPainter.field_p[0], VorbisSample.loadNamed(ck.field_b, "default", "arcanists_water_troll_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(83, IconButtonPainter.field_p[2], SoundEffect.loadNamed(wh.field_l, "default", "arcanists_sea_watertroll_hit").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, IconButtonPainter.field_p[1], SoundEffect.loadNamed(wh.field_l, "default", "arcanists_sea_watertroll_death").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, fd.field_h[0], SoundEffect.loadNamed(wh.field_l, "spell_cast_ocean", "arcanists_summon_sea_minion").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(83, fd.field_h[2], SoundEffect.loadNamed(wh.field_l, "default", "arcanists_water_lord_hit").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(85, fd.field_h[1], SoundEffect.loadNamed(wh.field_l, "default", "arcanists_water_lord_death").toPcmSample(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(255, om.field_B[0], cf.field_h[176], tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(255, om.field_B[2], cf.field_h[176], tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(255, om.field_B[1], cf.field_h[176], tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(255, u.field_h[0], VorbisSample.loadNamed(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_select").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(255, u.field_h[2], VorbisSample.loadNamed(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_hit").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                this.a(255, u.field_h[1], VorbisSample.loadNamed(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_death").decodeAllToPcm(), tm.field_a, false, FullscreenFocusCanvas.field_g);
                ck.field_b = null;
                wh.field_l = null;
                return;
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ArcanistsMulti.QA(" + param0 + ')');
        }
    }

    static {
        field_H = "Log in / Create account";
        field_F = "Add <%0> to friend list";
    }
}
