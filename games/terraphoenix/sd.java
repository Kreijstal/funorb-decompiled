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
        field_f = null;
        field_d = null;
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        L0: {
          ((sd) this).field_i = 0;
          ((sd) this).field_e = 0;
          var3 = 18 / ((-68 - param0) / 54);
          if (((sd) this).field_j != 0) {
            break L0;
          } else {
            if (lf.field_c != 96) {
              break L0;
            } else {
              L1: {
                if (0 < ((sd) this).field_h) {
                  break L1;
                } else {
                  ((sd) this).field_h = ((sd) this).field_g;
                  break L1;
                }
              }
              ((sd) this).field_c = false;
              ((sd) this).field_h = ((sd) this).field_h - 1;
              break L0;
            }
          }
        }
        L2: {
          if (((sd) this).field_j != 0) {
            break L2;
          } else {
            ((sd) this).field_i = lf.field_c;
            break L2;
          }
        }
        L3: {
          if (((sd) this).field_j != 0) {
            break L3;
          } else {
            if (lf.field_c == 97) {
              ((sd) this).field_h = ((sd) this).field_h + 1;
              ((sd) this).field_c = false;
              if (((sd) this).field_h < ((sd) this).field_g) {
                break L3;
              } else {
                ((sd) this).field_h = 0;
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (((sd) this).field_j != 0) {
            break L4;
          } else {
            L5: {
              if (lf.field_c == 98) {
                break L5;
              } else {
                if (lf.field_c != 99) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (((sd) this).field_h >= 0) {
                break L6;
              } else {
                ((sd) this).field_h = param1;
                break L6;
              }
            }
            ((sd) this).field_c = false;
            break L4;
          }
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
                if (((sd) this).field_i == 84) {
                  break L1;
                } else {
                  if (((sd) this).field_i != 83) {
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
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              rk.field_f = param1;
              if (rk.field_f == null) {
                break L2;
              } else {
                if (param1.length < 3) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("sd.H(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
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
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            var5 = dk.field_c;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1_ref, "sd.E(" + 87 + 41);
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
                if (!(((sd) this).field_h > 0)) {
                    ((sd) this).field_h = ((sd) this).field_g;
                }
                ((sd) this).field_c = false;
                ((sd) this).field_h = ((sd) this).field_h - 1;
            }
        }
        if (param0 > -11) {
            ((sd) this).field_h = -59;
        }
        if (((sd) this).field_j == 0) {
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
            RuntimeException var4 = null;
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
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            String stackIn_36_2 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            String stackOut_34_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            var14 = Terraphoenix.field_V;
            try {
              L0: {
                var18 = (Object) (Object) new wf();
                ((wf) var18).field_p = param2.a(-16384);
                ((wf) var18).field_i = param2.f((byte) -107);
                ((wf) var18).field_o = new byte[((wf) var18).field_p][][];
                ((wf) var18).field_k = new int[((wf) var18).field_p];
                ((wf) var18).field_j = new mf[((wf) var18).field_p];
                ((wf) var18).field_m = new int[((wf) var18).field_p];
                ((wf) var18).field_r = new int[((wf) var18).field_p];
                ((wf) var18).field_s = new mf[((wf) var18).field_p];
                var5 = 0;
                L1: while (true) {
                  if (((wf) var18).field_p <= var5) {
                    var5 = 89 / ((param0 - -6) / 38);
                    rd.field_k.a((uf) var18, -16611);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param2.a(-16384);
                            if (var6_int == 0) {
                              break L4;
                            } else {
                              if (var6_int == 1) {
                                break L4;
                              } else {
                                if (var6_int == 2) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (var6_int == 3) {
                                      break L5;
                                    } else {
                                      if (var6_int == 4) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param2.e(-1);
                                  var21 = param2.e(-1);
                                  var9 = param2.a(-16384);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (var11_int >= var9) {
                                      L7: {
                                        var24 = new byte[var9][];
                                        var23 = var24;
                                        var22 = var23;
                                        var19 = var22;
                                        var11 = var19;
                                        if (var6_int != 3) {
                                          break L7;
                                        } else {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var9 <= var12_int) {
                                              break L7;
                                            } else {
                                              var13 = param2.f((byte) -107);
                                              var11[var12_int] = new byte[var13];
                                              param2.a(var13, 0, -37, var24[var12_int]);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      ((wf) var18).field_k[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (var9 <= var17) {
                                          ((wf) var18).field_j[var5] = param1.a(92, q.a(78, var20), var21, var12);
                                          ((wf) var18).field_o[var5] = var24;
                                          break L3;
                                        } else {
                                          var12[var17] = q.a(89, var10[var17]);
                                          var17++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param2.e(-1);
                                      var11_int++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L10: {
                            var15 = param2.e(-1);
                            var16 = param2.e(-1);
                            var9 = 0;
                            if (1 == var6_int) {
                              var9 = param2.f((byte) -107);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((wf) var18).field_k[var5] = var6_int;
                          ((wf) var18).field_m[var5] = var9;
                          ((wf) var18).field_s[var5] = param1.a(q.a(119, var15), -3645, var16);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((wf) var18).field_r[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((wf) var18).field_r[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        ((wf) var18).field_r[var5] = -5;
                        break L15;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_33_0 = (RuntimeException) var4;
                stackOut_33_1 = new StringBuilder().append("sd.F(").append(param0).append(44);
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                if (param1 == null) {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "null";
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  break L16;
                } else {
                  stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                  stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                  stackOut_34_2 = "{...}";
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  break L16;
                }
              }
              L17: {
                stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44);
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param2 == null) {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L17;
                } else {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L17;
                }
              }
              throw qk.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 < ((sd) this).field_g) {
          if (~param2 <= ~((sd) this).field_g) {
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
                break L1;
              } else {
                if (oh.field_f == 0) {
                  break L1;
                } else {
                  L2: {
                    if (((sd) this).field_b > 0) {
                      break L2;
                    } else {
                      ((sd) this).field_b = bd.field_d;
                      break L2;
                    }
                  }
                  ((sd) this).field_b = ((sd) this).field_b - 1;
                  break L1;
                }
              }
            }
            L3: {
              if (ma.field_I != 0) {
                break L3;
              } else {
                if (oh.field_f != 0) {
                  break L3;
                } else {
                  ((sd) this).field_j = 0;
                  break L3;
                }
              }
            }
            L4: {
              if (param1 > 122) {
                break L4;
              } else {
                boolean discarded$1 = ((sd) this).c((byte) 51);
                break L4;
              }
            }
            L5: {
              if (((sd) this).field_j != 0) {
                break L5;
              } else {
                L6: {
                  if (((sd) this).field_c) {
                    break L6;
                  } else {
                    if (!ja.field_l) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (param0 < 0) {
                  if (!((sd) this).field_c) {
                    break L5;
                  } else {
                    ((sd) this).field_h = -1;
                    break L5;
                  }
                } else {
                  L7: {
                    if (~param0 != ~((sd) this).field_h) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((sd) this).field_c = true;
                  ((sd) this).field_h = param0;
                  break L5;
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
