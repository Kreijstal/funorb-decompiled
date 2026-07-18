/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    private gj field_b;
    private int field_f;
    private de field_d;
    static String field_a;
    private int field_c;
    static boolean[] field_g;
    static int field_e;

    final Object a(byte param0, long param1) {
        ag var6 = null;
        ig var7 = (ig) (Object) ((di) this).field_b.a(false, param1);
        if (var7 == null) {
            return null;
        }
        Object var5 = var7.e(1);
        if (param0 < 60) {
            Object discarded$0 = ((di) this).a((byte) 14, 32L);
        }
        if (!(var5 != null)) {
            var7.a(false);
            var7.b(false);
            ((di) this).field_c = ((di) this).field_c + var7.field_p;
            return null;
        }
        if (var7.d(-9861)) {
            var6 = new ag(var5, var7.field_p);
            ((di) this).field_b.a(var7.field_e, (wl) (Object) var6, (byte) -106);
            ((di) this).field_d.a((rk) (Object) var6, 10);
            ((ig) (Object) var6).field_o = 0L;
            var7.a(false);
            var7.b(false);
        } else {
            ((di) this).field_d.a((rk) (Object) var7, 10);
            var7.field_o = 0L;
        }
        return var5;
    }

    public static void b() {
        field_a = null;
        int var1 = 4;
        field_g = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        ai.a(param1, (byte) 126, (String) null, param0);
        if (param2 <= 106) {
            String discarded$0 = di.a(-92L, -11);
        }
    }

    final void a(long param0, int param1, Object param2) {
        try {
            this.a((byte) -30, param1, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "di.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(String[] args, byte param1, String param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param2.indexOf("<%", var5);
              if (0 > var6_int) {
                var6 = new StringBuilder(var4);
                if (param1 >= 24) {
                  var7 = 0;
                  var5 = 0;
                  L2: while (true) {
                    var8 = param2.indexOf("<%", var5);
                    if (0 <= var8) {
                      var5 = var8 - -2;
                      L3: while (true) {
                        L4: {
                          if (var5 >= var3_int) {
                            break L4;
                          } else {
                            int discarded$5 = -5717;
                            if (!vl.a(param2.charAt(var5))) {
                              break L4;
                            } else {
                              var5++;
                              continue L3;
                            }
                          }
                        }
                        var9 = param2.substring(2 + var8, var5);
                        if (af.a((CharSequence) (Object) var9, (byte) 78)) {
                          if (var5 >= var3_int) {
                            continue L2;
                          } else {
                            if (62 != param2.charAt(var5)) {
                              continue L2;
                            } else {
                              var5++;
                              var10 = ph.a(1124, (CharSequence) (Object) var9);
                              StringBuilder discarded$6 = var6.append(param2.substring(var7, var8));
                              var7 = var5;
                              StringBuilder discarded$7 = var6.append(args[var10]);
                              continue L2;
                            }
                          }
                        } else {
                          continue L2;
                        }
                      }
                    } else {
                      StringBuilder discarded$8 = var6.append(param2.substring(var7));
                      stackOut_26_0 = var6.toString();
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    }
                  }
                } else {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  return (String) (Object) stackIn_13_0;
                }
              } else {
                var5 = 2 + var6_int;
                L5: while (true) {
                  L6: {
                    if (var3_int <= var5) {
                      break L6;
                    } else {
                      int discarded$9 = -5717;
                      if (!vl.a(param2.charAt(var5))) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var7_ref_String = param2.substring(var6_int - -2, var5);
                  if (!af.a((CharSequence) (Object) var7_ref_String, (byte) 78)) {
                    continue L1;
                  } else {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param2.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = ph.a(1124, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (args[var8].length() + -var5 + var6_int);
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("di.A(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (args == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          L8: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
        return stackIn_27_0;
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = wizardrun.field_H;
        if (param0 <= 0L) {
            return null;
        }
        if (param0 >= 6582952005840035281L) {
            return null;
        }
        if (param0 % 37L == 0L) {
            return null;
        }
        if (param1 < 32) {
            di.a(true, false, -92);
        }
        int var3 = 0;
        long var4 = param0;
        while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = jk.field_c[(int)(-(37L * param0) + var7)];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append((char) var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static void a(int param0) {
        mg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = wizardrun.field_H;
        try {
          L0: {
            var1 = n.field_b;
            L1: while (true) {
              int discarded$9 = 125;
              if (!ac.a()) {
                break L0;
              } else {
                var1.c((byte) 49, 8);
                int fieldTemp$10 = var1.field_m + 1;
                var1.field_m = var1.field_m + 1;
                var2 = fieldTemp$10;
                kb.a(39, var1);
                n.field_b.a(-var2 + var1.field_m, -57);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1_ref, "di.E(" + 8 + ')');
        }
    }

    private final void b(long param0, int param1) {
        if (param1 <= 75) {
            this.b(26L, 18);
        }
        ig var4 = (ig) (Object) ((di) this).field_b.a(false, param0);
        this.a(var4, -111);
    }

    private final void a(ig param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                param0.a(false);
                param0.b(false);
                ((di) this).field_c = ((di) this).field_c + param0.field_p;
                break L1;
              }
            }
            L2: {
              if (param1 < -16) {
                break L2;
              } else {
                var4 = null;
                String discarded$2 = di.a((String[]) null, (byte) -84, (String) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("di.H(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private di() throws Throwable {
        throw new Error();
    }

    final static void a(of param0, int param1) {
        mg var3 = null;
        try {
            var3 = n.field_b;
            var3.c((byte) 124, param1);
            var3.b((byte) 11, param0.field_j);
            var3.b((byte) 11, param0.field_i);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "di.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + -81 + ')');
        }
    }

    final static void a() {
        if (!(ki.field_E != null)) {
            return;
        }
        int discarded$0 = 8053;
        ka.a((java.awt.Canvas) (Object) ki.field_E);
        ki.field_E.a(ld.field_g, (byte) 19);
        ki.field_E = null;
        if (!(oa.field_c == null)) {
            oa.field_c.a(127);
        }
        wizardrun.field_G.requestFocus();
    }

    private final void a(byte param0, int param1, long param2, Object param3) {
        ig var6 = null;
        ag var6_ref = null;
        int var7 = wizardrun.field_H;
        try {
            if (param1 > ((di) this).field_f) {
                throw new IllegalStateException();
            }
            this.b(param2, 104);
            ((di) this).field_c = ((di) this).field_c - param1;
            while (((di) this).field_c < 0) {
                var6 = (ig) (Object) ((di) this).field_d.b((byte) -115);
                this.a(var6, -26);
            }
            var6_ref = new ag(param3, param1);
            ((di) this).field_b.a(param2, (wl) (Object) var6_ref, (byte) -117);
            ((di) this).field_d.a((rk) (Object) var6_ref, 10);
            ((ig) (Object) var6_ref).field_o = 0L;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "di.L(" + -30 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please enter your age in years";
        field_e = 2;
    }
}
