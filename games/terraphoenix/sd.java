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
            ci[] var2 = (ci[]) null;
            sd.a(true, (ci[]) null);
        }
        field_f = null;
        field_d = null;
    }

    final void a(byte param0, int param1) {
        this.field_i = 0;
        this.field_e = 0;
        int var3 = 18 / ((-68 - param0) / 54);
        if (this.field_j == 0 && (lf.field_c ^ -1) == -97) {
            if (0 >= this.field_h) {
                this.field_h = this.field_g;
            }
            this.field_c = false;
            this.field_h = this.field_h - 1;
        }
        if (this.field_j == 0) {
            this.field_i = lf.field_c;
        }
        if (this.field_j == 0) {
            if (!(lf.field_c != 97)) {
                this.field_h = this.field_h + 1;
                this.field_c = false;
                if (this.field_h >= this.field_g) {
                    this.field_h = 0;
                }
            }
        }
        if (this.field_j == 0) {
            if (lf.field_c == 98 || -100 == (lf.field_c ^ -1)) {
                if ((this.field_h ^ -1) > -1) {
                    this.field_h = param1;
                }
                this.field_c = false;
            }
        }
    }

    final boolean c(byte param0) {
        int stackIn_8_0 = 0;
        if (param0 <= -116) {
          L0: {
            L1: {
              if (0 != this.field_e) {
                break L1;
              } else {
                if (-85 == (this.field_i ^ -1)) {
                  break L1;
                } else {
                  if ((this.field_i ^ -1) != -84) {
                    stackIn_8_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_8_0 = 1;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final static void a(boolean param0, ci[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_d = (String[]) null;
                break L1;
              }
            }
            L2: {
              rk.field_f = param1;
              if (rk.field_f == null) {
                break L2;
              } else {
                if (-4 < (param1.length ^ -1)) {
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
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("sd.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_j = 0;
        if (param3 != -85) {
            dh var6 = (dh) null;
            sd.a((byte) -10, (he) null, (dh) null, 107);
        }
        this.field_c = param1 ? true : false;
        if (!this.field_c) {
            this.field_h = param0;
        } else {
            this.field_h = param2;
        }
    }

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            var5 = dk.field_c;
            var1 = var5;
            if (param0 == 87) {
              var2 = 0;
              var3 = var5.length;
              L1: while (true) {
                if (var3 <= var2) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  incrementValue$16 = var2;
                  var2++;
                  var5[incrementValue$16] = 0;
                  incrementValue$17 = var2;
                  var2++;
                  var5[incrementValue$17] = 0;
                  incrementValue$18 = var2;
                  var2++;
                  var5[incrementValue$18] = 0;
                  incrementValue$19 = var2;
                  var2++;
                  var5[incrementValue$19] = 0;
                  incrementValue$20 = var2;
                  var2++;
                  var5[incrementValue$20] = 0;
                  incrementValue$21 = var2;
                  var2++;
                  var5[incrementValue$21] = 0;
                  incrementValue$22 = var2;
                  var2++;
                  var5[incrementValue$22] = 0;
                  incrementValue$23 = var2;
                  var2++;
                  var5[incrementValue$23] = 0;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "sd.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        this.field_i = 0;
        this.field_e = 0;
        if (!(this.field_j != 0)) {
            this.field_i = lf.field_c;
        }
        if (0 == this.field_j && lf.field_c == 98) {
            if (!((this.field_h ^ -1) < -1)) {
                this.field_h = this.field_g;
            }
            this.field_c = false;
            this.field_h = this.field_h - 1;
        }
        if (param0 > -11) {
            this.field_h = -59;
        }
        if (-1 == (this.field_j ^ -1) && lf.field_c == 99) {
            this.field_h = this.field_h + 1;
            this.field_c = false;
            if (this.field_g <= this.field_h) {
                this.field_h = 0;
            }
        }
    }

    final static void a(byte param0, he param1, dh param2, int param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            String stackIn_36_2 = null;
            StringBuilder stackIn_38_1 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
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
            var14 = Terraphoenix.field_V;
            try {
              L0: {
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
                L1: while (true) {
                  if (var18.field_p <= var5) {
                    var5 = 89 / ((param0 - -6) / 38);
                    rd.field_k.a(var18, -16611);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param2.a(-16384);
                            if (-1 == (var6_int ^ -1)) {
                              break L4;
                            } else {
                              if (-2 == (var6_int ^ -1)) {
                                break L4;
                              } else {
                                if ((var6_int ^ -1) == -3) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (var6_int == 3) {
                                      break L5;
                                    } else {
                                      if (-5 == (var6_int ^ -1)) {
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
                                        var22 = new byte[var9][];
                                        var19 = var22;
                                        var11 = var19;
                                        if ((var6_int ^ -1) != -4) {
                                          break L7;
                                        } else {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var9 <= var12_int) {
                                              break L7;
                                            } else {
                                              var13 = param2.f((byte) -107);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param2.a(var13, 0, -37, var22[var12_int]);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      var18.field_k[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (var9 <= var17) {
                                          var18.field_j[var5] = param1.a(92, q.a(78, var20), var21, var12);
                                          var18.field_o[var5] = var22;
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
                          var18.field_k[var5] = var6_int;
                          var18.field_m[var5] = var9;
                          var18.field_s[var5] = param1.a(q.a(119, var15), -3645, var16);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_r[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_r[var5] = -2;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_r[var5] = -3;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_r[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_r[var5] = -5;
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
                stackIn_35_0 = (RuntimeException) (var4);

                stackIn_35_1 = new StringBuilder().append("sd.F(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                  stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                  stackIn_36_2 = "null";
                  break L16;
                } else {
                  stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                  stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                  stackIn_36_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

                if (param2 == null) {
                  stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "null";
                  break L17;
                } else {
                  stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "{...}";
                  break L17;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_36_0), stackIn_39_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 < this.field_g) {
          if (param2 >= this.field_g) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              this.field_e = 0;
              this.field_i = 0;
              if (0 == ma.field_I) {
                break L0;
              } else {
                this.field_e = ma.field_I;
                this.field_c = true;
                this.field_h = param2;
                this.field_j = ma.field_I;
                this.field_b = gl.field_m;
                break L0;
              }
            }
            L1: {
              if (this.field_j != 0) {
                if (-1 != (oh.field_f ^ -1)) {
                  L2: {
                    if (-1 > (this.field_b ^ -1)) {
                      break L2;
                    } else {
                      this.field_b = bd.field_d;
                      break L2;
                    }
                  }
                  this.field_b = this.field_b - 1;
                  if (ma.field_I != 0) {
                    break L1;
                  } else {
                    if (oh.field_f != 0) {
                      break L1;
                    } else {
                      this.field_j = 0;
                      break L1;
                    }
                  }
                } else {
                  if (ma.field_I != 0) {
                    break L1;
                  } else {
                    if (oh.field_f != 0) {
                      break L1;
                    } else {
                      this.field_j = 0;
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
                    this.field_j = 0;
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param1 > 122) {
                break L3;
              } else {
                this.c((byte) 51);
                break L3;
              }
            }
            L4: {
              if (-1 != (this.field_j ^ -1)) {
                break L4;
              } else {
                L5: {
                  if (this.field_c) {
                    break L5;
                  } else {
                    if (!ja.field_l) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (-1 < (param0 ^ -1)) {
                  if (!this.field_c) {
                    break L4;
                  } else {
                    this.field_h = -1;
                    break L4;
                  }
                } else {
                  L6: {
                    if (param0 != this.field_h) {
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_c = true;
                  this.field_h = param0;
                  break L4;
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
        this.field_c = false;
        this.field_h = 0;
        this.field_g = param0;
    }

    static {
        field_a = "MP4.4";
        field_f = "Select next friendly unit";
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
