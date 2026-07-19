/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends bd {
    private int field_y;
    static int[] field_s;
    static String field_w;
    private int field_t;
    private int field_u;
    static String field_v;
    private int field_A;
    static je field_x;
    private int field_z;

    final void a(int param0, ha param1) {
        String discarded$2 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.field_l.a((byte) -119, (tc) (new kf(this.field_u, this.field_y, this.field_t, this.field_A, this.field_z, this.field_m)));
              if (param0 == 64) {
                break L1;
              } else {
                discarded$2 = pe.a(53, false, (String[][]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("pe.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static String a(int param0, boolean param1, String[][] param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          var3 = param2[param0][0];
          if (!kq.a(var3, param1)) {
            return var3;
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("pe.B(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -106 / ((param0 - 59) / 60);
        field_x = null;
        field_s = null;
        field_v = null;
        field_w = null;
    }

    final static int b(int param0, int param1) {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = (double)(255 & param1 >> -1126195952) / 256.0;
        var4 = (double)((param1 & 65459) >> 1736684840) / 256.0;
        if (param0 >= 22) {
          L0: {
            var6 = (double)(param1 & 255) / 256.0;
            var8 = var2;
            if (var8 > var4) {
              var8 = var4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var8 > var6) {
              var8 = var6;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var10 = var2;
            if (var10 < var4) {
              var10 = var4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var10 >= var6) {
              break L3;
            } else {
              var10 = var6;
              break L3;
            }
          }
          L4: {
            var12 = 0.0;
            var14 = 0.0;
            var16 = (var8 + var10) / 2.0;
            if (var8 == var10) {
              break L4;
            } else {
              L5: {
                if (var16 < 0.5) {
                  var14 = (-var8 + var10) / (var10 + var8);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (var10 != var2) {
                    break L7;
                  } else {
                    var12 = (-var6 + var4) / (var10 - var8);
                    if (var21 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var4 == var10) {
                    break L8;
                  } else {
                    if (var6 != var10) {
                      break L6;
                    } else {
                      var12 = 4.0 + (-var4 + var2) / (-var8 + var10);
                      if (var21 == 0) {
                        break L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                var12 = 2.0 + (-var2 + var6) / (-var8 + var10);
                break L6;
              }
              if (0.5 <= var16) {
                var14 = (var10 - var8) / (2.0 - var10 - var8);
                break L4;
              } else {
                var12 = var12 / 6.0;
                var18 = (int)(256.0 * var12);
                var19 = (int)(256.0 * var14);
                var20 = (int)(var16 * 256.0);
                if (0 <= var19) {
                  if (var19 <= 255) {
                    L9: {
                      L10: {
                        if (0 > var20) {
                          break L10;
                        } else {
                          if ((var20 ^ -1) >= -256) {
                            break L9;
                          } else {
                            var20 = 255;
                            if (var21 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      var20 = 0;
                      break L9;
                    }
                    L11: {
                      L12: {
                        if (243 < var20) {
                          break L12;
                        } else {
                          L13: {
                            if (-218 <= (var20 ^ -1)) {
                              break L13;
                            } else {
                              var19 = var19 >> 3;
                              if (var21 == 0) {
                                break L11;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (192 < var20) {
                              break L14;
                            } else {
                              if (var20 <= 179) {
                                break L11;
                              } else {
                                var19 = var19 >> 1;
                                if (var21 == 0) {
                                  break L11;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var19 = var19 >> 2;
                          if (var21 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var19 = var19 >> 4;
                      break L11;
                    }
                    return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                  } else {
                    L15: {
                      var19 = 255;
                      if (var21 == 0) {
                        break L15;
                      } else {
                        var19 = 0;
                        break L15;
                      }
                    }
                    L16: {
                      L17: {
                        if (0 > var20) {
                          break L17;
                        } else {
                          if ((var20 ^ -1) >= -256) {
                            break L16;
                          } else {
                            var20 = 255;
                            if (var21 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      var20 = 0;
                      break L16;
                    }
                    L18: {
                      L19: {
                        if (243 < var20) {
                          break L19;
                        } else {
                          L20: {
                            if (-218 <= (var20 ^ -1)) {
                              break L20;
                            } else {
                              var19 = var19 >> 3;
                              if (var21 == 0) {
                                break L18;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L21: {
                            if (192 < var20) {
                              break L21;
                            } else {
                              if (var20 <= 179) {
                                break L18;
                              } else {
                                var19 = var19 >> 1;
                                if (var21 == 0) {
                                  break L18;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          var19 = var19 >> 2;
                          if (var21 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var19 = var19 >> 4;
                      break L18;
                    }
                    return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                  }
                } else {
                  L22: {
                    L23: {
                      var19 = 0;
                      if (0 > var20) {
                        break L23;
                      } else {
                        if ((var20 ^ -1) >= -256) {
                          break L22;
                        } else {
                          var20 = 255;
                          if (var21 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    var20 = 0;
                    break L22;
                  }
                  L24: {
                    L25: {
                      if (243 < var20) {
                        break L25;
                      } else {
                        L26: {
                          if (-218 <= (var20 ^ -1)) {
                            break L26;
                          } else {
                            var19 = var19 >> 3;
                            if (var21 == 0) {
                              break L24;
                            } else {
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if (192 < var20) {
                            break L27;
                          } else {
                            if (var20 <= 179) {
                              break L24;
                            } else {
                              var19 = var19 >> 1;
                              if (var21 == 0) {
                                break L24;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        var19 = var19 >> 2;
                        if (var21 == 0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    var19 = var19 >> 4;
                    break L24;
                  }
                  return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                }
              }
            }
          }
          var12 = var12 / 6.0;
          var18 = (int)(256.0 * var12);
          var19 = (int)(256.0 * var14);
          var20 = (int)(var16 * 256.0);
          if (0 <= var19) {
            if (var19 <= 255) {
              L28: {
                L29: {
                  if (0 > var20) {
                    break L29;
                  } else {
                    if ((var20 ^ -1) >= -256) {
                      break L28;
                    } else {
                      var20 = 255;
                      if (var21 == 0) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
                var20 = 0;
                break L28;
              }
              L30: {
                L31: {
                  if (243 < var20) {
                    break L31;
                  } else {
                    L32: {
                      if (-218 <= (var20 ^ -1)) {
                        break L32;
                      } else {
                        var19 = var19 >> 3;
                        if (var21 == 0) {
                          break L30;
                        } else {
                          break L32;
                        }
                      }
                    }
                    L33: {
                      if (192 < var20) {
                        break L33;
                      } else {
                        if (var20 <= 179) {
                          break L30;
                        } else {
                          var19 = var19 >> 1;
                          if (var21 == 0) {
                            break L30;
                          } else {
                            break L33;
                          }
                        }
                      }
                    }
                    var19 = var19 >> 2;
                    if (var21 == 0) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                var19 = var19 >> 4;
                break L30;
              }
              return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
            } else {
              L34: {
                var19 = 255;
                if (var21 == 0) {
                  break L34;
                } else {
                  var19 = 0;
                  break L34;
                }
              }
              L35: {
                L36: {
                  if (0 > var20) {
                    break L36;
                  } else {
                    if ((var20 ^ -1) >= -256) {
                      break L35;
                    } else {
                      var20 = 255;
                      if (var21 == 0) {
                        break L35;
                      } else {
                        break L36;
                      }
                    }
                  }
                }
                var20 = 0;
                break L35;
              }
              L37: {
                L38: {
                  if (243 < var20) {
                    break L38;
                  } else {
                    L39: {
                      if (-218 <= (var20 ^ -1)) {
                        break L39;
                      } else {
                        var19 = var19 >> 3;
                        if (var21 == 0) {
                          break L37;
                        } else {
                          break L39;
                        }
                      }
                    }
                    L40: {
                      if (192 < var20) {
                        break L40;
                      } else {
                        if (var20 <= 179) {
                          break L37;
                        } else {
                          var19 = var19 >> 1;
                          if (var21 == 0) {
                            break L37;
                          } else {
                            break L40;
                          }
                        }
                      }
                    }
                    var19 = var19 >> 2;
                    if (var21 == 0) {
                      break L37;
                    } else {
                      break L38;
                    }
                  }
                }
                var19 = var19 >> 4;
                break L37;
              }
              return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
            }
          } else {
            L41: {
              L42: {
                var19 = 0;
                if (0 > var20) {
                  break L42;
                } else {
                  if ((var20 ^ -1) >= -256) {
                    break L41;
                  } else {
                    var20 = 255;
                    if (var21 == 0) {
                      break L41;
                    } else {
                      break L42;
                    }
                  }
                }
              }
              var20 = 0;
              break L41;
            }
            L43: {
              L44: {
                if (243 < var20) {
                  break L44;
                } else {
                  L45: {
                    if (-218 <= (var20 ^ -1)) {
                      break L45;
                    } else {
                      var19 = var19 >> 3;
                      if (var21 == 0) {
                        break L43;
                      } else {
                        break L45;
                      }
                    }
                  }
                  L46: {
                    if (192 < var20) {
                      break L46;
                    } else {
                      if (var20 <= 179) {
                        break L43;
                      } else {
                        var19 = var19 >> 1;
                        if (var21 == 0) {
                          break L43;
                        } else {
                          break L46;
                        }
                      }
                    }
                  }
                  var19 = var19 >> 2;
                  if (var21 == 0) {
                    break L43;
                  } else {
                    break L44;
                  }
                }
              }
              var19 = var19 >> 4;
              break L43;
            }
            return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
          }
        } else {
          return -33;
        }
    }

    pe(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_u = param0;
        this.field_t = param2;
        this.field_y = param1;
        this.field_A = param3;
        this.field_z = param4;
        this.field_m = param5;
    }

    static {
        field_w = "Back";
        field_v = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
