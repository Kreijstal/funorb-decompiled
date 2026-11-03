/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Ball {
    private int field_A;
    private int field_u;
    static int field_H;
    int positionZ;
    static int[] field_F;
    static int field_m;
    static Ball[][] field_B;
    int positionX;
    static String playerYouX2AreOfferingRematch;
    static BallEvent field_i;
    private Quaternion spinDelta;
    static PcmSample field_L;
    int positionY;
    int velocityX;
    static String[] plusgoodShot;
    int lastAdvanceTime;
    int velocityY;
    static hj field_J;
    int velocityZ;
    Quaternion orientation;
    boolean transformDirty;
    int angularVelocityZ;
    private int field_y;
    int field_c;
    int[] renderTransform;
    int field_h;
    int field_l;
    private int field_d;
    int angularVelocityX;
    int motionState;
    int angularVelocityY;
    private int field_a;
    BallEvent field_q;
    static String raExplanation;
    boolean field_o;
    boolean inPlay;
    static ResourceArchive field_z;
    static volatile int field_f;

    final void stop(byte param0) {
        this.clearAngularMotion((byte) 119);
        int var2 = -74 / ((param0 - 33) / 40);
        this.clearLinearMotion(50);
        this.motionState = 0;
        if (this.field_q != null &&
          this.field_q.eventKind == 0) {
          this.field_q.a(false, this);
        }
    }

    final void f(int param0) {
        int var2;
        int var2Lifetime1;
        this.field_l = this.velocityX + this.angularVelocityY * -8;
        this.field_h = this.velocityY + -this.angularVelocityX * -8;
        if (0 != this.field_l ||
          this.field_h != 0) {
          var2 = rf.inverseSquareRoot(NameEntryPopup.a(this.field_l, false, this.field_l) + NameEntryPopup.a(this.field_h, false, this.field_h), -123);
          if (var2 != 0) {
            this.field_l = ArchiveProvider.divideFixed16(var2, (byte) -100, (long)this.field_l);
            this.field_h = ArchiveProvider.divideFixed16(var2, (byte) -75, (long)this.field_h);
          }
        }
        var2Lifetime1 = 83 / ((param0 - 41) / 46);
    }

    final void advanceTo(int param0, int param1) {
        int var3;
        if (this.velocityX != 0 ||
          this.velocityY != 0) {
          this.positionX = this.positionX + NameEntryPopup.a(-this.lastAdvanceTime + param0, false, this.velocityX);
          this.positionY = this.positionY + NameEntryPopup.a(param0 - this.lastAdvanceTime, false, this.velocityY);
          this.transformDirty = true;
        }
        var3 = 34 / ((58 - param1) / 45);
        this.lastAdvanceTime = param0;
    }

    final void updateRenderTransform(int param0) {
        this.renderTransform[param0] = this.positionZ >> 13;
        this.renderTransform[1] = this.positionY >> 13;
        this.renderTransform[0] = this.positionX >> 13;
        this.orientation.toRotationMatrix(this.renderTransform, param0 - 97);
        this.transformDirty = false;
    }

    final void writeState(int param0, PacketBuffer param1) {
        PacketBuffer stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          stackIn_2_0 = (PacketBuffer) (param1);
          if (!this.inPlay) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          ((PacketBuffer) (Object) stackIn_2_0).writeByte(stackIn_3_1, false);
          if (this.inPlay) {
            if (this.motionState != 0) {
              throw new IllegalStateException("Writing state before ball is stopped.");
            }
            this.orientation.write(param1, (byte) 123);
            param1.writeInt(true, this.positionX);
            param1.writeInt(true, this.positionY);
          }
          if (param0 != 0) {
            this.field_h = 54;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pq.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void clearLinearMotion(int param0) {
        this.velocityY = 0;
        this.field_u = 0;
        this.field_l = 0;
        this.field_h = 0;
        this.field_A = 0;
        this.velocityX = 0;
        if (param0 != 50) {
          this.field_c = 20;
        }
        this.velocityZ = 0;
    }

    final void a(byte param0) {
        this.angularVelocityY = this.velocityX / 8;
        int var2 = 14 % ((param0 - 31) / 40);
        this.angularVelocityZ = 0;
        this.angularVelocityX = -this.velocityY / 8;
    }

    final String describeMotionState(int param0) {
        if (param0 != -12050) {
          this.velocityX = -58;
        }
        int var2 = this.motionState;
        if (var2 == 0) {
          return "Stopped";
        }
        if (var2 != 1) {
          if (var2 == 2) {
            return "Rolling";
          }
          return "invalid";
        }
        return "Sliding";
    }

    public static void b(byte param0) {
        field_z = null;
        field_i = null;
        field_F = null;
        plusgoodShot = null;
        field_B = (Ball[][]) null;
        field_L = null;
        playerYouX2AreOfferingRematch = null;
        if (param0 == -66) {
          field_J = null;
          raExplanation = null;
          return;
        }
    }

    final void readState(PacketBuffer param0, int param1) {
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          stackIn_3_1 = (param0.readUnsignedByte(-80) == 1);
          this.inPlay = stackIn_3_1;
          if (param1 != -1285) {
            return;
          }
          if (this.inPlay) {
            this.orientation.read(false, param0);
            this.positionX = param0.readInt(true);
            this.positionY = param0.readInt(true);
            this.field_o = false;
            this.velocityZ = 0;
            this.positionZ = -524288;
            this.transformDirty = true;
            this.stop((byte) 78);
          } else {
            this.stop((byte) 78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pq.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void copyFrom(Ball param0, byte param1) {
        try {
          this.positionZ = param0.positionZ;
          this.velocityZ = param0.velocityZ;
          this.field_A = param0.field_A;
          this.velocityY = param0.velocityY;
          this.positionY = param0.positionY;
          this.lastAdvanceTime = param0.lastAdvanceTime;
          this.velocityX = param0.velocityX;
          this.positionX = param0.positionX;
          this.field_u = param0.field_u;
          this.spinDelta.copyFrom(0, param0.spinDelta);
          this.orientation.copyFrom(0, param0.orientation);
          this.angularVelocityZ = param0.angularVelocityZ;
          this.field_a = param0.field_a;
          this.angularVelocityX = param0.angularVelocityX;
          this.field_q = null;
          this.angularVelocityY = param0.angularVelocityY;
          this.field_h = param0.field_h;
          this.field_l = param0.field_l;
          if (param1 != -12) {
            field_z = (ResourceArchive) null;
          }
          this.field_d = param0.field_d;
          this.inPlay = param0.inPlay;
          this.field_c = param0.field_c;
          this.field_y = param0.field_y;
          this.motionState = param0.motionState;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pq.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6) {
        if (null == ta.field_h ||
          null == ReportAbuseDialog.field_Xb ||
          null == UsernameSuggestionsPanel.field_R) {
          ReportAbuseDialog.field_Xb = new PcmStreamMixer();
          ta.field_h = new ReverbPcmStream(ReportAbuseDialog.field_Xb);
          qf.field_d.b(ta.field_h);
          UsernameSuggestionsPanel.field_R = new IntrusiveDeque();
        }
        ta.field_h.a(param1);
        ta.field_h.f(param4);
        ta.field_h.setDampingTimeMicros(param5);
        ta.field_h.setWetGain(param0);
        if (param6 != -1) {
          field_J = (hj) null;
        }
        ta.field_h.d(param2);
        ta.field_h.setStereoWidth(param3);
    }

    final void b(boolean param0) {
        int var2 = 0;
        if (this.angularVelocityX != 0 ||
          0 != this.angularVelocityY ||
          this.angularVelocityZ != 0) {
          var2 = rf.inverseSquareRoot(NameEntryPopup.a(this.angularVelocityX, false, this.angularVelocityX) + NameEntryPopup.a(this.angularVelocityY, false, this.angularVelocityY) + NameEntryPopup.a(this.angularVelocityZ, false, this.angularVelocityZ), -121);
          if (0 < var2) {
            this.spinDelta.setFromAxisAngle(111, -ArchiveProvider.divideFixed16(var2, (byte) -92, (long)this.angularVelocityX), -ArchiveProvider.divideFixed16(var2, (byte) -84, (long)this.angularVelocityY), ArchiveProvider.divideFixed16(var2, (byte) -101, (long)this.angularVelocityZ), (int)((double)(var2 * 1024) / 205887.41614566068));
            this.orientation.multiplyBy(3, this.spinDelta);
            this.orientation.normalise(true);
            this.transformDirty = true;
          }
        }
        this.advanceTo(65536, -116);
        this.positionY = this.positionY + this.velocityY;
        this.positionZ = this.positionZ + this.velocityZ;
        this.positionX = this.positionX + this.velocityX;
        if (!param0) {
          this.field_l = 81;
        }
    }

    final long horizontalSpeedSquared(int param0) {
        if (param0 == -14770) {
          return FullscreenFocusCanvas.multiplyFixedChecked((long)this.velocityX, (long)this.velocityX, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)this.velocityY, (long)this.velocityY, false);
        }
        return -91L;
    }

    final void a(boolean param0) {
        int var2_int;
        long var2;
        int var3;
        int var4_int;
        long var4;
        long var6;
        long var8_long;
        int var8;
        int var9;
        long var10_long;
        int var10;
        int var11;
        int var12;
        int var13;
        int var2_intLifetime1;
        this.advanceTo(65536, -114);
        if (0 != this.angularVelocityX ||
          this.angularVelocityY != 0 ||
          this.angularVelocityZ != 0) {
          var2_int = rf.inverseSquareRoot(NameEntryPopup.a(this.angularVelocityX, false, this.angularVelocityX) + (NameEntryPopup.a(this.angularVelocityY, false, this.angularVelocityY) + NameEntryPopup.a(this.angularVelocityZ, false, this.angularVelocityZ)), -126);
          if (var2_int > 0) {
            this.spinDelta.setFromAxisAngle(77, -ArchiveProvider.divideFixed16(var2_int, (byte) -82, (long)this.angularVelocityX), -ArchiveProvider.divideFixed16(var2_int, (byte) -63, (long)this.angularVelocityY), ArchiveProvider.divideFixed16(var2_int, (byte) -117, (long)this.angularVelocityZ), 1024 * var2_int / 205887);
            this.orientation.multiplyBy(3, this.spinDelta);
            this.orientation.normalise(true);
            this.transformDirty = true;
          }
        }
        regionExit1: {
          var2_intLifetime1 = this.motionState;
          if (var2_intLifetime1 != 0) {
            if (2 == var2_intLifetime1) {
              this.field_l = this.angularVelocityY * -8;
              this.field_h = -this.angularVelocityX * -8;
              if (this.field_l == 0 &&
                this.field_h == 0) {
                if (NameEntryPopup.a(this.velocityX, param0, this.velocityX) + NameEntryPopup.a(this.velocityY, false, this.velocityY) < NameEntryPopup.a(3276, false, 3276) &&
                  NameEntryPopup.a(this.angularVelocityX, param0, this.angularVelocityX) + (NameEntryPopup.a(this.angularVelocityY, param0, this.angularVelocityY) + NameEntryPopup.a(this.angularVelocityZ, false, this.angularVelocityZ)) < NameEntryPopup.a(3276, false, 3276)) {
                  this.stop((byte) 112);
                }
                return;
              }
              var2_intLifetime1 = rf.inverseSquareRoot(NameEntryPopup.a(this.field_l, false, this.field_l) + NameEntryPopup.a(this.field_h, false, this.field_h), -125);
              if (0 != var2_intLifetime1) {
                this.field_l = ArchiveProvider.divideFixed16(var2_intLifetime1, (byte) -100, (long)this.field_l);
                this.field_h = ArchiveProvider.divideFixed16(var2_intLifetime1, (byte) -107, (long)this.field_h);
                this.field_a = -ArchiveProvider.divideFixed16(PasswordValidator.field_w, (byte) -117, (long)(vn.a(this.field_h * 8, 0, PasswordValidator.field_q, l.field_g) / 50));
                this.field_y = ArchiveProvider.divideFixed16(PasswordValidator.field_w, (byte) -118, (long)(vn.a(this.field_l * 8, 0, PasswordValidator.field_q, l.field_g) / 50));
                this.field_d = NameEntryPopup.a(wn.field_l, false, this.angularVelocityZ) - this.angularVelocityZ;
                this.angularVelocityZ = this.angularVelocityZ + this.field_d;
                this.angularVelocityY = this.angularVelocityY + this.field_y;
                this.angularVelocityX = this.angularVelocityX + this.field_a;
                this.field_u = 0;
                this.field_A = 0;
                this.velocityX = 8 * this.angularVelocityY;
                this.velocityY = -this.angularVelocityX * 8;
                var3 = -8 * this.angularVelocityY;
                var4_int = -8 * -this.angularVelocityX;
                if (0 <= NameEntryPopup.a(var3, false, this.field_l) + NameEntryPopup.a(var4_int, param0, this.field_h)) {
                  if (NameEntryPopup.a(this.velocityX, param0, this.velocityX) + NameEntryPopup.a(this.velocityY, false, this.velocityY) < NameEntryPopup.a(3276, false, 3276) &&
                    NameEntryPopup.a(this.angularVelocityX, param0, this.angularVelocityX) + (NameEntryPopup.a(this.angularVelocityY, param0, this.angularVelocityY) + NameEntryPopup.a(this.angularVelocityZ, false, this.angularVelocityZ)) < NameEntryPopup.a(3276, false, 3276)) {
                    this.stop((byte) 112);
                  }
                  return;
                }
                this.stop((byte) 126);
              }
            } else {
              if (var2_intLifetime1 == 1) {
                this.field_h = -8 * -this.angularVelocityX + this.velocityY;
                this.field_l = this.velocityX + -8 * this.angularVelocityY;
                if (this.field_l != 0 ||
                  this.field_h != 0) {
                  var2 = IterableNodeHashTable.a(-104, FullscreenFocusCanvas.multiplyFixedChecked((long)this.field_l, (long)this.field_l, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)this.field_h, (long)this.field_h, false));
                  if (var2 != 0L) {
                    if (-2147483648L <= var2 &&
                      var2 <= 2147483647L) {
                      this.field_l = ArchiveProvider.divideFixed16((int)var2, (byte) -128, (long)this.field_l);
                      this.field_h = ArchiveProvider.divideFixed16((int)var2, (byte) -104, (long)this.field_h);
                      this.field_A = -NameEntryPopup.a(dr.field_f, false, this.field_l) / 50;
                      this.field_u = -NameEntryPopup.a(dr.field_f, false, this.field_h) / 50;
                      var4 = FullscreenFocusCanvas.multiplyFixedChecked((long)this.field_A, (long)this.field_A, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)this.field_u, (long)this.field_u, false);
                      var6 = this.horizontalSpeedSquared(-14770);
                      if (var6 < var4) {
                        var8_long = IterableNodeHashTable.a(-104, var4);
                        var10_long = IterableNodeHashTable.a(-99, var6);
                        this.field_A = (int)((long)this.field_A * var10_long / var8_long);
                        this.field_u = (int)(var10_long * (long)this.field_u / var8_long);
                      }
                      this.velocityX = this.velocityX + this.field_A;
                      this.velocityY = this.velocityY + this.field_u;
                      this.field_a = -ArchiveProvider.divideFixed16(PasswordValidator.field_w, (byte) -87, (long)(vn.a(this.field_h * 8, 0, PasswordValidator.field_q, dr.field_f) / 50));
                      this.field_y = ArchiveProvider.divideFixed16(PasswordValidator.field_w, (byte) -122, (long)(vn.a(8 * this.field_l, 0, PasswordValidator.field_q, dr.field_f) / 50));
                      this.field_d = NameEntryPopup.a(wn.field_l, false, this.angularVelocityZ) - this.angularVelocityZ;
                      this.velocityX = this.velocityX + vn.a(this.angularVelocityZ, 0, -this.velocityY, pr.field_l);
                      this.velocityY = this.velocityY + vn.a(this.angularVelocityZ, 0, this.velocityX, pr.field_l);
                      this.angularVelocityY = this.angularVelocityY + this.field_y;
                      this.angularVelocityZ = this.angularVelocityZ + this.field_d;
                      this.angularVelocityX = this.angularVelocityX + this.field_a;
                      this.angularVelocityZ = NameEntryPopup.a(wn.field_l, false, this.angularVelocityZ);
                      var8 = this.velocityX + -8 * this.angularVelocityY;
                      var9 = this.velocityY + -this.angularVelocityX * -8;
                      var10 = this.field_l - var8;
                      var11 = -var9 + this.field_h;
                      var12 = NameEntryPopup.a(this.field_l, param0, var10) + NameEntryPopup.a(this.field_h, false, var11);
                      var13 = NameEntryPopup.a(var8, param0, var10) + NameEntryPopup.a(var9, param0, var11);
                      if (var12 >= 0 ||
                        var13 <= 0) {
                        if (var12 <= 0) {
                          break regionExit1;
                        }
                        if (var13 >= 0) {
                          break regionExit1;
                        }
                      }
                      this.a((byte) 123);
                      this.motionState = 2;
                      break regionExit1;
                    }
                    throw new IllegalStateException("Overflow. Norm of " + WidgetStyleLayer.b(127, this.field_l) + ", " + WidgetStyleLayer.b(126, this.field_h) + " := " + PotEvent.a((byte) 89, var2));
                  }
                  this.motionState = 2;
                  this.a((byte) -28);
                }
              }
            }
          }
        }
        if (NameEntryPopup.a(this.velocityX, param0, this.velocityX) + NameEntryPopup.a(this.velocityY, false, this.velocityY) < NameEntryPopup.a(3276, false, 3276) &&
          NameEntryPopup.a(this.angularVelocityX, param0, this.angularVelocityX) + (NameEntryPopup.a(this.angularVelocityY, param0, this.angularVelocityY) + NameEntryPopup.a(this.angularVelocityZ, false, this.angularVelocityZ)) < NameEntryPopup.a(3276, false, 3276)) {
          this.stop((byte) 112);
        }
    }

    final void a(int param0) {
        if (param0 <= 98) {
          this.horizontalSpeed(15);
        }
        this.renderTransform = new int[12];
    }

    final long horizontalSpeed(int param0) {
        if (param0 != -8) {
          return -16L;
        }
        return IterableNodeHashTable.a(param0 ^ 98, this.horizontalSpeedSquared(-14770));
    }

    final void printState(int param0) {
        if (param0 != 0) {
          this.advanceTo(-20, -78);
        }
        if (this.inPlay) {
          System.out.print("{");
          System.out.print(lo.a((long)this.positionX, 7697781));
          System.out.print(",");
          System.out.print(lo.a((long)this.positionY, 7697781));
          System.out.print(" ");
          this.orientation.print(param0 ^ -79);
          System.out.print("}");
        } else {
          System.out.print("out of play");
        }
    }

    final int d(int param0) {
        if (param0 != 1) {
          Ball.b((byte) -120);
        }
        if (this.inPlay) {
          return 21;
        }
        return 1;
    }

    private final void clearAngularMotion(byte param0) {
        this.field_d = 0;
        this.field_a = 0;
        this.angularVelocityX = 0;
        this.field_y = 0;
        int var2 = 107 % ((54 - param0) / 48);
        this.angularVelocityZ = 0;
        this.angularVelocityY = 0;
    }

    Ball() {
        this.positionZ = -8;
        this.lastAdvanceTime = 0;
        this.spinDelta = new Quaternion();
        this.orientation = new Quaternion();
        this.field_c = 0;
        this.transformDirty = true;
        this.field_q = null;
        this.field_o = false;
        this.inPlay = true;
        this.orientation = new Quaternion();
        this.spinDelta = new Quaternion();
        this.motionState = 0;
    }

    static {
        field_F = new int[5];
        field_i = null;
        plusgoodShot = new String[]{"Great shot!", "Silky skills!", "Awesome!", "What a star!"};
        playerYouX2AreOfferingRematch = "You and <%0> are offering a rematch.";
        field_J = new hj(12, 0, 1, 0);
        raExplanation = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_f = 0;
    }
}
