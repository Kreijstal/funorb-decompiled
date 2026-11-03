/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SimUnit extends SimEntity {
    int targetX;
    int velocityY;
    int velocityX;
    static UiComponent field_O;
    int baseSpeed;
    static String field_bb;
    int state;
    static Sprite field_T;
    static String field_Y;
    int targetY;
    int speed;
    private int field_U;
    boolean field_X;
    boolean removed;
    boolean needsSync;
    int animationTicks;
    private int speedEffectTicks;
    int animationFrame;
    int speedMultiplier;

    final boolean applySlow(int param0, int param1) {
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.speedMultiplier = 1;
        if (param1 > -14) {
          SimUnit.i((byte) -35);
          this.speedEffectTicks = this.simulation.world.computeEffectDuration((byte) 32, param0, 600);
          if (!(this instanceof SimHuman)) {
            if (this.state != 5) {
              if (this.state != 7) {
                if (this.state == 1) {
                  this.moveToward(-60, this.speedMultiplier * 71680);
                }
              } else {
                this.moveToward(99, this.speedMultiplier * 57344);
              }
            } else {
              this.moveToward(-70, 28672 * this.speedMultiplier);
            }
          } else {
            this.speedEffectTicks = this.speedEffectTicks * 2;
            if (this.state == 5) {
              this.moveToward(-70, 28672 * this.speedMultiplier);
            } else {
              if (this.state == 7) {
                this.moveToward(99, this.speedMultiplier * 57344);
              } else {
                if (this.state == 1) {
                  this.moveToward(-60, this.speedMultiplier * 71680);
                }
              }
            }
          }
        } else {
          this.speedEffectTicks = this.simulation.world.computeEffectDuration((byte) 32, param0, 600);
          if (this instanceof SimHuman) {
            this.speedEffectTicks = this.speedEffectTicks * 2;
          }
          if (this.state == 5) {
            this.moveToward(-70, 28672 * this.speedMultiplier);
          } else {
            if (this.state == 7) {
              this.moveToward(99, this.speedMultiplier * 57344);
            } else {
              if (this.state == 1) {
                this.moveToward(-60, this.speedMultiplier * 71680);
              }
            }
          }
        }
        this.needsSync = true;
        return true;
    }

    final boolean applyHaste(byte param0, int param1) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.speedMultiplier = 4;
        if (param0 != -68) {
          this.stepTowardTarget(106);
          this.speedEffectTicks = this.simulation.world.computeEffectDuration((byte) 32, param1, 600);
          if (5 == this.state) {
            this.moveToward(93, 28672 * this.speedMultiplier);
            this.needsSync = true;
            return true;
          }
          if (this.state == 7) {
            this.moveToward(113, 57344 * this.speedMultiplier);
            this.needsSync = true;
            return true;
          }
          if (this.state == 1) {
            this.moveToward(param0 ^ -31, this.speedMultiplier * 71680);
            this.needsSync = true;
            return true;
          }
          this.needsSync = true;
          return true;
        }
        this.speedEffectTicks = this.simulation.world.computeEffectDuration((byte) 32, param1, 600);
        if (5 == this.state) {
          this.moveToward(93, 28672 * this.speedMultiplier);
          this.needsSync = true;
          return true;
        }
        if (this.state == 7) {
          this.moveToward(113, 57344 * this.speedMultiplier);
          this.needsSync = true;
          return true;
        }
        if (this.state == 1) {
          this.moveToward(param0 ^ -31, this.speedMultiplier * 71680);
          this.needsSync = true;
          return true;
        }
        this.needsSync = true;
        return true;
    }

    final boolean stepTowardTarget(int param0) {
        int stackIn_17_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_282_0 = 0;
        int stackIn_318_0 = 0;
        int stackIn_426_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var4Lifetime3Lifetime1;
        int var5Lifetime2Lifetime1;
        int var5Lifetime3Lifetime1;
        int var5Lifetime3Lifetime2;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 2) {
          this.velocityY = 29;
          var2 = this.targetX << 16;
          var3 = this.targetY << 16;
          if (0 == this.velocityX &&
            0 == this.velocityY) {
            return false;
          }
          if (this.velocityX != 0) {
            if (0 < this.velocityX &&
              this.positionX > var2) {
              stackIn_17_0 = 1;
            } else {
              if (0 > this.velocityX) {
                stackIn_17_0 = (var2 > this.positionX) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            }
          } else {
            stackIn_17_0 = 1;
          }
          var4 = stackIn_17_0;
          if (this.velocityY != 0) {
            if (this.velocityY > 0 &&
              var3 < this.positionY) {
              stackIn_29_0 = 1;
            } else {
              if (this.velocityY < 0) {
                stackIn_29_0 = (var3 > this.positionY) ? 1 : 0;
              } else {
                stackIn_29_0 = 0;
              }
            }
          } else {
            stackIn_29_0 = 1;
          }
          var5 = stackIn_29_0;
          if (Math.abs(-var2 + this.positionX) < ho.field_s &&
            Math.abs(this.positionY - var3) < ho.field_s) {
            var5 = 1;
            var4 = 1;
          }
          if (var4 != 0 &&
            var5 == 0) {
            if (this.velocityX != 0) {
              this.needsSync = true;
            }
            this.velocityX = 0;
            return false;
          }
          if (var4 == 0 &&
            var5 != 0) {
            if (0 != this.velocityY) {
              this.needsSync = true;
            }
            this.velocityY = 0;
          } else {
            if (var4 == 0) {
              return false;
            }
            if (var5 != 0) {
              this.velocityY = 0;
              this.needsSync = true;
              this.positionX = this.targetX << 16;
              this.velocityX = 0;
              this.positionY = this.targetY << 16;
              return true;
            }
          }
          return false;
        }
        var2Lifetime1 = this.targetX << 16;
        var3Lifetime1 = this.targetY << 16;
        if (0 == this.velocityX) {
          if (0 == this.velocityY) {
            return false;
          }
          if (this.velocityX != 0) {
            if (0 < this.velocityX &&
              this.positionX > var2Lifetime1) {
              stackIn_66_0 = 1;
            } else {
              if (0 > this.velocityX) {
                stackIn_66_0 = (var2Lifetime1 > this.positionX) ? 1 : 0;
              } else {
                stackIn_66_0 = 0;
              }
            }
          } else {
            stackIn_66_0 = 1;
          }
          var4Lifetime1 = stackIn_66_0;
          if (this.velocityY != 0) {
            if (this.velocityY > 0 &&
              var3Lifetime1 < this.positionY) {
              stackIn_78_0 = 1;
            } else {
              if (this.velocityY < 0) {
                stackIn_78_0 = (var3Lifetime1 > this.positionY) ? 1 : 0;
              } else {
                stackIn_78_0 = 0;
              }
            }
          } else {
            stackIn_78_0 = 1;
          }
          var5Lifetime1 = stackIn_78_0;
          if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
            Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (var4Lifetime1 != 0 &&
            var5Lifetime1 == 0) {
            if (this.velocityX != 0) {
              this.needsSync = true;
            }
            this.velocityX = 0;
          } else if (var4Lifetime1 == 0 &&
            var5Lifetime1 != 0) {
            if (0 != this.velocityY) {
              this.needsSync = true;
            }
            this.velocityY = 0;
          } else {
            if (var4Lifetime1 == 0) {
              return false;
            }
            if (var5Lifetime1 != 0) {
              this.velocityY = 0;
              this.needsSync = true;
              this.positionX = this.targetX << 16;
              this.velocityX = 0;
              this.positionY = this.targetY << 16;
              return true;
            }
          }
          return false;
        }
        if (this.velocityX == 0) {
          var4Lifetime2 = 1;
          if (this.velocityY != 0) {
            if (this.velocityY <= 0) {
              if (this.velocityY < 0 &&
                var3Lifetime1 > this.positionY) {
                var5Lifetime2 = 1;
                if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
                  Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
                  var5Lifetime2 = 1;
                  var4Lifetime2 = 1;
                }
                if (var4Lifetime2 != 0 &&
                  var5Lifetime2 == 0) {
                  if (this.velocityX != 0) {
                    this.needsSync = true;
                  }
                  this.velocityX = 0;
                } else if (var4Lifetime2 == 0 &&
                  var5Lifetime2 != 0) {
                  if (0 != this.velocityY) {
                    this.needsSync = true;
                  }
                  this.velocityY = 0;
                } else {
                  if (var4Lifetime2 == 0) {
                    return false;
                  }
                  if (var5Lifetime2 != 0) {
                    this.velocityY = 0;
                    this.needsSync = true;
                    this.positionX = this.targetX << 16;
                    this.velocityX = 0;
                    this.positionY = this.targetY << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_160_0 = 0;
            } else {
              if (var3Lifetime1 >= this.positionY) {
                if (this.velocityY < 0) {
                  stackIn_111_0 = (var3Lifetime1 <= this.positionY) ? 0 : 1;
                } else {
                  stackIn_111_0 = 0;
                }
                var5Lifetime2 = stackIn_111_0;
                if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
                  Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
                  var5Lifetime2 = 1;
                  var4Lifetime2 = 1;
                }
                if (var4Lifetime2 != 0 &&
                  var5Lifetime2 == 0) {
                  if (this.velocityX != 0) {
                    this.needsSync = true;
                  }
                  this.velocityX = 0;
                } else if (var4Lifetime2 == 0 &&
                  var5Lifetime2 != 0) {
                  if (0 != this.velocityY) {
                    this.needsSync = true;
                  }
                  this.velocityY = 0;
                } else {
                  if (var4Lifetime2 == 0) {
                    return false;
                  }
                  if (var5Lifetime2 != 0) {
                    this.velocityY = 0;
                    this.needsSync = true;
                    this.positionX = this.targetX << 16;
                    this.velocityX = 0;
                    this.positionY = this.targetY << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_160_0 = 1;
            }
          } else {
            stackIn_160_0 = 1;
          }
          var5Lifetime2Lifetime1 = stackIn_160_0;
          if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
            Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
            var5Lifetime2Lifetime1 = 1;
            var4Lifetime2 = 1;
          }
          if (var4Lifetime2 != 0 &&
            var5Lifetime2Lifetime1 == 0) {
            if (this.velocityX != 0) {
              this.needsSync = true;
            }
            this.velocityX = 0;
          } else if (var4Lifetime2 == 0 &&
            var5Lifetime2Lifetime1 != 0) {
            if (0 != this.velocityY) {
              this.needsSync = true;
            }
            this.velocityY = 0;
          } else {
            if (var4Lifetime2 == 0) {
              return false;
            }
            if (var5Lifetime2Lifetime1 != 0) {
              this.velocityY = 0;
              this.needsSync = true;
              this.positionX = this.targetX << 16;
              this.velocityX = 0;
              this.positionY = this.targetY << 16;
              return true;
            }
          }
          return false;
        }
        if (0 < this.velocityX) {
          if (this.positionX <= var2Lifetime1) {
            if (0 > this.velocityX) {
              stackIn_270_0 = (var2Lifetime1 <= this.positionX) ? 0 : 1;
            } else {
              stackIn_270_0 = 0;
            }
            var4Lifetime3 = stackIn_270_0;
            if (this.velocityY == 0) {
              stackIn_282_0 = 1;
            } else {
              if (this.velocityY > 0 &&
                var3Lifetime1 < this.positionY) {
                stackIn_282_0 = 1;
              } else {
                if (this.velocityY < 0) {
                  stackIn_282_0 = (var3Lifetime1 > this.positionY) ? 1 : 0;
                } else {
                  stackIn_282_0 = 0;
                }
              }
            }
            var5Lifetime3 = stackIn_282_0;
            if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
              Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
              var5Lifetime3 = 1;
              var4Lifetime3 = 1;
            }
            if (var4Lifetime3 != 0 &&
              var5Lifetime3 == 0) {
              if (this.velocityX != 0) {
                this.needsSync = true;
              }
              this.velocityX = 0;
            } else if (var4Lifetime3 == 0 &&
              var5Lifetime3 != 0) {
              if (0 != this.velocityY) {
                this.needsSync = true;
              }
              this.velocityY = 0;
            } else {
              if (var4Lifetime3 == 0) {
                return false;
              }
              if (var5Lifetime3 != 0) {
                this.velocityY = 0;
                this.needsSync = true;
                this.positionX = this.targetX << 16;
                this.velocityX = 0;
                this.positionY = this.targetY << 16;
                return true;
              }
            }
            return false;
          }
          var4Lifetime3Lifetime1 = 1;
          if (this.velocityY != 0) {
            if (this.velocityY <= 0) {
              if (this.velocityY < 0 &&
                var3Lifetime1 > this.positionY) {
                var5Lifetime3Lifetime1 = 1;
                if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
                  Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
                  var5Lifetime3Lifetime1 = 1;
                  var4Lifetime3Lifetime1 = 1;
                }
                if (var4Lifetime3Lifetime1 != 0 &&
                  var5Lifetime3Lifetime1 == 0) {
                  if (this.velocityX != 0) {
                    this.needsSync = true;
                  }
                  this.velocityX = 0;
                } else if (var4Lifetime3Lifetime1 == 0 &&
                  var5Lifetime3Lifetime1 != 0) {
                  if (0 != this.velocityY) {
                    this.needsSync = true;
                  }
                  this.velocityY = 0;
                } else {
                  if (var4Lifetime3Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime3Lifetime1 != 0) {
                    this.velocityY = 0;
                    this.needsSync = true;
                    this.positionX = this.targetX << 16;
                    this.velocityX = 0;
                    this.positionY = this.targetY << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_243_0 = 0;
            } else {
              if (var3Lifetime1 >= this.positionY) {
                if (this.velocityY < 0) {
                  stackIn_194_0 = (var3Lifetime1 <= this.positionY) ? 0 : 1;
                } else {
                  stackIn_194_0 = 0;
                }
                var5Lifetime3Lifetime1 = stackIn_194_0;
                if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
                  Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
                  var5Lifetime3Lifetime1 = 1;
                  var4Lifetime3Lifetime1 = 1;
                }
                if (var4Lifetime3Lifetime1 != 0 &&
                  var5Lifetime3Lifetime1 == 0) {
                  if (this.velocityX != 0) {
                    this.needsSync = true;
                  }
                  this.velocityX = 0;
                } else if (var4Lifetime3Lifetime1 == 0 &&
                  var5Lifetime3Lifetime1 != 0) {
                  if (0 != this.velocityY) {
                    this.needsSync = true;
                  }
                  this.velocityY = 0;
                } else {
                  if (var4Lifetime3Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime3Lifetime1 != 0) {
                    this.velocityY = 0;
                    this.needsSync = true;
                    this.positionX = this.targetX << 16;
                    this.velocityX = 0;
                    this.positionY = this.targetY << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_243_0 = 1;
            }
          } else {
            stackIn_243_0 = 1;
          }
          var5Lifetime3Lifetime2 = stackIn_243_0;
          if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
            Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
            var5Lifetime3Lifetime2 = 1;
            var4Lifetime3Lifetime1 = 1;
          }
          if (var4Lifetime3Lifetime1 != 0 &&
            var5Lifetime3Lifetime2 == 0) {
            if (this.velocityX != 0) {
              this.needsSync = true;
            }
            this.velocityX = 0;
          } else if (var4Lifetime3Lifetime1 == 0 &&
            var5Lifetime3Lifetime2 != 0) {
            if (0 != this.velocityY) {
              this.needsSync = true;
            }
            this.velocityY = 0;
          } else {
            if (var4Lifetime3Lifetime1 == 0) {
              return false;
            }
            if (var5Lifetime3Lifetime2 != 0) {
              this.velocityY = 0;
              this.needsSync = true;
              this.positionX = this.targetX << 16;
              this.velocityX = 0;
              this.positionY = this.targetY << 16;
              return true;
            }
          }
          return false;
        }
        if (0 > this.velocityX &&
          var2Lifetime1 > this.positionX) {
          var4Lifetime4 = 1;
          if (this.velocityY == 0) {
            stackIn_318_0 = 1;
          } else {
            if (this.velocityY > 0 &&
              var3Lifetime1 < this.positionY) {
              stackIn_318_0 = 1;
            } else {
              if (this.velocityY < 0) {
                stackIn_318_0 = (var3Lifetime1 > this.positionY) ? 1 : 0;
              } else {
                stackIn_318_0 = 0;
              }
            }
          }
          var5Lifetime4 = stackIn_318_0;
          if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
            Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
            var5Lifetime4 = 1;
            var4Lifetime4 = 1;
          }
          if (var4Lifetime4 != 0 &&
            var5Lifetime4 == 0) {
            if (this.velocityX != 0) {
              this.needsSync = true;
            }
            this.velocityX = 0;
          } else if (var4Lifetime4 == 0 &&
            var5Lifetime4 != 0) {
            if (0 != this.velocityY) {
              this.needsSync = true;
            }
            this.velocityY = 0;
          } else {
            if (var4Lifetime4 == 0) {
              return false;
            }
            if (var5Lifetime4 != 0) {
              this.velocityY = 0;
              this.needsSync = true;
              this.positionX = this.targetX << 16;
              this.velocityX = 0;
              this.positionY = this.targetY << 16;
              return true;
            }
          }
          return false;
        }
        var4Lifetime5 = 0;
        if (this.velocityY == 0) {
          var5Lifetime5 = 1;
          if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s) {
            if (Math.abs(this.positionY - var3Lifetime1) >= ho.field_s) {
              if (var4Lifetime5 != 0 &&
                var5Lifetime5 == 0) {
                if (this.velocityX != 0) {
                  this.needsSync = true;
                }
                this.velocityX = 0;
              } else if (var4Lifetime5 == 0 &&
                var5Lifetime5 != 0) {
                if (0 != this.velocityY) {
                  this.needsSync = true;
                }
                this.velocityY = 0;
              } else {
                if (var4Lifetime5 == 0) {
                  return false;
                }
                if (var5Lifetime5 != 0) {
                  this.velocityY = 0;
                  this.needsSync = true;
                  this.positionX = this.targetX << 16;
                  this.velocityX = 0;
                  this.positionY = this.targetY << 16;
                  return true;
                }
              }
              return false;
            }
            var5Lifetime5 = 1;
            var4Lifetime5 = 1;
          }
        } else {
          if (this.velocityY <= 0) {
            if (this.velocityY < 0 &&
              var3Lifetime1 > this.positionY) {
              var5Lifetime5 = 1;
            } else {
              var5Lifetime5 = 0;
            }
            if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
              Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
              var5Lifetime5 = 1;
              var4Lifetime5 = 1;
            }
          } else {
            if (var3Lifetime1 >= this.positionY) {
              if (this.velocityY < 0) {
                stackIn_426_0 = (var3Lifetime1 <= this.positionY) ? 0 : 1;
              } else {
                stackIn_426_0 = 0;
              }
              var5Lifetime5 = stackIn_426_0;
              if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s &&
                Math.abs(this.positionY - var3Lifetime1) < ho.field_s) {
                var5Lifetime5 = 1;
                var4Lifetime5 = 1;
              }
              if (var4Lifetime5 != 0 &&
                var5Lifetime5 == 0) {
                if (this.velocityX != 0) {
                  this.needsSync = true;
                }
                this.velocityX = 0;
              } else if (var4Lifetime5 == 0 &&
                var5Lifetime5 != 0) {
                if (0 != this.velocityY) {
                  this.needsSync = true;
                }
                this.velocityY = 0;
              } else {
                if (var4Lifetime5 == 0) {
                  return false;
                }
                if (var5Lifetime5 != 0) {
                  this.velocityY = 0;
                  this.needsSync = true;
                  this.positionX = this.targetX << 16;
                  this.velocityX = 0;
                  this.positionY = this.targetY << 16;
                  return true;
                }
              }
              return false;
            }
            var5Lifetime5 = 1;
            if (Math.abs(-var2Lifetime1 + this.positionX) < ho.field_s) {
              if (Math.abs(this.positionY - var3Lifetime1) >= ho.field_s) {
                if (var4Lifetime5 != 0 &&
                  var5Lifetime5 == 0) {
                  if (this.velocityX != 0) {
                    this.needsSync = true;
                  }
                  this.velocityX = 0;
                } else if (var4Lifetime5 == 0 &&
                  var5Lifetime5 != 0) {
                  if (0 != this.velocityY) {
                    this.needsSync = true;
                  }
                  this.velocityY = 0;
                } else {
                  if (var4Lifetime5 == 0) {
                    return false;
                  }
                  if (var5Lifetime5 != 0) {
                    this.velocityY = 0;
                    this.needsSync = true;
                    this.positionX = this.targetX << 16;
                    this.velocityX = 0;
                    this.positionY = this.targetY << 16;
                    return true;
                  }
                }
                return false;
              }
              var5Lifetime5 = 1;
              var4Lifetime5 = 1;
            }
          }
        }
        if (var4Lifetime5 != 0 &&
          var5Lifetime5 == 0) {
          if (this.velocityX != 0) {
            this.needsSync = true;
          }
          this.velocityX = 0;
          return false;
        }
        if (var4Lifetime5 == 0 &&
          var5Lifetime5 != 0) {
          if (0 != this.velocityY) {
            this.needsSync = true;
          }
          this.velocityY = 0;
          return false;
        }
        if (var4Lifetime5 == 0) {
          return false;
        }
        if (var5Lifetime5 == 0) {
          return false;
        }
        this.velocityY = 0;
        this.needsSync = true;
        this.positionX = this.targetX << 16;
        this.velocityX = 0;
        this.positionY = this.targetY << 16;
        return true;
    }

    final static TextWidgetPainter g(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (hj.field_d != null) {
          var1 = -122 % ((53 - param0) / 62);
          return hj.field_d;
        }
        hj.field_d = new TextWidgetPainter(DisplayNamePanel.field_H, 20, 0, 0, 0, 11579568, -1, 0, 0, DisplayNamePanel.field_H.maxAscent, -1, 2147483647, true);
        var1Lifetime1 = -122 % ((53 - param0) / 62);
        return hj.field_d;
    }

    SimUnit(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        this.state = this instanceof SimHuman ? 0 : 4;
        this.field_X = false;
        hp.a((byte) 105, g.field_a, 2);
        this.animationFrame = 0;
        this.removed = false;
        this.speedEffectTicks = 400;
        this.animationTicks = 0;
        this.speedMultiplier = 2;
        this.baseSpeed = param3;
    }

    public static void i(byte param0) {
        field_O = null;
        if (param0 != -86) {
          return;
        }
        field_Y = null;
        field_T = null;
        field_bb = null;
    }

    private final void setVelocity(int param0, byte param1, int param2) {
        if (param1 < -101) {
          this.velocityX = param2;
          this.velocityY = param0;
          return;
        }
        this.speed = -89;
        this.velocityX = param2;
        this.velocityY = param0;
    }

    final void applyVelocity(byte param0) {
        this.positionY = this.positionY + this.velocityY;
        this.positionX = this.positionX + this.velocityX;
        this.updateCell((byte) -117);
        if (param0 <= 27) {
          this.setState(-4, (byte) -29);
        }
    }

    void remove(int param0) {
        this.removed = true;
        this.unlink(true);
        if (param0 == 18) {
          this.a(param0 - 4582);
          return;
        }
        this.targetX = -127;
        this.a(param0 - 4582);
    }

    final void moveToward(int param0, int param1) {
        int stackIn_6_1 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_1 = 0;
        int stackIn_21_1 = 0;
        int stackIn_27_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        int var6Lifetime6;
        int var6Lifetime7;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        this.needsSync = true;
        this.speed = param1;
        var3 = this.targetX - this.getX((byte) -112);
        var4 = this.targetY - this.getY(1829947600);
        var5 = g.b(var3 * var3 + var4 * var4);
        if (var5 != 0) {
          var6 = param1 / var5;
          this.setVelocity(var6 * var4, (byte) -127, var3 * var6);
          var6Lifetime7 = 124 % ((19 - param0) / 63);
          return;
        }
        if (this.state == 1) {
          if (!(this instanceof SimHuman)) {
            stackIn_6_1 = 4;
          } else {
            stackIn_6_1 = 0;
          }
          this.setState(stackIn_6_1, (byte) -89);
          var6Lifetime1 = 124 % ((19 - param0) / 63);
          return;
        }
        if (this.state == 5) {
          if (!(this instanceof SimHuman)) {
            stackIn_11_1 = 4;
          } else {
            stackIn_11_1 = 0;
          }
          this.setState(stackIn_11_1, (byte) -89);
          var6Lifetime2 = 124 % ((19 - param0) / 63);
          return;
        }
        if (this.state == 6) {
          if (!(this instanceof SimHuman)) {
            stackIn_16_1 = 4;
          } else {
            stackIn_16_1 = 0;
          }
          this.setState(stackIn_16_1, (byte) -89);
          var6Lifetime3 = 124 % ((19 - param0) / 63);
          return;
        }
        if (7 == this.state) {
          if (!(this instanceof SimHuman)) {
            stackIn_21_1 = 4;
          } else {
            stackIn_21_1 = 0;
          }
          this.setState(stackIn_21_1, (byte) -89);
          var6Lifetime4 = 124 % ((19 - param0) / 63);
          return;
        }
        if (this.state != 8) {
          this.setVelocity(0, (byte) -121, 0);
          var6Lifetime5 = 124 % ((19 - param0) / 63);
          return;
        }
        if (!(this instanceof SimHuman)) {
          stackIn_27_1 = 4;
        } else {
          stackIn_27_1 = 0;
        }
        this.setState(stackIn_27_1, (byte) -89);
        var6Lifetime6 = 124 % ((19 - param0) / 63);
        return;
    }

    final void advanceAnimation(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (!(this.animationFrame < gg.field_j[param1])) {
          this.animationFrame = 0;
        }
        int var3 = gg.field_b[param1];
        if (param0 <= 116) {
          this.applySlow(55, -76);
          if (2 > this.speedMultiplier) {
            var3 = var3 * 2;
          }
          fieldTemp$0 = this.animationTicks + 1;
          this.animationTicks = this.animationTicks + 1;
          if (fieldTemp$0 <= var3) {
            return;
          }
          fieldTemp$1 = this.animationFrame + 1;
          this.animationFrame = this.animationFrame + 1;
          if (fieldTemp$1 == gg.field_j[param1]) {
            this.animationFrame = 0;
          } else {
            this.animationTicks = 0;
            return;
          }
          this.animationTicks = 0;
          return;
        }
        if (2 > this.speedMultiplier) {
          var3 = var3 * 2;
        }
        int fieldTemp$2 = this.animationTicks + 1;
        this.animationTicks = this.animationTicks + 1;
        if (fieldTemp$2 <= var3) {
          return;
        }
        int fieldTemp$3 = this.animationFrame + 1;
        this.animationFrame = this.animationFrame + 1;
        if (fieldTemp$3 == gg.field_j[param1]) {
          this.animationFrame = 0;
        } else {
          this.animationTicks = 0;
          return;
        }
        this.animationTicks = 0;
    }

    void tick(int param0) {
        if (this.state == 21) {
          this.field_U = this.field_U - 4;
          if (this.field_U != 0) {
            return;
          }
          this.unlink(true);
          this.a(-4564);
          this.positionY = 262144000;
          this.positionX = 262144000;
          return;
        }
        if (this.speedEffectTicks <= 0) {
          if (param0 >= 30) {
            if (this.simulation.isAtPortal(this, (byte) 105)) {
              this.setState(21, (byte) -89);
            }
            return;
          }
          this.field_U = -28;
        } else {
          this.speedEffectTicks = this.speedEffectTicks - 1;
          if (this.speedEffectTicks == 0) {
            this.speedMultiplier = 2;
            this.moveToward(-90, this.speed / 2);
          }
          if (param0 < 30) {
            this.field_U = -28;
          }
        }
        if (!this.simulation.isAtPortal(this, (byte) 105)) {
          return;
        }
        this.setState(21, (byte) -89);
    }

    final void clearSpeedEffect(boolean param0) {
        if (this.speedMultiplier <= 2) {
          this.speed = this.speed * (2 / this.speedMultiplier);
          this.speedMultiplier = 2;
          this.moveToward(-48, this.speed);
          if (!param0) {
            this.needsSync = true;
            return;
          }
          return;
        }
        this.speed = this.speed / (this.speedMultiplier / 2);
        this.speedMultiplier = 2;
        this.moveToward(-48, this.speed);
        if (!param0) {
          this.needsSync = true;
          return;
        }
    }

    void setState(int param0, byte param1) {
        if (this.state == 30) {
        }
        this.animationTicks = 0;
        this.animationFrame = 0;
        this.state = param0;
        if (param1 == -89) {
          if (param0 == 21) {
            this.a(-4564);
            this.field_U = 256;
          }
          return;
        }
        field_bb = (String) null;
        if (param0 == 21) {
          this.a(-4564);
          this.field_U = 256;
        }
    }

    static {
        field_bb = "Use this on a clueless human for instant zombification! The victim will become one of your zombies.";
        field_Y = "Unfortunately we are unable to create an account for you at this time.";
    }
}
