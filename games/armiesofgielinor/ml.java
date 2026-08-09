/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends je {
    private je field_Mb;
    private je[] field_Ib;
    static String field_Nb;
    static String field_Lb;
    int field_Kb;
    private je[] field_Jb;

    final static void a(p param0, byte param1) {
        int var2_int = 0;
        sn var3 = null;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            wh.field_f = false;
            am.field_v = new sn[47];
            for (var2_int = 0; var2_int < 47; var2_int++) {
                var3 = param0.a(wl.field_M[var2_int], (byte) -97, "");
                if (var3 == null) {
                    var3 = param0.a((byte) -128, "", wl.field_M[var2_int]);
                }
                am.field_v[var2_int] = var3;
            }
            if (param1 != 123) {
                String var5 = (String) null;
                ml.a(42, (au) null, false, (String) null);
            }
            wh.field_f = true;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ml.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_ab = param1;
        this.field_ob = param6;
        this.field_S = param2;
        this.field_gb = param0;
        if (param4 != 0) {
            return;
        }
        this.a(param3, param5, param4 + -20199);
    }

    public static void k(int param0) {
        field_Nb = null;
        field_Lb = null;
        if (param0 != 2) {
            p var2 = (p) null;
            ml.a((p) null, (byte) 111);
        }
    }

    private final void a(int param0, int param1, int param2) {
        je dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = 0;
          if (param2 == -20199) {
            break L0;
          } else {
            ml.a(96, -94, -90, false);
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_Ib.length <= var4) {
            this.field_Mb.a(-param1 + this.field_ob, -20500, this.field_gb, param1, 0);
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (var8 >= this.field_Jb.length) {
                return;
              } else {
                this.field_Jb[var8].a(this.field_Mb.field_ob + -(2 * param0), -20500, -(param0 * 2) + this.field_Mb.field_gb, param0, param0);
                if (var8 != this.field_Kb) {
                  dupTemp$0 = this.field_Jb[var8];
                  dupTemp$0.field_S = dupTemp$0.field_S + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = this.field_gb * var4 / this.field_Ib.length;
            var6 = this.field_gb * (1 + var4) / this.field_Ib.length;
            this.field_Ib[var4].field_S = var5;
            this.field_Ib[var4].field_ab = 0;
            this.field_Ib[var4].field_gb = -var5 + var6;
            this.field_Ib[var4].field_ob = param1;
            var4++;
            continue L1;
          }
        }
    }

    final static void a(int param0, au param1, boolean param2, String param3) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tg var8 = null;
        String var9 = null;
        tg var10 = null;
        String var11 = null;
        tg var12 = null;
        String var13 = null;
        tg var14 = null;
        try {
          L0: {
            L1: {
              ng.a(bv.field_x, param1, (int[]) null, (String) null, param1.d((byte) -84), 92, -1, (String) null, 0L);
              if (!param1.field_kc) {
                break L1;
              } else {
                L2: {
                  if (2 == param1.field_ac) {
                    break L2;
                  } else {
                    if ((hi.field_j ^ -1) <= -3) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var8 = tn.field_Z;
                var9 = fo.a(4800, bc.field_k, new String[]{param3});
                var8.field_i.a(10, var9, (byte) -118);
                break L1;
              }
            }
            L3: {
              tn.field_Z.a((byte) 96);
              if (!param2) {
                break L3;
              } else {
                if (oo.field_a != tn.field_Z.field_c) {
                  var12 = tn.field_Z;
                  var13 = fo.a(4800, fs.field_a, new String[]{param3});
                  var12.field_i.a(15, var13, (byte) -105);
                  break L3;
                } else {
                  var10 = tn.field_Z;
                  var11 = fo.a(4800, cp.field_g, new String[]{param3});
                  var10.field_i.a(16, var11, (byte) -103);
                  break L3;
                }
              }
            }
            var14 = tn.field_Z;
            var5 = iu.field_t;
            var6 = ur.field_z;
            var7 = 125 / ((22 - param0) / 38);
            var14.field_i.a(0, var6, 0, (byte) -118, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ml.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    final void l(int param0) {
        je dupTemp$0 = null;
        je dupTemp$1 = null;
        int var2;
        int var3;
        String var4;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 10000) {
            break L0;
          } else {
            var4 = (String) null;
            ml.a(10, (au) null, false, (String) null);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (this.field_Ib.length <= var2) {
            return;
          } else {
            if (this.field_Kb != var2) {
              if (this.field_Ib[var2].field_yb != 0) {
                this.field_Ib[this.field_Kb].field_rb = false;
                dupTemp$0 = this.field_Jb[this.field_Kb];
                dupTemp$0.field_S = dupTemp$0.field_S + 10000;
                this.field_Kb = var2;
                this.field_Ib[var2].field_rb = true;
                dupTemp$1 = this.field_Jb[var2];
                dupTemp$1.field_S = dupTemp$1.field_S - 10000;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void a(om param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        String[] var8 = null;
        String[] var9 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = param0.e(-23209);
              var9 = var8;
              if (param0.field_G.field_s != 1) {
                if (param0.field_G.field_s != 2) {
                  break L1;
                } else {
                  op.field_c[0][2] = lp.field_c[0];
                  break L1;
                }
              } else {
                L2: {
                  if (!var9[1].equalsIgnoreCase(wf.field_q[1])) {
                    stackIn_5_0 = 2;
                    break L2;
                  } else {
                    stackIn_5_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  var3 = stackIn_5_0;
                  op.field_c[0][var3] = lp.field_c[0];
                  if (1 != var3) {
                    stackIn_8_0 = 1;
                    break L3;
                  } else {
                    stackIn_8_0 = 2;
                    break L3;
                  }
                }
                var4 = stackIn_8_0;
                op.field_c[0][var4] = lp.field_c[3];
                break L1;
              }
            }
            op.field_c[0][0] = lp.field_c[param0.field_G.field_s];
            var7 = 0;
            var3 = var7;
            if (param1 == -26) {
              L4: while (true) {
                if (var7 >= op.field_c[0].length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  mn.field_k[76][var7] = ge.b(op.field_c[0][var7], -20849);
                  bp.a(var7, op.field_c[0][var7], param1 + -100);
                  var7++;
                  continue L4;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("ml.A(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static af a(boolean param0, String param1, byte param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        af stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 10) {
                break L1;
              } else {
                var7 = (String) null;
                ml.a(-33, (au) null, true, (String) null);
                break L1;
              }
            }
            L2: {
              var4_long = 0L;
              var6 = null;
              if (-1 != param1.indexOf('@')) {
                var6 = param1;
                break L2;
              } else {
                var8 = (CharSequence) ((Object) param1);
                var4_long = wc.a(var8, param2 + -10);
                break L2;
              }
            }
            stackIn_6_0 = oi.a((String) (var6), param3, param0, param2 ^ 11, var4_long);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ml.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
            return true;
        }
        return (ko.field_b + -param0) * (-param0 + ko.field_b) + (-param1 + sm.field_d) * (-param1 + sm.field_d) < param2 * param2 ? true : false;
    }

    ml(long param0, je param1, String[] param2, je param3, je[] param4, int param5) {
        super(param0, (je) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        je var9 = null;
        int var11 = 0;
        try {
          L0: {
            this.field_Ib = new je[param2.length];
            this.field_Mb = new je(0L, param3);
            this.field_Jb = param4;
            var8_int = 0;
            L1: while (true) {
              if (param2.length <= var8_int) {
                this.a(this.field_Mb, 122);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    this.field_Kb = param5;
                    this.field_Ib[param5].field_rb = true;
                    break L0;
                  } else {
                    this.field_Mb.a(param4[var11], 75);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new je(0L, param1);
                var9.field_X = param2[var8_int];
                this.field_Ib[var8_int] = var9;
                this.a(var9, 121);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    static {
        field_Nb = "Set up new unrated game";
        field_Lb = "Press F10 to open Quick Chat.";
    }
}
