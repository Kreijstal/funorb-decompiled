/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_m;
    int field_e;
    static String[] field_h;
    int[][] field_g;
    int field_a;
    static int[] field_c;
    dl[][] field_f;
    private int[][] field_d;
    mk field_l;
    int field_b;
    e field_i;
    static int[] field_j;
    private int field_k;

    private final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int stackIn_47_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var19;
        int var20;
        int var21;
        dl var22;
        dl var23;
        dl var24;
        dl var25;
        dl var26;
        L0: {
          var21 = Terraphoenix.field_V;
          if (param5 > 92) {
            break L0;
          } else {
            this.field_m = 80;
            break L0;
          }
        }
        L1: {
          if (-2 < (param3 ^ -1)) {
            break L1;
          } else {
            if (param3 >= -1 + this.field_b) {
              break L1;
            } else {
              if (-2 < (param6 ^ -1)) {
                break L1;
              } else {
                if (param6 >= this.field_e - 1) {
                  break L1;
                } else {
                  L2: {
                    var8 = -param1 + param3;
                    var9 = -param0 + param6;
                    var10 = -param2 + param4;
                    var11 = Math.abs(var8);
                    if (var11 < Math.abs(var9)) {
                      var11 = Math.abs(var9);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (Math.abs(var10) > var11) {
                      var11 = Math.abs(var10);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (var11 == 0) {
                    return true;
                  } else {
                    if (var11 > 32) {
                      return false;
                    } else {
                      var15 = param1;
                      var16 = param0;
                      var17 = param2;
                      var19 = 1;
                      L4: while (true) {
                        if (var19 > var11) {
                          return true;
                        } else {
                          L5: {
                            var12 = param1 + var8 * var19 / var11;
                            var13 = var19 * var9 / var11 + param0;
                            var14 = (var19 * 10 * var10 + var11 * (param2 * 10 - -9)) / (var11 * 10);
                            var22 = this.a(122, var13, var14, var12);
                            if (var19 == var11) {
                              break L5;
                            } else {
                              if (var22 != null) {
                                if (3 != var22.field_v) {
                                  break L5;
                                } else {
                                  return false;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if ((var12 ^ -1) > -1) {
                              break L6;
                            } else {
                              if (-1 < (var13 ^ -1)) {
                                break L6;
                              } else {
                                if (var12 >= this.field_b) {
                                  break L6;
                                } else {
                                  if (var13 >= this.field_e) {
                                    break L6;
                                  } else {
                                    L7: {
                                      var12 = var15;
                                      var13 = var16;
                                      var20 = 0;
                                      var14 = (var10 * (10 * var19) + (param2 * 10 - -9) * var11) / (10 * var11);
                                      var23 = this.a(-48, var13, var14, var12);
                                      if (var23 == null) {
                                        break L7;
                                      } else {
                                        L8: {
                                          if (var17 >= var14) {
                                            break L8;
                                          } else {
                                            if (-1 == var23.field_v) {
                                              break L8;
                                            } else {
                                              if (-1 == var23.field_b) {
                                                break L8;
                                              } else {
                                                var20 = 1;
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                        if (var14 >= var17) {
                                          break L7;
                                        } else {
                                          if (null == var23.field_C) {
                                            break L7;
                                          } else {
                                            if (0 == (var23.field_C.field_v ^ -1)) {
                                              break L7;
                                            } else {
                                              if (0 != (var23.field_C.field_b ^ -1)) {
                                                var20 = 1;
                                                break L7;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L9: {
                                      if (var20 != 0) {
                                        stackIn_47_0 = 0;
                                        break L9;
                                      } else {
                                        stackIn_47_0 = 1;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (stackIn_47_0 != 1) {
                                        break L10;
                                      } else {
                                        var17 = var14;
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      var13 = var16;
                                      var14 = var17;
                                      var12 = param1 + var8 * var19 / var11;
                                      var24 = this.a(-66, var13, var14, var12);
                                      if (var24 == null) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (var15 >= var12) {
                                            break L12;
                                          } else {
                                            if ((var24.field_e & 1 ^ -1) != -2) {
                                              break L12;
                                            } else {
                                              return false;
                                            }
                                          }
                                        }
                                        if (var15 <= var12) {
                                          break L11;
                                        } else {
                                          if ((var24.field_e & 4 ^ -1) == -5) {
                                            return false;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    L13: {
                                      var15 = var12;
                                      var13 = param0 - -(var19 * var9 / var11);
                                      var25 = this.a(97, var13, var14, var12);
                                      if (var25 != null) {
                                        L14: {
                                          if (var13 <= var16) {
                                            break L14;
                                          } else {
                                            if (-3 != (2 & var25.field_e ^ -1)) {
                                              break L14;
                                            } else {
                                              return false;
                                            }
                                          }
                                        }
                                        if (var16 <= var13) {
                                          break L13;
                                        } else {
                                          if ((var25.field_e & 8 ^ -1) != -9) {
                                            break L13;
                                          } else {
                                            return false;
                                          }
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L15: {
                                      var16 = var13;
                                      if (var20 != 0) {
                                        var14 = ((param2 * 10 + 9) * var11 - -(var10 * (10 * var19))) / (var11 * 10);
                                        var26 = this.a(-33, var13, var14, var12);
                                        if (var26 == null) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if (var17 >= var14) {
                                              break L16;
                                            } else {
                                              if (0 == (var26.field_v ^ -1)) {
                                                break L16;
                                              } else {
                                                if ((var26.field_b ^ -1) != 0) {
                                                  return false;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                          if (var14 >= var17) {
                                            break L15;
                                          } else {
                                            if (var26.field_C == null) {
                                              break L15;
                                            } else {
                                              if ((var26.field_C.field_v ^ -1) == 0) {
                                                break L15;
                                              } else {
                                                if (0 != (var26.field_C.field_b ^ -1)) {
                                                  return false;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L15;
                                      }
                                    }
                                    var16 = var13;
                                    var15 = var12;
                                    var17 = var14;
                                    var19++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          return false;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        L0: {
          var15 = Terraphoenix.field_V;
          var7 = -param4 + param1;
          var8 = -param3 + param5;
          var9 = Math.abs(var7);
          if (var9 < Math.abs(var8)) {
            var9 = Math.abs(var8);
            break L0;
          } else {
            break L0;
          }
        }
        if (var9 == 0) {
          return;
        } else {
          L1: {
            var12 = param4;
            if (!param0) {
              break L1;
            } else {
              this.field_g = (int[][]) null;
              break L1;
            }
          }
          var13 = param3;
          var14 = 0;
          L2: while (true) {
            if (var14 > var9) {
              return;
            } else {
              var11 = param3 - -(var8 * var14 / var9);
              var10 = var7 * var14 / var9 + param4;
              if (var10 < 0) {
                return;
              } else {
                L3: {
                  if (-1 < (var11 ^ -1)) {
                    break L3;
                  } else {
                    if (var10 >= this.field_b) {
                      break L3;
                    } else {
                      if (this.field_e <= var11) {
                        break L3;
                      } else {
                        L4: {
                          var11 = var13;
                          if (var12 >= var10) {
                            break L4;
                          } else {
                            if ((this.field_f[var10][var11].field_e & 1 ^ -1) == -2) {
                              return;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (var12 <= var10) {
                            break L5;
                          } else {
                            if (4 != (this.field_f[var10][var11].field_e & 4)) {
                              break L5;
                            } else {
                              return;
                            }
                          }
                        }
                        L6: {
                          var11 = var8 * var14 / var9 + param3;
                          if (var13 >= var11) {
                            break L6;
                          } else {
                            if (2 == (this.field_f[var10][var11].field_e & 2)) {
                              return;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (var11 >= var13) {
                            break L7;
                          } else {
                            if (-9 != (this.field_f[var10][var11].field_e & 8 ^ -1)) {
                              break L7;
                            } else {
                              return;
                            }
                          }
                        }
                        L8: {
                          if (var14 - jh.field_n >= this.field_g[var10][var11]) {
                            break L8;
                          } else {
                            if (jh.field_n < var14) {
                              this.field_g[var10][var11] = var14 - jh.field_n;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var14 != var9) {
                            if (2 == this.field_f[var10][var11].field_v) {
                              return;
                            } else {
                              if (this.field_f[var10][var11].field_v == 3) {
                                return;
                              } else {
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                        var13 = var11;
                        var12 = var10;
                        var14++;
                        continue L2;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final void c(int param0) {
        boolean discarded$0 = false;
        this.a(50, (byte) -122, 50);
        if (param0 != 5) {
            discarded$0 = this.a(-21, -19, -77, -123, -123, (byte) 64, 48);
        }
    }

    final ue a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, boolean param7) {
        if (!param7) {
            dk.b(51);
        }
        return this.a(param4, param0, param1, -93, false, param3, param6, param5, param2);
    }

    final ue a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        dl var14;
        int var15_int;
        Object var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        dl var22;
        dl var23;
        var21 = Terraphoenix.field_V;
        var8 = 0;
        L0: while (true) {
          if (var8 >= this.field_b) {
            var8 = param1;
            var9 = param1;
            var10 = param4;
            var11 = param4;
            if (param1 >= 1) {
              if (1 <= param4) {
                if (-2 + this.field_b > param1) {
                  if (-2 + this.field_e > param4) {
                    if (param6 >= 28) {
                      this.field_d[param1][param4] = 0;
                      if (null != this.a(82, param4, param2, param1)) {
                        var15_int = 0;
                        L1: while (true) {
                          if ((var15_int ^ -1) <= -1001) {
                            if (!this.a(false, param1, param4, (byte) 88, param2)) {
                              if (-1001 < (this.field_d[param3][param5] ^ -1)) {
                                var15 = null;
                                var19 = param3;
                                var20 = param5;
                                L2: while (true) {
                                  L3: {
                                    if (param1 != var19) {
                                      break L3;
                                    } else {
                                      if (var20 == param4) {
                                        return (ue) (var15);
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var17 = 0;
                                  var18 = this.field_d[var19][var20];
                                  var16 = 0;
                                  var12 = -1;
                                  L4: while (true) {
                                    if ((var12 ^ -1) < -2) {
                                      L5: {
                                        if (var15 == null) {
                                          var15 = new ue(var16, var17, -var18 + this.field_d[var19][var20]);
                                          break L5;
                                        } else {
                                          ((ue) (var15)).a(this.field_d[var19][var20] + -var18, var17, var16, (byte) -48);
                                          break L5;
                                        }
                                      }
                                      var20 = var20 + var17;
                                      var19 = var19 + var16;
                                      if (var16 != 0) {
                                        continue L2;
                                      } else {
                                        if ((var17 ^ -1) != -1) {
                                          continue L2;
                                        } else {
                                          return null;
                                        }
                                      }
                                    } else {
                                      var13 = -1;
                                      L6: while (true) {
                                        if (var13 > 1) {
                                          var12++;
                                          continue L4;
                                        } else {
                                          if ((var19 - -var12 ^ -1) < -1) {
                                            if (-1 > (var13 + var20 ^ -1)) {
                                              if (var19 + var12 < -1 + this.field_b) {
                                                if (-1 + this.field_e > var20 - -var13) {
                                                  var14 = this.a(81, var13 + var20, param2, var19 - -var12);
                                                  if (this.field_d[var19 - -var12][var20 - -var13] < var18) {
                                                    if (1000 > var14.a(-var13, -var12, -127)) {
                                                      var16 = var12;
                                                      var18 = this.field_d[var19 - -var12][var20 - -var13];
                                                      var17 = var13;
                                                      var13++;
                                                      continue L6;
                                                    } else {
                                                      var13++;
                                                      continue L6;
                                                    }
                                                  } else {
                                                    var13++;
                                                    continue L6;
                                                  }
                                                } else {
                                                  var13++;
                                                  continue L6;
                                                }
                                              } else {
                                                var13++;
                                                continue L6;
                                              }
                                            } else {
                                              var13++;
                                              continue L6;
                                            }
                                          } else {
                                            var13++;
                                            continue L6;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                return null;
                              }
                            } else {
                              this.field_d[param1][param4] = 1000;
                              return null;
                            }
                          } else {
                            var16 = var8;
                            L7: while (true) {
                              if (var9 < var16) {
                                var15_int++;
                                continue L1;
                              } else {
                                var17 = var10;
                                L8: while (true) {
                                  if (var17 > var11) {
                                    var16++;
                                    continue L7;
                                  } else {
                                    if (var15_int == this.field_d[var16][var17]) {
                                      L9: {
                                        if (var8 == var16) {
                                          if (1 < var16) {
                                            var8--;
                                            if (var17 != var11) {
                                              break L9;
                                            } else {
                                              if (var17 >= -2 + this.field_b) {
                                                break L9;
                                              } else {
                                                var11++;
                                                break L9;
                                              }
                                            }
                                          } else {
                                            if (var17 != var11) {
                                              break L9;
                                            } else {
                                              if (var17 >= -2 + this.field_b) {
                                                break L9;
                                              } else {
                                                var11++;
                                                break L9;
                                              }
                                            }
                                          }
                                        } else {
                                          if (var17 != var11) {
                                            break L9;
                                          } else {
                                            if (var17 >= -2 + this.field_b) {
                                              break L9;
                                            } else {
                                              var11++;
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                      L10: {
                                        if (var10 != var17) {
                                          break L10;
                                        } else {
                                          if (var17 > 1) {
                                            var10--;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if (param3 != var16) {
                                          break L11;
                                        } else {
                                          if (var17 != param5) {
                                            break L11;
                                          } else {
                                            var15_int = 1000;
                                            break L11;
                                          }
                                        }
                                      }
                                      L12: {
                                        if (var16 != var9) {
                                          break L12;
                                        } else {
                                          if (var16 < this.field_b - 2) {
                                            var9++;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      var22 = this.a(-41, var17, param2, var16);
                                      var23 = var22;
                                      if (var23 != null) {
                                        L13: {
                                          if (!param0) {
                                            break L13;
                                          } else {
                                            if (var23.field_a) {
                                              break L13;
                                            } else {
                                              if (!var23.field_d) {
                                                break L13;
                                              } else {
                                                this.field_d[var16][var17] = 1000;
                                                break L13;
                                              }
                                            }
                                          }
                                        }
                                        L14: {
                                          if (-2 <= (var16 ^ -1)) {
                                            break L14;
                                          } else {
                                            var12 = -1;
                                            var13 = 0;
                                            if (this.field_d[var12 + var16][var13 + var17] <= var23.a(var13, var12, -114) + var15_int) {
                                              break L14;
                                            } else {
                                              this.field_d[var12 + var16][var13 + var17] = var22.a(var13, var12, -124) + var15_int;
                                              break L14;
                                            }
                                          }
                                        }
                                        L15: {
                                          if (var16 <= 1) {
                                            break L15;
                                          } else {
                                            if ((var17 ^ -1) >= -2) {
                                              break L15;
                                            } else {
                                              var12 = -1;
                                              var13 = -1;
                                              if (this.field_d[var16 + var12][var13 + var17] <= var15_int + var23.a(var13, var12, -116)) {
                                                break L15;
                                              } else {
                                                this.field_d[var16 + var12][var13 + var17] = var15_int - -var22.a(var13, var12, -128);
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                        L16: {
                                          if (1 >= var16) {
                                            break L16;
                                          } else {
                                            if (var17 < this.field_e + -2) {
                                              var12 = -1;
                                              var13 = 1;
                                              if (this.field_d[var12 + var16][var17 - -var13] <= var23.a(var13, var12, -116) + var15_int) {
                                                break L16;
                                              } else {
                                                this.field_d[var16 - -var12][var17 + var13] = var22.a(var13, var12, -109) + var15_int;
                                                break L16;
                                              }
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        L17: {
                                          if (var16 >= this.field_b - 2) {
                                            break L17;
                                          } else {
                                            var12 = 1;
                                            var13 = 0;
                                            if (this.field_d[var12 + var16][var17 + var13] > var23.a(var13, var12, -123) + var15_int) {
                                              this.field_d[var12 + var16][var13 + var17] = var15_int + var22.a(var13, var12, -120);
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        L18: {
                                          if (this.field_b + -2 <= var16) {
                                            break L18;
                                          } else {
                                            if (var17 <= 1) {
                                              break L18;
                                            } else {
                                              var12 = 1;
                                              var13 = -1;
                                              if (this.field_d[var12 + var16][var13 + var17] <= var23.a(var13, var12, -115) + var15_int) {
                                                break L18;
                                              } else {
                                                this.field_d[var16 + var12][var13 + var17] = var15_int - -var22.a(var13, var12, -114);
                                                break L18;
                                              }
                                            }
                                          }
                                        }
                                        L19: {
                                          if (-2 + this.field_b <= var16) {
                                            break L19;
                                          } else {
                                            if (var17 < this.field_e + -2) {
                                              var13 = 1;
                                              var12 = 1;
                                              if (this.field_d[var12 + var16][var17 + var13] > var15_int + var23.a(var13, var12, -120)) {
                                                this.field_d[var12 + var16][var13 + var17] = var22.a(var13, var12, -118) + var15_int;
                                                break L19;
                                              } else {
                                                break L19;
                                              }
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        L20: {
                                          if (1 >= var17) {
                                            break L20;
                                          } else {
                                            var13 = -1;
                                            var12 = 0;
                                            if (this.field_d[var16 + var12][var13 + var17] <= var23.a(var13, var12, -108) + var15_int) {
                                              break L20;
                                            } else {
                                              this.field_d[var12 + var16][var13 + var17] = var15_int + var22.a(var13, var12, -123);
                                              break L20;
                                            }
                                          }
                                        }
                                        if (-2 + this.field_e > var17) {
                                          var13 = 1;
                                          var12 = 0;
                                          if (this.field_d[var12 + var16][var13 + var17] > var23.a(var13, var12, -124) + var15_int) {
                                            this.field_d[var12 + var16][var13 + var17] = var15_int + var22.a(var13, var12, -118);
                                            var17++;
                                            continue L8;
                                          } else {
                                            var17++;
                                            continue L8;
                                          }
                                        } else {
                                          var17++;
                                          continue L8;
                                        }
                                      } else {
                                        var17++;
                                        continue L8;
                                      }
                                    } else {
                                      var17++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return (ue) null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var9 = 0;
            L21: while (true) {
              if (this.field_e <= var9) {
                var8++;
                continue L0;
              } else {
                this.field_d[var8][var9] = 1000;
                var9++;
                continue L21;
              }
            }
          }
        }
    }

    final void c(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = Terraphoenix.field_V;
          var2 = aa.field_m;
          var3 = -(eg.field_p * 2) + pd.field_h;
          if (param0 == -96) {
            break L0;
          } else {
            this.a(29, 74, -97, 18, 98, 87, true);
            break L0;
          }
        }
        var4 = 1;
        L1: while (true) {
          if (var4 >= -1 + this.field_b) {
            return;
          } else {
            var5 = 1;
            L2: while (true) {
              if (-1 + this.field_e <= var5) {
                var3 = var3 - (this.field_e + -2);
                var2 = var2 + (-4 + 2 * this.field_e);
                var3++;
                var2 += 2;
                var4++;
                continue L1;
              } else {
                if (var2 <= this.field_i.field_y) {
                  if (var3 <= this.field_i.field_j) {
                    if (this.field_i.field_y <= 1 + var2) {
                      if (this.field_i.field_j <= 1 + var3) {
                        L3: {
                          if ((this.field_i.field_N ^ -1) != -2) {
                            break L3;
                          } else {
                            if (le.field_q != null) {
                              break L3;
                            } else {
                              sj.field_b = -(var5 * 32) + 32 * var4;
                              vf.field_a = -1;
                              uf.field_c = -1;
                              lg.field_c = var4 * 16 + var5 * 16;
                              break L3;
                            }
                          }
                        }
                        hl.field_a = true;
                        var2 -= 2;
                        var3++;
                        var5++;
                        continue L2;
                      } else {
                        var2 -= 2;
                        var3++;
                        var5++;
                        continue L2;
                      }
                    } else {
                      var2 -= 2;
                      var3++;
                      var5++;
                      continue L2;
                    }
                  } else {
                    var2 -= 2;
                    var3++;
                    var5++;
                    continue L2;
                  }
                } else {
                  var2 -= 2;
                  var3++;
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, r param1, r param2, boolean param3) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_207_0 = 0;
        int stackIn_211_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_220_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_235_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_265_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_276_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_302_0 = 0;
        int stackIn_305_0 = 0;
        RuntimeException stackIn_308_0 = null;
        StringBuilder stackIn_308_1 = null;
        RuntimeException stackIn_309_0 = null;
        StringBuilder stackIn_309_1 = null;
        String stackIn_309_2 = null;
        StringBuilder stackIn_311_1 = null;
        StringBuilder stackIn_312_1 = null;
        String stackIn_312_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        dl var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        int var37 = 0;
        dl var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        var41 = Terraphoenix.field_V;
        try {
          L0: {
            if (param2 != param1) {
              if (param2 == null) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 != null) {
                  L1: {
                    var5 = param1.field_c;
                    if (param3) {
                      var5 = this.a(114, param1.field_gb, param1.field_R, param1.field_i);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (null == param2.field_c) {
                      break L2;
                    } else {
                      if (var5 != null) {
                        L3: {
                          if (null == param2.field_Z) {
                            break L3;
                          } else {
                            if (var5.field_a) {
                              break L3;
                            } else {
                              if (!param3) {
                                stackIn_22_0 = 0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        L4: {
                          var6 = param2.field_U;
                          var7 = (double)(100 * (-param2.field_F + param1.field_F));
                          var9 = (double)(100 * (param1.field_H - param2.field_H));
                          var11 = param1.field_E;
                          if (!param3) {
                            break L4;
                          } else {
                            var7 = (double)(100 * (param1.field_i + -param2.field_F));
                            var9 = (double)((param1.field_gb - param2.field_H) * 100);
                            var11 = param1.field_R;
                            break L4;
                          }
                        }
                        L5: {
                          if (!param1.field_k) {
                            L6: {
                              if (0 != param2.field_U) {
                                break L6;
                              } else {
                                if (var7 >= 0.0) {
                                  break L6;
                                } else {
                                  stackIn_30_0 = 0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                            L7: {
                              if ((param2.field_U ^ -1) != -2) {
                                break L7;
                              } else {
                                if (0.0 <= var7 + var9) {
                                  break L7;
                                } else {
                                  stackIn_34_0 = 0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                }
                              }
                            }
                            L8: {
                              if (-3 != (param2.field_U ^ -1)) {
                                break L8;
                              } else {
                                if (var9 < 0.0) {
                                  stackIn_39_0 = 0;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (3 != param2.field_U) {
                                break L9;
                              } else {
                                if (var7 - var9 <= 0.0) {
                                  break L9;
                                } else {
                                  stackIn_43_0 = 0;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                }
                              }
                            }
                            L10: {
                              if (4 != param2.field_U) {
                                break L10;
                              } else {
                                if (0.0 < var7) {
                                  stackIn_48_0 = 0;
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (param2.field_U != 5) {
                                break L11;
                              } else {
                                if (0.0 < var9 + var7) {
                                  stackIn_53_0 = 0;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (param2.field_U != 6) {
                                break L12;
                              } else {
                                if (0.0 >= var9) {
                                  break L12;
                                } else {
                                  stackIn_57_0 = 0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              }
                            }
                            if (param2.field_U != 7) {
                              break L5;
                            } else {
                              if (-var9 + var7 < 0.0) {
                                stackIn_62_0 = 0;
                                decompiledRegionSelector0 = 11;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        L13: {
                          param2.a(true, (int)(var7 / 100.0 + (double)param2.field_F), (int)((double)param2.field_H + var9 / 100.0));
                          var12 = 87 + 100 * param2.field_E;
                          var13 = param2.field_nb.field_g;
                          if (-2 != (param2.field_B ^ -1)) {
                            break L13;
                          } else {
                            if (!param2.f((byte) 91)) {
                              break L13;
                            } else {
                              if (param2.field_N != param2.field_E) {
                                break L13;
                              } else {
                                var12 = 100 * var11 + 66;
                                break L13;
                              }
                            }
                          }
                        }
                        L14: {
                          L15: {
                            if (var13 == 0) {
                              break L15;
                            } else {
                              if ((var13 ^ -1) == -9) {
                                break L15;
                              } else {
                                if (var13 == 12) {
                                  break L15;
                                } else {
                                  if ((var13 ^ -1) != -4) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                          }
                          var12 = 75 - -(var11 * 100);
                          if (param2.field_B != 1) {
                            break L14;
                          } else {
                            if (!param2.f((byte) 120)) {
                              break L14;
                            } else {
                              if (param2.field_N != param2.field_E) {
                                break L14;
                              } else {
                                var12 = 100 * var11 + 52;
                                break L14;
                              }
                            }
                          }
                        }
                        L16: {
                          L17: {
                            if (var13 == 6) {
                              break L17;
                            } else {
                              if (var13 == 14) {
                                break L17;
                              } else {
                                if (-16 != (var13 ^ -1)) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          var12 = 54 - -(100 * var11);
                          break L16;
                        }
                        L18: {
                          if (param2.field_c.field_C == null) {
                            break L18;
                          } else {
                            if (param2.field_c.field_C.field_v == 5) {
                              var12 += 25;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          if (var11 < param2.field_E) {
                            var12 = 87 + param2.field_E * 100;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        L20: {
                          var14 = 0;
                          var15 = 1;
                          var16 = 20;
                          if (0 == var13) {
                            var16 = 20;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (var13 != 1) {
                            break L21;
                          } else {
                            var16 = 32;
                            break L21;
                          }
                        }
                        L22: {
                          if (-3 == (var13 ^ -1)) {
                            var16 = 40;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        L23: {
                          if (var13 == 3) {
                            var16 = 28;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          if (var13 == 4) {
                            var16 = 36;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L25: {
                          if (6 != var13) {
                            break L25;
                          } else {
                            var16 = 34;
                            break L25;
                          }
                        }
                        L26: {
                          if ((var13 ^ -1) == -8) {
                            var16 = 40;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        L27: {
                          if ((var13 ^ -1) == -9) {
                            var16 = 20;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          if (-10 != (var13 ^ -1)) {
                            break L28;
                          } else {
                            var16 = 33;
                            break L28;
                          }
                        }
                        L29: {
                          if (-11 == (var13 ^ -1)) {
                            var16 = 35;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L30: {
                          if (12 == var13) {
                            var16 = 24;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        L31: {
                          if ((var13 ^ -1) != -14) {
                            break L31;
                          } else {
                            var16 = 40;
                            break L31;
                          }
                        }
                        L32: {
                          if (14 != var13) {
                            break L32;
                          } else {
                            var16 = 51;
                            break L32;
                          }
                        }
                        L33: {
                          if ((var13 ^ -1) != -16) {
                            break L33;
                          } else {
                            var16 = 46;
                            break L33;
                          }
                        }
                        L34: {
                          if (var13 == 16) {
                            var16 = 39;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        L35: {
                          if (18 == var13) {
                            var16 = 45;
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        L36: {
                          var16 += 12;
                          var16 = (int)((double)(var16 * 100) / Math.sqrt(2048.0));
                          if (-1 == (param2.field_U ^ -1)) {
                            var14 = 1;
                            var15 = 0;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        L37: {
                          if (1 == param2.field_U) {
                            var15 = 1;
                            var14 = 1;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        L38: {
                          if (param2.field_U == 2) {
                            var14 = 0;
                            var15 = 1;
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        L39: {
                          if ((param2.field_U ^ -1) != -4) {
                            break L39;
                          } else {
                            var14 = -1;
                            var15 = 1;
                            break L39;
                          }
                        }
                        L40: {
                          if (param2.field_U == 4) {
                            var15 = 0;
                            var14 = -1;
                            break L40;
                          } else {
                            break L40;
                          }
                        }
                        L41: {
                          if (5 != param2.field_U) {
                            break L41;
                          } else {
                            var14 = -1;
                            var15 = -1;
                            break L41;
                          }
                        }
                        L42: {
                          if (6 != param2.field_U) {
                            break L42;
                          } else {
                            var14 = 0;
                            var15 = -1;
                            break L42;
                          }
                        }
                        L43: {
                          if (-8 == (param2.field_U ^ -1)) {
                            var15 = -1;
                            var14 = 1;
                            break L43;
                          } else {
                            break L43;
                          }
                        }
                        L44: {
                          var17 = (double)var16 * ((double)var14 / Math.sqrt((double)(var14 * var14 + var15 * var15)));
                          if (var17 < -50.0) {
                            var17 = -50.0;
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                        L45: {
                          var19 = (double)var15 / Math.sqrt((double)(var14 * var14 + var15 * var15)) * (double)var16;
                          if (var19 < -50.0) {
                            var19 = -50.0;
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        L46: {
                          if (var17 > 50.0) {
                            var17 = 50.0;
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                        L47: {
                          var7 = var7 - var17;
                          if (var19 > 50.0) {
                            var19 = 50.0;
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        if (param0 == 10056) {
                          L48: {
                            var9 = var9 - var19;
                            var21 = 100 * param1.field_E + 70;
                            if (param2.field_E <= param1.field_E) {
                              break L48;
                            } else {
                              var21 = param1.field_E * 100 + 55;
                              break L48;
                            }
                          }
                          L49: {
                            if (param1.field_E > param2.field_E) {
                              var21 = 85 + 100 * param1.field_E;
                              break L49;
                            } else {
                              break L49;
                            }
                          }
                          L50: {
                            var22 = (double)(var21 + -var12);
                            if (-2 != (param1.field_B ^ -1)) {
                              break L50;
                            } else {
                              if (param1.field_db) {
                                break L50;
                              } else {
                                if (160000.0 < var7 * var7 + var9 * var9) {
                                  var21 -= 12;
                                  break L50;
                                } else {
                                  break L50;
                                }
                              }
                            }
                          }
                          var24 = Math.sqrt(var9 * var9 + var7 * var7 + var22 * var22) / 25.0;
                          if (var24 < 1.0) {
                            param2.field_U = var6;
                            stackIn_179_0 = 1;
                            decompiledRegionSelector0 = 13;
                            break L0;
                          } else {
                            var22 = var22 / var24;
                            var7 = var7 / var24;
                            var9 = var9 / var24;
                            var26 = param2.field_F;
                            var27 = param2.field_H;
                            var28 = param2.field_E;
                            var29 = var7;
                            var31 = var9;
                            var33 = var22;
                            param2.field_U = var6;
                            var35 = (double)(var12 + -(100 * var28));
                            var37 = 0;
                            L51: while (true) {
                              var37++;
                              if ((var37 ^ -1) <= -10001) {
                                stackIn_305_0 = 0;
                                decompiledRegionSelector0 = 33;
                                break L0;
                              } else {
                                var38 = this.a(param0 + -9965, var27, var28, var26);
                                L52: while (true) {
                                  if (var38 != null) {
                                    L53: {
                                      var35 = var35 + var33;
                                      if (var35 < (double)(-(100 * var38.field_r) + var38.field_l)) {
                                        L54: {
                                          if (0 == (var38.field_v ^ -1)) {
                                            break L54;
                                          } else {
                                            if (var38.field_b != -1) {
                                              stackIn_192_0 = 0;
                                              decompiledRegionSelector0 = 14;
                                              break L0;
                                            } else {
                                              break L54;
                                            }
                                          }
                                        }
                                        var28--;
                                        var35 = var35 + 100.0;
                                        var38 = this.a(122, var27, var28, var26);
                                        break L53;
                                      } else {
                                        break L53;
                                      }
                                    }
                                    L55: {
                                      if (var35 <= 100.0) {
                                        break L55;
                                      } else {
                                        L56: {
                                          if (var38.field_C == null) {
                                            break L56;
                                          } else {
                                            L57: {
                                              if (-1 == var38.field_C.field_v) {
                                                break L57;
                                              } else {
                                                if (var38.field_C.field_b == -1) {
                                                  break L57;
                                                } else {
                                                  stackIn_198_0 = 0;
                                                  decompiledRegionSelector0 = 15;
                                                  break L0;
                                                }
                                              }
                                            }
                                            var28++;
                                            var38 = var38.field_C;
                                            var35 = var35 - 100.0;
                                            break L56;
                                          }
                                        }
                                        if (var35 <= 1000.0) {
                                          break L55;
                                        } else {
                                          stackIn_202_0 = 0;
                                          decompiledRegionSelector0 = 16;
                                          break L0;
                                        }
                                      }
                                    }
                                    L58: {
                                      if (1 != var38.field_v) {
                                        break L58;
                                      } else {
                                        if ((double)(50 + var38.field_l) > var35) {
                                          stackIn_207_0 = 0;
                                          decompiledRegionSelector0 = 17;
                                          break L0;
                                        } else {
                                          break L58;
                                        }
                                      }
                                    }
                                    L59: {
                                      if (-3 != (var38.field_v ^ -1)) {
                                        break L59;
                                      } else {
                                        if ((double)(50 - -var38.field_l) <= var35) {
                                          break L59;
                                        } else {
                                          stackIn_211_0 = 0;
                                          decompiledRegionSelector0 = 18;
                                          break L0;
                                        }
                                      }
                                    }
                                    L60: {
                                      if (3 != var38.field_v) {
                                        break L60;
                                      } else {
                                        if (var35 > (double)(100 - -var38.field_l)) {
                                          break L60;
                                        } else {
                                          stackIn_215_0 = 0;
                                          decompiledRegionSelector0 = 19;
                                          break L0;
                                        }
                                      }
                                    }
                                    L61: {
                                      var17 = var17 + var29;
                                      if (var17 < -50.0) {
                                        if ((var38.field_e & 1) != 1) {
                                          L62: {
                                            if (16 != (var38.field_e & 16)) {
                                              break L62;
                                            } else {
                                              if (50.0 <= var35) {
                                                break L62;
                                              } else {
                                                if (param2.field_E > param1.field_E) {
                                                  break L62;
                                                } else {
                                                  stackIn_225_0 = 0;
                                                  decompiledRegionSelector0 = 21;
                                                  break L0;
                                                }
                                              }
                                            }
                                          }
                                          var17 = var17 + 100.0;
                                          var26--;
                                          break L61;
                                        } else {
                                          stackIn_220_0 = 0;
                                          decompiledRegionSelector0 = 20;
                                          break L0;
                                        }
                                      } else {
                                        break L61;
                                      }
                                    }
                                    L63: {
                                      if (50.0 >= var17) {
                                        break L63;
                                      } else {
                                        if ((4 & var38.field_e ^ -1) != -5) {
                                          L64: {
                                            if ((64 & var38.field_e ^ -1) != -65) {
                                              break L64;
                                            } else {
                                              if (var35 >= 50.0) {
                                                break L64;
                                              } else {
                                                if (param2.field_E > param1.field_E) {
                                                  break L64;
                                                } else {
                                                  stackIn_235_0 = 0;
                                                  decompiledRegionSelector0 = 23;
                                                  break L0;
                                                }
                                              }
                                            }
                                          }
                                          var17 = var17 - 100.0;
                                          var26++;
                                          break L63;
                                        } else {
                                          stackIn_230_0 = 0;
                                          decompiledRegionSelector0 = 22;
                                          break L0;
                                        }
                                      }
                                    }
                                    L65: {
                                      if (var26 <= 0) {
                                        break L65;
                                      } else {
                                        if (var26 >= this.field_b - 1) {
                                          break L65;
                                        } else {
                                          var38 = this.a(102, var27, var28, var26);
                                          L66: while (true) {
                                            if (var38 != null) {
                                              var19 = var19 + var31;
                                              L67: while (true) {
                                                L68: {
                                                  if (null == var38.field_C) {
                                                    break L68;
                                                  } else {
                                                    if (100.0 >= var35) {
                                                      break L68;
                                                    } else {
                                                      var35 = var35 - 100.0;
                                                      var38 = var38.field_C;
                                                      var28++;
                                                      continue L67;
                                                    }
                                                  }
                                                }
                                                L69: {
                                                  if (var19 <= 50.0) {
                                                    break L69;
                                                  } else {
                                                    L70: {
                                                      if (100.0 >= var35) {
                                                        if ((var38.field_e & 8) != 8) {
                                                          if ((128 & var38.field_e) != 128) {
                                                            break L70;
                                                          } else {
                                                            if (50.0 <= var35) {
                                                              break L70;
                                                            } else {
                                                              stackIn_258_0 = 0;
                                                              decompiledRegionSelector0 = 26;
                                                              break L0;
                                                            }
                                                          }
                                                        } else {
                                                          stackIn_254_0 = 0;
                                                          decompiledRegionSelector0 = 25;
                                                          break L0;
                                                        }
                                                      } else {
                                                        break L70;
                                                      }
                                                    }
                                                    var19 = var19 - 100.0;
                                                    var27++;
                                                    break L69;
                                                  }
                                                }
                                                L71: {
                                                  if (-50.0 <= var19) {
                                                    break L71;
                                                  } else {
                                                    L72: {
                                                      if (var35 > 100.0) {
                                                        break L72;
                                                      } else {
                                                        if (2 == (2 & var38.field_e)) {
                                                          stackIn_265_0 = 0;
                                                          decompiledRegionSelector0 = 27;
                                                          break L0;
                                                        } else {
                                                          if ((var38.field_e & 32) != 32) {
                                                            break L72;
                                                          } else {
                                                            if (var35 < 50.0) {
                                                              stackIn_270_0 = 0;
                                                              decompiledRegionSelector0 = 28;
                                                              break L0;
                                                            } else {
                                                              break L72;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var19 = var19 + 100.0;
                                                    var27--;
                                                    break L71;
                                                  }
                                                }
                                                L73: {
                                                  if ((var27 ^ -1) >= -1) {
                                                    break L73;
                                                  } else {
                                                    if (var27 < -1 + this.field_e) {
                                                      var38 = this.a(-56, var27, var28, var26);
                                                      L74: while (true) {
                                                        if (var38 != null) {
                                                          L75: while (true) {
                                                            L76: {
                                                              if (null == var38.field_C) {
                                                                break L76;
                                                              } else {
                                                                if (var35 <= 100.0) {
                                                                  break L76;
                                                                } else {
                                                                  var28++;
                                                                  var35 = var35 - 100.0;
                                                                  var38 = this.a(111, var27, var28, var26);
                                                                  continue L75;
                                                                }
                                                              }
                                                            }
                                                            L77: {
                                                              if (var38.field_h == null) {
                                                                break L77;
                                                              } else {
                                                                var39 = var38.field_h.c(-127);
                                                                var40 = var38.field_h.h(13);
                                                                if ((double)var40 <= var19) {
                                                                  break L77;
                                                                } else {
                                                                  if ((double)(-var39) >= var17) {
                                                                    break L77;
                                                                  } else {
                                                                    if (var17 >= (double)var39) {
                                                                      break L77;
                                                                    } else {
                                                                      if ((double)(-var39) >= var19) {
                                                                        break L77;
                                                                      } else {
                                                                        if (var19 >= (double)var39) {
                                                                          break L77;
                                                                        } else {
                                                                          L78: {
                                                                            if (var38.field_h != param1) {
                                                                              break L78;
                                                                            } else {
                                                                              if (param3) {
                                                                                break L78;
                                                                              } else {
                                                                                stackIn_292_0 = 1;
                                                                                decompiledRegionSelector0 = 30;
                                                                                break L0;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (var38.field_h == param2) {
                                                                            break L77;
                                                                          } else {
                                                                            stackIn_295_0 = 0;
                                                                            decompiledRegionSelector0 = 31;
                                                                            break L0;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            if (!param3) {
                                                              continue L51;
                                                            } else {
                                                              if (param1.field_i != var38.field_A) {
                                                                continue L51;
                                                              } else {
                                                                if (var38.field_n != param1.field_gb) {
                                                                  continue L51;
                                                                } else {
                                                                  if (param1.field_R == var38.field_r) {
                                                                    stackIn_302_0 = 1;
                                                                    decompiledRegionSelector0 = 32;
                                                                    break L0;
                                                                  } else {
                                                                    continue L51;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var35 = var35 + 100.0;
                                                          var28--;
                                                          var38 = this.a(-123, var27, var28, var26);
                                                          continue L74;
                                                        }
                                                      }
                                                    } else {
                                                      break L73;
                                                    }
                                                  }
                                                }
                                                stackIn_276_0 = 0;
                                                decompiledRegionSelector0 = 29;
                                                break L0;
                                              }
                                            } else {
                                              var28--;
                                              var35 = var35 + 100.0;
                                              var38 = this.a(param0 ^ 10011, var27, var28, var26);
                                              continue L66;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackIn_241_0 = 0;
                                    decompiledRegionSelector0 = 24;
                                    break L0;
                                  } else {
                                    var28--;
                                    var35 = var35 + 100.0;
                                    var38 = this.a(-75, var27, var28, var26);
                                    continue L52;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          stackIn_165_0 = 0;
                          decompiledRegionSelector0 = 12;
                          break L0;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L79: {
            var5_ref = decompiledCaughtException;
            stackIn_308_0 = (RuntimeException) (var5_ref);

            stackIn_308_1 = new StringBuilder().append("dk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_309_0 = (RuntimeException) ((Object) stackIn_308_0);
              stackIn_309_1 = (StringBuilder) ((Object) stackIn_308_1);
              stackIn_309_2 = "null";
              break L79;
            } else {
              stackIn_309_0 = (RuntimeException) ((Object) stackIn_308_0);
              stackIn_309_1 = (StringBuilder) ((Object) stackIn_308_1);
              stackIn_309_2 = "{...}";
              break L79;
            }
          }
          L80: {


            stackIn_311_1 = ((StringBuilder) (Object) stackIn_309_1).append(stackIn_309_2).append(',');

            if (param2 == null) {
              stackIn_309_0 = (RuntimeException) ((Object) stackIn_309_0);
              stackIn_312_1 = (StringBuilder) ((Object) stackIn_311_1);
              stackIn_312_2 = "null";
              break L80;
            } else {
              stackIn_309_0 = (RuntimeException) ((Object) stackIn_309_0);
              stackIn_312_1 = (StringBuilder) ((Object) stackIn_311_1);
              stackIn_312_2 = "{...}";
              break L80;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_309_0), stackIn_312_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_39_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_43_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_48_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_53_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_57_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_62_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_165_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_179_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_192_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_198_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_202_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_207_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_211_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_215_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_220_0 != 0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_225_0 != 0;
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return stackIn_230_0 != 0;
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return stackIn_235_0 != 0;
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return stackIn_241_0 != 0;
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return stackIn_254_0 != 0;
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return stackIn_258_0 != 0;
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return stackIn_265_0 != 0;
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return stackIn_270_0 != 0;
                                                                } else {
                                                                  if (decompiledRegionSelector0 == 29) {
                                                                    return stackIn_276_0 != 0;
                                                                  } else {
                                                                    if (decompiledRegionSelector0 == 30) {
                                                                      return stackIn_292_0 != 0;
                                                                    } else {
                                                                      if (decompiledRegionSelector0 == 31) {
                                                                        return stackIn_295_0 != 0;
                                                                      } else {
                                                                        if (decompiledRegionSelector0 == 32) {
                                                                          return stackIn_302_0 != 0;
                                                                        } else {
                                                                          return stackIn_305_0 != 0;
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
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        L0: {
          if (param4 == -17402) {
            break L0;
          } else {
            this.field_b = -75;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.a(param1, param5, param0, param3, param2, (byte) 94, param6)) {
              break L2;
            } else {
              if (!this.a(param6, param3, param2, param5, param0, (byte) 118, param1)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        var16 = Terraphoenix.field_V;
        L0: while (true) {
          var2 = 1;
          var3 = 0;
          var4 = 0;
          var5 = 0;
          L1: while (true) {
            if (this.field_b <= var5) {
              L2: {
                if (var2 != 0) {
                  break L2;
                } else {
                  L3: {
                    var5 = this.field_f[var3][var4].field_x;
                    if (-25 <= (var5 ^ -1)) {
                      break L3;
                    } else {
                      var5 = (int)(-24.0 + Math.random() * (double)var5 + 24.0);
                      break L3;
                    }
                  }
                  L4: {
                    if (75.0 <= 100.0 * Math.random()) {
                      break L4;
                    } else {
                      if (16 >= var5) {
                        break L4;
                      } else {
                        var5 = 16;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (100.0 * Math.random() >= 75.0) {
                      break L5;
                    } else {
                      if (8 >= var5) {
                        break L5;
                      } else {
                        var5 = 8;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (50.0 <= 100.0 * Math.random()) {
                      break L6;
                    } else {
                      if (-5 > (var5 ^ -1)) {
                        var5 = 4;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    var4 = var4 - (-1 + var5);
                    var3 = var3 - (-1 + var5);
                    var6 = 1 + (int)(2.0 * Math.random());
                    if (var5 > 8) {
                      break L7;
                    } else {
                      var6 = (int)(2.0 * Math.random());
                      break L7;
                    }
                  }
                  L8: {
                    if (1 == var5) {
                      this.field_f[var3][var4].field_b = 0;
                      this.field_f[var3][var4].field_B = true;
                      var6 = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (0 == var6) {
                      var7 = var3;
                      L10: while (true) {
                        if (var5 + var3 <= var7) {
                          var6 = 0;
                          break L9;
                        } else {
                          var8 = var4;
                          L11: while (true) {
                            if (var5 + var4 <= var8) {
                              var7++;
                              continue L10;
                            } else {
                              L12: {
                                this.field_f[var7][var8].field_b = 0;
                                this.field_f[var7][var8].field_B = true;
                                if (Math.random() * 100.0 >= 20.0) {
                                  break L12;
                                } else {
                                  this.field_f[var7][var8].field_j = 0;
                                  break L12;
                                }
                              }
                              if (var3 < var7) {
                                if (var4 < var8) {
                                  L13: {
                                    L14: {
                                      if ((this.field_f[-1 + var7][var8].field_j ^ -1) == -2) {
                                        break L14;
                                      } else {
                                        if (this.field_f[var7][var8 - 1].field_j == 1) {
                                          break L14;
                                        } else {
                                          if ((this.field_f[1 + var7][var8].field_j ^ -1) == -2) {
                                            break L14;
                                          } else {
                                            if ((this.field_f[-1 + var7][var8].field_j ^ -1) == -8) {
                                              break L14;
                                            } else {
                                              if (7 == this.field_f[var7][var8 - 1].field_j) {
                                                break L14;
                                              } else {
                                                if (this.field_f[var7 - -1][var8].field_j != 7) {
                                                  break L13;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L15: {
                                      if (this.field_f[var7 + -1][var8].field_j == 1) {
                                        break L15;
                                      } else {
                                        if (1 == this.field_f[var7][1 + var8].field_j) {
                                          break L15;
                                        } else {
                                          if ((this.field_f[var7 - -1][var8].field_j ^ -1) == -2) {
                                            break L15;
                                          } else {
                                            if (7 == this.field_f[var7 + -1][var8].field_j) {
                                              break L15;
                                            } else {
                                              if (7 == this.field_f[var7][var8 - -1].field_j) {
                                                break L15;
                                              } else {
                                                if (7 != this.field_f[var7 - -1][var8].field_j) {
                                                  break L13;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L16: {
                                      if ((this.field_f[var7 + -1][var8].field_j ^ -1) == -2) {
                                        break L16;
                                      } else {
                                        if (-2 == (this.field_f[var7][var8 + -1].field_j ^ -1)) {
                                          break L16;
                                        } else {
                                          if (1 == this.field_f[1 + var8][var8].field_j) {
                                            break L16;
                                          } else {
                                            if (7 == this.field_f[-1 + var7][var8].field_j) {
                                              break L16;
                                            } else {
                                              if (-8 == (this.field_f[var7][var8 - 1].field_j ^ -1)) {
                                                break L16;
                                              } else {
                                                if (this.field_f[var7][-1 + var8].field_j != 7) {
                                                  break L13;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (-2 != (this.field_f[1 + var7][var8].field_j ^ -1)) {
                                      if (this.field_f[var7][var8 - 1].field_j != 1) {
                                        if (-2 != (this.field_f[var8 + 1][var8].field_j ^ -1)) {
                                          if ((this.field_f[var7 + 1][var8].field_j ^ -1) != -8) {
                                            if ((this.field_f[var7][var8 + -1].field_j ^ -1) != -8) {
                                              if (-8 != (this.field_f[var7][var8 - -1].field_j ^ -1)) {
                                                break L13;
                                              } else {
                                                var8++;
                                                continue L11;
                                              }
                                            } else {
                                              var8++;
                                              continue L11;
                                            }
                                          } else {
                                            var8++;
                                            continue L11;
                                          }
                                        } else {
                                          var8++;
                                          continue L11;
                                        }
                                      } else {
                                        var8++;
                                        continue L11;
                                      }
                                    } else {
                                      var8++;
                                      continue L11;
                                    }
                                  }
                                  if (100.0 * Math.random() < 10.0) {
                                    this.field_f[var7][var8].field_j = 1;
                                    var8++;
                                    continue L11;
                                  } else {
                                    var8++;
                                    continue L11;
                                  }
                                } else {
                                  var8++;
                                  continue L11;
                                }
                              } else {
                                var8++;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  L17: {
                    if ((var6 ^ -1) == -2) {
                      var7 = var3;
                      L18: while (true) {
                        if (var5 + var3 <= var7) {
                          var6 = 0;
                          break L17;
                        } else {
                          var8 = var4;
                          L19: while (true) {
                            if (var8 >= var5 + var4) {
                              var7++;
                              continue L18;
                            } else {
                              L20: {
                                this.field_f[var7][var8].field_b = 0;
                                this.field_f[var7][var8].field_B = true;
                                if (30.0 > Math.random() * 100.0) {
                                  this.field_f[var7][var8].field_j = 0;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              L21: {
                                if (var7 <= var3) {
                                  break L21;
                                } else {
                                  if (var4 >= var8) {
                                    break L21;
                                  } else {
                                    L22: {
                                      L23: {
                                        if (1 == this.field_f[-1 + var7][var8].field_j) {
                                          break L23;
                                        } else {
                                          if ((this.field_f[var7][-1 + var8].field_j ^ -1) == -2) {
                                            break L23;
                                          } else {
                                            if (-2 == (this.field_f[var7 - -1][var8].field_j ^ -1)) {
                                              break L23;
                                            } else {
                                              if ((this.field_f[var7 + -1][var8].field_j ^ -1) == -8) {
                                                break L23;
                                              } else {
                                                if (7 == this.field_f[var7][-1 + var8].field_j) {
                                                  break L23;
                                                } else {
                                                  if (this.field_f[1 + var7][var8].field_j != 7) {
                                                    break L22;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L24: {
                                        if ((this.field_f[var7 - 1][var8].field_j ^ -1) == -2) {
                                          break L24;
                                        } else {
                                          if (1 == this.field_f[var7][1 + var8].field_j) {
                                            break L24;
                                          } else {
                                            if ((this.field_f[var7 + 1][var8].field_j ^ -1) == -2) {
                                              break L24;
                                            } else {
                                              if ((this.field_f[var7 - 1][var8].field_j ^ -1) == -8) {
                                                break L24;
                                              } else {
                                                if (7 == this.field_f[var7][var8 + 1].field_j) {
                                                  break L24;
                                                } else {
                                                  if (7 != this.field_f[1 + var7][var8].field_j) {
                                                    break L22;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L25: {
                                        if (this.field_f[var7 - 1][var8].field_j == 1) {
                                          break L25;
                                        } else {
                                          if (1 == this.field_f[var7][var8 + -1].field_j) {
                                            break L25;
                                          } else {
                                            if ((this.field_f[1 + var8][var8].field_j ^ -1) == -2) {
                                              break L25;
                                            } else {
                                              if (this.field_f[var7 + -1][var8].field_j == 7) {
                                                break L25;
                                              } else {
                                                if (7 == this.field_f[var7][var8 + -1].field_j) {
                                                  break L25;
                                                } else {
                                                  if ((this.field_f[var7][-1 + var8].field_j ^ -1) != -8) {
                                                    break L22;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (1 == this.field_f[var7 - -1][var8].field_j) {
                                        break L21;
                                      } else {
                                        if (-2 == (this.field_f[var7][var8 + -1].field_j ^ -1)) {
                                          break L21;
                                        } else {
                                          if (this.field_f[1 + var8][var8].field_j == 1) {
                                            break L21;
                                          } else {
                                            if (-8 == (this.field_f[1 + var7][var8].field_j ^ -1)) {
                                              break L21;
                                            } else {
                                              if (7 == this.field_f[var7][var8 - 1].field_j) {
                                                break L21;
                                              } else {
                                                if (7 == this.field_f[var7][1 + var8].field_j) {
                                                  break L21;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (100.0 * Math.random() >= 40.0) {
                                      break L21;
                                    } else {
                                      this.field_f[var7][var8].field_j = 1;
                                      break L21;
                                    }
                                  }
                                }
                              }
                              if (var7 > var3) {
                                if (var4 < var8) {
                                  L26: {
                                    L27: {
                                      if (-2 == (this.field_f[var7 + -1][var8].field_j ^ -1)) {
                                        break L27;
                                      } else {
                                        if (-2 == (this.field_f[var7][var8 - 1].field_j ^ -1)) {
                                          break L27;
                                        } else {
                                          if (-2 == (this.field_f[1 + var7][var8].field_j ^ -1)) {
                                            break L27;
                                          } else {
                                            if (this.field_f[-1 + var7][var8].field_j == 7) {
                                              break L27;
                                            } else {
                                              if (this.field_f[var7][var8 + -1].field_j == 7) {
                                                break L27;
                                              } else {
                                                if (-8 != (this.field_f[1 + var7][var8].field_j ^ -1)) {
                                                  break L26;
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L28: {
                                      if (this.field_f[var7 - 1][var8].field_j == 1) {
                                        break L28;
                                      } else {
                                        if (-2 == (this.field_f[var7][var8 - -1].field_j ^ -1)) {
                                          break L28;
                                        } else {
                                          if ((this.field_f[var7 + 1][var8].field_j ^ -1) == -2) {
                                            break L28;
                                          } else {
                                            if (this.field_f[var7 + -1][var8].field_j == 7) {
                                              break L28;
                                            } else {
                                              if (this.field_f[var7][1 + var8].field_j == 7) {
                                                break L28;
                                              } else {
                                                if ((this.field_f[1 + var7][var8].field_j ^ -1) != -8) {
                                                  break L26;
                                                } else {
                                                  break L28;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L29: {
                                      if (1 == this.field_f[var7 + -1][var8].field_j) {
                                        break L29;
                                      } else {
                                        if ((this.field_f[var7][-1 + var8].field_j ^ -1) == -2) {
                                          break L29;
                                        } else {
                                          if (1 == this.field_f[var8 - -1][var8].field_j) {
                                            break L29;
                                          } else {
                                            if (7 == this.field_f[-1 + var7][var8].field_j) {
                                              break L29;
                                            } else {
                                              if (this.field_f[var7][-1 + var8].field_j == 7) {
                                                break L29;
                                              } else {
                                                if (this.field_f[var7][var8 + -1].field_j != 7) {
                                                  break L26;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (this.field_f[var7 - -1][var8].field_j != 1) {
                                      if (-2 != (this.field_f[var7][-1 + var8].field_j ^ -1)) {
                                        if (-2 != (this.field_f[1 + var8][var8].field_j ^ -1)) {
                                          if (-8 != (this.field_f[1 + var7][var8].field_j ^ -1)) {
                                            if (7 != this.field_f[var7][-1 + var8].field_j) {
                                              if (-8 != (this.field_f[var7][var8 + 1].field_j ^ -1)) {
                                                break L26;
                                              } else {
                                                var8++;
                                                continue L19;
                                              }
                                            } else {
                                              var8++;
                                              continue L19;
                                            }
                                          } else {
                                            var8++;
                                            continue L19;
                                          }
                                        } else {
                                          var8++;
                                          continue L19;
                                        }
                                      } else {
                                        var8++;
                                        continue L19;
                                      }
                                    } else {
                                      var8++;
                                      continue L19;
                                    }
                                  }
                                  if (20.0 > 100.0 * Math.random()) {
                                    this.field_f[var7][var8].field_j = 7;
                                    var8++;
                                    continue L19;
                                  } else {
                                    var8++;
                                    continue L19;
                                  }
                                } else {
                                  var8++;
                                  continue L19;
                                }
                              } else {
                                var8++;
                                continue L19;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                  if (2 != var6) {
                    break L2;
                  } else {
                    L30: {
                      var7 = 2 + ((int)((double)(-3 + var5) * Math.random()) + var3);
                      var8 = 2 + (int)((double)(-3 + var5) * Math.random()) + var4;
                      var9 = 1;
                      var10 = 2;
                      var11 = -1;
                      var12 = 60;
                      var13 = (int)(3.0 * Math.random());
                      if (1 != var13) {
                        break L30;
                      } else {
                        var9 = 0;
                        var10 = 0;
                        var11 = 6;
                        break L30;
                      }
                    }
                    L31: {
                      if (Math.random() * 100.0 >= 50.0) {
                        break L31;
                      } else {
                        var12 = 64;
                        break L31;
                      }
                    }
                    L32: {
                      if ((var13 ^ -1) == -3) {
                        var10 = 1;
                        var9 = 1;
                        var11 = 4;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    var14 = var3;
                    L33: while (true) {
                      if (var5 + var3 <= var14) {
                        break L2;
                      } else {
                        var15 = var4;
                        L34: while (true) {
                          if (var15 >= var4 - -var5) {
                            var14++;
                            continue L33;
                          } else {
                            L35: {
                              this.field_f[var14][var15].field_b = 0;
                              if (var3 >= var14) {
                                break L35;
                              } else {
                                if (var15 > var4) {
                                  this.field_f[var14][var15].field_b = var9;
                                  if (-1 != ((var15 - -var14 - -(int)(Math.random() * 3.0)) % 2 ^ -1)) {
                                    break L35;
                                  } else {
                                    this.field_f[var14][var15].field_b = var10;
                                    break L35;
                                  }
                                } else {
                                  break L35;
                                }
                              }
                            }
                            this.field_f[var14][var15].field_B = true;
                            if (var7 != var14) {
                              if (var14 != 1 + var7) {
                                if (var8 != var15) {
                                  if (var15 != 1 + var8) {
                                    L36: {
                                      L37: {
                                        if (1 + var3 >= var14) {
                                          break L37;
                                        } else {
                                          if (1 + var4 < var15) {
                                            if (Math.random() * 100.0 < 65.0) {
                                              this.field_f[var14][var15].field_j = var11;
                                              break L36;
                                            } else {
                                              break L36;
                                            }
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                      if (100.0 * Math.random() < 30.0) {
                                        this.field_f[var14][var15].field_j = 0;
                                        break L36;
                                      } else {
                                        break L36;
                                      }
                                    }
                                    if (1 + var3 == var14) {
                                      L38: {
                                        if (var15 != var4) {
                                          this.field_f[var14][var15].field_g = var12;
                                          break L38;
                                        } else {
                                          break L38;
                                        }
                                      }
                                      if (var15 == var4 + 1) {
                                        if (var14 != var3) {
                                          this.field_f[var14][var15].field_k = var12;
                                          var15++;
                                          continue L34;
                                        } else {
                                          var15++;
                                          continue L34;
                                        }
                                      } else {
                                        var15++;
                                        continue L34;
                                      }
                                    } else {
                                      if (var15 == var4 + 1) {
                                        if (var14 != var3) {
                                          this.field_f[var14][var15].field_k = var12;
                                          var15++;
                                          continue L34;
                                        } else {
                                          var15++;
                                          continue L34;
                                        }
                                      } else {
                                        var15++;
                                        continue L34;
                                      }
                                    }
                                  } else {
                                    var15++;
                                    continue L34;
                                  }
                                } else {
                                  var15++;
                                  continue L34;
                                }
                              } else {
                                var15++;
                                continue L34;
                              }
                            } else {
                              var15++;
                              continue L34;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (var2 == 0) {
                continue L0;
              } else {
                L39: {
                  if (param0 == 1) {
                    break L39;
                  } else {
                    this.field_i = (e) null;
                    break L39;
                  }
                }
                return;
              }
            } else {
              var6 = 0;
              L40: while (true) {
                if (this.field_b <= var6) {
                  var5++;
                  continue L1;
                } else {
                  L41: {
                    L42: {
                      if (-2 <= (var5 ^ -1)) {
                        break L42;
                      } else {
                        if (1 >= var6) {
                          break L42;
                        } else {
                          if (-1 + this.field_b <= var5) {
                            break L42;
                          } else {
                            if (-1 + this.field_b <= var6) {
                              break L42;
                            } else {
                              L43: {
                                var7 = 64;
                                if (var7 > this.field_f[var5 + -1][var6].field_x) {
                                  var7 = this.field_f[-1 + var5][var6].field_x;
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                              L44: {
                                if (this.field_f[var5][-1 + var6].field_x < var7) {
                                  var7 = this.field_f[var5][-1 + var6].field_x;
                                  break L44;
                                } else {
                                  break L44;
                                }
                              }
                              L45: {
                                if (this.field_f[-1 + var5][-1 + var6].field_x < var7) {
                                  var7 = this.field_f[var5 + -1][var6 - 1].field_x;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              this.field_f[var5][var6].field_x = 1 + var7;
                              break L41;
                            }
                          }
                        }
                      }
                    }
                    this.field_f[var5][var6].field_x = 1;
                    break L41;
                  }
                  L46: {
                    if (!this.field_f[var5][var6].field_B) {
                      break L46;
                    } else {
                      this.field_f[var5][var6].field_x = 0;
                      break L46;
                    }
                  }
                  if (-5 > (this.field_f[var5][var6].field_x ^ -1)) {
                    var3 = var5;
                    var2 = 0;
                    var4 = var6;
                    var6++;
                    continue L40;
                  } else {
                    var6++;
                    continue L40;
                  }
                }
              }
            }
          }
        }
    }

    private final boolean a(boolean param0, int param1, int param2, byte param3, int param4) {
        dl var7;
        L0: {
          if ((param1 ^ -1) >= -1) {
            break L0;
          } else {
            if (param2 <= 0) {
              break L0;
            } else {
              if (-1 + this.field_b <= param1) {
                break L0;
              } else {
                if (-1 + this.field_e > param2) {
                  var7 = this.a(-30, param2, param4, param1);
                  if (var7 == null) {
                    return false;
                  } else {
                    if (2 != var7.field_v) {
                      if (-4 == (var7.field_v ^ -1)) {
                        return true;
                      } else {
                        L1: {
                          if (var7.field_h == null) {
                            break L1;
                          } else {
                            L2: {
                              if (param0) {
                                break L2;
                              } else {
                                if (var7.field_h.field_k) {
                                  break L2;
                                } else {
                                  break L1;
                                }
                              }
                            }
                            return true;
                          }
                        }
                        L3: {
                          if ((var7.field_v ^ -1) != -5) {
                            break L3;
                          } else {
                            if (null == var7.field_C.field_h) {
                              break L3;
                            } else {
                              return true;
                            }
                          }
                        }
                        L4: {
                          if (5 != var7.field_v) {
                            break L4;
                          } else {
                            if (null != var7.field_c.field_h) {
                              return true;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (param3 > 75) {
                            break L5;
                          } else {
                            this.field_b = 66;
                            break L5;
                          }
                        }
                        return false;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return true;
                }
              }
            }
          }
        }
        return true;
    }

    final boolean a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
            this.field_g = (int[][]) null;
        }
        return this.a(true, param0, param3, (byte) 87, param2);
    }

    final byte[] a(boolean param0) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        byte[] var2;
        int var3;
        int var4_int;
        byte[] var4;
        int var5;
        int var6;
        int var7;
        dl var8;
        int var9;
        byte[] var10;
        int var11;
        byte[] var12;
        byte[] var13;
        L0: {
          var9 = Terraphoenix.field_V;
          var10 = new byte[2 + 24 * this.field_e * this.field_b];
          var13 = var10;
          var12 = var13;
          var2 = var12;
          var3 = 0;
          if (param0) {
            break L0;
          } else {
            this.field_b = -81;
            break L0;
          }
        }
        int incrementValue$0 = var3;
        var3++;
        var10[incrementValue$0] = (byte)this.field_b;
        int incrementValue$1 = var3;
        var3++;
        var10[incrementValue$1] = (byte)this.field_e;
        var4_int = 0;
        L1: while (true) {
          if (this.field_b <= var4_int) {
            var4 = new byte[var3];
            var11 = 0;
            var5 = var11;
            L2: while (true) {
              if (var3 <= var11) {
                return var4;
              } else {
                var4[var11] = var13[var11];
                var11++;
                continue L2;
              }
            }
          } else {
            var5 = 0;
            L3: while (true) {
              if (this.field_e <= var5) {
                var4_int++;
                continue L1;
              } else {
                L4: {
                  if (this.field_f[var4_int][var5] != null) {
                    var6 = this.field_f[var4_int][var5].field_r;
                    break L4;
                  } else {
                    var6 = -50;
                    break L4;
                  }
                }
                incrementValue$2 = var3;
                var3++;
                var2[incrementValue$2] = (byte)(50 + var6);
                var7 = 0;
                if ((var6 ^ -1) == 49) {
                  var7 = 1;
                  var5++;
                  continue L3;
                } else {
                  var8 = this.field_f[var4_int][var5];
                  L5: while (true) {
                    if (var7 == 0) {
                      incrementValue$3 = var3;
                      var3++;
                      var2[incrementValue$3] = (byte)(1 + var8.field_b);
                      incrementValue$4 = var3;
                      var3++;
                      var2[incrementValue$4] = (byte)(1 + var8.field_j);
                      incrementValue$5 = var3;
                      var3++;
                      var2[incrementValue$5] = (byte)(var8.field_g - -1);
                      incrementValue$6 = var3;
                      var3++;
                      var2[incrementValue$6] = (byte)(1 + var8.field_k);
                      incrementValue$7 = var3;
                      var3++;
                      var2[incrementValue$7] = (byte)(var8.field_l + -(100 * var8.field_r));
                      var7 = 1;
                      if (null != var8.field_C) {
                        incrementValue$8 = var3;
                        var3++;
                        var2[incrementValue$8] = (byte) 1;
                        var7 = 0;
                        var8 = var8.field_C;
                        continue L5;
                      } else {
                        incrementValue$9 = var3;
                        var3++;
                        var2[incrementValue$9] = (byte) 0;
                        continue L5;
                      }
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        byte[] var8;
        int var9;
        var9 = Terraphoenix.field_V;
        L0: while (true) {
          var2 = 1;
          var3 = 0;
          var4 = 0;
          var5 = 0;
          L1: while (true) {
            if (this.field_b <= var5) {
              L2: {
                if (var2 != 0) {
                  break L2;
                } else {
                  var3 = (int)(Math.random() * (double)(this.field_b / 16)) * 16;
                  var4 = (int)(Math.random() * (double)(this.field_b / 16)) * 16;
                  var5 = this.field_f[var3 - -15][15 + var4].field_x;
                  if (-17 < (var5 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      var6 = 5;
                      var7 = 8;
                      var8 = of.field_k[wf.a("City" + ((int)((double)var6 * Math.random()) + 1), true)];
                      if ((var5 ^ -1) > -33) {
                        break L3;
                      } else {
                        var8 = of.field_k[wf.a("City" + (1 - -(int)((double)var7 * Math.random())), true)];
                        if (100.0 * Math.random() < 90.0) {
                          var8 = of.field_k[wf.a("City" + (6 - -(int)(3.0 * Math.random())), true)];
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var8 == null) {
                      break L2;
                    } else {
                      this.a(var3, (byte) 104, var4, var8);
                      break L2;
                    }
                  }
                }
              }
              if (var2 == 0) {
                continue L0;
              } else {
                if (param0 == -106) {
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= this.field_b) {
                      L5: {
                        if (!mb.b(0, param0 + 187)) {
                          break L5;
                        } else {
                          var3 = 0;
                          L6: while (true) {
                            if (this.field_b <= var3) {
                              break L5;
                            } else {
                              var4 = 0;
                              L7: while (true) {
                                if (var4 >= this.field_e) {
                                  var3++;
                                  continue L6;
                                } else {
                                  L8: {
                                    if ((this.field_f[var3][var4].field_j ^ -1) == -44) {
                                      break L8;
                                    } else {
                                      if ((this.field_f[var3][var4].field_j ^ -1) == -45) {
                                        break L8;
                                      } else {
                                        var4++;
                                        continue L7;
                                      }
                                    }
                                  }
                                  this.field_f[var3][var4].field_j = -1;
                                  this.field_f[var3][var4].field_v = 0;
                                  this.field_f[var3][var4].field_C.field_v = 0;
                                  var4++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      var4 = 0;
                      L9: while (true) {
                        if (var4 >= this.field_e) {
                          var3++;
                          continue L4;
                        } else {
                          L10: {
                            if (this.field_f[var3][var4] == null) {
                              this.field_f[var3][var4] = new dl(var3, var4, 0, (dk) (this));
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            if (this.field_f[var3][var4].field_b == -1) {
                              break L11;
                            } else {
                              if (-1 == this.field_f[var3][var4].field_v) {
                                break L11;
                              } else {
                                var4++;
                                continue L9;
                              }
                            }
                          }
                          this.field_f[var3][var4].field_b = 1;
                          this.field_f[var3][var4].field_v = 0;
                          var4++;
                          continue L9;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              var6 = 0;
              L12: while (true) {
                if (this.field_b <= var6) {
                  var5++;
                  continue L1;
                } else {
                  L13: {
                    L14: {
                      if (-1 <= (var5 ^ -1)) {
                        break L14;
                      } else {
                        if (-1 <= (var6 ^ -1)) {
                          break L14;
                        } else {
                          if (var5 >= this.field_b) {
                            break L14;
                          } else {
                            if (this.field_b <= var6) {
                              break L14;
                            } else {
                              L15: {
                                var7 = 64;
                                if (this.field_f[-1 + var5][var6].field_x >= var7) {
                                  break L15;
                                } else {
                                  var7 = this.field_f[-1 + var5][var6].field_x;
                                  break L15;
                                }
                              }
                              L16: {
                                if (this.field_f[var5][-1 + var6].field_x < var7) {
                                  var7 = this.field_f[var5][var6 - 1].field_x;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              L17: {
                                if (var7 <= this.field_f[-1 + var5][var6 + -1].field_x) {
                                  break L17;
                                } else {
                                  var7 = this.field_f[var5 + -1][-1 + var6].field_x;
                                  break L17;
                                }
                              }
                              this.field_f[var5][var6].field_x = var7 - -1;
                              break L13;
                            }
                          }
                        }
                      }
                    }
                    this.field_f[var5][var6].field_x = 1;
                    break L13;
                  }
                  L18: {
                    if (!this.field_f[var5][var6].field_B) {
                      break L18;
                    } else {
                      this.field_f[var5][var6].field_x = 0;
                      break L18;
                    }
                  }
                  if (16 <= this.field_f[var5][var6].field_x) {
                    if (var5 % 16 == 15) {
                      if (-16 == (var6 % 16 ^ -1)) {
                        var2 = 0;
                        var6++;
                        continue L12;
                      } else {
                        var6++;
                        continue L12;
                      }
                    } else {
                      var6++;
                      continue L12;
                    }
                  } else {
                    var6++;
                    continue L12;
                  }
                }
              }
            }
          }
        }
    }

    final ue a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8) {
        int stackIn_22_0 = 0;
        boolean stackIn_78_0 = false;
        boolean stackIn_79_0 = false;
        int stackIn_79_1 = 0;
        int var10;
        int var11;
        int var13;
        int var14_int;
        ue var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        dl var24;
        dl var25;
        dl var26;
        var23 = Terraphoenix.field_V;
        var10 = param7;
        var11 = param1;
        var25 = this.a(113, param1, param5, param7);
        if (param3 <= -78) {
          var13 = 0;
          if (var25 != null) {
            L0: {
              if (!param4) {
                break L0;
              } else {
                if (var25.field_a) {
                  break L0;
                } else {
                  if (!var25.field_d) {
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
            }
            L1: {
              L2: {
                L3: {
                  if (var25 != null) {
                    L4: {
                      if ((var25.field_v ^ -1) == -5) {
                        param5++;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (!var25.field_d) {
                        stackIn_22_0 = 0;
                        break L5;
                      } else {
                        stackIn_22_0 = 1;
                        break L5;
                      }
                    }
                    L6: {
                      var13 = stackIn_22_0;
                      if ((var25.field_v ^ -1) != -6) {
                        break L6;
                      } else {
                        param5--;
                        break L6;
                      }
                    }
                    if (param6 != param5) {
                      var14_int = 0;
                      break L3;
                    } else {
                      break L1;
                    }
                  } else {
                    if (param6 != param5) {
                      var14_int = 0;
                      if (this.field_b <= var14_int) {
                        break L2;
                      } else {
                        var15 = 0;
                        L7: while (true) {
                          if (var15 < this.field_e) {
                            this.field_d[var14_int][var15] = 1000;
                            var15++;
                            continue L7;
                          } else {
                            var14_int++;
                            break L3;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L8: while (true) {
                  if (this.field_b <= var14_int) {
                    break L2;
                  } else {
                    var15 = 0;
                    L9: while (true) {
                      if (var15 < this.field_e) {
                        this.field_d[var14_int][var15] = 1000;
                        var15++;
                        continue L9;
                      } else {
                        var14_int++;
                        continue L8;
                      }
                    }
                  }
                }
              }
              var14_int = param8;
              var15 = param8;
              var16 = param2;
              var17 = param2;
              this.field_d[param8][param2] = 0;
              var20 = 0;
              L10: while (true) {
                if (-1001 >= (var20 ^ -1)) {
                  break L1;
                } else {
                  var21 = var14_int;
                  L11: while (true) {
                    if (var15 < var21) {
                      var20++;
                      continue L10;
                    } else {
                      var22 = var16;
                      L12: while (true) {
                        if (var17 < var22) {
                          var21++;
                          continue L11;
                        } else {
                          L13: {
                            if (var20 == this.field_d[var21][var22]) {
                              L14: {
                                if (var22 != var16) {
                                  break L14;
                                } else {
                                  if (1 >= var22) {
                                    break L14;
                                  } else {
                                    var16--;
                                    break L14;
                                  }
                                }
                              }
                              L15: {
                                L16: {
                                  if (var22 == var17) {
                                    L17: {
                                      if (var22 < this.field_e + -2) {
                                        var17++;
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    if (var21 == var15) {
                                      if (var21 < this.field_b - 2) {
                                        var15++;
                                        break L16;
                                      } else {
                                        if (var14_int != var21) {
                                          break L15;
                                        } else {
                                          if (-2 <= (var21 ^ -1)) {
                                            break L15;
                                          } else {
                                            var14_int--;
                                            break L15;
                                          }
                                        }
                                      }
                                    } else {
                                      if (var14_int != var21) {
                                        break L15;
                                      } else {
                                        if (-2 <= (var21 ^ -1)) {
                                          break L15;
                                        } else {
                                          var14_int--;
                                          break L15;
                                        }
                                      }
                                    }
                                  } else {
                                    if (var21 == var15) {
                                      if (var21 < this.field_b - 2) {
                                        var15++;
                                        break L16;
                                      } else {
                                        if (var14_int != var21) {
                                          break L15;
                                        } else {
                                          if (-2 <= (var21 ^ -1)) {
                                            break L15;
                                          } else {
                                            var14_int--;
                                            break L15;
                                          }
                                        }
                                      }
                                    } else {
                                      if (var14_int != var21) {
                                        break L15;
                                      } else {
                                        if (-2 <= (var21 ^ -1)) {
                                          break L15;
                                        } else {
                                          var14_int--;
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var14_int != var21) {
                                  break L15;
                                } else {
                                  if (-2 <= (var21 ^ -1)) {
                                    break L15;
                                  } else {
                                    var14_int--;
                                    break L15;
                                  }
                                }
                              }
                              var24 = this.a(-120, var22, param6, var21);
                              var26 = var24;
                              if (var26 == null) {
                                break L13;
                              } else {
                                L18: {
                                  if (!param4) {
                                    break L18;
                                  } else {
                                    if (var26.field_a) {
                                      break L18;
                                    } else {
                                      if (var26.field_d) {
                                        this.field_d[var21][var22] = 1000;
                                        break L13;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                L19: {
                                  if (-5 != (var26.field_v ^ -1)) {
                                    break L19;
                                  } else {
                                    if (param5 <= param6) {
                                      break L19;
                                    } else {
                                      L20: {
                                        stackIn_78_0 = var26.field_d;

                                        if (var13 != 0) {
                                          stackIn_79_0 = stackIn_78_0;
                                          stackIn_79_1 = 0;
                                          break L20;
                                        } else {
                                          stackIn_79_0 = stackIn_78_0;
                                          stackIn_79_1 = 1;
                                          break L20;
                                        }
                                      }
                                      if ((stackIn_79_0 ? 1 : 0) != stackIn_79_1) {
                                        var11 = var22;
                                        var20 = 1000;
                                        var10 = var21;
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                                L21: {
                                  if ((var26.field_v ^ -1) != -6) {
                                    break L21;
                                  } else {
                                    if (param5 >= param6) {
                                      break L21;
                                    } else {
                                      var11 = var22;
                                      var20 = 1000;
                                      var10 = var21;
                                      break L21;
                                    }
                                  }
                                }
                                L22: {
                                  if (1 < var21) {
                                    var18 = -1;
                                    var19 = 0;
                                    if (this.field_d[var18 + var21][var19 + var22] <= var20 - -var26.a(var19, var18, -108)) {
                                      break L22;
                                    } else {
                                      this.field_d[var21 - -var18][var22 - -var19] = var20 - -var24.a(var19, var18, -110);
                                      break L22;
                                    }
                                  } else {
                                    break L22;
                                  }
                                }
                                L23: {
                                  if ((var21 ^ -1) >= -2) {
                                    break L23;
                                  } else {
                                    if (-2 <= (var22 ^ -1)) {
                                      break L23;
                                    } else {
                                      var18 = -1;
                                      var19 = -1;
                                      if (this.field_d[var21 - -var18][var22 + var19] > var26.a(var19, var18, -122) + var20) {
                                        this.field_d[var18 + var21][var22 - -var19] = var24.a(var19, var18, -128) + var20;
                                        break L23;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                }
                                L24: {
                                  if (var21 <= 1) {
                                    break L24;
                                  } else {
                                    if (-2 + this.field_e > var22) {
                                      var18 = -1;
                                      var19 = 1;
                                      if (this.field_d[var21 + var18][var19 + var22] <= var20 - -var26.a(var19, var18, -122)) {
                                        break L24;
                                      } else {
                                        this.field_d[var18 + var21][var19 + var22] = var24.a(var19, var18, -128) + var20;
                                        break L24;
                                      }
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                L25: {
                                  if (-2 + this.field_b > var21) {
                                    var19 = 0;
                                    var18 = 1;
                                    if (this.field_d[var21 - -var18][var22 - -var19] <= var20 - -var26.a(var19, var18, -113)) {
                                      break L25;
                                    } else {
                                      this.field_d[var21 + var18][var22 + var19] = var20 - -var24.a(var19, var18, -118);
                                      break L25;
                                    }
                                  } else {
                                    break L25;
                                  }
                                }
                                L26: {
                                  if (var21 >= this.field_b - 2) {
                                    break L26;
                                  } else {
                                    if ((var22 ^ -1) < -2) {
                                      var19 = -1;
                                      var18 = 1;
                                      if (this.field_d[var21 - -var18][var22 - -var19] > var20 - -var26.a(var19, var18, -110)) {
                                        this.field_d[var21 - -var18][var22 + var19] = var20 + var24.a(var19, var18, -124);
                                        break L26;
                                      } else {
                                        break L26;
                                      }
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                L27: {
                                  if (this.field_b - 2 <= var21) {
                                    break L27;
                                  } else {
                                    if (-2 + this.field_e > var22) {
                                      var18 = 1;
                                      var19 = 1;
                                      if (this.field_d[var21 + var18][var22 + var19] <= var20 + var26.a(var19, var18, -125)) {
                                        break L27;
                                      } else {
                                        this.field_d[var21 - -var18][var22 + var19] = var24.a(var19, var18, -118) + var20;
                                        break L27;
                                      }
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                L28: {
                                  if (-2 <= (var22 ^ -1)) {
                                    break L28;
                                  } else {
                                    var18 = 0;
                                    var19 = -1;
                                    if (this.field_d[var18 + var21][var22 + var19] > var26.a(var19, var18, -119) + var20) {
                                      this.field_d[var18 + var21][var22 - -var19] = var20 - -var24.a(var19, var18, -113);
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                if (var22 < -2 + this.field_e) {
                                  var19 = 1;
                                  var18 = 0;
                                  if (this.field_d[var21 - -var18][var19 + var22] <= var26.a(var19, var18, -113) + var20) {
                                    break L13;
                                  } else {
                                    this.field_d[var18 + var21][var22 + var19] = var24.a(var19, var18, -106) + var20;
                                    break L13;
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                          if (-1001 == (var20 ^ -1)) {
                            var22 = var17;
                            var21 = var15;
                            var22++;
                            continue L12;
                          } else {
                            var22++;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            if (param0) {
              return this.a(var11, param6, var10, param6, param2, param8, true);
            } else {
              if (param6 == param5) {
                return this.a(param4, var10, param6, param8, var11, param2, 36);
              } else {
                var14 = this.a(param4, var10, param6, param8, var11, param2, 72);
                if (var14 != null) {
                  L29: {
                    var15 = param6;
                    if (var15 < param5) {
                      var15++;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (var15 <= param5) {
                      break L30;
                    } else {
                      var15--;
                      break L30;
                    }
                  }
                  var14.a(-19020, this.a(param0, param1, var11, -128, param4, param5, var15, param7, var10));
                  return var14;
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return (ue) null;
        }
    }

    final void b(byte param0) {
        int var2_int;
        r var2;
        int var3;
        int var4;
        var4 = Terraphoenix.field_V;
        var2_int = 0;
        L0: while (true) {
          if (this.field_b <= var2_int) {
            var3 = -7 / ((param0 - 28) / 46);
            var3 = 0;
            L1: while (true) {
              if (-13 >= (var3 ^ -1)) {
                return;
              } else {
                var2 = this.field_i.field_C[var3];
                if (var2 != null) {
                  if (-1 > (var2.field_P ^ -1)) {
                    var2.b((byte) -27);
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          } else {
            var3 = 0;
            L2: while (true) {
              if (this.field_e <= var3) {
                var2_int++;
                continue L0;
              } else {
                this.field_g[var2_int][var3] = 1000;
                var3++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, String param4) {
        try {
            og.field_f.c(param4, param2 + -1, param0, 0, -1);
            og.field_f.c(param4, 1 + param2, param0, 0, -1);
            og.field_f.c(param4, param2, param0 + -1, 0, -1);
            og.field_f.c(param4, param2, param0 - -1, 0, -1);
            if (param3 != -2) {
                this.field_m = 65;
            }
            og.field_f.c(param4, param2, param0, param1, -1);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "dk.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        this.a(false, true);
        if (param0 > -52) {
            this.field_k = -63;
        }
    }

    final dl a(int param0, int param1, int param2, int param3) {
        int var7 = Terraphoenix.field_V;
        if (-1 < (param3 ^ -1)) {
            return null;
        }
        if ((param1 ^ -1) > -1) {
            return null;
        }
        if (this.field_b <= param3) {
            return null;
        }
        if (this.field_e <= param1) {
            return null;
        }
        dl var5 = this.field_f[param3][param1];
        if (var5 == null) {
            return null;
        }
        int var6 = -24 / ((27 - param0) / 52);
        while (param2 > var5.field_r) {
            if (null == var5.field_C) {
                return null;
            }
            var5 = var5.field_C;
        }
        return var5;
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dl var12 = null;
        int var13 = 0;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            if (param1 == 104) {
              var5_int = 0;
              incrementValue$0 = var5_int;
              var5_int++;
              var6 = param3[incrementValue$0];
              incrementValue$1 = var5_int;
              var5_int++;
              var7 = param3[incrementValue$1];
              var8 = param0;
              L1: while (true) {
                if (var8 >= param0 - -var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var9 = param2;
                  L2: while (true) {
                    if (var9 >= var7 + param2) {
                      var8++;
                      continue L1;
                    } else {
                      L3: {
                        incrementValue$2 = var5_int;
                        var5_int++;
                        var10 = param3[incrementValue$2] + -50;
                        var11 = 0;
                        if ((var10 ^ -1) != 49) {
                          L4: {
                            if (-1 < (var8 ^ -1)) {
                              break L4;
                            } else {
                              if (var9 < 0) {
                                break L4;
                              } else {
                                if (this.field_b <= var8) {
                                  break L4;
                                } else {
                                  if (var9 < this.field_e) {
                                    this.field_f[var8][var9] = new dl(var8, var9, var10, (dk) (this));
                                    this.field_f[var8][var9].field_B = true;
                                    var12 = this.field_f[var8][var9];
                                    L5: while (true) {
                                      if (var11 == 1) {
                                        break L3;
                                      } else {
                                        incrementValue$3 = var5_int;
                                        var5_int++;
                                        var12.field_b = -1 + param3[incrementValue$3];
                                        incrementValue$4 = var5_int;
                                        var5_int++;
                                        var12.field_j = param3[incrementValue$4] + -1;
                                        incrementValue$5 = var5_int;
                                        var5_int++;
                                        var12.field_g = param3[incrementValue$5] + -1;
                                        incrementValue$6 = var5_int;
                                        var5_int++;
                                        var12.field_k = param3[incrementValue$6] + -1;
                                        var11 = 1;
                                        incrementValue$7 = var5_int;
                                        var5_int++;
                                        var12.field_l = var12.field_l + param3[incrementValue$7];
                                        incrementValue$8 = var5_int;
                                        var5_int++;
                                        if (param3[incrementValue$8] == 1) {
                                          L6: {
                                            if (var12.field_b != 4) {
                                              break L6;
                                            } else {
                                              var12.field_a = false;
                                              break L6;
                                            }
                                          }
                                          L7: {
                                            if (null == var12.field_c) {
                                              break L7;
                                            } else {
                                              L8: {
                                                if (var12.field_c.field_a) {
                                                  stackIn_29_0 = 0;
                                                  break L8;
                                                } else {
                                                  stackIn_29_0 = 1;
                                                  break L8;
                                                }
                                              }
                                              if (stackIn_29_0 != 0) {
                                                var12.field_a = false;
                                                break L7;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          var12.field_C = new dl(var8, var9, var12.field_r - -1, (dk) (this));
                                          var12.field_C.field_c = var12;
                                          var12 = var12.field_C;
                                          var11 = 0;
                                          continue L5;
                                        } else {
                                          var12.field_z = true;
                                          continue L5;
                                        }
                                      }
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                          L9: while (true) {
                            if (1 == var11) {
                              break L3;
                            } else {
                              var5_int += 5;
                              var11 = 1;
                              incrementValue$9 = var5_int;
                              var5_int++;
                              if (-2 == (param3[incrementValue$9] ^ -1)) {
                                var11 = 0;
                                continue L9;
                              } else {
                                continue L9;
                              }
                            }
                          }
                        } else {
                          var11 = 1;
                          break L3;
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var5);

            stackIn_38_1 = new StringBuilder().append("dk.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L10;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L10;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_j = null;
        field_c = null;
        if (param0 != 22120) {
            field_c = (int[]) null;
        }
    }

    final boolean a(byte param0, r param1, r param2) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -93) {
                break L1;
              } else {
                discarded$1 = this.a(-66, 2, 104, 35, -6, (byte) -56, 26);
                break L1;
              }
            }
            stackIn_3_0 = this.a(10056, param2, param1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("dk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final ue a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        boolean stackIn_15_0 = false;
        boolean stackIn_16_0 = false;
        int stackIn_16_1 = 0;
        Object stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        Object stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        Object stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int var8;
        dl var9;
        int var9_int;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16_int;
        Object var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        dl var23;
        var22 = Terraphoenix.field_V;
        if (param3 == param1) {
          var8 = 0;
          L0: while (true) {
            if (this.field_b <= var8) {
              var23 = this.a(89, param4, param3, param5);
              var9 = this.a(-88, param0, param1, param2);
              if (var23 != null) {
                if (var9 != null) {
                  L1: {
                    if (param3 <= 0) {
                      break L1;
                    } else {
                      L2: {
                        stackIn_15_0 = var9.field_d;

                        if (var23.field_d) {
                          stackIn_16_0 = stackIn_15_0;
                          stackIn_16_1 = 0;
                          break L2;
                        } else {
                          stackIn_16_0 = stackIn_15_0;
                          stackIn_16_1 = 1;
                          break L2;
                        }
                      }
                      if ((stackIn_16_0 ? 1 : 0) != stackIn_16_1) {
                        break L1;
                      } else {
                        if (param3 == param1) {
                          break L1;
                        } else {
                          return this.a(param4, param4, param5, 0, true, param5, param3, true);
                        }
                      }
                    }
                  }
                  var10 = param2;
                  var11 = param2;
                  var12 = param0;
                  var13 = param0;
                  if (param2 >= 1) {
                    if ((param0 ^ -1) <= -2) {
                      if (-2 + this.field_b > param2) {
                        if (param0 < this.field_e + -2) {
                          this.field_d[param2][param0] = 0;
                          var16_int = 0;
                          L3: while (true) {
                            if (1000 <= var16_int) {
                              L4: {
                                stackIn_116_0 = this;

                                stackIn_116_1 = param2;

                                if (param6) {
                                  stackIn_117_0 = this;
                                  stackIn_117_1 = stackIn_116_1;
                                  stackIn_117_2 = 0;
                                  break L4;
                                } else {
                                  stackIn_117_0 = this;
                                  stackIn_117_1 = stackIn_116_1;
                                  stackIn_117_2 = 1;
                                  break L4;
                                }
                              }
                              L5: {
                                if (this.a(stackIn_117_1, stackIn_117_2 != 0, param1, param0)) {
                                  this.field_d[param2][param0] = 1000;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              L6: {
                                if (param6) {
                                  break L6;
                                } else {
                                  this.a(58, (byte) 54, -86);
                                  break L6;
                                }
                              }
                              L7: {
                                stackIn_124_0 = this;

                                stackIn_124_1 = param2;

                                if (param6) {
                                  stackIn_125_0 = this;
                                  stackIn_125_1 = stackIn_124_1;
                                  stackIn_125_2 = 0;
                                  break L7;
                                } else {
                                  stackIn_125_0 = this;
                                  stackIn_125_1 = stackIn_124_1;
                                  stackIn_125_2 = 1;
                                  break L7;
                                }
                              }
                              if (!this.a(stackIn_125_1, stackIn_125_2 != 0, param1, param0)) {
                                if (-1001 < (this.field_d[param5][param4] ^ -1)) {
                                  var16 = null;
                                  var20 = param5;
                                  var21 = param4;
                                  L8: while (true) {
                                    L9: {
                                      if (var20 != param2) {
                                        break L9;
                                      } else {
                                        if (var21 == param0) {
                                          return (ue) (var16);
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var19 = this.field_d[var20][var21];
                                    var18 = 0;
                                    var17 = 0;
                                    var14 = -1;
                                    L10: while (true) {
                                      if (-2 > (var14 ^ -1)) {
                                        L11: {
                                          if (var16 != null) {
                                            ((ue) (var16)).a(-var19 + this.field_d[var20][var21], var18, var17, (byte) -91);
                                            break L11;
                                          } else {
                                            var16 = new ue(var17, var18, this.field_f[var20][var21].a(var18, 1000, param3, var17));
                                            break L11;
                                          }
                                        }
                                        var20 = var20 + var17;
                                        var21 = var21 + var18;
                                        if (var17 != 0) {
                                          continue L8;
                                        } else {
                                          if (var18 != 0) {
                                            continue L8;
                                          } else {
                                            return null;
                                          }
                                        }
                                      } else {
                                        var15 = -1;
                                        L12: while (true) {
                                          if (-2 > (var15 ^ -1)) {
                                            var14++;
                                            continue L10;
                                          } else {
                                            if (var14 + var20 > 0) {
                                              if ((var21 + var15 ^ -1) < -1) {
                                                if (var20 + var14 < this.field_b - 1) {
                                                  if (-1 + this.field_e > var21 - -var15) {
                                                    if (var19 > this.field_d[var20 - -var14][var21 - -var15]) {
                                                      if (1000 > this.field_f[var20 + var14][var15 + var21].a(-var15, 1000, param3, -var14)) {
                                                        var19 = this.field_d[var20 - -var14][var15 + var21];
                                                        var17 = var14;
                                                        var18 = var15;
                                                        var15++;
                                                        continue L12;
                                                      } else {
                                                        var15++;
                                                        continue L12;
                                                      }
                                                    } else {
                                                      var15++;
                                                      continue L12;
                                                    }
                                                  } else {
                                                    var15++;
                                                    continue L12;
                                                  }
                                                } else {
                                                  var15++;
                                                  continue L12;
                                                }
                                              } else {
                                                var15++;
                                                continue L12;
                                              }
                                            } else {
                                              var15++;
                                              continue L12;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  return null;
                                }
                              } else {
                                return null;
                              }
                            } else {
                              var17 = var10;
                              L13: while (true) {
                                if (var17 > var11) {
                                  var16_int++;
                                  continue L3;
                                } else {
                                  var18 = var12;
                                  L14: while (true) {
                                    if (var13 < var18) {
                                      var17++;
                                      continue L13;
                                    } else {
                                      if ((this.field_d[var17][var18] ^ -1) == (var16_int ^ -1)) {
                                        L15: {
                                          if (var17 != param5) {
                                            break L15;
                                          } else {
                                            if (var18 == param4) {
                                              var16_int = 1000;
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        L16: {
                                          L17: {
                                            if (var10 == var17) {
                                              L18: {
                                                if (-2 > (var17 ^ -1)) {
                                                  var10--;
                                                  break L18;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                              if (var13 == var18) {
                                                if (var18 < -2 + this.field_e) {
                                                  var13++;
                                                  break L17;
                                                } else {
                                                  if (var12 != var18) {
                                                    break L16;
                                                  } else {
                                                    if (-2 <= (var18 ^ -1)) {
                                                      break L16;
                                                    } else {
                                                      var12--;
                                                      break L16;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (var12 != var18) {
                                                  break L16;
                                                } else {
                                                  if (-2 <= (var18 ^ -1)) {
                                                    break L16;
                                                  } else {
                                                    var12--;
                                                    break L16;
                                                  }
                                                }
                                              }
                                            } else {
                                              if (var13 == var18) {
                                                if (var18 < -2 + this.field_e) {
                                                  var13++;
                                                  break L17;
                                                } else {
                                                  if (var12 != var18) {
                                                    break L16;
                                                  } else {
                                                    if (-2 <= (var18 ^ -1)) {
                                                      break L16;
                                                    } else {
                                                      var12--;
                                                      break L16;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (var12 != var18) {
                                                  break L16;
                                                } else {
                                                  if (-2 <= (var18 ^ -1)) {
                                                    break L16;
                                                  } else {
                                                    var12--;
                                                    break L16;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var12 != var18) {
                                            break L16;
                                          } else {
                                            if (-2 <= (var18 ^ -1)) {
                                              break L16;
                                            } else {
                                              var12--;
                                              break L16;
                                            }
                                          }
                                        }
                                        L19: {
                                          if (var11 != var17) {
                                            break L19;
                                          } else {
                                            if (this.field_b + -2 > var17) {
                                              var11++;
                                              break L19;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        L20: {
                                          var19 = 0;
                                          if (100 > this.field_g[var17][var18]) {
                                            var19 = 200 - this.field_g[var17][var18];
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          if (-1 < (var19 ^ -1)) {
                                            var19 = 0;
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          if (-2 <= (var17 ^ -1)) {
                                            break L22;
                                          } else {
                                            var15 = 0;
                                            var14 = -1;
                                            if (this.field_d[var17 - -var14][var15 + var18] > var16_int - (-this.field_f[var17][var18].a(var15, 1000, param3, var14) + -var19)) {
                                              this.field_d[var14 + var17][var15 + var18] = var19 + this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int;
                                              break L22;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        L23: {
                                          if ((var17 ^ -1) >= -2) {
                                            break L23;
                                          } else {
                                            if (var18 > 1) {
                                              var15 = -1;
                                              var14 = -1;
                                              if (this.field_d[var14 + var17][var15 + var18] > var16_int - -this.field_f[var17][var18].a(var15, 1000, param3, var14) + var19) {
                                                this.field_d[var17 - -var14][var18 + var15] = var19 + (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int);
                                                break L23;
                                              } else {
                                                break L23;
                                              }
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        L24: {
                                          if (var17 <= 1) {
                                            break L24;
                                          } else {
                                            if (var18 >= -2 + this.field_e) {
                                              break L24;
                                            } else {
                                              var14 = -1;
                                              var15 = 1;
                                              if (this.field_d[var17 + var14][var18 - -var15] <= this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19) {
                                                break L24;
                                              } else {
                                                this.field_d[var17 - -var14][var15 + var18] = var19 + (var16_int + this.field_f[var17][var18].a(var15, 1000, param3, var14));
                                                break L24;
                                              }
                                            }
                                          }
                                        }
                                        L25: {
                                          if (-2 + this.field_b > var17) {
                                            var14 = 1;
                                            var15 = 0;
                                            if (this.field_d[var17 - -var14][var18 - -var15] > this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19) {
                                              this.field_d[var17 - -var14][var15 + var18] = var16_int + (this.field_f[var17][var18].a(var15, 1000, param3, var14) - -var19);
                                              break L25;
                                            } else {
                                              break L25;
                                            }
                                          } else {
                                            break L25;
                                          }
                                        }
                                        L26: {
                                          if (-2 + this.field_b <= var17) {
                                            break L26;
                                          } else {
                                            if (1 >= var18) {
                                              break L26;
                                            } else {
                                              var14 = 1;
                                              var15 = -1;
                                              if (this.field_d[var14 + var17][var18 - -var15] <= this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19) {
                                                break L26;
                                              } else {
                                                this.field_d[var14 + var17][var15 + var18] = var19 + var16_int - -this.field_f[var17][var18].a(var15, 1000, param3, var14);
                                                break L26;
                                              }
                                            }
                                          }
                                        }
                                        L27: {
                                          if (var17 >= -2 + this.field_b) {
                                            break L27;
                                          } else {
                                            if (this.field_e - 2 <= var18) {
                                              break L27;
                                            } else {
                                              var14 = 1;
                                              var15 = 1;
                                              if (this.field_d[var17 + var14][var18 + var15] > var19 + (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int)) {
                                                this.field_d[var17 + var14][var18 - -var15] = this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int - -var19;
                                                break L27;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                        }
                                        L28: {
                                          if (-2 > (var18 ^ -1)) {
                                            var14 = 0;
                                            var15 = -1;
                                            if (this.field_d[var17 - -var14][var18 + var15] <= var19 + (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int)) {
                                              break L28;
                                            } else {
                                              this.field_d[var14 + var17][var15 + var18] = var16_int + this.field_f[var17][var18].a(var15, 1000, param3, var14) - -var19;
                                              break L28;
                                            }
                                          } else {
                                            break L28;
                                          }
                                        }
                                        if (this.field_e - 2 > var18) {
                                          var15 = 1;
                                          var14 = 0;
                                          if (this.field_d[var17 + var14][var15 + var18] > var19 + (var16_int + this.field_f[var17][var18].a(var15, 1000, param3, var14))) {
                                            this.field_d[var14 + var17][var18 + var15] = this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19;
                                            var18++;
                                            continue L14;
                                          } else {
                                            var18++;
                                            continue L14;
                                          }
                                        } else {
                                          var18++;
                                          continue L14;
                                        }
                                      } else {
                                        var18++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          return null;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var9_int = 0;
              L29: while (true) {
                if (this.field_e <= var9_int) {
                  var8++;
                  continue L0;
                } else {
                  this.field_d[var8][var9_int] = 1000;
                  var9_int++;
                  continue L29;
                }
              }
            }
          }
        } else {
          return this.a(param0, param4, param5, param1, true, param2, param3, true);
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        if (param2 > -95) {
            discarded$0 = this.a(true, 68, -74, (byte) 21, -78);
        }
        dl var5 = this.a(-97, param1, param3, param0);
        if (!(var5 != null)) {
            return false;
        }
        if ((var5.field_b ^ -1) >= 0) {
            return false;
        }
        return true;
    }

    dk(int param0, int param1) {
        this.field_k = 0;
        this.field_e = param1;
        this.field_b = param0;
        this.field_f = new dl[this.field_b][this.field_e];
    }

    final void a(boolean param0, boolean param1) {
        dl stackIn_50_0;
        int stackIn_50_1;
        int stackIn_50_2;
        Object stackIn_50_3;
        int stackIn_50_4;
        int stackIn_50_5;
        dl stackIn_51_0;
        int stackIn_51_1;
        int stackIn_51_2;
        Object stackIn_51_3;
        int stackIn_51_4;
        int stackIn_51_5;
        int stackIn_51_6;
        int var3;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        dl var14;
        Object var15;
        Object var16;
        int var17;
        Object var18;
        ci var18_ref;
        L0: {
          var17 = Terraphoenix.field_V;
          var3 = 0;
          var4 = null;
          if (null != this.field_i) {
            var4 = this.field_i.field_F;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var5 = 320 + -sj.field_b;
          var6 = -lg.field_c + 240;
          var7 = 0;
          var8 = 1 + this.field_b + -2;
          var9 = 0;
          var10 = 1 + (-2 + this.field_e);
          if (this.field_l == null) {
            var6 -= 32;
            break L1;
          } else {
            var10 = -1 + this.field_e;
            var7 = 0;
            var8 = this.field_b + -1;
            var9 = 0;
            break L1;
          }
        }
        L2: {
          if (null != u.field_a) {
            u.field_a.a();
            l.f(0, 0, 128, 160, 0);
            k.field_f.a(0);
            break L2;
          } else {
            break L2;
          }
        }
        uf.field_c = -1;
        vf.field_a = -1;
        var11 = var7;
        L3: while (true) {
          if (var8 < var11) {
            L4: {
              if (null == u.field_a) {
                break L4;
              } else {
                u.field_a.b(ug.field_b, hb.field_n);
                break L4;
              }
            }
            L5: {
              if (!param0) {
                break L5;
              } else {
                this.a(true, 75, 67, -64, 52, 26, 57);
                break L5;
              }
            }
            return;
          } else {
            var5 += 32;
            var6 += 16;
            var12 = var9;
            L6: while (true) {
              if (var10 < var12) {
                var5 = var5 + (1 + -var9 + var10 << 71490277);
                var6 = var6 - (1 + (-var9 + var10) << 8496356);
                var11++;
                continue L3;
              } else {
                L7: {
                  var5 -= 32;
                  var6 += 16;
                  if (var5 <= -32) {
                    break L7;
                  } else {
                    if (682 <= var5) {
                      break L7;
                    } else {
                      if (-32 >= var6) {
                        break L7;
                      } else {
                        if (-625 >= (var6 ^ -1)) {
                          break L7;
                        } else {
                          L8: {
                            if (null == this.field_i) {
                              break L8;
                            } else {
                              L9: {
                                if (0 == var11) {
                                  break L9;
                                } else {
                                  if (var12 == 0) {
                                    break L9;
                                  } else {
                                    if (var11 == -1 + this.field_b) {
                                      break L9;
                                    } else {
                                      if (var12 == this.field_e + -1) {
                                        break L9;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (-1 == (var11 ^ -1)) {
                                  break L10;
                                } else {
                                  if (var12 == 0) {
                                    break L10;
                                  } else {
                                    pf.a(this.field_i, (byte) 71, var5, var6);
                                    break L7;
                                  }
                                }
                              }
                              wi.a((byte) -80, this.field_i, var5, var6);
                              break L7;
                            }
                          }
                          L11: {
                            if (this.field_i != null) {
                              var13 = 48 * -eg.field_p;
                              if (Math.abs(this.field_i.field_y + -var5) + Math.abs(-var13 + (-var6 + this.field_i.field_j)) * 2 >= 32) {
                                break L11;
                              } else {
                                if (!param1) {
                                  break L11;
                                } else {
                                  if (!this.field_i.field_w) {
                                    vf.field_a = var12;
                                    uf.field_c = var11;
                                    cm.field_d = eg.field_p;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            if (null == this.field_l) {
                              break L12;
                            } else {
                              L13: {
                                var13 = 0;
                                if (0 < tg.field_l) {
                                  var13 = var13 - tg.field_l * 48;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              if (this.field_l.field_k < var5 - 16) {
                                break L12;
                              } else {
                                if (16 + var5 < this.field_l.field_k) {
                                  break L12;
                                } else {
                                  if (var13 + (var6 - 8) > this.field_l.field_d) {
                                    break L12;
                                  } else {
                                    if (var13 + (var6 - -8) >= this.field_l.field_d) {
                                      cm.field_d = 0;
                                      vf.field_a = var12;
                                      uf.field_c = var11;
                                      if (var11 != uf.field_c) {
                                        break L12;
                                      } else {
                                        if (vf.field_a != var12) {
                                          break L12;
                                        } else {
                                          if (param1) {
                                            l.a(var5 << -2137680124, var6 << -2026626236, 384, 255, bj.field_d);
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (this.field_f[var11][var12] != null) {
                            L14: {
                              L15: {
                                stackIn_50_0 = this.field_f[var11][var12];

                                stackIn_50_1 = var5;

                                stackIn_50_2 = var3;

                                stackIn_50_3 = var4;

                                stackIn_50_4 = var6;

                                stackIn_50_5 = 125;

                                if (var11 != uf.field_c) {
                                  break L15;
                                } else {
                                  stackIn_50_0 = (dl) ((Object) stackIn_50_0);

                                  if (vf.field_a != var12) {
                                    break L15;
                                  } else {
                                    stackIn_50_0 = (dl) ((Object) stackIn_50_0);

                                    if (!param1) {
                                      break L15;
                                    } else {
                                      stackIn_51_0 = (dl) ((Object) stackIn_50_0);
                                      stackIn_51_1 = stackIn_50_1;
                                      stackIn_51_2 = stackIn_50_2;
                                      stackIn_51_3 = stackIn_50_3;
                                      stackIn_51_4 = stackIn_50_4;
                                      stackIn_51_5 = stackIn_50_5;
                                      stackIn_51_6 = 1;
                                      break L14;
                                    }
                                  }
                                }
                              }
                              stackIn_51_0 = (dl) ((Object) stackIn_50_0);
                              stackIn_51_1 = stackIn_50_1;
                              stackIn_51_2 = stackIn_50_2;
                              stackIn_51_3 = stackIn_50_3;
                              stackIn_51_4 = stackIn_50_4;
                              stackIn_51_5 = stackIn_50_5;
                              stackIn_51_6 = 0;
                              break L14;
                            }
                            var3 = ((dl) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2, (gi[]) ((Object) stackIn_51_3), stackIn_51_4, (byte) stackIn_51_5, stackIn_51_6 != 0);
                            break L7;
                          } else {
                            bm.a(var6, var5, (byte) 127);
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
                if (uf.field_c == var11) {
                  if (vf.field_a == var12) {
                    if (param1) {
                      var13 = 0;
                      L16: while (true) {
                        if (eg.field_p >= var13) {
                          var14 = this.a(-124, vf.field_a, var13, uf.field_c);
                          if (var14 == null) {
                            L17: {
                              var15 = hb.field_p[0];
                              var18 = var15;
                              var16 = var18;
                              var18 = var15;
                              var16 = var18;
                              if (null == this.field_i) {
                                break L17;
                              } else {
                                if (this.field_i.field_L == 0) {
                                  break L17;
                                } else {
                                  if (var13 != eg.field_p) {
                                    break L17;
                                  } else {
                                    var15 = hb.field_p[1];
                                    var18 = var15;
                                    var16 = var18;
                                    var18 = var15;
                                    var16 = var18;
                                    break L17;
                                  }
                                }
                              }
                            }
                            L18: {
                              if (hb.field_p[1] != var15) {
                                break L18;
                              } else {
                                ve.a((ci) (var15), -5353, var6 + 144 * var13, var6 + -(48 * var13), var5 + -24);
                                break L18;
                              }
                            }
                            L19: {
                              var16 = null;
                              if (param1) {
                                var18_ref = oi.field_J;
                                var16 = var18_ref;
                                var18_ref.a();
                                l.f(0, 0, 128, 160, 0);
                                break L19;
                              } else {
                                u.field_a.a();
                                l.f(0, 0, 128, 160, 0);
                                k.field_f.a(0);
                                break L19;
                              }
                            }
                            if (var16 != null) {
                              L20: {
                                L21: {
                                  ((ci) (var16)).a();
                                  l.a(32, 124, 16777215);
                                  l.a(64, 108, 16777215);
                                  l.a(64, 139, 16777215);
                                  l.a(95, 124, 16777215);
                                  k.field_f.a(0);
                                  u.field_a.a();
                                  ((ci) (var16)).d(0, 0);
                                  if (this.field_i == null) {
                                    break L21;
                                  } else {
                                    if (0 >= this.field_i.field_L) {
                                      break L21;
                                    } else {
                                      c.a((byte) -86, u.field_a, 16777215);
                                      c.a((byte) -86, u.field_a, 16744576);
                                      c.a((byte) -86, u.field_a, 16728128);
                                      c.a((byte) -86, u.field_a, 8388608);
                                      c.a((byte) -86, u.field_a, 4194304);
                                      break L20;
                                    }
                                  }
                                }
                                c.a((byte) -86, u.field_a, 16777215);
                                c.a((byte) -86, u.field_a, 8454016);
                                c.a((byte) -86, u.field_a, 4259648);
                                c.a((byte) -86, u.field_a, 32768);
                                c.a((byte) -86, u.field_a, 16384);
                                break L20;
                              }
                              ((ci) (var16)).b(0, 0, 0);
                              k.field_f.a(0);
                              ug.field_b = -64 + var5;
                              hb.field_n = -(48 * eg.field_p) + (-124 + var6);
                              ((ci) (var16)).b(-64 + var5, -124 + var6);
                              var13++;
                              continue L16;
                            } else {
                              var13++;
                              continue L16;
                            }
                          } else {
                            L22: {
                              var15 = hb.field_p[0];
                              if (null == var14.field_h) {
                                break L22;
                              } else {
                                if (var13 != eg.field_p) {
                                  break L22;
                                } else {
                                  if (null == var14.field_h.field_Z) {
                                    if (var14.field_h.field_C == 1) {
                                      if (!var14.field_h.field_k) {
                                        break L22;
                                      } else {
                                        var15 = hb.field_p[1];
                                        break L22;
                                      }
                                    } else {
                                      var15 = null;
                                      break L22;
                                    }
                                  } else {
                                    var15 = hb.field_p[2];
                                    break L22;
                                  }
                                }
                              }
                            }
                            L23: {
                              if (this.field_i == null) {
                                break L23;
                              } else {
                                if (this.field_i.field_L == 0) {
                                  break L23;
                                } else {
                                  if (eg.field_p != var13) {
                                    break L23;
                                  } else {
                                    var15 = hb.field_p[1];
                                    break L23;
                                  }
                                }
                              }
                            }
                            if (hb.field_p[1] == var15) {
                              ve.a((ci) (var15), -5353, var6 + 144 * var13, var6 - var13 * 48, -24 + var5);
                              var13++;
                              continue L16;
                            } else {
                              var13++;
                              continue L16;
                            }
                          }
                        } else {
                          var12++;
                          continue L6;
                        }
                      }
                    } else {
                      var12++;
                      continue L6;
                    }
                  } else {
                    var12++;
                    continue L6;
                  }
                } else {
                  var12++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        int stackIn_100_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        dl var20;
        int var21;
        int var22;
        dl var22_ref_dl;
        int var23;
        int var24;
        String var25;
        r var26;
        r var27;
        L0: {
          var24 = Terraphoenix.field_V;
          var4 = param0 - 5 * (this.field_b - 64) / 2;
          var5 = param2 - 5 * (this.field_e + -64) / 2;
          l.e(-3 + var4, -3 + var5, 6 + this.field_b * 5, 5 * this.field_e - -6, 10066329);
          l.e(-2 + var4, -2 + var5, 4 + 5 * this.field_b, 5 * this.field_e + 4, 0);
          l.e(-1 + var4, var5 + -1, 2 + this.field_b * 5, 2 + 5 * this.field_e, 6645093);
          l.f(var4, var5, this.field_b * 5, this.field_e * 5, 0);
          vf.field_a = -1;
          uf.field_c = -1;
          var8 = 5597743;
          var9 = 6473014;
          var10 = 11067278;
          var11 = 6698029;
          var12 = 8742972;
          var13 = 12030304;
          var14 = 10066329;
          var15 = 6645093;
          if ((param2 ^ -1) == -51) {
            var7 = 70;
            var6 = 400;
            l.e(var6 + -13, 47, 176, 326, 10066329);
            l.e(var6 + -12, 48, 174, 324, 0);
            l.e(-11 + var6, 49, 172, 322, 6645093);
            l.f(-10 + var6, 50, 170, 320, 0);
            var16 = 20;
            og.field_f.b(vb.field_e, var6, var7, 16777215, -1);
            og.field_f.b(vb.field_e, 1 + var6, var7, 16777215, -1);
            var7 = var7 + (6 + var16);
            og.field_f.b(kj.field_a, var6, var7, 16777215, -1);
            var7 = var7 + (var16 - -6);
            l.f(var6, var7 - 11, 12, 12, var8);
            og.field_f.b(cm.field_e, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            l.f(var6, var7 - 11, 12, 12, var9);
            og.field_f.b(gh.field_L, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            l.f(var6, var7 + -11, 12, 12, var10);
            og.field_f.b(ab.field_c, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            var7 += 6;
            og.field_f.b(mm.field_g, var6, var7, 16777215, -1);
            var7 = var7 + (var16 - -6);
            l.f(var6, var7 + -11, 12, 12, var11);
            og.field_f.b(bm.field_c, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            l.f(var6, var7 + -11, 12, 12, var12);
            og.field_f.b(am.field_H, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            l.f(var6, -11 + var7, 12, 12, var13);
            og.field_f.b(cg.field_I, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            l.f(var6, var7 - 11, 12, 12, var15);
            og.field_f.b(vh.field_h, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            l.f(var6, -11 + var7, 12, 12, var14);
            og.field_f.b(gh.field_O, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            l.f(var6, -11 + var7, 12, 12, 16777215);
            og.field_f.b(rj.field_b, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            rh.field_b[0].f(-2 + var6, -13 + var7);
            og.field_f.b(hm.field_H, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            rh.field_b[6].f(-2 + var6, -13 + var7);
            og.field_f.b(f.field_h, var6, var7, 16777215, -1);
            var7 = var7 + var16;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((param2 ^ -1) == -51) {
            break L1;
          } else {
            eg.field_p = 5;
            break L1;
          }
        }
        L2: {
          if (param1 == -122) {
            break L2;
          } else {
            var25 = (String) null;
            this.a(1, -41, -108, 47, (String) null);
            break L2;
          }
        }
        var16 = 0;
        L3: while (true) {
          if (eg.field_p < var16) {
            L4: {
              if (50 == param2) {
                break L4;
              } else {
                eg.field_p = 0;
                break L4;
              }
            }
            L5: {
              if ((param2 ^ -1) == -51) {
                var7 = -(sj.field_b * 5 / 64) + var5 - -(5 * lg.field_c / 32);
                var6 = sj.field_b * 5 / 64 + (var4 - -(5 * lg.field_c / 32));
                var16 = 48;
                l.c(var4, var5, var4 - -(5 * this.field_b), this.field_e * 5 + var5);
                l.c(-var16 + (2 + var6), 2 + var7, 2 + var6, -var16 + var7 - -2, 16777215);
                l.c(var6 + 2, 2 + (var7 + -var16), var16 + (var6 + 2), 2 + var7, 16777215);
                l.c(var6 + (2 + var16), var7 + 2, var6 + 2, 2 + var7 - -var16, 16777215);
                l.c(2 + var6, var16 + var7 + 2, var6 + 2 - var16, var7 + 2, 16777215);
                l.c();
                break L5;
              } else {
                break L5;
              }
            }
            var16 = 0;
            L6: while (true) {
              if (this.field_i.field_F.length <= var16) {
                L7: {
                  if (50 == param2) {
                    var17 = 0;
                    L8: while (true) {
                      if ((var17 ^ -1) <= -101) {
                        break L7;
                      } else {
                        var27 = this.field_i.field_C[var17];
                        if (var27 != null) {
                          if (var27.field_P > 0) {
                            if (eg.field_p >= var27.field_E) {
                              L9: {
                                L10: {
                                  var7 = var27.field_H * 5 + var5;
                                  var6 = var4 + var27.field_F * 5;
                                  if (null == var27.field_Z) {
                                    if (!var27.field_k) {
                                      if (!var27.field_s) {
                                        if (var27.field_h) {
                                          L11: {
                                            var6 = var4 - -(5 * var27.field_i);
                                            var7 = var27.field_gb * 5 + var5;
                                            if (-1 != (var27.field_C ^ -1)) {
                                              break L11;
                                            } else {
                                              rh.field_b[6].c(-2 + var6, var7 - 2);
                                              break L11;
                                            }
                                          }
                                          if (1 == var27.field_C) {
                                            rh.field_b[3].c(var6 + -2, -2 + var7);
                                            var17++;
                                            continue L8;
                                          } else {
                                            var17++;
                                            continue L8;
                                          }
                                        } else {
                                          var17++;
                                          continue L8;
                                        }
                                      } else {
                                        if (var27.field_C == 0) {
                                          if (var27.field_Z == null) {
                                            rh.field_b[6].c(-2 + var6, var7 + -2);
                                            break L10;
                                          } else {
                                            if (null == var27.field_Z) {
                                              break L9;
                                            } else {
                                              rh.field_b[0].c(-2 + var6, var7 - 2);
                                              if (this.field_i.field_q != var27) {
                                                break L9;
                                              } else {
                                                rh.field_b[0].f(var6 + -6, -6 + var7);
                                                break L9;
                                              }
                                            }
                                          }
                                        } else {
                                          if (null == var27.field_Z) {
                                            break L9;
                                          } else {
                                            rh.field_b[0].c(-2 + var6, var7 - 2);
                                            if (this.field_i.field_q != var27) {
                                              break L9;
                                            } else {
                                              rh.field_b[0].f(var6 + -6, -6 + var7);
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (var27.field_C == 0) {
                                        if (var27.field_Z == null) {
                                          rh.field_b[6].c(-2 + var6, var7 + -2);
                                          break L10;
                                        } else {
                                          if (null == var27.field_Z) {
                                            break L9;
                                          } else {
                                            rh.field_b[0].c(-2 + var6, var7 - 2);
                                            if (this.field_i.field_q != var27) {
                                              break L9;
                                            } else {
                                              rh.field_b[0].f(var6 + -6, -6 + var7);
                                              break L9;
                                            }
                                          }
                                        }
                                      } else {
                                        if (null == var27.field_Z) {
                                          break L9;
                                        } else {
                                          rh.field_b[0].c(-2 + var6, var7 - 2);
                                          if (this.field_i.field_q != var27) {
                                            break L9;
                                          } else {
                                            rh.field_b[0].f(var6 + -6, -6 + var7);
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (var27.field_C == 0) {
                                      if (var27.field_Z == null) {
                                        rh.field_b[6].c(-2 + var6, var7 + -2);
                                        break L10;
                                      } else {
                                        if (null == var27.field_Z) {
                                          break L9;
                                        } else {
                                          rh.field_b[0].c(-2 + var6, var7 - 2);
                                          if (this.field_i.field_q != var27) {
                                            break L9;
                                          } else {
                                            rh.field_b[0].f(var6 + -6, -6 + var7);
                                            break L9;
                                          }
                                        }
                                      }
                                    } else {
                                      if (null == var27.field_Z) {
                                        break L9;
                                      } else {
                                        rh.field_b[0].c(-2 + var6, var7 - 2);
                                        if (this.field_i.field_q != var27) {
                                          break L9;
                                        } else {
                                          rh.field_b[0].f(var6 + -6, -6 + var7);
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (null == var27.field_Z) {
                                  break L9;
                                } else {
                                  rh.field_b[0].c(-2 + var6, var7 - 2);
                                  if (this.field_i.field_q != var27) {
                                    break L9;
                                  } else {
                                    rh.field_b[0].f(var6 + -6, -6 + var7);
                                    break L9;
                                  }
                                }
                              }
                              if ((var27.field_C ^ -1) == -2) {
                                L12: {
                                  if (var27.field_t == 0) {
                                    rh.field_b[1].c(-2 + var6, -2 + var7);
                                    break L12;
                                  } else {
                                    if ((var27.field_t ^ -1) != -10) {
                                      rh.field_b[2].c(var6 - 2, var7 + -2);
                                      break L12;
                                    } else {
                                      rh.field_b[12].c(-2 + var6, var7 - 2);
                                      break L12;
                                    }
                                  }
                                }
                                if (null != this.field_i.field_q) {
                                  if (this.field_i.field_h.a((byte) -93, this.field_i.field_q, var27)) {
                                    l.a(2 + var6, 2 + var7, 4, 16711680);
                                    l.a(2 + var6, var7 + 2, 5, 8388608);
                                    var17++;
                                    continue L8;
                                  } else {
                                    var17++;
                                    continue L8;
                                  }
                                } else {
                                  var17++;
                                  continue L8;
                                }
                              } else {
                                var17++;
                                continue L8;
                              }
                            } else {
                              var17++;
                              continue L8;
                            }
                          } else {
                            var17++;
                            continue L8;
                          }
                        } else {
                          var17++;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    var17 = 0;
                    L13: while (true) {
                      if (100 <= var17) {
                        break L7;
                      } else {
                        var26 = this.field_i.field_C[var17];
                        var27 = var26;
                        var27 = var26;
                        if (var26 != null) {
                          if (-1 > (var26.field_P ^ -1)) {
                            if (eg.field_p >= var26.field_E) {
                              L14: {
                                var6 = var4 - -(var26.field_F * 5);
                                var7 = var5 - -(var26.field_H * 5);
                                if (var26.field_Z == null) {
                                  if (!var26.field_k) {
                                    if (!var26.field_s) {
                                      if (var26.field_h) {
                                        L15: {
                                          var7 = var5 + 5 * var26.field_gb;
                                          var6 = 5 * var26.field_i + var4;
                                          if (var26.field_C != 0) {
                                            break L15;
                                          } else {
                                            rh.field_b[6].c(-2 + var6, var7 + -2);
                                            break L15;
                                          }
                                        }
                                        if (1 == var26.field_C) {
                                          rh.field_b[3].c(var6 + -2, var7 - 2);
                                          var17++;
                                          continue L13;
                                        } else {
                                          var17++;
                                          continue L13;
                                        }
                                      } else {
                                        var17++;
                                        continue L13;
                                      }
                                    } else {
                                      if (var26.field_C != 0) {
                                        break L14;
                                      } else {
                                        if (null != var26.field_Z) {
                                          break L14;
                                        } else {
                                          rh.field_b[6].c(-2 + var6, -2 + var7);
                                          break L14;
                                        }
                                      }
                                    }
                                  } else {
                                    if (var26.field_C != 0) {
                                      break L14;
                                    } else {
                                      if (null != var26.field_Z) {
                                        break L14;
                                      } else {
                                        rh.field_b[6].c(-2 + var6, -2 + var7);
                                        break L14;
                                      }
                                    }
                                  }
                                } else {
                                  if (var26.field_C != 0) {
                                    break L14;
                                  } else {
                                    if (null != var26.field_Z) {
                                      break L14;
                                    } else {
                                      rh.field_b[6].c(-2 + var6, -2 + var7);
                                      break L14;
                                    }
                                  }
                                }
                              }
                              L16: {
                                if (var26.field_Z == null) {
                                  break L16;
                                } else {
                                  if (var26.field_c == null) {
                                    break L16;
                                  } else {
                                    if (var26 != var26.field_c.field_h) {
                                      break L16;
                                    } else {
                                      rh.field_b[0].c(-2 + var6, -2 + var7);
                                      if (var26 == this.field_i.field_q) {
                                        rh.field_b[0].f(var6 + -6, var7 - 6);
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                              if (-2 == (var26.field_C ^ -1)) {
                                L17: {
                                  if (var26.field_t == 0) {
                                    rh.field_b[1].c(var6 + -2, -2 + var7);
                                    break L17;
                                  } else {
                                    if (var26.field_t == 9) {
                                      rh.field_b[12].c(var6 - 2, -2 + var7);
                                      break L17;
                                    } else {
                                      rh.field_b[2].c(var6 - 2, -2 + var7);
                                      break L17;
                                    }
                                  }
                                }
                                if (null != this.field_i.field_q) {
                                  if (this.field_i.field_h.a((byte) -93, this.field_i.field_q, var26)) {
                                    l.a(2 + var6, var7 + 2, 4, 16711680);
                                    l.a(var6 + 2, 2 + var7, 5, 8388608);
                                    var17++;
                                    continue L13;
                                  } else {
                                    var17++;
                                    continue L13;
                                  }
                                } else {
                                  var17++;
                                  continue L13;
                                }
                              } else {
                                var17++;
                                continue L13;
                              }
                            } else {
                              var17++;
                              continue L13;
                            }
                          } else {
                            var17++;
                            continue L13;
                          }
                        } else {
                          var17++;
                          continue L13;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                if (null != this.field_i.field_F[var16]) {
                  L18: {
                    var7 = (int)(2.0 + (this.field_i.field_F[var16].field_p / 10.0 + (double)(var5 - -(5 * this.field_i.field_F[var16].field_m))));
                    var6 = (int)(2.0 + (this.field_i.field_F[var16].field_y / 10.0 + (double)(5 * this.field_i.field_F[var16].field_c + var4)));
                    var17 = 16776960;
                    if (eg.field_p == this.field_i.field_F[var16].field_x) {
                      break L18;
                    } else {
                      var17 = 14540032;
                      break L18;
                    }
                  }
                  l.f(-1 + var6, -1 + var7, 2, 2, var17);
                  var16++;
                  continue L6;
                } else {
                  var16++;
                  continue L6;
                }
              }
            }
          } else {
            var6 = 5 + var4;
            var7 = var5;
            var17 = 1;
            L19: while (true) {
              if (-1 + this.field_b <= var17) {
                var16++;
                continue L3;
              } else {
                var18 = 1;
                L20: while (true) {
                  if (var18 >= this.field_e - 1) {
                    var6 += 5;
                    var7 = var7 - 5 * (this.field_e + -2);
                    var17++;
                    continue L19;
                  } else {
                    var7 += 5;
                    var20 = this.a(120, var18, var16, var17);
                    if (var20 != null) {
                      L21: {
                        var19 = 0;
                        var21 = 0;
                        if (var20.field_b > -1) {
                          L22: {
                            var19 = var8;
                            if (1 != var16) {
                              break L22;
                            } else {
                              var19 = ((16711422 & var8) - -(var9 & 16711422)) / 2;
                              break L22;
                            }
                          }
                          L23: {
                            if ((var16 ^ -1) != -3) {
                              break L23;
                            } else {
                              var19 = var9;
                              break L23;
                            }
                          }
                          L24: {
                            if (var16 == 3) {
                              var19 = ((var9 & 16711422) + (16711422 & var10)) / 2;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          L25: {
                            if (var16 < 4) {
                              break L25;
                            } else {
                              var19 = var10;
                              break L25;
                            }
                          }
                          if ((param2 ^ -1) != -51) {
                            L26: {
                              if ((var20.field_b ^ -1) != 0) {
                                L27: {
                                  if (this.field_a != 2) {
                                    break L27;
                                  } else {
                                    L28: {
                                      var22 = this.field_b / 4;
                                      if (-12 != (this.field_i.field_G.field_Bb ^ -1)) {
                                        break L28;
                                      } else {
                                        var22 = 1 + this.field_b / 8;
                                        break L28;
                                      }
                                    }
                                    L29: {
                                      L30: {
                                        if (var17 < -var22 + this.field_b / 2) {
                                          break L30;
                                        } else {
                                          if (this.field_b / 2 + var22 < var17) {
                                            break L30;
                                          } else {
                                            if (-var22 + this.field_e / 2 > var18) {
                                              break L30;
                                            } else {
                                              if (var18 <= var22 + this.field_e / 2) {
                                                break L29;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var21 = 1;
                                      break L29;
                                    }
                                    if (var18 >= 3 + this.field_e / 2 + -var22) {
                                      break L27;
                                    } else {
                                      if (this.field_b / 2 - 1 > var17) {
                                        break L27;
                                      } else {
                                        if (var17 > 1 + this.field_b / 2) {
                                          break L27;
                                        } else {
                                          var21 = 1;
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                }
                                L31: {
                                  if ((this.field_a ^ -1) == -4) {
                                    if (this.field_b / 8 >= var17) {
                                      break L31;
                                    } else {
                                      if (var17 >= this.field_b * 7 / 8) {
                                        break L31;
                                      } else {
                                        if (var18 <= this.field_e / 8) {
                                          break L31;
                                        } else {
                                          if (7 * this.field_e / 8 > var18) {
                                            var21 = 1;
                                            break L31;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L31;
                                  }
                                }
                                L32: {
                                  if (this.field_a == 4) {
                                    break L32;
                                  } else {
                                    if ((this.field_a ^ -1) != -2) {
                                      break L26;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                                L33: {
                                  if (-5 == (var20.field_b ^ -1)) {
                                    break L33;
                                  } else {
                                    if (5 != var20.field_b) {
                                      break L26;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                var21 = 1;
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            L34: {
                              if (-4 < (this.field_i.field_h.field_f[var17][var18].field_v ^ -1)) {
                                break L34;
                              } else {
                                var21 = 1;
                                break L34;
                              }
                            }
                            var22_ref_dl = var20;
                            L35: while (true) {
                              if (null == var22_ref_dl.field_c) {
                                if (var22_ref_dl.field_d) {
                                  var21 = 1;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              } else {
                                var22_ref_dl = var22_ref_dl.field_c;
                                continue L35;
                              }
                            }
                          } else {
                            break L21;
                          }
                        } else {
                          break L21;
                        }
                      }
                      L36: {
                        if (-2 != (var20.field_v ^ -1)) {
                          break L36;
                        } else {
                          var19 = var13;
                          break L36;
                        }
                      }
                      L37: {
                        if (var20.field_v != 2) {
                          break L37;
                        } else {
                          var19 = var12;
                          break L37;
                        }
                      }
                      L38: {
                        if ((var20.field_v ^ -1) != -4) {
                          break L38;
                        } else {
                          var19 = var11;
                          break L38;
                        }
                      }
                      L39: {
                        L40: {
                          if (var20.field_d) {
                            break L40;
                          } else {
                            L41: {
                              if (-19 < (var20.field_j ^ -1)) {
                                break L41;
                              } else {
                                if (34 >= var20.field_j) {
                                  break L40;
                                } else {
                                  break L41;
                                }
                              }
                            }
                            if (5 != var20.field_b) {
                              break L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                        var19 = var19 & 16711935;
                        break L39;
                      }
                      L42: {
                        if (eg.field_p != var16) {
                          break L42;
                        } else {
                          L43: {
                            if (var20.field_v != 4) {
                              break L43;
                            } else {
                              var19 = 16777215;
                              break L43;
                            }
                          }
                          L44: {
                            if (var20.field_v != 5) {
                              break L44;
                            } else {
                              var19 = 16777214;
                              break L44;
                            }
                          }
                          L45: {
                            if (null == var20.field_C) {
                              break L45;
                            } else {
                              if (-6 != (var20.field_C.field_v ^ -1)) {
                                break L45;
                              } else {
                                var19 = 16777215;
                                break L45;
                              }
                            }
                          }
                          if (null == var20.field_c) {
                            break L42;
                          } else {
                            if ((var20.field_c.field_v ^ -1) == -5) {
                              var19 = 16777214;
                              break L42;
                            } else {
                              break L42;
                            }
                          }
                        }
                      }
                      L46: {
                        if (var20.field_a) {
                          break L46;
                        } else {
                          if (var20.field_d) {
                            var19 = 65793;
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                      }
                      L47: {
                        if (var20.field_p <= 0) {
                          break L47;
                        } else {
                          var19 = 4 * var20.field_p;
                          break L47;
                        }
                      }
                      L48: {
                        if (!var20.field_w) {
                          stackIn_100_0 = 0;
                          break L48;
                        } else {
                          stackIn_100_0 = 1;
                          break L48;
                        }
                      }
                      L49: {
                        var22 = stackIn_100_0;
                        if (1 != this.field_m) {
                          break L49;
                        } else {
                          if (var16 != 0) {
                            break L49;
                          } else {
                            if (var20.field_d) {
                              break L49;
                            } else {
                              L50: {
                                if (Math.abs(-(this.field_b / 2) + var17) >= -5 + this.field_b / 2) {
                                  break L50;
                                } else {
                                  if (Math.abs(-(this.field_e / 2) + var18) >= -5 + this.field_e / 2) {
                                    break L50;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                              var22 = 1;
                              break L49;
                            }
                          }
                        }
                      }
                      L51: {
                        if ((this.field_m ^ -1) != -3) {
                          break L51;
                        } else {
                          if (-1 != (var16 ^ -1)) {
                            break L51;
                          } else {
                            L52: {
                              if (Math.abs(-(this.field_b / 2) + var17) >= -5 + this.field_b / 2) {
                                break L52;
                              } else {
                                if (Math.abs(-(this.field_e / 2) + var18) < this.field_e / 2 - 5) {
                                  break L51;
                                } else {
                                  break L52;
                                }
                              }
                            }
                            var22 = 1;
                            break L51;
                          }
                        }
                      }
                      L53: {
                        if (-4 != (this.field_m ^ -1)) {
                          break L53;
                        } else {
                          if (1 != var16) {
                            break L53;
                          } else {
                            if (12 <= var17) {
                              break L53;
                            } else {
                              if (-13 >= (var18 ^ -1)) {
                                break L53;
                              } else {
                                var22 = 1;
                                break L53;
                              }
                            }
                          }
                        }
                      }
                      L54: {
                        if (this.field_m == 4) {
                          if (var16 != 2) {
                            break L54;
                          } else {
                            if (var20.field_b != 5) {
                              var22 = 1;
                              break L54;
                            } else {
                              break L54;
                            }
                          }
                        } else {
                          break L54;
                        }
                      }
                      L55: {
                        if (var22 != 0) {
                          var19 = (int)(128.0 + 64.0 * Math.sin((double)(-var18) + (mm.field_f * 2.0 + (double)var17))) * 65793;
                          break L55;
                        } else {
                          break L55;
                        }
                      }
                      L56: {
                        if (-1 == (var19 ^ -1)) {
                          break L56;
                        } else {
                          L57: {
                            l.f(var6, var7, 5, 5, var19);
                            if (-16777216 == (var19 ^ -1)) {
                              l.c(var6, var7 + 2, var6 + 2, var7, 0);
                              l.c(var6, 3 + var7, var6 + 2, var7 + 1, 0);
                              l.c(4 + var6, 2 + var7, var6 + 2, var7, 0);
                              l.c(4 + var6, var7 - -3, var6 + 2, var7 + 1, 0);
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                          L58: {
                            if (-16777215 == (var19 ^ -1)) {
                              l.c(var6, var7 + 1, var6 + 2, var7 + 3, 0);
                              l.c(var6, var7, var6 - -2, 2 + var7, 0);
                              l.c(var6 - -4, 1 + var7, var6 + 2, var7 - -3, 0);
                              l.c(var6 + 4, var7, var6 + 2, var7 - -2, 0);
                              break L58;
                            } else {
                              break L58;
                            }
                          }
                          l.f(var6 + 4, var7, 5, 2236962);
                          l.b(var6, 4 + var7, 4, 2236962);
                          break L56;
                        }
                      }
                      L59: {
                        if (var21 == 0) {
                          break L59;
                        } else {
                          l.c(var6, var7, -1 + (5 + var6), -1 + (var7 - -5), 16711680);
                          l.c(var6, 1 + var7, 5 + var6 + -2, 5 + var7 + -1, 16711680);
                          l.c(5 + (var6 - 1), var7, -1 + (var6 - -5), var7, 16711680);
                          break L59;
                        }
                      }
                      L60: {
                        if (var6 > this.field_i.field_y) {
                          break L60;
                        } else {
                          if (this.field_i.field_y >= 5 + var6) {
                            break L60;
                          } else {
                            if (var7 > this.field_i.field_j) {
                              break L60;
                            } else {
                              if (5 + var7 > this.field_i.field_j) {
                                uf.field_c = var17;
                                vf.field_a = var18;
                                break L60;
                              } else {
                                break L60;
                              }
                            }
                          }
                        }
                      }
                      L61: {
                        if (var20.field_a) {
                          break L61;
                        } else {
                          if (!var20.field_d) {
                            break L61;
                          } else {
                            var18++;
                            continue L20;
                          }
                        }
                      }
                      L62: {
                        if (4 != (var20.field_i & 4)) {
                          break L62;
                        } else {
                          l.g(var6 + 4, var7, 5, 16776960);
                          break L62;
                        }
                      }
                      L63: {
                        if ((var20.field_i & 8 ^ -1) == -9) {
                          l.d(var6, 4 + var7, 5, 16776960);
                          break L63;
                        } else {
                          break L63;
                        }
                      }
                      L64: {
                        if (-1 != var20.field_g) {
                          L65: {
                            var23 = var15;
                            if ((var20.field_e & 1 ^ -1) != -2) {
                              break L65;
                            } else {
                              var23 = var14;
                              break L65;
                            }
                          }
                          L66: {
                            if ((var20.field_i & 1) == 1) {
                              var23 = 16776960;
                              break L66;
                            } else {
                              break L66;
                            }
                          }
                          l.g(var6, var7, 5, var23);
                          l.g(-1 + var6, var7, 5, var23);
                          break L64;
                        } else {
                          break L64;
                        }
                      }
                      if (-1 != var20.field_k) {
                        L67: {
                          var23 = var15;
                          if ((var20.field_e & 2) == 2) {
                            var23 = var14;
                            break L67;
                          } else {
                            break L67;
                          }
                        }
                        L68: {
                          if ((2 & var20.field_i ^ -1) != -3) {
                            break L68;
                          } else {
                            var23 = 16776960;
                            break L68;
                          }
                        }
                        l.d(var6, var7 - 1, 5, var23);
                        l.d(var6, var7, 5, var23);
                        var18++;
                        continue L20;
                      } else {
                        var18++;
                        continue L20;
                      }
                    } else {
                      var18++;
                      continue L20;
                    }
                  }
                }
              }
            }
          }
        }
    }

    dk(byte[] param0) {
        int var2_int = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        this.field_k = 0;
        try {
            var2_int = 0;
            incrementValue$0 = var2_int;
            var2_int++;
            this.field_b = param0[incrementValue$0];
            incrementValue$1 = var2_int;
            var2_int++;
            this.field_e = param0[incrementValue$1];
            this.field_f = new dl[this.field_b][this.field_e];
            this.a(0, (byte) 104, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "dk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    dk(e param0) {
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_181_0 = 0;
        int stackIn_181_1 = 0;
        int stackIn_185_0 = 0;
        int stackIn_185_1 = 0;
        int stackIn_193_0 = 0;
        int stackIn_193_1 = 0;
        int stackIn_197_0 = 0;
        int stackIn_197_1 = 0;
        int stackIn_213_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        int stackIn_283_0 = 0;
        int stackIn_283_1 = 0;
        int stackIn_291_0 = 0;
        int stackIn_291_1 = 0;
        int stackIn_295_0 = 0;
        int stackIn_295_1 = 0;
        int stackIn_299_0 = 0;
        int stackIn_299_1 = 0;
        int stackIn_306_0 = 0;
        int stackIn_306_1 = 0;
        int stackIn_314_0 = 0;
        int stackIn_314_1 = 0;
        int stackIn_318_0 = 0;
        int stackIn_318_1 = 0;
        RuntimeException stackIn_324_0 = null;
        StringBuilder stackIn_324_1 = null;
        RuntimeException stackIn_325_0 = null;
        StringBuilder stackIn_325_1 = null;
        RuntimeException stackIn_326_0 = null;
        StringBuilder stackIn_326_1 = null;
        String stackIn_326_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10_ref_byte__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    this.field_k = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_m = 0;
                    this.field_i = param0;
                    sj.field_b = 0;
                    lg.field_c = 0;
                    eh.field_m = false;
                    jh.field_n = 0;
                    var2_int = 0;
                    var3 = 0;
                    var4 = 0;
                    var5 = 0;
                    if (!param0.field_G.field_db) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_b = 64;
                    this.field_e = 64;
                    this.field_a = 3;
                    var2_int = 4;
                    var5 = 1;
                    if (!mb.b(0, 77)) {
                        statePc = 46;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_a = 2;
                    statePc = 46;
                    continue stateLoop;
                }
                case 4: {
                    var6 = param0.field_G.field_Bb;
                    if ((var6 ^ -1) == -1) {
                        statePc = 19;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (1 == var6) {
                        statePc = 20;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if ((var6 ^ -1) == -3) {
                        statePc = 21;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (3 == var6) {
                        statePc = 22;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (4 == var6) {
                        statePc = 26;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((var6 ^ -1) == -6) {
                        statePc = 27;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if ((var6 ^ -1) == -7) {
                        statePc = 31;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (7 == var6) {
                        statePc = 32;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (8 == var6) {
                        statePc = 33;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var6 == 9) {
                        statePc = 36;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((var6 ^ -1) == -11) {
                        statePc = 40;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var6 == 11) {
                        statePc = 43;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var6 == 12) {
                        statePc = 44;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (-14 == (var6 ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_k = 1;
                    this.field_a = 0;
                    this.field_b = 40;
                    this.field_e = 40;
                    statePc = 46;
                    continue stateLoop;
                }
                case 20: {
                    this.field_k = 2;
                    this.field_e = 64;
                    this.field_b = 64;
                    this.field_a = 2;
                    statePc = 46;
                    continue stateLoop;
                }
                case 21: {
                    var2_int = 4;
                    this.field_k = 3;
                    this.field_a = 3;
                    this.field_e = 64;
                    this.field_b = 64;
                    statePc = 46;
                    continue stateLoop;
                }
                case 22: {
                    this.field_b = 64;
                    this.field_a = 3;
                    this.field_e = 64;
                    stackIn_24_0 = this;
                    stackIn_23_0 = stackIn_24_0;
                    if ((param0.field_G.field_ub ^ -1) == -2) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = this;
                    stackIn_25_1 = 5;
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = this;
                    stackIn_25_1 = 4;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    ((dk) (this)).field_k = stackIn_25_1;
                    var2_int = 4;
                    statePc = 46;
                    continue stateLoop;
                }
                case 26: {
                    var3 = 10;
                    this.field_a = 3;
                    var4 = 1;
                    this.field_e = 64;
                    this.field_b = 64;
                    statePc = 46;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = this;
                    stackIn_28_0 = stackIn_29_0;
                    if (-2 != (param0.field_G.field_ub ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = this;
                    stackIn_30_1 = 5;
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = this;
                    stackIn_30_1 = 4;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ((dk) (this)).field_k = stackIn_30_1;
                    this.field_a = 2;
                    var4 = 1;
                    this.field_b = 64;
                    this.field_e = 64;
                    statePc = 46;
                    continue stateLoop;
                }
                case 31: {
                    var4 = 2;
                    this.field_a = 1;
                    var3 = 15;
                    this.field_b = 64;
                    this.field_e = 64;
                    statePc = 46;
                    continue stateLoop;
                }
                case 32: {
                    this.field_a = 2;
                    this.field_k = 3;
                    this.field_e = 64;
                    this.field_b = 64;
                    var4 = 2;
                    statePc = 46;
                    continue stateLoop;
                }
                case 33: {
                    this.field_b = 64;
                    this.field_e = 64;
                    if (-2 == (param0.field_G.field_vb ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_a = 1;
                    var4 = 3;
                    statePc = 46;
                    continue stateLoop;
                }
                case 35: {
                    this.field_k = 6;
                    this.field_b = 62;
                    this.field_e = 62;
                    this.field_a = 4;
                    statePc = 46;
                    continue stateLoop;
                }
                case 36: {
                    var4 = 4;
                    this.field_b = 64;
                    this.field_a = 2;
                    stackIn_38_0 = this;
                    stackIn_37_0 = stackIn_38_0;
                    if (1 == param0.field_G.field_ub) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = this;
                    stackIn_39_1 = 5;
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = this;
                    stackIn_39_1 = 4;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    ((dk) (this)).field_k = stackIn_39_1;
                    this.field_e = 64;
                    statePc = 46;
                    continue stateLoop;
                }
                case 40: {
                    this.field_b = 64;
                    this.field_e = 64;
                    if ((param0.field_G.field_vb ^ -1) == -2) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_k = 6;
                    this.field_e = 62;
                    this.field_a = 1;
                    this.field_b = 62;
                    statePc = 46;
                    continue stateLoop;
                }
                case 42: {
                    this.field_a = 4;
                    var4 = 3;
                    statePc = 46;
                    continue stateLoop;
                }
                case 43: {
                    this.field_e = 64;
                    this.field_k = 7;
                    this.field_b = 64;
                    this.field_a = 2;
                    statePc = 46;
                    continue stateLoop;
                }
                case 44: {
                    this.field_b = 38;
                    this.field_e = 38;
                    this.field_k = 8;
                    this.field_a = 4;
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    this.field_k = 9;
                    this.field_e = 62;
                    this.field_a = 0;
                    this.field_b = 62;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    this.field_d = new int[this.field_b][this.field_e];
                    this.field_g = new int[this.field_b][this.field_e];
                    this.field_f = new dl[this.field_b][this.field_e];
                    var6 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var6 >= this.field_b) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var7 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var7 >= this.field_e) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.field_f[var6][var7] = new dl(var6, var7, 0, (dk) (this));
                    var7++;
                    statePc = 49;
                    continue stateLoop;
                }
                case 51: {
                    var6++;
                    statePc = 47;
                    continue stateLoop;
                }
                case 52: {
                    if (0 != this.field_k) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if ((var4 ^ -1) == -1) {
                        statePc = 203;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if ((this.field_k ^ -1) == -7) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (9 != this.field_k) {
                        statePc = 131;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var6 = (int)(Math.random() * 3.0) - 1;
                    var7 = -1 + (int)(3.0 * Math.random());
                    var8 = (int)(Math.random() * 5.0) - 2;
                    var9 = -2 + (int)(Math.random() * 5.0);
                    if (var6 != var8) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var7 != var9) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var9--;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((Math.abs(var8) ^ -1) != -3) {
                        statePc = 64;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (Math.abs(var9) != 2) {
                        statePc = 64;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (100.0 * Math.random() >= 50.0) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var8 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    var9 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (-10 != (this.field_k ^ -1)) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var6 = -1;
                    var9 = 1;
                    var8 = 1;
                    var7 = -1;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if ((Math.abs(var6) ^ -1) != -3) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if ((Math.abs(var7) ^ -1) != -3) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var6 = 0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var13 = -2;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = var13;
                    stackIn_71_1 = 2;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (stackIn_71_0 > stackIn_71_1) {
                        statePc = 118;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var14 = -2;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (var14 > 2) {
                        statePc = 117;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Corridors", true)];
                    var15 = (int)(6.0 * Math.random());
                    stackIn_71_0 = -2;
                    stackIn_75_0 = stackIn_71_0;
                    stackIn_71_1 = var15 ^ -1;
                    stackIn_75_1 = stackIn_71_1;
                    if (false) {
                        statePc = 71;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (stackIn_75_0 != stackIn_75_1) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room0", true)];
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (-3 != (var15 ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room1", true)];
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (-4 != (var15 ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room2", true)];
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (-5 != (var15 ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room3", true)];
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (-6 != (var15 ^ -1)) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room4", true)];
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if ((var6 ^ -1) != (var13 ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if ((var14 ^ -1) != (var7 ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (6 != this.field_k) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-CommandCenter", true)];
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if ((var13 ^ -1) != (var8 ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if ((var14 ^ -1) != (var9 ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Entrance", true)];
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if ((var13 ^ -1) != (var6 ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if ((var14 ^ -1) != (var7 ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if ((this.field_k ^ -1) != -10) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Reactor", true)];
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (-3 != (var13 ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (-3 != (var14 ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (-10 != (this.field_k ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Hangerdoor", true)];
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (-3 != (var13 ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if ((var14 ^ -1) != -3) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if ((this.field_k ^ -1) != -7) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Maindoor", true)];
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var11 = this.field_b / 2 + 12 * var13;
                    var12 = this.field_b / 2 - -(var14 * 12);
                    if (9 != this.field_k) {
                        statePc = 111;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if ((var13 ^ -1) != -1) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (-1 == (var14 ^ -1)) {
                        statePc = 116;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (var13 != 0) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (-1 == var14) {
                        statePc = 116;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (0 != (var13 ^ -1)) {
                        statePc = 111;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if ((var14 ^ -1) == -1) {
                        statePc = 116;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (9 != this.field_k) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (var6 != var13) {
                        statePc = 115;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (var7 != var14) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var11 = var11 + var10_ref_byte__[0] / 4;
                    var12 = var12 + var10_ref_byte__[1] / 4;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    this.a(-(var10_ref_byte__[0] / 2) + var11, (byte) 104, -(var10_ref_byte__[1] / 2) + var12, var10_ref_byte__);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var14++;
                    statePc = 73;
                    continue stateLoop;
                }
                case 117: {
                    var13++;
                    statePc = 70;
                    continue stateLoop;
                }
                case 118: {
                    var13 = 0;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if ((var13 ^ -1) <= (this.field_b ^ -1)) {
                        statePc = 124;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_126_0 = 34;
                    stackIn_121_0 = stackIn_126_0;
                    stackIn_126_1 = this.field_f[var13][1].field_j;
                    stackIn_121_1 = stackIn_126_1;
                    if (false) {
                        statePc = 126;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (stackIn_121_0 == stackIn_121_1) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    this.field_f[var13][2].field_k = -1;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    var13++;
                    statePc = 119;
                    continue stateLoop;
                }
                case 124: {
                    var13 = 0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    stackIn_126_0 = var13;
                    stackIn_126_1 = this.field_e;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if (stackIn_126_0 >= stackIn_126_1) {
                        statePc = 131;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    stackIn_132_0 = -35;
                    stackIn_128_0 = stackIn_132_0;
                    stackIn_132_1 = this.field_f[1][var13].field_j ^ -1;
                    stackIn_128_1 = stackIn_132_1;
                    if (false) {
                        statePc = 132;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 == stackIn_128_1) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    this.field_f[2][var13].field_g = -1;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var13++;
                    statePc = 125;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = 8;
                    stackIn_132_1 = this.field_k;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (stackIn_132_0 != stackIn_132_1) {
                        statePc = 163;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var6 = (int)(Math.random() * 3.0) + -1;
                    var7 = -var6;
                    var8 = -1;
                    var9 = -1;
                    var13 = -1;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    stackIn_135_0 = var13;
                    stackIn_135_1 = 1;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if (stackIn_135_0 > stackIn_135_1) {
                        statePc = 163;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var14 = -1;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (-2 > (var14 ^ -1)) {
                        statePc = 162;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Corridors", true)];
                    var15 = (int)(6.0 * Math.random());
                    stackIn_135_0 = var15 ^ -1;
                    stackIn_139_0 = stackIn_135_0;
                    stackIn_135_1 = -2;
                    stackIn_139_1 = stackIn_135_1;
                    if (false) {
                        statePc = 135;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (stackIn_139_0 != stackIn_139_1) {
                        statePc = 141;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room0", true)];
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (-3 != (var15 ^ -1)) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room1", true)];
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (3 != var15) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room2", true)];
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (4 != var15) {
                        statePc = 147;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room3", true)];
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (var15 != 5) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room4", true)];
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (var13 != var8) {
                        statePc = 152;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if ((var9 ^ -1) != (var14 ^ -1)) {
                        statePc = 152;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Hanger", true)];
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (var13 != var6) {
                        statePc = 155;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (var7 != var14) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Entrance", true)];
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (-2 != (var13 ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (var14 != 1) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Maindoor", true)];
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (8 != this.field_k) {
                        statePc = 161;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if ((var13 ^ -1) != (var8 ^ -1)) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (var9 == var14) {
                        statePc = 161;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var12 = var14 * 12 + this.field_b / 2;
                    var11 = var13 * 12 + this.field_b / 2;
                    this.a(var11 + -(var10_ref_byte__[0] / 2), (byte) 104, -(var10_ref_byte__[1] / 2) + var12, var10_ref_byte__);
                    var14++;
                    statePc = 137;
                    continue stateLoop;
                }
                case 162: {
                    var13++;
                    statePc = 134;
                    continue stateLoop;
                }
                case 163: {
                    if (this.field_k != 7) {
                        statePc = 165;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var23 = of.field_k[wf.a("MissileBase", true)];
                    var7 = this.field_b / 2;
                    var8 = this.field_e / 2;
                    this.a(var7 - var23[0] / 2, (byte) 104, -(var23[1] / 2) + var8, var23);
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if (-2 != (var4 ^ -1)) {
                        statePc = 177;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (this.field_k != 0) {
                        statePc = 177;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var6 = 0;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    stackIn_169_0 = this.field_b ^ -1;
                    stackIn_169_1 = var6 ^ -1;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (stackIn_169_0 >= stackIn_169_1) {
                        statePc = 177;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var7 = 0;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (this.field_e <= var7) {
                        statePc = 176;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var8 = var6 - this.field_b / 2;
                    var9 = var7 + -(this.field_b / 2);
                    var10 = (int)Math.sqrt((double)(var9 * var9 + var8 * var8));
                    stackIn_169_0 = -5;
                    stackIn_173_0 = stackIn_169_0;
                    stackIn_169_1 = var10 ^ -1;
                    stackIn_173_1 = stackIn_169_1;
                    if (false) {
                        statePc = 169;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 >= stackIn_173_1) {
                        statePc = 175;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    this.field_f[var6][var7].field_B = true;
                    this.field_f[var6][var7].field_b = 1;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    var7++;
                    statePc = 171;
                    continue stateLoop;
                }
                case 176: {
                    var6++;
                    statePc = 168;
                    continue stateLoop;
                }
                case 177: {
                    if ((var4 ^ -1) != -3) {
                        statePc = 189;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (this.field_k != 0) {
                        statePc = 189;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var6 = 0;
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    stackIn_181_0 = var6 ^ -1;
                    stackIn_181_1 = this.field_b ^ -1;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (stackIn_181_0 <= stackIn_181_1) {
                        statePc = 189;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var7 = 0;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    if ((var7 ^ -1) <= (this.field_e ^ -1)) {
                        statePc = 188;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var8 = var6 - this.field_b / 2;
                    var9 = -(this.field_b / 2) + var7;
                    var10 = (int)Math.sqrt((double)(var8 * var8 - -(var9 * var9)));
                    stackIn_181_0 = var10 ^ -1;
                    stackIn_185_0 = stackIn_181_0;
                    stackIn_181_1 = -8;
                    stackIn_185_1 = stackIn_181_1;
                    if (false) {
                        statePc = 181;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (stackIn_185_0 <= stackIn_185_1) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    this.field_f[var6][var7].field_B = true;
                    this.field_f[var6][var7].field_b = 1;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    var7++;
                    statePc = 183;
                    continue stateLoop;
                }
                case 188: {
                    var6++;
                    statePc = 180;
                    continue stateLoop;
                }
                case 189: {
                    if (var4 != 3) {
                        statePc = 201;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if ((this.field_k ^ -1) != -1) {
                        statePc = 201;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var6 = 0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    stackIn_193_0 = var6 ^ -1;
                    stackIn_193_1 = this.field_b ^ -1;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (stackIn_193_0 <= stackIn_193_1) {
                        statePc = 201;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var7 = 0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if ((this.field_e ^ -1) >= (var7 ^ -1)) {
                        statePc = 200;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var8 = var6 + -(this.field_b / 2);
                    var9 = var7 - this.field_b / 2;
                    var10 = (int)Math.sqrt((double)(var9 * var9 + var8 * var8));
                    stackIn_193_0 = var10 ^ -1;
                    stackIn_197_0 = stackIn_193_0;
                    stackIn_193_1 = -9;
                    stackIn_197_1 = stackIn_193_1;
                    if (false) {
                        statePc = 193;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (stackIn_197_0 <= stackIn_197_1) {
                        statePc = 199;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    this.field_f[var6][var7].field_B = true;
                    this.field_f[var6][var7].field_b = 1;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    var7++;
                    statePc = 195;
                    continue stateLoop;
                }
                case 200: {
                    var6++;
                    statePc = 192;
                    continue stateLoop;
                }
                case 201: {
                    if (-2 != (this.field_k ^ -1)) {
                        statePc = 203;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var24 = of.field_k[wf.a("Tutorial", true)];
                    this.a(0, (byte) 104, 0, var24);
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    var9 = 0;
                    var10 = 0;
                    var11 = 0;
                    if (this.field_k != 2) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var10 = 1;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (this.field_k != 3) {
                        statePc = 207;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var7 = 1;
                    var11 = 2;
                    var8 = 1;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (4 != this.field_k) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var6 = 1;
                    var7 = 1;
                    var11 = 5;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if (this.field_k != 5) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var7 = 1;
                    var9 = 1;
                    var11 = 3;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    var13 = 0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    stackIn_213_0 = this.field_b;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (stackIn_213_0 <= var13) {
                        statePc = 231;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var14 = 0;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if ((this.field_e ^ -1) >= (var14 ^ -1)) {
                        statePc = 230;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    stackIn_213_0 = var13;
                    stackIn_217_0 = stackIn_213_0;
                    if (false) {
                        statePc = 213;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (stackIn_217_0 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (var14 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    var15 = 32;
                    if ((var15 ^ -1) >= (this.field_f[var13 + -1][var14].field_x ^ -1)) {
                        statePc = 221;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var15 = this.field_f[var13 - 1][var14].field_x;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (var15 <= this.field_f[var13][-1 + var14].field_x) {
                        statePc = 223;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var15 = this.field_f[var13][-1 + var14].field_x;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if ((this.field_f[var13 - 1][-1 + var14].field_x ^ -1) <= (var15 ^ -1)) {
                        statePc = 225;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var15 = this.field_f[-1 + var13][var14 - 1].field_x;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    this.field_f[var13][var14].field_x = 1 + var15;
                    statePc = 227;
                    continue stateLoop;
                }
                case 226: {
                    this.field_f[var13][var14].field_x = 1;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if (!this.field_f[var13][var14].field_B) {
                        statePc = 229;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    this.field_f[var13][var14].field_x = 0;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    var14++;
                    statePc = 215;
                    continue stateLoop;
                }
                case 230: {
                    var13++;
                    statePc = 212;
                    continue stateLoop;
                }
                case 231: {
                    var12 = 1;
                    var13_ref = null;
                    if (var12 == 0) {
                        statePc = 235;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (var6 == 0) {
                        statePc = 235;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var12 = 0;
                    var13_ref = of.field_k[wf.a("Hanger", true)];
                    var6 = 0;
                    if ((param0.field_G.field_Bb ^ -1) != -4) {
                        statePc = 235;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var13_ref = of.field_k[wf.a("AlienHanger", true)];
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    if (var12 == 0) {
                        statePc = 238;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (var8 == 0) {
                        statePc = 238;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var8 = 0;
                    var13_ref = of.field_k[wf.a("ResearchBase", true)];
                    var12 = 0;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if (var12 == 0) {
                        statePc = 242;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (var9 == 0) {
                        statePc = 242;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var13_ref = of.field_k[wf.a("FactoryBase", true)];
                    var9 = 0;
                    var12 = 0;
                    if (param0.field_G.field_Bb != 3) {
                        statePc = 242;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    var13_ref = of.field_k[wf.a("AlienFactoryBase", true)];
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (var12 == 0) {
                        statePc = 245;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (var7 == 0) {
                        statePc = 245;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var12 = 0;
                    var13_ref = of.field_k[wf.a("Helepad", true)];
                    var7 = 0;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (var12 == 0) {
                        statePc = 248;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (var10 <= 0) {
                        statePc = 248;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var12 = 0;
                    var10--;
                    var13_ref = of.field_k[wf.a("Barracks", true)];
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (var12 == 0) {
                        statePc = 251;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (-1 <= (var11 ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    var11--;
                    var12 = 0;
                    var13_ref = of.field_k[wf.a("FuelDump", true)];
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    var14 = 0;
                    if (var12 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (var4 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    stackIn_254_0 = 0;
                    stackIn_254_1 = this.field_k;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    if (stackIn_254_0 == stackIn_254_1) {
                        statePc = 267;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var14 = 1;
                    var12 = 0;
                    if ((var4 ^ -1) != -2) {
                        statePc = 257;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (var4 != 2) {
                        statePc = 259;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var13_ref = of.field_k[wf.a("UFO-Invader", true)];
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    if ((var4 ^ -1) != -4) {
                        statePc = 261;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var13_ref = of.field_k[wf.a("UFO-Dominator", true)];
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if (3 < var4) {
                        statePc = 263;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var4 = 0;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    if (5 != var4) {
                        statePc = 265;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                    var4 = 1;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    if (4 != var4) {
                        statePc = 267;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var4 = 5;
                    var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    if (var13_ref == null) {
                        statePc = 281;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var17 = 0;
                    var18 = 0;
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    var18++;
                    if (-11 <= (var18 ^ -1)) {
                        statePc = 271;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    var17++;
                    var18 = 0;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    if (var17 <= this.field_b / 2) {
                        statePc = 273;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var17 = this.field_b / 2;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    var15 = (int)(2.0 * (Math.random() * (double)var17)) + -var17 - -(this.field_b / 2);
                    var16 = (int)(2.0 * ((double)var17 * Math.random())) - (var17 + -(this.field_e / 2));
                    if (var4 == 0) {
                        statePc = 279;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (var14 != 0) {
                        statePc = 279;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var15 = var15 - (-(((byte[]) (var13_ref))[0] / 2) + (this.field_b / 4 - var17 / 2));
                    var16 = var16 - (-(((byte[]) (var13_ref))[1] / 2) + -(var17 / 2) + this.field_b / 4);
                    if (var15 >= 1 + ((byte[]) (var13_ref))[0] / 2) {
                        statePc = 277;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var15 = 1 + ((byte[]) (var13_ref))[0] / 2;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    if (1 + ((byte[]) (var13_ref))[1] / 2 <= var16) {
                        statePc = 279;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    var16 = ((byte[]) (var13_ref))[1] / 2 + 1;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    if ((((byte[]) (var13_ref))[0] - -1 ^ -1) < (this.field_f[((byte[]) (var13_ref))[0] / 2 + var15][var16 + ((byte[]) (var13_ref))[1] / 2].field_x ^ -1)) {
                        statePc = 269;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    this.a(-(((byte[]) (var13_ref))[0] / 2) + var15, (byte) 104, -(((byte[]) (var13_ref))[1] / 2) + var16, (byte[]) (var13_ref));
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    if (var12 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    stackIn_254_0 = 1;
                    stackIn_283_0 = stackIn_254_0;
                    stackIn_254_1 = this.field_k;
                    stackIn_283_1 = stackIn_254_1;
                    if (false) {
                        statePc = 254;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (stackIn_283_0 == stackIn_283_1) {
                        statePc = 287;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (var5 == 0) {
                        statePc = 286;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    this.a((byte) -106);
                    statePc = 288;
                    continue stateLoop;
                }
                case 286: {
                    this.a(1);
                    statePc = 288;
                    continue stateLoop;
                }
                case 287: {
                    this.a(1);
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    var13 = 0;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    if (var3 + var2_int <= var13) {
                        statePc = 305;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var14 = 4 + (int)(6.0 * Math.random());
                    var14 = var14 * var14;
                    var15 = (int)(Math.random() * (double)this.field_b);
                    var16 = (int)(Math.random() * (double)this.field_e);
                    stackIn_306_0 = var2_int ^ -1;
                    stackIn_291_0 = stackIn_306_0;
                    stackIn_306_1 = var13 ^ -1;
                    stackIn_291_1 = stackIn_306_1;
                    if (false) {
                        statePc = 306;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (stackIn_291_0 < stackIn_291_1) {
                        statePc = 293;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var15 = (int)(Math.random() * (double)this.field_b / 2.0) + this.field_b / 4;
                    var16 = (int)(Math.random() * (double)this.field_e / 2.0) + this.field_e / 4;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    var20 = 0;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    stackIn_295_0 = var20 ^ -1;
                    stackIn_295_1 = this.field_b ^ -1;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    if (stackIn_295_0 <= stackIn_295_1) {
                        statePc = 304;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var21 = 0;
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    if ((var21 ^ -1) <= (this.field_e ^ -1)) {
                        statePc = 303;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var18 = -var21 + var16;
                    var17 = -var20 + var15;
                    var19 = var17 * var17 - -(var18 * var18);
                    stackIn_295_0 = var19 ^ -1;
                    stackIn_299_0 = stackIn_295_0;
                    stackIn_295_1 = var14 ^ -1;
                    stackIn_299_1 = stackIn_295_1;
                    if (false) {
                        statePc = 295;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    if (stackIn_299_0 < stackIn_299_1) {
                        statePc = 302;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    if ((double)var14 * Math.random() <= (double)var19) {
                        statePc = 302;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    this.field_f[var20][var21].a(false);
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    var21++;
                    statePc = 297;
                    continue stateLoop;
                }
                case 303: {
                    var20++;
                    statePc = 294;
                    continue stateLoop;
                }
                case 304: {
                    var13++;
                    statePc = 289;
                    continue stateLoop;
                }
                case 305: {
                    stackIn_306_0 = var4;
                    stackIn_306_1 = 1;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (stackIn_306_0 != stackIn_306_1) {
                        statePc = 308;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var25 = of.field_k[wf.a("UFO-Transport", true)];
                    this.a(this.field_b / 2 - var25[0] / 2, (byte) 104, this.field_e / 2 + -(var25[1] / 2), var25);
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    if (-3 != (var4 ^ -1)) {
                        statePc = 310;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    var26 = of.field_k[wf.a("UFO-Invader", true)];
                    this.a(this.field_b / 2 + -(var26[0] / 2), (byte) 104, this.field_e / 2 - var26[1] / 2, var26);
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    if (3 != var4) {
                        statePc = 312;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    var27 = of.field_k[wf.a("UFO-Dominator", true)];
                    this.a(this.field_b / 2 - var27[0] / 2, (byte) 104, this.field_e / 2 - var27[1] / 2, var27);
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    var13 = 0;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    stackIn_314_0 = var13;
                    stackIn_314_1 = this.field_b;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    if (stackIn_314_0 >= stackIn_314_1) {
                        statePc = 327;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var14 = 0;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if (var14 >= this.field_e) {
                        statePc = 321;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    this.field_f[var13][var14].a(0);
                    stackIn_314_0 = param0.field_G.field_Bb;
                    stackIn_318_0 = stackIn_314_0;
                    stackIn_314_1 = 1;
                    stackIn_318_1 = stackIn_314_1;
                    if (false) {
                        statePc = 314;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    if (stackIn_318_0 != stackIn_318_1) {
                        statePc = 320;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    this.field_f[var13][var14].field_z = true;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    var14++;
                    statePc = 316;
                    continue stateLoop;
                }
                case 321: {
                    var13++;
                    statePc = 313;
                    continue stateLoop;
                }
                case 327: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_h = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_j = new int[256];
        field_c = new int[128];
    }
}
