/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends CircleBody {
    static int[] field_D;
    private int field_C;
    int field_w;
    int field_E;
    static int field_z;
    static String field_A;
    static int[] field_B;
    private int field_x;
    int field_y;
    int field_v;

    final static void a(IntrusiveNode param0, int param1, IntrusiveNode param2) {
        try {
          if (null != param0.previous) {
            param0.unlink((byte) 111);
          }
          param0.previous = param2.previous;
          param0.next = param2;
          param0.previous.next = param0;
          int var3_int = 73 / ((-34 - param1) / 43);
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "il.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void readBodySnapshot(int obfuscationGuard, PacketBuffer packet) {
        try {
          super.readBodySnapshot(123, packet);
          this.radius256 = packet.readUnsignedByte(255) << 8;
          this.field_C = packet.readUnsignedByte(255);
          this.field_E = packet.readUnsignedShort(65280);
          if (obfuscationGuard <= 89) {
            IntrusiveNode var4 = (IntrusiveNode) null;
            il.a((IntrusiveNode) null, 19, (IntrusiveNode) null);
          }
          this.field_w = packet.readUnsignedShort(65280);
          this.field_y = packet.readUnsignedShort(65280);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "il.L(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        int var3 = BrickABrac.field_J ? 1 : 0;
        this.y256 = this.y256 + this.velocityY256;
        if (param0 == -2081170685) {
          this.x256 = this.x256 + this.velocityX256;
          if (-6144 > this.y256) {
            this.y256 = this.y256 + 129024;
          }
          if (this.field_C == 0) {
            if (this.stateWord == 32) {
              this.field_C = 1;
            }
            this.field_v = this.field_v + 500;
            this.stateWord = this.stateWord + 1;
            return;
          }
          if (this.field_C != 1) {
            if (this.field_C != 2) {
              this.stateWord = this.stateWord + 1;
              return;
            }
            if (this.field_x < this.field_v) {
              this.field_v = this.field_v - this.field_x;
              if (this.stateWord == 564) {
                this.unlink((byte) 111);
              }
              this.stateWord = this.stateWord + 1;
              return;
            }
            if (this.field_x / 2 < this.field_v) {
              this.field_v = this.field_v * 4 / 5;
              if (this.stateWord == 564) {
                this.unlink((byte) 111);
              }
              this.stateWord = this.stateWord + 1;
              return;
            }
            if (this.stateWord == 564) {
              this.unlink((byte) 111);
            }
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.field_v = (this.field_y * sa.a(this.field_E + this.stateWord * this.field_w, param0 ^ 2081174780) >> 16) + 16000;
          if (this.stateWord == 532) {
            this.field_C = 2;
            this.field_x = this.field_v / 32;
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.stateWord = this.stateWord + 1;
          return;
        }
        this.field_C = 106;
        this.x256 = this.x256 + this.velocityX256;
        if (-6144 <= this.y256) {
          if (this.field_C == 0) {
            if (this.stateWord == 32) {
              this.field_C = 1;
            }
            this.field_v = this.field_v + 500;
            this.stateWord = this.stateWord + 1;
            return;
          }
          if (this.field_C != 1) {
            if (this.field_C != 2) {
              this.stateWord = this.stateWord + 1;
              return;
            }
            if (this.field_x >= this.field_v) {
              if (this.field_x / 2 >= this.field_v) {
                if (this.stateWord == 564) {
                  this.unlink((byte) 111);
                }
                this.stateWord = this.stateWord + 1;
                return;
              }
              this.field_v = this.field_v * 4 / 5;
              if (this.stateWord != 564) {
                this.stateWord = this.stateWord + 1;
                return;
              }
              this.unlink((byte) 111);
              this.stateWord = this.stateWord + 1;
              return;
            }
            this.field_v = this.field_v - this.field_x;
            if (this.stateWord != 564) {
              this.stateWord = this.stateWord + 1;
              return;
            }
            this.unlink((byte) 111);
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.field_v = (this.field_y * sa.a(this.field_E + this.stateWord * this.field_w, param0 ^ 2081174780) >> 16) + 16000;
          if (this.stateWord == 532) {
            this.field_C = 2;
            this.field_x = this.field_v / 32;
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.stateWord = this.stateWord + 1;
          return;
        }
        this.y256 = this.y256 + 129024;
        if (this.field_C == 0) {
          if (this.stateWord != 32) {
            this.field_v = this.field_v + 500;
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.field_C = 1;
          this.field_v = this.field_v + 500;
          this.stateWord = this.stateWord + 1;
          return;
        }
        if (this.field_C != 1) {
          if (this.field_C != 2) {
            this.stateWord = this.stateWord + 1;
            return;
          }
          if (this.field_x >= this.field_v) {
            if (this.field_x / 2 >= this.field_v) {
              if (this.stateWord != 564) {
                this.stateWord = this.stateWord + 1;
                return;
              }
              this.unlink((byte) 111);
              this.stateWord = this.stateWord + 1;
              return;
            }
            this.field_v = this.field_v * 4 / 5;
            if (this.stateWord == 564) {
              this.unlink((byte) 111);
              this.stateWord = this.stateWord + 1;
              return;
            }
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.field_v = this.field_v - this.field_x;
          if (this.stateWord == 564) {
            this.unlink((byte) 111);
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.stateWord = this.stateWord + 1;
          return;
        }
        this.field_v = (this.field_y * sa.a(this.field_E + this.stateWord * this.field_w, param0 ^ 2081174780) >> 16) + 16000;
        if (this.stateWord != 532) {
          this.stateWord = this.stateWord + 1;
          return;
        }
        this.field_C = 2;
        this.field_x = this.field_v / 32;
        this.stateWord = this.stateWord + 1;
    }

    final static void a(ie param0, PlatformServices param1, int param2, int param3, int param4, int param5, java.awt.Component param6, boolean param7) {
        try {
          PcmPlayer.a(param2, param7, 10);
          DirectByteStorage.field_f = PcmPlayer.a(param1, param6, 0, param4);
          jk.field_w = PcmPlayer.a(param1, param6, 1, param3);
          ob.soundMixer = new AudioMixer();
          AchievementBrowserScreen.field_u = param5 * param3 / param2;
          jk.field_w.setRootStream(ob.soundMixer);
          m.field_f = param0;
          m.field_f.a(ScorePopup.field_p, false);
          DirectByteStorage.field_f.setRootStream(m.field_f);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "il.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 <= 122) {
          return;
        }
        field_A = null;
        field_D = null;
        field_B = null;
    }

    il(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(byte param0, int param1) {
        if (param0 != 86) {
          il.e((byte) -105);
          wp.a(param0 ^ 87, param1);
          return;
        }
        wp.a(param0 ^ 87, param1);
    }

    final static void a(int param0, RgbSprite param1, RgbSprite param2, int param3, int param4, RgbSprite param5, int param6, int param7, int param8, int param9, RgbSprite param10, int param11) {
        try {
          param2.drawAt(param9 + ((-param2.canvasWidth + param11) / 2 + (param0 * 5 >> 16)), param8);
          param5.drawTransparent((10 * param0 >> 16) + ((-param5.canvasWidth + param11) / 2 + param9 - 87 / param3), -(80 / param3) + (-param5.canvasHeight + 480 + (param6 + param8)));
          param1.drawTransparent(-(5 / param3) + ((param0 * 20 >> 16) + ((param11 - param1.canvasWidth) / 2 + param9)), -param1.canvasHeight + (480 + param6 + param8));
          og.a(-121, 16, 0, param10, 16777215, -(5 / param3) + ((param0 * 2 >> 16) + ((param11 - param10.canvasWidth) / param4 + param9)), 480 + (param8 + param6 - param10.canvasHeight));
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "il.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ')');
        }
    }

    final int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        java.awt.Component var4 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 79) {
            var4 = (java.awt.Component) null;
            il.a((ie) null, (PlatformServices) null, 83, 59, 15, -106, (java.awt.Component) null, true);
          }
          var3_int = super.computeSyncChecksum(120, diagnostics) ^ -72674834;
          if (diagnostics != null) {
            discarded$3 = diagnostics.append(this.x256 + " " + this.y256 + " ");
            discarded$4 = diagnostics.append(this.field_E + " " + this.stateWord + " ");
            discarded$5 = diagnostics.append("\n");
          }
          var3_int = var3_int ^ 97 * this.field_C + 9269 << 3;
          var3_int = var3_int ^ 39185 + 47 * this.field_v << 13;
          var3_int = var3_int ^ this.field_E * 17 + 31 << 2;
          var3_int = var3_int ^ 30 + 19 * this.field_w << 22;
          var3_int = var3_int ^ 27 * this.field_y + 21554 << 10;
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("il.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean e(byte param0) {
        if (param0 < -77) {
          return MatchResultScreen.field_t > 250 ? true : false;
        }
        RgbSprite var2 = (RgbSprite) null;
        il.a(-62, (RgbSprite) null, (RgbSprite) null, 105, -38, (RgbSprite) null, 49, -61, 61, -69, (RgbSprite) null, 126);
        return MatchResultScreen.field_t > 250 ? true : false;
    }

    static {
        field_D = new int[8192];
        field_z = -1;
        field_A = "Show chat";
    }
}
