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
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
            L5: {
              if (param0 == 80) {
                break L5;
              } else {
                b.a(true, 89, -61, (ei) null);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "b.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        try {
            field_c = null;
            field_b = null;
            field_e = null;
            field_a = null;
            int var1_int = -2 / ((param0 - -18) / 57);
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "b.C(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        fi stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        fi stackIn_63_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        da var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        fi var5_ref = null;
        fi var6 = null;
        String var6_ref = null;
        fi var7 = null;
        String var7_ref = null;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            if (param0 == 10) {
              var1 = rd.field_e;
              var2 = var1.f((byte) -103);
              if (var2 != 0) {
                if ((var2 ^ -1) == -2) {
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
                    var3 = var1.j(-1231);
                    if (((String) (var3)).equals("")) {
                      var3 = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var4_ref_String = var1.j(-1231);
                    var5 = var1.j(-1231);
                    var6 = ra.a(var4_ref_String, param0 ^ 85);
                    if (null != var6) {
                      break L3;
                    } else {
                      var6 = ra.a(var5, param0 ^ 101);
                      if (var6 != null) {
                        jo.field_b.a((long)kf.a((CharSequence) ((Object) var4_ref_String), (byte) 111).hashCode(), (byte) -75, var6);
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
                      jo.field_b.a((long)kf.a((CharSequence) ((Object) var4_ref_String), (byte) 111).hashCode(), (byte) -75, var6);
                      fieldTemp$0 = sl.field_a;
                      sl.field_a = sl.field_a + 1;
                      var6.field_gb = fieldTemp$0;
                      be.field_j.a((byte) -105, var6);
                      break L4;
                    }
                  }
                  L5: {
                    if (var3 != null) {
                      var3 = ((String) (var3)).intern();
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var6.field_mb = var4_ref_String;
                  var6.field_hb = (String) (var3);
                  var6.d(param0 ^ 10);
                  var7 = (fi) ((Object) be.field_j.b((byte) 96));
                  L6: while (true) {
                    L7: {
                      L8: {
                        L9: {
                          if (var7 == null) {
                            break L9;
                          } else {
                            stackIn_63_0 = (fi) (var6);

                            stackIn_63_1 = 200;

                            stackIn_63_2 = (fi) (var7);

                            if (var8 != 0) {
                              break L8;
                            } else {
                              if (!gi.a(stackIn_63_0, stackIn_63_1, stackIn_63_2)) {
                                break L9;
                              } else {
                                var7 = (fi) ((Object) be.field_j.c((byte) -33));
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
                          if (null != var7) {
                            break L10;
                          } else {
                            be.field_j.a((byte) -125, var6);
                            if (var8 == 0) {
                              break L7;
                            } else {
                              break L10;
                            }
                          }
                        }
                        stackIn_63_0 = (fi) (var7);
                        stackIn_63_1 = 0;
                        stackIn_63_2 = (fi) (var6);
                        break L8;
                      }
                      ah.a(stackIn_63_0, stackIn_63_1, stackIn_63_2);
                      break L7;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  if ((var2 ^ -1) != -3) {
                    if (3 != var2) {
                      if (-5 != (var2 ^ -1)) {
                        bl.a((Throwable) null, (byte) 55, "F1: " + em.b(false));
                        r.a(-28036);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        eg.field_b = 1;
                        var3 = var1.j(-1231);
                        vl.field_g = ((String) (var3)).intern();
                        var4 = var1.f((byte) -70);
                        jh.a(var4, (byte) 61);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      L11: {
                        if (-3 != (eg.field_b ^ -1)) {
                          break L11;
                        } else {
                          eg.field_b = 1;
                          break L11;
                        }
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
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
                    decompiledRegionSelector0 = 3;
                    break L0;
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
                  if (1 != var1.f((byte) -18)) {
                    stackIn_14_0 = 0;
                    break L14;
                  } else {
                    stackIn_14_0 = 1;
                    break L14;
                  }
                }
                L15: {
                  var3_int = stackIn_14_0;
                  var4_ref_String = var1.j(-1231);
                  if (var3_int == 0) {
                    break L15;
                  } else {
                    var1.j(-1231);
                    break L15;
                  }
                }
                L16: {
                  var5_ref = wc.a(param0 + -10, var4_ref_String);
                  var6_ref = var1.j(param0 + -1241);
                  var7_ref = kf.a((CharSequence) ((Object) var4_ref_String), (byte) 94);
                  if (null != var7_ref) {
                    break L16;
                  } else {
                    var7_ref = var4_ref_String;
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
                      ah.field_a.a((long)var7_ref.hashCode(), (byte) -75, var5_ref);
                      break L17;
                    }
                  }
                }
                L18: {
                  if (var5_ref == null) {
                    var5_ref = new fi();
                    ah.field_a.a((long)var7_ref.hashCode(), (byte) -75, var5_ref);
                    fieldTemp$1 = se.field_l;
                    se.field_l = se.field_l + 1;
                    var5_ref.field_gb = fieldTemp$1;
                    sj.field_H.a((byte) -128, var5_ref);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                var5_ref.field_mb = var4_ref_String;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "b.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(hd[] param0, byte param1, int param2) {
        hd var3 = null;
        int var4 = 0;
        int var5 = 0;
        hd[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1 > 63) {
                break L1;
              } else {
                b.a(true, 65, 85, (ei) null);
                break L1;
              }
            }
            var3 = param0[param2];
            var4 = -1 + param2;
            L2: while (true) {
              L3: {
                L4: {
                  if (0 > var4) {
                    break L4;
                  } else {
                    stackIn_14_0 = (hd[]) (param0);

                    stackIn_14_1 = var4;

                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (((hd) (Object) stackIn_14_0[stackIn_14_1]).a((byte) -101, var3) >= 0) {
                        param0[1 + var4] = param0[var4];
                        var4--;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        param0[var4 + 1] = var3;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_14_0 = (hd[]) (param0);
                stackIn_14_1 = 0;
                break L3;
              }
              stackIn_14_0[stackIn_14_1] = var3;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("b.F(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = (String) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = 0;
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param3.field_e <= var5) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = (ei) (param3.field_b[var5]);
                        stackIn_16_0 = 0;
                        stackIn_7_0 = stackIn_16_0;
                        if (var9 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = stackIn_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6.field_e <= var7) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = (vj) (var6.field_b[var7]);
                        var4_int = var4_int + ah.a(var8, (byte) 78, param2, param1);
                        var7++;
                        if (var9 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var9 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 != var4_int % 2) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_20_0 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var4);
                    stackIn_22_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("b.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_22_1 = stackIn_24_1;
                    if (param3 == null) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw kk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        ih var2 = null;
        hl var2_ref = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = (ih) ((Object) io.field_c.b((byte) 121));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == var2) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        mk.a(1, param1, var2);
                        var2 = (ih) ((Object) io.field_c.c((byte) -108));
                        if (var3 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var2_ref = sg.field_v.b((byte) 127);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var2_ref == null) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        hh.a(param1, (byte) -23);
                        var2_ref = sg.field_v.c((byte) -78);
                        if (var3 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw kk.a((Throwable) ((Object) runtimeException), "b.A(" + param0 + ',' + param1 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_a = "Accelerate";
        field_e = "Mine";
    }
}
