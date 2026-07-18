/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static nd field_q;
    byte[] field_m;
    static bd field_p;
    int field_d;
    static bd field_j;
    int field_c;
    int field_h;
    byte[] field_n;
    int field_b;
    int field_g;
    int field_o;
    static bd field_f;
    int field_e;
    static boolean field_l;
    static boolean field_k;
    static String field_a;
    static byte[][] field_i;

    public static void a(boolean param0) {
        field_q = null;
        field_a = null;
        field_p = null;
        field_f = null;
        field_j = null;
        field_i = null;
    }

    final static void a() {
        bd var1 = null;
        bd var2 = null;
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        try {
            var1 = new bd(540, 140);
            sb.a(var1, -118);
            ge.b();
            si.d();
            tk.field_e = 0;
            uc.b(-40);
            var2 = var1.h();
            for (var3 = 0; var3 < 15; var3++) {
                var2.a(-2, -2, 16777215);
                si.d(4, 4, 0, 0, 540, 140);
            }
            ti.field_c.a();
            var1.f(0, 0);
            int discarded$0 = 0;
            eh.b();
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "pl.C(" + -16183 + ')');
        }
    }

    final static void a(byte param0, oj param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1.field_n) {
                  break L2;
                } else {
                  L3: {
                    if (0 < ln.field_a.field_i[param2]) {
                      break L3;
                    } else {
                      if (0 < ln.field_a.field_i[-1 + param2]) {
                        break L3;
                      } else {
                        if (ln.field_a.field_i[-ln.field_a.field_d + (param2 - 1)] > 0) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  param1.field_n = true;
                  break L1;
                }
              }
              if (!param1.field_n) {
                break L1;
              } else {
                if (0 >= nl.field_d) {
                  break L1;
                } else {
                  L4: {
                    if (al.field_Q < 160) {
                      al.field_Q = al.field_Q + 50;
                      jh.a(3 * uh.field_i / 2, (byte) 69, 41, jc.field_c, 6);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  param1.a(false, 0, 21963, 1, rl.field_c, param1.field_j);
                  param1.field_l.a(0.9, 0.9, 1);
                  mm.field_m[el.field_j] = new oj(param1.field_j, 232, rl.field_c);
                  mm.field_m[el.field_j].field_e = 250;
                  mm.field_m[el.field_j].field_b = false;
                  mm.field_m[el.field_j].field_w = 0;
                  el.field_j = el.field_j + 1;
                  return;
                }
              }
            }
            L5: {
              L6: {
                if (-1 > param1.field_I) {
                  break L6;
                } else {
                  if (-6 == param1.field_w) {
                    break L6;
                  } else {
                    L7: {
                      if (al.field_Q < 160) {
                        al.field_Q = al.field_Q + 50;
                        jh.a(uh.field_i * 3 / 2, (byte) 41, 41, jc.field_c, 6);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    param1.field_z = 0;
                    param1.field_w = 5;
                    param1.e((byte) -49);
                    if (ln.field_a.field_c[param2] != 4) {
                      break L5;
                    } else {
                      ln.field_a.field_c[param2] = 0;
                      break L5;
                    }
                  }
                }
              }
              if (-1 <= param1.field_I) {
                break L5;
              } else {
                L8: {
                  if (-1 == ln.field_a.field_c[param2]) {
                    break L8;
                  } else {
                    if (1 != ln.field_a.field_c[param2]) {
                      break L5;
                    } else {
                      break L8;
                    }
                  }
                }
                ln.field_a.field_c[param2] = 4;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("pl.D(").append(126).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = param2.length();
              if (1 > var3_int) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = mf.a(false, param2);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (var4.length() >= 1) {
                        L2: {
                          if (rg.a((byte) -109, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!rg.a((byte) -109, var4.charAt(-1 + var4.length()))) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param2.length() <= var6) {
                                  if (0 >= var5) {
                                    stackOut_33_0 = 1;
                                    stackIn_34_0 = stackOut_33_0;
                                    break L0;
                                  } else {
                                    stackOut_31_0 = 0;
                                    stackIn_32_0 = stackOut_31_0;
                                    return stackIn_32_0 != 0;
                                  }
                                } else {
                                  L4: {
                                    var7 = param2.charAt(var6);
                                    if (!rg.a((byte) -109, (char) var7)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (2 > var5) {
                                      break L5;
                                    } else {
                                      if (param0) {
                                        break L5;
                                      } else {
                                        stackOut_27_0 = 0;
                                        stackIn_28_0 = stackOut_27_0;
                                        return stackIn_28_0 != 0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("pl.A(").append(param0).append(',').append(12864).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
        return stackIn_34_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new nd(9, 0, 4, 1);
        field_l = false;
        field_k = false;
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_i = new byte[250][];
    }
}
