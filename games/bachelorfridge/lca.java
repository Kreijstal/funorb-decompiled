/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lca extends bca {
    static int field_s;
    static String field_r;
    private nq field_q;

    final static void a(int param0, int param1, byte param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
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
        L0: {
          var19 = BachelorFridge.field_y;
          if (0 > param0) {
            break L0;
          } else {
            if (param4 >= jb.field_n) {
              break L0;
            } else {
              L1: {
                if (param1 >= 0) {
                  break L1;
                } else {
                  if (param7 >= 0) {
                    break L1;
                  } else {
                    if (param8 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param1 < jb.field_o) {
                  break L2;
                } else {
                  if (jb.field_o > param7) {
                    break L2;
                  } else {
                    if (jb.field_o > param8) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                if (param2 < -72) {
                  break L3;
                } else {
                  field_r = null;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var14 = -param4 + param0;
                  if (param4 == param5) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param1 << 157472304;
                        var9 = param1 << 157472304;
                        var15 = param5 + -param4;
                        var11 = (param7 - param1 << 353575440) / var15;
                        var12 = (param8 - param1 << -1888234288) / var14;
                        if (var11 >= var12) {
                          break L7;
                        } else {
                          var13 = 0;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var13 = 1;
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param4 >= 0) {
                          break L9;
                        } else {
                          L10: {
                            if (0 > param5) {
                              break L10;
                            } else {
                              param4 = -param4;
                              var9 = var9 + param4 * var11;
                              var10 = var10 + var12 * param4;
                              param4 = 0;
                              if (0 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param4 = param5 + -param4;
                          var9 = var9 + param4 * var11;
                          var10 = var10 + var12 * param4;
                          param4 = param5;
                          if (0 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var16 = jb.field_a[param4];
                      L11: while (true) {
                        if (param5 <= param4) {
                          break L8;
                        } else {
                          L12: {
                            var17 = var9 >> -365039184;
                            if ((jb.field_o ^ -1) >= (var17 ^ -1)) {
                              break L12;
                            } else {
                              L13: {
                                var18 = (var10 >> 1837019184) - (var9 >> -1669086896);
                                if (0 != var18) {
                                  break L13;
                                } else {
                                  if (var17 < 0) {
                                    break L12;
                                  } else {
                                    if (jb.field_o <= var17) {
                                      break L12;
                                    } else {
                                      ek.a(var18, param3, param6, (byte) -127, var17 - -var16);
                                      if (0 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              L14: {
                                if (var17 + var18 >= jb.field_o) {
                                  var18 = -var17 + (jb.field_o - 1);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              L15: {
                                if (var17 >= 0) {
                                  break L15;
                                } else {
                                  ek.a(var17 + var18, param3, param6, (byte) 127, var16);
                                  if (0 == 0) {
                                    break L12;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              ek.a(var18, param3, param6, (byte) 109, var17 + var16);
                              break L12;
                            }
                          }
                          param4++;
                          if (param4 < jb.field_n) {
                            var16 = var16 + dg.field_i;
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L8;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        var16 = -param5 + param0;
                        if (0 == var16) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              if (var13 != 0) {
                                break L19;
                              } else {
                                var9 = param7 << 1161530800;
                                if (0 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var10 = param7 << -1203704560;
                            break L18;
                          }
                          var17 = param8 << 2124055120;
                          var11 = (var17 + -var9) / var16;
                          var12 = (-var10 + var17) / var16;
                          if (0 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var11 = 0;
                      var12 = 0;
                      break L16;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L20: {
                  L21: {
                    if (param4 == param0) {
                      break L21;
                    } else {
                      L22: {
                        L23: {
                          var15 = -param5 + param0;
                          if (param1 < param7) {
                            break L23;
                          } else {
                            var12 = (-param1 + param8 << 518889008) / var14;
                            var11 = (-param7 + param8 << 1168651216) / var15;
                            var9 = param7 << 558719408;
                            var10 = param1 << 545046320;
                            if (0 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var9 = param1 << -203202480;
                        var10 = param7 << 1234972080;
                        var11 = (param8 - param1 << -1352277072) / var14;
                        var12 = (-param7 + param8 << -952907888) / var15;
                        break L22;
                      }
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var11 = 0;
                  var10 = param7 << 2086996656;
                  var9 = param1 << 866548304;
                  var12 = 0;
                  break L20;
                }
                var13 = 0;
                if (param4 >= 0) {
                  break L4;
                } else {
                  param4 = Math.min(-param4, -param4 + param5);
                  var9 = var9 + param4 * var11;
                  var10 = var10 + param4 * var12;
                  param4 = 0;
                  break L4;
                }
              }
              L24: {
                if (param4 < 0) {
                  param4 = -param4;
                  var10 = var10 + param4 * var12;
                  var9 = var9 + param4 * var11;
                  param4 = 0;
                  break L24;
                } else {
                  break L24;
                }
              }
              var15 = jb.field_a[param4];
              if (param0 > param4) {
                L25: {
                  var16 = var9 >> -1109928400;
                  if (jb.field_o <= var16) {
                    break L25;
                  } else {
                    L26: {
                      var17 = -(var9 >> -1971263376) + (var10 >> 1037516080);
                      if (var17 != 0) {
                        break L26;
                      } else {
                        if (var16 < 0) {
                          break L25;
                        } else {
                          if (jb.field_o > var16) {
                            ek.a(var17, param3, param6, (byte) -127, var15 + var16);
                            if (0 == 0) {
                              break L25;
                            } else {
                              break L26;
                            }
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    L27: {
                      if (jb.field_o > var16 + var17) {
                        break L27;
                      } else {
                        var17 = -1 + (-var16 + jb.field_o);
                        break L27;
                      }
                    }
                    L28: {
                      if (var16 < 0) {
                        break L28;
                      } else {
                        ek.a(var17, param3, param6, (byte) 10, var16 + var15);
                        if (0 == 0) {
                          break L25;
                        } else {
                          break L28;
                        }
                      }
                    }
                    ek.a(var16 + var17, param3, param6, (byte) -128, var15);
                    break L25;
                  }
                }
                param4++;
                if (param4 >= jb.field_n) {
                  return;
                } else {
                  var10 = var10 + var12;
                  var15 = var15 + dg.field_i;
                  var9 = var9 + var11;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            Object var4 = null;
            at discarded$0 = ((lca) this).a(-68, (gj) null);
        }
        return (at) (Object) new bna(param1, (lca) this);
    }

    final void a(op param0, int param1) {
        ((lca) this).a(param0, (byte) -2);
        int var3 = 78 % ((12 - param1) / 35);
    }

    final void a(byte param0, lu param1) {
        if (param0 >= -12) {
            Object var4 = null;
            ((lca) this).a((byte) 127, (lu) null);
        }
        this.a((byte) -16, param1);
        er.a(((lca) this).field_q, 107, param1);
    }

    lca(int param0, nq param1, nq param2) {
        super(param0, param1);
        ((lca) this).field_q = param2;
    }

    public static void d(byte param0) {
        if (param0 > -84) {
            field_s = 4;
        }
        field_r = null;
    }

    lca(lu param0) {
        super(param0);
        ((lca) this).field_k = param0.e((byte) 111);
        ((lca) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((lca) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((lca) this).field_q = qi.a(param0, (byte) 41);
    }

    final static boolean c(boolean param0) {
        kha var1 = null;
        int var2 = 0;
        L0: {
          var2 = BachelorFridge.field_y;
          if (!param0) {
            break L0;
          } else {
            lca.d((byte) 75);
            break L0;
          }
        }
        var1 = (kha) (Object) iea.field_d.b((byte) 90);
        L1: while (true) {
          if (var1 != null) {
            if (-256 <= (mg.field_m.field_f[var1.field_h] + var1.field_g ^ -1)) {
              var1 = (kha) (Object) iea.field_d.c(0);
              continue L1;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0;
        field_r = "<%0> has entered a game.";
    }
}
