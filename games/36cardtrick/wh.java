/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static lb field_a;

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var3 = (String) null;
            wh.a((String) null, false);
          }
          stackIn_5_0 = (null != jf.a(0, param0));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("wh.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(uh param0, int param1, int param2, ad param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = Main.field_T;
        try {
          if (param0 != null &&
            param0.field_q != null &&
            param3 != null &&
            param3.field_r == param0.field_g) {
            var4_int = param3.field_o.length;
            if (param2 > -12) {
              field_a = (lb) null;
            }
            var5 = param0.field_q[param1].length / var4_int;
            for (var6 = 0; var5 > var6; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (~param3.field_h == ~param0.field_j[param1][var6] &&
                rc.a(true, param0.field_m[param1][var6])) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param0.field_q[param1][var6 * var4_int + var7] != param3.field_o[var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_20_0 = var6;
                  return stackIn_20_0;
                }
              }
            }
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("wh.F(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void a(String[] args, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != db.field_a) {
            db.field_a.field_L.a(param1 ^ -84, args);
          }
          if (param1 != 61) {
            field_a = (lb) null;
          }
          if (ti.field_e != null) {
            ti.field_e.field_I.a(-102, args);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("wh.D(");
          if (args == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              var3 = var2.indexOf((int) (char)param1);
              var4Lifetime2 = "reload.ws";
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
              param0.getAppletContext().showDocument(fh.a(param0, var5, -1), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("wh.G(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        mi.field_c[91] = 42;
        mi.field_c[45] = 26;
        mi.field_c[47] = 73;
        mi.field_c[61] = 27;
        mi.field_c[92] = 74;
        mi.field_c[44] = 71;
        mi.field_c[59] = 57;
        mi.field_c[93] = 43;
        mi.field_c[46] = 72;
        mi.field_c[520] = 59;
        mi.field_c[param0] = 28;
        mi.field_c[222] = 58;
    }

    final static void a(byte[] param0, int param1, int param2, int[] param3, byte param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        java.applet.Applet var8 = null;
        var7 = Main.field_T;
        try {
          if (param4 <= 1) {
            var8 = (java.applet.Applet) null;
            wh.a((java.applet.Applet) null, -28);
          }
          var5_int = 0;
          while (true) {
            if (mb.field_c.length <= var5_int) {
              return;
            }
            param2 = mb.field_c[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param2;
              param2--;
              if (0 == incrementValue$0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param1 = lf.field_a[incrementValue$1];
              dupTemp$2 = param0[param1];
              dupTemp$3 = param3[dupTemp$2];
              param3[dupTemp$2] = dupTemp$3 + 1;
              lf.field_a[dupTemp$3] = param1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wh.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 <= 115) {
          field_a = (lb) null;
        }
        field_a = null;
    }

    final static String a(byte param0) {
        if (param0 != -108) {
          wh.a((byte) -115);
        }
        if (k.field_b) {
          return null;
        }
        if (Main.field_G < ek.field_e) {
          return null;
        }
        if (Main.field_G >= ek.field_e + ra.field_e) {
          return null;
        }
        return t.field_e;
    }

    static {
    }
}
