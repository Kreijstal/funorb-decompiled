/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends fnb {
    private pfa field_f;
    private int field_n;
    private gnb field_u;
    private qp field_t;
    private fo field_l;
    private int field_p;
    private fo field_j;
    static llb field_s;
    private byte[] field_k;
    private int field_w;
    private ona field_g;
    private byte[] field_d;
    private jtb field_r;
    private boolean field_o;
    private ij field_v;
    private ij field_i;
    private int field_h;
    private boolean field_q;
    private long field_e;
    private boolean field_m;

    final qp a(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        qp stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_50_0 = null;
        qp stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        qp stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_49_0 = null;
        Object stackOut_35_0 = null;
        qp stackOut_59_0 = null;
        Object stackOut_19_0 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (((ga) this).field_t != null) {
              stackOut_4_0 = ((ga) this).field_t;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (null == ((ga) this).field_r) {
                  if (!((ga) this).field_g.d(126)) {
                    ((ga) this).field_r = (jtb) (Object) ((ga) this).field_g.a(true, param0 ^ -30, ((ga) this).field_p, (byte) 0, 255);
                    break L1;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (qp) (Object) stackIn_11_0;
                  }
                } else {
                  break L1;
                }
              }
              if (((ga) this).field_r.field_n) {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (qp) (Object) stackIn_17_0;
              } else {
                if (param0 == 9) {
                  L2: {
                    var2_array = ((ga) this).field_r.a(param0 ^ -97);
                    if (!(((ga) this).field_r instanceof jma)) {
                      try {
                        L3: {
                          if (null == var2_array) {
                            throw new RuntimeException();
                          } else {
                            ((ga) this).field_t = new qp(var2_array, ((ga) this).field_n, ((ga) this).field_k);
                            break L3;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          L5: {
                            var3 = decompiledCaughtException;
                            ((ga) this).field_g.a((byte) -25);
                            ((ga) this).field_t = null;
                            if (((ga) this).field_g.d(param0 ^ 89)) {
                              break L5;
                            } else {
                              ((ga) this).field_r = (jtb) (Object) ((ga) this).field_g.a(true, param0 + -30, ((ga) this).field_p, (byte) 0, 255);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ((ga) this).field_r = null;
                          break L4;
                        }
                        stackOut_49_0 = null;
                        stackIn_50_0 = stackOut_49_0;
                        return (qp) (Object) stackIn_50_0;
                      }
                      if (null != ((ga) this).field_j) {
                        jma discarded$1 = ((ga) this).field_f.a(((ga) this).field_j, var2_array, (byte) 92, ((ga) this).field_p);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      try {
                        L6: {
                          if (var2_array != null) {
                            ((ga) this).field_t = new qp(var2_array, ((ga) this).field_n, ((ga) this).field_k);
                            if (~((ga) this).field_t.field_e == ~((ga) this).field_w) {
                              break L6;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L7: {
                          L8: {
                            var3 = decompiledCaughtException;
                            ((ga) this).field_t = null;
                            if (((ga) this).field_g.d(121)) {
                              break L8;
                            } else {
                              ((ga) this).field_r = (jtb) (Object) ((ga) this).field_g.a(true, -21, ((ga) this).field_p, (byte) 0, 255);
                              if (var4 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          ((ga) this).field_r = null;
                          break L7;
                        }
                        stackOut_35_0 = null;
                        stackIn_36_0 = stackOut_35_0;
                        return (qp) (Object) stackIn_36_0;
                      }
                      break L2;
                    }
                  }
                  L9: {
                    ((ga) this).field_r = null;
                    if (null != ((ga) this).field_l) {
                      ((ga) this).field_d = new byte[((ga) this).field_t.field_l];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  stackOut_59_0 = ((ga) this).field_t;
                  stackIn_60_0 = stackOut_59_0;
                  break L0;
                } else {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  return (qp) (Object) stackIn_20_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "ga.G(" + param0 + ')');
        }
        return stackIn_60_0;
    }

    final int a(int param0, boolean param1) {
        jtb var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            var3 = (jtb) (Object) ((ga) this).field_u.a((long)param0, 122);
            if (var3 != null) {
              stackOut_3_0 = var3.e((byte) -4);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  ga.c((byte) 114);
                  break L1;
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3_ref, "ga.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        jtb var2_ref = null;
        ksa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        byte stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        byte stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ga) this).field_i == null) {
                  break L2;
                } else {
                  if (((ga) this).a((byte) 9) != null) {
                    L3: {
                      if (!((ga) this).field_o) {
                        break L3;
                      } else {
                        var2_int = 1;
                        var3 = ((ga) this).field_i.d(0);
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (null == var3) {
                                break L6;
                              } else {
                                var4 = (int)var3.field_b;
                                stackOut_7_0 = -1;
                                stackOut_7_1 = ~((ga) this).field_d[var4];
                                stackIn_19_0 = stackOut_7_0;
                                stackIn_19_1 = stackOut_7_1;
                                stackIn_8_0 = stackOut_7_0;
                                stackIn_8_1 = stackOut_7_1;
                                if (var5 != 0) {
                                  L7: while (true) {
                                    if (stackIn_19_0 >= stackIn_19_1) {
                                      break L5;
                                    } else {
                                      stackOut_20_0 = 0;
                                      stackOut_20_1 = ((ga) this).field_t.field_j[((ga) this).field_h];
                                      stackIn_93_0 = stackOut_20_0;
                                      stackIn_93_1 = stackOut_20_1;
                                      stackIn_21_0 = stackOut_20_0;
                                      stackIn_21_1 = stackOut_20_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_21_0 = stackIn_21_0;
                                        stackOut_21_1 = stackIn_21_1;
                                        stackIn_23_0 = stackOut_21_0;
                                        stackIn_23_1 = stackOut_21_1;
                                        L8: {
                                          L9: {
                                            if (stackIn_23_0 == stackIn_23_1) {
                                              ((ga) this).field_h = ((ga) this).field_h + 1;
                                              if (var5 == 0) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                          L10: {
                                            if (((ga) this).field_f.field_e < 250) {
                                              break L10;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L5;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (((ga) this).field_d[((ga) this).field_h] == 0) {
                                              jtb discarded$4 = this.a(1, -26489, ((ga) this).field_h);
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (((ga) this).field_d[((ga) this).field_h] == 0) {
                                              var3 = new ksa();
                                              var3.field_b = (long)((ga) this).field_h;
                                              var2_int = 0;
                                              ((ga) this).field_i.b(-10258, var3);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          ((ga) this).field_h = ((ga) this).field_h + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L5;
                                          }
                                        }
                                        stackOut_18_0 = ~((ga) this).field_t.field_j.length;
                                        stackOut_18_1 = ~((ga) this).field_h;
                                        stackIn_19_0 = stackOut_18_0;
                                        stackIn_19_1 = stackOut_18_1;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (stackIn_8_0 == stackIn_8_1) {
                                      jtb discarded$5 = this.a(1, -26489, var4);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      if (((ga) this).field_d[var4] != 0) {
                                        break L15;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var3.b(-3846);
                                    break L14;
                                  }
                                  var3 = ((ga) this).field_i.a((byte) 80);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L16: while (true) {
                              stackOut_18_0 = ~((ga) this).field_t.field_j.length;
                              stackOut_18_1 = ~((ga) this).field_h;
                              stackIn_19_0 = stackOut_18_0;
                              stackIn_19_1 = stackOut_18_1;
                              if (stackIn_19_0 >= stackIn_19_1) {
                                break L5;
                              } else {
                                stackOut_20_0 = 0;
                                stackOut_20_1 = ((ga) this).field_t.field_j[((ga) this).field_h];
                                stackIn_93_0 = stackOut_20_0;
                                stackIn_93_1 = stackOut_20_1;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_21_0 = stackIn_21_0;
                                  stackOut_21_1 = stackIn_21_1;
                                  stackIn_23_0 = stackOut_21_0;
                                  stackIn_23_1 = stackOut_21_1;
                                  L17: {
                                    if (stackIn_23_0 == stackIn_23_1) {
                                      ((ga) this).field_h = ((ga) this).field_h + 1;
                                      if (var5 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    } else {
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    if (((ga) this).field_f.field_e < 250) {
                                      break L18;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((ga) this).field_d[((ga) this).field_h] == 0) {
                                      jtb discarded$4 = this.a(1, -26489, ((ga) this).field_h);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (((ga) this).field_d[((ga) this).field_h] == 0) {
                                      var3 = new ksa();
                                      var3.field_b = (long)((ga) this).field_h;
                                      var2_int = 0;
                                      ((ga) this).field_i.b(-10258, var3);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  ((ga) this).field_h = ((ga) this).field_h + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          L21: {
                            if (var2_int == 0) {
                              break L21;
                            } else {
                              ((ga) this).field_o = false;
                              ((ga) this).field_h = 0;
                              break L21;
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
                    L22: {
                      if (!((ga) this).field_q) {
                        break L22;
                      } else {
                        var2_int = 1;
                        var3 = ((ga) this).field_i.d(0);
                        L23: while (true) {
                          L24: {
                            L25: {
                              if (null == var3) {
                                break L25;
                              } else {
                                var4 = (int)var3.field_b;
                                stackOut_50_0 = ((ga) this).field_d[var4];
                                stackOut_50_1 = 1;
                                stackIn_63_0 = stackOut_50_0;
                                stackIn_63_1 = stackOut_50_1;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                if (var5 != 0) {
                                  L26: while (true) {
                                    if (stackIn_63_0 <= stackIn_63_1) {
                                      break L24;
                                    } else {
                                      stackOut_64_0 = -1;
                                      stackOut_64_1 = ~((ga) this).field_t.field_j[((ga) this).field_h];
                                      stackIn_93_0 = stackOut_64_0;
                                      stackIn_93_1 = stackOut_64_1;
                                      stackIn_65_0 = stackOut_64_0;
                                      stackIn_65_1 = stackOut_64_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_65_0 = stackIn_65_0;
                                        stackOut_65_1 = stackIn_65_1;
                                        stackIn_67_0 = stackOut_65_0;
                                        stackIn_67_1 = stackOut_65_1;
                                        L27: {
                                          L28: {
                                            if (stackIn_67_0 == stackIn_67_1) {
                                              ((ga) this).field_h = ((ga) this).field_h + 1;
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
                                            if (!((ga) this).field_g.b((byte) 32)) {
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
                                            if (((ga) this).field_d[((ga) this).field_h] != 1) {
                                              jtb discarded$6 = this.a(2, -26489, ((ga) this).field_h);
                                              break L30;
                                            } else {
                                              break L30;
                                            }
                                          }
                                          L31: {
                                            if (1 != ((ga) this).field_d[((ga) this).field_h]) {
                                              var3 = new ksa();
                                              var3.field_b = (long)((ga) this).field_h;
                                              ((ga) this).field_i.b(-10258, var3);
                                              var2_int = 0;
                                              break L31;
                                            } else {
                                              break L31;
                                            }
                                          }
                                          ((ga) this).field_h = ((ga) this).field_h + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L24;
                                          }
                                        }
                                        stackOut_62_0 = ~((ga) this).field_h;
                                        stackOut_62_1 = ~((ga) this).field_t.field_j.length;
                                        stackIn_63_0 = stackOut_62_0;
                                        stackIn_63_1 = stackOut_62_1;
                                        continue L26;
                                      }
                                    }
                                  }
                                } else {
                                  L32: {
                                    if (stackIn_51_0 != stackIn_51_1) {
                                      jtb discarded$7 = this.a(2, -26489, var4);
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  L33: {
                                    L34: {
                                      if (((ga) this).field_d[var4] != 1) {
                                        break L34;
                                      } else {
                                        var3.b(-3846);
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
                                  var3 = ((ga) this).field_i.a((byte) 121);
                                  if (var5 == 0) {
                                    continue L23;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            L35: while (true) {
                              stackOut_62_0 = ~((ga) this).field_h;
                              stackOut_62_1 = ~((ga) this).field_t.field_j.length;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              if (stackIn_63_0 <= stackIn_63_1) {
                                break L24;
                              } else {
                                stackOut_64_0 = -1;
                                stackOut_64_1 = ~((ga) this).field_t.field_j[((ga) this).field_h];
                                stackIn_93_0 = stackOut_64_0;
                                stackIn_93_1 = stackOut_64_1;
                                stackIn_65_0 = stackOut_64_0;
                                stackIn_65_1 = stackOut_64_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_65_0 = stackIn_65_0;
                                  stackOut_65_1 = stackIn_65_1;
                                  stackIn_67_0 = stackOut_65_0;
                                  stackIn_67_1 = stackOut_65_1;
                                  L36: {
                                    if (stackIn_67_0 == stackIn_67_1) {
                                      ((ga) this).field_h = ((ga) this).field_h + 1;
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
                                    if (!((ga) this).field_g.b((byte) 32)) {
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
                                    if (((ga) this).field_d[((ga) this).field_h] != 1) {
                                      jtb discarded$6 = this.a(2, -26489, ((ga) this).field_h);
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  }
                                  L39: {
                                    if (1 != ((ga) this).field_d[((ga) this).field_h]) {
                                      var3 = new ksa();
                                      var3.field_b = (long)((ga) this).field_h;
                                      ((ga) this).field_i.b(-10258, var3);
                                      var2_int = 0;
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  ((ga) this).field_h = ((ga) this).field_h + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                          }
                          L40: {
                            if (var2_int != 0) {
                              ((ga) this).field_h = 0;
                              ((ga) this).field_q = false;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    ((ga) this).field_i = null;
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              stackOut_92_0 = param0;
              stackOut_92_1 = -27;
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              break L1;
            }
            L41: {
              if (stackIn_93_0 <= stackIn_93_1) {
                break L41;
              } else {
                ((ga) this).b((byte) -14);
                break L41;
              }
            }
            L42: {
              if (!((ga) this).field_m) {
                break L42;
              } else {
                if (((ga) this).field_e <= wt.a(false)) {
                  var2_ref = (jtb) (Object) ((ga) this).field_u.c((byte) 48);
                  L43: while (true) {
                    L44: {
                      if (var2_ref == null) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            if (var2_ref.field_n) {
                              break L45;
                            } else {
                              L46: {
                                if (var2_ref.field_k) {
                                  break L46;
                                } else {
                                  var2_ref.field_k = true;
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              if (var2_ref.field_l) {
                                var2_ref.b(-3846);
                                break L45;
                              } else {
                                throw new RuntimeException();
                              }
                            }
                          }
                          var2_ref = (jtb) (Object) ((ga) this).field_u.b(-91);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((ga) this).field_e = wt.a(false) + 1000L;
                    break L42;
                  }
                } else {
                  break L42;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "ga.E(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        if (param0 > -9) {
            return;
        }
        if (null == ((ga) this).field_l) {
            return;
        }
        try {
            ((ga) this).field_q = true;
            if (((ga) this).field_i == null) {
                ((ga) this).field_i = new ij();
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ga.I(" + param0 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        jtb var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            var3 = this.a(0, -26489, param1);
            if (null == var3) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              var4 = var3.a(-95);
              if (param0 > 112) {
                var3.b(-3846);
                stackOut_8_0 = (byte[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3_ref, "ga.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void c(int param0) {
        RuntimeException runtimeException = null;
        ksa var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (((ga) this).field_i != null) {
              if (((ga) this).a((byte) 9) != null) {
                var2 = ((ga) this).field_v.d(param0);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2 == null) {
                        break L3;
                      } else {
                        var3 = (int)var2.field_b;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                if (0 > var3) {
                                  break L6;
                                } else {
                                  if (~var3 <= ~((ga) this).field_t.field_l) {
                                    break L6;
                                  } else {
                                    if (((ga) this).field_t.field_j[var3] == 0) {
                                      break L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              var2.b(param0 + -3846);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (((ga) this).field_d[var3] == 0) {
                                jtb discarded$2 = this.a(1, -26489, var3);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              if (((ga) this).field_d[var3] == -1) {
                                jtb discarded$3 = this.a(2, -26489, var3);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (((ga) this).field_d[var3] != 1) {
                              break L4;
                            } else {
                              var2.b(-3846);
                              break L4;
                            }
                          }
                          var2 = ((ga) this).field_v.a((byte) 10);
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    break L2;
                  }
                  break L0;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rta.a((Throwable) (Object) runtimeException, "ga.F(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            int var1_int = 110 % ((param0 - -65) / 33);
            field_s = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ga.D(" + param0 + ')');
        }
    }

    private final jtb a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_60_0 = null;
        byte stackIn_81_0 = 0;
        byte stackIn_81_1 = 0;
        Object stackIn_95_0 = null;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        Object stackIn_106_0 = null;
        byte stackIn_126_0 = 0;
        byte stackIn_126_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        Object stackIn_146_0 = null;
        Object stackIn_153_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_55_0 = null;
        Object stackOut_30_0 = null;
        byte stackOut_125_0 = 0;
        byte stackOut_125_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        Object stackOut_145_0 = null;
        byte stackOut_80_0 = 0;
        byte stackOut_80_1 = 0;
        Object stackOut_94_0 = null;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        Object stackOut_105_0 = null;
        Object stackOut_59_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_152_0 = null;
        var10 = VoidHunters.field_G;
        try {
          try {
            if (param1 == -26489) {
              L0: {
                var4 = (Object) (Object) (jtb) (Object) ((ga) this).field_u.a((long)param2, 100);
                if (var4 == null) {
                  break L0;
                } else {
                  if (0 != param0) {
                    break L0;
                  } else {
                    if (((jtb) var4).field_l) {
                      break L0;
                    } else {
                      if (!((jtb) var4).field_n) {
                        break L0;
                      } else {
                        ((jtb) var4).b(-3846);
                        var4 = null;
                        break L0;
                      }
                    }
                  }
                }
              }
              L1: {
                if (var4 == null) {
                  L2: {
                    if (param0 != 0) {
                      L3: {
                        if (param0 != 1) {
                          break L3;
                        } else {
                          if (((ga) this).field_l == null) {
                            throw new RuntimeException();
                          } else {
                            var4 = (Object) (Object) ((ga) this).field_f.a((byte) 121, ((ga) this).field_l, param2);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      if (param0 == 2) {
                        if (((ga) this).field_l == null) {
                          throw new RuntimeException();
                        } else {
                          if (((ga) this).field_d[param2] != -1) {
                            throw new RuntimeException();
                          } else {
                            L4: {
                              if (((ga) this).field_g.b((byte) 32)) {
                                break L4;
                              } else {
                                var4 = (Object) (Object) ((ga) this).field_g.a(false, -21, param2, (byte) 2, ((ga) this).field_p);
                                if (var10 == 0) {
                                  break L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            stackOut_55_0 = null;
                            stackIn_56_0 = stackOut_55_0;
                            return (jtb) (Object) stackIn_56_0;
                          }
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      L5: {
                        if (null == ((ga) this).field_l) {
                          break L5;
                        } else {
                          if (((ga) this).field_d[param2] == -1) {
                            break L5;
                          } else {
                            var4 = (Object) (Object) ((ga) this).field_f.a(param2, ((ga) this).field_l, (byte) 104);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        if (((ga) this).field_g.d(104)) {
                          break L6;
                        } else {
                          var4 = (Object) (Object) ((ga) this).field_g.a(true, -21, param2, (byte) 2, ((ga) this).field_p);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      stackOut_30_0 = null;
                      stackIn_31_0 = stackOut_30_0;
                      return (jtb) (Object) stackIn_31_0;
                    }
                  }
                  ((ga) this).field_u.a((long)param2, (ksa) var4, (byte) -119);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (!((jtb) var4).field_n) {
                var5 = ((jtb) var4).a(77);
                if (var4 instanceof jma) {
                  L7: {
                    if (var5 == null) {
                      break L7;
                    } else {
                      if (var5.length > 2) {
                        gkb.field_p.reset();
                        gkb.field_p.update(var5, 0, var5.length - 2);
                        var6_int = (int)gkb.field_p.getValue();
                        if (((ga) this).field_t.field_d[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L8: {
                            L9: {
                              if (((ga) this).field_t.field_c == null) {
                                break L9;
                              } else {
                                if (((ga) this).field_t.field_c[param2] != null) {
                                  var7_ref_byte__ = ((ga) this).field_t.field_c[param2];
                                  var8 = fqb.a((byte) 25, -2 + var5.length, var5, 0);
                                  var9 = 0;
                                  L10: while (true) {
                                    if (64 <= var9) {
                                      break L9;
                                    } else {
                                      stackOut_125_0 = var7_ref_byte__[var9];
                                      stackOut_125_1 = var8[var9];
                                      stackIn_133_0 = stackOut_125_0;
                                      stackIn_133_1 = stackOut_125_1;
                                      stackIn_126_0 = stackOut_125_0;
                                      stackIn_126_1 = stackOut_125_1;
                                      if (var10 != 0) {
                                        break L8;
                                      } else {
                                        if (stackIn_126_0 != stackIn_126_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L10;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                            }
                            stackOut_132_0 = (255 & var5[-2 + var5.length]) << 970126280;
                            stackOut_132_1 = 255 & var5[-1 + var5.length];
                            stackIn_133_0 = stackOut_132_0;
                            stackIn_133_1 = stackOut_132_1;
                            break L8;
                          }
                          var7 = stackIn_133_0 + stackIn_133_1;
                          if (~var7 != ~(65535 & ((ga) this).field_t.field_h[param2])) {
                            throw new RuntimeException();
                          } else {
                            L11: {
                              if (((ga) this).field_d[param2] == 1) {
                                break L11;
                              } else {
                                L12: {
                                  if (((ga) this).field_d[param2] != 0) {
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                ((ga) this).field_d[param2] = (byte) 1;
                                break L11;
                              }
                            }
                            L13: {
                              if (((jtb) var4).field_l) {
                                break L13;
                              } else {
                                ((jtb) var4).b(-3846);
                                break L13;
                              }
                            }
                            stackOut_145_0 = var4;
                            stackIn_146_0 = stackOut_145_0;
                            return (jtb) (Object) stackIn_146_0;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  throw new RuntimeException();
                } else {
                  try {
                    L14: {
                      L15: {
                        if (var5 == null) {
                          break L15;
                        } else {
                          if (2 < var5.length) {
                            gkb.field_p.reset();
                            gkb.field_p.update(var5, 0, var5.length - 2);
                            var6_int = (int)gkb.field_p.getValue();
                            if (~((ga) this).field_t.field_d[param2] != ~var6_int) {
                              throw new RuntimeException();
                            } else {
                              L16: {
                                if (((ga) this).field_t.field_c == null) {
                                  break L16;
                                } else {
                                  if (((ga) this).field_t.field_c[param2] != null) {
                                    var7_ref_byte__ = ((ga) this).field_t.field_c[param2];
                                    var8 = fqb.a((byte) 25, -2 + var5.length, var5, 0);
                                    var9 = 0;
                                    L17: while (true) {
                                      if (var9 >= 64) {
                                        break L16;
                                      } else {
                                        stackOut_80_0 = var8[var9];
                                        stackOut_80_1 = var7_ref_byte__[var9];
                                        stackIn_99_0 = stackOut_80_0;
                                        stackIn_99_1 = stackOut_80_1;
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        if (var10 != 0) {
                                          decompiledRegionSelector0 = 0;
                                          break L14;
                                        } else {
                                          if (stackIn_81_0 == stackIn_81_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L17;
                                            } else {
                                              break L16;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              ((ga) this).field_g.field_g = 0;
                              ((ga) this).field_g.field_k = 0;
                              decompiledRegionSelector0 = 1;
                              break L14;
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L18: {
                      var6 = (RuntimeException) (Object) decompiledCaughtException;
                      ((ga) this).field_g.a((byte) -25);
                      ((jtb) var4).b(-3846);
                      if (((jtb) var4).field_l) {
                        if (((ga) this).field_g.d(54)) {
                          break L18;
                        } else {
                          var4 = (Object) (Object) ((ga) this).field_g.a(true, -21, param2, (byte) 2, ((ga) this).field_p);
                          ((ga) this).field_u.a((long)param2, (ksa) var4, (byte) -118);
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                    stackOut_94_0 = null;
                    stackIn_95_0 = stackOut_94_0;
                    return (jtb) (Object) stackIn_95_0;
                  }
                  L19: {
                    L20: {
                      if (decompiledRegionSelector0 == 0) {
                        break L20;
                      } else {
                        var5[var5.length + -2] = (byte)(((ga) this).field_t.field_h[param2] >>> 1040722088);
                        var5[-1 + var5.length] = (byte)((ga) this).field_t.field_h[param2];
                        if (null == ((ga) this).field_l) {
                          break L19;
                        } else {
                          jma discarded$1 = ((ga) this).field_f.a(((ga) this).field_l, var5, (byte) 111, param2);
                          stackOut_97_0 = -2;
                          stackOut_97_1 = ~((ga) this).field_d[param2];
                          stackIn_99_0 = stackOut_97_0;
                          stackIn_99_1 = stackOut_97_1;
                          break L20;
                        }
                      }
                    }
                    if (stackIn_99_0 == stackIn_99_1) {
                      break L19;
                    } else {
                      ((ga) this).field_d[param2] = (byte) 1;
                      break L19;
                    }
                  }
                  L21: {
                    if (((jtb) var4).field_l) {
                      break L21;
                    } else {
                      ((jtb) var4).b(-3846);
                      break L21;
                    }
                  }
                  stackOut_105_0 = var4;
                  stackIn_106_0 = stackOut_105_0;
                  return (jtb) (Object) stackIn_106_0;
                }
              } else {
                stackOut_59_0 = null;
                stackIn_60_0 = stackOut_59_0;
                return (jtb) (Object) stackIn_60_0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (jtb) (Object) stackIn_3_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L22: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((ga) this).field_d[param2] = (byte) -1;
              ((jtb) var4).b(-3846);
              if (!((jtb) var4).field_l) {
                break L22;
              } else {
                if (((ga) this).field_g.d(92)) {
                  break L22;
                } else {
                  var4 = (Object) (Object) ((ga) this).field_g.a(true, -21, param2, (byte) 2, ((ga) this).field_p);
                  ((ga) this).field_u.a((long)param2, (ksa) var4, (byte) -127);
                  break L22;
                }
              }
            }
            stackOut_152_0 = null;
            stackIn_153_0 = stackOut_152_0;
            return (jtb) (Object) stackIn_153_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw rta.a((Throwable) var4, "ga.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (li.field_i) {
                  break L2;
                } else {
                  dma.e(param2, param3, param5, param4, param6, param0);
                  if (VoidHunters.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (!ne.field_v) {
                break L1;
              } else {
                og.field_r.a(param5, (byte) 120, param6 | param0 << 246114328, param4, param3, param2);
                break L1;
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                field_s = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var7, "ga.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    ga(int param0, fo param1, fo param2, ona param3, pfa param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((ga) this).field_u = new gnb(16);
        ((ga) this).field_h = 0;
        ((ga) this).field_v = new ij();
        ((ga) this).field_e = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((ga) this).field_p = param0;
                ((ga) this).field_l = param1;
                if (null == ((ga) this).field_l) {
                  break L2;
                } else {
                  ((ga) this).field_o = true;
                  ((ga) this).field_i = new ij();
                  if (VoidHunters.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ga) this).field_o = false;
              break L1;
            }
            L3: {
              ((ga) this).field_j = param2;
              ((ga) this).field_m = param8;
              ((ga) this).field_f = param4;
              ((ga) this).field_g = param3;
              ((ga) this).field_k = param6;
              ((ga) this).field_w = param7;
              ((ga) this).field_n = param5;
              if (((ga) this).field_j != null) {
                ((ga) this).field_r = (jtb) (Object) ((ga) this).field_f.a(((ga) this).field_p, ((ga) this).field_j, (byte) -65);
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
            stackOut_10_1 = new StringBuilder().append("ga.<init>(").append(param0).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
