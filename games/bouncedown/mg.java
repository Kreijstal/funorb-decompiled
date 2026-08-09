/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends al {
    static int[] field_j;
    private String field_m;
    static String field_l;
    private boolean field_o;
    static String field_k;
    static int field_n;

    final static int f(int param0) {
        int var1 = 18 % ((3 - param0) / 57);
        return (int)(1000000000L / hb.field_H);
    }

    final vf b(String param0, byte param1) {
        rg var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        vf stackIn_5_0 = null;
        vf stackIn_12_0 = null;
        vf stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 54) {
                break L1;
              } else {
                this.field_o = true;
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param0);
            if (!fh.a((byte) 73, var4)) {
              stackIn_5_0 = a.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!param0.equals(this.field_m)) {
                  L3: {
                    var3 = pd.a(1059, param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_c != null) {
                        break L3;
                      } else {
                        this.field_o = var3.field_f;
                        this.field_m = param0;
                        break L2;
                      }
                    }
                  }
                  stackIn_12_0 = mi.field_c;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (this.field_o) {
                  stackIn_17_0 = mc.field_a;
                  break L4;
                } else {
                  stackIn_17_0 = a.field_e;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("mg.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final static void h(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var5 = oc.field_a;
              var1 = var5;
              if (param0 == -121) {
                break L1;
              } else {
                mg.h((byte) -95);
                break L1;
              }
            }
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1_ref), "mg.E(" + param0 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            String var5 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    var5 = (String) null;
                    mg.a((byte) 33, (String) null);
                    break L1;
                  }
                }
                L2: {
                  if (!si.field_a.startsWith("win")) {
                    break L2;
                  } else {
                    if (!lc.a(-29935, param2)) {
                      break L2;
                    } else {
                      break L0;
                    }
                  }
                }
                try {
                  L3: {
                    param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    break L3;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  ti.a((Throwable) null, (byte) 100, "MGR1: " + param2);
                  return;
                }
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var4_ref);

                stackIn_12_1 = new StringBuilder().append("mg.R(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param2 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        rg var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            var3 = db.a(var5, 8351);
            if (var3 == null) {
              L1: {
                if (param0.equals(this.field_m)) {
                  break L1;
                } else {
                  var4 = pd.a(1059, param0);
                  if (var4 != null) {
                    if (null == var4.field_c) {
                      this.field_m = param0;
                      this.field_o = var4.field_f;
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
                stackIn_13_0 = ma.field_n;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (param1 == -114) {
                    break L2;
                  } else {
                    mg.d(36);
                    break L2;
                  }
                }
                stackIn_17_0 = ne.field_q;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("mg.C(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    public static void e(int param0) {
        field_k = null;
        field_l = null;
        field_j = null;
        if (param0 != 0) {
            field_k = (String) null;
        }
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 48) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = ih.field_p.b("", param1, 16);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("mg.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void d(int param0) {
        la.a(640, true);
        if (param0 != 30432) {
            mg.h((byte) -25);
        }
    }

    final void i(byte param0) {
        if (param0 >= -106) {
            return;
        }
        this.field_m = null;
    }

    mg(ba param0) {
        super(param0);
        this.field_o = false;
    }

    static {
        field_l = "Click";
        field_j = new int[4];
        field_k = "Waiting for fonts";
    }
}
