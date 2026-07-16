/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ga extends RuntimeException {
    Throwable field_a;
    String field_b;
    static String[] field_d;
    static int field_c;

    public static void a(int param0) {
        field_d = null;
        if (param0 != 2712) {
            field_c = -7;
        }
    }

    final static void a(fj param0, int param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              L1: {
                var5 = Torquing.field_u;
                var6 = new byte[param1];
                var2 = var6;
                if (null != jl.field_W) {
                  try {
                    L2: {
                      jl.field_W.a(false, 0L);
                      jl.field_W.a(-1, var6);
                      var3_int = 0;
                      L3: while (true) {
                        L4: {
                          if (24 <= var3_int) {
                            break L4;
                          } else {
                            if (-1 == (var2[var3_int] ^ -1)) {
                              var3_int++;
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (-25 >= (var3_int ^ -1)) {
                          throw new IOException();
                        } else {
                          param0.a(24, 0, var2, (byte) -108);
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      var4 = 0;
                      L6: while (true) {
                        if (var4 >= 24) {
                          decompiledRegionSelector0 = 1;
                          break L5;
                        } else {
                          var2[var4] = (byte)-1;
                          var4++;
                          continue L6;
                        }
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              param0.a(24, 0, var2, (byte) -108);
              break L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, hi param1) {
        int var2 = 0;
        hi var3 = null;
        int var4 = 0;
        var4 = Torquing.field_u;
        if (param1.field_a != null) {
          L0: {
            L1: {
              if (param1.field_b != 0) {
                break L1;
              } else {
                if ((param1.field_k ^ -1) == -1) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if ((var2 ^ -1) <= (kb.field_b ^ -1)) {
                break L0;
              } else {
                L3: {
                  var3 = hi.field_j[var2];
                  if (-3 != (var3.field_f ^ -1)) {
                    break L3;
                  } else {
                    if (var3.field_b != param1.field_b) {
                      break L3;
                    } else {
                      if (var3.field_k == param1.field_k) {
                        return;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2++;
                continue L2;
              }
            }
          }
          L4: {
            if (!param0) {
              break L4;
            } else {
              field_d = null;
              break L4;
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
          return;
        } else {
          return;
        }
    }

    ga(Throwable param0, String param1) {
        ((ga) this).field_b = param1;
        ((ga) this).field_a = param0;
    }

    final static char a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Torquing.field_u;
        if (param0 == 63) {
          L0: {
            var2 = param1;
            if (-33 != (var2 ^ -1)) {
              if (160 != var2) {
                if ((var2 ^ -1) == -96) {
                  break L0;
                } else {
                  if (-46 == (var2 ^ -1)) {
                    break L0;
                  } else {
                    L1: {
                      if (-92 == (var2 ^ -1)) {
                        break L1;
                      } else {
                        if (var2 != 93) {
                          if (35 == var2) {
                            break L1;
                          } else {
                            L2: {
                              if (var2 != 224) {
                                if ((var2 ^ -1) != -226) {
                                  if (var2 != 226) {
                                    if ((var2 ^ -1) == -229) {
                                      break L2;
                                    } else {
                                      if (227 != var2) {
                                        if ((var2 ^ -1) != -193) {
                                          if (-194 != (var2 ^ -1)) {
                                            if (-195 != (var2 ^ -1)) {
                                              if (196 == var2) {
                                                break L2;
                                              } else {
                                                if (-196 != (var2 ^ -1)) {
                                                  L3: {
                                                    if (var2 == 232) {
                                                      break L3;
                                                    } else {
                                                      if (233 != var2) {
                                                        if (-235 == (var2 ^ -1)) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (-201 == (var2 ^ -1)) {
                                                              break L3;
                                                            } else {
                                                              if (var2 != 201) {
                                                                if (202 == var2) {
                                                                  break L3;
                                                                } else {
                                                                  if (203 != var2) {
                                                                    L4: {
                                                                      if ((var2 ^ -1) == -238) {
                                                                        break L4;
                                                                      } else {
                                                                        if (var2 != 238) {
                                                                          if (-240 == (var2 ^ -1)) {
                                                                            break L4;
                                                                          } else {
                                                                            if ((var2 ^ -1) == -206) {
                                                                              break L4;
                                                                            } else {
                                                                              if (var2 != 206) {
                                                                                if (-208 != (var2 ^ -1)) {
                                                                                  L5: {
                                                                                    if (var2 != 242) {
                                                                                      if (243 != var2) {
                                                                                        if (-245 != (var2 ^ -1)) {
                                                                                          if (-247 == (var2 ^ -1)) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (-246 != (var2 ^ -1)) {
                                                                                              if (210 == var2) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if ((var2 ^ -1) != -212) {
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
                                                                                                                if ((var2 ^ -1) == -253) {
                                                                                                                  break L6;
                                                                                                                } else {
                                                                                                                  if (217 != var2) {
                                                                                                                    if (218 == var2) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (-220 != (var2 ^ -1)) {
                                                                                                                        if ((var2 ^ -1) == -221) {
                                                                                                                          break L6;
                                                                                                                        } else {
                                                                                                                          L7: {
                                                                                                                            if (-232 != (var2 ^ -1)) {
                                                                                                                              if (var2 != 199) {
                                                                                                                                L8: {
                                                                                                                                  if (-256 == (var2 ^ -1)) {
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
        } else {
          return 'ﾮ';
        }
    }

    final static int a(boolean param0, CharSequence param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Torquing.field_u;
          if (2 > param3) {
            break L0;
          } else {
            if (-37 <= (param3 ^ -1)) {
              var4 = param0 ? 1 : 0;
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L1: while (true) {
                if ((var7 ^ -1) >= (var8 ^ -1)) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L2: {
                    L3: {
                      var9 = param1.charAt(var8);
                      if (-1 != (var8 ^ -1)) {
                        break L3;
                      } else {
                        if (45 != var9) {
                          if (var9 != 43) {
                            break L3;
                          } else {
                            if (param2) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          var4 = 1;
                          break L2;
                        }
                      }
                    }
                    L4: {
                      L5: {
                        if (var9 < 48) {
                          break L5;
                        } else {
                          if (var9 > 57) {
                            break L5;
                          } else {
                            var9 -= 48;
                            break L4;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 65) {
                          break L6;
                        } else {
                          if (90 < var9) {
                            break L6;
                          } else {
                            var9 -= 55;
                            break L4;
                          }
                        }
                      }
                      L7: {
                        if (97 > var9) {
                          break L7;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (var9 >= param3) {
                      throw new NumberFormatException();
                    } else {
                      L8: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var10 = var9 + var6 * param3;
                      if (var6 != var10 / param3) {
                        throw new NumberFormatException();
                      } else {
                        var6 = var10;
                        var5 = 1;
                        break L2;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"<col=2>Standard.</col> Not at all bouncy; good grip.", "<col=2>Very bouncy.</col> You will bounce off it at the same speed you hit it.", "<col=2>Icy.</col> Unless you have spikes, this surface has no grip at all.", "<col=2>Fairly bouncy.</col> You will bounce a little when you hit it.", "<col=2>Polished.</col> Has less grip than most surfaces.", "<col=2>Insanely bouncy.</col> You will bounce off it faster than you hit it."};
    }
}
