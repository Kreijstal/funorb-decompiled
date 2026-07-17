/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static String field_f;
    static String field_a;
    static mg field_b;
    static String field_j;
    private eh field_k;
    private sl field_d;
    static boolean field_h;
    static boolean field_l;
    private eh field_e;
    static int field_i;
    static int field_c;
    static double[] field_g;

    final th a(byte param0, int param1) {
        th var3 = null;
        byte[] var4 = null;
        th var5 = null;
        th var6 = null;
        if (param0 == 125) {
          var3 = (th) ((ad) this).field_d.b((long)param1, 0);
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if (param1 < 32768) {
                var4 = ((ad) this).field_e.a(1, param1, 0);
                break L0;
              } else {
                var4 = ((ad) this).field_k.a(1, 32767 & param1, 0);
                break L0;
              }
            }
            var6 = new th();
            if (var4 != null) {
              L1: {
                var6.a(new jc(var4), 0);
                if (param1 >= 32768) {
                  var6.d(false);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((ad) this).field_d.a((Object) (Object) var6, (long)param1, param0 ^ -14619);
              return var6;
            } else {
              L2: {
                if (param1 >= 32768) {
                  var6.d(false);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((ad) this).field_d.a((Object) (Object) var6, (long)param1, param0 ^ -14619);
              return var6;
            }
          }
        } else {
          field_c = -78;
          var3 = (th) ((ad) this).field_d.b((long)param1, 0);
          if (var3 != null) {
            return var3;
          } else {
            L3: {
              if (param1 < 32768) {
                var4 = ((ad) this).field_e.a(1, param1, 0);
                break L3;
              } else {
                var4 = ((ad) this).field_k.a(1, 32767 & param1, 0);
                break L3;
              }
            }
            var5 = new th();
            var3 = var5;
            if (var4 == null) {
              L4: {
                if (param1 >= 32768) {
                  var5.d(false);
                  break L4;
                } else {
                  break L4;
                }
              }
              ((ad) this).field_d.a((Object) (Object) var5, (long)param1, param0 ^ -14619);
              return var5;
            } else {
              L5: {
                var5.a(new jc(var4), 0);
                if (param1 >= 32768) {
                  var5.d(false);
                  break L5;
                } else {
                  break L5;
                }
              }
              ((ad) this).field_d.a((Object) (Object) var5, (long)param1, param0 ^ -14619);
              return var5;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 90) {
            return;
        }
        field_a = null;
        field_f = null;
        field_j = null;
        field_g = null;
    }

    ad(int param0, eh param1, eh param2, be param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        ((ad) this).field_d = new sl(64);
        try {
          L0: {
            L1: {
              ((ad) this).field_e = param1;
              ((ad) this).field_k = param2;
              if (((ad) this).field_e == null) {
                break L1;
              } else {
                int discarded$4 = ((ad) this).field_e.d((byte) 91, 1);
                break L1;
              }
            }
            if (null != ((ad) this).field_k) {
              int discarded$5 = ((ad) this).field_k.d((byte) 88, 1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ad.<init>(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (param1 == 15232) {
            if (kn.a(param0, (byte) -69)) {
              return true;
            } else {
              L0: {
                if (45 == param0) {
                  break L0;
                } else {
                  if (param0 == 160) {
                    break L0;
                  } else {
                    if (32 == param0) {
                      break L0;
                    } else {
                      if (95 == param0) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            }
          } else {
            boolean discarded$1 = ad.a(')', -111);
            if (kn.a(param0, (byte) -69)) {
              return true;
            } else {
              if (45 != param0) {
                if (param0 != 160) {
                  if (32 != param0) {
                    if (95 == param0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> would need a rating of <%1> to play with the current options.";
        field_l = true;
        field_f = "ON";
        field_c = 22;
    }
}
