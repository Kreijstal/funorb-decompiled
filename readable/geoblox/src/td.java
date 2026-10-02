/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends hk {
    private dg field_F;
    static od field_I;
    private int field_G;
    static boolean field_H;
    static int field_E;

    final static int a(int param0, byte param1) {
        int var2;
        if (param0 == 0) {
          return 0;
        } else {
          if (param0 > 0) {
            var2 = 1;
            if (param0 > 65535) {
              param0 = param0 >> 16;
              var2 += 16;
            }
            if (param0 > 255) {
              var2 += 8;
              param0 = param0 >> 8;
            }
            if (param0 > 15) {
              var2 += 4;
              param0 = param0 >> 4;
            }
            if (param0 > 3) {
              var2 += 2;
              param0 = param0 >> 2;
            }
            if (param0 > 1) {
              param0 = param0 >> 1;
              var2++;
            }
            return var2;
          } else {
            var2 = 2;
            if (param0 < -65536) {
              var2 += 16;
              param0 = param0 >> 16;
            }
            if (param0 < -256) {
              param0 = param0 >> 8;
              var2 += 8;
            }
            if (param1 != 66) {
              field_H = true;
            }
            if (-16 > param0) {
              param0 = param0 >> 4;
              var2 += 4;
            }
            if (param0 < -4) {
              param0 = param0 >> 2;
              var2 += 2;
            }
            if (-2 > param0) {
              var2++;
              param0 = param0 >> 1;
            }
            return var2;
          }
        }
    }

    public static void f(int param0) {
        if (param0 > -114) {
            StringBuilder var2 = (StringBuilder) null;
            td.writeTextAtOffset((CharSequence) null, (StringBuilder) null, -1, -77);
        }
        field_I = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        lh var9;
        int var10;
        int var11;
        int var12;
        Sprite var13;
        Sprite var14;
        Sprite var15;
        var12 = Geoblox.field_C;
        super.a(param0, param1, (byte) -86, param3);
        if (0 == param3) {
          L0: {
            var5 = (this.field_r >> -649339007) + (this.field_v + param0);
            var7 = -74 % ((param2 - 1) / 43);
            var6 = param1 - (-this.field_m - (this.field_h >> -471639295));
            var9 = this.field_F.a((byte) -105);
            if (var9 != bf.field_g) {
              if (si.field_n != var9) {
                if (si.field_m != var9) {
                  if (var9 == kk.field_w) {
                    var15 = oa.field_e[1];
                    var15.c(-(var15.width >> -1719863487) + var5, var6 - (var15.height >> 2009440097), 256);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  var14 = oa.field_e[2];
                  var14.c(-(var14.width >> 1489383873) + var5, var6 - (var14.height >> -2129057855), 256);
                  break L0;
                }
              }
            }
            L2: {
              var13 = oa.field_e[0];
              var10 = var13.field_s << 1539250049;
              var11 = var13.field_o << 1598652321;
              if (null != da.field_b) {
                if (var10 <= da.field_b.width) {
                  if (var11 <= da.field_b.height) {
                    Geoblox.setRasterTarget(1, da.field_b);
                    SoftwareRasterizer.c();
                    break L2;
                  }
                }
              }
              da.field_b = new Sprite(var10, var11);
              Geoblox.setRasterTarget(1, da.field_b);
            }
            var13.rotateSmooth(112, 144, var13.field_s << -972988668, var13.field_o << -1953583196, -this.field_G << -867460086, 4096);
            id.a(true);
            da.field_b.c(-var13.field_s + var5, var6 - var13.field_o, 256);
          }
          return;
        } else {
          return;
        }
    }

    final static void playPcmSample(int methodGuard, PcmSample sample) {
        try {
            if (methodGuard != -348) {
                PcmSample var3 = (PcmSample) null;
                td.playPcmSample(-67, (PcmSample) null);
            }
            GameplayEntity.registerAudioStream(false, PcmSampleStream.createForPlaybackRate(sample, 100, 96));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "td.G(" + methodGuard + ',' + (sample != null ? "{...}" : "null") + ')');
        }
    }

    final static StringBuilder writeTextAtOffset(CharSequence sourceText, StringBuilder destination, int writeOffset, int methodGuard) {
        int sourceCharacterIndex = 0;
        int characterWriteOffset = 0;
        int originalLength = 0;
        RuntimeException var4 = null;
        int sourceLength = 0;
        int writeEndOffset = 0;
        int controlFlowGuard = 0;
        PcmSample var9 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        controlFlowGuard = Geoblox.field_C;
        try {
          L0: {
            if (methodGuard <= 23) {
              var9 = (PcmSample) null;
              td.playPcmSample(-80, (PcmSample) null);
            }
            originalLength = destination.length();
            if (writeOffset >= 0) {
              if (originalLength >= writeOffset) {
                sourceLength = sourceText.length();
                if (sourceLength != 0) {
                  writeEndOffset = writeOffset - -sourceLength;
                  if (originalLength < writeEndOffset) {
                    destination.setLength(writeEndOffset);
                  }
                  for (sourceCharacterIndex = 0; sourceCharacterIndex < sourceLength; sourceCharacterIndex++) {
                    characterWriteOffset = writeOffset;
                    writeOffset++;
                    destination.setCharAt(characterWriteOffset, sourceText.charAt(sourceCharacterIndex));
                  }
                  stackIn_17_0 = (StringBuilder) (destination);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_9_0 = (StringBuilder) (destination);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new StringIndexOutOfBoundsException("length=" + originalLength + " startPos=" + writeOffset);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = (RuntimeException) (var4);

          stackIn_20_1 = new StringBuilder().append("td.J(");

          if (sourceText == null) {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
            stackIn_21_2 = "null";
          } else {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
            stackIn_21_2 = "{...}";
          }


          stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

          if (destination == null) {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "null";
          } else {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(writeOffset).append(',').append(methodGuard).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_17_0;
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        try {
            this.field_G = this.field_G + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "td.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void g(byte param0) {
        int var1 = -28 % ((param0 - 36) / 43);
        if (gb.field_f != -uf.field_a + 0 && 250 - uf.field_a == gb.field_f) {
        }
        gb.field_f = gb.field_f + 1;
    }

    final boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -30) {
            this.a(89, -88, (byte) -40, -90);
          }
          stackIn_3_0 = 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var3);

          stackIn_6_1 = new StringBuilder().append("td.UA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(')').toString());
        }
        return stackIn_3_0 != 0;
    }

    final static void a(byte param0) {
        if (param0 != -93) {
            return;
        }
        md.activeScorePopups.moveAllTo(ue.availableScorePopups, (byte) -70);
    }

    td(dg param0) {
        try {
            this.field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(byte param0) {
        if (param0 != 69) {
            return (String) null;
        }
        if (!(!this.field_l)) {
            return this.field_F.c(-21666);
        }
        return null;
    }

    static {
        field_I = new od("");
    }
}
