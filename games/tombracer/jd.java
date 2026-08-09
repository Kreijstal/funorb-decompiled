/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends tfa implements lv {
    private int field_k;
    private int field_l;
    static String field_m;
    private int field_n;

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
                if (var2_int >= var3) {
                  break L2;
                } else {
                  if (!hf.a(param0 ^ 114, param1.charAt(var2_int))) {
                    break L2;
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (var2_int >= var3) {
                    break L4;
                  } else {
                    if (!hf.a(param0 ^ 116, param1.charAt(var3 - 1))) {
                      break L4;
                    } else {
                      var3--;
                      continue L3;
                    }
                  }
                }
                var4 = var3 + -var2_int;
                if (-2 >= (var4 ^ -1)) {
                  if ((var4 ^ -1) >= -13) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L5: while (true) {
                      if (var3 <= var6) {
                        if (var5.length() != 0) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L6: {
                          var7 = param1.charAt(var6);
                          if (ov.a(param0 + 16, (char) var7)) {
                            var8 = cp.a((byte) 0, (char) var7);
                            if (0 == var8) {
                              break L6;
                            } else {
                              discarded$0 = var5.append((char) var8);
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var6++;
                        continue L5;
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
          L7: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("jd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_5_0 = Integer.TYPE;
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
                            stackIn_27_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackIn_23_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_20_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_11_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = Byte.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("jd.F(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L2;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
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
        if (param0 != 32242) {
            field_m = (String) null;
        }
    }

    final static String a(boolean param0) {
        String var1;
        String[] var2;
        int var3;
        String var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var1 = "";
        var2 = dra.field_b;
        if (!param0) {
          var3 = 0;
          L0: while (true) {
            if (var2.length <= var3) {
              return var1;
            } else {
              var4 = var2[var3];
              if (!var4.startsWith("Unused")) {
                var1 = var1 + var4 + "\n";
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return (String) null;
        }
    }

    public final void b(byte param0) {
        if (param0 < 32) {
            CharSequence var3 = (CharSequence) null;
            jd.a(-106, (CharSequence) null);
        }
        super.b((byte) 56);
    }

    static {
        field_m = "Mobile mirrors";
    }
}
