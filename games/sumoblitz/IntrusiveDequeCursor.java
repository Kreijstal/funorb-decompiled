/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeCursor {
    static SpriteData field_e;
    private IntrusiveNode cursor;
    static boolean field_b;
    static DroneWave[] field_a;
    private IntrusiveDeque deque;
    static int field_c;

    final IntrusiveNode first(byte param0) {
        IntrusiveNode var2 = this.deque.sentinel.next;
        if (this.deque.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.next;
        if (param0 == -80) {
          return var2;
        }
        this.first((byte) -128);
        return var2;
    }

    final IntrusiveNode last(byte param0) {
        IntrusiveNode var2 = this.deque.sentinel.previous;
        if (this.deque.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.previous;
        if (param0 < -13) {
          return var2;
        }
        this.last((byte) -67);
        return var2;
    }

    final IntrusiveNode previous(byte param0) {
        IntrusiveNode var2 = this.cursor;
        if (this.deque.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.previous;
        if (param0 == 87) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode next(int param0) {
        if (param0 != 0) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.cursor;
        if (this.deque.sentinel != var2) {
          this.cursor = var2.next;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final static void updateIntroRotation(byte guard, int direction) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = MusicPatch.introFrame;
        if (var3 < 5) {
          var2 = var3 * var3 * 8192 / 1100;
          if (guard != 79) {
            return;
          }
          var4 = 1;
          var5 = 0;
          if (direction == 3) {
            var4 = -1;
          }
          if (direction == 1) {
            var5 = 1;
          }
          if (direction == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (5 == direction) {
            var4 = -1;
            var5 = 1;
          }
          if (direction == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (direction == 7) {
            var5 = -1;
            var4 = -1;
          } else {
            if (8 == direction) {
              var5 = -1;
              var4 = -1;
            }
          }
        } else {
          if (var3 < 105) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = -(var3 * var3 * 8192 / 3300) + 8192;
              if (guard != 79) {
                return;
              }
              var4 = 1;
              var5 = 0;
              if (direction == 3) {
                var4 = -1;
              }
              if (direction == 1) {
                var5 = 1;
              }
              if (direction == 4) {
                var5 = 1;
                var4 = 1;
              }
              if (5 == direction) {
                var4 = -1;
                var5 = 1;
              }
              if (direction == 6) {
                var4 = 1;
                var5 = -1;
              }
              if (direction == 7 ||
                8 == direction) {
                var5 = -1;
                var4 = -1;
              }
              if (direction == 11) {
                var4 = -1;
              }
              if (direction == 12) {
                var4 = -1;
                var5 = -1;
              }
              if (direction == 13) {
                var4 = 1;
                var5 = -1;
              }
              if (direction == 14) {
                var5 = 1;
                var4 = -1;
              }
              if (direction == 15) {
                var5 = 1;
                var4 = 1;
              }
              IntroductionOverlaySupport.field_b = ToolkitRasterStateStack.createIntroRotationMatrix(83, var2 * var5, var4 * var2);
              return;
            }
          }
          if (guard != 79) {
            return;
          }
          var4 = 1;
          var5 = 0;
          if (direction == 3) {
            var4 = -1;
          }
          if (direction == 1) {
            var5 = 1;
          }
          if (direction == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (5 == direction) {
            var4 = -1;
            var5 = 1;
          }
          if (direction == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (direction == 7 ||
            8 == direction) {
            var5 = -1;
            var4 = -1;
          }
        }
        if (direction == 11) {
          var4 = -1;
        }
        if (direction == 12) {
          var4 = -1;
          var5 = -1;
        }
        if (direction == 13) {
          var4 = 1;
          var5 = -1;
        }
        if (direction == 14) {
          var5 = 1;
          var4 = -1;
        }
        if (direction == 15) {
          var5 = 1;
          var4 = 1;
        }
        IntroductionOverlaySupport.field_b = ToolkitRasterStateStack.createIntroRotationMatrix(83, var2 * var5, var4 * var2);
    }

    final static void sortDisplayModes(FullscreenDisplayMode[] modes, boolean guard) {
        int var3 = 0;
        int var2_int = 0;
        FullscreenDisplayMode var4 = null;
        int var5 = 0;
        int var6 = 0;
        FullscreenDisplayMode[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = modes.length;
          if (!guard) {
            var7 = (FullscreenDisplayMode[]) null;
            IntrusiveDequeCursor.sortDisplayModes((FullscreenDisplayMode[]) null, true);
          }
          for (var3 = 1; var2_int > var3; var3++) {
            var4 = modes[var3];
            for (var5 = var3 - 1; var5 >= 0; var5--) {
              if (ToolkitFont.displayModeSortsAfter(modes[var5], -114, var4)) {
                modes[var5 + 1] = modes[var5];
                continue;
              }
              break;
            }
            modes[1 + var5] = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("cb.A(");
          if (modes == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    final IntrusiveNode startForwardAt(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        IntrusiveNode stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 2 / ((57 - param0) / 41);
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.deque.sentinel.next;
          }
          if (var3 == this.deque.sentinel) {
            this.cursor = null;
            stackIn_6_0 = null;
            return (IntrusiveNode) (stackIn_6_0);
          }
          this.cursor = var3.next;
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("cb.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final IntrusiveNode startBackwardAt(byte param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        IntrusiveNode stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.deque.sentinel.previous;
          } else {
            var3 = param1;
          }
          if (param0 != -70) {
            stackIn_5_0 = (IntrusiveNode) null;
            return stackIn_5_0;
          }
          if (var3 == this.deque.sentinel) {
            this.cursor = null;
            stackIn_9_0 = null;
            return (IntrusiveNode) (stackIn_9_0);
          }
          this.cursor = var3.previous;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void addScore(int points, int guard) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = FadingWidget.score;
        IntrusiveNodeHashTable.field_c = IntrusiveNodeHashTable.field_c + points;
        if (guard != -1372239541) {
          return;
        }
        FadingWidget.score = FadingWidget.score + points;
        if (BufferedCacheFile.nextGameplayRandomInt((byte) -84, 10) < 5) {
          if (5 <= BufferedCacheFile.nextGameplayRandomInt((byte) -84, 10)) {
            SoftwareTransform3D.field_b = SoftwareTransform3D.field_b + points;
            if (var2 >= 50000) {
              return;
            }
            if (FadingWidget.score < 50000) {
              return;
            }
            if (!MessageDialog.arcadeMode) {
              UnderageAccountInfoPanel.awardAchievement(24753, 241, 14);
            }
            return;
          }
          QuickChatCommand.field_a = QuickChatCommand.field_a + points;
        } else {
          if (BufferedCacheFile.nextGameplayRandomInt((byte) -84, 10) >= 5) {
            GraphicsToolkit.field_f = GraphicsToolkit.field_f - points;
          } else {
            LoginPacketWriter.field_a = LoginPacketWriter.field_a - points;
          }
        }
        if (var2 >= 50000) {
          return;
        }
        if (FadingWidget.score < 50000) {
          return;
        }
        if (MessageDialog.arcadeMode) {
          return;
        }
        UnderageAccountInfoPanel.awardAchievement(24753, 241, 14);
    }

    final static int approximateIntegerSqrt(int guard, int value) {
        if (guard != -22415) {
          IntrusiveDequeCursor.updateIntroRotation((byte) 82, -115);
        }
        if (65536L > (long)value) {
          if ((long)value < 256L) {
            if (0 <= value) {
              return VertexStreamLayout.sqrtQ12[value] >> 12;
            }
            return -1;
          }
          if ((long)value >= 4096L) {
            if ((long)value >= 16384L) {
              return VertexStreamLayout.sqrtQ12[value >> 8] >> 8;
            }
            return VertexStreamLayout.sqrtQ12[value >> 6] >> 9;
          }
          if ((long)value >= 1024L) {
            return VertexStreamLayout.sqrtQ12[value >> 4] >> 10;
          }
          return VertexStreamLayout.sqrtQ12[value >> 2] >> 11;
        }
        if (16777216L > (long)value) {
          if ((long)value >= 1048576L) {
            if ((long)value < 4194304L) {
              return VertexStreamLayout.sqrtQ12[value >> 14] >> 5;
            }
            return VertexStreamLayout.sqrtQ12[value >> 16] >> 4;
          }
          if (262144L > (long)value) {
            return VertexStreamLayout.sqrtQ12[value >> 10] >> 7;
          }
          return VertexStreamLayout.sqrtQ12[value >> 12] >> 6;
        }
        if ((long)value >= 268435456L) {
          if (1073741824L > (long)value) {
            return VertexStreamLayout.sqrtQ12[value >> 22] >> 1;
          }
          return VertexStreamLayout.sqrtQ12[value >> 24];
        }
        if ((long)value < 67108864L) {
          return VertexStreamLayout.sqrtQ12[value >> 18] >> 3;
        }
        return VertexStreamLayout.sqrtQ12[value >> 20] >> 2;
    }

    public static void releaseStatics(int guard) {
        field_e = null;
        if (guard != -1384583532) {
          IntrusiveDequeCursor.approximateIntegerSqrt(67, -59);
          field_a = null;
          return;
        }
        field_a = null;
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        try {
          this.deque = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = true;
    }
}
