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
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        dl var22 = null;
        dl var23 = null;
        dl var24 = null;
        dl var25 = null;
        dl var26 = null;
        int stackIn_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
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
                                        stackOut_46_0 = 0;
                                        stackIn_47_0 = stackOut_46_0;
                                        break L9;
                                      } else {
                                        stackOut_45_0 = 1;
                                        stackIn_47_0 = stackOut_45_0;
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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
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
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dl var14 = null;
        int var15_int = 0;
        Object var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        dl var22 = null;
        dl var23 = null;
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
                                        if (var17 != 0) {
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
                                        if (var8 != var16) {
                                          if (var17 == var11) {
                                            if (var17 >= -2 + this.field_b) {
                                              break L9;
                                            } else {
                                              var11++;
                                              break L9;
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
        ue discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          var2 = aa.field_m;
          var3 = -(eg.field_p * 2) + pd.field_h;
          if (param0 == -96) {
            break L0;
          } else {
            discarded$1 = this.a(29, 74, -97, 18, 98, 87, true);
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
        RuntimeException var5 = null;
        dl var5_ref = null;
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
        RuntimeException stackIn_307_0 = null;
        StringBuilder stackIn_307_1 = null;
        RuntimeException stackIn_308_0 = null;
        StringBuilder stackIn_308_1 = null;
        RuntimeException stackIn_309_0 = null;
        StringBuilder stackIn_309_1 = null;
        String stackIn_309_2 = null;
        RuntimeException stackIn_310_0 = null;
        StringBuilder stackIn_310_1 = null;
        RuntimeException stackIn_311_0 = null;
        StringBuilder stackIn_311_1 = null;
        RuntimeException stackIn_312_0 = null;
        StringBuilder stackIn_312_1 = null;
        String stackIn_312_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_304_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_234_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_264_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_291_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_301_0 = 0;
        int stackOut_275_0 = 0;
        int stackOut_240_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_306_0 = null;
        StringBuilder stackOut_306_1 = null;
        RuntimeException stackOut_308_0 = null;
        StringBuilder stackOut_308_1 = null;
        String stackOut_308_2 = null;
        RuntimeException stackOut_307_0 = null;
        StringBuilder stackOut_307_1 = null;
        String stackOut_307_2 = null;
        RuntimeException stackOut_309_0 = null;
        StringBuilder stackOut_309_1 = null;
        RuntimeException stackOut_311_0 = null;
        StringBuilder stackOut_311_1 = null;
        String stackOut_311_2 = null;
        RuntimeException stackOut_310_0 = null;
        StringBuilder stackOut_310_1 = null;
        String stackOut_310_2 = null;
        var41 = Terraphoenix.field_V;
        try {
          L0: {
            if (param2 != param1) {
              if (param2 == null) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 != null) {
                  L1: {
                    var5_ref = param1.field_c;
                    if (param3) {
                      var5_ref = this.a(114, param1.field_gb, param1.field_R, param1.field_i);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (null == param2.field_c) {
                      break L2;
                    } else {
                      if (var5_ref != null) {
                        L3: {
                          if (null == param2.field_Z) {
                            break L3;
                          } else {
                            if (var5_ref.field_a) {
                              break L3;
                            } else {
                              if (!param3) {
                                stackOut_21_0 = 0;
                                stackIn_22_0 = stackOut_21_0;
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
                                  stackOut_29_0 = 0;
                                  stackIn_30_0 = stackOut_29_0;
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
                                  stackOut_33_0 = 0;
                                  stackIn_34_0 = stackOut_33_0;
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
                                  stackOut_38_0 = 0;
                                  stackIn_39_0 = stackOut_38_0;
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
                                  stackOut_42_0 = 0;
                                  stackIn_43_0 = stackOut_42_0;
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
                                  stackOut_47_0 = 0;
                                  stackIn_48_0 = stackOut_47_0;
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
                                  stackOut_52_0 = 0;
                                  stackIn_53_0 = stackOut_52_0;
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
                                  stackOut_56_0 = 0;
                                  stackIn_57_0 = stackOut_56_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              }
                            }
                            if (param2.field_U != 7) {
                              break L5;
                            } else {
                              if (-var9 + var7 < 0.0) {
                                stackOut_61_0 = 0;
                                stackIn_62_0 = stackOut_61_0;
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
                            stackOut_178_0 = 1;
                            stackIn_179_0 = stackOut_178_0;
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
                                stackOut_304_0 = 0;
                                stackIn_305_0 = stackOut_304_0;
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
                                              stackOut_191_0 = 0;
                                              stackIn_192_0 = stackOut_191_0;
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
                                                  stackOut_197_0 = 0;
                                                  stackIn_198_0 = stackOut_197_0;
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
                                          stackOut_201_0 = 0;
                                          stackIn_202_0 = stackOut_201_0;
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
                                          stackOut_206_0 = 0;
                                          stackIn_207_0 = stackOut_206_0;
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
                                          stackOut_210_0 = 0;
                                          stackIn_211_0 = stackOut_210_0;
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
                                          stackOut_214_0 = 0;
                                          stackIn_215_0 = stackOut_214_0;
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
                                                  stackOut_224_0 = 0;
                                                  stackIn_225_0 = stackOut_224_0;
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
                                          stackOut_219_0 = 0;
                                          stackIn_220_0 = stackOut_219_0;
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
                                                  stackOut_234_0 = 0;
                                                  stackIn_235_0 = stackOut_234_0;
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
                                          stackOut_229_0 = 0;
                                          stackIn_230_0 = stackOut_229_0;
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
                                                              stackOut_257_0 = 0;
                                                              stackIn_258_0 = stackOut_257_0;
                                                              decompiledRegionSelector0 = 26;
                                                              break L0;
                                                            }
                                                          }
                                                        } else {
                                                          stackOut_253_0 = 0;
                                                          stackIn_254_0 = stackOut_253_0;
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
                                                          stackOut_264_0 = 0;
                                                          stackIn_265_0 = stackOut_264_0;
                                                          decompiledRegionSelector0 = 27;
                                                          break L0;
                                                        } else {
                                                          if ((var38.field_e & 32) != 32) {
                                                            break L72;
                                                          } else {
                                                            if (var35 < 50.0) {
                                                              stackOut_269_0 = 0;
                                                              stackIn_270_0 = stackOut_269_0;
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
                                                                                stackOut_291_0 = 1;
                                                                                stackIn_292_0 = stackOut_291_0;
                                                                                decompiledRegionSelector0 = 30;
                                                                                break L0;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (var38.field_h == param2) {
                                                                            break L77;
                                                                          } else {
                                                                            stackOut_294_0 = 0;
                                                                            stackIn_295_0 = stackOut_294_0;
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
                                                                    stackOut_301_0 = 1;
                                                                    stackIn_302_0 = stackOut_301_0;
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
                                                stackOut_275_0 = 0;
                                                stackIn_276_0 = stackOut_275_0;
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
                                    stackOut_240_0 = 0;
                                    stackIn_241_0 = stackOut_240_0;
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
                          stackOut_164_0 = 0;
                          stackIn_165_0 = stackOut_164_0;
                          decompiledRegionSelector0 = 12;
                          break L0;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L79: {
            var5 = decompiledCaughtException;
            stackOut_306_0 = (RuntimeException) (var5);
            stackOut_306_1 = new StringBuilder().append("dk.B(").append(param0).append(',');
            stackIn_308_0 = stackOut_306_0;
            stackIn_308_1 = stackOut_306_1;
            stackIn_307_0 = stackOut_306_0;
            stackIn_307_1 = stackOut_306_1;
            if (param1 == null) {
              stackOut_308_0 = (RuntimeException) ((Object) stackIn_308_0);
              stackOut_308_1 = (StringBuilder) ((Object) stackIn_308_1);
              stackOut_308_2 = "null";
              stackIn_309_0 = stackOut_308_0;
              stackIn_309_1 = stackOut_308_1;
              stackIn_309_2 = stackOut_308_2;
              break L79;
            } else {
              stackOut_307_0 = (RuntimeException) ((Object) stackIn_307_0);
              stackOut_307_1 = (StringBuilder) ((Object) stackIn_307_1);
              stackOut_307_2 = "{...}";
              stackIn_309_0 = stackOut_307_0;
              stackIn_309_1 = stackOut_307_1;
              stackIn_309_2 = stackOut_307_2;
              break L79;
            }
          }
          L80: {
            stackOut_309_0 = (RuntimeException) ((Object) stackIn_309_0);
            stackOut_309_1 = ((StringBuilder) (Object) stackIn_309_1).append(stackIn_309_2).append(',');
            stackIn_311_0 = stackOut_309_0;
            stackIn_311_1 = stackOut_309_1;
            stackIn_310_0 = stackOut_309_0;
            stackIn_310_1 = stackOut_309_1;
            if (param2 == null) {
              stackOut_311_0 = (RuntimeException) ((Object) stackIn_311_0);
              stackOut_311_1 = (StringBuilder) ((Object) stackIn_311_1);
              stackOut_311_2 = "null";
              stackIn_312_0 = stackOut_311_0;
              stackIn_312_1 = stackOut_311_1;
              stackIn_312_2 = stackOut_311_2;
              break L80;
            } else {
              stackOut_310_0 = (RuntimeException) ((Object) stackIn_310_0);
              stackOut_310_1 = (StringBuilder) ((Object) stackIn_310_1);
              stackOut_310_2 = "{...}";
              stackIn_312_0 = stackOut_310_0;
              stackIn_312_1 = stackOut_310_1;
              stackIn_312_2 = stackOut_310_2;
              break L80;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_312_0), stackIn_312_2 + ',' + param3 + ')');
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
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
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
                            L36: {
                              this.field_f[var14][var15].field_B = true;
                              if (var7 == var14) {
                                break L36;
                              } else {
                                if (var14 == 1 + var7) {
                                  break L36;
                                } else {
                                  if (var8 == var15) {
                                    break L36;
                                  } else {
                                    if (var15 == 1 + var8) {
                                      break L36;
                                    } else {
                                      L37: {
                                        L38: {
                                          if (1 + var3 >= var14) {
                                            break L38;
                                          } else {
                                            if (1 + var4 < var15) {
                                              if (Math.random() * 100.0 < 65.0) {
                                                this.field_f[var14][var15].field_j = var11;
                                                break L37;
                                              } else {
                                                break L37;
                                              }
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                        if (100.0 * Math.random() < 30.0) {
                                          this.field_f[var14][var15].field_j = 0;
                                          break L37;
                                        } else {
                                          break L37;
                                        }
                                      }
                                      if (1 + var3 != var14) {
                                        if (var15 != var4 + 1) {
                                          break L36;
                                        } else {
                                          if (var14 == var3) {
                                            break L36;
                                          } else {
                                            this.field_f[var14][var15].field_k = var12;
                                            break L36;
                                          }
                                        }
                                      } else {
                                        if (var15 != var4 + 1) {
                                          break L36;
                                        } else {
                                          if (var14 == var3) {
                                            break L36;
                                          } else {
                                            this.field_f[var14][var15].field_k = var12;
                                            break L36;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var15++;
                            continue L34;
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
        dl var7 = null;
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
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        byte[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dl var8 = null;
        int var9 = 0;
        byte[] var10 = null;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
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
        int incrementValue$10 = var3;
        var3++;
        var10[incrementValue$10] = (byte)this.field_b;
        int incrementValue$11 = var3;
        var3++;
        var10[incrementValue$11] = (byte)this.field_e;
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
                incrementValue$12 = var3;
                var3++;
                var2[incrementValue$12] = (byte)(50 + var6);
                var7 = 0;
                if ((var6 ^ -1) == 49) {
                  var7 = 1;
                  var5++;
                  continue L3;
                } else {
                  var8 = this.field_f[var4_int][var5];
                  L5: while (true) {
                    if (var7 == 0) {
                      incrementValue$13 = var3;
                      var3++;
                      var2[incrementValue$13] = (byte)(1 + var8.field_b);
                      incrementValue$14 = var3;
                      var3++;
                      var2[incrementValue$14] = (byte)(1 + var8.field_j);
                      incrementValue$15 = var3;
                      var3++;
                      var2[incrementValue$15] = (byte)(var8.field_g - -1);
                      incrementValue$16 = var3;
                      var3++;
                      var2[incrementValue$16] = (byte)(1 + var8.field_k);
                      incrementValue$17 = var3;
                      var3++;
                      var2[incrementValue$17] = (byte)(var8.field_l + -(100 * var8.field_r));
                      var7 = 1;
                      if (null != var8.field_C) {
                        incrementValue$18 = var3;
                        var3++;
                        var2[incrementValue$18] = (byte) 1;
                        var7 = 0;
                        var8 = var8.field_C;
                        continue L5;
                      } else {
                        incrementValue$19 = var3;
                        var3++;
                        var2[incrementValue$19] = (byte) 0;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
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
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14_int = 0;
        ue var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        dl var24 = null;
        dl var25 = null;
        dl var26 = null;
        int stackIn_22_0 = 0;
        boolean stackIn_86_0 = false;
        boolean stackIn_87_0 = false;
        boolean stackIn_88_0 = false;
        int stackIn_88_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_85_0 = false;
        boolean stackOut_87_0 = false;
        int stackOut_87_1 = 0;
        boolean stackOut_86_0 = false;
        int stackOut_86_1 = 0;
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
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        break L5;
                      } else {
                        stackOut_20_0 = 1;
                        stackIn_22_0 = stackOut_20_0;
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
                                if (var22 != var17) {
                                  if (var21 != var15) {
                                    break L15;
                                  } else {
                                    if (var21 >= this.field_b - 2) {
                                      break L15;
                                    } else {
                                      var15++;
                                      break L15;
                                    }
                                  }
                                } else {
                                  if (var21 != var15) {
                                    break L15;
                                  } else {
                                    if (var21 >= this.field_b - 2) {
                                      break L15;
                                    } else {
                                      var15++;
                                      break L15;
                                    }
                                  }
                                }
                              }
                              L16: {
                                if (var14_int != var21) {
                                  break L16;
                                } else {
                                  if (-2 <= (var21 ^ -1)) {
                                    break L16;
                                  } else {
                                    var14_int--;
                                    break L16;
                                  }
                                }
                              }
                              var24 = this.a(-120, var22, param6, var21);
                              var26 = var24;
                              if (var26 == null) {
                                break L13;
                              } else {
                                L17: {
                                  if (!param4) {
                                    break L17;
                                  } else {
                                    if (var26.field_a) {
                                      break L17;
                                    } else {
                                      if (var26.field_d) {
                                        this.field_d[var21][var22] = 1000;
                                        break L13;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                L18: {
                                  if (-5 != (var26.field_v ^ -1)) {
                                    break L18;
                                  } else {
                                    if (param5 <= param6) {
                                      break L18;
                                    } else {
                                      L19: {
                                        stackOut_85_0 = var26.field_d;
                                        stackIn_87_0 = stackOut_85_0;
                                        stackIn_86_0 = stackOut_85_0;
                                        if (var13 != 0) {
                                          stackOut_87_0 = stackIn_87_0;
                                          stackOut_87_1 = 0;
                                          stackIn_88_0 = stackOut_87_0;
                                          stackIn_88_1 = stackOut_87_1;
                                          break L19;
                                        } else {
                                          stackOut_86_0 = stackIn_86_0;
                                          stackOut_86_1 = 1;
                                          stackIn_88_0 = stackOut_86_0;
                                          stackIn_88_1 = stackOut_86_1;
                                          break L19;
                                        }
                                      }
                                      if ((stackIn_88_0 ? 1 : 0) != stackIn_88_1) {
                                        var11 = var22;
                                        var20 = 1000;
                                        var10 = var21;
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                L20: {
                                  if ((var26.field_v ^ -1) != -6) {
                                    break L20;
                                  } else {
                                    if (param5 >= param6) {
                                      break L20;
                                    } else {
                                      var11 = var22;
                                      var20 = 1000;
                                      var10 = var21;
                                      break L20;
                                    }
                                  }
                                }
                                L21: {
                                  if (1 < var21) {
                                    var18 = -1;
                                    var19 = 0;
                                    if (this.field_d[var18 + var21][var19 + var22] <= var20 - -var26.a(var19, var18, -108)) {
                                      break L21;
                                    } else {
                                      this.field_d[var21 - -var18][var22 - -var19] = var20 - -var24.a(var19, var18, -110);
                                      break L21;
                                    }
                                  } else {
                                    break L21;
                                  }
                                }
                                L22: {
                                  if ((var21 ^ -1) >= -2) {
                                    break L22;
                                  } else {
                                    if (-2 <= (var22 ^ -1)) {
                                      break L22;
                                    } else {
                                      var18 = -1;
                                      var19 = -1;
                                      if (this.field_d[var21 - -var18][var22 + var19] > var26.a(var19, var18, -122) + var20) {
                                        this.field_d[var18 + var21][var22 - -var19] = var24.a(var19, var18, -128) + var20;
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                                L23: {
                                  if (var21 <= 1) {
                                    break L23;
                                  } else {
                                    if (-2 + this.field_e > var22) {
                                      var18 = -1;
                                      var19 = 1;
                                      if (this.field_d[var21 + var18][var19 + var22] <= var20 - -var26.a(var19, var18, -122)) {
                                        break L23;
                                      } else {
                                        this.field_d[var18 + var21][var19 + var22] = var24.a(var19, var18, -128) + var20;
                                        break L23;
                                      }
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                L24: {
                                  if (-2 + this.field_b > var21) {
                                    var19 = 0;
                                    var18 = 1;
                                    if (this.field_d[var21 - -var18][var22 - -var19] <= var20 - -var26.a(var19, var18, -113)) {
                                      break L24;
                                    } else {
                                      this.field_d[var21 + var18][var22 + var19] = var20 - -var24.a(var19, var18, -118);
                                      break L24;
                                    }
                                  } else {
                                    break L24;
                                  }
                                }
                                L25: {
                                  if (var21 >= this.field_b - 2) {
                                    break L25;
                                  } else {
                                    if ((var22 ^ -1) < -2) {
                                      var19 = -1;
                                      var18 = 1;
                                      if (this.field_d[var21 - -var18][var22 - -var19] > var20 - -var26.a(var19, var18, -110)) {
                                        this.field_d[var21 - -var18][var22 + var19] = var20 + var24.a(var19, var18, -124);
                                        break L25;
                                      } else {
                                        break L25;
                                      }
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                L26: {
                                  if (this.field_b - 2 <= var21) {
                                    break L26;
                                  } else {
                                    if (-2 + this.field_e > var22) {
                                      var18 = 1;
                                      var19 = 1;
                                      if (this.field_d[var21 + var18][var22 + var19] <= var20 + var26.a(var19, var18, -125)) {
                                        break L26;
                                      } else {
                                        this.field_d[var21 - -var18][var22 + var19] = var24.a(var19, var18, -118) + var20;
                                        break L26;
                                      }
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                L27: {
                                  if (-2 <= (var22 ^ -1)) {
                                    break L27;
                                  } else {
                                    var18 = 0;
                                    var19 = -1;
                                    if (this.field_d[var18 + var21][var22 + var19] > var26.a(var19, var18, -119) + var20) {
                                      this.field_d[var18 + var21][var22 - -var19] = var20 - -var24.a(var19, var18, -113);
                                      break L27;
                                    } else {
                                      break L27;
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
                  L28: {
                    var15 = param6;
                    if (var15 < param5) {
                      var15++;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (var15 <= param5) {
                      break L29;
                    } else {
                      var15--;
                      break L29;
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
        int var2_int = 0;
        r var2 = null;
        int var3 = 0;
        int var4 = 0;
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
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dl var12 = null;
        int var13 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            if (param1 == 104) {
              var5_int = 0;
              incrementValue$10 = var5_int;
              var5_int++;
              var6 = param3[incrementValue$10];
              incrementValue$11 = var5_int;
              var5_int++;
              var7 = param3[incrementValue$11];
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
                        incrementValue$12 = var5_int;
                        var5_int++;
                        var10 = param3[incrementValue$12] + -50;
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
                                        incrementValue$13 = var5_int;
                                        var5_int++;
                                        var12.field_b = -1 + param3[incrementValue$13];
                                        incrementValue$14 = var5_int;
                                        var5_int++;
                                        var12.field_j = param3[incrementValue$14] + -1;
                                        incrementValue$15 = var5_int;
                                        var5_int++;
                                        var12.field_g = param3[incrementValue$15] + -1;
                                        incrementValue$16 = var5_int;
                                        var5_int++;
                                        var12.field_k = param3[incrementValue$16] + -1;
                                        var11 = 1;
                                        incrementValue$17 = var5_int;
                                        var5_int++;
                                        var12.field_l = var12.field_l + param3[incrementValue$17];
                                        incrementValue$18 = var5_int;
                                        var5_int++;
                                        if (param3[incrementValue$18] == 1) {
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
                                                  stackOut_28_0 = 0;
                                                  stackIn_29_0 = stackOut_28_0;
                                                  break L8;
                                                } else {
                                                  stackOut_27_0 = 1;
                                                  stackIn_29_0 = stackOut_27_0;
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
                              incrementValue$19 = var5_int;
                              var5_int++;
                              if (-2 == (param3[incrementValue$19] ^ -1)) {
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
            stackOut_36_0 = (RuntimeException) (var5);
            stackOut_36_1 = new StringBuilder().append("dk.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
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
        boolean discarded$2 = false;
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -93) {
                break L1;
              } else {
                discarded$2 = this.a(-66, 2, 104, 35, -6, (byte) -56, 26);
                break L1;
              }
            }
            stackOut_2_0 = this.a(10056, param2, param1, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("dk.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final ue a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        dl var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        Object var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        dl var23 = null;
        boolean stackIn_14_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_16_0 = false;
        int stackIn_16_1 = 0;
        Object stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        Object stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        Object stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        Object stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        Object stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        Object stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        int stackIn_134_2 = 0;
        boolean stackOut_13_0 = false;
        boolean stackOut_15_0 = false;
        int stackOut_15_1 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_14_1 = 0;
        Object stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        Object stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        Object stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        Object stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        Object stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        Object stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        int stackOut_132_2 = 0;
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
                        stackOut_13_0 = var9.field_d;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var23.field_d) {
                          stackOut_15_0 = stackIn_15_0;
                          stackOut_15_1 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          break L2;
                        } else {
                          stackOut_14_0 = stackIn_14_0;
                          stackOut_14_1 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
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
                                stackOut_123_0 = this;
                                stackOut_123_1 = param2;
                                stackIn_125_0 = stackOut_123_0;
                                stackIn_125_1 = stackOut_123_1;
                                stackIn_124_0 = stackOut_123_0;
                                stackIn_124_1 = stackOut_123_1;
                                if (param6) {
                                  stackOut_125_0 = this;
                                  stackOut_125_1 = stackIn_125_1;
                                  stackOut_125_2 = 0;
                                  stackIn_126_0 = stackOut_125_0;
                                  stackIn_126_1 = stackOut_125_1;
                                  stackIn_126_2 = stackOut_125_2;
                                  break L4;
                                } else {
                                  stackOut_124_0 = this;
                                  stackOut_124_1 = stackIn_124_1;
                                  stackOut_124_2 = 1;
                                  stackIn_126_0 = stackOut_124_0;
                                  stackIn_126_1 = stackOut_124_1;
                                  stackIn_126_2 = stackOut_124_2;
                                  break L4;
                                }
                              }
                              L5: {
                                if (this.a(stackIn_126_1, stackIn_126_2 != 0, param1, param0)) {
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
                                stackOut_131_0 = this;
                                stackOut_131_1 = param2;
                                stackIn_133_0 = stackOut_131_0;
                                stackIn_133_1 = stackOut_131_1;
                                stackIn_132_0 = stackOut_131_0;
                                stackIn_132_1 = stackOut_131_1;
                                if (param6) {
                                  stackOut_133_0 = this;
                                  stackOut_133_1 = stackIn_133_1;
                                  stackOut_133_2 = 0;
                                  stackIn_134_0 = stackOut_133_0;
                                  stackIn_134_1 = stackOut_133_1;
                                  stackIn_134_2 = stackOut_133_2;
                                  break L7;
                                } else {
                                  stackOut_132_0 = this;
                                  stackOut_132_1 = stackIn_132_1;
                                  stackOut_132_2 = 1;
                                  stackIn_134_0 = stackOut_132_0;
                                  stackIn_134_1 = stackOut_132_1;
                                  stackIn_134_2 = stackOut_132_2;
                                  break L7;
                                }
                              }
                              if (this.a(stackIn_134_1, stackIn_134_2 == 0, param1, param0)) {
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
                                      if (this.field_d[var17][var18] == var16_int) {
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
                                          if (var10 != var17) {
                                            if (var13 != var18) {
                                              break L16;
                                            } else {
                                              if (var18 >= -2 + this.field_e) {
                                                break L16;
                                              } else {
                                                var13++;
                                                break L16;
                                              }
                                            }
                                          } else {
                                            if (var13 != var18) {
                                              break L16;
                                            } else {
                                              if (var18 >= -2 + this.field_e) {
                                                break L16;
                                              } else {
                                                var13++;
                                                break L16;
                                              }
                                            }
                                          }
                                        }
                                        L17: {
                                          if (var12 != var18) {
                                            break L17;
                                          } else {
                                            if (-2 <= (var18 ^ -1)) {
                                              break L17;
                                            } else {
                                              var12--;
                                              break L17;
                                            }
                                          }
                                        }
                                        L18: {
                                          if (var11 != var17) {
                                            break L18;
                                          } else {
                                            if (this.field_b + -2 > var17) {
                                              var11++;
                                              break L18;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        L19: {
                                          var19 = 0;
                                          if (100 > this.field_g[var17][var18]) {
                                            var19 = 200 - this.field_g[var17][var18];
                                            break L19;
                                          } else {
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          if (-1 < (var19 ^ -1)) {
                                            var19 = 0;
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          if (-2 <= (var17 ^ -1)) {
                                            break L21;
                                          } else {
                                            var15 = 0;
                                            var14 = -1;
                                            if (this.field_d[var17 - -var14][var15 + var18] > var16_int - (-this.field_f[var17][var18].a(var15, 1000, param3, var14) + -var19)) {
                                              this.field_d[var14 + var17][var15 + var18] = var19 + this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int;
                                              break L21;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        L22: {
                                          if ((var17 ^ -1) >= -2) {
                                            break L22;
                                          } else {
                                            if (var18 > 1) {
                                              var15 = -1;
                                              var14 = -1;
                                              if (this.field_d[var14 + var17][var15 + var18] > var16_int - -this.field_f[var17][var18].a(var15, 1000, param3, var14) + var19) {
                                                this.field_d[var17 - -var14][var18 + var15] = var19 + (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int);
                                                break L22;
                                              } else {
                                                break L22;
                                              }
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        L23: {
                                          if (var17 <= 1) {
                                            break L23;
                                          } else {
                                            if (var18 >= -2 + this.field_e) {
                                              break L23;
                                            } else {
                                              var14 = -1;
                                              var15 = 1;
                                              if (this.field_d[var17 + var14][var18 - -var15] <= this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19) {
                                                break L23;
                                              } else {
                                                this.field_d[var17 - -var14][var15 + var18] = var19 + (var16_int + this.field_f[var17][var18].a(var15, 1000, param3, var14));
                                                break L23;
                                              }
                                            }
                                          }
                                        }
                                        L24: {
                                          if (-2 + this.field_b > var17) {
                                            var14 = 1;
                                            var15 = 0;
                                            if (this.field_d[var17 - -var14][var18 - -var15] > this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19) {
                                              this.field_d[var17 - -var14][var15 + var18] = var16_int + (this.field_f[var17][var18].a(var15, 1000, param3, var14) - -var19);
                                              break L24;
                                            } else {
                                              break L24;
                                            }
                                          } else {
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (-2 + this.field_b <= var17) {
                                            break L25;
                                          } else {
                                            if (1 >= var18) {
                                              break L25;
                                            } else {
                                              var14 = 1;
                                              var15 = -1;
                                              if (this.field_d[var14 + var17][var18 - -var15] <= this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19) {
                                                break L25;
                                              } else {
                                                this.field_d[var14 + var17][var15 + var18] = var19 + var16_int - -this.field_f[var17][var18].a(var15, 1000, param3, var14);
                                                break L25;
                                              }
                                            }
                                          }
                                        }
                                        L26: {
                                          if (var17 >= -2 + this.field_b) {
                                            break L26;
                                          } else {
                                            if (this.field_e - 2 <= var18) {
                                              break L26;
                                            } else {
                                              var14 = 1;
                                              var15 = 1;
                                              if (this.field_d[var17 + var14][var18 + var15] > var19 + (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int)) {
                                                this.field_d[var17 + var14][var18 - -var15] = this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int - -var19;
                                                break L26;
                                              } else {
                                                break L26;
                                              }
                                            }
                                          }
                                        }
                                        L27: {
                                          if (-2 > (var18 ^ -1)) {
                                            var14 = 0;
                                            var15 = -1;
                                            if (this.field_d[var17 - -var14][var18 + var15] <= var19 + (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int)) {
                                              break L27;
                                            } else {
                                              this.field_d[var14 + var17][var15 + var18] = var16_int + this.field_f[var17][var18].a(var15, 1000, param3, var14) - -var19;
                                              break L27;
                                            }
                                          } else {
                                            break L27;
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
              L28: while (true) {
                if (this.field_e <= var9_int) {
                  var8++;
                  continue L0;
                } else {
                  this.field_d[var8][var9_int] = 1000;
                  var9_int++;
                  continue L28;
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
        ue discarded$1 = null;
        int var3 = 0;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dl var14 = null;
        ci var15 = null;
        ci var16 = null;
        int var17 = 0;
        ci var18 = null;
        dl stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        Object stackIn_47_3 = null;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        dl stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        Object stackIn_48_3 = null;
        int stackIn_48_4 = 0;
        int stackIn_48_5 = 0;
        dl stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        Object stackIn_49_3 = null;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        dl stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        Object stackIn_50_3 = null;
        int stackIn_50_4 = 0;
        int stackIn_50_5 = 0;
        dl stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        Object stackIn_51_3 = null;
        int stackIn_51_4 = 0;
        int stackIn_51_5 = 0;
        int stackIn_51_6 = 0;
        dl stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_46_3 = null;
        int stackOut_46_4 = 0;
        int stackOut_46_5 = 0;
        dl stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        Object stackOut_47_3 = null;
        int stackOut_47_4 = 0;
        int stackOut_47_5 = 0;
        dl stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        Object stackOut_48_3 = null;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        dl stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_49_3 = null;
        int stackOut_49_4 = 0;
        int stackOut_49_5 = 0;
        int stackOut_49_6 = 0;
        dl stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        Object stackOut_50_3 = null;
        int stackOut_50_4 = 0;
        int stackOut_50_5 = 0;
        int stackOut_50_6 = 0;
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
                discarded$1 = this.a(true, 75, 67, -64, 52, 26, 57);
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
                                stackOut_46_0 = this.field_f[var11][var12];
                                stackOut_46_1 = var5;
                                stackOut_46_2 = var3;
                                stackOut_46_3 = var4;
                                stackOut_46_4 = var6;
                                stackOut_46_5 = 125;
                                stackIn_50_0 = stackOut_46_0;
                                stackIn_50_1 = stackOut_46_1;
                                stackIn_50_2 = stackOut_46_2;
                                stackIn_50_3 = stackOut_46_3;
                                stackIn_50_4 = stackOut_46_4;
                                stackIn_50_5 = stackOut_46_5;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                stackIn_47_2 = stackOut_46_2;
                                stackIn_47_3 = stackOut_46_3;
                                stackIn_47_4 = stackOut_46_4;
                                stackIn_47_5 = stackOut_46_5;
                                if (var11 != uf.field_c) {
                                  break L15;
                                } else {
                                  stackOut_47_0 = (dl) ((Object) stackIn_47_0);
                                  stackOut_47_1 = stackIn_47_1;
                                  stackOut_47_2 = stackIn_47_2;
                                  stackOut_47_3 = stackIn_47_3;
                                  stackOut_47_4 = stackIn_47_4;
                                  stackOut_47_5 = stackIn_47_5;
                                  stackIn_50_0 = stackOut_47_0;
                                  stackIn_50_1 = stackOut_47_1;
                                  stackIn_50_2 = stackOut_47_2;
                                  stackIn_50_3 = stackOut_47_3;
                                  stackIn_50_4 = stackOut_47_4;
                                  stackIn_50_5 = stackOut_47_5;
                                  stackIn_48_0 = stackOut_47_0;
                                  stackIn_48_1 = stackOut_47_1;
                                  stackIn_48_2 = stackOut_47_2;
                                  stackIn_48_3 = stackOut_47_3;
                                  stackIn_48_4 = stackOut_47_4;
                                  stackIn_48_5 = stackOut_47_5;
                                  if (vf.field_a != var12) {
                                    break L15;
                                  } else {
                                    stackOut_48_0 = (dl) ((Object) stackIn_48_0);
                                    stackOut_48_1 = stackIn_48_1;
                                    stackOut_48_2 = stackIn_48_2;
                                    stackOut_48_3 = stackIn_48_3;
                                    stackOut_48_4 = stackIn_48_4;
                                    stackOut_48_5 = stackIn_48_5;
                                    stackIn_50_0 = stackOut_48_0;
                                    stackIn_50_1 = stackOut_48_1;
                                    stackIn_50_2 = stackOut_48_2;
                                    stackIn_50_3 = stackOut_48_3;
                                    stackIn_50_4 = stackOut_48_4;
                                    stackIn_50_5 = stackOut_48_5;
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    stackIn_49_2 = stackOut_48_2;
                                    stackIn_49_3 = stackOut_48_3;
                                    stackIn_49_4 = stackOut_48_4;
                                    stackIn_49_5 = stackOut_48_5;
                                    if (!param1) {
                                      break L15;
                                    } else {
                                      stackOut_49_0 = (dl) ((Object) stackIn_49_0);
                                      stackOut_49_1 = stackIn_49_1;
                                      stackOut_49_2 = stackIn_49_2;
                                      stackOut_49_3 = stackIn_49_3;
                                      stackOut_49_4 = stackIn_49_4;
                                      stackOut_49_5 = stackIn_49_5;
                                      stackOut_49_6 = 1;
                                      stackIn_51_0 = stackOut_49_0;
                                      stackIn_51_1 = stackOut_49_1;
                                      stackIn_51_2 = stackOut_49_2;
                                      stackIn_51_3 = stackOut_49_3;
                                      stackIn_51_4 = stackOut_49_4;
                                      stackIn_51_5 = stackOut_49_5;
                                      stackIn_51_6 = stackOut_49_6;
                                      break L14;
                                    }
                                  }
                                }
                              }
                              stackOut_50_0 = (dl) ((Object) stackIn_50_0);
                              stackOut_50_1 = stackIn_50_1;
                              stackOut_50_2 = stackIn_50_2;
                              stackOut_50_3 = stackIn_50_3;
                              stackOut_50_4 = stackIn_50_4;
                              stackOut_50_5 = stackIn_50_5;
                              stackOut_50_6 = 0;
                              stackIn_51_0 = stackOut_50_0;
                              stackIn_51_1 = stackOut_50_1;
                              stackIn_51_2 = stackOut_50_2;
                              stackIn_51_3 = stackOut_50_3;
                              stackIn_51_4 = stackOut_50_4;
                              stackIn_51_5 = stackOut_50_5;
                              stackIn_51_6 = stackOut_50_6;
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
                                ve.a(var15, -5353, var6 + 144 * var13, var6 + -(48 * var13), var5 + -24);
                                break L18;
                              }
                            }
                            L19: {
                              var16 = null;
                              if (param1) {
                                var18 = oi.field_J;
                                var16 = var18;
                                var18.a();
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
                                  var16.a();
                                  l.a(32, 124, 16777215);
                                  l.a(64, 108, 16777215);
                                  l.a(64, 139, 16777215);
                                  l.a(95, 124, 16777215);
                                  k.field_f.a(0);
                                  u.field_a.a();
                                  var16.d(0, 0);
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
                              var16.b(0, 0, 0);
                              k.field_f.a(0);
                              ug.field_b = -64 + var5;
                              hb.field_n = -(48 * eg.field_p) + (-124 + var6);
                              var16.b(-64 + var5, -124 + var6);
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
                              ve.a(var15, -5353, var6 + 144 * var13, var6 - var13 * 48, -24 + var5);
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        dl var20 = null;
        int var21 = 0;
        int var22 = 0;
        dl var22_ref_dl = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        r var26 = null;
        r var27 = null;
        int stackIn_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
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
                                var7 = var27.field_H * 5 + var5;
                                var6 = var4 + var27.field_F * 5;
                                if (null != var27.field_Z) {
                                  if (var27.field_C == 0) {
                                    if (var27.field_Z != null) {
                                      break L9;
                                    } else {
                                      rh.field_b[6].c(-2 + var6, var7 + -2);
                                      break L9;
                                    }
                                  } else {
                                    if (var27.field_C != 0) {
                                      break L9;
                                    } else {
                                      if (var27.field_Z != null) {
                                        break L9;
                                      } else {
                                        rh.field_b[6].c(-2 + var6, var7 + -2);
                                        break L9;
                                      }
                                    }
                                  }
                                } else {
                                  if (var27.field_C != 0) {
                                    break L9;
                                  } else {
                                    if (var27.field_Z != null) {
                                      break L9;
                                    } else {
                                      rh.field_b[6].c(-2 + var6, var7 + -2);
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (null == var27.field_Z) {
                                  break L10;
                                } else {
                                  rh.field_b[0].c(-2 + var6, var7 - 2);
                                  if (this.field_i.field_q != var27) {
                                    break L10;
                                  } else {
                                    rh.field_b[0].f(var6 + -6, -6 + var7);
                                    break L10;
                                  }
                                }
                              }
                              if ((var27.field_C ^ -1) == -2) {
                                L11: {
                                  if (var27.field_t == 0) {
                                    rh.field_b[1].c(-2 + var6, -2 + var7);
                                    break L11;
                                  } else {
                                    if ((var27.field_t ^ -1) != -10) {
                                      rh.field_b[2].c(var6 - 2, var7 + -2);
                                      break L11;
                                    } else {
                                      rh.field_b[12].c(-2 + var6, var7 - 2);
                                      break L11;
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
                    L12: while (true) {
                      if (100 <= var17) {
                        break L7;
                      } else {
                        var26 = this.field_i.field_C[var17];
                        var27 = var26;
                        var27 = var26;
                        if (var26 != null) {
                          if (-1 > (var26.field_P ^ -1)) {
                            if (eg.field_p >= var26.field_E) {
                              L13: {
                                var6 = var4 - -(var26.field_F * 5);
                                var7 = var5 - -(var26.field_H * 5);
                                if (var26.field_Z == null) {
                                  if (var26.field_C == 0) {
                                    if (null == var26.field_Z) {
                                      rh.field_b[6].c(-2 + var6, -2 + var7);
                                      break L13;
                                    } else {
                                      if (var26.field_C != 0) {
                                        break L13;
                                      } else {
                                        if (null != var26.field_Z) {
                                          break L13;
                                        } else {
                                          rh.field_b[6].c(-2 + var6, -2 + var7);
                                          break L13;
                                        }
                                      }
                                    }
                                  } else {
                                    if (var26.field_C != 0) {
                                      break L13;
                                    } else {
                                      if (null != var26.field_Z) {
                                        break L13;
                                      } else {
                                        rh.field_b[6].c(-2 + var6, -2 + var7);
                                        break L13;
                                      }
                                    }
                                  }
                                } else {
                                  if (var26.field_C != 0) {
                                    break L13;
                                  } else {
                                    if (null != var26.field_Z) {
                                      break L13;
                                    } else {
                                      rh.field_b[6].c(-2 + var6, -2 + var7);
                                      break L13;
                                    }
                                  }
                                }
                              }
                              L14: {
                                if (var26.field_Z == null) {
                                  break L14;
                                } else {
                                  if (var26.field_c == null) {
                                    break L14;
                                  } else {
                                    if (var26 != var26.field_c.field_h) {
                                      break L14;
                                    } else {
                                      rh.field_b[0].c(-2 + var6, -2 + var7);
                                      if (var26 == this.field_i.field_q) {
                                        rh.field_b[0].f(var6 + -6, var7 - 6);
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                              if (-2 == (var26.field_C ^ -1)) {
                                L15: {
                                  if (var26.field_t == 0) {
                                    rh.field_b[1].c(var6 + -2, -2 + var7);
                                    break L15;
                                  } else {
                                    if (var26.field_t == 9) {
                                      rh.field_b[12].c(var6 - 2, -2 + var7);
                                      break L15;
                                    } else {
                                      rh.field_b[2].c(var6 - 2, -2 + var7);
                                      break L15;
                                    }
                                  }
                                }
                                if (null != this.field_i.field_q) {
                                  if (this.field_i.field_h.a((byte) -93, this.field_i.field_q, var26)) {
                                    l.a(2 + var6, var7 + 2, 4, 16711680);
                                    l.a(var6 + 2, 2 + var7, 5, 8388608);
                                    var17++;
                                    continue L12;
                                  } else {
                                    var17++;
                                    continue L12;
                                  }
                                } else {
                                  var17++;
                                  continue L12;
                                }
                              } else {
                                var17++;
                                continue L12;
                              }
                            } else {
                              var17++;
                              continue L12;
                            }
                          } else {
                            var17++;
                            continue L12;
                          }
                        } else {
                          var17++;
                          continue L12;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                if (null != this.field_i.field_F[var16]) {
                  L16: {
                    var7 = (int)(2.0 + (this.field_i.field_F[var16].field_p / 10.0 + (double)(var5 - -(5 * this.field_i.field_F[var16].field_m))));
                    var6 = (int)(2.0 + (this.field_i.field_F[var16].field_y / 10.0 + (double)(5 * this.field_i.field_F[var16].field_c + var4)));
                    var17 = 16776960;
                    if (eg.field_p == this.field_i.field_F[var16].field_x) {
                      break L16;
                    } else {
                      var17 = 14540032;
                      break L16;
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
            L17: while (true) {
              if (-1 + this.field_b <= var17) {
                var16++;
                continue L3;
              } else {
                var18 = 1;
                L18: while (true) {
                  if (var18 >= this.field_e - 1) {
                    var6 += 5;
                    var7 = var7 - 5 * (this.field_e + -2);
                    var17++;
                    continue L17;
                  } else {
                    var7 += 5;
                    var20 = this.a(120, var18, var16, var17);
                    if (var20 != null) {
                      L19: {
                        var19 = 0;
                        var21 = 0;
                        if (var20.field_b > -1) {
                          L20: {
                            var19 = var8;
                            if (1 != var16) {
                              break L20;
                            } else {
                              var19 = ((16711422 & var8) - -(var9 & 16711422)) / 2;
                              break L20;
                            }
                          }
                          L21: {
                            if ((var16 ^ -1) != -3) {
                              break L21;
                            } else {
                              var19 = var9;
                              break L21;
                            }
                          }
                          L22: {
                            if (var16 == 3) {
                              var19 = ((var9 & 16711422) + (16711422 & var10)) / 2;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          L23: {
                            if (var16 < 4) {
                              break L23;
                            } else {
                              var19 = var10;
                              break L23;
                            }
                          }
                          if ((param2 ^ -1) != -51) {
                            L24: {
                              if ((var20.field_b ^ -1) != 0) {
                                L25: {
                                  if (this.field_a != 2) {
                                    break L25;
                                  } else {
                                    L26: {
                                      var22 = this.field_b / 4;
                                      if (-12 != (this.field_i.field_G.field_Bb ^ -1)) {
                                        break L26;
                                      } else {
                                        var22 = 1 + this.field_b / 8;
                                        break L26;
                                      }
                                    }
                                    L27: {
                                      L28: {
                                        if (var17 < -var22 + this.field_b / 2) {
                                          break L28;
                                        } else {
                                          if (this.field_b / 2 + var22 < var17) {
                                            break L28;
                                          } else {
                                            if (-var22 + this.field_e / 2 > var18) {
                                              break L28;
                                            } else {
                                              if (var18 <= var22 + this.field_e / 2) {
                                                break L27;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var21 = 1;
                                      break L27;
                                    }
                                    if (var18 >= 3 + this.field_e / 2 + -var22) {
                                      break L25;
                                    } else {
                                      if (this.field_b / 2 - 1 > var17) {
                                        break L25;
                                      } else {
                                        if (var17 > 1 + this.field_b / 2) {
                                          break L25;
                                        } else {
                                          var21 = 1;
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                }
                                L29: {
                                  if ((this.field_a ^ -1) == -4) {
                                    if (this.field_b / 8 >= var17) {
                                      break L29;
                                    } else {
                                      if (var17 >= this.field_b * 7 / 8) {
                                        break L29;
                                      } else {
                                        if (var18 <= this.field_e / 8) {
                                          break L29;
                                        } else {
                                          if (7 * this.field_e / 8 > var18) {
                                            var21 = 1;
                                            break L29;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L29;
                                  }
                                }
                                L30: {
                                  if (this.field_a == 4) {
                                    break L30;
                                  } else {
                                    if ((this.field_a ^ -1) != -2) {
                                      break L24;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                L31: {
                                  if (-5 == (var20.field_b ^ -1)) {
                                    break L31;
                                  } else {
                                    if (5 != var20.field_b) {
                                      break L24;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                var21 = 1;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            L32: {
                              if (-4 < (this.field_i.field_h.field_f[var17][var18].field_v ^ -1)) {
                                break L32;
                              } else {
                                var21 = 1;
                                break L32;
                              }
                            }
                            var22_ref_dl = var20;
                            L33: while (true) {
                              if (null == var22_ref_dl.field_c) {
                                if (var22_ref_dl.field_d) {
                                  var21 = 1;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              } else {
                                var22_ref_dl = var22_ref_dl.field_c;
                                continue L33;
                              }
                            }
                          } else {
                            break L19;
                          }
                        } else {
                          break L19;
                        }
                      }
                      L34: {
                        if (-2 != (var20.field_v ^ -1)) {
                          break L34;
                        } else {
                          var19 = var13;
                          break L34;
                        }
                      }
                      L35: {
                        if (var20.field_v != 2) {
                          break L35;
                        } else {
                          var19 = var12;
                          break L35;
                        }
                      }
                      L36: {
                        if ((var20.field_v ^ -1) != -4) {
                          break L36;
                        } else {
                          var19 = var11;
                          break L36;
                        }
                      }
                      L37: {
                        L38: {
                          if (var20.field_d) {
                            break L38;
                          } else {
                            L39: {
                              if (-19 < (var20.field_j ^ -1)) {
                                break L39;
                              } else {
                                if (34 >= var20.field_j) {
                                  break L38;
                                } else {
                                  break L39;
                                }
                              }
                            }
                            if (5 != var20.field_b) {
                              break L37;
                            } else {
                              break L38;
                            }
                          }
                        }
                        var19 = var19 & 16711935;
                        break L37;
                      }
                      L40: {
                        if (eg.field_p != var16) {
                          break L40;
                        } else {
                          L41: {
                            if (var20.field_v != 4) {
                              break L41;
                            } else {
                              var19 = 16777215;
                              break L41;
                            }
                          }
                          L42: {
                            if (var20.field_v != 5) {
                              break L42;
                            } else {
                              var19 = 16777214;
                              break L42;
                            }
                          }
                          L43: {
                            if (null == var20.field_C) {
                              break L43;
                            } else {
                              if (-6 != (var20.field_C.field_v ^ -1)) {
                                break L43;
                              } else {
                                var19 = 16777215;
                                break L43;
                              }
                            }
                          }
                          if (null == var20.field_c) {
                            break L40;
                          } else {
                            if ((var20.field_c.field_v ^ -1) == -5) {
                              var19 = 16777214;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                        }
                      }
                      L44: {
                        if (var20.field_a) {
                          break L44;
                        } else {
                          if (var20.field_d) {
                            var19 = 65793;
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                      }
                      L45: {
                        if (var20.field_p <= 0) {
                          break L45;
                        } else {
                          var19 = 4 * var20.field_p;
                          break L45;
                        }
                      }
                      L46: {
                        if (!var20.field_w) {
                          stackOut_99_0 = 0;
                          stackIn_100_0 = stackOut_99_0;
                          break L46;
                        } else {
                          stackOut_98_0 = 1;
                          stackIn_100_0 = stackOut_98_0;
                          break L46;
                        }
                      }
                      L47: {
                        var22 = stackIn_100_0;
                        if (1 != this.field_m) {
                          break L47;
                        } else {
                          if (var16 != 0) {
                            break L47;
                          } else {
                            if (var20.field_d) {
                              break L47;
                            } else {
                              L48: {
                                if (Math.abs(-(this.field_b / 2) + var17) >= -5 + this.field_b / 2) {
                                  break L48;
                                } else {
                                  if (Math.abs(-(this.field_e / 2) + var18) >= -5 + this.field_e / 2) {
                                    break L48;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                              var22 = 1;
                              break L47;
                            }
                          }
                        }
                      }
                      L49: {
                        if ((this.field_m ^ -1) != -3) {
                          break L49;
                        } else {
                          if (-1 != (var16 ^ -1)) {
                            break L49;
                          } else {
                            L50: {
                              if (Math.abs(-(this.field_b / 2) + var17) >= -5 + this.field_b / 2) {
                                break L50;
                              } else {
                                if (Math.abs(-(this.field_e / 2) + var18) < this.field_e / 2 - 5) {
                                  break L49;
                                } else {
                                  break L50;
                                }
                              }
                            }
                            var22 = 1;
                            break L49;
                          }
                        }
                      }
                      L51: {
                        if (-4 != (this.field_m ^ -1)) {
                          break L51;
                        } else {
                          if (1 != var16) {
                            break L51;
                          } else {
                            if (12 <= var17) {
                              break L51;
                            } else {
                              if (-13 >= (var18 ^ -1)) {
                                break L51;
                              } else {
                                var22 = 1;
                                break L51;
                              }
                            }
                          }
                        }
                      }
                      L52: {
                        if (this.field_m == 4) {
                          if (var16 != 2) {
                            break L52;
                          } else {
                            if (var20.field_b != 5) {
                              var22 = 1;
                              break L52;
                            } else {
                              break L52;
                            }
                          }
                        } else {
                          break L52;
                        }
                      }
                      L53: {
                        if (var22 != 0) {
                          var19 = (int)(128.0 + 64.0 * Math.sin((double)(-var18) + (mm.field_f * 2.0 + (double)var17))) * 65793;
                          break L53;
                        } else {
                          break L53;
                        }
                      }
                      L54: {
                        if (-1 == (var19 ^ -1)) {
                          break L54;
                        } else {
                          L55: {
                            l.f(var6, var7, 5, 5, var19);
                            if (-16777216 == (var19 ^ -1)) {
                              l.c(var6, var7 + 2, var6 + 2, var7, 0);
                              l.c(var6, 3 + var7, var6 + 2, var7 + 1, 0);
                              l.c(4 + var6, 2 + var7, var6 + 2, var7, 0);
                              l.c(4 + var6, var7 - -3, var6 + 2, var7 + 1, 0);
                              break L55;
                            } else {
                              break L55;
                            }
                          }
                          L56: {
                            if (-16777215 == (var19 ^ -1)) {
                              l.c(var6, var7 + 1, var6 + 2, var7 + 3, 0);
                              l.c(var6, var7, var6 - -2, 2 + var7, 0);
                              l.c(var6 - -4, 1 + var7, var6 + 2, var7 - -3, 0);
                              l.c(var6 + 4, var7, var6 + 2, var7 - -2, 0);
                              break L56;
                            } else {
                              break L56;
                            }
                          }
                          l.f(var6 + 4, var7, 5, 2236962);
                          l.b(var6, 4 + var7, 4, 2236962);
                          break L54;
                        }
                      }
                      L57: {
                        if (var21 == 0) {
                          break L57;
                        } else {
                          l.c(var6, var7, -1 + (5 + var6), -1 + (var7 - -5), 16711680);
                          l.c(var6, 1 + var7, 5 + var6 + -2, 5 + var7 + -1, 16711680);
                          l.c(5 + (var6 - 1), var7, -1 + (var6 - -5), var7, 16711680);
                          break L57;
                        }
                      }
                      L58: {
                        if (var6 > this.field_i.field_y) {
                          break L58;
                        } else {
                          if (this.field_i.field_y >= 5 + var6) {
                            break L58;
                          } else {
                            if (var7 > this.field_i.field_j) {
                              break L58;
                            } else {
                              if (5 + var7 > this.field_i.field_j) {
                                uf.field_c = var17;
                                vf.field_a = var18;
                                break L58;
                              } else {
                                break L58;
                              }
                            }
                          }
                        }
                      }
                      L59: {
                        if (var20.field_a) {
                          break L59;
                        } else {
                          if (!var20.field_d) {
                            break L59;
                          } else {
                            var18++;
                            continue L18;
                          }
                        }
                      }
                      L60: {
                        if (4 != (var20.field_i & 4)) {
                          break L60;
                        } else {
                          l.g(var6 + 4, var7, 5, 16776960);
                          break L60;
                        }
                      }
                      L61: {
                        if ((var20.field_i & 8 ^ -1) == -9) {
                          l.d(var6, 4 + var7, 5, 16776960);
                          break L61;
                        } else {
                          break L61;
                        }
                      }
                      L62: {
                        if (-1 != var20.field_g) {
                          L63: {
                            var23 = var15;
                            if ((var20.field_e & 1 ^ -1) != -2) {
                              break L63;
                            } else {
                              var23 = var14;
                              break L63;
                            }
                          }
                          L64: {
                            if ((var20.field_i & 1) == 1) {
                              var23 = 16776960;
                              break L64;
                            } else {
                              break L64;
                            }
                          }
                          l.g(var6, var7, 5, var23);
                          l.g(-1 + var6, var7, 5, var23);
                          break L62;
                        } else {
                          break L62;
                        }
                      }
                      if (-1 != var20.field_k) {
                        L65: {
                          var23 = var15;
                          if ((var20.field_e & 2) == 2) {
                            var23 = var14;
                            break L65;
                          } else {
                            break L65;
                          }
                        }
                        L66: {
                          if ((2 & var20.field_i ^ -1) != -3) {
                            break L66;
                          } else {
                            var23 = 16776960;
                            break L66;
                          }
                        }
                        l.d(var6, var7 - 1, 5, var23);
                        l.d(var6, var7, 5, var23);
                        var18++;
                        continue L18;
                      } else {
                        var18++;
                        continue L18;
                      }
                    } else {
                      var18++;
                      continue L18;
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
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var10_ref_byte__ = null;
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
        RuntimeException stackIn_300_0 = null;
        StringBuilder stackIn_300_1 = null;
        RuntimeException stackIn_301_0 = null;
        StringBuilder stackIn_301_1 = null;
        RuntimeException stackIn_302_0 = null;
        StringBuilder stackIn_302_1 = null;
        String stackIn_302_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        RuntimeException stackOut_299_0 = null;
        StringBuilder stackOut_299_1 = null;
        RuntimeException stackOut_301_0 = null;
        StringBuilder stackOut_301_1 = null;
        String stackOut_301_2 = null;
        RuntimeException stackOut_300_0 = null;
        StringBuilder stackOut_300_1 = null;
        String stackOut_300_2 = null;
        this.field_k = 0;
        try {
          L0: {
            L1: {
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
                var6 = param0.field_G.field_Bb;
                if ((var6 ^ -1) == -1) {
                  this.field_k = 1;
                  this.field_a = 0;
                  this.field_b = 40;
                  this.field_e = 40;
                  break L1;
                } else {
                  if (1 == var6) {
                    this.field_k = 2;
                    this.field_e = 64;
                    this.field_b = 64;
                    this.field_a = 2;
                    break L1;
                  } else {
                    if ((var6 ^ -1) == -3) {
                      var2_int = 4;
                      this.field_k = 3;
                      this.field_a = 3;
                      this.field_e = 64;
                      this.field_b = 64;
                      break L1;
                    } else {
                      if (3 == var6) {
                        L2: {
                          this.field_b = 64;
                          this.field_a = 3;
                          this.field_e = 64;
                          stackOut_22_0 = this;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_23_0 = stackOut_22_0;
                          if ((param0.field_G.field_ub ^ -1) == -2) {
                            stackOut_24_0 = this;
                            stackOut_24_1 = 4;
                            stackIn_25_0 = stackOut_24_0;
                            stackIn_25_1 = stackOut_24_1;
                            break L2;
                          } else {
                            stackOut_23_0 = this;
                            stackOut_23_1 = 5;
                            stackIn_25_0 = stackOut_23_0;
                            stackIn_25_1 = stackOut_23_1;
                            break L2;
                          }
                        }
                        ((dk) (this)).field_k = stackIn_25_1;
                        var2_int = 4;
                        break L1;
                      } else {
                        if (4 == var6) {
                          var3 = 10;
                          this.field_a = 3;
                          var4 = 1;
                          this.field_e = 64;
                          this.field_b = 64;
                          break L1;
                        } else {
                          if ((var6 ^ -1) == -6) {
                            L3: {
                              stackOut_27_0 = this;
                              stackIn_29_0 = stackOut_27_0;
                              stackIn_28_0 = stackOut_27_0;
                              if (-2 != (param0.field_G.field_ub ^ -1)) {
                                stackOut_29_0 = this;
                                stackOut_29_1 = 4;
                                stackIn_30_0 = stackOut_29_0;
                                stackIn_30_1 = stackOut_29_1;
                                break L3;
                              } else {
                                stackOut_28_0 = this;
                                stackOut_28_1 = 5;
                                stackIn_30_0 = stackOut_28_0;
                                stackIn_30_1 = stackOut_28_1;
                                break L3;
                              }
                            }
                            ((dk) (this)).field_k = stackIn_30_1;
                            this.field_a = 2;
                            var4 = 1;
                            this.field_b = 64;
                            this.field_e = 64;
                            break L1;
                          } else {
                            if ((var6 ^ -1) == -7) {
                              var4 = 2;
                              this.field_a = 1;
                              var3 = 15;
                              this.field_b = 64;
                              this.field_e = 64;
                              break L1;
                            } else {
                              if (7 == var6) {
                                this.field_a = 2;
                                this.field_k = 3;
                                this.field_e = 64;
                                this.field_b = 64;
                                var4 = 2;
                                break L1;
                              } else {
                                if (8 == var6) {
                                  this.field_b = 64;
                                  this.field_e = 64;
                                  if (-2 == (param0.field_G.field_vb ^ -1)) {
                                    this.field_k = 6;
                                    this.field_b = 62;
                                    this.field_e = 62;
                                    this.field_a = 4;
                                    break L1;
                                  } else {
                                    this.field_a = 1;
                                    var4 = 3;
                                    break L1;
                                  }
                                } else {
                                  if (var6 == 9) {
                                    L4: {
                                      var4 = 4;
                                      this.field_b = 64;
                                      this.field_a = 2;
                                      stackOut_36_0 = this;
                                      stackIn_38_0 = stackOut_36_0;
                                      stackIn_37_0 = stackOut_36_0;
                                      if (1 == param0.field_G.field_ub) {
                                        stackOut_38_0 = this;
                                        stackOut_38_1 = 4;
                                        stackIn_39_0 = stackOut_38_0;
                                        stackIn_39_1 = stackOut_38_1;
                                        break L4;
                                      } else {
                                        stackOut_37_0 = this;
                                        stackOut_37_1 = 5;
                                        stackIn_39_0 = stackOut_37_0;
                                        stackIn_39_1 = stackOut_37_1;
                                        break L4;
                                      }
                                    }
                                    ((dk) (this)).field_k = stackIn_39_1;
                                    this.field_e = 64;
                                    break L1;
                                  } else {
                                    if ((var6 ^ -1) == -11) {
                                      this.field_b = 64;
                                      this.field_e = 64;
                                      if ((param0.field_G.field_vb ^ -1) == -2) {
                                        this.field_a = 4;
                                        var4 = 3;
                                        break L1;
                                      } else {
                                        this.field_k = 6;
                                        this.field_e = 62;
                                        this.field_a = 1;
                                        this.field_b = 62;
                                        break L1;
                                      }
                                    } else {
                                      if (var6 == 11) {
                                        this.field_e = 64;
                                        this.field_k = 7;
                                        this.field_b = 64;
                                        this.field_a = 2;
                                        break L1;
                                      } else {
                                        if (var6 == 12) {
                                          this.field_b = 38;
                                          this.field_e = 38;
                                          this.field_k = 8;
                                          this.field_a = 4;
                                          break L1;
                                        } else {
                                          if (-14 == (var6 ^ -1)) {
                                            this.field_k = 9;
                                            this.field_e = 62;
                                            this.field_a = 0;
                                            this.field_b = 62;
                                            break L1;
                                          } else {
                                            break L1;
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
              } else {
                this.field_b = 64;
                this.field_e = 64;
                this.field_a = 3;
                var2_int = 4;
                var5 = 1;
                if (!mb.b(0, 77)) {
                  break L1;
                } else {
                  this.field_a = 2;
                  break L1;
                }
              }
            }
            this.field_d = new int[this.field_b][this.field_e];
            this.field_g = new int[this.field_b][this.field_e];
            this.field_f = new dl[this.field_b][this.field_e];
            var6 = 0;
            L5: while (true) {
              if (var6 >= this.field_b) {
                L6: {
                  L7: {
                    if (0 != this.field_k) {
                      break L7;
                    } else {
                      if ((var4 ^ -1) == -1) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if ((this.field_k ^ -1) == -7) {
                        break L9;
                      } else {
                        if (9 != this.field_k) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      var6 = (int)(Math.random() * 3.0) - 1;
                      var7 = -1 + (int)(3.0 * Math.random());
                      var8 = (int)(Math.random() * 5.0) - 2;
                      var9 = -2 + (int)(Math.random() * 5.0);
                      if (var6 != var8) {
                        break L10;
                      } else {
                        if (var7 != var9) {
                          break L10;
                        } else {
                          var9--;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if ((Math.abs(var8) ^ -1) != -3) {
                        break L11;
                      } else {
                        if (Math.abs(var9) != 2) {
                          break L11;
                        } else {
                          if (100.0 * Math.random() >= 50.0) {
                            var9 = 0;
                            break L11;
                          } else {
                            var8 = 0;
                            break L11;
                          }
                        }
                      }
                    }
                    L12: {
                      if (-10 != (this.field_k ^ -1)) {
                        break L12;
                      } else {
                        var6 = -1;
                        var9 = 1;
                        var8 = 1;
                        var7 = -1;
                        break L12;
                      }
                    }
                    L13: {
                      if ((Math.abs(var6) ^ -1) != -3) {
                        break L13;
                      } else {
                        if ((Math.abs(var7) ^ -1) != -3) {
                          break L13;
                        } else {
                          var6 = 0;
                          break L13;
                        }
                      }
                    }
                    var13 = -2;
                    L14: while (true) {
                      if (var13 > 2) {
                        var13 = 0;
                        L15: while (true) {
                          if ((var13 ^ -1) <= (this.field_b ^ -1)) {
                            var13 = 0;
                            L16: while (true) {
                              if (var13 >= this.field_e) {
                                break L8;
                              } else {
                                L17: {
                                  if (-35 == (this.field_f[1][var13].field_j ^ -1)) {
                                    break L17;
                                  } else {
                                    this.field_f[2][var13].field_g = -1;
                                    break L17;
                                  }
                                }
                                var13++;
                                continue L16;
                              }
                            }
                          } else {
                            L18: {
                              if (34 == this.field_f[var13][1].field_j) {
                                break L18;
                              } else {
                                this.field_f[var13][2].field_k = -1;
                                break L18;
                              }
                            }
                            var13++;
                            continue L15;
                          }
                        }
                      } else {
                        var14 = -2;
                        L19: while (true) {
                          if (var14 > 2) {
                            var13++;
                            continue L14;
                          } else {
                            L20: {
                              var10_ref_byte__ = of.field_k[wf.a("AB-Corridors", true)];
                              var15 = (int)(6.0 * Math.random());
                              if (-2 != (var15 ^ -1)) {
                                break L20;
                              } else {
                                var10_ref_byte__ = of.field_k[wf.a("AB-Room0", true)];
                                break L20;
                              }
                            }
                            L21: {
                              if (-3 != (var15 ^ -1)) {
                                break L21;
                              } else {
                                var10_ref_byte__ = of.field_k[wf.a("AB-Room1", true)];
                                break L21;
                              }
                            }
                            L22: {
                              if (-4 != (var15 ^ -1)) {
                                break L22;
                              } else {
                                var10_ref_byte__ = of.field_k[wf.a("AB-Room2", true)];
                                break L22;
                              }
                            }
                            L23: {
                              if (-5 != (var15 ^ -1)) {
                                break L23;
                              } else {
                                var10_ref_byte__ = of.field_k[wf.a("AB-Room3", true)];
                                break L23;
                              }
                            }
                            L24: {
                              if (-6 != (var15 ^ -1)) {
                                break L24;
                              } else {
                                var10_ref_byte__ = of.field_k[wf.a("AB-Room4", true)];
                                break L24;
                              }
                            }
                            L25: {
                              if ((var6 ^ -1) != (var13 ^ -1)) {
                                break L25;
                              } else {
                                if ((var14 ^ -1) != (var7 ^ -1)) {
                                  break L25;
                                } else {
                                  if (6 != this.field_k) {
                                    break L25;
                                  } else {
                                    var10_ref_byte__ = of.field_k[wf.a("AB-CommandCenter", true)];
                                    break L25;
                                  }
                                }
                              }
                            }
                            L26: {
                              if ((var13 ^ -1) != (var8 ^ -1)) {
                                break L26;
                              } else {
                                if ((var14 ^ -1) != (var9 ^ -1)) {
                                  break L26;
                                } else {
                                  var10_ref_byte__ = of.field_k[wf.a("AB-Entrance", true)];
                                  break L26;
                                }
                              }
                            }
                            L27: {
                              if ((var13 ^ -1) != (var6 ^ -1)) {
                                break L27;
                              } else {
                                if ((var14 ^ -1) != (var7 ^ -1)) {
                                  break L27;
                                } else {
                                  if ((this.field_k ^ -1) != -10) {
                                    break L27;
                                  } else {
                                    var10_ref_byte__ = of.field_k[wf.a("AB-Reactor", true)];
                                    break L27;
                                  }
                                }
                              }
                            }
                            L28: {
                              if (-3 != (var13 ^ -1)) {
                                break L28;
                              } else {
                                if (-3 != (var14 ^ -1)) {
                                  break L28;
                                } else {
                                  if (-10 != (this.field_k ^ -1)) {
                                    break L28;
                                  } else {
                                    var10_ref_byte__ = of.field_k[wf.a("AB-Hangerdoor", true)];
                                    break L28;
                                  }
                                }
                              }
                            }
                            L29: {
                              if (-3 != (var13 ^ -1)) {
                                break L29;
                              } else {
                                if ((var14 ^ -1) != -3) {
                                  break L29;
                                } else {
                                  if ((this.field_k ^ -1) != -7) {
                                    break L29;
                                  } else {
                                    var10_ref_byte__ = of.field_k[wf.a("AB-Maindoor", true)];
                                    break L29;
                                  }
                                }
                              }
                            }
                            L30: {
                              L31: {
                                var11 = this.field_b / 2 + 12 * var13;
                                var12 = this.field_b / 2 - -(var14 * 12);
                                if (9 != this.field_k) {
                                  break L31;
                                } else {
                                  L32: {
                                    if ((var13 ^ -1) != -1) {
                                      break L32;
                                    } else {
                                      if (-1 == (var14 ^ -1)) {
                                        break L30;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  L33: {
                                    if (var13 != 0) {
                                      break L33;
                                    } else {
                                      if (-1 == var14) {
                                        break L30;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                  if (0 != (var13 ^ -1)) {
                                    break L31;
                                  } else {
                                    if ((var14 ^ -1) == -1) {
                                      break L30;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                              }
                              L34: {
                                if (9 != this.field_k) {
                                  break L34;
                                } else {
                                  if (var6 != var13) {
                                    break L34;
                                  } else {
                                    if (var7 != var14) {
                                      break L34;
                                    } else {
                                      var11 = var11 + var10_ref_byte__[0] / 4;
                                      var12 = var12 + var10_ref_byte__[1] / 4;
                                      break L34;
                                    }
                                  }
                                }
                              }
                              this.a(-(var10_ref_byte__[0] / 2) + var11, (byte) 104, -(var10_ref_byte__[1] / 2) + var12, var10_ref_byte__);
                              break L30;
                            }
                            var14++;
                            continue L19;
                          }
                        }
                      }
                    }
                  }
                  L35: {
                    if (8 != this.field_k) {
                      break L35;
                    } else {
                      var6 = (int)(Math.random() * 3.0) + -1;
                      var7 = -var6;
                      var8 = -1;
                      var9 = -1;
                      var13 = -1;
                      L36: while (true) {
                        if (var13 > 1) {
                          break L35;
                        } else {
                          var14 = -1;
                          L37: while (true) {
                            if (-2 > (var14 ^ -1)) {
                              var13++;
                              continue L36;
                            } else {
                              L38: {
                                var10_ref_byte__ = of.field_k[wf.a("AB-Corridors", true)];
                                var15 = (int)(6.0 * Math.random());
                                if ((var15 ^ -1) != -2) {
                                  break L38;
                                } else {
                                  var10_ref_byte__ = of.field_k[wf.a("AB-Room0", true)];
                                  break L38;
                                }
                              }
                              L39: {
                                if (-3 != (var15 ^ -1)) {
                                  break L39;
                                } else {
                                  var10_ref_byte__ = of.field_k[wf.a("AB-Room1", true)];
                                  break L39;
                                }
                              }
                              L40: {
                                if (3 != var15) {
                                  break L40;
                                } else {
                                  var10_ref_byte__ = of.field_k[wf.a("AB-Room2", true)];
                                  break L40;
                                }
                              }
                              L41: {
                                if (4 != var15) {
                                  break L41;
                                } else {
                                  var10_ref_byte__ = of.field_k[wf.a("AB-Room3", true)];
                                  break L41;
                                }
                              }
                              L42: {
                                if (var15 != 5) {
                                  break L42;
                                } else {
                                  var10_ref_byte__ = of.field_k[wf.a("AB-Room4", true)];
                                  break L42;
                                }
                              }
                              L43: {
                                if (var13 != var8) {
                                  break L43;
                                } else {
                                  if ((var9 ^ -1) != (var14 ^ -1)) {
                                    break L43;
                                  } else {
                                    var10_ref_byte__ = of.field_k[wf.a("AB-Hanger", true)];
                                    break L43;
                                  }
                                }
                              }
                              L44: {
                                if (var13 != var6) {
                                  break L44;
                                } else {
                                  if (var7 != var14) {
                                    break L44;
                                  } else {
                                    var10_ref_byte__ = of.field_k[wf.a("AB-Entrance", true)];
                                    break L44;
                                  }
                                }
                              }
                              L45: {
                                if (-2 != (var13 ^ -1)) {
                                  break L45;
                                } else {
                                  if (var14 != 1) {
                                    break L45;
                                  } else {
                                    var10_ref_byte__ = of.field_k[wf.a("AB-Maindoor", true)];
                                    break L45;
                                  }
                                }
                              }
                              L46: {
                                if (8 != this.field_k) {
                                  break L46;
                                } else {
                                  if ((var13 ^ -1) != (var8 ^ -1)) {
                                    break L46;
                                  } else {
                                    if (var9 == var14) {
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              var12 = var14 * 12 + this.field_b / 2;
                              var11 = var13 * 12 + this.field_b / 2;
                              this.a(var11 + -(var10_ref_byte__[0] / 2), (byte) 104, -(var10_ref_byte__[1] / 2) + var12, var10_ref_byte__);
                              var14++;
                              continue L37;
                            }
                          }
                        }
                      }
                    }
                  }
                  L47: {
                    if (this.field_k != 7) {
                      break L47;
                    } else {
                      var23 = of.field_k[wf.a("MissileBase", true)];
                      var7 = this.field_b / 2;
                      var8 = this.field_e / 2;
                      this.a(var7 - var23[0] / 2, (byte) 104, -(var23[1] / 2) + var8, var23);
                      break L47;
                    }
                  }
                  L48: {
                    if (-2 != (var4 ^ -1)) {
                      break L48;
                    } else {
                      if (this.field_k != 0) {
                        break L48;
                      } else {
                        var6 = 0;
                        L49: while (true) {
                          if ((this.field_b ^ -1) >= (var6 ^ -1)) {
                            break L48;
                          } else {
                            var7 = 0;
                            L50: while (true) {
                              if (this.field_e <= var7) {
                                var6++;
                                continue L49;
                              } else {
                                L51: {
                                  var8 = var6 - this.field_b / 2;
                                  var9 = var7 + -(this.field_b / 2);
                                  var10 = (int)Math.sqrt((double)(var9 * var9 + var8 * var8));
                                  if (-5 >= (var10 ^ -1)) {
                                    break L51;
                                  } else {
                                    this.field_f[var6][var7].field_B = true;
                                    this.field_f[var6][var7].field_b = 1;
                                    break L51;
                                  }
                                }
                                var7++;
                                continue L50;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L52: {
                    if ((var4 ^ -1) != -3) {
                      break L52;
                    } else {
                      if (this.field_k != 0) {
                        break L52;
                      } else {
                        var6 = 0;
                        L53: while (true) {
                          if ((var6 ^ -1) <= (this.field_b ^ -1)) {
                            break L52;
                          } else {
                            var7 = 0;
                            L54: while (true) {
                              if ((var7 ^ -1) <= (this.field_e ^ -1)) {
                                var6++;
                                continue L53;
                              } else {
                                L55: {
                                  var8 = var6 - this.field_b / 2;
                                  var9 = -(this.field_b / 2) + var7;
                                  var10 = (int)Math.sqrt((double)(var8 * var8 - -(var9 * var9)));
                                  if ((var10 ^ -1) <= -8) {
                                    break L55;
                                  } else {
                                    this.field_f[var6][var7].field_B = true;
                                    this.field_f[var6][var7].field_b = 1;
                                    break L55;
                                  }
                                }
                                var7++;
                                continue L54;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L56: {
                    if (var4 != 3) {
                      break L56;
                    } else {
                      if ((this.field_k ^ -1) != -1) {
                        break L56;
                      } else {
                        var6 = 0;
                        L57: while (true) {
                          if ((var6 ^ -1) <= (this.field_b ^ -1)) {
                            break L56;
                          } else {
                            var7 = 0;
                            L58: while (true) {
                              if ((this.field_e ^ -1) >= (var7 ^ -1)) {
                                var6++;
                                continue L57;
                              } else {
                                L59: {
                                  var8 = var6 + -(this.field_b / 2);
                                  var9 = var7 - this.field_b / 2;
                                  var10 = (int)Math.sqrt((double)(var9 * var9 + var8 * var8));
                                  if ((var10 ^ -1) <= -9) {
                                    break L59;
                                  } else {
                                    this.field_f[var6][var7].field_B = true;
                                    this.field_f[var6][var7].field_b = 1;
                                    break L59;
                                  }
                                }
                                var7++;
                                continue L58;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (-2 != (this.field_k ^ -1)) {
                    break L6;
                  } else {
                    var24 = of.field_k[wf.a("Tutorial", true)];
                    this.a(0, (byte) 104, 0, var24);
                    break L6;
                  }
                }
                L60: {
                  var6 = 0;
                  var7 = 0;
                  var8 = 0;
                  var9 = 0;
                  var10 = 0;
                  var11 = 0;
                  if (this.field_k != 2) {
                    break L60;
                  } else {
                    var10 = 1;
                    break L60;
                  }
                }
                L61: {
                  if (this.field_k != 3) {
                    break L61;
                  } else {
                    var7 = 1;
                    var11 = 2;
                    var8 = 1;
                    break L61;
                  }
                }
                L62: {
                  if (4 != this.field_k) {
                    break L62;
                  } else {
                    var6 = 1;
                    var7 = 1;
                    var11 = 5;
                    break L62;
                  }
                }
                L63: {
                  if (this.field_k != 5) {
                    break L63;
                  } else {
                    var7 = 1;
                    var9 = 1;
                    var11 = 3;
                    break L63;
                  }
                }
                L64: while (true) {
                  var13 = 0;
                  L65: while (true) {
                    if (this.field_b <= var13) {
                      L66: {
                        var12 = 1;
                        var13_ref = null;
                        if (var12 == 0) {
                          break L66;
                        } else {
                          if (var6 == 0) {
                            break L66;
                          } else {
                            var12 = 0;
                            var13_ref = of.field_k[wf.a("Hanger", true)];
                            var6 = 0;
                            if ((param0.field_G.field_Bb ^ -1) != -4) {
                              break L66;
                            } else {
                              var13_ref = of.field_k[wf.a("AlienHanger", true)];
                              break L66;
                            }
                          }
                        }
                      }
                      L67: {
                        if (var12 == 0) {
                          break L67;
                        } else {
                          if (var8 == 0) {
                            break L67;
                          } else {
                            var8 = 0;
                            var13_ref = of.field_k[wf.a("ResearchBase", true)];
                            var12 = 0;
                            break L67;
                          }
                        }
                      }
                      L68: {
                        if (var12 == 0) {
                          break L68;
                        } else {
                          if (var9 == 0) {
                            break L68;
                          } else {
                            var13_ref = of.field_k[wf.a("FactoryBase", true)];
                            var9 = 0;
                            var12 = 0;
                            if (param0.field_G.field_Bb != 3) {
                              break L68;
                            } else {
                              var13_ref = of.field_k[wf.a("AlienFactoryBase", true)];
                              break L68;
                            }
                          }
                        }
                      }
                      L69: {
                        if (var12 == 0) {
                          break L69;
                        } else {
                          if (var7 == 0) {
                            break L69;
                          } else {
                            var12 = 0;
                            var13_ref = of.field_k[wf.a("Helepad", true)];
                            var7 = 0;
                            break L69;
                          }
                        }
                      }
                      L70: {
                        if (var12 == 0) {
                          break L70;
                        } else {
                          if (var10 <= 0) {
                            break L70;
                          } else {
                            var12 = 0;
                            var10--;
                            var13_ref = of.field_k[wf.a("Barracks", true)];
                            break L70;
                          }
                        }
                      }
                      L71: {
                        if (var12 == 0) {
                          break L71;
                        } else {
                          if (-1 <= (var11 ^ -1)) {
                            break L71;
                          } else {
                            var11--;
                            var12 = 0;
                            var13_ref = of.field_k[wf.a("FuelDump", true)];
                            break L71;
                          }
                        }
                      }
                      L72: {
                        var14 = 0;
                        if (var12 == 0) {
                          break L72;
                        } else {
                          if (var4 == 0) {
                            break L72;
                          } else {
                            if (0 == this.field_k) {
                              break L72;
                            } else {
                              L73: {
                                var14 = 1;
                                var12 = 0;
                                if ((var4 ^ -1) != -2) {
                                  break L73;
                                } else {
                                  var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                                  break L73;
                                }
                              }
                              L74: {
                                if (var4 != 2) {
                                  break L74;
                                } else {
                                  var13_ref = of.field_k[wf.a("UFO-Invader", true)];
                                  break L74;
                                }
                              }
                              L75: {
                                if ((var4 ^ -1) != -4) {
                                  break L75;
                                } else {
                                  var13_ref = of.field_k[wf.a("UFO-Dominator", true)];
                                  break L75;
                                }
                              }
                              L76: {
                                if (3 < var4) {
                                  break L76;
                                } else {
                                  var4 = 0;
                                  break L76;
                                }
                              }
                              L77: {
                                if (5 != var4) {
                                  break L77;
                                } else {
                                  var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                                  var4 = 1;
                                  break L77;
                                }
                              }
                              if (4 != var4) {
                                break L72;
                              } else {
                                var4 = 5;
                                var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                                break L72;
                              }
                            }
                          }
                        }
                      }
                      L78: {
                        if (var13_ref == null) {
                          break L78;
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L79: while (true) {
                            L80: {
                              var18++;
                              if (-11 <= (var18 ^ -1)) {
                                break L80;
                              } else {
                                var17++;
                                var18 = 0;
                                break L80;
                              }
                            }
                            L81: {
                              if (var17 <= this.field_b / 2) {
                                break L81;
                              } else {
                                var17 = this.field_b / 2;
                                break L81;
                              }
                            }
                            L82: {
                              var15 = (int)(2.0 * (Math.random() * (double)var17)) + -var17 - -(this.field_b / 2);
                              var16 = (int)(2.0 * ((double)var17 * Math.random())) - (var17 + -(this.field_e / 2));
                              if (var4 == 0) {
                                break L82;
                              } else {
                                if (var14 != 0) {
                                  break L82;
                                } else {
                                  L83: {
                                    var15 = var15 - (-(((byte[]) (var13_ref))[0] / 2) + (this.field_b / 4 - var17 / 2));
                                    var16 = var16 - (-(((byte[]) (var13_ref))[1] / 2) + -(var17 / 2) + this.field_b / 4);
                                    if (var15 >= 1 + ((byte[]) (var13_ref))[0] / 2) {
                                      break L83;
                                    } else {
                                      var15 = 1 + ((byte[]) (var13_ref))[0] / 2;
                                      break L83;
                                    }
                                  }
                                  if (1 + ((byte[]) (var13_ref))[1] / 2 <= var16) {
                                    break L82;
                                  } else {
                                    var16 = ((byte[]) (var13_ref))[1] / 2 + 1;
                                    break L82;
                                  }
                                }
                              }
                            }
                            if ((((byte[]) (var13_ref))[0] - -1 ^ -1) < (this.field_f[((byte[]) (var13_ref))[0] / 2 + var15][var16 + ((byte[]) (var13_ref))[1] / 2].field_x ^ -1)) {
                              continue L79;
                            } else {
                              this.a(-(((byte[]) (var13_ref))[0] / 2) + var15, (byte) 104, -(((byte[]) (var13_ref))[1] / 2) + var16, (byte[]) (var13_ref));
                              break L78;
                            }
                          }
                        }
                      }
                      if (var12 == 0) {
                        continue L64;
                      } else {
                        L84: {
                          if (1 == this.field_k) {
                            this.a(1);
                            break L84;
                          } else {
                            if (var5 == 0) {
                              this.a(1);
                              break L84;
                            } else {
                              this.a((byte) -106);
                              break L84;
                            }
                          }
                        }
                        var13 = 0;
                        L85: while (true) {
                          if (var3 + var2_int <= var13) {
                            L86: {
                              if (var4 != 1) {
                                break L86;
                              } else {
                                var25 = of.field_k[wf.a("UFO-Transport", true)];
                                this.a(this.field_b / 2 - var25[0] / 2, (byte) 104, this.field_e / 2 + -(var25[1] / 2), var25);
                                break L86;
                              }
                            }
                            L87: {
                              if (-3 != (var4 ^ -1)) {
                                break L87;
                              } else {
                                var26 = of.field_k[wf.a("UFO-Invader", true)];
                                this.a(this.field_b / 2 + -(var26[0] / 2), (byte) 104, this.field_e / 2 - var26[1] / 2, var26);
                                break L87;
                              }
                            }
                            L88: {
                              if (3 != var4) {
                                break L88;
                              } else {
                                var27 = of.field_k[wf.a("UFO-Dominator", true)];
                                this.a(this.field_b / 2 - var27[0] / 2, (byte) 104, this.field_e / 2 - var27[1] / 2, var27);
                                break L88;
                              }
                            }
                            var13 = 0;
                            L89: while (true) {
                              if (var13 >= this.field_b) {
                                break L0;
                              } else {
                                var14 = 0;
                                L90: while (true) {
                                  if (var14 >= this.field_e) {
                                    var13++;
                                    continue L89;
                                  } else {
                                    L91: {
                                      this.field_f[var13][var14].a(0);
                                      if (param0.field_G.field_Bb != 1) {
                                        break L91;
                                      } else {
                                        this.field_f[var13][var14].field_z = true;
                                        break L91;
                                      }
                                    }
                                    var14++;
                                    continue L90;
                                  }
                                }
                              }
                            }
                          } else {
                            L92: {
                              var14 = 4 + (int)(6.0 * Math.random());
                              var14 = var14 * var14;
                              var15 = (int)(Math.random() * (double)this.field_b);
                              var16 = (int)(Math.random() * (double)this.field_e);
                              if ((var2_int ^ -1) < (var13 ^ -1)) {
                                break L92;
                              } else {
                                var15 = (int)(Math.random() * (double)this.field_b / 2.0) + this.field_b / 4;
                                var16 = (int)(Math.random() * (double)this.field_e / 2.0) + this.field_e / 4;
                                break L92;
                              }
                            }
                            var20 = 0;
                            L93: while (true) {
                              if ((var20 ^ -1) <= (this.field_b ^ -1)) {
                                var13++;
                                continue L85;
                              } else {
                                var21 = 0;
                                L94: while (true) {
                                  if ((var21 ^ -1) <= (this.field_e ^ -1)) {
                                    var20++;
                                    continue L93;
                                  } else {
                                    L95: {
                                      var18 = -var21 + var16;
                                      var17 = -var20 + var15;
                                      var19 = var17 * var17 - -(var18 * var18);
                                      if ((var19 ^ -1) < (var14 ^ -1)) {
                                        break L95;
                                      } else {
                                        if ((double)var14 * Math.random() <= (double)var19) {
                                          break L95;
                                        } else {
                                          this.field_f[var20][var21].a(false);
                                          break L95;
                                        }
                                      }
                                    }
                                    var21++;
                                    continue L94;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var14 = 0;
                      L96: while (true) {
                        if ((this.field_e ^ -1) >= (var14 ^ -1)) {
                          var13++;
                          continue L65;
                        } else {
                          L97: {
                            L98: {
                              if (var13 == 0) {
                                break L98;
                              } else {
                                if (var14 == 0) {
                                  break L98;
                                } else {
                                  L99: {
                                    var15 = 32;
                                    if ((var15 ^ -1) >= (this.field_f[var13 + -1][var14].field_x ^ -1)) {
                                      break L99;
                                    } else {
                                      var15 = this.field_f[var13 - 1][var14].field_x;
                                      break L99;
                                    }
                                  }
                                  L100: {
                                    if (var15 <= this.field_f[var13][-1 + var14].field_x) {
                                      break L100;
                                    } else {
                                      var15 = this.field_f[var13][-1 + var14].field_x;
                                      break L100;
                                    }
                                  }
                                  L101: {
                                    if ((this.field_f[var13 - 1][-1 + var14].field_x ^ -1) <= (var15 ^ -1)) {
                                      break L101;
                                    } else {
                                      var15 = this.field_f[-1 + var13][var14 - 1].field_x;
                                      break L101;
                                    }
                                  }
                                  this.field_f[var13][var14].field_x = 1 + var15;
                                  break L97;
                                }
                              }
                            }
                            this.field_f[var13][var14].field_x = 1;
                            break L97;
                          }
                          L102: {
                            if (!this.field_f[var13][var14].field_B) {
                              break L102;
                            } else {
                              this.field_f[var13][var14].field_x = 0;
                              break L102;
                            }
                          }
                          var14++;
                          continue L96;
                        }
                      }
                    }
                  }
                }
              } else {
                var7 = 0;
                L103: while (true) {
                  if (var7 >= this.field_e) {
                    var6++;
                    continue L5;
                  } else {
                    this.field_f[var6][var7] = new dl(var6, var7, 0, (dk) (this));
                    var7++;
                    continue L103;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L104: {
            var2 = decompiledCaughtException;
            stackOut_299_0 = (RuntimeException) (var2);
            stackOut_299_1 = new StringBuilder().append("dk.<init>(");
            stackIn_301_0 = stackOut_299_0;
            stackIn_301_1 = stackOut_299_1;
            stackIn_300_0 = stackOut_299_0;
            stackIn_300_1 = stackOut_299_1;
            if (param0 == null) {
              stackOut_301_0 = (RuntimeException) ((Object) stackIn_301_0);
              stackOut_301_1 = (StringBuilder) ((Object) stackIn_301_1);
              stackOut_301_2 = "null";
              stackIn_302_0 = stackOut_301_0;
              stackIn_302_1 = stackOut_301_1;
              stackIn_302_2 = stackOut_301_2;
              break L104;
            } else {
              stackOut_300_0 = (RuntimeException) ((Object) stackIn_300_0);
              stackOut_300_1 = (StringBuilder) ((Object) stackIn_300_1);
              stackOut_300_2 = "{...}";
              stackIn_302_0 = stackOut_300_0;
              stackIn_302_1 = stackOut_300_1;
              stackIn_302_2 = stackOut_300_2;
              break L104;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_302_0), stackIn_302_2 + ')');
        }
    }

    static {
        field_h = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_j = new int[256];
        field_c = new int[128];
    }
}
