/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static ah field_d;
    static nn field_c;
    static int field_a;
    static String field_b;

    final static bm[] a(String param0, gn param1, byte param2, String param3) {
        if (param2 != 32) {
            field_a = 48;
        }
        int var4 = param1.c(param3, 3);
        int var5 = param1.a(var4, param0, false);
        return il.a((byte) 21, param1, var4, var5);
    }

    final static ef a(int param0, int param1, int param2, int param3, ib param4, int param5) {
        java.awt.Frame var6 = null;
        ef var7 = null;
        int var8 = 0;
        java.awt.Frame var9 = null;
        var9 = mk.a(2, param5, param1, param2, param4, param0);
        var6 = var9;
        if (var9 == null) {
          return null;
        } else {
          var8 = -92 % ((-69 - param3) / 53);
          var7 = new ef();
          var7.field_f = var9;
          java.awt.Component discarded$2 = var7.field_f.add((java.awt.Component) (Object) var7);
          var7.setBounds(0, 0, param5, param2);
          var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
          var7.requestFocus();
          return var7;
        }
    }

    final static void a(int param0, String param1) {
        sg.field_Y = param1;
        if (param0 != 16711680) {
            return;
        }
        go.a(0, 12);
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -1) {
            oc.a(-20);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
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
        int var20 = 0;
        int var21 = 0;
        L0: {
          var21 = HoldTheLine.field_D;
          if (param5 != -257) {
            break L0;
          } else {
            tc.c(param2, param1, param0, param3);
            break L0;
          }
        }
        if (-257 != param5) {
          if (-1 == (param5 ^ -1)) {
            return;
          } else {
            var7 = 84 / ((param4 - -20) / 63);
            var6 = -16711936 & param5 * (16711935 & param3);
            param3 = param5 * (param3 & 65280) & 16711680;
            param5 = -param5 + 256;
            if (param0 == 0) {
              var8 = param2;
              var9 = param1;
              var10 = var6;
              var11 = param3;
              var12 = param5;
              if (tc.field_d <= var8) {
                L1: {
                  if (tc.field_e <= var8) {
                    break L1;
                  } else {
                    if (var9 < tc.field_a) {
                      break L1;
                    } else {
                      if (var9 >= tc.field_i) {
                        break L1;
                      } else {
                        var13 = tc.field_j * var9 + var8;
                        var14 = tc.field_b[var13];
                        var15 = var10 + (-16711936 & (var14 & 16711935) * var12);
                        var14 = var11 + (16711680 & var12 * (var14 & 65280));
                        tc.field_b[var13] = kc.a(var15, var14) >>> -50711768;
                        break L1;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              L2: {
                if ((param0 ^ -1) <= -1) {
                  break L2;
                } else {
                  param0 = -param0;
                  break L2;
                }
              }
              if (tc.field_d <= param0 + param2) {
                L3: {
                  if (param2 + -param0 >= tc.field_e) {
                    break L3;
                  } else {
                    if (tc.field_a > param0 + param1) {
                      break L3;
                    } else {
                      if (-param0 + param1 < tc.field_i) {
                        L4: {
                          var8 = param2 + tc.field_j * param1;
                          var9 = var8;
                          var10 = var8 + -(tc.field_j * param0);
                          var11 = param0 * tc.field_j + var8;
                          var12 = param0;
                          var13 = 0;
                          param0 = param0 * param0;
                          var14 = -var12 + param0;
                          if (param2 - var12 < tc.field_d) {
                            break L4;
                          } else {
                            if (tc.field_a > param1) {
                              break L4;
                            } else {
                              if (tc.field_i > param1) {
                                var15 = -var12 + var8;
                                var16 = var6;
                                var17 = param3;
                                var18 = param5;
                                var19 = tc.field_b[var15];
                                var20 = var16 + ((var19 & 16711935) * var18 & -16711936);
                                var19 = var17 + (16711680 & (var19 & 65280) * var18);
                                tc.field_b[var15] = kc.a(var19, var20) >>> -339112760;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        L5: {
                          if (tc.field_e <= var12 + param2) {
                            break L5;
                          } else {
                            if (tc.field_a > param1) {
                              break L5;
                            } else {
                              if (param1 < tc.field_i) {
                                var15 = var8 + var12;
                                var16 = var6;
                                var17 = param3;
                                var18 = param5;
                                var19 = tc.field_b[var15];
                                var20 = (var18 * (16711935 & var19) & -16711936) - -var16;
                                var19 = var17 + (16711680 & (var19 & 65280) * var18);
                                tc.field_b[var15] = kc.a(var20, var19) >>> -669887512;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L6: {
                          if (tc.field_a > param1 - var12) {
                            break L6;
                          } else {
                            if (tc.field_d > param2) {
                              break L6;
                            } else {
                              if (tc.field_e <= param2) {
                                break L6;
                              } else {
                                var15 = var10;
                                var16 = var6;
                                var17 = param3;
                                var18 = param5;
                                var19 = tc.field_b[var15];
                                var20 = (var18 * (16711935 & var19) & -16711936) + var16;
                                var19 = (var18 * (var19 & 65280) & 16711680) - -var17;
                                tc.field_b[var15] = kc.a(var20, var19) >>> -1824725144;
                                break L6;
                              }
                            }
                          }
                        }
                        L7: {
                          if (var12 + param1 >= tc.field_i) {
                            break L7;
                          } else {
                            if (param2 < tc.field_d) {
                              break L7;
                            } else {
                              if (tc.field_e > param2) {
                                var15 = var11;
                                var16 = var6;
                                var17 = param3;
                                var18 = param5;
                                var19 = tc.field_b[var15];
                                var20 = var16 + (-16711936 & var18 * (var19 & 16711935));
                                var19 = var17 + (16711680 & var18 * (var19 & 65280));
                                tc.field_b[var15] = kc.a(var19, var20) >>> -1736918840;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        L8: while (true) {
                          L9: {
                            var9 = var9 + tc.field_j;
                            var13++;
                            var14 = var14 + (var13 - -var13);
                            var8 = var8 - tc.field_j;
                            if (param0 < var14) {
                              var11 = var11 - tc.field_j;
                              var12--;
                              var14 = var14 - (var12 - -var12);
                              var10 = var10 + tc.field_j;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          if (var12 < var13) {
                            return;
                          } else {
                            L10: {
                              if (tc.field_a > param1 - var12) {
                                break L10;
                              } else {
                                if (-var12 + param1 < tc.field_i) {
                                  L11: {
                                    if (tc.field_d > -var13 + param2) {
                                      break L11;
                                    } else {
                                      if (param2 - var13 < tc.field_e) {
                                        var15 = var10 + -var13;
                                        var16 = var6;
                                        var17 = param3;
                                        var18 = param5;
                                        var19 = tc.field_b[var15];
                                        var20 = var16 + (-16711936 & (16711935 & var19) * var18);
                                        var19 = var17 + (16711680 & (var19 & 65280) * var18);
                                        tc.field_b[var15] = kc.a(var19, var20) >>> -274375320;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  if (tc.field_d > var13 + param2) {
                                    break L10;
                                  } else {
                                    if (var13 + param2 >= tc.field_e) {
                                      break L10;
                                    } else {
                                      var15 = var13 + var10;
                                      var16 = var6;
                                      var17 = param3;
                                      var18 = param5;
                                      var19 = tc.field_b[var15];
                                      var20 = (-16711936 & var18 * (var19 & 16711935)) + var16;
                                      var19 = var17 + (16711680 & (var19 & 65280) * var18);
                                      tc.field_b[var15] = kc.a(var20, var19) >>> -1749387448;
                                      break L10;
                                    }
                                  }
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L12: {
                              if (-var13 + param1 < tc.field_a) {
                                break L12;
                              } else {
                                if (param1 - var13 < tc.field_i) {
                                  L13: {
                                    if (tc.field_d > param2 + -var12) {
                                      break L13;
                                    } else {
                                      if (tc.field_e <= -var12 + param2) {
                                        break L13;
                                      } else {
                                        var15 = -var12 + var8;
                                        var16 = var6;
                                        var17 = param3;
                                        var18 = param5;
                                        var19 = tc.field_b[var15];
                                        var20 = var16 + ((16711935 & var19) * var18 & -16711936);
                                        var19 = (16711680 & var18 * (var19 & 65280)) - -var17;
                                        tc.field_b[var15] = kc.a(var19, var20) >>> -1672823448;
                                        break L13;
                                      }
                                    }
                                  }
                                  if (var12 + param2 < tc.field_d) {
                                    break L12;
                                  } else {
                                    if (tc.field_e > param2 + var12) {
                                      var15 = var8 + var12;
                                      var16 = var6;
                                      var17 = param3;
                                      var18 = param5;
                                      var19 = tc.field_b[var15];
                                      var20 = (-16711936 & (16711935 & var19) * var18) + var16;
                                      var19 = (var18 * (var19 & 65280) & 16711680) - -var17;
                                      tc.field_b[var15] = kc.a(var19, var20) >>> -208251704;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                            }
                            L14: {
                              if (tc.field_a > var13 + param1) {
                                break L14;
                              } else {
                                if (tc.field_i > param1 + var13) {
                                  L15: {
                                    if (tc.field_d > -var12 + param2) {
                                      break L15;
                                    } else {
                                      if (param2 - var12 < tc.field_e) {
                                        var15 = -var12 + var9;
                                        var16 = var6;
                                        var17 = param3;
                                        var18 = param5;
                                        var19 = tc.field_b[var15];
                                        var20 = var16 + ((16711935 & var19) * var18 & -16711936);
                                        var19 = ((65280 & var19) * var18 & 16711680) - -var17;
                                        tc.field_b[var15] = kc.a(var19, var20) >>> -2135829880;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  if (param2 + var12 < tc.field_d) {
                                    break L14;
                                  } else {
                                    if (var12 + param2 >= tc.field_e) {
                                      break L14;
                                    } else {
                                      var15 = var9 + var12;
                                      var16 = var6;
                                      var17 = param3;
                                      var18 = param5;
                                      var19 = tc.field_b[var15];
                                      var20 = var16 + ((var19 & 16711935) * var18 & -16711936);
                                      var19 = ((var19 & 65280) * var18 & 16711680) - -var17;
                                      tc.field_b[var15] = kc.a(var19, var20) >>> -1544869912;
                                      break L14;
                                    }
                                  }
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (param1 + var12 < tc.field_a) {
                              continue L8;
                            } else {
                              if (param1 + var12 < tc.field_i) {
                                L16: {
                                  if (tc.field_d > param2 + -var13) {
                                    break L16;
                                  } else {
                                    if (tc.field_e <= param2 + -var13) {
                                      break L16;
                                    } else {
                                      var15 = -var13 + var11;
                                      var16 = var6;
                                      var17 = param3;
                                      var18 = param5;
                                      var19 = tc.field_b[var15];
                                      var20 = var16 + (-16711936 & var18 * (16711935 & var19));
                                      var19 = var17 + (var18 * (var19 & 65280) & 16711680);
                                      tc.field_b[var15] = kc.a(var19, var20) >>> 1174815880;
                                      break L16;
                                    }
                                  }
                                }
                                if (tc.field_d > param2 - -var13) {
                                  continue L8;
                                } else {
                                  if (tc.field_e <= var13 + param2) {
                                    continue L8;
                                  } else {
                                    var15 = var13 + var11;
                                    var16 = var6;
                                    var17 = param3;
                                    var18 = param5;
                                    var19 = tc.field_b[var15];
                                    var20 = var16 + (var18 * (16711935 & var19) & -16711936);
                                    var19 = var17 + (16711680 & var18 * (var19 & 65280));
                                    tc.field_b[var15] = kc.a(var20, var19) >>> 1078643976;
                                    continue L8;
                                  }
                                }
                              } else {
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static oe a(float param0, int param1, oe param2) {
        oe var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var3 = new oe(param2.field_e * (1.0f - param0), param2.field_b, param2.field_c);
          gk.field_d[2] = (float)param2.field_m.field_h;
          gk.field_d[1] = (float)param2.field_l.field_h;
          gk.field_d[0] = (float)param2.field_k.field_h;
          var4 = (int)lk.a(gk.field_d, 0, 2, param1 + -16711936, param0);
          if (param1 == 16711935) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        var5 = (int)lk.a(gk.field_d, 1, 1, param1 + -16711936, param0);
        gk.field_d[0] = (float)param2.field_k.field_f;
        gk.field_d[2] = (float)param2.field_m.field_f;
        gk.field_d[1] = (float)param2.field_l.field_f;
        var6 = (int)lk.a(gk.field_d, 0, 2, -1, param0);
        var7 = (int)lk.a(gk.field_d, 1, 1, param1 + -16711936, param0);
        var3.field_k = new qm(var4, var6);
        var3.field_l = new qm(var5, var7);
        var3.field_m = new qm(param2.field_m);
        return var3;
    }

    final static void a(lf param0, int param1, qi param2, int param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = HoldTheLine.field_D;
          var5 = 0;
          var6 = -1;
          if (param3 >= 111) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var7 = 1;
        L1: while (true) {
          if (param4.length() <= var7) {
            return;
          } else {
            L2: {
              var8 = param4.charAt(var7);
              if (var8 != 60) {
                break L2;
              } else {
                var6 = param0.field_c[0] + (var5 >> -50333048) - -param2.a(param4.substring(0, var7));
                break L2;
              }
            }
            L3: {
              if (var6 != -1) {
                param0.field_c[var7] = var6;
                break L3;
              } else {
                L4: {
                  if (var8 != 32) {
                    break L4;
                  } else {
                    var5 = var5 + param1;
                    break L4;
                  }
                }
                param0.field_c[var7] = (var5 >> -1045662296) + (param0.field_c[0] + (param2.a(param4.substring(0, 1 + var7)) + -param2.a((char) var8)));
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ah();
        field_b = "Unpacking music";
    }
}
