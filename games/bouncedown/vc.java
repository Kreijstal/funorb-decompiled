/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vc extends wd {
    static mf field_F;
    static String field_B;
    private ui field_E;
    static si field_G;
    private bc field_C;
    private String[] field_D;

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(0);
    }

    final void a(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        sf var3;
        ed var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        bh var12;
        int var13;
        int var14;
        ui var15;
        int var16;
        var16 = Bounce.field_N;
        this.field_C = new bc();
        var2 = 0;
        var3 = (sf) ((Object) this.field_j);
        var4 = var3.b((lk) (this), param0);
        L0: while (true) {
          var5 = this.field_h.indexOf("<hotspot=", var2);
          if (-1 != var5) {
            var7 = this.field_h.indexOf(">", var5);
            var6 = this.field_h.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_h.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, 0);
            var9 = var4.b(var2, param0 ^ 0);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var9 < var11) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_a[var11];
                  if (var11 == var8) {
                    stackIn_8_0 = var4.a(var5, param0 + 116);
                    break L2;
                  } else {
                    stackIn_8_0 = var12.field_a[0];
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var9 == var11) {
                    stackIn_13_0 = var4.a(var2, 105);
                    break L3;
                  } else {
                    if (var12 == null) {
                      stackIn_13_0 = 0;
                      break L3;
                    } else {
                      stackIn_13_0 = var12.field_a[var12.field_a.length - 1];
                      break L3;
                    }
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new ui(var7, var13, var12.field_f, var14 + -var13, Math.max(var3.a(57), -var12.field_f + var12.field_b));
                  if (var10 != null) {
                    ((ui) (var10)).field_n = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var10 = var15;
                this.field_C.a(1, var15);
                var11++;
                continue L1;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -119, param3);
        int var5 = param1 + -this.field_r;
        if (param2 > -77) {
            return;
        }
        int var6 = param0 + -this.field_i;
        ui var7 = this.b(1, var5, var6);
        if (var7 != null && this.field_n != null) {
            ((ki) ((Object) this.field_n)).a((vc) (this), (byte) 125, param3, var7.field_q);
        }
    }

    final static boolean d(byte param0) {
        int var1 = 53 % ((param0 - 57) / 53);
        return ea.field_f;
    }

    final static void a(int param0, bl param1) {
        int var2_int = 0;
        bl var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                vc.e((byte) -57);
                break L1;
              }
            }
            if (null == param1.field_i) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                L3: {
                  if (param1.field_a != 0) {
                    break L3;
                  } else {
                    if (param1.field_k != 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L4: while (true) {
                  if (oh.field_c <= var2_int) {
                    break L2;
                  } else {
                    L5: {
                      var3 = sh.field_cb[var2_int];
                      if ((var3.field_h ^ -1) != -3) {
                        break L5;
                      } else {
                        if (param1.field_a != var3.field_a) {
                          break L5;
                        } else {
                          if (var3.field_k == param1.field_k) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L4;
                  }
                }
              }
              L6: {
                if (null != param1.field_f) {
                  break L6;
                } else {
                  break L6;
                }
              }
              l.a(-54, param1);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("vc.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
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

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, 116, param3);
        if (!(param0 == 0)) {
            return;
        }
        if (param2 <= 33) {
            bl var9 = (bl) null;
            vc.a(-55, (bl) null);
        }
        sf var10 = (sf) ((Object) this.field_j);
        ui var6 = this.field_E;
        if (var6 != null) {
            var7 = var10.a(param3, -116, (lk) (this));
            var8 = var10.a(param1, (lk) (this), (byte) 51);
            do {
                ck.a(-2 + var6.field_h + var7, 2 + var6.field_r, var6.field_i + 2, var8 + var6.field_l + -2, 14677);
                var6 = var6.field_n;
            } while (var6 != null);
        }
    }

    final void a(String param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_D == null) {
                  break L2;
                } else {
                  if (this.field_D.length <= param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[param1 - -1];
                var4 = var7;
                if (this.field_D == null) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_D.length) {
                      break L3;
                    } else {
                      var7[var5] = this.field_D[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              this.field_D = var4;
              break L1;
            }
            this.field_D[param1] = param0;
            var4_int = -91 % ((param2 - -10) / 39);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("vc.OA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.b(((sf) ((Object) this.field_j)).a((lk) (this), 1), 80, param3, param2, param0);
        if (param1 != -65) {
            vc.f((byte) 8);
        }
    }

    final static void e(byte param0) {
        int var1_int = 0;
        int var2 = Bounce.field_N;
        ff.field_D.a(false);
        if (param0 != -44) {
            return;
        }
        try {
            for (var1_int = 0; (var1_int ^ -1) > -33; var1_int++) {
                l.field_d[var1_int] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                qj.field_a[var1_int] = 0L;
            }
            nl.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "vc.SA(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, lk param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.field_E = null;
              if (this.field_g) {
                var5_int = -param1 + uc.field_C + -this.field_r;
                var6 = -this.field_i + (-param2 + ll.field_y);
                this.field_E = this.b(1, var5_int, var6);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("vc.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
    }

    boolean a(lk param0, boolean param1) {
        ui discarded$1 = null;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              discarded$1 = this.b(-72, 14, -4);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vc.PA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    String d(int param0) {
        if (this.field_E == null) {
            return null;
        }
        if (null == this.field_D) {
            return null;
        }
        if (param0 != 0) {
            return (String) null;
        }
        if (this.field_D.length <= this.field_E.field_q) {
            return null;
        }
        return this.field_D[this.field_E.field_q];
    }

    private final ui b(int param0, int param1, int param2) {
        ui var4;
        ui var5;
        int var6;
        L0: {
          var6 = Bounce.field_N;
          var4 = (ui) ((Object) this.field_C.a((byte) -57));
          if (param0 == 1) {
            break L0;
          } else {
            field_G = (si) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (ui) ((Object) this.field_C.d((byte) -59));
                continue L1;
              } else {
                L3: {
                  if (param1 < var5.field_h) {
                    break L3;
                  } else {
                    if (param2 < var5.field_l) {
                      break L3;
                    } else {
                      if (param1 >= var5.field_i + var5.field_h) {
                        break L3;
                      } else {
                        if (var5.field_r + var5.field_l < param2) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_n;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    vc(String param0, fc param1) {
        super(param0, (sk) null);
        this.field_E = null;
        try {
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "vc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(byte param0) {
        field_B = null;
        field_F = null;
        if (param0 != -6) {
            return;
        }
        field_G = null;
    }

    static {
        field_B = "Loading fonts";
    }
}
