/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mv {
    static sa field_c;
    static boolean field_b;
    static wk[] field_a;
    static String field_d;
    static String field_e;

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -40) {
                break L1;
              } else {
                mv.a(6, (byte) -96, -115, -102, -81);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (-8 >= (var5_int ^ -1)) {
                    if (param3 < 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L5: {
                        if (cu.field_a) {
                          break L5;
                        } else {
                          pv.field_e.b();
                          qn.b();
                          hh.field_d.d(0, hh.field_d.field_v >> 888526305, op.field_c[0][param3]);
                          so.field_b.a(5605);
                          pv.field_e.d(-20 + param0, -200 + param4, 75, 210, 255);
                          pv.field_e.c();
                          pv.field_e.d(-20 + param0, param4 - -10, 75, 50, 255);
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var5_int = -128;
                      L6: while (true) {
                        if (var5_int >= 16) {
                          break L3;
                        } else {
                          var6 = var5_int;
                          var7 = var5_int;
                          if (var11 == 0) {
                            L7: {
                              if (var7 > 0) {
                                var7 = 0;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              L9: {
                                var7 = var7 >> 5;
                                if ((var6 ^ -1) > -1) {
                                  break L9;
                                } else {
                                  var6 = -(var6 << 692930276) + 256;
                                  if (var11 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var6 = 256 + (var6 << 1148962625);
                              break L8;
                            }
                            ds.field_a[param3].f(param0 - 5 + (int)((double)var7 * Math.sin((double)(var5_int + param2) * 3.141592653589793 / 236.0)), param4 - -var5_int, var6 >> 1206293410);
                            ds.field_a[param3].f(param0 + (-20 - -(int)((double)var7 * Math.sin(3.141592653589793 * (double)(5 + (param2 + var5_int)) / 256.0))), param4 - -var5_int, var6 >> -146068158);
                            ds.field_a[param3].f((int)(Math.sin((double)(var5_int + (param2 + 10)) * 3.141592653589793 / 216.0) * (double)var7) + 10 + param0, param4 - -var5_int, var6 >> -366058654);
                            var5_int++;
                            continue L6;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  } else {
                    var6 = 16 - (param2 + 20 * var5_int) % 144;
                    var7 = var6;
                    var8 = var6;
                    var13 = var8;
                    var12 = 0;
                    if (var11 != 0) {
                      if (var12 >= var13) {
                        break L3;
                      } else {
                        L10: while (true) {
                          var6 = var5_int;
                          var7 = var5_int;
                          if (var11 == 0) {
                            L11: {
                              if (var7 > 0) {
                                var7 = 0;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: {
                              L13: {
                                var7 = var7 >> 5;
                                if ((var6 ^ -1) > -1) {
                                  break L13;
                                } else {
                                  var6 = -(var6 << 692930276) + 256;
                                  if (var11 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var6 = 256 + (var6 << 1148962625);
                              break L12;
                            }
                            ds.field_a[param3].f(param0 - 5 + (int)((double)var7 * Math.sin((double)(var5_int + param2) * 3.141592653589793 / 236.0)), param4 - -var5_int, var6 >> 1206293410);
                            ds.field_a[param3].f(param0 + (-20 - -(int)((double)var7 * Math.sin(3.141592653589793 * (double)(5 + (param2 + var5_int)) / 256.0))), param4 - -var5_int, var6 >> -146068158);
                            ds.field_a[param3].f((int)(Math.sin((double)(var5_int + (param2 + 10)) * 3.141592653589793 / 216.0) * (double)var7) + 10 + param0, param4 - -var5_int, var6 >> -366058654);
                            var5_int++;
                            if (var5_int >= 16) {
                              break L3;
                            } else {
                              continue L10;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    } else {
                      L14: {
                        if (var12 >= var13) {
                          break L14;
                        } else {
                          var8 = 0;
                          break L14;
                        }
                      }
                      L15: {
                        L16: {
                          var8 = var8 >> 3;
                          if (var7 < 0) {
                            break L16;
                          } else {
                            var7 = -(var7 << 519045956) + 256;
                            if (var11 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        var7 = (var7 << 1444769057) + 256;
                        break L15;
                      }
                      L17: {
                        L18: {
                          L19: {
                            L20: {
                              var9 = 0;
                              var10 = var5_int % 3;
                              if (var10 == 0) {
                                break L20;
                              } else {
                                L21: {
                                  if (-2 != (var10 ^ -1)) {
                                    break L21;
                                  } else {
                                    if (var11 == 0) {
                                      break L19;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                if (var10 != 2) {
                                  break L17;
                                } else {
                                  if (var11 == 0) {
                                    break L18;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            var9 = -5;
                            if (var11 == 0) {
                              break L17;
                            } else {
                              break L19;
                            }
                          }
                          var9 = -20;
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                        var9 = 10;
                        break L17;
                      }
                      L22: {
                        L23: {
                          if (param3 >= 0) {
                            break L23;
                          } else {
                            im.field_y.f(var9 + 10 + (param0 + (int)(Math.sin((double)(var6 - -(param2 * 3) - -10) * 3.141592653589793 / (double)(var5_int * 4 + 230)) * (double)var8)), var6 + param4, var7 >> -684576415);
                            if (var11 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        le.field_c[param3].f(param0 - (-10 - var9) - -(int)((double)var8 * Math.sin((double)(10 + var6 - -(param2 * 3)) * 3.141592653589793 / (double)(230 - -(4 * var5_int)))), param4 - -var6, var7 >> 185912161);
                        break L22;
                      }
                      var5_int++;
                      continue L2;
                    }
                  }
                }
                return;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "mv.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -48) {
            return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    static {
        field_c = new sa();
        field_e = "You can ask to join this game";
    }
}
