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
        if (!param0) {
            Object var2 = null;
            tk.a((bi) null, -86, (byte) -122);
        }
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            String var3 = null;
            String var6 = null;
            String var4 = null;
            w.field_T = param0;
            try {
                var3 = param1.getParameter("cookieprefix");
                var6 = var3;
                var6 = var3;
                int var5 = 108 / ((60 - param2) / 59);
                var4 = param1.getParameter("cookiehost");
                var6 = var4;
                var6 = var4;
                var6 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (param0.length() == 0) {
                    var6 = var6 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                lk.a(param1, "document.cookie=\"" + var6 + "\"", (byte) -106);
            } catch (Throwable throwable) {
            }
            ie.a(param1, true);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(bi param0, int param1, byte param2) {
        ld var3 = sn.field_c;
        var3.d((byte) -82, param1);
        var3.c(param0.field_o, 25564);
        if (param2 != -102) {
            tk.b(true);
        }
        var3.b((byte) 124, param0.field_n);
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > 126) {
          L0: {
            L1: {
              if (null == ll.field_a) {
                break L1;
              } else {
                if (ll.field_a.e((byte) 83) == null) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 != 8225) {
            return;
        }
        field_b = null;
        field_f = null;
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        var6 = MinerDisturbance.field_ab;
        var2 = param1.length();
        if (param0 == 732) {
          L0: {
            if (-21 <= (var2 ^ -1)) {
              break L0;
            } else {
              var2 = 20;
              break L0;
            }
          }
          var8 = new char[var2];
          var7 = var8;
          var3 = var7;
          var4 = 0;
          L1: while (true) {
            if (var2 <= var4) {
              return new String(var8);
            } else {
              L2: {
                var5 = param1.charAt(var4);
                if (var5 < 65) {
                  break L2;
                } else {
                  if (var5 <= 90) {
                    var3[var4] = (char)(97 + var5 - 65);
                    var4++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  if (97 > var5) {
                    break L4;
                  } else {
                    if (var5 <= 122) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 < 48) {
                    break L5;
                  } else {
                    if (var5 > 57) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                var3[var4] = (char)95;
                var4++;
                continue L1;
              }
              var3[var4] = (char)var5;
              var4++;
              continue L1;
            }
          }
        } else {
          return null;
        }
    }

    public final void a(boolean param0) {
        if (param0) {
            return;
        }
        tb.field_a = 1;
        gd.field_x = 3;
    }

    final static ud[] a(int param0, ld param1) {
        int var2 = 0;
        int var3 = 0;
        ud[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        ud var7 = null;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        var2 = param1.c((byte) -104, 8);
        if (-1 <= (var2 ^ -1)) {
          var3 = param1.c((byte) -122, 12);
          var4 = new ud[var3];
          var5 = 0;
          var6 = -77 % ((param0 - 67) / 45);
          L0: while (true) {
            if (var5 >= var3) {
              return var4;
            } else {
              if (ql.a(param1, (byte) 100)) {
                var7 = new ud();
                int discarded$6 = param1.c((byte) -95, 24);
                int discarded$7 = param1.c((byte) -81, 24);
                var7.field_d = param1.c((byte) -99, 24);
                int discarded$8 = param1.c((byte) -72, 9);
                int discarded$9 = param1.c((byte) -83, 12);
                int discarded$10 = param1.c((byte) -68, 12);
                int discarded$11 = param1.c((byte) -126, 12);
                var4[var5] = var7;
                var5++;
                continue L0;
              } else {
                var7_int = param1.c((byte) -110, ol.a(var5 - 1, 8));
                var4[var5] = var4[var7_int];
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    public final String a(byte param0) {
        int var2 = 70 % ((param0 - -33) / 62);
        return "Make Ore Effluvium";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_f = "Cancel";
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = "Password: ";
        field_g = 64;
    }
}
