/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends wd {
    static int field_B;
    static oh field_F;
    int field_C;
    private int field_E;
    private aj field_D;
    int field_G;

    public static void f(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -91) {
                break L1;
              } else {
                d.e((byte) 23);
                break L1;
              }
            }
            field_F = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "d.F(" + param0 + ')');
        }
    }

    final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -110) {
              stackOut_3_0 = ((d) this).field_D.a((byte) -117);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 74;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "d.G(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              var3_int = 59 / ((param0 - 11) / 56);
              if (0 > param1) {
                break L1;
              } else {
                if (param1 >= ((d) this).field_D.a((byte) -110)) {
                  break L1;
                } else {
                  stackOut_8_0 = ((d) this).field_D.a((byte) 112, param1);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "d.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                d.f((byte) 69);
                break L1;
              }
            }
            stackOut_3_0 = ((d) this).field_E;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "d.H(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var14 = Bounce.field_N;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_33_0 = 0;
              stackIn_34_0 = stackOut_33_0;
              break L0;
            } else {
              L1: {
                var8_int = -((d) this).field_C + param3 + -param2;
                var9 = ((d) this).field_k + -(((d) this).field_C * 2);
                if (~var8_int < ~var9) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var8_int >= 0) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var8_int = var8_int * ((d) this).field_E / var9;
                  if (param0 == 1) {
                    break L4;
                  } else {
                    if (param0 == 2) {
                      var10 = 2147483647;
                      var11 = -1;
                      var12 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (~var12 <= ~((d) this).field_D.a((byte) -127)) {
                              break L7;
                            } else {
                              var13 = ((d) this).field_D.a((byte) -101, var12) - var8_int;
                              var13 = var13 * var13;
                              stackOut_16_0 = var10;
                              stackIn_25_0 = stackOut_16_0;
                              stackIn_17_0 = stackOut_16_0;
                              if (var14 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  if (stackIn_17_0 > var13) {
                                    var10 = var13;
                                    var11 = var12;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                var12++;
                                if (var14 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          stackOut_24_0 = var11;
                          stackIn_25_0 = stackOut_24_0;
                          break L6;
                        }
                        L9: {
                          if (stackIn_25_0 < 0) {
                            break L9;
                          } else {
                            ((d) this).field_D.a(var11, true);
                            break L9;
                          }
                        }
                        if (var14 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                ((d) this).field_D.b(1, var8_int);
                break L3;
              }
              stackOut_31_0 = 1;
              stackIn_32_0 = stackOut_31_0;
              return stackIn_32_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var8;
            stackOut_35_1 = new StringBuilder().append("d.IA(").append(param0).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L10;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_34_0 != 0;
    }

    final static void a(String param0, boolean param1, String param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            gi.field_b = param2;
            ak.field_w = param0;
            fj.a(param1, sh.field_jb, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("d.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 0 + ')');
        }
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        ii var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        fb var5 = null;
        String var5_ref = null;
        String var6 = null;
        fb var6_ref = null;
        String var7 = null;
        fb var7_ref = null;
        int var8 = 0;
        int stackIn_11_0 = 0;
        fb stackIn_57_0 = null;
        fb stackIn_62_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        fb stackOut_56_0 = null;
        fb stackOut_61_0 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            var1_ref = jc.field_g;
            var2 = var1_ref.d((byte) -113);
            if (var2 == 0) {
              L1: {
                if (null != tk.field_b) {
                  break L1;
                } else {
                  tk.field_b = new hc(128);
                  bi.field_g = 0;
                  break L1;
                }
              }
              L2: {
                if (var1_ref.d((byte) -128) != 1) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var3_int = stackIn_11_0;
                var4_ref_String = var1_ref.b(true);
                if (var3_int != 0) {
                  String discarded$10 = var1_ref.b(true);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var5 = fl.a((byte) -128, var4_ref_String);
                var6 = var1_ref.b(true);
                int discarded$11 = 0;
                var7 = ce.a((CharSequence) (Object) var4_ref_String);
                if (null == var7) {
                  var7 = var4_ref_String;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var5 != null) {
                  break L5;
                } else {
                  var5 = fl.a((byte) -128, var6);
                  if (var5 != null) {
                    tk.field_b.a((long)var7.hashCode(), (ug) (Object) var5, -121);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (null == var5) {
                  var5 = new fb();
                  tk.field_b.a((long)var7.hashCode(), (ug) (Object) var5, -24);
                  int fieldTemp$12 = bi.field_g;
                  bi.field_g = bi.field_g + 1;
                  var5.field_mb = fieldTemp$12;
                  wg.field_v.a(1, (ai) (Object) var5);
                  break L6;
                } else {
                  break L6;
                }
              }
              var5.field_ob = var4_ref_String;
              return;
            } else {
              if (var2 != 1) {
                if (var2 == 2) {
                  L7: {
                    if (db.field_V == 1) {
                      db.field_V = 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return;
                } else {
                  if (var2 == 3) {
                    L8: {
                      if (db.field_V == 2) {
                        db.field_V = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    return;
                  } else {
                    if (var2 == 4) {
                      db.field_V = 1;
                      var3 = var1_ref.b(true);
                      u.field_d = var3.intern();
                      var4 = var1_ref.d((byte) -117);
                      int discarded$13 = 2;
                      ij.a(var4);
                      return;
                    } else {
                      ti.a((Throwable) null, (byte) 100, "F1: " + la.a(-114));
                      if (param0 <= -12) {
                        int discarded$14 = 18;
                        kc.a();
                        break L0;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                L9: {
                  if (null != lf.field_q) {
                    break L9;
                  } else {
                    lf.field_q = new hc(128);
                    kc.field_a = 0;
                    break L9;
                  }
                }
                L10: {
                  var3 = var1_ref.b(true);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var4_ref_String = var1_ref.b(true);
                  var5_ref = var1_ref.b(true);
                  int discarded$15 = 1;
                  var6_ref = hf.a(var4_ref_String);
                  if (null == var6_ref) {
                    int discarded$16 = 1;
                    var6_ref = hf.a(var5_ref);
                    if (var6_ref == null) {
                      break L11;
                    } else {
                      int discarded$17 = 0;
                      lf.field_q.a((long)ce.a((CharSequence) (Object) var4_ref_String).hashCode(), (ug) (Object) var6_ref, -127);
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var6_ref == null) {
                    var6_ref = new fb();
                    int discarded$18 = 0;
                    lf.field_q.a((long)ce.a((CharSequence) (Object) var4_ref_String).hashCode(), (ug) (Object) var6_ref, -121);
                    int fieldTemp$19 = kc.field_a;
                    kc.field_a = kc.field_a + 1;
                    var6_ref.field_mb = fieldTemp$19;
                    oa.field_b.a(1, (ai) (Object) var6_ref);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var6_ref.field_ob = var4_ref_String;
                var6_ref.field_kb = var3;
                var6_ref.c(2);
                var7_ref = (fb) (Object) oa.field_b.a((byte) -76);
                L14: while (true) {
                  L15: {
                    L16: {
                      if (null == var7_ref) {
                        break L16;
                      } else {
                        stackOut_56_0 = (fb) var7_ref;
                        stackIn_62_0 = stackOut_56_0;
                        stackIn_57_0 = stackOut_56_0;
                        if (var8 != 0) {
                          break L15;
                        } else {
                          if (!ja.a(stackIn_57_0, 200, var6_ref)) {
                            break L16;
                          } else {
                            var7_ref = (fb) (Object) oa.field_b.d((byte) -114);
                            if (var8 == 0) {
                              continue L14;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    stackOut_61_0 = (fb) var7_ref;
                    stackIn_62_0 = stackOut_61_0;
                    break L15;
                  }
                  L17: {
                    L18: {
                      if (stackIn_62_0 == null) {
                        break L18;
                      } else {
                        lf.a((ai) (Object) var7_ref, (ai) (Object) var6_ref, -17957);
                        if (var8 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    oa.field_b.a(1, (ai) (Object) var6_ref);
                    break L17;
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "d.B(" + param0 + ')');
        }
    }

    private d() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "d.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
    }
}
