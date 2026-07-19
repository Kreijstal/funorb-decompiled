/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static String[] field_c;
    static lh field_t;
    static volatile int field_j;
    private String field_p;
    int field_i;
    String field_h;
    static ue field_g;
    static int[] field_n;
    static String field_d;
    static String field_f;
    private int field_o;
    private long field_s;
    int[] field_a;
    int field_q;
    private boolean field_k;
    static String field_e;
    int field_b;
    static int[] field_m;
    static int field_r;
    static int[] field_l;

    final static byte[] a(int param0, byte[] param1, ia param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            var4_int = param2.e(8, param0);
            if (-1 != (var4_int ^ -1)) {
              L1: {
                if (param3) {
                  break L1;
                } else {
                  field_f = (String) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (param1 == null) {
                    break L3;
                  } else {
                    if (param1.length != var4_int) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L2;
              }
              L4: {
                var5 = param2.e(8, 3);
                var6 = (byte)param2.e(8, 8);
                if (0 >= var5) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param1[var7] = (byte)(var6 + param2.e(8, var5));
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (byte[]) (param1);
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("fb.A(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_18_0;
        }
    }

    final static void a(byte param0) {
        int fieldTemp$5 = 0;
        ia var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = StarCannon.field_A;
        try {
          L0: {
            var1 = d.field_b;
            if (param0 == 10) {
              L1: while (true) {
                if (!ma.a(0)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var1.d((byte) 84, 8);
                  fieldTemp$5 = var1.field_g + 1;
                  var1.field_g = var1.field_g + 1;
                  var2 = fieldTemp$5;
                  rh.a(var1, (byte) -68);
                  d.field_b.b(var1.field_g - var2, 31700);
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "fb.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static ig a(String param0, int param1, int param2) {
        ig var3 = null;
        RuntimeException var3_ref = null;
        ig stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ig stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_r = -91;
                break L1;
              }
            }
            var3 = new ig(false);
            var3.field_e = param1;
            var3.field_d = param0;
            stackOut_2_0 = (ig) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("fb.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_n = null;
        field_c = null;
        field_l = null;
        if (param0 > -8) {
            fb.a(122);
        }
        field_f = null;
        field_t = null;
        field_m = null;
        field_e = null;
    }

    final static int a(String param0, byte param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 == 26) {
              if (param2) {
                stackOut_6_0 = ai.field_h.a(param0);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = rh.field_h.a(param0);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -38;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("fb.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        StringBuilder var7 = null;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = -64 % ((49 - param1) / 61);
            var6 = 0;
            L1: while (true) {
              var7_int = param0.indexOf("<%", var6);
              if (0 > var7_int) {
                var7 = new StringBuilder(var4);
                var6 = 0;
                var8 = 0;
                L2: while (true) {
                  var9 = param0.indexOf("<%", var6);
                  if ((var9 ^ -1) > -1) {
                    discarded$3 = var7.append(param0.substring(var8));
                    stackOut_22_0 = var7.toString();
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    var6 = var9 + 2;
                    L3: while (true) {
                      L4: {
                        if (var6 >= var3_int) {
                          break L4;
                        } else {
                          if (!wc.a(48, param0.charAt(var6))) {
                            break L4;
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      }
                      var10 = param0.substring(2 + var9, var6);
                      if (!ba.a(6, (CharSequence) ((Object) var10))) {
                        continue L2;
                      } else {
                        if (var6 >= var3_int) {
                          continue L2;
                        } else {
                          if (param0.charAt(var6) != 62) {
                            continue L2;
                          } else {
                            var6++;
                            var11 = pd.a((CharSequence) ((Object) var10), 10);
                            discarded$4 = var7.append(param0.substring(var8, var9));
                            var8 = var6;
                            discarded$5 = var7.append(param2[var11]);
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var6 = var7_int - -2;
                L5: while (true) {
                  L6: {
                    if (var3_int <= var6) {
                      break L6;
                    } else {
                      if (!wc.a(48, param0.charAt(var6))) {
                        break L6;
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                  var8_ref_String = param0.substring(var7_int - -2, var6);
                  if (ba.a(6, (CharSequence) ((Object) var8_ref_String))) {
                    if (var3_int <= var6) {
                      continue L1;
                    } else {
                      if (62 == param0.charAt(var6)) {
                        var6++;
                        var9 = pd.a((CharSequence) ((Object) var8_ref_String), 10);
                        var4 = var4 + (-var6 + var7_int + param2[var9].length());
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("fb.D(");
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
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_23_0;
    }

    final int b(int param0) {
        L0: {
          if (this.field_k) {
            break L0;
          } else {
            L1: {
              if (-3 != (this.field_q ^ -1)) {
                break L1;
              } else {
                if (this.field_o <= 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              if (param0 < -124) {
                break L2;
              } else {
                field_e = (String) null;
                break L2;
              }
            }
            if (this.field_s != va.field_j) {
              if ((bd.field_f ^ -1) != -3) {
                return 0;
              } else {
                if (di.a((byte) 107, this.field_p)) {
                  return 1;
                } else {
                  return 0;
                }
              }
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    fb(boolean param0) {
        this.field_o = lj.field_i;
        this.field_k = cf.field_r;
        this.field_p = field_e;
        this.field_q = pf.field_e;
        if (param0) {
            this.field_a = se.field_o;
        } else {
            this.field_a = null;
        }
        this.field_s = ne.field_d;
        this.field_h = vd.field_e;
        this.field_b = tk.field_e;
        this.field_i = wc.field_f;
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_d = "Use this alternative as your account name";
            field_n = new int[256];
            field_j = 0;
            field_f = "Click";
            var1 = 0;
            L0: while (true) {
              if ((var1 ^ -1) <= -257) {
                field_m = new int[8192];
                field_r = 9;
                field_l = new int[12];
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 8) {
                    field_n[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((var0 & 1 ^ -1) == -2) {
                      var0 = -306674912 ^ var0 >>> 2020474305;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
