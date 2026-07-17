/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static int field_a;
    static byte[][] field_d;
    static int field_c;
    static boolean[] field_b;

    final static void a() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        if (0 <= kb.field_d) {
          L0: {
            var3 = 185;
            var4 = 205;
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
            cb.field_a.d(15 + var3, var4 + 10, var5);
            var6 = -125 + kb.field_d;
            if (var6 > 0) {
              if (var6 < 50) {
                if (var6 < 20) {
                  L3: {
                    var7 = var6 * 256 / 20;
                    ea.field_d.c(var3, var4, var7);
                    var6 = kb.field_d + -140;
                    if (0 >= var6) {
                      break L3;
                    } else {
                      L4: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L3;
                    }
                  }
                  return;
                } else {
                  if (30 <= var6) {
                    L5: {
                      var7 = 256 * (50 + -var6) / 20;
                      ea.field_d.c(var3, var4, var7);
                      var6 = kb.field_d + -140;
                      if (0 >= var6) {
                        break L5;
                      } else {
                        L6: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L5;
                      }
                    }
                    return;
                  } else {
                    L7: {
                      ea.field_d.c(var3, var4, 256);
                      var6 = kb.field_d + -140;
                      if (0 >= var6) {
                        break L7;
                      } else {
                        L8: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L7;
                      }
                    }
                    return;
                  }
                }
              } else {
                L9: {
                  var6 = kb.field_d + -140;
                  if (0 >= var6) {
                    break L9;
                  } else {
                    L10: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L9;
                  }
                }
                return;
              }
            } else {
              L11: {
                var6 = kb.field_d + -140;
                if (0 >= var6) {
                  break L11;
                } else {
                  L12: {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                  break L11;
                }
              }
              return;
            }
          } else {
            am.field_l.g(var3, var4);
            var6 = -125 + kb.field_d;
            if (var6 > 0) {
              if (var6 < 50) {
                if (var6 < 20) {
                  L13: {
                    var7 = var6 * 256 / 20;
                    ea.field_d.c(var3, var4, var7);
                    var6 = kb.field_d + -140;
                    if (0 >= var6) {
                      break L13;
                    } else {
                      L14: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L13;
                    }
                  }
                  return;
                } else {
                  if (30 <= var6) {
                    L15: {
                      var7 = 256 * (50 + -var6) / 20;
                      ea.field_d.c(var3, var4, var7);
                      var6 = kb.field_d + -140;
                      if (0 >= var6) {
                        break L15;
                      } else {
                        L16: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L15;
                      }
                    }
                    return;
                  } else {
                    L17: {
                      ea.field_d.c(var3, var4, 256);
                      var6 = kb.field_d + -140;
                      if (0 >= var6) {
                        break L17;
                      } else {
                        L18: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L17;
                      }
                    }
                    return;
                  }
                }
              } else {
                L19: {
                  var6 = kb.field_d + -140;
                  if (0 >= var6) {
                    break L19;
                  } else {
                    L20: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L19;
                  }
                }
                return;
              }
            } else {
              L21: {
                var6 = kb.field_d + -140;
                if (0 >= var6) {
                  break L21;
                } else {
                  L22: {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  s.field_G.d(15 + var3, 10 + var4, var5 * var7 >> 8);
                  break L21;
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
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = mf.a(true, false, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ok.B(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
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
