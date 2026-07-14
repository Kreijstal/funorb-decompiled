/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class al extends java.awt.Canvas {
    static hj field_d;
    static dd field_c;
    static int field_b;
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        ((al) this).field_a.paint(param0);
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        var19 = OrbDefence.field_D ? 1 : 0;
        if (param8 >= 0) {
          if (param6 >= wi.field_a) {
            return;
          } else {
            L0: {
              if (0 <= param5) {
                break L0;
              } else {
                if (param3 >= 0) {
                  break L0;
                } else {
                  if (0 > param2) {
                    return;
                  } else {
                    break L0;
                  }
                }
              }
            }
            L1: {
              if (wi.field_c > param5) {
                break L1;
              } else {
                if (param3 < wi.field_c) {
                  break L1;
                } else {
                  if (param2 < wi.field_c) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            L2: {
              L3: {
                var14 = -param6 + param8;
                if (param1 == param6) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var10 = param5 << -998134896;
                      var9 = param5 << -998134896;
                      var15 = param1 - param6;
                      var11 = (-param5 + param3 << 1268572496) / var15;
                      var12 = (-param5 + param2 << -1786450480) / var14;
                      if (var11 < var12) {
                        break L5;
                      } else {
                        var16 = var11;
                        var11 = var12;
                        var12 = var16;
                        var13 = 1;
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var13 = 0;
                    break L4;
                  }
                  L6: {
                    L7: {
                      if (param6 >= 0) {
                        var16 = wi.field_i[param6];
                        L8: while (true) {
                          if (param1 <= param6) {
                            break L6;
                          } else {
                            L9: {
                              var17 = var9 >> 1728000272;
                              if ((var17 ^ -1) <= (wi.field_c ^ -1)) {
                                break L9;
                              } else {
                                L10: {
                                  var18 = -(var9 >> 1062224304) + (var10 >> 338434288);
                                  if (var18 == 0) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (wi.field_c <= var18 + var17) {
                                        var18 = -1 + (-var17 + wi.field_c);
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      if (var17 >= 0) {
                                        break L12;
                                      } else {
                                        mb.a(var18 - -var17, var16, param0, param7, true);
                                        if (0 == 0) {
                                          break L9;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    mb.a(var18, var17 - -var16, param0, param7, true);
                                    if (0 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (var17 < 0) {
                                  break L9;
                                } else {
                                  if (var17 >= wi.field_c) {
                                    break L9;
                                  } else {
                                    mb.a(var18, var17 - -var16, param0, param7, true);
                                    break L9;
                                  }
                                }
                              }
                            }
                            param6++;
                            if (param6 < wi.field_a) {
                              var9 = var9 + var11;
                              var10 = var10 + var12;
                              var16 = var16 + ul.field_f;
                              if (0 == 0) {
                                continue L8;
                              } else {
                                break L7;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        L13: {
                          if (param1 >= 0) {
                            break L13;
                          } else {
                            param6 = param1 - param6;
                            var9 = var9 + var11 * param6;
                            var10 = var10 + var12 * param6;
                            param6 = param1;
                            if (0 == 0) {
                              break L6;
                            } else {
                              break L13;
                            }
                          }
                        }
                        param6 = -param6;
                        var9 = var9 + var11 * param6;
                        var10 = var10 + param6 * var12;
                        param6 = 0;
                        break L7;
                      }
                    }
                    var16 = wi.field_i[param6];
                    L14: while (true) {
                      if (param1 <= param6) {
                        break L6;
                      } else {
                        L15: {
                          var17 = var9 >> 1728000272;
                          if ((var17 ^ -1) <= (wi.field_c ^ -1)) {
                            break L15;
                          } else {
                            L16: {
                              var18 = -(var9 >> 1062224304) + (var10 >> 338434288);
                              if (var18 == 0) {
                                break L16;
                              } else {
                                L17: {
                                  if (wi.field_c <= var18 + var17) {
                                    var18 = -1 + (-var17 + wi.field_c);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (var17 >= 0) {
                                    break L18;
                                  } else {
                                    mb.a(var18 - -var17, var16, param0, param7, true);
                                    if (0 == 0) {
                                      break L15;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                mb.a(var18, var17 - -var16, param0, param7, true);
                                if (0 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            if (var17 < 0) {
                              break L15;
                            } else {
                              if (var17 >= wi.field_c) {
                                break L15;
                              } else {
                                mb.a(var18, var17 - -var16, param0, param7, true);
                                break L15;
                              }
                            }
                          }
                        }
                        param6++;
                        if (param6 < wi.field_a) {
                          var9 = var9 + var11;
                          var10 = var10 + var12;
                          var16 = var16 + ul.field_f;
                          if (0 == 0) {
                            continue L14;
                          } else {
                            break L6;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L19: {
                    L20: {
                      var16 = param8 - param1;
                      if (var16 == 0) {
                        break L20;
                      } else {
                        L21: {
                          L22: {
                            if (var13 == 0) {
                              break L22;
                            } else {
                              var10 = param3 << -593362704;
                              if (0 == 0) {
                                break L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          var9 = param3 << 175692336;
                          break L21;
                        }
                        var17 = param2 << 118789872;
                        var12 = (var17 - var10) / var16;
                        var11 = (-var9 + var17) / var16;
                        if (0 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var11 = 0;
                    var12 = 0;
                    break L19;
                  }
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L23: {
                L24: {
                  if (param8 != param6) {
                    break L24;
                  } else {
                    var10 = param3 << -809660496;
                    var11 = 0;
                    var9 = param5 << -821374320;
                    var12 = 0;
                    if (0 == 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                L25: {
                  var15 = -param1 + param8;
                  if (param3 > param5) {
                    break L25;
                  } else {
                    var9 = param3 << 418938448;
                    var11 = (-param3 + param2 << -1262011536) / var15;
                    var10 = param5 << 198924016;
                    var12 = (param2 + -param5 << -1989216816) / var14;
                    if (0 == 0) {
                      break L23;
                    } else {
                      break L25;
                    }
                  }
                }
                var9 = param5 << 1484080912;
                var10 = param3 << -120558992;
                var12 = (-param3 + param2 << 2113381232) / var15;
                var11 = (-param5 + param2 << 537658512) / var14;
                break L23;
              }
              var13 = 0;
              if (0 <= param6) {
                break L2;
              } else {
                param6 = Math.min(-param6, -param6 + param1);
                var10 = var10 + var12 * param6;
                var9 = var9 + var11 * param6;
                param6 = 0;
                break L2;
              }
            }
            L26: {
              if (param6 >= 0) {
                break L26;
              } else {
                param6 = -param6;
                var10 = var10 + param6 * var12;
                var9 = var9 + var11 * param6;
                param6 = 0;
                break L26;
              }
            }
            L27: {
              var15 = wi.field_i[param6];
              if (param4 == 30979) {
                break L27;
              } else {
                field_d = null;
                break L27;
              }
            }
            L28: while (true) {
              if (param6 < param8) {
                L29: {
                  var16 = var9 >> 1880272880;
                  if (wi.field_c <= var16) {
                    break L29;
                  } else {
                    L30: {
                      var17 = -(var9 >> -2091310896) + (var10 >> -640935632);
                      if (var17 != 0) {
                        break L30;
                      } else {
                        if (var16 < 0) {
                          break L29;
                        } else {
                          if (var16 < wi.field_c) {
                            mb.a(var17, var16 - -var15, param0, param7, true);
                            if (0 == 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                    L31: {
                      if (wi.field_c > var17 + var16) {
                        break L31;
                      } else {
                        var17 = wi.field_c + -var16 - 1;
                        break L31;
                      }
                    }
                    L32: {
                      if (var16 < 0) {
                        break L32;
                      } else {
                        mb.a(var17, var15 + var16, param0, param7, true);
                        if (0 == 0) {
                          break L29;
                        } else {
                          break L32;
                        }
                      }
                    }
                    mb.a(var16 + var17, var15, param0, param7, true);
                    break L29;
                  }
                }
                param6++;
                if (param6 >= wi.field_a) {
                  return;
                } else {
                  var9 = var9 + var11;
                  var10 = var10 + var12;
                  var15 = var15 + ul.field_f;
                  if (0 == 0) {
                    continue L28;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = -70 % ((-53 - param0) / 56);
        field_c = null;
    }

    public final void update(java.awt.Graphics param0) {
        ((al) this).field_a.update(param0);
    }

    final static ki a(boolean param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        try {
            eh var6 = null;
            IOException var6_ref = null;
            eh var7 = null;
            ak var8 = null;
            ki stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            ki stackOut_16_0 = null;
            try {
              L0: {
                if (param1 == 5200) {
                  break L0;
                } else {
                  field_d = null;
                  break L0;
                }
              }
              L1: {
                var6 = null;
                var7 = null;
                if (lh.field_b.field_u != null) {
                  vg.field_q = new dj(lh.field_b.field_u, 5200, 0);
                  lh.field_b.field_u = null;
                  var6 = new eh(255, vg.field_q, new dj(lh.field_b.field_g, 12000, 0), 2097152);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null != vg.field_q) {
                  L3: {
                    if (null == ok.field_a) {
                      ok.field_a = new dj[lh.field_b.field_p.length];
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (null != ok.field_a[param2]) {
                      break L4;
                    } else {
                      ok.field_a[param2] = new dj(lh.field_b.field_p[param2], 12000, 0);
                      lh.field_b.field_p[param2] = null;
                      break L4;
                    }
                  }
                  var7 = new eh(param2, vg.field_q, ok.field_a[param2], 2097152);
                  break L2;
                } else {
                  break L2;
                }
              }
              L5: {
                var8 = ed.field_b.a(param5, param2, false, var6, var7);
                if (param4) {
                  var8.d((byte) 111);
                  break L5;
                } else {
                  break L5;
                }
              }
              stackOut_16_0 = new ki((jl) (Object) var8, param0, param3);
              stackIn_17_0 = stackOut_16_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_17_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    al(java.awt.Component param0) {
        ((al) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
