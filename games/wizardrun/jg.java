/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.Applet;
import java.lang.String;

final class jg extends mf {
    static boolean field_n;
    static bh field_q;
    private boolean field_s;
    static int field_o;
    static int field_m;
    static String field_r;
    private String field_l;
    static int field_k;
    static String field_p;

    final static java.applet.Applet f(int param0) {
        RuntimeException var1 = null;
        java.applet.Applet stackIn_2_0 = null;
        da stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        da stackOut_6_0 = null;
        java.applet.Applet stackOut_1_0 = null;
        try {
          L0: {
            if (null == fl.field_F) {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  field_m = 77;
                  break L1;
                }
              }
              stackOut_6_0 = ca.field_c;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = fl.field_F;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "jg.J(" + param0 + ')');
        }
        return (java.applet.Applet) (Object) stackIn_7_0;
    }

    final static void a(byte[] param0, boolean param1) {
        RuntimeException var2 = null;
        va var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        int stackOut_61_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_86_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var15 = wizardrun.field_H;
        try {
          L0: {
            var2_ref = new va(param0);
            var2_ref.field_m = -2 + param0.length;
            wb.field_f = var2_ref.j(-14477);
            if (param1) {
              ue.field_e = new byte[wb.field_f][];
              mf.field_j = new byte[wb.field_f][];
              tf.field_b = new int[wb.field_f];
              ne.field_h = new int[wb.field_f];
              cg.field_k = new int[wb.field_f];
              v.field_e = new boolean[wb.field_f];
              ph.field_q = new int[wb.field_f];
              var2_ref.field_m = param0.length - (7 + 8 * wb.field_f);
              hk.field_bb = var2_ref.j(-14477);
              eg.field_v = var2_ref.j(-14477);
              var3 = 1 + (255 & var2_ref.f(255));
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~wb.field_f >= ~var4) {
                      break L3;
                    } else {
                      ph.field_q[var4] = var2_ref.j(-14477);
                      var4++;
                      if (var15 != 0) {
                        break L2;
                      } else {
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L2;
                }
                L4: while (true) {
                  L5: {
                    L6: {
                      if (~var4 <= ~wb.field_f) {
                        break L6;
                      } else {
                        ne.field_h[var4] = var2_ref.j(-14477);
                        var4++;
                        if (var15 != 0) {
                          break L5;
                        } else {
                          if (var15 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    break L5;
                  }
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (~var4 <= ~wb.field_f) {
                          break L9;
                        } else {
                          cg.field_k[var4] = var2_ref.j(-14477);
                          var4++;
                          if (var15 != 0) {
                            break L8;
                          } else {
                            if (var15 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      var4 = 0;
                      break L8;
                    }
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (wb.field_f <= var4) {
                            break L12;
                          } else {
                            tf.field_b[var4] = var2_ref.j(-14477);
                            var4++;
                            if (var15 != 0) {
                              break L11;
                            } else {
                              if (var15 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var2_ref.field_m = -(wb.field_f * 8) + (-7 + param0.length + (-(var3 * 3) + 3));
                        ic.field_b = new int[var3];
                        break L11;
                      }
                      var4 = 1;
                      L13: while (true) {
                        L14: {
                          L15: {
                            L16: {
                              if (~var3 >= ~var4) {
                                break L16;
                              } else {
                                ic.field_b[var4] = var2_ref.d((byte) 125);
                                stackOut_36_0 = ~ic.field_b[var4];
                                stackOut_36_1 = -1;
                                stackIn_46_0 = stackOut_36_0;
                                stackIn_46_1 = stackOut_36_1;
                                stackIn_37_0 = stackOut_36_0;
                                stackIn_37_1 = stackOut_36_1;
                                if (var15 != 0) {
                                  L17: while (true) {
                                    if (stackIn_46_0 >= stackIn_46_1) {
                                      break L15;
                                    } else {
                                      var5 = cg.field_k[var4];
                                      var6 = tf.field_b[var4];
                                      var7 = var6 * var5;
                                      var8 = new byte[var7];
                                      mf.field_j[var4] = var8;
                                      var9 = new byte[var7];
                                      ue.field_e[var4] = var9;
                                      var10 = 0;
                                      var11 = var2_ref.f(255);
                                      if (var15 != 0) {
                                        break L14;
                                      } else {
                                        stackOut_48_0 = -1;
                                        stackOut_48_1 = var11 & 1;
                                        stackOut_48_2 = -1;
                                        stackIn_50_0 = stackOut_48_0;
                                        stackIn_50_1 = stackOut_48_1;
                                        stackIn_50_2 = stackOut_48_2;
                                        L18: while (true) {
                                          L19: {
                                            L20: {
                                              L21: {
                                                L22: {
                                                  if (stackIn_50_0 != (stackIn_50_1 ^ stackIn_50_2)) {
                                                    break L22;
                                                  } else {
                                                    var12 = 0;
                                                    L23: while (true) {
                                                      L24: {
                                                        if (var7 <= var12) {
                                                          break L24;
                                                        } else {
                                                          var8[var12] = var2_ref.k(0);
                                                          var12++;
                                                          if (var15 != 0) {
                                                            break L20;
                                                          } else {
                                                            if (var15 == 0) {
                                                              continue L23;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if ((2 & var11) == 0) {
                                                        break L21;
                                                      } else {
                                                        var12 = 0;
                                                        L25: while (true) {
                                                          L26: {
                                                            if (~var12 <= ~var7) {
                                                              break L26;
                                                            } else {
                                                              byte dupTemp$2 = var2_ref.k(0);
                                                              var9[var12] = dupTemp$2;
                                                              var13 = dupTemp$2;
                                                              stackOut_60_0 = var10;
                                                              stackOut_60_1 = var13;
                                                              stackOut_60_2 = -1;
                                                              stackIn_50_0 = stackOut_60_0;
                                                              stackIn_50_1 = stackOut_60_1;
                                                              stackIn_50_2 = stackOut_60_2;
                                                              stackIn_61_0 = stackOut_60_0;
                                                              stackIn_61_1 = stackOut_60_1;
                                                              stackIn_61_2 = stackOut_60_2;
                                                              if (var15 != 0) {
                                                                continue L18;
                                                              } else {
                                                                L27: {
                                                                  stackOut_61_0 = stackIn_61_0;
                                                                  stackIn_64_0 = stackOut_61_0;
                                                                  stackIn_62_0 = stackOut_61_0;
                                                                  if (stackIn_61_1 == stackIn_61_2) {
                                                                    stackOut_64_0 = stackIn_64_0;
                                                                    stackOut_64_1 = 0;
                                                                    stackIn_65_0 = stackOut_64_0;
                                                                    stackIn_65_1 = stackOut_64_1;
                                                                    break L27;
                                                                  } else {
                                                                    stackOut_62_0 = stackIn_62_0;
                                                                    stackOut_62_1 = 1;
                                                                    stackIn_65_0 = stackOut_62_0;
                                                                    stackIn_65_1 = stackOut_62_1;
                                                                    break L27;
                                                                  }
                                                                }
                                                                var10 = stackIn_65_0 | stackIn_65_1;
                                                                var12++;
                                                                if (var15 == 0) {
                                                                  continue L25;
                                                                } else {
                                                                  break L26;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (var15 == 0) {
                                                            break L21;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var12 = 0;
                                                L28: while (true) {
                                                  L29: {
                                                    L30: {
                                                      if (~var5 >= ~var12) {
                                                        break L30;
                                                      } else {
                                                        stackOut_69_0 = 0;
                                                        stackIn_79_0 = stackOut_69_0;
                                                        stackIn_70_0 = stackOut_69_0;
                                                        if (var15 != 0) {
                                                          break L29;
                                                        } else {
                                                          var13 = stackIn_70_0;
                                                          L31: while (true) {
                                                            L32: {
                                                              L33: {
                                                                if (~var6 >= ~var13) {
                                                                  break L33;
                                                                } else {
                                                                  var8[var12 + var13 * var5] = var2_ref.k(0);
                                                                  var13++;
                                                                  if (var15 != 0) {
                                                                    break L32;
                                                                  } else {
                                                                    if (var15 == 0) {
                                                                      continue L31;
                                                                    } else {
                                                                      break L33;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var12++;
                                                              break L32;
                                                            }
                                                            if (var15 == 0) {
                                                              continue L28;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    stackOut_78_0 = -1;
                                                    stackIn_79_0 = stackOut_78_0;
                                                    break L29;
                                                  }
                                                  if (stackIn_79_0 == ~(var11 & 2)) {
                                                    break L21;
                                                  } else {
                                                    var12 = 0;
                                                    L34: while (true) {
                                                      if (var12 >= var5) {
                                                        break L21;
                                                      } else {
                                                        stackOut_82_0 = 0;
                                                        stackIn_45_0 = stackOut_82_0;
                                                        stackIn_83_0 = stackOut_82_0;
                                                        if (var15 != 0) {
                                                          break L19;
                                                        } else {
                                                          var13 = stackIn_83_0;
                                                          L35: while (true) {
                                                            L36: {
                                                              if (~var13 <= ~var6) {
                                                                break L36;
                                                              } else {
                                                                byte dupTemp$3 = var2_ref.k(0);
                                                                var9[var5 * var13 + var12] = dupTemp$3;
                                                                var14 = dupTemp$3;
                                                                stackOut_85_0 = var10;
                                                                stackOut_85_1 = 0;
                                                                stackOut_85_2 = ~var14;
                                                                stackIn_50_0 = stackOut_85_0;
                                                                stackIn_50_1 = stackOut_85_1;
                                                                stackIn_50_2 = stackOut_85_2;
                                                                stackIn_86_0 = stackOut_85_0;
                                                                stackIn_86_1 = stackOut_85_1;
                                                                stackIn_86_2 = stackOut_85_2;
                                                                if (var15 != 0) {
                                                                  continue L18;
                                                                } else {
                                                                  L37: {
                                                                    stackOut_86_0 = stackIn_86_0;
                                                                    stackIn_89_0 = stackOut_86_0;
                                                                    stackIn_87_0 = stackOut_86_0;
                                                                    if (stackIn_86_1 == stackIn_86_2) {
                                                                      stackOut_89_0 = stackIn_89_0;
                                                                      stackOut_89_1 = 0;
                                                                      stackIn_90_0 = stackOut_89_0;
                                                                      stackIn_90_1 = stackOut_89_1;
                                                                      break L37;
                                                                    } else {
                                                                      stackOut_87_0 = stackIn_87_0;
                                                                      stackOut_87_1 = 1;
                                                                      stackIn_90_0 = stackOut_87_0;
                                                                      stackIn_90_1 = stackOut_87_1;
                                                                      break L37;
                                                                    }
                                                                  }
                                                                  var10 = stackIn_90_0 | stackIn_90_1;
                                                                  var13++;
                                                                  if (var15 == 0) {
                                                                    continue L35;
                                                                  } else {
                                                                    break L36;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var12++;
                                                            if (var15 == 0) {
                                                              continue L34;
                                                            } else {
                                                              break L21;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              v.field_e[var4] = var10 != 0;
                                              var4++;
                                              break L20;
                                            }
                                            if (var15 == 0) {
                                              stackOut_44_0 = var4;
                                              stackIn_45_0 = stackOut_44_0;
                                              break L19;
                                            } else {
                                              break L15;
                                            }
                                          }
                                          stackOut_45_0 = stackIn_45_0;
                                          stackOut_45_1 = wb.field_f;
                                          stackIn_46_0 = stackOut_45_0;
                                          stackIn_46_1 = stackOut_45_1;
                                          continue L17;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L38: {
                                    if (stackIn_37_0 == stackIn_37_1) {
                                      ic.field_b[var4] = 1;
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  }
                                  var4++;
                                  if (var15 == 0) {
                                    continue L13;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            var2_ref.field_m = 0;
                            var4 = 0;
                            L39: while (true) {
                              stackOut_44_0 = var4;
                              stackIn_45_0 = stackOut_44_0;
                              L40: while (true) {
                                stackOut_45_0 = stackIn_45_0;
                                stackOut_45_1 = wb.field_f;
                                stackIn_46_0 = stackOut_45_0;
                                stackIn_46_1 = stackOut_45_1;
                                if (stackIn_46_0 >= stackIn_46_1) {
                                  break L15;
                                } else {
                                  var5 = cg.field_k[var4];
                                  var6 = tf.field_b[var4];
                                  var7 = var6 * var5;
                                  var8 = new byte[var7];
                                  mf.field_j[var4] = var8;
                                  var9 = new byte[var7];
                                  ue.field_e[var4] = var9;
                                  var10 = 0;
                                  var11 = var2_ref.f(255);
                                  if (var15 != 0) {
                                    break L14;
                                  } else {
                                    stackOut_48_0 = -1;
                                    stackOut_48_1 = var11 & 1;
                                    stackOut_48_2 = -1;
                                    stackIn_50_0 = stackOut_48_0;
                                    stackIn_50_1 = stackOut_48_1;
                                    stackIn_50_2 = stackOut_48_2;
                                    L41: while (true) {
                                      L42: {
                                        L43: {
                                          L44: {
                                            if (stackIn_50_0 != (stackIn_50_1 ^ stackIn_50_2)) {
                                              break L44;
                                            } else {
                                              var12 = 0;
                                              L45: while (true) {
                                                L46: {
                                                  if (var7 <= var12) {
                                                    break L46;
                                                  } else {
                                                    var8[var12] = var2_ref.k(0);
                                                    var12++;
                                                    if (var15 != 0) {
                                                      break L42;
                                                    } else {
                                                      if (var15 == 0) {
                                                        continue L45;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                  }
                                                }
                                                if ((2 & var11) == 0) {
                                                  break L43;
                                                } else {
                                                  var12 = 0;
                                                  L47: while (true) {
                                                    L48: {
                                                      if (~var12 <= ~var7) {
                                                        break L48;
                                                      } else {
                                                        byte dupTemp$2 = var2_ref.k(0);
                                                        var9[var12] = dupTemp$2;
                                                        var13 = dupTemp$2;
                                                        stackOut_60_0 = var10;
                                                        stackOut_60_1 = var13;
                                                        stackOut_60_2 = -1;
                                                        stackIn_50_0 = stackOut_60_0;
                                                        stackIn_50_1 = stackOut_60_1;
                                                        stackIn_50_2 = stackOut_60_2;
                                                        stackIn_61_0 = stackOut_60_0;
                                                        stackIn_61_1 = stackOut_60_1;
                                                        stackIn_61_2 = stackOut_60_2;
                                                        if (var15 != 0) {
                                                          continue L41;
                                                        } else {
                                                          L49: {
                                                            stackOut_61_0 = stackIn_61_0;
                                                            stackIn_64_0 = stackOut_61_0;
                                                            stackIn_62_0 = stackOut_61_0;
                                                            if (stackIn_61_1 == stackIn_61_2) {
                                                              stackOut_64_0 = stackIn_64_0;
                                                              stackOut_64_1 = 0;
                                                              stackIn_65_0 = stackOut_64_0;
                                                              stackIn_65_1 = stackOut_64_1;
                                                              break L49;
                                                            } else {
                                                              stackOut_62_0 = stackIn_62_0;
                                                              stackOut_62_1 = 1;
                                                              stackIn_65_0 = stackOut_62_0;
                                                              stackIn_65_1 = stackOut_62_1;
                                                              break L49;
                                                            }
                                                          }
                                                          var10 = stackIn_65_0 | stackIn_65_1;
                                                          var12++;
                                                          if (var15 == 0) {
                                                            continue L47;
                                                          } else {
                                                            break L48;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var15 == 0) {
                                                      break L43;
                                                    } else {
                                                      break L44;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var12 = 0;
                                          L50: while (true) {
                                            L51: {
                                              L52: {
                                                if (~var5 >= ~var12) {
                                                  break L52;
                                                } else {
                                                  stackOut_69_0 = 0;
                                                  stackIn_79_0 = stackOut_69_0;
                                                  stackIn_70_0 = stackOut_69_0;
                                                  if (var15 != 0) {
                                                    break L51;
                                                  } else {
                                                    var13 = stackIn_70_0;
                                                    L53: while (true) {
                                                      L54: {
                                                        L55: {
                                                          if (~var6 >= ~var13) {
                                                            break L55;
                                                          } else {
                                                            var8[var12 + var13 * var5] = var2_ref.k(0);
                                                            var13++;
                                                            if (var15 != 0) {
                                                              break L54;
                                                            } else {
                                                              if (var15 == 0) {
                                                                continue L53;
                                                              } else {
                                                                break L55;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var12++;
                                                        break L54;
                                                      }
                                                      if (var15 == 0) {
                                                        continue L50;
                                                      } else {
                                                        break L52;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_78_0 = -1;
                                              stackIn_79_0 = stackOut_78_0;
                                              break L51;
                                            }
                                            if (stackIn_79_0 == ~(var11 & 2)) {
                                              break L43;
                                            } else {
                                              var12 = 0;
                                              L56: while (true) {
                                                if (var12 >= var5) {
                                                  break L43;
                                                } else {
                                                  stackOut_82_0 = 0;
                                                  stackIn_45_0 = stackOut_82_0;
                                                  stackIn_83_0 = stackOut_82_0;
                                                  if (var15 != 0) {
                                                    continue L40;
                                                  } else {
                                                    var13 = stackIn_83_0;
                                                    L57: while (true) {
                                                      L58: {
                                                        if (~var13 <= ~var6) {
                                                          break L58;
                                                        } else {
                                                          byte dupTemp$3 = var2_ref.k(0);
                                                          var9[var5 * var13 + var12] = dupTemp$3;
                                                          var14 = dupTemp$3;
                                                          stackOut_85_0 = var10;
                                                          stackOut_85_1 = 0;
                                                          stackOut_85_2 = ~var14;
                                                          stackIn_50_0 = stackOut_85_0;
                                                          stackIn_50_1 = stackOut_85_1;
                                                          stackIn_50_2 = stackOut_85_2;
                                                          stackIn_86_0 = stackOut_85_0;
                                                          stackIn_86_1 = stackOut_85_1;
                                                          stackIn_86_2 = stackOut_85_2;
                                                          if (var15 != 0) {
                                                            continue L41;
                                                          } else {
                                                            L59: {
                                                              stackOut_86_0 = stackIn_86_0;
                                                              stackIn_89_0 = stackOut_86_0;
                                                              stackIn_87_0 = stackOut_86_0;
                                                              if (stackIn_86_1 == stackIn_86_2) {
                                                                stackOut_89_0 = stackIn_89_0;
                                                                stackOut_89_1 = 0;
                                                                stackIn_90_0 = stackOut_89_0;
                                                                stackIn_90_1 = stackOut_89_1;
                                                                break L59;
                                                              } else {
                                                                stackOut_87_0 = stackIn_87_0;
                                                                stackOut_87_1 = 1;
                                                                stackIn_90_0 = stackOut_87_0;
                                                                stackIn_90_1 = stackOut_87_1;
                                                                break L59;
                                                              }
                                                            }
                                                            var10 = stackIn_90_0 | stackIn_90_1;
                                                            var13++;
                                                            if (var15 == 0) {
                                                              continue L57;
                                                            } else {
                                                              break L58;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var12++;
                                                      if (var15 == 0) {
                                                        continue L56;
                                                      } else {
                                                        break L43;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        v.field_e[var4] = var10 != 0;
                                        var4++;
                                        break L42;
                                      }
                                      if (var15 == 0) {
                                        continue L39;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L14;
                        }
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L60: {
            var2 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var2;
            stackOut_95_1 = new StringBuilder().append("jg.H(");
            stackIn_98_0 = stackOut_95_0;
            stackIn_98_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param0 == null) {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L60;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_99_0 = stackOut_96_0;
              stackIn_99_1 = stackOut_96_1;
              stackIn_99_2 = stackOut_96_2;
              break L60;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 68) {
                break L1;
              } else {
                ((jg) this).field_l = null;
                break L1;
              }
            }
            ((jg) this).field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "jg.B(" + param0 + ')');
        }
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wd var4 = null;
        String stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_14_0 = null;
        String stackIn_20_0 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        String stackOut_19_0 = null;
        String stackOut_21_0 = null;
        Object stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var3 = bl.a(4, (CharSequence) (Object) param0);
            if (var3 == null) {
              if (param1 == -1) {
                L1: {
                  if (!param0.equals((Object) (Object) ((jg) this).field_l)) {
                    L2: {
                      var4 = pl.a(param1, param0);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (null == var4.field_h) {
                          ((jg) this).field_l = param0;
                          ((jg) this).field_s = var4.field_i;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    return (String) (Object) stackIn_14_0;
                  } else {
                    break L1;
                  }
                }
                if (!((jg) this).field_s) {
                  stackOut_19_0 = uc.field_e;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0;
                } else {
                  stackOut_21_0 = oj.field_d;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (String) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = (String) var3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3_ref;
            stackOut_23_1 = new StringBuilder().append("jg.A(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    jg(og param0) {
        super(param0);
        ((jg) this).field_s = false;
    }

    public static void c(byte param0) {
        try {
            field_p = null;
            field_r = null;
            field_q = null;
            if (param0 <= 97) {
                field_m = 69;
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "jg.I(" + param0 + ')');
        }
    }

    final ok a(int param0, String param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        ok stackIn_5_0 = null;
        ok stackIn_12_0 = null;
        ok stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        ok stackOut_11_0 = null;
        ok stackOut_17_0 = null;
        ok stackOut_15_0 = null;
        ok stackOut_4_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_k = -25;
                break L1;
              }
            }
            if (ad.a((CharSequence) (Object) param1, (byte) 120)) {
              L2: {
                if (param1.equals((Object) (Object) ((jg) this).field_l)) {
                  break L2;
                } else {
                  L3: {
                    var3 = pl.a(param0, param1);
                    if (null == var3) {
                      break L3;
                    } else {
                      if (null == var3.field_h) {
                        ((jg) this).field_l = param1;
                        ((jg) this).field_s = var3.field_i;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_11_0 = l.field_S;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
              L4: {
                if (((jg) this).field_s) {
                  stackOut_17_0 = gf.field_V;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_15_0 = hg.field_c;
                  stackIn_18_0 = stackOut_15_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_4_0 = hg.field_c;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("jg.C(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_18_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new bh(8, 0, 4, 1);
        field_r = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_p = "EXCLUSIVE";
    }
}
