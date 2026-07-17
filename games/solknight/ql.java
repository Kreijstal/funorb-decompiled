/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends af {
    static String[] field_s;
    private bf field_w;
    static int[] field_q;
    static o field_p;
    private bf[] field_t;
    static gj field_r;
    static String field_u;
    static int field_v;

    final void a(byte param0, o param1) {
        bf[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7 = 0;
        bf[] var8 = null;
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
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = 12 / ((param0 - 14) / 55);
            var8 = ((ql) this).field_t;
            var3 = var8;
            var5 = 0;
            L1: while (true) {
              if (var8.length <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    var6.field_k = param1;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("ql.CA(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        RuntimeException var6 = null;
        bf var7 = null;
        bf var9 = null;
        pj var10 = null;
        bf var11 = null;
        bf var12 = null;
        bf var13 = null;
        bf var14 = null;
        rc stackIn_5_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        rc stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (param0 >= 113) {
              L1: {
                if (param4 instanceof pj) {
                  stackOut_4_0 = (rc) param4;
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = null;
                  stackIn_5_0 = (rc) (Object) stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var10 = (pj) (Object) stackIn_5_0;
                kf.a((byte) 97, param3 + param4.field_m, param1 - -param4.field_j, param3 - -param4.field_m - -param4.field_t, param4.field_x + (param4.field_j + param1));
                if (var10 == null) {
                  break L2;
                } else {
                  param2 = param2 & var10.field_B;
                  break L2;
                }
              }
              L3: {
                var7 = ((ql) this).field_t[0];
                ((ql) this).field_w.a(36);
                var7.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                if (var10 == null) {
                  break L3;
                } else {
                  L4: {
                    if (!var10.field_F) {
                      break L4;
                    } else {
                      var11 = ((ql) this).field_t[1];
                      if (var11 == null) {
                        break L4;
                      } else {
                        var11.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                        break L4;
                      }
                    }
                  }
                  if (var10.field_v) {
                    L5: {
                      var12 = ((ql) this).field_t[3];
                      if (var10.field_u == 0) {
                        break L5;
                      } else {
                        if (var12 == null) {
                          break L5;
                        } else {
                          var12.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                          break L3;
                        }
                      }
                    }
                    var9 = ((ql) this).field_t[2];
                    if (var9 == null) {
                      break L3;
                    } else {
                      var9.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (param4.b(true)) {
                  var13 = ((ql) this).field_t[5];
                  if (var13 != null) {
                    var13.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (!param2) {
                  var14 = ((ql) this).field_t[4];
                  if (var14 != null) {
                    var14.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              ((ql) this).field_w.a(108, param1, param3, (ql) this, param4);
              mf.e(4096);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("ql.T(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
    }

    final bf a(byte param0, int param1) {
        if (param0 > -37) {
            return null;
        }
        bf dupTemp$0 = new bf();
        ((ql) this).field_t[param1] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(ql param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        bf var5 = null;
        bf var6 = null;
        int var7 = 0;
        bf stackIn_7_0 = null;
        bf stackIn_8_0 = null;
        bf stackIn_9_0 = null;
        bf stackIn_9_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        bf stackOut_6_0 = null;
        bf stackOut_8_0 = null;
        bf stackOut_8_1 = null;
        bf stackOut_7_0 = null;
        bf stackOut_7_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a((af) (Object) param0, 6935);
              if (param1) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((ql) this).field_t[var4_int];
                      if (var5 == null) {
                        param0.field_t[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param0.field_t[var4_int];
                          stackOut_6_0 = (bf) var5;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var6 == null) {
                            bf dupTemp$25 = new bf();
                            param0.field_t[var4_int] = dupTemp$25;
                            stackOut_8_0 = (bf) (Object) stackIn_8_0;
                            stackOut_8_1 = (bf) dupTemp$25;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            break L4;
                          } else {
                            stackOut_7_0 = (bf) (Object) stackIn_7_0;
                            stackOut_7_1 = (bf) var6;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            break L4;
                          }
                        }
                        ((bf) (Object) stackIn_9_0).a(stackIn_9_1, 2);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                fk.a((Object[]) (Object) ((ql) this).field_t, 0, (Object[]) (Object) param0.field_t, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ql.W(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + 30089 + 41);
        }
    }

    final void a(byte param0, o[] param1) {
        bf[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7 = 0;
        bf[] var8 = null;
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
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var8 = ((ql) this).field_t;
            var3 = var8;
            var4 = -51 % ((param0 - -26) / 48);
            var5 = 0;
            L1: while (true) {
              if (var8.length <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    var6.field_j = param1;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("ql.BA(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        field_s = null;
        field_u = null;
    }

    public ql() {
        ((ql) this).field_t = new bf[6];
        ((ql) this).field_w = new bf();
        bf dupTemp$0 = new bf();
        ((ql) this).field_t[0] = dupTemp$0;
        bf var1 = dupTemp$0;
        var1.a(36);
    }

    final static void d(int param0) {
        u.field_b.j(1);
        if (!(pc.field_b != null)) {
            pc.field_b = new lb(u.field_b, v.field_a);
        }
        u.field_b.b((rc) (Object) pc.field_b, -120);
    }

    final void a(byte param0, int param1, o[] param2) {
        int var4_int = 0;
        if (param0 != -60) {
            return;
        }
        try {
            var4_int = param1;
            if (!(null != ((ql) this).field_t[var4_int])) {
                ((ql) this).field_t[var4_int] = new bf();
            }
            ((ql) this).field_t[param1].field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ql.DA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    ql(ql param0, boolean param1) {
        this();
        try {
            param0.a((ql) this, param1, 30089);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ql.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new String[]{"Exciting new weapons", "Fullscreen mode", "No adverts"};
        field_q = new int[4];
        field_u = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_v = -1;
    }
}
