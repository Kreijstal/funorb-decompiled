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
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
                    var14 = -param6 + param8;
                    if (param1 == param6) {
                      L5: {
                        if (param8 != param6) {
                          var15 = -param1 + param8;
                          if (param3 > param5) {
                            var9_int = param5 << 1484080912;
                            var10 = param3 << -120558992;
                            var12 = (-param3 + param2 << 2113381232) / var15;
                            var11 = (-param5 + param2 << 537658512) / var14;
                            break L5;
                          } else {
                            var9_int = param3 << 418938448;
                            var11 = (-param3 + param2 << -1262011536) / var15;
                            var10 = param5 << 198924016;
                            var12 = (param2 + -param5 << -1989216816) / var14;
                            break L5;
                          }
                        } else {
                          var10 = param3 << -809660496;
                          var11 = 0;
                          var9_int = param5 << -821374320;
                          var12 = 0;
                          break L5;
                        }
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
                    } else {
                      L6: {
                        var10 = param5 << -998134896;
                        var9_int = param5 << -998134896;
                        var15 = param1 - param6;
                        var11 = (-param5 + param3 << 1268572496) / var15;
                        var12 = (-param5 + param2 << -1786450480) / var14;
                        if (var11 < var12) {
                          var13 = 0;
                          break L6;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if ((param6 ^ -1) <= -1) {
                            break L8;
                          } else {
                            if (-1 >= (param1 ^ -1)) {
                              param6 = -param6;
                              var9_int = var9_int + var11 * param6;
                              var10 = var10 + param6 * var12;
                              param6 = 0;
                              break L8;
                            } else {
                              param6 = param1 - param6;
                              var9_int = var9_int + var11 * param6;
                              var10 = var10 + var12 * param6;
                              param6 = param1;
                              break L7;
                            }
                          }
                        }
                        var16 = wi.field_i[param6];
                        L9: while (true) {
                          if (param1 <= param6) {
                            break L7;
                          } else {
                            L10: {
                              var17 = var9_int >> 1728000272;
                              if ((var17 ^ -1) <= (wi.field_c ^ -1)) {
                                break L10;
                              } else {
                                var18 = -(var9_int >> 1062224304) + (var10 >> 338434288);
                                if (var18 == 0) {
                                  if ((var17 ^ -1) > -1) {
                                    break L10;
                                  } else {
                                    if (var17 >= wi.field_c) {
                                      break L10;
                                    } else {
                                      mb.a(var18, var17 - -var16, param0, param7, true);
                                      break L10;
                                    }
                                  }
                                } else {
                                  L11: {
                                    if (wi.field_c <= var18 + var17) {
                                      var18 = -1 + (-var17 + wi.field_c);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  if (-1 >= (var17 ^ -1)) {
                                    mb.a(var18, var17 - -var16, param0, param7, true);
                                    break L10;
                                  } else {
                                    mb.a(var18 - -var17, var16, param0, param7, true);
                                    break L10;
                                  }
                                }
                              }
                            }
                            param6++;
                            if (param6 < wi.field_a) {
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              var16 = var16 + ul.field_f;
                              continue L9;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var16 = param8 - param1;
                      if (var16 == 0) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L12: {
                          if (var13 == 0) {
                            var9_int = param3 << 175692336;
                            break L12;
                          } else {
                            var10 = param3 << -593362704;
                            break L12;
                          }
                        }
                        var17 = param2 << 118789872;
                        var12 = (var17 - var10) / var16;
                        var11 = (-var9_int + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  L13: {
                    if (param6 >= 0) {
                      break L13;
                    } else {
                      param6 = -param6;
                      var10 = var10 + param6 * var12;
                      var9_int = var9_int + var11 * param6;
                      param6 = 0;
                      break L13;
                    }
                  }
                  L14: {
                    var15 = wi.field_i[param6];
                    if (param4 == 30979) {
                      break L14;
                    } else {
                      field_d = (hj) null;
                      break L14;
                    }
                  }
                  L15: while (true) {
                    if (param6 >= param8) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 1880272880;
                        if (wi.field_c <= var16) {
                          break L16;
                        } else {
                          var17 = -(var9_int >> -2091310896) + (var10 >> -640935632);
                          if (var17 != 0) {
                            L17: {
                              if (wi.field_c > var17 + var16) {
                                break L17;
                              } else {
                                var17 = wi.field_c + -var16 - 1;
                                break L17;
                              }
                            }
                            if (-1 < (var16 ^ -1)) {
                              mb.a(var16 + var17, var15, param0, param7, true);
                              break L16;
                            } else {
                              mb.a(var17, var15 + var16, param0, param7, true);
                              break L16;
                            }
                          } else {
                            if (-1 < (var16 ^ -1)) {
                              break L16;
                            } else {
                              if (var16 < wi.field_c) {
                                mb.a(var17, var16 - -var15, param0, param7, true);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      param6++;
                      if (param6 >= wi.field_a) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var9_int = var9_int + var11;
                        var10 = var10 + var12;
                        var15 = var15 + ul.field_f;
                        continue L15;
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
          L18: {
            var9 = decompiledCaughtException;
            stackIn_75_0 = (RuntimeException) (var9);

            stackIn_75_1 = new StringBuilder().append("al.A(");

            if (param0 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L18;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L18;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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
                  return;
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
                stackIn_17_0 = new ki(var8, param0, param3);
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
