/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseRegistry {
    private WeightedLruCache definitions;
    static String fsFocus;
    private ResourceArchive extendedArchive;
    static PlatformTaskDispatcher field_c;
    static int field_b;
    static int field_f;
    static int[] field_j;
    static ResourceArchive field_a;
    static int field_g;
    private ResourceArchive standardArchive;

    final static int sweepCircleAgainstVerticalSegment(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        if (0 == param6) {
          return -1;
        }
        var11 = ArchiveProvider.divideFixed16(param6, (byte) -86, (long)((param4 << 16) + param1 - param3));
        var12 = ArchiveProvider.divideFixed16(param6, (byte) -121, (long)(-(param4 << 16) + param1 - param3));
        if (param9 < 14) {
          QuickChatPhraseRegistry.sweepCircleAgainstVerticalSegment(112, 24, -32, -89, -126, -39, -3, 91, -69, 50);
          if (var11 > 0) {
            if (65536 - param2 < var11) {
              if (var12 <= 0) {
                return -1;
              }
              if (-param2 + 65536 < var12) {
                return -1;
              }
              var10 = NameEntryPopup.multiplyFixed16(var12, false, param8) + param7;
              if (param5 < param0) {
                if (param5 > var10) {
                  return -1;
                }
                if (param0 < var10) {
                  return -1;
                }
                return param2 + var12;
              }
              if (var10 < param0) {
                return -1;
              }
              if (param5 < var10) {
                return -1;
              }
              return param2 + var12;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12 > var11) {
              var10Lifetime7 = param7 + NameEntryPopup.multiplyFixed16(var11, false, param8);
              if (param0 <= param5) {
                decompiledFrameRemainder0 = !(param0 > var10Lifetime7);
                if (decompiledFrameRemainder0) {
                  decompiledFrameRemainder0 = !(param5 < var10Lifetime7);
                }
              } else {
                decompiledFrameRemainder0 = !(param5 > var10Lifetime7);
                if (decompiledFrameRemainder0) {
                  decompiledFrameRemainder0 = !(var10Lifetime7 > param0);
                }
              }
              if (decompiledFrameRemainder0) {
                return param2 + var11;
              }
            }
          }
          if (var12 <= 0) {
            return -1;
          }
          if (-param2 + 65536 < var12) {
            return -1;
          }
          var10Lifetime6 = NameEntryPopup.multiplyFixed16(var12, false, param8) + param7;
          if (param5 < param0) {
            if (param5 > var10Lifetime6) {
              return -1;
            }
            if (param0 >= var10Lifetime6) {
              return param2 + var12;
            }
            return -1;
          }
          if (var10Lifetime6 < param0) {
            return -1;
          }
          if (param5 >= var10Lifetime6) {
            return param2 + var12;
          }
          return -1;
        }
        if (var11 <= 0) {
          if (var12 > 0 &&
            -param2 + 65536 >= var12) {
            var10Lifetime1 = NameEntryPopup.multiplyFixed16(var12, false, param8) + param7;
            if (param5 < param0) {
              if (param5 <= var10Lifetime1 &&
                param0 >= var10Lifetime1) {
                return param2 + var12;
              }
            } else {
              if (var10Lifetime1 >= param0 &&
                param5 >= var10Lifetime1) {
                return param2 + var12;
              }
            }
          }
          return -1;
        }
        if (65536 - param2 < var11) {
          if (var12 > 0 &&
            -param2 + 65536 >= var12) {
            var10Lifetime2 = NameEntryPopup.multiplyFixed16(var12, false, param8) + param7;
            if (param5 < param0) {
              if (param5 <= var10Lifetime2 &&
                param0 >= var10Lifetime2) {
                return param2 + var12;
              }
            } else {
              if (var10Lifetime2 >= param0 &&
                param5 >= var10Lifetime2) {
                return param2 + var12;
              }
            }
          }
          return -1;
        }
        if (var12 <= var11) {
          if (var12 <= 0) {
            return -1;
          }
          if (-param2 + 65536 < var12) {
            return -1;
          }
          var10Lifetime3 = NameEntryPopup.multiplyFixed16(var12, false, param8) + param7;
          if (param5 < param0) {
            if (param5 <= var10Lifetime3 &&
              param0 >= var10Lifetime3) {
              return param2 + var12;
            }
          } else {
            if (var10Lifetime3 >= param0 &&
              param5 >= var10Lifetime3) {
              return param2 + var12;
            }
          }
          return -1;
        }
        var10Lifetime4 = param7 + NameEntryPopup.multiplyFixed16(var11, false, param8);
        if (param0 <= param5) {
          if (param0 <= var10Lifetime4 &&
            param5 >= var10Lifetime4) {
            return param2 + var11;
          }
        } else {
          if (param5 <= var10Lifetime4 &&
            var10Lifetime4 <= param0) {
            return param2 + var11;
          }
        }
        if (var12 > 0 &&
          -param2 + 65536 >= var12) {
          var10Lifetime5 = NameEntryPopup.multiplyFixed16(var12, false, param8) + param7;
          if (param5 < param0) {
            if (param5 <= var10Lifetime5 &&
              param0 >= var10Lifetime5) {
              return param2 + var12;
            }
          } else {
            if (var10Lifetime5 >= param0 &&
              param5 >= var10Lifetime5) {
              return param2 + var12;
            }
          }
        }
        return -1;
    }

    final QuickChatPhraseDefinition getDefinition(int param0, int param1) {
        QuickChatPhraseDefinition var6 = null;
        byte[] var4 = null;
        QuickChatPhraseDefinition var3 = null;
        byte[] var4Lifetime1;
        QuickChatPhraseDefinition var3Lifetime1;
        if (param0 <= 125) {
          QuickChatPhraseRegistry.sweepCircleAgainstVerticalSegment(54, 63, 5, -67, 84, -31, 70, -27, -99, 108);
          var3 = (QuickChatPhraseDefinition) (this.definitions.get((long)param1, true));
          if (var3 != null) {
            return var3;
          }
          if (param1 < 32768) {
            var4 = this.standardArchive.getFileBytesUnkeyed(83, param1, 1);
          } else {
            var4 = this.extendedArchive.getFileBytesUnkeyed(96, param1 & 32767, 1);
          }
          var6 = new QuickChatPhraseDefinition();
          QuickChatPhraseDefinition var5 = var6;
          if (var4 == null) {
            if (param1 < 32768) {
              this.definitions.put(90, var6, (long)param1);
              return var6;
            }
            var6.markExtendedLinks(true);
            this.definitions.put(90, var6, (long)param1);
            return var6;
          }
          var6.decode(-20678, new PacketBuffer(var4));
          if (param1 >= 32768) {
            var6.markExtendedLinks(true);
            this.definitions.put(90, var6, (long)param1);
            return var6;
          }
          this.definitions.put(90, var6, (long)param1);
          return var6;
        }
        var3Lifetime1 = (QuickChatPhraseDefinition) (this.definitions.get((long)param1, true));
        if (var3Lifetime1 != null) {
          return var3Lifetime1;
        }
        if (param1 < 32768) {
          var4Lifetime1 = this.standardArchive.getFileBytesUnkeyed(83, param1, 1);
        } else {
          var4Lifetime1 = this.extendedArchive.getFileBytesUnkeyed(96, param1 & 32767, 1);
        }
        QuickChatPhraseDefinition var7 = new QuickChatPhraseDefinition();
        if (var4Lifetime1 != null) {
          var7.decode(-20678, new PacketBuffer(var4Lifetime1));
          if (param1 < 32768) {
            this.definitions.put(90, var7, (long)param1);
            return var7;
          }
          var7.markExtendedLinks(true);
          this.definitions.put(90, var7, (long)param1);
          return var7;
        }
        if (param1 < 32768) {
          this.definitions.put(90, var7, (long)param1);
          return var7;
        }
        var7.markExtendedLinks(true);
        this.definitions.put(90, var7, (long)param1);
        return var7;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5 = 35 / ((-27 - param3) / 38);
        RasterStateSupport.pushRasterSnapshot((byte) -106);
        SoftwareRasterizer.intersectClip(param0, param1, param2, param4);
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -62) {
          return;
        }
        field_c = null;
        field_a = null;
        fsFocus = null;
        field_j = null;
    }

    QuickChatPhraseRegistry(int param0, ResourceArchive param1, ResourceArchive param2, QuickChatResolverMarker param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.definitions = new WeightedLruCache(64);
        try {
          this.standardArchive = param1;
          this.extendedArchive = param2;
          if (this.standardArchive != null) {
            this.standardArchive.getFileCount(false, 1);
          }
          if (this.extendedArchive != null) {
            this.extendedArchive.getFileCount(false, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("wh.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        fsFocus = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_g = 0;
    }
}
