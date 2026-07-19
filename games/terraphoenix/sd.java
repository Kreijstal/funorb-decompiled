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
        int var3 = 0;
        L0: {
          this.field_i = 0;
          this.field_e = 0;
          var3 = 18 / ((-68 - param0) / 54);
          if (this.field_j != 0) {
            break L0;
          } else {
            if ((lf.field_c ^ -1) != -97) {
              break L0;
            } else {
              L1: {
                if (0 < this.field_h) {
                  break L1;
                } else {
                  this.field_h = this.field_g;
                  break L1;
                }
              }
              this.field_c = false;
              this.field_h = this.field_h - 1;
              break L0;
            }
          }
        }
        L2: {
          if (this.field_j != 0) {
            break L2;
          } else {
            this.field_i = lf.field_c;
            break L2;
          }
        }
        L3: {
          if (this.field_j != 0) {
            break L3;
          } else {
            if (lf.field_c == 97) {
              this.field_h = this.field_h + 1;
              this.field_c = false;
              if (this.field_h < this.field_g) {
                break L3;
              } else {
                this.field_h = 0;
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (this.field_j != 0) {
            break L4;
          } else {
            L5: {
              if (lf.field_c == 98) {
                break L5;
              } else {
                if (-100 != (lf.field_c ^ -1)) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if ((this.field_h ^ -1) <= -1) {
                break L6;
              } else {
                this.field_h = param1;
                break L6;
              }
            }
            this.field_c = false;
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
              if (0 != this.field_e) {
                break L1;
              } else {
                if (-85 == (this.field_i ^ -1)) {
                  break L1;
                } else {
                  if ((this.field_i ^ -1) != -84) {
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
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("sd.H(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
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
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  incrementValue$40 = var2;
                  var2++;
                  var5[incrementValue$40] = 0;
                  incrementValue$41 = var2;
                  var2++;
                  var5[incrementValue$41] = 0;
                  incrementValue$42 = var2;
                  var2++;
                  var5[incrementValue$42] = 0;
                  incrementValue$43 = var2;
                  var2++;
                  var5[incrementValue$43] = 0;
                  incrementValue$44 = var2;
                  var2++;
                  var5[incrementValue$44] = 0;
                  incrementValue$45 = var2;
                  var2++;
                  var5[incrementValue$45] = 0;
                  incrementValue$46 = var2;
                  var2++;
                  var5[incrementValue$46] = 0;
                  incrementValue$47 = var2;
                  var2++;
                  var5[incrementValue$47] = 0;
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
        if (0 == this.field_j) {
            if (lf.field_c == 98) {
                if (!((this.field_h ^ -1) < -1)) {
                    this.field_h = this.field_g;
                }
                this.field_c = false;
                this.field_h = this.field_h - 1;
            }
        }
        if (param0 > -11) {
            this.field_h = -59;
        }
        if (-1 == (this.field_j ^ -1)) {
            if (lf.field_c == 99) {
                this.field_h = this.field_h + 1;
                this.field_c = false;
                if (this.field_g <= this.field_h) {
                    this.field_h = 0;
                }
            }
        }
    }

    final static void a(byte param0, he param1, dh param2, int param3) {
        try {
            byte[] array$1 = null;
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
            wf var18_ref = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
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
                var18_ref = new wf();
                var18_ref.field_p = param2.a(-16384);
                var18_ref.field_i = param2.f((byte) -107);
                var18_ref.field_o = new byte[var18_ref.field_p][][];
                var18_ref.field_k = new int[var18_ref.field_p];
                var18_ref.field_j = new mf[var18_ref.field_p];
                var18_ref.field_m = new int[var18_ref.field_p];
                var18_ref.field_r = new int[var18_ref.field_p];
                var18_ref.field_s = new mf[var18_ref.field_p];
                var5 = 0;
                L1: while (true) {
                  if (var18_ref.field_p <= var5) {
                    var5 = 89 / ((param0 - -6) / 38);
                    rd.field_k.a(var18_ref, -16611);
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
                                              array$1 = new byte[var13];
                                              var11[var12_int] = array$1;
                                              param2.a(var13, 0, -37, var22[var12_int]);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      var18_ref.field_k[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (var9 <= var17) {
                                          var18_ref.field_j[var5] = param1.a(92, q.a(78, var20), var21, var12);
                                          var18_ref.field_o[var5] = var22;
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
                          var18_ref.field_k[var5] = var6_int;
                          var18_ref.field_m[var5] = var9;
                          var18_ref.field_s[var5] = param1.a(q.a(119, var15), -3645, var16);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18_ref.field_r[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18_ref.field_r[var5] = -2;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18_ref.field_r[var5] = -3;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18_ref.field_r[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        var18_ref.field_r[var5] = -5;
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
                stackOut_33_0 = (RuntimeException) (var4);
                stackOut_33_1 = new StringBuilder().append("sd.F(").append(param0).append(',');
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                if (param1 == null) {
                  stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                  stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                  stackOut_35_2 = "null";
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  break L16;
                } else {
                  stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
                  stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
                  stackOut_34_2 = "{...}";
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  break L16;
                }
              }
              L17: {
                stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param2 == null) {
                  stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L17;
                } else {
                  stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L17;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$1 = false;
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
              if (this.field_j == 0) {
                if (ma.field_I == 0) {
                  if (oh.field_f != 0) {
                    break L1;
                  } else {
                    this.field_j = 0;
                    break L1;
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
            L2: {
              if (param1 > 122) {
                break L2;
              } else {
                discarded$1 = this.c((byte) 51);
                break L2;
              }
            }
            L3: {
              if (-1 != (this.field_j ^ -1)) {
                break L3;
              } else {
                L4: {
                  if (this.field_c) {
                    break L4;
                  } else {
                    if (!ja.field_l) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-1 < (param0 ^ -1)) {
                  if (!this.field_c) {
                    break L3;
                  } else {
                    this.field_h = -1;
                    break L3;
                  }
                } else {
                  L5: {
                    if (param0 != this.field_h) {
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  this.field_c = true;
                  this.field_h = param0;
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
