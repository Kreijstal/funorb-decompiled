/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class qe {
    static int field_a;
    static String[] field_g;
    static String field_e;
    String field_c;
    static boolean[] field_f;
    static int field_b;
    int field_d;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != 675834672) {
            field_e = null;
        }
        return new java.net.Socket(((qe) this).field_c, ((qe) this).field_d);
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, boolean param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = HoldTheLine.field_D;
          if (0 > param2) {
            break L0;
          } else {
            if (li.field_d <= param1) {
              break L0;
            } else {
              L1: {
                if (0 <= param6) {
                  break L1;
                } else {
                  if (0 <= param0) {
                    break L1;
                  } else {
                    if (param3 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (li.field_i > param6) {
                  break L2;
                } else {
                  if (param0 < li.field_i) {
                    break L2;
                  } else {
                    if (param3 < li.field_i) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (!param5) {
                L3: {
                  L4: {
                    var14 = param2 - param1;
                    if (param7 != param1) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (param1 == param2) {
                            break L6;
                          } else {
                            L7: {
                              L8: {
                                var15 = -param7 + param2;
                                if (param6 < param0) {
                                  break L8;
                                } else {
                                  var11 = (param3 - param0 << -577349424) / var15;
                                  var10 = param6 << -171538960;
                                  var9 = param0 << 2007314640;
                                  var12 = (param3 + -param6 << 593322160) / var14;
                                  if (0 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var12 = (param3 - param0 << 878968400) / var15;
                              var9 = param6 << -1082763728;
                              var11 = (param3 + -param6 << 770219280) / var14;
                              var10 = param0 << -2138433296;
                              break L7;
                            }
                            if (0 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var9 = param6 << 1222250288;
                        var10 = param0 << 667141296;
                        var12 = 0;
                        var11 = 0;
                        break L5;
                      }
                      var13 = 0;
                      if (param1 < 0) {
                        param1 = Math.min(-param1, -param1 + param7);
                        var10 = var10 + param1 * var12;
                        var9 = var9 + param1 * var11;
                        param1 = 0;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L9: {
                    L10: {
                      var10 = param6 << -1153547920;
                      var9 = param6 << -1153547920;
                      var15 = param7 - param1;
                      var11 = (param0 + -param6 << -1187923408) / var15;
                      var12 = (param3 + -param6 << -485399856) / var14;
                      if (var12 > var11) {
                        break L10;
                      } else {
                        var16 = var11;
                        var11 = var12;
                        var12 = var16;
                        var13 = 1;
                        if (0 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var13 = 0;
                    break L9;
                  }
                  L11: {
                    L12: {
                      if (0 > param1) {
                        L13: {
                          if (param7 < 0) {
                            break L13;
                          } else {
                            param1 = -param1;
                            var9 = var9 + param1 * var11;
                            var10 = var10 + param1 * var12;
                            param1 = 0;
                            if (0 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        param1 = -param1 + param7;
                        var9 = var9 + var11 * param1;
                        var10 = var10 + param1 * var12;
                        param1 = param7;
                        if (0 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    var16 = li.field_a[param1];
                    L14: while (true) {
                      if (param7 <= param1) {
                        break L11;
                      } else {
                        L15: {
                          var17 = var9 >> -1231621712;
                          if (li.field_i <= var17) {
                            break L15;
                          } else {
                            L16: {
                              var18 = (var10 >> -135199504) + -(var9 >> -1791326448);
                              if (var18 == 0) {
                                break L16;
                              } else {
                                L17: {
                                  if (li.field_i <= var17 + var18) {
                                    var18 = -1 + li.field_i + -var17;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (var17 >= 0) {
                                    break L18;
                                  } else {
                                    ud.a(var17 + var18, var16, param8, (byte) -85, param4);
                                    if (0 == 0) {
                                      break L15;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                ud.a(var18, var17 - -var16, param8, (byte) -85, param4);
                                if (0 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            if (0 > var17) {
                              break L15;
                            } else {
                              if (li.field_i > var17) {
                                ud.a(var18, var17 - -var16, param8, (byte) -85, param4);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        param1++;
                        if (param1 >= li.field_d) {
                          return;
                        } else {
                          var16 = var16 + tc.field_j;
                          var10 = var10 + var12;
                          var9 = var9 + var11;
                          if (0 == 0) {
                            continue L14;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  L19: {
                    var16 = param2 + -param7;
                    if (var16 == 0) {
                      break L19;
                    } else {
                      L20: {
                        L21: {
                          var17 = param3 << 1875113136;
                          if (var13 != 0) {
                            break L21;
                          } else {
                            var9 = param0 << 2062286608;
                            if (0 == 0) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        var10 = param0 << 1427790032;
                        break L20;
                      }
                      var11 = (-var9 + var17) / var16;
                      var12 = (var17 + -var10) / var16;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L19;
                      }
                    }
                  }
                  var12 = 0;
                  var11 = 0;
                  break L3;
                }
                L22: {
                  if (param1 < 0) {
                    param1 = -param1;
                    var10 = var10 + var12 * param1;
                    var9 = var9 + param1 * var11;
                    param1 = 0;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  var15 = li.field_a[param1];
                  if (param2 <= param1) {
                    break L23;
                  } else {
                    L24: {
                      var16 = var9 >> 2123057648;
                      if (li.field_i > var16) {
                        L25: {
                          var17 = -(var9 >> 675834672) + (var10 >> 1980934832);
                          if (var17 != 0) {
                            break L25;
                          } else {
                            if (var16 < 0) {
                              break L24;
                            } else {
                              if (var16 < li.field_i) {
                                ud.a(var17, var15 + var16, param8, (byte) -85, param4);
                                if (0 == 0) {
                                  break L24;
                                } else {
                                  break L25;
                                }
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                        L26: {
                          if (li.field_i <= var17 + var16) {
                            var17 = -1 + (-var16 + li.field_i);
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        L27: {
                          if (var16 < 0) {
                            break L27;
                          } else {
                            ud.a(var17, var15 + var16, param8, (byte) -85, param4);
                            if (0 == 0) {
                              break L24;
                            } else {
                              break L27;
                            }
                          }
                        }
                        ud.a(var17 + var16, var15, param8, (byte) -85, param4);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    param1++;
                    if (li.field_d > param1) {
                      var15 = var15 + tc.field_j;
                      var10 = var10 + var12;
                      var9 = var9 + var11;
                      break L23;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -119 % ((-76 - param0) / 34);
        field_f = null;
        field_e = null;
        field_g = null;
    }

    final static byte[] a(byte[] param0, int param1, da param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        var4 = param2.h(param1, 7);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param0 = new byte[var4];
            break L0;
          }
          L2: {
            if (param3 >= 96) {
              break L2;
            } else {
              qe.a((byte) -29);
              break L2;
            }
          }
          L3: {
            var5 = param2.h(3, 7);
            var6 = (byte)param2.h(8, 7);
            if (var5 <= 0) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param0[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param0[var7] = (byte)(var6 + param2.h(var5, 7));
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    final static void a(long param0, byte param1) {
        if (param0 <= 0L) {
            return;
        }
        if (param1 != 45) {
            field_e = null;
        }
        if ((param0 % 10L ^ -1L) == -1L) {
            uj.a(-1L + param0, -79);
            uj.a(1L, -62);
        } else {
            uj.a(param0, param1 ^ -110);
        }
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var4 = -1;
        for (var5 = param0; var5 < param1; var5++) {
            var4 = var4 >>> 5593256 ^ mc.field_d[255 & (var4 ^ param3[var5])];
        }
        if (param2 != 0) {
            field_f = null;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    abstract java.net.Socket b(int param0) throws IOException;

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "(Player 2)";
        field_b = 100;
    }
}
