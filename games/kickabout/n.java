/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    private bi field_g;
    private iw field_i;
    static qv field_e;
    static String[] field_f;
    static int field_m;
    private eb field_h;
    private java.math.BigInteger field_b;
    private java.math.BigInteger field_l;
    static String field_j;
    static boolean field_c;
    private wm[] field_k;
    static int field_d;
    private ui field_a;

    public static void b(int param0) {
        field_f = null;
        field_e = null;
        if (param0 != -2147483648) {
          n.a(-8, 21, -15);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final static String a(char param0, String param1, byte param2, String param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Kickabout.field_G;
        try {
          var4_int = param3.length();
          var5 = param1.length();
          var6 = var4_int;
          var7 = -1 + var5;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param3.indexOf((int) param0, var8_int);
              if (0 > var8_int) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          var10 = 4 % ((-69 - param2) / 54);
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var11 = param3.indexOf((int) param0, var9);
            if (0 > var11) {
              discarded$3 = var8.append(param3.substring(var9));
              stackIn_10_0 = var8.toString();
              return stackIn_10_0;
            }
            discarded$4 = var8.append(param3.substring(var9, var11));
            discarded$5 = var8.append(param1);
            var9 = 1 + var11;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("n.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    n(bi param0, eb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final wm a(qh param0, int param1, int param2, boolean param3, qh param4) {
        wm stackIn_9_0 = null;
        wm stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wm var9 = null;
        int var10 = 0;
        byte[] var14 = null;
        try {
          if (this.field_i == null) {
            throw new RuntimeException();
          }
          if (param2 >= 0 &&
            param2 < this.field_k.length) {
            if (null != this.field_k[param2]) {
              stackIn_9_0 = this.field_k[param2];
              return stackIn_9_0;
            }
            this.field_i.field_n = param2 * 72 + 6;
            var6_int = this.field_i.k(4);
            var7 = this.field_i.k(4);
            var14 = new byte[64];
            this.field_i.a(var14, 0, (byte) -6, 64);
            var10 = -31 / ((param1 - 39) / 51);
            var9 = new wm(param2, param0, param4, this.field_g, this.field_h, var6_int, var14, var7, param3);
            this.field_k[param2] = var9;
            stackIn_11_0 = var9;
            return stackIn_11_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("n.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          jw.field_Cb.field_E = param1;
          qv.field_f = true;
          var2_int = ea.field_f.field_a;
          var3 = ea.field_f.field_e;
          int var4 = 59 % ((param0 + 57) / 43);
          var5 = jw.field_Cb.field_X.c(param1, 272, jw.field_Cb.field_xb);
          var6 = -103 + var3 / 2 - var5 / 2;
          kk.field_j.a(true, 320, (-320 + var2_int) / 2, var6, -120 + (var3 - 2 * var6));
          kk.field_j.field_R = fs.a(kk.field_j.field_mb, 3, 2105376, 11579568, 8421504, (byte) 126);
          jw.field_Cb.a(true, -24 + kk.field_j.field_q - 24, 24, 16, -24 + (-20 + kk.field_j.field_mb));
          ao.field_a.a(true, 80, 120, -20 + kk.field_j.field_mb - 24, 24);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "n.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Kickabout.field_G;
        if (this.field_k == null) {
          return;
        }
        for (var2 = param0; this.field_k.length > var2; var2++) {
          if (this.field_k[var2] != null) {
            this.field_k[var2].d(18137);
          }
        }
        for (var2Lifetime1 = 0; this.field_k.length > var2Lifetime1; var2Lifetime1++) {
          if (null != this.field_k[var2Lifetime1]) {
            this.field_k[var2Lifetime1].b(-44);
          }
        }
        return;
    }

    final static void a(int param0, int param1, int param2) {
        String var4;
        if (null == oo.field_e) {
          oo.field_e = new int[param1 * 2];
          if (bl.field_m == null ||
            !(bl.field_m.length >= param1)) {
            bl.field_m = new int[2 * param1];
          }
          if (param0 != -20669) {
            var4 = (String) null;
            n.a('[', (String) null, (byte) 89, (String) null);
          }
          if (qp.field_G == null ||
            !(param1 <= qp.field_G.length)) {
            qp.field_G = new int[param1 * 2];
          }
          if (null != fo.field_j &&
            param1 <= fo.field_j.length) {
            if (ln.field_B == null ||
              !(ln.field_B.length >= param1)) {
              ln.field_B = new int[2 * param1];
            }
            if (null == w.field_a) {
              w.field_a = new int[param1 * 2];
              if (pf.field_d == null ||
                !(param2 + param1 <= pf.field_d.length)) {
                pf.field_d = new int[(param2 + param1) * 2];
              }
              if (null == ug.field_f ||
                !(ug.field_f.length >= param1)) {
                ug.field_f = new boolean[2 * param1];
              }
            } else {
              if (param1 > w.field_a.length) {
                w.field_a = new int[param1 * 2];
                if (pf.field_d == null ||
                  !(param2 + param1 <= pf.field_d.length)) {
                  pf.field_d = new int[(param2 + param1) * 2];
                }
                if (null == ug.field_f ||
                  !(ug.field_f.length >= param1)) {
                  ug.field_f = new boolean[2 * param1];
                }
              } else {
                if (pf.field_d == null) {
                  pf.field_d = new int[(param2 + param1) * 2];
                  if (null == ug.field_f ||
                    !(ug.field_f.length >= param1)) {
                    ug.field_f = new boolean[2 * param1];
                  }
                } else {
                  if (param2 + param1 > pf.field_d.length) {
                    pf.field_d = new int[(param2 + param1) * 2];
                    if (null == ug.field_f ||
                      !(ug.field_f.length >= param1)) {
                      ug.field_f = new boolean[2 * param1];
                    }
                  } else {
                    if (null == ug.field_f) {
                      ug.field_f = new boolean[2 * param1];
                    } else {
                      if (ug.field_f.length < param1) {
                        ug.field_f = new boolean[2 * param1];
                      }
                    }
                  }
                }
              }
            }
            kt.field_g = -2147483648;
            lm.field_V = -2147483648;
            er.field_k = 2147483647;
            vi.field_s = 2147483647;
            wf.field_O = 0;
            return;
          }
          fo.field_j = new int[2 * param1];
          if (ln.field_B == null ||
            !(ln.field_B.length >= param1)) {
            ln.field_B = new int[2 * param1];
          }
          if (null == w.field_a ||
            !(param1 <= w.field_a.length)) {
            w.field_a = new int[param1 * 2];
          }
          if (pf.field_d == null ||
            !(param2 + param1 <= pf.field_d.length)) {
            pf.field_d = new int[(param2 + param1) * 2];
          }
          if (null == ug.field_f ||
            !(ug.field_f.length >= param1)) {
            ug.field_f = new boolean[2 * param1];
          }
        } else {
          if (param1 <= oo.field_e.length) {
            if (bl.field_m == null ||
              !(bl.field_m.length >= param1)) {
              bl.field_m = new int[2 * param1];
            }
            if (param0 != -20669) {
              var4 = (String) null;
              n.a('[', (String) null, (byte) 89, (String) null);
            }
            if (qp.field_G == null ||
              !(param1 <= qp.field_G.length)) {
              qp.field_G = new int[param1 * 2];
            }
            if (null != fo.field_j &&
              param1 <= fo.field_j.length) {
              if (ln.field_B == null ||
                !(ln.field_B.length >= param1)) {
                ln.field_B = new int[2 * param1];
              }
              if (null == w.field_a) {
                w.field_a = new int[param1 * 2];
                if (pf.field_d == null ||
                  !(param2 + param1 <= pf.field_d.length)) {
                  pf.field_d = new int[(param2 + param1) * 2];
                }
                if (null == ug.field_f ||
                  !(ug.field_f.length >= param1)) {
                  ug.field_f = new boolean[2 * param1];
                }
              } else {
                if (param1 > w.field_a.length) {
                  w.field_a = new int[param1 * 2];
                  if (pf.field_d == null ||
                    !(param2 + param1 <= pf.field_d.length)) {
                    pf.field_d = new int[(param2 + param1) * 2];
                  }
                  if (null == ug.field_f ||
                    !(ug.field_f.length >= param1)) {
                    ug.field_f = new boolean[2 * param1];
                  }
                } else {
                  if (pf.field_d == null) {
                    pf.field_d = new int[(param2 + param1) * 2];
                    if (null == ug.field_f ||
                      !(ug.field_f.length >= param1)) {
                      ug.field_f = new boolean[2 * param1];
                    }
                  } else {
                    if (param2 + param1 > pf.field_d.length) {
                      pf.field_d = new int[(param2 + param1) * 2];
                      if (null == ug.field_f ||
                        !(ug.field_f.length >= param1)) {
                        ug.field_f = new boolean[2 * param1];
                      }
                    } else {
                      if (null == ug.field_f) {
                        ug.field_f = new boolean[2 * param1];
                      } else {
                        if (ug.field_f.length < param1) {
                          ug.field_f = new boolean[2 * param1];
                        }
                      }
                    }
                  }
                }
              }
              kt.field_g = -2147483648;
              lm.field_V = -2147483648;
              er.field_k = 2147483647;
              vi.field_s = 2147483647;
              wf.field_O = 0;
              return;
            }
            fo.field_j = new int[2 * param1];
            if (ln.field_B == null ||
              !(ln.field_B.length >= param1)) {
              ln.field_B = new int[2 * param1];
            }
            if (null == w.field_a ||
              !(param1 <= w.field_a.length)) {
              w.field_a = new int[param1 * 2];
            }
            if (pf.field_d == null ||
              !(param2 + param1 <= pf.field_d.length)) {
              pf.field_d = new int[(param2 + param1) * 2];
            }
            if (null == ug.field_f ||
              !(ug.field_f.length >= param1)) {
              ug.field_f = new boolean[2 * param1];
            }
          } else {
            oo.field_e = new int[param1 * 2];
            if (bl.field_m == null ||
              !(bl.field_m.length >= param1)) {
              bl.field_m = new int[2 * param1];
            }
            if (param0 != -20669) {
              var4 = (String) null;
              n.a('[', (String) null, (byte) 89, (String) null);
            }
            if (qp.field_G == null ||
              !(param1 <= qp.field_G.length)) {
              qp.field_G = new int[param1 * 2];
            }
            if (null != fo.field_j &&
              param1 <= fo.field_j.length) {
              if (ln.field_B == null ||
                !(ln.field_B.length >= param1)) {
                ln.field_B = new int[2 * param1];
              }
              if (null == w.field_a) {
                w.field_a = new int[param1 * 2];
                if (pf.field_d == null) {
                  pf.field_d = new int[(param2 + param1) * 2];
                  if (null == ug.field_f ||
                    !(ug.field_f.length >= param1)) {
                    ug.field_f = new boolean[2 * param1];
                  }
                } else {
                  if (param2 + param1 > pf.field_d.length) {
                    pf.field_d = new int[(param2 + param1) * 2];
                    if (null == ug.field_f ||
                      !(ug.field_f.length >= param1)) {
                      ug.field_f = new boolean[2 * param1];
                    }
                  } else {
                    if (null == ug.field_f) {
                      ug.field_f = new boolean[2 * param1];
                    } else {
                      if (ug.field_f.length < param1) {
                        ug.field_f = new boolean[2 * param1];
                      }
                    }
                  }
                }
              } else {
                if (param1 > w.field_a.length) {
                  w.field_a = new int[param1 * 2];
                  if (pf.field_d == null ||
                    !(param2 + param1 <= pf.field_d.length)) {
                    pf.field_d = new int[(param2 + param1) * 2];
                  }
                } else {
                  if (pf.field_d == null) {
                    pf.field_d = new int[(param2 + param1) * 2];
                  } else {
                    if (param2 + param1 > pf.field_d.length) {
                      pf.field_d = new int[(param2 + param1) * 2];
                    }
                  }
                }
                if (null == ug.field_f) {
                  ug.field_f = new boolean[2 * param1];
                } else {
                  if (ug.field_f.length < param1) {
                    ug.field_f = new boolean[2 * param1];
                  }
                }
              }
              kt.field_g = -2147483648;
              lm.field_V = -2147483648;
              er.field_k = 2147483647;
              vi.field_s = 2147483647;
              wf.field_O = 0;
              return;
            }
            fo.field_j = new int[2 * param1];
            if (ln.field_B == null ||
              !(ln.field_B.length >= param1)) {
              ln.field_B = new int[2 * param1];
            }
            if (null == w.field_a ||
              !(param1 <= w.field_a.length)) {
              w.field_a = new int[param1 * 2];
            }
            if (pf.field_d == null ||
              !(param2 + param1 <= pf.field_d.length)) {
              pf.field_d = new int[(param2 + param1) * 2];
            }
            if (null != ug.field_f &&
              ug.field_f.length >= param1) {
              kt.field_g = -2147483648;
              lm.field_V = -2147483648;
              er.field_k = 2147483647;
              vi.field_s = 2147483647;
              wf.field_O = 0;
              return;
            }
            ug.field_f = new boolean[2 * param1];
          }
        }
        kt.field_g = -2147483648;
        lm.field_V = -2147483648;
        er.field_k = 2147483647;
        vi.field_s = 2147483647;
        wf.field_O = 0;
    }

    final boolean a(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        iw var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var16;
        byte[] var17;
        int var7Lifetime1;
        var8 = Kickabout.field_G;
        if (this.field_i != null) {
          return true;
        }
        if (this.field_a == null) {
          if (this.field_g.a(25533)) {
            return false;
          }
          this.field_a = this.field_g.a(255, 255, (byte) 0, (byte) 89, true);
        }
        if (this.field_a.field_p) {
          return false;
        }
        var10 = new iw(this.field_a.b(param0 ^ -12847));
        var10.field_n = 5;
        var3 = var10.h((byte) -116);
        var10.field_n = var10.field_n + 72 * var3;
        var13 = new byte[var10.field_f.length - var10.field_n];
        var11 = var13;
        var4 = var11;
        if (param0 != -45) {
          return true;
        }
        var10.a(var4, 0, (byte) -6, var13.length);
        if (this.field_b == null) {
          var5 = var4;
        } else {
          if (this.field_l == null) {
            var5 = var4;
            if (var5.length != 65) {
              throw new RuntimeException();
            }
            var16 = jj.a(-5 + var10.field_n - var13.length, var10.field_f, (byte) 122, 5);
            for (var7 = 0; var7 < 64; var7++) {
              if (var5[var7 + 1] != var16[var7]) {
                throw new RuntimeException();
              }
            }
            this.field_k = new wm[var3];
            this.field_i = var10;
            return true;
          }
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_b, this.field_l);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var17 = jj.a(-5 + var10.field_n - var13.length, var10.field_f, (byte) 122, 5);
        for (var7Lifetime1 = 0; var7Lifetime1 < 64; var7Lifetime1++) {
          if (var5[var7Lifetime1 + 1] != var17[var7Lifetime1]) {
            throw new RuntimeException();
          }
        }
        this.field_k = new wm[var3];
        this.field_i = var10;
        return true;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        if (null == mr.field_Z) {
          return false;
        }
        if (null == mr.field_Z.h((byte) 18)) {
          return false;
        }
        return true;
    }

    private n(bi param0, eb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h = param1;
          this.field_l = param3;
          this.field_b = param2;
          this.field_g = param0;
          if (!this.field_g.a(25533)) {
            this.field_a = this.field_g.a(255, 255, (byte) 0, (byte) 89, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("n.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_m = 0;
        field_f = new String[100];
        field_j = "Options";
        field_d = -1;
    }
}
