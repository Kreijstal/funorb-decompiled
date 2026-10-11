/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static ri field_e;
    private ms field_f;
    static boolean field_b;
    static wc[] field_a;
    private jn field_d;
    static int field_c;

    final ms b(byte param0) {
        ms var2 = this.field_d.field_e.field_b;
        if (this.field_d.field_e == var2) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.field_b;
        if (param0 == -80) {
          return var2;
        }
        this.b((byte) -128);
        return var2;
    }

    final ms a(byte param0) {
        ms var2 = this.field_d.field_e.field_g;
        if (this.field_d.field_e == var2) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.field_g;
        if (param0 < -13) {
          return var2;
        }
        this.a((byte) -67);
        return var2;
    }

    final ms c(byte param0) {
        ms var2 = this.field_f;
        if (this.field_d.field_e == var2) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.field_g;
        if (param0 == 87) {
          return var2;
        }
        return (ms) null;
    }

    final ms b(int param0) {
        if (param0 != 0) {
          return (ms) null;
        }
        ms var2 = this.field_f;
        if (this.field_d.field_e != var2) {
          this.field_f = var2.field_b;
          return var2;
        }
        this.field_f = null;
        return null;
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = td.field_u;
        if (var3 < 5) {
          var2 = var3 * var3 * 8192 / 1100;
          if (param0 != 79) {
            return;
          }
          var4 = 1;
          var5 = 0;
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (5 == param1) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 7) {
            var5 = -1;
            var4 = -1;
          } else {
            if (8 == param1) {
              var5 = -1;
              var4 = -1;
            }
          }
        } else {
          if (var3 < 105) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = -(var3 * var3 * 8192 / 3300) + 8192;
              if (param0 != 79) {
                return;
              }
              var4 = 1;
              var5 = 0;
              if (param1 == 3) {
                var4 = -1;
              }
              if (param1 == 1) {
                var5 = 1;
              }
              if (param1 == 4) {
                var5 = 1;
                var4 = 1;
              }
              if (5 == param1) {
                var4 = -1;
                var5 = 1;
              }
              if (param1 == 6) {
                var4 = 1;
                var5 = -1;
              }
              if (param1 == 7 ||
                8 == param1) {
                var5 = -1;
                var4 = -1;
              }
              if (param1 == 11) {
                var4 = -1;
              }
              if (param1 == 12) {
                var4 = -1;
                var5 = -1;
              }
              if (param1 == 13) {
                var4 = 1;
                var5 = -1;
              }
              if (param1 == 14) {
                var5 = 1;
                var4 = -1;
              }
              if (param1 == 15) {
                var5 = 1;
                var4 = 1;
              }
              uc.field_b = pm.a(83, var2 * var5, var4 * var2);
              return;
            }
          }
          if (param0 != 79) {
            return;
          }
          var4 = 1;
          var5 = 0;
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (5 == param1) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 7 ||
            8 == param1) {
            var5 = -1;
            var4 = -1;
          }
        }
        if (param1 == 11) {
          var4 = -1;
        }
        if (param1 == 12) {
          var4 = -1;
          var5 = -1;
        }
        if (param1 == 13) {
          var4 = 1;
          var5 = -1;
        }
        if (param1 == 14) {
          var5 = 1;
          var4 = -1;
        }
        if (param1 == 15) {
          var5 = 1;
          var4 = 1;
        }
        uc.field_b = pm.a(83, var2 * var5, var4 * var2);
    }

    final static void a(cd[] param0, boolean param1) {
        int var3 = 0;
        int var2_int = 0;
        cd var4 = null;
        int var5 = 0;
        int var6 = 0;
        cd[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param0.length;
          if (!param1) {
            var7 = (cd[]) null;
            cb.a((cd[]) null, true);
          }
          for (var3 = 1; var2_int > var3; var3++) {
            var4 = param0[var3];
            for (var5 = var3 - 1; var5 >= 0; var5--) {
              if (da.a(param0[var5], -114, var4)) {
                param0[var5 + 1] = param0[var5];
                continue;
              }
              break;
            }
            param0[1 + var5] = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("cb.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final ms a(int param0, ms param1) {
        ms var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        ms stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 2 / ((57 - param0) / 41);
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_d.field_e.field_b;
          }
          if (var3 == this.field_d.field_e) {
            this.field_f = null;
            stackIn_6_0 = null;
            return (ms) (stackIn_6_0);
          }
          this.field_f = var3.field_b;
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("cb.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final ms a(byte param0, ms param1) {
        ms var3 = null;
        RuntimeException var3_ref = null;
        ms stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        ms stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_d.field_e.field_g;
          } else {
            var3 = param1;
          }
          if (param0 != -70) {
            stackIn_5_0 = (ms) null;
            return stackIn_5_0;
          }
          if (var3 == this.field_d.field_e) {
            this.field_f = null;
            stackIn_9_0 = null;
            return (ms) (stackIn_9_0);
          }
          this.field_f = var3.field_g;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = in.field_z;
        te.field_c = te.field_c + param0;
        if (param1 != -1372239541) {
          return;
        }
        in.field_z = in.field_z + param0;
        if (gj.a((byte) -84, 10) < 5) {
          if (5 <= gj.a((byte) -84, 10)) {
            kn.field_b = kn.field_b + param0;
            if (var2 >= 50000) {
              return;
            }
            if (in.field_z < 50000) {
              return;
            }
            if (!gt.field_bb) {
              th.b(24753, 241, 14);
            }
            return;
          }
          ts.field_a = ts.field_a + param0;
        } else {
          if (gj.a((byte) -84, 10) >= 5) {
            ha.field_f = ha.field_f - param0;
          } else {
            fb.field_a = fb.field_a - param0;
          }
        }
        if (var2 >= 50000) {
          return;
        }
        if (in.field_z < 50000) {
          return;
        }
        if (gt.field_bb) {
          return;
        }
        th.b(24753, 241, 14);
    }

    final static int b(int param0, int param1) {
        if (param0 != -22415) {
          cb.a((byte) 82, -115);
        }
        if (65536L > (long)param1) {
          if ((long)param1 < 256L) {
            if (0 <= param1) {
              return hu.field_f[param1] >> 12;
            }
            return -1;
          }
          if ((long)param1 >= 4096L) {
            if ((long)param1 >= 16384L) {
              return hu.field_f[param1 >> 8] >> 8;
            }
            return hu.field_f[param1 >> 6] >> 9;
          }
          if ((long)param1 >= 1024L) {
            return hu.field_f[param1 >> 4] >> 10;
          }
          return hu.field_f[param1 >> 2] >> 11;
        }
        if (16777216L > (long)param1) {
          if ((long)param1 >= 1048576L) {
            if ((long)param1 < 4194304L) {
              return hu.field_f[param1 >> 14] >> 5;
            }
            return hu.field_f[param1 >> 16] >> 4;
          }
          if (262144L > (long)param1) {
            return hu.field_f[param1 >> 10] >> 7;
          }
          return hu.field_f[param1 >> 12] >> 6;
        }
        if ((long)param1 >= 268435456L) {
          if (1073741824L > (long)param1) {
            return hu.field_f[param1 >> 22] >> 1;
          }
          return hu.field_f[param1 >> 24];
        }
        if ((long)param1 < 67108864L) {
          return hu.field_f[param1 >> 18] >> 3;
        }
        return hu.field_f[param1 >> 20] >> 2;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != -1384583532) {
          cb.b(67, -59);
          field_a = null;
          return;
        }
        field_a = null;
    }

    cb(jn param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = true;
    }
}
