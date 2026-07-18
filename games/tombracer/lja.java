/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lja {
    private String field_d;
    private int field_b;
    private long field_g;
    private int[] field_e;
    ola field_f;
    jea field_h;
    int field_k;
    static fp field_j;
    static volatile boolean field_c;
    String field_i;
    static String field_a;

    public static void b(byte param0) {
        try {
            int var1_int = 37 % ((7 - param0) / 44);
            field_j = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lja.I(" + param0 + ')');
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 13) {
                break L1;
              } else {
                ((lja) this).a((gqa) null, -72);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((lja) this).field_f == null) {
                  break L3;
                } else {
                  if (!((lja) this).field_f.f(param0 ^ -13)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "lja.D(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final String b(int param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -13) {
              L1: {
                L2: {
                  if (((lja) this).field_d != null) {
                    break L2;
                  } else {
                    var2 = ((lja) this).field_i;
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2 = ((lja) this).field_d;
                break L1;
              }
              stackOut_6_0 = (String) var2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "lja.F(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final void a(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((lja) this).field_g = -102L;
                break L1;
              }
            }
            ((lja) this).field_f.b(44, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "lja.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        ht var2_ref = null;
        String var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != uu.field_a) {
                break L1;
              } else {
                var2_ref = av.a(((lja) this).field_k, 0);
                if (null == var2_ref) {
                  break L1;
                } else {
                  L2: {
                    var3 = var2_ref.field_tb;
                    if (var2_ref.field_gc) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (var2_ref.field_Bb) {
                            break L4;
                          } else {
                            if (var2_ref.field_Sb) {
                              break L3;
                            } else {
                              if (!var2_ref.field_Yb) {
                                break L3;
                              } else {
                                L5: {
                                  if (!var2_ref.field_ec) {
                                    break L5;
                                  } else {
                                    if (var2_ref.field_Bb) {
                                      break L5;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                ((lja) this).field_f.a((byte) -125, 2, gl.a((byte) 91, di.field_h, new String[1]));
                                if (var4 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        ((lja) this).field_f.a((byte) -76, 2, gl.a((byte) 106, mna.field_b, new String[1]));
                        break L3;
                      }
                      if (var2_ref.field_Sb) {
                        ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                        if (var4 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((lja) this).field_f.a((byte) -102, 2, gl.a((byte) 114, pba.field_d, new String[1]));
                  ((lja) this).field_f.a((byte) -104, 3, gl.a((byte) 123, cp.field_i, new String[1]));
                  break L1;
                }
              }
            }
            L6: {
              if (param0 <= -10) {
                break L6;
              } else {
                ((lja) this).field_e = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "lja.A(" + param0 + ')');
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            var6_int = ((lja) this).field_f.d(0, param0);
            if (param3 == var6_int) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              boolean discarded$8 = this.a(param3 + -16, var6_int, param2);
              boolean discarded$9 = this.b(var6_int, (byte) -121, param4);
              boolean discarded$10 = this.a(var6_int, (byte) -39, param4);
              boolean discarded$11 = this.b(param1, var6_int, 114);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var6, "lja.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_6_0 != 0;
    }

    private final boolean b(int param0, byte param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        RuntimeException var4_ref2 = null;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        try {
          L0: {
            L1: {
              var4 = null;
              if (4 == param0) {
                var4_ref = rf.a(true, ((lja) this).field_i, param2);
                break L1;
              } else {
                if (param0 == 5) {
                  var4_ref = uca.a(((lja) this).field_i, (byte) 102, param2);
                  break L1;
                } else {
                  if (param0 == 6) {
                    var4_ref = nna.a(-3, ((lja) this).field_i, param2);
                    break L1;
                  } else {
                    if (7 == param0) {
                      var4_ref = kc.a(((lja) this).field_i, param2, false, ((lja) this).field_d);
                      break L1;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
              }
            }
            L2: {
              if (null == var4_ref) {
                break L2;
              } else {
                gu.a(0, true, ((lja) this).field_i, var4_ref, (String) null, 2);
                break L2;
              }
            }
            if (param1 == -121) {
              stackOut_22_0 = 1;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            } else {
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4_ref2, "lja.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    private final boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_43_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 != 0) {
                  break L2;
                } else {
                  fv.a((byte) -38, param2, ((lja) this).field_g);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 == 1) {
                  break L3;
                } else {
                  L4: {
                    if (param1 != 2) {
                      break L4;
                    } else {
                      q.a((byte) -123, param2, ((lja) this).field_k);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param1 != 3) {
                      break L5;
                    } else {
                      et.a(param2, 30, ((lja) this).field_k);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (param1 != 10) {
                      break L6;
                    } else {
                      kw.a(param2, false, ((lja) this).field_k);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (param1 != 15) {
                      break L7;
                    } else {
                      cua.a(((lja) this).field_k, param0 + 21, param2);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (param1 == 16) {
                    cua.a(0, 3, param2);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    return stackIn_36_0 != 0;
                  }
                }
              }
              fn.a(param2, ((lja) this).field_g, -120);
              break L1;
            }
            L8: {
              if (param0 == -18) {
                break L8;
              } else {
                field_j = null;
                break L8;
              }
            }
            stackOut_43_0 = 1;
            stackIn_44_0 = stackOut_43_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "lja.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_44_0 != 0;
    }

    private final boolean a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_36_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_49_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -39) {
                break L1;
              } else {
                lja.b((byte) 36);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 == 8) {
                  break L3;
                } else {
                  L4: {
                    if (param0 == 18) {
                      break L4;
                    } else {
                      L5: {
                        if (param0 == 11) {
                          break L5;
                        } else {
                          L6: {
                            if (param0 == 12) {
                              break L6;
                            } else {
                              L7: {
                                if (param0 != 13) {
                                  break L7;
                                } else {
                                  loa.a(((lja) this).field_b, param2, (byte) 108, 2);
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (param0 != 14) {
                                  break L8;
                                } else {
                                  kaa.a((byte) 118);
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (param0 != 20) {
                                  break L9;
                                } else {
                                  ola.e((byte) 123);
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (19 == param0) {
                                boolean discarded$1 = eca.a((byte) 84, ((lja) this).field_b, ((lja) this).field_g, ((lja) this).field_e, ((lja) this).field_i);
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L6;
                                }
                              } else {
                                stackOut_35_0 = 0;
                                stackIn_36_0 = stackOut_35_0;
                                return stackIn_36_0 != 0;
                              }
                            }
                          }
                          loa.a(((lja) this).field_b, param2, (byte) 108, 1);
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      loa.a(((lja) this).field_b, param2, (byte) 108, 0);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  fs.a((byte) 123, ((lja) this).field_g, ((lja) this).field_i);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              no.a(((lja) this).field_i, ((lja) this).field_g, (byte) 120);
              break L2;
            }
            stackOut_49_0 = 1;
            stackIn_50_0 = stackOut_49_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "lja.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_50_0 != 0;
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        mu var5 = null;
        int var6 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 19) {
                break L1;
              } else {
                ((lja) this).field_f = null;
                break L1;
              }
            }
            L2: {
              if (((lja) this).field_i == null) {
                break L2;
              } else {
                L3: {
                  if (rb.field_r != ((lja) this).field_g) {
                    break L3;
                  } else {
                    if (param1 != 2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (ae.field_g == 2) {
                  L4: {
                    var4_ref = this.b(-13);
                    var5 = wp.a(127, ((lja) this).field_i);
                    var6 = qaa.a(2180, ((lja) this).field_i) ? 1 : 0;
                    if (null != var5) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        ((lja) this).field_f.a((byte) -64, 4, gl.a((byte) 92, ao.field_m, new String[1]));
                        ((lja) this).field_f.a((byte) -70, 6, gl.a((byte) 127, mp.field_b, new String[1]));
                        if (null == param0) {
                          break L4;
                        } else {
                          if (2 == param1) {
                            break L4;
                          } else {
                            if (!fua.field_g) {
                              ((lja) this).field_e = param0;
                              ((lja) this).field_f.a((byte) -90, 19, gl.a((byte) 119, gja.field_k, new String[1]));
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var5 != null) {
                      L6: {
                        if (ab.a(((lja) this).field_i, (byte) -50)) {
                          break L6;
                        } else {
                          if (fua.field_g) {
                            break L6;
                          } else {
                            L7: {
                              if (!ok.field_s) {
                                ((lja) this).field_f.a((byte) -77, 8, gl.a((byte) 114, fj.field_b, new String[1]));
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            ((lja) this).field_f.a((byte) -118, 18, gl.a((byte) 108, ob.field_f, new String[1]));
                            if (param0 == null) {
                              break L6;
                            } else {
                              ((lja) this).field_e = param0;
                              ((lja) this).field_f.a((byte) -71, 19, gl.a((byte) 96, gja.field_k, new String[1]));
                              break L6;
                            }
                          }
                        }
                      }
                      ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var6 != 0) {
                    ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var4;
            stackOut_53_1 = new StringBuilder().append("lja.L(");
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L8;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(gqa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (!param0.field_m) {
              L1: {
                ((lja) this).field_b = param0.field_d;
                if (param0.field_d != 0) {
                  break L1;
                } else {
                  L2: {
                    if (k.field_A != 0) {
                      break L2;
                    } else {
                      ((lja) this).field_f.a((byte) -66, 12, qe.field_b);
                      break L2;
                    }
                  }
                  ((lja) this).field_f.a((byte) -86, 13, pea.field_f);
                  break L1;
                }
              }
              L3: {
                if (1 == param0.field_d) {
                  L4: {
                    if (0 != nba.field_b) {
                      break L4;
                    } else {
                      ((lja) this).field_f.a((byte) -77, 12, jl.field_a);
                      break L4;
                    }
                  }
                  ((lja) this).field_f.a((byte) -82, 13, ot.field_w);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (param0.field_d != 2) {
                  break L5;
                } else {
                  L6: {
                    if (caa.field_i != 0) {
                      break L6;
                    } else {
                      ((lja) this).field_f.a((byte) -93, 12, cva.field_e);
                      break L6;
                    }
                  }
                  ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                  break L5;
                }
              }
              L7: {
                if (param1 == 13) {
                  break L7;
                } else {
                  String discarded$2 = this.b(-106);
                  break L7;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("lja.B(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        pha var3_ref = null;
        pha var4 = null;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -22) {
                break L1;
              } else {
                field_c = false;
                break L1;
              }
            }
            L2: {
              if (((lja) this).field_i == null) {
                break L2;
              } else {
                if (((lja) this).field_g == rb.field_r) {
                  break L2;
                } else {
                  if (null == uu.field_a) {
                    break L2;
                  } else {
                    if (mka.b(8192)) {
                      L3: {
                        var3_ref = nl.a(true, ((lja) this).field_g);
                        var4 = vba.a((byte) -40, ((lja) this).field_g);
                        var5 = this.b(-13);
                        if (null != var4) {
                          break L3;
                        } else {
                          if (null == var3_ref) {
                            break L2;
                          } else {
                            if (!uu.field_a.field_Yb) {
                              break L2;
                            } else {
                              if (~uu.field_a.field_Jb >= ~uu.field_a.field_Mb) {
                                break L2;
                              } else {
                                L4: {
                                  if (!var3_ref.field_Hb) {
                                    break L4;
                                  } else {
                                    ((lja) this).field_f.a((byte) -79, 1, gl.a((byte) 126, oea.field_g, new String[1]));
                                    if (var6 == 0) {
                                      break L2;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L5: {
                                  if (!param1) {
                                    break L5;
                                  } else {
                                    if (!var3_ref.field_Fb) {
                                      break L5;
                                    } else {
                                      ((lja) this).field_f.a((byte) -123, 0, gl.a((byte) 127, sb.field_c, new String[1]));
                                      ((lja) this).field_f.a((byte) -98, 1, gl.a((byte) 116, aja.field_G, new String[1]));
                                      if (var6 == 0) {
                                        break L2;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                ((lja) this).field_f.a((byte) -112, 0, gl.a((byte) 98, uh.field_i, new String[1]));
                                if (var6 == 0) {
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      L6: {
                        if (!uu.field_a.field_ec) {
                          break L6;
                        } else {
                          if (uu.field_a.field_Kb < 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      ((lja) this).field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[1]));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "lja.N(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((lja) this).field_i == null) {
                break L1;
              } else {
                if (((lja) this).field_g == rb.field_r) {
                  break L1;
                } else {
                  var2 = this.b(-13);
                  ((lja) this).field_f.a((byte) -81, 17, gl.a((byte) 122, vj.field_c, new String[1]));
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                ((lja) this).a((gqa) null, -104);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "lja.J(" + param0 + ')');
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param2 >= 93) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            if (param1 != 17) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              fj.field_c = new wla(((lja) this).field_h.field_q, ((lja) this).field_h.field_A, ((lja) this).field_h.field_G, ((lja) this).field_h.field_t, param0, lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p, ((lja) this).field_i, ((lja) this).field_g);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "lja.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    lja(jea param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            ((lja) this).field_f = new ola(eq.field_n);
            ((lja) this).field_i = param2;
            ((lja) this).field_h = param0;
            ((lja) this).field_b = param5;
            param0.field_cb = true;
            ((lja) this).field_e = param6;
            ((lja) this).field_g = param1;
            ((lja) this).field_k = param4;
            ((lja) this).field_d = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lja.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_j = new fp();
        field_a = "That treasure's valuable, but heavy, so it'll slow you down. Drop it using <img=8><img=9> if you need to.";
    }
}
