/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    private static int[] field_a;
    static int field_h;
    private static boolean field_p;
    static de field_b;
    static boolean field_c;
    static int[] field_j;
    private static float field_d;
    static int[] field_i;
    static int field_f;
    private static boolean field_q;
    static int[] field_m;
    static int[] field_l;
    static int field_e;
    static int[] field_o;
    static int field_k;
    static boolean field_n;
    static int field_g;

    final static void a(int param0, int param1) {
        int var2 = field_l[0];
        int var3 = var2 / fn.field_g;
        int var4 = var2 - var3 * fn.field_g;
        field_k = param0 - var4;
        field_f = param1 - var3;
    }

    final static void b(float param0) {
        ti.a(param0);
        ti.c(0, 512);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        L0: {
          if (!field_c) {
            break L0;
          } else {
            L1: {
              if (param6 <= field_e) {
                break L1;
              } else {
                param6 = field_e;
                break L1;
              }
            }
            if (param5 >= 0) {
              break L0;
            } else {
              param5 = 0;
              break L0;
            }
          }
        }
        if (param5 < param6) {
          L2: {
            param4 = param4 + param5;
            param7 = param7 + param8 * param5;
            var17 = param6 - param5;
            if (!field_p) {
              L3: {
                var23 = param5 - field_k;
                param9 = param9 + (param12 >> 3) * var23;
                param10 = param10 + (param13 >> 3) * var23;
                param11 = param11 + (param14 >> 3) * var23;
                var22 = param11 >> 14;
                if (var22 == 0) {
                  var18 = 0;
                  var19 = 0;
                  break L3;
                } else {
                  var18 = param9 / var22;
                  var19 = param10 / var22;
                  break L3;
                }
              }
              L4: {
                param9 = param9 + param12;
                param10 = param10 + param13;
                param11 = param11 + param14;
                var22 = param11 >> 14;
                if (var22 == 0) {
                  var20 = 0;
                  var21 = 0;
                  break L4;
                } else {
                  var20 = param9 / var22;
                  var21 = param10 / var22;
                  break L4;
                }
              }
              param2 = (var18 << 18) + var19;
              var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
              var17 = var17 >> 3;
              param8 = param8 << 3;
              var15 = param7 >> 8;
              if (!field_q) {
                L5: {
                  if (var17 <= 0) {
                    break L5;
                  } else {
                    L6: while (true) {
                      L7: {
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        if (param1[(param2 & 16256) + (param2 >>> 25)] == 0) {
                          break L7;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L7;
                        }
                      }
                      L8: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        if (param1[(param2 & 16256) + (param2 >>> 25)] == 0) {
                          break L8;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L8;
                        }
                      }
                      L9: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        if (param1[(param2 & 16256) + (param2 >>> 25)] == 0) {
                          break L9;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L9;
                        }
                      }
                      L10: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        if (param1[(param2 & 16256) + (param2 >>> 25)] == 0) {
                          break L10;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L10;
                        }
                      }
                      L11: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        if (param1[(param2 & 16256) + (param2 >>> 25)] == 0) {
                          break L11;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L11;
                        }
                      }
                      L12: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        if (param1[(param2 & 16256) + (param2 >>> 25)] == 0) {
                          break L12;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L12;
                        }
                      }
                      L13: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        if (param1[(param2 & 16256) + (param2 >>> 25)] == 0) {
                          break L13;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L13;
                        }
                      }
                      L14: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        if (param1[(param2 & 16256) + (param2 >>> 25)] == 0) {
                          break L14;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L14;
                        }
                      }
                      L15: {
                        param4++;
                        param2 = param2 + var16;
                        var18 = var20;
                        var19 = var21;
                        param9 = param9 + param12;
                        param10 = param10 + param13;
                        param11 = param11 + param14;
                        var22 = param11 >> 14;
                        if (var22 == 0) {
                          var20 = 0;
                          var21 = 0;
                          break L15;
                        } else {
                          var20 = param9 / var22;
                          var21 = param10 / var22;
                          break L15;
                        }
                      }
                      param2 = (var18 << 18) + var19;
                      var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                      param7 = param7 + param8;
                      var15 = param7 >> 8;
                      var17--;
                      if (var17 > 0) {
                        continue L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var17 = param6 - param5 & 7;
                if (var17 <= 0) {
                  break L2;
                } else {
                  L16: while (true) {
                    L17: {
                      param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                      if (param1[(param2 & 16256) + (param2 >>> 25)] == 0) {
                        break L17;
                      } else {
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        break L17;
                      }
                    }
                    param4++;
                    param2 = param2 + var16;
                    var17--;
                    if (var17 > 0) {
                      continue L16;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                L18: {
                  if (var17 <= 0) {
                    break L18;
                  } else {
                    L19: while (true) {
                      L20: {
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        var18 = var20;
                        var19 = var21;
                        param9 = param9 + param12;
                        param10 = param10 + param13;
                        param11 = param11 + param14;
                        var22 = param11 >> 14;
                        if (var22 == 0) {
                          var20 = 0;
                          var21 = 0;
                          break L20;
                        } else {
                          var20 = param9 / var22;
                          var21 = param10 / var22;
                          break L20;
                        }
                      }
                      param2 = (var18 << 18) + var19;
                      var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                      param7 = param7 + param8;
                      var15 = param7 >> 8;
                      var17--;
                      if (var17 > 0) {
                        continue L19;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
                var17 = param6 - param5 & 7;
                if (var17 <= 0) {
                  break L2;
                } else {
                  L21: while (true) {
                    param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                    param4++;
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    var17--;
                    if (var17 > 0) {
                      continue L21;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            } else {
              L22: {
                var23 = param5 - field_k;
                param9 = param9 + (param12 >> 3) * var23;
                param10 = param10 + (param13 >> 3) * var23;
                param11 = param11 + (param14 >> 3) * var23;
                var22 = param11 >> 12;
                if (var22 == 0) {
                  var18 = 0;
                  var19 = 0;
                  break L22;
                } else {
                  var18 = param9 / var22;
                  var19 = param10 / var22;
                  break L22;
                }
              }
              L23: {
                param9 = param9 + param12;
                param10 = param10 + param13;
                param11 = param11 + param14;
                var22 = param11 >> 12;
                if (var22 == 0) {
                  var20 = 0;
                  var21 = 0;
                  break L23;
                } else {
                  var20 = param9 / var22;
                  var21 = param10 / var22;
                  break L23;
                }
              }
              param2 = (var18 << 20) + var19;
              var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
              var17 = var17 >> 3;
              param8 = param8 << 3;
              var15 = param7 >> 8;
              if (!field_q) {
                L24: {
                  if (var17 <= 0) {
                    break L24;
                  } else {
                    L25: while (true) {
                      L26: {
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        if (param1[(param2 & 4032) + (param2 >>> 26)] == 0) {
                          break L26;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L26;
                        }
                      }
                      L27: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        if (param1[(param2 & 4032) + (param2 >>> 26)] == 0) {
                          break L27;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L27;
                        }
                      }
                      L28: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        if (param1[(param2 & 4032) + (param2 >>> 26)] == 0) {
                          break L28;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L28;
                        }
                      }
                      L29: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        if (param1[(param2 & 4032) + (param2 >>> 26)] == 0) {
                          break L29;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L29;
                        }
                      }
                      L30: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        if (param1[(param2 & 4032) + (param2 >>> 26)] == 0) {
                          break L30;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L30;
                        }
                      }
                      L31: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        if (param1[(param2 & 4032) + (param2 >>> 26)] == 0) {
                          break L31;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L31;
                        }
                      }
                      L32: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        if (param1[(param2 & 4032) + (param2 >>> 26)] == 0) {
                          break L32;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L32;
                        }
                      }
                      L33: {
                        param4++;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        if (param1[(param2 & 4032) + (param2 >>> 26)] == 0) {
                          break L33;
                        } else {
                          param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                          break L33;
                        }
                      }
                      L34: {
                        param4++;
                        param2 = param2 + var16;
                        var18 = var20;
                        var19 = var21;
                        param9 = param9 + param12;
                        param10 = param10 + param13;
                        param11 = param11 + param14;
                        var22 = param11 >> 12;
                        if (var22 == 0) {
                          var20 = 0;
                          var21 = 0;
                          break L34;
                        } else {
                          var20 = param9 / var22;
                          var21 = param10 / var22;
                          break L34;
                        }
                      }
                      param2 = (var18 << 20) + var19;
                      var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                      param7 = param7 + param8;
                      var15 = param7 >> 8;
                      var17--;
                      if (var17 > 0) {
                        continue L25;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                var17 = param6 - param5 & 7;
                if (var17 <= 0) {
                  break L2;
                } else {
                  L35: while (true) {
                    L36: {
                      param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                      if (param1[(param2 & 4032) + (param2 >>> 26)] == 0) {
                        break L36;
                      } else {
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        break L36;
                      }
                    }
                    param4++;
                    param2 = param2 + var16;
                    var17--;
                    if (var17 > 0) {
                      continue L35;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                L37: {
                  if (var17 <= 0) {
                    break L37;
                  } else {
                    L38: while (true) {
                      L39: {
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                        param4++;
                        param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                        param2 = param2 + var16;
                        var18 = var20;
                        var19 = var21;
                        param9 = param9 + param12;
                        param10 = param10 + param13;
                        param11 = param11 + param14;
                        var22 = param11 >> 12;
                        if (var22 == 0) {
                          var20 = 0;
                          var21 = 0;
                          break L39;
                        } else {
                          var20 = param9 / var22;
                          var21 = param10 / var22;
                          break L39;
                        }
                      }
                      param2 = (var18 << 20) + var19;
                      var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                      param7 = param7 + param8;
                      var15 = param7 >> 8;
                      var17--;
                      if (var17 > 0) {
                        continue L38;
                      } else {
                        break L37;
                      }
                    }
                  }
                }
                var17 = param6 - param5 & 7;
                if (var17 <= 0) {
                  break L2;
                } else {
                  L40: while (true) {
                    param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                    param4++;
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    var17--;
                    if (var17 > 0) {
                      continue L40;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(float param0) {
        field_d = param0;
        field_d = (float)((double)field_d + (Math.random() * 0.03 - 0.015));
    }

    final static void a() {
        field_k = field_e / 2;
        field_f = field_g / 2;
    }

    final static void c(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        double var4 = 0.0;
        double var6 = 0.0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        double var17_double = 0.0;
        int var18 = 0;
        int var19 = 0;
        double var19_double = 0.0;
        int var20 = 0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        var2 = param0 * 128;
        var3 = param0;
        L0: while (true) {
          if (var3 >= param1) {
            return;
          } else {
            var4 = (double)(var3 >> 3) / 64.0 + 0.0078125;
            var6 = (double)(var3 & 7) / 8.0 + 0.0625;
            var8 = 0;
            L1: while (true) {
              if (var8 >= 128) {
                var3++;
                continue L0;
              } else {
                L2: {
                  var9 = (double)var8 / 128.0;
                  var11 = var9;
                  var13 = var9;
                  var15 = var9;
                  if (var6 == 0.0) {
                    break L2;
                  } else {
                    L3: {
                      if (var9 >= 0.5) {
                        var17_double = var9 + var6 - var9 * var6;
                        break L3;
                      } else {
                        var17_double = var9 * (1.0 + var6);
                        break L3;
                      }
                    }
                    L4: {
                      var19_double = 2.0 * var9 - var17_double;
                      var21 = var4 + 0.3333333333333333;
                      if (var21 <= 1.0) {
                        break L4;
                      } else {
                        var21 = var21 - 1.0;
                        break L4;
                      }
                    }
                    L5: {
                      var23 = var4;
                      var25 = var4 - 0.3333333333333333;
                      if (var25 >= 0.0) {
                        break L5;
                      } else {
                        var25 = var25 + 1.0;
                        break L5;
                      }
                    }
                    L6: {
                      if (6.0 * var21 >= 1.0) {
                        if (2.0 * var21 >= 1.0) {
                          if (3.0 * var21 >= 2.0) {
                            var11 = var19_double;
                            break L6;
                          } else {
                            var11 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var21) * 6.0;
                            break L6;
                          }
                        } else {
                          var11 = var17_double;
                          break L6;
                        }
                      } else {
                        var11 = var19_double + (var17_double - var19_double) * 6.0 * var21;
                        break L6;
                      }
                    }
                    L7: {
                      if (6.0 * var23 >= 1.0) {
                        if (2.0 * var23 >= 1.0) {
                          if (3.0 * var23 >= 2.0) {
                            var13 = var19_double;
                            break L7;
                          } else {
                            var13 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var23) * 6.0;
                            break L7;
                          }
                        } else {
                          var13 = var17_double;
                          break L7;
                        }
                      } else {
                        var13 = var19_double + (var17_double - var19_double) * 6.0 * var23;
                        break L7;
                      }
                    }
                    if (6.0 * var25 >= 1.0) {
                      if (2.0 * var25 >= 1.0) {
                        if (3.0 * var25 >= 2.0) {
                          var15 = var19_double;
                          break L2;
                        } else {
                          var15 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var25) * 6.0;
                          break L2;
                        }
                      } else {
                        var15 = var17_double;
                        break L2;
                      }
                    } else {
                      var15 = var19_double + (var17_double - var19_double) * 6.0 * var25;
                      break L2;
                    }
                  }
                }
                L8: {
                  var11 = Math.pow(var11, (double)field_d);
                  var13 = Math.pow(var13, (double)field_d);
                  var15 = Math.pow(var15, (double)field_d);
                  var17 = (int)(var11 * 256.0);
                  var18 = (int)(var13 * 256.0);
                  var19 = (int)(var15 * 256.0);
                  var20 = (var17 << 16) + (var18 << 8) + var19;
                  if (var20 != 0) {
                    break L8;
                  } else {
                    var20 = 1;
                    break L8;
                  }
                }
                var2++;
                field_o[var2] = var20;
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (!field_c) {
            break L0;
          } else {
            L1: {
              if (param5 <= field_e) {
                break L1;
              } else {
                param5 = field_e;
                break L1;
              }
            }
            if (param4 >= 0) {
              break L0;
            } else {
              param4 = 0;
              break L0;
            }
          }
        }
        if (param4 < param5) {
          param1 = param1 + param4;
          param3 = param5 - param4 >> 2;
          if (field_h != 0) {
            L2: {
              if (field_h != 254) {
                var6 = field_h;
                var7 = 256 - field_h;
                param2 = ((param2 & 16711935) * var7 >> 8 & 16711935) + ((param2 & 65280) * var7 >> 8 & 65280);
                L3: while (true) {
                  param3--;
                  if (param3 < 0) {
                    param3 = param5 - param4 & 3;
                    L4: while (true) {
                      param3--;
                      if (param3 < 0) {
                        break L2;
                      } else {
                        var8 = param0[param1];
                        param1++;
                        param0[param1] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                        continue L4;
                      }
                    }
                  } else {
                    var8 = param0[param1];
                    param1++;
                    param0[param1] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    param1++;
                    param0[param1] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    param1++;
                    param0[param1] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    param1++;
                    param0[param1] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    continue L3;
                  }
                }
              } else {
                L5: while (true) {
                  param3--;
                  if (param3 < 0) {
                    param3 = param5 - param4 & 3;
                    L6: while (true) {
                      param3--;
                      if (param3 < 0) {
                        break L2;
                      } else {
                        param1++;
                        param0[param1] = param0[param1];
                        continue L6;
                      }
                    }
                  } else {
                    param1++;
                    param0[param1] = param0[param1];
                    param1++;
                    param0[param1] = param0[param1];
                    param1++;
                    param0[param1] = param0[param1];
                    param1++;
                    param0[param1] = param0[param1];
                    continue L5;
                  }
                }
              }
            }
            return;
          } else {
            L7: while (true) {
              param3--;
              if (param3 < 0) {
                param3 = param5 - param4 & 3;
                L8: while (true) {
                  param3--;
                  if (param3 < 0) {
                    return;
                  } else {
                    param1++;
                    param0[param1] = param2;
                    continue L8;
                  }
                }
              } else {
                param1++;
                param0[param1] = param2;
                param1++;
                param0[param1] = param2;
                param1++;
                param0[param1] = param2;
                param1++;
                param0[param1] = param2;
                continue L7;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void c() {
        field_l = null;
        field_o = null;
        field_b = null;
        field_a = null;
        field_i = null;
        field_m = null;
        field_j = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var7 = 0;
          if (param1 == param0) {
            break L0;
          } else {
            var7 = (param4 - param3 << 16) / (param1 - param0);
            break L0;
          }
        }
        L1: {
          var8 = 0;
          if (param2 == param1) {
            break L1;
          } else {
            var8 = (param5 - param4 << 16) / (param2 - param1);
            break L1;
          }
        }
        L2: {
          var9 = 0;
          if (param2 == param0) {
            break L2;
          } else {
            var9 = (param3 - param5 << 16) / (param0 - param2);
            break L2;
          }
        }
        L3: {
          if (param0 > param1) {
            break L3;
          } else {
            if (param0 > param2) {
              break L3;
            } else {
              if (param0 < field_g) {
                L4: {
                  if (param1 <= field_g) {
                    break L4;
                  } else {
                    param1 = field_g;
                    break L4;
                  }
                }
                L5: {
                  if (param2 <= field_g) {
                    break L5;
                  } else {
                    param2 = field_g;
                    break L5;
                  }
                }
                if (param1 >= param2) {
                  L6: {
                    param3 = param3 << 16;
                    param4 = param3 << 16;
                    if (param0 >= 0) {
                      break L6;
                    } else {
                      param4 = param4 - var9 * param0;
                      param3 = param3 - var7 * param0;
                      param0 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    param5 = param5 << 16;
                    if (param2 >= 0) {
                      break L7;
                    } else {
                      param5 = param5 - var8 * param2;
                      param2 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      if (param0 == param2) {
                        break L9;
                      } else {
                        if (var9 < var7) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param0 != param2) {
                        break L10;
                      } else {
                        if (var8 <= var7) {
                          break L10;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param1 = param1 - param2;
                    param2 = param2 - param0;
                    param0 = field_l[param0];
                    L11: while (true) {
                      param2--;
                      if (param2 < 0) {
                        param1--;
                        L12: while (true) {
                          if (param1 < 0) {
                            return;
                          } else {
                            ti.a(fn.field_h, param0, param6, 0, param3 >> 16, param5 >> 16);
                            param5 = param5 + var8;
                            param3 = param3 + var7;
                            param0 = param0 + fn.field_g;
                            param1--;
                            continue L12;
                          }
                        }
                      } else {
                        ti.a(fn.field_h, param0, param6, 0, param3 >> 16, param4 >> 16);
                        param4 = param4 + var9;
                        param3 = param3 + var7;
                        param0 = param0 + fn.field_g;
                        continue L11;
                      }
                    }
                  }
                  param1 = param1 - param2;
                  param2 = param2 - param0;
                  param0 = field_l[param0];
                  L13: while (true) {
                    param2--;
                    if (param2 < 0) {
                      param1--;
                      L14: while (true) {
                        if (param1 < 0) {
                          return;
                        } else {
                          ti.a(fn.field_h, param0, param6, 0, param5 >> 16, param3 >> 16);
                          param5 = param5 + var8;
                          param3 = param3 + var7;
                          param0 = param0 + fn.field_g;
                          param1--;
                          continue L14;
                        }
                      }
                    } else {
                      ti.a(fn.field_h, param0, param6, 0, param4 >> 16, param3 >> 16);
                      param4 = param4 + var9;
                      param3 = param3 + var7;
                      param0 = param0 + fn.field_g;
                      continue L13;
                    }
                  }
                } else {
                  L15: {
                    param3 = param3 << 16;
                    param5 = param3 << 16;
                    if (param0 >= 0) {
                      break L15;
                    } else {
                      param5 = param5 - var9 * param0;
                      param3 = param3 - var7 * param0;
                      param0 = 0;
                      break L15;
                    }
                  }
                  L16: {
                    param4 = param4 << 16;
                    if (param1 >= 0) {
                      break L16;
                    } else {
                      param4 = param4 - var8 * param1;
                      param1 = 0;
                      break L16;
                    }
                  }
                  L17: {
                    L18: {
                      if (param0 == param1) {
                        break L18;
                      } else {
                        if (var9 < var7) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (param0 != param1) {
                        break L19;
                      } else {
                        if (var9 <= var8) {
                          break L19;
                        } else {
                          break L17;
                        }
                      }
                    }
                    param2 = param2 - param1;
                    param1 = param1 - param0;
                    param0 = field_l[param0];
                    L20: while (true) {
                      param1--;
                      if (param1 < 0) {
                        param2--;
                        L21: while (true) {
                          if (param2 < 0) {
                            return;
                          } else {
                            ti.a(fn.field_h, param0, param6, 0, param4 >> 16, param5 >> 16);
                            param5 = param5 + var9;
                            param4 = param4 + var8;
                            param0 = param0 + fn.field_g;
                            param2--;
                            continue L21;
                          }
                        }
                      } else {
                        ti.a(fn.field_h, param0, param6, 0, param3 >> 16, param5 >> 16);
                        param5 = param5 + var9;
                        param3 = param3 + var7;
                        param0 = param0 + fn.field_g;
                        continue L20;
                      }
                    }
                  }
                  param2 = param2 - param1;
                  param1 = param1 - param0;
                  param0 = field_l[param0];
                  L22: while (true) {
                    param1--;
                    if (param1 < 0) {
                      param2--;
                      L23: while (true) {
                        if (param2 < 0) {
                          return;
                        } else {
                          ti.a(fn.field_h, param0, param6, 0, param5 >> 16, param4 >> 16);
                          param5 = param5 + var9;
                          param4 = param4 + var8;
                          param0 = param0 + fn.field_g;
                          param2--;
                          continue L23;
                        }
                      }
                    } else {
                      ti.a(fn.field_h, param0, param6, 0, param5 >> 16, param3 >> 16);
                      param5 = param5 + var9;
                      param3 = param3 + var7;
                      param0 = param0 + fn.field_g;
                      continue L22;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        if (param1 > param2) {
          if (param2 < field_g) {
            L24: {
              if (param0 <= field_g) {
                break L24;
              } else {
                param0 = field_g;
                break L24;
              }
            }
            L25: {
              if (param1 <= field_g) {
                break L25;
              } else {
                param1 = field_g;
                break L25;
              }
            }
            if (param0 >= param1) {
              L26: {
                param5 = param5 << 16;
                param3 = param5 << 16;
                if (param2 >= 0) {
                  break L26;
                } else {
                  param3 = param3 - var8 * param2;
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L26;
                }
              }
              L27: {
                param4 = param4 << 16;
                if (param1 >= 0) {
                  break L27;
                } else {
                  param4 = param4 - var7 * param1;
                  param1 = 0;
                  break L27;
                }
              }
              if (var8 >= var9) {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = field_l[param2];
                L28: while (true) {
                  param1--;
                  if (param1 < 0) {
                    param0--;
                    L29: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        ti.a(fn.field_h, param2, param6, 0, param5 >> 16, param4 >> 16);
                        param4 = param4 + var7;
                        param5 = param5 + var9;
                        param2 = param2 + fn.field_g;
                        param0--;
                        continue L29;
                      }
                    }
                  } else {
                    ti.a(fn.field_h, param2, param6, 0, param5 >> 16, param3 >> 16);
                    param3 = param3 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + fn.field_g;
                    continue L28;
                  }
                }
              } else {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = field_l[param2];
                L30: while (true) {
                  param1--;
                  if (param1 < 0) {
                    param0--;
                    L31: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        ti.a(fn.field_h, param2, param6, 0, param4 >> 16, param5 >> 16);
                        param4 = param4 + var7;
                        param5 = param5 + var9;
                        param2 = param2 + fn.field_g;
                        param0--;
                        continue L31;
                      }
                    }
                  } else {
                    ti.a(fn.field_h, param2, param6, 0, param3 >> 16, param5 >> 16);
                    param3 = param3 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + fn.field_g;
                    continue L30;
                  }
                }
              }
            } else {
              L32: {
                param5 = param5 << 16;
                param4 = param5 << 16;
                if (param2 >= 0) {
                  break L32;
                } else {
                  param4 = param4 - var8 * param2;
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L32;
                }
              }
              L33: {
                param3 = param3 << 16;
                if (param0 >= 0) {
                  break L33;
                } else {
                  param3 = param3 - var7 * param0;
                  param0 = 0;
                  break L33;
                }
              }
              if (var8 >= var9) {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = field_l[param2];
                L34: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param1--;
                    L35: while (true) {
                      if (param1 < 0) {
                        return;
                      } else {
                        ti.a(fn.field_h, param2, param6, 0, param3 >> 16, param4 >> 16);
                        param4 = param4 + var8;
                        param3 = param3 + var7;
                        param2 = param2 + fn.field_g;
                        param1--;
                        continue L35;
                      }
                    }
                  } else {
                    ti.a(fn.field_h, param2, param6, 0, param5 >> 16, param4 >> 16);
                    param4 = param4 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + fn.field_g;
                    continue L34;
                  }
                }
              } else {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = field_l[param2];
                L36: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param1--;
                    L37: while (true) {
                      if (param1 < 0) {
                        return;
                      } else {
                        ti.a(fn.field_h, param2, param6, 0, param4 >> 16, param3 >> 16);
                        param4 = param4 + var8;
                        param3 = param3 + var7;
                        param2 = param2 + fn.field_g;
                        param1--;
                        continue L37;
                      }
                    }
                  } else {
                    ti.a(fn.field_h, param2, param6, 0, param4 >> 16, param5 >> 16);
                    param4 = param4 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + fn.field_g;
                    continue L36;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          if (param1 < field_g) {
            L38: {
              if (param2 <= field_g) {
                break L38;
              } else {
                param2 = field_g;
                break L38;
              }
            }
            L39: {
              if (param0 <= field_g) {
                break L39;
              } else {
                param0 = field_g;
                break L39;
              }
            }
            if (param2 >= param0) {
              L40: {
                param4 = param4 << 16;
                param5 = param4 << 16;
                if (param1 >= 0) {
                  break L40;
                } else {
                  param5 = param5 - var7 * param1;
                  param4 = param4 - var8 * param1;
                  param1 = 0;
                  break L40;
                }
              }
              L41: {
                param3 = param3 << 16;
                if (param0 >= 0) {
                  break L41;
                } else {
                  param3 = param3 - var9 * param0;
                  param0 = 0;
                  break L41;
                }
              }
              if (var7 >= var8) {
                param2 = param2 - param0;
                param0 = param0 - param1;
                param1 = field_l[param1];
                L42: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param2--;
                    L43: while (true) {
                      if (param2 < 0) {
                        return;
                      } else {
                        ti.a(fn.field_h, param1, param6, 0, param4 >> 16, param3 >> 16);
                        param3 = param3 + var9;
                        param4 = param4 + var8;
                        param1 = param1 + fn.field_g;
                        param2--;
                        continue L43;
                      }
                    }
                  } else {
                    ti.a(fn.field_h, param1, param6, 0, param4 >> 16, param5 >> 16);
                    param5 = param5 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + fn.field_g;
                    continue L42;
                  }
                }
              } else {
                param2 = param2 - param0;
                param0 = param0 - param1;
                param1 = field_l[param1];
                L44: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param2--;
                    L45: while (true) {
                      if (param2 < 0) {
                        return;
                      } else {
                        ti.a(fn.field_h, param1, param6, 0, param3 >> 16, param4 >> 16);
                        param3 = param3 + var9;
                        param4 = param4 + var8;
                        param1 = param1 + fn.field_g;
                        param2--;
                        continue L45;
                      }
                    }
                  } else {
                    ti.a(fn.field_h, param1, param6, 0, param5 >> 16, param4 >> 16);
                    param5 = param5 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + fn.field_g;
                    continue L44;
                  }
                }
              }
            } else {
              L46: {
                param4 = param4 << 16;
                param3 = param4 << 16;
                if (param1 >= 0) {
                  break L46;
                } else {
                  param3 = param3 - var7 * param1;
                  param4 = param4 - var8 * param1;
                  param1 = 0;
                  break L46;
                }
              }
              L47: {
                param5 = param5 << 16;
                if (param2 >= 0) {
                  break L47;
                } else {
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L47;
                }
              }
              L48: {
                L49: {
                  if (param1 == param2) {
                    break L49;
                  } else {
                    if (var7 < var8) {
                      break L48;
                    } else {
                      break L49;
                    }
                  }
                }
                L50: {
                  if (param1 != param2) {
                    break L50;
                  } else {
                    if (var7 <= var9) {
                      break L50;
                    } else {
                      break L48;
                    }
                  }
                }
                param0 = param0 - param2;
                param2 = param2 - param1;
                param1 = field_l[param1];
                L51: while (true) {
                  param2--;
                  if (param2 < 0) {
                    param0--;
                    L52: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        ti.a(fn.field_h, param1, param6, 0, param5 >> 16, param3 >> 16);
                        param3 = param3 + var7;
                        param5 = param5 + var9;
                        param1 = param1 + fn.field_g;
                        param0--;
                        continue L52;
                      }
                    }
                  } else {
                    ti.a(fn.field_h, param1, param6, 0, param4 >> 16, param3 >> 16);
                    param3 = param3 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + fn.field_g;
                    continue L51;
                  }
                }
              }
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = field_l[param1];
              L53: while (true) {
                param2--;
                if (param2 < 0) {
                  param0--;
                  L54: while (true) {
                    if (param0 < 0) {
                      return;
                    } else {
                      ti.a(fn.field_h, param1, param6, 0, param3 >> 16, param5 >> 16);
                      param3 = param3 + var7;
                      param5 = param5 + var9;
                      param1 = param1 + fn.field_g;
                      param0--;
                      continue L54;
                    }
                  }
                } else {
                  ti.a(fn.field_h, param1, param6, 0, param3 >> 16, param4 >> 16);
                  param3 = param3 + var7;
                  param4 = param4 + var8;
                  param1 = param1 + fn.field_g;
                  continue L53;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final static int b(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
            param1 = 2;
        } else {
            if (param1 > 126) {
                param1 = 126;
            }
        }
        return (param0 & 65408) + param1;
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (!field_c) {
            break L0;
          } else {
            L1: {
              if (param5 <= field_e) {
                break L1;
              } else {
                param5 = field_e;
                break L1;
              }
            }
            if (param4 >= 0) {
              break L0;
            } else {
              param4 = 0;
              break L0;
            }
          }
        }
        if (param4 < param5) {
          param1 = param1 + param4;
          param6 = param6 + param7 * param4;
          if (!field_n) {
            L2: {
              param3 = param5 - param4;
              if (field_h != 0) {
                var8 = field_h;
                var9 = 256 - field_h;
                L3: while (true) {
                  param2 = field_o[param6 >> 8];
                  param6 = param6 + param7;
                  param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
                  var10 = param0[param1];
                  param1++;
                  param0[param1] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                  param3--;
                  if (param3 > 0) {
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              } else {
                L4: while (true) {
                  param1++;
                  param0[param1] = field_o[param6 >> 8];
                  param6 = param6 + param7;
                  param3--;
                  if (param3 > 0) {
                    continue L4;
                  } else {
                    break L2;
                  }
                }
              }
            }
            return;
          } else {
            L5: {
              param3 = param5 - param4 >> 2;
              param7 = param7 << 2;
              if (field_h != 0) {
                L6: {
                  var8 = field_h;
                  var9 = 256 - field_h;
                  if (param3 <= 0) {
                    break L6;
                  } else {
                    L7: while (true) {
                      param2 = field_o[param6 >> 8];
                      param6 = param6 + param7;
                      param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
                      var10 = param0[param1];
                      param1++;
                      param0[param1] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                      var10 = param0[param1];
                      param1++;
                      param0[param1] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                      var10 = param0[param1];
                      param1++;
                      param0[param1] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                      var10 = param0[param1];
                      param1++;
                      param0[param1] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                      param3--;
                      if (param3 > 0) {
                        continue L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                param3 = param5 - param4 & 3;
                if (param3 <= 0) {
                  break L5;
                } else {
                  param2 = field_o[param6 >> 8];
                  param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
                  L8: while (true) {
                    var10 = param0[param1];
                    param1++;
                    param0[param1] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                    param3--;
                    if (param3 > 0) {
                      continue L8;
                    } else {
                      break L5;
                    }
                  }
                }
              } else {
                L9: {
                  if (param3 <= 0) {
                    break L9;
                  } else {
                    L10: while (true) {
                      param2 = field_o[param6 >> 8];
                      param6 = param6 + param7;
                      param1++;
                      param0[param1] = param2;
                      param1++;
                      param0[param1] = param2;
                      param1++;
                      param0[param1] = param2;
                      param1++;
                      param0[param1] = param2;
                      param3--;
                      if (param3 > 0) {
                        continue L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                param3 = param5 - param4 & 3;
                if (param3 <= 0) {
                  return;
                } else {
                  param2 = field_o[param6 >> 8];
                  L11: while (true) {
                    param1++;
                    param0[param1] = param2;
                    param3--;
                    if (param3 > 0) {
                      continue L11;
                    } else {
                      break L5;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(de param0) {
        field_b = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var9 = param4 - param3;
          var10 = param1 - param0;
          var11 = param5 - param3;
          var12 = param2 - param0;
          var13 = param7 - param6;
          var14 = param8 - param6;
          if (param2 == param1) {
            var15 = 0;
            break L0;
          } else {
            var15 = (param5 - param4 << 16) / (param2 - param1);
            break L0;
          }
        }
        L1: {
          if (param1 == param0) {
            var16 = 0;
            break L1;
          } else {
            var16 = (var9 << 16) / var10;
            break L1;
          }
        }
        L2: {
          if (param2 == param0) {
            var17 = 0;
            break L2;
          } else {
            var17 = (var11 << 16) / var12;
            break L2;
          }
        }
        var18 = var9 * var12 - var11 * var10;
        if (var18 != 0) {
          L3: {
            var19 = (var13 * var12 - var14 * var10 << 8) / var18;
            var20 = (var14 * var9 - var13 * var11 << 8) / var18;
            if (param0 > param1) {
              break L3;
            } else {
              if (param0 > param2) {
                break L3;
              } else {
                if (param0 < field_g) {
                  L4: {
                    if (param1 <= field_g) {
                      break L4;
                    } else {
                      param1 = field_g;
                      break L4;
                    }
                  }
                  L5: {
                    if (param2 <= field_g) {
                      break L5;
                    } else {
                      param2 = field_g;
                      break L5;
                    }
                  }
                  param6 = (param6 << 8) - var19 * param3 + var19;
                  if (param1 >= param2) {
                    L6: {
                      param3 = param3 << 16;
                      param4 = param3 << 16;
                      if (param0 >= 0) {
                        break L6;
                      } else {
                        param4 = param4 - var17 * param0;
                        param3 = param3 - var16 * param0;
                        param6 = param6 - var20 * param0;
                        param0 = 0;
                        break L6;
                      }
                    }
                    L7: {
                      param5 = param5 << 16;
                      if (param2 >= 0) {
                        break L7;
                      } else {
                        param5 = param5 - var15 * param2;
                        param2 = 0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        if (param0 == param2) {
                          break L9;
                        } else {
                          if (var17 < var16) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (param0 != param2) {
                          break L10;
                        } else {
                          if (var15 <= var16) {
                            break L10;
                          } else {
                            break L8;
                          }
                        }
                      }
                      param1 = param1 - param2;
                      param2 = param2 - param0;
                      param0 = field_l[param0];
                      L11: while (true) {
                        param2--;
                        if (param2 < 0) {
                          param1--;
                          L12: while (true) {
                            if (param1 < 0) {
                              return;
                            } else {
                              ti.a(fn.field_h, param0, 0, 0, param3 >> 16, param5 >> 16, param6, var19);
                              param5 = param5 + var15;
                              param3 = param3 + var16;
                              param6 = param6 + var20;
                              param0 = param0 + fn.field_g;
                              param1--;
                              continue L12;
                            }
                          }
                        } else {
                          ti.a(fn.field_h, param0, 0, 0, param3 >> 16, param4 >> 16, param6, var19);
                          param4 = param4 + var17;
                          param3 = param3 + var16;
                          param6 = param6 + var20;
                          param0 = param0 + fn.field_g;
                          continue L11;
                        }
                      }
                    }
                    param1 = param1 - param2;
                    param2 = param2 - param0;
                    param0 = field_l[param0];
                    L13: while (true) {
                      param2--;
                      if (param2 < 0) {
                        param1--;
                        L14: while (true) {
                          if (param1 < 0) {
                            return;
                          } else {
                            ti.a(fn.field_h, param0, 0, 0, param5 >> 16, param3 >> 16, param6, var19);
                            param5 = param5 + var15;
                            param3 = param3 + var16;
                            param6 = param6 + var20;
                            param0 = param0 + fn.field_g;
                            param1--;
                            continue L14;
                          }
                        }
                      } else {
                        ti.a(fn.field_h, param0, 0, 0, param4 >> 16, param3 >> 16, param6, var19);
                        param4 = param4 + var17;
                        param3 = param3 + var16;
                        param6 = param6 + var20;
                        param0 = param0 + fn.field_g;
                        continue L13;
                      }
                    }
                  } else {
                    L15: {
                      param3 = param3 << 16;
                      param5 = param3 << 16;
                      if (param0 >= 0) {
                        break L15;
                      } else {
                        param5 = param5 - var17 * param0;
                        param3 = param3 - var16 * param0;
                        param6 = param6 - var20 * param0;
                        param0 = 0;
                        break L15;
                      }
                    }
                    L16: {
                      param4 = param4 << 16;
                      if (param1 >= 0) {
                        break L16;
                      } else {
                        param4 = param4 - var15 * param1;
                        param1 = 0;
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        if (param0 == param1) {
                          break L18;
                        } else {
                          if (var17 < var16) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (param0 != param1) {
                          break L19;
                        } else {
                          if (var17 <= var15) {
                            break L19;
                          } else {
                            break L17;
                          }
                        }
                      }
                      param2 = param2 - param1;
                      param1 = param1 - param0;
                      param0 = field_l[param0];
                      L20: while (true) {
                        param1--;
                        if (param1 < 0) {
                          param2--;
                          L21: while (true) {
                            if (param2 < 0) {
                              return;
                            } else {
                              ti.a(fn.field_h, param0, 0, 0, param4 >> 16, param5 >> 16, param6, var19);
                              param5 = param5 + var17;
                              param4 = param4 + var15;
                              param6 = param6 + var20;
                              param0 = param0 + fn.field_g;
                              param2--;
                              continue L21;
                            }
                          }
                        } else {
                          ti.a(fn.field_h, param0, 0, 0, param3 >> 16, param5 >> 16, param6, var19);
                          param5 = param5 + var17;
                          param3 = param3 + var16;
                          param6 = param6 + var20;
                          param0 = param0 + fn.field_g;
                          continue L20;
                        }
                      }
                    }
                    param2 = param2 - param1;
                    param1 = param1 - param0;
                    param0 = field_l[param0];
                    L22: while (true) {
                      param1--;
                      if (param1 < 0) {
                        param2--;
                        L23: while (true) {
                          if (param2 < 0) {
                            return;
                          } else {
                            ti.a(fn.field_h, param0, 0, 0, param5 >> 16, param4 >> 16, param6, var19);
                            param5 = param5 + var17;
                            param4 = param4 + var15;
                            param6 = param6 + var20;
                            param0 = param0 + fn.field_g;
                            param2--;
                            continue L23;
                          }
                        }
                      } else {
                        ti.a(fn.field_h, param0, 0, 0, param5 >> 16, param3 >> 16, param6, var19);
                        param5 = param5 + var17;
                        param3 = param3 + var16;
                        param6 = param6 + var20;
                        param0 = param0 + fn.field_g;
                        continue L22;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (param1 > param2) {
            if (param2 < field_g) {
              L24: {
                if (param0 <= field_g) {
                  break L24;
                } else {
                  param0 = field_g;
                  break L24;
                }
              }
              L25: {
                if (param1 <= field_g) {
                  break L25;
                } else {
                  param1 = field_g;
                  break L25;
                }
              }
              param8 = (param8 << 8) - var19 * param5 + var19;
              if (param0 >= param1) {
                L26: {
                  param5 = param5 << 16;
                  param3 = param5 << 16;
                  if (param2 >= 0) {
                    break L26;
                  } else {
                    param3 = param3 - var15 * param2;
                    param5 = param5 - var17 * param2;
                    param8 = param8 - var20 * param2;
                    param2 = 0;
                    break L26;
                  }
                }
                L27: {
                  param4 = param4 << 16;
                  if (param1 >= 0) {
                    break L27;
                  } else {
                    param4 = param4 - var16 * param1;
                    param1 = 0;
                    break L27;
                  }
                }
                if (var15 >= var17) {
                  param0 = param0 - param1;
                  param1 = param1 - param2;
                  param2 = field_l[param2];
                  L28: while (true) {
                    param1--;
                    if (param1 < 0) {
                      param0--;
                      L29: while (true) {
                        if (param0 < 0) {
                          return;
                        } else {
                          ti.a(fn.field_h, param2, 0, 0, param5 >> 16, param4 >> 16, param8, var19);
                          param4 = param4 + var16;
                          param5 = param5 + var17;
                          param8 = param8 + var20;
                          param2 = param2 + fn.field_g;
                          param0--;
                          continue L29;
                        }
                      }
                    } else {
                      ti.a(fn.field_h, param2, 0, 0, param5 >> 16, param3 >> 16, param8, var19);
                      param3 = param3 + var15;
                      param5 = param5 + var17;
                      param8 = param8 + var20;
                      param2 = param2 + fn.field_g;
                      continue L28;
                    }
                  }
                } else {
                  param0 = param0 - param1;
                  param1 = param1 - param2;
                  param2 = field_l[param2];
                  L30: while (true) {
                    param1--;
                    if (param1 < 0) {
                      param0--;
                      L31: while (true) {
                        if (param0 < 0) {
                          return;
                        } else {
                          ti.a(fn.field_h, param2, 0, 0, param4 >> 16, param5 >> 16, param8, var19);
                          param4 = param4 + var16;
                          param5 = param5 + var17;
                          param8 = param8 + var20;
                          param2 = param2 + fn.field_g;
                          param0--;
                          continue L31;
                        }
                      }
                    } else {
                      ti.a(fn.field_h, param2, 0, 0, param3 >> 16, param5 >> 16, param8, var19);
                      param3 = param3 + var15;
                      param5 = param5 + var17;
                      param8 = param8 + var20;
                      param2 = param2 + fn.field_g;
                      continue L30;
                    }
                  }
                }
              } else {
                L32: {
                  param5 = param5 << 16;
                  param4 = param5 << 16;
                  if (param2 >= 0) {
                    break L32;
                  } else {
                    param4 = param4 - var15 * param2;
                    param5 = param5 - var17 * param2;
                    param8 = param8 - var20 * param2;
                    param2 = 0;
                    break L32;
                  }
                }
                L33: {
                  param3 = param3 << 16;
                  if (param0 >= 0) {
                    break L33;
                  } else {
                    param3 = param3 - var16 * param0;
                    param0 = 0;
                    break L33;
                  }
                }
                if (var15 >= var17) {
                  param1 = param1 - param0;
                  param0 = param0 - param2;
                  param2 = field_l[param2];
                  L34: while (true) {
                    param0--;
                    if (param0 < 0) {
                      param1--;
                      L35: while (true) {
                        if (param1 < 0) {
                          return;
                        } else {
                          ti.a(fn.field_h, param2, 0, 0, param3 >> 16, param4 >> 16, param8, var19);
                          param4 = param4 + var15;
                          param3 = param3 + var16;
                          param8 = param8 + var20;
                          param2 = param2 + fn.field_g;
                          param1--;
                          continue L35;
                        }
                      }
                    } else {
                      ti.a(fn.field_h, param2, 0, 0, param5 >> 16, param4 >> 16, param8, var19);
                      param4 = param4 + var15;
                      param5 = param5 + var17;
                      param8 = param8 + var20;
                      param2 = param2 + fn.field_g;
                      continue L34;
                    }
                  }
                } else {
                  param1 = param1 - param0;
                  param0 = param0 - param2;
                  param2 = field_l[param2];
                  L36: while (true) {
                    param0--;
                    if (param0 < 0) {
                      param1--;
                      L37: while (true) {
                        if (param1 < 0) {
                          return;
                        } else {
                          ti.a(fn.field_h, param2, 0, 0, param4 >> 16, param3 >> 16, param8, var19);
                          param4 = param4 + var15;
                          param3 = param3 + var16;
                          param8 = param8 + var20;
                          param2 = param2 + fn.field_g;
                          param1--;
                          continue L37;
                        }
                      }
                    } else {
                      ti.a(fn.field_h, param2, 0, 0, param4 >> 16, param5 >> 16, param8, var19);
                      param4 = param4 + var15;
                      param5 = param5 + var17;
                      param8 = param8 + var20;
                      param2 = param2 + fn.field_g;
                      continue L36;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            if (param1 < field_g) {
              L38: {
                if (param2 <= field_g) {
                  break L38;
                } else {
                  param2 = field_g;
                  break L38;
                }
              }
              L39: {
                if (param0 <= field_g) {
                  break L39;
                } else {
                  param0 = field_g;
                  break L39;
                }
              }
              param7 = (param7 << 8) - var19 * param4 + var19;
              if (param2 >= param0) {
                L40: {
                  param4 = param4 << 16;
                  param5 = param4 << 16;
                  if (param1 >= 0) {
                    break L40;
                  } else {
                    param5 = param5 - var16 * param1;
                    param4 = param4 - var15 * param1;
                    param7 = param7 - var20 * param1;
                    param1 = 0;
                    break L40;
                  }
                }
                L41: {
                  param3 = param3 << 16;
                  if (param0 >= 0) {
                    break L41;
                  } else {
                    param3 = param3 - var17 * param0;
                    param0 = 0;
                    break L41;
                  }
                }
                if (var16 >= var15) {
                  param2 = param2 - param0;
                  param0 = param0 - param1;
                  param1 = field_l[param1];
                  L42: while (true) {
                    param0--;
                    if (param0 < 0) {
                      param2--;
                      L43: while (true) {
                        if (param2 < 0) {
                          return;
                        } else {
                          ti.a(fn.field_h, param1, 0, 0, param4 >> 16, param3 >> 16, param7, var19);
                          param3 = param3 + var17;
                          param4 = param4 + var15;
                          param7 = param7 + var20;
                          param1 = param1 + fn.field_g;
                          param2--;
                          continue L43;
                        }
                      }
                    } else {
                      ti.a(fn.field_h, param1, 0, 0, param4 >> 16, param5 >> 16, param7, var19);
                      param5 = param5 + var16;
                      param4 = param4 + var15;
                      param7 = param7 + var20;
                      param1 = param1 + fn.field_g;
                      continue L42;
                    }
                  }
                } else {
                  param2 = param2 - param0;
                  param0 = param0 - param1;
                  param1 = field_l[param1];
                  L44: while (true) {
                    param0--;
                    if (param0 < 0) {
                      param2--;
                      L45: while (true) {
                        if (param2 < 0) {
                          return;
                        } else {
                          ti.a(fn.field_h, param1, 0, 0, param3 >> 16, param4 >> 16, param7, var19);
                          param3 = param3 + var17;
                          param4 = param4 + var15;
                          param7 = param7 + var20;
                          param1 = param1 + fn.field_g;
                          param2--;
                          continue L45;
                        }
                      }
                    } else {
                      ti.a(fn.field_h, param1, 0, 0, param5 >> 16, param4 >> 16, param7, var19);
                      param5 = param5 + var16;
                      param4 = param4 + var15;
                      param7 = param7 + var20;
                      param1 = param1 + fn.field_g;
                      continue L44;
                    }
                  }
                }
              } else {
                L46: {
                  param4 = param4 << 16;
                  param3 = param4 << 16;
                  if (param1 >= 0) {
                    break L46;
                  } else {
                    param3 = param3 - var16 * param1;
                    param4 = param4 - var15 * param1;
                    param7 = param7 - var20 * param1;
                    param1 = 0;
                    break L46;
                  }
                }
                L47: {
                  param5 = param5 << 16;
                  if (param2 >= 0) {
                    break L47;
                  } else {
                    param5 = param5 - var17 * param2;
                    param2 = 0;
                    break L47;
                  }
                }
                L48: {
                  L49: {
                    if (param1 == param2) {
                      break L49;
                    } else {
                      if (var16 < var15) {
                        break L48;
                      } else {
                        break L49;
                      }
                    }
                  }
                  L50: {
                    if (param1 != param2) {
                      break L50;
                    } else {
                      if (var16 <= var17) {
                        break L50;
                      } else {
                        break L48;
                      }
                    }
                  }
                  param0 = param0 - param2;
                  param2 = param2 - param1;
                  param1 = field_l[param1];
                  L51: while (true) {
                    param2--;
                    if (param2 < 0) {
                      param0--;
                      L52: while (true) {
                        if (param0 < 0) {
                          return;
                        } else {
                          ti.a(fn.field_h, param1, 0, 0, param5 >> 16, param3 >> 16, param7, var19);
                          param3 = param3 + var16;
                          param5 = param5 + var17;
                          param7 = param7 + var20;
                          param1 = param1 + fn.field_g;
                          param0--;
                          continue L52;
                        }
                      }
                    } else {
                      ti.a(fn.field_h, param1, 0, 0, param4 >> 16, param3 >> 16, param7, var19);
                      param3 = param3 + var16;
                      param4 = param4 + var15;
                      param7 = param7 + var20;
                      param1 = param1 + fn.field_g;
                      continue L51;
                    }
                  }
                }
                param0 = param0 - param2;
                param2 = param2 - param1;
                param1 = field_l[param1];
                L53: while (true) {
                  param2--;
                  if (param2 < 0) {
                    param0--;
                    L54: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        ti.a(fn.field_h, param1, 0, 0, param3 >> 16, param5 >> 16, param7, var19);
                        param3 = param3 + var16;
                        param5 = param5 + var17;
                        param7 = param7 + var20;
                        param1 = param1 + fn.field_g;
                        param0--;
                        continue L54;
                      }
                    }
                  } else {
                    ti.a(fn.field_h, param1, 0, 0, param3 >> 16, param4 >> 16, param7, var19);
                    param3 = param3 + var16;
                    param4 = param4 + var15;
                    param7 = param7 + var20;
                    param1 = param1 + fn.field_g;
                    continue L53;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_e = param2 - param0;
        field_g = param3 - param1;
        ti.a();
        if (field_l.length < field_g) {
            field_l = new int[lb.a(675001474, field_g)];
        }
        int var4 = param1 * fn.field_g + param0;
        for (var5 = 0; var5 < field_g; var5++) {
            field_l[var5] = var4;
            var4 = var4 + fn.field_g;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18) {
        int[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var45 = field_b.a(field_d, 63, param18);
          var44 = var45;
          var43 = var44;
          var42 = var43;
          var19 = var42;
          if (var19 == null) {
            break L0;
          } else {
            if (field_h <= 10) {
              L1: {
                field_p = field_b.a(false, param18);
                if (field_b.a(param18, (byte) -85) != 0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                field_q = stackIn_6_0 != 0;
                var20 = param4 - param3;
                var21 = param1 - param0;
                var22 = param5 - param3;
                var23 = param2 - param0;
                var24 = param7 - param6;
                var25 = param8 - param6;
                var26 = 0;
                if (param1 == param0) {
                  break L2;
                } else {
                  var26 = (param4 - param3 << 16) / (param1 - param0);
                  break L2;
                }
              }
              L3: {
                var27 = 0;
                if (param2 == param1) {
                  break L3;
                } else {
                  var27 = (param5 - param4 << 16) / (param2 - param1);
                  break L3;
                }
              }
              L4: {
                var28 = 0;
                if (param2 == param0) {
                  break L4;
                } else {
                  var28 = (param3 - param5 << 16) / (param0 - param2);
                  break L4;
                }
              }
              var29 = var20 * var23 - var22 * var21;
              if (var29 != 0) {
                L5: {
                  var30 = (var24 * var23 - var25 * var21 << 9) / var29;
                  var31 = (var25 * var20 - var24 * var22 << 9) / var29;
                  param10 = param9 - param10;
                  param13 = param12 - param13;
                  param16 = param15 - param16;
                  param11 = param11 - param9;
                  param14 = param14 - param12;
                  param17 = param17 - param15;
                  var32 = param11 * param12 - param14 * param9 << 14;
                  var33 = param14 * param15 - param17 * param12 << 8;
                  var34 = param17 * param9 - param11 * param15 << 5;
                  var35 = param10 * param12 - param13 * param9 << 14;
                  var36 = param13 * param15 - param16 * param12 << 8;
                  var37 = param16 * param9 - param10 * param15 << 5;
                  var38 = param13 * param11 - param10 * param14 << 14;
                  var39 = param16 * param14 - param13 * param17 << 8;
                  var40 = param10 * param17 - param16 * param11 << 5;
                  if (param0 > param1) {
                    break L5;
                  } else {
                    if (param0 > param2) {
                      break L5;
                    } else {
                      if (param0 < field_g) {
                        L6: {
                          if (param1 <= field_g) {
                            break L6;
                          } else {
                            param1 = field_g;
                            break L6;
                          }
                        }
                        L7: {
                          if (param2 <= field_g) {
                            break L7;
                          } else {
                            param2 = field_g;
                            break L7;
                          }
                        }
                        param6 = (param6 << 9) - var30 * param3 + var30;
                        if (param1 >= param2) {
                          L8: {
                            param3 = param3 << 16;
                            param4 = param3 << 16;
                            if (param0 >= 0) {
                              break L8;
                            } else {
                              param4 = param4 - var28 * param0;
                              param3 = param3 - var26 * param0;
                              param6 = param6 - var31 * param0;
                              param0 = 0;
                              break L8;
                            }
                          }
                          L9: {
                            param5 = param5 << 16;
                            if (param2 >= 0) {
                              break L9;
                            } else {
                              param5 = param5 - var27 * param2;
                              param2 = 0;
                              break L9;
                            }
                          }
                          L10: {
                            L11: {
                              var41 = param0 - field_f;
                              var32 = var32 + var34 * var41;
                              var35 = var35 + var37 * var41;
                              var38 = var38 + var40 * var41;
                              if (param0 == param2) {
                                break L11;
                              } else {
                                if (var28 < var26) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (param0 != param2) {
                                break L12;
                              } else {
                                if (var27 <= var26) {
                                  break L12;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            param1 = param1 - param2;
                            param2 = param2 - param0;
                            param0 = field_l[param0];
                            L13: while (true) {
                              param2--;
                              if (param2 < 0) {
                                param1--;
                                L14: while (true) {
                                  if (param1 < 0) {
                                    return;
                                  } else {
                                    ti.a(fn.field_h, var45, 0, 0, param0, param3 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                    param5 = param5 + var27;
                                    param3 = param3 + var26;
                                    param6 = param6 + var31;
                                    param0 = param0 + fn.field_g;
                                    var32 = var32 + var34;
                                    var35 = var35 + var37;
                                    var38 = var38 + var40;
                                    param1--;
                                    continue L14;
                                  }
                                }
                              } else {
                                ti.a(fn.field_h, var45, 0, 0, param0, param3 >> 16, param4 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                param4 = param4 + var28;
                                param3 = param3 + var26;
                                param6 = param6 + var31;
                                param0 = param0 + fn.field_g;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                continue L13;
                              }
                            }
                          }
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = field_l[param0];
                          L15: while (true) {
                            param2--;
                            if (param2 < 0) {
                              param1--;
                              L16: while (true) {
                                if (param1 < 0) {
                                  return;
                                } else {
                                  ti.a(fn.field_h, var45, 0, 0, param0, param5 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                  param5 = param5 + var27;
                                  param3 = param3 + var26;
                                  param6 = param6 + var31;
                                  param0 = param0 + fn.field_g;
                                  var32 = var32 + var34;
                                  var35 = var35 + var37;
                                  var38 = var38 + var40;
                                  param1--;
                                  continue L16;
                                }
                              }
                            } else {
                              ti.a(fn.field_h, var45, 0, 0, param0, param4 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                              param4 = param4 + var28;
                              param3 = param3 + var26;
                              param6 = param6 + var31;
                              param0 = param0 + fn.field_g;
                              var32 = var32 + var34;
                              var35 = var35 + var37;
                              var38 = var38 + var40;
                              continue L15;
                            }
                          }
                        } else {
                          L17: {
                            param3 = param3 << 16;
                            param5 = param3 << 16;
                            if (param0 >= 0) {
                              break L17;
                            } else {
                              param5 = param5 - var28 * param0;
                              param3 = param3 - var26 * param0;
                              param6 = param6 - var31 * param0;
                              param0 = 0;
                              break L17;
                            }
                          }
                          L18: {
                            param4 = param4 << 16;
                            if (param1 >= 0) {
                              break L18;
                            } else {
                              param4 = param4 - var27 * param1;
                              param1 = 0;
                              break L18;
                            }
                          }
                          L19: {
                            L20: {
                              var41 = param0 - field_f;
                              var32 = var32 + var34 * var41;
                              var35 = var35 + var37 * var41;
                              var38 = var38 + var40 * var41;
                              if (param0 == param1) {
                                break L20;
                              } else {
                                if (var28 < var26) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            L21: {
                              if (param0 != param1) {
                                break L21;
                              } else {
                                if (var28 <= var27) {
                                  break L21;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            param2 = param2 - param1;
                            param1 = param1 - param0;
                            param0 = field_l[param0];
                            L22: while (true) {
                              param1--;
                              if (param1 < 0) {
                                param2--;
                                L23: while (true) {
                                  if (param2 < 0) {
                                    return;
                                  } else {
                                    ti.a(fn.field_h, var45, 0, 0, param0, param4 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                    param5 = param5 + var28;
                                    param4 = param4 + var27;
                                    param6 = param6 + var31;
                                    param0 = param0 + fn.field_g;
                                    var32 = var32 + var34;
                                    var35 = var35 + var37;
                                    var38 = var38 + var40;
                                    param2--;
                                    continue L23;
                                  }
                                }
                              } else {
                                ti.a(fn.field_h, var45, 0, 0, param0, param3 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                param5 = param5 + var28;
                                param3 = param3 + var26;
                                param6 = param6 + var31;
                                param0 = param0 + fn.field_g;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                continue L22;
                              }
                            }
                          }
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = field_l[param0];
                          L24: while (true) {
                            param1--;
                            if (param1 < 0) {
                              param2--;
                              L25: while (true) {
                                if (param2 < 0) {
                                  return;
                                } else {
                                  ti.a(fn.field_h, var45, 0, 0, param0, param5 >> 16, param4 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                  param5 = param5 + var28;
                                  param4 = param4 + var27;
                                  param6 = param6 + var31;
                                  param0 = param0 + fn.field_g;
                                  var32 = var32 + var34;
                                  var35 = var35 + var37;
                                  var38 = var38 + var40;
                                  param2--;
                                  continue L25;
                                }
                              }
                            } else {
                              ti.a(fn.field_h, var45, 0, 0, param0, param5 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                              param5 = param5 + var28;
                              param3 = param3 + var26;
                              param6 = param6 + var31;
                              param0 = param0 + fn.field_g;
                              var32 = var32 + var34;
                              var35 = var35 + var37;
                              var38 = var38 + var40;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (param1 > param2) {
                  if (param2 < field_g) {
                    L26: {
                      if (param0 <= field_g) {
                        break L26;
                      } else {
                        param0 = field_g;
                        break L26;
                      }
                    }
                    L27: {
                      if (param1 <= field_g) {
                        break L27;
                      } else {
                        param1 = field_g;
                        break L27;
                      }
                    }
                    param8 = (param8 << 9) - var30 * param5 + var30;
                    if (param0 >= param1) {
                      L28: {
                        param5 = param5 << 16;
                        param3 = param5 << 16;
                        if (param2 >= 0) {
                          break L28;
                        } else {
                          param3 = param3 - var27 * param2;
                          param5 = param5 - var28 * param2;
                          param8 = param8 - var31 * param2;
                          param2 = 0;
                          break L28;
                        }
                      }
                      L29: {
                        param4 = param4 << 16;
                        if (param1 >= 0) {
                          break L29;
                        } else {
                          param4 = param4 - var26 * param1;
                          param1 = 0;
                          break L29;
                        }
                      }
                      var41 = param2 - field_f;
                      var32 = var32 + var34 * var41;
                      var35 = var35 + var37 * var41;
                      var38 = var38 + var40 * var41;
                      if (var27 >= var28) {
                        param0 = param0 - param1;
                        param1 = param1 - param2;
                        param2 = field_l[param2];
                        L30: while (true) {
                          param1--;
                          if (param1 < 0) {
                            param0--;
                            L31: while (true) {
                              if (param0 < 0) {
                                return;
                              } else {
                                ti.a(fn.field_h, var45, 0, 0, param2, param5 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                                param4 = param4 + var26;
                                param5 = param5 + var28;
                                param8 = param8 + var31;
                                param2 = param2 + fn.field_g;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param0--;
                                continue L31;
                              }
                            }
                          } else {
                            ti.a(fn.field_h, var45, 0, 0, param2, param5 >> 16, param3 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                            param3 = param3 + var27;
                            param5 = param5 + var28;
                            param8 = param8 + var31;
                            param2 = param2 + fn.field_g;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L30;
                          }
                        }
                      } else {
                        param0 = param0 - param1;
                        param1 = param1 - param2;
                        param2 = field_l[param2];
                        L32: while (true) {
                          param1--;
                          if (param1 < 0) {
                            param0--;
                            L33: while (true) {
                              if (param0 < 0) {
                                return;
                              } else {
                                ti.a(fn.field_h, var45, 0, 0, param2, param4 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                                param4 = param4 + var26;
                                param5 = param5 + var28;
                                param8 = param8 + var31;
                                param2 = param2 + fn.field_g;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param0--;
                                continue L33;
                              }
                            }
                          } else {
                            ti.a(fn.field_h, var45, 0, 0, param2, param3 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                            param3 = param3 + var27;
                            param5 = param5 + var28;
                            param8 = param8 + var31;
                            param2 = param2 + fn.field_g;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L32;
                          }
                        }
                      }
                    } else {
                      L34: {
                        param5 = param5 << 16;
                        param4 = param5 << 16;
                        if (param2 >= 0) {
                          break L34;
                        } else {
                          param4 = param4 - var27 * param2;
                          param5 = param5 - var28 * param2;
                          param8 = param8 - var31 * param2;
                          param2 = 0;
                          break L34;
                        }
                      }
                      L35: {
                        param3 = param3 << 16;
                        if (param0 >= 0) {
                          break L35;
                        } else {
                          param3 = param3 - var26 * param0;
                          param0 = 0;
                          break L35;
                        }
                      }
                      var41 = param2 - field_f;
                      var32 = var32 + var34 * var41;
                      var35 = var35 + var37 * var41;
                      var38 = var38 + var40 * var41;
                      if (var27 >= var28) {
                        param1 = param1 - param0;
                        param0 = param0 - param2;
                        param2 = field_l[param2];
                        L36: while (true) {
                          param0--;
                          if (param0 < 0) {
                            param1--;
                            L37: while (true) {
                              if (param1 < 0) {
                                return;
                              } else {
                                ti.a(fn.field_h, var45, 0, 0, param2, param3 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                                param4 = param4 + var27;
                                param3 = param3 + var26;
                                param8 = param8 + var31;
                                param2 = param2 + fn.field_g;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param1--;
                                continue L37;
                              }
                            }
                          } else {
                            ti.a(fn.field_h, var45, 0, 0, param2, param5 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                            param4 = param4 + var27;
                            param5 = param5 + var28;
                            param8 = param8 + var31;
                            param2 = param2 + fn.field_g;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L36;
                          }
                        }
                      } else {
                        param1 = param1 - param0;
                        param0 = param0 - param2;
                        param2 = field_l[param2];
                        L38: while (true) {
                          param0--;
                          if (param0 < 0) {
                            param1--;
                            L39: while (true) {
                              if (param1 < 0) {
                                return;
                              } else {
                                ti.a(fn.field_h, var45, 0, 0, param2, param4 >> 16, param3 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                                param4 = param4 + var27;
                                param3 = param3 + var26;
                                param8 = param8 + var31;
                                param2 = param2 + fn.field_g;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param1--;
                                continue L39;
                              }
                            }
                          } else {
                            ti.a(fn.field_h, var45, 0, 0, param2, param4 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                            param4 = param4 + var27;
                            param5 = param5 + var28;
                            param8 = param8 + var31;
                            param2 = param2 + fn.field_g;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L38;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (param1 < field_g) {
                    L40: {
                      if (param2 <= field_g) {
                        break L40;
                      } else {
                        param2 = field_g;
                        break L40;
                      }
                    }
                    L41: {
                      if (param0 <= field_g) {
                        break L41;
                      } else {
                        param0 = field_g;
                        break L41;
                      }
                    }
                    param7 = (param7 << 9) - var30 * param4 + var30;
                    if (param2 >= param0) {
                      L42: {
                        param4 = param4 << 16;
                        param5 = param4 << 16;
                        if (param1 >= 0) {
                          break L42;
                        } else {
                          param5 = param5 - var26 * param1;
                          param4 = param4 - var27 * param1;
                          param7 = param7 - var31 * param1;
                          param1 = 0;
                          break L42;
                        }
                      }
                      L43: {
                        param3 = param3 << 16;
                        if (param0 >= 0) {
                          break L43;
                        } else {
                          param3 = param3 - var28 * param0;
                          param0 = 0;
                          break L43;
                        }
                      }
                      var41 = param1 - field_f;
                      var32 = var32 + var34 * var41;
                      var35 = var35 + var37 * var41;
                      var38 = var38 + var40 * var41;
                      if (var26 >= var27) {
                        param2 = param2 - param0;
                        param0 = param0 - param1;
                        param1 = field_l[param1];
                        L44: while (true) {
                          param0--;
                          if (param0 < 0) {
                            param2--;
                            L45: while (true) {
                              if (param2 < 0) {
                                return;
                              } else {
                                ti.a(fn.field_h, var45, 0, 0, param1, param4 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                                param3 = param3 + var28;
                                param4 = param4 + var27;
                                param7 = param7 + var31;
                                param1 = param1 + fn.field_g;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param2--;
                                continue L45;
                              }
                            }
                          } else {
                            ti.a(fn.field_h, var45, 0, 0, param1, param4 >> 16, param5 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                            param5 = param5 + var26;
                            param4 = param4 + var27;
                            param7 = param7 + var31;
                            param1 = param1 + fn.field_g;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L44;
                          }
                        }
                      } else {
                        param2 = param2 - param0;
                        param0 = param0 - param1;
                        param1 = field_l[param1];
                        L46: while (true) {
                          param0--;
                          if (param0 < 0) {
                            param2--;
                            L47: while (true) {
                              if (param2 < 0) {
                                return;
                              } else {
                                ti.a(fn.field_h, var45, 0, 0, param1, param3 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                                param3 = param3 + var28;
                                param4 = param4 + var27;
                                param7 = param7 + var31;
                                param1 = param1 + fn.field_g;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param2--;
                                continue L47;
                              }
                            }
                          } else {
                            ti.a(fn.field_h, var45, 0, 0, param1, param5 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                            param5 = param5 + var26;
                            param4 = param4 + var27;
                            param7 = param7 + var31;
                            param1 = param1 + fn.field_g;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L46;
                          }
                        }
                      }
                    } else {
                      L48: {
                        param4 = param4 << 16;
                        param3 = param4 << 16;
                        if (param1 >= 0) {
                          break L48;
                        } else {
                          param3 = param3 - var26 * param1;
                          param4 = param4 - var27 * param1;
                          param7 = param7 - var31 * param1;
                          param1 = 0;
                          break L48;
                        }
                      }
                      L49: {
                        param5 = param5 << 16;
                        if (param2 >= 0) {
                          break L49;
                        } else {
                          param5 = param5 - var28 * param2;
                          param2 = 0;
                          break L49;
                        }
                      }
                      L50: {
                        L51: {
                          var41 = param1 - field_f;
                          var32 = var32 + var34 * var41;
                          var35 = var35 + var37 * var41;
                          var38 = var38 + var40 * var41;
                          if (param1 == param2) {
                            break L51;
                          } else {
                            if (var26 < var27) {
                              break L50;
                            } else {
                              break L51;
                            }
                          }
                        }
                        L52: {
                          if (param1 != param2) {
                            break L52;
                          } else {
                            if (var26 <= var28) {
                              break L52;
                            } else {
                              break L50;
                            }
                          }
                        }
                        param0 = param0 - param2;
                        param2 = param2 - param1;
                        param1 = field_l[param1];
                        L53: while (true) {
                          param2--;
                          if (param2 < 0) {
                            param0--;
                            L54: while (true) {
                              if (param0 < 0) {
                                return;
                              } else {
                                ti.a(fn.field_h, var45, 0, 0, param1, param5 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                                param3 = param3 + var26;
                                param5 = param5 + var28;
                                param7 = param7 + var31;
                                param1 = param1 + fn.field_g;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param0--;
                                continue L54;
                              }
                            }
                          } else {
                            ti.a(fn.field_h, var45, 0, 0, param1, param4 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                            param3 = param3 + var26;
                            param4 = param4 + var27;
                            param7 = param7 + var31;
                            param1 = param1 + fn.field_g;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L53;
                          }
                        }
                      }
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = field_l[param1];
                      L55: while (true) {
                        param2--;
                        if (param2 < 0) {
                          param0--;
                          L56: while (true) {
                            if (param0 < 0) {
                              return;
                            } else {
                              ti.a(fn.field_h, var45, 0, 0, param1, param3 >> 16, param5 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                              param3 = param3 + var26;
                              param5 = param5 + var28;
                              param7 = param7 + var31;
                              param1 = param1 + fn.field_g;
                              var32 = var32 + var34;
                              var35 = var35 + var37;
                              var38 = var38 + var40;
                              param0--;
                              continue L56;
                            }
                          }
                        } else {
                          ti.a(fn.field_h, var45, 0, 0, param1, param3 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                          param3 = param3 + var26;
                          param4 = param4 + var27;
                          param7 = param7 + var31;
                          param1 = param1 + fn.field_g;
                          var32 = var32 + var34;
                          var35 = var35 + var37;
                          var38 = var38 + var40;
                          continue L55;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        var20 = field_b.b(0, param18);
        ti.a(param0, param1, param2, param3, param4, param5, ti.b(var20, param6), ti.b(var20, param7), ti.b(var20, param8));
    }

    final static void b() {
        ti.a(fn.field_c, fn.field_b, fn.field_i, fn.field_j);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new int[512];
        field_d = 1.0f;
        field_h = 0;
        field_p = false;
        field_q = false;
        field_i = new int[2048];
        field_c = false;
        field_m = new int[2048];
        field_j = new int[2048];
        field_l = new int[1024];
        field_n = true;
        field_o = new int[65536];
        for (var0 = 1; var0 < 512; var0++) {
            field_a[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_i[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_m[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_j[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
