/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_c;
    static String field_n;
    static String field_g;
    private long field_l;
    ak field_o;
    pi field_b;
    String field_h;
    private String field_i;
    int field_m;
    static vj field_d;
    static bb field_a;
    static String field_e;
    private int field_k;
    private int[] field_j;
    static int[] field_f;

    public static void c(byte param0) {
        if (param0 <= 52) {
            return;
        }
        try {
            field_e = null;
            field_f = null;
            field_n = null;
            field_a = null;
            field_c = null;
            field_g = null;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wi.O(" + param0 + ')');
        }
    }

    private final String a(byte param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((wi) this).field_i == null) {
                  break L2;
                } else {
                  var2 = ((wi) this).field_i;
                  if (!Pixelate.field_H) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = ((wi) this).field_h;
              break L1;
            }
            if (param0 > 7) {
              stackOut_6_0 = (String) var2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (String) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "wi.D(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        im var5 = null;
        int var6 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        try {
          L0: {
            if (param2 == -3) {
              L1: {
                if (((wi) this).field_h == null) {
                  break L1;
                } else {
                  L2: {
                    if (hn.field_f != ((wi) this).field_l) {
                      break L2;
                    } else {
                      if (2 != param0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (2 == gk.field_db) {
                    L3: {
                      var4_ref = this.a((byte) 114);
                      var5 = re.a(((wi) this).field_h, -1);
                      var6 = i.a(-640, ((wi) this).field_h) ? 1 : 0;
                      if (var5 != null) {
                        break L3;
                      } else {
                        if (var6 != 0) {
                          break L3;
                        } else {
                          ((wi) this).field_b.a(sd.a(ji.field_d, 52, new String[1]), (byte) -106, 4);
                          ((wi) this).field_b.a(sd.a(ff.field_e, 18, new String[1]), (byte) -53, 6);
                          if (null == param1) {
                            break L3;
                          } else {
                            if (param0 == 2) {
                              break L3;
                            } else {
                              if (!ln.field_q) {
                                ((wi) this).field_j = param1;
                                ((wi) this).field_b.a(sd.a(nl.field_d, 61, new String[1]), (byte) -80, 19);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                    L4: {
                      if (var5 == null) {
                        break L4;
                      } else {
                        L5: {
                          if (ul.a(57, ((wi) this).field_h)) {
                            break L5;
                          } else {
                            if (ln.field_q) {
                              break L5;
                            } else {
                              L6: {
                                if (lh.field_g) {
                                  break L6;
                                } else {
                                  ((wi) this).field_b.a(sd.a(nf.field_e, 105, new String[1]), (byte) -119, 8);
                                  break L6;
                                }
                              }
                              ((wi) this).field_b.a(sd.a(ho.field_f, 83, new String[1]), (byte) -33, 18);
                              if (param1 == null) {
                                break L5;
                              } else {
                                ((wi) this).field_j = param1;
                                ((wi) this).field_b.a(sd.a(nl.field_d, 22, new String[1]), (byte) -95, 19);
                                break L5;
                              }
                            }
                          }
                        }
                        ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                        break L4;
                      }
                    }
                    if (var6 == 0) {
                      break L1;
                    } else {
                      ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                      break L1;
                    }
                  } else {
                    break L1;
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
          L7: {
            var4 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var4;
            stackOut_50_1 = new StringBuilder().append("wi.E(").append(param0).append(',');
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L7;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + param2 + ')');
        }
    }

    final static void b(byte param0) {
        if (!hf.b((byte) 100)) {
            return;
        }
        try {
            bq.a(false, (byte) -110, 4);
            if (param0 != -53) {
                field_d = null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wi.I(" + param0 + ')');
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_21_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_43_0 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 == 0) {
                  break L2;
                } else {
                  L3: {
                    if (param0 == 1) {
                      break L3;
                    } else {
                      L4: {
                        if (param0 == 2) {
                          break L4;
                        } else {
                          L5: {
                            if (param0 == 3) {
                              break L5;
                            } else {
                              L6: {
                                if (param0 == 10) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (param0 == 15) {
                                      break L7;
                                    } else {
                                      if (param0 == 16) {
                                        df.a(3, 0, param1);
                                        if (var5 == 0) {
                                          break L1;
                                        } else {
                                          break L7;
                                        }
                                      } else {
                                        stackOut_20_0 = 0;
                                        stackIn_21_0 = stackOut_20_0;
                                        return stackIn_21_0 != 0;
                                      }
                                    }
                                  }
                                  df.a(param2 ^ 7489, ((wi) this).field_m, param1);
                                  if (var5 == 0) {
                                    break L1;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              qj.a(false, ((wi) this).field_m, param1);
                              if (var5 == 0) {
                                break L1;
                              } else {
                                break L5;
                              }
                            }
                          }
                          qg.a(((wi) this).field_m, param1, false);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      wi.b(param1, param2 ^ -7903, ((wi) this).field_m);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  pe.a(7, param1, ((wi) this).field_l);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              bg.a(((wi) this).field_l, param1, param2 ^ -31541);
              break L1;
            }
            L8: {
              if (param2 == 7490) {
                break L8;
              } else {
                boolean discarded$1 = this.a(67, true, 49);
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
          throw aa.a((Throwable) (Object) var4, "wi.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_44_0 != 0;
    }

    final void a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 20) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            ((wi) this).field_b.a(param0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "wi.G(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(boolean param0, byte param1) {
        RuntimeException var3 = null;
        uj var3_ref = null;
        uj var4 = null;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((wi) this).field_h == null) {
                break L1;
              } else {
                if (((wi) this).field_l == hn.field_f) {
                  break L1;
                } else {
                  if (null == io.field_c) {
                    break L1;
                  } else {
                    if (pl.m(param1 + 197)) {
                      L2: {
                        var3_ref = gp.a(param1 + 100, ((wi) this).field_l);
                        var4 = ll.a(((wi) this).field_l, param1 + 14526);
                        var5 = this.a((byte) 27);
                        if (var4 != null) {
                          break L2;
                        } else {
                          if (var3_ref == null) {
                            break L1;
                          } else {
                            if (!io.field_c.field_Mb) {
                              break L1;
                            } else {
                              if (io.field_c.field_mc >= io.field_c.field_ec) {
                                break L1;
                              } else {
                                L3: {
                                  if (var3_ref.field_Vb) {
                                    break L3;
                                  } else {
                                    L4: {
                                      L5: {
                                        if (!param0) {
                                          break L5;
                                        } else {
                                          if (var3_ref.field_Jb) {
                                            break L4;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      ((wi) this).field_b.a(sd.a(i.field_m, 67, new String[1]), (byte) -83, 0);
                                      if (var6 == 0) {
                                        break L1;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    ((wi) this).field_b.a(sd.a(md.field_V, 59, new String[1]), (byte) -70, 0);
                                    ((wi) this).field_b.a(sd.a(po.field_f, 101, new String[1]), (byte) -41, 1);
                                    if (var6 == 0) {
                                      break L1;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                ((wi) this).field_b.a(sd.a(fm.field_j, param1 + 180, new String[1]), (byte) -111, 1);
                                if (var6 == 0) {
                                  break L1;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                      L6: {
                        if (!io.field_c.field_dc) {
                          break L6;
                        } else {
                          if (io.field_c.field_nc < 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      ((wi) this).field_b.a(sd.a(vf.field_b, 123, new String[1]), (byte) -112, 1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L7: {
              if (param1 == -98) {
                break L7;
              } else {
                boolean discarded$1 = this.a(48, 58, -125);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "wi.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(int param0, int param1, int param2) {
        pc var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -925) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            var3 = aa.field_f;
            var3.g(param0, 15514);
            var3.e(160, 3);
            var3.e(160, 8);
            var3.b(1276387944, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3_ref, "wi.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        RuntimeException var4_ref2 = null;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        try {
          L0: {
            L1: {
              var4 = null;
              if (param2 != 4) {
                if (param2 != 5) {
                  if (param2 != 6) {
                    if (7 != param2) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    } else {
                      var4_ref = aq.a(((wi) this).field_h, param0, ((wi) this).field_i, -20867);
                      break L1;
                    }
                  } else {
                    var4_ref = mj.a(85, ((wi) this).field_h, param0);
                    break L1;
                  }
                } else {
                  var4_ref = ff.a(param0, ((wi) this).field_h, (byte) -106);
                  break L1;
                }
              } else {
                var4_ref = jf.a(((wi) this).field_h, param0, (byte) 79);
                break L1;
              }
            }
            L2: {
              if (var4_ref == null) {
                break L2;
              } else {
                ti.a(0, (String) null, ((wi) this).field_h, (byte) -50, 2, var4_ref);
                break L2;
              }
            }
            if (param1 < -123) {
              stackOut_16_0 = 1;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              return stackIn_15_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4_ref2, "wi.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -94) {
              L1: {
                L2: {
                  if (null == ((wi) this).field_b) {
                    break L2;
                  } else {
                    if (!((wi) this).field_b.j(-52)) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "wi.J(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void a(byte param0, aa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 66) {
                break L1;
              } else {
                ((wi) this).field_l = 31L;
                break L1;
              }
            }
            if (param1.field_a) {
              return;
            } else {
              L2: {
                ((wi) this).field_k = param1.field_j;
                if (param1.field_j != 0) {
                  break L2;
                } else {
                  L3: {
                    if (io.field_e == 0) {
                      ((wi) this).field_b.a(gd.field_j, (byte) -31, 12);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((wi) this).field_b.a(uo.field_d, (byte) -127, 13);
                  break L2;
                }
              }
              L4: {
                if (1 == param1.field_j) {
                  L5: {
                    if (0 != gh.field_v) {
                      break L5;
                    } else {
                      ((wi) this).field_b.a(m.field_l, (byte) -97, 12);
                      break L5;
                    }
                  }
                  ((wi) this).field_b.a(ec.field_n, (byte) -106, 13);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (2 != param1.field_j) {
                  break L6;
                } else {
                  L7: {
                    if (0 != ib.field_e) {
                      break L7;
                    } else {
                      ((wi) this).field_b.a(gf.field_d, (byte) -78, 12);
                      break L7;
                    }
                  }
                  ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
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
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("wi.B(").append(param0).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var6_int = ((wi) this).field_b.b(-12487, param4);
            if (!param2) {
              if (-2 == var6_int) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                boolean discarded$8 = this.a(var6_int, param1, 7490);
                boolean discarded$9 = this.a(param0, (byte) -128, var6_int);
                boolean discarded$10 = this.b(var6_int, (byte) 10, param0);
                boolean discarded$11 = this.a(var6_int, param2, param3);
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var6, "wi.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final boolean b(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_33_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_49_0 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 == 8) {
                  break L2;
                } else {
                  L3: {
                    if (param0 == 18) {
                      break L3;
                    } else {
                      L4: {
                        if (param0 != 11) {
                          break L4;
                        } else {
                          am.a(0, -26931, ((wi) this).field_k, param2);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (param0 == 12) {
                          break L5;
                        } else {
                          L6: {
                            if (param0 == 13) {
                              break L6;
                            } else {
                              L7: {
                                if (param0 != 14) {
                                  break L7;
                                } else {
                                  kl.a(7500);
                                  if (var5 == 0) {
                                    break L1;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (20 != param0) {
                                  break L8;
                                } else {
                                  ak.c(true);
                                  if (var5 == 0) {
                                    break L1;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if (param0 == 19) {
                                boolean discarded$1 = tg.a(((wi) this).field_h, ((wi) this).field_l, ((wi) this).field_k, -2, ((wi) this).field_j);
                                if (var5 == 0) {
                                  break L1;
                                } else {
                                  break L6;
                                }
                              } else {
                                stackOut_32_0 = 0;
                                stackIn_33_0 = stackOut_32_0;
                                return stackIn_33_0 != 0;
                              }
                            }
                          }
                          am.a(2, -26931, ((wi) this).field_k, param2);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      am.a(1, -26931, ((wi) this).field_k, param2);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  qj.a(((wi) this).field_h, ((wi) this).field_l, (byte) 8);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              pm.a((byte) 85, ((wi) this).field_h, ((wi) this).field_l);
              break L1;
            }
            L9: {
              if (param1 == 10) {
                break L9;
              } else {
                wi.b((byte) -113);
                break L9;
              }
            }
            stackOut_49_0 = 1;
            stackIn_50_0 = stackOut_49_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "wi.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_50_0 != 0;
    }

    private final boolean a(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (param0 == 17) {
              hc.field_M = new oe(((wi) this).field_o.field_tb, ((wi) this).field_o.field_gb, ((wi) this).field_o.field_K, ((wi) this).field_o.field_nb, param2, cm.field_o, pj.field_i, ae.field_f, mg.field_h, um.field_q, dn.field_c, ((wi) this).field_h, ((wi) this).field_l);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  boolean discarded$2 = this.a(-50, false, 11);
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
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "wi.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        eq var3 = null;
        String var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -90 % ((42 - param0) / 62);
              if (io.field_c == null) {
                var3 = vm.a(((wi) this).field_m, (byte) -107);
                if (null == var3) {
                  break L1;
                } else {
                  L2: {
                    var4 = var3.field_pc;
                    if (var3.field_cc) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (!var3.field_hc) {
                            break L4;
                          } else {
                            ((wi) this).field_b.a(sd.a(vg.field_f, 53, new String[1]), (byte) -106, 2);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var3.field_Ob) {
                          break L3;
                        } else {
                          if (!var3.field_Mb) {
                            break L3;
                          } else {
                            L5: {
                              if (!var3.field_dc) {
                                break L5;
                              } else {
                                if (var3.field_hc) {
                                  break L5;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            ((wi) this).field_b.a(sd.a(hd.field_o, 87, new String[1]), (byte) -32, 2);
                            break L3;
                          }
                        }
                      }
                      if (!var3.field_Ob) {
                        break L1;
                      } else {
                        ((wi) this).field_b.a(sd.a(ve.field_Jb, 46, new String[1]), (byte) -96, 3);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ((wi) this).field_b.a(sd.a(fp.field_b, 97, new String[1]), (byte) -105, 2);
                  ((wi) this).field_b.a(sd.a(oi.field_a, 52, new String[1]), (byte) -118, 3);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "wi.P(" + param0 + ')');
        }
    }

    wi(ak param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
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
            ((wi) this).field_b = new pi(a.field_O);
            param0.field_U = true;
            ((wi) this).field_o = param0;
            ((wi) this).field_k = param5;
            ((wi) this).field_h = param2;
            ((wi) this).field_l = param1;
            ((wi) this).field_j = param6;
            ((wi) this).field_i = param3;
            ((wi) this).field_m = param4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wi.<init>(");
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
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        String var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((wi) this).field_h) {
                break L1;
              } else {
                if (~((wi) this).field_l != ~hn.field_f) {
                  var2_ref = this.a((byte) 43);
                  ((wi) this).field_b.a(sd.a(sl.field_j, param0 + -8830, new String[1]), (byte) -72, 17);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 8893) {
                break L2;
              } else {
                boolean discarded$2 = this.a(-105, 67, -5);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "wi.K(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Suggest muting this player";
        field_g = "This is your RuneScape clan if you have one.";
        field_n = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_e = "<%0> cannot join; the game has started.";
        field_f = new int[4];
    }
}
