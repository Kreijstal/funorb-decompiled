/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static ee[] field_h;
    static sna field_i;
    private String field_f;
    sna field_g;
    static kv[] field_l;
    pna field_a;
    private long field_e;
    private int[] field_c;
    private int field_b;
    static int[] field_d;
    String field_j;
    int field_k;

    final void b(boolean param0) {
        RuntimeException var2 = null;
        uha var2_ref = null;
        String var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (null != pw.field_w) {
                break L1;
              } else {
                var2_ref = lk.c(-12411, ((ik) this).field_k);
                if (null != var2_ref) {
                  L2: {
                    var3 = var2_ref.field_Jb;
                    if (var2_ref.field_Wb) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (var2_ref.field_zb) {
                            break L4;
                          } else {
                            if (var2_ref.field_gc) {
                              break L3;
                            } else {
                              if (!var2_ref.field_Fb) {
                                break L3;
                              } else {
                                L5: {
                                  if (!var2_ref.field_Zb) {
                                    break L5;
                                  } else {
                                    if (!var2_ref.field_zb) {
                                      break L3;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                ((ik) this).field_a.a(lga.a(param0, new String[1], p.field_m), true, 2);
                                if (var4 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        ((ik) this).field_a.a(lga.a(true, new String[1], o.field_i), true, 2);
                        break L3;
                      }
                      if (!var2_ref.field_gc) {
                        break L1;
                      } else {
                        ((ik) this).field_a.a(lga.a(true, new String[1], fh.field_s), true, 3);
                        if (var4 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ((ik) this).field_a.a(lga.a(param0, new String[1], qh.field_a), true, 2);
                  ((ik) this).field_a.a(lga.a(true, new String[1], cc.field_a), true, 3);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (param0) {
                break L6;
              } else {
                ((ik) this).a((byte) -72, true);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "ik.F(" + param0 + ')');
        }
    }

    final void a(int param0, gs param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (param1.field_i) {
              return;
            } else {
              L1: {
                if (param0 <= -26) {
                  break L1;
                } else {
                  ((ik) this).field_c = null;
                  break L1;
                }
              }
              L2: {
                ((ik) this).field_b = param1.field_p;
                if (0 != param1.field_p) {
                  break L2;
                } else {
                  L3: {
                    if (fb.field_p == 0) {
                      ((ik) this).field_a.a(eea.field_c, true, 12);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((ik) this).field_a.a(d.field_D, true, 13);
                  break L2;
                }
              }
              L4: {
                if (param1.field_p != 1) {
                  break L4;
                } else {
                  L5: {
                    if (ri.field_c != 0) {
                      break L5;
                    } else {
                      ((ik) this).field_a.a(ffa.field_i, true, 12);
                      break L5;
                    }
                  }
                  ((ik) this).field_a.a(sma.field_B, true, 13);
                  break L4;
                }
              }
              L6: {
                if (param1.field_p == 2) {
                  L7: {
                    if (0 != fj.field_g) {
                      break L7;
                    } else {
                      ((ik) this).field_a.a(iea.field_c, true, 12);
                      break L7;
                    }
                  }
                  ((ik) this).field_a.a(ho.field_f, true, 13);
                  break L6;
                } else {
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("ik.N(").append(param0).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    final void a(int param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((ik) this).field_j) {
                break L1;
              } else {
                if (~((ik) this).field_e == ~ge.field_F) {
                  break L1;
                } else {
                  var2 = this.b(param0 + -13144);
                  ((ik) this).field_a.a(lga.a(true, new String[1], wba.field_d), true, 17);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 21654) {
                break L2;
              } else {
                field_l = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "ik.C(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        ema var3_ref = null;
        ema var4 = null;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 > 113) {
              L1: {
                if (null == ((ik) this).field_j) {
                  break L1;
                } else {
                  if (((ik) this).field_e == ge.field_F) {
                    break L1;
                  } else {
                    if (pw.field_w == null) {
                      break L1;
                    } else {
                      if (!ps.d(-117)) {
                        break L1;
                      } else {
                        L2: {
                          var3_ref = gf.a(((ik) this).field_e, false);
                          var4 = uka.a(((ik) this).field_e, 28791);
                          var5 = this.b(8510);
                          if (null != var4) {
                            break L2;
                          } else {
                            if (null == var3_ref) {
                              break L1;
                            } else {
                              if (!pw.field_w.field_Fb) {
                                break L1;
                              } else {
                                if (pw.field_w.field_Rb < pw.field_w.field_Pb) {
                                  L3: {
                                    if (var3_ref.field_wb) {
                                      break L3;
                                    } else {
                                      L4: {
                                        if (!param1) {
                                          break L4;
                                        } else {
                                          if (!var3_ref.field_Ob) {
                                            break L4;
                                          } else {
                                            ((ik) this).field_a.a(lga.a(true, new String[1], op.field_q), true, 0);
                                            ((ik) this).field_a.a(lga.a(true, new String[1], rk.field_r), true, 1);
                                            if (var6 == 0) {
                                              break L1;
                                            } else {
                                              break L4;
                                            }
                                          }
                                        }
                                      }
                                      ((ik) this).field_a.a(lga.a(true, new String[1], vca.field_m), true, 0);
                                      if (var6 == 0) {
                                        break L1;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  ((ik) this).field_a.a(lga.a(true, new String[1], jba.field_w), true, 1);
                                  if (var6 == 0) {
                                    break L1;
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                        L5: {
                          if (!pw.field_w.field_Zb) {
                            break L5;
                          } else {
                            if (0 <= pw.field_w.field_Nb) {
                              break L5;
                            } else {
                              break L1;
                            }
                          }
                        }
                        ((ik) this).field_a.a(lga.a(true, new String[1], gka.field_m), true, 1);
                        break L1;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "ik.H(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_l = null;
            field_d = null;
            field_i = null;
            field_h = null;
            if (param0 <= 34) {
                field_d = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ik.L(" + param0 + ')');
        }
    }

    final static kv b(int param0, int param1, int param2) {
        kv var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        kv stackIn_7_0 = null;
        kv stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        kv stackOut_6_0 = null;
        kv stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var3 = new kv(param0, param0);
            if (param2 == 2) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= var3.field_v.length) {
                      break L3;
                    } else {
                      stackOut_6_0 = (kv) var3;
                      stackIn_11_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        stackIn_7_0.field_v[var4] = param1;
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = (kv) var3;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (kv) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3_ref, "ik.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    private final boolean c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_43_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 10960) {
                break L1;
              } else {
                boolean discarded$1 = this.a(-100, 21, 18);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param0 == 1) {
                      break L4;
                    } else {
                      L5: {
                        if (2 != param0) {
                          break L5;
                        } else {
                          ep.a(false, param2, ((ik) this).field_k);
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (param0 != 3) {
                          break L6;
                        } else {
                          rja.a(param2, ((ik) this).field_k, param1 + -10959);
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (param0 == 10) {
                        sfa.a(param2, ((ik) this).field_k, false);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        L7: {
                          if (param0 != 15) {
                            break L7;
                          } else {
                            lu.a(((ik) this).field_k, param2, (byte) -101);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (param0 != 16) {
                            break L8;
                          } else {
                            lu.a(0, param2, (byte) 87);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L8;
                            }
                          }
                        }
                        stackOut_35_0 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        return stackIn_36_0 != 0;
                      }
                    }
                  }
                  od.a(((ik) this).field_e, param2, 2);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              bia.a((byte) 35, ((ik) this).field_e, param2);
              break L2;
            }
            stackOut_43_0 = 1;
            stackIn_44_0 = stackOut_43_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "ik.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_44_0 != 0;
    }

    final void a(byte param0, boolean param1) {
        try {
            ((ik) this).field_a.a(param1, 7802);
            if (param0 >= -119) {
                ((ik) this).field_g = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ik.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int[] param0, byte param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        nea var5 = null;
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
              if (param1 < -105) {
                break L1;
              } else {
                boolean discarded$1 = ((ik) this).a(false);
                break L1;
              }
            }
            L2: {
              if (null == ((ik) this).field_j) {
                break L2;
              } else {
                L3: {
                  if (~ge.field_F != ~((ik) this).field_e) {
                    break L3;
                  } else {
                    if (param2 != 2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (um.field_c == 2) {
                  L4: {
                    var4_ref = this.b(8510);
                    var5 = bna.b(-100, ((ik) this).field_j);
                    var6 = bna.a((byte) 5, ((ik) this).field_j) ? 1 : 0;
                    if (var5 != null) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        ((ik) this).field_a.a(lga.a(true, new String[1], faa.field_a), true, 4);
                        ((ik) this).field_a.a(lga.a(true, new String[1], hba.field_v), true, 6);
                        if (null == param0) {
                          break L4;
                        } else {
                          if (2 == param2) {
                            break L4;
                          } else {
                            if (hl.field_I) {
                              break L4;
                            } else {
                              ((ik) this).field_c = param0;
                              ((ik) this).field_a.a(lga.a(true, new String[1], pe.field_n), true, 19);
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
                    if (var5 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (sha.a((byte) -24, ((ik) this).field_j)) {
                          break L6;
                        } else {
                          if (hl.field_I) {
                            break L6;
                          } else {
                            L7: {
                              if (!sea.field_j) {
                                ((ik) this).field_a.a(lga.a(true, new String[1], jv.field_m), true, 8);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            ((ik) this).field_a.a(lga.a(true, new String[1], lga.field_i), true, 18);
                            if (null != param0) {
                              ((ik) this).field_c = param0;
                              ((ik) this).field_a.a(lga.a(true, new String[1], pe.field_n), true, 19);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      ((ik) this).field_a.a(lga.a(true, new String[1], gl.field_g), true, 5);
                      break L5;
                    }
                  }
                  if (var6 != 0) {
                    ((ik) this).field_a.a(lga.a(true, new String[1], oj.field_n), true, 7);
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
            stackOut_53_1 = new StringBuilder().append("ik.D(");
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
          throw pe.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_49_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -14) {
                break L1;
              } else {
                boolean discarded$2 = this.d(35, -60, 45);
                break L1;
              }
            }
            L2: {
              L3: {
                if (8 == param2) {
                  break L3;
                } else {
                  L4: {
                    if (param2 != 18) {
                      break L4;
                    } else {
                      pj.a(((ik) this).field_j, (byte) 89, ((ik) this).field_e);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param2 != 11) {
                      break L5;
                    } else {
                      fk.a(param0 ^ -117, ((ik) this).field_b, param1, 0);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (param2 != 12) {
                      break L6;
                    } else {
                      fk.a(123, ((ik) this).field_b, param1, 1);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (param2 != 13) {
                      break L7;
                    } else {
                      fk.a(param0 ^ -108, ((ik) this).field_b, param1, 2);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (14 != param2) {
                      break L8;
                    } else {
                      kw.a(true);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (20 == param2) {
                    fk.d(param0 + 14);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    L9: {
                      if (19 != param2) {
                        break L9;
                      } else {
                        boolean discarded$3 = ew.a(((ik) this).field_c, ((ik) this).field_e, ((ik) this).field_b, false, ((ik) this).field_j);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L9;
                        }
                      }
                    }
                    stackOut_44_0 = 0;
                    stackIn_45_0 = stackOut_44_0;
                    return stackIn_45_0 != 0;
                  }
                }
              }
              od.a(((ik) this).field_e, ((ik) this).field_j, false);
              break L2;
            }
            stackOut_49_0 = 1;
            stackIn_50_0 = stackOut_49_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "ik.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_50_0 != 0;
    }

    private final String b(int param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 8510) {
                break L1;
              } else {
                ((ik) this).field_k = 101;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != ((ik) this).field_f) {
                  break L3;
                } else {
                  var2 = ((ik) this).field_j;
                  if (BachelorFridge.field_y == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = ((ik) this).field_f;
              break L2;
            }
            stackOut_6_0 = (String) var2;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "ik.B(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                String discarded$2 = this.b(-99);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((ik) this).field_a) {
                  break L3;
                } else {
                  if (!((ik) this).field_a.g(0)) {
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
          throw pe.a((Throwable) (Object) var2, "ik.G(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var6_int = ((ik) this).field_a.b(param1, 74);
            if (var6_int != -2) {
              boolean discarded$9 = this.c(var6_int, 10960, param4);
              boolean discarded$10 = this.d(param2, var6_int, 96);
              if (param0) {
                boolean discarded$11 = this.a(-14, param2, var6_int);
                boolean discarded$12 = this.e(var6_int, param3, -12211);
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var6, "ik.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, jfa param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        pf var4 = null;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (!bp.e(-29919)) {
              var4 = sja.field_fb;
              var4.c(85, (byte) 117);
              sja.field_fb.field_g = sja.field_fb.field_g + 2;
              var5 = sja.field_fb.field_g;
              rha.a(param1.field_g, (lu) (Object) var4, (byte) -116);
              var4.d(param0, 0);
              var4.d(param3, param2 ^ param2);
              sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var5);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ik.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean e(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (param0 == 17) {
              wt.field_n = new uq(((ik) this).field_g.field_D, ((ik) this).field_g.field_M, ((ik) this).field_g.field_sb, ((ik) this).field_g.field_p, param1, qaa.field_d, mda.field_c, sm.field_s, qs.field_m, nr.field_v, dla.field_k, ((ik) this).field_j, ((ik) this).field_e);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param2 == -12211) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "ik.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final boolean d(int param0, int param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        RuntimeException var4_ref2 = null;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        try {
          L0: {
            L1: {
              if (param2 > 12) {
                break L1;
              } else {
                boolean discarded$2 = this.a(79, -108, -76);
                break L1;
              }
            }
            L2: {
              var4 = null;
              if (param1 == 4) {
                var4_ref = lda.a(-26181, param0, ((ik) this).field_j);
                break L2;
              } else {
                if (param1 != 5) {
                  if (param1 != 6) {
                    if (param1 == 7) {
                      var4_ref = tha.a(2, ((ik) this).field_j, ((ik) this).field_f, param0);
                      break L2;
                    } else {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    }
                  } else {
                    var4_ref = ip.a(((ik) this).field_j, (byte) -80, param0);
                    break L2;
                  }
                } else {
                  var4_ref = via.a(param0, ((ik) this).field_j, -100);
                  break L2;
                }
              }
            }
            L3: {
              if (var4_ref != null) {
                vf.a(((ik) this).field_j, 0, 124, (String) null, var4_ref, 2);
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_19_0 = 1;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4_ref2, "ik.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    ik(sna param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
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
            ((ik) this).field_a = new pna(td.field_o);
            ((ik) this).field_f = param3;
            ((ik) this).field_j = param2;
            ((ik) this).field_k = param4;
            ((ik) this).field_g = param0;
            ((ik) this).field_b = param5;
            ((ik) this).field_e = param1;
            ((ik) this).field_c = param6;
            param0.field_t = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ik.<init>(");
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
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
    }
}
