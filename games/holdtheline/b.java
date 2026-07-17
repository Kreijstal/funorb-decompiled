/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_b;
    static String field_a;
    static mm field_c;
    static gn field_d;
    static String field_e;

    final static void a(int param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              nc.field_h.a(param1, param2);
              if (param3) {
                L2: {
                  var4_int = io.field_b % nc.field_h.field_s * 2;
                  if (nc.field_h.field_s > var4_int) {
                    break L2;
                  } else {
                    var4_int = nc.field_h.field_s + (-var4_int + nc.field_h.field_s);
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    if (var4_int >= 10) {
                      break L4;
                    } else {
                      var4_int = 10;
                      if (HoldTheLine.field_D == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4_int > nc.field_h.field_s - 40) {
                    var4_int = nc.field_h.field_s + -40;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                cd.a(nc.field_h, (byte) 121, var4_int, param2, 30, 0, 80, 0, param1);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var4, "b.D(" + 80 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void b() {
        try {
            field_c = null;
            field_b = null;
            field_e = null;
            field_a = null;
            int var1_int = 2;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "b.C(" + -89 + 41);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        da var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        fi var5_ref = null;
        fi var6 = null;
        String var6_ref = null;
        String var7 = null;
        fi var7_ref = null;
        int var8 = 0;
        int stackIn_14_0 = 0;
        fi stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        fi stackIn_53_2 = null;
        fi stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        fi stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        fi stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        fi stackOut_52_2 = null;
        fi stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        fi stackOut_61_2 = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            if (param0 == 10) {
              var1_ref = rd.field_e;
              var2 = var1_ref.f((byte) -103);
              if (var2 != 0) {
                if (var2 == 1) {
                  L1: {
                    if (jo.field_b != null) {
                      break L1;
                    } else {
                      jo.field_b = new rg(128);
                      sl.field_a = 0;
                      break L1;
                    }
                  }
                  L2: {
                    var3 = var1_ref.j(-1231);
                    if (var3.equals((Object) (Object) "")) {
                      var3 = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var4_ref_String = var1_ref.j(-1231);
                    var5 = var1_ref.j(-1231);
                    var6 = ra.a(var4_ref_String, param0 ^ 85);
                    if (null != var6) {
                      break L3;
                    } else {
                      var6 = ra.a(var5, param0 ^ 101);
                      if (var6 != null) {
                        jo.field_b.a((long)kf.a((CharSequence) (Object) var4_ref_String, (byte) 111).hashCode(), (byte) -75, (ln) (Object) var6);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (null != var6) {
                      break L4;
                    } else {
                      var6 = new fi();
                      jo.field_b.a((long)kf.a((CharSequence) (Object) var4_ref_String, (byte) 111).hashCode(), (byte) -75, (ln) (Object) var6);
                      int fieldTemp$4 = sl.field_a;
                      sl.field_a = sl.field_a + 1;
                      var6.field_gb = fieldTemp$4;
                      be.field_j.a((byte) -105, (hl) (Object) var6);
                      break L4;
                    }
                  }
                  L5: {
                    if (var3 != null) {
                      var3 = var3.intern();
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var6.field_mb = var4_ref_String;
                  var6.field_hb = var3;
                  var6.d(param0 ^ 10);
                  var7_ref = (fi) (Object) be.field_j.b((byte) 96);
                  L6: while (true) {
                    L7: {
                      L8: {
                        L9: {
                          if (var7_ref == null) {
                            break L9;
                          } else {
                            stackOut_52_0 = (fi) var6;
                            stackOut_52_1 = 200;
                            stackOut_52_2 = (fi) var7_ref;
                            stackIn_63_0 = stackOut_52_0;
                            stackIn_63_1 = stackOut_52_1;
                            stackIn_63_2 = stackOut_52_2;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            stackIn_53_2 = stackOut_52_2;
                            if (var8 != 0) {
                              break L8;
                            } else {
                              if (!gi.a(stackIn_53_0, stackIn_53_1, stackIn_53_2)) {
                                break L9;
                              } else {
                                var7_ref = (fi) (Object) be.field_j.c((byte) -33);
                                if (var8 == 0) {
                                  continue L6;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        L10: {
                          if (null != var7_ref) {
                            break L10;
                          } else {
                            be.field_j.a((byte) -125, (hl) (Object) var6);
                            if (var8 == 0) {
                              break L7;
                            } else {
                              break L10;
                            }
                          }
                        }
                        stackOut_61_0 = (fi) var7_ref;
                        stackOut_61_1 = 0;
                        stackOut_61_2 = (fi) var6;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        stackIn_63_2 = stackOut_61_2;
                        break L8;
                      }
                      ah.a((hl) (Object) stackIn_63_0, stackIn_63_1, (hl) (Object) stackIn_63_2);
                      break L7;
                    }
                    return;
                  }
                } else {
                  if (var2 != 2) {
                    if (3 != var2) {
                      if (var2 != 4) {
                        int discarded$5 = 0;
                        bl.a((Throwable) null, (byte) 55, "F1: " + em.b());
                        r.a(-28036);
                        break L0;
                      } else {
                        eg.field_b = 1;
                        var3 = var1_ref.j(-1231);
                        vl.field_g = var3.intern();
                        var4 = var1_ref.f((byte) -70);
                        jh.a(var4, (byte) 61);
                        return;
                      }
                    } else {
                      L11: {
                        if (eg.field_b != 2) {
                          break L11;
                        } else {
                          eg.field_b = 1;
                          break L11;
                        }
                      }
                      return;
                    }
                  } else {
                    L12: {
                      if (eg.field_b != 1) {
                        break L12;
                      } else {
                        eg.field_b = 2;
                        break L12;
                      }
                    }
                    return;
                  }
                }
              } else {
                L13: {
                  if (ah.field_a == null) {
                    ah.field_a = new rg(128);
                    se.field_l = 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (1 != var1_ref.f((byte) -18)) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L14;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_14_0 = stackOut_11_0;
                    break L14;
                  }
                }
                L15: {
                  var3_int = stackIn_14_0;
                  var4_ref_String = var1_ref.j(-1231);
                  if (var3_int == 0) {
                    break L15;
                  } else {
                    String discarded$6 = var1_ref.j(-1231);
                    break L15;
                  }
                }
                L16: {
                  var5_ref = wc.a(param0 + -10, var4_ref_String);
                  var6_ref = var1_ref.j(param0 + -1241);
                  var7 = kf.a((CharSequence) (Object) var4_ref_String, (byte) 94);
                  if (null != var7) {
                    break L16;
                  } else {
                    var7 = var4_ref_String;
                    break L16;
                  }
                }
                L17: {
                  if (null != var5_ref) {
                    break L17;
                  } else {
                    var5_ref = wc.a(0, var6_ref);
                    if (null == var5_ref) {
                      break L17;
                    } else {
                      ah.field_a.a((long)var7.hashCode(), (byte) -75, (ln) (Object) var5_ref);
                      break L17;
                    }
                  }
                }
                L18: {
                  if (var5_ref == null) {
                    var5_ref = new fi();
                    ah.field_a.a((long)var7.hashCode(), (byte) -75, (ln) (Object) var5_ref);
                    int fieldTemp$7 = se.field_l;
                    se.field_l = se.field_l + 1;
                    var5_ref.field_gb = fieldTemp$7;
                    sj.field_H.a((byte) -128, (hl) (Object) var5_ref);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                var5_ref.field_mb = var4_ref_String;
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "b.E(" + param0 + 41);
        }
    }

    final static void a(hd[] param0, byte param1, int param2) {
        RuntimeException var3 = null;
        hd var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        hd[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        hd[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        hd[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        hd[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var3_ref = param0[param2];
            var4 = -1 + param2;
            L1: while (true) {
              L2: {
                L3: {
                  if (0 > var4) {
                    break L3;
                  } else {
                    stackOut_6_0 = (hd[]) param0;
                    stackOut_6_1 = var4;
                    stackIn_14_0 = stackOut_6_0;
                    stackIn_14_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (((hd) (Object) stackIn_7_0[stackIn_7_1]).a((byte) -101, var3_ref) >= 0) {
                        param0[1 + var4] = param0[var4];
                        var4--;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        param0[var4 + 1] = var3_ref;
                        return;
                      }
                    }
                  }
                }
                stackOut_13_0 = (hd[]) param0;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L2;
              }
              stackIn_14_0[stackIn_14_1] = var3_ref;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("b.F(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + 96 + 44 + param2 + 41);
        }
    }

    final static boolean a(boolean param0, int param1, int param2, ei param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ei var6 = null;
        int var7 = 0;
        vj var8 = null;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var4_int = 0;
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param3.field_e <= var5) {
                    break L4;
                  } else {
                    var6 = (ei) param3.field_b[var5];
                    stackOut_6_0 = 0;
                    stackIn_16_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      var7 = stackIn_7_0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var6.field_e <= var7) {
                              break L7;
                            } else {
                              var8 = (vj) var6.field_b[var7];
                              var4_int = var4_int + ah.a(var8, (byte) 78, param2, param1);
                              var7++;
                              if (var9 != 0) {
                                break L6;
                              } else {
                                if (var9 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var5++;
                          break L6;
                        }
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              L8: {
                if (stackIn_16_0 != var4_int % 2) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L8;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_20_0 = stackOut_17_0;
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("b.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final static void a() {
        ih var2 = null;
        RuntimeException var2_ref = null;
        hl var2_ref2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            var2 = (ih) (Object) io.field_c.b((byte) 121);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var2) {
                    break L3;
                  } else {
                    mk.a(1, 4, var2);
                    var2 = (ih) (Object) io.field_c.c((byte) -108);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              var2_ref2 = sg.field_v.b((byte) 127);
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_ref2 == null) {
                      break L6;
                    } else {
                      hh.a(4, (byte) -23);
                      var2_ref2 = sg.field_v.c((byte) -78);
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2_ref, "b.A(" + 1 + 44 + 4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_a = "Accelerate";
        field_e = "Mine";
    }
}
