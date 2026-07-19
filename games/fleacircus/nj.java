/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nj {
    private int field_f;
    private ji[] field_e;
    static dd field_b;
    private int field_c;
    static String field_d;
    private int field_g;
    static od field_a;

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        int var1 = 29 / ((-60 - param0) / 36);
        field_a = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        var2 = this.field_e.length + -1;
        L0: while (true) {
          if (0 > var2) {
            if (param0 < -24) {
              return;
            } else {
              this.field_e = (ji[]) null;
              return;
            }
          } else {
            if (var3 == 0) {
              L1: {
                if (null != this.field_e[var2]) {
                  this.field_e[var2].b(true);
                  break L1;
                } else {
                  break L1;
                }
              }
              var2--;
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final static java.net.URL a(byte param0, int param1, String param2, java.net.URL param3, String param4) {
        try {
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            StringBuilder discarded$18 = null;
            StringBuilder discarded$19 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_44_0 = null;
            java.net.URL stackIn_46_0 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_43_0 = null;
            java.net.URL stackOut_45_0 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            RuntimeException stackOut_55_0 = null;
            StringBuilder stackOut_55_1 = null;
            String stackOut_55_2 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            var9 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                var5_ref = param3.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) > -1) {
                        break L2;
                      } else {
                        L3: {
                          if ((param1 ^ -1) <= -1) {
                            break L3;
                          } else {
                            var6 = var7_int;
                            if (var9 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if ((var7_int ^ -1) > -1) {
                        break L4;
                      } else {
                        var6 = var7_int;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L5;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) <= -1) {
                        L6: {
                          if (param2 != null) {
                            break L6;
                          } else {
                            var6 = var7_int;
                            if (var9 == 0) {
                              continue L1;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  L7: {
                    L8: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L8;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if ((var7_int ^ -1) <= -1) {
                      L9: {
                        if (param4 != null) {
                          break L9;
                        } else {
                          var6 = var7_int;
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L10: {
                    if (param0 == 53) {
                      break L10;
                    } else {
                      field_b = (dd) null;
                      break L10;
                    }
                  }
                  L11: {
                    var7 = new StringBuilder(var6);
                    discarded$10 = var7.append(var5_ref.substring(0, var6));
                    if (0 < param1) {
                      discarded$11 = var7.append("/l=");
                      discarded$12 = var7.append(Integer.toString(param1));
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (param2 == null) {
                      break L12;
                    } else {
                      if ((param2.length() ^ -1) < -1) {
                        discarded$13 = var7.append("/p=");
                        discarded$14 = var7.append(param2);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (param4 == null) {
                      break L13;
                    } else {
                      if (-1 <= (param4.length() ^ -1)) {
                        break L13;
                      } else {
                        discarded$15 = var7.append("/s=");
                        discarded$16 = var7.append(param4);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var5_ref.length() <= var6) {
                      discarded$17 = var7.append('/');
                      break L14;
                    } else {
                      discarded$18 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      if (var9 == 0) {
                        break L14;
                      } else {
                        discarded$19 = var7.append('/');
                        break L14;
                      }
                    }
                  }
                  try {
                    L15: {
                      stackOut_43_0 = new java.net.URL(param3, var7.toString());
                      stackIn_44_0 = stackOut_43_0;
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_45_0 = (java.net.URL) (param3);
                    stackIn_46_0 = stackOut_45_0;
                    return stackIn_46_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L16: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_47_0 = (RuntimeException) (var5);
                stackOut_47_1 = new StringBuilder().append("nj.D(").append(param0).append(',').append(param1).append(',');
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param2 == null) {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L16;
                } else {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L16;
                }
              }
              L17: {
                stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param3 == null) {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L17;
                } else {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L17;
                }
              }
              L18: {
                stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',');
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                if (param4 == null) {
                  stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
                  stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackOut_55_2 = "null";
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  stackIn_56_2 = stackOut_55_2;
                  break L18;
                } else {
                  stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
                  stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackOut_54_2 = "{...}";
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_56_2 = stackOut_54_2;
                  break L18;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
            }
            return stackIn_44_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var12 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (gb.field_l > param3) {
                param2 = param2 - (gb.field_l - param3);
                param3 = gb.field_l;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 + param3 <= gb.field_h) {
                break L2;
              } else {
                param2 = gb.field_h + -param3;
                break L2;
              }
            }
            L3: {
              if (param0 >= gb.field_b) {
                break L3;
              } else {
                param4 = param4 - (-param0 + gb.field_b);
                param0 = gb.field_b;
                break L3;
              }
            }
            L4: {
              if (gb.field_i >= param4 + param0) {
                break L4;
              } else {
                param4 = -param0 + gb.field_i;
                break L4;
              }
            }
            L5: {
              if (0 >= param2) {
                break L5;
              } else {
                if (0 < param4) {
                  L6: {
                    var6_int = param0 * gb.field_d + param3;
                    var7 = gb.field_d - param2;
                    if (param5 == 1067) {
                      break L6;
                    } else {
                      nj.a((byte) 101);
                      break L6;
                    }
                  }
                  param0 = -param4;
                  L7: while (true) {
                    if (0 <= param0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      if (var12 == 0) {
                        param3 = -param2;
                        L8: while (true) {
                          L9: {
                            if (0 <= param3) {
                              stackOut_30_0 = var6_int;
                              stackOut_30_1 = var7;
                              stackIn_31_0 = stackOut_30_0;
                              stackIn_31_1 = stackOut_30_1;
                              break L9;
                            } else {
                              var8 = gb.field_a[var6_int];
                              stackOut_22_0 = param1 ^ -1;
                              stackOut_22_1 = (65280 & var8) >> 1876065320 ^ -1;
                              stackIn_31_0 = stackOut_22_0;
                              stackIn_31_1 = stackOut_22_1;
                              stackIn_23_0 = stackOut_22_0;
                              stackIn_23_1 = stackOut_22_1;
                              if (var12 != 0) {
                                break L9;
                              } else {
                                L10: {
                                  if (stackIn_23_0 <= stackIn_23_1) {
                                    break L10;
                                  } else {
                                    if ((var8 >> 875236872 & 255) >= (16711680 & var8) >> -275225488) {
                                      L11: {
                                        var9 = -60 + (510 & var8 >> 236763183);
                                        if (-256 <= (var9 ^ -1)) {
                                          break L11;
                                        } else {
                                          var9 = 255;
                                          break L11;
                                        }
                                      }
                                      var10 = 65280 & var8;
                                      var10 = (var10 >> 1802518369) + -(var10 >> 937195909) & 65280;
                                      var11 = (255 & var8) >> 1748457475;
                                      gb.field_a[var6_int] = ne.a(ne.a(var9 << 1760663824, var10), var11);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var6_int++;
                                param3++;
                                continue L8;
                              }
                            }
                          }
                          var6_int = stackIn_31_0 + stackIn_31_1;
                          param0++;
                          continue L7;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var6), "nj.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    nj(int param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            this.field_c = param0 + db.a((byte) -115, na.field_c, param2);
            this.field_f = param1 - -db.a((byte) -115, na.field_c, param3);
            this.field_e = new ji[50 - -db.a((byte) -115, na.field_c, 5)];
            var6_int = this.field_e.length + -1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6_int < 0) {
                    break L3;
                  } else {
                    this.field_e[var6_int] = new ji(this.field_c, this.field_f, db.a((byte) -115, na.field_c, 1024), param4);
                    var6_int--;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_g = db.a((byte) -115, na.field_c, 3) + 2;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("nj.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 == -9340) {
          if (gf.field_d <= 32) {
            ia.a(true, 0);
            if (fleas.field_A) {
              L0: {
                var1 = gf.field_d % 32;
                if (0 == var1) {
                  var1 = 32;
                  break L0;
                } else {
                  break L0;
                }
              }
              ia.a(true, gf.field_d - var1);
              return;
            } else {
              return;
            }
          } else {
            L1: {
              var1 = gf.field_d % 32;
              if (0 == var1) {
                var1 = 32;
                break L1;
              } else {
                break L1;
              }
            }
            ia.a(true, gf.field_d - var1);
            return;
          }
        } else {
          nj.a(-16);
          if (gf.field_d > 32) {
            L2: {
              var1 = gf.field_d % 32;
              if (0 == var1) {
                var1 = 32;
                break L2;
              } else {
                break L2;
              }
            }
            ia.a(true, gf.field_d - var1);
            return;
          } else {
            L3: {
              ia.a(true, 0);
              if (!fleas.field_A) {
                break L3;
              } else {
                L4: {
                  var1 = gf.field_d % 32;
                  if (0 == var1) {
                    var1 = 32;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ia.a(true, gf.field_d - var1);
                break L3;
              }
            }
            return;
          }
        }
    }

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = 1;
        var3 = 122 % ((param0 - 3) / 55);
        var4 = -1 + this.field_e.length;
        L0: while (true) {
          L1: {
            if ((var4 ^ -1) > -1) {
              break L1;
            } else {
              L2: {
                if (null == this.field_e[var4]) {
                  break L2;
                } else {
                  this.field_e[var4].a(this.field_g, (byte) -128);
                  var2 = var2 != 0 & this.field_e[var4].a(true) ? 1 : 0;
                  break L2;
                }
              }
              var4--;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          return var2 != 0;
        }
    }

    static {
        field_b = new dd(540, 140);
        field_d = "Next level";
    }
}
