/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    String field_a;
    static ot[] field_i;
    private int field_c;
    private oc[] field_d;
    private int field_g;
    private int field_e;
    static String field_f;
    static String[] field_j;
    static int[] field_b;
    float field_h;

    final void a(sj param0, byte param1, String param2, String param3) {
        this.a(18476, param0, (String) null, param2, param3, -1);
        if (param1 > -105) {
            ((qe) this).field_c = -99;
        }
    }

    private final void a(int param0, int param1, oc param2) {
        float var4 = (float)(((qe) this).field_g + 1) + (float)param1 / 100.0f;
        if (param1 == 0) {
            ((qe) this).field_a = param2.field_d;
        } else {
            ((qe) this).field_a = param2.field_c + " - " + param1 + "%";
        }
        ((qe) this).field_h = (float)((qe) this).field_c * var4 / (float)(1 + ((qe) this).field_e);
        if (param0 != -1) {
            field_i = null;
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var2 = param1.charAt(0);
        if (!param0) {
            return true;
        }
        for (var3 = 1; var3 < param1.length(); var3++) {
            if (!(param1.charAt(var3) == var2)) {
                return false;
            }
        }
        return true;
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
        var19 = Kickabout.field_G;
        if (param3 < 0) {
          return;
        } else {
          if (t.field_k <= param6) {
            return;
          } else {
            L0: {
              if (param7 >= 0) {
                break L0;
              } else {
                if (param8 >= 0) {
                  break L0;
                } else {
                  if (param1 >= 0) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            L1: {
              if (param7 < t.field_b) {
                break L1;
              } else {
                if (t.field_b > param8) {
                  break L1;
                } else {
                  if (t.field_b > param1) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            L2: {
              if (param2 == -2178) {
                break L2;
              } else {
                field_b = null;
                break L2;
              }
            }
            L3: {
              L4: {
                var14 = -param6 + param3;
                if (param6 == param0) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      var10 = param7 << -902170160;
                      var9 = param7 << -902170160;
                      var15 = param0 + -param6;
                      var12 = (param1 + -param7 << -1480300944) / var14;
                      var11 = (-param7 + param8 << 390335536) / var15;
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
                      if (param6 >= 0) {
                        var16 = t.field_q[param6];
                        L9: while (true) {
                          if (param6 >= param0) {
                            break L7;
                          } else {
                            L10: {
                              var17 = var9 >> 1965741968;
                              if ((t.field_b ^ -1) >= (var17 ^ -1)) {
                                break L10;
                              } else {
                                L11: {
                                  var18 = (var10 >> 1183118480) - (var9 >> -274950320);
                                  if (0 != var18) {
                                    break L11;
                                  } else {
                                    if (var17 < 0) {
                                      break L10;
                                    } else {
                                      if (var17 < t.field_b) {
                                        vj.a(param5, var17 + var16, var18, param4, -26);
                                        if (0 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                L12: {
                                  if (var18 + var17 >= t.field_b) {
                                    var18 = -1 + -var17 + t.field_b;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (var17 < 0) {
                                    break L13;
                                  } else {
                                    vj.a(param5, var16 + var17, var18, param4, 102);
                                    if (0 == 0) {
                                      break L10;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                vj.a(param5, var16, var18 + var17, param4, 108);
                                break L10;
                              }
                            }
                            param6++;
                            if (param6 < t.field_k) {
                              var10 = var10 + var12;
                              var9 = var9 + var11;
                              var16 = var16 + on.field_g;
                              if (0 == 0) {
                                continue L9;
                              } else {
                                break L8;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        L14: {
                          if (param0 >= 0) {
                            break L14;
                          } else {
                            param6 = -param6 + param0;
                            var9 = var9 + param6 * var11;
                            var10 = var10 + var12 * param6;
                            param6 = param0;
                            if (0 == 0) {
                              break L7;
                            } else {
                              break L14;
                            }
                          }
                        }
                        param6 = -param6;
                        var9 = var9 + param6 * var11;
                        var10 = var10 + var12 * param6;
                        param6 = 0;
                        break L8;
                      }
                    }
                    var16 = t.field_q[param6];
                    L15: while (true) {
                      if (param6 >= param0) {
                        break L7;
                      } else {
                        L16: {
                          var17 = var9 >> 1965741968;
                          if ((t.field_b ^ -1) >= (var17 ^ -1)) {
                            break L16;
                          } else {
                            L17: {
                              var18 = (var10 >> 1183118480) - (var9 >> -274950320);
                              if (0 != var18) {
                                break L17;
                              } else {
                                if (var17 < 0) {
                                  break L16;
                                } else {
                                  if (var17 < t.field_b) {
                                    vj.a(param5, var17 + var16, var18, param4, -26);
                                    if (0 == 0) {
                                      break L16;
                                    } else {
                                      break L17;
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            L18: {
                              if (var18 + var17 >= t.field_b) {
                                var18 = -1 + -var17 + t.field_b;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (var17 < 0) {
                                break L19;
                              } else {
                                vj.a(param5, var16 + var17, var18, param4, 102);
                                if (0 == 0) {
                                  break L16;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            vj.a(param5, var16, var18 + var17, param4, 108);
                            break L16;
                          }
                        }
                        param6++;
                        if (param6 < t.field_k) {
                          var10 = var10 + var12;
                          var9 = var9 + var11;
                          var16 = var16 + on.field_g;
                          if (0 == 0) {
                            continue L15;
                          } else {
                            break L7;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L20: {
                    L21: {
                      var16 = -param0 + param3;
                      if (var16 != 0) {
                        break L21;
                      } else {
                        var11 = 0;
                        var12 = 0;
                        if (0 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    L22: {
                      L23: {
                        var17 = param1 << 1617128112;
                        if (var13 == 0) {
                          break L23;
                        } else {
                          var10 = param8 << 1791473840;
                          if (0 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var9 = param8 << 841152336;
                      break L22;
                    }
                    var11 = (-var9 + var17) / var16;
                    var12 = (var17 - var10) / var16;
                    break L20;
                  }
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L24: {
                L25: {
                  if (param6 == param3) {
                    break L25;
                  } else {
                    L26: {
                      L27: {
                        var15 = param3 + -param0;
                        if (param8 <= param7) {
                          break L27;
                        } else {
                          var11 = (-param7 + param1 << 1181281840) / var14;
                          var10 = param8 << -468342160;
                          var12 = (param1 - param8 << -2134772944) / var15;
                          var9 = param7 << 2074179664;
                          if (0 == 0) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      var11 = (-param8 + param1 << -288919280) / var15;
                      var9 = param8 << 990497808;
                      var10 = param7 << -529280880;
                      var12 = (-param7 + param1 << 1306325648) / var14;
                      break L26;
                    }
                    if (0 == 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                var12 = 0;
                var9 = param7 << -289398192;
                var11 = 0;
                var10 = param8 << 1655104560;
                break L24;
              }
              L28: {
                if (param6 < 0) {
                  param6 = Math.min(-param6, -param6 + param0);
                  var9 = var9 + param6 * var11;
                  var10 = var10 + var12 * param6;
                  param6 = 0;
                  break L28;
                } else {
                  break L28;
                }
              }
              var13 = 0;
              break L3;
            }
            L29: {
              if (param6 < 0) {
                param6 = -param6;
                var10 = var10 + param6 * var12;
                var9 = var9 + param6 * var11;
                param6 = 0;
                break L29;
              } else {
                break L29;
              }
            }
            var15 = t.field_q[param6];
            L30: while (true) {
              L31: {
                if (param6 >= param3) {
                  break L31;
                } else {
                  L32: {
                    var16 = var9 >> -1222022896;
                    if (var16 < t.field_b) {
                      L33: {
                        var17 = (var10 >> -1167934576) + -(var9 >> -1104617264);
                        if (var17 == 0) {
                          break L33;
                        } else {
                          L34: {
                            if (t.field_b > var16 - -var17) {
                              break L34;
                            } else {
                              var17 = t.field_b + (-var16 - 1);
                              break L34;
                            }
                          }
                          L35: {
                            if (var16 < 0) {
                              break L35;
                            } else {
                              vj.a(param5, var16 + var15, var17, param4, param2 ^ -2285);
                              if (0 == 0) {
                                break L32;
                              } else {
                                break L35;
                              }
                            }
                          }
                          vj.a(param5, var15, var17 + var16, param4, 114);
                          if (0 == 0) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      if (0 > var16) {
                        break L32;
                      } else {
                        if (var16 < t.field_b) {
                          vj.a(param5, var15 + var16, var17, param4, 104);
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                    } else {
                      break L32;
                    }
                  }
                  param6++;
                  if (t.field_k <= param6) {
                    return;
                  } else {
                    var9 = var9 + var11;
                    var15 = var15 + on.field_g;
                    var10 = var10 + var12;
                    if (0 == 0) {
                      continue L30;
                    } else {
                      break L31;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        oc var4 = null;
        L0: {
          var3 = Kickabout.field_G;
          if (param0 == 1183118480) {
            break L0;
          } else {
            ((qe) this).field_h = 2.4517242908477783f;
            break L0;
          }
        }
        L1: while (true) {
          if (((qe) this).field_g >= ((qe) this).field_e) {
            return true;
          } else {
            var4 = ((qe) this).field_d[((qe) this).field_g];
            if (!var4.field_h.d(-118)) {
              this.a(-1, 0, var4);
              return false;
            } else {
              L2: {
                if (0 > var4.field_a) {
                  break L2;
                } else {
                  if (var4.field_h.b((byte) 20, var4.field_a)) {
                    break L2;
                  } else {
                    this.a(-1, var4.field_h.b(var4.field_a, (byte) 56), var4);
                    return false;
                  }
                }
              }
              L3: {
                if (null == var4.field_g) {
                  break L3;
                } else {
                  if (var4.field_h.a(false, var4.field_g)) {
                    break L3;
                  } else {
                    this.a(-1, var4.field_h.a(var4.field_g, -16248), var4);
                    return false;
                  }
                }
              }
              L4: {
                if (var4.field_a >= 0) {
                  break L4;
                } else {
                  if (null != var4.field_g) {
                    break L4;
                  } else {
                    if (var4.field_c == null) {
                      break L4;
                    } else {
                      if (!var4.field_h.a(false)) {
                        this.a(param0 + -1183118481, var4.field_h.e(param0 ^ -1183116137), var4);
                        return false;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              ((qe) this).field_g = ((qe) this).field_g + 1;
              continue L1;
            }
          }
        }
    }

    final void a(sj param0, String param1, int param2, String param3, String param4) {
        if (param2 != -6869) {
            return;
        }
        this.a(param2 ^ -21241, param0, param3, param1, param4, -1);
    }

    private final void a(int param0, sj param1, String param2, String param3, String param4, int param5) {
        oc[] var9 = null;
        if (((qe) this).field_d.length <= ((qe) this).field_e) {
            var9 = new oc[2 * ((qe) this).field_e];
            oc[] var7 = var9;
            dv.a((Object[]) (Object) ((qe) this).field_d, 0, (Object[]) (Object) var9, 0, ((qe) this).field_e);
            ((qe) this).field_d = var9;
        }
        oc var8 = new oc();
        oc var10 = var8;
        oc var7_ref = var10;
        var10.field_d = param4;
        var10.field_h = param1;
        var10.field_g = param2;
        var10.field_c = param3;
        var10.field_a = param5;
        ((qe) this).field_e = ((qe) this).field_e + 1;
        ((qe) this).field_d[((qe) this).field_e] = var8;
        if (param0 != 18476) {
            ((qe) this).field_d = null;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            qe.a(true);
        }
        field_b = null;
        field_f = null;
        field_i = null;
        field_j = null;
    }

    final void a(String param0, sj param1, int param2) {
        if (param2 >= -67) {
            Object var5 = null;
            ((qe) this).a((String) null, (sj) null, -7);
        }
        this.a(18476, param1, (String) null, (String) null, param0, -1);
    }

    qe(int param0) {
        ((qe) this).field_d = new oc[16];
        ((qe) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This kit was unlocked by the \"<%0>\" achievement.";
        field_j = new String[]{"total tackles", "total success", "total off ball", "times tackled"};
        field_b = new int[1024];
    }
}
