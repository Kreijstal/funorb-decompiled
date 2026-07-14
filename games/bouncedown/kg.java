/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private int field_h;
    static String field_j;
    static int field_f;
    private int field_a;
    private boolean field_c;
    static gk field_b;
    tg field_o;
    static String field_d;
    tg[] field_n;
    static boolean field_i;
    static rb field_k;
    static int[] field_g;
    private int field_l;
    private int field_m;
    private int field_e;

    final kg a(byte param0, int param1) {
        ((kg) this).field_a = param1;
        if (param0 <= 6) {
            ((kg) this).field_m = -22;
        }
        return (kg) this;
    }

    final kg a(boolean param0, byte param1) {
        int var3 = -74 / ((param1 - 63) / 40);
        ((kg) this).field_c = param0 ? true : false;
        return (kg) this;
    }

    final kg a(int param0, byte param1) {
        if (param1 > -47) {
            return null;
        }
        ((kg) this).field_h = param0;
        return (kg) this;
    }

    final void a(kg param0, byte param1) {
        param0.field_o = ((kg) this).field_o;
        param0.field_h = ((kg) this).field_h;
        param0.field_l = ((kg) this).field_l;
        if (param1 != 55) {
            field_k = null;
        }
        param0.field_n = ((kg) this).field_n;
        param0.field_c = ((kg) this).field_c;
        param0.field_a = ((kg) this).field_a;
        param0.field_m = ((kg) this).field_m;
        param0.field_e = ((kg) this).field_e;
    }

    final void a(int param0) {
        ((kg) this).field_e = 256;
        ((kg) this).field_o = null;
        ((kg) this).field_a = 0;
        if (param0 != -29776) {
            field_b = null;
        }
        ((kg) this).field_n = null;
        ((kg) this).field_h = -1;
        ((kg) this).field_m = 0;
        ((kg) this).field_l = 0;
    }

    final static tg[] a(int param0, int param1, int param2, int param3, int param4) {
        tg[] var5 = null;
        tg[] var6 = null;
        if (param3 != -2147483648) {
          return null;
        } else {
          L0: {
            var6 = new tg[9];
            var5 = var6;
            var6[6] = hc.a(param1, param2, (byte) -126);
            var5[3] = hc.a(param1, param2, (byte) -126);
            var5[2] = hc.a(param1, param2, (byte) -126);
            var5[1] = hc.a(param1, param2, (byte) -126);
            var5[0] = hc.a(param1, param2, (byte) -126);
            var6[8] = hc.a(param1, param0, (byte) -123);
            var5[7] = hc.a(param1, param0, (byte) -123);
            var5[5] = hc.a(param1, param0, (byte) -123);
            if (param4 == 0) {
              break L0;
            } else {
              var6[4] = hc.a(64, param4, (byte) -127);
              break L0;
            }
          }
          return var5;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
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
        Object var20 = null;
        L0: {
          var19 = Bounce.field_N;
          if (param3 < 0) {
            break L0;
          } else {
            if (param2 >= qk.field_g) {
              break L0;
            } else {
              L1: {
                if (param8 >= 0) {
                  break L1;
                } else {
                  if (0 <= param0) {
                    break L1;
                  } else {
                    if (param4 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param8 < qk.field_a) {
                  break L2;
                } else {
                  if (param0 < qk.field_a) {
                    break L2;
                  } else {
                    if (param4 >= qk.field_a) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var14 = param3 + -param2;
                  if (param1 == param2) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        var10 = param8 << -1644688816;
                        var9 = param8 << -1644688816;
                        var15 = -param2 + param1;
                        var11 = (param0 + -param8 << 1388755248) / var15;
                        var12 = (param4 + -param8 << -752068848) / var14;
                        if (var12 <= var11) {
                          break L6;
                        } else {
                          var13 = 0;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      var13 = 1;
                      break L5;
                    }
                    L7: {
                      L8: {
                        if (param2 < 0) {
                          L9: {
                            if (param1 >= 0) {
                              break L9;
                            } else {
                              param2 = param1 - param2;
                              var9 = var9 + param2 * var11;
                              var10 = var10 + var12 * param2;
                              param2 = param1;
                              if (0 == 0) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param2 = -param2;
                          var10 = var10 + var12 * param2;
                          var9 = var9 + param2 * var11;
                          param2 = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var16 = qk.field_b[param2];
                      L10: while (true) {
                        if (param1 <= param2) {
                          break L7;
                        } else {
                          L11: {
                            var17 = var9 >> -1467038960;
                            if (qk.field_a > var17) {
                              L12: {
                                var18 = (var10 >> -1861191888) + -(var9 >> 1677043632);
                                if (var18 != 0) {
                                  break L12;
                                } else {
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (qk.field_a <= var17) {
                                      break L11;
                                    } else {
                                      la.a(param6, 2, var18, var16 + var17, param5);
                                      if (0 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                              L13: {
                                if (qk.field_a <= var17 - -var18) {
                                  var18 = -1 + (qk.field_a + -var17);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                if (var17 >= 0) {
                                  break L14;
                                } else {
                                  la.a(param6, 2, var17 + var18, var16, param5);
                                  if (0 == 0) {
                                    break L11;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              la.a(param6, 2, var18, var17 + var16, param5);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          param2++;
                          if (param2 >= qk.field_g) {
                            return;
                          } else {
                            var10 = var10 + var12;
                            var16 = var16 + na.field_e;
                            var9 = var9 + var11;
                            if (0 == 0) {
                              continue L10;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      L16: {
                        var16 = param3 - param1;
                        if (0 != var16) {
                          break L16;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          if (0 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        L18: {
                          if (var13 != 0) {
                            break L18;
                          } else {
                            var9 = param0 << -1166011856;
                            if (0 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        var10 = param0 << -593187568;
                        break L17;
                      }
                      var17 = param4 << -1821506832;
                      var11 = (-var9 + var17) / var16;
                      var12 = (-var10 + var17) / var16;
                      break L15;
                    }
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L19: {
                  L20: {
                    if (param3 != param2) {
                      break L20;
                    } else {
                      var9 = param8 << 501187152;
                      var10 = param0 << -274827088;
                      var11 = 0;
                      var12 = 0;
                      if (0 == 0) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    var15 = param3 - param1;
                    if (param8 >= param0) {
                      break L21;
                    } else {
                      var11 = (param4 + -param8 << -141159856) / var14;
                      var10 = param0 << 847962960;
                      var12 = (-param0 + param4 << -2020974096) / var15;
                      var9 = param8 << 1194858096;
                      if (0 == 0) {
                        break L19;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var10 = param8 << 152049232;
                  var9 = param0 << 1574304240;
                  var11 = (-param0 + param4 << 952263824) / var15;
                  var12 = (-param8 + param4 << 134190288) / var14;
                  break L19;
                }
                L22: {
                  if (0 > param2) {
                    param2 = Math.min(-param2, -param2 + param1);
                    var10 = var10 + param2 * var12;
                    var9 = var9 + var11 * param2;
                    param2 = 0;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                var13 = 0;
                break L3;
              }
              L23: {
                if (param7 >= 74) {
                  break L23;
                } else {
                  var20 = null;
                  qh discarded$1 = kg.a(-100, (String) null);
                  break L23;
                }
              }
              L24: {
                if (param2 < 0) {
                  param2 = -param2;
                  var10 = var10 + var12 * param2;
                  var9 = var9 + var11 * param2;
                  param2 = 0;
                  break L24;
                } else {
                  break L24;
                }
              }
              var15 = qk.field_b[param2];
              if (param3 > param2) {
                L25: {
                  var16 = var9 >> 861681904;
                  if (qk.field_a > var16) {
                    L26: {
                      var17 = (var10 >> -1779752176) - (var9 >> -960810224);
                      if (var17 == 0) {
                        break L26;
                      } else {
                        L27: {
                          if (qk.field_a <= var17 + var16) {
                            var17 = -1 + qk.field_a + -var16;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          if (var16 < 0) {
                            break L28;
                          } else {
                            la.a(param6, 2, var17, var15 + var16, param5);
                            if (0 == 0) {
                              break L25;
                            } else {
                              break L28;
                            }
                          }
                        }
                        la.a(param6, 2, var17 + var16, var15, param5);
                        if (0 == 0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (var16 < 0) {
                      break L25;
                    } else {
                      if (qk.field_a <= var16) {
                        break L25;
                      } else {
                        la.a(param6, 2, var17, var16 - -var15, param5);
                        break L25;
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                param2++;
                if (param2 >= qk.field_g) {
                  return;
                } else {
                  var9 = var9 + var11;
                  var15 = var15 + na.field_e;
                  var10 = var10 + var12;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static qh a(int param0, String param1) {
        if (param0 != 2) {
            Object var3 = null;
            kg.a(-22, -118, -32, 113, 57, (int[]) null, 57, 112, 26);
        }
        return new qh(param1);
    }

    final void a(int param0, qi param1, lk param2, int param3, int param4) {
        int var6 = 0;
        String var7 = null;
        int var7_int = 0;
        int var8 = 0;
        tj stackIn_16_0 = null;
        String stackIn_16_1 = null;
        tj stackIn_17_0 = null;
        String stackIn_17_1 = null;
        tj stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        tj stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        tj stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        tj stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        tj stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        int stackIn_22_7 = 0;
        tj stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        tj stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        int stackIn_24_8 = 0;
        tj stackOut_15_0 = null;
        String stackOut_15_1 = null;
        tj stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        tj stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        tj stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        tj stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        tj stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        tj stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        int stackOut_21_7 = 0;
        tj stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        tj stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        int stackOut_22_8 = 0;
        L0: {
          ve.a(param2.field_m, param2.field_i + param0, ((kg) this).field_n, (byte) -128, param2.field_k, param3 + param2.field_r);
          var6 = -105 / ((74 - param4) / 44);
          if (((kg) this).field_o == null) {
            break L0;
          } else {
            L1: {
              var7_int = ((kg) this).field_a + param2.field_r + param3;
              var8 = ((kg) this).field_m + (param0 + param2.field_i);
              if (param1.field_d != 1) {
                break L1;
              } else {
                var7_int = var7_int + (param2.field_k - ((kg) this).field_o.field_t) / 2;
                break L1;
              }
            }
            L2: {
              if (1 == param1.field_p) {
                var8 = var8 + (param2.field_m - ((kg) this).field_o.field_o) / 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-3 == (param1.field_d ^ -1)) {
                var7_int = var7_int + (-((kg) this).field_o.field_t + param2.field_k);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (2 != param1.field_p) {
                break L4;
              } else {
                var8 = var8 + (param2.field_m + -((kg) this).field_o.field_o);
                break L4;
              }
            }
            ((kg) this).field_o.a(var7_int, var8);
            break L0;
          }
        }
        L5: {
          var7 = param1.a(true, param2);
          if (var7 == null) {
            break L5;
          } else {
            if (param1.field_b == null) {
              break L5;
            } else {
              if (-1 < (((kg) this).field_l ^ -1)) {
                break L5;
              } else {
                L6: {
                  stackOut_15_0 = param1.field_b;
                  stackOut_15_1 = (String) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if ((((kg) this).field_a ^ -1) != 2147483647) {
                    stackOut_17_0 = (tj) (Object) stackIn_17_0;
                    stackOut_17_1 = (String) (Object) stackIn_17_1;
                    stackOut_17_2 = ((kg) this).field_a;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L6;
                  } else {
                    stackOut_16_0 = (tj) (Object) stackIn_16_0;
                    stackOut_16_1 = (String) (Object) stackIn_16_1;
                    stackOut_16_2 = 0;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L6;
                  }
                }
                L7: {
                  stackOut_18_0 = (tj) (Object) stackIn_18_0;
                  stackOut_18_1 = (String) (Object) stackIn_18_1;
                  stackOut_18_2 = stackIn_18_2 + (param1.field_m + (param3 - -param2.field_r));
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  if (-2147483648 != ((kg) this).field_m) {
                    stackOut_20_0 = (tj) (Object) stackIn_20_0;
                    stackOut_20_1 = (String) (Object) stackIn_20_1;
                    stackOut_20_2 = stackIn_20_2;
                    stackOut_20_3 = ((kg) this).field_m;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    stackIn_21_3 = stackOut_20_3;
                    break L7;
                  } else {
                    stackOut_19_0 = (tj) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) (Object) stackIn_19_1;
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = 0;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    stackIn_21_3 = stackOut_19_3;
                    break L7;
                  }
                }
                L8: {
                  stackOut_21_0 = (tj) (Object) stackIn_21_0;
                  stackOut_21_1 = (String) (Object) stackIn_21_1;
                  stackOut_21_2 = stackIn_21_2;
                  stackOut_21_3 = stackIn_21_3 + (param0 - -param2.field_i - -param1.field_o);
                  stackOut_21_4 = -param1.field_k + -param1.field_m + param2.field_k;
                  stackOut_21_5 = -param1.field_n + -param1.field_o + param2.field_m;
                  stackOut_21_6 = ((kg) this).field_l;
                  stackOut_21_7 = ((kg) this).field_h;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  stackIn_23_4 = stackOut_21_4;
                  stackIn_23_5 = stackOut_21_5;
                  stackIn_23_6 = stackOut_21_6;
                  stackIn_23_7 = stackOut_21_7;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  stackIn_22_3 = stackOut_21_3;
                  stackIn_22_4 = stackOut_21_4;
                  stackIn_22_5 = stackOut_21_5;
                  stackIn_22_6 = stackOut_21_6;
                  stackIn_22_7 = stackOut_21_7;
                  if ((((kg) this).field_e ^ -1) != 2147483647) {
                    stackOut_23_0 = (tj) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = stackIn_23_3;
                    stackOut_23_4 = stackIn_23_4;
                    stackOut_23_5 = stackIn_23_5;
                    stackOut_23_6 = stackIn_23_6;
                    stackOut_23_7 = stackIn_23_7;
                    stackOut_23_8 = ((kg) this).field_e;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    stackIn_24_4 = stackOut_23_4;
                    stackIn_24_5 = stackOut_23_5;
                    stackIn_24_6 = stackOut_23_6;
                    stackIn_24_7 = stackOut_23_7;
                    stackIn_24_8 = stackOut_23_8;
                    break L8;
                  } else {
                    stackOut_22_0 = (tj) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = stackIn_22_3;
                    stackOut_22_4 = stackIn_22_4;
                    stackOut_22_5 = stackIn_22_5;
                    stackOut_22_6 = stackIn_22_6;
                    stackOut_22_7 = stackIn_22_7;
                    stackOut_22_8 = 256;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    stackIn_24_5 = stackOut_22_5;
                    stackIn_24_6 = stackOut_22_6;
                    stackIn_24_7 = stackOut_22_7;
                    stackIn_24_8 = stackOut_22_8;
                    break L8;
                  }
                }
                int discarded$1 = ((tj) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_24_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_24_8, param1.field_d, param1.field_p, param1.field_f);
                break L5;
              }
            }
          }
        }
    }

    final kg a(tg[] param0, int param1) {
        ((kg) this).field_n = param0;
        if (param1 != -1) {
            return null;
        }
        return (kg) this;
    }

    final kg b(int param0, byte param1) {
        if (param1 >= -30) {
            return null;
        }
        ((kg) this).field_m = param0;
        return (kg) this;
    }

    final kg a(int param0, int param1) {
        if (param1 != -2) {
            kg discarded$0 = ((kg) this).a(true, (byte) -16);
        }
        ((kg) this).field_l = param0;
        return (kg) this;
    }

    public static void a(byte param0) {
        field_k = null;
        field_j = null;
        field_g = null;
        field_d = null;
        if (param0 != -64) {
            field_d = null;
        }
        field_b = null;
    }

    final void a(kg param0, int param1, int param2, qi param3, boolean param4, lk param5) {
        if (!(!((kg) this).field_c)) {
            param0.a(param2, param3, param5, param1, -89);
            param0.a(-29776);
        }
        if (((kg) this).field_a != 2147483647) {
            param0.field_a = ((kg) this).field_a;
        }
        if (!(0 > ((kg) this).field_l)) {
            param0.field_l = ((kg) this).field_l;
        }
        if (!(null == ((kg) this).field_o)) {
            param0.field_o = ((kg) this).field_o;
        }
        if (((kg) this).field_m != -2147483648) {
            param0.field_m = ((kg) this).field_m;
        }
        if (null != ((kg) this).field_n) {
            param0.field_n = ((kg) this).field_n;
        }
        if (!((((kg) this).field_h ^ -1) > 0)) {
            param0.field_h = ((kg) this).field_h;
        }
        if ((((kg) this).field_e ^ -1) != 2147483647) {
            param0.field_e = ((kg) this).field_e;
        }
        if (param4) {
            kg discarded$0 = ((kg) this).a(-108, 126);
        }
    }

    kg() {
        ((kg) this).field_h = -2;
        ((kg) this).field_a = -2147483648;
        ((kg) this).field_o = null;
        ((kg) this).field_c = false;
        ((kg) this).field_m = -2147483648;
        ((kg) this).field_n = null;
        ((kg) this).field_e = -2147483648;
        ((kg) this).field_l = -2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = null;
        field_f = 0;
        field_d = "Create a free account to start using this feature";
        field_i = true;
        field_g = new int[8192];
    }
}
