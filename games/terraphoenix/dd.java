/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends eb {
    static int[] field_L;
    static int field_M;
    private int field_P;
    static String[] field_O;
    private rc field_K;
    static String field_N;

    final boolean a(byte param0, gl param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 2) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("dd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean f(byte param0) {
        if (param0 == 105) {
          return pe.field_a == ua.field_d ? true : false;
        }
        dd.g((byte) -23);
        return pe.field_a == ua.field_d ? true : false;
    }

    final String f(int param0) {
        if (this.field_s) {
          return this.field_K.b((byte) 126);
        }
        if (param0 <= 70) {
          field_L = (int[]) null;
          return null;
        }
        return null;
    }

    final static q a(byte param0, String param1) {
        String var2 = null;
        q var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        q stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Terraphoenix.field_V;
        try {
          if (gb.field_z == null) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            stackIn_7_0 = null;
            return (q) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = hm.a(param0, var6);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (q) (stackIn_10_0);
          }
          var3 = (q) (gb.field_z.a(71, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Lb);
            var4 = hm.a((byte) 124, var7);
            if (var4.equals(var2)) {
              stackIn_17_0 = var3;
              return stackIn_17_0;
            }
            var3 = (q) (gb.field_z.c((byte) -66));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("dd.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void a(gl param0, int param1, int param2, int param3) {
        this.field_P = this.field_P + 1;
        if (param3 < 25) {
          return;
        }
        try {
          super.a(param0, param1, param2, 26);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void g(byte param0) {
        field_N = null;
        field_L = null;
        if (param0 < 106) {
          return;
        }
        field_O = null;
    }

    dd(rc param0) {
        try {
          this.field_K = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        im var8;
        int var9;
        int var10;
        int var11;
        ci var15;
        ci var16;
        ci var17;
        ci var18;
        ci var19;
        ci var20;
        ci var21;
        ci var22;
        int var6Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var9Lifetime3;
        int var10Lifetime3;
        im var8Lifetime1;
        var11 = Terraphoenix.field_V;
        super.a(param0, -114, param2, param3);
        if (param2 != 0) {
          return;
        }
        var5 = (this.field_p >> 1) + param0 + this.field_w;
        if (param1 <= -106) {
          var6 = (this.field_n >> 1) + (param3 + this.field_u);
          var8 = this.field_K.a(-16323);
          if (kj.field_d == var8) {
            var16 = og.field_c[0];
            var9 = var16.field_q << 1;
            var10 = var16.field_u << 1;
            if (ld.field_c == null) {
              ld.field_c = new ci(var9, var10);
              il.a(1, ld.field_c);
            } else {
              if (var9 > ld.field_c.field_r) {
                ld.field_c = new ci(var9, var10);
                il.a(1, ld.field_c);
              } else {
                if (var10 <= ld.field_c.field_t) {
                  il.a(1, ld.field_c);
                  l.a();
                } else {
                  ld.field_c = new ci(var9, var10);
                  il.a(1, ld.field_c);
                }
              }
            }
            var16.b(112, 144, var16.field_q << 4, var16.field_u << 4, -this.field_P << 10, 4096);
            ij.a(false);
            ld.field_c.d(var5 - var16.field_q, -var16.field_u + var6, 256);
            return;
          }
          if (oh.field_b != var8) {
            if (qf.field_d == var8) {
              var17 = og.field_c[2];
              var17.d(var5 - (var17.field_r >> 1), var6 - (var17.field_t >> 1), 256);
              return;
            }
            if (dg.field_c != var8) {
              return;
            }
            var18 = og.field_c[1];
            var18.d(-(var18.field_r >> 1) + var5, var6 - (var18.field_t >> 1), 256);
            return;
          }
          var15 = og.field_c[0];
          var9Lifetime3 = var15.field_q << 1;
          var10Lifetime3 = var15.field_u << 1;
          if (ld.field_c != null &&
            var9Lifetime3 <= ld.field_c.field_r &&
            var10Lifetime3 <= ld.field_c.field_t) {
            il.a(1, ld.field_c);
            l.a();
          } else {
            ld.field_c = new ci(var9Lifetime3, var10Lifetime3);
            il.a(1, ld.field_c);
          }
          var15.b(112, 144, var15.field_q << 4, var15.field_u << 4, -this.field_P << 10, 4096);
          ij.a(false);
          ld.field_c.d(var5 - var15.field_q, -var15.field_u + var6, 256);
          return;
        }
        field_O = (String[]) null;
        var6Lifetime1 = (this.field_n >> 1) + (param3 + this.field_u);
        var8Lifetime1 = this.field_K.a(-16323);
        if (kj.field_d == var8Lifetime1) {
          var20 = og.field_c[0];
          var9Lifetime1 = var20.field_q << 1;
          var10Lifetime1 = var20.field_u << 1;
          if (ld.field_c == null) {
            ld.field_c = new ci(var9Lifetime1, var10Lifetime1);
            il.a(1, ld.field_c);
          } else {
            if (var9Lifetime1 > ld.field_c.field_r) {
              ld.field_c = new ci(var9Lifetime1, var10Lifetime1);
              il.a(1, ld.field_c);
            } else {
              if (var10Lifetime1 <= ld.field_c.field_t) {
                il.a(1, ld.field_c);
                l.a();
              } else {
                ld.field_c = new ci(var9Lifetime1, var10Lifetime1);
                il.a(1, ld.field_c);
              }
            }
          }
          var20.b(112, 144, var20.field_q << 4, var20.field_u << 4, -this.field_P << 10, 4096);
          ij.a(false);
          ld.field_c.d(var5 - var20.field_q, -var20.field_u + var6Lifetime1, 256);
          return;
        }
        if (oh.field_b != var8Lifetime1) {
          if (qf.field_d == var8Lifetime1) {
            var21 = og.field_c[2];
            var21.d(var5 - (var21.field_r >> 1), var6Lifetime1 - (var21.field_t >> 1), 256);
            return;
          }
          if (dg.field_c != var8Lifetime1) {
            return;
          }
          var22 = og.field_c[1];
          var22.d(-(var22.field_r >> 1) + var5, var6Lifetime1 - (var22.field_t >> 1), 256);
          return;
        }
        var19 = og.field_c[0];
        var9Lifetime2 = var19.field_q << 1;
        var10Lifetime2 = var19.field_u << 1;
        if (ld.field_c == null) {
          ld.field_c = new ci(var9Lifetime2, var10Lifetime2);
          il.a(1, ld.field_c);
        } else {
          if (var9Lifetime2 <= ld.field_c.field_r &&
            var10Lifetime2 <= ld.field_c.field_t) {
            il.a(1, ld.field_c);
            l.a();
          } else {
            ld.field_c = new ci(var9Lifetime2, var10Lifetime2);
            il.a(1, ld.field_c);
          }
        }
        var19.b(112, 144, var19.field_q << 4, var19.field_u << 4, -this.field_P << 10, 4096);
        ij.a(false);
        ld.field_c.d(var5 - var19.field_q, -var19.field_u + var6Lifetime1, 256);
    }

    static {
        field_N = "Create a free account to start using this feature";
        field_M = 4;
        field_O = new String[]{"Game console", "<col=fcfe7f>SOLDIER TABS -</col> Click on a tab to select a soldier. The number denotes how much time they have left. The <img=0> icon shows that the soldier can see hostiles.", "<col=fcfe7f>SOLDIER PORTRAIT", "<col=fcfe7f>TIME REMAINING -</col> Time is used to perform all actions.", "<col=fcfe7f>HEALTH -</col> Yellow portions regenerate each turn.", "<col=fcfe7f>ARMOUR -</col> Armour deflects attacks.", "<col=fcfe7f>PRIMARY WEAPON -</col> Click here to toggle attack mode.", "<col=fcfe7f>SECONDARY WEAPON -</col> Click here to toggle attack mode.", "<col=fcfe7f>GRENADES -</col> Click here to toggle grenade mode.", "<col=fcfe7f>END TURN -</col> Ending the turn allows the enemy to move and replenishes your time.", "<col=fcfe7f>READY MODE", "<col=fcfe7f>SPRINT MODE", "<col=fcfe7f>SCHEMATIC MODE", "<col=fcfe7f>DOWN LEVEL", "<col=fcfe7f>UP LEVEL", "<col=fcfe7f>NEXT SOLDIER", "<col=fcfe7f>CENTRE ON SOLDIER"};
    }
}
