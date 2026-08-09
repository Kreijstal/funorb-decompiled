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
        int dupTemp$0 = 0;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_118_2 = null;
        StringBuilder stackIn_120_1 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
        var16 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-5 >= (param3.field_e ^ -1)) {
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
                field_h = (bd) null;
                break L2;
              }
            }
            var4_int = 0;
            L3: while (true) {
              L4: {
                if ((param3.field_e ^ -1) < -5) {
                  break L4;
                } else {
                  if ((var4_int ^ -1) <= -5) {
                    break L4;
                  } else {
                    if ((param3.field_e ^ -1) >= -5) {
                      param2[param0] = 0;
                      var5 = 0;
                      L5: while (true) {
                        L6: {
                          if (5 <= var5) {
                            break L6;
                          } else {
                            param3.field_l.a(1, (byte) 94, param3.field_c);
                            param3.a(param1 + 19685);
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
                        var5 = 1;
                        L8: while (true) {
                          if (var5 >= rc.field_e) {
                            param2[param0] = 3;
                            var4_int++;
                            continue L3;
                          } else {
                            L9: {
                              L10: {
                                var6 = 0;
                                var7 = 0;
                                var8 = re.field_n[var5];
                                var9 = var8.field_i;
                                var10 = (double)var8.field_j.field_e + var8.field_l.field_f;
                                var12 = (double)var8.field_j.field_g + var8.field_l.field_a;
                                if (-9 == (var9 ^ -1)) {
                                  break L10;
                                } else {
                                  if (-28 == (var9 ^ -1)) {
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
                                var6 = (int)(24.0 * (-param3.field_l.field_f + ((double)(-param3.field_j.field_e) + var10)));
                                var7 = (int)(((double)(-param3.field_j.field_g) + var12 - param3.field_l.field_a) * 24.0);
                                var14 = 24;
                                if (10 == var9) {
                                  break L12;
                                } else {
                                  if (var9 == 11) {
                                    break L12;
                                  } else {
                                    if (-129 == (var9 ^ -1)) {
                                      break L12;
                                    } else {
                                      if (var9 == 129) {
                                        break L12;
                                      } else {
                                        if (-131 == (var9 ^ -1)) {
                                          break L12;
                                        } else {
                                          if ((var9 ^ -1) == -132) {
                                            break L12;
                                          } else {
                                            if ((var9 ^ -1) == -133) {
                                              break L12;
                                            } else {
                                              if (var9 == 133) {
                                                break L12;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (0 != var8.field_h) {
                                var14 = 24;
                                break L11;
                              } else {
                                var5++;
                                continue L8;
                              }
                            }
                            L13: {
                              if (var9 == 20) {
                                var14 = 36;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            if (var6 >= -var14) {
                              if (var14 >= var6) {
                                if (var7 >= -var14) {
                                  if (var7 < var14) {
                                    if (-1 > (var8.field_I ^ -1)) {
                                      L14: {
                                        if (-13 < (var9 ^ -1)) {
                                          break L14;
                                        } else {
                                          if ((var9 ^ -1) <= -19) {
                                            break L14;
                                          } else {
                                            var5++;
                                            continue L8;
                                          }
                                        }
                                      }
                                      L15: {
                                        var15 = var8.a(param3.field_i, param1 ^ 11019) ? 1 : 0;
                                        param3.field_e = 5;
                                        var8.field_F = 255;
                                        if (var15 == 0) {
                                          break L15;
                                        } else {
                                          var8.field_I = var8.field_I - 1;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        if (param3.field_e >= 4) {
                                          param3.field_e = 5;
                                          if (8 == var9) {
                                            if (var15 != 0) {
                                              var8.field_I = var8.field_I - 200;
                                              break L16;
                                            } else {
                                              break L16;
                                            }
                                          } else {
                                            L17: {
                                              if (10 == var9) {
                                                break L17;
                                              } else {
                                                if ((var9 ^ -1) == -12) {
                                                  break L17;
                                                } else {
                                                  if ((var9 ^ -1) == -129) {
                                                    break L17;
                                                  } else {
                                                    if (-130 == (var9 ^ -1)) {
                                                      break L17;
                                                    } else {
                                                      if (130 == var9) {
                                                        break L17;
                                                      } else {
                                                        if ((var9 ^ -1) == -132) {
                                                          break L17;
                                                        } else {
                                                          if (132 == var9) {
                                                            break L17;
                                                          } else {
                                                            if (-134 != (var9 ^ -1)) {
                                                              if (-21 != (var9 ^ -1)) {
                                                                if (var8.a((byte) 54)) {
                                                                  var8.field_I = var8.field_I - 200;
                                                                  break L16;
                                                                } else {
                                                                  break L16;
                                                                }
                                                              } else {
                                                                var8.field_I = var8.field_I - 200;
                                                                break L16;
                                                              }
                                                            } else {
                                                              break L17;
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
                                            break L16;
                                          }
                                        } else {
                                          L18: {
                                            if (param3.field_i != 26) {
                                              break L18;
                                            } else {
                                              u.a(17, param3.field_j, true, 16, param3.field_l, 4);
                                              break L18;
                                            }
                                          }
                                          param3.field_i = -1;
                                          if (var15 == 0) {
                                            break L16;
                                          } else {
                                            var8.field_I = var8.field_I - 200;
                                            if (!var8.field_b) {
                                              break L16;
                                            } else {
                                              if ((var8.field_I ^ -1) < -1) {
                                                tk.a(8, jc.field_c, 1, true);
                                                break L16;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L19: {
                                        if (-1 <= (var8.field_I ^ -1)) {
                                          L20: {
                                            var8.field_I = 0;
                                            if (26 == param3.field_i) {
                                              u.a(17, param3.field_j, true, 16, param3.field_l, 4);
                                              break L20;
                                            } else {
                                              break L20;
                                            }
                                          }
                                          param3.field_i = 3;
                                          if (!var8.field_b) {
                                            break L19;
                                          } else {
                                            if (27 == var8.field_i) {
                                              break L19;
                                            } else {
                                              dupTemp$0 = al.field_U[2] + 1;
                                              al.field_U[2] = dupTemp$0;
                                              if (30 == dupTemp$0) {
                                                ti.a(248, (byte) -120, 7);
                                                break L19;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                        } else {
                                          break L19;
                                        }
                                      }
                                      nh.a(var8, -29966);
                                      var5++;
                                      continue L8;
                                    } else {
                                      var5++;
                                      continue L8;
                                    }
                                  } else {
                                    var5++;
                                    continue L8;
                                  }
                                } else {
                                  var5++;
                                  continue L8;
                                }
                              } else {
                                var5++;
                                continue L8;
                              }
                            } else {
                              var5++;
                              continue L8;
                            }
                          }
                        }
                      }
                    } else {
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
              L21: {
                if (-5 > (param3.field_e ^ -1)) {
                  L22: {
                    if (uj.field_l == 1) {
                      if (ej.d((byte) 81)) {
                        eh.field_c.a(em.field_a[0], 50, uh.field_i);
                        break L22;
                      } else {
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (26 == param3.field_i) {
                      u.a(-1, param3.field_j, true, 16, param3.field_l, 28);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
                    jn.field_F[ib.field_c].field_j.a((byte) 46, param3.field_j);
                    jn.field_F[ib.field_c].field_l.a(param3.field_l, -28860);
                    jn.field_F[ib.field_c].field_e = 0;
                    jn.field_F[ib.field_c].field_h = 1;
                    jn.field_F[ib.field_c].field_i = 12;
                    ib.field_c = ib.field_c + 1;
                    if (5 != param3.field_e) {
                      break L24;
                    } else {
                      hg.a((byte) 64, param3);
                      break L24;
                    }
                  }
                  u.a(-1, param3.field_j, true, 16, param3.field_l, 35);
                  break L21;
                } else {
                  jn.field_F[ib.field_c].field_c = param3.field_c;
                  jn.field_F[ib.field_c].field_j.a((byte) 46, param3.field_j);
                  jn.field_F[ib.field_c].field_l.a(param3.field_l, -28860);
                  jn.field_F[ib.field_c].field_e = 0;
                  jn.field_F[ib.field_c].field_h = 5;
                  jn.field_F[ib.field_c].field_i = 17;
                  ib.field_c = ib.field_c + 1;
                  break L21;
                }
              }
              L25: {
                if (param3.field_e > 4) {
                  param3.field_e = param3.field_e + 1;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (param3.field_e > 9) {
                  param3.field_i = -1;
                  break L26;
                } else {
                  break L26;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var4 = decompiledCaughtException;
            stackIn_117_0 = (RuntimeException) (var4);

            stackIn_117_1 = new StringBuilder().append("vc.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_118_0 = (RuntimeException) ((Object) stackIn_117_0);
              stackIn_118_1 = (StringBuilder) ((Object) stackIn_117_1);
              stackIn_118_2 = "null";
              break L27;
            } else {
              stackIn_118_0 = (RuntimeException) ((Object) stackIn_117_0);
              stackIn_118_1 = (StringBuilder) ((Object) stackIn_117_1);
              stackIn_118_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_120_1 = ((StringBuilder) (Object) stackIn_118_1).append(stackIn_118_2).append(',');

            if (param3 == null) {
              stackIn_118_0 = (RuntimeException) ((Object) stackIn_118_0);
              stackIn_121_1 = (StringBuilder) ((Object) stackIn_120_1);
              stackIn_121_2 = "null";
              break L28;
            } else {
              stackIn_118_0 = (RuntimeException) ((Object) stackIn_118_0);
              stackIn_121_1 = (StringBuilder) ((Object) stackIn_120_1);
              stackIn_121_2 = "{...}";
              break L28;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_118_0), stackIn_121_2 + ')');
        }
    }

    final static void a(byte param0) {
        g.a((byte) -119, 4);
        if (param0 != -1) {
            field_i = (int[]) null;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_l.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "vc.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_l.update(param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "vc.update(" + (param0 != null ? "{...}" : "null") + ')');
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
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "vc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_j = "Not yet achieved";
        field_f = "Levels completed: <col=ffffff><%0>";
        field_a = 0.0f;
    }
}
