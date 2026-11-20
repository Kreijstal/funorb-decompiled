/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextLayout {
    static boolean playerGameDataLoaded;
    TextLayoutLine[] lines;
    static int field_b;
    static String field_a;

    final int getCaretIndexAtPoint(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        TextLayoutLine var6;
        int var7;
        int var8;
        var8 = VoidHunters.field_G;
        if (this.lines != null &&
          0 != this.lines.length &&
          this.lines[0].top <= param0) {
          if (this.lines[-1 + this.lines.length].bottom < param0) {
            return -1;
          }
          if (param1 != -23381) {
            return 25;
          }
          if (1 == this.lines.length) {
            return this.lines[0].getCaretIndexAtX(-74, param2);
          }
          var4 = 0;
          for (var5 = 0; var5 < this.lines.length; var5++) {
            var6 = this.lines[var5];
            if (var6.top <= param0 &&
              param0 <= var6.bottom) {
              var7 = var6.getCaretIndexAtX(-88, param2);
              if (-1 != var7) {
                return var4 + var7;
              }
              return -1;
            }
            var4 = var4 + (-1 + var6.caretXs.length);
          }
          return -1;
        }
        return -1;
    }

    final int getHeight(int param0) {
        String var3;
        int stackIn_6_0 = 0;
        if (param0 != 29565) {
          var3 = (String) null;
          this.computeJustificationSpacing(true, -112, -23, (String) null);
        }
        if (this.lines != null &&
          this.lines.length > 0) {
          stackIn_6_0 = -this.lines[0].top + this.lines[this.lines.length - 1].bottom;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int computeJustificationSpacing(boolean param0, int param1, int param2, String param3) {
        int var8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          var5_int = 0;
          var6 = param0 ? 1 : 0;
          var7 = param3.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param3.charAt(var8);
            if (60 != var9) {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            } else {
              var6 = 1;
            }
          }
          if (var5_int <= 0) {
            stackIn_17_0 = 0;
            return stackIn_17_0;
          }
          stackIn_15_0 = (-param2 + param1 << 8) / var5_int;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ar.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final int getLineIndexForCaret(boolean param0, int param1) {
        int var3 = 0;
        TextLayoutLine var4 = null;
        int var5 = VoidHunters.field_G;
        if (!param0) {
          return -43;
        }
        for (var3 = 0; this.lines.length > var3; var3++) {
          var4 = this.lines[var3];
          if (!(param1 >= var4.caretXs.length)) {
            return var3;
          }
          param1 = param1 - (-1 + var4.caretXs.length);
        }
        return this.lines.length;
    }

    final static int approximateVectorLength(int param0, byte param1, int param2) {
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int var3;
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        if (param1 < 102) {
          field_b = 115;
        }
        var4 = param0 >> 31;
        param0 = var4 ^ var4 + param0;
        var4Lifetime1 = param2 >> 31;
        param2 = var4Lifetime1 ^ param2 + var4Lifetime1;
        var3 = 0;
        if (param2 > param0) {
          var4Lifetime2 = param0;
          param0 = param2;
          param2 = var4Lifetime2;
        }
        if (param0 >= 32768) {
          if (param0 >= 1073741824) {
            param0 = param0 >> 16;
            var3 += 16;
          }
          if (param0 >= 4194304) {
            var3 += 8;
            param0 = param0 >> 8;
          }
          if (262144 <= param0) {
            var3 += 4;
            param0 = param0 >> 4;
          }
          if (param0 >= 65536) {
            param0 = param0 >> 2;
            var3 += 2;
          }
          if (param0 >= 32768) {
            var3++;
            param0 = param0 >> 1;
          }
          param2 = param2 >> var3;
        }
        if (param0 > param2 << 5) {
          return param0 << var3;
        }
        param0 = param2 * param2 + param0 * param0;
        if (param0 < 65536) {
          if (param0 < 256) {
            if (param0 < 0) {
              return -1;
            }
            return GetBuildViewAutozoomEndOnAction.field_o[param0] >> 12;
          }
          if (4096 <= param0) {
            if (param0 < 16384) {
              return GetBuildViewAutozoomEndOnAction.field_o[param0 >> 6] >> 9;
            }
            return GetBuildViewAutozoomEndOnAction.field_o[param0 >> 8] >> 8;
          }
          if (param0 >= 1024) {
            return GetBuildViewAutozoomEndOnAction.field_o[param0 >> 4] >> 10;
          }
          return GetBuildViewAutozoomEndOnAction.field_o[param0 >> 2] >> 11;
        }
        if (16777216 > param0) {
          if (param0 < 1048576) {
            if (262144 <= param0) {
              return GetBuildViewAutozoomEndOnAction.field_o[param0 >> 12] >> 6;
            }
            return GetBuildViewAutozoomEndOnAction.field_o[param0 >> 10] >> 7;
          }
          if (param0 < 4194304) {
            return GetBuildViewAutozoomEndOnAction.field_o[param0 >> 14] >> 5;
          }
          return GetBuildViewAutozoomEndOnAction.field_o[param0 >> 16] >> 4;
        }
        if (param0 >= 268435456) {
          if (1073741824 <= param0) {
            return GetBuildViewAutozoomEndOnAction.field_o[param0 >> 24] << var3;
          }
          if (var3 >= 1) {
            stackIn_47_0 = GetBuildViewAutozoomEndOnAction.field_o[param0 >> 22] << -1 + var3;
          } else {
            stackIn_47_0 = GetBuildViewAutozoomEndOnAction.field_o[param0 >> 22] >> 1 - var3;
          }
          return stackIn_47_0;
        }
        if (param0 < 67108864) {
          if (var3 >= 3) {
            stackIn_56_0 = GetBuildViewAutozoomEndOnAction.field_o[param0 >> 18] << -3 + var3;
          } else {
            stackIn_56_0 = GetBuildViewAutozoomEndOnAction.field_o[param0 >> 18] >> -var3 + 3;
          }
          return stackIn_56_0;
        }
        if (var3 < 2) {
          stackIn_52_0 = GetBuildViewAutozoomEndOnAction.field_o[param0 >> 20] >> 2 - var3;
        } else {
          stackIn_52_0 = GetBuildViewAutozoomEndOnAction.field_o[param0 >> 20] << var3 - 2;
        }
        return stackIn_52_0;
    }

    final int getRightEdge(int param0) {
        int var4 = 0;
        int var2;
        TextLayoutLine[] var3;
        TextLayoutLine var5;
        int var7;
        int var6;
        var7 = VoidHunters.field_G;
        if (param0 != -18877) {
          TextLayout.approximateVectorLength(-4, (byte) -85, -6);
        }
        var2 = -1;
        if (null != this.lines) {
          var3 = this.lines;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.getEndX(0);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 < 41) {
          field_a = (String) null;
        }
    }

    final int getCaretX(int param0, int param1) {
        int var4 = 0;
        TextLayoutLine var5 = null;
        int var6 = VoidHunters.field_G;
        TextLayoutLine[] var7 = this.lines;
        TextLayoutLine[] var3 = var7;
        if (param1 > -107) {
          this.getRightEdge(-56);
        }
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (var5.caretXs.length > param0) {
            return var5.caretXs[param0];
          }
          param0 = param0 - (-1 + var5.caretXs.length);
        }
        return 0;
    }

    static {
        field_a = "<%0> has withdrawn the request to join.";
        field_b = 0;
    }
}
