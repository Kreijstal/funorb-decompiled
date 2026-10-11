/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ql {
    static int field_a;
    static int field_c;
    static String field_b;

    void d(int param0) {
        oj var2;
        int var3;
        int var4;
        if (~ha.field_t == param0 &&
          nh.field_E.field_e > 0 && mc.field_I != 2) {
          var2 = mm.field_m[0];
          var3 = (int)(0.5 + (var2.field_l.field_a + (double)var2.field_j.field_g));
          var4 = var2.field_j.field_e;
          if (1 + nh.field_E.field_g == var3 &&
            var4 >= -1 + nh.field_E.field_e &&
            var4 <= nh.field_E.field_e + 1) {
            mf.a(false, 2);
          }
        }
    }

    boolean a(oj param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -5) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ql.P(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -3) {
          field_c = 34;
        }
    }

    void c(int param0) {
        if (param0 != 0) {
          field_c = 123;
        }
    }

    private final int a(byte param0, int param1) {
        if (param0 != 27) {
          return 62;
        }
        if (param1 >= 480 &&
          param1 < 528) {
          return 1;
        }
        if (286 <= param1 && param1 <= 319 &&
          (7 & param1) >= 6) {
          return 1;
        }
        return -1;
    }

    boolean a(byte param0) {
        int var2 = 12 / ((57 - param0) / 47);
        return false;
    }

    boolean b(int param0) {
        int var2 = 44 / ((param0 - 38) / 53);
        return true;
    }

    void a(int param0, p param1) {
        try {
          int var3_int = -43 / ((36 - param0) / 63);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ql.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, oj param1) {
        try {
          int var3_int = 77 % ((param0 - 23) / 32);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ql.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void f(int param0) {
        int var1_int = 0;
        int var2 = HostileSpawn.field_I ? 1 : 0;
        int var1_intLifetime1;
        try {
          vj.field_v.b(false);
          for (var1_int = 0; 32 > var1_int; var1_int++) {
            bm.field_d[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            el.field_e[var1_intLifetime1] = 0L;
          }
          if (param0 != 8036) {
            field_c = 24;
          }
          ve.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ql.FA(" + param0 + ')');
        }
    }

    String a(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return "UNSPECIFIED";
    }

    void b(byte param0) {
        int var2 = 19 / ((-48 - param0) / 38);
    }

    final static void a(og param0, int param1, oc param2, oj param3, boolean param4) {
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        oj stackIn_63_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_1 = 0;
        jb stackIn_78_0 = null;
        int stackIn_90_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        oc var11_ref_oc = null;
        oj var12_ref_oj = null;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        jb var14 = null;
        int var15 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          stackIn_4_0 = (0 != param3.field_h) ? 0 : 1;
          var5_int = stackIn_4_0;
          var6 = 0;
          var7 = 0;
          if (q.field_g != null) {
            if (null != q.field_g) {
              stackIn_11_0 = (q.field_g.a(param3, (byte) -5)) ? 1 : 0;
            } else {
              stackIn_11_0 = 0;
            }
            var7 = stackIn_11_0;
          }
          var8 = param3.field_j.field_e;
          var10 = -60 % ((param1 + 29) / 46);
          var9 = param3.field_j.field_g;
          if (param3.field_I < 0) {
            param3.field_I = 0;
          }
          if (param3.field_I != 0) {
            if (var7 == 0) {
              for (var11 = 0; var11 < el.field_j; var11++) {
                boolean decompiledFrameRemainder0 = true;
                var12_ref_oj = mm.field_m[var11];
                if (var12_ref_oj.d((byte) 81)) {
                  var13 = -var8 + var12_ref_oj.field_j.field_e;
                  var14_int = -var9 + var12_ref_oj.field_j.field_g;
                  if (var13 <= 0) {
                    var13 = -var13;
                  } else {
                    var13--;
                  }
                  if (var14_int > 0) {
                    var14_int--;
                  } else {
                    var14_int = -var14_int;
                  }
                  if (var5_int != 0) {
                    decompiledFrameRemainder0 = !(var14_int + var13 > 2);
                  } else {
                    decompiledFrameRemainder0 = !(var13 > 1);
                    if (decompiledFrameRemainder0) {
                      decompiledFrameRemainder0 = !(1 < var14_int);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var6 = 1;
                    break;
                  }
                }
                if (var12_ref_oj.field_i == 8 &&
                  -2 + var8 <= var12_ref_oj.field_j.field_e &&
                  var12_ref_oj.field_j.field_e <= 3 + var8 &&
                  var12_ref_oj.field_j.field_g >= -2 + var9 &&
                  var9 + 3 >= var12_ref_oj.field_j.field_g) {
                  param3.field_i = -1;
                  break;
                }
              }
            }
          } else {
            var6 = 1;
          }
          boolean decompiledFrameRemainder1 = true;
          if (var5_int == 0 &&
            var7 != 0) {
            var11_ref_oc = mm.field_m[0].field_j;
            var12 = -var8 + var11_ref_oc.field_e;
            var13Lifetime1 = -var9 + var11_ref_oc.field_g;
            if (var12 <= 0) {
              var12 = -var12;
            } else {
              var12--;
            }
            if (var13Lifetime1 > 0) {
              var13Lifetime1--;
            } else {
              var13Lifetime1 = -var13Lifetime1;
            }
            if (var12 <= 1 &&
              var13Lifetime1 <= 1) {
              if ((param3.field_C == 0)) {
                param3.field_C = 1;
                eh.field_c.a(fg.field_b[24], 100, uh.field_i);
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (2 <= var12 ||
                2 <= var13Lifetime1) {
                param3.field_C = 0;
              }
            }
          }
          stackIn_63_0 = (oj) (param3);
          if (var6 != 0) {
            stackIn_64_1 = 0;
          } else {
            stackIn_64_1 = 1;
          }
          stackIn_63_0.field_h = stackIn_64_1;
          if (uj.field_l == 1) {
            stackIn_68_0 = (var6 != 0) ? 0 : 1;
            if (var5_int != 0) {
              stackIn_71_1 = 0;
            } else {
              stackIn_71_1 = 1;
            }
            if (stackIn_68_0 != stackIn_71_1) {
              var11Lifetime1 = (int)(((double)(-var8) + (param0.field_f + (double)param2.field_e) - param3.field_l.field_f) * 24.0);
              var12Lifetime1 = (int)((param0.field_a + (double)param2.field_g - (double)var9 - param3.field_l.field_a) * 24.0);
              var13Lifetime2 = 256 - (int)Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 + var11Lifetime1 * var11Lifetime1));
              if (var13Lifetime2 > 128) {
                var13Lifetime2 = 128;
              }
              if (var6 != 0) {
                stackIn_78_0 = em.field_a[20];
              } else {
                stackIn_78_0 = em.field_a[19];
              }
              var14 = stackIn_78_0;
              if (var13Lifetime2 > 0) {
                eh.field_c.a(var14, 100, uh.field_i * var13Lifetime2 / 128);
              }
            }
          }
          var11Lifetime2 = param3.field_j.b(-4);
          if (param3.field_h != 0) {
            if (param3.field_e > 0) {
              param3.field_e = param3.field_e - 1;
            }
          } else {
            if (param3.field_e < 14) {
              param3.field_e = param3.field_e + 1;
            }
          }
          if (param4) {
            stackIn_90_0 = 1;
          } else {
            stackIn_90_0 = -ln.field_a.field_d;
          }
          var12Lifetime2 = stackIn_90_0;
          if (param3.field_e <= 10 &&
            0 < param3.field_I) {
            ln.field_a.field_c[var11Lifetime2] = 2;
            ln.field_a.field_c[var12Lifetime2 + var11Lifetime2] = 2;
            return;
          }
          if (ln.field_a.field_c[var11Lifetime2] == 2) {
            ln.field_a.field_c[var11Lifetime2] = 0;
          }
          if (ln.field_a.field_c[var12Lifetime2 + var11Lifetime2] == 2) {
            ln.field_a.field_c[var12Lifetime2 + var11Lifetime2] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_102_0 = var5;
          stackIn_102_1 = new StringBuilder().append("ql.AA(");
          if (param0 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          stackIn_105_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          stackIn_108_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',');
          if (param3 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',').append(param4).append(')').toString());
        }
    }

    boolean a(oc param0, boolean param1, byte param2) {
        boolean stackIn_23_0 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          var4_int = 0;
          var5 = param0.b(param2 - 113);
          if (param0.field_g <= 0) {
            return false;
          }
          if (param0.field_e <= 0) {
            return false;
          }
          if (-1 + ln.field_a.field_a <= param0.field_g) {
            return false;
          }
          if (ln.field_a.field_d - 1 <= param0.field_e) {
            return false;
          }
          var4_int = var4_int + this.a((byte) 27, ln.field_a.field_y[var5]);
          var4_int = var4_int + this.a((byte) 27, ln.field_a.field_y[var5 - 1]);
          var4_int = var4_int + this.a((byte) 27, ln.field_a.field_y[-ln.field_a.field_d + var5]);
          var4_int = var4_int + this.a((byte) 27, ln.field_a.field_y[-1 + (var5 - ln.field_a.field_d)]);
          if (param2 != 109) {
            this.a(true);
          }
          if (var4_int > 0) {
            return true;
          }
          if (var4_int >= 0) {
            stackIn_23_0 = param1;
            return stackIn_23_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("ql.BA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void e(int param0) {
        if (param0 != 0) {
          p var3 = (p) null;
          this.a(-69, (p) null);
        }
    }

    final boolean a(oc param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        p var5 = null;
        p var6 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          if ((kh.field_Q[6] ||
            kh.field_Q[4]) &&
            kh.field_ib[an.field_r[6]] > 0) {
            return false;
          }
          if ((kh.field_Q[5] ||
            kh.field_Q[7]) &&
            0 < kh.field_ib[an.field_r[5]]) {
            return false;
          }
          if (kc.a((byte) -126, param0)) {
            return false;
          }
          for (var3_int = 0; var3_int < ll.field_a; var3_int++) {
            if (wh.field_b[var3_int].field_j.a(param0, param1 + 52)) {
              return false;
            }
          }
          var5 = wh.field_b[ll.field_a];
          var6 = var5;
          var5.field_h = an.field_r[5];
          var6.field_i = 1;
          if (param1 != -1) {
            return false;
          }
          var6.field_c = 0.0;
          var6.field_j.a((byte) 46, param0);
          ll.field_a = ll.field_a + 1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("ql.W(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "Updates will sent to the email address you've given";
        field_c = 33;
    }
}
