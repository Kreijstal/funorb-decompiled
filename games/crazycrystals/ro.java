/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends pn implements Cloneable {
    static dl[] field_u;
    gh field_o;
    gh field_p;
    static String[] field_r;
    static int field_n;
    static String field_t;
    int field_m;
    static String field_s;
    static dl field_q;

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        dl var5 = null;
        RuntimeException var5_ref = null;
        ma stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -74) {
                break L1;
              } else {
                ro.g(-49);
                break L1;
              }
            }
            var5 = param0.a(13214, this.field_m);
            stackIn_3_0 = new ma(var5, (f) (this), param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("ro.S(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return (f) ((Object) stackIn_3_0);
    }

    private final void a(int param0, byte param1, int param2, int param3, boolean param4, int param5) {
        int var8;
        int var9;
        wm var10;
        var10 = jf.a(kh.field_j, param2, 0, param0 * 2 + param2, kh.field_b);
        if (var10 == null) {
          return;
        } else {
          var8 = 2 * (param0 * this.field_o.field_m) / this.field_o.field_p;
          var9 = 2 * this.field_o.field_m * param5 / this.field_o.field_p;
          if (param1 >= -38) {
            this.field_o = (gh) null;
            this.field_o.a(param4, this.field_o.field_o * var8 + param2, param0, param5, param3 + this.field_o.field_s * var9, 4261);
            var10.a((byte) -84);
            return;
          } else {
            this.field_o.a(param4, this.field_o.field_o * var8 + param2, param0, param5, param3 + this.field_o.field_s * var9, 4261);
            var10.a((byte) -84);
            return;
          }
        }
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ro.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static void g(int param0) {
        int var1 = -38 % ((18 - param0) / 61);
        wk.a(dg.field_a, true, fh.field_i, false);
        ud.field_U = true;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        dl stackIn_22_0 = null;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        dl stackIn_44_0 = null;
        dl stackIn_48_0 = null;
        dl stackIn_70_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_87_0 = 0;
        dl stackIn_92_0 = null;
        dl stackIn_96_0 = null;
        int stackIn_120_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_134_0 = 0;
        dl stackIn_139_0 = null;
        dl stackIn_143_0 = null;
        dl stackIn_169_0 = null;
        int stackIn_172_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_186_0 = 0;
        dl stackIn_191_0 = null;
        dl stackIn_195_0 = null;
        dl stackIn_217_0 = null;
        int stackIn_220_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_234_0 = 0;
        dl stackIn_239_0 = null;
        dl stackIn_243_0 = null;
        int stackIn_293_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_301_0 = 0;
        dl stackIn_306_0 = null;
        dl stackIn_339_0 = null;
        int var7;
        int var8;
        int var9;
        int var10;
        dl var11;
        int var12;
        int var13;
        int var14;
        int var15;
        L0: {
          var15 = CrazyCrystals.field_B;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          if (this.field_m != 1) {
            var11 = ig.field_q;
            break L0;
          } else {
            var11 = nf.field_g;
            break L0;
          }
        }
        if (this.field_p != null) {
          L1: {
            var12 = this.field_p.field_G;
            var13 = this.field_p.field_x;
            if (1 == this.field_m) {
              L2: {
                if (0 >= var13 + -var12) {
                  stackIn_13_0 = 0;
                  break L2;
                } else {
                  stackIn_13_0 = 1;
                  break L2;
                }
              }
              var7 = stackIn_13_0;
              break L1;
            } else {
              L3: {
                if ((var13 + var12 ^ -1) >= -1) {
                  stackIn_9_0 = 0;
                  break L3;
                } else {
                  stackIn_9_0 = 1;
                  break L3;
                }
              }
              var7 = stackIn_9_0;
              break L1;
            }
          }
          if (0 != this.field_p.field_m) {
            if (-7 > (this.field_p.field_m ^ -1)) {
              L4: {
                if (this.field_p.field_m == 0) {
                  var14 = 0;
                  break L4;
                } else {
                  var14 = -this.field_p.field_m + 12;
                  break L4;
                }
              }
              if (-2 == (this.field_m ^ -1)) {
                L5: {
                  if (-1 <= (-var13 + var12 ^ -1)) {
                    stackIn_217_0 = ja.field_h[var14];
                    break L5;
                  } else {
                    stackIn_217_0 = tk.field_h[var14];
                    break L5;
                  }
                }
                L6: {
                  var11 = stackIn_217_0;
                  if (var7 != 0) {
                    stackIn_220_0 = 0;
                    break L6;
                  } else {
                    stackIn_220_0 = 1;
                    break L6;
                  }
                }
                L7: {
                  var9 = stackIn_220_0;
                  if (null != this.field_o) {
                    L8: {
                      var12 = this.field_o.field_G;
                      var13 = this.field_o.field_x;
                      if (-2 == (this.field_m ^ -1)) {
                        L9: {
                          if ((-var12 + var13 ^ -1) <= -1) {
                            stackIn_230_0 = 0;
                            break L9;
                          } else {
                            stackIn_230_0 = 1;
                            break L9;
                          }
                        }
                        var8 = stackIn_230_0;
                        break L8;
                      } else {
                        L10: {
                          if (-1 >= (var13 - -var12 ^ -1)) {
                            stackIn_226_0 = 0;
                            break L10;
                          } else {
                            stackIn_226_0 = 1;
                            break L10;
                          }
                        }
                        var8 = stackIn_226_0;
                        break L8;
                      }
                    }
                    L11: {
                      if (var8 != 0) {
                        stackIn_234_0 = 0;
                        break L11;
                      } else {
                        stackIn_234_0 = 1;
                        break L11;
                      }
                    }
                    var10 = stackIn_234_0;
                    if (-7 >= (this.field_o.field_m ^ -1)) {
                      break L7;
                    } else {
                      var14 = this.field_o.field_m;
                      if (1 != this.field_m) {
                        L12: {
                          if (-1 >= (var13 + var12 ^ -1)) {
                            stackIn_243_0 = en.field_K[var14];
                            break L12;
                          } else {
                            stackIn_243_0 = db.field_j[var14];
                            break L12;
                          }
                        }
                        var11 = stackIn_243_0;
                        break L7;
                      } else {
                        L13: {
                          if (0 <= var12 + -var13) {
                            stackIn_239_0 = ja.field_h[var14];
                            break L13;
                          } else {
                            stackIn_239_0 = tk.field_h[var14];
                            break L13;
                          }
                        }
                        var11 = stackIn_239_0;
                        break L7;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                L14: {
                  if (var7 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var8 != 0) {
                    this.a(param1, (byte) -64, param4, param5, param3, param2);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  L17: {
                    var12 = -84 % ((param0 - 74) / 41);
                    if (param1 != 24) {
                      break L17;
                    } else {
                      if (-25 == (param2 ^ -1)) {
                        var11.a(param4, -param2 + param5);
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  break L16;
                }
                L18: {
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                return;
              } else {
                L20: {
                  if (-1 > (var12 + var13 ^ -1)) {
                    stackIn_169_0 = db.field_j[var14];
                    break L20;
                  } else {
                    stackIn_169_0 = en.field_K[var14];
                    break L20;
                  }
                }
                L21: {
                  var11 = stackIn_169_0;
                  if (var7 != 0) {
                    stackIn_172_0 = 0;
                    break L21;
                  } else {
                    stackIn_172_0 = 1;
                    break L21;
                  }
                }
                L22: {
                  var9 = stackIn_172_0;
                  if (null != this.field_o) {
                    L23: {
                      var12 = this.field_o.field_G;
                      var13 = this.field_o.field_x;
                      if (-2 == (this.field_m ^ -1)) {
                        L24: {
                          if ((-var12 + var13 ^ -1) <= -1) {
                            stackIn_182_0 = 0;
                            break L24;
                          } else {
                            stackIn_182_0 = 1;
                            break L24;
                          }
                        }
                        var8 = stackIn_182_0;
                        break L23;
                      } else {
                        L25: {
                          if (-1 >= (var13 - -var12 ^ -1)) {
                            stackIn_178_0 = 0;
                            break L25;
                          } else {
                            stackIn_178_0 = 1;
                            break L25;
                          }
                        }
                        var8 = stackIn_178_0;
                        break L23;
                      }
                    }
                    L26: {
                      if (var8 != 0) {
                        stackIn_186_0 = 0;
                        break L26;
                      } else {
                        stackIn_186_0 = 1;
                        break L26;
                      }
                    }
                    var10 = stackIn_186_0;
                    if (-7 >= (this.field_o.field_m ^ -1)) {
                      break L22;
                    } else {
                      var14 = this.field_o.field_m;
                      if (1 != this.field_m) {
                        L27: {
                          if (-1 >= (var13 + var12 ^ -1)) {
                            stackIn_195_0 = en.field_K[var14];
                            break L27;
                          } else {
                            stackIn_195_0 = db.field_j[var14];
                            break L27;
                          }
                        }
                        var11 = stackIn_195_0;
                        break L22;
                      } else {
                        L28: {
                          if (0 <= var12 + -var13) {
                            stackIn_191_0 = ja.field_h[var14];
                            break L28;
                          } else {
                            stackIn_191_0 = tk.field_h[var14];
                            break L28;
                          }
                        }
                        var11 = stackIn_191_0;
                        break L22;
                      }
                    }
                  } else {
                    break L22;
                  }
                }
                L29: {
                  if (var7 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (var8 != 0) {
                    this.a(param1, (byte) -64, param4, param5, param3, param2);
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  L32: {
                    var12 = -84 % ((param0 - 74) / 41);
                    if (param1 != 24) {
                      break L32;
                    } else {
                      if (-25 == (param2 ^ -1)) {
                        var11.a(param4, -param2 + param5);
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  break L31;
                }
                L33: {
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L34;
                  } else {
                    break L34;
                  }
                }
                return;
              }
            } else {
              L35: {
                if (var7 != 0) {
                  stackIn_120_0 = 0;
                  break L35;
                } else {
                  stackIn_120_0 = 1;
                  break L35;
                }
              }
              L36: {
                var9 = stackIn_120_0;
                if (null != this.field_o) {
                  L37: {
                    var12 = this.field_o.field_G;
                    var13 = this.field_o.field_x;
                    if (-2 == (this.field_m ^ -1)) {
                      L38: {
                        if ((-var12 + var13 ^ -1) <= -1) {
                          stackIn_130_0 = 0;
                          break L38;
                        } else {
                          stackIn_130_0 = 1;
                          break L38;
                        }
                      }
                      var8 = stackIn_130_0;
                      break L37;
                    } else {
                      L39: {
                        if (-1 >= (var13 - -var12 ^ -1)) {
                          stackIn_126_0 = 0;
                          break L39;
                        } else {
                          stackIn_126_0 = 1;
                          break L39;
                        }
                      }
                      var8 = stackIn_126_0;
                      break L37;
                    }
                  }
                  L40: {
                    if (var8 != 0) {
                      stackIn_134_0 = 0;
                      break L40;
                    } else {
                      stackIn_134_0 = 1;
                      break L40;
                    }
                  }
                  var10 = stackIn_134_0;
                  if (-7 >= (this.field_o.field_m ^ -1)) {
                    break L36;
                  } else {
                    var14 = this.field_o.field_m;
                    if (1 != this.field_m) {
                      L41: {
                        if (-1 >= (var13 + var12 ^ -1)) {
                          stackIn_143_0 = en.field_K[var14];
                          break L41;
                        } else {
                          stackIn_143_0 = db.field_j[var14];
                          break L41;
                        }
                      }
                      var11 = stackIn_143_0;
                      break L36;
                    } else {
                      L42: {
                        if (0 <= var12 + -var13) {
                          stackIn_139_0 = ja.field_h[var14];
                          break L42;
                        } else {
                          stackIn_139_0 = tk.field_h[var14];
                          break L42;
                        }
                      }
                      var11 = stackIn_139_0;
                      break L36;
                    }
                  }
                } else {
                  break L36;
                }
              }
              L43: {
                if (var7 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L43;
                } else {
                  break L43;
                }
              }
              L44: {
                if (var8 != 0) {
                  this.a(param1, (byte) -64, param4, param5, param3, param2);
                  break L44;
                } else {
                  break L44;
                }
              }
              L45: {
                L46: {
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 != 24) {
                    break L46;
                  } else {
                    if (-25 == (param2 ^ -1)) {
                      var11.a(param4, -param2 + param5);
                      break L45;
                    } else {
                      break L46;
                    }
                  }
                }
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                break L45;
              }
              L47: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L47;
                } else {
                  break L47;
                }
              }
              L48: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L48;
                } else {
                  break L48;
                }
              }
              return;
            }
          } else {
            L49: {
              if (this.field_p.field_m == 0) {
                var14 = 0;
                break L49;
              } else {
                var14 = -this.field_p.field_m + 12;
                break L49;
              }
            }
            if (-2 == (this.field_m ^ -1)) {
              L50: {
                if (-1 <= (-var13 + var12 ^ -1)) {
                  stackIn_70_0 = ja.field_h[var14];
                  break L50;
                } else {
                  stackIn_70_0 = tk.field_h[var14];
                  break L50;
                }
              }
              L51: {
                var11 = stackIn_70_0;
                if (var7 != 0) {
                  stackIn_73_0 = 0;
                  break L51;
                } else {
                  stackIn_73_0 = 1;
                  break L51;
                }
              }
              L52: {
                var9 = stackIn_73_0;
                if (null != this.field_o) {
                  L53: {
                    var12 = this.field_o.field_G;
                    var13 = this.field_o.field_x;
                    if (-2 == (this.field_m ^ -1)) {
                      L54: {
                        if ((-var12 + var13 ^ -1) <= -1) {
                          stackIn_83_0 = 0;
                          break L54;
                        } else {
                          stackIn_83_0 = 1;
                          break L54;
                        }
                      }
                      var8 = stackIn_83_0;
                      break L53;
                    } else {
                      L55: {
                        if (-1 >= (var13 - -var12 ^ -1)) {
                          stackIn_79_0 = 0;
                          break L55;
                        } else {
                          stackIn_79_0 = 1;
                          break L55;
                        }
                      }
                      var8 = stackIn_79_0;
                      break L53;
                    }
                  }
                  L56: {
                    if (var8 != 0) {
                      stackIn_87_0 = 0;
                      break L56;
                    } else {
                      stackIn_87_0 = 1;
                      break L56;
                    }
                  }
                  var10 = stackIn_87_0;
                  if (-7 >= (this.field_o.field_m ^ -1)) {
                    break L52;
                  } else {
                    var14 = this.field_o.field_m;
                    if (1 != this.field_m) {
                      L57: {
                        if (-1 >= (var13 + var12 ^ -1)) {
                          stackIn_96_0 = en.field_K[var14];
                          break L57;
                        } else {
                          stackIn_96_0 = db.field_j[var14];
                          break L57;
                        }
                      }
                      var11 = stackIn_96_0;
                      break L52;
                    } else {
                      L58: {
                        if (0 <= var12 + -var13) {
                          stackIn_92_0 = ja.field_h[var14];
                          break L58;
                        } else {
                          stackIn_92_0 = tk.field_h[var14];
                          break L58;
                        }
                      }
                      var11 = stackIn_92_0;
                      break L52;
                    }
                  }
                } else {
                  break L52;
                }
              }
              L59: {
                if (var7 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L59;
                } else {
                  break L59;
                }
              }
              L60: {
                if (var8 != 0) {
                  this.a(param1, (byte) -64, param4, param5, param3, param2);
                  break L60;
                } else {
                  break L60;
                }
              }
              L61: {
                L62: {
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 != 24) {
                    break L62;
                  } else {
                    if (-25 == (param2 ^ -1)) {
                      var11.a(param4, -param2 + param5);
                      break L61;
                    } else {
                      break L62;
                    }
                  }
                }
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                break L61;
              }
              L63: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L63;
                } else {
                  break L63;
                }
              }
              L64: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L64;
                } else {
                  break L64;
                }
              }
              return;
            } else {
              L65: {
                if (-1 > (var12 + var13 ^ -1)) {
                  stackIn_22_0 = db.field_j[var14];
                  break L65;
                } else {
                  stackIn_22_0 = en.field_K[var14];
                  break L65;
                }
              }
              L66: {
                var11 = stackIn_22_0;
                if (var7 != 0) {
                  stackIn_25_0 = 0;
                  break L66;
                } else {
                  stackIn_25_0 = 1;
                  break L66;
                }
              }
              L67: {
                var9 = stackIn_25_0;
                if (null != this.field_o) {
                  L68: {
                    var12 = this.field_o.field_G;
                    var13 = this.field_o.field_x;
                    if (-2 == (this.field_m ^ -1)) {
                      L69: {
                        if ((-var12 + var13 ^ -1) <= -1) {
                          stackIn_35_0 = 0;
                          break L69;
                        } else {
                          stackIn_35_0 = 1;
                          break L69;
                        }
                      }
                      var8 = stackIn_35_0;
                      break L68;
                    } else {
                      L70: {
                        if (-1 >= (var13 - -var12 ^ -1)) {
                          stackIn_31_0 = 0;
                          break L70;
                        } else {
                          stackIn_31_0 = 1;
                          break L70;
                        }
                      }
                      var8 = stackIn_31_0;
                      break L68;
                    }
                  }
                  L71: {
                    if (var8 != 0) {
                      stackIn_39_0 = 0;
                      break L71;
                    } else {
                      stackIn_39_0 = 1;
                      break L71;
                    }
                  }
                  var10 = stackIn_39_0;
                  if (-7 >= (this.field_o.field_m ^ -1)) {
                    break L67;
                  } else {
                    var14 = this.field_o.field_m;
                    if (1 != this.field_m) {
                      L72: {
                        if (-1 >= (var13 + var12 ^ -1)) {
                          stackIn_48_0 = en.field_K[var14];
                          break L72;
                        } else {
                          stackIn_48_0 = db.field_j[var14];
                          break L72;
                        }
                      }
                      var11 = stackIn_48_0;
                      break L67;
                    } else {
                      L73: {
                        if (0 <= var12 + -var13) {
                          stackIn_44_0 = ja.field_h[var14];
                          break L73;
                        } else {
                          stackIn_44_0 = tk.field_h[var14];
                          break L73;
                        }
                      }
                      var11 = stackIn_44_0;
                      break L67;
                    }
                  }
                } else {
                  break L67;
                }
              }
              L74: {
                if (var7 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L74;
                } else {
                  break L74;
                }
              }
              L75: {
                if (var8 != 0) {
                  this.a(param1, (byte) -64, param4, param5, param3, param2);
                  break L75;
                } else {
                  break L75;
                }
              }
              L76: {
                L77: {
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 != 24) {
                    break L77;
                  } else {
                    if (-25 == (param2 ^ -1)) {
                      var11.a(param4, -param2 + param5);
                      break L76;
                    } else {
                      break L77;
                    }
                  }
                }
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                break L76;
              }
              L78: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L78;
                } else {
                  break L78;
                }
              }
              L79: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L79;
                } else {
                  break L79;
                }
              }
              return;
            }
          }
        } else {
          if (null != this.field_o) {
            L80: {
              var12 = this.field_o.field_G;
              var13 = this.field_o.field_x;
              if (-2 == (this.field_m ^ -1)) {
                L81: {
                  if ((-var12 + var13 ^ -1) <= -1) {
                    stackIn_297_0 = 0;
                    break L81;
                  } else {
                    stackIn_297_0 = 1;
                    break L81;
                  }
                }
                var8 = stackIn_297_0;
                break L80;
              } else {
                L82: {
                  if (-1 >= (var13 - -var12 ^ -1)) {
                    stackIn_293_0 = 0;
                    break L82;
                  } else {
                    stackIn_293_0 = 1;
                    break L82;
                  }
                }
                var8 = stackIn_293_0;
                break L80;
              }
            }
            L83: {
              if (var8 != 0) {
                stackIn_301_0 = 0;
                break L83;
              } else {
                stackIn_301_0 = 1;
                break L83;
              }
            }
            L84: {
              var10 = stackIn_301_0;
              if (-7 >= (this.field_o.field_m ^ -1)) {
                break L84;
              } else {
                var14 = this.field_o.field_m;
                if (1 != this.field_m) {
                  L85: {
                    if (-1 >= (var13 + var12 ^ -1)) {
                      stackIn_339_0 = en.field_K[var14];
                      break L85;
                    } else {
                      stackIn_339_0 = db.field_j[var14];
                      break L85;
                    }
                  }
                  var11 = stackIn_339_0;
                  break L84;
                } else {
                  L86: {
                    if (0 <= var12 + -var13) {
                      stackIn_306_0 = ja.field_h[var14];
                      break L86;
                    } else {
                      stackIn_306_0 = tk.field_h[var14];
                      break L86;
                    }
                  }
                  L87: {
                    var11 = stackIn_306_0;
                    if (var7 != 0) {
                      this.a(param3, param1, 2, param5, param2, param4);
                      break L87;
                    } else {
                      break L87;
                    }
                  }
                  L88: {
                    if (var8 != 0) {
                      this.a(param1, (byte) -64, param4, param5, param3, param2);
                      break L88;
                    } else {
                      break L88;
                    }
                  }
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 == 24) {
                    if (-25 != (param2 ^ -1)) {
                      L89: {
                        var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                        if (var9 != 0) {
                          this.a(param3, param1, 2, param5, param2, param4);
                          break L89;
                        } else {
                          break L89;
                        }
                      }
                      L90: {
                        if (var10 != 0) {
                          this.a(param1, (byte) -125, param4, param5, param3, param2);
                          break L90;
                        } else {
                          break L90;
                        }
                      }
                      return;
                    } else {
                      L91: {
                        var11.a(param4, -param2 + param5);
                        if (var9 != 0) {
                          this.a(param3, param1, 2, param5, param2, param4);
                          break L91;
                        } else {
                          break L91;
                        }
                      }
                      L92: {
                        if (var10 != 0) {
                          this.a(param1, (byte) -125, param4, param5, param3, param2);
                          break L92;
                        } else {
                          break L92;
                        }
                      }
                      return;
                    }
                  } else {
                    L93: {
                      var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                      if (var9 != 0) {
                        this.a(param3, param1, 2, param5, param2, param4);
                        break L93;
                      } else {
                        break L93;
                      }
                    }
                    L94: {
                      if (var10 != 0) {
                        this.a(param1, (byte) -125, param4, param5, param3, param2);
                        break L94;
                      } else {
                        break L94;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L95: {
              if (var7 != 0) {
                this.a(param3, param1, 2, param5, param2, param4);
                break L95;
              } else {
                break L95;
              }
            }
            L96: {
              if (var8 != 0) {
                this.a(param1, (byte) -64, param4, param5, param3, param2);
                break L96;
              } else {
                break L96;
              }
            }
            var12 = -84 % ((param0 - 74) / 41);
            if (param1 == 24) {
              if (-25 != (param2 ^ -1)) {
                L97: {
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L97;
                  } else {
                    break L97;
                  }
                }
                L98: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L98;
                  } else {
                    break L98;
                  }
                }
                return;
              } else {
                L99: {
                  var11.a(param4, -param2 + param5);
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L99;
                  } else {
                    break L99;
                  }
                }
                L100: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L100;
                  } else {
                    break L100;
                  }
                }
                return;
              }
            } else {
              L101: {
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L101;
                } else {
                  break L101;
                }
              }
              L102: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L102;
                } else {
                  break L102;
                }
              }
              return;
            }
          } else {
            L103: {
              if (var7 != 0) {
                this.a(param3, param1, 2, param5, param2, param4);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              if (var8 != 0) {
                this.a(param1, (byte) -64, param4, param5, param3, param2);
                break L104;
              } else {
                break L104;
              }
            }
            var12 = -84 % ((param0 - 74) / 41);
            if (param1 != 24) {
              L105: {
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L105;
                } else {
                  break L105;
                }
              }
              L106: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L106;
                } else {
                  break L106;
                }
              }
              return;
            } else {
              L107: {
                if (-25 == (param2 ^ -1)) {
                  var11.a(param4, -param2 + param5);
                  break L107;
                } else {
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  break L107;
                }
              }
              L108: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L108;
                } else {
                  break L108;
                }
              }
              L109: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L109;
                } else {
                  break L109;
                }
              }
              return;
            }
          }
        }
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 23525) {
                break L1;
              } else {
                this.a(-44, -106, 68, (f[][]) null, 106, 20, 110, -87);
                break L1;
              }
            }
            stackIn_3_0 = ng.a(sn.field_b, param1, new ro(this.field_m, new kp(-1)), (byte) -83, qk.field_z);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ro.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            field_u = (dl[]) null;
            return (f) (this);
        }
        return (f) (this);
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 92) {
                break L1;
              } else {
                this.a(-61, (byte) -122, 116);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ro.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final int a(boolean param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (!param0) {
          L0: {
            field_u = (dl[]) null;
            if ((this.field_m ^ -1) == -2) {
              stackIn_8_0 = 8;
              break L0;
            } else {
              stackIn_8_0 = 4;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if ((this.field_m ^ -1) == -2) {
              stackIn_4_0 = 8;
              break L1;
            } else {
              stackIn_4_0 = 4;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var8;
        int var9;
        wm var10;
        var10 = jf.a(kh.field_j, param5, param2 + -2, param5 - -(param1 * 2), kh.field_b);
        if (var10 == null) {
          return;
        } else {
          var8 = param2 * ((-this.field_p.field_p + this.field_p.field_m) * param1) / this.field_p.field_p;
          var9 = param4 * ((-this.field_p.field_p + this.field_p.field_m) * 2) / this.field_p.field_p;
          this.field_p.a(param0, this.field_p.field_o * var8 + param5, param1, param4, param3 + var9 * this.field_p.field_s, param2 + 4259);
          var10.a((byte) -16);
          return;
        }
    }

    public static void f(int param0) {
        field_q = null;
        field_t = null;
        field_r = null;
        if (param0 != 4) {
            return;
        }
        field_s = null;
        field_u = null;
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 16736352) {
              stackIn_4_0 = param2;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var9);

            stackIn_7_1 = new StringBuilder().append("ro.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    ro(int param0, f param1) {
        super(param1);
        this.field_p = null;
        this.field_o = null;
        try {
            this.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ro.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(db param0, db param1, boolean param2, db param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2) {
              if (!param0.a((byte) 102)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.a(-20402, "commonui")) {
                  L1: {
                    if (!param1.a((byte) 102)) {
                      break L1;
                    } else {
                      if (param1.a(-20402, "commonui")) {
                        L2: {
                          if (!param3.a((byte) 102)) {
                            break L2;
                          } else {
                            if (!param3.a(-20402, "button.gif")) {
                              break L2;
                            } else {
                              return true;
                            }
                          }
                        }
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("ro.P(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    static {
        field_t = "These are members-only levels.";
        field_r = new String[]{"Easy", "Peasy", "Three Rooms", "An Electric Ball", "Get the Key", "Spider Box", "Bounce Around", "Bomb in the Hole", "Push the Rock", "Hammerhead", "Fiddle Dig", "Mining Disturbance", "Shuffle to Defuse", "Hole Hider", "Variety", "Boom Averted", "A Bit Handy", "Double Shuffles", "Bottom-Heavy", "Critical Mass", "Beyond the Bomb", "Precision", "Bottomless", "Air Raid Bunker", "Twang", "Mirror Fiddle", "Lurid", "Where is the Key?", "Ooh Look, Leaves", "Low Exit", "Star Feet", "Support! Timing!", "Rock Block", "Don't Rush", "Box Box Box", "One-Way", "Smoothly Does It", "Pink Suits You Sir!", "Piercing", "Elimination", "Mystifying", "Crossroads", "Falling Sky", "Balancing Act", "Demolition", "Laser Maze", "Controller", "Safe Madness", "Puzzle Rooms", "Ball Race", "Drop Nothing", "Psychedelic", "Funnel", "Cascade", "Rook", "Bomb Block Rock", "Magic Pervades", "Quick, Kill Them!", "Where to?", "Hot Feet", "Rather Hard", "Turbo Controller", "Funner Funnel", "Unexplainable", "Juggle Maze", "Fearsome", "Filter Effect", "It's a Goblin!", "It's Hostile!", "Grand Finale"};
        field_s = "achievements to collect";
    }
}
