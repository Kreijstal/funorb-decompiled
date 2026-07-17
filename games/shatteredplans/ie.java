/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    final static void a(bi param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param1 = param1 + param0.field_t;
          param2 = param2 + param0.field_x;
          var3 = param1 + param2 * gf.field_b;
          var4 = 0;
          var5 = param0.field_w;
          var6 = param0.field_z;
          var7 = gf.field_b - var6;
          var8 = 0;
          if (param2 >= gf.field_a) {
            break L0;
          } else {
            var9 = gf.field_a - param2;
            var5 = var5 - var9;
            param2 = gf.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gf.field_b;
            break L0;
          }
        }
        L1: {
          if (param2 + var5 <= gf.field_f) {
            break L1;
          } else {
            var5 = var5 - (param2 + var5 - gf.field_f);
            break L1;
          }
        }
        L2: {
          if (param1 >= gf.field_i) {
            break L2;
          } else {
            var9 = gf.field_i - param1;
            var6 = var6 - var9;
            param1 = gf.field_i;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= gf.field_l) {
            break L3;
          } else {
            var9 = param1 + var6 - gf.field_l;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            ie.a(gf.field_h, param0.field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(om param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        double var7 = 0.0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        double var25 = 0.0;
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
        if (param6 != 0) {
          L0: {
            param1 = param1 - (param0.field_t << 4);
            param2 = param2 - (param0.field_x << 4);
            var7 = (double)(param5 & 65535) * 0.00009587379924285257;
            var9 = (int)Math.floor(Math.sin(var7) * (double)param6 + 0.5);
            var10 = (int)Math.floor(Math.cos(var7) * (double)param6 + 0.5);
            var11 = -param1 * var10 + -param2 * var9;
            var12 = --param1 * var9 + -param2 * var10;
            var13 = ((param0.field_z << 4) - param1) * var10 + -param2 * var9;
            var14 = -((param0.field_z << 4) - param1) * var9 + -param2 * var10;
            var15 = -param1 * var10 + ((param0.field_w << 4) - param2) * var9;
            var16 = --param1 * var9 + ((param0.field_w << 4) - param2) * var10;
            var17 = ((param0.field_z << 4) - param1) * var10 + ((param0.field_w << 4) - param2) * var9;
            var18 = -((param0.field_z << 4) - param1) * var9 + ((param0.field_w << 4) - param2) * var10;
            if (var11 >= var13) {
              var19 = var13;
              var20 = var11;
              break L0;
            } else {
              var19 = var11;
              var20 = var13;
              break L0;
            }
          }
          L1: {
            if (var15 >= var19) {
              break L1;
            } else {
              var19 = var15;
              break L1;
            }
          }
          L2: {
            if (var17 >= var19) {
              break L2;
            } else {
              var19 = var17;
              break L2;
            }
          }
          L3: {
            if (var15 <= var20) {
              break L3;
            } else {
              var20 = var15;
              break L3;
            }
          }
          L4: {
            if (var17 <= var20) {
              break L4;
            } else {
              var20 = var17;
              break L4;
            }
          }
          L5: {
            if (var12 >= var14) {
              var21 = var14;
              var22 = var12;
              break L5;
            } else {
              var21 = var12;
              var22 = var14;
              break L5;
            }
          }
          L6: {
            if (var16 >= var21) {
              break L6;
            } else {
              var21 = var16;
              break L6;
            }
          }
          L7: {
            if (var18 >= var21) {
              break L7;
            } else {
              var21 = var18;
              break L7;
            }
          }
          L8: {
            if (var16 <= var22) {
              break L8;
            } else {
              var22 = var16;
              break L8;
            }
          }
          L9: {
            if (var18 <= var22) {
              break L9;
            } else {
              var22 = var18;
              break L9;
            }
          }
          L10: {
            var19 = var19 >> 12;
            var20 = var20 + 4095 >> 12;
            var21 = var21 >> 12;
            var22 = var22 + 4095 >> 12;
            var19 = var19 + param3;
            var20 = var20 + param3;
            var21 = var21 + param4;
            var22 = var22 + param4;
            var19 = var19 >> 4;
            var20 = var20 + 15 >> 4;
            var21 = var21 >> 4;
            var22 = var22 + 15 >> 4;
            if (var19 >= gf.field_i) {
              break L10;
            } else {
              var19 = gf.field_i;
              break L10;
            }
          }
          L11: {
            if (var20 <= gf.field_l) {
              break L11;
            } else {
              var20 = gf.field_l;
              break L11;
            }
          }
          L12: {
            if (var21 >= gf.field_a) {
              break L12;
            } else {
              var21 = gf.field_a;
              break L12;
            }
          }
          L13: {
            if (var22 <= gf.field_f) {
              break L13;
            } else {
              var22 = gf.field_f;
              break L13;
            }
          }
          var20 = var19 - var20;
          if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
              L14: {
                var23 = var21 * gf.field_b + var19;
                var24 = gf.field_b + var20;
                var25 = 16777216.0 / (double)param6;
                var27 = (int)Math.floor(Math.sin(var7) * var25 + 0.5);
                var28 = (int)Math.floor(Math.cos(var7) * var25 + 0.5);
                var29 = (var19 << 4) + 8 - param3;
                var30 = (var21 << 4) + 8 - param4;
                var31 = (param1 << 8) - 2048 - (var30 * var27 >> 4);
                var32 = (param2 << 8) - 2048 + (var30 * var28 >> 4);
                if (var28 >= 0) {
                  if (var27 >= 0) {
                    var36 = var22;
                    L15: while (true) {
                      if (var36 >= 0) {
                        break L14;
                      } else {
                        L16: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 + 4096;
                          if (var35 < 0) {
                            if (var28 != 0) {
                              var35 = (var28 - 1 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L16;
                            } else {
                              var23 = var23 - var39;
                              break L16;
                            }
                          } else {
                            var40 = 1;
                            break L16;
                          }
                        }
                        L17: {
                          if (var40 == 0) {
                            break L17;
                          } else {
                            L18: {
                              var40 = 0;
                              var35 = var38 + 4096;
                              if (var35 < 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - 1 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L18;
                                } else {
                                  var23 = var23 - var39;
                                  break L18;
                                }
                              } else {
                                var40 = 1;
                                break L18;
                              }
                            }
                            if (var40 == 0) {
                              break L17;
                            } else {
                              L19: while (true) {
                                L20: {
                                  if (var39 >= 0) {
                                    break L20;
                                  } else {
                                    var33 = var37 >> 12;
                                    if (var37 >> 12 >= param0.field_z) {
                                      break L20;
                                    } else {
                                      var34 = var38 >> 12;
                                      if (var38 >> 12 < param0.field_w) {
                                        ie.a(param0.field_B, param0.field_z, param0.field_w, var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L19;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L17;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L15;
                      }
                    }
                  } else {
                    var36 = var22;
                    L21: while (true) {
                      if (var36 >= 0) {
                        break L14;
                      } else {
                        L22: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 + 4096;
                          if (var35 < 0) {
                            if (var28 != 0) {
                              var35 = (var28 - 1 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L22;
                            } else {
                              var23 = var23 - var39;
                              break L22;
                            }
                          } else {
                            var40 = 1;
                            break L22;
                          }
                        }
                        L23: {
                          if (var40 == 0) {
                            break L23;
                          } else {
                            L24: {
                              var40 = 0;
                              var35 = var38 - (param0.field_w << 12);
                              if (var35 >= 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L24;
                                } else {
                                  var23 = var23 - var39;
                                  break L24;
                                }
                              } else {
                                var40 = 1;
                                break L24;
                              }
                            }
                            if (var40 == 0) {
                              break L23;
                            } else {
                              L25: while (true) {
                                L26: {
                                  if (var39 >= 0) {
                                    break L26;
                                  } else {
                                    if (var38 < -4096) {
                                      break L26;
                                    } else {
                                      var33 = var37 >> 12;
                                      if (var37 >> 12 < param0.field_z) {
                                        var34 = var38 >> 12;
                                        ie.a(param0.field_B, param0.field_z, param0.field_w, var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L23;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L21;
                      }
                    }
                  }
                } else {
                  if (var27 >= 0) {
                    var36 = var22;
                    L27: while (true) {
                      if (var36 >= 0) {
                        break L14;
                      } else {
                        L28: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 - (param0.field_z << 12);
                          if (var35 >= 0) {
                            if (var28 != 0) {
                              var35 = (var28 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L28;
                            } else {
                              var23 = var23 - var39;
                              break L28;
                            }
                          } else {
                            var40 = 1;
                            break L28;
                          }
                        }
                        L29: {
                          if (var40 == 0) {
                            break L29;
                          } else {
                            L30: {
                              var40 = 0;
                              var35 = var38 + 4096;
                              if (var35 < 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - 1 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L30;
                                } else {
                                  var23 = var23 - var39;
                                  break L30;
                                }
                              } else {
                                var40 = 1;
                                break L30;
                              }
                            }
                            if (var40 == 0) {
                              break L29;
                            } else {
                              L31: while (true) {
                                L32: {
                                  if (var39 >= 0) {
                                    break L32;
                                  } else {
                                    if (var37 < -4096) {
                                      break L32;
                                    } else {
                                      var34 = var38 >> 12;
                                      if (var38 >> 12 < param0.field_w) {
                                        var33 = var37 >> 12;
                                        ie.a(param0.field_B, param0.field_z, param0.field_w, var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L29;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L27;
                      }
                    }
                  } else {
                    var36 = var22;
                    L33: while (true) {
                      if (var36 >= 0) {
                        return;
                      } else {
                        L34: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 - (param0.field_z << 12);
                          if (var35 >= 0) {
                            if (var28 != 0) {
                              var35 = (var28 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L34;
                            } else {
                              var23 = var23 - var39;
                              break L34;
                            }
                          } else {
                            var40 = 1;
                            break L34;
                          }
                        }
                        L35: {
                          if (var40 == 0) {
                            break L35;
                          } else {
                            L36: {
                              var40 = 0;
                              var35 = var38 - (param0.field_w << 12);
                              if (var35 >= 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L36;
                                } else {
                                  var23 = var23 - var39;
                                  break L36;
                                }
                              } else {
                                var40 = 1;
                                break L36;
                              }
                            }
                            if (var40 == 0) {
                              break L35;
                            } else {
                              L37: while (true) {
                                L38: {
                                  if (var39 >= 0) {
                                    break L38;
                                  } else {
                                    if (var37 < -4096) {
                                      break L38;
                                    } else {
                                      if (var38 >= -4096) {
                                        var33 = var37 >> 12;
                                        var34 = var38 >> 12;
                                        ie.a(param0.field_B, param0.field_z, param0.field_w, var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L37;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L35;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L33;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = -param5;
            L1: while (true) {
              if (var12 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var11++;
                continue L0;
              } else {
                int incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
                if (param2 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var9 = param0[param4];
                  var10 = 256 - (param2 & 255);
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((var9 & 16711935) * var10 & -16711936 | (var9 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var8 = param5 * param1 + param4;
          param6 = param6 & 4095;
          param7 = param7 & 4095;
          if (param5 < 0) {
            var14 = 0;
            var13 = 0;
            var10 = 0;
            var9 = 0;
            break L0;
          } else {
            L1: {
              if (param4 < 0) {
                var13 = 0;
                var9 = 0;
                break L1;
              } else {
                L2: {
                  var9 = param0[var8];
                  if ((var9 & -16777216) == 0) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = (4096 - param6) * (4096 - param7);
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                var13 = stackIn_5_0;
                break L1;
              }
            }
            if (param4 >= param1 - 1) {
              var14 = 0;
              var10 = 0;
              break L0;
            } else {
              L3: {
                var10 = param0[var8 + 1];
                if ((var10 & -16777216) == 0) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = param6 * (4096 - param7);
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              var14 = stackIn_11_0;
              break L0;
            }
          }
        }
        L4: {
          if (param5 >= param2 - 1) {
            var16 = 0;
            var15 = 0;
            var12 = 0;
            var11 = 0;
            break L4;
          } else {
            L5: {
              if (param4 < 0) {
                var15 = 0;
                var11 = 0;
                break L5;
              } else {
                L6: {
                  var11 = param0[var8 + param1];
                  if ((var11 & -16777216) == 0) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L6;
                  } else {
                    stackOut_17_0 = (4096 - param6) * param7;
                    stackIn_19_0 = stackOut_17_0;
                    break L6;
                  }
                }
                var15 = stackIn_19_0;
                break L5;
              }
            }
            if (param4 >= param1 - 1) {
              var16 = 0;
              var12 = 0;
              break L4;
            } else {
              L7: {
                var12 = param0[var8 + param1 + 1];
                if ((var12 & -16777216) == 0) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L7;
                } else {
                  stackOut_23_0 = param6 * param7;
                  stackIn_25_0 = stackOut_23_0;
                  break L7;
                }
              }
              var16 = stackIn_25_0;
              break L4;
            }
          }
        }
        var13 = var13 >> 16;
        var14 = var14 >> 16;
        var15 = var15 >> 16;
        var16 = var16 >> 16;
        var17 = var13 + var14 + var15 + var16;
        if (var17 < 128) {
          return;
        } else {
          L8: {
            var18 = (var9 & 16711935) * var13 + (var10 & 16711935) * var14;
            var18 = var18 + ((var11 & 16711935) * var15 + (var12 & 16711935) * var16);
            var19 = ((var9 & -16711936) >>> 8) * var13 + ((var10 & -16711936) >>> 8) * var14;
            var19 = var19 + (((var11 & -16711936) >>> 8) * var15 + ((var12 & -16711936) >>> 8) * var16);
            var20 = var19 >>> 24;
            var18 = var18 >>> 8 & 16711935;
            var19 = var19 & 65280;
            if (var20 == 0) {
              break L8;
            } else {
              var21 = 256 - var20;
              var22 = gf.field_h[param3];
              gf.field_h[param3] = (var18 * var20 + (var22 & 16711935) * var21 & -16711936) + (var19 * var20 + (var22 & 65280) * var21 & 16711680) >>> 8;
              break L8;
            }
          }
          return;
        }
    }
}
