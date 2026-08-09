/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends tm {
    static String field_C;
    static String field_A;
    static String field_B;
    static int field_D;
    static nu field_F;
    static int field_E;

    jo(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static kg[] a(sj param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kg[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0.b(param2, -1);
              if (param1 == 17369) {
                break L1;
              } else {
                jo.g(27);
                break L1;
              }
            }
            var5 = param0.a((byte) -121, param3, var4_int);
            stackIn_3_0 = ua.a(var4_int, var5, param0, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("jo.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5_int = 0;
        String var5 = null;
        hd var6 = null;
        int var7 = 0;
        int var8 = 0;
        tv var9 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (pg.field_b < rb.field_Bb) {
                pg.field_b = pg.field_b + 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (na.field_Ab != ea.field_f.field_e) {
                c.field_c = c.field_c + (ea.field_f.field_e - na.field_Ab);
                na.field_Ab = ea.field_f.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            if (pg.field_b > 0) {
              L3: {
                eq.a(0);
                g.field_a.b(0, param0);
                if (null == la.field_a) {
                  break L3;
                } else {
                  if (iw.field_l) {
                    la.field_a.a(g.field_a.field_T, 31947, g.field_a.field_F, param0);
                    break L3;
                  } else {
                    la.field_a = null;
                    break L3;
                  }
                }
              }
              var4_int = 52 / ((-26 - param3) / 46);
              var5_int = 0;
              L4: while (true) {
                if ((var5_int ^ -1) <= -6) {
                  L5: {
                    if (0 == uq.field_a.field_sb) {
                      break L5;
                    } else {
                      ck.field_b = new rb(uq.field_a.field_F, uq.field_a.field_T, uq.field_a.field_q, uq.field_a.field_mb, param2, tv.field_e, ai.field_H, hl.field_f, dw.field_e, hs.field_d, ul.field_c, (String) null, 0L);
                      break L5;
                    }
                  }
                  L6: {
                    var9 = rb.a(param1, sh.field_c, (byte) 26, eb.field_b);
                    if (var9 == null) {
                      break L6;
                    } else {
                      bf.a(var9, (byte) -60);
                      break L6;
                    }
                  }
                  L7: {
                    var5 = fn.f(-3);
                    if (var5 != null) {
                      sn.field_e = var5;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L8: {
                    var6 = mr.field_W[var5_int];
                    if (var6 != null) {
                      L9: {
                        if (var6.field_sb == 0) {
                          break L9;
                        } else {
                          kr.a(var6, true, var5_int);
                          break L9;
                        }
                      }
                      var7 = r.a(0, var5_int);
                      av.field_b[var5_int].field_N = il.field_d[var7];
                      ds.field_a[var5_int].field_E = tf.field_h[var7];
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var5_int++;
                  continue L4;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var4), "jo.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 84) {
                break L1;
              } else {
                field_F = (nu) null;
                break L1;
              }
            }
            stackIn_3_0 = new li(nt.k(39));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jo.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void g(int param0) {
        field_C = null;
        field_F = null;
        if (param0 != 0) {
            return;
        }
        field_B = null;
        field_A = null;
    }

    final static boolean a(tf param0, boolean param1) {
        gn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            if (!param1) {
              var2 = param0.g(24009);
              L1: while (true) {
                L2: {
                  if (!(var2 instanceof ak)) {
                    break L2;
                  } else {
                    if (!(var2.field_d instanceof ak)) {
                      break L2;
                    } else {
                      if (((ak) ((Object) var2)).a((byte) -56) < ((ak) ((Object) var2.field_d)).a((byte) -9)) {
                        stackIn_10_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var2 = var2.field_d;
                        continue L1;
                      }
                    }
                  }
                }
                stackIn_13_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2_ref);

            stackIn_16_1 = new StringBuilder().append("jo.D(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    static {
        field_A = "Reject";
        field_B = "tournament";
        field_C = "The Final starts in <%0> seconds...";
        field_E = 0;
    }
}
