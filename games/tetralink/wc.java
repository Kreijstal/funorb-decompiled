/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends mb {
    private Object field_F;
    static je field_E;
    static String field_H;
    static String field_K;
    static int field_J;
    static int field_I;
    static String field_G;
    static hl field_D;

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_H = null;
              field_K = null;
              if (param0 == -103) {
                break L1;
              } else {
                field_G = (String) null;
                break L1;
              }
            }
            field_G = null;
            field_E = null;
            field_D = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "wc.H(" + param0 + ')');
        }
    }

    final static void h(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        ud stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        ud stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ud var6 = null;
        String var7 = null;
        ud var7_ref = null;
        String var8 = null;
        int var9 = 0;
        var9 = TetraLink.field_J;
        try {
          L0: {
            var1 = kb.field_q;
            var2 = var1.d((byte) -99);
            if (0 == var2) {
              L1: {
                if (null != sd.field_nb) {
                  break L1;
                } else {
                  sd.field_nb = new kd(128);
                  ca.field_c = 0;
                  break L1;
                }
              }
              L2: {
                if (-2 != (var1.d((byte) -99) ^ -1)) {
                  stackIn_11_0 = 0;
                  break L2;
                } else {
                  stackIn_11_0 = 1;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var3_int = stackIn_11_0;
                  var4_ref_String = var1.g((byte) 81);
                  if (var3_int != 0) {
                    break L4;
                  } else {
                    var5 = var4_ref_String;
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = var1.g((byte) 81);
                break L3;
              }
              L5: {
                var6 = fh.a(-32055, var4_ref_String);
                var7 = var1.g((byte) 81);
                var8 = cc.a((CharSequence) ((Object) var4_ref_String), (byte) 98);
                if (var8 == null) {
                  var8 = var4_ref_String;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var6 != null) {
                  break L6;
                } else {
                  var6 = fh.a(-32055, var7);
                  if (null != var6) {
                    sd.field_nb.a((long)var8.hashCode(), var6, param0 + 104);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (var6 == null) {
                  var6 = new ud();
                  sd.field_nb.a((long)var8.hashCode(), var6, 113);
                  fieldTemp$0 = ca.field_c;
                  ca.field_c = ca.field_c + 1;
                  var6.field_Rb = fieldTemp$0;
                  mm.field_s.a(var6, false);
                  break L7;
                } else {
                  break L7;
                }
              }
              var6.field_Lb = var5;
              var6.field_Vb = var7;
              var6.field_Mb = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == var2) {
                L8: {
                  if (null == wb.field_f) {
                    wb.field_f = new kd(128);
                    qi.field_q = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var3 = var1.g((byte) 81);
                  if (!((String) (var3)).equals("")) {
                    break L9;
                  } else {
                    var3 = null;
                    break L9;
                  }
                }
                L10: {
                  var4_ref_String = var1.g((byte) 81);
                  var5 = var1.g((byte) 81);
                  var6 = ke.a(var4_ref_String, false);
                  if (null != var6) {
                    break L10;
                  } else {
                    var6 = ke.a(var5, false);
                    if (null == var6) {
                      break L10;
                    } else {
                      wb.field_f.a((long)cc.a((CharSequence) ((Object) var4_ref_String), (byte) 124).hashCode(), var6, 106);
                      break L10;
                    }
                  }
                }
                L11: {
                  if (null != var6) {
                    break L11;
                  } else {
                    var6 = new ud();
                    wb.field_f.a((long)cc.a((CharSequence) ((Object) var4_ref_String), (byte) 95).hashCode(), var6, 96);
                    fieldTemp$1 = qi.field_q;
                    qi.field_q = qi.field_q + 1;
                    var6.field_Rb = fieldTemp$1;
                    og.field_j.a(var6, false);
                    break L11;
                  }
                }
                L12: {
                  if (var3 == null) {
                    break L12;
                  } else {
                    var3 = ((String) (var3)).intern();
                    break L12;
                  }
                }
                var6.field_Mb = var4_ref_String;
                var6.field_Ub = (String) (var3);
                var6.field_Vb = var5;
                var6.b(false);
                var7_ref = (ud) ((Object) og.field_j.c(false));
                L13: while (true) {
                  L14: {
                    L15: {
                      L16: {
                        if (null == var7_ref) {
                          break L16;
                        } else {
                          stackIn_59_0 = (ud) (var6);

                          stackIn_59_1 = 126;

                          stackIn_59_2 = (ud) (var7_ref);

                          if (var9 != 0) {
                            break L15;
                          } else {
                            if (!om.a(stackIn_59_0, (byte) stackIn_59_1, stackIn_59_2)) {
                              break L16;
                            } else {
                              var7_ref = (ud) ((Object) og.field_j.a((byte) -70));
                              if (var9 == 0) {
                                continue L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      L17: {
                        if (var7_ref != null) {
                          break L17;
                        } else {
                          og.field_j.a(var6, false);
                          if (var9 == 0) {
                            break L14;
                          } else {
                            break L17;
                          }
                        }
                      }
                      stackIn_59_0 = (ud) (var7_ref);
                      stackIn_59_1 = 10;
                      stackIn_59_2 = (ud) (var6);
                      break L15;
                    }
                    cl.a(stackIn_59_0, stackIn_59_1, stackIn_59_2);
                    break L14;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (-3 == (var2 ^ -1)) {
                  L18: {
                    if (1 != ji.field_Tb) {
                      break L18;
                    } else {
                      ji.field_Tb = 2;
                      break L18;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 != var2) {
                    if (4 == var2) {
                      ji.field_Tb = 1;
                      var3 = var1.g((byte) 81);
                      ul.field_e = ((String) (var3)).intern();
                      var4 = var1.d((byte) -99);
                      gd.d(var4, 3);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      fk.a(-97, (Throwable) null, "F1: " + hc.a(false));
                      mk.a(false);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    L19: {
                      if (2 != ji.field_Tb) {
                        break L19;
                      } else {
                        ji.field_Tb = 1;
                        break L19;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref), "wc.F(" + param0 + ')');
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
                  return;
                }
              }
            }
          }
        }
    }

    final Object g(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 22850) {
              stackIn_4_0 = this.field_F;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (Object) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "wc.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    wc(Object param0, int param1) {
        super(param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_F = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("wc.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static void i(int param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        RuntimeException runtimeException = null;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = c.field_m;
                        var2 = 0;
                        var3 = var1.length;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3 ^ -1) >= (var2 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$8 = var2;
                        var2++;
                        var1[incrementValue$8] = 0;
                        incrementValue$9 = var2;
                        var2++;
                        var1[incrementValue$9] = 0;
                        incrementValue$10 = var2;
                        var2++;
                        var1[incrementValue$10] = 0;
                        incrementValue$11 = var2;
                        var2++;
                        var1[incrementValue$11] = 0;
                        incrementValue$12 = var2;
                        var2++;
                        var1[incrementValue$12] = 0;
                        incrementValue$13 = var2;
                        var2++;
                        var1[incrementValue$13] = 0;
                        incrementValue$14 = var2;
                        var2++;
                        var1[incrementValue$14] = 0;
                        incrementValue$15 = var2;
                        var2++;
                        var1[incrementValue$15] = 0;
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 3) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        wc.c((byte) 12);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw oi.a((Throwable) ((Object) runtimeException), "wc.G(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 37) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "wc.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_E = new je();
        field_K = "Unfortunately you are not eligible to create an account.";
        field_H = "You have resigned and are offering a rematch.";
        field_G = "Connection timed out. Please try using a different server.";
    }
}
