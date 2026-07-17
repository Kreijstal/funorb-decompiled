/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hg extends gm {
    static da field_wb;
    static int field_rb;
    static String field_tb;
    static int field_ub;
    static String field_sb;
    static String field_vb;

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
        int var13 = 0;
        fn var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          if (!(param1 instanceof fn)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (fn) (Object) param1;
            param1 = var14.field_f;
            var2 = var14.field_k + " | ";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
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
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf(' ') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') - -1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (var10 == -1) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (0 > var12) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(var12 + 5, var10);
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          } else {
            if (param0 <= -58) {
              var2 = var2 + "| " + var7;
              return var2;
            } else {
              return null;
            }
          }
        }
    }

    final static String a(int param0, char param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var6 = new char[param2];
        var3 = var6;
        if (param0 != 40) {
          hg.c(false);
          var4 = 0;
          L0: while (true) {
            if (param2 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param1;
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L1: while (true) {
            if (param2 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param1;
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(nm param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            oo.c(param0.c(((hg) this).g(58), -20126), param0.d(((hg) this).h(102), 109), ((hg) this).field_kb, 16711680);
            var3_int = 0;
            L1: while (true) {
              if (((hg) this).field_fb <= var3_int) {
                if (param1 > 58) {
                  break L0;
                } else {
                  String discarded$2 = hg.a(-91, '', 11);
                  return;
                }
              } else {
                var4 = param0.c(((hg) this).field_cb[var3_int], -20126);
                var5 = param0.d(((hg) this).field_hb[var3_int], 126);
                oo.e(-1 + var4, -1 + var5, 3, 3, 0);
                oo.a(var4, var5, 65280);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("hg.J(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    public static void c(boolean param0) {
        field_tb = null;
        field_vb = null;
        if (!param0) {
          field_wb = null;
          field_sb = null;
          field_wb = null;
          return;
        } else {
          field_sb = null;
          field_wb = null;
          return;
        }
    }

    final static void h(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) on.field_Z;
        synchronized (var1) {
          L0: {
            pq.field_f = hh.field_e;
            gi.field_m = gi.field_m + 1;
            bd.field_g = pb.field_a;
            bo.field_d = da.field_e;
            wc.field_J = vj.field_m;
            vj.field_m = false;
            kd.field_b = s.field_f;
            vb.field_f = de.field_g;
            ka.field_t = s.field_b;
            s.field_f = 0;
            jf.field_e = ak.field_b;
            break L0;
          }
        }
    }

    hg(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        L0: {
          L1: {
            if (((hg) this).field_C == 2) {
              break L1;
            } else {
              if (((hg) this).field_C == 4) {
                break L1;
              } else {
                if (((hg) this).field_C != 6) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ((hg) this).field_fb = 21;
          ((hg) this).field_bb = 143360;
          break L0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = new da();
        field_tb = "Loading sound effects";
        field_sb = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_vb = "Player";
    }
}
