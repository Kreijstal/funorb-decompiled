/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class nf extends rh {
    static int field_M;
    private int field_J;
    static bg field_F;
    static int field_N;
    static String field_E;
    private int field_G;
    private int field_L;
    private int field_K;
    private int field_I;
    private int field_H;

    final static void a(int param0, hb param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_69_0 = null;
          StringBuilder stackIn_69_1 = null;
          String stackIn_70_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          int var3 = 0;
          int var4 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          InvalidClassException var6_ref = null;
          StreamCorruptedException var6_ref2 = null;
          OptionalDataException var6_ref3 = null;
          IllegalAccessException var6_ref4 = null;
          IllegalArgumentException var6_ref5 = null;
          java.lang.reflect.InvocationTargetException var6_ref6 = null;
          SecurityException var6_ref7 = null;
          IOException var6_ref8 = null;
          NullPointerException var6_ref9 = null;
          Exception var6_ref10 = null;
          Throwable var6_ref11 = null;
          int var8 = 0;
          Object[] var9 = null;
          Object var10 = null;
          ObjectInputStream var11 = null;
          int var12 = 0;
          i var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          i var17 = null;
          Object var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var20 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var18 = null;
          var16 = null;
          var20 = null;
          var22 = null;
          var12 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            var13 = (i) (ua.field_v.a((byte) -117));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var17.field_e > var4; var4++) {
              if (null != var13.field_k[var4]) {
                if (var13.field_k[var4].field_g == 2) {
                  var13.field_o[var4] = -5;
                }
                if (0 == var13.field_k[var4].field_g) {
                  var3 = 1;
                }
              }
              if (var13.field_s[var4] != null) {
                if (var13.field_s[var4].field_g == 2) {
                  var13.field_o[var4] = -6;
                }
                if (var13.field_s[var4].field_g == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_h;
            param1.a(-803539344, var17.field_l);
            if (param0 > -79) {
              nf.a(116, (byte) 63, -58, 12);
            }
            for (var5 = 0; var17.field_e > var5; var5++) {
              if (0 != var17.field_o[var5]) {
                param1.b(var17.field_o[var5], -49152);
              } else {
                try {
                  var6_int = var17.field_q[var5];
                  if (0 == var6_int) {
                    var15 = (java.lang.reflect.Field) (var17.field_k[var5].field_b);
                    var8 = var15.getInt((Object) null);
                    param1.b(0, -49152);
                    param1.a(-803539344, var8);
                  } else {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_k[var5].field_b);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_g[var5]);
                      param1.b(0, -49152);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.field_k[var5].field_b);
                        var8 = var26.getModifiers();
                        param1.b(0, -49152);
                        param1.a(-803539344, var8);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var17.field_s[var5].field_b);
                    var25 = var17.field_f[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var10_int < var25.length; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.b(0, -49152);
                    } else if (var10 instanceof Number) {
                      param1.b(1, -49152);
                      param1.a(((Number) (var10)).longValue(), (byte) 84);
                    } else if (!(var10 instanceof String)) {
                      param1.b(4, -49152);
                    } else {
                      param1.b(2, -49152);
                      param1.a(-105, (String) (var10));
                    }
                  } else {
                    if (var6_int == 4) {
                      var27 = (java.lang.reflect.Method) (var17.field_s[var5].field_b);
                      var8Lifetime1 = var27.getModifiers();
                      param1.b(0, -49152);
                      param1.a(-803539344, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.b(-10, -49152);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.b(-11, -49152);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.b(-12, -49152);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.b(-13, -49152);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.b(-14, -49152);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.b(-15, -49152);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.b(-16, -49152);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.b(-17, -49152);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.b(-18, -49152);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.b(-19, -49152);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.b(-20, -49152);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.b(-21, -49152);
                }
              }
            }
            param1.a((byte) -66, var4);
            var17.c(-19822);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_69_0 = var2;
            stackIn_69_1 = new StringBuilder().append("nf.GB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void e(byte param0) {
        if (param0 != 10) {
          this.a(false, -117, 77);
        }
    }

    nf(kj param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_K = 0;
        this.field_L = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param3 <= 0) {
          this.a(param0, (byte) 124, param2);
          return;
        }
        this.field_G = this.field_l;
        this.field_K = param3;
        this.field_I = param0;
        this.field_L = param1;
        this.field_J = param2;
        this.field_H = this.field_p;
    }

    final static void n(int param0) {
        if (param0 >= -34) {
          return;
        }
        int var1 = pf.a((byte) 97, 3);
        cj.a((byte) 105, ke.field_h[28 + var1]);
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        if (param0 < 0 ||
          65536 <= param0) {
          param0 = param0 >>> 16;
          var2 += 16;
        }
        if (param0 >= 256) {
          var2 += 8;
          param0 = param0 >>> 8;
        }
        if (param0 >= 16) {
          param0 = param0 >>> 4;
          var2 += 4;
        }
        if (!param1) {
          return 95;
        }
        if (param0 >= 4) {
          param0 = param0 >>> 2;
          var2 += 2;
        }
        if (param0 >= 1) {
          var2++;
          param0 = param0 >>> 1;
        }
        return param0 + var2;
    }

    final static short[] a(boolean param0, hb param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var4_int = param1.f(8, param2);
          if (0 == var4_int) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new short[var4_int];
          }
          if (param0) {
            nf.a(113, (byte) 53, 71, -3);
          }
          var5 = param1.f(8, 4);
          var6 = (short)param1.f(8, 16);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (short)(var6 + param1.f(8, var5));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (param3);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("nf.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        ve.a(74, param2, param3, ah.field_g[param0]);
        if (param1 != 115) {
          field_M = 40;
        }
    }

    void p(int param0) {
        if (param0 != -21) {
          nf.a(-27, (byte) -88, -52, -108);
        }
        if (this.field_K <= 0) {
          return;
        }
        this.a(this.field_I, (byte) -109, this.field_J);
        this.field_K = 0;
        this.e((byte) 10);
    }

    void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        ge.a(6 + param1, param2 + 35, this.field_l - 12, -40 + this.field_p, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        if (param0) {
          return;
        }
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (var8 >= ge.field_f &&
            ge.field_k > var8) {
            var9 = var5 + var7 * (-var5 + var6) / var4;
            var10 = 0;
            var11 = this.field_l;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (-var7 + 20) + (-var10 + 20) * (-var10 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  ge.field_i[var10 + var8 * ge.field_h + param1] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (-var7 + 20) * (20 - var7) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (420 <= var14) {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    ge.field_i[var11 + ge.field_h * var8 + param1] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            ge.a(param1 + var10, var8, var11 - var10, var9);
          }
          var8++;
          var7++;
        }
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param2 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          ge.a(param1, var8Lifetime1, 6, var9Lifetime1);
          ge.a(param1 + this.field_l - 6, var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        af.field_e.c(this.field_l + param1 - 90, 10 + param2);
        qb.a(param2 + 35, pe.field_a, (byte) -108, 5 + param1, this.field_l - 10);
        qb.a(-22 + param2 + this.field_p, ra.field_Z, (byte) -109, param1, this.field_l);
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var4Lifetime2 = -79 + this.field_p;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param2;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + (var6Lifetime2 - var5Lifetime2) * var7Lifetime2 / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          ge.a(param1, var8Lifetime2, 6, var9Lifetime2);
          ge.a(-6 + (this.field_l + param1), var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
        return;
    }

    boolean b(boolean param0) {
        if (param0) {
          this.k(-110);
        }
        this.p(-21);
        return super.b(false);
    }

    public static void o(int param0) {
        if (param0 != -4110) {
          nf.n(73);
        }
        field_F = null;
        field_E = null;
    }

    boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -23913) {
          nf.a(-124, true);
        }
        if (this.field_K <= 0) {
        } else {
          var2 = this.field_J;
          var3 = this.field_I;
          fieldTemp$0 = this.field_L + 1;
          this.field_L = this.field_L + 1;
          if (this.field_K <= fieldTemp$0) {
            this.field_K = 0;
            this.e((byte) 10);
          } else {
            var4 = (this.field_K * 2 - this.field_L) * this.field_L;
            var5 = this.field_K * this.field_K;
            var3 = var4 * (-this.field_H + this.field_I) / var5 + this.field_H;
            var2 = this.field_G + var4 * (-this.field_G + this.field_J) / var5;
          }
          this.a(var3, (byte) 115, var2);
        }
        return super.k(-23913);
    }

    static {
        field_N = 0;
        field_E = "Back";
    }
}
