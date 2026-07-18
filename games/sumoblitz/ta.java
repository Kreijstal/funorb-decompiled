/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    int field_d;
    private byte[] field_g;
    int field_h;
    int field_c;
    private byte[][] field_j;
    int field_i;
    static vf field_f;
    static int[] field_e;
    static mi field_a;
    static int field_b;

    final int a(String param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
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
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            stackOut_3_0 = this.a(0, (hr[]) null, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ta.F(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final int a(String param0, boolean param1, String[] param2, int[] param3, hr[] param4) {
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
        String var19 = null;
        Exception var20 = null;
        int var20_int = 0;
        int var21 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_137_0 = 0;
        int[] stackIn_137_1 = null;
        int stackIn_139_0 = 0;
        int[] stackIn_139_1 = null;
        int stackIn_140_0 = 0;
        int[] stackIn_140_1 = null;
        int stackIn_140_2 = 0;
        int stackIn_150_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_168_0 = 0;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        String stackIn_173_2 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        RuntimeException stackIn_177_0 = null;
        StringBuilder stackIn_177_1 = null;
        String stackIn_177_2 = null;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        RuntimeException stackIn_181_0 = null;
        StringBuilder stackIn_181_1 = null;
        String stackIn_181_2 = null;
        RuntimeException stackIn_182_0 = null;
        StringBuilder stackIn_182_1 = null;
        RuntimeException stackIn_184_0 = null;
        StringBuilder stackIn_184_1 = null;
        RuntimeException stackIn_185_0 = null;
        StringBuilder stackIn_185_1 = null;
        String stackIn_185_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_136_0 = 0;
        int[] stackOut_136_1 = null;
        int stackOut_139_0 = 0;
        int[] stackOut_139_1 = null;
        int stackOut_139_2 = 0;
        int stackOut_137_0 = 0;
        int[] stackOut_137_1 = null;
        int stackOut_137_2 = 0;
        int stackOut_149_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        int stackOut_167_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        RuntimeException stackOut_172_0 = null;
        StringBuilder stackOut_172_1 = null;
        String stackOut_172_2 = null;
        RuntimeException stackOut_170_0 = null;
        StringBuilder stackOut_170_1 = null;
        String stackOut_170_2 = null;
        RuntimeException stackOut_173_0 = null;
        StringBuilder stackOut_173_1 = null;
        RuntimeException stackOut_176_0 = null;
        StringBuilder stackOut_176_1 = null;
        String stackOut_176_2 = null;
        RuntimeException stackOut_174_0 = null;
        StringBuilder stackOut_174_1 = null;
        String stackOut_174_2 = null;
        RuntimeException stackOut_177_0 = null;
        StringBuilder stackOut_177_1 = null;
        RuntimeException stackOut_180_0 = null;
        StringBuilder stackOut_180_1 = null;
        String stackOut_180_2 = null;
        RuntimeException stackOut_178_0 = null;
        StringBuilder stackOut_178_1 = null;
        String stackOut_178_2 = null;
        RuntimeException stackOut_181_0 = null;
        StringBuilder stackOut_181_1 = null;
        RuntimeException stackOut_184_0 = null;
        StringBuilder stackOut_184_1 = null;
        String stackOut_184_2 = null;
        RuntimeException stackOut_182_0 = null;
        StringBuilder stackOut_182_1 = null;
        String stackOut_182_2 = null;
        var21 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (null != param0) {
              L1: {
                var6_int = 0;
                var7 = 0;
                var8 = -1;
                var9 = 0;
                var10 = 0;
                var11 = -1;
                if (!param1) {
                  break L1;
                } else {
                  int discarded$1 = this.a(-94, (hr[]) null, (String) null);
                  break L1;
                }
              }
              var12 = -1;
              var13 = 0;
              var14 = param0.length();
              var15 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var15 <= ~var14) {
                      break L4;
                    } else {
                      var16 = uo.a(true, param0.charAt(var15)) & 255;
                      var17 = 0;
                      stackOut_9_0 = ~var16;
                      stackOut_9_1 = -61;
                      stackIn_164_0 = stackOut_9_0;
                      stackIn_164_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var21 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_10_0 == stackIn_10_1) {
                              var11 = var15;
                              if (var21 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            L8: {
                              if (-1 == var11) {
                                break L8;
                              } else {
                                if (var16 != 62) {
                                  break L5;
                                } else {
                                  L9: {
                                    var18 = var11;
                                    var19 = param0.substring(1 + var11, var15);
                                    var11 = -1;
                                    if (!var19.equals((Object) (Object) "br")) {
                                      break L9;
                                    } else {
                                      param2[var13] = param0.substring(var7, var15 + 1);
                                      var13++;
                                      if (~param2.length < ~var13) {
                                        var7 = 1 + var15;
                                        var6_int = 0;
                                        var8 = -1;
                                        var12 = -1;
                                        if (var21 == 0) {
                                          break L5;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        stackOut_25_0 = 0;
                                        stackIn_26_0 = stackOut_25_0;
                                        return stackIn_26_0;
                                      }
                                    }
                                  }
                                  L10: {
                                    L11: {
                                      if (var19.equals((Object) (Object) "lt")) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (!var19.equals((Object) (Object) "gt")) {
                                            break L12;
                                          } else {
                                            L13: {
                                              var17 = var17 + ((ta) this).a(62, (byte) -53);
                                              if (null == ((ta) this).field_j) {
                                                break L13;
                                              } else {
                                                if (-1 != var12) {
                                                  var17 = var17 + ((ta) this).field_j[var12][62];
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            var12 = 62;
                                            if (var21 == 0) {
                                              break L10;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (var19.equals((Object) (Object) "nbsp")) {
                                            break L14;
                                          } else {
                                            L15: {
                                              if (!var19.equals((Object) (Object) "shy")) {
                                                break L15;
                                              } else {
                                                L16: {
                                                  var17 = var17 + ((ta) this).a(173, (byte) -53);
                                                  if (((ta) this).field_j == null) {
                                                    break L16;
                                                  } else {
                                                    if (var12 != -1) {
                                                      var17 = var17 + ((ta) this).field_j[var12][173];
                                                      break L16;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                                var12 = 173;
                                                if (var21 == 0) {
                                                  break L10;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            L17: {
                                              if (var19.equals((Object) (Object) "times")) {
                                                break L17;
                                              } else {
                                                L18: {
                                                  if (var19.equals((Object) (Object) "euro")) {
                                                    break L18;
                                                  } else {
                                                    L19: {
                                                      if (var19.equals((Object) (Object) "copy")) {
                                                        break L19;
                                                      } else {
                                                        L20: {
                                                          if (var19.equals((Object) (Object) "reg")) {
                                                            break L20;
                                                          } else {
                                                            if (!var19.startsWith("img=")) {
                                                              break L10;
                                                            } else {
                                                              if (param4 == null) {
                                                                break L10;
                                                              } else {
                                                                try {
                                                                  L21: {
                                                                    var20_int = no.a((byte) -128, (CharSequence) (Object) var19.substring(4));
                                                                    var17 = var17 + param4[var20_int].b();
                                                                    var12 = -1;
                                                                    decompiledRegionSelector0 = 0;
                                                                    break L21;
                                                                  }
                                                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                                                  decompiledCaughtException = decompiledCaughtParameter0;
                                                                  L22: {
                                                                    var20 = (Exception) (Object) decompiledCaughtException;
                                                                    if (var21 == 0) {
                                                                      decompiledRegionSelector0 = 0;
                                                                      break L22;
                                                                    } else {
                                                                      decompiledRegionSelector0 = 1;
                                                                      break L22;
                                                                    }
                                                                  }
                                                                }
                                                                if (decompiledRegionSelector0 == 0) {
                                                                  break L10;
                                                                } else {
                                                                  break L20;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L23: {
                                                          var17 = var17 + ((ta) this).a(174, (byte) -53);
                                                          if (((ta) this).field_j == null) {
                                                            break L23;
                                                          } else {
                                                            if (var12 != -1) {
                                                              var17 = var17 + ((ta) this).field_j[var12][174];
                                                              break L23;
                                                            } else {
                                                              break L23;
                                                            }
                                                          }
                                                        }
                                                        var12 = 174;
                                                        if (var21 == 0) {
                                                          break L10;
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                    L24: {
                                                      var17 = var17 + ((ta) this).a(169, (byte) -53);
                                                      if (null == ((ta) this).field_j) {
                                                        break L24;
                                                      } else {
                                                        if (-1 != var12) {
                                                          var17 = var17 + ((ta) this).field_j[var12][169];
                                                          break L24;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    var12 = 169;
                                                    if (var21 == 0) {
                                                      break L10;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                L25: {
                                                  var17 = var17 + ((ta) this).a(8364, (byte) -53);
                                                  if (null == ((ta) this).field_j) {
                                                    break L25;
                                                  } else {
                                                    if (var12 != -1) {
                                                      var17 = var17 + ((ta) this).field_j[var12][8364];
                                                      break L25;
                                                    } else {
                                                      break L25;
                                                    }
                                                  }
                                                }
                                                var12 = 8364;
                                                if (var21 == 0) {
                                                  break L10;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            L26: {
                                              var17 = var17 + ((ta) this).a(215, (byte) -53);
                                              if (((ta) this).field_j == null) {
                                                break L26;
                                              } else {
                                                if (var12 != -1) {
                                                  var17 = var17 + ((ta) this).field_j[var12][215];
                                                  break L26;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                            }
                                            var12 = 215;
                                            if (var21 == 0) {
                                              break L10;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        L27: {
                                          var17 = var17 + ((ta) this).a(160, (byte) -53);
                                          if (null == ((ta) this).field_j) {
                                            break L27;
                                          } else {
                                            if (var12 != -1) {
                                              var17 = var17 + ((ta) this).field_j[var12][160];
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        var12 = 160;
                                        if (var21 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L28: {
                                      var17 = var17 + ((ta) this).a(60, (byte) -53);
                                      if (((ta) this).field_j == null) {
                                        break L28;
                                      } else {
                                        if (var12 == -1) {
                                          break L28;
                                        } else {
                                          var17 = var17 + ((ta) this).field_j[var12][60];
                                          break L28;
                                        }
                                      }
                                    }
                                    var12 = 60;
                                    break L10;
                                  }
                                  var16 = -1;
                                  if (var21 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            L29: {
                              var18 = var15;
                              var17 = var17 + ((ta) this).a(var16, (byte) -53);
                              if (null == ((ta) this).field_j) {
                                break L29;
                              } else {
                                if (var12 == -1) {
                                  break L29;
                                } else {
                                  var17 = var17 + ((ta) this).field_j[var12][var16];
                                  break L29;
                                }
                              }
                            }
                            var12 = var16;
                            break L7;
                          }
                          if (var17 <= 0) {
                            break L5;
                          } else {
                            var6_int = var6_int + var17;
                            if (param3 != null) {
                              L30: {
                                if (var16 != 32) {
                                  break L30;
                                } else {
                                  var8 = var15;
                                  var10 = 1;
                                  var9 = var6_int;
                                  break L30;
                                }
                              }
                              L31: {
                                stackOut_136_0 = var6_int;
                                stackOut_136_1 = (int[]) param3;
                                stackIn_139_0 = stackOut_136_0;
                                stackIn_139_1 = stackOut_136_1;
                                stackIn_137_0 = stackOut_136_0;
                                stackIn_137_1 = stackOut_136_1;
                                if (~var13 <= ~param3.length) {
                                  stackOut_139_0 = stackIn_139_0;
                                  stackOut_139_1 = (int[]) (Object) stackIn_139_1;
                                  stackOut_139_2 = -1 + param3.length;
                                  stackIn_140_0 = stackOut_139_0;
                                  stackIn_140_1 = stackOut_139_1;
                                  stackIn_140_2 = stackOut_139_2;
                                  break L31;
                                } else {
                                  stackOut_137_0 = stackIn_137_0;
                                  stackOut_137_1 = (int[]) (Object) stackIn_137_1;
                                  stackOut_137_2 = var13;
                                  stackIn_140_0 = stackOut_137_0;
                                  stackIn_140_1 = stackOut_137_1;
                                  stackIn_140_2 = stackOut_137_2;
                                  break L31;
                                }
                              }
                              L32: {
                                if (stackIn_140_0 <= stackIn_140_1[stackIn_140_2]) {
                                  break L32;
                                } else {
                                  L33: {
                                    if (0 > var8) {
                                      break L33;
                                    } else {
                                      param2[var13] = param0.substring(var7, 1 + var8 + -var10);
                                      var13++;
                                      if (~param2.length >= ~var13) {
                                        stackOut_149_0 = 0;
                                        stackIn_150_0 = stackOut_149_0;
                                        return stackIn_150_0;
                                      } else {
                                        var7 = var8 - -1;
                                        var6_int = var6_int - var9;
                                        var8 = -1;
                                        var12 = -1;
                                        if (var21 == 0) {
                                          break L32;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                  }
                                  param2[var13] = param0.substring(var7, var18);
                                  var13++;
                                  if (param2.length > var13) {
                                    var7 = var18;
                                    var6_int = var17;
                                    var8 = -1;
                                    var12 = -1;
                                    break L32;
                                  } else {
                                    stackOut_155_0 = 0;
                                    stackIn_156_0 = stackOut_155_0;
                                    return stackIn_156_0;
                                  }
                                }
                              }
                              if (var16 == 45) {
                                var10 = 0;
                                var8 = var15;
                                var9 = var6_int;
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        var15++;
                        if (var21 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_163_0 = var7;
                  stackOut_163_1 = param0.length();
                  stackIn_164_0 = stackOut_163_0;
                  stackIn_164_1 = stackOut_163_1;
                  break L3;
                }
                L34: {
                  if (stackIn_164_0 >= stackIn_164_1) {
                    break L34;
                  } else {
                    param2[var13] = param0.substring(var7, param0.length());
                    var13++;
                    break L34;
                  }
                }
                stackOut_167_0 = var13;
                stackIn_168_0 = stackOut_167_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L35: {
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_169_0 = (RuntimeException) var6;
            stackOut_169_1 = new StringBuilder().append("ta.G(");
            stackIn_172_0 = stackOut_169_0;
            stackIn_172_1 = stackOut_169_1;
            stackIn_170_0 = stackOut_169_0;
            stackIn_170_1 = stackOut_169_1;
            if (param0 == null) {
              stackOut_172_0 = (RuntimeException) (Object) stackIn_172_0;
              stackOut_172_1 = (StringBuilder) (Object) stackIn_172_1;
              stackOut_172_2 = "null";
              stackIn_173_0 = stackOut_172_0;
              stackIn_173_1 = stackOut_172_1;
              stackIn_173_2 = stackOut_172_2;
              break L35;
            } else {
              stackOut_170_0 = (RuntimeException) (Object) stackIn_170_0;
              stackOut_170_1 = (StringBuilder) (Object) stackIn_170_1;
              stackOut_170_2 = "{...}";
              stackIn_173_0 = stackOut_170_0;
              stackIn_173_1 = stackOut_170_1;
              stackIn_173_2 = stackOut_170_2;
              break L35;
            }
          }
          L36: {
            stackOut_173_0 = (RuntimeException) (Object) stackIn_173_0;
            stackOut_173_1 = ((StringBuilder) (Object) stackIn_173_1).append(stackIn_173_2).append(',').append(param1).append(',');
            stackIn_176_0 = stackOut_173_0;
            stackIn_176_1 = stackOut_173_1;
            stackIn_174_0 = stackOut_173_0;
            stackIn_174_1 = stackOut_173_1;
            if (param2 == null) {
              stackOut_176_0 = (RuntimeException) (Object) stackIn_176_0;
              stackOut_176_1 = (StringBuilder) (Object) stackIn_176_1;
              stackOut_176_2 = "null";
              stackIn_177_0 = stackOut_176_0;
              stackIn_177_1 = stackOut_176_1;
              stackIn_177_2 = stackOut_176_2;
              break L36;
            } else {
              stackOut_174_0 = (RuntimeException) (Object) stackIn_174_0;
              stackOut_174_1 = (StringBuilder) (Object) stackIn_174_1;
              stackOut_174_2 = "{...}";
              stackIn_177_0 = stackOut_174_0;
              stackIn_177_1 = stackOut_174_1;
              stackIn_177_2 = stackOut_174_2;
              break L36;
            }
          }
          L37: {
            stackOut_177_0 = (RuntimeException) (Object) stackIn_177_0;
            stackOut_177_1 = ((StringBuilder) (Object) stackIn_177_1).append(stackIn_177_2).append(',');
            stackIn_180_0 = stackOut_177_0;
            stackIn_180_1 = stackOut_177_1;
            stackIn_178_0 = stackOut_177_0;
            stackIn_178_1 = stackOut_177_1;
            if (param3 == null) {
              stackOut_180_0 = (RuntimeException) (Object) stackIn_180_0;
              stackOut_180_1 = (StringBuilder) (Object) stackIn_180_1;
              stackOut_180_2 = "null";
              stackIn_181_0 = stackOut_180_0;
              stackIn_181_1 = stackOut_180_1;
              stackIn_181_2 = stackOut_180_2;
              break L37;
            } else {
              stackOut_178_0 = (RuntimeException) (Object) stackIn_178_0;
              stackOut_178_1 = (StringBuilder) (Object) stackIn_178_1;
              stackOut_178_2 = "{...}";
              stackIn_181_0 = stackOut_178_0;
              stackIn_181_1 = stackOut_178_1;
              stackIn_181_2 = stackOut_178_2;
              break L37;
            }
          }
          L38: {
            stackOut_181_0 = (RuntimeException) (Object) stackIn_181_0;
            stackOut_181_1 = ((StringBuilder) (Object) stackIn_181_1).append(stackIn_181_2).append(',');
            stackIn_184_0 = stackOut_181_0;
            stackIn_184_1 = stackOut_181_1;
            stackIn_182_0 = stackOut_181_0;
            stackIn_182_1 = stackOut_181_1;
            if (param4 == null) {
              stackOut_184_0 = (RuntimeException) (Object) stackIn_184_0;
              stackOut_184_1 = (StringBuilder) (Object) stackIn_184_1;
              stackOut_184_2 = "null";
              stackIn_185_0 = stackOut_184_0;
              stackIn_185_1 = stackOut_184_1;
              stackIn_185_2 = stackOut_184_2;
              break L38;
            } else {
              stackOut_182_0 = (RuntimeException) (Object) stackIn_182_0;
              stackOut_182_1 = (StringBuilder) (Object) stackIn_182_1;
              stackOut_182_2 = "{...}";
              stackIn_185_0 = stackOut_182_0;
              stackIn_185_1 = stackOut_182_1;
              stackIn_185_2 = stackOut_182_2;
              break L38;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_185_0, stackIn_185_2 + ')');
        }
        return stackIn_168_0;
    }

    private final int a(int param0, hr[] param1, String param2) {
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
        int stackIn_7_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (null != param2) {
              var4_int = -1;
              var5 = -1;
              var6 = 0;
              var7 = param2.length();
              var8 = param0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var7 <= var8) {
                      break L3;
                    } else {
                      var9 = param2.charAt(var8);
                      stackOut_6_0 = -61;
                      stackIn_65_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var12 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 != ~var9) {
                              break L5;
                            } else {
                              var4_int = var8;
                              if (var12 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (var9 != 62) {
                              break L6;
                            } else {
                              if (var4_int == -1) {
                                break L6;
                              } else {
                                L7: {
                                  var10 = param2.substring(1 + var4_int, var8);
                                  var4_int = -1;
                                  if (!var10.equals((Object) (Object) "lt")) {
                                    break L7;
                                  } else {
                                    var9 = 60;
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                L8: {
                                  if (!var10.equals((Object) (Object) "gt")) {
                                    break L8;
                                  } else {
                                    var9 = 62;
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  if (!var10.equals((Object) (Object) "nbsp")) {
                                    break L9;
                                  } else {
                                    var9 = 160;
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (!var10.equals((Object) (Object) "shy")) {
                                    break L10;
                                  } else {
                                    var9 = 173;
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (!var10.equals((Object) (Object) "times")) {
                                    break L11;
                                  } else {
                                    var9 = 215;
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (!var10.equals((Object) (Object) "euro")) {
                                    break L12;
                                  } else {
                                    var9 = 8364;
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  if (!var10.equals((Object) (Object) "copy")) {
                                    break L13;
                                  } else {
                                    var9 = 169;
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                L14: {
                                  if (var10.equals((Object) (Object) "reg")) {
                                    break L14;
                                  } else {
                                    if (!var10.startsWith("img=")) {
                                      break L4;
                                    } else {
                                      if (param1 == null) {
                                        break L4;
                                      } else {
                                        try {
                                          L15: {
                                            var11_int = no.a((byte) -127, (CharSequence) (Object) var10.substring(4));
                                            var5 = -1;
                                            var6 = var6 + param1[var11_int].b();
                                            decompiledRegionSelector0 = 0;
                                            break L15;
                                          }
                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          L16: {
                                            var11 = (Exception) (Object) decompiledCaughtException;
                                            if (var12 == 0) {
                                              decompiledRegionSelector0 = 0;
                                              break L16;
                                            } else {
                                              decompiledRegionSelector0 = 1;
                                              break L16;
                                            }
                                          }
                                        }
                                        if (decompiledRegionSelector0 == 0) {
                                          break L4;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                }
                                var9 = 174;
                                break L6;
                              }
                            }
                          }
                          if (var4_int != -1) {
                            break L4;
                          } else {
                            L17: {
                              var6 = var6 + (255 & ((ta) this).field_g[uo.a(true, (char) var9) & 255]);
                              if (null == ((ta) this).field_j) {
                                break L17;
                              } else {
                                if (var5 == -1) {
                                  break L17;
                                } else {
                                  var6 = var6 + ((ta) this).field_j[var5][var9];
                                  break L17;
                                }
                              }
                            }
                            var5 = var9;
                            break L4;
                          }
                        }
                        var8++;
                        if (var12 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_64_0 = var6;
                  stackIn_65_0 = stackOut_64_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L18: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var4;
            stackOut_66_1 = new StringBuilder().append("ta.H(").append(param0).append(',');
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L18;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L18;
            }
          }
          L19: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L19;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L19;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ')');
        }
        return stackIn_65_0;
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -53) {
                break L1;
              } else {
                ((ta) this).field_h = -30;
                break L1;
              }
            }
            stackOut_3_0 = ((ta) this).field_g[param0] & 255;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "ta.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final String a(int param0, String param1, hr[] param2, int param3) {
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
        String stackIn_54_0 = null;
        String stackIn_73_0 = null;
        String stackIn_77_0 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_8_0 = null;
        String stackOut_53_0 = null;
        String stackOut_72_0 = null;
        String stackOut_76_0 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (~this.a(param3 ^ -63, param2, param1) >= ~param0) {
              stackOut_4_0 = (String) param1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              param0 = param0 - this.a(param3 ^ param3, (hr[]) null, "...");
              var5_int = -1;
              var6 = -1;
              var7 = 0;
              var8 = param1.length();
              var9 = "";
              var10 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var8 <= var10) {
                      break L3;
                    } else {
                      stackOut_8_0 = (String) param1;
                      stackIn_77_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var14 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            var11 = ((String) (Object) stackIn_9_0).charAt(var10);
                            if (60 != var11) {
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
                            if (var11 != 62) {
                              break L6;
                            } else {
                              if (var5_int == -1) {
                                break L6;
                              } else {
                                L7: {
                                  var12_ref_String = param1.substring(var5_int + 1, var10);
                                  var5_int = -1;
                                  if (!var12_ref_String.equals((Object) (Object) "lt")) {
                                    break L7;
                                  } else {
                                    var11 = 60;
                                    if (var14 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                L8: {
                                  if (var12_ref_String.equals((Object) (Object) "gt")) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (!var12_ref_String.equals((Object) (Object) "nbsp")) {
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
                                      if (!var12_ref_String.equals((Object) (Object) "shy")) {
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
                                      if (!var12_ref_String.equals((Object) (Object) "times")) {
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
                                      if (var12_ref_String.equals((Object) (Object) "euro")) {
                                        break L12;
                                      } else {
                                        L13: {
                                          if (!var12_ref_String.equals((Object) (Object) "copy")) {
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
                                          if (var12_ref_String.equals((Object) (Object) "reg")) {
                                            break L14;
                                          } else {
                                            if (!var12_ref_String.startsWith("img=")) {
                                              break L4;
                                            } else {
                                              if (null == param2) {
                                                break L4;
                                              } else {
                                                try {
                                                  L15: {
                                                    var13_int = no.a((byte) -127, (CharSequence) (Object) var12_ref_String.substring(4));
                                                    var6 = -1;
                                                    var7 = var7 + param2[var13_int].b();
                                                    if (~var7 < ~param0) {
                                                      stackOut_53_0 = var9 + "...";
                                                      stackIn_54_0 = stackOut_53_0;
                                                      return stackIn_54_0;
                                                    } else {
                                                      var9 = param1.substring(0, 1 + var10);
                                                      decompiledRegionSelector0 = 0;
                                                      break L15;
                                                    }
                                                  }
                                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                                  decompiledCaughtException = decompiledCaughtParameter0;
                                                  L16: {
                                                    var13 = (Exception) (Object) decompiledCaughtException;
                                                    if (var14 == 0) {
                                                      decompiledRegionSelector0 = 0;
                                                      break L16;
                                                    } else {
                                                      decompiledRegionSelector0 = 1;
                                                      break L16;
                                                    }
                                                  }
                                                }
                                                if (decompiledRegionSelector0 == 0) {
                                                  break L4;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var11 = 174;
                                        if (var14 == 0) {
                                          break L6;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    var11 = 8364;
                                    if (var14 == 0) {
                                      break L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var11 = 62;
                                break L6;
                              }
                            }
                          }
                          if (var5_int != -1) {
                            break L4;
                          } else {
                            L17: {
                              var7 = var7 + (((ta) this).field_g[uo.a(true, (char) var11) & 255] & 255);
                              if (null == ((ta) this).field_j) {
                                break L17;
                              } else {
                                if (var6 != -1) {
                                  var7 = var7 + ((ta) this).field_j[var6][var11];
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            L18: {
                              var6 = var11;
                              var12 = var7;
                              if (((ta) this).field_j == null) {
                                break L18;
                              } else {
                                var12 = var12 + ((ta) this).field_j[var11][46];
                                break L18;
                              }
                            }
                            if (~var12 >= ~param0) {
                              var9 = param1.substring(0, var10 + 1);
                              break L4;
                            } else {
                              stackOut_72_0 = var9 + "...";
                              stackIn_73_0 = stackOut_72_0;
                              return stackIn_73_0;
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
                  stackOut_76_0 = (String) param1;
                  stackIn_77_0 = stackOut_76_0;
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L19: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var5;
            stackOut_78_1 = new StringBuilder().append("ta.C(").append(param0).append(',');
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param1 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L19;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L19;
            }
          }
          L20: {
            stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',');
            stackIn_85_0 = stackOut_82_0;
            stackIn_85_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param2 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L20;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_86_0 = stackOut_83_0;
              stackIn_86_1 = stackOut_83_1;
              stackIn_86_2 = stackOut_83_2;
              break L20;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_86_0, stackIn_86_2 + ',' + param3 + ')');
        }
        return stackIn_77_0;
    }

    final static wb[] a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        wb[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        wb[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param1 > 87) {
              stackOut_3_0 = ni.a(param3, 1, 0, param0, param2);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wb[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var4, "ta.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final int a(int param0, char param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        byte stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -49) {
                break L1;
              } else {
                int discarded$2 = ((ta) this).a(-23, (byte) 121);
                break L1;
              }
            }
            if (null != ((ta) this).field_j) {
              stackOut_6_0 = ((ta) this).field_j[param2][param1];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var4, "ta.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(boolean param0) {
        try {
            field_f = null;
            field_e = null;
            field_a = null;
            if (param0) {
                field_b = -45;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ta.B(" + param0 + ')');
        }
    }

    ta(byte[] param0) {
        RuntimeException var2 = null;
        fs var2_ref = null;
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
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_76_0 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_ref = new fs(param0);
            var3 = var2_ref.e(-31302);
            if (var3 == 0) {
              L1: {
                if (1 != var2_ref.e(-31302)) {
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
                      ((ta) this).field_g = new byte[256];
                      var2_ref.a(((ta) this).field_g, 256, 0, (byte) -101);
                      if (var4 != 0) {
                        break L5;
                      } else {
                        ((ta) this).field_d = var2_ref.e(-31302);
                        if (var12 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5 = new int[256];
                    var7_int = 0;
                    L6: while (true) {
                      L7: {
                        if (var7_int >= 256) {
                          break L7;
                        } else {
                          var5[var7_int] = var2_ref.e(-31302);
                          var7_int++;
                          if (var12 != 0) {
                            break L2;
                          } else {
                            if (var12 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var6 = new int[256];
                      var7_int = 0;
                      L8: while (true) {
                        L9: {
                          if (var7_int >= 256) {
                            break L9;
                          } else {
                            var6[var7_int] = var2_ref.e(-31302);
                            var7_int++;
                            if (var12 != 0) {
                              break L2;
                            } else {
                              if (var12 == 0) {
                                continue L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        var7 = new byte[256][];
                        var8_int = 0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (var8_int >= 256) {
                                break L12;
                              } else {
                                var7[var8_int] = new byte[var5[var8_int]];
                                var9 = 0;
                                stackOut_26_0 = 0;
                                stackIn_36_0 = stackOut_26_0;
                                stackIn_27_0 = stackOut_26_0;
                                if (var12 != 0) {
                                  break L11;
                                } else {
                                  var10 = stackIn_27_0;
                                  L13: while (true) {
                                    L14: {
                                      L15: {
                                        if (~var10 <= ~var7[var8_int].length) {
                                          break L15;
                                        } else {
                                          var9 = (byte)(var9 + var2_ref.d(true));
                                          var7[var8_int][var10] = (byte) var9;
                                          var10++;
                                          if (var12 != 0) {
                                            break L14;
                                          } else {
                                            if (var12 == 0) {
                                              continue L13;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                      var8_int++;
                                      break L14;
                                    }
                                    if (var12 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_35_0 = 256;
                            stackIn_36_0 = stackOut_35_0;
                            break L11;
                          }
                          var8 = new byte[stackIn_36_0][];
                          var9 = 0;
                          L16: while (true) {
                            L17: {
                              L18: {
                                if (var9 >= 256) {
                                  break L18;
                                } else {
                                  var8[var9] = new byte[var5[var9]];
                                  var10 = 0;
                                  stackOut_38_0 = 0;
                                  stackIn_48_0 = stackOut_38_0;
                                  stackIn_39_0 = stackOut_38_0;
                                  if (var12 != 0) {
                                    break L17;
                                  } else {
                                    var11 = stackIn_39_0;
                                    L19: while (true) {
                                      L20: {
                                        L21: {
                                          if (~var8[var9].length >= ~var11) {
                                            break L21;
                                          } else {
                                            var10 = (byte)(var10 + var2_ref.d(true));
                                            var8[var9][var11] = (byte) var10;
                                            var11++;
                                            if (var12 != 0) {
                                              break L20;
                                            } else {
                                              if (var12 == 0) {
                                                continue L19;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                        }
                                        var9++;
                                        break L20;
                                      }
                                      if (var12 == 0) {
                                        continue L16;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                              }
                              ((ta) this).field_j = new byte[256][256];
                              stackOut_47_0 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              break L17;
                            }
                            var9 = stackIn_48_0;
                            L22: while (true) {
                              stackOut_49_0 = var9;
                              stackOut_49_1 = 256;
                              stackIn_50_0 = stackOut_49_0;
                              stackIn_50_1 = stackOut_49_1;
                              L23: while (true) {
                                L24: {
                                  if (stackIn_50_0 >= stackIn_50_1) {
                                    break L24;
                                  } else {
                                    stackOut_51_0 = ~var9;
                                    stackIn_77_0 = stackOut_51_0;
                                    stackIn_52_0 = stackOut_51_0;
                                    if (var12 != 0) {
                                      break L3;
                                    } else {
                                      L25: {
                                        if (stackIn_52_0 == -33) {
                                          break L25;
                                        } else {
                                          L26: {
                                            if (160 != var9) {
                                              break L26;
                                            } else {
                                              if (var12 == 0) {
                                                break L25;
                                              } else {
                                                break L26;
                                              }
                                            }
                                          }
                                          var10 = 0;
                                          L27: while (true) {
                                            if (var10 >= 256) {
                                              break L25;
                                            } else {
                                              stackOut_63_0 = var10;
                                              stackOut_63_1 = 32;
                                              stackIn_50_0 = stackOut_63_0;
                                              stackIn_50_1 = stackOut_63_1;
                                              stackIn_64_0 = stackOut_63_0;
                                              stackIn_64_1 = stackOut_63_1;
                                              if (var12 != 0) {
                                                continue L23;
                                              } else {
                                                L28: {
                                                  if (stackIn_64_0 == stackIn_64_1) {
                                                    break L28;
                                                  } else {
                                                    L29: {
                                                      if (var10 != 160) {
                                                        break L29;
                                                      } else {
                                                        if (var12 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L29;
                                                        }
                                                      }
                                                    }
                                                    ((ta) this).field_j[var9][var10] = (byte)ej.a(var9, var10, ((ta) this).field_g, var7, var6, (byte) -75, var8, var5);
                                                    break L28;
                                                  }
                                                }
                                                var10++;
                                                if (var12 == 0) {
                                                  continue L27;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var9++;
                                      if (var12 == 0) {
                                        continue L22;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                ((ta) this).field_d = var6[32] + var5[32];
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  ((ta) this).field_h = var2_ref.e(-31302);
                  stackOut_76_0 = var2_ref.e(-31302);
                  stackIn_77_0 = stackOut_76_0;
                  break L3;
                }
                ((ta) this).field_i = var2_ref.e(-31302);
                ((ta) this).field_c = var2_ref.e(-31302);
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
            stackOut_79_0 = (RuntimeException) var2;
            stackOut_79_1 = new StringBuilder().append("ta.<init>(");
            stackIn_82_0 = stackOut_79_0;
            stackIn_82_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param0 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L30;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_83_0 = stackOut_80_0;
              stackIn_83_1 = stackOut_80_1;
              stackIn_83_2 = stackOut_80_2;
              break L30;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_83_0, stackIn_83_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new vf();
        field_e = new int[8192];
        field_a = new mi();
    }
}
