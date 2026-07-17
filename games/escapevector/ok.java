/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static int field_a;
    static byte[][] field_d;
    static int field_c;
    static boolean[] field_b;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        if (0 <= kb.field_d) {
          L0: {
            var3 = -135 + param1;
            var4 = -35 + param0;
            var5 = 256;
            if (kb.field_d >= 75) {
              break L0;
            } else {
              var5 = (kb.field_d << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (kb.field_d > 200) {
              var5 = (-kb.field_d + 250 << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          if (param2 == 20) {
            L2: {
              eo.a(am.field_l, (byte) -107);
              bi.b();
              em.d();
              fi.a(-111);
              if (var5 < 256) {
                em.a(0, 0, em.field_l, em.field_d, 0, 256 - var5);
                break L2;
              } else {
                break L2;
              }
            }
            dl.a((byte) 116);
            if (kb.field_d >= 150) {
              L3: {
                cb.field_a.d(15 + var3, var4 + 10, var5);
                var6 = -125 + kb.field_d;
                if (var6 <= 0) {
                  break L3;
                } else {
                  if (var6 >= 50) {
                    break L3;
                  } else {
                    if (var6 < 20) {
                      var7 = var6 * 256 / 20;
                      ea.field_d.c(var3, var4, var7);
                      break L3;
                    } else {
                      if (30 <= var6) {
                        L4: {
                          var7 = 256 * (50 + -var6) / 20;
                          ea.field_d.c(var3, var4, var7);
                          var6 = kb.field_d + -140;
                          if (0 >= var6) {
                            break L4;
                          } else {
                            L5: {
                              var7 = 256;
                              if (var6 < 20) {
                                var7 = 256 * var6 / 20;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                            break L4;
                          }
                        }
                        return;
                      } else {
                        L6: {
                          ea.field_d.c(var3, var4, 256);
                          var6 = kb.field_d + -140;
                          if (0 >= var6) {
                            break L6;
                          } else {
                            L7: {
                              var7 = 256;
                              if (var6 < 20) {
                                var7 = 256 * var6 / 20;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                            break L6;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              L8: {
                var6 = kb.field_d + -140;
                if (0 >= var6) {
                  break L8;
                } else {
                  L9: {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                  break L8;
                }
              }
              return;
            } else {
              am.field_l.g(var3, var4);
              var6 = -125 + kb.field_d;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 < 20) {
                    L10: {
                      var7 = var6 * 256 / 20;
                      ea.field_d.c(var3, var4, var7);
                      var6 = kb.field_d + -140;
                      if (0 >= var6) {
                        break L10;
                      } else {
                        L11: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L10;
                      }
                    }
                    return;
                  } else {
                    if (30 <= var6) {
                      L12: {
                        var7 = 256 * (50 + -var6) / 20;
                        ea.field_d.c(var3, var4, var7);
                        var6 = kb.field_d + -140;
                        if (0 >= var6) {
                          break L12;
                        } else {
                          L13: {
                            var7 = 256;
                            if (var6 < 20) {
                              var7 = 256 * var6 / 20;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                          break L12;
                        }
                      }
                      return;
                    } else {
                      L14: {
                        ea.field_d.c(var3, var4, 256);
                        var6 = kb.field_d + -140;
                        if (0 >= var6) {
                          break L14;
                        } else {
                          L15: {
                            var7 = 256;
                            if (var6 < 20) {
                              var7 = 256 * var6 / 20;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                          break L14;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L16: {
                    var6 = kb.field_d + -140;
                    if (0 >= var6) {
                      break L16;
                    } else {
                      L17: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L16;
                    }
                  }
                  return;
                }
              } else {
                L18: {
                  var6 = kb.field_d + -140;
                  if (0 >= var6) {
                    break L18;
                  } else {
                    L19: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L18;
                  }
                }
                return;
              }
            }
          } else {
            L20: {
              field_c = -87;
              eo.a(am.field_l, (byte) -107);
              bi.b();
              em.d();
              fi.a(-111);
              if (var5 < 256) {
                em.a(0, 0, em.field_l, em.field_d, 0, 256 - var5);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              dl.a((byte) 116);
              if (kb.field_d >= 150) {
                cb.field_a.d(15 + var3, var4 + 10, var5);
                break L21;
              } else {
                am.field_l.g(var3, var4);
                break L21;
              }
            }
            var6 = -125 + kb.field_d;
            if (var6 > 0) {
              if (var6 < 50) {
                if (var6 < 20) {
                  L22: {
                    var7 = var6 * 256 / 20;
                    ea.field_d.c(var3, var4, var7);
                    var6 = kb.field_d + -140;
                    if (0 >= var6) {
                      break L22;
                    } else {
                      L23: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L22;
                    }
                  }
                  return;
                } else {
                  if (30 <= var6) {
                    L24: {
                      var7 = 256 * (50 + -var6) / 20;
                      ea.field_d.c(var3, var4, var7);
                      var6 = kb.field_d + -140;
                      if (0 >= var6) {
                        break L24;
                      } else {
                        L25: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L24;
                      }
                    }
                    return;
                  } else {
                    L26: {
                      ea.field_d.c(var3, var4, 256);
                      var6 = kb.field_d + -140;
                      if (0 >= var6) {
                        break L26;
                      } else {
                        L27: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L26;
                      }
                    }
                    return;
                  }
                }
              } else {
                L28: {
                  var6 = kb.field_d + -140;
                  if (0 >= var6) {
                    break L28;
                  } else {
                    L29: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L28;
                  }
                }
                return;
              }
            } else {
              L30: {
                var6 = kb.field_d + -140;
                if (0 >= var6) {
                  break L30;
                } else {
                  L31: {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                  break L30;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            stackOut_2_0 = mf.a(true, false, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ok.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new byte[250][];
        field_c = 64;
        field_b = new boolean[]{true, true, true, true};
    }
}
