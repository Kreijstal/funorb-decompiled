/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc implements uo {
    static String field_i;
    int field_j;
    int field_k;
    static mp field_g;
    ne[] field_c;
    static ka field_b;
    int field_e;
    static String field_d;
    static wk[] field_f;
    int field_a;
    static String field_h;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (ib.field_j >= 0) {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (ib.field_j < 75) {
              var5 = (ib.field_j << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (ib.field_j > 200) {
              var5 = (250 + -ib.field_j << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          vn.a(dc.field_n, 3);
          tm.a();
          qn.b();
          rb.e(9);
          if (var5 >= 256) {
            L2: {
              rf.b(-18862);
              if (150 > ib.field_j) {
                dc.field_n.h(var3, var4);
                break L2;
              } else {
                wd.field_k.e(var3 + 15, var4 - -10, var5);
                break L2;
              }
            }
            var6 = -125 + ib.field_j;
            if (var6 > 0) {
              if (50 > var6) {
                if (20 <= var6) {
                  if (var6 < 30) {
                    L3: {
                      kq.field_P.f(var3, var4, 256);
                      var6 = ib.field_j - 140;
                      if (var6 <= 0) {
                        break L3;
                      } else {
                        L4: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L4;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L4;
                          }
                        }
                        vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L5: {
                      var7 = (-var6 + 50) * 256 / 20;
                      kq.field_P.f(var3, var4, var7);
                      var6 = ib.field_j - 140;
                      if (var6 <= 0) {
                        break L5;
                      } else {
                        L6: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L6;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L6;
                          }
                        }
                        vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  L7: {
                    var7 = var6 * 256 / 20;
                    kq.field_P.f(var3, var4, var7);
                    var6 = ib.field_j - 140;
                    if (var6 <= 0) {
                      break L7;
                    } else {
                      L8: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L8;
                        } else {
                          var7 = var6 * 256 / 20;
                          break L8;
                        }
                      }
                      vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                var6 = ib.field_j - 140;
                if (var6 > 0) {
                  L9: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L9;
                    } else {
                      var7 = var6 * 256 / 20;
                      break L9;
                    }
                  }
                  vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L10: {
                var6 = ib.field_j - 140;
                if (var6 <= 0) {
                  break L10;
                } else {
                  L11: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L11;
                    } else {
                      var7 = var6 * 256 / 20;
                      break L11;
                    }
                  }
                  vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                  break L10;
                }
              }
              return;
            }
          } else {
            qn.b(0, 0, qn.field_l, qn.field_g, 0, -var5 + 256);
            rf.b(-18862);
            if (150 > ib.field_j) {
              dc.field_n.h(var3, var4);
              var6 = -125 + ib.field_j;
              if (var6 > 0) {
                if (50 > var6) {
                  if (20 <= var6) {
                    if (var6 < 30) {
                      L12: {
                        kq.field_P.f(var3, var4, 256);
                        var6 = ib.field_j - 140;
                        if (var6 <= 0) {
                          break L12;
                        } else {
                          L13: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L13;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L13;
                            }
                          }
                          vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                          break L12;
                        }
                      }
                      return;
                    } else {
                      L14: {
                        var7 = (-var6 + 50) * 256 / 20;
                        kq.field_P.f(var3, var4, var7);
                        var6 = ib.field_j - 140;
                        if (var6 <= 0) {
                          break L14;
                        } else {
                          L15: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L15;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L15;
                            }
                          }
                          vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                          break L14;
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      var7 = var6 * 256 / 20;
                      kq.field_P.f(var3, var4, var7);
                      var6 = ib.field_j - 140;
                      if (var6 <= 0) {
                        break L16;
                      } else {
                        L17: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L17;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L17;
                          }
                        }
                        vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  var6 = ib.field_j - 140;
                  if (var6 > 0) {
                    L18: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L18;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L18;
                      }
                    }
                    vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L19: {
                  var6 = ib.field_j - 140;
                  if (var6 <= 0) {
                    break L19;
                  } else {
                    L20: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L20;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L20;
                      }
                    }
                    vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                    break L19;
                  }
                }
                return;
              }
            } else {
              wd.field_k.e(var3 + 15, var4 - -10, var5);
              var6 = -125 + ib.field_j;
              if (var6 > 0) {
                if (50 > var6) {
                  if (20 <= var6) {
                    if (var6 < 30) {
                      L21: {
                        kq.field_P.f(var3, var4, 256);
                        var6 = ib.field_j - 140;
                        if (var6 <= 0) {
                          break L21;
                        } else {
                          L22: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L22;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L22;
                            }
                          }
                          vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                          break L21;
                        }
                      }
                      return;
                    } else {
                      L23: {
                        var7 = (-var6 + 50) * 256 / 20;
                        kq.field_P.f(var3, var4, var7);
                        var6 = ib.field_j - 140;
                        if (var6 <= 0) {
                          break L23;
                        } else {
                          L24: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L24;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L24;
                            }
                          }
                          vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                          break L23;
                        }
                      }
                      return;
                    }
                  } else {
                    L25: {
                      var7 = var6 * 256 / 20;
                      kq.field_P.f(var3, var4, var7);
                      var6 = ib.field_j - 140;
                      if (var6 <= 0) {
                        break L25;
                      } else {
                        L26: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L26;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L26;
                          }
                        }
                        vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                        break L25;
                      }
                    }
                    return;
                  }
                } else {
                  var6 = ib.field_j - 140;
                  if (var6 > 0) {
                    L27: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L27;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L27;
                      }
                    }
                    vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L28: {
                  var6 = ib.field_j - 140;
                  if (var6 <= 0) {
                    break L28;
                  } else {
                    L29: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L29;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L29;
                      }
                    }
                    vt.field_k.e(var3 + 15, var4 - -10, var7 * var5 >> 8);
                    break L28;
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_f = null;
        if (param0 > -6) {
          sc.a(85);
          field_h = null;
          field_d = null;
          field_i = null;
          return;
        } else {
          field_h = null;
          field_d = null;
          field_i = null;
          return;
        }
    }

    public final void a(int param0, bv param1, String param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 37) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            if (!param2.equals((Object) (Object) "nump")) {
              L2: {
                if (param2.equals((Object) (Object) "w")) {
                  if (param0 > 0) {
                    ((sc) this).field_k = (int)tn.a(false, param0, param1);
                    break L2;
                  } else {
                    return;
                  }
                } else {
                  if (param2.equals((Object) (Object) "h")) {
                    if (0 >= param0) {
                      break L2;
                    } else {
                      ((sc) this).field_e = (int)tn.a(false, param0, param1);
                      return;
                    }
                  } else {
                    if (param2.equals((Object) (Object) "them")) {
                      if (0 < param0) {
                        ((sc) this).field_a = (int)tn.a(false, param0, param1);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param2.equals((Object) (Object) "map")) {
                        if (param0 > 0) {
                          var5_int = ai.a(param1, true);
                          ((sc) this).field_c = new ne[var5_int];
                          var6 = 0;
                          L3: while (true) {
                            if (var5_int <= var6) {
                              break L2;
                            } else {
                              String discarded$1 = mt.a(param1, true);
                              var7 = param1.a(false);
                              var8 = ej.a(param1, true);
                              var9 = -var7 + param1.a(false);
                              kq.a(var7, -24232, var9, var8, param1);
                              ((sc) this).field_c[var6] = rb.a(var8, (byte) 70, param1);
                              ao.a(var7, -126, var9, param1, var8);
                              var6++;
                              continue L3;
                            }
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
              break L0;
            } else {
              if (0 < param0) {
                ((sc) this).field_j = (int)tn.a(false, param0, param1);
                return;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("sc.B(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          L5: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "This unit's movement is unaffected by this spell.";
        field_d = "<%0> is not on your friend list.";
        field_h = "This game option is not available in rated games.";
    }
}
