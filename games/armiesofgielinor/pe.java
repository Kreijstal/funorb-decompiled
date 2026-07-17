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
              param1.field_l.a((byte) -119, (tc) (Object) new kf(((pe) this).field_u, ((pe) this).field_y, ((pe) this).field_t, ((pe) this).field_A, ((pe) this).field_z, ((pe) this).field_m));
              if (param0 == 64) {
                break L1;
              } else {
                String discarded$2 = pe.a(53, false, (String[][]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pe.C(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("pe.B(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    public static void a(byte param0) {
        int var1 = -106;
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
        var2 = (double)(255 & param1 >> 16) / 256.0;
        var4 = (double)((param1 & 65459) >> 8) / 256.0;
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
          var12 = 0.0;
          var14 = 0.0;
          var16 = (var8 + var10) / 2.0;
          if (var8 != var10) {
            L4: {
              if (var16 < 0.5) {
                var14 = (-var8 + var10) / (var10 + var8);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var10 != var2) {
                if (var4 == var10) {
                  var12 = 2.0 + (-var2 + var6) / (-var8 + var10);
                  break L5;
                } else {
                  if (var6 == var10) {
                    var12 = 4.0 + (-var4 + var2) / (-var8 + var10);
                    break L5;
                  } else {
                    L6: {
                      if (0.5 <= var16) {
                        var14 = (var10 - var8) / (2.0 - var10 - var8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var12 = var12 / 6.0;
                    var18 = (int)(256.0 * var12);
                    var19 = (int)(256.0 * var14);
                    var20 = (int)(var16 * 256.0);
                    if (0 > var19) {
                      L7: {
                        var19 = 0;
                        if (0 > var20) {
                          var20 = 0;
                          break L7;
                        } else {
                          if (var20 <= 255) {
                            break L7;
                          } else {
                            L8: {
                              var20 = 255;
                              if (243 < var20) {
                                var19 = var19 >> 4;
                                break L8;
                              } else {
                                if (var20 <= 217) {
                                  if (192 < var20) {
                                    var19 = var19 >> 2;
                                    break L8;
                                  } else {
                                    if (var20 <= 179) {
                                      break L8;
                                    } else {
                                      var19 = var19 >> 1;
                                      break L8;
                                    }
                                  }
                                } else {
                                  var19 = var19 >> 3;
                                  break L8;
                                }
                              }
                            }
                            return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                          }
                        }
                      }
                      L9: {
                        if (243 < var20) {
                          var19 = var19 >> 4;
                          break L9;
                        } else {
                          if (var20 <= 217) {
                            if (192 < var20) {
                              var19 = var19 >> 2;
                              return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                            } else {
                              if (var20 <= 179) {
                                break L9;
                              } else {
                                var19 = var19 >> 1;
                                return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                              }
                            }
                          } else {
                            var19 = var19 >> 3;
                            return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                          }
                        }
                      }
                      return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                    } else {
                      if (var19 > 255) {
                        L10: {
                          var19 = 255;
                          if (0 > var20) {
                            var20 = 0;
                            break L10;
                          } else {
                            if (var20 <= 255) {
                              break L10;
                            } else {
                              var20 = 255;
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (243 < var20) {
                            var19 = var19 >> 4;
                            break L11;
                          } else {
                            if (var20 <= 217) {
                              if (192 < var20) {
                                var19 = var19 >> 2;
                                break L11;
                              } else {
                                if (var20 <= 179) {
                                  break L11;
                                } else {
                                  var19 = var19 >> 1;
                                  break L11;
                                }
                              }
                            } else {
                              var19 = var19 >> 3;
                              break L11;
                            }
                          }
                        }
                        return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                      } else {
                        L12: {
                          if (0 > var20) {
                            var20 = 0;
                            break L12;
                          } else {
                            if (var20 <= 255) {
                              break L12;
                            } else {
                              var20 = 255;
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (243 < var20) {
                            var19 = var19 >> 4;
                            break L13;
                          } else {
                            if (var20 <= 217) {
                              if (192 < var20) {
                                var19 = var19 >> 2;
                                break L13;
                              } else {
                                if (var20 <= 179) {
                                  break L13;
                                } else {
                                  var19 = var19 >> 1;
                                  break L13;
                                }
                              }
                            } else {
                              var19 = var19 >> 3;
                              break L13;
                            }
                          }
                        }
                        return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                      }
                    }
                  }
                }
              } else {
                var12 = (-var6 + var4) / (var10 - var8);
                break L5;
              }
            }
            L14: {
              if (0.5 <= var16) {
                var14 = (var10 - var8) / (2.0 - var10 - var8);
                break L14;
              } else {
                break L14;
              }
            }
            var12 = var12 / 6.0;
            var18 = (int)(256.0 * var12);
            var19 = (int)(256.0 * var14);
            var20 = (int)(var16 * 256.0);
            if (0 > var19) {
              L15: {
                var19 = 0;
                if (0 > var20) {
                  var20 = 0;
                  break L15;
                } else {
                  if (var20 <= 255) {
                    break L15;
                  } else {
                    L16: {
                      var20 = 255;
                      if (243 < var20) {
                        var19 = var19 >> 4;
                        break L16;
                      } else {
                        if (var20 <= 217) {
                          if (192 < var20) {
                            var19 = var19 >> 2;
                            return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                          } else {
                            if (var20 <= 179) {
                              break L16;
                            } else {
                              var19 = var19 >> 1;
                              return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                            }
                          }
                        } else {
                          var19 = var19 >> 3;
                          return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                        }
                      }
                    }
                    return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                  }
                }
              }
              L17: {
                if (243 < var20) {
                  var19 = var19 >> 4;
                  break L17;
                } else {
                  if (var20 <= 217) {
                    if (192 < var20) {
                      var19 = var19 >> 2;
                      return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                    } else {
                      if (var20 <= 179) {
                        break L17;
                      } else {
                        var19 = var19 >> 1;
                        return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                      }
                    }
                  } else {
                    var19 = var19 >> 3;
                    return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                  }
                }
              }
              return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
            } else {
              if (var19 > 255) {
                L18: {
                  var19 = 255;
                  if (0 > var20) {
                    var20 = 0;
                    break L18;
                  } else {
                    if (var20 <= 255) {
                      break L18;
                    } else {
                      var20 = 255;
                      break L18;
                    }
                  }
                }
                L19: {
                  if (243 < var20) {
                    var19 = var19 >> 4;
                    break L19;
                  } else {
                    if (var20 <= 217) {
                      if (192 < var20) {
                        var19 = var19 >> 2;
                        return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                      } else {
                        if (var20 <= 179) {
                          break L19;
                        } else {
                          var19 = var19 >> 1;
                          return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                        }
                      }
                    } else {
                      var19 = var19 >> 3;
                      return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                    }
                  }
                }
                return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
              } else {
                L20: {
                  if (0 > var20) {
                    var20 = 0;
                    break L20;
                  } else {
                    if (var20 <= 255) {
                      break L20;
                    } else {
                      var20 = 255;
                      break L20;
                    }
                  }
                }
                L21: {
                  if (243 < var20) {
                    var19 = var19 >> 4;
                    break L21;
                  } else {
                    if (var20 <= 217) {
                      if (192 < var20) {
                        var19 = var19 >> 2;
                        break L21;
                      } else {
                        if (var20 <= 179) {
                          break L21;
                        } else {
                          var19 = var19 >> 1;
                          break L21;
                        }
                      }
                    } else {
                      var19 = var19 >> 3;
                      break L21;
                    }
                  }
                }
                return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
              }
            }
          } else {
            var12 = var12 / 6.0;
            var18 = (int)(256.0 * var12);
            var19 = (int)(256.0 * var14);
            var20 = (int)(var16 * 256.0);
            if (0 > var19) {
              L22: {
                var19 = 0;
                if (0 > var20) {
                  var20 = 0;
                  break L22;
                } else {
                  if (var20 <= 255) {
                    break L22;
                  } else {
                    L23: {
                      var20 = 255;
                      if (243 < var20) {
                        var19 = var19 >> 4;
                        break L23;
                      } else {
                        if (var20 <= 217) {
                          if (192 < var20) {
                            var19 = var19 >> 2;
                            break L23;
                          } else {
                            if (var20 <= 179) {
                              break L23;
                            } else {
                              var19 = var19 >> 1;
                              break L23;
                            }
                          }
                        } else {
                          var19 = var19 >> 3;
                          break L23;
                        }
                      }
                    }
                    return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                  }
                }
              }
              L24: {
                if (243 < var20) {
                  var19 = var19 >> 4;
                  break L24;
                } else {
                  if (var20 <= 217) {
                    if (192 < var20) {
                      var19 = var19 >> 2;
                      return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                    } else {
                      if (var20 <= 179) {
                        break L24;
                      } else {
                        var19 = var19 >> 1;
                        return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                      }
                    }
                  } else {
                    var19 = var19 >> 3;
                    return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
                  }
                }
              }
              return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
            } else {
              if (var19 > 255) {
                L25: {
                  var19 = 255;
                  if (0 > var20) {
                    var20 = 0;
                    break L25;
                  } else {
                    if (var20 <= 255) {
                      break L25;
                    } else {
                      var20 = 255;
                      break L25;
                    }
                  }
                }
                L26: {
                  if (243 < var20) {
                    var19 = var19 >> 4;
                    break L26;
                  } else {
                    if (var20 <= 217) {
                      if (192 < var20) {
                        var19 = var19 >> 2;
                        break L26;
                      } else {
                        if (var20 <= 179) {
                          break L26;
                        } else {
                          var19 = var19 >> 1;
                          break L26;
                        }
                      }
                    } else {
                      var19 = var19 >> 3;
                      break L26;
                    }
                  }
                }
                return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
              } else {
                L27: {
                  if (0 > var20) {
                    var20 = 0;
                    break L27;
                  } else {
                    if (var20 <= 255) {
                      break L27;
                    } else {
                      var20 = 255;
                      break L27;
                    }
                  }
                }
                L28: {
                  if (243 < var20) {
                    var19 = var19 >> 4;
                    break L28;
                  } else {
                    if (var20 <= 217) {
                      if (192 < var20) {
                        var19 = var19 >> 2;
                        break L28;
                      } else {
                        if (var20 <= 179) {
                          break L28;
                        } else {
                          var19 = var19 >> 1;
                          break L28;
                        }
                      }
                    } else {
                      var19 = var19 >> 3;
                      break L28;
                    }
                  }
                }
                return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) + -(var20 >> 1));
              }
            }
          }
        } else {
          return -33;
        }
    }

    pe(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((pe) this).field_u = param0;
        ((pe) this).field_t = param2;
        ((pe) this).field_y = param1;
        ((pe) this).field_A = param3;
        ((pe) this).field_z = param4;
        ((pe) this).field_m = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Back";
        field_v = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
