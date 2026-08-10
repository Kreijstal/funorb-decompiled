/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends vi implements ib {
    static int field_V;
    static e field_M;
    private ga field_S;
    private int field_T;
    static String field_U;

    final void a(ga param0, int param1) {
        if (param1 <= 21) {
            return;
        }
        try {
            this.field_S = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "oc.SA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void g(byte param0) {
        vh var1 = (vh) ((Object) le.field_a.a((byte) 38));
        if (param0 != -105) {
            return;
        }
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        ul.a(var1.field_o, var1.field_p, var1.field_f);
        ul.e(var1.field_m, var1.field_l, var1.field_t, var1.field_g);
        var1.field_o = null;
        ml.field_f.a(-128, var1);
    }

    final static int a(int param0, int param1, vg param2, gj param3) {
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.field_l == null) {
                  break L1;
                } else {
                  if (param2 == null) {
                    break L1;
                  } else {
                    if (param2.field_g != param3.field_o) {
                      break L1;
                    } else {
                      L2: {
                        var4_int = param2.field_o.length;
                        var5 = param3.field_l[param0].length / var4_int;
                        if (param1 == -1) {
                          break L2;
                        } else {
                          oc.a('o', -125);
                          break L2;
                        }
                      }
                      var6 = 0;
                      L3: while (true) {
                        if (var6 >= var5) {
                          stackIn_25_0 = -1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L4: {
                            if ((param3.field_p[param0][var6] ^ -1L) == (param2.field_h ^ -1L)) {
                              if (fc.a((byte) -16, param3.field_i[param0][var6])) {
                                var7 = 0;
                                L5: while (true) {
                                  if (var7 >= var4_int) {
                                    stackIn_22_0 = var6;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    if (param3.field_l[param0][var6 * var4_int - -var7] == param2.field_o[var7]) {
                                      var7++;
                                      continue L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var4);

            stackIn_28_1 = new StringBuilder().append("oc.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_22_0;
          } else {
            return stackIn_25_0;
          }
        }
    }

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 < -103) {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 > 255) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              if (param1 != 8364) {
                if (param1 == 8218) {
                  var2 = -126;
                  break L0;
                } else {
                  if (param1 != 402) {
                    if (8222 != param1) {
                      if (8230 == param1) {
                        var2 = -123;
                        break L0;
                      } else {
                        if (param1 != 8224) {
                          if (param1 == 8225) {
                            var2 = -121;
                            break L0;
                          } else {
                            if (710 != param1) {
                              if (param1 != 8240) {
                                if (param1 == 352) {
                                  var2 = -118;
                                  break L0;
                                } else {
                                  if (param1 != 8249) {
                                    if (338 == param1) {
                                      var2 = -116;
                                      break L0;
                                    } else {
                                      if (param1 == 381) {
                                        var2 = -114;
                                        break L0;
                                      } else {
                                        if (param1 == 8216) {
                                          var2 = -111;
                                          break L0;
                                        } else {
                                          if (8217 != param1) {
                                            if (8220 != param1) {
                                              if (param1 == 8221) {
                                                var2 = -108;
                                                break L0;
                                              } else {
                                                if (param1 == 8226) {
                                                  var2 = -107;
                                                  break L0;
                                                } else {
                                                  if (param1 != 8211) {
                                                    if (param1 == 8212) {
                                                      var2 = -105;
                                                      break L0;
                                                    } else {
                                                      if (732 != param1) {
                                                        if (param1 != 8482) {
                                                          if (param1 == 353) {
                                                            var2 = -102;
                                                            break L0;
                                                          } else {
                                                            if (8250 == param1) {
                                                              var2 = -101;
                                                              break L0;
                                                            } else {
                                                              if (param1 != 339) {
                                                                if (param1 != 382) {
                                                                  if (param1 != 376) {
                                                                    var2 = 63;
                                                                    break L0;
                                                                  } else {
                                                                    var2 = -97;
                                                                    break L0;
                                                                  }
                                                                } else {
                                                                  var2 = -98;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                var2 = -100;
                                                                break L0;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -103;
                                                          break L0;
                                                        }
                                                      } else {
                                                        var2 = -104;
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                    break L0;
                                                  }
                                                }
                                              }
                                            } else {
                                              var2 = -109;
                                              break L0;
                                            }
                                          } else {
                                            var2 = -110;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                    break L0;
                                  }
                                }
                              } else {
                                var2 = -119;
                                break L0;
                              }
                            } else {
                              var2 = -120;
                              break L0;
                            }
                          }
                        } else {
                          var2 = -122;
                          break L0;
                        }
                      }
                    } else {
                      var2 = -124;
                      break L0;
                    }
                  } else {
                    var2 = -125;
                    break L0;
                  }
                }
              } else {
                var2 = -128;
                break L0;
              }
            }
            var2 = (byte)param1;
            break L0;
          }
          return (byte) var2;
        } else {
          return (byte) 79;
        }
    }

    public final ga a(byte param0) {
        int var2 = -126 % ((-54 - param0) / 41);
        return this.field_S;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (160 > param0) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 == param1) {
                break L3;
              } else {
                var6 = fe.field_a;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param0) {
                      var3++;
                      continue L4;
                    } else {
                      stackIn_14_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_17_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "oc.KA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final void c(byte param0) {
        if (param0 > -120) {
            oc.a(93, '￭');
        }
        super.c((byte) -127);
        if (!(this.field_S == null)) {
            this.field_S.b(-20959);
        }
    }

    final String g(int param0) {
        if (param0 != -8235) {
            this.g(83);
        }
        if (!this.field_t) {
            return null;
        }
        if (null == this.field_i) {
            return null;
        }
        dm.a(1, this.field_m - this.field_T + ua.field_a, vl.field_d);
        return this.field_i;
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_T = ua.field_a - (this.field_s + param2);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "oc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    oc(String param0, ag param1, int param2) {
        super(param0, param1, param2);
    }

    public static void q(int param0) {
        if (param0 <= 85) {
            gj var2 = (gj) null;
            oc.a(-84, -74, (vg) null, (gj) null);
        }
        field_U = null;
        field_M = null;
    }

    final static byte[] a(boolean param0, CharSequence param1) {
        byte[] stackIn_3_0 = null;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            var4 = 0;
            if (param0) {
              L1: while (true) {
                if (var2_int <= var4) {
                  stackIn_69_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var5 = param1.charAt(var4);
                        if (0 >= var5) {
                          break L4;
                        } else {
                          if (128 > var5) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var5 < 160) {
                          break L5;
                        } else {
                          if (var5 > 255) {
                            break L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (var5 != 8364) {
                        if (var5 != 8218) {
                          if (var5 != 402) {
                            if (var5 == 8222) {
                              var3[var4] = (byte)-124;
                              break L2;
                            } else {
                              if (var5 != 8230) {
                                if (var5 != 8224) {
                                  if (8225 != var5) {
                                    if (var5 != 710) {
                                      if (var5 != 8240) {
                                        if (var5 != 352) {
                                          if (var5 != 8249) {
                                            if (var5 != 338) {
                                              if (381 == var5) {
                                                var3[var4] = (byte)-114;
                                                break L2;
                                              } else {
                                                if (var5 != 8216) {
                                                  if (var5 != 8217) {
                                                    if (var5 != 8220) {
                                                      if (var5 != 8221) {
                                                        if (var5 != 8226) {
                                                          if (var5 != 8211) {
                                                            if (var5 != 8212) {
                                                              if (var5 != 732) {
                                                                if (var5 == 8482) {
                                                                  var3[var4] = (byte)-103;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 != 353) {
                                                                    if (var5 != 8250) {
                                                                      if (var5 != 339) {
                                                                        if (var5 == 382) {
                                                                          var3[var4] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var5 == 376) {
                                                                            var3[var4] = (byte)-97;
                                                                            break L2;
                                                                          } else {
                                                                            var3[var4] = (byte)63;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte)-100;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-101;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-104;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-105;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-106;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-107;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-108;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-109;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-110;
                                                    break L2;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-111;
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte)-116;
                                              break L2;
                                            }
                                          } else {
                                            var3[var4] = (byte)-117;
                                            break L2;
                                          }
                                        } else {
                                          var3[var4] = (byte)-118;
                                          break L2;
                                        }
                                      } else {
                                        var3[var4] = (byte)-119;
                                        break L2;
                                      }
                                    } else {
                                      var3[var4] = (byte)-120;
                                      break L2;
                                    }
                                  } else {
                                    var3[var4] = (byte)-121;
                                    break L2;
                                  }
                                } else {
                                  var3[var4] = (byte)-122;
                                  break L2;
                                }
                              } else {
                                var3[var4] = (byte)-123;
                                break L2;
                              }
                            }
                          } else {
                            var3[var4] = (byte)-125;
                            break L2;
                          }
                        } else {
                          var3[var4] = (byte)-126;
                          break L2;
                        }
                      } else {
                        var3[var4] = (byte)-128;
                        break L2;
                      }
                    }
                    var3[var4] = (byte)var5;
                    break L2;
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var2);

            stackIn_72_1 = new StringBuilder().append("oc.MA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L6;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_69_0;
        }
    }

    static {
        field_M = new e();
        field_U = "(Including <%0>)";
    }
}
