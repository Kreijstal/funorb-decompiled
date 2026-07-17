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
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = Main.field_T;
        try {
          L0: {
            var6_int = -59 % ((param1 - -62) / 32);
            var7 = 0;
            L1: while (true) {
              if (((bd) this).field_E.length <= var7) {
                if (((bd) this).field_G[((bd) this).field_E.length] == param3) {
                  ((bd) this).field_D.a(true);
                  break L0;
                } else {
                  return;
                }
              } else {
                L2: {
                  if (((bd) this).field_G[var7] != param3) {
                    var7++;
                    break L2;
                  } else {
                    ((bd) this).field_D.a(((bd) this).field_E[var7], true);
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
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("bd.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 41);
        }
    }

    final static String a(int param0, int param1, byte[] param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = Main.field_T;
        try {
          L0: {
            L1: {
              var14 = new char[param3];
              var13 = var14;
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var4 = var10;
              var5 = 0;
              if (param0 == 255) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (param3 <= var6) {
                stackOut_18_0 = new String(var14, 0, var5);
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L3: {
                  var7 = 255 & param2[var6 + param1];
                  if (var7 == 0) {
                    var6++;
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
                    int incrementValue$13 = var5;
                    var5++;
                    var10[incrementValue$13] = (char)var7;
                    var6++;
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
            stackOut_20_0 = (RuntimeException) var4_ref;
            stackOut_20_1 = new StringBuilder().append("bd.H(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 41);
        }
        return stackIn_19_0;
    }

    public static void l(int param0) {
        field_H = null;
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!super.a(param0, (byte) -116, param2, param3)) {
              if (param2 != 98) {
                L1: {
                  if (param1 < -99) {
                    break L1;
                  } else {
                    var6 = null;
                    String discarded$2 = bd.a(101, 70, (byte[]) null, 118);
                    break L1;
                  }
                }
                if (param2 != 99) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((bd) this).a(param3, (byte) -28);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_4_0 = ((bd) this).b(121, param3);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("bd.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ee var5 = null;
        Object var6 = null;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          var5 = j.field_C;
          if (((bd) this).field_E == null) {
            if (param2 != -1) {
              var6 = null;
              boolean discarded$34 = ((bd) this).a('', (byte) 54, 78, (lk) null);
              return;
            } else {
              return;
            }
          } else {
            int discarded$35 = var5.a(cb.field_h, param0 + ((bd) this).field_o, param1 + ((bd) this).field_i, ((bd) this).field_h, 20, 16777215, -1, 0, 0, var5.field_s - -var5.field_x);
            if (param2 == -1) {
              return;
            } else {
              var6 = null;
              boolean discarded$36 = ((bd) this).a('', (byte) 54, 78, (lk) null);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static int a(boolean param0, CharSequence param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var11 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (param3 > 36) {
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
                    if (~var7 >= ~var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_44_0 = var6;
                        stackIn_45_0 = stackOut_44_0;
                        break L0;
                      }
                    } else {
                      L4: {
                        var9 = param1.charAt(var8);
                        if (0 == var8) {
                          if (45 != var9) {
                            if (var9 != 43) {
                              break L4;
                            } else {
                              if (param0) {
                                var8++;
                                var8++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            var4_int = 1;
                            var8++;
                            var8++;
                            continue L3;
                          }
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          if (var9 < 48) {
                            break L6;
                          } else {
                            if (var9 <= 57) {
                              var9 -= 48;
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (65 > var9) {
                            break L7;
                          } else {
                            if (var9 > 90) {
                              break L7;
                            } else {
                              var9 -= 55;
                              break L5;
                            }
                          }
                        }
                        L8: {
                          if (97 > var9) {
                            break L8;
                          } else {
                            if (122 >= var9) {
                              var9 -= 87;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        throw new NumberFormatException();
                      }
                      if (var9 < param3) {
                        L9: {
                          if (var4_int == 0) {
                            break L9;
                          } else {
                            var9 = -var9;
                            break L9;
                          }
                        }
                        var10 = param3 * var6 - -var9;
                        if (~var6 != ~(var10 / param3)) {
                          throw new NumberFormatException();
                        } else {
                          var5 = 1;
                          var6 = var10;
                          var8++;
                          continue L3;
                        }
                      } else {
                        throw new NumberFormatException();
                      }
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var4;
            stackOut_46_1 = new StringBuilder().append("bd.D(").append(param0).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L10;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L10;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_45_0;
    }

    bd(wi param0) {
        super(0, 0, 0, 0, (ci) null);
        try {
            ((bd) this).field_D = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "bd.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        nb var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            ((bd) this).field_z.c(29026);
            if (param0 < -101) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (0 == param1.length) {
                    break L1;
                  } else {
                    var3_int = param1.length;
                    ((bd) this).field_E = new String[var3_int];
                    var4_int = 0;
                    L2: while (true) {
                      if (var3_int <= var4_int) {
                        var4 = new nb(j.field_C, 0, 1);
                        ((bd) this).field_G = new hl[1 + var3_int];
                        var5 = 0;
                        L3: while (true) {
                          if (var3_int <= var5) {
                            ((bd) this).field_G[var3_int] = new hl(sh.field_f, (pl) this);
                            ((bd) this).field_G[var3_int].field_v = (ci) (Object) var4;
                            ((bd) this).field_G[var3_int].a(15, 36 - -(var3_int * 16), 100, 0, true);
                            ((bd) this).b((lk) (Object) ((bd) this).field_G[var3_int], (byte) 118);
                            break L0;
                          } else {
                            ((bd) this).field_G[var5] = new hl(((bd) this).field_E[var5], (pl) this);
                            ((bd) this).field_G[var5].field_v = (ci) (Object) var4;
                            ((bd) this).field_G[var5].field_n = lb.field_e;
                            ((bd) this).field_G[var5].a(15, var5 * 16 + 20, 80, 0, true);
                            ((bd) this).b((lk) (Object) ((bd) this).field_G[var5], (byte) 118);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        ((bd) this).field_E[var4_int] = hg.a((CharSequence) (Object) param1[var4_int], (byte) 115).replace(' ', ' ');
                        var4_int++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              ((bd) this).field_E = null;
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("bd.J(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    static {
    }
}
