/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioService implements Runnable {
    static String[][] field_b;
    volatile boolean running;
    static String field_a;
    static fc field_h;
    SystemTaskService tasks;
    volatile boolean stopRequested;
    volatile AudioOutput[] outputs;
    static String[] field_d;

    public final void run() {
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var4 = EscapeVector.obfuscationControl;
        this.running = true;
        try {
          try {
            boolean decompiledFrameCompleted0 = true;
            while (true) {
              if (!this.stopRequested) {
                if (var4 != 0) {
                  decompiledRegionSelector0 = 1;
                  decompiledFrameCompleted0 = false;
                  break;
                }
                int var1_int = 0;
                while (var1_int < 2) {
                  AudioOutput var2 = this.outputs[var1_int];
                  if (var2 != null) {
                    var2.serviceOutput();
                  }
                  var1_int++;
                }
                en.a((byte) -95, 10L);
                FullscreenFocusCanvas.a((byte) -61, this.tasks, (Object) null);
                continue;
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              decompiledRegionSelector0 = 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception exception = (Exception) (Object) decompiledCaughtException;
            pf.a(false, (String) null, (Throwable) ((Object) exception));
            decompiledRegionSelector0 = 2;
          }
          if (decompiledRegionSelector0 == 0) {
            decompiledRegionSelector1 = 0;
          } else if (decompiledRegionSelector0 == 1) {
            decompiledRegionSelector1 = 1;
          } else {
            decompiledRegionSelector1 = 2;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          Throwable var3 = decompiledCaughtException;
          this.running = false;
          throw AudioService.<RuntimeException>rethrowUnchecked(var3);
        }
        if (decompiledRegionSelector1 == 0) {
          this.running = false;
        } else if (decompiledRegionSelector1 != 1) {
          this.running = false;
        }
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        int stackIn_11_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int var15 = EscapeVector.obfuscationControl;
        int var9 = param0 + param2 + param3;
        Sprite[] var10 = new Sprite[]{new Sprite(var9, var9), new Sprite(param8, var9), new Sprite(var9, var9), new Sprite(var9, param8), new Sprite(64, 64), new Sprite(var9, param8), new Sprite(var9, var9), new Sprite(param8, var9), new Sprite(var9, var9)};
        Sprite[] var11_ref_ed__ = var10;
        int var12 = 0;
        scanLoop1: while (true) {
          if (var11_ref_ed__.length > var12) {
            Sprite var13 = var11_ref_ed__[var12];
            stackIn_11_0 = 0;
            if (var15 != 0) {
              break scanLoop1;
            }
            int var14 = stackIn_11_0;
            while (var13.pixels.length > var14) {
              var13.pixels[var14] = param7;
              var14++;
            }
            var12++;
            continue scanLoop1;
          }
          stackIn_11_0 = param5;
          break;
        }
        if (stackIn_11_0 != 33) {
          return (Sprite[]) null;
        }
        int var11 = 0;
        scanLoop2: while (true) {
          if (var11 < param0) {
            stackIn_24_0 = 0;
            if (var15 != 0) {
              break scanLoop2;
            }
            int var12Lifetime1 = stackIn_24_0;
            while (var9 > var12Lifetime1) {
              var10[6].pixels[var12Lifetime1 + var9 * (-var11 + var9 - 1)] = param6;
              var10[8].pixels[var12Lifetime1 + (-1 + var9 - var11) * var9] = param6;
              var10[2].pixels[-1 + (var9 - (var11 - var12Lifetime1 * var9))] = param6;
              var10[8].pixels[var12Lifetime1 * var9 - var11 - (-var9 + 1)] = param6;
              var12Lifetime1++;
            }
            var11++;
            continue scanLoop2;
          }
          stackIn_24_0 = 0;
          break;
        }
        int var11Lifetime1 = stackIn_24_0;
        while (true) {
          int stackIn_26_0 = param0;
          int stackIn_26_1 = var11Lifetime1;
          if (stackIn_26_0 > stackIn_26_1) {
            stackIn_36_0 = 0;
            if (var15 == 0) {
              int var12Lifetime2 = stackIn_36_0;
              while (var9 > var12Lifetime2) {
                var10[0].pixels[var9 * var11Lifetime1 + var12Lifetime2] = param4;
                var10[0].pixels[var9 * var12Lifetime2 + var11Lifetime1] = param4;
                stackIn_26_0 = var9 - var11Lifetime1;
                stackIn_26_1 = var12Lifetime2;
                if (stackIn_26_0 > stackIn_26_1) {
                  var10[2].pixels[var12Lifetime2 + var9 * var11Lifetime1] = param4;
                  var10[6].pixels[var12Lifetime2 * var9 + var11Lifetime1] = param4;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            stackIn_36_0 = 0;
          }
          var11Lifetime1 = stackIn_36_0;
          scanLoop3: while (true) {
            if (param8 > var11Lifetime1) {
              stackIn_47_0 = 0;
              if (var15 != 0) {
                break scanLoop3;
              }
              int var12Lifetime2Lifetime1 = stackIn_47_0;
              while (param0 > var12Lifetime2Lifetime1) {
                var10[7].pixels[var11Lifetime1 + param8 * (-1 + (var9 - var12Lifetime2Lifetime1))] = param6;
                var10[5].pixels[var11Lifetime1 * var9 + (var9 - (1 + var12Lifetime2Lifetime1))] = param6;
                var10[1].pixels[param8 * var12Lifetime2Lifetime1 + var11Lifetime1] = param4;
                var10[3].pixels[var12Lifetime2Lifetime1 + var11Lifetime1 * var9] = param4;
                var12Lifetime2Lifetime1++;
              }
              var11Lifetime1++;
              continue scanLoop3;
            }
            stackIn_47_0 = 0;
            break;
          }
          var11Lifetime1 = stackIn_47_0;
          scanLoop4: while (param8 >> 1 > var11Lifetime1) {
            int var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (var12Lifetime2Lifetime2 < param3) {
                var10[1].pixels[(var9 - var12Lifetime2Lifetime2 - 1) * param8 + var11Lifetime1] = param1;
                var10[3].pixels[var11Lifetime1 * var9 + (var9 - (1 + var12Lifetime2Lifetime2))] = param1;
                var10[7].pixels[var12Lifetime2Lifetime2 * param8 + var11Lifetime1] = param1;
                var10[5].pixels[var12Lifetime2Lifetime2 + var9 * var11Lifetime1] = param1;
                var12Lifetime2Lifetime2++;
                if (var15 == 0) {
                  continue;
                }
              } else {
                var11Lifetime1++;
              }
              break;
            }
            if (var15 == 0) {
              continue scanLoop4;
            }
            break;
          }
          return var10;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 < 14) {
                return;
              }
              java.net.URL var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              param1.getAppletContext().showDocument(sh.a((byte) 119, param1, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var2_ref2;
            StringBuilder stackIn_8_1 = new StringBuilder().append("ge.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        int stackIn_15_0 = 0;
        byte[] var5 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (param0 != 124) {
            field_a = (String) null;
          }
          CipherPacketBuffer var9 = om.field_g;
          int var2 = var9.readUnsignedByte(param0 ^ 124);
          if (var2 != 0) {
            if (var2 != 1) {
              pf.a(false, "A1: " + hf.b((byte) -65), (Throwable) null);
              nm.a(16);
              if (var6 == 0) {
                return;
              }
            }
            int var3 = var9.readInt(-5053);
            bd var4_ref_bd = (bd) (rd.field_b.first(false));
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var4_ref_bd != null) {
                stackIn_15_0 = var4_ref_bd.field_i;
                decompiledFrameRemainder0 = (var6 == 0);
                if (decompiledFrameRemainder0 &&
                  stackIn_15_0 != var3) {
                  var4_ref_bd = (bd) (rd.field_b.next((byte) 70));
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var4_ref_bd != null) {
                  var4_ref_bd.unlink((byte) -68);
                  if (var6 == 0) {
                    return;
                  }
                  break;
                }
                stackIn_15_0 = 16;
              }
              nm.a(stackIn_15_0);
              return;
            }
          }
          ei var8 = (ei) (SpriteState.field_w.first(false));
          if (var8 == null) {
            nm.a(16);
            return;
          }
          int var4 = var9.readUnsignedByte(0);
          if (var4 != 0) {
            byte[] var11 = new byte[var4];
            byte[] var10 = var11;
            byte[] var7 = var10;
            var5 = var7;
            var9.a(var11, (byte) -96, 0, var4);
          }
          if (var4 == 0 ||
            var6 != 0) {
            var5 = null;
          }
          var9.position = var9.position + 4;
          if (!var9.h(param0 ^ 124)) {
            nm.a(16);
            return;
          }
          var8.field_g = true;
          var8.field_h = var5;
          var8.unlink((byte) -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ge.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7, int[] param8, int param9) {
        String stackIn_20_2 = null;
        String stackIn_23_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (param4 > -55) {
            return;
          }
          int var10_int = param7;
          while (var10_int < 0) {
            if (var11 != 0) {
              return;
            }
            param5 = param0;
            while (param5 < 0) {
              int incrementValue$0 = param6;
              param6++;
              int stackIn_15_0 = -1;
              int stackIn_15_1 = ~param1[incrementValue$0];
              if (stackIn_15_0 == stackIn_15_1) {
                param9++;
              } else {
                param2 = param8[param9];
                int incrementValue$1 = param9;
                param9++;
                param8[incrementValue$1] = -(ae.a(param2, 16579836) >> 2) + param2;
              }
              param5++;
            }
            int stackIn_15_0Lifetime1 = param9;
            int stackIn_15_1Lifetime1 = param3;
            param9 = stackIn_15_0Lifetime1 + stackIn_15_1Lifetime1;
            var10_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var10;
          StringBuilder stackIn_19_1 = new StringBuilder().append("ge.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param9).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        if (guard >= -11) {
          AudioService.a((byte) -77, (java.applet.Applet) null);
        }
        field_b = (String[][]) null;
        field_d = null;
        field_h = null;
        field_a = null;
    }

    AudioService() {
        this.outputs = new AudioOutput[2];
        this.stopRequested = false;
        this.running = false;
    }

    static {
        field_a = "Auto-shield reactivated";
        field_h = new fc();
        field_d = new String[]{"All scores", "My scores", "Best each"};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
