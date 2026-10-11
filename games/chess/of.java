/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    int field_f;
    static String field_b;
    private int field_d;
    static int field_g;
    private int field_l;
    private int field_a;
    int field_h;
    static int field_k;
    private int field_j;
    private int field_c;
    static ci field_i;
    boolean field_e;

    final void b(byte param0) {
        this.field_a = 0;
        if (param0 > -2) {
          return;
        }
        this.field_l = 0;
        this.field_j = 0;
        if (0 == this.field_c) {
          this.field_j = vg.field_a;
        }
    }

    final boolean c(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != 84) {
          this.a(61, -108, 32);
        }
        stackIn_9_0 = (this.field_l == 1) || (this.field_j == 97) || (this.field_j == 84) || (this.field_j == 83);
        return stackIn_9_0;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= this.field_f) {
          throw new IllegalArgumentException();
        }
        if (this.field_f <= param0) {
          throw new IllegalArgumentException();
        }
        if (param1 != 99) {
          this.b(false);
        }
        this.field_l = 0;
        this.field_a = 0;
        this.field_j = 0;
        if (th.field_d != 0) {
          this.field_e = true;
          this.field_d = ji.field_R;
          this.field_l = th.field_d;
          this.field_a = th.field_d;
          this.field_h = param0;
          this.field_c = th.field_d;
        }
        if (this.field_c != 0 &&
          0 != wh.field_f) {
          if (this.field_d <= 0) {
            this.field_d = jh.field_f;
            this.field_l = this.field_c;
          }
          this.field_d = this.field_d - 1;
        }
        if (th.field_d == 0 &&
          0 == wh.field_f) {
          this.field_c = 0;
        }
        if (this.field_c == 0 && (this.field_e ||
          lf.field_O)) {
          if (param2 < 0) {
            if (this.field_e) {
              this.field_h = -1;
            }
          } else {
            if (param2 == this.field_h) {
            }
            this.field_h = param2;
            this.field_e = true;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.a(-1, param4, param2, param1, rf.field_b, hn.field_k, param3);
        int var7 = this.a(param0 - 62, param4, param2, param1, ag.field_f, re.field_m, param3);
        if (param0 != 61) {
          this.a(-57, 37, false, 100);
        }
        this.a(var7, 99, var6);
    }

    final boolean e(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 0) {
          return false;
        }
        stackIn_7_0 = (this.field_l == 2) || (this.field_j == 96);
        return stackIn_7_0;
    }

    final boolean b(int param0) {
        if (param0 != 97) {
          this.field_e = false;
        }
        return this.field_j == 97 ? true : false;
    }

    final static String a(String param0, int param1, String param2, int param3) {
        RuntimeException var4 = null;
        nk var5 = null;
        int var6 = 0;
        ve var7 = null;
        CharSequence var8 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param2);
          if (!ed.a(var8, 21257)) {
            stackIn_2_0 = qj.field_a;
            return stackIn_2_0;
          }
          if (2 != ld.field_g) {
            stackIn_6_0 = vf.field_e;
            return stackIn_6_0;
          }
          var7 = hh.a(param3 - 15023, param0);
          if (var7 == null) {
            stackIn_10_0 = oc.a(tl.field_Ib, new String[]{param0}, (byte) -90);
            return stackIn_10_0;
          }
          var7.c(-2193);
          var7.d(param3);
          wc.field_v = wc.field_v - 1;
          var5 = qn.field_U;
          var5.f(param1, -123);
          var5.field_l = var5.field_l + 1;
          var6 = var5.field_l;
          var5.c(3, (byte) -112);
          var5.a(-120, param2);
          var5.a(var5.field_l - var6, -1);
          stackIn_12_0 = null;
          return (String) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("of.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != -1) {
          this.c(-39);
        }
        if (param3 <= param5 && param5 < param2 && param4 >= param1 &&
          param6 * this.field_f + param1 > param4) {
          return (-param1 + param4) / param6;
        }
        return -1;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.field_c = param3;
        this.field_e = param2 ? true : false;
        if (!this.field_e) {
          this.field_h = param0;
        } else {
          this.field_h = param1;
        }
    }

    final void c(byte param0) {
        int var2 = -119 % ((param0 - 78) / 32);
        this.field_l = 0;
        this.field_j = 0;
        this.field_a = 0;
        if (this.field_c == 0 &&
          vg.field_a == 98) {
          if (this.field_h <= 0) {
            this.field_h = this.field_f;
          }
          this.field_e = false;
          this.field_h = this.field_h - 1;
        }
        if (this.field_c == 0) {
          this.field_j = vg.field_a;
        }
        if (this.field_c == 0 &&
          99 == vg.field_a) {
          this.field_h = this.field_h + 1;
          if (this.field_h >= this.field_f) {
            this.field_h = 0;
          }
          this.field_e = false;
        }
    }

    final static boolean a(java.applet.Applet param0, byte param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String var8 = null;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = Chess.field_G;
          try {
            if (ih.field_U) {
              return true;
            }
            try {
              if (param1 <= 61) {
                var8 = (String) null;
                of.a((String) null, 68, (String) null, 35);
              }
              var2 = "tuhstatbut";
              var3 = (String) (u.a(true, "getcookies", param0));
              var4 = gl.a((byte) -118, ';', var3);
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_19_0 = (null != param0.getParameter("tuhstatbut"));
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref2;
            stackIn_22_1 = new StringBuilder().append("of.S(");
            if (param0 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        if (param0 != 94) {
          return false;
        }
        return this.field_j == 102 ? true : false;
    }

    final static void d(int param0) {
        uk.field_e = false;
        ei.field_u = 0;
        eg.field_j = null;
        if (param0 != -103) {
          return;
        }
        vn.field_Db = -1;
        fm.field_S = -1;
    }

    final boolean b(boolean param0) {
        if (param0) {
          return true;
        }
        return this.field_c != 0 ? true : false;
    }

    final boolean d(byte param0) {
        java.applet.Applet var3;
        boolean stackIn_8_0 = false;
        if (param0 <= 31) {
          var3 = (java.applet.Applet) null;
          of.a((java.applet.Applet) null, (byte) -89);
        }
        stackIn_8_0 = (0 != this.field_a) || (this.field_j == 84) || (83 == this.field_j);
        return stackIn_8_0;
    }

    public static void c(boolean param0) {
        field_b = null;
        if (param0) {
          return;
        }
        field_i = null;
    }

    final static void a(boolean param0, int param1) {
        int var2 = -11 % ((-59 - param1) / 63);
        cf.a(83, true, param0);
    }

    final boolean a(int param0) {
        if (param0 != -97) {
          this.field_e = false;
        }
        return this.field_j == 96 ? true : false;
    }

    final static String a(int param0, int param1, String param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        String stackIn_36_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        java.applet.Applet var4 = null;
        try {
          if (1 == param0) {
            stackIn_3_0 = oc.a(ch.field_eb, new String[]{param2}, (byte) -93);
            return stackIn_3_0;
          }
          if (param0 == 2) {
            stackIn_6_0 = oc.a(ii.field_S, new String[]{param2}, (byte) -83);
            return stackIn_6_0;
          }
          if (param0 == 3) {
            stackIn_9_0 = oc.a(ng.field_a, new String[]{param2}, (byte) -121);
            return stackIn_9_0;
          }
          if (param1 != -26564) {
            var4 = (java.applet.Applet) null;
            of.a((java.applet.Applet) null, (byte) 31);
          }
          if (param0 == 4) {
            stackIn_14_0 = oc.a(bl.field_b, new String[]{param2}, (byte) -79);
            return stackIn_14_0;
          }
          if (5 == param0) {
            stackIn_18_0 = oc.a(dl.field_h, new String[]{param2}, (byte) -56);
            return stackIn_18_0;
          }
          if (param0 == 6) {
            stackIn_21_0 = oc.a(wc.field_y, new String[]{param2}, (byte) -93);
            return stackIn_21_0;
          }
          if (7 == param0) {
            stackIn_25_0 = oc.a(ih.field_V, new String[]{param2}, (byte) -64);
            return stackIn_25_0;
          }
          if (param0 == 8) {
            stackIn_28_0 = oc.a(n.field_a, new String[]{param2}, (byte) -47);
            return stackIn_28_0;
          }
          if (11 == param0) {
            stackIn_32_0 = oc.a(sk.field_o, new String[]{param2}, (byte) -64);
            return stackIn_32_0;
          }
          if (param0 == 12) {
            stackIn_36_0 = oc.a(he.field_Lb, new String[]{param2}, (byte) -85);
            return stackIn_36_0;
          }
          if (param0 != 13) {
            return null;
          }
          stackIn_40_0 = oc.a(gf.field_c, new String[]{param2}, (byte) -121);
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("of.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return 103 == this.field_j ? true : false;
    }

    of(int param0) {
        this.field_h = 0;
        this.field_e = false;
        this.field_f = param0;
    }

    static {
        field_b = "You need a rating of <%1> to play with the current options.";
    }
}
