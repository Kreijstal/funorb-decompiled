/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends wd {
    private sk field_x;
    private int field_n;
    private va field_h;
    private bi field_v;
    private byte[] field_u;
    private int field_o;
    private byte[] field_t;
    private ha field_j;
    private qd field_w;
    private int field_k;
    private bi field_f;
    private ae field_p;
    static dl field_l;
    private boolean field_s;
    static String field_r;
    private nc field_e;
    private boolean field_y;
    private nc field_m;
    private int field_q;
    private long field_g;
    private boolean field_i;

    private final sk a(int param0, byte param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        Object stackIn_104_0 = null;
        Object stackIn_113_0 = null;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        Object stackIn_147_0 = null;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        Object stackIn_159_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        Object stackOut_45_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        Object stackOut_146_0 = null;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        Object stackOut_158_0 = null;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        Object stackOut_103_0 = null;
        Object stackOut_112_0 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (sk) (Object) ((lg) this).field_w.a(true, (long)param0);
              if (null == var4) {
                break L1;
              } else {
                if (param2 != 0) {
                  break L1;
                } else {
                  if (((sk) var4).field_r) {
                    break L1;
                  } else {
                    if (!((sk) var4).field_m) {
                      break L1;
                    } else {
                      ((sk) var4).c(param1 ^ 10);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (null == var4) {
                L3: {
                  L4: {
                    if (0 != param2) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (((lg) this).field_v == null) {
                            break L6;
                          } else {
                            if (((lg) this).field_u[param0] != -1) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (!((lg) this).field_h.b(-21)) {
                          var4 = (Object) (Object) ((lg) this).field_h.a(((lg) this).field_o, true, param0, 437409504, (byte) 2);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        } else {
                          stackOut_25_0 = null;
                          stackIn_26_0 = stackOut_25_0;
                          return (sk) (Object) stackIn_26_0;
                        }
                      }
                      var4 = (Object) (Object) ((lg) this).field_p.a(((lg) this).field_v, param0, -112);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param2 == 1) {
                    if (((lg) this).field_v == null) {
                      throw new RuntimeException();
                    } else {
                      var4 = (Object) (Object) ((lg) this).field_p.a(-72, ((lg) this).field_v, param0);
                      break L3;
                    }
                  } else {
                    L7: {
                      if (param2 != 2) {
                        break L7;
                      } else {
                        if (((lg) this).field_v != null) {
                          if (((lg) this).field_u[param0] != -1) {
                            throw new RuntimeException();
                          } else {
                            if (!((lg) this).field_h.a(param1 ^ -5868)) {
                              var4 = (Object) (Object) ((lg) this).field_h.a(((lg) this).field_o, false, param0, param1 ^ 437409504, (byte) 2);
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L7;
                              }
                            } else {
                              stackOut_45_0 = null;
                              stackIn_46_0 = stackOut_45_0;
                              return (sk) (Object) stackIn_46_0;
                            }
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                }
                ((lg) this).field_w.a((byte) 126, (gg) var4, (long)param0);
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (param1 == 0) {
                break L8;
              } else {
                ha discarded$2 = ((lg) this).c(-104);
                break L8;
              }
            }
            if (((sk) var4).field_m) {
              stackOut_62_0 = null;
              stackIn_63_0 = stackOut_62_0;
              return (sk) (Object) stackIn_63_0;
            } else {
              var5 = ((sk) var4).f(0);
              if (!(var4 instanceof md)) {
                try {
                  L9: {
                    L10: {
                      if (null == var5) {
                        break L10;
                      } else {
                        if (2 < var5.length) {
                          gl.field_g.reset();
                          gl.field_g.update(var5, 0, var5.length - 2);
                          var6_int = (int)gl.field_g.getValue();
                          if (var6_int != ((lg) this).field_j.field_b[param0]) {
                            throw new RuntimeException();
                          } else {
                            L11: {
                              if (null == ((lg) this).field_j.field_q) {
                                break L11;
                              } else {
                                if (null != ((lg) this).field_j.field_q[param0]) {
                                  var7 = ((lg) this).field_j.field_q[param0];
                                  var8 = q.a(var5.length - 2, 0, 100, var5);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (64 <= var9) {
                                      break L11;
                                    } else {
                                      stackOut_132_0 = ~var7[var9];
                                      stackOut_132_1 = ~var8[var9];
                                      stackIn_152_0 = stackOut_132_0;
                                      stackIn_152_1 = stackOut_132_1;
                                      stackIn_133_0 = stackOut_132_0;
                                      stackIn_133_1 = stackOut_132_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_133_0 == stackIn_133_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L12;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L11;
                                }
                              }
                            }
                            ((lg) this).field_h.field_l = 0;
                            ((lg) this).field_h.field_c = 0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          }
                        } else {
                          break L10;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L13: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((lg) this).field_h.c((byte) 59);
                    ((sk) var4).c(10);
                    if (((sk) var4).field_r) {
                      if (((lg) this).field_h.b(-21)) {
                        break L13;
                      } else {
                        var4 = (Object) (Object) ((lg) this).field_h.a(((lg) this).field_o, true, param0, 437409504, (byte) 2);
                        ((lg) this).field_w.a((byte) 79, (gg) var4, (long)param0);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  stackOut_146_0 = null;
                  stackIn_147_0 = stackOut_146_0;
                  return (sk) (Object) stackIn_147_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[-2 + var5.length] = (byte)(((lg) this).field_j.field_s[param0] >>> 80469384);
                      var5[var5.length - 1] = (byte)((lg) this).field_j.field_s[param0];
                      if (null != ((lg) this).field_v) {
                        md discarded$3 = ((lg) this).field_p.a(95, param0, ((lg) this).field_v, var5);
                        stackOut_151_0 = ~((lg) this).field_u[param0];
                        stackOut_151_1 = -2;
                        stackIn_152_0 = stackOut_151_0;
                        stackIn_152_1 = stackOut_151_1;
                        break L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (stackIn_152_0 == stackIn_152_1) {
                    break L14;
                  } else {
                    ((lg) this).field_u[param0] = (byte) 1;
                    break L14;
                  }
                }
                L16: {
                  if (((sk) var4).field_r) {
                    break L16;
                  } else {
                    ((sk) var4).c(param1 + 10);
                    break L16;
                  }
                }
                stackOut_158_0 = var4;
                stackIn_159_0 = stackOut_158_0;
                break L0;
              } else {
                try {
                  L17: {
                    L18: {
                      if (null == var5) {
                        break L18;
                      } else {
                        if (var5.length <= 2) {
                          break L18;
                        } else {
                          gl.field_g.reset();
                          gl.field_g.update(var5, 0, -2 + var5.length);
                          var6_int = (int)gl.field_g.getValue();
                          if (var6_int == ((lg) this).field_j.field_b[param0]) {
                            L19: {
                              L20: {
                                if (((lg) this).field_j.field_q == null) {
                                  break L20;
                                } else {
                                  if (((lg) this).field_j.field_q[param0] != null) {
                                    var7 = ((lg) this).field_j.field_q[param0];
                                    var8 = q.a(var5.length + -2, 0, -110, var5);
                                    var9 = 0;
                                    L21: while (true) {
                                      if (var9 >= 64) {
                                        break L20;
                                      } else {
                                        stackOut_83_0 = ~var7[var9];
                                        stackOut_83_1 = ~var8[var9];
                                        stackIn_91_0 = stackOut_83_0;
                                        stackIn_91_1 = stackOut_83_1;
                                        stackIn_84_0 = stackOut_83_0;
                                        stackIn_84_1 = stackOut_83_1;
                                        if (var10 != 0) {
                                          break L19;
                                        } else {
                                          if (stackIn_84_0 == stackIn_84_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L21;
                                            } else {
                                              break L20;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              stackOut_90_0 = (var5[var5.length + -2] & 255) << 924867656;
                              stackOut_90_1 = -(255 & var5[-1 + var5.length]);
                              stackIn_91_0 = stackOut_90_0;
                              stackIn_91_1 = stackOut_90_1;
                              break L19;
                            }
                            var7_int = stackIn_91_0 - stackIn_91_1;
                            if (~var7_int == ~(((lg) this).field_j.field_s[param0] & 65535)) {
                              L22: {
                                if (((lg) this).field_u[param0] == 1) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (((lg) this).field_u[param0] != 0) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((lg) this).field_u[param0] = (byte) 1;
                                  break L22;
                                }
                              }
                              L24: {
                                if (!((sk) var4).field_r) {
                                  ((sk) var4).c(param1 ^ 10);
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                              stackOut_103_0 = var4;
                              stackIn_104_0 = stackOut_103_0;
                              break L17;
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
                  L25: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((lg) this).field_u[param0] = (byte) -1;
                    ((sk) var4).c(param1 + 10);
                    if (!((sk) var4).field_r) {
                      break L25;
                    } else {
                      if (!((lg) this).field_h.b(-21)) {
                        var4 = (Object) (Object) ((lg) this).field_h.a(((lg) this).field_o, true, param0, 437409504, (byte) 2);
                        ((lg) this).field_w.a((byte) 73, (gg) var4, (long)param0);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  stackOut_112_0 = null;
                  stackIn_113_0 = stackOut_112_0;
                  return (sk) (Object) stackIn_113_0;
                }
                return (sk) (Object) stackIn_104_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw fc.a((Throwable) var4, "lg.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (sk) (Object) stackIn_159_0;
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        sk var2_ref = null;
        gg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_21_0 = 0;
        byte stackIn_21_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        byte stackIn_61_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_94_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        byte stackOut_20_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_60_0 = 0;
        byte stackOut_60_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_93_0 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 18055) {
                break L1;
              } else {
                ha discarded$5 = ((lg) this).c(79);
                break L1;
              }
            }
            L2: {
              if (null != ((lg) this).field_m) {
                if (null == ((lg) this).c(-110)) {
                  return;
                } else {
                  L3: {
                    if (((lg) this).field_s) {
                      break L3;
                    } else {
                      L4: {
                        if (((lg) this).field_y) {
                          break L4;
                        } else {
                          ((lg) this).field_m = null;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var2_int = 1;
                      var3 = ((lg) this).field_m.a((byte) 51);
                      L5: while (true) {
                        L6: {
                          L7: {
                            L8: {
                              if (null == var3) {
                                break L8;
                              } else {
                                var4 = (int)var3.field_g;
                                stackOut_20_0 = 1;
                                stackOut_20_1 = ((lg) this).field_u[var4];
                                stackIn_33_0 = stackOut_20_0;
                                stackIn_33_1 = stackOut_20_1;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                if (var5 != 0) {
                                  L9: while (true) {
                                    if (stackIn_33_0 >= stackIn_33_1) {
                                      break L7;
                                    } else {
                                      stackOut_34_0 = -1;
                                      stackIn_54_0 = stackOut_34_0;
                                      stackIn_35_0 = stackOut_34_0;
                                      if (var5 != 0) {
                                        break L6;
                                      } else {
                                        stackOut_35_0 = stackIn_35_0;
                                        stackIn_37_0 = stackOut_35_0;
                                        L10: {
                                          L11: {
                                            if (stackIn_37_0 != ~((lg) this).field_j.field_r[((lg) this).field_q]) {
                                              break L11;
                                            } else {
                                              ((lg) this).field_q = ((lg) this).field_q + 1;
                                              if (var5 == 0) {
                                                break L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          L12: {
                                            if (!((lg) this).field_h.a(-5868)) {
                                              break L12;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L7;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          L13: {
                                            if (((lg) this).field_u[((lg) this).field_q] == 1) {
                                              break L13;
                                            } else {
                                              sk discarded$6 = this.a(((lg) this).field_q, (byte) 0, 2);
                                              break L13;
                                            }
                                          }
                                          L14: {
                                            if (((lg) this).field_u[((lg) this).field_q] == 1) {
                                              break L14;
                                            } else {
                                              var3 = new gg();
                                              var3.field_g = (long)((lg) this).field_q;
                                              var2_int = 0;
                                              ((lg) this).field_m.a(var3, -7044);
                                              break L14;
                                            }
                                          }
                                          ((lg) this).field_q = ((lg) this).field_q + 1;
                                          if (var5 == 0) {
                                            break L10;
                                          } else {
                                            break L7;
                                          }
                                        }
                                        stackOut_32_0 = ~((lg) this).field_j.field_r.length;
                                        stackOut_32_1 = ~((lg) this).field_q;
                                        stackIn_33_0 = stackOut_32_0;
                                        stackIn_33_1 = stackOut_32_1;
                                        continue L9;
                                      }
                                    }
                                  }
                                } else {
                                  L15: {
                                    if (stackIn_21_0 != stackIn_21_1) {
                                      sk discarded$7 = this.a(var4, (byte) 0, 2);
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    L17: {
                                      if (((lg) this).field_u[var4] != 1) {
                                        break L17;
                                      } else {
                                        var3.c(param0 + -18045);
                                        if (var5 == 0) {
                                          break L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L16;
                                  }
                                  var3 = ((lg) this).field_m.b(-47);
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            L18: while (true) {
                              stackOut_32_0 = ~((lg) this).field_j.field_r.length;
                              stackOut_32_1 = ~((lg) this).field_q;
                              stackIn_33_0 = stackOut_32_0;
                              stackIn_33_1 = stackOut_32_1;
                              if (stackIn_33_0 >= stackIn_33_1) {
                                break L7;
                              } else {
                                stackOut_34_0 = -1;
                                stackIn_54_0 = stackOut_34_0;
                                stackIn_35_0 = stackOut_34_0;
                                if (var5 != 0) {
                                  break L6;
                                } else {
                                  stackOut_35_0 = stackIn_35_0;
                                  stackIn_37_0 = stackOut_35_0;
                                  L19: {
                                    if (stackIn_37_0 != ~((lg) this).field_j.field_r[((lg) this).field_q]) {
                                      break L19;
                                    } else {
                                      ((lg) this).field_q = ((lg) this).field_q + 1;
                                      if (var5 == 0) {
                                        continue L18;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L20: {
                                    if (!((lg) this).field_h.a(-5868)) {
                                      break L20;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L7;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  L21: {
                                    if (((lg) this).field_u[((lg) this).field_q] == 1) {
                                      break L21;
                                    } else {
                                      sk discarded$6 = this.a(((lg) this).field_q, (byte) 0, 2);
                                      break L21;
                                    }
                                  }
                                  L22: {
                                    if (((lg) this).field_u[((lg) this).field_q] == 1) {
                                      break L22;
                                    } else {
                                      var3 = new gg();
                                      var3.field_g = (long)((lg) this).field_q;
                                      var2_int = 0;
                                      ((lg) this).field_m.a(var3, -7044);
                                      break L22;
                                    }
                                  }
                                  ((lg) this).field_q = ((lg) this).field_q + 1;
                                  if (var5 == 0) {
                                    continue L18;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_53_0 = var2_int;
                          stackIn_54_0 = stackOut_53_0;
                          break L6;
                        }
                        L23: {
                          if (stackIn_54_0 != 0) {
                            ((lg) this).field_q = 0;
                            ((lg) this).field_y = false;
                            break L23;
                          } else {
                            break L23;
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
                  var3 = ((lg) this).field_m.a((byte) 51);
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          if (null == var3) {
                            break L27;
                          } else {
                            var4 = (int)var3.field_g;
                            stackOut_60_0 = 0;
                            stackOut_60_1 = ((lg) this).field_u[var4];
                            stackIn_72_0 = stackOut_60_0;
                            stackIn_72_1 = stackOut_60_1;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            if (var5 != 0) {
                              L28: while (true) {
                                if (stackIn_72_0 <= stackIn_72_1) {
                                  break L26;
                                } else {
                                  stackOut_73_0 = ((lg) this).field_j.field_r[((lg) this).field_q];
                                  stackIn_94_0 = stackOut_73_0;
                                  stackIn_74_0 = stackOut_73_0;
                                  if (var5 != 0) {
                                    break L25;
                                  } else {
                                    stackOut_74_0 = stackIn_74_0;
                                    stackIn_76_0 = stackOut_74_0;
                                    L29: {
                                      L30: {
                                        if (stackIn_76_0 != 0) {
                                          break L30;
                                        } else {
                                          ((lg) this).field_q = ((lg) this).field_q + 1;
                                          if (var5 == 0) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      L31: {
                                        if (((lg) this).field_p.field_a < 250) {
                                          break L31;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L26;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                      L32: {
                                        if (0 == ((lg) this).field_u[((lg) this).field_q]) {
                                          sk discarded$8 = this.a(((lg) this).field_q, (byte) 0, 1);
                                          break L32;
                                        } else {
                                          break L32;
                                        }
                                      }
                                      L33: {
                                        if (0 != ((lg) this).field_u[((lg) this).field_q]) {
                                          break L33;
                                        } else {
                                          var3 = new gg();
                                          var3.field_g = (long)((lg) this).field_q;
                                          ((lg) this).field_m.a(var3, -7044);
                                          var2_int = 0;
                                          break L33;
                                        }
                                      }
                                      ((lg) this).field_q = ((lg) this).field_q + 1;
                                      if (var5 == 0) {
                                        break L29;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    stackOut_71_0 = ((lg) this).field_j.field_r.length;
                                    stackOut_71_1 = ((lg) this).field_q;
                                    stackIn_72_0 = stackOut_71_0;
                                    stackIn_72_1 = stackOut_71_1;
                                    continue L28;
                                  }
                                }
                              }
                            } else {
                              L34: {
                                if (stackIn_61_0 == stackIn_61_1) {
                                  sk discarded$9 = this.a(var4, (byte) 0, 1);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              L35: {
                                L36: {
                                  if (((lg) this).field_u[var4] != 0) {
                                    break L36;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                var3.c(10);
                                break L35;
                              }
                              var3 = ((lg) this).field_m.b(-84);
                              if (var5 == 0) {
                                continue L24;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        L37: while (true) {
                          stackOut_71_0 = ((lg) this).field_j.field_r.length;
                          stackOut_71_1 = ((lg) this).field_q;
                          stackIn_72_0 = stackOut_71_0;
                          stackIn_72_1 = stackOut_71_1;
                          if (stackIn_72_0 <= stackIn_72_1) {
                            break L26;
                          } else {
                            stackOut_73_0 = ((lg) this).field_j.field_r[((lg) this).field_q];
                            stackIn_94_0 = stackOut_73_0;
                            stackIn_74_0 = stackOut_73_0;
                            if (var5 != 0) {
                              break L25;
                            } else {
                              stackOut_74_0 = stackIn_74_0;
                              stackIn_76_0 = stackOut_74_0;
                              L38: {
                                if (stackIn_76_0 != 0) {
                                  break L38;
                                } else {
                                  ((lg) this).field_q = ((lg) this).field_q + 1;
                                  if (var5 == 0) {
                                    continue L37;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L39: {
                                if (((lg) this).field_p.field_a < 250) {
                                  break L39;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              L40: {
                                if (0 == ((lg) this).field_u[((lg) this).field_q]) {
                                  sk discarded$8 = this.a(((lg) this).field_q, (byte) 0, 1);
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              L41: {
                                if (0 != ((lg) this).field_u[((lg) this).field_q]) {
                                  break L41;
                                } else {
                                  var3 = new gg();
                                  var3.field_g = (long)((lg) this).field_q;
                                  ((lg) this).field_m.a(var3, -7044);
                                  var2_int = 0;
                                  break L41;
                                }
                              }
                              ((lg) this).field_q = ((lg) this).field_q + 1;
                              if (var5 == 0) {
                                continue L37;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                      }
                      stackOut_93_0 = var2_int;
                      stackIn_94_0 = stackOut_93_0;
                      break L25;
                    }
                    if (stackIn_94_0 != 0) {
                      ((lg) this).field_q = 0;
                      ((lg) this).field_s = false;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L42: {
              if (!((lg) this).field_i) {
                break L42;
              } else {
                if (~je.a(1) > ~((lg) this).field_g) {
                  break L42;
                } else {
                  var2_ref = (sk) (Object) ((lg) this).field_w.b(0);
                  L43: while (true) {
                    L44: {
                      if (var2_ref == null) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            if (var2_ref.field_m) {
                              break L45;
                            } else {
                              L46: {
                                if (var2_ref.field_q) {
                                  break L46;
                                } else {
                                  var2_ref.field_q = true;
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              if (!var2_ref.field_r) {
                                throw new RuntimeException();
                              } else {
                                var2_ref.c(10);
                                break L45;
                              }
                            }
                          }
                          var2_ref = (sk) (Object) ((lg) this).field_w.c((byte) 122);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((lg) this).field_g = 1000L + je.a(param0 + -18054);
                    break L42;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2, "lg.K(" + param0 + ')');
        }
    }

    final ha c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ha stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_50_0 = null;
        ha stackIn_55_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_49_0 = null;
        ha stackOut_54_0 = null;
        Object stackOut_14_0 = null;
        ha stackOut_2_0 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = -106 / ((param0 - 9) / 62);
            if (((lg) this).field_j == null) {
              L1: {
                if (null == ((lg) this).field_x) {
                  if (((lg) this).field_h.b(-21)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (ha) (Object) stackIn_11_0;
                  } else {
                    ((lg) this).field_x = (sk) (Object) ((lg) this).field_h.a(255, true, ((lg) this).field_o, 437409504, (byte) 0);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (!((lg) this).field_x.field_m) {
                L2: {
                  L3: {
                    var3 = ((lg) this).field_x.f(0);
                    if (((lg) this).field_x instanceof md) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          if (var3 != null) {
                            ((lg) this).field_j = new ha(var3, ((lg) this).field_k, ((lg) this).field_t);
                            break L4;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          L6: {
                            var4 = decompiledCaughtException;
                            ((lg) this).field_h.c((byte) 59);
                            ((lg) this).field_j = null;
                            if (((lg) this).field_h.b(-21)) {
                              break L6;
                            } else {
                              ((lg) this).field_x = (sk) (Object) ((lg) this).field_h.a(255, true, ((lg) this).field_o, 437409504, (byte) 0);
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          ((lg) this).field_x = null;
                          break L5;
                        }
                        stackOut_28_0 = null;
                        stackIn_29_0 = stackOut_28_0;
                        return (ha) (Object) stackIn_29_0;
                      }
                      if (null != ((lg) this).field_f) {
                        md discarded$1 = ((lg) this).field_p.a(83, ((lg) this).field_o, ((lg) this).field_f, var3);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  try {
                    L7: {
                      if (null == var3) {
                        throw new RuntimeException();
                      } else {
                        ((lg) this).field_j = new ha(var3, ((lg) this).field_k, ((lg) this).field_t);
                        if (~((lg) this).field_n != ~((lg) this).field_j.field_m) {
                          throw new RuntimeException();
                        } else {
                          break L7;
                        }
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L8: {
                      L9: {
                        var4 = decompiledCaughtException;
                        ((lg) this).field_j = null;
                        if (!((lg) this).field_h.b(-21)) {
                          break L9;
                        } else {
                          ((lg) this).field_x = null;
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((lg) this).field_x = (sk) (Object) ((lg) this).field_h.a(255, true, ((lg) this).field_o, 437409504, (byte) 0);
                      break L8;
                    }
                    stackOut_49_0 = null;
                    stackIn_50_0 = stackOut_49_0;
                    return (ha) (Object) stackIn_50_0;
                  }
                  break L2;
                }
                L10: {
                  ((lg) this).field_x = null;
                  if (null == ((lg) this).field_v) {
                    break L10;
                  } else {
                    ((lg) this).field_u = new byte[((lg) this).field_j.field_l];
                    break L10;
                  }
                }
                stackOut_54_0 = ((lg) this).field_j;
                stackIn_55_0 = stackOut_54_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (ha) (Object) stackIn_15_0;
              }
            } else {
              stackOut_2_0 = ((lg) this).field_j;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2, "lg.A(" + param0 + ')');
        }
        return stackIn_55_0;
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        gg var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == -1) {
              if (null == ((lg) this).field_m) {
                return;
              } else {
                if (((lg) this).c(123) == null) {
                  return;
                } else {
                  var2_ref = ((lg) this).field_e.a((byte) 51);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (null == var2_ref) {
                          break L3;
                        } else {
                          var3 = (int)var2_ref.field_g;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            L4: {
                              L5: {
                                L6: {
                                  if (var3 < 0) {
                                    break L6;
                                  } else {
                                    if (var3 >= ((lg) this).field_j.field_l) {
                                      break L6;
                                    } else {
                                      if (((lg) this).field_j.field_r[var3] == 0) {
                                        break L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                var2_ref.c(param0 + 11);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                              L7: {
                                if (0 == ((lg) this).field_u[var3]) {
                                  sk discarded$2 = this.a(var3, (byte) 0, 1);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (((lg) this).field_u[var3] != -1) {
                                  break L8;
                                } else {
                                  sk discarded$3 = this.a(var3, (byte) 0, 2);
                                  break L8;
                                }
                              }
                              if (1 == ((lg) this).field_u[var3]) {
                                var2_ref.c(10);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var2_ref = ((lg) this).field_e.b(-41);
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
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2, "lg.J(" + param0 + ')');
        }
    }

    final int a(int param0, byte param1) {
        sk var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            var3 = (sk) (Object) ((lg) this).field_w.a(true, (long)param0);
            if (var3 != null) {
              stackOut_3_0 = var3.a((byte) -126);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var4 = -38 / ((param1 - -68) / 58);
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var3_ref, "lg.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final byte[] a(int param0, int param1) {
        sk var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(param0, (byte) 0, 0);
            if (var3 != null) {
              var4 = var3.f(param1);
              var3.c(10);
              stackOut_3_0 = (byte[]) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var3_ref, "lg.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((lg) this).field_v) {
              return;
            } else {
              L1: {
                ((lg) this).field_y = true;
                if (((lg) this).field_m != null) {
                  break L1;
                } else {
                  ((lg) this).field_m = new nc();
                  break L1;
                }
              }
              L2: {
                if (param0 == 0) {
                  break L2;
                } else {
                  ((lg) this).e(-121);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2, "lg.I(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        try {
            field_l = null;
            field_r = null;
            if (param0 != 0) {
                field_l = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "lg.L(" + param0 + ')');
        }
    }

    lg(int param0, bi param1, bi param2, va param3, ae param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((lg) this).field_w = new qd(16);
        ((lg) this).field_q = 0;
        ((lg) this).field_e = new nc();
        ((lg) this).field_g = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((lg) this).field_o = param0;
                ((lg) this).field_v = param1;
                if (null == ((lg) this).field_v) {
                  break L2;
                } else {
                  ((lg) this).field_s = true;
                  ((lg) this).field_m = new nc();
                  if (!SolKnight.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((lg) this).field_s = false;
              break L1;
            }
            L3: {
              ((lg) this).field_f = param2;
              ((lg) this).field_t = param6;
              ((lg) this).field_i = param8;
              ((lg) this).field_p = param4;
              ((lg) this).field_n = param7;
              ((lg) this).field_h = param3;
              ((lg) this).field_k = param5;
              if (null != ((lg) this).field_f) {
                ((lg) this).field_x = (sk) (Object) ((lg) this).field_p.a(((lg) this).field_f, ((lg) this).field_o, -122);
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
            stackOut_10_1 = new StringBuilder().append("lg.<init>(").append(param0).append(',');
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
          throw fc.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "to return to the normal view.";
    }
}
