/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    private byte[] field_d;
    int field_j;
    int field_e;
    private byte[][] field_h;
    static int[] field_b;
    int field_a;
    static boolean field_f;
    static sn[] field_c;
    int field_i;
    static gh field_g;

    final int a(byte param0, int param1) {
        String discarded$2 = null;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 106) {
                break L1;
              } else {
                discarded$2 = this.a((pa[]) null, -22, 118, (String) null);
                break L1;
              }
            }
            stackOut_3_0 = this.field_d[param1] & 255;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "vs.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static int b(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -76) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            stackOut_3_0 = -ac.field_c + je.field_a;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vs.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_c = null;
              field_g = null;
              if (param0 > 108) {
                break L1;
              } else {
                vs.a(77);
                break L1;
              }
            }
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vs.E(" + param0 + ')');
        }
    }

    private final int a(String param0, byte param1, pa[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        Exception var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (null != param0) {
              L1: {
                var4_int = -1;
                var5 = -1;
                var6 = 0;
                var7 = param0.length();
                if (param1 == -113) {
                  break L1;
                } else {
                  this.field_j = -25;
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if ((var8 ^ -1) <= (var7 ^ -1)) {
                      break L4;
                    } else {
                      var9 = param0.charAt(var8);
                      stackOut_9_0 = -61;
                      stackIn_73_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var12 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_10_0 != (var9 ^ -1)) {
                              break L6;
                            } else {
                              var4_int = var8;
                              if (var12 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if ((var9 ^ -1) != -63) {
                              break L7;
                            } else {
                              if (0 != (var4_int ^ -1)) {
                                L8: {
                                  var10 = param0.substring(var4_int - -1, var8);
                                  var4_int = -1;
                                  if (var10.equals("lt")) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (var10.equals("gt")) {
                                        break L9;
                                      } else {
                                        L10: {
                                          if (var10.equals("nbsp")) {
                                            break L10;
                                          } else {
                                            L11: {
                                              if (var10.equals("shy")) {
                                                break L11;
                                              } else {
                                                L12: {
                                                  if (!var10.equals("times")) {
                                                    break L12;
                                                  } else {
                                                    var9 = 215;
                                                    if (var12 == 0) {
                                                      break L7;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                                L13: {
                                                  if (!var10.equals("euro")) {
                                                    break L13;
                                                  } else {
                                                    var9 = 8364;
                                                    if (var12 == 0) {
                                                      break L7;
                                                    } else {
                                                      break L13;
                                                    }
                                                  }
                                                }
                                                L14: {
                                                  if (var10.equals("copy")) {
                                                    break L14;
                                                  } else {
                                                    L15: {
                                                      if (var10.equals("reg")) {
                                                        break L15;
                                                      } else {
                                                        if (!var10.startsWith("img=")) {
                                                          break L5;
                                                        } else {
                                                          L16: {
                                                            if (param2 != null) {
                                                              break L16;
                                                            } else {
                                                              if (var12 == 0) {
                                                                break L5;
                                                              } else {
                                                                break L16;
                                                              }
                                                            }
                                                          }
                                                          try {
                                                            L17: {
                                                              var11_int = td.a((CharSequence) ((Object) var10.substring(4)), (byte) 38);
                                                              var5 = -1;
                                                              var6 = var6 + param2[var11_int].d();
                                                              decompiledRegionSelector0 = 0;
                                                              break L17;
                                                            }
                                                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                                                            decompiledCaughtException = decompiledCaughtParameter0;
                                                            L18: {
                                                              var11 = (Exception) (Object) decompiledCaughtException;
                                                              if (var12 == 0) {
                                                                decompiledRegionSelector0 = 0;
                                                                break L18;
                                                              } else {
                                                                decompiledRegionSelector0 = 1;
                                                                break L18;
                                                              }
                                                            }
                                                          }
                                                          if (decompiledRegionSelector0 == 0) {
                                                            break L5;
                                                          } else {
                                                            break L15;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var9 = 174;
                                                    if (var12 == 0) {
                                                      break L7;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                var9 = 169;
                                                if (var12 == 0) {
                                                  break L7;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            var9 = 173;
                                            if (var12 == 0) {
                                              break L7;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        var9 = 160;
                                        if (var12 == 0) {
                                          break L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var9 = 62;
                                    if (var12 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var9 = 60;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var4_int != -1) {
                            break L5;
                          } else {
                            L19: {
                              var6 = var6 + (this.field_d[255 & ae.a((char) var9, param1 ^ 1)] & 255);
                              if (this.field_h == null) {
                                break L19;
                              } else {
                                if (var5 == -1) {
                                  break L19;
                                } else {
                                  var6 = var6 + this.field_h[var5][var9];
                                  break L19;
                                }
                              }
                            }
                            var5 = var9;
                            break L5;
                          }
                        }
                        var8++;
                        if (var12 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_72_0 = var6;
                  stackIn_73_0 = stackOut_72_0;
                  break L3;
                }
                decompiledRegionSelector1 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L20: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var4);
            stackOut_74_1 = new StringBuilder().append("vs.C(");
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L20;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L20;
            }
          }
          L21: {
            stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',');
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L21;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L21;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_73_0;
        }
    }

    final String a(pa[] param0, int param1, int param2, String param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var12_ref_String = null;
        Exception var13 = null;
        int var13_int = 0;
        int var14 = 0;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_55_0 = null;
        String stackIn_75_0 = null;
        String stackIn_79_0 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_8_0 = null;
        String stackOut_54_0 = null;
        String stackOut_74_0 = null;
        String stackOut_78_0 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        var14 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param3, (byte) -113, param0) <= param2) {
              stackOut_4_0 = (String) (param3);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              param2 = param2 - this.a("...", (byte) -113, (pa[]) null);
              var5_int = -1;
              var6 = -1;
              var7 = 0;
              var8 = param3.length();
              var9 = "";
              var10 = param1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var8 <= var10) {
                      break L3;
                    } else {
                      stackOut_8_0 = (String) (param3);
                      stackIn_79_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var14 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            var11 = ((String) (Object) stackIn_9_0).charAt(var10);
                            if (var11 != 60) {
                              break L5;
                            } else {
                              var5_int = var10;
                              if (var14 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if ((var11 ^ -1) != -63) {
                              break L6;
                            } else {
                              if ((var5_int ^ -1) != 0) {
                                L7: {
                                  var12_ref_String = param3.substring(var5_int - -1, var10);
                                  var5_int = -1;
                                  if (var12_ref_String.equals("lt")) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (!var12_ref_String.equals("gt")) {
                                        break L8;
                                      } else {
                                        var11 = 62;
                                        if (var14 == 0) {
                                          break L6;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!var12_ref_String.equals("nbsp")) {
                                        break L9;
                                      } else {
                                        var11 = 160;
                                        if (var14 == 0) {
                                          break L6;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!var12_ref_String.equals("shy")) {
                                        break L10;
                                      } else {
                                        var11 = 173;
                                        if (var14 == 0) {
                                          break L6;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!var12_ref_String.equals("times")) {
                                        break L11;
                                      } else {
                                        var11 = 215;
                                        if (var14 == 0) {
                                          break L6;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (var12_ref_String.equals("euro")) {
                                        break L12;
                                      } else {
                                        L13: {
                                          if (!var12_ref_String.equals("copy")) {
                                            break L13;
                                          } else {
                                            var11 = 169;
                                            if (var14 == 0) {
                                              break L6;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (!var12_ref_String.equals("reg")) {
                                            break L14;
                                          } else {
                                            var11 = 174;
                                            if (var14 == 0) {
                                              break L6;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        if (!var12_ref_String.startsWith("img=")) {
                                          break L4;
                                        } else {
                                          if (null == param0) {
                                            break L4;
                                          } else {
                                            try {
                                              L15: {
                                                var13_int = td.a((CharSequence) ((Object) var12_ref_String.substring(4)), (byte) 38);
                                                var7 = var7 + param0[var13_int].d();
                                                var6 = -1;
                                                if (param2 >= var7) {
                                                  var9 = param3.substring(0, 1 + var10);
                                                  decompiledRegionSelector0 = 1;
                                                  break L15;
                                                } else {
                                                  stackOut_54_0 = var9 + "...";
                                                  stackIn_55_0 = stackOut_54_0;
                                                  decompiledRegionSelector0 = 0;
                                                  break L15;
                                                }
                                              }
                                            } catch (java.lang.Exception decompiledCaughtParameter0) {
                                              decompiledCaughtException = decompiledCaughtParameter0;
                                              L16: {
                                                var13 = (Exception) (Object) decompiledCaughtException;
                                                if (var14 == 0) {
                                                  decompiledRegionSelector0 = 1;
                                                  break L16;
                                                } else {
                                                  decompiledRegionSelector0 = 2;
                                                  break L16;
                                                }
                                              }
                                            }
                                            if (decompiledRegionSelector0 == 0) {
                                              decompiledRegionSelector1 = 3;
                                              break L0;
                                            } else {
                                              if (decompiledRegionSelector0 == 1) {
                                                break L4;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var11 = 8364;
                                    if (var14 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var11 = 60;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var5_int != -1) {
                            break L4;
                          } else {
                            L17: {
                              var7 = var7 + (255 & this.field_d[ae.a((char) var11, -128) & 255]);
                              if (null == this.field_h) {
                                break L17;
                              } else {
                                if (0 == (var6 ^ -1)) {
                                  break L17;
                                } else {
                                  var7 = var7 + this.field_h[var6][var11];
                                  break L17;
                                }
                              }
                            }
                            L18: {
                              var6 = var11;
                              var12 = var7;
                              if (this.field_h != null) {
                                var12 = var12 + this.field_h[var11][46];
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if (var12 > param2) {
                              stackOut_74_0 = var9 + "...";
                              stackIn_75_0 = stackOut_74_0;
                              decompiledRegionSelector1 = 2;
                              break L0;
                            } else {
                              var9 = param3.substring(0, var10 + 1);
                              break L4;
                            }
                          }
                        }
                        var10++;
                        if (var14 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_78_0 = (String) (param3);
                  stackIn_79_0 = stackOut_78_0;
                  break L2;
                }
                decompiledRegionSelector1 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L19: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) (var5);
            stackOut_80_1 = new StringBuilder().append("vs.D(");
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param0 == null) {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L19;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L19;
            }
          }
          L20: {
            stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
            stackOut_84_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_87_0 = stackOut_84_0;
            stackIn_87_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param3 == null) {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L20;
            } else {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "{...}";
              stackIn_88_0 = stackOut_85_0;
              stackIn_88_1 = stackOut_85_1;
              stackIn_88_2 = stackOut_85_2;
              break L20;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_79_0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_75_0;
            } else {
              return stackIn_55_0;
            }
          }
        }
    }

    final int a(int param0, char param1, int param2) {
        int discarded$2 = 0;
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        byte stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                discarded$2 = this.a((byte) -7, 58);
                break L1;
              }
            }
            if (null != this.field_h) {
              stackOut_6_0 = this.field_h[param2][param1];
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var4), "vs.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final int a(int param0, pa[] param1, int[] param2, String[] param3, String param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
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
        String var20 = null;
        Exception var21 = null;
        int var21_int = 0;
        int var22 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_128_0 = 0;
        int[] stackIn_128_1 = null;
        int stackIn_130_0 = 0;
        int[] stackIn_130_1 = null;
        int stackIn_131_0 = 0;
        int[] stackIn_131_1 = null;
        int stackIn_131_2 = 0;
        int stackIn_141_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        int stackIn_157_0 = 0;
        RuntimeException stackIn_159_0 = null;
        StringBuilder stackIn_159_1 = null;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        String stackIn_162_2 = null;
        RuntimeException stackIn_163_0 = null;
        StringBuilder stackIn_163_1 = null;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        RuntimeException stackIn_166_0 = null;
        StringBuilder stackIn_166_1 = null;
        String stackIn_166_2 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        String stackIn_170_2 = null;
        RuntimeException stackIn_171_0 = null;
        StringBuilder stackIn_171_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        String stackIn_174_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_127_0 = 0;
        int[] stackOut_127_1 = null;
        int stackOut_130_0 = 0;
        int[] stackOut_130_1 = null;
        int stackOut_130_2 = 0;
        int stackOut_128_0 = 0;
        int[] stackOut_128_1 = null;
        int stackOut_128_2 = 0;
        int stackOut_140_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_152_1 = 0;
        int stackOut_156_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_158_0 = null;
        StringBuilder stackOut_158_1 = null;
        RuntimeException stackOut_161_0 = null;
        StringBuilder stackOut_161_1 = null;
        String stackOut_161_2 = null;
        RuntimeException stackOut_159_0 = null;
        StringBuilder stackOut_159_1 = null;
        String stackOut_159_2 = null;
        RuntimeException stackOut_162_0 = null;
        StringBuilder stackOut_162_1 = null;
        RuntimeException stackOut_165_0 = null;
        StringBuilder stackOut_165_1 = null;
        String stackOut_165_2 = null;
        RuntimeException stackOut_163_0 = null;
        StringBuilder stackOut_163_1 = null;
        String stackOut_163_2 = null;
        RuntimeException stackOut_166_0 = null;
        StringBuilder stackOut_166_1 = null;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        String stackOut_169_2 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
        RuntimeException stackOut_170_0 = null;
        StringBuilder stackOut_170_1 = null;
        RuntimeException stackOut_173_0 = null;
        StringBuilder stackOut_173_1 = null;
        String stackOut_173_2 = null;
        RuntimeException stackOut_171_0 = null;
        StringBuilder stackOut_171_1 = null;
        String stackOut_171_2 = null;
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param4 != null) {
              var6_int = 0;
              var7 = 0;
              var8 = -1;
              var9 = 0;
              var10 = 0;
              var11 = -1;
              var13 = -22 / ((-48 - param0) / 48);
              var12 = -1;
              var14 = 0;
              var15 = param4.length();
              var16 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var15 ^ -1) >= (var16 ^ -1)) {
                      break L3;
                    } else {
                      var17 = ae.a(param4.charAt(var16), 102) & 255;
                      var18 = 0;
                      stackOut_6_0 = -61;
                      stackOut_6_1 = var17 ^ -1;
                      stackIn_153_0 = stackOut_6_0;
                      stackIn_153_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var22 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 == stackIn_7_1) {
                              var11 = var16;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            L7: {
                              if (0 == (var11 ^ -1)) {
                                break L7;
                              } else {
                                if (-63 != (var17 ^ -1)) {
                                  break L4;
                                } else {
                                  L8: {
                                    var19 = var11;
                                    var20 = param4.substring(1 + var11, var16);
                                    var11 = -1;
                                    if (!var20.equals("br")) {
                                      break L8;
                                    } else {
                                      param3[var14] = param4.substring(var7, var16 + 1);
                                      var14++;
                                      if ((param3.length ^ -1) < (var14 ^ -1)) {
                                        var6_int = 0;
                                        var8 = -1;
                                        var12 = -1;
                                        var7 = 1 + var16;
                                        if (var22 == 0) {
                                          break L4;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        stackOut_22_0 = 0;
                                        stackIn_23_0 = stackOut_22_0;
                                        decompiledRegionSelector1 = 1;
                                        break L0;
                                      }
                                    }
                                  }
                                  L9: {
                                    L10: {
                                      if (!var20.equals("lt")) {
                                        break L10;
                                      } else {
                                        L11: {
                                          var18 = var18 + this.a((byte) 111, 60);
                                          if (null == this.field_h) {
                                            break L11;
                                          } else {
                                            if (0 == (var12 ^ -1)) {
                                              break L11;
                                            } else {
                                              var18 = var18 + this.field_h[var12][60];
                                              break L11;
                                            }
                                          }
                                        }
                                        var12 = 60;
                                        if (var22 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (var20.equals("gt")) {
                                        break L12;
                                      } else {
                                        L13: {
                                          if (!var20.equals("nbsp")) {
                                            break L13;
                                          } else {
                                            L14: {
                                              var18 = var18 + this.a((byte) 107, 160);
                                              if (this.field_h == null) {
                                                break L14;
                                              } else {
                                                if ((var12 ^ -1) == 0) {
                                                  break L14;
                                                } else {
                                                  var18 = var18 + this.field_h[var12][160];
                                                  break L14;
                                                }
                                              }
                                            }
                                            var12 = 160;
                                            if (var22 == 0) {
                                              break L9;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        L15: {
                                          if (var20.equals("shy")) {
                                            break L15;
                                          } else {
                                            L16: {
                                              if (!var20.equals("times")) {
                                                break L16;
                                              } else {
                                                L17: {
                                                  var18 = var18 + this.a((byte) 108, 215);
                                                  if (null == this.field_h) {
                                                    break L17;
                                                  } else {
                                                    if (-1 != var12) {
                                                      var18 = var18 + this.field_h[var12][215];
                                                      break L17;
                                                    } else {
                                                      break L17;
                                                    }
                                                  }
                                                }
                                                var12 = 215;
                                                if (var22 == 0) {
                                                  break L9;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            L18: {
                                              if (var20.equals("euro")) {
                                                break L18;
                                              } else {
                                                L19: {
                                                  if (!var20.equals("copy")) {
                                                    break L19;
                                                  } else {
                                                    L20: {
                                                      var18 = var18 + this.a((byte) 108, 169);
                                                      if (this.field_h == null) {
                                                        break L20;
                                                      } else {
                                                        if (var12 == -1) {
                                                          break L20;
                                                        } else {
                                                          var18 = var18 + this.field_h[var12][169];
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    var12 = 169;
                                                    if (var22 == 0) {
                                                      break L9;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                                L21: {
                                                  if (var20.equals("reg")) {
                                                    break L21;
                                                  } else {
                                                    if (!var20.startsWith("img=")) {
                                                      break L9;
                                                    } else {
                                                      if (null == param1) {
                                                        break L9;
                                                      } else {
                                                        try {
                                                          L22: {
                                                            var21_int = td.a((CharSequence) ((Object) var20.substring(4)), (byte) 38);
                                                            var12 = -1;
                                                            var18 = var18 + param1[var21_int].d();
                                                            decompiledRegionSelector0 = 0;
                                                            break L22;
                                                          }
                                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                                          decompiledCaughtException = decompiledCaughtParameter0;
                                                          L23: {
                                                            var21 = (Exception) (Object) decompiledCaughtException;
                                                            if (var22 == 0) {
                                                              decompiledRegionSelector0 = 0;
                                                              break L23;
                                                            } else {
                                                              decompiledRegionSelector0 = 1;
                                                              break L23;
                                                            }
                                                          }
                                                        }
                                                        if (decompiledRegionSelector0 == 0) {
                                                          break L9;
                                                        } else {
                                                          break L21;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L24: {
                                                  var18 = var18 + this.a((byte) 126, 174);
                                                  if (this.field_h == null) {
                                                    break L24;
                                                  } else {
                                                    if (-1 != var12) {
                                                      var18 = var18 + this.field_h[var12][174];
                                                      break L24;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                var12 = 174;
                                                if (var22 == 0) {
                                                  break L9;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            L25: {
                                              var18 = var18 + this.a((byte) 111, 8364);
                                              if (this.field_h == null) {
                                                break L25;
                                              } else {
                                                if (-1 == var12) {
                                                  break L25;
                                                } else {
                                                  var18 = var18 + this.field_h[var12][8364];
                                                  break L25;
                                                }
                                              }
                                            }
                                            var12 = 8364;
                                            if (var22 == 0) {
                                              break L9;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        L26: {
                                          var18 = var18 + this.a((byte) 110, 173);
                                          if (this.field_h == null) {
                                            break L26;
                                          } else {
                                            if (var12 == -1) {
                                              break L26;
                                            } else {
                                              var18 = var18 + this.field_h[var12][173];
                                              break L26;
                                            }
                                          }
                                        }
                                        var12 = 173;
                                        if (var22 == 0) {
                                          break L9;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L27: {
                                      var18 = var18 + this.a((byte) 118, 62);
                                      if (null == this.field_h) {
                                        break L27;
                                      } else {
                                        if (0 != (var12 ^ -1)) {
                                          var18 = var18 + this.field_h[var12][62];
                                          break L27;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var12 = 62;
                                    break L9;
                                  }
                                  var17 = -1;
                                  if (var22 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L28: {
                              var19 = var16;
                              var18 = var18 + this.a((byte) 113, var17);
                              if (this.field_h == null) {
                                break L28;
                              } else {
                                if (0 != (var12 ^ -1)) {
                                  var18 = var18 + this.field_h[var12][var17];
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            var12 = var17;
                            break L6;
                          }
                          if (var18 <= 0) {
                            break L4;
                          } else {
                            var6_int = var6_int + var18;
                            if (param2 == null) {
                              break L4;
                            } else {
                              L29: {
                                if (-33 != (var17 ^ -1)) {
                                  break L29;
                                } else {
                                  var10 = 1;
                                  var8 = var16;
                                  var9 = var6_int;
                                  break L29;
                                }
                              }
                              L30: {
                                stackOut_127_0 = var6_int ^ -1;
                                stackOut_127_1 = (int[]) (param2);
                                stackIn_130_0 = stackOut_127_0;
                                stackIn_130_1 = stackOut_127_1;
                                stackIn_128_0 = stackOut_127_0;
                                stackIn_128_1 = stackOut_127_1;
                                if (var14 < param2.length) {
                                  stackOut_130_0 = stackIn_130_0;
                                  stackOut_130_1 = (int[]) ((Object) stackIn_130_1);
                                  stackOut_130_2 = var14;
                                  stackIn_131_0 = stackOut_130_0;
                                  stackIn_131_1 = stackOut_130_1;
                                  stackIn_131_2 = stackOut_130_2;
                                  break L30;
                                } else {
                                  stackOut_128_0 = stackIn_128_0;
                                  stackOut_128_1 = (int[]) ((Object) stackIn_128_1);
                                  stackOut_128_2 = param2.length - 1;
                                  stackIn_131_0 = stackOut_128_0;
                                  stackIn_131_1 = stackOut_128_1;
                                  stackIn_131_2 = stackOut_128_2;
                                  break L30;
                                }
                              }
                              L31: {
                                if (stackIn_131_0 >= (stackIn_131_1[stackIn_131_2] ^ -1)) {
                                  break L31;
                                } else {
                                  L32: {
                                    if (0 > var8) {
                                      break L32;
                                    } else {
                                      param3[var14] = param4.substring(var7, var8 - -1 + -var10);
                                      var14++;
                                      if (var14 >= param3.length) {
                                        stackOut_140_0 = 0;
                                        stackIn_141_0 = stackOut_140_0;
                                        decompiledRegionSelector1 = 2;
                                        break L0;
                                      } else {
                                        var7 = var8 + 1;
                                        var8 = -1;
                                        var12 = -1;
                                        var6_int = var6_int - var9;
                                        if (var22 == 0) {
                                          break L31;
                                        } else {
                                          break L32;
                                        }
                                      }
                                    }
                                  }
                                  param3[var14] = param4.substring(var7, var19);
                                  var14++;
                                  if ((param3.length ^ -1) < (var14 ^ -1)) {
                                    var7 = var19;
                                    var8 = -1;
                                    var12 = -1;
                                    var6_int = var18;
                                    break L31;
                                  } else {
                                    stackOut_146_0 = 0;
                                    stackIn_147_0 = stackOut_146_0;
                                    decompiledRegionSelector1 = 3;
                                    break L0;
                                  }
                                }
                              }
                              if (var17 != 45) {
                                break L4;
                              } else {
                                var8 = var16;
                                var10 = 0;
                                var9 = var6_int;
                                break L4;
                              }
                            }
                          }
                        }
                        var16++;
                        if (var22 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_152_0 = param4.length();
                  stackOut_152_1 = var7;
                  stackIn_153_0 = stackOut_152_0;
                  stackIn_153_1 = stackOut_152_1;
                  break L2;
                }
                L33: {
                  if (stackIn_153_0 <= stackIn_153_1) {
                    break L33;
                  } else {
                    param3[var14] = param4.substring(var7, param4.length());
                    var14++;
                    break L33;
                  }
                }
                stackOut_156_0 = var14;
                stackIn_157_0 = stackOut_156_0;
                decompiledRegionSelector1 = 4;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L34: {
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_158_0 = (RuntimeException) (var6);
            stackOut_158_1 = new StringBuilder().append("vs.A(").append(param0).append(',');
            stackIn_161_0 = stackOut_158_0;
            stackIn_161_1 = stackOut_158_1;
            stackIn_159_0 = stackOut_158_0;
            stackIn_159_1 = stackOut_158_1;
            if (param1 == null) {
              stackOut_161_0 = (RuntimeException) ((Object) stackIn_161_0);
              stackOut_161_1 = (StringBuilder) ((Object) stackIn_161_1);
              stackOut_161_2 = "null";
              stackIn_162_0 = stackOut_161_0;
              stackIn_162_1 = stackOut_161_1;
              stackIn_162_2 = stackOut_161_2;
              break L34;
            } else {
              stackOut_159_0 = (RuntimeException) ((Object) stackIn_159_0);
              stackOut_159_1 = (StringBuilder) ((Object) stackIn_159_1);
              stackOut_159_2 = "{...}";
              stackIn_162_0 = stackOut_159_0;
              stackIn_162_1 = stackOut_159_1;
              stackIn_162_2 = stackOut_159_2;
              break L34;
            }
          }
          L35: {
            stackOut_162_0 = (RuntimeException) ((Object) stackIn_162_0);
            stackOut_162_1 = ((StringBuilder) (Object) stackIn_162_1).append(stackIn_162_2).append(',');
            stackIn_165_0 = stackOut_162_0;
            stackIn_165_1 = stackOut_162_1;
            stackIn_163_0 = stackOut_162_0;
            stackIn_163_1 = stackOut_162_1;
            if (param2 == null) {
              stackOut_165_0 = (RuntimeException) ((Object) stackIn_165_0);
              stackOut_165_1 = (StringBuilder) ((Object) stackIn_165_1);
              stackOut_165_2 = "null";
              stackIn_166_0 = stackOut_165_0;
              stackIn_166_1 = stackOut_165_1;
              stackIn_166_2 = stackOut_165_2;
              break L35;
            } else {
              stackOut_163_0 = (RuntimeException) ((Object) stackIn_163_0);
              stackOut_163_1 = (StringBuilder) ((Object) stackIn_163_1);
              stackOut_163_2 = "{...}";
              stackIn_166_0 = stackOut_163_0;
              stackIn_166_1 = stackOut_163_1;
              stackIn_166_2 = stackOut_163_2;
              break L35;
            }
          }
          L36: {
            stackOut_166_0 = (RuntimeException) ((Object) stackIn_166_0);
            stackOut_166_1 = ((StringBuilder) (Object) stackIn_166_1).append(stackIn_166_2).append(',');
            stackIn_169_0 = stackOut_166_0;
            stackIn_169_1 = stackOut_166_1;
            stackIn_167_0 = stackOut_166_0;
            stackIn_167_1 = stackOut_166_1;
            if (param3 == null) {
              stackOut_169_0 = (RuntimeException) ((Object) stackIn_169_0);
              stackOut_169_1 = (StringBuilder) ((Object) stackIn_169_1);
              stackOut_169_2 = "null";
              stackIn_170_0 = stackOut_169_0;
              stackIn_170_1 = stackOut_169_1;
              stackIn_170_2 = stackOut_169_2;
              break L36;
            } else {
              stackOut_167_0 = (RuntimeException) ((Object) stackIn_167_0);
              stackOut_167_1 = (StringBuilder) ((Object) stackIn_167_1);
              stackOut_167_2 = "{...}";
              stackIn_170_0 = stackOut_167_0;
              stackIn_170_1 = stackOut_167_1;
              stackIn_170_2 = stackOut_167_2;
              break L36;
            }
          }
          L37: {
            stackOut_170_0 = (RuntimeException) ((Object) stackIn_170_0);
            stackOut_170_1 = ((StringBuilder) (Object) stackIn_170_1).append(stackIn_170_2).append(',');
            stackIn_173_0 = stackOut_170_0;
            stackIn_173_1 = stackOut_170_1;
            stackIn_171_0 = stackOut_170_0;
            stackIn_171_1 = stackOut_170_1;
            if (param4 == null) {
              stackOut_173_0 = (RuntimeException) ((Object) stackIn_173_0);
              stackOut_173_1 = (StringBuilder) ((Object) stackIn_173_1);
              stackOut_173_2 = "null";
              stackIn_174_0 = stackOut_173_0;
              stackIn_174_1 = stackOut_173_1;
              stackIn_174_2 = stackOut_173_2;
              break L37;
            } else {
              stackOut_171_0 = (RuntimeException) ((Object) stackIn_171_0);
              stackOut_171_1 = (StringBuilder) ((Object) stackIn_171_1);
              stackOut_171_2 = "{...}";
              stackIn_174_0 = stackOut_171_0;
              stackIn_174_1 = stackOut_171_1;
              stackIn_174_2 = stackOut_171_2;
              break L37;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_174_0), stackIn_174_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_23_0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_141_0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_147_0;
              } else {
                return stackIn_157_0;
              }
            }
          }
        }
    }

    final int a(byte param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 94) {
              stackOut_3_0 = this.a(param1, (byte) -113, (pa[]) null);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 39;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("vs.F(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    vs(byte[] param0) {
        byte[] array$3 = null;
        byte[] array$4 = null;
        RuntimeException var2 = null;
        rb var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7_int = 0;
        byte[][] var7 = null;
        int var8_int = 0;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_8_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_ref = new rb(param0);
            var3 = var2_ref.g(-52);
            if (0 == var3) {
              L1: {
                if ((var2_ref.g(43) ^ -1) != -2) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_8_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var4 = stackIn_8_0;
                      this.field_d = new byte[256];
                      var2_ref.a(0, 7186, 256, this.field_d);
                      if (var4 == 0) {
                        break L5;
                      } else {
                        var5 = new int[256];
                        var6 = new int[256];
                        var7_int = 0;
                        L6: while (true) {
                          L7: {
                            L8: {
                              if (-257 >= (var7_int ^ -1)) {
                                break L8;
                              } else {
                                var5[var7_int] = var2_ref.g(-87);
                                var7_int++;
                                if (var12 != 0) {
                                  break L7;
                                } else {
                                  if (var12 == 0) {
                                    continue L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            var7_int = 0;
                            break L7;
                          }
                          L9: while (true) {
                            L10: {
                              if (var7_int >= 256) {
                                break L10;
                              } else {
                                var6[var7_int] = var2_ref.g(-51);
                                var7_int++;
                                if (var12 != 0) {
                                  break L2;
                                } else {
                                  if (var12 == 0) {
                                    continue L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            var7 = new byte[256][];
                            var8_int = 0;
                            L11: while (true) {
                              L12: {
                                L13: {
                                  if (256 <= var8_int) {
                                    break L13;
                                  } else {
                                    array$3 = new byte[var5[var8_int]];
                                    var7[var8_int] = array$3;
                                    var9 = 0;
                                    stackOut_25_0 = 0;
                                    stackIn_35_0 = stackOut_25_0;
                                    stackIn_26_0 = stackOut_25_0;
                                    if (var12 != 0) {
                                      break L12;
                                    } else {
                                      var10 = stackIn_26_0;
                                      L14: while (true) {
                                        L15: {
                                          L16: {
                                            if ((var10 ^ -1) <= (var7[var8_int].length ^ -1)) {
                                              break L16;
                                            } else {
                                              var9 = (byte)(var9 + var2_ref.d(0));
                                              var7[var8_int][var10] = (byte) var9;
                                              var10++;
                                              if (var12 != 0) {
                                                break L15;
                                              } else {
                                                if (var12 == 0) {
                                                  continue L14;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                          var8_int++;
                                          break L15;
                                        }
                                        if (var12 == 0) {
                                          continue L11;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_34_0 = 256;
                                stackIn_35_0 = stackOut_34_0;
                                break L12;
                              }
                              var8 = new byte[stackIn_35_0][];
                              var9 = 0;
                              L17: while (true) {
                                L18: {
                                  L19: {
                                    if (var9 >= 256) {
                                      break L19;
                                    } else {
                                      array$4 = new byte[var5[var9]];
                                      var8[var9] = array$4;
                                      var10 = 0;
                                      stackOut_37_0 = 0;
                                      stackIn_47_0 = stackOut_37_0;
                                      stackIn_38_0 = stackOut_37_0;
                                      if (var12 != 0) {
                                        break L18;
                                      } else {
                                        var11 = stackIn_38_0;
                                        L20: while (true) {
                                          L21: {
                                            L22: {
                                              if (var8[var9].length <= var11) {
                                                break L22;
                                              } else {
                                                var10 = (byte)(var10 + var2_ref.d(0));
                                                var8[var9][var11] = (byte) var10;
                                                var11++;
                                                if (var12 != 0) {
                                                  break L21;
                                                } else {
                                                  if (var12 == 0) {
                                                    continue L20;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                            }
                                            var9++;
                                            break L21;
                                          }
                                          if (var12 == 0) {
                                            continue L17;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.field_h = new byte[256][256];
                                  stackOut_46_0 = 0;
                                  stackIn_47_0 = stackOut_46_0;
                                  break L18;
                                }
                                var9 = stackIn_47_0;
                                L23: while (true) {
                                  stackOut_48_0 = var9 ^ -1;
                                  stackOut_48_1 = -257;
                                  stackIn_49_0 = stackOut_48_0;
                                  stackIn_49_1 = stackOut_48_1;
                                  L24: while (true) {
                                    L25: {
                                      if (stackIn_49_0 <= stackIn_49_1) {
                                        break L25;
                                      } else {
                                        stackOut_50_0 = var9;
                                        stackIn_75_0 = stackOut_50_0;
                                        stackIn_51_0 = stackOut_50_0;
                                        if (var12 != 0) {
                                          break L3;
                                        } else {
                                          L26: {
                                            if (stackIn_51_0 == 32) {
                                              break L26;
                                            } else {
                                              if (160 == var9) {
                                                break L26;
                                              } else {
                                                var10 = 0;
                                                L27: while (true) {
                                                  if (-257 >= (var10 ^ -1)) {
                                                    break L26;
                                                  } else {
                                                    stackOut_59_0 = var10 ^ -1;
                                                    stackOut_59_1 = -33;
                                                    stackIn_49_0 = stackOut_59_0;
                                                    stackIn_49_1 = stackOut_59_1;
                                                    stackIn_60_0 = stackOut_59_0;
                                                    stackIn_60_1 = stackOut_59_1;
                                                    if (var12 != 0) {
                                                      continue L24;
                                                    } else {
                                                      L28: {
                                                        if (stackIn_60_0 == stackIn_60_1) {
                                                          break L28;
                                                        } else {
                                                          L29: {
                                                            if ((var10 ^ -1) != -161) {
                                                              break L29;
                                                            } else {
                                                              if (var12 == 0) {
                                                                break L28;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          this.field_h[var9][var10] = (byte)sb.a(var8, var10, -1, var5, var6, var7, var9, this.field_d);
                                                          break L28;
                                                        }
                                                      }
                                                      var10++;
                                                      if (var12 == 0) {
                                                        continue L27;
                                                      } else {
                                                        break L26;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var9++;
                                          if (var12 == 0) {
                                            continue L23;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                    }
                                    this.field_e = var6[32] + var5[32];
                                    if (var12 == 0) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    this.field_e = var2_ref.g(76);
                    break L4;
                  }
                  this.field_a = var2_ref.g(-110);
                  stackOut_74_0 = var2_ref.g(96);
                  stackIn_75_0 = stackOut_74_0;
                  break L3;
                }
                this.field_j = var2_ref.g(-103);
                this.field_i = var2_ref.g(-48);
                break L2;
              }
              break L0;
            } else {
              throw new RuntimeException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var2 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) (var2);
            stackOut_77_1 = new StringBuilder().append("vs.<init>(");
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L30;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L30;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
    }

    static {
    }
}
