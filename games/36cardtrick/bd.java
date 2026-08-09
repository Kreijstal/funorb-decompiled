/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends g implements qh {
    static kc field_H;
    private hl[] field_G;
    private wi field_D;
    private String[] field_E;
    static int field_F;

    final static void d(byte param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == e.field_e) {
                break L0;
              } else {
                try {
                  L1: {
                    e.field_e.a(0L, 10);
                    e.field_e.a(rd.field_j.field_g, rd.field_j.field_i, 24, -1);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  L3: {
                    if (param0 <= -59) {
                      break L3;
                    } else {
                      field_F = -108;
                      break L3;
                    }
                  }
                  rd.field_j.field_i = rd.field_j.field_i + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            if (param0 > -59) {
              field_F = -108;
              rd.field_j.field_i = rd.field_j.field_i + 24;
              return;
            } else {
              rd.field_j.field_i = rd.field_j.field_i + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Main.field_T;
        try {
          L0: {
            var6_int = -59 % ((param1 - -62) / 32);
            var7 = 0;
            L1: while (true) {
              if (this.field_E.length <= var7) {
                if (this.field_G[this.field_E.length] == param3) {
                  this.field_D.a(true);
                  break L0;
                } else {
                  return;
                }
              } else {
                L2: {
                  if (this.field_G[var7] != param3) {
                    break L2;
                  } else {
                    this.field_D.a(this.field_E[var7], true);
                    break L2;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("bd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = Main.field_T;
        try {
          L0: {
            L1: {
              var12 = new char[param3];
              var11 = var12;
              var10 = var11;
              var4 = var10;
              var5 = 0;
              if (param0 == 255) {
                break L1;
              } else {
                field_H = (kc) null;
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (param3 <= var6) {
                stackIn_17_0 = new String(var12, 0, var5);
                break L0;
              } else {
                L3: {
                  var7 = 255 & param2[var6 + param1];
                  if (var7 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (var7 < 128) {
                        break L4;
                      } else {
                        if (var7 < 160) {
                          L5: {
                            var8 = se.field_K[var7 + -128];
                            if (0 == var8) {
                              var8 = 63;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    incrementValue$1 = var5;
                    var5++;
                    var10[incrementValue$1] = (char)var7;
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("bd.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    public static void l(int param0) {
        if (param0 != -10790) {
            field_F = -70;
            field_H = null;
            return;
        }
        field_H = null;
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        byte[] var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, (byte) -116, param2, param3)) {
              if ((param2 ^ -1) != -99) {
                L1: {
                  if (param1 < -99) {
                    break L1;
                  } else {
                    var6 = (byte[]) null;
                    bd.a(101, 70, (byte[]) null, 118);
                    break L1;
                  }
                }
                if (-100 != (param2 ^ -1)) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(param3, (byte) -28);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.b(121, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("bd.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ee var5;
        lk var6;
        super.a(param0, param1, param2 ^ 0, param3);
        if (param3 == 0) {
          var5 = j.field_C;
          if (this.field_E == null) {
            if (param2 != -1) {
              var6 = (lk) null;
              this.a('', (byte) 54, 78, (lk) null);
              return;
            } else {
              return;
            }
          } else {
            var5.a(cb.field_h, param0 + this.field_o, param1 + this.field_i, this.field_h, 20, 16777215, -1, 0, 0, var5.field_s - -var5.field_x);
            if (param2 == -1) {
              return;
            } else {
              var6 = (lk) null;
              this.a('', (byte) 54, 78, (lk) null);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static int a(boolean param0, CharSequence param1, byte param2, int param3) {
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Main.field_T;
        try {
          L0: {
            L1: {
              if (-3 < (param3 ^ -1)) {
                break L1;
              } else {
                if (-37 > (param3 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    if (param2 == 122) {
                      break L2;
                    } else {
                      bd.d((byte) -54);
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackIn_42_0 = var6;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (0 == var8) {
                            if (45 != var9) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (param0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (65 > var9) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (97 > var9) {
                              break L9;
                            } else {
                              if (122 >= var9) {
                                var9 -= 87;
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 < param3) {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = param3 * var6 - -var9;
                          if (var6 != var10 / param3) {
                            throw new NumberFormatException();
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var4);

            stackIn_45_1 = new StringBuilder().append("bd.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L11;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L11;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_42_0;
    }

    bd(wi param0) {
        super(0, 0, 0, 0, (ci) null);
        try {
            this.field_D = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String[] param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        nb var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Main.field_T;
        try {
          L0: {
            this.field_z.c(29026);
            if (param0 < -101) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (0 == param1.length) {
                    break L1;
                  } else {
                    var3_int = param1.length;
                    this.field_E = new String[var3_int];
                    var4_int = 0;
                    L2: while (true) {
                      if (var3_int <= var4_int) {
                        var4 = new nb(j.field_C, 0, 1);
                        this.field_G = new hl[1 + var3_int];
                        var5 = 0;
                        L3: while (true) {
                          if (var3_int <= var5) {
                            this.field_G[var3_int] = new hl(sh.field_f, (pl) (this));
                            this.field_G[var3_int].field_v = (ci) ((Object) var4);
                            this.field_G[var3_int].a(15, 36 - -(var3_int * 16), 100, 0, true);
                            this.b(this.field_G[var3_int], (byte) 118);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            this.field_G[var5] = new hl(this.field_E[var5], (pl) (this));
                            this.field_G[var5].field_v = (ci) ((Object) var4);
                            this.field_G[var5].field_n = lb.field_e;
                            this.field_G[var5].a(15, var5 * 16 + 20, 80, 0, true);
                            this.b(this.field_G[var5], (byte) 118);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        this.field_E[var4_int] = hg.a((CharSequence) ((Object) param1[var4_int]), (byte) 115).replace(' ', ' ');
                        var4_int++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              this.field_E = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("bd.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
    }
}
