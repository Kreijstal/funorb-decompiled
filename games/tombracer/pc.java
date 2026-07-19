/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    int field_c;
    int field_d;
    pc field_h;
    boolean field_l;
    int field_e;
    int field_i;
    int field_b;
    static String field_g;
    int field_a;
    int field_j;
    int field_k;
    int field_f;

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 5) {
            break L0;
          } else {
            pc.a(-47);
            break L0;
          }
        }
        if (wna.field_n == null) {
          return;
        } else {
          var1 = wna.field_n;
          synchronized (var1) {
            L1: {
              wna.field_n = null;
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = param2;
        this.field_c = param1;
        this.field_e = param1;
        this.field_a = param3;
        if (param4 != 44) {
          return;
        } else {
          this.field_f = param3;
          this.field_d = param0;
          return;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_g = null;
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        bb var5 = null;
        var3 = this.field_e + -this.field_d;
        var4 = this.field_a + -this.field_k;
        this.field_e = this.field_d - -gqa.a(param0, (byte) 24, var3);
        if (param1 != 47) {
          var5 = (bb) null;
          pc.a(false, -126, (bb) null);
          this.field_a = this.field_k + gqa.a(param0, (byte) 24, var4);
          return;
        } else {
          this.field_a = this.field_k + gqa.a(param0, (byte) 24, var4);
          return;
        }
    }

    final static void a(boolean param0, int param1, bb param2) {
        kh var3 = null;
        try {
            var3 = ql.field_k;
            if (param0) {
                field_g = (String) null;
            }
            var3.k(param1, -2988);
            var3.i(5, 0);
            var3.i(0, 0);
            var3.f(-1477662136, param2.field_n);
            var3.i(param2.field_j, 0);
            var3.i(param2.field_i, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pc.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static bfa a(ela[] param0, int param1, String param2, bfa[] param3) throws rv {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        StringBuilder var9 = null;
        bfa stackIn_5_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        bfa stackOut_4_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              L2: {
                if (var4_int >= param0.length) {
                  break L2;
                } else {
                  if (!param0[var4_int].a(-120, param2, param3)) {
                    var4_int++;
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  } else {
                    stackOut_4_0 = param0[var4_int].a(param3, 0);
                    stackIn_5_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
              var8 = new StringBuilder("The method " + param2 + "(");
              var9 = var8;
              var5 = 33 % ((param1 - -53) / 54);
              var6 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (var6 >= param3.length) {
                      break L5;
                    } else {
                      if (var7 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            if (param3[var6].field_a) {
                              break L7;
                            } else {
                              discarded$4 = var8.append(rva.a(param3[var6].field_d.getClass(), (byte) -88));
                              if (var7 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          discarded$5 = var8.append(jd.a(param3[var6].field_d, 0).toString());
                          break L6;
                        }
                        L8: {
                          if (-1 + param3.length <= var6) {
                            break L8;
                          } else {
                            discarded$6 = var9.append(',');
                            break L8;
                          }
                        }
                        var6++;
                        if (var7 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  discarded$7 = var9.append(") is undefined.");
                  break L4;
                }
                throw new rv(var9.toString());
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("pc.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          L10: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          L11: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_5_0;
    }

    static {
        field_g = "Cancel draw";
    }
}
