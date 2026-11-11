/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TrapModel extends IntrusiveNode implements Renderable, noa {
    private int category;
    TrapPart part;
    private int sceneLayer;
    int field_g;
    private boolean occupiesTiles;
    WorldBody body;
    private int elevationOffset;

    void configureFor(WorldBody param0, int param1, TrapPart param2) {
        try {
          if (param1 != -2159) {
            this.mirror(80);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "dg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void setElevationOffset(int param0, int param1) {
        if (param1 <= 96) {
          this.refreshTileOccupancy(72);
          this.elevationOffset = param0;
          return;
        }
        this.elevationOffset = param0;
    }

    final static boolean b(int param0) {
        if (param0 != -1) {
          return false;
        }
        return true;
    }

    public final int getRenderY(byte param0) {
        if (param0 < 91) {
          return -69;
        }
        if (null != this.body) {
          return this.body.getY(9648);
        }
        return 0;
    }

    public final int getRenderX(byte param0) {
        int var2 = 19 % ((param0 + 23) / 53);
        if (null != this.body) {
          return this.body.getX(3);
        }
        return 0;
    }

    int getOccupancyLayer(byte param0) {
        if (param0 > -63) {
          this.setElevationOffset(-26, -105);
          return -1;
        }
        return -1;
    }

    void addToScene(int param0, RenderScene param1) {
        int var3_int = 0;
        if (~this.sceneLayer != param0) {
          return;
        }
        try {
          var3_int = this.getSceneLayer((byte) -99);
          this.addToLayer((byte) 66, var3_int, param1);
          this.sceneLayer = var3_int;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "dg.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void updateTileOccupancy(int param0) {
        int stackIn_16_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_293_0 = 0;
        int stackIn_317_0 = 0;
        int stackIn_322_0 = 0;
        int stackIn_362_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        Room var9;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var6Lifetime3Lifetime1;
        int var6Lifetime3Lifetime2;
        int var7Lifetime2Lifetime1;
        int var7Lifetime3Lifetime1;
        int var7Lifetime3Lifetime2;
        int var8Lifetime2Lifetime1;
        int var8Lifetime3Lifetime1;
        int var8Lifetime3Lifetime2;
        Room var9Lifetime1;
        Room var9Lifetime2;
        Room var9Lifetime3;
        Room var9Lifetime4;
        Room var9Lifetime2Lifetime1;
        Room var9Lifetime3Lifetime1;
        Room var9Lifetime3Lifetime2;
        int var7Lifetime2Lifetime2;
        int var8Lifetime2Lifetime2;
        if (this.body == null) {
          return;
        }
        if (this.body.isMobile(true)) {
          return;
        }
        var2 = this.getOccupancyLayer((byte) -88);
        var3 = this.getWideOccupancyMode((byte) -108);
        if (var2 == -1) {
          if (var3 == -1) {
            return;
          }
          if (param0 != -12663) {
            this.elevationOffset = -42;
          }
          var4 = 0;
          if (var4 == 0) {
            stackIn_16_0 = (this.body.isExpired(param0 + 31070)) ? 1 : 0;
          } else {
            stackIn_16_0 = 1;
          }
          var5 = stackIn_16_0;
          if (this.part != null) {
            if (var5 == 0) {
              if (this.part.isEnabled(param0 ^ 12575)) {
                stackIn_26_0 = (this.part.isStopped((byte) 87)) ? 1 : 0;
              } else {
                stackIn_26_0 = 1;
              }
            } else {
              stackIn_26_0 = 1;
            }
            var5 = stackIn_26_0;
          }
          if (var5 != 0) {
            stackIn_33_0 = (var4 != 0) ? 1 : 0;
          } else {
            stackIn_33_0 = 1;
          }
          var6 = stackIn_33_0;
          if (var6 == 0 &&
            var5 == 0) {
            return;
          }
          var7 = this.body.getWidth(-49);
          var8 = this.body.getHeight((byte) 55);
          var9 = this.body.getRoom((byte) 79);
          if (var5 != 0 &&
            this.occupiesTiles) {
            var9.removeTileOccupancy(var2, var8, var7, this.body.getY(9648), -119, this.body.getX(3), var3);
            this.occupiesTiles = false;
          }
          if (var6 != 0 &&
            !this.occupiesTiles) {
            var9.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7, var8, 121);
            this.occupiesTiles = true;
          }
          return;
        }
        if (param0 != -12663) {
          this.elevationOffset = -42;
          var4Lifetime1 = 0;
          if (var4Lifetime1 != 0) {
            stackIn_64_0 = 1;
          } else {
            stackIn_64_0 = (this.body.isExpired(param0 + 31070)) ? 1 : 0;
          }
          var5Lifetime1 = stackIn_64_0;
          if (this.part != null) {
            if (var5Lifetime1 == 0) {
              if (this.part.isEnabled(param0 ^ 12575)) {
                stackIn_78_0 = (this.part.isStopped((byte) 87)) ? 1 : 0;
                var5Lifetime1 = stackIn_78_0;
              } else {
                stackIn_73_0 = 1;
                var5Lifetime1 = stackIn_73_0;
              }
            } else {
              stackIn_69_0 = 1;
              var5Lifetime1 = stackIn_69_0;
            }
          }
          if (var5Lifetime1 != 0) {
            stackIn_87_0 = (var4Lifetime1 != 0) ? 1 : 0;
            var6Lifetime1 = stackIn_87_0;
          } else {
            stackIn_82_0 = 1;
            var6Lifetime1 = stackIn_82_0;
          }
          if (var6Lifetime1 == 0 &&
            var5Lifetime1 == 0) {
            return;
          }
          var7Lifetime1 = this.body.getWidth(-49);
          var8Lifetime1 = this.body.getHeight((byte) 55);
          var9Lifetime1 = this.body.getRoom((byte) 79);
          if (var5Lifetime1 != 0 &&
            this.occupiesTiles) {
            var9Lifetime1.removeTileOccupancy(var2, var8Lifetime1, var7Lifetime1, this.body.getY(9648), -119, this.body.getX(3), var3);
            this.occupiesTiles = false;
          }
          if (var6Lifetime1 != 0 &&
            !this.occupiesTiles) {
            var9Lifetime1.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime1, var8Lifetime1, 121);
            this.occupiesTiles = true;
          }
          return;
        }
        var4Lifetime2 = 0;
        if (var4Lifetime2 != 0) {
          stackIn_218_0 = 1;
        } else {
          if (this.body.isExpired(param0 + 31070)) {
            var5Lifetime2 = 1;
            regionExit1: {
              if (this.part != null) {
                if (var5Lifetime2 != 0) {
                  var5Lifetime2 = 1;
                  if (var5Lifetime2 != 0) {
                    stackIn_126_0 = (var4Lifetime2 != 0) ? 1 : 0;
                    var6Lifetime2 = stackIn_126_0;
                  } else {
                    stackIn_121_0 = 1;
                    var6Lifetime2 = stackIn_121_0;
                  }
                  break regionExit1;
                }
                if (!this.part.isEnabled(param0 ^ 12575)) {
                  var5Lifetime2 = 1;
                  if (var5Lifetime2 == 0) {
                    stackIn_158_0 = 1;
                  } else {
                    stackIn_158_0 = (var4Lifetime2 != 0) ? 1 : 0;
                  }
                  var6Lifetime2 = stackIn_158_0;
                  if (var6Lifetime2 != 0) {
                    var7Lifetime2 = this.body.getWidth(-49);
                    var8Lifetime2 = this.body.getHeight((byte) 55);
                    var9Lifetime2 = this.body.getRoom((byte) 79);
                    if (var5Lifetime2 != 0 &&
                      this.occupiesTiles) {
                      var9Lifetime2.removeTileOccupancy(var2, var8Lifetime2, var7Lifetime2, this.body.getY(9648), -119, this.body.getX(3), var3);
                      this.occupiesTiles = false;
                    }
                    if (var6Lifetime2 != 0 &&
                      !this.occupiesTiles) {
                      var9Lifetime2.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime2, var8Lifetime2, 121);
                      this.occupiesTiles = true;
                    }
                    return;
                  }
                  if (var5Lifetime2 == 0) {
                    return;
                  }
                  var7Lifetime2Lifetime2 = this.body.getWidth(-49);
                  var8Lifetime2Lifetime2 = this.body.getHeight((byte) 55);
                  var9Lifetime2 = this.body.getRoom((byte) 79);
                  if (var5Lifetime2 != 0 &&
                    this.occupiesTiles) {
                    var9Lifetime2.removeTileOccupancy(var2, var8Lifetime2Lifetime2, var7Lifetime2Lifetime2, this.body.getY(9648), -119, this.body.getX(3), var3);
                    this.occupiesTiles = false;
                  }
                  if (var6Lifetime2 != 0 &&
                    !this.occupiesTiles) {
                    var9Lifetime2.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime2Lifetime2, var8Lifetime2Lifetime2, 121);
                    this.occupiesTiles = true;
                  }
                  return;
                }
                stackIn_185_0 = (!this.part.isStopped((byte) 87)) ? 0 : 1;
                var5Lifetime2 = stackIn_185_0;
              }
              if (var5Lifetime2 != 0) {
                stackIn_192_0 = (var4Lifetime2 != 0) ? 1 : 0;
              } else {
                stackIn_192_0 = 1;
              }
              var6Lifetime2 = stackIn_192_0;
            }
            if (var6Lifetime2 == 0 &&
              var5Lifetime2 == 0) {
              return;
            }
            var7Lifetime2Lifetime1 = this.body.getWidth(-49);
            var8Lifetime2Lifetime1 = this.body.getHeight((byte) 55);
            var9Lifetime2Lifetime1 = this.body.getRoom((byte) 79);
            if (var5Lifetime2 != 0 &&
              this.occupiesTiles) {
              var9Lifetime2Lifetime1.removeTileOccupancy(var2, var8Lifetime2Lifetime1, var7Lifetime2Lifetime1, this.body.getY(9648), -119, this.body.getX(3), var3);
              this.occupiesTiles = false;
            }
            if (var6Lifetime2 != 0 &&
              !this.occupiesTiles) {
              var9Lifetime2Lifetime1.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime2Lifetime1, var8Lifetime2Lifetime1, 121);
              this.occupiesTiles = true;
            }
            return;
          }
          stackIn_218_0 = 0;
        }
        var5Lifetime3 = stackIn_218_0;
        if (this.part != null) {
          if (var5Lifetime3 != 0) {
            var5Lifetime3 = 1;
            regionExit2: {
              if (var5Lifetime3 != 0) {
                if (var4Lifetime2 != 0) {
                  var6Lifetime3 = 1;
                  break regionExit2;
                }
                stackIn_246_0 = 0;
              } else {
                stackIn_246_0 = 1;
              }
              var6Lifetime3 = stackIn_246_0;
            }
            if (var6Lifetime3 == 0 &&
              var5Lifetime3 == 0) {
              return;
            }
            var7Lifetime3 = this.body.getWidth(-49);
            var8Lifetime3 = this.body.getHeight((byte) 55);
            var9Lifetime3 = this.body.getRoom((byte) 79);
            if (var5Lifetime3 == 0) {
              if (var6Lifetime3 != 0 &&
                !this.occupiesTiles) {
                var9Lifetime3.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime3, var8Lifetime3, 121);
                this.occupiesTiles = true;
              }
              return;
            }
            if (!this.occupiesTiles) {
              if (var6Lifetime3 != 0 &&
                !this.occupiesTiles) {
                var9Lifetime3.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime3, var8Lifetime3, 121);
                this.occupiesTiles = true;
              }
              return;
            }
            var9Lifetime3.removeTileOccupancy(var2, var8Lifetime3, var7Lifetime3, this.body.getY(9648), -119, this.body.getX(3), var3);
            this.occupiesTiles = false;
            if (var6Lifetime3 == 0) {
              return;
            }
            if (this.occupiesTiles) {
              return;
            }
            var9Lifetime3.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime3, var8Lifetime3, 121);
            this.occupiesTiles = true;
            return;
          }
          if (!this.part.isEnabled(param0 ^ 12575)) {
            var5Lifetime3 = 1;
            regionExit3: {
              if (var5Lifetime3 != 0) {
                if (var4Lifetime2 != 0) {
                  var6Lifetime3Lifetime1 = 1;
                  break regionExit3;
                }
                stackIn_293_0 = 0;
              } else {
                stackIn_293_0 = 1;
              }
              var6Lifetime3Lifetime1 = stackIn_293_0;
            }
            if (var6Lifetime3Lifetime1 == 0 &&
              var5Lifetime3 == 0) {
              return;
            }
            var7Lifetime3Lifetime1 = this.body.getWidth(-49);
            var8Lifetime3Lifetime1 = this.body.getHeight((byte) 55);
            var9Lifetime3Lifetime1 = this.body.getRoom((byte) 79);
            if (var5Lifetime3 == 0) {
              if (var6Lifetime3Lifetime1 != 0 &&
                !this.occupiesTiles) {
                var9Lifetime3Lifetime1.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime3Lifetime1, var8Lifetime3Lifetime1, 121);
                this.occupiesTiles = true;
              }
              return;
            }
            if (!this.occupiesTiles) {
              if (var6Lifetime3Lifetime1 != 0 &&
                !this.occupiesTiles) {
                var9Lifetime3Lifetime1.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime3Lifetime1, var8Lifetime3Lifetime1, 121);
                this.occupiesTiles = true;
              }
              return;
            }
            var9Lifetime3Lifetime1.removeTileOccupancy(var2, var8Lifetime3Lifetime1, var7Lifetime3Lifetime1, this.body.getY(9648), -119, this.body.getX(3), var3);
            this.occupiesTiles = false;
            if (var6Lifetime3Lifetime1 != 0) {
              if (this.occupiesTiles) {
                return;
              }
              var9Lifetime3Lifetime1.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime3Lifetime1, var8Lifetime3Lifetime1, 121);
              this.occupiesTiles = true;
            }
            return;
          }
          if (this.part.isStopped((byte) 87)) {
            var5Lifetime3 = 1;
            if (var5Lifetime3 != 0) {
              stackIn_322_0 = (var4Lifetime2 != 0) ? 1 : 0;
              var6Lifetime3Lifetime2 = stackIn_322_0;
            } else {
              stackIn_317_0 = 1;
              var6Lifetime3Lifetime2 = stackIn_317_0;
            }
            if (var6Lifetime3Lifetime2 == 0 &&
              var5Lifetime3 == 0) {
              return;
            }
            var7Lifetime3Lifetime2 = this.body.getWidth(-49);
            var8Lifetime3Lifetime2 = this.body.getHeight((byte) 55);
            var9Lifetime3Lifetime2 = this.body.getRoom((byte) 79);
            if (var5Lifetime3 != 0 &&
              this.occupiesTiles) {
              var9Lifetime3Lifetime2.removeTileOccupancy(var2, var8Lifetime3Lifetime2, var7Lifetime3Lifetime2, this.body.getY(9648), -119, this.body.getX(3), var3);
              this.occupiesTiles = false;
            }
            if (var6Lifetime3Lifetime2 != 0 &&
              !this.occupiesTiles) {
              var9Lifetime3Lifetime2.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime3Lifetime2, var8Lifetime3Lifetime2, 121);
              this.occupiesTiles = true;
            }
            return;
          }
          var5Lifetime3 = 0;
        }
        regionExit4: {
          if (var5Lifetime3 != 0) {
            if (var4Lifetime2 != 0) {
              var6Lifetime4 = 1;
              if (var6Lifetime4 == 0 &&
                var5Lifetime3 == 0) {
                return;
              }
              var7Lifetime4 = this.body.getWidth(-49);
              var8Lifetime4 = this.body.getHeight((byte) 55);
              var9Lifetime4 = this.body.getRoom((byte) 79);
              if (!this.occupiesTiles) {
                if (var6Lifetime4 != 0 &&
                  !this.occupiesTiles) {
                  var9Lifetime4.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime4, var8Lifetime4, 121);
                  this.occupiesTiles = true;
                }
                return;
              }
              var9Lifetime4.removeTileOccupancy(var2, var8Lifetime4, var7Lifetime4, this.body.getY(9648), -119, this.body.getX(3), var3);
              this.occupiesTiles = false;
              break regionExit4;
            }
            stackIn_362_0 = 0;
          } else {
            stackIn_362_0 = 1;
          }
          var6Lifetime4 = stackIn_362_0;
          if (var6Lifetime4 == 0 &&
            var5Lifetime3 == 0) {
            return;
          }
          var7Lifetime4 = this.body.getWidth(-49);
          var8Lifetime4 = this.body.getHeight((byte) 55);
          var9Lifetime4 = this.body.getRoom((byte) 79);
          if (var5Lifetime3 != 0 &&
            this.occupiesTiles) {
            var9Lifetime4.removeTileOccupancy(var2, var8Lifetime4, var7Lifetime4, this.body.getY(9648), -119, this.body.getX(3), var3);
            this.occupiesTiles = false;
          }
        }
        if (var6Lifetime4 != 0) {
          if (this.occupiesTiles) {
            return;
          }
          var9Lifetime4.addTileOccupancy(var3, var2, this.body.getX(3), this.body.getY(9648), var7Lifetime4, var8Lifetime4, 121);
          this.occupiesTiles = true;
        }
        return;
    }

    int getWideOccupancyMode(byte param0) {
        int var2 = 121 % ((param0 - 15) / 45);
        return -1;
    }

    void encode(byte param0, BitPacketBuffer param1) {
        try {
          if (0 < this.elevationOffset) {
            param1.writeBits((byte) 12, 1, 1);
            param1.writeBits((byte) -128, this.elevationOffset, 8);
          } else {
            param1.writeBits((byte) -125, 0, 1);
          }
          int var3_int = -48 / ((-8 - param0) / 40);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final TrapPart getPart(int param0) {
        if (param0 > -73) {
          this.category = -95;
          return this.part;
        }
        return this.part;
    }

    public void updateAnimation(int param0) {
        if (param0 != -4366) {
          this.elevationOffset = -35;
        }
    }

    final int getCategory(byte param0) {
        if (param0 <= 1) {
          this.onRemoved((byte) -62, -88);
          return this.category;
        }
        return this.category;
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          return true;
        }
        return this.g((byte) -105);
    }

    void attach(TrapPart param0, WorldBody param1, byte param2) {
        try {
          this.part = param0;
          if (param2 != 36) {
            Camera var5 = (Camera) null;
            this.render(-31, (Camera) null);
          }
          this.body = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "dg.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void detachBody(byte param0) {
        if (param0 == -30) {
          this.updateTileOccupancy(param0 - 12633);
          this.body = null;
          return;
        }
        this.body = (WorldBody) null;
        this.updateTileOccupancy(param0 - 12633);
        this.body = null;
    }

    abstract void drawAt(Camera param0, int param1, int param2, int param3, byte param4);

    private final boolean g(byte param0) {
        int var2;
        var2 = -58 % ((-38 - param0) / 60);
        if (this.a((byte) 74)) {
          if (null != this.part &&
            this.part.isStopped((byte) 87)) {
            return true;
          }
          if (null != this.body &&
            !this.body.isExpired(18407)) {
            return false;
          }
          return true;
        }
        if (this.part == null) {
          return true;
        }
        if (this.part.isStopped((byte) 87)) {
          return true;
        }
        if (null == this.body) {
          return true;
        }
        if (this.body.isExpired(18407)) {
          return true;
        }
        return false;
    }

    public final void render(int param0, Camera param1) {
        Object var3 = null;
        int var4 = 0;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.body) {
            if (this.body.isOutsideActiveVariant(0)) {
              return;
            }
            var3 = null;
            if (this.body instanceof Trap) {
              var3 = (Trap) (this.body);
            }
            var4 = (this.elevationOffset << 16) + this.body.getElevation((byte) 115);
            this.drawAt(param1, this.body.getY(9648), this.body.getX(3), var4, (byte) 46);
            if (var3 != null) {
              ((Trap) (var3)).a(param1, -10425);
            }
          }
          if (param0 <= 103) {
            this.elevationOffset = 112;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("dg.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.wrapException((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void refreshTileOccupancy(int param0) {
        if (param0 >= -16) {
          this.getRoom(-26);
          this.updateTileOccupancy(-12663);
          return;
        }
        this.updateTileOccupancy(-12663);
    }

    void onRemoved(byte param0, int param1) {
        int var3 = -51 % ((param0 - 7) / 36);
    }

    TrapModel(int param0, Room param1, BitPacketBuffer param2) {
        this(param0);
        try {
          this.decode(125, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "dg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void mirror(int param0) {
        if (param0 < 0) {
          this.elevationOffset = 78;
        }
    }

    final Room getRoom(int param0) {
        if (param0 < 12) {
          this.a((byte) -118);
          if (this.body != null) {
            return this.body.getRoom((byte) 116);
          }
          return null;
        }
        if (this.body != null) {
          return this.body.getRoom((byte) 116);
        }
        return null;
    }

    final WorldBody getBody(byte param0) {
        if (param0 != 16) {
          this.part = (TrapPart) null;
          return this.body;
        }
        return this.body;
    }

    int getSceneLayer(byte param0) {
        if (param0 != -99) {
          this.occupiesTiles = true;
          if (!this.body.isFallingIntoPit(param0 + 98)) {
            return 7;
          }
          return 2;
        }
        if (!this.body.isFallingIntoPit(param0 + 98)) {
          return 7;
        }
        return 2;
    }

    void removeFromLayer(int param0, RenderScene param1, byte param2) {
        try {
          if (param2 < 40) {
            this.onRemoved((byte) -28, 26);
          }
          param1.removeFromLayer(param0, (Renderable) (this), (byte) -33);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "dg.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    void decode(int param0, Room param1, BitPacketBuffer param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1.formatVersion >= 15) {
            if (param2.readBits((byte) 44, 1) != 1) {
              this.elevationOffset = 0;
            } else {
              this.elevationOffset = param2.readBits((byte) 44, 8);
            }
          }
          if (param0 < 119) {
            this.tick(14);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("dg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public int getRenderZ(byte param0) {
        if (param0 > -86) {
          this.getSceneLayer((byte) -84);
          if (null != this.body) {
            return this.body.getElevation((byte) 115) + (this.elevationOffset << 16);
          }
          return 0;
        }
        if (null != this.body) {
          return this.body.getElevation((byte) 115) + (this.elevationOffset << 16);
        }
        return 0;
    }

    final void addElevationOffset(int param0, byte param1) {
        this.elevationOffset = this.elevationOffset + param0;
        if (param1 <= 112) {
          this.elevationOffset = -110;
        }
    }

    final boolean a(byte param0) {
        int var2 = -53 / ((param0 + 10) / 59);
        return true;
    }

    void addToLayer(byte param0, int param1, RenderScene param2) {
        try {
          if (param0 <= 50) {
            this.getOccupancyLayer((byte) 49);
          }
          param2.addToLayer((byte) -99, param1, (Renderable) (this));
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "dg.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void tick(int param0) {
        if (param0 != -1) {
          return;
        }
        this.updateTileOccupancy(-12663);
    }

    void removeFromScene(RenderScene param0, int param1) {
        if (this.sceneLayer == -1) {
          return;
        }
        try {
          param0.removeFromLayer(this.sceneLayer, (Renderable) (this), (byte) -33);
          this.sceneLayer = -1;
          if (param1 < 82) {
            this.tick(-6);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "dg.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void updateSceneLayer(int param0, RenderScene param1) {
        if (this.sceneLayer == -1) {
          return;
        }
        if (param0 > -39) {
          this.field_g = 41;
        }
        int var3_int = this.getSceneLayer((byte) -99);
        if (this.sceneLayer == var3_int) {
          return;
        }
        try {
          this.removeFromLayer(this.sceneLayer, param1, (byte) 53);
          this.addToLayer((byte) 86, var3_int, param1);
          this.sceneLayer = var3_int;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "dg.IA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    TrapModel(int param0) {
        this.occupiesTiles = false;
        this.sceneLayer = -1;
        this.category = param0;
    }

    static {
    }
}
