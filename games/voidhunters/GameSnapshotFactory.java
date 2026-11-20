/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameSnapshotFactory implements GameStateFactory {
    static int[] field_a;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 <= 14) {
          field_a = (int[]) null;
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -7 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new GameSnapshot());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (int[]) null;
          return (SerializableGameState[]) ((Object) new GameSnapshot[param1]);
        }
        return (SerializableGameState[]) ((Object) new GameSnapshot[param1]);
    }

    final static int a(int param0, byte param1, int param2) {
        if (param2 >= 16384) {
          if (param2 < 536870912 &&
            param2 >= -536870912 &&
            param0 < 536870912) {
            if (param0 < -536870912) {
              param2 = param2 >> 16;
              param0 = param0 >> 16;
              if (2097152 <= param2 ||
                param2 < -2097152 ||
                param0 >= 2097152 ||
                param0 < -2097152) {
                param0 = param0 >> 8;
                param2 = param2 >> 8;
              }
              if (param2 >= 131072 ||
                param2 < -131072 ||
                131072 <= param0 ||
                param0 < -131072) {
                param0 = param0 >> 4;
                param2 = param2 >> 4;
              }
              if (param2 >= 32768 ||
                param2 < -32768 ||
                param0 >= 32768 ||
                param0 < -32768) {
                param2 = param2 >> 2;
                param0 = param0 >> 2;
              }
              if (16384 <= param2 ||
                param2 < -16384 ||
                16384 <= param0 ||
                param0 < -16384) {
                param0 = param0 >> 1;
                param2 = param2 >> 1;
              }
              if (param1 != -77) {
                GameSnapshotFactory.clearSharedReferences(34);
              }
              return SpriteDimensions.atan2Angle(param0, 102, param2);
            }
          } else {
            param2 = param2 >> 16;
            param0 = param0 >> 16;
          }
          if (2097152 <= param2 ||
            param2 < -2097152 ||
            param0 >= 2097152 ||
            param0 < -2097152) {
            param0 = param0 >> 8;
            param2 = param2 >> 8;
          }
          if (param2 < 131072 &&
            param2 >= -131072 &&
            131072 > param0) {
            if (param0 < -131072) {
              param0 = param0 >> 4;
              param2 = param2 >> 4;
              if (param2 >= 32768 ||
                param2 < -32768 ||
                param0 >= 32768 ||
                param0 < -32768) {
                param2 = param2 >> 2;
                param0 = param0 >> 2;
              }
              if (16384 <= param2 ||
                param2 < -16384 ||
                16384 <= param0 ||
                param0 < -16384) {
                param0 = param0 >> 1;
                param2 = param2 >> 1;
              }
              if (param1 != -77) {
                GameSnapshotFactory.clearSharedReferences(34);
              }
              return SpriteDimensions.atan2Angle(param0, 102, param2);
            }
          } else {
            param0 = param0 >> 4;
            param2 = param2 >> 4;
          }
          if (param2 >= 32768 ||
            param2 < -32768 ||
            param0 >= 32768 ||
            param0 < -32768) {
            param2 = param2 >> 2;
            param0 = param0 >> 2;
          }
          if (16384 > param2 &&
            param2 >= -16384 &&
            16384 > param0 &&
            param0 >= -16384) {
            if (param1 != -77) {
              GameSnapshotFactory.clearSharedReferences(34);
            }
            return SpriteDimensions.atan2Angle(param0, 102, param2);
          }
          param0 = param0 >> 1;
          param2 = param2 >> 1;
        } else {
          if (param2 < -16384) {
            if (param2 < 536870912 &&
              param2 >= -536870912 &&
              param0 < 536870912) {
              if (param0 < -536870912) {
                param2 = param2 >> 16;
                param0 = param0 >> 16;
                if (2097152 <= param2 ||
                  param2 < -2097152 ||
                  param0 >= 2097152 ||
                  param0 < -2097152) {
                  param0 = param0 >> 8;
                  param2 = param2 >> 8;
                }
                if (param2 >= 131072 ||
                  param2 < -131072 ||
                  131072 <= param0 ||
                  param0 < -131072) {
                  param0 = param0 >> 4;
                  param2 = param2 >> 4;
                }
                if (param2 >= 32768 ||
                  param2 < -32768 ||
                  param0 >= 32768 ||
                  param0 < -32768) {
                  param2 = param2 >> 2;
                  param0 = param0 >> 2;
                }
                if (16384 <= param2 ||
                  param2 < -16384 ||
                  16384 <= param0 ||
                  param0 < -16384) {
                  param0 = param0 >> 1;
                  param2 = param2 >> 1;
                }
                if (param1 != -77) {
                  GameSnapshotFactory.clearSharedReferences(34);
                }
                return SpriteDimensions.atan2Angle(param0, 102, param2);
              }
            } else {
              param2 = param2 >> 16;
              param0 = param0 >> 16;
            }
            if (2097152 <= param2 ||
              param2 < -2097152 ||
              param0 >= 2097152 ||
              param0 < -2097152) {
              param0 = param0 >> 8;
              param2 = param2 >> 8;
            }
            if (param2 < 131072 &&
              param2 >= -131072 &&
              131072 > param0) {
              if (param0 < -131072) {
                param0 = param0 >> 4;
                param2 = param2 >> 4;
                if (param2 >= 32768 ||
                  param2 < -32768 ||
                  param0 >= 32768 ||
                  param0 < -32768) {
                  param2 = param2 >> 2;
                  param0 = param0 >> 2;
                }
                if (16384 <= param2 ||
                  param2 < -16384 ||
                  16384 <= param0 ||
                  param0 < -16384) {
                  param0 = param0 >> 1;
                  param2 = param2 >> 1;
                }
                if (param1 != -77) {
                  GameSnapshotFactory.clearSharedReferences(34);
                }
                return SpriteDimensions.atan2Angle(param0, 102, param2);
              }
            } else {
              param0 = param0 >> 4;
              param2 = param2 >> 4;
            }
            if (param2 >= 32768 ||
              param2 < -32768 ||
              param0 >= 32768 ||
              param0 < -32768) {
              param2 = param2 >> 2;
              param0 = param0 >> 2;
            }
            if (16384 > param2 &&
              param2 >= -16384 &&
              16384 > param0 &&
              param0 >= -16384) {
              if (param1 != -77) {
                GameSnapshotFactory.clearSharedReferences(34);
              }
              return SpriteDimensions.atan2Angle(param0, 102, param2);
            }
            param0 = param0 >> 1;
            param2 = param2 >> 1;
          } else {
            if (16384 <= param0) {
              if (param2 < 536870912 &&
                param2 >= -536870912 &&
                param0 < 536870912) {
                if (param0 < -536870912) {
                  param2 = param2 >> 16;
                  param0 = param0 >> 16;
                  if (2097152 <= param2 ||
                    param2 < -2097152 ||
                    param0 >= 2097152 ||
                    param0 < -2097152) {
                    param0 = param0 >> 8;
                    param2 = param2 >> 8;
                  }
                  if (param2 < 131072 &&
                    param2 >= -131072 &&
                    131072 > param0) {
                    if (param0 < -131072) {
                      param0 = param0 >> 4;
                      param2 = param2 >> 4;
                      if (param2 >= 32768 ||
                        param2 < -32768 ||
                        param0 >= 32768 ||
                        param0 < -32768) {
                        param2 = param2 >> 2;
                        param0 = param0 >> 2;
                      }
                      if (16384 <= param2 ||
                        param2 < -16384 ||
                        16384 <= param0 ||
                        param0 < -16384) {
                        param0 = param0 >> 1;
                        param2 = param2 >> 1;
                      }
                      if (param1 != -77) {
                        GameSnapshotFactory.clearSharedReferences(34);
                      }
                      return SpriteDimensions.atan2Angle(param0, 102, param2);
                    }
                  } else {
                    param0 = param0 >> 4;
                    param2 = param2 >> 4;
                  }
                  if (param2 >= 32768 ||
                    param2 < -32768 ||
                    param0 >= 32768 ||
                    param0 < -32768) {
                    param2 = param2 >> 2;
                    param0 = param0 >> 2;
                  }
                  if (16384 <= param2 ||
                    param2 < -16384 ||
                    16384 <= param0 ||
                    param0 < -16384) {
                    param0 = param0 >> 1;
                    param2 = param2 >> 1;
                  }
                  if (param1 == -77) {
                    return SpriteDimensions.atan2Angle(param0, 102, param2);
                  }
                  GameSnapshotFactory.clearSharedReferences(34);
                  return SpriteDimensions.atan2Angle(param0, 102, param2);
                }
              } else {
                param2 = param2 >> 16;
                param0 = param0 >> 16;
              }
              if (2097152 <= param2 ||
                param2 < -2097152 ||
                param0 >= 2097152 ||
                param0 < -2097152) {
                param0 = param0 >> 8;
                param2 = param2 >> 8;
              }
              if (param2 < 131072 &&
                param2 >= -131072 &&
                131072 > param0) {
                if (param0 < -131072) {
                  param0 = param0 >> 4;
                  param2 = param2 >> 4;
                  if (param2 >= 32768 ||
                    param2 < -32768 ||
                    param0 >= 32768 ||
                    param0 < -32768) {
                    param2 = param2 >> 2;
                    param0 = param0 >> 2;
                  }
                  if (16384 <= param2 ||
                    param2 < -16384 ||
                    16384 <= param0 ||
                    param0 < -16384) {
                    param0 = param0 >> 1;
                    param2 = param2 >> 1;
                  }
                  if (param1 == -77) {
                    return SpriteDimensions.atan2Angle(param0, 102, param2);
                  }
                  GameSnapshotFactory.clearSharedReferences(34);
                  return SpriteDimensions.atan2Angle(param0, 102, param2);
                }
              } else {
                param0 = param0 >> 4;
                param2 = param2 >> 4;
              }
              if (param2 >= 32768 ||
                param2 < -32768 ||
                param0 >= 32768 ||
                param0 < -32768) {
                param2 = param2 >> 2;
                param0 = param0 >> 2;
              }
              if (16384 > param2 &&
                param2 >= -16384 &&
                16384 > param0 &&
                param0 >= -16384) {
                if (param1 == -77) {
                  return SpriteDimensions.atan2Angle(param0, 102, param2);
                }
                GameSnapshotFactory.clearSharedReferences(34);
                return SpriteDimensions.atan2Angle(param0, 102, param2);
              }
              param0 = param0 >> 1;
              param2 = param2 >> 1;
            } else {
              if (param0 < -16384) {
                if (param2 >= 536870912 ||
                  param2 < -536870912 ||
                  param0 >= 536870912 ||
                  param0 < -536870912) {
                  param2 = param2 >> 16;
                  param0 = param0 >> 16;
                }
                if (2097152 <= param2 ||
                  param2 < -2097152 ||
                  param0 >= 2097152 ||
                  param0 < -2097152) {
                  param0 = param0 >> 8;
                  param2 = param2 >> 8;
                }
                if (param2 < 131072 &&
                  param2 >= -131072 &&
                  131072 > param0) {
                  if (param0 < -131072) {
                    param0 = param0 >> 4;
                    param2 = param2 >> 4;
                    if (param2 >= 32768 ||
                      param2 < -32768 ||
                      param0 >= 32768 ||
                      param0 < -32768) {
                      param2 = param2 >> 2;
                      param0 = param0 >> 2;
                    }
                    if (16384 <= param2 ||
                      param2 < -16384 ||
                      16384 <= param0 ||
                      param0 < -16384) {
                      param0 = param0 >> 1;
                      param2 = param2 >> 1;
                    }
                    if (param1 != -77) {
                      GameSnapshotFactory.clearSharedReferences(34);
                    }
                    return SpriteDimensions.atan2Angle(param0, 102, param2);
                  }
                } else {
                  param0 = param0 >> 4;
                  param2 = param2 >> 4;
                }
                if (param2 >= 32768 ||
                  param2 < -32768 ||
                  param0 >= 32768 ||
                  param0 < -32768) {
                  param2 = param2 >> 2;
                  param0 = param0 >> 2;
                }
                if (16384 <= param2 ||
                  param2 < -16384 ||
                  16384 <= param0 ||
                  param0 < -16384) {
                  param0 = param0 >> 1;
                  param2 = param2 >> 1;
                }
                if (param1 == -77) {
                  return SpriteDimensions.atan2Angle(param0, 102, param2);
                }
                GameSnapshotFactory.clearSharedReferences(34);
                return SpriteDimensions.atan2Angle(param0, 102, param2);
              }
            }
          }
        }
        if (param1 == -77) {
          return SpriteDimensions.atan2Angle(param0, 102, param2);
        }
        GameSnapshotFactory.clearSharedReferences(34);
        return SpriteDimensions.atan2Angle(param0, 102, param2);
    }

    static {
        field_a = new int[]{25, 16, 17, 18, 19, 20, 21, 22, 23, 24};
    }
}
