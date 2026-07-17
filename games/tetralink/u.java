/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    private ec field_f;
    private ah field_c;
    static String field_d;
    static int field_a;
    static hl field_b;
    static fg field_g;
    private ah field_e;

    public static void b(int param0) {
        if (param0 != 32768) {
          u.b(61);
          field_b = null;
          field_g = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(int param0) {
        if (cl.field_e) {
          if (param0 > 79) {
            if (sf.field_d != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            field_b = null;
            if (sf.field_d != 0) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static String a(int param0, fj param1) {
        Object var3_ref = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String stackIn_30_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var3_ref = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param0 == 18440) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              if (param1.field_e == null) {
                break L2;
              } else {
                L3: {
                  var5 = param1.field_e;
                  var2 = (Object) (Object) var5;
                  var3_ref = var2;
                  var2 = (Object) (Object) var5;
                  if (param1.field_k == 1) {
                    var2 = (Object) (Object) ("<img=0>" + var5);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (param1.field_k != 2) {
                  break L2;
                } else {
                  var2 = (Object) (Object) ("<img=1>" + var2);
                  var3_ref = var2;
                  var3_ref = var2;
                  break L2;
                }
              }
            }
            L4: {
              var3 = "";
              if (param1.field_i == 2) {
                if (!param1.field_l) {
                  L5: {
                    if (param1.field_g != 0) {
                      break L5;
                    } else {
                      if (0 != param1.field_s) {
                        break L5;
                      } else {
                        var3 = sk.a(new String[1], vd.field_b, 119);
                        break L4;
                      }
                    }
                  }
                  var3 = sk.a(new String[1], mc.field_h, param0 ^ 18544);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                L6: {
                  if (0 != param1.field_i) {
                    break L6;
                  } else {
                    if (!go.field_c) {
                      break L6;
                    } else {
                      var3 = "[" + nm.field_v + "] ";
                      break L6;
                    }
                  }
                }
                L7: {
                  if (param1.field_i != 1) {
                    break L7;
                  } else {
                    var3 = "[" + sk.a(new String[1], qe.field_e, 127) + "] ";
                    break L7;
                  }
                }
                L8: {
                  if (param1.field_i != 4) {
                    break L8;
                  } else {
                    if (ec.field_h == null) {
                      break L8;
                    } else {
                      var3 = "[" + ec.field_h + "] ";
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param1.field_i != 3) {
                    break L9;
                  } else {
                    var3 = "[#" + param1.field_c + "] ";
                    break L9;
                  }
                }
                if (!param1.field_l) {
                  var3 = var3 + var2 + ": ";
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            stackOut_29_0 = (String) var3;
            stackIn_30_0 = stackOut_29_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_31_0 = var2;
            stackOut_31_1 = new StringBuilder().append("u.D(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
        return stackIn_30_0;
    }

    final j a(int param0, int param1) {
        j var3 = null;
        byte[] var4 = null;
        j var5 = null;
        j var6 = null;
        var3 = (j) ((u) this).field_f.a((byte) 119, (long)param0);
        if (var3 == null) {
          L0: {
            if (param0 < 32768) {
              var4 = ((u) this).field_e.a(22, param0, 1);
              break L0;
            } else {
              var4 = ((u) this).field_c.a(-107, param0 & 32767, 1);
              break L0;
            }
          }
          if (param1 < -125) {
            L1: {
              var6 = new j();
              if (var4 != null) {
                var6.a(new bh(var4), 15067);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 >= 32768) {
              var6.g(25271);
              ((u) this).field_f.a((Object) (Object) var6, (long)param0, (byte) 50);
              return var6;
            } else {
              ((u) this).field_f.a((Object) (Object) var6, (long)param0, (byte) 50);
              return var6;
            }
          } else {
            L2: {
              j discarded$1 = ((u) this).a(-123, -16);
              var5 = new j();
              if (var4 != null) {
                var5.a(new bh(var4), 15067);
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 < 32768) {
              ((u) this).field_f.a((Object) (Object) var5, (long)param0, (byte) 50);
              return var5;
            } else {
              var5.g(25271);
              ((u) this).field_f.a((Object) (Object) var5, (long)param0, (byte) 50);
              return var5;
            }
          }
        } else {
          return var3;
        }
    }

    u(int param0, ah param1, ah param2, sm param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        ((u) this).field_f = new ec(64);
        try {
          L0: {
            L1: {
              ((u) this).field_c = param2;
              ((u) this).field_e = param1;
              if (((u) this).field_e == null) {
                break L1;
              } else {
                int discarded$4 = ((u) this).field_e.b(-23126, 1);
                break L1;
              }
            }
            if (null != ((u) this).field_c) {
              int discarded$5 = ((u) this).field_c.b(-23126, 1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("u.<init>(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Play free version";
    }
}
