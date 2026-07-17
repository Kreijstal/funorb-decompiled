/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static String field_c;
    private int[] field_f;
    static ri field_b;
    static String field_h;
    static int field_a;
    static kc field_g;
    static oc field_d;
    static String field_e;

    public static void a() {
        field_b = null;
        field_h = null;
        field_c = null;
        field_g = null;
        field_e = null;
        field_d = null;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            hg.a(1, (java.awt.Component) (Object) param0);
            if (param1 >= 115) {
              L1: {
                int discarded$3 = 0;
                no.a((java.awt.Component) (Object) param0);
                if (null == nh.field_w) {
                  break L1;
                } else {
                  nh.field_w.a(-15238, (java.awt.Component) (Object) param0);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("n.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 > gi.field_a) {
          return;
        } else {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (gi.field_a < 75) {
              var5 = (gi.field_a << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (gi.field_a <= 200) {
              break L1;
            } else {
              var5 = (-gi.field_a + 250 << 8) / 50;
              break L1;
            }
          }
          L2: {
            fk.a(rc.field_h, -23095);
            id.a();
            de.b();
            int discarded$1 = 252566882;
            cg.f();
            if (var5 < 256) {
              de.e(0, 0, de.field_e, de.field_j, 0, -var5 + 256);
              break L2;
            } else {
              break L2;
            }
          }
          oo.c(-15405);
          if (gi.field_a >= 150) {
            mi.field_E.c(15 + var3, var4 + 10, var5);
            var6 = -125 + gi.field_a;
            if (param2 == 1) {
              if (0 < var6) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (30 > var6) {
                      L3: {
                        gi.field_k.b(var3, var4, 256);
                        var6 = gi.field_a + -140;
                        if (var6 > 0) {
                          L4: {
                            var7 = 256;
                            if (20 > var6) {
                              var7 = 256 * var6 / 20;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          gm.field_l.c(var3 - -15, var4 + 10, var5 * var7 >> 8);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      L5: {
                        var7 = (50 + -var6) * 256 / 20;
                        gi.field_k.b(var3, var4, var7);
                        var6 = gi.field_a + -140;
                        if (var6 > 0) {
                          L6: {
                            var7 = 256;
                            if (20 > var6) {
                              var7 = 256 * var6 / 20;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          gm.field_l.c(var3 - -15, var4 + 10, var5 * var7 >> 8);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return;
                    }
                  } else {
                    L7: {
                      var7 = 256 * var6 / 20;
                      gi.field_k.b(var3, var4, var7);
                      var6 = gi.field_a + -140;
                      if (var6 > 0) {
                        L8: {
                          var7 = 256;
                          if (20 > var6) {
                            var7 = 256 * var6 / 20;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        gm.field_l.c(var3 - -15, var4 + 10, var5 * var7 >> 8);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  L9: {
                    var6 = gi.field_a + -140;
                    if (var6 > 0) {
                      L10: {
                        var7 = 256;
                        if (20 > var6) {
                          var7 = 256 * var6 / 20;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      gm.field_l.c(var3 - -15, var4 + 10, var5 * var7 >> 8);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                L11: {
                  var6 = gi.field_a + -140;
                  if (var6 > 0) {
                    L12: {
                      var7 = 256;
                      if (20 > var6) {
                        var7 = 256 * var6 / 20;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    gm.field_l.c(var3 - -15, var4 + 10, var5 * var7 >> 8);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            rc.field_h.b(var3, var4);
            var6 = -125 + gi.field_a;
            if (param2 == 1) {
              if (0 < var6) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (30 > var6) {
                      L13: {
                        gi.field_k.b(var3, var4, 256);
                        var6 = gi.field_a + -140;
                        if (var6 > 0) {
                          L14: {
                            var7 = 256;
                            if (20 > var6) {
                              var7 = 256 * var6 / 20;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          gm.field_l.c(var3 - -15, var4 + 10, var5 * var7 >> 8);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      return;
                    } else {
                      L15: {
                        var7 = (50 + -var6) * 256 / 20;
                        gi.field_k.b(var3, var4, var7);
                        var6 = gi.field_a + -140;
                        if (var6 > 0) {
                          L16: {
                            var7 = 256;
                            if (20 > var6) {
                              var7 = 256 * var6 / 20;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          gm.field_l.c(var3 - -15, var4 + 10, var5 * var7 >> 8);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      return;
                    }
                  } else {
                    L17: {
                      var7 = 256 * var6 / 20;
                      gi.field_k.b(var3, var4, var7);
                      var6 = gi.field_a + -140;
                      if (var6 > 0) {
                        L18: {
                          var7 = 256;
                          if (20 > var6) {
                            var7 = 256 * var6 / 20;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        gm.field_l.c(var3 - -15, var4 + 10, var5 * var7 >> 8);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    return;
                  }
                } else {
                  L19: {
                    var6 = gi.field_a + -140;
                    if (var6 > 0) {
                      L20: {
                        var7 = 256;
                        if (20 > var6) {
                          var7 = 256 * var6 / 20;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      gm.field_l.c(var3 - -15, var4 + 10, var5 * var7 >> 8);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  return;
                }
              } else {
                L21: {
                  var6 = gi.field_a + -140;
                  if (var6 > 0) {
                    L22: {
                      var7 = 256;
                      if (20 > var6) {
                        var7 = 256 * var6 / 20;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    gm.field_l.c(var3 - -15, var4 + 10, var5 * var7 >> 8);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param1 == -140) {
          var3 = (((n) this).field_f.length >> 1) - 1;
          var4 = param0 & var3;
          L0: while (true) {
            var5 = ((n) this).field_f[1 + var4 - -var4];
            if (var5 == -1) {
              return -1;
            } else {
              if (param0 != ((n) this).field_f[var4 - -var4]) {
                var4 = var4 - -1 & var3;
                continue L0;
              } else {
                return var5;
              }
            }
          }
        } else {
          return -4;
        }
    }

    n(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> 1) + param0.length < var2_int) {
                ((n) this).field_f = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & var2_int - 1;
                        L4: while (true) {
                          if (((n) this).field_f[1 + (var4 + var4)] == -1) {
                            ((n) this).field_f[var4 - -var4] = param0[var3];
                            ((n) this).field_f[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = 1 + var4 & var2_int - 1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((n) this).field_f[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("n.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "RuneScape clan";
        field_h = "Unrated game";
        field_b = new ri();
        field_d = new oc();
        field_e = "Game interface:";
    }
}
