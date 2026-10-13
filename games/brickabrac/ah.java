/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ah extends km {
    static int field_v;
    static int[][] field_w;
    private int field_s;
    private jf field_r;
    static int[] field_u;
    private int field_t;

    final void a(boolean param0, int param1, int param2) {
        oi var4;
        if (param2 < 96) {
          return;
        }
        super.a(param0, param1, 101);
        rf.field_g = null;
        this.field_s = 0;
        if (pe.field_o != null &&
          !pe.field_o.field_p) {
          var4 = pe.field_o.match.configuration;
          if (var4.field_b.field_h == 1) {
            this.field_s = 1;
          }
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        if (param1 != 1) {
          field_u = (int[]) null;
        }
        if (this.field_m.length != 2) {
          var3 = this.field_m[param0].field_f;
          return var3 == 43 ? 140 : -6 + (this.field_p + 38);
        }
        return this.field_p;
    }

    final void d(byte param0) {
        rf.field_g = null;
        if (param0 != 79) {
          this.field_s = -114;
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
          ih.a(false, param0, param2, 2);
          if (param1 != 11455) {
            field_v = -30;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ah.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, char param2) {
        int var5;
        boolean decompiledFrameRemainder0 = true;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (this.field_m.length == 2) {
          this.field_h.a(0, param0 + 119);
        } else {
          if (param1 == 96) {
            if (this.field_h.field_j <= 0) {
              this.field_h.a(false, 3);
            } else {
              if (this.field_h.field_j < 4) {
                this.field_h.a(false, -1 + this.field_h.field_j);
              }
            }
          }
          if (param1 == 97) {
            if (3 <= this.field_h.field_j) {
              if (this.field_h.field_j == 3) {
                this.field_h.a(false, 0);
              }
            } else {
              this.field_h.a(false, 1 + this.field_h.field_j);
            }
          }
          if (param1 == 99) {
            if (this.field_h.field_j < 4) {
              this.field_h.a(false, 4);
              this.field_r.a((byte) 108);
            } else {
              if (this.field_r.a(param1, param2, -94)) {
                this.field_h.a(false, 0);
              }
            }
          }
          if (param1 == 98) {
            if (4 > this.field_h.field_j) {
              this.field_h.a(false, 4);
              this.field_r.c(param0 ^ 119);
              this.field_h.d((byte) -124);
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_r.a(param1, param2, -67)) {
                this.field_h.a(false, 0);
                this.field_h.d((byte) -124);
                decompiledFrameRemainder0 = false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            this.field_h.d((byte) -124);
          }
        }
        if (param0 != -120) {
          field_u = (int[]) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7) {
        try {
          if (param0 != -1) {
            ob.field_D.a(param0 + 1 + ". ", lq.field_b[0], param2, param3, -1);
          }
          ob.field_D.c(param7, lq.field_b[0], param2, param3, -1);
          ob.field_D.b(Integer.toString(1 + param1), lq.field_b[1] - nn.field_g.c(mn.field_u) / 2, param2, param3, -1);
          ob.field_D.b(Integer.toString(1 + param4), lq.field_b[2] - nn.field_g.c(ba.field_u) / 2, param2, param3, -1);
          ob.field_D.a(Integer.toString(param6), lq.field_b[3], param2, param3, -1);
          int var9_int = 102 % ((param5 + 15) / 45);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ah.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 207) {
          return 'j';
        }
        var2 = param1;
        if (32 != var2 &&
          160 != var2 &&
          var2 != 95 &&
          var2 != 45) {
          if (var2 != 91 &&
            var2 != 93 &&
            35 != var2) {
            if (var2 != 224 &&
              225 != var2 &&
              var2 != 226 &&
              228 != var2 &&
              227 != var2 &&
              var2 != 192 &&
              193 != var2 &&
              194 != var2 &&
              var2 != 196 &&
              var2 != 195) {
              if (232 != var2 &&
                var2 != 233 &&
                var2 != 234 &&
                var2 != 235 &&
                var2 != 200 &&
                201 != var2 &&
                var2 != 202 &&
                var2 != 203) {
                if (var2 != 237 &&
                  var2 != 238 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  var2 != 206 &&
                  207 != var2) {
                  if (var2 != 242 &&
                    var2 != 243 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    245 != var2 &&
                    var2 != 210 &&
                    211 != var2 &&
                    var2 != 212 &&
                    var2 != 214 &&
                    var2 != 213) {
                    if (249 != var2 &&
                      var2 != 250 &&
                      251 != var2 &&
                      var2 != 252 &&
                      217 != var2 &&
                      218 != var2 &&
                      var2 != 219 &&
                      var2 != 220) {
                      if (var2 != 231 &&
                        var2 != 199) {
                        if (var2 != 255 &&
                          var2 != 376) {
                          if (var2 != 241 &&
                            var2 != 209) {
                            if (223 != var2) {
                              return Character.toLowerCase(param1);
                            }
                            return 'b';
                          }
                          return 'n';
                        }
                        return 'y';
                      }
                      return 'c';
                    }
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return param1;
        }
        return '_';
    }

    final void b(boolean param0) {
        int var5_int = 0;
        String stackIn_8_0 = null;
        int var2;
        int var3;
        int var4;
        q var4_ref_q;
        q var5;
        String var5_ref;
        q var6;
        int var6_int;
        int var7;
        q var8;
        String var9;
        q var10;
        int var3Lifetime1;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (!param0) {
          field_v = -11;
        }
        if (this.field_m.length != 2) {
          var2 = 0;
          for (var3 = 0; var3 < -1 + this.field_m.length; var3++) {
            var4_ref_q = this.field_m[var3];
            if (var4_ref_q.field_f == 8) {
              stackIn_8_0 = this.e((byte) 125);
            } else {
              stackIn_8_0 = ag.field_D[var4_ref_q.field_f];
            }
            var9 = stackIn_8_0;
            var5_ref = var9;
            var6_int = nn.field_g.c(var9) + 30;
            if (var6_int > var2) {
              var2 = var6_int;
            }
          }
          var3Lifetime1 = 30 + var2 * 4;
          var4 = 120 + (-var3Lifetime1 + 475) / 2;
          for (var5_int = 0; this.field_m.length - 1 > var5_int; var5_int++) {
            var6 = this.field_m[var5_int];
            var6.field_c = var4;
            var6.field_a = this.b(var5_int, 1);
            var6.field_j = var2;
            var6.field_d = this.b((byte) 118, var5_int);
            var4 = var4 + (10 + var6.field_j);
          }
          var8 = this.field_m[this.field_m.length - 1];
          var10 = var8;
          var5 = var10;
          var8.field_j = hq.field_s[0].field_x;
          var8.field_d = hq.field_s[0].field_z * 2;
          var5.field_c = (-var10.field_j + 240) / 4;
          var5.field_a = 140;
        } else {
          this.e(2);
        }
    }

    final static void a(pi param0, byte param1) {
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
          bg var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          bg var17 = null;
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
          var12 = BrickABrac.field_J ? 1 : 0;
          try {
            var13 = (bg) (mf.field_i.first(-48));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var17.field_s > var4; var4++) {
              if (null != var13.field_j[var4]) {
                if (var13.field_j[var4].field_f == 2) {
                  var13.field_k[var4] = -5;
                }
                if (0 == var13.field_j[var4].field_f) {
                  var3 = 1;
                }
              }
              if (var13.field_l[var4] != null) {
                if (2 == var13.field_l[var4].field_f) {
                  var13.field_k[var4] = -6;
                }
                if (0 == var13.field_l[var4].field_f) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_l;
            param0.a(var17.field_i, (byte) -79);
            for (var5 = 0; var17.field_s > var5; var5++) {
              if (var17.field_k[var5] == 0) {
                try {
                  var6_int = var17.field_t[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var17.field_j[var5].field_e);
                    var8 = var15.getInt((Object) null);
                    param0.a(-7, 0);
                    param0.a(var8, (byte) -79);
                  } else {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_j[var5].field_e);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_q[var5]);
                      param0.a(-15, 0);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.field_j[var5].field_e);
                        var8 = var26.getModifiers();
                        param0.a(param1 - 4, 0);
                        param0.a(var8, (byte) -79);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var17.field_l[var5].field_e);
                    var25 = var17.field_m[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.a(param1 ^ 61, 0);
                    } else if (var10 instanceof Number) {
                      param0.a(param1 ^ -114, 1);
                      param0.a(-23054, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param0.a(22, 4);
                    } else {
                      param0.a(param1 ^ -103, 2);
                      param0.a((String) (var10), -1);
                    }
                  } else {
                    if (var6_int == 4) {
                      var27 = (java.lang.reflect.Method) (var17.field_l[var5].field_e);
                      var8Lifetime1 = var27.getModifiers();
                      param0.a(-123, 0);
                      param0.a(var8Lifetime1, (byte) -79);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.a(80, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.a(param1 - 127, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.a(param1 ^ -126, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.a(param1 - 16, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.a(109, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.a(-126, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.a(-114, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.a(71, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.a(-111, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.a(param1 - 112, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.a(101, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.a(87, -21);
                }
              } else {
                param0.a(87, var17.field_k[var5]);
              }
            }
            if (param1 != 9) {
              ah.a(-62, '&');
            }
            param0.d(3, var4);
            var17.unlink((byte) 111);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_66_0 = var2;
            stackIn_66_1 = new StringBuilder().append("ah.B(");
            if (param0 == null) {
              stackIn_67_2 = "null";
            } else {
              stackIn_67_2 = "{...}";
            }
            throw qb.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        field_u = null;
        if (param0 != -5) {
          String var2 = (String) null;
          ah.a((String) null, -31, (String) null);
        }
        field_w = (int[][]) null;
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int var4;
        q var5;
        int var6;
        int var7;
        int var8;
        var8 = BrickABrac.field_J ? 1 : 0;
        var4 = 0;
        if (param2 != 123) {
          return true;
        }
        var5 = this.field_m[param0];
        var6 = var5.field_f;
        var7 = var6;
        if (14 != var7) {
          if (var7 == 15) {
            if (this.field_h.a((byte) 113)) {
              this.field_t = 1;
              this.b(true, param0);
              var4 = 1;
            }
          } else {
            if (var7 == 16) {
              if (this.field_h.a((byte) 113)) {
                this.field_t = 2;
                var4 = 1;
                this.b(true, param0);
              }
            } else {
              if (var7 != 43) {
                return super.a(param0, param1, (byte) 123);
              }
              if (this.field_h.a((byte) 113) &&
                this.field_r.field_i != -1) {
                rf.field_g = null;
                var4 = 1;
                this.field_s = this.field_r.field_i;
              }
            }
          }
        } else {
          if (this.field_h.a((byte) 113)) {
            this.field_t = 0;
            this.b(true, param0);
            var4 = 1;
          }
        }
        return var4 != 0;
    }

    ah() {
        super(5, 38, 460, 402, 35, nc.field_a);
        this.field_s = 0;
        this.field_t = 0;
        fk.field_g = ob.field_D.c("10. ") + 10;
        lq.field_b = new int[4];
        lq.field_b[2] = 125 + fk.field_g + 330;
        lq.field_b[1] = 125 + fk.field_g + 240;
        lq.field_b[0] = 125 + fk.field_g;
        lq.field_b[3] = 50 - (-fk.field_g - 500);
        this.field_r = new jf(this, ObjectHistoryBuffer.field_k.length - 1, 2);
    }

    final void d(int param0) {
        this.a(ObjectHistoryBuffer.field_k, 0);
        this.b(true, 1);
        if (param0 >= -60) {
          ah.f(-46);
        }
    }

    final static long a(boolean param0, CharSequence param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param1.length();
          var5 = 0;
          if (param0) {
            field_w = (int[][]) null;
          }
          while (var4 > var5) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + (1 + var6));
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(1 + var6 - 97);
            } else {
              if (48 <= var6 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(var6 - 21);
              }
            }
            if (var2_long < 177917621779460413L) {
              var5++;
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ah.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final void drawScreen(byte obfuscationGuard) {
        int stackIn_17_0 = 0;
        int var2;
        int var3;
        Object var4;
        String var4_ref;
        String[] var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int[] var13;
        int[] var16;
        int var2Lifetime1;
        int var3Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var12 = BrickABrac.field_J ? 1 : 0;
        super.drawScreen((byte) -38);
        al.a(this.field_a, 19);
        this.a(0);
        if (og.h(-26090)) {
          im.a(550, 5, 243, 5, 140, (byte) -108, 45);
          fj.a(243, na.field_N, 140, nn.field_g, -15531, 2);
          return;
        }
        im.a(475, 5, 33, 5, 140, (byte) -101, 120);
        nn.field_g.b(qn.field_u[this.field_s], 357, 1 + (-nn.field_g.field_L + 178), 0, -1);
        da.field_E[this.field_s].e(565, 140, -2048, 4096);
        if (obfuscationGuard >= -14) {
          field_v = -65;
        }
        im.a(475, 5, 243, 5, 178, (byte) -57, 120);
        var2 = 149 + nn.field_g.field_B + 38;
        var3 = 0;
        nn.field_g.c(ae.field_i, -fk.field_g + lq.field_b[0] + 12, var2, var3, -1);
        nn.field_g.a(mn.field_u, lq.field_b[1], var2, var3, -1);
        nn.field_g.a(ba.field_u, lq.field_b[2], var2, var3, -1);
        nn.field_g.a(pj.field_d, lq.field_b[3], var2, var3, -1);
        var2Lifetime1 = 5 * (nn.field_g.field_P + nn.field_g.field_B) / 2 + 187;
        var4 = null;
        if (rf.field_g != null &&
          rf.field_g.field_o) {
          if (null == rf.field_g.field_i) {
            var4_ref = rn.field_d;
          } else {
            var4_ref = da.field_J;
            var5 = rf.field_g.field_i[this.field_t];
            var13 = rf.field_g.field_n[this.field_t];
            var7 = gj.a(rf.field_g, fj.field_Ub, -87, this.field_t);
            for (var8 = 0; 10 > var8; var8++) {
              if (var5[var8] != null) {
                stackIn_17_0 = (var7 == var8) ? 1 : 2;
                var3Lifetime1 = stackIn_17_0;
                var9 = var13[2 * var8];
                var10 = var13[2 * var8 + 1] >> 16 & 65535;
                var11 = var13[1 + 2 * var8] & 65535;
                if ((1 & var8) == 0) {
                  lb.d(125, var2Lifetime1 - 15, 465, 18, 16777215, 16);
                }
                var4_ref = "";
                this.a(var8, var10, var2Lifetime1, var3Lifetime1, var11, 105, var9, var5[var8]);
              }
              var2Lifetime1 += 18;
            }
            if (fj.field_Ub != null &&
              var7 < 0) {
              var16 = fj.field_Ub.field_i;
              var8Lifetime1 = var16[0];
              var9Lifetime1 = var16[1] >> 16 & 65535;
              var10Lifetime1 = 65535 & var16[1];
              this.a(-1, var9Lifetime1, var2Lifetime1, 1, var10Lifetime1, 63, var8Lifetime1, tb.field_cb);
            }
          }
        } else {
          var4_ref = kd.field_a;
        }
        if (var4_ref != null) {
          sa.a(178, nn.field_g, var4_ref, 357, 243, 2, 15);
        }
        this.field_r.b(117);
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        super.advanceScreen(updateFlag, inputEnabled, -100);
        if (obfuscationGuard >= -52) {
          return;
        }
        if (og.h(-26090)) {
          return;
        }
        if (rf.field_g == null) {
          rf.field_g = cp.b(-2, this.field_s, 2, 10, 3);
        }
        this.field_r.a(111);
    }

    static {
        field_v = 0;
    }
}
