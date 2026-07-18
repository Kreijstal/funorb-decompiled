/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ns implements bp {
    private boolean field_Eb;
    static String field_Bb;
    static String field_Ib;
    static pb field_Gb;
    static int[] field_Cb;
    static qr field_zb;
    static mp field_Fb;
    private aa field_Db;
    private boolean field_Hb;
    static String field_Ab;

    final static void a(int param0, bc param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        sr var5 = null;
        int[] var6 = null;
        int var7 = 0;
        sl var8 = null;
        int var9 = 0;
        sl var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var8 = new sl(param1.a(true, "", "logo.fo3d"));
            var10 = var8;
            var3 = var10.j(-108);
            var10.m(-84);
            wc.field_a = ip.a(24243, var10);
            vc.field_d = new sr[var3];
            fa.field_Z = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var3 <= var4) {
                var10.i((byte) -47);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = vc.field_d[var9];
                    var5.a(6, -226, 6, 6, 1);
                    var5.a(true);
                    var6 = new int[]{var5.field_O + var5.field_k >> 1, var5.field_j - -var5.field_t >> 1, var5.field_E - -var5.field_r >> 1};
                    fa.field_Z[var9] = var6;
                    var5.a(-var6[2], -var6[0], -var6[1], 32767);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                vc.field_d[var4] = ec.a(var8, (byte) 6);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("oj.WA(").append(110).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    public static void q(int param0) {
        field_Cb = null;
        field_zb = null;
        field_Ib = null;
        field_Gb = null;
        field_Ab = null;
        field_Fb = null;
        field_Bb = null;
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((oj) this).field_Eb) {
              wa.a((byte) -40, false, true);
              return;
            } else {
              L1: {
                rm.b(param1 ^ -49);
                ((oj) this).i((byte) -104);
                if (param1 == 6) {
                  break L1;
                } else {
                  field_Fb = null;
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("oj.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          hp.a((byte) 28, param1, "");
          hr.a(param1, (byte) -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("oj.KB(").append(0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        kj var2_ref_kj = null;
        if (((oj) this).field_E) {
          if (!((oj) this).field_Hb) {
            var2_ref_kj = br.a(65536);
            if (var2_ref_kj == null) {
              var2 = -50 / ((param0 - -23) / 52);
              return super.a((byte) 30);
            } else {
              this.a(17, false, var2_ref_kj);
              var2 = -50 / ((param0 - -23) / 52);
              return super.a((byte) 30);
            }
          } else {
            var2 = -50 / ((param0 - -23) / 52);
            return super.a((byte) 30);
          }
        } else {
          var2 = -50 / ((param0 - -23) / 52);
          return super.a((byte) 30);
        }
    }

    oj(tc param0, aa param1) {
        super(param0, sl.field_p, mp.field_a, false, false);
        try {
            ((oj) this).field_Db = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "oj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, boolean param1, kj param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        cf var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((oj) this).field_Hb = true;
              if (!param2.field_h) {
                if (param2.field_d == null) {
                  L2: {
                    var4_ref = param2.field_g;
                    if (param2.field_c != 248) {
                      break L2;
                    } else {
                      L3: {
                        if (!param1) {
                          kp.c(-1);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var4_ref = sg.field_xb;
                      ((oj) this).field_Eb = true;
                      break L2;
                    }
                  }
                  break L1;
                } else {
                  var4_ref = lr.field_d;
                  if (((oj) this).field_Db != null) {
                    ((oj) this).field_Db.a(2147483647);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                var4_ref = ck.field_b;
                break L1;
              }
            }
            L4: {
              var5 = new cf((ns) this, sl.field_p, var4_ref);
              if (!param2.field_h) {
                L5: {
                  if (!((oj) this).field_Eb) {
                    if (param2.field_c == 5) {
                      var5.a(gg.field_b, (byte) 100, 11);
                      var5.a(em.field_g, (byte) 100, 17);
                      break L5;
                    } else {
                      var5.a(ss.field_e, (byte) 106, -1);
                      break L5;
                    }
                  } else {
                    kg discarded$2 = var5.a((ko) this, 125, gq.field_b);
                    break L5;
                  }
                }
                if (param2.field_c == 3) {
                  var5.a(rs.field_yb, (byte) 103, 7);
                  break L4;
                } else {
                  if (param2.field_c != 6) {
                    break L4;
                  } else {
                    var5.a(bf.field_d, (byte) 112, 9);
                    break L4;
                  }
                }
              } else {
                if (param2.field_b) {
                  ((oj) this).b((vg) (Object) new pe((oj) this), -51);
                  return;
                } else {
                  kg discarded$3 = var5.a((ko) this, 122, gq.field_b);
                  break L4;
                }
              }
            }
            ((oj) this).b((vg) (Object) var5, 126);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("oj.VA(").append(17).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    final void f(boolean param0) {
        this.a(17, true, ck.a(sg.field_xb, 248, -110));
        if (param0) {
            ((oj) this).f(false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = "Click to end turn.";
        field_Cb = new int[4];
        field_Ab = "Create a free Account";
        field_Fb = new mp();
    }
}
