/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends vh {
    private int field_Lb;
    private vh field_Qb;
    private StringBuilder field_Nb;
    private vh field_Pb;
    static int[][][] field_Ob;
    static String field_Tb;
    static String field_Rb;
    static ao field_Mb;
    static String field_Sb;

    final static dd f(byte param0) {
        int var4_int = 0;
        int var5 = Pool.field_O;
        int var1 = rc.field_f[0] * pd.field_a[0];
        byte[] var2 = v.field_b[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = ma.field_h[rb.b((int) var2[var4_int], 255)];
        }
        dd var4 = new dd(vd.field_c, tq.field_r, el.field_I[0], ih.field_d[0], pd.field_a[0], rc.field_f[0], var3);
        if (param0 != 89) {
          aj.f((byte) 30);
        }
        sh.h(-1);
        return var4;
    }

    aj(int param0, int param1, int param2, int param3, String param4, vh param5, vh param6, vh param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Lb = 0;
        try {
          this.field_Pb = new vh(0L, param6, param4);
          this.a(117, this.field_Pb);
          this.field_Qb = new vh(0L, param7);
          this.field_Qb.field_N = 16764006;
          this.a(-126, this.field_Qb);
          this.field_Qb.field_kb = "|";
          this.field_Nb = new StringBuilder(12);
          var9_int = this.field_Pb.b(true);
          this.field_Pb.b(3, 2147483647, 5, var9_int, ad.field_x);
          this.field_Qb.b(ad.field_x + 3, 2147483647, 5, var9_int, ad.field_x);
          var10 = 5 + (5 + var9_int);
          var11 = 3 + (2 * ad.field_x + 3);
          var12 = de.a(var10, param2, param0, 0);
          var13 = sh.a(var11, param1, -1, param3);
          this.b(var13, 2147483647, var12, var10, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("aj.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        if (param0) {
          return;
        }
        field_Ob = (int[][][]) null;
        field_Sb = null;
        field_Mb = null;
        field_Rb = null;
        field_Tb = null;
    }

    final static int a(boolean param0, int param1, int param2) {
        if (!param0) {
          return -93;
        }
        int var3 = param2 >> 31 & -1 + param1;
        return (param2 + (param2 >>> 31)) % param1 + var3;
    }

    final static dd[] a(int param0, String param1, di param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dd[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.b(param1, param0 - 1);
          var5 = param2.a(var4_int, param0, param3);
          stackIn_1_0 = ln.a(var4_int, (byte) 110, param2, var5);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("aj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          String var3 = null;
          String var5 = null;
          String var4 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            om.field_y = param2;
            try {
              if (param1 != -18788) {
                field_Sb = (String) null;
              }
              var3 = param0.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var5Lifetime4 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
              if (param2.length() == 0) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              mo.a("document.cookie=\"" + var5Lifetime4 + "\"", param0, (byte) 35);
            } catch (Throwable throwable) {
            }
            uk.a(558370049, param0);
          } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "aj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean f(int param0) {
        int var2 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        if (this.field_Lb != 0) {
          return false;
        }
        if (param0 != 20628) {
          java.applet.Applet var3 = (java.applet.Applet) null;
          aj.a((java.applet.Applet) null, 1);
        }
        if (85 == qi.field_a &&
          !(this.field_Nb.length() <= 0)) {
          cj.a(' ', this.field_Nb.length() - 1, -2790, this.field_Nb);
        }
        if (this.field_Nb.length() < 12) {
          var2 = Character.toLowerCase(ml.field_b);
          if (var2 == 32) {
            var2 = 95;
          }
          if (var2 == 95 &&
            !(this.field_Nb.length() <= 0)) {
            discarded$0 = this.field_Nb.append((char) var2);
          }
          if (vq.a((char) var2, 22987) ||
            kh.a((char) var2, (byte) 85)) {
            discarded$1 = this.field_Nb.append((char) var2);
          }
        }
        if (qi.field_a == 84) {
          if (this.field_Nb.length() > 0) {
            this.field_nb = this.field_Nb.toString();
            this.field_Lb = 2;
          } else {
            this.field_Lb = 1;
          }
        }
        if (13 != qi.field_a) {
          return true;
        }
        this.field_Lb = 1;
        return true;
    }

    final static ml a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ml[] var3 = null;
        int var4 = 0;
        ml var5 = null;
        ml stackIn_4_0 = null;
        ml stackIn_9_0 = null;
        ml stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = re.a(-21721, "jagex-last-login-method", param0);
          if (param1 != 5137) {
            aj.a(-103, false, 80);
          }
          if (var2 == null) {
            stackIn_4_0 = ve.field_l;
            return stackIn_4_0;
          }
          var3 = to.a((byte) -66);
          var4 = 0;
          while (true) {
            if (var3.length <= var4) {
              stackIn_12_0 = ve.field_l;
              return stackIn_12_0;
            }
            var5 = var3[var4];
            if (!var5.a(var2, (byte) 49)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var5;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("aj.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        long var3;
        String var5;
        var3 = (long)param2 * (long)param0;
        if ((255L & var3 >> 47) != 0L &&
          255L != (255L & var3 >> 47)) {
          var3 = ((long)param2 >> 8) * ((long)param0 >> 8);
        } else {
          var3 = var3 >> 16;
        }
        if (param1) {
          var5 = (String) null;
          aj.a(23, (String) null, (di) null, (String) null);
        }
        if (0 > param2 &&
          0 > param0 &&
          var3 < 0L) {
          throw new IllegalStateException("Overflow: Multiplied two negative numbers (?!) mul(" + param2 + "[" + pf.b(126, param2) + ", " + Integer.toString(param2, 16) + "], " + param0 + "[" + pf.b(126, param0) + ", " + Integer.toString(param0, 16) + "]) and got a negative number: " + var3 + "[" + cr.a((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
        }
        if ((0 < param2 &&
          0 > param0 ||
          param2 < 0 &&
          param0 > 0) && var3 > 0L) {
          throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param2 + "[" + pf.b(127, param2) + ", " + Integer.toString(param2, 16) + "], " + param0 + "[" + pf.b(126, param0) + ", " + Integer.toString(param0, 16) + "]) and got a positive number: " + var3 + "[" + cr.a((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
        }
        if (param2 > 0 &&
          0 < param0 &&
          var3 < 0L) {
          throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param2 + "[" + pf.b(126, param2) + ", " + Integer.toString(param2, 16) + "], " + param0 + "[" + pf.b(127, param0) + ", " + Integer.toString(param0, 16) + "]) and got a negative number: " + var3 + "[" + cr.a((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
        }
        return (int)var3;
    }

    final int a(boolean param0, byte param1) {
        StringBuilder discarded$2 = null;
        int var4;
        var4 = Pool.field_O;
        this.a(param0, false);
        if (param1 >= -74) {
          return -46;
        }
        if (param0) {
          while (n.h(127)) {
            if (85 == qi.field_a &&
              this.field_Nb.length() > 0) {
              cj.a(' ', -1 + this.field_Nb.length(), -2790, this.field_Nb);
            }
            if (he.a(ml.field_b, (CharSequence) ((Object) this.field_Nb), 15692) ||
              (this.field_Nb.length() == 0 &&
              ml.field_b == 91 ||
              1 == this.field_Nb.length() &&
              ml.field_b == 35) ||
              ml.field_b == 93) {
              discarded$2 = this.field_Nb.append(ml.field_b);
            }
            if (qi.field_a != 84) {
              if (13 != qi.field_a) {
                continue;
              }
              return 1;
            }
            if (this.field_Nb.length() <= 0) {
              return 1;
            }
            this.field_nb = this.field_Nb.toString();
            return 2;
          }
        }
        this.field_Qb.field_nb = this.field_Nb.toString();
        if (param0 &&
          0 != ne.field_s &&
          this.field_R == 0) {
          this.field_Lb = 1;
        }
        return this.field_Lb;
    }

    static {
        int var0 = 0;
        field_Tb = "Next";
        field_Rb = "You do not have a suitable number of players for the current options.";
        field_Ob = new int[5][][];
        field_Ob[0] = new int[][]{new int[]{16}, new int[]{23}, new int[]{16, 16, 16, 16, 23, 16, 16, 16, 16}, new int[]{16}, new int[]{16}, new int[]{16, 16, 16, 23, 16, 16, 16, 23, 16}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{23, 16}, new int[]{16, 23, 16, 23, 16, 23, 23, 23}};
        field_Ob[1] = new int[][]{new int[]{16}, new int[]{23, 23, 16, 23, 23, 23, 23, 23, 23}, new int[]{16, 16, 16, 16, 23, 16, 16, 16, 16}, new int[]{16}, new int[]{16}, new int[]{16, 16, 16, 23, 16, 16, 16, 23, 16}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{23, 16}, new int[]{16, 23, 16, 23, 16, 23, 23, 23}};
        field_Ob[3] = new int[][]{new int[]{16}, new int[]{23}, new int[]{16, 16, 16, 16, 23, 16, 16, 16, 16}, new int[]{16}, new int[]{16}, new int[]{16, 16, 16, 23, 16, 16, 16, 23, 16}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{22, 22, 16, 16, 16, 22, 22, 22, 22, 22}, new int[]{23, 16}, new int[]{15, 20, 15, 20, 15, 20, 15, 20}};
        field_Ob[2] = new int[][]{new int[]{16}, new int[]{23}, new int[]{16, 16, 16, 16, 23, 16, 16, 16, 16}, new int[]{16}, new int[]{16}, new int[]{16, 16, 16, 23, 16, 16, 16, 23, 16}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{22, 22, 16, 16, 16, 22, 22, 22, 22, 22}, new int[]{23, 16}, new int[]{16, 23, 16, 23, 16, 23, 23, 23}};
        for (var0 = 0; var0 < 5; var0++) {
          if (field_Ob[var0] == null) {
            field_Ob[var0] = field_Ob[0];
          }
        }
        field_Sb = "Waiting for music";
    }
}
