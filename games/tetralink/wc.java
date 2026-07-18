/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Object;

final class wc extends mb {
    private Object field_F;
    static je field_E;
    static String field_H;
    static String field_K;
    static int field_J;
    static int field_I;
    static String field_G;
    static hl field_D;

    public static void c() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_H = null;
            field_K = null;
            field_G = null;
            field_E = null;
            field_D = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "wc.H(" + -103 + ')');
        }
    }

    final static void h() {
        RuntimeException var1 = null;
        bc var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ud var6 = null;
        String var7 = null;
        ud var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_11_0 = 0;
        ud stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        ud stackIn_49_2 = null;
        ud stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        ud stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        ud stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        ud stackOut_48_2 = null;
        ud stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        ud stackOut_57_2 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            var1_ref = kb.field_q;
            var2 = var1_ref.d((byte) -99);
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
                if (var1_ref.d((byte) -99) != 1) {
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
                L4: {
                  var3_int = stackIn_11_0;
                  var4_ref_String = var1_ref.g((byte) 81);
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
                var5 = var1_ref.g((byte) 81);
                break L3;
              }
              L5: {
                var6 = fh.a(-32055, var4_ref_String);
                var7 = var1_ref.g((byte) 81);
                var8 = cc.a((CharSequence) (Object) var4_ref_String, (byte) 98);
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
                    sd.field_nb.a((long)var8.hashCode(), (gb) (Object) var6, 105);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (var6 == null) {
                  var6 = new ud();
                  sd.field_nb.a((long)var8.hashCode(), (gb) (Object) var6, 113);
                  int fieldTemp$3 = ca.field_c;
                  ca.field_c = ca.field_c + 1;
                  var6.field_Rb = fieldTemp$3;
                  mm.field_s.a((mc) (Object) var6, false);
                  break L7;
                } else {
                  break L7;
                }
              }
              var6.field_Lb = var5;
              var6.field_Vb = var7;
              var6.field_Mb = var4_ref_String;
              return;
            } else {
              if (1 == var2) {
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
                  var3 = var1_ref.g((byte) 81);
                  if (!var3.equals((Object) (Object) "")) {
                    break L9;
                  } else {
                    var3 = null;
                    break L9;
                  }
                }
                L10: {
                  var4_ref_String = var1_ref.g((byte) 81);
                  var5 = var1_ref.g((byte) 81);
                  var6 = ke.a(var4_ref_String, false);
                  if (null != var6) {
                    break L10;
                  } else {
                    var6 = ke.a(var5, false);
                    if (null == var6) {
                      break L10;
                    } else {
                      wb.field_f.a((long)cc.a((CharSequence) (Object) var4_ref_String, (byte) 124).hashCode(), (gb) (Object) var6, 106);
                      break L10;
                    }
                  }
                }
                L11: {
                  if (null != var6) {
                    break L11;
                  } else {
                    var6 = new ud();
                    wb.field_f.a((long)cc.a((CharSequence) (Object) var4_ref_String, (byte) 95).hashCode(), (gb) (Object) var6, 96);
                    int fieldTemp$4 = qi.field_q;
                    qi.field_q = qi.field_q + 1;
                    var6.field_Rb = fieldTemp$4;
                    og.field_j.a((mc) (Object) var6, false);
                    break L11;
                  }
                }
                L12: {
                  if (var3 == null) {
                    break L12;
                  } else {
                    var3 = var3.intern();
                    break L12;
                  }
                }
                var6.field_Mb = var4_ref_String;
                var6.field_Ub = var3;
                var6.field_Vb = var5;
                var6.b(false);
                var7_ref = (ud) (Object) og.field_j.c(false);
                L13: while (true) {
                  L14: {
                    L15: {
                      L16: {
                        if (null == var7_ref) {
                          break L16;
                        } else {
                          stackOut_48_0 = (ud) var6;
                          stackOut_48_1 = 126;
                          stackOut_48_2 = (ud) var7_ref;
                          stackIn_59_0 = stackOut_48_0;
                          stackIn_59_1 = stackOut_48_1;
                          stackIn_59_2 = stackOut_48_2;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          stackIn_49_2 = stackOut_48_2;
                          if (var9 != 0) {
                            break L15;
                          } else {
                            if (!om.a(stackIn_49_0, (byte) stackIn_49_1, stackIn_49_2)) {
                              break L16;
                            } else {
                              var7_ref = (ud) (Object) og.field_j.a((byte) -70);
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
                          og.field_j.a((mc) (Object) var6, false);
                          if (var9 == 0) {
                            break L14;
                          } else {
                            break L17;
                          }
                        }
                      }
                      stackOut_57_0 = (ud) var7_ref;
                      stackOut_57_1 = 10;
                      stackOut_57_2 = (ud) var6;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_59_1 = stackOut_57_1;
                      stackIn_59_2 = stackOut_57_2;
                      break L15;
                    }
                    cl.a((mc) (Object) stackIn_59_0, stackIn_59_1, (mc) (Object) stackIn_59_2);
                    break L14;
                  }
                  return;
                }
              } else {
                if (var2 == 2) {
                  L18: {
                    if (1 != ji.field_Tb) {
                      break L18;
                    } else {
                      ji.field_Tb = 2;
                      break L18;
                    }
                  }
                  return;
                } else {
                  if (3 != var2) {
                    if (4 == var2) {
                      ji.field_Tb = 1;
                      var3 = var1_ref.g((byte) 81);
                      ul.field_e = var3.intern();
                      var4 = var1_ref.d((byte) -99);
                      gd.d(var4, 3);
                      return;
                    } else {
                      fk.a(-97, (Throwable) null, "F1: " + hc.a(false));
                      int discarded$5 = 0;
                      mk.a();
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
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "wc.F(" + 1 + ')');
        }
    }

    final Object g(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 22850) {
              stackOut_3_0 = ((wc) this).field_F;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "wc.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    wc(Object param0, int param1) {
        super(param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((wc) this).field_F = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wc.<init>(");
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
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static void i() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            var1 = c.field_m;
            var2 = 0;
            var3 = var1.length;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3 >= ~var2) {
                    break L3;
                  } else {
                    int incrementValue$24 = var2;
                    var2++;
                    var1[incrementValue$24] = 0;
                    int incrementValue$25 = var2;
                    var2++;
                    var1[incrementValue$25] = 0;
                    int incrementValue$26 = var2;
                    var2++;
                    var1[incrementValue$26] = 0;
                    int incrementValue$27 = var2;
                    var2++;
                    var1[incrementValue$27] = 0;
                    int incrementValue$28 = var2;
                    var2++;
                    var1[incrementValue$28] = 0;
                    int incrementValue$29 = var2;
                    var2++;
                    var1[incrementValue$29] = 0;
                    int incrementValue$30 = var2;
                    var2++;
                    var1[incrementValue$30] = 0;
                    int incrementValue$31 = var2;
                    var2++;
                    var1[incrementValue$31] = 0;
                    if (var4 != 0) {
                      break L2;
                    } else {
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1_ref, "wc.G(" + 3 + ')');
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 37) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
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
          throw oi.a((Throwable) (Object) var2, "wc.A(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new je();
        field_K = "Unfortunately you are not eligible to create an account.";
        field_H = "You have resigned and are offering a rematch.";
        field_G = "Connection timed out. Please try using a different server.";
    }
}
