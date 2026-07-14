/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp extends oj {
    static String field_A;
    int field_E;
    int field_C;
    int field_z;
    static String[] field_y;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, byte param8) {
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
          var19 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 > param3) {
            break L0;
          } else {
            if (param1 >= tm.field_q) {
              break L0;
            } else {
              L1: {
                if (param7 >= 0) {
                  break L1;
                } else {
                  if (0 <= param4) {
                    break L1;
                  } else {
                    if (param2 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (tm.field_l > param7) {
                  break L2;
                } else {
                  if (tm.field_l > param4) {
                    break L2;
                  } else {
                    if (tm.field_l > param2) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var14 = -param1 + param3;
                  if (param0 == param1) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        var10 = param7 << -374352912;
                        var9 = param7 << -374352912;
                        var15 = param0 - param1;
                        var12 = (param2 - param7 << 1193852592) / var14;
                        var11 = (-param7 + param4 << -1746576048) / var15;
                        if (var11 < var12) {
                          break L6;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var13 = 0;
                      break L5;
                    }
                    L7: {
                      L8: {
                        if (param1 < 0) {
                          L9: {
                            if (param0 >= 0) {
                              break L9;
                            } else {
                              param1 = param0 + -param1;
                              var10 = var10 + param1 * var12;
                              var9 = var9 + var11 * param1;
                              param1 = param0;
                              if (0 == 0) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param1 = -param1;
                          var9 = var9 + var11 * param1;
                          var10 = var10 + var12 * param1;
                          param1 = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var16 = tm.field_k[param1];
                      L10: while (true) {
                        if (param0 <= param1) {
                          break L7;
                        } else {
                          L11: {
                            var17 = var9 >> 1585780432;
                            if (var17 >= tm.field_l) {
                              break L11;
                            } else {
                              L12: {
                                var18 = (var10 >> 735718256) - (var9 >> 1628801776);
                                if (var18 != 0) {
                                  break L12;
                                } else {
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (tm.field_l <= var17) {
                                      break L11;
                                    } else {
                                      tf.a(var16 + var17, -1432128863, var18, param6, param5);
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
                                if (tm.field_l <= var17 + var18) {
                                  var18 = -var17 + tm.field_l + -1;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                if (var17 < 0) {
                                  break L14;
                                } else {
                                  tf.a(var17 + var16, -1432128863, var18, param6, param5);
                                  if (0 == 0) {
                                    break L11;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              tf.a(var16, param8 + -1432128883, var17 + var18, param6, param5);
                              break L11;
                            }
                          }
                          param1++;
                          if (param1 >= tm.field_q) {
                            return;
                          } else {
                            var16 = var16 + qn.field_l;
                            var9 = var9 + var11;
                            var10 = var10 + var12;
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
                        var16 = -param0 + param3;
                        if (var16 == 0) {
                          break L16;
                        } else {
                          L17: {
                            L18: {
                              var17 = param2 << -1058208272;
                              if (var13 == 0) {
                                break L18;
                              } else {
                                var10 = param4 << 1908646608;
                                if (0 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var9 = param4 << -802932560;
                            break L17;
                          }
                          var12 = (-var10 + var17) / var16;
                          var11 = (-var9 + var17) / var16;
                          if (0 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      var11 = 0;
                      var12 = 0;
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
                    if (param3 == param1) {
                      break L20;
                    } else {
                      L21: {
                        L22: {
                          var15 = -param0 + param3;
                          if (param7 >= param4) {
                            break L22;
                          } else {
                            var9 = param7 << -1784981648;
                            var12 = (-param4 + param2 << -1789498640) / var15;
                            var10 = param4 << -1419794128;
                            var11 = (param2 - param7 << 966761840) / var14;
                            if (0 == 0) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        var10 = param7 << 1305289296;
                        var12 = (param2 + -param7 << -526804944) / var14;
                        var11 = (param2 + -param4 << 2007579056) / var15;
                        var9 = param4 << -2030780304;
                        break L21;
                      }
                      if (0 == 0) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  var12 = 0;
                  var9 = param7 << 38540400;
                  var11 = 0;
                  var10 = param4 << -215886160;
                  break L19;
                }
                L23: {
                  if (0 > param1) {
                    param1 = Math.min(-param1, -param1 + param0);
                    var10 = var10 + param1 * var12;
                    var9 = var9 + var11 * param1;
                    param1 = 0;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                var13 = 0;
                break L3;
              }
              if (param8 == 20) {
                L24: {
                  if (param1 >= 0) {
                    break L24;
                  } else {
                    param1 = -param1;
                    var10 = var10 + var12 * param1;
                    var9 = var9 + param1 * var11;
                    param1 = 0;
                    break L24;
                  }
                }
                var15 = tm.field_k[param1];
                if (param1 < param3) {
                  L25: {
                    var16 = var9 >> 1923483984;
                    if (var16 < tm.field_l) {
                      L26: {
                        var17 = -(var9 >> 900075280) + (var10 >> 1555947824);
                        if (var17 == 0) {
                          break L26;
                        } else {
                          L27: {
                            if (tm.field_l > var16 + var17) {
                              break L27;
                            } else {
                              var17 = tm.field_l - (var16 + 1);
                              break L27;
                            }
                          }
                          L28: {
                            if (var16 >= 0) {
                              break L28;
                            } else {
                              tf.a(var15, param8 + -1432128883, var17 - -var16, param6, param5);
                              if (0 == 0) {
                                break L25;
                              } else {
                                break L28;
                              }
                            }
                          }
                          tf.a(var16 + var15, -1432128863, var17, param6, param5);
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
                        if (var16 < tm.field_l) {
                          tf.a(var15 + var16, -1432128863, var17, param6, param5);
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                    } else {
                      break L25;
                    }
                  }
                  param1++;
                  if (tm.field_q <= param1) {
                    return;
                  } else {
                    var10 = var10 + var12;
                    var15 = var15 + qn.field_l;
                    var9 = var9 + var11;
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
        }
    }

    public static void g(int param0) {
        field_A = null;
        if (param0 != -829) {
            return;
        }
        field_y = null;
    }

    final String a(byte param0, boolean param1) {
        int var4 = 118 % ((param0 - 53) / 51);
        String var3 = "EventMana: type: , points: " + ((vp) this).field_E + ", player: " + ((vp) this).field_C;
        return var3;
    }

    final static void a(byte param0, int param1) {
        bv var2 = null;
        if (param0 != 69) {
          return;
        } else {
          var2 = vl.field_n;
          var2.h(32161, param1);
          var2.b(1, 1);
          var2.b(1, 3);
          return;
        }
    }

    final void a(ha param0, int param1) {
        if (param1 != -26661) {
            vp.a((byte) 14, 105);
        }
        if (0 > param0.field_sb) {
            if (-1 >= (((vp) this).field_C ^ -1)) {
                if (((vp) this).field_C < param0.field_H.length) {
                    param0.field_H[((vp) this).field_C] = param0.field_H[((vp) this).field_C] + ((vp) this).field_E;
                    if (-1000000001 > (param0.field_H[((vp) this).field_C] ^ -1)) {
                        param0.field_H[((vp) this).field_C] = 1000000000;
                    }
                    param0.field_fb[param0.o(((vp) this).field_C, -1)] = param0.field_fb[param0.o(((vp) this).field_C, -1)] + ((vp) this).field_E;
                    if (param0.field_fb[param0.o(((vp) this).field_C, -1)] > 1000000000) {
                        param0.field_fb[param0.o(((vp) this).field_C, -1)] = 1000000000;
                    }
                }
            }
        }
        fl.a(param0, -120);
    }

    final boolean a(at param0, byte param1, ic param2) {
        if (param1 >= -84) {
            ((vp) this).field_z = -20;
            return false;
        }
        return false;
    }

    vp(int param0, int param1, int param2) {
        ((vp) this).field_m = 9;
        ((vp) this).field_z = param0;
        ((vp) this).field_E = param1;
        ((vp) this).field_C = param2;
    }

    final static wk a(int param0, int param1, int param2, kl param3) {
        if (param2 != -9027) {
            vp.g(-17);
        }
        if (!kp.a(false, param0, param3, param1)) {
            return null;
        }
        return gv.a(2809);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Loading";
        field_y = new String[]{"This unit has a normal <%0> attack.", "This unit deals +2 damage with <%0> attacks.", "This unit deals +5 damage with <%0> attacks.", "This unit deals +10 damage with <%0> attacks.", "This unit's <%0> attacks have +2 maximum range.", "This unit's <%0> attacks have +3 maximum range.", "This unit's <%0> attacks poison enemy units."};
    }
}
