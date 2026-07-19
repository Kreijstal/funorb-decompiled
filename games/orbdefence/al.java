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
        try {
            this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "al.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 < (param8 ^ -1)) {
                break L1;
              } else {
                if (param6 >= wi.field_a) {
                  break L1;
                } else {
                  L2: {
                    if (0 <= param5) {
                      break L2;
                    } else {
                      if ((param3 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (0 > param2) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (wi.field_c > param5) {
                      break L3;
                    } else {
                      if (param3 < wi.field_c) {
                        break L3;
                      } else {
                        if (param2 < wi.field_c) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var14 = -param6 + param8;
                      if (param1 == param6) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var10 = param5 << -998134896;
                            var9_int = param5 << -998134896;
                            var15 = param1 - param6;
                            var11 = (-param5 + param3 << 1268572496) / var15;
                            var12 = (-param5 + param2 << -1786450480) / var14;
                            if (var11 < var12) {
                              break L7;
                            } else {
                              var16 = var11;
                              var11 = var12;
                              var12 = var16;
                              var13 = 1;
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var13 = 0;
                          break L6;
                        }
                        L8: {
                          L9: {
                            L10: {
                              if ((param6 ^ -1) <= -1) {
                                break L10;
                              } else {
                                L11: {
                                  if (-1 >= (param1 ^ -1)) {
                                    break L11;
                                  } else {
                                    param6 = param1 - param6;
                                    var9_int = var9_int + var11 * param6;
                                    var10 = var10 + var12 * param6;
                                    param6 = param1;
                                    if (var19 == 0) {
                                      break L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                param6 = -param6;
                                var9_int = var9_int + var11 * param6;
                                var10 = var10 + param6 * var12;
                                param6 = 0;
                                break L10;
                              }
                            }
                            var16 = wi.field_i[param6];
                            L12: while (true) {
                              if (param1 <= param6) {
                                break L9;
                              } else {
                                var17 = var9_int >> 1728000272;
                                stackOut_25_0 = var17 ^ -1;
                                stackOut_25_1 = wi.field_c ^ -1;
                                stackIn_43_0 = stackOut_25_0;
                                stackIn_43_1 = stackOut_25_1;
                                stackIn_26_0 = stackOut_25_0;
                                stackIn_26_1 = stackOut_25_1;
                                if (var19 != 0) {
                                  break L8;
                                } else {
                                  L13: {
                                    if (stackIn_26_0 <= stackIn_26_1) {
                                      break L13;
                                    } else {
                                      L14: {
                                        var18 = -(var9_int >> 1062224304) + (var10 >> 338434288);
                                        if (var18 == 0) {
                                          break L14;
                                        } else {
                                          L15: {
                                            if (wi.field_c <= var18 + var17) {
                                              var18 = -1 + (-var17 + wi.field_c);
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            if (-1 >= (var17 ^ -1)) {
                                              break L16;
                                            } else {
                                              mb.a(var18 - -var17, var16, param0, param7, true);
                                              if (var19 == 0) {
                                                break L13;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          mb.a(var18, var17 - -var16, param0, param7, true);
                                          if (var19 == 0) {
                                            break L13;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      if ((var17 ^ -1) > -1) {
                                        break L13;
                                      } else {
                                        if (var17 >= wi.field_c) {
                                          break L13;
                                        } else {
                                          mb.a(var18, var17 - -var16, param0, param7, true);
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                  param6++;
                                  if (param6 < wi.field_a) {
                                    var9_int = var9_int + var11;
                                    var10 = var10 + var12;
                                    var16 = var16 + ul.field_f;
                                    continue L12;
                                  } else {
                                    decompiledRegionSelector0 = 3;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_42_0 = param8;
                          stackOut_42_1 = param1;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          break L8;
                        }
                        L17: {
                          L18: {
                            var16 = stackIn_43_0 - stackIn_43_1;
                            if (var16 == 0) {
                              break L18;
                            } else {
                              L19: {
                                L20: {
                                  if (var13 == 0) {
                                    break L20;
                                  } else {
                                    var10 = param3 << -593362704;
                                    if (var19 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                var9_int = param3 << 175692336;
                                break L19;
                              }
                              var17 = param2 << 118789872;
                              var12 = (var17 - var10) / var16;
                              var11 = (-var9_int + var17) / var16;
                              if (var19 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          var11 = 0;
                          var12 = 0;
                          break L17;
                        }
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L21: {
                      L22: {
                        if (param8 != param6) {
                          break L22;
                        } else {
                          var10 = param3 << -809660496;
                          var11 = 0;
                          var9_int = param5 << -821374320;
                          var12 = 0;
                          if (var19 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        var15 = -param1 + param8;
                        if (param3 > param5) {
                          break L23;
                        } else {
                          var9_int = param3 << 418938448;
                          var11 = (-param3 + param2 << -1262011536) / var15;
                          var10 = param5 << 198924016;
                          var12 = (param2 + -param5 << -1989216816) / var14;
                          if (var19 == 0) {
                            break L21;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var9_int = param5 << 1484080912;
                      var10 = param3 << -120558992;
                      var12 = (-param3 + param2 << 2113381232) / var15;
                      var11 = (-param5 + param2 << 537658512) / var14;
                      break L21;
                    }
                    var13 = 0;
                    if (0 <= param6) {
                      break L4;
                    } else {
                      param6 = Math.min(-param6, -param6 + param1);
                      var10 = var10 + var12 * param6;
                      var9_int = var9_int + var11 * param6;
                      param6 = 0;
                      break L4;
                    }
                  }
                  L24: {
                    if (param6 >= 0) {
                      break L24;
                    } else {
                      param6 = -param6;
                      var10 = var10 + param6 * var12;
                      var9_int = var9_int + var11 * param6;
                      param6 = 0;
                      break L24;
                    }
                  }
                  L25: {
                    var15 = wi.field_i[param6];
                    if (param4 == 30979) {
                      break L25;
                    } else {
                      field_d = (hj) null;
                      break L25;
                    }
                  }
                  L26: while (true) {
                    if (param6 >= param8) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var16 = var9_int >> 1880272880;
                      if (var19 != 0) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L27: {
                          if (wi.field_c <= var16) {
                            break L27;
                          } else {
                            L28: {
                              var17 = -(var9_int >> -2091310896) + (var10 >> -640935632);
                              if (var17 != 0) {
                                break L28;
                              } else {
                                if (-1 < (var16 ^ -1)) {
                                  break L27;
                                } else {
                                  if (var16 < wi.field_c) {
                                    mb.a(var17, var16 - -var15, param0, param7, true);
                                    if (var19 == 0) {
                                      break L27;
                                    } else {
                                      break L28;
                                    }
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                            L29: {
                              if (wi.field_c > var17 + var16) {
                                break L29;
                              } else {
                                var17 = wi.field_c + -var16 - 1;
                                break L29;
                              }
                            }
                            L30: {
                              if (-1 < (var16 ^ -1)) {
                                break L30;
                              } else {
                                mb.a(var17, var15 + var16, param0, param7, true);
                                if (var19 == 0) {
                                  break L27;
                                } else {
                                  break L30;
                                }
                              }
                            }
                            mb.a(var16 + var17, var15, param0, param7, true);
                            break L27;
                          }
                        }
                        param6++;
                        if (param6 >= wi.field_a) {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          var9_int = var9_int + var11;
                          var10 = var10 + var12;
                          var15 = var15 + ul.field_f;
                          continue L26;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var9 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) (var9);
            stackOut_80_1 = new StringBuilder().append("al.A(");
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param0 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L31;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L31;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = -70 % ((-53 - param0) / 56);
        field_c = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "al.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ki a(boolean param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            ak var8 = null;
            ki stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            ki stackOut_16_0 = null;
            try {
              L0: {
                L1: {
                  if (param1 == 5200) {
                    break L1;
                  } else {
                    field_d = (hj) null;
                    break L1;
                  }
                }
                L2: {
                  var6 = null;
                  var7 = null;
                  if (lh.field_b.field_u != null) {
                    vg.field_q = new dj(lh.field_b.field_u, 5200, 0);
                    lh.field_b.field_u = null;
                    var6 = new eh(255, vg.field_q, new dj(lh.field_b.field_g, 12000, 0), 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null != vg.field_q) {
                    L4: {
                      if (null == ok.field_a) {
                        ok.field_a = new dj[lh.field_b.field_p.length];
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (null != ok.field_a[param2]) {
                        break L5;
                      } else {
                        ok.field_a[param2] = new dj(lh.field_b.field_p[param2], 12000, 0);
                        lh.field_b.field_p[param2] = null;
                        break L5;
                      }
                    }
                    var7 = new eh(param2, vg.field_q, ok.field_a[param2], 2097152);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  var8 = ed.field_b.a(param5, param2, false, (eh) (var6), (eh) (var7));
                  if (param4) {
                    var8.d((byte) 111);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_16_0 = new ki(var8, param0, param3);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_17_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    al(java.awt.Component param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 0;
    }
}
