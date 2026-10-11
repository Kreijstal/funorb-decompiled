/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class mo {
    private int field_c;
    int field_b;
    static String field_d;
    static String field_a;
    int field_e;

    private final void a(mo param0, int param1) {
        if (param1 != 0) {
          return;
        }
        try {
          this.field_e = param0.field_e;
          this.field_b = param0.field_b;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "mo.VA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -3) {
          CharSequence var2 = (CharSequence) null;
          mo.a(86, (CharSequence) null);
        }
        field_a = null;
    }

    final boolean a(int param0, mo param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!gk.field_e &&
            this.field_c < 64) {
            if (param1.field_b > this.field_b &&
              param3 == this.field_e &&
              this.field_b < param2) {
              this.field_c = this.field_c + 1;
              return true;
            }
            if (param1.field_b < this.field_b &&
              param1.field_e == param3 &&
              param2 > param1.field_b) {
              this.field_c = this.field_c + 1;
              return true;
            }
          }
          this.field_c = 0;
          if (param0 < -82) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("mo.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(mo param0, boolean param1) {
        try {
          this.a((byte) -105, param0);
          if (param1) {
            this.field_c = -29;
          }
          this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "mo.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ut b(int param0) {
        int var4_int = 0;
        int var5 = Kickabout.field_G;
        int var1 = ku.field_c[0] * lo.field_j[0];
        byte[] var2 = pq.field_O[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = lt.field_a[qj.b(255, (int) var2[var4_int])];
        }
        ut var4 = new ut(kw.field_i, ai.field_J, aq.field_f[0], fc.field_g[param0], ku.field_c[0], lo.field_j[0], var3);
        tk.h((byte) -81);
        return var4;
    }

    void a(mo param0, byte param1) {
        try {
          this.field_b = 0;
          if (param1 != 84) {
            mo var4 = (mo) null;
            this.a((mo) null, (byte) 91);
          }
          this.field_e = param0.field_e;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "mo.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(ml param0, int param1) {
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
          si var13 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          si var17 = null;
          Object var18 = null;
          Object var19 = null;
          java.lang.reflect.Field var20 = null;
          Object var22 = null;
          Object var23 = null;
          byte[][] var26 = null;
          java.lang.reflect.Field var27 = null;
          java.lang.reflect.Field var28 = null;
          java.lang.reflect.Method var29 = null;
          java.lang.reflect.Method var30 = null;
          int var8Lifetime1;
          var18 = null;
          var19 = null;
          var16 = null;
          var22 = null;
          var23 = null;
          var12 = Kickabout.field_G;
          try {
            var13 = (si) (nv.field_N.g(24009));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var17.field_n; var4++) {
              if (var13.field_f[var4] != null) {
                if (var13.field_f[var4].field_a == 2) {
                  var13.field_m[var4] = -5;
                }
                if (var13.field_f[var4].field_a == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_e[var4] != null) {
                if (var13.field_e[var4].field_a == 2) {
                  var13.field_m[var4] = -6;
                }
                if (0 == var13.field_e[var4].field_a) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_n;
            param0.b(-82, var17.field_p);
            for (var5 = param1; var5 < var17.field_n; var5++) {
              if (var17.field_m[var5] != 0) {
                param0.a(109, var17.field_m[var5]);
              } else {
                try {
                  var6_int = var17.field_h[var5];
                  if (0 != var6_int) {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_f[var5].field_b);
                      var20 = var16_ref;
                      var20.setInt((Object) null, var17.field_o[var5]);
                      param0.a(113, 0);
                    } else {
                      if (var6_int == 2) {
                        var28 = (java.lang.reflect.Field) (var17.field_f[var5].field_b);
                        var8 = var28.getModifiers();
                        param0.a(118, 0);
                        param0.b(param1 ^ -120, var8);
                      }
                    }
                  } else {
                    var27 = (java.lang.reflect.Field) (var17.field_f[var5].field_b);
                    var8 = var27.getInt((Object) null);
                    param0.a(114, 0);
                    param0.b(-110, var8);
                  }
                  if (var6_int == 3) {
                    var29 = (java.lang.reflect.Method) (var17.field_e[var5].field_b);
                    var26 = var17.field_l[var5];
                    var9 = new Object[var26.length];
                    for (var10_int = 0; var10_int < var26.length; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var29.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.a(106, 0);
                    } else if (var10 instanceof Number) {
                      param0.a(110, 1);
                      param0.a(((Number) (var10)).longValue(), param1 - 1781890008);
                    } else if (!(var10 instanceof String)) {
                      param0.a(109, 4);
                    } else {
                      param0.a(102, 2);
                      param0.a(param1 ^ 14190, (String) (var10));
                    }
                  } else {
                    if (var6_int == 4) {
                      var30 = (java.lang.reflect.Method) (var17.field_e[var5].field_b);
                      var8Lifetime1 = var30.getModifiers();
                      param0.a(115, 0);
                      param0.b(param1 - 114, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.a(116, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.a(119, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.a(param1 + 117, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.a(103, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.a(127, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.a(120, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.a(109, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.a(102, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.a(111, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.a(105, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.a(106, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.a(param1 + 106, -21);
                }
              }
            }
            param0.a(var4, false);
            var17.c((byte) -109);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_69_0 = var2;
            stackIn_69_1 = new StringBuilder().append("mo.BB(");
            if (param0 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(byte param0, mo param1);

    final static String a(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        try {
          if (param1 == null) {
            return null;
          }
          var2_int = param0;
          var3 = param1.length();
          while (var2_int < var3) {
            if (ca.a(false, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (ca.a(false, param1.charAt(-1 + var3))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param1.charAt(var6);
            if (ws.a((char) var7, (byte) 121)) {
              var8 = vf.a((byte) -67, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("mo.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    void a(mo param0, int param1, int param2, int param3) {
        if (param3 <= 38) {
          this.field_e = -23;
        }
        if (this.a(-86, param0, param2, param1)) {
          return;
        }
        try {
          this.a(param0, false);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "mo.LA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(ml param0, int param1) {
        mo var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 4) {
            var4 = (mo) null;
            this.a((byte) 17, (mo) null);
          }
          this.field_b = -hq.a(22531, 6, param0, 0) + 64;
          if (mu.a(param0, (byte) -39)) {
            this.field_e = param0.l(4, param1 + 55) - 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mo.RA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    mo() {
        this.field_e = -1;
    }

    static {
        field_d = "Month";
        field_a = "in the Quarter-Finals";
    }
}
