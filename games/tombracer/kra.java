/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kra {
    static lqa field_a;
    static Vector field_c;
    private int[] field_b;
    private int[] field_d;
    private byte[] field_e;

    final static void a(boolean param0) {
        if (param0) {
            return;
        }
        era.field_d = new ara(lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -2350) {
            return;
        }
        field_a = null;
    }

    final int a(byte param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 0;
              var8 = param3 << -1811553757;
              if (param0 <= -66) {
                break L1;
              } else {
                var16 = (byte[]) null;
                this.a(103, (byte) -26, -127, (byte[]) null, 31, (byte[]) null);
                break L1;
              }
            }
            param4 = param4 + param2;
            L2: while (true) {
              if (param2 >= param4) {
                stackIn_15_0 = -param3 + (var8 - -7 >> -1812584861);
                break L0;
              } else {
                var9 = 255 & param5[param2];
                var10 = this.field_d[var9];
                var11 = this.field_e[var9];
                if (0 == var11) {
                  throw new RuntimeException("" + var9);
                } else {
                  L3: {
                    var12 = var8 >> -229093373;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> -1863848481;
                    var14 = var12 + (-1 + var13 - -var11 >> 966679843);
                    var13 += 24;
                    dupTemp$0 = fh.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$0;
                    param1[var12] = (byte)dupTemp$0;
                    if (var14 <= var12) {
                      break L3;
                    } else {
                      var12++;
                      var13 -= 8;
                      var7_int = var10 >>> var13;
                      param1[var12] = (byte)(var10 >>> var13);
                      if (var14 <= var12) {
                        break L3;
                      } else {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param1[var12] = (byte)(var10 >>> var13);
                        if (var14 <= var12) {
                          break L3;
                        } else {
                          var13 -= 8;
                          var12++;
                          var7_int = var10 >>> var13;
                          param1[var12] = (byte)(var10 >>> var13);
                          if (var12 >= var14) {
                            break L3;
                          } else {
                            var13 -= 8;
                            var12++;
                            var7_int = var10 << -var13;
                            param1[var12] = (byte)(var10 << -var13);
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var8 = var8 + var11;
                  param2++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var7);

            stackIn_18_1 = new StringBuilder().append("kra.A(").append(param0).append(',');

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
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        return stackIn_15_0;
    }

    kra(byte[] param0) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        try {
          L0: {
            var2_int = param0.length;
            this.field_e = param0;
            this.field_d = new int[var2_int];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            this.field_b = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (0 == var6) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 - var6;
                      var8 = var17[var6];
                      this.field_d[var5] = var8;
                      if ((var8 & var7) == 0) {
                        var10 = var6 - 1;
                        L4: while (true) {
                          L5: {
                            if (var10 < 1) {
                              break L5;
                            } else {
                              var11 = var17[var10];
                              if ((var8 ^ -1) != (var11 ^ -1)) {
                                break L5;
                              } else {
                                var12 = 1 << -var10 + 32;
                                if ((var11 & var12) == 0) {
                                  var3[var10] = fh.a(var12, var11);
                                  var10--;
                                  continue L4;
                                } else {
                                  var3[var10] = var3[var10 - 1];
                                  break L5;
                                }
                              }
                            }
                          }
                          var9 = var8 | var7;
                          break L3;
                        }
                      } else {
                        var9 = var3[-1 + var6];
                        break L3;
                      }
                    }
                    var17[var6] = var9;
                    var10 = 1 + var6;
                    L6: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L7: while (true) {
                          if (var6 <= var11) {
                            L8: {
                              if (var10 < var4) {
                                break L8;
                              } else {
                                var4 = 1 + var10;
                                break L8;
                              }
                            }
                            this.field_b[var10] = var5 ^ -1;
                            break L2;
                          } else {
                            L9: {
                              var12 = -2147483648 >>> var11;
                              if (0 == (var8 & var12)) {
                                var10++;
                                break L9;
                              } else {
                                L10: {
                                  if (this.field_b[var10] != 0) {
                                    break L10;
                                  } else {
                                    this.field_b[var10] = var4;
                                    break L10;
                                  }
                                }
                                var10 = this.field_b[var10];
                                break L9;
                              }
                            }
                            L11: {
                              var12 = var12 >>> 1;
                              if (var10 < this.field_b.length) {
                                break L11;
                              } else {
                                var13 = new int[this.field_b.length * 2];
                                var14 = 0;
                                L12: while (true) {
                                  if (var14 >= this.field_b.length) {
                                    this.field_b = var13;
                                    break L11;
                                  } else {
                                    var13[var14] = this.field_b[var14];
                                    var14++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                            var11++;
                            continue L7;
                          }
                        }
                      } else {
                        L13: {
                          if ((var8 ^ -1) != (var17[var10] ^ -1)) {
                            break L13;
                          } else {
                            var17[var10] = var9;
                            break L13;
                          }
                        }
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var2);

            stackIn_38_1 = new StringBuilder().append("kra.<init>(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L14;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 71) {
                break L1;
              } else {
                this.field_b = (int[]) null;
                break L1;
              }
            }
            if (param2 != 0) {
              var7_int = 0;
              param2 = param2 + param4;
              var8 = param0;
              L2: while (true) {
                L3: {
                  var9 = param3[var8];
                  if (0 <= var9) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = this.field_b[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_b[var7_int];
                    var10 = dupTemp$0;
                    if (-1 < (dupTemp$0 ^ -1)) {
                      incrementValue$1 = param4;
                      param4++;
                      param5[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param2 > param4) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((64 & var9) == 0) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_b[var7_int];
                    var10 = dupTemp$2;
                    if (0 <= dupTemp$2) {
                      break L7;
                    } else {
                      incrementValue$3 = param4;
                      param4++;
                      param5[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param4 < param2) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if (-1 != (var9 & 32 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_b[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L9;
                    } else {
                      incrementValue$5 = param4;
                      param4++;
                      param5[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param4 < param2) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if (0 == (var9 & 16)) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_b[var7_int];
                    var10 = dupTemp$6;
                    if (-1 < (dupTemp$6 ^ -1)) {
                      incrementValue$7 = param4;
                      param4++;
                      param5[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param4 < param2) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((var9 & 8) != 0) {
                      var7_int = this.field_b[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_b[var7_int];
                    var10 = dupTemp$8;
                    if (-1 >= (dupTemp$8 ^ -1)) {
                      break L13;
                    } else {
                      incrementValue$9 = param4;
                      param4++;
                      param5[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param4 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if ((4 & var9) != 0) {
                      var7_int = this.field_b[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_b[var7_int];
                    var10 = dupTemp$10;
                    if (0 <= dupTemp$10) {
                      break L15;
                    } else {
                      incrementValue$11 = param4;
                      param4++;
                      param5[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param4 < param2) {
                        var7_int = 0;
                        break L15;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L16: {
                    if ((var9 & 2) != 0) {
                      var7_int = this.field_b[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_b[var7_int];
                    var10 = dupTemp$12;
                    if (-1 >= (dupTemp$12 ^ -1)) {
                      break L17;
                    } else {
                      incrementValue$13 = param4;
                      param4++;
                      param5[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param2 > param4) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return -param0 + var8 + 1;
                      }
                    }
                  }
                  L18: {
                    if ((1 & var9) != 0) {
                      var7_int = this.field_b[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    dupTemp$14 = this.field_b[var7_int];
                    var10 = dupTemp$14;
                    if (dupTemp$14 < 0) {
                      incrementValue$15 = param4;
                      param4++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param4 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackIn_66_0 = -param0 + var8 + 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("kra.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L20;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L21;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L21;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_66_0;
        }
    }

    static {
    }
}
