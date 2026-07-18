/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gga extends ofa implements tsa {
    private rj field_N;
    static jpa[] field_O;
    static ur field_M;
    static String field_L;

    public static void f(int param0) {
        field_M = null;
        field_O = null;
        field_L = null;
        if (param0 != 0) {
            field_L = null;
        }
    }

    private final rj a(String param0, qc param1, int param2) {
        rj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var4 = new rj(param0, param1);
            var4.field_r = (isa) (Object) new td();
            var5 = ((gga) this).field_p - 6;
            ((gga) this).field_p = ((gga) this).field_p + 38;
            var4.a((byte) -31, -16 + (((gga) this).field_m - 14), 30, 15, var5);
            ((gga) this).a((ae) (Object) var4, -1);
            ((gga) this).c((byte) -75);
            stackOut_0_0 = (rj) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("gga.H(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -93 + ')');
        }
        return stackIn_1_0;
    }

    final static void b(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (tl.field_r < 0) {
          return;
        } else {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (tl.field_r >= 75) {
              break L0;
            } else {
              var5 = (tl.field_r << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (tl.field_r <= 200) {
              break L1;
            } else {
              var5 = (250 + -tl.field_r << 8) / 50;
              break L1;
            }
          }
          nm.a(vha.field_a, (byte) 108);
          uoa.b();
          bea.a();
          uw.a(false);
          if (var5 >= 256) {
            pfa.a(1);
            if (tl.field_r >= 150) {
              bra.field_O.c(var3 + 15, var4 + 10, var5);
              var6 = -125 + tl.field_r;
              if (var6 > 0) {
                if (50 > var6) {
                  if (var6 < 20) {
                    L2: {
                      var7 = var6 * 256 / 20;
                      bw.field_a.a(var3, var4, var7);
                      var6 = -140 + tl.field_r;
                      if (0 >= var6) {
                        break L2;
                      } else {
                        L3: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L3;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L3;
                          }
                        }
                        hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L2;
                      }
                    }
                    return;
                  } else {
                    if (var6 < 30) {
                      L4: {
                        bw.field_a.a(var3, var4, 256);
                        var6 = -140 + tl.field_r;
                        if (0 >= var6) {
                          break L4;
                        } else {
                          L5: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L5;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L5;
                            }
                          }
                          hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                          break L4;
                        }
                      }
                      return;
                    } else {
                      L6: {
                        var7 = (50 + -var6) * 256 / 20;
                        bw.field_a.a(var3, var4, var7);
                        var6 = -140 + tl.field_r;
                        if (0 >= var6) {
                          break L6;
                        } else {
                          L7: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L7;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L7;
                            }
                          }
                          hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                          break L6;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L8: {
                    var6 = -140 + tl.field_r;
                    if (0 >= var6) {
                      break L8;
                    } else {
                      L9: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L9;
                        } else {
                          var7 = var6 * 256 / 20;
                          break L9;
                        }
                      }
                      hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  var6 = -140 + tl.field_r;
                  if (0 >= var6) {
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
                    hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L10;
                  }
                }
                return;
              }
            } else {
              vha.field_a.c(var3, var4);
              var6 = -125 + tl.field_r;
              if (var6 > 0) {
                if (50 > var6) {
                  if (var6 < 20) {
                    L12: {
                      var7 = var6 * 256 / 20;
                      bw.field_a.a(var3, var4, var7);
                      var6 = -140 + tl.field_r;
                      if (0 >= var6) {
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
                        hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L12;
                      }
                    }
                    return;
                  } else {
                    if (var6 < 30) {
                      L14: {
                        bw.field_a.a(var3, var4, 256);
                        var6 = -140 + tl.field_r;
                        if (0 >= var6) {
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
                          hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                          break L14;
                        }
                      }
                      return;
                    } else {
                      L16: {
                        var7 = (50 + -var6) * 256 / 20;
                        bw.field_a.a(var3, var4, var7);
                        var6 = -140 + tl.field_r;
                        if (0 >= var6) {
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
                          hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                          break L16;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L18: {
                    var6 = -140 + tl.field_r;
                    if (0 >= var6) {
                      break L18;
                    } else {
                      L19: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L19;
                        } else {
                          var7 = var6 * 256 / 20;
                          break L19;
                        }
                      }
                      hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L20: {
                  var6 = -140 + tl.field_r;
                  if (0 >= var6) {
                    break L20;
                  } else {
                    L21: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L21;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L21;
                      }
                    }
                    hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L20;
                  }
                }
                return;
              }
            }
          } else {
            L22: {
              bea.c(0, 0, bea.field_g, bea.field_a, 0, 256 + -var5);
              pfa.a(1);
              if (tl.field_r >= 150) {
                bra.field_O.c(var3 + 15, var4 + 10, var5);
                break L22;
              } else {
                vha.field_a.c(var3, var4);
                break L22;
              }
            }
            var6 = -125 + tl.field_r;
            if (var6 > 0) {
              if (50 > var6) {
                if (var6 < 20) {
                  L23: {
                    var7 = var6 * 256 / 20;
                    bw.field_a.a(var3, var4, var7);
                    var6 = -140 + tl.field_r;
                    if (0 >= var6) {
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
                      hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L23;
                    }
                  }
                  return;
                } else {
                  if (var6 < 30) {
                    L25: {
                      bw.field_a.a(var3, var4, 256);
                      var6 = -140 + tl.field_r;
                      if (0 >= var6) {
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
                        hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L25;
                      }
                    }
                    return;
                  } else {
                    L27: {
                      var7 = (50 + -var6) * 256 / 20;
                      bw.field_a.a(var3, var4, var7);
                      var6 = -140 + tl.field_r;
                      if (0 >= var6) {
                        break L27;
                      } else {
                        L28: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L28;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L28;
                          }
                        }
                        hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L27;
                      }
                    }
                    return;
                  }
                }
              } else {
                L29: {
                  var6 = -140 + tl.field_r;
                  if (0 >= var6) {
                    break L29;
                  } else {
                    L30: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L30;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L30;
                      }
                    }
                    hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L29;
                  }
                }
                return;
              }
            } else {
              L31: {
                var6 = -140 + tl.field_r;
                if (0 >= var6) {
                  break L31;
                } else {
                  L32: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L32;
                    } else {
                      var7 = var6 * 256 / 20;
                      break L32;
                    }
                  }
                  hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 8);
                  break L31;
                }
              }
              return;
            }
          }
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param2 != ((gga) this).field_N) {
                break L1;
              } else {
                this.g(256);
                break L1;
              }
            }
            L2: {
              if (param4 >= 44) {
                break L2;
              } else {
                gga.f(-123);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("gga.M(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    gga(jta param0, nt param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ae var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (gj.field_o == param1) {
                var3 = (Object) (Object) jma.field_o;
                break L1;
              } else {
                if (or.field_j == param1) {
                  ((gga) this).field_p = ((gga) this).field_p + 10;
                  var3 = (Object) (Object) vca.field_b;
                  if (!sta.g((byte) 97)) {
                    break L1;
                  } else {
                    var3 = (Object) (Object) tj.field_h;
                    ((gga) this).field_p = ((gga) this).field_p + 20;
                    break L1;
                  }
                } else {
                  if (param1 != uq.field_b) {
                    break L1;
                  } else {
                    var3 = (Object) (Object) th.field_s;
                    ((gga) this).field_p = ((gga) this).field_p + 30;
                    break L1;
                  }
                }
              }
            }
            var4 = new ae((String) var3, (qc) null);
            var4.field_p = 80;
            var4.field_m = ((gga) this).field_m;
            var4.field_n = 50;
            var4.field_i = 0;
            var4.field_r = (isa) (Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((gga) this).a(var4, -1);
            ((gga) this).field_N = this.a(kh.field_j, (qc) this, -93);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("gga.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    private final void g(int param0) {
        if (!((gga) this).field_B) {
            return;
        }
        ((gga) this).field_B = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new ur(8);
        field_L = "Perpetually spinning discs";
    }
}
