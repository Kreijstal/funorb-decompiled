/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dfa {
    static java.applet.Applet field_e;
    static String field_a;
    static gb field_b;
    int field_d;
    int field_c;

    final static boolean a(int param0, boolean param1, int param2) {
        int var3 = 0;
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null == ifa.field_n) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (fna.field_h != 9) {
          if (fna.field_h != 10) {
            field_e = null;
            if (fna.field_h != 11) {
              return false;
            } else {
              if (ns.field_f) {
                L1: {
                  if (gm.field_n != 2) {
                    break L1;
                  } else {
                    if (ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
                L2: {
                  if (2 == gm.field_n) {
                    break L2;
                  } else {
                    if (var3 == 0) {
                      break L2;
                    } else {
                      return false;
                    }
                  }
                }
                L3: {
                  if (oj.i(-1)) {
                    var4 = null;
                    opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return true;
              } else {
                return false;
              }
            }
          } else {
            if (var3 != 0) {
              return false;
            } else {
              ola.e((byte) 113);
              return true;
            }
          }
        } else {
          if (sqa.a(uba.field_f, 110, fp.field_d, tba.field_g, bla.field_I)) {
            L4: {
              if (uba.field_f == 2) {
                break L4;
              } else {
                if (var3 == 0) {
                  break L4;
                } else {
                  return false;
                }
              }
            }
            return eca.a((byte) -121, uba.field_f, bla.field_I, fp.field_d, tba.field_g);
          } else {
            if (fna.field_h != 10) {
              field_e = null;
              if (fna.field_h == 11) {
                if (ns.field_f) {
                  if (gm.field_n == 2) {
                    if (ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                      L5: {
                        if (2 == gm.field_n) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            break L5;
                          } else {
                            return false;
                          }
                        }
                      }
                      L6: {
                        if (oj.i(-1)) {
                          var4 = null;
                          opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    if (2 != gm.field_n) {
                      if (var3 != 0) {
                        return false;
                      } else {
                        L7: {
                          if (oj.i(-1)) {
                            var4 = null;
                            opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        return true;
                      }
                    } else {
                      L8: {
                        if (oj.i(-1)) {
                          var4 = null;
                          opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              if (var3 != 0) {
                return false;
              } else {
                ola.e((byte) 113);
                return true;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        L0: {
          var3 = 118 % ((24 - param2) / 41);
          if (param0 >= 0) {
            break L0;
          } else {
            param0 = param1 + param0 % param1;
            break L0;
          }
        }
        if (param0 >= param1) {
          return param0 % param1;
        } else {
          return param0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= param2) {
                var8 = param2;
                var5_int = var8;
                L2: while (true) {
                  if (param1 <= var8) {
                    break L1;
                  } else {
                    vaa.field_a[var8][param0] = param3;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var5_int = param1;
                L3: while (true) {
                  if (param2 <= var5_int) {
                    break L1;
                  } else {
                    vaa.field_a[var5_int][param0] = param3;
                    var5_int++;
                    continue L3;
                  }
                }
              }
            }
            if (param4 == 0) {
              break L0;
            } else {
              var7 = null;
              String discarded$1 = dfa.a('N', (String) null, (String) null, 30);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "dfa.FC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void c() {
        int discarded$4 = 0;
        og.b();
        if (!(null == nma.field_l)) {
            int discarded$5 = 0;
            pq.a(nma.field_l);
        }
        int discarded$18 = 101;
        ola.f();
        pc.a(5);
        int discarded$39 = 0;
        rda.e();
        int discarded$46 = 0;
        if (!(!bl.b())) {
            ql.field_k.k(1, -2988);
            bl.a(0, -1);
        }
        int discarded$47 = 60;
        dea.a();
    }

    abstract boolean b(int param0);

    abstract void a(byte param0, boolean param1);

    abstract void a(boolean param0, boolean param1, int param2);

    public static void b() {
        field_b = null;
        field_e = null;
        field_a = null;
    }

    abstract void a(int param0);

    final static String a(char param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param1.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (param3 != var7) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param2.indexOf((int) param0, var8_int);
                  if (var8_int >= 0) {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (var10 < 0) {
                StringBuilder discarded$3 = var8.append(param2.substring(var9));
                stackOut_10_0 = var8.toString();
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                StringBuilder discarded$4 = var8.append(param2.substring(var9, var10));
                var9 = var10 + 1;
                StringBuilder discarded$5 = var8.append(param1);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("dfa.EC(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    abstract boolean a(int param0, char param1, int param2);

    abstract void a(byte param0);

    dfa(int param0) {
        ((dfa) this).field_c = param0;
        ((dfa) this).field_d = ((dfa) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Bruce";
        field_b = new gb();
    }
}
