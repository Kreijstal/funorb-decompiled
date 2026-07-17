/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    private di field_e;
    static String field_a;
    private di field_c;
    static int[] field_b;
    private fg field_d;

    final static void a(int param0, int param1) {
        oh.field_e = 20000000L;
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        oa var13 = null;
        StringWriter var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        L0: {
          if (!(param1 instanceof oa)) {
            var2 = "";
            var11 = var2;
            break L0;
          } else {
            var13 = (oa) (Object) param1;
            var2 = var13.field_i + " | ";
            param1 = var13.field_c;
            break L0;
          }
        }
        var14 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var14);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var14.toString();
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 == -1) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var15 = var11.trim();
              var2 = var15;
              var2 = var15;
              var16 = var15.substring(var15.lastIndexOf(' ') - -1);
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf('\t') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var2 + var17;
              var2 = var18;
              var2 = var18;
              if (var9 == -1) {
                break L3;
              } else {
                if (-1 == var10) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L3;
                  } else {
                    var2 = var18 + var8.substring(var12 + 5, var10);
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    final static int b() {
        return -fk.field_Z + ah.field_i;
    }

    final static void a(pn param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        pn var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            if (param0.field_f != null) {
              L1: {
                L2: {
                  if (param0.field_m != 0) {
                    break L2;
                  } else {
                    if (param0.field_e != 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= aa.field_e) {
                    break L1;
                  } else {
                    L4: {
                      var3 = wb.field_e[var2_int];
                      if (var3.field_p != 2) {
                        break L4;
                      } else {
                        if (param0.field_m != var3.field_m) {
                          break L4;
                        } else {
                          if (param0.field_e == var3.field_e) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param0.field_d == null) {
                  break L5;
                } else {
                  hp.field_a = param0.field_b;
                  ro.field_s = param0.field_q;
                  rn.field_g = param0.field_d;
                  hg.field_a = param0.field_p;
                  break L5;
                }
              }
              oa.a(-114, param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("ee.F(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 101 + 41);
        }
    }

    final static pn a(byte param0, boolean param1) {
        oq var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        oq var8 = null;
        ap var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_22_0 = null;
        int[] stackOut_21_0 = null;
        L0: {
          var7 = Pool.field_O;
          var8 = kn.field_e;
          var2 = var8;
          var3 = var8.g(-111);
          if ((var3 & 128) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          qg.field_d = stackIn_3_0 != 0;
          um.field_d = var3 & 127;
          df.field_e = var8.g(-105);
          qg.field_c = var8.h(-412303328);
          if (2 != um.field_d) {
            m.field_e = 0;
            wq.field_a = 0;
            break L1;
          } else {
            wq.field_a = var8.d(-1034);
            m.field_e = var8.f(98);
            break L1;
          }
        }
        L2: {
          if (var8.g(-65) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          n.field_S = var8.j(-105);
          if (var4 == 0) {
            lh.field_f = n.field_S;
            break L3;
          } else {
            lh.field_f = var8.j(-77);
            break L3;
          }
        }
        L4: {
          if (um.field_d == 1) {
            pp.field_b = var8.d(-1034);
            tp.field_g = var8.j(-49);
            break L4;
          } else {
            if (4 == um.field_d) {
              pp.field_b = var8.d(-1034);
              tp.field_g = var8.j(-49);
              break L4;
            } else {
              pp.field_b = 0;
              tp.field_g = null;
              break L4;
            }
          }
        }
        L5: {
          if (param1) {
            var5 = var8.d(-1034);
            try {
              L6: {
                L7: {
                  var9 = o.field_x.a(127, var5);
                  np.field_a = var9.e(0);
                  if (lh.field_f.equals((Object) (Object) di.field_j)) {
                    stackOut_22_0 = null;
                    stackIn_23_0 = (int[]) (Object) stackOut_22_0;
                    break L7;
                  } else {
                    stackOut_21_0 = var9.field_C;
                    stackIn_23_0 = stackOut_21_0;
                    break L7;
                  }
                }
                ci.field_p = stackIn_23_0;
                break L6;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6 = (Exception) (Object) decompiledCaughtException;
                tc.a((Throwable) (Object) var6, "CC1", -8555);
                np.field_a = null;
                ci.field_p = null;
                break L8;
              }
            }
            break L5;
          } else {
            int discarded$2 = 1;
            int discarded$3 = 80;
            np.field_a = s.a((ge) (Object) var8);
            ci.field_p = null;
            break L5;
          }
        }
        return new pn(param1);
    }

    final sf a(byte param0, int param1) {
        byte[] var4 = null;
        sf var3 = (sf) ((ee) this).field_d.a((long)param1, true);
        if (param0 != -55) {
            return null;
        }
        if (var3 != null) {
            return var3;
        }
        if (32768 > param1) {
            var4 = ((ee) this).field_c.a(82, param1, 0);
        } else {
            var4 = ((ee) this).field_e.a(112, param1 & 32767, 0);
        }
        var3 = new sf();
        if (var4 != null) {
            var3.a((byte) -123, new ge(var4));
        }
        if (32768 <= param1) {
            var3.f(0);
        }
        ((ee) this).field_d.a(121, (Object) (Object) var3, (long)param1);
        return var3;
    }

    ee(int param0, di param1, di param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((ee) this).field_d = new fg(64);
        try {
          L0: {
            L1: {
              ((ee) this).field_e = param2;
              ((ee) this).field_c = param1;
              if (((ee) this).field_c == null) {
                break L1;
              } else {
                int discarded$4 = ((ee) this).field_c.a(false, 0);
                break L1;
              }
            }
            L2: {
              if (null == ((ee) this).field_e) {
                break L2;
              } else {
                int discarded$5 = ((ee) this).field_e.a(false, 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ee.<init>(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> are all offering a rematch.";
        field_b = new int[128];
    }
}
