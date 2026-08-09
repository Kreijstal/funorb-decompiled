/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    private pc field_c;
    private kg field_j;
    private java.math.BigInteger field_h;
    private tn field_i;
    private jf field_f;
    private tj[] field_a;
    private java.math.BigInteger field_e;
    static bi[] field_b;
    static int field_d;
    static String field_g;

    final static nf[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Confined.field_J ? 1 : 0;
        nf[] var1 = new nf[wc.field_hc];
        if (param0 > -65) {
            ja.a(-63);
        }
        for (var2 = 0; wc.field_hc > var2; var2++) {
            var3 = sd.field_f[var2] * rg.field_I[var2];
            var4 = rj.field_f[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = an.field_p[va.a((int) var4[var6], 255)];
            }
            var1[var2] = new nf(kb.field_a, em.field_e, jl.field_p[var2], ij.field_r[var2], rg.field_I[var2], sd.field_f[var2], var5);
        }
        ql.a(false);
        return var1;
    }

    final boolean a(boolean param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        kg var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Confined.field_J ? 1 : 0;
        if (this.field_j == null) {
          L0: {
            if (this.field_i != null) {
              break L0;
            } else {
              if (!this.field_f.c(111)) {
                this.field_i = this.field_f.a(255, true, -1911606496, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!this.field_i.field_v) {
            L1: {
              L2: {
                var10 = new kg(this.field_i.e((byte) 118));
                var10.field_n = 5;
                var3 = var10.c(32);
                var10.field_n = var10.field_n + 72 * var3;
                var13 = new byte[var10.field_m.length + -var10.field_n];
                var11 = var13;
                var4 = var11;
                var10.a(0, (byte) 115, var13.length, var13);
                if (this.field_e == null) {
                  break L2;
                } else {
                  if (this.field_h == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_e, this.field_h);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (-66 == (var5.length ^ -1)) {
              L3: {
                var15 = in.a(5, var10.field_m, -var13.length + var10.field_n + -5, -26879);
                if (!param0) {
                  break L3;
                } else {
                  this.a(true);
                  break L3;
                }
              }
              var7 = 0;
              L4: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  this.field_j = var10;
                  this.field_a = new tj[var3];
                  return true;
                } else {
                  if (var5[var7 - -1] == var15[var7]) {
                    var7++;
                    continue L4;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        int var1 = 104 % ((43 - param0) / 52);
    }

    private ja(jf param0, pc param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_c = param1;
              this.field_e = param2;
              this.field_h = param3;
              this.field_f = param0;
              if (this.field_f.c(-87)) {
                break L1;
              } else {
                this.field_i = this.field_f.a(255, true, -1911606496, 255, (byte) 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ja.<init>(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    ja(jf param0, pc param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final void b(byte param0) {
        int var2;
        int var3;
        tj stackIn_14_0 = null;
        var3 = Confined.field_J ? 1 : 0;
        if (param0 == 28) {
          if (null == this.field_a) {
            return;
          } else {
            var2 = 0;
            L0: while (true) {
              if (this.field_a.length <= var2) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= this.field_a.length) {
                    return;
                  } else {
                    stackIn_14_0 = this.field_a[var2];
                    if (stackIn_14_0 != null) {
                      this.field_a[var2].b((byte) 109);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (this.field_a[var2] != null) {
                  this.field_a[var2].c((byte) -121);
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean c(byte param0) {
        if (param0 >= -53) {
            field_b = (bi[]) null;
            return true;
        }
        return true;
    }

    final tj a(ae param0, byte param1, boolean param2, int param3, ae param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        tj var9 = null;
        byte[] var13 = null;
        tj stackIn_8_0 = null;
        tj stackIn_11_0 = null;
        tj stackIn_13_0 = null;
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
            if (null != this.field_j) {
              L1: {
                if (param3 < 0) {
                  break L1;
                } else {
                  if (param3 < this.field_a.length) {
                    if (this.field_a[param3] == null) {
                      this.field_j.field_n = 6 + 72 * param3;
                      var6_int = this.field_j.f((byte) 91);
                      if (param1 == -60) {
                        var7 = this.field_j.f((byte) 115);
                        var13 = new byte[64];
                        this.field_j.a(0, (byte) 86, 64, var13);
                        var9 = new tj(param3, param4, param0, this.field_f, this.field_c, var6_int, var13, var7, param2);
                        this.field_a[param3] = var9;
                        stackIn_13_0 = (tj) (var9);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackIn_11_0 = (tj) null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      stackIn_8_0 = this.field_a[param3];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("ja.A(");

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


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_b = new bi[4];
        field_d = 48;
        field_g = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
