/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cc extends qf {
    static boolean field_l;
    static String field_k;
    private fe field_m;
    private fe field_n;
    static boolean field_j;

    cc(fe param0, fe param1, fe param2) {
        super(param0);
        try {
            ((cc) this).field_m = param1;
            ((cc) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final p a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        p stackIn_4_0 = null;
        p stackIn_8_0 = null;
        p stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        p stackOut_7_0 = null;
        p stackOut_11_0 = null;
        p stackOut_3_0 = null;
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
            L1: {
              if (param1 == -26188) {
                break L1;
              } else {
                field_j = true;
                break L1;
              }
            }
            var3 = ((cc) this).field_m.field_k.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              int discarded$11 = -28169;
              if (!kb.a(var3, var4)) {
                stackOut_7_0 = sb.field_n;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (this.a(5, param0)) {
                  stackOut_11_0 = sb.field_n;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  return bf.field_x;
                }
              }
            } else {
              stackOut_3_0 = sb.field_n;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("cc.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_25_0 = null;
        String stackOut_30_0 = null;
        String stackOut_28_0 = null;
        String stackOut_21_0 = null;
        String stackOut_18_0 = null;
        String stackOut_15_0 = null;
        String stackOut_12_0 = null;
        String stackOut_9_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            var6 = ((cc) this).field_m.field_k.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  field_k = null;
                  break L1;
                }
              }
              var5 = var4;
              if (!md.a(-1, var5)) {
                if (!la.a((byte) 96, var5)) {
                  if (!nc.a(-68, var5)) {
                    if (!this.a(5, param0)) {
                      if (var6.length() > 0) {
                        if (!k.a(19272, var5, var6)) {
                          if (ia.a(var5, (byte) -16, var6)) {
                            stackOut_25_0 = pc.field_c;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          } else {
                            int discarded$7 = 1;
                            if (!bj.a(var5, var6)) {
                              stackOut_30_0 = eb.field_g;
                              stackIn_31_0 = stackOut_30_0;
                              break L0;
                            } else {
                              stackOut_28_0 = fa.field_t;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            }
                          }
                        } else {
                          stackOut_21_0 = fa.field_t;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      } else {
                        stackOut_18_0 = nc.field_a;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    } else {
                      stackOut_15_0 = vh.field_s;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = rg.field_K;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = wc.field_e;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = eb.field_g;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("cc.A(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param1 + 41);
        }
        return stackIn_31_0;
    }

    private final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        Object var8 = null;
        String var9 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                var8 = null;
                boolean discarded$2 = this.a(87, (String) null);
                break L1;
              }
            }
            L2: {
              var9 = ((cc) this).field_n.field_k.toLowerCase();
              var4 = param1.toLowerCase();
              if (var9.length() <= 0) {
                break L2;
              } else {
                if (0 >= var4.length()) {
                  break L2;
                } else {
                  var5 = var9.lastIndexOf("@");
                  if (var5 < 0) {
                    break L2;
                  } else {
                    if (var9.length() + -1 > var5) {
                      var6 = var9.substring(0, var5);
                      var7 = var9.substring(1 + var5);
                      if (var4.indexOf(var6) <= -1) {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      } else {
                        L3: {
                          if (-1 <= var4.indexOf(var7)) {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            break L3;
                          } else {
                            stackOut_12_0 = 0;
                            stackIn_14_0 = stackOut_12_0;
                            break L3;
                          }
                        }
                        return stackIn_14_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackOut_15_0 = 0;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("cc.O(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0 != 0;
    }

    public static void e() {
        field_k = null;
    }

    final static int a(CharSequence param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_2_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            if (param3 <= -48) {
              L1: {
                if (param1 < 2) {
                  break L1;
                } else {
                  if (param1 > 36) {
                    break L1;
                  } else {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param0.length();
                    var8 = 0;
                    L2: while (true) {
                      if (~var7 >= ~var8) {
                        if (var5 == 0) {
                          throw new NumberFormatException();
                        } else {
                          stackOut_41_0 = var6;
                          stackIn_42_0 = stackOut_41_0;
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
                                  break L3;
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
                          if (~var9 > ~param1) {
                            L9: {
                              if (var4_int != 0) {
                                var9 = -var9;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var10 = var9 + var6 * param1;
                            if (~(var10 / param1) != ~var6) {
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
              stackOut_1_0 = -112;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("cc.C(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L10;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param1 + 44 + 1 + 44 + param3 + 41);
        }
        return stackIn_42_0;
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 20755) {
                break L1;
              } else {
                var6 = null;
                String discarded$2 = cc.a(103, (CharSequence) null);
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
            var10 = new char[var2_int];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L3: while (true) {
              if (var2_int <= var4) {
                stackOut_20_0 = new String(var10);
                stackIn_21_0 = stackOut_20_0;
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
                    var3[var4] = '_';
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
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("cc.N(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
    }

    final static hl[] a() {
        int var9 = 0;
        hl[] var10 = null;
        hl[] var11_ref_hl__ = null;
        int var11 = 0;
        int var12 = 0;
        hl var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = StarCannon.field_A;
        var9 = 3;
        var10 = new hl[]{new hl(var9, var9), new hl(3, var9), new hl(var9, var9), new hl(var9, 3), new hl(64, 64), new hl(var9, 3), new hl(var9, var9), new hl(3, var9), new hl(var9, var9)};
        var11_ref_hl__ = var10;
        var12 = 0;
        L0: while (true) {
          if (~var12 <= ~var11_ref_hl__.length) {
            var10 = var11_ref_hl__;
            var11 = 0;
            L1: while (true) {
              if (1 <= var11) {
                var11 = 0;
                L2: while (true) {
                  if (1 <= var11) {
                    var11 = 0;
                    L3: while (true) {
                      if (3 <= var11) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_B[var11 + 3 * (-var12 + (var9 - 1))] = 65793;
                                var10[3].field_B[var9 * var11 - var12 - 1 - -var9] = 65793;
                                var10[7].field_B[var11 + var12 * 3] = 65793;
                                var10[5].field_B[var9 * var11 + var12] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (1 <= var12) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_B[(-var12 + (var9 - 1)) * 3 - -var11] = 0;
                            var10[5].field_B[var9 + (-1 - var12 + var11 * var9)] = 0;
                            var10[1].field_B[3 * var12 - -var11] = 0;
                            var10[3].field_B[var11 * var9 - -var12] = 0;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (~var12 <= ~var9) {
                        var11++;
                        continue L2;
                      } else {
                        L8: {
                          var10[0].field_B[var12 + var9 * var11] = 0;
                          var10[0].field_B[var9 * var12 - -var11] = 0;
                          if (var9 - var11 > var12) {
                            var10[2].field_B[var9 * var11 + var12] = 0;
                            var10[6].field_B[var11 + var9 * var12] = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var12++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_B[(-var11 + (var9 + -1)) * var9 + var12] = 0;
                    var10[8].field_B[var12 + (-1 + (-var11 + var9)) * var9] = 0;
                    var10[2].field_B[-var11 - -var9 - (1 - var12 * var9)] = 0;
                    var10[8].field_B[-var11 - -var9 + (-1 + var9 * var12)] = 0;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_hl__[var12];
            var14 = 0;
            L10: while (true) {
              if (~var13.field_B.length >= ~var14) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = 0;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = true;
        field_k = "ARROW KEYS    Fly Ship";
    }
}
