/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends li {
    static mn field_v;
    static String field_p;
    static boolean[] field_t;
    static er[] field_o;
    int field_r;
    static cr field_n;
    static String field_u;
    static String[] field_q;
    int field_s;

    public static void a(int param0) {
        field_t = null;
        field_n = null;
        field_u = null;
        field_v = null;
        field_p = null;
        field_o = null;
        field_q = null;
    }

    final static void b(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = Vertigo2.field_L ? 1 : 0;
            if (param0) {
              break L1;
            } else {
              if (null == gd.field_j) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          im.field_g = false;
          break L0;
        }
        L2: {
          if (param0) {
            if (rk.field_y <= 0) {
              if (ko.field_P > 0) {
                ko.field_P = ko.field_P - 1;
                break L2;
              } else {
                if (0 >= mp.field_b) {
                  break L2;
                } else {
                  mp.field_b = mp.field_b - 1;
                  break L2;
                }
              }
            } else {
              rk.field_y = rk.field_y - 1;
              break L2;
            }
          } else {
            if (null != gd.field_j) {
              if (0 >= rk.field_y) {
                if (ko.field_P > 0) {
                  ko.field_P = ko.field_P - 1;
                  break L2;
                } else {
                  if (ld.field_b > mp.field_b) {
                    L3: {
                      if (0 == mp.field_b) {
                        ed.a(false, false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    mp.field_b = mp.field_b + 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                rk.field_y = rk.field_y - 1;
                break L2;
              }
            } else {
              if (sj.field_d != null) {
                if (rk.field_y <= 0) {
                  if (0 < mp.field_b) {
                    mp.field_b = mp.field_b - 1;
                    break L2;
                  } else {
                    if (ko.field_P < ld.field_b) {
                      L4: {
                        if (ko.field_P != 0) {
                          break L4;
                        } else {
                          ed.a(true, false);
                          break L4;
                        }
                      }
                      ko.field_P = ko.field_P + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  rk.field_y = rk.field_y - 1;
                  break L2;
                }
              } else {
                im.field_g = false;
                if (0 >= ko.field_P) {
                  if (0 >= mp.field_b) {
                    if (rk.field_y >= ld.field_b) {
                      break L2;
                    } else {
                      L5: {
                        if (rk.field_y == 0) {
                          ne.c(false);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      rk.field_y = rk.field_y + 1;
                      break L2;
                    }
                  } else {
                    mp.field_b = mp.field_b - 1;
                    break L2;
                  }
                } else {
                  ko.field_P = ko.field_P - 1;
                  break L2;
                }
              }
            }
          }
        }
        L6: {
          if (param1 <= -113) {
            break L6;
          } else {
            char discarded$1 = mn.a((byte) 97, -80);
            break L6;
          }
        }
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        float var1_float = 0.0f;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21_double = 0.0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        double var23_double = 0.0;
        int var24 = 0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        int var31 = 0;
        int[] var32 = null;
        int[] var33 = null;
        RuntimeException decompiledCaughtException = null;
        var31 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1_float = 1.399999976158142f;
            oo.b(var1_float);
            var2 = 0;
            L1: while (true) {
              if (var2 >= bm.field_G.length) {
                var1_float = 1.399999976158142f;
                var2 = 0;
                L2: while (true) {
                  if (var2 >= Vertigo2.field_J.length) {
                    oo.c();
                    break L0;
                  } else {
                    var33 = Vertigo2.field_J[var2];
                    var4 = 0;
                    var5 = 512;
                    var1_float = var1_float + 0.07000000029802322f;
                    var6 = var4 * 128;
                    var7 = var4;
                    L3: while (true) {
                      if (var7 >= var5) {
                        var2++;
                        continue L2;
                      } else {
                        var8 = (double)(var7 >> 3) / 64.0 + 0.0078125;
                        var10 = (double)(7 & var7) / 8.0 + 0.0625;
                        var12 = 0;
                        L4: while (true) {
                          if (var12 >= 128) {
                            var7++;
                            continue L3;
                          } else {
                            L5: {
                              var13 = (double)var12 / 128.0;
                              var15 = var13;
                              var17 = var13;
                              var19 = var13;
                              if (var10 == 0.0) {
                                break L5;
                              } else {
                                L6: {
                                  if (var13 < 0.5) {
                                    var21_double = var13 * (1.0 + var10);
                                    break L6;
                                  } else {
                                    var21_double = var10 + var13 - var13 * var10;
                                    break L6;
                                  }
                                }
                                L7: {
                                  var23_double = 2.0 * var13 - var21_double;
                                  var25 = var8 + 0.3333333333333333;
                                  if (1.0 < var25) {
                                    var25 = var25 - 1.0;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                L8: {
                                  var27 = var8;
                                  var29 = var8 - 0.3333333333333333;
                                  if (1.0 <= var27 * 6.0) {
                                    if (1.0 <= 2.0 * var27) {
                                      if (2.0 > 3.0 * var27) {
                                        var17 = var23_double + 6.0 * ((-var23_double + var21_double) * (0.6666666666666666 - var27));
                                        break L8;
                                      } else {
                                        var17 = var23_double;
                                        break L8;
                                      }
                                    } else {
                                      var17 = var21_double;
                                      break L8;
                                    }
                                  } else {
                                    var17 = var27 * ((-var23_double + var21_double) * 6.0) + var23_double;
                                    break L8;
                                  }
                                }
                                L9: {
                                  if (1.0 > var25 * 6.0) {
                                    var15 = var23_double + var25 * ((var21_double - var23_double) * 6.0);
                                    break L9;
                                  } else {
                                    if (1.0 <= var25 * 2.0) {
                                      if (var25 * 3.0 < 2.0) {
                                        var15 = 6.0 * ((var21_double - var23_double) * (-var25 + 0.6666666666666666)) + var23_double;
                                        break L9;
                                      } else {
                                        var15 = var23_double;
                                        break L9;
                                      }
                                    } else {
                                      var15 = var21_double;
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (var29 < 0.0) {
                                    var29 = var29 + 1.0;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                if (1.0 > 6.0 * var29) {
                                  var19 = var29 * (6.0 * (var21_double - var23_double)) + var23_double;
                                  break L5;
                                } else {
                                  if (2.0 * var29 >= 1.0) {
                                    if (var29 * 3.0 >= 2.0) {
                                      var19 = var23_double;
                                      break L5;
                                    } else {
                                      var19 = var23_double + 6.0 * ((0.6666666666666666 - var29) * (-var23_double + var21_double));
                                      break L5;
                                    }
                                  } else {
                                    var19 = var21_double;
                                    break L5;
                                  }
                                }
                              }
                            }
                            L11: {
                              var15 = Math.pow(var15, (double)var1_float);
                              var17 = Math.pow(var17, (double)var1_float);
                              var19 = Math.pow(var19, (double)var1_float);
                              var21 = (int)(256.0 * var15);
                              var22 = (int)(256.0 * var17);
                              var23 = (int)(var19 * 256.0);
                              var24 = (var22 << 8) + ((var21 << 16) - -var23);
                              if (0 != var24) {
                                break L11;
                              } else {
                                var24 = 1;
                                break L11;
                              }
                            }
                            int incrementValue$2 = var6;
                            var6++;
                            var33[incrementValue$2] = var24;
                            var12++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var32 = bm.field_G[var2];
                var4 = 0;
                var5 = 512;
                var6 = var4 * 128;
                var1_float = var1_float - 0.10000000149011612f;
                var7 = var4;
                L12: while (true) {
                  if (var7 >= var5) {
                    var2++;
                    continue L1;
                  } else {
                    var8 = (double)(var7 >> 3) / 64.0 + 0.0078125;
                    var10 = (double)(var7 & 7) / 8.0 + 0.0625;
                    var12 = 0;
                    L13: while (true) {
                      if (var12 >= 128) {
                        var7++;
                        continue L12;
                      } else {
                        L14: {
                          var13 = (double)var12 / 128.0;
                          var15 = var13;
                          var17 = var13;
                          var19 = var13;
                          if (var10 != 0.0) {
                            L15: {
                              if (0.5 > var13) {
                                var21_double = (var10 + 1.0) * var13;
                                break L15;
                              } else {
                                var21_double = var13 + var10 - var13 * var10;
                                break L15;
                              }
                            }
                            L16: {
                              var23_double = var13 * 2.0 - var21_double;
                              var25 = 0.3333333333333333 + var8;
                              if (1.0 >= var25) {
                                break L16;
                              } else {
                                var25 = var25 - 1.0;
                                break L16;
                              }
                            }
                            L17: {
                              var27 = var8;
                              var29 = var8 - 0.3333333333333333;
                              if (var27 * 6.0 >= 1.0) {
                                if (1.0 > 2.0 * var27) {
                                  var17 = var21_double;
                                  break L17;
                                } else {
                                  if (2.0 <= 3.0 * var27) {
                                    var17 = var23_double;
                                    break L17;
                                  } else {
                                    var17 = var23_double + 6.0 * ((0.6666666666666666 - var27) * (-var23_double + var21_double));
                                    break L17;
                                  }
                                }
                              } else {
                                var17 = var27 * ((-var23_double + var21_double) * 6.0) + var23_double;
                                break L17;
                              }
                            }
                            L18: {
                              if (1.0 <= 6.0 * var25) {
                                if (2.0 * var25 >= 1.0) {
                                  if (3.0 * var25 < 2.0) {
                                    var15 = (-var25 + 0.6666666666666666) * (-var23_double + var21_double) * 6.0 + var23_double;
                                    break L18;
                                  } else {
                                    var15 = var23_double;
                                    break L18;
                                  }
                                } else {
                                  var15 = var21_double;
                                  break L18;
                                }
                              } else {
                                var15 = var23_double + (-var23_double + var21_double) * 6.0 * var25;
                                break L18;
                              }
                            }
                            L19: {
                              if (0.0 > var29) {
                                var29 = var29 + 1.0;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            if (var29 * 6.0 < 1.0) {
                              var19 = var23_double + var29 * ((-var23_double + var21_double) * 6.0);
                              break L14;
                            } else {
                              if (2.0 * var29 < 1.0) {
                                var19 = var21_double;
                                break L14;
                              } else {
                                if (2.0 <= var29 * 3.0) {
                                  var19 = var23_double;
                                  break L14;
                                } else {
                                  var19 = var23_double + (var21_double - var23_double) * (-var29 + 0.6666666666666666) * 6.0;
                                  break L14;
                                }
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                        L20: {
                          var15 = Math.pow(var15, (double)var1_float);
                          var17 = Math.pow(var17, (double)var1_float);
                          var19 = Math.pow(var19, (double)var1_float);
                          var21 = (int)(var15 * 256.0);
                          var22 = (int)(256.0 * var17);
                          var23 = (int)(256.0 * var19);
                          var24 = var23 + (var21 << 16) - -(var22 << 8);
                          if (0 == var24) {
                            var24 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        int incrementValue$3 = var6;
                        var6++;
                        var32[incrementValue$3] = var24;
                        var12++;
                        continue L13;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "mn.D(" + 0 + 41);
        }
    }

    final static void b(int param0, int param1) {
        if (rr.field_z[param1]) {
            eg.a(85, rr.field_B[param1]);
            rr.field_z[param1] = false;
        }
        if (param0 != 6) {
            mn.b(true, -91);
        }
    }

    final static char a(byte param0, int param1) {
        int var4 = 0;
        int var2 = -54 / ((param1 - 8) / 40);
        int var3 = param0 & 255;
        if (var3 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var3, 16));
        }
        if (var3 >= 128) {
            if (var3 < 160) {
                var4 = fa.field_o[var3 + -128];
                if (!(var4 != 0)) {
                    var4 = 63;
                }
                var3 = var4;
            }
        }
        return (char)var3;
    }

    mn(int param0, int param1) {
        ((mn) this).field_r = param0;
        ((mn) this).field_s = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new mn(0, 0);
        field_p = "<%0> has left.";
        field_u = "This password contains your email address, and would be easy to guess";
    }
}
