/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh implements Iterable {
    static w field_c;
    be field_a;
    static boolean field_b;
    static int field_d;

    final static ke a(int[] param0, boolean param1, int param2, int param3) {
        ke stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ec var6 = null;
        ke var7 = null;
        ec var8 = null;
        ec var9 = null;
        ec var10 = null;
        ec var11 = null;
        try {
          L0: {
            L1: {
              var7 = new ke(3);
              var7.field_v = param0;
              var7.field_i = param2;
              if (!ph.n(-30146)) {
                break L1;
              } else {
                var6 = new ec(20, qn.field_rb, a.field_t);
                var6.field_m = 387;
                var6.field_l = 320 + -(var6.field_n / 2);
                var7.a(var6, 100);
                break L1;
              }
            }
            L2: {
              if (mg.field_Zb) {
                var8 = new ec(10, jd.field_Ob, a.field_t);
                var8.field_l = -(var8.field_n / 2) + 320;
                var8.field_m = 387;
                var7.a(var8, 101);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (fm.field_e) {
                var9 = new ec(19, jd.field_Ob, a.field_t);
                var9.field_m = 387;
                var9.field_l = -(var9.field_n / 2) + 320;
                var7.a(var9, 100);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (he.field_db) {
                var10 = new ec(3, oa.field_c, a.field_t);
                var10.field_l = -(var10.field_n / 2) + 320;
                var10.field_m = 387;
                var7.a(var10, 123);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var11 = new ec(13, pc.field_f, a.field_t);
              if (param3 <= -103) {
                break L5;
              } else {
                uh.a(-120);
                break L5;
              }
            }
            L6: {
              var11.field_l = 320 + -(var11.field_n / 2);
              var11.field_m = 415;
              var7.a(var11, 106);
              if (var7.field_b.field_l < 3) {
                break L6;
              } else {
                var7.a(387, 320, true, -118, 24);
                break L6;
              }
            }
            var7.field_y = 520;
            var7.field_q = 215;
            var7.field_z = 166;
            var7.field_w = 62;
            var7.a(0, param1, -129);
            stackIn_16_0 = (ke) (var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("uh.E(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    final be a(byte param0) {
        be var2 = this.field_a.field_p;
        if (var2 == this.field_a) {
            return null;
        }
        var2.e((byte) 97);
        if (param0 < 51) {
            int[] var3 = (int[]) null;
            uh.a((int[]) null, true, 58, 67);
        }
        return var2;
    }

    final static void a(int param0) {
        wc dupTemp$0 = (wc) ((Object) sn.field_e.d(-89));
        wc var2 = dupTemp$0;
        wc var1 = dupTemp$0;
        if (param0 != -9074) {
            return;
        }
        if (!(var2 != null)) {
            var1 = new wc();
        }
        var1.a((byte) 37, hk.field_i, hk.field_l, hk.field_j, hk.field_g, hk.field_c, hk.field_h, hk.field_b);
        ci.field_a.a(var1, 2777);
    }

    final static void a(pi[] param0, byte param1) {
        int var2_int = 0;
        int var3 = client.field_A ? 1 : 0;
        try {
            if (!(param0 == null)) {
                for (var2_int = 0; param0.length > var2_int; var2_int++) {
                    param0[var2_int].a();
                }
            }
            var2_int = -73 / ((param1 - 53) / 55);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "uh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        int stackIn_12_0 = 0;
        String stackIn_12_1 = null;
        int stackIn_13_0 = 0;
        String stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        cc stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        cc var9 = null;
        int var10 = 0;
        pi[] var11 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = -ad.field_a + fb.field_f;
              ad.field_a = -(var1_int >> -1322795295) + af.field_f;
              if (param0 == 32659) {
                break L1;
              } else {
                var11 = (pi[]) null;
                uh.a((pi[]) null, (byte) 12);
                break L1;
              }
            }
            fb.field_f = ad.field_a - -var1_int;
            rn.field_d = -(ac.field_A >> 1209881953) + kk.field_e;
            var2 = rn.field_d;
            var3 = 0;
            L2: while (true) {
              if (var3 >= ef.field_M.length) {
                break L0;
              } else {
                L3: {
                  var4 = ug.field_q[var3];
                  if ((var4 ^ -1) <= -1) {
                    if (wj.field_Jb.field_h == var4) {
                      var5 = hd.field_s;
                      break L3;
                    } else {
                      var5 = i.field_c;
                      break L3;
                    }
                  } else {
                    var5 = ie.field_b;
                    break L3;
                  }
                }
                L4: {
                  var6 = ef.field_M[var3];
                  stackIn_12_0 = 0;

                  stackIn_12_1 = (String) (var6);

                  if (var4 < 0) {
                    stackIn_13_0 = stackIn_12_0;
                    stackIn_13_1 = (String) ((Object) stackIn_12_1);
                    stackIn_13_2 = 0;
                    break L4;
                  } else {
                    stackIn_13_0 = stackIn_12_0;
                    stackIn_13_1 = (String) ((Object) stackIn_12_1);
                    stackIn_13_2 = 1;
                    break L4;
                  }
                }
                L5: {
                  var7 = qb.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0);
                  var8 = -(var7 >> -1957955167) + af.field_f;
                  if (-1 >= (var4 ^ -1)) {
                    L6: {
                      var2 = var2 + je.field_c;
                      if (var4 != wj.field_Jb.field_h) {
                        stackIn_18_0 = ql.field_b;
                        break L6;
                      } else {
                        stackIn_18_0 = gf.field_b;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_18_0;
                      if (var9 != null) {
                        var9.a(var7 + (ba.field_d << -878923967), 97, -ba.field_d + var8, var2, (le.field_t << 1939779937) + vb.field_V);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2 = var2 + le.field_t;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if (-1 >= (var4 ^ -1)) {
                    aj.field_d.a(var6, var8, pa.field_fb + var2, var5, -1);
                    var2 = var2 + (le.field_t + je.field_c + vb.field_V);
                    break L8;
                  } else {
                    wf.field_q.a(var6, var8, hb.field_Wb + var2, var5, -1);
                    var2 = var2 + ma.field_I;
                    break L8;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "uh.A(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 <= 44) {
            uh.b(-20);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new dg((uh) (this)));
    }

    final void a(byte param0, be param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1.field_v != null) {
                param1.e((byte) 85);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param1.field_v = this.field_a.field_v;
              param1.field_p = this.field_a;
              param1.field_v.field_p = param1;
              param1.field_p.field_v = param1;
              if (param0 == 4) {
                break L2;
              } else {
                field_c = (w) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("uh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    uh() {
        this.field_a = new be();
        this.field_a.field_p = this.field_a;
        this.field_a.field_v = this.field_a;
    }

    static {
    }
}
