/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static String field_b;
    private bb field_a;
    static tf field_f;
    private fa field_e;
    static int field_c;
    static boolean field_d;

    final fa a(byte param0) {
        fa var2 = ((nm) this).field_e;
        if (var2 == ((nm) this).field_a.field_f) {
            ((nm) this).field_e = null;
            return null;
        }
        ((nm) this).field_e = var2.field_a;
        if (param0 != -104) {
            return null;
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_f = null;
    }

    final fa d(int param0) {
        fa var2 = ((nm) this).field_a.field_f.field_a;
        if (param0 != 0) {
            field_b = null;
        }
        if (((nm) this).field_a.field_f == var2) {
            ((nm) this).field_e = null;
            return null;
        }
        ((nm) this).field_e = var2.field_a;
        return var2;
    }

    final static void c() {
        RuntimeException var1 = null;
        uj var1_ref = null;
        eq var1_ref2 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1_ref = (uj) (Object) i.field_n.c(1504642273);
            L1: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (eq) (Object) nk.field_a.c(1504642273);
                L2: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (uj) (Object) wi.field_a.c(1504642273);
                    L3: while (true) {
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        L4: {
                          if (var1_ref.field_Tb <= 0) {
                            break L4;
                          } else {
                            var1_ref.field_Tb = var1_ref.field_Tb - 1;
                            if (var1_ref.field_Tb == 0) {
                              var1_ref.field_Eb = 0;
                              if (!var1_ref.b((byte) -116)) {
                                break L4;
                              } else {
                                var1_ref.c(2779);
                                break L4;
                              }
                            } else {
                              var1_ref = (uj) (Object) wi.field_a.f(1504642273);
                              continue L3;
                            }
                          }
                        }
                        var1_ref = (uj) (Object) wi.field_a.f(1504642273);
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      if (-1 > var1_ref2.field_Rb) {
                        var1_ref2.field_Rb = var1_ref2.field_Rb - 1;
                        if (-1 == var1_ref2.field_Rb) {
                          var1_ref2.field_Qb = 0;
                          if (!var1_ref2.j(433)) {
                            break L5;
                          } else {
                            var1_ref2.c(2779);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var1_ref2 = (eq) (Object) nk.field_a.f(1504642273);
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if (var1_ref.field_Tb <= 0) {
                    break L6;
                  } else {
                    var1_ref.field_Tb = var1_ref.field_Tb - 1;
                    if (var1_ref.field_Tb != 0) {
                      break L6;
                    } else {
                      var1_ref.field_Eb = 0;
                      if (var1_ref.b((byte) 109)) {
                        var1_ref.c(2779);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var1_ref = (uj) (Object) i.field_n.f(1504642273);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "nm.I(" + -1 + ')');
        }
    }

    final fa b(byte param0, fa param1) {
        fa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        fa stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        fa stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = ((nm) this).field_a.field_f.field_a;
                break L1;
              }
            }
            if (((nm) this).field_a.field_f != var3) {
              ((nm) this).field_e = var3.field_a;
              if (param0 < -72) {
                stackOut_9_0 = (fa) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (fa) (Object) stackIn_8_0;
              }
            } else {
              ((nm) this).field_e = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (fa) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("nm.H(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static void b() {
        Object var2 = null;
        al.a("", -110, (String) null);
    }

    final fa e(int param0) {
        fa var2 = ((nm) this).field_e;
        if (!(((nm) this).field_a.field_f != var2)) {
            ((nm) this).field_e = null;
            return null;
        }
        if (param0 > -56) {
            return null;
        }
        ((nm) this).field_e = var2.field_h;
        return var2;
    }

    final fa a(byte param0, fa param1) {
        fa var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        Object stackIn_6_0 = null;
        fa stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        fa stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = ((nm) this).field_a.field_f.field_h;
                break L1;
              }
            }
            if (var3 == ((nm) this).field_a.field_f) {
              ((nm) this).field_e = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (fa) (Object) stackIn_6_0;
            } else {
              L2: {
                ((nm) this).field_e = var3.field_h;
                if (param0 == -99) {
                  break L2;
                } else {
                  var4 = null;
                  fa discarded$2 = ((nm) this).b((byte) -11, (fa) null);
                  break L2;
                }
              }
              stackOut_9_0 = (fa) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("nm.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param1 >= 18) {
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= param0.length()) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  L2: {
                    var3 = param0.charAt(var2_int);
                    if (tk.a(-66, (char) var3)) {
                      break L2;
                    } else {
                      if (!ti.a(57, (char) var3)) {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("nm.K(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final fa b(int param0) {
        if (param0 != -1) {
            field_c = 52;
        }
        fa var2 = ((nm) this).field_a.field_f.field_h;
        if (var2 == ((nm) this).field_a.field_f) {
            ((nm) this).field_e = null;
            return null;
        }
        ((nm) this).field_e = var2.field_h;
        return var2;
    }

    final static void a() {
        if (fc.field_e == ti.field_t) {
            return;
        }
        if (!(!tk.a((byte) -104, fc.field_e))) {
            wo.b(126, fc.field_e).a(true);
        }
        fc.field_e = ti.field_t;
        if (og.field_l) {
            og.field_l = false;
            qo.field_r = null;
            ro.field_e = null;
        }
        ec.field_t = 0;
        if (!(!ce.field_a)) {
            wh.field_p = null;
            nj.field_h = new bb();
            go.field_k = 0;
            ce.field_a = false;
            de.field_n = 0;
        }
        if (!(!mi.field_o)) {
            int discarded$0 = 0;
            ak.i();
            int discarded$1 = 23949;
            kj.a();
            int discarded$2 = -1;
            bd.a();
            mi.field_o = false;
        }
    }

    nm(bb param0) {
        try {
            ((nm) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Clan";
        field_d = false;
        field_c = 0;
    }
}
