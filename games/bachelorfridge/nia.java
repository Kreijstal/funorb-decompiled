/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nia extends lw {
    static kv[] field_l;
    static pb field_m;

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        if (!(0 != param0)) {
            return 0;
        }
        if (!(param0 <= 0)) {
            var2 = 1;
            if (!(65535 >= param0)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (param0 > 255) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(param0 <= 15)) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (param0 > 3) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (param0 > 1) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (-65536 > param0) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(param0 >= -256)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!(param0 >= -16)) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (!(param0 >= -4)) {
            var2 += 2;
            param0 = param0 >> 2;
        }
        return 49;
    }

    final void a(int param0, byte param1) {
        if (((nia) this).field_e == 0) {
          if (param0 == 35) {
            ((nia) this).b(1);
            ((nia) this).c(100);
            sh.field_I = true;
            if (BachelorFridge.field_y == 0) {
              if (param1 == 73) {
                return;
              } else {
                java.applet.Applet discarded$9 = nia.d(124);
                return;
              }
            } else {
              L0: {
                if (param0 != 11) {
                  break L0;
                } else {
                  if (0 == ((nia) this).field_e) {
                    return;
                  } else {
                    ((nia) this).b(param1 ^ 72);
                    ((nia) this).b((byte) 112);
                    if (!um.a(true)) {
                      break L0;
                    } else {
                      if (!((nia) this).c((byte) 95)) {
                        break L0;
                      } else {
                        fla.b(param1 + 23548);
                        if (param1 == 73) {
                          return;
                        } else {
                          java.applet.Applet discarded$10 = nia.d(124);
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (param1 == 73) {
                return;
              } else {
                java.applet.Applet discarded$11 = nia.d(124);
                return;
              }
            }
          } else {
            L1: {
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
                      if (param1 == 73) {
                        return;
                      } else {
                        java.applet.Applet discarded$12 = nia.d(124);
                        return;
                      }
                    }
                  }
                }
              }
            }
            if (param1 == 73) {
              return;
            } else {
              java.applet.Applet discarded$13 = nia.d(124);
              return;
            }
          }
        } else {
          if (param0 == 11) {
            if (0 == ((nia) this).field_e) {
              return;
            } else {
              ((nia) this).b(param1 ^ 72);
              ((nia) this).b((byte) 112);
              if (um.a(true)) {
                if (!((nia) this).c((byte) 95)) {
                  if (param1 == 73) {
                    return;
                  } else {
                    java.applet.Applet discarded$14 = nia.d(124);
                    return;
                  }
                } else {
                  fla.b(param1 + 23548);
                  if (param1 == 73) {
                    return;
                  } else {
                    java.applet.Applet discarded$15 = nia.d(124);
                    return;
                  }
                }
              } else {
                if (param1 == 73) {
                  return;
                } else {
                  java.applet.Applet discarded$16 = nia.d(124);
                  return;
                }
              }
            }
          } else {
            if (param1 == 73) {
              return;
            } else {
              java.applet.Applet discarded$17 = nia.d(124);
              return;
            }
          }
        }
    }

    final static java.applet.Applet d(int param0) {
        if (!(ov.field_f == null)) {
            return ov.field_f;
        }
        if (param0 != -31768) {
            return null;
        }
        return (java.applet.Applet) (Object) re.field_C;
    }

    final void a(byte param0) {
        int var2 = 0;
        L0: {
          var2 = (int)((1.0 - Math.cos((double)(4 * vr.field_b) * 3.141592653589793 / 100.0)) * 256.0);
          if (((nia) this).field_e == 1) {
            vg.a(sia.field_j, 9280, 22997, 37000, var2 + 4096, 1760, var2 + 4096, sia.field_j.field_o << 3, sia.field_j.field_n << 3);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 103) {
          ((nia) this).a(8);
          return;
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        field_l = null;
        field_m = null;
        if (param0) {
            int discarded$0 = nia.a(-47, true);
        }
    }

    nia() {
        super(true, new String[2], id.field_j);
        ((nia) this).field_c = new int[][]{new int[2], new int[2]};
    }

    final void a(int param0) {
        ((nia) this).c(109);
        int var2 = -103 / ((59 - param0) / 33);
    }

    final static void e(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
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
              if (var4 >= 50) {
                break L0;
              } else {
                sd.field_b[var4] = gna.a(rla.a(false, 16711680) - -(var4 * var1_int), (byte) -64, var4 * var3 + lda.a(16711680, (byte) -21), tf.a(-127, 16711680) - -(var4 * var2));
                var4++;
                if (var5 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "nia.H(" + param0 + 41);
        }
    }

    final static String d(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String stackIn_6_0 = null;
        String stackIn_16_0 = null;
        String stackOut_5_0 = null;
        String stackOut_15_0 = null;
        var5 = BachelorFridge.field_y;
        var6 = "(" + f.field_b + " " + ef.field_l + " " + bd.field_j + ") " + ri.field_a;
        if (dw.field_f > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (var2 < dw.field_f) {
              L1: {
                stackOut_5_0 = var1 + 32;
                stackIn_16_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      var7 = stackIn_6_0;
                      var3 = 255 & ig.field_m.field_h[var2];
                      var4 = var3 >> 4;
                      if (var4 >= 10) {
                        break L3;
                      } else {
                        var4 += 48;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 += 55;
                    break L2;
                  }
                  L4: {
                    L5: {
                      var3 = var3 & 15;
                      var8 = var7 + (char)var4;
                      if (10 <= var3) {
                        break L5;
                      } else {
                        var3 += 48;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3 += 55;
                    break L4;
                  }
                  var1 = var8 + (char)var3;
                  var2++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    stackOut_15_0 = (String) var1;
                    stackIn_16_0 = stackOut_15_0;
                    break L1;
                  }
                }
              }
              return stackIn_16_0;
            } else {
              return var1;
            }
          }
        } else {
          return var6;
        }
    }

    static {
    }
}
