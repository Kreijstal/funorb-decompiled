/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ida extends at {
    static String field_o;
    int field_l;
    int field_j;
    int field_q;
    int field_r;
    int field_k;
    gj field_s;
    int field_n;
    int field_m;
    nq field_p;

    final static String a(int param0, byte[] param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        String stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vr var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        var10 = BachelorFridge.field_y;
        try {
          var14 = new char[param0];
          var13 = var14;
          var12 = var13;
          var4 = var12;
          var5 = 0;
          if (param3 != 258048) {
            var11 = (vr) null;
            ida.a(-52, (vr) null, -120);
          }
          var6 = param2;
          var7 = param2 + param0;
          while (var7 > var6) {
            boolean decompiledFrameRemainder0 = true;
            incrementValue$0 = var6;
            var6++;
            var8 = param1[incrementValue$0] & 255;
            if (var8 >= 128) {
              if (var8 >= 192) {
                if (var8 >= 224) {
                  if (240 > var8) {
                    if (1 + var6 < var7 &&
                      (192 & param1[var6]) == 128 &&
                      (param1[1 + var6] & 192) == 128) {
                      incrementValue$1 = var6;
                      var6++;
                      incrementValue$2 = var6;
                      var6++;
                      var9 = param1[incrementValue$1] << 6 & 4032 | var8 << 12 & 61440 | 63 & param1[incrementValue$2];
                      if (!(var9 >= 2048)) {
                        var9 = 65533;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var9 = 65533;
                    }
                  } else {
                    if (var8 >= 248) {
                      var9 = 65533;
                    } else {
                      if (var6 + 2 < var7 &&
                        128 == (192 & param1[var6]) &&
                        (param1[1 + var6] & 192) == 128 &&
                        (param1[2 + var6] & 192) == 128) {
                        incrementValue$3 = var6;
                        var6++;
                        incrementValue$4 = var6;
                        var6++;
                        incrementValue$5 = var6;
                        var6++;
                        var9 = 258048 & param1[incrementValue$3] << 12 | 1835008 & var8 << 18 | 4032 & param1[incrementValue$4] << 6 | param1[incrementValue$5] & 63;
                        if (var9 >= 65536 &&
                          var9 <= 1114111) {
                          var9 = 65533;
                        } else {
                          var9 = 65533;
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var9 = 65533;
                      }
                    }
                  }
                } else {
                  if (var7 > var6 &&
                    128 == (192 & param1[var6])) {
                    incrementValue$6 = var6;
                    var6++;
                    var9 = (var8 & 31) << 6 | 63 & param1[incrementValue$6];
                    if (!(var9 >= 128)) {
                      var9 = 65533;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var9 = 65533;
                  }
                }
              } else {
                var9 = 65533;
              }
            } else {
              var9 = (0 != var8) ? var8 : 65533;
            }
            incrementValue$7 = var5;
            var5++;
            var12[incrementValue$7] = (char)var9;
          }
          stackIn_39_0 = new String(var14, 0, var5);
          return stackIn_39_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_42_0 = var4_ref;
          stackIn_42_1 = new StringBuilder().append("ida.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_o = null;
    }

    final static kv[] a(int param0, int param1, int param2, int param3) {
        if (param1 > -13) {
          return (kv[]) null;
        }
        return to.a(param0, param2, -25974, 1, param3);
    }

    final static pn a(int param0, vr param1, int param2) {
        RuntimeException var3 = null;
        pn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_o = (String) null;
          }
          stackIn_3_0 = vw.field_a[param2];
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ida.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        if (param0 < -109) {
          return this.field_n > this.field_q ? true : false;
        }
        this.field_l = 82;
        return this.field_n > this.field_q ? true : false;
    }

    final void a(int param0, int param1, int param2) {
        aga var4;
        int var5;
        var5 = BachelorFridge.field_y;
        var4 = this.field_p.a(64, this.field_s.field_h);
        this.field_s.b(var4, -23990);
        if (param2 != 27230) {
          this.field_n = -76;
        }
        this.field_l = 0;
        this.field_j = 0;
        this.field_n = 0;
        if (param0 == 2) {
          this.field_l = -param1;
          return;
        }
        if (param0 == 1) {
          this.field_j = -param1;
          return;
        }
        if (4 == param0) {
          this.field_l = param1;
          return;
        }
        if (param0 != 3) {
          return;
        }
        this.field_j = param1;
    }

    final static n a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -203) {
            var3 = (String) null;
            ida.a((String) null, -32);
          }
          stackIn_3_0 = new n(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ida.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ida(gj param0, nq param1, int param2, int param3) {
        try {
          this.field_k = param2;
          this.field_s = param0;
          this.field_r = param3;
          this.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ida.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_o = "Actions";
    }
}
