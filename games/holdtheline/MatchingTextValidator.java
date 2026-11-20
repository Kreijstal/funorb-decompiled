/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingTextValidator extends TextFieldValidator {
    private EditableTextField field_m;
    static int[] field_i;
    static long field_l;
    static float[] field_k;
    static int field_j;

    final static void a(GrowableObjectList param0, BoundaryCurve param1, int param2, int param3, int param4, BoundaryCurve param5, int param6, GrowableObjectList param7) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        float var10 = 0.0f;
        int var10_int = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        TrackBoundary var14 = null;
        TrackBoundary var15 = null;
        Object var16 = null;
        Object var17 = null;
        ArcTrackBoundary var17_ref = null;
        Object var18 = null;
        ArcTrackBoundary var18_ref = null;
        Object var19 = null;
        ArcTrackBoundary var19_ref = null;
        TrackBoundary var20 = null;
        var18 = null;
        var17 = null;
        var19 = null;
        var16 = null;
        var13 = HoldTheLine.field_D;
        try {
          if (param1.layer - param5.layer <= 1 &&
            param1.layer - param5.layer >= -1) {
            if (param1 instanceof TrackBoundary) {
              var15 = (TrackBoundary) (param1);
              if (param5 instanceof TrackBoundary) {
                var20 = (TrackBoundary) (param5);
                if (PacketBuffer.intersectsSegments(-1, var15, var20)) {
                  var10 = RasterBuffer.field_d + (float)param4;
                  var11 = (float)param6 + IterableSecondaryNodeDeque.field_b;
                  QuadraticPointPath.a(var11, param2, param7, (byte) 63, var10, param0);
                }
              } else {
                var19_ref = (ArcTrackBoundary) (param5);
                var10_int = ba.a(var15, 0, var19_ref);
                if (var10_int >= 1) {
                  var11 = (float)param4 + RasterBuffer.field_d;
                  var12 = (float)param6 + var19_ref.parameterAtAngle(IterableSecondaryNodeDeque.field_b, param3 ^ 7518);
                  QuadraticPointPath.a(var12, param2, param7, (byte) 113, var11, param0);
                }
                if (var10_int == 2) {
                  var11 = CachedArchiveProvider.field_g + (float)param4;
                  var12 = var19_ref.parameterAtAngle(TextHotspotWidget.field_G, -7517) + (float)param6;
                  QuadraticPointPath.a(var12, param2, param7, (byte) 127, var11, param0);
                }
              }
            } else {
              var18_ref = (ArcTrackBoundary) (param1);
              if (param5 instanceof TrackBoundary) {
                var14 = (TrackBoundary) (param5);
                var10_int = ba.a(var14, 0, var18_ref);
                if (var10_int >= 1) {
                  var11 = (float)param4 + var18_ref.parameterAtAngle(IterableSecondaryNodeDeque.field_b, -7517);
                  var12 = RasterBuffer.field_d + (float)param6;
                  QuadraticPointPath.a(var12, param2, param7, (byte) 62, var11, param0);
                }
                if (var10_int == 2) {
                  var11 = var18_ref.parameterAtAngle(TextHotspotWidget.field_G, -7517) + (float)param4;
                  var12 = CachedArchiveProvider.field_g + (float)param6;
                  QuadraticPointPath.a(var12, param2, param7, (byte) 78, var11, param0);
                }
              } else {
                var17_ref = (ArcTrackBoundary) (param5);
                var10_int = i.a(var17_ref, var18_ref, -6218);
                if (var10_int >= 1) {
                  var11 = var18_ref.parameterAtAngle(RasterBuffer.field_d, -7517) + (float)param4;
                  var12 = var17_ref.parameterAtAngle(IterableSecondaryNodeDeque.field_b, param3 ^ 7518) + (float)param6;
                  QuadraticPointPath.a(var12, param2, param7, (byte) 110, var11, param0);
                }
                if (var10_int == 2) {
                  var11 = (float)param4 + var18_ref.parameterAtAngle(CachedArchiveProvider.field_g, param3 ^ 7518);
                  var12 = (float)param6 + var17_ref.parameterAtAngle(TextHotspotWidget.field_G, param3 ^ 7518);
                  QuadraticPointPath.a(var12, param2, param7, (byte) 91, var11, param0);
                }
              }
            }
            if (param3 != -3) {
              field_i = (int[]) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_30_0 = var8;
          stackIn_30_1 = new StringBuilder().append("qf.BA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    MatchingTextValidator(EditableTextField param0, EditableTextField param1) {
        super(param0);
        try {
          this.field_m = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        if (!pj.b((byte) 80)) {
          TrackObject.switchMenu(param3, false, param0);
          return;
        }
        ByteStorage.field_b = param0;
        if (ByteStorage.field_b == dg.field_c) {
          return;
        }
        TextLayout.field_a = dg.field_c;
        if (param2 != 3865) {
          field_j = 35;
          if (dg.field_c != 13) {
            if (dg.field_c != -1) {
              ((GameMenu) (l.field_a[dg.field_c])).beginExit(param2 ^ 3923);
            }
            LoginForm.field_G = 1;
            ValidationIndicator.field_L = param1 ? true : false;
            return;
          }
          ((RaceSetupMenu) (l.field_a[dg.field_c])).beginExit((byte) -126);
          LoginForm.field_G = 1;
          ValidationIndicator.field_L = param1 ? true : false;
          return;
        }
        if (dg.field_c == 13) {
          ((RaceSetupMenu) (l.field_a[dg.field_c])).beginExit((byte) -126);
          LoginForm.field_G = 1;
          ValidationIndicator.field_L = param1 ? true : false;
          return;
        }
        if (dg.field_c == -1) {
          LoginForm.field_G = 1;
          ValidationIndicator.field_L = param1 ? true : false;
          return;
        }
        ((GameMenu) (l.field_a[dg.field_c])).beginExit(param2 ^ 3923);
        LoginForm.field_G = 1;
        ValidationIndicator.field_L = param1 ? true : false;
    }

    final static void a(int param0, int param1, byte[] param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5Lifetime1;
        var6 = HoldTheLine.field_D;
        try {
          var3_int = 256;
          var4 = new int[256];
          for (var5 = 0; var5 < 256; var5++) {
            incrementValue$1 = var3_int;
            var3_int++;
            var4[var5] = LoginChoicePanel.a((int) param2[incrementValue$1], 255);
          }
          var3_int += 256;
          var7 = param0;
          var5Lifetime1 = var7;
          while (var7 < 256) {
            param2[var3_int] = (byte)(param2[var3_int] - param1);
            var3_int = var3_int + var4[var7];
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qf.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final ValidationState validateText(String param0, byte param1) {
        Validator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_8_0 = null;
        ValidationState stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 52) {
            field_k = (float[]) null;
          }
          if (this.field_m instanceof ValidatorProvider) {
            var3 = ((ValidatorProvider) ((Object) this.field_m)).getValidator(1);
            if (var3 != null &&
              var3.getValidationState(-7447) != PointPath.field_d) {
              stackIn_8_0 = LinearPointPath.field_k;
              return stackIn_8_0;
            }
          }
          if (!param0.equals(this.field_m.text)) {
            stackIn_12_0 = LinearPointPath.field_k;
          } else {
            stackIn_12_0 = PointPath.field_d;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("qf.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        RaceVehicle.writeLegacySessionCookie(-1848651292, GameKeyHandler.a(95));
        if (!param0) {
          MatchingTextValidator.clearSharedReferences(33);
        }
    }

    public static void clearSharedReferences(int param0) {
        field_k = null;
        if (param0 != -14) {
          return;
        }
        field_i = null;
    }

    final static SoundPlayback a(int param0, PcmSample param1) {
        RuntimeException var2 = null;
        SoundPlayback stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 293) {
            field_i = (int[]) null;
          }
          stackIn_3_0 = CachedTextLayout.playSoundStream(PcmSampleStream.createAtRate(param1, 100, 96), (byte) -68);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qf.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, MovingEntity param1, MovingEntity param2) {
        boolean stackIn_19_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_27_0 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param1.collidable) {
            return false;
          }
          if (!param2.collidable) {
            return false;
          }
          if (param0 >= -60) {
            return false;
          }
          if (param1.layer - param2.layer <= 1 &&
            param1.layer - param2.layer >= -1) {
            if ((param2.position.y - param1.position.y) * (param2.position.y - param1.position.y) + (-param1.position.x + param2.position.x) * (-param1.position.x + param2.position.x) > (param2.collisionRadius + param1.collisionRadius) * (param2.collisionRadius + param1.collisionRadius)) {
              return false;
            }
            if (param1.rectangularCollision &&
              param2.rectangularCollision) {
              stackIn_19_0 = MouseWheelInput.a(param1.direction, param1.position, param2.halfWidth, param1.halfLength, param2.direction, param2.halfLength, param1.halfWidth, param2.position, 7527);
              return stackIn_19_0;
            }
            if (param1.rectangularCollision) {
              stackIn_27_0 = MidiNote.a(param2.collisionRadius, true, param1.halfWidth, param2.position, param1.position, param1.halfLength, param1.direction);
              return stackIn_27_0;
            }
            if (!param2.rectangularCollision) {
              return true;
            }
            stackIn_23_0 = ArchiveRequest.a(param1.position, param2.halfWidth, param2.position, param1.collisionRadius, param2.direction, param2.halfLength, 110);
            return stackIn_23_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("qf.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final String getTextValidationMessage(String param0, boolean param1) {
        Validator var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m instanceof ValidatorProvider) {
            var3 = ((ValidatorProvider) ((Object) this.field_m)).getValidator(1);
            if (var3 != null) {
              if (var3.getValidationState(-7447) == PointPath.field_d &&
                !param0.equals(this.field_m.text)) {
                stackIn_6_0 = DraggableWidget.field_L;
                return stackIn_6_0;
              }
              stackIn_8_0 = var3.getValidationMessage((byte) -59);
              return stackIn_8_0;
            }
          }
          if (!param0.equals(this.field_m.text)) {
            stackIn_12_0 = DraggableWidget.field_L;
            return stackIn_12_0;
          }
          if (param1) {
            return null;
          }
          field_l = 24L;
          stackIn_16_0 = null;
          return (String) (stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("qf.L(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_k = new float[]{1.5f, 1.25f, 1.0f};
    }
}
