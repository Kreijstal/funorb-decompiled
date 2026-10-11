/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qp extends dr {
    static String field_E;

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -24872) {
            qp.g(125);
          }
          stackIn_3_0 = new nd(sq.a(param1[2].a(param0 ^ -24870), (byte) -2, param1[0].a(2), param1[1].a(2)));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qp.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int e(byte param0) {
        if (param0 >= -123) {
          Random var2 = (Random) null;
          qp.a(-126, -81, -63, -13, -70, -42, (Battlefield) null, -51, (Random) null);
        }
        return nm.field_z;
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, boolean param8, RgbSprite param9) {
        int var11 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          no.field_P.field_v = SoftwareRaster.field_g;
          if (param0 != 1) {
            qp.g(111);
          }
          no.field_P.field_y = SoftwareRaster.field_l;
          no.field_P.field_B = SoftwareRaster.field_d;
          if (param6) {
            if (dv.field_k == null ||
              t.field_f != param7) {
              t.field_f = param7;
              dv.field_k = a.field_m[0].g();
              var19 = dv.field_k.field_B;
              var18 = var19;
              var17 = var18;
              var10 = var17;
              for (var11 = 0; var19.length > var11; var11++) {
                var12 = 255 & var19[var11];
                var13 = (255 & param7 >> 16) * var12 >> 8;
                var14 = ((65280 & param7) >> 8) * var12 >> 8;
                var15 = (255 & param7) * var12 >> 8;
                var17[var11] = (var14 << 8) + (var13 << 16) + var15;
              }
            }
            dv.field_k.d(param3 - 20, -15 + param2, 92, 92, 256);
          }
          if (!param5) {
            param9.g(param3, param2);
            if (!param1) {
              if (param8) {
                fe.a(a.field_m[2], param3, param2, 56, 56);
                a.field_m[2].d(param3, param2, 56, 56, 228);
              } else {
                if (param4) {
                  a.field_m[3].e(param3, param2);
                }
              }
            } else {
              a.field_m[1].e(param3, param2);
            }
          } else {
            ku.field_J.b();
            SoftwareRaster.b();
            param9.g(0, 0);
            if (!param1) {
              if (param8) {
                fe.a(a.field_m[2], 0, 0, 56, 56);
                a.field_m[2].d(0, 0, 56, 56, 228);
              } else {
                if (!param4) {
                  no.field_P.b();
                  ku.field_J.h(param3, param2);
                  return;
                }
                a.field_m[3].e(0, 0);
              }
            } else {
              a.field_m[1].e(0, 0);
            }
            no.field_P.b();
            ku.field_J.h(param3, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_30_0 = var10_ref;
          stackIn_30_1 = new StringBuilder().append("qp.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    qp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        if (param0 < 114) {
          RgbSprite var2 = (RgbSprite) null;
          qp.a(-47, true, -89, 99, true, true, false, -24, false, (RgbSprite) null);
        }
        field_E = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, Battlefield param6, int param7, Random param8) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_140_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_144_0 = 0;
        int stackIn_145_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_183_0 = 0;
        int stackIn_184_1 = 0;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        String stackIn_192_2 = null;
        StringBuilder stackIn_194_1 = null;
        String stackIn_195_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (5 == param5) {
            return;
          }
          boolean decompiledFrameCompleted14 = true;
          boolean decompiledFrameCompleted13 = true;
          boolean decompiledFrameCompleted12 = true;
          boolean decompiledFrameCompleted11 = true;
          boolean decompiledFrameCompleted10 = true;
          boolean decompiledFrameCompleted9 = true;
          boolean decompiledFrameCompleted8 = true;
          boolean decompiledFrameCompleted7 = true;
          boolean decompiledFrameCompleted6 = true;
          boolean decompiledFrameCompleted5 = true;
          boolean decompiledFrameCompleted4 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          var9_int = -param4 + param1;
          var10 = param3 - param0;
          var11 = 0;
          var12 = 0;
          var13 = 0;
          var14 = 0;
          if (param1 == param4) {
            stackIn_7_0 = (0 >= var10) ? -1 : 1;
            var11 = stackIn_7_0;
            while (true) {
              if (var11 >= var10 ||
                0 >= var10) {
                stackIn_12_0 = var10;
                stackIn_12_1 = var11;
                if (stackIn_12_0 >= stackIn_12_1) {
                  decompiledFrameCompleted14 = false;
                  break;
                }
                if (var10 > 0) {
                  decompiledFrameCompleted13 = false;
                  break;
                }
              }
              if (null != param6.tiles[(param0 + var11) * param6.mapWidth + var12 + param4] &&
                param6.tiles[param6.mapWidth * (var11 + param0) + (var12 + param4)].terrainType == param7) {
                var14 = 1;
                decompiledFrameCompleted12 = false;
                break;
              }
              var13++;
              if (null == param6.tiles[var12 - (-param4 - param6.mapWidth * (var11 + param0))]) {
                param6.tiles[param6.mapWidth * (var11 + param0) + (param4 + var12)] = new MapTile(param7, param6);
              }
              stackIn_22_0 = var11;
              if (var10 > 0) {
                stackIn_23_1 = 1;
              } else {
                stackIn_23_1 = -1;
              }
              var11 = stackIn_22_0 + stackIn_23_1;
            }
          }
          if ((decompiledFrameCompleted14) &&
            (decompiledFrameCompleted13) &&
            (decompiledFrameCompleted12)) {
            if (param3 == param0) {
              stackIn_28_0 = (0 < var9_int) ? 1 : -1;
              var12 = stackIn_28_0;
              while (true) {
                if (var9_int <= var12 ||
                  var9_int <= 0) {
                  stackIn_33_0 = var9_int;
                  stackIn_33_1 = var12;
                  if (stackIn_33_0 >= stackIn_33_1) {
                    decompiledFrameCompleted11 = false;
                    break;
                  }
                  if (var9_int > 0) {
                    decompiledFrameCompleted10 = false;
                    break;
                  }
                }
                if (null != param6.tiles[(var11 + param0) * param6.mapWidth + (param4 + var12)] &&
                  param7 == param6.tiles[(param0 + var11) * param6.mapWidth + (var12 + param4)].terrainType) {
                  var14 = 1;
                  decompiledFrameCompleted9 = false;
                  break;
                }
                if (param6.tiles[param4 + (var12 + param6.mapWidth * (var11 + param0))] == null) {
                  param6.tiles[param4 + (var12 + param6.mapWidth * (var11 + param0))] = new MapTile(param7, param6);
                }
                var13++;
                stackIn_44_0 = var12;
                if (var9_int > 0) {
                  stackIn_45_1 = 1;
                } else {
                  stackIn_45_1 = -1;
                }
                var12 = stackIn_44_0 + stackIn_45_1;
              }
            }
            if ((decompiledFrameCompleted11) &&
              (decompiledFrameCompleted10) &&
              (decompiledFrameCompleted9)) {
              if (var9_int < 2 &&
                var9_int > -2) {
                stackIn_168_0 = (var10 > 0) ? 1 : -1;
                var11 = stackIn_168_0;
                while (true) {
                  if (var10 < var11 ||
                    var10 <= 0) {
                    stackIn_173_0 = ~var11;
                    stackIn_173_1 = ~var10;
                    if (stackIn_173_0 > stackIn_173_1) {
                      decompiledFrameCompleted8 = false;
                      break;
                    }
                    if (var10 > 0) {
                      decompiledFrameCompleted7 = false;
                      break;
                    }
                  }
                  if (null != param6.tiles[(var11 + param0) * param6.mapWidth + (var12 + param4)] &&
                    param6.tiles[param4 + (var12 + (var11 + param0) * param6.mapWidth)].terrainType == param7) {
                    var14 = 1;
                    decompiledFrameCompleted6 = false;
                    break;
                  }
                  var13++;
                  if (param6.tiles[(var11 + param0) * param6.mapWidth + var12 + param4] == null) {
                    param6.tiles[var12 + param4 + (param0 + var11) * param6.mapWidth] = new MapTile(param7, param6);
                  }
                  stackIn_183_0 = var11;
                  if (var10 <= 0) {
                    stackIn_184_1 = -1;
                  } else {
                    stackIn_184_1 = 1;
                  }
                  var11 = stackIn_183_0 + stackIn_184_1;
                }
              }
              if ((decompiledFrameCompleted8) &&
                (decompiledFrameCompleted7) &&
                (decompiledFrameCompleted6)) {
                if (var10 < 2 &&
                  var10 > -2) {
                  stackIn_149_0 = (var9_int > 0) ? 1 : -1;
                  var12 = stackIn_149_0;
                  while (true) {
                    if (var12 > var9_int ||
                      var9_int <= 0) {
                      if (var9_int > var12) {
                        decompiledFrameCompleted5 = false;
                        break;
                      }
                      if (var9_int > 0) {
                        decompiledFrameCompleted4 = false;
                        break;
                      }
                    }
                    if (null != param6.tiles[var12 + param4 + (var11 + param0) * param6.mapWidth] &&
                      param7 == param6.tiles[var12 + param4 + (param0 + var11) * param6.mapWidth].terrainType) {
                      var14 = 1;
                      decompiledFrameCompleted3 = false;
                      break;
                    }
                    var13++;
                    if (null == param6.tiles[param6.mapWidth * (var11 + param0) + (var12 + param4)]) {
                      param6.tiles[param6.mapWidth * (param0 + var11) + param4 + var12] = new MapTile(param7, param6);
                    }
                    stackIn_163_0 = var12;
                    if (var9_int > 0) {
                      stackIn_164_1 = 1;
                    } else {
                      stackIn_164_1 = -1;
                    }
                    var12 = stackIn_163_0 + stackIn_164_1;
                  }
                }
                if ((decompiledFrameCompleted5) &&
                  (decompiledFrameCompleted4) &&
                  (decompiledFrameCompleted3)) {
                  if (AttackEvent.a(false, 100, param8) > 50) {
                    stackIn_102_0 = (var9_int > 0) ? 1 : -1;
                    var12 = stackIn_102_0;
                    while (true) {
                      if (var12 >= var9_int ||
                        var9_int <= 0) {
                        stackIn_107_0 = ~var12;
                        if (stackIn_107_0 >= ~var9_int) {
                          decompiledFrameCompleted2 = false;
                          break;
                        }
                        if (var9_int > 0) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                      }
                      if (param6.tiles[param4 + (var12 + param6.mapWidth * (param0 + var11))] != null &&
                        param6.tiles[var12 + (param4 + param6.mapWidth * (var11 + param0))].terrainType == param7) {
                        var14 = 1;
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (param6.tiles[param4 + (var12 + (param0 + var11) * param6.mapWidth)] == null) {
                        param6.tiles[param4 + var12 + param6.mapWidth * (param0 + var11)] = new MapTile(param7, param6);
                      }
                      var13++;
                      if (var12 == var9_int >> 1) {
                        stackIn_120_0 = (var10 <= 0) ? -1 : 1;
                        var11 = stackIn_120_0;
                        scanLoop1: while (true) {
                          if (var10 < var11 ||
                            var10 <= 0) {
                            stackIn_125_0 = var11;
                            stackIn_125_1 = var10;
                            if (stackIn_125_0 < stackIn_125_1) {
                              break scanLoop1;
                            }
                            if (var10 > 0) {
                              break scanLoop1;
                            }
                          }
                          if (param6.tiles[var12 + param4 + (var11 + param0) * param6.mapWidth] != null &&
                            param7 == param6.tiles[(param0 + var11) * param6.mapWidth + (var12 + param4)].terrainType) {
                            break scanLoop1;
                          }
                          var13++;
                          if (null == param6.tiles[(param0 + var11) * param6.mapWidth + (param4 + var12)]) {
                            param6.tiles[param6.mapWidth * (var11 + param0) + param4 + var12] = new MapTile(param7, param6);
                          }
                          stackIn_136_0 = var11;
                          if (var10 <= 0) {
                            stackIn_137_1 = -1;
                          } else {
                            stackIn_137_1 = 1;
                          }
                          var11 = stackIn_136_0 + stackIn_137_1;
                          continue;

                        }
                        stackIn_140_0 = var11;
                        if (0 < var10) {
                          stackIn_141_1 = -1;
                        } else {
                          stackIn_141_1 = 1;
                        }
                        var11 = stackIn_140_0 + stackIn_141_1;
                      }
                      stackIn_144_0 = var12;
                      if (var9_int > 0) {
                        stackIn_145_1 = 1;
                      } else {
                        stackIn_145_1 = -1;
                      }
                      var12 = stackIn_144_0 + stackIn_145_1;
                    }
                  }
                  if ((decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1) &&
                    (decompiledFrameCompleted0)) {
                    stackIn_56_0 = (var10 <= 0) ? -1 : 1;
                    var11 = stackIn_56_0;
                    while (true) {
                      if (var10 <= var11 ||
                        var10 <= 0) {
                        stackIn_61_0 = var10;
                        stackIn_61_1 = var11;
                        if (stackIn_61_0 >= stackIn_61_1) {
                          break;
                        }
                        if (var10 > 0) {
                          break;
                        }
                      }
                      if (null != param6.tiles[param4 + (var12 + (param0 + var11) * param6.mapWidth)] &&
                        param6.tiles[var12 + param4 + param6.mapWidth * (var11 + param0)].terrainType == param7) {
                        var14 = 1;
                        break;
                      }
                      if (null == param6.tiles[(var11 + param0) * param6.mapWidth + (param4 + var12)]) {
                        param6.tiles[var12 + param4 + param6.mapWidth * (param0 + var11)] = new MapTile(param7, param6);
                      }
                      var13++;
                      if (var11 == var10 >> 1) {
                        stackIn_74_0 = (var9_int > 0) ? 1 : -1;
                        var12 = stackIn_74_0;
                        scanLoop2: while (true) {
                          if (var9_int < var12 ||
                            0 >= var9_int) {
                            stackIn_79_0 = ~var9_int;
                            stackIn_79_1 = ~var12;
                            if (stackIn_79_0 < stackIn_79_1) {
                              break scanLoop2;
                            }
                            if (var9_int > 0) {
                              break scanLoop2;
                            }
                          }
                          if (param6.tiles[(param0 + var11) * param6.mapWidth + (var12 + param4)] != null &&
                            param7 == param6.tiles[(var11 + param0) * param6.mapWidth + (param4 + var12)].terrainType) {
                            break scanLoop2;
                          }
                          var13++;
                          if (null == param6.tiles[param6.mapWidth * (param0 + var11) + (param4 + var12)]) {
                            param6.tiles[param4 + (var12 + (param0 + var11) * param6.mapWidth)] = new MapTile(param7, param6);
                          }
                          stackIn_89_0 = var12;
                          if (var9_int > 0) {
                            stackIn_90_1 = 1;
                          } else {
                            stackIn_90_1 = -1;
                          }
                          var12 = stackIn_89_0 + stackIn_90_1;
                          continue;

                        }
                        stackIn_93_0 = var12;
                        if (var9_int <= 0) {
                          stackIn_94_1 = 1;
                        } else {
                          stackIn_94_1 = -1;
                        }
                        var12 = stackIn_93_0 + stackIn_94_1;
                      }
                      stackIn_97_0 = var11;
                      if (var10 > 0) {
                        stackIn_98_1 = 1;
                      } else {
                        stackIn_98_1 = -1;
                      }
                      var11 = stackIn_97_0 + stackIn_98_1;
                    }
                  }
                }
              }
            }
          }
          if (param2 == ~var13 &&
            var14 == 0) {
            var13 = 1;
            qp.a(param0, param1, param2 ^ 0, param3, param4, param5 + 1, param6, param7, param8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_191_0 = var9;
          stackIn_191_1 = new StringBuilder().append("qp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_192_2 = "null";
          } else {
            stackIn_192_2 = "{...}";
          }
          stackIn_194_1 = ((StringBuilder) (Object) stackIn_191_1).append(stackIn_192_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_195_2 = "null";
          } else {
            stackIn_195_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_191_0), ((StringBuilder) (Object) stackIn_194_1).append(stackIn_195_2).append(')').toString());
        }
    }

    static {
        field_E = "Find opponents";
    }
}
