/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ii extends q {
    static String[] field_j;
    static boolean field_n;
    static String field_m;
    static String field_o;
    long[] field_l;
    static int field_k;

    final static void a(int param0, int param1, qk param2) {
        int var4 = 0;
        int discarded$0 = 0;
        df var5 = wa.field_d;
        var5.f(95, param1);
        if (param0 != 32) {
            return;
        }
        try {
            var5.field_n = var5.field_n + 1;
            var4 = var5.field_n;
            var5.b(90, 1);
            var5.b(90, param2.field_k);
            var5.a(param2.field_o, (byte) 106);
            var5.b((byte) 60, param2.field_n);
            var5.b((byte) 60, param2.field_m);
            var5.b((byte) 60, param2.field_s);
            var5.b((byte) 60, param2.field_j);
            discarded$0 = var5.a(var4, true);
            var5.c((byte) 48, var5.field_n + -var4);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ii.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param2 == -19) {
                break L1;
              } else {
                ii.a(125);
                break L1;
              }
            }
            if (10 > b.field_x) {
              L2: {
                var3_int = 0;
                if (!cf.field_c) {
                  break L2;
                } else {
                  var3_int = 1;
                  cf.field_c = false;
                  break L2;
                }
              }
              sc.a(kg.a((byte) 49), rd.field_A, var3_int != 0, (byte) 21, ro.b(-126));
              break L0;
            } else {
              if (!pl.b(-109)) {
                ph.b();
                jf.a(param2 ^ -527, 320, 240);
                ni.a(param0, 0, 0, -109);
                return;
              } else {
                if (-1 != (op.field_i ^ -1)) {
                  ji.a((byte) -99, param0);
                  return;
                } else {
                  re.a(true, false, param1);
                  ni.a(param0, 0, 0, param2 + -50);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ii.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        field_j = null;
        if (param0 != -28455) {
            qk var2 = (qk) null;
            ii.a(-84, 11, (qk) null);
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
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
        int var13 = 0;
        ga var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        var13 = Torquing.field_u;
        if (param1 != 0) {
          return (String) null;
        } else {
          L0: {
            if (!(param0 instanceof ga)) {
              var2 = "";
              var11 = var2;
              break L0;
            } else {
              var14 = (ga) ((Object) param0);
              param0 = var14.field_a;
              var2 = var14.field_b + " | ";
              break L0;
            }
          }
          var15 = new StringWriter();
          var4 = new PrintWriter((Writer) ((Object) var15));
          param0.printStackTrace(var4);
          var4.close();
          var5 = var15.toString();
          var2 = var5;
          var11 = var5;
          var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
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
                var10 = var8.indexOf(')', var9 - -1);
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
                var16 = var11.trim();
                var2 = var16;
                var2 = var16;
                var17 = var16.substring(var16.lastIndexOf(' ') + 1);
                var2 = var17;
                var2 = var17;
                var18 = var17.substring(var17.lastIndexOf('\t') - -1);
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                var2 = var19;
                if (var9 == -1) {
                  break L3;
                } else {
                  if ((var10 ^ -1) == 0) {
                    break L3;
                  } else {
                    var12 = var8.indexOf(".java:", var9);
                    if ((var12 ^ -1) <= -1) {
                      var2 = var19 + var8.substring(5 + var12, var10);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var2 = var2 + ' ';
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
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param5 == 2124) {
          if (param4 >= kn.field_e) {
            if (param1 <= qg.field_z) {
              if (j.field_q <= param0) {
                if (param2 > qk.field_p) {
                  ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
                  return;
                } else {
                  qm.a(param2, (byte) 54, param0, param7, param1, param3, param4, param6);
                  return;
                }
              } else {
                ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
                return;
              }
            } else {
              ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
              return;
            }
          } else {
            ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
            return;
          }
        } else {
          field_k = -109;
          if (param4 >= kn.field_e) {
            if (param1 <= qg.field_z) {
              if (j.field_q <= param0) {
                if (param2 > qk.field_p) {
                  ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
                  return;
                } else {
                  qm.a(param2, (byte) 54, param0, param7, param1, param3, param4, param6);
                  return;
                }
              } else {
                ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
                return;
              }
            } else {
              ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
              return;
            }
          } else {
            ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
            return;
          }
        }
    }

    ii() {
    }

    static {
        field_m = "Logging in...";
        field_j = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_o = "members-only content";
    }
}
