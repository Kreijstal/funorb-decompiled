/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends lk {
    private boolean field_o;
    static th field_m;
    static String field_l;
    static int[] field_n;
    private String field_k;

    ge(ae param0) {
        super(param0);
        this.field_o = false;
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.addMouseListener(sf.field_c);
        if (param1 > -16) {
            return;
        }
        try {
            param0.addMouseMotionListener(sf.field_c);
            param0.addFocusListener(sf.field_c);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ge.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(byte param0, CharSequence[] param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = stellarshard.field_B;
        try {
          L0: {
            if (param3 != 0) {
              if (-2 != (param3 ^ -1)) {
                L1: {
                  var4_int = param3 + param2;
                  var5 = 0;
                  if (param0 == -50) {
                    break L1;
                  } else {
                    field_n = (int[]) null;
                    break L1;
                  }
                }
                var6_int = param2;
                L2: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param2;
                    L3: while (true) {
                      if (var7 >= var4_int) {
                        stackIn_24_0 = var6.toString();
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L4: {
                          var8 = param1[var7];
                          if (var8 == null) {
                            discarded$3 = var6.append("null");
                            break L4;
                          } else {
                            discarded$4 = var6.append(var8);
                            break L4;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      var7_ref_CharSequence = param1[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L5;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L5;
                      }
                    }
                    var6_int++;
                    continue L2;
                  }
                }
              } else {
                var10 = param1[param2];
                var4 = var10;
                if (var4 == null) {
                  stackIn_8_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return var10.toString();
                }
              }
            } else {
              stackIn_3_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4_ref);

            stackIn_27_1 = new StringBuilder().append("ge.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        field_l = null;
        field_n = null;
        if (param0) {
            field_m = (th) null;
        }
    }

    final cg a(byte param0, String param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        cg stackIn_2_0 = null;
        cg stackIn_10_0 = null;
        cg stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (lc.a(var4, 72)) {
              L1: {
                if (param0 > 10) {
                  break L1;
                } else {
                  this.field_k = (String) null;
                  break L1;
                }
              }
              L2: {
                if (param1.equals(this.field_k)) {
                  break L2;
                } else {
                  L3: {
                    var3 = sg.a((byte) -127, param1);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_e != null) {
                        break L3;
                      } else {
                        this.field_o = var3.field_f;
                        this.field_k = param1;
                        break L2;
                      }
                    }
                  }
                  stackIn_10_0 = vk.field_d;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L4: {
                if (this.field_o) {
                  stackIn_15_0 = lg.field_c;
                  break L4;
                } else {
                  stackIn_15_0 = qj.field_c;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = qj.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("ge.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final String b(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ml var4_ref_ml = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            var3 = of.a(var5, (byte) 113);
            if (var3 != null) {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1.equals(this.field_k)) {
                  break L1;
                } else {
                  var4_ref_ml = sg.a((byte) -124, param1);
                  if (var4_ref_ml != null) {
                    if (null == var4_ref_ml.field_e) {
                      this.field_k = param1;
                      this.field_o = var4_ref_ml.field_f;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (!this.field_o) {
                stackIn_14_0 = jb.field_p;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = -120 / ((20 - param0) / 40);
                stackIn_16_0 = rh.field_c;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("ge.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        this.field_k = null;
    }

    static {
        field_m = new th();
        field_l = "This password is part of your Player Name, and would be easy to guess";
    }
}
