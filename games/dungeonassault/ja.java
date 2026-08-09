/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static String[] field_d;
    private int[] field_e;
    private int[] field_c;
    static cn[] field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_b = (cn[]) null;
        }
        field_d = null;
        field_b = null;
    }

    final int a(byte[] param0, byte[] param1, byte param2, int param3, int param4, int param5) {
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
        int stackIn_6_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param2 == -88) {
                break L1;
              } else {
                var12 = (byte[]) null;
                this.a((byte[]) null, (byte[]) null, (byte) 93, -112, -52, -44);
                break L1;
              }
            }
            if (-1 == (param5 ^ -1)) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param5 = param5 + param4;
              var7_int = 0;
              var8 = param3;
              L2: while (true) {
                L3: {
                  var9 = param0[var8];
                  if ((var9 ^ -1) > -1) {
                    var7_int = this.field_e[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_e[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 < 0) {
                      incrementValue$1 = param4;
                      param4++;
                      param1[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param4 < param5) {
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
                    if ((var9 & 64) != 0) {
                      var7_int = this.field_e[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_e[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L7;
                    } else {
                      incrementValue$3 = param4;
                      param4++;
                      param1[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param4 < param5) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if ((var9 & 32) == 0) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = this.field_e[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_e[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L9;
                    } else {
                      incrementValue$5 = param4;
                      param4++;
                      param1[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param5 > param4) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if (0 != (16 & var9)) {
                      var7_int = this.field_e[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_e[var7_int];
                    var10 = dupTemp$6;
                    if (-1 < (dupTemp$6 ^ -1)) {
                      incrementValue$7 = param4;
                      param4++;
                      param1[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param5 <= param4) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (0 != (var9 & 8)) {
                      var7_int = this.field_e[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_e[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 >= 0) {
                      break L13;
                    } else {
                      incrementValue$9 = param4;
                      param4++;
                      param1[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param4 < param5) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if ((var9 & 4) != 0) {
                      var7_int = this.field_e[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_e[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 < 0) {
                      incrementValue$11 = param4;
                      param4++;
                      param1[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param4 < param5) {
                        var7_int = 0;
                        break L15;
                      } else {
                        return -param3 + (1 + var8);
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (0 == (var9 & 2)) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = this.field_e[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_e[var7_int];
                    var10 = dupTemp$12;
                    if (-1 >= (dupTemp$12 ^ -1)) {
                      break L17;
                    } else {
                      incrementValue$13 = param4;
                      param4++;
                      param1[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param4 >= param5) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (-1 == (var9 & 1 ^ -1)) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = this.field_e[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    dupTemp$14 = this.field_e[var7_int];
                    var10 = dupTemp$14;
                    if (0 > dupTemp$14) {
                      incrementValue$15 = param4;
                      param4++;
                      param1[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param4 < param5) {
                        var7_int = 0;
                        break L19;
                      } else {
                        break L4;
                      }
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackIn_68_0 = -param3 + (1 + var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var7);

            stackIn_71_1 = new StringBuilder().append("ja.C(");

            if (param0 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L20;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');

            if (param1 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L21;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L21;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_72_0), stackIn_75_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_68_0;
        }
    }

    ja(byte[] param0) {
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
            this.field_c = new int[var2_int];
            this.field_e = new int[8];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (-1 == (var6 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 - var6;
                      var8 = var17[var6];
                      this.field_c[var5] = var8;
                      if ((var7 & var8) == 0) {
                        var9 = var8 | var7;
                        var10 = var6 + -1;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var17[var10];
                            if (var11 != var8) {
                              break L3;
                            } else {
                              var12 = 1 << -var10 + 32;
                              if (0 != (var12 & var11)) {
                                var3[var10] = var3[-1 + var10];
                                break L3;
                              } else {
                                var3[var10] = mp.a(var11, var12);
                                var10--;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var9 = var3[-1 + var6];
                        break L3;
                      }
                    }
                    var17[var6] = var9;
                    var10 = var6 + 1;
                    L5: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var11 >= var6) {
                            L7: {
                              if (var4 > var10) {
                                break L7;
                              } else {
                                var4 = 1 + var10;
                                break L7;
                              }
                            }
                            this.field_e[var10] = var5 ^ -1;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if ((var12 & var8) != 0) {
                                L9: {
                                  if (-1 != (this.field_e[var10] ^ -1)) {
                                    break L9;
                                  } else {
                                    this.field_e[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = this.field_e[var10];
                                break L8;
                              } else {
                                var10++;
                                break L8;
                              }
                            }
                            L10: {
                              var12 = var12 >>> 1;
                              if (this.field_e.length > var10) {
                                break L10;
                              } else {
                                var13 = new int[2 * this.field_e.length];
                                var14 = 0;
                                L11: while (true) {
                                  if (var14 >= this.field_e.length) {
                                    this.field_e = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = this.field_e[var14];
                                    var14++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var11++;
                            continue L6;
                          }
                        }
                      } else {
                        L12: {
                          if (var17[var10] != var8) {
                            break L12;
                          } else {
                            var17[var10] = var9;
                            break L12;
                          }
                        }
                        var10++;
                        continue L5;
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
          L13: {
            var2 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var2);

            stackIn_38_1 = new StringBuilder().append("ja.<init>(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, boolean param3, di[] param4) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              bj.field_G = false;
              ao.field_o = param0;
              hi.field_c.b(4973, -10 + ao.field_o);
              if (9 < hi.field_c.field_H) {
                hi.field_c.field_H = 9;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (fb.field_d == null) {
                fb.field_d = new di[10];
                break L2;
              } else {
                break L2;
              }
            }
            if (param2 == 22) {
              L3: {
                if (hi.field_c.field_D > 9) {
                  hi.field_c.field_D = 9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param3) {
                  var5_int = 0;
                  if (null != ip.field_j) {
                    og.field_f = param1;
                    vd.field_a = param1;
                    hi.field_c.field_z = param1;
                    var6 = 0;
                    L5: while (true) {
                      if (param4.length <= var6) {
                        L6: {
                          if (var5_int != 0) {
                            break L6;
                          } else {
                            qc.field_y = -1;
                            break L6;
                          }
                        }
                        gg.a((byte) -84);
                        break L4;
                      } else {
                        L7: {
                          param4[var6].field_b = param1 + var6;
                          fb.field_d[var6] = param4[var6];
                          if (le.a(ip.field_j, fb.field_d[var6].field_i, param2 ^ -127)) {
                            qc.field_y = var6 + vd.field_a;
                            var5_int = 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var6++;
                        continue L5;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L8: {
                    var5_int = 0;
                    if (og.field_f <= param1) {
                      break L8;
                    } else {
                      var5_int = -param1 + og.field_f;
                      break L8;
                    }
                  }
                  L9: {
                    var6 = param4.length;
                    if (param4.length + param1 > fb.field_d.length + og.field_f) {
                      var6 = fb.field_d.length + (og.field_f + -param1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var7 = var5_int;
                  L10: while (true) {
                    if (var7 >= var6) {
                      break L4;
                    } else {
                      param4[var7].field_b = var7 + param1;
                      fb.field_d[var7 + param1 - og.field_f] = param4[var7];
                      var7++;
                      continue L10;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var5);

            stackIn_35_1 = new StringBuilder().append("ja.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
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
        field_d = new String[]{"Circumvent", "Equally adept with the arts of mechanics and deception, the trusty toolkit of the <%0> is enough to disable any obstacle. (Single use)"};
        field_a = "Music: ";
    }
}
