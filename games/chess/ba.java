/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ma implements nn, mj {
    static String field_M;
    private se field_S;
    static java.applet.Applet field_L;
    static on field_O;
    private fb field_T;
    private vd field_K;
    static byte[] field_Q;
    static String field_N;
    static String field_R;
    static tl[][] field_P;

    private final String a(int param0) {
        if (param0 != 29917) {
          field_Q = (byte[]) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void c(boolean param0) {
        field_L = null;
        field_N = null;
        if (!param0) {
          field_O = null;
          field_M = null;
          field_P = (tl[][]) null;
          field_Q = null;
          field_R = null;
          return;
        }
        ak var2 = (ak) null;
        ba.a((ak) null, -29, 127);
        field_O = null;
        field_M = null;
        field_P = (tl[][]) null;
        field_Q = null;
        field_R = null;
    }

    final static void a(ak param0, int param1, int param2) {
        try {
          nc.field_O.a((o) (param0), (byte) 114);
          if (param1 > -58) {
            field_Q = (byte[]) null;
          }
          sj.a(0, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ba.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        int var5;
        String var5_ref_String;
        int var6;
        String var8;
        String var9;
        int var10;
        int var11;
        int var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var21;
        String var22;
        String var23;
        String var24;
        String var25;
        String var26;
        String var27;
        String var28;
        String var29;
        String var30;
        String var31;
        Object var32;
        CharSequence var33;
        int var6Lifetime1;
        var32 = null;
        var12 = Chess.field_G;
        var4 = 24 / ((param2 + 31) / 58);
        var3 = 1;
        if (!fl.field_j &&
          ac.field_l == null) {
          var3 = 0;
        }
        if (vk.field_g == 0 &&
          ib.field_d != null) {
          var3 = 0;
        }
        if (2 == vk.field_g &&
          !jd.b((byte) 75)) {
          var3 = 0;
        }
        if (vg.field_a == 84) {
          if (var3 == 0) {
            if (vk.field_g == 0) {
              return true;
            }
          } else {
            if (sg.field_c.length() > 0) {
              var5_ref_String = sg.field_c.toString();
              if (!ph.a((byte) -125, var5_ref_String)) {
                var6 = vk.field_g;
                if (var6 == 0 &&
                  pd.field_Rb != null) {
                  var6 = 1;
                }
                if (lg.a(-74, var6) == 2) {
                  oj.a(var6, (byte) -99, 1, param1);
                }
                ke.a(9822, vk.field_g, ij.field_c, param0, -1, var5_ref_String);
              } else {
                var14 = (String) null;
                var13 = (String) null;
                lc.a((String) null, (String) null, 2, 0, af.field_b, false);
                var16 = (String) null;
                var15 = (String) null;
                lc.a((String) null, (String) null, 2, 0, kd.field_Eb, false);
              }
            }
          }
          ml.a(0);
          return true;
        }
        if (85 == vg.field_a) {
          if (var3 != 0 &&
            sg.field_c.length() > 0) {
            rb.a(' ', sg.field_c, sg.field_c.length() - 1, (byte) 104);
          }
          return true;
        }
        var5 = d.field_Ib;
        if (!sj.a((byte) -122, (char) var5)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (80 <= sg.field_c.length()) {
          return true;
        }
        discarded$0 = sg.field_c.append((char) var5);
        var6Lifetime1 = 485;
        var18 = ci.field_J;
        var17 = on.a(-11307, var18);
        var19 = var17;
        if (2 == vk.field_g) {
          var33 = (CharSequence) ((Object) ij.field_c);
          var21 = oc.a(vf.field_d, new String[]{rl.a(var33, (byte) -70)}, (byte) -80);
          var9 = oc.a(sa.field_d, new String[]{var17}, (byte) -74);
          var10 = sc.field_a.b(var21);
          var11 = sc.field_a.b(var9);
          if (var10 <= var11) {
            var6Lifetime1 = var6Lifetime1 - var11;
            if (var6Lifetime1 >= sc.field_a.b(sg.field_c.toString())) {
              return true;
            }
            rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
            return true;
          }
          var6Lifetime1 = var6Lifetime1 - var10;
        } else {
          var8 = "";
          if (vk.field_g == 0) {
            if (null == pd.field_Rb) {
              if (!dn.field_b) {
                if (null == pd.field_Rb) {
                  var23 = var8 + var19 + ": ";
                  var6Lifetime1 = var6Lifetime1 - sc.field_a.b(var23);
                  if (var6Lifetime1 < sc.field_a.b(sg.field_c.toString())) {
                    rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                  }
                  return true;
                }
                if (!qj.field_d) {
                  var8 = "[" + oc.a(fb.field_D, new String[]{pd.field_Rb.field_Gb}, (byte) -125) + "] ";
                } else {
                  if (null == kb.field_P) {
                    var24 = "[" + oc.a(fb.field_D, new String[]{pd.field_Rb.field_Gb}, (byte) -125) + "] ";
                    var25 = var24 + var19 + ": ";
                    var6Lifetime1 = var6Lifetime1 - sc.field_a.b(var25);
                    if (var6Lifetime1 < sc.field_a.b(sg.field_c.toString())) {
                      rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                    }
                    return true;
                  }
                  var8 = "[" + kb.field_P + "] ";
                }
                var26 = var8 + var19 + ": ";
                var6Lifetime1 = var6Lifetime1 - sc.field_a.b(var26);
                if (var6Lifetime1 >= sc.field_a.b(sg.field_c.toString())) {
                  return true;
                }
                rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                return true;
              }
              var8 = "[" + ja.field_c + "] ";
            }
            if (null != pd.field_Rb) {
              if (!qj.field_d) {
                var29 = "[" + oc.a(fb.field_D, new String[]{pd.field_Rb.field_Gb}, (byte) -125) + "] ";
                var30 = var29 + var19 + ": ";
                var6Lifetime1 = var6Lifetime1 - sc.field_a.b(var30);
                if (var6Lifetime1 >= sc.field_a.b(sg.field_c.toString())) {
                  return true;
                }
                rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                return true;
              }
              if (null == kb.field_P) {
                var27 = "[" + oc.a(fb.field_D, new String[]{pd.field_Rb.field_Gb}, (byte) -125) + "] ";
                var28 = var27 + var19 + ": ";
                var6Lifetime1 = var6Lifetime1 - sc.field_a.b(var28);
                if (var6Lifetime1 >= sc.field_a.b(sg.field_c.toString())) {
                  return true;
                }
                rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                return true;
              }
              var8 = "[" + kb.field_P + "] ";
            }
            var31 = var8 + var19 + ": ";
            var6Lifetime1 = var6Lifetime1 - sc.field_a.b(var31);
            if (var6Lifetime1 >= sc.field_a.b(sg.field_c.toString())) {
              return true;
            }
            rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
            return true;
          }
          var22 = var8 + var19 + ": ";
          var6Lifetime1 = var6Lifetime1 - sc.field_a.b(var22);
        }
        if (var6Lifetime1 >= sc.field_a.b(sg.field_c.toString())) {
          return true;
        }
        rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
        return true;
    }

    ba(vd param0) {
        super(0, 0, 288, 0, (jm) null);
        String var7 = null;
        int var3 = 0;
        hl var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_K = param0;
          this.field_T = new fb(sg.field_e, (rg) null);
          this.field_T.field_n = (jm) ((Object) new sf());
          var7 = oc.a(kl.field_g, new String[]{this.a(29917), this.g((byte) -11)}, (byte) -114);
          var3 = 20;
          var4 = new hl(rb.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, rb.field_b.field_C, -1, 2147483647, true);
          this.field_S = new se(var7, var4);
          this.field_S.field_j = "";
          this.field_S.a(-23750, 0, ok.field_Gb);
          this.field_S.a(-23750, 1, ok.field_Gb);
          this.field_S.field_p = (rg) (this);
          this.field_S.field_y = -40 + this.field_y;
          this.field_S.b(26, var3, 1, -40 + this.field_y);
          var3 = var3 + (15 + this.field_S.field_C);
          this.b(this.field_S, 95);
          var5 = 4;
          var6 = 200;
          this.field_T.a(var3, 34, 40, var6, 300 - var6 >> 1);
          this.field_T.field_p = (rg) (this);
          this.b(this.field_T, 95);
          this.a(0, 34, var5 + 55 + var3, 300, 0);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        if (param4 != -24221) {
          return;
        }
        try {
          if (param0 == this.field_T) {
            ij.a(-128);
            this.field_K.k((byte) -123);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ba.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final String g(byte param0) {
        int var2 = 98 / ((param0 - 46) / 41);
        return "</col></u>";
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.a(param3, 27964);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param3, (byte) -73);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ba.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, se param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Chess.field_G;
        try {
          if (0 != param0) {
            if (param0 == 1) {
              hb.a("privacy.ws", (byte) -118);
            } else {
              if (param0 == 2) {
                hb.a("conduct.ws", (byte) -118);
              }
            }
          } else {
            hb.a("terms.ws", (byte) -118);
          }
          if (param1 != -108) {
            ba.b(55, 20, -68);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ba.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_M = "Offline";
        field_N = "Selected piece cannot move";
        field_R = "Elapsed time";
    }
}
