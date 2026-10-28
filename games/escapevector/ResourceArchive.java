/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ResourceArchive {
    private ArchiveProvider field_i;
    private boolean field_c;
    static Sprite field_a;
    private int field_h;
    private Object[][] field_e;
    private ArchiveIndex field_g;
    private Object[] field_j;
    static tk field_d;
    static int[] field_l;
    static String field_b;
    static String[] field_f;
    static hf field_k;
    static Sprite field_m;

    final static int b(int param0, int param1, int param2) {
        if (param2 != -2) {
          return 21;
        }
        return ni.a(param0, param1, false, TerrainMaskSupport.field_b);
    }

    final int b(int param0, String param1) {
        String stackIn_14_2 = null;
        try {
          if (!this.b(0)) {
            int stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param0 != -1) {
            ResourceArchive.b(((int[]) (this.field_j[2]))[27], ((int[]) (this.field_j[15]))[0], ((int[]) (this.field_j[6]))[30]);
          }
          param1 = param1.toLowerCase();
          CharSequence var4 = (CharSequence) ((Object) param1);
          int var3_int = this.field_g.field_p.find(mh.a(param0 + 1, var4), 1);
          if (this.a(var3_int, (byte) -124)) {
            int stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          int stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("mf.P(").append(param0).append(',');
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
          field_a = (Sprite) null;
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
        String stackIn_18_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          String var3 = cf.a(param1, 81, param2);
          if (var3 != null) {
            String stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          int var4 = 0;
          if (!param0) {
            String stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          while (var4 < param2.length()) {
            if (!fn.a(param2.charAt(var4), (byte) -124)) {
              String stackIn_12_0 = Js5NetworkRequest.field_B;
              return stackIn_12_0;
            }
            var4++;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var3_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("mf.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean a(int param0, String param1) {
        String stackIn_8_2 = null;
        try {
          if (!this.b(0)) {
            return false;
          }
          param1 = param1.toLowerCase();
          CharSequence var4 = (CharSequence) ((Object) param1);
          int var3_int = this.field_g.field_p.find(mh.a(param0, var4), 1);
          boolean stackIn_4_0 = this.d(118, var3_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("mf.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(String param0, String param1, byte param2) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          if (!this.b(0)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          CharSequence var7 = (CharSequence) ((Object) param1);
          int var4_int = this.field_g.field_p.find(mh.a(0, var7), 1);
          if (!this.a(var4_int, (byte) 48)) {
            return false;
          }
          int var6 = 10 / ((-13 - param2) / 52);
          CharSequence var8 = (CharSequence) ((Object) param0);
          int var5 = this.field_g.field_s[var4_int].find(mh.a(0, var8), 1);
          boolean stackIn_9_0 = this.a(true, var4_int, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4;
          StringBuilder stackIn_12_1 = new StringBuilder().append("mf.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          if (!this.b(0)) {
            Object stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          if (param0 != -4) {
            this.a(((byte[]) (this.field_j[3]))[3]);
          }
          CharSequence var6 = (CharSequence) ((Object) param2);
          int var4_int = this.field_g.field_p.find(mh.a(param0 + 4, var6), 1);
          if (!this.a(var4_int, (byte) -113)) {
            return null;
          }
          CharSequence var7 = (CharSequence) ((Object) param1);
          int var5 = this.field_g.field_s[var4_int].find(mh.a(0, var7), 1);
          byte[] stackIn_9_0 = this.a(var4_int, (byte) -97, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4;
          StringBuilder stackIn_12_1 = new StringBuilder().append("mf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final byte[] a(byte param0, String param1, String param2, int[] param3) {
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          if (!this.b(0)) {
            return null;
          }
          param1 = param1.toLowerCase();
          param2 = param2.toLowerCase();
          CharSequence var8 = (CharSequence) ((Object) param1);
          int var5_int = this.field_g.field_p.find(mh.a(0, var8), 1);
          if (!this.a(var5_int, (byte) 91)) {
            Object stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          int var6 = -115 / ((1 - param0) / 58);
          CharSequence var9 = (CharSequence) ((Object) param2);
          int var7 = this.field_g.field_s[var5_int].find(mh.a(0, var9), 1);
          byte[] stackIn_7_0 = this.a((byte) 75, param3, var7, var5_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var5;
          StringBuilder stackIn_10_1 = new StringBuilder().append("mf.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized int a(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        if (!this.b(0)) {
          return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field_j.length; var4++) {
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
        int var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final static void a(int param0, CipherPacketBuffer param1) {
        try {
          String stackIn_70_2 = null;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var8 = 0;
          Object var18 = null;
          Object var16 = null;
          Object var20 = null;
          Object var22 = null;
          int var12 = EscapeVector.obfuscationControl;
          try {
            mn var13 = (mn) (je.field_a.first(false));
            mn var17 = var13;
            if (var17 == null) {
              return;
            }
            boolean var3 = false;
            if (param0 != -20157) {
              field_f = (String[]) null;
            }
            for (var4 = 0; var17.field_i > var4; var4++) {
              if (null != var13.field_r[var4]) {
                if (var13.field_r[var4].field_f == 2) {
                  var13.field_o[var4] = -5;
                }
                if (var13.field_r[var4].field_f == 0) {
                  var3 = true;
                }
              }
              if (null != var13.field_p[var4]) {
                if (2 == var13.field_p[var4].field_f) {
                  var13.field_o[var4] = -6;
                }
                if (var13.field_p[var4].field_f == 0) {
                  var3 = true;
                }
              }
            }
            if (var3) {
              return;
            }
            var4 = param1.position;
            param1.a((byte) 125, var17.field_g);
            for (int var5 = 0; var5 < var17.field_i; var5++) {
              if (0 != var17.field_o[var5]) {
                param1.f(var17.field_o[var5], -123);
              } else {
                try {
                  int var6_int = var17.field_m[var5];
                  if (var6_int == 0) {
                    java.lang.reflect.Field var26 = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                    var8 = var26.getInt((Object) null);
                    param1.f(0, -123);
                    param1.a((byte) 123, var8);
                  } else if (var6_int == 1) {
                    java.lang.reflect.Field var16_ref = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                    java.lang.reflect.Field var19 = var16_ref;
                    var19.setInt((Object) null, var17.field_j[var5]);
                    param1.f(0, -123);
                  } else if (var6_int == 2) {
                    java.lang.reflect.Field var15 = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                    var8 = var15.getModifiers();
                    param1.f(0, -123);
                    param1.a((byte) 125, var8);
                  }
                  if (var6_int == 3) {
                    java.lang.reflect.Method var28 = (java.lang.reflect.Method) (var17.field_p[var5].field_b);
                    byte[][] var25 = var17.field_l[var5];
                    Object[] var9 = new Object[var25.length];
                    for (int var10_int = 0; var10_int < var25.length; var10_int++) {
                      ObjectInputStream var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    Object var10 = var28.invoke((Object) null, var9);
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
                  } else if (var6_int == 4) {
                    java.lang.reflect.Method var27 = (java.lang.reflect.Method) (var17.field_p[var5].field_b);
                    int var8Lifetime1 = var27.getModifiers();
                    param1.f(0, param0 ^ 20166);
                    param1.a((byte) 124, var8Lifetime1);
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  ClassNotFoundException var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.f(-10, -123);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  InvalidClassException var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.f(-11, param0 + 20034);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  StreamCorruptedException var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.f(-12, -123);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  OptionalDataException var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.f(-13, -123);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  IllegalAccessException var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.f(-14, -123);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  IllegalArgumentException var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.f(-15, -123);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  java.lang.reflect.InvocationTargetException var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.f(-16, -123);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  SecurityException var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.f(-17, -123);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  IOException var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.f(-18, -123);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  NullPointerException var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.f(-19, -123);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  Exception var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.f(-20, -123);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  Throwable var6_ref11 = decompiledCaughtException;
                  param1.f(-21, param0 ^ 20166);
                }
              }
            }
            param1.c(var4, param0 ^ 20130);
            var17.unlink((byte) -38);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            RuntimeException var2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_69_0 = var2;
            StringBuilder stackIn_69_1 = new StringBuilder().append("mf.W(").append(param0).append(',');
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
          CipherPacketBuffer var2 = (CipherPacketBuffer) null;
          ResourceArchive.a(84, (CipherPacketBuffer) null);
        }
        field_l = null;
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, Sprite param3, int param4) {
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        String stackIn_26_2 = null;
        int var16 = EscapeVector.obfuscationControl;
        try {
          if (param4 > -87) {
            return;
          }
          Random var17 = new Random();
          param1 = param1 + param3.offsetX;
          param0 = param0 + param3.offsetY;
          for (int var6 = 0; var6 < param3.height; var6++) {
            double var7 = var17.nextGaussian();
            if (!(var7 > -64.0)) {
              var7 = -64.0;
            }
            if (!(var7 < 64.0)) {
              var7 = 64.0;
            }
            int var9 = (int)((double)param2 * var7) + param1;
            int var10 = param3.width * var6;
            int var11 = (var6 + param0) * 640 + var9;
            stackIn_12_0 = (0 <= var9) ? (0) : (-var9);
            int var12 = stackIn_12_0;
            if (640 < param3.width + var9) {
              stackIn_15_0 = 640 - var9;
            } else {
              stackIn_15_0 = param3.width;
            }
            int var13 = stackIn_15_0;
            for (int var14 = var12; var14 < var13; var14++) {
              int var15 = param3.pixels[var14 + var10];
              if (var15 != 0) {
                SoftwareRasterizer.pixels[var14 + var11] = var15;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_25_0 = var5;
          StringBuilder stackIn_25_1 = new StringBuilder().append("mf.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          this.field_j[param0] = this.field_i.getEncodedGroup((byte) -73, param0);
        } else {
          this.field_j[param0] = bk.a(false, this.field_i.getEncodedGroup((byte) -47, param0), 9);
        }
        if (param1 != 14) {
          this.field_g = (ArchiveIndex) null;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 < 9) {
          return false;
        }
        if (param1 != -64) {
          field_m = (Sprite) null;
        }
        if (14 <= param0) {
          return false;
        }
        return true;
    }

    final int a(String param0, int param1) {
        String stackIn_9_2 = null;
        try {
          if (!this.b(param1)) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          CharSequence var4 = (CharSequence) ((Object) param0);
          int var3_int = this.field_g.field_p.find(mh.a(param1 + 0, var4), 1);
          int stackIn_5_0 = this.b(param1 ^ 3210, var3_int);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("mf.CA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, String param1, boolean param2) {
        String stackIn_14_2 = null;
        try {
          if (!param2) {
            ((long[]) (((Object[]) (this.field_j[15]))[4]))[3] = ((long[]) (this.field_j[12]))[2];
          }
          if (!this.a(param0, (byte) -121)) {
            int stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          CharSequence var5 = (CharSequence) ((Object) param1);
          int var4_int = this.field_g.field_s[param0].find(mh.a(0, var5), 1);
          if (this.a(var4_int, 11315, param0)) {
            int stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          int stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var4;
          StringBuilder stackIn_13_1 = new StringBuilder().append("mf.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized byte[] a(byte param0, int[] param1, int param2, int param3) {
        String stackIn_31_2 = null;
        Object var5 = null;
        try {
          if (!this.a(param2, 11315, param3)) {
            Object stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((null == this.field_e[param3] ||
            this.field_e[param3][param2] == null) && !this.a(param1, -7951, param2, param3)) {
            this.c(param3, 14);
            if (!this.a(param1, -7951, param2, param3)) {
              Object stackIn_10_0 = null;
              return (byte[]) (stackIn_10_0);
            }
          }
          if (null == this.field_e[param3]) {
            throw new RuntimeException("");
          }
          if (this.field_e[param3][param2] != null) {
            byte[] var7 = fk.a(this.field_e[param3][param2], (byte) -126, false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 == this.field_h) {
              this.field_e[param3][param2] = null;
              if (this.field_g.field_e[param3] == 1) {
                this.field_e[param3] = null;
              }
            } else if (2 == this.field_h) {
              this.field_e[param3] = null;
            }
          }
          if (param0 != 75) {
            this.a(-120);
          }
          Object stackIn_27_0 = var5;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          Object stackIn_30_0 = var5;
          StringBuilder stackIn_30_1 = new StringBuilder().append("mf.J(").append(param0).append(',');
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
        String stackIn_14_2 = null;
        try {
          if (!this.b(0)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 >= -102) {
            return false;
          }
          CharSequence var4 = (CharSequence) ((Object) param0);
          int var3_int = this.field_g.field_p.find(mh.a(0, var4), 1);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("mf.R(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0) {
        int var5 = EscapeVector.obfuscationControl;
        if (!this.b(0)) {
          return false;
        }
        if (param0 != -119) {
          int[] var6 = (int[]) null;
          this.a((byte) -91, (String) null, (String) (this.field_j[0]), (int[]) null);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field_g.field_d.length; var3++) {
          int var4 = this.field_g.field_d[var3];
          if (this.field_j[var4] == null) {
            this.c(var4, 14);
            if (null == this.field_j[var4]) {
              var2 = false;
            }
          }
        }
        return (var2);
    }

    final synchronized int b(int param0, int param1) {
        if (param0 != 3210) {
          ResourceArchive.c(69);
        }
        if (!this.a(param1, (byte) 48)) {
          return 0;
        }
        if (this.field_j[param1] != null) {
          return 100;
        }
        return this.field_i.groupProgress(0, param1);
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var19 = 0;
        int var21 = 0;
        byte[] var23 = null;
        byte[] var36 = null;
        byte[] var43 = null;
        int var18Lifetime2;
        int var22 = EscapeVector.obfuscationControl;
        try {
          if (!this.a(param3, (byte) 109)) {
            return false;
          }
          if (null == this.field_j[param3]) {
            return false;
          }
          int var5_int = this.field_g.field_i[param3];
          int[] var34 = this.field_g.field_a[param3];
          int[] var24 = var34;
          int[] var6 = var24;
          if (this.field_e[param3] == null) {
            Object[] array$0 = new Object[this.field_g.field_e[param3]];
            this.field_e[param3] = array$0;
          }
          Object[] var7 = this.field_e[param3];
          boolean var8 = true;
          for (int var9_int = 0; var9_int < var5_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
            }
            if (var7[var10] != null) {
              continue;
            }
            var8 = false;
            break;
          }
          if (var8) {
            return true;
          }
          if (param0 != null && (0 != param0[0] ||
            param0[1] != 0 ||
            param0[2] != 0 ||
            param0[3] != 0)) {
            byte[] var35 = fk.a(this.field_j[param3], (byte) -116, true);
            byte[] var25 = var35;
            var9 = var25;
            PacketBuffer var26 = new PacketBuffer(var35);
            var26.a(5, param0, var26.payload.length, 6528);
            boolean decompiledFrameRemainder0 = false;
          }
          else {
            var9 = fk.a(this.field_j[param3], (byte) -117, false);
          }
          try {
            if (param1 != -7951) {
              this.a((String) (this.field_j[3]), ((int[]) (this.field_j[2]))[1]);
            }
            var36 = Js5NetworkRequest.a((byte) -26, var9);
            byte[] var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            RuntimeException var11_ref_RuntimeException = decompiledCaughtException;
            RuntimeException stackIn_36_0 = var11_ref_RuntimeException;
            StringBuilder stackIn_36_1 = new StringBuilder();
            boolean stackIn_37_2 = (param0 != null);
            throw t.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param3).append(" ").append(var9.length).append(" ").append(ji.a(255, var9.length, var9)).append(" ").append(ji.a(255, -2 + var9.length, var9)).append(" ").append(this.field_g.field_l[param3]).append(" ").append(this.field_g.field_b).toString());
          }
          if (this.field_c) {
            this.field_j[param3] = null;
          }
          if (var5_int > 1) {
            if (this.field_h == 2) {
              var11 = var36.length;
              var11--;
              int var12 = 255 & var23[var11];
              var11 = var11 - 4 * var5_int * var12;
              PacketBuffer var29 = new PacketBuffer(var43);
              int var14_int = 0;
              int var15_int = 0;
              var29.position = var11;
              for (int var16 = 0; var16 < var12; var16++) {
                int var17 = 0;
                for (int var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.readInt(-5053);
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
              byte[] var44 = new byte[var14_int];
              var29.position = var11;
              int var14_intLifetime1 = 0;
              int var17Lifetime4 = 0;
              for (int var18Lifetime3 = 0; var12 > var18Lifetime3; var18Lifetime3++) {
                int var19Lifetime2 = 0;
                for (int var20 = 0; var5_int > var20; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var29.readInt(-5053);
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
            int var12Lifetime1 = 255 & var23[var11];
            var11 = var11 - var12Lifetime1 * var5_int * 4;
            PacketBuffer var31 = new PacketBuffer(var43);
            var31.position = var11;
            int[] var39 = new int[var5_int];
            int[] var32 = var39;
            int[] var14 = var32;
            for (int var15_intLifetime1 = 0; var15_intLifetime1 < var12Lifetime1; var15_intLifetime1++) {
              int var16Lifetime1 = 0;
              for (int var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var31.readInt(-5053);
                var14[var17Lifetime1] = var14[var17Lifetime1] + var16Lifetime1;
              }
            }
            byte[][] var40 = new byte[var5_int][];
            byte[][] var33 = var40;
            byte[][] var15 = var33;
            for (int var16Lifetime2 = 0; var5_int > var16Lifetime2; var16Lifetime2++) {
              byte[] array$1 = new byte[var39[var16Lifetime2]];
              var15[var16Lifetime2] = array$1;
              var39[var16Lifetime2] = 0;
            }
            var31.position = var11;
            int var16Lifetime3 = 0;
            for (int var17Lifetime2 = 0; var17Lifetime2 < var12Lifetime1; var17Lifetime2++) {
              int var18Lifetime1 = 0;
              for (int var19Lifetime1 = 0; var5_int > var19Lifetime1; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var31.readInt(-5053);
                qg.a(var43, var16Lifetime3, var40[var19Lifetime1], var39[var19Lifetime1], var18Lifetime1);
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
              }
            }
            for (int var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 != null) {
                var18Lifetime2 = var34[var17Lifetime3];
              } else {
                var18Lifetime2 = var17Lifetime3;
              }
              if (this.field_h == 0) {
                var7[var18Lifetime2] = bk.a(false, var40[var17Lifetime3], PacketBuffer.a(param1, -7944));
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
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_104_0 = var5;
          StringBuilder stackIn_104_1 = new StringBuilder().append("mf.T(");
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

    ResourceArchive(ArchiveProvider param0, boolean param1, int param2) {
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
          this.field_g = this.field_i.getIndex(29192);
          if (null == this.field_g) {
            return false;
          }
          this.field_j = new Object[this.field_g.field_k];
          this.field_e = new Object[this.field_g.field_k][];
        }
        return true;
    }

    static {
        field_a = new Sprite(7, 7);
        field_d = new tk();
        field_f = new String[]{"Retrieval - Hard: complete the asteroid<nbsp>levels", "Retrieval - Hard: complete the baked moon<nbsp>levels", "Retrieval - Hard: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Hard", "Retrieval - Hard:<br>get 25,000<nbsp>points", "Retrieval - Hard:<br>get 100,000<nbsp>points", "Retrieval: complete a level with more than 2500<nbsp>fuel", "Retrieval - Hard: destroy an alien laser gate and complete the<nbsp>level", "Blow yourself up at speed in the mothership's auto-shield<nbsp>area", "Retrieval - Hard: complete all levels in under 30<nbsp>minutes", "Retrieval - Hard: complete all levels in under 20<nbsp>minutes", "Retrieval - Hard: collect all power-ups in one<nbsp>session", "Retrieval - Hard: destroy all possible alien infrastructure in one<nbsp>session", "Retrieval - Hard: complete 'Force Matrix Defence', without using the<nbsp>power-up", "Retrieval - Hard: complete 'Seeker Caves', without using your shield or<nbsp>shooting", "Retrieval - Hard: complete 'High-Security Stronghold', destroying no more than four green<nbsp>pods", "Retrieval - Hard: complete 'Seeker Prison Cell', without using your<nbsp>shield", "Land on one of the attractors in 'Force Matrix<nbsp>Defence' in Retrieval", "Retrieval - Normal: complete the asteroid<nbsp>levels", "Retrieval - Normal: complete the baked moon<nbsp>levels", "Retrieval - Normal: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Normal", "Complete the asteroids stage in Retribution", "Complete the sun-baked moon stage in Retribution", "Complete the icy moon stage on Retribution", "Complete the Retribution level set", "Score 350,000 points in Retribution", "Score 800,000 points in Retribution", "Destroy all alien infrastructure in Retribution", "Complete the Simulator level set", "Complete 'Pinball' on Simulator", "Complete 'Anti-gravity' on Simulator"};
        field_k = new hf();
    }
}
