/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static vd[] field_a;
    static eg field_b;
    static String field_c;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        mg var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_35_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        mg stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_27_0 = null;
        String stackOut_26_0 = null;
        String stackOut_34_0 = null;
        String stackOut_33_0 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_40_0 = 0;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        mg stackOut_44_0 = null;
        mg stackOut_43_0 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = pt.field_a;
              var2 = 0;
              if (2 == ol.field_c) {
                var3_long = kh.a(-71) + -rb.field_e;
                var2 = (int)((10999L - var3_long) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (~ne.field_g.length >= ~var3) {
                break L0;
              } else {
                L3: {
                  var4 = rn.field_a[var3];
                  if (var4 < 0) {
                    var5 = nl.field_t;
                    break L3;
                  } else {
                    if (var4 != pr.field_b.field_g) {
                      var5 = so.field_b;
                      break L3;
                    } else {
                      var5 = hn.field_a;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = ne.field_g[var3];
                  if (ol.field_c != 2) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      L5: {
                        if (~es.field_a.length <= ~cn.field_z.length) {
                          stackOut_18_0 = es.field_a.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L5;
                        } else {
                          stackOut_17_0 = cn.field_z.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_19_0;
                        if (cc.field_b.length < gp.field_v.length) {
                          stackOut_21_0 = gp.field_v.length;
                          stackIn_22_0 = stackOut_21_0;
                          break L6;
                        } else {
                          stackOut_20_0 = cc.field_b.length;
                          stackIn_22_0 = stackOut_20_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_22_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (6 - -var7 > var3) {
                            L8: {
                              if (var3 - (6 - es.field_a.length) + -var7 >= 0) {
                                stackOut_27_0 = es.field_a[var3 + -6 - (-es.field_a.length - -var7)];
                                stackIn_28_0 = stackOut_27_0;
                                break L8;
                              } else {
                                stackOut_26_0 = "";
                                stackIn_28_0 = stackOut_26_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_28_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (~(var7 + 7) < ~var3) {
                        break L4;
                      } else {
                        if (var8 + (7 - -var7) > var3) {
                          L9: {
                            if (~cc.field_b.length >= ~(-var7 + (var3 + -7))) {
                              stackOut_34_0 = "";
                              stackIn_35_0 = stackOut_34_0;
                              break L9;
                            } else {
                              stackOut_33_0 = cc.field_b[-var7 + var3 - 7];
                              stackIn_35_0 = stackOut_33_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_35_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (-2 != var4) {
                    break L10;
                  } else {
                    var6 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  stackOut_38_0 = 1;
                  stackOut_38_1 = (String) var6;
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  if (0 > var4) {
                    stackOut_40_0 = stackIn_40_0;
                    stackOut_40_1 = (String) (Object) stackIn_40_1;
                    stackOut_40_2 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    break L11;
                  } else {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = (String) (Object) stackIn_39_1;
                    stackOut_39_2 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_41_2 = stackOut_39_2;
                    break L11;
                  }
                }
                L12: {
                  var7 = kp.a(stackIn_41_0 != 0, stackIn_41_1, stackIn_41_2 != 0);
                  var8 = -(var7 >> 1) + ri.field_a;
                  if (var4 < 0) {
                    break L12;
                  } else {
                    L13: {
                      var1_int = var1_int + pp.field_a;
                      if (~pr.field_b.field_g != ~var4) {
                        stackOut_44_0 = ej.field_a;
                        stackIn_45_0 = stackOut_44_0;
                        break L13;
                      } else {
                        stackOut_43_0 = u.field_g;
                        stackIn_45_0 = stackOut_43_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_45_0;
                      if (var9 == null) {
                        break L14;
                      } else {
                        var9.a(-652, (ud.field_g << 1) + var7, lp.field_h - -(as.field_c << 1), var1_int, -ud.field_g + var8);
                        break L14;
                      }
                    }
                    var1_int = var1_int + as.field_c;
                    break L12;
                  }
                }
                L15: {
                  if (var4 >= 0) {
                    pk.field_e.b(var6, var8, ke.field_b + var1_int, var5, -1);
                    var1_int = var1_int + (pp.field_a + as.field_c + lp.field_h);
                    break L15;
                  } else {
                    nh.field_c.b(var6, var8, tf.field_b + var1_int, var5, -1);
                    var1_int = var1_int + ce.field_u;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "qa.C(" + -37 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (0 <= it.field_c) {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (it.field_c < 75) {
              var5 = (it.field_c << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (it.field_c > 200) {
              var5 = (250 - it.field_c << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          cm.a(wd.field_v, -14492);
          re.a();
          vp.a();
          wj.e((byte) -124);
          if (var5 >= 256) {
            sl.c(2765);
            if (it.field_c < 150) {
              L2: {
                L3: {
                  wd.field_v.d(var3, var4);
                  var6 = it.field_c - 125;
                  if (0 >= var6) {
                    break L3;
                  } else {
                    if (var6 < 50) {
                      if (20 > var6) {
                        var7 = var6 * 256 / 20;
                        oo.field_W.d(var3, var4, var7);
                        break L3;
                      } else {
                        if (var6 < 30) {
                          L4: {
                            oo.field_W.d(var3, var4, 256);
                            var6 = -140 + it.field_c;
                            if (var6 <= 0) {
                              break L4;
                            } else {
                              L5: {
                                var7 = 256;
                                if (var6 >= 20) {
                                  break L5;
                                } else {
                                  var7 = 256 * var6 / 20;
                                  break L5;
                                }
                              }
                              gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                              break L4;
                            }
                          }
                          return;
                        } else {
                          L6: {
                            var7 = (12800 - var6 * 256) / 20;
                            oo.field_W.d(var3, var4, var7);
                            var6 = -140 + it.field_c;
                            if (var6 <= 0) {
                              break L6;
                            } else {
                              L7: {
                                var7 = 256;
                                if (var6 >= 20) {
                                  break L7;
                                } else {
                                  var7 = 256 * var6 / 20;
                                  break L7;
                                }
                              }
                              gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                              break L6;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L8: {
                        var6 = -140 + it.field_c;
                        if (var6 <= 0) {
                          break L8;
                        } else {
                          L9: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L9;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L9;
                            }
                          }
                          gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                          break L8;
                        }
                      }
                      break L2;
                    }
                  }
                }
                L10: {
                  var6 = -140 + it.field_c;
                  if (var6 <= 0) {
                    break L10;
                  } else {
                    L11: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L11;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L11;
                      }
                    }
                    gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L10;
                  }
                }
                break L2;
              }
              return;
            } else {
              gl.field_d.a(var3 + 15, var4 - -10, var5);
              var6 = it.field_c - 125;
              if (0 < var6) {
                L12: {
                  if (var6 < 50) {
                    if (20 > var6) {
                      L13: {
                        var7 = var6 * 256 / 20;
                        oo.field_W.d(var3, var4, var7);
                        var6 = -140 + it.field_c;
                        if (var6 <= 0) {
                          break L13;
                        } else {
                          L14: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L14;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L14;
                            }
                          }
                          gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                          break L13;
                        }
                      }
                      break L12;
                    } else {
                      if (var6 < 30) {
                        L15: {
                          oo.field_W.d(var3, var4, 256);
                          var6 = -140 + it.field_c;
                          if (var6 <= 0) {
                            break L15;
                          } else {
                            L16: {
                              var7 = 256;
                              if (var6 >= 20) {
                                break L16;
                              } else {
                                var7 = 256 * var6 / 20;
                                break L16;
                              }
                            }
                            gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                            break L15;
                          }
                        }
                        return;
                      } else {
                        L17: {
                          var7 = (12800 - var6 * 256) / 20;
                          oo.field_W.d(var3, var4, var7);
                          var6 = -140 + it.field_c;
                          if (var6 <= 0) {
                            break L17;
                          } else {
                            L18: {
                              var7 = 256;
                              if (var6 >= 20) {
                                break L18;
                              } else {
                                var7 = 256 * var6 / 20;
                                break L18;
                              }
                            }
                            gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                            break L17;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    L19: {
                      var6 = -140 + it.field_c;
                      if (var6 <= 0) {
                        break L19;
                      } else {
                        L20: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L20;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L20;
                          }
                        }
                        gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L19;
                      }
                    }
                    break L12;
                  }
                }
                return;
              } else {
                L21: {
                  var6 = -140 + it.field_c;
                  if (var6 <= 0) {
                    break L21;
                  } else {
                    L22: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L22;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L22;
                      }
                    }
                    gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L21;
                  }
                }
                return;
              }
            }
          } else {
            L23: {
              vp.b(0, 0, vp.field_i, vp.field_c, 0, -var5 + 256);
              sl.c(2765);
              if (it.field_c < 150) {
                wd.field_v.d(var3, var4);
                break L23;
              } else {
                gl.field_d.a(var3 + 15, var4 - -10, var5);
                break L23;
              }
            }
            var6 = it.field_c - 125;
            if (0 < var6) {
              L24: {
                if (var6 < 50) {
                  L25: {
                    if (20 > var6) {
                      var7 = var6 * 256 / 20;
                      oo.field_W.d(var3, var4, var7);
                      break L25;
                    } else {
                      if (var6 < 30) {
                        oo.field_W.d(var3, var4, 256);
                        break L25;
                      } else {
                        var7 = (12800 - var6 * 256) / 20;
                        oo.field_W.d(var3, var4, var7);
                        break L25;
                      }
                    }
                  }
                  L26: {
                    var6 = -140 + it.field_c;
                    if (var6 <= 0) {
                      break L26;
                    } else {
                      L27: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L27;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L27;
                        }
                      }
                      gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L26;
                    }
                  }
                  break L24;
                } else {
                  L28: {
                    var6 = -140 + it.field_c;
                    if (var6 <= 0) {
                      break L28;
                    } else {
                      L29: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L29;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L29;
                        }
                      }
                      gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L28;
                    }
                  }
                  break L24;
                }
              }
              return;
            } else {
              L30: {
                var6 = -140 + it.field_c;
                if (var6 <= 0) {
                  break L30;
                } else {
                  L31: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L31;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L31;
                    }
                  }
                  gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
                  break L30;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new eg();
        field_c = "This password is part of your Player Name, and would be easy to guess";
    }
}
