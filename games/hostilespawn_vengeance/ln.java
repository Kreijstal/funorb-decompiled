/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ln {
    private int field_k;
    private String field_r;
    static bl field_l;
    private long field_d;
    int field_e;
    String field_s;
    int field_i;
    static id field_a;
    static bd field_g;
    static bd field_j;
    static String field_h;
    static bd field_c;
    static String field_p;
    int[] field_o;
    int field_f;
    static int field_q;
    static bd[] field_m;
    static boolean[] field_b;
    private boolean field_n;

    final static void a(ca param0, byte param1, int param2, boolean param3, boolean param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          he.field_s[0] = jk.field_b.nextInt();
          he.field_s[1] = jk.field_b.nextInt();
          he.field_s[3] = (int)d.field_y;
          he.field_s[2] = (int)(d.field_y >> 32);
          ob.field_s.field_i = 0;
          ob.field_s.b(he.field_s[0], param1 ^ -25324);
          ob.field_s.b(he.field_s[1], param1 ^ -25324);
          if (param1 != -73) {
            return;
          }
          ob.field_s.b(he.field_s[2], 25251);
          ob.field_s.b(he.field_s[3], 25251);
          f.a(24, ob.field_s);
          ob.field_s.a((byte) -128, param2);
          param0.a(ob.field_s, -99);
          s.field_b.field_i = 0;
          if (!param3) {
            s.field_b.d(param1 ^ -41, 16);
          } else {
            s.field_b.d(120, 18);
          }
          s.field_b.field_i = s.field_b.field_i + 2;
          var5_int = s.field_b.field_i;
          s.field_b.b(le.field_bb, 25251);
          s.field_b.b(9201, vi.field_l);
          var6 = 0;
          if (wc.field_g) {
            var6 = var6 | 1;
          }
          if (sd.field_u) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (fl.field_b != null) {
            var6 = var6 | 16;
          }
          s.field_b.d(param1 + 185, var6);
          var7 = de.a(-110, bn.c(-1));
          if (var7 == null) {
            var7 = "";
          }
          s.field_b.a(var7, param1 ^ -73);
          if (fl.field_b != null) {
            s.field_b.a(122, fl.field_b);
          }
          ml.a(s.field_b, nb.field_L, 0, lm.field_z, ob.field_s);
          s.field_b.a(true, -var5_int + s.field_b.field_i);
          mb.d(-1, -22370);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ln.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_l = null;
        field_a = null;
        if (param0 != 31311) {
          field_g = (bd) null;
        }
        field_h = null;
        field_c = null;
        field_g = null;
        field_m = null;
        field_p = null;
        field_j = null;
    }

    final static void a(en param0, byte param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_66_0 = null;
          StringBuilder stackIn_66_1 = null;
          String stackIn_67_2 = null;
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
          ng var13 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          ng var17 = null;
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
          var12 = HostileSpawn.field_I ? 1 : 0;
          try {
            var13 = (ng) (td.field_o.g(-97));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var17.field_t > var4; var4++) {
              if (null != var13.field_r[var4]) {
                if (var13.field_r[var4].field_f == 2) {
                  var13.field_m[var4] = -5;
                }
                if (var13.field_r[var4].field_f == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_j[var4] != null) {
                if (var13.field_j[var4].field_f == 2) {
                  var13.field_m[var4] = -6;
                }
                if (var13.field_j[var4].field_f == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            if (param1 > -43) {
              field_p = (String) null;
            }
            var4 = param0.field_i;
            param0.b(var17.field_h, 25251);
            for (var5 = 0; var17.field_t > var5; var5++) {
              if (var17.field_m[var5] == 0) {
                try {
                  var6_int = var17.field_q[var5];
                  if (var6_int != 0) {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_r[var5].field_c);
                      var20 = var16_ref;
                      var20.setInt((Object) null, var17.field_n[var5]);
                      param0.d(87, 0);
                    } else {
                      if (var6_int == 2) {
                        var28 = (java.lang.reflect.Field) (var17.field_r[var5].field_c);
                        var8 = var28.getModifiers();
                        param0.d(118, 0);
                        param0.b(var8, 25251);
                      }
                    }
                  } else {
                    var27 = (java.lang.reflect.Field) (var17.field_r[var5].field_c);
                    var8 = var27.getInt((Object) null);
                    param0.d(116, 0);
                    param0.b(var8, 25251);
                  }
                  if (var6_int == 3) {
                    var29 = (java.lang.reflect.Method) (var17.field_j[var5].field_c);
                    var26 = var17.field_o[var5];
                    var9 = new Object[var26.length];
                    for (var10_int = 0; var10_int < var26.length; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var29.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.d(120, 0);
                    } else if (var10 instanceof Number) {
                      param0.d(81, 1);
                      param0.b(9201, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param0.d(84, 4);
                    } else {
                      param0.d(125, 2);
                      param0.a((String) (var10), 0);
                    }
                  } else {
                    if (4 == var6_int) {
                      var30 = (java.lang.reflect.Method) (var17.field_j[var5].field_c);
                      var8Lifetime1 = var30.getModifiers();
                      param0.d(84, 0);
                      param0.b(var8Lifetime1, 25251);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.d(112, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.d(119, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.d(105, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.d(118, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.d(126, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.d(113, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.d(102, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.d(121, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.d(102, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.d(81, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.d(114, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.d(126, -21);
                }
              } else {
                param0.d(116, var17.field_m[var5]);
              }
            }
            param0.f(var4, -73);
            var17.b(-63);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_66_0 = var2;
            stackIn_66_1 = new StringBuilder().append("ln.A(");
            if (param0 == null) {
              stackIn_67_2 = "null";
            } else {
              stackIn_67_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(boolean param0) {
        if (!this.field_n && (this.field_f != 2 ||
          this.field_k <= 0)) {
          if (~d.field_n == ~this.field_d) {
            return 1;
          }
          if (param0) {
            ln.a(-93);
          }
          if (bj.field_b == 2 &&
            dh.a(this.field_r, (byte) 111)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    ln(boolean param0) {
        if (param0) {
          this.field_o = bn.field_b;
        } else {
          this.field_o = null;
        }
        this.field_r = qg.field_o;
        this.field_s = md.field_f;
        this.field_f = lb.field_b;
        this.field_k = ja.field_c;
        this.field_i = jg.field_c;
        this.field_d = pm.field_c;
        this.field_e = qa.field_e;
        this.field_n = pk.field_k;
    }

    static {
        field_l = new bl(2);
        field_h = "Options";
        field_p = "Explosive crates will detonate when heavily damaged.";
        field_b = new boolean[]{false, false};
    }
}
