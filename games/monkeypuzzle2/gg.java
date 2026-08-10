/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_b;
    private le[] field_a;

    final static String a(String[] args, String param1, boolean param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        byte[] var12 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if ((var6_int ^ -1) > -1) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L2: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (0 > var8) {
                    L3: {
                      discarded$0 = var6.append(param1.substring(var7));
                      if (param2) {
                        break L3;
                      } else {
                        var12 = (byte[]) null;
                        gg.a((int[]) null, 25, (byte[]) null, 86, -42);
                        break L3;
                      }
                    }
                    stackIn_27_0 = var6.toString();
                    break L0;
                  } else {
                    var5 = 2 + var8;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var5) {
                          break L5;
                        } else {
                          if (!re.a(-49, param1.charAt(var5))) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param1.substring(var8 - -2, var5);
                      if (!ra.a((CharSequence) ((Object) var9), (byte) -128)) {
                        continue L2;
                      } else {
                        if ((var5 ^ -1) <= (var3_int ^ -1)) {
                          continue L2;
                        } else {
                          if (param1.charAt(var5) != 62) {
                            continue L2;
                          } else {
                            var5++;
                            var10 = vi.a(43, (CharSequence) ((Object) var9));
                            discarded$1 = var6.append(param1.substring(var7, var8));
                            discarded$2 = var6.append(args[var10]);
                            var7 = var5;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = 2 + var6_int;
                L6: while (true) {
                  L7: {
                    if (var5 >= var3_int) {
                      break L7;
                    } else {
                      if (!re.a(-49, param1.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(var6_int - -2, var5);
                  if (!ra.a((CharSequence) ((Object) var7_ref_String), (byte) 84)) {
                    continue L1;
                  } else {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (62 == param1.charAt(var5)) {
                        var5++;
                        var8 = vi.a(61, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (args[var8].length() - -var6_int - var5);
                        continue L1;
                      } else {
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
          L8: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("gg.F(");

            if (args == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        return stackIn_27_0;
    }

    final static void a(int[] param0, int param1, byte[] param2, int param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 > 71) {
                break L1;
              } else {
                var8 = (String) null;
                gg.a((String[]) null, (String) null, false);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= hb.field_l.length) {
                break L0;
              } else {
                param3 = hb.field_l[var5_int];
                var6 = var5_int << 1288141156;
                L3: while (true) {
                  incrementValue$5 = param3;
                  param3--;
                  if (-1 == (incrementValue$5 ^ -1)) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param1 = dj.field_c[incrementValue$6];
                    dupTemp$7 = param2[param1];
                    dupTemp$8 = param0[dupTemp$7];
                    param0[dupTemp$7] = dupTemp$8 + 1;
                    dj.field_c[dupTemp$8] = param1;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("gg.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 5) {
            field_b = (String) null;
        }
        field_b = null;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        lb.a(param1, param0, (byte) -123, this.field_a, param3, param4);
        if (param2) {
            this.field_a = (le[]) null;
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
            field_b = (String) null;
        }
        return (int)(1000000000L / ed.field_d);
    }

    final static dk b(int param0) {
        if (param0 != -11451) {
            return (dk) null;
        }
        if (null == ok.field_f) {
            ok.field_f = new dk();
            ok.field_f.a(t.field_z, false);
            ok.field_f.field_m = pf.field_c;
            ok.field_f.field_p = 6;
            ok.field_f.field_f = 4;
            ok.field_f.field_b = 14;
            ok.field_f.field_r = 7697781;
            ok.field_f.field_k = 0;
            ok.field_f.field_n = 5;
            ok.field_f.field_s = 2763306;
        }
        return ok.field_f;
    }

    gg(le[] param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Log in / Create account";
    }
}
