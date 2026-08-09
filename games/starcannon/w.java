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
            if (!(null != this.field_s[var4_int])) {
                this.field_s[var4_int] = new il();
            }
            if (param0 != 4) {
                field_u = (id[]) null;
            }
            this.field_s[param1].field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "w.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        uj stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        il var8 = null;
        il var10 = null;
        dk var11 = null;
        il var12 = null;
        il var13 = null;
        il var14 = null;
        il var15 = null;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof dk)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (uj) (param4);
                break L1;
              }
            }
            L2: {
              var11 = (dk) ((Object) stackIn_3_0);
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
              var8 = this.field_s[0];
              this.field_t.a(30644);
              var8.a(this.field_t, param0, param3, param4, -1, (w) (this));
              if (var11 == null) {
                break L3;
              } else {
                L4: {
                  if (!var11.field_z) {
                    break L4;
                  } else {
                    var12 = this.field_s[1];
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(this.field_t, param0, param3, param4, -1, (w) (this));
                      break L4;
                    }
                  }
                }
                if (!var11.field_h) {
                  break L3;
                } else {
                  L5: {
                    var13 = this.field_s[3];
                    if (var11.field_l == 0) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(this.field_t, param0, param3, param4, -1, (w) (this));
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var10 = this.field_s[2];
                  if (var10 == null) {
                    break L3;
                  } else {
                    var10.a(this.field_t, param0, param3, param4, -1, (w) (this));
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (!param4.d(true)) {
                break L6;
              } else {
                var14 = this.field_s[5];
                if (var14 != null) {
                  var14.a(this.field_t, param0, param3, param4, -1, (w) (this));
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (!param1) {
                var15 = this.field_s[4];
                if (var15 != null) {
                  var15.a(this.field_t, param0, param3, param4, -1, (w) (this));
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            this.field_t.a(param0, 56, param3, (w) (this), param4);
            wf.a(-107);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var6);

            stackIn_29_1 = new StringBuilder().append("w.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    final il a(int param0, byte param1) {
        if (param1 != -76) {
            w.b(-56);
        }
        il dupTemp$0 = new il();
        this.field_s[param0] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(int param0, w param1, boolean param2) {
        il dupTemp$2 = null;
        int var4_int = 0;
        il var5 = null;
        il var6 = null;
        int var7 = 0;
        hl var8 = null;
        il stackIn_11_0 = null;
        il stackIn_12_0 = null;
        il stackIn_12_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              super.a(-71, param1);
              if (param0 == 6) {
                break L1;
              } else {
                var8 = (hl) null;
                this.a(77, (hl) null);
                break L1;
              }
            }
            L2: {
              if (param2) {
                var4_int = 0;
                L3: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    break L2;
                  } else {
                    L4: {
                      var5 = this.field_s[var4_int];
                      if (var5 != null) {
                        L5: {
                          var6 = param1.field_s[var4_int];
                          stackIn_11_0 = (il) (var5);

                          if (var6 == null) {
                            dupTemp$2 = new il();
                            param1.field_s[var4_int] = dupTemp$2;
                            stackIn_12_0 = (il) ((Object) stackIn_11_0);
                            stackIn_12_1 = (il) (dupTemp$2);
                            break L5;
                          } else {
                            stackIn_12_0 = (il) ((Object) stackIn_11_0);
                            stackIn_12_1 = (il) (var6);
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
                ug.a(this.field_s, 0, param1.field_s, 0, 6);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("w.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    w(w param0, boolean param1) {
        this();
        try {
            param0.a(6, (w) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        if (param0 != 14) {
            return;
        }
        s.field_c = false;
        sg.field_n = null;
        if (!tc.field_x) {
            var1 = jj.field_F;
            if ((var1 ^ -1) < -1) {
                if ((var1 ^ -1) == -2) {
                    sg.field_n = of.field_j;
                } else {
                    sg.field_n = fb.a(dk.field_x, 127, new String[]{Integer.toString(var1)});
                }
                sg.field_n = rg.a(true, new CharSequence[]{(CharSequence) ((Object) sg.field_n), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) sb.field_f)});
            }
            fa.field_G.n(3);
            ea.a(-101);
        } else {
            fa.field_G.o(param0 + 109);
        }
    }

    public w() {
        this.field_s = new il[6];
        this.field_t = new il();
        il dupTemp$0 = new il();
        this.field_s[0] = dupTemp$0;
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
                ti.field_b.a((byte) 93, (uj) (ve.field_f));
            }
            ve.field_f.a(param0, param2, param3, true);
            ki.b();
            wa.a(true, true);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "w.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, hl[] param1) {
        il[] var3 = null;
        int var4 = 0;
        il var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var3 = this.field_s;
              var4 = 0;
              if (param0 == 68) {
                break L1;
              } else {
                this.a(73, (byte) -45);
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
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("w.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final void a(int param0, hl param1) {
        il[] var3 = null;
        int var4 = 0;
        il var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var3 = this.field_s;
              var4 = 0;
              if (param0 <= -12) {
                break L1;
              } else {
                field_r = (int[]) null;
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
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("w.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_q = "Service unavailable";
        rk discarded$0 = new rk();
        field_w = new og();
    }
}
