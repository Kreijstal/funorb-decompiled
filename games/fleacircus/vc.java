/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    lh field_e;
    static int field_d;
    static boolean field_b;
    static int field_f;
    private lh field_c;
    static int field_a;
    static String field_g;

    final lh c(byte param0) {
        lh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        lh stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        lh stackOut_8_0 = null;
        try {
          L0: {
            var2 = ((vc) this).field_e.field_h;
            if (var2 == ((vc) this).field_e) {
              ((vc) this).field_c = null;
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (lh) (Object) stackIn_4_0;
            } else {
              L1: {
                ((vc) this).field_c = var2.field_h;
                if (param0 == 47) {
                  break L1;
                } else {
                  field_b = true;
                  break L1;
                }
              }
              stackOut_8_0 = (lh) var2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "vc.L(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final lh a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        lh var3 = null;
        Object stackIn_4_0 = null;
        lh stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        lh stackOut_5_0 = null;
        try {
          L0: {
            var2_int = 3 / ((28 - param0) / 36);
            var3 = ((vc) this).field_e.field_a;
            if (((vc) this).field_e == var3) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (lh) (Object) stackIn_4_0;
            } else {
              var3.c(-1);
              stackOut_5_0 = (lh) var3;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "vc.M(" + param0 + ')');
        }
        return stackIn_6_0;
    }

    final void b(boolean param0, lh param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_a == null) {
                break L1;
              } else {
                param1.c(-1);
                break L1;
              }
            }
            L2: {
              param1.field_a = ((vc) this).field_e;
              param1.field_h = ((vc) this).field_e.field_h;
              param1.field_a.field_h = param1;
              if (param0) {
                break L2;
              } else {
                ((vc) this).a(true, (lh) null);
                break L2;
              }
            }
            param1.field_h.field_a = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("vc.G(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final lh b(int param0) {
        lh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        lh stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        lh stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var2 = ((vc) this).field_e.field_a;
            if (((vc) this).field_e != var2) {
              ((vc) this).field_c = var2.field_a;
              if (param0 <= -33) {
                stackOut_6_0 = (lh) var2;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (lh) (Object) stackIn_5_0;
              }
            } else {
              ((vc) this).field_c = null;
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (lh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "vc.E(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final lh b(byte param0) {
        lh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        lh stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        lh stackOut_8_0 = null;
        try {
          L0: {
            L1: {
              var2 = ((vc) this).field_c;
              if (param0 == -105) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            if (var2 == ((vc) this).field_e) {
              ((vc) this).field_c = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (lh) (Object) stackIn_7_0;
            } else {
              ((vc) this).field_c = var2.field_h;
              stackOut_8_0 = (lh) var2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "vc.J(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(byte param0, rh param1) {
        RuntimeException var2 = null;
        ih var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        si var6 = null;
        int[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_ref = new ih(param1.a(0, "", "logo.fo3d"));
            var3 = var2_ref.e(false);
            var2_ref.k(8);
            fc.field_a = fleas.a(var2_ref, -6383);
            ij.field_F = new si[var3];
            gm.field_kb = new int[var3][];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 <= var4) {
                    break L3;
                  } else {
                    ij.field_F[var4] = d.a(-124, var2_ref);
                    var4++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_ref.m(8);
                var4 = 17 % ((param0 - 75) / 44);
                break L2;
              }
              var5 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3 <= var5) {
                      break L6;
                    } else {
                      var6 = ij.field_F[var5];
                      var6.a(6, 1, 6, 6, 0);
                      var6.b(-23443);
                      var7 = new int[]{var6.field_m - -var6.field_B >> -547659167, var6.field_e + var6.field_k >> -1483446015, var6.field_A + var6.field_b >> -1092895903};
                      gm.field_kb[var5] = var7;
                      var6.a(-var7[1], -var7[0], -var7[2], (byte) -82);
                      var5++;
                      if (var8 != 0) {
                        break L5;
                      } else {
                        if (var8 == 0) {
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
          L7: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("vc.H(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L7;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final lh c(int param0) {
        lh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        lh stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        lh stackOut_8_0 = null;
        try {
          L0: {
            L1: {
              if (param0 > 3) {
                break L1;
              } else {
                field_d = -51;
                break L1;
              }
            }
            var2 = ((vc) this).field_c;
            if (var2 == ((vc) this).field_e) {
              ((vc) this).field_c = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (lh) (Object) stackIn_7_0;
            } else {
              ((vc) this).field_c = var2.field_a;
              stackOut_8_0 = (lh) var2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "vc.K(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final void a(boolean param0, lh param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (null == param1.field_a) {
                break L1;
              } else {
                param1.c(-1);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                field_b = false;
                break L2;
              }
            }
            param1.field_h = ((vc) this).field_e;
            param1.field_a = ((vc) this).field_e.field_a;
            param1.field_a.field_h = param1;
            param1.field_h.field_a = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("vc.C(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~param2 <= ~param0) {
                break L1;
              } else {
                var3_int = param2;
                param2 = param0;
                param0 = var3_int;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (param0 == 0) {
                    break L4;
                  } else {
                    var3_int = param2 % param0;
                    param2 = param0;
                    param0 = var3_int;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (param1 == -1) {
                  break L3;
                } else {
                  stackOut_9_0 = -66;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
              stackOut_11_0 = param2;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "vc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final lh e(int param0) {
        lh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        lh stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        lh stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var2 = ((vc) this).field_e.field_h;
            if (var2 != ((vc) this).field_e) {
              if (param0 == -22033) {
                var2.c(-1);
                stackOut_6_0 = (lh) var2;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (lh) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (lh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "vc.F(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final void f(int param0) {
        RuntimeException runtimeException = null;
        lh var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    var2 = ((vc) this).field_e.field_h;
                    if (((vc) this).field_e != var2) {
                      break L4;
                    } else {
                      if (var3 != 0) {
                        break L3;
                      } else {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var2.c(-1);
                  break L3;
                }
                if (var3 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
              L5: {
                if (param0 == 1) {
                  break L5;
                } else {
                  field_a = 42;
                  break L5;
                }
              }
              ((vc) this).field_c = null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) (Object) runtimeException, "vc.A(" + param0 + ')');
        }
    }

    public vc() {
        ((vc) this).field_e = new lh();
        try {
            ((vc) this).field_e.field_h = ((vc) this).field_e;
            ((vc) this).field_e.field_a = ((vc) this).field_e;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "vc.<init>()");
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1092895903) {
                break L1;
              } else {
                lh discarded$2 = ((vc) this).b((byte) -25);
                break L1;
              }
            }
            L2: {
              if (((vc) this).field_e.field_h != ((vc) this).field_e) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "vc.I(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void d(int param0) {
        try {
            field_g = null;
            if (param0 != -29943) {
                field_g = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "vc.D(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_g = "You can quickly switch between left slopes, right slopes and blocks by pressing the keys 1, 2 and 3 respectively";
    }
}
