/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jia extends rqa {
    static int field_o;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var6_int = 493 + param3 + (8 + (2 - -param5));
              kea.field_a.a(3, -18, var6_int + -6, 3, hca.field_o.field_G + -6);
              var7 = -5 + kea.field_a.field_G;
              jba.field_b.a(5, -73, param5 + (param3 - -487), var7 + -param1, param1);
              bpa.field_c.a(param3, -55, -fgb.field_l.field_hb + jba.field_b.field_hb + -param3, 0, param1);
              var7 = var7 - (2 + param1);
              fgb.field_l.a(param3 + bpa.field_c.field_hb, 122, fgb.field_l.field_hb, 0, param1);
              vea.field_p.a(487 + (param3 + param5), 2, -1, -5 + var7, 5, 5, param5);
              if (null == ada.field_b) {
                break L1;
              } else {
                ada.field_b.a(vea.field_p.field_L, vea.field_p.field_hb, vea.field_p.field_G, 1, vea.field_p.field_K);
                break L1;
              }
            }
            if (param2 > 91) {
              var8 = -var6_int + -param3 + hca.field_o.field_hb;
              var9 = var8 / 2;
              var10 = param3 + param0 + var9;
              var11 = 0;
              var12 = 0;
              L2: while (true) {
                if (6 <= var12) {
                  break L0;
                } else {
                  L3: {
                    L4: {
                      if (var12 >= 5) {
                        break L4;
                      } else {
                        if (ul.field_b[var12] == null) {
                          var12++;
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var13 = var11 * (-4 + hca.field_o.field_G) / (1 + fb.field_o) + 3;
                    var11++;
                    var7 = 3 + (var11 * (2 + (hca.field_o.field_G + -6)) / (1 + fb.field_o) - 2) - var13;
                    if (var12 < 5) {
                      ul.field_b[var12].a(var6_int, -100, var8, var13, var7);
                      hpa.field_o[var12].a(param3, -110, -param3 + var9, 0, var7);
                      vh.field_c[var12].a(var9, -27, param0, param4, -param4 + (var7 - param4));
                      lob.field_c[var12].a(var10, 127, -var10 + (-param3 + var8), param4, var7 - (param4 + param4));
                      break L3;
                    } else {
                      nlb.field_o.a(var6_int, -120, var8, var13, var7);
                      var12++;
                      break L3;
                    }
                  }
                  var12++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var6, "jia.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ama.field_o = param0[0].d(0);
            if (param1 <= -119) {
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jia.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    jia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param0 == 0) {
            var2 = kib.field_d;
        }
        if (param0 == 1) {
            var2 = idb.field_p;
        }
        if (!(param0 != 2)) {
            var2 = lla.field_h;
        }
        return var2;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        ija.field_b = null;
        gob.field_c = 0;
        eu.field_h = null;
        var2 = esa.field_p;
        esa.field_p = vwa.field_p;
        ff.field_o.field_g = ff.field_o.field_g + 1;
        if (param0 < -60) {
          vwa.field_p = var2;
          if (param1 != 51) {
            if (param1 == 50) {
              ff.field_o.field_k = 5;
              if (2 > ff.field_o.field_g) {
                L0: {
                  if (ff.field_o.field_g < 2) {
                    break L0;
                  } else {
                    if (param1 != 50) {
                      break L0;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ff.field_o.field_g >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (param1 == 51) {
                  return 2;
                } else {
                  L1: {
                    if (ff.field_o.field_g < 2) {
                      break L1;
                    } else {
                      if (param1 != 50) {
                        break L1;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (ff.field_o.field_g >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              ff.field_o.field_k = 1;
              if (2 > ff.field_o.field_g) {
                L2: {
                  if (ff.field_o.field_g < 2) {
                    break L2;
                  } else {
                    if (param1 != 50) {
                      break L2;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ff.field_o.field_g >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (param1 == 51) {
                  return 2;
                } else {
                  L3: {
                    if (ff.field_o.field_g < 2) {
                      break L3;
                    } else {
                      if (param1 != 50) {
                        break L3;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (ff.field_o.field_g >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            }
          } else {
            ff.field_o.field_k = 2;
            if (2 > ff.field_o.field_g) {
              L4: {
                if (ff.field_o.field_g < 2) {
                  break L4;
                } else {
                  if (param1 != 50) {
                    break L4;
                  } else {
                    return 5;
                  }
                }
              }
              if (ff.field_o.field_g >= 4) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (param1 == 51) {
                return 2;
              } else {
                L5: {
                  if (ff.field_o.field_g < 2) {
                    break L5;
                  } else {
                    if (param1 != 50) {
                      break L5;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ff.field_o.field_g >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        } else {
          field_o = -4;
          vwa.field_p = var2;
          if (param1 != 51) {
            if (param1 == 50) {
              ff.field_o.field_k = 5;
              if (2 <= ff.field_o.field_g) {
                if (param1 == 51) {
                  return 2;
                } else {
                  if (ff.field_o.field_g >= 2) {
                    if (param1 != 50) {
                      if (ff.field_o.field_g >= 4) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (ff.field_o.field_g >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                L6: {
                  if (ff.field_o.field_g < 2) {
                    break L6;
                  } else {
                    if (param1 != 50) {
                      break L6;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ff.field_o.field_g >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              ff.field_o.field_k = 1;
              if (2 <= ff.field_o.field_g) {
                if (param1 == 51) {
                  return 2;
                } else {
                  if (ff.field_o.field_g >= 2) {
                    if (param1 != 50) {
                      if (ff.field_o.field_g >= 4) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (ff.field_o.field_g >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                L7: {
                  if (ff.field_o.field_g < 2) {
                    break L7;
                  } else {
                    if (param1 != 50) {
                      break L7;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ff.field_o.field_g >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            ff.field_o.field_k = 2;
            if (2 <= ff.field_o.field_g) {
              if (param1 == 51) {
                return 2;
              } else {
                if (ff.field_o.field_g >= 2) {
                  if (param1 != 50) {
                    if (ff.field_o.field_g >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  if (ff.field_o.field_g >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              L8: {
                if (ff.field_o.field_g < 2) {
                  break L8;
                } else {
                  if (param1 != 50) {
                    break L8;
                  } else {
                    return 5;
                  }
                }
              }
              if (ff.field_o.field_g >= 4) {
                return 1;
              } else {
                return -1;
              }
            }
          }
        }
    }

    static {
    }
}
