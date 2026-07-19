/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        if (param5 > 0) {
          if (param5 < param4) {
            L0: {
              param0 = param0 - param5;
              param1 = param1 - param5;
              var6 = param4 - param5;
              if (param1 < vj.field_h) {
                break L0;
              } else {
                if (param1 < vj.field_b) {
                  L1: {
                    if (param0 >= vj.field_f) {
                      break L1;
                    } else {
                      param2 = param2 - (vj.field_f - param0);
                      param0 = vj.field_f;
                      break L1;
                    }
                  }
                  L2: {
                    if (param0 + param2 <= vj.field_a) {
                      break L2;
                    } else {
                      param2 = vj.field_a - param0;
                      break L2;
                    }
                  }
                  if (param1 % param4 < var6) {
                    L3: {
                      if (param0 % param4 < var6) {
                        break L3;
                      } else {
                        var7 = param4 - param0 % param4;
                        param2 = param2 - var7;
                        param0 = param0 + var7;
                        break L3;
                      }
                    }
                    L4: {
                      if ((param0 + param2 - 1) % param4 < var6) {
                        break L4;
                      } else {
                        param2 = param2 - (1 + (param0 + param2 - 1) % param4 - var6);
                        break L4;
                      }
                    }
                    var7 = param0 + param1 * vj.field_l;
                    var8 = param0 % param4;
                    var9 = vj.field_j;
                    param0 = -param2;
                    L5: while (true) {
                      if (param0 >= 0) {
                        return;
                      } else {
                        incrementValue$2 = var8;
                        var8++;
                        if (incrementValue$2 != var6) {
                          incrementValue$3 = var7;
                          var7++;
                          var9[incrementValue$3] = param3;
                          param0++;
                          continue L5;
                        } else {
                          param0 = param0 + param5;
                          var7 = var7 + param5;
                          var8 = 0;
                          continue L5;
                        }
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
            return;
          } else {
            return;
          }
        } else {
          vj.d(param0, param1, param2, param3);
          return;
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var13 = null;
        if (param5 > 0) {
          if (param5 < param4) {
            L0: {
              param0 = param0 - param5;
              param1 = param1 - param5;
              var6 = param4 - param5;
              if (param0 < vj.field_f) {
                break L0;
              } else {
                if (param0 < vj.field_a) {
                  L1: {
                    if (param1 >= vj.field_h) {
                      break L1;
                    } else {
                      param2 = param2 - (vj.field_h - param1);
                      param1 = vj.field_h;
                      break L1;
                    }
                  }
                  L2: {
                    if (param1 + param2 <= vj.field_b) {
                      break L2;
                    } else {
                      param2 = vj.field_b - param1;
                      break L2;
                    }
                  }
                  if (param0 % param4 < var6) {
                    L3: {
                      if (param1 % param4 < var6) {
                        break L3;
                      } else {
                        var7 = param4 - param1 % param4;
                        param2 = param2 - var7;
                        param1 = param1 + var7;
                        break L3;
                      }
                    }
                    L4: {
                      if ((param1 + param2 - 1) % param4 < var6) {
                        break L4;
                      } else {
                        param2 = param2 - (1 + (param1 + param2 - 1) % param4 - var6);
                        break L4;
                      }
                    }
                    var7 = param0 + param1 * vj.field_l;
                    var8 = param1 % param4;
                    var13 = vj.field_j;
                    param1 = -param2;
                    L5: while (true) {
                      if (param1 >= 0) {
                        return;
                      } else {
                        incrementValue$1 = var8;
                        var8++;
                        if (incrementValue$1 != var6) {
                          var13[var7] = param3;
                          var7 = var7 + vj.field_l;
                          param1++;
                          continue L5;
                        } else {
                          param1 = param1 + param5;
                          var7 = var7 + vj.field_l * param5;
                          var8 = 0;
                          continue L5;
                        }
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
            return;
          } else {
            return;
          }
        } else {
          vj.c(param0, param1, param2, param3);
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var13 = param7;
        var14 = -param6;
        L0: while (true) {
          if (var14 >= 0) {
            return;
          } else {
            incrementValue$8 = param8;
            param8++;
            if (incrementValue$8 != param9) {
              param7 = var13;
              var15 = -param5;
              L1: while (true) {
                if (var15 >= 0) {
                  param4 = param4 + param11;
                  param3 = param3 + param12;
                  var14++;
                  continue L0;
                } else {
                  incrementValue$9 = param7;
                  param7++;
                  if (incrementValue$9 != param9) {
                    incrementValue$10 = param3;
                    param3++;
                    param2 = param1[incrementValue$10];
                    if (param2 == 0) {
                      param4++;
                      var15++;
                      continue L1;
                    } else {
                      incrementValue$11 = param4;
                      param4++;
                      param0[incrementValue$11] = param2;
                      var15++;
                      continue L1;
                    }
                  } else {
                    L2: {
                      var16 = param10;
                      if (var15 + param10 <= 0) {
                        break L2;
                      } else {
                        var16 = -var15;
                        break L2;
                      }
                    }
                    var15 = var15 + var16;
                    param4 = param4 + var16;
                    param3 = param3 + var16;
                    param7 = 0;
                    continue L1;
                  }
                }
              }
            } else {
              var14 = var14 + param10;
              param4 = param4 + (param11 + param5) * param10;
              param3 = param3 + (param12 + param5) * param10;
              param8 = 0;
              continue L0;
            }
          }
        }
    }

    final static void a(kc param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (param5 > 0) {
          if (param5 < param4) {
            L0: {
              param1 = param1 - param5;
              param2 = param2 - param5;
              var6 = param4 - param5;
              param1 = param1 + param0.field_q;
              param2 = param2 + param0.field_n;
              var7 = 0;
              var8 = param0.field_o;
              var9 = param0.field_p;
              if (param2 >= vj.field_h) {
                break L0;
              } else {
                var10 = vj.field_h - param2;
                var8 = var8 - var10;
                param2 = vj.field_h;
                var7 = var7 + var10 * var9;
                break L0;
              }
            }
            L1: {
              if (param2 + var8 <= vj.field_b) {
                break L1;
              } else {
                var8 = vj.field_b - param2;
                break L1;
              }
            }
            L2: {
              if (param1 >= vj.field_f) {
                break L2;
              } else {
                var10 = vj.field_f - param1;
                var9 = var9 - var10;
                param1 = vj.field_f;
                var7 = var7 + var10;
                break L2;
              }
            }
            L3: {
              if (param1 + var9 <= vj.field_a) {
                break L3;
              } else {
                var9 = vj.field_a - param1;
                break L3;
              }
            }
            L4: {
              if (var9 <= 0) {
                break L4;
              } else {
                if (var8 > 0) {
                  L5: {
                    if (param1 % param4 < var6) {
                      break L5;
                    } else {
                      var10 = param4 - param1 % param4;
                      var9 = var9 - var10;
                      param1 = param1 + var10;
                      var7 = var7 + var10;
                      break L5;
                    }
                  }
                  L6: {
                    if ((param1 + var9 - 1) % param4 < var6) {
                      break L6;
                    } else {
                      var9 = var9 - (1 + (param1 + var9 - 1) % param4 - var6);
                      break L6;
                    }
                  }
                  L7: {
                    if (param2 % param4 < var6) {
                      break L7;
                    } else {
                      var10 = param4 - param2 % param4;
                      var8 = var8 - var10;
                      param2 = param2 + var10;
                      var7 = var7 + var10 * param0.field_p;
                      break L7;
                    }
                  }
                  L8: {
                    if ((param2 + var8 - 1) % param4 < var6) {
                      break L8;
                    } else {
                      var8 = var8 - (1 + (param2 + var8 - 1) % param4 - var6);
                      break L8;
                    }
                  }
                  ae.a(vj.field_j, param0.field_r, 0, var7, param1 + param2 * vj.field_l, var9, var8, param1 % param4, param2 % param4, var6, param5, vj.field_l - var9, param0.field_p - var9, param3);
                  return;
                } else {
                  break L4;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          param0.c(param1, param2, param3);
          return;
        }
    }

    final static void a(kc param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param4 > 0) {
          if (param4 < param3) {
            L0: {
              param1 = param1 - param4;
              param2 = param2 - param4;
              var5 = param3 - param4;
              param1 = param1 + param0.field_q;
              param2 = param2 + param0.field_n;
              var6 = 0;
              var7 = param0.field_o;
              var8 = param0.field_p;
              if (param2 >= vj.field_h) {
                break L0;
              } else {
                var9 = vj.field_h - param2;
                var7 = var7 - var9;
                param2 = vj.field_h;
                var6 = var6 + var9 * var8;
                break L0;
              }
            }
            L1: {
              if (param2 + var7 <= vj.field_b) {
                break L1;
              } else {
                var7 = vj.field_b - param2;
                break L1;
              }
            }
            L2: {
              if (param1 >= vj.field_f) {
                break L2;
              } else {
                var9 = vj.field_f - param1;
                var8 = var8 - var9;
                param1 = vj.field_f;
                var6 = var6 + var9;
                break L2;
              }
            }
            L3: {
              if (param1 + var8 <= vj.field_a) {
                break L3;
              } else {
                var8 = vj.field_a - param1;
                break L3;
              }
            }
            L4: {
              if (var8 <= 0) {
                break L4;
              } else {
                if (var7 > 0) {
                  L5: {
                    if (param1 % param3 < var5) {
                      break L5;
                    } else {
                      var9 = param3 - param1 % param3;
                      var8 = var8 - var9;
                      param1 = param1 + var9;
                      var6 = var6 + var9;
                      break L5;
                    }
                  }
                  L6: {
                    if ((param1 + var8 - 1) % param3 < var5) {
                      break L6;
                    } else {
                      var8 = var8 - (1 + (param1 + var8 - 1) % param3 - var5);
                      break L6;
                    }
                  }
                  L7: {
                    if (param2 % param3 < var5) {
                      break L7;
                    } else {
                      var9 = param3 - param2 % param3;
                      var7 = var7 - var9;
                      param2 = param2 + var9;
                      var6 = var6 + var9 * param0.field_p;
                      break L7;
                    }
                  }
                  L8: {
                    if ((param2 + var7 - 1) % param3 < var5) {
                      break L8;
                    } else {
                      var7 = var7 - (1 + (param2 + var7 - 1) % param3 - var5);
                      break L8;
                    }
                  }
                  var9 = param1 + param2 * vj.field_l;
                  var10 = vj.field_l - var8;
                  var11 = param0.field_p - var8;
                  ae.a(vj.field_j, param0.field_r, 0, var6, var9, var8, var7, param1 % param3, param2 % param3, var5, param4, var10, var11);
                  return;
                } else {
                  break L4;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          param0.d(param1, param2);
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var14 = param13 & 16711935;
        var15 = param13 >> 8 & 255;
        var16 = param7;
        var17 = -param6;
        L0: while (true) {
          if (var17 >= 0) {
            return;
          } else {
            incrementValue$5 = param8;
            param8++;
            if (incrementValue$5 != param9) {
              param7 = var16;
              var18 = -param5;
              L1: while (true) {
                if (var18 >= 0) {
                  param4 = param4 + param11;
                  param3 = param3 + param12;
                  var17++;
                  continue L0;
                } else {
                  incrementValue$6 = param7;
                  param7++;
                  if (incrementValue$6 != param9) {
                    incrementValue$7 = param3;
                    param3++;
                    param2 = param1[incrementValue$7];
                    if (param2 == 0) {
                      param4++;
                      var18++;
                      continue L1;
                    } else {
                      if (param2 >> 8 != (param2 & 65535)) {
                        incrementValue$8 = param4;
                        param4++;
                        param0[incrementValue$8] = param2;
                        var18++;
                        continue L1;
                      } else {
                        param2 = param2 & 255;
                        incrementValue$9 = param4;
                        param4++;
                        param0[incrementValue$9] = (param2 * var14 >> 8 & 16711935) + (param2 * var15 & 65280);
                        var18++;
                        continue L1;
                      }
                    }
                  } else {
                    L2: {
                      var19 = param10;
                      if (var18 + param10 <= 0) {
                        break L2;
                      } else {
                        var19 = -var18;
                        break L2;
                      }
                    }
                    var18 = var18 + var19;
                    param4 = param4 + var19;
                    param3 = param3 + var19;
                    param7 = 0;
                    continue L1;
                  }
                }
              }
            } else {
              var17 = var17 + param10;
              param4 = param4 + vj.field_l * param10;
              param3 = param3 + (param12 + param5) * param10;
              param8 = 0;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        if (param6 > 0) {
          if (param6 < param5) {
            L0: {
              param0 = param0 - param6;
              param1 = param1 - param6;
              var7 = param5 - param6;
              if (param1 >= vj.field_h) {
                break L0;
              } else {
                param3 = param3 - (vj.field_h - param1);
                param1 = vj.field_h;
                break L0;
              }
            }
            L1: {
              if (param1 + param3 <= vj.field_b) {
                break L1;
              } else {
                param3 = vj.field_b - param1;
                break L1;
              }
            }
            L2: {
              if (param0 >= vj.field_f) {
                break L2;
              } else {
                param2 = param2 - (vj.field_f - param0);
                param0 = vj.field_f;
                break L2;
              }
            }
            L3: {
              if (param0 + param2 <= vj.field_a) {
                break L3;
              } else {
                param2 = vj.field_a - param0;
                break L3;
              }
            }
            L4: {
              if (param2 <= 0) {
                break L4;
              } else {
                if (param3 > 0) {
                  L5: {
                    if (param0 % param5 < var7) {
                      break L5;
                    } else {
                      var8 = param5 - param0 % param5;
                      param2 = param2 - var8;
                      param0 = param0 + var8;
                      break L5;
                    }
                  }
                  L6: {
                    if ((param0 + param2 - 1) % param5 < var7) {
                      break L6;
                    } else {
                      param2 = param2 - (1 + (param0 + param2 - 1) % param5 - var7);
                      break L6;
                    }
                  }
                  L7: {
                    if (param1 % param5 < var7) {
                      break L7;
                    } else {
                      var8 = param5 - param1 % param5;
                      param3 = param3 - var8;
                      param1 = param1 + var8;
                      break L7;
                    }
                  }
                  L8: {
                    if ((param1 + param3 - 1) % param5 < var7) {
                      break L8;
                    } else {
                      param3 = param3 - (1 + (param1 + param3 - 1) % param5 - var7);
                      break L8;
                    }
                  }
                  ae.a(vj.field_j, param4, param0 + param1 * vj.field_l, param2, param3, param0 % param5, param1 % param5, var7, param6, vj.field_l - param2);
                  return;
                } else {
                  break L4;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          vj.c(param0, param1, param2, param3, param4);
          return;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var10 = param5;
        var11 = -param4;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            incrementValue$7 = param6;
            param6++;
            if (incrementValue$7 != param7) {
              param5 = var10;
              var12 = -param3;
              L1: while (true) {
                if (var12 >= 0) {
                  param2 = param2 + param9;
                  var11++;
                  continue L0;
                } else {
                  incrementValue$8 = param5;
                  param5++;
                  if (incrementValue$8 != param7) {
                    incrementValue$9 = param2;
                    param2++;
                    param0[incrementValue$9] = param1;
                    var12++;
                    continue L1;
                  } else {
                    L2: {
                      var13 = param8;
                      if (var12 + param8 <= 0) {
                        break L2;
                      } else {
                        var13 = -var12;
                        break L2;
                      }
                    }
                    var12 = var12 + var13;
                    param2 = param2 + var13;
                    param5 = 0;
                    continue L1;
                  }
                }
              }
            } else {
              var11 = var11 + param8;
              param2 = param2 + vj.field_l * param8;
              param6 = 0;
              continue L0;
            }
          }
        }
    }
}
