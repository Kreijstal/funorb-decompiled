/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl implements Runnable {
    static int field_i;
    static String field_h;
    private DataInputStream field_f;
    private th field_g;
    private af field_d;
    static int[][] field_k;
    static String field_n;
    private java.net.URL field_b;
    static float[] field_m;
    static String field_j;
    private int field_c;
    private af field_a;
    private af field_e;
    private ib field_l;

    final static void a(int[] param0, byte param1, int param2, int param3) {
        int var5 = 0;
        da var6 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = HoldTheLine.field_D;
        try {
          gf.a();
          gf.a(param0, 0, param0.length);
          gf.c();
          if (param1 >= -53) {
            var6 = (da) null;
            dl.a(20, (da) null);
          }
          stackIn_5_0 = gf.d();
          while (stackIn_5_0) {
            tc.c(gf.field_g, gf.field_a, gf.field_b - gf.field_g, param3, param2);
            stackIn_5_0 = gf.d();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("dl.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Throwable var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = HoldTheLine.field_D;
          try {
            while (this.field_g.field_l < this.field_g.field_i.length) {
              var1_int = this.field_f.read(this.field_g.field_i, this.field_g.field_l, -this.field_g.field_l + this.field_g.field_i.length);
              if (var1_int >= 0) {
                this.field_g.field_l = this.field_g.field_l + var1_int;
                continue;
              }
              break;
            }
            if (this.field_g.field_l == this.field_g.field_i.length) {
              throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_g.field_i.length + " " + this.field_b));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_c = 3;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2_ref = this;
            synchronized (var2_ref) {
              this.finalize();
              this.field_c = this.field_c + 1;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static hj a(gn param0, String param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.c(param1, 3);
          var5 = param0.a(var4_int, param3, param2);
          stackIn_1_0 = ll.a(-1, var5, var4_int, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("dl.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_c >= 2) {
          return true;
        }
        if (this.field_c == 0) {
          if (this.field_a == null) {
            this.field_a = this.field_l.a(this.field_b, 0);
          }
          if (0 == this.field_a.field_d) {
            return false;
          }
          if (this.field_a.field_d != 1) {
            this.field_c = this.field_c + 1;
            this.field_a = null;
            return false;
          }
        }
        if (param0 < 57) {
          return false;
        }
        if (1 == this.field_c) {
          if (null == this.field_d) {
            this.field_d = this.field_l.a(0, 443, this.field_b.getHost());
          }
          if (0 == this.field_d.field_d) {
            return false;
          }
          if (this.field_d.field_d != 1) {
            this.field_c = this.field_c + 1;
            this.field_d = null;
            return false;
          }
        }
        if (this.field_f == null) {
          try {
            if (0 == this.field_c) {
              this.field_f = (DataInputStream) (this.field_a.field_b);
            }
            if (this.field_c == 1) {
              var4 = (java.net.Socket) (this.field_d.field_b);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_b.getFile() + "\n\n"));
              var3.write(sj.a((byte) -103, var5));
              this.field_f = new DataInputStream(var4.getInputStream());
            }
            this.field_g.field_l = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_c = this.field_c + 1;
          }
        }
        if (this.field_e == null) {
          this.field_e = this.field_l.a((byte) -28, 5, (Runnable) (this));
        }
        if (this.field_e.field_d == 0) {
          return false;
        }
        if (1 == this.field_e.field_d) {
          return false;
        }
        this.finalize();
        this.field_c = this.field_c + 1;
        return false;
    }

    public static void a(int param0) {
        field_n = null;
        field_h = null;
        int var1 = -122 % ((param0 - 50) / 38);
        field_m = null;
        field_k = (int[][]) null;
        field_j = null;
    }

    final static void a(int param0, da param1) {
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
          ki var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          Object var17 = null;
          java.lang.reflect.Field var17_ref = null;
          ki var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var20 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var17 = null;
          var16 = null;
          var20 = null;
          var22 = null;
          var12 = HoldTheLine.field_D;
          try {
            var13 = (ki) (sl.field_b.b((byte) 96));
            var18 = var13;
            if (var18 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var18.field_p > var4; var4++) {
              if (null != var13.field_k[var4]) {
                if (var13.field_k[var4].field_d == 2) {
                  var13.field_r[var4] = -5;
                }
                if (var13.field_k[var4].field_d == 0) {
                  var3 = 1;
                }
              }
              if (null != var13.field_l[var4]) {
                if (var13.field_l[var4].field_d == 2) {
                  var13.field_r[var4] = -6;
                }
                if (var13.field_l[var4].field_d == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_l;
            param1.a((byte) -58, var18.field_n);
            for (var5 = param0; var5 < var18.field_p; var5++) {
              if (0 == var18.field_r[var5]) {
                try {
                  var6_int = var18.field_m[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var18.field_k[var5].field_b);
                    var8 = var15.getInt((Object) null);
                    param1.f(111, 0);
                    param1.a((byte) -58, var8);
                  } else {
                    if (var6_int != 1) {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var18.field_k[var5].field_b);
                        var8 = var26.getModifiers();
                        param1.f(111, 0);
                        param1.a((byte) -58, var8);
                      }
                    } else {
                      var17_ref = (java.lang.reflect.Field) (var18.field_k[var5].field_b);
                      var19 = var17_ref;
                      var19.setInt((Object) null, var18.field_j[var5]);
                      param1.f(111, 0);
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var18.field_l[var5].field_b);
                    var25 = var18.field_q[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.f(111, 0);
                    } else if (var10 instanceof Number) {
                      param1.f(param0 ^ 111, 1);
                      param1.a((byte) -84, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param1.f(111, 4);
                    } else {
                      param1.f(111, 2);
                      param1.c(param0 ^ 82, (String) (var10));
                    }
                  } else {
                    if (4 == var6_int) {
                      var27 = (java.lang.reflect.Method) (var18.field_l[var5].field_b);
                      var8Lifetime1 = var27.getModifiers();
                      param1.f(111, 0);
                      param1.a((byte) -58, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.f(param0 + 111, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.f(111, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.f(param0 + 111, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.f(111, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.f(param0 + 111, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.f(111, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.f(111, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.f(param0 ^ 111, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.f(111, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.f(111, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.f(param0 ^ 111, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.f(111, -21);
                }
              } else {
                param1.f(111, var18.field_r[var5]);
              }
            }
            param1.a(var4, (byte) 47);
            var18.d(param0 + 0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_69_0 = var2;
            stackIn_69_1 = new StringBuilder().append("dl.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        if (null != this.field_a) {
          if (null != this.field_a.field_b) {
            try {
              ((DataInputStream) (this.field_a.field_b)).close();
            } catch (Exception exception) {
            }
          }
          this.field_a = null;
        }
        if (null != this.field_d) {
          if (null != this.field_d.field_b) {
            try {
              ((java.net.Socket) (this.field_d.field_b)).close();
            } catch (Exception exception) {
            }
          }
          this.field_d = null;
        }
        if (this.field_f != null) {
          try {
            this.field_f.close();
          } catch (Exception exception) {
          }
          this.field_f = null;
        }
        this.field_e = null;
    }

    final th b(byte param0) {
        if (param0 < 65) {
          this.b((byte) -33);
        }
        if (this.field_c == 3) {
          return this.field_g;
        }
        return null;
    }

    dl(ib param0, java.net.URL param1, int param2) {
        try {
          this.field_l = param0;
          this.field_b = param1;
          this.field_g = new th(param2);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_i = 0;
        field_n = "Quit to website";
        field_k = new int[14][];
        field_k[1] = new int[]{2, 18, 19, 17, 16, 7};
        field_k[13] = new int[]{22, 23};
        field_k[6] = new int[]{3};
        field_k[3] = new int[]{24};
        field_k[9] = new int[]{4};
        field_k[7] = new int[]{5};
        field_k[8] = new int[]{0};
        field_k[0] = new int[]{12, 15, 18, 19, 17, 13, 14, 1};
        field_k[12] = new int[]{};
        field_k[5] = new int[]{25};
        field_k[10] = new int[]{8};
        field_k[4] = new int[]{25, 26};
        field_k[2] = new int[]{24};
        field_k[11] = new int[]{};
        field_m = new float[]{1.0f, 2.0f, 2.0f, 2.0f};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
