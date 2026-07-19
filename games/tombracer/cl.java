/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends ci {
    static boolean field_o;
    private int field_m;
    private int field_n;

    public cl() {
        super(1, false);
        this.field_m = 1;
        this.field_n = 1;
    }

    final int[] c(int param0, int param1) {
        int[] discarded$1 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int[][] var17 = null;
        int[] var18 = null;
        int[][] var19 = null;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_52_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_20_0 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var15 = this.field_i.a((byte) -123, param1);
          var3 = var15;
          if (this.field_i.field_d) {
            var4 = this.field_m + (this.field_m + 1);
            var5 = 65536 / var4;
            var6 = this.field_n + (this.field_n - -1);
            var7 = 65536 / var6;
            var19 = new int[var4][];
            var17 = var19;
            var8 = var17;
            var9 = param1 + -this.field_m;
            L0: while (true) {
              L1: {
                L2: {
                  if (var9 > this.field_m + param1) {
                    break L2;
                  } else {
                    var10_ref_int__ = this.c(0, -98, hba.field_b & var9);
                    var18 = new int[ns.field_g];
                    var16 = var18;
                    var11_ref_int__ = var16;
                    var12 = 0;
                    stackOut_37_0 = -this.field_n;
                    stackIn_52_0 = stackOut_37_0;
                    stackIn_38_0 = stackOut_37_0;
                    if (var14 != 0) {
                      break L1;
                    } else {
                      var13 = stackIn_38_0;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (var13 > this.field_n) {
                              break L5;
                            } else {
                              var12 = var12 + var10_ref_int__[var13 & una.field_b];
                              var13++;
                              if (var14 != 0) {
                                break L4;
                              } else {
                                if (var14 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var13 = 0;
                          break L4;
                        }
                        L6: while (true) {
                          L7: {
                            if (var13 >= ns.field_g) {
                              var8[-param1 + (var9 + this.field_m)] = var18;
                              var9++;
                              break L7;
                            } else {
                              var11_ref_int__[var13] = var7 * var12 >> -1887913936;
                              var12 = var12 - var10_ref_int__[una.field_b & -this.field_n + var13];
                              var13++;
                              var12 = var12 + var10_ref_int__[var13 - -this.field_n & una.field_b];
                              if (var14 != 0) {
                                break L7;
                              } else {
                                if (var14 == 0) {
                                  continue L6;
                                } else {
                                  var8[-param1 + (var9 + this.field_m)] = var18;
                                  var9++;
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var14 == 0) {
                            continue L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_51_0 = 0;
                stackIn_52_0 = stackOut_51_0;
                break L1;
              }
              var9 = stackIn_52_0;
              L8: while (true) {
                if (ns.field_g > var9) {
                  var10 = 0;
                  var11 = 0;
                  L9: while (true) {
                    L10: {
                      if (var4 <= var11) {
                        var15[var9] = var5 * var10 >> 2068838160;
                        var9++;
                        break L10;
                      } else {
                        var10 = var10 + var19[var11][var9];
                        var11++;
                        if (var14 != 0) {
                          break L10;
                        } else {
                          continue L9;
                        }
                      }
                    }
                    if (var14 == 0) {
                      continue L8;
                    } else {
                      return var15;
                    }
                  }
                } else {
                  return var15;
                }
              }
            }
          } else {
            return var15;
          }
        } else {
          discarded$1 = this.c(-10, -66);
          var15 = this.field_i.a((byte) -123, param1);
          var3 = var15;
          if (this.field_i.field_d) {
            var4 = this.field_m + (this.field_m + 1);
            var5 = 65536 / var4;
            var6 = this.field_n + (this.field_n - -1);
            var7 = 65536 / var6;
            var19 = new int[var4][];
            var17 = var19;
            var8 = var17;
            var9 = param1 + -this.field_m;
            L11: while (true) {
              L12: {
                L13: {
                  if (var9 > this.field_m + param1) {
                    break L13;
                  } else {
                    var10_ref_int__ = this.c(0, -98, hba.field_b & var9);
                    var18 = new int[ns.field_g];
                    var16 = var18;
                    var11_ref_int__ = var16;
                    var12 = 0;
                    stackOut_6_0 = -this.field_n;
                    stackIn_21_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var14 != 0) {
                      break L12;
                    } else {
                      var13 = stackIn_7_0;
                      L14: while (true) {
                        L15: {
                          L16: {
                            if (var13 > this.field_n) {
                              break L16;
                            } else {
                              var12 = var12 + var10_ref_int__[var13 & una.field_b];
                              var13++;
                              if (var14 != 0) {
                                break L15;
                              } else {
                                if (var14 == 0) {
                                  continue L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          var13 = 0;
                          break L15;
                        }
                        L17: while (true) {
                          L18: {
                            if (var13 >= ns.field_g) {
                              var8[-param1 + (var9 + this.field_m)] = var18;
                              var9++;
                              break L18;
                            } else {
                              var11_ref_int__[var13] = var7 * var12 >> -1887913936;
                              var12 = var12 - var10_ref_int__[una.field_b & -this.field_n + var13];
                              var13++;
                              var12 = var12 + var10_ref_int__[var13 - -this.field_n & una.field_b];
                              if (var14 != 0) {
                                break L18;
                              } else {
                                if (var14 == 0) {
                                  continue L17;
                                } else {
                                  var8[-param1 + (var9 + this.field_m)] = var18;
                                  var9++;
                                  break L18;
                                }
                              }
                            }
                          }
                          if (var14 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L12;
              }
              var9 = stackIn_21_0;
              L19: while (true) {
                if (ns.field_g > var9) {
                  var10 = 0;
                  var11 = 0;
                  L20: while (true) {
                    L21: {
                      if (var4 <= var11) {
                        var15[var9] = var5 * var10 >> 2068838160;
                        var9++;
                        break L21;
                      } else {
                        var10 = var10 + var19[var11][var9];
                        var11++;
                        if (var14 != 0) {
                          break L21;
                        } else {
                          continue L20;
                        }
                      }
                    }
                    if (var14 == 0) {
                      continue L19;
                    } else {
                      return var15;
                    }
                  }
                } else {
                  return var15;
                }
              }
            }
          } else {
            return var15;
          }
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][][] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18_int = 0;
        int[] var18 = null;
        int[] var19 = null;
        int var19_int = 0;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int[][] var37 = null;
        int[][][] var38 = null;
        int[][] var69 = null;
        int[] var75 = null;
        int[] var76 = null;
        int[] var77 = null;
        int[][] var78 = null;
        int[][] var79 = null;
        int[][] var80 = null;
        int[] var81 = null;
        int[] var82 = null;
        int[] var83 = null;
        int[][] var84 = null;
        int[][] var85 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        var37 = this.field_h.a(param0, (byte) 117);
        var29 = var37;
        var3 = var29;
        if (param1 == -1) {
          if (this.field_h.field_f) {
            var4 = 1 + (this.field_m - -this.field_m);
            var5 = 65536 / var4;
            var6 = this.field_n - (-this.field_n + -1);
            var7 = 65536 / var6;
            var38 = new int[var4][][];
            var30 = var38;
            var8 = var30;
            var9_int = param0 + -this.field_m;
            L0: while (true) {
              if (this.field_m + param0 >= var9_int) {
                var80 = this.a(hba.field_b & var9_int, 0, -1);
                var84 = new int[3][ns.field_g];
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var83 = var80[0];
                var81 = var80[1];
                var82 = var80[2];
                if (var23 == 0) {
                  var18_int = -this.field_n;
                  if (var18_int > this.field_n) {
                    var18 = var84[0];
                    var19 = var84[1];
                    var20 = var84[2];
                    var21 = 0;
                    L1: while (true) {
                      L2: {
                        if (ns.field_g <= var21) {
                          var8[-param0 + var9_int - -this.field_m] = var84;
                          var9_int++;
                          break L2;
                        } else {
                          var18[var21] = var12 * var7 >> -972957328;
                          var19[var21] = var13 * var7 >> -1727724016;
                          var20[var21] = var7 * var14 >> -2048694992;
                          var22 = var21 + -this.field_n & una.field_b;
                          var13 = var13 - var81[var22];
                          var21++;
                          var12 = var12 - var83[var22];
                          var14 = var14 - var82[var22];
                          var22 = this.field_n + var21 & una.field_b;
                          var12 = var12 + var83[var22];
                          var13 = var13 + var81[var22];
                          var14 = var14 + var82[var22];
                          if (var23 != 0) {
                            break L2;
                          } else {
                            if (var23 == 0) {
                              continue L1;
                            } else {
                              var8[-param0 + var9_int - -this.field_m] = var84;
                              var9_int++;
                              break L2;
                            }
                          }
                        }
                      }
                      if (var23 == 0) {
                        continue L0;
                      } else {
                        var9 = var37[0];
                        var10 = var37[1];
                        var11 = var37[2];
                        var12 = 0;
                        L3: while (true) {
                          L4: {
                            if (ns.field_g <= var12) {
                              break L4;
                            } else {
                              var13 = 0;
                              var14 = 0;
                              var15 = 0;
                              var16 = 0;
                              L5: while (true) {
                                L6: {
                                  if (var16 >= var4) {
                                    var9[var12] = var13 * var5 >> 355519536;
                                    var10[var12] = var5 * var14 >> -1041783952;
                                    var11[var12] = var15 * var5 >> -1113407696;
                                    var12++;
                                    break L6;
                                  } else {
                                    var85 = var38[var16];
                                    var13 = var13 + var85[0][var12];
                                    var15 = var15 + var85[2][var12];
                                    var14 = var14 + var85[1][var12];
                                    var16++;
                                    if (var23 != 0) {
                                      break L6;
                                    } else {
                                      continue L5;
                                    }
                                  }
                                }
                                if (var23 == 0) {
                                  continue L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          return var3;
                        }
                      }
                    }
                  } else {
                    var19_int = var18_int & una.field_b;
                    var13 = var13 + var81[var19_int];
                    var14 = var14 + var82[var19_int];
                    var12 = var12 + var83[var19_int];
                    var18_int++;
                    continue L0;
                  }
                } else {
                  return var3;
                }
              } else {
                var9 = var37[0];
                var10 = var37[1];
                var11 = var37[2];
                var12 = 0;
                L7: while (true) {
                  L8: {
                    if (ns.field_g <= var12) {
                      break L8;
                    } else {
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      var16 = 0;
                      L9: while (true) {
                        L10: {
                          if (var16 >= var4) {
                            var9[var12] = var13 * var5 >> 355519536;
                            var10[var12] = var5 * var14 >> -1041783952;
                            var11[var12] = var15 * var5 >> -1113407696;
                            var12++;
                            break L10;
                          } else {
                            var85 = var38[var16];
                            var13 = var13 + var85[0][var12];
                            var15 = var15 + var85[2][var12];
                            var14 = var14 + var85[1][var12];
                            var16++;
                            if (var23 != 0) {
                              break L10;
                            } else {
                              continue L9;
                            }
                          }
                        }
                        if (var23 == 0) {
                          continue L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  return var3;
                }
              }
            }
          } else {
            return var3;
          }
        } else {
          this.field_m = -39;
          if (this.field_h.field_f) {
            var4 = 1 + (this.field_m - -this.field_m);
            var5 = 65536 / var4;
            var6 = this.field_n - (-this.field_n + -1);
            var7 = 65536 / var6;
            var38 = new int[var4][][];
            var30 = var38;
            var8 = var30;
            var9_int = param0 + -this.field_m;
            L11: while (true) {
              if (this.field_m + param0 >= var9_int) {
                var69 = this.a(hba.field_b & var9_int, 0, -1);
                var78 = new int[3][ns.field_g];
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var77 = var69[0];
                var75 = var69[1];
                var76 = var69[2];
                if (var23 == 0) {
                  var18_int = -this.field_n;
                  L12: while (true) {
                    L13: {
                      if (var18_int > this.field_n) {
                        break L13;
                      } else {
                        var19_int = var18_int & una.field_b;
                        var13 = var13 + var75[var19_int];
                        var14 = var14 + var76[var19_int];
                        var12 = var12 + var77[var19_int];
                        var18_int++;
                        if (var23 != 0) {
                          continue L11;
                        } else {
                          if (var23 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    var18 = var78[0];
                    var19 = var78[1];
                    var20 = var78[2];
                    var21 = 0;
                    L14: while (true) {
                      L15: {
                        if (ns.field_g <= var21) {
                          var8[-param0 + var9_int - -this.field_m] = var78;
                          var9_int++;
                          break L15;
                        } else {
                          var18[var21] = var12 * var7 >> -972957328;
                          var19[var21] = var13 * var7 >> -1727724016;
                          var20[var21] = var7 * var14 >> -2048694992;
                          var22 = var21 + -this.field_n & una.field_b;
                          var13 = var13 - var75[var22];
                          var21++;
                          var12 = var12 - var77[var22];
                          var14 = var14 - var76[var22];
                          var22 = this.field_n + var21 & una.field_b;
                          var12 = var12 + var77[var22];
                          var13 = var13 + var75[var22];
                          var14 = var14 + var76[var22];
                          if (var23 != 0) {
                            break L15;
                          } else {
                            if (var23 == 0) {
                              continue L14;
                            } else {
                              var8[-param0 + var9_int - -this.field_m] = var78;
                              var9_int++;
                              break L15;
                            }
                          }
                        }
                      }
                      if (var23 == 0) {
                        continue L11;
                      } else {
                        var9 = var37[0];
                        var10 = var37[1];
                        var11 = var37[2];
                        var12 = 0;
                        L16: while (true) {
                          L17: {
                            if (ns.field_g <= var12) {
                              break L17;
                            } else {
                              var13 = 0;
                              var14 = 0;
                              var15 = 0;
                              var16 = 0;
                              L18: while (true) {
                                L19: {
                                  if (var16 >= var4) {
                                    var9[var12] = var13 * var5 >> 355519536;
                                    var10[var12] = var5 * var14 >> -1041783952;
                                    var11[var12] = var15 * var5 >> -1113407696;
                                    var12++;
                                    break L19;
                                  } else {
                                    var79 = var38[var16];
                                    var13 = var13 + var79[0][var12];
                                    var15 = var15 + var79[2][var12];
                                    var14 = var14 + var79[1][var12];
                                    var16++;
                                    if (var23 != 0) {
                                      break L19;
                                    } else {
                                      continue L18;
                                    }
                                  }
                                }
                                if (var23 == 0) {
                                  continue L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          return var3;
                        }
                      }
                    }
                  }
                } else {
                  return var3;
                }
              } else {
                var9 = var37[0];
                var10 = var37[1];
                var11 = var37[2];
                var12 = 0;
                L20: while (true) {
                  L21: {
                    if (ns.field_g <= var12) {
                      break L21;
                    } else {
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      var16 = 0;
                      L22: while (true) {
                        L23: {
                          if (var16 >= var4) {
                            var9[var12] = var13 * var5 >> 355519536;
                            var10[var12] = var5 * var14 >> -1041783952;
                            var11[var12] = var15 * var5 >> -1113407696;
                            var12++;
                            break L23;
                          } else {
                            var79 = var38[var16];
                            var13 = var13 + var79[0][var12];
                            var15 = var15 + var79[2][var12];
                            var14 = var14 + var79[1][var12];
                            var16++;
                            if (var23 != 0) {
                              break L23;
                            } else {
                              continue L22;
                            }
                          }
                        }
                        if (var23 == 0) {
                          continue L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                  return var3;
                }
              }
            }
          } else {
            return var3;
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                this.field_m = -16;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    var4_int = param2;
                    if (var4_int != 0) {
                      break L5;
                    } else {
                      if (var5 == 0) {
                        this.field_n = param1.h(255);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (1 != var4_int) {
                      break L6;
                    } else {
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (-3 == (var4_int ^ -1)) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
                this.field_m = param1.h(255);
                if (var5 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              L7: {
                stackOut_14_0 = this;
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (1 != param1.h(255)) {
                  stackOut_16_0 = this;
                  stackOut_16_1 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L7;
                } else {
                  stackOut_15_0 = this;
                  stackOut_15_1 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  break L7;
                }
              }
              ((cl) (this)).field_g = stackIn_17_1 != 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("cl.A(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, byte param1, int param2, int param3) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var4 = 0;
        int var5 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        if (param0) {
          if (jk.field_h[param3] >= jk.field_h[param2]) {
            if (jk.field_h[param2] >= jk.field_h[param3]) {
              if (ic.field_c[param3] >= ic.field_c[param2]) {
                if (ic.field_c[param3] <= ic.field_c[param2]) {
                  var4 = bq.field_h[param3] + cu.field_o[param3] - -im.field_o[param3];
                  var5 = cu.field_o[param2] + bq.field_h[param2] + im.field_o[param2];
                  if (var4 >= var5) {
                    if (var5 >= var4) {
                      if (param1 >= 117) {
                        L0: {
                          if (param2 <= param3) {
                            stackOut_43_0 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            break L0;
                          } else {
                            stackOut_42_0 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            break L0;
                          }
                        }
                        return stackIn_44_0 != 0;
                      } else {
                        L1: {
                          discarded$2 = cl.a(false, (byte) -6, 50, 41);
                          if (param2 <= param3) {
                            stackOut_39_0 = 0;
                            stackIn_40_0 = stackOut_39_0;
                            break L1;
                          } else {
                            stackOut_38_0 = 1;
                            stackIn_40_0 = stackOut_38_0;
                            break L1;
                          }
                        }
                        return stackIn_40_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (ic.field_c[param3] >= ic.field_c[param2]) {
            if (ic.field_c[param2] < ic.field_c[param3]) {
              return false;
            } else {
              if (jk.field_h[param2] <= jk.field_h[param3]) {
                if (jk.field_h[param2] >= jk.field_h[param3]) {
                  var4 = bq.field_h[param3] + cu.field_o[param3] - -im.field_o[param3];
                  var5 = cu.field_o[param2] + bq.field_h[param2] + im.field_o[param2];
                  if (var4 >= var5) {
                    if (var5 >= var4) {
                      if (param1 >= 117) {
                        L2: {
                          if (param2 <= param3) {
                            stackOut_21_0 = 0;
                            stackIn_22_0 = stackOut_21_0;
                            break L2;
                          } else {
                            stackOut_20_0 = 1;
                            stackIn_22_0 = stackOut_20_0;
                            break L2;
                          }
                        }
                        return stackIn_22_0 != 0;
                      } else {
                        L3: {
                          discarded$3 = cl.a(false, (byte) -6, 50, 41);
                          if (param2 <= param3) {
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            break L3;
                          } else {
                            stackOut_16_0 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            break L3;
                          }
                        }
                        return stackIn_18_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
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

    static {
        field_o = false;
    }
}
