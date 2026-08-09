/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends qf {
    static boolean field_l;
    static String field_k;
    private fe field_m;
    private fe field_n;
    static boolean field_j;

    cc(fe param0, fe param1, fe param2) {
        super(param0);
        try {
            this.field_m = param1;
            this.field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final p a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        p stackIn_4_0 = null;
        p stackIn_8_0 = null;
        p stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -26188) {
                break L1;
              } else {
                field_j = true;
                break L1;
              }
            }
            var3 = this.field_m.field_k.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              if (!kb.a(var3, var4, -28169)) {
                stackIn_8_0 = sb.field_n;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.a(5, param0)) {
                  stackIn_12_0 = sb.field_n;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return bf.field_x;
                }
              }
            } else {
              stackIn_4_0 = sb.field_n;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("cc.B(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_m.field_k.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  field_k = (String) null;
                  break L1;
                }
              }
              var5 = var4;
              if (!md.a(-1, var5)) {
                if (!la.a((byte) 96, var5)) {
                  if (!nc.a(-68, var5)) {
                    if (!this.a(5, param0)) {
                      if (var3.length() > 0) {
                        if (!k.a(19272, var5, var3)) {
                          if (ia.a(var5, (byte) -16, var3)) {
                            stackIn_26_0 = pc.field_c;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (!bj.a(var5, var3, true)) {
                              stackIn_31_0 = eb.field_g;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              stackIn_29_0 = fa.field_t;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_22_0 = fa.field_t;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      } else {
                        stackIn_19_0 = nc.field_a;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      stackIn_16_0 = vh.field_s;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = rg.field_K;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = wc.field_e;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_7_0 = eb.field_g;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3_ref);

            stackIn_34_1 = new StringBuilder().append("cc.A(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final boolean a(int param0, String param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$1 = this.a(87, (String) null);
                break L1;
              }
            }
            L2: {
              var9 = this.field_n.field_k.toLowerCase();
              var4 = param1.toLowerCase();
              if (-1 <= (var9.length() ^ -1)) {
                break L2;
              } else {
                if (0 >= var4.length()) {
                  break L2;
                } else {
                  var5 = var9.lastIndexOf("@");
                  if ((var5 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (var9.length() + -1 > var5) {
                      var6 = var9.substring(0, var5);
                      var7 = var9.substring(1 + var5);
                      if ((var4.indexOf(var6) ^ -1) <= -1) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if (-1 >= (var4.indexOf(var7) ^ -1)) {
                            stackIn_14_0 = 1;
                            break L3;
                          } else {
                            stackIn_14_0 = 0;
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_16_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("cc.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    public static void e(byte param0) {
        if (param0 > -53) {
            return;
        }
        field_k = null;
    }

    final static int a(CharSequence param0, int param1, boolean param2, int param3) {
        int stackIn_2_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          L0: {
            if (param3 <= -48) {
              L1: {
                if (-3 < (param1 ^ -1)) {
                  break L1;
                } else {
                  if (-37 > (param1 ^ -1)) {
                    break L1;
                  } else {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param0.length();
                    var8 = 0;
                    L2: while (true) {
                      if (var7 <= var8) {
                        if (var5 == 0) {
                          throw new NumberFormatException();
                        } else {
                          stackIn_43_0 = var6;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        L3: {
                          L4: {
                            var9 = param0.charAt(var8);
                            if (var8 != 0) {
                              break L4;
                            } else {
                              if (45 == var9) {
                                var4_int = 1;
                                break L3;
                              } else {
                                if (var9 != 43) {
                                  break L4;
                                } else {
                                  if (!param2) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                          L5: {
                            L6: {
                              if (var9 < 48) {
                                break L6;
                              } else {
                                if (57 >= var9) {
                                  var9 -= 48;
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              if (var9 < 65) {
                                break L7;
                              } else {
                                if (var9 <= 90) {
                                  var9 -= 55;
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var9 < 97) {
                                break L8;
                              } else {
                                if (var9 <= 122) {
                                  var9 -= 87;
                                  break L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            throw new NumberFormatException();
                          }
                          if (var9 < param1) {
                            L9: {
                              if (var4_int != 0) {
                                var9 = -var9;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var10 = var9 + var6 * param1;
                            if (var10 / param1 != var6) {
                              throw new NumberFormatException();
                            } else {
                              var6 = var10;
                              var5 = 1;
                              break L3;
                            }
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              throw new IllegalArgumentException("" + param1);
            } else {
              stackIn_2_0 = -112;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var4);

            stackIn_46_1 = new StringBuilder().append("cc.C(");

            if (param0 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L10;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L10;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_43_0;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 20755) {
                break L1;
              } else {
                var6 = (CharSequence) null;
                cc.a(103, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              var2_int = param1.length();
              if (var2_int > 20) {
                var2_int = 20;
                break L2;
              } else {
                break L2;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L3: while (true) {
              if (var2_int <= var4) {
                stackIn_21_0 = new String(var8);
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(97 + (-65 + var5));
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5 < 97) {
                        break L7;
                      } else {
                        if (var5 <= 122) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (48 > var5) {
                        break L8;
                      } else {
                        if (57 >= var5) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  break L4;
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("cc.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final static hl[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        hl[] var10;
        hl[] var11_ref_hl__;
        int var11;
        int var12;
        hl var13;
        int var14;
        int var15;
        var15 = StarCannon.field_A;
        var9 = param7 + (param0 - -param2);
        var10 = new hl[]{new hl(var9, var9), new hl(param6, var9), new hl(var9, var9), new hl(var9, param6), new hl(64, 64), new hl(var9, param6), new hl(var9, var9), new hl(param6, var9), new hl(var9, var9)};
        var11_ref_hl__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_hl__.length) {
            var10 = var11_ref_hl__;
            var11 = 0;
            L1: while (true) {
              if (param0 <= var11) {
                if (param4 == 3) {
                  var11 = 0;
                  L2: while (true) {
                    if (param0 <= var11) {
                      var11 = 0;
                      L3: while (true) {
                        if (param6 <= var11) {
                          var11 = 0;
                          L4: while (true) {
                            if (param6 >> 1543348353 <= var11) {
                              return var10;
                            } else {
                              var12 = 0;
                              L5: while (true) {
                                if (param2 <= var12) {
                                  var11++;
                                  continue L4;
                                } else {
                                  var10[1].field_B[var11 + param6 * (-var12 + (var9 - 1))] = param1;
                                  var10[3].field_B[var9 * var11 - var12 - 1 - -var9] = param1;
                                  var10[7].field_B[var11 + var12 * param6] = param1;
                                  var10[5].field_B[var9 * var11 + var12] = param1;
                                  var12++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = 0;
                          L6: while (true) {
                            if (param0 <= var12) {
                              var11++;
                              continue L3;
                            } else {
                              var10[7].field_B[(-var12 + (var9 - 1)) * param6 - -var11] = param3;
                              var10[5].field_B[var9 + (-1 - var12 + var11 * var9)] = param3;
                              var10[1].field_B[param6 * var12 - -var11] = param8;
                              var10[3].field_B[var11 * var9 - -var12] = param8;
                              var12++;
                              continue L6;
                            }
                          }
                        }
                      }
                    } else {
                      var12 = 0;
                      L7: while (true) {
                        if (var12 >= var9) {
                          var11++;
                          continue L2;
                        } else {
                          var10[0].field_B[var12 + var9 * var11] = param8;
                          var10[0].field_B[var9 * var12 - -var11] = param8;
                          if (var9 - var11 > var12) {
                            var10[2].field_B[var9 * var11 + var12] = param8;
                            var10[6].field_B[var11 + var9 * var12] = param8;
                            var12++;
                            continue L7;
                          } else {
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return (hl[]) null;
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_B[(-var11 + (var9 + -1)) * var9 + var12] = param3;
                    var10[8].field_B[var12 + (-1 + (-var11 + var9)) * var9] = param3;
                    var10[2].field_B[-var11 - -var9 - (1 - var12 * var9)] = param3;
                    var10[8].field_B[-var11 - -var9 + (-1 + var9 * var12)] = param3;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_hl__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_B.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = param5;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    static {
        field_j = true;
        field_k = "ARROW KEYS    Fly Ship";
    }
}
