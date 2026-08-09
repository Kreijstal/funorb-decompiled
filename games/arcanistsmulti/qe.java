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
        RuntimeException var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 68) {
                break L1;
              } else {
                var5 = (String) null;
                qe.a((String) null, -87, (eg) null, (String) null);
                break L1;
              }
            }
            if (!param2.c(-10923)) {
              stackIn_5_0 = (String) (param3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param0 + " - " + param2.a((byte) 96) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("qe.F(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(dl param0, int param1, wk param2, int param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            StringBuilder stackIn_39_1 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            oh var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            var14 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
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
                L1: while (true) {
                  if (var5 >= var18.field_s) {
                    la.field_b.b(var18, -1);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param2.e((byte) -120);
                            if (-1 == (var6_int ^ -1)) {
                              break L4;
                            } else {
                              if (-2 == (var6_int ^ -1)) {
                                break L4;
                              } else {
                                if (2 != var6_int) {
                                  L5: {
                                    if ((var6_int ^ -1) == -4) {
                                      break L5;
                                    } else {
                                      if ((var6_int ^ -1) == -5) {
                                        break L5;
                                      } else {
                                        var5++;
                                        decompiledRegionSelector0 = 1;
                                        break L2;
                                      }
                                    }
                                  }
                                  var20 = param2.l(-1);
                                  var8 = param2.l(param3 ^ -1);
                                  var9 = param2.e((byte) 53);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (var9 <= var11_int) {
                                      L7: {
                                        var21 = new byte[var9][];
                                        var19 = var21;
                                        var11 = var19;
                                        if (-4 != (var6_int ^ -1)) {
                                          break L7;
                                        } else {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var12_int >= var9) {
                                              break L7;
                                            } else {
                                              var13 = param2.d(-10674);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param2.a((byte) 92, 0, var21[var12_int], var13);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      var18.field_o[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (var9 <= var17) {
                                          var18.field_g[var5] = param0.a(-30176, var8, var12, jl.a(var20, -110));
                                          var18.field_l[var5] = var21;
                                          break L3;
                                        } else {
                                          var12[var17] = jl.a(var10[var17], 33);
                                          var17++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param2.l(hh.a(param3, -1));
                                      var11_int++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L10: {
                            var16 = param2.l(param3 ^ -1);
                            var7 = var16;
                            var15 = param2.l(-1);
                            var8 = var15;
                            var9 = 0;
                            if (1 != var6_int) {
                              break L10;
                            } else {
                              var9 = param2.d(-10674);
                              break L10;
                            }
                          }
                          var18.field_o[var5] = var6_int;
                          var18.field_p[var5] = var9;
                          var18.field_n[var5] = param0.a((byte) -95, var15, jl.a(var16, -100));
                          break L3;
                        }
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_j[var5] = -1;
                        decompiledRegionSelector0 = 0;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_j[var5] = -2;
                        decompiledRegionSelector0 = 0;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_j[var5] = -3;
                        decompiledRegionSelector0 = 0;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_j[var5] = -4;
                        decompiledRegionSelector0 = 0;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_j[var5] = -5;
                        decompiledRegionSelector0 = 0;
                        break L15;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var5++;
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_36_0 = (RuntimeException) (var4);

                stackIn_36_1 = new StringBuilder().append("qe.A(");

                if (param0 == null) {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackIn_37_2 = "null";
                  break L16;
                } else {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackIn_37_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "null";
                  break L17;
                } else {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "{...}";
                  break L17;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ',' + param3 + ')');
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
            field_s = (String) null;
        }
        var3.c(param0, (byte) -85);
    }

    final static qb[] a(eg param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0.c(param2, 109);
              var5 = param0.a(param1, (byte) 39, var4_int);
              if (param3 >= 40) {
                break L1;
              } else {
                field_p = true;
                break L1;
              }
            }
            stackIn_3_0 = of.a(var4_int, (byte) -38, param0, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("qe.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static java.awt.Container a(int param0) {
        if (gk.field_c != null) {
            return (java.awt.Container) ((Object) gk.field_c);
        }
        if (param0 != -4) {
            field_o = 94;
        }
        return (java.awt.Container) ((Object) cd.e(param0 ^ -115));
    }

    public static void c(int param0) {
        field_l = null;
        field_r = null;
        field_j = null;
        if (param0 >= -53) {
            String var2 = (String) null;
            qe.a((eg) null, (String) null, (String) null, 12);
        }
        field_s = null;
        field_n = null;
        field_m = null;
        field_i = null;
    }

    qe(long param0, int param1, byte[] param2) {
        try {
            this.field_k = param2;
            this.field_g = param1;
            this.field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qe.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "This members-only spell will be unavailable in multiplayer games";
        field_l = "Creating your account";
        field_j = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_p = true;
        field_s = "The game has started!<br>Click 'Start' to enter.";
        field_n = "Now that the basic spells have been mastered, it is time to learn how to walk around the map.";
    }
}
