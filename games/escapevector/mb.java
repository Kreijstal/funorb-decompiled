/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static Sprite[] field_f;
    static uf field_g;
    static String[] field_b;
    private int field_e;
    private int field_c;
    private int field_d;
    static PcmSampleStream field_a;

    final static void a(byte param0) {
        boolean var2 = false;
        int var3 = EscapeVector.obfuscationControl;
        try {
          DialogueScreen var4 = DropTargetWidget.f((byte) -49);
          if (p.field_h != 0) {
            if (!aj.b(-124)) {
              if (1 == p.field_h) {
                kh.a(true, -1230, true);
              }
              if (p.field_h == 2) {
                PacketBuffer.field_h = false;
                gi.a((byte) -126);
                di.field_d = null;
                if (null != IntValueNode.field_i) {
                  ml.a(IntValueNode.field_i, 3, (byte) 101);
                }
                ci.a(0);
              }
            }
            p.field_h = 0;
            mj.field_d = 0;
            gi.a((byte) -105);
          }
          if (param0 >= -47) {
            return;
          }
          if (var4 == null) {
            if (null == BoundedRandomAccessFile.activeSession &&
              !wk.field_c) {
              pf.e((byte) -111);
            }
            if (wk.field_c) {
              kc.a((byte) -75);
            } else if (TextLayout.field_b) {
              qj.a(-883);
              UiComponent.field_o.e(117);
            } else if (0 <= SelfDestructEffects.field_q) {
              sn.c(-1);
              CheckboxPainter.field_l.j(2525);
            } else if (!PacketBuffer.field_h) {
              if (e.field_a) {
                var2 = (da.field_b.j(-122));
                if (var2) {
                  return;
                }
              } else if (CheckboxPainter.field_n) {
                mn.d((byte) -120);
                var2 = (rc.field_a.f(-91));
                if (var2) {
                  return;
                }
              } else if (ch.field_b) {
                var2 = (qk.field_e.f(-1));
                if (var2) {
                  return;
                }
              } else if (pl.field_q != null) {
                ff.a((byte) 127);
              } else if (null != da.field_c) {
                rl.e(-46);
              } else {
                if (mj.field_d < 1000) {
                  mj.field_d = mj.field_d + 1;
                }
                BoundedRandomAccessFile.activeSession.updateSession(-41);
              }
            } else if (mm.a(-59)) {
              return;
            }
            lh.a(72);
          } else {
            var4.advanceDialogue((byte) 62);
          }
          if (aj.b(-102)) {
            return;
          }
          TrackerMusicDefinition.field_f.d(-32464);
          ua.field_c.b(126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "mb.F(" + param0 + ')');
        }
    }

    final static boolean b(byte param0) {
        try {
          boolean stackIn_4_0 = !(aj.b(-96));
          boolean var1_int = stackIn_4_0;
          if (var1_int &&
            !TrackerMusicDefinition.field_f.field_h &&
            !TrackerMusicDefinition.field_f.field_c) {
            return false;
          }
          if (var1_int &&
            !ua.field_c.a(-19836)) {
            return false;
          }
          if (var1_int &&
            UiContainer.e((byte) 98) &&
            se.field_b == null) {
            return false;
          }
          if (var1_int &&
            UiContainer.e((byte) 116) &&
            ArchiveProvider.field_b == null) {
            return false;
          }
          if (var1_int &&
            UiContainer.e((byte) 111) &&
            null != he.field_u) {
            return false;
          }
          if (param0 <= -61) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "mb.A(" + param0 + ')');
        }
    }

    final static void a(Sprite param0, int param1) {
        String stackIn_8_2 = null;
        try {
          TextFieldValidator.field_j = param0;
          of.field_a = new Sprite(param0.fullWidth, param0.fullHeight);
          if (param1 > -11) {
            field_a = (PcmSampleStream) null;
          }
          int[] var3 = new int[4];
          int[] var2 = var3;
          SoftwareRasterizer.a(var3);
          of.field_a.g();
          param0.c(0, 0);
          md.field_D.a(107);
          SoftwareRasterizer.b(var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_7_0 = runtimeException;
          StringBuilder stackIn_7_1 = new StringBuilder().append("mb.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        try {
          field_b = null;
          field_g = null;
          field_f = null;
          if (guard != 4) {
            mb.b((byte) -110);
          }
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "mb.B(" + guard + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        try {
          if (this.field_c != param1) {
            return;
          }
          if (this.field_d > param2) {
            return;
          }
          GameplaySession var4 = BoundedRandomAccessFile.activeSession;
          if (param0 != 11827) {
            String[] var5 = (String[]) null;
            mb.a((String[]) null, 86);
          }
          if (var4 == null) {
            return;
          }
          var4.a(param1, false, this.field_e, 255 ^ this.field_e);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var4_ref), "mb.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    mb(int param0, int param1, int param2) {
        try {
          this.field_c = param1;
          this.field_d = param0;
          this.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "mb.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(String[] args, int param1) {
        String stackIn_13_2 = null;
        try {
          if (null != ol.field_E) {
            ol.field_E.field_G.setSuggestions(args, (byte) -103);
          }
          if (param1 != 4) {
            return;
          }
          if (rc.field_b != null) {
            rc.field_b.field_K.setSuggestions(args, (byte) -103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("mb.E(");
          if (args == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = new Sprite[17];
        field_b = new String[]{"Congratulations, commander. Thanks to your superb skills, all of our technology has been recovered.", "The aliens will not be happy. It is now only a matter of time before they come back to Earth.", "This time, however, we and our valuable weapons will be ready."};
    }
}
