/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_d;
    static le field_c;
    static byte[] field_a;
    java.awt.Frame field_b;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (0 > mc.field_k) {
          return;
        } else {
          L0: {
            var3 = -135 + param0;
            var4 = -35 + param2;
            var5 = 256;
            if (-76 < (mc.field_k ^ -1)) {
              var5 = (mc.field_k << -1476670264) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-201 > (mc.field_k ^ -1)) {
              var5 = (250 - mc.field_k << -1659086456) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          de.a(be.field_d, param1 ^ 144);
          k.b();
          lf.a();
          rg.b(0);
          if (-257 >= (var5 ^ -1)) {
            pd.a(param1 ^ -22835);
            if (param1 <= mc.field_k) {
              nc.field_n.b(var3 + 15, var4 + 10, var5);
              var6 = mc.field_k - 125;
              if ((var6 ^ -1) < -1) {
                if (-51 < (var6 ^ -1)) {
                  L2: {
                    if (-21 >= (var6 ^ -1)) {
                      break L2;
                    } else {
                      var7 = var6 * 256 / 20;
                      t.field_a.d(var3, var4, var7);
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L3: {
                          var6 = mc.field_k + -140;
                          if ((var6 ^ -1) >= -1) {
                            break L3;
                          } else {
                            L4: {
                              var7 = 256;
                              if ((var6 ^ -1) <= -21) {
                                break L4;
                              } else {
                                var7 = 256 * var6 / 20;
                                break L4;
                              }
                            }
                            jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                            break L3;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (30 <= var6) {
                    var7 = 256 * (50 + -var6) / 20;
                    t.field_a.d(var3, var4, var7);
                    if (var8 == 0) {
                      L5: {
                        var6 = mc.field_k + -140;
                        if ((var6 ^ -1) >= -1) {
                          break L5;
                        } else {
                          L6: {
                            var7 = 256;
                            if ((var6 ^ -1) <= -21) {
                              break L6;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L6;
                            }
                          }
                          jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                          break L5;
                        }
                      }
                      return;
                    } else {
                      L7: {
                        t.field_a.d(var3, var4, 256);
                        var6 = mc.field_k + -140;
                        if ((var6 ^ -1) >= -1) {
                          break L7;
                        } else {
                          L8: {
                            var7 = 256;
                            if ((var6 ^ -1) <= -21) {
                              break L8;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L8;
                            }
                          }
                          jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                          break L7;
                        }
                      }
                      return;
                    }
                  } else {
                    L9: {
                      t.field_a.d(var3, var4, 256);
                      var6 = mc.field_k + -140;
                      if ((var6 ^ -1) >= -1) {
                        break L9;
                      } else {
                        L10: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L10;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L10;
                          }
                        }
                        jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  var6 = mc.field_k + -140;
                  if ((var6 ^ -1) < -1) {
                    L11: {
                      var7 = 256;
                      if ((var6 ^ -1) <= -21) {
                        break L11;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L11;
                      }
                    }
                    jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L12: {
                  var6 = mc.field_k + -140;
                  if ((var6 ^ -1) >= -1) {
                    break L12;
                  } else {
                    L13: {
                      var7 = 256;
                      if ((var6 ^ -1) <= -21) {
                        break L13;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L13;
                      }
                    }
                    jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                    break L12;
                  }
                }
                return;
              }
            } else {
              be.field_d.f(var3, var4);
              if (var8 == 0) {
                var6 = mc.field_k - 125;
                if ((var6 ^ -1) < -1) {
                  if (-51 < (var6 ^ -1)) {
                    L14: {
                      if (-21 >= (var6 ^ -1)) {
                        break L14;
                      } else {
                        var7 = var6 * 256 / 20;
                        t.field_a.d(var3, var4, var7);
                        if (var8 != 0) {
                          break L14;
                        } else {
                          L15: {
                            var6 = mc.field_k + -140;
                            if ((var6 ^ -1) >= -1) {
                              break L15;
                            } else {
                              L16: {
                                var7 = 256;
                                if ((var6 ^ -1) <= -21) {
                                  break L16;
                                } else {
                                  var7 = 256 * var6 / 20;
                                  break L16;
                                }
                              }
                              jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                              break L15;
                            }
                          }
                          return;
                        }
                      }
                    }
                    L17: {
                      if (30 > var6) {
                        break L17;
                      } else {
                        var7 = 256 * (50 + -var6) / 20;
                        t.field_a.d(var3, var4, var7);
                        if (var8 != 0) {
                          break L17;
                        } else {
                          L18: {
                            var6 = mc.field_k + -140;
                            if ((var6 ^ -1) >= -1) {
                              break L18;
                            } else {
                              L19: {
                                var7 = 256;
                                if ((var6 ^ -1) <= -21) {
                                  break L19;
                                } else {
                                  var7 = 256 * var6 / 20;
                                  break L19;
                                }
                              }
                              jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                              break L18;
                            }
                          }
                          return;
                        }
                      }
                    }
                    L20: {
                      t.field_a.d(var3, var4, 256);
                      var6 = mc.field_k + -140;
                      if ((var6 ^ -1) >= -1) {
                        break L20;
                      } else {
                        L21: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L21;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L21;
                          }
                        }
                        jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                        break L20;
                      }
                    }
                    return;
                  } else {
                    var6 = mc.field_k + -140;
                    if ((var6 ^ -1) < -1) {
                      L22: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L22;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L22;
                        }
                      }
                      jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L23: {
                    var6 = mc.field_k + -140;
                    if ((var6 ^ -1) >= -1) {
                      break L23;
                    } else {
                      L24: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L24;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L24;
                        }
                      }
                      jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                      break L23;
                    }
                  }
                  return;
                }
              } else {
                nc.field_n.b(var3 + 15, var4 + 10, var5);
                var6 = mc.field_k - 125;
                if ((var6 ^ -1) < -1) {
                  if (-51 < (var6 ^ -1)) {
                    L25: {
                      if (-21 >= (var6 ^ -1)) {
                        break L25;
                      } else {
                        var7 = var6 * 256 / 20;
                        t.field_a.d(var3, var4, var7);
                        if (var8 != 0) {
                          break L25;
                        } else {
                          L26: {
                            var6 = mc.field_k + -140;
                            if ((var6 ^ -1) >= -1) {
                              break L26;
                            } else {
                              L27: {
                                var7 = 256;
                                if ((var6 ^ -1) <= -21) {
                                  break L27;
                                } else {
                                  var7 = 256 * var6 / 20;
                                  break L27;
                                }
                              }
                              jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                              break L26;
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (30 <= var6) {
                      var7 = 256 * (50 + -var6) / 20;
                      t.field_a.d(var3, var4, var7);
                      if (var8 != 0) {
                        L28: {
                          t.field_a.d(var3, var4, 256);
                          var6 = mc.field_k + -140;
                          if ((var6 ^ -1) >= -1) {
                            break L28;
                          } else {
                            L29: {
                              var7 = 256;
                              if ((var6 ^ -1) <= -21) {
                                break L29;
                              } else {
                                var7 = 256 * var6 / 20;
                                break L29;
                              }
                            }
                            jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                            break L28;
                          }
                        }
                        return;
                      } else {
                        L30: {
                          var6 = mc.field_k + -140;
                          if ((var6 ^ -1) >= -1) {
                            break L30;
                          } else {
                            L31: {
                              var7 = 256;
                              if ((var6 ^ -1) <= -21) {
                                break L31;
                              } else {
                                var7 = 256 * var6 / 20;
                                break L31;
                              }
                            }
                            jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                            break L30;
                          }
                        }
                        return;
                      }
                    } else {
                      L32: {
                        t.field_a.d(var3, var4, 256);
                        var6 = mc.field_k + -140;
                        if ((var6 ^ -1) >= -1) {
                          break L32;
                        } else {
                          L33: {
                            var7 = 256;
                            if ((var6 ^ -1) <= -21) {
                              break L33;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L33;
                            }
                          }
                          jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                          break L32;
                        }
                      }
                      return;
                    }
                  } else {
                    var6 = mc.field_k + -140;
                    if ((var6 ^ -1) < -1) {
                      L34: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L34;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L34;
                        }
                      }
                      jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L35: {
                    var6 = mc.field_k + -140;
                    if ((var6 ^ -1) >= -1) {
                      break L35;
                    } else {
                      L36: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L36;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L36;
                        }
                      }
                      jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                      break L35;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            L37: {
              L38: {
                lf.c(0, 0, lf.field_f, lf.field_a, 0, -var5 + 256);
                pd.a(param1 ^ -22835);
                if (param1 <= mc.field_k) {
                  break L38;
                } else {
                  be.field_d.f(var3, var4);
                  if (var8 == 0) {
                    break L37;
                  } else {
                    break L38;
                  }
                }
              }
              nc.field_n.b(var3 + 15, var4 + 10, var5);
              break L37;
            }
            var6 = mc.field_k - 125;
            if ((var6 ^ -1) < -1) {
              if (-51 < (var6 ^ -1)) {
                L39: {
                  if (-21 >= (var6 ^ -1)) {
                    break L39;
                  } else {
                    var7 = var6 * 256 / 20;
                    t.field_a.d(var3, var4, var7);
                    if (var8 != 0) {
                      break L39;
                    } else {
                      L40: {
                        var6 = mc.field_k + -140;
                        if ((var6 ^ -1) >= -1) {
                          break L40;
                        } else {
                          L41: {
                            var7 = 256;
                            if ((var6 ^ -1) <= -21) {
                              break L41;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L41;
                            }
                          }
                          jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                          break L40;
                        }
                      }
                      return;
                    }
                  }
                }
                if (30 <= var6) {
                  var7 = 256 * (50 + -var6) / 20;
                  t.field_a.d(var3, var4, var7);
                  if (var8 != 0) {
                    L42: {
                      t.field_a.d(var3, var4, 256);
                      var6 = mc.field_k + -140;
                      if ((var6 ^ -1) >= -1) {
                        break L42;
                      } else {
                        L43: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L43;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L43;
                          }
                        }
                        jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                        break L42;
                      }
                    }
                    return;
                  } else {
                    L44: {
                      var6 = mc.field_k + -140;
                      if ((var6 ^ -1) >= -1) {
                        break L44;
                      } else {
                        L45: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L45;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L45;
                          }
                        }
                        jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                        break L44;
                      }
                    }
                    return;
                  }
                } else {
                  L46: {
                    t.field_a.d(var3, var4, 256);
                    var6 = mc.field_k + -140;
                    if ((var6 ^ -1) >= -1) {
                      break L46;
                    } else {
                      L47: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L47;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L47;
                        }
                      }
                      jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                      break L46;
                    }
                  }
                  return;
                }
              } else {
                var6 = mc.field_k + -140;
                if ((var6 ^ -1) < -1) {
                  L48: {
                    var7 = 256;
                    if ((var6 ^ -1) <= -21) {
                      break L48;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L48;
                    }
                  }
                  jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L49: {
                var6 = mc.field_k + -140;
                if ((var6 ^ -1) >= -1) {
                  break L49;
                } else {
                  L50: {
                    var7 = 256;
                    if ((var6 ^ -1) <= -21) {
                      break L50;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L50;
                    }
                  }
                  jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                  break L49;
                }
              }
              return;
            }
          }
        }
    }

    public static void b(int param0) {
        boolean discarded$0 = false;
        field_a = null;
        if (param0 != 20) {
            discarded$0 = ra.a(0);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final void a(boolean param0, ab param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ca.a(param1, 15232, this.field_b);
              if (!param0) {
                break L1;
              } else {
                this.field_b = (java.awt.Frame) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ra.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        p.field_d[pf.field_o] = param4;
        ff.field_a[pf.field_o] = pf.field_o;
        we.field_g[pf.field_o] = param2;
        if (rb.field_a >= param2) {
          L0: {
            if (param2 < r.field_D) {
              ve.field_d = param2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            l.field_D[pf.field_o] = param5;
            oc.field_a[pf.field_o] = param0;
            hl.field_N[pf.field_o] = param3;
            var6 = param3 + (param0 + param5);
            if (param1 == var6) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L1;
            } else {
              stackOut_21_0 = 1000 * param5 / var6;
              stackIn_23_0 = stackOut_21_0;
              break L1;
            }
          }
          var7 = stackIn_23_0;
          oj.field_j[pf.field_o] = var7;
          if (ve.field_d > var7) {
            L2: {
              ve.field_d = var7;
              if (var7 > l.field_G) {
                l.field_G = var7;
                break L2;
              } else {
                break L2;
              }
            }
            pf.field_o = pf.field_o + 1;
            return;
          } else {
            L3: {
              if (var7 > l.field_G) {
                l.field_G = var7;
                break L3;
              } else {
                break L3;
              }
            }
            pf.field_o = pf.field_o + 1;
            return;
          }
        } else {
          L4: {
            l.field_G = param2;
            if (param2 < r.field_D) {
              ve.field_d = param2;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            l.field_D[pf.field_o] = param5;
            oc.field_a[pf.field_o] = param0;
            hl.field_N[pf.field_o] = param3;
            var6 = param3 + (param0 + param5);
            if (param1 == var6) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L5;
            } else {
              stackOut_5_0 = 1000 * param5 / var6;
              stackIn_7_0 = stackOut_5_0;
              break L5;
            }
          }
          var7 = stackIn_7_0;
          oj.field_j[pf.field_o] = var7;
          if (ve.field_d > var7) {
            L6: {
              ve.field_d = var7;
              if (var7 > l.field_G) {
                l.field_G = var7;
                break L6;
              } else {
                break L6;
              }
            }
            pf.field_o = pf.field_o + 1;
            return;
          } else {
            L7: {
              if (var7 > l.field_G) {
                l.field_G = var7;
                break L7;
              } else {
                break L7;
              }
            }
            pf.field_o = pf.field_o + 1;
            return;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != -17977) {
            field_c = (le) null;
            return sc.field_e;
        }
        return sc.field_e;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_d = true;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ra.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    ra() {
    }

    static {
        field_a = new byte[520];
    }
}
