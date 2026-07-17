/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk implements uj {
    static boolean field_a;
    static char[] field_e;
    static String field_f;
    static int field_h;
    static int field_g;
    static int[] field_d;
    static String field_b;
    static String field_c;

    final static void b(boolean param0) {
        nk var1 = (nk) (Object) eb.field_f.c(51510);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        eh.a(var1.field_y, var1.field_n, var1.field_s);
        eh.a(var1.field_r, var1.field_o, var1.field_t, var1.field_q);
        var1.field_y = null;
        ah.field_g.a((byte) 91, (pi) (Object) var1);
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            String var7 = null;
            String var6 = null;
            String var4 = null;
            String var8 = null;
            try {
                w.field_T = param0;
                try {
                    var7 = param1.getParameter("cookieprefix");
                    var6 = var7;
                    var6 = var7;
                    int var5 = 108 / ((60 - param2) / 59);
                    var4 = param1.getParameter("cookiehost");
                    var6 = var4;
                    var6 = var4;
                    var8 = var7 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    var6 = var8;
                    var6 = var8;
                    if (param0.length() == 0) {
                        var6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    int discarded$0 = -106;
                    lk.a(param1, "document.cookie=\"" + var6 + "\"");
                } catch (Throwable throwable) {
                }
                int discarded$1 = 1;
                ie.a(param1);
            } catch (RuntimeException runtimeException) {
                throw lj.a((Throwable) (Object) runtimeException, "tk.D(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(bi param0, int param1) {
        ld var3 = null;
        try {
            var3 = sn.field_c;
            var3.d((byte) -82, param1);
            var3.c(param0.field_o, 25564);
            var3.b((byte) 124, param0.field_n);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "tk.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + -102 + 41);
        }
    }

    final static boolean b() {
        return null != ll.field_a && ll.field_a.e((byte) 83) != null;
    }

    public static void a() {
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
        field_f = null;
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2_int = param1.length();
            L1: {
              if (var2_int <= 20) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var10 = new char[var2_int];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_20_0 = new String(var10);
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L4;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(97 + var5 - 65);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (97 > var5) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (var5 > 57) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3[var4] = '_';
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("tk.C(").append(732).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
    }

    public final void a(boolean param0) {
        if (param0) {
            return;
        }
        tb.field_a = 1;
        gd.field_x = 3;
    }

    final static ud[] a(int param0, ld param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ud[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        ud var7 = null;
        int var8 = 0;
        ud[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2_int = param1.c((byte) -104, 8);
            if (var2_int <= 0) {
              var3 = param1.c((byte) -122, 12);
              var4 = new ud[var3];
              var5 = 0;
              var6 = -1;
              L1: while (true) {
                if (var5 >= var3) {
                  stackOut_10_0 = (ud[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    if (ql.a(param1, (byte) 100)) {
                      var7 = new ud();
                      int discarded$12 = param1.c((byte) -95, 24);
                      int discarded$13 = param1.c((byte) -81, 24);
                      var7.field_d = param1.c((byte) -99, 24);
                      int discarded$14 = param1.c((byte) -72, 9);
                      int discarded$15 = param1.c((byte) -83, 12);
                      int discarded$16 = param1.c((byte) -68, 12);
                      int discarded$17 = param1.c((byte) -126, 12);
                      var4[var5] = var7;
                      break L2;
                    } else {
                      var7_int = param1.c((byte) -110, ol.a(var5 - 1, 8));
                      var4[var5] = var4[var7_int];
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("tk.F(").append(-123).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    public final String a(byte param0) {
        int var2 = 70 % ((param0 - -33) / 62);
        return "Make Ore Effluvium";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
        field_f = "Cancel";
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = "Password: ";
        field_g = 64;
    }
}
