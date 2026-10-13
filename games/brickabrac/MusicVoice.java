/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicVoice extends IntrusiveNode {
    int releaseProgress;
    int portamentoDelta;
    int volumeEnvelopeProgress;
    int updateFrames;
    static tq field_l;
    static RgbSprite field_n;
    int portamentoScale;
    static String field_C;
    MusicEnvelope envelope;
    int volumeEnvelopeIndex;
    int exclusiveGroup;
    int note;
    MusicPatch patch;
    int basePitch256;
    PcmStream pcmStream;
    int ageTicks;
    int releaseEnvelopeIndex;
    int decayProgress;
    int notePan;
    int vibratoPhase;
    static int field_E;
    int velocityGain;
    PcmSound sample;
    int field_j;
    int channel;

    final static void a(String param0, int param1) {
        int stackIn_28_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          go.field_e = go.field_e + 1;
          if (-1 == ChocolateBackground.field_v &&
            ll.field_b == -1) {
            ChocolateBackground.field_v = MusicPatch.pointerX;
            ll.field_b = po.pointerY;
          }
          if (param1 != 22546) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 == null) {
            decompiledFrameRemainder0 = (null == LevelCompleteScreen.field_J);
          } else {
            decompiledFrameRemainder0 = !(param0.equals(LevelCompleteScreen.field_J));
          }
          if (decompiledFrameRemainder0) {
            if (!QuickChatParameterType.field_h &&
              go.field_e >= MonotonicTime.field_e &&
              MonotonicTime.field_e + jh.field_a > go.field_e) {
              stackIn_28_0 = 1;
            } else {
              stackIn_28_0 = 0;
            }
            var2_int = stackIn_28_0;
            if (param0 != null && (QuickChatParameterType.field_h ||
              var2_int != 0)) {
              go.field_e = MonotonicTime.field_e;
              if (var3 != 0) {
                go.field_e = 0;
              }
            } else {
              go.field_e = 0;
            }
            CappedUrlRequest.field_j = ll.field_b;
            if (null == param0) {
              if (var2_int != 0) {
                QuickChatParameterType.field_h = true;
                if (var3 != 0) {
                  QuickChatParameterType.field_h = false;
                }
              }
            } else {
              QuickChatParameterType.field_h = false;
            }
            b.field_a = ChocolateBackground.field_v;
          }
          LevelCompleteScreen.field_J = param0;
          if (!QuickChatParameterType.field_h &&
            go.field_e < MonotonicTime.field_e &&
            QuickChatHelpDialog.pointerChanged) {
            b.field_a = ChocolateBackground.field_v;
            go.field_e = 0;
            CappedUrlRequest.field_j = ll.field_b;
          }
          if (QuickChatParameterType.field_h &&
            go.field_e == LevelPackSelectScreen.field_y) {
            QuickChatParameterType.field_h = false;
            go.field_e = 0;
          }
          ll.field_b = -1;
          ChocolateBackground.field_v = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("ka.G(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, ScrollPane param1, int param2, int param3, int param4) {
        ScrollPane stackIn_68_0;
        int stackIn_68_1;
        int stackIn_68_2;
        int stackIn_68_3;
        int stackIn_68_4;
        boolean stackIn_68_5;
        boolean stackIn_69_6;
        int stackIn_90_0 = 0;
        UiComponent stackIn_155_0;
        int stackIn_155_1;
        int stackIn_155_2;
        int stackIn_155_3;
        int stackIn_156_4 = 0;
        RuntimeException stackIn_371_0 = null;
        StringBuilder stackIn_371_1 = null;
        String stackIn_372_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        NodeDeque var10 = null;
        int var11 = 0;
        Object var12 = null;
        id var13 = null;
        int var14 = 0;
        UiComponent var15 = null;
        UiComponent var16 = null;
        UiComponent var17 = null;
        UiComponent var18 = null;
        UiComponent var19 = null;
        int var20 = 0;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24_int = 0;
        String var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26_int = 0;
        Object var26 = null;
        int var27 = 0;
        int var28_int = 0;
        String var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31_int = 0;
        String var31 = null;
        int var32 = 0;
        int var11Lifetime1;
        int var25_intLifetime1;
        int var27Lifetime1;
        int var31_intLifetime1;
        int var11Lifetime2;
        int var27Lifetime2;
        var32 = BrickABrac.field_J ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (o.field_e != null && (null != NodeDeque.field_a ||
            null != AchievementsScreen.field_F ||
            null != MatchResultScreen.field_v ||
            null != me.field_e)) {
            var9 = 0;
            while (!(var9 >= cq.field_p)) {
              var10_int = 255 & o.field_e.field_Tb[var9];
              if (var32 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (null != NodeDeque.field_a &&
                null != NodeDeque.field_a[var9] &&
                NodeDeque.field_a[var9][var10_int]) {
                var5_int = 1;
              }
              if (AchievementsScreen.field_F != null &&
                AchievementsScreen.field_F[var9] != null) {
                var11 = AchievementsScreen.field_F[var9][var10_int];
                if (var11 != 0 &&
                  !ea.field_g) {
                  var5_int = 1;
                }
                if (var11 > var6) {
                  var6 = var11;
                }
              }
              if (null != me.field_e &&
                null != me.field_e[var9]) {
                var8 = var8 | me.field_e[var9][var10_int];
              }
              if (null != MatchResultScreen.field_v &&
                MatchResultScreen.field_v[var9] != null) {
                var11Lifetime2 = MatchResultScreen.field_v[var9][var10_int];
                if (var11Lifetime2 != 0 &&
                  !ea.field_g) {
                  var5_int = 1;
                }
                if (var11Lifetime2 > var7) {
                  var7 = var11Lifetime2;
                }
              }
              var9++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_68_0 = (ScrollPane) (param1);
            stackIn_68_1 = 2;
            stackIn_68_2 = param3 * 4 * (2 + np.uiRowHeight);
            stackIn_68_3 = np.uiRowHeight * 2 + 4;
            stackIn_68_4 = 22676;
            stackIn_68_5 = param0;
            stackIn_69_6 = (param1 == o.field_b);
            var9 = ((ScrollPane) (Object) stackIn_68_0).updateContentLayout(stackIn_68_1, stackIn_68_2, stackIn_68_3, stackIn_68_4, stackIn_68_5, stackIn_69_6) ? 1 : 0;
          }
          var10 = param1.content.children;
          var11Lifetime1 = 73 % ((param4 - 41) / 57);
          var12 = null;
          var13 = (id) (var10.first(-67));
          while (null != var13) {
            var14 = 0;
            if (var32 != 0) {
              return;
            }
            if (null == var13.children) {
              var13.field_Rb = new UiComponent(0L, vb.field_K);
              var13.addChild(var13.field_Rb, 0);
              var13.field_dc = new UiComponent(0L, OptionsScreen.field_v);
              if (vd.field_e) {
                var13.addChild(var13.field_dc, 0);
              }
              var13.field_dc.horizontalAlignment = 2;
              var13.field_Tb = new UiComponent(0L, CappedUrlRequest.field_l);
              var13.addChild(var13.field_Tb, 0);
              var13.markDescendantsToInheritVisualState(true);
              var13.field_Vb = new UiComponent(0L, ok.field_d);
              var13.addChild(var13.field_Vb, 0);
              var13.field_cc = new UiComponent(0L, MotionWaypoint.field_s);
              var13.addChild(var13.field_cc, 0);
              var14 = 1;
            }
            var13.field_Rb.text = null;
            var15 = var13.field_Rb;
            var13.field_Rb.height = 0;
            var15.width = 0;
            var13.field_dc.text = null;
            var13.field_dc.height = 0;
            var16 = var13.field_dc;
            var16.width = 0;
            var13.field_Vb.text = null;
            var17 = var13.field_Vb;
            var13.field_Vb.height = 0;
            var13.field_cc.text = null;
            var17.width = 0;
            var18 = var13.field_cc;
            var13.field_cc.height = 0;
            var18.width = 0;
            var13.field_Tb.text = null;
            var19 = var13.field_Tb;
            var13.field_Tb.height = 0;
            var19.width = 0;
            var13.width = param1.content.width;
            var20 = 0;
            var21 = var13.field_Yb;
            var22 = 72;
            if (param1 == IsaacGenerator.field_b) {
              var22 += 42;
            }
            var21 = TextFont.truncateText(var13.field_Rb.font, var21, var22);
            stackIn_90_0 = (var21.equals(var13.field_Yb)) ? 0 : 1;
            var23 = stackIn_90_0;
            if (4 <= var13.field_Zb) {
              var21 = "<img=" + (LevelPackLoader.field_g - 4 + var13.field_Zb) + ">" + var21;
            } else {
              if (0 < var13.field_Zb) {
                var21 = "<img=" + (-1 + var13.field_Zb) + ">" + var21;
              }
            }
            var13.field_Rb.text = var21;
            if (!var13.i(0)) {
              var24_int = 16764006;
              var25_int = 16777215;
              if (var5_int != 0 &&
                !var13.field_ec ||
                (!(var6 <= var13.field_Wb) ||
                !(var7 <= var13.field_ac) ||
                !(0 >= (var8 & ~var13.field_Ub)))) {
                var25_int = 8421504;
                var24_int = 8414771;
              }
              var13.field_Rb.selectedTextColor = var25_int;
              var13.field_Rb.capturedTextColor = var25_int;
              var13.field_Rb.activeTextColor = var25_int;
              var13.field_Vb.textColor = var24_int;
              var13.field_dc.textColor = var24_int;
              var13.field_Rb.textColor = var24_int;
              var13.field_dc.selectedTextColor = var25_int;
              var13.field_dc.capturedTextColor = var25_int;
              var13.field_dc.activeTextColor = var25_int;
              var13.field_Vb.selectedTextColor = var25_int;
              var13.field_Vb.capturedTextColor = var25_int;
              var13.field_Vb.activeTextColor = var25_int;
              if (param1 == TimedSplashScreen.field_u) {
                if (!o.field_e.field_Rb) {
                  var13.field_cc.text = LegacyUtf8Decoder.field_b;
                }
              } else if (!var13.field_Qb) {
                if (!var13.field_fc) {
                  var13.field_Vb.text = ea.field_f;
                } else {
                  var13.field_Rb.text = rd.a(ce.field_g, new String[]{var21}, (byte) 103);
                  var13.field_Vb.text = JungleBackground.field_t;
                  var13.field_cc.text = NameEntryPopup.field_Wb;
                }
              } else {
                var13.field_Rb.text = rd.a(ll.field_a, new String[]{var21}, (byte) 103);
                var13.field_cc.text = wl.field_L;
              }
              var26_int = 0;
              if (null != o.field_e &&
                hn.b((byte) 7) &&
                ~oc.field_p != ~var13.field_gc) {
                if (null != var13.field_Vb.text) {
                  var27 = var13.field_Vb.getContentWidth(123) + 2 * om.field_oc;
                  var13.field_Vb.setBounds(np.uiRowHeight, var20, var26_int, var27, (byte) 64);
                  var26_int = var26_int + var27;
                }
                if (var13.field_cc.text != null) {
                  if (TimedSplashScreen.field_u == param1) {
                    var27Lifetime2 = 40;
                  } else {
                    var27Lifetime2 = var13.field_cc.getContentWidth(99) + 2 * om.field_oc;
                  }
                  var13.field_cc.setBounds(np.uiRowHeight, var20, var26_int, var27Lifetime2, (byte) 64);
                  var26_int = var26_int + var27Lifetime2;
                }
              }
              stackIn_155_0 = var13.field_Rb;
              stackIn_155_1 = np.uiRowHeight;
              stackIn_155_2 = var20;
              stackIn_155_3 = var26_int;
              if (vd.field_e) {
                stackIn_156_4 = 42;
              } else {
                stackIn_156_4 = 0;
              }
              ((UiComponent) (Object) stackIn_155_0).setBounds(stackIn_155_1, stackIn_155_2, stackIn_155_3, -stackIn_156_4 + var13.width - var26_int, (byte) 64);
              var13.field_dc.text = Integer.toString(var13.field_Wb);
              var13.field_dc.setBounds(np.uiRowHeight, var20, -40 + var13.width, 40, (byte) 64);
              if (var13.field_Rb.activeInside &&
                var23 != 0) {
                ep.field_e = var13.field_Yb;
                if (null != PacketBuffer.field_i &&
                  PacketBuffer.field_i[var13.field_Zb] != null) {
                  ep.field_e = ep.field_e + " - " + PacketBuffer.field_i[var13.field_Zb];
                }
              } else {
                if (var13.field_Rb.activeInside &&
                  null != PacketBuffer.field_i &&
                  PacketBuffer.field_i[var13.field_Zb] != null) {
                  ep.field_e = PacketBuffer.field_i[var13.field_Zb];
                }
              }
              var20 = var20 + np.uiRowHeight;
            }
            var24 = SoundPlayback.a((byte) -110, var21, var13.field_kc);
            if (null != var24) {
              var25_intLifetime1 = var13.field_Tb.font.countWrappedLines(var24, -om.field_oc + var13.width - om.field_oc);
              var13.field_Tb.textAlpha256 = var13.field_ic * 256 / cm.field_o;
              var13.field_Tb.text = var24;
              var13.field_Tb.setBounds(var25_intLifetime1 * np.uiRowHeight, var20, om.field_oc, var13.width - 2 * om.field_oc, (byte) 64);
              var20 = var20 + np.uiRowHeight * var25_intLifetime1;
            }
            if (var9 == 0) {
              var13.remainingHeight = var20 - var13.height;
            }
            if (var14 != 0) {
              param1.content.placeBelow((UiComponent) (var12), 2, var13, 17290);
            }
            boolean decompiledFrameRemainder0 = true;
            if (var13.pressedButton != 0 &&
              !var13.i(0)) {
              if (0 == var13.field_Vb.pressedButton) {
                if (var13.field_cc.pressedButton != 0) {
                  rf.a(param2, var13.field_gc, true);
                } else {
                  SpriteGeometry.a(0, qo.pressY, var13, param1, (byte) 58, tb.pressX, 0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                hd.a(var13.field_gc, 66, param2);
              }
            }
            var12 = var13;
            if (var13.hovered &&
              !var13.i(0)) {
              var25 = null;
              if (~var13.field_gc == ~oc.field_p) {
                if (var5_int != 0 &&
                  !var13.field_ec) {
                  var25 = ug.field_J;
                } else {
                  if (var13.field_ac >= var7) {
                    if (var6 > var13.field_Wb) {
                      var25 = rd.a(ea.field_h, new String[]{null, Integer.toString(var6)}, (byte) 103);
                    } else {
                      if ((var8 & ~var13.field_Ub) != 0) {
                        var26_int = r.a((byte) -82, ~var13.field_Ub & var8);
                        var25 = ObjectHistoryBuffer.field_j;
                        if (var26_int > 0 &&
                          eb.field_p != null &&
                          var26_int <= eb.field_p.length &&
                          eb.field_p[var26_int - 1] != null) {
                          var25 = eb.field_p[var26_int - 1][1];
                        }
                      }
                    }
                  } else {
                    var26_int = -var13.field_ac + var7;
                    if (var26_int == 1) {
                      var25 = SaveResultsPromptScreen.field_w;
                    }
                    var25 = rd.a(Brick.field_F, new String[]{null, Integer.toString(var26_int)}, (byte) 103);
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var13.field_ec) {
                  var25 = rd.a(MenuSelection.field_f, new String[]{var21}, (byte) 103);
                } else {
                  if (var13.field_ac >= var7) {
                    if (var13.field_Wb < var6) {
                      var25 = rd.a(cp.field_H, new String[]{var21, Integer.toString(var6)}, (byte) 103);
                    } else {
                      if ((var8 & ~var13.field_Ub) != 0) {
                        var26_int = r.a((byte) -82, ~var13.field_Ub & var8);
                        var25 = rd.a(IntNode.field_m, new String[]{var21}, (byte) 103);
                        if (var26_int > 0 &&
                          null != eb.field_p &&
                          var26_int <= eb.field_p.length &&
                          eb.field_p[-1 + var26_int] != null) {
                          var25 = rd.a(eb.field_p[var26_int - 1][2], new String[]{var21}, (byte) 103);
                        }
                      }
                    }
                  } else {
                    var26_int = var7 - var13.field_ac;
                    if (var26_int == 1) {
                      var25 = rd.a(di.field_b, new String[]{var21}, (byte) 103);
                    }
                    var25 = rd.a(qh.field_g, new String[]{var21, Integer.toString(var26_int)}, (byte) 103);
                  }
                }
              }
              if (var25 != null) {
                var25 = "<col=A00000>" + (String) (var25);
                var26 = null;
                var27Lifetime1 = 0;
                var28_int = 0;
                while (true) {
                  if (cq.field_p > var28_int) {
                    var29 = o.field_e.field_Tb[var28_int] & 255;
                    var30 = 0;
                    if (NodeDeque.field_a != null &&
                      NodeDeque.field_a[var28_int] != null &&
                      NodeDeque.field_a[var28_int][var29] &&
                      !var13.field_ec) {
                      var30 = 1;
                    }
                    if (null != AchievementsScreen.field_F &&
                      AchievementsScreen.field_F[var28_int] != null) {
                      var31_int = AchievementsScreen.field_F[var28_int][var29];
                      if (var31_int != 0 &&
                        !ea.field_g &&
                        !var13.field_ec) {
                        var30 = 1;
                      }
                      if (var13.field_Wb < var31_int) {
                        var30 = 1;
                      }
                    }
                    if (null != MatchResultScreen.field_v &&
                      null != MatchResultScreen.field_v[var28_int]) {
                      var31_intLifetime1 = MatchResultScreen.field_v[var28_int][var29];
                      if (var31_intLifetime1 != 0 &&
                        !ea.field_g &&
                        !var13.field_ec) {
                        var30 = 1;
                      }
                      if (var31_intLifetime1 > var13.field_ac) {
                        var30 = 1;
                      }
                    }
                    if (null != me.field_e &&
                      me.field_e[var28_int] != null &&
                      (me.field_e[var28_int][var29] & ~var13.field_Ub) != 0) {
                      var30 = 1;
                    }
                    if (var30 != 0) {
                      var31 = "<col=A00000>" + QuickChatPhraseRegistry.field_b[var28_int] + "</col>";
                      if (var26 == null) {
                        var26 = var31;
                      } else {
                        var26 = (String) (var26) + ", " + var31;
                        var27Lifetime1 = 1;
                      }
                    }
                    var28_int++;
                    continue;
                  }
                  if (param1 != TimedSplashScreen.field_u ||
                    !hn.b((byte) 7)) {
                    if (var27Lifetime1 == 0) {
                      var25 = (String) (var25) + "<br>" + rd.a(ProducerFramebuffer.field_k, new String[]{(String) (var26)}, (byte) 103);
                    } else {
                      var25 = (String) (var25) + "<br>" + MusicEnvelope.field_l + (String) (var26);
                    }
                  } else {
                    if (var27Lifetime1 == 0) {
                      var25 = (String) (var25) + "<br>" + rd.a(id.field_bc, new String[]{(String) (var26)}, (byte) 103);
                    } else {
                      var25 = (String) (var25) + "<br>" + QuickChatHelpDialog.field_Rb + (String) (var26);
                    }
                  }
                  break;
                }
                if (TimedSplashScreen.field_u == param1 &&
                  !hn.b((byte) 7)) {
                  var28 = o.field_e.field_Fc;
                  var25 = (String) (var25) + "<br>" + rd.a(ba.field_y, new String[]{var28}, (byte) 103);
                }
                ep.field_e = (String) (var25);
              }
            }
            var13 = (id) (var10.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_371_0 = var5;
          stackIn_371_1 = new StringBuilder().append("ka.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_372_2 = "null";
          } else {
            stackIn_372_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_371_0), ((StringBuilder) (Object) stackIn_371_1).append(stackIn_372_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_l = null;
          field_C = null;
          if (param0 != 67) {
            field_n = (RgbSprite) null;
          }
          field_n = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "ka.A(" + param0 + ')');
        }
    }

    final void releaseResources(int obfuscationGuard) {
        this.pcmStream = null;
        this.sample = null;
        this.patch = null;
        if (obfuscationGuard > -39) {
          return;
        }
        try {
          this.envelope = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ka.B(" + obfuscationGuard + ')');
        }
    }

    final static void a(int param0, int param1, int param2, ta param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          vg.field_c = param3;
          un.field_a = param0;
          Paddle.field_A = param2;
          if (param1 >= -25) {
            field_l = (tq) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ka.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 60) {
            field_E = -98;
          }
          stackIn_10_0 = (r.field_A) && (~ga.field_i != ~pp.field_a);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "ka.E(" + param0 + ')');
        }
    }

    final static void transformAndProjectMesh(int[] cameraPose, int obfuscationGuard, int[] objectPose, boolean retainViewVertices, boolean transformDirections, Mesh3D mesh, boolean cullBackfaces) {
        int branchOrCullValue = 0;
        int boundOrMinimumDepth = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String cameraSummary = null;
        StringBuilder objectContext = null;
        String objectSummary = null;
        StringBuilder meshContext = null;
        String meshSummary = null;
        RuntimeException caughtFailure = null;
        int minimumDepth = 0;
        RuntimeException failure = null;
        int maximumDepth = 0;
        int cameraXOrWorldXX = 0;
        int cameraYOrWorldYX = 0;
        int cameraZOrWorldZX = 0;
        int relativeXXOrWorldXY = 0;
        int relativeYXOrWorldYY = 0;
        int relativeZXOrWorldZY = 0;
        int relativeXYOrWorldXZ = 0;
        int relativeYYOrWorldYZ = 0;
        int relativeZYOrWorldZZ = 0;
        int relativeXZOrDirectionIndex = 0;
        int relativeYZOrDirectionX = 0;
        int relativeZZOrDirectionY = 0;
        int cameraXXQ14 = 0;
        int cameraXYQ14 = 0;
        int cameraXZQ14 = 0;
        int cameraYXQ14 = 0;
        int cameraYYQ14 = 0;
        int cameraYZQ14 = 0;
        int cameraZXQ14 = 0;
        int cameraZYQ14 = 0;
        int cameraZZQ14 = 0;
        int gameFlag = 0;
        int deltaX;
        int centerXOrDirectionZ;
        int deltaY;
        int centerY;
        int deltaZ;
        int vertexOrFace;
        int pointX;
        int pointY;
        int pointZ;
        int scaledViewX;
        int scaledViewY;
        int viewZ;
        gameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          minimumDepth = 2147483647;
          maximumDepth = -2147483648;
          cameraXXQ14 = cameraPose[3] >> 2;
          cameraXYQ14 = cameraPose[4] >> 2;
          cameraXZQ14 = cameraPose[5] >> 2;
          if (obfuscationGuard != -16283) {
            field_l = (tq) null;
          }
          cameraYXQ14 = cameraPose[6] >> 2;
          cameraYYQ14 = cameraPose[7] >> 2;
          cameraYZQ14 = cameraPose[8] >> 2;
          cameraZXQ14 = cameraPose[9] >> 2;
          cameraZYQ14 = cameraPose[10] >> 2;
          relativeYXOrWorldYY = cameraYYQ14 * objectPose[4] + (cameraYXQ14 * objectPose[3] + objectPose[5] * cameraYZQ14) >> 14;
          cameraZZQ14 = cameraPose[11] >> 2;
          relativeXXOrWorldXY = objectPose[5] * cameraXZQ14 + (objectPose[3] * cameraXXQ14 + objectPose[4] * cameraXYQ14) >> 14;
          relativeYYOrWorldYZ = objectPose[8] * cameraYZQ14 + cameraYXQ14 * objectPose[6] + objectPose[7] * cameraYYQ14 >> 14;
          relativeXZOrDirectionIndex = cameraXZQ14 * objectPose[11] + objectPose[10] * cameraXYQ14 + objectPose[9] * cameraXXQ14 >> 14;
          relativeXYOrWorldXZ = objectPose[7] * cameraXYQ14 + cameraXXQ14 * objectPose[6] + objectPose[8] * cameraXZQ14 >> 14;
          relativeZZOrDirectionY = cameraZYQ14 * objectPose[10] + (objectPose[9] * cameraZXQ14 + objectPose[11] * cameraZZQ14) >> 14;
          relativeYZOrDirectionX = objectPose[11] * cameraYZQ14 + (cameraYYQ14 * objectPose[10] + objectPose[9] * cameraYXQ14) >> 14;
          relativeZXOrWorldZY = objectPose[3] * cameraZXQ14 - (-(objectPose[4] * cameraZYQ14) - objectPose[5] * cameraZZQ14) >> 14;
          relativeZYOrWorldZZ = objectPose[8] * cameraZZQ14 + (cameraZXQ14 * objectPose[6] + cameraZYQ14 * objectPose[7]) >> 14;
          deltaX = objectPose[0] - cameraPose[0];
          deltaY = objectPose[1] - cameraPose[1];
          deltaZ = -cameraPose[2] + objectPose[2];
          cameraXOrWorldXX = cameraPose[4] * deltaY + deltaX * cameraPose[3] + deltaZ * cameraPose[5] >> -LevelPackCard.projectionShift + 16;
          cameraYOrWorldYX = deltaZ * cameraPose[8] + (cameraPose[7] * deltaY + deltaX * cameraPose[6]) >> -LevelPackCard.projectionShift + 16;
          cameraZOrWorldZX = cameraPose[11] * deltaZ + (deltaX * cameraPose[9] + deltaY * cameraPose[10]) >> 16;
          centerXOrDirectionZ = MeshRasterState.projectionCenterX;
          centerY = MeshRasterState.projectionCenterY;
          vertexOrFace = 0;
          scanLoop1: while (true) {
            if (mesh.vertexCount > vertexOrFace) {
              pointX = mesh.vertexX[vertexOrFace];
              pointY = mesh.vertexY[vertexOrFace];
              pointZ = mesh.vertexZ[vertexOrFace];
              scaledViewX = cameraXOrWorldXX + (pointX * relativeXXOrWorldXY + relativeXYOrWorldXZ * pointY + pointZ * relativeXZOrDirectionIndex >> -LevelPackCard.projectionShift + 16);
              scaledViewY = cameraYOrWorldYX + (pointZ * relativeYZOrDirectionX + pointX * relativeYXOrWorldYY + pointY * relativeYYOrWorldYZ >> -LevelPackCard.projectionShift + 16);
              viewZ = cameraZOrWorldZX + (pointX * relativeZXOrWorldZY + relativeZYOrWorldZZ * pointY + pointZ * relativeZZOrDirectionY >> 16);
              branchOrCullValue = ~viewZ;
              boundOrMinimumDepth = -51;
              if (gameFlag == 0) {
                if (branchOrCullValue <= boundOrMinimumDepth) {
                  ArchiveNetworkRequest.projectedVertexX[vertexOrFace] = centerXOrDirectionZ + scaledViewX / viewZ;
                  ed.projectedVertexY[vertexOrFace] = scaledViewY / viewZ + centerY;
                  if (minimumDepth > viewZ) {
                    minimumDepth = viewZ;
                  }
                  Paddle.projectedVertexDepth[vertexOrFace] = viewZ;
                  if (viewZ > maximumDepth) {
                    maximumDepth = viewZ;
                  }
                } else {
                  Paddle.projectedVertexDepth[vertexOrFace] = -2147483648;
                }
                if (retainViewVertices) {
                  fh.viewVertexX[vertexOrFace] = scaledViewX >> LevelPackCard.projectionShift;
                  ep.viewVertexY[vertexOrFace] = scaledViewY >> LevelPackCard.projectionShift;
                  ml.viewVertexZ[vertexOrFace] = viewZ;
                }
                vertexOrFace++;
                continue;
              }
            } else {
              if (null != mesh.facePointOneX &&
                null != mesh.facePointOneY &&
                mesh.facePointOneZ != null &&
                null != mesh.facePointTwoX &&
                mesh.facePointTwoY != null &&
                null != mesh.facePointTwoZ &&
                mesh.facePointThreeX != null &&
                null != mesh.facePointThreeY &&
                mesh.facePointThreeZ != null) {
                vertexOrFace = 0;
                while (!(mesh.faceCount <= vertexOrFace)) {
                  pointX = mesh.facePointOneX[vertexOrFace];
                  pointY = mesh.facePointOneY[vertexOrFace];
                  pointZ = mesh.facePointOneZ[vertexOrFace];
                  nj.viewFacePointOneX[vertexOrFace] = (relativeXYOrWorldXZ * pointY + (relativeXXOrWorldXY * pointX + relativeXZOrDirectionIndex * pointZ) >> 16) + cameraXOrWorldXX;
                  nd.viewFacePointOneY[vertexOrFace] = cameraYOrWorldYX + (relativeYYOrWorldYZ * pointY + (pointX * relativeYXOrWorldYY + pointZ * relativeYZOrDirectionX) >> 16);
                  UnderwaterBackground.viewFacePointOneZ[vertexOrFace] = (relativeZXOrWorldZY * pointX - (-(pointY * relativeZYOrWorldZZ) - relativeZZOrDirectionY * pointZ) >> 16) + cameraZOrWorldZX;
                  pointX = mesh.facePointTwoX[vertexOrFace];
                  pointY = mesh.facePointTwoY[vertexOrFace];
                  pointZ = mesh.facePointTwoZ[vertexOrFace];
                  LevelPackCard.viewFacePointTwoX[vertexOrFace] = (pointX * relativeXXOrWorldXY + pointY * relativeXYOrWorldXZ + relativeXZOrDirectionIndex * pointZ >> 16) + cameraXOrWorldXX;
                  bf.viewFacePointTwoY[vertexOrFace] = cameraYOrWorldYX + (relativeYZOrDirectionX * pointZ + (relativeYXOrWorldYY * pointX + relativeYYOrWorldYZ * pointY) >> 16);
                  LevelCompleteScreen.viewFacePointTwoZ[vertexOrFace] = (pointZ * relativeZZOrDirectionY + (pointX * relativeZXOrWorldZY + pointY * relativeZYOrWorldZZ) >> 16) + cameraZOrWorldZX;
                  pointX = mesh.facePointThreeX[vertexOrFace];
                  pointY = mesh.facePointThreeY[vertexOrFace];
                  pointZ = mesh.facePointThreeZ[vertexOrFace];
                  vd.viewFacePointThreeX[vertexOrFace] = cameraXOrWorldXX + (pointY * relativeXYOrWorldXZ + (pointX * relativeXXOrWorldXY + pointZ * relativeXZOrDirectionIndex) >> 16);
                  NewAchievementsScreen.viewFacePointThreeY[vertexOrFace] = cameraYOrWorldYX + (relativeYZOrDirectionX * pointZ + relativeYXOrWorldYY * pointX + relativeYYOrWorldYZ * pointY >> 16);
                  BubbleDistortion.viewFacePointThreeZ[vertexOrFace] = (relativeZXOrWorldZY * pointX - (-(relativeZYOrWorldZZ * pointY) - pointZ * relativeZZOrDirectionY) >> 16) + cameraZOrWorldZX;
                  vertexOrFace++;
                  if (gameFlag != 0) {
                    return;
                  }
                }
              }
              if (transformDirections) {
                cameraXOrWorldXX = objectPose[3];
                cameraYOrWorldYX = objectPose[4];
                cameraZOrWorldZX = objectPose[5];
                relativeXXOrWorldXY = objectPose[6];
                relativeYXOrWorldYY = objectPose[7];
                relativeZXOrWorldZY = objectPose[8];
                relativeXYOrWorldXZ = objectPose[9];
                relativeYYOrWorldYZ = objectPose[10];
                relativeZYOrWorldZZ = objectPose[11];
                relativeXZOrDirectionIndex = 0;
                while (!(relativeXZOrDirectionIndex >= mesh.directionCount)) {
                  branchOrCullValue = ~relativeXZOrDirectionIndex;
                  boundOrMinimumDepth = ~wl.worldDirectionX.length;
                  if (gameFlag != 0) {
                    break scanLoop1;
                  }
                  if (branchOrCullValue <= boundOrMinimumDepth) {
                    break;
                  }
                  relativeYZOrDirectionX = mesh.directionX[relativeXZOrDirectionIndex];
                  relativeZZOrDirectionY = mesh.directionY[relativeXZOrDirectionIndex];
                  centerXOrDirectionZ = mesh.directionZ[relativeXZOrDirectionIndex];
                  wl.worldDirectionX[relativeXZOrDirectionIndex] = centerXOrDirectionZ * relativeXYOrWorldXZ + (cameraXOrWorldXX * relativeYZOrDirectionX + relativeZZOrDirectionY * relativeXXOrWorldXY) >> 16;
                  ff.worldDirectionY[relativeXZOrDirectionIndex] = centerXOrDirectionZ * relativeYYOrWorldYZ + relativeYXOrWorldYY * relativeZZOrDirectionY + relativeYZOrDirectionX * cameraYOrWorldYX >> 16;
                  nn.worldDirectionZ[relativeXZOrDirectionIndex] = relativeYZOrDirectionX * cameraZOrWorldZX - (-(relativeZZOrDirectionY * relativeZXOrWorldZY) - centerXOrDirectionZ * relativeZYOrWorldZZ) >> 16;
                  relativeXZOrDirectionIndex++;
                }
              }
              branchOrCullValue = cullBackfaces ? 1 : 0;
              boundOrMinimumDepth = minimumDepth;
            }
            break;
          }
          bm.sortMeshFaces(branchOrCullValue != 0, boundOrMinimumDepth, maximumDepth, false, mesh);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ka.C(");
          if (cameraPose == null) {
            cameraSummary = "null";
          } else {
            cameraSummary = "{...}";
          }
          objectContext = ((StringBuilder) (Object) contextBuilder).append(cameraSummary).append(',').append(obfuscationGuard).append(',');
          if (objectPose == null) {
            objectSummary = "null";
          } else {
            objectSummary = "{...}";
          }
          meshContext = ((StringBuilder) (Object) objectContext).append(objectSummary).append(',').append(retainViewVertices).append(',').append(transformDirections).append(',');
          if (mesh == null) {
            meshSummary = "null";
          } else {
            meshSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) meshContext).append(meshSummary).append(',').append(cullBackfaces).append(')').toString());
        }
    }

    MusicVoice() {
    }

    static {
        field_C = "<%0> is not on your friend list.";
    }
}
