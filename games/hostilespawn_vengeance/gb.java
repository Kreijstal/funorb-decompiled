/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static gb field_a;
    private wc field_g;
    static int field_b;
    private int field_m;
    static int field_h;
    private boolean field_i;
    static String[] field_k;
    private Object[] field_d;
    static nd field_f;
    static bd field_l;
    private uk field_c;
    private Object[][] field_j;
    static long field_e;

    private final synchronized boolean a(byte param0, int param1) {
        if (param0 >= -16) {
            this.a(107, -109, (byte) 42);
        }
        if (!(this.a(-15879))) {
            return false;
        }
        if (param1 >= 0 && this.field_g.field_p.length > param1 && 0 != this.field_g.field_p[param1]) {
            return true;
        }
        if (um.field_f) {
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        if (param1 < 8) {
            field_h = 43;
        }
        if (!this.a(-15879)) {
            return false;
        }
        if (-1 < (param0 ^ -1) || 0 > param2 || param0 >= this.field_g.field_p.length || param2 >= this.field_g.field_p[param0]) {
            if (!um.field_f) {
                return false;
            }
            throw new IllegalArgumentException(param0 + " " + param2);
        }
        return true;
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(-15879)) {
              var4 = 120 / ((param0 - 77) / 40);
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var3_int = this.field_g.field_l.a(true, ci.a(-114, var5));
              stackIn_4_0 = this.b(-8102, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("gb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final synchronized boolean a(int param0) {
        if (param0 != -15879) {
            field_k = (String[]) (this.field_d[4]);
        }
        if (null == this.field_g) {
            this.field_g = this.field_c.c(3);
            if (!(null != this.field_g)) {
                return false;
            }
            this.field_d = new Object[this.field_g.field_c];
            this.field_j = new Object[this.field_g.field_c][];
        }
        return true;
    }

    final int c(int param0, int param1) {
        if (!(this.a((byte) -40, param1))) {
            return 0;
        }
        if (param0 != 0) {
            return ((int[]) (((Object[]) (this.field_d[9]))[14]))[6];
        }
        return this.field_g.field_p[param1];
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!this.a(-15879)) {
            return null;
        }
        if (!(-2 != (this.field_g.field_p.length ^ -1))) {
            return this.a(false, param0, 0);
        }
        if (!this.a((byte) -55, param0)) {
            return null;
        }
        if (!(param1 != (this.field_g.field_p[param0] ^ -1))) {
            return this.a(false, 0, param0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(param1, (byte) 36, param0)) {
            return false;
        }
        if (this.field_j[param1] != null && null != this.field_j[param1][param0]) {
            return true;
        }
        if (!(this.field_d[param1] == null)) {
            return true;
        }
        if (param2 <= 65) {
            gb.a(true, (java.awt.Canvas) null, ((boolean[]) (((Object[]) (((Object[]) (this.field_d[36]))[3]))[4]))[0]);
        }
        this.d(20529, param1);
        if (null == this.field_d[param1]) {
            return false;
        }
        return true;
    }

    final byte[] a(boolean param0, int param1, int param2) {
        if (param0) {
            return (byte[]) (((Object[]) (this.field_d[9]))[4]);
        }
        return this.a(param2, (int[]) null, param1, -2);
    }

    final int f(int param0) {
        if (param0 >= -111) {
            String var3 = (String) null;
            this.a((String) null, (byte) 90);
        }
        if (!(this.a(-15879))) {
            return -1;
        }
        return this.field_g.field_p.length;
    }

    final static void a(gb param0, int param1) {
        bd var2 = new bd(param0.a("", "final_frame.jpg", 0), (java.awt.Component) ((Object) se.field_h));
        int var3 = var2.field_z;
        int var4 = var2.field_A;
        pf.b(param1 ^ -11731);
        ob.field_C = new bd(var3, 3 * var4 / 4);
        ob.field_C.a();
        var2.c(0, 0);
        if (param1 != -11310) {
            return;
        }
        try {
            ki.field_e = new bd(var3, -ob.field_C.field_A + var4);
            ki.field_e.a();
            var2.c(0, -ob.field_C.field_A);
            ki.field_e.field_y = ob.field_C.field_A;
            eh.b(false);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "gb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            try {
                if (param0 < 57) {
                    field_h = -122;
                }
                bi.field_g = param2;
                try {
                    var6 = param1.getParameter("cookieprefix");
                    var5 = var6;
                    var5 = var6;
                    var4 = param1.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                    var5 = var7;
                    var5 = var7;
                    if (0 == param2.length()) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var5 = var7 + "; Expires=" + dk.a((byte) -41, 94608000000L + hn.a((byte) 80)) + "; Max-Age=" + 94608000L;
                    }
                    a.a(param1, 17467, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                e.a(23148, param1);
            } catch (RuntimeException runtimeException) {
                throw wg.a((Throwable) ((Object) runtimeException), "gb.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(int param0) {
        if (param0 <= 14) {
            return;
        }
        ik.field_d = new mk();
        ke.field_s.b(ik.field_d, (byte) 110);
    }

    final static void a(int param0, byte param1, p param2, int param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        gb var6 = null;
        bd var7 = null;
        bd var8 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param2.field_e ^ -1) < -1) {
                if (param2.field_e <= 5) {
                  pe.field_fb[6].a(true, 128, (int)param2.field_c, 8 + param3, 8 + param0);
                  break L1;
                } else {
                  if (-11 > (param2.field_e ^ -1)) {
                    break L1;
                  } else {
                    pe.field_fb[7].a(true, 128, (int)param2.field_c, 8 + param3, param0 + 8);
                    break L1;
                  }
                }
              } else {
                if (-21 == (param2.field_i ^ -1)) {
                  var7 = new bd(64, 64);
                  var8 = var7;
                  var7.a();
                  pe.field_fb[12].a(true, 128, (int)param2.field_c, 32, 32);
                  o.field_n.b((byte) 119);
                  var8.b(-32 + param3, -32 + param0, 64);
                  pe.field_fb[8].a(true, 128, (int)param2.field_c, param3, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 81) {
                break L2;
              } else {
                var6 = (gb) null;
                gb.a((gb) null, 120);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("gb.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var5 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (pb.field_Kb < 10) {
                L2: {
                  var3_int = 0;
                  if (!pc.field_a) {
                    break L2;
                  } else {
                    var3_int = 1;
                    pc.field_a = false;
                    break L2;
                  }
                }
                ki.a(var3_int != 0, nb.j(96), cc.a(74), re.field_A, (byte) 44);
                break L1;
              } else {
                if (uk.a(27301)) {
                  if (fa.field_c == 0) {
                    cf.a(false, param2, (byte) 28);
                    ui.a(0, param1, (byte) -78, 0);
                    break L1;
                  } else {
                    ad.a(param1, param0);
                    break L1;
                  }
                } else {
                  si.d();
                  dc.a((byte) 11, 240, 320);
                  ui.a(0, param1, (byte) -29, 0);
                  break L1;
                }
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                var5 = (String) null;
                gb.a((byte) 10, (java.applet.Applet) null, (String) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("gb.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(-15879)) {
              L1: {
                if (param0 <= -104) {
                  break L1;
                } else {
                  field_b = ((int[]) (this.field_d[9]))[0];
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_g.field_l.a(true, ci.a(-49, var6));
              if (!this.a((byte) -113, var4_int)) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param2);
                var5 = this.field_g.field_h[var4_int].a(true, ci.a(-118, var7));
                stackIn_10_0 = this.a(var5, var4_int, (byte) 107);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("gb.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a(-15879)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_l.a(true, ci.a(-118, var5));
              var4 = 66 % ((param1 - 60) / 54);
              if (-1 < (var3_int ^ -1)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("gb.P(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final synchronized boolean e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (!this.a(-15879)) {
          return false;
        } else {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (var3 >= this.field_g.field_t.length) {
              return var2 != 0;
            } else {
              var4 = this.field_g.field_t[var3];
              if (null == this.field_d[var4]) {
                this.d(param0 ^ 20529, var4);
                if (null == this.field_d[var4]) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param2 ^ -15879)) {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_g.field_l.a(true, ci.a(-57, var6));
              if (this.a((byte) -62, var4_int)) {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_g.field_h[var4_int].a(true, ci.a(-86, var7));
                if (param2 == 0) {
                  stackIn_10_0 = this.a(false, var5, var4_int);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = (byte[]) null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("gb.I(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_k = null;
        field_l = null;
        if (param0 != -16199) {
            gb var2 = (gb) null;
            gb.a((gb) null, 78);
        }
        field_f = null;
    }

    private final synchronized boolean a(int[] param0, int param1, byte param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_62_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        byte[] var10 = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        int[] var15 = null;
        int var15_int = 0;
        int var16_int = 0;
        byte[][] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        vi var27 = null;
        byte[] var28 = null;
        vi var30 = null;
        vi var32 = null;
        int[] var33 = null;
        byte[][] var34 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        var23 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (!this.a((byte) -77, param1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null != this.field_d[param1]) {
                L1: {
                  var5_int = this.field_g.field_o[param1];
                  var35 = this.field_g.field_b[param1];
                  var25 = var35;
                  var6 = var25;
                  if (null == this.field_j[param1]) {
                    array$0 = new Object[this.field_g.field_p[param1]];
                    this.field_j[param1] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_j[param1];
                var8 = 1;
                var9 = -77 % ((35 - param2) / 39);
                var10_int = 0;
                L2: while (true) {
                  L3: {
                    if (var10_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var11 = var35[var10_int];
                          break L4;
                        } else {
                          var11 = var10_int;
                          break L4;
                        }
                      }
                      if (null != var7[var11]) {
                        var10_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L5: {
                      L6: {
                        if (param0 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (0 != param0[0]) {
                              break L7;
                            } else {
                              if (-1 != (param0[1] ^ -1)) {
                                break L7;
                              } else {
                                if (0 != param0[2]) {
                                  break L7;
                                } else {
                                  if (param0[3] == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var36 = sb.a(true, this.field_d[param1], true);
                          var26 = var36;
                          var10 = var26;
                          var27 = new vi(var36);
                          var27.a(var27.field_n.length, (byte) -126, 5, param0);
                          break L5;
                        }
                      }
                      var10 = sb.a(true, this.field_d[param1], false);
                      break L5;
                    }
                    try {
                      L8: {
                        var37 = ml.a(var10, (byte) -76);
                        var28 = var37;
                        var24 = var28;
                        var44 = var24;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var12_ref_RuntimeException = decompiledCaughtException;
                        stackIn_34_0 = (RuntimeException) (var12_ref_RuntimeException);

                        stackIn_34_1 = new StringBuilder();

                        if (param0 == null) {
                          stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                          stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                          stackIn_35_2 = 0;
                          break L9;
                        } else {
                          stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                          stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                          stackIn_35_2 = 1;
                          break L9;
                        }
                      }
                      throw wg.a((Throwable) ((Object) stackIn_35_0), (stackIn_35_2 != 0) + " " + param1 + " " + var10.length + " " + pi.a(var10.length, 31465, var10) + " " + pi.a(-2 + var10.length, 31465, var10) + " " + this.field_g.field_v[param1] + " " + this.field_g.field_d);
                    }
                    L10: {
                      if (this.field_i) {
                        this.field_d[param1] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (1 < var5_int) {
                        if (2 != this.field_m) {
                          var12 = var37.length;
                          var12--;
                          var13 = 255 & var24[var12];
                          var12 = var12 - 4 * (var13 * var5_int);
                          var32 = new vi(var44);
                          var40 = new int[var5_int];
                          var33 = var40;
                          var15 = var33;
                          var32.field_i = var12;
                          var16_int = 0;
                          L12: while (true) {
                            if (var16_int >= var13) {
                              var41 = new byte[var5_int][];
                              var34 = var41;
                              var16 = var34;
                              var17 = 0;
                              L13: while (true) {
                                if (var5_int <= var17) {
                                  var32.field_i = var12;
                                  var17 = 0;
                                  var18 = 0;
                                  L14: while (true) {
                                    if (var13 <= var18) {
                                      var18 = 0;
                                      L15: while (true) {
                                        if (var5_int <= var18) {
                                          break L11;
                                        } else {
                                          L16: {
                                            if (var6 == null) {
                                              var19 = var18;
                                              break L16;
                                            } else {
                                              var19 = var35[var18];
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (this.field_m == 0) {
                                              var7[var19] = ej.a(false, var41[var18], 117);
                                              break L17;
                                            } else {
                                              var7[var19] = var41[var18];
                                              break L17;
                                            }
                                          }
                                          var18++;
                                          continue L15;
                                        }
                                      }
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L18: while (true) {
                                        if (var20 >= var5_int) {
                                          var18++;
                                          continue L14;
                                        } else {
                                          var19 = var19 + var32.d(8195);
                                          kf.a(var44, var17, var41[var20], var40[var20], var19);
                                          var15[var20] = var15[var20] + var19;
                                          var17 = var17 + var19;
                                          var20++;
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var40[var17]];
                                  var16[var17] = array$1;
                                  var40[var17] = 0;
                                  var17++;
                                  continue L13;
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L19: while (true) {
                                if (var18 >= var5_int) {
                                  var16_int++;
                                  continue L12;
                                } else {
                                  var17 = var17 + var32.d(8195);
                                  var15[var18] = var15[var18] + var17;
                                  var18++;
                                  continue L19;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = var37.length;
                          var12--;
                          var13 = 255 & var24[var12];
                          var12 = var12 - 4 * var5_int * var13;
                          var30 = new vi(var44);
                          var15_int = 0;
                          var16_int = 0;
                          var30.field_i = var12;
                          var17 = 0;
                          L20: while (true) {
                            if (var13 <= var17) {
                              if (var15_int == 0) {
                                stackIn_62_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var45 = new byte[var15_int];
                                var15_int = 0;
                                var30.field_i = var12;
                                var18 = 0;
                                var19 = 0;
                                L21: while (true) {
                                  if (var19 >= var13) {
                                    var7[var16_int] = var45;
                                    break L11;
                                  } else {
                                    var20 = 0;
                                    var21 = 0;
                                    L22: while (true) {
                                      if (var21 >= var5_int) {
                                        var19++;
                                        continue L21;
                                      } else {
                                        L23: {
                                          var20 = var20 + var30.d(8195);
                                          if (var6 != null) {
                                            var22 = var35[var21];
                                            break L23;
                                          } else {
                                            var22 = var21;
                                            break L23;
                                          }
                                        }
                                        L24: {
                                          if (param3 != var22) {
                                            break L24;
                                          } else {
                                            kf.a(var44, var18, var45, var15_int, var20);
                                            var15_int = var15_int + var20;
                                            break L24;
                                          }
                                        }
                                        var18 = var18 + var20;
                                        var21++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var18 = 0;
                              var19 = 0;
                              L25: while (true) {
                                if (var5_int <= var19) {
                                  var17++;
                                  continue L20;
                                } else {
                                  L26: {
                                    var18 = var18 + var30.d(8195);
                                    if (var6 != null) {
                                      var20 = var35[var19];
                                      break L26;
                                    } else {
                                      var20 = var19;
                                      break L26;
                                    }
                                  }
                                  L27: {
                                    if (var20 == param3) {
                                      var16_int = var20;
                                      var15_int = var15_int + var18;
                                      break L27;
                                    } else {
                                      break L27;
                                    }
                                  }
                                  var19++;
                                  continue L25;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 != null) {
                            var12 = var35[0];
                            break L28;
                          } else {
                            var12 = 0;
                            break L28;
                          }
                        }
                        if (this.field_m == 0) {
                          var7[var12] = ej.a(false, var44, 112);
                          break L11;
                        } else {
                          var7[var12] = var37;
                          return true;
                        }
                      }
                    }
                    stackIn_100_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_21_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackIn_103_0 = (RuntimeException) (var5);

            stackIn_103_1 = new StringBuilder().append("gb.F(");

            if (param0 == null) {
              stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "null";
              break L29;
            } else {
              stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "{...}";
              break L29;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_62_0 != 0;
              } else {
                return stackIn_100_0 != 0;
              }
            }
          }
        }
    }

    final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(-15879)) {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == -2) {
                  break L1;
                } else {
                  field_a = (gb) null;
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_g.field_l.a(true, ci.a(-34, var4));
              if (!this.a((byte) -71, var3_int)) {
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var3_int;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("gb.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) -79, param0)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param2 == -1) {
                  break L1;
                } else {
                  this.a(false, -33, ((int[]) (this.field_d[32]))[0]);
                  break L1;
                }
              }
              var5 = (CharSequence) ((Object) param1);
              var4_int = this.field_g.field_h[param0].a(true, ci.a(param2 ^ 120, var5));
              if (this.a(param0, (byte) 26, var4_int)) {
                stackIn_10_0 = var4_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("gb.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final synchronized void d(int param0, int param1) {
        if (param0 != 20529) {
            this.a((byte) -10, (String) (this.field_d[0]));
        }
        if (!this.field_i) {
            this.field_d[param1] = ej.a(false, this.field_c.a((byte) -50, param1), param0 + -20418);
        } else {
            this.field_d[param1] = this.field_c.a((byte) -50, param1);
        }
    }

    final synchronized int b(int param0, int param1) {
        if (param0 != -8102) {
            return 60;
        }
        if (!this.a((byte) -120, param1)) {
            return 0;
        }
        if (!(null == this.field_d[param1])) {
            return 100;
        }
        return this.field_c.b(-23, param1);
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(-15879)) {
              L1: {
                if (param0 == -8088) {
                  break L1;
                } else {
                  this.field_d = (Object[]) null;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_g.field_l.a(true, ci.a(-46, var4));
              stackIn_6_0 = this.a(var3_int, (byte) 8);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("gb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!this.a((byte) -62, param0)) {
            return false;
        }
        if (null != this.field_d[param0]) {
            return true;
        }
        if (param1 != 8) {
            ((Object[]) (this.field_d[5]))[12] = (Object) null;
        }
        this.d(param1 + 20521, param0);
        if (null == this.field_d[param0]) {
            return false;
        }
        return true;
    }

    gb(uk param0, boolean param1, int param2) {
        this.field_g = null;
        try {
            if (0 > param2 || (param2 ^ -1) < -3) {
                throw new IllegalArgumentException("");
            }
            this.field_m = param2;
            this.field_i = param1 ? true : false;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            if (this.a(param0, (byte) 121, param2)) {
              L1: {
                if (param3 == -2) {
                  break L1;
                } else {
                  this.field_g = (wc) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var5 = null;
                  if (null == this.field_j[param0]) {
                    break L3;
                  } else {
                    if (null != this.field_j[param0][param2]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.a(param1, param0, (byte) 93, param2)) {
                  this.d(param3 + 20531, param0);
                  if (this.a(param1, param0, (byte) -61, param2)) {
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (null != this.field_j[param0]) {
                L4: {
                  if (this.field_j[param0][param2] == null) {
                    break L4;
                  } else {
                    var7 = sb.a(true, this.field_j[param0][param2], false);
                    var5 = var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 != null) {
                    if ((this.field_m ^ -1) != -2) {
                      if (2 == this.field_m) {
                        this.field_j[param0] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      this.field_j[param0][param2] = null;
                      if (-2 == (this.field_g.field_p[param0] ^ -1)) {
                        this.field_j[param0] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackIn_29_0 = var5;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = var5;

            stackIn_32_1 = new StringBuilder().append("gb.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = stackIn_32_0;
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L6;
            } else {
              stackIn_33_0 = stackIn_32_0;
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return (byte[]) ((Object) stackIn_29_0);
        }
    }

    final synchronized int c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (this.a(-15879)) {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (this.field_d.length <= var4) {
              if (var2 != 0) {
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (0 < this.field_g.field_o[var4]) {
                var3 = var3 + this.b(param0 + -8102, var4);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    static {
        field_b = 49;
        field_k = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_h = 0;
        field_f = new nd(11, 0, 1, 2);
    }
}
