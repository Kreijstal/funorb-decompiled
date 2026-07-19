/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ki {
    private String field_h;
    int field_m;
    static int field_a;
    static String field_g;
    vm field_n;
    static String field_o;
    static of field_p;
    private int[] field_c;
    private oe[] field_b;
    private String[] field_j;
    boolean field_q;
    int field_l;
    static int field_e;
    static int[] field_i;
    static mf field_f;
    static jp[][] field_k;
    static int field_d;

    jp c(byte param0) {
        if (param0 > -74) {
            return (jp) null;
        }
        return kb.field_Ub[gb.field_n];
    }

    final oe[] a(int param0) {
        String var3 = null;
        String var2 = null;
        if (!(this.field_l >= this.field_b.length)) {
            var3 = this.field_j[this.field_c[this.field_l]];
            var2 = var3;
            if (BrickABrac.field_I.a(var2, "", (byte) -121)) {
                this.field_b[this.field_l] = l.field_m.a(var3, "", (byte) 122);
            }
            if (!(!og.field_gc.a(var2, "", (byte) -121))) {
                this.field_b[this.field_l] = l.field_m.a((byte) 28, var3, "");
            }
            if (!(this.field_b[this.field_l] == null)) {
                this.field_l = this.field_l + 1;
            }
        }
        if (param0 != 0) {
            field_f = (mf) null;
        }
        return this.field_b;
    }

    abstract void a(boolean param0, int param1, int param2, int param3, int param4);

    jp[] b(int param0) {
        if (param0 >= -12) {
            return (jp[]) null;
        }
        return im.field_a;
    }

    ki(int param0, String param1, String param2, int param3) {
        this(param0, param1, uc.a(param3, param2, (byte) -1));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = BrickABrac.field_J ? 1 : 0;
          if (param4 > param1) {
            if (param4 >= param5) {
              if (param5 > param1) {
                k.a(param2, param6, param1, lb.field_l, param4, param5, param0, param3, 0);
                break L0;
              } else {
                k.a(param3, param6, param5, lb.field_l, param4, param1, param0, param2, 0);
                break L0;
              }
            } else {
              k.a(param6, param2, param1, lb.field_l, param5, param4, param0, param3, 0);
              break L0;
            }
          } else {
            if (param5 > param1) {
              k.a(param3, param2, param4, lb.field_l, param5, param1, param0, param6, 0);
              break L0;
            } else {
              if (param4 < param5) {
                k.a(param2, param3, param4, lb.field_l, param1, param5, param0, param6, 0);
                break L0;
              } else {
                k.a(param6, param3, param5, lb.field_l, param1, param4, param0, param2, 0);
                break L0;
              }
            }
          }
        }
        var8 = 88 % ((-60 - param7) / 62);
    }

    final void e(int param0) {
        boolean discarded$0 = false;
        String discarded$1 = null;
        if (!this.b((byte) -99)) {
            discarded$0 = this.a(false);
        }
        if (param0 != 1) {
            String var3 = (String) null;
            discarded$1 = ki.a((java.applet.Applet) null, 122, (String) null);
        }
    }

    jp[] a(byte param0, int param1) {
        int var3 = -89 % ((param0 - 65) / 49);
        return null;
    }

    abstract boolean a(boolean param0);

    abstract boolean b(byte param0);

    jp a(boolean param0, int param1) {
        if (param0) {
            return null;
        }
        field_g = (String) null;
        return null;
    }

    abstract void a(byte param0, int param1, int param2, int param3);

    public static void a(byte param0) {
        if (param0 != 7) {
            return;
        }
        field_o = null;
        field_i = null;
        field_p = null;
        field_g = null;
        field_k = (jp[][]) null;
        field_f = null;
    }

    final void d(int param0) {
        vm dupTemp$0 = null;
        int fieldTemp$1 = 0;
        oe[] discarded$2 = null;
        if (this.field_n == null) {
            dupTemp$0 = vm.a(mh.field_lb, "", this.field_h);
            this.field_n = dupTemp$0;
            if (!(dupTemp$0 != null)) {
                return;
            }
        }
        if (!m.field_f.a(param0 ^ -74, this.field_n, 22050, ji.field_a, l.field_m)) {
            return;
        }
        if (-1 > (sk.field_H ^ -1)) {
            fieldTemp$1 = sk.field_H - 1;
            sk.field_H = sk.field_H - 1;
            if (0 == fieldTemp$1) {
                m.field_f.a((byte) 118);
            }
        }
        this.field_q = true;
        if (param0 != 59) {
            discarded$2 = this.a(-106);
        }
    }

    final static String a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            Object stackIn_13_0 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_7_0 = null;
            Object stackOut_12_0 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var7 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param1 >= 74) {
                        break L2;
                      } else {
                        ki.a((byte) 0);
                        break L2;
                      }
                    }
                    var3 = (String) (ne.a("getcookies", -127, param0));
                    var4 = qb.a((byte) 122, var3, ';');
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if ((var6 ^ -1) > -1) {
                            break L4;
                          } else {
                            if (!var4[var5].substring(0, var6).trim().equals(param2)) {
                              break L4;
                            } else {
                              stackOut_7_0 = var4[var5].substring(1 + var6).trim();
                              stackIn_8_0 = stackOut_7_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) (var3_ref2);
                stackOut_14_1 = new StringBuilder().append("ki.W(");
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param0 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              L7: {
                stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param2 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L7;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L7;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_13_0);
            } else {
              return stackIn_8_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    int c(int param0) {
        jp[] discarded$0 = null;
        if (param0 > -72) {
            discarded$0 = this.a(57, false);
        }
        return 256;
    }

    abstract void a(int param0, byte param1, int param2, int param3, int param4);

    jp[] a(int param0, boolean param1) {
        if (param1) {
            return null;
        }
        return (jp[]) null;
    }

    private ki(int param0, String param1, String[] param2) {
        int var4_int = 0;
        try {
            this.field_h = param1;
            this.field_m = param0;
            this.field_j = param2;
            this.field_b = new oe[this.field_j.length];
            this.field_c = new int[this.field_j.length];
            for (var4_int = 0; this.field_c.length > var4_int; var4_int++) {
                this.field_c[var4_int] = var4_int;
            }
            ke.a(this.field_c, (byte) 39, hi.field_w);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ki.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Please select options in the following rows:  ";
        field_a = 1;
        field_o = "World select";
        field_e = 0;
        field_p = new of();
        field_i = new int[5];
        field_d = 256;
    }
}
