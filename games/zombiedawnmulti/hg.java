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
          L1: {
            var13 = ZombieDawnMulti.field_E ? 1 : 0;
            if (!(param1 instanceof fn)) {
              break L1;
            } else {
              var14 = (fn) ((Object) param1);
              param1 = var14.field_f;
              var2 = var14.field_k + " | ";
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11 = var2;
          break L0;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L2: while (true) {
          L3: {
            var8 = var6.readLine();
            var11 = var8;
            var2 = var11;
            var11 = var8;
            if (var8 != null) {
              break L3;
            } else {
              if (var13 == 0) {
                if (param0 > -58) {
                  return (String) null;
                } else {
                  var2 = var2 + "| " + var7;
                  return var2;
                }
              } else {
                break L3;
              }
            }
          }
          L4: {
            L5: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 == -1) {
                break L5;
              } else {
                var11 = var8.substring(0, var9);
                if (var13 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            var11 = var8;
            var2 = var11;
            var2 = var11;
            break L4;
          }
          L6: {
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
            var2 = var19;
            if (0 == (var9 ^ -1)) {
              break L6;
            } else {
              if (0 == (var10 ^ -1)) {
                break L6;
              } else {
                var12 = var8.indexOf(".java:", var9);
                if (0 > var12) {
                  break L6;
                } else {
                  var2 = var19 + var8.substring(var12 + 5, var10);
                  break L6;
                }
              }
            }
          }
          var2 = var2 + ' ';
          continue L2;
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
            L1: {
              if (param2 <= var4) {
                break L1;
              } else {
                var6[var4] = param1;
                var4++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return new String(var6);
          }
        } else {
          var4 = 0;
          L2: while (true) {
            L3: {
              if (param2 <= var4) {
                break L3;
              } else {
                var6[var4] = param1;
                var4++;
                if (var5 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            return new String(var6);
          }
        }
    }

    final void a(nm param0, byte param1) {
        String discarded$2 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            oo.c(param0.c(this.g(58), -20126), param0.d(this.h(102), 109), this.field_kb, 16711680);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_fb <= var3_int) {
                    break L3;
                  } else {
                    var4 = param0.c(this.field_cb[var3_int], -20126);
                    var5 = param0.d(this.field_hb[var3_int], 126);
                    oo.e(-1 + var4, -1 + var5, 3, 3, 0);
                    oo.a(var4, var5, 65280);
                    var3_int++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 > 58) {
                  break L2;
                } else {
                  discarded$2 = hg.a(-91, '', 11);
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("hg.J(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public static void c(boolean param0) {
        field_tb = null;
        field_vb = null;
        if (!param0) {
          field_wb = (da) null;
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
        var1 = on.field_Z;
        synchronized (var1) {
          L0: {
            L1: {
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
              if (param0 < -82) {
                break L1;
              } else {
                field_sb = (String) null;
                break L1;
              }
            }
            jf.field_e = ak.field_b;
            break L0;
          }
        }
    }

    hg(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        L0: {
          L1: {
            if (-3 == (this.field_C ^ -1)) {
              break L1;
            } else {
              if ((this.field_C ^ -1) == -5) {
                break L1;
              } else {
                if (-7 != (this.field_C ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_fb = 21;
          this.field_bb = 143360;
          break L0;
        }
    }

    static {
        field_wb = new da();
        field_tb = "Loading sound effects";
        field_sb = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_vb = "Player";
    }
}
