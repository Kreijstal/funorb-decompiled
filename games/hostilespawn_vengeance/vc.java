/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends java.awt.Canvas {
    static int[] field_i;
    static bd field_k;
    private java.awt.Component field_l;
    static String field_j;
    static int field_e;
    static int field_g;
    static gb field_d;
    static String field_f;
    static bd field_h;
    static dh field_c;
    static int field_b;
    static float field_a;

    final static void a(int param0, int param1, int[] param2, p param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oj var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_110_2 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_113_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        var16 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3.field_e >= 4) {
                break L1;
              } else {
                param3.field_e = param3.field_e + 1;
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              L3: {
                if (param3.field_e > 4) {
                  break L3;
                } else {
                  if (var4_int >= 4) {
                    break L3;
                  } else {
                    L4: {
                      if (param3.field_e > 4) {
                        break L4;
                      } else {
                        param2[param0] = 0;
                        var5 = 0;
                        L5: while (true) {
                          L6: {
                            if (5 <= var5) {
                              break L6;
                            } else {
                              param3.field_l.a(1, (byte) 94, param3.field_c);
                              param3.a(8573);
                              if (2 == param2[param3.field_j.b(-4)]) {
                                L7: {
                                  if (4 > param3.field_e) {
                                    param3.field_e = 5;
                                    break L7;
                                  } else {
                                    param3.field_e = param3.field_e + 1;
                                    break L7;
                                  }
                                }
                                param3.field_l.a(-1, (byte) 94, param3.field_c);
                                param3.a(8573);
                                break L6;
                              } else {
                                var5++;
                                continue L5;
                              }
                            }
                          }
                          var17 = 1;
                          var5 = var17;
                          L8: while (true) {
                            if (var17 >= rc.field_e) {
                              param2[param0] = 3;
                              break L4;
                            } else {
                              L9: {
                                L10: {
                                  var6 = 0;
                                  var7 = 0;
                                  var8 = re.field_n[var17];
                                  var9 = var8.field_i;
                                  var10 = (double)var8.field_j.field_e + var8.field_l.field_f;
                                  var12 = (double)var8.field_j.field_g + var8.field_l.field_a;
                                  if (var9 == 8) {
                                    break L10;
                                  } else {
                                    if (var9 == 27) {
                                      break L10;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var12 = var12 - 0.5;
                                var10 = var10 - 0.5;
                                break L9;
                              }
                              L11: {
                                L12: {
                                  L13: {
                                    var6 = (int)(24.0 * (-param3.field_l.field_f + ((double)(-param3.field_j.field_e) + var10)));
                                    var7 = (int)(((double)(-param3.field_j.field_g) + var12 - param3.field_l.field_a) * 24.0);
                                    var14 = 24;
                                    if (10 == var9) {
                                      break L13;
                                    } else {
                                      if (var9 == 11) {
                                        break L13;
                                      } else {
                                        if (var9 == 128) {
                                          break L13;
                                        } else {
                                          if (var9 == 129) {
                                            break L13;
                                          } else {
                                            if (var9 == 130) {
                                              break L13;
                                            } else {
                                              if (var9 == 131) {
                                                break L13;
                                              } else {
                                                if (var9 == 132) {
                                                  break L13;
                                                } else {
                                                  if (var9 == 133) {
                                                    break L13;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (0 == var8.field_h) {
                                    break L11;
                                  } else {
                                    var14 = 24;
                                    break L12;
                                  }
                                }
                                L14: {
                                  if (var9 == 20) {
                                    var14 = 36;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                if (~var6 > ~-var14) {
                                  break L11;
                                } else {
                                  if (var14 < var6) {
                                    break L11;
                                  } else {
                                    if (~var7 > ~-var14) {
                                      break L11;
                                    } else {
                                      if (~var7 <= ~var14) {
                                        break L11;
                                      } else {
                                        if (var8.field_I <= 0) {
                                          break L11;
                                        } else {
                                          L15: {
                                            if (var9 < 12) {
                                              break L15;
                                            } else {
                                              if (var9 < 18) {
                                                break L11;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            var15 = var8.a(param3.field_i, -109) ? 1 : 0;
                                            param3.field_e = 5;
                                            var8.field_F = 255;
                                            if (var15 == 0) {
                                              break L16;
                                            } else {
                                              var8.field_I = var8.field_I - 1;
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (param3.field_e >= 4) {
                                              param3.field_e = 5;
                                              if (8 == var9) {
                                                if (var15 != 0) {
                                                  var8.field_I = var8.field_I - 200;
                                                  break L17;
                                                } else {
                                                  break L17;
                                                }
                                              } else {
                                                L18: {
                                                  if (10 == var9) {
                                                    break L18;
                                                  } else {
                                                    if (var9 == 11) {
                                                      break L18;
                                                    } else {
                                                      if (var9 == 128) {
                                                        break L18;
                                                      } else {
                                                        if (var9 == 129) {
                                                          break L18;
                                                        } else {
                                                          if (130 == var9) {
                                                            break L18;
                                                          } else {
                                                            if (var9 == 131) {
                                                              break L18;
                                                            } else {
                                                              if (132 == var9) {
                                                                break L18;
                                                              } else {
                                                                if (var9 != 133) {
                                                                  if (var9 != 20) {
                                                                    if (var8.a((byte) 54)) {
                                                                      var8.field_I = var8.field_I - 200;
                                                                      break L17;
                                                                    } else {
                                                                      break L17;
                                                                    }
                                                                  } else {
                                                                    var8.field_I = var8.field_I - 200;
                                                                    break L17;
                                                                  }
                                                                } else {
                                                                  break L18;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var8.field_I = var8.field_I - 200;
                                                break L17;
                                              }
                                            } else {
                                              L19: {
                                                if (param3.field_i != 26) {
                                                  break L19;
                                                } else {
                                                  u.a(17, param3.field_j, true, 16, param3.field_l, 4);
                                                  break L19;
                                                }
                                              }
                                              param3.field_i = -1;
                                              if (var15 == 0) {
                                                break L17;
                                              } else {
                                                var8.field_I = var8.field_I - 200;
                                                if (!var8.field_b) {
                                                  break L17;
                                                } else {
                                                  if (var8.field_I > 0) {
                                                    int discarded$1 = 1;
                                                    tk.a(8, jc.field_c, 1);
                                                    break L17;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L20: {
                                            if (var8.field_I <= 0) {
                                              L21: {
                                                var8.field_I = 0;
                                                if (26 == param3.field_i) {
                                                  u.a(17, param3.field_j, true, 16, param3.field_l, 4);
                                                  break L21;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                              param3.field_i = 3;
                                              if (!var8.field_b) {
                                                break L20;
                                              } else {
                                                if (27 == var8.field_i) {
                                                  break L20;
                                                } else {
                                                  al.field_U[2] = al.field_U[2] + 1;
                                                  if (30 == al.field_U[2] + 1) {
                                                    ti.a(248, (byte) -120, 7);
                                                    break L20;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L20;
                                            }
                                          }
                                          nh.a(var8, -29966);
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var17++;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              }
              L22: {
                if (param3.field_e > 4) {
                  L23: {
                    if (uj.field_l == 1) {
                      if (ej.d((byte) 81)) {
                        eh.field_c.a(em.field_a[0], 50, uh.field_i);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (26 == param3.field_i) {
                      u.a(-1, param3.field_j, true, 16, param3.field_l, 28);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
                    jn.field_F[ib.field_c].field_j.a((byte) 46, param3.field_j);
                    jn.field_F[ib.field_c].field_l.a(param3.field_l, -28860);
                    jn.field_F[ib.field_c].field_e = 0;
                    jn.field_F[ib.field_c].field_h = 1;
                    jn.field_F[ib.field_c].field_i = 12;
                    ib.field_c = ib.field_c + 1;
                    if (5 != param3.field_e) {
                      break L25;
                    } else {
                      hg.a((byte) 64, param3);
                      break L25;
                    }
                  }
                  u.a(-1, param3.field_j, true, 16, param3.field_l, 35);
                  break L22;
                } else {
                  jn.field_F[ib.field_c].field_c = param3.field_c;
                  jn.field_F[ib.field_c].field_j.a((byte) 46, param3.field_j);
                  jn.field_F[ib.field_c].field_l.a(param3.field_l, -28860);
                  jn.field_F[ib.field_c].field_e = 0;
                  jn.field_F[ib.field_c].field_h = 5;
                  jn.field_F[ib.field_c].field_i = 17;
                  ib.field_c = ib.field_c + 1;
                  break L22;
                }
              }
              L26: {
                if (param3.field_e > 4) {
                  param3.field_e = param3.field_e + 1;
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                if (param3.field_e > 9) {
                  param3.field_i = -1;
                  break L27;
                } else {
                  break L27;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var4 = decompiledCaughtException;
            stackOut_107_0 = (RuntimeException) var4;
            stackOut_107_1 = new StringBuilder().append("vc.A(").append(param0).append(',').append(-11112).append(',');
            stackIn_109_0 = stackOut_107_0;
            stackIn_109_1 = stackOut_107_1;
            stackIn_108_0 = stackOut_107_0;
            stackIn_108_1 = stackOut_107_1;
            if (param2 == null) {
              stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "null";
              stackIn_110_0 = stackOut_109_0;
              stackIn_110_1 = stackOut_109_1;
              stackIn_110_2 = stackOut_109_2;
              break L28;
            } else {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "{...}";
              stackIn_110_0 = stackOut_108_0;
              stackIn_110_1 = stackOut_108_1;
              stackIn_110_2 = stackOut_108_2;
              break L28;
            }
          }
          L29: {
            stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
            stackOut_110_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_110_2).append(',');
            stackIn_112_0 = stackOut_110_0;
            stackIn_112_1 = stackOut_110_1;
            stackIn_111_0 = stackOut_110_0;
            stackIn_111_1 = stackOut_110_1;
            if (param3 == null) {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "null";
              stackIn_113_0 = stackOut_112_0;
              stackIn_113_1 = stackOut_112_1;
              stackIn_113_2 = stackOut_112_2;
              break L29;
            } else {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "{...}";
              stackIn_113_0 = stackOut_111_0;
              stackIn_113_1 = stackOut_111_1;
              stackIn_113_2 = stackOut_111_2;
              break L29;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_113_0, stackIn_113_2 + ')');
        }
    }

    final static void a() {
        g.a((byte) -119, 4);
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((vc) this).field_l.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "vc.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((vc) this).field_l.update(param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "vc.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_k = null;
        if (param0 < 3) {
            vc.a(-49);
        }
        field_h = null;
        field_j = null;
        field_d = null;
        field_i = null;
        field_c = null;
    }

    vc(java.awt.Component param0) {
        try {
            ((vc) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "vc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_j = "Not yet achieved";
        field_f = "Levels completed: <col=ffffff><%0>";
        field_a = 0.0f;
    }
}
