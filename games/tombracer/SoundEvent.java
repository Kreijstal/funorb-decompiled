/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEvent extends IntrusiveNode {
    static int field_m;
    static SpriteData field_h;
    static int field_j;
    private int x;
    private int y;
    private int soundId;
    static String field_l;
    private int parameter;

    public static void releaseStatics(int param0) {
        field_h = null;
        field_l = null;
        if (param0 > -119) {
          field_j = 3;
        }
    }

    final int getX(int param0) {
        int var2 = 116 / ((-37 - param0) / 62);
        return this.x;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8, int param9) {
        if (param2 < pka.field_b) {
          PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
        } else {
          if (DiskCacheWorker.field_c < param2) {
            PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
          } else {
            if (param1 < pka.field_b) {
              PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
            } else {
              if (DiskCacheWorker.field_c < param1) {
                PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
              } else {
                if (pka.field_b > param7) {
                  PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                } else {
                  if (param7 > DiskCacheWorker.field_c) {
                    PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                  } else {
                    if (pka.field_b > param0) {
                      PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                    } else {
                      if (DiskCacheWorker.field_c < param0) {
                        PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                      } else {
                        if (gca.field_d > param5) {
                          PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                        } else {
                          if (param5 > LineShape.field_h) {
                            PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                          } else {
                            if (param9 < gca.field_d) {
                              PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                            } else {
                              if (param9 > LineShape.field_h) {
                                PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                              } else {
                                if (gca.field_d > param3) {
                                  PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                                } else {
                                  if (param3 > LineShape.field_h) {
                                    PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                                  } else {
                                    if (param6 < gca.field_d) {
                                      PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                                    } else {
                                      if (param6 > LineShape.field_h) {
                                        PlatformMazeComponent.drawBezierCurve(param1, param7, param2, param0, param6, param5, param3, param4, (byte) -73, param9);
                                      } else {
                                        RoomDefinition.a(param7, param1, param0, param3, -93, param6, param2, param9, param4, param5);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (param8 <= -58) {
          return;
        }
        SoundEvent.releaseStatics(31);
    }

    final static int withFullAlpha(boolean param0, int param1) {
        if (param0) {
          field_h = (SpriteData) null;
          return jg.withAlpha(255, (byte) -96, param1);
        }
        return jg.withAlpha(255, (byte) -96, param1);
    }

    final int getSoundId(int param0) {
        if (param0 != 9800) {
          return 85;
        }
        return this.soundId;
    }

    final int getY(int param0) {
        int var2 = 106 / ((-67 - param0) / 54);
        return this.y;
    }

    SoundEvent(int param0, int param1, int param2, int param3) {
        this.y = param2;
        this.x = param1;
        this.parameter = param3;
        this.soundId = param0;
    }

    final int getParameter(int param0) {
        if (param0 != 4) {
          this.getX(8);
          return this.parameter;
        }
        return this.parameter;
    }

    static {
        field_l = "Please enter your age in years";
        field_m = 4;
    }
}
