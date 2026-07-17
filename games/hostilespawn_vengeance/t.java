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
        int var3 = 34 / ((-75 - param0) / 51);
        if (kh.field_U[param1] == param2) {
            return false;
        }
        if (!kh.field_Q[param2]) {
            return false;
        }
        if (kh.field_U[param1] == 3) {
            int discarded$3 = 119;
            if (f.a()) {
                eh.field_c.a(sf.field_V[36], 100, uh.field_i);
            }
        }
        if (d.field_u > 0) {
            ci.field_a[param1] = th.field_Fb[param2];
        }
        int var4 = -param1 + 1;
        if (param2 != 0) {
            if (~kh.field_U[var4] == ~param2) {
                if (!(kh.field_cb[param2])) {
                    kh.field_U[var4] = 0;
                }
            }
        }
        kh.field_U[param1] = param2;
        if (uj.field_l == 1) {
            if (null != sf.field_V[15 + param2]) {
                eh.field_c.a(sf.field_V[param2 + 15], 100, uh.field_i);
            }
        }
        return true;
    }

    public static void d() {
        field_k = null;
        field_l = null;
        field_j = null;
        field_i = null;
    }

    final static void a() {
        qg.field_r = sc.field_g.o(32);
        CharSequence var2 = (CharSequence) (Object) qg.field_r;
        se.field_c = mf.a(false, var2);
    }

    final static void c() {
        RuntimeException var1 = null;
        double var1_double = 0.0;
        double var3 = 0.0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        RuntimeException decompiledCaughtException = null;
        var18 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            pc.field_c = -1 + vi.field_p.length;
            var1_double = (double)vi.field_p[0].field_j.field_e + vi.field_p[0].field_l.field_f - 1.0;
            var3 = -1.0 + (vi.field_p[0].field_l.field_a + (double)vi.field_p[0].field_j.field_g);
            var5 = 1;
            L1: while (true) {
              L2: {
                if (var5 >= vi.field_p.length) {
                  break L2;
                } else {
                  L3: {
                    if (vi.field_p[var5] == null) {
                      break L3;
                    } else {
                      if (231 == vi.field_p[var5].field_i) {
                        L4: {
                          var6 = vi.field_p[var5].field_l.field_f + (double)vi.field_p[var5].field_j.field_e;
                          var8 = vi.field_p[var5].field_l.field_a + (double)vi.field_p[var5].field_j.field_g;
                          var10 = -var1_double + var6;
                          var12 = var8 - var3;
                          var14 = Math.sqrt(var10 * var10 + var12 * var12);
                          if (var14 > 1.0) {
                            var16 = el.a(var6, var1_double, 16, var8, var3);
                            vi.field_p[var5].a(225, var16, 1);
                            vi.field_p[var5].field_l.b(-1.0 + var14, var16, 106);
                            vi.field_p[var5].b((byte) 117);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var1_double = var6;
                        var3 = var8;
                        var5++;
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  pc.field_c = var5 - 1;
                  break L2;
                }
              }
              L5: {
                if (null == vi.field_p[0]) {
                  break L5;
                } else {
                  if (vi.field_p[0].field_w == 5) {
                    break L5;
                  } else {
                    vi.field_p[0].field_o = (vi.field_p.length + -pc.field_c) / 4 + 1;
                    vi.field_p[0].field_C = 16 / vi.field_p[0].field_o;
                    break L5;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "t.D(" + -19706 + 41);
        }
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var19 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 0) {
                break L1;
              } else {
                if (~ge.field_f < ~param5) {
                  L2: {
                    if (param8 >= 0) {
                      break L2;
                    } else {
                      if (param7 >= 0) {
                        break L2;
                      } else {
                        if (param4 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param8 < ge.field_h) {
                      break L3;
                    } else {
                      if (~param7 > ~ge.field_h) {
                        break L3;
                      } else {
                        if (param4 < ge.field_h) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param3 + -param5;
                    if (param6 == param5) {
                      L5: {
                        if (param3 == param5) {
                          var10 = param7 << 16;
                          var9_int = param8 << 16;
                          var11 = 0;
                          var12 = 0;
                          break L5;
                        } else {
                          var15 = param3 - param6;
                          if (param8 < param7) {
                            var10 = param7 << 16;
                            var12 = (-param7 + param4 << 16) / var15;
                            var9_int = param8 << 16;
                            var11 = (param4 - param8 << 16) / var14;
                            break L5;
                          } else {
                            var10 = param8 << 16;
                            var9_int = param7 << 16;
                            var12 = (param4 - param8 << 16) / var14;
                            var11 = (-param7 + param4 << 16) / var15;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (param5 >= 0) {
                          break L6;
                        } else {
                          param5 = Math.min(-param5, param6 + -param5);
                          var9_int = var9_int + param5 * var11;
                          var10 = var10 + var12 * param5;
                          param5 = 0;
                          break L6;
                        }
                      }
                      var13 = 0;
                      break L4;
                    } else {
                      L7: {
                        var10 = param8 << 16;
                        var9_int = param8 << 16;
                        var15 = -param5 + param6;
                        var11 = (param7 + -param8 << 16) / var15;
                        var12 = (-param8 + param4 << 16) / var14;
                        if (var12 > var11) {
                          var13 = 0;
                          break L7;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (param5 < 0) {
                            if (param6 >= 0) {
                              param5 = -param5;
                              var9_int = var9_int + var11 * param5;
                              var10 = var10 + var12 * param5;
                              param5 = 0;
                              break L9;
                            } else {
                              param5 = param6 + -param5;
                              var10 = var10 + var12 * param5;
                              var9_int = var9_int + var11 * param5;
                              param5 = param6;
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var16 = ge.field_e[param5];
                        L10: while (true) {
                          if (~param5 <= ~param6) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 16;
                              if (ge.field_h <= var17) {
                                break L11;
                              } else {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (var18 != 0) {
                                  L12: {
                                    if (ge.field_h > var17 + var18) {
                                      break L12;
                                    } else {
                                      var18 = -1 + ge.field_h + -var17;
                                      break L12;
                                    }
                                  }
                                  if (0 <= var17) {
                                    jn.a(param0, var18, -1, param2, var16 + var17);
                                    break L11;
                                  } else {
                                    jn.a(param0, var18 + var17, -1, param2, var16);
                                    break L11;
                                  }
                                } else {
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (ge.field_h <= var17) {
                                      break L11;
                                    } else {
                                      jn.a(param0, var18, -1, param2, var17 - -var16);
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            param5++;
                            if (~ge.field_f >= ~param5) {
                              return;
                            } else {
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              var16 = var16 + si.field_e;
                              continue L10;
                            }
                          }
                        }
                      }
                      var16 = param3 - param6;
                      if (var16 == 0) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L13: {
                          if (var13 == 0) {
                            var9_int = param7 << 16;
                            break L13;
                          } else {
                            var10 = param7 << 16;
                            break L13;
                          }
                        }
                        var17 = param4 << 16;
                        var12 = (var17 + -var10) / var16;
                        var11 = (var17 - var9_int) / var16;
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (param5 >= 0) {
                      break L14;
                    } else {
                      param5 = -param5;
                      var9_int = var9_int + var11 * param5;
                      var10 = var10 + param5 * var12;
                      param5 = 0;
                      break L14;
                    }
                  }
                  var15 = ge.field_e[param5];
                  L15: while (true) {
                    if (~param5 <= ~param3) {
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 16;
                        if (~ge.field_h >= ~var16) {
                          break L16;
                        } else {
                          var17 = -(var9_int >> 16) + (var10 >> 16);
                          if (var17 != 0) {
                            L17: {
                              if (~ge.field_h >= ~(var17 + var16)) {
                                var17 = -var16 + (ge.field_h + -1);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var16 < 0) {
                              jn.a(param0, var17 - -var16, -1, param2, var15);
                              break L16;
                            } else {
                              jn.a(param0, var17, -1, param2, var15 + var16);
                              break L16;
                            }
                          } else {
                            if (var16 < 0) {
                              break L16;
                            } else {
                              if (var16 < ge.field_h) {
                                jn.a(param0, var17, -1, param2, var16 - -var15);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      param5++;
                      if (ge.field_f <= param5) {
                        return;
                      } else {
                        var15 = var15 + si.field_e;
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        continue L15;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var9;
            stackOut_74_1 = new StringBuilder().append("t.B(");
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L18;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L18;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 44 + 0 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    t(int param0) {
        ((t) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = null;
        field_k = new String[]{"Civilian", "Draftee", "Rookie", "Techie", "Squaddie", "Engineer", "Sergeant", "Marine", "Commando", "Elite Soldier", "Lone Wolf", "Elite Wolf", "Hero", "Elite Hero", "Slayer", "Slayer Elite", "Scourge", "Scourge Elite", "Spirit", "Vengeance"};
    }
}
