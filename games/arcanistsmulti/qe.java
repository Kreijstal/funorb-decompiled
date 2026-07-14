/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends pg {
    static qb[] field_i;
    int field_g;
    static String field_n;
    static boolean field_p;
    static String field_l;
    static String field_j;
    static String field_r;
    static int field_o;
    byte[] field_k;
    static String field_s;
    static int field_h;
    long field_q;
    static kc field_m;

    final static String a(String param0, int param1, eg param2, String param3) {
        if (param1 < 68) {
            Object var5 = null;
            String discarded$0 = qe.a((String) null, -87, (eg) null, (String) null);
        }
        if (!(param2.c(-10923))) {
            return param3;
        }
        return param0 + " - " + param2.a((byte) 96) + "%";
    }

    final static void a(dl param0, int param1, wk param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            oh var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            var14 = ArcanistsMulti.field_G ? 1 : 0;
            var18 = new oh();
            var18.field_s = param2.e((byte) 99);
            var18.field_m = param2.d(-10674);
            var18.field_p = new int[var18.field_s];
            var18.field_o = new int[var18.field_s];
            var18.field_l = new byte[var18.field_s][][];
            var18.field_n = new og[var18.field_s];
            var18.field_g = new og[var18.field_s];
            var18.field_j = new int[var18.field_s];
            var5 = param3;
            L0: while (true) {
              if (var5 >= var18.field_s) {
                var6_ref4 = decompiledCaughtException;
                var18.field_j[var5] = -5;
                var5++;
              } else {
                try {
                  L1: {
                    L2: {
                      var6_int = param2.e((byte) -120);
                      if (-1 == var6_int) {
                        break L2;
                      } else {
                        if (-2 == var6_int) {
                          break L2;
                        } else {
                          if (2 != var6_int) {
                            L3: {
                              if ((var6_int ^ -1) == -4) {
                                break L3;
                              } else {
                                if ((var6_int ^ -1) == -5) {
                                  break L3;
                                } else {
                                  var5++;
                                  break L1;
                                }
                              }
                            }
                            var20 = param2.l(-1);
                            var8 = param2.l(param3 ^ -1);
                            var9 = param2.e((byte) 53);
                            var10 = new String[var9];
                            var11_int = 0;
                            L4: while (true) {
                              if (var9 <= var11_int) {
                                L5: {
                                  var23 = new byte[var9][];
                                  var22 = var23;
                                  var21 = var22;
                                  var19 = var21;
                                  var11 = var19;
                                  if (-4 != (var6_int ^ -1)) {
                                    break L5;
                                  } else {
                                    var12_int = 0;
                                    L6: while (true) {
                                      if (var12_int >= var9) {
                                        break L5;
                                      } else {
                                        var13 = param2.d(-10674);
                                        var11[var12_int] = new byte[var13];
                                        param2.a((byte) 92, 0, var23[var12_int], var13);
                                        var12_int++;
                                        continue L6;
                                      }
                                    }
                                  }
                                }
                                var18.field_o[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L7: while (true) {
                                  if (var9 <= var17) {
                                    var18.field_g[var5] = param0.a(-30176, var8, var12, jl.a(var20, -110));
                                    var18.field_l[var5] = var23;
                                    break L1;
                                  } else {
                                    var12[var17] = jl.a(var10[var17], 33);
                                    var17++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var10[var11_int] = param2.l(hh.a(param3, -1));
                                var11_int++;
                                continue L4;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L8: {
                      var16 = param2.l(param3 ^ -1);
                      var7 = var16;
                      var15 = param2.l(-1);
                      var8 = var15;
                      var9 = 0;
                      if (1 != var6_int) {
                        break L8;
                      } else {
                        var9 = param2.d(-10674);
                        break L8;
                      }
                    }
                    var18.field_o[var5] = var6_int;
                    var18.field_p[var5] = var9;
                    var18.field_n[var5] = param0.a((byte) -95, var15, jl.a(var16, -100));
                    var5++;
                    break L1;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_j[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_j[var5] = -4;
                  var5++;
                }
                continue L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1, int param2) {
        ab var3 = he.field_e;
        var3.b((byte) -49, param2);
        var3.f(3, (byte) -76);
        var3.f(10, (byte) -105);
        if (param1 != -35) {
            field_s = null;
        }
        var3.c(param0, (byte) -85);
    }

    final static qb[] a(eg param0, String param1, String param2, int param3) {
        int var4 = param0.c(param2, 109);
        int var5 = param0.a(param1, (byte) 39, var4);
        if (param3 < 40) {
            field_p = true;
        }
        return of.a(var4, (byte) -38, param0, var5);
    }

    final static java.awt.Container a(int param0) {
        if (gk.field_c != null) {
            return (java.awt.Container) (Object) gk.field_c;
        }
        if (param0 != -4) {
            field_o = 94;
        }
        return (java.awt.Container) (Object) cd.e(param0 ^ -115);
    }

    public static void c(int param0) {
        field_l = null;
        field_r = null;
        field_j = null;
        if (param0 >= -53) {
            Object var2 = null;
            qb[] discarded$0 = qe.a((eg) null, (String) null, (String) null, 12);
        }
        field_s = null;
        field_n = null;
        field_m = null;
        field_i = null;
    }

    qe(long param0, int param1, byte[] param2) {
        ((qe) this).field_k = param2;
        ((qe) this).field_g = param1;
        ((qe) this).field_q = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "This members-only spell will be unavailable in multiplayer games";
        field_l = "Creating your account";
        field_j = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_p = true;
        field_s = "The game has started!<br>Click 'Start' to enter.";
        field_n = "Now that the basic spells have been mastered, it is time to learn how to walk around the map.";
    }
}
