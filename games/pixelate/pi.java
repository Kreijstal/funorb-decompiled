/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends ak {
    private int field_Qb;
    static te field_Rb;
    private int field_Nb;
    private int field_Eb;
    private int field_Lb;
    private int[] field_Mb;
    private ak field_Pb;
    static int field_Fb;
    private int field_Gb;
    private int field_Ob;
    private lo[] field_Ib;
    private ak field_Jb;
    private tf[] field_Kb;
    private int field_Hb;

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
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
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        String stackOut_26_0 = null;
        String stackOut_12_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param2 != 0) {
              if ((param2 ^ -1) == -2) {
                var10 = param0[param1];
                var4 = var10;
                if (var4 != null) {
                  stackOut_9_0 = var10.toString();
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param1 + param2;
                if (param3 == 21197) {
                  var5 = 0;
                  var6_int = param1;
                  L1: while (true) {
                    if (var6_int >= var4_int) {
                      var6 = new StringBuilder(var5);
                      var7 = param1;
                      L2: while (true) {
                        if (var7 >= var4_int) {
                          stackOut_26_0 = var6.toString();
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L3: {
                            var8 = param0[var7];
                            if (var8 == null) {
                              discarded$5 = var6.append("null");
                              break L3;
                            } else {
                              discarded$6 = var6.append(var8);
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      L4: {
                        var7_ref_CharSequence = param0[var6_int];
                        if (var7_ref_CharSequence == null) {
                          var5 += 4;
                          break L4;
                        } else {
                          var5 = var5 + var7_ref_CharSequence.length();
                          break L4;
                        }
                      }
                      var6_int++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_12_0 = (String) null;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4_ref);
            stackOut_28_1 = new StringBuilder().append("pi.A(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                return stackIn_27_0;
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        String discarded$0 = null;
        field_Rb = null;
        if (param0 < 121) {
            CharSequence[] var2 = (CharSequence[]) null;
            discarded$0 = pi.a((CharSequence[]) null, -85, 35, 38);
        }
    }

    pi(pi param0) {
        this(param0, param0.field_Kb, param0.field_Pb, param0.field_Jb, param0.field_Ob, param0.field_Nb, param0.field_Lb, param0.field_Eb, param0.field_Qb);
    }

    final void a(String param0, byte param1, int param2) {
        try {
            this.field_Ib[this.field_Hb] = new lo(0L, (ak) null, (ak) null, this.field_Jb, (tf) null, param0);
            this.field_Ib[this.field_Hb].field_ab = this.field_Kb;
            this.field_Ib[this.field_Hb].field_A = true;
            this.field_Ib[this.field_Hb].field_kb = 1;
            this.a(this.field_Ib[this.field_Hb], (byte) 26);
            this.field_Mb[this.field_Hb] = param2;
            if (param1 > -23) {
                this.field_Pb = (ak) null;
            }
            this.field_Hb = this.field_Hb + 1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "pi.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static Boolean c(byte param0) {
        String discarded$0 = null;
        Boolean var1 = kj.field_j;
        if (param0 != 104) {
            CharSequence[] var2 = (CharSequence[]) null;
            discarded$0 = pi.a((CharSequence[]) null, 88, -25, -27);
        }
        kj.field_j = null;
        return var1;
    }

    final void a(int param0, int param1, tf param2, String param3) {
        try {
            this.field_Ib[this.field_Hb] = new lo((long)param0, (ak) null, (ak) null, this.field_Jb, param2, param3);
            this.field_Ib[this.field_Hb].field_ab = this.field_Kb;
            this.field_Ib[this.field_Hb].field_A = true;
            this.field_Ib[this.field_Hb].field_kb = 1;
            this.a(this.field_Ib[this.field_Hb], (byte) 26);
            this.field_Mb[this.field_Hb] = param1;
            this.field_Hb = this.field_Hb + 1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "pi.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        this.a(param0 ^ 24573, param1);
        if (!(param1)) {
            return -2;
        }
        if (param0 != -12487) {
            return 40;
        }
        for (var3 = 0; this.field_Hb > var3; var3++) {
            if (-1 != (this.field_Ib[var3].field_P ^ -1)) {
                return this.field_Mb[var3];
            }
        }
        if (-1 != (nm.field_c ^ -1)) {
            return -1;
        }
        return this.field_Gb;
    }

    final boolean j(int param0) {
        if (!((this.field_Gb ^ -1) == 1)) {
            return false;
        }
        int var2 = -31 / ((71 - param0) / 52);
        if ((ke.field_a ^ -1) != -14) {
            return true;
        }
        this.field_Gb = -1;
        return true;
    }

    pi(ak param0, tf[] param1, ak param2, ak param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Mb = new int[256];
        this.field_Gb = -2;
        this.field_Ib = new lo[256];
        try {
            this.field_Kb = param1;
            this.field_Jb = param3;
            this.field_Lb = param6;
            this.field_Qb = param8;
            this.field_Nb = param5;
            this.field_Eb = param7;
            this.field_Ob = param4;
            this.field_Pb = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Pixelate.field_H ? 1 : 0;
          if (this.field_Hb != 0) {
            break L0;
          } else {
            this.field_Ib[this.field_Hb] = new lo(0L, (ak) null, (ak) null, this.field_Pb, (tf) null, ln.field_l);
            this.field_Ib[this.field_Hb].field_kb = 1;
            this.a(this.field_Ib[this.field_Hb], (byte) 26);
            this.field_Mb[this.field_Hb] = -1;
            this.field_Hb = this.field_Hb + 1;
            break L0;
          }
        }
        L1: {
          var6 = 0;
          if (param2 >= 12) {
            break L1;
          } else {
            this.field_Hb = 83;
            break L1;
          }
        }
        var7 = 0;
        L2: while (true) {
          if (var7 >= this.field_Hb) {
            var6 = var6 + 2 * this.field_Ob;
            var7 = this.field_Qb * this.field_Hb + (this.field_Eb - -this.field_Eb);
            var8 = ui.a(param4, param1, var6, (byte) -1);
            var9 = pj.a(var7, param3, param0, (byte) 45);
            this.a(var9, var7, var8, 256, var6);
            var10 = 0;
            L3: while (true) {
              if (var10 >= this.field_Hb) {
                return;
              } else {
                this.field_Ib[var10].a(this.field_Qb, this.field_Nb, this.field_Lb, this.field_Eb - -(this.field_Qb * var10), this.field_Ob, var6 - 2 * this.field_Ob, -2147483648);
                var10++;
                continue L3;
              }
            }
          } else {
            var8 = this.field_Ib[var7].c(-25469, this.field_Lb, this.field_Nb);
            if (var6 < var8) {
              var6 = var8;
              var7++;
              continue L2;
            } else {
              var7++;
              continue L2;
            }
          }
        }
    }

    static {
        field_Fb = 10;
    }
}
