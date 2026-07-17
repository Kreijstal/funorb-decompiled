/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends fl {
    static String field_w;
    static int[] field_v;
    private int[][] field_q;
    static String field_y;
    static cn field_u;
    static int field_r;
    int[] field_z;
    private int[] field_x;
    private String[] field_s;
    static hh field_t;

    private final void a(int param0, n param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        om var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 == 10691) {
              L1: {
                if (param2 == 1) {
                  ((si) this).field_s = bb.a(-128, param1.c(false), '<');
                  break L1;
                } else {
                  if (param2 != 2) {
                    if (param2 == 3) {
                      var4_int = param1.e(0);
                      ((si) this).field_q = new int[var4_int][];
                      ((si) this).field_x = new int[var4_int];
                      var5 = 0;
                      L2: while (true) {
                        if (var4_int <= var5) {
                          break L1;
                        } else {
                          L3: {
                            var6 = param1.f(1952);
                            var7 = kf.a((byte) -57, var6);
                            if (var7 != null) {
                              ((si) this).field_x[var5] = var6;
                              ((si) this).field_q[var5] = new int[var7.field_d];
                              var8 = 0;
                              L4: while (true) {
                                if (var7.field_d <= var8) {
                                  break L3;
                                } else {
                                  ((si) this).field_q[var5][var8] = param1.f(n.a(param0, 11875));
                                  var8++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      if (param2 != 4) {
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    var4_int = param1.e(param0 ^ 10691);
                    ((si) this).field_z = new int[var4_int];
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        ((si) this).field_z[var5] = param1.f(1952);
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("si.A(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 41);
        }
    }

    final void a(n param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((si) this).d((byte) -118);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.e(0);
              if (var3_int == 0) {
                break L0;
              } else {
                this.a(10691, param0, var3_int);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("si.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final void d(byte param0) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        int var2 = 46 / ((-16 - param0) / 44);
        if (((si) this).field_z != null) {
            for (var3 = 0; var3 < ((si) this).field_z.length; var3++) {
                ((si) this).field_z[var3] = lb.a(((si) this).field_z[var3], 32768);
            }
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_w = null;
        if (param0 < 74) {
            si.f(-4);
        }
        field_v = null;
        field_y = null;
        field_u = null;
    }

    final static void a(float param0, String param1, boolean param2, byte param3) {
        try {
            if (!(null != jb.field_r)) {
                jb.field_r = new w(bo.field_F, dj.field_b);
                bo.field_F.b((hm) (Object) jb.field_r, 116);
            }
            jb.field_r.a(-100, param1, param0, param2);
            em.d();
            se.a(true, 17113);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "si.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + 14 + 41);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = 100 % ((param0 - -19) / 57);
              var3 = param1.getParameter("username");
              if (var3 == null) {
                break L1;
              } else {
                var4 = (CharSequence) (Object) var3;
                if (vn.a((byte) 91, var4) == 0L) {
                  break L1;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("si.F(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String g(int param0) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((si) this).field_s == null) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((si) this).field_s[0]);
        for (var3 = 1; var3 < ((si) this).field_s.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((si) this).field_s[var3]);
        }
        if (param0 != -4) {
            si.f(100);
        }
        return var2.toString();
    }

    final static void a(int param0, dk param1) {
        int[] var2 = null;
        int[] var3 = null;
        try {
            if (param0 >= -60) {
                field_r = -70;
            }
            var2 = new int[]{3170352, 3170352, 3170352};
            var3 = new int[]{6340704, 16777215, 16777215};
            param1.a(var2, var3, -2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "si.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    si() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new int[]{};
        field_w = " - rotate ship right";
        field_r = 500;
        field_y = "Connection lost. <%0>";
    }
}
