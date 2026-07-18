/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static int field_a;

    final static void a(int param0) {
        if (param0 < 12) {
            byte[] discarded$0 = ee.a(-95, true);
        }
        od.field_v.field_i = 0;
        od.field_v.field_g = 0;
    }

    final static fd a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        fd var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        fd stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_14_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = stellarshard.field_B;
        try {
          if (ac.field_n != null) {
            L0: {
              var6 = (CharSequence) (Object) param0;
              var2 = nh.a(var6, false);
              if (var2 == null) {
                var2 = param0;
                break L0;
              } else {
                break L0;
              }
            }
            var3 = (fd) (Object) ac.field_n.a((long)var2.hashCode(), -116);
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_rb;
                  var4 = nh.a(var7, false);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = var3.field_rb;
                    break L2;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  stackOut_14_0 = (fd) var3;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  var3 = (fd) (Object) ac.field_n.a(true);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2_ref;
            stackOut_18_1 = new StringBuilder().append("ee.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + -98 + ')');
        }
    }

    final synchronized static byte[] a(int param0, boolean param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (100 != param0) {
            break L0;
          } else {
            if (db.field_g <= 0) {
              break L0;
            } else {
              int fieldTemp$6 = db.field_g - 1;
              db.field_g = db.field_g - 1;
              var2_ref_byte__ = ck.field_ib[fieldTemp$6];
              ck.field_ib[db.field_g] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if (ja.field_q > 0) {
              int fieldTemp$7 = ja.field_q - 1;
              ja.field_q = ja.field_q - 1;
              var2_ref_byte__ = ei.field_H[fieldTemp$7];
              ei.field_H[ja.field_q] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (u.field_p <= 0) {
              break L2;
            } else {
              int fieldTemp$8 = u.field_p - 1;
              u.field_p = u.field_p - 1;
              var2_ref_byte__ = mh.field_j[fieldTemp$8];
              mh.field_j[u.field_p] = null;
              return var2_ref_byte__;
            }
          }
        }
        L3: {
          if (qf.field_i != null) {
            var2 = 0;
            L4: while (true) {
              if (var2 >= ol.field_a.length) {
                break L3;
              } else {
                if (ol.field_a[var2] == param0) {
                  if (tc.field_s[var2] > 0) {
                    tc.field_s[var2] = tc.field_s[var2] - 1;
                    var3 = qf.field_i[var2][tc.field_s[var2] - 1];
                    qf.field_i[var2][tc.field_s[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        return new byte[param0];
    }

    final static boolean b(int param0) {
        int var1 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var1 = -125 / ((-2 - param0) / 47);
            if (rk.field_f < 20) {
              break L1;
            } else {
              if (!vj.a(25424)) {
                break L1;
              } else {
                L2: {
                  if (ag.field_c <= 0) {
                    break L2;
                  } else {
                    if (fa.a(-54)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static af a(int param0, int param1, byte param2, int param3) {
        af var4 = new af();
        var4.field_p = 0;
        var4.field_s = new int[1];
        if (param2 >= -108) {
            field_a = 106;
        }
        pf.field_b.b(-53, (gg) (Object) var4);
        kg.a(5, var4, false);
        return var4;
    }

    final static li a(int param0, byte param1) {
        li[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        li[] var5 = null;
        var4 = stellarshard.field_B;
        var5 = lc.e((byte) 33);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var3 < var5.length) {
            if (param0 != var5[var3].field_e) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
