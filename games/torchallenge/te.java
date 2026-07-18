/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static ka field_e;
    static vf field_b;
    static String field_a;
    static String field_c;
    static byte[] field_d;

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            ga.field_y = false;
            hl.field_e = false;
            L1: {
              if (null == da.field_c) {
                break L1;
              } else {
                if (da.field_c.field_K) {
                  L2: {
                    var3_int = 1;
                    if (param1 != 8) {
                      break L2;
                    } else {
                      L3: {
                        param1 = 2;
                        if (eb.field_m) {
                          param2 = n.field_fb;
                          break L3;
                        } else {
                          param2 = k.field_f;
                          break L3;
                        }
                      }
                      kb.field_O.a(lg.field_b, 10);
                      break L2;
                    }
                  }
                  L4: {
                    if (param1 == 10) {
                      qk.d((byte) -80);
                      var3_int = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (!ga.field_y) {
                          break L6;
                        } else {
                          param2 = ni.a(new String[1], 0, ug.field_a);
                          break L6;
                        }
                      }
                      L7: {
                        if (ae.field_C) {
                          param2 = re.field_z;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      da.field_c.a(true, param2, param1);
                      break L5;
                    }
                  }
                  if (param1 == 256) {
                    break L1;
                  } else {
                    if (param1 == 10) {
                      break L1;
                    } else {
                      if (eb.field_m) {
                        break L1;
                      } else {
                        kb.field_O.h(0);
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("te.C(").append(-1).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) hl.field_d;
            synchronized (var1) {
              L1: {
                L2: {
                  ja.field_f = kc.field_n;
                  if (param0 == -11) {
                    break L2;
                  } else {
                    te.a(-52);
                    break L2;
                  }
                }
                L3: {
                  vf.field_a = vf.field_a + 1;
                  if (df.field_Q >= 0) {
                    L4: while (true) {
                      if (qa.field_a == df.field_Q) {
                        break L3;
                      } else {
                        var2 = bb.field_g[qa.field_a];
                        qa.field_a = qa.field_a - -1 & 127;
                        if (0 <= var2) {
                          nj.field_c[var2] = true;
                          continue L4;
                        } else {
                          nj.field_c[~var2] = false;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L5: while (true) {
                      if (var2 >= 112) {
                        df.field_Q = qa.field_a;
                        break L3;
                      } else {
                        nj.field_c[var2] = false;
                        var2++;
                        continue L5;
                      }
                    }
                  }
                }
                kc.field_n = b.field_M;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1_ref, "te.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, o param2) {
        pa var3 = null;
        try {
            var3 = dk.field_s;
            var3.d(25, param0);
            var3.d(param2.field_p, (byte) 122);
            var3.a(param2.field_o, (byte) 106);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "te.A(" + param0 + ',' + 9082 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new vf();
        field_a = "Player names can be up to 12 letters, numbers and underscores";
        field_c = "Reload game";
    }
}
