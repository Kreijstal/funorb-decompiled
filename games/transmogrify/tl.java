/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static boolean field_a;
    static int field_c;
    private wf field_b;
    private qj field_e;
    static int field_d;

    final wf a(wf param0, boolean param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        wf stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        wf stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = ((tl) this).field_e.field_d.field_f;
                break L1;
              }
            }
            if (((tl) this).field_e.field_d == var3) {
              ((tl) this).field_b = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (wf) (Object) stackIn_6_0;
            } else {
              ((tl) this).field_b = var3.field_f;
              if (param1) {
                stackOut_10_0 = (wf) var3;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (wf) (Object) stackIn_9_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("tl.I(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final wf a(byte param0) {
        wf var2 = ((tl) this).field_e.field_d.field_f;
        if (!(var2 != ((tl) this).field_e.field_d)) {
            ((tl) this).field_b = null;
            return null;
        }
        ((tl) this).field_b = var2.field_f;
        if (param0 != 62) {
            field_d = 49;
        }
        return var2;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = qa.field_u;
            L1: while (true) {
              if (var3_int >= qb.field_f.length) {
                stackOut_10_0 = -1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  var5 = ce.field_a[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + fi.field_x;
                    break L2;
                  } else {
                    var6 = uc.a(qb.field_f[var3_int], false, true);
                    var7 = -(var6 >> 1) + wd.field_j;
                    var4 = var4 + ee.field_D;
                    if (!q.a(param2, (byte) 12, var4, (jl.field_o << 1) + hi.field_c, param1, var7 + -vh.field_m, var6 - -(vh.field_m << 1))) {
                      var4 = var4 + (ee.field_D + ((jl.field_o << 1) - -hi.field_c));
                      break L2;
                    } else {
                      stackOut_5_0 = var5;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "tl.A(" + 196077633 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final wf c(int param0) {
        wf var2 = ((tl) this).field_e.field_d.field_b;
        if (var2 == ((tl) this).field_e.field_d) {
            ((tl) this).field_b = null;
            return null;
        }
        if (param0 >= -86) {
            wf discarded$0 = ((tl) this).b(116);
        }
        ((tl) this).field_b = var2.field_b;
        return var2;
    }

    final wf a(wf param0, int param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        Object stackIn_6_0 = null;
        wf stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        wf stackOut_9_0 = null;
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
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = ((tl) this).field_e.field_d.field_b;
                break L1;
              }
            }
            if (var3 == ((tl) this).field_e.field_d) {
              ((tl) this).field_b = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (wf) (Object) stackIn_6_0;
            } else {
              L2: {
                ((tl) this).field_b = var3.field_b;
                if (param1 == 95) {
                  break L2;
                } else {
                  var4 = null;
                  q discarded$2 = tl.a((String) null, 56);
                  break L2;
                }
              }
              stackOut_9_0 = (wf) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("tl.H(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final static String a(int param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = Transmogrify.field_A ? 1 : 0;
        if (param1 <= 0L) {
            return null;
        }
        if (6582952005840035281L <= param1) {
            return null;
        }
        if (param1 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = cc.field_g[(int)(-(param1 * 37L) + var7)];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var9 = 160;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            StringBuilder discarded$0 = var6.append((char) var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static q a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        q var5 = null;
        q stackIn_4_0 = null;
        q stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        q stackIn_15_0 = null;
        q stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        q stackOut_7_0 = null;
        q stackOut_14_0 = null;
        q stackOut_16_0 = null;
        Object stackOut_10_0 = null;
        q stackOut_3_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() != 0) {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackOut_7_0 = ai.field_a;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int + 1);
                    int discarded$4 = 5507;
                    var5 = lb.a(var3);
                    if (param1 == 2993) {
                      if (var5 != null) {
                        stackOut_14_0 = (q) var5;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      } else {
                        int discarded$5 = 46;
                        stackOut_16_0 = mh.a(var4);
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      }
                    } else {
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      return (q) (Object) stackIn_11_0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = cj.field_b;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("tl.G(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final static am a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        am var9 = null;
        RuntimeException var9_ref = null;
        am stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var9 = new am(29, 65506, param8, param0, param4, param5, param2);
            ec.field_b.a((wf) (Object) var9, -104);
            ei.a(true, 3, var9);
            stackOut_0_0 = (am) var9;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9_ref;
            stackOut_2_1 = new StringBuilder().append("tl.D(").append(param0).append(',').append(36).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 3 + ',' + param4 + ',' + param5 + ',' + 65506 + ',' + 29 + ',' + param8 + ')');
        }
        return stackIn_1_0;
    }

    final wf a(int param0) {
        wf var2 = ((tl) this).field_b;
        if (((tl) this).field_e.field_d == var2) {
            ((tl) this).field_b = null;
            return null;
        }
        if (param0 != 405142401) {
            ((tl) this).field_e = null;
        }
        ((tl) this).field_b = var2.field_b;
        return var2;
    }

    final wf b(int param0) {
        if (param0 != -29339) {
            return null;
        }
        wf var2 = ((tl) this).field_b;
        if (var2 == ((tl) this).field_e.field_d) {
            ((tl) this).field_b = null;
            return null;
        }
        ((tl) this).field_b = var2.field_f;
        return var2;
    }

    tl(qj param0) {
        try {
            ((tl) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "tl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
