/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ii {
    static boolean field_e;
    static ul field_a;
    static String field_b;
    static ja field_c;
    static long field_d;

    final static void a(int param0, byte param1, int param2, String param3, long param4) {
        RuntimeException var6 = null;
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
          v.field_a = param3;
          da.field_c = param4;
          vh.field_Hb = true;
          fh.field_n = param0;
          mi.field_Gb = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("ii.J(").append(param0).append(',').append(-128).append(',').append(param2).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param4 + ')');
        }
    }

    abstract long a(byte param0);

    public static void c() {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    abstract int a(long param0, boolean param1);

    abstract void b(int param0);

    final static void a() {
        nc[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        nc var3 = null;
        int var4 = 0;
        nc[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!ap.field_s) {
              ap.field_s = true;
              var5 = mj.field_Hb;
              var1 = var5;
              var2 = 0;
              L1: while (true) {
                if (var5.length <= var2) {
                  break L0;
                } else {
                  L2: {
                    var3 = var5[var2];
                    if (var3 != null) {
                      var3.c(1);
                      var2++;
                      break L2;
                    } else {
                      var2++;
                      break L2;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1_ref, "ii.L(" + 103 + ')');
        }
    }

    final static String a(String param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        ga var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        String stackOut_16_0 = null;
        String stackOut_20_0 = null;
        Object stackOut_25_0 = null;
        String stackOut_23_0 = null;
        String stackOut_12_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param0;
            if (!em.a(var6, (byte) -38)) {
              stackOut_2_0 = u.field_f;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (ge.field_zb == 2) {
                if (sf.a(1, param0)) {
                  stackOut_9_0 = hf.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (!kj.a((byte) -94, param0)) {
                    L1: {
                      if (100 > dc.field_Fb) {
                        break L1;
                      } else {
                        if (0 < vl.field_h) {
                          break L1;
                        } else {
                          stackOut_16_0 = eh.field_g;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0;
                        }
                      }
                    }
                    if (200 <= dc.field_Fb) {
                      stackOut_20_0 = eh.field_g;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    } else {
                      if (!hp.a(param0, 1020)) {
                        var5 = ma.field_a;
                        var5.b((byte) -35, param2);
                        var5.field_j = var5.field_j + 1;
                        var4 = var5.field_j;
                        var5.a(124, 0);
                        var5.a(param0, (byte) 105);
                        var5.e(21, -var4 + var5.field_j);
                        stackOut_25_0 = null;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        stackOut_23_0 = vl.a(wf.field_r, new String[1], 2);
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0;
                      }
                    }
                  } else {
                    stackOut_12_0 = vl.a(jf.field_b, new String[1], 2);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              } else {
                stackOut_5_0 = le.field_G;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("ii.Q(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L2;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + 116 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_26_0;
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != hl.field_a) {
                break L1;
              } else {
                if (tn.field_z == -1) {
                  hl.field_a = bd.field_g;
                  tn.field_z = bo.field_d;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                l.field_a = l.field_a + 1;
                if (param1 != null) {
                  if (param1.equals((Object) (Object) kg.field_k)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != kg.field_k) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!cb.field_l) {
                  if (l.field_a >= um.field_h) {
                    if (l.field_a < br.field_a + um.field_h) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  l.field_a = 0;
                  break L5;
                } else {
                  if (cb.field_l) {
                    l.field_a = um.field_h;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      l.field_a = um.field_h;
                      break L5;
                    } else {
                      l.field_a = 0;
                      break L5;
                    }
                  }
                }
              }
              tf.field_Db = hl.field_a;
              bl.field_c = tn.field_z;
              if (param1 == null) {
                if (var2_int == 0) {
                  break L2;
                } else {
                  cb.field_l = true;
                  break L2;
                }
              } else {
                cb.field_l = false;
                break L2;
              }
            }
            L6: {
              kg.field_k = param1;
              if (cb.field_l) {
                break L6;
              } else {
                if (um.field_h <= l.field_a) {
                  break L6;
                } else {
                  if (!wc.field_J) {
                    break L6;
                  } else {
                    l.field_a = 0;
                    bl.field_c = tn.field_z;
                    tf.field_Db = hl.field_a;
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (!cb.field_l) {
                break L7;
              } else {
                if (ti.field_I != l.field_a) {
                  break L7;
                } else {
                  l.field_a = 0;
                  cb.field_l = false;
                  break L7;
                }
              }
            }
            tn.field_z = -1;
            hl.field_a = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("ii.P(").append(-16898).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
    }

    final static int b(byte param0) {
        int var1 = -32;
        return pl.field_F;
    }

    final int b(long param0, boolean param1) {
        long var4 = 0L;
        var4 = ((ii) this).a((byte) -64);
        if (!param1) {
          if (0L < var4) {
            vd.a(false, var4);
            return ((ii) this).a(param0, true);
          } else {
            return ((ii) this).a(param0, true);
          }
        } else {
          field_b = null;
          if (0L >= var4) {
            return ((ii) this).a(param0, true);
          } else {
            vd.a(false, var4);
            return ((ii) this).a(param0, true);
          }
        }
    }

    final static void a(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, 11);
        var2.a(126, 1);
        var2.a(-24, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<br><br>";
    }
}
