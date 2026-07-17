/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ul {
    static boolean field_a;
    static boolean field_m;
    static int field_d;
    static String field_j;
    static String field_f;
    private boolean[] field_c;
    private int field_b;
    private ha field_h;
    private ne[] field_k;
    private int field_l;
    private int field_e;
    private int field_n;
    static String field_o;
    private int field_i;
    static wk field_g;

    final static void a(int param0) {
        bm.field_D = new rg(170, or.field_j, ck.field_d, new rg[3]);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        L0: {
          L1: {
            var8 = el.field_d * 30;
            if (param3 != 0) {
              break L1;
            } else {
              if (var8 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (param6 < param2) {
            break L0;
          } else {
            if (param4 >= param1 + param6) {
              break L0;
            } else {
              if (param4 < param7) {
                break L0;
              } else {
                if (param4 >= param7 + param5) {
                  break L0;
                } else {
                  L2: {
                    if (param4 - param7 < 44) {
                      break L2;
                    } else {
                      if (var8 >= 0) {
                        L3: {
                          if (-4 + (-40 + param5) < -param7 + param4) {
                            break L3;
                          } else {
                            if (var8 <= 0) {
                              dk.a(-28309, true);
                              var9 = -56 % ((-5 - param0) / 50);
                              return;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          kb.field_n = kb.field_n + 1;
                          if (var8 > 0) {
                            kb.field_n = kb.field_n + var8;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (15 >= kb.field_n) {
                            break L5;
                          } else {
                            kb.field_n = 15;
                            break L5;
                          }
                        }
                        dk.a(-28309, false);
                        return;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L6: {
                    kb.field_n = kb.field_n - 1;
                    if (var8 < 0) {
                      kb.field_n = kb.field_n + var8;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (kb.field_n >= -15) {
                      break L7;
                    } else {
                      kb.field_n = -15;
                      break L7;
                    }
                  }
                  dk.a(-28309, false);
                  return;
                }
              }
            }
          }
        }
        dk.a(-28309, true);
    }

    final static void a(byte param0, String param1, at param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              fq.a(param2, param1, 0, false);
              if (param0 == -80) {
                break L1;
              } else {
                field_m = true;
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
            stackOut_3_1 = new StringBuilder().append("ul.E(").append(param0).append(44);
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        param0 = 15 + (-((ul) this).field_i + param0);
        param2 = param2 - ((ul) this).field_b - -15;
        if (param1 == 112) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (param2 < 0) {
                break L0;
              } else {
                if (param0 > 30) {
                  break L0;
                } else {
                  if (param2 <= 30) {
                    return ((ul) this).field_c[param0 - -(30 * param2)];
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    public static void b(int param0) {
        field_o = null;
        field_g = null;
        if (param0 != 30) {
            return;
        }
        field_f = null;
        field_j = null;
    }

    final boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, byte param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a((byte) -104);
        ((ul) this).field_n = param4;
        ((ul) this).field_b = param0;
        ((ul) this).field_i = param2;
        var9 = 77 / ((param6 - -50) / 62);
        var10 = ((ul) this).field_n;
        L0: while (true) {
          if (var10 < 0) {
            var8 = this.a(param1, (byte) 112, param5) ? 1 : 0;
            return var8 != 0;
          } else {
            var11 = -var10;
            L1: while (true) {
              if (var10 <= var11) {
                var10--;
                continue L0;
              } else {
                var12 = var10 - -Math.abs(var11);
                if (param4 >= var12) {
                  L2: {
                    if (-1 >= ((ul) this).field_i + var11) {
                      break L2;
                    } else {
                      if (((ul) this).field_e <= ((ul) this).field_i + var11) {
                        break L2;
                      } else {
                        if (((ul) this).field_b + var10 <= -1) {
                          break L2;
                        } else {
                          if (var10 + ((ul) this).field_b < ((ul) this).field_l) {
                            this.a(25, var10, ((ul) this).field_b, var11, ((ul) this).field_i, param3);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  L3: {
                    if (((ul) this).field_i + -var11 <= -1) {
                      break L3;
                    } else {
                      if (-var11 + ((ul) this).field_i >= ((ul) this).field_e) {
                        break L3;
                      } else {
                        if (-var10 + ((ul) this).field_b <= -1) {
                          break L3;
                        } else {
                          if (((ul) this).field_b + -var10 >= ((ul) this).field_l) {
                            break L3;
                          } else {
                            this.a(25, -var10, ((ul) this).field_b, -var11, ((ul) this).field_i, param3);
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    if (-var10 + ((ul) this).field_i <= -1) {
                      break L4;
                    } else {
                      if (((ul) this).field_i + -var10 >= ((ul) this).field_e) {
                        break L4;
                      } else {
                        if (((ul) this).field_b - -var11 <= -1) {
                          break L4;
                        } else {
                          if (var11 + ((ul) this).field_b < ((ul) this).field_l) {
                            this.a(25, var11, ((ul) this).field_b, -var10, ((ul) this).field_i, param3);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (var10 + ((ul) this).field_i > -1) {
                    if (((ul) this).field_e > ((ul) this).field_i + var10) {
                      if (-1 < ((ul) this).field_b + -var11) {
                        if (((ul) this).field_l > -var11 + ((ul) this).field_b) {
                          this.a(25, -var11, ((ul) this).field_b, var10, ((ul) this).field_i, param3);
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        var11++;
                        continue L1;
                      }
                    } else {
                      var11++;
                      continue L1;
                    }
                  } else {
                    var11++;
                    continue L1;
                  }
                } else {
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, boolean param6, int[] param7, int param8, int param9, boolean param10, int[] param11, int param12, int param13) {
        RuntimeException var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                ((ul) this).field_i = 124;
                break L1;
              }
            }
            var15_int = param13;
            L2: while (true) {
              if (var15_int > param4) {
                break L0;
              } else {
                var16 = param3;
                L3: while (true) {
                  if (param9 < var16) {
                    var15_int++;
                    continue L2;
                  } else {
                    L4: {
                      var17 = param7[((ul) this).field_e * var15_int + var16];
                      if (var17 <= param12) {
                        L5: {
                          if (var17 != 0) {
                            stackOut_11_0 = 6;
                            stackIn_12_0 = stackOut_11_0;
                            break L5;
                          } else {
                            stackOut_10_0 = 7;
                            stackIn_12_0 = stackOut_10_0;
                            break L5;
                          }
                        }
                        var18 = stackIn_12_0;
                        this.a((byte) -108);
                        ((ul) this).field_i = var16;
                        ((ul) this).field_n = param8;
                        ((ul) this).field_b = var15_int;
                        var19 = ((ul) this).field_n;
                        L6: while (true) {
                          if (var19 < 0) {
                            break L4;
                          } else {
                            var20 = -var19;
                            L7: while (true) {
                              if (var20 >= var19) {
                                var19--;
                                continue L6;
                              } else {
                                L8: {
                                  var21 = var19 - -Math.abs(var20);
                                  if (param0 <= var21) {
                                    if (var21 > param8) {
                                      break L8;
                                    } else {
                                      L9: {
                                        if (((ul) this).field_i - -var20 <= -1) {
                                          break L9;
                                        } else {
                                          if (((ul) this).field_e <= ((ul) this).field_i - -var20) {
                                            break L9;
                                          } else {
                                            if (((ul) this).field_b - -var19 <= -1) {
                                              break L9;
                                            } else {
                                              if (((ul) this).field_l <= var19 + ((ul) this).field_b) {
                                                break L9;
                                              } else {
                                                L10: {
                                                  if (7 == var18) {
                                                    break L10;
                                                  } else {
                                                    if (param11[(var19 + ((ul) this).field_b) * ((ul) this).field_e + var20 + ((ul) this).field_i] != 0) {
                                                      break L9;
                                                    } else {
                                                      break L10;
                                                    }
                                                  }
                                                }
                                                this.a(25, var19, ((ul) this).field_b, var20, ((ul) this).field_i, param10);
                                                param11[var20 + (((ul) this).field_i + (var19 + ((ul) this).field_b) * ((ul) this).field_e)] = oe.c(param11[var20 + (((ul) this).field_i + (var19 + ((ul) this).field_b) * ((ul) this).field_e)], rn.a(this.a((byte) 114, param5, ((ul) this).field_b + var19, param6, var20 + ((ul) this).field_i, var21, param10, param1), var18));
                                                break L9;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L11: {
                                        if (-var20 + ((ul) this).field_i >= 0) {
                                          break L11;
                                        } else {
                                          if (((ul) this).field_e <= -var20 + ((ul) this).field_i) {
                                            break L11;
                                          } else {
                                            if (0 >= ((ul) this).field_b + -var19) {
                                              break L11;
                                            } else {
                                              if (((ul) this).field_b - var19 >= ((ul) this).field_l) {
                                                break L11;
                                              } else {
                                                L12: {
                                                  if (7 == var18) {
                                                    break L12;
                                                  } else {
                                                    if (param11[(-var19 + ((ul) this).field_b) * ((ul) this).field_e + (-var20 + ((ul) this).field_i)] != 0) {
                                                      break L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                                this.a(param2 + 26, -var19, ((ul) this).field_b, -var20, ((ul) this).field_i, param10);
                                                param11[((ul) this).field_i - var20 + (-var19 + ((ul) this).field_b) * ((ul) this).field_e] = oe.c(param11[((ul) this).field_i - var20 + (-var19 + ((ul) this).field_b) * ((ul) this).field_e], rn.a(this.a((byte) 114, param5, -var19 + ((ul) this).field_b, param6, -var20 + ((ul) this).field_i, var21, param10, param1), var18));
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L13: {
                                        if (-var19 + ((ul) this).field_i <= -1) {
                                          break L13;
                                        } else {
                                          if (((ul) this).field_e <= -var19 + ((ul) this).field_i) {
                                            break L13;
                                          } else {
                                            if (((ul) this).field_b - -var20 <= -1) {
                                              break L13;
                                            } else {
                                              if (((ul) this).field_b - -var20 < ((ul) this).field_l) {
                                                L14: {
                                                  if (7 == var18) {
                                                    break L14;
                                                  } else {
                                                    if (param11[-var19 + ((ul) this).field_i - -((var20 + ((ul) this).field_b) * ((ul) this).field_e)] != 0) {
                                                      break L13;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                this.a(param2 + 26, var20, ((ul) this).field_b, -var19, ((ul) this).field_i, param10);
                                                param11[((ul) this).field_i - var19 + ((ul) this).field_e * (var20 + ((ul) this).field_b)] = oe.c(param11[((ul) this).field_i - var19 + ((ul) this).field_e * (var20 + ((ul) this).field_b)], rn.a(var18, this.a((byte) 114, param5, ((ul) this).field_b + var20, param6, ((ul) this).field_i - var19, var21, param10, param1)));
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (((ul) this).field_i - -var19 <= -1) {
                                        break L8;
                                      } else {
                                        if (((ul) this).field_e <= ((ul) this).field_i - -var19) {
                                          break L8;
                                        } else {
                                          if (((ul) this).field_b + -var20 <= -1) {
                                            break L8;
                                          } else {
                                            if (-var20 + ((ul) this).field_b < ((ul) this).field_l) {
                                              L15: {
                                                if (var18 == 7) {
                                                  break L15;
                                                } else {
                                                  if (param11[var19 + (((ul) this).field_i + (((ul) this).field_b + -var20) * ((ul) this).field_e)] != 0) {
                                                    break L8;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              this.a(param2 + 26, -var20, ((ul) this).field_b, var19, ((ul) this).field_i, param10);
                                              param11[(((ul) this).field_b + -var20) * ((ul) this).field_e + var19 + ((ul) this).field_i] = oe.c(param11[(((ul) this).field_b + -var20) * ((ul) this).field_e + var19 + ((ul) this).field_i], rn.a(var18, this.a((byte) 114, param5, -var20 + ((ul) this).field_b, param6, ((ul) this).field_i + var19, var21, param10, param1)));
                                              break L8;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                                var20++;
                                continue L7;
                              }
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var16++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var15 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var15;
            stackOut_58_1 = new StringBuilder().append("ul.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param7 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L16;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L16;
            }
          }
          L17: {
            stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(44).append(param8).append(44).append(param9).append(44).append(param10).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param11 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L17;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L17;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 44 + param12 + 44 + param13 + 41);
        }
    }

    private final int a(byte param0, int param1, int param2, boolean param3, int param4, int param5, boolean param6, boolean param7) {
        int var9 = 0;
        jd var10 = null;
        L0: {
          if (param0 == 114) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        if (!this.a(param4, (byte) 112, param2)) {
          return 0;
        } else {
          L1: {
            if (param5 <= 1) {
              break L1;
            } else {
              if (0 == (2 & ((ul) this).field_h.b(31, ((ul) this).field_b, ((ul) this).field_i, param1))) {
                if ((2 & ((ul) this).field_h.b(param0 + -83, param2, param4, param1)) == 0) {
                  break L1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            }
          }
          L2: {
            var9 = 3;
            var10 = ((ul) this).field_k[param4 + param2 * ((ul) this).field_e].field_c;
            if (var10 == null) {
              break L2;
            } else {
              L3: {
                if (!((ul) this).field_h.c(var10.field_O, -16985, param1)) {
                  break L3;
                } else {
                  if (!param3) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var10.g(0) != 4) {
                  break L4;
                } else {
                  if (param6) {
                    break L4;
                  } else {
                    if (!param7) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var9 = var9 | 4;
              break L2;
            }
          }
          return var9;
        }
    }

    final static void a(Random param0, ha param1, byte param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        ne[] stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        ne stackIn_146_2 = null;
        ne stackIn_146_3 = null;
        ne[] stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        ne stackIn_147_2 = null;
        ne stackIn_147_3 = null;
        ne[] stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        ne stackIn_148_2 = null;
        ne stackIn_148_3 = null;
        ne[] stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        ne stackIn_149_2 = null;
        ne stackIn_149_3 = null;
        ne[] stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        ne stackIn_150_2 = null;
        ne stackIn_150_3 = null;
        ne[] stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        ne stackIn_151_2 = null;
        ne stackIn_151_3 = null;
        int stackIn_151_4 = 0;
        ne[] stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        ne stackOut_145_2 = null;
        ne stackOut_145_3 = null;
        ne[] stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        ne stackOut_146_2 = null;
        ne stackOut_146_3 = null;
        ne[] stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        ne stackOut_147_2 = null;
        ne stackOut_147_3 = null;
        ne[] stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        ne stackOut_148_2 = null;
        ne stackOut_148_3 = null;
        ne[] stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        ne stackOut_150_2 = null;
        ne stackOut_150_3 = null;
        int stackOut_150_4 = 0;
        ne[] stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        ne stackOut_149_2 = null;
        ne stackOut_149_3 = null;
        int stackOut_149_4 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4_int = param3;
          if (0 != var4_int) {
            if (var4_int == 1) {
              var4_int = 0;
              L1: while (true) {
                if (~param1.field_v >= ~var4_int) {
                  break L0;
                } else {
                  var5 = 0;
                  L2: while (true) {
                    if (param1.field_db <= var5) {
                      var4_int++;
                      continue L1;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            var6 = Math.abs(var4_int + -(param1.field_v >> 1));
                            var7 = Math.abs(var5 + -(param1.field_db >> 1));
                            var8 = ns.a(false, 2, param0);
                            if (var6 >= var8 + 12) {
                              break L5;
                            } else {
                              if (var6 > var8 + 7) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (var8 + 12 <= var7) {
                            break L3;
                          } else {
                            if (~var7 < ~(var8 + 7)) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        param1.field_Eb[var4_int + var5 * param1.field_v] = new ne(6, param1);
                        break L3;
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              if (2 != var4_int) {
                if (var4_int == 3) {
                  break L0;
                } else {
                  if (4 != var4_int) {
                    if (5 == var4_int) {
                      var4_int = 0;
                      L6: while (true) {
                        if (~var4_int <= ~param1.field_v) {
                          break L0;
                        } else {
                          var5 = 0;
                          L7: while (true) {
                            if (~param1.field_db >= ~var5) {
                              var4_int++;
                              continue L6;
                            } else {
                              L8: {
                                L9: {
                                  var6 = Math.abs(-(param1.field_v >> 1) + var4_int);
                                  var7 = Math.abs(var5 + -(param1.field_db >> 1));
                                  var8 = ns.a(false, 2, param0);
                                  if (~var6 <= ~(8 - -var8)) {
                                    break L9;
                                  } else {
                                    if (var7 >= 8 - -var8) {
                                      break L9;
                                    } else {
                                      if ((var6 - -var7) * 2 / 3 >= var8 + 8) {
                                        break L9;
                                      } else {
                                        param1.field_Eb[param1.field_v * var5 + var4_int] = new ne(0, param1);
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                L10: {
                                  if (~var6 <= ~(12 + var8)) {
                                    break L10;
                                  } else {
                                    if (var7 >= 12 + var8) {
                                      break L10;
                                    } else {
                                      if (~(2 * (var7 + var6) / 3) <= ~(var8 + 12)) {
                                        break L10;
                                      } else {
                                        param1.field_Eb[var4_int + param1.field_v * var5] = new ne(3, param1);
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                if ((var8 + var7 + -15) / 5 > (var8 + var4_int) % 20) {
                                  param1.field_Eb[param1.field_v * var5 + var4_int] = new ne(2, param1);
                                  break L8;
                                } else {
                                  if ((var6 - (-var8 + 15)) / 5 <= (var8 + var5) % 20) {
                                    if ((var8 + var4_int) % 20 < (var8 + var7 + -8) / 5) {
                                      param1.field_Eb[var4_int - -(var5 * param1.field_v)] = new ne(3, param1);
                                      break L8;
                                    } else {
                                      if (~((var5 - -var8) % 20) <= ~((var8 + (var6 + -8)) / 5)) {
                                        if ((var8 + var7 + -8) / 5 <= 20 + -((var4_int - -var8) % 20)) {
                                          if (-((var8 + var5) % 20) + 20 >= (-8 + var8 + var6) / 5) {
                                            break L8;
                                          } else {
                                            param1.field_Eb[param1.field_v * var5 + var4_int] = new ne(3, param1);
                                            break L8;
                                          }
                                        } else {
                                          param1.field_Eb[var4_int - -(var5 * param1.field_v)] = new ne(3, param1);
                                          break L8;
                                        }
                                      } else {
                                        param1.field_Eb[param1.field_v * var5 + var4_int] = new ne(3, param1);
                                        break L8;
                                      }
                                    }
                                  } else {
                                    param1.field_Eb[var4_int + var5 * param1.field_v] = new ne(2, param1);
                                    break L8;
                                  }
                                }
                              }
                              var5++;
                              continue L7;
                            }
                          }
                        }
                      }
                    } else {
                      if (var4_int == 6) {
                        var4_int = 0;
                        L11: while (true) {
                          if (~var4_int <= ~param1.field_v) {
                            param1.field_Eb[24 + (ns.a(false, 3, param0) - -((ns.a(false, 3, param0) + 24) * param1.field_v))] = new ne(7, param1);
                            param1.field_Eb[ns.a(false, 3, param0) + 24 + (ns.a(false, 3, param0) + 34) * param1.field_v] = new ne(7, param1);
                            param1.field_Eb[ns.a(false, 3, param0) + 34 + (24 + ns.a(false, 3, param0)) * param1.field_v] = new ne(7, param1);
                            param1.field_Eb[ns.a(false, 3, param0) + 34 + (34 + ns.a(false, 3, param0)) * param1.field_v] = new ne(7, param1);
                            break L0;
                          } else {
                            var5 = 0;
                            L12: while (true) {
                              if (var5 >= param1.field_db) {
                                var4_int++;
                                continue L11;
                              } else {
                                L13: {
                                  L14: {
                                    var6 = Math.abs(var4_int + -(param1.field_v >> 1));
                                    var7 = Math.abs(-(param1.field_db >> 1) + var5);
                                    var8 = ns.a(false, 2, param0);
                                    if (~var6 <= ~(var8 + 8)) {
                                      break L14;
                                    } else {
                                      if (var7 >= var8 + 8) {
                                        break L14;
                                      } else {
                                        if (~(8 - -var8) >= ~((var7 + var6) * 2 / 3)) {
                                          break L14;
                                        } else {
                                          param1.field_Eb[var4_int - -(var5 * param1.field_v)] = new ne(0, param1);
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                  L15: {
                                    if (var6 >= 11 + var8) {
                                      break L15;
                                    } else {
                                      if (~(11 - -var8) >= ~var7) {
                                        break L15;
                                      } else {
                                        if (~(11 + var8) < ~((var7 + var6) * 2 / 3)) {
                                          param1.field_Eb[var4_int + var5 * param1.field_v] = new ne(4, param1);
                                          break L13;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                  if ((-15 + var7 + var8) / 5 <= (var8 + var4_int) % 20) {
                                    if ((var8 + var6 + -15) / 5 <= (var5 - -var8) % 20) {
                                      if ((-12 + var7 - -var8) / 5 <= (var8 + var4_int) % 20) {
                                        if ((-12 + var8 + var6) / 5 <= (var8 + var5) % 20) {
                                          break L13;
                                        } else {
                                          param1.field_Eb[var5 * param1.field_v + var4_int] = new ne(3, param1);
                                          break L13;
                                        }
                                      } else {
                                        param1.field_Eb[param1.field_v * var5 + var4_int] = new ne(3, param1);
                                        break L13;
                                      }
                                    } else {
                                      param1.field_Eb[var4_int - -(var5 * param1.field_v)] = new ne(2, param1);
                                      break L13;
                                    }
                                  } else {
                                    param1.field_Eb[param1.field_v * var5 + var4_int] = new ne(2, param1);
                                    break L13;
                                  }
                                }
                                var5++;
                                continue L12;
                              }
                            }
                          }
                        }
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    var4_int = 0;
                    L16: while (true) {
                      if (~param1.field_v >= ~var4_int) {
                        break L0;
                      } else {
                        var5 = 0;
                        L17: while (true) {
                          if (~var5 <= ~param1.field_db) {
                            var4_int++;
                            continue L16;
                          } else {
                            L18: {
                              L19: {
                                var6 = Math.abs(var4_int + -(param1.field_v >> 1));
                                var7 = Math.abs(-(param1.field_db >> 1) + var5);
                                var8 = ns.a(false, 2, param0);
                                if (8 - -var8 <= var6) {
                                  break L19;
                                } else {
                                  if (~(var8 + 8) >= ~var7) {
                                    break L19;
                                  } else {
                                    if ((var7 + var6) * 2 / 3 >= var8 + 8) {
                                      break L19;
                                    } else {
                                      param1.field_Eb[var4_int - -(var5 * param1.field_v)] = new ne(0, param1);
                                      break L18;
                                    }
                                  }
                                }
                              }
                              L20: {
                                if (var6 >= var8 + 12) {
                                  break L20;
                                } else {
                                  if (~(var8 + 12) >= ~var7) {
                                    break L20;
                                  } else {
                                    if (~(var8 + 12) < ~((var6 + var7) * 2 / 3)) {
                                      param1.field_Eb[var4_int + param1.field_v * var5] = new ne(3, param1);
                                      break L18;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              if (~((var4_int + var8) % 20) > ~((var7 - -var8 + -9) / 5)) {
                                param1.field_Eb[var4_int - -(param1.field_v * var5)] = new ne(2, param1);
                                break L18;
                              } else {
                                if ((var8 + var6 - 9) / 5 > (var5 - -var8) % 20) {
                                  param1.field_Eb[var5 * param1.field_v + var4_int] = new ne(2, param1);
                                  break L18;
                                } else {
                                  if (20 - (var4_int - -var8) % 20 < (var7 - -var8 - 9) / 5) {
                                    param1.field_Eb[var5 * param1.field_v + var4_int] = new ne(2, param1);
                                    break L18;
                                  } else {
                                    if ((var8 + (var6 + -9)) / 5 > -((var8 + var5) % 20) + 20) {
                                      param1.field_Eb[param1.field_v * var5 + var4_int] = new ne(2, param1);
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                            }
                            var5++;
                            continue L17;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var4_int = 0;
                L21: while (true) {
                  if (param1.field_v <= var4_int) {
                    break L0;
                  } else {
                    var5 = 0;
                    L22: while (true) {
                      if (param1.field_db <= var5) {
                        var4_int++;
                        continue L21;
                      } else {
                        L23: {
                          L24: {
                            var6 = Math.abs(-(param1.field_v >> 1) + var4_int);
                            var7 = Math.abs(-(param1.field_db >> 1) + var5);
                            var8 = ns.a(false, 2, param0);
                            if (~(var8 + 8) >= ~var6) {
                              break L24;
                            } else {
                              if (var7 >= var8 + 8) {
                                break L24;
                              } else {
                                if (~((var7 + var6) * 2 / 3) > ~(8 - -var8)) {
                                  param1.field_Eb[var5 * param1.field_v + var4_int] = new ne(0, param1);
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                          L25: {
                            if (~var6 <= ~(var8 + 12)) {
                              break L25;
                            } else {
                              if (var8 + 12 <= var7) {
                                break L25;
                              } else {
                                if (~(2 * (var7 + var6) / 3) <= ~(12 + var8)) {
                                  break L25;
                                } else {
                                  param1.field_Eb[param1.field_v * var5 + var4_int] = new ne(5, param1);
                                  break L23;
                                }
                              }
                            }
                          }
                          if (~((var4_int + var8) % 20) <= ~((-9 + var7 + var8) / 5)) {
                            if ((var8 + var5) % 20 >= (var6 + var8 + -9) / 5) {
                              if ((-9 + (var7 + var8)) / 5 > 20 + -((var8 + var4_int) % 20)) {
                                param1.field_Eb[var5 * param1.field_v + var4_int] = new ne(2, param1);
                                break L23;
                              } else {
                                if ((var8 + (var6 + -9)) / 5 <= 20 - (var5 - -var8) % 20) {
                                  break L23;
                                } else {
                                  param1.field_Eb[var4_int - -(var5 * param1.field_v)] = new ne(2, param1);
                                  break L23;
                                }
                              }
                            } else {
                              param1.field_Eb[var5 * param1.field_v + var4_int] = new ne(2, param1);
                              break L23;
                            }
                          } else {
                            param1.field_Eb[var4_int + param1.field_v * var5] = new ne(2, param1);
                            break L23;
                          }
                        }
                        var5++;
                        continue L22;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var4_int = 0;
            L26: while (true) {
              if (param1.field_v <= var4_int) {
                break L0;
              } else {
                var5 = 0;
                L27: while (true) {
                  if (param1.field_db <= var5) {
                    var4_int++;
                    continue L26;
                  } else {
                    L28: {
                      var6 = Math.abs(-10 + (ns.a(false, 2, param0) + (var4_int + 10)) % 20);
                      var7 = Math.abs((ns.a(false, 2, param0) + (var5 + 10)) % 20 + -10);
                      if (var7 + 2 * var6 < 6) {
                        param1.field_Eb[param1.field_v * var5 + var4_int] = new ne(2, param1);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (6 > var6 - -(var7 * 2)) {
                        param1.field_Eb[param1.field_v * var5 + var4_int] = new ne(2, param1);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    var5++;
                    continue L27;
                  }
                }
              }
            }
          }
        }
        L30: {
          L31: {
            if (param3 == 3) {
              break L31;
            } else {
              if (1 == param3) {
                break L31;
              } else {
                break L30;
              }
            }
          }
          fi.a(25, (byte) 101, 1, 25, 10, true, 10, param1, param0);
          fi.a(35, (byte) 101, 1, 35, 50, true, 50, param1, param0);
          fi.a(25, (byte) 101, 1, 35, 10, true, 50, param1, param0);
          fi.a(35, (byte) 101, 1, 25, 50, true, 10, param1, param0);
          fi.a(30, (byte) 101, 1, 25, 30, true, 10, param1, param0);
          fi.a(30, (byte) 101, 1, 35, 30, true, 50, param1, param0);
          fi.a(35, (byte) 101, 1, 30, 50, true, 30, param1, param0);
          fi.a(25, (byte) 101, 1, 30, 10, true, 30, param1, param0);
          break L30;
        }
        L32: {
          var4_int = 30;
          var5 = 30;
          if (param2 == 85) {
            break L32;
          } else {
            var10 = null;
            ul.a((ru[]) null, (byte) -17, (ArmiesOfGielinor) null);
            break L32;
          }
        }
        var6 = 15 + ns.a(false, 15, param0);
        var7 = 0;
        L33: while (true) {
          if (~var6 >= ~var7) {
            return;
          } else {
            L34: while (true) {
              L35: {
                if (param1.field_Eb[var4_int + var5 * param1.field_v] == null) {
                  break L35;
                } else {
                  if (param1.field_Eb[param1.field_v * var5 + var4_int].field_h == 0) {
                    break L35;
                  } else {
                    if (param1.field_Eb[var5 * param1.field_v + var4_int].field_h == 1) {
                      break L35;
                    } else {
                      var4_int = ns.a(false, 14, param0) + 23;
                      var5 = 23 + ns.a(false, 14, param0);
                      continue L34;
                    }
                  }
                }
              }
              L36: {
                L37: {
                  stackOut_145_0 = param1.field_Eb;
                  stackOut_145_1 = var4_int + var5 * param1.field_v;
                  stackOut_145_2 = null;
                  stackOut_145_3 = null;
                  stackIn_149_0 = stackOut_145_0;
                  stackIn_149_1 = stackOut_145_1;
                  stackIn_149_2 = stackOut_145_2;
                  stackIn_149_3 = stackOut_145_3;
                  stackIn_146_0 = stackOut_145_0;
                  stackIn_146_1 = stackOut_145_1;
                  stackIn_146_2 = stackOut_145_2;
                  stackIn_146_3 = stackOut_145_3;
                  if (var4_int <= 27) {
                    break L37;
                  } else {
                    stackOut_146_0 = (ne[]) (Object) stackIn_146_0;
                    stackOut_146_1 = stackIn_146_1;
                    stackOut_146_2 = null;
                    stackOut_146_3 = null;
                    stackIn_149_0 = stackOut_146_0;
                    stackIn_149_1 = stackOut_146_1;
                    stackIn_149_2 = stackOut_146_2;
                    stackIn_149_3 = stackOut_146_3;
                    stackIn_147_0 = stackOut_146_0;
                    stackIn_147_1 = stackOut_146_1;
                    stackIn_147_2 = stackOut_146_2;
                    stackIn_147_3 = stackOut_146_3;
                    if (var5 <= 27) {
                      break L37;
                    } else {
                      stackOut_147_0 = (ne[]) (Object) stackIn_147_0;
                      stackOut_147_1 = stackIn_147_1;
                      stackOut_147_2 = null;
                      stackOut_147_3 = null;
                      stackIn_149_0 = stackOut_147_0;
                      stackIn_149_1 = stackOut_147_1;
                      stackIn_149_2 = stackOut_147_2;
                      stackIn_149_3 = stackOut_147_3;
                      stackIn_148_0 = stackOut_147_0;
                      stackIn_148_1 = stackOut_147_1;
                      stackIn_148_2 = stackOut_147_2;
                      stackIn_148_3 = stackOut_147_3;
                      if (var4_int >= 33) {
                        break L37;
                      } else {
                        stackOut_148_0 = (ne[]) (Object) stackIn_148_0;
                        stackOut_148_1 = stackIn_148_1;
                        stackOut_148_2 = null;
                        stackOut_148_3 = null;
                        stackIn_150_0 = stackOut_148_0;
                        stackIn_150_1 = stackOut_148_1;
                        stackIn_150_2 = stackOut_148_2;
                        stackIn_150_3 = stackOut_148_3;
                        stackIn_149_0 = stackOut_148_0;
                        stackIn_149_1 = stackOut_148_1;
                        stackIn_149_2 = stackOut_148_2;
                        stackIn_149_3 = stackOut_148_3;
                        if (var5 < 33) {
                          stackOut_150_0 = (ne[]) (Object) stackIn_150_0;
                          stackOut_150_1 = stackIn_150_1;
                          stackOut_150_2 = null;
                          stackOut_150_3 = null;
                          stackOut_150_4 = 9;
                          stackIn_151_0 = stackOut_150_0;
                          stackIn_151_1 = stackOut_150_1;
                          stackIn_151_2 = stackOut_150_2;
                          stackIn_151_3 = stackOut_150_3;
                          stackIn_151_4 = stackOut_150_4;
                          break L36;
                        } else {
                          break L37;
                        }
                      }
                    }
                  }
                }
                stackOut_149_0 = (ne[]) (Object) stackIn_149_0;
                stackOut_149_1 = stackIn_149_1;
                stackOut_149_2 = null;
                stackOut_149_3 = null;
                stackOut_149_4 = 8;
                stackIn_151_0 = stackOut_149_0;
                stackIn_151_1 = stackOut_149_1;
                stackIn_151_2 = stackOut_149_2;
                stackIn_151_3 = stackOut_149_3;
                stackIn_151_4 = stackOut_149_4;
                break L36;
              }
              L38: {
                stackIn_151_0[stackIn_151_1] = new ne(stackIn_151_4, param1);
                if (param3 != 3) {
                  break L38;
                } else {
                  qp.a(var5, 30, -1, 30, var4_int, 0, param1, 1, param0);
                  break L38;
                }
              }
              var7++;
              continue L33;
            }
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= -9) {
            ((ul) this).field_k = null;
        }
        for (var2 = 0; var2 < 900; var2++) {
            ((ul) this).field_c[var2] = false;
        }
        ((ul) this).field_c[465] = true;
    }

    final static void a(ru[] param0, byte param1, ArmiesOfGielinor param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              br.field_a = new oo((java.applet.Applet) (Object) param2, bi.field_c, param0, new String[5]);
              if (param1 > 56) {
                break L1;
              } else {
                field_g = null;
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
            stackOut_3_1 = new StringBuilder().append("ul.F(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 > param3 + param4) {
            break L0;
          } else {
            if (((ul) this).field_e <= param3 + param4) {
              break L0;
            } else {
              if (0 > param1 + param2) {
                break L0;
              } else {
                if (~(param1 + param2) <= ~((ul) this).field_l) {
                  break L0;
                } else {
                  if (((ul) this).field_c[param3 + (15 + 30 * param1 - -450)]) {
                    return;
                  } else {
                    if (param0 == 25) {
                      L1: {
                        if (param3 != 0) {
                          break L1;
                        } else {
                          if (param1 == 0) {
                            ((ul) this).field_c[30 * param1 + 450 + param3 + 15] = true;
                            return;
                          } else {
                            break L1;
                          }
                        }
                      }
                      if (param3 == 0) {
                        L2: {
                          if (param1 <= 0) {
                            stackOut_19_0 = -1;
                            stackIn_20_0 = stackOut_19_0;
                            break L2;
                          } else {
                            stackOut_18_0 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            break L2;
                          }
                        }
                        var7 = stackIn_20_0;
                        param1 = param1 * var7;
                        var8 = 1;
                        L3: while (true) {
                          L4: {
                            if (~param1 > ~var8) {
                              break L4;
                            } else {
                              L5: {
                                var9 = (var8 * var7 + param2) * ((ul) this).field_e + param4;
                                ((ul) this).field_c[param3 + 15 - -(30 * (var8 * var7 + 15))] = true;
                                if (param5) {
                                  break L5;
                                } else {
                                  if (((ul) this).field_k[var9].b(param0 + 903)) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var8++;
                              continue L3;
                            }
                          }
                          return;
                        }
                      } else {
                        if (param1 == 0) {
                          L6: {
                            if (param3 > 0) {
                              stackOut_31_0 = 1;
                              stackIn_32_0 = stackOut_31_0;
                              break L6;
                            } else {
                              stackOut_30_0 = -1;
                              stackIn_32_0 = stackOut_30_0;
                              break L6;
                            }
                          }
                          var7 = stackIn_32_0;
                          param3 = param3 * var7;
                          var8 = 1;
                          L7: while (true) {
                            L8: {
                              if (~var8 < ~param3) {
                                break L8;
                              } else {
                                L9: {
                                  var9 = var8 * var7 + param4 - -(((ul) this).field_e * param2);
                                  ((ul) this).field_c[param1 * 30 - -450 + var7 * var8 + 15] = true;
                                  if (param5) {
                                    break L9;
                                  } else {
                                    if (((ul) this).field_k[var9].b(928)) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var8++;
                                continue L7;
                              }
                            }
                            return;
                          }
                        } else {
                          L10: {
                            if (param3 <= 0) {
                              stackOut_41_0 = -1;
                              stackIn_42_0 = stackOut_41_0;
                              break L10;
                            } else {
                              stackOut_40_0 = 1;
                              stackIn_42_0 = stackOut_40_0;
                              break L10;
                            }
                          }
                          L11: {
                            var7 = stackIn_42_0;
                            if (param1 <= 0) {
                              stackOut_44_0 = -1;
                              stackIn_45_0 = stackOut_44_0;
                              break L11;
                            } else {
                              stackOut_43_0 = 1;
                              stackIn_45_0 = stackOut_43_0;
                              break L11;
                            }
                          }
                          L12: {
                            var8 = stackIn_45_0;
                            param3 = param3 * var7;
                            param1 = param1 * var8;
                            if (param1 >= param3) {
                              var9 = 1;
                              L13: while (true) {
                                if (param1 < var9) {
                                  break L12;
                                } else {
                                  L14: {
                                    var10 = param3 * var9 / param1;
                                    var11 = (param2 - -(var8 * var9)) * ((ul) this).field_e + (param4 - -(var7 * var10));
                                    ((ul) this).field_c[var7 * var10 + (15 - -((15 + var8 * var9) * 30))] = true;
                                    if (param5) {
                                      break L14;
                                    } else {
                                      if (!((ul) this).field_k[var11].b(928)) {
                                        break L14;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var9++;
                                  continue L13;
                                }
                              }
                            } else {
                              var9 = 1;
                              L15: while (true) {
                                if (~param3 > ~var9) {
                                  break L12;
                                } else {
                                  L16: {
                                    var10 = param1 * var9 / param3;
                                    var11 = var9 * var7 + (param4 - -(((ul) this).field_e * (param2 + var10 * var8)));
                                    ((ul) this).field_c[15 + var7 * var9 - -((15 + var8 * var10) * 30)] = true;
                                    if (param5) {
                                      break L16;
                                    } else {
                                      if (!((ul) this).field_k[var11].b(928)) {
                                        break L16;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var9++;
                                  continue L15;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    ul(ha param0, ne[] param1, int param2, int param3) {
        ((ul) this).field_c = new boolean[900];
        ((ul) this).field_n = 0;
        ((ul) this).field_b = 0;
        ((ul) this).field_i = 0;
        try {
            ((ul) this).field_h = param0;
            ((ul) this).field_l = param3;
            ((ul) this).field_e = param2;
            ((ul) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ul.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "OK";
        field_j = "Start Mission";
        field_d = 0;
        field_o = "Names cannot contain consecutive spaces";
    }
}
