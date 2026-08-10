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
        if (param0 != -50) {
            o var2 = (o) null;
            te.a(-56, 39, (o) null);
        }
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            ga.field_y = false;
            hl.field_e = false;
            if (param0 == -1) {
              L1: {
                L2: {
                  if (null == da.field_c) {
                    break L2;
                  } else {
                    if (da.field_c.field_K) {
                      L3: {
                        var3_int = 1;
                        if (param1 != 8) {
                          break L3;
                        } else {
                          L4: {
                            param1 = 2;
                            if (eb.field_m) {
                              param2 = n.field_fb;
                              break L4;
                            } else {
                              param2 = k.field_f;
                              break L4;
                            }
                          }
                          kb.field_O.a(lg.field_b, 10);
                          break L3;
                        }
                      }
                      L5: {
                        if ((param1 ^ -1) == -11) {
                          qk.d((byte) -80);
                          var3_int = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (var3_int == 0) {
                          break L6;
                        } else {
                          L7: {
                            if (!ga.field_y) {
                              break L7;
                            } else {
                              param2 = ni.a(new String[]{param2}, 0, ug.field_a);
                              break L7;
                            }
                          }
                          L8: {
                            if (ae.field_C) {
                              param2 = re.field_z;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          da.field_c.a(true, param2, param1);
                          break L6;
                        }
                      }
                      if (param1 == 256) {
                        break L2;
                      } else {
                        if (-11 == (param1 ^ -1)) {
                          break L2;
                        } else {
                          if (eb.field_m) {
                            break L2;
                          } else {
                            kb.field_O.h(param0 ^ -1);
                            break L1;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("te.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var1 = hl.field_d;
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
                  if (-1 >= (df.field_Q ^ -1)) {
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
                          nj.field_c[var2 ^ -1] = false;
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
          throw oj.a((Throwable) ((Object) var1_ref), "te.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, o param2) {
        pa var3 = null;
        if (param1 != 9082) {
            return;
        }
        try {
            var3 = dk.field_s;
            var3.d(25, param0);
            var3.d(param2.field_p, (byte) 122);
            var3.a(param2.field_o, (byte) 106);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "te.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new vf();
        field_a = "Player names can be up to 12 letters, numbers and underscores";
        field_c = "Reload game";
    }
}
