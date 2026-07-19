/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends tfa implements lv {
    private int field_k;
    private int field_l;
    static String field_m;
    private int field_n;

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_20_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_15_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_34_0 = 0;
        boolean stackOut_27_0 = false;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != null) {
            L0: {
              var2_int = 0;
              var3 = param1.length();
              if (param0 == 1) {
                break L0;
              } else {
                field_m = (String) null;
                break L0;
              }
            }
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= var3) {
                    break L3;
                  } else {
                    stackOut_7_0 = hf.a(param0 ^ 114, param1.charAt(var2_int));
                    stackIn_14_0 = stackOut_7_0 ? 1 : 0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_8_0) {
                        break L3;
                      } else {
                        var2_int++;
                        continue L1;
                      }
                    }
                  }
                }
                stackOut_11_0 = var2_int;
                stackIn_14_0 = stackOut_11_0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (stackIn_14_0 >= var3) {
                      break L6;
                    } else {
                      stackOut_15_0 = hf.a(param0 ^ 116, param1.charAt(var3 - 1));
                      stackIn_20_0 = stackOut_15_0 ? 1 : 0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var9 != 0) {
                        break L5;
                      } else {
                        if (!stackIn_16_0) {
                          break L6;
                        } else {
                          var3--;
                          stackOut_13_0 = var2_int;
                          stackIn_14_0 = stackOut_13_0;
                          continue L4;
                        }
                      }
                    }
                  }
                  stackOut_19_0 = var3 + -var2_int;
                  stackIn_20_0 = stackOut_19_0;
                  break L5;
                }
                var4 = stackIn_20_0;
                if (-2 >= (var4 ^ -1)) {
                  if ((var4 ^ -1) >= -13) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L7: while (true) {
                      L8: {
                        if (var3 <= var6) {
                          stackOut_34_0 = var5.length();
                          stackIn_35_0 = stackOut_34_0;
                          break L8;
                        } else {
                          var7 = param1.charAt(var6);
                          stackOut_27_0 = ov.a(param0 + 16, (char) var7);
                          stackIn_35_0 = stackOut_27_0 ? 1 : 0;
                          stackIn_28_0 = stackOut_27_0;
                          if (var9 != 0) {
                            break L8;
                          } else {
                            L9: {
                              L10: {
                                if (stackIn_28_0) {
                                  break L10;
                                } else {
                                  if (var9 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var8 = cp.a((byte) 0, (char) var7);
                              if (0 == var8) {
                                break L9;
                              } else {
                                discarded$1 = var5.append((char) var8);
                                break L9;
                              }
                            }
                            var6++;
                            continue L7;
                          }
                        }
                      }
                      if (stackIn_35_0 != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var2);
            stackOut_39_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
    }

    final static Class a(Object param0, int param1) {
        RuntimeException var2 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_4_0 = null;
        Class stackOut_26_0 = null;
        Class stackOut_22_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_10_0 = null;
        Class stackOut_7_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_m = (String) null;
                break L1;
              }
            }
            if (Integer.class.isInstance(param0)) {
              stackOut_4_0 = Integer.TYPE;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!Byte.class.isInstance(param0)) {
                if (!Short.class.isInstance(param0)) {
                  if (!Long.class.isInstance(param0)) {
                    if (!Boolean.class.isInstance(param0)) {
                      if (!Float.class.isInstance(param0)) {
                        if (!Double.class.isInstance(param0)) {
                          if (Character.class.isInstance(param0)) {
                            stackOut_26_0 = Character.TYPE;
                            stackIn_27_0 = stackOut_26_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackOut_22_0 = Double.TYPE;
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_19_0 = Float.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_10_0 = Short.TYPE;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_7_0 = Byte.TYPE;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("jd.F(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L2;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      return stackIn_27_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    jd(kda param0, ft param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, 32879, param1, una.field_g, param4 * param2 * param3, false);
        try {
            this.field_n = param4;
            this.field_l = param3;
            this.field_k = param2;
            this.field_j.a(true, (iva) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage3Dub(this.field_i, 0, this.d(120), this.field_k, this.field_l, this.field_n, 0, waa.a(this.field_f, 1383), 5121, param5, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, hs param1) {
        try {
            if (param0 != 7672) {
                this.field_k = 12;
            }
            super.a(param0 + 0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 == 32242) {
            return;
        }
        field_m = (String) null;
    }

    final static String a(boolean param0) {
        String var1 = null;
        String[] var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_7_0 = null;
        String stackOut_5_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var1 = "";
        var2 = dra.field_b;
        if (!param0) {
          var3 = 0;
          L0: while (true) {
            if (var2.length > var3) {
              var4 = var2[var3];
              stackOut_5_0 = (String) (var4);
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5 == 0) {
                L1: {
                  if (((String) (Object) stackIn_7_0).startsWith("Unused")) {
                    break L1;
                  } else {
                    var1 = var1 + var4 + "\n";
                    break L1;
                  }
                }
                var3++;
                continue L0;
              } else {
                return stackIn_6_0;
              }
            } else {
              return var1;
            }
          }
        } else {
          return (String) null;
        }
    }

    public final void b(byte param0) {
        String discarded$0 = null;
        if (param0 < 32) {
            CharSequence var3 = (CharSequence) null;
            discarded$0 = jd.a(-106, (CharSequence) null);
            super.b((byte) 56);
            return;
        }
        super.b((byte) 56);
    }

    static {
        field_m = "Mobile mirrors";
    }
}
