/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends pb {
    private int field_o;
    private hg field_l;
    static String field_m;
    static int field_n;

    w(int param0) {
        super(param0);
    }

    final void b(int[] param0, int param1) {
        ((w) this).field_l = new hg(param0);
        if (param1 != 8) {
            Object var4 = null;
            ((w) this).b((int[]) null, 66);
        }
    }

    final void g(int param0) {
        ((w) this).field_i = (7 + ((w) this).field_o) / param0;
    }

    final void f(boolean param0) {
        if (!param0) {
            field_m = null;
        }
        ((w) this).field_o = ((w) this).field_i * 8;
    }

    final int g(byte param0) {
        int var2 = 118 % ((39 - param0) / 51);
        int fieldTemp$0 = ((w) this).field_i;
        ((w) this).field_i = ((w) this).field_i + 1;
        return ((w) this).field_g[fieldTemp$0] + -((w) this).field_l.b(-1427) & 255;
    }

    final void b(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Main.field_T;
        for (var5 = 0; var5 < param3; var5++) {
            int fieldTemp$0 = ((w) this).field_i;
            ((w) this).field_i = ((w) this).field_i + 1;
            param1[var5 - -param0] = (byte)(((w) this).field_g[fieldTemp$0] + -((w) this).field_l.b(-1427));
        }
        if (param2 != 28040) {
            ((w) this).field_l = null;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8) {
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
        var19 = Main.field_T;
        if (param8 < 0) {
          return;
        } else {
          if (param7 < jb.field_c) {
            L0: {
              if (param3 >= 0) {
                break L0;
              } else {
                if (param5 >= 0) {
                  break L0;
                } else {
                  if (param6 >= 0) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            L1: {
              if (jb.field_i > param3) {
                break L1;
              } else {
                if (jb.field_i > param5) {
                  break L1;
                } else {
                  if (param6 < jb.field_i) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            L2: {
              L3: {
                var14 = -param7 + param8;
                if (param7 != param2) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (param8 != param7) {
                        break L5;
                      } else {
                        var10 = param5 << -171030864;
                        var9 = param3 << -342130352;
                        var11 = 0;
                        var12 = 0;
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      var15 = -param2 + param8;
                      if (param5 <= param3) {
                        break L6;
                      } else {
                        var12 = (param6 - param5 << 1915311568) / var15;
                        var11 = (-param3 + param6 << -1563375376) / var14;
                        var10 = param5 << -418156464;
                        var9 = param3 << 1625150224;
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var11 = (param6 + -param5 << 1448938576) / var15;
                    var12 = (param6 - param3 << -983630128) / var14;
                    var10 = param3 << -1122911280;
                    var9 = param5 << -875206032;
                    break L4;
                  }
                  L7: {
                    if (param7 >= 0) {
                      break L7;
                    } else {
                      param7 = Math.min(-param7, -param7 + param2);
                      var9 = var9 + param7 * var11;
                      var10 = var10 + var12 * param7;
                      param7 = 0;
                      break L7;
                    }
                  }
                  var13 = 0;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L8: {
                L9: {
                  var10 = param3 << -1196895312;
                  var9 = param3 << -1196895312;
                  var15 = -param7 + param2;
                  var11 = (-param3 + param5 << -1542351056) / var15;
                  var12 = (param6 - param3 << 526374192) / var14;
                  if (var12 <= var11) {
                    break L9;
                  } else {
                    var13 = 0;
                    if (0 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
                break L8;
              }
              L10: {
                L11: {
                  if (param7 >= 0) {
                    break L11;
                  } else {
                    L12: {
                      if (param2 < 0) {
                        break L12;
                      } else {
                        param7 = -param7;
                        var10 = var10 + param7 * var12;
                        var9 = var9 + param7 * var11;
                        param7 = 0;
                        if (0 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    param7 = -param7 + param2;
                    var9 = var9 + var11 * param7;
                    var10 = var10 + param7 * var12;
                    param7 = param2;
                    if (0 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                var16 = jb.field_e[param7];
                L13: while (true) {
                  if (param2 <= param7) {
                    break L10;
                  } else {
                    L14: {
                      var17 = var9 >> 1629721200;
                      if ((jb.field_i ^ -1) < (var17 ^ -1)) {
                        L15: {
                          var18 = (var10 >> 1635339920) + -(var9 >> 115586896);
                          if (0 != var18) {
                            break L15;
                          } else {
                            if (var17 < 0) {
                              break L14;
                            } else {
                              if (var17 < jb.field_i) {
                                a.a(var16 + var17, param1, var18, param0, -1483723263);
                                if (0 == 0) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L16: {
                          if (jb.field_i > var18 + var17) {
                            break L16;
                          } else {
                            var18 = -var17 + (jb.field_i + -1);
                            break L16;
                          }
                        }
                        L17: {
                          if (var17 >= 0) {
                            break L17;
                          } else {
                            a.a(var16, param1, var17 + var18, param0, -1483723263);
                            if (0 == 0) {
                              break L14;
                            } else {
                              break L17;
                            }
                          }
                        }
                        a.a(var16 + var17, param1, var18, param0, -1483723263);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    param7++;
                    if (param7 >= jb.field_c) {
                      return;
                    } else {
                      var9 = var9 + var11;
                      var16 = var16 + vj.field_l;
                      var10 = var10 + var12;
                      if (0 == 0) {
                        continue L13;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
              }
              L18: {
                var16 = -param2 + param8;
                if (var16 != 0) {
                  break L18;
                } else {
                  var12 = 0;
                  var11 = 0;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                L20: {
                  var17 = param6 << 457183024;
                  if (var13 == 0) {
                    break L20;
                  } else {
                    var10 = param5 << -758415184;
                    if (0 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var9 = param5 << 259350512;
                break L19;
              }
              var11 = (-var9 + var17) / var16;
              var12 = (-var10 + var17) / var16;
              break L2;
            }
            L21: {
              if (param7 >= 0) {
                break L21;
              } else {
                param7 = -param7;
                var10 = var10 + param7 * var12;
                var9 = var9 + param7 * var11;
                param7 = 0;
                break L21;
              }
            }
            var15 = jb.field_e[param7];
            if (param4) {
              L22: while (true) {
                L23: {
                  if (param7 >= param8) {
                    break L23;
                  } else {
                    L24: {
                      var16 = var9 >> -1047242832;
                      if (jb.field_i <= var16) {
                        break L24;
                      } else {
                        L25: {
                          var17 = (var10 >> 807594160) + -(var9 >> 1482364912);
                          if (var17 != 0) {
                            break L25;
                          } else {
                            if (var16 < 0) {
                              break L24;
                            } else {
                              if (var16 < jb.field_i) {
                                a.a(var16 - -var15, param1, var17, param0, -1483723263);
                                if (0 == 0) {
                                  break L24;
                                } else {
                                  break L25;
                                }
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                        L26: {
                          if (jb.field_i > var17 + var16) {
                            break L26;
                          } else {
                            var17 = -1 + (jb.field_i + -var16);
                            break L26;
                          }
                        }
                        L27: {
                          if (0 <= var16) {
                            break L27;
                          } else {
                            a.a(var15, param1, var17 + var16, param0, -1483723263);
                            if (0 == 0) {
                              break L24;
                            } else {
                              break L27;
                            }
                          }
                        }
                        a.a(var15 + var16, param1, var17, param0, -1483723263);
                        break L24;
                      }
                    }
                    param7++;
                    if (param7 >= jb.field_c) {
                      return;
                    } else {
                      var9 = var9 + var11;
                      var15 = var15 + vj.field_l;
                      var10 = var10 + var12;
                      if (0 == 0) {
                        continue L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void h(int param0, int param1) {
        if (param1 != 0) {
            return;
        }
        int fieldTemp$0 = ((w) this).field_i;
        ((w) this).field_i = ((w) this).field_i + 1;
        ((w) this).field_g[fieldTemp$0] = (byte)(param0 + ((w) this).field_l.b(-1427));
    }

    public static void h(int param0) {
        field_m = null;
        if (param0 <= 18) {
            w.a((int[]) null, -109, -96, -41, true, 32, 55, -64, -115);
        }
    }

    w(byte[] param0) {
        super(param0);
    }

    final int g(int param0, int param1) {
        int var6 = Main.field_T;
        if (param1 != -1) {
            return 42;
        }
        int var3 = ((w) this).field_o >> -679251997;
        int var4 = 8 + -(((w) this).field_o & 7);
        ((w) this).field_o = ((w) this).field_o + param0;
        int var5 = 0;
        while (var4 < param0) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((w) this).field_g[incrementValue$0] & sg.field_g[var4]) << param0 - var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (var4 != param0) {
            var5 = var5 + (((w) this).field_g[var3] >> -param0 + var4 & sg.field_g[param0]);
        } else {
            var5 = var5 + (((w) this).field_g[var3] & sg.field_g[var4]);
        }
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Play the game without logging in just yet";
    }
}
