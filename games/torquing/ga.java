/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ga extends RuntimeException {
    Throwable field_a;
    String field_b;
    static String[] field_d;
    static int field_c;

    public static void a() {
        field_d = null;
    }

    final static void a(fj param0) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var5 = Torquing.field_u;
            try {
              L0: {
                L1: {
                  L2: {
                    var6 = new byte[24];
                    var2 = var6;
                    if (null != jl.field_W) {
                      try {
                        L3: {
                          jl.field_W.a(false, 0L);
                          jl.field_W.a(-1, var6);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              if (24 <= var3_int) {
                                break L5;
                              } else {
                                if (-1 == var2[var3_int]) {
                                  var3_int++;
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (-25 <= var3_int) {
                              throw new IOException();
                            } else {
                              param0.a(24, 0, var2, (byte) -108);
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L7: while (true) {
                            if (var4 >= 24) {
                              decompiledRegionSelector0 = 1;
                              break L6;
                            } else {
                              var2[var4] = (byte) -1;
                              var4++;
                              continue L7;
                            }
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  param0.a(24, 0, var2, (byte) -108);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) var2_ref;
                stackOut_17_1 = new StringBuilder().append("ga.A(");
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param0 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L8;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L8;
                }
              }
              throw rb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 24 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, hi param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hi var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            if (param1.field_a != null) {
              L1: {
                L2: {
                  if (param1.field_b != 0) {
                    break L2;
                  } else {
                    if (param1.field_k == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (~var2_int <= ~kb.field_b) {
                    break L1;
                  } else {
                    L4: {
                      var3 = hi.field_j[var2_int];
                      if (var3.field_f != 2) {
                        break L4;
                      } else {
                        if (var3.field_b != param1.field_b) {
                          break L4;
                        } else {
                          if (var3.field_k == param1.field_k) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null == param1.field_c) {
                  break L5;
                } else {
                  break L5;
                }
              }
              wc.a(10842, param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("ga.E(").append(false).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    ga(Throwable param0, String param1) {
        ((ga) this).field_b = param1;
        ((ga) this).field_a = param0;
    }

    final static char a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Torquing.field_u;
          var2 = param1;
          if (var2 != 32) {
            if (160 != var2) {
              if (var2 == 95) {
                break L0;
              } else {
                if (var2 == 45) {
                  break L0;
                } else {
                  L1: {
                    if (var2 == 91) {
                      break L1;
                    } else {
                      if (var2 != 93) {
                        if (35 == var2) {
                          break L1;
                        } else {
                          L2: {
                            if (var2 != 224) {
                              if (var2 != 225) {
                                if (var2 != 226) {
                                  if (var2 == 228) {
                                    break L2;
                                  } else {
                                    if (227 != var2) {
                                      if (var2 != 192) {
                                        if (var2 != 193) {
                                          if (var2 != 194) {
                                            if (196 == var2) {
                                              break L2;
                                            } else {
                                              if (var2 != 195) {
                                                L3: {
                                                  if (var2 == 232) {
                                                    break L3;
                                                  } else {
                                                    if (233 != var2) {
                                                      if (var2 == 234) {
                                                        break L3;
                                                      } else {
                                                        if (var2 == 235) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 200) {
                                                            break L3;
                                                          } else {
                                                            if (var2 != 201) {
                                                              if (202 == var2) {
                                                                break L3;
                                                              } else {
                                                                if (203 != var2) {
                                                                  L4: {
                                                                    if (var2 == 237) {
                                                                      break L4;
                                                                    } else {
                                                                      if (var2 != 238) {
                                                                        if (var2 == 239) {
                                                                          break L4;
                                                                        } else {
                                                                          if (var2 == 205) {
                                                                            break L4;
                                                                          } else {
                                                                            if (var2 != 206) {
                                                                              if (var2 != 207) {
                                                                                L5: {
                                                                                  if (var2 != 242) {
                                                                                    if (243 != var2) {
                                                                                      if (var2 != 244) {
                                                                                        if (var2 == 246) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (var2 != 245) {
                                                                                            if (210 == var2) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (var2 != 211) {
                                                                                                if (var2 == 212) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (214 == var2) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (213 != var2) {
                                                                                                      L6: {
                                                                                                        if (var2 == 249) {
                                                                                                          break L6;
                                                                                                        } else {
                                                                                                          if (var2 != 250) {
                                                                                                            if (var2 == 251) {
                                                                                                              break L6;
                                                                                                            } else {
                                                                                                              if (var2 == 252) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (217 != var2) {
                                                                                                                  if (218 == var2) {
                                                                                                                    break L6;
                                                                                                                  } else {
                                                                                                                    if (var2 != 219) {
                                                                                                                      if (var2 == 220) {
                                                                                                                        break L6;
                                                                                                                      } else {
                                                                                                                        L7: {
                                                                                                                          if (var2 != 231) {
                                                                                                                            if (var2 != 199) {
                                                                                                                              L8: {
                                                                                                                                if (var2 == 255) {
                                                                                                                                  break L8;
                                                                                                                                } else {
                                                                                                                                  if (var2 != 376) {
                                                                                                                                    L9: {
                                                                                                                                      if (var2 == 241) {
                                                                                                                                        break L9;
                                                                                                                                      } else {
                                                                                                                                        if (var2 != 209) {
                                                                                                                                          if (var2 == 223) {
                                                                                                                                            return 'b';
                                                                                                                                          } else {
                                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          break L9;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    break L8;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            } else {
                                                                                                                              break L7;
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            break L7;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      break L6;
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L6;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L6;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    } else {
                                                                                                      break L5;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                break L5;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L5;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        break L5;
                                                                                      }
                                                                                    } else {
                                                                                      break L5;
                                                                                    }
                                                                                  } else {
                                                                                    break L5;
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                break L4;
                                                                              }
                                                                            } else {
                                                                              break L4;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L4;
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L3;
                                                    }
                                                  }
                                                }
                                                return 'e';
                                              } else {
                                                break L2;
                                              }
                                            }
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                          return 'a';
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  return param1;
                }
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        return '_';
    }

    final static int a(boolean param0, CharSequence param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var11 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (2 > param3) {
                break L1;
              } else {
                if (param3 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
                      if (var5 != 0) {
                        stackOut_35_0 = var6;
                        stackIn_36_0 = stackOut_35_0;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L3: {
                        L4: {
                          var9 = param1.charAt(var8);
                          if (var8 != 0) {
                            break L4;
                          } else {
                            if (45 != var9) {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (var9 < 48) {
                              break L6;
                            } else {
                              if (var9 > 57) {
                                break L6;
                              } else {
                                var9 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var9 < 65) {
                              break L7;
                            } else {
                              if (90 < var9) {
                                break L7;
                              } else {
                                var9 -= 55;
                                break L5;
                              }
                            }
                          }
                          L8: {
                            if (97 > var9) {
                              break L8;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 >= param3) {
                          throw new NumberFormatException();
                        } else {
                          L9: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10 = var9 + var6 * param3;
                          if (var6 != var10 / param3) {
                            throw new NumberFormatException();
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L3;
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var4;
            stackOut_37_1 = new StringBuilder().append("ga.C(").append(false).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L10;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + true + ',' + param3 + ')');
        }
        return stackIn_36_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"<col=2>Standard.</col> Not at all bouncy; good grip.", "<col=2>Very bouncy.</col> You will bounce off it at the same speed you hit it.", "<col=2>Icy.</col> Unless you have spikes, this surface has no grip at all.", "<col=2>Fairly bouncy.</col> You will bounce a little when you hit it.", "<col=2>Polished.</col> Has less grip than most surfaces.", "<col=2>Insanely bouncy.</col> You will bounce off it faster than you hit it."};
    }
}
