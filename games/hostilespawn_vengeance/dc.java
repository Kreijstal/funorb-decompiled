/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static String field_c;
    static bd field_b;
    static ub field_e;
    static bd[] field_a;
    static volatile int field_d;

    final static void a(byte param0) {
        im.field_e.f((byte) 32);
        if (param0 < -83) {
          if (hj.field_t == null) {
            hj.field_t = new pe(im.field_e, se.field_g);
          }
          im.field_e.c(hj.field_t, 108);
          return;
        }
        java.awt.Component var2 = (java.awt.Component) null;
        dc.a((java.awt.Component) null, (byte) 101);
        if (hj.field_t == null) {
          hj.field_t = new pe(im.field_e, se.field_g);
        }
        im.field_e.c(hj.field_t, 108);
    }

    final static void a(byte param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var6Lifetime4;
        int var7Lifetime5;
        int var6Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (tk.field_e < 0) {
          return;
        }
        var3 = param2 - 135;
        var4 = -35 + param1;
        var5 = 256;
        if (75 > tk.field_e) {
          var5 = (tk.field_e << 8) / 75;
        }
        if (tk.field_e > 200) {
          var5 = (-tk.field_e + 250 << 8) / 50;
        }
        sb.a(il.field_f, -120);
        ge.b();
        si.d();
        uc.b(-45);
        if (var5 >= 256) {
          eh.b(false);
          if (150 > tk.field_e) {
            il.field_f.f(var3, var4);
          } else {
            ob.field_C.b(var3 + 15, 10 + var4, var5);
          }
          var6 = tk.field_e - 125;
          if (var6 > 0 &&
            var6 < 50) {
            if (20 <= var6) {
              if (var6 < 30) {
                ti.field_c.c(var3, var4, 256);
              } else {
                var7 = (-(256 * var6) + 12800) / 20;
                ti.field_c.c(var3, var4, var7);
              }
            } else {
              var7 = var6 * 256 / 20;
              ti.field_c.c(var3, var4, var7);
            }
          }
          if (param0 != 11) {
            return;
          }
          var6Lifetime4 = tk.field_e - 140;
          if (var6Lifetime4 > 0) {
            var7Lifetime5 = 256;
            if (var6Lifetime4 < 20) {
              var7Lifetime5 = 256 * var6Lifetime4 / 20;
            }
            ki.field_e.b(var3 + 15, var4 + 10, var7Lifetime5 * var5 >> 8);
          }
          return;
        }
        si.a(0, 0, si.field_e, si.field_k, 0, -var5 + 256);
        eh.b(false);
        if (150 <= tk.field_e) {
          ob.field_C.b(var3 + 15, 10 + var4, var5);
          var6Lifetime1 = tk.field_e - 125;
          if (var6Lifetime1 > 0 &&
            var6Lifetime1 < 50) {
            if (20 <= var6Lifetime1) {
              if (var6Lifetime1 < 30) {
                ti.field_c.c(var3, var4, 256);
              } else {
                var7Lifetime1 = (-(256 * var6Lifetime1) + 12800) / 20;
                ti.field_c.c(var3, var4, var7Lifetime1);
              }
            } else {
              var7Lifetime1 = var6Lifetime1 * 256 / 20;
              ti.field_c.c(var3, var4, var7Lifetime1);
            }
          }
          if (param0 != 11) {
            return;
          }
          var6Lifetime1Lifetime1 = tk.field_e - 140;
          if (var6Lifetime1Lifetime1 > 0) {
            var7Lifetime1Lifetime1 = 256;
            if (var6Lifetime1Lifetime1 < 20) {
              var7Lifetime1Lifetime1 = 256 * var6Lifetime1Lifetime1 / 20;
            }
            ki.field_e.b(var3 + 15, var4 + 10, var7Lifetime1Lifetime1 * var5 >> 8);
          }
          return;
        }
        il.field_f.f(var3, var4);
        var6Lifetime2 = tk.field_e - 125;
        if (var6Lifetime2 <= 0) {
          if (param0 != 11) {
            return;
          }
          var6Lifetime2 = tk.field_e - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime2 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime2 = 256 * var6Lifetime2 / 20;
            }
            ki.field_e.b(var3 + 15, var4 + 10, var7Lifetime2 * var5 >> 8);
          }
          return;
        }
        if (var6Lifetime2 < 50) {
          if (20 > var6Lifetime2) {
            var7Lifetime3 = var6Lifetime2 * 256 / 20;
            ti.field_c.c(var3, var4, var7Lifetime3);
          } else {
            if (var6Lifetime2 < 30) {
              ti.field_c.c(var3, var4, 256);
            } else {
              var7Lifetime3 = (-(256 * var6Lifetime2) + 12800) / 20;
              ti.field_c.c(var3, var4, var7Lifetime3);
            }
          }
        }
        if (param0 != 11) {
          return;
        }
        var6Lifetime3 = tk.field_e - 140;
        if (var6Lifetime3 > 0) {
          var7Lifetime4 = 256;
          if (var6Lifetime3 < 20) {
            var7Lifetime4 = 256 * var6Lifetime3 / 20;
          }
          ki.field_e.b(var3 + 15, var4 + 10, var7Lifetime4 * var5 >> 8);
        }
        return;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          if (param0 <= 39) {
            field_c = (String) null;
          }
          var3 = new byte[var2_int];
          kf.a(param1, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.addMouseListener(jc.field_b);
        param0.addMouseMotionListener(jc.field_b);
        if (param1 != 48) {
          return;
        }
        try {
          param0.addFocusListener(jc.field_b);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "dc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        if (param0 == 256) {
          field_c = null;
          field_a = null;
          return;
        }
        field_a = (bd[]) null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              if (param0 < 60) {
                return;
              }
              param1.getAppletContext().showDocument(nj.a(param1, true, var2), "_top");
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
            stackIn_8_1 = new StringBuilder().append("dc.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_e = new ub();
        field_d = 0;
        field_a = new bd[222];
    }
}
