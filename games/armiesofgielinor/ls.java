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
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = param3;
          var6 = param2;
          var7 = param0;
          if (param1 == 7) {
            L1: {
              if (-12 == (param3 ^ -1)) {
                var5 = 7;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-12 == (param2 ^ -1)) {
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
          if (-5 != (param1 ^ -1)) {
            break L3;
          } else {
            L4: {
              L5: {
                if (param3 == 2) {
                  break L5;
                } else {
                  if ((param3 ^ -1) != -10) {
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
                if (-3 == (param0 ^ -1)) {
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
              if ((param2 ^ -1) == -3) {
                break L8;
              } else {
                if ((param2 ^ -1) != -10) {
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
                if (-5 == (param2 ^ -1)) {
                  break L11;
                } else {
                  if (-10 == (param2 ^ -1)) {
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
          if ((param1 ^ -1) == -2) {
            L16: {
              if ((param2 ^ -1) != -10) {
                break L16;
              } else {
                var6 = 1;
                break L16;
              }
            }
            L17: {
              if (-10 != (param0 ^ -1)) {
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
            if (param1 != var6) {
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
                  if (-5 == (var8 ^ -1)) {
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
                    if ((param2 ^ -1) == -3) {
                      break L24;
                    } else {
                      if (-10 == (param3 ^ -1)) {
                        break L24;
                      } else {
                        if ((param2 ^ -1) == -10) {
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
                    if (-3 == (param3 ^ -1)) {
                      break L27;
                    } else {
                      if ((param3 ^ -1) == -10) {
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
                    if ((param2 ^ -1) == -10) {
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
        ru stackIn_5_0 = null;
        ru stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (kp.a(false, param2, param1, param0)) {
              if (param3 <= -2) {
                stackIn_7_0 = rr.b(0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (ru) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ls.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(vh param0, int param1, java.math.BigInteger param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
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
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (-5 >= (var9 ^ -1)) {
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
                      sb.field_h.a((byte) 31, var13);
                      if (ArmiesOfGielinor.field_L == null) {
                        break L6;
                      } else {
                        if ((ArmiesOfGielinor.field_L.field_o.length ^ -1) > -101) {
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
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      ArmiesOfGielinor.field_L.a((byte) -111, var13[var11]);
                      var11++;
                      continue L7;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
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
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("ls.D(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param6 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 > -114) {
            return;
        }
        field_c = null;
    }

    static {
        field_c = new int[8192];
        field_d = "If you do nothing the game will revert to normal view once the timer reaches 0.";
    }
}
