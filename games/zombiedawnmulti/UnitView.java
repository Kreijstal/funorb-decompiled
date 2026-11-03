/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class UnitView extends SceneObject {
    int field_L;
    static int field_Y;
    private int field_T;
    private boolean field_R;
    int state;
    static int field_J;
    static String[] field_M;
    int targetX;
    int targetY;
    static String field_H;
    int velocityY;
    int slowTicks;
    PcmSampleStream field_U;
    static int field_I;
    int exitCountdown;
    int speed;
    static String field_Z;
    int velocityX;
    static int field_W;
    int field_V;
    int facing;
    int animationFrame;
    int animationTicks;

    final void setSlowTicks(int param0) {
        this.slowTicks = param0;
    }

    final boolean containsPoint(int param0, boolean param1, int param2) {
        int var4 = this.positionX >> 16;
        if (!param1) {
          return true;
        }
        int var5 = this.positionY >> 16;
        if (-7 + (var4 + 24) <= param0) {
          return false;
        }
        if (7 + var4 - 24 >= param0) {
          return false;
        }
        if (param2 <= -48 + var5 + 5) {
          return false;
        }
        if (var5 + 2 > param2) {
          return true;
        }
        return false;
    }

    void tick(byte param0) {
        if (this.slowTicks > 0) {
          this.slowTicks = this.slowTicks - 1;
        }
        if (this.state != 21) {
          if (param0 > -79) {
            field_W = 92;
          }
          return;
        }
        this.exitCountdown = this.exitCountdown - 4;
        if (this.exitCountdown != 0) {
          return;
        }
        this.unlink(true);
        this.a(-4564);
    }

    final void startSlowTimer(int param0, int param1) {
        int var3 = 0;
        if (param1 == 2) {
          var3 = 600;
          if (this instanceof HumanView) {
            var3 = var3 * 2;
          }
          this.slowTicks = PortalEntryEvent.field_m.computeEffectDuration((byte) 32, param0, var3);
          return;
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -115 / ((param0 + 53) / 59);
          stackIn_1_0 = ng.a(-49, true, param1, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ti.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void applyVelocity(int param0) {
        this.positionY = this.positionY + this.velocityY;
        this.positionX = this.positionX + this.velocityX;
        if (param0 != 5197) {
          this.advanceAnimation(20, -102);
        }
    }

    void setState(int param0, int param1) {
        if (this.state == 32) {
          return;
        }
        if (20 == this.state) {
          if (param0 != 18) {
            return;
          }
          this.animationTicks = 0;
          this.animationFrame = 0;
          this.state = param0;
          if (param0 != 21) {
            if (param1 == -27655) {
              return;
            }
            field_Z = (String) null;
            return;
          }
          this.a(-4564);
          this.exitCountdown = 256;
          if (param1 != -27655) {
            field_Z = (String) null;
            return;
          }
          return;
        }
        this.animationTicks = 0;
        this.animationFrame = 0;
        this.state = param0;
        if (param0 == 21) {
          this.a(-4564);
          this.exitCountdown = 256;
          if (param1 == -27655) {
            return;
          }
          field_Z = (String) null;
          return;
        }
        if (param1 == -27655) {
          return;
        }
        field_Z = (String) null;
    }

    UnitView(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        this.field_U = null;
        this.state = !(this instanceof HumanView) ? 4 : 0;
        this.facing = 1 != hp.a((byte) 21, g.field_a, 2) ? 1 : 3;
        this.animationFrame = 0;
        this.animationTicks = 0;
        this.speed = param3;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = -88 % ((param3 + 32) / 57);
        this.field_R = false;
        this.positionX = param0;
        this.targetX = param5;
        this.targetY = param2;
        this.positionY = param1;
        this.moveToward(6, param4);
    }

    final boolean stepTowardTarget(int param0) {
        int stackIn_16_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_341_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var4Lifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        int var5Lifetime2Lifetime1;
        int var5Lifetime2Lifetime2;
        int var5Lifetime5Lifetime1;
        if (param0 >= -69) {
          this.velocityX = 119;
          var2 = this.targetX << 16;
          var3 = this.targetY << 16;
          if (this.velocityX == 0 &&
            this.velocityY == 0) {
            return false;
          }
          if (this.velocityX != 0) {
            if (this.velocityX > 0 &&
              this.positionX > var2) {
              stackIn_16_0 = 1;
            } else {
              if (this.velocityX < 0) {
                stackIn_16_0 = (this.positionX < var2) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            }
          } else {
            stackIn_16_0 = 1;
          }
          var4 = stackIn_16_0;
          if (this.velocityY != 0) {
            if (this.velocityY > 0 &&
              this.positionY > var3) {
              stackIn_28_0 = 1;
            } else {
              if (this.velocityY < 0) {
                stackIn_28_0 = (var3 > this.positionY) ? 1 : 0;
              } else {
                stackIn_28_0 = 0;
              }
            }
          } else {
            stackIn_28_0 = 1;
          }
          var5 = stackIn_28_0;
          if (Math.abs(-var2 + this.positionX) < wc.field_O &&
            Math.abs(this.positionY - var3) < wc.field_O) {
            var4 = 1;
            var5 = 1;
          }
          if (var4 != 0 &&
            var5 == 0) {
            this.velocityX = 0;
            return false;
          }
          if (var4 == 0 &&
            var5 != 0) {
            this.velocityY = 0;
            return false;
          }
          if (var4 == 0) {
            return false;
          }
          if (var5 == 0) {
            return false;
          }
          this.positionY = this.targetY << 16;
          this.positionX = this.targetX << 16;
          if (!this.field_R) {
            return true;
          }
          this.field_R = false;
          this.targetX = this.field_V;
          this.targetY = this.field_L;
          this.moveToward(6, this.field_T);
          return false;
        }
        var2Lifetime1 = this.targetX << 16;
        var3Lifetime1 = this.targetY << 16;
        if (this.velocityX == 0 &&
          this.velocityY == 0) {
          return false;
        }
        if (this.velocityX == 0) {
          var4Lifetime1 = 1;
          if (this.velocityY != 0) {
            if (this.velocityY <= 0) {
              if (this.velocityY < 0 &&
                var3Lifetime1 > this.positionY) {
                var5Lifetime1 = 1;
                if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
                  Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
                  var4Lifetime1 = 1;
                  var5Lifetime1 = 1;
                }
                if (var4Lifetime1 != 0 &&
                  var5Lifetime1 == 0) {
                  this.velocityX = 0;
                  return false;
                }
                if (var4Lifetime1 == 0 &&
                  var5Lifetime1 != 0) {
                  this.velocityY = 0;
                } else {
                  if (var4Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime1 != 0) {
                    this.positionY = this.targetY << 16;
                    this.positionX = this.targetX << 16;
                    if (!this.field_R) {
                      return true;
                    }
                    this.field_R = false;
                    this.targetX = this.field_V;
                    this.targetY = this.field_L;
                    this.moveToward(6, this.field_T);
                    return false;
                  }
                }
                return false;
              }
              stackIn_107_0 = 0;
            } else {
              if (this.positionY <= var3Lifetime1) {
                if (this.velocityY < 0) {
                  stackIn_62_0 = (var3Lifetime1 <= this.positionY) ? 0 : 1;
                } else {
                  stackIn_62_0 = 0;
                }
                var5Lifetime1 = stackIn_62_0;
                if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
                  Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
                  var4Lifetime1 = 1;
                  var5Lifetime1 = 1;
                }
                if (var4Lifetime1 != 0 &&
                  var5Lifetime1 == 0) {
                  this.velocityX = 0;
                  return false;
                }
                if (var4Lifetime1 == 0 &&
                  var5Lifetime1 != 0) {
                  this.velocityY = 0;
                } else {
                  if (var4Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime1 != 0) {
                    this.positionY = this.targetY << 16;
                    this.positionX = this.targetX << 16;
                    if (!this.field_R) {
                      return true;
                    }
                    this.field_R = false;
                    this.targetX = this.field_V;
                    this.targetY = this.field_L;
                    this.moveToward(6, this.field_T);
                    return false;
                  }
                }
                return false;
              }
              stackIn_107_0 = 1;
            }
          } else {
            stackIn_107_0 = 1;
          }
          var5Lifetime1Lifetime1 = stackIn_107_0;
          if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
            Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
            var4Lifetime1 = 1;
            var5Lifetime1Lifetime1 = 1;
          }
          if (var4Lifetime1 != 0 &&
            var5Lifetime1Lifetime1 == 0) {
            this.velocityX = 0;
            return false;
          }
          if (var4Lifetime1 == 0 &&
            var5Lifetime1Lifetime1 != 0) {
            this.velocityY = 0;
          } else {
            if (var4Lifetime1 == 0) {
              return false;
            }
            if (var5Lifetime1Lifetime1 != 0) {
              this.positionY = this.targetY << 16;
              this.positionX = this.targetX << 16;
              if (!this.field_R) {
                return true;
              }
              this.field_R = false;
              this.targetX = this.field_V;
              this.targetY = this.field_L;
              this.moveToward(6, this.field_T);
              return false;
            }
          }
          return false;
        }
        if (this.velocityX > 0) {
          if (this.positionX <= var2Lifetime1) {
            if (this.velocityX < 0) {
              stackIn_209_0 = (this.positionX >= var2Lifetime1) ? 0 : 1;
            } else {
              stackIn_209_0 = 0;
            }
            var4Lifetime2 = stackIn_209_0;
            if (this.velocityY != 0) {
              if (this.velocityY > 0 &&
                this.positionY > var3Lifetime1) {
                stackIn_221_0 = 1;
              } else {
                if (this.velocityY < 0) {
                  stackIn_221_0 = (var3Lifetime1 > this.positionY) ? 1 : 0;
                } else {
                  stackIn_221_0 = 0;
                }
              }
            } else {
              stackIn_221_0 = 1;
            }
            var5Lifetime2 = stackIn_221_0;
            if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
              Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
              var4Lifetime2 = 1;
              var5Lifetime2 = 1;
            }
            if (var4Lifetime2 != 0 &&
              var5Lifetime2 == 0) {
              this.velocityX = 0;
              return false;
            }
            if (var4Lifetime2 == 0 &&
              var5Lifetime2 != 0) {
              this.velocityY = 0;
            } else {
              if (var4Lifetime2 == 0) {
                return false;
              }
              if (var5Lifetime2 != 0) {
                this.positionY = this.targetY << 16;
                this.positionX = this.targetX << 16;
                if (!this.field_R) {
                  return true;
                }
                this.field_R = false;
                this.targetX = this.field_V;
                this.targetY = this.field_L;
                this.moveToward(6, this.field_T);
                return false;
              }
            }
            return false;
          }
          var4Lifetime2Lifetime1 = 1;
          if (this.velocityY != 0) {
            if (this.velocityY <= 0) {
              if (this.velocityY < 0 &&
                var3Lifetime1 > this.positionY) {
                var5Lifetime2Lifetime1 = 1;
                if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
                  Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
                  var4Lifetime2Lifetime1 = 1;
                  var5Lifetime2Lifetime1 = 1;
                }
                if (var4Lifetime2Lifetime1 != 0 &&
                  var5Lifetime2Lifetime1 == 0) {
                  this.velocityX = 0;
                  return false;
                }
                if (var4Lifetime2Lifetime1 == 0 &&
                  var5Lifetime2Lifetime1 != 0) {
                  this.velocityY = 0;
                } else {
                  if (var4Lifetime2Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime2Lifetime1 != 0) {
                    this.positionY = this.targetY << 16;
                    this.positionX = this.targetX << 16;
                    if (!this.field_R) {
                      return true;
                    }
                    this.field_R = false;
                    this.targetX = this.field_V;
                    this.targetY = this.field_L;
                    this.moveToward(6, this.field_T);
                    return false;
                  }
                }
                return false;
              }
              stackIn_184_0 = 0;
            } else {
              if (this.positionY <= var3Lifetime1) {
                if (this.velocityY < 0) {
                  stackIn_139_0 = (var3Lifetime1 <= this.positionY) ? 0 : 1;
                } else {
                  stackIn_139_0 = 0;
                }
                var5Lifetime2Lifetime1 = stackIn_139_0;
                if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
                  Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
                  var4Lifetime2Lifetime1 = 1;
                  var5Lifetime2Lifetime1 = 1;
                }
                if (var4Lifetime2Lifetime1 != 0 &&
                  var5Lifetime2Lifetime1 == 0) {
                  this.velocityX = 0;
                  return false;
                }
                if (var4Lifetime2Lifetime1 == 0 &&
                  var5Lifetime2Lifetime1 != 0) {
                  this.velocityY = 0;
                } else {
                  if (var4Lifetime2Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime2Lifetime1 != 0) {
                    this.positionY = this.targetY << 16;
                    this.positionX = this.targetX << 16;
                    if (!this.field_R) {
                      return true;
                    }
                    this.field_R = false;
                    this.targetX = this.field_V;
                    this.targetY = this.field_L;
                    this.moveToward(6, this.field_T);
                    return false;
                  }
                }
                return false;
              }
              stackIn_184_0 = 1;
            }
          } else {
            stackIn_184_0 = 1;
          }
          var5Lifetime2Lifetime2 = stackIn_184_0;
          if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
            Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
            var4Lifetime2Lifetime1 = 1;
            var5Lifetime2Lifetime2 = 1;
          }
          if (var4Lifetime2Lifetime1 != 0 &&
            var5Lifetime2Lifetime2 == 0) {
            this.velocityX = 0;
            return false;
          }
          if (var4Lifetime2Lifetime1 == 0 &&
            var5Lifetime2Lifetime2 != 0) {
            this.velocityY = 0;
          } else {
            if (var4Lifetime2Lifetime1 == 0) {
              return false;
            }
            if (var5Lifetime2Lifetime2 != 0) {
              this.positionY = this.targetY << 16;
              this.positionX = this.targetX << 16;
              if (!this.field_R) {
                return true;
              }
              this.field_R = false;
              this.targetX = this.field_V;
              this.targetY = this.field_L;
              this.moveToward(6, this.field_T);
              return false;
            }
          }
          return false;
        }
        if (this.velocityX < 0 &&
          this.positionX < var2Lifetime1) {
          var4Lifetime3 = 1;
          if (this.velocityY != 0) {
            if (this.velocityY > 0 &&
              this.positionY > var3Lifetime1) {
              stackIn_255_0 = 1;
            } else {
              if (this.velocityY < 0) {
                stackIn_255_0 = (var3Lifetime1 > this.positionY) ? 1 : 0;
              } else {
                stackIn_255_0 = 0;
              }
            }
          } else {
            stackIn_255_0 = 1;
          }
          var5Lifetime3 = stackIn_255_0;
          if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
            Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
            var4Lifetime3 = 1;
            var5Lifetime3 = 1;
          }
          if (var4Lifetime3 != 0 &&
            var5Lifetime3 == 0) {
            this.velocityX = 0;
            return false;
          }
          if (var4Lifetime3 == 0 &&
            var5Lifetime3 != 0) {
            this.velocityY = 0;
          } else {
            if (var4Lifetime3 == 0) {
              return false;
            }
            if (var5Lifetime3 != 0) {
              this.positionY = this.targetY << 16;
              this.positionX = this.targetX << 16;
              if (!this.field_R) {
                return true;
              }
              this.field_R = false;
              this.targetX = this.field_V;
              this.targetY = this.field_L;
              this.moveToward(6, this.field_T);
              return false;
            }
          }
          return false;
        }
        var4Lifetime4 = 0;
        if (this.velocityY == 0) {
          var5Lifetime4 = 1;
          if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
            Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
            var4Lifetime4 = 1;
            var5Lifetime4 = 1;
          }
          if (var4Lifetime4 == 0) {
            if (var4Lifetime4 == 0 &&
              var5Lifetime4 != 0) {
              this.velocityY = 0;
              return false;
            }
            if (var4Lifetime4 == 0) {
              return false;
            }
            if (var5Lifetime4 == 0) {
              return false;
            }
            this.positionY = this.targetY << 16;
            this.positionX = this.targetX << 16;
            if (!this.field_R) {
              return true;
            }
            this.field_R = false;
            this.targetX = this.field_V;
            this.targetY = this.field_L;
            this.moveToward(6, this.field_T);
            return false;
          }
          if (var5Lifetime4 == 0) {
            this.velocityX = 0;
            return false;
          }
          if (var4Lifetime4 != 0) {
            if (var4Lifetime4 == 0) {
              return false;
            }
            this.positionY = this.targetY << 16;
            this.positionX = this.targetX << 16;
            if (!this.field_R) {
              return true;
            }
            this.field_R = false;
            this.targetX = this.field_V;
            this.targetY = this.field_L;
            this.moveToward(6, this.field_T);
            return false;
          } else {
            this.velocityY = 0;
          }
          return false;
        }
        if (this.velocityY > 0) {
          if (this.positionY <= var3Lifetime1) {
            if (this.velocityY < 0) {
              stackIn_341_0 = (var3Lifetime1 <= this.positionY) ? 0 : 1;
            } else {
              stackIn_341_0 = 0;
            }
            var5Lifetime5 = stackIn_341_0;
            if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
              Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
              var4Lifetime4 = 1;
              var5Lifetime5 = 1;
            }
            if (var4Lifetime4 != 0 &&
              var5Lifetime5 == 0) {
              this.velocityX = 0;
            } else if (var4Lifetime4 == 0 &&
              var5Lifetime5 != 0) {
              this.velocityY = 0;
            } else {
              if (var4Lifetime4 != 0 &&
                var5Lifetime5 != 0) {
                this.positionY = this.targetY << 16;
                this.positionX = this.targetX << 16;
                if (!this.field_R) {
                  return true;
                }
                this.field_R = false;
                this.targetX = this.field_V;
                this.targetY = this.field_L;
                this.moveToward(6, this.field_T);
                return false;
              }
            }
            return false;
          }
          var5Lifetime5Lifetime1 = 1;
          if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
            Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
            var4Lifetime4 = 1;
            var5Lifetime5Lifetime1 = 1;
          }
          if (var4Lifetime4 == 0) {
            if (var4Lifetime4 == 0 &&
              var5Lifetime5Lifetime1 != 0) {
              this.velocityY = 0;
              return false;
            }
            if (var4Lifetime4 == 0) {
              return false;
            }
            if (var5Lifetime5Lifetime1 == 0) {
              return false;
            }
            this.positionY = this.targetY << 16;
            this.positionX = this.targetX << 16;
            if (!this.field_R) {
              return true;
            }
            this.field_R = false;
            this.targetX = this.field_V;
            this.targetY = this.field_L;
            this.moveToward(6, this.field_T);
            return false;
          }
          if (var5Lifetime5Lifetime1 == 0) {
            this.velocityX = 0;
            return false;
          }
          if (var4Lifetime4 != 0) {
            if (var4Lifetime4 == 0) {
              return false;
            }
            this.positionY = this.targetY << 16;
            this.positionX = this.targetX << 16;
            if (!this.field_R) {
              return true;
            }
            this.field_R = false;
            this.targetX = this.field_V;
            this.targetY = this.field_L;
            this.moveToward(6, this.field_T);
            return false;
          } else {
            this.velocityY = 0;
          }
          return false;
        }
        regionExit1: {
          if (this.velocityY < 0 &&
            var3Lifetime1 > this.positionY) {
            var5Lifetime6 = 1;
            if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
              Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
              var4Lifetime4 = 1;
              var5Lifetime6 = 1;
            }
            if (var4Lifetime4 == 0) {
              if (var4Lifetime4 == 0 &&
                var5Lifetime6 != 0) {
                this.velocityY = 0;
                return false;
              }
              if (var4Lifetime4 != 0) {
                break regionExit1;
              }
            } else {
              if (var5Lifetime6 != 0) {
                if (var4Lifetime4 != 0) {
                  if (var4Lifetime4 != 0 &&
                    var5Lifetime6 != 0) {
                    this.positionY = this.targetY << 16;
                    this.positionX = this.targetX << 16;
                    if (!this.field_R) {
                      return true;
                    }
                    this.field_R = false;
                    this.targetX = this.field_V;
                    this.targetY = this.field_L;
                    this.moveToward(6, this.field_T);
                    return false;
                  }
                } else {
                  this.velocityY = 0;
                }
                return false;
              }
              this.velocityX = 0;
            }
            return false;
          }
          var5Lifetime6 = 0;
          if (Math.abs(-var2Lifetime1 + this.positionX) < wc.field_O &&
            Math.abs(this.positionY - var3Lifetime1) < wc.field_O) {
            var4Lifetime4 = 1;
            var5Lifetime6 = 1;
          }
          if (var4Lifetime4 == 0) {
            if (var5Lifetime6 != 0) {
              this.velocityY = 0;
              return false;
            }
          } else {
            if (var5Lifetime6 == 0) {
              this.velocityX = 0;
              return false;
            }
          }
          if (var4Lifetime4 == 0) {
            return false;
          }
        }
        if (var5Lifetime6 == 0) {
          return false;
        }
        this.positionY = this.targetY << 16;
        this.positionX = this.targetX << 16;
        if (!this.field_R) {
          return true;
        }
        this.field_R = false;
        this.targetX = this.field_V;
        this.targetY = this.field_L;
        this.moveToward(6, this.field_T);
        return false;
    }

    public static void releaseStatics(byte param0) {
        field_H = null;
        field_M = null;
        if (param0 < 23) {
          return;
        }
        field_Z = null;
    }

    final void moveToward(int param0, int param1) {
        int stackIn_8_1 = 0;
        int stackIn_13_1 = 0;
        int stackIn_18_1 = 0;
        int stackIn_24_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var3 = this.targetX - this.getX(param0 + 68);
        var4 = this.targetY - this.getY(-80);
        var5 = g.b(var3 * var3 + var4 * var4);
        if (param0 != 6) {
          this.advanceAnimation(-72, 91);
        }
        if (var5 != 0) {
          var6 = param1 / var5;
          this.setVelocity(var6 * var4, var6 * var3, (byte) -121);
          return;
        }
        if (this.state == 1) {
          if (!(this instanceof HumanView)) {
            stackIn_8_1 = 4;
          } else {
            stackIn_8_1 = 0;
          }
          this.setState(stackIn_8_1, param0 - 27661);
          return;
        }
        if (5 == this.state) {
          if (!(this instanceof HumanView)) {
            stackIn_13_1 = 4;
          } else {
            stackIn_13_1 = 0;
          }
          this.setState(stackIn_13_1, param0 - 27661);
          return;
        }
        if (6 == this.state) {
          if (!(this instanceof HumanView)) {
            stackIn_18_1 = 4;
          } else {
            stackIn_18_1 = 0;
          }
          this.setState(stackIn_18_1, param0 - 27661);
          return;
        }
        if (this.state != 7) {
          return;
        }
        if (!(this instanceof HumanView)) {
          stackIn_24_1 = 4;
        } else {
          stackIn_24_1 = 0;
        }
        this.setState(stackIn_24_1, param0 - 27661);
    }

    private final void setVelocity(int param0, int param1, byte param2) {
        if (param2 <= -120) {
          this.velocityY = param0;
          this.velocityX = param1;
          this.facing = 0 < param1 ? 1 : 3;
          return;
        }
        this.speed = -7;
        this.velocityY = param0;
        this.velocityX = param1;
        this.facing = 0 < param1 ? 1 : 3;
    }

    final void advanceAnimation(int param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        if (gg.field_j[param1] > this.animationFrame) {
          if (param0 == 30818) {
            var3 = gg.field_b[param1];
            if (0 < this.slowTicks) {
              var3 = var3 * 2;
            }
            fieldTemp$2 = this.animationTicks + 1;
            this.animationTicks = this.animationTicks + 1;
            if (var3 < fieldTemp$2) {
              fieldTemp$3 = this.animationFrame + 1;
              this.animationFrame = this.animationFrame + 1;
              if (fieldTemp$3 == gg.field_j[param1]) {
                this.animationFrame = 0;
              }
              this.animationTicks = 0;
            }
            return;
          }
          field_Y = 103;
          var3Lifetime3 = gg.field_b[param1];
          if (0 < this.slowTicks) {
            var3Lifetime3 = var3Lifetime3 * 2;
          }
          fieldTemp$0 = this.animationTicks + 1;
          this.animationTicks = this.animationTicks + 1;
          if (var3Lifetime3 < fieldTemp$0) {
            fieldTemp$1 = this.animationFrame + 1;
            this.animationFrame = this.animationFrame + 1;
            if (fieldTemp$1 == gg.field_j[param1]) {
              this.animationFrame = 0;
            }
            this.animationTicks = 0;
          }
          return;
        }
        this.animationFrame = 0;
        if (param0 == 30818) {
          var3Lifetime1 = gg.field_b[param1];
          if (0 < this.slowTicks) {
            var3Lifetime1 = var3Lifetime1 * 2;
          }
          fieldTemp$4 = this.animationTicks + 1;
          this.animationTicks = this.animationTicks + 1;
          if (var3Lifetime1 < fieldTemp$4) {
            fieldTemp$5 = this.animationFrame + 1;
            this.animationFrame = this.animationFrame + 1;
            if (fieldTemp$5 == gg.field_j[param1]) {
              this.animationFrame = 0;
            }
            this.animationTicks = 0;
          }
          return;
        }
        field_Y = 103;
        var3Lifetime2 = gg.field_b[param1];
        if (0 < this.slowTicks) {
          var3Lifetime2 = var3Lifetime2 * 2;
        }
        fieldTemp$6 = this.animationTicks + 1;
        this.animationTicks = this.animationTicks + 1;
        if (var3Lifetime2 < fieldTemp$6) {
          fieldTemp$7 = this.animationFrame + 1;
          this.animationFrame = this.animationFrame + 1;
          if (fieldTemp$7 == gg.field_j[param1]) {
            this.animationFrame = 0;
          }
          this.animationTicks = 0;
        }
        return;
    }

    static {
        field_J = 3;
        field_Y = 0;
        field_H = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_I = 10;
        field_Z = "Whisk your zombies across time and space. Well, maybe not time.";
        field_M = new String[]{"The Mall", "Power Plant", "Police Precinct", "White House"};
    }
}
