/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vm extends jb implements ha {
    static jc field_h;
    static int[] field_i;
    private qn field_j;
    static String field_g;
    static int field_k;

    public final void b(qn param0, int param1) {
        if (param1 != 3) {
            ((vm) this).field_j = null;
        }
    }

    final String d(int param0) {
        if (param0 < 40) {
            Object var3 = null;
            mk discarded$0 = ((vm) this).a((byte) 78, (String) null);
        }
        return ((vm) this).a(((vm) this).field_j.field_v, -9316);
    }

    public static void c(boolean param0) {
        field_g = null;
        field_h = null;
        field_i = null;
        if (!param0) {
            Object var2 = null;
            vm.a((String) null, 25, (java.applet.Applet) null, -25L, (String) null);
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2, long param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var8 = param2.getParameter("cookiehost");
                  var7 = var8;
                  var7 = var8;
                  var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                  var7 = var9;
                  var7 = var9;
                  if ((param3 ^ -1L) <= -1L) {
                    var7 = var9 + "; Expires=" + sk.a(5, 1000L * param3 + ud.a(2)) + "; Max-Age=" + param3;
                    break L1;
                  } else {
                    var7 = var9 + "; Discard;";
                    break L1;
                  }
                }
                L2: {
                  if (param1 == 11440) {
                    break L2;
                  } else {
                    field_h = null;
                    break L2;
                  }
                }
                u.a((byte) -81, "document.cookie=\"" + var7 + "\"", param2);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var6 = decompiledCaughtException;
                break L3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract mk a(byte param0, String param1);

    final static Object a(int param0, byte[] param1, boolean param2) {
        ja var3 = null;
        if (param1 == null) {
            return null;
        }
        if (-137 > (param1.length ^ -1)) {
            var3 = new ja();
            ((f) (Object) var3).a(param1, 199);
            return (Object) (Object) var3;
        }
        if (param0 != 25633) {
            return null;
        }
        if (!param2) {
            return (Object) (Object) param1;
        }
        return (Object) (Object) tj.a(-93, param1);
    }

    final static void g(int param0) {
        if (-71 < (lf.field_S ^ -1)) {
            an.a(lf.field_S - -10, (byte) 105);
        } else {
            an.a(80, (byte) 111);
        }
        if (param0 != 1) {
            Object var2 = null;
            Object discarded$0 = vm.a(70, (byte[]) null, true);
        }
    }

    vm(qn param0) {
        ((vm) this).field_j = param0;
    }

    public final void a(qn param0, int param1) {
        if (param1 != 10999) {
            mk discarded$0 = ((vm) this).e(-111);
        }
        ((vm) this).b(true);
    }

    final mk e(int param0) {
        if (param0 != 4) {
            field_g = null;
        }
        return ((vm) this).a((byte) -111, ((vm) this).field_j.field_v);
    }

    final static int a(String param0, int param1, lh param2, String[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Chess.field_G;
          var5 = param2.b(param0);
          if (param4 < var5) {
            break L0;
          } else {
            if ((param0.indexOf("<br>") ^ -1) == 0) {
              param3[0] = (String) (Object) param3;
              return 1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var6 = (var5 + param4 - 1) / param4;
          param4 = var5 / var6;
          if (param1 == -9224) {
            break L1;
          } else {
            field_g = null;
            break L1;
          }
        }
        var6 = 0;
        var7 = 0;
        var8 = param0.length();
        var9 = 0;
        L2: while (true) {
          if (var9 >= var8) {
            L3: {
              if (var8 > var7) {
                int incrementValue$3 = var6;
                var6++;
                param3[incrementValue$3] = param0.substring(var7, var8).trim();
                break L3;
              } else {
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param0.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (var10 != 45) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var11 = param0.substring(var7, 1 + var9).trim();
              var12 = param2.b(var11);
              if (param4 <= var12) {
                var7 = var9 - -1;
                int incrementValue$4 = var6;
                var6++;
                param3[incrementValue$4] = var11;
                break L4;
              } else {
                break L4;
              }
            }
            if (var10 == 62) {
              if (param0.regionMatches(var9 + -3, "<br>", 0, 4)) {
                int incrementValue$5 = var6;
                var6++;
                param3[incrementValue$5] = param0.substring(var7, -3 + var9).trim();
                var7 = var9 + 1;
                var9++;
                continue L2;
              } else {
                var9++;
                continue L2;
              }
            } else {
              var9++;
              continue L2;
            }
          }
        }
    }

    abstract String a(String param0, int param1);

    public final boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 14496) {
            break L0;
          } else {
            ((vm) this).field_j = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((vm) this).field_j.field_v == null) {
              break L2;
            } else {
              if (((vm) this).field_j.field_v.length() != 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        if (param0 <= 98) {
            field_k = 71;
        }
        int var2 = param1 & 255;
        if (!(-1 != (var2 ^ -1))) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (-129 >= (var2 ^ -1)) {
            if ((var2 ^ -1) > -161) {
                var3 = jn.field_M[-128 + var2];
                if (!(0 != var3)) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[5];
        field_h = new jc();
        field_g = "Rankings";
    }
}
