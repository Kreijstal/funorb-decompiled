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
        try {
          if (param1 != 3) {
            this.field_j = (qn) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "vm.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(int param0) {
        if (param0 < 40) {
          String var3 = (String) null;
          this.a((byte) 78, (String) null);
        }
        return this.a(this.field_j.field_v, -9316);
    }

    public static void c(boolean param0) {
        field_g = null;
        field_h = null;
        field_i = null;
        if (!param0) {
          String var2 = (String) null;
          vm.a((String) null, 25, (java.applet.Applet) null, -25L, (String) null);
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2, long param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param2.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param3 >= 0L) {
                var7Lifetime4 = var9 + "; Expires=" + sk.a(5, 1000L * param3 + ud.a(2)) + "; Max-Age=" + param3;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              if (param1 != 11440) {
                field_h = (jc) null;
              }
              u.a((byte) -81, "document.cookie=\"" + var7Lifetime4 + "\"", param2);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("vm.BA(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
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
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ja stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (param1.length > 136) {
            var3 = new ja();
            ((f) ((Object) var3)).a(param1, 199);
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (param0 != 25633) {
            stackIn_8_0 = (Object) null;
            return stackIn_8_0;
          }
          if (param2) {
            stackIn_13_0 = tj.a(-93, param1);
            return stackIn_13_0;
          }
          stackIn_11_0 = (byte[]) (param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("vm.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void g(int param0) {
        if (lf.field_S < 70) {
          an.a(lf.field_S + 10, (byte) 105);
        } else {
          an.a(80, (byte) 111);
        }
        if (param0 != 1) {
          byte[] var2 = (byte[]) null;
          vm.a(70, (byte[]) null, true);
        }
    }

    vm(qn param0) {
        try {
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "vm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(qn param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 10999) {
            this.e(-111);
            this.b(true);
          } else {
            this.b(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vm.N(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final mk e(int param0) {
        if (param0 != 4) {
          field_g = (String) null;
        }
        return this.a((byte) -111, this.field_j.field_v);
    }

    final static int a(String param0, int param1, lh param2, String[] param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = Chess.field_G;
        try {
          var5_int = param2.b(param0);
          if (param4 >= var5_int &&
            param0.indexOf("<br>") == -1) {
            param3[0] = param0;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (var5_int + param4 - 1) / param4;
          param4 = var5_int / var6;
          if (param1 != -9224) {
            field_g = (String) null;
          }
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param0.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param0.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param0.substring(var7, 1 + var9).trim();
              var12 = param2.b(var11);
              if (param4 <= var12) {
                var7 = var9 + 1;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param3[incrementValue$1] = var11;
              }
            }
            if (var10 == 62 &&
              param0.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param3[incrementValue$2] = param0.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param3[incrementValue$0] = param0.substring(var7, var8).trim();
          }
          stackIn_30_0 = var6Lifetime1;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("vm.W(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param4).append(')').toString());
        }
    }

    abstract String a(String param0, int param1);

    public final boolean b(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 14496) {
          this.field_j = (qn) null;
        }
        stackIn_7_0 = (this.field_j.field_v == null) || (this.field_j.field_v.length() == 0);
        return stackIn_7_0;
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        if (param0 <= 98) {
          field_k = 71;
        }
        int var2 = param1 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128 &&
          var2 < 160) {
          var3 = jn.field_M[-128 + var2];
          if (0 == var3) {
            var3 = 63;
          }
          var2 = var3;
        }
        return (char)var2;
    }

    static {
        field_i = new int[5];
        field_h = new jc();
        field_g = "Rankings";
    }
}
