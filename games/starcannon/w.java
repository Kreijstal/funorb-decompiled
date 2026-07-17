/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends hd {
    private il[] field_s;
    static String field_q;
    static id[] field_u;
    static int[] field_r;
    private il field_t;
    static og field_w;
    static int field_v;

    final void a(int param0, int param1, hl[] param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (!(null != ((w) this).field_s[var4_int])) {
                ((w) this).field_s[var4_int] = new il();
            }
            if (param0 != 4) {
                field_u = null;
            }
            ((w) this).field_s[param1].field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "w.M(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        il var8 = null;
        il var10 = null;
        dk var11 = null;
        il var12 = null;
        il var13 = null;
        il var14 = null;
        il var15 = null;
        uj stackIn_3_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        uj stackOut_1_0 = null;
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
            L1: {
              if (!(param4 instanceof dk)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (uj) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (uj) param4;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (dk) (Object) stackIn_3_0;
              cl.a(true, param4.field_f + param4.field_j + param3, param0 + param4.field_s, param3 + param4.field_j, param4.field_i + (param4.field_s + param0));
              if (var11 == null) {
                break L2;
              } else {
                param1 = param1 & var11.field_u;
                break L2;
              }
            }
            L3: {
              var7 = 121 / ((param2 - 2) / 54);
              var8 = ((w) this).field_s[0];
              ((w) this).field_t.a(30644);
              var8.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
              if (var11 == null) {
                break L3;
              } else {
                L4: {
                  if (!var11.field_z) {
                    break L4;
                  } else {
                    var12 = ((w) this).field_s[1];
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
                      break L4;
                    }
                  }
                }
                if (!var11.field_h) {
                  break L3;
                } else {
                  L5: {
                    var13 = ((w) this).field_s[3];
                    if (var11.field_l == 0) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var10 = ((w) this).field_s[2];
                  if (var10 == null) {
                    break L3;
                  } else {
                    var10.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (!param4.d(true)) {
                break L6;
              } else {
                var14 = ((w) this).field_s[5];
                if (var14 != null) {
                  var14.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (!param1) {
                var15 = ((w) this).field_s[4];
                if (var15 != null) {
                  var15.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            ((w) this).field_t.a(param0, 56, param3, (w) this, param4);
            wf.a(-107);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("w.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    final il a(int param0, byte param1) {
        if (param1 != -76) {
            w.b(-56);
        }
        il dupTemp$0 = new il();
        ((w) this).field_s[param0] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(int param0, w param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        il var5 = null;
        il var6 = null;
        int var7 = 0;
        Object var8 = null;
        il stackIn_10_0 = null;
        il stackIn_11_0 = null;
        il stackIn_12_0 = null;
        il stackIn_12_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        il stackOut_9_0 = null;
        il stackOut_11_0 = null;
        il stackOut_11_1 = null;
        il stackOut_10_0 = null;
        il stackOut_10_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              super.a(-71, (hd) (Object) param1);
              if (param0 == 6) {
                break L1;
              } else {
                var8 = null;
                ((w) this).a(77, (hl) null);
                break L1;
              }
            }
            L2: {
              if (param2) {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= 6) {
                    break L2;
                  } else {
                    L4: {
                      var5 = ((w) this).field_s[var4_int];
                      if (var5 != null) {
                        L5: {
                          var6 = param1.field_s[var4_int];
                          stackOut_9_0 = (il) var5;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var6 == null) {
                            il dupTemp$25 = new il();
                            param1.field_s[var4_int] = dupTemp$25;
                            stackOut_11_0 = (il) (Object) stackIn_11_0;
                            stackOut_11_1 = (il) dupTemp$25;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            break L5;
                          } else {
                            stackOut_10_0 = (il) (Object) stackIn_10_0;
                            stackOut_10_1 = (il) var6;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            break L5;
                          }
                        }
                        ((il) (Object) stackIn_12_0).a(stackIn_12_1, -2147483648);
                        break L4;
                      } else {
                        param1.field_s[var4_int] = null;
                        break L4;
                      }
                    }
                    var4_int++;
                    continue L3;
                  }
                }
              } else {
                ug.a((Object[]) (Object) ((w) this).field_s, 0, (Object[]) (Object) param1.field_s, 0, 6);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("w.FA(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
    }

    w(w param0, boolean param1) {
        this();
        try {
            param0.a(6, (w) this, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "w.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void b(int param0) {
        if (param0 != 3) {
            return;
        }
        field_w = null;
        field_r = null;
        field_u = null;
        field_q = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        s.field_c = false;
        sg.field_n = null;
        if (!tc.field_x) {
            var1 = jj.field_F;
            if (var1 > 0) {
                if (var1 == 1) {
                    sg.field_n = of.field_j;
                } else {
                    sg.field_n = fb.a(dk.field_x, 127, new String[1]);
                }
                sg.field_n = rg.a(true, new CharSequence[3]);
            }
            fa.field_G.n(3);
            ea.a(-101);
        } else {
            fa.field_G.o(123);
        }
    }

    public w() {
        ((w) this).field_s = new il[6];
        ((w) this).field_t = new il();
        il dupTemp$0 = new il();
        ((w) this).field_s[0] = dupTemp$0;
        il var1 = dupTemp$0;
        var1.a(30644);
    }

    final static void a(String param0, byte param1, boolean param2, float param3) {
        if (param1 != 86) {
            return;
        }
        try {
            if (!(ve.field_f != null)) {
                ve.field_f = new lf(ti.field_b, sg.field_n);
                ti.field_b.a((byte) 93, (uj) (Object) ve.field_f);
            }
            ve.field_f.a(param0, param2, param3, true);
            ki.b();
            wa.a(true, true);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "w.EA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(byte param0, hl[] param1) {
        il[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        il var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var3 = ((w) this).field_s;
              var4 = 0;
              if (param0 == 68) {
                break L1;
              } else {
                il discarded$2 = ((w) this).a(73, (byte) -45);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                L3: {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var5.field_c = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("w.K(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final void a(int param0, hl param1) {
        il[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        il var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var3 = ((w) this).field_s;
              var4 = 0;
              if (param0 <= -12) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var3[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_d = param1;
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("w.CA(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Service unavailable";
        rk discarded$0 = new rk();
        field_w = new og();
    }
}
