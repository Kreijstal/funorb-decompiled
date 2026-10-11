/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends pg {
    static String field_g;
    static int field_h;
    static String field_i;
    static int field_j;
    int field_k;

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeKeyListener(ch.field_a);
          if (param1 <= 77) {
            field_j = -47;
          }
          param0.removeFocusListener(ch.field_a);
          ub.field_b = -1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "fj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, CharSequence param1, boolean param2, int param3) {
        int var8 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 >= 2 &&
            36 >= param3) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            if (param0 != 97) {
              field_h = -110;
            }
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((0 == var8) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (var9 >= param3) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param3 * var6 + var9;
                if (var10 / param3 != var6) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            stackIn_41_0 = var5;
            return stackIn_41_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("fj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, nk param1, int param2) {
        ab var3 = null;
        try {
          var3 = he.field_e;
          var3.b((byte) -36, param2);
          if (param0 != -26971) {
            String var4 = (String) null;
            fj.a((String) null, 34, (eg) null, (String) null);
          }
          var3.f(param1.field_p, (byte) -41);
          var3.f(param1.field_t, (byte) -85);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "fj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static qb a(String param0, int param1, eg param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.c(param0, 98);
          if (param1 != -22612) {
            field_h = -32;
          }
          var5 = param2.a(param3, (byte) 106, var4_int);
          stackIn_3_0 = r.a(param1 + 4684, var5, var4_int, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fj.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    private fj() throws Throwable {
        throw new Error();
    }

    final static void c(int param0) {
        if (!hk.field_s) {
          throw new IllegalStateException();
        }
        if (param0 >= -107) {
          nk var2 = (nk) null;
          fj.a(-37, (nk) null, 73);
        }
        if (null != vf.field_k) {
          vf.field_k.h(77);
        }
        String var1 = ho.b((byte) 103);
        wh.field_f = new e(var1, (String) null, true, false, false);
        p.field_b.b(g.field_e, 15637);
        g.field_e.a((byte) -92, (qm) (wh.field_f));
        g.field_e.a(111);
    }

    public static void a(int param0) {
        if (param0 <= 74) {
          return;
        }
        field_g = null;
        field_i = null;
    }

    final static int a(int param0, int param1) {
        int var2;
        nk var3;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (param0 > 65535) {
            param0 = param0 >> 16;
            var2 += 16;
          }
          if (param0 > 255) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (15 < param0) {
            param0 = param0 >> 4;
            var2 += 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        if (param1 != 29797) {
          var3 = (nk) null;
          fj.a(-58, (nk) null, 1);
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (-256 > param0) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (-16 > param0) {
          var2Lifetime1 += 4;
          param0 = param0 >> 4;
        }
        if (param0 < -4) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (param0 < -2) {
          param0 = param0 >> 1;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    static {
        field_g = "Movement:";
    }
}
