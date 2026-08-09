/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq {
    static int field_c;
    oq field_f;
    static volatile boolean field_e;
    String field_h;
    static int field_j;
    String field_d;
    static qr[] field_b;
    static String[] field_i;
    static km field_a;
    static ej field_g;

    final static int a(byte param0, int param1, int param2) {
        if (param0 != -123) {
            oq.a(-75, true);
        }
        if (param2 == 1) {
            if (!(!qe.a((byte) -65, param1))) {
                return 29;
            }
        }
        return er.field_b[param2];
    }

    final static String[] a(byte[] param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = rm.a(param0, param1 ^ -17731);
              if (param1 == -17) {
                break L1;
              } else {
                field_b = (qr[]) null;
                break L1;
              }
            }
            var3 = so.a(var2, '\n', -123);
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                stackIn_7_0 = (String[]) (var3);
                break L0;
              } else {
                var3[var4] = var3[var4].trim();
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("oq.C(");

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
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, boolean param1) {
        sl var2 = js.field_f;
        if (param1) {
            return;
        }
        var2.h(param0, 255);
        var2.c(1, (byte) -114);
        var2.c(3, (byte) -73);
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        field_b = null;
        field_a = null;
        if (param0 != 29) {
            CharSequence var2 = (CharSequence) null;
            oq.a(35, (CharSequence) null);
        }
    }

    final static void a(boolean param0) {
        if (!(eh.field_P)) {
            throw new IllegalStateException();
        }
        or.field_a = true;
        wk.a(param0, false);
        gm.field_i = 0;
    }

    oq(String param0, String param1, oq param2) {
        try {
            this.field_d = param0;
            this.field_h = param1;
            this.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "oq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static long a(int param0, CharSequence param1) {
        long stackIn_21_0 = 0L;
        long stackIn_27_0 = 0L;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var4 <= var5) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if ((var6 ^ -1) > -66) {
                        break L4;
                      } else {
                        if (90 >= var6) {
                          var2_long = var2_long + (long)(1 - (-var6 + 65));
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 97) {
                        break L5;
                      } else {
                        if (var6 <= 122) {
                          var2_long = var2_long + (long)(1 - -var6 - 97);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (var6 > 57) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(var6 + 27 - 48);
                        break L3;
                      }
                    }
                  }
                  if (-177917621779460414L < (var2_long ^ -1L)) {
                    var5++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param0 == 5722) {
                L6: while (true) {
                  L7: {
                    if (0L != var2_long % 37L) {
                      break L7;
                    } else {
                      if (-1L == (var2_long ^ -1L)) {
                        break L7;
                      } else {
                        var2_long = var2_long / 37L;
                        continue L6;
                      }
                    }
                  }
                  stackIn_27_0 = var2_long;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_21_0 = 13L;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("oq.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0;
        } else {
          return stackIn_27_0;
        }
    }

    final static ro a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        Object stackIn_9_0 = null;
        ro stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var6 = (CharSequence) null;
                oq.a(76, (CharSequence) null);
                break L1;
              }
            }
            var2_int = param0.length();
            var3 = 0;
            L2: while (true) {
              if (var2_int <= var3) {
                stackIn_12_0 = as.field_t;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = param0.charAt(var3);
                if (48 <= var4) {
                  if (var4 <= 57) {
                    var3++;
                    continue L2;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("oq.E(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ro) ((Object) stackIn_9_0);
        } else {
          return stackIn_12_0;
        }
    }

    final static void a(int param0, int param1) {
        oh var2 = null;
        int var3 = 0;
        fk var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (fk) ((Object) tr.field_vb.d(0));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  var2 = ua.field_d.d(0);
                  if (param1 == 37) {
                    break L2;
                  } else {
                    field_i = (String[]) null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    cp.a(param0, 1);
                    var2 = ua.field_d.a((byte) -71);
                    continue L3;
                  }
                }
              } else {
                dn.a(param0, var4, (byte) 13);
                var4 = (fk) ((Object) tr.field_vb.a((byte) -71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "oq.G(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_c = 20;
        field_e = true;
    }
}
