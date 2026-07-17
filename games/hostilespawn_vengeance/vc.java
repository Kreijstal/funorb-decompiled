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
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
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
            L2: {
              if (param1 == -11112) {
                break L2;
              } else {
                field_h = null;
                break L2;
              }
            }
            var4_int = 0;
            L3: while (true) {
              L4: {
                if (param3.field_e > 4) {
                  break L4;
                } else {
                  if (var4_int >= 4) {
                    break L4;
                  } else {
                    L5: {
                      if (param3.field_e > 4) {
                        break L5;
                      } else {
                        param2[param0] = 0;
                        var5 = 0;
                        L6: while (true) {
                          L7: {
                            if (5 <= var5) {
                              break L7;
                            } else {
                              param3.field_l.a(1, (byte) 94, param3.field_c);
                              param3.a(param1 + 19685);
                              if (2 == param2[param3.field_j.b(-4)]) {
                                L8: {
                                  if (4 > param3.field_e) {
                                    param3.field_e = 5;
                                    break L8;
                                  } else {
                                    param3.field_e = param3.field_e + 1;
                                    break L8;
                                  }
                                }
                                param3.field_l.a(-1, (byte) 94, param3.field_c);
                                param3.a(8573);
                                break L7;
                              } else {
                                var5++;
                                continue L6;
                              }
                            }
                          }
                          var17 = 1;
                          var5 = var17;
                          L9: while (true) {
                            if (var17 >= rc.field_e) {
                              param2[param0] = 3;
                              break L5;
                            } else {
                              L10: {
                                L11: {
                                  var6 = 0;
                                  var7 = 0;
                                  var8 = re.field_n[var17];
                                  var9 = var8.field_i;
                                  var10 = (double)var8.field_j.field_e + var8.field_l.field_f;
                                  var12 = (double)var8.field_j.field_g + var8.field_l.field_a;
                                  if (var9 == 8) {
                                    break L11;
                                  } else {
                                    if (var9 == 27) {
                                      break L11;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var12 = var12 - 0.5;
                                var10 = var10 - 0.5;
                                break L10;
                              }
                              L12: {
                                L13: {
                                  L14: {
                                    var6 = (int)(24.0 * (-param3.field_l.field_f + ((double)(-param3.field_j.field_e) + var10)));
                                    var7 = (int)(((double)(-param3.field_j.field_g) + var12 - param3.field_l.field_a) * 24.0);
                                    var14 = 24;
                                    if (10 == var9) {
                                      break L14;
                                    } else {
                                      if (var9 == 11) {
                                        break L14;
                                      } else {
                                        if (var9 == 128) {
                                          break L14;
                                        } else {
                                          if (var9 == 129) {
                                            break L14;
                                          } else {
                                            if (var9 == 130) {
                                              break L14;
                                            } else {
                                              if (var9 == 131) {
                                                break L14;
                                              } else {
                                                if (var9 == 132) {
                                                  break L14;
                                                } else {
                                                  if (var9 == 133) {
                                                    break L14;
                                                  } else {
                                                    break L13;
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
                                    break L12;
                                  } else {
                                    var14 = 24;
                                    break L13;
                                  }
                                }
                                L15: {
                                  if (var9 == 20) {
                                    var14 = 36;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                if (~var6 > ~-var14) {
                                  break L12;
                                } else {
                                  if (var14 < var6) {
                                    break L12;
                                  } else {
                                    if (~var7 > ~-var14) {
                                      break L12;
                                    } else {
                                      if (~var7 <= ~var14) {
                                        break L12;
                                      } else {
                                        if (var8.field_I <= 0) {
                                          break L12;
                                        } else {
                                          L16: {
                                            if (var9 < 12) {
                                              break L16;
                                            } else {
                                              if (var9 < 18) {
                                                break L12;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            var15 = var8.a(param3.field_i, param1 ^ 11019) ? 1 : 0;
                                            param3.field_e = 5;
                                            var8.field_F = 255;
                                            if (var15 == 0) {
                                              break L17;
                                            } else {
                                              var8.field_I = var8.field_I - 1;
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (param3.field_e >= 4) {
                                              param3.field_e = 5;
                                              if (8 == var9) {
                                                if (var15 != 0) {
                                                  var8.field_I = var8.field_I - 200;
                                                  break L18;
                                                } else {
                                                  break L18;
                                                }
                                              } else {
                                                L19: {
                                                  if (10 == var9) {
                                                    break L19;
                                                  } else {
                                                    if (var9 == 11) {
                                                      break L19;
                                                    } else {
                                                      if (var9 == 128) {
                                                        break L19;
                                                      } else {
                                                        if (var9 == 129) {
                                                          break L19;
                                                        } else {
                                                          if (130 == var9) {
                                                            break L19;
                                                          } else {
                                                            if (var9 == 131) {
                                                              break L19;
                                                            } else {
                                                              if (132 == var9) {
                                                                break L19;
                                                              } else {
                                                                if (var9 != 133) {
                                                                  if (var9 != 20) {
                                                                    if (var8.a((byte) 54)) {
                                                                      var8.field_I = var8.field_I - 200;
                                                                      break L18;
                                                                    } else {
                                                                      break L18;
                                                                    }
                                                                  } else {
                                                                    var8.field_I = var8.field_I - 200;
                                                                    break L18;
                                                                  }
                                                                } else {
                                                                  break L19;
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
                                                break L18;
                                              }
                                            } else {
                                              L20: {
                                                if (param3.field_i != 26) {
                                                  break L20;
                                                } else {
                                                  u.a(17, param3.field_j, true, 16, param3.field_l, 4);
                                                  break L20;
                                                }
                                              }
                                              param3.field_i = -1;
                                              if (var15 == 0) {
                                                break L18;
                                              } else {
                                                var8.field_I = var8.field_I - 200;
                                                if (!var8.field_b) {
                                                  break L18;
                                                } else {
                                                  if (var8.field_I > 0) {
                                                    tk.a(8, jc.field_c, 1, true);
                                                    break L18;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L21: {
                                            if (var8.field_I <= 0) {
                                              L22: {
                                                var8.field_I = 0;
                                                if (26 == param3.field_i) {
                                                  u.a(17, param3.field_j, true, 16, param3.field_l, 4);
                                                  break L22;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                              param3.field_i = 3;
                                              if (!var8.field_b) {
                                                break L21;
                                              } else {
                                                if (27 == var8.field_i) {
                                                  break L21;
                                                } else {
                                                  al.field_U[2] = al.field_U[2] + 1;
                                                  if (30 == al.field_U[2] + 1) {
                                                    ti.a(248, (byte) -120, 7);
                                                    break L21;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L21;
                                            }
                                          }
                                          nh.a(var8, -29966);
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var17++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                    var4_int++;
                    continue L3;
                  }
                }
              }
              L23: {
                if (param3.field_e > 4) {
                  L24: {
                    if (uj.field_l == 1) {
                      if (ej.d((byte) 81)) {
                        eh.field_c.a(em.field_a[0], 50, uh.field_i);
                        break L24;
                      } else {
                        break L24;
                      }
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (26 == param3.field_i) {
                      u.a(-1, param3.field_j, true, 16, param3.field_l, 28);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
                    jn.field_F[ib.field_c].field_j.a((byte) 46, param3.field_j);
                    jn.field_F[ib.field_c].field_l.a(param3.field_l, -28860);
                    jn.field_F[ib.field_c].field_e = 0;
                    jn.field_F[ib.field_c].field_h = 1;
                    jn.field_F[ib.field_c].field_i = 12;
                    ib.field_c = ib.field_c + 1;
                    if (5 != param3.field_e) {
                      break L26;
                    } else {
                      hg.a((byte) 64, param3);
                      break L26;
                    }
                  }
                  u.a(-1, param3.field_j, true, 16, param3.field_l, 35);
                  break L23;
                } else {
                  jn.field_F[ib.field_c].field_c = param3.field_c;
                  jn.field_F[ib.field_c].field_j.a((byte) 46, param3.field_j);
                  jn.field_F[ib.field_c].field_l.a(param3.field_l, -28860);
                  jn.field_F[ib.field_c].field_e = 0;
                  jn.field_F[ib.field_c].field_h = 5;
                  jn.field_F[ib.field_c].field_i = 17;
                  ib.field_c = ib.field_c + 1;
                  break L23;
                }
              }
              L27: {
                if (param3.field_e > 4) {
                  param3.field_e = param3.field_e + 1;
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                if (param3.field_e > 9) {
                  param3.field_i = -1;
                  break L28;
                } else {
                  break L28;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var4 = decompiledCaughtException;
            stackOut_109_0 = (RuntimeException) var4;
            stackOut_109_1 = new StringBuilder().append("vc.A(").append(param0).append(44).append(param1).append(44);
            stackIn_111_0 = stackOut_109_0;
            stackIn_111_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param2 == null) {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L29;
            } else {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "{...}";
              stackIn_112_0 = stackOut_110_0;
              stackIn_112_1 = stackOut_110_1;
              stackIn_112_2 = stackOut_110_2;
              break L29;
            }
          }
          L30: {
            stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
            stackOut_112_1 = ((StringBuilder) (Object) stackIn_112_1).append(stackIn_112_2).append(44);
            stackIn_114_0 = stackOut_112_0;
            stackIn_114_1 = stackOut_112_1;
            stackIn_113_0 = stackOut_112_0;
            stackIn_113_1 = stackOut_112_1;
            if (param3 == null) {
              stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L30;
            } else {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "{...}";
              stackIn_115_0 = stackOut_113_0;
              stackIn_115_1 = stackOut_113_1;
              stackIn_115_2 = stackOut_113_2;
              break L30;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_115_0, stackIn_115_2 + 41);
        }
    }

    final static void a(byte param0) {
        g.a((byte) -119, 4);
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((vc) this).field_l.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "vc.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((vc) this).field_l.update(param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "vc.update(" + (param0 != null ? "{...}" : "null") + 41);
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
            throw wg.a((Throwable) (Object) runtimeException, "vc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
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
