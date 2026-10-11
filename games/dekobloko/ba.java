/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ba implements nb {
    static um field_f;
    static String field_e;
    private long field_a;
    static wl field_b;
    static int field_d;
    static boolean field_c;

    public final void c(byte param0) {
        if (param0 != -51) {
          this.field_a = -32L;
        }
        this.field_a = ik.a(param0 + 55);
    }

    final static boolean a(ji param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2147483648) {
            field_f = (um) null;
          }
          stackIn_3_0 = param0.a(false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ba.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract String e(byte param0);

    public static void d(byte param0) {
        field_f = null;
        field_e = null;
        if (param0 < 70) {
          return;
        }
        field_b = null;
    }

    public final String b(byte param0) {
        if (this.a((byte) -101)) {
          return null;
        }
        if (param0 < 52) {
          return (String) null;
        }
        if (ik.a(4) < (350L + this.field_a)) {
          return null;
        }
        return this.e((byte) 49);
    }

    abstract tb b(int param0);

    final static void a(int param0, uf param1) {
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
          kl var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          kl var17 = null;
          Object var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var21 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var18 = null;
          var16 = null;
          var21 = null;
          var22 = null;
          var12 = client.field_A ? 1 : 0;
          try {
            var13 = (kl) (aa.field_f.c((byte) -54));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            if (param0 != -32141) {
              return;
            }
            for (var4 = 0; var17.field_o > var4; var4++) {
              if (var13.field_y[var4] != null) {
                if (var13.field_y[var4].field_c == 2) {
                  var13.field_A[var4] = -5;
                }
                if (var13.field_y[var4].field_c == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_t[var4] != null) {
                if (var13.field_t[var4].field_c == 2) {
                  var13.field_A[var4] = -6;
                }
                if (var13.field_t[var4].field_c == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_n;
            param1.a(var17.field_C, false);
            for (var5 = 0; var5 < var17.field_o; var5++) {
              if (0 == var17.field_A[var5]) {
                try {
                  var6_int = var17.field_u[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var17.field_y[var5].field_b);
                    var8 = var15.getInt((Object) null);
                    param1.a(true, 0);
                    param1.a(var8, false);
                  } else {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_y[var5].field_b);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_q[var5]);
                      param1.a(true, 0);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.field_y[var5].field_b);
                        var8 = var26.getModifiers();
                        param1.a(true, 0);
                        param1.a(var8, false);
                      }
                    }
                  }
                  if (3 == var6_int) {
                    var27 = (java.lang.reflect.Method) (var17.field_t[var5].field_b);
                    var25 = var17.field_s[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var10_int < var25.length; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var27.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.a(true, 0);
                    } else if (var10 instanceof Number) {
                      param1.a(true, 1);
                      param1.a(((Number) (var10)).longValue(), (byte) 0);
                    } else if (!(var10 instanceof String)) {
                      param1.a(true, 4);
                    } else {
                      param1.a(true, 2);
                      param1.a(0, (String) (var10));
                    }
                  } else {
                    if (4 == var6_int) {
                      var28 = (java.lang.reflect.Method) (var17.field_t[var5].field_b);
                      var8Lifetime1 = var28.getModifiers();
                      param1.a(true, 0);
                      param1.a(var8Lifetime1, false);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.a(true, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.a(true, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.a(true, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.a(true, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.a(true, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.a(true, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.a(true, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.a(true, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.a(true, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.a(true, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.a(true, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.a(true, -21);
                }
              } else {
                param1.a(true, var17.field_A[var5]);
              }
            }
            param1.a((byte) -15, var4);
            var17.b((byte) 103);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_69_0 = var2;
            stackIn_69_1 = new StringBuilder().append("ba.V(").append(param0).append(',');
            if (param1 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final tb a(int param0) {
        if (this.a((byte) 119)) {
          return ki.field_t;
        }
        if (param0 != 20350) {
          ba.a(-21, -85, -33);
        }
        if (!(ik.a(4) >= this.field_a + 350L)) {
          return le.field_o;
        }
        return this.b(param0 - 25870);
    }

    final static void a(int param0, int param1, int param2) {
        if (null == db.field_b ||
          !(db.field_b.length >= param1)) {
          db.field_b = new int[2 * param1];
        }
        if (ad.field_i == null ||
          !(ad.field_i.length >= param1)) {
          ad.field_i = new int[param1 * 2];
        }
        if (oa.field_e == null ||
          !(oa.field_e.length >= param1)) {
          oa.field_e = new int[2 * param1];
        }
        if (ln.field_a == null ||
          !(param1 <= ln.field_a.length)) {
          ln.field_a = new int[2 * param1];
        }
        if (null == mk.field_b ||
          !(param1 <= mk.field_b.length)) {
          mk.field_b = new int[2 * param1];
        }
        if (null == cc.field_h ||
          !(cc.field_h.length >= param1)) {
          cc.field_h = new int[param1 * 2];
        }
        if (null == ch.field_a ||
          !(ch.field_a.length >= param1 + param2)) {
          ch.field_a = new int[(param2 + param1) * 2];
        }
        if (null == oe.field_L ||
          !(oe.field_L.length >= param1)) {
          oe.field_L = new boolean[2 * param1];
        }
        ge.field_b = 2147483647;
        bg.field_d = -2147483648;
        og.field_eb = 0;
        mf.field_Q = param0;
        rf.field_g = -2147483648;
    }

    static {
        field_e = "Players";
        field_f = new um();
    }
}
