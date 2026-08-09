/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends je {
    static je field_Kb;
    static me field_Ib;
    static String field_Jb;
    private je field_Lb;
    static int field_Mb;
    je field_Ob;
    static String field_Pb;
    static kl field_Nb;

    private final void a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        L0: {
          var4 = -param1;
          var5 = -param1;
          if (null != this.field_Lb) {
            var4 = this.field_Lb.j(98);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_Ob == null) {
            break L1;
          } else {
            var5 = this.field_Ob.a(true, -var4 + -param2 + this.field_gb + -param1 - param2);
            break L1;
          }
        }
        L2: {
          var6 = param2 + (var5 + param2) + var4 - -param1;
          if (this.field_gb < var6) {
            var5 = var5 + (this.field_gb + -var6);
            var6 = this.field_gb;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (-2 == (this.field_Eb ^ -1)) {
            param2 = param2 + (this.field_gb + -var6) / 2;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (-3 != (this.field_Eb ^ -1)) {
            break L4;
          } else {
            param2 = param2 + (this.field_gb - var6);
            break L4;
          }
        }
        L5: {
          if (null != this.field_Lb) {
            this.field_Lb.a(this.field_ob, -20500, var4, 0, param2);
            this.field_Lb.field_Fb = this.field_Fb;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param0 == -81) {
            break L6;
          } else {
            nf.k(94);
            break L6;
          }
        }
        L7: {
          if (null != this.field_Ob) {
            this.field_Ob.a(this.field_ob, -20500, var5, 0, var4 + param2 + param1);
            this.field_Ob.field_Fb = this.field_Fb;
            if (this.field_Lb == null) {
              this.field_Ob.field_Eb = this.field_Eb;
              break L7;
            } else {
              this.field_Ob.field_Eb = 0;
              break L7;
            }
          } else {
            break L7;
          }
        }
    }

    final static int l(int param0) {
        if (param0 != 26136) {
            nf.l(77);
        }
        return kl.field_a.field_p[0];
    }

    public static void k(int param0) {
        field_Pb = null;
        field_Jb = null;
        field_Ib = null;
        field_Kb = null;
        if (param0 != 0) {
            field_Ib = (me) null;
        }
        field_Nb = null;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = -param1;
        if (param0 > -32) {
            return 57;
        }
        int var5 = -param1;
        if (null != this.field_Lb) {
            var4 = this.field_Lb.j(125);
        }
        if (null != this.field_Ob) {
            var5 = this.field_Ob.j(102);
        }
        return param2 - (-var4 + -param1 - var5) - -param2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 != -30061) {
            this.a(46, -50, -114, 23, 28, -56, -92);
        }
        this.a(param0, param2 + 9561, param3, param4, param5);
        this.a((byte) -81, param6, param1);
    }

    final static String a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0) {
                break L1;
              } else {
                field_Ib = (me) null;
                break L1;
              }
            }
            var3 = new char[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_7_0 = new String(var3);
                break L0;
              } else {
                var3[-var4 + var2_int + -1] = param1.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("nf.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    nf(long param0, je param1, je param2, je param3, wk param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_Lb = new je(0L, param2);
                this.field_Lb.field_cb = param4;
                this.a(this.field_Lb, 60);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_Ob = new je(0L, param3, param5);
                this.a(this.field_Ob, 41);
                this.i(-10027);
                break L2;
              } else {
                this.i(-10027);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("nf.<init>(").append(param0).append(',');

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_22_2 + ')');
        }
    }

    final static boolean a(ls param0, ls param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.field_b < param1.field_b) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0.field_b != param1.field_b) {
                  break L1;
                } else {
                  if (param0.field_a < param1.field_a) {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (param2 == 30549) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("nf.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    static {
        field_Jb = "Play free version";
        field_Ib = new me(13, 0, 1, 0);
        field_Pb = "Spells to affect the very ground itself.";
    }
}
