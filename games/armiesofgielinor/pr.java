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
        int discarded$2 = 0;
        L0: {
          param2++;
          if (this.field_b[param2] == null) {
            this.field_b[param2] = new at();
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 >= -95) {
          discarded$2 = this.a(-65, (byte) -99, 28);
          this.field_b[param2].a((byte) -119, (tc) (new a(param1, param0)));
          return;
        } else {
          this.field_b[param2].a((byte) -119, (tc) (new a(param1, param0)));
          return;
        }
    }

    final static boolean b(int param0) {
        int var1 = 0;
        var1 = -21 % ((param0 - -25) / 55);
        if (null != ra.field_e) {
          if (!ra.field_e.a((byte) 103)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(vh param0, byte param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            java.awt.Canvas var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte stackIn_7_0 = 0;
            int stackIn_13_0 = 0;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_6_0 = 0;
            int stackOut_12_0 = 0;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
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
                    var9 = new byte[24];
                    var8 = var9;
                    var7 = var8;
                    var2 = var7;
                    if (le.field_d == null) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          le.field_d.a(-1, 0L);
                          le.field_d.a(0, var9);
                          var3_int = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (var3_int >= 24) {
                                  break L7;
                                } else {
                                  stackOut_6_0 = var9[var3_int];
                                  stackIn_13_0 = stackOut_6_0;
                                  stackIn_7_0 = stackOut_6_0;
                                  if (var5 != 0) {
                                    break L6;
                                  } else {
                                    L8: {
                                      if (stackIn_7_0 == 0) {
                                        break L8;
                                      } else {
                                        if (var5 == 0) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    continue L5;
                                  }
                                }
                              }
                              stackOut_12_0 = var3_int ^ -1;
                              stackIn_13_0 = stackOut_12_0;
                              break L6;
                            }
                            if (stackIn_13_0 <= -25) {
                              throw new IOException();
                            } else {
                              decompiledRegionSelector0 = 0;
                              break L4;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L9: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L10: while (true) {
                            if (var4 >= 24) {
                              decompiledRegionSelector0 = 0;
                              break L9;
                            } else {
                              var7[var4] = (byte)-1;
                              var4++;
                              if (var5 != 0) {
                                decompiledRegionSelector0 = 1;
                                break L9;
                              } else {
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param0.a(var9, 0, 24, 81);
                  break L2;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) (var2_ref);
                stackOut_24_1 = new StringBuilder().append("pr.I(");
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param0 == null) {
                  stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L11;
                } else {
                  stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L11;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            stackOut_0_0 = (je) (var14);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var13);
            stackOut_2_1 = new StringBuilder().append("pr.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param6 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
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
          field_a = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          return;
        }
    }

    final wk a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        wk var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        wk stackIn_22_0 = null;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        wk stackIn_29_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_11_0 = 0;
        wk stackOut_21_0 = null;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        wk stackOut_28_0 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = this.field_h.field_e;
        var6 = 0;
        var7 = this.field_h.field_h;
        var8 = 0;
        var10 = 6 / ((17 - param2) / 40);
        var9 = this.field_h.field_d;
        L0: while (true) {
          stackOut_1_0 = var9;
          stackOut_1_1 = this.field_h.field_h;
          stackIn_2_0 = stackOut_1_0;
          stackIn_2_1 = stackOut_1_1;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 >= stackIn_2_1) {
                  break L3;
                } else {
                  stackOut_3_0 = this.field_h.field_i;
                  stackIn_12_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var16 != 0) {
                    break L2;
                  } else {
                    var11_int = stackIn_4_0;
                    L4: while (true) {
                      L5: {
                        if (this.field_h.field_e <= var11_int) {
                          break L5;
                        } else {
                          var12 = this.field_h.field_k[var11_int + this.field_h.field_e * var9];
                          var13 = this.field_d[var12];
                          stackOut_6_0 = param0 ^ -1;
                          stackOut_6_1 = var13 ^ -1;
                          stackIn_2_0 = stackOut_6_0;
                          stackIn_2_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var16 != 0) {
                            continue L1;
                          } else {
                            L6: {
                              if (stackIn_7_0 != stackIn_7_1) {
                                break L6;
                              } else {
                                var5 = Math.min(var5, var11_int);
                                var6 = Math.max(var6, var11_int);
                                var7 = Math.min(var7, var9);
                                var8 = Math.max(var8, var9);
                                break L6;
                              }
                            }
                            var11_int++;
                            if (var16 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var9++;
                      if (var16 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              var9 = 1 + (var8 - var7);
              var10 = 1 + (var6 + -var5);
              stackOut_11_0 = var10 ^ -1;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            }
            if (stackIn_12_0 < -1) {
              if (0 < var9) {
                var10 = var10 + 2 * param3;
                var9 = var9 + param3 * 2;
                var11 = new wk(var10, var9);
                var12 = var7;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var8 < var12) {
                        var11.field_A = var10 + var5;
                        var11.field_x = var9 + var7;
                        var11.field_z = var7;
                        var11.field_w = var5;
                        break L9;
                      } else {
                        if (var16 != 0) {
                          break L9;
                        } else {
                          var13 = var5;
                          L10: while (true) {
                            if (var13 >= var6) {
                              var12++;
                              continue L7;
                            } else {
                              var14 = this.field_h.field_k[var12 * this.field_h.field_e + var13];
                              var15 = this.field_d[var14];
                              stackOut_21_0 = (wk) (var11);
                              stackIn_29_0 = stackOut_21_0;
                              stackIn_22_0 = stackOut_21_0;
                              if (var16 != 0) {
                                break L8;
                              } else {
                                L11: {
                                  stackOut_22_0 = stackIn_22_0.field_B;
                                  stackOut_22_1 = (param3 + (-var7 + var12)) * var10 + (var13 - (var5 - param3));
                                  stackIn_24_0 = stackOut_22_0;
                                  stackIn_24_1 = stackOut_22_1;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackIn_23_1 = stackOut_22_1;
                                  if (var15 == param0) {
                                    stackOut_24_0 = (int[]) ((Object) stackIn_24_0);
                                    stackOut_24_1 = stackIn_24_1;
                                    stackOut_24_2 = param1;
                                    stackIn_25_0 = stackOut_24_0;
                                    stackIn_25_1 = stackOut_24_1;
                                    stackIn_25_2 = stackOut_24_2;
                                    break L11;
                                  } else {
                                    stackOut_23_0 = (int[]) ((Object) stackIn_23_0);
                                    stackOut_23_1 = stackIn_23_1;
                                    stackOut_23_2 = 0;
                                    stackIn_25_0 = stackOut_23_0;
                                    stackIn_25_1 = stackOut_23_1;
                                    stackIn_25_2 = stackOut_23_2;
                                    break L11;
                                  }
                                }
                                stackIn_25_0[stackIn_25_1] = stackIn_25_2;
                                var13++;
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_28_0 = (wk) (var11);
                    stackIn_29_0 = stackOut_28_0;
                    break L8;
                  }
                  return stackIn_29_0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        boolean discarded$2 = false;
        if (param3 != 0) {
          discarded$2 = pr.b(-81);
          vo.a(mi.field_l, 2, jn.field_d, param0, gl.field_c, param1, param2);
          return;
        } else {
          vo.a(mi.field_l, 2, jn.field_d, param0, gl.field_c, param1, param2);
          return;
        }
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var4 = -this.field_h.field_i + param0;
        var5 = param2 - this.field_h.field_d;
        if (var4 >= 0) {
          if (var4 < -this.field_h.field_i + this.field_h.field_e) {
            if (0 <= var5) {
              if (this.field_h.field_h + -this.field_h.field_d > var5) {
                if (this.field_h.field_k.length <= var4 - -(this.field_h.field_e * var5)) {
                  return -1;
                } else {
                  var8 = -17 % ((-35 - param1) / 36);
                  var6 = this.field_h.field_k[var4 - -(var5 * this.field_h.field_e)];
                  var7 = this.field_d[var6];
                  return var7;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private final void c(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_b = new at[257];
        this.field_d = new int[256];
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var2 >= this.field_d.length) {
                break L2;
              } else {
                this.field_d[var2] = -1;
                var2++;
                if (var7 != 0) {
                  break L1;
                } else {
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2 = -1;
            break L1;
          }
          var3 = -1;
          var4 = 101 % ((-34 - param0) / 39);
          var5 = 0;
          L3: while (true) {
            L4: {
              L5: {
                L6: {
                  if (this.field_h.field_j.length <= var5) {
                    break L6;
                  } else {
                    var9 = this.field_h.field_j[var5];
                    var8 = this.field_c;
                    if (var7 != 0) {
                      if (var8 < var9) {
                        L7: while (true) {
                          var6 = this.field_h.field_k[var5] & 255;
                          if (var7 == 0) {
                            L8: {
                              L9: {
                                if (var2 != var6) {
                                  break L9;
                                } else {
                                  if (var7 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (var3 != var6) {
                                  break L10;
                                } else {
                                  this.a(var5 / this.field_h.field_e, var5 % this.field_h.field_e, var4, (byte) -121);
                                  if (var7 == 0) {
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (this.field_d[var6] != -1) {
                                  break L11;
                                } else {
                                  fieldTemp$2 = this.field_e;
                                  this.field_e = this.field_e + 1;
                                  this.field_d[var6] = fieldTemp$2;
                                  break L11;
                                }
                              }
                              var4 = this.field_d[var6];
                              break L8;
                            }
                            var5++;
                            if (var5 < this.field_h.field_k.length) {
                              continue L7;
                            } else {
                              break L5;
                            }
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      L12: {
                        L13: {
                          if (var8 != var9) {
                            break L13;
                          } else {
                            var2 = var5;
                            if (var7 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (this.field_h.field_j[var5] == this.field_j) {
                          var3 = var5;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      var5++;
                      if (var7 == 0) {
                        continue L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var4 = -1;
                var5 = 0;
                L14: while (true) {
                  if (var5 < this.field_h.field_k.length) {
                    var6 = this.field_h.field_k[var5] & 255;
                    if (var7 == 0) {
                      L15: {
                        L16: {
                          if (var2 != var6) {
                            break L16;
                          } else {
                            if (var7 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        L17: {
                          if (var3 != var6) {
                            break L17;
                          } else {
                            this.a(var5 / this.field_h.field_e, var5 % this.field_h.field_e, var4, (byte) -121);
                            if (var7 == 0) {
                              break L15;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (this.field_d[var6] != -1) {
                            break L18;
                          } else {
                            fieldTemp$3 = this.field_e;
                            this.field_e = this.field_e + 1;
                            this.field_d[var6] = fieldTemp$3;
                            break L18;
                          }
                        }
                        var4 = this.field_d[var6];
                        break L15;
                      }
                      var5++;
                      continue L14;
                    } else {
                      break L4;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              return;
            }
            return;
          }
        }
    }

    final void a(byte param0, int param1, boolean[] param2, int param3, ru param4) {
        at discarded$1 = null;
        RuntimeException var6 = null;
        int[] var6_array = null;
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
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var18 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var21 = qn.field_d;
              var20 = var21;
              var19 = var20;
              var6_array = var19;
              var7 = this.field_h.field_i;
              var8 = this.field_h.field_d;
              if (param0 > 79) {
                break L1;
              } else {
                discarded$1 = this.a(52, 9);
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
              stackOut_15_0 = var11;
              stackOut_15_1 = var10;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              L7: while (true) {
                if (stackIn_16_0 >= stackIn_16_1) {
                  break L0;
                } else {
                  if (var18 == 0) {
                    var12 = var7;
                    L8: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L6;
                      } else {
                        var13 = var12 - -(var11 * this.field_h.field_e);
                        var14 = 255 & this.field_h.field_k[var13];
                        var15 = this.field_d[var14];
                        stackOut_21_0 = 0;
                        stackOut_21_1 = var15;
                        stackIn_16_0 = stackOut_21_0;
                        stackIn_16_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (var18 != 0) {
                          continue L7;
                        } else {
                          L9: {
                            if (stackIn_22_0 > stackIn_22_1) {
                              break L9;
                            } else {
                              if (var15 >= param2.length) {
                                break L9;
                              } else {
                                if (param2[var15]) {
                                  L10: {
                                    var16 = param4.field_j[255 & param4.field_k[var13]];
                                    var17 = qn.field_l * (param3 + var11) + (param1 + var12);
                                    if (var21.length > var17) {
                                      break L10;
                                    } else {
                                      System.out.println(var21.length);
                                      break L10;
                                    }
                                  }
                                  var21[var17] = var16;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var6);
            stackOut_32_1 = new StringBuilder().append("pr.D(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param3).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param4 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
    }

    static {
        field_a = new String[]{"This unit has plate armour, giving +<%0>0% defence against melee attacks.", "This unit has padded armour, giving +<%0>0% defence against ranged attacks.", "This unit has enchanted armour, giving +<%0>0% defence against magical attacks.", "This unit has dragon armour, giving +<%0>0% defence against flame attacks.", "This unit has runic armour, giving +<%0>0% defence against all attacks.", "This unit has camoflaged armour, giving +<%0>0% defence against aerial attacks.", "This unit has stone armour, protecting it from <%0> attacks but halving its speed.", "This unit has granite armour, protecting it from <%0> attacks but immobilising it."};
        field_f = new int[]{0, 70, 74, 78, 82, 86, 90, 103, 104};
    }
}
