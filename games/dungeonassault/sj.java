/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sj extends rf {
    private int field_ab;
    private int field_gb;
    private int field_Z;
    static ad field_hb;
    private int field_X;
    private int field_Y;
    static int field_bb;
    private int field_fb;
    static int[] field_db;
    static String field_V;
    static String[] field_cb;
    static String field_W;
    static String field_eb;

    final static gd a(int param0, int param1, int param2, cn param3, nn param4) {
        cn var5 = null;
        RuntimeException var5_ref = null;
        cn var6 = null;
        cn var7 = null;
        cn var8 = null;
        gd var9 = null;
        gd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        gd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 82) {
                break L1;
              } else {
                field_hb = null;
                break L1;
              }
            }
            var5 = fk.a((byte) 36, param3, 192, 12690143);
            var6 = rb.a(16, var5, 255, (byte) -53);
            var7 = fk.a((byte) 36, param3, 192, 16744448);
            var8 = rb.a(16, var7, 16711680, (byte) 92);
            var9 = new gd(param3, var5, var6, var7, var8, param0, param2);
            param4.a(var9, (byte) -20);
            stackOut_2_0 = (gd) var9;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("sj.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    sj(ji param0, int param1, int param2) {
        super(param0, param1, param2);
        ((sj) this).field_ab = 0;
        ((sj) this).field_Z = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (0 >= param1) {
            ((sj) this).b(-15, param2, param0);
            return;
        }
        ((sj) this).field_Y = ((sj) this).field_s;
        ((sj) this).field_fb = ((sj) this).field_x;
        ((sj) this).field_X = param0;
        ((sj) this).field_gb = param2;
        ((sj) this).field_ab = 0;
        ((sj) this).field_Z = param1;
        if (param3 != 22284) {
            ((sj) this).h((byte) -56);
        }
    }

    void k(int param0) {
        if (param0 != 0) {
            sj.a(-37, 39, -112, 81, (String) null, (String) null);
        }
    }

    public static void g(byte param0) {
        field_hb = null;
        field_W = null;
        field_db = null;
        field_eb = null;
        field_V = null;
        field_cb = null;
    }

    final static String l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        if (param0 != 192) {
            pp discarded$0 = sj.a((cn) null, -120);
        }
        String var1 = "(" + wl.field_f + " " + oc.field_E + " " + rd.field_C + ") " + hc.field_c;
        if (0 < nj.field_b) {
            var1 = var1 + ":";
            for (var2 = 0; var2 < nj.field_b; var2++) {
                var1 = var1 + 32;
                var3 = 255 & ra.field_c.field_m[var2];
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (var4 >= 10) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                if (var3 < 10) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    final static pp a(cn param0, int param1) {
        cn var2 = null;
        RuntimeException var2_ref = null;
        cn var3 = null;
        cn var4 = null;
        pp stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        pp stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              jh.c();
              var2 = new cn(param0.field_y, param0.field_v);
              var3 = new cn(param0.field_y, param0.field_v);
              var2.e();
              param0.e(0, 0, 16744448);
              var3.e();
              param0.e(0, 0, 8421504);
              jh.b();
              var4 = rb.a(8, var2, 255, (byte) -116);
              if (param1 > 4) {
                break L1;
              } else {
                field_hb = null;
                break L1;
              }
            }
            stackOut_2_0 = new pp(param0, var3, var2, var4, 0, 30);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("sj.DA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    void h(byte param0) {
        if (!(((sj) this).field_Z > 0)) {
            return;
        }
        ((sj) this).b(119, ((sj) this).field_gb, ((sj) this).field_X);
        int var2 = -27 % ((param0 - 22) / 35);
        ((sj) this).field_Z = 0;
        ((sj) this).k(0);
    }

    boolean i(int param0) {
        ((sj) this).h((byte) -61);
        if (param0 != 462) {
            ((sj) this).h((byte) -64);
        }
        return super.i(param0);
    }

    boolean f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -90) {
            boolean discarded$0 = ((sj) this).i(-114);
        }
        if (((sj) this).field_Z <= 0) {
        } else {
            var2 = ((sj) this).field_X;
            var3 = ((sj) this).field_gb;
            int fieldTemp$1 = ((sj) this).field_ab + 1;
            ((sj) this).field_ab = ((sj) this).field_ab + 1;
            if (((sj) this).field_Z <= fieldTemp$1) {
                ((sj) this).field_Z = 0;
                ((sj) this).k(0);
            } else {
                var4 = ((sj) this).field_ab * (2 * ((sj) this).field_Z - ((sj) this).field_ab);
                var5 = ((sj) this).field_Z * ((sj) this).field_Z;
                var2 = (-((sj) this).field_fb + ((sj) this).field_X) * var4 / var5 + ((sj) this).field_fb;
                var3 = (((sj) this).field_gb - ((sj) this).field_Y) * var4 / var5 + ((sj) this).field_Y;
            }
            ((sj) this).b(15, var3, var2);
        }
        return super.f((byte) -90);
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, String param5) {
        ac var6 = gh.field_i[param1];
        if (!(var6 != null)) {
            return;
        }
        try {
            if (param3 != 32) {
                pp discarded$0 = sj.a((cn) null, 111);
            }
            var6.field_a = param4 == null ? null : hd.a(false, param2, "da_monster_" + param4);
            var6.field_p = param5 != null ? hd.a(false, param0, "da_monster_" + param5) : null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sj.GA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 10) {
                break L1;
              } else {
                field_W = null;
                break L1;
              }
            }
            stackOut_2_0 = ah.a(param0, 10, true, (byte) -42);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("sj.EA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = DungeonAssault.field_K;
        gf.c(6 + param1, param0 - -35, ((sj) this).field_x - 12, -40 + ((sj) this).field_s, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (var4 <= var7) {
            var6 = 169;
            var4 = 22;
            var5 = 194;
            var7 = 0;
            var8 = 35 + param0;
            L1: while (true) {
              if (var4 <= var7) {
                L2: {
                  bl.field_e.h(((sj) this).field_x + param1 + -90, param0 - -10);
                  jm.a(param1 - -5, ((sj) this).field_x + -10, gn.field_i, 0, 35 + param0);
                  jm.a(param1, ((sj) this).field_x, di.field_l, 0, ((sj) this).field_s + param0 - 22);
                  var6 = 127;
                  var4 = ((sj) this).field_s - 79;
                  var5 = 169;
                  var7 = 0;
                  var8 = param0 + 57;
                  if (!param2) {
                    break L2;
                  } else {
                    ((sj) this).h((byte) 25);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = var5 + var7 * (-var5 + var6) / var4;
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    gf.b(param1, var8, 6, var9);
                    gf.b(param1 + ((sj) this).field_x + -6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = (-var5 + var6) * var7 / var4 + var5;
                var9 = var9 | (var9 << 8 | var9 << 16);
                gf.b(param1, var8, 6, var9);
                gf.b(((sj) this).field_x + (param1 - 6), var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (var8 >= gf.field_f) {
              if (gf.field_e > var8) {
                L4: {
                  var9 = var5 + (-var5 + var6) * var7 / var4;
                  var10 = 0;
                  var11 = ((sj) this).field_x;
                  if (var7 > 20) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (-var7 + 20) * (-var7 + 20) - -((20 + -var10) * (20 + -var10));
                        if (var12 <= 462) {
                          if (420 <= var12) {
                            var13 = var9 * (462 - var12) / 42;
                            var13 = var13 | (var13 << 8 | var13 << 16);
                            gf.field_b[var8 * gf.field_i + (param1 - -var10)] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (20 < var7) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = (20 + -var7) * (20 - var7) - -(var13 * var13);
                          if (462 < var14) {
                            break L8;
                          } else {
                            if (var14 < 420) {
                              var12 = var11 - -1;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var15 = var9 * (-var14 + 462) / 42;
                              var15 = var15 | (var15 << 16 | var15 << 8);
                              gf.field_b[gf.field_i * var8 + param1 - -var11] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << 8 | var9 << 16);
                gf.b(param1 + var10, var8, var11 - var10, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = 64;
        field_hb = new ad(14, 0, 4, 1);
        field_W = "Dungeon and Stable";
        field_cb = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_eb = "While demon lords are still a raider's worst nightmare, pit demons are still very, very bad dreams.";
        field_V = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
