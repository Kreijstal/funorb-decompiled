/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Aircraft extends FlightBody {
    int weaponHeat;
    static int field_o;
    int fireCooldown;
    int damageSmokeTicks;
    boolean braking;
    boolean fireRequested;
    SteeringMode steeringMode;
    SoundPlayback engineSound;
    int temporaryWeapon;
    int bankOffset;
    private int aimStallTicks;
    static String field_s;
    int hitPoints;
    Aircraft pursuingAircraft;
    AircraftDefinition definition;
    Aircraft targetAircraft;
    int temporaryWeaponTicks;
    int lifecyclePhase;
    int dropPickupCode;

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, byte param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        boolean var33 = false;
        int var35 = 0;
        String stackIn_82_2 = null;
        int var42 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 >= 0 &&
            re.field_f > param15) {
            if (0 > param4 &&
              param8 < 0 &&
              param10 < 0) {
              return;
            }
            if (param4 >= re.field_b &&
              param8 >= re.field_b &&
              re.field_b <= param10) {
              return;
            }
            int var34 = -param15 + param0;
            if (param15 != param14) {
              var18 = param4 << 16;
              var17_int = param4 << 16;
              var22 = param12 << 16;
              var21 = param12 << 16;
              var30 = param7 << 16;
              var29 = param7 << 16;
              var26 = param2 << 16;
              var25 = param2 << 16;
              var35 = -param15 + param14;
              var19 = (-param4 + param8 << 16) / var35;
              var20 = (-param4 + param10 << 16) / var34;
              if (var19 >= var20) {
                int var36 = var19;
                var19 = var20;
                var20 = var36;
                var32 = (param6 - param7 << 16) / var35;
                var24 = (param3 - param12 << 16) / var35;
                var31 = (param1 - param7 << 16) / var34;
                var33 = true;
                var27 = (-param2 + param9 << 16) / var34;
                var28 = (param11 - param2 << 16) / var35;
                var23 = (param13 - param12 << 16) / var34;
              } else {
                var23 = (-param12 + param3 << 16) / var35;
                var27 = (param11 - param2 << 16) / var35;
                var28 = (param9 - param2 << 16) / var34;
                var31 = (-param7 + param6 << 16) / var35;
                var32 = (-param7 + param1 << 16) / var34;
                var33 = false;
                var24 = (param13 - param12 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param15 < 0) {
                if (param14 < 0) {
                  param15 = param14 - param15;
                  var21 = var21 + var23 * param15;
                  var29 = var29 + param15 * var31;
                  var26 = var26 + var28 * param15;
                  var30 = var30 + param15 * var32;
                  var22 = var22 + var24 * param15;
                  var18 = var18 + var20 * param15;
                  var17_int = var17_int + var19 * param15;
                  var25 = var25 + var27 * param15;
                  param15 = param14;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param15 = -param15;
                  var18 = var18 + var20 * param15;
                  var22 = var22 + param15 * var24;
                  var30 = var30 + var32 * param15;
                  var26 = var26 + param15 * var28;
                  var29 = var29 + param15 * var31;
                  var21 = var21 + param15 * var23;
                  var25 = var25 + param15 * var27;
                  var17_int = var17_int + var19 * param15;
                  param15 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                int var36Lifetime2 = re.field_i[param15];
                while (param14 > param15) {
                  int var37 = var17_int >> 16;
                  if (var37 < re.field_b) {
                    int var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      int var39 = (var22 - var21) / var38;
                      int var40 = (-var25 + var26) / var38;
                      int var41 = (-var29 + var30) / var38;
                      if (re.field_b <= var38 + var37) {
                        var38 = -var37 + re.field_b - 1;
                      }
                      if (0 > var37) {
                        s.a((byte) 118, var21 - var37 * var39, -(var41 * var37) + var29, param5, var41, var40, var37 + var38, var36Lifetime2, var39, var25 - var40 * var37);
                      } else {
                        s.a((byte) 118, var21, var29, param5, var41, var40, var38, var37 + var36Lifetime2, var39, var25);
                      }
                    } else if (var37 >= 0 &&
                      re.field_b > var37) {
                      s.a((byte) 118, var21, var29, param5, 0, 0, var38, var37 + var36Lifetime2, 0, var25);
                    }
                  }
                  param15++;
                  if (re.field_f <= param15) {
                    return;
                  }
                  var25 = var25 + var27;
                  var26 = var26 + var28;
                  var22 = var22 + var24;
                  var21 = var21 + var23;
                  var36Lifetime2 = var36Lifetime2 + SoftwareRasterizer.stride;
                  var30 = var30 + var32;
                  var18 = var18 + var20;
                  var17_int = var17_int + var19;
                  var29 = var29 + var31;
                }
              }
              int var36Lifetime3 = param0 - param14;
              if (0 == var36Lifetime3) {
                var27 = 0;
                var23 = 0;
                var31 = 0;
                var32 = 0;
                var20 = 0;
                var28 = 0;
                var19 = 0;
                var24 = 0;
              } else {
                int var37Lifetime2 = param10 << 16;
                int var38Lifetime2 = param13 << 16;
                int var39Lifetime2 = param9 << 16;
                if (!var33) {
                  var25 = param11 << 16;
                  var29 = param6 << 16;
                  var21 = param3 << 16;
                  var17_int = param8 << 16;
                } else {
                  var26 = param11 << 16;
                  var30 = param6 << 16;
                  var18 = param8 << 16;
                  var22 = param3 << 16;
                }
                int var40Lifetime2 = param1 << 16;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
              }
            } else {
              if (param15 != param0) {
                var35 = param0 - param14;
                if (param8 <= param4) {
                  var31 = (-param6 + param1 << 16) / var35;
                  var17_int = param8 << 16;
                  var29 = param6 << 16;
                  var22 = param12 << 16;
                  var30 = param7 << 16;
                  var25 = param11 << 16;
                  var20 = (-param4 + param10 << 16) / var34;
                  var23 = (-param3 + param13 << 16) / var35;
                  var18 = param4 << 16;
                  var26 = param2 << 16;
                  var19 = (-param8 + param10 << 16) / var35;
                  var28 = (-param2 + param9 << 16) / var34;
                  var27 = (param9 - param11 << 16) / var35;
                  var21 = param3 << 16;
                  var32 = (param1 - param7 << 16) / var34;
                  var24 = (param13 - param12 << 16) / var34;
                } else {
                  var28 = (-param11 + param9 << 16) / var35;
                  var21 = param12 << 16;
                  var24 = (-param3 + param13 << 16) / var35;
                  var26 = param11 << 16;
                  var29 = param7 << 16;
                  var22 = param3 << 16;
                  var32 = (param1 - param6 << 16) / var35;
                  var31 = (param1 - param7 << 16) / var34;
                  var19 = (-param4 + param10 << 16) / var34;
                  var25 = param2 << 16;
                  var23 = (-param12 + param13 << 16) / var34;
                  var17_int = param4 << 16;
                  var20 = (param10 - param8 << 16) / var35;
                  var18 = param8 << 16;
                  var30 = param6 << 16;
                  var27 = (param9 - param2 << 16) / var34;
                }
              } else {
                var28 = 0;
                var20 = 0;
                var21 = param12;
                var18 = param8 << 16;
                var22 = param3;
                var31 = 0;
                var25 = param2;
                var24 = 0;
                var19 = 0;
                var23 = 0;
                var17_int = param4 << 16;
                var29 = param7;
                var32 = 0;
                var26 = param11;
                var27 = 0;
                var30 = param6;
              }
              var33 = false;
              if (param15 < 0) {
                param15 = Math.min(-param15, param14 - param15);
                var26 = var26 + var28 * param15;
                var21 = var21 + var23 * param15;
                var18 = var18 + var20 * param15;
                var30 = var30 + param15 * var32;
                var22 = var22 + var24 * param15;
                var25 = var25 + var27 * param15;
                var29 = var29 + param15 * var31;
                var17_int = var17_int + param15 * var19;
                param15 = 0;
              }
            }
            if (param16 > -8) {
              field_o = 50;
            }
            if (param15 < 0) {
              param15 = -param15;
              var21 = var21 + var23 * param15;
              var18 = var18 + var20 * param15;
              var25 = var25 + param15 * var27;
              var29 = var29 + var31 * param15;
              var30 = var30 + var32 * param15;
              var26 = var26 + var28 * param15;
              var22 = var22 + param15 * var24;
              var17_int = var17_int + param15 * var19;
              param15 = 0;
            }
            int var35Lifetime1 = re.field_i[param15];
            while (param15 < param0) {
              int var36Lifetime1 = var17_int >> 16;
              if (re.field_b > var36Lifetime1) {
                int var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (0 != var37Lifetime1) {
                  int var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  int var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  int var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (re.field_b <= var36Lifetime1 + var37Lifetime1) {
                    var37Lifetime1 = -1 - var36Lifetime1 + re.field_b;
                  }
                  if (var36Lifetime1 < 0) {
                    s.a((byte) 118, -(var38Lifetime1 * var36Lifetime1) + var21, var29 - var40Lifetime1 * var36Lifetime1, param5, var40Lifetime1, var39Lifetime1, var36Lifetime1 + var37Lifetime1, var35Lifetime1, var38Lifetime1, var25 - var36Lifetime1 * var39Lifetime1);
                  } else {
                    s.a((byte) 118, var21, var29, param5, var40Lifetime1, var39Lifetime1, var37Lifetime1, var36Lifetime1 + var35Lifetime1, var38Lifetime1, var25);
                  }
                } else if (var36Lifetime1 >= 0 &&
                  var36Lifetime1 < re.field_b) {
                  s.a((byte) 118, var21, var29, param5, 0, 0, var37Lifetime1, var36Lifetime1 + var35Lifetime1, 0, var25);
                }
              }
              param15++;
              if (re.field_f <= param15) {
                return;
              }
              var21 = var21 + var23;
              var18 = var18 + var20;
              var22 = var22 + var24;
              var17_int = var17_int + var19;
              var25 = var25 + var27;
              var30 = var30 + var32;
              var35Lifetime1 = var35Lifetime1 + SoftwareRasterizer.stride;
              var29 = var29 + var31;
              var26 = var26 + var28;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var17 = decompiledCaughtException;
          RuntimeException stackIn_81_0 = var17;
          StringBuilder stackIn_81_1 = new StringBuilder().append("md.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    private final void initializeAircraft(byte obfuscationGuard, Vector2 position, AircraftDefinition definition) {
        try {
          this.position.setFrom(position, true);
          if (obfuscationGuard < 56) {
            this.aimStallTicks = 43;
          }
          this.definition = definition;
          this.weaponHeat = 0;
          this.fireCooldown = this.definition.fireInterval;
          this.hitPoints = this.definition.maximumHitPoints;
          this.fireRequested = false;
          this.lifecyclePhase = 92;
          this.steeringMode = qo.field_e;
          this.speed = this.definition.maximumSpeed;
          this.heading = (double)qq.a(20, 256);
          this.pursuingAircraft = null;
          this.damageSmokeTicks = 0;
          this.bankOffset = 0;
          this.targetAircraft = null;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "md.I(" + obfuscationGuard + ',' + (position != null ? "{...}" : "null") + ',' + (definition != null ? "{...}" : "null") + ')');
        }
    }

    Aircraft(Vector2 position, AircraftDefinition definition) {
        super(position);
        this.braking = false;
        this.pursuingAircraft = null;
        this.targetAircraft = null;
        this.temporaryWeapon = 0;
        this.dropPickupCode = -1;
        this.temporaryWeaponTicks = 0;
        try {
          this.initializeAircraft((byte) 86, position, definition);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "md.<init>(" + (position != null ? "{...}" : "null") + ',' + (definition != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, BitmapFont param2, int param3, mg param4, int param5, int param6, int param7, int param8, BitmapFont param9, byte param10, mg param11, int param12, int param13, int param14, int param15, int param16, mg param17, int param18, int param19, int param20) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          sn.a(param9, param7, 24097, param2);
          hh.a(param6, param18, -92, param20, param5);
          mb.a(param8, param15, (byte) 121);
          int var21_int = -4 / ((46 - param10) / 53);
          ef.a(119, param17, param4, param16, param13, param0);
          HighscoreQuery.a(param11, 25345, param3, param19);
          ql.a(param12, 2048, param14, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var21 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var21;
          StringBuilder stackIn_4_1 = new StringBuilder().append("md.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final void steerTowardsTarget(int aimLead, byte obfuscationGuard, Aircraft target) {
        SteeringMode stackIn_16_1 = null;
        String stackIn_68_2 = null;
        int turnDirection;
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (qo.field_e != this.steeringMode &&
            target != null) {
            if (target.speed * 4.0 < (double)aimLead) {
              aimLead = 4 * (int)target.speed;
            }
            if (this.definition != ro.field_u) {
              if (this.weaponHeat < 150) {
                stackIn_16_1 = ht.field_i;
              } else {
                stackIn_16_1 = pd.field_a;
              }
              this.steeringMode = stackIn_16_1;
            } else if (pd.field_a != this.steeringMode) {
              this.steeringMode = ht.field_i;
            } else {
              int fieldTemp$0 = this.aimStallTicks + 1;
              this.aimStallTicks = this.aimStallTicks + 1;
              if (0 <= fieldTemp$0) {
                this.steeringMode = ht.field_i;
              }
            }
            int targetLeadDistance = 15 * aimLead - 128;
            if (this.definition == ro.field_u) {
              targetLeadDistance = 0;
            }
            target.moveForward((double)targetLeadDistance, 128);
            this.moveForward(20.0, obfuscationGuard ^ 203);
            double forwardDistanceSquared = lc.a(this.position, false, target.position);
            this.moveForward(-20.0, 128);
            this.turn(-10.0, (byte) 25);
            this.moveForward(20.0, 128);
            double leftDistanceSquared = lc.a(this.position, false, target.position);
            this.moveForward(-20.0, obfuscationGuard ^ 203);
            this.turn(20.0, (byte) 25);
            this.moveForward(20.0, obfuscationGuard + 53);
            double rightDistanceSquared = lc.a(this.position, false, target.position);
            this.moveForward(-20.0, obfuscationGuard + 53);
            this.turn(-10.0, (byte) 25);
            double turnRate = this.definition.turnRate;
            int var13 = 0;
            if (pd.field_a == this.steeringMode) {
              if (leftDistanceSquared > rightDistanceSquared) {
                int stackIn_38_0 = (!(leftDistanceSquared > forwardDistanceSquared)) ? 0 : -1;
                turnDirection = stackIn_38_0;
              } else {
                int stackIn_34_0 = (!(forwardDistanceSquared < rightDistanceSquared)) ? 0 : 1;
                turnDirection = stackIn_34_0;
              }
            } else if (rightDistanceSquared > leftDistanceSquared) {
              int stackIn_29_0 = (!(leftDistanceSquared < forwardDistanceSquared)) ? 0 : -1;
              turnDirection = stackIn_29_0;
            } else {
              int stackIn_25_0 = (!(rightDistanceSquared < forwardDistanceSquared)) ? 0 : 1;
              turnDirection = stackIn_25_0;
            }
            this.turn((double)turnDirection * turnRate, (byte) 25);
            if (obfuscationGuard != 75) {
              return;
            }
            if (this.definition != ro.field_u) {
              int var14_int = turnDirection;
              if (var14_int == 1) {
                this.bankOffset = this.bankOffset + 2;
                if (this.bankOffset > 16) {
                  this.bankOffset = 16;
                }
              } else if (var14_int == -1) {
                this.bankOffset = this.bankOffset - 2;
                if (-16 > this.bankOffset) {
                  this.bankOffset = -16;
                }
              }
            }
            target.moveForward((double)(-targetLeadDistance), 128);
            if (uh.a(obfuscationGuard + 30, target.position, 500.0, this.position)) {
              if (100 <= this.weaponHeat) {
                return;
              }
              if (ro.field_u == this.definition) {
                IntrusiveDeque.field_a.setPolar256(10.0, (double)this.headingOffset + this.heading, 121);
                rc.field_d.setFrom(this.position, true);
                rc.field_d.subtract(target.position, obfuscationGuard ^ -30562);
                double targetAlignment = IntrusiveDeque.field_a.dot(rc.field_d, (byte) -118) / rc.field_d.length((byte) -74);
                if (9.5 < targetAlignment) {
                  this.fireRequested = true;
                  this.aimStallTicks = 0;
                  if (pd.field_a != this.steeringMode) {
                    return;
                  }
                  this.steeringMode = ht.field_i;
                  return;
                }
                int fieldTemp$1 = this.aimStallTicks + 1;
                this.aimStallTicks = this.aimStallTicks + 1;
                if (fieldTemp$1 < 150) {
                  return;
                }
                this.steeringMode = pd.field_a;
                this.aimStallTicks = 150;
                return;
              }
              if (0 != turnDirection) {
                return;
              }
              this.fireRequested = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException failure = decompiledCaughtException;
          RuntimeException stackIn_67_0 = failure;
          StringBuilder stackIn_67_1 = new StringBuilder().append("md.K(").append(aimLead).append(',').append(obfuscationGuard).append(',');
          if (target == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_s = null;
        if (param0 != 20) {
          field_s = (String) null;
        }
    }

    static {
        field_s = "Go Back";
    }
}
