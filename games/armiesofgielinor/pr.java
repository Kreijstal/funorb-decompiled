/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pr {
    static String[] field_a;
    private int field_j;
    static String field_i;
    private at[] field_b;
    private int field_e;
    private int field_c;
    static int[] field_f;
    static vj field_g;
    private int[] field_d;
    private ru field_h;

    final at a(int param0, int param1) {
        if (param1 != 1) {
            return (at) null;
        }
        return this.field_b[1 + param0];
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        if (11 == p.field_b) {
            wp.d((byte) -13);
        }
        to.a(dd.field_a, q.field_C, wa.field_e, -1);
        if (param0 <= 106) {
            return;
        }
        try {
            pt.a(0, 12, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pr.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        param2++;
        if (!(this.field_b[param2] != null)) {
            this.field_b[param2] = new at();
        }
        if (param3 >= -95) {
            this.a(-65, (byte) -99, 28);
        }
        this.field_b[param2].a((byte) -119, (tc) (new a(param1, param0)));
    }

    final static boolean b(int param0) {
        int var1;
        int stackIn_4_0 = 0;
        L0: {
          L1: {
            var1 = -21 % ((param0 - -25) / 55);
            if (null == ra.field_e) {
              break L1;
            } else {
              if (!ra.field_e.a((byte) 103)) {
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = 0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final static void a(vh param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            java.awt.Canvas var6 = null;
            byte[] var7 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param1 == -84) {
                    break L1;
                  } else {
                    var6 = (java.awt.Canvas) null;
                    pr.a((byte) -8, (java.awt.Canvas) null);
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    var7 = new byte[24];
                    var2 = var7;
                    if (le.field_d == null) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          le.field_d.a(-1, 0L);
                          le.field_d.a(0, var7);
                          var3_int = 0;
                          L5: while (true) {
                            L6: {
                              if (var3_int >= 24) {
                                break L6;
                              } else {
                                if (var2[var3_int] == 0) {
                                  var3_int++;
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            if ((var3_int ^ -1) <= -25) {
                              throw new IOException();
                            } else {
                              param0.a(var2, 0, 24, 81);
                              decompiledRegionSelector0 = 0;
                              break L4;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L7: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L8: while (true) {
                            if (var4 >= 24) {
                              decompiledRegionSelector0 = 1;
                              break L7;
                            } else {
                              var2[var4] = (byte)-1;
                              var4++;
                              continue L8;
                            }
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param0.a(var2, 0, 24, 81);
                  break L2;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2_ref);

                stackIn_20_1 = new StringBuilder().append("pr.I(");

                if (param0 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L9;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L9;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static je a(int param0, int param1, int param2, int param3, int param4, int param5, ka param6, int param7, int param8, int param9, int param10, byte param11, int param12) {
        int var13_int = 0;
        RuntimeException var13 = null;
        je var14 = null;
        je stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var13_int = -103 % ((-17 - param11) / 52);
            var14 = new je(0L, (je) null);
            var14.field_G = tn.a(true, param12, param3);
            var14.field_mb = tn.a(true, param4, param8);
            var14.field_U = tn.a(true, param1, param7);
            var14.field_H = tn.a(true, param10, param9);
            var14.field_A = tn.a(true, param2, param0);
            var14.field_N = param5;
            var14.field_Z = param6;
            stackIn_1_0 = (je) (var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var13);

            stackIn_4_1 = new StringBuilder().append("pr.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 != 7742) {
            field_g = (vj) null;
        }
        field_a = null;
        field_f = null;
    }

    final wk a(int param0, int param1, byte param2, int param3) {
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        wk var11;
        int var11_int;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = this.field_h.field_e;
        var6 = 0;
        var7 = this.field_h.field_h;
        var8 = 0;
        var10 = 6 / ((17 - param2) / 40);
        var9 = this.field_h.field_d;
        L0: while (true) {
          if (var9 >= this.field_h.field_h) {
            var9 = 1 + (var8 - var7);
            var10 = 1 + (var6 + -var5);
            if ((var10 ^ -1) < -1) {
              if (0 < var9) {
                var10 = var10 + 2 * param3;
                var9 = var9 + param3 * 2;
                var11 = new wk(var10, var9);
                var12 = var7;
                L1: while (true) {
                  if (var8 < var12) {
                    var11.field_A = var10 + var5;
                    var11.field_x = var9 + var7;
                    var11.field_z = var7;
                    var11.field_w = var5;
                    return var11;
                  } else {
                    var17 = var5;
                    var13 = var17;
                    L2: while (true) {
                      if (var17 >= var6) {
                        var12++;
                        continue L1;
                      } else {
                        L3: {
                          var14 = this.field_h.field_k[var12 * this.field_h.field_e + var17];
                          var15 = this.field_d[var14];
                          stackIn_18_0 = var11.field_B;

                          stackIn_18_1 = (param3 + (-var7 + var12)) * var10 + (var17 - (var5 - param3));

                          if (var15 == param0) {
                            stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                            stackIn_19_1 = stackIn_18_1;
                            stackIn_19_2 = param1;
                            break L3;
                          } else {
                            stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                            stackIn_19_1 = stackIn_18_1;
                            stackIn_19_2 = 0;
                            break L3;
                          }
                        }
                        stackIn_19_0[stackIn_19_1] = stackIn_19_2;
                        var17++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var11_int = this.field_h.field_i;
            L4: while (true) {
              if (this.field_h.field_e <= var11_int) {
                var9++;
                continue L0;
              } else {
                var12 = this.field_h.field_k[var11_int + this.field_h.field_e * var9];
                var13 = this.field_d[var12];
                if ((param0 ^ -1) == (var13 ^ -1)) {
                  var5 = Math.min(var5, var11_int);
                  var6 = Math.max(var6, var11_int);
                  var7 = Math.min(var7, var9);
                  var8 = Math.max(var8, var9);
                  var11_int++;
                  continue L4;
                } else {
                  var11_int++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 0) {
            pr.b(-81);
        }
        vo.a(mi.field_l, 2, jn.field_d, param0, gl.field_c, param1, param2);
    }

    pr(ru param0, int param1, int param2) {
        try {
            this.field_e = 0;
            this.field_h = param0;
            this.field_j = param2;
            this.field_c = param1;
            this.c(-91);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var4 = -this.field_h.field_i + param0;
          var5 = param2 - this.field_h.field_d;
          if (var4 < 0) {
            break L0;
          } else {
            if (var4 >= -this.field_h.field_i + this.field_h.field_e) {
              break L0;
            } else {
              if (0 > var5) {
                break L0;
              } else {
                if (this.field_h.field_h + -this.field_h.field_d <= var5) {
                  break L0;
                } else {
                  if (this.field_h.field_k.length > var4 - -(this.field_h.field_e * var5)) {
                    var8 = -17 % ((-35 - param1) / 36);
                    var6 = this.field_h.field_k[var4 - -(var5 * this.field_h.field_e)];
                    var7 = this.field_d[var6];
                    return var7;
                  } else {
                    return -1;
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    private final void c(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_b = new at[257];
        this.field_d = new int[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_d.length) {
            var2 = -1;
            var3 = -1;
            var4 = 101 % ((-34 - param0) / 39);
            var5 = 0;
            L1: while (true) {
              if (this.field_h.field_j.length <= var5) {
                var4 = -1;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= this.field_h.field_k.length) {
                    return;
                  } else {
                    var6 = this.field_h.field_k[var5] & 255;
                    if (var2 != var6) {
                      if (var3 != var6) {
                        L3: {
                          if (this.field_d[var6] != -1) {
                            break L3;
                          } else {
                            fieldTemp$0 = this.field_e;
                            this.field_e = this.field_e + 1;
                            this.field_d[var6] = fieldTemp$0;
                            break L3;
                          }
                        }
                        var4 = this.field_d[var6];
                        var5++;
                        continue L2;
                      } else {
                        this.a(var5 / this.field_h.field_e, var5 % this.field_h.field_e, var4, (byte) -121);
                        var5++;
                        continue L2;
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (this.field_c != this.field_h.field_j[var5]) {
                  if (this.field_h.field_j[var5] == this.field_j) {
                    var3 = var5;
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var2 = var5;
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            this.field_d[var2] = -1;
            var2++;
            continue L0;
          }
        }
    }

    final void a(byte param0, int param1, boolean[] param2, int param3, ru param4) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        var18 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var21 = qn.field_d;
              var20 = var21;
              var19 = var20;
              var6 = var19;
              var7 = this.field_h.field_i;
              var8 = this.field_h.field_d;
              if (param0 > 79) {
                break L1;
              } else {
                this.a(52, 9);
                break L1;
              }
            }
            L2: {
              var9 = this.field_h.field_e;
              if (qn.field_j > var7 + param1) {
                var7 = qn.field_j + -param1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var9 + param1 >= qn.field_e) {
                var9 = -param1 + qn.field_e;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var10 = this.field_h.field_h;
              if (qn.field_a > var8 - -param3) {
                var8 = -param3 + qn.field_a;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (qn.field_f > var10 - -param3) {
                break L5;
              } else {
                var10 = -param3 + qn.field_f;
                break L5;
              }
            }
            var11 = var8;
            L6: while (true) {
              if (var11 >= var10) {
                break L0;
              } else {
                var12 = var7;
                L7: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L6;
                  } else {
                    var13 = var12 - -(var11 * this.field_h.field_e);
                    var14 = 255 & this.field_h.field_k[var13];
                    var15 = this.field_d[var14];
                    if (0 <= var15) {
                      if (var15 < param2.length) {
                        L8: {
                          if (param2[var15]) {
                            L9: {
                              var16 = param4.field_j[255 & param4.field_k[var13]];
                              var17 = qn.field_l * (param3 + var11) + (param1 + var12);
                              if (var21.length > var17) {
                                break L9;
                              } else {
                                System.out.println(var21.length);
                                break L9;
                              }
                            }
                            var21[var17] = var16;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var12++;
                        continue L7;
                      } else {
                        var12++;
                        continue L7;
                      }
                    } else {
                      var12++;
                      continue L7;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6_ref);

            stackIn_32_1 = new StringBuilder().append("pr.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
    }

    static {
        field_a = new String[]{"This unit has plate armour, giving +<%0>0% defence against melee attacks.", "This unit has padded armour, giving +<%0>0% defence against ranged attacks.", "This unit has enchanted armour, giving +<%0>0% defence against magical attacks.", "This unit has dragon armour, giving +<%0>0% defence against flame attacks.", "This unit has runic armour, giving +<%0>0% defence against all attacks.", "This unit has camoflaged armour, giving +<%0>0% defence against aerial attacks.", "This unit has stone armour, protecting it from <%0> attacks but halving its speed.", "This unit has granite armour, protecting it from <%0> attacks but immobilising it."};
        field_f = new int[]{0, 70, 74, 78, 82, 86, 90, 103, 104};
    }
}
