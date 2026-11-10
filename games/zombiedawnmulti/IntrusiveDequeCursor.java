/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class IntrusiveDequeCursor {
    static boolean[][] field_g;
    static int field_i;
    static String field_h;
    static String field_j;
    static String field_a;
    static byte[] field_c;
    static boolean field_e;
    static boolean field_k;
    static Sprite[] field_b;
    private IntrusiveDeque field_d;
    private IntrusiveNode field_f;

    final static boolean isModifierUpgrade(int param0, boolean param1) {
        if (param1) {
          IntrusiveDequeCursor.releaseStatics(76);
          if (param0 < 32) {
            return false;
          }
          if (38 >= param0) {
            return true;
          }
          return false;
        }
        if (param0 < 32) {
          return false;
        }
        if (38 >= param0) {
          return true;
        }
        return false;
    }

    final static int pollServerConnection(int param0) {
        try {
          int stackIn_15_0 = 0;
          int stackIn_23_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_32_0 = 0;
          int stackIn_36_0 = 0;
          int stackIn_38_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (4 <= SharedTransportGlobals.field_a.field_n) {
            if (SharedTransportGlobals.field_a.field_p == -1) {
              return 3;
            }
            if (SharedTransportGlobals.field_a.field_p != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (GrowableIntList.field_d == 0) {
              IntroScreen.field_o = ObjectFactoryHelpers.field_a.requestSocket(RankingsRequest.field_r, GameHud.field_f, (byte) -120);
              GrowableIntList.field_d = GrowableIntList.field_d + 1;
            }
            if (GrowableIntList.field_d == 1) {
              if (IntroScreen.field_o.field_f == 2) {
                stackIn_15_0 = PendingIntArrayRequest.handleConnectionFailure(-1, 5);
                return stackIn_15_0;
              }
              if (1 == IntroScreen.field_o.field_f) {
                GrowableIntList.field_d = GrowableIntList.field_d + 1;
              }
            }
            if (GrowableIntList.field_d == 2) {
              ColourPickerWidget.field_Gb = new BufferedSocket((java.net.Socket) (IntroScreen.field_o.field_d), ObjectFactoryHelpers.field_a);
              var2 = new PacketBuffer(13);
              AlignedIconLabel.writeHandshakeHeader(IsaacRandom.field_b, var2, BufferedSocket.field_q, AudioStartupHelpers.field_e, (byte) -124);
              var2.writeByte(param0 - 19244, 15);
              var2.writeInt(-128, CacheEntry.field_q);
              ColourPickerWidget.field_Gb.write(0, -100, 13, var2.payload);
              GrowableIntList.field_d = GrowableIntList.field_d + 1;
              DiskArchiveRequest.field_A = 30000L + ClockAndScreenHelpers.monotonicMillis((byte) 43);
            }
            if (param0 != 19352) {
              stackIn_23_0 = 36;
              return stackIn_23_0;
            }
            if (GrowableIntList.field_d == 3) {
              if (ColourPickerWidget.field_Gb.available(116) > 0) {
                var1_int = ColourPickerWidget.field_Gb.readByte((byte) 59);
                if (var1_int != 0) {
                  stackIn_32_0 = PendingIntArrayRequest.handleConnectionFailure(var1_int, 5);
                  return stackIn_32_0;
                }
                GrowableIntList.field_d = GrowableIntList.field_d + 1;
              } else {
                if (ClockAndScreenHelpers.monotonicMillis((byte) 124) > DiskArchiveRequest.field_A) {
                  stackIn_29_0 = PendingIntArrayRequest.handleConnectionFailure(-2, param0 - 19347);
                  return stackIn_29_0;
                }
              }
            }
            if (4 != GrowableIntList.field_d) {
              stackIn_38_0 = -1;
              return stackIn_38_0;
            }
            SharedTransportGlobals.field_a.setConnection(PacketBuffer.field_f, ColourPickerWidget.field_Gb, 104);
            IntroScreen.field_o = null;
            GrowableIntList.field_d = 0;
            ColourPickerWidget.field_Gb = null;
            stackIn_36_0 = 0;
            return stackIn_36_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return PendingIntArrayRequest.handleConnectionFailure(-3, 5);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_a = null;
        if (param0 == -1) {
          field_g = (boolean[][]) null;
          field_h = null;
          field_b = null;
          field_j = null;
          return;
        }
        IntrusiveDequeCursor.releaseStatics(-29);
        field_g = (boolean[][]) null;
        field_h = null;
        field_b = null;
        field_j = null;
    }

    final IntrusiveNode startForwardFrom(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -4) {
            IntrusiveDequeCursor.isModifierUpgrade(92, false);
          }
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_d.sentinel.next;
          }
          if (var3 == this.field_d.sentinel) {
            this.field_f = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.field_f = var3.next;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ch.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode startBackwardFrom(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_d.sentinel.previous;
          } else {
            var3 = param1;
          }
          if (var3 == this.field_d.sentinel) {
            this.field_f = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          this.field_f = var3.previous;
          if (param0 != 2680) {
            IntrusiveDequeCursor.isModifierUpgrade(95, true);
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ch.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final IntrusiveNode next(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -3) {
          field_i = -81;
          var2 = this.field_f;
          if (this.field_d.sentinel == var2) {
            this.field_f = null;
            return null;
          }
          this.field_f = var2.next;
          return var2;
        }
        var2Lifetime1 = this.field_f;
        if (this.field_d.sentinel == var2Lifetime1) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final IntrusiveNode last(int param0) {
        IntrusiveNode var2 = this.field_d.sentinel.previous;
        if (var2 == this.field_d.sentinel) {
          this.field_f = null;
          return null;
        }
        if (param0 == -3) {
          this.field_f = var2.previous;
          return var2;
        }
        field_g = (boolean[][]) null;
        this.field_f = var2.previous;
        return var2;
    }

    final IntrusiveNode first(int param0) {
        IntrusiveNode var2 = this.field_d.sentinel.next;
        if (var2 == this.field_d.sentinel) {
          this.field_f = null;
          return null;
        }
        if (param0 == 32397) {
          this.field_f = var2.next;
          return var2;
        }
        this.last(62);
        this.field_f = var2.next;
        return var2;
    }

    final IntrusiveNode previous(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 >= -26) {
          field_e = true;
          var2 = this.field_f;
          if (var2 != this.field_d.sentinel) {
            this.field_f = var2.previous;
            return var2;
          }
          this.field_f = null;
          return null;
        }
        var2Lifetime1 = this.field_f;
        if (var2Lifetime1 != this.field_d.sentinel) {
          this.field_f = var2Lifetime1.previous;
          return var2Lifetime1;
        }
        this.field_f = null;
        return null;
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ch.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
