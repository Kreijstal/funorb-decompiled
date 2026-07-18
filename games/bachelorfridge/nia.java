/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.Applet;

final class nia extends lw {
    static kv[] field_l;
    static pb field_m;

    final static int a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_39_0 = 0;
        try {
          L0: {
            if (0 == param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 > 0) {
                L1: {
                  var2_int = 1;
                  if (65535 < param0) {
                    param0 = param0 >> 16;
                    var2_int += 16;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 <= 255) {
                    break L2;
                  } else {
                    param0 = param0 >> 8;
                    var2_int += 8;
                    break L2;
                  }
                }
                L3: {
                  if (param0 > 15) {
                    param0 = param0 >> 4;
                    var2_int += 4;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0 <= 3) {
                    break L4;
                  } else {
                    var2_int += 2;
                    param0 = param0 >> 2;
                    break L4;
                  }
                }
                L5: {
                  if (param0 <= 1) {
                    break L5;
                  } else {
                    param0 = param0 >> 1;
                    var2_int++;
                    break L5;
                  }
                }
                stackOut_22_0 = var2_int;
                stackIn_23_0 = stackOut_22_0;
                return stackIn_23_0;
              } else {
                L6: {
                  var2_int = 2;
                  if (-65536 <= param0) {
                    break L6;
                  } else {
                    param0 = param0 >> 16;
                    var2_int += 16;
                    break L6;
                  }
                }
                L7: {
                  if (param0 < -256) {
                    param0 = param0 >> 8;
                    var2_int += 8;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param0 < -16) {
                    var2_int += 4;
                    param0 = param0 >> 4;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param0 < -4) {
                    var2_int += 2;
                    param0 = param0 >> 2;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (!param1) {
                  L10: {
                    if (-2 > param0) {
                      param0 = param0 >> 1;
                      var2_int++;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  stackOut_45_0 = var2_int;
                  stackIn_46_0 = stackOut_45_0;
                  break L0;
                } else {
                  stackOut_39_0 = 49;
                  stackIn_40_0 = stackOut_39_0;
                  return stackIn_40_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "nia.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_46_0;
    }

    final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((nia) this).field_e != 0) {
                  break L2;
                } else {
                  if (param0 != 35) {
                    break L2;
                  } else {
                    ((nia) this).b(1);
                    ((nia) this).c(100);
                    sh.field_I = true;
                    if (BachelorFridge.field_y == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param0 != 11) {
                break L1;
              } else {
                if (0 == ((nia) this).field_e) {
                  return;
                } else {
                  ((nia) this).b(param1 ^ 72);
                  ((nia) this).b((byte) 112);
                  if (!um.a(true)) {
                    break L1;
                  } else {
                    if (!((nia) this).c((byte) 95)) {
                      break L1;
                    } else {
                      fla.b(param1 + 23548);
                      break L1;
                    }
                  }
                }
              }
            }
            L3: {
              if (param1 == 73) {
                break L3;
              } else {
                java.applet.Applet discarded$2 = nia.d(124);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "nia.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static java.applet.Applet d(int param0) {
        RuntimeException var1 = null;
        java.applet.Applet stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        ck stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.applet.Applet stackOut_3_0 = null;
        ck stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            if (ov.field_f != null) {
              stackOut_3_0 = ov.field_f;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 == -31768) {
                stackOut_8_0 = re.field_C;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (java.applet.Applet) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "nia.G(" + param0 + ')');
        }
        return (java.applet.Applet) (Object) stackIn_9_0;
    }

    final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = (int)((1.0 - Math.cos((double)(4 * vr.field_b) * 3.141592653589793 / 100.0)) * 256.0);
              if (((nia) this).field_e == 1) {
                vg.a(sia.field_j, 9280, 22997, 37000, var2_int + 4096, 1760, var2_int + 4096, sia.field_j.field_o << 1113301731, sia.field_j.field_n << -1351324413);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 >= 103) {
                break L2;
              } else {
                ((nia) this).a(8);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "nia.D(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        try {
            field_l = null;
            field_m = null;
            if (param0) {
                int discarded$0 = nia.a(-47, true);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nia.A(" + param0 + ')');
        }
    }

    nia() {
        super(true, new String[2], id.field_j);
        try {
            ((nia) this).field_c = new int[][]{new int[2], new int[2]};
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nia.<init>()");
        }
    }

    final void a(int param0) {
        try {
            ((nia) this).c(109);
            int var2_int = -103 / ((59 - param0) / 33);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nia.C(" + param0 + ')');
        }
    }

    final static void e(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              sd.field_b = new int[50];
              var1_int = (rla.a(false, 16777088) + -rla.a(false, 16711680)) / 50;
              var2 = (tf.a(-6, 16777088) + -tf.a(-127, 16711680)) / 50;
              if (param0 >= 16) {
                break L1;
              } else {
                int discarded$2 = nia.a(120, true);
                break L1;
              }
            }
            var3 = (lda.a(16777088, (byte) -36) - lda.a(16711680, (byte) -45)) / 50;
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 >= 50) {
                    break L4;
                  } else {
                    sd.field_b[var4] = gna.a(rla.a(false, 16711680) - -(var4 * var1_int), (byte) -64, var4 * var3 + lda.a(16711680, (byte) -21), tf.a(-127, 16711680) - -(var4 * var2));
                    var4++;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "nia.H(" + param0 + ')');
        }
    }

    final static String d(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        Object stackOut_2_0 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 <= -80) {
              L1: {
                L2: {
                  var1_ref = "(" + f.field_b + " " + ef.field_l + " " + bd.field_j + ") " + ri.field_a;
                  if (dw.field_f <= 0) {
                    break L2;
                  } else {
                    var1_ref = var1_ref + ":";
                    var2 = 0;
                    L3: while (true) {
                      if (~var2 <= ~dw.field_f) {
                        break L2;
                      } else {
                        stackOut_7_0 = var1_ref + ' ';
                        stackIn_22_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          L4: {
                            L5: {
                              var1_ref = stackIn_8_0;
                              var3 = 255 & ig.field_m.field_h[var2];
                              var4 = var3 >> -1121663804;
                              if (var4 >= 10) {
                                break L5;
                              } else {
                                var4 += 48;
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4 += 55;
                            break L4;
                          }
                          L6: {
                            L7: {
                              var3 = var3 & 15;
                              var1_ref = var1_ref + (char)var4;
                              if (10 <= var3) {
                                break L7;
                              } else {
                                var3 += 48;
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 += 55;
                            break L6;
                          }
                          var1_ref = var1_ref + (char)var3;
                          var2++;
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_21_0 = (String) var1_ref;
                stackIn_22_0 = stackOut_21_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "nia.F(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    static {
    }
}
