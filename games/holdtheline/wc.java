/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wc extends hl {
    int field_k;
    static byte[][] field_i;
    static String field_j;

    abstract qm a(boolean param0, float param1);

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -27) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0.length() < ci.field_d) {
                  break L2;
                } else {
                  if (param0.length() > dn.field_D) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("wc.QA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    abstract in a(boolean param0);

    final static fi a(int param0, String param1) {
        String var2 = null;
        fi var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        fi stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            if (ah.field_a != null) {
              L1: {
                var6 = (CharSequence) ((Object) param1);
                var2 = kf.a(var6, (byte) -76);
                if (var2 == null) {
                  var2 = param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == 0) {
                  break L2;
                } else {
                  field_j = (String) null;
                  break L2;
                }
              }
              var3 = (fi) ((Object) ah.field_a.a(-25839, (long)var2.hashCode()));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var7 = (CharSequence) ((Object) var3.field_mb);
                    var4 = kf.a(var7, (byte) 119);
                    if (var4 != null) {
                      break L4;
                    } else {
                      var4 = var3.field_mb;
                      break L4;
                    }
                  }
                  if (!var4.equals(var2)) {
                    var3 = (fi) ((Object) ah.field_a.a(20240));
                    continue L3;
                  } else {
                    stackIn_16_0 = (fi) (var3);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("wc.RA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fi) ((Object) stackIn_3_0);
        } else {
          return stackIn_16_0;
        }
    }

    abstract in a(byte param0, float param1);

    final static int e(int param0) {
        ra.field_Z.a(true);
        if (!(ce.field_n.a((byte) 83))) {
            return qk.b(1);
        }
        if (param0 != -17204) {
            field_j = (String) null;
            return 0;
        }
        return 0;
    }

    abstract qm a(int param0);

    abstract float f(int param0);

    final static void a(byte param0, ib param1, java.awt.Component param2, int param3, int param4, boolean param5, int param6, tf param7) {
        try {
            if (param0 > -108) {
                wc.e(-51);
            }
            lo.a(param6, param5, 10);
            pk.field_G = lo.a(param1, param2, 0, param3);
            jd.field_G = lo.a(param1, param2, 1, param4);
            pk.field_H = new fg();
            ua.field_a = param4;
            jd.field_G.a(pk.field_H);
            ai.field_a = param7;
            ai.field_a.a(mk.field_e, -32284);
            pk.field_G.a(ai.field_a);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "wc.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    wc() {
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_j = (String) null;
        }
        field_i = (byte[][]) null;
        field_j = null;
    }

    final static wd a(wd param0, float param1, float param2, byte param3) {
        RuntimeException var4 = null;
        dd stackIn_2_0 = null;
        hn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!(param0 instanceof dd)) {
              L1: {
                if (param3 == -115) {
                  break L1;
                } else {
                  wc.b(false);
                  break L1;
                }
              }
              stackIn_6_0 = dc.a(param1, -18895, param2, (hn) ((Object) param0));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = pb.a(param1, (byte) -111, (dd) ((Object) param0), param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("wc.PA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wd) ((Object) stackIn_2_0);
        } else {
          return (wd) ((Object) stackIn_6_0);
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        pa var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1 == -6408) {
                break L1;
              } else {
                wc.b(true);
                break L1;
              }
            }
            L2: {
              if ((param2 ^ -1) < -1) {
                var8 = new byte[param3];
                var4 = var8;
                var5_int = 0;
                L3: while (true) {
                  if (var5_int >= param3) {
                    break L2;
                  } else {
                    var8[var5_int] = param0[var5_int + param2];
                    var5_int++;
                    continue L3;
                  }
                }
              } else {
                var4 = param0;
                break L2;
              }
            }
            var5 = new pa();
            var5.b(false);
            var5.a(var4, (byte) -108, (long)(param3 * 8));
            var6 = new byte[64];
            var5.a(param1 ^ -530, var6, 0);
            stackIn_9_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("wc.LA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    abstract in g(int param0);

    static {
        field_j = "Play the game without logging in just yet";
    }
}
