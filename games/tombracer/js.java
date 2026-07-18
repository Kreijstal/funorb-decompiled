/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js extends dr {
    private ppa field_h;
    private int field_e;
    private hha field_q;
    private qda field_u;
    private ji field_p;
    private byte[] field_n;
    private int field_t;
    private int field_j;
    private byte[] field_o;
    static int field_l;
    static ft field_g;
    private ss field_i;
    static jea field_d;
    private ppa field_s;
    private dla field_k;
    private int field_m;
    private boolean field_r;
    private vna field_f;
    private vna field_b;
    private boolean field_w;
    private boolean field_v;
    private long field_c;

    final byte[] a(int param0, byte param1) {
        hha var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(0, -116, param0);
            if (var3 != null) {
              var4 = var3.b((byte) -126);
              if (param1 == -39) {
                var3.p(param1 + 124);
                stackOut_6_0 = (byte[]) var4;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3_ref, "js.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        hha var2_ref = null;
        vg var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        boolean stackIn_105_0 = false;
        int stackIn_123_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        boolean stackOut_104_0 = false;
        int stackOut_122_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null != ((js) this).field_f) {
                  if (((js) this).a(true) == null) {
                    return;
                  } else {
                    L3: {
                      if (((js) this).field_w) {
                        break L3;
                      } else {
                        L4: {
                          if (((js) this).field_r) {
                            break L4;
                          } else {
                            ((js) this).field_f = null;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int = 1;
                        var3 = ((js) this).field_f.f(param0 ^ -936);
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_d;
                                stackOut_17_0 = ((js) this).field_n[var4];
                                stackOut_17_1 = 1;
                                stackIn_30_0 = stackOut_17_0;
                                stackIn_30_1 = stackOut_17_1;
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_30_0 >= stackIn_30_1) {
                                      break L6;
                                    } else {
                                      stackOut_31_0 = -1;
                                      stackOut_31_1 = ~((js) this).field_k.field_c[((js) this).field_m];
                                      stackIn_124_0 = stackOut_31_0;
                                      stackIn_124_1 = stackOut_31_1;
                                      stackIn_32_0 = stackOut_31_0;
                                      stackIn_32_1 = stackOut_31_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_32_0 = stackIn_32_0;
                                        stackOut_32_1 = stackIn_32_1;
                                        stackIn_34_0 = stackOut_32_0;
                                        stackIn_34_1 = stackOut_32_1;
                                        L9: {
                                          L10: {
                                            if (stackIn_34_0 != stackIn_34_1) {
                                              break L10;
                                            } else {
                                              ((js) this).field_m = ((js) this).field_m + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (((js) this).field_u.b(-21)) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (((js) this).field_n[((js) this).field_m] != 1) {
                                              hha discarded$4 = this.a(2, 126, ((js) this).field_m);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((js) this).field_n[((js) this).field_m] != 1) {
                                              var3 = new vg();
                                              var3.field_d = (long)((js) this).field_m;
                                              ((js) this).field_f.b((byte) -96, var3);
                                              var2_int = 0;
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                          ((js) this).field_m = ((js) this).field_m + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_29_0 = ~((js) this).field_k.field_c.length;
                                        stackOut_29_1 = ~((js) this).field_m;
                                        stackIn_30_0 = stackOut_29_0;
                                        stackIn_30_1 = stackOut_29_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_18_0 == stackIn_18_1) {
                                      break L14;
                                    } else {
                                      hha discarded$5 = this.a(2, -52, var4);
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((js) this).field_n[var4] != 1) {
                                        break L16;
                                      } else {
                                        var3.p(41);
                                        if (var5 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L15;
                                  }
                                  var3 = ((js) this).field_f.e(116);
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_29_0 = ~((js) this).field_k.field_c.length;
                              stackOut_29_1 = ~((js) this).field_m;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              if (stackIn_30_0 >= stackIn_30_1) {
                                break L6;
                              } else {
                                stackOut_31_0 = -1;
                                stackOut_31_1 = ~((js) this).field_k.field_c[((js) this).field_m];
                                stackIn_124_0 = stackOut_31_0;
                                stackIn_124_1 = stackOut_31_1;
                                stackIn_32_0 = stackOut_31_0;
                                stackIn_32_1 = stackOut_31_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_32_0 = stackIn_32_0;
                                  stackOut_32_1 = stackIn_32_1;
                                  stackIn_34_0 = stackOut_32_0;
                                  stackIn_34_1 = stackOut_32_1;
                                  L18: {
                                    if (stackIn_34_0 != stackIn_34_1) {
                                      break L18;
                                    } else {
                                      ((js) this).field_m = ((js) this).field_m + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((js) this).field_u.b(-21)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (((js) this).field_n[((js) this).field_m] != 1) {
                                      hha discarded$4 = this.a(2, 126, ((js) this).field_m);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((js) this).field_n[((js) this).field_m] != 1) {
                                      var3 = new vg();
                                      var3.field_d = (long)((js) this).field_m;
                                      ((js) this).field_f.b((byte) -96, var3);
                                      var2_int = 0;
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  ((js) this).field_m = ((js) this).field_m + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          L22: {
                            if (var2_int == 0) {
                              break L22;
                            } else {
                              ((js) this).field_m = 0;
                              ((js) this).field_r = false;
                              break L22;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((js) this).field_f.f(-80);
                    L23: while (true) {
                      L24: {
                        L25: {
                          if (var3 == null) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_d;
                            stackOut_61_0 = ~((js) this).field_n[var4];
                            stackOut_61_1 = -1;
                            stackIn_74_0 = stackOut_61_0;
                            stackIn_74_1 = stackOut_61_1;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_74_0 >= stackIn_74_1) {
                                  break L24;
                                } else {
                                  stackOut_75_0 = -1;
                                  stackOut_75_1 = ~((js) this).field_k.field_c[((js) this).field_m];
                                  stackIn_124_0 = stackOut_75_0;
                                  stackIn_124_1 = stackOut_75_1;
                                  stackIn_76_0 = stackOut_75_0;
                                  stackIn_76_1 = stackOut_75_1;
                                  if (var5 != 0) {
                                    break L1;
                                  } else {
                                    stackOut_76_0 = stackIn_76_0;
                                    stackOut_76_1 = stackIn_76_1;
                                    stackIn_78_0 = stackOut_76_0;
                                    stackIn_78_1 = stackOut_76_1;
                                    L27: {
                                      L28: {
                                        if (stackIn_78_0 == stackIn_78_1) {
                                          ((js) this).field_m = ((js) this).field_m + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        } else {
                                          break L28;
                                        }
                                      }
                                      L29: {
                                        if (((js) this).field_i.field_b < 250) {
                                          break L29;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L24;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (0 != ((js) this).field_n[((js) this).field_m]) {
                                          break L30;
                                        } else {
                                          hha discarded$6 = this.a(1, param0 ^ -988, ((js) this).field_m);
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (0 == ((js) this).field_n[((js) this).field_m]) {
                                          var3 = new vg();
                                          var3.field_d = (long)((js) this).field_m;
                                          var2_int = 0;
                                          ((js) this).field_f.b((byte) -91, var3);
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      ((js) this).field_m = ((js) this).field_m + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_73_0 = ((js) this).field_m;
                                    stackOut_73_1 = ((js) this).field_k.field_c.length;
                                    stackIn_74_0 = stackOut_73_0;
                                    stackIn_74_1 = stackOut_73_1;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_62_0 != stackIn_62_1) {
                                  break L32;
                                } else {
                                  hha discarded$7 = this.a(1, param0 ^ -991, var4);
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (((js) this).field_n[var4] == 0) {
                                    break L34;
                                  } else {
                                    var3.p(116);
                                    if (var5 == 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L33;
                              }
                              var3 = ((js) this).field_f.e(124);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_73_0 = ((js) this).field_m;
                          stackOut_73_1 = ((js) this).field_k.field_c.length;
                          stackIn_74_0 = stackOut_73_0;
                          stackIn_74_1 = stackOut_73_1;
                          if (stackIn_74_0 >= stackIn_74_1) {
                            break L24;
                          } else {
                            stackOut_75_0 = -1;
                            stackOut_75_1 = ~((js) this).field_k.field_c[((js) this).field_m];
                            stackIn_124_0 = stackOut_75_0;
                            stackIn_124_1 = stackOut_75_1;
                            stackIn_76_0 = stackOut_75_0;
                            stackIn_76_1 = stackOut_75_1;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              stackOut_76_0 = stackIn_76_0;
                              stackOut_76_1 = stackIn_76_1;
                              stackIn_78_0 = stackOut_76_0;
                              stackIn_78_1 = stackOut_76_1;
                              L36: {
                                if (stackIn_78_0 == stackIn_78_1) {
                                  ((js) this).field_m = ((js) this).field_m + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                } else {
                                  break L36;
                                }
                              }
                              L37: {
                                if (((js) this).field_i.field_b < 250) {
                                  break L37;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L24;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (0 != ((js) this).field_n[((js) this).field_m]) {
                                  break L38;
                                } else {
                                  hha discarded$6 = this.a(1, param0 ^ -988, ((js) this).field_m);
                                  break L38;
                                }
                              }
                              L39: {
                                if (0 == ((js) this).field_n[((js) this).field_m]) {
                                  var3 = new vg();
                                  var3.field_d = (long)((js) this).field_m;
                                  var2_int = 0;
                                  ((js) this).field_f.b((byte) -91, var3);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              ((js) this).field_m = ((js) this).field_m + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      if (var2_int == 0) {
                        break L2;
                      } else {
                        ((js) this).field_m = 0;
                        ((js) this).field_w = false;
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              L40: {
                L41: {
                  if (!((js) this).field_v) {
                    break L41;
                  } else {
                    if (~((js) this).field_c < ~bva.b((byte) -107)) {
                      break L41;
                    } else {
                      var2_ref = (hha) (Object) ((js) this).field_p.d(param0 + -1000);
                      L42: while (true) {
                        L43: {
                          if (null == var2_ref) {
                            break L43;
                          } else {
                            stackOut_104_0 = var2_ref.field_m;
                            stackIn_123_0 = stackOut_104_0 ? 1 : 0;
                            stackIn_105_0 = stackOut_104_0;
                            if (var5 != 0) {
                              break L40;
                            } else {
                              L44: {
                                if (stackIn_105_0) {
                                  break L44;
                                } else {
                                  L45: {
                                    if (!var2_ref.field_k) {
                                      break L45;
                                    } else {
                                      if (!var2_ref.field_l) {
                                        throw new RuntimeException();
                                      } else {
                                        var2_ref.p(46);
                                        if (var5 == 0) {
                                          break L44;
                                        } else {
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                  var2_ref.field_k = true;
                                  break L44;
                                }
                              }
                              var2_ref = (hha) (Object) ((js) this).field_p.c(20806);
                              if (var5 == 0) {
                                continue L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        ((js) this).field_c = 1000L + bva.b((byte) -107);
                        break L41;
                      }
                    }
                  }
                }
                stackOut_122_0 = param0;
                stackIn_123_0 = stackOut_122_0;
                break L40;
              }
              stackOut_123_0 = stackIn_123_0;
              stackOut_123_1 = 1000;
              stackIn_124_0 = stackOut_123_0;
              stackIn_124_1 = stackOut_123_1;
              break L1;
            }
            L46: {
              if (stackIn_124_0 == stackIn_124_1) {
                break L46;
              } else {
                ((js) this).field_c = -79L;
                break L46;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "js.I(" + param0 + ')');
        }
    }

    final static void a(double param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -256) {
                break L1;
              } else {
                js.a(0.721841364009857, 28);
                break L1;
              }
            }
            L2: {
              if (param0 == ed.field_a) {
                break L2;
              } else {
                var3_int = 0;
                L3: while (true) {
                  L4: {
                    if (var3_int >= 256) {
                      break L4;
                    } else {
                      var4 = (int)(Math.pow((double)var3_int / 255.0, param0) * 255.0);
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          stackOut_8_0 = sk.field_c;
                          stackOut_8_1 = var3_int;
                          stackIn_13_0 = stackOut_8_0;
                          stackIn_13_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var4 > 255) {
                            stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = 255;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            break L5;
                          } else {
                            stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = var4;
                            stackIn_14_0 = stackOut_11_0;
                            stackIn_14_1 = stackOut_11_1;
                            stackIn_14_2 = stackOut_11_2;
                            break L5;
                          }
                        }
                        stackIn_14_0[stackIn_14_1] = stackIn_14_2;
                        var3_int++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  ed.field_a = param0;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "js.G(" + param0 + ',' + param1 + ')');
        }
    }

    final int b(int param0, int param1) {
        hha var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 27079) {
                break L1;
              } else {
                byte[] discarded$2 = ((js) this).a(115, (byte) -96);
                break L1;
              }
            }
            var3 = (hha) (Object) ((js) this).field_p.a((byte) -104, (long)param1);
            if (var3 != null) {
              stackOut_6_0 = var3.a((byte) -115);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3_ref, "js.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        vg var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((js) this).field_f != null) {
              if (null == ((js) this).a(true)) {
                return;
              } else {
                var2_ref = ((js) this).field_b.f(-80);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2_ref == null) {
                        break L3;
                      } else {
                        var3 = (int)var2_ref.field_d;
                        stackOut_8_0 = 0;
                        stackOut_8_1 = var3;
                        stackIn_37_0 = stackOut_8_0;
                        stackIn_37_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                if (stackIn_9_0 > stackIn_9_1) {
                                  break L6;
                                } else {
                                  if (~((js) this).field_k.field_l >= ~var3) {
                                    break L6;
                                  } else {
                                    if (((js) this).field_k.field_c[var3] != 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2_ref.p(91);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (((js) this).field_n[var3] == 0) {
                                hha discarded$2 = this.a(1, 124, var3);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              if (((js) this).field_n[var3] == -1) {
                                hha discarded$3 = this.a(2, param0 + 28590, var3);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (1 == ((js) this).field_n[var3]) {
                              var2_ref.p(71);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var2_ref = ((js) this).field_b.e(param0 ^ -28599);
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_36_0 = param0;
                    stackOut_36_1 = -28613;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    break L2;
                  }
                  L9: {
                    if (stackIn_37_0 == stackIn_37_1) {
                      break L9;
                    } else {
                      ((js) this).field_s = null;
                      break L9;
                    }
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "js.K(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        try {
            field_g = null;
            field_d = null;
            if (param0 != -50) {
                field_g = null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "js.J(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((js) this).field_h) {
              return;
            } else {
              L1: {
                ((js) this).field_r = true;
                if (null != ((js) this).field_f) {
                  break L1;
                } else {
                  ((js) this).field_f = new vna();
                  break L1;
                }
              }
              L2: {
                if (param0 == 115) {
                  break L2;
                } else {
                  js.b((byte) 13);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "js.H(" + param0 + ')');
        }
    }

    final dla a(boolean param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        dla stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_50_0 = null;
        dla stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        dla stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_49_0 = null;
        Object stackOut_35_0 = null;
        dla stackOut_59_0 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((js) this).field_k != null) {
              stackOut_4_0 = ((js) this).field_k;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (((js) this).field_q != null) {
                  break L1;
                } else {
                  if (!((js) this).field_u.d(-21)) {
                    ((js) this).field_q = (hha) (Object) ((js) this).field_u.a(((js) this).field_j, true, 255, -21, (byte) 0);
                    break L1;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (dla) (Object) stackIn_11_0;
                  }
                }
              }
              L2: {
                if (param0) {
                  break L2;
                } else {
                  ((js) this).a((byte) -56);
                  break L2;
                }
              }
              if (((js) this).field_q.field_m) {
                stackOut_19_0 = null;
                stackIn_20_0 = stackOut_19_0;
                return (dla) (Object) stackIn_20_0;
              } else {
                L3: {
                  var2_array = ((js) this).field_q.b((byte) -126);
                  if (!(((js) this).field_q instanceof sga)) {
                    try {
                      L4: {
                        if (null == var2_array) {
                          throw new RuntimeException();
                        } else {
                          ((js) this).field_k = new dla(var2_array, ((js) this).field_t, ((js) this).field_o);
                          break L4;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        L6: {
                          var3 = decompiledCaughtException;
                          ((js) this).field_u.e(-1);
                          ((js) this).field_k = null;
                          if (!((js) this).field_u.d(-21)) {
                            break L6;
                          } else {
                            ((js) this).field_q = null;
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        ((js) this).field_q = (hha) (Object) ((js) this).field_u.a(((js) this).field_j, true, 255, -21, (byte) 0);
                        break L5;
                      }
                      stackOut_49_0 = null;
                      stackIn_50_0 = stackOut_49_0;
                      return (dla) (Object) stackIn_50_0;
                    }
                    if (((js) this).field_s != null) {
                      sga discarded$1 = ((js) this).field_i.a(false, ((js) this).field_j, ((js) this).field_s, var2_array);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    try {
                      L7: {
                        if (null != var2_array) {
                          ((js) this).field_k = new dla(var2_array, ((js) this).field_t, ((js) this).field_o);
                          if (((js) this).field_k.field_a == ((js) this).field_e) {
                            break L7;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L8: {
                        L9: {
                          var3 = decompiledCaughtException;
                          ((js) this).field_k = null;
                          if (!((js) this).field_u.d(-21)) {
                            break L9;
                          } else {
                            ((js) this).field_q = null;
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((js) this).field_q = (hha) (Object) ((js) this).field_u.a(((js) this).field_j, true, 255, -21, (byte) 0);
                        break L8;
                      }
                      stackOut_35_0 = null;
                      stackIn_36_0 = stackOut_35_0;
                      return (dla) (Object) stackIn_36_0;
                    }
                    break L3;
                  }
                }
                L10: {
                  if (((js) this).field_h != null) {
                    ((js) this).field_n = new byte[((js) this).field_k.field_l];
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((js) this).field_q = null;
                stackOut_59_0 = ((js) this).field_k;
                stackIn_60_0 = stackOut_59_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "js.D(" + param0 + ')');
        }
        return stackIn_60_0;
    }

    private final hha a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var7_int = 0;
        int var8_int = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_63_0 = null;
        byte stackIn_84_0 = 0;
        byte stackIn_84_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_110_0 = null;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        Object stackIn_144_0 = null;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        Object stackIn_156_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_28_0 = null;
        Object stackOut_48_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        Object stackOut_143_0 = null;
        byte stackOut_148_0 = 0;
        int stackOut_148_1 = 0;
        Object stackOut_155_0 = null;
        byte stackOut_83_0 = 0;
        byte stackOut_83_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        Object stackOut_102_0 = null;
        Object stackOut_109_0 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (hha) (Object) ((js) this).field_p.a((byte) -124, (long)param2);
              if (null == var4) {
                break L1;
              } else {
                if (param0 != 0) {
                  break L1;
                } else {
                  if (((hha) var4).field_l) {
                    break L1;
                  } else {
                    if (((hha) var4).field_m) {
                      ((hha) var4).p(12);
                      var4 = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (null != var4) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param0 != 0) {
                      break L4;
                    } else {
                      L5: {
                        if (null == ((js) this).field_h) {
                          break L5;
                        } else {
                          if (((js) this).field_n[param2] != -1) {
                            var4 = (Object) (Object) ((js) this).field_i.a(15871, ((js) this).field_h, param2);
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (((js) this).field_u.d(-21)) {
                          break L6;
                        } else {
                          var4 = (Object) (Object) ((js) this).field_u.a(param2, true, ((js) this).field_j, -21, (byte) 2);
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      stackOut_28_0 = null;
                      stackIn_29_0 = stackOut_28_0;
                      return (hha) (Object) stackIn_29_0;
                    }
                  }
                  if (param0 == 1) {
                    if (((js) this).field_h == null) {
                      throw new RuntimeException();
                    } else {
                      var4 = (Object) (Object) ((js) this).field_i.a((byte) -50, param2, ((js) this).field_h);
                      break L3;
                    }
                  } else {
                    L7: {
                      if (param0 != 2) {
                        break L7;
                      } else {
                        if (((js) this).field_h == null) {
                          throw new RuntimeException();
                        } else {
                          if (((js) this).field_n[param2] != -1) {
                            throw new RuntimeException();
                          } else {
                            if (!((js) this).field_u.b(-21)) {
                              var4 = (Object) (Object) ((js) this).field_u.a(param2, false, ((js) this).field_j, -21, (byte) 2);
                              if (var11 == 0) {
                                break L3;
                              } else {
                                break L7;
                              }
                            } else {
                              stackOut_48_0 = null;
                              stackIn_49_0 = stackOut_48_0;
                              return (hha) (Object) stackIn_49_0;
                            }
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                }
                ((js) this).field_p.a((long)param2, 118, (vg) var4);
                break L2;
              }
            }
            if (((hha) var4).field_m) {
              stackOut_62_0 = null;
              stackIn_63_0 = stackOut_62_0;
              return (hha) (Object) stackIn_63_0;
            } else {
              var5 = ((hha) var4).b((byte) -126);
              var6 = 8 / ((57 - param1) / 63);
              if (!(var4 instanceof sga)) {
                try {
                  L8: {
                    L9: {
                      if (var5 == null) {
                        break L9;
                      } else {
                        if (var5.length <= 2) {
                          break L9;
                        } else {
                          vf.field_g.reset();
                          vf.field_g.update(var5, 0, var5.length + -2);
                          var7_int = (int)vf.field_g.getValue();
                          if (var7_int == ((js) this).field_k.field_j[param2]) {
                            L10: {
                              if (((js) this).field_k.field_h == null) {
                                break L10;
                              } else {
                                if (((js) this).field_k.field_h[param2] == null) {
                                  break L10;
                                } else {
                                  var8 = ((js) this).field_k.field_h[param2];
                                  var9 = fja.a(var5.length + -2, var5, 0, 8);
                                  var10 = 0;
                                  L11: while (true) {
                                    if (var10 >= 64) {
                                      break L10;
                                    } else {
                                      stackOut_127_0 = ~var9[var10];
                                      stackOut_127_1 = ~var8[var10];
                                      stackIn_149_0 = stackOut_127_0;
                                      stackIn_149_1 = stackOut_127_1;
                                      stackIn_128_0 = stackOut_127_0;
                                      stackIn_128_1 = stackOut_127_1;
                                      if (var11 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L8;
                                      } else {
                                        if (stackIn_128_0 == stackIn_128_1) {
                                          var10++;
                                          if (var11 == 0) {
                                            continue L11;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((js) this).field_u.field_a = 0;
                            ((js) this).field_u.field_n = 0;
                            decompiledRegionSelector0 = 1;
                            break L8;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L12: {
                    var7_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((js) this).field_u.e(-1);
                    ((hha) var4).p(82);
                    if (!((hha) var4).field_l) {
                      break L12;
                    } else {
                      if (!((js) this).field_u.d(-21)) {
                        var4 = (Object) (Object) ((js) this).field_u.a(param2, true, ((js) this).field_j, -21, (byte) 2);
                        ((js) this).field_p.a((long)param2, 125, (vg) var4);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  stackOut_143_0 = null;
                  stackIn_144_0 = stackOut_143_0;
                  return (hha) (Object) stackIn_144_0;
                }
                L13: {
                  L14: {
                    if (decompiledRegionSelector0 == 0) {
                      break L14;
                    } else {
                      var5[-2 + var5.length] = (byte)(((js) this).field_k.field_f[param2] >>> -490639832);
                      var5[-1 + var5.length] = (byte)((js) this).field_k.field_f[param2];
                      if (null != ((js) this).field_h) {
                        sga discarded$1 = ((js) this).field_i.a(false, param2, ((js) this).field_h, var5);
                        stackOut_148_0 = ((js) this).field_n[param2];
                        stackOut_148_1 = 1;
                        stackIn_149_0 = stackOut_148_0;
                        stackIn_149_1 = stackOut_148_1;
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (stackIn_149_0 == stackIn_149_1) {
                    break L13;
                  } else {
                    ((js) this).field_n[param2] = (byte) 1;
                    break L13;
                  }
                }
                L15: {
                  if (((hha) var4).field_l) {
                    break L15;
                  } else {
                    ((hha) var4).p(125);
                    break L15;
                  }
                }
                stackOut_155_0 = var4;
                stackIn_156_0 = stackOut_155_0;
                break L0;
              } else {
                try {
                  L16: {
                    L17: {
                      if (var5 == null) {
                        break L17;
                      } else {
                        if (2 >= var5.length) {
                          break L17;
                        } else {
                          vf.field_g.reset();
                          vf.field_g.update(var5, 0, var5.length - 2);
                          var7_int = (int)vf.field_g.getValue();
                          if (~var7_int == ~((js) this).field_k.field_j[param2]) {
                            L18: {
                              L19: {
                                if (null == ((js) this).field_k.field_h) {
                                  break L19;
                                } else {
                                  if (((js) this).field_k.field_h[param2] != null) {
                                    var8 = ((js) this).field_k.field_h[param2];
                                    var9 = fja.a(-2 + var5.length, var5, 0, 8);
                                    var10 = 0;
                                    L20: while (true) {
                                      if (64 <= var10) {
                                        break L19;
                                      } else {
                                        stackOut_83_0 = var8[var10];
                                        stackOut_83_1 = var9[var10];
                                        stackIn_91_0 = stackOut_83_0;
                                        stackIn_91_1 = stackOut_83_1;
                                        stackIn_84_0 = stackOut_83_0;
                                        stackIn_84_1 = stackOut_83_1;
                                        if (var11 != 0) {
                                          break L18;
                                        } else {
                                          if (stackIn_84_0 == stackIn_84_1) {
                                            var10++;
                                            if (var11 == 0) {
                                              continue L20;
                                            } else {
                                              break L19;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              stackOut_90_0 = 255 & var5[var5.length - 1];
                              stackOut_90_1 = 65280 & var5[var5.length - 2] << 1590165512;
                              stackIn_91_0 = stackOut_90_0;
                              stackIn_91_1 = stackOut_90_1;
                              break L18;
                            }
                            var8_int = stackIn_91_0 + stackIn_91_1;
                            if (~(65535 & ((js) this).field_k.field_f[param2]) == ~var8_int) {
                              L21: {
                                if (1 != ((js) this).field_n[param2]) {
                                  L22: {
                                    if (((js) this).field_n[param2] != 0) {
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                  ((js) this).field_n[param2] = (byte) 1;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              L23: {
                                if (((hha) var4).field_l) {
                                  break L23;
                                } else {
                                  ((hha) var4).p(70);
                                  break L23;
                                }
                              }
                              stackOut_102_0 = var4;
                              stackIn_103_0 = stackOut_102_0;
                              break L16;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L24: {
                    var7 = (Exception) (Object) decompiledCaughtException;
                    ((js) this).field_n[param2] = (byte) -1;
                    ((hha) var4).p(53);
                    if (!((hha) var4).field_l) {
                      break L24;
                    } else {
                      if (((js) this).field_u.d(-21)) {
                        break L24;
                      } else {
                        var4 = (Object) (Object) ((js) this).field_u.a(param2, true, ((js) this).field_j, -21, (byte) 2);
                        ((js) this).field_p.a((long)param2, 117, (vg) var4);
                        break L24;
                      }
                    }
                  }
                  stackOut_109_0 = null;
                  stackIn_110_0 = stackOut_109_0;
                  return (hha) (Object) stackIn_110_0;
                }
                return (hha) (Object) stackIn_103_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw tba.a((Throwable) var4, "js.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (hha) (Object) stackIn_156_0;
    }

    js(int param0, ppa param1, ppa param2, qda param3, ss param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        ((js) this).field_p = new ji(16);
        ((js) this).field_m = 0;
        ((js) this).field_b = new vna();
        ((js) this).field_c = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((js) this).field_h = param1;
                ((js) this).field_j = param0;
                if (((js) this).field_h != null) {
                  break L2;
                } else {
                  ((js) this).field_w = false;
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((js) this).field_w = true;
              ((js) this).field_f = new vna();
              break L1;
            }
            L3: {
              ((js) this).field_v = param8;
              ((js) this).field_e = param7;
              ((js) this).field_i = param4;
              ((js) this).field_s = param2;
              ((js) this).field_t = param5;
              ((js) this).field_u = param3;
              ((js) this).field_o = param6;
              if (((js) this).field_s != null) {
                ((js) this).field_q = (hha) (Object) ((js) this).field_i.a(15871, ((js) this).field_s, ((js) this).field_j);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("js.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ft(1);
    }
}
