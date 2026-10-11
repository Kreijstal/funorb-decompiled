/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends am {
    static bd field_l;
    static ca field_i;
    int field_h;
    static bd field_j;
    static String[] field_k;

    final static boolean a(int param0, int param1, int param2) {
        int var3;
        int var4;
        var3 = 34 / ((-75 - param0) / 51);
        if (kh.field_U[param1] == param2) {
          return false;
        }
        if (!kh.field_Q[param2]) {
          return false;
        }
        if (kh.field_U[param1] == 3 &&
          f.a((byte) 119)) {
          eh.field_c.a(sf.field_V[36], 100, uh.field_i);
        }
        if (d.field_u > 0) {
          ci.field_a[param1] = th.field_Fb[param2];
        }
        var4 = -param1 + 1;
        if (param2 != 0 &&
          kh.field_U[var4] == param2 &&
          !kh.field_cb[param2]) {
          kh.field_U[var4] = 0;
        }
        kh.field_U[param1] = param2;
        if (uj.field_l == 1 &&
          null != sf.field_V[15 + param2]) {
          eh.field_c.a(sf.field_V[param2 + 15], 100, uh.field_i);
        }
        return true;
    }

    public static void d(int param0) {
        field_k = null;
        field_l = null;
        if (param0 != -15154) {
          return;
        }
        field_j = null;
        field_i = null;
    }

    final static void a(byte param0) {
        qg.field_r = sc.field_g.o(32);
        if (param0 <= 113) {
          field_k = (String[]) null;
        }
        CharSequence var2 = (CharSequence) ((Object) qg.field_r);
        se.field_c = mf.a(false, var2);
    }

    final static void c(int param0) {
        int var5 = 0;
        oj stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        double var1_double = 0.0;
        RuntimeException var1 = null;
        double var3 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        var18 = HostileSpawn.field_I ? 1 : 0;
        try {
          pc.field_c = -1 + vi.field_p.length;
          var1_double = (double)vi.field_p[0].field_j.field_e + vi.field_p[0].field_l.field_f - 1.0;
          var3 = -1.0 + (vi.field_p[0].field_l.field_a + (double)vi.field_p[0].field_j.field_g);
          if (param0 != -19706) {
            return;
          }
          for (var5 = 1; var5 < vi.field_p.length; var5++) {
            if (vi.field_p[var5] != null &&
              231 == vi.field_p[var5].field_i) {
              var6 = vi.field_p[var5].field_l.field_f + (double)vi.field_p[var5].field_j.field_e;
              var8 = vi.field_p[var5].field_l.field_a + (double)vi.field_p[var5].field_j.field_g;
              var10 = -var1_double + var6;
              var12 = var8 - var3;
              var14 = Math.sqrt(var10 * var10 + var12 * var12);
              if (var14 > 1.0) {
                var16 = el.a(var6, var1_double, 16, var8, var3);
                vi.field_p[var5].a(param0 + 19931, var16, 1);
                vi.field_p[var5].field_l.b(-1.0 + var14, var16, 106);
                vi.field_p[var5].b((byte) 117);
              }
              var1_double = var6;
              var3 = var8;
              continue;
            }
            pc.field_c = var5 - 1;
            break;
          }
          if (null != vi.field_p[0] &&
            vi.field_p[0].field_w != 5) {
            vi.field_p[0].field_o = (vi.field_p.length - pc.field_c) / 4 + 1;
            stackIn_16_0 = vi.field_p[0];
            stackIn_16_0.field_C = 16 / vi.field_p[0].field_o;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "t.D(" + param0 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param3 >= 0 &&
            ge.field_f > param5) {
            if (param8 < 0 &&
              param7 < 0 &&
              param4 < 0) {
              return;
            }
            if (param8 >= ge.field_h &&
              param7 >= ge.field_h &&
              param4 >= ge.field_h) {
              return;
            }
            var14 = param3 - param5;
            if (param6 == param5) {
              if (param3 == param5) {
                var10 = param7 << 16;
                var9_int = param8 << 16;
                var11 = 0;
                var12 = 0;
              } else {
                var15 = param3 - param6;
                if (param8 < param7) {
                  var10 = param7 << 16;
                  var12 = (-param7 + param4 << 16) / var15;
                  var9_int = param8 << 16;
                  var11 = (param4 - param8 << 16) / var14;
                } else {
                  var10 = param8 << 16;
                  var9_int = param7 << 16;
                  var12 = (param4 - param8 << 16) / var14;
                  var11 = (-param7 + param4 << 16) / var15;
                }
              }
              if (param5 < 0) {
                param5 = Math.min(-param5, param6 - param5);
                var9_int = var9_int + param5 * var11;
                var10 = var10 + var12 * param5;
                param5 = 0;
              }
              var13 = 0;
            } else {
              var10 = param8 << 16;
              var9_int = param8 << 16;
              var15 = -param5 + param6;
              var11 = (param7 - param8 << 16) / var15;
              var12 = (-param8 + param4 << 16) / var14;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param5 < 0) {
                if (param6 < 0) {
                  param5 = param6 - param5;
                  var10 = var10 + var12 * param5;
                  var9_int = var9_int + var11 * param5;
                  param5 = param6;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param5 = -param5;
                  var9_int = var9_int + var11 * param5;
                  var10 = var10 + var12 * param5;
                  param5 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = ge.field_e[param5];
                while (param5 < param6) {
                  var17 = var9_int >> 16;
                  if (ge.field_h > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 != 0) {
                      if (ge.field_h <= var17 + var18) {
                        var18 = -1 + ge.field_h - var17;
                      }
                      if (0 <= var17) {
                        jn.a(param0, var18, -1, param2, var16Lifetime2 + var17);
                      } else {
                        jn.a(param0, var18 + var17, -1, param2, var16Lifetime2);
                      }
                    } else {
                      if (var17 >= 0 &&
                        ge.field_h > var17) {
                        jn.a(param0, var18, -1, param2, var17 + var16Lifetime2);
                      }
                    }
                  }
                  param5++;
                  if (ge.field_f <= param5) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + si.field_e;
                }
              }
              var16Lifetime3 = param3 - param6;
              if (var16Lifetime3 == 0) {
                var11 = 0;
                var12 = 0;
              } else {
                if (var13 == 0) {
                  var9_int = param7 << 16;
                } else {
                  var10 = param7 << 16;
                }
                var17Lifetime2 = param4 << 16;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
              }
            }
            if (param5 < 0) {
              param5 = -param5;
              var9_int = var9_int + var11 * param5;
              var10 = var10 + param5 * var12;
              param5 = 0;
            }
            if (param1) {
              t.c(14);
            }
            var15Lifetime1 = ge.field_e[param5];
            while (param5 < param3) {
              var16Lifetime1 = var9_int >> 16;
              if (ge.field_h > var16Lifetime1) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 != 0) {
                  if (ge.field_h <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = -var16Lifetime1 + (ge.field_h - 1);
                  }
                  if (var16Lifetime1 < 0) {
                    jn.a(param0, var17Lifetime1 + var16Lifetime1, -1, param2, var15Lifetime1);
                  } else {
                    jn.a(param0, var17Lifetime1, -1, param2, var15Lifetime1 + var16Lifetime1);
                  }
                } else {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < ge.field_h) {
                    jn.a(param0, var17Lifetime1, -1, param2, var16Lifetime1 + var15Lifetime1);
                  }
                }
              }
              param5++;
              if (ge.field_f <= param5) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + si.field_e;
              var10 = var10 + var12;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_78_0 = var9;
          stackIn_78_1 = new StringBuilder().append("t.B(");
          if (param0 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    t(int param0) {
        this.field_h = param0;
    }

    static {
        field_i = null;
        field_k = new String[]{"Civilian", "Draftee", "Rookie", "Techie", "Squaddie", "Engineer", "Sergeant", "Marine", "Commando", "Elite Soldier", "Lone Wolf", "Elite Wolf", "Hero", "Elite Hero", "Slayer", "Slayer Elite", "Scourge", "Scourge Elite", "Spirit", "Vengeance"};
    }
}
