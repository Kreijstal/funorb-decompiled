/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls {
    int field_e;
    int field_a;
    int field_b;
    static int[] field_c;
    static String field_d;
    int field_f;

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = param3;
          var6 = param2;
          var7 = param0;
          if (param1 == 7) {
            L1: {
              if (param3 == 11) {
                var5 = 7;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 11) {
                var6 = 7;
                break L2;
              } else {
                break L2;
              }
            }
            if (11 == param0) {
              var7 = 7;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param1 != 4) {
            break L3;
          } else {
            L4: {
              L5: {
                if (param3 == 2) {
                  break L5;
                } else {
                  if (param3 != 9) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var5 = 4;
              break L4;
            }
            L6: {
              L7: {
                if (param0 == 2) {
                  break L7;
                } else {
                  if (param0 != 9) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var7 = 4;
              break L6;
            }
            L8: {
              if (param2 == 2) {
                break L8;
              } else {
                if (param2 != 9) {
                  break L3;
                } else {
                  break L8;
                }
              }
            }
            var6 = 4;
            break L3;
          }
        }
        L9: {
          if (param1 != 2) {
            break L9;
          } else {
            L10: {
              L11: {
                if (param2 == 4) {
                  break L11;
                } else {
                  if (param2 == 9) {
                    break L11;
                  } else {
                    break L10;
                  }
                }
              }
              var6 = 2;
              break L10;
            }
            L12: {
              L13: {
                if (param3 == 4) {
                  break L13;
                } else {
                  if (9 == param3) {
                    break L13;
                  } else {
                    break L12;
                  }
                }
              }
              var5 = 2;
              break L12;
            }
            L14: {
              if (4 == param0) {
                break L14;
              } else {
                if (param0 == 9) {
                  break L14;
                } else {
                  break L9;
                }
              }
            }
            var7 = 2;
            break L9;
          }
        }
        L15: {
          if (param1 == 1) {
            L16: {
              if (param2 != 9) {
                break L16;
              } else {
                var6 = 1;
                break L16;
              }
            }
            L17: {
              if (param0 != 9) {
                break L17;
              } else {
                var7 = 1;
                break L17;
              }
            }
            if (9 == param3) {
              var5 = 1;
              break L15;
            } else {
              break L15;
            }
          } else {
            break L15;
          }
        }
        if (param4 <= -3) {
          L18: {
            var8 = 0;
            if (var5 == param1) {
              var8++;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            if (~param1 != ~var6) {
              break L19;
            } else {
              var8 += 2;
              break L19;
            }
          }
          L20: {
            if (3 != var8) {
              break L20;
            } else {
              if (var7 == param1) {
                var8++;
                break L20;
              } else {
                break L20;
              }
            }
          }
          L21: {
            var8 = var8 * 4;
            if (param1 != 4) {
              break L21;
            } else {
              L22: {
                L23: {
                  if (var8 == 4) {
                    break L23;
                  } else {
                    if (8 != var8) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                L24: {
                  if (param3 == 2) {
                    break L24;
                  } else {
                    if (param2 == 2) {
                      break L24;
                    } else {
                      if (param3 == 9) {
                        break L24;
                      } else {
                        if (param2 == 9) {
                          break L24;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                }
                var8 += 48;
                break L22;
              }
              if (12 != var8) {
                break L21;
              } else {
                L25: {
                  if (param3 == 2) {
                    break L25;
                  } else {
                    if (param2 == 2) {
                      break L25;
                    } else {
                      if (param3 == 9) {
                        break L25;
                      } else {
                        if (9 != param2) {
                          break L21;
                        } else {
                          break L25;
                        }
                      }
                    }
                  }
                }
                L26: {
                  L27: {
                    var8 += 24;
                    if (param3 == 2) {
                      break L27;
                    } else {
                      if (param3 == 9) {
                        break L27;
                      } else {
                        break L26;
                      }
                    }
                  }
                  var8 += 8;
                  break L26;
                }
                L28: {
                  if (param2 == 2) {
                    break L28;
                  } else {
                    if (param2 == 9) {
                      break L28;
                    } else {
                      break L21;
                    }
                  }
                }
                var8 += 4;
                break L21;
              }
            }
          }
          return var8;
        } else {
          return -51;
        }
    }

    final static ru a(int param0, kl param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          if (kp.a(false, param2, param1, param0)) {
            return rr.b(0);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ls.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + -80 + 41);
        }
    }

    final static void a(vh param0, int param1, java.math.BigInteger param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = jq.b(7, param4);
              if (dt.field_b != null) {
                break L1;
              } else {
                dt.field_b = new java.security.SecureRandom();
                break L1;
              }
            }
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                L3: {
                  L4: {
                    if (null == sb.field_h) {
                      break L4;
                    } else {
                      if (sb.field_h.field_o.length >= var7_int) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  sb.field_h = new vh(var7_int);
                  break L3;
                }
                if (param3 == 6727) {
                  L5: {
                    L6: {
                      sb.field_h.field_q = 0;
                      sb.field_h.a(param6, param1, param4, param3 + -6621);
                      sb.field_h.b(var7_int, (byte) 100);
                      sb.field_h.a((byte) 31, var15);
                      if (ArmiesOfGielinor.field_L == null) {
                        break L6;
                      } else {
                        if (ArmiesOfGielinor.field_L.field_o.length < 100) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ArmiesOfGielinor.field_L = new vh(100);
                    break L5;
                  }
                  ArmiesOfGielinor.field_L.field_q = 0;
                  ArmiesOfGielinor.field_L.b(1, 10);
                  var11 = 0;
                  var9 = var11;
                  L7: while (true) {
                    if (var11 >= 4) {
                      ArmiesOfGielinor.field_L.b(true, param4);
                      ArmiesOfGielinor.field_L.a(-5247, param5, param2);
                      param0.a(ArmiesOfGielinor.field_L.field_o, 0, ArmiesOfGielinor.field_L.field_q, 99);
                      param0.a(sb.field_h.field_o, 0, sb.field_h.field_q, 109);
                      break L0;
                    } else {
                      ArmiesOfGielinor.field_L.a((byte) -111, var15[var11]);
                      var11++;
                      continue L7;
                    }
                  }
                } else {
                  return;
                }
              } else {
                var8[var9] = dt.field_b.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var7;
            stackOut_21_1 = new StringBuilder().append("ls.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param6 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_d = "If you do nothing the game will revert to normal view once the timer reaches 0.";
    }
}
