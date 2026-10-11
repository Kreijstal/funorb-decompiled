/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private BitmapFont field_h;
    private int field_s;
    static String field_v;
    static String field_p;
    private RgbSprite[] field_j;
    private int field_o;
    static String field_i;
    private RgbSprite[] field_k;
    static String field_l;
    private int field_u;
    private boolean field_q;
    SceneWidget field_a;
    private int field_n;
    private int field_g;
    static int field_d;
    private int field_m;
    static String field_b;
    static int field_t;
    private boolean field_w;
    static String field_f;
    private int field_e;
    private String field_c;
    private RgbSprite field_r;

    final void b(int param0) {
        if (param0 != -40) {
          this.a((byte) 57);
        }
        int var2 = ak.a(this.field_r, this.field_g, this.field_c, this.field_u, this.field_o, param0 + 38, this.field_e, 1071146, this.field_q ? al.field_f : null, false);
        if (var2 >= 0) {
          if (!this.field_w) {
            CombatWorld.c(-2483, 97);
          }
          this.field_w = true;
        } else {
          this.field_w = false;
        }
        SceneWidget var3 = this.b((byte) 65);
        if (var3 != null) {
          if (this.field_j == null) {
            this.field_j = var3.field_I;
          }
          var3.field_I = 16 <= a.field_c % 32 ? this.field_k : this.field_j;
        }
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var4 = 0;
        int var4Lifetime1;
        bc.field_ub.a(param3, param0);
        if (param2) {
          var4 = 2 * (ik.field_e % bc.field_ub.field_A);
          if (var4 >= bc.field_ub.field_A) {
            var4 = bc.field_ub.field_A + (-var4 + bc.field_ub.field_A);
          }
          if (var4 < 10) {
            var4 = 10;
          } else {
            if (!(-40 + bc.field_ub.field_A >= var4)) {
              var4 = -40 + bc.field_ub.field_A;
            }
          }
          tk.a(param0, 80, 30, 0, 0, -30456, bc.field_ub, param3, var4);
        }
        var4Lifetime1 = -105 % ((param1 - 74) / 35);
    }

    final boolean a(int param0, int param1) {
        int var3;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        var3 = this.field_s;
        if (4 != var3 &&
          var3 != 6) {
          if (var3 == 11) {
            this.field_q = true;
            this.a(-67);
          } else if (var3 == 15 &&
            df.field_K) {
            this.field_q = true;
            this.a(-6);
          }
        } else {
          this.field_q = true;
          this.a(-67);
        }
        if (param1 > -110) {
          this.a(77);
        }
        return true;
    }

    private final SceneWidget b(byte param0) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        var2 = this.field_s;
        if (3 == var2) {
          return vb.field_a[1];
        }
        if (var2 == 5) {
          return vb.field_a[2];
        }
        if (10 == var2) {
          return vb.field_a[3];
        }
        if (14 == var2) {
          return vb.field_a[0];
        }
        if (param0 != 65) {
          field_f = (String) null;
        }
        return this.field_a;
    }

    sf(int param0, int param1, int param2, int param3, int param4, RgbSprite param5, boolean param6) {
        this(jm.field_u[param0], param1, param2, param3, param4, param5, param6);
        try {
          this.field_s = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final void a(byte param0) {
        kf.field_s = true;
        GameApplet.field_l = true;
        if (param0 <= 57) {
          field_d = 94;
        }
        SceneWidget var4 = this.b((byte) 65);
        SceneWidget var5 = var4;
        if (var5 != null &&
          null != this.field_j) {
          var5.field_I = this.field_j;
        }
        this.field_j = null;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
          field_d = 20;
        }
        field_l = null;
        field_b = null;
        field_p = null;
        field_i = null;
        field_v = null;
    }

    final boolean c(int param0) {
        kf.field_s = true;
        GameApplet.field_l = true;
        if (param0 <= 9) {
          return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2) {
        mg.field_kc = param1;
        int var3 = 78 % ((param0 + 41) / 56);
        kb.field_a = param2;
    }

    final static void a(int param0, int param1, int param2, RgbSprite param3, int param4, int param5) {
        int var10 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.obfuscationControl;
        try {
          param1 = param1 & 255;
          param2 = param2 & 255;
          var6_int = param3.field_z;
          var7 = param4 * var6_int;
          for (var10 = param4; var10 < param0; var10++) {
            var8 = (param2 * (param0 - var10) + (-param4 + var10) * param1) / (-param4 + param0);
            var8 = var8 * 65793;
            for (var9 = 0; var6_int > var9; var9++) {
              if (0 != param3.field_E[var7 + var9]) {
                param3.field_E[var9 + var7] = var8;
              }
            }
            var7 = var7 + var6_int;
          }
          var11 = -52 % ((35 - param5) / 37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("sf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0) {
        this.field_e = 2 * this.field_n;
        if (this.field_r != null) {
          this.field_e = this.field_e + (2 + this.field_r.field_F);
        }
        if (param0 >= -2) {
          field_b = (String) null;
        }
        if (this.field_c != null) {
          this.field_e = this.field_e + this.field_h.a(this.field_c, this.field_u - 2 * this.field_m, 0);
        }
        if (this.field_q) {
          this.field_e = this.field_e + 40;
        }
    }

    final static dm a(String param0, int param1) {
        RuntimeException var2 = null;
        dm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 16) {
            sf.$cfr$intArgs$a$c79a3df4369d(-116, 30, true, -66);
          }
          stackIn_3_0 = new dm(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("sf.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(rm param0, int param1) {
        int stackIn_27_0 = 0;
        boolean stackIn_58_0 = false;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        kg var7 = null;
        kg var8 = null;
        SceneWidget var9 = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          GameApplet.field_l = true;
          kf.field_s = true;
          if (this.field_q &&
            this.field_w) {
            CombatWorld.c(-2483, 95);
            rc.a(false);
          }
          if (param0.field_e == 3) {
            this.a((byte) 69);
            dc.field_g = -1;
            return true;
          }
          if (param1 != 23123) {
            this.a(115, -6);
          }
          var7 = bi.field_f;
          if (var7 != null &&
            null != var7.field_Sb &&
            var7.field_Sb.field_kb) {
            return true;
          }
          var8 = vd.field_a;
          if (var8 != null &&
            var8.field_Sb != null &&
            var8.field_Sb.field_kb) {
            return true;
          }
          var9 = this.b((byte) 65);
          if (var9 != null) {
            stackIn_27_0 = (var9.field_kb) ? 1 : 0;
          } else {
            stackIn_27_0 = 0;
          }
          var4 = stackIn_27_0;
          var5 = this.field_s;
          if (var5 == 1) {
            if (var4 != 0) {
              rc.a(false);
              return true;
            }
          } else {
            if (var5 != 3) {
              if (5 != var5) {
                if (var5 != 7) {
                  if (8 == var5) {
                    stackIn_58_0 = (null != lj.field_h);
                    return stackIn_58_0;
                  }
                  if (var5 == 10) {
                    if (var4 != 0) {
                      rc.a(false);
                      return true;
                    }
                  } else {
                    if (var5 == 12) {
                      if (df.field_K) {
                        rc.a(false);
                        return true;
                      }
                    } else {
                      if (14 == var5) {
                        if (var4 != 0) {
                          rc.a(false);
                          return true;
                        }
                      } else {
                        if (var5 != 16) {
                          return false;
                        }
                        if (448 <= pi.field_c) {
                          return true;
                        }
                      }
                    }
                  }
                } else {
                  if (var4 != 0) {
                    rc.a(false);
                    return true;
                  }
                }
              } else {
                if (var4 != 0) {
                  rc.a(false);
                  return true;
                }
              }
            } else {
              if (var4 != 0) {
                rc.a(false);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_78_0 = var3;
          stackIn_78_1 = new StringBuilder().append("sf.L(");
          if (param0 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param1).append(')').toString());
        }
    }

    private sf(String param0, int param1, int param2, int param3, int param4, RgbSprite param5, boolean param6) {
        this.field_h = (BitmapFont) ((Object) ff.field_lb);
        this.field_m = 8;
        this.field_k = bl.field_d;
        this.field_n = 5;
        this.field_s = -1;
        try {
          this.field_g = param2;
          this.field_o = param1;
          this.field_q = param6 ? true : false;
          this.field_c = param0;
          this.field_r = param5;
          this.field_u = param3;
          this.field_e = param4;
          if (this.field_e == 0) {
            this.a(-120);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    static {
        field_i = "to keep fullscreen or";
        field_p = "Achieved";
        field_d = 0;
        field_v = "EMP";
        field_b = "Advertising websites";
        field_l = "Rating";
        field_f = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c79a3df4369d(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        int var4Lifetime1;
        bc.field_ub.a(param3, param0);
        if (param2) {
          var4 = 2 * (ik.field_e % bc.field_ub.field_A);
          if (var4 >= bc.field_ub.field_A) {
            var4 = bc.field_ub.field_A + (-var4 + bc.field_ub.field_A);
          }
          if (var4 < 10) {
            var4 = 10;
          } else {
            if (!(-40 + bc.field_ub.field_A >= var4)) {
              var4 = -40 + bc.field_ub.field_A;
            }
          }
          tk.a(param0, 80, 30, 0, 0, -30456, bc.field_ub, param3, var4);
        }
        var4Lifetime1 = -105 % ((param1 - 74) / 35);
    }
}
