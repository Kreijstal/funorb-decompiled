/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends fb {
    private int field_H;
    static gi[] field_D;
    static int field_I;
    private int field_G;
    private int field_E;
    private int field_F;

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        if (param1 == null) {
          return false;
        } else {
          L0: {
            var3 = param1.length();
            if (-2 < (var3 ^ -1)) {
              break L0;
            } else {
              if (12 < var3) {
                break L0;
              } else {
                L1: {
                  var4 = fm.a(param1, -70);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) > -2) {
                      break L1;
                    } else {
                      if (vi.a(param0 + 31153, var4.charAt(0))) {
                        return false;
                      } else {
                        if (!vi.a(param0 ^ 31153, var4.charAt(var4.length() - 1))) {
                          var5 = 0;
                          var6 = param0;
                          L2: while (true) {
                            if (var6 >= param1.length()) {
                              if (0 >= var5) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L3: {
                                var7 = param1.charAt(var6);
                                if (!vi.a(31153, (char) var7)) {
                                  var5 = 0;
                                  break L3;
                                } else {
                                  var5++;
                                  break L3;
                                }
                              }
                              if (var5 >= 2) {
                                if (!param2) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
                return false;
              }
            }
          }
          return false;
        }
    }

    final void g(int param0) {
        Object var3 = null;
        L0: {
          if (param0 >= 95) {
            break L0;
          } else {
            var3 = null;
            vb.a((byte) 55, (java.applet.Applet) null);
            break L0;
          }
        }
        L1: {
          int fieldTemp$4 = ((vb) this).field_F;
          ((vb) this).field_F = ((vb) this).field_F + 1;
          if (fieldTemp$4 <= 17) {
            break L1;
          } else {
            ((vb) this).field_F = 0;
            int fieldTemp$5 = ((vb) this).field_G + 1;
            ((vb) this).field_G = ((vb) this).field_G + 1;
            if (2 > fieldTemp$5) {
              break L1;
            } else {
              ((vb) this).field_G = 0;
              break L1;
            }
          }
        }
        L2: {
          L3: {
            ((vb) this).field_E = ((vb) this).field_E + ((vb) this).field_H;
            if (-161 > (((vb) this).field_E ^ -1)) {
              break L3;
            } else {
              if ((((vb) this).field_E ^ -1) <= -81) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((vb) this).field_H = -((vb) this).field_H;
          break L2;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                  param1.getAppletContext().showDocument(rc.a(-1, param1, var2), "_top");
                  if (param0 == 50) {
                    break L1;
                  } else {
                    field_I = 97;
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    vb(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((vb) this).field_G = 0;
        ((vb) this).field_F = 0;
        ((vb) this).field_E = 96;
        ((vb) this).field_H = 3;
        ((vb) this).d((byte) 126);
    }

    public static void f(byte param0) {
        field_D = null;
        if (param0 > -72) {
            vb.f((byte) 11);
        }
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        vn stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        vn stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        vn stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        vn stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        vn stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        vn stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        L0: {
          var3 = param1.a(((vb) this).a(true), (byte) -97) + -24;
          var4 = -48 + param1.a(((vb) this).f(237239984), 0);
          if (-48 > var3) {
            break L0;
          } else {
            if (-48 > var4) {
              break L0;
            } else {
              if (qj.field_d < var3) {
                break L0;
              } else {
                if (var4 <= me.field_Bb) {
                  L1: {
                    if (param0 < -76) {
                      break L1;
                    } else {
                      var5 = null;
                      ((vb) this).a((byte) 89, (wk) null);
                      break L1;
                    }
                  }
                  L2: {
                    stackOut_8_0 = ad.field_g[((vb) this).field_t][((vb) this).field_G + 32];
                    stackOut_8_1 = 0;
                    stackOut_8_2 = 339;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    if (((vb) this).field_t != 0) {
                      stackOut_10_0 = (vn) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = stackIn_10_2;
                      stackOut_10_3 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      stackIn_11_3 = stackOut_10_3;
                      break L2;
                    } else {
                      stackOut_9_0 = (vn) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = stackIn_9_2;
                      stackOut_9_3 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      stackIn_11_3 = stackOut_9_3;
                      break L2;
                    }
                  }
                  fj.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3 != 0).e(var3 + -3, var4 - 3, ((vb) this).field_E);
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new gi[155];
        field_I = 0;
    }
}
