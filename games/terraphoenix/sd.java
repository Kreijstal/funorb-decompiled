/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    private int field_j;
    static String field_f;
    private int field_b;
    private boolean field_c;
    static String field_a;
    int field_g;
    private int field_e;
    int field_h;
    private int field_i;
    static String[] field_d;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -3864) {
            Object var2 = null;
            sd.a(true, (ci[]) null);
        }
        field_f = null;
        field_d = null;
    }

    final void a(byte param0, int param1) {
        ((sd) this).field_i = 0;
        ((sd) this).field_e = 0;
        int var3 = 18 / ((-68 - param0) / 54);
        if (((sd) this).field_j == 0) {
            if ((lf.field_c ^ -1) == -97) {
                if (0 >= ((sd) this).field_h) {
                    ((sd) this).field_h = ((sd) this).field_g;
                }
                ((sd) this).field_c = false;
                ((sd) this).field_h = ((sd) this).field_h - 1;
            }
        }
        if (((sd) this).field_j == 0) {
            ((sd) this).field_i = lf.field_c;
        }
        if (((sd) this).field_j == 0) {
            if (!(lf.field_c != 97)) {
                ((sd) this).field_h = ((sd) this).field_h + 1;
                ((sd) this).field_c = false;
                if (((sd) this).field_h >= ((sd) this).field_g) {
                    ((sd) this).field_h = 0;
                }
            }
        }
        if (((sd) this).field_j == 0) {
            if (lf.field_c != 98) {
                // if_icmpne L192
            }
            if ((((sd) this).field_h ^ -1) > -1) {
                ((sd) this).field_h = param1;
            }
            ((sd) this).field_c = false;
        }
    }

    final boolean c(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 <= -116) {
          L0: {
            L1: {
              if (0 != ((sd) this).field_e) {
                break L1;
              } else {
                if (-85 == (((sd) this).field_i ^ -1)) {
                  break L1;
                } else {
                  if ((((sd) this).field_i ^ -1) != -84) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final static void a(boolean param0, ci[] param1) {
        if (!param0) {
            field_d = null;
        }
        rk.field_f = param1;
        if (rk.field_f != null) {
            if (!(-4 >= (param1.length ^ -1))) {
                throw new IllegalArgumentException("");
            }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        ((sd) this).field_j = 0;
        if (param3 != -85) {
            Object var6 = null;
            sd.a((byte) -10, (he) null, (dh) null, 107);
        }
        ((sd) this).field_c = param1 ? true : false;
        if (!((sd) this).field_c) {
            ((sd) this).field_h = param0;
        } else {
            ((sd) this).field_h = param2;
        }
    }

    final static void a(byte param0) {
        int var4 = Terraphoenix.field_V;
        int[] var5 = dk.field_c;
        int[] var1 = var5;
        if (param0 != 87) {
            return;
        }
        int var2 = 0;
        int var3 = var5.length;
        while (var3 > var2) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final void b(byte param0) {
        ((sd) this).field_i = 0;
        ((sd) this).field_e = 0;
        if (!(((sd) this).field_j != 0)) {
            ((sd) this).field_i = lf.field_c;
        }
        if (0 == ((sd) this).field_j) {
            if (lf.field_c == 98) {
                if (!((((sd) this).field_h ^ -1) < -1)) {
                    ((sd) this).field_h = ((sd) this).field_g;
                }
                ((sd) this).field_c = false;
                ((sd) this).field_h = ((sd) this).field_h - 1;
            }
        }
        if (param0 > -11) {
            ((sd) this).field_h = -59;
        }
        if (-1 == (((sd) this).field_j ^ -1)) {
            if (lf.field_c == 99) {
                ((sd) this).field_h = ((sd) this).field_h + 1;
                ((sd) this).field_c = false;
                if (((sd) this).field_g <= ((sd) this).field_h) {
                    ((sd) this).field_h = 0;
                }
            }
        }
    }

    final static void a(byte param0, he param1, dh param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
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
            wf var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var14 = Terraphoenix.field_V;
            var18 = new wf();
            var18.field_p = param2.a(-16384);
            var18.field_i = param2.f((byte) -107);
            var18.field_o = new byte[var18.field_p][][];
            var18.field_k = new int[var18.field_p];
            var18.field_j = new mf[var18.field_p];
            var18.field_m = new int[var18.field_p];
            var18.field_r = new int[var18.field_p];
            var18.field_s = new mf[var18.field_p];
            var5 = 0;
            L0: while (true) {
              if (var18.field_p <= var5) {
                var6_ref4 = decompiledCaughtException;
                var18.field_r[var5] = -5;
                var5++;
              } else {
                try {
                  L1: {
                    L2: {
                      var6_int = param2.a(-16384);
                      if (-1 == var6_int) {
                        break L2;
                      } else {
                        if (-2 == var6_int) {
                          break L2;
                        } else {
                          if (var6_int == -3) {
                            break L2;
                          } else {
                            L3: {
                              if (var6_int == 3) {
                                break L3;
                              } else {
                                if (-5 == var6_int) {
                                  break L3;
                                } else {
                                  var5++;
                                  break L1;
                                }
                              }
                            }
                            var20 = param2.e(-1);
                            var21 = param2.e(-1);
                            var9 = param2.a(-16384);
                            var10 = new String[var9];
                            var11_int = 0;
                            L4: while (true) {
                              if (var11_int >= var9) {
                                L5: {
                                  var24 = new byte[var9][];
                                  var23 = var24;
                                  var22 = var23;
                                  var19 = var22;
                                  var11 = var19;
                                  if ((var6_int ^ -1) != -4) {
                                    break L5;
                                  } else {
                                    var12_int = 0;
                                    L6: while (true) {
                                      if (var9 <= var12_int) {
                                        break L5;
                                      } else {
                                        var13 = param2.f((byte) -107);
                                        var11[var12_int] = new byte[var13];
                                        param2.a(var13, 0, -37, var24[var12_int]);
                                        var12_int++;
                                        continue L6;
                                      }
                                    }
                                  }
                                }
                                var18.field_k[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L7: while (true) {
                                  if (var9 <= var17) {
                                    var18.field_j[var5] = param1.a(92, q.a(78, var20), var21, var12);
                                    var18.field_o[var5] = var24;
                                    var5++;
                                    break L1;
                                  } else {
                                    var12[var17] = q.a(89, var10[var17]);
                                    var17++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var10[var11_int] = param2.e(-1);
                                var11_int++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var15 = param2.e(-1);
                      var16 = param2.e(-1);
                      var9 = 0;
                      if (1 == var6_int) {
                        var9 = param2.f((byte) -107);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var18.field_k[var5] = var6_int;
                    var18.field_m[var5] = var9;
                    var18.field_s[var5] = param1.a(q.a(119, var15), -3645, var16);
                    break L1;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_r[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_r[var5] = -4;
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

    final void a(int param0, int param1, int param2) {
        if (param0 < ((sd) this).field_g) {
          if (param2 >= ((sd) this).field_g) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              ((sd) this).field_e = 0;
              ((sd) this).field_i = 0;
              if (0 == ma.field_I) {
                break L0;
              } else {
                ((sd) this).field_e = ma.field_I;
                ((sd) this).field_c = true;
                ((sd) this).field_h = param2;
                ((sd) this).field_j = ma.field_I;
                ((sd) this).field_b = gl.field_m;
                break L0;
              }
            }
            L1: {
              if (((sd) this).field_j == 0) {
                if (ma.field_I == 0) {
                  if (oh.field_f != 0) {
                    break L1;
                  } else {
                    ((sd) this).field_j = 0;
                    break L1;
                  }
                } else {
                  if (ma.field_I != 0) {
                    break L1;
                  } else {
                    if (oh.field_f != 0) {
                      break L1;
                    } else {
                      ((sd) this).field_j = 0;
                      break L1;
                    }
                  }
                }
              } else {
                if (ma.field_I != 0) {
                  break L1;
                } else {
                  if (oh.field_f != 0) {
                    break L1;
                  } else {
                    ((sd) this).field_j = 0;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param1 > 122) {
                break L2;
              } else {
                boolean discarded$1 = ((sd) this).c((byte) 51);
                break L2;
              }
            }
            L3: {
              if (-1 != ((sd) this).field_j) {
                break L3;
              } else {
                L4: {
                  if (((sd) this).field_c) {
                    break L4;
                  } else {
                    if (!ja.field_l) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-1 > param0) {
                  if (!((sd) this).field_c) {
                    break L3;
                  } else {
                    ((sd) this).field_h = -1;
                    break L3;
                  }
                } else {
                  L5: {
                    if (param0 != ((sd) this).field_h) {
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((sd) this).field_c = true;
                  ((sd) this).field_h = param0;
                  break L3;
                }
              }
            }
            return;
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    sd(int param0) {
        ((sd) this).field_c = false;
        ((sd) this).field_h = 0;
        ((sd) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "MP4.4";
        field_f = "Select next friendly unit";
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
