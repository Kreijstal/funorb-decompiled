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
              if (-1 == (var8 ^ -1)) {
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
                      if (-1 >= (var8 ^ -1)) {
                        L3: {
                          if (-4 + (-40 + param5) < -param7 + param4) {
                            break L3;
                          } else {
                            if (-1 <= (var8 ^ -1)) {
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
                    if ((var8 ^ -1) > -1) {
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
        fq.a(param2, param1, 0, false);
        if (param0 != -80) {
            field_m = true;
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        param0 = 15 + (-((ul) this).field_i + param0);
        param2 = param2 - ((ul) this).field_b - -15;
        if (param1 == 112) {
          L0: {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (param2 < 0) {
                break L0;
              } else {
                if (param0 < -31) {
                  break L0;
                } else {
                  if (-31 >= param2) {
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
          if ((var10 ^ -1) > -1) {
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
                        if (0 <= (((ul) this).field_b + var10 ^ -1)) {
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
                        if (0 <= (-var10 + ((ul) this).field_b ^ -1)) {
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
                    if (0 <= (-var10 + ((ul) this).field_i ^ -1)) {
                      break L4;
                    } else {
                      if (((ul) this).field_i + -var10 >= ((ul) this).field_e) {
                        break L4;
                      } else {
                        if ((((ul) this).field_b - -var11 ^ -1) >= 0) {
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
                  if (0 > (var10 + ((ul) this).field_i ^ -1)) {
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var22 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param2 == -1) {
            break L0;
          } else {
            ((ul) this).field_i = 124;
            break L0;
          }
        }
        var15 = param13;
        L1: while (true) {
          if (var15 > param4) {
            return;
          } else {
            var16 = param3;
            L2: while (true) {
              if (param9 < var16) {
                var15++;
                continue L1;
              } else {
                var17 = param7[((ul) this).field_e * var15 + var16];
                if (var17 <= param12) {
                  L3: {
                    if (-1 != (var17 ^ -1)) {
                      stackOut_10_0 = 6;
                      stackIn_11_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 7;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  var18 = stackIn_11_0;
                  this.a((byte) -108);
                  ((ul) this).field_i = var16;
                  ((ul) this).field_n = param8;
                  ((ul) this).field_b = var15;
                  var19 = ((ul) this).field_n;
                  L4: while (true) {
                    if (-1 >= (var19 ^ -1)) {
                      var20 = -var19;
                      L5: while (true) {
                        if (var20 >= var19) {
                          var19--;
                          continue L4;
                        } else {
                          var21 = var19 - -Math.abs(var20);
                          if (param0 <= var21) {
                            if (var21 <= param8) {
                              L6: {
                                if (((ul) this).field_i - -var20 <= -1) {
                                  break L6;
                                } else {
                                  if (((ul) this).field_e <= ((ul) this).field_i - -var20) {
                                    break L6;
                                  } else {
                                    if (0 <= (((ul) this).field_b - -var19 ^ -1)) {
                                      break L6;
                                    } else {
                                      if (((ul) this).field_l <= var19 + ((ul) this).field_b) {
                                        break L6;
                                      } else {
                                        L7: {
                                          if (7 == var18) {
                                            break L7;
                                          } else {
                                            if (-1 != (param11[(var19 + ((ul) this).field_b) * ((ul) this).field_e + var20 + ((ul) this).field_i] ^ -1)) {
                                              break L6;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        this.a(25, var19, ((ul) this).field_b, var20, ((ul) this).field_i, param10);
                                        param11[var20 + (((ul) this).field_i + (var19 + ((ul) this).field_b) * ((ul) this).field_e)] = oe.c(param11[var20 + (((ul) this).field_i + (var19 + ((ul) this).field_b) * ((ul) this).field_e)], rn.a(this.a((byte) 114, param5, ((ul) this).field_b + var19, param6, var20 + ((ul) this).field_i, var21, param10, param1), var18));
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                              L8: {
                                if (-var20 + ((ul) this).field_i >= 0) {
                                  break L8;
                                } else {
                                  if (((ul) this).field_e <= -var20 + ((ul) this).field_i) {
                                    break L8;
                                  } else {
                                    if (0 >= ((ul) this).field_b + -var19) {
                                      break L8;
                                    } else {
                                      if (((ul) this).field_b - var19 >= ((ul) this).field_l) {
                                        break L8;
                                      } else {
                                        L9: {
                                          if (7 == var18) {
                                            break L9;
                                          } else {
                                            if (param11[(-var19 + ((ul) this).field_b) * ((ul) this).field_e + (-var20 + ((ul) this).field_i)] != 0) {
                                              break L8;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        this.a(param2 + 26, -var19, ((ul) this).field_b, -var20, ((ul) this).field_i, param10);
                                        param11[((ul) this).field_i - var20 + (-var19 + ((ul) this).field_b) * ((ul) this).field_e] = oe.c(param11[((ul) this).field_i - var20 + (-var19 + ((ul) this).field_b) * ((ul) this).field_e], rn.a(this.a((byte) 114, param5, -var19 + ((ul) this).field_b, param6, -var20 + ((ul) this).field_i, var21, param10, param1), var18));
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                              L10: {
                                if ((-var19 + ((ul) this).field_i ^ -1) >= 0) {
                                  break L10;
                                } else {
                                  if (((ul) this).field_e <= -var19 + ((ul) this).field_i) {
                                    break L10;
                                  } else {
                                    if ((((ul) this).field_b - -var20 ^ -1) >= 0) {
                                      break L10;
                                    } else {
                                      if (((ul) this).field_b - -var20 < ((ul) this).field_l) {
                                        L11: {
                                          if (7 == var18) {
                                            break L11;
                                          } else {
                                            if (-1 != (param11[-var19 + ((ul) this).field_i - -((var20 + ((ul) this).field_b) * ((ul) this).field_e)] ^ -1)) {
                                              break L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        this.a(param2 + 26, var20, ((ul) this).field_b, -var19, ((ul) this).field_i, param10);
                                        param11[((ul) this).field_i - var19 + ((ul) this).field_e * (var20 + ((ul) this).field_b)] = oe.c(param11[((ul) this).field_i - var19 + ((ul) this).field_e * (var20 + ((ul) this).field_b)], rn.a(var18, this.a((byte) 114, param5, ((ul) this).field_b + var20, param6, ((ul) this).field_i - var19, var21, param10, param1)));
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              if (((ul) this).field_i - -var19 > -1) {
                                if (((ul) this).field_e > ((ul) this).field_i - -var19) {
                                  if (0 > (((ul) this).field_b + -var20 ^ -1)) {
                                    if (-var20 + ((ul) this).field_b < ((ul) this).field_l) {
                                      L12: {
                                        if (var18 == 7) {
                                          break L12;
                                        } else {
                                          if (param11[var19 + (((ul) this).field_i + (((ul) this).field_b + -var20) * ((ul) this).field_e)] == 0) {
                                            break L12;
                                          } else {
                                            var20++;
                                            continue L5;
                                          }
                                        }
                                      }
                                      this.a(param2 + 26, -var20, ((ul) this).field_b, var19, ((ul) this).field_i, param10);
                                      param11[(((ul) this).field_b + -var20) * ((ul) this).field_e + var19 + ((ul) this).field_i] = oe.c(param11[(((ul) this).field_b + -var20) * ((ul) this).field_e + var19 + ((ul) this).field_i], rn.a(var18, this.a((byte) 114, param5, -var20 + ((ul) this).field_b, param6, ((ul) this).field_i + var19, var21, param10, param1)));
                                      var20++;
                                      continue L5;
                                    } else {
                                      var20++;
                                      continue L5;
                                    }
                                  } else {
                                    var20++;
                                    continue L5;
                                  }
                                } else {
                                  var20++;
                                  continue L5;
                                }
                              } else {
                                var20++;
                                continue L5;
                              }
                            } else {
                              var20++;
                              continue L5;
                            }
                          } else {
                            var20++;
                            continue L5;
                          }
                        }
                      }
                    } else {
                      var16++;
                      continue L2;
                    }
                  }
                } else {
                  var16++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final int a(byte param0, int param1, int param2, boolean param3, int param4, int param5, boolean param6, boolean param7) {
        int var9 = 0;
        jd var10 = null;
        if (param0 != 114) {
            field_j = null;
        }
        if (this.a(param4, (byte) 112, param2)) {
            if (-2 > (param5 ^ -1)) {
                if (0 != (2 & ((ul) this).field_h.b(31, ((ul) this).field_b, ((ul) this).field_i, param1))) {
                    return 0;
                }
                if ((2 & ((ul) this).field_h.b(param0 + -83, param2, param4, param1)) != 0) {
                    return 0;
                }
            }
            var9 = 3;
            var10 = ((ul) this).field_k[param4 + param2 * ((ul) this).field_e].field_c;
            if (var10 != null) {
                if (((ul) this).field_h.c(var10.field_O, -16985, param1)) {
                    // ifeq L174
                }
                if (-5 == (var10.g(0) ^ -1)) {
                    if (!param6) {
                        // ifeq L174
                    }
                }
                var9 = var9 | 4;
            }
            return var9;
        }
        return 0;
    }

    final static void a(Random param0, ha param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
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
        ne[] stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        ne stackIn_152_2 = null;
        ne stackIn_152_3 = null;
        ne[] stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        ne stackIn_153_2 = null;
        ne stackIn_153_3 = null;
        int stackIn_153_4 = 0;
        ne[] stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        ne stackOut_147_2 = null;
        ne stackOut_147_3 = null;
        ne[] stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        ne stackOut_148_2 = null;
        ne stackOut_148_3 = null;
        ne[] stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        ne stackOut_149_2 = null;
        ne stackOut_149_3 = null;
        ne[] stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        ne stackOut_150_2 = null;
        ne stackOut_150_3 = null;
        ne[] stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        ne stackOut_152_2 = null;
        ne stackOut_152_3 = null;
        int stackOut_152_4 = 0;
        ne[] stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        ne stackOut_151_2 = null;
        ne stackOut_151_3 = null;
        int stackOut_151_4 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = param3;
          if (0 != var4) {
            if (-2 == (var4 ^ -1)) {
              var4 = 0;
              L1: while (true) {
                if (param1.field_v <= var4) {
                  break L0;
                } else {
                  var5 = 0;
                  L2: while (true) {
                    if (param1.field_db <= var5) {
                      var4++;
                      continue L1;
                    } else {
                      L3: {
                        L4: {
                          var6 = Math.abs(var4 + -(param1.field_v >> -931570207));
                          var7 = Math.abs(var5 + -(param1.field_db >> 218542913));
                          var8 = ns.a(false, 2, param0);
                          if (var6 >= var8 + 12) {
                            break L4;
                          } else {
                            if (var6 > var8 + 7) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var8 + 12 > var7) {
                          if (var7 > var8 + 7) {
                            break L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                      param1.field_Eb[var4 + var5 * param1.field_v] = new ne(6, param1);
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              if (2 != var4) {
                if (var4 == 3) {
                  break L0;
                } else {
                  if (4 != var4) {
                    if (5 == var4) {
                      var4 = 0;
                      L5: while (true) {
                        if (var4 >= param1.field_v) {
                          break L0;
                        } else {
                          var5 = 0;
                          L6: while (true) {
                            if (param1.field_db <= var5) {
                              var4++;
                              continue L5;
                            } else {
                              L7: {
                                var6 = Math.abs(-(param1.field_v >> 2085157281) + var4);
                                var7 = Math.abs(var5 + -(param1.field_db >> -1721210559));
                                var8 = ns.a(false, 2, param0);
                                if (var6 >= 8 - -var8) {
                                  break L7;
                                } else {
                                  if (var7 >= 8 - -var8) {
                                    break L7;
                                  } else {
                                    if ((var6 - -var7) * 2 / 3 >= var8 + 8) {
                                      break L7;
                                    } else {
                                      param1.field_Eb[param1.field_v * var5 + var4] = new ne(0, param1);
                                      var5++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                              L8: {
                                if (var6 >= 12 + var8) {
                                  break L8;
                                } else {
                                  if (var7 >= 12 + var8) {
                                    break L8;
                                  } else {
                                    if (2 * (var7 + var6) / 3 >= var8 + 12) {
                                      break L8;
                                    } else {
                                      param1.field_Eb[var4 + param1.field_v * var5] = new ne(3, param1);
                                      var5++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                              if ((var8 + var7 + -15) / 5 > (var8 + var4) % 20) {
                                param1.field_Eb[param1.field_v * var5 + var4] = new ne(2, param1);
                                var5++;
                                continue L6;
                              } else {
                                if ((var6 - (-var8 + 15)) / 5 <= (var8 + var5) % 20) {
                                  if ((var8 + var4) % 20 < (var8 + var7 + -8) / 5) {
                                    param1.field_Eb[var4 - -(var5 * param1.field_v)] = new ne(3, param1);
                                    var5++;
                                    continue L6;
                                  } else {
                                    if ((var5 - -var8) % 20 >= (var8 + (var6 + -8)) / 5) {
                                      if ((var8 + var7 + -8) / 5 <= 20 + -((var4 - -var8) % 20)) {
                                        if (-((var8 + var5) % 20) + 20 < (-8 + var8 + var6) / 5) {
                                          param1.field_Eb[param1.field_v * var5 + var4] = new ne(3, param1);
                                          var5++;
                                          continue L6;
                                        } else {
                                          var5++;
                                          continue L6;
                                        }
                                      } else {
                                        param1.field_Eb[var4 - -(var5 * param1.field_v)] = new ne(3, param1);
                                        var5++;
                                        continue L6;
                                      }
                                    } else {
                                      param1.field_Eb[param1.field_v * var5 + var4] = new ne(3, param1);
                                      var5++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  param1.field_Eb[var4 + var5 * param1.field_v] = new ne(2, param1);
                                  var5++;
                                  continue L6;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (var4 == 6) {
                        var4 = 0;
                        L9: while (true) {
                          if (var4 >= param1.field_v) {
                            param1.field_Eb[24 + (ns.a(false, 3, param0) - -((ns.a(false, 3, param0) + 24) * param1.field_v))] = new ne(7, param1);
                            param1.field_Eb[ns.a(false, 3, param0) + 24 + (ns.a(false, 3, param0) + 34) * param1.field_v] = new ne(7, param1);
                            param1.field_Eb[ns.a(false, 3, param0) + 34 + (24 + ns.a(false, 3, param0)) * param1.field_v] = new ne(7, param1);
                            param1.field_Eb[ns.a(false, 3, param0) + 34 + (34 + ns.a(false, 3, param0)) * param1.field_v] = new ne(7, param1);
                            break L0;
                          } else {
                            var5 = 0;
                            L10: while (true) {
                              if (var5 >= param1.field_db) {
                                var4++;
                                continue L9;
                              } else {
                                L11: {
                                  var6 = Math.abs(var4 + -(param1.field_v >> -1844067999));
                                  var7 = Math.abs(-(param1.field_db >> 1349785761) + var5);
                                  var8 = ns.a(false, 2, param0);
                                  if (var6 >= var8 + 8) {
                                    break L11;
                                  } else {
                                    if (var7 >= var8 + 8) {
                                      break L11;
                                    } else {
                                      if (8 - -var8 <= (var7 + var6) * 2 / 3) {
                                        break L11;
                                      } else {
                                        param1.field_Eb[var4 - -(var5 * param1.field_v)] = new ne(0, param1);
                                        var5++;
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                                L12: {
                                  if (var6 >= 11 + var8) {
                                    break L12;
                                  } else {
                                    if (11 - -var8 <= var7) {
                                      break L12;
                                    } else {
                                      if (11 + var8 > (var7 + var6) * 2 / 3) {
                                        param1.field_Eb[var4 + var5 * param1.field_v] = new ne(4, param1);
                                        var5++;
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                if ((-15 + var7 + var8) / 5 <= (var8 + var4) % 20) {
                                  if ((var8 + var6 + -15) / 5 <= (var5 - -var8) % 20) {
                                    if ((-12 + var7 - -var8) / 5 <= (var8 + var4) % 20) {
                                      if ((-12 + var8 + var6) / 5 > (var8 + var5) % 20) {
                                        param1.field_Eb[var5 * param1.field_v + var4] = new ne(3, param1);
                                        var5++;
                                        continue L10;
                                      } else {
                                        var5++;
                                        continue L10;
                                      }
                                    } else {
                                      param1.field_Eb[param1.field_v * var5 + var4] = new ne(3, param1);
                                      var5++;
                                      continue L10;
                                    }
                                  } else {
                                    param1.field_Eb[var4 - -(var5 * param1.field_v)] = new ne(2, param1);
                                    var5++;
                                    continue L10;
                                  }
                                } else {
                                  param1.field_Eb[param1.field_v * var5 + var4] = new ne(2, param1);
                                  var5++;
                                  continue L10;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    var4 = 0;
                    L13: while (true) {
                      if (param1.field_v <= var4) {
                        break L0;
                      } else {
                        var5 = 0;
                        L14: while (true) {
                          if (var5 >= param1.field_db) {
                            var4++;
                            continue L13;
                          } else {
                            L15: {
                              var6 = Math.abs(var4 + -(param1.field_v >> -1959474175));
                              var7 = Math.abs(-(param1.field_db >> -743147871) + var5);
                              var8 = ns.a(false, 2, param0);
                              if (8 - -var8 <= var6) {
                                break L15;
                              } else {
                                if (var8 + 8 <= var7) {
                                  break L15;
                                } else {
                                  if ((var7 + var6) * 2 / 3 >= var8 + 8) {
                                    break L15;
                                  } else {
                                    param1.field_Eb[var4 - -(var5 * param1.field_v)] = new ne(0, param1);
                                    var5++;
                                    continue L14;
                                  }
                                }
                              }
                            }
                            L16: {
                              if (var6 >= var8 + 12) {
                                break L16;
                              } else {
                                if (var8 + 12 <= var7) {
                                  break L16;
                                } else {
                                  if (var8 + 12 > (var6 + var7) * 2 / 3) {
                                    param1.field_Eb[var4 + param1.field_v * var5] = new ne(3, param1);
                                    var5++;
                                    continue L14;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            if ((var4 + var8) % 20 < (var7 - -var8 + -9) / 5) {
                              param1.field_Eb[var4 - -(param1.field_v * var5)] = new ne(2, param1);
                              var5++;
                              continue L14;
                            } else {
                              if ((var8 + var6 - 9) / 5 > (var5 - -var8) % 20) {
                                param1.field_Eb[var5 * param1.field_v + var4] = new ne(2, param1);
                                var5++;
                                continue L14;
                              } else {
                                if (20 - (var4 - -var8) % 20 < (var7 - -var8 - 9) / 5) {
                                  param1.field_Eb[var5 * param1.field_v + var4] = new ne(2, param1);
                                  var5++;
                                  continue L14;
                                } else {
                                  if ((var8 + (var6 + -9)) / 5 > -((var8 + var5) % 20) + 20) {
                                    param1.field_Eb[param1.field_v * var5 + var4] = new ne(2, param1);
                                    var5++;
                                    continue L14;
                                  } else {
                                    var5++;
                                    continue L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var4 = 0;
                L17: while (true) {
                  if (param1.field_v <= var4) {
                    break L0;
                  } else {
                    var5 = 0;
                    L18: while (true) {
                      if (param1.field_db <= var5) {
                        var4++;
                        continue L17;
                      } else {
                        L19: {
                          var6 = Math.abs(-(param1.field_v >> 351061537) + var4);
                          var7 = Math.abs(-(param1.field_db >> 44745569) + var5);
                          var8 = ns.a(false, 2, param0);
                          if (var8 + 8 <= var6) {
                            break L19;
                          } else {
                            if (var7 >= var8 + 8) {
                              break L19;
                            } else {
                              if ((var7 + var6) * 2 / 3 < 8 - -var8) {
                                param1.field_Eb[var5 * param1.field_v + var4] = new ne(0, param1);
                                var5++;
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                        L20: {
                          if (var6 >= var8 + 12) {
                            break L20;
                          } else {
                            if (var8 + 12 <= var7) {
                              break L20;
                            } else {
                              if (2 * (var7 + var6) / 3 >= 12 + var8) {
                                break L20;
                              } else {
                                param1.field_Eb[param1.field_v * var5 + var4] = new ne(5, param1);
                                var5++;
                                continue L18;
                              }
                            }
                          }
                        }
                        if ((var4 + var8) % 20 >= (-9 + var7 + var8) / 5) {
                          if ((var8 + var5) % 20 >= (var6 + var8 + -9) / 5) {
                            if ((-9 + (var7 + var8)) / 5 > 20 + -((var8 + var4) % 20)) {
                              param1.field_Eb[var5 * param1.field_v + var4] = new ne(2, param1);
                              var5++;
                              continue L18;
                            } else {
                              if ((var8 + (var6 + -9)) / 5 > 20 - (var5 - -var8) % 20) {
                                param1.field_Eb[var4 - -(var5 * param1.field_v)] = new ne(2, param1);
                                var5++;
                                continue L18;
                              } else {
                                var5++;
                                continue L18;
                              }
                            }
                          } else {
                            param1.field_Eb[var5 * param1.field_v + var4] = new ne(2, param1);
                            var5++;
                            continue L18;
                          }
                        } else {
                          param1.field_Eb[var4 + param1.field_v * var5] = new ne(2, param1);
                          var5++;
                          continue L18;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            var4 = 0;
            L21: while (true) {
              if (param1.field_v <= var4) {
                break L0;
              } else {
                var5 = 0;
                L22: while (true) {
                  if (param1.field_db <= var5) {
                    var4++;
                    continue L21;
                  } else {
                    L23: {
                      var6 = Math.abs(-10 + (ns.a(false, 2, param0) + (var4 + 10)) % 20);
                      var7 = Math.abs((ns.a(false, 2, param0) + (var5 + 10)) % 20 + -10);
                      if (var7 + 2 * var6 < 6) {
                        param1.field_Eb[param1.field_v * var5 + var4] = new ne(2, param1);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    if (6 > var6 - -(var7 * 2)) {
                      param1.field_Eb[param1.field_v * var5 + var4] = new ne(2, param1);
                      var5++;
                      continue L22;
                    } else {
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
          }
        }
        L24: {
          L25: {
            if ((param3 ^ -1) == -4) {
              break L25;
            } else {
              if (1 == param3) {
                break L25;
              } else {
                break L24;
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
          break L24;
        }
        L26: {
          var4 = 30;
          var5 = 30;
          if (param2 == 85) {
            break L26;
          } else {
            var10 = null;
            ul.a((ru[]) null, (byte) -17, (ArmiesOfGielinor) null);
            break L26;
          }
        }
        var6 = 15 + ns.a(false, 15, param0);
        var7 = 0;
        L27: while (true) {
          if (var6 <= var7) {
            return;
          } else {
            L28: while (true) {
              L29: {
                if (param1.field_Eb[var4 + var5 * param1.field_v] == null) {
                  break L29;
                } else {
                  if (param1.field_Eb[param1.field_v * var5 + var4].field_h == 0) {
                    break L29;
                  } else {
                    if ((param1.field_Eb[var5 * param1.field_v + var4].field_h ^ -1) == -2) {
                      break L29;
                    } else {
                      var4 = ns.a(false, 14, param0) + 23;
                      var5 = 23 + ns.a(false, 14, param0);
                      continue L28;
                    }
                  }
                }
              }
              L30: {
                L31: {
                  stackOut_147_0 = param1.field_Eb;
                  stackOut_147_1 = var4 + var5 * param1.field_v;
                  stackOut_147_2 = null;
                  stackOut_147_3 = null;
                  stackIn_151_0 = stackOut_147_0;
                  stackIn_151_1 = stackOut_147_1;
                  stackIn_151_2 = stackOut_147_2;
                  stackIn_151_3 = stackOut_147_3;
                  stackIn_148_0 = stackOut_147_0;
                  stackIn_148_1 = stackOut_147_1;
                  stackIn_148_2 = stackOut_147_2;
                  stackIn_148_3 = stackOut_147_3;
                  if (-28 <= var4) {
                    break L31;
                  } else {
                    stackOut_148_0 = (ne[]) (Object) stackIn_148_0;
                    stackOut_148_1 = stackIn_148_1;
                    stackOut_148_2 = null;
                    stackOut_148_3 = null;
                    stackIn_151_0 = stackOut_148_0;
                    stackIn_151_1 = stackOut_148_1;
                    stackIn_151_2 = stackOut_148_2;
                    stackIn_151_3 = stackOut_148_3;
                    stackIn_149_0 = stackOut_148_0;
                    stackIn_149_1 = stackOut_148_1;
                    stackIn_149_2 = stackOut_148_2;
                    stackIn_149_3 = stackOut_148_3;
                    if (-28 >= var5) {
                      break L31;
                    } else {
                      stackOut_149_0 = (ne[]) (Object) stackIn_149_0;
                      stackOut_149_1 = stackIn_149_1;
                      stackOut_149_2 = null;
                      stackOut_149_3 = null;
                      stackIn_151_0 = stackOut_149_0;
                      stackIn_151_1 = stackOut_149_1;
                      stackIn_151_2 = stackOut_149_2;
                      stackIn_151_3 = stackOut_149_3;
                      stackIn_150_0 = stackOut_149_0;
                      stackIn_150_1 = stackOut_149_1;
                      stackIn_150_2 = stackOut_149_2;
                      stackIn_150_3 = stackOut_149_3;
                      if (var4 <= -34) {
                        break L31;
                      } else {
                        stackOut_150_0 = (ne[]) (Object) stackIn_150_0;
                        stackOut_150_1 = stackIn_150_1;
                        stackOut_150_2 = null;
                        stackOut_150_3 = null;
                        stackIn_152_0 = stackOut_150_0;
                        stackIn_152_1 = stackOut_150_1;
                        stackIn_152_2 = stackOut_150_2;
                        stackIn_152_3 = stackOut_150_3;
                        stackIn_151_0 = stackOut_150_0;
                        stackIn_151_1 = stackOut_150_1;
                        stackIn_151_2 = stackOut_150_2;
                        stackIn_151_3 = stackOut_150_3;
                        if (-34 > var5) {
                          stackOut_152_0 = (ne[]) (Object) stackIn_152_0;
                          stackOut_152_1 = stackIn_152_1;
                          stackOut_152_2 = null;
                          stackOut_152_3 = null;
                          stackOut_152_4 = 9;
                          stackIn_153_0 = stackOut_152_0;
                          stackIn_153_1 = stackOut_152_1;
                          stackIn_153_2 = stackOut_152_2;
                          stackIn_153_3 = stackOut_152_3;
                          stackIn_153_4 = stackOut_152_4;
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                }
                stackOut_151_0 = (ne[]) (Object) stackIn_151_0;
                stackOut_151_1 = stackIn_151_1;
                stackOut_151_2 = null;
                stackOut_151_3 = null;
                stackOut_151_4 = 8;
                stackIn_153_0 = stackOut_151_0;
                stackIn_153_1 = stackOut_151_1;
                stackIn_153_2 = stackOut_151_2;
                stackIn_153_3 = stackOut_151_3;
                stackIn_153_4 = stackOut_151_4;
                break L30;
              }
              new ne(stackIn_153_4, param1);
              stackIn_153_0[stackIn_153_1] = (ne) (Object) stackIn_153_2;
              if (param3 == 3) {
                qp.a(var5, 30, -1, 30, var4, 0, param1, 1, param0);
                var7++;
                continue L27;
              } else {
                var7++;
                continue L27;
              }
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
        for (var2 = 0; (var2 ^ -1) > -901; var2++) {
            ((ul) this).field_c[var2] = false;
        }
        ((ul) this).field_c[465] = true;
    }

    final static void a(ru[] param0, byte param1, ArmiesOfGielinor param2) {
        br.field_a = new oo((java.applet.Applet) (Object) param2, bi.field_c, param0, new String[5]);
        if (param1 <= 56) {
            field_g = null;
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
        int stackIn_33_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
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
                if (param1 + param2 >= ((ul) this).field_l) {
                  break L0;
                } else {
                  if (((ul) this).field_c[param3 + (15 + 30 * param1 - -450)]) {
                    return;
                  } else {
                    if (param0 == 25) {
                      L1: {
                        if (-1 != param3) {
                          break L1;
                        } else {
                          if (-1 == param1) {
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
                            if (param1 < var8) {
                              break L4;
                            } else {
                              var9 = (var8 * var7 + param2) * ((ul) this).field_e + param4;
                              ((ul) this).field_c[param3 + 15 - -(30 * (var8 * var7 + 15))] = true;
                              if (!param5) {
                                if (((ul) this).field_k[var9].b(param0 + 903)) {
                                  break L4;
                                } else {
                                  var8++;
                                  continue L3;
                                }
                              } else {
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        if (param1 == 0) {
                          L5: {
                            if (param3 > 0) {
                              stackOut_32_0 = 1;
                              stackIn_33_0 = stackOut_32_0;
                              break L5;
                            } else {
                              stackOut_31_0 = -1;
                              stackIn_33_0 = stackOut_31_0;
                              break L5;
                            }
                          }
                          var7 = stackIn_33_0;
                          param3 = param3 * var7;
                          var8 = 1;
                          L6: while (true) {
                            L7: {
                              if (var8 > param3) {
                                break L7;
                              } else {
                                var9 = var8 * var7 + param4 - -(((ul) this).field_e * param2);
                                ((ul) this).field_c[param1 * 30 - -450 + var7 * var8 + 15] = true;
                                if (!param5) {
                                  if (((ul) this).field_k[var9].b(928)) {
                                    break L7;
                                  } else {
                                    var8++;
                                    continue L6;
                                  }
                                } else {
                                  var8++;
                                  continue L6;
                                }
                              }
                            }
                            return;
                          }
                        } else {
                          L8: {
                            if (param3 <= 0) {
                              stackOut_43_0 = -1;
                              stackIn_44_0 = stackOut_43_0;
                              break L8;
                            } else {
                              stackOut_42_0 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              break L8;
                            }
                          }
                          L9: {
                            var7 = stackIn_44_0;
                            if ((param1 ^ -1) >= -1) {
                              stackOut_46_0 = -1;
                              stackIn_47_0 = stackOut_46_0;
                              break L9;
                            } else {
                              stackOut_45_0 = 1;
                              stackIn_47_0 = stackOut_45_0;
                              break L9;
                            }
                          }
                          L10: {
                            var8 = stackIn_47_0;
                            param3 = param3 * var7;
                            param1 = param1 * var8;
                            if (param1 >= param3) {
                              var9 = 1;
                              L11: while (true) {
                                if (param1 < var9) {
                                  break L10;
                                } else {
                                  var10 = param3 * var9 / param1;
                                  var11 = (param2 - -(var8 * var9)) * ((ul) this).field_e + (param4 - -(var7 * var10));
                                  ((ul) this).field_c[var7 * var10 + (15 - -((15 + var8 * var9) * 30))] = true;
                                  if (!param5) {
                                    if (((ul) this).field_k[var11].b(928)) {
                                      break L10;
                                    } else {
                                      var9++;
                                      continue L11;
                                    }
                                  } else {
                                    var9++;
                                    continue L11;
                                  }
                                }
                              }
                            } else {
                              var9 = 1;
                              L12: while (true) {
                                if (param3 < var9) {
                                  break L10;
                                } else {
                                  var10 = param1 * var9 / param3;
                                  var11 = var9 * var7 + (param4 - -(((ul) this).field_e * (param2 + var10 * var8)));
                                  ((ul) this).field_c[15 + var7 * var9 - -((15 + var8 * var10) * 30)] = true;
                                  if (!param5) {
                                    if (((ul) this).field_k[var11].b(928)) {
                                      break L10;
                                    } else {
                                      var9++;
                                      continue L12;
                                    }
                                  } else {
                                    var9++;
                                    continue L12;
                                  }
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
        ((ul) this).field_h = param0;
        ((ul) this).field_l = param3;
        ((ul) this).field_e = param2;
        ((ul) this).field_k = param1;
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
