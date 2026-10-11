/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class mf {
    private ob field_i;
    private boolean field_c;
    static ed field_a;
    private int field_h;
    private Object[][] field_e;
    private f field_g;
    private Object[] field_j;
    static tk field_d;
    static int[] field_l;
    static String field_b;
    static String[] field_f;
    static hf field_k;
    static ed field_m;

    final static int b(int param0, int param1, int param2) {
        if (param2 != -2) {
          return 21;
        }
        return ni.a(param0, param1, false, ka.field_b);
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param0 != -1) {
            mf.b(((int[]) (this.field_j[2]))[27], ((int[]) (this.field_j[15]))[0], ((int[]) (this.field_j[6]))[30]);
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_g.field_p.a(mh.a(param0 + 1, var4), 1);
          if (this.a(var3_int, (byte) -124)) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("mf.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
          field_a = (ed) null;
        }
        if (!this.a(param2, 11315, param1)) {
          return false;
        }
        if (null != this.field_e[param1] &&
          null != this.field_e[param1][param2]) {
          return true;
        }
        if (null != this.field_j[param1]) {
          return true;
        }
        this.c(param1, 14);
        if (null == this.field_j[param1]) {
          return false;
        }
        return true;
    }

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = EscapeVector.field_A;
        try {
          var3 = cf.a(param1, 81, param2);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          var4 = 0;
          if (!param0) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          while (var4 < param2.length()) {
            if (!fn.a(param2.charAt(var4), (byte) -124)) {
              stackIn_12_0 = s.field_B;
              return stackIn_12_0;
            }
            var4++;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("mf.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_g.field_p.a(mh.a(param0, var4), 1);
          stackIn_4_0 = this.d(118, var3_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mf.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var7 = (CharSequence) ((Object) param1);
          var4_int = this.field_g.field_p.a(mh.a(0, var7), 1);
          if (!this.a(var4_int, (byte) 48)) {
            return false;
          }
          var6 = 10 / ((-13 - param2) / 52);
          var8 = (CharSequence) ((Object) param0);
          var5 = this.field_g.field_s[var4_int].a(mh.a(0, var8), 1);
          stackIn_9_0 = this.a(true, var4_int, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("mf.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          if (param0 != -4) {
            this.a(((byte[]) (this.field_j[3]))[3]);
          }
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_g.field_p.a(mh.a(param0 + 4, var6), 1);
          if (!this.a(var4_int, (byte) -113)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_g.field_s[var4_int].a(mh.a(0, var7), 1);
          stackIn_9_0 = this.a(var4_int, (byte) -97, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("mf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final byte[] a(byte param0, String param1, String param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        CharSequence var9 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0)) {
            return null;
          }
          param1 = param1.toLowerCase();
          param2 = param2.toLowerCase();
          var8 = (CharSequence) ((Object) param1);
          var5_int = this.field_g.field_p.a(mh.a(0, var8), 1);
          if (!this.a(var5_int, (byte) 91)) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          var6 = -115 / ((1 - param0) / 58);
          var9 = (CharSequence) ((Object) param2);
          var7 = this.field_g.field_s[var5_int].a(mh.a(0, var9), 1);
          stackIn_7_0 = this.a((byte) 75, param3, var7, var5_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("mf.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = EscapeVector.field_A;
        if (!this.b(0)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_j.length; var4++) {
          if (this.field_g.field_i[var4] > 0) {
            var3 = var3 + this.b(3210, var4);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        if (param0 >= -27) {
          return 107;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final static void a(int param0, c param1) {
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
          mn var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          mn var17 = null;
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
          var12 = EscapeVector.field_A;
          try {
            var13 = (mn) (je.field_a.a(false));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            if (param0 != -20157) {
              field_f = (String[]) null;
            }
            for (var4 = 0; var17.field_i > var4; var4++) {
              if (null != var13.field_r[var4]) {
                if (var13.field_r[var4].field_f == 2) {
                  var13.field_o[var4] = -5;
                }
                if (var13.field_r[var4].field_f == 0) {
                  var3 = 1;
                }
              }
              if (null != var13.field_p[var4]) {
                if (2 == var13.field_p[var4].field_f) {
                  var13.field_o[var4] = -6;
                }
                if (var13.field_p[var4].field_f == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_m;
            param1.a((byte) 125, var17.field_g);
            for (var5 = 0; var5 < var17.field_i; var5++) {
              if (0 != var17.field_o[var5]) {
                param1.f(var17.field_o[var5], -123);
              } else {
                try {
                  var6_int = var17.field_m[var5];
                  if (var6_int != 0) {
                    if (var6_int != 1) {
                      if (var6_int == 2) {
                        var15 = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                        var8 = var15.getModifiers();
                        param1.f(0, -123);
                        param1.a((byte) 125, var8);
                      }
                    } else {
                      var16_ref = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_j[var5]);
                      param1.f(0, -123);
                    }
                  } else {
                    var26 = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                    var8 = var26.getInt((Object) null);
                    param1.f(0, -123);
                    param1.a((byte) 123, var8);
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var17.field_p[var5].field_b);
                    var25 = var17.field_l[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var10_int < var25.length; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.f(0, -123);
                    } else if (var10 instanceof Number) {
                      param1.f(1, param0 + 20034);
                      param1.a(((Number) (var10)).longValue(), (byte) -23);
                    } else if (!(var10 instanceof String)) {
                      param1.f(4, -123);
                    } else {
                      param1.f(2, -123);
                      param1.a((String) (var10), 77);
                    }
                  } else {
                    if (var6_int == 4) {
                      var27 = (java.lang.reflect.Method) (var17.field_p[var5].field_b);
                      var8Lifetime1 = var27.getModifiers();
                      param1.f(0, param0 ^ 20166);
                      param1.a((byte) 124, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.f(-10, -123);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.f(-11, param0 + 20034);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.f(-12, -123);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.f(-13, -123);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.f(-14, -123);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.f(-15, -123);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.f(-16, -123);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.f(-17, -123);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.f(-18, -123);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.f(-19, -123);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.f(-20, -123);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.f(-21, param0 ^ 20166);
                }
              }
            }
            param1.c(var4, param0 ^ 20130);
            var17.c((byte) -38);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_69_0 = var2;
            stackIn_69_1 = new StringBuilder().append("mf.W(").append(param0).append(',');
            if (param1 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_m = null;
        field_d = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 <= 119) {
          c var2 = (c) null;
          mf.a(84, (c) null);
        }
        field_l = null;
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, ed param3, int param4) {
        int var6 = 0;
        int var14 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        Random var17 = null;
        var16 = EscapeVector.field_A;
        try {
          if (param4 > -87) {
            return;
          }
          var17 = new Random();
          param1 = param1 + param3.field_q;
          param0 = param0 + param3.field_v;
          for (var6 = 0; var6 < param3.field_x; var6++) {
            var7 = var17.nextGaussian();
            if (!(var7 > -64.0)) {
              var7 = -64.0;
            }
            if (!(var7 < 64.0)) {
              var7 = 64.0;
            }
            var9 = (int)((double)param2 * var7) + param1;
            var10 = param3.field_s * var6;
            var11 = (var6 + param0) * 640 + var9;
            if (0 <= var9) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = -var9;
            }
            var12 = stackIn_12_0;
            if (640 < param3.field_s + var9) {
              stackIn_15_0 = 640 - var9;
            } else {
              stackIn_15_0 = param3.field_s;
            }
            var13 = stackIn_15_0;
            for (var14 = var12; var14 < var13; var14++) {
              var15 = param3.field_B[var14 + var10];
              if (var15 != 0) {
                em.field_i[var14 + var11] = var15;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("mf.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    private final synchronized void c(int param0, int param1) {
        if (this.field_c) {
          this.field_j[param0] = this.field_i.a((byte) -73, param0);
        } else {
          this.field_j[param0] = bk.a(false, this.field_i.a((byte) -47, param0), 9);
        }
        if (param1 != 14) {
          this.field_g = (f) null;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 < 9) {
          return false;
        }
        if (param1 != -64) {
          field_m = (ed) null;
        }
        if (14 <= param0) {
          return false;
        }
        return true;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param1)) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_p.a(mh.a(param1 + 0, var4), 1);
          stackIn_5_0 = this.b(param1 ^ 3210, var3_int);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("mf.CA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            ((long[]) (((Object[]) (this.field_j[15]))[4]))[3] = ((long[]) (this.field_j[12]))[2];
          }
          if (!this.a(param0, (byte) -121)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_g.field_s[param0].a(mh.a(0, var5), 1);
          if (this.a(var4_int, 11315, param0)) {
            stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("mf.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized byte[] a(byte param0, int[] param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param2, 11315, param3)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((null == this.field_e[param3] ||
            this.field_e[param3][param2] == null) && !this.a(param1, -7951, param2, param3)) {
            this.c(param3, 14);
            if (!this.a(param1, -7951, param2, param3)) {
              stackIn_10_0 = null;
              return (byte[]) (stackIn_10_0);
            }
          }
          if (null == this.field_e[param3]) {
            throw new RuntimeException("");
          }
          if (this.field_e[param3][param2] != null) {
            var7 = fk.a(this.field_e[param3][param2], (byte) -126, false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 != this.field_h) {
              if (2 == this.field_h) {
                this.field_e[param3] = null;
              }
            } else {
              this.field_e[param3][param2] = null;
              if (this.field_g.field_e[param3] == 1) {
                this.field_e[param3] = null;
              }
            }
          }
          if (param0 != 75) {
            this.a(-120);
          }
          stackIn_27_0 = var5;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("mf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw t.a((Throwable) (stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, byte param1) {
        int var3 = -14 % ((-55 - param1) / 56);
        if (!this.b(0)) {
          return false;
        }
        if (param0 >= 0 &&
          param0 < this.field_g.field_e.length &&
          0 != this.field_g.field_e[param0]) {
          return true;
        }
        if (uj.field_d) {
          throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    final synchronized boolean d(int param0, int param1) {
        if (!this.a(param1, (byte) 33)) {
          return false;
        }
        if (param0 < 81) {
          ((byte[]) (this.field_j[11]))[30] = (byte) 8;
        }
        if (this.field_j[param1] != null) {
          return true;
        }
        this.c(param1, 14);
        if (null != this.field_j[param1]) {
          return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param1 ^ param1)) {
          return false;
        }
        if (param2 >= 0 &&
          param0 >= 0 &&
          param2 < this.field_g.field_e.length &&
          param0 < this.field_g.field_e[param2]) {
          return true;
        }
        if (uj.field_d) {
          throw new IllegalArgumentException(param2 + " " + param0);
        }
        return false;
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 >= -102) {
            return false;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_p.a(mh.a(0, var4), 1);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("mf.R(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        int[] var6;
        var5 = EscapeVector.field_A;
        if (!this.b(0)) {
          return false;
        }
        if (param0 != -119) {
          var6 = (int[]) null;
          this.a((byte) -91, (String) null, (String) (this.field_j[0]), (int[]) null);
        }
        var2 = 1;
        for (var3 = 0; var3 < this.field_g.field_d.length; var3++) {
          var4 = this.field_g.field_d[var3];
          if (this.field_j[var4] == null) {
            this.c(var4, 14);
            if (null == this.field_j[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final synchronized int b(int param0, int param1) {
        if (param0 != 3210) {
          mf.c(69);
        }
        if (!this.a(param1, (byte) 48)) {
          return 0;
        }
        if (this.field_j[param1] != null) {
          return 100;
        }
        return this.field_i.a(0, param1);
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        boolean stackIn_37_2 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        n var26 = null;
        byte[] var27 = null;
        n var29 = null;
        n var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var12Lifetime1;
        int var15_intLifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var14_intLifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime4;
        int var18Lifetime3;
        int var19Lifetime2;
        var22 = EscapeVector.field_A;
        try {
          if (!this.a(param3, (byte) 109)) {
            return false;
          }
          if (null == this.field_j[param3]) {
            return false;
          }
          var5_int = this.field_g.field_i[param3];
          var34 = this.field_g.field_a[param3];
          var24 = var34;
          var6 = var24;
          if (this.field_e[param3] == null) {
            array$0 = new Object[this.field_g.field_e[param3]];
            this.field_e[param3] = array$0;
          }
          var7 = this.field_e[param3];
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
            }
            if (var7[var10] != null) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null && (0 != param0[0] ||
            param0[1] != 0 ||
            param0[2] != 0 ||
            param0[3] != 0)) {
            var35 = fk.a(this.field_j[param3], (byte) -116, true);
            var25 = var35;
            var9 = var25;
            var26 = new n(var35);
            var26.a(5, param0, var26.field_g.length, 6528);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = fk.a(this.field_j[param3], (byte) -117, false);
          }
          try {
            if (param1 != -7951) {
              this.a((String) (this.field_j[3]), ((int[]) (this.field_j[2]))[1]);
            }
            var36 = s.a((byte) -26, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (param0 != null);
            throw t.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param3).append(" ").append(var9.length).append(" ").append(ji.a(255, var9.length, var9)).append(" ").append(ji.a(255, -2 + var9.length, var9)).append(" ").append(this.field_g.field_l[param3]).append(" ").append(this.field_g.field_b).toString());
          }
          if (this.field_c) {
            this.field_j[param3] = null;
          }
          if (var5_int > 1) {
            if (this.field_h == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * var5_int * var12;
              var29 = new n(var43);
              var14_int = 0;
              var15_int = 0;
              var29.field_m = var11;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.g(-5053);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (var19 == param2) {
                    var14_int = var14_int + var17;
                    var15_int = var19;
                  }
                }
              }
              if (0 == var14_int) {
                return true;
              }
              var44 = new byte[var14_int];
              var29.field_m = var11;
              var14_intLifetime1 = 0;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var12 > var18Lifetime3; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var29.g(-5053);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (param2 == var21) {
                    qg.a(var43, var17Lifetime4, var44, var14_intLifetime1, var19Lifetime2);
                    var14_intLifetime1 = var14_intLifetime1 + var19Lifetime2;
                  }
                  var17Lifetime4 = var17Lifetime4 + var19Lifetime2;
                }
              }
              var7[var15_int] = var44;
              return true;
            }
            var11 = var36.length;
            var11--;
            var12Lifetime1 = 255 & var23[var11];
            var11 = var11 - var12Lifetime1 * var5_int * 4;
            var31 = new n(var43);
            var31.field_m = var11;
            var39 = new int[var5_int];
            var32 = var39;
            var14 = var32;
            for (var15_intLifetime1 = 0; var15_intLifetime1 < var12Lifetime1; var15_intLifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var31.g(-5053);
                var14[var17Lifetime1] = var14[var17Lifetime1] + var16Lifetime1;
              }
            }
            var40 = new byte[var5_int][];
            var33 = var40;
            var15 = var33;
            for (var16Lifetime2 = 0; var5_int > var16Lifetime2; var16Lifetime2++) {
              array$1 = new byte[var39[var16Lifetime2]];
              var15[var16Lifetime2] = array$1;
              var39[var16Lifetime2] = 0;
            }
            var31.field_m = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var17Lifetime2 < var12Lifetime1; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var5_int > var19Lifetime1; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var31.g(-5053);
                qg.a(var43, var16Lifetime3, var40[var19Lifetime1], var39[var19Lifetime1], var18Lifetime1);
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 != null) {
                var18Lifetime2 = var34[var17Lifetime3];
              } else {
                var18Lifetime2 = var17Lifetime3;
              }
              if (this.field_h == 0) {
                var7[var18Lifetime2] = bk.a(false, var40[var17Lifetime3], n.a(param1, -7944));
              } else {
                var7[var18Lifetime2] = var40[var17Lifetime3];
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.field_h != 0) {
              var7[var11] = var43;
            } else {
              var7[var11] = bk.a(false, var36, 9);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("mf.T(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 != -97) {
          return (byte[]) null;
        }
        return this.a((byte) 75, (int[]) null, param2, param0);
    }

    mf(ob param0, boolean param1, int param2) {
        this.field_g = null;
        try {
          if (0 > param2 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_c = param1 ? true : false;
          this.field_h = param2;
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
          return true;
        }
        if (null == this.field_g) {
          this.field_g = this.field_i.a(29192);
          if (null == this.field_g) {
            return false;
          }
          this.field_j = new Object[this.field_g.field_k];
          this.field_e = new Object[this.field_g.field_k][];
        }
        return true;
    }

    static {
        field_a = new ed(7, 7);
        field_d = new tk();
        field_f = new String[]{"Retrieval - Hard: complete the asteroid<nbsp>levels", "Retrieval - Hard: complete the baked moon<nbsp>levels", "Retrieval - Hard: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Hard", "Retrieval - Hard:<br>get 25,000<nbsp>points", "Retrieval - Hard:<br>get 100,000<nbsp>points", "Retrieval: complete a level with more than 2500<nbsp>fuel", "Retrieval - Hard: destroy an alien laser gate and complete the<nbsp>level", "Blow yourself up at speed in the mothership's auto-shield<nbsp>area", "Retrieval - Hard: complete all levels in under 30<nbsp>minutes", "Retrieval - Hard: complete all levels in under 20<nbsp>minutes", "Retrieval - Hard: collect all power-ups in one<nbsp>session", "Retrieval - Hard: destroy all possible alien infrastructure in one<nbsp>session", "Retrieval - Hard: complete 'Force Matrix Defence', without using the<nbsp>power-up", "Retrieval - Hard: complete 'Seeker Caves', without using your shield or<nbsp>shooting", "Retrieval - Hard: complete 'High-Security Stronghold', destroying no more than four green<nbsp>pods", "Retrieval - Hard: complete 'Seeker Prison Cell', without using your<nbsp>shield", "Land on one of the attractors in 'Force Matrix<nbsp>Defence' in Retrieval", "Retrieval - Normal: complete the asteroid<nbsp>levels", "Retrieval - Normal: complete the baked moon<nbsp>levels", "Retrieval - Normal: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Normal", "Complete the asteroids stage in Retribution", "Complete the sun-baked moon stage in Retribution", "Complete the icy moon stage on Retribution", "Complete the Retribution level set", "Score 350,000 points in Retribution", "Score 800,000 points in Retribution", "Destroy all alien infrastructure in Retribution", "Complete the Simulator level set", "Complete 'Pinball' on Simulator", "Complete 'Anti-gravity' on Simulator"};
        field_k = new hf();
    }
}
