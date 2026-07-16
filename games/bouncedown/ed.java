/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ed {
    static ec field_c;
    static int field_b;
    static int field_d;
    bh[] field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 == 19599) {
            return;
        }
        field_d = 21;
    }

    final int a(int param0, int param1) {
        bh[] var3 = null;
        int var4 = 0;
        bh var5 = null;
        int var6 = 0;
        bh[] var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var6 = Bounce.field_N;
          var7 = ((ed) this).field_a;
          var3 = var7;
          if (param1 > 69) {
            break L0;
          } else {
            ed.a((byte) 121);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var7.length > var4) {
            var5 = var7[var4];
            stackOut_5_0 = var5.field_a.length;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var6 == 0) {
              if (stackIn_7_0 <= param0) {
                param0 = param0 - (var5.field_a.length - 1);
                var4++;
                continue L1;
              } else {
                return var5.field_a[param0];
              }
            } else {
              return stackIn_6_0;
            }
          } else {
            return 0;
          }
        }
    }

    final static tg[] a(int param0, int param1, int param2, int param3) {
        if (param2 <= 60) {
          ed.a(7);
          return kg.a(param1, 1, param3, -2147483648, param0);
        } else {
          return kg.a(param1, 1, param3, -2147483648, param0);
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        bh var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        var5 = Bounce.field_N;
        var3 = param1;
        L0: while (true) {
          if (((ed) this).field_a.length > var3) {
            var4 = ((ed) this).field_a[var3];
            stackOut_3_0 = var4.field_a.length;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var5 == 0) {
              if (stackIn_5_0 > param0) {
                return var3;
              } else {
                param0 = param0 - (var4.field_a.length - 1);
                var3++;
                continue L0;
              }
            } else {
              return stackIn_4_0;
            }
          } else {
            return ((ed) this).field_a.length;
          }
        }
    }

    final int b(int param0) {
        int var2 = 0;
        bh[] var3 = null;
        int var4 = 0;
        bh var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Bounce.field_N;
        var2 = -1;
        if (param0 > 73) {
          if (((ed) this).field_a == null) {
            return var2;
          } else {
            var3 = ((ed) this).field_a;
            var4 = 0;
            L0: while (true) {
              L1: {
                if (var4 >= var3.length) {
                  break L1;
                } else {
                  L2: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var6 = var5.a((byte) -62);
                      if (var2 < var6) {
                        var2 = var6;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          return 107;
        }
    }

    final static void a(byte param0) {
        il.a(6);
        if (param0 == -127) {
            return;
        }
        field_b = -84;
    }

    final int b(byte param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = -59 % ((param0 - -51) / 35);
        if (((ed) this).field_a != null) {
          if (((ed) this).field_a.length <= 0) {
            return 0;
          } else {
            return -((ed) this).field_a[0].field_f + ((ed) this).field_a[((ed) this).field_a.length + -1].field_b;
          }
        } else {
          stackOut_1_0 = 0;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0;
        }
    }

    private final static lb[] a(int param0, si param1) {
        int[] var3 = null;
        lb[] var4 = null;
        int var5 = 0;
        lb var6 = null;
        int var7 = 0;
        mk var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        lb[] stackIn_16_0 = null;
        lb[] stackIn_17_0 = null;
        lb[] stackOut_15_0 = null;
        var7 = Bounce.field_N;
        if (param1.a((byte) 53)) {
          var8 = param1.c((byte) 5);
          L0: while (true) {
            L1: {
              L2: {
                if (var8.field_f != 0) {
                  break L2;
                } else {
                  wh.a(10L, param0 + 19396);
                  if (var7 != 0) {
                    break L1;
                  } else {
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if ((var8.field_f ^ -1) == -3) {
                break L1;
              } else {
                var12 = (int[]) var8.field_e;
                var11 = var12;
                var10 = var11;
                var9 = var10;
                var3 = var9;
                if (param0 == 10) {
                  var4 = new lb[var12.length >> -1679031710];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 < var4.length) {
                      var6 = new lb();
                      stackOut_15_0 = (lb[]) var4;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var7 == 0) {
                        stackIn_17_0[var5] = var6;
                        var6.field_d = var3[var5 << 508978434];
                        var6.field_e = var3[1 + (var5 << -494393854)];
                        var6.field_a = var3[(var5 << -1549120510) - -2];
                        var6.field_f = var3[(var5 << -1084009118) - -3];
                        var5++;
                        continue L3;
                      } else {
                        return stackIn_16_0;
                      }
                    } else {
                      return var4;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
            return new lb[]{};
          }
        } else {
          return new lb[]{};
        }
    }

    final static java.awt.Frame a(int param0, si param1, int param2, int param3, int param4, int param5) {
        lb[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        lb[] var10 = null;
        mk var12 = null;
        java.awt.Frame var13 = null;
        mk var14 = null;
        java.awt.Frame var15 = null;
        int stackIn_19_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_29_0 = 0;
        var9 = Bounce.field_N;
        if (param1.a((byte) 53)) {
          L0: {
            if (param2 == 0) {
              break L0;
            } else {
              var12 = param1.a(param2, param4, param3, param5, 314572800);
              L1: while (true) {
                if (0 == var12.field_f) {
                  wh.a(10L, 19406);
                  if (var9 == 0) {
                    continue L1;
                  } else {
                    break L0;
                  }
                } else {
                  var13 = (java.awt.Frame) var12.field_e;
                  if (var13 != null) {
                    if (var12.field_f != 2) {
                      if (param0 != 4147) {
                        field_c = null;
                        return var13;
                      } else {
                        return var13;
                      }
                    } else {
                      ib.a(param1, var13, (byte) 115);
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
          var10 = ed.a(10, param1);
          var6 = var10;
          if (var6 != null) {
            var7 = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var10.length <= var8) {
                    break L4;
                  } else {
                    stackOut_18_0 = param4;
                    stackIn_30_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_19_0 != var10[var8].field_d) {
                          break L5;
                        } else {
                          if (var10[var8].field_e != param5) {
                            break L5;
                          } else {
                            L6: {
                              if (param3 == 0) {
                                break L6;
                              } else {
                                if (var10[var8].field_f == param3) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L7: {
                              if (var7 == 0) {
                                break L7;
                              } else {
                                if (var10[var8].field_a <= param2) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            param2 = var10[var8].field_a;
                            var7 = 1;
                            break L5;
                          }
                        }
                      }
                      var8++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_29_0 = var7;
                stackIn_30_0 = stackOut_29_0;
                break L3;
              }
              if (stackIn_30_0 != 0) {
                var14 = param1.a(param2, param4, param3, param5, 314572800);
                L8: while (true) {
                  L9: {
                    if (0 != var14.field_f) {
                      break L9;
                    } else {
                      wh.a(10L, 19406);
                      if (var9 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var15 = (java.awt.Frame) var14.field_e;
                  if (var15 != null) {
                    if (var14.field_f != 2) {
                      if (param0 != 4147) {
                        field_c = null;
                        return var15;
                      } else {
                        return var15;
                      }
                    } else {
                      ib.a(param1, var15, (byte) 115);
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        bh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var8 = Bounce.field_N;
          if (null == ((ed) this).field_a) {
            break L0;
          } else {
            if (0 == ((ed) this).field_a.length) {
              break L0;
            } else {
              if (((ed) this).field_a[0].field_f <= param2) {
                if (param2 > ((ed) this).field_a[((ed) this).field_a.length - 1].field_b) {
                  return -1;
                } else {
                  if (-2 == (((ed) this).field_a.length ^ -1)) {
                    return ((ed) this).field_a[0].a(param0, (byte) 110);
                  } else {
                    L1: {
                      if (param1 < -92) {
                        break L1;
                      } else {
                        int discarded$1 = ed.a(-47, (byte) 83, -109);
                        break L1;
                      }
                    }
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (((ed) this).field_a.length > var5) {
                        var6 = ((ed) this).field_a[var5];
                        stackOut_16_0 = param2;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var8 == 0) {
                          L3: {
                            if (stackIn_18_0 < var6.field_f) {
                              break L3;
                            } else {
                              if (param2 > var6.field_b) {
                                break L3;
                              } else {
                                var7 = var6.a(param0, (byte) 91);
                                if ((var7 ^ -1) == 0) {
                                  return -1;
                                } else {
                                  return var4 + var7;
                                }
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_a.length);
                          var5++;
                          continue L2;
                        } else {
                          return stackIn_17_0;
                        }
                      } else {
                        return -1;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        var7 = Bounce.field_N;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var5 >= ja.field_c.length) {
                break L2;
              } else {
                param3 = ja.field_c[var5];
                stackOut_2_0 = var5 << -1850038044;
                stackIn_9_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var7 != 0) {
                  break L1;
                } else {
                  var6 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      int incrementValue$6 = param3;
                      param3--;
                      if (incrementValue$6 == 0) {
                        break L4;
                      } else {
                        int incrementValue$7 = var6;
                        var6++;
                        param1 = lb.field_c[incrementValue$7];
                        param0[param4[param1]] = param0[param4[param1]] + 1;
                        lb.field_c[param0[param4[param1]]] = param1;
                        if (var7 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var5++;
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_8_0 = param2;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          }
          if (stackIn_9_0 < -45) {
            return;
          } else {
            tg[] discarded$8 = ed.a(85, -86, -63, -63);
            return;
          }
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        var4 = Bounce.field_N;
        if (param1 < -50) {
          L0: {
            if (param0 < param2) {
              var3 = param0;
              param0 = param2;
              param2 = var3;
              break L0;
            } else {
              break L0;
            }
          }
          L1: while (true) {
            if (0 != param2) {
              var3 = param0 % param2;
              param0 = param2;
              stackOut_7_0 = var3;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var4 == 0) {
                param2 = stackIn_9_0;
                continue L1;
              } else {
                return stackIn_8_0;
              }
            } else {
              return param0;
            }
          }
        } else {
          return 106;
        }
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        L0: {
          var10 = Bounce.field_N;
          var5 = 0;
          var6 = 0;
          var7 = param3.length();
          var8 = 0;
          if (param2 < -122) {
            break L0;
          } else {
            field_b = 40;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var7 <= var8) {
              break L2;
            } else {
              var9 = param3.charAt(var8);
              stackOut_38_0 = -61;
              stackOut_38_1 = var9 ^ -1;
              stackIn_6_0 = stackOut_38_0;
              stackIn_6_1 = stackOut_38_1;
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              if (var10 != 0) {
                if (stackIn_6_0 < stackIn_6_1) {
                  return (-param0 + param1 << 1568978088) / var5;
                } else {
                  return 0;
                }
              } else {
                stackOut_39_0 = stackIn_39_0;
                stackOut_39_1 = stackIn_39_1;
                stackIn_36_0 = stackOut_39_0;
                stackIn_36_1 = stackOut_39_1;
                L3: {
                  L4: {
                    if (stackIn_36_0 == stackIn_36_1) {
                      break L4;
                    } else {
                      L5: {
                        if (var9 == 62) {
                          break L5;
                        } else {
                          if (var6 != 0) {
                            break L3;
                          } else {
                            if (var9 != 32) {
                              break L3;
                            } else {
                              var5++;
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var6 = 0;
                      break L4;
                    }
                  }
                  var6 = 1;
                  break L3;
                }
                var8++;
                if (var10 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          if ((var5 ^ -1) < -1) {
            return (-param0 + param1 << 1568978088) / var5;
          } else {
            return 0;
          }
        }
    }

    static {
    }
}
