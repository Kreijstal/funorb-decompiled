/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oa extends hn implements hi, mb {
    static int field_j;
    static String field_h;
    kb field_g;
    static boolean field_i;

    public final void a(int param0, c param1) {
        try {
            int var3_int = -49 / ((-30 - param0) / 60);
            this.b(2048);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "oa.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            oa.a(-73, -28);
            field_h = null;
            return;
        }
        field_h = null;
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        qa var14 = null;
        String var8_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        int var12 = 0;
        String var2 = null;
        String var11 = null;
        int var13 = Pixelate.field_H ? 1 : 0;
        if (!(param0 instanceof qa)) {
            var2 = "";
        } else {
            var14 = (qa) ((Object) param0);
            param0 = var14.field_c;
            var2 = var14.field_d + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
        }
        StringWriter var15 = new StringWriter();
        PrintWriter var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        String var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        BufferedReader var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        String var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        while (true) {
            var8_ref_String = var6.readLine();
            var11 = var8_ref_String;
            var2 = var11;
            var11 = var8_ref_String;
            if (var8_ref_String == null) {
                break;
            }
            var9 = var8_ref_String.indexOf('(');
            var10 = var8_ref_String.indexOf(')', 1 + var9);
            if (var9 != -1) {
                var11 = var8_ref_String.substring(0, var9);
            } else {
                var11 = var8_ref_String;
                var2 = var11;
                var2 = var11;
            }
            var16 = var11.trim();
            var2 = var16;
            var2 = var16;
            var17 = var16.substring(var16.lastIndexOf(' ') - -1);
            var2 = var17;
            var2 = var17;
            var18 = var17.substring(var17.lastIndexOf('\t') + 1);
            var2 = var18;
            var2 = var18;
            var19 = var2 + var18;
            var2 = var19;
            var2 = var19;
            var2 = var19;
            if (0 != (var9 ^ -1) && (var10 ^ -1) != 0) {
                var12 = var8_ref_String.indexOf(".java:", var9);
                if (!(-1 < (var12 ^ -1))) {
                    var2 = var19 + var8_ref_String.substring(5 + var12, var10);
                }
            }
            var2 = var2 + ' ';
        }
        int var8 = 25 % ((47 - param1) / 56);
        var2 = var2 + "| " + var7;
        return var2;
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param1 != 1890) {
          L0: {
            field_i = false;
            if ((-param0 & param0) != param0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((-param0 & param0) != param0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final dj a(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dj stackIn_3_0 = null;
        dj stackIn_7_0 = null;
        dj stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_g.e((byte) 90);
            var3 = this.field_g.l(25);
            var4 = this.field_g.c(param0);
            var5 = wa.b(-80);
            if (1890 > var4) {
              stackIn_3_0 = sk.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-3 + var5 < var4) {
                stackIn_7_0 = sk.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (dq.a(var2_int, var3, -2, var4)) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_10_0 = sk.field_a;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return sk.field_a;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return qk.field_g;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    public final void a(c param0, int param1) {
        try {
            if (param1 != 4) {
                this.field_g = (kb) null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "oa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(int param0) {
        if (param0 != -22265) {
            field_i = false;
            return this.field_g.m(-1);
        }
        return this.field_g.m(-1);
    }

    final String c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_g.e((byte) -84);
              var3 = this.field_g.l(25);
              var4 = this.field_g.c(true);
              var5 = wa.b(-127);
              if (var4 < 1890) {
                break L1;
              } else {
                if (var5 - 3 < var4) {
                  break L1;
                } else {
                  if (!dq.a(var2_int, var3, param0 + param0, var4)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
            }
            stackIn_4_0 = sd.a(kd.field_d, 120, new String[]{"1890", Integer.toString(-3 + var5)});
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 1;
            break L2;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return ue.field_p;
        }
    }

    public oa() {
    }

    static {
        field_j = 0;
        field_h = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
