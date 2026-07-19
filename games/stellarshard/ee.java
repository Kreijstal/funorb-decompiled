/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static int field_a;

    final static void a(int param0) {
        byte[] discarded$0 = null;
        if (param0 < 12) {
            discarded$0 = ee.a(-95, true);
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
        fd stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_16_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            if (ac.field_n != null) {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var2 = nh.a(var6, false);
                if (param1 == -98) {
                  break L1;
                } else {
                  field_a = 46;
                  break L1;
                }
              }
              L2: {
                if (var2 == null) {
                  var2 = param0;
                  break L2;
                } else {
                  break L2;
                }
              }
              var3 = (fd) ((Object) ac.field_n.a((long)var2.hashCode(), param1 + -18));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var7 = (CharSequence) ((Object) var3.field_rb);
                    var4 = nh.a(var7, false);
                    if (var4 != null) {
                      break L4;
                    } else {
                      var4 = var3.field_rb;
                      break L4;
                    }
                  }
                  if (var4.equals(var2)) {
                    stackOut_16_0 = (fd) (var3);
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    var3 = (fd) ((Object) ac.field_n.a(true));
                    continue L3;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2_ref);
            stackOut_20_1 = new StringBuilder().append("ee.C(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final synchronized static byte[] a(int param0, boolean param1) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param1) {
            break L0;
          } else {
            field_a = 3;
            break L0;
          }
        }
        L1: {
          if (100 != param0) {
            break L1;
          } else {
            if ((db.field_g ^ -1) >= -1) {
              break L1;
            } else {
              fieldTemp$6 = db.field_g - 1;
              db.field_g = db.field_g - 1;
              var2_ref_byte__ = ck.field_ib[fieldTemp$6];
              ck.field_ib[db.field_g] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (-5001 != (param0 ^ -1)) {
            break L2;
          } else {
            if ((ja.field_q ^ -1) < -1) {
              fieldTemp$7 = ja.field_q - 1;
              ja.field_q = ja.field_q - 1;
              var2_ref_byte__ = ei.field_H[fieldTemp$7];
              ei.field_H[ja.field_q] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (-30001 != (param0 ^ -1)) {
            break L3;
          } else {
            if ((u.field_p ^ -1) >= -1) {
              break L3;
            } else {
              fieldTemp$8 = u.field_p - 1;
              u.field_p = u.field_p - 1;
              var2_ref_byte__ = mh.field_j[fieldTemp$8];
              mh.field_j[u.field_p] = null;
              return var2_ref_byte__;
            }
          }
        }
        L4: {
          if (qf.field_i != null) {
            var2 = 0;
            L5: while (true) {
              if (var2 >= ol.field_a.length) {
                break L4;
              } else {
                if (ol.field_a[var2] == param0) {
                  if (tc.field_s[var2] > 0) {
                    tc.field_s[var2] = tc.field_s[var2] - 1;
                    var3 = qf.field_i[var2][tc.field_s[var2] - 1];
                    qf.field_i[var2][tc.field_s[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          } else {
            break L4;
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
            if ((rk.field_f ^ -1) > -21) {
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
        var4.field_p = param1;
        var4.field_s = new int[param3];
        if (param2 >= -108) {
            field_a = 106;
        }
        pf.field_b.b(-53, var4);
        kg.a(param0, var4, false);
        return var4;
    }

    final static li a(int param0, byte param1) {
        li[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        li[] var5 = null;
        L0: {
          var4 = stellarshard.field_B;
          var5 = lc.e((byte) 33);
          var2 = var5;
          if (param1 == 8) {
            break L0;
          } else {
            field_a = -93;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 < var5.length) {
            if (param0 != var5[var3].field_e) {
              var3++;
              continue L1;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    static {
        field_a = -1;
    }
}
