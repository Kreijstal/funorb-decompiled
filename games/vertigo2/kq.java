/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends cr {
    private int field_Yb;
    static String field_Vb;
    static int field_Jb;
    static fe field_Kb;
    private cr field_Nb;
    private er[] field_Pb;
    private int[] field_Mb;
    private int field_Xb;
    private cr field_Sb;
    private int field_Qb;
    static String field_Ub;
    private int field_Ob;
    private int field_Tb;
    private int field_Ib;
    static ve field_Lb;
    static nj field_Rb;
    private int field_Hb;
    private nk[] field_Wb;

    final static void a(byte param0) {
        if (ol.field_B != 0) {
            ol.field_B = 0;
        } else {
            ol.field_B = -1;
        }
        int var1 = -14;
    }

    kq(cr param0, er[] param1, cr param2, cr param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((kq) this).field_Mb = new int[256];
        ((kq) this).field_Ib = -2;
        ((kq) this).field_Wb = new nk[256];
        try {
            ((kq) this).field_Qb = param6;
            ((kq) this).field_Xb = param4;
            ((kq) this).field_Ob = param5;
            ((kq) this).field_Sb = param3;
            ((kq) this).field_Hb = param8;
            ((kq) this).field_Nb = param2;
            ((kq) this).field_Pb = param1;
            ((kq) this).field_Yb = param7;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "kq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (((kq) this).field_Tb != 0) {
            break L0;
          } else {
            ((kq) this).field_Wb[((kq) this).field_Tb] = new nk(0L, (cr) null, (cr) null, ((kq) this).field_Nb, (er) null, uk.field_y);
            ((kq) this).field_Wb[((kq) this).field_Tb].field_ab = 1;
            ((kq) this).b((cr) (Object) ((kq) this).field_Wb[((kq) this).field_Tb], 125);
            ((kq) this).field_Mb[((kq) this).field_Tb] = -1;
            ((kq) this).field_Tb = ((kq) this).field_Tb + 1;
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (var7 >= ((kq) this).field_Tb) {
            L2: {
              var6 = var6 + ((kq) this).field_Xb * 2;
              var7 = ((kq) this).field_Yb + (((kq) this).field_Hb * ((kq) this).field_Tb + ((kq) this).field_Yb);
              var8 = jf.a(var6, param4, param3, 1);
              var9 = dm.a(param0, param2 + 1220, var7, param1);
              ((kq) this).a(param2 + 1335, var6, var7, var9, var8);
              if (param2 == -1220) {
                break L2;
              } else {
                field_Kb = null;
                break L2;
              }
            }
            var10 = 0;
            L3: while (true) {
              if (var10 >= ((kq) this).field_Tb) {
                return;
              } else {
                ((kq) this).field_Wb[var10].a(((kq) this).field_Yb - -(((kq) this).field_Hb * var10), var6 - 2 * ((kq) this).field_Xb, ((kq) this).field_Qb, ((kq) this).field_Hb, ((kq) this).field_Ob, 1, ((kq) this).field_Xb);
                var10++;
                continue L3;
              }
            }
          } else {
            var8 = ((kq) this).field_Wb[var7].b(((kq) this).field_Ob, ((kq) this).field_Qb, param2 + -23472);
            if (var8 > var6) {
              var6 = var8;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final static void b(int param0, boolean param1) {
        ee.a(8, param1);
        fb.a(0, param1);
    }

    final static long a(byte param0, CharSequence param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_21_0 = 0L;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              var4 = param1.length();
              if (param0 > 14) {
                break L1;
              } else {
                field_Rb = null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var5 >= var4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (var6 < 65) {
                        break L5;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(var6 - 64);
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (97 > var6) {
                        break L6;
                      } else {
                        if (var6 > 122) {
                          break L6;
                        } else {
                          var2_long = var2_long + (long)(-97 + (1 + var6));
                          break L4;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (var6 > 57) {
                        break L4;
                      } else {
                        var2_long = var2_long + (long)(-48 + var6 + 27);
                        break L4;
                      }
                    }
                  }
                  if (var2_long < 177917621779460413L) {
                    var5++;
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (0L != var2_long % 37L) {
                    break L8;
                  } else {
                    if (var2_long == 0L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_21_0 = var2_long;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("kq.D(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_22_0;
    }

    final int a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        ((kq) this).a(0, param1);
        if (!param1) {
            return -2;
        }
        for (var3 = 0; var3 < ((kq) this).field_Tb; var3++) {
            if (((kq) this).field_Wb[var3].field_tb != 0) {
                return ((kq) this).field_Mb[var3];
            }
        }
        if (param0) {
            int discarded$0 = ((kq) this).a(true, false);
        }
        if (kf.field_c != 0) {
            return -1;
        }
        return ((kq) this).field_Ib;
    }

    final void a(String param0, er param1, int param2, int param3) {
        try {
            ((kq) this).field_Wb[((kq) this).field_Tb] = new nk(0L, (cr) null, (cr) null, ((kq) this).field_Sb, param1, param0);
            if (param3 >= -48) {
                field_Vb = null;
            }
            ((kq) this).field_Wb[((kq) this).field_Tb].field_Q = ((kq) this).field_Pb;
            ((kq) this).field_Wb[((kq) this).field_Tb].field_jb = true;
            ((kq) this).field_Wb[((kq) this).field_Tb].field_ab = 1;
            ((kq) this).b((cr) (Object) ((kq) this).field_Wb[((kq) this).field_Tb], 119);
            ((kq) this).field_Mb[((kq) this).field_Tb] = param2;
            ((kq) this).field_Tb = ((kq) this).field_Tb + 1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "kq.L(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void k() {
        field_Rb = null;
        field_Vb = null;
        field_Kb = null;
        field_Lb = null;
        field_Ub = null;
    }

    final static v a(boolean param0, String param1, int param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        v stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        v stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var6 = null;
              if (param3.indexOf('@') != -1) {
                var6 = (Object) (Object) param3;
                break L1;
              } else {
                var7 = (CharSequence) (Object) param3;
                var4_long = kq.a((byte) 123, var7);
                break L1;
              }
            }
            stackOut_3_0 = dp.a(param1, (String) var6, (byte) -7, false, var4_long);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kq.F(").append(0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(-1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    kq(kq param0) {
        this((cr) (Object) param0, param0.field_Pb, param0.field_Nb, param0.field_Sb, param0.field_Xb, param0.field_Ob, param0.field_Qb, param0.field_Yb, param0.field_Hb);
    }

    final boolean b(byte param0) {
        if (((kq) this).field_Ib != -2) {
            return false;
        }
        if (de.field_f == 13) {
            ((kq) this).field_Ib = -1;
        }
        if (param0 != 81) {
            Object var3 = null;
            ((kq) this).a((String) null, -67, -19);
        }
        return true;
    }

    final void a(String param0, int param1, int param2) {
        try {
            ((kq) this).field_Wb[((kq) this).field_Tb] = new nk((long)param2, (cr) null, (cr) null, ((kq) this).field_Sb, (er) null, param0);
            ((kq) this).field_Wb[((kq) this).field_Tb].field_Q = ((kq) this).field_Pb;
            ((kq) this).field_Wb[((kq) this).field_Tb].field_jb = true;
            ((kq) this).field_Wb[((kq) this).field_Tb].field_ab = 1;
            ((kq) this).b((cr) (Object) ((kq) this).field_Wb[((kq) this).field_Tb], 124);
            ((kq) this).field_Mb[((kq) this).field_Tb] = param1;
            ((kq) this).field_Tb = ((kq) this).field_Tb + 1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "kq.K(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Vb = "Loading animations";
        field_Jb = 22;
        field_Ub = "Join <%0>'s game";
        field_Lb = new ve(13, 0, 1, 0);
    }
}
