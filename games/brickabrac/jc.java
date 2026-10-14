/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jc extends WidgetGroup {
    static RgbSprite field_J;
    static int field_K;
    static boolean field_H;
    private int field_L;
    private cp field_I;
    static NodeDeque field_M;
    boolean field_N;

    private final int h(byte param0) {
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 90) {
            field_M = (NodeDeque) null;
          }
          if (this.field_N) {
            stackIn_9_0 = (this.field_I.g(-125) != this) ? 0 : 256;
          } else {
            stackIn_9_0 = 0;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "jc.OB(" + param0 + ')');
        }
    }

    boolean h(int param0) {
        int var2_int = 0;
        int var3 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = this.h((byte) 90);
          var3 = var2_int - this.field_L;
          if (var3 > 0) {
            this.field_L = this.field_L + (-1 + var3 + 8) / 8;
          }
          if (param0 > var3) {
            this.field_L = this.field_L + (1 + (-16 + var3)) / 16;
          }
          stackIn_10_0 = (this.field_L == 0) && (var2_int == 0) && (!this.field_N);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "jc.H(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          field_J = null;
          field_M = null;
          if (param0 != -17) {
            field_M = (NodeDeque) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jc.W(" + param0 + ')');
        }
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 == this.field_L) {
            return;
          }
          if (this.field_L >= 256) {
            if (0 != layer) {
              return;
            }
            this.b(this.x + parentX, 274, this.y + parentY);
            super.drawLayer(parentY, parentX, layer, (byte) -11);
            return;
          }
          if (nl.field_e == null ||
            !(this.width <= nl.field_e.width) ||
            !(this.height <= nl.field_e.height)) {
            nl.field_e = new RgbSprite(this.width, this.height);
          }
          IndexedSpriteGeometry.pushSpriteRaster(-109, nl.field_e);
          Rasterizer2D.clear();
          this.b(0, obfuscationGuard ^ -281, 0);
          super.drawLayer(-parentY - this.y, -parentX - this.x, layer, obfuscationGuard);
          sc.popRaster(-117);
          nl.field_e.b(parentX + this.x, parentY + this.y, this.field_L);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jc.J(" + parentY + ',' + parentX + ',' + layer + ',' + obfuscationGuard + ')');
        }
    }

    final Widget g(byte param0) {
        Widget var2 = null;
        Widget stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          var2 = super.g(param0);
          if (var2 != null) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          return (Widget) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "jc.GB(" + param0 + ')');
        }
    }

    jc(cp param0, int param1, int param2) {
        super(SpriteGeometry.field_y - param1 >> 1, -param2 + r.field_w >> 1, param1, param2, (WidgetRenderer) null);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_N = false;
          this.field_I = param0;
          this.field_L = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("jc.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2) {
        try {
          if (!param0) {
            field_H = false;
          }
          this.setBounds(param1, -param2 + SpriteGeometry.field_y >> 1, r.field_w - param1 >> 1, (byte) -119, param2);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jc.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void b(int param0, int param1, int param2);

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ArchiveNetworkRequest.a("", 121, param0);
          if (param1 != 97) {
            jc.a((byte) -100);
          }
          mi.a((byte) -111, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("jc.PB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(int param0) {
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 > -22) {
            this.field_L = 90;
          }
          this.field_L = this.h((byte) 90);
          stackIn_7_0 = (this.field_L == 0) && (!this.field_N);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "jc.E(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param2 >= -84) {
            jc.a((byte) 8);
          }
          if (0 == param1) {
            if (pp.field_a == 14) {
              if (0 != (3 & param0)) {
                pp.field_a = 0;
                jl.field_a = 250;
                ga.field_i = 0;
              }
              if ((param0 & 4) == 0) {
                return;
              }
              pp.field_a = 2;
              ga.field_i = 2;
              jl.field_a = 25;
              return;
            }
            if (pp.field_a != 0 &&
              pp.field_a != 1) {
              if (!MusicVoice.a((byte) 91)) {
                return;
              }
              if (ga.field_i == 0) {
                if (param0 == 0) {
                  return;
                }
                if ((param0 & 4) != 0) {
                  pp.field_a = 2;
                  jl.field_a = 25;
                  ga.field_i = 2;
                }
                GzipInflater.b(-8);
                return;
              }
              if (ga.field_i != 1 &&
                ga.field_i != 12) {
                return;
              }
              if (0 == (param0 & 4)) {
                return;
              }
              GzipInflater.b(-8);
              return;
            }
            if ((4 & param0) == 0) {
              return;
            }
            ga.field_i = 2;
            pp.field_a = 2;
            jl.field_a = 25;
            return;
          }
          if (1 == param1) {
            MatchCompleteScreen.field_E = MatchCompleteScreen.field_E + 1;
            if ((param0 & 2) != 0) {
              GameClock.field_d = GameClock.field_d + 1;
            }
            if (pp.field_a != 3) {
              return;
            }
            if (MatchCompleteScreen.field_E <= 2 &&
              GameClock.field_d <= 0) {
              return;
            }
            SpriteGeometry.field_v = MembershipBenefitsScreen.clientTick;
            ga.field_i = 4;
            tb.field_eb = o.field_a;
            pp.field_a = -1;
            return;
          }
          if (param1 == 2) {
            if ((BitPacketBuffer.field_q & 1 << param0) != 0) {
              return;
            }
            kf.field_k = param0;
            ga.field_i = 6;
            if (0 == BitPacketBuffer.field_q &&
              !QuickChatHelpDialog.field_Sb) {
              ga.field_i = 5;
              tb.field_eb = tb.field_db + "<br><br>" + sl.field_A[kf.field_k];
            } else {
              ArchiveNetworkRequest.field_G = pp.field_a;
              tb.field_eb = sl.field_A[kf.field_k];
            }
            pp.field_a = -1;
            BitPacketBuffer.field_q = BitPacketBuffer.field_q | 1 << param0;
            QuickChatHelpDialog.field_Sb = true;
            SpriteGeometry.field_v = MembershipBenefitsScreen.clientTick;
            return;
          }
          if (param1 == 3) {
            if (pp.field_a == 5) {
              ga.field_i = 8;
              jl.field_a = 250;
              pp.field_a = -1;
              tb.field_eb = rd.a(IntNode.field_n, new String[]{ui.field_b}, (byte) 103);
              wc.field_b = true;
              return;
            }
          } else {
            if (4 == param1) {
              if (pp.field_a != 5) {
                return;
              }
              ga.field_i = 9;
              pp.field_a = -1;
              jl.field_a = 250;
              tb.field_eb = rd.a(ByteStorage.field_c, new String[]{ui.field_b}, (byte) 103);
              wc.field_b = true;
              return;
            }
            if (5 != param1) {
              if (param1 != 6) {
                return;
              }
              if (pp.field_a == 11) {
                if (cm.field_s) {
                  return;
                }
                ga.field_i = 12;
                pp.field_a = -1;
                tb.field_eb = rh.field_a;
                SpriteGeometry.field_v = MembershipBenefitsScreen.clientTick;
                return;
              }
            } else {
              if (pp.field_a == 5) {
                ga.field_i = 9;
                jl.field_a = 250;
                pp.field_a = -1;
                tb.field_eb = rd.a(ByteStorage.field_c, new String[]{ui.field_b}, (byte) 103);
                wc.field_b = true;
                return;
              }
              if (!rf.field_f) {
                if (wl.field_N) {
                  return;
                }
                ArchiveNetworkRequest.field_G = pp.field_a;
                ga.field_i = 10;
                rf.field_f = true;
                tb.field_eb = QuickChatHelpDialog.field_Tb;
                pp.field_a = -1;
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var3), "jc.NB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_K = 4;
        field_M = null;
    }
}
